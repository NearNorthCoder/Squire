package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
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
@TaskDesc(name = "Completing Pirates Treasure", register = true)
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.v  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/v.class */
public class v extends Task {
    private static /* synthetic */ String[] lIIIlllIIIIIl;
    private static /* synthetic */ int[] lIIIlllIIIIlI;
    private final /* synthetic */ SquireQuesterConfig aM;
    private /* synthetic */ boolean aN = lIIIlllIIIIlI[0];
    private /* synthetic */ boolean aO = lIIIlllIIIIlI[0];
    private /* synthetic */ boolean aP = lIIIlllIIIIlI[0];
    private /* synthetic */ boolean aQ = lIIIlllIIIIlI[0];
    private /* synthetic */ boolean aR = lIIIlllIIIIlI[0];

    private void bj() {
        if (lIlIIIlllIIIlII(NPCs.getAll(npc -> {
            if (lIlIIIlllIIlIll(npc.getId(), lIIIlllIIIIlI[87]) && lIlIIIlllIIllII(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = lIIIlllIIIIlI[2];
                "".length();
                return ((124 ^ 43) ^ (201 ^ 154)) == (((66 ^ 30) ^ (248 ^ 156)) & (((155 ^ 147) ^ (140 ^ 188)) ^ (-" ".length()))) ? ((((3 + 49) - (-115)) + 41) ^ (((28 + 79) - (-40)) + 5)) & (((249 ^ 189) ^ (78 ^ 66)) ^ (-" ".length())) : r0;
            }
            return lIIIlllIIIIlI[0];
        }).isEmpty() ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[3], lIIIlllIIIIlI[4], lIIIlllIIIIlI[0]));
            "".length();
        } else if (!lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[5], lIIIlllIIIIlI[6], lIIIlllIIIIlI[0])))) {
            int[] iArr = new int[lIIIlllIIIIlI[2]];
            iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst(iArr).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[0]]);
        } else {
            Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[5], lIIIlllIIIIlI[6], lIIIlllIIIIlI[0]));
            "".length();
            "".length();
            if ("   ".length() < 0) {
            }
        }
    }

    private static String lIlIIIlllIIIIII(String lllllllllllllllIIIIIlllIIIIIIlII, String lllllllllllllllIIIIIlllIIIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIIIIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlllIIIIlI[23]), "DES");
            Cipher lllllllllllllllIIIIIlllIIIIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlllIIIIIIllI.init(lIIIlllIIIIlI[18], secretKeySpec);
            return new String(lllllllllllllllIIIIIlllIIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlllIIIIIIIII) {
            lllllllllllllllIIIIIlllIIIIIIIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlllIIIIlI() {
        lIIIlllIIIIIl = new String[lIIIlllIIIIlI[88]];
        lIIIlllIIIIIl[lIIIlllIIIIlI[0]] = lIlIIIllIllllll("Egof", "Vcxic");
        lIIIlllIIIIIl[lIIIlllIIIIlI[2]] = lIlIIIlllIIIIII("i7W+XSTxdW0=", "YEYAN");
        lIIIlllIIIIIl[lIIIlllIIIIlI[18]] = lIlIIIllIllllll("BxcJCz00", "SvbbS");
        lIIIlllIIIIIl[lIIIlllIIIIlI[19]] = lIlIIIlllIIIIII("wPi0duO7bnY=", "vcHAL");
        lIIIlllIIIIIl[lIIIlllIIIIlI[1]] = lIlIIIlllIIIIIl("8jjvbPeNrZh0XV08kgqjRFb3zzMLwVoBPc0qpK9TMNg=", "fPhfC");
        lIIIlllIIIIIl[lIIIlllIIIIlI[20]] = lIlIIIllIllllll("FSQ0NwYu", "FAUEe");
        lIIIlllIIIIIl[lIIIlllIIIIlI[21]] = lIlIIIlllIIIIII("T/kUi62wGNM=", "DAMsz");
        lIIIlllIIIIIl[lIIIlllIIIIlI[22]] = lIlIIIllIllllll("EBcEIhwwDAEgHnMICTcUNhYc", "SxhNy");
        lIIIlllIIIIIl[lIIIlllIIIIlI[23]] = lIlIIIllIllllll("MQUXZx8cCxEvTBwCB2ceHQdCLgJIHgoiTAsYAzMJRg==", "hjbGl");
        lIIIlllIIIIIl[lIIIlllIIIIlI[24]] = lIlIIIllIllllll("PAcxIQcBBWUmGg4RLTAKTxAwOE4bDWUhHBoH", "obEUn");
        lIIIlllIIIIIl[lIIIlllIIIIlI[17]] = lIlIIIlllIIIIIl("X2rfRQTQiePtX2j5ttnjhlPi4K4H32UbqJLIsetJaHzmt2JBR4v5EgZgwlSKzISl", "SDkaE");
        lIIIlllIIIIIl[lIIIlllIIIIlI[40]] = lIlIIIlllIIIIII("Jqpx0LINpeBghU6iKyPGnXNBOjeyHEcn", "uWToA");
        lIIIlllIIIIIl[lIIIlllIIIIlI[42]] = lIlIIIlllIIIIIl("HJ9mfgCg74P5gjv2Y0FRE4xRaWgQ+SsQ", "FqXbC");
        lIIIlllIIIIIl[lIIIlllIIIIlI[44]] = lIlIIIllIllllll("BzkHDgcvN0sVBzU4SwAPLzEFAw==", "APkbn");
        lIIIlllIIIIIl[lIIIlllIIIIlI[45]] = lIlIIIllIllllll("PzkdLw==", "yPqCZ");
        lIIIlllIIIIIl[lIIIlllIIIIlI[47]] = lIlIIIlllIIIIIl("d8RZQZFoXipsTeubs2Bfv2vTHx2FK4kkiny77M/u6tL8zmmR2oLC+g==", "MtMgl");
        lIIIlllIIIIIl[lIIIlllIIIIlI[48]] = lIlIIIlllIIIIIl("ZjjdXFcjXdA=", "hVkMc");
        lIIIlllIIIIIl[lIIIlllIIIIlI[49]] = lIlIIIllIllllll("Myg5LQ==", "cAZFl");
        lIIIlllIIIIIl[lIIIlllIIIIlI[51]] = lIlIIIlllIIIIIl("dF0AR9QwOWQ=", "nyqye");
        lIIIlllIIIIIl[lIIIlllIIIIlI[60]] = lIlIIIlllIIIIII("15oD9kL1nSg=", "zQKTg");
        lIIIlllIIIIIl[lIIIlllIIIIlI[63]] = lIlIIIlllIIIIII("hxVzuqwAHEs=", "mareX");
        lIIIlllIIIIIl[lIIIlllIIIIlI[66]] = lIlIIIlllIIIIIl("ln8vWLRQR28=", "waFoS");
        lIIIlllIIIIIl[lIIIlllIIIIlI[69]] = lIlIIIllIllllll("Az8/", "GVXzk");
        lIIIlllIIIIIl[lIIIlllIIIIlI[70]] = lIlIIIlllIIIIII("XIkht+6H0dE=", "NAJmh");
        lIIIlllIIIIIl[lIIIlllIIIIlI[78]] = lIlIIIllIllllll("BgMBAGUmDQ==", "RbmkH");
        lIIIlllIIIIIl[lIIIlllIIIIlI[79]] = lIlIIIlllIIIIIl("6rEiGDNwsgxgoA9t1v4XjQ==", "nEEAh");
        lIIIlllIIIIIl[lIIIlllIIIIlI[80]] = lIlIIIlllIIIIII("zoZaKq+d0Rt+0fuqW1sgaX2gM+n9fBo6", "puPKE");
        lIIIlllIIIIIl[lIIIlllIIIIlI[81]] = lIlIIIlllIIIIII("LsLkbXuYhxwhhPM96ThU4A==", "HYTxO");
        lIIIlllIIIIIl[lIIIlllIIIIlI[82]] = lIlIIIlllIIIIII("9HSo5wKoPs/EVNBgTGardw==", "JOYBW");
        lIIIlllIIIIIl[lIIIlllIIIIlI[83]] = lIlIIIlllIIIIII("fRjLgs+dJzc=", "DYxrt");
        lIIIlllIIIIIl[lIIIlllIIIIlI[84]] = lIlIIIlllIIIIIl("QssLPgplmBkhs5Ng1lg6UA==", "CtvVm");
        lIIIlllIIIIIl[lIIIlllIIIIlI[85]] = lIlIIIlllIIIIIl("lSMl8Q9G3eM=", "zBwUz");
        lIIIlllIIIIIl[lIIIlllIIIIlI[86]] = lIlIIIllIllllll("LzgNKjQMeTc5Pwg=", "mYcKZ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    private void bq() {
        if (lIlIIIlllIIIlll(this.aR ? 1 : 0) || lIlIIIlllIIIlll(this.aO ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        ?? r0 = lIIIlllIIIIlI[0];
        int[] iArr2 = new int[lIIIlllIIIIlI[2]];
        iArr2[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (lIlIIIlllIIlIlI(Inventory.getCount((boolean) r0, iArr2), lIIIlllIIIIlI[17])) {
            return;
        }
        System.out.println(this.aN);
        if (lIlIIIlllIIIlll(this.aN ? 1 : 0)) {
            return;
        }
        int i = lIIIlllIIIIlI[36];
        WorldPoint worldPoint = new WorldPoint(lIIIlllIIIIlI[37], lIIIlllIIIIlI[38], lIIIlllIIIIlI[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArr[lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
        if (lIlIIIlllIIIlll(Widgets.get(lIIIlllIIIIlI[46], lIIIlllIIIIlI[21]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[47]]) ? 1 : 0)) {
            this.aN = lIIIlllIIIIlI[2];
        }
    }

    private void bo() {
        if (lIlIIIlllIIIlll(this.aR ? 1 : 0) || lIlIIIlllIIIlII(this.aP ? 1 : 0) || lIlIIIlllIIIlII(this.aQ ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[22]]);
        int i = lIIIlllIIIIlI[36];
        WorldPoint worldPoint = new WorldPoint(lIIIlllIIIIlI[37], lIIIlllIIIIlI[38], lIIIlllIIIIlI[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIlllIIIIlI[18]];
        dialogOptionArr[lIIIlllIIIIlI[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[2]] = DialogOption.NPC_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static boolean lIlIIIlllIIlIlI(int i, int i2) {
        return i < i2;
    }

    private void bz() {
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIlllIIIIlI[14];
        WorldPoint worldPoint = new WorldPoint(lIIIlllIIIIlI[15], lIIIlllIIIIlI[16], lIIIlllIIIIlI[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArr[lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void P() {
        if (lIlIIIlllIIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void bk() {
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIlllIIIIlI[2]];
        iArr2[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        Inventory.getFirst(iArr2).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[2]]);
    }

    private void bx() {
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (lIlIIIlllIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIlllIIIIlI[2]];
        iArr2[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        TileItem nearest = TileItems.getNearest(iArr2);
        if (!lIlIIIlllIIlIII(nearest)) {
            Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[71], lIIIlllIIIIlI[72], lIIIlllIIIIlI[2]));
            "".length();
            return;
        }
        nearest.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[70]]);
        "".length();
        if ("  ".length() <= (-" ".length())) {
        }
    }

    private void bs() {
        if (lIlIIIlllIIIlll(this.aR ? 1 : 0) || lIlIIIlllIIIlll(this.aP ? 1 : 0) || lIlIIIlllIIIlll(this.aO ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (lIlIIIlllIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIlllIIIIlI[2]];
        iArr2[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[50];
        NPC nearest = NPCs.getNearest(iArr2);
        if (lIlIIIlllIIIlll(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne(lIIIlllIIIIlI[13]);
        }
        if (!lIlIIIlllIIlIII(nearest)) {
            Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[52], lIIIlllIIIIlI[53], lIIIlllIIIIlI[0]));
            "".length();
            return;
        }
        nearest.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[51]]);
        "".length();
        if (0 != 0) {
        }
    }

    private static String lIlIIIllIllllll(String lllllllllllllllIIIIIllIlllllIlII, String lllllllllllllllIIIIIllIlllllIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIllIlllllIIll.toCharArray();
        int lllllllllllllllIIIIIllIlllllIIII = lIIIlllIIIIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIlllIIIIlI[0];
        while (lIlIIIlllIIlIlI(i, length)) {
            char lllllllllllllllIIIIIllIlllllIlIl = charArray2[i];
            sb.append((char) (lllllllllllllllIIIIIllIlllllIlIl ^ charArray[lllllllllllllllIIIIIllIlllllIIII % charArray.length]));
            "".length();
            lllllllllllllllIIIIIllIlllllIIII++;
            i++;
            "".length();
            if (((210 ^ 135) ^ (250 ^ 170)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIIIlllIIIIIl(String lllllllllllllllIIIIIllIlllIlllll, String lllllllllllllllIIIIIllIlllIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIlllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIllIllllIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIllIllllIIIIl.init(lIIIlllIIIIlI[18], secretKeySpec);
            return new String(lllllllllllllllIIIIIllIllllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIllllIIIII) {
            lllllllllllllllIIIIIllIllllIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    public boolean run() {
        if (lIlIIIlllIIIlII(this.aM.quest().equals(h.PIRATES_TREASURE) ? 1 : 0)) {
            return lIIIlllIIIIlI[0];
        }
        int lllllllllllllllIIIIIlllIIlIIIIlI = Q();
        if (lIlIIIlllIIIlIl(lllllllllllllllIIIIIlllIIlIIIIlI, lIIIlllIIIIlI[1])) {
            return lIIIlllIIIIlI[0];
        }
        System.out.println("[PIRATES TREASURE] - Current Progress: " + lllllllllllllllIIIIIlllIIlIIIIlI);
        switch (lllllllllllllllIIIIIlllIIlIIIIlI) {
            case 0:
                bx();
                bz();
                "".length();
                if ((-" ".length()) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 1:
                by();
                bs();
                br();
                bq();
                bp();
                bo();
                bn();
                bm();
                "".length();
                if (" ".length() == 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 2:
                bl();
                bk();
                "".length();
                if ((-" ".length()) > ((129 ^ 140) & ((171 ^ 166) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 3:
                bj();
                "".length();
                if (" ".length() == (((108 ^ 113) ^ (158 ^ 162)) & (((224 ^ 164) ^ (22 ^ 115)) ^ (-" ".length())))) {
                    return ((((121 + 68) - 150) + 145) ^ (((51 + 88) - 48) + 48)) & (((88 ^ 22) ^ (43 ^ 86)) ^ (-" ".length()));
                }
                break;
            default:
                return lIIIlllIIIIlI[0];
        }
        return lIIIlllIIIIlI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    private void br() {
        if (lIlIIIlllIIIlll(this.aR ? 1 : 0) || lIlIIIlllIIIlll(this.aP ? 1 : 0) || lIlIIIlllIIIlll(this.aO ? 1 : 0) || lIlIIIlllIIIlll(this.aN ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIlllIIIIlI[2]];
        iArr2[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (lIlIIIlllIIIlll(Inventory.contains(iArr2) ? 1 : 0)) {
            ?? r0 = lIIIlllIIIIlI[0];
            int[] iArr3 = new int[lIIIlllIIIIlI[2]];
            iArr3[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
            if (lIlIIIlllIIlIlI(Inventory.getCount((boolean) r0, iArr3), lIIIlllIIIIlI[17])) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    String[] strArr = new String[lIIIlllIIIIlI[2]];
                    strArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIIl[lIIIlllIIIIlI[85]];
                    if (lIlIIIlllIIIlll(tileObject.hasAction(strArr) ? 1 : 0) && lIlIIIlllIIIlll(tileObject.getName().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[86]]) ? 1 : 0)) {
                        ?? r02 = lIIIlllIIIIlI[2];
                        "".length();
                        return ((162 ^ 165) & ((90 ^ 93) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                    }
                    return lIIIlllIIIIlI[0];
                });
                if (lIlIIIlllIIlIII(nearest) && lIlIIIlllIIIlll(Reachable.isInteractable(nearest) ? 1 : 0)) {
                    nearest.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[48]]);
                }
            }
        }
        int[] iArr4 = new int[lIIIlllIIIIlI[2]];
        iArr4[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr4) ? 1 : 0)) {
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                String[] strArr = new String[lIIIlllIIIIlI[2]];
                strArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIIl[lIIIlllIIIIlI[83]];
                if (lIlIIIlllIIIlll(tileObject2.hasAction(strArr) ? 1 : 0) && lIlIIIlllIIIlll(tileObject2.getName().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[84]]) ? 1 : 0)) {
                    ?? r02 = lIIIlllIIIIlI[2];
                    "".length();
                    return ((4 ^ 102) & ((199 ^ 165) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
                return lIIIlllIIIIlI[0];
            });
            if (lIlIIIlllIIlIII(nearest2) && lIlIIIlllIIIlll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                nearest2.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[49]]);
            }
        }
    }

    private int Q() {
        return Vars.getVarp(EnumC0000a.QUEST_PIRATES_TREASURE.c());
    }

    private void bt() {
        if (!lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[58], lIIIlllIIIIlI[59], lIIIlllIIIIlI[0])))) {
            int[] iArr = new int[lIIIlllIIIIlI[2]];
            iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst(iArr).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[60]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[58], lIIIlllIIIIlI[59], lIIIlllIIIIlI[0]));
        "".length();
        "".length();
        if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
        }
    }

    private void Y() {
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[54];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIlllIIIIlI[55];
        WorldPoint worldPoint = new WorldPoint(lIIIlllIIIIlI[56], lIIIlllIIIIlI[57], lIIIlllIIIIlI[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArr[lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArr[lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void a(int i, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIlIIIlllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
        }
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIlllIIlIII(nearest) || !lIlIIIlllIIIlll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[79]]);
            Walker.walkTo(worldPoint);
            "".length();
            return;
        }
        nearest.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[78]]);
        "".length();
        if ((true ^ true) && ((true ^ true) ^ true)) {
        }
    }

    private void by() {
        if (lIlIIIlllIIIlll(this.aR ? 1 : 0) || !lIlIIIlllIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[73]) || lIlIIIlllIIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[74])) {
            return;
        }
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIlllIIIIlI[75];
        WorldPoint worldPoint = new WorldPoint(lIIIlllIIIIlI[76], lIIIlllIIIIlI[77], lIIIlllIIIIlI[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIlllIIIIlI[1]];
        dialogOptionArr[lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[18]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIlllIIIIlI[19]] = DialogOption.PLAYER_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static boolean lIlIIIlllIIIlll(int i) {
        return i != 0;
    }

    static {
        lIlIIIlllIIIIll();
        lIlIIIlllIIIIlI();
    }

    private void bl() {
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        if (lIlIIIlllIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIlllIIIIlI[2]];
        iArr2[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[9];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
            return;
        }
        int[] iArr3 = new int[lIIIlllIIIIlI[2]];
        iArr3[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[10];
        TileObject nearest = TileObjects.getNearest(iArr3);
        if (!lIlIIIlllIIlIII(nearest) || !lIlIIIlllIIIlll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[11], lIIIlllIIIIlI[12], lIIIlllIIIIlI[2]));
            "".length();
            return;
        }
        int[] iArr4 = new int[lIIIlllIIIIlI[2]];
        iArr4[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[9];
        Inventory.getFirst(iArr4).useOn(nearest);
        "".length();
        if (0 != 0) {
        }
    }

    private static boolean lIlIIIlllIIIlII(int i) {
        return i == 0;
    }

    private static boolean lIlIIIlllIIlIII(Object obj) {
        return obj != null;
    }

    private static void lIlIIIlllIIIIll() {
        lIIIlllIIIIlI = new int[89];
        lIIIlllIIIIlI[0] = (224 ^ 166) & ((1 ^ 71) ^ (-1));
        lIIIlllIIIIlI[1] = 61 ^ 57;
        lIIIlllIIIIlI[2] = " ".length();
        lIIIlllIIIIlI[3] = (-29774) & 32767;
        lIIIlllIIIIlI[4] = (-29381) & 32750;
        lIIIlllIIIIlI[5] = (-9225) & 12223;
        lIIIlllIIIIlI[6] = (-((-9121) & 29673)) & (-8321) & 32255;
        lIIIlllIIIIlI[7] = (-((-3013) & 8133)) & (-2056) & 8127;
        lIIIlllIIIIlI[8] = (-10305) & 10737;
        lIIIlllIIIIlI[9] = (-21070) & 21501;
        lIIIlllIIIIlI[10] = (-((-2591) & 32639)) & (-1) & 32127;
        lIIIlllIIIIlI[11] = (-17217) & 20435;
        lIIIlllIIIIlI[12] = (-12989) & 16383;
        lIIIlllIIIIlI[13] = (-((-4297) & 32473)) & (-1) & 28607;
        lIIIlllIIIIlI[14] = (-((-10915) & 31719)) & (-8193) & 32639;
        lIIIlllIIIIlI[15] = (-((-8999) & 26407)) & (-8193) & 28653;
        lIIIlllIIIIlI[16] = (-24907) & 28159;
        lIIIlllIIIIlI[17] = (((42 + 94) - 23) + 17) ^ (((18 + 1) - (-4)) + 113);
        lIIIlllIIIIlI[18] = "  ".length();
        lIIIlllIIIIlI[19] = "   ".length();
        lIIIlllIIIIlI[20] = (90 ^ 111) ^ (37 ^ 21);
        lIIIlllIIIIlI[21] = (168 ^ 185) ^ (209 ^ 198);
        lIIIlllIIIIlI[22] = 81 ^ 86;
        lIIIlllIIIIlI[23] = ((130 ^ 179) & ((133 ^ 180) ^ (-1))) ^ (22 ^ 30);
        lIIIlllIIIIlI[24] = (4 ^ 49) ^ (95 ^ 99);
        lIIIlllIIIIlI[25] = (-20545) & 32626;
        lIIIlllIIIIlI[26] = (-28862) & 32509;
        lIIIlllIIIIlI[27] = (-5185) & 8137;
        lIIIlllIIIIlI[28] = (-((-17749) & 30071)) & (-17026) & 32495;
        lIIIlllIIIIlI[29] = (-((-16645) & 27927)) & (-16385) & 28671;
        lIIIlllIIIIlI[30] = (-((-1385) & 26091)) & (-9) & 32671;
        lIIIlllIIIIlI[31] = (-12328) & 15343;
        lIIIlllIIIIlI[32] = (-8705) & 11932;
        lIIIlllIIIIlI[33] = (-((-197) & 22501)) & (-1) & 24375;
        lIIIlllIIIIlI[34] = (-((-6565) & 31150)) & (-1) & 27595;
        lIIIlllIIIIlI[35] = (-((-22615) & 31351)) & (-20801) & 32743;
        lIIIlllIIIIlI[36] = (-20481) & 24127;
        lIIIlllIIIIlI[37] = (-((-2321) & 23958)) & (-8193) & 32767;
        lIIIlllIIIIlI[38] = (-4739) & 7891;
        lIIIlllIIIIlI[39] = (((((157 + 24) - 42) + 52) + (66 ^ 8)) - (((154 + 41) - 19) + 54)) + ((181 + 108) - 267) + 172;
        lIIIlllIIIIlI[40] = 141 ^ 134;
        lIIIlllIIIIlI[41] = (-((-2117) & 27749)) & (-3) & 27706;
        lIIIlllIIIIlI[42] = 55 ^ 59;
        lIIIlllIIIIlI[43] = (-26689) & 28651;
        lIIIlllIIIIlI[44] = (96 ^ 19) ^ (28 ^ 98);
        lIIIlllIIIIlI[45] = 56 ^ 54;
        lIIIlllIIIIlI[46] = ((204 + 4) - 143) + 166;
        lIIIlllIIIIlI[47] = 5 ^ 10;
        lIIIlllIIIIlI[48] = 103 ^ 119;
        lIIIlllIIIIlI[49] = (20 ^ 80) ^ (34 ^ 119);
        lIIIlllIIIIlI[50] = (-((-13927) & 16111)) & (-16385) & 32223;
        lIIIlllIIIIlI[51] = 159 ^ 141;
        lIIIlllIIIIlI[52] = (-((-13217) & 30629)) & (-8321) & 28660;
        lIIIlllIIIIlI[53] = (-20625) & 23768;
        lIIIlllIIIIlI[54] = (-9249) & 32319;
        lIIIlllIIIIlI[55] = (-16522) & 25005;
        lIIIlllIIIIlI[56] = (-12306) & 15359;
        lIIIlllIIIIlI[57] = (-((-2085) & 6182)) & (-8273) & 15615;
        lIIIlllIIIIlI[58] = (-4129) & 7206;
        lIIIlllIIIIlI[59] = (-4933) & 8191;
        lIIIlllIIIIlI[60] = 41 ^ 58;
        lIIIlllIIIIlI[61] = (-4291) & 7399;
        lIIIlllIIIIlI[62] = (-262) & 3525;
        lIIIlllIIIIlI[63] = (((93 + 10) - 76) + 126) ^ (((85 + 140) - 88) + 4);
        lIIIlllIIIIlI[64] = (-((-18587) & 27355)) & (-16661) & 28631;
        lIIIlllIIIIlI[65] = (-24611) & 27822;
        lIIIlllIIIIlI[66] = (224 ^ 173) ^ (84 ^ 12);
        lIIIlllIIIIlI[67] = (-((-413) & 1021)) & (-16386) & 20223;
        lIIIlllIIIIlI[68] = (-8535) & 11743;
        lIIIlllIIIIlI[69] = 180 ^ 162;
        lIIIlllIIIIlI[70] = (10 ^ 121) ^ (39 ^ 67);
        lIIIlllIIIIlI[71] = (-((-9411) & 30703)) & (-8257) & 32764;
        lIIIlllIIIIlI[72] = (-28709) & 32119;
        lIIIlllIIIIlI[73] = (-16705) & 28529;
        lIIIlllIIIIlI[74] = (-4611) & 16179;
        lIIIlllIIIIlI[75] = (-((-7227) & 15867)) & (-3) & 12287;
        lIIIlllIIIIlI[76] = (-17421) & 20447;
        lIIIlllIIIIlI[77] = (-((-19609) & 32763)) & (-16393) & 32767;
        lIIIlllIIIIlI[78] = 64 ^ 88;
        lIIIlllIIIIlI[79] = 30 ^ 7;
        lIIIlllIIIIlI[80] = 184 ^ 162;
        lIIIlllIIIIlI[81] = (119 ^ 105) ^ (79 ^ 74);
        lIIIlllIIIIlI[82] = 120 ^ 100;
        lIIIlllIIIIlI[83] = 8 ^ 21;
        lIIIlllIIIIlI[84] = (((12 + 25) - 4) + 121) ^ (((77 + 27) - 13) + 41);
        lIIIlllIIIIlI[85] = (225 ^ 144) ^ (19 ^ 125);
        lIIIlllIIIIlI[86] = 95 ^ 127;
        lIIIlllIIIIlI[87] = (-((-3969) & 8105)) & (-24597) & 32383;
        lIIIlllIIIIlI[88] = (68 ^ 123) ^ (175 ^ 177);
    }

    private static boolean lIlIIIlllIIlIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIIlllIIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIIlllIIIlIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Inject
    public v(SquireQuesterConfig squireQuesterConfig) {
        this.aM = squireQuesterConfig;
    }

    private static boolean lIlIIIlllIIlIIl(int i, int i2) {
        return i != i2;
    }

    private void bv() {
        if (!lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[64], lIIIlllIIIIlI[65], lIIIlllIIIIlI[0])))) {
            int[] iArr = new int[lIIIlllIIIIlI[2]];
            iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst(iArr).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[66]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[64], lIIIlllIIIIlI[65], lIIIlllIIIIlI[0]));
        "".length();
        "".length();
        if (((159 ^ 168) & ((117 ^ 66) ^ (-1))) < ((173 ^ 163) & ((117 ^ 123) ^ (-1)))) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIlIIIlllIIIlll(message.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[80]]) ? 1 : 0)) {
            this.aO = lIIIlllIIIIlI[2];
        }
        if (lIlIIIlllIIIlll(message.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[81]]) ? 1 : 0)) {
            this.aO = lIIIlllIIIIlI[2];
        }
        if (lIlIIIlllIIIlll(message.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[82]]) ? 1 : 0)) {
            this.aR = lIIIlllIIIIlI[2];
        }
    }

    private void bn() {
        if (lIlIIIlllIIIlII(this.aR ? 1 : 0)) {
            return;
        }
        if (lIlIIIlllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.continueSpace();
            if (lIlIIIlllIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption(lIIIlllIIIIlI[2]);
                "".length();
                return;
            }
            return;
        }
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (lIlIIIlllIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        if (lIlIIIlllIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[25])) {
            int i = lIIIlllIIIIlI[26];
            WorldPoint worldPoint = new WorldPoint(lIIIlllIIIIlI[27], lIIIlllIIIIlI[28], lIIIlllIIIIlI[0]);
            DialogOption[] dialogOptionArr = new DialogOption[lIIIlllIIIIlI[24]];
            dialogOptionArr[lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIlllIIIIlI[1]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArr[lIIIlllIIIIlI[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIlllIIIIlI[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIlllIIIIlI[22]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lIIIlllIIIIlI[23]] = DialogOption.PLAYER_CONTINUE;
            a(i, worldPoint, dialogOptionArr);
            return;
        }
        int[] iArr2 = new int[lIIIlllIIIIlI[2]];
        iArr2[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIlllIIIIlI[2]];
            iArr3[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            if (lIlIIIlllIIIlII(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIIlllIIIIlI[2]];
                iArr4[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[30];
                TileItem nearest = TileItems.getNearest(iArr4);
                if (!lIlIIIlllIIlIII(nearest) || !lIlIIIlllIIIlll(Reachable.isInteractable(nearest) ? 1 : 0)) {
                    Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[31], lIIIlllIIIIlI[32], lIIIlllIIIIlI[0]));
                    "".length();
                    return;
                }
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[18]]);
                nearest.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[19]]);
                "".length();
                if ((-"   ".length()) >= 0) {
                    return;
                }
                return;
            }
        }
        int[] iArr5 = new int[lIIIlllIIIIlI[2]];
        iArr5[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (lIlIIIlllIIIlll(Equipment.contains(iArr5) ? 1 : 0)) {
            PrintStream printStream = System.out;
            int[] iArr6 = new int[lIIIlllIIIIlI[2]];
            iArr6[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            printStream.println(Equipment.contains(iArr6));
            System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[1]]);
            int[] iArr7 = new int[lIIIlllIIIIlI[2]];
            iArr7[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[33];
            TileObject nearest2 = TileObjects.getNearest(iArr7);
            if (lIlIIIlllIIlIII(nearest2) && lIlIIIlllIIIlll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                nearest2.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[20]]);
                "".length();
                if (((145 ^ 149) & ((51 ^ 55) ^ (-1))) <= (-" ".length())) {
                    return;
                }
            } else {
                Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[34], lIIIlllIIIIlI[35], lIIIlllIIIIlI[0]));
                "".length();
            }
        }
        int[] iArr8 = new int[lIIIlllIIIIlI[2]];
        iArr8[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (lIlIIIlllIIIlll(Inventory.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIIIlllIIIIlI[2]];
            iArr9[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            Inventory.getFirst(iArr9).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[21]]);
        }
    }

    private static boolean lIlIIIlllIIIllI(int i) {
        return i > 0;
    }

    private void bm() {
        if (lIlIIIlllIIIlII(this.aR ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (lIlIIIlllIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIlllIIIIlI[14];
        WorldPoint worldPoint = new WorldPoint(lIIIlllIIIIlI[15], lIIIlllIIIIlI[16], lIIIlllIIIIlI[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArr[lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v33, types: [boolean] */
    private void bp() {
        if (lIlIIIlllIIIlll(this.aR ? 1 : 0) || lIlIIIlllIIIlII(this.aN ? 1 : 0)) {
            return;
        }
        if (lIlIIIlllIIlIII(Widgets.get(lIIIlllIIIIlI[39], lIIIlllIIIIlI[2]))) {
            if (lIlIIIlllIIIlll(Widgets.get(lIIIlllIIIIlI[39], lIIIlllIIIIlI[2]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[23]]) ? 1 : 0)) {
                this.aP = lIIIlllIIIIlI[2];
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[24]]);
            }
            if (lIlIIIlllIIIlll(Widgets.get(lIIIlllIIIIlI[39], lIIIlllIIIIlI[2]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[17]]) ? 1 : 0)) {
                this.aQ = lIIIlllIIIIlI[2];
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[40]]);
            }
        }
        if (lIlIIIlllIIIlll(this.aQ ? 1 : 0) && lIlIIIlllIIIlll(this.aP ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIIIlllIIIIlI[2]];
        iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[41];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIlIIIlllIIlIII(nearest) && lIlIIIlllIIIlll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIlllIIIIlI[2]];
            iArr2[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
            if (lIlIIIlllIIIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIlllIIIIlI[2]];
                iArr3[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
                Inventory.getFirst(iArr3).useOn(nearest);
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[42]]);
                return;
            }
            int[] iArr4 = new int[lIIIlllIIIIlI[2]];
            iArr4[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
            if (lIlIIIlllIIIlll(Inventory.contains(iArr4) ? 1 : 0) && lIlIIIlllIIIlll(this.aP ? 1 : 0)) {
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[44]]);
                nearest.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[45]]);
            }
        }
    }

    private void bu() {
        if (!lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[61], lIIIlllIIIIlI[62], lIIIlllIIIIlI[0])))) {
            int[] iArr = new int[lIIIlllIIIIlI[2]];
            iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst(iArr).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[63]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[61], lIIIlllIIIIlI[62], lIIIlllIIIIlI[0]));
        "".length();
        "".length();
        if (((193 ^ 178) ^ (85 ^ 34)) > ((153 ^ 129) ^ (174 ^ 178))) {
        }
    }

    private void bw() {
        if (!lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[67], lIIIlllIIIIlI[68], lIIIlllIIIIlI[0])))) {
            int[] iArr = new int[lIIIlllIIIIlI[2]];
            iArr[lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst(iArr).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[69]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIlllIIIIlI[67], lIIIlllIIIIlI[68], lIIIlllIIIIlI[0]));
        "".length();
        "".length();
        if ("  ".length() < 0) {
        }
    }
}
