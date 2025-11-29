package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ar  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/ar.class */
public class ar implements ab {
    public static final /* synthetic */ int mJ;
    public static final /* synthetic */ WorldArea mM;
    public static final /* synthetic */ WorldArea mN;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ int[] lllIIllIl;
    public static /* synthetic */ int[] mP;
    public static final /* synthetic */ WorldPoint mO;
    public static final /* synthetic */ int mK;
    public static final /* synthetic */ int mI;
    public static final /* synthetic */ int mH;
    public static /* synthetic */ int[] mQ;
    private static /* synthetic */ String[] lllIIllII;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ int[] my;
    public static final /* synthetic */ int mL;

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        eP();
        return lllIIllIl[33];
    }

    private static boolean llIIIIllllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[35])) {
            ?? r0 = lllIIllIl[1];
            "".length();
            return " ".length() >= "  ".length() ? ((149 ^ 141) ^ (44 ^ 32)) & (((21 ^ 77) ^ (127 ^ 51)) ^ (-" ".length())) : r0;
        }
        return lllIIllIl[0];
    }

    static {
        llIIIIllllII();
        llIIIIlllIll();
        mL = lllIIllIl[11];
        mK = lllIIllIl[10];
        mJ = lllIIllIl[9];
        mH = lllIIllIl[7];
        mI = lllIIllIl[8];
        mM = new WorldArea(lllIIllIl[37], lllIIllIl[38], lllIIllIl[34], lllIIllIl[39], lllIIllIl[0]);
        mN = new WorldArea(lllIIllIl[40], lllIIllIl[41], lllIIllIl[22], lllIIllIl[34], lllIIllIl[0]);
        mO = new WorldPoint(lllIIllIl[42], lllIIllIl[43], lllIIllIl[0]);
        int[] iArr = new int[lllIIllIl[6]];
        iArr[lllIIllIl[0]] = lllIIllIl[44];
        iArr[lllIIllIl[1]] = lllIIllIl[45];
        iArr[lllIIllIl[3]] = lllIIllIl[46];
        iArr[lllIIllIl[4]] = lllIIllIl[47];
        mP = iArr;
        int[] iArr2 = new int[lllIIllIl[1]];
        iArr2[lllIIllIl[0]] = lllIIllIl[48];
        mQ = iArr2;
        int[] iArr3 = new int[lllIIllIl[4]];
        iArr3[lllIIllIl[0]] = lllIIllIl[49];
        iArr3[lllIIllIl[1]] = lllIIllIl[50];
        iArr3[lllIIllIl[3]] = lllIIllIl[51];
        my = iArr3;
        bx = new ArrayList();
    }

    private static boolean llIIIlIIIIII(int i) {
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
    public static boolean an() {
        if (llIIIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[23])) {
            int[] iArr = new int[lllIIllIl[1]];
            iArr[lllIIllIl[0]] = lllIIllIl[11];
            if (llIIIlIIIIII(Inventory.getCount(iArr))) {
                ?? r0 = lllIIllIl[1];
                "".length();
                return " ".length() != " ".length() ? ((147 ^ 171) ^ (62 ^ 101)) & (((((121 + 124) - 36) + 39) ^ (((142 + 45) - 143) + 111)) ^ (-" ".length())) : r0;
            }
            return lllIIllIl[0];
        } else if (llIIIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[24]) && llIIIIlllllI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[23])) {
            int[] iArr2 = new int[lllIIllIl[1]];
            iArr2[lllIIllIl[0]] = lllIIllIl[11];
            if (llIIIlIIIIII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lllIIllIl[1]];
                iArr3[lllIIllIl[0]] = lllIIllIl[10];
                if (llIIIlIIIIII(Inventory.getCount(iArr3))) {
                    ?? r02 = lllIIllIl[1];
                    "".length();
                    return " ".length() == ((((64 + 74) - 124) + 131) ^ (((17 + 37) - (-30)) + 65)) ? ((153 ^ 141) ^ (203 ^ 140)) & (((14 ^ 111) ^ (129 ^ 179)) ^ (-" ".length())) : r02;
                }
            }
            return lllIIllIl[0];
        } else if (llIIIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[25]) && llIIIIlllllI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[24])) {
            int[] iArr4 = new int[lllIIllIl[1]];
            iArr4[lllIIllIl[0]] = lllIIllIl[11];
            if (llIIIlIIIIII(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[lllIIllIl[1]];
                iArr5[lllIIllIl[0]] = lllIIllIl[10];
                if (llIIIlIIIIII(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[lllIIllIl[1]];
                    iArr6[lllIIllIl[0]] = lllIIllIl[9];
                    if (llIIIlIIIIII(Inventory.getCount(iArr6))) {
                        ?? r03 = lllIIllIl[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                    }
                }
            }
            return lllIIllIl[0];
        } else if (llIIIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[13]) && llIIIIlllllI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[25])) {
            int[] iArr7 = new int[lllIIllIl[1]];
            iArr7[lllIIllIl[0]] = lllIIllIl[11];
            if (llIIIlIIIIII(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[lllIIllIl[1]];
                iArr8[lllIIllIl[0]] = lllIIllIl[10];
                if (llIIIlIIIIII(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[lllIIllIl[1]];
                    iArr9[lllIIllIl[0]] = lllIIllIl[9];
                    if (llIIIlIIIIII(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[lllIIllIl[1]];
                        iArr10[lllIIllIl[0]] = lllIIllIl[8];
                        if (llIIIlIIIIII(Inventory.getCount(iArr10))) {
                            ?? r04 = lllIIllIl[1];
                            "".length();
                            return " ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r04;
                        }
                    }
                }
            }
            return lllIIllIl[0];
        } else {
            int[] iArr11 = new int[lllIIllIl[1]];
            iArr11[lllIIllIl[0]] = lllIIllIl[11];
            if (llIIIlIIIIII(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[lllIIllIl[1]];
                iArr12[lllIIllIl[0]] = lllIIllIl[10];
                if (llIIIlIIIIII(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[lllIIllIl[1]];
                    iArr13[lllIIllIl[0]] = lllIIllIl[9];
                    if (llIIIlIIIIII(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[lllIIllIl[1]];
                        iArr14[lllIIllIl[0]] = lllIIllIl[8];
                        if (llIIIlIIIIII(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[lllIIllIl[1]];
                            iArr15[lllIIllIl[0]] = lllIIllIl[7];
                            if (llIIIlIIIIII(Inventory.getCount(iArr15))) {
                                ?? r05 = lllIIllIl[1];
                                "".length();
                                return (195 ^ 198) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r05;
                            }
                        }
                    }
                }
            }
            return lllIIllIl[0];
        }
    }

    private static boolean llIIIIllllll(int i) {
        return i == 0;
    }

    private static String llIIIIlllIII(String lllIllIIllIIl, String lllIllIIllIII) {
        String str = new String(Base64.getDecoder().decode(lllIllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIllIIlIlll = new StringBuilder();
        char[] lllIllIIlIllI = lllIllIIllIII.toCharArray();
        int lllIllIIlIlIl = lllIIllIl[0];
        char[] charArray = str.toCharArray();
        int lllIllIIIlllI = charArray.length;
        int i = lllIIllIl[0];
        while (llIIIIlllllI(i, lllIllIIIlllI)) {
            lllIllIIlIlll.append((char) (charArray[i] ^ lllIllIIlIllI[lllIllIIlIlIl % lllIllIIlIllI.length]));
            "".length();
            lllIllIIlIlIl++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllIllIIlIlll);
    }

    private static String llIIIIlllIlI(String lllIllIIIIlII, String lllIllIIIIIll) {
        try {
            SecretKeySpec lllIllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIIIIIll.getBytes(StandardCharsets.UTF_8)), lllIIllIl[16]), "DES");
            Cipher lllIllIIIIllI = Cipher.getInstance("DES");
            lllIllIIIIllI.init(lllIIllIl[3], lllIllIIIIlll);
            return new String(lllIllIIIIllI.doFinal(Base64.getDecoder().decode(lllIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIIIIlIl) {
            lllIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    public static void Q() {
        int[] iArr = new int[lllIIllIl[1]];
        iArr[lllIIllIl[0]] = lllIIllIl[7];
        if (llIIIIllllll(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lllIIllIl[7], lllIIllIl[1], lllIIllIl[5]));
            "".length();
        }
        int[] iArr2 = new int[lllIIllIl[1]];
        iArr2[lllIIllIl[0]] = lllIIllIl[8];
        if (llIIIIllllll(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lllIIllIl[8], lllIIllIl[1], lllIIllIl[5]));
            "".length();
        }
        int[] iArr3 = new int[lllIIllIl[1]];
        iArr3[lllIIllIl[0]] = lllIIllIl[9];
        if (llIIIIllllll(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lllIIllIl[9], lllIIllIl[1], lllIIllIl[26]));
            "".length();
        }
        int[] iArr4 = new int[lllIIllIl[1]];
        iArr4[lllIIllIl[0]] = lllIIllIl[10];
        if (llIIIIllllll(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lllIIllIl[10], lllIIllIl[1], lllIIllIl[27]));
            "".length();
        }
        int[] iArr5 = new int[lllIIllIl[1]];
        iArr5[lllIIllIl[0]] = lllIIllIl[11];
        if (llIIIIllllll(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lllIIllIl[11], lllIIllIl[1], lllIIllIl[28]));
            "".length();
        }
        if (llIIIIllllll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIllII[lllIIllIl[36]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lllIIllIl[29], lllIIllIl[12], lllIIllIl[28]));
            "".length();
        }
        int[] iArr6 = new int[lllIIllIl[1]];
        iArr6[lllIIllIl[0]] = lllIIllIl[30];
        if (llIIIIllllll(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(lllIIllIl[30], lllIIllIl[31], lllIIllIl[32]));
            "".length();
        }
    }

    private static void llIIIIlllIll() {
        lllIIllII = new String[lllIIllIl[52]];
        lllIIllII[lllIIllIl[0]] = llIIIIlllIII("JDI7OSYBZyskLQs0", "fGBPH");
        lllIIllII[lllIIllIl[1]] = llIIIIlllIII("BRkWKzsrFRxiKjYJESwvYxkMJyUwXFgxPyoEGyohLRdYICkgG1g2J2MHFy0sIAUMNiEtFw==", "CpxBH");
        lllIIllII[lllIIllIl[3]] = llIIIIlllIIl("8a7jpN3+WHrBzpeO08gzTfHA5tNiwsdS", "IXGvf");
        lllIIllII[lllIIllIl[4]] = llIIIIlllIIl("Ut9t+VV1nCQa7hzuO/8HOw==", "SOcsB");
        lllIIllII[lllIIllIl[6]] = llIIIIlllIIl("Gn85XzJ/aCsGhaLpi9RfJ6BzDoADUkVb", "LAAqs");
        lllIIllII[lllIIllIl[12]] = llIIIIlllIII("HyJ4EwEtZzUbADsuNhVTOC47GRIwIiteUzswMQYQIC42FVM8KHgwJhEOFjU=", "HGXrs");
        lllIIllII[lllIIllIl[13]] = llIIIIlllIIl("o8lfoTLRoD3ogaeqkeFFdA==", "RtoQO");
        lllIIllII[lllIIllIl[14]] = llIIIIlllIII("Ejs1Ggg/Jz1KFDkuKQ==", "VIZjx");
        lllIIllII[lllIIllIl[16]] = llIIIIlllIlI("E5Mavd1nsgPIxhxqGf5VrmYqXRaQzNB0", "FeDda");
        lllIIllII[lllIIllIl[17]] = llIIIIlllIlI("E9T+XC6cqJVpg9cg0Bu/NA==", "ybhRP");
        lllIIllII[lllIIllIl[18]] = llIIIIlllIIl("KRul6JGQlibdwuDcMtviZQ==", "MubTL");
        lllIIllII[lllIIllIl[19]] = llIIIIlllIlI("bM5tld6pKUkBWzFtkGtdFg==", "vRiyh");
        lllIIllII[lllIIllIl[20]] = llIIIIlllIIl("XLxoH+wMcPZqw/AwBHt+r+Q9exj7xb8V", "iLodU");
        lllIIllII[lllIIllIl[21]] = llIIIIlllIIl("kZ5yPVw4AG8BpGGyA268jw==", "uBQkb");
        lllIIllII[lllIIllIl[22]] = llIIIIlllIII("DTwhEgYnOilCGS8/bg4ZKSc=", "NTNbv");
        lllIIllII[lllIIllIl[15]] = llIIIIlllIlI("gE9dH7EiRtB17RbzKI6OsQ==", "EdOqf");
        lllIIllII[lllIIllIl[34]] = llIIIIlllIlI("tIgILuXoK/0GPrjC04Pjpw==", "JpvoW");
        lllIIllII[lllIIllIl[36]] = llIIIIlllIII("Cwc0CkQWCHoaARgCLgVEUQ==", "ynZmd");
    }

    private static void llIIIIllllII() {
        lllIIllIl = new int[53];
        lllIIllIl[0] = (69 ^ 15) & ((247 ^ 189) ^ (-1));
        lllIIllIl[1] = " ".length();
        lllIIllIl[2] = (-((-24565) & 32765)) & (-21521) & 30715;
        lllIIllIl[3] = "  ".length();
        lllIIllIl[4] = "   ".length();
        lllIIllIl[5] = (-((-8333) & 27902)) & (-3) & 24571;
        lllIIllIl[6] = (85 ^ 61) ^ (113 ^ 29);
        lllIIllIl[7] = (-((-2599) & 27327)) & (-4641) & 30719;
        lllIIllIl[8] = (-((-11109) & 15335)) & (-16417) & 21995;
        lllIIllIl[9] = (-8753) & 10107;
        lllIIllIl[10] = (-((-5185) & 24289)) & (-1) & 20461;
        lllIIllIl[11] = (-((-13313) & 30225)) & (-2081) & 20351;
        lllIIllIl[12] = (((16 + 43) - 33) + 152) ^ (((30 + 87) - (-28)) + 38);
        lllIIllIl[13] = (124 ^ 96) ^ (81 ^ 75);
        lllIIllIl[14] = (((31 + 137) - 36) + 28) ^ (((161 + 159) - 186) + 33);
        lllIIllIl[15] = 26 ^ 21;
        lllIIllIl[16] = 35 ^ 43;
        lllIIllIl[17] = (((86 + 16) - 46) + 122) ^ (((20 + 35) - (-53)) + 79);
        lllIIllIl[18] = (104 ^ 34) ^ (84 ^ 20);
        lllIIllIl[19] = 179 ^ 184;
        lllIIllIl[20] = (99 ^ 15) ^ (16 ^ 112);
        lllIIllIl[21] = (((140 + 13) - 37) + 30) ^ (((98 + 101) - 82) + 42);
        lllIIllIl[22] = 100 ^ 106;
        lllIIllIl[23] = 137 ^ 160;
        lllIIllIl[24] = (7 ^ 46) ^ (86 ^ 96);
        lllIIllIl[25] = (((151 + 170) - 265) + 133) ^ (((45 + 162) - 127) + 88);
        lllIIllIl[26] = (-((-9157) & 12247)) & (-198) & 12287;
        lllIIllIl[27] = (-((-578) & 4943)) & (-1) & 16365;
        lllIIllIl[28] = (-6744) & 31743;
        lllIIllIl[29] = (-4403) & 16382;
        lllIIllIl[30] = (-153) & 8159;
        lllIIllIl[31] = (107 ^ 111) ^ (238 ^ 194);
        lllIIllIl[32] = (-6268) & 7167;
        lllIIllIl[33] = (47 ^ 77) ^ (58 ^ 60);
        lllIIllIl[34] = (220 ^ 185) ^ (119 ^ 2);
        lllIIllIl[35] = (88 ^ 51) ^ (180 ^ 188);
        lllIIllIl[36] = (146 ^ 186) ^ (53 ^ 12);
        lllIIllIl[37] = (-8585) & 11741;
        lllIIllIl[38] = (-((-26375) & 30615)) & (-25089) & 32702;
        lllIIllIl[39] = 184 ^ 149;
        lllIIllIl[40] = (-((-18434) & 26755)) & (-20481) & 31999;
        lllIIllIl[41] = (-25221) & 28581;
        lllIIllIl[42] = (-((-17253) & 29543)) & (-16497) & 31990;
        lllIIllIl[43] = (-((-6657) & 31377)) & (-4611) & 32695;
        lllIIllIl[44] = (-21250) & 22525;
        lllIIllIl[45] = (-17154) & 18431;
        lllIIllIl[46] = (-(2 ^ 12)) & (-753) & 2047;
        lllIIllIl[47] = (-22626) & 23911;
        lllIIllIl[48] = (-17804) & 28623;
        lllIIllIl[49] = (-16913) & 18423;
        lllIIllIl[50] = (-((-7617) & 24015)) & (-12801) & 30719;
        lllIIllIl[51] = (-4609) & 6127;
        lllIIllIl[52] = (228 ^ 150) ^ (36 ^ 68);
    }

    private static boolean llIIIlIIIIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIIllIl[0];
    }

    private static boolean llIIIIlllllI(int i, int i2) {
        return i < i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIIllII[lllIIllIl[34]];
    }

    private static boolean llIIIlIIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static String llIIIIlllIIl(String lllIlIlllIlll, String lllIlIlllIlII) {
        try {
            SecretKeySpec lllIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIllIl[3], lllIlIllllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIllllIII) {
            lllIlIllllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (llIIIlIIIIII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
        if (llIIIlIIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ar.lllIIllIl[1]) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ba, code lost:
        if (llIIIlIIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ar.lllIIllIl[1]) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f9, code lost:
        if (llIIIlIIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ar.lllIIllIl[1]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
        if (llIIIlIIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ar.lllIIllIl[1]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0277, code lost:
        if (llIIIIlllllI(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ar.lllIIllIl[1]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027a, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ar.lllIIllII[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ar.lllIIllIl[12]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ar.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ar.lllIIllIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0295, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v251, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void eP() {
        if (llIIIIllllIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIIllII[lllIIllIl[0]];
            C0001b.a(bx);
            if (llIIIIlllllI(bx.size(), lllIIllIl[1])) {
                System.out.println(lllIIllII[lllIIllIl[1]]);
                bv = lllIIllIl[0];
            }
        }
        if (llIIIIllllll(bv ? 1 : 0)) {
            if (llIIIIllllIl(an() ? 1 : 0)) {
                int[] iArr = new int[lllIIllIl[1]];
                iArr[lllIIllIl[0]] = lllIIllIl[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (llIIIlIIIIIl(nearest) && llIIIIllllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIllII[lllIIllIl[3]];
                C0000a.a(nearest);
            }
            if (llIIIlIIIIIl(nearest) && llIIIIllllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (llIIIIllllll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIllII[lllIIllIl[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lllIIllIl[5]);
                    "".length();
                }
                if (llIIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIllII[lllIIllIl[6]];
                    if (llIIIlIIIIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lllIIllIl[6]);
                        "".length();
                    }
                    if (llIIIlIIIIII(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lllIIllIl[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lllIIllIl[1]];
                    iArr2[lllIIllIl[0]] = lllIIllIl[7];
                    if (llIIIIllllll(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lllIIllIl[1]];
                        iArr3[lllIIllIl[0]] = lllIIllIl[7];
                    }
                    int[] iArr4 = new int[lllIIllIl[1]];
                    iArr4[lllIIllIl[0]] = lllIIllIl[8];
                    if (llIIIIllllll(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lllIIllIl[1]];
                        iArr5[lllIIllIl[0]] = lllIIllIl[8];
                    }
                    int[] iArr6 = new int[lllIIllIl[1]];
                    iArr6[lllIIllIl[0]] = lllIIllIl[9];
                    if (llIIIIllllll(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllIIllIl[1]];
                        iArr7[lllIIllIl[0]] = lllIIllIl[9];
                    }
                    int[] iArr8 = new int[lllIIllIl[1]];
                    iArr8[lllIIllIl[0]] = lllIIllIl[10];
                    if (llIIIIllllll(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lllIIllIl[1]];
                        iArr9[lllIIllIl[0]] = lllIIllIl[10];
                    }
                    int[] iArr10 = new int[lllIIllIl[1]];
                    iArr10[lllIIllIl[0]] = lllIIllIl[11];
                    if (llIIIIllllll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIIllIl[1]];
                        iArr11[lllIIllIl[0]] = lllIIllIl[11];
                    }
                    int[] iArr12 = new int[lllIIllIl[1]];
                    iArr12[lllIIllIl[0]] = lllIIllIl[7];
                    if (llIIIIllllIl(Bank.contains(iArr12) ? 1 : 0)) {
                        Bank.withdraw(lllIIllIl[7], lllIIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr13 = new int[lllIIllIl[1]];
                            iArr13[lllIIllIl[0]] = lllIIllIl[7];
                            if (llIIIlIIIIII(Inventory.getCount(iArr13))) {
                                ?? r0 = lllIIllIl[1];
                                "".length();
                                return "   ".length() == "  ".length() ? ((((15 + 23) - (-61)) + 128) ^ (((68 + 79) - 120) + 151)) & (((134 ^ 187) ^ (96 ^ 12)) ^ (-" ".length())) : r0;
                            }
                            return lllIIllIl[0];
                        }, lllIIllIl[5]);
                        "".length();
                    }
                    int[] iArr13 = new int[lllIIllIl[1]];
                    iArr13[lllIIllIl[0]] = lllIIllIl[8];
                    if (llIIIIllllIl(Bank.contains(iArr13) ? 1 : 0)) {
                        Bank.withdraw(lllIIllIl[8], lllIIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lllIIllIl[1]];
                            iArr14[lllIIllIl[0]] = lllIIllIl[8];
                            if (llIIIlIIIIII(Inventory.getCount(iArr14))) {
                                ?? r0 = lllIIllIl[1];
                                "".length();
                                return "  ".length() == (-" ".length()) ? ((111 ^ 74) ^ (249 ^ 130)) & (((((71 + 13) - (-48)) + 79) ^ (((111 + 5) - 36) + 61)) ^ (-" ".length())) : r0;
                            }
                            return lllIIllIl[0];
                        }, lllIIllIl[5]);
                        "".length();
                    }
                    int[] iArr14 = new int[lllIIllIl[1]];
                    iArr14[lllIIllIl[0]] = lllIIllIl[9];
                    if (llIIIIllllIl(Bank.contains(iArr14) ? 1 : 0)) {
                        Bank.withdraw(lllIIllIl[9], lllIIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[lllIIllIl[1]];
                            iArr15[lllIIllIl[0]] = lllIIllIl[9];
                            if (llIIIlIIIIII(Inventory.getCount(iArr15))) {
                                ?? r0 = lllIIllIl[1];
                                "".length();
                                return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIllIl[0];
                        }, lllIIllIl[5]);
                        "".length();
                    }
                    int[] iArr15 = new int[lllIIllIl[1]];
                    iArr15[lllIIllIl[0]] = lllIIllIl[10];
                    if (llIIIIllllIl(Bank.contains(iArr15) ? 1 : 0)) {
                        Bank.withdraw(lllIIllIl[10], lllIIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lllIIllIl[1]];
                            iArr16[lllIIllIl[0]] = lllIIllIl[10];
                            if (llIIIlIIIIII(Inventory.getCount(iArr16))) {
                                ?? r0 = lllIIllIl[1];
                                "".length();
                                return (((45 ^ 111) ^ (57 ^ 47)) & (((125 ^ 106) ^ (87 ^ 20)) ^ (-" ".length()))) != 0 ? ((124 ^ 25) ^ (102 ^ 56)) & (((239 ^ 173) ^ (31 ^ 102)) ^ (-" ".length())) : r0;
                            }
                            return lllIIllIl[0];
                        }, lllIIllIl[5]);
                        "".length();
                    }
                    int[] iArr16 = new int[lllIIllIl[1]];
                    iArr16[lllIIllIl[0]] = lllIIllIl[11];
                    if (llIIIIllllIl(Bank.contains(iArr16) ? 1 : 0)) {
                        Bank.withdraw(lllIIllIl[11], lllIIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr17 = new int[lllIIllIl[1]];
                            iArr17[lllIIllIl[0]] = lllIIllIl[11];
                            if (llIIIlIIIIII(Inventory.getCount(iArr17))) {
                                ?? r0 = lllIIllIl[1];
                                "".length();
                                return (((12 ^ 59) ^ "  ".length()) & (((48 ^ 77) ^ (202 ^ 130)) ^ (-" ".length()))) != 0 ? ((((162 + 8) - 32) + 110) ^ (((4 + 168) - 48) + 64)) & (((243 ^ 177) ^ (101 ^ 99)) ^ (-" ".length())) : r0;
                            }
                            return lllIIllIl[0];
                        }, lllIIllIl[5]);
                        "".length();
                    }
                }
            }
            if (llIIIIllllIl(an() ? 1 : 0)) {
                if (llIIIIllllIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIllII[lllIIllIl[13]];
                    System.out.println(lllIIllII[lllIIllIl[14]]);
                    Inventory.getAll(my).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (llIIIIllllll(Inventory.isFull() ? 1 : 0)) {
                    if (llIIIIlllllI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[15])) {
                        if (llIIIIllllll(mM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[16]];
                            Movement.walkTo(mM.toWorldPoint());
                            "".length();
                            Time.sleepTicks(lllIIllIl[6]);
                            "".length();
                        }
                        if (llIIIIllllIl(mM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[17]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), mP);
                            if (llIIIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && llIIIIllllll(Players.getLocal().isMoving() ? 1 : 0) && llIIIlIIIIIl(nearest2)) {
                                System.out.println(lllIIllII[lllIIllIl[18]]);
                                nearest2.interact(lllIIllII[lllIIllIl[19]]);
                                Time.sleepTicks(lllIIllIl[4]);
                                "".length();
                            }
                        }
                    }
                    if (llIIIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIIllIl[15])) {
                        if (llIIIIllllll(mN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[20]];
                            Movement.walkTo(mO);
                            "".length();
                            Time.sleepTicks(lllIIllIl[6]);
                            "".length();
                        }
                        if (llIIIIllllIl(mN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[21]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), mQ);
                            if (llIIIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && llIIIIllllll(Players.getLocal().isMoving() ? 1 : 0) && llIIIlIIIIIl(nearest3)) {
                                System.out.println(lllIIllII[lllIIllIl[22]]);
                                nearest3.interact(lllIIllII[lllIIllIl[15]]);
                                Time.sleepTicks(lllIIllIl[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }
}
