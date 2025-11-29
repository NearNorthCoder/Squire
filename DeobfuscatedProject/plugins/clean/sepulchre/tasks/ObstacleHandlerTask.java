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
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import gg.squire.sepulchre.tasks.GameEnum32;
import gg.squire.sepulchre.tasks.GameEnum6;
import gg.squire.sepulchre.tasks.GameEnum;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import gg.squire.sepulchre.tasks.GameEnum36;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum24;
import gg.squire.sepulchre.tasks.GameEnum12;
import gg.squire.sepulchre.tasks.GameEnum27;
import gg.squire.sepulchre.tasks.GameEnum7;
import gg.squire.sepulchre.tasks.GameEnum29;
import gg.squire.sepulchre.tasks.GameEnum5;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Obstacle Handler", priority=15, blocking=true, instant=true)
public class ObstacleHandlerTask
extends Task {
    private  J aq;
    
    private  Player ai;
    private final  d az;
    private final  SquireSepulchreConfig ay;
    private final  SquireSepulchre ax;

    private static boolean lIIIlIIlllIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIlllIIlIl(Object object) {
        return object == null;
    }

    @Inject
    public ObstacleHandlerTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
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

    public boolean run() {
        S var1;
        Enum var2;
        Player player = Players.getLocal();
        if (S.lIIIlIIlllIIlIl(player)) {
            return lllIIlIIIIII[0];
        }
        if (S.lIIIlIIlllIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        Enum[] var3 = n.values();
        int var4 = var3.length;
        int var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum7) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                System.out.println(var2.name());
                return lllIIlIIIIII[1];
            }
            ++var5;

            if (3 >= 0) continue;
            return ((0x8D ^ 0xAF ^ (0xCA ^ 0x8A)) & (0x72 ^ 0x1B ^ (0x7E ^ 0x75) ^ -1)) != 0;
        }
        var3 = i.values();
        var4 = var3.length;
        var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum12) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                System.out.println(var2.name());
                return lllIIlIIIIII[1];
            }
            ++var5;

            if ((1 & ~1) == 0) continue;
            return false;
        }
        var3 = t.values();
        var4 = var3.length;
        var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum5) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                System.out.println(var2.name());
                return lllIIlIIIIII[1];
            }
            ++var5;

            if (((0x7B ^ 0x6B) & ~(0x3B ^ 0x2B)) <= 1) continue;
            return false;
        }
        var3 = l.values();
        var4 = var3.length;
        var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum27) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                System.out.println(var2.name());
                return lllIIlIIIIII[1];
            }
            ++var5;

            if (1 >= -1) continue;
            return ((0x53 ^ 0x69 ^ (0x76 ^ 0x1C)) & (140 + 136 - 250 + 206 ^ 55 + 133 - 89 + 85 ^ -1)) != 0;
        }
        var3 = D.values();
        var4 = var3.length;
        var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum6) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                System.out.println(var2.name());
                return lllIIlIIIIII[1];
            }
            ++var5;

            if (3 != ((0x45 ^ 0x3B ^ (0x79 ^ 0x14)) & (0xFF ^ 0x97 ^ (0x2C ^ 0x57) ^ -1))) continue;
            return ((0xD ^ 0x5C ^ (0x5C ^ 0x6E)) & (0x9F ^ 0xB0 ^ (0x25 ^ 0x69) ^ -1)) != 0;
        }
        var3 = A.values();
        var4 = var3.length;
        var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum32) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                System.out.println(var2.name());
                return lllIIlIIIIII[1];
            }
            ++var5;

            if (2 < 3) continue;
            return ((0x5A ^ 0x76 ^ (0x23 ^ 0x6C)) & (0xA1 ^ 0x8D ^ (0x45 ^ 0xA) ^ -1)) != 0;
        }
        var3 = e.values();
        var4 = var3.length;
        var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum24) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                System.out.println(var2.name());
                return lllIIlIIIIII[1];
            }
            ++var5;

            if (-1 <= 0) continue;
            return ((0x34 ^ 5 ^ (0xF4 ^ 0xA6)) & (0x77 ^ 0x44 ^ (0xEF ^ 0xBF) ^ -1)) != 0;
        }
        var3 = r.values();
        var4 = var3.length;
        var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum29) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                System.out.println(var2.name());
                return lllIIlIIIIII[1];
            }
            ++var5;

            if (1 > 0) continue;
            return false;
        }
        var3 = K.values();
        var4 = var3.length;
        var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum36) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                return lllIIlIIIIII[1];
            }
            ++var5;

            if ((20 + 124 - -3 + 2 ^ 7 + 88 - 45 + 95) == (0x28 ^ 3 ^ (0x80 ^ 0xAF))) continue;
            return ((38 + 14 - -36 + 48 ^ 116 + 85 - 179 + 169) & (0xD8 ^ 0xA2 ^ (0x17 ^ 0x5A) ^ -1)) != 0;
        }
        var3 = G.values();
        var4 = var3.length;
        var5 = lllIIlIIIIII[0];
        while (S.lIIIlIIlllIIlll(var5, var4)) {
            var2 = var3[var5];
            if (S.lIIIlIIlllIlIII(((GameEnum) ar2).a(var1.az, var1.ax) ? 1 : 0)) {
                return lllIIlIIIIII[1];
            }
            ++var5;

            if ((0x12 ^ 0x2B ^ (0x8A ^ 0xB6)) != 0) continue;
            return false;
        }
        return lllIIlIIIIII[0];
    }

    private static boolean lIIIlIIlllIIllI(int n2) {
        return n2 == 0;
    }
}

