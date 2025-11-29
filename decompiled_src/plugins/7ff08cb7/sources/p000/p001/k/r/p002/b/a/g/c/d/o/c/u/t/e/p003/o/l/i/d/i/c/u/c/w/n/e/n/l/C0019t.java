package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/t.class */
public class C0019t implements ab {
    private static /* synthetic */ int[] lIIIIlIIIl;
    static /* synthetic */ boolean df;
    private static /* synthetic */ String[] lIIIIlIIII;
    static /* synthetic */ int cI;
    public static /* synthetic */ List<ab> de;
    public static /* synthetic */ String h;

    private static void llIlllllllll() {
        lIIIIlIIII = new String[lIIIIlIIIl[5]];
        lIIIIlIIII[lIIIIlIIIl[2]] = llIlllllllII("IBg6Jw==", "NwTBo");
        lIIIIlIIII[lIIIIlIIIl[0]] = llIlllllllIl("KwDyEvUsxD9atIEMJJ6OzCZ5iwscdwWO", "pKBdi");
        lIIIIlIIII[lIIIIlIIIl[3]] = llIlllllllIl("aqZkHeNRLF9lrh/Tx7996w==", "bDKRb");
        lIIIIlIIII[lIIIIlIIIl[4]] = llIllllllllI("W0uXEgl3srU=", "NfTyM");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIlIIIl[2];
    }

    private static boolean lllIIIIIIIIl(int i) {
        return i != 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    static {
        lllIIIIIIIII();
        llIlllllllll();
        de = new ArrayList();
        h = lIIIIlIIII[lIIIIlIIIl[4]];
        df = lIIIIlIIIl[2];
    }

    private static String llIlllllllIl(String lIIIIIIIIIIlI, String llllllllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllll.getBytes(StandardCharsets.UTF_8)), lIIIIlIIIl[1]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIlIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIIIIIIll) {
            lIIIIIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIIlll(int i, int i2) {
        return i >= i2;
    }

    private static String llIlllllllII(String lllllllIIlIl, String lllllllIIlII) {
        String lllllllIIlIl2 = new String(Base64.getDecoder().decode(lllllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllIIIll = new StringBuilder();
        char[] charArray = lllllllIIlII.toCharArray();
        int lllllllIIIIl = lIIIIlIIIl[2];
        char[] charArray2 = lllllllIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIIIlIIIl[2];
        while (lllIIIIIIIlI(i, length)) {
            lllllllIIIll.append((char) (charArray2[i] ^ charArray[lllllllIIIIl % charArray.length]));
            "".length();
            lllllllIIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllIIIll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (!lllIIIIIIIIl(AccBuilderGWD.n ? 1 : 0)) {
            if (lllIIIIIIIIl(de.isEmpty() ? 1 : 0) && lllIIIIIIllI(cI)) {
                ?? r0 = lIIIIlIIIl[0];
                "".length();
                return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIIlIIIl[2];
        } else if (lllIIIIIIIIl(de.isEmpty() ? 1 : 0) && lllIIIIIIllI(cI) && lllIIIIIIlll(Skills.getLevel(Skill.AGILITY), lIIIIlIIIl[13])) {
            ?? r02 = lIIIIlIIIl[0];
            "".length();
            return " ".length() <= 0 ? ((175 ^ 149) ^ "  ".length()) & (((((107 + 65) - 104) + 94) ^ (((20 + 13) - (-85)) + 36)) ^ (-" ".length())) : r02;
        } else {
            return lIIIIlIIIl[2];
        }
    }

    private static boolean lllIIIIIIIlI(int i, int i2) {
        return i < i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            aW();
            "".length();
            if (((12 ^ 96) ^ (220 ^ 180)) < ((147 ^ 161) ^ (113 ^ 71))) {
                return ((((49 + 47) - (-11)) + 54) ^ (((75 + 82) - 66) + 97)) & (((((56 + 68) - 83) + 112) ^ (((78 + 31) - 64) + 87)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIIlIIIl[14];
    }

    private static boolean lllIIIIIIIll(int i) {
        return i == 0;
    }

    private static boolean lllIIIIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lllIIIIIIIII() {
        lIIIIlIIIl = new int[15];
        lIIIIlIIIl[0] = " ".length();
        lIIIIlIIIl[1] = (((24 + 56) - (-13)) + 35) ^ (((55 + 95) - 15) + 1);
        lIIIIlIIIl[2] = (82 ^ 105) & ((56 ^ 3) ^ (-1));
        lIIIIlIIIl[3] = "  ".length();
        lIIIIlIIIl[4] = "   ".length();
        lIIIIlIIIl[5] = 21 ^ 17;
        lIIIIlIIIl[6] = 137 ^ 140;
        lIIIIlIIIl[7] = 185 ^ 191;
        lIIIIlIIIl[8] = (0 ^ 84) ^ (40 ^ 123);
        lIIIIlIIIl[9] = (-26853) & 27133;
        lIIIIlIIIl[10] = (-((-17153) & 24342)) & (-16385) & 24573;
        lIIIIlIIIl[11] = (24 ^ 55) ^ (111 ^ 114);
        lIIIIlIIIl[12] = (162 ^ 147) ^ (195 ^ 162);
        lIIIIlIIIl[13] = (((11 + 48) - (-154)) + 10) ^ (((127 + 98) - 86) + 14);
        lIIIIlIIIl[14] = (113 ^ 85) ^ (250 ^ 186);
    }

    public static void aW() {
        if (lllIIIIIIIIl(de.isEmpty() ? 1 : 0) && lllIIIIIIIlI(cI, lIIIIlIIIl[0])) {
            ab[] abVarArr = new ab[lIIIIlIIIl[1]];
            abVarArr[lIIIIlIIIl[2]] = new O();
            abVarArr[lIIIIlIIIl[0]] = new Y();
            abVarArr[lIIIIlIIIl[3]] = new V();
            abVarArr[lIIIIlIIIl[4]] = new ac();
            abVarArr[lIIIIlIIIl[5]] = new U();
            abVarArr[lIIIIlIIIl[6]] = new S();
            abVarArr[lIIIIlIIIl[7]] = new C0023x();
            abVarArr[lIIIIlIIIl[8]] = new F();
            List asList = Arrays.asList(abVarArr);
            ab[] abVarArr2 = new ab[lIIIIlIIIl[7]];
            abVarArr2[lIIIIlIIIl[2]] = new K();
            abVarArr2[lIIIIlIIIl[0]] = new A();
            abVarArr2[lIIIIlIIIl[3]] = new Q();
            abVarArr2[lIIIIlIIIl[4]] = new Z();
            abVarArr2[lIIIIlIIIl[5]] = new G();
            abVarArr2[lIIIIlIIIl[6]] = new L();
            List asList2 = Arrays.asList(abVarArr2);
            ab[] abVarArr3 = new ab[lIIIIlIIIl[6]];
            abVarArr3[lIIIIlIIIl[2]] = new E();
            abVarArr3[lIIIIlIIIl[0]] = new ag();
            abVarArr3[lIIIIlIIIl[3]] = new C0021v();
            abVarArr3[lIIIIlIIIl[4]] = new ai();
            abVarArr3[lIIIIlIIIl[5]] = new C0025z();
            List asList3 = Arrays.asList(abVarArr3);
            Collections.shuffle(asList);
            Collections.shuffle(asList2);
            Collections.shuffle(asList3);
            de.addAll(asList);
            "".length();
            de.add(new N());
            "".length();
            de.addAll(asList2);
            "".length();
            de.add(new T());
            "".length();
            de.add(new ae());
            "".length();
            de.addAll(asList3);
            "".length();
            de.add(new ak());
            "".length();
            cI += lIIIIlIIIl[0];
            if (lllIIIIIIIll(de.isEmpty() ? 1 : 0)) {
                if (lllIIIIIIIIl(df ? 1 : 0)) {
                    Collections.shuffle(de);
                }
                System.out.println("Switching to : " + de.get(lIIIIlIIIl[2]).ag());
                h = de.get(lIIIIlIIIl[2]).ag();
            }
        }
        while (lllIIIIIIIll(de.isEmpty() ? 1 : 0) && lllIIIIIIIll(AccBuilderGWD.d ? 1 : 0)) {
            if (lllIIIIIIlII(Game.getState(), GameState.LOGGED_IN)) {
                if (lllIIIIIIIIl(de.get(lIIIIlIIIl[2]).ah() ? 1 : 0)) {
                    AccBuilderGWD.f += lIIIIlIIIl[0];
                    System.out.println("Achieved " + de.get(lIIIIlIIIl[2]).ag() + " goal");
                    de.remove(lIIIIlIIIl[2]);
                    "".length();
                    if (lllIIIIIIIll(de.isEmpty() ? 1 : 0)) {
                        System.out.println("Switching to : " + de.get(lIIIIlIIIl[2]).ag());
                        h = de.get(lIIIIlIIIl[2]).ag();
                    }
                    if (lllIIIIIIIIl(de.isEmpty() ? 1 : 0)) {
                        h = lIIIIlIIII[lIIIIlIIIl[2]];
                    }
                    Time.sleepTicks(lIIIIlIIIl[5]);
                    "".length();
                }
                if (lllIIIIIIlII(Game.getState(), GameState.LOGGED_IN)) {
                    while (lllIIIIIIIIl(C0004e.z() ? 1 : 0) && lllIIIIIIIll(AccBuilderGWD.d ? 1 : 0) && lllIIIIIIlIl(C0004e.j(lIIIIlIIIl[9]), lIIIIlIIIl[10]) && lllIIIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIIII[lIIIIlIIIl[0]];
                        C0004e.A();
                        Time.sleepTicks(lIIIIlIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() < " ".length()) {
                            return;
                        }
                    }
                    AccBuilderGWD.l = de.get(lIIIIlIIIl[2]).ag();
                    Time.sleep(de.get(lIIIIlIIIl[2]).af());
                    "".length();
                    Time.sleep(C0004e.c(lIIIIlIIIl[11], lIIIIlIIIl[12]));
                    "".length();
                }
                C0004e.G();
                "".length();
                if ((-"  ".length()) > 0) {
                    return;
                }
            }
        }
        if (lllIIIIIIIIl(AccBuilderGWD.n ? 1 : 0) && lllIIIIIIIIl(de.isEmpty() ? 1 : 0) && lllIIIIIIllI(cI) && lllIIIIIIIlI(Skills.getLevel(Skill.AGILITY), lIIIIlIIIl[13])) {
            h = lIIIIlIIII[lIIIIlIIIl[3]];
            al.dT();
        }
    }

    private static boolean lllIIIIIIllI(int i) {
        return i > 0;
    }

    private static boolean lllIIIIIIlIl(int i, int i2) {
        return i == i2;
    }

    private static String llIllllllllI(String llllllllIlIl, String llllllllIlII) {
        try {
            SecretKeySpec lllllllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllIlll = Cipher.getInstance("Blowfish");
            llllllllIlll.init(lIIIIlIIIl[3], lllllllllIII);
            return new String(llllllllIlll.doFinal(Base64.getDecoder().decode(llllllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllIllI) {
            llllllllIllI.printStackTrace();
            return null;
        }
    }
}
