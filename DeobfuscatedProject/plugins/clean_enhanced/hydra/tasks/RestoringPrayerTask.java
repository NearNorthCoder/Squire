/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Restoring prayer", priority=20)
public class RestoringPrayerTask
extends Task {
    private final  SquireAlchemicalHydraConfig as;

    private final  a ar;

    private static boolean var3(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public RestoringPrayerTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.ar = a2;
        this.as = squireAlchemicalHydraConfig;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (p.var5(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (1 < (0xB3 ^ 0xB7)) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var22() {
        var2 = new String[var1[4]];
        p.var2[p.var1[0]] = "Drink";
        p.var2[p.var1[1]] = "Drink";
        p.var2[p.var1[2]] = "prayer";
        p.var2[p.var1[3]] = "restore";
    }

    static {
        p.var23();
        p.var22();
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var25;
        if (p.var24(this.ar.g() ? 1 : 0)) {
            return var1[0];
        }
        if (p.var3(Skills.getBoostedLevel((SkiSkill.PRAYER), var25.as.restorePrayAt())) {
            return var1[0];
        }
        Item var26 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[var1[1]];
            stringArray[p.var1[0]] = var2[var1[1]];
            if (p.var27(item.hasAction(stringArray) ? 1 : 0) && (!p.var24(item.getName().toLowerCase().contains(var2[var1[2]]) ? 1 : 0) || p.var27(item.getName().toLowerCase().contains(var2[var1[3]]) ? 1 : 0))) {
                n2 = var1[1];
                0;
                if ((0x4A ^ 0x2D ^ (0x1A ^ 0x79)) < ((0xEA ^ 0x9D ^ (0x49 ^ 0x37)) & (0x8F ^ 0xAE ^ (0xEA ^ 0xC2) ^ -1))) {
                    return ((0x9B ^ 0xA2 ^ (0x43 ^ 0x63)) & (54 + 115 - 107 + 72 ^ 0 + 133 - 77 + 103 ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (p.var4(var26)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[1];
    }

    private static boolean var27(int n2) {
        return n2 != 0;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static void var23() {
        var1 = new int[6];
        p.var1[0] = (105 + 75 - 134 + 129 ^ 71 + 111 - 147 + 143) & (99 + 55 - 27 + 17 ^ 102 + 95 - 128 + 72 ^ -1);
        p.var1[1] = 1;
        p.var1[2] = 2;
        p.var1[3] = 3;
        p.var1[4] = 0xB8 ^ 0xAC ^ (0x26 ^ 0x36);
        p.var1[5] = 0x68 ^ 0x60;
    }
}

