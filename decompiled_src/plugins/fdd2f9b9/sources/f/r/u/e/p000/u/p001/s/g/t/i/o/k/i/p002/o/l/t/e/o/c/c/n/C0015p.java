package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
import net.unethicalite.api.game.Game;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.p  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/p.class */
public class C0015p implements G {
    public static /* synthetic */ List<G> ce;
    static /* synthetic */ int bT;
    public static /* synthetic */ String h;
    private static /* synthetic */ int[] lIIIllIllI;
    private static /* synthetic */ String[] lIIIllIlIl;
    static /* synthetic */ boolean cf;

    private static boolean lllIlllllllI(int i) {
        return i > 0;
    }

    private static boolean lllIllllllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    static {
        lllIlllllIIl();
        lllIlllllIII();
        ce = new ArrayList();
        h = lIIIllIlIl[lIIIllIllI[1]];
        cf = lIIIllIllI[2];
    }

    private static boolean lllIllllllII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllIlllllIlI(ce.isEmpty() ? 1 : 0) && lllIlllllllI(bT)) {
            ?? r0 = lIIIllIllI[0];
            "".length();
            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIllIllI[2];
    }

    private static boolean lllIlllllIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIllIllI[2];
    }

    private static void lllIlllllIIl() {
        lIIIllIllI = new int[8];
        lIIIllIllI[0] = " ".length();
        lIIIllIllI[1] = "  ".length();
        lIIIllIllI[2] = ((((10 + 86) - 87) + 132) ^ (((90 + 78) - 48) + 38)) & (((71 ^ 15) ^ (13 ^ 86)) ^ (-" ".length()));
        lIIIllIllI[3] = "   ".length();
        lIIIllIllI[4] = (78 ^ 35) ^ (109 ^ 4);
        lIIIllIllI[5] = 112 ^ 66;
        lIIIllIllI[6] = (((72 + 102) - (-22)) + 28) ^ (((35 + 54) - (-73)) + 14);
        lIIIllIllI[7] = (((150 + 6) - 150) + 233) ^ (((46 + 17) - (-42)) + 34);
    }

    private static boolean lllIlllllIlI(int i) {
        return i != 0;
    }

    public static void aB() {
        if (lllIlllllIlI(ce.isEmpty() ? 1 : 0) && lllIlllllIll(bT, lIIIllIllI[0])) {
            G[] gArr = new G[lIIIllIllI[1]];
            gArr[lIIIllIllI[2]] = new z();
            gArr[lIIIllIllI[0]] = new H();
            List asList = Arrays.asList(gArr);
            G[] gArr2 = new G[lIIIllIllI[3]];
            gArr2[lIIIllIllI[2]] = new C0020u();
            gArr2[lIIIllIllI[0]] = new J();
            gArr2[lIIIllIllI[1]] = new O();
            List asList2 = Arrays.asList(gArr2);
            Collections.shuffle(asList);
            Collections.shuffle(asList2);
            ce.addAll(asList);
            "".length();
            ce.addAll(asList2);
            "".length();
            ce.add(new C0014o());
            "".length();
            bT += lIIIllIllI[0];
            if (lllIllllllII(ce.isEmpty() ? 1 : 0)) {
                if (lllIlllllIlI(cf ? 1 : 0)) {
                    Collections.shuffle(ce);
                }
                System.out.println("Switching to : " + ce.get(lIIIllIllI[2]).U());
                h = ce.get(lIIIllIllI[2]).U();
            }
        }
        while (lllIllllllII(ce.isEmpty() ? 1 : 0) && lllIllllllII(AccBuilderRogues.d ? 1 : 0)) {
            if (lllIllllllIl(Game.getState(), GameState.LOGGED_IN)) {
                if (lllIlllllIlI(ce.get(lIIIllIllI[2]).V() ? 1 : 0)) {
                    AccBuilderRogues.f3f += lIIIllIllI[0];
                    System.out.println("Achieved " + ce.get(lIIIllIllI[2]).U() + " goal");
                    ce.remove(lIIIllIllI[2]);
                    "".length();
                    if (lllIllllllII(ce.isEmpty() ? 1 : 0)) {
                        System.out.println("Switching to : " + ce.get(lIIIllIllI[2]).U());
                        h = ce.get(lIIIllIllI[2]).U();
                    }
                    if (lllIlllllIlI(ce.isEmpty() ? 1 : 0)) {
                        h = lIIIllIlIl[lIIIllIllI[2]];
                    }
                    Time.sleepTicks(lIIIllIllI[4]);
                    "".length();
                }
                if (lllIllllllIl(Game.getState(), GameState.LOGGED_IN)) {
                    while (lllIlllllIlI(C0004e.x() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIllIlIl[lIIIllIllI[0]];
                        C0004e.y();
                        Time.sleepTicks(lIIIllIllI[0]);
                        "".length();
                        "".length();
                        if ((" ".length() & (" ".length() ^ (-" ".length()))) < 0) {
                            return;
                        }
                    }
                    AccBuilderRogues.l = ce.get(lIIIllIllI[2]).U();
                    Time.sleep(ce.get(lIIIllIllI[2]).T());
                    "".length();
                    Time.sleep(C0004e.c(lIIIllIllI[5], lIIIllIllI[6]));
                    "".length();
                }
                C0004e.E();
                "".length();
                if ((-" ".length()) > 0) {
                    return;
                }
            }
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return h;
    }

    private static String lllIllllIlll(String lllIllIlllI, String lllIllIllIl) {
        try {
            SecretKeySpec lllIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlllIIII = Cipher.getInstance("Blowfish");
            lllIlllIIII.init(lIIIllIllI[1], lllIlllIIIl);
            return new String(lllIlllIIII.doFinal(Base64.getDecoder().decode(lllIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIllll) {
            lllIllIllll.printStackTrace();
            return null;
        }
    }

    private static void lllIlllllIII() {
        lIIIllIlIl = new String[lIIIllIllI[3]];
        lIIIllIlIl[lIIIllIllI[2]] = lllIllllIlll("b+yppFV36MM=", "ubtue");
        lIIIllIlIl[lIIIllIllI[0]] = lllIllllIlll("9mvwCzfIQAg1A+rDByHtcPYxQZcfjfMq", "FFQeG");
        lIIIllIlIl[lIIIllIllI[1]] = lllIllllIlll("pxtAPvnYxCA=", "eVVOZ");
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            aB();
            "".length();
            if ((-" ".length()) == "   ".length()) {
                return ((((92 + 149) - 225) + 147) ^ (((142 + 23) - 159) + 167)) & (((82 ^ 41) ^ (239 ^ 154)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIllIllI[7];
    }
}
