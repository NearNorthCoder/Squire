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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.am  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/am.class */
public class am implements W {
    public static final /* synthetic */ int mA;
    public static final /* synthetic */ WorldArea mD;
    public static /* synthetic */ int[] mf;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ int my;
    public static final /* synthetic */ int mx;
    public static final /* synthetic */ int mB;
    public static /* synthetic */ int[] mG;
    public static /* synthetic */ int[] mF;
    public static final /* synthetic */ WorldArea mC;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint mE;
    private static /* synthetic */ int[] lIIIIlllI;
    public static final /* synthetic */ int mz;
    private static /* synthetic */ String[] lIIIIllIl;

    public static void af() {
        int[] iArr = new int[lIIIIlllI[1]];
        iArr[lIIIIlllI[0]] = lIIIIlllI[7];
        if (lllIIIIIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllI[7], lIIIIlllI[1], lIIIIlllI[5]));
            "".length();
        }
        int[] iArr2 = new int[lIIIIlllI[1]];
        iArr2[lIIIIlllI[0]] = lIIIIlllI[8];
        if (lllIIIIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllI[8], lIIIIlllI[1], lIIIIlllI[5]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIlllI[1]];
        iArr3[lIIIIlllI[0]] = lIIIIlllI[9];
        if (lllIIIIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllI[9], lIIIIlllI[1], lIIIIlllI[26]));
            "".length();
        }
        int[] iArr4 = new int[lIIIIlllI[1]];
        iArr4[lIIIIlllI[0]] = lIIIIlllI[10];
        if (lllIIIIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllI[10], lIIIIlllI[1], lIIIIlllI[27]));
            "".length();
        }
        int[] iArr5 = new int[lIIIIlllI[1]];
        iArr5[lIIIIlllI[0]] = lIIIIlllI[11];
        if (lllIIIIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllI[11], lIIIIlllI[1], lIIIIlllI[28]));
            "".length();
        }
        if (lllIIIIIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIllIl[lIIIIlllI[36]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllI[29], lIIIIlllI[12], lIIIIlllI[28]));
            "".length();
        }
        int[] iArr6 = new int[lIIIIlllI[1]];
        iArr6[lIIIIlllI[0]] = lIIIIlllI[30];
        if (lllIIIIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllI[30], lIIIIlllI[31], lIIIIlllI[32]));
            "".length();
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIIIllIl[lIIIIlllI[34]];
    }

    private static boolean lllIIIIIIll(int i) {
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
        if (lllIIIIIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[23])) {
            int[] iArr = new int[lIIIIlllI[1]];
            iArr[lIIIIlllI[0]] = lIIIIlllI[11];
            if (lllIIIIIIll(Inventory.getCount(iArr))) {
                ?? r0 = lIIIIlllI[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIIlllI[0];
        } else if (lllIIIIIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[24]) && lllIIIIIIIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[23])) {
            int[] iArr2 = new int[lIIIIlllI[1]];
            iArr2[lIIIIlllI[0]] = lIIIIlllI[11];
            if (lllIIIIIIll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIIIlllI[1]];
                iArr3[lIIIIlllI[0]] = lIIIIlllI[10];
                if (lllIIIIIIll(Inventory.getCount(iArr3))) {
                    ?? r02 = lIIIIlllI[1];
                    "".length();
                    return "   ".length() >= (5 ^ 1) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return lIIIIlllI[0];
        } else if (lllIIIIIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[25]) && lllIIIIIIIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[24])) {
            int[] iArr4 = new int[lIIIIlllI[1]];
            iArr4[lIIIIlllI[0]] = lIIIIlllI[11];
            if (lllIIIIIIll(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[lIIIIlllI[1]];
                iArr5[lIIIIlllI[0]] = lIIIIlllI[10];
                if (lllIIIIIIll(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[lIIIIlllI[1]];
                    iArr6[lIIIIlllI[0]] = lIIIIlllI[9];
                    if (lllIIIIIIll(Inventory.getCount(iArr6))) {
                        ?? r03 = lIIIIlllI[1];
                        "".length();
                        return "   ".length() < 0 ? ((66 ^ 109) ^ (107 ^ 80)) & (((26 ^ 12) ^ "  ".length()) ^ (-" ".length())) : r03;
                    }
                }
            }
            return lIIIIlllI[0];
        } else if (lllIIIIIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[13]) && lllIIIIIIIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[25])) {
            int[] iArr7 = new int[lIIIIlllI[1]];
            iArr7[lIIIIlllI[0]] = lIIIIlllI[11];
            if (lllIIIIIIll(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[lIIIIlllI[1]];
                iArr8[lIIIIlllI[0]] = lIIIIlllI[10];
                if (lllIIIIIIll(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[lIIIIlllI[1]];
                    iArr9[lIIIIlllI[0]] = lIIIIlllI[9];
                    if (lllIIIIIIll(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[lIIIIlllI[1]];
                        iArr10[lIIIIlllI[0]] = lIIIIlllI[8];
                        if (lllIIIIIIll(Inventory.getCount(iArr10))) {
                            ?? r04 = lIIIIlllI[1];
                            "".length();
                            return "   ".length() <= " ".length() ? ((((6 + 23) - 28) + 169) ^ (((51 + 49) - (-20)) + 13)) & (((246 ^ 167) ^ (42 ^ 84)) ^ (-" ".length())) : r04;
                        }
                    }
                }
            }
            return lIIIIlllI[0];
        } else {
            int[] iArr11 = new int[lIIIIlllI[1]];
            iArr11[lIIIIlllI[0]] = lIIIIlllI[11];
            if (lllIIIIIIll(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[lIIIIlllI[1]];
                iArr12[lIIIIlllI[0]] = lIIIIlllI[10];
                if (lllIIIIIIll(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[lIIIIlllI[1]];
                    iArr13[lIIIIlllI[0]] = lIIIIlllI[9];
                    if (lllIIIIIIll(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[lIIIIlllI[1]];
                        iArr14[lIIIIlllI[0]] = lIIIIlllI[8];
                        if (lllIIIIIIll(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[lIIIIlllI[1]];
                            iArr15[lIIIIlllI[0]] = lIIIIlllI[7];
                            if (lllIIIIIIll(Inventory.getCount(iArr15))) {
                                ?? r05 = lIIIIlllI[1];
                                "".length();
                                return (-(92 ^ 88)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r05;
                            }
                        }
                    }
                }
            }
            return lIIIIlllI[0];
        }
    }

    private static void llIllllllll() {
        lIIIIlllI = new int[53];
        lIIIIlllI[0] = (120 ^ 27) & ((83 ^ 48) ^ (-1));
        lIIIIlllI[1] = " ".length();
        lIIIIlllI[2] = (-28701) & 29695;
        lIIIIlllI[3] = "  ".length();
        lIIIIlllI[4] = "   ".length();
        lIIIIlllI[5] = (-3110) & 8109;
        lIIIIlllI[6] = (229 ^ 156) ^ (85 ^ 40);
        lIIIIlllI[7] = (-((-21569) & 24177)) & (-12425) & 16383;
        lIIIIlllI[8] = (-((-3137) & 23781)) & (-8211) & 30207;
        lIIIIlllI[9] = (-5) & 1359;
        lIIIIlllI[10] = (-14883) & 16239;
        lIIIIlllI[11] = (-((-6215) & 14423)) & (-6689) & 16255;
        lIIIIlllI[12] = 8 ^ 13;
        lIIIIlllI[13] = (45 ^ 112) ^ (55 ^ 108);
        lIIIIlllI[14] = 106 ^ 109;
        lIIIIlllI[15] = (209 ^ 142) ^ (83 ^ 3);
        lIIIIlllI[16] = (((38 + 59) - 75) + 152) ^ (((62 + 125) - 96) + 75);
        lIIIIlllI[17] = 113 ^ 120;
        lIIIIlllI[18] = 104 ^ 98;
        lIIIIlllI[19] = (((80 + 12) - 16) + 61) ^ (((85 + 1) - 56) + 100);
        lIIIIlllI[20] = 123 ^ 119;
        lIIIIlllI[21] = ((77 ^ 64) & ((56 ^ 53) ^ (-1))) ^ (136 ^ 133);
        lIIIIlllI[22] = (199 ^ 180) ^ (124 ^ 1);
        lIIIIlllI[23] = (((141 + 148) - 71) + 14) ^ (((71 + 24) - (-27)) + 71);
        lIIIIlllI[24] = 41 ^ 54;
        lIIIIlllI[25] = 54 ^ 35;
        lIIIIlllI[26] = (-((-526) & 18063)) & (-6215) & 32751;
        lIIIIlllI[27] = (-20754) & 32753;
        lIIIIlllI[28] = (-1556) & 26555;
        lIIIIlllI[29] = (-((-7237) & 23654)) & (-4113) & 32509;
        lIIIIlllI[30] = (-16393) & 24399;
        lIIIIlllI[31] = 140 ^ 164;
        lIIIIlllI[32] = (-((-2649) & 32378)) & (-2049) & 32677;
        lIIIIlllI[33] = (176 ^ 184) ^ (96 ^ 12);
        lIIIIlllI[34] = (((98 + 1) - (-51)) + 8) ^ (((131 + 36) - 132) + 107);
        lIIIIlllI[35] = 122 ^ 25;
        lIIIIlllI[36] = 63 ^ 46;
        lIIIIlllI[37] = (-((-18443) & 31659)) & (-1) & 16373;
        lIIIIlllI[38] = (-((-2847) & 23519)) & (-514) & 24559;
        lIIIIlllI[39] = 109 ^ 64;
        lIIIIlllI[40] = (-((-53) & 8502)) & (-21121) & 32767;
        lIIIIlllI[41] = (-8345) & 11705;
        lIIIIlllI[42] = (-20857) & 24060;
        lIIIIlllI[43] = (-((-3077) & 32287)) & (-193) & 32767;
        lIIIIlllI[44] = (-24578) & 25853;
        lIIIIlllI[45] = (-((-203) & 22731)) & (-770) & 24575;
        lIIIIlllI[46] = (-((-1290) & 24015)) & (-553) & 24559;
        lIIIIlllI[47] = (-((-17139) & 27387)) & (-20545) & 32078;
        lIIIIlllI[48] = (-21523) & 32342;
        lIIIIlllI[49] = (-((-16679) & 28991)) & (-16385) & 30207;
        lIIIIlllI[50] = (-8203) & 9723;
        lIIIIlllI[51] = (-((-1515) & 32747)) & (-1) & 32751;
        lIIIIlllI[52] = (101 ^ 121) ^ (125 ^ 115);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        ez();
        return lIIIIlllI[33];
    }

    private static String llIllllllII(String lIIlIIIlllIlIlI, String lIIlIIIlllIlIIl) {
        try {
            SecretKeySpec lIIlIIIlllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIIlllIllII = Cipher.getInstance("Blowfish");
            lIIlIIIlllIllII.init(lIIIIlllI[3], lIIlIIIlllIllIl);
            return new String(lIIlIIIlllIllII.doFinal(Base64.getDecoder().decode(lIIlIIIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIIlllIlIll) {
            lIIlIIIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIIII(int i) {
        return i != 0;
    }

    private static boolean lllIIIIIIIl(int i, int i2) {
        return i < i2;
    }

    static {
        llIllllllll();
        llIlllllllI();
        mx = lIIIIlllI[7];
        my = lIIIIlllI[8];
        mB = lIIIIlllI[11];
        mA = lIIIIlllI[10];
        mz = lIIIIlllI[9];
        mC = new WorldArea(lIIIIlllI[37], lIIIIlllI[38], lIIIIlllI[34], lIIIIlllI[39], lIIIIlllI[0]);
        mD = new WorldArea(lIIIIlllI[40], lIIIIlllI[41], lIIIIlllI[22], lIIIIlllI[34], lIIIIlllI[0]);
        mE = new WorldPoint(lIIIIlllI[42], lIIIIlllI[43], lIIIIlllI[0]);
        int[] iArr = new int[lIIIIlllI[6]];
        iArr[lIIIIlllI[0]] = lIIIIlllI[44];
        iArr[lIIIIlllI[1]] = lIIIIlllI[45];
        iArr[lIIIIlllI[3]] = lIIIIlllI[46];
        iArr[lIIIIlllI[4]] = lIIIIlllI[47];
        mF = iArr;
        int[] iArr2 = new int[lIIIIlllI[1]];
        iArr2[lIIIIlllI[0]] = lIIIIlllI[48];
        mG = iArr2;
        int[] iArr3 = new int[lIIIIlllI[4]];
        iArr3[lIIIIlllI[0]] = lIIIIlllI[49];
        iArr3[lIIIIlllI[1]] = lIIIIlllI[50];
        iArr3[lIIIIlllI[3]] = lIIIIlllI[51];
        mf = iArr3;
        bv = new ArrayList();
    }

    private static boolean lllIIIIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static void llIlllllllI() {
        lIIIIllIl = new String[lIIIIlllI[52]];
        lIIIIllIl[lIIIIlllI[0]] = llIlllllIll("M2GQ0A//G/0Q7uadI0bt0g==", "mahJx");
        lIIIIllIl[lIIIIlllI[1]] = llIlllllIll("7nUChs1z4WGEpFX9jrwhOP3RIGKyovjLuEkllDYC5xNMFsjCT8Yb0cnNK5DElXF3ADzgMMRWltE=", "sWMVr");
        lIIIIllIl[lIIIIlllI[3]] = llIllllllII("dzOfg7GlOVZFhwePydi2MCgQqHfc5JyS", "lVOnJ");
        lIIIIllIl[lIIIIlllI[4]] = llIllllllIl("GzwkKQA6K2ElCDon", "TLAGi");
        lIIIIllIl[lIIIIlllI[6]] = llIlllllIll("6h7uqtdKnw9SYCrHToFwZcoDdovaohzB", "EPRxj");
        lIIIIllIl[lIIIIlllI[12]] = llIllllllIl("FhB5KRMkVTQhEjIcNy9BMRw6IwA5ECpkQTICMDwCKRw3L0E1GnkKNBg8Fw8=", "AuYHa");
        lIIIIllIl[lIIIIlllI[13]] = llIllllllII("/8W/HsqKAcq8yvTmgsEHKg==", "IrJkS");
        lIIIIllIl[lIIIIlllI[14]] = llIllllllIl("Cx8sPyYmAyRvOiAKMA==", "OmCOV");
        lIIIIllIl[lIIIIlllI[16]] = llIlllllIll("3r15fx4pCJVTawfc0JJSgsVCatxJZLB+", "CYnDq");
        lIIIIllIl[lIIIIlllI[17]] = llIlllllIll("jz9bmX1k8DOhv4pidWQu7Q==", "wAeDe");
        lIIIIllIl[lIIIIlllI[18]] = llIllllllII("owYQsrCjglVvO7Lmb9zN7w==", "ztyRg");
        lIIIIllIl[lIIIIlllI[19]] = llIllllllII("fTVVuJCzmT1u5+v5KYl/vw==", "SoSbV");
        lIIIIllIl[lIIIIlllI[20]] = llIllllllIl("Eyg2DRAqLnoSFmQmOw1ZMDs/Awo=", "DIZfy");
        lIIIIllIl[lIIIIlllI[21]] = llIlllllIll("hQgSzZW6aG3TsBuFGG/+aw==", "ggVSO");
        lIIIIllIl[lIIIIlllI[22]] = llIlllllIll("WnIr2VA2FSV/n6hwuzs1RCgDmsZ9LsXc", "VPDFk");
        lIIIIllIl[lIIIIlllI[15]] = llIlllllIll("Uuvkr9jkaBO1qltYgB9X5Q==", "wDsLs");
        lIIIIllIl[lIIIIlllI[34]] = llIlllllIll("zoLhXqJVdlHLOBU1lKSwcw==", "ilUQS");
        lIIIIllIl[lIIIIlllI[36]] = llIllllllIl("MyMUIWouLFoxLyAmDi5qaQ==", "AJzFJ");
    }

    private static boolean lllIIIIIlII(Object obj) {
        return obj != null;
    }

    private static String llIllllllIl(String lIIlIIIllIIllIl, String lIIlIIIllIIllII) {
        String lIIlIIIllIIllIl2 = new String(Base64.getDecoder().decode(lIIlIIIllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIIllIIlIll = new StringBuilder();
        char[] charArray = lIIlIIIllIIllII.toCharArray();
        int lIIlIIIllIIlIIl = lIIIIlllI[0];
        char[] charArray2 = lIIlIIIllIIllIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIIIlllI[0];
        while (lllIIIIIIIl(i, length)) {
            lIIlIIIllIIlIll.append((char) (charArray2[i] ^ charArray[lIIlIIIllIIlIIl % charArray.length]));
            "".length();
            lIIlIIIllIIlIIl++;
            i++;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIlIIIllIIlIll);
    }

    private static String llIlllllIll(String lIIlIIIllIlllIl, String lIIlIIIllIlllII) {
        try {
            SecretKeySpec lIIlIIIlllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIIllIlllII.getBytes(StandardCharsets.UTF_8)), lIIIIlllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIlllI[3], lIIlIIIlllIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIIllIllllI) {
            lIIlIIIllIllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (lllIIIIIIll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
        if (lllIIIIIlIl(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.am.lIIIIlllI[1]) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ba, code lost:
        if (lllIIIIIlIl(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.am.lIIIIlllI[1]) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f9, code lost:
        if (lllIIIIIlIl(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.am.lIIIIlllI[1]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
        if (lllIIIIIlIl(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.am.lIIIIlllI[1]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0277, code lost:
        if (lllIIIIIIIl(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.am.lIIIIlllI[1]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027a, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.am.lIIIIllIl[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.am.lIIIIlllI[12]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.am.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.am.lIIIIlllI[1];
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
    public static void ez() {
        if (lllIIIIIIII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[0]];
            C0001b.a(bv);
            if (lllIIIIIIIl(bv.size(), lIIIIlllI[1])) {
                System.out.println(lIIIIllIl[lIIIIlllI[1]]);
                bt = lIIIIlllI[0];
            }
        }
        if (lllIIIIIIlI(bt ? 1 : 0)) {
            if (lllIIIIIIII(ab() ? 1 : 0)) {
                int[] iArr = new int[lIIIIlllI[1]];
                iArr[lIIIIlllI[0]] = lIIIIlllI[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lllIIIIIlII(nearest) && lllIIIIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[3]];
                C0000a.a(nearest);
            }
            if (lllIIIIIlII(nearest) && lllIIIIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lllIIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIIlllI[5]);
                    "".length();
                }
                if (lllIIIIIIII(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[6]];
                    if (lllIIIIIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIIIlllI[6]);
                        "".length();
                    }
                    if (lllIIIIIIll(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIIIIlllI[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lIIIIlllI[1]];
                    iArr2[lIIIIlllI[0]] = lIIIIlllI[7];
                    if (lllIIIIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIIlllI[1]];
                        iArr3[lIIIIlllI[0]] = lIIIIlllI[7];
                    }
                    int[] iArr4 = new int[lIIIIlllI[1]];
                    iArr4[lIIIIlllI[0]] = lIIIIlllI[8];
                    if (lllIIIIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIIlllI[1]];
                        iArr5[lIIIIlllI[0]] = lIIIIlllI[8];
                    }
                    int[] iArr6 = new int[lIIIIlllI[1]];
                    iArr6[lIIIIlllI[0]] = lIIIIlllI[9];
                    if (lllIIIIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIIlllI[1]];
                        iArr7[lIIIIlllI[0]] = lIIIIlllI[9];
                    }
                    int[] iArr8 = new int[lIIIIlllI[1]];
                    iArr8[lIIIIlllI[0]] = lIIIIlllI[10];
                    if (lllIIIIIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIIIIlllI[1]];
                        iArr9[lIIIIlllI[0]] = lIIIIlllI[10];
                    }
                    int[] iArr10 = new int[lIIIIlllI[1]];
                    iArr10[lIIIIlllI[0]] = lIIIIlllI[11];
                    if (lllIIIIIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIIlllI[1]];
                        iArr11[lIIIIlllI[0]] = lIIIIlllI[11];
                    }
                    int[] iArr12 = new int[lIIIIlllI[1]];
                    iArr12[lIIIIlllI[0]] = lIIIIlllI[7];
                    if (lllIIIIIIII(Bank.contains(iArr12) ? 1 : 0)) {
                        Bank.withdraw(lIIIIlllI[7], lIIIIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr13 = new int[lIIIIlllI[1]];
                            iArr13[lIIIIlllI[0]] = lIIIIlllI[7];
                            if (lllIIIIIIll(Inventory.getCount(iArr13))) {
                                ?? r0 = lIIIIlllI[1];
                                "".length();
                                return 0 != 0 ? ((57 ^ 2) ^ (58 ^ 79)) & (((((140 + 109) - 62) + 7) ^ (((6 + 101) - 37) + 70)) ^ (-" ".length())) : r0;
                            }
                            return lIIIIlllI[0];
                        }, lIIIIlllI[5]);
                        "".length();
                    }
                    int[] iArr13 = new int[lIIIIlllI[1]];
                    iArr13[lIIIIlllI[0]] = lIIIIlllI[8];
                    if (lllIIIIIIII(Bank.contains(iArr13) ? 1 : 0)) {
                        Bank.withdraw(lIIIIlllI[8], lIIIIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lIIIIlllI[1]];
                            iArr14[lIIIIlllI[0]] = lIIIIlllI[8];
                            if (lllIIIIIIll(Inventory.getCount(iArr14))) {
                                ?? r0 = lIIIIlllI[1];
                                "".length();
                                return (((41 ^ 36) ^ (2 ^ 84)) & (((100 ^ 115) ^ (113 ^ 61)) ^ (-" ".length()))) != 0 ? ((242 ^ 135) ^ (250 ^ 171)) & (((((28 + 12) - (-35)) + 107) ^ (((70 + 61) - 64) + 79)) ^ (-" ".length())) : r0;
                            }
                            return lIIIIlllI[0];
                        }, lIIIIlllI[5]);
                        "".length();
                    }
                    int[] iArr14 = new int[lIIIIlllI[1]];
                    iArr14[lIIIIlllI[0]] = lIIIIlllI[9];
                    if (lllIIIIIIII(Bank.contains(iArr14) ? 1 : 0)) {
                        Bank.withdraw(lIIIIlllI[9], lIIIIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[lIIIIlllI[1]];
                            iArr15[lIIIIlllI[0]] = lIIIIlllI[9];
                            if (lllIIIIIIll(Inventory.getCount(iArr15))) {
                                ?? r0 = lIIIIlllI[1];
                                "".length();
                                return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIIlllI[0];
                        }, lIIIIlllI[5]);
                        "".length();
                    }
                    int[] iArr15 = new int[lIIIIlllI[1]];
                    iArr15[lIIIIlllI[0]] = lIIIIlllI[10];
                    if (lllIIIIIIII(Bank.contains(iArr15) ? 1 : 0)) {
                        Bank.withdraw(lIIIIlllI[10], lIIIIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIIIIlllI[1]];
                            iArr16[lIIIIlllI[0]] = lIIIIlllI[10];
                            if (lllIIIIIIll(Inventory.getCount(iArr16))) {
                                ?? r0 = lIIIIlllI[1];
                                "".length();
                                return "   ".length() < 0 ? ((((2 + 106) - (-65)) + 3) ^ (((14 + 10) - (-128)) + 5)) & (((12 ^ 54) ^ (5 ^ 18)) ^ (-" ".length())) : r0;
                            }
                            return lIIIIlllI[0];
                        }, lIIIIlllI[5]);
                        "".length();
                    }
                    int[] iArr16 = new int[lIIIIlllI[1]];
                    iArr16[lIIIIlllI[0]] = lIIIIlllI[11];
                    if (lllIIIIIIII(Bank.contains(iArr16) ? 1 : 0)) {
                        Bank.withdraw(lIIIIlllI[11], lIIIIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr17 = new int[lIIIIlllI[1]];
                            iArr17[lIIIIlllI[0]] = lIIIIlllI[11];
                            if (lllIIIIIIll(Inventory.getCount(iArr17))) {
                                ?? r0 = lIIIIlllI[1];
                                "".length();
                                return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIIlllI[0];
                        }, lIIIIlllI[5]);
                        "".length();
                    }
                }
            }
            if (lllIIIIIIII(ab() ? 1 : 0)) {
                if (lllIIIIIIII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[13]];
                    System.out.println(lIIIIllIl[lIIIIlllI[14]]);
                    Inventory.getAll(mf).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lllIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
                    if (lllIIIIIIIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[15])) {
                        if (lllIIIIIIlI(mC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[16]];
                            Movement.walkTo(mC.toWorldPoint());
                            "".length();
                            Time.sleepTicks(lIIIIlllI[6]);
                            "".length();
                        }
                        if (lllIIIIIIII(mC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[17]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), mF);
                            if (lllIIIIIIlI(Players.getLocal().isAnimating() ? 1 : 0) && lllIIIIIIlI(Players.getLocal().isMoving() ? 1 : 0) && lllIIIIIlII(nearest2)) {
                                System.out.println(lIIIIllIl[lIIIIlllI[18]]);
                                nearest2.interact(lIIIIllIl[lIIIIlllI[19]]);
                                Time.sleepTicks(lIIIIlllI[4]);
                                "".length();
                            }
                        }
                    }
                    if (lllIIIIIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[15])) {
                        if (lllIIIIIIlI(mD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[20]];
                            Movement.walkTo(mE);
                            "".length();
                            Time.sleepTicks(lIIIIlllI[6]);
                            "".length();
                        }
                        if (lllIIIIIIII(mD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[21]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), mG);
                            if (lllIIIIIIlI(Players.getLocal().isAnimating() ? 1 : 0) && lllIIIIIIlI(Players.getLocal().isMoving() ? 1 : 0) && lllIIIIIlII(nearest3)) {
                                System.out.println(lIIIIllIl[lIIIIlllI[22]]);
                                nearest3.interact(lIIIIllIl[lIIIIlllI[15]]);
                                Time.sleepTicks(lIIIIlllI[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIIIlllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lllIIIIIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIIlllI[35])) {
            ?? r0 = lIIIIlllI[1];
            "".length();
            return 0 != 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
        }
        return lIIIIlllI[0];
    }

    private static boolean lllIIIIIIlI(int i) {
        return i == 0;
    }
}
