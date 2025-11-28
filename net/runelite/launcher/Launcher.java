/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.launcher;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.Gson;
import com.vdurmont.semver4j.Semver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import java.util.function.IntConsumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.JButton;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import net.runelite.launcher.HardwareAccelerationMode;
import net.runelite.launcher.JvmLauncher;
import net.runelite.launcher.LauncherProperties;
import net.runelite.launcher.OS;
import net.runelite.launcher.PackrConfig;
import net.runelite.launcher.ReflectionLauncher;
import net.runelite.launcher.SquireSplashScreen;
import net.runelite.launcher.VerificationException;
import net.runelite.launcher.beans.Artifact;
import net.runelite.launcher.beans.Bootstrap;
import net.runelite.launcher.beans.BootstrapMode;
import net.runelite.launcher.beans.Diff;
import net.runelite.launcher.beans.Platform;
import net.runelite.launcher.utils.S3Utils;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;

public class Launcher {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(Launcher.class);
    static final String LAUNCHER_BUILD = "https://raw.githubusercontent.com/Squire/Squire-launcher/master/build.gradle.kts";
    static final String USER_AGENT = "Squire/" + LauncherProperties.getVersion();
    static final String CLIENT_MAIN_CLASS = "net.runelite.client.RuneLite";
    private static final File SQUIRE_DIR = new File(System.getProperty("user.home"), ".squire");
    public static final File LOGS_DIR = new File(SQUIRE_DIR, "logs");
    public static final File CRASH_FILES = new File(LOGS_DIR, "jvm_crash_pid_%p.log");
    private static final File REPO_DIR = new File(SQUIRE_DIR, "repository2");
    public static String auth;
    public static boolean authenticated;
    private static String jagexAccount;

    public static void main(String[] args) throws IOException, InterruptedException {
        HardwareAccelerationMode hardwareAccelerationMode;
        OptionSet options;
        HardwareAccelerationMode defaultMode;
        System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
        OptionParser parser = new OptionParser(false);
        parser.allowsUnrecognizedOptions();
        parser.accepts("postinstall", "Perform post-install tasks");
        parser.accepts("clientargs", "Arguments passed to the client").withRequiredArg();
        parser.accepts("nojvm", "Launch the client in this VM instead of launching a new VM");
        parser.accepts("debug", "Enable debug logging");
        parser.accepts("insecure-skip-tls-verification", "Disable TLS certificate and hostname verification");
        parser.accepts("use-jre-truststore", "Use JRE cacerts truststore instead of the Windows Trusted Root Certificate Authorities (only on Windows)");
        parser.accepts("scale", "Custom scale factor for Java 2D").withRequiredArg();
        parser.accepts("help", "Show this text (use --clientargs --help for client help)").forHelp();
        parser.accepts("update", "Use this to update the original jar");
        parser.accepts("jagexlauncher", "Use this to select jagex launcher account");
        if (OS.getOs() == OS.OSType.MacOS) {
            parser.accepts("p").withRequiredArg();
        }
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(new File(SQUIRE_DIR, "squire.properties")));
        }
        catch (IOException iOException) {
            // empty catch block
        }
        boolean askmode = Optional.ofNullable(prop.getProperty("squire.askMode")).map(Boolean::valueOf).orElse(true);
        String bootstrapModeProp = prop.getProperty("squire.bootstrapMode");
        boolean disableHw = Boolean.parseBoolean(prop.getProperty("squire.disableHw"));
        if (disableHw) {
            defaultMode = HardwareAccelerationMode.OFF;
        } else {
            switch (OS.getOs()) {
                case Windows: {
                    defaultMode = HardwareAccelerationMode.DIRECTDRAW;
                    break;
                }
                case MacOS: {
                    defaultMode = HardwareAccelerationMode.OPENGL;
                    break;
                }
                default: {
                    defaultMode = HardwareAccelerationMode.OFF;
                }
            }
        }
        ArgumentAcceptingOptionSpec<HardwareAccelerationMode> mode = parser.accepts("mode").withRequiredArg().ofType(HardwareAccelerationMode.class).defaultsTo(defaultMode, (HardwareAccelerationMode[])new HardwareAccelerationMode[0]);
        try {
            options = parser.parse(args);
            hardwareAccelerationMode = options.valueOf(mode);
        }
        catch (OptionException ex) {
            log.error("unable to parse arguments", ex);
            throw ex;
        }
        boolean jagexLauncherMode = options.has("jagexlauncher");
        if (Launcher.checkForUpdate(options.has("update"))) {
            System.out.println("Squire launcher was updated, it will restart on next relaunch");
        }
        Map<String, BootstrapMode> bootstraps = S3Utils.getBootstrapModes();
        if (options.has("help")) {
            try {
                parser.printHelpOn(System.out);
            }
            catch (IOException e2) {
                log.error(null, e2);
            }
            System.exit(0);
        }
        String selectedBootstrap = "experimental";
        if (!askmode) {
            selectedBootstrap = bootstrapModeProp.toLowerCase(Locale.ROOT);
        }
        if (Launcher.getSquireAuth() == null || Launcher.getSquireAuth().isEmpty()) {
            SquireSplashScreen.init(null);
            while (!authenticated && SquireSplashScreen.getINSTANCE().isShowing()) {
                Thread.sleep(1000L);
            }
            log.info("Authenticated");
        }
        if (jagexLauncherMode) {
            SquireSplashScreen.init("Selecting account");
            while (jagexAccount == null) {
                Thread.sleep(1000L);
            }
        }
        for (BootstrapMode bootstrapMode : bootstraps.values()) {
            if (!options.has(bootstrapMode.getMode())) continue;
            selectedBootstrap = bootstrapMode.getMode();
        }
        boolean isDebug = options.has("debug");
        LOGS_DIR.mkdirs();
        if (isDebug) {
            Logger logger = (Logger)LoggerFactory.getLogger("ROOT");
            logger.setLevel(Level.DEBUG);
        }
        if (selectedBootstrap == null || bootstraps.get(selectedBootstrap) == null) {
            SquireSplashScreen.init(null);
            SquireSplashScreen.barMessage(null);
            SquireSplashScreen.message(null);
            List sortedList = bootstraps.values().stream().sorted(Comparator.comparing(BootstrapMode::getMode, String::compareTo).reversed()).collect(Collectors.toList());
            for (BootstrapMode bootstrapMode : sortedList) {
                JButton button = SquireSplashScreen.addButton(StringUtils.capitalize(bootstrapMode.getMode()));
                if (button == null) continue;
                button.addActionListener(e -> {
                    Launcher.writeAuth();
                    SquireSplashScreen.close();
                    Runnable task = () -> Launcher.launch(hardwareAccelerationMode, options, prop, bootstrapMode);
                    Thread thread = new Thread(task);
                    thread.start();
                });
            }
        } else {
            Launcher.launch(hardwareAccelerationMode, options, prop, bootstraps.get(selectedBootstrap));
        }
        SquireSplashScreen.showButtons();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean checkForUpdate(boolean replace) {
        if (System.getenv("JX_ACCESS_TOKEN") != null && !System.getenv("JX_ACCESS_TOKEN").isEmpty()) {
            return false;
        }
        if (Launcher.isLauncherOpen()) {
            System.out.println("Not updating since launcher is open");
            return false;
        }
        File target = new File(System.getProperty("user.dir") + File.separator + "jar" + File.separator + "squire-updated.jar");
        if (target.exists()) {
            System.out.println("Please start squire using the launch files or it will never update");
            return false;
        }
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder().url("https://xjgpaktg4y3h6uazduo2pfqjk40mibhr.lambda-url.eu-west-1.on.aws/").addHeader("auth", Launcher.getSquireAuth()).build();
        try (Response res = client.newCall(request).execute();){
            ResponseBody body = res.body();
            if (res.code() != 200) {
                boolean bl = false;
                return bl;
            }
            String version = body.string();
            String launcherVersion = LauncherProperties.getVersion();
            if (!Launcher.isVersionOutdated(launcherVersion, version)) {
                boolean bl = false;
                return bl;
            }
            System.out.println("Update found... downloading");
        }
        catch (IOException e) {
            e.printStackTrace();
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Request requestNewLauncher = new Request.Builder().url("https://6zyqmauzakrgs4jprwsf6tqotm0zyepn.lambda-url.eu-west-1.on.aws/").addHeader("auth", Launcher.getSquireAuth()).build();
        try (Response res = client.newCall(requestNewLauncher).execute();){
            ResponseBody body = res.body();
            if (res.code() != 200) {
                boolean launcherVersion = false;
                return launcherVersion;
            }
            if (body == null) {
                boolean launcherVersion = false;
                return launcherVersion;
            }
            String url = body.string();
            URLConnection connection = new URL(url).openConnection();
            try (OutputStream outputStream = Files.newOutputStream(target.toPath(), new OpenOption[0]);
                 InputStream is = connection.getURL().openStream();){
                int numRead;
                byte[] buffer = new byte[0x100000];
                int percent = 0;
                System.out.printf("%d (%%)%n", percent);
                while ((numRead = is.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, numRead);
                }
            }
            boolean bl = true;
            return bl;
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean isLauncherOpen() {
        FileOutputStream fos = null;
        try {
            File file = new File(System.getProperty("user.dir") + File.separator + "jar" + File.separator + "squire-launcher.jar");
            fos = new FileOutputStream(file, true);
        }
        catch (IOException e) {
            boolean bl = true;
            return bl;
        }
        finally {
            if (fos != null) {
                try {
                    fos.close();
                }
                catch (IOException iOException) {}
            }
        }
        return false;
    }

    private static boolean isStillAlive(File session) {
        String pid = session.getName().replace("squire-session-index-", "");
        try {
            return Launcher.isStillAlive(pid);
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isStillAlive(String pidStr) {
        String OS2 = System.getProperty("os.name").toLowerCase();
        String command = null;
        if (OS2.indexOf("win") >= 0) {
            command = "cmd /c tasklist /FI \"PID eq " + pidStr + "\"";
        } else if (OS2.indexOf("nix") >= 0 || OS2.indexOf("nux") >= 0) {
            command = "ps -p " + pidStr;
        } else {
            return false;
        }
        return Launcher.isProcessIdRunning(pidStr, command);
    }

    private static boolean isProcessIdRunning(String pid, String command) {
        log.debug("Command [{}]", (Object)command);
        try {
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
            InputStreamReader isReader = new InputStreamReader(pr.getInputStream());
            BufferedReader bReader = new BufferedReader(isReader);
            String strLine = null;
            while ((strLine = bReader.readLine()) != null) {
                if (!strLine.contains(" " + pid + " ")) continue;
                return true;
            }
            return false;
        }
        catch (Exception ex) {
            log.warn("Got exception using system command [{}].", (Object)command, (Object)ex);
            return true;
        }
    }

    private static void writeAuth() {
        File keyFile = new File(SQUIRE_DIR, "cfg.sqr");
        if (!keyFile.exists()) {
            try {
                if (!SQUIRE_DIR.exists() && SQUIRE_DIR.mkdirs() && !keyFile.createNewFile()) {
                    return;
                }
            }
            catch (IOException e) {
                return;
            }
        }
        try (FileWriter writer = new FileWriter(keyFile);){
            writer.write(auth);
        }
        catch (IOException e) {
            return;
        }
    }

    public static String getSquireAuth() {
        Path key = new File(SQUIRE_DIR, "cfg.sqr").toPath();
        try {
            return Files.readString(key, StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            return "";
        }
    }

    private static void launch(HardwareAccelerationMode mode, OptionSet options, Properties prop, BootstrapMode bootstrapMode) {
        Launcher.initDllBlacklist();
        SquireSplashScreen.init("Downloading Latest Client");
        try {
            Bootstrap bootstrap;
            boolean postInstall;
            SquireSplashScreen.stage(0.0, "Setting up environment");
            log.info("Squire Launcher version {}", (Object)LauncherProperties.getVersion());
            ArrayList<String> jvmProps = new ArrayList<String>();
            if (options.has("scale")) {
                jvmProps.add("-Dsun.java2d.dpiaware=true");
                jvmProps.add("-Dsun.java2d.uiScale=" + options.valueOf("scale"));
            }
            log.info("Setting hardware acceleration to {}", (Object)mode);
            jvmProps.addAll(mode.toParams(OS.getOs()));
            jvmProps.add("-Djava.net.preferIPv4Stack=true");
            jvmProps.add("-Djava.net.preferIPv4Addresses=true");
            if (OS.getOs() == OS.OSType.MacOS) {
                jvmProps.add("-Dapple.awt.application.appearance=system");
            }
            jvmProps.add("-D" + LauncherProperties.getVersionKey() + "=" + LauncherProperties.getVersion());
            boolean insecureSkipTlsVerification = options.has("insecure-skip-tls-verification");
            if (insecureSkipTlsVerification) {
                jvmProps.add("-Drunelite.insecure-skip-tls-verification=true");
            }
            if (OS.getOs() == OS.OSType.Windows && !options.has("use-jre-truststore")) {
                jvmProps.add("-Djavax.net.ssl.trustStoreType=Windows-ROOT");
            }
            Launcher.setJvmParams(jvmProps);
            ArrayList<String> jvmParams = new ArrayList<String>();
            log.debug("Setting JVM crash log location to {}", (Object)CRASH_FILES);
            jvmParams.add("-XX:ErrorFile=" + CRASH_FILES.getAbsolutePath());
            if (insecureSkipTlsVerification) {
                Launcher.setupInsecureTrustManager();
            }
            if (postInstall = options.has("postinstall")) {
                Launcher.postInstall(jvmParams, bootstrapMode);
                return;
            }
            if (log.isDebugEnabled()) {
                log.debug("Java Environment:");
                Properties p = System.getProperties();
                Enumeration<Object> keys = p.keys();
                while (keys.hasMoreElements()) {
                    String key = (String)keys.nextElement();
                    String value = (String)p.get(key);
                    log.debug("  {}: {}", (Object)key, (Object)value);
                }
            }
            System.out.println("Downloading bootstrap");
            SquireSplashScreen.stage(0.05, "Downloading bootstrap");
            try {
                bootstrap = Launcher.getBootstrap(bootstrapMode);
                System.out.println("Fetched bootstrap {}");
            }
            catch (IOException ex) {
                log.error("error fetching bootstrap", ex);
                SquireSplashScreen.setError("Error while downloading the bootstrap!", "You have encountered an issue, please check your log files for a more detailed error message.");
                SquireSplashScreen.close();
                return;
            }
            System.out.println("Tidying the cache");
            SquireSplashScreen.stage(0.1, "Tidying the cache");
            boolean nojvm = Boolean.parseBoolean(prop.getProperty("squire.noJvm")) || "true".equals(System.getProperty("runelite.launcher.nojvm")) || "true".equals(System.getProperty("squire.launcher.nojvm"));
            REPO_DIR.mkdirs();
            System.out.println("Made repo dirs " + bootstrap);
            List<Artifact> artifacts = Arrays.stream(bootstrap.getArtifacts()).filter(a -> {
                if (a.getPlatform() == null) {
                    return true;
                }
                String os = System.getProperty("os.name");
                String arch = System.getProperty("os.arch");
                for (Platform platform : a.getPlatform()) {
                    OS.OSType platformOs;
                    if (platform.getName() == null || !((platformOs = OS.parseOs(platform.getName())) == OS.OSType.Other ? platform.getName().equals(os) : platformOs == OS.getOs()) || platform.getArch() != null && !platform.getArch().equals(arch)) continue;
                    return true;
                }
                return false;
            }).collect(Collectors.toList());
            Launcher.clean(artifacts);
            try {
                Launcher.download(artifacts);
            }
            catch (IOException ex) {
                log.error("unable to download artifacts", ex);
                SquireSplashScreen.setError("Error while downloading the client!", "You have encountered an issue, please check your log files for a more detailed error message.");
                SquireSplashScreen.close();
                return;
            }
            System.out.println("Verifying");
            SquireSplashScreen.stage(0.8, "Verifying");
            try {
                Launcher.verifyJarHashes(artifacts);
            }
            catch (VerificationException ex) {
                log.error("Unable to verify artifacts", ex);
                SquireSplashScreen.setError("Error while verifying downloaded files!", "You have encountered an issue, please check your log files for a more detailed error message.");
                SquireSplashScreen.close();
                return;
            }
            Collection<String> clientArgs = Launcher.getClientArgs(options);
            if (log.isDebugEnabled()) {
                clientArgs.add("--debug");
            }
            if (jagexAccount != null) {
                clientArgs.add("--account=" + jagexAccount);
            }
            System.out.println("Starting");
            SquireSplashScreen.stage(0.9, "Starting the client");
            List<File> classpath = artifacts.stream().map(dep -> new File(REPO_DIR, dep.getName())).collect(Collectors.toList());
            System.out.println("Launching reflection");
            if (nojvm || options.has("nojvm")) {
                try {
                    ReflectionLauncher.launch(classpath, clientArgs);
                }
                catch (MalformedURLException ex) {
                    log.error("unable to launch client", ex);
                }
            } else {
                try {
                    JvmLauncher.launch(bootstrap, classpath, clientArgs, jvmProps, jvmParams);
                }
                catch (IOException ex) {
                    log.error("unable to launch client", ex);
                }
            }
        }
        catch (Exception e) {
            log.error("Failure during startup", e);
            boolean postInstall = options.has("postinstall");
            if (!postInstall) {
                SquireSplashScreen.setError("Error during startup!", "Squire has encountered an unexpected error during startup, please check your log files for a more detailed error message.");
            }
        }
        catch (Error e) {
            log.error("Failure during startup", e);
            throw e;
        }
        finally {
            SquireSplashScreen.close();
        }
    }

    private static boolean checkVersion(Bootstrap bootstrap) {
        if (bootstrap.getMinimumLauncherVersion() == null || LauncherProperties.getVersion() == null) {
            return true;
        }
        Semver minimum = new Semver(bootstrap.getMinimumLauncherVersion()).withClearedSuffixAndBuild();
        Semver ours = new Semver(LauncherProperties.getVersion()).withClearedSuffixAndBuild();
        return !ours.isLowerThan(minimum);
    }

    private static void setJvmParams(Collection<String> params) {
        for (String param : params) {
            String[] split = param.replace("-D", "").split("=");
            System.setProperty(split[0], split[1]);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Bootstrap getBootstrap(BootstrapMode bootstrapMode) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("text/plain");
        Request request = new Request.Builder().url("https://6kvxsi2v4a3jozbz3qlc56uuxa0ecqrh.lambda-url.eu-west-1.on.aws/").addHeader("auth", Launcher.getSquireAuth()).addHeader("build", bootstrapMode.getMode()).build();
        try (Response response = client.newCall(request).execute();){
            ResponseBody rb = response.body();
            if (!response.isSuccessful() || rb == null) {
                log.info("Failed grabbing bootstrap {} - {}", (Object)response, (Object)rb);
                Bootstrap bootstrap = null;
                return bootstrap;
            }
            String json = rb.string();
            Bootstrap bootstrap = new Gson().fromJson(json, Bootstrap.class);
            return bootstrap;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Collection<String> getClientArgs(OptionSet options) {
        Collection args = options.nonOptionArguments().stream().filter(String.class::isInstance).map(String.class::cast).collect(Collectors.toCollection(ArrayList::new));
        String clientArgs = System.getenv("RUNELITE_ARGS");
        if (!Strings.isNullOrEmpty(clientArgs)) {
            args.addAll(Splitter.on(' ').omitEmptyStrings().trimResults().splitToList(clientArgs));
        }
        if (!Strings.isNullOrEmpty(clientArgs = System.getenv("SQUIRE_ARGS"))) {
            args.addAll(Splitter.on(' ').omitEmptyStrings().trimResults().splitToList(clientArgs));
        }
        if (!Strings.isNullOrEmpty(clientArgs = (String)options.valueOf("clientargs"))) {
            args.addAll(Splitter.on(' ').omitEmptyStrings().trimResults().splitToList(clientArgs));
        }
        return args;
    }

    private static void clean(List<Artifact> artifacts) {
        File[] existingFiles = REPO_DIR.listFiles();
        if (existingFiles == null) {
            return;
        }
        HashSet<String> artifactNames = new HashSet<String>();
        for (Artifact artifact : artifacts) {
            artifactNames.add(artifact.getName());
            if (artifact.getDiffs() == null) continue;
            for (Diff diff : artifact.getDiffs()) {
                artifactNames.add(diff.getFrom());
            }
        }
        for (File file : existingFiles) {
            if (!file.isFile() || artifactNames.contains(file.getName())) continue;
            if (file.delete()) {
                log.debug("Deleted old artifact {}", (Object)file);
                continue;
            }
            log.warn("Unable to delete old artifact {}", (Object)file);
        }
    }

    private static void verifyJarHashes(List<Artifact> artifacts) throws VerificationException {
        for (Artifact artifact : artifacts) {
            String fileHash;
            String expectedHash = artifact.getHash();
            try {
                fileHash = Launcher.hash(new File(REPO_DIR, artifact.getName()));
            }
            catch (IOException e) {
                throw new VerificationException("unable to hash file", e);
            }
            if (!fileHash.equals(expectedHash)) {
                log.warn("Expected {} for {} but got {}", expectedHash, artifact.getName(), fileHash);
                throw new VerificationException("Expected " + expectedHash + " for " + artifact.getName() + " but got " + fileHash);
            }
            log.info("Verified hash of {}", (Object)artifact.getName());
        }
    }

    private static String hash(File file) throws IOException {
        HashFunction sha256 = Hashing.sha256();
        return com.google.common.io.Files.asByteSource(file).hash(sha256).toString();
    }

    @VisibleForTesting
    static int compareVersion(String a, String b) {
        Pattern tok = Pattern.compile("[^0-9a-zA-Z]");
        return Arrays.compare(tok.split(a), tok.split(b), (x, y) -> {
            Integer ix = null;
            try {
                ix = Integer.parseInt(x);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            Integer iy = null;
            try {
                iy = Integer.parseInt(y);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            if (ix == null && iy == null) {
                return x.compareToIgnoreCase((String)y);
            }
            if (ix == null) {
                return -1;
            }
            if (iy == null) {
                return 1;
            }
            if (ix > iy) {
                return 1;
            }
            if (ix < iy) {
                return -1;
            }
            return 0;
        });
    }

    private static void download(List<Artifact> artifacts) throws IOException {
        ArrayList<Artifact> toDownload = new ArrayList<Artifact>(artifacts.size());
        HashMap diffs = new HashMap();
        int totalDownloadBytes = 0;
        for (Artifact artifact : artifacts) {
            String hash;
            File dest = new File(REPO_DIR, artifact.getName());
            try {
                hash = Launcher.hash(dest);
            }
            catch (FileNotFoundException ex) {
                hash = null;
            }
            if (Objects.equals(hash, artifact.getHash())) {
                log.debug("Hash for {} up to date", (Object)artifact.getName());
                continue;
            }
            int downloadSize = artifact.getSize();
            toDownload.add(artifact);
            totalDownloadBytes += downloadSize;
        }
        double START_PROGRESS = 0.15;
        int downloaded = 0;
        SquireSplashScreen.stage(0.15, "Downloading");
        for (Artifact artifact : toDownload) {
            File dest = new File(REPO_DIR, artifact.getName());
            int total = downloaded;
            log.debug("Downloading {}", (Object)artifact.getName());
            try (FileOutputStream fout = new FileOutputStream(dest);){
                int totalBytes = totalDownloadBytes;
                Launcher.download(artifact.getPath(), artifact.getHash(), completed -> SquireSplashScreen.stage(0.15, 0.8, artifact.getName(), total + completed, totalBytes, true), fout);
                downloaded += artifact.getSize();
            }
            catch (VerificationException e) {
                log.warn("unable to verify jar {}", (Object)artifact.getName(), (Object)e);
            }
        }
    }

    private static void download(String path, String hash, IntConsumer progress, OutputStream out) throws IOException, VerificationException {
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestProperty("User-Agent", USER_AGENT);
        conn.getResponseCode();
        InputStream err = conn.getErrorStream();
        if (err != null) {
            err.close();
            throw new IOException("Unable to download " + path + " - " + conn.getResponseMessage());
        }
        int downloaded = 0;
        HashingOutputStream hout = new HashingOutputStream(Hashing.sha256(), out);
        try (InputStream in = conn.getInputStream();){
            int i;
            byte[] buffer = new byte[0x100000];
            while ((i = in.read(buffer)) != -1) {
                hout.write(buffer, 0, i);
                progress.accept(downloaded += i);
            }
        }
        HashCode hashCode = hout.hash();
        if (!hash.equals(hashCode.toString())) {
            throw new VerificationException("Unable to verify resource " + path + " - expected " + hash + " got " + hashCode.toString());
        }
    }

    static boolean isJava17() {
        return false;
    }

    private static void setupInsecureTrustManager() throws NoSuchAlgorithmException, KeyManagementException {
        X509TrustManager trustManager = new X509TrustManager(){

            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, new TrustManager[]{trustManager}, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
    }

    private static void postInstall(List<String> jvmParams, BootstrapMode bootstrapMode) {
        Bootstrap bootstrap;
        try {
            bootstrap = Launcher.getBootstrap(bootstrapMode);
        }
        catch (IOException ex) {
            log.error("error fetching bootstrap", ex);
            return;
        }
        PackrConfig.updateLauncherArgs(bootstrap, jvmParams);
        log.info("Performed postinstall steps");
    }

    private static void initDllBlacklist() {
        if (OS.getOs() != OS.OSType.Windows) {
            return;
        }
        String blacklistedDlls = System.getProperty("runelite.launcher.blacklistedDlls");
        if (blacklistedDlls == null || blacklistedDlls.isEmpty()) {
            return;
        }
        String arch = System.getProperty("os.arch");
        if (!"x86".equals(arch) && !"amd64".equals(arch)) {
            log.debug("System architecture is not supported for launcher natives: {}", (Object)arch);
            return;
        }
        String[] dlls = blacklistedDlls.split(",");
        try {
            System.loadLibrary("launcher_" + arch);
            log.debug("Setting blacklisted dlls: {}", (Object)blacklistedDlls);
            Launcher.setBlacklistedDlls(dlls);
        }
        catch (Error ex) {
            log.debug("Error setting dll blacklist", ex);
        }
    }

    private static native void setBlacklistedDlls(String[] var0);

    private static boolean isVersionOutdated(String current, String fetched) {
        String[] partsCurrent = current.split("\\.");
        String[] partsFetched = fetched.split("\\.");
        for (int i = 0; i < partsCurrent.length; ++i) {
            String trim = partsCurrent[i].trim();
            Integer currentPart = Integer.parseInt(trim);
            String trim1 = partsFetched[i].trim();
            Integer fetchedPart = Integer.parseInt(trim1);
            if (currentPart >= fetchedPart) continue;
            return true;
        }
        return false;
    }

    public static void setJagexAccount(String jagexAccount) {
        Launcher.jagexAccount = jagexAccount;
    }

    static {
        authenticated = false;
        jagexAccount = null;
    }
}
