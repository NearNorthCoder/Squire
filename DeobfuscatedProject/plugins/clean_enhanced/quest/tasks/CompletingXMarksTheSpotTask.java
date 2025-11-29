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
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import gg.squire.quest.tasks.GameEnum;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing X Marks The Spot")
public class CompletingXMarksTheSpotTask
extends Task {

    private final  SquireQuesterConfig bB;

    private static boolean var3(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var4(int n2) {
        return n2 > 0;
    }

    private void Y() {
        int[] nArray = new int[var1[2]];
        nArray[D.var1[0]] = var1[3];
        if (D.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[1]];
        dialogOptionArray[D.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.var1[2]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.var1[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.var1[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.var1[8]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[D.var1[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.var1[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.var1[11]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var2[var1[0]], new WorldPoint(var1[4], var1[5], var1[0]), dialogOptionArray);
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var6;
        if (D.var7(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[D.var1[0]] = var6;
        NPC var8 = NPCs.getNearest((String[])stringArray);
        if (D.var9(var8) && D.var7(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
            var8.interact(var2[var1[26]]);
            0;
            if null != null {
                return;
            }
        } else {
            void var10;
            System.out.println(var2[var1[25]]);
            Walker.walkTo((WorldPoint)var10);
            0;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        D var12;
        if (D.var5(this.bB.quest().equals((Object)h.X_MARKS_THE_SPOT) ? 1 : 0)) {
            return var1[0];
        }
        int var13 = var12.Q();
        if (D.var3(var13, var1[1])) {
            return var1[0];
        }
        System.out.println("[X_MARKS_THE_SPOT] - Current Progress: " + var13);
        switch (var13) {
            case 0: {
                var12.bx();
                var12.cp();
                0;
                if (1 < 3) break;
                return ((15 + 69 - -9 + 122 ^ 37 + 124 - 151 + 128) & (144 + 79 - 160 + 95 ^ 112 + 91 - 83 + 75 ^ -1) & ((0x53 ^ 0x43 ^ (0x6A ^ 0x7F)) & (0x63 ^ 6 ^ (0x59 ^ 0x39) ^ -1) ^ -1)) != 0;
            }
            case 1: {
                var12.cp();
                0;
                if (-(1 ^ 5) < 0) break;
                return ((0xAC ^ 0xA2) & ~(0x65 ^ 0x6B)) != 0;
            }
            case 2: {
                var12.bw();
                0;
                if (((0xDA ^ 0xC7) & ~(0x6B ^ 0x76)) == 0) break;
                return ((0x65 ^ 0x3D) & ~(8 ^ 0x50)) != 0;
            }
            case 3: {
                var12.bv();
                0;
                if (((0x5C ^ 0x7F) & ~(0x41 ^ 0x62)) == 0) break;
                return ((0x64 ^ 0x29) & ~(0x8A ^ 0xC7)) != 0;
            }
            case 4: {
                var12.bu();
                0;
                if ((0xC7 ^ 0xC2) != 0) break;
                return ((0xB8 ^ 0x8F) & ~(0xB7 ^ 0x80)) != 0;
            }
            case 5: {
                var12.bt();
                0;
                if (1 != ((0x5A ^ 0x6F ^ (0x37 ^ 0x45)) & (0xBE ^ 0xB1 ^ (0x51 ^ 0x19) ^ -1))) break;
                return ((0x42 ^ 0x1B ^ (0x75 ^ 0x63)) & (15 + 9 - -187 + 2 ^ 91 + 88 - 127 + 102 ^ -1)) != 0;
            }
            case 6: {
                var12.P();
                var12.Y();
                0;
                if (2 >= ((0x7D ^ 0x51 ^ (0x7F ^ 0x75)) & (107 + 32 - 54 + 48 ^ 65 + 147 - 50 + 1 ^ -1))) break;
                return ((0x63 ^ 0xA ^ (0xEE ^ 0xC0)) & (0x24 ^ 0x15 ^ (0xB4 ^ 0xC2) ^ -1)) != 0;
            }
            case 7: {
                var12.P();
                0;
                if (2 > 0) break;
                return ((0xC9 ^ 0xC2) & ~(0x67 ^ 0x6C)) != 0;
            }
            default: {
                return var1[0];
            }
        }
        return var1[2];
    }

    private void bx() {
        int[] nArray = new int[var1[2]];
        nArray[D.var1[0]] = var1[14];
        if (D.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[D.var1[0]] = var1[14];
        TileItem var14 = TileItems.getNearest((int[])nArray2);
        if (D.var9(var14)) {
            var14.interact(var2[var1[9]]);
            0;
            if (((0xCA ^ 0x92) & ~(0xFE ^ 0xA6)) != 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[21], var1[22], var1[2]));
            0;
        }
    }

    @Inject
    public CompletingXMarksTheSpotTask(SquireQuesterConfig squireQuesterConfig) {
        this.bB = squireQuesterConfig;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[0];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[0];
        while (D.var11(var23, var22)) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var18);
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private void bt() {
        if (D.var4(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var1[12], var1[13], var1[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[12], var1[13], var1[0]));
            0;
            0;
            if ((0x40 ^ 0x44) < 1) {
                return;
            }
        } else {
            int[] nArray = new int[var1[2]];
            nArray[D.var1[0]] = var1[14];
            Inventory.getFirst((int[])nArray).interact(var2[var1[2]]);
        }
    }

    private void bu() {
        if (D.var4(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var1[15], var1[16], var1[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[15], var1[16], var1[0]));
            0;
            0;
            if (-3 > 0) {
                return;
            }
        } else {
            int[] nArray = new int[var1[2]];
            nArray[D.var1[0]] = var1[14];
            Inventory.getFirst((int[])nArray).interact(var2[var1[6]]);
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static void var31() {
        var2 = new String[var1[27]];
        D.var2[D.var1[0]] = "Veos";
        D.var2[D.var1[2]] = "Dig";
        D.var2[D.var1[6]] = "Dig";
        D.var2[D.var1[7]] = "Dig";
        D.var2[D.var1[8]] = "Dig";
        D.var2[D.var1[9]] = "Take";
        D.var2[D.var1[10]] = "Veos";
        D.var2[D.var1[11]] = "Talk-to";
        D.var2[D.var1[1]] = "Walking to NPC";
        D.var2[D.var1[26]] = "Talk-to";
        D.var2[D.var1[25]] = "Walking to NPC";
    }

    private void bv() {
        if (D.var4(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var1[17], var1[18], var1[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[17], var1[18], var1[0]));
            0;
            0;
            if ((0x6E ^ 0x6A) < 0) {
                return;
            }
        } else {
            int[] nArray = new int[var1[2]];
            nArray[D.var1[0]] = var1[14];
            Inventory.getFirst((int[])nArray).interact(var2[var1[7]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var32;
        if (D.var7(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[D.var1[0]] = var32;
        NPC var33 = NPCs.getNearest((int[])nArray);
        if (D.var9(var33) && D.var7(Reachable.isInteractable((Locatable)var33) ? 1 : 0)) {
            var33.interact(var2[var1[11]]);
            0;
            if (-1 >= ((0x14 ^ 0x65 ^ (0xED ^ 0xB6)) & (38 + 82 - -43 + 11 ^ 81 + 99 - 53 + 5 ^ -1))) {
                return;
            }
        } else {
            void var34;
            System.out.println(var2[var1[1]]);
            Walker.walkTo((WorldPoint)var34);
            0;
        }
    }

    private void cp() {
        int[] nArray = new int[var1[2]];
        nArray[D.var1[0]] = var1[14];
        if (D.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[25]];
        dialogOptionArray[D.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.var1[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[D.var1[6]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.var1[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.var1[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.var1[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.var1[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.var1[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.var1[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.var1[26]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var2[var1[10]], new WorldPoint(var1[23], var1[24], var1[0]), dialogOptionArray);
    }

        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    private void bw() {
        if (D.var4(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var1[19], var1[20], var1[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[19], var1[20], var1[0]));
            0;
            0;
            if (2 < 0) {
                return;
            }
        } else {
            int[] nArray = new int[var1[2]];
            nArray[D.var1[0]] = var1[14];
            Inventory.getFirst((int[])nArray).interact(var2[var1[8]]);
        }
    }

    private static void var41() {
        var1 = new int[28];
        D.var1[0] = (57 + 140 - 113 + 162 ^ 46 + 122 - 78 + 92) & (0x82 ^ 0xBE ^ (0x41 ^ 0x3D) ^ -1);
        D.var1[1] = 0xBB ^ 0xB3;
        D.var1[2] = 1;
        D.var1[3] = -(0xFFFFBFEF & 0x45F1) & (0xFFFFFFFF & 0x5FFF);
        D.var1[4] = -(0xFFFFEE3B & 0x51D5) & (0xFFFFCFFF & 0x7BFE);
        D.var1[5] = -(0xFFFFFFED & 0x5153) & (0xFFFFDFFF & 0x7DEE);
        D.var1[6] = 2;
        D.var1[7] = 3;
        D.var1[8] = 0xCF ^ 0xAE ^ (0xEE ^ 0x8B);
        D.var1[9] = 0x8A ^ 0x8F;
        D.var1[10] = 0x50 ^ 0x56;
        D.var1[11] = 0x11 ^ 0x16;
        D.var1[12] = -(0xFFFFDFFB & 0x63FD) & (0xFFFFDFFF & 0x6FFE);
        D.var1[13] = 0xFFFF9DFF & 0x6EBB;
        D.var1[14] = 0xFFFF9FFC & 0x63BB;
        D.var1[15] = 0xFFFFBDAF & 0x4E75;
        D.var1[16] = 0xFFFFDDF4 & 0x2ECB;
        D.var1[17] = 0xFFFFBF87 & 0x4CFB;
        D.var1[18] = -(0xFFFFD7B5 & 0x387B) & (0xFFFFFFFD & 0x1CBE);
        D.var1[19] = -(0xFFFFFF72 & 0x53EF) & (0xFFFFDFFF & Short.MAX_VALUE);
        D.var1[20] = -(0xFFFFFA6F & 0x7797) & (0xFFFFFFCF & 0x7EBF);
        D.var1[21] = 0xFFFFDCB5 & 0x2FDA;
        D.var1[22] = -(0xFFFFA6ED & 0x79BF) & (0xFFFFADFF & Short.MAX_VALUE);
        D.var1[23] = 0xFFFF8F9F & 0x7CFD;
        D.var1[24] = -(0xFFFFEBF9 & 0x7557) & (0xFFFFEFFF & 0x7DF9);
        D.var1[25] = 12 + 11 - -139 + 25 ^ 129 + 128 - 175 + 95;
        D.var1[26] = 91 + 37 - 61 + 60 ^ (0xD8 ^ 0xAE);
        D.var1[27] = 0x21 ^ 0x2A;
    }

    private int Q() {
        return Static.getClient().getVarbitValue(b.QUEST_X_MARKS_THE_SPOT.c());
    }

    static {
        D.var41();
        D.var31();
    }

    private void P() {
        if (D.var7(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}

