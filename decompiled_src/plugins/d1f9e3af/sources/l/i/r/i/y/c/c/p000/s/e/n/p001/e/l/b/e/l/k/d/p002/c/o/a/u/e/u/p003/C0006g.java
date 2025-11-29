package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/g.class */
public class C0006g {
    private static final /* synthetic */ int bj;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bi;
    private static final /* synthetic */ int bm;
    private static final /* synthetic */ int bk;
    private static final /* synthetic */ int[] bn;
    private static /* synthetic */ String[] llIIIlIlI;
    private static /* synthetic */ int[] llIIIlIll;

    private static void lIlIIllIIllI() {
        llIIIlIlI = new String[llIIIlIll[16]];
        llIIIlIlI[llIIIlIll[3]] = lIlIIllIIIll("TRdbmza9wa0=", "LRKfi");
        llIIIlIlI[llIIIlIll[2]] = lIlIIllIIIll("8mB6yPWG5zY=", "ZsSSh");
        llIIIlIlI[llIIIlIll[6]] = lIlIIllIIIll("Wzem23OnRt4H2Y4qAISP5g==", "yvKUd");
        llIIIlIlI[llIIIlIll[7]] = lIlIIllIIlII("4AT2M/s5ug0=", "lTimo");
        llIIIlIlI[llIIIlIll[8]] = lIlIIllIIlIl("OQADPnUZDg==", "maoUX");
        llIIIlIlI[llIIIlIll[4]] = lIlIIllIIlII("z/lECCkdLeu7AWlCqUjg3g==", "xrYhw");
        llIIIlIlI[llIIIlIll[9]] = lIlIIllIIIll("y9vKWLkcf6Y=", "iuWcq");
        llIIIlIlI[llIIIlIll[10]] = lIlIIllIIIll("0nx5b4TaxiBRyS0Gq68eBQ==", "egWPw");
    }

    private static String lIlIIllIIIll(String lIllIllIIlIlll, String lIllIllIIlIllI) {
        try {
            SecretKeySpec lIllIllIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIIlIllI.getBytes(StandardCharsets.UTF_8)), llIIIlIll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlIll[6], lIllIllIIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIllIIllIII) {
            lIllIllIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIllIlIll(int i) {
        return i != 0;
    }

    static {
        lIlIIllIIlll();
        lIlIIllIIllI();
        bk = llIIIlIll[11];
        bj = llIIIlIll[12];
        bl = llIIIlIll[13];
        bm = llIIIlIll[14];
        bi = llIIIlIll[15];
        int[] iArr = new int[llIIIlIll[4]];
        iArr[llIIIlIll[3]] = llIIIlIll[15];
        iArr[llIIIlIll[2]] = llIIIlIll[12];
        iArr[llIIIlIll[6]] = llIIIlIll[11];
        iArr[llIIIlIll[7]] = llIIIlIll[13];
        iArr[llIIIlIll[8]] = llIIIlIll[14];
        bn = iArr;
    }

    public static void a(String[] strArr) {
        if (lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static void lIlIIllIIlll() {
        llIIIlIll = new int[17];
        llIIIlIll[0] = (-3783) & 4063;
        llIIIlIll[1] = (-8196) & 9195;
        llIIIlIll[2] = " ".length();
        llIIIlIll[3] = (55 ^ 10) & ((149 ^ 168) ^ (-1));
        llIIIlIll[4] = 77 ^ 72;
        llIIIlIll[5] = (-28676) & 31675;
        llIIIlIll[6] = "  ".length();
        llIIIlIll[7] = "   ".length();
        llIIIlIll[8] = 123 ^ 127;
        llIIIlIll[9] = 76 ^ 74;
        llIIIlIll[10] = 199 ^ 192;
        llIIIlIll[11] = ((22 + 203) - 221) + 213;
        llIIIlIll[12] = (((29 ^ 123) + (((137 + 43) - 107) + 93)) - (((33 + 6) - (-98)) + 64)) + ((139 + 140) - 175) + 60;
        llIIIlIll[13] = ((68 + 117) - 80) + 114;
        llIIIlIll[14] = ((26 + 9) - (-96)) + 98;
        llIIIlIll[15] = ((4 + 43) - (-75)) + 71;
        llIIIlIll[16] = (155 ^ 138) ^ (143 ^ 150);
    }

    private static String lIlIIllIIlII(String lIllIllIllllII, String lIllIllIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIllIlllllI = Cipher.getInstance("Blowfish");
            lIllIllIlllllI.init(llIIIlIll[6], secretKeySpec);
            return new String(lIllIllIlllllI.doFinal(Base64.getDecoder().decode(lIllIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIllIllllIl) {
            lIllIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlIIl(int i) {
        return i == 0;
    }

    public static void a(String str, String[] strArr, boolean z) {
        if (lIlIIllIlIII(C0004e.j(llIIIlIll[0]), llIIIlIll[1]) && lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) && lIlIIllIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llIIIlIll[2]];
            strArr2[llIIIlIll[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlIIllIlIlI(all.size())) {
                ((NPC) all.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[7]]);
                Time.sleepTicks(llIIIlIll[4]);
                "".length();
            }
        }
        if (lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llIIIlIll[2]];
            strArr3[llIIIlIll[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIlIIllIlIlI(all2.size())) {
                if (lIlIIllIlIIl(Reachable.isInteractable((Locatable) all2.get(llIIIlIll[3])) ? 1 : 0)) {
                    Movement.walkTo(((NPC) all2.get(llIIIlIll[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks(llIIIlIll[2]);
                    "".length();
                }
                if (lIlIIllIlIll(Reachable.isInteractable((Locatable) all2.get(llIIIlIll[3])) ? 1 : 0)) {
                    ((NPC) all2.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[8]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llIIIlIll[5]);
                    "".length();
                }
            }
        }
        if (lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && !lIlIIllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderEasyClues.c = llIIIlIlI[llIIIlIll[4]];
        if (lIlIIllIlIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIlIIllIlIlI(int i) {
        return i > 0;
    }

    private static String lIlIIllIIlIl(String lIllIllIlIllII, String lIllIllIlIlIll) {
        String lIllIllIlIllII2 = new String(Base64.getDecoder().decode(lIllIllIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIllIllIlIlIIl = lIllIllIlIlIll.toCharArray();
        int lIllIllIlIlIII = llIIIlIll[3];
        char[] charArray = lIllIllIlIllII2.toCharArray();
        int length = charArray.length;
        int i = llIIIlIll[3];
        while (lIlIIllIlIII(i, length)) {
            char lIllIllIlIllIl = charArray[i];
            sb.append((char) (lIllIllIlIllIl ^ lIllIllIlIlIIl[lIllIllIlIlIII % lIllIllIlIlIIl.length]));
            "".length();
            lIllIllIlIlIII++;
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean K() {
        int i = llIIIlIll[3];
        while (lIlIIllIlIII(i, bn.length)) {
            List list = Widgets.get(bn[i]);
            if (lIlIIllIlIIl(list.isEmpty() ? 1 : 0) && lIlIIllIlIll(((Widget) list.get(llIIIlIll[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bn[i]);
                return llIIIlIll[2];
            }
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return ((1 ^ 38) ^ "  ".length()) & (((208 ^ 158) ^ (1 ^ 106)) ^ (-" ".length()));
            }
        }
        return llIIIlIll[3];
    }

    public static void a(String str, String[] strArr) {
        if (lIlIIllIlIII(C0004e.j(llIIIlIll[0]), llIIIlIll[1]) && lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) && lIlIIllIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llIIIlIll[2]];
            strArr2[llIIIlIll[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlIIllIlIlI(all.size())) {
                ((NPC) all.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[3]]);
                Time.sleepTicks(llIIIlIll[4]);
                "".length();
            }
        }
        if (lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llIIIlIll[2]];
            strArr3[llIIIlIll[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIlIIllIlIlI(all2.size())) {
                ((NPC) all2.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[2]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llIIIlIll[5]);
                "".length();
            }
        }
        if (lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && !lIlIIllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderEasyClues.c = llIIIlIlI[llIIIlIll[6]];
        if (lIlIIllIlIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    public static void b(String str, String[] strArr) {
        if (lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr2 = new String[llIIIlIll[2]];
            strArr2[llIIIlIll[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlIIllIlIlI(all.size())) {
                ((NPC) all.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[9]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llIIIlIll[5]);
                "".length();
            }
        }
        do {
            if (lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && !lIlIIllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
                return;
            }
            try {
                AccBuilderEasyClues.c = llIIIlIlI[llIIIlIll[10]];
                if (lIlIIllIlIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                if (!lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks(llIIIlIll[2]);
                "".length();
                "".length();
                if ((-"   ".length()) >= 0) {
                    return;
                }
            } catch (Exception e) {
            }
            Time.sleepTicks(llIIIlIll[2]);
            "".length();
            "".length();
        } while (0 == 0);
    }
}
