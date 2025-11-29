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
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.A;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.D;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.G;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.K;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.e;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.i;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.l;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.n;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.r;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.t;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Obstacle Handler", priority=15, blocking=true, instant=true)
public class S
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
        S.lllIIlIIIIII[1] = " ".length();
    }

    public boolean run() {
        S lllllllllllllllIIllIlIlllIllIIII;
        Enum lllllllllllllllIIllIlIlllIlIlIll;
        Player player = Players.getLocal();
        if (S.lIIIlIIlllIIlIl(player)) {
            return lllIIlIIIIII[0];
        }
        if (S.lIIIlIIlllIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        Enum[] lllllllllllllllIIllIlIlllIlIlllI = n.values();
        int lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        int lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((n)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                System.out.println(lllllllllllllllIIllIlIlllIlIlIll.name());
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if ("   ".length() >= 0) continue;
            return ((0x8D ^ 0xAF ^ (0xCA ^ 0x8A)) & (0x72 ^ 0x1B ^ (0x7E ^ 0x75) ^ -" ".length())) != 0;
        }
        lllllllllllllllIIllIlIlllIlIlllI = i.values();
        lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((i)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                System.out.println(lllllllllllllllIIllIlIlllIlIlIll.name());
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if ((" ".length() & ~" ".length()) == 0) continue;
            return ((0xAB ^ 0x90) & ~(0x68 ^ 0x53)) != 0;
        }
        lllllllllllllllIIllIlIlllIlIlllI = t.values();
        lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((t)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                System.out.println(lllllllllllllllIIllIlIlllIlIlIll.name());
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if (((0x7B ^ 0x6B) & ~(0x3B ^ 0x2B)) <= " ".length()) continue;
            return ((0x48 ^ 0x4F) & ~(0x64 ^ 0x63)) != 0;
        }
        lllllllllllllllIIllIlIlllIlIlllI = l.values();
        lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((l)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                System.out.println(lllllllllllllllIIllIlIlllIlIlIll.name());
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if (" ".length() >= -" ".length()) continue;
            return ((0x53 ^ 0x69 ^ (0x76 ^ 0x1C)) & (140 + 136 - 250 + 206 ^ 55 + 133 - 89 + 85 ^ -" ".length())) != 0;
        }
        lllllllllllllllIIllIlIlllIlIlllI = D.values();
        lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((D)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                System.out.println(lllllllllllllllIIllIlIlllIlIlIll.name());
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if ("   ".length() != ((0x45 ^ 0x3B ^ (0x79 ^ 0x14)) & (0xFF ^ 0x97 ^ (0x2C ^ 0x57) ^ -" ".length()))) continue;
            return ((0xD ^ 0x5C ^ (0x5C ^ 0x6E)) & (0x9F ^ 0xB0 ^ (0x25 ^ 0x69) ^ -" ".length())) != 0;
        }
        lllllllllllllllIIllIlIlllIlIlllI = A.values();
        lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((A)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                System.out.println(lllllllllllllllIIllIlIlllIlIlIll.name());
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if ("  ".length() < "   ".length()) continue;
            return ((0x5A ^ 0x76 ^ (0x23 ^ 0x6C)) & (0xA1 ^ 0x8D ^ (0x45 ^ 0xA) ^ -" ".length())) != 0;
        }
        lllllllllllllllIIllIlIlllIlIlllI = e.values();
        lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((e)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                System.out.println(lllllllllllllllIIllIlIlllIlIlIll.name());
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if (-" ".length() <= 0) continue;
            return ((0x34 ^ 5 ^ (0xF4 ^ 0xA6)) & (0x77 ^ 0x44 ^ (0xEF ^ 0xBF) ^ -" ".length())) != 0;
        }
        lllllllllllllllIIllIlIlllIlIlllI = r.values();
        lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((r)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                System.out.println(lllllllllllllllIIllIlIlllIlIlIll.name());
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if (" ".length() > 0) continue;
            return ((82 + 141 - 74 + 8 ^ 173 + 172 - 215 + 46) & (39 + 91 - 75 + 73 ^ 159 + 136 - 181 + 59 ^ -" ".length())) != 0;
        }
        lllllllllllllllIIllIlIlllIlIlllI = K.values();
        lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((K)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if ((20 + 124 - -3 + 2 ^ 7 + 88 - 45 + 95) == (0x28 ^ 3 ^ (0x80 ^ 0xAF))) continue;
            return ((38 + 14 - -36 + 48 ^ 116 + 85 - 179 + 169) & (0xD8 ^ 0xA2 ^ (0x17 ^ 0x5A) ^ -" ".length())) != 0;
        }
        lllllllllllllllIIllIlIlllIlIlllI = G.values();
        lllllllllllllllIIllIlIlllIlIllIl = lllllllllllllllIIllIlIlllIlIlllI.length;
        lllllllllllllllIIllIlIlllIlIllII = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(lllllllllllllllIIllIlIlllIlIllII, lllllllllllllllIIllIlIlllIlIllIl)) {
            lllllllllllllllIIllIlIlllIlIlIll = lllllllllllllllIIllIlIlllIlIlllI[lllllllllllllllIIllIlIlllIlIllII];
            if (S.lIIIlIIlllIlIII(((G)lllllllllllllllIIllIlIlllIlIlIll).a(lllllllllllllllIIllIlIlllIllIIII.az, lllllllllllllllIIllIlIlllIllIIII.ax) ? 1 : 0)) {
                return lllIIlIIIIII[1];
            }
            ++lllllllllllllllIIllIlIlllIlIllII;
            "".length();
            if ((0x12 ^ 0x2B ^ (0x8A ^ 0xB6)) != 0) continue;
            return ((174 + 46 - 90 + 69 ^ 113 + 32 - 63 + 54) & (112 + 76 - 167 + 185 ^ 110 + 34 - 55 + 40 ^ -" ".length())) != 0;
        }
        return lllIIlIIIIII[0];
    }

    private static boolean lIIIlIIlllIIllI(int n2) {
        return n2 == 0;
    }
}

