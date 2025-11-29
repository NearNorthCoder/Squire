/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.MiningTaskBase;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Going back through pass", priority=100, blocking=true)
public class GoingBackThroughPassTask
extends MiningTaskBase {

    private static void var3() {
        var2 = new String[var1[1]];
        P.var2[P.var1[0]] = "Go-through";
    }

    private static void var4() {
        var1 = new int[3];
        P.var1[0] = (142 + 88 - 220 + 197 ^ 100 + 25 - 70 + 139) & (58 + 57 - 100 + 145 ^ 138 + 41 - 40 + 34 ^ -1);
        P.var1[1] = 1;
        P.var1[2] = -1 & (0xFFFFE5FE & 0xBB6F);
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    static {
        P.var4();
        P.var3();
    }

    @Inject
    protected GoingBackThroughPassTask(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (P.var6(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (!P.var17(this.y()) || P.var17(this.z() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[P.var1[0]] = var1[2];
        TileObject var18 = TileObjects.getNearest((int[])nArray);
        if (P.var5(var18)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[1];
    }
}

