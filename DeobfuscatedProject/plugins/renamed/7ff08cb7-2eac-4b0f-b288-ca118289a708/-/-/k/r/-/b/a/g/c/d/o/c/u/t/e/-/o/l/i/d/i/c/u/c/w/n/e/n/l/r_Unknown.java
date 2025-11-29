/*
 * Decompiled with CFR 0.152.
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.A_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.C_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.D_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.K_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.Z_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.q_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class r_Unknown
implements ab {
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ String[] lllIlIIlI;
    static /* synthetic */ String dc;
    static /* synthetic */ String h;
    private static /* synthetic */ int dd;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ int[] lllIlIIll;

    private static void llIIIllIIlIl() {
        lllIlIIll = new int[18];
        r.lllIlIIll[0] = (0xE3 ^ 0x9F) + (160 + 57 - 194 + 144) - (143 + 71 - 123 + 66) + (0xEB ^ 0xC7);
        r.lllIlIIll[1] = 3;
        r.lllIlIIll[2] = (0x5E ^ 0x1C) & ~(0xDF ^ 0x9D);
        r.lllIlIIll[3] = 60 + 98 - 21 + 10;
        r.lllIlIIll[4] = 0x8C ^ 0xBC ^ (0x4E ^ 0x78);
        r.lllIlIIll[5] = 1;
        r.lllIlIIll[6] = 0xBD ^ 0xAC;
        r.lllIlIIll[7] = 0x17 ^ 0x19;
        r.lllIlIIll[8] = 2;
        r.lllIlIIll[9] = 0x4B ^ 0x24;
        r.lllIlIIll[10] = 0x23 ^ 0x70 ^ (0xEE ^ 0xB4);
        r.lllIlIIll[11] = (0xF3 ^ 0x8B) + (0x66 ^ 0x7E) - (0x1F ^ 0x25) + (0xCB ^ 0x8B);
        r.lllIlIIll[12] = 111 + 91 - 82 + 40;
        r.lllIlIIll[13] = 0x6C ^ 0x68;
        r.lllIlIIll[14] = 22 + 57 - -70 + 32 ^ 148 + 16 - -12 + 0;
        r.lllIlIIll[15] = 0xA0 ^ 0xC4;
        r.lllIlIIll[16] = 172 + 55 - 133 + 82 ^ 166 + 110 - 209 + 116;
        r.lllIlIIll[17] = 0x70 ^ 0x61 ^ (0xA ^ 0x13);
    }

    @Override
    public boolean ae() {
        return lllIlIIll[2];
    }

    private static String llIIIllIIIIl(String lllIIIIIllIII, String lllIIIIIlIlIl) {
        try {
            SecretKeySpec lllIIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIIIllIlI = Cipher.getInstance("Blowfish");
            lllIIIIIllIlI.init(lllIlIIll[8], lllIIIIIllIll);
            return new String(lllIIIIIllIlI.doFinal(Base64.getDecoder().decode(lllIIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIIllIIl) {
            lllIIIIIllIIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIllIIIII(String llIlllllllIll, String llIlllllllIlI) {
        llIlllllllIll = new String(Base64.getDecoder().decode(llIlllllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllllllIIl = new StringBuilder();
        char[] llIlllllllIII = llIlllllllIlI.toCharArray();
        int llIllllllIlll = lllIlIIll[2];
        char[] llIllllllIIIl = llIlllllllIll.toCharArray();
        int llIllllllIIII = llIllllllIIIl.length;
        int llIlllllIllll = lllIlIIll[2];
        while (r.llIIIllIIllI(llIlllllIllll, llIllllllIIII)) {
            char llIllllllllII = llIllllllIIIl[llIlllllIllll];
            llIlllllllIIl.append((char)(llIllllllllII ^ llIlllllllIII[llIllllllIlll % llIlllllllIII.length]));
            0;
            ++llIllllllIlll;
            ++llIlllllIllll;
            0;
            if ((0x2A ^ 0x2E) == (0x6F ^ 0x6B)) continue;
            return null;
        }
        return String.valueOf(llIlllllllIIl);
    }

    private static boolean llIIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static void aV() {
        if (r.llIIIllIIllI(e.j(lllIlIIll[0]), lllIlIIll[1])) {
            dc = lllIlIIlI[lllIlIIll[2]];
            Z.dO();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIllI(e.j(lllIlIIll[3]), lllIlIIll[4])) {
            dc = lllIlIIlI[lllIlIIll[5]];
            D.bz();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIlll(e.j(lllIlIIll[3]), lllIlIIll[4]) && r.llIIIllIIllI(e.j(lllIlIIll[6]), lllIlIIll[7])) {
            dc = lllIlIIlI[lllIlIIll[8]];
            A.bq();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIlll(e.j(lllIlIIll[3]), lllIlIIll[4]) && r.llIIIllIIlll(e.j(lllIlIIll[6]), lllIlIIll[7]) && r.llIIIllIIllI(e.j(lllIlIIll[9]), lllIlIIll[10])) {
            dc = lllIlIIlI[lllIlIIll[1]];
            K.cg();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIlll(e.j(lllIlIIll[3]), lllIlIIll[4]) && r.llIIIllIIlll(e.j(lllIlIIll[6]), lllIlIIll[7]) && r.llIIIllIIlll(e.j(lllIlIIll[9]), lllIlIIll[10]) && r.llIIIllIIllI(e.j(lllIlIIll[11]), lllIlIIll[12])) {
            dc = lllIlIIlI[lllIlIIll[13]];
            C.bu();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIlll(e.j(lllIlIIll[3]), lllIlIIll[4]) && r.llIIIllIIlll(e.j(lllIlIIll[6]), lllIlIIll[7]) && r.llIIIllIIlll(e.j(lllIlIIll[9]), lllIlIIll[10]) && r.llIIIllIIlll(e.j(lllIlIIll[11]), lllIlIIll[12])) {
            dc = lllIlIIlI[lllIlIIll[14]];
            q.e(lllIlIIlI[lllIlIIll[4]]);
        }
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
        if (3 == 1) {
            return (0xB8 ^ 0xA2) & ~(0x8D ^ 0x97);
        }
        return lllIlIIll[15];
    }

    @Override
    public boolean ah() {
        return lllIlIIll[2];
    }

    static {
        r.llIIIllIIlIl();
        r.llIIIllIIlII();
        bx = new ArrayList<d>();
        dc = lllIlIIlI[lllIlIIll[16]];
        h = lllIlIIlI[lllIlIIll[17]];
        dd = e.c(lllIlIIll[5], lllIlIIll[8]);
    }

    private static String llIIIllIIIlI(String lllIIIIIIlIll, String lllIIIIIIlIlI) {
        try {
            SecretKeySpec lllIIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lllIlIIll[17]), "DES");
            Cipher lllIIIIIIllIl = Cipher.getInstance("DES");
            lllIIIIIIllIl.init(lllIlIIll[8], lllIIIIIIlllI);
            return new String(lllIIIIIIllIl.doFinal(Base64.getDecoder().decode(lllIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIIIllII) {
            lllIIIIIIllII.printStackTrace();
            return null;
        }
    }

    private static void llIIIllIIlII() {
        lllIlIIlI = new String[lllIlIIll[10]];
        r.lllIlIIlI[r.lllIlIIll[2]] = r."- Vamp Slayer";
        r.lllIlIIlI[r.lllIlIIll[5]] = r."- Lost City";
        r.lllIlIIlI[r.lllIlIIll[8]] = r."- Fight Arena";
        r.lllIlIIlI[r.lllIlIIll[1]] = r."- Tree Gnome village";
        r.lllIlIIlI[r.lllIlIIll[13]] = r."- Grand Tree";
        r.lllIlIIlI[r.lllIlIIll[14]] = r."";
        r.lllIlIIlI[r.lllIlIIll[4]] = r."melee";
        r.lllIlIIlI[r.lllIlIIll[16]] = r."";
        r.lllIlIIlI[r.lllIlIIll[17]] = r."NMZ Melee ";
    }

    @Override
    public String ag() {
        return h;
    }

    private static boolean llIIIllIIlll(int n2, int n3) {
        return n2 >= n3;
    }
}

