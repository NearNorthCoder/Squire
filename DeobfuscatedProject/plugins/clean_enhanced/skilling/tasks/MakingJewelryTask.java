/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Making Jewelry")
public class MakingJewelryTask
extends SkillingManager {

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public Map<Integer, Integer> g() {
        if (C.var3(this.j.jewelryProduct().H(), var1[0])) {
            return Map.of(this.j.jewelryProduct().z(), var1[1], this.j.jewelryProduct().I(), var1[1]);
        }
        return Map.of(this.j.jewelryProduct().z(), var1[1], this.j.jewelryProduct().H(), var1[1], this.j.jewelryProduct().I(), var1[1]);
    }

    private static void var4() {
        var1 = new int[8];
        C.var1[0] = -1;
        C.var1[1] = 1;
        C.var1[2] = 86 + 77 - 160 + 138 ^ 67 + 54 - 89 + 107;
        C.var1[3] = 0xFFFF97BF & 0x69FE;
        C.var1[4] = (0x36 ^ 7 ^ (0x60 ^ 0x66)) & (0x4F ^ 0x6A ^ (0x70 ^ 0x62) ^ -1);
        C.var1[5] = 77 + 23 - 39 + 128 ^ 51 + 162 - 195 + 166;
        C.var1[6] = 2;
        C.var1[7] = 0xB7 ^ 0xA9 ^ (0x89 ^ 0x9F);
    }

    @Inject
    public MakingJewelryTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.JEWELRY);
    }

    @Override
    public int i() {
        return var1[5];
    }

    static {
        C.var4();
        C.var5();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var6;
        void var7;
        Widget widget = Widgets.get((int)var1[2], (int)var1[1]);
        Widget widget2 = Widgets.get((int)var1[3], (int)var1[4]);
        if (C.var8(widget)) {
            System.out.println("Group: " + this.j.jewelryProduct().J());
            System.out.println("ID: " + this.j.jewelryProduct().K());
            System.out.println("Option: " + this.j.jewelryProduct().L());
            Widgets.get((int)this.j.jewelryProduct().J(), (int)this.j.jewelryProduct().K()).interact(this.j.jewelryProduct().L());
        }
        if (C.var8(var7)) {
            C var9;
            System.out.println("Group: " + var9.j.jewelryProduct().J());
            System.out.println("ID: " + var9.j.jewelryProduct().K());
            System.out.println("Option: " + var9.j.jewelryProduct().L());
            Widgets.get((int)var9.j.jewelryProduct().J(), (int)var9.j.jewelryProduct().K()).interact(var1[4]);
        }
        if (C.var10(var6) && C.var10(var7)) {
            TileObject var11 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (C.var8(tileObject.getActions())) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[C.var1[4]] = var2[var1[1]];
                    if (C.var12(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if null == null return n2 != 0;
                        return ((0x1C ^ 0x4B) & ~(0x43 ^ 0x14)) != 0;
                    }
                }
                n2 = var1[4];
                return n2 != 0;
            });
            if (C.var10(var11)) {
                return var1[4];
            }
            var11.interact(var2[var1[4]]);
        }
        return var1[1];
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static void var5() {
        var2 = new String[var1[6]];
        C.var2[C.var1[4]] = "Smelt";
        C.var2[C.var1[1]] = "Smelt";
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[4];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[4];
        while (C.var19(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static boolean var10(Object object) {
        return object == null;
    }
}

