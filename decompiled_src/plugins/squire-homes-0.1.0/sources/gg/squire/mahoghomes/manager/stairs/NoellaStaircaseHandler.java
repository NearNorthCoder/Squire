package gg.squire.mahoghomes.manager.stairs;

import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/manager/stairs/NoellaStaircaseHandler.class */
public class NoellaStaircaseHandler extends DefaultStaircaseHandler {
    private boolean ladder = true;
    private int lastSwap;

    @Override // gg.squire.mahoghomes.manager.stairs.DefaultStaircaseHandler, gg.squire.mahoghomes.manager.stairs.StaircaseHandler
    public boolean handle(WorldArea within) {
        Player local = Players.getLocal();
        if (local.isMoving() || local.isAnimating()) {
            return false;
        }
        int tickCount = Static.getClient().getTickCount();
        String[] strArr = new String[1];
        strArr[0] = this.ladder ? "Ladder" : "Staircase";
        TileObject climber = TileObjects.getNearest(strArr);
        if (climb(climber) && tickCount - this.lastSwap > 2) {
            this.lastSwap = tickCount;
            this.ladder = !this.ladder;
            return true;
        }
        return true;
    }
}
