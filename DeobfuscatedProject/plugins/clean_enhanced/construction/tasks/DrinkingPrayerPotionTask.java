/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Drinking prayer potion", priority=150)
public class DrinkingPrayerPotionTask
extends Task {
    private static  String[] lIlIIIllI;
    private static  int[] lIlIIIlll;
    private final  a al;
    private final  SquireCerberusConfig ak;

    private static void var1() {
        lIlIIIlll = new int[5];
        j.lIlIIIlll[0] = (0x89 ^ 0xA7) & ~(0x4E ^ 0x60);
        j.lIlIIIlll[1] = 1;
        j.lIlIIIlll[2] = 2;
        j.lIlIIIlll[3] = 3;
        j.lIlIIIlll[4] = 0xF ^ 7;
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    static {
        j.var1();
        j.var3();
    }

    private static boolean var4(Object object) {
        return object == null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var13(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        j var15;
        if (!j.var11(this.al.k()) || j.var4(this.al.k().y())) {
            return lIlIIIlll[0];
        }
        if (j.var13(Prayers.getPoints(), var15.ak.drinkAtPrayer()) && j.var14(var15.al.h().isEmpty() ? 1 : 0)) {
            return lIlIIIlll[0];
        }
        if (j.var13(Prayers.getPoints(), var15.ak.drinkAtPrayerGhost())) {
            return lIlIIIlll[0];
        }
        Item var16 = Inventory.getFirst(item -> {
            boolean bl2;
            if (!j.var2(item.getName().startsWith(lIlIIIllI[lIlIIIlll[1]]) ? 1 : 0) || j.var14(item.getName().startsWith(lIlIIIllI[lIlIIIlll[2]]) ? 1 : 0)) {
                bl2 = lIlIIIlll[1];
                0;
                if ((0x31 ^ 0x35) < -1) {
                    return ((0x9C ^ 0xC0) & ~(0x47 ^ 0x1B)) != 0;
                }
            } else {
                bl2 = lIlIIIlll[0];
            }
            return bl2;
        });
        if (j.var4(var16)) {
            return lIlIIIlll[0];
        }
        var1_1.interact(lIlIIIllI[lIlIIIlll[0]]);
        return lIlIIIlll[1];
    }

    private static void var3() {
        lIlIIIllI = new String[lIlIIIlll[3]];
        j.lIlIIIllI[j.lIlIIIlll[0]] = "Drink";
        j.lIlIIIllI[j.lIlIIIlll[1]] = "Prayer";
        j.lIlIIIllI[j.lIlIIIlll[2]] = "Super rest";
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = lIlIIIlll[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = lIlIIIlll[0];
        while (j.var12(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    @Inject
    private DrinkingPrayerPotionTask(SquireCerberusConfig squireCerberusConfig, a a2) {
        this.ak = squireCerberusConfig;
        this.al = a2;
    }
}

