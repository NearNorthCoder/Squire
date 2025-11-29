/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gorillas.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.Locations;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.gorillas.tasks.GorillasTaskBase;

@TaskDesc(name="Restoring stats", priority=101, blocking=true)
public class RestoringStatsTask
extends GorillasTaskBase {

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    private boolean M() {
        int var13;
        Item var14;
        void var15;
        int n2 = 1;
        Skill[] skillArray = Skill.values();
        int n3 = skillArray.length;
        int var16 = 1;
        while ((var16 < (int)var15)) {
            void var17 = var14[var16];
            if ((Skills.getBoostedLevel((Skivar17) < Skills.getLevel((Skivar17))) {
                var13 = 2;
            }
            ++var16;
            0;
            if (-1 < 1) continue;
            return ((0xE7 ^ 0xBB ^ (0x68 ^ 0x56)) & (75 + 7 - 27 + 112 ^ 16 + 20 - -54 + 107 ^ -1)) != 0;
        }
        if (var13 == 0) {
            return 1;
        }
        var14 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[6]));
        if var14 == null {
            return Combat.drinkBoostingPotion((int)4);
        }
        skillArray.interact(var1[5]);
        return 2;
    }

    @Inject
    public RestoringStatsTask(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    public boolean run() {
        m var18;
        if ((Locations.isRegionLoaded((int == 0)0) ? 1 : 0)) {
            return 1;
        }
        if ((var18.L( != 0) ? 1 : 0)) {
            return 2;
        }
        if ((var18.M( != 0) ? 1 : 0)) {
            return 2;
        }
        return this.K();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L() {
        void var1_1;
        if ((Combat.getMissingHealth( <= 0))) {
            return 1;
        }
        Item var19 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[2];
            stringArray[1] = var1[7];
            if (!(item.hasAction(stringArray == 0) ? 1 : 0) || (item.getName( != 0).startsWith(var1[8]) ? 1 : 0)) {
                n2 = 2;
                0;
                if (-(0x11 ^ 0x14) >= 0) {
                    return ((0x14 ^ 0x13) & ~(0x25 ^ 0x22)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var19 == null {
            return 1;
        }
        String[] stringArray = new String[3];
        stringArray[1] = var1[2];
        stringArray[2] = var1[3];
        var1_1.interact(stringArray);
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean K() {
        void var1_1;
        if ((Skills.getBoostedLevel((SkiSkill.PRAYER) >= Skills.getLevel((SkiSkill.PRAYER))) {
            return 1;
        }
        Item var20 = Inventory.getFirst(item -> {
            int n2;
            if (!(item.getName( == 0).startsWith(var1[9]) ? 1 : 0) || (item.getName( != 0).startsWith(var1[var2[10]]) ? 1 : 0)) {
                n2 = 2;
                0;
                if (2 > 2) {
                    return ((44 + 2 - -102 + 27 ^ 95 + 58 - 74 + 79) & (0xA1 ^ 0xA4 ^ (0x4E ^ 0x7A) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var20 == null {
            return 1;
        }
        var1_1.interact(var1[1]);
        return 2;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

}

