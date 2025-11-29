/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=133337)
public class EatingFoodTask
extends Task {
    
    private final  SquireBarrows O;
    private final  SquireBarrowsConfig P;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var2 = new String[var1[3]];
        l.var2[l.var1[0]] = "Eat";
        l.var2[l.var1[1]] = "Eat";
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (l.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (1 <= (0x18 ^ 0x32 ^ (0x69 ^ 0x47))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    static {
        l.var18();
        l.var4();
    }

    @Inject
    public EatingFoodTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.O = squireBarrows;
        this.P = squireBarrowsConfig;
    }

    private static boolean var19(int n2, int n3) {
        return n2 > n3;
    }

    private static void var18() {
        var1 = new int[4];
        l.var1[0] = (0x4F ^ 0x50 ^ (0xF1 ^ 0xA6)) & (64 + 96 - 153 + 187 ^ 83 + 89 - 122 + 88 ^ -1);
        l.var1[1] = 1;
        l.var1[2] = -(0xFFFF8D3D & 0x76F3) & (0xFFFFBFBF & 0x4FFF);
        l.var1[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        l var20;
        int var21;
        if (l.var3(this.O.h() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[l.var1[0]] = var1[2];
        if (l.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[1]];
            nArray2[l.var1[0]] = var1[2];
            Inventory.dropAll((int[])nArray2);
            0;
        }
        if (l.var19(var21 = Combat.getCurrentHealth(), var20.P.eatAtHp())) {
            return var1[0];
        }
        Item var22 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var1[1]];
            stringArray[l.var1[0]] = var2[var1[1]];
            return item.hasAction(stringArray);
        });
        if (l.var17(var22)) {
            return var1[0];
        }
        var2_2.interact(var2[var1[0]]);
        return var1[1];
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }
}

