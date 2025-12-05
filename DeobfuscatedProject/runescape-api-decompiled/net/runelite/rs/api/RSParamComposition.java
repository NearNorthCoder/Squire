/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSParamComposition {
    public boolean isString();

    @Import(value="type")
    public char getType();

    @Import(value="defaultInt")
    public int getDefaultInt();

    @Import(value="defaultStr")
    public String getDefaultStr();
}

