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

public class r
implements ac {
    private static /* synthetic */ String[] llIlIlIIII;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int db;
    static /* synthetic */ String h;
    static /* synthetic */ String da;
    private static /* synthetic */ int[] llIlIlIIlI;
    public static /* synthetic */ List<d> bv;

    private static void lIllIIllIIlII() {
        llIlIlIIlI = new int[18];
        r.llIlIlIIlI[0] = (0xB0 ^ 0xAB) + (0x5C ^ 0xC) - -(0x7A ^ 0x58) + (0x28 ^ 0xD);
        r.llIlIlIIlI[1] = 3;
        r.llIlIlIIlI[2] = (0x6D ^ 0x33) & ~(0x58 ^ 6);
        r.llIlIlIIlI[3] = (0x12 ^ 0x20) + (0x61 ^ 0x18) - (0x21 ^ 0x55) + (0xE1 ^ 0xBD);
        r.llIlIlIIlI[4] = 0x83 ^ 0x85;
        r.llIlIlIIlI[5] = 1;
        r.llIlIlIIlI[6] = 5 ^ 0x14;
        r.llIlIlIIlI[7] = 0x11 ^ 0x1F;
        r.llIlIlIIlI[8] = 2;
        r.llIlIlIIlI[9] = 0x1F ^ 0x7C ^ (0xCF ^ 0xC3);
        r.llIlIlIIlI[10] = 0x45 ^ 0x4C;
        r.llIlIlIIlI[11] = (0x18 ^ 0x49) + (0x1D ^ 0x22) - (0x7C ^ 0x3B) + (0xFB ^ 0xB6);
        r.llIlIlIIlI[12] = 18 + 34 - -12 + 96;
        r.llIlIlIIlI[13] = 68 + 135 - 79 + 75 ^ 192 + 56 - 150 + 97;
        r.llIlIlIIlI[14] = 4 + 150 - 25 + 54 ^ 158 + 52 - 190 + 158;
        r.llIlIlIIlI[15] = 5 ^ 0x61;
        r.llIlIlIIlI[16] = 0xAC ^ 0xAB;
        r.llIlIlIIlI[17] = 0x22 ^ 0x14 ^ (0x9B ^ 0xA5);
    }

    private static void lIllIIllIIIII() {
        llIlIlIIII = new String[llIlIlIIlI[10]];
        r.llIlIlIIII[r.llIlIlIIlI[2]] = r."- Vamp Slayer";
        r.llIlIlIIII[r.llIlIlIIlI[5]] = r."- Lost City";
        r.llIlIlIIII[r.llIlIlIIlI[8]] = r."- Fight Arena";
        r.llIlIlIIII[r.llIlIlIIlI[1]] = r."- Tree Gnome village";
        r.llIlIlIIII[r.llIlIlIIlI[13]] = r."- Grand Tree";
        r.llIlIlIIII[r.llIlIlIIlI[14]] = r."";
        r.llIlIlIIII[r.llIlIlIIlI[4]] = r."melee";
        r.llIlIlIIII[r.llIlIlIIlI[16]] = r."";
        r.llIlIlIIII[r.llIlIlIIlI[17]] = r."NMZ Melee ";
    }

    @Override
    public String ag() {
        return h;
    }

    @Override
    public boolean ae() {
        return llIlIlIIlI[2];
    }

    private static String lIllIIlIlllll(String var4, String var17) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var3 = var17.toCharArray();
        int var16 = llIlIlIIlI[2];
        char[] var18 = var4.toCharArray();
        int var1 = var18.length;
        int var12 = llIlIlIIlI[2];
        while (r.lIllIIllIIlIl(var12, var1)) {
            char var9 = var18[var12];
            var7.append((char)(var9 ^ var3[var16 % var3.length]));
            0;
            ++var16;
            ++var12;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    static {
        r.lIllIIllIIlII();
        r.lIllIIllIIIII();
        bv = new ArrayList<d>();
        da = llIlIlIIII[llIlIlIIlI[16]];
        h = llIlIlIIII[llIlIlIIlI[17]];
        db = e.c(llIlIlIIlI[5], llIlIlIIlI[8]);
    }

    @Override
    public int af() {
        try {
            r.aV();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= -1) {
            return (8 ^ 0x22) & ~(0x7C ^ 0x56);
        }
        return llIlIlIIlI[15];
    }

    public static void aV() {
        if (r.lIllIIllIIlIl(e.j(llIlIlIIlI[0]), llIlIlIIlI[1])) {
            da = llIlIlIIII[llIlIlIIlI[2]];
            aa.ev();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIlIl(e.j(llIlIlIIlI[3]), llIlIlIIlI[4])) {
            da = llIlIlIIII[llIlIlIIlI[5]];
            F.bY();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && r.lIllIIllIIlIl(e.j(llIlIlIIlI[6]), llIlIlIIlI[7])) {
            da = llIlIlIIII[llIlIlIIlI[8]];
            A.bw();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[6]), llIlIlIIlI[7]) && r.lIllIIllIIlIl(e.j(llIlIlIIlI[9]), llIlIlIIlI[10])) {
            da = llIlIlIIII[llIlIlIIlI[1]];
            M.cT();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[6]), llIlIlIIlI[7]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[9]), llIlIlIIlI[10]) && r.lIllIIllIIlIl(e.j(llIlIlIIlI[11]), llIlIlIIlI[12])) {
            da = llIlIlIIII[llIlIlIIlI[13]];
            C.bA();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[6]), llIlIlIIlI[7]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[9]), llIlIlIIlI[10]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[11]), llIlIlIIlI[12])) {
            da = llIlIlIIII[llIlIlIIlI[14]];
            q.e(llIlIlIIII[llIlIlIIlI[4]]);
        }
    }

    private static String lIllIIlIllllI(String var14, String var5) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(llIlIlIIlI[8], var13);
            return new String(var19.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIlllIl(String var10, String var6) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIlIlIIlI[17]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIlIlIIlI[8], var2);
            return new String(var11.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ah() {
        return llIlIlIIlI[2];
    }

    private static boolean lIllIIllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }
}

