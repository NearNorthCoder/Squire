/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Eating food", priority=20)
public class EatingFoodTask
extends Task {
    private final  SquireSepulchre ak;
    private final  SquireSepulchreConfig al;

    private static boolean var3(int n2, int n3) {
        return n2 > n3;
    }

    static {
        O.var4();
        O.var5();
    }

    private static void var4() {
        var2 = new int[8];
        O.var2[0] = (22 + 22 - 3 + 205 ^ 39 + 85 - 99 + 157) & (71 + 105 - 126 + 84 ^ 194 + 88 - 191 + 107 ^ -1);
        O.var2[1] = 1;
        O.var2[2] = 3;
        O.var2[3] = 2;
        O.var2[4] = 0x68 ^ 0x6C;
        O.var2[5] = 0x5C ^ 0x59;
        O.var2[6] = 0x3D ^ 9 ^ (0x26 ^ 0x14);
        O.var2[7] = 0x58 ^ 0x3A ^ (0x62 ^ 8);
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (O.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (3 < (0x70 ^ 9 ^ (0xE3 ^ 0x9E))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        O var24;
        if (O.var23(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[O.var2[0]] = var1[var2[0]];
        if (O.var25(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            Item var26 = Inventory.getFirst(item -> {
                int n2;
                String[] stringArray = new String[var2[1]];
                stringArray[O.var2[0]] = var1[var2[4]];
                if (O.var25(item.hasAction(stringArray) ? 1 : 0) && O.var25(item.getName().equals(var1[var2[5]]) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if (1 < 0) {
                        return ((98 + 56 - 85 + 163 ^ 126 + 31 - 0 + 20) & (98 + 214 - 158 + 96 ^ 12 + 159 - 157 + 149 ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            });
            var26.interact(var1[var2[1]]);
            var24.sleep(var2[2]);
            return var2[1];
        }
        if (O.var3(Combat.getCurrentHealth(), var24.al.hpToEatAt())) {
            return var2[0];
        }
        Item item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var2[1]];
            stringArray[O.var2[0]] = var1[var2[2]];
            return item.hasAction(stringArray);
        });
        item2.interact(var1[var2[3]]);
        this.sleep(var2[2]);
        return var2[1];
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static void var5() {
        var1 = new String[var2[6]];
        O.var1[O.var2[0]] = "Monkfish";
        O.var1[O.var2[1]] = "Eat";
        O.var1[O.var2[3]] = "Eat";
        O.var1[O.var2[2]] = "Eat";
        O.var1[O.var2[4]] = "Eat";
        O.var1[O.var2[5]] = "Monkfish";
    }

    @Inject
    public EatingFoodTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.ak = squireSepulchre;
        this.al = squireSepulchreConfig;
    }

    private static boolean var25(int n2) {
        return n2 != 0;
    }
}

