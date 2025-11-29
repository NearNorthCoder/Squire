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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.quest.tasks.GameEnum15;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing Witchs Potion")
public class CompletingWitchsPotionTask
extends Task {

    private final  SquireQuesterConfig bA;

    private static boolean lIlIIIlIIllIIll(Object object) {
        return object == null;
    }

    static {
        C.lIlIIIlIIlIlllI();
        C.lIlIIIlIIlIllIl();
    }

    private void cJ() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIIIII[2]];
        nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
        if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIlIIIII[2]];
            nArray3[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
            if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return;
            }
        }
        int[] nArray4 = new int[lIIIllIlIIIII[2]];
        nArray4[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return;
        }
        int[] nArray5 = new int[lIIIllIlIIIII[2]];
        nArray5[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[29];
        TileObject var1 = TileObjects.getNearest((int[])nArray5);
        if (C.lIlIIIlIIllIIlI(var1) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)var1) ? 1 : 0)) {
            int[] nArray6 = new int[lIIIllIlIIIII[2]];
            nArray6[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
            if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                int[] nArray7 = new int[lIIIllIlIIIII[2]];
                nArray7[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
                Inventory.getFirst((int[])nArray7).useOn(var1);
                return;
            }
            int[] nArray8 = new int[lIIIllIlIIIII[2]];
            nArray8[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
            if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                int[] nArray9 = new int[lIIIllIlIIIII[2]];
                nArray9[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
                Inventory.getFirst((int[])nArray9).useOn(var1);

                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[30], lIIIllIlIIIII[31], lIIIllIlIIIII[0]));

        }
    }

    private static boolean lIlIIIlIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIIllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public CompletingWitchsPotionTask(SquireQuesterConfig squireQuesterConfig) {
        this.bA = squireQuesterConfig;
    }

    private static boolean lIlIIIlIIlIllll(int n2) {
        return n2 == 0;
    }

    private void cI() {
        block12: {
            block11: {
                int[] nArray = new int[lIIIllIlIIIII[2]];
                nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[15];
                if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    return;
                }
                int[] nArray2 = new int[lIIIllIlIIIII[2]];
                nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
                if (!C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block11;
                int[] nArray3 = new int[lIIIllIlIIIII[2]];
                nArray3[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
                if (!C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block12;
            }
            System.out.println(lIIIllIIlllll[lIIIllIlIIIII[12]]);
            return;
        }
        System.out.println(lIIIllIIlllll[lIIIllIlIIIII[9]]);
        if (C.lIlIIIlIIllIIIl(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIllIlIIIII[15]);

            }
        } else {
            int[] nArray = new int[lIIIllIlIIIII[2]];
            nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[18];
            NPC var2 = NPCs.getNearest((int[])nArray);
            if (C.lIlIIIlIIllIIlI(var2) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
                var2.interact(lIIIllIIlllll[lIIIllIlIIIII[19]]);

                if (((113 + 95 - -3 + 15 ^ 97 + 42 - 84 + 114) & (0x50 ^ 0x2C ^ (0x97 ^ 0xA0) ^ -1)) != 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[20], lIIIllIlIIIII[21], lIIIllIlIIIII[0]));

            }
        }
    }

    private void cF() {
        if (C.lIlIIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlIIIII[2]];
        stringArray[C.lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[0]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (C.lIlIIIlIIllIIlI(var3) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            var3.interact(lIIIllIIlllll[lIIIllIlIIIII[2]]);

            if (3 == -1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[3], lIIIllIlIIIII[4], lIIIllIlIIIII[0]));

        }
    }

    private static boolean lIlIIIlIIllIIlI(Object object) {
        return object != null;
    }

        return String.valueOf(var4);
    }

    private void cL() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIIIII[2]];
        nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[36];
        TileObject var5 = TileObjects.getNearest((int[])nArray2);
        if (C.lIlIIIlIIllIIlI(var5) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            var5.interact(lIIIllIIlllll[lIIIllIlIIIII[37]]);

            if (3 < ((0x8A ^ 0xC0) & ~(0x4E ^ 4))) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[38], lIIIllIlIIIII[39], lIIIllIlIIIII[0]));

            return;
        }
    }

    private static boolean lIlIIIlIIllIIIl(int n2) {
        return n2 != 0;
    }

    private void cK() {
        block8: {
            block7: {
                int[] nArray = new int[lIIIllIlIIIII[2]];
                nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
                if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    return;
                }
                int[] nArray2 = new int[lIIIllIlIIIII[2]];
                nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
                if (!C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block7;
                int[] nArray3 = new int[lIIIllIlIIIII[2]];
                nArray3[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
                if (!C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block7;
                int[] nArray4 = new int[lIIIllIlIIIII[2]];
                nArray4[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
                if (!C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block8;
            }
            return;
        }
        String[] stringArray = new String[lIIIllIlIIIII[2]];
        stringArray[C.lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[32]];
        NPC var6 = NPCs.getNearest((String[])stringArray);
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
        TileItem var7 = TileItems.getNearest((int[])nArray);
        if (C.lIlIIIlIIllIIlI(var7) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
            var7.interact(lIIIllIIlllll[lIIIllIlIIIII[33]]);
            return;
        }
        if (C.lIlIIIlIIllIIlI(var6) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)var6) ? 1 : 0) && C.lIlIIIlIIllIIll(Players.getLocal().getInteracting())) {
            var6.interact(lIIIllIIlllll[lIIIllIlIIIII[34]]);
            return;
        }
        if (C.lIlIIIlIIllIIll(var6)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[35], lIIIllIlIIIII[4], lIIIllIlIIIII[0]));

        }
    }

    public boolean run() {
        C var8;
        if (C.lIlIIIlIIlIllll(this.bA.quest().equals((Object)h.WITCHS_POTION) ? 1 : 0)) {
            return lIIIllIlIIIII[0];
        }
        int var9 = var8.Q();
        if (C.lIlIIIlIIllIIII(var9, lIIIllIlIIIII[1])) {
            return lIIIllIlIIIII[0];
        }
        System.out.println("[WITCHS_POTION] - Current Progress: " + var9);
        switch (var9) {
            case 0: {
                var8.N();
                var8.M();

                if (3 >= 3) break;
                return ((0xD7 ^ 0x93 ^ (0xC8 ^ 0xA5)) & (0x76 ^ 0x79 ^ (0x77 ^ 0x51) ^ -1)) != 0;
            }
            case 1: {
                var8.cH();
                var8.cG();

                if (-1 >= -1) break;
                return false;
            }
            case 2: {
                var8.cF();
                var8.P();

                if (((122 + 79 - 117 + 122 ^ 17 + 71 - 81 + 123) & (175 + 74 - 212 + 162 ^ 122 + 96 - 144 + 65 ^ -1)) > -1) break;
                return ((8 + 21 - -125 + 8 ^ 11 + 104 - 63 + 87) & (0xE6 ^ 0x95 ^ (0x9B ^ 0xC1) ^ -1)) != 0;
            }
            default: {
                return lIIIllIlIIIII[0];
            }
        }
        return lIIIllIlIIIII[2];
    }

    private void cH() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[5];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlIIIII[2]];
        stringArray[C.lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[10]];
        NPC var10 = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[lIIIllIlIIIII[2]];
        nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[5];
        TileItem var11 = TileItems.getNearest((int[])nArray2);
        if (C.lIlIIIlIIllIIlI(var11) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)var11) ? 1 : 0)) {
            var11.interact(lIIIllIIlllll[lIIIllIlIIIII[1]]);
            return;
        }
        if (C.lIlIIIlIIllIIlI(var10) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)var10) ? 1 : 0) && C.lIlIIIlIIllIIll(Players.getLocal().getInteracting())) {
            var10.interact(lIIIllIIlllll[lIIIllIlIIIII[11]]);
            return;
        }
        if (C.lIlIIIlIIllIIll(var10)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[13], lIIIllIlIIIII[14], lIIIllIlIIIII[0]));

        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var12;
        if (C.lIlIIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = var12;
        NPC var13 = NPCs.getNearest((int[])nArray);
        if (C.lIlIIIlIIllIIlI(var13) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)var13) ? 1 : 0)) {
            var13.interact(lIIIllIIlllll[lIIIllIlIIIII[40]]);

            }
        } else {
            void var14;
            System.out.println(lIIIllIIlllll[lIIIllIlIIIII[41]]);
            Walker.walkTo((WorldPoint)var14);

        }
    }

    private void cG() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[5];
        if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIIIII[9]];
        dialogOptionArray[C.lIIIllIlIIIII[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[11]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[12]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIIIII[6], new WorldPoint(lIIIllIlIIIII[7], lIIIllIlIIIII[8], lIIIllIlIIIII[0]), dialogOptionArray);
    }

    private void N() {
        this.cL();
        this.cK();
        this.cJ();
        this.Z();
        this.cI();
    }

    private static boolean lIlIIIlIIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_WITCHS_POTION.c());
    }

    private static void lIlIIIlIIlIllIl() {
        lIIIllIIlllll = new String[lIIIllIlIIIII[42]];
        C.lIIIllIIlllll[C.lIIIllIlIIIII[0]] = "Cauldron";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[2]] = "Drink From";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[10]] = "Rat";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[1]] = "Take";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[11]] = "Attack";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[12]] = "Returning false";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[9]] = "Getting eye of newt";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[19]] = "Trade";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[25]] = "Bank booth";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[26]] = "Bank";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[32]] = "Giant rat";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[33]] = "Take";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[34]] = "Attack";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[37]] = "Pick";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[40]] = "Talk-to";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[41]] = "Walking to NPC";
    }

    private void P() {
        if (C.lIlIIIlIIllIIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void Z() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[15];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIIIII[2]];
        nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIlIIIII[2]];
            nArray3[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
            if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return;
            }
        }
        int[] nArray4 = new int[lIIIllIlIIIII[2]];
        nArray4[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIlIIIII[2]];
            nArray5[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
            if (C.lIlIIIlIIllIIII(Inventory.getCount((boolean)lIIIllIlIIIII[2], (int[])nArray5), lIIIllIlIIIII[1])) {
                return;
            }
        }
        if (C.lIlIIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlIIIII[2]];
            stringArray[C.lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[25]];
            List var15 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlIIIII[23], lIIIllIlIIIII[24], lIIIllIlIIIII[0]), (String[])stringArray);
            if (C.lIlIIIlIIllIIIl(var15.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[23], lIIIllIlIIIII[24], lIIIllIlIIIII[0]));

                return;
            }
            if (C.lIlIIIlIIllIlII(var15.size(), lIIIllIlIIIII[2])) {
                if (C.lIlIIIlIIlIllll(Reachable.isInteractable((Locatable)((Locatable)var15.get(lIIIllIlIIIII[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[23], lIIIllIlIIIII[24], lIIIllIlIIIII[0]));

                    return;
                }
                ((TileObject)var15.get(lIIIllIlIIIII[0])).interact(lIIIllIIlllll[lIIIllIlIIIII[26]]);
            }
            return;
        }
        int[] nArray6 = new int[lIIIllIlIIIII[2]];
        nArray6[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
        if (C.lIlIIIlIIllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            int[] nArray7 = new int[lIIIllIlIIIII[2]];
            nArray7[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
            if (C.lIlIIIlIIllIIII(Bank.getCount((boolean)lIIIllIlIIIII[2], (int[])nArray7), lIIIllIlIIIII[1])) {
                Bank.withdraw((int)lIIIllIlIIIII[22], (int)lIIIllIlIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    private void M() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIIIII[9]];
        dialogOptionArray[C.lIIIllIlIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[C.lIIIllIlIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[12]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIIIII[6], new WorldPoint(lIIIllIlIIIII[7], lIIIllIlIIIII[8], lIIIllIlIIIII[0]), dialogOptionArray);
    }
}

