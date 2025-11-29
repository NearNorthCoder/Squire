/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.HunterManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Teasing Animal", priority=10, blocking=true)
public class TeasingAnimalTask
extends HunterManager {
    public static final  int G;

    private static void var3() {
        var2 = new int[4];
        z.var2[0] = -1 & (0xFFFFAFFF & 0x5BFB);
        z.var2[1] = 0x1E ^ 0xE ^ (0xB1 ^ 0xA5);
        z.var2[2] = ((0xB6 ^ 0xAD) & ~(0x62 ^ 0x79) ^ (0x3A ^ 0x7C)) & (0x7D ^ 0x78 ^ (6 ^ 0x45) ^ -1);
        z.var2[3] = 1;
    }

    static {
        z.var3();
        z.var4();
        G = var2[0];
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public TeasingAnimalTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var3_3;
        z var6;
        if (z.var7(Players.getLocal().getAnimation(), var2[0])) {
            this.sleep(var2[1]);
            return var2[2];
        }
        TileObject var8 = var6.F();
        if (z.var9(var8)) {
            return var2[2];
        }
        NPC var10 = var6.E();
        if (z.var11(var10)) {
            return var2[2];
        }
        NPC var12 = var6.D();
        if (z.var9(var12)) {
            return var2[2];
        }
        if (z.var13(((GameObject)var8).getWorldArea().contains(var12.getWorldLocation()) ? 1 : 0)) {
            return var2[2];
        }
        var3_3.interact(var1[var2[2]]);
        return var2[3];
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new String[var2[3]];
        z.var1[z.var2[2]] = "Tease";
    }

    private static boolean var7(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var2[2];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var2[2];
        while (z.var5(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }
}

