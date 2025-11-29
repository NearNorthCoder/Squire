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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.GameEnum15;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing Romeo And Juliet")
public class CompletingRomeoAndJulietTask
extends Task {

    private final  SquireQuesterConfig bs;

    private void bx() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
        if (y.lIlIIIlIlllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIllll[2]];
        nArray2[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
        TileItem var1 = TileItems.getNearest((int[])nArray2);
        if (y.lIlIIIlIlllIllI(var1)) {
            var1.interact(lIIIllIlIlllI[lIIIllIlIllll[10]]);

            if (2 > (0x46 ^ 0x42)) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[42], lIIIllIlIllll[43], lIIIllIlIllll[2]));

        }
    }

    private void cp() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
        if (y.lIlIIIlIlllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[15]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[44], new WorldPoint(lIIIllIlIllll[45], lIIIllIlIllll[46], lIIIllIlIllll[0]), dialogOptionArray);
    }

    private void P() {
        if (y.lIlIIIlIlllIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void ck() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIllIlIllll[23], new WorldPoint(lIIIllIlIllll[24], lIIIllIlIllll[25], lIIIllIlIllll[0]), dialogOptionArray);
    }

        return String.valueOf(var2);
    }

    private void cj() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.QUEST;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[20], new WorldPoint(lIIIllIlIllll[21], lIIIllIlIllll[22], lIIIllIlIllll[2]), dialogOptionArray);
    }

    private static boolean lIlIIIlIlllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIlllIlll(int n2) {
        return n2 > 0;
    }

    private void cm() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_FOUR;
        this.a(lIIIllIlIllll[3], new WorldPoint(lIIIllIlIllll[4], lIIIllIlIllll[5], lIIIllIlIllll[0]), dialogOptionArray);
    }

    private static boolean lIlIIIlIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private void M() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[29];
        if (y.lIlIIIlIlllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[3], new WorldPoint(lIIIllIlIllll[4], lIIIllIlIllll[5], lIIIllIlIllll[0]), dialogOptionArray);
    }

    static {
        y.lIlIIIlIlllIIIl();
        y.lIlIIIlIlllIIII();
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_ROMEO_AND_JULIET.c());
    }

    private void bv() {
        if (y.lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[38], lIIIllIlIllll[39], lIIIllIlIllll[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[38], lIIIllIlIllll[39], lIIIllIlIllll[0]));

            if ((0xB5 ^ 0xB1) <= 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIlIllll[2]];
            nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst((int[])nArray).interact(lIIIllIlIlllI[lIIIllIlIllll[8]]);
        }
    }

    public boolean run() {
        y var3;
        if (y.lIlIIIlIlllIIlI(this.bs.quest().equals((Object)h.ROMEO_AND_JULIET) ? 1 : 0)) {
            return lIIIllIlIllll[0];
        }
        int var4 = var3.Q();
        if (y.lIlIIIlIlllIIll(var4, lIIIllIlIllll[1])) {
            return lIIIllIlIllll[0];
        }
        System.out.println("[ROMEO_AND_JULIET] - Current Progress: " + var4);
        switch (var4) {
            case 0: {
                var3.co();
                var3.M();

                if (1 != 0) break;
                return false;
            }
            case 10: {
                var3.cn();

                if (null == null) break;
                return false;
            }
            case 20: {
                var3.P();
                var3.cm();

                if (-(0xB ^ 0xE) < 0) break;
                return false;
            }
            case 30: {
                var3.cl();

                if (2 == 2) break;
                return false;
            }
            case 40: {
                var3.ck();

                if (-(0x83 ^ 0x86) < 0) break;
                return false;
            }
            case 50: {
                var3.cj();

                if (-3 <= 0) break;
                return ((0xB ^ 0x4D ^ (0xE5 ^ 0xB4)) & (0x10 ^ 0x1A ^ (0x8E ^ 0x93) ^ -1)) != 0;
            }
            case 60: {
                var3.Y();

                if (((0xB0 ^ 0x87) & ~(0xAE ^ 0x99)) < (0x63 ^ 0x67)) break;
                return false;
            }
            case 7: {
                var3.P();

                if (1 <= 3) break;
                return false;
            }
            default: {
                return lIIIllIlIllll[0];
            }
        }
        return lIIIllIlIllll[2];
    }

    private void Y() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[3], new WorldPoint(lIIIllIlIllll[4], lIIIllIlIllll[5], lIIIllIlIllll[0]), dialogOptionArray);
    }

    @Inject
    public CompletingRomeoAndJulietTask(SquireQuesterConfig squireQuesterConfig) {
        this.bs = squireQuesterConfig;
    }

    private void bw() {
        if (y.lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[40], lIIIllIlIllll[41], lIIIllIlIllll[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[40], lIIIllIlIllll[41], lIIIllIlIllll[0]));

            }
        } else {
            int[] nArray = new int[lIIIllIlIllll[2]];
            nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst((int[])nArray).interact(lIIIllIlIlllI[lIIIllIlIllll[9]]);
        }
    }

    private void bu() {
        if (y.lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[36], lIIIllIlIllll[37], lIIIllIlIllll[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[36], lIIIllIlIllll[37], lIIIllIlIllll[0]));

        } else {
            int[] nArray = new int[lIIIllIlIllll[2]];
            nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst((int[])nArray).interact(lIIIllIlIlllI[lIIIllIlIllll[7]]);
        }
    }

    private static boolean lIlIIIlIlllIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var5;
        if (y.lIlIIIlIlllIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = var5;
        NPC var6 = NPCs.getNearest((int[])nArray);
        if (y.lIlIIIlIlllIllI(var6) && y.lIlIIIlIlllIlII(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
            var6.interact(lIIIllIlIlllI[lIIIllIlIllll[11]]);

            if (2 < 0) {
                return;
            }
        } else {
            void var7;
            System.out.println(lIIIllIlIlllI[lIIIllIlIllll[12]]);
            Walker.walkTo((WorldPoint)var7);

        }
    }

    private void co() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[29];
        if (y.lIlIIIlIlllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIllll[2]];
        nArray2[y.lIIIllIlIllll[0]] = lIIIllIlIllll[30];
        TileObject var8 = TileObjects.getNearest((int[])nArray2);
        if (y.lIlIIIlIlllIllI(var8) && y.lIlIIIlIlllIlII(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
            var8.interact(lIIIllIlIlllI[lIIIllIlIllll[0]]);

            if (((6 ^ 0x35 ^ (0x9F ^ 0xB4)) & (73 + 131 - 114 + 56 ^ 56 + 5 - -77 + 0 ^ -1)) > 2) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[31], lIIIllIlIllll[32], lIIIllIlIllll[0]));

        }
    }

    private static boolean lIlIIIlIlllIlIl(Object object) {
        return object == null;
    }

    private static void lIlIIIlIlllIIII() {
        lIIIllIlIlllI = new String[lIIIllIlIllll[13]];
        y.lIIIllIlIlllI[y.lIIIllIlIllll[0]] = "Pick-from";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[2]] = "Dig";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[7]] = "Dig";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[8]] = "Dig";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[9]] = "Dig";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[10]] = "Take";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[11]] = "Talk-to";
        y.lIIIllIlIlllI[y.lIIIllIlIllll[12]] = "Walking to NPC";
    }

    private void cn() {
        int[] nArray = new int[lIIIllIlIllll[2]];
        nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[20];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (y.lIlIIIlIlllIlII(Dialog.isOpen() ? 1 : 0) && y.lIlIIIlIlllIlIl(nPC)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[21], lIIIllIlIllll[22], lIIIllIlIllll[2]));

        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIllll[20], new WorldPoint(lIIIllIlIllll[21], lIIIllIlIllll[22], lIIIllIlIllll[2]), dialogOptionArray);
    }

    private static boolean lIlIIIlIlllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlIlllIllI(Object object) {
        return object != null;
    }

    private void cl() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArray[y.lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[15]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[y.lIIIllIlIllll[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIllIlIllll[26], new WorldPoint(lIIIllIlIllll[27], lIIIllIlIllll[28], lIIIllIlIllll[0]), dialogOptionArray);
    }

    private void bt() {
        if (y.lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[33], lIIIllIlIllll[34], lIIIllIlIllll[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllll[33], lIIIllIlIllll[34], lIIIllIlIllll[0]));

            if (-(20 + 74 - 46 + 130 ^ 1 + 78 - 62 + 166) >= 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIlIllll[2]];
            nArray[y.lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst((int[])nArray).interact(lIIIllIlIlllI[lIIIllIlIllll[2]]);
        }
    }
}

