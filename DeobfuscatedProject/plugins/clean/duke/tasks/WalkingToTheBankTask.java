/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.duke.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.tasks.DukeTaskBase;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking to the bank", priority=0x7FFFFFFF, blocking=true)
public class WalkingToTheBankTask
extends DukeTaskBase {

    private static boolean lllIlIIlIllIIl(int n2) {
        return n2 != 0;
    }

    static {
        o.lllIlIIlIllIII();
    }

    @Override
    protected boolean R() {
        o var1;
        if (o.lllIlIIlIllIIl(this.w.n() ? 1 : 0)) {
            return lIllIllIlIll[0];
        }
        if (o.lllIlIIlIllIIl(var1.P() ? 1 : 0)) {
            return lIllIllIlIll[0];
        }
        Movement.walkTo((WorldPoint)this.ae.bank().H());

        return lIllIllIlIll[1];
    }

}

