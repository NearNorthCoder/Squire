package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/g.class */
public class C0006g {
    private static final /* synthetic */ int bi;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bh;
    private static /* synthetic */ String[] llllIIllll;
    private static final /* synthetic */ int bj;
    private static final /* synthetic */ int bk;
    private static /* synthetic */ int[] llllIlIIII;
    private static final /* synthetic */ int[] bm;

    private static boolean llIIlllIlIllI(int i) {
        return i == 0;
    }

    private static boolean llIIlllIllIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean K() {
        int i = llllIlIIII[3];
        while (llIIlllIlIlIl(i, bm.length)) {
            List list = Widgets.get(bm[i]);
            if (llIIlllIlIllI(list.isEmpty() ? 1 : 0) && llIIlllIllIII(((Widget) list.get(llllIlIIII[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bm[i]);
                return llllIlIIII[2];
            }
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return ((113 ^ 44) ^ (255 ^ 168)) & (((95 ^ 31) ^ (206 ^ 132)) ^ (-" ".length()));
            }
        }
        return llllIlIIII[3];
    }

    private static boolean llIIlllIlIlIl(int i, int i2) {
        return i < i2;
    }

    public static void a(String[] strArr) {
        if (llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static void llIIlllIlIlII() {
        llllIlIIII = new int[17];
        llllIlIIII[0] = (-((-10555) & 16319)) & (-10241) & 16285;
        llllIlIIII[1] = (-((-2721) & 16037)) & (-17) & 14332;
        llllIlIIII[2] = " ".length();
        llllIlIIII[3] = ((207 ^ 180) ^ (24 ^ 50)) & (((135 ^ 130) ^ (105 ^ 61)) ^ (-" ".length()));
        llllIlIIII[4] = (86 ^ 61) ^ (124 ^ 18);
        llllIlIIII[5] = (-13384) & 16383;
        llllIlIIII[6] = "  ".length();
        llllIlIIII[7] = "   ".length();
        llllIlIIII[8] = 190 ^ 186;
        llllIlIIII[9] = 153 ^ 159;
        llllIlIIII[10] = (((48 + 84) - 17) + 36) ^ (((6 + 1) - (-100)) + 37);
        llllIlIIII[11] = ((207 + 70) - 186) + 128;
        llllIlIIII[12] = ((26 + 13) - (-72)) + 82;
        llllIlIIII[13] = ((127 + 134) - 128) + 98;
        llllIlIIII[14] = ((42 + 225) - 181) + 143;
        llllIlIIII[15] = (((111 ^ 52) + (118 ^ 28)) - (63 ^ 115)) + (248 ^ 152);
        llllIlIIII[16] = (((2 + 116) - 97) + 145) ^ (((16 + 107) - (-47)) + 4);
    }

    public static void b(String str, String[] strArr) {
        if (llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr2 = new String[llllIlIIII[2]];
            strArr2[llllIlIIII[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (llIIlllIlIlll(all.size())) {
                ((NPC) all.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[9]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llllIlIIII[5]);
                "".length();
            }
        }
        do {
            if (llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && !llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
                return;
            }
            try {
                AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[10]];
                if (llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                if (!llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks(llllIlIIII[2]);
                "".length();
                "".length();
                if ((-" ".length()) >= (((197 ^ 193) ^ (33 ^ 119)) & (((234 ^ 142) ^ (167 ^ 145)) ^ (-" ".length())))) {
                    return;
                }
            } catch (Exception e2) {
            }
            Time.sleepTicks(llllIlIIII[2]);
            "".length();
            "".length();
        } while ((-"  ".length()) < 0);
    }

    private static boolean llIIlllIlIlll(int i) {
        return i > 0;
    }

    private static void llIIlllIlIIll() {
        llllIIllll = new String[llllIlIIII[16]];
        llllIIllll[llllIlIIII[3]] = llIIlllIlIIIl("NTk/BFcVNw==", "aXSoz");
        llllIIllll[llllIlIIII[2]] = llIIlllIlIIlI("9F7jb0pTgcU=", "MunIU");
        llllIIllll[llllIlIIII[6]] = llIIlllIlIIIl("Lyw6HCUFKjJTMgUlORwx", "lDUsV");
        llllIIllll[llllIlIIII[7]] = llIIlllIlIIlI("I0Tzdtk2/Sw=", "PWPlm");
        llllIIllll[llllIlIIII[8]] = llIIlllIlIIIl("IxQaDGwDGg==", "wuvgA");
        llllIIllll[llllIlIIII[4]] = llIIlllIlIIlI("o2BHfZ0p94GTikRBkieB0Q==", "Wcpub");
        llllIIllll[llllIlIIII[9]] = llIIlllIlIIIl("ASsoAHohJQ==", "UJDkW");
        llllIIllll[llllIlIIII[10]] = llIIlllIlIIIl("NRIKGREfFAJWBh8bCRkF", "vzevb");
    }

    public static void a(String str, String[] strArr) {
        if (llIIlllIlIlIl(C0004e.j(llllIlIIII[0]), llllIlIIII[1]) && llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) && llIIlllIlIllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llllIlIIII[2]];
            strArr2[llllIlIIII[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (llIIlllIlIlll(all.size())) {
                ((NPC) all.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[3]]);
                Time.sleepTicks(llllIlIIII[4]);
                "".length();
            }
        }
        if (llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llllIlIIII[2]];
            strArr3[llllIlIIII[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (llIIlllIlIlll(all2.size())) {
                ((NPC) all2.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[2]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llllIlIIII[5]);
                "".length();
            }
        }
        if (llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && !llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[6]];
        if (llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static String llIIlllIlIIlI(String lllllllllllllllllIlIllIIIIllIIlI, String lllllllllllllllllIlIllIIIIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIIIIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIIIllIIIl.getBytes(StandardCharsets.UTF_8)), llllIlIIII[16]), "DES");
            Cipher lllllllllllllllllIlIllIIIIllIlII = Cipher.getInstance("DES");
            lllllllllllllllllIlIllIIIIllIlII.init(llllIlIIII[6], lllllllllllllllllIlIllIIIIllIlIl);
            return new String(lllllllllllllllllIlIllIIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIllIIIIllIIll) {
            lllllllllllllllllIlIllIIIIllIIll.printStackTrace();
            return null;
        }
    }

    public static void a(String str, String[] strArr, boolean z) {
        if (llIIlllIlIlIl(C0004e.j(llllIlIIII[0]), llllIlIIII[1]) && llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) && llIIlllIlIllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llllIlIIII[2]];
            strArr2[llllIlIIII[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (llIIlllIlIlll(all.size())) {
                ((NPC) all.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[7]]);
                Time.sleepTicks(llllIlIIII[4]);
                "".length();
            }
        }
        if (llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llllIlIIII[2]];
            strArr3[llllIlIIII[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (llIIlllIlIlll(all2.size())) {
                if (llIIlllIlIllI(Reachable.isInteractable((Locatable) all2.get(llllIlIIII[3])) ? 1 : 0)) {
                    Movement.walkTo(((NPC) all2.get(llllIlIIII[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks(llllIlIIII[2]);
                    "".length();
                }
                if (llIIlllIllIII(Reachable.isInteractable((Locatable) all2.get(llllIlIIII[3])) ? 1 : 0)) {
                    ((NPC) all2.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[8]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llllIlIIII[5]);
                    "".length();
                }
            }
        }
        if (llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && !llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[4]];
        if (llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    static {
        llIIlllIlIlII();
        llIIlllIlIIll();
        bk = llllIlIIII[11];
        bh = llllIlIIII[12];
        bi = llllIlIIII[13];
        bl = llllIlIIII[14];
        bj = llllIlIIII[15];
        int[] iArr = new int[llllIlIIII[4]];
        iArr[llllIlIIII[3]] = llllIlIIII[12];
        iArr[llllIlIIII[2]] = llllIlIIII[13];
        iArr[llllIlIIII[6]] = llllIlIIII[15];
        iArr[llllIlIIII[7]] = llllIlIIII[11];
        iArr[llllIlIIII[8]] = llllIlIIII[14];
        bm = iArr;
    }

    private static String llIIlllIlIIIl(String lllllllllllllllllIlIllIIIIlIIIlI, String lllllllllllllllllIlIllIIIIlIIIIl) {
        String lllllllllllllllllIlIllIIIIlIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIlIllIIIIIlllll = lllllllllllllllllIlIllIIIIlIIIIl.toCharArray();
        int lllllllllllllllllIlIllIIIIIllllI = llllIlIIII[3];
        char[] charArray = lllllllllllllllllIlIllIIIIlIIIlI2.toCharArray();
        int lllllllllllllllllIlIllIIIIIlIlll = charArray.length;
        int i = llllIlIIII[3];
        while (llIIlllIlIlIl(i, lllllllllllllllllIlIllIIIIIlIlll)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllllIlIllIIIIIlllll[lllllllllllllllllIlIllIIIIIllllI % lllllllllllllllllIlIllIIIIIlllll.length]));
            "".length();
            lllllllllllllllllIlIllIIIIIllllI++;
            i++;
            "".length();
            if (((26 ^ 121) & ((123 ^ 24) ^ (-1))) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
