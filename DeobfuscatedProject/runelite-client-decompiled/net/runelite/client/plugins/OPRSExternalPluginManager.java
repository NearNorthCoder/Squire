/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.CreationException
 *  com.google.inject.Injector
 *  com.google.inject.Key
 *  com.google.inject.Module
 *  javax.inject.Inject
 *  javax.inject.Named
 *  javax.inject.Singleton
 *  org.jgroups.Message
 *  org.pf4j.DefaultPluginManager
 *  org.pf4j.DependencyResolver$DependenciesNotFoundException
 *  org.pf4j.PluginDependency
 *  org.pf4j.PluginManager
 *  org.pf4j.PluginRuntimeException
 *  org.pf4j.PluginWrapper
 *  org.pf4j.update.PluginInfo
 *  org.pf4j.update.PluginInfo$PluginRelease
 *  org.pf4j.update.VerifyException
 */
package net.runelite.client.plugins;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import com.google.inject.CreationException;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.openosrs.client.OpenOSRS;
import com.openosrs.client.config.OpenOSRSConfig;
import com.openosrs.client.events.OPRSPluginChanged;
import com.openosrs.client.events.OPRSRepositoryChanged;
import com.openosrs.client.ui.OpenOSRSSplashScreen;
import com.openosrs.client.util.Groups;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.swing.JOptionPane;
import net.runelite.client.RuneLite;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.ExternalPluginsChanged;
import net.runelite.client.plugins.MissingDependenciesException;
import net.runelite.client.plugins.OPRSExternalPf4jPluginManager;
import net.runelite.client.plugins.OPRSUpdateManager;
import net.runelite.client.plugins.OPRSUpdateRepository;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.util.SwingUtil;
import net.unethicalite.client.Static;
import net.unethicalite.client.plugins.PrivateUpdateRepository;
import org.jgroups.Message;
import org.pf4j.DefaultPluginManager;
import org.pf4j.DependencyResolver;
import org.pf4j.PluginRuntimeException;
import org.pf4j.PluginWrapper;
import org.pf4j.update.PluginInfo;
import org.pf4j.update.VerifyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class OPRSExternalPluginManager {
    private static final Logger log = LoggerFactory.getLogger(OPRSExternalPluginManager.class);
    public static final String DEFAULT_PLUGIN_REPOS = "";
    static final String DEVELOPMENT_MANIFEST_PATH = "build/tmp/jar/MANIFEST.MF";
    public static ArrayList<ClassLoader> pluginClassLoaders = new ArrayList();
    @Inject
    private PluginManager runelitePluginManager;
    private org.pf4j.PluginManager externalPluginManager;
    private final List<OPRSUpdateRepository> repositories = new ArrayList<OPRSUpdateRepository>();
    @Inject
    private OpenOSRSConfig openOSRSConfig;
    @Inject
    private EventBus eventBus;
    @Inject
    private ExecutorService executorService;
    @Inject
    private ConfigManager configManager;
    private final Map<String, String> pluginsMap = new HashMap<String, String>();
    private static final boolean developmentMode = OpenOSRS.getPluginDevelopmentPath().length > 0;
    private final Map<String, Map<String, String>> pluginsInfoMap = new HashMap<String, Map<String, String>>();
    @Inject
    private Groups groups;
    private OPRSUpdateManager updateManager;
    @Inject
    @Named(value="safeMode")
    private boolean safeMode;
    boolean isOutdated;

    public void setupInstance() {
        OpenOSRS.EXTERNALPLUGIN_DIR.mkdirs();
        this.initPluginManager();
        if (!this.groups.init()) {
            this.groups = null;
        } else {
            this.groups.getMessageStringSubject().subscribe(this::receive);
        }
    }

    private void initPluginManager() {
        this.externalPluginManager = new OPRSExternalPf4jPluginManager();
        this.externalPluginManager.setSystemVersion(OpenOSRS.SYSTEM_API_VERSION);
    }

    public boolean doesGhRepoExist(String owner, String name) {
        return this.doesRepoExist("gh:" + owner + "/" + name);
    }

    public boolean doesRepoExist(String id) {
        return this.repositories.stream().anyMatch(repo -> repo.getId().equals(id));
    }

    private static URL toRepositoryUrl(String owner, String name) throws MalformedURLException {
        return new URL("https://raw.githubusercontent.com/" + owner + "/" + name + "/master/");
    }

    public static boolean testGHRepository(String owner, String name, String token) {
        try {
            return OPRSExternalPluginManager.testRepository(OPRSExternalPluginManager.toRepositoryUrl(owner, name), token);
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean testRepository(URL url, String token) {
        return OPRSExternalPluginManager.testRepository(url, null, token);
    }

    public static boolean testRepository(URL url, String pluginsJson, String token) {
        ArrayList<OPRSUpdateRepository> repositories = new ArrayList<OPRSUpdateRepository>();
        if (pluginsJson != null) {
            if (token.isEmpty()) {
                repositories.add(new OPRSUpdateRepository("repository-testing", url, pluginsJson));
            } else {
                repositories.add(new PrivateUpdateRepository("repository-testing", url, pluginsJson, token));
            }
        } else if (token.isEmpty()) {
            repositories.add(new OPRSUpdateRepository("repository-testing", url));
        } else {
            repositories.add(new PrivateUpdateRepository("repository-testing", url, token));
        }
        DefaultPluginManager testPluginManager = new DefaultPluginManager(new Path[]{OpenOSRS.EXTERNALPLUGIN_DIR.toPath()});
        OPRSUpdateManager updateManager = new OPRSUpdateManager((org.pf4j.PluginManager)testPluginManager, repositories);
        return updateManager.getPlugins().size() <= 0;
    }

    public static <T> Predicate<T> not(Predicate<T> t) {
        return t.negate();
    }

    public void startExternalPluginManager() {
        try {
            List.copyOf(this.repositories).forEach(repo -> {
                if (Static.getPluginRepoManager().isRepoMalicious(repo.getOwner())) {
                    this.repositories.removeIf(x -> x.getOwner().equals(repo.getOwner()));
                    this.removeRepository(repo.getOwner());
                }
            });
            this.externalPluginManager.loadPlugins();
        }
        catch (Exception ex) {
            if (ex instanceof MissingDependenciesException) {
                List deps = ((MissingDependenciesException)((Object)ex)).getDependencies();
                Multimap<String, String> reverseDepMap = ((MissingDependenciesException)((Object)ex)).getReverseDependencyMap();
                for (String dependency : deps) {
                    Collection<String> dependentPlugins = reverseDepMap.get(dependency);
                    log.error("Dependency {} is missing, but is required by {}, attempting install.", (Object)dependency, (Object)dependentPlugins);
                    try {
                        this.updateManager.installPlugin(dependency, null);
                    }
                    catch (PluginRuntimeException ex2) {
                        log.error("Dependency {} is missing and couldn't be installed. Disabling loading of {} as they depend on it.", (Object)dependency, (Object)dependentPlugins);
                        dependentPlugins.forEach(s -> ((OPRSExternalPf4jPluginManager)this.externalPluginManager).disableLoading((String)s));
                    }
                }
                this.startExternalPluginManager();
            }
            log.error("Could not load plugins", ex);
        }
    }

    public void startExternalUpdateManager() {
        if (!this.tryLoadNewFormat()) {
            log.debug("Load new format failed.");
            this.loadOldFormat();
        }
        this.updateManager = new OPRSUpdateManager(this.externalPluginManager, this.repositories);
        this.saveConfig();
    }

    public boolean tryLoadNewFormat() {
        try {
            this.duplicateCheck();
            log.debug("Trying to load new format: {}", (Object)this.openOSRSConfig.getExternalRepositories());
            this.repositories.clear();
            for (String keyval : this.openOSRSConfig.getExternalRepositories().split(";")) {
                String[] split = keyval.split("\\|");
                if (split.length != 2 && split.length != 3) {
                    log.debug("Split length invalid: {}", (Object)keyval);
                    this.repositories.clear();
                    return false;
                }
                Object id = split[0];
                String url = split[1];
                String token = DEFAULT_PLUGIN_REPOS;
                if (split.length == 3) {
                    token = split[2];
                }
                if (!url.endsWith("/")) {
                    url = url.concat("/");
                }
                if (((String)id).contains("https://raw.githubusercontent.com/") && ((String)(id = "gh:" + ((String)id).substring(((String)id).indexOf("https://raw.githubusercontent.com/")).replace("/main", DEFAULT_PLUGIN_REPOS).replace("https://raw.githubusercontent.com/", DEFAULT_PLUGIN_REPOS))).endsWith("/")) {
                    id = ((String)id).substring(0, ((String)id).lastIndexOf("/"));
                }
                String pluginJson = null;
                if (url.contains(".json")) {
                    url = url.replace(".json/", ".json");
                    URL urlObj = new URL(url);
                    String urlPath = urlObj.getPath();
                    pluginJson = urlPath.substring(urlPath.lastIndexOf(47) + 1);
                }
                if (pluginJson == null) {
                    if (token.isEmpty()) {
                        this.repositories.add(new OPRSUpdateRepository((String)id, new URL(url)));
                        continue;
                    }
                    this.repositories.add(new PrivateUpdateRepository((String)id, new URL(url), token));
                    continue;
                }
                if (token.isEmpty()) {
                    this.repositories.add(new OPRSUpdateRepository((String)id, new URL(url), pluginJson));
                    continue;
                }
                this.repositories.add(new PrivateUpdateRepository((String)id, new URL(url), pluginJson, token));
            }
        }
        catch (ArrayIndexOutOfBoundsException | MalformedURLException e) {
            log.error("Error in new format", e);
            this.repositories.clear();
            return false;
        }
        return true;
    }

    public void loadOldFormat() {
        try {
            log.debug("Loading old format.");
            this.repositories.clear();
            for (String keyval : this.openOSRSConfig.getExternalRepositories().split(";")) {
                log.debug("KeyVal: {}", (Object)keyval);
                if (keyval.isBlank()) continue;
                String[] split = keyval.split("\\|");
                String id = split[0];
                String url = split[1];
                String token = DEFAULT_PLUGIN_REPOS;
                if (split.length == 3) {
                    token = split[2];
                }
                OPRSUpdateRepository defaultRepo = token.isEmpty() ? new OPRSUpdateRepository(id, new URL(url)) : new PrivateUpdateRepository(id, new URL(url), token);
                this.repositories.add(defaultRepo);
                log.debug("Added Repo: {}", (Object)defaultRepo.getUrl());
            }
        }
        catch (MalformedURLException e) {
            log.error("Old repository format contained malformed url", e);
        }
        catch (StringIndexOutOfBoundsException e) {
            log.error("Error loading external repositories. They have been reset.");
            this.openOSRSConfig.setExternalRepositories(DEFAULT_PLUGIN_REPOS);
        }
        this.updateManager = new OPRSUpdateManager(this.externalPluginManager, this.repositories);
    }

    public void addGHRepository(String owner, String name, String token) {
        try {
            this.addRepository("gh:" + owner + "/" + name, OPRSExternalPluginManager.toRepositoryUrl(owner, name), token);
        }
        catch (MalformedURLException e) {
            log.error("GitHub repostitory could not be added (owner={}, name={})", owner, name, e);
        }
    }

    public void addRepository(String key, URL url, String token) {
        this.addRepository(key, url, null, token);
    }

    public void addRepository(String key, URL url, String pluginsJson, String token) {
        OPRSUpdateRepository repository = pluginsJson != null ? (token.isEmpty() ? new OPRSUpdateRepository(key, url, pluginsJson) : new PrivateUpdateRepository(key, url, pluginsJson, token)) : (token.isEmpty() ? new OPRSUpdateRepository(key, url) : new PrivateUpdateRepository(key, url, token));
        this.updateManager.addRepository(repository);
        this.eventBus.post(new OPRSRepositoryChanged(key, true));
        this.saveConfig();
    }

    public void removeRepository(String owner) {
        this.updateManager.removeRepository(owner);
        this.eventBus.post(new OPRSRepositoryChanged(owner, false));
        this.saveConfig();
    }

    private void saveConfig() {
        String config = this.updateManager.getRepositories().stream().map(r -> {
            if (r instanceof PrivateUpdateRepository) {
                return r.getId() + "|" + OPRSExternalPluginManager.urlToStringEncoded(r.getUrl()) + "|" + ((PrivateUpdateRepository)r).getToken();
            }
            return r.getId() + "|" + OPRSExternalPluginManager.urlToStringEncoded(r.getUrl());
        }).collect(Collectors.joining(";"));
        this.openOSRSConfig.setExternalRepositories(config);
    }

    public void setWarning(boolean val) {
        this.configManager.setConfiguration("openosrs", "warning", val);
    }

    public boolean getWarning() {
        return this.openOSRSConfig.warning();
    }

    private void duplicateCheck() {
        String[] split = this.openOSRSConfig.getExternalRepositories().split(";");
        if (split.length <= 0) {
            return;
        }
        HashSet<String> strings = new HashSet<String>();
        boolean duplicates = false;
        for (String s : split) {
            if (strings.contains(s)) {
                log.error("Duplicate Repo: {}", (Object)s);
                duplicates = true;
                continue;
            }
            strings.add(s);
        }
        if (!duplicates) {
            log.debug("No duplicates found.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(string);
            sb.append(";");
        }
        sb.deleteCharAt(sb.lastIndexOf(";"));
        String duplicateFix = sb.toString();
        log.debug("Duplicate Repos detected, setting them to: {}", (Object)duplicateFix);
        this.openOSRSConfig.setExternalRepositories(duplicateFix);
    }

    private void scanAndInstantiate(List<Plugin> plugins, boolean init, boolean initConfig) {
        OpenOSRSSplashScreen.stage(0.66, "Loading external plugins");
        MutableGraph graph = GraphBuilder.directed().build();
        for (Plugin plugin : plugins) {
            PluginDescriptor pluginDescriptor;
            Class<?> clazz;
            block9: {
                clazz = plugin.getClass();
                pluginDescriptor = clazz.getAnnotation(PluginDescriptor.class);
                try {
                    if (pluginDescriptor == null) {
                        if (!Plugin.class.isAssignableFrom(clazz)) continue;
                        log.warn("Class {} is a plugin, but has no plugin descriptor", (Object)clazz);
                        continue;
                    }
                    if (!Plugin.class.isAssignableFrom(clazz)) {
                        log.warn("Class {} has plugin descriptor, but is not a plugin", (Object)clazz);
                    }
                    break block9;
                }
                catch (EnumConstantNotPresentException e) {
                    log.warn("{} has an invalid plugin type of {}", (Object)clazz, (Object)e.getMessage());
                }
                continue;
            }
            if (!pluginDescriptor.loadWhenOutdated() && this.isOutdated) continue;
            if (this.safeMode && !pluginDescriptor.loadInSafeMode()) {
                log.debug("Disabling {} due to safe mode", (Object)clazz);
                this.configManager.unsetConfiguration("runelite", clazz.getSimpleName().toLowerCase());
                continue;
            }
            Class<?> pluginClass = clazz;
            graph.addNode(pluginClass);
        }
        for (Class pluginClazz : graph.nodes()) {
            PluginDependency[] pluginDependencies;
            for (PluginDependency pluginDependency : pluginDependencies = (PluginDependency[])pluginClazz.getAnnotationsByType(PluginDependency.class)) {
                if (!graph.nodes().contains(pluginDependency.value())) continue;
                graph.putEdge(pluginClazz, pluginDependency.value());
            }
        }
        if (Graphs.hasCycle(graph)) {
            throw new RuntimeException("Plugin dependency graph contains a cycle!");
        }
        List sortedPlugins = PluginManager.topologicalGroupSort(graph);
        sortedPlugins = Lists.reverse(sortedPlugins);
        AtomicInteger loaded = new AtomicInteger();
        long start = System.currentTimeMillis();
        CopyOnWriteArrayList scannedPlugins = new CopyOnWriteArrayList();
        sortedPlugins.forEach(group -> {
            ArrayList curGroup = new ArrayList();
            group.forEach(pluginClazz -> curGroup.add(this.executorService.submit(() -> {
                try {
                    Plugin plugininst = this.instantiate(scannedPlugins, (Class<Plugin>)pluginClazz, init, initConfig);
                    if (plugininst == null) {
                        return;
                    }
                    scannedPlugins.add(plugininst);
                }
                catch (PluginInstantiationException e) {
                    log.warn("Error instantiating plugin!", e);
                    return;
                }
                loaded.getAndIncrement();
                OpenOSRSSplashScreen.stage(0.67, 0.75, "Loading external plugins", loaded.get(), scannedPlugins.size());
            })));
            curGroup.forEach(future -> {
                try {
                    future.get();
                }
                catch (InterruptedException | ExecutionException e) {
                    log.warn("Could not instantiate external plugin", e);
                }
            });
        });
        log.info("External plugin instantiation took {}ms", (Object)(System.currentTimeMillis() - start));
    }

    private Plugin instantiate(List<Plugin> scannedPlugins, Class<Plugin> clazz, boolean init, boolean initConfig) throws PluginInstantiationException {
        Plugin plugin;
        PluginDependency[] pluginDependencies = (PluginDependency[])clazz.getAnnotationsByType(PluginDependency.class);
        ArrayList<Plugin> deps = new ArrayList<Plugin>();
        for (PluginDependency pluginDependency : pluginDependencies) {
            Optional<Plugin> optional = Stream.concat(this.runelitePluginManager.getPlugins().stream(), scannedPlugins.stream()).filter(p -> p.getClass() == pluginDependency.value()).findFirst();
            if (optional.isEmpty()) {
                throw new PluginInstantiationException("Unmet dependency for " + clazz.getSimpleName() + ": " + pluginDependency.value().getSimpleName());
            }
            deps.add(optional.get());
        }
        log.info("Loading plugin {}", (Object)clazz.getSimpleName());
        try {
            plugin = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (ThreadDeath e) {
            throw e;
        }
        catch (Throwable ex) {
            throw new PluginInstantiationException(ex);
        }
        try {
            Injector parent = RuneLite.getInjector();
            if (deps.size() > 1) {
                ArrayList<Module> modules = new ArrayList<Module>(deps.size());
                for (Plugin plugin2 : deps) {
                    Module module = binder -> {
                        binder.bind(plugin2.getClass()).toInstance((Object)plugin2);
                        binder.install((Module)plugin2);
                    };
                    modules.add(module);
                }
                parent = parent.createChildInjector(modules);
            } else if (!deps.isEmpty()) {
                parent = ((Plugin)deps.get((int)0)).injector;
            }
            Module pluginModule = binder -> {
                binder.bind(clazz).toInstance((Object)plugin);
                binder.install((Module)plugin);
            };
            Injector pluginInjector = parent.createChildInjector(new Module[]{pluginModule});
            pluginInjector.injectMembers((Object)plugin);
            plugin.injector = pluginInjector;
            if (initConfig) {
                for (Key key : pluginInjector.getBindings().keySet()) {
                    Class type = key.getTypeLiteral().getRawType();
                    if (!Config.class.isAssignableFrom(type) || !type.getPackageName().startsWith(plugin.getClass().getPackageName())) continue;
                    Config config = (Config)pluginInjector.getInstance(key);
                    this.configManager.setDefaultConfiguration(config, false);
                }
            }
            if (init) {
                try {
                    SwingUtil.syncExec(() -> {
                        try {
                            this.runelitePluginManager.add(plugin);
                            this.runelitePluginManager.startPlugin(plugin);
                            this.eventBus.post(new OPRSPluginChanged(this.pluginsMap.get(plugin.getClass().getSimpleName()), plugin, true));
                        }
                        catch (PluginInstantiationException e) {
                            throw new RuntimeException(e);
                        }
                    });
                }
                catch (Exception exception) {
                    log.warn("unable to start plugin", exception);
                }
            } else {
                this.runelitePluginManager.add(plugin);
            }
        }
        catch (CreationException ex) {
            throw new PluginInstantiationException(ex);
        }
        catch (NoClassDefFoundError | NoSuchFieldError | NoSuchMethodError ex) {
            log.error("Plugin {} is outdated", (Object)clazz.getSimpleName(), (Object)ex);
            return null;
        }
        log.debug("Loaded plugin {}", (Object)clazz.getSimpleName());
        return plugin;
    }

    private void checkDepsAndStart(List<PluginWrapper> startedPlugins, List<Plugin> scannedPlugins, PluginWrapper pluginWrapper) {
        boolean depsLoaded = true;
        for (org.pf4j.PluginDependency dependency : pluginWrapper.getDescriptor().getDependencies()) {
            if (!startedPlugins.stream().noneMatch(pl -> pl.getPluginId().equals(dependency.getPluginId()))) continue;
            depsLoaded = false;
        }
        if (!depsLoaded) {
            return;
        }
        scannedPlugins.addAll(this.loadPlugin(pluginWrapper.getPluginId()));
    }

    public void loadPlugins() {
        this.externalPluginManager.startPlugins();
        List<PluginWrapper> startedPlugins = this.getStartedPlugins();
        ArrayList<Plugin> scannedPlugins = new ArrayList<Plugin>();
        for (PluginWrapper plugin : startedPlugins) {
            this.checkDepsAndStart(startedPlugins, scannedPlugins, plugin);
        }
        this.scanAndInstantiate(scannedPlugins, false, false);
        if (this.groups != null && this.groups.getInstanceCount() > 1) {
            for (String pluginId : this.getDisabledPluginIds()) {
                this.groups.sendString("STOPEXTERNAL;" + pluginId);
            }
        } else {
            for (String pluginId : this.getDisabledPluginIds()) {
                this.externalPluginManager.enablePlugin(pluginId);
                this.externalPluginManager.deletePlugin(pluginId);
            }
        }
    }

    private List<Plugin> loadPlugin(final String pluginId) {
        ArrayList<Plugin> scannedPlugins = new ArrayList<Plugin>();
        try {
            List extensions = this.externalPluginManager.getExtensions(Plugin.class, pluginId);
            for (Plugin plugin : extensions) {
                pluginClassLoaders.add(plugin.getClass().getClassLoader());
                this.pluginsMap.remove(plugin.getClass().getSimpleName());
                this.pluginsMap.put(plugin.getClass().getSimpleName(), pluginId);
                this.pluginsInfoMap.remove(plugin.getClass().getSimpleName());
                final AtomicReference<String> support = new AtomicReference<String>(DEFAULT_PLUGIN_REPOS);
                this.updateManager.getRepositories().forEach(repository -> repository.getPlugins().forEach((key, value) -> {
                    if (key.equals(pluginId)) {
                        support.set(value.projectUrl);
                    }
                }));
                this.pluginsInfoMap.put(plugin.getClass().getSimpleName(), (Map<String, String>)new HashMap<String, String>(){
                    {
                        this.put("version", OPRSExternalPluginManager.this.externalPluginManager.getPlugin(pluginId).getDescriptor().getVersion());
                        this.put("id", OPRSExternalPluginManager.this.externalPluginManager.getPlugin(pluginId).getDescriptor().getPluginId());
                        this.put("provider", OPRSExternalPluginManager.this.externalPluginManager.getPlugin(pluginId).getDescriptor().getProvider());
                        this.put("support", (String)support.get());
                    }
                });
                scannedPlugins.add(plugin);
            }
        }
        catch (Throwable ex) {
            log.error("Plugin {} could not be loaded.", (Object)pluginId, (Object)ex);
        }
        return scannedPlugins;
    }

    private Path stopPlugin(String pluginId) {
        List<PluginWrapper> startedPlugins = List.copyOf(this.getStartedPlugins());
        for (PluginWrapper pluginWrapper : startedPlugins) {
            if (!pluginId.equals(pluginWrapper.getDescriptor().getPluginId())) continue;
            List extensions = this.externalPluginManager.getExtensions(Plugin.class, pluginId);
            for (Plugin plugin : this.runelitePluginManager.getPlugins()) {
                boolean found = false;
                for (Plugin extension : extensions) {
                    if (!extension.getClass().getName().equals(plugin.getClass().getName())) continue;
                    found = true;
                    break;
                }
                if (!found) continue;
                try {
                    SwingUtil.syncExec(() -> {
                        try {
                            this.runelitePluginManager.stopPlugin(plugin);
                        }
                        catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    });
                    this.runelitePluginManager.remove(plugin);
                    pluginClassLoaders.remove(plugin.getClass().getClassLoader());
                    this.eventBus.post(new OPRSPluginChanged(pluginId, plugin, false));
                    return pluginWrapper.getPluginPath();
                }
                catch (Exception ex) {
                    log.warn("unable to stop plugin", ex);
                    return null;
                }
            }
        }
        return null;
    }

    public boolean install(String pluginId) {
        if (this.getDisabledPluginIds().contains(pluginId)) {
            this.externalPluginManager.enablePlugin(pluginId);
            this.externalPluginManager.startPlugin(pluginId);
            if (this.groups != null) {
                this.groups.broadcastString("STARTEXTERNAL;" + pluginId);
            }
            this.scanAndInstantiate(this.loadPlugin(pluginId), true, false);
            ExternalPluginsChanged event = new ExternalPluginsChanged();
            this.eventBus.post(event);
            return true;
        }
        if (this.getStartedPlugins().stream().anyMatch(ev -> ev.getPluginId().equals(pluginId))) {
            return true;
        }
        try {
            if (!developmentMode) {
                PluginInfo.PluginRelease latest = this.updateManager.getLastPluginRelease(pluginId);
                if (latest == null) {
                    try {
                        SwingUtil.syncExec(() -> JOptionPane.showMessageDialog(ClientUI.getFrame(), pluginId + " is outdated and cannot be installed", "Installation error", 0));
                    }
                    catch (InterruptedException | InvocationTargetException ignored) {
                        return false;
                    }
                    return true;
                }
                this.updateManager.installPlugin(pluginId, null);
                this.scanAndInstantiate(this.loadPlugin(pluginId), true, true);
            } else {
                this.externalPluginManager.loadPlugins();
                this.externalPluginManager.startPlugin(pluginId);
            }
            ExternalPluginsChanged event = new ExternalPluginsChanged();
            this.eventBus.post(event);
            if (this.groups != null) {
                this.groups.broadcastString("STARTEXTERNAL;" + pluginId);
            }
        }
        catch (DependencyResolver.DependenciesNotFoundException ex) {
            this.uninstall(pluginId);
            for (String dep : ex.getDependencies()) {
                this.install(dep);
            }
            this.install(pluginId);
        }
        return false;
    }

    public boolean uninstall(String pluginId) {
        return this.uninstall(pluginId, false);
    }

    public boolean uninstall(String pluginId, boolean skip) {
        Path pluginPath = this.stopPlugin(pluginId);
        if (pluginPath == null) {
            return false;
        }
        this.externalPluginManager.stopPlugin(pluginId);
        if (skip) {
            return true;
        }
        if (this.groups != null && this.groups.getInstanceCount() > 1) {
            this.groups.sendString("STOPEXTERNAL;" + pluginId);
        } else {
            this.externalPluginManager.deletePlugin(pluginId);
        }
        return true;
    }

    public void update() {
        if (this.groups != null && this.groups.getInstanceCount() > 1) {
            log.info("Not updating external plugins since there is more than 1 client open");
            return;
        }
        if (developmentMode) {
            log.debug("Not updating because we're running in developer mode");
            return;
        }
        OpenOSRSSplashScreen.stage(0.59, "Updating external plugins");
        boolean error = false;
        if (this.updateManager.hasUpdates()) {
            List<PluginInfo> updates = this.updateManager.getUpdates();
            for (PluginInfo plugin : updates) {
                PluginInfo.PluginRelease lastRelease = this.updateManager.getLastPluginRelease(plugin.id);
                String lastVersion = lastRelease.version;
                try {
                    OpenOSRSSplashScreen.stage(0.59, "Updating " + plugin.id + " to version " + lastVersion);
                    boolean updated = this.updateManager.updatePlugin(plugin.id, lastVersion);
                    if (updated) continue;
                    log.warn("Cannot update plugin '{}'", (Object)plugin.id);
                    error = true;
                }
                catch (VerifyException ex) {
                    log.error("Cannot update plugin '{}', the SHA512 hash mismatches! {}", (Object)plugin.id, (Object)ex.getMessage());
                    error = true;
                    break;
                }
                catch (PluginRuntimeException ex) {
                    log.warn("Cannot update plugin '{}', the user probably has another client open", (Object)plugin.id);
                    log.error(String.valueOf((Object)ex));
                    error = true;
                    break;
                }
            }
        }
        if (error) {
            this.initPluginManager();
            this.startExternalUpdateManager();
            this.startExternalPluginManager();
        }
    }

    public Set<String> getDependencies() {
        HashSet<String> deps = new HashSet<String>();
        List<PluginWrapper> startedPlugins = this.getStartedPlugins();
        for (PluginWrapper pluginWrapper : startedPlugins) {
            for (org.pf4j.PluginDependency pluginDependency : pluginWrapper.getDescriptor().getDependencies()) {
                deps.add(pluginDependency.getPluginId());
            }
        }
        return deps;
    }

    public List<PluginWrapper> getDisabledPlugins() {
        return this.externalPluginManager.getResolvedPlugins().stream().filter(OPRSExternalPluginManager.not(this.externalPluginManager.getStartedPlugins()::contains)).collect(Collectors.toList());
    }

    public List<String> getDisabledPluginIds() {
        return this.getDisabledPlugins().stream().map(PluginWrapper::getPluginId).collect(Collectors.toList());
    }

    public List<PluginWrapper> getStartedPlugins() {
        return this.externalPluginManager.getStartedPlugins();
    }

    public Boolean reloadStart(String pluginId) {
        this.externalPluginManager.loadPlugins();
        this.externalPluginManager.startPlugin(pluginId);
        List<PluginWrapper> startedPlugins = List.copyOf(this.getStartedPlugins());
        List<PluginWrapper> disabledPlugins = List.copyOf(this.getDisabledPlugins());
        List<PluginWrapper> combinedList = Stream.of(startedPlugins, disabledPlugins).flatMap(Collection::stream).collect(Collectors.toList());
        ArrayList<Plugin> scannedPlugins = new ArrayList<Plugin>();
        for (PluginWrapper pluginWrapper : combinedList) {
            if (!pluginId.equals(pluginWrapper.getDescriptor().getPluginId())) continue;
            this.checkDepsAndStart(combinedList, scannedPlugins, pluginWrapper);
        }
        this.scanAndInstantiate(scannedPlugins, true, false);
        if (this.groups != null) {
            this.groups.broadcastString("STARTEXTERNAL;" + pluginId);
        }
        return true;
    }

    public void receive(Message message) {
        if (message.getObject() instanceof ConfigChanged) {
            return;
        }
        if (this.groups == null) {
            return;
        }
        String[] messageObject = ((String)message.getObject()).split(";");
        if (messageObject.length < 2) {
            return;
        }
        String command = messageObject[0];
        String pluginId = messageObject[1];
        switch (command) {
            case "STARTEXTERNAL": {
                this.externalPluginManager.loadPlugins();
                this.externalPluginManager.startPlugin(pluginId);
                List<PluginWrapper> startedPlugins = List.copyOf(this.getStartedPlugins());
                ArrayList<Plugin> scannedPlugins = new ArrayList<Plugin>();
                for (PluginWrapper pluginWrapper : startedPlugins) {
                    if (!pluginId.equals(pluginWrapper.getDescriptor().getPluginId())) continue;
                    this.checkDepsAndStart(startedPlugins, scannedPlugins, pluginWrapper);
                }
                this.scanAndInstantiate(scannedPlugins, true, false);
                break;
            }
            case "STOPEXTERNAL": {
                this.uninstall(pluginId, true);
                this.externalPluginManager.unloadPlugin(pluginId);
                this.groups.send(message.getSrc(), "STOPPEDEXTERNAL;" + pluginId);
                break;
            }
            case "STOPPEDEXTERNAL": {
                this.groups.getMessageMap().get(pluginId).remove(message.getSrc());
                if (this.groups.getMessageMap().get(pluginId).size() != 0) break;
                this.groups.getMessageMap().remove(pluginId);
                this.externalPluginManager.deletePlugin(pluginId);
            }
        }
    }

    private static String urlToStringEncoded(URL url) {
        String path = url.getPath() != null ? Stream.of(url.getPath().split("/")).map(s2 -> URLEncoder.encode(s2, StandardCharsets.UTF_8)).collect(Collectors.joining("/")) : DEFAULT_PLUGIN_REPOS;
        String s = url.getAuthority();
        Object object = s != null && s.length() > 0 ? "//" + s : DEFAULT_PLUGIN_REPOS;
        s = url.getQuery();
        Object object2 = s != null ? "?" + OPRSExternalPluginManager.urlEncode(s) : DEFAULT_PLUGIN_REPOS;
        s = url.getRef();
        return url.getProtocol() + ":" + (String)object + path + (String)object2 + (String)(s != null ? "#" + OPRSExternalPluginManager.urlEncode(s) : DEFAULT_PLUGIN_REPOS);
    }

    private static String urlEncode(String s) {
        return URLEncoder.encode(s, StandardCharsets.UTF_8);
    }

    public org.pf4j.PluginManager getExternalPluginManager() {
        return this.externalPluginManager;
    }

    public List<OPRSUpdateRepository> getRepositories() {
        return this.repositories;
    }

    public static boolean isDevelopmentMode() {
        return developmentMode;
    }

    public Map<String, Map<String, String>> getPluginsInfoMap() {
        return this.pluginsInfoMap;
    }

    public OPRSUpdateManager getUpdateManager() {
        return this.updateManager;
    }

    public void setOutdated(boolean isOutdated) {
        this.isOutdated = isOutdated;
    }
}

