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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.quest.tasks.GameEnum2;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing Dwarf Cannon")
public class CompletingDwarfCannonTask
extends Task {

    private final  SquireQuesterConfig au;

    private void ab() {
        if (q.var3(Players.getLocal().getWorldLocation().getRegionID(), var1[12])) {
            if (q.var4(Magic.isHomeTeleportOnCooldown() ? 1 : 0) && q.var5(Players.getLocal().getAnimation(), var1[13])) {
                Magic.cast((SpeSpellBook.Standard.HOME_TELEPORT);
                this.sleep(var1[14]);
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[18]];
        dialogOptionArray[q.var1[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.var1[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.var1[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[21]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[15], new WorldPoint(var1[16], var1[17], var1[0]), dialogOptionArray);
    }

    private void ad() {
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[2];
        if (q.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.var6(Widgets.get((int)var1[22], (int)var1[21]))) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[q.var1[0]] = var1[2];
        String[] stringArray = new String[var1[2]];
        stringArray[q.var1[0]] = var2[var1[19]];
        Inventory.getFirst((int[])nArray2).useOn(TileObjects.getNearest((String[])stringArray));
    }

    /*
     * WARNING - void declaration
     */
    private void af() {
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[33];
        NPC nPC = NPCs.getNearest((int[])nArray);
        String[] stringArray = new String[var1[2]];
        stringArray[q.var1[0]] = var2[var1[20]];
        List list = TileObjects.getAt((WorldPoint)new WorldPoint(var1[34], var1[35], var1[0]), (String[])stringArray);
        if (q.var7(nPC)) {
            void var8;
            if (q.var9(list.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[34], var1[35], var1[0]));
                0;
                return;
            }
            ((TileObject)var8.get(var1[0])).interact(var2[var1[21]]);
        }
    }

    public boolean run() {
        q var10;
        if (q.var4(this.au.quest().equals((Object)h.DWARF_CANNON) ? 1 : 0)) {
            return var1[0];
        }
        int var11 = var10.Q();
        if (q.var12(var11, var1[1])) {
            return var1[0];
        }
        System.out.println("[DWARF_CANNON] - Current Progress: " + var11);
        switch (var11) {
            case 0: {
                var10.M();
                0;
                if ((0x47 ^ 0x57 ^ (0xE ^ 0x1A)) > ((0x71 ^ 0x31 ^ (0x47 ^ 0x43)) & (130 + 55 - 110 + 170 ^ 164 + 5 - 8 + 16 ^ -1))) break;
                return ((157 + 41 - 179 + 178 ^ 56 + 72 - -13 + 24) & (39 + 102 - 45 + 102 ^ 132 + 117 - 137 + 54 ^ -1)) != 0;
            }
            case 1: {
                var10.ak();
                var10.aj();
                var10.ai();
                0;
                if (1 < 2) break;
                return ((0x2E ^ 0x36) & ~(0x46 ^ 0x5E)) != 0;
            }
            case 2: {
                var10.ah();
                0;
                if null == null break;
                return ((0x3D ^ 0x40 ^ (0xEE ^ 0x87)) & (0x7A ^ 0x3B ^ (0x56 ^ 3) ^ -1)) != 0;
            }
            case 3: {
                var10.ah();
                var10.ag();
                0;
                if (-2 <= 0) break;
                return ((0xC8 ^ 0x88) & ~(0x4C ^ 0xC)) != 0;
            }
            case 4: {
                var10.af();
                0;
                if (-(0x5B ^ 0x5F) < 0) break;
                return ((0x24 ^ 5) & ~(0x3E ^ 0x1F)) != 0;
            }
            case 5: {
                var10.af();
                0;
                if (1 > 0) break;
                return ((0x94 ^ 0x87) & ~(0x80 ^ 0x93)) != 0;
            }
            case 6: {
                var10.P();
                var10.ae();
                0;
                if (-(0x52 ^ 0x71 ^ (0xA4 ^ 0x83)) <= 0) break;
                return ((0x81 ^ 0x84 ^ (0x5F ^ 0x38)) & (0x70 ^ 0x65 ^ (0xD1 ^ 0xA6) ^ -1)) != 0;
            }
            case 7: {
                var10.ad();
                var10.ac();
                0;
                if null == null break;
                return ((0x61 ^ 0x38) & ~(0xF9 ^ 0xA0)) != 0;
            }
            case 8: {
                var10.ai();
                0;
                if (-1 <= 2) break;
                return ((180 + 81 - 251 + 232 ^ 46 + 45 - 47 + 103) & (0x6C ^ 0x2D ^ (0x13 ^ 0x33) ^ -1)) != 0;
            }
            case 9: {
                var10.ab();
                0;
                if null == null break;
                return ((0xF8 ^ 0x9B) & ~(0x41 ^ 0x22)) != 0;
            }
            case 10: {
                var10.Z();
                var10.aa();
                var10.Y();
            }
            default: {
                return var1[0];
            }
        }
        return var1[2];
    }

    private void ah() {
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[0];
        if (q.var9(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.var9(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[q.var1[0]] = var1[38];
        TileObject var13 = TileObjects.getNearest((int[])nArray2);
        if (q.var6(var13) && q.var9(Reachable.isInteractable((Locatable)var13) ? 1 : 0)) {
            var13.interact(var2[var1[18]]);
            0;
            if (3 < 0) {
                return;
            }
        } else {
            System.out.println(var2[var1[37]]);
            Walker.walkTo((WorldPoint)new WorldPoint(var1[31], var1[39], var1[7]));
            0;
        }
    }

    private void M() {
        DialogOption[] dialogOptionArray = new DialogOption[var1[21]];
        dialogOptionArray[q.var1[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.var1[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.var1[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[20]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[30], new WorldPoint(var1[31], var1[32], var1[0]), dialogOptionArray);
    }

    private void ai() {
        q var14;
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[40];
        if (q.var9(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.var5(var14.Q(), var1[2])) {
            DialogOption[] dialogOptionArray = new DialogOption[var1[36]];
            dialogOptionArray[q.var1[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[2]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[20]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[18]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[37]] = DialogOption.NPC_CONTINUE;
            var14.a(var1[30], new WorldPoint(var1[31], var1[32], var1[0]), dialogOptionArray);
        }
        if (q.var5(var14.Q(), var1[37])) {
            DialogOption[] dialogOptionArray = new DialogOption[var1[41]];
            dialogOptionArray[q.var1[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[18]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[37]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[36]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[14]] = DialogOption.CHAT_OPTION_TWO;
            var14.a(var1[30], new WorldPoint(var1[31], var1[32], var1[0]), dialogOptionArray);
        }
        if (q.var5(var14.Q(), var1[14])) {
            DialogOption[] dialogOptionArray = new DialogOption[var1[41]];
            dialogOptionArray[q.var1[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[18]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[37]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.var1[36]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.var1[14]] = DialogOption.CHAT_OPTION_TWO;
            var14.a(var1[30], new WorldPoint(var1[31], var1[32], var1[0]), dialogOptionArray);
        }
    }

    private static void var15() {
        var1 = new int[54];
        q.var1[0] = (0xCB ^ 0x80 ^ (0x20 ^ 0x35)) & (0x3E ^ 0x51 ^ (0x8F ^ 0xBE) ^ -1);
        q.var1[1] = 63 + 37 - 68 + 107 ^ 142 + 103 - 208 + 112;
        q.var1[2] = 1;
        q.var1[3] = 0xFFFFFFFA & 0x2D37;
        q.var1[4] = -(0xFFFFFF3D & 0x2CDB) & (0xFFFFEFFB & 0x3FFF);
        q.var1[5] = 0xFFFFBBCD & 0x4FF7;
        q.var1[6] = -(0xFFFFD7DE & 0x78E7) & (0xFFFFFDFF & 0x5FDF);
        q.var1[7] = 2;
        q.var1[8] = 3;
        q.var1[9] = -(0xFFFF9FDD & 0x6C67) & (0xFFFFBFFF & 0x6E7F);
        q.var1[10] = -(0xFFFFF4EF & 0x7F99) & (0xFFFFFFFF & 0x7FEB);
        q.var1[11] = -(0xFFFFF7BD & 0x7B67) & (0xFFFFFFBF & Short.MAX_VALUE);
        q.var1[12] = -(0xBA ^ 0xB0) & (0xFFFFFF3F & 0x2DFF);
        q.var1[13] = -1;
        q.var1[14] = 78 + 70 - -26 + 33 ^ 68 + 97 - 67 + 99;
        q.var1[15] = -(0xFFFFFAF4 & 0x778F) & (0xFFFFF7FB & Short.MAX_VALUE);
        q.var1[16] = 0xFFFFBBEA & 0x4FD7;
        q.var1[17] = 0xFFFFEFFD & 0x1D7F;
        q.var1[18] = 0x5C ^ 0x30 ^ (0x1C ^ 0x77);
        q.var1[19] = 0x12 ^ 0x16;
        q.var1[20] = 94 + 130 - 106 + 24 ^ 18 + 23 - -5 + 93;
        q.var1[21] = 37 + 131 - 63 + 92 ^ 122 + 188 - 293 + 178;
        q.var1[22] = -(0xFFFFD76F & 0x6EF3) & (0xFFFFE7FB & 0x5FFF);
        q.var1[23] = -(0xFFFFE7FF & 0x7AD9) & (0xFFFFFFDB & 0x19962FF);
        q.var1[24] = 0x43 ^ 0x5B ^ (0x6B ^ 0x6F);
        q.var1[25] = -(0xFFFFBBEF & 0x6F93) & (0xFFFFAFDF & 0x1997BAA);
        q.var1[26] = -(0xFFFF9D4F & 0x7FB5) & (0xFFFFFFBE & 0x1991D47);
        q.var1[27] = 0xFFFFE5DF & 0x1991A27;
        q.var1[28] = -(0xFFFF9FF7 & 0x6EDD) & (0xFFFFFEDD & 0x1990FF7);
        q.var1[29] = 0xFFFF9FEF & 0x1996019;
        q.var1[30] = -(0xFFFFEABF & 0x7FE1) & (0xFFFFFFFF & 0x7EE7);
        q.var1[31] = 0xFFFFFB07 & 0xEFF;
        q.var1[32] = -(0xFFFFFB9D & 0x667B) & (0xFFFFFFBE & 0x6FDB);
        q.var1[33] = 0xFFFFBF7F & 0x54C6;
        q.var1[34] = 0xFFFFBA1B & 0x4FEF;
        q.var1[35] = -(0xFFFFEDBF & 0x1AC6) & (0xFFFFBFFF & 0x6EFF);
        q.var1[36] = 4 ^ 0x79 ^ (0xCA ^ 0xBE);
        q.var1[37] = 0x13 ^ 0x1B;
        q.var1[38] = -(0xFFFFC75F & 0x7BB3) & (0xFFFFFFFE & Short.MAX_VALUE);
        q.var1[39] = 0xFFFFAD7B & 0x5FF7;
        q.var1[40] = 0xA9 ^ 0xA7;
        q.var1[41] = 120 + 73 - 153 + 118 ^ 39 + 138 - 173 + 145;
        q.var1[42] = -(0xFFFFF5BD & 0x7E53) & (0xFFFFFDFF & 0x7F3B);
        q.var1[43] = 0x48 ^ 0x47;
        q.var1[44] = 0x4F ^ 0x72 ^ (0x40 ^ 0x6D);
        q.var1[45] = 0x83 ^ 0x92;
        q.var1[46] = 0xD ^ 0x1F;
        q.var1[47] = 0x1A ^ 0 ^ (0x2B ^ 0x22);
        q.var1[48] = 0x62 ^ 0x76;
        q.var1[49] = -(0xFFFFF4C3 & 0x2B7E) & (0xFFFFB3FF & 0x6D7B);
        q.var1[50] = 120 + 86 - 173 + 137 ^ 38 + 42 - 6 + 92;
        q.var1[51] = 0xC8 ^ 0xC5;
        q.var1[52] = -(0xFFFFF35D & 0x6FEB) & (0xFFFFFFEE & 0x6FF9);
        q.var1[53] = -(0xFFFFBB9F & 0x577A) & (0xFFFFBFFB & 0x5FFD);
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

    private void Z() {
        if (q.var3(Players.getLocal().getWorldLocation().getRegionID(), var1[3])) {
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[4];
        if (q.var9(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[2]];
            nArray2[q.var1[0]] = var1[4];
            if (q.var12(Inventory.getCount((boolean)var1[2], (int[])nArray2), var1[1])) {
                return;
            }
        }
        if (q.var4(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[var1[2]];
            stringArray[q.var1[0]] = var2[var1[2]];
            List var17 = TileObjects.getAt((WorldPoint)new WorldPoint(var1[5], var1[6], var1[0]), (String[])stringArray);
            if (q.var9(var17.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[5], var1[6], var1[0]));
                0;
                return;
            }
            if (q.var5(var17.size(), var1[2])) {
                if (q.var4(Reachable.isInteractable((Locatable)((Locatable)var17.get(var1[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(var1[5], var1[6], var1[0]));
                    0;
                    return;
                }
                ((TileObject)var17.get(var1[0])).interact(var2[var1[7]]);
            }
            return;
        }
        int[] nArray3 = new int[var1[2]];
        nArray3[q.var1[0]] = var1[4];
        if (q.var9(Bank.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[var1[2]];
            nArray4[q.var1[0]] = var1[4];
            if (q.var12(Bank.getCount((boolean)var1[2], (int[])nArray4), var1[1])) {
                Bank.withdraw((int)var1[4], (int)var1[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var18;
        if (q.var9(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var18;
        NPC var19 = NPCs.getNearest((int[])nArray);
        if (q.var6(var19) && q.var9(Reachable.isInteractable((Locatable)var19) ? 1 : 0)) {
            var19.interact(var2[var1[40]]);
            0;
            if (-(0x5D ^ 0x17 ^ (0xD4 ^ 0x9B)) >= 0) {
                return;
            }
        } else {
            q var20;
            void var21;
            System.out.println("Walking to NPC: " + (int)var18 + " at " + String.valueOf(var21));
            Walker.walkTo((WorldPoint)var21);
            0;
            var20.sleep(var1[7]);
        }
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private void aj() {
        if (q.var16(Players.getLocal().getAnimation(), var1[13])) {
            return;
        }
        if (q.var9(Dialog.isOpen() ? 1 : 0)) {
            q var28;
            Dialog.continueSpace();
            var28.sleep(var1[14]);
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[42];
        if (q.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[18]];
        nArray2[q.var1[0]] = var1[40];
        nArray2[q.var1[2]] = var1[43];
        nArray2[q.var1[7]] = var1[44];
        nArray2[q.var1[8]] = var1[45];
        nArray2[q.var1[19]] = var1[46];
        nArray2[q.var1[20]] = var1[47];
        nArray2[q.var1[21]] = var1[48];
        TileObject var29 = TileObjects.getNearest((int[])nArray2);
        if (q.var6(var29) && q.var9(Reachable.isInteractable((Locatable)var29) ? 1 : 0)) {
            var29.interact(var2[var1[36]]);
        }
    }

    private static boolean var30(int n2, int n3) {
        return n2 <= n3;
    }

    private void aa() {
        if (q.var30(Players.getLocal().getWorldLocation().getRegionID(), var1[3])) {
            System.out.println(var2[var1[8]]);
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[4];
        if (q.var9(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[2]];
            nArray2[q.var1[0]] = var1[4];
            if (q.var3(Inventory.getCount((boolean)var1[2], (int[])nArray2), var1[1])) {
                return;
            }
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[8]];
        dialogOptionArray[q.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[q.var1[7]] = DialogOption.PLAYER_CONTINUE;
        this.a(var1[9], new WorldPoint(var1[10], var1[11], var1[0]), dialogOptionArray);
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    private void ag() {
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[0];
        if (q.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[36]];
        dialogOptionArray[q.var1[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.var1[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.var1[8]] = DialogOption.QUEST;
        dialogOptionArray[q.var1[19]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[q.var1[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[37]] = DialogOption.PLAYER_CONTINUE;
        this.a(var1[30], new WorldPoint(var1[31], var1[32], var1[0]), dialogOptionArray);
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private void P() {
        if (q.var9(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            this.sleep(var1[7]);
            return;
        }
    }

    private void ac() {
        if (q.var7(Widgets.get((int)var1[22], (int)var1[21]))) {
            return;
        }
        Widgets.fromId((int)var1[23]).interact(var1[0], var1[24], var1[0], var1[23]);
        Widgets.fromId((int)var1[25]).interact(var1[0], var1[24], var1[0], var1[25]);
        Widgets.fromId((int)var1[26]).interact(var1[0], var1[24], var1[0], var1[26]);
        Widgets.fromId((int)var1[27]).interact(var1[0], var1[24], var1[0], var1[27]);
        Widgets.fromId((int)var1[28]).interact(var1[0], var1[24], var1[0], var1[28]);
        Widgets.fromId((int)var1[29]).interact(var1[0], var1[24], var1[0], var1[29]);
    }

    private static void var37() {
        var2 = new String[var1[43]];
        q.var2[q.var1[0]] = "cant turn in quest";
        q.var2[q.var1[2]] = "Bank booth";
        q.var2[q.var1[7]] = "Bank";
        q.var2[q.var1[8]] = "cant charter";
        q.var2[q.var1[19]] = "Broken multicannon";
        q.var2[q.var1[20]] = "Crate";
        q.var2[q.var1[21]] = "Search";
        q.var2[q.var1[18]] = "Take";
        q.var2[q.var1[37]] = "Walking to remains";
        q.var2[q.var1[36]] = "Inspect";
        q.var2[q.var1[14]] = "Take";
        q.var2[q.var1[41]] = "Chicken";
        q.var2[q.var1[50]] = "Take";
        q.var2[q.var1[51]] = "Attack";
        q.var2[q.var1[40]] = "Talk-to";
    }

    private static String var38(String var39, String var40) {
        var39 = new String(Base64.getDecoder().decode(var39.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var41 = new StringBuilder();
        char[] var42 = var40.toCharArray();
        int var43 = var1[0];
        char[] var44 = var39.toCharArray();
        int var45 = var44.length;
        int var46 = var1[0];
        while (q.var3(var46, var45)) {
            char var47 = var44[var46];
            var41.append((char)(var47 ^ var42[var43 % var42.length]));
            0;
            ++var43;
            ++var46;
            0;
            
            return null;
        }
        return String.valueOf(var41);
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }

    private void ae() {
        DialogOption[] dialogOptionArray = new DialogOption[var1[18]];
        dialogOptionArray[q.var1[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.var1[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.var1[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.var1[21]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[30], new WorldPoint(var1[31], var1[32], var1[0]), dialogOptionArray);
    }

    @Inject
    public CompletingDwarfCannonTask(SquireQuesterConfig squireQuesterConfig) {
        this.au = squireQuesterConfig;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_DWARF_CANNON.c());
    }

    static {
        q.var15();
        q.var37();
    }

    private void O() {
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[49];
        if (q.var9(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.var6(Players.getLocal().getInteracting())) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[q.var1[0]] = var2[var1[41]];
        NPC var48 = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[var1[2]];
        nArray2[q.var1[0]] = var1[49];
        TileItem var49 = TileItems.getNearest((int[])nArray2);
        if (q.var6(var49) && q.var9(Reachable.isInteractable((Locatable)var49) ? 1 : 0)) {
            var49.interact(var2[var1[50]]);
            return;
        }
        if (q.var6(var48) && q.var9(Reachable.isInteractable((Locatable)var48) ? 1 : 0) && q.var7(Players.getLocal().getInteracting())) {
            var48.interact(var2[var1[51]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(var1[52], var1[53], var1[0]));
        0;
    }

    private void Y() {
        System.out.println(Players.getLocal().getWorldLocation().getRegionID());
        if (q.var12(Players.getLocal().getWorldLocation().getRegionID(), var1[3])) {
            System.out.println(var2[var1[0]]);
            return;
        }
        this.ai();
    }

    private void N() {
        this.O();
    }

    private void ak() {
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[42];
        if (q.var9(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[q.var1[0]] = var1[42];
        TileItem var50 = TileItems.getNearest((int[])nArray2);
        if (q.var6(var50) && q.var9(Reachable.isInteractable((Locatable)var50) ? 1 : 0)) {
            var50.interact(var2[var1[14]]);
            0;
            if (1 >= (0xAB ^ 0xBF ^ (0x72 ^ 0x62))) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)var50.getWorldLocation());
            0;
        }
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }
}

