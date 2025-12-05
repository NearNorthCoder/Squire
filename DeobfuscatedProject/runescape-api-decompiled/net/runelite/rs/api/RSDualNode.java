/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.DualNode
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.DualNode;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSDualNode
extends RSNode,
DualNode {
    @Import(value="previousDual")
    public RSDualNode previousDual();

    @Import(value="removeDual")
    public void unlinkDual();
}

