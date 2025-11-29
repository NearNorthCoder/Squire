/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l_Unknown;

/* TASK: Using special attack -> UsingspecialattackTask */
@TaskDesc(name="Using special attack", priority=6)
public class UsingSpecialAttackTask
extends l_Unknown {
    private static /* synthetic */ int[] lIIlllIIlIlIl;

    @Override
    public boolean ak() {
        int[] nArray = new int[lIIlllIIlIlIl[0]];
        nArray[f.lIIlllIIlIlIl[1]] = lIIlllIIlIlIl[2];
        return Equipment.contains((int[])nArray);
    }

    private static boolean lIllIIlIlIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIlIlIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlIlIlIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean al() {
        f var2;
        if (f.lIllIIlIlIlIIlI(this.ar.L() ? 1 : 0)) {
            return lIIlllIIlIlIl[1];
        }
        int var1 = var2.au.c();
        if (f.lIllIIlIlIlIIll(var1, lIIlllIIlIlIl[3])) {
            return lIIlllIIlIlIl[1];
        }
        if (f.lIllIIlIlIlIlII(Combat.getSpecEnergy(), lIIlllIIlIlIl[4])) {
            return lIIlllIIlIlIl[1];
        }
        Combat.toggleSpec();
        return lIIlllIIlIlIl[0];
    }

    static {
        f.lIllIIlIlIlIIIl();
    }

    private static void lIllIIlIlIlIIIl() {
        lIIlllIIlIlIl = new int[5];
        f.lIIlllIIlIlIl[0] = 1;
        f.lIIlllIIlIlIl[1] = (10 + 4 - -140 + 75 ^ 64 + 95 - 65 + 97) & (179 + 56 - 103 + 79 ^ 93 + 124 - 110 + 30 ^ -1);
        f.lIIlllIIlIlIl[2] = 0xFFFFD3F7 & 0x7E2C;
        f.lIIlllIIlIlIl[3] = 0xDD ^ 0x87;
        f.lIIlllIIlIlIl[4] = 0xFA ^ 0x9E;
    }

    @Inject
    protected f(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }
}

