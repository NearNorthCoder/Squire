/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.minigames.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.tasks.FHelper;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Eat Task", priority=100)
public class EatTask
extends Task {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        String[] stringArray = new String[0];
        stringArray[1] = var2[1];
        if ((Inventory.contains((String[] != 0)stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[0];
            stringArray2[1] = var2[0];
            Inventory.getFirst((String[])stringArray2).interact(var2[2]);
            return 1;
        }
        Item var9 = Inventory.getFirst(item -> item.getName().contains(var2[var1[16]]));
        if (var9 != null && (!(Combat.getMissingHealth() < 3) || (Skills.getBoostedLevel((SkiSkill.ATTACK) < Skills.getLevel((SkiSkill.ATTACK)) && (Skills.getBoostedLevel((SkiSkill.HITPOINTS) < Skills.getLevel((SkiSkill.HITPOINTS)))) {
            Item var10 = Inventory.getFirst(item -> {
                String[] stringArray = new String[0];
                stringArray[1] = var2[var1[15]];
                return item.hasAction(stringArray);
            });
            if var10 != null {
                i var11;
                var10.interact(var2[4]);
                var11.sleep(0);
            }
            var9.interact(var2[5]);
            return 1;
        }
        Item var10 = Inventory.getFirst(item -> {
            boolean bl;
            if (!(item.getName( == 0).contains(var2[var1[13]]) ? 1 : 0) || (item.getName( != 0).contains(var2[var1[14]]) ? 1 : 0)) {
                bl = 0;
                0;
                if (1 >= (0x99 ^ 0x9D)) {
                    return ((0xCF ^ 0xC1) & ~(0xA6 ^ 0xA8)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
        if (var10 != null && (!(Prayers.getPoints() > 6) || (Skills.getBoostedLevel((SkiSkill.RANGED) < Skills.getLevel((SkiSkill.RANGED)))) {
            var10.interact(var2[7]);
            return 1;
        }
        Item var12 = Inventory.getFirst(item -> {
            boolean bl;
            if (!(item.getName( == 0).contains(var2[var1[11]]) ? 1 : 0) || (item.getName( != 0).contains(var2[var1[12]]) ? 1 : 0)) {
                bl = 0;
                0;
                if (3 < -1) {
                    return ((0x19 ^ 0x51) & ~(0x5B ^ 0x13)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
        if (var12 != null && (Static.getClient( != 0).isInInstancedRegion() ? 1 : 0) && (f.p() >= 8) && (Skills.getBoostedLevel((SkiSkill.RANGED) <= Skills.getLevel((SkiSkill.RANGED) + 5)) {
            var12.interact(var2[6]);
            return 1;
        }
        if ((i.var13(Combat.getHealthPercent( >= 0), 58.0))) {
            return 1;
        }
        Item var14 = Inventory.getFirst(item -> {
            String[] stringArray = new String[0];
            stringArray[1] = var2[var1[10]];
            return item.hasAction(stringArray);
        });
        if var14 != null {
            var14.interact(var2[9]);
            return 1;
        }
        return 1;
    }

    private static int var13(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = 1;
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = 1;
        while (var29 < var28) {
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

}

