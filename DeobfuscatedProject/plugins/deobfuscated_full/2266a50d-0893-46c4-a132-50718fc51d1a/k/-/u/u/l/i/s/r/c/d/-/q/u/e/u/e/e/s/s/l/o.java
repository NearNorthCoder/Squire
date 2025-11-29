/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.TaskDesc;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.n;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;

/* TASK: Walking to the bank -> WalkingtothebankTask */
@TaskDesc(name="Walking to the bank", priority=0x7FFFFFFF, blocking=true)
public class o
extends n {
    private static /* synthetic */ int[] lIllIllIlIll;

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
        0;
        return lIllIllIlIll[1];
    }

    private static void lllIlIIlIllIII() {
        lIllIllIlIll = new int[2];
        o.lIllIllIlIll[0] = (0x7B ^ 0x58) & ~(0x38 ^ 0x1B);
        o.lIllIllIlIll[1] = 1;
    }
}

