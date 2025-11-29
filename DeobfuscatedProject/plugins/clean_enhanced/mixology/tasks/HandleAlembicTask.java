/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import gg.squire.mixology.tasks.GameEnum6;
import gg.squire.mixology.tasks.GameEnum7;
import gg.squire.mixology.tasks.MixologyManager;

@TaskDesc(name="Handle alembic")
public class HandleAlembicTask
extends Task {
    private final  SquireMixologyConfig T;

     int S;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        k var4;
        if (k.var5(s.e() ? 1 : 0)) {
            return var2[1];
        }
        if (k.var6((Object)var4.T.pluginMode(), (Object)d.MINIGAME)) {
            return var2[1];
        }
        if (k.var5(s.a(var2[2], var2[3], var2[4]) ? 1 : 0)) {
            return var2[1];
        }
        if (k.var5(Players.getLocal().isIdle() ? 1 : 0)) {
            return var2[1];
        }
        if (k.var7((Object)var4.T.potionStrategy(), (Object)f.MULTI_ORDER)) {
            if (k.var5(s.g() ? 1 : 0) && k.var3(Vars.getBit((int)var2[3]), var2[5])) {
                return var2[1];
            }
            s.j();
            if (k.var8(SquireMixology.x, var4.S)) {
                return var2[1];
            }
        }
        if (k.var6((Object)var4.T.potionStrategy(), (Object)f.MULTI_ORDER) && k.var8(SquireMixology.r, var4.S)) {
            return var2[1];
        }
        SquireMixology.g = var1[var2[1]];
        int[] nArray = new int[var2[5]];
        nArray[k.var2[1]] = var2[4];
        TileObjects.getNearest((int[])nArray).interact(var2[1]);
        return var2[1];
    }

    private static boolean var6(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var8(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var7(Object object, Object object2) {
        return object == object2;
    }

    private static void var9() {
        var2 = new int[6];
        k.var2[0] = 0xFFFFDE6B & 0x37BD;
        k.var2[1] = (0x67 ^ 0x5F) & ~(0xA4 ^ 0x9C);
        k.var2[2] = 0xFFFFBBDF & 0x4FAB;
        k.var2[3] = -(0xFFFFDBBB & 0x76DF) & (0xFFFFFEDB & 0x7FFE);
        k.var2[4] = -(0xFFFFB731 & 0x6DEF) & (0xFFFFFDFF & 0xFF7F);
        k.var2[5] = 1;
    }

    @Inject
    public HandleAlembicTask(SquireMixologyConfig squireMixologyConfig) {
        this.S = var2[0];
        this.T = squireMixologyConfig;
    }

    static {
        k.var9();
        k.var10();
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[1];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[1];
        while (k.var3(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (1 <= (0x97 ^ 0x93)) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void var10() {
        var1 = new String[var2[5]];
        k.var1[k.var2[1]] = "Crystalising";
    }
}

