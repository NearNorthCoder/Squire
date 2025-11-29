package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/r.class */
public class C0017r implements ab {
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ String[] lllIlIIlI;
    static /* synthetic */ String dc;
    static /* synthetic */ String h;
    private static /* synthetic */ int dd;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ int[] lllIlIIll;

    private static void llIIIllIIlIl() {
        lllIlIIll = new int[18];
        lllIlIIll[0] = (((227 ^ 159) + (((160 + 57) - 194) + 144)) - (((143 + 71) - 123) + 66)) + (235 ^ 199);
        lllIlIIll[1] = "   ".length();
        lllIlIIll[2] = (94 ^ 28) & ((223 ^ 157) ^ (-1));
        lllIlIIll[3] = ((60 + 98) - 21) + 10;
        lllIlIIll[4] = (140 ^ 188) ^ (78 ^ 120);
        lllIlIIll[5] = " ".length();
        lllIlIIll[6] = 189 ^ 172;
        lllIlIIll[7] = 23 ^ 25;
        lllIlIIll[8] = "  ".length();
        lllIlIIll[9] = 75 ^ 36;
        lllIlIIll[10] = (35 ^ 112) ^ (238 ^ 180);
        lllIlIIll[11] = (((243 ^ 139) + (102 ^ 126)) - (31 ^ 37)) + (203 ^ 139);
        lllIlIIll[12] = ((111 + 91) - 82) + 40;
        lllIlIIll[13] = 108 ^ 104;
        lllIlIIll[14] = (((22 + 57) - (-70)) + 32) ^ (((148 + 16) - (-12)) + 0);
        lllIlIIll[15] = 160 ^ 196;
        lllIlIIll[16] = (((172 + 55) - 133) + 82) ^ (((166 + 110) - 209) + 116);
        lllIlIIll[17] = (112 ^ 97) ^ (10 ^ 19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIlIIll[2];
    }

    private static String llIIIllIIIIl(String lllIIIIIllIII, String lllIIIIIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIIIllIlI = Cipher.getInstance("Blowfish");
            lllIIIIIllIlI.init(lllIlIIll[8], secretKeySpec);
            return new String(lllIIIIIllIlI.doFinal(Base64.getDecoder().decode(lllIIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIIIllIIl) {
            lllIIIIIllIIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIllIIIII(String llIlllllllIll, String llIlllllllIlI) {
        String str = new String(Base64.getDecoder().decode(llIlllllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIlllllllIII = llIlllllllIlI.toCharArray();
        int llIllllllIlll = lllIlIIll[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIIll[2];
        while (llIIIllIIllI(i, length)) {
            char llIllllllllII = charArray[i];
            sb.append((char) (llIllllllllII ^ llIlllllllIII[llIllllllIlll % llIlllllllIII.length]));
            "".length();
            llIllllllIlll++;
            i++;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIllIIllI(int i, int i2) {
        return i < i2;
    }

    public static void aV() {
        if (llIIIllIIllI(C0004e.j(lllIlIIll[0]), lllIlIIll[1])) {
            dc = lllIlIIlI[lllIlIIll[2]];
            Z.dO();
        }
        if (llIIIllIIlll(C0004e.j(lllIlIIll[0]), lllIlIIll[1]) && llIIIllIIllI(C0004e.j(lllIlIIll[3]), lllIlIIll[4])) {
            dc = lllIlIIlI[lllIlIIll[5]];
            D.bz();
        }
        if (llIIIllIIlll(C0004e.j(lllIlIIll[0]), lllIlIIll[1]) && llIIIllIIlll(C0004e.j(lllIlIIll[3]), lllIlIIll[4]) && llIIIllIIllI(C0004e.j(lllIlIIll[6]), lllIlIIll[7])) {
            dc = lllIlIIlI[lllIlIIll[8]];
            A.bq();
        }
        if (llIIIllIIlll(C0004e.j(lllIlIIll[0]), lllIlIIll[1]) && llIIIllIIlll(C0004e.j(lllIlIIll[3]), lllIlIIll[4]) && llIIIllIIlll(C0004e.j(lllIlIIll[6]), lllIlIIll[7]) && llIIIllIIllI(C0004e.j(lllIlIIll[9]), lllIlIIll[10])) {
            dc = lllIlIIlI[lllIlIIll[1]];
            K.cg();
        }
        if (llIIIllIIlll(C0004e.j(lllIlIIll[0]), lllIlIIll[1]) && llIIIllIIlll(C0004e.j(lllIlIIll[3]), lllIlIIll[4]) && llIIIllIIlll(C0004e.j(lllIlIIll[6]), lllIlIIll[7]) && llIIIllIIlll(C0004e.j(lllIlIIll[9]), lllIlIIll[10]) && llIIIllIIllI(C0004e.j(lllIlIIll[11]), lllIlIIll[12])) {
            dc = lllIlIIlI[lllIlIIll[13]];
            C.bu();
        }
        if (llIIIllIIlll(C0004e.j(lllIlIIll[0]), lllIlIIll[1]) && llIIIllIIlll(C0004e.j(lllIlIIll[3]), lllIlIIll[4]) && llIIIllIIlll(C0004e.j(lllIlIIll[6]), lllIlIIll[7]) && llIIIllIIlll(C0004e.j(lllIlIIll[9]), lllIlIIll[10]) && llIIIllIIlll(C0004e.j(lllIlIIll[11]), lllIlIIll[12])) {
            dc = lllIlIIlI[lllIlIIll[14]];
            C0016q.e(lllIlIIlI[lllIlIIll[4]]);
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            aV();
            "".length();
            if ("   ".length() == " ".length()) {
                return (184 ^ 162) & ((141 ^ 151) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIlIIll[15];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        return lllIlIIll[2];
    }

    static {
        llIIIllIIlIl();
        llIIIllIIlII();
        bx = new ArrayList();
        dc = lllIlIIlI[lllIlIIll[16]];
        h = lllIlIIlI[lllIlIIll[17]];
        dd = C0004e.c(lllIlIIll[5], lllIlIIll[8]);
    }

    private static String llIIIllIIIlI(String lllIIIIIIlIll, String lllIIIIIIlIlI) {
        try {
            SecretKeySpec lllIIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lllIlIIll[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIIll[8], lllIIIIIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIIIIllII) {
            lllIIIIIIllII.printStackTrace();
            return null;
        }
    }

    private static void llIIIllIIlII() {
        lllIlIIlI = new String[lllIlIIll[10]];
        lllIlIIlI[lllIlIIll[2]] = llIIIllIIIII("WUclMRsERyA8Fw0CAQ==", "tgsPv");
        lllIlIIlI[lllIlIIll[5]] = llIIIllIIIII("TngAFgEXeA8QBho=", "cXLyr");
        lllIlIIlI[lllIlIIll[8]] = llIIIllIIIIl("FmCOfvr2g2bdyuagLMlJMA==", "cOZDz");
        lllIlIIlI[lllIlIIll[1]] = llIIIllIIIIl("7+UcE/wYUFtl83gBL2E8gs3wZgNsmM+c", "vQAFV");
        lllIlIIlI[lllIlIIll[13]] = llIIIllIIIlI("TVF/tr6r/WTfrvPuIGYb1g==", "rGgHy");
        lllIlIIlI[lllIlIIll[14]] = llIIIllIIIlI("cMo174WOXjA=", "AJhRk");
        lllIlIIlI[lllIlIIll[4]] = llIIIllIIIlI("1Kk39LKrASw=", "eiZLy");
        lllIlIIlI[lllIlIIll[16]] = llIIIllIIIlI("kRzwBZpEmU0=", "qXFKI");
        lllIlIIlI[lllIlIIll[17]] = llIIIllIIIIl("Ix3LyRQjJaczdYBu1TwSkA==", "HPGeX");
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return h;
    }

    private static boolean llIIIllIIlll(int i, int i2) {
        return i >= i2;
    }
}
