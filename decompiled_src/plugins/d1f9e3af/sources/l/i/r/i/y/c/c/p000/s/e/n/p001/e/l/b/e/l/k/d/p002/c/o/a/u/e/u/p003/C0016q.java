package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.q  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/q.class */
public class C0016q implements W {
    public static /* synthetic */ int cf;
    public static /* synthetic */ int ce;
    public static /* synthetic */ int bV;
    public static /* synthetic */ int bT;
    public static /* synthetic */ List<W> cd;
    private static /* synthetic */ int[] lIlIIIlII;
    public static /* synthetic */ int bZ;
    public static /* synthetic */ String h;
    static /* synthetic */ boolean ch;
    private static /* synthetic */ String[] lIlIIIIll;
    public static /* synthetic */ int cg;

    private static void lIIIIlllllll() {
        lIlIIIlII = new int[18];
        lIlIIIlII[0] = " ".length();
        lIlIIIlII[1] = (39 ^ 33) ^ ((108 ^ 50) & ((39 ^ 121) ^ (-1)));
        lIlIIIlII[2] = ((76 ^ 22) ^ (197 ^ 172)) & (((((90 + 117) - 177) + 122) ^ (((23 + 34) - (-76)) + 38)) ^ (-" ".length()));
        lIlIIIlII[3] = "  ".length();
        lIlIIIlII[4] = "   ".length();
        lIlIIIlII[5] = " ".length() ^ (195 ^ 198);
        lIlIIIlII[6] = 150 ^ 147;
        lIlIIIlII[7] = (124 ^ 18) ^ (5 ^ 108);
        lIlIIIlII[8] = (36 ^ 71) ^ (79 ^ 30);
        lIlIIIlII[9] = 32 ^ 112;
        lIlIIIlII[10] = (-16905) & 27369;
        lIlIIIlII[11] = (-29188) & 30687;
        lIlIIIlII[12] = (202 ^ 151) ^ (255 ^ 198);
        lIlIIIlII[13] = (-17435) & 917434;
        lIlIIIlII[14] = (-(((60 + 87) - 144) + 131)) & (-1027) & 1501159;
        lIlIIIlII[15] = (52 ^ 14) ^ (108 ^ 29);
        lIlIIIlII[16] = ((60 + 125) - 84) + 49;
        lIlIIIlII[17] = 20 ^ 28;
    }

    private static boolean lIIIlIIIIllI(int i) {
        return i > 0;
    }

    private static boolean lIIIlIIIIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    static {
        lIIIIlllllll();
        lIIIIllllllI();
        cd = new ArrayList();
        h = lIlIIIIll[lIlIIIlII[5]];
        bV = C0004e.c(lIlIIIlII[0], lIlIIIlII[3]);
        cf = C0004e.c(lIlIIIlII[13], lIlIIIlII[14]);
        cg = C0004e.c(lIlIIIlII[15], lIlIIIlII[16]);
        ch = lIlIIIlII[2];
    }

    private static boolean lIIIlIIIIIlI(int i) {
        return i == 0;
    }

    private static String lIIIIlllllII(String llllIlllllIIIl, String llllIlllllIIII) {
        try {
            SecretKeySpec llllIlllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlllllIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIlII[17]), "DES");
            Cipher llllIlllllIIll = Cipher.getInstance("DES");
            llllIlllllIIll.init(lIlIIIlII[3], llllIlllllIlII);
            return new String(llllIlllllIIll.doFinal(Base64.getDecoder().decode(llllIlllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlllllIIlI) {
            llllIlllllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIlIIIIIII(cd.isEmpty() ? 1 : 0) && lIIIlIIIIllI(bT)) {
            ?? r0 = lIlIIIlII[0];
            "".length();
            return ((11 ^ 28) & ((28 ^ 11) ^ (-1))) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIIlII[2];
    }

    private static boolean lIIIlIIIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIIIlII[2];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return h;
    }

    private static String lIIIIlllllIl(String llllIllllIIIIl, String llllIlllIllIll) {
        String llllIllllIIIIl2 = new String(Base64.getDecoder().decode(llllIllllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlllIlllll = new StringBuilder();
        char[] llllIlllIllllI = llllIlllIllIll.toCharArray();
        int llllIlllIlllIl = lIlIIIlII[2];
        char[] charArray = llllIllllIIIIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIlII[2];
        while (lIIIlIIIIIIl(i, length)) {
            llllIlllIlllll.append((char) (charArray[i] ^ llllIlllIllllI[llllIlllIlllIl % llllIlllIllllI.length]));
            "".length();
            llllIlllIlllIl++;
            i++;
            "".length();
            if ((((((41 + 67) - 10) + 137) ^ (((131 + 55) - 133) + 110)) & (((((35 + 119) - (-86)) + 14) ^ (((25 + 145) - 111) + 123)) ^ (-" ".length()))) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllIlllIlllll);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            aF();
            "".length();
            if ("  ".length() <= " ".length()) {
                return ((((29 + 0) - 18) + 122) ^ (((70 + 129) - 38) + 34)) & (((164 ^ 175) ^ (217 ^ 148)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIIlII[12];
    }

    private static String lIIIIllllIll(String llllIllllllllI, String llllIlllllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlllllllll) {
            llllIlllllllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0422, code lost:
        if (lIIIlIIIIIII(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0016q.cd.isEmpty() ? 1 : 0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x042b, code lost:
        if (lIIIlIIIIllI(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0016q.bT) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x042e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aF() {
        if (lIIIlIIIIIII(cd.isEmpty() ? 1 : 0) && lIIIlIIIIIIl(bT, lIlIIIlII[0])) {
            W[] wArr = new W[lIlIIIlII[1]];
            wArr[lIlIIIlII[2]] = new af();
            wArr[lIlIIIlII[0]] = new S();
            wArr[lIlIIIlII[3]] = new N();
            wArr[lIlIIIlII[4]] = new O();
            wArr[lIlIIIlII[5]] = new F();
            wArr[lIlIIIlII[6]] = new D();
            List asList = Arrays.asList(wArr);
            W[] wArr2 = new W[lIlIIIlII[7]];
            wArr2[lIlIIIlII[2]] = new Z();
            wArr2[lIlIIIlII[0]] = new K();
            wArr2[lIlIIIlII[3]] = new U();
            wArr2[lIlIIIlII[4]] = new H();
            wArr2[lIlIIIlII[5]] = new C0024y();
            wArr2[lIlIIIlII[6]] = new T();
            wArr2[lIlIIIlII[1]] = new C0023x();
            List asList2 = Arrays.asList(wArr2);
            W[] wArr3 = new W[lIlIIIlII[1]];
            wArr3[lIlIIIlII[2]] = new C0015p();
            wArr3[lIlIIIlII[0]] = new C0021v();
            wArr3[lIlIIIlII[3]] = new X();
            wArr3[lIlIIIlII[4]] = new C0020u();
            wArr3[lIlIIIlII[5]] = new Q();
            wArr3[lIlIIIlII[6]] = new I();
            List asList3 = Arrays.asList(wArr3);
            Collections.shuffle(asList);
            Collections.shuffle(asList2);
            Collections.shuffle(asList3);
            cd.addAll(asList);
            "".length();
            cd.addAll(asList2);
            "".length();
            cd.addAll(asList3);
            "".length();
            cd.add(new C());
            "".length();
            bT += lIlIIIlII[0];
            if (lIIIlIIIIIlI(cd.isEmpty() ? 1 : 0)) {
                if (lIIIlIIIIIII(ch ? 1 : 0)) {
                    Collections.shuffle(cd);
                }
                System.out.println("Switching to : " + cd.get(lIlIIIlII[2]).U());
                h = cd.get(lIlIIIlII[2]).U();
            }
        }
        while (true) {
            if (!lIIIlIIIIIlI(cd.isEmpty() ? 1 : 0) || !lIIIlIIIIIlI(AccBuilderEasyClues.d ? 1 : 0)) {
                break;
            } else if (lIIIlIIIIIll(Game.getState(), GameState.LOGGED_IN)) {
                if (lIIIlIIIIIII(cd.get(lIlIIIlII[2]).V() ? 1 : 0)) {
                    if (lIIIlIIIIIII(cd.get(lIlIIIlII[2]).U().contains(lIlIIIIll[lIlIIIlII[2]]) ? 1 : 0)) {
                        AccBuilderEasyClues.f += lIlIIIlII[0];
                    }
                    System.out.println("Achieved " + cd.get(lIlIIIlII[2]).U() + " goal");
                    cd.remove(lIlIIIlII[2]);
                    "".length();
                    if (lIIIlIIIIIlI(cd.isEmpty() ? 1 : 0)) {
                        System.out.println("Switching to : " + cd.get(lIlIIIlII[2]).U());
                        h = cd.get(lIlIIIlII[2]).U();
                    }
                    if (lIIIlIIIIIII(cd.isEmpty() ? 1 : 0)) {
                        h = lIlIIIIll[lIlIIIlII[0]];
                        "".length();
                        if (((10 ^ 85) & ((76 ^ 19) ^ (-1))) >= "  ".length()) {
                            return;
                        }
                    } else {
                        Time.sleepTicks(lIlIIIlII[5]);
                        "".length();
                    }
                }
                if (lIIIlIIIIIll(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIIIlIIIIIII(C0004e.x() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIIIIll[lIlIIIlII[3]];
                        C0004e.y();
                        Time.sleepTicks(lIlIIIlII[0]);
                        "".length();
                        "".length();
                        if (" ".length() > ((6 ^ 72) ^ (66 ^ 8))) {
                            return;
                        }
                    }
                    AccBuilderEasyClues.f2l = cd.get(lIlIIIlII[2]).U();
                    Time.sleep(cd.get(lIlIIIlII[2]).T());
                    "".length();
                    Time.sleep(C0004e.c(lIlIIIlII[8], lIlIIIlII[9]));
                    "".length();
                }
                if (lIIIlIIIIlII(Vars.getBit(lIlIIIlII[10]), lIlIIIlII[11])) {
                    String[] strArr = new String[lIlIIIlII[0]];
                    strArr[lIlIIIlII[2]] = lIlIIIIll[lIlIIIlII[4]];
                    if (lIIIlIIIIlIl(TileObjects.getNearest(strArr))) {
                        C0004e.E();
                        "".length();
                        if ((-" ".length()) >= " ".length()) {
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private static boolean lIIIlIIIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlIIIIlII(int i, int i2) {
        return i >= i2;
    }

    private static void lIIIIllllllI() {
        lIlIIIIll = new String[lIlIIIlII[6]];
        lIlIIIIll[lIlIIIlII[2]] = lIIIIllllIll("RpjZWONA0us=", "KYADF");
        lIlIIIIll[lIlIIIlII[0]] = lIIIIlllllII("SH8AKbOj+ZU=", "wdXAM");
        lIlIIIIll[lIlIIIlII[3]] = lIIIIlllllIl("Dzs9MzUnOyA1dwwXbiU2OTwnPDA=", "KRNRW");
        lIlIIIIll[lIlIIIlII[4]] = lIIIIlllllII("XMPg+g+AJuSFV0gZTxQHGQ==", "FwtSX");
        lIlIIIIll[lIlIIIlII[5]] = lIIIIlllllII("+xEXWO7QmA0=", "pFpHB");
    }
}
