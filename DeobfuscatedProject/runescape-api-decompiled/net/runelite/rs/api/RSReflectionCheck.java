/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Import;

public interface RSReflectionCheck {
    @Import(value="methods")
    public Method[] getMethods();

    @Import(value="fields")
    public Field[] getFields();

    @Import(value="arguments")
    public byte[][][] getArgs();
}

