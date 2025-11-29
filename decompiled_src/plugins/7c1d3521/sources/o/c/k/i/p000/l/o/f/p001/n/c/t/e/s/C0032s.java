package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/s.class */
public class C0032s implements InterfaceC0003ac {
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ int db;
    private static /* synthetic */ String[] lllIlIIIIl;
    private static /* synthetic */ int[] lllIlIIIlI;
    static /* synthetic */ String da;
    static /* synthetic */ String h;
    public static /* synthetic */ boolean bt;

    private static String llIIIIllllIll(String lllllllllllllllllIlllIIIIlllIIII, String lllllllllllllllllIlllIIIIllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIIIlI[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIIIIllIllII) {
            lllllllllllllllllIlllIIIIllIllII.printStackTrace();
            return null;
        }
    }

    private static String llIIIIllllIlI(String lllllllllllllllllIlllIIIIllIIIll, String lllllllllllllllllIlllIIIIllIIIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIIIllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), lllIlIIIlI[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIIIlI[8], lllllllllllllllllIlllIIIIllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIIIIllIIlII) {
            lllllllllllllllllIlllIIIIllIIlII.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIlIIIlI[2];
    }

    private static String llIIIIllllIIl(String lllllllllllllllllIlllIIIlIIIIlIl, String lllllllllllllllllIlllIIIlIIIIlII) {
        String lllllllllllllllllIlllIIIlIIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIIIlIIIIIll = new StringBuilder();
        char[] lllllllllllllllllIlllIIIlIIIIIlI = lllllllllllllllllIlllIIIlIIIIlII.toCharArray();
        int lllllllllllllllllIlllIIIlIIIIIIl = lllIlIIIlI[2];
        char[] charArray = lllllllllllllllllIlllIIIlIIIIlIl2.toCharArray();
        int length = charArray.length;
        int i = lllIlIIIlI[2];
        while (llIIIIllllllI(i, length)) {
            char lllllllllllllllllIlllIIIlIIIIllI = charArray[i];
            lllllllllllllllllIlllIIIlIIIIIll.append((char) (lllllllllllllllllIlllIIIlIIIIllI ^ lllllllllllllllllIlllIIIlIIIIIlI[lllllllllllllllllIlllIIIlIIIIIIl % lllllllllllllllllIlllIIIlIIIIIlI.length]));
            "".length();
            lllllllllllllllllIlllIIIlIIIIIIl++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlllIIIlIIIIIll);
    }

    private static boolean llIIIIllllllI(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIIlllllIl();
        llIIIIlllllII();
        bv = new ArrayList();
        da = lllIlIIIIl[lllIlIIIlI[16]];
        h = lllIlIIIIl[lllIlIIIlI[17]];
        db = C0018e.c(lllIlIIIlI[5], lllIlIIIlI[8]);
    }

    public static void aV() {
        if (llIIIIllllllI(C0018e.j(lllIlIIIlI[0]), lllIlIIIlI[1])) {
            da = lllIlIIIIl[lllIlIIIlI[2]];
            C0001aa.ev();
        }
        if (llIIIIlllllll(C0018e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && llIIIIllllllI(C0018e.j(lllIlIIIlI[3]), lllIlIIIlI[4])) {
            da = lllIlIIIIl[lllIlIIIlI[5]];
            F.bY();
        }
        if (llIIIIlllllll(C0018e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && llIIIIllllllI(C0018e.j(lllIlIIIlI[6]), lllIlIIIlI[7])) {
            da = lllIlIIIIl[lllIlIIIlI[8]];
            A.bw();
        }
        if (llIIIIlllllll(C0018e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[6]), lllIlIIIlI[7]) && llIIIIllllllI(C0018e.j(lllIlIIIlI[9]), lllIlIIIlI[10])) {
            da = lllIlIIIIl[lllIlIIIlI[1]];
            M.cT();
        }
        if (llIIIIlllllll(C0018e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[6]), lllIlIIIlI[7]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[9]), lllIlIIIlI[10]) && llIIIIllllllI(C0018e.j(lllIlIIIlI[11]), lllIlIIIlI[12])) {
            da = lllIlIIIIl[lllIlIIIlI[13]];
            C.bA();
        }
        if (llIIIIlllllll(C0018e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[6]), lllIlIIIlI[7]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[9]), lllIlIIIlI[10]) && llIIIIlllllll(C0018e.j(lllIlIIIlI[11]), lllIlIIIlI[12])) {
            da = lllIlIIIIl[lllIlIIIlI[14]];
            C0030q.e(lllIlIIIIl[lllIlIIIlI[4]]);
        }
    }

    private static boolean llIIIIlllllll(int i, int i2) {
        return i >= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aV();
            "".length();
            if ((-" ".length()) >= 0) {
                return ((((58 + 8) - (-49)) + 21) ^ (((182 + 126) - 264) + 148)) & (((248 ^ 162) ^ (91 ^ 73)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIlIIIlI[15];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        return lllIlIIIlI[2];
    }

    private static void llIIIIlllllII() {
        lllIlIIIIl = new String[lllIlIIIlI[10]];
        lllIlIIIIl[lllIlIIIlI[2]] = llIIIIllllIIl("elIZKiQnUhwnKC4XPQ==", "WrOKI");
        lllIlIIIIl[lllIlIIIlI[5]] = llIIIIllllIIl("Y3clBiY6dyoAITc=", "NWiiU");
        lllIlIIIIl[lllIlIIIlI[8]] = llIIIIllllIlI("1UFjoGJvdErhRGbH1qZquw==", "PhCJc");
        lllIlIIIIl[lllIlIIIlI[1]] = llIIIIllllIlI("yvNIxZJr1lzQ2I+rTTQXx+CC8aywHlx1", "gfvbS");
        lllIlIIIIl[lllIlIIIlI[13]] = llIIIIllllIll("mOvzC99+faVeVS40PUTnVg==", "wNFXo");
        lllIlIIIIl[lllIlIIIlI[14]] = llIIIIllllIIl("", "abyMt");
        lllIlIIIIl[lllIlIIIlI[4]] = llIIIIllllIIl("GRk0JhY=", "kxZAs");
        lllIlIIIIl[lllIlIIIlI[16]] = llIIIIllllIIl("", "zNoCK");
        lllIlIIIIl[lllIlIIIlI[17]] = llIIIIllllIlI("GO+/qTWr68CvKx6rmuRq6g==", "NlQbD");
    }

    private static void llIIIIlllllIl() {
        lllIlIIIlI = new int[18];
        lllIlIIIlI[0] = ((164 + 153) - 181) + 42;
        lllIlIIIlI[1] = "   ".length();
        lllIlIIIlI[2] = ((122 ^ 57) ^ (15 ^ 113)) & (((((46 + 14) - 29) + 153) ^ (((117 + 105) - 183) + 94)) ^ (-" ".length()));
        lllIlIIIlI[3] = (((8 ^ 48) + (121 ^ 33)) - (94 ^ 3)) + (7 ^ 103);
        lllIlIIIlI[4] = 21 ^ 19;
        lllIlIIIlI[5] = " ".length();
        lllIlIIIlI[6] = 19 ^ 2;
        lllIlIIIlI[7] = 181 ^ 187;
        lllIlIIIlI[8] = "  ".length();
        lllIlIIIlI[9] = (33 ^ 110) ^ (111 ^ 79);
        lllIlIIIlI[10] = (((106 + 67) - 165) + 169) ^ (((180 + 77) - 246) + 173);
        lllIlIIIlI[11] = ((140 + 42) - 146) + 114;
        lllIlIIIlI[12] = (((((16 + 61) - (-24)) + 31) + (193 ^ 160)) - (116 ^ 15)) + (101 ^ 83);
        lllIlIIIlI[13] = (221 ^ 170) ^ (66 ^ 49);
        lllIlIIIlI[14] = 162 ^ 167;
        lllIlIIIlI[15] = 251 ^ 159;
        lllIlIIIlI[16] = 67 ^ 68;
        lllIlIIIlI[17] = 70 ^ 78;
    }
}
