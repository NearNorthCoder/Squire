/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

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

public class M {
    private static /* synthetic */ int[] lIlIIlIIIIlII;
    private static /* synthetic */ String[] lIlIIlIIIIIll;

    private static String lIlllIIIllIlIlI(String llllllllllllllIlllIIIIlIlIllIlll, String llllllllllllllIlllIIIIlIlIlllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlIlIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIIlII[2]), "DES");
            Cipher llllllllllllllIlllIIIIlIlIlllIll = Cipher.getInstance("DES");
            llllllllllllllIlllIIIIlIlIlllIll.init(lIlIIlIIIIlII[4], llllllllllllllIlllIIIIlIlIllllII);
            return new String(llllllllllllllIlllIIIIlIlIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIlIlIlllIlI) {
            llllllllllllllIlllIIIIlIlIlllIlI.printStackTrace();
            return null;
        }
    }

    public static int a(int n2, int n3) {
        if (M.lIlllIIIlllIIII(n2, n3)) {
            throw new IllegalArgumentException(lIlIIlIIIIIll[lIlIIlIIIIlII[4]]);
        }
        Random random = new Random();
        return random.nextInt(n3 - n2 + lIlIIlIIIIlII[0]) + n2;
    }

    static {
        M.lIlllIIIllIllII();
        M.lIlllIIIllIlIll();
    }

    public static boolean J() {
        return Dialog.isViewingOptions();
    }

    public static boolean a(int n2, int n3, String string) {
        Widget widget = Widgets.get((int)n2, (int)n3);
        if (M.lIlllIIIllIllIl(widget) && M.lIlllIIIllIlllI(widget.isVisible() ? 1 : 0)) {
            widget.interact(string);
            return lIlIIlIIIIlII[0];
        }
        return lIlIIlIIIIlII[1];
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int n2) {
        void llllllllllllllIlllIIIIlIlllIIIII;
        int n3 = M.a(lIlIIlIIIIlII[0], lIlIIlIIIIlII[2]);
        System.out.println(lIlIIlIIIIIll[lIlIIlIIIIlII[1]]);
        int llllllllllllllIlllIIIIlIllIlllll = lIlIIlIIIIlII[1];
        while (M.lIlllIIIllIllll(llllllllllllllIlllIIIIlIllIlllll, (int)llllllllllllllIlllIIIIlIlllIIIII)) {
            int llllllllllllllIlllIIIIlIlllIIIIl;
            Widget llllllllllllllIlllIIIIlIllIllllI = Widgets.get((int)lIlIIlIIIIlII[3], (int)llllllllllllllIlllIIIIlIlllIIIIl);
            System.out.println(llllllllllllllIlllIIIIlIlllIIIIl);
            if (M.lIlllIIIllIllIl(llllllllllllllIlllIIIIlIllIllllI)) {
                llllllllllllllIlllIIIIlIllIllllI.interact(lIlIIlIIIIIll[lIlIIlIIIIlII[0]]);
            }
            ++llllllllllllllIlllIIIIlIllIlllll;
            "".length();
            if (-" ".length() < 0) continue;
            return;
        }
    }

    private static boolean lIlllIIIlllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlllIIIllIlIll() {
        lIlIIlIIIIIll = new String[lIlIIlIIIIlII[6]];
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[1]] = M.lIlllIIIllIlIII("EhUrLAQ1GSkuRycVJj0SMxU=", "ApGIg");
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[0]] = M.lIlllIIIllIlIIl("+MOq+u+GzOw=", "nuDqM");
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[4]] = M.lIlllIIIllIlIlI("Sfn8dI/pIriyfiafV6BNJ4W1CKlFs3XJ85HHRMtqU88=", "kydyS");
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[5]] = M.lIlllIIIllIlIlI("p1RGMLv76b3/OQ35SQsX7faRFm1cr6v871A8+5CI2fCtfcQroI/PjA==", "XtNHH");
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[7]] = M.lIlllIIIllIlIII("ORE3FxcdDSQRWhUWIxZaGgZwCxRYFyILChQGJBFaFwVwShMWF3ASGwoGPhZWWAo+FlobCzkOHlRDAxYIEQ03QhsbFzkNFFFN", "xcPbz");
    }

    private static void lIlllIIIllIllII() {
        lIlIIlIIIIlII = new int[8];
        M.lIlIIlIIIIlII[0] = " ".length();
        M.lIlIIlIIIIlII[1] = (0x2D ^ 8) & ~(0x10 ^ 0x35);
        M.lIlIIlIIIIlII[2] = 0x50 ^ 0x3D ^ (0x74 ^ 0x11);
        M.lIlIIlIIIIlII[3] = 0xFFFFCEB7 & 0x33EF;
        M.lIlIIlIIIIlII[4] = "  ".length();
        M.lIlIIlIIIIlII[5] = "   ".length();
        M.lIlIIlIIIIlII[6] = 72 + 73 - 9 + 10 ^ 103 + 111 - 110 + 47;
        M.lIlIIlIIIIlII[7] = 0x2F ^ 0x2B;
    }

    public static boolean I() {
        boolean bl;
        if (!M.lIlllIIIlllIIIl(Dialog.canContinueTutIsland() ? 1 : 0) || !M.lIlllIIIlllIIIl(Dialog.canContinueTutIsland2() ? 1 : 0) || !M.lIlllIIIlllIIIl(Dialog.canContinueTutIsland3() ? 1 : 0) || M.lIlllIIIllIlllI(Dialog.canContinue() ? 1 : 0)) {
            bl = lIlIIlIIIIlII[0];
            "".length();
            if ("  ".length() > (0x60 ^ 0x37 ^ (0x21 ^ 0x72))) {
                return ((0x78 ^ 0x1A ^ (0x71 ^ 0x1E)) & (0x6A ^ 0x6E ^ (0x94 ^ 0x9D) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIIlIIIIlII[1];
        }
        return bl;
    }

    private static boolean lIlllIIIlllIIIl(int n2) {
        return n2 == 0;
    }

    public static boolean b(Object ... objectArray) {
        Object[] llllllllllllllIlllIIIIlIllIlIIlI;
        if (M.lIlllIIIllIlllI(objectArray.length % lIlIIlIIIIlII[5])) {
            throw new IllegalArgumentException(lIlIIlIIIIIll[lIlIIlIIIIlII[7]]);
        }
        int llllllllllllllIlllIIIIlIllIlIIIl = lIlIIlIIIIlII[1];
        while (M.lIlllIIIllIllll(llllllllllllllIlllIIIIlIllIlIIIl, llllllllllllllIlllIIIIlIllIlIIlI.length)) {
            int llllllllllllllIlllIIIIlIllIlIIII = (Integer)llllllllllllllIlllIIIIlIllIlIIlI[llllllllllllllIlllIIIIlIllIlIIIl];
            int llllllllllllllIlllIIIIlIllIIllll = (Integer)llllllllllllllIlllIIIIlIllIlIIlI[llllllllllllllIlllIIIIlIllIlIIIl + lIlIIlIIIIlII[0]];
            String llllllllllllllIlllIIIIlIllIIlllI = (String)llllllllllllllIlllIIIIlIllIlIIlI[llllllllllllllIlllIIIIlIllIlIIIl + lIlIIlIIIIlII[4]];
            if (M.lIlllIIIllIlllI(M.c(llllllllllllllIlllIIIIlIllIlIIII, llllllllllllllIlllIIIIlIllIIllll) ? 1 : 0)) {
                M.a(llllllllllllllIlllIIIIlIllIlIIII, llllllllllllllIlllIIIIlIllIIllll, llllllllllllllIlllIIIIlIllIIlllI);
                "".length();
                return lIlIIlIIIIlII[0];
            }
            llllllllllllllIlllIIIIlIllIlIIIl += 3;
            "".length();
            if (((0xC2 ^ 0xC6) & ~(0x3D ^ 0x39)) < " ".length()) continue;
            return ((0x46 ^ 8) & ~(0x4D ^ 3)) != 0;
        }
        return lIlIIlIIIIlII[1];
    }

    private static boolean lIlllIIIllIlllI(int n2) {
        return n2 != 0;
    }

    public static int G() {
        System.out.println(lIlIIlIIIIIll[lIlIIlIIIIlII[5]]);
        return M.a(lIlIIlIIIIlII[0], lIlIIlIIIIlII[6]);
    }

    public static String b(int n2, int n3) {
        Widget widget = Widgets.get((int)n2, (int)n3);
        if (M.lIlllIIIllIllIl(widget) && M.lIlllIIIllIlllI(widget.isVisible() ? 1 : 0)) {
            return widget.getText();
        }
        return null;
    }

    private static boolean lIlllIIIllIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlllIIIllIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllIIIllIlIIl(String llllllllllllllIlllIIIIlIllIIIllI, String llllllllllllllIlllIIIIlIllIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlIllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIIlIllIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIIlIllIIlIII.init(lIlIIlIIIIlII[4], llllllllllllllIlllIIIIlIllIIlIIl);
            return new String(llllllllllllllIlllIIIIlIllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIlIllIIIlll) {
            llllllllllllllIlllIIIIlIllIIIlll.printStackTrace();
            return null;
        }
    }

    public static boolean c(int n2, int n3) {
        int n4;
        if (M.lIlllIIIllIllIl(Widgets.get((int)n2, (int)n3)) && M.lIlllIIIllIlllI(Widgets.get((int)n2, (int)n3).isVisible() ? 1 : 0)) {
            n4 = lIlIIlIIIIlII[0];
            "".length();
            if ((0x41 ^ 0x32 ^ (0x1A ^ 0x6D)) <= 0) {
                return ((0 ^ 0x26 ^ (0x5B ^ 0x69)) & (54 + 143 - 113 + 103 ^ 57 + 46 - 40 + 112 ^ -" ".length())) != 0;
            }
        } else {
            n4 = lIlIIlIIIIlII[1];
        }
        return n4 != 0;
    }

    public static boolean H() {
        return Dialog.isOpen();
    }

    private static String lIlllIIIllIlIII(String llllllllllllllIlllIIIIlIlIlIlIIl, String llllllllllllllIlllIIIIlIlIlIlIII) {
        llllllllllllllIlllIIIIlIlIlIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIIlIlIlIIlll = new StringBuilder();
        char[] llllllllllllllIlllIIIIlIlIlIIllI = llllllllllllllIlllIIIIlIlIlIlIII.toCharArray();
        int llllllllllllllIlllIIIIlIlIlIIlIl = lIlIIlIIIIlII[1];
        char[] llllllllllllllIlllIIIIlIlIIlllll = llllllllllllllIlllIIIIlIlIlIlIIl.toCharArray();
        int llllllllllllllIlllIIIIlIlIIllllI = llllllllllllllIlllIIIIlIlIIlllll.length;
        int llllllllllllllIlllIIIIlIlIIlllIl = lIlIIlIIIIlII[1];
        while (M.lIlllIIIllIllll(llllllllllllllIlllIIIIlIlIIlllIl, llllllllllllllIlllIIIIlIlIIllllI)) {
            char llllllllllllllIlllIIIIlIlIlIlIlI = llllllllllllllIlllIIIIlIlIIlllll[llllllllllllllIlllIIIIlIlIIlllIl];
            llllllllllllllIlllIIIIlIlIlIIlll.append((char)(llllllllllllllIlllIIIIlIlIlIlIlI ^ llllllllllllllIlllIIIIlIlIlIIllI[llllllllllllllIlllIIIIlIlIlIIlIl % llllllllllllllIlllIIIIlIlIlIIllI.length]));
            "".length();
            ++llllllllllllllIlllIIIIlIlIlIIlIl;
            ++llllllllllllllIlllIIIIlIlIIlllIl;
            "".length();
            if ("  ".length() == "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIIIlIlIlIIlll);
    }
}

