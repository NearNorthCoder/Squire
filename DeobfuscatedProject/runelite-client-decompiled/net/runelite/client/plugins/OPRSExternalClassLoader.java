/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pf4j.ClassLoadingStrategy
 *  org.pf4j.ClassLoadingStrategy$Source
 *  org.pf4j.PluginClassLoader
 *  org.pf4j.PluginDependency
 *  org.pf4j.PluginDescriptor
 *  org.pf4j.PluginManager
 */
package net.runelite.client.plugins;

import java.lang.invoke.MethodHandles;
import java.util.List;
import net.runelite.client.util.ReflectUtil;
import org.pf4j.ClassLoadingStrategy;
import org.pf4j.PluginClassLoader;
import org.pf4j.PluginDependency;
import org.pf4j.PluginDescriptor;
import org.pf4j.PluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class OPRSExternalClassLoader
extends PluginClassLoader
implements ReflectUtil.PrivateLookupableClassLoader {
    private static final Logger log = LoggerFactory.getLogger(OPRSExternalClassLoader.class);
    private static final String JAVA_PACKAGE_PREFIX = "java.";
    private static final String PLUGIN_PACKAGE_PREFIX = "org.pf4j.";
    private MethodHandles.Lookup lookup;
    private final PluginManager pluginManager;
    private final PluginDescriptor pluginDescriptor;
    private final ClassLoadingStrategy classLoadingStrategy;

    OPRSExternalClassLoader(PluginManager pluginManager, PluginDescriptor pluginDescriptor, ClassLoader parent) {
        super(pluginManager, pluginDescriptor, parent);
        this.pluginManager = pluginManager;
        this.pluginDescriptor = pluginDescriptor;
        this.classLoadingStrategy = ClassLoadingStrategy.PDA;
        ReflectUtil.installLookupHelper(this);
    }

    @Override
    public Class<?> defineClass0(String name, byte[] b, int off, int len) throws ClassFormatError {
        return super.defineClass(name, b, off, len);
    }

    protected Class<?> loadClassFromDependencies(String className) {
        log.trace("Search in dependencies for class '{}'", (Object)className);
        List dependencies = this.pluginDescriptor.getDependencies();
        for (PluginDependency dependency : dependencies) {
            ClassLoader classLoader = this.pluginManager.getPluginClassLoader(dependency.getPluginId());
            if (classLoader == null && dependency.isOptional()) continue;
            try {
                if (classLoader == null) continue;
                return classLoader.loadClass(className);
            }
            catch (ClassNotFoundException classNotFoundException) {
            }
        }
        return null;
    }

    public Class<?> loadClass(String className) throws ClassNotFoundException {
        Object object = this.getClassLoadingLock(className);
        synchronized (object) {
            if (className.startsWith(JAVA_PACKAGE_PREFIX)) {
                return this.findSystemClass(className);
            }
            if (className.startsWith(PLUGIN_PACKAGE_PREFIX) && !className.startsWith("org.pf4j.demo")) {
                return this.getParent().loadClass(className);
            }
            log.trace("Received request to load class '{}'", (Object)className);
            Class loadedClass = this.findLoadedClass(className);
            if (loadedClass != null) {
                log.trace("Found loaded class '{}'", (Object)className);
                return loadedClass;
            }
            for (ClassLoadingStrategy.Source classLoadingSource : this.classLoadingStrategy.getSources()) {
                Class<?> c = null;
                try {
                    switch (classLoadingSource) {
                        case APPLICATION: {
                            c = super.loadClass(className);
                            break;
                        }
                        case PLUGIN: {
                            c = this.findClass(className);
                            break;
                        }
                        case DEPENDENCIES: {
                            c = this.loadClassFromDependencies(className);
                        }
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    // empty catch block
                }
                if (c != null) {
                    log.trace("Found class '{}' in {} classpath", (Object)className, (Object)classLoadingSource);
                    return c;
                }
                log.trace("Couldn't find class '{}' in {} classpath", (Object)className, (Object)classLoadingSource);
            }
            throw new ClassNotFoundException(className);
        }
    }

    @Override
    public MethodHandles.Lookup getLookup() {
        return this.lookup;
    }

    @Override
    public void setLookup(MethodHandles.Lookup lookup) {
        this.lookup = lookup;
    }
}

