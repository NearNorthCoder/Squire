package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.Q  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/Q.class */
public class Q implements InterfaceC0003ac {
    static /* synthetic */ int di;
    static /* synthetic */ boolean dj;
    public static /* synthetic */ WorldPoint lF;
    static /* synthetic */ int cG;
    public static /* synthetic */ List<C0017d> bv;
    private static final /* synthetic */ String[] lE;
    public static final /* synthetic */ int lB;
    public static final /* synthetic */ WorldPoint lD;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIlIIlIII;
    private static /* synthetic */ String[] llIlIIIlll;
    public static final /* synthetic */ int lA;
    public static final /* synthetic */ int lC;

    private static String lIllIIIlIlIII(String llllllllllllllllllIIlIIlIIIlIlIl, String llllllllllllllllllIIlIIlIIIlIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIIlIIIlIIll = new StringBuilder();
        char[] llllllllllllllllllIIlIIlIIIlIIlI = llllllllllllllllllIIlIIlIIIlIlII.toCharArray();
        int llllllllllllllllllIIlIIlIIIIllII = llIlIIlIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIIlIII[0];
        while (lIllIIIlIllII(i, length)) {
            llllllllllllllllllIIlIIlIIIlIIll.append((char) (charArray[i] ^ llllllllllllllllllIIlIIlIIIlIIlI[llllllllllllllllllIIlIIlIIIIllII % llllllllllllllllllIIlIIlIIIlIIlI.length]));
            "".length();
            llllllllllllllllllIIlIIlIIIIllII++;
            i++;
            "".length();
            if (((((191 + 26) - 105) + 85) ^ (((71 + 138) - 195) + 179)) == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIlIIlIIIlIIll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIIIllIIlI(C0018e.j(llIlIIlIII[3]), llIlIIlIII[4])) {
            ?? r0 = llIlIIlIII[1];
            "".length();
            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIIlIII[0];
    }

    private static boolean lIllIIIllIIII(int i) {
        return i > 0;
    }

    private static boolean lIllIIIlIllll(Object obj) {
        return obj != null;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            ds();
            "".length();
            if ("   ".length() == 0) {
                return ((((5 + 8) - (-144)) + 25) ^ (((100 + 2) - (-9)) + 61)) & (((115 ^ 86) ^ (9 ^ 54)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return llIlIIlIII[21];
    }

    private static void lIllIIIlIlIlI() {
        llIlIIlIII = new int[33];
        llIlIIlIII[0] = ((62 ^ 118) ^ (32 ^ 114)) & (((((38 + 77) - (-1)) + 65) ^ (((46 + 1) - (-110)) + 18)) ^ (-" ".length()));
        llIlIIlIII[1] = " ".length();
        llIlIIlIII[2] = (41 ^ 21) ^ (173 ^ 149);
        llIlIIlIII[3] = 1 ^ 28;
        llIlIIlIII[4] = "  ".length();
        llIlIIlIII[5] = "   ".length();
        llIlIIlIII[6] = (-((-2605) & 11885)) & (-16424) & 30703;
        llIlIIlIII[7] = (-((-5505) & 21985)) & (-17) & 18429;
        llIlIIlIII[8] = (-14433) & 16376;
        llIlIIlIII[9] = (-((-9795) & 11875)) & (-73) & 4079;
        llIlIIlIII[10] = (-8228) & 16235;
        llIlIIlIII[11] = 169 ^ 172;
        llIlIIlIII[12] = 33 ^ 39;
        llIlIIlIII[13] = 195 ^ 196;
        llIlIIlIII[14] = 141 ^ 135;
        llIlIIlIII[15] = (-((-1291) & 32058)) & (-1) & 32767;
        llIlIIlIII[16] = (-16691) & 28670;
        llIlIIlIII[17] = (-1092) & 26091;
        llIlIIlIII[18] = (-8361) & 16367;
        llIlIIlIII[19] = 70 ^ 110;
        llIlIIlIII[20] = (-6274) & 8173;
        llIlIIlIII[21] = 192 ^ 164;
        llIlIIlIII[22] = (119 ^ 60) ^ (100 ^ 39);
        llIlIIlIII[23] = 90 ^ 83;
        llIlIIlIII[24] = (-((-6277) & 22709)) & (-8457) & 28095;
        llIlIIlIII[25] = (-((-17486) & 22351)) & (-8273) & 16351;
        llIlIIlIII[26] = 68 ^ 79;
        llIlIIlIII[27] = (((104 + 15) - 76) + 109) ^ (((102 + 57) - 97) + 86);
        llIlIIlIII[28] = 158 ^ 147;
        llIlIIlIII[29] = (103 ^ 5) ^ (17 ^ 125);
        llIlIIlIII[30] = (-((-9353) & 13965)) & (-24899) & 32719;
        llIlIIlIII[31] = (-((-25793) & 30413)) & (-24929) & 32767;
        llIlIIlIII[32] = (((174 + 81) - 181) + 101) ^ (((18 + 141) - 20) + 21);
    }

    private static void lIllIIIlIlIIl() {
        llIlIIIlll = new String[llIlIIlIII[32]];
        llIlIIIlll[llIlIIlIII[0]] = lIllIIIlIIllI("/+aV9nmMVryJ39Cc/hzMGA==", "XzndD");
        llIlIIIlll[llIlIIlIII[1]] = lIllIIIlIIlll("aVTaAOscdd1XgDvgKr49pv2R6yn1yX4NWkO1LPUHyWrZ5j/UQQlJ1LoBSTlNdJ9X", "ETqXq");
        llIlIIIlll[llIlIIlIII[4]] = lIllIIIlIlIII("EysaIyoqLVY8LGQoFyYo", "DJvHC");
        llIlIIIlll[llIlIIlIII[5]] = lIllIIIlIlIII("Jw0CEhkGAgtWFw4CBx8bCA==", "ollvu");
        llIlIIIlll[llIlIIlIII[2]] = lIllIIIlIlIII("DTJmAiU/dysKJCk+KAR3KyIjECN6JDMTJzY+IxB7eiQxCiM5Py8NMHojKUMVDw4PLRA=", "ZWFcW");
        llIlIIIlll[llIlIIlIII[11]] = lIllIIIlIIllI("0JSb3Y29Mxb+OlZjMKEvgA==", "bcRth");
        llIlIIIlll[llIlIIlIII[12]] = lIllIIIlIIllI("7XiFQt3Wn946+M0FXLKnBw==", "ySuls");
        llIlIIIlll[llIlIIlIII[13]] = lIllIIIlIIlll("KMkCJGC5iBo=", "lPgwg");
        llIlIIIlll[llIlIIlIII[22]] = lIllIIIlIlIII("KzwMOApIEhAgEBsnAj0NSAIWNgoc", "hScSy");
        llIlIIIlll[llIlIIlIII[23]] = lIllIIIlIIlll("9RkGlMGIOM+RV5XT7m+VhqN7kYVW8l5G", "sGAzx");
        llIlIIIlll[llIlIIlIII[14]] = lIllIIIlIIlll("+DtsCn+jUGquKybvf6lkda7aarcQOqm9", "EvrLD");
        llIlIIIlll[llIlIIlIII[26]] = lIllIIIlIIlll("/cPS6LZQ/wWoFHSou7/lmI56Fncgqe+NZglWiX+kDn/dP++LV5r7W0uOOjSPm06J", "kvVSR");
        llIlIIIlll[llIlIIlIII[27]] = lIllIIIlIIllI("O4L7gw7JRUQKzbBiUs9piZGlrlDM+uLN8w6IHUsJEeJd2MjGEuURGNlsTCXAJLLp", "sjZKE");
        llIlIIIlll[llIlIIlIII[28]] = lIllIIIlIIllI("AXY2Q/EBxmc=", "rFMqR");
        llIlIIIlll[llIlIIlIII[29]] = lIllIIIlIIllI("+gARwmziamqQLNHvl26diQ==", "EcuTh");
    }

    private static boolean lIllIIIllIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIIllIIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static void ds() {
        if (lIllIIIlIlIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[0]];
            C0015b.a(bv);
            if (lIllIIIlIllII(bv.size(), llIlIIlIII[1])) {
                System.out.println(llIlIIIlll[llIlIIlIII[1]]);
                bt = llIlIIlIII[0];
            }
        }
        if (lIllIIIlIllIl(bt ? 1 : 0)) {
            if (lIllIIIlIllIl(an() ? 1 : 0) && lIllIIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[2]) && lIllIIIlIllII(C0018e.j(llIlIIlIII[3]), llIlIIlIII[4])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIIIlIllll(nearest) && lIllIIIlIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[4]];
                    C0000a.a(nearest);
                }
                if (lIllIIIlIllll(nearest) && lIllIIIlIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[5]];
                    if (lIllIIIlIllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIIlIII[6]);
                        "".length();
                    }
                    if (lIllIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIIIllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIIlIII[2]);
                            "".length();
                        }
                        if (lIllIIIllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIIlIII[4]);
                            "".length();
                        }
                        int[] iArr = new int[llIlIIlIII[2]];
                        iArr[llIlIIlIII[0]] = llIlIIlIII[7];
                        iArr[llIlIIlIII[1]] = llIlIIlIII[8];
                        iArr[llIlIIlIII[4]] = llIlIIlIII[9];
                        iArr[llIlIIlIII[5]] = llIlIIlIII[10];
                        if (lIllIIIlIllIl(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlIIIlll[llIlIIlIII[2]]);
                            bt = llIlIIlIII[1];
                            return;
                        }
                        if (lIllIIIlIlIll(AccBuilderSotf.e ? 1 : 0)) {
                            C0000a.b(C0019f.bk, llIlIIlIII[1]);
                        }
                        int[] iArr2 = new int[llIlIIlIII[2]];
                        iArr2[llIlIIlIII[0]] = llIlIIlIII[7];
                        iArr2[llIlIIlIII[1]] = llIlIIlIII[8];
                        iArr2[llIlIIlIII[4]] = llIlIIlIII[9];
                        iArr2[llIlIIlIII[5]] = llIlIIlIII[10];
                        if (lIllIIIlIlIll(C0018e.c(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llIlIIlIII[2]];
                            iArr3[llIlIIlIII[0]] = llIlIIlIII[7];
                            iArr3[llIlIIlIII[1]] = llIlIIlIII[8];
                            iArr3[llIlIIlIII[4]] = llIlIIlIII[9];
                            iArr3[llIlIIlIII[5]] = llIlIIlIII[10];
                            C0000a.a(iArr3);
                        }
                    }
                }
            }
            if ((!lIllIIIlIllIl(an() ? 1 : 0) || lIllIIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[2])) && lIllIIIlIllII(C0018e.j(llIlIIlIII[3]), llIlIIlIII[4])) {
                AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[11]];
                if (lIllIIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[5])) {
                    di = llIlIIlIII[0];
                    Movement.walkTo(lD);
                    "".length();
                }
                if (lIllIIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[5])) {
                    if (lIllIIIlIllII(di, llIlIIlIII[1])) {
                        aN.tg += llIlIIlIII[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIlIIlIII[1];
                        aN.tg = llIlIIlIII[0];
                        dj = llIlIIlIII[0];
                    }
                    AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[12]];
                    if (lIllIIIlIllII(cG, llIlIIlIII[1])) {
                        C0018e.x();
                        cG += llIlIIlIII[1];
                    }
                    C0020g.a(llIlIIIlll[llIlIIlIII[13]], lE);
                }
            }
            C0020g.a(new String[llIlIIlIII[0]]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIlIIlIII[1]];
        iArr[llIlIIlIII[0]] = llIlIIlIII[7];
        if (lIllIIIllIIII(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[llIlIIlIII[1]];
            iArr2[llIlIIlIII[0]] = llIlIIlIII[9];
            if (lIllIIIllIIII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[llIlIIlIII[1]];
                iArr3[llIlIIlIII[0]] = llIlIIlIII[8];
                if (lIllIIIllIIII(Inventory.getCount(iArr3))) {
                    ?? r0 = llIlIIlIII[1];
                    "".length();
                    return (-" ".length()) == " ".length() ? ((((25 + 148) - 168) + 152) ^ (((86 + 103) - 111) + 52)) & (((((24 + 95) - 9) + 70) ^ (((114 + 92) - 106) + 71)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llIlIIlIII[0];
    }

    private static boolean lIllIIIlIlIll(int i) {
        return i != 0;
    }

    private static String lIllIIIlIIlll(String llllllllllllllllllIIlIIlIIlIIlIl, String llllllllllllllllllIIlIIlIIlIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), llIlIIlIII[22]), "DES");
            Cipher llllllllllllllllllIIlIIlIIlIIlll = Cipher.getInstance("DES");
            llllllllllllllllllIIlIIlIIlIIlll.init(llIlIIlIII[4], secretKeySpec);
            return new String(llllllllllllllllllIIlIIlIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIlIIlIIllI) {
            llllllllllllllllllIIlIIlIIlIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIIlIII[0];
    }

    private static void Q() {
        int[] iArr = new int[llIlIIlIII[1]];
        iArr[llIlIIlIII[0]] = llIlIIlIII[9];
        if (lIllIIIlIllIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIII[9], llIlIIlIII[1], llIlIIlIII[6]));
            "".length();
        }
        int[] iArr2 = new int[llIlIIlIII[1]];
        iArr2[llIlIIlIII[0]] = llIlIIlIII[8];
        if (lIllIIIlIllIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIII[8], llIlIIlIII[1], llIlIIlIII[6]));
            "".length();
        }
        int[] iArr3 = new int[llIlIIlIII[1]];
        iArr3[llIlIIlIII[0]] = llIlIIlIII[7];
        if (lIllIIIlIllIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIII[7], llIlIIlIII[1], llIlIIlIII[6]));
            "".length();
        }
        int[] iArr4 = new int[llIlIIlIII[1]];
        iArr4[llIlIIlIII[0]] = llIlIIlIII[10];
        if (lIllIIIlIllIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIII[10], llIlIIlIII[14], llIlIIlIII[15]));
            "".length();
        }
        if (lIllIIIlIllIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIIIlll[llIlIIlIII[23]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIII[16], llIlIIlIII[11], llIlIIlIII[17]));
            "".length();
        }
        int[] iArr5 = new int[llIlIIlIII[1]];
        iArr5[llIlIIlIII[0]] = llIlIIlIII[18];
        if (lIllIIIlIllIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIII[18], llIlIIlIII[19], llIlIIlIII[20]));
            "".length();
        }
    }

    static {
        lIllIIIlIlIlI();
        lIllIIIlIlIIl();
        lB = llIlIIlIII[8];
        lC = llIlIIlIII[7];
        lA = llIlIIlIII[9];
        lD = new WorldPoint(llIlIIlIII[24], llIlIIlIII[25], llIlIIlIII[0]);
        String[] strArr = new String[llIlIIlIII[11]];
        strArr[llIlIIlIII[0]] = llIlIIIlll[llIlIIlIII[14]];
        strArr[llIlIIlIII[1]] = llIlIIIlll[llIlIIlIII[26]];
        strArr[llIlIIlIII[4]] = llIlIIIlll[llIlIIlIII[27]];
        strArr[llIlIIlIII[5]] = llIlIIIlll[llIlIIlIII[28]];
        strArr[llIlIIlIII[2]] = llIlIIIlll[llIlIIlIII[29]];
        lE = strArr;
        lF = new WorldPoint(llIlIIlIII[30], llIlIIlIII[31], llIlIIlIII[4]);
        bv = new ArrayList();
        cG = llIlIIlIII[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIIIlll[llIlIIlIII[22]];
    }

    private static boolean lIllIIIlIlllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIIIlIllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIlIllIl(int i) {
        return i == 0;
    }

    private static String lIllIIIlIIllI(String llllllllllllllllllIIlIIIlllllllI, String llllllllllllllllllIIlIIIllllllll) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIlIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIlIIlIIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIlIIlIIIIIIlI.init(llIlIIlIII[4], llllllllllllllllllIIlIIlIIIIIIll);
            return new String(llllllllllllllllllIIlIIlIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIlIIIIIIIl) {
            llllllllllllllllllIIlIIlIIIIIIIl.printStackTrace();
            return null;
        }
    }
}
