package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/g.class */
public class C0006g {
    private static final /* synthetic */ int br;
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int bs;
    private static final /* synthetic */ int bp;
    private static /* synthetic */ int[] llIIIllI;
    private static /* synthetic */ String[] llIIIlIl;
    private static final /* synthetic */ int[] bt;
    private static final /* synthetic */ int bo;

    private static boolean lIlIIlIlllI(int i) {
        return i != 0;
    }

    public static void a(String str, String[] strArr) {
        if (lIlIIlIlIll(C0004e.j(llIIIllI[0]), llIIIllI[1]) && lIlIIlIllII(Dialog.canContinue() ? 1 : 0) && lIlIIlIllII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llIIIllI[2]];
            strArr2[llIIIllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlIIlIllIl(all.size())) {
                ((NPC) all.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[3]]);
                Time.sleepTicks(llIIIllI[4]);
                "".length();
            }
        }
        if (lIlIIlIllII(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llIIIllI[2]];
            strArr3[llIIIllI[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIlIIlIllIl(all2.size())) {
                ((NPC) all2.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[2]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llIIIllI[5]);
                "".length();
            }
        }
        if (lIlIIlIllII(Dialog.isOpen() ? 1 : 0) && lIlIIlIllII(Dialog.canContinue() ? 1 : 0) && lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && !lIlIIlIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderBarrows.c = llIIIlIl[llIIIllI[6]];
        if (lIlIIlIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && lIlIIlIllII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIlIIlIlIll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIlIIllI(String lIlIlIlllIIIllI, String lIlIlIlllIIIlIl) {
        String lIlIlIlllIIIllI2 = new String(Base64.getDecoder().decode(lIlIlIlllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlIlIlllIIIIll = lIlIlIlllIIIlIl.toCharArray();
        int lIlIlIlllIIIIlI = llIIIllI[3];
        char[] charArray = lIlIlIlllIIIllI2.toCharArray();
        int length = charArray.length;
        int i = llIIIllI[3];
        while (lIlIIlIlIll(i, length)) {
            sb.append((char) (charArray[i] ^ lIlIlIlllIIIIll[lIlIlIlllIIIIlI % lIlIlIlllIIIIll.length]));
            "".length();
            lIlIlIlllIIIIlI++;
            i++;
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIIlIlIlI();
        lIlIIlIlIIl();
        bo = llIIIllI[11];
        bq = llIIIllI[12];
        br = llIIIllI[13];
        bp = llIIIllI[14];
        bs = llIIIllI[15];
        int[] iArr = new int[llIIIllI[4]];
        iArr[llIIIllI[3]] = llIIIllI[11];
        iArr[llIIIllI[2]] = llIIIllI[14];
        iArr[llIIIllI[6]] = llIIIllI[12];
        iArr[llIIIllI[7]] = llIIIllI[13];
        iArr[llIIIllI[8]] = llIIIllI[15];
        bt = iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean L() {
        int i = llIIIllI[3];
        while (lIlIIlIlIll(i, bt.length)) {
            List list = Widgets.get(bt[i]);
            if (lIlIIlIllII(list.isEmpty() ? 1 : 0) && lIlIIlIlllI(((Widget) list.get(llIIIllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bt[i]);
                return llIIIllI[2];
            }
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return ((115 ^ 30) ^ (247 ^ 188)) & (((112 ^ 49) ^ (11 ^ 108)) ^ (-" ".length()));
            }
        }
        return llIIIllI[3];
    }

    private static String lIlIIlIIlll(String lIlIlIllIllIIIl, String lIlIlIllIlIlllI) {
        try {
            SecretKeySpec lIlIlIllIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIllIlIlllI.getBytes(StandardCharsets.UTF_8)), llIIIllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllI[6], lIlIlIllIllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIllIllIIlI) {
            lIlIlIllIllIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlIlIII(String lIlIlIlllIlIllI, String lIlIlIlllIlIlIl) {
        try {
            SecretKeySpec lIlIlIlllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIlllIllIII = Cipher.getInstance("Blowfish");
            lIlIlIlllIllIII.init(llIIIllI[6], lIlIlIlllIllIIl);
            return new String(lIlIlIlllIllIII.doFinal(Base64.getDecoder().decode(lIlIlIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIlllIlIlll) {
            lIlIlIlllIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllIl(int i) {
        return i > 0;
    }

    private static void lIlIIlIlIIl() {
        llIIIlIl = new String[llIIIllI[16]];
        llIIIlIl[llIIIllI[3]] = lIlIIlIIllI("AzMaDngjPQ==", "WRveU");
        llIIIlIl[llIIIllI[2]] = lIlIIlIIllI("LjgHHHkONg==", "zYkwT");
        llIIIlIl[llIIIllI[6]] = lIlIIlIIlll("calIIsBu6siRB7EtIm9EBw==", "pzlLi");
        llIIIlIl[llIIIllI[7]] = lIlIIlIIlll("DlLqCdIfFXA=", "uavmf");
        llIIIlIl[llIIIllI[8]] = lIlIIlIlIII("0Z95SdhD39M=", "jzvXJ");
        llIIIlIl[llIIIllI[4]] = lIlIIlIIllI("MgolCgQYDC1FExgDJgoQ", "qbJew");
        llIIIlIl[llIIIllI[9]] = lIlIIlIIlll("6f9WumxWViA=", "GGLIz");
        llIIIlIl[llIIIllI[10]] = lIlIIlIlIII("Tu/UnOjnu8LF57O7vu5tAQ==", "CSyoq");
    }

    public static void b(String str, String[] strArr) {
        if (lIlIIlIllII(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr2 = new String[llIIIllI[2]];
            strArr2[llIIIllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlIIlIllIl(all.size())) {
                ((NPC) all.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[9]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llIIIllI[5]);
                "".length();
            }
        }
        do {
            if (lIlIIlIllII(Dialog.isOpen() ? 1 : 0) && lIlIIlIllII(Dialog.canContinue() ? 1 : 0) && lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && !lIlIIlIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
                return;
            }
            try {
                AccBuilderBarrows.c = llIIIlIl[llIIIllI[10]];
                if (lIlIIlIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && lIlIIlIllII(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                if (!lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks(llIIIllI[2]);
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            } catch (Exception e) {
            }
            Time.sleepTicks(llIIIllI[2]);
            "".length();
            "".length();
        } while (0 == 0);
    }

    private static void lIlIIlIlIlI() {
        llIIIllI = new int[17];
        llIIIllI[0] = (-8385) & 8665;
        llIIIllI[1] = (-30740) & 31739;
        llIIIllI[2] = " ".length();
        llIIIllI[3] = ((118 ^ 6) ^ (193 ^ 184)) & (((((114 + 14) - (-6)) + 3) ^ (((9 + 42) - (-40)) + 37)) ^ (-" ".length()));
        llIIIllI[4] = (23 ^ 16) ^ "  ".length();
        llIIIllI[5] = (-2) & 3001;
        llIIIllI[6] = "  ".length();
        llIIIllI[7] = "   ".length();
        llIIIllI[8] = (233 ^ 156) ^ (238 ^ 159);
        llIIIllI[9] = (((5 + 40) - 1) + 122) ^ (((16 + 38) - (-1)) + 105);
        llIIIllI[10] = (113 ^ 126) ^ (143 ^ 135);
        llIIIllI[11] = (((70 ^ 27) + (((43 + 90) - 77) + 101)) - (((193 + 167) - 355) + 212)) + ((68 + 60) - 83) + 115;
        llIIIllI[12] = ((21 + 61) - 49) + 184;
        llIIIllI[13] = (((((176 + 141) - 310) + 193) + (134 ^ 198)) - (((218 + 65) - 280) + 220)) + ((98 + 95) - 77) + 62;
        llIIIllI[14] = ((146 + 209) - 328) + 204;
        llIIIllI[15] = (((((55 + 33) - (-48)) + 7) + (((17 + 42) - (-18)) + 102)) - (((117 + 136) - 193) + 82)) + (34 ^ 19);
        llIIIllI[16] = 139 ^ 131;
    }

    public static void a(String str, String[] strArr, boolean z) {
        if (lIlIIlIlIll(C0004e.j(llIIIllI[0]), llIIIllI[1]) && lIlIIlIllII(Dialog.canContinue() ? 1 : 0) && lIlIIlIllII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llIIIllI[2]];
            strArr2[llIIIllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlIIlIllIl(all.size())) {
                ((NPC) all.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[7]]);
                Time.sleepTicks(llIIIllI[4]);
                "".length();
            }
        }
        if (lIlIIlIllII(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llIIIllI[2]];
            strArr3[llIIIllI[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIlIIlIllIl(all2.size())) {
                if (lIlIIlIllII(Reachable.isInteractable((Locatable) all2.get(llIIIllI[3])) ? 1 : 0)) {
                    Movement.walkTo(((NPC) all2.get(llIIIllI[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks(llIIIllI[2]);
                    "".length();
                }
                if (lIlIIlIlllI(Reachable.isInteractable((Locatable) all2.get(llIIIllI[3])) ? 1 : 0)) {
                    ((NPC) all2.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[8]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llIIIllI[5]);
                    "".length();
                }
            }
        }
        if (lIlIIlIllII(Dialog.isOpen() ? 1 : 0) && lIlIIlIllII(Dialog.canContinue() ? 1 : 0) && lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && !lIlIIlIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderBarrows.c = llIIIlIl[llIIIllI[4]];
        if (lIlIIlIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && lIlIIlIllII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIlIIlIllII(int i) {
        return i == 0;
    }

    public static void a(String[] strArr) {
        if (lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && lIlIIlIllII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}
