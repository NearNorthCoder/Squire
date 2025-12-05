/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Script
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Script;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSDualNode;

public interface RSScript
extends Script,
RSDualNode {
    @Import(value="intOperands")
    public int[] getIntOperands();

    @Import(value="opcodes")
    public int[] getInstructions();

    @Import(value="intArgumentCount")
    public int getIntArgumentCount();

    @Import(value="stringArgumentCount")
    public int getStringArgumentCount();
}

