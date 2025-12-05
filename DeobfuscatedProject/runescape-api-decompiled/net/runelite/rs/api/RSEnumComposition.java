/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.EnumComposition
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.EnumComposition;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSDualNode;

public interface RSEnumComposition
extends EnumComposition,
RSDualNode {
    @Import(value="size")
    public int size();

    @Import(value="keys")
    public int[] getKeys();

    @Import(value="intVals")
    public int[] getIntVals();

    @Import(value="strVals")
    public String[] getStringVals();

    @Import(value="defaultInt")
    public int getDefaultInt();

    @Import(value="defaultStr")
    public String getDefaultString();
}

