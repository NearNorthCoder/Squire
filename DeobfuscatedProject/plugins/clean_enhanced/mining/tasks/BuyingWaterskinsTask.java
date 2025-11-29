/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.MiningTaskBase;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;

@TaskDesc(name="Buying waterskins", priority=20, blocking=true)
public class BuyingWaterskinsTask
extends MiningTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    protected BuyingWaterskinsTask(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }

    private static void var9() {
        var2 = new String[var1[6]];
        O.var2[O.var1[0]] = "Buy-pass";
        O.var2[O.var1[1]] = "Trade";
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (O.var10(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((0x43 ^ 0x61 ^ (0x3F ^ 0x18)) != 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var22(int n2) {
        return n2 != 0;
    }

    static {
        O.var23();
        O.var9();
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    private static void var23() {
        var1 = new int[7];
        O.var1[0] = (142 + 80 - 147 + 116 ^ 36 + 109 - 52 + 50) & (0x21 ^ 0x25 ^ (0x22 ^ 0x16) ^ -1);
        O.var1[1] = 1;
        O.var1[2] = 0xFFFFFB8B & 0x2DFE;
        O.var1[3] = -(0xFFFFDA59 & 0x3DA7) & (0xFFFFDF7E & 0x3FBF);
        O.var1[4] = -(0xFFFFDD25 & 0x7ADB) & (0xFFFFDF3F & 0x7FE7);
        O.var1[5] = -(0xFFFFFCC9 & 0x2BB7) & (0xFFFFEF9F & 0x3FFF);
        O.var1[6] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (!O.var24(this.z() ? 1 : 0) || O.var25(this.y())) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[O.var1[0]] = var1[2];
        NPC var26 = NPCs.getNearest((int[])nArray);
        if (O.var11(var26)) {
            return var1[0];
        }
        int[] nArray2 = new int[var1[1]];
        nArray2[O.var1[0]] = var1[3];
        if (O.var24(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            var26.interact(var2[var1[0]]);
            return var1[1];
        }
        if (O.var22(Shop.isOpen() ? 1 : 0)) {
            int[] nArray3 = new int[var1[1]];
            nArray3[O.var1[0]] = var1[4];
            if (O.var22(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                Shop.sellFifty((int)var1[4]);
                return var1[1];
            }
            Shop.buyFifty((int)var1[5]);
            return var1[1];
        }
        var1_1.interact(var2[var1[1]]);
        return var1[1];
    }

    private static boolean var25(int n2) {
        return n2 > 0;
    }
}

