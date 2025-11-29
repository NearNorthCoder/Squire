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
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Completing X Marks The Spot")
public class CompletingXMarksTheSpotTask
extends Task {

    private final  SquireQuesterConfig bB;

    private static boolean lIlIIIIlIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIIllIIIIII(int n2) {
        return n2 > 0;
    }

    private void Y() {
        int[] nArray = new int[lIIIllIIIIlII[2]];
        nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[3];
        if (D.lIlIIIIlIllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIlII[1]];
        dialogOptionArray[D.lIIIllIIIIlII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[2]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[8]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[D.lIIIllIIIIlII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[11]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIIIIll[lIIIllIIIIlII[0]], new WorldPoint(lIIIllIIIIlII[4], lIIIllIIIIlII[5], lIIIllIIIIlII[0]), dialogOptionArray);
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var1;
        if (D.lIlIIIIlIllllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        String[] stringArray = new String[lIIIllIIIIlII[2]];
        stringArray[D.lIIIllIIIIlII[0]] = var1;
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (D.lIlIIIIllIIIIIl(var2) && D.lIlIIIIlIllllll(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            var2.interact(lIIIllIIIIIll[lIIIllIIIIlII[26]]);

            }
        } else {
            void var3;
            System.out.println(lIIIllIIIIIll[lIIIllIIIIlII[25]]);
            Walker.walkTo((WorldPoint)var3);

        }
    }

    private static boolean lIlIIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        D var4;
        if (D.lIlIIIIlIllllIl(this.bB.quest().equals((Object)h.X_MARKS_THE_SPOT) ? 1 : 0)) {
            return lIIIllIIIIlII[0];
        }
        int var5 = var4.Q();
        if (D.lIlIIIIlIlllllI(var5, lIIIllIIIIlII[1])) {
            return lIIIllIIIIlII[0];
        }
        System.out.println("[X_MARKS_THE_SPOT] - Current Progress: " + var5);
        switch (var5) {
            case 0: {
                var4.bx();
                var4.cp();

                if (1 < 3) break;
                return ((15 + 69 - -9 + 122 ^ 37 + 124 - 151 + 128) & (144 + 79 - 160 + 95 ^ 112 + 91 - 83 + 75 ^ -1) & ((0x53 ^ 0x43 ^ (0x6A ^ 0x7F)) & (0x63 ^ 6 ^ (0x59 ^ 0x39) ^ -1) ^ -1)) != 0;
            }
            case 1: {
                var4.cp();

                if (-(1 ^ 5) < 0) break;
                return false;
            }
            case 2: {
                var4.bw();

                if (((0xDA ^ 0xC7) & ~(0x6B ^ 0x76)) == 0) break;
                return false;
            }
            case 3: {
                var4.bv();

                if (((0x5C ^ 0x7F) & ~(0x41 ^ 0x62)) == 0) break;
                return false;
            }
            case 4: {
                var4.bu();

                if ((0xC7 ^ 0xC2) != 0) break;
                return false;
            }
            case 5: {
                var4.bt();

                if (1 != ((0x5A ^ 0x6F ^ (0x37 ^ 0x45)) & (0xBE ^ 0xB1 ^ (0x51 ^ 0x19) ^ -1))) break;
                return ((0x42 ^ 0x1B ^ (0x75 ^ 0x63)) & (15 + 9 - -187 + 2 ^ 91 + 88 - 127 + 102 ^ -1)) != 0;
            }
            case 6: {
                var4.P();
                var4.Y();

                if (2 >= ((0x7D ^ 0x51 ^ (0x7F ^ 0x75)) & (107 + 32 - 54 + 48 ^ 65 + 147 - 50 + 1 ^ -1))) break;
                return ((0x63 ^ 0xA ^ (0xEE ^ 0xC0)) & (0x24 ^ 0x15 ^ (0xB4 ^ 0xC2) ^ -1)) != 0;
            }
            case 7: {
                var4.P();

                if (2 > 0) break;
                return false;
            }
            default: {
                return lIIIllIIIIlII[0];
            }
        }
        return lIIIllIIIIlII[2];
    }

    private void bx() {
        int[] nArray = new int[lIIIllIIIIlII[2]];
        nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
        if (D.lIlIIIIlIllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIIIlII[2]];
        nArray2[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
        TileItem var6 = TileItems.getNearest((int[])nArray2);
        if (D.lIlIIIIllIIIIIl(var6)) {
            var6.interact(lIIIllIIIIIll[lIIIllIIIIlII[9]]);

            if (((0xCA ^ 0x92) & ~(0xFE ^ 0xA6)) != 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[21], lIIIllIIIIlII[22], lIIIllIIIIlII[2]));

        }
    }

    @Inject
    public CompletingXMarksTheSpotTask(SquireQuesterConfig squireQuesterConfig) {
        this.bB = squireQuesterConfig;
    }

    private static boolean lIlIIIIlIllllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIlIllllIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var7);
    }

    private void bt() {
        if (D.lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[12], lIIIllIIIIlII[13], lIIIllIIIIlII[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[12], lIIIllIIIIlII[13], lIIIllIIIIlII[0]));

            if ((0x40 ^ 0x44) < 1) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIIIIlII[2]];
            nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst((int[])nArray).interact(lIIIllIIIIIll[lIIIllIIIIlII[2]]);
        }
    }

    private void bu() {
        if (D.lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[15], lIIIllIIIIlII[16], lIIIllIIIIlII[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[15], lIIIllIIIIlII[16], lIIIllIIIIlII[0]));

        } else {
            int[] nArray = new int[lIIIllIIIIlII[2]];
            nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst((int[])nArray).interact(lIIIllIIIIIll[lIIIllIIIIlII[6]]);
        }
    }

    private static boolean lIlIIIIllIIIIIl(Object object) {
        return object != null;
    }

    private static void lIlIIIIlIlllIll() {
        lIIIllIIIIIll = new String[lIIIllIIIIlII[27]];
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[0]] = "Veos";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[2]] = "Dig";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[6]] = "Dig";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[7]] = "Dig";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[8]] = "Dig";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[9]] = "Take";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[10]] = "Veos";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[11]] = "Talk-to";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[1]] = "Walking to NPC";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[26]] = "Talk-to";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[25]] = "Walking to NPC";
    }

    private void bv() {
        if (D.lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[17], lIIIllIIIIlII[18], lIIIllIIIIlII[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[17], lIIIllIIIIlII[18], lIIIllIIIIlII[0]));

            if ((0x6E ^ 0x6A) < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIIIIlII[2]];
            nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst((int[])nArray).interact(lIIIllIIIIIll[lIIIllIIIIlII[7]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var8;
        if (D.lIlIIIIlIllllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIIIIlII[2]];
        nArray[D.lIIIllIIIIlII[0]] = var8;
        NPC var9 = NPCs.getNearest((int[])nArray);
        if (D.lIlIIIIllIIIIIl(var9) && D.lIlIIIIlIllllll(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
            var9.interact(lIIIllIIIIIll[lIIIllIIIIlII[11]]);

            if (-1 >= ((0x14 ^ 0x65 ^ (0xED ^ 0xB6)) & (38 + 82 - -43 + 11 ^ 81 + 99 - 53 + 5 ^ -1))) {
                return;
            }
        } else {
            void var10;
            System.out.println(lIIIllIIIIIll[lIIIllIIIIlII[1]]);
            Walker.walkTo((WorldPoint)var10);

        }
    }

    private void cp() {
        int[] nArray = new int[lIIIllIIIIlII[2]];
        nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
        if (D.lIlIIIIlIllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIlII[25]];
        dialogOptionArray[D.lIIIllIIIIlII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[D.lIIIllIIIIlII[6]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[26]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIIIIll[lIIIllIIIIlII[10]], new WorldPoint(lIIIllIIIIlII[23], lIIIllIIIIlII[24], lIIIllIIIIlII[0]), dialogOptionArray);
    }

    private void bw() {
        if (D.lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[19], lIIIllIIIIlII[20], lIIIllIIIIlII[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[19], lIIIllIIIIlII[20], lIIIllIIIIlII[0]));

            if (2 < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIIIIlII[2]];
            nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst((int[])nArray).interact(lIIIllIIIIIll[lIIIllIIIIlII[8]]);
        }
    }

    private int Q() {
        return Static.getClient().getVarbitValue(b.QUEST_X_MARKS_THE_SPOT.c());
    }

    static {
        D.lIlIIIIlIllllII();
        D.lIlIIIIlIlllIll();
    }

    private void P() {
        if (D.lIlIIIIlIllllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}

