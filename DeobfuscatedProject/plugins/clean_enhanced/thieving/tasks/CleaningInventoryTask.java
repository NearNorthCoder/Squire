/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.util.List;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Cleaning inventory", priority=100, blocking=true)
public class CleaningInventoryTask
extends ThievingTaskBase {

    public static final  List<String> af;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public CleaningInventoryTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void var4() {
        var2 = new String[var1[24]];
        u.var2[u.var1[1]] = "Yes";
        u.var2[u.var1[0]] = "Dismantle";
        u.var2[u.var1[5]] = "Drop";
        u.var2[u.var1[6]] = "Yes";
        u.var2[u.var1[8]] = "Opal bolt tips";
        u.var2[u.var1[9]] = "Pearl bolt tips";
        u.var2[u.var1[10]] = "Emerald bolt tips";
        u.var2[u.var1[11]] = "Jade bolt tips";
        u.var2[u.var1[12]] = "Sapphire bolt tips";
        u.var2[u.var1[13]] = "Strawberry seed";
        u.var2[u.var1[14]] = "Mushroom spore";
        u.var2[u.var1[15]] = "Marrentill seed";
        u.var2[u.var1[16]] = "Jangerberry seed";
        u.var2[u.var1[17]] = "Tarromin seed";
        u.var2[u.var1[18]] = "Wildblood seed";
        u.var2[u.var1[19]] = "Harralander seed";
        u.var2[u.var1[20]] = "Belladonna seed";
        u.var2[u.var1[7]] = "Cactus seed";
        u.var2[u.var1[21]] = "Poison ivy seed";
        u.var2[u.var1[22]] = "Lantadyme seed";
        u.var2[u.var1[23]] = "Xerician fabric";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[1];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[1];
        while (u.var3(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (((0x1F ^ 0x3E ^ (0xE4 ^ 0x80)) & (193 + 167 - 228 + 122 ^ 86 + 71 - 140 + 170 ^ -1)) < 2) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    @Override
    public boolean l() {
        if (u.var21(Dialog.isOpen() ? 1 : 0)) {
            if (u.var21(Dialog.hasOption(string -> string.contains(var2[var1[6]])) ? 1 : 0)) {
                String[] stringArray = new String[var1[0]];
                stringArray[u.var1[1]] = var2[var1[1]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return var1[0];
            }
            return var1[1];
        }
        if (!u.var22(Players.getLocal().getAnimation(), var1[2]) || u.var23(Players.getLocal().getAnimation(), var1[3])) {
            return var1[1];
        }
        int[] nArray = new int[var1[0]];
        nArray[u.var1[1]] = var1[4];
        if (u.var21(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[0]];
            nArray2[u.var1[1]] = var1[4];
            Inventory.getFirst((int[])nArray2).interact(var2[var1[0]]);
            return var1[0];
        }
        if (u.var21(Inventory.contains(item -> af.contains(item.getName())) ? 1 : 0)) {
            Inventory.getFirst(item -> af.contains(item.getName())).interact(var2[var1[5]]);
            return var1[0];
        }
        return var1[1];
    }

    private static void var24() {
        var1 = new int[25];
        u.var1[0] = 1;
        u.var1[1] = (0x3B ^ 0x1A) & ~(0xA4 ^ 0x85);
        u.var1[2] = -(0xFFFFD9E7 & 0x7F3F) & (0xFFFFFFBF & 0x5B7F);
        u.var1[3] = 0xFFFFEE19 & 0x13FE;
        u.var1[4] = 0xFFFFF6DC & 0x3D73;
        u.var1[5] = 2;
        u.var1[6] = 3;
        u.var1[7] = 0x91 ^ 0x80;
        u.var1[8] = 0x21 ^ 0x25;
        u.var1[9] = 124 + 12 - 122 + 136 ^ 18 + 141 - 30 + 18;
        u.var1[10] = 0x60 ^ 0x77 ^ (0x6F ^ 0x7E);
        u.var1[11] = 0xA ^ 0xD;
        u.var1[12] = 112 + 111 - 208 + 134 ^ 39 + 143 - 99 + 74;
        u.var1[13] = 0x90 ^ 0x99;
        u.var1[14] = 0xA3 ^ 0xC2 ^ (0x66 ^ 0xD);
        u.var1[15] = 0 ^ 0xB;
        u.var1[16] = 0xC3 ^ 0xC5 ^ (0xB ^ 1);
        u.var1[17] = 0x58 ^ 0x55;
        u.var1[18] = 0xB9 ^ 0xB7;
        u.var1[19] = 0x22 ^ 0x54 ^ (0xBA ^ 0xC3);
        u.var1[20] = 0xDD ^ 0x89 ^ (0xE4 ^ 0xA0);
        u.var1[21] = 0x46 ^ 0x54;
        u.var1[22] = 0x12 ^ 3 ^ 2;
        u.var1[23] = 0xB4 ^ 0xA0;
        u.var1[24] = 0xC3 ^ 0xAF ^ (0x6E ^ 0x17);
    }

    private static boolean var21(int n2) {
        return n2 != 0;
    }

    static {
        u.var24();
        u.var4();
        String[] stringArray = new String[var1[7]];
        stringArray[u.var1[1]] = var2[var1[8]];
        stringArray[u.var1[0]] = var2[var1[9]];
        stringArray[u.var1[5]] = var2[var1[10]];
        stringArray[u.var1[6]] = var2[var1[11]];
        stringArray[u.var1[8]] = var2[var1[12]];
        stringArray[u.var1[9]] = var2[var1[13]];
        stringArray[u.var1[10]] = var2[var1[14]];
        stringArray[u.var1[11]] = var2[var1[15]];
        stringArray[u.var1[12]] = var2[var1[16]];
        stringArray[u.var1[13]] = var2[var1[17]];
        stringArray[u.var1[14]] = var2[var1[18]];
        stringArray[u.var1[15]] = var2[var1[19]];
        stringArray[u.var1[16]] = var2[var1[20]];
        stringArray[u.var1[17]] = var2[var1[7]];
        stringArray[u.var1[18]] = var2[var1[21]];
        stringArray[u.var1[19]] = var2[var1[22]];
        stringArray[u.var1[20]] = var2[var1[23]];
        af = List.of(stringArray);
    }

    private static boolean var22(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static boolean var23(int n2, int n3) {
        return n2 == n3;
    }
}

