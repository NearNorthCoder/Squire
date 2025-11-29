/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.an;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ao;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ap;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aq;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ar;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.as;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.at;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class am {
    private /* synthetic */ String cU;
    private static /* synthetic */ int[] lIlIlIlIlIll;
    private /* synthetic */ List<an> cY;
    private /* synthetic */ String cW;
    private static /* synthetic */ String[] lIlIlIlIlIlI;
    private /* synthetic */ String cV;
    private /* synthetic */ boolean cX;

    private static void llIllllIIIllIl() {
        lIlIlIlIlIlI = new String[lIlIlIlIlIll[25]];
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[0]] = am."Set content or add at least one EmbedObject";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[1]] = am."content";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[2]] = am."username";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[3]] = am."avatar_url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[4]] = am."tts";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[5]] = am."title";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[6]] = am."description";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[7]] = am."url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[8]] = am."color";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[9]] = am."text";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[10]] = am."icon_url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[11]] = am."footer";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[12]] = am."url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[13]] = am."image";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[14]] = am."url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[15]] = am."thumbnail";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[16]] = am."name";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[17]] = am."url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[18]] = am."icon_url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[19]] = am."author";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[20]] = am."name";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[21]] = am."value";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[22]] = am."inline";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[23]] = am."fields";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[24]] = am."embeds";
    }

    private static boolean llIllllIIlIIIl(int n2) {
        return n2 == 0;
    }

    public void d(String string) {
        this.cV = string;
    }

    private static boolean llIllllIIlIIII(int n2) {
        return n2 != 0;
    }

    private static String llIllllIIIlIll(String lllllllllllllllIllIIlllllIIllIIl, String lllllllllllllllIllIIlllllIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlllllIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllllIIlIllI.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIll[8]), "DES");
            Cipher lllllllllllllllIllIIlllllIIllIll = Cipher.getInstance("DES");
            lllllllllllllllIllIIlllllIIllIll.init(lIlIlIlIlIll[2], lllllllllllllllIllIIlllllIIlllII);
            return new String(lllllllllllllllIllIIlllllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlllllIIllIlI) {
            lllllllllllllllIllIIlllllIIllIlI.printStackTrace();
            return null;
        }
    }

    public void i(boolean bl2) {
        this.cX = bl2;
    }

    public am() {
        this.cY = new ArrayList<an>();
    }

    static {
        am.llIllllIIIlllI();
        am.llIllllIIIllIl();
    }

    private static String llIllllIIIllII(String lllllllllllllllIllIIlllllIIIllII, String lllllllllllllllIllIIlllllIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIlllllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllllIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlllllIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlllllIIIlllI.init(lIlIlIlIlIll[2], lllllllllllllllIllIIlllllIIIllll);
            return new String(lllllllllllllllIllIIlllllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlllllIIIllIl) {
            lllllllllllllllIllIIlllllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllIIlIIlI(Object object) {
        return object != null;
    }

    public void a(an an2) {
        this.cY.add(an2);
        0;
    }

    private static void llIllllIIIlllI() {
        lIlIlIlIlIll = new int[26];
        am.lIlIlIlIlIll[0] = (0x68 ^ 0x2B) & ~(0xEE ^ 0xAD);
        am.lIlIlIlIlIll[1] = 1;
        am.lIlIlIlIlIll[2] = 2;
        am.lIlIlIlIlIll[3] = 3;
        am.lIlIlIlIlIll[4] = 183 + 170 - 223 + 63 ^ 104 + 29 - -32 + 32;
        am.lIlIlIlIlIll[5] = 0xFD ^ 0xC4 ^ (0x2A ^ 0x16);
        am.lIlIlIlIlIll[6] = 0x71 ^ 0x21 ^ (0x10 ^ 0x46);
        am.lIlIlIlIlIll[7] = 0x4A ^ 0x4D;
        am.lIlIlIlIlIll[8] = 0xFE ^ 0x98 ^ (0xEE ^ 0x80);
        am.lIlIlIlIlIll[9] = 0x6E ^ 0x67;
        am.lIlIlIlIlIll[10] = 0xFA ^ 0x8F ^ 53 + 77 - 57 + 54;
        am.lIlIlIlIlIll[11] = 0xBF ^ 0x9D ^ (0x44 ^ 0x6D);
        am.lIlIlIlIlIll[12] = (0xB4 ^ 0xBA) & ~(0x41 ^ 0x4F) ^ (0x83 ^ 0x8F);
        am.lIlIlIlIlIll[13] = 0x69 ^ 0x51 ^ (0x91 ^ 0xA4);
        am.lIlIlIlIlIll[14] = 0xE6 ^ 0xAB ^ (0xCB ^ 0x88);
        am.lIlIlIlIlIll[15] = 0x5A ^ 0x55;
        am.lIlIlIlIlIll[16] = 70 + 46 - 32 + 75 ^ 94 + 130 - 167 + 86;
        am.lIlIlIlIlIll[17] = 0xAD ^ 0xBC;
        am.lIlIlIlIlIll[18] = 0xCC ^ 0xB6 ^ (0x7E ^ 0x16);
        am.lIlIlIlIlIll[19] = 0x9B ^ 0x8B ^ 3;
        am.lIlIlIlIlIll[20] = 0x42 ^ 0x56;
        am.lIlIlIlIlIll[21] = 6 ^ 0x13;
        am.lIlIlIlIlIll[22] = 0x1E ^ 0x40 ^ (0xEB ^ 0xA3);
        am.lIlIlIlIlIll[23] = 0xB1 ^ 0xA6;
        am.lIlIlIlIlIll[24] = 0x57 ^ 0xE ^ (0xF2 ^ 0xB3);
        am.lIlIlIlIlIll[25] = 0x13 ^ 0xA;
    }

    private static boolean llIllllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    public void e(String string) {
        this.cW = string;
    }

    /*
     * WARNING - void declaration
     */
    public at cC() {
        void var1_1;
        am lllllllllllllllIllIIlllllIlIllll;
        if (am.llIllllIIIllll(this.cU) && am.llIllllIIlIIII(this.cY.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(lIlIlIlIlIlI[lIlIlIlIlIll[0]]);
        }
        at lllllllllllllllIllIIlllllIlIlllI = new at();
        lllllllllllllllIllIIlllllIlIlllI.a(lIlIlIlIlIlI[lIlIlIlIlIll[1]], lllllllllllllllIllIIlllllIlIllll.cU);
        lllllllllllllllIllIIlllllIlIlllI.a(lIlIlIlIlIlI[lIlIlIlIlIll[2]], lllllllllllllllIllIIlllllIlIllll.cV);
        lllllllllllllllIllIIlllllIlIlllI.a(lIlIlIlIlIlI[lIlIlIlIlIll[3]], lllllllllllllllIllIIlllllIlIllll.cW);
        lllllllllllllllIllIIlllllIlIlllI.a(lIlIlIlIlIlI[lIlIlIlIlIll[4]], lllllllllllllllIllIIlllllIlIllll.cX);
        if (am.llIllllIIlIIIl(lllllllllllllllIllIIlllllIlIllll.cY.isEmpty() ? 1 : 0)) {
            ArrayList<at> lllllllllllllllIllIIlllllIlIllIl = new ArrayList<at>();
            Iterator<an> lllllllllllllllIllIIlllllIlIllII = lllllllllllllllIllIIlllllIlIllll.cY.iterator();
            while (am.llIllllIIlIIII(lllllllllllllllIllIIlllllIlIllII.hasNext() ? 1 : 0)) {
                Object lllllllllllllllIllIIlllllIlIIlII;
                Object lllllllllllllllIllIIlllllIlIlIIl;
                an lllllllllllllllIllIIlllllIlIlIll = lllllllllllllllIllIIlllllIlIllII.next();
                at lllllllllllllllIllIIlllllIlIlIlI = new at();
                lllllllllllllllIllIIlllllIlIlIlI.a(lIlIlIlIlIlI[lIlIlIlIlIll[5]], lllllllllllllllIllIIlllllIlIlIll.cD());
                lllllllllllllllIllIIlllllIlIlIlI.a(lIlIlIlIlIlI[lIlIlIlIlIll[6]], lllllllllllllllIllIIlllllIlIlIll.cE());
                lllllllllllllllIllIIlllllIlIlIlI.a(lIlIlIlIlIlI[lIlIlIlIlIll[7]], lllllllllllllllIllIIlllllIlIlIll.cF());
                if (am.llIllllIIlIIlI(lllllllllllllllIllIIlllllIlIlIll.cG())) {
                    lllllllllllllllIllIIlllllIlIlIIl = lllllllllllllllIllIIlllllIlIlIll.cG();
                    int lllllllllllllllIllIIlllllIlIlIII = ((Color)lllllllllllllllIllIIlllllIlIlIIl).getRed();
                    lllllllllllllllIllIIlllllIlIlIII = (lllllllllllllllIllIIlllllIlIlIII << lIlIlIlIlIll[8]) + ((Color)lllllllllllllllIllIIlllllIlIlIIl).getGreen();
                    lllllllllllllllIllIIlllllIlIlIII = (lllllllllllllllIllIIlllllIlIlIII << lIlIlIlIlIll[8]) + ((Color)lllllllllllllllIllIIlllllIlIlIIl).getBlue();
                    lllllllllllllllIllIIlllllIlIlIlI.a(lIlIlIlIlIlI[lIlIlIlIlIll[8]], lllllllllllllllIllIIlllllIlIlIII);
                }
                lllllllllllllllIllIIlllllIlIlIIl = lllllllllllllllIllIIlllllIlIlIll.cH();
                ar lllllllllllllllIllIIlllllIlIlIII = lllllllllllllllIllIIlllllIlIlIll.cJ();
                as lllllllllllllllIllIIlllllIlIIlll = lllllllllllllllIllIIlllllIlIlIll.cI();
                ao lllllllllllllllIllIIlllllIlIIllI = lllllllllllllllIllIIlllllIlIlIll.cK();
                List<ap> lllllllllllllllIllIIlllllIlIIlIl = lllllllllllllllIllIIlllllIlIlIll.cL();
                if (am.llIllllIIlIIlI(lllllllllllllllIllIIlllllIlIlIIl)) {
                    lllllllllllllllIllIIlllllIlIIlII = new at();
                    ((at)lllllllllllllllIllIIlllllIlIIlII).a(lIlIlIlIlIlI[lIlIlIlIlIll[9]], ((aq)lllllllllllllllIllIIlllllIlIlIIl).getText());
                    ((at)lllllllllllllllIllIIlllllIlIIlII).a(lIlIlIlIlIlI[lIlIlIlIlIll[10]], ((aq)lllllllllllllllIllIIlllllIlIlIIl).cM());
                    lllllllllllllllIllIIlllllIlIlIlI.a(lIlIlIlIlIlI[lIlIlIlIlIll[11]], lllllllllllllllIllIIlllllIlIIlII);
                }
                if (am.llIllllIIlIIlI(lllllllllllllllIllIIlllllIlIlIII)) {
                    lllllllllllllllIllIIlllllIlIIlII = new at();
                    ((at)lllllllllllllllIllIIlllllIlIIlII).a(lIlIlIlIlIlI[lIlIlIlIlIll[12]], lllllllllllllllIllIIlllllIlIlIII.cF());
                    lllllllllllllllIllIIlllllIlIlIlI.a(lIlIlIlIlIlI[lIlIlIlIlIll[13]], lllllllllllllllIllIIlllllIlIIlII);
                }
                if (am.llIllllIIlIIlI(lllllllllllllllIllIIlllllIlIIlll)) {
                    lllllllllllllllIllIIlllllIlIIlII = new at();
                    ((at)lllllllllllllllIllIIlllllIlIIlII).a(lIlIlIlIlIlI[lIlIlIlIlIll[14]], lllllllllllllllIllIIlllllIlIIlll.cF());
                    lllllllllllllllIllIIlllllIlIlIlI.a(lIlIlIlIlIlI[lIlIlIlIlIll[15]], lllllllllllllllIllIIlllllIlIIlII);
                }
                if (am.llIllllIIlIIlI(lllllllllllllllIllIIlllllIlIIllI)) {
                    lllllllllllllllIllIIlllllIlIIlII = new at();
                    ((at)lllllllllllllllIllIIlllllIlIIlII).a(lIlIlIlIlIlI[lIlIlIlIlIll[16]], lllllllllllllllIllIIlllllIlIIllI.bX());
                    ((at)lllllllllllllllIllIIlllllIlIIlII).a(lIlIlIlIlIlI[lIlIlIlIlIll[17]], lllllllllllllllIllIIlllllIlIIllI.cF());
                    ((at)lllllllllllllllIllIIlllllIlIIlII).a(lIlIlIlIlIlI[lIlIlIlIlIll[18]], lllllllllllllllIllIIlllllIlIIllI.cM());
                    lllllllllllllllIllIIlllllIlIlIlI.a(lIlIlIlIlIlI[lIlIlIlIlIll[19]], lllllllllllllllIllIIlllllIlIIlII);
                }
                lllllllllllllllIllIIlllllIlIIlII = new ArrayList();
                Iterator<ap> lllllllllllllllIllIIlllllIlIIIll = lllllllllllllllIllIIlllllIlIIlIl.iterator();
                while (am.llIllllIIlIIII(lllllllllllllllIllIIlllllIlIIIll.hasNext() ? 1 : 0)) {
                    ap lllllllllllllllIllIIlllllIlIIIlI = lllllllllllllllIllIIlllllIlIIIll.next();
                    at lllllllllllllllIllIIlllllIlIIIIl = new at();
                    lllllllllllllllIllIIlllllIlIIIIl.a(lIlIlIlIlIlI[lIlIlIlIlIll[20]], lllllllllllllllIllIIlllllIlIIIlI.bX());
                    lllllllllllllllIllIIlllllIlIIIIl.a(lIlIlIlIlIlI[lIlIlIlIlIll[21]], lllllllllllllllIllIIlllllIlIIIlI.cN());
                    lllllllllllllllIllIIlllllIlIIIIl.a(lIlIlIlIlIlI[lIlIlIlIlIll[22]], lllllllllllllllIllIIlllllIlIIIlI.cO());
                    lllllllllllllllIllIIlllllIlIIlII.add(lllllllllllllllIllIIlllllIlIIIIl);
                    0;
                    0;
                    if (3 >= 0) continue;
                    return null;
                }
                lllllllllllllllIllIIlllllIlIlIlI.a(lIlIlIlIlIlI[lIlIlIlIlIll[23]], lllllllllllllllIllIIlllllIlIIlII.toArray());
                lllllllllllllllIllIIlllllIlIllIl.add(lllllllllllllllIllIIlllllIlIlIlI);
                0;
                0;
                if (-2 < 0) continue;
                return null;
            }
            lllllllllllllllIllIIlllllIlIlllI.a(lIlIlIlIlIlI[lIlIlIlIlIll[24]], lllllllllllllllIllIIlllllIlIllIl.toArray());
        }
        return var1_1;
    }

    private static String llIllllIIIlIlI(String lllllllllllllllIllIIllllIlllIlll, String lllllllllllllllIllIIllllIllllIll) {
        lllllllllllllllIllIIllllIlllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIllllIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIllllIllllIlI = new StringBuilder();
        char[] lllllllllllllllIllIIllllIllllIIl = lllllllllllllllIllIIllllIllllIll.toCharArray();
        int lllllllllllllllIllIIllllIllllIII = lIlIlIlIlIll[0];
        char[] lllllllllllllllIllIIllllIlllIIlI = lllllllllllllllIllIIllllIlllIlll.toCharArray();
        int lllllllllllllllIllIIllllIlllIIIl = lllllllllllllllIllIIllllIlllIIlI.length;
        int lllllllllllllllIllIIllllIlllIIII = lIlIlIlIlIll[0];
        while (am.llIllllIIlIIll(lllllllllllllllIllIIllllIlllIIII, lllllllllllllllIllIIllllIlllIIIl)) {
            char lllllllllllllllIllIIllllIlllllIl = lllllllllllllllIllIIllllIlllIIlI[lllllllllllllllIllIIllllIlllIIII];
            lllllllllllllllIllIIllllIllllIlI.append((char)(lllllllllllllllIllIIllllIlllllIl ^ lllllllllllllllIllIIllllIllllIIl[lllllllllllllllIllIIllllIllllIII % lllllllllllllllIllIIllllIllllIIl.length]));
            0;
            ++lllllllllllllllIllIIllllIllllIII;
            ++lllllllllllllllIllIIllllIlllIIII;
            0;
            if (((65 + 6 - 4 + 92 ^ 115 + 31 - 46 + 47) & (0xC9 ^ 0xC2 ^ (0x4E ^ 0x49) ^ -1)) != (0xFD ^ 0xA1 ^ (0x3D ^ 0x65))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIllllIllllIlI);
    }

    private static boolean llIllllIIIllll(Object object) {
        return object == null;
    }

    public void c(String string) {
        this.cU = string;
    }
}

