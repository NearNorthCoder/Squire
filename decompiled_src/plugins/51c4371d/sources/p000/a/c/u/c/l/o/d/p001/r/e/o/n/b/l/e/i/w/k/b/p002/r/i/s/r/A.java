package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.A  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/A.class */
public class A implements F {
    public static final /* synthetic */ WorldPoint hN;
    private static final /* synthetic */ String[] hO;
    public static final /* synthetic */ int hL;
    public static /* synthetic */ WorldPoint hP;
    public static /* synthetic */ List<C0003d> bB;
    public static /* synthetic */ boolean bz;
    public static final /* synthetic */ int hK;
    static /* synthetic */ boolean cj;
    static /* synthetic */ int ci;
    private static /* synthetic */ String[] lIIIIIIII;
    private static /* synthetic */ int[] lIIIIIIIl;
    static /* synthetic */ int bZ;
    public static final /* synthetic */ int hM;

    private static boolean llIlIlIlIlI(int i) {
        return i == 0;
    }

    private static boolean llIlIlIllll(int i, int i2) {
        return i >= i2;
    }

    static {
        llIlIlIIlll();
        llIlIlIIllI();
        hL = lIIIIIIIl[8];
        hK = lIIIIIIIl[9];
        hM = lIIIIIIIl[7];
        hN = new WorldPoint(lIIIIIIIl[24], lIIIIIIIl[25], lIIIIIIIl[0]);
        String[] strArr = new String[lIIIIIIIl[11]];
        strArr[lIIIIIIIl[0]] = lIIIIIIII[lIIIIIIIl[14]];
        strArr[lIIIIIIIl[1]] = lIIIIIIII[lIIIIIIIl[26]];
        strArr[lIIIIIIIl[4]] = lIIIIIIII[lIIIIIIIl[27]];
        strArr[lIIIIIIIl[5]] = lIIIIIIII[lIIIIIIIl[28]];
        strArr[lIIIIIIIl[2]] = lIIIIIIII[lIIIIIIIl[29]];
        hO = strArr;
        hP = new WorldPoint(lIIIIIIIl[30], lIIIIIIIl[31], lIIIIIIIl[4]);
        bB = new ArrayList();
        bZ = lIIIIIIIl[0];
    }

    private static void ag() {
        int[] iArr = new int[lIIIIIIIl[1]];
        iArr[lIIIIIIIl[0]] = lIIIIIIIl[9];
        if (llIlIlIlIlI(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIIl[9], lIIIIIIIl[1], lIIIIIIIl[6]));
            "".length();
        }
        int[] iArr2 = new int[lIIIIIIIl[1]];
        iArr2[lIIIIIIIl[0]] = lIIIIIIIl[8];
        if (llIlIlIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIIl[8], lIIIIIIIl[1], lIIIIIIIl[6]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIIIIl[1]];
        iArr3[lIIIIIIIl[0]] = lIIIIIIIl[7];
        if (llIlIlIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIIl[7], lIIIIIIIl[1], lIIIIIIIl[6]));
            "".length();
        }
        int[] iArr4 = new int[lIIIIIIIl[1]];
        iArr4[lIIIIIIIl[0]] = lIIIIIIIl[10];
        if (llIlIlIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIIl[10], lIIIIIIIl[14], lIIIIIIIl[15]));
            "".length();
        }
        if (llIlIlIlIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIIIII[lIIIIIIIl[23]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIIl[16], lIIIIIIIl[11], lIIIIIIIl[17]));
            "".length();
        }
        int[] iArr5 = new int[lIIIIIIIl[1]];
        iArr5[lIIIIIIIl[0]] = lIIIIIIIl[18];
        if (llIlIlIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIIl[18], lIIIIIIIl[19], lIIIIIIIl[20]));
            "".length();
        }
    }

    private static boolean llIlIlIlIII(int i) {
        return i != 0;
    }

    private static boolean llIlIlIllII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static void bD() {
        if (llIlIlIlIII(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[0]];
            C0001b.a(bB);
            if (llIlIlIlIIl(bB.size(), lIIIIIIIl[1])) {
                System.out.println(lIIIIIIII[lIIIIIIIl[1]]);
                bz = lIIIIIIIl[0];
            }
        }
        if (llIlIlIlIlI(bz ? 1 : 0)) {
            if (llIlIlIlIlI(ac() ? 1 : 0) && llIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[2]) && llIlIlIlIIl(C0004e.j(lIIIIIIIl[3]), lIIIIIIIl[4])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIlIllII(nearest) && llIlIlIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[4]];
                    C0000a.a(nearest);
                }
                if (llIlIlIllII(nearest) && llIlIlIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[5]];
                    if (llIlIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIIIl[6]);
                        "".length();
                    }
                    if (llIlIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIIIl[2]);
                            "".length();
                        }
                        if (llIlIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIIIl[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIIIIl[2]];
                        iArr[lIIIIIIIl[0]] = lIIIIIIIl[7];
                        iArr[lIIIIIIIl[1]] = lIIIIIIIl[8];
                        iArr[lIIIIIIIl[4]] = lIIIIIIIl[9];
                        iArr[lIIIIIIIl[5]] = lIIIIIIIl[10];
                        if (llIlIlIlIlI(C0004e.b(iArr) ? 1 : 0)) {
                            ag();
                            System.out.println(lIIIIIIII[lIIIIIIIl[2]]);
                            bz = lIIIIIIIl[1];
                            return;
                        }
                        if (llIlIlIlIII(AccBuilderBarrows.e ? 1 : 0)) {
                            C0000a.b(C0005f.bl, lIIIIIIIl[1]);
                        }
                        int[] iArr2 = new int[lIIIIIIIl[2]];
                        iArr2[lIIIIIIIl[0]] = lIIIIIIIl[7];
                        iArr2[lIIIIIIIl[1]] = lIIIIIIIl[8];
                        iArr2[lIIIIIIIl[4]] = lIIIIIIIl[9];
                        iArr2[lIIIIIIIl[5]] = lIIIIIIIl[10];
                        if (llIlIlIlIII(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIIIIIIIl[2]];
                            iArr3[lIIIIIIIl[0]] = lIIIIIIIl[7];
                            iArr3[lIIIIIIIl[1]] = lIIIIIIIl[8];
                            iArr3[lIIIIIIIl[4]] = lIIIIIIIl[9];
                            iArr3[lIIIIIIIl[5]] = lIIIIIIIl[10];
                            C0000a.a(iArr3);
                        }
                    }
                }
            }
            if ((!llIlIlIlIlI(ac() ? 1 : 0) || llIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[2])) && llIlIlIlIIl(C0004e.j(lIIIIIIIl[3]), lIIIIIIIl[4])) {
                AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[11]];
                if (llIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[5])) {
                    ci = lIIIIIIIl[0];
                    Movement.walkTo(hN);
                    "".length();
                }
                if (llIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[5])) {
                    if (llIlIlIlIIl(ci, lIIIIIIIl[1])) {
                        Q.mC += lIIIIIIIl[1];
                        Q.o(AccBuilderBarrows.m);
                        ci += lIIIIIIIl[1];
                        Q.mC = lIIIIIIIl[0];
                        cj = lIIIIIIIl[0];
                    }
                    AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[12]];
                    if (llIlIlIlIIl(bZ, lIIIIIIIl[1])) {
                        C0004e.w();
                        bZ += lIIIIIIIl[1];
                    }
                    C0006g.a(lIIIIIIII[lIIIIIIIl[13]], hO);
                }
            }
            C0006g.a(new String[lIIIIIIIl[0]]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIlIlIllll(C0004e.j(lIIIIIIIl[3]), lIIIIIIIl[4])) {
            ?? r0 = lIIIIIIIl[1];
            "".length();
            return (-" ".length()) > 0 ? ((91 ^ 50) ^ (120 ^ 51)) & (((51 ^ 30) ^ (110 ^ 97)) ^ (-" ".length())) : r0;
        }
        return lIIIIIIIl[0];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIIIIIIII[lIIIIIIIl[22]];
    }

    private static void llIlIlIIllI() {
        lIIIIIIII = new String[lIIIIIIIl[32]];
        lIIIIIIII[lIIIIIIIl[0]] = llIlIlIIIll("cx3W3fbgtbf+WhTdVo6lqA==", "CeABw");
        lIIIIIIII[lIIIIIIIl[1]] = llIlIlIIlII("12nVi0lzRG8YTltmDX5EkoRzfkvpZX/hepBkt7oTXWqF+V3QZaWycYv+/RhziPAi", "wodxa");
        lIIIIIIII[lIIIIIIIl[4]] = llIlIlIIIll("j2MY8G05JwJHbJFENGHbSA==", "KHLaS");
        lIIIIIIII[lIIIIIIIl[5]] = llIlIlIIlII("DXawK9v8H/hngYNYXrdBNi9bzu5ayldD", "BHTxW");
        lIIIIIIII[lIIIIIIIl[2]] = llIlIlIIlII("2eczoPLDvT0Cd5i29hqm3wRgrSJQS7wbPhn8vH1I2siaj3WwilHT9TGEU2hEFax3EH8AmdNXdJo=", "VIWKe");
        lIIIIIIII[lIIIIIIIl[11]] = llIlIlIIlIl("FzkicQc2eCclEiss", "YXTQs");
        lIIIIIIII[lIIIIIIIl[12]] = llIlIlIIlII("YP02YwpLYGfhh5U6dZ617Q==", "UxAsO");
        lIIIIIIII[lIIIIIIIl[13]] = llIlIlIIlII("5SwK1HcR1rM=", "PnsfY");
        lIIIIIIII[lIIIIIIIl[22]] = llIlIlIIlII("LKVVgvXDTcqK27RgfihqWlP+uhFIknbc", "JvqTM");
        lIIIIIIII[lIIIIIIIl[23]] = llIlIlIIlIl("NioHNEwrJUkkCSUvHTtMbA==", "DCiSl");
        lIIIIIIII[lIIIIIIIl[14]] = llIlIlIIlII("vBh6xjhTtm69WR1lBECivqIH+qZBYHVN", "bjMop");
        lIIIIIIII[lIIIIIIIl[26]] = llIlIlIIlII("ofMPwgs73XCwK7IzVIDD5i9nWVonGzVCsepaNuQJTj4emzpWu5m/Tne79QAY5kpl", "KbhhL");
        lIIIIIIII[lIIIIIIIl[27]] = llIlIlIIlII("1kgf0NnChnPTf1aNJ404//5LN9vKhN2GYtDD494+KN2NXUMyjKT9TsCIkpxxHASD", "zAOYi");
        lIIIIIIII[lIIIIIIIl[28]] = llIlIlIIlII("ez0FmBVyGNI=", "CtbGo");
        lIIIIIIII[lIIIIIIIl[29]] = llIlIlIIlIl("Lh0WDGIKVQAKKhcSSA==", "yuwxE");
    }

    private static boolean llIlIlIlllI(int i, int i2) {
        return i <= i2;
    }

    private static String llIlIlIIIll(String lIIlIllIllIlIII, String lIIlIllIllIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIllIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIllIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIllIllIlIIl) {
            lIIlIllIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static String llIlIlIIlII(String lIIlIllIlIIIIll, String lIIlIllIlIIIIII) {
        try {
            SecretKeySpec lIIlIllIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIllIlIIIIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIIl[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIl[4], lIIlIllIlIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIllIlIIIlII) {
            lIIlIllIlIIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ac() {
        int[] iArr = new int[lIIIIIIIl[1]];
        iArr[lIIIIIIIl[0]] = lIIIIIIIl[7];
        if (llIlIlIllIl(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIIIIIIl[1]];
            iArr2[lIIIIIIIl[0]] = lIIIIIIIl[9];
            if (llIlIlIllIl(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIIIIIIl[1]];
                iArr3[lIIIIIIIl[0]] = lIIIIIIIl[8];
                if (llIlIlIllIl(Inventory.getCount(iArr3))) {
                    ?? r0 = lIIIIIIIl[1];
                    "".length();
                    return "  ".length() <= (-" ".length()) ? ((182 ^ 134) ^ (((118 + 110) - 140) + 39)) & (((((39 + 181) - 207) + 217) ^ (((109 + 121) - 85) + 24)) ^ (-" ".length())) & ((((140 ^ 169) ^ (116 ^ 20)) & (((220 ^ 136) ^ (132 ^ 149)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIIIIIIl[0];
    }

    private static void llIlIlIIlll() {
        lIIIIIIIl = new int[33];
        lIIIIIIIl[0] = (96 ^ 41) & ((22 ^ 95) ^ (-1));
        lIIIIIIIl[1] = " ".length();
        lIIIIIIIl[2] = 166 ^ 162;
        lIIIIIIIl[3] = 139 ^ 150;
        lIIIIIIIl[4] = "  ".length();
        lIIIIIIIl[5] = "   ".length();
        lIIIIIIIl[6] = (-((-27) & 27707)) & (-81) & 32760;
        lIIIIIIIl[7] = (-((-11003) & 31483)) & (-3) & 22415;
        lIIIIIIIl[8] = (-((-19875) & 23974)) & (-16417) & 22459;
        lIIIIIIIl[9] = (-18441) & 20367;
        lIIIIIIIl[10] = (-16422) & 24429;
        lIIIIIIIl[11] = (((124 + 135) - 123) + 21) ^ (((2 + 148) - 41) + 43);
        lIIIIIIIl[12] = (157 ^ 174) ^ (83 ^ 102);
        lIIIIIIIl[13] = 79 ^ 72;
        lIIIIIIIl[14] = (47 ^ 90) ^ (((90 + 18) - 69) + 88);
        lIIIIIIIl[15] = (-6188) & 8187;
        lIIIIIIIl[16] = (-4147) & 16126;
        lIIIIIIIl[17] = (-((-11665) & 16343)) & (-3074) & 32751;
        lIIIIIIIl[18] = (-8329) & 16335;
        lIIIIIIIl[19] = 110 ^ 70;
        lIIIIIIIl[20] = (-((-1827) & 10035)) & (-22659) & 32766;
        lIIIIIIIl[21] = 249 ^ 157;
        lIIIIIIIl[22] = 95 ^ 87;
        lIIIIIIIl[23] = 172 ^ 165;
        lIIIIIIIl[24] = (-305) & 3511;
        lIIIIIIIl[25] = (-((-1158) & 14071)) & (-257) & 16383;
        lIIIIIIIl[26] = 100 ^ 111;
        lIIIIIIIl[27] = 44 ^ 32;
        lIIIIIIIl[28] = (195 ^ 134) ^ (199 ^ 143);
        lIIIIIIIl[29] = (241 ^ 168) ^ (19 ^ 68);
        lIIIIIIIl[30] = (-((-16459) & 20843)) & (-599) & 8191;
        lIIIIIIIl[31] = (-((-16421) & 29037)) & (-16421) & 32255;
        lIIIIIIIl[32] = 86 ^ 89;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lIIIIIIIl[0];
    }

    private static boolean llIlIlIllIl(int i) {
        return i > 0;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            bD();
            "".length();
            if (((92 ^ 72) ^ (131 ^ 147)) < (((((80 + 89) - 140) + 142) ^ (((39 + 112) - 138) + 176)) & (((104 ^ 60) ^ (61 ^ 127)) ^ (-" ".length())))) {
                return ((209 ^ 147) ^ (69 ^ 34)) & (((136 ^ 152) ^ (120 ^ 77)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIIIIIIl[21];
    }

    private static boolean llIlIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIlIlIIlIl(String lIIlIllIlIllIII, String lIIlIllIlIlIlll) {
        String str = new String(Base64.getDecoder().decode(lIIlIllIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIlIllIlIlIlll.toCharArray();
        int lIIlIllIlIlIlII = lIIIIIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIIl[0];
        while (llIlIlIlIIl(i, length)) {
            char lIIlIllIlIllIIl = charArray2[i];
            sb.append((char) (lIIlIllIlIllIIl ^ charArray[lIIlIllIlIlIlII % charArray.length]));
            "".length();
            lIIlIllIlIlIlII++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIlIlIll(int i, int i2) {
        return i > i2;
    }
}
