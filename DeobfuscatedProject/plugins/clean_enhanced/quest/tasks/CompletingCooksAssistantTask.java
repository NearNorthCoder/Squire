/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.api.Client
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing Cooks Assistant")
public class CompletingCooksAssistantTask
extends Task {
    private final  TaskManager at;
    private final  SquireQuester as;
    
    private final  SquireQuesterConfig ar;
    private final  Client aq;

    private static boolean var3(Object object) {
        return object == null;
    }

    private void R() {
        p var4;
        if (!p.var5(Dialog.canContinue() ? 1 : 0) || p.var6(Dialog.isViewingOptions() ? 1 : 0)) {
            if (p.var6(Dialog.hasOption((String)var1[var2[0]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[3]];
                stringArray[p.var2[0]] = var1[var2[3]];
                Dialog.chooseOption((String[])stringArray);
                0;
            }
            DialogOption[] dialogOptionArray = new DialogOption[var2[5]];
            dialogOptionArray[p.var2[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.var2[3]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.var2[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.var2[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.var2[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.var2[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.var2[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.var2[9]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        if (p.var5(var4.V() ? 1 : 0)) {
            int[] nArray = new int[var2[3]];
            nArray[p.var2[0]] = var2[10];
            if (p.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var2[3]];
                nArray2[p.var2[0]] = var2[11];
                if (p.var5(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray = new String[var2[3]];
                    stringArray[p.var2[0]] = var1[var2[1]];
                    TileItem var7 = TileItems.getNearest((String[])stringArray);
                    if (p.var8(var7)) {
                        var7.interact(var1[var2[2]]);
                    }
                    System.out.println(var1[var2[6]]);
                    return;
                }
            }
            int[] nArray3 = new int[var2[3]];
            nArray3[p.var2[0]] = var2[12];
            if (p.var5(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(var2[13], var2[14], var2[0]));
                0;
                String[] stringArray = new String[var2[3]];
                stringArray[p.var2[0]] = var1[var2[7]];
                NPCs.getNearest((String[])stringArray).interact(var1[var2[8]]);
                Shop.buyOne((int)var2[12]);
            }
            if (p.var5(Dialog.canContinue() ? 1 : 0) && p.var5(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] nArray4 = new int[var2[3]];
                nArray4[p.var2[0]] = var2[11];
                if (p.var5(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    var4.U();
                }
            }
            if (p.var5(Dialog.canContinue() ? 1 : 0) && p.var5(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] nArray5 = new int[var2[3]];
                nArray5[p.var2[0]] = var2[11];
                if (p.var6(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[var2[3]];
                    nArray6[p.var2[0]] = var2[15];
                    if (p.var5(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        var4.T();
                    }
                }
            }
            if (p.var5(Dialog.canContinue() ? 1 : 0) && p.var5(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] nArray7 = new int[var2[3]];
                nArray7[p.var2[0]] = var2[16];
                if (p.var5(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[var2[3]];
                    nArray8[p.var2[0]] = var2[11];
                    if (p.var6(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                        int[] nArray9 = new int[var2[3]];
                        nArray9[p.var2[0]] = var2[15];
                        if (p.var6(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                            var4.S();
                        }
                    }
                }
            }
        }
        if (p.var6(var4.V() ? 1 : 0)) {
            String[] stringArray = new String[var2[3]];
            stringArray[p.var2[0]] = var1[var2[9]];
            NPC var7 = NPCs.getNearest((String[])stringArray);
            if (p.var8(var7)) {
                var7.interact(var1[var2[5]]);
                var4.sleepWhile(var2[17], () -> {
                    boolean bl;
                    if (p.var5(Dialog.isOpen() ? 1 : 0)) {
                        bl = var2[3];
                        0;
                        if (-(0x6F ^ 0x6B) >= 0) {
                            return ((0x7D ^ 0x51) & ~(0xAB ^ 0x87)) != 0;
                        }
                    } else {
                        bl = var2[0];
                    }
                    return bl;
                });
                0;
                if ((0x1F ^ 0x1B) < 3) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var2[18], var2[19], var2[0]));
                0;
            }
        }
        this.sleep(var2[3]);
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static void var9() {
        var2 = new int[53];
        p.var2[0] = 1 & ~1;
        p.var2[1] = 2;
        p.var2[2] = 3;
        p.var2[3] = 1;
        p.var2[4] = 135 + 111 - 209 + 107 ^ 20 + 31 - 12 + 102;
        p.var2[5] = 0xAE ^ 0xA6;
        p.var2[6] = 0xBE ^ 0xBA;
        p.var2[7] = 0x34 ^ 0x60 ^ (0xF3 ^ 0xA2);
        p.var2[8] = 0x5F ^ 0x59;
        p.var2[9] = 123 + 55 - 30 + 26 ^ 105 + 69 - 81 + 76;
        p.var2[10] = -(0xFFFFBE7D & 0x59E7) & (0xFFFF9FFF & 0x7FEF);
        p.var2[11] = -(0xFFFFB1D5 & 0x5E7B) & (0xFFFFDFDD & 0x37FF);
        p.var2[12] = -(0xFFFFEDF3 & 0x7A5F) & (0xFFFFEFD7 & Short.MAX_VALUE);
        p.var2[13] = 0xFFFF9C8C & 0x6FFF;
        p.var2[14] = -(0xFFFFF1FF & 0x7F13) & (0xFFFFFDBF & Short.MAX_VALUE);
        p.var2[15] = 0xFFFFE7DC & 0x1FBB;
        p.var2[16] = -(0xFFFFFBF9 & 0x6C67) & (0xFFFFEFE7 & Short.MAX_VALUE);
        p.var2[17] = 43 + 79 - -21 + 31 ^ 86 + 136 - 172 + 114;
        p.var2[18] = -(0xFFFFF7BA & 0x977) & (0xFFFFDDBF & 0x2FF7);
        p.var2[19] = -(0xFFFFEF73 & 0x319D) & (0xFFFFBDBF & 0x6FDF);
        p.var2[20] = 0x29 ^ 0x75 ^ (0x69 ^ 0x3C);
        p.var2[21] = 50 + 96 - 46 + 36 ^ 11 + 37 - -38 + 45;
        p.var2[22] = 0xFFFFBCBF & 0x4FC7;
        p.var2[23] = -(0xFFFFFF51 & 0x32EF) & (0xFFFFFFFF & 0x3ECD);
        p.var2[24] = 0xFFFFFE7C & 0xDEB;
        p.var2[25] = -(0xFFFFDA27 & 0x67D9) & (0xFFFFEEF8 & 0x5FF7);
        p.var2[26] = 0x74 ^ 0x63 ^ (0x8A ^ 0x91);
        p.var2[27] = 5 ^ 0xA ^ 2;
        p.var2[28] = -(0xFFFFEF2E & 0x33DD) & (0xFFFFBF7F & 0x6FFF);
        p.var2[29] = -(0xFFFFAF7B & 0x5297) & (0xFFFFDEFF & 0x2FDF);
        p.var2[30] = -(0x19 ^ 0x3E) & (0xFFFFBDEF & 0x4EBF);
        p.var2[31] = -(0xFFFFDC47 & 0x6BFD) & (0xFFFFFFDF & 0x4FFF);
        p.var2[32] = -(0xFFFFFF09 & 0x53F7) & (0xFFFFFFFD & 0x5F5B);
        p.var2[33] = 0xFFFFBFDF & 0x4CFC;
        p.var2[34] = 0x81 ^ 0x8F;
        p.var2[35] = 0x1B ^ 0x14;
        p.var2[36] = 0x78 ^ 0x68;
        p.var2[37] = 0x70 ^ 0x54 ^ (0x23 ^ 0x16);
        p.var2[38] = 0x50 ^ 0x60 ^ (0x67 ^ 0x45);
        p.var2[39] = 0xFFFF9FFF & 0x6C5C;
        p.var2[40] = 0xFFFFBCEE & 0x4FFB;
        p.var2[41] = 0x50 ^ 0x43;
        p.var2[42] = 0x22 ^ 0x36;
        p.var2[43] = 0xA1 ^ 0xB4;
        p.var2[44] = 0x28 ^ 0x3E;
        p.var2[45] = 11 + 100 - 98 + 171 ^ 78 + 16 - -59 + 22;
        p.var2[46] = 0x10 ^ 8;
        p.var2[47] = -(0xFFFFFF23 & 0x72DD) & (0xFFFFFFFE & 0x7E5F);
        p.var2[48] = 0xFFFFDEFB & 0x2DED;
        p.var2[49] = 3 ^ 0x1A;
        p.var2[50] = 0x71 ^ 0x19 ^ (0x5C ^ 0x2E);
        p.var2[51] = 0xA5 ^ 0xBE;
        p.var2[52] = 0 + 77 - -48 + 58 ^ 167 + 120 - 270 + 154;
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, WorldPoint worldPoint) {
        int[] nArray = new int[var2[3]];
        nArray[p.var2[0]] = n2;
        if (p.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var10;
            int[] nArray2 = new int[var2[3]];
            nArray2[p.var2[0]] = n2;
            TileItem tileItem = TileItems.getNearest((int[])nArray2);
            if (p.var8(tileItem)) {
                if (p.var6(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                    tileItem.interact(var1[var2[49]]);
                    0;
                    if (-1 >= 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)var10);
                    0;
                    0;
                    if (((0x13 ^ 1) & ~(0 ^ 0x12)) < 0) {
                        return;
                    }
                }
            } else {
                Walker.walkTo((WorldPoint)var10);
                0;
            }
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private void U() {
        p var17;
        this.b(var2[10], new WorldPoint(var2[30], var2[23], var2[0]));
        if (p.var5(this.as.a() ? 1 : 0)) {
            this.a(var2[31], new WorldPoint(var2[32], var2[33], var2[0]), var1[var2[34]], var1[var2[35]]);
        }
        int[] nArray = new int[var2[3]];
        nArray[p.var2[0]] = var2[10];
        if (p.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[3]];
            nArray2[p.var2[0]] = var2[31];
            if (p.var6(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                String[] stringArray = new String[var2[3]];
                stringArray[p.var2[0]] = var1[var2[36]];
                if (p.var8(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[var2[3]];
                    stringArray2[p.var2[0]] = var1[var2[37]];
                    TileObjects.getNearest((String[])stringArray2).interact(var1[var2[38]]);
                    0;
                    if (-1 > 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(var2[39], var2[40], var2[1]));
                    0;
                }
            }
        }
        int[] nArray3 = new int[var2[3]];
        nArray3[p.var2[0]] = var2[10];
        if (p.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[var2[3]];
            nArray4[p.var2[0]] = var2[31];
            if (p.var5(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                String[] stringArray = new String[var2[3]];
                stringArray[p.var2[0]] = var1[var2[41]];
                if (p.var8(TileObjects.getNearest((String[])stringArray)) && p.var5(var17.as.a() ? 1 : 0)) {
                    String[] stringArray3 = new String[var2[3]];
                    stringArray3[p.var2[0]] = var1[var2[42]];
                    TileObjects.getNearest((String[])stringArray3).interact(var1[var2[43]]);
                }
            }
        }
        if (p.var6(var17.as.a() ? 1 : 0)) {
            int[] nArray5 = new int[var2[3]];
            nArray5[p.var2[0]] = var2[11];
            if (p.var5(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                String[] stringArray = new String[var2[3]];
                stringArray[p.var2[0]] = var1[var2[44]];
                if (p.var8(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray4 = new String[var2[3]];
                    stringArray4[p.var2[0]] = var1[var2[45]];
                    TileObjects.getNearest((String[])stringArray4).interact(var1[var2[46]]);
                    0;
                    if (3 > 3) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(var2[47], var2[48], var2[0]));
                    0;
                }
            }
        }
    }

    private static boolean var18(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public CompletingCooksAssistantTask(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.aq = client;
        this.ar = squireQuesterConfig;
        this.as = squireQuester;
        this.at = taskManager;
    }

    private void M() {
        if (p.var5(Dialog.canContinue() ? 1 : 0) && p.var5(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[var2[3]];
            stringArray[p.var2[0]] = var1[var2[20]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (p.var8(nPC)) {
                nPC.interact(var1[var2[17]]);
                this.sleepWhile(var2[17], () -> {
                    boolean bl;
                    if (p.var5(Dialog.isOpen() ? 1 : 0)) {
                        bl = var2[3];
                        0;
                        if (1 >= (0x82 ^ 0x9F ^ (0x87 ^ 0x9E))) {
                            return ((0x4A ^ 0x39 ^ (0xD ^ 0x60)) & (8 + 70 - 30 + 113 ^ 33 + 141 - 172 + 189 ^ -1)) != 0;
                        }
                    } else {
                        bl = var2[0];
                    }
                    return bl;
                });
                0;
                if (-2 >= 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var2[18], var2[19], var2[0]));
                0;
            }
            0;
            if (1 < 0) {
                return;
            }
        } else {
            System.out.println(var1[var2[21]]);
            DialogOption[] dialogOptionArray = new DialogOption[var2[17]];
            dialogOptionArray[p.var2[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.var2[3]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArray[p.var2[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.var2[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.var2[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.var2[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.var2[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.var2[9]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[p.var2[5]] = DialogOption.CHAT_OPTION_FOUR;
            dialogOptionArray[p.var2[20]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
    }

    private static void var19() {
        var1 = new String[var2[52]];
        p.var1[p.var2[0]] = "Actually, I know where to find this stuff.";
        p.var1[p.var2[3]] = "Actually, I know where to find this stuff.";
        p.var1[p.var2[1]] = "Pot";
        p.var1[p.var2[2]] = "Take";
        p.var1[p.var2[6]] = "Collecting pot";
        p.var1[p.var2[7]] = "Shop keeper";
        p.var1[p.var2[8]] = "Trade";
        p.var1[p.var2[9]] = "Cook";
        p.var1[p.var2[5]] = "Talk-to";
        p.var1[p.var2[20]] = "Cook";
        p.var1[p.var2[17]] = "Talk-to";
        p.var1[p.var2[21]] = "Sending";
        p.var1[p.var2[26]] = "Dairy cow";
        p.var1[p.var2[27]] = "Milk";
        p.var1[p.var2[34]] = "Wheat";
        p.var1[p.var2[35]] = "Pick";
        p.var1[p.var2[36]] = "Hopper";
        p.var1[p.var2[37]] = "Hopper";
        p.var1[p.var2[38]] = "Fill";
        p.var1[p.var2[41]] = "Hopper";
        p.var1[p.var2[42]] = "Hopper controls";
        p.var1[p.var2[43]] = "Operate";
        p.var1[p.var2[44]] = "Flour bin";
        p.var1[p.var2[45]] = "Flour bin";
        p.var1[p.var2[46]] = "Empty";
        p.var1[p.var2[49]] = "Take";
        p.var1[p.var2[50]] = "Take";
        p.var1[p.var2[51]] = "Walking to location";
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var2[0];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var2[0];
        while (p.var29(var28, var27)) {
            char var30 = var26[var28];
            var23.append((char)(var30 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (((0x42 ^ 0x79) & ~(0x8E ^ 0xB5)) < 1) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    public boolean V() {
        int[] nArray = new int[var2[3]];
        nArray[p.var2[0]] = var2[16];
        if (p.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray2 = new int[var2[3]];
        nArray2[p.var2[0]] = var2[11];
        if (p.var5(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray3 = new int[var2[3]];
        nArray3[p.var2[0]] = var2[15];
        if (p.var5(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return var2[0];
        }
        return var2[3];
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, WorldPoint worldPoint, String string, String string2) {
        int[] nArray = new int[var2[3]];
        nArray[p.var2[0]] = n2;
        if (p.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            String[] stringArray = new String[var2[3]];
            stringArray[p.var2[0]] = string;
            if (p.var8(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[var2[3]];
                stringArray2[p.var2[0]] = string;
                if (p.var6(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray2)) ? 1 : 0)) {
                    String[] stringArray3 = new String[var2[3]];
                    stringArray3[p.var2[0]] = string;
                    TileObjects.getNearest((String[])stringArray3).interact(string2);
                    0;
                    if (1 > 1) {
                        return;
                    }
                } else {
                    void var31;
                    String[] stringArray4 = new String[var2[3]];
                    stringArray4[p.var2[0]] = var31;
                    Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray4).getWorldLocation());
                    0;
                    0;
                    if (-3 >= 0) {
                        return;
                    }
                }
            } else {
                void var32;
                System.out.println(var1[var2[51]]);
                Walker.walkTo((WorldPoint)var32);
                0;
            }
        }
    }

    public boolean run() {
        p var33;
        if (p.var5(this.ar.quest().equals((Object)h.COOKS_ASSISTANT) ? 1 : 0)) {
            return var2[0];
        }
        int var34 = var33.Q();
        System.out.println("[COOKS ASSISTANT] Current Progress: " + var34);
        if (p.var18(var34, var2[1])) {
            return var2[0];
        }
        switch (var34) {
            case 0: {
                var33.M();
                0;
                if null == null break;
                return ((0xEC ^ 0x95 ^ (0x75 ^ 0x38)) & (0x78 ^ 0x37 ^ (0x5F ^ 0x24) ^ -1)) != 0;
            }
            case 1: {
                var33.R();
                var33.sleep(var2[2]);
                0;
                if ((0x5D ^ 0x6E ^ (0xA6 ^ 0x91)) >= ((52 + 53 - -21 + 51 ^ 88 + 28 - -2 + 44) & (1 + 8 - -175 + 7 ^ 132 + 141 - 228 + 127 ^ -1))) break;
                return ((20 + 37 - -23 + 67 ^ 76 + 38 - 63 + 81) & (81 + 124 - 86 + 66 ^ 23 + 163 - 20 + 8 ^ -1)) != 0;
            }
            default: {
                return var2[0];
            }
        }
        return var2[3];
    }

    private static boolean var29(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp((int)var2[4]);
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    static {
        p.var9();
        p.var19();
    }

    private void S() {
        this.b(var2[12], new WorldPoint(var2[22], var2[23], var2[0]));
        int[] nArray = new int[var2[3]];
        nArray[p.var2[0]] = var2[12];
        if (p.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            this.a(var2[16], new WorldPoint(var2[24], var2[25], var2[0]), var1[var2[26]], var1[var2[27]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void b(int n2, WorldPoint worldPoint) {
        int[] nArray = new int[var2[3]];
        nArray[p.var2[0]] = n2;
        if (p.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[3]];
            nArray2[p.var2[0]] = n2;
            TileObject tileObject = TileObjects.getNearest((int[])nArray2);
            if (p.var3(tileObject)) {
                Walker.walkTo((WorldPoint)worldPoint);
                0;
                0;
                if (1 > 2) {
                    return;
                }
            } else {
                void var41;
                var41.interact(var1[var2[50]]);
            }
        }
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private void T() {
        this.a(var2[15], new WorldPoint(var2[28], var2[29], var2[0]));
    }
}

