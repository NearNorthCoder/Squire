package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/o.class */
public class C0014o implements F {
    public static /* synthetic */ String h;
    public static /* synthetic */ List<F> cc;
    private static /* synthetic */ int[] lllIlllI;
    private static /* synthetic */ String[] lllIllII;
    static /* synthetic */ boolean cd;
    static /* synthetic */ int bZ;

    public static void az() {
        if (llIIIlIlIII(cc.isEmpty() ? 1 : 0) && llIIIlIlIIl(bZ, lllIlllI[0])) {
            F[] fArr = new F[lllIlllI[1]];
            fArr[lllIlllI[2]] = new y();
            fArr[lllIlllI[0]] = new K();
            List asList = Arrays.asList(fArr);
            F[] fArr2 = new F[lllIlllI[3]];
            fArr2[lllIlllI[2]] = new H();
            fArr2[lllIlllI[0]] = new C0016q();
            fArr2[lllIlllI[1]] = new I();
            List asList2 = Arrays.asList(fArr2);
            Collections.shuffle(asList);
            Collections.shuffle(asList2);
            cc.addAll(asList);
            "".length();
            cc.addAll(asList2);
            "".length();
            cc.add(new J());
            "".length();
            bZ += lllIlllI[0];
            if (llIIIlIlIlI(cc.isEmpty() ? 1 : 0)) {
                if (llIIIlIlIII(cd ? 1 : 0)) {
                    Collections.shuffle(cc);
                }
                System.out.println("Switching to : " + cc.get(lllIlllI[2]).V());
                h = cc.get(lllIlllI[2]).V();
            }
        }
        while (llIIIlIlIlI(cc.isEmpty() ? 1 : 0) && llIIIlIlIlI(AccBuilderBarrows.d ? 1 : 0)) {
            if (llIIIlIlIll(Game.getState(), GameState.LOGGED_IN)) {
                if (llIIIlIlIII(cc.get(lllIlllI[2]).W() ? 1 : 0)) {
                    AccBuilderBarrows.f += lllIlllI[0];
                    System.out.println("Achieved " + cc.get(lllIlllI[2]).V() + " goal");
                    cc.remove(lllIlllI[2]);
                    "".length();
                    if (llIIIlIlIlI(cc.isEmpty() ? 1 : 0)) {
                        System.out.println("Switching to : " + cc.get(lllIlllI[2]).V());
                        h = cc.get(lllIlllI[2]).V();
                    }
                    if (llIIIlIlIII(cc.isEmpty() ? 1 : 0)) {
                        h = lllIllII[lllIlllI[2]];
                    }
                    Time.sleepTicks(lllIlllI[4]);
                    "".length();
                }
                if (llIIIlIlIll(Game.getState(), GameState.LOGGED_IN)) {
                    while (llIIIlIlIII(C0004e.y() ? 1 : 0) && llIIIlIlIlI(AccBuilderBarrows.d ? 1 : 0) && llIIIlIllII(C0004e.j(lllIlllI[5]), lllIlllI[6]) && llIIIlIlIlI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = lllIllII[lllIlllI[0]];
                        C0004e.z();
                        Time.sleepTicks(lllIlllI[0]);
                        "".length();
                        "".length();
                        if (!((true ^ true) ^ (true ^ true))) {
                            return;
                        }
                    }
                    AccBuilderBarrows.l = cc.get(lllIlllI[2]).V();
                    Time.sleep(cc.get(lllIlllI[2]).U());
                    "".length();
                    Time.sleep(C0004e.c(lllIlllI[7], lllIlllI[8]));
                    "".length();
                }
                C0004e.F();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
    }

    private static boolean llIIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIlIlIII(int i) {
        return i != 0;
    }

    private static boolean llIIIlIlIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            az();
            "".length();
            if (" ".length() != " ".length()) {
                return (32 ^ 0) & ((151 ^ 183) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIlllI[9];
    }

    private static void llIIIlIIlll() {
        lllIlllI = new int[11];
        lllIlllI[0] = " ".length();
        lllIlllI[1] = "  ".length();
        lllIlllI[2] = ((253 ^ 184) ^ (73 ^ 37)) & (((72 ^ 0) ^ (218 ^ 187)) ^ (-" ".length()));
        lllIlllI[3] = "   ".length();
        lllIlllI[4] = 90 ^ 94;
        lllIlllI[5] = (-((-16701) & 20479)) & (-8229) & 12287;
        lllIlllI[6] = (-((-834) & 19267)) & (-7) & 19439;
        lllIlllI[7] = 161 ^ 147;
        lllIlllI[8] = (((81 + 219) - 155) + 79) ^ (((8 + 21) - (-83)) + 64);
        lllIlllI[9] = 228 ^ 128;
        lllIlllI[10] = (((34 + 91) - 66) + 98) ^ (((104 + 13) - (-13)) + 19);
    }

    private static String llIIIIlllII(String lIIllllIIIllllI, String lIIllllIIlIIIlI) {
        String lIIllllIIIllllI2 = new String(Base64.getDecoder().decode(lIIllllIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllllIIlIIIIl = new StringBuilder();
        char[] lIIllllIIlIIIII = lIIllllIIlIIIlI.toCharArray();
        int lIIllllIIIlllll = lllIlllI[2];
        char[] charArray = lIIllllIIIllllI2.toCharArray();
        int length = charArray.length;
        int i = lllIlllI[2];
        while (llIIIlIlIIl(i, length)) {
            char lIIllllIIlIIlII = charArray[i];
            lIIllllIIlIIIIl.append((char) (lIIllllIIlIIlII ^ lIIllllIIlIIIII[lIIllllIIIlllll % lIIllllIIlIIIII.length]));
            "".length();
            lIIllllIIIlllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIIllllIIlIIIIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    static {
        llIIIlIIlll();
        llIIIIllllI();
        cc = new ArrayList();
        h = lllIllII[lllIlllI[1]];
        cd = lllIlllI[2];
    }

    private static boolean llIIIlIlIlI(int i) {
        return i == 0;
    }

    private static String llIIIIlllIl(String lIIllllIIIIIIIl, String lIIllllIIIIIIII) {
        try {
            SecretKeySpec lIIllllIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllIIIIIIII.getBytes(StandardCharsets.UTF_8)), lllIlllI[10]), "DES");
            Cipher lIIllllIIIIIIll = Cipher.getInstance("DES");
            lIIllllIIIIIIll.init(lllIlllI[1], lIIllllIIIIIlII);
            return new String(lIIllllIIIIIIll.doFinal(Base64.getDecoder().decode(lIIllllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllllIIIIIIlI) {
            lIIllllIIIIIIlI.printStackTrace();
            return null;
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return h;
    }

    private static boolean llIIIlIllIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lllIlllI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIIIlIlIII(cc.isEmpty() ? 1 : 0) && llIIIlIllIl(bZ)) {
            ?? r0 = lllIlllI[0];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlllI[2];
    }

    private static boolean llIIIlIllII(int i, int i2) {
        return i == i2;
    }

    private static void llIIIIllllI() {
        lllIllII = new String[lllIlllI[3]];
        lllIllII[lllIlllI[2]] = llIIIIllIll("eQjfTA3fUQA=", "wKPTU");
        lllIllII[lllIlllI[0]] = llIIIIlllII("CCg4NDQgKCUydgsEayI3Pi8iOzE=", "LAKUV");
        lllIllII[lllIlllI[1]] = llIIIIlllIl("iGrAcWMDdfk=", "okQwP");
    }

    private static String llIIIIllIll(String lIIllllIIIIlllI, String lIIllllIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllllIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllllIIIlIIII = Cipher.getInstance("Blowfish");
            lIIllllIIIlIIII.init(lllIlllI[1], secretKeySpec);
            return new String(lIIllllIIIlIIII.doFinal(Base64.getDecoder().decode(lIIllllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllllIIIIlIlI) {
            lIIllllIIIIlIlI.printStackTrace();
            return null;
        }
    }
}
