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
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
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
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.quest.tasks.GameEnum2;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Completing Pirates Treasure", register=true)
public class CompletingPiratesTreasureTask
extends Task {
    private  boolean aN;
    private  boolean aQ;
    private  boolean aP;
    
    private  boolean aO;
    
    private  boolean aR;
    private final  SquireQuesterConfig aM;

    private void bj() {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (v.var3(nPC.getId(), var2[87]) && v.var4(nPC.getInteracting(), Players.getLocal())) {
                n2 = var2[2];
                0;
                if ((0x7C ^ 0x2B ^ (0xC9 ^ 0x9A)) == ((0x42 ^ 0x1E ^ (0xF8 ^ 0x9C)) & (0x9B ^ 0x93 ^ (0x8C ^ 0xBC) ^ -1))) {
                    return ((3 + 49 - -115 + 41 ^ 28 + 79 - -40 + 5) & (0xF9 ^ 0xBD ^ (0x4E ^ 0x42) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (v.var5(list.isEmpty() ? 1 : 0)) {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[3], var2[4], var2[0]));
            0;
            return;
        }
        if (v.var6(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var2[5], var2[6], var2[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[5], var2[6], var2[0]));
            0;
            0;
            if (3 < 0) {
                return;
            }
        } else {
            int[] nArray = new int[var2[2]];
            nArray[v.var2[0]] = var2[7];
            Inventory.getFirst((int[])nArray).interact(var1[var2[0]]);
        }
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static void var13() {
        var1 = new String[var2[88]];
        v.var1[v.var2[0]] = "Dig";
        v.var1[v.var2[2]] = "Read";
        v.var1[v.var2[18]] = "Taking";
        v.var1[v.var2[19]] = "Take";
        v.var1[v.var2[1]] = "We are wearing our apron";
        v.var1[v.var2[20]] = "Search";
        v.var1[v.var2[21]] = "Wear";
        v.var1[v.var2[22]] = "Collecting payment";
        v.var1[v.var2[23]] = "You stash the rum in the crate.";
        v.var1[v.var2[24]] = "Setting stashed rum to true";
        v.var1[v.var2[17]] = "You pack all your bananas into the crate.";
        v.var1[v.var2[40]] = "Setting stashed to true";
        v.var1[v.var2[42]] = "Filling with rum";
        v.var1[v.var2[44]] = "Filling with banana";
        v.var1[v.var2[45]] = "Fill";
        v.var1[v.var2[47]] = "Have you completed your task yet?";
        v.var1[v.var2[48]] = "Pick";
        v.var1[v.var2[49]] = "Pick";
        v.var1[v.var2[51]] = "Trade";
        v.var1[v.var2[60]] = "Dig";
        v.var1[v.var2[63]] = "Dig";
        v.var1[v.var2[66]] = "Dig";
        v.var1[v.var2[69]] = "Dig";
        v.var1[v.var2[70]] = "Take";
        v.var1[v.var2[78]] = "Talk-to";
        v.var1[v.var2[79]] = "Walking to NPC";
        v.var1[v.var2[80]] = "crate is already full.";
        v.var1[v.var2[81]] = "crate is full";
        v.var1[v.var2[82]] = "hands you 30";
        v.var1[v.var2[83]] = "Pick";
        v.var1[v.var2[84]] = "Banana Tree";
        v.var1[v.var2[85]] = "Pick";
        v.var1[v.var2[86]] = "Banana Tree";
    }

    private void bq() {
        v var14;
        if (v.var15(this.aR)) {
            return;
        }
        if (v.var15(var14.aO)) {
            return;
        }
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[43];
        if (v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[v.var2[0]] = var2[43];
        if (v.var16(Inventory.getCount((boolean)var2[0], (int[])nArray2), var2[17])) {
            return;
        }
        System.out.println(var14.aN);
        if (v.var15(var14.aN)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[17]];
        dialogOptionArray[v.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.var2[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[24]] = DialogOption.CHAT_OPTION_ONE;
        var14.a(var2[36], new WorldPoint(var2[37], var2[38], var2[0]), dialogOptionArray);
        if (v.var15(Widgets.get((int)var2[46], (int)var2[21]).getText().equals(var1[var2[47]]) ? 1 : 0)) {
            var14.aN = var2[2];
        }
    }

    private void bo() {
        v var17;
        if (v.var15(this.aR)) {
            return;
        }
        if (v.var5(var17.aP)) {
            return;
        }
        if (v.var5(var17.aQ)) {
            return;
        }
        System.out.println(var1[var2[22]]);
        DialogOption[] dialogOptionArray = new DialogOption[var2[18]];
        dialogOptionArray[v.var2[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[2]] = DialogOption.NPC_CONTINUE;
        this.a(var2[36], new WorldPoint(var2[37], var2[38], var2[0]), dialogOptionArray);
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    private void bz() {
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[7];
        if (v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[17]];
        dialogOptionArray[v.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.var2[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var2[14], new WorldPoint(var2[15], var2[16], var2[0]), dialogOptionArray);
    }

    private void P() {
        if (v.var15(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void bk() {
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[8];
        if (v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[v.var2[0]] = var2[8];
        Inventory.getFirst((int[])nArray2).interact(var1[var2[2]]);
    }

    private void bx() {
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[7];
        if (v.var15(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[v.var2[0]] = var2[7];
        TileItem var18 = TileItems.getNearest((int[])nArray2);
        if (v.var19(var18)) {
            var18.interact(var1[var2[70]]);
            0;
            if (2 <= -1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[71], var2[72], var2[2]));
            0;
        }
    }

    private void bs() {
        v var20;
        if (v.var15(this.aR)) {
            return;
        }
        if (v.var15(var20.aP)) {
            return;
        }
        if (v.var15(var20.aO)) {
            return;
        }
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[13];
        if (v.var15(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[v.var2[0]] = var2[50];
        NPC var21 = NPCs.getNearest((int[])nArray2);
        if (v.var15(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)var2[13]);
        }
        if (v.var19(var21)) {
            var21.interact(var1[var2[51]]);
            0;
            if null != null {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[52], var2[53], var2[0]));
            0;
        }
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[0];
        while (v.var16(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if ((0xD2 ^ 0x87 ^ (0xFA ^ 0xAA)) > 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        v var38;
        if (v.var5(this.aM.quest().equals((Object)h.PIRATES_TREASURE) ? 1 : 0)) {
            return var2[0];
        }
        int var39 = var38.Q();
        if (v.var40(var39, var2[1])) {
            return var2[0];
        }
        System.out.println("[PIRATES TREASURE] - Current Progress: " + var39);
        switch (var39) {
            case 0: {
                var38.bx();
                var38.bz();
                0;
                if (-1 <= 0) break;
                return ((0x35 ^ 0x1D) & ~(0x3C ^ 0x14)) != 0;
            }
            case 1: {
                var38.by();
                var38.bs();
                var38.br();
                var38.bq();
                var38.bp();
                var38.bo();
                var38.bn();
                var38.bm();
                0;
                if (1 != 0) break;
                return ((0x2F ^ 0x71) & ~(0x61 ^ 0x3F)) != 0;
            }
            case 2: {
                var38.bl();
                var38.bk();
                0;
                if (-1 <= ((0x81 ^ 0x8C) & ~(0xAB ^ 0xA6))) break;
                return ((0x34 ^ 0x16) & ~(0xA5 ^ 0x87)) != 0;
            }
            case 3: {
                var38.bj();
                0;
                if (1 != ((0x6C ^ 0x71 ^ (0x9E ^ 0xA2)) & (0xE0 ^ 0xA4 ^ (0x16 ^ 0x73) ^ -1))) break;
                return ((121 + 68 - 150 + 145 ^ 51 + 88 - 48 + 48) & (0x58 ^ 0x16 ^ (0x2B ^ 0x56) ^ -1)) != 0;
            }
            default: {
                return var2[0];
            }
        }
        return var2[2];
    }

    private void br() {
        TileObject var41;
        v var42;
        if (v.var15(this.aR)) {
            return;
        }
        if (v.var15(var42.aP)) {
            return;
        }
        if (v.var15(var42.aO)) {
            return;
        }
        if (v.var15(var42.aN)) {
            return;
        }
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[13];
        if (v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[v.var2[0]] = var2[43];
        if (v.var15(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var2[2]];
            nArray3[v.var2[0]] = var2[43];
            if (v.var16(Inventory.getCount((boolean)var2[0], (int[])nArray3), var2[17]) && v.var19(var41 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[var2[2]];
                stringArray[v.var2[0]] = var1[var2[85]];
                if (v.var15(tileObject.hasAction(stringArray) ? 1 : 0) && v.var15(tileObject.getName().equals(var1[var2[86]]) ? 1 : 0)) {
                    n2 = var2[2];
                    0;
                    if (((0xA2 ^ 0xA5) & ~(0x5A ^ 0x5D)) > 0) {
                        return ((0x79 ^ 0x73) & ~(0x9B ^ 0x91)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            })) && v.var15(Reachable.isInteractable((Locatable)var41) ? 1 : 0)) {
                var41.interact(var1[var2[48]]);
            }
        }
        int[] nArray4 = new int[var2[2]];
        nArray4[v.var2[0]] = var2[43];
        if (v.var5(Inventory.contains((int[])nArray4) ? 1 : 0) && v.var19(var41 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[var2[2]];
            stringArray[v.var2[0]] = var1[var2[83]];
            if (v.var15(tileObject.hasAction(stringArray) ? 1 : 0) && v.var15(tileObject.getName().equals(var1[var2[84]]) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (((4 ^ 0x66) & ~(0xC7 ^ 0xA5)) <= -1) {
                    return ((0x86 ^ 0x9A) & ~(0x85 ^ 0x99)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        })) && v.var15(Reachable.isInteractable((Locatable)var41) ? 1 : 0)) {
            var41.interact(var1[var2[49]]);
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_PIRATES_TREASURE.c());
    }

    private void bt() {
        if (v.var6(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var2[58], var2[59], var2[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[58], var2[59], var2[0]));
            0;
            0;
            if (((0x77 ^ 0x28) & ~(9 ^ 0x56)) != ((0xED ^ 0xBF) & ~(0x24 ^ 0x76))) {
                return;
            }
        } else {
            int[] nArray = new int[var2[2]];
            nArray[v.var2[0]] = var2[7];
            Inventory.getFirst((int[])nArray).interact(var1[var2[60]]);
        }
    }

    private void Y() {
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[54];
        if (v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[17]];
        dialogOptionArray[v.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[v.var2[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var2[55], new WorldPoint(var2[56], var2[57], var2[0]), dialogOptionArray);
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var43;
        if (v.var15(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var43;
        NPC var44 = NPCs.getNearest((int[])nArray);
        if (v.var19(var44) && v.var15(Reachable.isInteractable((Locatable)var44) ? 1 : 0)) {
            var44.interact(var1[var2[78]]);
            0;
            if (((0x5D ^ 0x6F) & ~(0x1D ^ 0x2F)) != 0) {
                return;
            }
        } else {
            void var45;
            System.out.println(var1[var2[79]]);
            Walker.walkTo((WorldPoint)var45);
            0;
        }
    }

    private void by() {
        if (v.var15(this.aR)) {
            return;
        }
        if (!v.var46(Players.getLocal().getWorldLocation().getRegionID(), var2[73]) || v.var3(Players.getLocal().getWorldLocation().getRegionID(), var2[74])) {
            return;
        }
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[7];
        if (v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[1]];
        dialogOptionArray[v.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[18]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.var2[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(var2[75], new WorldPoint(var2[76], var2[77], var2[0]), dialogOptionArray);
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    static {
        v.var47();
        v.var13();
    }

    private void bl() {
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[8];
        if (v.var15(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[v.var2[0]] = var2[9];
        if (v.var5(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        int[] nArray3 = new int[var2[2]];
        nArray3[v.var2[0]] = var2[10];
        TileObject var48 = TileObjects.getNearest((int[])nArray3);
        if (v.var19(var48) && v.var15(Reachable.isInteractable((Locatable)var48) ? 1 : 0)) {
            int[] nArray4 = new int[var2[2]];
            nArray4[v.var2[0]] = var2[9];
            Inventory.getFirst((int[])nArray4).useOn(var48);
            0;
            if null != null {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[11], var2[12], var2[2]));
            0;
        }
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var19(Object object) {
        return object != null;
    }

    private static void var47() {
        var2 = new int[89];
        v.var2[0] = (0xE0 ^ 0xA6) & ~(1 ^ 0x47);
        v.var2[1] = 0x3D ^ 0x39;
        v.var2[2] = 1;
        v.var2[3] = 0xFFFF8BB2 & Short.MAX_VALUE;
        v.var2[4] = 0xFFFF8D3B & 0x7FEE;
        v.var2[5] = 0xFFFFDBF7 & 0x2FBF;
        v.var2[6] = -(0xFFFFDC5F & 0x73E9) & (0xFFFFDF7F & 0x7DFF);
        v.var2[7] = -(0xFFFFF43B & 0x1FC5) & (0xFFFFF7F8 & 0x1FBF);
        v.var2[8] = 0xFFFFD7BF & 0x29F1;
        v.var2[9] = 0xFFFFADB2 & 0x53FD;
        v.var2[10] = -(0xFFFFF5E1 & 0x7F7F) & (0xFFFFFFFF & 0x7D7F);
        v.var2[11] = 0xFFFFBCBF & 0x4FD3;
        v.var2[12] = 0xFFFFCD43 & 0x3FFF;
        v.var2[13] = -(0xFFFFEF37 & 0x7ED9) & (0xFFFFFFFF & 0x6FBF);
        v.var2[14] = -(0xFFFFD55D & 0x7BE7) & (0xFFFFDFFF & 0x7F7F);
        v.var2[15] = -(0xFFFFDCD9 & 0x6727) & (0xFFFFDFFF & 0x6FED);
        v.var2[16] = 0xFFFF9EB5 & 0x6DFF;
        v.var2[17] = 42 + 94 - 23 + 17 ^ 18 + 1 - -4 + 113;
        v.var2[18] = 2;
        v.var2[19] = 3;
        v.var2[20] = 0x5A ^ 0x6F ^ (0x25 ^ 0x15);
        v.var2[21] = 0xA8 ^ 0xB9 ^ (0xD1 ^ 0xC6);
        v.var2[22] = 0x51 ^ 0x56;
        v.var2[23] = (0x82 ^ 0xB3) & ~(0x85 ^ 0xB4) ^ (0x16 ^ 0x1E);
        v.var2[24] = 4 ^ 0x31 ^ (0x5F ^ 0x63);
        v.var2[25] = 0xFFFFAFBF & 0x7F72;
        v.var2[26] = 0xFFFF8F42 & 0x7EFD;
        v.var2[27] = 0xFFFFEBBF & 0x1FC9;
        v.var2[28] = -(0xFFFFBAAB & 0x7577) & (0xFFFFBD7E & 0x7EEF);
        v.var2[29] = -(0xFFFFBEFB & 0x6D17) & (0xFFFFBFFF & 0x6FFF);
        v.var2[30] = -(0xFFFFFA97 & 0x65EB) & (0xFFFFFFF7 & 0x7F9F);
        v.var2[31] = 0xFFFFCFD8 & 0x3BEF;
        v.var2[32] = 0xFFFFDDFF & 0x2E9C;
        v.var2[33] = -(0xFFFFFF3B & 0x57E5) & (0xFFFFFFFF & 0x5F37);
        v.var2[34] = -(0xFFFFE65B & 0x79AE) & (0xFFFFFFFF & 0x6BCB);
        v.var2[35] = -(0xFFFFA7A9 & 0x7A77) & (0xFFFFAEBF & 0x7FE7);
        v.var2[36] = 0xFFFFAFFF & 0x5E3F;
        v.var2[37] = -(0xFFFFF6EF & 0x5D96) & (0xFFFFDFFF & Short.MAX_VALUE);
        v.var2[38] = 0xFFFFED7D & 0x1ED3;
        v.var2[39] = 157 + 24 - 42 + 52 + (0x42 ^ 8) - (154 + 41 - 19 + 54) + (181 + 108 - 267 + 172);
        v.var2[40] = 0x8D ^ 0x86;
        v.var2[41] = -(0xFFFFF7BB & 0x6C65) & (0xFFFFFFFD & 0x6C3A);
        v.var2[42] = 0x37 ^ 0x3B;
        v.var2[43] = 0xFFFF97BF & 0x6FEB;
        v.var2[44] = 0x60 ^ 0x13 ^ (0x1C ^ 0x62);
        v.var2[45] = 0x38 ^ 0x36;
        v.var2[46] = 204 + 4 - 143 + 166;
        v.var2[47] = 5 ^ 0xA;
        v.var2[48] = 0x67 ^ 0x77;
        v.var2[49] = 0x14 ^ 0x50 ^ (0x22 ^ 0x77);
        v.var2[50] = -(0xFFFFC999 & 0x3EEF) & (0xFFFFBFFF & 0x7DDF);
        v.var2[51] = 0x9F ^ 0x8D;
        v.var2[52] = -(0xFFFFCC5F & 0x77A5) & (0xFFFFDF7F & 0x6FF4);
        v.var2[53] = 0xFFFFAF6F & 0x5CD8;
        v.var2[54] = 0xFFFFDBDF & 0x7E3F;
        v.var2[55] = 0xFFFFBF76 & 0x61AD;
        v.var2[56] = 0xFFFFCFEE & 0x3BFF;
        v.var2[57] = -(0xFFFFF7DB & 0x1826) & (0xFFFFDFAF & 0x3CFF);
        v.var2[58] = 0xFFFFEFDF & 0x1C26;
        v.var2[59] = 0xFFFFECBB & 0x1FFF;
        v.var2[60] = 0x29 ^ 0x3A;
        v.var2[61] = 0xFFFFEF3D & 0x1CE7;
        v.var2[62] = 0xFFFFFEFA & 0xDC5;
        v.var2[63] = 93 + 10 - 76 + 126 ^ 85 + 140 - 88 + 4;
        v.var2[64] = -(0xFFFFB765 & 0x6ADB) & (0xFFFFBEEB & 0x6FD7);
        v.var2[65] = 0xFFFF9FDD & 0x6CAE;
        v.var2[66] = 0xE0 ^ 0xAD ^ (0x54 ^ 0xC);
        v.var2[67] = -(0xFFFFFE63 & 0x3FD) & (0xFFFFBFFE & 0x4EFF);
        v.var2[68] = 0xFFFFDEA9 & 0x2DDF;
        v.var2[69] = 0xB4 ^ 0xA2;
        v.var2[70] = 0xA ^ 0x79 ^ (0x27 ^ 0x43);
        v.var2[71] = -(0xFFFFDB3D & 0x77EF) & (0xFFFFDFBF & 0x7FFC);
        v.var2[72] = 0xFFFF8FDB & 0x7D77;
        v.var2[73] = 0xFFFFBEBF & 0x6F71;
        v.var2[74] = 0xFFFFEDFD & 0x3F33;
        v.var2[75] = -(0xFFFFE3C5 & 0x3DFB) & (0xFFFFFFFD & 0x2FFF);
        v.var2[76] = 0xFFFFBBF3 & 0x4FDF;
        v.var2[77] = -(0xFFFFB367 & 0x7FFB) & (0xFFFFBFF7 & Short.MAX_VALUE);
        v.var2[78] = 0x40 ^ 0x58;
        v.var2[79] = 0x1E ^ 7;
        v.var2[80] = 0xB8 ^ 0xA2;
        v.var2[81] = 0x77 ^ 0x69 ^ (0x4F ^ 0x4A);
        v.var2[82] = 0x78 ^ 0x64;
        v.var2[83] = 8 ^ 0x15;
        v.var2[84] = 12 + 25 - 4 + 121 ^ 77 + 27 - 13 + 41;
        v.var2[85] = 0xE1 ^ 0x90 ^ (0x13 ^ 0x7D);
        v.var2[86] = 0x5F ^ 0x7F;
        v.var2[87] = -(0xFFFFF07F & 0x1FA9) & (0xFFFF9FEB & 0x7E7F);
        v.var2[88] = 0x44 ^ 0x7B ^ (0xAF ^ 0xB1);
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var40(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public CompletingPiratesTreasureTask(SquireQuesterConfig squireQuesterConfig) {
        this.aN = var2[0];
        this.aO = var2[0];
        this.aP = var2[0];
        this.aQ = var2[0];
        this.aR = var2[0];
        this.aM = squireQuesterConfig;
    }

    private static boolean var46(int n2, int n3) {
        return n2 != n3;
    }

    private void bv() {
        if (v.var6(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var2[64], var2[65], var2[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[64], var2[65], var2[0]));
            0;
            0;
            if (((0x9F ^ 0xA8) & ~(0x75 ^ 0x42)) < ((0xAD ^ 0xA3) & ~(0x75 ^ 0x7B))) {
                return;
            }
        } else {
            int[] nArray = new int[var2[2]];
            nArray[v.var2[0]] = var2[7];
            Inventory.getFirst((int[])nArray).interact(var1[var2[66]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var49;
        String string = chatMessage.getMessage();
        if (v.var15(string.contains(var1[var2[80]]) ? 1 : 0)) {
            this.aO = var2[2];
        }
        if (v.var15(var49.contains(var1[var2[81]]) ? 1 : 0)) {
            var50.aO = var2[2];
        }
        if (v.var15(var49.contains(var1[var2[82]]) ? 1 : 0)) {
            var50.aR = var2[2];
        }
    }

    private void bn() {
        if (v.var5(this.aR)) {
            return;
        }
        if (v.var15(Dialog.isOpen() ? 1 : 0)) {
            Dialog.continueSpace();
            if (v.var15(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)var2[2]);
                0;
                return;
            }
            return;
        }
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[13];
        if (v.var15(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (v.var46(Players.getLocal().getWorldLocation().getRegionID(), var2[25])) {
            v var51;
            DialogOption[] dialogOptionArray = new DialogOption[var2[24]];
            dialogOptionArray[v.var2[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.var2[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[v.var2[18]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[v.var2[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.var2[1]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArray[v.var2[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[v.var2[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.var2[22]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[v.var2[23]] = DialogOption.PLAYER_CONTINUE;
            var51.a(var2[26], new WorldPoint(var2[27], var2[28], var2[0]), dialogOptionArray);
            return;
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[v.var2[0]] = var2[29];
        if (v.var5(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var2[2]];
            nArray3[v.var2[0]] = var2[29];
            if (v.var5(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[var2[2]];
                nArray4[v.var2[0]] = var2[30];
                TileItem var52 = TileItems.getNearest((int[])nArray4);
                if (v.var19(var52) && v.var15(Reachable.isInteractable((Locatable)var52) ? 1 : 0)) {
                    System.out.println(var1[var2[18]]);
                    var52.interact(var1[var2[19]]);
                    0;
                    if (-3 >= 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(var2[31], var2[32], var2[0]));
                    0;
                }
                return;
            }
        }
        int[] nArray5 = new int[var2[2]];
        nArray5[v.var2[0]] = var2[29];
        if (v.var15(Equipment.contains((int[])nArray5) ? 1 : 0)) {
            int[] nArray6 = new int[var2[2]];
            nArray6[v.var2[0]] = var2[29];
            System.out.println(Equipment.contains((int[])nArray6));
            System.out.println(var1[var2[1]]);
            int[] nArray7 = new int[var2[2]];
            nArray7[v.var2[0]] = var2[33];
            TileObject var52 = TileObjects.getNearest((int[])nArray7);
            if (v.var19(var52) && v.var15(Reachable.isInteractable((Locatable)var52) ? 1 : 0)) {
                var52.interact(var1[var2[20]]);
                0;
                if (((0x91 ^ 0x95) & ~(0x33 ^ 0x37)) <= -1) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var2[34], var2[35], var2[0]));
                0;
            }
        }
        int[] nArray8 = new int[var2[2]];
        nArray8[v.var2[0]] = var2[29];
        if (v.var15(Inventory.contains((int[])nArray8) ? 1 : 0)) {
            int[] nArray9 = new int[var2[2]];
            nArray9[v.var2[0]] = var2[29];
            Inventory.getFirst((int[])nArray9).interact(var1[var2[21]]);
            return;
        }
    }

    private static boolean var6(int n2) {
        return n2 > 0;
    }

    private void bm() {
        if (v.var5(this.aR)) {
            return;
        }
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[13];
        if (v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[var2[17]];
        dialogOptionArray[v.var2[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.var2[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.var2[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.var2[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(var2[14], new WorldPoint(var2[15], var2[16], var2[0]), dialogOptionArray);
    }

    private void bp() {
        v var53;
        if (v.var15(this.aR)) {
            return;
        }
        if (v.var5(var53.aN)) {
            return;
        }
        if (v.var19(Widgets.get((int)var2[39], (int)var2[2]))) {
            if (v.var15(Widgets.get((int)var2[39], (int)var2[2]).getText().equals(var1[var2[23]]) ? 1 : 0)) {
                var53.aP = var2[2];
                System.out.println(var1[var2[24]]);
            }
            if (v.var15(Widgets.get((int)var2[39], (int)var2[2]).getText().equals(var1[var2[17]]) ? 1 : 0)) {
                var53.aQ = var2[2];
                System.out.println(var1[var2[40]]);
            }
        }
        if (v.var15(var53.aQ) && v.var15(var53.aP)) {
            return;
        }
        int[] nArray = new int[var2[2]];
        nArray[v.var2[0]] = var2[41];
        TileObject var54 = TileObjects.getNearest((int[])nArray);
        if (v.var19(var54) && v.var15(Reachable.isInteractable((Locatable)var54) ? 1 : 0)) {
            int[] nArray2 = new int[var2[2]];
            nArray2[v.var2[0]] = var2[13];
            if (v.var15(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[var2[2]];
                nArray3[v.var2[0]] = var2[13];
                Inventory.getFirst((int[])nArray3).useOn(var54);
                System.out.println(var1[var2[42]]);
                return;
            }
            int[] nArray4 = new int[var2[2]];
            nArray4[v.var2[0]] = var2[43];
            if (v.var15(Inventory.contains((int[])nArray4) ? 1 : 0) && v.var15(var53.aP)) {
                System.out.println(var1[var2[44]]);
                var54.interact(var1[var2[45]]);
            }
        }
    }

    private void bu() {
        if (v.var6(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var2[61], var2[62], var2[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[61], var2[62], var2[0]));
            0;
            0;
            if ((0xC1 ^ 0xB2 ^ (0x55 ^ 0x22)) > (0x99 ^ 0x81 ^ (0xAE ^ 0xB2))) {
                return;
            }
        } else {
            int[] nArray = new int[var2[2]];
            nArray[v.var2[0]] = var2[7];
            Inventory.getFirst((int[])nArray).interact(var1[var2[63]]);
        }
    }

    private void bw() {
        if (v.var6(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var2[67], var2[68], var2[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(var2[67], var2[68], var2[0]));
            0;
            0;
            if (2 < 0) {
                return;
            }
        } else {
            int[] nArray = new int[var2[2]];
            nArray[v.var2[0]] = var2[7];
            Inventory.getFirst((int[])nArray).interact(var1[var2[69]]);
        }
    }
}

