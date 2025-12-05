/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

public class IllegalReflectionExclusion
implements ExclusionStrategy {
    private static final Set<ClassLoader> PRIVATE_CLASSLOADERS = new HashSet<ClassLoader>();

    @Override
    public boolean shouldSkipField(FieldAttributes f) {
        if (!PRIVATE_CLASSLOADERS.contains(f.getDeclaringClass().getClassLoader())) {
            return false;
        }
        assert (!Modifier.isPrivate(f.getDeclaringClass().getModifiers())) : "gsoning private class " + f.getDeclaringClass().getName();
        try {
            f.getDeclaringClass().getField(f.getName());
        }
        catch (NoSuchFieldException e) {
            throw new AssertionError((Object)("gsoning private field " + String.valueOf(f.getDeclaringClass()) + "." + f.getName()));
        }
        return false;
    }

    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }

    static {
        for (ClassLoader cl = ClassLoader.getSystemClassLoader(); cl != null; cl = cl.getParent()) {
            PRIVATE_CLASSLOADERS.add(cl);
        }
    }
}

