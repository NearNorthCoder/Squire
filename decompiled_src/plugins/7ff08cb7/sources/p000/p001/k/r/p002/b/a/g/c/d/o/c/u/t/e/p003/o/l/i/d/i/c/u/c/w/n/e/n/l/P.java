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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.P  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/P.class */
public class P implements ab {
    public static final /* synthetic */ int kH;
    public static /* synthetic */ WorldPoint kK;
    public static final /* synthetic */ int kF;
    private static /* synthetic */ String[] lIIIIIllII;
    private static /* synthetic */ int[] lIIIIIllIl;
    private static final /* synthetic */ String[] kJ;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ int dk;
    static /* synthetic */ int cI;
    public static /* synthetic */ List<C0003d> bx;
    public static final /* synthetic */ int kG;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint kI;

    private static boolean llIllllIIlll(int i, int i2) {
        return i < i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            cM();
            "".length();
            if ("  ".length() > "   ".length()) {
                return (57 ^ 9) & ((65 ^ 113) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIIIIllIl[21];
    }

    private static boolean llIllllIlIII(int i) {
        return i == 0;
    }

    private static boolean llIllllIIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lIIIIIllIl[1]];
        iArr[lIIIIIllIl[0]] = lIIIIIllIl[7];
        if (llIllllIlIll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIIIIllIl[1]];
            iArr2[lIIIIIllIl[0]] = lIIIIIllIl[9];
            if (llIllllIlIll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIIIIllIl[1]];
                iArr3[lIIIIIllIl[0]] = lIIIIIllIl[8];
                if (llIllllIlIll(Inventory.getCount(iArr3))) {
                    ?? r0 = lIIIIIllIl[1];
                    "".length();
                    return ((120 ^ 65) & ((252 ^ 197) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIIIIllIl[0];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIIllII[lIIIIIllIl[22]];
    }

    private static boolean llIllllIllII(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIllllIlIlI(Object obj) {
        return obj != null;
    }

    private static String llIllllIIIIl(String lIIIIIIlIllll, String lIIIIIIlIlllI) {
        try {
            SecretKeySpec lIIIIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIllIl[4], lIIIIIIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIIllIIII) {
            lIIIIIIllIIII.printStackTrace();
            return null;
        }
    }

    static {
        llIllllIIlIl();
        llIllllIIlII();
        kF = lIIIIIllIl[9];
        kG = lIIIIIllIl[8];
        kH = lIIIIIllIl[7];
        kI = new WorldPoint(lIIIIIllIl[24], lIIIIIllIl[25], lIIIIIllIl[0]);
        String[] strArr = new String[lIIIIIllIl[11]];
        strArr[lIIIIIllIl[0]] = lIIIIIllII[lIIIIIllIl[14]];
        strArr[lIIIIIllIl[1]] = lIIIIIllII[lIIIIIllIl[26]];
        strArr[lIIIIIllIl[4]] = lIIIIIllII[lIIIIIllIl[27]];
        strArr[lIIIIIllIl[5]] = lIIIIIllII[lIIIIIllIl[28]];
        strArr[lIIIIIllIl[2]] = lIIIIIllII[lIIIIIllIl[29]];
        kJ = strArr;
        kK = new WorldPoint(lIIIIIllIl[30], lIIIIIllIl[31], lIIIIIllIl[4]);
        bx = new ArrayList();
        cI = lIIIIIllIl[0];
    }

    private static String llIllllIIIlI(String lIIIIIlIIIlII, String lIIIIIlIIIIll) {
        String str = new String(Base64.getDecoder().decode(lIIIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIIlIIIIlI = new StringBuilder();
        char[] lIIIIIlIIIIIl = lIIIIIlIIIIll.toCharArray();
        int lIIIIIlIIIIII = lIIIIIllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIIIllIl[0];
        while (llIllllIIlll(i, length)) {
            lIIIIIlIIIIlI.append((char) (charArray[i] ^ lIIIIIlIIIIIl[lIIIIIlIIIIII % lIIIIIlIIIIIl.length]));
            "".length();
            lIIIIIlIIIIII++;
            i++;
            "".length();
            if ((-((124 ^ 103) ^ (27 ^ 4))) >= 0) {
                return null;
            }
        }
        return String.valueOf(lIIIIIlIIIIlI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIIllIl[0];
    }

    private static boolean llIllllIlIIl(int i, int i2) {
        return i > i2;
    }

    private static void Q() {
        int[] iArr = new int[lIIIIIllIl[1]];
        iArr[lIIIIIllIl[0]] = lIIIIIllIl[9];
        if (llIllllIlIII(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllIl[9], lIIIIIllIl[1], lIIIIIllIl[6]));
            "".length();
        }
        int[] iArr2 = new int[lIIIIIllIl[1]];
        iArr2[lIIIIIllIl[0]] = lIIIIIllIl[8];
        if (llIllllIlIII(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllIl[8], lIIIIIllIl[1], lIIIIIllIl[6]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIIllIl[1]];
        iArr3[lIIIIIllIl[0]] = lIIIIIllIl[7];
        if (llIllllIlIII(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllIl[7], lIIIIIllIl[1], lIIIIIllIl[6]));
            "".length();
        }
        int[] iArr4 = new int[lIIIIIllIl[1]];
        iArr4[lIIIIIllIl[0]] = lIIIIIllIl[10];
        if (llIllllIlIII(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllIl[10], lIIIIIllIl[14], lIIIIIllIl[15]));
            "".length();
        }
        if (llIllllIlIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIIllII[lIIIIIllIl[23]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllIl[16], lIIIIIllIl[11], lIIIIIllIl[17]));
            "".length();
        }
        int[] iArr5 = new int[lIIIIIllIl[1]];
        iArr5[lIIIIIllIl[0]] = lIIIIIllIl[18];
        if (llIllllIlIII(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllIl[18], lIIIIIllIl[19], lIIIIIllIl[20]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static void cM() {
        if (llIllllIIllI(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[0]];
            C0001b.a(bx);
            if (llIllllIIlll(bx.size(), lIIIIIllIl[1])) {
                System.out.println(lIIIIIllII[lIIIIIllIl[1]]);
                bv = lIIIIIllIl[0];
            }
        }
        if (llIllllIlIII(bv ? 1 : 0)) {
            if (llIllllIlIII(an() ? 1 : 0) && llIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(kI), lIIIIIllIl[2]) && llIllllIIlll(C0004e.j(lIIIIIllIl[3]), lIIIIIllIl[4])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIllllIlIlI(nearest) && llIllllIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[4]];
                    C0000a.a(nearest);
                }
                if (llIllllIlIlI(nearest) && llIllllIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[5]];
                    if (llIllllIlIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIllIl[6]);
                        "".length();
                    }
                    if (llIllllIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (llIllllIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIllIl[2]);
                            "".length();
                        }
                        if (llIllllIlIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIllIl[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIIllIl[2]];
                        iArr[lIIIIIllIl[0]] = lIIIIIllIl[7];
                        iArr[lIIIIIllIl[1]] = lIIIIIllIl[8];
                        iArr[lIIIIIllIl[4]] = lIIIIIllIl[9];
                        iArr[lIIIIIllIl[5]] = lIIIIIllIl[10];
                        if (llIllllIlIII(C0004e.d(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIIllII[lIIIIIllIl[2]]);
                            bv = lIIIIIllIl[1];
                            return;
                        }
                        if (llIllllIIllI(AccBuilderGWD.e ? 1 : 0)) {
                            C0000a.b(C0005f.bm, lIIIIIllIl[1]);
                        }
                        int[] iArr2 = new int[lIIIIIllIl[2]];
                        iArr2[lIIIIIllIl[0]] = lIIIIIllIl[7];
                        iArr2[lIIIIIllIl[1]] = lIIIIIllIl[8];
                        iArr2[lIIIIIllIl[4]] = lIIIIIllIl[9];
                        iArr2[lIIIIIllIl[5]] = lIIIIIllIl[10];
                        if (llIllllIIllI(C0004e.d(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIIIIIllIl[2]];
                            iArr3[lIIIIIllIl[0]] = lIIIIIllIl[7];
                            iArr3[lIIIIIllIl[1]] = lIIIIIllIl[8];
                            iArr3[lIIIIIllIl[4]] = lIIIIIllIl[9];
                            iArr3[lIIIIIllIl[5]] = lIIIIIllIl[10];
                            C0000a.a(iArr3);
                        }
                    }
                }
            }
            if ((!llIllllIlIII(an() ? 1 : 0) || llIllllIllII(Players.getLocal().getWorldLocation().distanceTo(kI), lIIIIIllIl[2])) && llIllllIIlll(C0004e.j(lIIIIIllIl[3]), lIIIIIllIl[4])) {
                AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[11]];
                if (llIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(kI), lIIIIIllIl[5])) {
                    dk = lIIIIIllIl[0];
                    Movement.walkTo(kI);
                    "".length();
                }
                if (llIllllIllII(Players.getLocal().getWorldLocation().distanceTo(kI), lIIIIIllIl[5])) {
                    if (llIllllIIlll(dk, lIIIIIllIl[1])) {
                        as.qb += lIIIIIllIl[1];
                        as.u(AccBuilderGWD.m);
                        dk += lIIIIIllIl[1];
                        as.qb = lIIIIIllIl[0];
                        dl = lIIIIIllIl[0];
                    }
                    AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[12]];
                    if (llIllllIIlll(cI, lIIIIIllIl[1])) {
                        C0004e.x();
                        cI += lIIIIIllIl[1];
                    }
                    C0006g.a(lIIIIIllII[lIIIIIllIl[13]], kJ);
                }
            }
            C0006g.a(new String[lIIIIIllIl[0]]);
        }
    }

    private static void llIllllIIlII() {
        lIIIIIllII = new String[lIIIIIllIl[32]];
        lIIIIIllII[lIIIIIllIl[0]] = llIllllIIIIl("z0a2gOgpWyFN/gZ2eDn74A==", "bfMNL");
        lIIIIIllII[lIIIIIllIl[1]] = llIllllIIIlI("BzMHCz0pPw1CLDQjAAwpYTMdByMydkkROSguCgonLz1JAC8iMUkWIWErHAc9NQ==", "AZibN");
        lIIIIIllII[lIIIIIllIl[4]] = llIllllIIIlI("BA0PBS09C0MaK3MOAgAv", "SlcnD");
        lIIIIIllII[lIIIIIllIl[5]] = llIllllIIIIl("8LI/PBg0N9divrzIrXb+O5ojdGhi+vwv", "OaIJw");
        lIIIIIllII[lIIIIIllIl[2]] = llIllllIIIlI("LyFxCCUdZDwAJAstPw53CTE0GiNYNyQZJxQtNBp7WDcmACMbLDgHMFgwPkkVLR0YJxA=", "xDQiW");
        lIIIIIllII[lIIIIIllIl[11]] = llIllllIIIlI("BCo0WC4lazEMOzg/", "JKBxZ");
        lIIIIIllII[lIIIIIllIl[12]] = llIllllIIIIl("93TQLirDH+EO6el+RkaSxA==", "MaVFB");
        lIIIIIllII[lIIIIIllIl[13]] = llIllllIIIIl("FtkhvpRzg7U=", "QeSXx");
        lIIIIIllII[lIIIIIllIl[22]] = llIllllIIIll("LWmywxFWfkXxApP4JJzI+ArMNsiYgcar", "tRjfD");
        lIIIIIllII[lIIIIIllIl[23]] = llIllllIIIlI("MyMpE1EuLGcDFCAmMxxRaQ==", "AJGtq");
        lIIIIIllII[lIIIIIllIl[14]] = llIllllIIIlI("GgsZayg2H1cmMDIPVyY0eQtXKDAyD0g=", "YjwKQ");
        lIIIIIllII[lIIIIIllIl[26]] = llIllllIIIlI("Lkoldg0LGikvH0cFKSYcHk08OUwPCCQmTAZNKzkDDE0hOEwDBDsiHgIeO3g=", "gmHVl");
        lIIIIIllII[lIIIIIllIl[27]] = llIllllIIIIl("2I8UycjZQ9ot062ZRtTtrqfpCdkj85co05h0dJjyE/qsRHDS4lL73wo/3LTxKK6G", "LtVbL");
        lIIIIIllII[lIIIIIllIl[28]] = llIllllIIIll("Qb7q9Bj/XW8=", "Pjjcb");
        lIIIIIllII[lIIIIIllIl[29]] = llIllllIIIlI("Dz0SGUordQQfAjYyTA==", "XUsmm");
    }

    private static String llIllllIIIll(String lIIIIIlIlIlII, String lIIIIIlIlIIll) {
        try {
            SecretKeySpec lIIIIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIllIl[22]), "DES");
            Cipher lIIIIIlIlIllI = Cipher.getInstance("DES");
            lIIIIIlIlIllI.init(lIIIIIllIl[4], lIIIIIlIlIlll);
            return new String(lIIIIIlIlIllI.doFinal(Base64.getDecoder().decode(lIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIlIlIlIl) {
            lIIIIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllIlIll(int i) {
        return i > 0;
    }

    private static boolean llIllllIllIl(int i, int i2) {
        return i >= i2;
    }

    private static void llIllllIIlIl() {
        lIIIIIllIl = new int[33];
        lIIIIIllIl[0] = ((((133 + 127) - 255) + 144) ^ (((15 + 75) - (-6)) + 57)) & (((((26 + 21) - (-42)) + 68) ^ (((61 + 115) - 88) + 57)) ^ (-" ".length()));
        lIIIIIllIl[1] = " ".length();
        lIIIIIllIl[2] = (((22 + 174) - 19) + 17) ^ (((164 + 188) - 177) + 23);
        lIIIIIllIl[3] = 31 ^ 2;
        lIIIIIllIl[4] = "  ".length();
        lIIIIIllIl[5] = "   ".length();
        lIIIIIllIl[6] = (-11334) & 16333;
        lIIIIIllIl[7] = (-((-4555) & 29179)) & (-1) & 26557;
        lIIIIIllIl[8] = (-((-10001) & 32534)) & (-8289) & 32765;
        lIIIIIllIl[9] = (-65) & 1991;
        lIIIIIllIl[10] = (-8357) & 16364;
        lIIIIIllIl[11] = (109 ^ 96) ^ (16 ^ 24);
        lIIIIIllIl[12] = 60 ^ 58;
        lIIIIIllIl[13] = 1 ^ 6;
        lIIIIIllIl[14] = (216 ^ 149) ^ (2 ^ 69);
        lIIIIIllIl[15] = (-((-337) & 31062)) & (-33) & 32757;
        lIIIIIllIl[16] = (-((-20489) & 20763)) & (-33) & 12286;
        lIIIIIllIl[17] = (-((-6901) & 7926)) & (-4115) & 30139;
        lIIIIIllIl[18] = (-16401) & 24407;
        lIIIIIllIl[19] = 121 ^ 81;
        lIIIIIllIl[20] = (-((-645) & 12934)) & (-131) & 14319;
        lIIIIIllIl[21] = (204 ^ 142) ^ (33 ^ 7);
        lIIIIIllIl[22] = (29 ^ 23) ^ "  ".length();
        lIIIIIllIl[23] = (235 ^ 154) ^ (235 ^ 147);
        lIIIIIllIl[24] = (-21097) & 24303;
        lIIIIIllIl[25] = (-((-5150) & 30559)) & (-33) & 28655;
        lIIIIIllIl[26] = 9 ^ 2;
        lIIIIIllIl[27] = (227 ^ 136) ^ (236 ^ 139);
        lIIIIIllIl[28] = (128 ^ 134) ^ (46 ^ 37);
        lIIIIIllIl[29] = 118 ^ 120;
        lIIIIIllIl[30] = (-21303) & 24511;
        lIIIIIllIl[31] = (-9033) & 12251;
        lIIIIIllIl[32] = (187 ^ 181) ^ " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIllllIllIl(C0004e.j(lIIIIIllIl[3]), lIIIIIllIl[4])) {
            ?? r0 = lIIIIIllIl[1];
            "".length();
            return !((true ^ true) ^ (true ^ true)) ? ((31 ^ 72) ^ (194 ^ 138)) & (((((135 + 144) - 119) + 2) ^ (((57 + 47) - 11) + 96)) ^ (-" ".length())) : r0;
        }
        return lIIIIIllIl[0];
    }
}
