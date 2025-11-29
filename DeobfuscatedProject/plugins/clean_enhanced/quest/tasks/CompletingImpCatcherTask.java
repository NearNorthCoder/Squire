/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.util.List;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.quest.tasks.GameEnum2;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing Imp Catcher")
public class CompletingImpCatcherTask
extends Task {
    private final  SquireQuesterConfig av;

    /*
     * WARNING - void declaration
     */
    private void al() {
        void var3;
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().contains(var2[var1[54]]));
        if (r.var4(tileItem2)) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[r.var1[0]] = var1[3];
        if (r.var5(Inventory.contains((int[])nArray) ? 1 : 0) && r.var6(var3.getName().contains(var2[var1[0]]) ? 1 : 0)) {
            var3.interact(var2[var1[2]]);
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[r.var1[0]] = var1[4];
        if (r.var5(Inventory.contains((int[])nArray2) ? 1 : 0) && r.var6(var3.getName().contains(var2[var1[1]]) ? 1 : 0)) {
            var3.interact(var2[var1[18]]);
            return;
        }
        int[] nArray3 = new int[var1[2]];
        nArray3[r.var1[0]] = var1[5];
        if (r.var5(Inventory.contains((int[])nArray3) ? 1 : 0) && r.var6(var3.getName().contains(var2[var1[19]]) ? 1 : 0)) {
            var3.interact(var2[var1[20]]);
            return;
        }
        int[] nArray4 = new int[var1[2]];
        nArray4[r.var1[0]] = var1[6];
        if (r.var5(Inventory.contains((int[])nArray4) ? 1 : 0) && r.var6(var3.getName().contains(var2[var1[21]]) ? 1 : 0)) {
            var3.interact(var2[var1[22]]);
            return;
        }
    }

    private static void var7() {
        var1 = new int[56];
        r.var1[0] = (164 + 18 - -20 + 11 ^ 31 + 103 - 0 + 59) & (0x17 ^ 0x6B ^ (4 ^ 0x6C) ^ -1);
        r.var1[1] = 2;
        r.var1[2] = 1;
        r.var1[3] = -(0xFFFFDDE2 & 0x625F) & (0xFFFFC7FF & 0x7DFF);
        r.var1[4] = 0xFFFFCFC4 & 0x35FB;
        r.var1[5] = 0xFFFFA5CE & 0x5FF3;
        r.var1[6] = -(0xFFFFF8BF & 0x7F53) & (0xFFFFFDFF & 0x7FD6);
        r.var1[7] = 0xFFFFBB72 & 0x76BF;
        r.var1[8] = -(0xFFFFFDCD & 0x4FB3) & (0xFFFFFFF3 & 0x7FBD);
        r.var1[9] = -(0xFFFFA74D & 0x5AB7) & (0xFFFFF3F7 & 0x3F3D);
        r.var1[10] = 0xFFFFF7BE & 0x3973;
        r.var1[11] = 0xFFFFBE7E & 0x71B3;
        r.var1[12] = -(0xFFFFE9DB & 0x57EF) & (0xFFFFF1FB & Short.MAX_VALUE);
        r.var1[13] = -1;
        r.var1[14] = 0x8E ^ 0x84;
        r.var1[15] = 0xFFFF9FEE & 0x7E53;
        r.var1[16] = 0xFFFFDF7B & 0x2CA4;
        r.var1[17] = -(0xFFFFFAF7 & 0x772D) & (0xFFFFFF7F & 0x7EFF);
        r.var1[18] = 3;
        r.var1[19] = 1 ^ 5;
        r.var1[20] = 0xB0 ^ 0xA4 ^ (0x3A ^ 0x2B);
        r.var1[21] = 0x86 ^ 0xB5 ^ (0x41 ^ 0x74);
        r.var1[22] = 0x62 ^ 0x65;
        r.var1[23] = 0x6C ^ 0x64;
        r.var1[24] = 0x4A ^ 0x52 ^ (0x3F ^ 0x2E);
        r.var1[25] = 0xFFFFCEEF & 0x333E;
        r.var1[26] = (0xA6 ^ 0xBC) + (102 + 175 - 118 + 25) - (0x2E ^ 0x16) + (0x18 ^ 0x37);
        r.var1[27] = 0xFFFFF2DF & 0xF71;
        r.var1[28] = 0xAE ^ 0xB4;
        r.var1[29] = -(0xFFFFDFCF & 0x7532) & (0xFFFFFDBF & 0x7F73);
        r.var1[30] = -(0xFFFF9F9A & 0x66EF) & (0xFFFFAFBF & 0x7FFB);
        r.var1[31] = -(0xFFFFFEAF & 0x61FD) & (0xFFFFEAFF & 0x7FEF);
        r.var1[32] = 0xFFFF8EDD & 0x7DB2;
        r.var1[33] = 0xFFFFF9DD & 0x37E2;
        r.var1[34] = 0x6F ^ 0x64;
        r.var1[35] = 0xFFFFB7FF & 0x4BE3;
        r.var1[36] = -(0xFFFFFC55 & 0x7EE) & (0xFFFFF7DF & 0x1FEB);
        r.var1[37] = 0xFFFFA565 & 0x5FFF;
        r.var1[38] = 0xFFFFDD76 & 0x2EFB;
        r.var1[39] = 0xFFFFEF6C & 0x1DFF;
        r.var1[40] = 0x3D ^ 0x31;
        r.var1[41] = 0xFFFFFC73 & 0xFFD;
        r.var1[42] = 0x4E ^ 0x43;
        r.var1[43] = 0x8F ^ 0x81;
        r.var1[44] = -(0xFFFFF73F & 0x7CFB) & (0xFFFFFFFF & 0x7F7A);
        r.var1[45] = 101 + 53 - 111 + 99 ^ 73 + 75 - 29 + 10;
        r.var1[46] = 0xFFFFBEF7 & 0x4D8A;
        r.var1[47] = -(0xFFFFFF7F & 0x3091) & (0xFFFFFFF9 & 0x3D7F);
        r.var1[48] = 0xFFFFFDBF & 0x2EEB;
        r.var1[49] = 0x33 ^ 0x14 ^ (0xF3 ^ 0xC4);
        r.var1[50] = 0xFFFFCCF6 & 0x3FBF;
        r.var1[51] = -(0xFFFFD6FB & 0x2BB7) & (0xFFFFBFFF & 0x4FFB);
        r.var1[52] = 0x7E ^ 6 ^ (0x17 ^ 0x7E);
        r.var1[53] = 0x2E ^ 0x3C;
        r.var1[54] = 0xA7 ^ 0xB4;
        r.var1[55] = 0x13 ^ 0x57 ^ (0xF2 ^ 0xA2);
    }

    @Inject
    public CompletingImpCatcherTask(SquireQuesterConfig squireQuesterConfig) {
        this.av = squireQuesterConfig;
    }

    private static void var8() {
        var2 = new String[var1[55]];
        r.var2[r.var1[0]] = "Red";
        r.var2[r.var1[2]] = "Take";
        r.var2[r.var1[1]] = "Yellow";
        r.var2[r.var1[18]] = "Take";
        r.var2[r.var1[19]] = "Black";
        r.var2[r.var1[20]] = "Take";
        r.var2[r.var1[21]] = "White";
        r.var2[r.var1[22]] = "Take";
        r.var2[r.var1[23]] = "Wind Strike";
        r.var2[r.var1[24]] = "Choose spell";
        r.var2[r.var1[14]] = "Attack";
        r.var2[r.var1[34]] = "Open";
        r.var2[r.var1[40]] = "Bank booth";
        r.var2[r.var1[42]] = "Bank";
        r.var2[r.var1[43]] = "Wield";
        r.var2[r.var1[45]] = "Trade";
        r.var2[r.var1[49]] = "Trade";
        r.var2[r.var1[52]] = "Talk-to";
        r.var2[r.var1[53]] = "Imp";
        r.var2[r.var1[54]] = "bead";
    }

    private void Y() {
        block3: {
            block2: {
                int[] nArray = new int[var1[2]];
                nArray[r.var1[0]] = var1[3];
                if (!r.var6(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[var1[2]];
                nArray2[r.var1[0]] = var1[4];
                if (!r.var6(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[var1[2]];
                nArray3[r.var1[0]] = var1[5];
                if (!r.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) break block2;
                int[] nArray4 = new int[var1[2]];
                nArray4[r.var1[0]] = var1[6];
                if (!r.var5(Inventory.contains((int[])nArray4) ? 1 : 0)) break block3;
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[14]];
        dialogOptionArray[r.var1[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[r.var1[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[1]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[r.var1[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[r.var1[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[15], new WorldPoint(var1[16], var1[17], var1[1]), dialogOptionArray);
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var1[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var1[0];
        while (r.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private void M() {
        block6: {
            block5: {
                int[] nArray = new int[var1[2]];
                nArray[r.var1[0]] = var1[3];
                if (!r.var6(Inventory.contains((int[])nArray) ? 1 : 0)) break block5;
                int[] nArray2 = new int[var1[2]];
                nArray2[r.var1[0]] = var1[4];
                if (!r.var6(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                int[] nArray3 = new int[var1[2]];
                nArray3[r.var1[0]] = var1[5];
                if (!r.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) break block5;
                int[] nArray4 = new int[var1[2]];
                nArray4[r.var1[0]] = var1[6];
                if (!r.var5(Inventory.contains((int[])nArray4) ? 1 : 0)) break block6;
            }
            return;
        }
        if (r.var20(Players.getLocal().getWorldLocation().getRegionID(), var1[7]) && r.var20(Players.getLocal().getWorldLocation().getRegionID(), var1[8]) && r.var20(Players.getLocal().getWorldLocation().getRegionID(), var1[9]) && r.var20(Players.getLocal().getWorldLocation().getRegionID(), var1[10]) && r.var20(Players.getLocal().getWorldLocation().getRegionID(), var1[11]) && r.var20(Players.getLocal().getWorldLocation().getRegionID(), var1[12])) {
            if (r.var5(Magic.isHomeTeleportOnCooldown() ? 1 : 0) && r.var21(Players.getLocal().getAnimation(), var1[13])) {
                r var22;
                Magic.cast((SpeSpellBook.Standard.HOME_TELEPORT);
                var22.sleep(var1[14]);
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[14]];
        dialogOptionArray[r.var1[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[r.var1[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[1]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[r.var1[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[r.var1[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[r.var1[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[15], new WorldPoint(var1[16], var1[17], var1[1]), dialogOptionArray);
    }

    private static boolean var20(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    static {
        r.var7();
        r.var8();
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_IMP_CATCHER.c());
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var29;
        if (r.var6(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[var1[2]];
        nArray[r.var1[0]] = var29;
        NPC var30 = NPCs.getNearest((int[])nArray);
        if (r.var31(var30) && r.var6(Reachable.isInteractable((Locatable)var30) ? 1 : 0)) {
            var30.interact(var2[var1[52]]);
            0;
            if null != null {
                return;
            }
        } else {
            void var32;
            Walker.walkTo((WorldPoint)var32);
            0;
        }
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var33(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var40(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var31(Object object) {
        return object != null;
    }

    private static boolean var21(int n2, int n3) {
        return n2 == n3;
    }

    private void am() {
        TileItem var41;
        int[] nArray = new int[var1[2]];
        nArray[r.var1[0]] = var1[25];
        if (r.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[r.var1[0]] = var1[3];
        if (r.var6(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var1[2]];
            nArray3[r.var1[0]] = var1[4];
            if (r.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[var1[2]];
                nArray4[r.var1[0]] = var1[5];
                if (r.var6(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[var1[2]];
                    nArray5[r.var1[0]] = var1[6];
                    if (r.var6(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        return;
                    }
                }
            }
        }
        int[] nArray6 = new int[var1[2]];
        nArray6[r.var1[0]] = var1[3];
        if (r.var5(Inventory.contains((int[])nArray6) ? 1 : 0)) {
            int[] nArray7 = new int[var1[2]];
            nArray7[r.var1[0]] = var1[3];
            var41 = TileItems.getNearest((int[])nArray7);
            if (r.var31(var41)) {
                return;
            }
        }
        int[] nArray8 = new int[var1[2]];
        nArray8[r.var1[0]] = var1[4];
        if (r.var5(Inventory.contains((int[])nArray8) ? 1 : 0)) {
            int[] nArray9 = new int[var1[2]];
            nArray9[r.var1[0]] = var1[4];
            var41 = TileItems.getNearest((int[])nArray9);
            if (r.var31(var41)) {
                return;
            }
        }
        int[] nArray10 = new int[var1[2]];
        nArray10[r.var1[0]] = var1[5];
        if (r.var5(Inventory.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[var1[2]];
            nArray11[r.var1[0]] = var1[5];
            var41 = TileItems.getNearest((int[])nArray11);
            if (r.var31(var41)) {
                return;
            }
        }
        int[] nArray12 = new int[var1[2]];
        nArray12[r.var1[0]] = var1[6];
        if (r.var5(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[var1[2]];
            nArray13[r.var1[0]] = var1[6];
            var41 = TileItems.getNearest((int[])nArray13);
            if (r.var31(var41)) {
                return;
            }
        }
        if (r.var31(Players.getLocal().getInteracting())) {
            return;
        }
        if (r.var6(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        if (r.var5(Magic.isAutoCasting() ? 1 : 0)) {
            int[] nArray14 = new int[var1[2]];
            nArray14[r.var1[0]] = var1[25];
            if (r.var6(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                if (r.var31(Widgets.get((int)var1[26], (int)var1[2], (int)var1[2]))) {
                    Widgets.get((int)var1[26], (int)var1[2], (int)var1[2]).interact(var2[var1[23]]);
                }
                if (r.var31(Widgets.get((int)var1[27], (int)var1[28]))) {
                    Widgets.get((int)var1[27], (int)var1[28]).interact(var2[var1[24]]);
                }
                return;
            }
        }
        if (r.var31(var41 = NPCs.getNearest(nPC -> {
            int n2;
            if (r.var6(nPC.getName().equals(var2[var1[53]]) ? 1 : 0) && r.var5(nPC.isDead() ? 1 : 0)) {
                n2 = var1[2];
                0;
                if ((0x28 ^ 0x1C ^ (0xAB ^ 0x9B)) != (0xF6 ^ 0xC3 ^ (0x29 ^ 0x18))) {
                    return ((106 + 162 - 252 + 158 ^ 6 + 0 - -115 + 34) & (0xBB ^ 0xB6 ^ (0x58 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        })) && r.var6(Reachable.isInteractable((Locatable)var41) ? 1 : 0)) {
            if (!r.var20(Players.getLocal().getWorldLocation().getRegionID(), var1[29]) || r.var21(Players.getLocal().getWorldLocation().getRegionID(), var1[30])) {
                var41.interact(var2[var1[14]]);
                0;
                if (2 != 2) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[31], var1[32], var1[0]));
                0;
                0;
                if (-2 > 0) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[31], var1[32], var1[0]));
            0;
        }
    }

    private void an() {
        r var42;
        block33: {
            block32: {
                int[] nArray = new int[var1[2]];
                nArray[r.var1[0]] = var1[33];
                if (r.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[var1[2]];
                    nArray2[r.var1[0]] = var1[33];
                    Inventory.getFirst((int[])nArray2).interact(var2[var1[34]]);
                    return;
                }
                int[] nArray3 = new int[var1[2]];
                nArray3[r.var1[0]] = var1[25];
                if (r.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[var1[2]];
                    nArray4[r.var1[0]] = var1[25];
                    if (r.var33(Inventory.getCount((boolean)var1[2], (int[])nArray4), var1[14])) {
                        return;
                    }
                }
                if (!r.var33(Inventory.getFreeSlots(), var1[1])) break block32;
                int[] nArray5 = new int[var1[2]];
                nArray5[r.var1[0]] = var1[35];
                if (!r.var18(Inventory.getCount((boolean)var1[2], (int[])nArray5), var1[36])) break block33;
                int[] nArray6 = new int[var1[2]];
                nArray6[r.var1[0]] = var1[37];
                if (!r.var5(Inventory.contains((int[])nArray6) ? 1 : 0)) break block33;
            }
            if (r.var5(Bank.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[var1[2]];
                stringArray[r.var1[0]] = var2[var1[40]];
                List var43 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[38], var1[39], var1[0]), (String[])stringArray);
                if (r.var6(var43.isEmpty() ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(var1[41], var1[39], var1[0]));
                    0;
                    return;
                }
                if (r.var21(var43.size(), var1[2])) {
                    if (r.var5(Reachable.isInteractable((Locatable)((Locatable)var43.get(var1[0]))) ? 1 : 0)) {
                        Walker.walkTo((WorldPoint)new WorldPoint(var1[41], var1[39], var1[0]));
                        0;
                        return;
                    }
                    ((TileObject)var43.get(var1[0])).interact(var2[var1[42]]);
                }
                return;
            }
            if (r.var6(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
            }
        }
        if (r.var6(Bank.isOpen() ? 1 : 0)) {
            int[] nArray = new int[var1[2]];
            nArray[r.var1[0]] = var1[35];
            if (r.var40(Inventory.getCount((boolean)var1[2], (int[])nArray), var1[36])) {
                int[] nArray7 = new int[var1[2]];
                nArray7[r.var1[0]] = var1[35];
                if (r.var44(Bank.getCount((boolean)var1[2], (int[])nArray7), var1[36])) {
                    Bank.withdraw((int)var1[35], (int)var1[36], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    var42.sleep(var1[20]);
                }
            }
        }
        int[] nArray = new int[var1[2]];
        nArray[r.var1[0]] = var1[37];
        if (r.var5(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray8 = new int[var1[2]];
            nArray8[r.var1[0]] = var1[37];
            if (r.var6(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                int[] nArray9 = new int[var1[2]];
                nArray9[r.var1[0]] = var1[37];
                Inventory.getFirst((int[])nArray9).interact(var2[var1[43]]);
                0;
                if (1 <= -1) {
                    return;
                }
            } else if (r.var6(Shop.isOpen() ? 1 : 0)) {
                Shop.buyOne((int)var1[37]);
                0;
                if (((0xEA ^ 0xC5) & ~(0x22 ^ 0xD)) > 0) {
                    return;
                }
            } else {
                int[] nArray10 = new int[var1[2]];
                nArray10[r.var1[0]] = var1[44];
                NPC var43 = NPCs.getNearest((int[])nArray10);
                if (r.var31(var43) && r.var6(Reachable.isInteractable((Locatable)var43) ? 1 : 0)) {
                    var43.interact(var2[var1[45]]);
                    0;
                    if ((0x24 ^ 0x21) == 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(var1[46], var1[47], var1[0]));
                    0;
                    return;
                }
            }
            return;
        }
        int[] nArray11 = new int[var1[2]];
        nArray11[r.var1[0]] = var1[25];
        if (r.var5(Inventory.contains((int[])nArray11) ? 1 : 0)) {
            if (r.var6(Shop.isOpen() ? 1 : 0)) {
                Shop.buyFifty((int)var1[33]);
                0;
                if null != null {
                    return;
                }
            } else {
                int[] nArray12 = new int[var1[2]];
                nArray12[r.var1[0]] = var1[48];
                NPC var43 = NPCs.getNearest((int[])nArray12);
                if (r.var31(var43) && r.var6(Reachable.isInteractable((Locatable)var43) ? 1 : 0)) {
                    var43.interact(var2[var1[49]]);
                    0;
                    if (1 < 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(var1[50], var1[51], var1[0]));
                    0;
                    var42.sleep(var1[1]);
                    return;
                }
            }
        }
    }

    private static boolean var44(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        r var45;
        if (r.var5(this.av.quest().equals((Object)h.IMP_CATCHER) ? 1 : 0)) {
            return var1[0];
        }
        int var46 = var45.Q();
        if (r.var44(var46, var1[1])) {
            return var1[0];
        }
        System.out.println("[IMP_CATCHER] - Current Progress: " + var46);
        switch (var46) {
            case 0: {
                var45.an();
                var45.al();
                var45.am();
                var45.M();
                0;
                if (-1 <= 0) break;
                return ((101 + 18 - -40 + 6 ^ 131 + 59 - 36 + 42) & (0x33 ^ 0x2A ^ (0xFD ^ 0x85) ^ -1)) != 0;
            }
            case 1: {
                var45.Y();
            }
            default: {
                return var1[0];
            }
        }
        return var1[2];
    }
}

