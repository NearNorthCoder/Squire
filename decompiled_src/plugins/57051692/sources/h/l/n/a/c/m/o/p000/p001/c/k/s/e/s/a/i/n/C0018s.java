package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/s.class */
public class C0018s implements K {
    static /* synthetic */ boolean cY;
    static /* synthetic */ int cA;
    public static /* synthetic */ List<K> cX;

    /* renamed from: h  reason: collision with root package name */
    public static /* synthetic */ String f5h;
    private static /* synthetic */ int[] lIlIIIlIlI;
    private static /* synthetic */ String[] lIlIIIlIIl;

    private static boolean lIIIlIIlllIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIlIIllIllI(cX.isEmpty() ? 1 : 0) && lIIIlIIlllIll(cA) && lIIIlIIllllII(Skills.getLevel(Skill.RANGED), lIlIIIlIlI[10])) {
            ?? r0 = lIlIIIlIlI[0];
            "".length();
            return "   ".length() >= (131 ^ 135) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
        }
        return lIlIIIlIlI[2];
    }

    private static String lIIIlIIllIIlI(String llllllllllllllllllllIIlllllIIIII, String llllllllllllllllllllIIllllIlllll) {
        try {
            SecretKeySpec llllllllllllllllllllIIlllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIlIlI[1], llllllllllllllllllllIIlllllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIlllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIlllllIIIIl) {
            llllllllllllllllllllIIlllllIIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    static {
        lIIIlIIllIlIl();
        lIIIlIIllIIll();
        cX = new ArrayList();
        f5h = lIlIIIlIIl[lIlIIIlIlI[1]];
        cY = lIlIIIlIlI[2];
    }

    private static boolean lIIIlIIlllIll(int i) {
        return i > 0;
    }

    private static void lIIIlIIllIlIl() {
        lIlIIIlIlI = new int[13];
        lIlIIIlIlI[0] = " ".length();
        lIlIIIlIlI[1] = "  ".length();
        lIlIIIlIlI[2] = ((20 ^ 25) ^ (224 ^ 168)) & (((83 ^ 42) ^ (10 ^ 54)) ^ (-" ".length()));
        lIlIIIlIlI[3] = 72 ^ 77;
        lIlIIIlIlI[4] = "   ".length();
        lIlIIIlIlI[5] = (233 ^ 172) ^ (42 ^ 107);
        lIlIIIlIlI[6] = (-8709) & 8989;
        lIlIIIlIlI[7] = (-((-3461) & 23943)) & (-22) & 21503;
        lIlIIIlIlI[8] = (131 ^ 159) ^ (186 ^ 148);
        lIlIIIlIlI[9] = 106 ^ 58;
        lIlIIIlIlI[10] = 59 ^ 6;
        lIlIIIlIlI[11] = 248 ^ 156;
        lIlIIIlIlI[12] = 19 ^ 27;
    }

    private static String lIIIlIIllIIIl(String llllllllllllllllllllIIlllllIllIl, String llllllllllllllllllllIIlllllIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIlllllIllII.getBytes(StandardCharsets.UTF_8)), lIlIIIlIlI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIlIlI[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIlllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIlllllIlllI) {
            llllllllllllllllllllIIlllllIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIllIllI(int i) {
        return i != 0;
    }

    private static boolean lIIIlIIllIlll(int i, int i2) {
        return i < i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return f5h;
    }

    public static void aZ() {
        if (lIIIlIIllIllI(cX.isEmpty() ? 1 : 0) && lIIIlIIllIlll(cA, lIlIIIlIlI[0])) {
            K[] kArr = new K[lIlIIIlIlI[1]];
            kArr[lIlIIIlIlI[2]] = new C();
            kArr[lIlIIIlIlI[0]] = new T();
            List asList = Arrays.asList(kArr);
            K[] kArr2 = new K[lIlIIIlIlI[3]];
            kArr2[lIlIIIlIlI[2]] = new S();
            kArr2[lIlIIIlIlI[0]] = new C0020u();
            kArr2[lIlIIIlIlI[1]] = new Q();
            kArr2[lIlIIIlIlI[4]] = new L();
            kArr2[lIlIIIlIlI[5]] = new O();
            List asList2 = Arrays.asList(kArr2);
            Collections.shuffle(asList);
            Collections.shuffle(asList2);
            cX.addAll(asList);
            "".length();
            cX.addAll(asList2);
            "".length();
            cX.add(new C0016q());
            "".length();
            cA += lIlIIIlIlI[0];
            if (lIIIlIIlllIII(cX.isEmpty() ? 1 : 0)) {
                if (lIIIlIIllIllI(cY ? 1 : 0)) {
                    Collections.shuffle(cX);
                }
                System.out.println("Switching to : " + cX.get(lIlIIIlIlI[2]).ae());
                f5h = cX.get(lIlIIIlIlI[2]).ae();
            }
        }
        while (lIIIlIIlllIII(cX.isEmpty() ? 1 : 0) && lIIIlIIlllIII(AccBuilderShamans.d ? 1 : 0)) {
            if (lIIIlIIlllIIl(Game.getState(), GameState.LOGGED_IN)) {
                if (lIIIlIIllIllI(cX.get(lIlIIIlIlI[2]).af() ? 1 : 0)) {
                    AccBuilderShamans.f += lIlIIIlIlI[0];
                    System.out.println("Achieved " + cX.get(lIlIIIlIlI[2]).ae() + " goal");
                    cX.remove(lIlIIIlIlI[2]);
                    "".length();
                    if (lIIIlIIlllIII(cX.isEmpty() ? 1 : 0)) {
                        System.out.println("Switching to : " + cX.get(lIlIIIlIlI[2]).ae());
                        f5h = cX.get(lIlIIIlIlI[2]).ae();
                    }
                    if (lIIIlIIllIllI(cX.isEmpty() ? 1 : 0)) {
                        f5h = lIlIIIlIIl[lIlIIIlIlI[2]];
                    }
                    Time.sleepTicks(lIlIIIlIlI[5]);
                    "".length();
                }
                if (lIIIlIIlllIIl(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIIIlIIllIllI(C0004e.x() ? 1 : 0) && lIIIlIIlllIII(AccBuilderShamans.d ? 1 : 0) && lIIIlIIlllIlI(C0004e.j(lIlIIIlIlI[6]), lIlIIIlIlI[7]) && lIIIlIIlllIII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIlIIl[lIlIIIlIlI[0]];
                        C0004e.y();
                        Time.sleepTicks(lIlIIIlIlI[0]);
                        "".length();
                        "".length();
                        if ((-"   ".length()) >= 0) {
                            return;
                        }
                    }
                    AccBuilderShamans.l = cX.get(lIlIIIlIlI[2]).ae();
                    Time.sleep(cX.get(lIlIIIlIlI[2]).ad());
                    "".length();
                    Time.sleep(C0004e.c(lIlIIIlIlI[8], lIlIIIlIlI[9]));
                    "".length();
                }
                C0004e.E();
                "".length();
                if ("  ".length() == ((121 ^ 42) ^ (47 ^ 120))) {
                    return;
                }
            }
        }
        if (lIIIlIIllIllI(cX.isEmpty() ? 1 : 0) && lIIIlIIlllIll(cA) && lIIIlIIllIlll(Skills.getLevel(Skill.RANGED), lIlIIIlIlI[10])) {
            C0013n.ay();
        }
    }

    private static void lIIIlIIllIIll() {
        lIlIIIlIIl = new String[lIlIIIlIlI[4]];
        lIlIIIlIIl[lIlIIIlIlI[2]] = lIIIlIIllIIIl("STCvI5EMOug=", "ScpId");
        lIlIIIlIIl[lIlIIIlIlI[0]] = lIIIlIIllIIIl("1N5xGBNNH7BHeQM8AhX1IaFpese3wiOA", "UYHsw");
        lIlIIIlIIl[lIlIIIlIlI[1]] = lIIIlIIllIIlI("8oYqMyawO7c=", "Hsmfy");
    }

    private static boolean lIIIlIIlllIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIIlIlI[2];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            aZ();
            "".length();
            if (" ".length() < 0) {
                return ((((92 + 43) - 63) + 82) ^ (((79 + 3) - (-75)) + 10)) & (((((124 + 100) - 131) + 34) ^ (26 ^ 88)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIIlIlI[11];
    }

    private static boolean lIIIlIIllllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIlIIlllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }
}
