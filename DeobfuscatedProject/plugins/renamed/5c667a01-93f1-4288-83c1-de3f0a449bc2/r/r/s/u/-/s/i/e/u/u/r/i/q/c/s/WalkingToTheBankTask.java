/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.i_Unknown;

/* TASK: Walking to the bank -> WalkingtothebankTask */
@TaskDesc(name="Walking to the bank", priority=2147483547, blocking=true)
public class WalkingToTheBankTask
extends i_Unknown {
    private static /* synthetic */ int[] lIIlIlIlIllII;

    static {
        j.lIlIllIIIIlIIll();
    }

    @Override
    protected boolean a() {
        if (j.lIlIllIIIIlIlII(this.s() ? 1 : 0)) {
            return lIIlIlIlIllII[0];
        }
        Movement.walkTo((WorldPoint)this.b.bank().r());
        0;
        return lIIlIlIlIllII[1];
    }

    private static void lIlIllIIIIlIIll() {
        lIIlIlIlIllII = new int[2];
        j.lIIlIlIlIllII[0] = 2 & (2 ^ -1);
        j.lIIlIlIlIllII[1] = 1;
    }

    private static boolean lIlIllIIIIlIlII(int n2) {
        return n2 != 0;
    }
}

