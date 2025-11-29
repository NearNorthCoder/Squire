/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Drinking Ambrosia", priority=105)
public class DrinkingAmbrosiaTask
extends AutotoaManager {
    private final  C cE;

    private final  SquireAutoTOA cF;

    static {
        ad.var3();
        ad.var4();
    }

    private static boolean var5(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected DrinkingAmbrosiaTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cE = c2;
        this.cF = squireAutoTOA;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var2 = new int[5];
        ad.var2[0] = (0x23 ^ 0x79 ^ (0xAB ^ 0xB3)) & (0xB8 ^ 0x97 ^ (0x44 ^ 0x29) ^ -1);
        ad.var2[1] = 0x18 ^ 0x12 ^ (0x7D ^ 0x63);
        ad.var2[2] = 0x1E ^ 0x66 ^ (0x47 ^ 0x12);
        ad.var2[3] = 0x94 ^ 0xA6;
        ad.var2[4] = 1;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var2[0];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var2[0];
        while (ad.var17(var16, var15)) {
            char var18 = var14[var16];
            var11.append((char)(var18 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var1 = new String[var2[4]];
        ad.var1[ad.var2[0]] = "Drink";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        int var20;
        int n2;
        ad var21;
        if (ad.var7(this.cF.e() ? 1 : 0)) {
            return var2[0];
        }
        if (ad.var19(var21.aq() ? 1 : 0)) {
            return var2[0];
        }
        if (ad.var19(var21.cE.am() ? 1 : 0)) {
            return var2[0];
        }
        if (ad.var7(Inventory.contains(item -> e.NECTAR.d(item.getId())) ? 1 : 0)) {
            n2 = var2[1];
            0;
            if (-1 != -1) {
                return (3 & ~3) != 0;
            }
        } else {
            n2 = var20 = var2[2];
        }
        if (ad.var7(var21.bf() ? 1 : 0)) {
            var20 = var2[3];
        }
        if (ad.var5(Combat.getCurrentHealth(), var20)) {
            return var2[0];
        }
        Item var22 = Inventory.getFirst(item -> e.AMBROSIA.d(item.getId()));
        if (ad.var6(var22)) {
            return var2[0];
        }
        var2_2.interact(var1[var2[0]]);
        this.cE.ao();
        return var2[4];
    }
}

