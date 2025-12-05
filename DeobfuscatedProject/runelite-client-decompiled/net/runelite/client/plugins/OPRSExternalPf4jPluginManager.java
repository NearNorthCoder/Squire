/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pf4j.CompoundPluginLoader
 *  org.pf4j.CompoundPluginRepository
 *  org.pf4j.DefaultPluginManager
 *  org.pf4j.DependencyResolver$CyclicDependencyException
 *  org.pf4j.DependencyResolver$DependenciesNotFoundException
 *  org.pf4j.DependencyResolver$DependenciesWrongVersionException
 *  org.pf4j.DependencyResolver$Result
 *  org.pf4j.DevelopmentPluginRepository
 *  org.pf4j.JarPluginRepository
 *  org.pf4j.ManifestPluginDescriptorFinder
 *  org.pf4j.Plugin
 *  org.pf4j.PluginAlreadyLoadedException
 *  org.pf4j.PluginClasspath
 *  org.pf4j.PluginDependency
 *  org.pf4j.PluginDescriptor
 *  org.pf4j.PluginDescriptorFinder
 *  org.pf4j.PluginLoader
 *  org.pf4j.PluginManager
 *  org.pf4j.PluginRepository
 *  org.pf4j.PluginRuntimeException
 *  org.pf4j.PluginState
 *  org.pf4j.PluginStateEvent
 *  org.pf4j.PluginWrapper
 *  org.pf4j.RuntimeMode
 */
package net.runelite.client.plugins;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import com.openosrs.client.OpenOSRS;
import java.io.Closeable;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.runelite.client.plugins.MissingDependenciesException;
import net.runelite.client.plugins.OPRSExternalBasePluginLoader;
import net.runelite.client.plugins.OPRSExternalJarPluginLoader;
import net.runelite.client.plugins.OPRSExternalPluginClasspath;
import net.runelite.client.plugins.OPRSExternalPluginFileFilter;
import net.runelite.client.plugins.OPRSExternalPluginManager;
import org.pf4j.CompoundPluginLoader;
import org.pf4j.CompoundPluginRepository;
import org.pf4j.DefaultPluginManager;
import org.pf4j.DependencyResolver;
import org.pf4j.DevelopmentPluginRepository;
import org.pf4j.JarPluginRepository;
import org.pf4j.ManifestPluginDescriptorFinder;
import org.pf4j.Plugin;
import org.pf4j.PluginAlreadyLoadedException;
import org.pf4j.PluginClasspath;
import org.pf4j.PluginDependency;
import org.pf4j.PluginDescriptor;
import org.pf4j.PluginDescriptorFinder;
import org.pf4j.PluginLoader;
import org.pf4j.PluginManager;
import org.pf4j.PluginRepository;
import org.pf4j.PluginRuntimeException;
import org.pf4j.PluginState;
import org.pf4j.PluginStateEvent;
import org.pf4j.PluginWrapper;
import org.pf4j.RuntimeMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class OPRSExternalPf4jPluginManager
extends DefaultPluginManager {
    private static final Logger log = LoggerFactory.getLogger(OPRSExternalPf4jPluginManager.class);
    private final Set<String> disabledPlugins = new HashSet<String>();

    public OPRSExternalPf4jPluginManager() {
        super(new Path[]{OpenOSRS.EXTERNALPLUGIN_DIR.toPath()});
    }

    protected PluginDescriptorFinder createPluginDescriptorFinder() {
        return new ManifestPluginDescriptorFinder(){

            protected Path getManifestPath(Path pluginPath) {
                if (OPRSExternalPf4jPluginManager.this.isDevelopment()) {
                    return pluginPath.resolve("build/tmp/jar/MANIFEST.MF");
                }
                return super.getManifestPath(pluginPath);
            }
        };
    }

    protected PluginRepository createPluginRepository() {
        CompoundPluginRepository compoundPluginRepository = new CompoundPluginRepository();
        if (this.isNotDevelopment()) {
            JarPluginRepository jarPluginRepository = new JarPluginRepository(new Path[]{this.getPluginsRoot()});
            compoundPluginRepository.add((PluginRepository)jarPluginRepository);
        }
        if (this.isDevelopment()) {
            for (String developmentPluginPath : OpenOSRS.getPluginDevelopmentPath()) {
                DevelopmentPluginRepository developmentPluginRepository = new DevelopmentPluginRepository(new Path[]{Paths.get(developmentPluginPath, new String[0])}){

                    public boolean deletePluginPath(Path pluginPath) {
                        return this.filter.accept(pluginPath.toFile());
                    }
                };
                developmentPluginRepository.setFilter((FileFilter)new OPRSExternalPluginFileFilter());
                compoundPluginRepository.add((PluginRepository)developmentPluginRepository);
            }
        }
        return compoundPluginRepository;
    }

    protected PluginLoader createPluginLoader() {
        return new CompoundPluginLoader().add((PluginLoader)new OPRSExternalBasePluginLoader((PluginManager)this, (PluginClasspath)new OPRSExternalPluginClasspath()), () -> ((OPRSExternalPf4jPluginManager)this).isDevelopment()).add((PluginLoader)new OPRSExternalJarPluginLoader((PluginManager)this), () -> ((OPRSExternalPf4jPluginManager)this).isNotDevelopment());
    }

    public void loadPlugins() {
        for (Path path : this.pluginsRoots) {
            if (!Files.notExists(path, new LinkOption[0]) && Files.isDirectory(path, new LinkOption[0])) continue;
            log.warn("No '{}' root", (Object)path);
            return;
        }
        List pluginPaths = this.pluginRepository.getPluginPaths();
        Collections.reverse(pluginPaths);
        if (pluginPaths.isEmpty()) {
            log.warn("No plugins");
            return;
        }
        log.debug("Found {} possible plugins: {}", (Object)pluginPaths.size(), (Object)pluginPaths);
        HashSet<String> duplicatePlugins = new HashSet<String>();
        for (Path pluginPath : pluginPaths) {
            try {
                if (!this.isPluginEligibleForLoading(pluginPath) && this.isNotDevelopment()) continue;
                this.loadPluginFromPath(pluginPath);
            }
            catch (PluginRuntimeException e) {
                if (e instanceof PluginAlreadyLoadedException) continue;
                if (!OPRSExternalPluginManager.isDevelopmentMode()) {
                    String plugin = pluginPath.toString().substring(((Path)this.pluginsRoots.get(0)).toString().length() + 1);
                    duplicatePlugins.add(plugin);
                }
                log.error("Could not load plugin {}", (Object)pluginPath, (Object)e);
            }
        }
        if (!duplicatePlugins.isEmpty()) {
            log.error("Duplicate plugins detected: {}", (Object)String.join((CharSequence)", ", duplicatePlugins));
            String formatted = String.join((CharSequence)"\n", duplicatePlugins);
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null, "You have duplicate plugins in your externalmanager.\nHaving duplicate plugins will result in an unstable\nexperience, It is highly recommended to delete any\nduplicates, here is a list of the plugins.\n\n" + formatted, "Duplicate Plugins Detected", 2));
        }
        try {
            this.resolvePlugins();
        }
        catch (PluginRuntimeException e) {
            if (e instanceof DependencyResolver.DependenciesNotFoundException) {
                throw e;
            }
            log.error("Could not resolve plugins", e);
        }
    }

    protected void resolvePlugins() {
        ArrayList<PluginDescriptor> descriptors = new ArrayList<PluginDescriptor>();
        Multimap reverseDepMap = MultimapBuilder.hashKeys().hashSetValues().build();
        for (PluginWrapper plugin : this.plugins.values()) {
            descriptors.add(plugin.getDescriptor());
            for (PluginDependency dependency : plugin.getDescriptor().getDependencies()) {
                reverseDepMap.put(dependency.getPluginId(), plugin.getPluginId());
            }
        }
        for (PluginWrapper plugin : this.resolvedPlugins) {
            descriptors.add(plugin.getDescriptor());
            for (PluginDependency dependency : plugin.getDescriptor().getDependencies()) {
                reverseDepMap.put(dependency.getPluginId(), plugin.getPluginId());
            }
        }
        DependencyResolver.Result result = this.dependencyResolver.resolve(descriptors);
        if (result.hasCyclicDependency()) {
            throw new DependencyResolver.CyclicDependencyException();
        }
        List notFoundDependencies = result.getNotFoundDependencies();
        if (!notFoundDependencies.isEmpty()) {
            throw new MissingDependenciesException(notFoundDependencies, reverseDepMap);
        }
        List wrongVersionDependencies = result.getWrongVersionDependencies();
        if (!wrongVersionDependencies.isEmpty()) {
            throw new DependencyResolver.DependenciesWrongVersionException(wrongVersionDependencies);
        }
        List sortedPlugins = result.getSortedPlugins();
        for (String pluginId : sortedPlugins) {
            PluginWrapper pluginWrapper = (PluginWrapper)this.plugins.get(pluginId);
            if (this.resolvedPlugins.contains(pluginWrapper) || !this.unresolvedPlugins.remove(pluginWrapper)) continue;
            PluginState pluginState = pluginWrapper.getPluginState();
            if (pluginState != PluginState.DISABLED) {
                pluginWrapper.setPluginState(PluginState.RESOLVED);
            }
            this.resolvedPlugins.add(pluginWrapper);
            this.firePluginStateEvent(new PluginStateEvent((PluginManager)this, pluginWrapper, pluginState));
        }
    }

    public RuntimeMode getRuntimeMode() {
        return OPRSExternalPluginManager.isDevelopmentMode() ? RuntimeMode.DEVELOPMENT : RuntimeMode.DEPLOYMENT;
    }

    public PluginState stopPlugin(String pluginId) {
        if (!this.plugins.containsKey(pluginId)) {
            throw new IllegalArgumentException(String.format("Unknown pluginId %s", pluginId));
        }
        PluginWrapper pluginWrapper = this.getPlugin(pluginId);
        PluginDescriptor pluginDescriptor = pluginWrapper.getDescriptor();
        PluginState pluginState = pluginWrapper.getPluginState();
        if (PluginState.STOPPED == pluginState) {
            log.debug("Already stopped plugin '{}'", (Object)this.getPluginLabel(pluginDescriptor));
            return PluginState.STOPPED;
        }
        if (PluginState.DISABLED == pluginState) {
            return pluginState;
        }
        pluginWrapper.getPlugin().stop();
        pluginWrapper.setPluginState(PluginState.STOPPED);
        this.startedPlugins.remove(pluginWrapper);
        this.firePluginStateEvent(new PluginStateEvent((PluginManager)this, pluginWrapper, pluginState));
        return pluginWrapper.getPluginState();
    }

    public boolean unloadPlugin(String pluginId) {
        try {
            ClassLoader classLoader;
            PluginState pluginState = this.stopPlugin(pluginId);
            if (PluginState.STARTED == pluginState) {
                return false;
            }
            PluginWrapper pluginWrapper = this.getPlugin(pluginId);
            this.plugins.remove(pluginId);
            this.getResolvedPlugins().remove(pluginWrapper);
            this.firePluginStateEvent(new PluginStateEvent((PluginManager)this, pluginWrapper, pluginState));
            Map pluginClassLoaders = this.getPluginClassLoaders();
            if (pluginClassLoaders.containsKey(pluginId) && (classLoader = (ClassLoader)pluginClassLoaders.remove(pluginId)) instanceof Closeable) {
                try {
                    ((Closeable)((Object)classLoader)).close();
                }
                catch (IOException e) {
                    throw new PluginRuntimeException((Throwable)e, "Cannot close classloader", new Object[0]);
                }
            }
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public boolean deletePlugin(String pluginId) {
        if (!this.plugins.containsKey(pluginId)) {
            throw new IllegalArgumentException(String.format("Unknown pluginId %s", pluginId));
        }
        PluginWrapper pluginWrapper = this.getPlugin(pluginId);
        PluginState pluginState = this.stopPlugin(pluginId);
        if (PluginState.STARTED == pluginState) {
            log.error("Failed to stop plugin '{}' on delete", (Object)pluginId);
            return false;
        }
        Plugin plugin = pluginWrapper.getPlugin();
        if (!this.unloadPlugin(pluginId)) {
            log.error("Failed to unload plugin '{}' on delete", (Object)pluginId);
            return false;
        }
        plugin.delete();
        Path pluginPath = pluginWrapper.getPluginPath();
        return this.pluginRepository.deletePluginPath(pluginPath);
    }

    protected PluginWrapper loadPluginFromPath(Path pluginPath) {
        String pluginId = this.idForPath(pluginPath);
        if (pluginId != null) {
            throw new PluginAlreadyLoadedException(pluginId, pluginPath);
        }
        PluginDescriptorFinder pluginDescriptorFinder = this.getPluginDescriptorFinder();
        log.debug("Use '{}' to find plugins descriptors", (Object)pluginDescriptorFinder);
        log.debug("Finding plugin descriptor for plugin '{}'", (Object)pluginPath);
        PluginDescriptor pluginDescriptor = pluginDescriptorFinder.find(pluginPath);
        if (pluginDescriptor.getPluginId().startsWith("squire")) {
            return null;
        }
        this.validatePluginDescriptor(pluginDescriptor);
        if (this.disabledPlugins.contains(pluginDescriptor.getPluginId())) {
            log.debug("Skipping loading {}, was previously disabled.", (Object)pluginDescriptor.getPluginId());
            return null;
        }
        pluginId = pluginDescriptor.getPluginId();
        if (this.plugins.containsKey(pluginId)) {
            PluginWrapper loadedPlugin = this.getPlugin(pluginId);
            throw new PluginRuntimeException("There is an already loaded plugin ({}) with the same id ({}) as the plugin at path '{}'. Simultaneous loading of plugins with the same PluginId is not currently supported.\nAs a workaround you may include PluginVersion and PluginProvider in PluginId.", new Object[]{loadedPlugin, pluginId, pluginPath});
        }
        log.debug("Found descriptor {}", (Object)pluginDescriptor);
        String pluginClassName = pluginDescriptor.getPluginClass();
        log.debug("Class '{}' for plugin '{}'", (Object)pluginClassName, (Object)pluginPath);
        log.debug("Loading plugin '{}'", (Object)pluginPath);
        ClassLoader pluginClassLoader = this.getPluginLoader().loadPlugin(pluginPath, pluginDescriptor);
        log.debug("Loaded plugin '{}' with class loader '{}'", (Object)pluginPath, (Object)pluginClassLoader);
        log.debug("Creating wrapper for plugin '{}'", (Object)pluginPath);
        PluginWrapper pluginWrapper = new PluginWrapper((PluginManager)this, pluginDescriptor, pluginPath, pluginClassLoader);
        pluginWrapper.setPluginFactory(this.getPluginFactory());
        if (this.isPluginDisabled(pluginDescriptor.getPluginId())) {
            log.info("Plugin '{}' is disabled", (Object)pluginPath);
            pluginWrapper.setPluginState(PluginState.DISABLED);
        }
        if (!this.isPluginValid(pluginWrapper)) {
            log.warn("Plugin '{}' is invalid and it will be disabled", (Object)pluginPath);
            pluginWrapper.setPluginState(PluginState.DISABLED);
        }
        log.debug("Created wrapper '{}' for plugin '{}'", (Object)pluginWrapper, (Object)pluginPath);
        pluginId = pluginDescriptor.getPluginId();
        this.plugins.put(pluginId, pluginWrapper);
        this.getUnresolvedPlugins().add(pluginWrapper);
        this.getPluginClassLoaders().put(pluginId, pluginClassLoader);
        return pluginWrapper;
    }

    void disableLoading(String pluginId) {
        this.unloadPlugin(pluginId);
        this.disabledPlugins.add(pluginId);
    }

    private boolean isPluginEligibleForLoading(Path path) {
        return path.toFile().getName().endsWith(".jar") && !path.toFile().getName().startsWith("squire");
    }
}

