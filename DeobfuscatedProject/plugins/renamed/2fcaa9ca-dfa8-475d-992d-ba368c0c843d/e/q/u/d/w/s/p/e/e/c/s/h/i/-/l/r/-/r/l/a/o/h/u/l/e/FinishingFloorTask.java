/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.HEnum;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

/* TASK: Finishing Floor -> FinishingfloorTask */
@TaskDesc(name="Finishing Floor", priority=20, blocking=true)
public class FinishingFloorTask
extends Task {
    private /* synthetic */ TileObject ap;
    private final /* synthetic */ SquireSepulchre ar;
    private final /* synthetic */ d at;
    private static /* synthetic */ int[] lllIIIIlIlll;
    private /* synthetic */ J aq;
    private final /* synthetic */ SquireSepulchreConfig as;
    private /* synthetic */ Player ai;

    public boolean run() {
        Player player = Players.getLocal();
        if (Q.lIIIlIIIlIIIIll(player)) {
            return lllIIIIlIlll[0];
        }
        h[] var4 = h.values();
        int var3 = var4.length;
        int var1 = lllIIIIlIlll[0];
        while (Q.lIIIlIIIlIIIlII(var1, var3)) {
            h var5 = var4[var1];
            if (Q.lIIIlIIIlIIIlIl(var5.J() ? 1 : 0)) {
                Q var2;
                var5.a(var2.ar);
                return lllIIIIlIlll[1];
            }
            ++var1;
            0;
            if (((73 + 45 - -6 + 30 ^ 68 + 109 - 76 + 59) & (0x75 ^ 0x6F ^ (0x48 ^ 0x68) ^ -1)) == ((0x31 ^ 0x55 ^ (0x7B ^ 0x41)) & (0xD2 ^ 0xA6 ^ (0x31 ^ 0x1B) ^ -1))) continue;
            return ((0x25 ^ 0x3A ^ (0x52 ^ 0x75)) & (69 + 143 - 195 + 160 ^ 80 + 114 - 70 + 13 ^ -1)) != 0;
        }
        return lllIIIIlIlll[0];
    }

    private static boolean lIIIlIIIlIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIIlIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIlIIIIll(Object object) {
        return object == null;
    }

    private static void lIIIlIIIlIIIIlI() {
        lllIIIIlIlll = new int[2];
        Q.lllIIIIlIlll[0] = (0x7A ^ 0x6F ^ (0x32 ^ 0x1D)) & (15 + 36 - -40 + 40 ^ 168 + 174 - 252 + 95 ^ -1);
        Q.lllIIIIlIlll[1] = 1;
    }

    static {
        Q.lIIIlIIIlIIIIlI();
    }

    @Inject
    public Q(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.as = squireSepulchreConfig;
        this.ar = squireSepulchre;
        this.at = d2;
    }
}

