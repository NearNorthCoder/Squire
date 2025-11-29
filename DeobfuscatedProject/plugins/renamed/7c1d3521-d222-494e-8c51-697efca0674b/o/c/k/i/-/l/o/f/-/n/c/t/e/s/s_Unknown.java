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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.A_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.C_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.F_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.M_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aa_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.q_Unknown;

public class s_Unknown
implements ac {
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int db;
    private static /* synthetic */ String[] lllIlIIIIl;
    private static /* synthetic */ int[] lllIlIIIlI;
    static /* synthetic */ String da;
    static /* synthetic */ String h;
    public static /* synthetic */ boolean bt;

    private static String llIIIIllllIll(String var7, String var14) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lllIlIIIlI[8], var12);
            return new String(var5.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String llIIIIllllIlI(String var18, String var13) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lllIlIIIlI[17]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(lllIlIIIlI[8], var11);
            return new String(var19.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
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

    private static String llIIIIllllIIl(String var1, String var2) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var9 = var2.toCharArray();
        int var17 = lllIlIIIlI[2];
        char[] var16 = var1.toCharArray();
        int var4 = var16.length;
        int var8 = lllIlIIIlI[2];
        while (s.llIIIIllllllI(var8, var4)) {
            char var6 = var16[var8];
            var10.append((char)(var6 ^ var9[var17 % var9.length]));
            0;
            ++var17;
            ++var8;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var10);
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
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 0) {
            return (58 + 8 - -49 + 21 ^ 182 + 126 - 264 + 148) & (0xF8 ^ 0xA2 ^ (0x5B ^ 0x49) ^ -1);
        }
        return lllIlIIIlI[15];
    }

    @Override
    public boolean ah() {
        return lllIlIIIlI[2];
    }

    private static void llIIIIlllllII() {
        lllIlIIIIl = new String[lllIlIIIlI[10]];
        s.lllIlIIIIl[s.lllIlIIIlI[2]] = s."- Vamp Slayer";
        s.lllIlIIIIl[s.lllIlIIIlI[5]] = s."- Lost City";
        s.lllIlIIIIl[s.lllIlIIIlI[8]] = s."- Fight Arena";
        s.lllIlIIIIl[s.lllIlIIIlI[1]] = s."- Tree Gnome village";
        s.lllIlIIIIl[s.lllIlIIIlI[13]] = s."- Grand Tree";
        s.lllIlIIIIl[s.lllIlIIIlI[14]] = s."";
        s.lllIlIIIIl[s.lllIlIIIlI[4]] = s."range";
        s.lllIlIIIIl[s.lllIlIIIlI[16]] = s."";
        s.lllIlIIIIl[s.lllIlIIIlI[17]] = s."NMZ Range ";
    }

    private static void llIIIIlllllIl() {
        lllIlIIIlI = new int[18];
        s.lllIlIIIlI[0] = 164 + 153 - 181 + 42;
        s.lllIlIIIlI[1] = 3;
        s.lllIlIIIlI[2] = (0x7A ^ 0x39 ^ (0xF ^ 0x71)) & (46 + 14 - 29 + 153 ^ 117 + 105 - 183 + 94 ^ -1);
        s.lllIlIIIlI[3] = (8 ^ 0x30) + (0x79 ^ 0x21) - (0x5E ^ 3) + (7 ^ 0x67);
        s.lllIlIIIlI[4] = 0x15 ^ 0x13;
        s.lllIlIIIlI[5] = 1;
        s.lllIlIIIlI[6] = 0x13 ^ 2;
        s.lllIlIIIlI[7] = 0xB5 ^ 0xBB;
        s.lllIlIIIlI[8] = 2;
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

