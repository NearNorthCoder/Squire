/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.IntegerNode
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.IntegerNode;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSIntegerNode
extends RSNode,
IntegerNode {
    @Import(value="integer")
    public int getValue();

    @Import(value="integer")
    public void setValue(int var1);
}

