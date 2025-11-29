/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import gg.squire.mixology.tasks.GameEnum6;
import gg.squire.mixology.tasks.GameEnum7;
import gg.squire.mixology.tasks.MixologyManager;

@TaskDesc(name="Mixing vessel")
public class MixingVesselTask
extends Task {
    private final  SquireMixologyConfig X;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var1 = new int[4];
        n.var1[0] = (0xFA ^ 0xA1) & ~(0x7E ^ 0x25);
        n.var1[1] = 0xFFFFFEDF & 0x2D6B;
        n.var1[2] = 1;
        n.var1[3] = -(0xFFFFDF4B & 0x26BD) & (0xFFFFDF6F & 0xFEFB);
    }

    private static void var5() {
        var2 = new String[var1[2]];
        n.var2[n.var1[0]] = "Taking from vessel";
    }

    static {
        n.var4();
        n.var5();
    }

    public boolean run() {
        n var6;
        if (n.var3(s.e() ? 1 : 0)) {
            return var1[0];
        }
        if (n.var7((Object)var6.X.pluginMode(), (Object)d.MINIGAME)) {
            return var1[0];
        }
        if (n.var3(SquireMixology.k) && n.var8(s.g() ? 1 : 0)) {
            return var1[0];
        }
        if (n.var8(SquireMixology.k)) {
            return var1[0];
        }
        if (n.var9((Object)var6.X.potionStrategy(), (Object)f.SINGLE_ORDER) && n.var8(s.f() ? 1 : 0)) {
            return var1[0];
        }
        if (n.var10(Vars.getBit((int)var1[1]), var1[2])) {
            return var1[0];
        }
        SquireMixology.g = var2[var1[0]];
        int[] nArray = new int[var1[2]];
        nArray[n.var1[0]] = var1[3];
        TileObjects.getNearest((int[])nArray).interact(var1[0]);
        return var1[0];
    }

    @Inject
    public MixingVesselTask(SquireMixologyConfig squireMixologyConfig) {
        this.X = squireMixologyConfig;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (n.var10(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var7(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static boolean var9(Object object, Object object2) {
        return object == object2;
    }
}

