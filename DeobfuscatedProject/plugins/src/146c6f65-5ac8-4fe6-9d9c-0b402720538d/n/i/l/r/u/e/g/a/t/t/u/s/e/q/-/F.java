/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Prayers
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(priority=10, name="Turning off prayers")
public class F
extends n {
    private static /* synthetic */ int[] llIlIIIIlIll;

    private static boolean lIIIIIIIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public F(c c2) {
        d[] dArray = new d[llIlIIIIlIll[0]];
        dArray[F.llIlIIIIlIll[1]] = d.FIRST_ROTATION_CREATE;
        dArray[F.llIlIIIIlIll[2]] = d.PREPARE_BOSS_FIGHT;
        dArray[F.llIlIIIIlIll[3]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
    }

    static {
        F.lIIIIIIIllIllIl();
    }

    @Override
    public boolean bf() {
        return llIlIIIIlIll[2];
    }

    private static boolean lIIIIIIIlllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIllIllll(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIIIllIllIl() {
        llIlIIIIlIll = new int[4];
        F.llIlIIIIlIll[0] = "   ".length();
        F.llIlIIIIlIll[1] = (10 + 189 - 193 + 246 ^ 10 + 124 - 73 + 100) & (51 + 57 - 24 + 73 ^ 119 + 164 - 132 + 41 ^ -" ".length());
        F.llIlIIIIlIll[2] = " ".length();
        F.llIlIIIIlIll[3] = "  ".length();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void lllllllllllllllIlIIIllIlllIIIIll;
        F lllllllllllllllIlIIIllIlllIIIlII;
        Player player = Players.getLocal();
        if (F.lIIIIIIIllIlllI(player)) {
            return llIlIIIIlIll[1];
        }
        if (F.lIIIIIIIllIllll(lllllllllllllllIlIIIllIlllIIIlII.ba.V().av().e(lllllllllllllllIlIIIllIlllIIIIll.getWorldLocation()) ? 1 : 0)) {
            return llIlIIIIlIll[1];
        }
        Prayer[] lllllllllllllllIlIIIllIlllIIIIlI = Prayer.values();
        int lllllllllllllllIlIIIllIlllIIIIIl = lllllllllllllllIlIIIllIlllIIIIlI.length;
        int lllllllllllllllIlIIIllIlllIIIIII = llIlIIIIlIll[1];
        while (F.lIIIIIIIlllIIII(lllllllllllllllIlIIIllIlllIIIIII, lllllllllllllllIlIIIllIlllIIIIIl)) {
            Prayer lllllllllllllllIlIIIllIllIllllll = lllllllllllllllIlIIIllIlllIIIIlI[lllllllllllllllIlIIIllIlllIIIIII];
            if (F.lIIIIIIIlllIIIl(Prayers.isEnabled((Prayer)lllllllllllllllIlIIIllIllIllllll) ? 1 : 0)) {
                Prayers.toggle((Prayer)lllllllllllllllIlIIIllIllIllllll);
                return llIlIIIIlIll[2];
            }
            ++lllllllllllllllIlIIIllIlllIIIIII;
            "".length();
            if (((0x6D ^ 0x70) & ~(0x29 ^ 0x34)) == 0) continue;
            return ((0x11 ^ 0x44) & ~(0x2A ^ 0x7F)) != 0;
        }
        return llIlIIIIlIll[1];
    }

    private static boolean lIIIIIIIllIlllI(Object object) {
        return object == null;
    }
}

