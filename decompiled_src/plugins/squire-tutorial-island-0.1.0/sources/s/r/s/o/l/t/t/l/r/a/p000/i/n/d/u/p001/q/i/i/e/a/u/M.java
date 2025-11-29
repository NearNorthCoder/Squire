package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/M.class */
public class M {
    private static /* synthetic */ int[] lIlIIlIIIIlII;
    private static /* synthetic */ String[] lIlIIlIIIIIll;

    private static String lIlllIIIllIlIlI(String llllllllllllllIlllIIIIlIlIlllIIl, String llllllllllllllIlllIIIIlIlIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIIlII[2]), "DES");
            Cipher llllllllllllllIlllIIIIlIlIlllIll = Cipher.getInstance("DES");
            llllllllllllllIlllIIIIlIlIlllIll.init(lIlIIlIIIIlII[4], secretKeySpec);
            return new String(llllllllllllllIlllIIIIlIlIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIlIlIlllIlI) {
            llllllllllllllIlllIIIIlIlIlllIlI.printStackTrace();
            return null;
        }
    }

    public static int a(int i, int i2) {
        if (lIlllIIIlllIIII(i, i2)) {
            throw new IllegalArgumentException(lIlIIlIIIIIll[lIlIIlIIIIlII[4]]);
        }
        return new Random().nextInt((i2 - i) + lIlIIlIIIIlII[0]) + i;
    }

    static {
        lIlllIIIllIllII();
        lIlllIIIllIlIll();
    }

    public static boolean J() {
        return Dialog.isViewingOptions();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean a(int i, int i2, String str) {
        Widget widget = Widgets.get(i, i2);
        if (lIlllIIIllIllIl(widget) && lIlllIIIllIlllI(widget.isVisible() ? 1 : 0)) {
            widget.interact(str);
            return lIlIIlIIIIlII[0];
        }
        return lIlIIlIIIIlII[1];
    }

    public static void b(int i) {
        int a = a(lIlIIlIIIIlII[0], lIlIIlIIIIlII[2]);
        System.out.println(lIlIIlIIIIIll[lIlIIlIIIIlII[1]]);
        int i2 = lIlIIlIIIIlII[1];
        while (lIlllIIIllIllll(i2, a)) {
            Widget widget = Widgets.get(lIlIIlIIIIlII[3], i);
            System.out.println(i);
            if (lIlllIIIllIllIl(widget)) {
                widget.interact(lIlIIlIIIIIll[lIlIIlIIIIlII[0]]);
            }
            i2++;
            "".length();
            if ((-" ".length()) >= 0) {
                return;
            }
        }
    }

    private static boolean lIlllIIIlllIIII(int i, int i2) {
        return i >= i2;
    }

    private static void lIlllIIIllIlIll() {
        lIlIIlIIIIIll = new String[lIlIIlIIIIlII[6]];
        lIlIIlIIIIIll[lIlIIlIIIIlII[1]] = lIlllIIIllIlIII("EhUrLAQ1GSkuRycVJj0SMxU=", "ApGIg");
        lIlIIlIIIIIll[lIlIIlIIIIlII[0]] = lIlllIIIllIlIIl("+MOq+u+GzOw=", "nuDqM");
        lIlIIlIIIIIll[lIlIIlIIIIlII[4]] = lIlllIIIllIlIlI("Sfn8dI/pIriyfiafV6BNJ4W1CKlFs3XJ85HHRMtqU88=", "kydyS");
        lIlIIlIIIIIll[lIlIIlIIIIlII[5]] = lIlllIIIllIlIlI("p1RGMLv76b3/OQ35SQsX7faRFm1cr6v871A8+5CI2fCtfcQroI/PjA==", "XtNHH");
        lIlIIlIIIIIll[lIlIIlIIIIlII[7]] = lIlllIIIllIlIII("ORE3FxcdDSQRWhUWIxZaGgZwCxRYFyILChQGJBFaFwVwShMWF3ASGwoGPhZWWAo+FlobCzkOHlRDAxYIEQ03QhsbFzkNFFFN", "xcPbz");
    }

    private static void lIlllIIIllIllII() {
        lIlIIlIIIIlII = new int[8];
        lIlIIlIIIIlII[0] = " ".length();
        lIlIIlIIIIlII[1] = (45 ^ 8) & ((16 ^ 53) ^ (-1));
        lIlIIlIIIIlII[2] = (80 ^ 61) ^ (116 ^ 17);
        lIlIIlIIIIlII[3] = (-12617) & 13295;
        lIlIIlIIIIlII[4] = "  ".length();
        lIlIIlIIIIlII[5] = "   ".length();
        lIlIIlIIIIlII[6] = (((72 + 73) - 9) + 10) ^ (((103 + 111) - 110) + 47);
        lIlIIlIIIIlII[7] = 47 ^ 43;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public static boolean I() {
        if (lIlllIIIlllIIIl(Dialog.canContinueTutIsland() ? 1 : 0) && lIlllIIIlllIIIl(Dialog.canContinueTutIsland2() ? 1 : 0) && lIlllIIIlllIIIl(Dialog.canContinueTutIsland3() ? 1 : 0) && !lIlllIIIllIlllI(Dialog.canContinue() ? 1 : 0)) {
            return lIlIIlIIIIlII[1];
        }
        ?? r0 = lIlIIlIIIIlII[0];
        "".length();
        return "  ".length() > ((96 ^ 55) ^ (33 ^ 114)) ? ((120 ^ 26) ^ (113 ^ 30)) & (((106 ^ 110) ^ (148 ^ 157)) ^ (-" ".length())) : r0;
    }

    private static boolean lIlllIIIlllIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public static boolean b(Object... objArr) {
        if (lIlllIIIllIlllI(objArr.length % lIlIIlIIIIlII[5])) {
            throw new IllegalArgumentException(lIlIIlIIIIIll[lIlIIlIIIIlII[7]]);
        }
        int i = lIlIIlIIIIlII[1];
        while (lIlllIIIllIllll(i, objArr.length)) {
            int intValue = ((Integer) objArr[i]).intValue();
            int intValue2 = ((Integer) objArr[i + lIlIIlIIIIlII[0]]).intValue();
            String str = (String) objArr[i + lIlIIlIIIIlII[4]];
            if (lIlllIIIllIlllI(c(intValue, intValue2) ? 1 : 0)) {
                a(intValue, intValue2, str);
                "".length();
                return lIlIIlIIIIlII[0];
            }
            i += 3;
            "".length();
            if (((194 ^ 198) & ((61 ^ 57) ^ (-1))) >= " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIIlIIIIlII[1];
    }

    private static boolean lIlllIIIllIlllI(int i) {
        return i != 0;
    }

    public static int G() {
        System.out.println(lIlIIlIIIIIll[lIlIIlIIIIlII[5]]);
        return a(lIlIIlIIIIlII[0], lIlIIlIIIIlII[6]);
    }

    public static String b(int i, int i2) {
        Widget widget = Widgets.get(i, i2);
        if (lIlllIIIllIllIl(widget) && lIlllIIIllIlllI(widget.isVisible() ? 1 : 0)) {
            return widget.getText();
        }
        return null;
    }

    private static boolean lIlllIIIllIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlllIIIllIllll(int i, int i2) {
        return i < i2;
    }

    private static String lIlllIIIllIlIIl(String llllllllllllllIlllIIIIlIllIIIllI, String llllllllllllllIlllIIIIlIllIIIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlIllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIIlIllIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIIlIllIIlIII.init(lIlIIlIIIIlII[4], llllllllllllllIlllIIIIlIllIIlIIl);
            return new String(llllllllllllllIlllIIIIlIllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIlIllIIIlll) {
            llllllllllllllIlllIIIIlIllIIIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean c(int i, int i2) {
        if (lIlllIIIllIllIl(Widgets.get(i, i2)) && lIlllIIIllIlllI(Widgets.get(i, i2).isVisible() ? 1 : 0)) {
            ?? r0 = lIlIIlIIIIlII[0];
            "".length();
            return ((65 ^ 50) ^ (26 ^ 109)) <= 0 ? ((0 ^ 38) ^ (91 ^ 105)) & (((((54 + 143) - 113) + 103) ^ (((57 + 46) - 40) + 112)) ^ (-" ".length())) : r0;
        }
        return lIlIIlIIIIlII[1];
    }

    public static boolean H() {
        return Dialog.isOpen();
    }

    private static String lIlllIIIllIlIII(String llllllllllllllIlllIIIIlIlIlIlIIl, String llllllllllllllIlllIIIIlIlIlIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIIIIlIlIlIIllI = llllllllllllllIlllIIIIlIlIlIlIII.toCharArray();
        int llllllllllllllIlllIIIIlIlIlIIlIl = lIlIIlIIIIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIIIlII[1];
        while (lIlllIIIllIllll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIIIIlIlIlIIllI[llllllllllllllIlllIIIIlIlIlIIlIl % llllllllllllllIlllIIIIlIlIlIIllI.length]));
            "".length();
            llllllllllllllIlllIIIIlIlIlIIlIl++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
