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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(priority=10, name="Turning off prayers")
public class F_Unknown
extends n_Unknown {
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
        F.llIlIIIIlIll[0] = 3;
        F.llIlIIIIlIll[1] = (10 + 189 - 193 + 246 ^ 10 + 124 - 73 + 100) & (51 + 57 - 24 + 73 ^ 119 + 164 - 132 + 41 ^ -1);
        F.llIlIIIIlIll[2] = 1;
        F.llIlIIIIlIll[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var1;
        F var3;
        Player player = Players.getLocal();
        if (F.lIIIIIIIllIlllI(player)) {
            return llIlIIIIlIll[1];
        }
        if (F.lIIIIIIIllIllll(var3.ba.V().av().e(var1.getWorldLocation()) ? 1 : 0)) {
            return llIlIIIIlIll[1];
        }
        Prayer[] var2 = Prayer.values();
        int var6 = var2.length;
        int var4 = llIlIIIIlIll[1];
        while (F.lIIIIIIIlllIIII(var4, var6)) {
            Prayer var5 = var2[var4];
            if (F.lIIIIIIIlllIIIl(Prayers.isEnabled((Prayer)var5) ? 1 : 0)) {
                Prayers.toggle((Prayer)var5);
                return llIlIIIIlIll[2];
            }
            ++var4;
            0;
            if (((0x6D ^ 0x70) & ~(0x29 ^ 0x34)) == 0) continue;
            return false;
        }
        return llIlIIIIlIll[1];
    }

    private static boolean lIIIIIIIllIlllI(Object object) {
        return object == null;
    }
}

