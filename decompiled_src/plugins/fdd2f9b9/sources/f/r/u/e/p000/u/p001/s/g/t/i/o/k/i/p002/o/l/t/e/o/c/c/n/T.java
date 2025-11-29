package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.T  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/T.class */
public class T implements G {
    public static final /* synthetic */ int jF;
    public static final /* synthetic */ int jB;
    public static final /* synthetic */ WorldArea jG;
    public static /* synthetic */ int[] js;
    private static /* synthetic */ String[] lIIIlIllIl;
    public static final /* synthetic */ int jE;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldArea jH;
    public static /* synthetic */ int[] jK;
    public static final /* synthetic */ int jC;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ int jD;
    public static /* synthetic */ int[] jJ;
    public static final /* synthetic */ WorldPoint jI;
    private static /* synthetic */ int[] lIIIlIlllI;

    private static boolean lllIllIlIIlI(int i) {
        return i == 0;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIlIllIl[lIIIlIlllI[34]];
    }

    private static boolean lllIllIlIIII(int i) {
        return i != 0;
    }

    public static void af() {
        int[] iArr = new int[lIIIlIlllI[1]];
        iArr[lIIIlIlllI[0]] = lIIIlIlllI[7];
        if (lllIllIlIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlllI[7], lIIIlIlllI[1], lIIIlIlllI[5]));
            "".length();
        }
        int[] iArr2 = new int[lIIIlIlllI[1]];
        iArr2[lIIIlIlllI[0]] = lIIIlIlllI[8];
        if (lllIllIlIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlllI[8], lIIIlIlllI[1], lIIIlIlllI[5]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlIlllI[1]];
        iArr3[lIIIlIlllI[0]] = lIIIlIlllI[9];
        if (lllIllIlIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlllI[9], lIIIlIlllI[1], lIIIlIlllI[26]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlIlllI[1]];
        iArr4[lIIIlIlllI[0]] = lIIIlIlllI[10];
        if (lllIllIlIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlllI[10], lIIIlIlllI[1], lIIIlIlllI[27]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlIlllI[1]];
        iArr5[lIIIlIlllI[0]] = lIIIlIlllI[11];
        if (lllIllIlIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlllI[11], lIIIlIlllI[1], lIIIlIlllI[28]));
            "".length();
        }
        if (lllIllIlIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlIllIl[lIIIlIlllI[36]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlllI[29], lIIIlIlllI[12], lIIIlIlllI[28]));
            "".length();
        }
        int[] iArr6 = new int[lIIIlIlllI[1]];
        iArr6[lIIIlIlllI[0]] = lIIIlIlllI[30];
        if (lllIllIlIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlllI[30], lIIIlIlllI[31], lIIIlIlllI[32]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIlIlllI[0];
    }

    private static void lllIllIIllIl() {
        lIIIlIllIl = new String[lIIIlIlllI[52]];
        lIIIlIllIl[lIIIlIlllI[0]] = lllIllIIlIlI("jjzJcFiD/ER+ivjdgSZSYg==", "clLKG");
        lIIIlIllIl[lIIIlIlllI[1]] = lllIllIIlIll("sNK+qrAv6pWHtG+K9TlQn5h3DmOmQQn6ULC2i6cQ12FQr//3WVwgP45PXL0bNZ4u/GJhIEHT6y4=", "UhepP");
        lIIIlIllIl[lIIIlIlllI[3]] = lllIllIIllII("NjAMIwkZJRMkCVglFWoMGT8R", "xQzJn");
        lIIIlIllIl[lIIIlIlllI[4]] = lllIllIIlIll("AvbWR1Il4gBVXkGLEoG0Fg==", "tndTd");
        lIIIlIllIl[lIIIlIlllI[6]] = lllIllIIlIlI("elrQ6+XEnwIrFtazsUS3narrGSR101vS", "HREZm");
        lIIIlIllIl[lIIIlIlllI[12]] = lllIllIIlIlI("A8YB+kO8wQe+sGfVo4N6LADua7u430dCwgpd6XR79FIbDVU9NN+xS0l59G6VgwXP", "FQlgr");
        lIIIlIllIl[lIIIlIlllI[13]] = lllIllIIlIlI("wb+TgH+5aNLMIaICt4y1Hw==", "ERFuD");
        lIIIlIllIl[lIIIlIlllI[14]] = lllIllIIllII("JjEjKDwLLSt4IA0kPw==", "bCLXL");
        lIIIlIllIl[lIIIlIlllI[16]] = lllIllIIlIll("zDjoSRw53TxqmfzCuDBf/kXqH3XBgF3g", "FsOcv");
        lIIIlIllIl[lIIIlIlllI[17]] = lllIllIIlIll("ReHmRL64DCGpwrG/v0cCJw==", "PxcxO");
        lIIIlIllIl[lIIIlIlllI[18]] = lllIllIIllII("EwINGSE5BAVJPT8NEQ==", "PjbiQ");
        lIIIlIllIl[lIIIlIlllI[19]] = lllIllIIlIll("i1+PJ3B66RHULO+Fdwu/zw==", "uqztP");
        lIIIlIllIl[lIIIlIlllI[20]] = lllIllIIlIlI("bXQ8346OdCWU1V9Lw81esQtV9n95JkSy", "FNIFK");
        lIIIlIllIl[lIIIlIlllI[21]] = lllIllIIlIlI("jn18c/Anp9F+p/Y3QD3xyQ==", "rKptR");
        lIIIlIllIl[lIIIlIlllI[22]] = lllIllIIlIll("2S+Hq/UZIL0GeZDlNzY0Qh6L2opJQS2g", "QNJbU");
        lIIIlIllIl[lIIIlIlllI[15]] = lllIllIIlIll("HEZ2bsU7Xfr0WPlGBcoBow==", "UEhpO");
        lIIIlIllIl[lIIIlIlllI[34]] = lllIllIIlIlI("r3Lac9gEA8Ml5klA+gX45Q==", "adekm");
        lIIIlIllIl[lIIIlIlllI[36]] = lllIllIIlIlI("S+qA4q+uQsdXbmlOeZfAZ6d1Pp2iuOM9", "yyRoz");
    }

    private static boolean lllIllIlIlII(Object obj) {
        return obj != null;
    }

    private static String lllIllIIllII(String lIIlIllIIlll, String lIIlIllIIllI) {
        String lIIlIllIIlll2 = new String(Base64.getDecoder().decode(lIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIllIIlIl = new StringBuilder();
        char[] lIIlIllIIlII = lIIlIllIIllI.toCharArray();
        int lIIlIllIIIll = lIIIlIlllI[0];
        char[] charArray = lIIlIllIIlll2.toCharArray();
        int length = charArray.length;
        int i = lIIIlIlllI[0];
        while (lllIllIlIIIl(i, length)) {
            char lIIlIllIlIII = charArray[i];
            lIIlIllIIlIl.append((char) (lIIlIllIlIII ^ lIIlIllIIlII[lIIlIllIIIll % lIIlIllIIlII.length]));
            "".length();
            lIIlIllIIIll++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lIIlIllIIlIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllIllIlIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[35])) {
            ?? r0 = lIIIlIlllI[1];
            "".length();
            return ((21 ^ 15) ^ (65 ^ 95)) <= "  ".length() ? ((231 ^ 174) ^ (5 ^ 119)) & (((212 ^ 152) ^ (210 ^ 165)) ^ (-" ".length())) : r0;
        }
        return lIIIlIlllI[0];
    }

    private static String lllIllIIlIlI(String lIIlIlllIlll, String lIIlIlllIllI) {
        try {
            SecretKeySpec lIIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIllllIIl = Cipher.getInstance("Blowfish");
            lIIlIllllIIl.init(lIIIlIlllI[3], lIIlIllllIlI);
            return new String(lIIlIllllIIl.doFinal(Base64.getDecoder().decode(lIIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIllllIII) {
            lIIlIllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllIlIIll(int i) {
        return i > 0;
    }

    private static boolean lllIllIlIIIl(int i, int i2) {
        return i < i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        ds();
        return lIIIlIlllI[33];
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
        if (lllIllIlIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[23])) {
            int[] iArr = new int[lIIIlIlllI[1]];
            iArr[lIIIlIlllI[0]] = lIIIlIlllI[11];
            if (lllIllIlIIll(Inventory.getCount(iArr))) {
                ?? r0 = lIIIlIlllI[1];
                "".length();
                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIlIlllI[0];
        } else if (lllIllIlIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[24]) && lllIllIlIIIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[23])) {
            int[] iArr2 = new int[lIIIlIlllI[1]];
            iArr2[lIIIlIlllI[0]] = lIIIlIlllI[11];
            if (lllIllIlIIll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIIlIlllI[1]];
                iArr3[lIIIlIlllI[0]] = lIIIlIlllI[10];
                if (lllIllIlIIll(Inventory.getCount(iArr3))) {
                    ?? r02 = lIIIlIlllI[1];
                    "".length();
                    return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return lIIIlIlllI[0];
        } else if (lllIllIlIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[25]) && lllIllIlIIIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[24])) {
            int[] iArr4 = new int[lIIIlIlllI[1]];
            iArr4[lIIIlIlllI[0]] = lIIIlIlllI[11];
            if (lllIllIlIIll(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[lIIIlIlllI[1]];
                iArr5[lIIIlIlllI[0]] = lIIIlIlllI[10];
                if (lllIllIlIIll(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[lIIIlIlllI[1]];
                    iArr6[lIIIlIlllI[0]] = lIIIlIlllI[9];
                    if (lllIllIlIIll(Inventory.getCount(iArr6))) {
                        ?? r03 = lIIIlIlllI[1];
                        "".length();
                        return (true ^ false) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                    }
                }
            }
            return lIIIlIlllI[0];
        } else if (lllIllIlIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[13]) && lllIllIlIIIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[25])) {
            int[] iArr7 = new int[lIIIlIlllI[1]];
            iArr7[lIIIlIlllI[0]] = lIIIlIlllI[11];
            if (lllIllIlIIll(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[lIIIlIlllI[1]];
                iArr8[lIIIlIlllI[0]] = lIIIlIlllI[10];
                if (lllIllIlIIll(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[lIIIlIlllI[1]];
                    iArr9[lIIIlIlllI[0]] = lIIIlIlllI[9];
                    if (lllIllIlIIll(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[lIIIlIlllI[1]];
                        iArr10[lIIIlIlllI[0]] = lIIIlIlllI[8];
                        if (lllIllIlIIll(Inventory.getCount(iArr10))) {
                            ?? r04 = lIIIlIlllI[1];
                            "".length();
                            return (((201 ^ 199) ^ (20 ^ 69)) & (((8 ^ 85) ^ "  ".length()) ^ (-" ".length()))) != (((5 ^ 98) ^ (100 ^ 99)) & (((89 ^ 74) ^ (52 ^ 71)) ^ (-" ".length()))) ? ((230 ^ 151) ^ (51 ^ 28)) & (((168 ^ 197) ^ (84 ^ 103)) ^ (-" ".length())) : r04;
                        }
                    }
                }
            }
            return lIIIlIlllI[0];
        } else {
            int[] iArr11 = new int[lIIIlIlllI[1]];
            iArr11[lIIIlIlllI[0]] = lIIIlIlllI[11];
            if (lllIllIlIIll(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[lIIIlIlllI[1]];
                iArr12[lIIIlIlllI[0]] = lIIIlIlllI[10];
                if (lllIllIlIIll(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[lIIIlIlllI[1]];
                    iArr13[lIIIlIlllI[0]] = lIIIlIlllI[9];
                    if (lllIllIlIIll(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[lIIIlIlllI[1]];
                        iArr14[lIIIlIlllI[0]] = lIIIlIlllI[8];
                        if (lllIllIlIIll(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[lIIIlIlllI[1]];
                            iArr15[lIIIlIlllI[0]] = lIIIlIlllI[7];
                            if (lllIllIlIIll(Inventory.getCount(iArr15))) {
                                ?? r05 = lIIIlIlllI[1];
                                "".length();
                                return 0 != 0 ? ((((74 + 100) - 142) + 114) ^ (((144 + 14) - 104) + 141)) & (((((103 + 91) - 8) + 37) ^ (((6 + 72) - (-2)) + 62)) ^ (-" ".length())) : r05;
                            }
                        }
                    }
                }
            }
            return lIIIlIlllI[0];
        }
    }

    private static String lllIllIIlIll(String lIIllIIIIlII, String lIIllIIIIIIl) {
        try {
            SecretKeySpec lIIllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIlllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIlllI[3], lIIllIIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIIIlIl) {
            lIIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    static {
        lllIllIIllll();
        lllIllIIllIl();
        jE = lIIIlIlllI[10];
        jB = lIIIlIlllI[7];
        jD = lIIIlIlllI[9];
        jF = lIIIlIlllI[11];
        jC = lIIIlIlllI[8];
        jG = new WorldArea(lIIIlIlllI[37], lIIIlIlllI[38], lIIIlIlllI[34], lIIIlIlllI[39], lIIIlIlllI[0]);
        jH = new WorldArea(lIIIlIlllI[40], lIIIlIlllI[41], lIIIlIlllI[22], lIIIlIlllI[34], lIIIlIlllI[0]);
        jI = new WorldPoint(lIIIlIlllI[42], lIIIlIlllI[43], lIIIlIlllI[0]);
        int[] iArr = new int[lIIIlIlllI[6]];
        iArr[lIIIlIlllI[0]] = lIIIlIlllI[44];
        iArr[lIIIlIlllI[1]] = lIIIlIlllI[45];
        iArr[lIIIlIlllI[3]] = lIIIlIlllI[46];
        iArr[lIIIlIlllI[4]] = lIIIlIlllI[47];
        jJ = iArr;
        int[] iArr2 = new int[lIIIlIlllI[1]];
        iArr2[lIIIlIlllI[0]] = lIIIlIlllI[48];
        jK = iArr2;
        int[] iArr3 = new int[lIIIlIlllI[4]];
        iArr3[lIIIlIlllI[0]] = lIIIlIlllI[49];
        iArr3[lIIIlIlllI[1]] = lIIIlIlllI[50];
        iArr3[lIIIlIlllI[3]] = lIIIlIlllI[51];
        js = iArr3;
        bv = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (lllIllIlIIll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
        if (lllIllIlIlIl(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.T.lIIIlIlllI[1]) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ba, code lost:
        if (lllIllIlIlIl(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.T.lIIIlIlllI[1]) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f9, code lost:
        if (lllIllIlIlIl(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.T.lIIIlIlllI[1]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
        if (lllIllIlIlIl(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.T.lIIIlIlllI[1]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0277, code lost:
        if (lllIllIlIIIl(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.T.lIIIlIlllI[1]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027a, code lost:
        af();
        java.lang.System.out.println(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.T.lIIIlIllIl[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.T.lIIIlIlllI[12]]);
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.T.bt = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.T.lIIIlIlllI[1];
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
    public static void ds() {
        if (lllIllIlIIII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[0]];
            C0001b.a(bv);
            if (lllIllIlIIIl(bv.size(), lIIIlIlllI[1])) {
                System.out.println(lIIIlIllIl[lIIIlIlllI[1]]);
                bt = lIIIlIlllI[0];
            }
        }
        if (lllIllIlIIlI(bt ? 1 : 0)) {
            if (lllIllIlIIII(ab() ? 1 : 0)) {
                int[] iArr = new int[lIIIlIlllI[1]];
                iArr[lIIIlIlllI[0]] = lIIIlIlllI[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lllIllIlIlII(nearest) && lllIllIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[3]];
                C0000a.a(nearest);
            }
            if (lllIllIlIlII(nearest) && lllIllIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lllIllIlIIlI(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIlIlllI[5]);
                    "".length();
                }
                if (lllIllIlIIII(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[6]];
                    if (lllIllIlIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIIlIlllI[6]);
                        "".length();
                    }
                    if (lllIllIlIIll(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIIIlIlllI[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lIIIlIlllI[1]];
                    iArr2[lIIIlIlllI[0]] = lIIIlIlllI[7];
                    if (lllIllIlIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIlIlllI[1]];
                        iArr3[lIIIlIlllI[0]] = lIIIlIlllI[7];
                    }
                    int[] iArr4 = new int[lIIIlIlllI[1]];
                    iArr4[lIIIlIlllI[0]] = lIIIlIlllI[8];
                    if (lllIllIlIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIlIlllI[1]];
                        iArr5[lIIIlIlllI[0]] = lIIIlIlllI[8];
                    }
                    int[] iArr6 = new int[lIIIlIlllI[1]];
                    iArr6[lIIIlIlllI[0]] = lIIIlIlllI[9];
                    if (lllIllIlIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIlIlllI[1]];
                        iArr7[lIIIlIlllI[0]] = lIIIlIlllI[9];
                    }
                    int[] iArr8 = new int[lIIIlIlllI[1]];
                    iArr8[lIIIlIlllI[0]] = lIIIlIlllI[10];
                    if (lllIllIlIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIIIlIlllI[1]];
                        iArr9[lIIIlIlllI[0]] = lIIIlIlllI[10];
                    }
                    int[] iArr10 = new int[lIIIlIlllI[1]];
                    iArr10[lIIIlIlllI[0]] = lIIIlIlllI[11];
                    if (lllIllIlIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIlIlllI[1]];
                        iArr11[lIIIlIlllI[0]] = lIIIlIlllI[11];
                    }
                    int[] iArr12 = new int[lIIIlIlllI[1]];
                    iArr12[lIIIlIlllI[0]] = lIIIlIlllI[7];
                    if (lllIllIlIIII(Bank.contains(iArr12) ? 1 : 0)) {
                        Bank.withdraw(lIIIlIlllI[7], lIIIlIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr13 = new int[lIIIlIlllI[1]];
                            iArr13[lIIIlIlllI[0]] = lIIIlIlllI[7];
                            if (lllIllIlIIll(Inventory.getCount(iArr13))) {
                                ?? r0 = lIIIlIlllI[1];
                                "".length();
                                return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIlIlllI[0];
                        }, lIIIlIlllI[5]);
                        "".length();
                    }
                    int[] iArr13 = new int[lIIIlIlllI[1]];
                    iArr13[lIIIlIlllI[0]] = lIIIlIlllI[8];
                    if (lllIllIlIIII(Bank.contains(iArr13) ? 1 : 0)) {
                        Bank.withdraw(lIIIlIlllI[8], lIIIlIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lIIIlIlllI[1]];
                            iArr14[lIIIlIlllI[0]] = lIIIlIlllI[8];
                            if (lllIllIlIIll(Inventory.getCount(iArr14))) {
                                ?? r0 = lIIIlIlllI[1];
                                "".length();
                                return ((108 ^ 70) ^ (105 ^ 71)) > ((216 ^ 173) ^ (53 ^ 68)) ? ((58 ^ 22) ^ (199 ^ 179)) & (((184 ^ 139) ^ (196 ^ 175)) ^ (-" ".length())) : r0;
                            }
                            return lIIIlIlllI[0];
                        }, lIIIlIlllI[5]);
                        "".length();
                    }
                    int[] iArr14 = new int[lIIIlIlllI[1]];
                    iArr14[lIIIlIlllI[0]] = lIIIlIlllI[9];
                    if (lllIllIlIIII(Bank.contains(iArr14) ? 1 : 0)) {
                        Bank.withdraw(lIIIlIlllI[9], lIIIlIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[lIIIlIlllI[1]];
                            iArr15[lIIIlIlllI[0]] = lIIIlIlllI[9];
                            if (lllIllIlIIll(Inventory.getCount(iArr15))) {
                                ?? r0 = lIIIlIlllI[1];
                                "".length();
                                return "  ".length() <= ((134 ^ 144) & ((11 ^ 29) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIlIlllI[0];
                        }, lIIIlIlllI[5]);
                        "".length();
                    }
                    int[] iArr15 = new int[lIIIlIlllI[1]];
                    iArr15[lIIIlIlllI[0]] = lIIIlIlllI[10];
                    if (lllIllIlIIII(Bank.contains(iArr15) ? 1 : 0)) {
                        Bank.withdraw(lIIIlIlllI[10], lIIIlIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIIIlIlllI[1]];
                            iArr16[lIIIlIlllI[0]] = lIIIlIlllI[10];
                            if (lllIllIlIIll(Inventory.getCount(iArr16))) {
                                ?? r0 = lIIIlIlllI[1];
                                "".length();
                                return " ".length() <= 0 ? ((10 ^ 84) ^ (234 ^ 145)) & (((179 ^ 168) ^ (251 ^ 197)) ^ (-" ".length())) : r0;
                            }
                            return lIIIlIlllI[0];
                        }, lIIIlIlllI[5]);
                        "".length();
                    }
                    int[] iArr16 = new int[lIIIlIlllI[1]];
                    iArr16[lIIIlIlllI[0]] = lIIIlIlllI[11];
                    if (lllIllIlIIII(Bank.contains(iArr16) ? 1 : 0)) {
                        Bank.withdraw(lIIIlIlllI[11], lIIIlIlllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr17 = new int[lIIIlIlllI[1]];
                            iArr17[lIIIlIlllI[0]] = lIIIlIlllI[11];
                            if (lllIllIlIIll(Inventory.getCount(iArr17))) {
                                ?? r0 = lIIIlIlllI[1];
                                "".length();
                                return (-" ".length()) != (-" ".length()) ? ((((158 + 86) - 224) + 214) ^ (((91 + 115) - 129) + 84)) & (((219 ^ 177) ^ (8 ^ 41)) ^ (-" ".length())) : r0;
                            }
                            return lIIIlIlllI[0];
                        }, lIIIlIlllI[5]);
                        "".length();
                    }
                }
            }
            if (lllIllIlIIII(ab() ? 1 : 0)) {
                if (lllIllIlIIII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[13]];
                    System.out.println(lIIIlIllIl[lIIIlIlllI[14]]);
                    Inventory.getAll(js).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lllIllIlIIlI(Inventory.isFull() ? 1 : 0)) {
                    if (lllIllIlIIIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[15])) {
                        if (lllIllIlIIlI(jG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[16]];
                            Movement.walkTo(jG.toWorldPoint());
                            "".length();
                            Time.sleepTicks(lIIIlIlllI[6]);
                            "".length();
                        }
                        if (lllIllIlIIII(jG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[17]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), jJ);
                            if (lllIllIlIIlI(Players.getLocal().isAnimating() ? 1 : 0) && lllIllIlIIlI(Players.getLocal().isMoving() ? 1 : 0) && lllIllIlIlII(nearest2)) {
                                System.out.println(lIIIlIllIl[lIIIlIlllI[18]]);
                                nearest2.interact(lIIIlIllIl[lIIIlIlllI[19]]);
                                Time.sleepTicks(lIIIlIlllI[4]);
                                "".length();
                            }
                        }
                    }
                    if (lllIllIlIlIl(Skills.getLevel(Skill.WOODCUTTING), lIIIlIlllI[15])) {
                        if (lllIllIlIIlI(jH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[20]];
                            Movement.walkTo(jI);
                            "".length();
                            Time.sleepTicks(lIIIlIlllI[6]);
                            "".length();
                        }
                        if (lllIllIlIIII(jH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[21]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), jK);
                            if (lllIllIlIIlI(Players.getLocal().isAnimating() ? 1 : 0) && lllIllIlIIlI(Players.getLocal().isMoving() ? 1 : 0) && lllIllIlIlII(nearest3)) {
                                System.out.println(lIIIlIllIl[lIIIlIlllI[22]]);
                                nearest3.interact(lIIIlIllIl[lIIIlIlllI[15]]);
                                Time.sleepTicks(lIIIlIlllI[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static void lllIllIIllll() {
        lIIIlIlllI = new int[53];
        lIIIlIlllI[0] = ((86 ^ 102) ^ (55 ^ 61)) & (((((38 + 123) - 121) + 110) ^ (((132 + 62) - 128) + 106)) ^ (-" ".length()));
        lIIIlIlllI[1] = " ".length();
        lIIIlIlllI[2] = (-((-5159) & 23599)) & (-8197) & 27631;
        lIIIlIlllI[3] = "  ".length();
        lIIIlIlllI[4] = "   ".length();
        lIIIlIlllI[5] = (-((-5796) & 14055)) & (-18449) & 31707;
        lIIIlIlllI[6] = 24 ^ 28;
        lIIIlIlllI[7] = (-((-407) & 15295)) & (-16385) & 32623;
        lIIIlIlllI[8] = (-2689) & 4041;
        lIIIlIlllI[9] = (-((-1099) & 19567)) & (-4625) & 24447;
        lIIIlIlllI[10] = (-4113) & 5469;
        lIIIlIlllI[11] = (-((-33) & 21153)) & (-10273) & 32751;
        lIIIlIlllI[12] = 131 ^ 134;
        lIIIlIlllI[13] = 94 ^ 88;
        lIIIlIlllI[14] = 67 ^ 68;
        lIIIlIlllI[15] = 1 ^ 14;
        lIIIlIlllI[16] = (68 ^ 98) ^ (49 ^ 31);
        lIIIlIlllI[17] = 152 ^ 145;
        lIIIlIlllI[18] = (148 ^ 156) ^ "  ".length();
        lIIIlIlllI[19] = 52 ^ 63;
        lIIIlIlllI[20] = (26 ^ 40) ^ (253 ^ 195);
        lIIIlIlllI[21] = (((30 + 69) - 81) + 145) ^ (((30 + 150) - 34) + 28);
        lIIIlIlllI[22] = (140 ^ 169) ^ (95 ^ 116);
        lIIIlIlllI[23] = (29 ^ 64) ^ (222 ^ 170);
        lIIIlIlllI[24] = (((72 + 112) - 41) + 12) ^ (((115 + 34) - 35) + 18);
        lIIIlIlllI[25] = 26 ^ 15;
        lIIIlIlllI[26] = (-7365) & 16364;
        lIIIlIlllI[27] = (-20482) & 32481;
        lIIIlIlllI[28] = (-((-2209) & 6887)) & (-3074) & 32751;
        lIIIlIlllI[29] = (-4371) & 16350;
        lIIIlIlllI[30] = (-((-9159) & 25599)) & (-1) & 24447;
        lIIIlIlllI[31] = 160 ^ 136;
        lIIIlIlllI[32] = (-((-16929) & 31283)) & (-16457) & 31710;
        lIIIlIlllI[33] = (((181 + 15) - 151) + 176) ^ (((116 + 67) - 24) + 26);
        lIIIlIlllI[34] = 188 ^ 172;
        lIIIlIlllI[35] = 24 ^ 123;
        lIIIlIlllI[36] = (57 ^ 2) ^ (34 ^ 8);
        lIIIlIlllI[37] = (-5025) & 8181;
        lIIIlIlllI[38] = (-((-1377) & 30049)) & (-194) & 32239;
        lIIIlIlllI[39] = (132 ^ 142) ^ (30 ^ 57);
        lIIIlIlllI[40] = (-29186) & 32383;
        lIIIlIlllI[41] = (-24651) & 28011;
        lIIIlIlllI[42] = (-16505) & 19708;
        lIIIlIlllI[43] = (-25163) & 28527;
        lIIIlIlllI[44] = (-2308) & 3583;
        lIIIlIlllI[45] = (-8961) & 10238;
        lIIIlIlllI[46] = (-29250) & 30531;
        lIIIlIlllI[47] = (-((-19457) & 32442)) & (-16385) & 30655;
        lIIIlIlllI[48] = (-5539) & 16358;
        lIIIlIlllI[49] = (-27145) & 28655;
        lIIIlIlllI[50] = (-((-161) & 23215)) & (-8193) & 32767;
        lIIIlIlllI[51] = (-20481) & 21999;
        lIIIlIlllI[52] = 215 ^ 197;
    }

    private static boolean lllIllIlIlIl(int i, int i2) {
        return i >= i2;
    }
}
