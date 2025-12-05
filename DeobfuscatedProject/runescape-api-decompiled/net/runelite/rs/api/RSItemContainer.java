/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemContainer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.ItemContainer;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSItemContainer
extends RSNode,
ItemContainer {
    @Import(value="ids")
    public int[] getItemIds();

    @Import(value="quantities")
    public int[] getStackSizes();
}

