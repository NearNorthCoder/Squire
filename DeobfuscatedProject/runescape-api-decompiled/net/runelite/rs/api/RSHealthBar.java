/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.runelite.rs.api.RSHealthBarDefinition;
import net.runelite.rs.api.RSIterableNodeDeque;
import net.runelite.rs.api.RSNode;

public interface RSHealthBar
extends RSNode {
    @Import(value="updates")
    public RSIterableNodeDeque getUpdates();

    @Import(value="definition")
    public RSHealthBarDefinition getDefinition();
}

