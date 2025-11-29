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

@TaskDesc(name="Completing Client Of Kourend")
public class CompletingClientOfKourendTask
extends Task {
    private final  SquireQuesterConfig ap;

    private int Q() {
        return Static.getClient().getVarbitValue(b.QUEST_CLIENT_OF_KOUREND.c());
    }

    private boolean K() {
        if (o.lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[43]), lIIIllIIIIIII[2])) {
            return lIIIllIIIIIII[2];
        }
        return lIIIllIIIIIII[0];
    }

    private boolean I() {
        if (o.lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[41]), lIIIllIIIIIII[2])) {
            return lIIIllIIIIIII[2];
        }
        return lIIIllIIIIIII[0];
    }

    private static boolean lIlIIIIlIllIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIIlIlIllIl() {
        lIIIlIlllllll = new String[lIIIllIIIIIII[11]];
        o.lIIIlIlllllll[o.lIIIllIIIIIII[0]] = "walking";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[2]] = "Activate";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[7]] = "Chicken";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[8]] = "Take";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[9]] = "Attack";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[10]] = "Talk-to";
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var1;
        if (o.lIlIIIIlIllIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIIIIIII[2]];
        nArray[o.lIIIllIIIIIII[0]] = var1;
        NPC var2 = NPCs.getNearest((int[])nArray);
        if (o.lIlIIIIlIllIlII(var2) && o.lIlIIIIlIllIIlI(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            var2.interact(lIIIlIlllllll[lIIIllIIIIIII[10]]);

            if ((0x71 ^ 0x5A ^ (0x67 ^ 0x48)) == 0) {
                return;
            }
        } else {
            o var3;
            void var4;
            System.out.println("Walking to NPC: " + (int)var1 + " at " + String.valueOf(var4));
            Walker.walkTo((WorldPoint)var4);

            var3.sleep(lIIIllIIIIIII[7]);
        }
    }

    public boolean run() {
        o var5;
        if (o.lIlIIIIlIlIllll(this.ap.quest().equals((Object)h.CLIENT_OF_KOUREND) ? 1 : 0)) {
            return lIIIllIIIIIII[0];
        }
        int var6 = var5.Q();
        if (o.lIlIIIIlIllIIII(var6, lIIIllIIIIIII[1])) {
            return lIIIllIIIIIII[0];
        }
        System.out.println("[CLIENT_OF_KOUREND] - Current Progress: " + var6);
        switch (var6) {
            case 0: {
                var5.N();
                var5.P();
                var5.M();

                if (3 != 0) break;
                return false;
            }
            case 1: {
                var5.L();
                var5.C();
                var5.B();
                var5.E();
                var5.D();
                var5.F();
                var5.P();

                if (1 < 2) break;
                return false;
            }
            case 2: {
                var5.A();
                var5.P();

                if (3 >= 3) break;
                return false;
            }
            case 3: {
                var5.A();

                if (3 >= 2) break;
                return ((108 + 154 - 211 + 169 ^ 116 + 98 - 164 + 85) & (9 ^ 0x7C ^ (0x22 ^ 0xC) ^ -1)) != 0;
            }
            case 4: {
                var5.z();

                if (-1 < 2) break;
                return false;
            }
            case 5: {
                var5.y();
                var5.P();

                if (null == null) break;
                return ((22 + 113 - 117 + 122 ^ 65 + 107 - 95 + 61) & (0x2E ^ 0x58 ^ (0xB1 ^ 0xC1) ^ -1)) != 0;
            }
            case 6: {
                var5.P();
            }
            default: {
                return lIIIllIIIIIII[0];
            }
        }
        return lIIIllIIIIIII[2];
    }

    private static boolean lIlIIIIlIllIlII(Object object) {
        return object != null;
    }

    private boolean J() {
        if (o.lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[42]), lIIIllIIIIIII[2])) {
            return lIIIllIIIIIII[2];
        }
        return lIIIllIIIIIII[0];
    }

    private void A() {
        int[] nArray = new int[lIIIllIIIIIII[2]];
        nArray[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[14];
        if (o.lIlIIIIlIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIIII[17]];
        dialogOptionArray[o.lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[12]] = DialogOption.QUEST;
        dialogOptionArray[o.lIIIllIIIIIII[13]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[6]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[23]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIllIIIIIII[3], new WorldPoint(lIIIllIIIIIII[4], lIIIllIIIIIII[5], lIIIllIIIIIII[0]), dialogOptionArray);
    }

    private void E() {
        o var7;
        if (o.lIlIIIIlIlIllll(this.J() ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIlI(var7.H() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIIII[18]];
        dialogOptionArray[o.lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[6]] = DialogOption.CHAT_OPTION_THREE;
        this.a(lIIIllIIIIIII[33], new WorldPoint(lIIIllIIIIIII[34], lIIIllIIIIIII[35], lIIIllIIIIIII[0]), dialogOptionArray);
    }

    private void z() {
        int[] nArray = new int[lIIIllIIIIIII[2]];
        nArray[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[14];
        if (o.lIlIIIIlIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIIII[15], lIIIllIIIIIII[16], lIIIllIIIIIII[0])))) {
            o var8;
            System.out.println(lIIIlIlllllll[lIIIllIIIIIII[0]]);
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIIII[15], lIIIllIIIIIII[16], lIIIllIIIIIII[0]));

            var8.sleep(lIIIllIIIIIII[10]);

            if (3 == 0) {
                return;
            }
        } else {
            int[] nArray2 = new int[lIIIllIIIIIII[2]];
            nArray2[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[14];
            Inventory.getFirst((int[])nArray2).interact(lIIIlIlllllll[lIIIllIIIIIII[2]]);
        }
    }

    private void M() {
        int[] nArray = new int[lIIIllIIIIIII[2]];
        nArray[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[45];
        if (o.lIlIIIIlIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIIII[6]];
        dialogOptionArray[o.lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[13]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIIIIII[3], new WorldPoint(lIIIllIIIIIII[4], lIIIllIIIIIII[5], lIIIllIIIIIII[0]), dialogOptionArray);
    }

    private void y() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIIII[6]];
        dialogOptionArray[o.lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[13]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIIIIII[3], new WorldPoint(lIIIllIIIIIII[4], lIIIllIIIIIII[5], lIIIllIIIIIII[0]), dialogOptionArray);
    }

    private boolean H() {
        if (o.lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[40]), lIIIllIIIIIII[2])) {
            return lIIIllIIIIIII[2];
        }
        return lIIIllIIIIIII[0];
    }

    private void B() {
        o var9;
        if (o.lIlIIIIlIlIllll(this.K() ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIlI(var9.J() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIIII[18]];
        dialogOptionArray[o.lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[o.lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[6]] = DialogOption.CHAT_OPTION_THREE;
        this.a(lIIIllIIIIIII[24], new WorldPoint(lIIIllIIIIIII[25], lIIIllIIIIIII[26], lIIIllIIIIIII[0]), dialogOptionArray);
    }

    private static boolean lIlIIIIlIllIIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        o.lIlIIIIlIlIlllI();
        o.lIlIIIIlIlIllIl();
    }

    private void D() {
        o var10;
        if (o.lIlIIIIlIlIllll(this.H() ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIlI(var10.G() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIIII[18]];
        dialogOptionArray[o.lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[6]] = DialogOption.CHAT_OPTION_THREE;
        this.a(lIIIllIIIIIII[30], new WorldPoint(lIIIllIIIIIII[31], lIIIllIIIIIII[32], lIIIllIIIIIII[0]), dialogOptionArray);
    }

    private static boolean lIlIIIIlIllIllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var11);
    }

    private void N() {
        this.O();
    }

    @Inject
    public CompletingClientOfKourendTask(SquireQuesterConfig squireQuesterConfig) {
        this.ap = squireQuesterConfig;
    }

    private static boolean lIlIIIIlIllIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIlIllIIIl(int n2) {
        return n2 > 0;
    }

    private void F() {
        o var12;
        if (o.lIlIIIIlIlIllll(this.G() ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIlI(var12.I() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIIII[6]];
        dialogOptionArray[o.lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[o.lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[9]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[o.lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[13]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIIIIII[36], new WorldPoint(lIIIllIIIIIII[37], lIIIllIIIIIII[38], lIIIllIIIIIII[0]), dialogOptionArray);
    }

    private void L() {
        int[] nArray = new int[lIIIllIIIIIII[2]];
        nArray[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[44];
        if (o.lIlIIIIlIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIIIIII[2]];
        nArray2[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[45];
        int[] nArray3 = new int[lIIIllIIIIIII[2]];
        nArray3[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[46];
        Inventory.getFirst((int[])nArray2).useOn(Inventory.getFirst((int[])nArray3));
    }

    private boolean G() {
        if (o.lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[39]), lIIIllIIIIIII[2])) {
            return lIIIllIIIIIII[2];
        }
        return lIIIllIIIIIII[0];
    }

    private void P() {
        if (o.lIlIIIIlIllIIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            this.sleep(lIIIllIIIIIII[7]);
        }
    }

    private void C() {
        if (o.lIlIIIIlIllIIlI(this.K() ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIIII[18]];
        dialogOptionArray[o.lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArray[o.lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[o.lIIIllIIIIIII[6]] = DialogOption.CHAT_OPTION_THREE;
        this.a(lIIIllIIIIIII[27], new WorldPoint(lIIIllIIIIIII[28], lIIIllIIIIIII[29], lIIIllIIIIIII[0]), dialogOptionArray);
    }

    private void O() {
        int[] nArray = new int[lIIIllIIIIIII[2]];
        nArray[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[45];
        if (o.lIlIIIIlIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIlII(Players.getLocal().getInteracting())) {
            return;
        }
        String[] stringArray = new String[lIIIllIIIIIII[2]];
        stringArray[o.lIIIllIIIIIII[0]] = lIIIlIlllllll[lIIIllIIIIIII[7]];
        NPC var13 = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[lIIIllIIIIIII[2]];
        nArray2[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[45];
        TileItem var14 = TileItems.getNearest((int[])nArray2);
        if (o.lIlIIIIlIllIlII(var14) && o.lIlIIIIlIllIIlI(Reachable.isInteractable((Locatable)var14) ? 1 : 0)) {
            var14.interact(lIIIlIlllllll[lIIIllIIIIIII[8]]);
            return;
        }
        if (o.lIlIIIIlIllIlII(var13) && o.lIlIIIIlIllIIlI(Reachable.isInteractable((Locatable)var13) ? 1 : 0) && o.lIlIIIIlIllIlIl(Players.getLocal().getInteracting())) {
            var13.interact(lIIIlIlllllll[lIIIllIIIIIII[9]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIIII[47], lIIIllIIIIIII[48], lIIIllIIIIIII[0]));

    }

    private static boolean lIlIIIIlIllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIIlIlIllll(int n2) {
        return n2 == 0;
    }
}

