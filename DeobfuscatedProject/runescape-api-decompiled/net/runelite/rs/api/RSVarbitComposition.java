/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.VarbitComposition
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.VarbitComposition;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSDualNode;

public interface RSVarbitComposition
extends VarbitComposition,
RSDualNode {
    @Import(value="baseVar")
    public int getIndex();

    @Import(value="startBit")
    public int getLeastSignificantBit();

    @Import(value="endBit")
    public int getMostSignificantBit();

    @Import(value="decode")
    public void decode(RSBuffer var1);
}

