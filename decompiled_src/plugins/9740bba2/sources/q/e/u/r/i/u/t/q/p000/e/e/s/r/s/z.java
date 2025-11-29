package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Completing Restless Ghost")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.z  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/z.class */
public class z extends Task {
    private static /* synthetic */ int[] lIIIllIIlIIII;
    private static /* synthetic */ String[] lIIIllIIIllll;
    private final /* synthetic */ TaskManager bw;
    private final /* synthetic */ SquireQuesterConfig bu;
    private final /* synthetic */ Client bt;
    private final /* synthetic */ SquireQuester bv;

    private static boolean lIlIIIIlllIllIl(Object obj) {
        return obj != null;
    }

    private void cq() {
        if (lIlIIIIlllIlIll(Dialog.canContinue() ? 1 : 0) && lIlIIIIlllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr = new String[lIIIllIIlIIII[2]];
            strArr[lIIIllIIlIIII[0]] = lIIIllIIIllll[lIIIllIIlIIII[0]];
            NPC nearest = NPCs.getNearest(strArr);
            if (!lIlIIIIlllIllIl(nearest) || !lIlIIIIlllIlllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIlIIII[4], lIIIllIIlIIII[5], lIIIllIIlIIII[0]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIIIllll[lIIIllIIlIIII[2]]);
            sleepWhile(lIIIllIIlIIII[3], () -> {
                if (lIlIIIIlllIlIll(Dialog.isOpen() ? 1 : 0)) {
                    ?? r0 = lIIIllIIlIIII[2];
                    "".length();
                    return " ".length() == 0 ? ((119 ^ 25) ^ (29 ^ 35)) & (((151 ^ 192) ^ (4 ^ 3)) ^ (-" ".length())) : r0;
                }
                return lIIIllIIlIIII[0];
            });
            "".length();
            if (0 != 0) {
                return;
            }
            return;
        }
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIIII[6]];
        dialogOptionArr[lIIIllIIlIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[2]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[10]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIIII[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[11]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[13]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIIII[3]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[16]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[18]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIIII[19]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[26]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[27]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[29]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[31]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[32]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[33]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[34]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[35]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[36]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[37]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIIII[38]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[39]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[40]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIIII[41]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[42]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[43]] = DialogOption.NPC_CONTINUE;
        Dialog.invokeDialog(dialogOptionArr);
    }

    private static boolean lIlIIIIlllIllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIIlllIllII(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIIIIlllIIllI(String lllllllllllllllIIIIlIlIlllIIIlll, String lllllllllllllllIIIIlIlIlllIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlIlllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIlllIIIllI.getBytes(StandardCharsets.UTF_8)), lIIIllIIlIIII[12]), "DES");
            Cipher lllllllllllllllIIIIlIlIlllIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIlIlllIIlIIl.init(lIIIllIIlIIII[7], lllllllllllllllIIIIlIlIlllIIlIlI);
            return new String(lllllllllllllllIIIIlIlIlllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlIlllIIlIII) {
            lllllllllllllllIIIIlIlIlllIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIlllIlllI(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIlllIlIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    public boolean run() {
        if (lIlIIIIlllIlIll(this.bu.quest().equals(h.RUNE_MYSTERIES) ? 1 : 0)) {
            return lIIIllIIlIIII[0];
        }
        int Q = Q();
        if (lIlIIIIlllIllII(Q, lIIIllIIlIIII[1])) {
            return lIIIllIIlIIII[0];
        }
        System.out.println("Current Progress: " + Q);
        switch (Q) {
            case 0:
                M();
                "".length();
                if (((135 ^ 182) & ((73 ^ 120) ^ (-1))) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 1:
                cs();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 2:
                cs();
                "".length();
                if ("   ".length() == 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 3:
                cr();
                "".length();
                if ((-" ".length()) < (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 4:
            default:
                return lIIIllIIlIIII[0];
            case 5:
                cq();
                "".length();
                if ((-"  ".length()) >= 0) {
                    return ((84 ^ 117) ^ (44 ^ 31)) & (((48 ^ 60) ^ (11 ^ 21)) ^ (-" ".length()));
                }
                break;
        }
        return lIIIllIIlIIII[2];
    }

    private static String lIlIIIIlllIIlll(String lllllllllllllllIIIIlIlIllIlllIlI, String lllllllllllllllIIIIlIlIllIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlIllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllIIlIIII[7], lllllllllllllllIIIIlIlIllIllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlIllIlllIll) {
            lllllllllllllllIIIIlIlIllIlllIll.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp(EnumC0000a.QUEST_RUNE_MYSTERIES.c());
    }

    private static void lIlIIIIlllIlIlI() {
        lIIIllIIlIIII = new int[48];
        lIIIllIIlIIII[0] = (137 ^ 152) & ((43 ^ 58) ^ (-1));
        lIIIllIIlIIII[1] = 189 ^ 187;
        lIIIllIIlIIII[2] = " ".length();
        lIIIllIIlIIII[3] = (((68 + 142) - 202) + 150) ^ (((115 + 119) - 103) + 17);
        lIIIllIIlIIII[4] = (-((-5539) & 13811)) & (-20876) & 32251;
        lIIIllIIlIIII[5] = (-((-4413) & 6590)) & (-20493) & 32239;
        lIIIllIIlIIII[6] = 143 ^ 166;
        lIIIllIIlIIII[7] = "  ".length();
        lIIIllIIlIIII[8] = "   ".length();
        lIIIllIIlIIII[9] = (((134 + 168) - 252) + 125) ^ (((57 + 18) - (-89)) + 7);
        lIIIllIIlIIII[10] = 123 ^ 126;
        lIIIllIIlIIII[11] = (((22 + 161) - 49) + 29) ^ (((123 + 35) - 59) + 65);
        lIIIllIIlIIII[12] = 86 ^ 94;
        lIIIllIIlIIII[13] = 36 ^ 45;
        lIIIllIIlIIII[14] = (39 ^ 76) ^ (75 ^ 43);
        lIIIllIIlIIII[15] = 129 ^ 141;
        lIIIllIIlIIII[16] = 95 ^ 82;
        lIIIllIIlIIII[17] = 23 ^ 25;
        lIIIllIIlIIII[18] = (((6 + 80) - (-32)) + 19) ^ (((113 + 13) - 72) + 80);
        lIIIllIIlIIII[19] = (238 ^ 192) ^ (72 ^ 118);
        lIIIllIIlIIII[20] = 56 ^ 41;
        lIIIllIIlIIII[21] = (((11 + 54) - (-24)) + 43) ^ (((104 + 77) - 167) + 136);
        lIIIllIIlIIII[22] = 29 ^ 14;
        lIIIllIIlIIII[23] = 60 ^ 40;
        lIIIllIIlIIII[24] = 123 ^ 110;
        lIIIllIIlIIII[25] = 23 ^ 1;
        lIIIllIIlIIII[26] = (60 ^ 70) ^ (254 ^ 147);
        lIIIllIIlIIII[27] = (216 ^ 147) ^ (234 ^ 185);
        lIIIllIIlIIII[28] = 51 ^ 42;
        lIIIllIIlIIII[29] = 142 ^ 148;
        lIIIllIIlIIII[30] = 62 ^ 37;
        lIIIllIIlIIII[31] = 89 ^ 69;
        lIIIllIIlIIII[32] = (((7 + 124) - 106) + 136) ^ (((141 + 49) - 155) + 153);
        lIIIllIIlIIII[33] = (((52 + 133) - 181) + 187) ^ (((18 + 49) - 37) + 131);
        lIIIllIIlIIII[34] = 36 ^ 59;
        lIIIllIIlIIII[35] = 30 ^ 62;
        lIIIllIIlIIII[36] = 155 ^ 186;
        lIIIllIIlIIII[37] = "  ".length() ^ (109 ^ 77);
        lIIIllIIlIIII[38] = 179 ^ 144;
        lIIIllIIlIIII[39] = (97 ^ 92) ^ (103 ^ 126);
        lIIIllIIlIIII[40] = 109 ^ 72;
        lIIIllIIlIIII[41] = (9 ^ 1) ^ (32 ^ 14);
        lIIIllIIlIIII[42] = 117 ^ 82;
        lIIIllIIlIIII[43] = 180 ^ 156;
        lIIIllIIlIIII[44] = (-4873) & 8124;
        lIIIllIIlIIII[45] = (-(92 ^ 75)) & (-12289) & 15711;
        lIIIllIIlIIII[46] = (-17173) & 20381;
        lIIIllIIlIIII[47] = (-((-18333) & 26589)) & (-41) & 11519;
    }

    private void M() {
        if (lIlIIIIlllIlIll(Dialog.canContinue() ? 1 : 0) && lIlIIIIlllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr = new String[lIIIllIIlIIII[2]];
            strArr[lIIIllIIlIIII[0]] = lIIIllIIIllll[lIIIllIIlIIII[1]];
            NPC nearest = NPCs.getNearest(strArr);
            if (!lIlIIIIlllIllIl(nearest) || !lIlIIIIlllIlllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIlIIII[46], lIIIllIIlIIII[47], lIIIllIIlIIII[2]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIIIllll[lIIIllIIlIIII[11]]);
            sleepWhile(lIIIllIIlIIII[3], () -> {
                if (lIlIIIIlllIlIll(Dialog.isOpen() ? 1 : 0)) {
                    ?? r0 = lIIIllIIlIIII[2];
                    "".length();
                    return (((((92 + 18) - 102) + 124) ^ (((87 + 60) - 131) + 140)) & (((((200 + 55) - 216) + 184) ^ (((43 + 4) - 1) + 153)) ^ (-" ".length()))) != (((80 ^ 109) ^ (85 ^ 108)) & (((((76 + 143) - 122) + 47) ^ (((46 + 117) - 97) + 82)) ^ (-" ".length()))) ? ((((66 + 95) - 127) + 146) ^ (((64 + 101) - 135) + 98)) & (((37 ^ 67) ^ (241 ^ 163)) ^ (-" ".length())) : r0;
                }
                return lIIIllIIlIIII[0];
            });
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return;
            }
            return;
        }
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIIII[16]];
        dialogOptionArr[lIIIllIIlIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[1]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[13]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIIII[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[15]] = DialogOption.PLAIN_CONTINUE;
        Dialog.invokeDialog(dialogOptionArr);
    }

    private static void lIlIIIIlllIlIIl() {
        lIIIllIIIllll = new String[lIIIllIIlIIII[12]];
        lIIIllIIIllll[lIIIllIIlIIII[0]] = lIlIIIIlllIIllI("2Z2hRLnrwwmVFzUbaesjdfsTEaqCEymf", "ISaer");
        lIIIllIIIllll[lIIIllIIlIIII[2]] = lIlIIIIlllIIllI("e1SYPznm+RA=", "mnFGx");
        lIIIllIIIllll[lIIIllIIlIIII[7]] = lIlIIIIlllIIlll("C0BYwsJmQX8=", "CHfit");
        lIIIllIIIllll[lIIIllIIlIIII[8]] = lIlIIIIlllIlIII("DBM1D0ksHQ==", "XrYdd");
        lIIIllIIIllll[lIIIllIIlIIII[9]] = lIlIIIIlllIIllI("Jdk6tt1Rkj8ypy/E1sy/gjACiCMucN77", "hCPbN");
        lIIIllIIIllll[lIIIllIIlIIII[10]] = lIlIIIIlllIlIII("OCslHmoYJQ==", "lJIuG");
        lIIIllIIIllll[lIIIllIIlIIII[1]] = lIlIIIIlllIlIII("EAQlKUgcHjwtCz0e", "TqNLh");
        lIIIllIIIllll[lIIIllIIlIIII[11]] = lIlIIIIlllIlIII("OzQnP0MbOg==", "oUKTn");
    }

    private void cr() {
        if (lIlIIIIlllIlIll(Dialog.canContinue() ? 1 : 0) && lIlIIIIlllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr = new String[lIIIllIIlIIII[2]];
            strArr[lIIIllIIlIIII[0]] = lIIIllIIIllll[lIIIllIIlIIII[7]];
            NPC nearest = NPCs.getNearest(strArr);
            if (!lIlIIIIlllIllIl(nearest) || !lIlIIIIlllIlllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIlIIII[44], lIIIllIIlIIII[45], lIIIllIIlIIII[0]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIIIllll[lIIIllIIlIIII[8]]);
            sleepWhile(lIIIllIIlIIII[3], () -> {
                if (lIlIIIIlllIlIll(Dialog.isOpen() ? 1 : 0)) {
                    ?? r0 = lIIIllIIlIIII[2];
                    "".length();
                    return (((((98 + 101) - 187) + 132) ^ (((169 + 11) - 8) + 20)) & (((252 ^ 141) ^ (9 ^ 40)) ^ (-" ".length()))) == "   ".length() ? ("   ".length() ^ (18 ^ 62)) & (((204 ^ 171) ^ (90 ^ 18)) ^ (-" ".length())) : r0;
                }
                return lIIIllIIlIIII[0];
            });
            "".length();
            if ((151 ^ 147) < (97 ^ 101)) {
                return;
            }
            return;
        }
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIIII[19]];
        dialogOptionArr[lIIIllIIlIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArr[lIIIllIIlIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[1]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[12]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[3]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[18]] = DialogOption.QUEST;
        Dialog.invokeDialog(dialogOptionArr);
    }

    @Inject
    public z(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.bt = client;
        this.bu = squireQuesterConfig;
        this.bv = squireQuester;
        this.bw = taskManager;
    }

    private static String lIlIIIIlllIlIII(String lllllllllllllllIIIIlIlIllIlIlIlI, String lllllllllllllllIIIIlIlIllIlIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIlIllIlIlIII = new StringBuilder();
        char[] lllllllllllllllIIIIlIlIllIlIIlll = lllllllllllllllIIIIlIlIllIlIlIIl.toCharArray();
        int lllllllllllllllIIIIlIlIllIlIIllI = lIIIllIIlIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIllIIlIIII[0];
        while (lIlIIIIlllIllll(i, length)) {
            lllllllllllllllIIIIlIlIllIlIlIII.append((char) (charArray[i] ^ lllllllllllllllIIIIlIlIllIlIIlll[lllllllllllllllIIIIlIlIllIlIIllI % lllllllllllllllIIIIlIlIllIlIIlll.length]));
            "".length();
            lllllllllllllllIIIIlIlIllIlIIllI++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIlIllIlIlIII);
    }

    private void cs() {
        if (lIlIIIIlllIlIll(Dialog.canContinue() ? 1 : 0) && lIlIIIIlllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr = new String[lIIIllIIlIIII[2]];
            strArr[lIIIllIIlIIII[0]] = lIIIllIIIllll[lIIIllIIlIIII[9]];
            NPC nearest = NPCs.getNearest(strArr);
            if (!lIlIIIIlllIllIl(nearest) || !lIlIIIIlllIlllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIIlIIII[4], lIIIllIIlIIII[5], lIIIllIIlIIII[0]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIIIllll[lIIIllIIlIIII[10]]);
            sleepWhile(lIIIllIIlIIII[3], () -> {
                if (lIlIIIIlllIlIll(Dialog.isOpen() ? 1 : 0)) {
                    ?? r0 = lIIIllIIlIIII[2];
                    "".length();
                    return 0 != 0 ? ((30 ^ 100) ^ (201 ^ 154)) & (((((103 + 32) - 123) + 138) ^ (((50 + 73) - 77) + 145)) ^ (-" ".length())) : r0;
                }
                return lIIIllIIlIIII[0];
            });
            "".length();
            if (((" ".length() ^ (179 ^ 180)) & (((((11 + 179) - 37) + 36) ^ (((126 + 22) - 116) + 155)) ^ (-" ".length()))) != 0) {
                return;
            }
            return;
        }
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIlIIII[6]];
        dialogOptionArr[lIIIllIIlIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[2]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[10]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIIII[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[11]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[13]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIIII[3]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[16]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[18]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIIII[19]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[26]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[27]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[29]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[31]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[32]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[33]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[34]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[35]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[36]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[37]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIlIIII[38]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[39]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[40]] = DialogOption.QUEST;
        dialogOptionArr[lIIIllIIlIIII[41]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[42]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIlIIII[43]] = DialogOption.NPC_CONTINUE;
        Dialog.invokeDialog(dialogOptionArr);
    }

    static {
        lIlIIIIlllIlIlI();
        lIlIIIIlllIlIIl();
    }
}
