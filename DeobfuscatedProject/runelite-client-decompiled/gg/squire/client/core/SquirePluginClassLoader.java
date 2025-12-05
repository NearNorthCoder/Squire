/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.core;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.net.URLClassLoader;
import net.runelite.client.util.ReflectUtil;

public class SquirePluginClassLoader
extends URLClassLoader
implements ReflectUtil.PrivateLookupableClassLoader {
    private final Object marker;
    private MethodHandles.Lookup lookup;
    private final Cache<String, Class<?>> classCache = CacheBuilder.newBuilder().maximumSize(128L).build();

    public SquirePluginClassLoader(Object marker, URL[] urls) {
        super(urls, SquirePluginClassLoader.class.getClassLoader());
        this.marker = marker;
        ReflectUtil.installLookupHelper(this);
    }

    @Override
    public Class<?> defineClass0(String name, byte[] b, int off, int len) throws ClassFormatError {
        assert (this.marker != null);
        return super.defineClass(name, b, off, len);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (!name.startsWith("gg.squire")) {
            return super.loadClass(name);
        }
        Class<?> presentValue = this.classCache.getIfPresent(name);
        if (presentValue != null) {
            return presentValue;
        }
        Class<?> clazz = super.loadClass(name);
        this.classCache.put(name, clazz);
        return clazz;
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

