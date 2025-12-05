/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.http.api.worlds.World
 */
package net.runelite.client.rs;

import com.google.common.base.Strings;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.openosrs.client.OpenOSRS;
import java.applet.Applet;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.function.Supplier;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import javax.annotation.Nonnull;
import javax.swing.SwingUtilities;
import net.runelite.api.Client;
import net.runelite.client.RuneLite;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.RuntimeConfig;
import net.runelite.client.RuntimeConfigLoader;
import net.runelite.client.rs.ClientConfigLoader;
import net.runelite.client.rs.ClientUpdateCheckMode;
import net.runelite.client.rs.RSAppletStub;
import net.runelite.client.rs.RSConfig;
import net.runelite.client.rs.TeeInputStream;
import net.runelite.client.rs.WorldSupplier;
import net.runelite.client.ui.FatalErrorDialog;
import net.runelite.client.ui.SplashScreen;
import net.runelite.client.util.CountingInputStream;
import net.runelite.client.util.VerificationException;
import net.runelite.http.api.worlds.World;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientLoader
implements Supplier<Applet> {
    private static final Logger log = LoggerFactory.getLogger(ClientLoader.class);
    private static final String INJECTED_CLIENT_NAME = "/injected-client.oprs";
    private static final int NUM_ATTEMPTS = 6;
    private static File LOCK_FILE = new File(RuneLite.CACHE_DIR, "cache.lock");
    private static File VANILLA_CACHE = new File(RuneLite.CACHE_DIR, "vanilla.cache");
    private static File PATCHED_CACHE = new File(RuneLite.CACHE_DIR, "patched.cache");
    private final OkHttpClient okHttpClient;
    private final ClientConfigLoader clientConfigLoader;
    private ClientUpdateCheckMode updateCheckMode;
    private final WorldSupplier worldSupplier;
    private final RuntimeConfigLoader runtimeConfigLoader;
    private final String javConfigUrl;
    private Object client;

    public ClientLoader(OkHttpClient okHttpClient, ClientUpdateCheckMode updateCheckMode, RuntimeConfigLoader runtimeConfigLoader, String javConfigUrl) {
        this.okHttpClient = okHttpClient;
        this.clientConfigLoader = new ClientConfigLoader(okHttpClient);
        this.updateCheckMode = updateCheckMode;
        this.worldSupplier = new WorldSupplier(okHttpClient);
        this.runtimeConfigLoader = runtimeConfigLoader;
        this.javConfigUrl = javConfigUrl;
    }

    @Override
    public synchronized Applet get() {
        if (this.client == null) {
            this.client = this.doLoad();
        }
        if (this.client instanceof Throwable) {
            throw new RuntimeException((Throwable)this.client);
        }
        return (Applet)this.client;
    }

    private Object doLoad() {
        if (this.updateCheckMode == ClientUpdateCheckMode.NONE) {
            return null;
        }
        try {
            ClassLoader classLoader;
            SplashScreen.stage(0.0, null, "Fetching applet viewer config");
            RSConfig config = this.downloadConfig();
            SplashScreen.stage(0.05, null, "Waiting for other clients to start");
            LOCK_FILE.getParentFile().mkdirs();
            try (FileChannel lockfile = FileChannel.open(LOCK_FILE.toPath(), StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
                 FileLock flock = lockfile.lock();){
                SplashScreen.stage(0.15, null, "Downloading Old School RuneScape");
                try {
                    this.updateVanilla(config);
                }
                catch (IOException ex) {
                    if (this.javConfigUrl.equals(RuneLiteProperties.getJavConfig()) && !config.isFallback()) {
                        log.warn("Unable to download game client, attempting to use fallback config", ex);
                        config = this.downloadFallbackConfig();
                        this.updateVanilla(config);
                    }
                    throw ex;
                }
                if (!this.checkVanillaHash()) {
                    log.error("Injected client vanilla hash doesn't match, loading vanilla client.");
                    this.updateCheckMode = ClientUpdateCheckMode.VANILLA;
                }
                SplashScreen.stage(0.4, null, "Loading client");
                File oprsInjected = new File(System.getProperty("user.home") + "/.squire/cache/injected-client.jar");
                if (this.updateCheckMode == ClientUpdateCheckMode.AUTO) {
                    this.writeInjectedClient(oprsInjected);
                }
                File jarFile = this.updateCheckMode == ClientUpdateCheckMode.AUTO ? oprsInjected : VANILLA_CACHE;
                classLoader = this.createJarClassLoader(jarFile);
            }
            SplashScreen.stage(0.465, "Starting", "Starting Old School RuneScape");
            Applet rs = this.loadClient(config, classLoader);
            SplashScreen.stage(0.5, null, "Starting core classes");
            return rs;
        }
        catch (OutageException e) {
            return e;
        }
        catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | SecurityException | VerificationException e) {
            log.error("Error loading RS!", e);
            if (!this.checkOutages()) {
                SwingUtilities.invokeLater(() -> FatalErrorDialog.showNetErrorWindow("loading the client", e));
            }
            return e;
        }
    }

    private RSConfig downloadConfig() throws IOException {
        HttpUrl url = HttpUrl.get(this.javConfigUrl);
        IOException err = null;
        for (int attempt = 0; attempt < 6; ++attempt) {
            try {
                RSConfig config = this.clientConfigLoader.fetch(url);
                if (Strings.isNullOrEmpty(config.getCodeBase()) || Strings.isNullOrEmpty(config.getInitialJar()) || Strings.isNullOrEmpty(config.getInitialClass())) {
                    throw new IOException("Invalid or missing jav_config");
                }
                return config;
            }
            catch (IOException e) {
                log.info("Failed to get jav_config from host \"{}\" ({})", (Object)url.host(), (Object)e.getMessage());
                if (this.checkOutages()) {
                    throw new OutageException(e);
                }
                if (!this.javConfigUrl.equals(RuneLiteProperties.getJavConfig())) {
                    throw e;
                }
                String host = this.worldSupplier.get().getAddress();
                url = url.newBuilder().host(host).build();
                err = e;
                continue;
            }
        }
        log.info("Falling back to backup client config");
        try {
            return this.downloadFallbackConfig();
        }
        catch (IOException ex) {
            log.debug("error downloading backup config", ex);
            throw err;
        }
    }

    @Nonnull
    private RSConfig downloadFallbackConfig() throws IOException {
        RSConfig backupConfig = this.clientConfigLoader.fetch(HttpUrl.get(RuneLiteProperties.getJavConfigBackup()));
        if (Strings.isNullOrEmpty(backupConfig.getCodeBase()) || Strings.isNullOrEmpty(backupConfig.getInitialJar()) || Strings.isNullOrEmpty(backupConfig.getInitialClass())) {
            throw new IOException("Invalid or missing jav_config");
        }
        if (Strings.isNullOrEmpty(backupConfig.getRuneLiteGamepack()) || Strings.isNullOrEmpty(backupConfig.getRuneLiteWorldParam())) {
            throw new IOException("Backup config does not have RuneLite gamepack url");
        }
        World world = this.worldSupplier.get();
        backupConfig.setCodebase("http://" + world.getAddress() + "/");
        Map<String, String> appletProperties = backupConfig.getAppletProperties();
        appletProperties.put(backupConfig.getRuneLiteWorldParam(), Integer.toString(world.getId()));
        return backupConfig;
    }

    private void updateVanilla(RSConfig config) throws IOException, VerificationException {
        Certificate[][] jagexCertificateChains = new Certificate[][]{ClientLoader.loadCertificateChain("jagex.crt"), ClientLoader.loadCertificateChain("jagex2021.crt")};
        try (FileChannel vanilla = FileChannel.open(VANILLA_CACHE.toPath(), StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);){
            HttpUrl url;
            long vanillaCacheMTime = -1L;
            boolean vanillaCacheIsInvalid = false;
            try {
                JarInputStream vanillaCacheTest = new JarInputStream(Channels.newInputStream(vanilla));
                vanillaCacheTest.skip(Long.MAX_VALUE);
                JarEntry je = vanillaCacheTest.getNextJarEntry();
                if (je != null) {
                    this.verifyJarEntry(je, jagexCertificateChains);
                    vanillaCacheMTime = je.getLastModifiedTime().toMillis();
                } else {
                    vanillaCacheIsInvalid = true;
                }
            }
            catch (Exception e) {
                log.info("Failed to read the vanilla cache: {}", (Object)e.toString());
                vanillaCacheIsInvalid = true;
            }
            vanilla.position(0L);
            if (!vanillaCacheIsInvalid && "false".equals(System.getProperty("runelite.updateVanilla"))) {
                return;
            }
            if (config.isFallback()) {
                url = HttpUrl.get(config.getRuneLiteGamepack());
            } else {
                String codebase = config.getCodeBase();
                String initialJar = config.getInitialJar();
                url = HttpUrl.get(codebase + initialJar);
            }
            int attempt = 0;
            while (true) {
                Request request = new Request.Builder().url(url).build();
                Response response = this.okHttpClient.newCall(request).execute();
                try {
                    if (!response.isSuccessful()) {
                        throw new IOException("unsuccessful response fetching gamepack: " + response.message());
                    }
                    int length = (int)response.body().contentLength();
                    if (length < 0) {
                        length = 0x300000;
                    } else if (!vanillaCacheIsInvalid && vanilla.size() != (long)length) {
                        log.info("Vanilla cache is the wrong size");
                        vanillaCacheIsInvalid = true;
                    }
                    int flength = length;
                    TeeInputStream copyStream = new TeeInputStream(new CountingInputStream(response.body().byteStream(), read -> SplashScreen.stage(0.05, 0.35, null, "Downloading Old School RuneScape", read, flength, true)));
                    ByteArrayOutputStream preRead = new ByteArrayOutputStream();
                    copyStream.setOut(preRead);
                    JarInputStream networkJIS = new JarInputStream(copyStream);
                    JarEntry je = networkJIS.getNextJarEntry();
                    if (je == null) {
                        throw new IOException("unable to peek first jar entry");
                    }
                    networkJIS.skip(Long.MAX_VALUE);
                    this.verifyJarEntry(je, jagexCertificateChains);
                    long vanillaClientMTime = je.getLastModifiedTime().toMillis();
                    if (!vanillaCacheIsInvalid && vanillaClientMTime != vanillaCacheMTime) {
                        log.info("Vanilla cache is out of date: {} != {}", (Object)vanillaClientMTime, (Object)vanillaCacheMTime);
                        vanillaCacheIsInvalid = true;
                    }
                    if (!vanillaCacheIsInvalid) {
                        try {
                            JarInputStream vanillaCacheTest = new JarInputStream(Channels.newInputStream(vanilla));
                            this.verifyWholeJar(vanillaCacheTest, jagexCertificateChains);
                        }
                        catch (Exception e) {
                            log.warn("Failed to verify the vanilla cache", e);
                            vanillaCacheIsInvalid = true;
                        }
                    }
                    if (vanillaCacheIsInvalid) {
                        vanilla.position(0L);
                        OutputStream out = Channels.newOutputStream(vanilla);
                        out.write(preRead.toByteArray());
                        copyStream.setOut(out);
                        this.verifyWholeJar(networkJIS, jagexCertificateChains);
                        copyStream.skip(Long.MAX_VALUE);
                        out.flush();
                        vanilla.truncate(vanilla.position());
                    } else {
                        log.info("Using cached vanilla client");
                    }
                    if (response != null) {
                        response.close();
                    }
                    return;
                }
                catch (Throwable throwable) {
                    try {
                        if (response != null) {
                            try {
                                response.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (IOException e) {
                        log.warn("Failed to download gamepack from \"{}\"", (Object)url, (Object)e);
                        if (this.checkOutages()) {
                            throw new OutageException(e);
                        }
                        if (!this.javConfigUrl.equals(RuneLiteProperties.getJavConfig()) || config.isFallback() || attempt >= 6) {
                            throw e;
                        }
                        url = url.newBuilder().host(this.worldSupplier.get().getAddress()).build();
                        ++attempt;
                        continue;
                    }
                }
                break;
            }
        }
    }

    private void applyPatch() throws IOException {
    }

    private boolean checkVanillaHash() {
        boolean bl;
        block8: {
            InputStream is = ClientLoader.class.getResourceAsStream("/client.hash");
            try {
                String storedHash = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                String vanillaHash = Hashing.sha256().hashBytes(Files.readAllBytes(VANILLA_CACHE.toPath())).toString();
                log.debug("Stored vanilla hash: {}", (Object)storedHash);
                log.debug("Actual vanilla hash: {}", (Object)vanillaHash);
                bl = vanillaHash.equals(storedHash);
                if (is == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (is != null) {
                        try {
                            is.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException ex) {
                    log.error("Failed to compare vanilla hashes, loading vanilla", ex);
                    return false;
                }
            }
            is.close();
        }
        return bl;
    }

    private void writeInjectedClient(File cachedInjected) throws IOException {
        String cachedHash;
        block3: {
            cachedHash = "";
            try {
                cachedHash = com.google.common.io.Files.asByteSource(cachedInjected).hash(Hashing.sha256()).toString();
            }
            catch (IOException ex) {
                if (ex instanceof FileNotFoundException) break block3;
                log.error("Failed to calculate hash for cached file, falling back to vanilla", ex);
                this.updateCheckMode = ClientUpdateCheckMode.VANILLA;
                return;
            }
        }
        byte[] currentInjected = ByteStreams.toByteArray(ClientLoader.class.getResourceAsStream(INJECTED_CLIENT_NAME));
        String currentHash = Hashing.sha256().hashBytes(currentInjected).toString();
        if (!cachedInjected.exists() || !currentHash.equals(cachedHash)) {
            cachedInjected.getParentFile().mkdirs();
            Files.write(cachedInjected.toPath(), currentInjected, new OpenOption[0]);
        }
    }

    private ClassLoader createJarClassLoader(File jar) throws IOException, ClassNotFoundException {
        try (final JarFile jarFile = new JarFile(jar);){
            ClassLoader classLoader = new ClassLoader(ClientLoader.class.getClassLoader()){

                @Override
                protected Class<?> findClass(String name) throws ClassNotFoundException {
                    JarEntry jarEntry;
                    String entryName = name.replace('.', '/').concat(".class");
                    try {
                        jarEntry = jarFile.getJarEntry(entryName);
                    }
                    catch (IllegalStateException ex) {
                        throw new ClassNotFoundException(name, ex);
                    }
                    if (jarEntry == null) {
                        throw new ClassNotFoundException(name);
                    }
                    try {
                        InputStream inputStream = jarFile.getInputStream(jarEntry);
                        if (inputStream == null) {
                            throw new ClassNotFoundException(name);
                        }
                        byte[] bytes = ByteStreams.toByteArray(inputStream);
                        return this.defineClass(name, bytes, 0, bytes.length);
                    }
                    catch (IOException e) {
                        throw new ClassNotFoundException(null, e);
                    }
                }
            };
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry jarEntry = entries.nextElement();
                String name = jarEntry.getName();
                if (!name.endsWith(".class")) continue;
                name = name.substring(0, name.length() - 6);
                classLoader.loadClass(name.replace('/', '.'));
            }
            ClassLoader classLoader2 = classLoader;
            return classLoader2;
        }
    }

    private Applet loadClient(RSConfig config, ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String initialClass = config.getInitialClass();
        Class<?> clientClass = classLoader.loadClass(initialClass);
        Applet rs = (Applet)clientClass.newInstance();
        rs.setStub(new RSAppletStub(config, this.runtimeConfigLoader));
        if (rs instanceof Client) {
            log.info("injected-client {}", (Object)OpenOSRS.SYSTEM_VERSION);
        }
        return rs;
    }

    private static Certificate[] loadCertificateChain(String name) {
        Certificate[] certificateArray;
        block8: {
            InputStream in = ClientLoader.class.getResourceAsStream(name);
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                Collection<? extends Certificate> certificates = certificateFactory.generateCertificates(in);
                certificateArray = certificates.toArray(new Certificate[0]);
                if (in == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (in != null) {
                        try {
                            in.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException | CertificateException e) {
                    throw new RuntimeException("Unable to parse pinned certificates", e);
                }
            }
            in.close();
        }
        return certificateArray;
    }

    private void verifyJarEntry(JarEntry je, Certificate[][] chains) throws VerificationException {
        if (je.getName().equals("META-INF/JAGEXLTD.SF") || je.getName().equals("META-INF/JAGEXLTD.RSA")) {
            return;
        }
        Object[] entryCertificates = je.getCertificates();
        for (Object[] objectArray : chains) {
            if (!Arrays.equals(entryCertificates, objectArray)) continue;
            return;
        }
        throw new VerificationException("Unable to verify jar entry: " + je.getName());
    }

    private void verifyWholeJar(JarInputStream jis, Certificate[][] chains) throws IOException, VerificationException {
        JarEntry je;
        while ((je = jis.getNextJarEntry()) != null) {
            jis.skip(Long.MAX_VALUE);
            this.verifyJarEntry(je, chains);
        }
    }

    private boolean checkOutages() {
        RuntimeConfig rtc = this.runtimeConfigLoader.tryGet();
        if (rtc != null) {
            return rtc.showOutageMessage();
        }
        return false;
    }

    private static class OutageException
    extends RuntimeException {
        private OutageException(Throwable cause) {
            super(cause);
        }
    }
}

