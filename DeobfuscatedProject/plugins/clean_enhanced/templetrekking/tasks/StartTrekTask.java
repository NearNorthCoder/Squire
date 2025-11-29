/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.util.regex.Pattern;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Start trek task")
public class StartTrekTask
extends Task {
     Pattern X;
     WorldArea Y;
    private final  TempleTrekkingConfig W;

    private final  TempleTrekkingPlugin V;

    @Inject
    public StartTrekTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        this.X = Pattern.compile(var2[var1[0]]);
        this.Y = new WorldArea(new WorldPoint(var1[1], var1[2], var1[0]), new WorldPoint(var1[3], var1[4], var1[0]));
        this.W = templeTrekkingConfig;
        this.V = templeTrekkingPlugin;
    }

    private static void var3() {
        var2 = new String[var1[21]];
        r.var2[r.var1[0]] = "^Stamina potion.*$";
        r.var2[r.var1[5]] = "Knife";
        r.var2[r.var1[6]] = "Plank";
        r.var2[r.var1[7]] = "Logs";
        r.var2[r.var1[10]] = "Escort";
        r.var2[r.var1[11]] = "Rotten food";
        r.var2[r.var1[8]] = "Escort";
        r.var2[r.var1[12]] = "easy";
        r.var2[r.var1[13]] = "Escort";
        r.var2[r.var1[14]] = "Mage";
        r.var2[r.var1[9]] = "Adventurer";
        r.var2[r.var1[15]] = "easy";
        r.var2[r.var1[16]] = "Escort";
        r.var2[r.var1[17]] = "Dalcian";
        r.var2[r.var1[18]] = "Fyion";
        r.var2[r.var1[19]] = "Stamina";
        r.var2[r.var1[20]] = "Drink";
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var11() {
        var1 = new int[22];
        r.var1[0] = (0x14 ^ 0x1F) & ~(0x90 ^ 0x9B);
        r.var1[1] = -(0xFFFFBF2F & 0x52D3) & (0xFFFFBFFE & 0x5F5F);
        r.var1[2] = 0xFFFF9DE7 & 0x6F98;
        r.var1[3] = 0xFFFFDF7B & 0x2DF7;
        r.var1[4] = 0xFFFFCDFB & 0x3FA7;
        r.var1[5] = 1;
        r.var1[6] = 2;
        r.var1[7] = 3;
        r.var1[8] = 1 ^ (0x9B ^ 0x9C);
        r.var1[9] = 0x8A ^ 0xC4 ^ (0xEC ^ 0xA8);
        r.var1[10] = 0xA2 ^ 0xA6;
        r.var1[11] = 0xF ^ 0xA;
        r.var1[12] = 0x44 ^ 1 ^ (0xE1 ^ 0xA3);
        r.var1[13] = 0x9C ^ 0xA7 ^ (0x56 ^ 0x65);
        r.var1[14] = 5 ^ 0xC;
        r.var1[15] = 0x31 ^ 0x3A;
        r.var1[16] = 0 ^ 0xC;
        r.var1[17] = 0x6A ^ 0x6F ^ (0x62 ^ 0x6A);
        r.var1[18] = 10 + 133 - 111 + 103 ^ 107 + 119 - 194 + 105;
        r.var1[19] = 0x5B ^ 0x49 ^ (0x4C ^ 0x51);
        r.var1[20] = 0x31 ^ 1 ^ (0x22 ^ 2);
        r.var1[21] = 31 + 94 - 75 + 99 ^ 63 + 90 - 79 + 58;
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        r.var11();
        r.var3();
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        Player var15;
        r var16;
        block18: {
            block20: {
                block19: {
                    if (r.var17(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        Dialog.enterAmount((int)var1[0]);
                        return var1[5];
                    }
                    if (r.var17(var16.V.e() ? 1 : 0)) {
                        return var1[0];
                    }
                    var15 = Players.getLocal();
                    if (r.var18(var15)) {
                        return var1[0];
                    }
                    if (!r.var4(var15.isMoving() ? 1 : 0) || r.var17(var15.isAnimating() ? 1 : 0)) {
                        return var1[0];
                    }
                    if (r.var14(var16.V.c(), var1[6])) {
                        return var1[0];
                    }
                    if (r.var17(Dialog.isOpen() ? 1 : 0)) {
                        return var1[0];
                    }
                    if (!r.var17(var16.V.f().contains((Locatable)var15) ? 1 : 0)) break block18;
                    if (r.var17(var16.W.healInBank() ? 1 : 0) && r.var12(var16.W.hpToBank(), Skills.getBoostedLevel((SkiSkill.HITPOINTS))) {
                        var16.V.b(var1[5]);
                        return var1[0];
                    }
                    String[] stringArray = new String[var1[5]];
                    stringArray[r.var1[0]] = var2[var1[5]];
                    if (!r.var17(Inventory.contains((String[])stringArray) ? 1 : 0)) break block19;
                    String[] stringArray2 = new String[var1[6]];
                    stringArray2[r.var1[0]] = var2[var1[6]];
                    stringArray2[r.var1[5]] = var2[var1[7]];
                    if (r.var12(Inventory.getFreeSlots() - Math.min(var1[7], Inventory.getAll((String[])stringArray2).size()), var1[8]) && (!r.var17(var16.W.stamina()) || !r.var4(Inventory.contains(item -> {
                        int n2;
                        if (r.var17(item.getName().contains(var2[var1[19]]) ? 1 : 0)) {
                            String[] stringArray = new String[var1[5]];
                            stringArray[r.var1[0]] = var2[var1[20]];
                            if (r.var17(item.hasAction(stringArray) ? 1 : 0)) {
                                n2 = var1[5];
                                0;
                                if (3 != 1) return n2 != 0;
                                return ((8 ^ 0x39) & ~(0x34 ^ 5)) != 0;
                            }
                        }
                        n2 = var1[0];
                        return n2 != 0;
                    }) ? 1 : 0))) break block20;
                }
                var16.V.b(var1[5]);
                return var1[0];
            }
            NPC var19 = NPCs.getNearest(nPC -> {
                int n2;
                if (r.var17(nPC.getName().contains(var2[var1[15]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[5]];
                    stringArray[r.var1[0]] = var2[var1[16]];
                    if (r.var17(nPC.hasAction(stringArray) ? 1 : 0) && (!r.var4(nPC.getName().contains(var2[var1[17]]) ? 1 : 0) || r.var17(nPC.getName().contains(var2[var1[18]]) ? 1 : 0))) {
                        n2 = var1[5];
                        0;
                        if (2 != -1) return n2 != 0;
                        return ((157 + 33 - 38 + 28 ^ 4 + 126 - 68 + 74) & (85 + 206 - 164 + 128 ^ 151 + 166 - 261 + 139 ^ -1)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            if (r.var13(var19) && r.var20(var15.distanceTo((Locatable)var19), var1[9])) {
                var19.interact(var2[var1[10]]);
                var16.sleep(var1[11]);
                return var1[5];
            }
            Movement.walkTo((WorldArea)var16.V.f());
            0;
            return var1[5];
        }
        if (r.var17(var16.Y.contains((Locatable)var15) ? 1 : 0)) {
            String[] stringArray = new String[var1[5]];
            stringArray[r.var1[0]] = var2[var1[11]];
            if (r.var17(Inventory.dropAll((String[])stringArray) ? 1 : 0)) {
                return var1[5];
            }
            if (r.var17(var16.V.g().contains((Locatable)var15) ? 1 : 0)) {
                NPC var19 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (r.var17(nPC.getName().contains(var2[var1[12]]) ? 1 : 0)) {
                        String[] stringArray = new String[var1[5]];
                        stringArray[r.var1[0]] = var2[var1[13]];
                        if (r.var17(nPC.hasAction(stringArray) ? 1 : 0) && (!r.var4(nPC.getName().contains(var2[var1[14]]) ? 1 : 0) || r.var17(nPC.getName().contains(var2[var1[9]]) ? 1 : 0))) {
                            n2 = var1[5];
                            0;
                            if (3 >= 0) return n2 != 0;
                            return ((0x8C ^ 0xA5) & ~(0x10 ^ 0x39)) != 0;
                        }
                    }
                    n2 = var1[0];
                    return n2 != 0;
                });
                if (r.var13(var19)) {
                    var19.interact(var2[var1[8]]);
                    var16.sleep(var1[11]);
                    return var1[5];
                }
                0;
                
            } else {
                Movement.walkTo((WorldArea)var16.V.g());
                0;
                return var1[5];
            }
        }
        return var1[0];
    }

    private static boolean var18(Object object) {
        return object == null;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var1[0];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var1[0];
        while (r.var20(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var30);
    }
}

