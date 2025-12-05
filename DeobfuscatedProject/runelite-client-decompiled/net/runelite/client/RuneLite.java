/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Guice
 *  com.google.inject.Inject
 *  com.google.inject.Injector
 *  com.google.inject.Module
 *  javax.inject.Provider
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.Constants
 *  net.runelite.api.World
 *  net.runelite.http.api.RuneLiteAPI
 *  net.runelite.http.api.worlds.World
 *  net.runelite.http.api.worlds.WorldResult
 *  net.runelite.http.api.worlds.WorldType
 */
package net.runelite.client;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.openosrs.client.OpenOSRS;
import com.openosrs.client.game.PlayerManager;
import com.openosrs.client.ui.OpenOSRSSplashScreen;
import gg.squire.client.Squire;
import gg.squire.client.uid.RandomService;
import java.applet.Applet;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.SwingUtilities;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.ValueConversionException;
import joptsimple.ValueConverter;
import joptsimple.util.EnumConverter;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.client.ClassPreloader;
import net.runelite.client.ClientSessionManager;
import net.runelite.client.RuneLiteModule;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.RuntimeConfig;
import net.runelite.client.RuntimeConfigLoader;
import net.runelite.client.TelemetryClient;
import net.runelite.client.account.SessionManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.discord.DiscordService;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.game.WorldService;
import net.runelite.client.game.XpDropManager;
import net.runelite.client.plugins.OPRSExternalPluginManager;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.rs.ClientLoader;
import net.runelite.client.rs.ClientUpdateCheckMode;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.FatalErrorDialog;
import net.runelite.client.ui.SplashScreen;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.WidgetOverlay;
import net.runelite.client.ui.overlay.tooltip.TooltipOverlay;
import net.runelite.client.ui.overlay.worldmap.WorldMapOverlay;
import net.runelite.client.util.ReflectUtil;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.worlds.World;
import net.runelite.http.api.worlds.WorldResult;
import net.runelite.http.api.worlds.WorldType;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.client.Unethicalite;
import net.unethicalite.client.managers.SettingsManager;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.LoggerFactory;

@Singleton
public class RuneLite {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(RuneLite.class);
    public static final String OPENOSRS = ".squire";
    public static final File RUNELITE_DIR = new File(System.getProperty("user.home"), ".squire");
    public static final File CACHE_DIR = new File(RUNELITE_DIR, "cache");
    public static final File PLUGINS_DIR = new File(RUNELITE_DIR, "plugin-hub");
    public static final File PROFILES_DIR = new File(RUNELITE_DIR, "profiles");
    public static final File SCREENSHOT_DIR = new File(RUNELITE_DIR, "screenshots");
    public static final File LOGS_DIR = new File(RUNELITE_DIR, "logs");
    public static final File DEFAULT_SESSION_FILE = new File(RUNELITE_DIR, "session");
    public static final File DEFAULT_CONFIG_FILE = new File(RUNELITE_DIR, "squire.properties");
    private static final int MAX_OKHTTP_CACHE_SIZE = 0x1400000;
    public static String USER_AGENT = "RuneLite/" + RuneLiteProperties.getVersion() + "-" + RuneLiteProperties.getCommit() + (RuneLiteProperties.isDirty() ? "+" : "");
    private static Injector injector;
    @Inject
    private PluginManager pluginManager;
    @Inject
    private ExternalPluginManager externalPluginManager;
    @Inject
    private OPRSExternalPluginManager oprsExternalPluginManager;
    @Inject
    private EventBus eventBus;
    @Inject
    private ConfigManager configManager;
    @Inject
    private SessionManager sessionManager;
    @Inject
    private DiscordService discordService;
    @Inject
    private RandomService randomService;
    @Inject
    private ClientSessionManager clientSessionManager;
    @Inject
    private ClientUI clientUI;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private Provider<TooltipOverlay> tooltipOverlay;
    @Inject
    private Provider<WorldMapOverlay> worldMapOverlay;
    @Inject
    private Provider<XpDropManager> xpDropManager;
    @Inject
    private Provider<PlayerManager> playerManager;
    @Inject
    private WorldService worldService;
    @Inject
    @Nullable
    private Applet applet;
    @Inject
    @Nullable
    private Client client;
    @Inject
    @Nullable
    private RuntimeConfig runtimeConfig;
    @Inject
    @Nullable
    private TelemetryClient telemetryClient;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void main(String[] args) throws Exception {
        OkHttpClient okHttpClient;
        Path old;
        Locale.setDefault(Locale.ENGLISH);
        if (!RUNELITE_DIR.exists() && !RUNELITE_DIR.mkdir()) {
            throw new IOException("Unable to create " + String.valueOf(RUNELITE_DIR));
        }
        if (!DEFAULT_CONFIG_FILE.exists() && Files.exists(old = Path.of(System.getProperty("user.home"), ".openosrs", "squire.properties"), new LinkOption[0])) {
            Files.move(old, DEFAULT_CONFIG_FILE.toPath(), new CopyOption[0]);
        }
        OptionParser parser = new OptionParser(false);
        parser.accepts("developer-mode", "Enable developer tools");
        parser.accepts("debug", "Show extra debugging output");
        parser.accepts("safe-mode", "Disables external plugins and the GPU plugin");
        parser.accepts("insecure-skip-tls-verification", "Disables TLS verification");
        parser.accepts("jav_config", "jav_config url").withRequiredArg().defaultsTo(RuneLiteProperties.getJavConfig(), (String[])new String[0]);
        parser.accepts("disable-telemetry", "Disable telemetry");
        parser.accepts("profile", "Configuration profile to use").withRequiredArg();
        parser.accepts("skip-auth", "Skips authentication by reading from key file");
        parser.accepts("world", "Sets the world the game loads as").withOptionalArg().ofType(String.class);
        ArgumentAcceptingOptionSpec<File> sessionfile = parser.accepts("sessionfile", "Use a specified session file").withRequiredArg().withValuesConvertedBy(new ConfigFileConverter()).defaultsTo(DEFAULT_SESSION_FILE, (File[])new File[0]);
        ArgumentAcceptingOptionSpec<String> proxyInfo = parser.accepts("proxy").withRequiredArg().ofType(String.class);
        ArgumentAcceptingOptionSpec<File> configfile = parser.accepts("config", "Use a specified config file (deprecated)").withRequiredArg().withValuesConvertedBy(new ConfigFileConverter()).defaultsTo(DEFAULT_CONFIG_FILE, (File[])new File[0]);
        ArgumentAcceptingOptionSpec<ClientUpdateCheckMode> updateMode = parser.accepts("rs", "Select client type").withRequiredArg().ofType(ClientUpdateCheckMode.class).defaultsTo(ClientUpdateCheckMode.AUTO, (ClientUpdateCheckMode[])new ClientUpdateCheckMode[0]).withValuesConvertedBy(new EnumConverter<ClientUpdateCheckMode>(ClientUpdateCheckMode.class){

            @Override
            public ClientUpdateCheckMode convert(String v) {
                return (ClientUpdateCheckMode)((Object)super.convert(v.toUpperCase()));
            }
        });
        parser.accepts("help", "Show this text").forHelp();
        OptionSet options = SettingsManager.parseArgs(parser, args);
        if (options.has("help")) {
            parser.printHelpOn(System.out);
            System.exit(0);
        }
        if (options.has("debug")) {
            Logger logger = (Logger)LoggerFactory.getLogger("ROOT");
            logger.setLevel(Level.DEBUG);
        }
        Squire.setIp(RuneLite.getIPBefore());
        if (options.has("proxy")) {
            String[] proxy = options.valueOf(proxyInfo).split(":");
            if (proxy.length >= 2) {
                System.setProperty("socksProxyHost", proxy[0]);
                System.setProperty("socksProxyPort", proxy[1]);
            }
            if (proxy.length >= 4) {
                System.setProperty("java.net.socks.username", proxy[2]);
                System.setProperty("java.net.socks.password", proxy[3]);
                final String user = proxy[2];
                final char[] pass = proxy[3].toCharArray();
                Authenticator.setDefault(new Authenticator(){
                    private final PasswordAuthentication auth;
                    {
                        this.auth = new PasswordAuthentication(user, pass);
                    }

                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return this.auth;
                    }
                });
            }
        }
        if (options.has("world")) {
            System.setProperty("cli.world", options.valueOf("world").toString());
        }
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
            log.error("Uncaught exception:", throwable);
            if (throwable instanceof AbstractMethodError) {
                log.error("Classes are out of date; Build with maven again.");
            }
        });
        OpenOSRS.preload();
        RuneLiteAPI.CLIENT = okHttpClient = RuneLite.buildHttpClient(options.has("insecure-skip-tls-verification"));
        SplashScreen.init();
        OpenOSRSSplashScreen.init();
        if (options.has("skip-auth")) {
            try {
                String file = Squire.readKeyFile();
                OpenOSRSSplashScreen.authenticated = true;
                Squire.setAuthentication(file, file);
            }
            catch (Exception e) {
                System.exit(1);
            }
        } else {
            SwingUtilities.invokeLater(() -> OpenOSRSSplashScreen.stage(0.0, "Authenticating, please login first.."));
            while (!OpenOSRSSplashScreen.authenticated) {
                Thread.sleep(10L);
            }
        }
        try {
            boolean developerMode;
            RuntimeConfigLoader runtimeConfigLoader = new RuntimeConfigLoader(okHttpClient);
            ClientLoader clientLoader = new ClientLoader(okHttpClient, options.valueOf(updateMode), runtimeConfigLoader, (String)options.valueOf("jav_config"));
            new Thread(() -> {
                clientLoader.get();
                ClassPreloader.preload();
            }, "Preloader").start();
            boolean bl = developerMode = options.has("developer-mode") && RuneLiteProperties.getLauncherVersion() == null;
            if (developerMode) {
                boolean assertions = false;
                if (!$assertionsDisabled) {
                    assertions = true;
                    if (!true) {
                        throw new AssertionError();
                    }
                }
                if (!assertions) {
                    SwingUtilities.invokeLater(() -> new FatalErrorDialog("Developers should enable assertions; Add `-ea` to your JVM arguments`").addHelpButtons().addBuildingGuide().open());
                    return;
                }
            }
            PROFILES_DIR.mkdirs();
            log.info("RuneLite {} (launcher version {}) starting up, args: {}", RuneLiteProperties.getVersion(), MoreObjects.firstNonNull(RuneLiteProperties.getLauncherVersion(), "unknown"), args.length == 0 ? "none" : String.join((CharSequence)" ", args));
            RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
            log.info("Java VM arguments: {}", (Object)String.join((CharSequence)" ", runtime.getInputArguments()));
            long start = System.currentTimeMillis();
            injector = Guice.createInjector((Module[])new Module[]{new RuneLiteModule(okHttpClient, clientLoader, runtimeConfigLoader, developerMode, options.has("safe-mode"), true, options.valueOf(sessionfile), options.valueOf(configfile), (String)options.valueOf("profile"))});
            System.out.println("Running in " + options.has("safe-mode"));
            ((RuneLite)injector.getInstance(RuneLite.class)).start(options);
            long end = System.currentTimeMillis();
            long uptime = runtime.getUptime();
            log.info("Client initialization took {}ms. Uptime: {}ms", (Object)(end - start), (Object)uptime);
        }
        catch (Exception e) {
            log.error("Failure during startup", e);
            SwingUtilities.invokeLater(() -> new FatalErrorDialog("Squire has encountered an unexpected error during startup.").addHelpButtons().open());
        }
        finally {
            SplashScreen.stop();
        }
    }

    private static String getIPBefore() {
        try {
            HttpURLConnection connection = (HttpURLConnection)new URL("http://checkip.amazonaws.com/").openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            BufferedReader ipAddress = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String ip = ipAddress.readLine();
            ipAddress.close();
            connection.disconnect();
            return ip;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @VisibleForTesting
    public static void setInjector(Injector injector) {
        RuneLite.injector = injector;
    }

    @VisibleForTesting
    static OkHttpClient buildHttpClient(boolean insecureSkipTlsVerification) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder().pingInterval(30L, TimeUnit.SECONDS).addInterceptor(chain -> {
            Request request = chain.request();
            if (request.url().host().endsWith("runescape.com")) {
                return chain.proceed(request);
            }
            if (request.url().host().endsWith("openosrs.dev")) {
                Request userAgentRequest = request.newBuilder().header("User-Agent", "OpenOSRS/" + OpenOSRS.SYSTEM_VERSION).build();
                return chain.proceed(userAgentRequest);
            }
            if (request.header("User-Agent") != null) {
                return chain.proceed(request);
            }
            Request userAgentRequest = request.newBuilder().header("User-Agent", USER_AGENT).build();
            return chain.proceed(userAgentRequest);
        }).cache(new Cache(new File(CACHE_DIR, "okhttp"), 0x1400000L)).addNetworkInterceptor(chain -> {
            Response res = chain.proceed(chain.request());
            if (res.code() >= 400 && "GET".equals(res.request().method())) {
                res = res.newBuilder().header("Cache-Control", "no-store").build();
            }
            return res;
        });
        if (insecureSkipTlsVerification || RuneLiteProperties.isInsecureSkipTlsVerification()) {
            RuneLite.setupInsecureTrustManager(builder);
        }
        return builder.build();
    }

    private static void setupInsecureTrustManager(OkHttpClient.Builder okHttpClientBuilder) {
        try {
            X509TrustManager trustManager = new X509TrustManager(){

                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, new TrustManager[]{trustManager}, new SecureRandom());
            okHttpClientBuilder.sslSocketFactory(sc.getSocketFactory(), trustManager);
        }
        catch (KeyManagementException | NoSuchAlgorithmException ex) {
            log.warn("unable to setup insecure trust manager", ex);
        }
    }

    private static void copyJagexCache() {
        Path from = Paths.get(System.getProperty("user.home"), "jagexcache");
        Path to = Unethicalite.getCacheDirectory().getAbsoluteFile().toPath();
        if (Files.exists(to, new LinkOption[0]) || !Files.exists(from, new LinkOption[0])) {
            return;
        }
        log.info("Copying jagexcache from {} to {}", (Object)from, (Object)to);
        try (Stream<Path> stream = Files.walk(from, new FileVisitOption[0]);){
            stream.forEach(source -> {
                try {
                    Files.copy(source, to.resolve(from.relativize((Path)source)), StandardCopyOption.COPY_ATTRIBUTES);
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        catch (Exception e) {
            log.warn("unable to copy jagexcache", e);
        }
    }

    public void start(OptionSet options) throws Exception {
        boolean isOutdated;
        boolean bl = isOutdated = this.client == null;
        if (!isOutdated) {
            injector.injectMembers((Object)this.client);
        }
        this.setupSystemProps();
        if (this.applet != null) {
            RuneLite.copyJagexCache();
            this.applet.setSize(Constants.GAME_FIXED_SIZE);
            System.setProperty("jagex.disableBouncyCastle", "true");
            System.setProperty("jagex.userhome", RUNELITE_DIR.getAbsolutePath());
            this.applet.init();
            this.applet.start();
        }
        SplashScreen.stage(0.57, null, "Loading configuration");
        this.sessionManager.loadSession();
        this.configManager.load();
        this.sessionManager.loadSession();
        this.pluginManager.setOutdated(isOutdated);
        this.oprsExternalPluginManager.setupInstance();
        this.oprsExternalPluginManager.startExternalUpdateManager();
        this.oprsExternalPluginManager.startExternalPluginManager();
        this.oprsExternalPluginManager.setOutdated(isOutdated);
        this.oprsExternalPluginManager.update();
        this.pluginManager.loadCorePlugins();
        this.oprsExternalPluginManager.loadPlugins();
        this.externalPluginManager.loadExternalPlugins();
        SplashScreen.stage(0.7, null, "Finalizing configuration");
        this.pluginManager.loadDefaultPluginConfiguration(null);
        this.clientSessionManager.start();
        this.eventBus.register(this.clientSessionManager);
        SplashScreen.stage(0.75, null, "Starting core interface");
        this.clientUI.init();
        this.discordService.init();
        this.eventBus.register(this.clientUI);
        this.eventBus.register(this.pluginManager);
        this.eventBus.register(this.externalPluginManager);
        this.eventBus.register(this.overlayManager);
        this.eventBus.register(this.configManager);
        this.eventBus.register(this.discordService);
        this.eventBus.register(this.randomService);
        if (!isOutdated) {
            WidgetOverlay.createOverlays(this.overlayManager, this.client).forEach(this.overlayManager::add);
            this.overlayManager.add((Overlay)this.worldMapOverlay.get());
            this.overlayManager.add((Overlay)this.tooltipOverlay.get());
            this.playerManager.get();
            this.eventBus.register(this.xpDropManager.get());
            Optional<String> worldArg = Optional.ofNullable(System.getProperty("cli.world"));
            worldArg.ifPresent(this::setWorld);
        }
        this.pluginManager.startPlugins();
        SplashScreen.stop();
        this.clientUI.show();
        if (this.telemetryClient != null) {
            this.telemetryClient.submitTelemetry();
            this.telemetryClient.submitVmErrors(LOGS_DIR);
        }
        ReflectUtil.queueInjectorAnnotationCacheInvalidation(injector);
        ReflectUtil.invalidateAnnotationCaches();
    }

    private void setWorld(String cliWorld) {
        World actual;
        WorldResult worldResult = this.worldService.getWorlds();
        if (worldResult == null) {
            log.warn("Failed to lookup worlds.");
            return;
        }
        if (cliWorld.equals("f2p")) {
            List collect = worldResult.getWorlds().stream().filter(w -> !w.getTypes().contains(WorldType.MEMBERS)).collect(Collectors.toList());
            actual = (World)collect.get(Rand.nextInt(0, collect.size()));
        } else if (cliWorld.equals("p2p")) {
            List collect = worldResult.getWorlds().stream().filter(w -> w.getTypes().contains(WorldType.MEMBERS)).collect(Collectors.toList());
            actual = (World)collect.get(Rand.nextInt(0, collect.size()));
        } else {
            int correctedWorld;
            int parsed = Integer.parseInt(cliWorld);
            int n = correctedWorld = parsed < 300 ? parsed + 300 : parsed;
            if (correctedWorld <= 300 || this.client.getWorld() == correctedWorld) {
                return;
            }
            actual = worldResult.findWorld(correctedWorld);
        }
        World world = actual;
        if (world != null) {
            net.runelite.api.World rsWorld = this.client.createWorld();
            rsWorld.setActivity(world.getActivity());
            rsWorld.setAddress(world.getAddress());
            rsWorld.setId(world.getId());
            rsWorld.setPlayerCount(world.getPlayers());
            rsWorld.setLocation(world.getLocation());
            rsWorld.setTypes(WorldUtil.toWorldTypes(world.getTypes()));
            this.client.changeWorld(rsWorld);
            log.debug("Applied new world {}", (Object)world.getId());
        } else {
            log.warn("World {} not found.", (Object)cliWorld);
        }
    }

    private void setupSystemProps() {
        if (this.runtimeConfig == null || this.runtimeConfig.getSysProps() == null) {
            return;
        }
        for (Map.Entry<String, String> entry : this.runtimeConfig.getSysProps().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            log.debug("Setting property {}={}", (Object)key, (Object)value);
            System.setProperty(key, value);
        }
    }

    public static Injector getInjector() {
        return injector;
    }

    static {
        System.setProperty("sun.java2d.uiScale", "1.0");
        String launcherVersion = System.getProperty("launcher.version");
        System.setProperty("runelite.launcher.version", launcherVersion == null ? "unknown" : launcherVersion);
    }

    private static class ConfigFileConverter
    implements ValueConverter<File> {
        private ConfigFileConverter() {
        }

        @Override
        public File convert(String fileName) {
            File file = Paths.get(fileName, new String[0]).isAbsolute() || fileName.startsWith("./") || fileName.startsWith(".\\") ? new File(fileName) : new File(RUNELITE_DIR, fileName);
            if (!(!file.exists() || file.isFile() && file.canWrite())) {
                throw new ValueConversionException(String.format("File %s is not accessible", file.getAbsolutePath()));
            }
            return file;
        }

        @Override
        public Class<? extends File> valueType() {
            return File.class;
        }

        @Override
        public String valuePattern() {
            return null;
        }
    }
}

