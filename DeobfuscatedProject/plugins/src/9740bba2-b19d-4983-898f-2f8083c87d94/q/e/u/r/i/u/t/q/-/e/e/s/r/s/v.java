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
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

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
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.a;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Completing Pirates Treasure", register=true)
public class v
extends Task {
    private /* synthetic */ boolean aN;
    private /* synthetic */ boolean aQ;
    private /* synthetic */ boolean aP;
    private static /* synthetic */ String[] lIIIlllIIIIIl;
    private /* synthetic */ boolean aO;
    private static /* synthetic */ int[] lIIIlllIIIIlI;
    private /* synthetic */ boolean aR;
    private final /* synthetic */ SquireQuesterConfig aM;

    private void bj() {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (v.lIlIIIlllIIlIll(nPC.getId(), lIIIlllIIIIlI[87]) && v.lIlIIIlllIIllII(nPC.getInteracting(), Players.getLocal())) {
                n2 = lIIIlllIIIIlI[2];
                "".length();
                if ((0x7C ^ 0x2B ^ (0xC9 ^ 0x9A)) == ((0x42 ^ 0x1E ^ (0xF8 ^ 0x9C)) & (0x9B ^ 0x93 ^ (0x8C ^ 0xBC) ^ -" ".length()))) {
                    return ((3 + 49 - -115 + 41 ^ 28 + 79 - -40 + 5) & (0xF9 ^ 0xBD ^ (0x4E ^ 0x42) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIIIlllIIIIlI[0];
            }
            return n2 != 0;
        });
        if (v.lIlIIIlllIIIlII(list.isEmpty() ? 1 : 0)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[3], lIIIlllIIIIlI[4], lIIIlllIIIIlI[0]));
            "".length();
            return;
        }
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[5], lIIIlllIIIIlI[6], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[5], lIIIlllIIIIlI[6], lIIIlllIIIIlI[0]));
            "".length();
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[0]]);
        }
    }

    private static String lIlIIIlllIIIIII(String lllllllllllllllIIIIIlllIIIIIIlII, String lllllllllllllllIIIIIlllIIIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlllIIIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIIIIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlllIIIIlI[23]), "DES");
            Cipher lllllllllllllllIIIIIlllIIIIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlllIIIIIIllI.init(lIIIlllIIIIlI[18], lllllllllllllllIIIIIlllIIIIIIlll);
            return new String(lllllllllllllllIIIIIlllIIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlllIIIIIIlIl) {
            lllllllllllllllIIIIIlllIIIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlllIIIIlI() {
        lIIIlllIIIIIl = new String[lIIIlllIIIIlI[88]];
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[0]] = v.lIlIIIllIllllll("Egof", "Vcxic");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[2]] = v.lIlIIIlllIIIIII("i7W+XSTxdW0=", "YEYAN");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[18]] = v.lIlIIIllIllllll("BxcJCz00", "SvbbS");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[19]] = v.lIlIIIlllIIIIII("wPi0duO7bnY=", "vcHAL");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[1]] = v.lIlIIIlllIIIIIl("8jjvbPeNrZh0XV08kgqjRFb3zzMLwVoBPc0qpK9TMNg=", "fPhfC");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[20]] = v.lIlIIIllIllllll("FSQ0NwYu", "FAUEe");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[21]] = v.lIlIIIlllIIIIII("T/kUi62wGNM=", "DAMsz");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[22]] = v.lIlIIIllIllllll("EBcEIhwwDAEgHnMICTcUNhYc", "SxhNy");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[23]] = v.lIlIIIllIllllll("MQUXZx8cCxEvTBwCB2ceHQdCLgJIHgoiTAsYAzMJRg==", "hjbGl");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[24]] = v.lIlIIIllIllllll("PAcxIQcBBWUmGg4RLTAKTxAwOE4bDWUhHBoH", "obEUn");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[17]] = v.lIlIIIlllIIIIIl("X2rfRQTQiePtX2j5ttnjhlPi4K4H32UbqJLIsetJaHzmt2JBR4v5EgZgwlSKzISl", "SDkaE");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[40]] = v.lIlIIIlllIIIIII("Jqpx0LINpeBghU6iKyPGnXNBOjeyHEcn", "uWToA");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[42]] = v.lIlIIIlllIIIIIl("HJ9mfgCg74P5gjv2Y0FRE4xRaWgQ+SsQ", "FqXbC");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[44]] = v.lIlIIIllIllllll("BzkHDgcvN0sVBzU4SwAPLzEFAw==", "APkbn");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[45]] = v.lIlIIIllIllllll("PzkdLw==", "yPqCZ");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[47]] = v.lIlIIIlllIIIIIl("d8RZQZFoXipsTeubs2Bfv2vTHx2FK4kkiny77M/u6tL8zmmR2oLC+g==", "MtMgl");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[48]] = v.lIlIIIlllIIIIIl("ZjjdXFcjXdA=", "hVkMc");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[49]] = v.lIlIIIllIllllll("Myg5LQ==", "cAZFl");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[51]] = v.lIlIIIlllIIIIIl("dF0AR9QwOWQ=", "nyqye");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[60]] = v.lIlIIIlllIIIIII("15oD9kL1nSg=", "zQKTg");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[63]] = v.lIlIIIlllIIIIII("hxVzuqwAHEs=", "mareX");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[66]] = v.lIlIIIlllIIIIIl("ln8vWLRQR28=", "waFoS");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[69]] = v.lIlIIIllIllllll("Az8/", "GVXzk");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[70]] = v.lIlIIIlllIIIIII("XIkht+6H0dE=", "NAJmh");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[78]] = v.lIlIIIllIllllll("BgMBAGUmDQ==", "RbmkH");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[79]] = v.lIlIIIlllIIIIIl("6rEiGDNwsgxgoA9t1v4XjQ==", "nEEAh");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[80]] = v.lIlIIIlllIIIIII("zoZaKq+d0Rt+0fuqW1sgaX2gM+n9fBo6", "puPKE");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[81]] = v.lIlIIIlllIIIIII("LsLkbXuYhxwhhPM96ThU4A==", "HYTxO");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[82]] = v.lIlIIIlllIIIIII("9HSo5wKoPs/EVNBgTGardw==", "JOYBW");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[83]] = v.lIlIIIlllIIIIII("fRjLgs+dJzc=", "DYxrt");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[84]] = v.lIlIIIlllIIIIIl("QssLPgplmBkhs5Ng1lg6UA==", "CtvVm");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[85]] = v.lIlIIIlllIIIIIl("lSMl8Q9G3eM=", "zBwUz");
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[86]] = v.lIlIIIllIllllll("LzgNKjQMeTc5Pwg=", "mYcKZ");
    }

    private void bq() {
        v lllllllllllllllIIIIIlllIIIllIIII;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIllIIII.aO ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIlIlI(Inventory.getCount((boolean)lIIIlllIIIIlI[0], (int[])nArray2), lIIIlllIIIIlI[17])) {
            return;
        }
        System.out.println(lllllllllllllllIIIIIlllIIIllIIII.aN);
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIllIIII.aN ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        lllllllllllllllIIIIIlllIIIllIIII.a(lIIIlllIIIIlI[36], new WorldPoint(lIIIlllIIIIlI[37], lIIIlllIIIIlI[38], lIIIlllIIIIlI[0]), dialogOptionArray);
        if (v.lIlIIIlllIIIlll(Widgets.get((int)lIIIlllIIIIlI[46], (int)lIIIlllIIIIlI[21]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[47]]) ? 1 : 0)) {
            lllllllllllllllIIIIIlllIIIllIIII.aN = lIIIlllIIIIlI[2];
        }
    }

    private void bo() {
        v lllllllllllllllIIIIIlllIIIllIllI;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlII(lllllllllllllllIIIIIlllIIIllIllI.aP ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlII(lllllllllllllllIIIIIlllIIIllIllI.aQ ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[22]]);
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[18]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.NPC_CONTINUE;
        this.a(lIIIlllIIIIlI[36], new WorldPoint(lIIIlllIIIIlI[37], lIIIlllIIIIlI[38], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private static boolean lIlIIIlllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private void bz() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIlllIIIIlI[14], new WorldPoint(lIIIlllIIIIlI[15], lIIIlllIIIIlI[16], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private void P() {
        if (v.lIlIIIlllIIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void bk() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        Inventory.getFirst((int[])nArray2).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[2]]);
    }

    private void bx() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        TileItem lllllllllllllllIIIIIlllIIIlIIlII = TileItems.getNearest((int[])nArray2);
        if (v.lIlIIIlllIIlIII(lllllllllllllllIIIIIlllIIIlIIlII)) {
            lllllllllllllllIIIIIlllIIIlIIlII.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[70]]);
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[71], lIIIlllIIIIlI[72], lIIIlllIIIIlI[2]));
            "".length();
        }
    }

    private void bs() {
        v lllllllllllllllIIIIIlllIIIlIlIIl;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIlIlIIl.aP ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIlIlIIl.aO ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[50];
        NPC lllllllllllllllIIIIIlllIIIlIlIII = NPCs.getNearest((int[])nArray2);
        if (v.lIlIIIlllIIIlll(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIlllIIIIlI[13]);
        }
        if (v.lIlIIIlllIIlIII(lllllllllllllllIIIIIlllIIIlIlIII)) {
            lllllllllllllllIIIIIlllIIIlIlIII.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[51]]);
            "".length();
            if (null != null) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[52], lIIIlllIIIIlI[53], lIIIlllIIIIlI[0]));
            "".length();
        }
    }

    private static String lIlIIIllIllllll(String lllllllllllllllIIIIIllIlllllIlII, String lllllllllllllllIIIIIllIlllllIIll) {
        lllllllllllllllIIIIIllIlllllIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIllIlllllIIlI = new StringBuilder();
        char[] lllllllllllllllIIIIIllIlllllIIIl = lllllllllllllllIIIIIllIlllllIIll.toCharArray();
        int lllllllllllllllIIIIIllIlllllIIII = lIIIlllIIIIlI[0];
        char[] lllllllllllllllIIIIIllIllllIlIlI = lllllllllllllllIIIIIllIlllllIlII.toCharArray();
        int lllllllllllllllIIIIIllIllllIlIIl = lllllllllllllllIIIIIllIllllIlIlI.length;
        int lllllllllllllllIIIIIllIllllIlIII = lIIIlllIIIIlI[0];
        while (v.lIlIIIlllIIlIlI(lllllllllllllllIIIIIllIllllIlIII, lllllllllllllllIIIIIllIllllIlIIl)) {
            char lllllllllllllllIIIIIllIlllllIlIl = lllllllllllllllIIIIIllIllllIlIlI[lllllllllllllllIIIIIllIllllIlIII];
            lllllllllllllllIIIIIllIlllllIIlI.append((char)(lllllllllllllllIIIIIllIlllllIlIl ^ lllllllllllllllIIIIIllIlllllIIIl[lllllllllllllllIIIIIllIlllllIIII % lllllllllllllllIIIIIllIlllllIIIl.length]));
            "".length();
            ++lllllllllllllllIIIIIllIlllllIIII;
            ++lllllllllllllllIIIIIllIllllIlIII;
            "".length();
            if ((0xD2 ^ 0x87 ^ (0xFA ^ 0xAA)) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIllIlllllIIlI);
    }

    private static String lIlIIIlllIIIIIl(String lllllllllllllllIIIIIllIlllIlllll, String lllllllllllllllIIIIIllIlllIlllII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIlllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIllIllllIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIllIllllIIIIl.init(lIIIlllIIIIlI[18], lllllllllllllllIIIIIllIllllIIIlI);
            return new String(lllllllllllllllIIIIIllIllllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIllIllllIIIII) {
            lllllllllllllllIIIIIllIllllIIIII.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        v lllllllllllllllIIIIIlllIIlIIIIll;
        if (v.lIlIIIlllIIIlII(this.aM.quest().equals((Object)h.PIRATES_TREASURE) ? 1 : 0)) {
            return lIIIlllIIIIlI[0];
        }
        int lllllllllllllllIIIIIlllIIlIIIIlI = lllllllllllllllIIIIIlllIIlIIIIll.Q();
        if (v.lIlIIIlllIIIlIl(lllllllllllllllIIIIIlllIIlIIIIlI, lIIIlllIIIIlI[1])) {
            return lIIIlllIIIIlI[0];
        }
        System.out.println("[PIRATES TREASURE] - Current Progress: " + lllllllllllllllIIIIIlllIIlIIIIlI);
        switch (lllllllllllllllIIIIIlllIIlIIIIlI) {
            case 0: {
                lllllllllllllllIIIIIlllIIlIIIIll.bx();
                lllllllllllllllIIIIIlllIIlIIIIll.bz();
                "".length();
                if (-" ".length() <= 0) break;
                return ((0x35 ^ 0x1D) & ~(0x3C ^ 0x14)) != 0;
            }
            case 1: {
                lllllllllllllllIIIIIlllIIlIIIIll.by();
                lllllllllllllllIIIIIlllIIlIIIIll.bs();
                lllllllllllllllIIIIIlllIIlIIIIll.br();
                lllllllllllllllIIIIIlllIIlIIIIll.bq();
                lllllllllllllllIIIIIlllIIlIIIIll.bp();
                lllllllllllllllIIIIIlllIIlIIIIll.bo();
                lllllllllllllllIIIIIlllIIlIIIIll.bn();
                lllllllllllllllIIIIIlllIIlIIIIll.bm();
                "".length();
                if (" ".length() != 0) break;
                return ((0x2F ^ 0x71) & ~(0x61 ^ 0x3F)) != 0;
            }
            case 2: {
                lllllllllllllllIIIIIlllIIlIIIIll.bl();
                lllllllllllllllIIIIIlllIIlIIIIll.bk();
                "".length();
                if (-" ".length() <= ((0x81 ^ 0x8C) & ~(0xAB ^ 0xA6))) break;
                return ((0x34 ^ 0x16) & ~(0xA5 ^ 0x87)) != 0;
            }
            case 3: {
                lllllllllllllllIIIIIlllIIlIIIIll.bj();
                "".length();
                if (" ".length() != ((0x6C ^ 0x71 ^ (0x9E ^ 0xA2)) & (0xE0 ^ 0xA4 ^ (0x16 ^ 0x73) ^ -" ".length()))) break;
                return ((121 + 68 - 150 + 145 ^ 51 + 88 - 48 + 48) & (0x58 ^ 0x16 ^ (0x2B ^ 0x56) ^ -" ".length())) != 0;
            }
            default: {
                return lIIIlllIIIIlI[0];
            }
        }
        return lIIIlllIIIIlI[2];
    }

    private void br() {
        TileObject lllllllllllllllIIIIIlllIIIlIllII;
        v lllllllllllllllIIIIIlllIIIlIllIl;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIlIllIl.aP ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIlIllIl.aO ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIlIllIl.aN ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIlllIIIIlI[2]];
            nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
            if (v.lIlIIIlllIIlIlI(Inventory.getCount((boolean)lIIIlllIIIIlI[0], (int[])nArray3), lIIIlllIIIIlI[17]) && v.lIlIIIlllIIlIII(lllllllllllllllIIIIIlllIIIlIllII = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[lIIIlllIIIIlI[2]];
                stringArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIIl[lIIIlllIIIIlI[85]];
                if (v.lIlIIIlllIIIlll(tileObject.hasAction(stringArray) ? 1 : 0) && v.lIlIIIlllIIIlll(tileObject.getName().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[86]]) ? 1 : 0)) {
                    n2 = lIIIlllIIIIlI[2];
                    "".length();
                    if (((0xA2 ^ 0xA5) & ~(0x5A ^ 0x5D)) > 0) {
                        return ((0x79 ^ 0x73) & ~(0x9B ^ 0x91)) != 0;
                    }
                } else {
                    n2 = lIIIlllIIIIlI[0];
                }
                return n2 != 0;
            })) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIIIlIllII) ? 1 : 0)) {
                lllllllllllllllIIIIIlllIIIlIllII.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[48]]);
            }
        }
        int[] nArray4 = new int[lIIIlllIIIIlI[2]];
        nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray4) ? 1 : 0) && v.lIlIIIlllIIlIII(lllllllllllllllIIIIIlllIIIlIllII = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIIlllIIIIlI[2]];
            stringArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIIl[lIIIlllIIIIlI[83]];
            if (v.lIlIIIlllIIIlll(tileObject.hasAction(stringArray) ? 1 : 0) && v.lIlIIIlllIIIlll(tileObject.getName().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[84]]) ? 1 : 0)) {
                n2 = lIIIlllIIIIlI[2];
                "".length();
                if (((4 ^ 0x66) & ~(0xC7 ^ 0xA5)) <= -" ".length()) {
                    return ((0x86 ^ 0x9A) & ~(0x85 ^ 0x99)) != 0;
                }
            } else {
                n2 = lIIIlllIIIIlI[0];
            }
            return n2 != 0;
        })) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIIIlIllII) ? 1 : 0)) {
            lllllllllllllllIIIIIlllIIIlIllII.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[49]]);
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_PIRATES_TREASURE.c());
    }

    private void bt() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[58], lIIIlllIIIIlI[59], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[58], lIIIlllIIIIlI[59], lIIIlllIIIIlI[0]));
            "".length();
            "".length();
            if (((0x77 ^ 0x28) & ~(9 ^ 0x56)) != ((0xED ^ 0xBF) & ~(0x24 ^ 0x76))) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[60]]);
        }
    }

    private void Y() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[54];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIlllIIIIlI[55], new WorldPoint(lIIIlllIIIIlI[56], lIIIlllIIIIlI[57], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void lllllllllllllllIIIIIlllIIIIllIll;
        if (v.lIlIIIlllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lllllllllllllllIIIIIlllIIIIllIll;
        NPC lllllllllllllllIIIIIlllIIIIllIII = NPCs.getNearest((int[])nArray);
        if (v.lIlIIIlllIIlIII(lllllllllllllllIIIIIlllIIIIllIII) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIIIIllIII) ? 1 : 0)) {
            lllllllllllllllIIIIIlllIIIIllIII.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[78]]);
            "".length();
            if (((0x5D ^ 0x6F) & ~(0x1D ^ 0x2F)) != 0) {
                return;
            }
        } else {
            void lllllllllllllllIIIIIlllIIIIllIlI;
            System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[79]]);
            Walker.walkTo((WorldPoint)lllllllllllllllIIIIIlllIIIIllIlI);
            "".length();
        }
    }

    private void by() {
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (!v.lIlIIIlllIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[73]) || v.lIlIIIlllIIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[74])) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[1]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIlllIIIIlI[75], new WorldPoint(lIIIlllIIIIlI[76], lIIIlllIIIIlI[77], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private static boolean lIlIIIlllIIIlll(int n2) {
        return n2 != 0;
    }

    static {
        v.lIlIIIlllIIIIll();
        v.lIlIIIlllIIIIlI();
    }

    private void bl() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[9];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        int[] nArray3 = new int[lIIIlllIIIIlI[2]];
        nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[10];
        TileObject lllllllllllllllIIIIIlllIIIlllllI = TileObjects.getNearest((int[])nArray3);
        if (v.lIlIIIlllIIlIII(lllllllllllllllIIIIIlllIIIlllllI) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIIIlllllI) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIlllIIIIlI[2]];
            nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[9];
            Inventory.getFirst((int[])nArray4).useOn(lllllllllllllllIIIIIlllIIIlllllI);
            "".length();
            if (null != null) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[11], lIIIlllIIIIlI[12], lIIIlllIIIIlI[2]));
            "".length();
        }
    }

    private static boolean lIlIIIlllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlllIIlIII(Object object) {
        return object != null;
    }

    private static void lIlIIIlllIIIIll() {
        lIIIlllIIIIlI = new int[89];
        v.lIIIlllIIIIlI[0] = (0xE0 ^ 0xA6) & ~(1 ^ 0x47);
        v.lIIIlllIIIIlI[1] = 0x3D ^ 0x39;
        v.lIIIlllIIIIlI[2] = " ".length();
        v.lIIIlllIIIIlI[3] = 0xFFFF8BB2 & Short.MAX_VALUE;
        v.lIIIlllIIIIlI[4] = 0xFFFF8D3B & 0x7FEE;
        v.lIIIlllIIIIlI[5] = 0xFFFFDBF7 & 0x2FBF;
        v.lIIIlllIIIIlI[6] = -(0xFFFFDC5F & 0x73E9) & (0xFFFFDF7F & 0x7DFF);
        v.lIIIlllIIIIlI[7] = -(0xFFFFF43B & 0x1FC5) & (0xFFFFF7F8 & 0x1FBF);
        v.lIIIlllIIIIlI[8] = 0xFFFFD7BF & 0x29F1;
        v.lIIIlllIIIIlI[9] = 0xFFFFADB2 & 0x53FD;
        v.lIIIlllIIIIlI[10] = -(0xFFFFF5E1 & 0x7F7F) & (0xFFFFFFFF & 0x7D7F);
        v.lIIIlllIIIIlI[11] = 0xFFFFBCBF & 0x4FD3;
        v.lIIIlllIIIIlI[12] = 0xFFFFCD43 & 0x3FFF;
        v.lIIIlllIIIIlI[13] = -(0xFFFFEF37 & 0x7ED9) & (0xFFFFFFFF & 0x6FBF);
        v.lIIIlllIIIIlI[14] = -(0xFFFFD55D & 0x7BE7) & (0xFFFFDFFF & 0x7F7F);
        v.lIIIlllIIIIlI[15] = -(0xFFFFDCD9 & 0x6727) & (0xFFFFDFFF & 0x6FED);
        v.lIIIlllIIIIlI[16] = 0xFFFF9EB5 & 0x6DFF;
        v.lIIIlllIIIIlI[17] = 42 + 94 - 23 + 17 ^ 18 + 1 - -4 + 113;
        v.lIIIlllIIIIlI[18] = "  ".length();
        v.lIIIlllIIIIlI[19] = "   ".length();
        v.lIIIlllIIIIlI[20] = 0x5A ^ 0x6F ^ (0x25 ^ 0x15);
        v.lIIIlllIIIIlI[21] = 0xA8 ^ 0xB9 ^ (0xD1 ^ 0xC6);
        v.lIIIlllIIIIlI[22] = 0x51 ^ 0x56;
        v.lIIIlllIIIIlI[23] = (0x82 ^ 0xB3) & ~(0x85 ^ 0xB4) ^ (0x16 ^ 0x1E);
        v.lIIIlllIIIIlI[24] = 4 ^ 0x31 ^ (0x5F ^ 0x63);
        v.lIIIlllIIIIlI[25] = 0xFFFFAFBF & 0x7F72;
        v.lIIIlllIIIIlI[26] = 0xFFFF8F42 & 0x7EFD;
        v.lIIIlllIIIIlI[27] = 0xFFFFEBBF & 0x1FC9;
        v.lIIIlllIIIIlI[28] = -(0xFFFFBAAB & 0x7577) & (0xFFFFBD7E & 0x7EEF);
        v.lIIIlllIIIIlI[29] = -(0xFFFFBEFB & 0x6D17) & (0xFFFFBFFF & 0x6FFF);
        v.lIIIlllIIIIlI[30] = -(0xFFFFFA97 & 0x65EB) & (0xFFFFFFF7 & 0x7F9F);
        v.lIIIlllIIIIlI[31] = 0xFFFFCFD8 & 0x3BEF;
        v.lIIIlllIIIIlI[32] = 0xFFFFDDFF & 0x2E9C;
        v.lIIIlllIIIIlI[33] = -(0xFFFFFF3B & 0x57E5) & (0xFFFFFFFF & 0x5F37);
        v.lIIIlllIIIIlI[34] = -(0xFFFFE65B & 0x79AE) & (0xFFFFFFFF & 0x6BCB);
        v.lIIIlllIIIIlI[35] = -(0xFFFFA7A9 & 0x7A77) & (0xFFFFAEBF & 0x7FE7);
        v.lIIIlllIIIIlI[36] = 0xFFFFAFFF & 0x5E3F;
        v.lIIIlllIIIIlI[37] = -(0xFFFFF6EF & 0x5D96) & (0xFFFFDFFF & Short.MAX_VALUE);
        v.lIIIlllIIIIlI[38] = 0xFFFFED7D & 0x1ED3;
        v.lIIIlllIIIIlI[39] = 157 + 24 - 42 + 52 + (0x42 ^ 8) - (154 + 41 - 19 + 54) + (181 + 108 - 267 + 172);
        v.lIIIlllIIIIlI[40] = 0x8D ^ 0x86;
        v.lIIIlllIIIIlI[41] = -(0xFFFFF7BB & 0x6C65) & (0xFFFFFFFD & 0x6C3A);
        v.lIIIlllIIIIlI[42] = 0x37 ^ 0x3B;
        v.lIIIlllIIIIlI[43] = 0xFFFF97BF & 0x6FEB;
        v.lIIIlllIIIIlI[44] = 0x60 ^ 0x13 ^ (0x1C ^ 0x62);
        v.lIIIlllIIIIlI[45] = 0x38 ^ 0x36;
        v.lIIIlllIIIIlI[46] = 204 + 4 - 143 + 166;
        v.lIIIlllIIIIlI[47] = 5 ^ 0xA;
        v.lIIIlllIIIIlI[48] = 0x67 ^ 0x77;
        v.lIIIlllIIIIlI[49] = 0x14 ^ 0x50 ^ (0x22 ^ 0x77);
        v.lIIIlllIIIIlI[50] = -(0xFFFFC999 & 0x3EEF) & (0xFFFFBFFF & 0x7DDF);
        v.lIIIlllIIIIlI[51] = 0x9F ^ 0x8D;
        v.lIIIlllIIIIlI[52] = -(0xFFFFCC5F & 0x77A5) & (0xFFFFDF7F & 0x6FF4);
        v.lIIIlllIIIIlI[53] = 0xFFFFAF6F & 0x5CD8;
        v.lIIIlllIIIIlI[54] = 0xFFFFDBDF & 0x7E3F;
        v.lIIIlllIIIIlI[55] = 0xFFFFBF76 & 0x61AD;
        v.lIIIlllIIIIlI[56] = 0xFFFFCFEE & 0x3BFF;
        v.lIIIlllIIIIlI[57] = -(0xFFFFF7DB & 0x1826) & (0xFFFFDFAF & 0x3CFF);
        v.lIIIlllIIIIlI[58] = 0xFFFFEFDF & 0x1C26;
        v.lIIIlllIIIIlI[59] = 0xFFFFECBB & 0x1FFF;
        v.lIIIlllIIIIlI[60] = 0x29 ^ 0x3A;
        v.lIIIlllIIIIlI[61] = 0xFFFFEF3D & 0x1CE7;
        v.lIIIlllIIIIlI[62] = 0xFFFFFEFA & 0xDC5;
        v.lIIIlllIIIIlI[63] = 93 + 10 - 76 + 126 ^ 85 + 140 - 88 + 4;
        v.lIIIlllIIIIlI[64] = -(0xFFFFB765 & 0x6ADB) & (0xFFFFBEEB & 0x6FD7);
        v.lIIIlllIIIIlI[65] = 0xFFFF9FDD & 0x6CAE;
        v.lIIIlllIIIIlI[66] = 0xE0 ^ 0xAD ^ (0x54 ^ 0xC);
        v.lIIIlllIIIIlI[67] = -(0xFFFFFE63 & 0x3FD) & (0xFFFFBFFE & 0x4EFF);
        v.lIIIlllIIIIlI[68] = 0xFFFFDEA9 & 0x2DDF;
        v.lIIIlllIIIIlI[69] = 0xB4 ^ 0xA2;
        v.lIIIlllIIIIlI[70] = 0xA ^ 0x79 ^ (0x27 ^ 0x43);
        v.lIIIlllIIIIlI[71] = -(0xFFFFDB3D & 0x77EF) & (0xFFFFDFBF & 0x7FFC);
        v.lIIIlllIIIIlI[72] = 0xFFFF8FDB & 0x7D77;
        v.lIIIlllIIIIlI[73] = 0xFFFFBEBF & 0x6F71;
        v.lIIIlllIIIIlI[74] = 0xFFFFEDFD & 0x3F33;
        v.lIIIlllIIIIlI[75] = -(0xFFFFE3C5 & 0x3DFB) & (0xFFFFFFFD & 0x2FFF);
        v.lIIIlllIIIIlI[76] = 0xFFFFBBF3 & 0x4FDF;
        v.lIIIlllIIIIlI[77] = -(0xFFFFB367 & 0x7FFB) & (0xFFFFBFF7 & Short.MAX_VALUE);
        v.lIIIlllIIIIlI[78] = 0x40 ^ 0x58;
        v.lIIIlllIIIIlI[79] = 0x1E ^ 7;
        v.lIIIlllIIIIlI[80] = 0xB8 ^ 0xA2;
        v.lIIIlllIIIIlI[81] = 0x77 ^ 0x69 ^ (0x4F ^ 0x4A);
        v.lIIIlllIIIIlI[82] = 0x78 ^ 0x64;
        v.lIIIlllIIIIlI[83] = 8 ^ 0x15;
        v.lIIIlllIIIIlI[84] = 12 + 25 - 4 + 121 ^ 77 + 27 - 13 + 41;
        v.lIIIlllIIIIlI[85] = 0xE1 ^ 0x90 ^ (0x13 ^ 0x7D);
        v.lIIIlllIIIIlI[86] = 0x5F ^ 0x7F;
        v.lIIIlllIIIIlI[87] = -(0xFFFFF07F & 0x1FA9) & (0xFFFF9FEB & 0x7E7F);
        v.lIIIlllIIIIlI[88] = 0x44 ^ 0x7B ^ (0xAF ^ 0xB1);
    }

    private static boolean lIlIIIlllIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIlllIIllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlllIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public v(SquireQuesterConfig squireQuesterConfig) {
        this.aN = lIIIlllIIIIlI[0];
        this.aO = lIIIlllIIIIlI[0];
        this.aP = lIIIlllIIIIlI[0];
        this.aQ = lIIIlllIIIIlI[0];
        this.aR = lIIIlllIIIIlI[0];
        this.aM = squireQuesterConfig;
    }

    private static boolean lIlIIIlllIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private void bv() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[64], lIIIlllIIIIlI[65], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[64], lIIIlllIIIIlI[65], lIIIlllIIIIlI[0]));
            "".length();
            "".length();
            if (((0x9F ^ 0xA8) & ~(0x75 ^ 0x42)) < ((0xAD ^ 0xA3) & ~(0x75 ^ 0x7B))) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[66]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIIIIIlllIIIIlIIlI;
        String string = chatMessage.getMessage();
        if (v.lIlIIIlllIIIlll(string.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[80]]) ? 1 : 0)) {
            this.aO = lIIIlllIIIIlI[2];
        }
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIIlIIlI.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[81]]) ? 1 : 0)) {
            lllllllllllllllIIIIIlllIIIIlIlII.aO = lIIIlllIIIIlI[2];
        }
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIIlIIlI.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[82]]) ? 1 : 0)) {
            lllllllllllllllIIIIIlllIIIIlIlII.aR = lIIIlllIIIIlI[2];
        }
    }

    private void bn() {
        if (v.lIlIIIlllIIIlII(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.continueSpace();
            if (v.lIlIIIlllIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIIIlllIIIIlI[2]);
                "".length();
                return;
            }
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[25])) {
            v lllllllllllllllIIIIIlllIIIlllIIl;
            DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[24]];
            dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.PLAYER_CONTINUE;
            lllllllllllllllIIIIIlllIIIlllIIl.a(lIIIlllIIIIlI[26], new WorldPoint(lIIIlllIIIIlI[27], lIIIlllIIIIlI[28], lIIIlllIIIIlI[0]), dialogOptionArray);
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIlllIIIIlI[2]];
            nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            if (v.lIlIIIlllIIIlII(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[lIIIlllIIIIlI[2]];
                nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[30];
                TileItem lllllllllllllllIIIIIlllIIIlllIII = TileItems.getNearest((int[])nArray4);
                if (v.lIlIIIlllIIlIII(lllllllllllllllIIIIIlllIIIlllIII) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIIIlllIII) ? 1 : 0)) {
                    System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[18]]);
                    lllllllllllllllIIIIIlllIIIlllIII.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[19]]);
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[31], lIIIlllIIIIlI[32], lIIIlllIIIIlI[0]));
                    "".length();
                }
                return;
            }
        }
        int[] nArray5 = new int[lIIIlllIIIIlI[2]];
        nArray5[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (v.lIlIIIlllIIIlll(Equipment.contains((int[])nArray5) ? 1 : 0)) {
            int[] nArray6 = new int[lIIIlllIIIIlI[2]];
            nArray6[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            System.out.println(Equipment.contains((int[])nArray6));
            System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[1]]);
            int[] nArray7 = new int[lIIIlllIIIIlI[2]];
            nArray7[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[33];
            TileObject lllllllllllllllIIIIIlllIIIlllIII = TileObjects.getNearest((int[])nArray7);
            if (v.lIlIIIlllIIlIII(lllllllllllllllIIIIIlllIIIlllIII) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIIIlllIII) ? 1 : 0)) {
                lllllllllllllllIIIIIlllIIIlllIII.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[20]]);
                "".length();
                if (((0x91 ^ 0x95) & ~(0x33 ^ 0x37)) <= -" ".length()) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[34], lIIIlllIIIIlI[35], lIIIlllIIIIlI[0]));
                "".length();
            }
        }
        int[] nArray8 = new int[lIIIlllIIIIlI[2]];
        nArray8[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
            int[] nArray9 = new int[lIIIlllIIIIlI[2]];
            nArray9[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            Inventory.getFirst((int[])nArray9).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[21]]);
            return;
        }
    }

    private static boolean lIlIIIlllIIIllI(int n2) {
        return n2 > 0;
    }

    private void bm() {
        if (v.lIlIIIlllIIIlII(this.aR ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIlllIIIIlI[14], new WorldPoint(lIIIlllIIIIlI[15], lIIIlllIIIIlI[16], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private void bp() {
        v lllllllllllllllIIIIIlllIIIllIIll;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlII(lllllllllllllllIIIIIlllIIIllIIll.aN ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIlIII(Widgets.get((int)lIIIlllIIIIlI[39], (int)lIIIlllIIIIlI[2]))) {
            if (v.lIlIIIlllIIIlll(Widgets.get((int)lIIIlllIIIIlI[39], (int)lIIIlllIIIIlI[2]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[23]]) ? 1 : 0)) {
                lllllllllllllllIIIIIlllIIIllIIll.aP = lIIIlllIIIIlI[2];
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[24]]);
            }
            if (v.lIlIIIlllIIIlll(Widgets.get((int)lIIIlllIIIIlI[39], (int)lIIIlllIIIIlI[2]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[17]]) ? 1 : 0)) {
                lllllllllllllllIIIIIlllIIIllIIll.aQ = lIIIlllIIIIlI[2];
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[40]]);
            }
        }
        if (v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIllIIll.aQ ? 1 : 0) && v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIllIIll.aP ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[41];
        TileObject lllllllllllllllIIIIIlllIIIllIIlI = TileObjects.getNearest((int[])nArray);
        if (v.lIlIIIlllIIlIII(lllllllllllllllIIIIIlllIIIllIIlI) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)lllllllllllllllIIIIIlllIIIllIIlI) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlllIIIIlI[2]];
            nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
            if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIlllIIIIlI[2]];
                nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
                Inventory.getFirst((int[])nArray3).useOn(lllllllllllllllIIIIIlllIIIllIIlI);
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[42]]);
                return;
            }
            int[] nArray4 = new int[lIIIlllIIIIlI[2]];
            nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
            if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0) && v.lIlIIIlllIIIlll(lllllllllllllllIIIIIlllIIIllIIll.aP ? 1 : 0)) {
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[44]]);
                lllllllllllllllIIIIIlllIIIllIIlI.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[45]]);
            }
        }
    }

    private void bu() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[61], lIIIlllIIIIlI[62], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[61], lIIIlllIIIIlI[62], lIIIlllIIIIlI[0]));
            "".length();
            "".length();
            if ((0xC1 ^ 0xB2 ^ (0x55 ^ 0x22)) > (0x99 ^ 0x81 ^ (0xAE ^ 0xB2))) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[63]]);
        }
    }

    private void bw() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[67], lIIIlllIIIIlI[68], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[67], lIIIlllIIIIlI[68], lIIIlllIIIIlI[0]));
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[69]]);
        }
    }
}

