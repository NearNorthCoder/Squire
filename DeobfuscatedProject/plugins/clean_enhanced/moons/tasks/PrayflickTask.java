/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import net.unethicalite.api.items.Inventory;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="PrayFlick", priority=0x7FFFFFFE)
public class PrayflickTask
extends Task {

    private final  SquireMoonsOfPerilConfig N;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var2 = new int[9];
        f.var2[0] = 1;
        f.var2[1] = (130 + 137 - 141 + 33 ^ 122 + 20 - -39 + 0) & (30 + 88 - 56 + 74 ^ 152 + 136 - 286 + 160 ^ -1);
        f.var2[2] = 2;
        f.var2[3] = 3;
        f.var2[4] = 0x6C ^ 0x68;
        f.var2[5] = 0x65 ^ 0x7B ^ (0x24 ^ 0x3F);
        f.var2[6] = 0x39 ^ 0x3F;
        f.var2[7] = 0x32 ^ 0x7E ^ (4 ^ 0x4F);
        f.var2[8] = 0x58 ^ 0x50;
    }

    private static boolean var10(int n) {
        return n >= 0;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[1];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[1];
        while (f.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (3 != -1) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    @Inject
    public PrayflickTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.N = squireMoonsOfPerilConfig;
    }

    private static boolean var22(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var23;
        void var24;
        double d2 = l.k();
        double d3 = this.N.eatAtHpPercent();
        String[] stringArray = new String[var2[0]];
        stringArray[f.var2[1]] = var1[var2[1]];
        if (f.var22(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[var2[0]];
            stringArray2[f.var2[1]] = var1[var2[0]];
            Inventory.getFirst((String[])stringArray2).interact(var1[var2[2]]);
            return var2[1];
        }
        if (f.var10(f.var25((double)var24, (double)var23))) {
            return var2[1];
        }
        String[] stringArray3 = new String[var2[0]];
        stringArray3[f.var2[1]] = var1[var2[3]];
        if (f.var22(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
            System.out.println(var1[var2[4]]);
            SquireMoonsOfPeril.g = var1[var2[5]];
            String[] stringArray4 = new String[var2[0]];
            stringArray4[f.var2[1]] = var1[var2[6]];
            Inventory.getFirst((String[])stringArray4).interact(var1[var2[7]]);
            return var2[0];
        }
        return var2[0];
    }

    private static int var25(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static void var26() {
        var1 = new String[var2[8]];
        f.var1[f.var2[1]] = "Vial";
        f.var1[f.var2[0]] = "Vial";
        f.var1[f.var2[2]] = "Drop";
        f.var1[f.var2[3]] = "Cooked bream";
        f.var1[f.var2[4]] = "Eating";
        f.var1[f.var2[5]] = "Eating";
        f.var1[f.var2[6]] = "Cooked bream";
        f.var1[f.var2[7]] = "Eat";
    }

    static {
        f.var9();
        f.var26();
    }

    private static boolean var20(int n, int n2) {
        return n < n2;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }
}

