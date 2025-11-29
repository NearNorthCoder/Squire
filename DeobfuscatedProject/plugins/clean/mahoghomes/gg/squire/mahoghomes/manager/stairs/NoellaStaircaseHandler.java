/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 */
package gg.squire.mahoghomes.manager.stairs;

import gg.squire.mahoghomes.manager.stairs.DefaultStaircaseHandler;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;

public class NoellaStaircaseHandler
extends DefaultStaircaseHandler {
    private boolean ladder = true;
    private int lastSwap;

    @Override
    public boolean handle(WorldArea within) {
        Player local = Players.getLocal();
        if (local.isMoving() || local.isAnimating()) {
            return false;
        }
        int tickCount = Static.getClient().getTickCount();
        TileObject climber = TileObjects.getNearest((String[])new String[]{this.ladder ? "Ladder" : "Staircase"});
        if (this.climb(climber) && tickCount - this.lastSwap > 2) {
            this.lastSwap = tickCount;
            this.ladder = !this.ladder;
        }
        return true;
    }
}

