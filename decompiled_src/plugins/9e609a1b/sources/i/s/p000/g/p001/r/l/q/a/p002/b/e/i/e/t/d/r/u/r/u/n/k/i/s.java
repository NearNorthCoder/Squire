package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.s  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/s.class */
public class s implements M {
    private static /* synthetic */ int[] lIIIlllIIlllI;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ int fp;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ WorldPoint fu;
    private static /* synthetic */ String[] lIIIlllIIllII;
    public static /* synthetic */ List<C0003d> bA;
    static /* synthetic */ int co;
    private static final /* synthetic */ String[] ft;
    public static final /* synthetic */ int fr;
    public static final /* synthetic */ int fq;
    public static final /* synthetic */ WorldPoint fs;
    static /* synthetic */ int bY;

    private static boolean lIlIIlIIIIlIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIIIIlIIll(int i2, int i3) {
        return i2 >= i3;
    }

    private static void lIlIIlIIIIIlIlI() {
        lIIIlllIIllII = new String[lIIIlllIIlllI[32]];
        lIIIlllIIllII[lIIIlllIIlllI[0]] = lIlIIlIIIIIIlII("vh9JzT/x7Ju8h+Ipvi3bYA==", "eFOgc");
        lIIIlllIIllII[lIIIlllIIlllI[1]] = lIlIIlIIIIIIlIl("ESo4GRw/JjJQDSI6Px4IdyoiFQIkb3YDGD43NRgGOSR2Eg40KHYEAHcyIxUcIw==", "WCVpo");
        lIIIlllIIllII[lIIIlllIIlllI[4]] = lIlIIlIIIIIIllI("xKhEAEoZ9oiTS2nsK8KXcA==", "HwLJM");
        lIIIlllIIllII[lIIIlllIIlllI[5]] = lIlIIlIIIIIIllI("/v25EHCfJSftpzEImYkCnRzauWKz0abx", "NanBf");
        lIIIlllIIllII[lIIIlllIIlllI[2]] = lIlIIlIIIIIIlII("yXM+8fLl1A61z6PvzCHBzHVd+W5i7rBlQGCnycOhB8FblA3rBFHL1QrAVPqHsCnGOVfEOQXKuYg=", "osEXQ");
        lIIIlllIIllII[lIIIlllIIlllI[11]] = lIlIIlIIIIIIllI("Sr/krelXF72u7nrp46p2QA==", "KOpof");
        lIIIlllIIllII[lIIIlllIIlllI[12]] = lIlIIlIIIIIIlIl("BTMFDCUkPAxILSQzBwcu", "MRkhI");
        lIIIlllIIllII[lIIIlllIIlllI[13]] = lIlIIlIIIIIIlIl("CT8jOg==", "JPLQo");
        lIIIlllIIllII[lIIIlllIIlllI[22]] = lIlIIlIIIIIIllI("4ROcWseeAuITRgOJW1b6UOQ4+CmeXGJV", "tcfMy");
        lIIIlllIIllII[lIIIlllIIlllI[23]] = lIlIIlIIIIIIlII("+lp9KIm6qTLbSF2m4sHRGZkKap4MJaD1", "gwlDg");
        lIIIlllIIllII[lIIIlllIIlllI[14]] = lIlIIlIIIIIIlII("P2m4iRK8oXHEjbdpjK1EY1iOAiqMXpK2", "jNDDC");
        lIIIlllIIllII[lIIIlllIIlllI[26]] = lIlIIlIIIIIIllI("pCXzoER504M1POL8dRBd7Hk9Mx4xQTHSk6hsoEdsG9AVrYPPLW9wpBRgh4bDh81E", "dVAxq");
        lIIIlllIIllII[lIIIlllIIlllI[27]] = lIlIIlIIIIIIllI("4R16LrXhL4hfRVSTGxqMHHu3eA0uK+T6apqFGIagFsUI7iIdlDf8XEkzr95ALucq", "XrskW");
        lIIIlllIIllII[lIIIlllIIlllI[28]] = lIlIIlIIIIIIlII("AUhSZijAs3k=", "rrWlT");
        lIIIlllIIllII[lIIIlllIIlllI[29]] = lIlIIlIIIIIIllI("MiY0VNDTXLUnC6gcpOuRCg==", "taGfF");
    }

    private static String lIlIIlIIIIIIlII(String lllllllllllllllIIIIIllIIIIlIIlIl, String lllllllllllllllIIIIIllIIIIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIIIlllIIlllI[22]), "DES");
            Cipher lllllllllllllllIIIIIllIIIIlIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIIIIllIIIIlIIlll.init(lIIIlllIIlllI[4], secretKeySpec);
            return new String(lllllllllllllllIIIIIllIIIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIIIIlIIllI) {
            lllllllllllllllIIIIIllIIIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIIIIIlIll() {
        lIIIlllIIlllI = new int[33];
        lIIIlllIIlllI[0] = (139 ^ 140) & ((139 ^ 140) ^ (-1));
        lIIIlllIIlllI[1] = " ".length();
        lIIIlllIIlllI[2] = (113 ^ 70) ^ (18 ^ 33);
        lIIIlllIIlllI[3] = 21 ^ 8;
        lIIIlllIIlllI[4] = "  ".length();
        lIIIlllIIlllI[5] = "   ".length();
        lIIIlllIIlllI[6] = (-((-16906) & 26205)) & (-18437) & 32735;
        lIIIlllIIlllI[7] = (-((-13959) & 16087)) & (-3) & 4063;
        lIIIlllIIlllI[8] = (-6149) & 8092;
        lIIIlllIIlllI[9] = (-((-26895) & 31087)) & (-24585) & 30703;
        lIIIlllIIlllI[10] = (-8210) & 16217;
        lIIIlllIIlllI[11] = (125 ^ 61) ^ (35 ^ 102);
        lIIIlllIIlllI[12] = 50 ^ 52;
        lIIIlllIIlllI[13] = (((169 + 125) - 156) + 58) ^ (((49 + 127) - (-10)) + 9);
        lIIIlllIIlllI[14] = (126 ^ 35) ^ (221 ^ 138);
        lIIIlllIIlllI[15] = (-((-354) & 29039)) & (-2083) & 32767;
        lIIIlllIIlllI[16] = (-20483) & 32462;
        lIIIlllIIlllI[17] = (-((-2470) & 2983)) & (-4183) & 29695;
        lIIIlllIIlllI[18] = (-16513) & 24519;
        lIIIlllIIlllI[19] = 63 ^ 23;
        lIIIlllIIlllI[20] = (-((-1218) & 21715)) & (-129) & 22525;
        lIIIlllIIlllI[21] = (((58 + 7) - 48) + 184) ^ (((8 + 101) - 58) + 122);
        lIIIlllIIlllI[22] = 20 ^ 28;
        lIIIlllIIlllI[23] = 75 ^ 66;
        lIIIlllIIlllI[24] = (-((-1071) & 5999)) & (-16393) & 24527;
        lIIIlllIIlllI[25] = (-13073) & 16286;
        lIIIlllIIlllI[26] = 58 ^ 49;
        lIIIlllIIlllI[27] = (96 ^ 57) ^ (57 ^ 108);
        lIIIlllIIlllI[28] = 90 ^ 87;
        lIIIlllIIlllI[29] = (((68 + 97) - 87) + 54) ^ (((17 + 39) - 12) + 94);
        lIIIlllIIlllI[30] = (-21271) & 24479;
        lIIIlllIIlllI[31] = (-297) & 3515;
        lIIIlllIIlllI[32] = 64 ^ 79;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllIIlllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIIIIlIIll(C0004e.j(lIIIlllIIlllI[3]), lIIIlllIIlllI[4])) {
            ?? r0 = lIIIlllIIlllI[1];
            "".length();
            return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlllIIlllI[0];
    }

    static {
        lIlIIlIIIIIlIll();
        lIlIIlIIIIIlIlI();
        fp = lIIIlllIIlllI[9];
        fr = lIIIlllIIlllI[7];
        fq = lIIIlllIIlllI[8];
        fs = new WorldPoint(lIIIlllIIlllI[24], lIIIlllIIlllI[25], lIIIlllIIlllI[0]);
        String[] strArr = new String[lIIIlllIIlllI[11]];
        strArr[lIIIlllIIlllI[0]] = lIIIlllIIllII[lIIIlllIIlllI[14]];
        strArr[lIIIlllIIlllI[1]] = lIIIlllIIllII[lIIIlllIIlllI[26]];
        strArr[lIIIlllIIlllI[4]] = lIIIlllIIllII[lIIIlllIIlllI[27]];
        strArr[lIIIlllIIlllI[5]] = lIIIlllIIllII[lIIIlllIIlllI[28]];
        strArr[lIIIlllIIlllI[2]] = lIIIlllIIllII[lIIIlllIIlllI[29]];
        ft = strArr;
        fu = new WorldPoint(lIIIlllIIlllI[30], lIIIlllIIlllI[31], lIIIlllIIlllI[4]);
        bA = new ArrayList();
        bY = lIIIlllIIlllI[0];
    }

    private static boolean lIlIIlIIIIIllll(int i2, int i3) {
        return i2 > i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            be();
            "".length();
            if ("   ".length() <= 0) {
                return ((((113 + 203) - 169) + 94) ^ (((94 + 164) - 233) + 154)) & (((105 ^ 89) ^ (235 ^ 153)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIIlllIIlllI[21];
    }

    private static String lIlIIlIIIIIIlIl(String lllllllllllllllIIIIIllIIIIIlIlIl, String lllllllllllllllIIIIIllIIIIIlIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIllIIIIIlIIll = new StringBuilder();
        char[] lllllllllllllllIIIIIllIIIIIlIIlI = lllllllllllllllIIIIIllIIIIIlIlII.toCharArray();
        int lllllllllllllllIIIIIllIIIIIlIIIl = lIIIlllIIlllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIIIlllIIlllI[0];
        while (lIlIIlIIIIIllIl(i2, length)) {
            lllllllllllllllIIIIIllIIIIIlIIll.append((char) (charArray[i2] ^ lllllllllllllllIIIIIllIIIIIlIIlI[lllllllllllllllIIIIIllIIIIIlIIIl % lllllllllllllllIIIIIllIIIIIlIIlI.length]));
            "".length();
            lllllllllllllllIIIIIllIIIIIlIIIl++;
            i2++;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIllIIIIIlIIll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static void be() {
        if (lIlIIlIIIIIllII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[0]];
            C0001b.a(bA);
            if (lIlIIlIIIIIllIl(bA.size(), lIIIlllIIlllI[1])) {
                System.out.println(lIIIlllIIllII[lIIIlllIIlllI[1]]);
                by = lIIIlllIIlllI[0];
            }
        }
        if (lIlIIlIIIIIlllI(by ? 1 : 0)) {
            if (lIlIIlIIIIIlllI(S() ? 1 : 0) && lIlIIlIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[2]) && lIlIIlIIIIIllIl(C0004e.j(lIIIlllIIlllI[3]), lIIIlllIIlllI[4])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIIIIlIIII(nearest) && lIlIIlIIIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[4]];
                    C0000a.a(nearest);
                }
                if (lIlIIlIIIIlIIII(nearest) && lIlIIlIIIIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[5]];
                    if (lIlIIlIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllIIlllI[6]);
                        "".length();
                    }
                    if (lIlIIlIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIIIIlIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllIIlllI[2]);
                            "".length();
                        }
                        if (lIlIIlIIIIlIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllIIlllI[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlllIIlllI[2]];
                        iArr[lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
                        iArr[lIIIlllIIlllI[1]] = lIIIlllIIlllI[8];
                        iArr[lIIIlllIIlllI[4]] = lIIIlllIIlllI[9];
                        iArr[lIIIlllIIlllI[5]] = lIIIlllIIlllI[10];
                        if (lIlIIlIIIIIlllI(C0004e.b(iArr) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllIIllII[lIIIlllIIlllI[2]]);
                            by = lIIIlllIIlllI[1];
                            return;
                        }
                        if (lIlIIlIIIIIllII(AccBuilderRat.e ? 1 : 0)) {
                            C0000a.b(C0005f.bk, lIIIlllIIlllI[1]);
                        }
                        int[] iArr2 = new int[lIIIlllIIlllI[2]];
                        iArr2[lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
                        iArr2[lIIIlllIIlllI[1]] = lIIIlllIIlllI[8];
                        iArr2[lIIIlllIIlllI[4]] = lIIIlllIIlllI[9];
                        iArr2[lIIIlllIIlllI[5]] = lIIIlllIIlllI[10];
                        if (lIlIIlIIIIIllII(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIIIlllIIlllI[2]];
                            iArr3[lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
                            iArr3[lIIIlllIIlllI[1]] = lIIIlllIIlllI[8];
                            iArr3[lIIIlllIIlllI[4]] = lIIIlllIIlllI[9];
                            iArr3[lIIIlllIIlllI[5]] = lIIIlllIIlllI[10];
                            C0000a.a(iArr3);
                        }
                    }
                }
            }
            if ((!lIlIIlIIIIIlllI(S() ? 1 : 0) || lIlIIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[2])) && lIlIIlIIIIIllIl(C0004e.j(lIIIlllIIlllI[3]), lIIIlllIIlllI[4])) {
                AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[11]];
                if (lIlIIlIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[5])) {
                    co = lIIIlllIIlllI[0];
                    Movement.walkTo(fs);
                    "".length();
                }
                if (lIlIIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[5])) {
                    if (lIlIIlIIIIIllIl(co, lIIIlllIIlllI[1])) {
                        P.lD += lIIIlllIIlllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllIIlllI[1];
                        P.lD = lIIIlllIIlllI[0];
                        cp = lIIIlllIIlllI[0];
                    }
                    AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[12]];
                    if (lIlIIlIIIIIllIl(bY, lIIIlllIIlllI[1])) {
                        C0004e.w();
                        bY += lIIIlllIIlllI[1];
                    }
                    C0006g.a(lIIIlllIIllII[lIIIlllIIlllI[13]], ft);
                }
            }
            C0006g.a(new String[lIIIlllIIlllI[0]]);
        }
    }

    private static boolean lIlIIlIIIIlIIIl(int i2) {
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIlllIIlllI[1]];
        iArr[lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
        if (lIlIIlIIIIlIIIl(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIIlllIIlllI[1]];
            iArr2[lIIIlllIIlllI[0]] = lIIIlllIIlllI[9];
            if (lIlIIlIIIIlIIIl(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIIlllIIlllI[1]];
                iArr3[lIIIlllIIlllI[0]] = lIIIlllIIlllI[8];
                if (lIlIIlIIIIlIIIl(Inventory.getCount(iArr3))) {
                    ?? r0 = lIIIlllIIlllI[1];
                    "".length();
                    return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                }
            }
        }
        return lIIIlllIIlllI[0];
    }

    private static boolean lIlIIlIIIIIllII(int i2) {
        return i2 != 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIIllII[lIIIlllIIlllI[22]];
    }

    private static void W() {
        int[] iArr = new int[lIIIlllIIlllI[1]];
        iArr[lIIIlllIIlllI[0]] = lIIIlllIIlllI[9];
        if (lIlIIlIIIIIlllI(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIIlllI[9], lIIIlllIIlllI[1], lIIIlllIIlllI[6]));
            "".length();
        }
        int[] iArr2 = new int[lIIIlllIIlllI[1]];
        iArr2[lIIIlllIIlllI[0]] = lIIIlllIIlllI[8];
        if (lIlIIlIIIIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIIlllI[8], lIIIlllIIlllI[1], lIIIlllIIlllI[6]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlllIIlllI[1]];
        iArr3[lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
        if (lIlIIlIIIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIIlllI[7], lIIIlllIIlllI[1], lIIIlllIIlllI[6]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlllIIlllI[1]];
        iArr4[lIIIlllIIlllI[0]] = lIIIlllIIlllI[10];
        if (lIlIIlIIIIIlllI(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIIlllI[10], lIIIlllIIlllI[14], lIIIlllIIlllI[15]));
            "".length();
        }
        if (lIlIIlIIIIIlllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlllIIllII[lIIIlllIIlllI[23]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIIlllI[16], lIIIlllIIlllI[11], lIIIlllIIlllI[17]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlllIIlllI[1]];
        iArr5[lIIIlllIIlllI[0]] = lIIIlllIIlllI[18];
        if (lIlIIlIIIIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIIlllI[18], lIIIlllIIlllI[19], lIIIlllIIlllI[20]));
            "".length();
        }
    }

    private static boolean lIlIIlIIIIlIIlI(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIlIIIIIllIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIIlIIIIIIllI(String lllllllllllllllIIIIIllIIIIllIIlI, String lllllllllllllllIIIIIllIIIIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlllIIlllI[4], lllllllllllllllIIIIIllIIIIllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIIIIllIIll) {
            lllllllllllllllIIIIIllIIIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIIlllI(int i2) {
        return i2 == 0;
    }
}
