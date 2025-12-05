/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.WorldEntity
 *  net.runelite.api.WorldView
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.WorldEntity;
import net.runelite.api.WorldView;
import net.runelite.mapping.Import;

public interface RSWorldEntity
extends WorldEntity {
    @Import(value="worldView")
    public WorldView getWorldView();
}

