/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.AEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.DEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.GEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.KEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.EEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.IEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.LEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.NEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.REnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.TEnum;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/* TASK: Obstacle Handler -> ObstaclehandlerTask */
@TaskDesc(name="Obstacle Handler", priority=15, blocking=true, instant=true)
public class ObstacleHandlerTask
extends Task {
    private /* synthetic */ J aq;
    private static /* synthetic */ int[] lllIIlIIIIII;
    private /* synthetic */ Player ai;
    private final /* synthetic */ d az;
    private final /* synthetic */ SquireSepulchreConfig ay;
    private final /* synthetic */ SquireSepulchre ax;

    private static boolean lIIIlIIlllIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIlllIIlIl(Object object) {
        return object == null;
    }

    @Inject
    public S(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.ay = squireSepulchreConfig;
        this.ax = squireSepulchre;
        this.az = d2;
    }

    private static boolean lIIIlIIlllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        S.lIIIlIIlllIIlII();
    }

    private static void lIIIlIIlllIIlII() {
        lllIIlIIIIII = new int[2];
        S.lllIIlIIIIII[0] = (0xA3 ^ 0x80) & ~(6 ^ 0x25);
        S.lllIIlIIIIII[1] = 1;
    }

    public boolean run() {
        S var2;
        Enum var1;
        Player player = Players.getLocal();
        if (S.lIIIlIIlllIIlIl(player)) {
            return lllIIlIIIIII[0];
        }
        if (S.lIIIlIIlllIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        Enum[] var5 = n.values();
        int var3 = var5.length;
        int var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((n)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                System.out.println(var1.name());
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if (3 >= 0) continue;
            return ((0x8D ^ 0xAF ^ (0xCA ^ 0x8A)) & (0x72 ^ 0x1B ^ (0x7E ^ 0x75) ^ -1)) != 0;
        }
        var5 = i.values();
        var3 = var5.length;
        var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((i)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                System.out.println(var1.name());
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if ((1 & ~1) == 0) continue;
            return false;
        }
        var5 = t.values();
        var3 = var5.length;
        var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((t)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                System.out.println(var1.name());
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if (((0x7B ^ 0x6B) & ~(0x3B ^ 0x2B)) <= 1) continue;
            return false;
        }
        var5 = l.values();
        var3 = var5.length;
        var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((l)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                System.out.println(var1.name());
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if (1 >= -1) continue;
            return ((0x53 ^ 0x69 ^ (0x76 ^ 0x1C)) & (140 + 136 - 250 + 206 ^ 55 + 133 - 89 + 85 ^ -1)) != 0;
        }
        var5 = D.values();
        var3 = var5.length;
        var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((D)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                System.out.println(var1.name());
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if (3 != ((0x45 ^ 0x3B ^ (0x79 ^ 0x14)) & (0xFF ^ 0x97 ^ (0x2C ^ 0x57) ^ -1))) continue;
            return ((0xD ^ 0x5C ^ (0x5C ^ 0x6E)) & (0x9F ^ 0xB0 ^ (0x25 ^ 0x69) ^ -1)) != 0;
        }
        var5 = A.values();
        var3 = var5.length;
        var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((A)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                System.out.println(var1.name());
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if (2 < 3) continue;
            return ((0x5A ^ 0x76 ^ (0x23 ^ 0x6C)) & (0xA1 ^ 0x8D ^ (0x45 ^ 0xA) ^ -1)) != 0;
        }
        var5 = e.values();
        var3 = var5.length;
        var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((e)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                System.out.println(var1.name());
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if (-1 <= 0) continue;
            return ((0x34 ^ 5 ^ (0xF4 ^ 0xA6)) & (0x77 ^ 0x44 ^ (0xEF ^ 0xBF) ^ -1)) != 0;
        }
        var5 = r.values();
        var3 = var5.length;
        var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((r)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                System.out.println(var1.name());
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if (1 > 0) continue;
            return false;
        }
        var5 = K.values();
        var3 = var5.length;
        var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((K)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if ((20 + 124 - -3 + 2 ^ 7 + 88 - 45 + 95) == (0x28 ^ 3 ^ (0x80 ^ 0xAF))) continue;
            return ((38 + 14 - -36 + 48 ^ 116 + 85 - 179 + 169) & (0xD8 ^ 0xA2 ^ (0x17 ^ 0x5A) ^ -1)) != 0;
        }
        var5 = G.values();
        var3 = var5.length;
        var4 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var4, var3)) {
            var1 = var5[var4];
            if (S.lIIIlIIlllIlIII(((G)var1).a(var2.az, var2.ax) ? 1 : 0)) {
                return lllIIlIIIIII[1];
            }
            ++var4;
            0;
            if ((0x12 ^ 0x2B ^ (0x8A ^ 0xB6)) != 0) continue;
            return false;
        }
        return lllIIlIIIIII[0];
    }

    private static boolean lIIIlIIlllIIllI(int n2) {
        return n2 == 0;
    }
}

