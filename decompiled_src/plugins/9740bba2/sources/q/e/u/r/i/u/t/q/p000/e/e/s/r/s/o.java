package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

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
import net.runelite.api.Item;
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
@TaskDesc(name = "Completing Client Of Kourend")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.o  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/o.class */
public class o extends Task {
    private final /* synthetic */ SquireQuesterConfig ap;
    private static /* synthetic */ String[] lIIIlIlllllll;
    private static /* synthetic */ int[] lIIIllIIIIIII;

    private int Q() {
        return Static.getClient().getVarbitValue(EnumC0001b.QUEST_CLIENT_OF_KOUREND.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean K() {
        return lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[43]), lIIIllIIIIIII[2]) ? lIIIllIIIIIII[2] : lIIIllIIIIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean I() {
        return lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[41]), lIIIllIIIIIII[2]) ? lIIIllIIIIIII[2] : lIIIllIIIIIII[0];
    }

    private static boolean lIlIIIIlIllIIlI(int i) {
        return i != 0;
    }

    private static void lIlIIIIlIlIllIl() {
        lIIIlIlllllll = new String[lIIIllIIIIIII[11]];
        lIIIlIlllllll[lIIIllIIIIIII[0]] = lIlIIIIlIlIlIlI("2khpX5I4KLA=", "vnEwm");
        lIIIlIlllllll[lIIIllIIIIIII[2]] = lIlIIIIlIlIlIlI("PhCnIYvQdVwaGAKWYP9UAw==", "hEdnN");
        lIIIlIlllllll[lIIIllIIIIIII[7]] = lIlIIIIlIlIlIll("hbEouq1BN+Q=", "nnntD");
        lIIIlIlllllll[lIIIllIIIIIII[8]] = lIlIIIIlIlIlIlI("5ZhbUk9pg+c=", "qlbKy");
        lIIIlIlllllll[lIIIllIIIIIII[9]] = lIlIIIIlIlIllII("BwA8GBUt", "FtHyv");
        lIIIlIlllllll[lIIIllIIIIIII[10]] = lIlIIIIlIlIllII("AhcaDloiGQ==", "Vvvew");
    }

    private void a(int i, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIlIIIIlIllIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        int[] iArr = new int[lIIIllIIIIIII[2]];
        iArr[lIIIllIIIIIII[0]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlIIIIlIllIlII(nearest) && lIlIIIIlIllIIlI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIIlIlllllll[lIIIllIIIIIII[10]]);
            "".length();
            if ((true ^ true) ^ (true ^ true)) {
                return;
            }
            return;
        }
        System.out.println("Walking to NPC: " + i + " at " + String.valueOf(worldPoint));
        Walker.walkTo(worldPoint);
        "".length();
        sleep(lIIIllIIIIIII[7]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    public boolean run() {
        if (lIlIIIIlIlIllll(this.ap.quest().equals(h.CLIENT_OF_KOUREND) ? 1 : 0)) {
            return lIIIllIIIIIII[0];
        }
        int lllllllllllllllIIIIlIlllllIIIIll = Q();
        if (lIlIIIIlIllIIII(lllllllllllllllIIIIlIlllllIIIIll, lIIIllIIIIIII[1])) {
            return lIIIllIIIIIII[0];
        }
        System.out.println("[CLIENT_OF_KOUREND] - Current Progress: " + lllllllllllllllIIIIlIlllllIIIIll);
        switch (lllllllllllllllIIIIlIlllllIIIIll) {
            case 0:
                N();
                P();
                M();
                "".length();
                if ("   ".length() == 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIIIIIII[2];
            case 1:
                L();
                C();
                B();
                E();
                D();
                F();
                P();
                "".length();
                if (" ".length() >= "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIIIIIII[2];
            case 2:
                A();
                P();
                "".length();
                if ("   ".length() < "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIIIIIII[2];
            case 3:
                A();
                "".length();
                if ("   ".length() < "  ".length()) {
                    return ((((108 + 154) - 211) + 169) ^ (((116 + 98) - 164) + 85)) & (((9 ^ 124) ^ (34 ^ 12)) ^ (-" ".length()));
                }
                return lIIIllIIIIIII[2];
            case 4:
                z();
                "".length();
                if ((-" ".length()) >= "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lIIIllIIIIIII[2];
            case 5:
                y();
                P();
                "".length();
                if (0 != 0) {
                    return ((((22 + 113) - 117) + 122) ^ (((65 + 107) - 95) + 61)) & (((46 ^ 88) ^ (177 ^ 193)) ^ (-" ".length()));
                }
                return lIIIllIIIIIII[2];
            case 6:
                P();
                return lIIIllIIIIIII[0];
            default:
                return lIIIllIIIIIII[0];
        }
    }

    private static boolean lIlIIIIlIllIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean J() {
        return lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[42]), lIIIllIIIIIII[2]) ? lIIIllIIIIIII[2] : lIIIllIIIIIII[0];
    }

    private void A() {
        int[] iArr = new int[lIIIllIIIIIII[2]];
        iArr[lIIIllIIIIIII[0]] = lIIIllIIIIIII[14];
        if (lIlIIIIlIllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIIIIII[3];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIIII[4], lIIIllIIIIIII[5], lIIIllIIIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIIII[17]];
        dialogOptionArr[lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArr[lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[12]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIIIIII[13]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[6]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[23]] = DialogOption.PLAYER_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void E() {
        if (lIlIIIIlIlIllll(J() ? 1 : 0) || lIlIIIIlIllIIlI(H() ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIIIIII[33];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIIII[34], lIIIllIIIIIII[35], lIIIllIIIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIIII[18]];
        dialogOptionArr[lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArr[lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[6]] = DialogOption.CHAT_OPTION_THREE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static String lIlIIIIlIlIlIlI(String lllllllllllllllIIIIlIllllIIIIIll, String lllllllllllllllIIIIlIllllIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIllllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIllllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIllllIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIllllIIIIlIl.init(lIIIllIIIIIII[7], lllllllllllllllIIIIlIllllIIIIllI);
            return new String(lllllllllllllllIIIIlIllllIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIllllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIllllIIIIlII) {
            lllllllllllllllIIIIlIllllIIIIlII.printStackTrace();
            return null;
        }
    }

    private void z() {
        int[] iArr = new int[lIIIllIIIIIII[2]];
        iArr[lIIIllIIIIIII[0]] = lIIIllIIIIIII[14];
        if (lIlIIIIlIlIllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        if (!lIlIIIIlIllIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIIII[15], lIIIllIIIIIII[16], lIIIllIIIIIII[0])))) {
            int[] iArr2 = new int[lIIIllIIIIIII[2]];
            iArr2[lIIIllIIIIIII[0]] = lIIIllIIIIIII[14];
            Inventory.getFirst(iArr2).interact(lIIIlIlllllll[lIIIllIIIIIII[2]]);
            return;
        }
        System.out.println(lIIIlIlllllll[lIIIllIIIIIII[0]]);
        Walker.walkTo(new WorldPoint(lIIIllIIIIIII[15], lIIIllIIIIIII[16], lIIIllIIIIIII[0]));
        "".length();
        sleep(lIIIllIIIIIII[10]);
        "".length();
        if ("   ".length() == 0) {
        }
    }

    private void M() {
        int[] iArr = new int[lIIIllIIIIIII[2]];
        iArr[lIIIllIIIIIII[0]] = lIIIllIIIIIII[45];
        if (lIlIIIIlIlIllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIIIIII[3];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIIII[4], lIIIllIIIIIII[5], lIIIllIIIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIIII[6]];
        dialogOptionArr[lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArr[lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[13]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void y() {
        int i = lIIIllIIIIIII[3];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIIII[4], lIIIllIIIIIII[5], lIIIllIIIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIIII[6]];
        dialogOptionArr[lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArr[lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[13]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean H() {
        return lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[40]), lIIIllIIIIIII[2]) ? lIIIllIIIIIII[2] : lIIIllIIIIIII[0];
    }

    private void B() {
        if (lIlIIIIlIlIllll(K() ? 1 : 0) || lIlIIIIlIllIIlI(J() ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIIIIII[24];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIIII[25], lIIIllIIIIIII[26], lIIIllIIIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIIII[18]];
        dialogOptionArr[lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArr[lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[6]] = DialogOption.CHAT_OPTION_THREE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static boolean lIlIIIIlIllIIll(int i, int i2) {
        return i == i2;
    }

    static {
        lIlIIIIlIlIlllI();
        lIlIIIIlIlIllIl();
    }

    private void D() {
        if (lIlIIIIlIlIllll(H() ? 1 : 0) || lIlIIIIlIllIIlI(G() ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIIIIII[30];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIIII[31], lIIIllIIIIIII[32], lIIIllIIIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIIII[18]];
        dialogOptionArr[lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArr[lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[6]] = DialogOption.CHAT_OPTION_THREE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static boolean lIlIIIIlIllIllI(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIIlIlIllII(String lllllllllllllllIIIIlIllllIIlIIll, String lllllllllllllllIIIIlIllllIIlIlll) {
        String lllllllllllllllIIIIlIllllIIlIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIllllIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIlIllllIIlIlIl = lllllllllllllllIIIIlIllllIIlIlll.toCharArray();
        int lllllllllllllllIIIIlIllllIIlIlII = lIIIllIIIIIII[0];
        char[] charArray = lllllllllllllllIIIIlIllllIIlIIll2.toCharArray();
        int length = charArray.length;
        int i = lIIIllIIIIIII[0];
        while (lIlIIIIlIllIllI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIIIlIllllIIlIlIl[lllllllllllllllIIIIlIllllIIlIlII % lllllllllllllllIIIIlIllllIIlIlIl.length]));
            "".length();
            lllllllllllllllIIIIlIllllIIlIlII++;
            i++;
            "".length();
            if ((-" ".length()) > (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private void N() {
        O();
    }

    @Inject
    public o(SquireQuesterConfig squireQuesterConfig) {
        this.ap = squireQuesterConfig;
    }

    private static void lIlIIIIlIlIlllI() {
        lIIIllIIIIIII = new int[49];
        lIIIllIIIIIII[0] = (247 ^ 175) & ((45 ^ 117) ^ (-1));
        lIIIllIIIIIII[1] = 148 ^ 138;
        lIIIllIIIIIII[2] = " ".length();
        lIIIllIIIIIII[3] = (-((-6625) & 24561)) & (-9) & 28671;
        lIIIllIIIIIII[4] = (-((-17922) & 24221)) & (-16453) & 24575;
        lIIIllIIIIIII[5] = (-((-26633) & 27037)) & (-28673) & 32766;
        lIIIllIIIIIII[6] = 3 ^ 10;
        lIIIllIIIIIII[7] = "  ".length();
        lIIIllIIIIIII[8] = "   ".length();
        lIIIllIIIIIII[9] = 41 ^ 45;
        lIIIllIIIIIII[10] = 67 ^ 70;
        lIIIllIIIIIII[11] = (59 ^ 84) ^ (41 ^ 64);
        lIIIllIIIIIII[12] = (110 ^ 114) ^ (49 ^ 42);
        lIIIllIIIIIII[13] = (((61 + 157) - 112) + 55) ^ (((160 + 73) - 154) + 90);
        lIIIllIIIIIII[14] = (-((-20651) & 29947)) & (-2177) & 32733;
        lIIIllIIIIIII[15] = (-((-557) & 21119)) & (-10497) & 32767;
        lIIIllIIIIIII[16] = (-((-10601) & 31230)) & (-8257) & 32767;
        lIIIllIIIIIII[17] = (((97 + 142) - 81) + 14) ^ (((147 + 143) - 209) + 107);
        lIIIllIIIIIII[18] = (((168 + 156) - 239) + 96) ^ (((85 + 121) - 153) + 138);
        lIIIllIIIIIII[19] = (10 ^ 88) ^ (13 ^ 84);
        lIIIllIIIIIII[20] = 134 ^ 138;
        lIIIllIIIIIII[21] = (37 ^ 88) ^ (44 ^ 92);
        lIIIllIIIIIII[22] = (61 ^ 13) ^ (13 ^ 51);
        lIIIllIIIIIII[23] = 127 ^ 112;
        lIIIllIIIIIII[24] = (-((-7951) & 16239)) & (-16385) & 31615;
        lIIIllIIIIIII[25] = (-8193) & 9964;
        lIIIllIIIIIII[26] = (-25018) & 28603;
        lIIIllIIIIIII[27] = (-((-7411) & 16123)) & (-2053) & 11069;
        lIIIllIIIIIII[28] = (-((-387) & 21395)) & (-8193) & 30719;
        lIIIllIIIIIII[29] = (-((-517) & 21375)) & (-129) & 24575;
        lIIIllIIIIIII[30] = (-65) & 7152;
        lIIIllIIIIIII[31] = (-6289) & 7839;
        lIIIllIIIIIII[32] = (-4097) & 7847;
        lIIIllIIIIIII[33] = (-24590) & 31645;
        lIIIllIIIIIII[34] = (-((-549) & 31589)) & (-5) & 32765;
        lIIIllIIIIIII[35] = (-28961) & 32687;
        lIIIllIIIIIII[36] = (-16390) & 23375;
        lIIIllIIIIIII[37] = (-2273) & 4077;
        lIIIllIIIIIII[38] = (-8513) & 12237;
        lIIIllIIIIIII[39] = (-((-22946) & 31659)) & (-2049) & 16383;
        lIIIllIIIIIII[40] = (-25099) & 30719;
        lIIIllIIIIIII[41] = (-16906) & 22525;
        lIIIllIIIIIII[42] = (-18435) & 24058;
        lIIIllIIIIIII[43] = (-26633) & 32255;
        lIIIllIIIIIII[44] = (-8209) & 29468;
        lIIIllIIIIIII[45] = (-27778) & 28091;
        lIIIllIIIIIII[46] = (-11381) & 32639;
        lIIIllIIIIIII[47] = (-12876) & 16107;
        lIIIllIIIIIII[48] = (-13071) & 16366;
    }

    private static boolean lIlIIIIlIllIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIIlIllIIIl(int i) {
        return i > 0;
    }

    private void F() {
        if (lIlIIIIlIlIllll(G() ? 1 : 0) || lIlIIIIlIllIIlI(I() ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIIIIII[36];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIIII[37], lIIIllIIIIIII[38], lIIIllIIIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIIII[6]];
        dialogOptionArr[lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArr[lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[9]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArr[lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[13]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void L() {
        int[] iArr = new int[lIIIllIIIIIII[2]];
        iArr[lIIIllIIIIIII[0]] = lIIIllIIIIIII[44];
        if (lIlIIIIlIllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIIIIII[2]];
        iArr2[lIIIllIIIIIII[0]] = lIIIllIIIIIII[45];
        Item first = Inventory.getFirst(iArr2);
        int[] iArr3 = new int[lIIIllIIIIIII[2]];
        iArr3[lIIIllIIIIIII[0]] = lIIIllIIIIIII[46];
        first.useOn(Inventory.getFirst(iArr3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean G() {
        return lIlIIIIlIllIIll(Static.getClient().getVarbitValue(lIIIllIIIIIII[39]), lIIIllIIIIIII[2]) ? lIIIllIIIIIII[2] : lIIIllIIIIIII[0];
    }

    private void P() {
        if (lIlIIIIlIllIIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            sleep(lIIIllIIIIIII[7]);
        }
    }

    private void C() {
        if (lIlIIIIlIllIIlI(K() ? 1 : 0)) {
            return;
        }
        int i = lIIIllIIIIIII[27];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIIII[28], lIIIllIIIIIII[29], lIIIllIIIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIIII[18]];
        dialogOptionArr[lIIIllIIIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[2]] = DialogOption.CHAT_OPTION_FOUR;
        dialogOptionArr[lIIIllIIIIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIIII[6]] = DialogOption.CHAT_OPTION_THREE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void O() {
        int[] iArr = new int[lIIIllIIIIIII[2]];
        iArr[lIIIllIIIIIII[0]] = lIIIllIIIIIII[45];
        if (lIlIIIIlIllIIlI(Inventory.contains(iArr) ? 1 : 0) || lIlIIIIlIllIlII(Players.getLocal().getInteracting())) {
            return;
        }
        String[] strArr = new String[lIIIllIIIIIII[2]];
        strArr[lIIIllIIIIIII[0]] = lIIIlIlllllll[lIIIllIIIIIII[7]];
        NPC nearest = NPCs.getNearest(strArr);
        int[] iArr2 = new int[lIIIllIIIIIII[2]];
        iArr2[lIIIllIIIIIII[0]] = lIIIllIIIIIII[45];
        TileItem nearest2 = TileItems.getNearest(iArr2);
        if (lIlIIIIlIllIlII(nearest2) && lIlIIIIlIllIIlI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
            nearest2.interact(lIIIlIlllllll[lIIIllIIIIIII[8]]);
        } else if (lIlIIIIlIllIlII(nearest) && lIlIIIIlIllIIlI(Reachable.isInteractable(nearest) ? 1 : 0) && lIlIIIIlIllIlIl(Players.getLocal().getInteracting())) {
            nearest.interact(lIIIlIlllllll[lIIIllIIIIIII[9]]);
        } else {
            Walker.walkTo(new WorldPoint(lIIIllIIIIIII[47], lIIIllIIIIIII[48], lIIIllIIIIIII[0]));
            "".length();
        }
    }

    private static String lIlIIIIlIlIlIll(String lllllllllllllllIIIIlIlllIlllIllI, String lllllllllllllllIIIIlIlllIlllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlllIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlllIlllIlIl.getBytes(StandardCharsets.UTF_8)), lIIIllIIIIIII[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIIIIII[7], lllllllllllllllIIIIlIlllIllllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlllIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlllIlllIlll) {
            lllllllllllllllIIIIlIlllIlllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIlIllIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIIlIlIllll(int i) {
        return i == 0;
    }
}
