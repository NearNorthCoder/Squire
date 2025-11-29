package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.plugins.logout.Clues;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.n  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/n.class */
public class n {
    private static final /* synthetic */ int cc;
    private static final /* synthetic */ int bZ;
    private static final /* synthetic */ int[] ce;
    private static /* synthetic */ int[] llll;
    private static final /* synthetic */ int cd;
    private static /* synthetic */ String[] lllI;
    private static final /* synthetic */ int cb;
    private static final /* synthetic */ int ca;

    private static String lIIIlll(String lllllIlIlllIlll, String lllllIlIlllIllI) {
        String lllllIlIlllIlll2 = new String(Base64.getDecoder().decode(lllllIlIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIlIlllIlIl = new StringBuilder();
        char[] lllllIlIlllIlII = lllllIlIlllIllI.toCharArray();
        int lllllIlIlllIIll = llll[3];
        char[] charArray = lllllIlIlllIlll2.toCharArray();
        int length = charArray.length;
        int i = llll[3];
        while (lIIlIlI(i, length)) {
            char lllllIlIllIlIlI = charArray[i];
            lllllIlIlllIlIl.append((char) (lllllIlIllIlIlI ^ lllllIlIlllIlII[lllllIlIlllIIll % lllllIlIlllIlII.length]));
            "".length();
            lllllIlIlllIIll++;
            i++;
            "".length();
            if ((((((164 + 58) - 137) + 125) ^ (((175 + 170) - 167) + 15)) & (((8 ^ 7) ^ (154 ^ 134)) ^ (-" ".length()))) > (((((89 + 83) - 138) + 122) ^ (((0 + 173) - 104) + 128)) & (((95 ^ 103) ^ (121 ^ 24)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllIlIlllIlIl);
    }

    private static void lIIlIIl() {
        llll = new int[17];
        llll[0] = (-10913) & 11193;
        llll[1] = (-2067) & 3066;
        llll[2] = " ".length();
        llll[3] = ((121 ^ 63) ^ (9 ^ 29)) & (((((192 + 50) - 191) + 178) ^ (((50 + 6) - (-50)) + 77)) ^ (-" ".length()));
        llll[4] = (177 ^ 137) ^ (253 ^ 192);
        llll[5] = (-((-525) & 30287)) & (-2) & 32763;
        llll[6] = "  ".length();
        llll[7] = "   ".length();
        llll[8] = 108 ^ 104;
        llll[9] = 116 ^ 114;
        llll[10] = (166 ^ 197) ^ (52 ^ 80);
        llll[11] = (((53 ^ 114) + (((78 + 87) - 61) + 57)) - (192 ^ 176)) + (0 ^ 73);
        llll[12] = ((200 + 140) - 156) + 35;
        llll[13] = (((124 ^ 105) + (((94 + 7) - (-50)) + 38)) - (177 ^ 135)) + (225 ^ 170);
        llll[14] = (((115 ^ 24) + (((82 + 54) - 89) + 95)) - (((65 + 122) - 141) + 124)) + ((7 + 137) - 89) + 83;
        llll[15] = (((((85 + 52) - 57) + 71) + (224 ^ 190)) - (95 ^ 24)) + (59 ^ 12);
        llll[16] = (((45 + 173) - 210) + 180) ^ (((54 + 104) - 81) + 103);
    }

    private static String lIIIllI(String lllllIllIIIIlll, String lllllIllIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIllIIIIllI.getBytes(StandardCharsets.UTF_8)), llll[16]), "DES");
            Cipher lllllIllIIIlIIl = Cipher.getInstance("DES");
            lllllIllIIIlIIl.init(llll[6], secretKeySpec);
            return new String(lllllIllIIIlIIl.doFinal(Base64.getDecoder().decode(lllllIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIllIIIlIII) {
            lllllIllIIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIIl();
        lIIlIII();
        bZ = llll[11];
        cc = llll[12];
        ca = llll[13];
        cb = llll[14];
        cd = llll[15];
        int[] iArr = new int[llll[4]];
        iArr[llll[3]] = llll[11];
        iArr[llll[2]] = llll[13];
        iArr[llll[6]] = llll[14];
        iArr[llll[7]] = llll[12];
        iArr[llll[8]] = llll[15];
        ce = iArr;
    }

    private static String lIIIlIl(String lllllIlIllIIIlI, String lllllIlIllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIlIllIIIll) {
            lllllIlIllIIIll.printStackTrace();
            return null;
        }
    }

    public static void a(String str, String[] strArr, boolean z) {
        if (lIIlIlI(k.h(llll[0]), llll[1]) && lIIlIll(Dialog.canContinue() ? 1 : 0) && lIIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llll[2]];
            strArr2[llll[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIIllII(all.size())) {
                ((NPC) all.get(llll[3])).interact(lllI[llll[7]]);
                Time.sleepTicks(llll[4]);
                "".length();
            }
        }
        if (lIIlIll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llll[2]];
            strArr3[llll[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIIllII(all2.size())) {
                if (lIIlIll(Reachable.isInteractable((Locatable) all2.get(llll[3])) ? 1 : 0)) {
                    Movement.walkTo(((NPC) all2.get(llll[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks(llll[2]);
                    "".length();
                }
                if (lIIllIl(Reachable.isInteractable((Locatable) all2.get(llll[3])) ? 1 : 0)) {
                    ((NPC) all2.get(llll[3])).interact(lllI[llll[8]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llll[5]);
                    "".length();
                }
            }
        }
        if (lIIlIll(Dialog.isOpen() ? 1 : 0) && lIIlIll(Dialog.canContinue() ? 1 : 0) && lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && !lIIllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        Clues.f0c = lllI[llll[4]];
        if (lIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && lIIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || lIIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    public static void b(String str, String[] strArr) {
        if (lIIlIll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr2 = new String[llll[2]];
            strArr2[llll[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIIllII(all.size())) {
                ((NPC) all.get(llll[3])).interact(lllI[llll[9]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llll[5]);
                "".length();
            }
        }
        do {
            if (lIIlIll(Dialog.isOpen() ? 1 : 0) && lIIlIll(Dialog.canContinue() ? 1 : 0) && lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && !lIIllIl(Dialog.isViewingOptions() ? 1 : 0)) {
                return;
            }
            try {
                Clues.f0c = lllI[llll[10]];
                if (lIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && lIIlIll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                if (!lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || lIIllIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks(llll[2]);
                "".length();
                "".length();
                if ((41 ^ 45) == "   ".length()) {
                    return;
                }
            } catch (Exception e) {
            }
            Time.sleepTicks(llll[2]);
            "".length();
            "".length();
        } while ((-" ".length()) <= "  ".length());
    }

    public static void a(String str, String[] strArr) {
        if (lIIlIlI(k.h(llll[0]), llll[1]) && lIIlIll(Dialog.canContinue() ? 1 : 0) && lIIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llll[2]];
            strArr2[llll[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIIllII(all.size())) {
                ((NPC) all.get(llll[3])).interact(lllI[llll[3]]);
                Time.sleepTicks(llll[4]);
                "".length();
            }
        }
        if (lIIlIll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llll[2]];
            strArr3[llll[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIIllII(all2.size())) {
                ((NPC) all2.get(llll[3])).interact(lllI[llll[2]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llll[5]);
                "".length();
            }
        }
        if (lIIlIll(Dialog.isOpen() ? 1 : 0) && lIIlIll(Dialog.canContinue() ? 1 : 0) && lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && !lIIllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        Clues.f0c = lllI[llll[6]];
        if (lIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && lIIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || lIIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    public static void c(String[] strArr) {
        if (lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && lIIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || lIIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIIllIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIll(int i) {
        return i == 0;
    }

    private static void lIIlIII() {
        lllI = new String[llll[16]];
        lllI[llll[3]] = lIIIlIl("wFZLO2n6XPk=", "xRWOf");
        lllI[llll[2]] = lIIIllI("+3f8JFnvXkQ=", "QSIhq");
        lllI[llll[6]] = lIIIllI("ytbufXciaPjiNL8JMrt8Yg==", "pMqhI");
        lllI[llll[7]] = lIIIlll("EzkHIUYzNw==", "GXkJk");
        lllI[llll[8]] = lIIIlIl("DQWNHlnTr10=", "BzRbG");
        lllI[llll[4]] = lIIIlll("CR01HzkjGz1QLiMUNh8t", "JuZpJ");
        lllI[llll[9]] = lIIIllI("E/yOLVw/Nlg=", "bfbvX");
        lllI[llll[10]] = lIIIlIl("h8j9yTduR5ykoYLpBOP0eQ==", "iaEuJ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean aV() {
        int i = llll[3];
        while (lIIlIlI(i, ce.length)) {
            List list = Widgets.get(ce[i]);
            if (lIIlIll(list.isEmpty() ? 1 : 0) && lIIllIl(((Widget) list.get(llll[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + ce[i]);
                return llll[2];
            }
            i++;
            "".length();
            if (" ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llll[3];
    }

    private static boolean lIIllII(int i) {
        return i > 0;
    }

    private static boolean lIIlIlI(int i, int i2) {
        return i < i2;
    }
}
