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
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.GameEnum2;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing Witchs Potion")
public class CompletingWitchsPotionTask
extends Task {

    private final  SquireQuesterConfig bA;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new int[43];
        C.var1[0] = 2 & ~2;
        C.var1[1] = 3;
        C.var1[2] = 1;
        C.var1[3] = 0xFFFFCFFD & 0x3B9A;
        C.var1[4] = 0xFFFF8EAF & 0x7DD6;
        C.var1[5] = -(0xFFFFBC8F & 0x7BF2) & (0xFFFFFDBF & 0x3BED);
        C.var1[6] = 0xFFFFB7EF & 0x5A1B;
        C.var1[7] = 0xFFFFEBDF & 0x1FB6;
        C.var1[8] = 0xFFFF8DFF & 0x7E85;
        C.var1[9] = 0x53 ^ 0x55;
        C.var1[10] = 2;
        C.var1[11] = 0x71 ^ 0x75;
        C.var1[12] = 0x48 ^ 0x4D;
        C.var1[13] = -(0xFFFFBE89 & 0x5177) & (0xFFFF9F9F & 0x7BEE);
        C.var1[14] = -(0xFFFFD6D5 & 0x7B3B) & (0xFFFFFFDF & 0x5EB3);
        C.var1[15] = 140 + 31 - 164 + 156 + (0x33 ^ 0x7D) - (0xB0 ^ 0x87) + (0x8C ^ 0xAF);
        C.var1[16] = 0xFFFFCFF5 & 0x37AF;
        C.var1[17] = 0xFFFF9E7A & 0x69E7;
        C.var1[18] = -(0xFFFFBBFB & 0x6CCD) & (0xFFFFFFF9 & 0x3FDF);
        C.var1[19] = 124 + 73 - 183 + 140 ^ 32 + 62 - 18 + 81;
        C.var1[20] = 0xFFFFBBCF & 0x4FF6;
        C.var1[21] = 0xFFFFDEFB & 0x2DBE;
        C.var1[22] = 0xFFFFFFE7 & 0x3FB;
        C.var1[23] = -(0xFFFFA27F & 0x5FED) & (0xFFFF8FFF & 0x7E7F);
        C.var1[24] = 0xFFFFEEED & 0x1DBF;
        C.var1[25] = 0xD6 ^ 0xBB ^ (0x4D ^ 0x28);
        C.var1[26] = 0x71 ^ 0x78;
        C.var1[27] = 0xFFFFA9FF & 0x5E56;
        C.var1[28] = 0xFFFFEBFF & 0x1C5E;
        C.var1[29] = 0x17 ^ 0x22 ^ (0xD ^ 0x4A);
        C.var1[30] = 0xFFFFBDAB & 0x4EDF;
        C.var1[31] = -(0xFFFFB9BD & 0x7773) & (0xFFFFBDBF & Short.MAX_VALUE);
        C.var1[32] = 0x1D ^ 0x17;
        C.var1[33] = 0x22 ^ 0x5E ^ (0x24 ^ 0x53);
        C.var1[34] = 0x67 ^ 0x46 ^ (0x4B ^ 0x66);
        C.var1[35] = -(0xFFFFB6CD & 0x5BB3) & (0xFFFFFEFA & 0x1FFF);
        C.var1[36] = 0xFFFFAD2E & 0x5FF7;
        C.var1[37] = 131 + 97 - 123 + 97 ^ 119 + 86 - 131 + 125;
        C.var1[38] = 0xFFFFBF7F & 0x4CF5;
        C.var1[39] = 0xFFFFDFD3 & 0x2CEF;
        C.var1[40] = 0xE ^ 0;
        C.var1[41] = 0xA4 ^ 0x9E ^ (0x3E ^ 0xB);
        C.var1[42] = 146 + 94 - 106 + 54 ^ 122 + 14 - 132 + 168;
    }

    static {
        C.var4();
        C.var5();
    }

    private void cJ() {
        int[] nArray = new int[var1[2]];
        nArray[C.var1[0]] = var1[16];
        if (C.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[C.var1[0]] = var1[27];
        if (C.var6(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var1[2]];
            nArray3[C.var1[0]] = var1[28];
            if (C.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return;
            }
        }
        int[] nArray4 = new int[var1[2]];
        nArray4[C.var1[0]] = var1[17];
        if (C.var7(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return;
        }
        int[] nArray5 = new int[var1[2]];
        nArray5[C.var1[0]] = var1[29];
        TileObject var8 = TileObjects.getNearest((int[])nArray5);
        if (C.var9(var8) && C.var7(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
            int[] nArray6 = new int[var1[2]];
            nArray6[C.var1[0]] = var1[27];
            if (C.var7(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                int[] nArray7 = new int[var1[2]];
                nArray7[C.var1[0]] = var1[27];
                Inventory.getFirst((int[])nArray7).useOn(var8);
                return;
            }
            int[] nArray8 = new int[var1[2]];
            nArray8[C.var1[0]] = var1[28];
            if (C.var7(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                int[] nArray9 = new int[var1[2]];
                nArray9[C.var1[0]] = var1[28];
                Inventory.getFirst((int[])nArray9).useOn(var8);
                0;
                if null != null {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[30], var1[31], var1[0]));
            0;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var11(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public CompletingWitchsPotionTask(SquireQuesterConfig squireQuesterConfig) {
        this.bA = squireQuesterConfig;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private void cI() {
        block12: {
            block11: {
                int[] nArray = new int[var1[2]];
                nArray[C.var1[0]] = var1[15];
                if (C.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    return;
                }
                int[] nArray2 = new int[var1[2]];
                nArray2[C.var1[0]] = var1[16];
                if (!C.var7(Inventory.contains((int[])nArray2) ? 1 : 0)) break block11;
                int[] nArray3 = new int[var1[2]];
                nArray3[C.var1[0]] = var1[17];
                if (!C.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) break block12;
            }
            System.out.println(var2[var1[12]]);
            return;
        }
        System.out.println(var2[var1[9]]);
        if (C.var7(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)var1[15]);
            0;
            if null != null {
                return;
            }
        } else {
            int[] nArray = new int[var1[2]];
            nArray[C.var1[0]] = var1[18];
            NPC var12 = NPCs.getNearest((int[])nArray);
            if (C.var9(var12) && C.var7(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
                var12.interact(var2[var1[19]]);
                0;
                if (((113 + 95 - -3 + 15 ^ 97 + 42 - 84 + 114) & (0x50 ^ 0x2C ^ (0x97 ^ 0xA0) ^ -1)) != 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[20], var1[21], var1[0]));
                0;
            }
        }
    }

    private void cF() {
        if (C.var7(Dialog.isOpen() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[C.var1[0]] = var2[var1[0]];
        TileObject var13 = TileObjects.getNearest((String[])stringArray);
        if (C.var9(var13) && C.var7(Reachable.isInteractable((Locatable)var13) ? 1 : 0)) {
            var13.interact(var2[var1[2]]);
            0;
            if (3 == -1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[3], var1[4], var1[0]));
            0;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static String var26(String var27, String var28) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var30 = var28.toCharArray();
        int var31 = var1[0];
        char[] var32 = var27.toCharArray();
        int var33 = var32.length;
        int var34 = var1[0];
        while (C.var10(var34, var33)) {
            char var35 = var32[var34];
            var29.append((char)(var35 ^ var30[var31 % var30.length]));
            0;
            ++var31;
            ++var34;
            0;
            
            return null;
        }
        return String.valueOf(var29);
    }

    private void cL() {
        int[] nArray = new int[var1[2]];
        nArray[C.var1[0]] = var1[16];
        if (C.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[C.var1[0]] = var1[36];
        TileObject var36 = TileObjects.getNearest((int[])nArray2);
        if (C.var9(var36) && C.var7(Reachable.isInteractable((Locatable)var36) ? 1 : 0)) {
            var36.interact(var2[var1[37]]);
            0;
            if (3 < ((0x8A ^ 0xC0) & ~(0x4E ^ 4))) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[38], var1[39], var1[0]));
            0;
            return;
        }
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private void cK() {
        block8: {
            block7: {
                int[] nArray = new int[var1[2]];
                nArray[C.var1[0]] = var1[16];
                if (C.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    return;
                }
                int[] nArray2 = new int[var1[2]];
                nArray2[C.var1[0]] = var1[27];
                if (!C.var6(Inventory.contains((int[])nArray2) ? 1 : 0)) break block7;
                int[] nArray3 = new int[var1[2]];
                nArray3[C.var1[0]] = var1[28];
                if (!C.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) break block7;
                int[] nArray4 = new int[var1[2]];
                nArray4[C.var1[0]] = var1[17];
                if (!C.var7(Inventory.contains((int[])nArray4) ? 1 : 0)) break block8;
            }
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[C.var1[0]] = var2[var1[32]];
        NPC var37 = NPCs.getNearest((String[])stringArray);
        int[] nArray = new int[var1[2]];
        nArray[C.var1[0]] = var1[27];
        TileItem var38 = TileItems.getNearest((int[])nArray);
        if (C.var9(var38) && C.var7(Reachable.isInteractable((Locatable)var38) ? 1 : 0)) {
            var38.interact(var2[var1[33]]);
            return;
        }
        if (C.var9(var37) && C.var7(Reachable.isInteractable((Locatable)var37) ? 1 : 0) && C.var3(Players.getLocal().getInteracting())) {
            var37.interact(var2[var1[34]]);
            return;
        }
        if (C.var3(var37)) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[35], var1[4], var1[0]));
            0;
        }
    }

    public boolean run() {
        C var39;
        if (C.var6(this.bA.quest().equals((Object)h.WITCHS_POTION) ? 1 : 0)) {
            return var1[0];
        }
        int var40 = var39.Q();
        if (C.var11(var40, var1[1])) {
            return var1[0];
        }
        System.out.println("[WITCHS_POTION] - Current Progress: " + var40);
        switch (var40) {
            case 0: {
                var39.N();
                var39.M();
                0;
                if (3 >= 3) break;
                return ((0xD7 ^ 0x93 ^ (0xC8 ^ 0xA5)) & (0x76 ^ 0x79 ^ (0x77 ^ 0x51) ^ -1)) != 0;
            }
            case 1: {
                var39.cH();
                var39.cG();
                0;
                if (-1 >= -1) break;
                return ((0xCC ^ 0x88) & ~(0x17 ^ 0x53)) != 0;
            }
            case 2: {
                var39.cF();
                var39.P();
                0;
                if (((122 + 79 - 117 + 122 ^ 17 + 71 - 81 + 123) & (175 + 74 - 212 + 162 ^ 122 + 96 - 144 + 65 ^ -1)) > -1) break;
                return ((8 + 21 - -125 + 8 ^ 11 + 104 - 63 + 87) & (0xE6 ^ 0x95 ^ (0x9B ^ 0xC1) ^ -1)) != 0;
            }
            default: {
                return var1[0];
            }
        }
        return var1[2];
    }

    private void cH() {
        int[] nArray = new int[var1[2]];
        nArray[C.var1[0]] = var1[5];
        if (C.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[C.var1[0]] = var2[var1[10]];
        NPC var41 = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[var1[2]];
        nArray2[C.var1[0]] = var1[5];
        TileItem var42 = TileItems.getNearest((int[])nArray2);
        if (C.var9(var42) && C.var7(Reachable.isInteractable((Locatable)var42) ? 1 : 0)) {
            var42.interact(var2[var1[1]]);
            return;
        }
        if (C.var9(var41) && C.var7(Reachable.isInteractable((Locatable)var41) ? 1 : 0) && C.var3(Players.getLocal().getInteracting())) {
            var41.interact(var2[var1[11]]);
            return;
        }
        if (C.var3(var41)) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[13], var1[14], var1[0]));
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var43;
        if (C.var7(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[C.var1[0]] = var43;
        NPC var44 = NPCs.getNearest((int[])nArray);
        if (C.var9(var44) && C.var7(Reachable.isInteractable((Locatable)var44) ? 1 : 0)) {
            var44.interact(var2[var1[40]]);
            0;
            if null != null {
                return;
            }
        } else {
            void var45;
            System.out.println(var2[var1[41]]);
            Walker.walkTo((WorldPoint)var45);
            0;
        }
    }

    private void cG() {
        int[] nArray = new int[var1[2]];
        nArray[C.var1[0]] = var1[5];
        if (C.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[9]];
        dialogOptionArray[C.var1[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[C.var1[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.var1[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[C.var1[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.var1[11]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[C.var1[12]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[6], new WorldPoint(var1[7], var1[8], var1[0]), dialogOptionArray);
    }

    private void N() {
        this.cL();
        this.cK();
        this.cJ();
        this.Z();
        this.cI();
    }

    private static boolean var46(int n2, int n3) {
        return n2 == n3;
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_WITCHS_POTION.c());
    }

    private static void var5() {
        var2 = new String[var1[42]];
        C.var2[C.var1[0]] = "Cauldron";
        C.var2[C.var1[2]] = "Drink From";
        C.var2[C.var1[10]] = "Rat";
        C.var2[C.var1[1]] = "Take";
        C.var2[C.var1[11]] = "Attack";
        C.var2[C.var1[12]] = "Returning false";
        C.var2[C.var1[9]] = "Getting eye of newt";
        C.var2[C.var1[19]] = "Trade";
        C.var2[C.var1[25]] = "Bank booth";
        C.var2[C.var1[26]] = "Bank";
        C.var2[C.var1[32]] = "Giant rat";
        C.var2[C.var1[33]] = "Take";
        C.var2[C.var1[34]] = "Attack";
        C.var2[C.var1[37]] = "Pick";
        C.var2[C.var1[40]] = "Talk-to";
        C.var2[C.var1[41]] = "Walking to NPC";
    }

    private void P() {
        if (C.var7(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void Z() {
        int[] nArray = new int[var1[2]];
        nArray[C.var1[0]] = var1[15];
        if (C.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[C.var1[0]] = var1[16];
        if (C.var6(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var1[2]];
            nArray3[C.var1[0]] = var1[17];
            if (C.var6(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return;
            }
        }
        int[] nArray4 = new int[var1[2]];
        nArray4[C.var1[0]] = var1[22];
        if (C.var7(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            int[] nArray5 = new int[var1[2]];
            nArray5[C.var1[0]] = var1[22];
            if (C.var11(Inventory.getCount((boolean)var1[2], (int[])nArray5), var1[1])) {
                return;
            }
        }
        if (C.var6(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[var1[2]];
            stringArray[C.var1[0]] = var2[var1[25]];
            List var47 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[23], var1[24], var1[0]), (String[])stringArray);
            if (C.var7(var47.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[23], var1[24], var1[0]));
                0;
                return;
            }
            if (C.var46(var47.size(), var1[2])) {
                if (C.var6(Reachable.isInteractable((Locatable)((Locatable)var47.get(var1[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(var1[23], var1[24], var1[0]));
                    0;
                    return;
                }
                ((TileObject)var47.get(var1[0])).interact(var2[var1[26]]);
            }
            return;
        }
        int[] nArray6 = new int[var1[2]];
        nArray6[C.var1[0]] = var1[22];
        if (C.var7(Bank.contains((int[])nArray6) ? 1 : 0)) {
            int[] nArray7 = new int[var1[2]];
            nArray7[C.var1[0]] = var1[22];
            if (C.var11(Bank.getCount((boolean)var1[2], (int[])nArray7), var1[1])) {
                Bank.withdraw((int)var1[22], (int)var1[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    private void M() {
        DialogOption[] dialogOptionArray = new DialogOption[var1[9]];
        dialogOptionArray[C.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.var1[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[C.var1[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[C.var1[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.var1[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.var1[12]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[6], new WorldPoint(var1[7], var1[8], var1[0]), dialogOptionArray);
    }
}

