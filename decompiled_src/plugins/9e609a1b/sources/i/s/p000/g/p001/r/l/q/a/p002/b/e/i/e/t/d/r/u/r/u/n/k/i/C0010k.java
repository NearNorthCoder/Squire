package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
import net.unethicalite.api.widgets.Dialog;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/k.class */
public class C0010k implements M {
    private static /* synthetic */ String[] lIIlIIIIlIlII;
    static /* synthetic */ int bY;
    private static /* synthetic */ int[] lIIlIIIIlIlIl;
    static /* synthetic */ boolean cc;
    public static /* synthetic */ List<M> cb;
    public static /* synthetic */ String h;

    private static boolean lIlIIlllllIllIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIIlllllIIlll(String llllllllllllllIlllllllIIIIIIlIIl, String llllllllllllllIlllllllIIIIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllllIIIIIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllllIIIIIIlIll.init(lIIlIIIIlIlIl[3], secretKeySpec);
            return new String(llllllllllllllIlllllllIIIIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllIIIIIIlIlI) {
            llllllllllllllIlllllllIIIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllllIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static void aq() {
        if (lIlIIlllllIllII(cb.isEmpty() ? 1 : 0) && lIlIIlllllIllIl(bY, lIIlIIIIlIlIl[0])) {
            M[] mArr = new M[lIIlIIIIlIlIl[1]];
            mArr[lIIlIIIIlIlIl[2]] = new C0014o();
            mArr[lIIlIIIIlIlIl[0]] = new s();
            mArr[lIIlIIIIlIlIl[3]] = new v();
            mArr[lIIlIIIIlIlIl[4]] = new x();
            mArr[lIIlIIIIlIlIl[5]] = new y();
            List asList = Arrays.asList(mArr);
            M[] mArr2 = new M[lIIlIIIIlIlIl[4]];
            mArr2[lIIlIIIIlIlIl[2]] = new C0013n();
            mArr2[lIIlIIIIlIlIl[0]] = new C0011l();
            mArr2[lIIlIIIIlIlIl[3]] = new F();
            List asList2 = Arrays.asList(mArr2);
            M[] mArr3 = new M[lIIlIIIIlIlIl[4]];
            mArr3[lIIlIIIIlIlIl[2]] = new N();
            mArr3[lIIlIIIIlIlIl[0]] = new t();
            mArr3[lIIlIIIIlIlIl[3]] = new C();
            List asList3 = Arrays.asList(mArr3);
            M[] mArr4 = new M[lIIlIIIIlIlIl[6]];
            mArr4[lIIlIIIIlIlIl[2]] = new A();
            mArr4[lIIlIIIIlIlIl[0]] = new B();
            mArr4[lIIlIIIIlIlIl[3]] = new D();
            mArr4[lIIlIIIIlIlIl[4]] = new E();
            mArr4[lIIlIIIIlIlIl[5]] = new G();
            mArr4[lIIlIIIIlIlIl[1]] = new H();
            mArr4[lIIlIIIIlIlIl[7]] = new I();
            mArr4[lIIlIIIIlIlIl[8]] = new J();
            mArr4[lIIlIIIIlIlIl[9]] = new K();
            mArr4[lIIlIIIIlIlIl[10]] = new r();
            mArr4[lIIlIIIIlIlIl[11]] = new q();
            mArr4[lIIlIIIIlIlIl[12]] = new L();
            List asList4 = Arrays.asList(mArr4);
            Collections.shuffle(asList);
            Collections.shuffle(asList2);
            Collections.shuffle(asList3);
            Collections.shuffle(asList4);
            cb.addAll(asList);
            "".length();
            cb.addAll(asList2);
            "".length();
            cb.addAll(asList3);
            "".length();
            cb.addAll(asList4);
            "".length();
            cb.add(new w());
            "".length();
            bY += lIIlIIIIlIlIl[0];
            if (lIlIIlllllIlllI(cb.isEmpty() ? 1 : 0)) {
                if (lIlIIlllllIllII(cc ? 1 : 0)) {
                    Collections.shuffle(cb);
                }
                System.out.println("Switching to : " + cb.get(lIIlIIIIlIlIl[2]).Z());
                h = cb.get(lIIlIIIIlIlIl[2]).Z();
            }
        }
        while (lIlIIlllllIlllI(cb.isEmpty() ? 1 : 0) && lIlIIlllllIlllI(AccBuilderRat.d ? 1 : 0)) {
            if (lIlIIlllllIllll(Game.getState(), GameState.LOGGED_IN)) {
                if (lIlIIlllllIllII(cb.get(lIIlIIIIlIlIl[2]).aa() ? 1 : 0)) {
                    AccBuilderRat.f += lIIlIIIIlIlIl[0];
                    System.out.println("Achieved " + cb.get(lIIlIIIIlIlIl[2]).Z() + " goal");
                    cb.remove(lIIlIIIIlIlIl[2]);
                    "".length();
                    if (lIlIIlllllIlllI(cb.isEmpty() ? 1 : 0)) {
                        System.out.println("Switching to : " + cb.get(lIIlIIIIlIlIl[2]).Z());
                        h = cb.get(lIIlIIIIlIlIl[2]).Z();
                    }
                    if (lIlIIlllllIllII(cb.isEmpty() ? 1 : 0)) {
                        h = lIIlIIIIlIlII[lIIlIIIIlIlIl[2]];
                    }
                    Time.sleepTicks(lIIlIIIIlIlIl[5]);
                    "".length();
                }
                if (lIlIIlllllIllll(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIlIIlllllIllII(C0004e.y() ? 1 : 0) && lIlIIlllllIlllI(AccBuilderRat.d ? 1 : 0) && lIlIIllllllIIII(C0004e.j(lIIlIIIIlIlIl[13]), lIIlIIIIlIlIl[14]) && lIlIIlllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIlIlII[lIIlIIIIlIlIl[0]];
                        C0004e.z();
                        Time.sleepTicks(lIIlIIIIlIlIl[0]);
                        "".length();
                        "".length();
                        if ((((150 ^ 143) ^ (91 ^ 111)) & (((93 ^ 89) ^ (181 ^ 156)) ^ (-" ".length()))) >= "   ".length()) {
                            return;
                        }
                    }
                    AccBuilderRat.l = cb.get(lIIlIIIIlIlIl[2]).Z();
                    Time.sleep(cb.get(lIIlIIIIlIlIl[2]).Y());
                    "".length();
                    Time.sleep(C0004e.c(lIIlIIIIlIlIl[15], lIIlIIIIlIlIl[16]));
                    "".length();
                }
                C0004e.F();
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIlIIlllllIlllI(int i2) {
        return i2 == 0;
    }

    private static void lIlIIlllllIlIlI() {
        lIIlIIIIlIlII = new String[lIIlIIIIlIlIl[4]];
        lIIlIIIIlIlII[lIIlIIIIlIlIl[2]] = lIlIIlllllIIlll("8jVTxaVVhRw=", "XvgVK");
        lIIlIIIIlIlII[lIIlIIIIlIlIl[0]] = lIlIIlllllIlIII("86yOkGF9PvTOFyfjukDNmUzyw+dIzdY4", "LfZEk");
        lIIlIIIIlIlII[lIIlIIIIlIlIl[3]] = lIlIIlllllIlIIl("", "uIkbU");
    }

    private static boolean lIlIIllllllIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIllllllIIIl(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIlllllIllII(int i2) {
        return i2 != 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return h;
    }

    private static String lIlIIlllllIlIIl(String llllllllllllllIllllllIlllllIllII, String llllllllllllllIllllllIlllllIlIll) {
        String llllllllllllllIllllllIlllllIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIllllllIlllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllllIlllllIlIIl = llllllllllllllIllllllIlllllIlIll.toCharArray();
        int llllllllllllllIllllllIlllllIlIII = lIIlIIIIlIlIl[2];
        char[] charArray = llllllllllllllIllllllIlllllIllII2.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllllllIlllllIIIII = lIIlIIIIlIlIl[2];
        while (lIlIIlllllIllIl(llllllllllllllIllllllIlllllIIIII, length)) {
            sb.append((char) (charArray[llllllllllllllIllllllIlllllIIIII] ^ llllllllllllllIllllllIlllllIlIIl[llllllllllllllIllllllIlllllIlIII % llllllllllllllIllllllIlllllIlIIl.length]));
            "".length();
            llllllllllllllIllllllIlllllIlIII++;
            llllllllllllllIllllllIlllllIIIII++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIIlllllIlIll() {
        lIIlIIIIlIlIl = new int[18];
        lIIlIIIIlIlIl[0] = " ".length();
        lIIlIIIIlIlIl[1] = 163 ^ 166;
        lIIlIIIIlIlIl[2] = (96 ^ 41) & ((60 ^ 117) ^ (-1));
        lIIlIIIIlIlIl[3] = "  ".length();
        lIIlIIIIlIlIl[4] = "   ".length();
        lIIlIIIIlIlIl[5] = 159 ^ 155;
        lIIlIIIIlIlIl[6] = (((141 + 101) - 145) + 86) ^ (((104 + 117) - 158) + 124);
        lIIlIIIIlIlIl[7] = (14 ^ 106) ^ (87 ^ 53);
        lIIlIIIIlIlIl[8] = 152 ^ 159;
        lIIlIIIIlIlIl[9] = (245 ^ 180) ^ (211 ^ 154);
        lIIlIIIIlIlIl[10] = (((6 + 26) - 25) + 157) ^ (((155 + 50) - 51) + 19);
        lIIlIIIIlIlIl[11] = 185 ^ 179;
        lIIlIIIIlIlIl[12] = (((55 + 61) - 36) + 85) ^ (((153 + 18) - 137) + 140);
        lIIlIIIIlIlIl[13] = (-23201) & 23481;
        lIIlIIIIlIlIl[14] = (-18436) & 19435;
        lIIlIIIIlIlIl[15] = (((108 + 71) - 64) + 36) ^ (((99 + 55) - 31) + 42);
        lIIlIIIIlIlIl[16] = (38 ^ 82) ^ (102 ^ 66);
        lIIlIIIIlIlIl[17] = (159 ^ 169) ^ (234 ^ 184);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    static {
        lIlIIlllllIlIll();
        lIlIIlllllIlIlI();
        cb = new ArrayList();
        h = lIIlIIIIlIlII[lIIlIIIIlIlIl[3]];
        cc = lIIlIIIIlIlIl[2];
    }

    private static String lIlIIlllllIlIII(String llllllllllllllIllllllIllllllllII, String llllllllllllllIllllllIlllllllIll) {
        try {
            SecretKeySpec llllllllllllllIllllllIllllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllIlllllllIll.getBytes(StandardCharsets.UTF_8)), lIIlIIIIlIlIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIIIlIlIl[3], llllllllllllllIllllllIllllllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllIllllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllllIllllllllIl) {
            llllllllllllllIllllllIllllllllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIlIIIIlIlIl[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlllllIllII(cb.isEmpty() ? 1 : 0) && lIlIIllllllIIIl(bY)) {
            ?? r0 = lIIlIIIIlIlIl[0];
            "".length();
            return "  ".length() >= (188 ^ 184) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIIIlIlIl[2];
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            aq();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (191 ^ 168) & ((3 ^ 20) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIlIIIIlIlIl[17];
    }
}
