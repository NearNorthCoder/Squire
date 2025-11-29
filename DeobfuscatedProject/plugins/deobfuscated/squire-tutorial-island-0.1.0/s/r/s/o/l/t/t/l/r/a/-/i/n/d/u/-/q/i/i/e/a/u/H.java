/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class H
implements o {
    private static /* synthetic */ int[] lIlIIlIIIlIlI;
    private static /* synthetic */ int aE;
    private static /* synthetic */ String[] lIlIIlIIIlIIl;

    private static boolean lIlllIIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIIlIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlllIIIlllllll() {
        lIlIIlIIIlIlI = new int[15];
        H.lIlIIlIIIlIlI[0] = (0xE4 ^ 0xC5) & ~(0x3B ^ 0x1A);
        H.lIlIIlIIIlIlI[1] = 1;
        H.lIlIIlIIIlIlI[2] = -(0xFFFFF555 & 0x5FEB) & (0xFFFFF7E7 & 0x5FFF);
        H.lIlIIlIIIlIlI[3] = 2;
        H.lIlIIlIIIlIlI[4] = 0x75 ^ 0x79;
        H.lIlIIlIIIlIlI[5] = 0x65 ^ 0x68;
        H.lIlIIlIIIlIlI[6] = 0xB4 ^ 0x90 ^ (0x37 ^ 3);
        H.lIlIIlIIIlIlI[7] = 0x9C ^ 0x8D;
        H.lIlIIlIIIlIlI[8] = 0xA3 ^ 0xB7;
        H.lIlIIlIIIlIlI[9] = 0x27 ^ 0x1E ^ (0x93 ^ 0xBF);
        H.lIlIIlIIIlIlI[10] = 0x93 ^ 0xB8;
        H.lIlIIlIIIlIlI[11] = 0x33 ^ 0x42 ^ (0x14 ^ 0x49);
        H.lIlIIlIIIlIlI[12] = 0x41 ^ 0x72;
        H.lIlIIlIIIlIlI[13] = 89 + 28 - 94 + 224 ^ 72 + 151 - 94 + 66;
        H.lIlIIlIIIlIlI[14] = 0x70 ^ 0x34;
    }

    static {
        H.lIlllIIIlllllll();
        H.lIlllIIIllllllI();
    }

    private static boolean lIlllIIlIIIIIIl(Object object) {
        return object != null;
    }

    private static void lIlllIIIllllllI() {
        lIlIIlIIIlIIl = new String[lIlIIlIIIlIlI[3]];
        H.lIlIIlIIIlIIl[H.lIlIIlIIIlIlI[0]] = H."max must be greater than min";
        H.lIlIIlIIIlIIl[H.lIlIIlIIIlIlI[1]] = H."Confirm";
    }

    private static int a(int n2, int n3) {
        if (H.lIlllIIlIIIIIII(n2, n3)) {
            throw new IllegalArgumentException(lIlIIlIIIlIIl[lIlIIlIIIlIlI[0]]);
        }
        Random random = new Random();
        return random.nextInt(n3 - n2 + lIlIIlIIIlIlI[1]) + n2;
    }

    public void E() {
        if (H.lIlllIIlIIIIIIl(Widgets.get((int)lIlIIlIIIlIlI[2], (int)lIlIIlIIIlIlI[3]))) {
            M.b(H.a(lIlIIlIIIlIlI[4], lIlIIlIIIlIlI[5]));
            aE = M.G();
            M.b(H.a(lIlIIlIIIlIlI[6], lIlIIlIIIlIlI[7]));
            aE = M.G();
            M.b(H.a(lIlIIlIIIlIlI[8], lIlIIlIIIlIlI[9]));
            aE = M.G();
            M.b(H.a(lIlIIlIIIlIlI[10], lIlIIlIIIlIlI[11]));
            aE = M.G();
            M.b(H.a(lIlIIlIIIlIlI[12], lIlIIlIIIlIlI[13]));
            aE = M.G();
        }
        aE = M.G();
        Widget llllllllllllllIlllIIIIlIIllIlIII = Widgets.get((int)lIlIIlIIIlIlI[2], (int)lIlIIlIIIlIlI[14]);
        if (H.lIlllIIlIIIIIIl(llllllllllllllIlllIIIIlIIllIlIII)) {
            llllllllllllllIlllIIIIlIIllIlIII.interact(lIlIIlIIIlIIl[lIlIIlIIIlIlI[1]]);
            aE = M.G();
        }
    }

    @Override
    public boolean D() {
        if (H.lIlllIIlIIIIIII(aE, lIlIIlIIIlIlI[1])) {
            aE -= lIlIIlIIIlIlI[1];
            return lIlIIlIIIlIlI[0];
        }
        this.E();
        return lIlIIlIIIlIlI[0];
    }

    private static String lIlllIIIlllllIl(String llllllllllllllIlllIIIIlIIlIlIIII, String llllllllllllllIlllIIIIlIIlIIllll) {
        llllllllllllllIlllIIIIlIIlIlIIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIIlIIlIIlllI = new StringBuilder();
        char[] llllllllllllllIlllIIIIlIIlIIllIl = llllllllllllllIlllIIIIlIIlIIllll.toCharArray();
        int llllllllllllllIlllIIIIlIIlIIllII = lIlIIlIIIlIlI[0];
        char[] llllllllllllllIlllIIIIlIIlIIIllI = llllllllllllllIlllIIIIlIIlIlIIII.toCharArray();
        int llllllllllllllIlllIIIIlIIlIIIlIl = llllllllllllllIlllIIIIlIIlIIIllI.length;
        int llllllllllllllIlllIIIIlIIlIIIlII = lIlIIlIIIlIlI[0];
        while (H.lIlllIIlIIIIIlI(llllllllllllllIlllIIIIlIIlIIIlII, llllllllllllllIlllIIIIlIIlIIIlIl)) {
            char llllllllllllllIlllIIIIlIIlIlIIIl = llllllllllllllIlllIIIIlIIlIIIllI[llllllllllllllIlllIIIIlIIlIIIlII];
            llllllllllllllIlllIIIIlIIlIIlllI.append((char)(llllllllllllllIlllIIIIlIIlIlIIIl ^ llllllllllllllIlllIIIIlIIlIIllIl[llllllllllllllIlllIIIIlIIlIIllII % llllllllllllllIlllIIIIlIIlIIllIl.length]));
            0;
            ++llllllllllllllIlllIIIIlIIlIIllII;
            ++llllllllllllllIlllIIIIlIIlIIIlII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIIIlIIlIIlllI);
    }

    private static String lIlllIIIlllllII(String llllllllllllllIlllIIIIlIIllIIIII, String llllllllllllllIlllIIIIlIIlIlllll) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIIlIIllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIIlIIllIIIlI.init(lIlIIlIIIlIlI[3], llllllllllllllIlllIIIIlIIllIIIll);
            return new String(llllllllllllllIlllIIIIlIIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIlIIllIIIIl) {
            llllllllllllllIlllIIIIlIIllIIIIl.printStackTrace();
            return null;
        }
    }
}

