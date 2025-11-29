/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i_Unknown;

/* TASK: Walking to the bank -> WalkingtothebankTask */
@TaskDesc(name="Walking to the bank")
public class WalkingToTheBankTask
extends i_Unknown {
    private static /* synthetic */ int[] lIlIlllIlIIll;

    @Override
    protected boolean p() {
        if (k.llIIIIlIIllIIII(this.n() ? 1 : 0)) {
            return lIlIlllIlIIll[0];
        }
        Movement.walkTo((WorldPoint)this.i.bank().m());
        0;
        return lIlIlllIlIIll[1];
    }

    private static boolean llIIIIlIIllIIII(int n2) {
        return n2 != 0;
    }

    private static void llIIIIlIIlIllll() {
        lIlIlllIlIIll = new int[2];
        k.lIlIlllIlIIll[0] = (39 + 163 - 66 + 44 ^ 107 + 23 - 59 + 71) & (0x4C ^ 0x5C ^ (0xB6 ^ 0x9C) ^ -1);
        k.lIlIlllIlIIll[1] = 1;
    }

    static {
        k.llIIIIlIIlIllll();
    }
}

