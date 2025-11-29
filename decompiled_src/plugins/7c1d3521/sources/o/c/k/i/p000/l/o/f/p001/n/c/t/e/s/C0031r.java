package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/r.class */
public class C0031r implements InterfaceC0003ac {
    private static /* synthetic */ String[] llIlIlIIII;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int db;
    static /* synthetic */ String h;
    static /* synthetic */ String da;
    private static /* synthetic */ int[] llIlIlIIlI;
    public static /* synthetic */ List<C0017d> bv;

    private static void lIllIIllIIlII() {
        llIlIlIIlI = new int[18];
        llIlIlIIlI[0] = (((176 ^ 171) + (92 ^ 12)) - (-(122 ^ 88))) + (40 ^ 13);
        llIlIlIIlI[1] = "   ".length();
        llIlIlIIlI[2] = (109 ^ 51) & ((88 ^ 6) ^ (-1));
        llIlIlIIlI[3] = (((18 ^ 32) + (97 ^ 24)) - (33 ^ 85)) + (225 ^ 189);
        llIlIlIIlI[4] = 131 ^ 133;
        llIlIlIIlI[5] = " ".length();
        llIlIlIIlI[6] = 5 ^ 20;
        llIlIlIIlI[7] = 17 ^ 31;
        llIlIlIIlI[8] = "  ".length();
        llIlIlIIlI[9] = (31 ^ 124) ^ (207 ^ 195);
        llIlIlIIlI[10] = 69 ^ 76;
        llIlIlIIlI[11] = (((24 ^ 73) + (29 ^ 34)) - (124 ^ 59)) + (251 ^ 182);
        llIlIlIIlI[12] = ((18 + 34) - (-12)) + 96;
        llIlIlIIlI[13] = (((68 + 135) - 79) + 75) ^ (((192 + 56) - 150) + 97);
        llIlIlIIlI[14] = (((4 + 150) - 25) + 54) ^ (((158 + 52) - 190) + 158);
        llIlIlIIlI[15] = 5 ^ 97;
        llIlIlIIlI[16] = 172 ^ 171;
        llIlIlIIlI[17] = (34 ^ 20) ^ (155 ^ 165);
    }

    private static void lIllIIllIIIII() {
        llIlIlIIII = new String[llIlIlIIlI[10]];
        llIlIlIIII[llIlIlIIlI[2]] = lIllIIlIlllIl("BBUad5nTjmpIjhZ0f7mvhw==", "qStJB");
        llIlIlIIII[llIlIlIIlI[5]] = lIllIIlIllllI("ANHvMHL0J22WGDRXAd69Yw==", "KBBmg");
        llIlIlIIII[llIlIlIIlI[8]] = lIllIIlIllllI("XQSnHFCUCSn7H05RqpiKRA==", "jZhZa");
        llIlIlIIII[llIlIlIIlI[1]] = lIllIIlIlllll("em8lKgcybzY2DToqUS4LOyMQPwc=", "WOqXb");
        llIlIlIIII[llIlIlIIlI[13]] = lIllIIlIlllIl("xXAgm5XoNVPkvWaE6eziaQ==", "FuRrA");
        llIlIlIIII[llIlIlIIlI[14]] = lIllIIlIlllIl("Lk8vvW90Dlk=", "pPmZi");
        llIlIlIIII[llIlIlIIlI[4]] = lIllIIlIlllll("ABYgMyY=", "msLVC");
        llIlIlIIII[llIlIlIIlI[16]] = lIllIIlIllllI("puPYGIsgLAg=", "lKmBg");
        llIlIlIIII[llIlIlIIlI[17]] = lIllIIlIlllll("JCEScjsPAC03Vg==", "jlHRv");
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIlIIlI[2];
    }

    private static String lIllIIlIlllll(String llllllllllllllllllIIIllllIllIlll, String llllllllllllllllllIIIllllIllIllI) {
        String llllllllllllllllllIIIllllIllIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIllllIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIllllIllIlIl = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIllllIllIllI.toCharArray();
        int llllllllllllllllllIIIllllIllIIll = llIlIlIIlI[2];
        char[] charArray2 = llllllllllllllllllIIIllllIllIlll2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllllIIIllllIlIlIll = llIlIlIIlI[2];
        while (lIllIIllIIlIl(llllllllllllllllllIIIllllIlIlIll, length)) {
            char llllllllllllllllllIIIllllIlllIII = charArray2[llllllllllllllllllIIIllllIlIlIll];
            llllllllllllllllllIIIllllIllIlIl.append((char) (llllllllllllllllllIIIllllIlllIII ^ charArray[llllllllllllllllllIIIllllIllIIll % charArray.length]));
            "".length();
            llllllllllllllllllIIIllllIllIIll++;
            llllllllllllllllllIIIllllIlIlIll++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIIllllIllIlIl);
    }

    static {
        lIllIIllIIlII();
        lIllIIllIIIII();
        bv = new ArrayList();
        da = llIlIlIIII[llIlIlIIlI[16]];
        h = llIlIlIIII[llIlIlIIlI[17]];
        db = C0018e.c(llIlIlIIlI[5], llIlIlIIlI[8]);
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aV();
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return (8 ^ 34) & ((124 ^ 86) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIlIlIIlI[15];
    }

    public static void aV() {
        if (lIllIIllIIlIl(C0018e.j(llIlIlIIlI[0]), llIlIlIIlI[1])) {
            da = llIlIlIIII[llIlIlIIlI[2]];
            C0001aa.ev();
        }
        if (lIllIIllIIllI(C0018e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && lIllIIllIIlIl(C0018e.j(llIlIlIIlI[3]), llIlIlIIlI[4])) {
            da = llIlIlIIII[llIlIlIIlI[5]];
            F.bY();
        }
        if (lIllIIllIIllI(C0018e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && lIllIIllIIlIl(C0018e.j(llIlIlIIlI[6]), llIlIlIIlI[7])) {
            da = llIlIlIIII[llIlIlIIlI[8]];
            A.bw();
        }
        if (lIllIIllIIllI(C0018e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[6]), llIlIlIIlI[7]) && lIllIIllIIlIl(C0018e.j(llIlIlIIlI[9]), llIlIlIIlI[10])) {
            da = llIlIlIIII[llIlIlIIlI[1]];
            M.cT();
        }
        if (lIllIIllIIllI(C0018e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[6]), llIlIlIIlI[7]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[9]), llIlIlIIlI[10]) && lIllIIllIIlIl(C0018e.j(llIlIlIIlI[11]), llIlIlIIlI[12])) {
            da = llIlIlIIII[llIlIlIIlI[13]];
            C.bA();
        }
        if (lIllIIllIIllI(C0018e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[6]), llIlIlIIlI[7]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[9]), llIlIlIIlI[10]) && lIllIIllIIllI(C0018e.j(llIlIlIIlI[11]), llIlIlIIlI[12])) {
            da = llIlIlIIII[llIlIlIIlI[14]];
            C0030q.e(llIlIlIIII[llIlIlIIlI[4]]);
        }
    }

    private static String lIllIIlIllllI(String llllllllllllllllllIIIllllIlIIIlI, String llllllllllllllllllIIIllllIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIllllIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllllIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlIIlI[8], llllllllllllllllllIIIllllIlIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIllllIlIIIll) {
            llllllllllllllllllIIIllllIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIlllIl(String llllllllllllllllllIIIllllIIlIlIl, String llllllllllllllllllIIIllllIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllllllIIIllllIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllllIIlIIlI.getBytes(StandardCharsets.UTF_8)), llIlIlIIlI[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlIIlI[8], llllllllllllllllllIIIllllIIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIllllIIlIllI) {
            llllllllllllllllllIIIllllIIlIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        return llIlIlIIlI[2];
    }

    private static boolean lIllIIllIIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIllIIlIl(int i, int i2) {
        return i < i2;
    }
}
