package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/g.class */
public class C0006g {
    private static final /* synthetic */ int bt;
    private static final /* synthetic */ int bp;
    private static final /* synthetic */ int bs;
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int[] bu;
    private static /* synthetic */ int[] llIlIIllI;
    private static final /* synthetic */ int br;
    private static /* synthetic */ String[] llIlIIlIl;

    public static void a(String[] strArr) {
        if (lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && lIllIIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || lIllIIlIIIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean M() {
        int i = llIlIIllI[3];
        while (lIllIIIllllI(i, bu.length)) {
            List list = Widgets.get(bu[i]);
            if (lIllIIIlllll(list.isEmpty() ? 1 : 0) && lIllIIlIIIIl(((Widget) list.get(llIlIIllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bu[i]);
                return llIlIIllI[2];
            }
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return ((86 ^ 20) ^ (65 ^ 47)) & (((212 ^ 141) ^ (14 ^ 123)) ^ (-" ".length()));
            }
        }
        return llIlIIllI[3];
    }

    private static boolean lIllIIIlllll(int i) {
        return i == 0;
    }

    private static String lIllIIIllIll(String lIIllIIllIIIlI, String lIIllIIllIIIIl) {
        try {
            SecretKeySpec lIIllIIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIllIIIIl.getBytes(StandardCharsets.UTF_8)), llIlIIllI[16]), "DES");
            Cipher lIIllIIllIIlII = Cipher.getInstance("DES");
            lIIllIIllIIlII.init(llIlIIllI[6], lIIllIIllIIlIl);
            return new String(lIIllIIllIIlII.doFinal(Base64.getDecoder().decode(lIIllIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIllIIIll) {
            lIIllIIllIIIll.printStackTrace();
            return null;
        }
    }

    public static void a(String str, String[] strArr, boolean z) {
        if (lIllIIIllllI(C0004e.j(llIlIIllI[0]), llIlIIllI[1]) && lIllIIIlllll(Dialog.canContinue() ? 1 : 0) && lIllIIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llIlIIllI[2]];
            strArr2[llIlIIllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIllIIlIIIII(all.size())) {
                ((NPC) all.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[7]]);
                Time.sleepTicks(llIlIIllI[4]);
                "".length();
            }
        }
        if (lIllIIIlllll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llIlIIllI[2]];
            strArr3[llIlIIllI[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIllIIlIIIII(all2.size())) {
                if (lIllIIIlllll(Reachable.isInteractable((Locatable) all2.get(llIlIIllI[3])) ? 1 : 0)) {
                    Movement.walkTo(((NPC) all2.get(llIlIIllI[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks(llIlIIllI[2]);
                    "".length();
                }
                if (lIllIIlIIIIl(Reachable.isInteractable((Locatable) all2.get(llIlIIllI[3])) ? 1 : 0)) {
                    ((NPC) all2.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[8]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llIlIIllI[5]);
                    "".length();
                }
            }
        }
        if (lIllIIIlllll(Dialog.isOpen() ? 1 : 0) && lIllIIIlllll(Dialog.canContinue() ? 1 : 0) && lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && !lIllIIlIIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderGWD.c = llIlIIlIl[llIlIIllI[4]];
        if (lIllIIlIIIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && lIllIIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || lIllIIlIIIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    public static void a(String str, String[] strArr) {
        if (lIllIIIllllI(C0004e.j(llIlIIllI[0]), llIlIIllI[1]) && lIllIIIlllll(Dialog.canContinue() ? 1 : 0) && lIllIIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llIlIIllI[2]];
            strArr2[llIlIIllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIllIIlIIIII(all.size())) {
                ((NPC) all.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[3]]);
                Time.sleepTicks(llIlIIllI[4]);
                "".length();
            }
        }
        if (lIllIIIlllll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llIlIIllI[2]];
            strArr3[llIlIIllI[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIllIIlIIIII(all2.size())) {
                ((NPC) all2.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[2]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llIlIIllI[5]);
                "".length();
            }
        }
        if (lIllIIIlllll(Dialog.isOpen() ? 1 : 0) && lIllIIIlllll(Dialog.canContinue() ? 1 : 0) && lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && !lIllIIlIIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderGWD.c = llIlIIlIl[llIlIIllI[6]];
        if (lIllIIlIIIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && lIllIIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || lIllIIlIIIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    static {
        lIllIIIlllIl();
        lIllIIIlllII();
        bq = llIlIIllI[11];
        bt = llIlIIllI[12];
        bs = llIlIIllI[13];
        bp = llIlIIllI[14];
        br = llIlIIllI[15];
        int[] iArr = new int[llIlIIllI[4]];
        iArr[llIlIIllI[3]] = llIlIIllI[14];
        iArr[llIlIIllI[2]] = llIlIIllI[11];
        iArr[llIlIIllI[6]] = llIlIIllI[15];
        iArr[llIlIIllI[7]] = llIlIIllI[13];
        iArr[llIlIIllI[8]] = llIlIIllI[12];
        bu = iArr;
    }

    private static boolean lIllIIlIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIllIIIllllI(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIIlllIl() {
        llIlIIllI = new int[17];
        llIlIIllI[0] = (-25281) & 25561;
        llIlIIllI[1] = (-9217) & 10216;
        llIlIIllI[2] = " ".length();
        llIlIIllI[3] = (96 ^ 102) & ((145 ^ 151) ^ (-1));
        llIlIIllI[4] = 43 ^ 46;
        llIlIIllI[5] = (-5121) & 8120;
        llIlIIllI[6] = "  ".length();
        llIlIIllI[7] = "   ".length();
        llIlIIllI[8] = (((52 + 27) - 34) + 136) ^ (((7 + 135) - 126) + 161);
        llIlIIllI[9] = (180 ^ 141) ^ (157 ^ 162);
        llIlIIllI[10] = 27 ^ 28;
        llIlIIllI[11] = (((((74 + 111) - 100) + 71) + (((96 + 157) - 183) + 122)) - (((224 + 13) - 131) + 148)) + ((29 + 81) - 36) + 63;
        llIlIIllI[12] = ((108 + 170) - 79) + 30;
        llIlIIllI[13] = (("  ".length() + (((68 + 35) - 91) + 163)) - (((140 + 155) - 167) + 35)) + ((69 + 67) - 105) + 174;
        llIlIIllI[14] = (((((35 + 46) - (-76)) + 20) + (156 ^ 193)) - ((-11345) & 11613)) + ((87 + 9) - (-59)) + 37;
        llIlIIllI[15] = (((35 ^ 13) + (214 ^ 195)) - (-(44 ^ 74))) + (48 ^ 0);
        llIlIIllI[16] = (((39 + 1) - 13) + 103) ^ (((122 + 41) - 131) + 106);
    }

    private static void lIllIIIlllII() {
        llIlIIlIl = new String[llIlIIllI[16]];
        llIlIIlIl[llIlIIllI[3]] = lIllIIIllIlI("fZbu9lwqjkk=", "ozXHO");
        llIlIIlIl[llIlIIllI[2]] = lIllIIIllIll("CHTdMpBsHUg=", "ALJNq");
        llIlIIlIl[llIlIIllI[6]] = lIllIIIllIll("QbX3kFVshEABwYJzAEw/Aw==", "mhcYK");
        llIlIIlIl[llIlIIllI[7]] = lIllIIIllIlI("yS3+977B8gQ=", "lIbBT");
        llIlIIlIl[llIlIIllI[8]] = lIllIIIllIlI("Kh7lsZVa0p8=", "QJEzb");
        llIlIIlIl[llIlIIllI[4]] = lIllIIIllIll("K3DYo6RksKbukK+LIPMA/A==", "fzooq");
        llIlIIlIl[llIlIIllI[9]] = lIllIIIllIlI("+coMjzNRMPU=", "wjmtT");
        llIlIIlIl[llIlIIllI[10]] = lIllIIIllIlI("mTDdEYPkhHEoZ7ecjAPdHg==", "CBzjD");
    }

    public static void b(String str, String[] strArr) {
        if (lIllIIIlllll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr2 = new String[llIlIIllI[2]];
            strArr2[llIlIIllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIllIIlIIIII(all.size())) {
                ((NPC) all.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[9]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llIlIIllI[5]);
                "".length();
            }
        }
        do {
            if (lIllIIIlllll(Dialog.isOpen() ? 1 : 0) && lIllIIIlllll(Dialog.canContinue() ? 1 : 0) && lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && !lIllIIlIIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
                return;
            }
            try {
                AccBuilderGWD.c = llIlIIlIl[llIlIIllI[10]];
                if (lIllIIlIIIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && lIllIIIlllll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                if (!lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || lIllIIlIIIIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks(llIlIIllI[2]);
                "".length();
                "".length();
                if (0 != 0) {
                    return;
                }
            } catch (Exception e) {
            }
            Time.sleepTicks(llIlIIllI[2]);
            "".length();
            "".length();
        } while ((-((((78 + 124) - 121) + 65) ^ (((47 + 79) - 94) + 118))) < 0);
    }

    private static boolean lIllIIlIIIII(int i) {
        return i > 0;
    }

    private static String lIllIIIllIlI(String lIIllIIlIlIlIl, String lIIllIIlIlIlII) {
        try {
            SecretKeySpec lIIllIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIllI[6], lIIllIIlIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIllIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIlIlIllI) {
            lIIllIIlIlIllI.printStackTrace();
            return null;
        }
    }
}
