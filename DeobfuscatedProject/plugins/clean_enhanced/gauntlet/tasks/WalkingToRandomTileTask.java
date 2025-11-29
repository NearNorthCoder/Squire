/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking to random tile", priority=12, blocking=true)
public class WalkingToRandomTileTask
extends GauntletTaskBase {
    
    private final  RectangularArea cm;

    @Inject
    public WalkingToRandomTileTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.OUTSIDE;
        super(c2, dArray);
        this.cm = new RectangularArea(2, 3, 4, 5, 0);
    }

    static {
        ac.var2();
    }

    @Override
    public boolean be() {
        if ((this.ba.h( == 0).waitAfterAttempt() ? 1 : 0)) {
            return 1;
        }
        if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
            ac var3;
            Movement.walkTo((WorldPoint)var3.cm.getRandomTile());
            0;
            var3.sleep(6);
            return 0;
        }
        return 1;
    }

}

