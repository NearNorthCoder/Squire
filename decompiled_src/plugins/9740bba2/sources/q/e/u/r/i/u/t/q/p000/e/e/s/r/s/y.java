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
@TaskDesc(name = "Completing Romeo And Juliet")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.y  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/y.class */
public class y extends Task {
    private static /* synthetic */ int[] lIIIllIlIllll;
    private static /* synthetic */ String[] lIIIllIlIlllI;
    private final /* synthetic */ SquireQuesterConfig bs;

    private void bx() {
        int[] iArr = new int[lIIIllIlIllll[2]];
        iArr[lIIIllIlIllll[0]] = lIIIllIlIllll[35];
        if (lIlIIIlIlllIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlIllll[2]];
        iArr2[lIIIllIlIllll[0]] = lIIIllIlIllll[35];
        TileItem nearest = TileItems.getNearest(iArr2);
        if (!lIlIIIlIlllIllI(nearest)) {
            Walker.walkTo(new WorldPoint(lIIIllIlIllll[42], lIIIllIlIllll[43], lIIIllIlIllll[2]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIlIlllI[lIIIllIlIllll[10]]);
        "".length();
        if ("  ".length() > (70 ^ 66)) {
        }
    }

    private void cp() {
        int[] iArr = new int[lIIIllIlIllll[2]];
        iArr[lIIIllIlIllll[0]] = lIIIllIlIllll[35];
        if (lIlIIIlIlllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIlIllll[44];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIllll[45], lIIIllIlIllll[46], lIIIllIlIllll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIllll[15]];
        dialogOptionArr[lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArr[lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[14]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void P() {
        if (lIlIIIlIlllIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void ck() {
        int i = lIIIllIlIllll[23];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIllll[24], lIIIllIlIllll[25], lIIIllIlIllll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArr[lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArr[lIIIllIlIllll[7]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[15]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[19]] = DialogOption.PLAYER_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static String lIlIIIlIllIlllI(String lllllllllllllllIIIIlIIIlIllIIlll, String lllllllllllllllIIIIlIIIlIllIIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIlIIIlIllIIlII = lllllllllllllllIIIIlIIIlIllIIllI.toCharArray();
        int lllllllllllllllIIIIlIIIlIllIIIll = lIIIllIlIllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIllIlIllll[0];
        while (lIlIIIlIllllIII(i, length)) {
            char lllllllllllllllIIIIlIIIlIllIlIII = charArray[i];
            sb.append((char) (lllllllllllllllIIIIlIIIlIllIlIII ^ lllllllllllllllIIIIlIIIlIllIIlII[lllllllllllllllIIIIlIIIlIllIIIll % lllllllllllllllIIIIlIIIlIllIIlII.length]));
            "".length();
            lllllllllllllllIIIIlIIIlIllIIIll++;
            i++;
            "".length();
            if ("   ".length() >= ((123 ^ 8) ^ (240 ^ 135))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private void cj() {
        int i = lIIIllIlIllll[20];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIllll[21], lIIIllIlIllll[22], lIIIllIlIllll[2]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArr[lIIIllIlIllll[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[12]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[16]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static boolean lIlIIIlIlllIlII(int i) {
        return i != 0;
    }

    private static boolean lIlIIIlIlllIlll(int i) {
        return i > 0;
    }

    private void cm() {
        int i = lIIIllIlIllll[3];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIllll[4], lIIIllIlIllll[5], lIIIllIlIllll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArr[lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_FOUR;
        a(i, worldPoint, dialogOptionArr);
    }

    private static boolean lIlIIIlIllllIII(int i, int i2) {
        return i < i2;
    }

    private void M() {
        int[] iArr = new int[lIIIllIlIllll[2]];
        iArr[lIIIllIlIllll[0]] = lIIIllIlIllll[29];
        if (lIlIIIlIlllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIlIllll[3];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIllll[4], lIIIllIlIllll[5], lIIIllIlIllll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArr[lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    static {
        lIlIIIlIlllIIIl();
        lIlIIIlIlllIIII();
    }

    private static void lIlIIIlIlllIIIl() {
        lIIIllIlIllll = new int[47];
        lIIIllIlIllll[0] = (27 ^ 4) & ((109 ^ 114) ^ (-1));
        lIIIllIlIllll[1] = 102 ^ 30;
        lIIIllIlIllll[2] = " ".length();
        lIIIllIlIllll[3] = (-19537) & 24573;
        lIIIllIlIllll[4] = (-((-17797) & 30615)) & (-16641) & 32671;
        lIIIllIlIllll[5] = (-(((140 + 26) - 47) + 42)) & (-513) & 4095;
        lIIIllIlIllll[6] = (26 ^ 64) ^ (5 ^ 80);
        lIIIllIlIllll[7] = "  ".length();
        lIIIllIlIllll[8] = "   ".length();
        lIIIllIlIllll[9] = 122 ^ 126;
        lIIIllIlIllll[10] = 28 ^ 25;
        lIIIllIlIllll[11] = (106 ^ 76) ^ (165 ^ 133);
        lIIIllIlIllll[12] = (107 ^ 90) ^ (167 ^ 145);
        lIIIllIlIllll[13] = (((27 + 124) - 40) + 27) ^ (((36 + 77) - 82) + 99);
        lIIIllIlIllll[14] = (178 ^ 138) ^ (60 ^ 13);
        lIIIllIlIllll[15] = 133 ^ 143;
        lIIIllIlIllll[16] = 154 ^ 145;
        lIIIllIlIllll[17] = (((107 + 45) - 70) + 93) ^ (((123 + 155) - 131) + 16);
        lIIIllIlIllll[18] = 3 ^ 14;
        lIIIllIlIllll[19] = (((120 + 103) - 117) + 59) ^ (((119 + 167) - 196) + 81);
        lIIIllIlIllll[20] = (-((-24937) & 27005)) & (-8193) & 15295;
        lIIIllIlIllll[21] = (-8491) & 11647;
        lIIIllIlIllll[22] = (-12301) & 15725;
        lIIIllIlIllll[23] = (-((-17153) & 26451)) & (-18434) & 32767;
        lIIIllIlIllll[24] = (-((-3199) & 32767)) & (-1) & 32763;
        lIIIllIlIllll[25] = (-((-6357) & 31447)) & (-145) & 28638;
        lIIIllIlIllll[26] = (-1089) & 6126;
        lIIIllIlIllll[27] = (-((-2149) & 31589)) & (-65) & 32758;
        lIIIllIlIllll[28] = (-((-27667) & 31867)) & (-25089) & 32767;
        lIIIllIlIllll[29] = (-21517) & 22269;
        lIIIllIlIllll[30] = (-((-2061) & 11199)) & (-5) & 32767;
        lIIIllIlIllll[31] = (-28689) & 31964;
        lIIIllIlIllll[32] = (-(((23 + 82) - 11) + 35)) & (-4673) & 8172;
        lIIIllIlIllll[33] = (-((-4886) & 21439)) & (-12817) & 32447;
        lIIIllIlIllll[34] = (-((-3441) & 28529)) & (-69) & 28415;
        lIIIllIlIllll[35] = (-12354) & 13305;
        lIIIllIlIllll[36] = (-((-1089) & 26329)) & (-1) & 28349;
        lIIIllIlIllll[37] = (-29233) & 32496;
        lIIIllIlIllll[38] = (-((-19649) & 32725)) & (-1) & 16279;
        lIIIllIlIllll[39] = (-29460) & 32671;
        lIIIllIlIllll[40] = (-16994) & 20223;
        lIIIllIlIllll[41] = (-((-14345) & 31597)) & (-8211) & 28671;
        lIIIllIlIllll[42] = (-((-3089) & 23679)) & (-8194) & 31999;
        lIIIllIlIllll[43] = (-((-8467) & 29499)) & (-8325) & 32767;
        lIIIllIlIllll[44] = (-((-261) & 8031)) & (-16385) & 32638;
        lIIIllIlIllll[45] = (-((-79) & 21071)) & (-8227) & 32447;
        lIIIllIlIllll[46] = (-((-1185) & 30693)) & (-1) & 32749;
    }

    private static String lIlIIIlIllIllll(String lllllllllllllllIIIIlIIIlIlIlIIII, String lllllllllllllllIIIIlIIIlIlIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIlIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIIllIlIllll[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIlIllll[7], lllllllllllllllIIIIlIIIlIlIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIIlIlIlIIll) {
            lllllllllllllllIIIIlIIIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp(EnumC0000a.QUEST_ROMEO_AND_JULIET.c());
    }

    private void bv() {
        if (!lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[38], lIIIllIlIllll[39], lIIIllIlIllll[0])))) {
            int[] iArr = new int[lIIIllIlIllll[2]];
            iArr[lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst(iArr).interact(lIIIllIlIlllI[lIIIllIlIllll[8]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIlIllll[38], lIIIllIlIllll[39], lIIIllIlIllll[0]));
        "".length();
        "".length();
        if ((181 ^ 177) <= 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    public boolean run() {
        if (lIlIIIlIlllIIlI(this.bs.quest().equals(h.ROMEO_AND_JULIET) ? 1 : 0)) {
            return lIIIllIlIllll[0];
        }
        int Q = Q();
        if (lIlIIIlIlllIIll(Q, lIIIllIlIllll[1])) {
            return lIIIllIlIllll[0];
        }
        System.out.println("[ROMEO_AND_JULIET] - Current Progress: " + Q);
        switch (Q) {
            case 0:
                co();
                M();
                "".length();
                if (" ".length() == 0) {
                    return ((((10 + 22) - (-14)) + 108) ^ (((77 + 116) - 76) + 41)) & (((((69 + 8) - 35) + 103) ^ (((95 + 114) - 194) + 134)) ^ (-" ".length()));
                }
                break;
            case 7:
                P();
                "".length();
                if (" ".length() > "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 10:
                cn();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 20:
                P();
                cm();
                "".length();
                if ((-(11 ^ 14)) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 30:
                cl();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 40:
                ck();
                "".length();
                if ((-(131 ^ 134)) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 50:
                cj();
                "".length();
                if ((-"   ".length()) > 0) {
                    return ((11 ^ 77) ^ (229 ^ 180)) & (((16 ^ 26) ^ (142 ^ 147)) ^ (-" ".length()));
                }
                break;
            case 60:
                Y();
                "".length();
                if (((176 ^ 135) & ((174 ^ 153) ^ (-1))) >= (99 ^ 103)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            default:
                return lIIIllIlIllll[0];
        }
        return lIIIllIlIllll[2];
    }

    private void Y() {
        int i = lIIIllIlIllll[3];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIllll[4], lIIIllIlIllll[5], lIIIllIlIllll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArr[lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    @Inject
    public y(SquireQuesterConfig squireQuesterConfig) {
        this.bs = squireQuesterConfig;
    }

    private void bw() {
        if (!lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[40], lIIIllIlIllll[41], lIIIllIlIllll[0])))) {
            int[] iArr = new int[lIIIllIlIllll[2]];
            iArr[lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst(iArr).interact(lIIIllIlIlllI[lIIIllIlIllll[9]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIlIllll[40], lIIIllIlIllll[41], lIIIllIlIllll[0]));
        "".length();
        "".length();
        if (0 != 0) {
        }
    }

    private void bu() {
        if (!lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[36], lIIIllIlIllll[37], lIIIllIlIllll[0])))) {
            int[] iArr = new int[lIIIllIlIllll[2]];
            iArr[lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst(iArr).interact(lIIIllIlIlllI[lIIIllIlIllll[7]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIlIllll[36], lIIIllIlIllll[37], lIIIllIlIllll[0]));
        "".length();
        "".length();
        if ((-"   ".length()) > 0) {
        }
    }

    private static boolean lIlIIIlIlllIIlI(int i) {
        return i == 0;
    }

    private void a(int i, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIlIIIlIlllIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        int[] iArr = new int[lIIIllIlIllll[2]];
        iArr[lIIIllIlIllll[0]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIlIlllIllI(nearest) || !lIlIIIlIlllIlII(Reachable.isInteractable(nearest) ? 1 : 0)) {
            System.out.println(lIIIllIlIlllI[lIIIllIlIllll[12]]);
            Walker.walkTo(worldPoint);
            "".length();
            return;
        }
        nearest.interact(lIIIllIlIlllI[lIIIllIlIllll[11]]);
        "".length();
        if ("  ".length() < 0) {
        }
    }

    private void co() {
        int[] iArr = new int[lIIIllIlIllll[2]];
        iArr[lIIIllIlIllll[0]] = lIIIllIlIllll[29];
        if (lIlIIIlIlllIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlIllll[2]];
        iArr2[lIIIllIlIllll[0]] = lIIIllIlIllll[30];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIlIlllIllI(nearest) || !lIlIIIlIlllIlII(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIlIllll[31], lIIIllIlIllll[32], lIIIllIlIllll[0]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIlIlllI[lIIIllIlIllll[0]]);
        "".length();
        if ((((6 ^ 53) ^ (159 ^ 180)) & (((((73 + 131) - 114) + 56) ^ (((56 + 5) - (-77)) + 0)) ^ (-" ".length()))) > "  ".length()) {
        }
    }

    private static boolean lIlIIIlIlllIlIl(Object obj) {
        return obj == null;
    }

    private static void lIlIIIlIlllIIII() {
        lIIIllIlIlllI = new String[lIIIllIlIllll[13]];
        lIIIllIlIlllI[lIIIllIlIllll[0]] = lIlIIIlIllIlllI("Nh8KBEIABAYC", "fvioo");
        lIIIllIlIlllI[lIIIllIlIllll[2]] = lIlIIIlIllIllll("J98m0zCTAKo=", "jGIXo");
        lIIIllIlIlllI[lIIIllIlIllll[7]] = lIlIIIlIllIllll("tKwHuenc0zc=", "vXBLH");
        lIIIllIlIlllI[lIIIllIlIllll[8]] = lIlIIIlIllIllll("oIYXr9b9iYY=", "sBWlt");
        lIIIllIlIlllI[lIIIllIlIllll[9]] = lIlIIIlIllIllll("4grpMEGPhTY=", "dYoSw");
        lIIIllIlIlllI[lIIIllIlIllll[10]] = lIlIIIlIllIlllI("GiggKg==", "NIKOw");
        lIIIllIlIlllI[lIIIllIlIllll[11]] = lIlIIIlIllIlllI("GDQuGWs4Og==", "LUBrF");
        lIIIllIlIlllI[lIIIllIlIllll[12]] = lIlIIIlIllIllll("HGUL6PLnc073l3qgXcczkg==", "pbWFg");
    }

    private void cn() {
        int[] iArr = new int[lIIIllIlIllll[2]];
        iArr[lIIIllIlIllll[0]] = lIIIllIlIllll[20];
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlIIIlIlllIlII(Dialog.isOpen() ? 1 : 0) && lIlIIIlIlllIlIl(nearest)) {
            Walker.walkTo(new WorldPoint(lIIIllIlIllll[21], lIIIllIlIllll[22], lIIIllIlIllll[2]));
            "".length();
        }
        int i = lIIIllIlIllll[20];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIllll[21], lIIIllIlIllll[22], lIIIllIlIllll[2]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArr[lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[19]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private static boolean lIlIIIlIlllIIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIlIlllIllI(Object obj) {
        return obj != null;
    }

    private void cl() {
        int i = lIIIllIlIllll[26];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIllll[27], lIIIllIlIllll[28], lIIIllIlIllll[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIllll[6]];
        dialogOptionArr[lIIIllIlIllll[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[13]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[15]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIllll[19]] = DialogOption.PLAYER_CONTINUE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void bt() {
        if (!lIlIIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIlIllll[33], lIIIllIlIllll[34], lIIIllIlIllll[0])))) {
            int[] iArr = new int[lIIIllIlIllll[2]];
            iArr[lIIIllIlIllll[0]] = lIIIllIlIllll[35];
            Inventory.getFirst(iArr).interact(lIIIllIlIlllI[lIIIllIlIllll[2]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIlIllll[33], lIIIllIlIllll[34], lIIIllIlIllll[0]));
        "".length();
        "".length();
        if ((-((((20 + 74) - 46) + 130) ^ (((1 + 78) - 62) + 166))) >= 0) {
        }
    }
}
