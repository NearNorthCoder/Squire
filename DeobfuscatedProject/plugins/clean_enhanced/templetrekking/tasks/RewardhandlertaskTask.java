/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="RewardHandlerTask", priority=10, blocking=true)
public class RewardhandlertaskTask
extends Task {

    private final  String[] N;
    private final  TempleTrekkingConfig M;
    private final  TempleTrekkingPlugin L;

    private static void var3() {
        var1 = new int[18];
        o.var1[0] = 0x4F ^ 0x48;
        o.var1[1] = (0x87 ^ 0xC7) & ~(0x70 ^ 0x30);
        o.var1[2] = 1;
        o.var1[3] = 2;
        o.var1[4] = 3;
        o.var1[5] = 0x2D ^ 0x4A ^ (0x7F ^ 0x1C);
        o.var1[6] = 0xBB ^ 0x8A ^ (0xA4 ^ 0x90);
        o.var1[7] = 0 ^ 0x6E ^ (0x55 ^ 0x3D);
        o.var1[8] = 0x46 ^ 0x4E;
        o.var1[9] = 0x4D ^ 0x44;
        o.var1[10] = 0xFFFFF95E & 0x7B3;
        o.var1[11] = 0xBC ^ 0xB7;
        o.var1[12] = 26 + 85 - 86 + 149 ^ 154 + 120 - 191 + 81;
        o.var1[13] = 140 + 62 - 20 + 3 ^ 13 + 135 - 99 + 132;
        o.var1[14] = 155 + 186 - 249 + 108 ^ 56 + 21 - 29 + 149;
        o.var1[15] = 0x10 ^ 0x5C ^ (0x21 ^ 0x63);
        o.var1[16] = 7 ^ 0x76 ^ (0x5C ^ 0x22);
        o.var1[17] = 0x69 ^ 0x79;
    }

    static {
        o.var3();
        o.var4();
    }

    @Inject
    public RewardhandlertaskTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        String[] stringArray = new String[var1[0]];
        stringArray[o.var1[1]] = var2[var1[1]];
        stringArray[o.var1[2]] = var2[var1[2]];
        stringArray[o.var1[3]] = var2[var1[3]];
        stringArray[o.var1[4]] = var2[var1[4]];
        stringArray[o.var1[5]] = var2[var1[5]];
        stringArray[o.var1[6]] = var2[var1[6]];
        stringArray[o.var1[7]] = var2[var1[7]];
        this.N = stringArray;
        this.L = templeTrekkingPlugin;
        this.M = templeTrekkingConfig;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var2 = new String[var1[17]];
        o.var2[o.var1[1]] = "Agility tome";
        o.var2[o.var1[2]] = "Firemaking tome";
        o.var2[o.var1[3]] = "Fishing tome";
        o.var2[o.var1[4]] = "Mining tome";
        o.var2[o.var1[5]] = "Slayer tome";
        o.var2[o.var1[6]] = "Thieving tome";
        o.var2[o.var1[7]] = "Woodcutting tome";
        o.var2[o.var1[0]] = "Read";
        o.var2[o.var1[8]] = "Reward token";
        o.var2[o.var1[9]] = "Reward token";
        o.var2[o.var1[12]] = "Claiming rewards";
        o.var2[o.var1[11]] = "Claim";
        o.var2[o.var1[13]] = "Selecting rewards";
        o.var2[o.var1[14]] = "Details";
        o.var2[o.var1[15]] = "Opening interface";
        o.var2[o.var1[16]] = "Look-at";
    }

    private static boolean var20(Object object) {
        return object != null;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var1[1];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var1[1];
        while (o.var13(var29, var28)) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            
            return null;
        }
        return String.valueOf(var24);
    }

    public boolean run() {
        Item item;
        if (o.var5(this.M.bankXPTomes() ? 1 : 0) && o.var6(Inventory.contains((String[])this.N) ? 1 : 0) && o.var20(item = Inventory.getFirst((String[])this.N))) {
            item.interact(var2[var1[0]]);
            return var1[2];
        }
        String[] stringArray = new String[var1[2]];
        stringArray[o.var1[1]] = var2[var1[8]];
        if (o.var5(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return var1[1];
        }
        String[] stringArray2 = new String[var1[2]];
        stringArray2[o.var1[1]] = var2[var1[9]];
        Item var31 = Inventory.getFirst((String[])stringArray2);
        if (o.var20(var31)) {
            o var32;
            Widget var33 = Widgets.get((int)var1[10], (int)var1[11]);
            if (o.var20(var33) && o.var6(var33.isVisible() ? 1 : 0)) {
                System.out.println(var2[var1[12]]);
                var33.interact(var2[var1[11]]);
                return var1[2];
            }
            int var34 = var32.M.reward().x();
            Widget var35 = Widgets.get((int)var1[10], (int)var1[7], (int)var34);
            if (o.var20(var35)) {
                System.out.println(var2[var1[13]]);
                var35.interact(var2[var1[14]]);
                return var1[2];
            }
            System.out.println(var2[var1[15]]);
            var31.interact(var2[var1[16]]);
            return var1[2];
        }
        return var1[1];
    }
}

