package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ak  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/ak.class */
public class ak implements W {
    public static final /* synthetic */ int mk;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ int mh;
    private static /* synthetic */ String[] lIlllllll;
    public static /* synthetic */ int[] mn;
    public static final /* synthetic */ int ml;
    public static final /* synthetic */ int mg;
    public static final /* synthetic */ int mj;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ int mi;
    public static /* synthetic */ int[] mo;
    public static /* synthetic */ WorldArea z;
    public static final /* synthetic */ int[] mm;
    private static /* synthetic */ int[] llIIIIIII;
    public static /* synthetic */ boolean bt;

    private static void lIlIIIIIlllI() {
        lIlllllll = new String[llIIIIIII[63]];
        lIlllllll[llIIIIIII[0]] = lIlIIIIIlIll("UeA0ZDDJ77f6TRdlfF5boA==", "SJicU");
        lIlllllll[llIIIIIII[1]] = lIlIIIIIllII("IRgoHREPFCJUABIILxoFRxgyEQ8UXWYHFQ4FJRwLCRZmFgMEGmYADUccLxoLCRY=", "gqFtb");
        lIlllllll[llIIIIIII[2]] = lIlIIIIIllII("GiQ6BTY1MSUCNnQxI0wzNSsn", "TELlQ");
        lIlllllll[llIIIIIII[3]] = lIlIIIIIllIl("GElKRtemJZZz59bahAHsS1i7nG+QcObH", "iHGPS");
        lIlllllll[llIIIIIII[5]] = lIlIIIIIlIll("lS+JOSyJJccg5aLA+mGjeMYI216aDMDk+AZGLWOHSwFfz8tOjxsJunOxA+c8gDIm", "bJqPX");
        lIlllllll[llIIIIIII[23]] = lIlIIIIIllIl("p3crquDj8ZW+h5o+GqMFQw==", "vMLdy");
        lIlllllll[llIIIIIII[21]] = lIlIIIIIlIll("gUtkfRi1wDOSrRzpSZiB7Q==", "VdChr");
        lIlllllll[llIIIIIII[25]] = lIlIIIIIlIll("0O13hgmjyZ+LGUKNw7fthw==", "vyZqM");
        lIlllllll[llIIIIIII[26]] = lIlIIIIIllIl("x4GKKNpigac=", "mfCOQ");
        lIlllllll[llIIIIIII[27]] = lIlIIIIIllIl("IMYv8b0bVB2vVjdLYw4K7Hp9dmBi4aDa", "onxzl");
        lIlllllll[llIIIIIII[28]] = lIlIIIIIllII("Gw0eJgoxRBk9Czg=", "VdpOd");
        lIlllllll[llIIIIIII[29]] = lIlIIIIIlIll("1QdP8Ky/+kk=", "luQGi");
        lIlllllll[llIIIIIII[41]] = lIlIIIIIlIll("kqad8rjadSg=", "OUNmT");
        lIlllllll[llIIIIIII[43]] = lIlIIIIIllIl("kldaD8u7+PShLwJ2DnoI07qOQawH3p++", "daKiN");
    }

    private static boolean lIlIIIIlIIIl(int i) {
        return i != 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlllllll[llIIIIIII[41]];
    }

    private static boolean lIlIIIIlIllI(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIIIIIllII(String lIllllllllllll, String lIlllllllllllI) {
        String lIllllllllllll2 = new String(Base64.getDecoder().decode(lIllllllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlllllllllllI.toCharArray();
        int lIlllllllllIll = llIIIIIII[0];
        char[] charArray2 = lIllllllllllll2.toCharArray();
        int length = charArray2.length;
        int i = llIIIIIII[0];
        while (lIlIIIIlIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIlllllllllIll % charArray.length]));
            "".length();
            lIlllllllllIll++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIIIlIlll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIlIIIIlIllI(Skills.getLevel(Skill.MINING), llIIIIIII[42])) {
            ?? r0 = llIIIIIII[1];
            "".length();
            return (-" ".length()) == " ".length() ? ((110 ^ 22) ^ (57 ^ 11)) & (((87 ^ 24) ^ (15 ^ 10)) ^ (-" ".length())) : r0;
        }
        return llIIIIIII[0];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        er();
        return llIIIIIII[40];
    }

    private static boolean lIlIIIIlIIll(int i) {
        return i == 0;
    }

    static {
        lIlIIIIlIIII();
        lIlIIIIIlllI();
        mj = llIIIIIII[9];
        ml = llIIIIIII[17];
        mk = llIIIIIII[10];
        mh = llIIIIIII[7];
        mi = llIIIIIII[8];
        mg = llIIIIIII[6];
        int[] iArr = new int[llIIIIIII[27]];
        iArr[llIIIIIII[0]] = llIIIIIII[44];
        iArr[llIIIIIII[1]] = llIIIIIII[45];
        iArr[llIIIIIII[2]] = llIIIIIII[46];
        iArr[llIIIIIII[3]] = llIIIIIII[47];
        iArr[llIIIIIII[5]] = llIIIIIII[48];
        iArr[llIIIIIII[23]] = llIIIIIII[49];
        iArr[llIIIIIII[21]] = llIIIIIII[50];
        iArr[llIIIIIII[25]] = llIIIIIII[51];
        iArr[llIIIIIII[26]] = llIIIIIII[52];
        mm = iArr;
        bv = new ArrayList();
        int[] iArr2 = new int[llIIIIIII[2]];
        iArr2[llIIIIIII[0]] = llIIIIIII[53];
        iArr2[llIIIIIII[1]] = llIIIIIII[54];
        mn = iArr2;
        int[] iArr3 = new int[llIIIIIII[2]];
        iArr3[llIIIIIII[0]] = llIIIIIII[55];
        iArr3[llIIIIIII[1]] = llIIIIIII[56];
        mo = iArr3;
        z = new WorldArea(llIIIIIII[57], llIIIIIII[58], llIIIIIII[59], llIIIIIII[60], llIIIIIII[0]);
        G = new WorldPoint(llIIIIIII[61], llIIIIIII[62], llIIIIIII[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return llIIIIIII[0];
    }

    private static boolean lIlIIIIlIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIIlIIlI(int i, int i2) {
        return i < i2;
    }

    public static void af() {
        bv.add(new C0003d(llIIIIIII[17], llIIIIIII[1], llIIIIIII[33]));
        "".length();
        int[] iArr = new int[llIIIIIII[1]];
        iArr[llIIIIIII[0]] = llIIIIIII[6];
        if (lIlIIIIlIIll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIII[6], llIIIIIII[1], llIIIIIII[4]));
            "".length();
        }
        int[] iArr2 = new int[llIIIIIII[1]];
        iArr2[llIIIIIII[0]] = llIIIIIII[7];
        if (lIlIIIIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIII[7], llIIIIIII[1], llIIIIIII[4]));
            "".length();
        }
        int[] iArr3 = new int[llIIIIIII[1]];
        iArr3[llIIIIIII[0]] = llIIIIIII[8];
        if (lIlIIIIlIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIII[8], llIIIIIII[1], llIIIIIII[34]));
            "".length();
        }
        int[] iArr4 = new int[llIIIIIII[1]];
        iArr4[llIIIIIII[0]] = llIIIIIII[9];
        if (lIlIIIIlIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIII[9], llIIIIIII[1], llIIIIIII[35]));
            "".length();
        }
        int[] iArr5 = new int[llIIIIIII[1]];
        iArr5[llIIIIIII[0]] = llIIIIIII[10];
        if (lIlIIIIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIII[10], llIIIIIII[1], llIIIIIII[36]));
            "".length();
        }
        if (lIlIIIIlIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllllll[llIIIIIII[43]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIII[19], llIIIIIII[23], llIIIIIII[36]));
            "".length();
        }
        int[] iArr6 = new int[llIIIIIII[1]];
        iArr6[llIIIIIII[0]] = llIIIIIII[37];
        if (lIlIIIIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIIII[37], llIIIIIII[38], llIIIIIII[39]));
            "".length();
        }
    }

    private static boolean lIlIIIIlIlIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static boolean ab() {
        if (lIlIIIIlIllI(Skills.getLevel(Skill.MINING), llIIIIIII[30])) {
            int[] iArr = new int[llIIIIIII[1]];
            iArr[llIIIIIII[0]] = llIIIIIII[10];
            if (lIlIIIIlIlIl(Inventory.getCount(iArr))) {
                ?? r0 = llIIIIIII[1];
                "".length();
                return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIIIII[0];
        } else if (lIlIIIIlIllI(Skills.getLevel(Skill.MINING), llIIIIIII[31]) && lIlIIIIlIIlI(Skills.getLevel(Skill.MINING), llIIIIIII[30])) {
            int[] iArr2 = new int[llIIIIIII[1]];
            iArr2[llIIIIIII[0]] = llIIIIIII[10];
            if (lIlIIIIlIlIl(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[llIIIIIII[1]];
                iArr3[llIIIIIII[0]] = llIIIIIII[9];
                if (lIlIIIIlIlIl(Inventory.getCount(iArr3))) {
                    ?? r02 = llIIIIIII[1];
                    "".length();
                    return " ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return llIIIIIII[0];
        } else if (lIlIIIIlIllI(Skills.getLevel(Skill.MINING), llIIIIIII[32]) && lIlIIIIlIIlI(Skills.getLevel(Skill.MINING), llIIIIIII[31])) {
            int[] iArr4 = new int[llIIIIIII[1]];
            iArr4[llIIIIIII[0]] = llIIIIIII[10];
            if (lIlIIIIlIlIl(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[llIIIIIII[1]];
                iArr5[llIIIIIII[0]] = llIIIIIII[9];
                if (lIlIIIIlIlIl(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[llIIIIIII[1]];
                    iArr6[llIIIIIII[0]] = llIIIIIII[8];
                    if (lIlIIIIlIlIl(Inventory.getCount(iArr6))) {
                        ?? r03 = llIIIIIII[1];
                        "".length();
                        return "  ".length() < 0 ? ((48 ^ 107) ^ (67 ^ 35)) & (((((116 + 50) - 164) + 135) ^ (((167 + 157) - 311) + 165)) ^ (-" ".length())) : r03;
                    }
                }
            }
            return llIIIIIII[0];
        } else if (lIlIIIIlIllI(Skills.getLevel(Skill.MINING), llIIIIIII[21]) && lIlIIIIlIIlI(Skills.getLevel(Skill.MINING), llIIIIIII[32])) {
            int[] iArr7 = new int[llIIIIIII[1]];
            iArr7[llIIIIIII[0]] = llIIIIIII[10];
            if (lIlIIIIlIlIl(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[llIIIIIII[1]];
                iArr8[llIIIIIII[0]] = llIIIIIII[9];
                if (lIlIIIIlIlIl(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[llIIIIIII[1]];
                    iArr9[llIIIIIII[0]] = llIIIIIII[8];
                    if (lIlIIIIlIlIl(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[llIIIIIII[1]];
                        iArr10[llIIIIIII[0]] = llIIIIIII[7];
                        if (lIlIIIIlIlIl(Inventory.getCount(iArr10))) {
                            ?? r04 = llIIIIIII[1];
                            "".length();
                            return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                        }
                    }
                }
            }
            return llIIIIIII[0];
        } else {
            int[] iArr11 = new int[llIIIIIII[1]];
            iArr11[llIIIIIII[0]] = llIIIIIII[10];
            if (lIlIIIIlIlIl(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[llIIIIIII[1]];
                iArr12[llIIIIIII[0]] = llIIIIIII[9];
                if (lIlIIIIlIlIl(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[llIIIIIII[1]];
                    iArr13[llIIIIIII[0]] = llIIIIIII[8];
                    if (lIlIIIIlIlIl(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[llIIIIIII[1]];
                        iArr14[llIIIIIII[0]] = llIIIIIII[7];
                        if (lIlIIIIlIlIl(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[llIIIIIII[1]];
                            iArr15[llIIIIIII[0]] = llIIIIIII[6];
                            if (lIlIIIIlIlIl(Inventory.getCount(iArr15))) {
                                ?? r05 = llIIIIIII[1];
                                "".length();
                                return " ".length() >= "   ".length() ? ((((145 + 195) - 147) + 3) ^ (((142 + 64) - 105) + 42)) & (((((80 + 127) - 94) + 101) ^ (((112 + 133) - 161) + 73)) ^ (-" ".length())) : r05;
                            }
                        }
                    }
                }
            }
            return llIIIIIII[0];
        }
    }

    private static void lIlIIIIlIIII() {
        llIIIIIII = new int[64];
        llIIIIIII[0] = ((((23 + 152) - 150) + 181) ^ (((7 + 146) - 138) + 181)) & (((((47 + 122) - 0) + 20) ^ (((106 + 29) - 93) + 141)) ^ (-" ".length()));
        llIIIIIII[1] = " ".length();
        llIIIIIII[2] = "  ".length();
        llIIIIIII[3] = "   ".length();
        llIIIIIII[4] = (-8294) & 13293;
        llIIIIIII[5] = (((15 + 132) - 36) + 29) ^ (((123 + 82) - 203) + 134);
        llIIIIIII[6] = (-18447) & 19711;
        llIIIIIII[7] = (-((-1029) & 16143)) & (-1) & 16383;
        llIIIIIII[8] = (-14593) & 15865;
        llIIIIIII[9] = (-((-13525) & 32221)) & (-4097) & 24063;
        llIIIIIII[10] = (-((-21755) & 29951)) & (-2817) & 12287;
        llIIIIIII[11] = (-((-4997) & 21381)) & (-4266) & 32509;
        llIIIIIII[12] = (-(((106 + 139) - 200) + 119)) & (-20481) & 32499;
        llIIIIIII[13] = (-16690) & 28543;
        llIIIIIII[14] = (-178) & 12029;
        llIIIIIII[15] = (-(96 ^ 102)) & (-16809) & 28671;
        llIIIIIII[16] = (-((-1553) & 22454)) & (-17) & 32767;
        llIIIIIII[17] = (-((-11521) & 27925)) & (-4140) & 32511;
        llIIIIIII[18] = (84 ^ 90) ^ (234 ^ 188);
        llIIIIIII[19] = (-276) & 12255;
        llIIIIIII[20] = (-8405) & 28639;
        llIIIIIII[21] = 160 ^ 166;
        llIIIIIII[22] = 166 ^ 178;
        llIIIIIII[23] = 121 ^ 124;
        llIIIIIII[24] = (102 ^ 36) ^ (20 ^ 89);
        llIIIIIII[25] = (((141 + 154) - 174) + 48) ^ (((162 + 0) - 50) + 62);
        llIIIIIII[26] = (36 ^ 49) ^ (118 ^ 107);
        llIIIIIII[27] = 150 ^ 159;
        llIIIIIII[28] = 10 ^ 0;
        llIIIIIII[29] = 38 ^ 45;
        llIIIIIII[30] = 89 ^ 112;
        llIIIIIII[31] = (248 ^ 146) ^ (40 ^ 93);
        llIIIIIII[32] = 19 ^ 6;
        llIIIIIII[33] = (-((-2321) & 7506)) & (-513) & 40697;
        llIIIIIII[34] = (-6162) & 15161;
        llIIIIIII[35] = (-((-6265) & 23935)) & (-33) & 32702;
        llIIIIIII[36] = (-2627) & 27626;
        llIIIIIII[37] = (-8337) & 16343;
        llIIIIIII[38] = 4 ^ 44;
        llIIIIIII[39] = (-((-9475) & 29958)) & (-9225) & 30607;
        llIIIIIII[40] = 202 ^ 174;
        llIIIIIII[41] = (64 ^ 32) ^ (101 ^ 9);
        llIIIIIII[42] = 73 ^ 42;
        llIIIIIII[43] = 87 ^ 90;
        llIIIIIII[44] = (-((-25187) & 32366)) & (-24577) & 32191;
        llIIIIIII[45] = (-31298) & 31737;
        llIIIIIII[46] = (-8581) & 10197;
        llIIIIIII[47] = (-26665) & 28285;
        llIIIIIII[48] = (-((-8265) & 31081)) & (-133) & 24567;
        llIIIIIII[49] = (-18721) & 20343;
        llIIIIIII[50] = (-((-197) & 9413)) & (-110) & 32767;
        llIIIIIII[51] = (-115) & 20474;
        llIIIIIII[52] = (-((-16903) & 29247)) & (-66) & 32767;
        llIIIIIII[53] = (-((-3185) & 7665)) & (-16401) & 32245;
        llIIIIIII[54] = (-20881) & 32244;
        llIIIIIII[55] = (-((-8969) & 30479)) & (-65) & 32735;
        llIIIIIII[56] = (-(202 ^ 139)) & (-21505) & 32511;
        llIIIIIII[57] = (-((-6147) & 15471)) & (-16385) & 28669;
        llIIIIIII[58] = (-4196) & 7423;
        llIIIIIII[59] = 186 ^ 166;
        llIIIIIII[60] = (40 ^ 45) ^ (174 ^ 176);
        llIIIIIII[61] = (-((-2833) & 16177)) & (-16449) & 32767;
        llIIIIIII[62] = (-4626) & 7867;
        llIIIIIII[63] = (43 ^ 119) ^ (37 ^ 119);
    }

    private static String lIlIIIIIllIl(String llIIIIIIIlllII, String llIIIIIIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIIIllIll.getBytes(StandardCharsets.UTF_8)), llIIIIIII[26]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIIIlllIl) {
            llIIIIIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIIlIll(String llIIIIIIIIllll, String llIIIIIIIIlllI) {
        try {
            SecretKeySpec llIIIIIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIIIlIIIl = Cipher.getInstance("Blowfish");
            llIIIIIIIlIIIl.init(llIIIIIII[2], llIIIIIIIlIIlI);
            return new String(llIIIIIIIlIIIl.doFinal(Base64.getDecoder().decode(llIIIIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIIIlIIII) {
            llIIIIIIIlIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0151, code lost:
        if (lIlIIIIlIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ak.llIIIIIII[1]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0190, code lost:
        if (lIlIIIIlIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ak.llIIIIIII[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cf, code lost:
        if (lIlIIIIlIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ak.llIIIIIII[1]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x020e, code lost:
        if (lIlIIIIlIllI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ak.llIIIIIII[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024d, code lost:
        if (lIlIIIIlIIlI(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ak.llIIIIIII[1]) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0250, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ak.lIlllllll[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ak.llIIIIIII[5]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ak.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ak.llIIIIIII[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v296, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v325, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void er() {
        if (lIlIIIIlIIIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[0]];
            C0001b.a(bv);
            if (lIlIIIIlIIlI(bv.size(), llIIIIIII[1])) {
                System.out.println(lIlllllll[llIIIIIII[1]]);
                bt = llIIIIIII[0];
            }
        }
        if (lIlIIIIlIIll(bt ? 1 : 0)) {
            if (lIlIIIIlIIll(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIIlIlII(nearest) && lIlIIIIlIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllllll[llIIIIIII[2]];
                    C0000a.a(nearest);
                }
                if (lIlIIIIlIlII(nearest) && lIlIIIIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllllll[llIIIIIII[3]];
                    if (lIlIIIIlIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIIIII[4]);
                        "".length();
                    }
                    if (lIlIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIIIlIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIIIII[5]);
                            "".length();
                        }
                        if (lIlIIIIlIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIIIII[2]);
                            "".length();
                        }
                        int[] iArr = new int[llIIIIIII[1]];
                        iArr[llIIIIIII[0]] = llIIIIIII[6];
                        if (lIlIIIIlIIll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIIIIII[1]];
                            iArr2[llIIIIIII[0]] = llIIIIIII[6];
                        }
                        int[] iArr3 = new int[llIIIIIII[1]];
                        iArr3[llIIIIIII[0]] = llIIIIIII[7];
                        if (lIlIIIIlIIll(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIIIIII[1]];
                            iArr4[llIIIIIII[0]] = llIIIIIII[7];
                        }
                        int[] iArr5 = new int[llIIIIIII[1]];
                        iArr5[llIIIIIII[0]] = llIIIIIII[8];
                        if (lIlIIIIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIIIIII[1]];
                            iArr6[llIIIIIII[0]] = llIIIIIII[8];
                        }
                        int[] iArr7 = new int[llIIIIIII[1]];
                        iArr7[llIIIIIII[0]] = llIIIIIII[9];
                        if (lIlIIIIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llIIIIIII[1]];
                            iArr8[llIIIIIII[0]] = llIIIIIII[9];
                        }
                        int[] iArr9 = new int[llIIIIIII[1]];
                        iArr9[llIIIIIII[0]] = llIIIIIII[10];
                        if (lIlIIIIlIIll(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[llIIIIIII[1]];
                            iArr10[llIIIIIII[0]] = llIIIIIII[10];
                        }
                        C0000a.a(llIIIIIII[11], llIIIIIII[1]);
                        C0000a.a(llIIIIIII[12], llIIIIIII[1]);
                        C0000a.a(llIIIIIII[13], llIIIIIII[1]);
                        C0000a.a(llIIIIIII[14], llIIIIIII[1]);
                        C0000a.a(llIIIIIII[15], llIIIIIII[1]);
                        C0000a.a(llIIIIIII[16], llIIIIIII[1]);
                        C0000a.a(llIIIIIII[17], llIIIIIII[1]);
                        int[] iArr11 = new int[llIIIIIII[1]];
                        iArr11[llIIIIIII[0]] = llIIIIIII[11];
                        if (lIlIIIIlIIll(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIIIIIII[1]];
                            iArr12[llIIIIIII[0]] = llIIIIIII[11];
                            if (lIlIIIIlIIll(Equipment.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIIIIIII[1]];
                                iArr13[llIIIIIII[0]] = llIIIIIII[11];
                                if (lIlIIIIlIIll(Bank.contains(iArr13) ? 1 : 0)) {
                                    C0000a.a(llIIIIIII[18], llIIIIIII[1]);
                                }
                            }
                        }
                        C0000a.a(llIIIIIII[19], llIIIIIII[1]);
                        C0004e.l(llIIIIIII[11]);
                        C0004e.l(llIIIIIII[12]);
                        C0004e.l(llIIIIIII[13]);
                        C0004e.l(llIIIIIII[14]);
                        C0004e.l(llIIIIIII[15]);
                        Time.sleepTicks(llIIIIIII[1]);
                        "".length();
                        C0004e.l(llIIIIIII[17]);
                        C0004e.l(llIIIIIII[20]);
                        C0004e.l(llIIIIIII[16]);
                        C0004e.l(llIIIIIII[18]);
                        C0004e.l(llIIIIIII[19]);
                        Time.sleepTicks(llIIIIIII[3]);
                        "".length();
                        if (lIlIIIIlIIll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIIIIIII[21]);
                            "".length();
                        }
                        if (lIlIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            int[] iArr14 = new int[llIIIIIII[1]];
                            iArr14[llIIIIIII[0]] = llIIIIIII[6];
                            if (lIlIIIIlIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIII[6], llIIIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[llIIIIIII[1]];
                                    iArr15[llIIIIIII[0]] = llIIIIIII[6];
                                    if (lIlIIIIlIlIl(Inventory.getCount(iArr15))) {
                                        ?? r0 = llIIIIIII[1];
                                        "".length();
                                        return (43 ^ 47) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIIIIII[0];
                                }, llIIIIIII[4]);
                                "".length();
                            }
                            int[] iArr15 = new int[llIIIIIII[1]];
                            iArr15[llIIIIIII[0]] = llIIIIIII[7];
                            if (lIlIIIIlIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIII[7], llIIIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr16 = new int[llIIIIIII[1]];
                                    iArr16[llIIIIIII[0]] = llIIIIIII[7];
                                    if (lIlIIIIlIlIl(Inventory.getCount(iArr16))) {
                                        ?? r0 = llIIIIIII[1];
                                        "".length();
                                        return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIIIIII[0];
                                }, llIIIIIII[4]);
                                "".length();
                            }
                            int[] iArr16 = new int[llIIIIIII[1]];
                            iArr16[llIIIIIII[0]] = llIIIIIII[8];
                            if (lIlIIIIlIIIl(Bank.contains(iArr16) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIII[8], llIIIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[llIIIIIII[1]];
                                    iArr17[llIIIIIII[0]] = llIIIIIII[8];
                                    if (lIlIIIIlIlIl(Inventory.getCount(iArr17))) {
                                        ?? r0 = llIIIIIII[1];
                                        "".length();
                                        return (67 ^ 71) < (" ".length() & (" ".length() ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIIIIII[0];
                                }, llIIIIIII[4]);
                                "".length();
                            }
                            int[] iArr17 = new int[llIIIIIII[1]];
                            iArr17[llIIIIIII[0]] = llIIIIIII[9];
                            if (lIlIIIIlIIIl(Bank.contains(iArr17) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIII[9], llIIIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr18 = new int[llIIIIIII[1]];
                                    iArr18[llIIIIIII[0]] = llIIIIIII[9];
                                    if (lIlIIIIlIlIl(Inventory.getCount(iArr18))) {
                                        ?? r0 = llIIIIIII[1];
                                        "".length();
                                        return "  ".length() == 0 ? ((83 ^ 14) ^ (11 ^ 124)) & (((((24 + 135) - 133) + 145) ^ (((119 + 31) - 108) + 87)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIIIIII[0];
                                }, llIIIIIII[4]);
                                "".length();
                            }
                            int[] iArr18 = new int[llIIIIIII[1]];
                            iArr18[llIIIIIII[0]] = llIIIIIII[10];
                            if (lIlIIIIlIIIl(Bank.contains(iArr18) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIII[10], llIIIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr19 = new int[llIIIIIII[1]];
                                    iArr19[llIIIIIII[0]] = llIIIIIII[10];
                                    if (lIlIIIIlIlIl(Inventory.getCount(iArr19))) {
                                        ?? r0 = llIIIIIII[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIIIIII[0];
                                }, llIIIIIII[4]);
                                "".length();
                            }
                            int[] iArr19 = new int[llIIIIIII[1]];
                            iArr19[llIIIIIII[0]] = llIIIIIII[17];
                            if (lIlIIIIlIIIl(Bank.contains(iArr19) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIII[17], llIIIIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr20 = new int[llIIIIIII[1]];
                                    iArr20[llIIIIIII[0]] = llIIIIIII[17];
                                    if (lIlIIIIlIlIl(Inventory.getCount(iArr20))) {
                                        ?? r0 = llIIIIIII[1];
                                        "".length();
                                        return "   ".length() < " ".length() ? ((186 ^ 145) ^ (45 ^ 67)) & (((183 ^ 166) ^ (89 ^ 13)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIIIIII[0];
                                }, llIIIIIII[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlIIIIlIIIl(ab() ? 1 : 0)) {
                if (lIlIIIIlIIll(Movement.isRunEnabled() ? 1 : 0) && lIlIIIIlIlll(Movement.getRunEnergy(), llIIIIIII[22])) {
                    Movement.toggleRun();
                    Time.sleepTicks(llIIIIIII[23]);
                    "".length();
                }
                if (lIlIIIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllllll[llIIIIIII[23]];
                    Inventory.getAll(mm).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lIlIIIIlIIll(Inventory.isFull() ? 1 : 0)) {
                    if (lIlIIIIlIIlI(Skills.getLevel(Skill.MINING), llIIIIIII[24])) {
                        if (lIlIIIIlIIll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[21]];
                            Movement.walkTo(G);
                            "".length();
                            Time.sleepTicks(llIIIIIII[5]);
                            "".length();
                        }
                        if (lIlIIIIlIIIl(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[25]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), mo);
                            if (lIlIIIIlIIll(Players.getLocal().isAnimating() ? 1 : 0) && lIlIIIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && lIlIIIIlIlII(nearest2)) {
                                nearest2.interact(lIlllllll[llIIIIIII[26]]);
                                Time.sleepTicks(llIIIIIII[2]);
                                "".length();
                            }
                        }
                    }
                    if (lIlIIIIlIllI(Skills.getLevel(Skill.MINING), llIIIIIII[24])) {
                        if (lIlIIIIlIIll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[27]];
                            Movement.walkTo(G);
                            "".length();
                            Time.sleepTicks(llIIIIIII[5]);
                            "".length();
                        }
                        if (lIlIIIIlIIIl(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[28]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), mn);
                            if (lIlIIIIlIIll(Players.getLocal().isAnimating() ? 1 : 0) && lIlIIIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && lIlIIIIlIlII(nearest3)) {
                                nearest3.interact(lIlllllll[llIIIIIII[29]]);
                                Time.sleepTicks(llIIIIIII[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }
}
