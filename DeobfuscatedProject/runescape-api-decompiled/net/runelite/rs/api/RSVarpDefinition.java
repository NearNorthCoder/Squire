/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.runelite.rs.api.RSDualNode;

public interface RSVarpDefinition
extends RSDualNode {
    @Import(value="type")
    public int getType();
}

