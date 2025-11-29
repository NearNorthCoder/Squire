package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/g.class */
public class C0006g {
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int bn;
    private static /* synthetic */ String[] lIIIlllllIIlI;
    private static final /* synthetic */ int[] bs;
    private static final /* synthetic */ int bo;
    private static final /* synthetic */ int br;
    private static /* synthetic */ int[] lIIIlllllIlII;
    private static final /* synthetic */ int bp;

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(String str, String[] strArr) {
        if (lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr2 = new String[lIIIlllllIlII[2]];
            strArr2[lIIIlllllIlII[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlIIllIIlIlIIl(all.size())) {
                ((NPC) all.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[9]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lIIIlllllIlII[5]);
                "".length();
            }
        }
        do {
            if (lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && !lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
                return;
            }
            try {
                AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[10]];
                if (lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                if (!lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks(lIIIlllllIlII[2]);
                "".length();
                "".length();
                if (((35 ^ 82) ^ (48 ^ 69)) < ((110 ^ 67) ^ (114 ^ 91))) {
                    return;
                }
            } catch (Exception e) {
            }
            Time.sleepTicks(lIIIlllllIlII[2]);
            "".length();
            "".length();
        } while (" ".length() >= (((127 ^ 108) ^ (141 ^ 197)) & (((((117 + 136) - 250) + 206) ^ (((130 + 125) - 200) + 83)) ^ (-" ".length()))));
    }

    private static String lIlIIllIIlIIIII(String lllllllllllllllIIIIIIIlIIIIIIlll, String lllllllllllllllIIIIIIIlIIIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIIlIIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIlIIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIIIlllllIlII[16]), "DES");
            Cipher lllllllllllllllIIIIIIIlIIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIIlIIIIIlIIl.init(lIIIlllllIlII[6], lllllllllllllllIIIIIIIlIIIIIlIlI);
            return new String(lllllllllllllllIIIIIIIlIIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIlIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIIlIIIIIlIII) {
            lllllllllllllllIIIIIIIlIIIIIlIII.printStackTrace();
            return null;
        }
    }

    public static void a(String str, String[] strArr) {
        if (lIlIIllIIlIIlll(C0004e.j(lIIIlllllIlII[0]), lIIIlllllIlII[1]) && lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[lIIIlllllIlII[2]];
            strArr2[lIIIlllllIlII[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlIIllIIlIlIIl(all.size())) {
                ((NPC) all.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[3]]);
                Time.sleepTicks(lIIIlllllIlII[4]);
                "".length();
            }
        }
        if (lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[lIIIlllllIlII[2]];
            strArr3[lIIIlllllIlII[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIlIIllIIlIlIIl(all2.size())) {
                ((NPC) all2.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[2]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lIIIlllllIlII[5]);
                "".length();
            }
        }
        if (lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && !lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[6]];
        if (lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIlIIllIIlIlIIl(int i2) {
        return i2 > 0;
    }

    public static void a(String lllllllllllllllIIIIIIIlIIlIIIIlI, String[] strArr, boolean z) {
        if (lIlIIllIIlIIlll(C0004e.j(lIIIlllllIlII[0]), lIIIlllllIlII[1]) && lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[lIIIlllllIlII[2]];
            strArr2[lIIIlllllIlII[3]] = lllllllllllllllIIIIIIIlIIlIIIIlI;
            List all = NPCs.getAll(strArr2);
            if (lIlIIllIIlIlIIl(all.size())) {
                ((NPC) all.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[7]]);
                Time.sleepTicks(lIIIlllllIlII[4]);
                "".length();
            }
        }
        if (lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[lIIIlllllIlII[2]];
            strArr3[lIIIlllllIlII[3]] = lllllllllllllllIIIIIIIlIIlIIIIlI;
            List all2 = NPCs.getAll(strArr3);
            if (lIlIIllIIlIlIIl(all2.size())) {
                if (lIlIIllIIlIlIII(Reachable.isInteractable((Locatable) all2.get(lIIIlllllIlII[3])) ? 1 : 0)) {
                    Movement.walkTo(((NPC) all2.get(lIIIlllllIlII[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks(lIIIlllllIlII[2]);
                    "".length();
                }
                if (lIlIIllIIlIlIlI(Reachable.isInteractable((Locatable) all2.get(lIIIlllllIlII[3])) ? 1 : 0)) {
                    ((NPC) all2.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[8]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lIIIlllllIlII[5]);
                    "".length();
                }
            }
        }
        if (lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && !lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[4]];
        if (lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static String lIlIIllIIlIIIIl(String lllllllllllllllIIIIIIIlIIIIlllII, String lllllllllllllllIIIIIIIlIIIIllIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIIIlIIIIllIll.toCharArray();
        int lllllllllllllllIIIIIIIlIIIIllIII = lIIIlllllIlII[3];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlllllIlII[3];
        while (lIlIIllIIlIIlll(i2, length)) {
            char lllllllllllllllIIIIIIIlIIIIIllll = charArray2[i2];
            sb.append((char) (lllllllllllllllIIIIIIIlIIIIIllll ^ charArray[lllllllllllllllIIIIIIIlIIIIllIII % charArray.length]));
            "".length();
            lllllllllllllllIIIIIIIlIIIIllIII++;
            i2++;
            "".length();
            if ((-" ".length()) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIllIIlIlIlI(int i2) {
        return i2 != 0;
    }

    static {
        lIlIIllIIlIIllI();
        lIlIIllIIlIIlIl();
        bp = lIIIlllllIlII[11];
        bq = lIIIlllllIlII[12];
        br = lIIIlllllIlII[13];
        bo = lIIIlllllIlII[14];
        bn = lIIIlllllIlII[15];
        int[] iArr = new int[lIIIlllllIlII[4]];
        iArr[lIIIlllllIlII[3]] = lIIIlllllIlII[15];
        iArr[lIIIlllllIlII[2]] = lIIIlllllIlII[14];
        iArr[lIIIlllllIlII[6]] = lIIIlllllIlII[11];
        iArr[lIIIlllllIlII[7]] = lIIIlllllIlII[12];
        iArr[lIIIlllllIlII[8]] = lIIIlllllIlII[13];
        bs = iArr;
    }

    private static boolean lIlIIllIIlIlIII(int i2) {
        return i2 == 0;
    }

    private static void lIlIIllIIlIIlIl() {
        lIIIlllllIIlI = new String[lIIIlllllIlII[16]];
        lIIIlllllIIlI[lIIIlllllIlII[3]] = lIlIIllIIIlllll("vqEeg/EaHLE=", "tkslx");
        lIIIlllllIIlI[lIIIlllllIlII[2]] = lIlIIllIIlIIIII("gcZZg0XjEDU=", "RnXiJ");
        lIIIlllllIIlI[lIIIlllllIlII[6]] = lIlIIllIIlIIIII("kwqgfwXQdymhQlBSPp6U9g==", "RRPxa");
        lIIIlllllIIlI[lIIIlllllIlII[7]] = lIlIIllIIlIIIII("K8lysuvMmAc=", "KOAPf");
        lIIIlllllIIlI[lIIIlllllIlII[8]] = lIlIIllIIIlllll("Lu0e80JQLq4=", "eGdDe");
        lIIIlllllIIlI[lIIIlllllIlII[4]] = lIlIIllIIlIIIIl("Ly4uGAIFKCZXFQUnLRgW", "lFAwq");
        lIIIlllllIIlI[lIIIlllllIlII[9]] = lIlIIllIIIlllll("FQy5M7MTL04=", "KlYxD");
        lIIIlllllIIlI[lIIIlllllIlII[10]] = lIlIIllIIIlllll("4xU7uRPqcI4SYCepmESrRQ==", "jsIBL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean L() {
        int i2 = lIIIlllllIlII[3];
        while (lIlIIllIIlIIlll(i2, bs.length)) {
            List list = Widgets.get(bs[i2]);
            if (lIlIIllIIlIlIII(list.isEmpty() ? 1 : 0) && lIlIIllIIlIlIlI(((Widget) list.get(lIIIlllllIlII[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bs[i2]);
                return lIIIlllllIlII[2];
            }
            i2++;
            "".length();
            if ((-" ".length()) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIIlllllIlII[3];
    }

    private static void lIlIIllIIlIIllI() {
        lIIIlllllIlII = new int[17];
        lIIIlllllIlII[0] = (-(((137 + 148) - 265) + 177)) & (-27169) & 27645;
        lIIIlllllIlII[1] = (-((-4805) & 16085)) & (-4) & 12283;
        lIIIlllllIlII[2] = " ".length();
        lIIIlllllIlII[3] = "  ".length() & ("  ".length() ^ (-1));
        lIIIlllllIlII[4] = "   ".length() ^ (23 ^ 17);
        lIIIlllllIlII[5] = (-((-17995) & 30287)) & (-16449) & 31740;
        lIIIlllllIlII[6] = "  ".length();
        lIIIlllllIlII[7] = "   ".length();
        lIIIlllllIlII[8] = 40 ^ 44;
        lIIIlllllIlII[9] = 63 ^ 57;
        lIIIlllllIlII[10] = (78 ^ 92) ^ (87 ^ 66);
        lIIIlllllIlII[11] = (((218 ^ 184) + (110 ^ 91)) - (137 ^ 170)) + (243 ^ 150);
        lIIIlllllIlII[12] = (((88 ^ 106) + (((115 + 81) - 81) + 76)) - (57 ^ 90)) + (226 ^ 175);
        lIIIlllllIlII[13] = ((96 + 145) - 133) + 121;
        lIIIlllllIlII[14] = ((125 + 136) - 104) + 74;
        lIIIlllllIlII[15] = ((135 + 16) - 49) + 91;
        lIIIlllllIlII[16] = (((37 + 150) - 29) + 13) ^ (((36 + 143) - 158) + 142);
    }

    private static String lIlIIllIIIlllll(String lllllllllllllllIIIIIIIlIIIlIllII, String lllllllllllllllIIIIIIIlIIIlIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIlIIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIIlIIIlIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIIlIIIlIlllI.init(lIIIlllllIlII[6], secretKeySpec);
            return new String(lllllllllllllllIIIIIIIlIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIlIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIIlIIIlIllIl) {
            lllllllllllllllIIIIIIIlIIIlIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIlIIlll(int i2, int i3) {
        return i2 < i3;
    }

    public static void a(String[] strArr) {
        if (lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}
