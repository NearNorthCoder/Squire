/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.scurrius.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import gg.squire.scurrius.tasks.ScurriusTaskBase;

@TaskDesc(name="Walking to the bank", priority=2147483547, blocking=true)
public class WalkingToTheBankTask
extends ScurriusTaskBase {

    static {
        j.lIlIllIIIIlIIll();
    }

    @Override
    protected boolean a() {
        if (j.lIlIllIIIIlIlII(this.s() ? 1 : 0)) {
            return lIIlIlIlIllII[0];
        }
        Movement.walkTo((WorldPoint)this.b.bank().r());

        return lIIlIlIlIllII[1];
    }

    private static boolean lIlIllIIIIlIlII(int n2) {
        return n2 != 0;
    }
}

