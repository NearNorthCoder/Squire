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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Completing Restless Ghost")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.x  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/x.class */
public class x extends Task {
    private final /* synthetic */ Client bo;
    private final /* synthetic */ SquireQuester bq;
    private static /* synthetic */ int[] lIIIllIllIIIl;
    private final /* synthetic */ TaskManager br;
    private final /* synthetic */ SquireQuesterConfig bp;
    private static /* synthetic */ String[] lIIIllIllIIII;

    private static String lIlIIIlIllllIIl(String lllllllllllllllIIIIlIIIlIIIIIlIl, String lllllllllllllllIIIIlIIIlIIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIIIllIllIIIl[13]), "DES");
            Cipher lllllllllllllllIIIIlIIIlIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIIlIIIIlIIl.init(lIIIllIllIIIl[3], secretKeySpec);
            return new String(lllllllllllllllIIIIlIIIlIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIIlIIIIlIII) {
            lllllllllllllllIIIIlIIIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIIIIIlI(Object obj) {
        return obj == null;
    }

    @Inject
    public x(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.bo = client;
        this.bp = squireQuesterConfig;
        this.bq = squireQuester;
        this.br = taskManager;
    }

    private void ch() {
        if (lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr = new String[lIIIllIllIIIl[2]];
            strArr[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[21]];
            NPC nearest = NPCs.getNearest(strArr);
            if (!lIlIIIllIIIIIII(nearest) || !lIlIIIllIIIIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIllIIIl[23], lIIIllIllIIIl[24], lIIIllIllIIIl[0]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIllIIII[lIIIllIllIIIl[19]]);
            sleepWhile(lIIIllIllIIIl[15], () -> {
                if (lIlIIIlIllllllI(Dialog.isOpen() ? 1 : 0)) {
                    ?? r0 = lIIIllIllIIIl[2];
                    "".length();
                    return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIllIllIIIl[0];
            });
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return;
            }
            return;
        }
        System.out.println(lIIIllIllIIII[lIIIllIllIIIl[25]]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIllIIIl[19]];
        dialogOptionArr[lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArr[lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIllIIIl[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[16]] = DialogOption.PLAIN_CONTINUE_TWO;
        dialogOptionArr[lIIIllIllIIIl[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[21]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog(dialogOptionArr);
    }

    private static void lIlIIIlIlllllII() {
        lIIIllIllIIII = new String[lIIIllIllIIIl[31]];
        lIIIllIllIIII[lIIIllIllIIIl[0]] = lIlIIIlIllllIIl("PbiXXMIWyFw=", "hTfXz");
        lIIIllIllIIII[lIIIllIllIIIl[2]] = lIlIIIlIllllIIl("Og2PsIIQj8M=", "GWNXh");
        lIIIllIllIIII[lIIIllIllIIIl[3]] = lIlIIIlIllllIIl("i/Apud1zzY4=", "jlULI");
        lIIIllIllIIII[lIIIllIllIIIl[4]] = lIlIIIlIllllIlI("HAc1FSYn", "ObTgE");
        lIIIllIllIIII[lIIIllIllIIIl[5]] = lIlIIIlIllllIll("e/WsClsW2v1b6U0+3nZ0QQ==", "AUQIz");
        lIIIllIllIIII[lIIIllIllIIIl[1]] = lIlIIIlIllllIll("Cw31qpdAPBE=", "XXwjt");
        lIIIllIllIIII[lIIIllIllIIIl[11]] = lIlIIIlIllllIIl("kWTvjUPdwCY=", "XmRjb");
        lIIIllIllIIII[lIIIllIllIIIl[12]] = lIlIIIlIllllIlI("JQ4BFyQI", "fagqM");
        lIIIllIllIIII[lIIIllIllIIIl[13]] = lIlIIIlIllllIll("V4EYv8EdCW+qvnilHS03EA==", "qHxdA");
        lIIIllIllIIII[lIIIllIllIIIl[14]] = lIlIIIlIllllIIl("YZnM/930364=", "naXIQ");
        lIIIllIllIIII[lIIIllIllIIIl[15]] = lIlIIIlIllllIlI("KyERDw==", "dQtaj");
        lIIIllIllIIII[lIIIllIllIIIl[16]] = lIlIIIlIllllIlI("IDQsNg0b", "sQMDn");
        lIIIllIllIIII[lIIIllIllIIIl[17]] = lIlIIIlIllllIll("Ez8CDHdKk0g=", "yjByA");
        lIIIllIllIIII[lIIIllIllIIIl[18]] = lIlIIIlIllllIlI("JTUbA2AFOw==", "qTwhM");
        lIIIllIllIIII[lIIIllIllIIIl[20]] = lIlIIIlIllllIlI("BDYXBg==", "SSvtk");
        lIIIllIllIIII[lIIIllIllIIIl[21]] = lIlIIIlIllllIIl("GxKN31z7DNjIErk7p2MIwA==", "fjcwK");
        lIIIllIllIIII[lIIIllIllIIIl[19]] = lIlIIIlIllllIlI("IjMlGn8CPQ==", "vRIqR");
        lIIIllIllIIII[lIIIllIllIIIl[25]] = lIlIIIlIllllIll("se9eeSowwx0926HfTiJyPA==", "ztdxO");
        lIIIllIllIIII[lIIIllIllIIIl[26]] = lIlIIIlIllllIll("/qZT37qhe7MR9UQ2rU2/3g==", "CUlVZ");
        lIIIllIllIIII[lIIIllIllIIIl[27]] = lIlIIIlIllllIll("cyOwetYCkq4=", "HdbyM");
        lIIIllIllIIII[lIIIllIllIIIl[30]] = lIlIIIlIllllIll("3SB2fFFFqjeFW/XHza25Cw==", "WvGnt");
    }

    private void cg() {
        int[] iArr = new int[lIIIllIllIIIl[2]];
        iArr[lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
        if (lIlIIIllIIIIIIl(Equipment.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIllIIIl[2]];
        iArr2[lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
        if (lIlIIIllIIIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIllIIIl[2]];
            iArr3[lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
            Inventory.getFirst(iArr3).interact(lIIIllIllIIII[lIIIllIllIIIl[20]]);
        }
    }

    private static void lIlIIIlIlllllIl() {
        lIIIllIllIIIl = new int[32];
        lIIIllIllIIIl[0] = (68 ^ 126) & ((129 ^ 187) ^ (-1));
        lIIIllIllIIIl[1] = (((26 + 42) - (-37)) + 89) ^ (((116 + 197) - 145) + 31);
        lIIIllIllIIIl[2] = " ".length();
        lIIIllIllIIIl[3] = "  ".length();
        lIIIllIllIIIl[4] = "   ".length();
        lIIIllIllIIIl[5] = (60 ^ 114) ^ (201 ^ 131);
        lIIIllIllIIIl[6] = (-29191) & 32439;
        lIIIllIllIIIl[7] = (-((-1225) & 30669)) & (-129) & 32765;
        lIIIllIllIIIl[8] = (-((-20565) & 29405)) & (-259) & 12218;
        lIIIllIllIIIl[9] = (-((-10557) & 31166)) & (-33) & 30207;
        lIIIllIllIIIl[10] = (-16593) & 19711;
        lIIIllIllIIIl[11] = (99 ^ 76) ^ (107 ^ 66);
        lIIIllIllIIIl[12] = (124 ^ 117) ^ (162 ^ 172);
        lIIIllIllIIIl[13] = (38 ^ 104) ^ (43 ^ 109);
        lIIIllIllIIIl[14] = 29 ^ 20;
        lIIIllIllIIIl[15] = (254 ^ 142) ^ (208 ^ 170);
        lIIIllIllIIIl[16] = (((55 + 69) - 41) + 84) ^ (((2 + 141) - 63) + 92);
        lIIIllIllIIIl[17] = 186 ^ 182;
        lIIIllIllIIIl[18] = 122 ^ 119;
        lIIIllIllIIIl[19] = (82 ^ 71) ^ (192 ^ 197);
        lIIIllIllIIIl[20] = (((89 + 107) - 115) + 69) ^ (((112 + 146) - 192) + 86);
        lIIIllIllIIIl[21] = 121 ^ 118;
        lIIIllIllIIIl[22] = (-((-8711) & 26567)) & (-14356) & 32763;
        lIIIllIllIIIl[23] = (-((-26965) & 31573)) & (-8241) & 15995;
        lIIIllIllIIIl[24] = (-((-17447) & 26295)) & (-16641) & 28663;
        lIIIllIllIIIl[25] = 113 ^ 96;
        lIIIllIllIIIl[26] = 92 ^ 78;
        lIIIllIllIIIl[27] = 74 ^ 89;
        lIIIllIllIIIl[28] = (-((-1065) & 13691)) & (-2) & 15871;
        lIIIllIllIIIl[29] = (-((-2833) & 15185)) & (-50) & 15607;
        lIIIllIllIIIl[30] = 66 ^ 86;
        lIIIllIllIIIl[31] = 147 ^ 134;
    }

    private static boolean lIlIIIlIlllllll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIllIIIIIll(int i, int i2) {
        return i < i2;
    }

    private void M() {
        if (lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr = new String[lIIIllIllIIIl[2]];
            strArr[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[26]];
            NPC nearest = NPCs.getNearest(strArr);
            if (!lIlIIIllIIIIIII(nearest) || !lIlIIIllIIIIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Walker.walkTo(new WorldPoint(lIIIllIllIIIl[28], lIIIllIllIIIl[29], lIIIllIllIIIl[0]));
                "".length();
                return;
            }
            nearest.interact(lIIIllIllIIII[lIIIllIllIIIl[27]]);
            sleepWhile(lIIIllIllIIIl[15], () -> {
                if (lIlIIIlIllllllI(Dialog.isOpen() ? 1 : 0)) {
                    ?? r0 = lIIIllIllIIIl[2];
                    "".length();
                    return !((true ^ true) ^ (true ^ true)) ? ((135 ^ 147) ^ (14 ^ 39)) & (((73 ^ 40) ^ (254 ^ 162)) ^ (-" ".length())) : r0;
                }
                return lIIIllIllIIIl[0];
            });
            "".length();
            if ((-" ".length()) > 0) {
                return;
            }
            return;
        }
        System.out.println(lIIIllIllIIII[lIIIllIllIIIl[30]]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIllIIIl[21]];
        dialogOptionArr[lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArr[lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[5]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[1]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIllIIIl[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIllIIIl[20]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog(dialogOptionArr);
    }

    private static String lIlIIIlIllllIll(String lllllllllllllllIIIIlIIIIlllllIlI, String lllllllllllllllIIIIlIIIIlllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIIIIllllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIIIIllllllII.init(lIIIllIllIIIl[3], secretKeySpec);
            return new String(lllllllllllllllIIIIlIIIIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIIIlllllIll) {
            lllllllllllllllIIIIlIIIIlllllIll.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIIlIlllllIl();
        lIlIIIlIlllllII();
    }

    private static boolean lIlIIIllIIIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIllIIIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIlIllllllI(int i) {
        return i == 0;
    }

    private static String lIlIIIlIllllIlI(String lllllllllllllllIIIIlIIIlIIIlllII, String lllllllllllllllIIIIlIIIlIIIllIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIIlIIIllIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlIIIlIIIllIll.toCharArray();
        int lllllllllllllllIIIIlIIIlIIIllIII = lIIIllIllIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIllIIIl[0];
        while (lIlIIIllIIIIIll(i, length)) {
            char lllllllllllllllIIIIlIIIlIIIlllIl = charArray2[i];
            lllllllllllllllIIIIlIIIlIIIllIlI.append((char) (lllllllllllllllIIIIlIIIlIIIlllIl ^ charArray[lllllllllllllllIIIIlIIIlIIIllIII % charArray.length]));
            "".length();
            lllllllllllllllIIIIlIIIlIIIllIII++;
            i++;
            "".length();
            if ((-((179 ^ 185) ^ (87 ^ 89))) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIIIlIIIllIlI);
    }

    private void cd() {
        String[] strArr = new String[lIIIllIllIIIl[2]];
        strArr[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (!lIlIIIllIIIIIII(nearest) || !lIlIIIllIIIIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIllIIIl[6], lIIIllIllIIIl[7], lIIIllIllIIIl[0]));
            "".length();
        } else if (lIlIIIlIllllllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(nearest.getWorldLocation());
            "".length();
        } else {
            String[] strArr2 = new String[lIIIllIllIIIl[2]];
            strArr2[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[2]];
            if (lIlIIIllIIIIIIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                nearest.interact(lIIIllIllIIII[lIIIllIllIIIl[3]]);
            }
            String[] strArr3 = new String[lIIIllIllIIIl[2]];
            strArr3[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[4]];
            if (lIlIIIllIIIIIIl(nearest.hasAction(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[lIIIllIllIIIl[2]];
                strArr4[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[5]];
                Inventory.getFirst(strArr4).useOn(nearest);
                "".length();
                if ((-"   ".length()) >= 0) {
                }
            }
        }
    }

    private void cf() {
        String[] strArr = new String[lIIIllIllIIIl[2]];
        strArr[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[12]];
        TileObject nearest = TileObjects.getNearest(strArr);
        String[] strArr2 = new String[lIIIllIllIIIl[2]];
        strArr2[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[13]];
        NPC nearest2 = NPCs.getNearest(strArr2);
        if (!lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) || !lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            DialogOption[] dialogOptionArr = new DialogOption[lIIIllIllIIIl[19]];
            dialogOptionArr[lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArr[lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[5]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lIIIllIllIIIl[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[11]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[16]] = DialogOption.PLAIN_CONTINUE_TWO;
            dialogOptionArr[lIIIllIllIIIl[17]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[20]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIIIllIllIIIl[21]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        if (lIlIIIllIIIIIII(nearest) && lIlIIIllIIIIIlI(nearest2) && lIlIIIllIIIIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            String[] strArr3 = new String[lIIIllIllIIIl[2]];
            strArr3[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[14]];
            if (lIlIIIllIIIIIIl(nearest.hasAction(strArr3) ? 1 : 0)) {
                nearest.interact(lIIIllIllIIII[lIIIllIllIIIl[15]]);
                return;
            }
            String[] strArr4 = new String[lIIIllIllIIIl[2]];
            strArr4[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[16]];
            if (lIlIIIllIIIIIIl(nearest.hasAction(strArr4) ? 1 : 0)) {
                nearest.interact(lIIIllIllIIII[lIIIllIllIIIl[17]]);
                return;
            }
        } else {
            Walker.walkTo(new WorldPoint(lIIIllIllIIIl[6], lIIIllIllIIIl[7], lIIIllIllIIIl[0]));
            "".length();
        }
        if (lIlIIIllIIIIIII(nearest2)) {
            if (!lIlIIIllIIIIIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                Walker.walkTo(nearest2.getWorldLocation());
                "".length();
                return;
            }
            nearest2.interact(lIIIllIllIIII[lIIIllIllIIIl[18]]);
            "".length();
            if (0 != 0) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    public boolean run() {
        if (lIlIIIlIllllllI(this.bp.quest().equals(h.RESTLESS_GHOST) ? 1 : 0)) {
            return lIIIllIllIIIl[0];
        }
        int Q = Q();
        if (lIlIIIlIlllllll(Q, lIIIllIllIIIl[1])) {
            return lIIIllIllIIIl[0];
        }
        System.out.println("[RESTLESS GHOST] - Current Progress: " + Q);
        switch (Q) {
            case 0:
                M();
                "".length();
                if ("  ".length() <= " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 1:
                ch();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true);
                }
                break;
            case 2:
                cg();
                cf();
                "".length();
                if ("  ".length() == 0) {
                    return ((((153 + 218) - 349) + 221) ^ (((63 + 15) - 35) + 144)) & (((38 ^ 108) ^ "  ".length()) ^ (-" ".length()));
                }
                break;
            case 3:
                ce();
                "".length();
                if ("  ".length() < 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 4:
                cd();
                "".length();
                if ("   ".length() < " ".length()) {
                    return ((86 ^ 109) ^ (117 ^ 102)) & (((161 ^ 187) ^ (121 ^ 75)) ^ (-" ".length()));
                }
                break;
            default:
                return lIIIllIllIIIl[0];
        }
        return lIIIllIllIIIl[2];
    }

    private void ce() {
        WorldPoint worldPoint = new WorldPoint(lIIIllIllIIIl[8], lIIIllIllIIIl[9], lIIIllIllIIIl[0]);
        String[] strArr = new String[lIIIllIllIIIl[2]];
        strArr[lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[1]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (lIlIIIllIIIIIIl(at.isEmpty() ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIllIIIl[10], lIIIllIllIIIl[9], lIIIllIllIIIl[0]));
            "".length();
            "".length();
            if (" ".length() <= 0) {
            }
        } else if (!lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable) at.get(lIIIllIllIIIl[0])) ? 1 : 0)) {
            Walker.walkTo(((TileObject) at.get(lIIIllIllIIIl[0])).getWorldLocation());
            "".length();
        } else {
            ((TileObject) at.get(lIIIllIllIIIl[0])).interact(lIIIllIllIIII[lIIIllIllIIIl[11]]);
            "".length();
            if ((176 ^ 180) == (-" ".length())) {
            }
        }
    }

    private int Q() {
        return Vars.getVarp(EnumC0000a.QUEST_THE_RESTLESS_GHOST.c());
    }
}
