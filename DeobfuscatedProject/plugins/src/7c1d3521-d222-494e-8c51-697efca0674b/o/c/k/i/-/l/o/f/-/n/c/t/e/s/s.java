/*
 * Decompiled with CFR 0.152.
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.A;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.C;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.F;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.M;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aa;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.q;

public class s
implements ac {
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int db;
    private static /* synthetic */ String[] lllIlIIIIl;
    private static /* synthetic */ int[] lllIlIIIlI;
    static /* synthetic */ String da;
    static /* synthetic */ String h;
    public static /* synthetic */ boolean bt;

    private static String llIIIIllllIll(String lllllllllllllllllIlllIIIIlllIIII, String lllllllllllllllllIlllIIIIllIllll) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIIIlllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIIIIlllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIIIIlllIIlI.init(lllIlIIIlI[8], lllllllllllllllllIlllIIIIlllIIll);
            return new String(lllllllllllllllllIlllIIIIlllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIIIIlllIIIl) {
            lllllllllllllllllIlllIIIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIIllllIlI(String lllllllllllllllllIlllIIIIllIIIIl, String lllllllllllllllllIlllIIIIllIIIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIIIllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), lllIlIIIlI[17]), "DES");
            Cipher lllllllllllllllllIlllIIIIllIIlIl = Cipher.getInstance("DES");
            lllllllllllllllllIlllIIIIllIIlIl.init(lllIlIIIlI[8], lllllllllllllllllIlllIIIIllIIllI);
            return new String(lllllllllllllllllIlllIIIIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIIIIllIIlII) {
            lllllllllllllllllIlllIIIIllIIlII.printStackTrace();
            return null;
        }
    }

    @Override
    public String ag() {
        return h;
    }

    @Override
    public boolean ae() {
        return lllIlIIIlI[2];
    }

    private static String llIIIIllllIIl(String lllllllllllllllllIlllIIIlIIIIIII, String lllllllllllllllllIlllIIIlIIIIlII) {
        lllllllllllllllllIlllIIIlIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIIIlIIIIIll = new StringBuilder();
        char[] lllllllllllllllllIlllIIIlIIIIIlI = lllllllllllllllllIlllIIIlIIIIlII.toCharArray();
        int lllllllllllllllllIlllIIIlIIIIIIl = lllIlIIIlI[2];
        char[] lllllllllllllllllIlllIIIIllllIll = lllllllllllllllllIlllIIIlIIIIIII.toCharArray();
        int lllllllllllllllllIlllIIIIllllIlI = lllllllllllllllllIlllIIIIllllIll.length;
        int lllllllllllllllllIlllIIIIllllIIl = lllIlIIIlI[2];
        while (s.llIIIIllllllI(lllllllllllllllllIlllIIIIllllIIl, lllllllllllllllllIlllIIIIllllIlI)) {
            char lllllllllllllllllIlllIIIlIIIIllI = lllllllllllllllllIlllIIIIllllIll[lllllllllllllllllIlllIIIIllllIIl];
            lllllllllllllllllIlllIIIlIIIIIll.append((char)(lllllllllllllllllIlllIIIlIIIIllI ^ lllllllllllllllllIlllIIIlIIIIIlI[lllllllllllllllllIlllIIIlIIIIIIl % lllllllllllllllllIlllIIIlIIIIIlI.length]));
            "".length();
            ++lllllllllllllllllIlllIIIlIIIIIIl;
            ++lllllllllllllllllIlllIIIIllllIIl;
            "".length();
            if ("   ".length() != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlllIIIlIIIIIll);
    }

    private static boolean llIIIIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        s.llIIIIlllllIl();
        s.llIIIIlllllII();
        bv = new ArrayList<d>();
        da = lllIlIIIIl[lllIlIIIlI[16]];
        h = lllIlIIIIl[lllIlIIIlI[17]];
        db = e.c(lllIlIIIlI[5], lllIlIIIlI[8]);
    }

    public static void aV() {
        if (s.llIIIIllllllI(e.j(lllIlIIIlI[0]), lllIlIIIlI[1])) {
            da = lllIlIIIIl[lllIlIIIlI[2]];
            aa.ev();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIllllllI(e.j(lllIlIIIlI[3]), lllIlIIIlI[4])) {
            da = lllIlIIIIl[lllIlIIIlI[5]];
            F.bY();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIlllllll(e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && s.llIIIIllllllI(e.j(lllIlIIIlI[6]), lllIlIIIlI[7])) {
            da = lllIlIIIIl[lllIlIIIlI[8]];
            A.bw();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIlllllll(e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && s.llIIIIlllllll(e.j(lllIlIIIlI[6]), lllIlIIIlI[7]) && s.llIIIIllllllI(e.j(lllIlIIIlI[9]), lllIlIIIlI[10])) {
            da = lllIlIIIIl[lllIlIIIlI[1]];
            M.cT();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIlllllll(e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && s.llIIIIlllllll(e.j(lllIlIIIlI[6]), lllIlIIIlI[7]) && s.llIIIIlllllll(e.j(lllIlIIIlI[9]), lllIlIIIlI[10]) && s.llIIIIllllllI(e.j(lllIlIIIlI[11]), lllIlIIIlI[12])) {
            da = lllIlIIIIl[lllIlIIIlI[13]];
            C.bA();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIlllllll(e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && s.llIIIIlllllll(e.j(lllIlIIIlI[6]), lllIlIIIlI[7]) && s.llIIIIlllllll(e.j(lllIlIIIlI[9]), lllIlIIIlI[10]) && s.llIIIIlllllll(e.j(lllIlIIIlI[11]), lllIlIIIlI[12])) {
            da = lllIlIIIIl[lllIlIIIlI[14]];
            q.e(lllIlIIIIl[lllIlIIIlI[4]]);
        }
    }

    private static boolean llIIIIlllllll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            s.aV();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-" ".length() >= 0) {
            return (58 + 8 - -49 + 21 ^ 182 + 126 - 264 + 148) & (0xF8 ^ 0xA2 ^ (0x5B ^ 0x49) ^ -" ".length());
        }
        return lllIlIIIlI[15];
    }

    @Override
    public boolean ah() {
        return lllIlIIIlI[2];
    }

    private static void llIIIIlllllII() {
        lllIlIIIIl = new String[lllIlIIIlI[10]];
        s.lllIlIIIIl[s.lllIlIIIlI[2]] = s.llIIIIllllIIl("elIZKiQnUhwnKC4XPQ==", "WrOKI");
        s.lllIlIIIIl[s.lllIlIIIlI[5]] = s.llIIIIllllIIl("Y3clBiY6dyoAITc=", "NWiiU");
        s.lllIlIIIIl[s.lllIlIIIlI[8]] = s.llIIIIllllIlI("1UFjoGJvdErhRGbH1qZquw==", "PhCJc");
        s.lllIlIIIIl[s.lllIlIIIlI[1]] = s.llIIIIllllIlI("yvNIxZJr1lzQ2I+rTTQXx+CC8aywHlx1", "gfvbS");
        s.lllIlIIIIl[s.lllIlIIIlI[13]] = s.llIIIIllllIll("mOvzC99+faVeVS40PUTnVg==", "wNFXo");
        s.lllIlIIIIl[s.lllIlIIIlI[14]] = s.llIIIIllllIIl("", "abyMt");
        s.lllIlIIIIl[s.lllIlIIIlI[4]] = s.llIIIIllllIIl("GRk0JhY=", "kxZAs");
        s.lllIlIIIIl[s.lllIlIIIlI[16]] = s.llIIIIllllIIl("", "zNoCK");
        s.lllIlIIIIl[s.lllIlIIIlI[17]] = s.llIIIIllllIlI("GO+/qTWr68CvKx6rmuRq6g==", "NlQbD");
    }

    private static void llIIIIlllllIl() {
        lllIlIIIlI = new int[18];
        s.lllIlIIIlI[0] = 164 + 153 - 181 + 42;
        s.lllIlIIIlI[1] = "   ".length();
        s.lllIlIIIlI[2] = (0x7A ^ 0x39 ^ (0xF ^ 0x71)) & (46 + 14 - 29 + 153 ^ 117 + 105 - 183 + 94 ^ -" ".length());
        s.lllIlIIIlI[3] = (8 ^ 0x30) + (0x79 ^ 0x21) - (0x5E ^ 3) + (7 ^ 0x67);
        s.lllIlIIIlI[4] = 0x15 ^ 0x13;
        s.lllIlIIIlI[5] = " ".length();
        s.lllIlIIIlI[6] = 0x13 ^ 2;
        s.lllIlIIIlI[7] = 0xB5 ^ 0xBB;
        s.lllIlIIIlI[8] = "  ".length();
        s.lllIlIIIlI[9] = 0x21 ^ 0x6E ^ (0x6F ^ 0x4F);
        s.lllIlIIIlI[10] = 106 + 67 - 165 + 169 ^ 180 + 77 - 246 + 173;
        s.lllIlIIIlI[11] = 140 + 42 - 146 + 114;
        s.lllIlIIIlI[12] = 16 + 61 - -24 + 31 + (0xC1 ^ 0xA0) - (0x74 ^ 0xF) + (0x65 ^ 0x53);
        s.lllIlIIIlI[13] = 0xDD ^ 0xAA ^ (0x42 ^ 0x31);
        s.lllIlIIIlI[14] = 0xA2 ^ 0xA7;
        s.lllIlIIIlI[15] = 0xFB ^ 0x9F;
        s.lllIlIIIlI[16] = 0x43 ^ 0x44;
        s.lllIlIIIlI[17] = 0x46 ^ 0x4E;
    }
}

