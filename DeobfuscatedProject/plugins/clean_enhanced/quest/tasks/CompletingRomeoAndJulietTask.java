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
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.GameEnum2;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing Romeo And Juliet")
public class CompletingRomeoAndJulietTask
extends Task {

    private final  SquireQuesterConfig bs;

    private void bx() {
        int[] nArray = new int[var1[2]];
        nArray[y.var1[0]] = var1[35];
        if (y.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[y.var1[0]] = var1[35];
        TileItem var4 = TileItems.getNearest((int[])nArray2);
        if (y.var5(var4)) {
            var4.interact(var2[var1[10]]);
            0;
            if (2 > (0x46 ^ 0x42)) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[42], var1[43], var1[2]));
            0;
        }
    }

    private void cp() {
        int[] nArray = new int[var1[2]];
        nArray[y.var1[0]] = var1[35];
        if (y.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[15]];
        dialogOptionArray[y.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[y.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[14]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[44], new WorldPoint(var1[45], var1[46], var1[0]), dialogOptionArray);
    }

    private void P() {
        if (y.var3(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void ck() {
        DialogOption[] dialogOptionArray = new DialogOption[var1[6]];
        dialogOptionArray[y.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[y.var1[7]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.var1[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[15]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(var1[23], new WorldPoint(var1[24], var1[25], var1[0]), dialogOptionArray);
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (y.var16(var15, var14)) {
            char var17 = var13[var15];
            var10.append((char)(var17 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (3 < (0x7B ^ 8 ^ (0xF0 ^ 0x87))) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private void cj() {
        DialogOption[] dialogOptionArray = new DialogOption[var1[6]];
        dialogOptionArray[y.var1[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[12]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[16]] = DialogOption.QUEST;
        dialogOptionArray[y.var1[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[20], new WorldPoint(var1[21], var1[22], var1[2]), dialogOptionArray);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var18(int n2) {
        return n2 > 0;
    }

    private void cm() {
        DialogOption[] dialogOptionArray = new DialogOption[var1[6]];
        dialogOptionArray[y.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[19]] = DialogOption.CHAT_OPTION_FOUR;
        this.a(var1[3], new WorldPoint(var1[4], var1[5], var1[0]), dialogOptionArray);
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    private void M() {
        int[] nArray = new int[var1[2]];
        nArray[y.var1[0]] = var1[29];
        if (y.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[6]];
        dialogOptionArray[y.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[3], new WorldPoint(var1[4], var1[5], var1[0]), dialogOptionArray);
    }

    static {
        y.var19();
        y.var20();
    }

    private static void var19() {
        var1 = new int[47];
        y.var1[0] = (0x1B ^ 4) & ~(0x6D ^ 0x72);
        y.var1[1] = 0x66 ^ 0x1E;
        y.var1[2] = 1;
        y.var1[3] = 0xFFFFB3AF & 0x5FFD;
        y.var1[4] = -(0xFFFFBA7B & 0x7797) & (0xFFFFBEFF & 0x7F9F);
        y.var1[5] = -(140 + 26 - 47 + 42) & (0xFFFFFDFF & 0xFFF);
        y.var1[6] = 0x1A ^ 0x40 ^ (5 ^ 0x50);
        y.var1[7] = 2;
        y.var1[8] = 3;
        y.var1[9] = 0x7A ^ 0x7E;
        y.var1[10] = 0x1C ^ 0x19;
        y.var1[11] = 0x6A ^ 0x4C ^ (0xA5 ^ 0x85);
        y.var1[12] = 0x6B ^ 0x5A ^ (0xA7 ^ 0x91);
        y.var1[13] = 27 + 124 - 40 + 27 ^ 36 + 77 - 82 + 99;
        y.var1[14] = 0xB2 ^ 0x8A ^ (0x3C ^ 0xD);
        y.var1[15] = 0x85 ^ 0x8F;
        y.var1[16] = 0x9A ^ 0x91;
        y.var1[17] = 107 + 45 - 70 + 93 ^ 123 + 155 - 131 + 16;
        y.var1[18] = 3 ^ 0xE;
        y.var1[19] = 120 + 103 - 117 + 59 ^ 119 + 167 - 196 + 81;
        y.var1[20] = -(0xFFFF9E97 & 0x697D) & (0xFFFFDFFF & 0x3BBF);
        y.var1[21] = 0xFFFFDED5 & 0x2D7F;
        y.var1[22] = 0xFFFFCFF3 & 0x3D6D;
        y.var1[23] = -(0xFFFFBCFF & 0x6753) & (0xFFFFB7FE & Short.MAX_VALUE);
        y.var1[24] = -(0xFFFFF381 & Short.MAX_VALUE) & (0xFFFFFFFF & 0x7FFB);
        y.var1[25] = -(0xFFFFE72B & 0x7AD7) & (0xFFFFFF6F & 0x6FDE);
        y.var1[26] = 0xFFFFFBBF & 0x17EE;
        y.var1[27] = -(0xFFFFF79B & 0x7B65) & (0xFFFFFFBF & 0x7FF6);
        y.var1[28] = -(0xFFFF93ED & 0x7C7B) & (0xFFFF9DFF & Short.MAX_VALUE);
        y.var1[29] = 0xFFFFABF3 & 0x56FD;
        y.var1[30] = -(0xFFFFF7F3 & 0x2BBF) & (0xFFFFFFFB & Short.MAX_VALUE);
        y.var1[31] = 0xFFFF8FEF & 0x7CDC;
        y.var1[32] = -(23 + 82 - 11 + 35) & (0xFFFFEDBF & 0x1FEC);
        y.var1[33] = -(0xFFFFECEA & 0x53BF) & (0xFFFFCDEF & 0x7EBF);
        y.var1[34] = -(0xFFFFF28F & 0x6F71) & (0xFFFFFFBB & 0x6EFF);
        y.var1[35] = 0xFFFFCFBE & 0x33F9;
        y.var1[36] = -(0xFFFFFBBF & 0x66D9) & (0xFFFFFFFF & 0x6EBD);
        y.var1[37] = 0xFFFF8DCF & 0x7EF0;
        y.var1[38] = -(0xFFFFB33F & 0x7FD5) & (0xFFFFFFFF & 0x3F97);
        y.var1[39] = 0xFFFF8CEC & 0x7F9F;
        y.var1[40] = 0xFFFFBD9E & 0x4EFF;
        y.var1[41] = -(0xFFFFC7F7 & 0x7B6D) & (0xFFFFDFED & 0x6FFF);
        y.var1[42] = -(0xFFFFF3EF & 0x5C7F) & (0xFFFFDFFE & 0x7CFF);
        y.var1[43] = -(0xFFFFDEED & 0x733B) & (0xFFFFDF7B & Short.MAX_VALUE);
        y.var1[44] = -(0xFFFFFEFB & 0x1F5F) & (0xFFFFBFFF & 0x7F7E);
        y.var1[45] = -(0xFFFFFFB1 & 0x524F) & (0xFFFFDFDD & 0x7EBF);
        y.var1[46] = -(0xFFFFFB5F & 0x77E5) & (0xFFFFFFFF & 0x7FED);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_ROMEO_AND_JULIET.c());
    }

    private void bv() {
        if (y.var18(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var1[38], var1[39], var1[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[38], var1[39], var1[0]));
            0;
            0;
            if ((0xB5 ^ 0xB1) <= 0) {
                return;
            }
        } else {
            int[] nArray = new int[var1[2]];
            nArray[y.var1[0]] = var1[35];
            Inventory.getFirst((int[])nArray).interact(var2[var1[8]]);
        }
    }

    public boolean run() {
        y var27;
        if (y.var6(this.bs.quest().equals((Object)h.ROMEO_AND_JULIET) ? 1 : 0)) {
            return var1[0];
        }
        int var28 = var27.Q();
        if (y.var29(var28, var1[1])) {
            return var1[0];
        }
        System.out.println("[ROMEO_AND_JULIET] - Current Progress: " + var28);
        switch (var28) {
            case 0: {
                var27.co();
                var27.M();
                0;
                if (1 != 0) break;
                return ((10 + 22 - -14 + 108 ^ 77 + 116 - 76 + 41) & (69 + 8 - 35 + 103 ^ 95 + 114 - 194 + 134 ^ -1)) != 0;
            }
            case 10: {
                var27.cn();
                0;
                if null == null break;
                return ((0xAF ^ 0xA6) & ~(0x62 ^ 0x6B)) != 0;
            }
            case 20: {
                var27.P();
                var27.cm();
                0;
                if (-(0xB ^ 0xE) < 0) break;
                return ((0x83 ^ 0x98) & ~(0x99 ^ 0x82)) != 0;
            }
            case 30: {
                var27.cl();
                0;
                if (2 == 2) break;
                return ((0x44 ^ 0x43) & ~(0x1B ^ 0x1C)) != 0;
            }
            case 40: {
                var27.ck();
                0;
                if (-(0x83 ^ 0x86) < 0) break;
                return ((0x60 ^ 0x75) & ~(0x8F ^ 0x9A)) != 0;
            }
            case 50: {
                var27.cj();
                0;
                if (-3 <= 0) break;
                return ((0xB ^ 0x4D ^ (0xE5 ^ 0xB4)) & (0x10 ^ 0x1A ^ (0x8E ^ 0x93) ^ -1)) != 0;
            }
            case 60: {
                var27.Y();
                0;
                if (((0xB0 ^ 0x87) & ~(0xAE ^ 0x99)) < (0x63 ^ 0x67)) break;
                return ((0xB5 ^ 0x9D) & ~(0x4A ^ 0x62)) != 0;
            }
            case 7: {
                var27.P();
                0;
                if (1 <= 3) break;
                return ((0xE2 ^ 0x81) & ~(0xEF ^ 0x8C)) != 0;
            }
            default: {
                return var1[0];
            }
        }
        return var1[2];
    }

    private void Y() {
        DialogOption[] dialogOptionArray = new DialogOption[var1[6]];
        dialogOptionArray[y.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[3], new WorldPoint(var1[4], var1[5], var1[0]), dialogOptionArray);
    }

    @Inject
    public CompletingRomeoAndJulietTask(SquireQuesterConfig squireQuesterConfig) {
        this.bs = squireQuesterConfig;
    }

    private void bw() {
        if (y.var18(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var1[40], var1[41], var1[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[40], var1[41], var1[0]));
            0;
            0;
            if null != null {
                return;
            }
        } else {
            int[] nArray = new int[var1[2]];
            nArray[y.var1[0]] = var1[35];
            Inventory.getFirst((int[])nArray).interact(var2[var1[9]]);
        }
    }

    private void bu() {
        if (y.var18(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var1[36], var1[37], var1[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[36], var1[37], var1[0]));
            0;
            0;
            if (-3 > 0) {
                return;
            }
        } else {
            int[] nArray = new int[var1[2]];
            nArray[y.var1[0]] = var1[35];
            Inventory.getFirst((int[])nArray).interact(var2[var1[7]]);
        }
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var30;
        if (y.var3(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[var1[2]];
        nArray[y.var1[0]] = var30;
        NPC var31 = NPCs.getNearest((int[])nArray);
        if (y.var5(var31) && y.var3(Reachable.isInteractable((Locatable)var31) ? 1 : 0)) {
            var31.interact(var2[var1[11]]);
            0;
            if (2 < 0) {
                return;
            }
        } else {
            void var32;
            System.out.println(var2[var1[12]]);
            Walker.walkTo((WorldPoint)var32);
            0;
        }
    }

    private void co() {
        int[] nArray = new int[var1[2]];
        nArray[y.var1[0]] = var1[29];
        if (y.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var1[2]];
        nArray2[y.var1[0]] = var1[30];
        TileObject var33 = TileObjects.getNearest((int[])nArray2);
        if (y.var5(var33) && y.var3(Reachable.isInteractable((Locatable)var33) ? 1 : 0)) {
            var33.interact(var2[var1[0]]);
            0;
            if (((6 ^ 0x35 ^ (0x9F ^ 0xB4)) & (73 + 131 - 114 + 56 ^ 56 + 5 - -77 + 0 ^ -1)) > 2) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[31], var1[32], var1[0]));
            0;
        }
    }

    private static boolean var34(Object object) {
        return object == null;
    }

    private static void var20() {
        var2 = new String[var1[13]];
        y.var2[y.var1[0]] = "Pick-from";
        y.var2[y.var1[2]] = "Dig";
        y.var2[y.var1[7]] = "Dig";
        y.var2[y.var1[8]] = "Dig";
        y.var2[y.var1[9]] = "Dig";
        y.var2[y.var1[10]] = "Take";
        y.var2[y.var1[11]] = "Talk-to";
        y.var2[y.var1[12]] = "Walking to NPC";
    }

    private void cn() {
        int[] nArray = new int[var1[2]];
        nArray[y.var1[0]] = var1[20];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (y.var3(Dialog.isOpen() ? 1 : 0) && y.var34(nPC)) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[21], var1[22], var1[2]));
            0;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var1[6]];
        dialogOptionArray[y.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var1[20], new WorldPoint(var1[21], var1[22], var1[2]), dialogOptionArray);
    }

    private static boolean var29(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private void cl() {
        DialogOption[] dialogOptionArray = new DialogOption[var1[6]];
        dialogOptionArray[y.var1[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[15]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.var1[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.var1[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(var1[26], new WorldPoint(var1[27], var1[28], var1[0]), dialogOptionArray);
    }

    private void bt() {
        if (y.var18(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var1[33], var1[34], var1[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[33], var1[34], var1[0]));
            0;
            0;
            if (-(20 + 74 - 46 + 130 ^ 1 + 78 - 62 + 166) >= 0) {
                return;
            }
        } else {
            int[] nArray = new int[var1[2]];
            nArray[y.var1[0]] = var1[35];
            Inventory.getFirst((int[])nArray).interact(var2[var1[2]]);
        }
    }
}

