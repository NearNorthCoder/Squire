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

@TaskDesc(name="Completing Client Of Kourend")
public class CompletingClientOfKourendTask
extends Task {
    private final  SquireQuesterConfig ap;

    private int Q() {
        return Static.getClient().getVarbitValue(b.QUEST_CLIENT_OF_KOUREND.c());
    }

    private boolean K() {
        if (o.var3(Static.getClient().getVarbitValue(var2[43]), var2[2])) {
            return var2[2];
        }
        return var2[0];
    }

    private boolean I() {
        if (o.var3(Static.getClient().getVarbitValue(var2[41]), var2[2])) {
            return var2[2];
        }
        return var2[0];
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var5() {
        var1 = new String[var2[11]];
        o.var1[o.var2[0]] = "walking";
        o.var1[o.var2[2]] = "Activate";
        o.var1[o.var2[7]] = "Chicken";
        o.var1[o.var2[8]] = "Take";
        o.var1[o.var2[9]] = "Attack";
        o.var1[o.var2[10]] = "Talk-to";
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var6;
        if (o.var4(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[var2[2]];
        nArray[o.var2[0]] = var6;
        NPC var7 = NPCs.getNearest((int[])nArray);
        if (o.var8(var7) && o.var4(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
            var7.interact(var1[var2[10]]);
            0;
            if ((0x71 ^ 0x5A ^ (0x67 ^ 0x48)) == 0) {
                return;
            }
        } else {
            o var9;
            void var10;
            System.out.println("Walking to NPC: " + (int)var6 + " at " + String.valueOf(var10));
            Walker.walkTo((WorldPoint)var10);
            0;
            var9.sleep(var2[7]);
        }
    }

    public boolean run() {
        o var11;
        if (o.var12(this.ap.quest().equals((Object)h.CLIENT_OF_KOUREND) ? 1 : 0)) {
            return var2[0];
        }
        int var13 = var11.Q();
        if (o.var14(var13, var2[1])) {
            return var2[0];
        }
        System.out.println("[CLIENT_OF_KOUREND] - Current Progress: " + var13);
        switch (var13) {
            case 0: {
                var11.N();
                var11.P();
                var11.M();
                0;
                if (3 != 0) break;
                return ((0xA4 ^ 0x81) & ~(0x10 ^ 0x35)) != 0;
            }
            case 1: {
                var11.L();
                var11.C();
                var11.B();
                var11.E();
                var11.D();
                var11.F();
                var11.P();
                0;
                if (1 < 2) break;
                return ((0x3F ^ 0x5F) & ~(0x59 ^ 0x39)) != 0;
            }
            case 2: {
                var11.A();
                var11.P();
                0;
                if (3 >= 3) break;
                return ((0x63 ^ 0x78) & ~(0x1C ^ 7)) != 0;
            }
            case 3: {
                var11.A();
                0;
                if (3 >= 2) break;
                return ((108 + 154 - 211 + 169 ^ 116 + 98 - 164 + 85) & (9 ^ 0x7C ^ (0x22 ^ 0xC) ^ -1)) != 0;
            }
            case 4: {
                var11.z();
                0;
                if (-1 < 2) break;
                return ((0x3F ^ 0x30) & ~(5 ^ 0xA)) != 0;
            }
            case 5: {
                var11.y();
                var11.P();
                0;
                if null == null break;
                return ((22 + 113 - 117 + 122 ^ 65 + 107 - 95 + 61) & (0x2E ^ 0x58 ^ (0xB1 ^ 0xC1) ^ -1)) != 0;
            }
            case 6: {
                var11.P();
            }
            default: {
                return var2[0];
            }
        }
        return var2[2];
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private boolean J() {
        if (o.var3(Static.getClient().getVarbitValue(var2[42]), var2[2])) {
            return var2[2];
        }
        return var2[0];
    }

    private void A() {
        int[] nArray = new int[var2[2]];
        nArray[o.var2[0]] = var2[14];
        if (o.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[17]];
        dialogOptionArray[o.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.var2[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[12]] = DialogOption.QUEST;
        dialogOptionArray[o.var2[13]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[o.var2[6]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[23]] = DialogOption.PLAYER_CONTINUE;
        this.a(var2[3], new WorldPoint(var2[4], var2[5], var2[0]), dialogOptionArray);
    }

    private void E() {
        o var15;
        if (o.var12(this.J() ? 1 : 0)) {
            return;
        }
        if (o.var4(var15.H() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[18]];
        dialogOptionArray[o.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.var2[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[6]] = DialogOption.CHAT_OPTION_THREE;
        this.a(var2[33], new WorldPoint(var2[34], var2[35], var2[0]), dialogOptionArray);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private void z() {
        int[] nArray = new int[var2[2]];
        nArray[o.var2[0]] = var2[14];
        if (o.var12(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (o.var22(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var2[15], var2[16], var2[0])))) {
            o var23;
            System.out.println(var1[var2[0]]);
            Walker.walkTo((WorldPoint)new WorldPoint(var2[15], var2[16], var2[0]));
            0;
            var23.sleep(var2[10]);
            0;
            
        } else {
            int[] nArray2 = new int[var2[2]];
            nArray2[o.var2[0]] = var2[14];
            Inventory.getFirst((int[])nArray2).interact(var1[var2[2]]);
        }
    }

    private void M() {
        int[] nArray = new int[var2[2]];
        nArray[o.var2[0]] = var2[45];
        if (o.var12(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[6]];
        dialogOptionArray[o.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.var2[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[13]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var2[3], new WorldPoint(var2[4], var2[5], var2[0]), dialogOptionArray);
    }

    private void y() {
        DialogOption[] dialogOptionArray = new DialogOption[var2[6]];
        dialogOptionArray[o.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.var2[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[13]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var2[3], new WorldPoint(var2[4], var2[5], var2[0]), dialogOptionArray);
    }

    private boolean H() {
        if (o.var3(Static.getClient().getVarbitValue(var2[40]), var2[2])) {
            return var2[2];
        }
        return var2[0];
    }

    private void B() {
        o var24;
        if (o.var12(this.K() ? 1 : 0)) {
            return;
        }
        if (o.var4(var24.J() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[18]];
        dialogOptionArray[o.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[o.var2[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[6]] = DialogOption.CHAT_OPTION_THREE;
        this.a(var2[24], new WorldPoint(var2[25], var2[26], var2[0]), dialogOptionArray);
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    static {
        o.var25();
        o.var5();
    }

    private void D() {
        o var26;
        if (o.var12(this.H() ? 1 : 0)) {
            return;
        }
        if (o.var4(var26.G() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[18]];
        dialogOptionArray[o.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.var2[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[6]] = DialogOption.CHAT_OPTION_THREE;
        this.a(var2[30], new WorldPoint(var2[31], var2[32], var2[0]), dialogOptionArray);
    }

    private static boolean var27(int n2, int n3) {
        return n2 < n3;
    }

    private static String var28(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = var2[0];
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = var2[0];
        while (o.var27(var36, var35)) {
            char var37 = var34[var36];
            var31.append((char)(var37 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            if (-1 <= -1) continue;
            return null;
        }
        return String.valueOf(var31);
    }

    private void N() {
        this.O();
    }

    @Inject
    public CompletingClientOfKourendTask(SquireQuesterConfig squireQuesterConfig) {
        this.ap = squireQuesterConfig;
    }

    private static void var25() {
        var2 = new int[49];
        o.var2[0] = (0xF7 ^ 0xAF) & ~(0x2D ^ 0x75);
        o.var2[1] = 0x94 ^ 0x8A;
        o.var2[2] = 1;
        o.var2[3] = -(0xFFFFE61F & 0x5FF1) & (0xFFFFFFF7 & 0x6FFF);
        o.var2[4] = -(0xFFFFB9FE & 0x5E9D) & (0xFFFFBFBB & 0x5FFF);
        o.var2[5] = -(0xFFFF97F7 & 0x699D) & (0xFFFF8FFF & 0x7FFE);
        o.var2[6] = 3 ^ 0xA;
        o.var2[7] = 2;
        o.var2[8] = 3;
        o.var2[9] = 0x29 ^ 0x2D;
        o.var2[10] = 0x43 ^ 0x46;
        o.var2[11] = 0x3B ^ 0x54 ^ (0x29 ^ 0x40);
        o.var2[12] = 0x6E ^ 0x72 ^ (0x31 ^ 0x2A);
        o.var2[13] = 61 + 157 - 112 + 55 ^ 160 + 73 - 154 + 90;
        o.var2[14] = -(0xFFFFAF55 & 0x74FB) & (0xFFFFF77F & 0x7FDD);
        o.var2[15] = -(0xFFFFFDD3 & 0x527F) & (0xFFFFD6FF & Short.MAX_VALUE);
        o.var2[16] = -(0xFFFFD697 & 0x79FE) & (0xFFFFDFBF & Short.MAX_VALUE);
        o.var2[17] = 97 + 142 - 81 + 14 ^ 147 + 143 - 209 + 107;
        o.var2[18] = 168 + 156 - 239 + 96 ^ 85 + 121 - 153 + 138;
        o.var2[19] = 0xA ^ 0x58 ^ (0xD ^ 0x54);
        o.var2[20] = 0x86 ^ 0x8A;
        o.var2[21] = 0x25 ^ 0x58 ^ (0x2C ^ 0x5C);
        o.var2[22] = 0x3D ^ 0xD ^ (0xD ^ 0x33);
        o.var2[23] = 0x7F ^ 0x70;
        o.var2[24] = -(0xFFFFE0F1 & 0x3F6F) & (0xFFFFBFFF & 0x7B7F);
        o.var2[25] = 0xFFFFDFFF & 0x26EC;
        o.var2[26] = 0xFFFF9E46 & 0x6FBB;
        o.var2[27] = -(0xFFFFE30D & 0x3EFB) & (0xFFFFF7FB & 0x2B3D);
        o.var2[28] = -(0xFFFFFE7D & 0x5393) & (0xFFFFDFFF & 0x77FF);
        o.var2[29] = -(0xFFFFFDFB & 0x537F) & (0xFFFFFF7F & 0x5FFF);
        o.var2[30] = 0xFFFFFFBF & 0x1BF0;
        o.var2[31] = 0xFFFFE76F & 0x1E9F;
        o.var2[32] = 0xFFFFEFFF & 0x1EA7;
        o.var2[33] = 0xFFFF9FF2 & 0x7B9D;
        o.var2[34] = -(0xFFFFFDDB & 0x7B65) & (0xFFFFFFFB & 0x7FFD);
        o.var2[35] = 0xFFFF8EDF & 0x7FAF;
        o.var2[36] = 0xFFFFBFFA & 0x5B4F;
        o.var2[37] = 0xFFFFF71F & 0xFED;
        o.var2[38] = 0xFFFFDEBF & 0x2FCD;
        o.var2[39] = -(0xFFFFA65E & 0x7BAB) & (0xFFFFF7FF & 0x3FFF);
        o.var2[40] = 0xFFFF9DF5 & 0x77FF;
        o.var2[41] = 0xFFFFBDF6 & 0x57FD;
        o.var2[42] = 0xFFFFB7FD & 0x5DFA;
        o.var2[43] = 0xFFFF97F7 & 0x7DFF;
        o.var2[44] = 0xFFFFDFEF & 0x731C;
        o.var2[45] = 0xFFFF937E & 0x6DBB;
        o.var2[46] = 0xFFFFD38B & 0x7F7F;
        o.var2[47] = 0xFFFFCDB4 & 0x3EEB;
        o.var2[48] = 0xFFFFCCF1 & 0x3FEE;
    }

    private static boolean var38(Object object) {
        return object == null;
    }

    private static boolean var22(int n2) {
        return n2 > 0;
    }

    private void F() {
        o var39;
        if (o.var12(this.G() ? 1 : 0)) {
            return;
        }
        if (o.var4(var39.I() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[6]];
        dialogOptionArray[o.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[o.var2[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[9]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[o.var2[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[13]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var2[36], new WorldPoint(var2[37], var2[38], var2[0]), dialogOptionArray);
    }

    private void L() {
        int[] nArray = new int[var2[2]];
        nArray[o.var2[0]] = var2[44];
        if (o.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[o.var2[0]] = var2[45];
        int[] nArray3 = new int[var2[2]];
        nArray3[o.var2[0]] = var2[46];
        Inventory.getFirst((int[])nArray2).useOn(Inventory.getFirst((int[])nArray3));
    }

    private boolean G() {
        if (o.var3(Static.getClient().getVarbitValue(var2[39]), var2[2])) {
            return var2[2];
        }
        return var2[0];
    }

    private void P() {
        if (o.var4(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            this.sleep(var2[7]);
        }
    }

    private void C() {
        if (o.var4(this.K() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[18]];
        dialogOptionArray[o.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.var2[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.var2[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.var2[6]] = DialogOption.CHAT_OPTION_THREE;
        this.a(var2[27], new WorldPoint(var2[28], var2[29], var2[0]), dialogOptionArray);
    }

    private void O() {
        int[] nArray = new int[var2[2]];
        nArray[o.var2[0]] = var2[45];
        if (o.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (o.var8(Players.getLocal().getInteracting())) {
            return;
        }
        String[] stringArray = new String[var2[2]];
        stringArray[o.var2[0]] = var1[var2[7]];
        NPC var40 = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[var2[2]];
        nArray2[o.var2[0]] = var2[45];
        TileItem var41 = TileItems.getNearest((int[])nArray2);
        if (o.var8(var41) && o.var4(Reachable.isInteractable((Locatable)var41) ? 1 : 0)) {
            var41.interact(var1[var2[8]]);
            return;
        }
        if (o.var8(var40) && o.var4(Reachable.isInteractable((Locatable)var40) ? 1 : 0) && o.var38(Players.getLocal().getInteracting())) {
            var40.interact(var1[var2[9]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(var2[47], var2[48], var2[0]));
        0;
    }

        catch (Exception var47) {
            var47.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }
}

