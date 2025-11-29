/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Walking to the bank")
public class WalkingToTheBankTask
extends WhispererTaskBase {

    @Override
    protected boolean p() {
        if (k.llIIIIlIIllIIII(this.n() ? 1 : 0)) {
            return lIlIlllIlIIll[0];
        }
        Movement.walkTo((WorldPoint)this.i.bank().m());

        return lIlIlllIlIIll[1];
    }

    private static boolean llIIIIlIIllIIII(int n2) {
        return n2 != 0;
    }

    static {
        k.llIIIIlIIlIllll();
    }
}

