/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.TEnum;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;

/* TASK: Loot Handler -> LoothandlerTask */
@TaskDesc(name="Loot Handler", priority=50, blocking=true)
public class LootHandlerTask
extends Task {
    private final /* synthetic */ SquireSepulchreConfig av;
    private /* synthetic */ Player ai;
    private final /* synthetic */ d aw;
    private final /* synthetic */ SquireSepulchre au;
    private static /* synthetic */ int[] lllIIIIIIlII;
    private /* synthetic */ J aq;

    public boolean run() {
        int n2 = this.au.c();
        Player player = Players.getLocal();
        System.out.println("Time: " + n2);
        if (R.lIIIlIIIIIIlIll(player)) {
            return lllIIIIIIlII[0];
        }
        t[] var4 = t.values();
        int var2 = var4.length;
        int var3 = lllIIIIIIlII[0];
        while (R.lIIIlIIIIIIllII(var3, var2)) {
            R var5;
            t var1 = var4[var3];
            if (R.lIIIlIIIIIIllIl(var1.a(var5.aw, var5.au) ? 1 : 0)) {
                System.out.println(var1.name());
                return lllIIIIIIlII[1];
            }
            ++var3;
            0;
            if (2 != 0) continue;
            return ((0x73 ^ 0x40 ^ (0xB3 ^ 0x8B)) & (0x1A ^ 0x72 ^ (0xA ^ 0x69) ^ -1)) != 0;
        }
        return lllIIIIIIlII[0];
    }

    static {
        R.lIIIlIIIIIIlIlI();
    }

    private static void lIIIlIIIIIIlIlI() {
        lllIIIIIIlII = new int[2];
        R.lllIIIIIIlII[0] = (126 + 4 - 18 + 119 ^ 34 + 16 - -3 + 145) & (3 ^ (0x82 ^ 0xA0) ^ -1);
        R.lllIIIIIIlII[1] = 1;
    }

    private static boolean lIIIlIIIIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIIIIllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public R(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.av = squireSepulchreConfig;
        this.au = squireSepulchre;
        this.aw = d2;
    }

    private static boolean lIIIlIIIIIIlIll(Object object) {
        return object == null;
    }
}

