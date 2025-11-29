/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Drinking boost", priority=11)
public class DrinkingBoostTask
extends NightmareManager {

    @Inject
    protected DrinkingBoostTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static boolean var3(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (ap.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (((0xCB ^ 0x87) & ~(0xD9 ^ 0x95)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    private static void var22() {
        var1 = new int[11];
        ap.var1[0] = (4 ^ 0x78 ^ (0x63 ^ 0x25)) & (89 + 54 - -32 + 14 ^ 42 + 113 - 41 + 21 ^ -1);
        ap.var1[1] = 1;
        ap.var1[2] = 3;
        ap.var1[3] = 2;
        ap.var1[4] = 0x8B ^ 0x8E;
        ap.var1[5] = 148 + 97 - 213 + 145 ^ 58 + 42 - 40 + 130;
        ap.var1[6] = 0x48 ^ 0x2C ^ (0x5D ^ 0x4E) & ~(0x1D ^ 0xE);
        ap.var1[7] = 0x66 ^ 0x62;
        ap.var1[8] = 135 + 19 - 24 + 59 ^ 36 + 177 - 60 + 34;
        ap.var1[9] = 0xBA ^ 0xBD;
        ap.var1[10] = 0x6B ^ 0x63;
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    public int a(Skill skill) {
        return var1[4] + Skills.getLevel((Skiskill) * var1[5] / var1[6];
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static void var24() {
        var2 = new String[var1[9]];
        ap.var2[ap.var1[0]] = "Attack";
        ap.var2[ap.var1[1]] = "Drink";
        ap.var2[ap.var1[3]] = "Drink";
        ap.var2[ap.var1[2]] = "super attack";
        ap.var2[ap.var1[7]] = "super attack";
        ap.var2[ap.var1[4]] = "combat pot";
        ap.var2[ap.var1[8]] = "super strength";
    }

    @Override
    public boolean bY() {
        ap var25;
        if (ap.var21(this.cL.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (ap.var23(var25.cM.aq() ? 1 : 0)) {
            return var1[0];
        }
        if (ap.var21(var25.bZ() ? 1 : 0)) {
            return var1[0];
        }
        NPC var26 = SquireNightmarePlugin.d();
        if (ap.var27(var26)) {
            return var1[0];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[ap.var1[0]] = var2[var1[0]];
        if (ap.var21(var26.hasAction(stringArray) ? 1 : 0)) {
            return var1[0];
        }
        Item var28 = Inventory.getFirst(item -> {
            boolean bl;
            if (!ap.var21(item.getName().toLowerCase().contains(var2[var1[4]]) ? 1 : 0) || ap.var23(item.getName().toLowerCase().contains(var2[var1[8]]) ? 1 : 0)) {
                bl = var1[1];
                0;
                if ((49 + 4 - 34 + 132 ^ 94 + 50 - 99 + 101) <= 0) {
                    return ((0xD3 ^ 0x9A ^ (0x6A ^ 0x73)) & (0xE4 ^ 0x83 ^ (0xB0 ^ 0x87) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
        if (ap.var27(var28)) {
            return var1[0];
        }
        int var29 = (int)(0.5 * (double)var25.a(Skill.STRENGTH));
        if (ap.var3(Skills.getLevel((SkiSkill.STRENGTH) + var29, Skills.getBoostedLevel((SkiSkill.STRENGTH))) {
            var28.interact(var2[var1[1]]);
            var25.sleep(var1[2]);
            return var1[1];
        }
        int var30 = (int)(0.5 * (double)var25.a(Skill.ATTACK));
        if (ap.var23(Inventory.contains(item -> {
            int n3;
            if (ap.var23(item.getName().toLowerCase().contains(var2[var1[7]]) ? 1 : 0) && ap.var3(Skills.getLevel((SkiSkill.ATTACK) + var30, Skills.getBoostedLevel((SkiSkill.ATTACK))) {
                n3 = var1[1];
                0;
                if (-3 > 0) {
                    return ((0xFF ^ 0xA0) & ~(0xE9 ^ 0xB6)) != 0;
                }
            } else {
                n3 = var1[0];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            Item var31 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[2]]));
            var31.interact(var2[var1[3]]);
            var25.sleep(var1[2]);
            return var1[1];
        }
        return var1[0];
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    static {
        ap.var22();
        ap.var24();
    }

    private static boolean var27(Object object) {
        return object == null;
    }
}

