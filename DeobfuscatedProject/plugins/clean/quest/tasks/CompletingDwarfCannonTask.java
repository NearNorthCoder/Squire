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
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.quest.tasks.GameEnum15;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing Dwarf Cannon")
public class CompletingDwarfCannonTask
extends Task {

    private final  SquireQuesterConfig au;

    private void ab() {
        if (q.lIlIIIllIlIllII(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[12])) {
            if (q.lIlIIIllIlIlIlI(Magic.isHomeTeleportOnCooldown() ? 1 : 0) && q.lIlIIIllIlIlllI(Players.getLocal().getAnimation(), lIIIllIlllIIl[13])) {
                Magic.cast((Spell)SpellBook.Standard.HOME_TELEPORT);
                this.sleep(lIIIllIlllIIl[14]);
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[18]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlllIIl[15], new WorldPoint(lIIIllIlllIIl[16], lIIIllIlllIIl[17], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    private void ad() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[2];
        if (q.lIlIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.lIlIIIllIllIIIl(Widgets.get((int)lIIIllIlllIIl[22], (int)lIIIllIlllIIl[21]))) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIIl[2]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[2];
        String[] stringArray = new String[lIIIllIlllIIl[2]];
        stringArray[q.lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[19]];
        Inventory.getFirst((int[])nArray2).useOn(TileObjects.getNearest((String[])stringArray));
    }

    /*
     * WARNING - void declaration
     */
    private void af() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[33];
        NPC nPC = NPCs.getNearest((int[])nArray);
        String[] stringArray = new String[lIIIllIlllIIl[2]];
        stringArray[q.lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[20]];
        List list = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIIl[34], lIIIllIlllIIl[35], lIIIllIlllIIl[0]), (String[])stringArray);
        if (q.lIlIIIllIllIIII(nPC)) {
            void var1;
            if (q.lIlIIIllIlIllIl(list.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[34], lIIIllIlllIIl[35], lIIIllIlllIIl[0]));

                return;
            }
            ((TileObject)var1.get(lIIIllIlllIIl[0])).interact(lIIIllIllIlll[lIIIllIlllIIl[21]]);
        }
    }

    public boolean run() {
        q var2;
        if (q.lIlIIIllIlIlIlI(this.au.quest().equals((Object)h.DWARF_CANNON) ? 1 : 0)) {
            return lIIIllIlllIIl[0];
        }
        int var3 = var2.Q();
        if (q.lIlIIIllIlIlIll(var3, lIIIllIlllIIl[1])) {
            return lIIIllIlllIIl[0];
        }
        System.out.println("[DWARF_CANNON] - Current Progress: " + var3);
        switch (var3) {
            case 0: {
                var2.M();

                if ((0x47 ^ 0x57 ^ (0xE ^ 0x1A)) > ((0x71 ^ 0x31 ^ (0x47 ^ 0x43)) & (130 + 55 - 110 + 170 ^ 164 + 5 - 8 + 16 ^ -1))) break;
                return false;
            }
            case 1: {
                var2.ak();
                var2.aj();
                var2.ai();

                if (1 < 2) break;
                return false;
            }
            case 2: {
                var2.ah();

                if (null == null) break;
                return ((0x3D ^ 0x40 ^ (0xEE ^ 0x87)) & (0x7A ^ 0x3B ^ (0x56 ^ 3) ^ -1)) != 0;
            }
            case 3: {
                var2.ah();
                var2.ag();

                if (-2 <= 0) break;
                return false;
            }
            case 4: {
                var2.af();

                if (-(0x5B ^ 0x5F) < 0) break;
                return false;
            }
            case 5: {
                var2.af();

                if (1 > 0) break;
                return false;
            }
            case 6: {
                var2.P();
                var2.ae();

                if (-(0x52 ^ 0x71 ^ (0xA4 ^ 0x83)) <= 0) break;
                return ((0x81 ^ 0x84 ^ (0x5F ^ 0x38)) & (0x70 ^ 0x65 ^ (0xD1 ^ 0xA6) ^ -1)) != 0;
            }
            case 7: {
                var2.ad();
                var2.ac();

                if (null == null) break;
                return false;
            }
            case 8: {
                var2.ai();

                if (-1 <= 2) break;
                return ((180 + 81 - 251 + 232 ^ 46 + 45 - 47 + 103) & (0x6C ^ 0x2D ^ (0x13 ^ 0x33) ^ -1)) != 0;
            }
            case 9: {
                var2.ab();

                if (null == null) break;
                return false;
            }
            case 10: {
                var2.Z();
                var2.aa();
                var2.Y();
            }
            default: {
                return lIIIllIlllIIl[0];
            }
        }
        return lIIIllIlllIIl[2];
    }

    private void ah() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[0];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.lIlIIIllIlIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIIl[2]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[38];
        TileObject var4 = TileObjects.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(var4) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
            var4.interact(lIIIllIllIlll[lIIIllIlllIIl[18]]);

            if (3 < 0) {
                return;
            }
        } else {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[37]]);
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[39], lIIIllIlllIIl[7]));

        }
    }

    private void M() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[21]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    private void ai() {
        q var5;
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[40];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.lIlIIIllIlIlllI(var5.Q(), lIIIllIlllIIl[2])) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[36]];
            dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[18]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[37]] = DialogOption.NPC_CONTINUE;
            var5.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
        }
        if (q.lIlIIIllIlIlllI(var5.Q(), lIIIllIlllIIl[37])) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[41]];
            dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[18]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[37]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[36]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[14]] = DialogOption.CHAT_OPTION_TWO;
            var5.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
        }
        if (q.lIlIIIllIlIlllI(var5.Q(), lIIIllIlllIIl[14])) {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[41]];
            dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[18]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[37]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[36]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[q.lIIIllIlllIIl[14]] = DialogOption.CHAT_OPTION_TWO;
            var5.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
        }
    }

    private static boolean lIlIIIllIllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private void Z() {
        if (q.lIlIIIllIlIllII(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[3])) {
            return;
        }
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlllIIl[2]];
            nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
            if (q.lIlIIIllIlIlIll(Inventory.getCount((boolean)lIIIllIlllIIl[2], (int[])nArray2), lIIIllIlllIIl[1])) {
                return;
            }
        }
        if (q.lIlIIIllIlIlIlI(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlllIIl[2]];
            stringArray[q.lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[2]];
            List var6 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]), (String[])stringArray);
            if (q.lIlIIIllIlIllIl(var6.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]));

                return;
            }
            if (q.lIlIIIllIlIlllI(var6.size(), lIIIllIlllIIl[2])) {
                if (q.lIlIIIllIlIlIlI(Reachable.isInteractable((Locatable)((Locatable)var6.get(lIIIllIlllIIl[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[5], lIIIllIlllIIl[6], lIIIllIlllIIl[0]));

                    return;
                }
                ((TileObject)var6.get(lIIIllIlllIIl[0])).interact(lIIIllIllIlll[lIIIllIlllIIl[7]]);
            }
            return;
        }
        int[] nArray3 = new int[lIIIllIlllIIl[2]];
        nArray3[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
        if (q.lIlIIIllIlIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIllIlllIIl[2]];
            nArray4[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
            if (q.lIlIIIllIlIlIll(Bank.getCount((boolean)lIIIllIlllIIl[2], (int[])nArray4), lIIIllIlllIIl[1])) {
                Bank.withdraw((int)lIIIllIlllIIl[4], (int)lIIIllIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var7;
        if (q.lIlIIIllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = var7;
        NPC var8 = NPCs.getNearest((int[])nArray);
        if (q.lIlIIIllIllIIIl(var8) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
            var8.interact(lIIIllIllIlll[lIIIllIlllIIl[40]]);

            if (-(0x5D ^ 0x17 ^ (0xD4 ^ 0x9B)) >= 0) {
                return;
            }
        } else {
            q var9;
            void var10;
            System.out.println("Walking to NPC: " + (int)var7 + " at " + String.valueOf(var10));
            Walker.walkTo((WorldPoint)var10);

            var9.sleep(lIIIllIlllIIl[7]);
        }
    }

    private void aj() {
        if (q.lIlIIIllIllIIlI(Players.getLocal().getAnimation(), lIIIllIlllIIl[13])) {
            return;
        }
        if (q.lIlIIIllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            q var11;
            Dialog.continueSpace();
            var11.sleep(lIIIllIlllIIl[14]);
            return;
        }
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[42];
        if (q.lIlIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIIl[18]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[40];
        nArray2[q.lIIIllIlllIIl[2]] = lIIIllIlllIIl[43];
        nArray2[q.lIIIllIlllIIl[7]] = lIIIllIlllIIl[44];
        nArray2[q.lIIIllIlllIIl[8]] = lIIIllIlllIIl[45];
        nArray2[q.lIIIllIlllIIl[19]] = lIIIllIlllIIl[46];
        nArray2[q.lIIIllIlllIIl[20]] = lIIIllIlllIIl[47];
        nArray2[q.lIIIllIlllIIl[21]] = lIIIllIlllIIl[48];
        TileObject var12 = TileObjects.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(var12) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
            var12.interact(lIIIllIllIlll[lIIIllIlllIIl[36]]);
        }
    }

    private static boolean lIlIIIllIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private void aa() {
        if (q.lIlIIIllIlIllll(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[3])) {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[8]]);
            return;
        }
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlllIIl[2]];
            nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[4];
            if (q.lIlIIIllIlIllII(Inventory.getCount((boolean)lIIIllIlllIIl[2], (int[])nArray2), lIIIllIlllIIl[1])) {
                return;
            }
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[8]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIllIlllIIl[9], new WorldPoint(lIIIllIlllIIl[10], lIIIllIlllIIl[11], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    private static boolean lIlIIIllIllIIIl(Object object) {
        return object != null;
    }

    private void ag() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[0];
        if (q.lIlIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[36]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.QUEST;
        dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[37]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    private void P() {
        if (q.lIlIIIllIlIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            this.sleep(lIIIllIlllIIl[7]);
            return;
        }
    }

    private void ac() {
        if (q.lIlIIIllIllIIII(Widgets.get((int)lIIIllIlllIIl[22], (int)lIIIllIlllIIl[21]))) {
            return;
        }
        Widgets.fromId((int)lIIIllIlllIIl[23]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[23]);
        Widgets.fromId((int)lIIIllIlllIIl[25]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[25]);
        Widgets.fromId((int)lIIIllIlllIIl[26]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[26]);
        Widgets.fromId((int)lIIIllIlllIIl[27]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[27]);
        Widgets.fromId((int)lIIIllIlllIIl[28]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[28]);
        Widgets.fromId((int)lIIIllIlllIIl[29]).interact(lIIIllIlllIIl[0], lIIIllIlllIIl[24], lIIIllIlllIIl[0], lIIIllIlllIIl[29]);
    }

    private static void lIlIIIllIlIIIlI() {
        lIIIllIllIlll = new String[lIIIllIlllIIl[43]];
        q.lIIIllIllIlll[q.lIIIllIlllIIl[0]] = "cant turn in quest";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[2]] = "Bank booth";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[7]] = "Bank";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[8]] = "cant charter";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[19]] = "Broken multicannon";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[20]] = "Crate";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[21]] = "Search";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[18]] = "Take";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[37]] = "Walking to remains";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[36]] = "Inspect";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[14]] = "Take";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[41]] = "Chicken";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[50]] = "Take";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[51]] = "Attack";
        q.lIIIllIllIlll[q.lIIIllIlllIIl[40]] = "Talk-to";
    }

        return String.valueOf(var13);
    }

    private static boolean lIlIIIllIlIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIllIlIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private void ae() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlllIIl[18]];
        dialogOptionArray[q.lIIIllIlllIIl[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[q.lIIIllIlllIIl[21]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlllIIl[30], new WorldPoint(lIIIllIlllIIl[31], lIIIllIlllIIl[32], lIIIllIlllIIl[0]), dialogOptionArray);
    }

    @Inject
    public CompletingDwarfCannonTask(SquireQuesterConfig squireQuesterConfig) {
        this.au = squireQuesterConfig;
    }

    private static boolean lIlIIIllIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_DWARF_CANNON.c());
    }

    static {
        q.lIlIIIllIlIlIIl();
        q.lIlIIIllIlIIIlI();
    }

    private void O() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[49];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (q.lIlIIIllIllIIIl(Players.getLocal().getInteracting())) {
            return;
        }
        String[] stringArray = new String[lIIIllIlllIIl[2]];
        stringArray[q.lIIIllIlllIIl[0]] = lIIIllIllIlll[lIIIllIlllIIl[41]];
        NPC var14 = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[lIIIllIlllIIl[2]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[49];
        TileItem var15 = TileItems.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(var15) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var15) ? 1 : 0)) {
            var15.interact(lIIIllIllIlll[lIIIllIlllIIl[50]]);
            return;
        }
        if (q.lIlIIIllIllIIIl(var14) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var14) ? 1 : 0) && q.lIlIIIllIllIIII(Players.getLocal().getInteracting())) {
            var14.interact(lIIIllIllIlll[lIIIllIlllIIl[51]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlllIIl[52], lIIIllIlllIIl[53], lIIIllIlllIIl[0]));

    }

    private void Y() {
        System.out.println(Players.getLocal().getWorldLocation().getRegionID());
        if (q.lIlIIIllIlIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIllIlllIIl[3])) {
            System.out.println(lIIIllIllIlll[lIIIllIlllIIl[0]]);
            return;
        }
        this.ai();
    }

    private void N() {
        this.O();
    }

    private void ak() {
        int[] nArray = new int[lIIIllIlllIIl[2]];
        nArray[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[42];
        if (q.lIlIIIllIlIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlllIIl[2]];
        nArray2[q.lIIIllIlllIIl[0]] = lIIIllIlllIIl[42];
        TileItem var16 = TileItems.getNearest((int[])nArray2);
        if (q.lIlIIIllIllIIIl(var16) && q.lIlIIIllIlIllIl(Reachable.isInteractable((Locatable)var16) ? 1 : 0)) {
            var16.interact(lIIIllIllIlll[lIIIllIlllIIl[14]]);

            if (1 >= (0xAB ^ 0xBF ^ (0x72 ^ 0x62))) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)var16.getWorldLocation());

        }
    }

    private static boolean lIlIIIllIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIIllIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIllIlIllIl(int n2) {
        return n2 != 0;
    }
}

