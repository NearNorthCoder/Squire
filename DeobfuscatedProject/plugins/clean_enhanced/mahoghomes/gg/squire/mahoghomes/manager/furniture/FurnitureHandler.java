/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 */
package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.model.Home;
import net.runelite.api.TileObject;

public interface FurnitureHandler {
    public boolean preInteract(TileObject var1, Home var2);

    public boolean postInteract(TileObject var1);
}

