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
        j.var2();
    }

    @Override
    protected boolean a() {
        if (j.var3(this.s() ? 1 : 0)) {
            return var1[0];
        }
        Movement.walkTo((WorldPoint)this.b.bank().r());
        0;
        return var1[1];
    }

    private static void var2() {
        var1 = new int[2];
        j.var1[0] = 2 & (2 ^ -1);
        j.var1[1] = 1;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }
}

