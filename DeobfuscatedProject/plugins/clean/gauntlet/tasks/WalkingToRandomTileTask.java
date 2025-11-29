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
import gg.squire.gauntlet.tasks.GameEnum38;
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
        d[] dArray = new d[llIIllIIIlll[0]];
        dArray[ac.llIIllIIIlll[1]] = d.OUTSIDE;
        super(c2, dArray);
        this.cm = new RectangularArea(llIIllIIIlll[2], llIIllIIIlll[3], llIIllIIIlll[4], llIIllIIIlll[5], llIIllIIIlll[0]);
    }

    private static boolean llllllIIlllIll(int n2) {
        return n2 == 0;
    }

    static {
        ac.llllllIIlllIlI();
    }

    @Override
    public boolean be() {
        if (ac.llllllIIlllIll(this.ba.h().waitAfterAttempt() ? 1 : 0)) {
            return llIIllIIIlll[1];
        }
        if (ac.llllllIIllllII(Movement.shouldWalk() ? 1 : 0)) {
            ac var1;
            Movement.walkTo((WorldPoint)var1.cm.getRandomTile());

            var1.sleep(llIIllIIIlll[6]);
            return llIIllIIIlll[0];
        }
        return llIIllIIIlll[1];
    }

    private static boolean llllllIIllllII(int n2) {
        return n2 != 0;
    }
}

