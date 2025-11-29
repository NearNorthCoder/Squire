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
import gg.squire.sepulchre.tasks.GameEnum24;
import gg.squire.sepulchre.tasks.GameEnum3;
import gg.squire.sepulchre.tasks.GameEnum;
import gg.squire.sepulchre.tasks.JHelper;
import gg.squire.sepulchre.tasks.GameEnum28;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum17;
import gg.squire.sepulchre.tasks.GameEnum8;
import gg.squire.sepulchre.tasks.GameEnum20;
import gg.squire.sepulchre.tasks.GameEnum4;
import gg.squire.sepulchre.tasks.GameEnum22;
import gg.squire.sepulchre.tasks.GameEnum2;
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

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    @Inject
    public ObstacleHandlerTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.ay = squireSepulchreConfig;
        this.ax = squireSepulchre;
        this.az = d2;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    static {
        S.var5();
    }

    private static void var5() {
        var1 = new int[2];
        S.var1[0] = (0xA3 ^ 0x80) & ~(6 ^ 0x25);
        S.var1[1] = 1;
    }

    public boolean run() {
        S var6;
        Enum var7;
        Player player = Players.getLocal();
        if (S.var3(player)) {
            return var1[0];
        }
        if (S.var8(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        Enum[] var9 = n.values();
        int var10 = var9.length;
        int var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((n)var7).a(var6.az, var6.ax) ? 1 : 0)) {
                System.out.println(var7.name());
                return var1[1];
            }
            ++var11;
            0;
            
            return ((0x8D ^ 0xAF ^ (0xCA ^ 0x8A)) & (0x72 ^ 0x1B ^ (0x7E ^ 0x75) ^ -1)) != 0;
        }
        var9 = i.values();
        var10 = var9.length;
        var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((i)var7).a(var6.az, var6.ax) ? 1 : 0)) {
                System.out.println(var7.name());
                return var1[1];
            }
            ++var11;
            0;
            if ((1 & ~1) == 0) continue;
            return ((0xAB ^ 0x90) & ~(0x68 ^ 0x53)) != 0;
        }
        var9 = t.values();
        var10 = var9.length;
        var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((t)var7).a(var6.az, var6.ax) ? 1 : 0)) {
                System.out.println(var7.name());
                return var1[1];
            }
            ++var11;
            0;
            if (((0x7B ^ 0x6B) & ~(0x3B ^ 0x2B)) <= 1) continue;
            return ((0x48 ^ 0x4F) & ~(0x64 ^ 0x63)) != 0;
        }
        var9 = l.values();
        var10 = var9.length;
        var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((var7).a(var6.az, var6.ax) ? 1 : 0)) {
                System.out.println(var7.name());
                return var1[1];
            }
            ++var11;
            0;
            
            return ((0x53 ^ 0x69 ^ (0x76 ^ 0x1C)) & (140 + 136 - 250 + 206 ^ 55 + 133 - 89 + 85 ^ -1)) != 0;
        }
        var9 = D.values();
        var10 = var9.length;
        var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((D)var7).a(var6.az, var6.ax) ? 1 : 0)) {
                System.out.println(var7.name());
                return var1[1];
            }
            ++var11;
            0;
            if (3 != ((0x45 ^ 0x3B ^ (0x79 ^ 0x14)) & (0xFF ^ 0x97 ^ (0x2C ^ 0x57) ^ -1))) continue;
            return ((0xD ^ 0x5C ^ (0x5C ^ 0x6E)) & (0x9F ^ 0xB0 ^ (0x25 ^ 0x69) ^ -1)) != 0;
        }
        var9 = A.values();
        var10 = var9.length;
        var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((A)var7).a(var6.az, var6.ax) ? 1 : 0)) {
                System.out.println(var7.name());
                return var1[1];
            }
            ++var11;
            0;
            if (2 < 3) continue;
            return ((0x5A ^ 0x76 ^ (0x23 ^ 0x6C)) & (0xA1 ^ 0x8D ^ (0x45 ^ 0xA) ^ -1)) != 0;
        }
        var9 = e.values();
        var10 = var9.length;
        var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((e)var7).a(var6.az, var6.ax) ? 1 : 0)) {
                System.out.println(var7.name());
                return var1[1];
            }
            ++var11;
            0;
            if (-1 <= 0) continue;
            return ((0x34 ^ 5 ^ (0xF4 ^ 0xA6)) & (0x77 ^ 0x44 ^ (0xEF ^ 0xBF) ^ -1)) != 0;
        }
        var9 = r.values();
        var10 = var9.length;
        var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((r)var7).a(var6.az, var6.ax) ? 1 : 0)) {
                System.out.println(var7.name());
                return var1[1];
            }
            ++var11;
            0;
            if (1 > 0) continue;
            return ((82 + 141 - 74 + 8 ^ 173 + 172 - 215 + 46) & (39 + 91 - 75 + 73 ^ 159 + 136 - 181 + 59 ^ -1)) != 0;
        }
        var9 = K.values();
        var10 = var9.length;
        var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((K)var7).a(var6.az, var6.ax) ? 1 : 0)) {
                return var1[1];
            }
            ++var11;
            0;
            if ((20 + 124 - -3 + 2 ^ 7 + 88 - 45 + 95) == (0x28 ^ 3 ^ (0x80 ^ 0xAF))) continue;
            return ((38 + 14 - -36 + 48 ^ 116 + 85 - 179 + 169) & (0xD8 ^ 0xA2 ^ (0x17 ^ 0x5A) ^ -1)) != 0;
        }
        var9 = G.values();
        var10 = var9.length;
        var11 = var1[0];
        while (S.var4(var11, var10)) {
            var7 = var9[var11];
            if (S.var2(((G)var7).a(var6.az, var6.ax) ? 1 : 0)) {
                return var1[1];
            }
            ++var11;
            0;
            if ((0x12 ^ 0x2B ^ (0x8A ^ 0xB6)) != 0) continue;
            return ((174 + 46 - 90 + 69 ^ 113 + 32 - 63 + 54) & (112 + 76 - 167 + 185 ^ 110 + 34 - 55 + 40 ^ -1)) != 0;
        }
        return var1[0];
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }
}

