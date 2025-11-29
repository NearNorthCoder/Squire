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
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

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
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.b;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Completing Client Of Kourend")
public class o
extends Task {
    private final /* synthetic */ SquireQuesterConfig ap;
    private static /* synthetic */ String[] lIIIlIlllllll;
    private static /* synthetic */ int[] lIIIllIIIIIII;

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
        o.lIIIlIlllllll[o.lIIIllIIIIIII[0]] = o."walking";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[2]] = o."Activate";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[7]] = o."Chicken";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[8]] = o."Take";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[9]] = o."Attack";
        o.lIIIlIlllllll[o.lIIIllIIIIIII[10]] = o."Talk-to";
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void lllllllllllllllIIIIlIllllIlIIllI;
        if (o.lIlIIIIlIllIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIIIIIII[2]];
        nArray[o.lIIIllIIIIIII[0]] = lllllllllllllllIIIIlIllllIlIIllI;
        NPC lllllllllllllllIIIIlIllllIlIIIll = NPCs.getNearest((int[])nArray);
        if (o.lIlIIIIlIllIlII(lllllllllllllllIIIIlIllllIlIIIll) && o.lIlIIIIlIllIIlI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIllllIlIIIll) ? 1 : 0)) {
            lllllllllllllllIIIIlIllllIlIIIll.interact(lIIIlIlllllll[lIIIllIIIIIII[10]]);
            0;
            if ((0x71 ^ 0x5A ^ (0x67 ^ 0x48)) == 0) {
                return;
            }
        } else {
            o lllllllllllllllIIIIlIllllIlIIlll;
            void lllllllllllllllIIIIlIllllIlIIlIl;
            System.out.println("Walking to NPC: " + (int)lllllllllllllllIIIIlIllllIlIIllI + " at " + String.valueOf(lllllllllllllllIIIIlIllllIlIIlIl));
            Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIllllIlIIlIl);
            0;
            lllllllllllllllIIIIlIllllIlIIlll.sleep(lIIIllIIIIIII[7]);
        }
    }

    public boolean run() {
        o lllllllllllllllIIIIlIlllllIIIlII;
        if (o.lIlIIIIlIlIllll(this.ap.quest().equals((Object)h.CLIENT_OF_KOUREND) ? 1 : 0)) {
            return lIIIllIIIIIII[0];
        }
        int lllllllllllllllIIIIlIlllllIIIIll = lllllllllllllllIIIIlIlllllIIIlII.Q();
        if (o.lIlIIIIlIllIIII(lllllllllllllllIIIIlIlllllIIIIll, lIIIllIIIIIII[1])) {
            return lIIIllIIIIIII[0];
        }
        System.out.println("[CLIENT_OF_KOUREND] - Current Progress: " + lllllllllllllllIIIIlIlllllIIIIll);
        switch (lllllllllllllllIIIIlIlllllIIIIll) {
            case 0: {
                lllllllllllllllIIIIlIlllllIIIlII.N();
                lllllllllllllllIIIIlIlllllIIIlII.P();
                lllllllllllllllIIIIlIlllllIIIlII.M();
                0;
                if (3 != 0) break;
                return ((0xA4 ^ 0x81) & ~(0x10 ^ 0x35)) != 0;
            }
            case 1: {
                lllllllllllllllIIIIlIlllllIIIlII.L();
                lllllllllllllllIIIIlIlllllIIIlII.C();
                lllllllllllllllIIIIlIlllllIIIlII.B();
                lllllllllllllllIIIIlIlllllIIIlII.E();
                lllllllllllllllIIIIlIlllllIIIlII.D();
                lllllllllllllllIIIIlIlllllIIIlII.F();
                lllllllllllllllIIIIlIlllllIIIlII.P();
                0;
                if (1 < 2) break;
                return ((0x3F ^ 0x5F) & ~(0x59 ^ 0x39)) != 0;
            }
            case 2: {
                lllllllllllllllIIIIlIlllllIIIlII.A();
                lllllllllllllllIIIIlIlllllIIIlII.P();
                0;
                if (3 >= 3) break;
                return ((0x63 ^ 0x78) & ~(0x1C ^ 7)) != 0;
            }
            case 3: {
                lllllllllllllllIIIIlIlllllIIIlII.A();
                0;
                if (3 >= 2) break;
                return ((108 + 154 - 211 + 169 ^ 116 + 98 - 164 + 85) & (9 ^ 0x7C ^ (0x22 ^ 0xC) ^ -1)) != 0;
            }
            case 4: {
                lllllllllllllllIIIIlIlllllIIIlII.z();
                0;
                if (-1 < 2) break;
                return ((0x3F ^ 0x30) & ~(5 ^ 0xA)) != 0;
            }
            case 5: {
                lllllllllllllllIIIIlIlllllIIIlII.y();
                lllllllllllllllIIIIlIlllllIIIlII.P();
                0;
                if (null == null) break;
                return ((22 + 113 - 117 + 122 ^ 65 + 107 - 95 + 61) & (0x2E ^ 0x58 ^ (0xB1 ^ 0xC1) ^ -1)) != 0;
            }
            case 6: {
                lllllllllllllllIIIIlIlllllIIIlII.P();
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
        o lllllllllllllllIIIIlIllllIllIlll;
        if (o.lIlIIIIlIlIllll(this.J() ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIlI(lllllllllllllllIIIIlIllllIllIlll.H() ? 1 : 0)) {
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

    private static String lIlIIIIlIlIlIlI(String lllllllllllllllIIIIlIllllIIIIIll, String lllllllllllllllIIIIlIllllIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllllIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIllllIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIllllIIIIlIl.init(lIIIllIIIIIII[7], lllllllllllllllIIIIlIllllIIIIllI);
            return new String(lllllllllllllllIIIIlIllllIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIllllIIIIlII) {
            lllllllllllllllIIIIlIllllIIIIlII.printStackTrace();
            return null;
        }
    }

    private void z() {
        int[] nArray = new int[lIIIllIIIIIII[2]];
        nArray[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[14];
        if (o.lIlIIIIlIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIIII[15], lIIIllIIIIIII[16], lIIIllIIIIIII[0])))) {
            o lllllllllllllllIIIIlIlllllIIIIIl;
            System.out.println(lIIIlIlllllll[lIIIllIIIIIII[0]]);
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIIII[15], lIIIllIIIIIII[16], lIIIllIIIIIII[0]));
            0;
            lllllllllllllllIIIIlIlllllIIIIIl.sleep(lIIIllIIIIIII[10]);
            0;
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
        o lllllllllllllllIIIIlIllllIllllIl;
        if (o.lIlIIIIlIlIllll(this.K() ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIlI(lllllllllllllllIIIIlIllllIllllIl.J() ? 1 : 0)) {
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
        o lllllllllllllllIIIIlIllllIlllIIl;
        if (o.lIlIIIIlIlIllll(this.H() ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIlI(lllllllllllllllIIIIlIllllIlllIIl.G() ? 1 : 0)) {
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

    private static String lIlIIIIlIlIllII(String lllllllllllllllIIIIlIllllIIllIII, String lllllllllllllllIIIIlIllllIIlIIlI) {
        lllllllllllllllIIIIlIllllIIllIII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIllllIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIllllIIlIllI = new StringBuilder();
        char[] lllllllllllllllIIIIlIllllIIlIlIl = lllllllllllllllIIIIlIllllIIlIIlI.toCharArray();
        int lllllllllllllllIIIIlIllllIIlIlII = lIIIllIIIIIII[0];
        char[] lllllllllllllllIIIIlIllllIIIlllI = lllllllllllllllIIIIlIllllIIllIII.toCharArray();
        int lllllllllllllllIIIIlIllllIIIllIl = lllllllllllllllIIIIlIllllIIIlllI.length;
        int lllllllllllllllIIIIlIllllIIIllII = lIIIllIIIIIII[0];
        while (o.lIlIIIIlIllIllI(lllllllllllllllIIIIlIllllIIIllII, lllllllllllllllIIIIlIllllIIIllIl)) {
            char lllllllllllllllIIIIlIllllIIllIIl = lllllllllllllllIIIIlIllllIIIlllI[lllllllllllllllIIIIlIllllIIIllII];
            lllllllllllllllIIIIlIllllIIlIllI.append((char)(lllllllllllllllIIIIlIllllIIllIIl ^ lllllllllllllllIIIIlIllllIIlIlIl[lllllllllllllllIIIIlIllllIIlIlII % lllllllllllllllIIIIlIllllIIlIlIl.length]));
            0;
            ++lllllllllllllllIIIIlIllllIIlIlII;
            ++lllllllllllllllIIIIlIllllIIIllII;
            0;
            if (-1 <= -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIllllIIlIllI);
    }

    private void N() {
        this.O();
    }

    @Inject
    public o(SquireQuesterConfig squireQuesterConfig) {
        this.ap = squireQuesterConfig;
    }

    private static void lIlIIIIlIlIlllI() {
        lIIIllIIIIIII = new int[49];
        o.lIIIllIIIIIII[0] = (0xF7 ^ 0xAF) & ~(0x2D ^ 0x75);
        o.lIIIllIIIIIII[1] = 0x94 ^ 0x8A;
        o.lIIIllIIIIIII[2] = 1;
        o.lIIIllIIIIIII[3] = -(0xFFFFE61F & 0x5FF1) & (0xFFFFFFF7 & 0x6FFF);
        o.lIIIllIIIIIII[4] = -(0xFFFFB9FE & 0x5E9D) & (0xFFFFBFBB & 0x5FFF);
        o.lIIIllIIIIIII[5] = -(0xFFFF97F7 & 0x699D) & (0xFFFF8FFF & 0x7FFE);
        o.lIIIllIIIIIII[6] = 3 ^ 0xA;
        o.lIIIllIIIIIII[7] = 2;
        o.lIIIllIIIIIII[8] = 3;
        o.lIIIllIIIIIII[9] = 0x29 ^ 0x2D;
        o.lIIIllIIIIIII[10] = 0x43 ^ 0x46;
        o.lIIIllIIIIIII[11] = 0x3B ^ 0x54 ^ (0x29 ^ 0x40);
        o.lIIIllIIIIIII[12] = 0x6E ^ 0x72 ^ (0x31 ^ 0x2A);
        o.lIIIllIIIIIII[13] = 61 + 157 - 112 + 55 ^ 160 + 73 - 154 + 90;
        o.lIIIllIIIIIII[14] = -(0xFFFFAF55 & 0x74FB) & (0xFFFFF77F & 0x7FDD);
        o.lIIIllIIIIIII[15] = -(0xFFFFFDD3 & 0x527F) & (0xFFFFD6FF & Short.MAX_VALUE);
        o.lIIIllIIIIIII[16] = -(0xFFFFD697 & 0x79FE) & (0xFFFFDFBF & Short.MAX_VALUE);
        o.lIIIllIIIIIII[17] = 97 + 142 - 81 + 14 ^ 147 + 143 - 209 + 107;
        o.lIIIllIIIIIII[18] = 168 + 156 - 239 + 96 ^ 85 + 121 - 153 + 138;
        o.lIIIllIIIIIII[19] = 0xA ^ 0x58 ^ (0xD ^ 0x54);
        o.lIIIllIIIIIII[20] = 0x86 ^ 0x8A;
        o.lIIIllIIIIIII[21] = 0x25 ^ 0x58 ^ (0x2C ^ 0x5C);
        o.lIIIllIIIIIII[22] = 0x3D ^ 0xD ^ (0xD ^ 0x33);
        o.lIIIllIIIIIII[23] = 0x7F ^ 0x70;
        o.lIIIllIIIIIII[24] = -(0xFFFFE0F1 & 0x3F6F) & (0xFFFFBFFF & 0x7B7F);
        o.lIIIllIIIIIII[25] = 0xFFFFDFFF & 0x26EC;
        o.lIIIllIIIIIII[26] = 0xFFFF9E46 & 0x6FBB;
        o.lIIIllIIIIIII[27] = -(0xFFFFE30D & 0x3EFB) & (0xFFFFF7FB & 0x2B3D);
        o.lIIIllIIIIIII[28] = -(0xFFFFFE7D & 0x5393) & (0xFFFFDFFF & 0x77FF);
        o.lIIIllIIIIIII[29] = -(0xFFFFFDFB & 0x537F) & (0xFFFFFF7F & 0x5FFF);
        o.lIIIllIIIIIII[30] = 0xFFFFFFBF & 0x1BF0;
        o.lIIIllIIIIIII[31] = 0xFFFFE76F & 0x1E9F;
        o.lIIIllIIIIIII[32] = 0xFFFFEFFF & 0x1EA7;
        o.lIIIllIIIIIII[33] = 0xFFFF9FF2 & 0x7B9D;
        o.lIIIllIIIIIII[34] = -(0xFFFFFDDB & 0x7B65) & (0xFFFFFFFB & 0x7FFD);
        o.lIIIllIIIIIII[35] = 0xFFFF8EDF & 0x7FAF;
        o.lIIIllIIIIIII[36] = 0xFFFFBFFA & 0x5B4F;
        o.lIIIllIIIIIII[37] = 0xFFFFF71F & 0xFED;
        o.lIIIllIIIIIII[38] = 0xFFFFDEBF & 0x2FCD;
        o.lIIIllIIIIIII[39] = -(0xFFFFA65E & 0x7BAB) & (0xFFFFF7FF & 0x3FFF);
        o.lIIIllIIIIIII[40] = 0xFFFF9DF5 & 0x77FF;
        o.lIIIllIIIIIII[41] = 0xFFFFBDF6 & 0x57FD;
        o.lIIIllIIIIIII[42] = 0xFFFFB7FD & 0x5DFA;
        o.lIIIllIIIIIII[43] = 0xFFFF97F7 & 0x7DFF;
        o.lIIIllIIIIIII[44] = 0xFFFFDFEF & 0x731C;
        o.lIIIllIIIIIII[45] = 0xFFFF937E & 0x6DBB;
        o.lIIIllIIIIIII[46] = 0xFFFFD38B & 0x7F7F;
        o.lIIIllIIIIIII[47] = 0xFFFFCDB4 & 0x3EEB;
        o.lIIIllIIIIIII[48] = 0xFFFFCCF1 & 0x3FEE;
    }

    private static boolean lIlIIIIlIllIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIlIllIIIl(int n2) {
        return n2 > 0;
    }

    private void F() {
        o lllllllllllllllIIIIlIllllIllIlIl;
        if (o.lIlIIIIlIlIllll(this.G() ? 1 : 0)) {
            return;
        }
        if (o.lIlIIIIlIllIIlI(lllllllllllllllIIIIlIllllIllIlIl.I() ? 1 : 0)) {
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
        NPC lllllllllllllllIIIIlIllllIllIIII = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[lIIIllIIIIIII[2]];
        nArray2[o.lIIIllIIIIIII[0]] = lIIIllIIIIIII[45];
        TileItem lllllllllllllllIIIIlIllllIlIllll = TileItems.getNearest((int[])nArray2);
        if (o.lIlIIIIlIllIlII(lllllllllllllllIIIIlIllllIlIllll) && o.lIlIIIIlIllIIlI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIllllIlIllll) ? 1 : 0)) {
            lllllllllllllllIIIIlIllllIlIllll.interact(lIIIlIlllllll[lIIIllIIIIIII[8]]);
            return;
        }
        if (o.lIlIIIIlIllIlII(lllllllllllllllIIIIlIllllIllIIII) && o.lIlIIIIlIllIIlI(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIllllIllIIII) ? 1 : 0) && o.lIlIIIIlIllIlIl(Players.getLocal().getInteracting())) {
            lllllllllllllllIIIIlIllllIllIIII.interact(lIIIlIlllllll[lIIIllIIIIIII[9]]);
            return;
        }
        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIIII[47], lIIIllIIIIIII[48], lIIIllIIIIIII[0]));
        0;
    }

    private static String lIlIIIIlIlIlIll(String lllllllllllllllIIIIlIlllIlllIllI, String lllllllllllllllIIIIlIlllIlllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlllIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlllIlllIIll.getBytes(StandardCharsets.UTF_8)), lIIIllIIIIIII[13]), "DES");
            Cipher lllllllllllllllIIIIlIlllIllllIII = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIlllIllllIII.init(lIIIllIIIIIII[7], lllllllllllllllIIIIlIlllIllllIIl);
            return new String(lllllllllllllllIIIIlIlllIllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlllIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIlllIlllIlll) {
            lllllllllllllllIIIIlIlllIlllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIlIllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIIlIlIllll(int n2) {
        return n2 == 0;
    }
}

