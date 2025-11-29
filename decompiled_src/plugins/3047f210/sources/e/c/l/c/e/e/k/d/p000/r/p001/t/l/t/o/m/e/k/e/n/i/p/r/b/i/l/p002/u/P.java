package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.P  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/P.class */
public class P implements S {
    public static final /* synthetic */ WorldPoint iC;
    static /* synthetic */ int ck;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] llllllIlII;
    static /* synthetic */ int bS;
    public static final /* synthetic */ WorldPoint iF;
    public static final /* synthetic */ String[] iG;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint iE;
    private static /* synthetic */ String[] llllllIIll;
    public static final /* synthetic */ WorldPoint iD;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllllIlII[0];
    }

    private static String llIlIllIlIIll(String lllllllllllllllllIlIIIllIIlIIIII, String lllllllllllllllllIlIIIllIIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIllIIIlllll.getBytes(StandardCharsets.UTF_8)), llllllIlII[21]), "DES");
            Cipher lllllllllllllllllIlIIIllIIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIllIIlIIIlI.init(llllllIlII[5], secretKeySpec);
            return new String(lllllllllllllllllIlIIIllIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIllIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIllIIIlllII) {
            lllllllllllllllllIlIIIllIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIllllI(int i) {
        return i < 0;
    }

    private static boolean llIlIllIllIll(int i, int i2) {
        return i < i2;
    }

    private static String llIlIllIlIlII(String lllllllllllllllllIlIIIllIIIlIIII, String lllllllllllllllllIlIIIllIIIIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIllIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIllIIIIlllI = new StringBuilder();
        char[] lllllllllllllllllIlIIIllIIIIllIl = lllllllllllllllllIlIIIllIIIIllll.toCharArray();
        int lllllllllllllllllIlIIIllIIIIllII = llllllIlII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllllIlII[0];
        while (llIlIllIllIll(i, length)) {
            char lllllllllllllllllIlIIIllIIIlIIIl = charArray[i];
            lllllllllllllllllIlIIIllIIIIlllI.append((char) (lllllllllllllllllIlIIIllIIIlIIIl ^ lllllllllllllllllIlIIIllIIIIllIl[lllllllllllllllllIlIIIllIIIIllII % lllllllllllllllllIlIIIllIIIIllIl.length]));
            "".length();
            lllllllllllllllllIlIIIllIIIIllII++;
            i++;
            "".length();
            if ((((9 ^ 110) ^ (177 ^ 155)) & (((152 ^ 151) ^ (7 ^ 69)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIIIllIIIIlllI);
    }

    private static int llIlIllIllIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        String[] strArr = new String[llllllIlII[1]];
        strArr[llllllIlII[0]] = llllllIIll[llllllIlII[47]];
        if (llIlIllIllIlI(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llllllIlII[1]];
            strArr2[llllllIlII[0]] = llllllIIll[llllllIlII[48]];
            if (llIlIllIllIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[llllllIlII[1]];
                strArr3[llllllIlII[0]] = llllllIIll[llllllIlII[49]];
                if (llIlIllIllIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                    ?? r0 = llllllIlII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return llllllIlII[0];
    }

    private static boolean llIlIlllIIIll(int i, int i2) {
        return i != i2;
    }

    private static boolean llIlIlllIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIlIlllIIIII(Object obj) {
        return obj != null;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            dl();
            "".length();
            if ((126 ^ 122) <= 0) {
                return (2 ^ 16) & ((120 ^ 106) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return llllllIlII[59];
    }

    static {
        llIlIllIllIII();
        llIlIllIlIlll();
        iC = new WorldPoint(llllllIlII[62], llllllIlII[63], llllllIlII[0]);
        iD = new WorldPoint(llllllIlII[64], llllllIlII[65], llllllIlII[0]);
        iE = new WorldPoint(llllllIlII[66], llllllIlII[67], llllllIlII[0]);
        iF = new WorldPoint(llllllIlII[68], llllllIlII[69], llllllIlII[0]);
        String[] strArr = new String[llllllIlII[10]];
        strArr[llllllIlII[0]] = llllllIIll[llllllIlII[70]];
        strArr[llllllIlII[1]] = llllllIIll[llllllIlII[53]];
        strArr[llllllIlII[5]] = llllllIIll[llllllIlII[71]];
        strArr[llllllIlII[7]] = llllllIIll[llllllIlII[72]];
        iG = strArr;
        bu = new ArrayList();
        bS = llllllIlII[0];
    }

    private static boolean llIlIllIllIlI(int i) {
        return i != 0;
    }

    private static String llIlIllIlIlIl(String lllllllllllllllllIlIIIllIIlIllIl, String lllllllllllllllllIlIIIllIIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIllIIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIllIIlIllll.init(llllllIlII[5], secretKeySpec);
            return new String(lllllllllllllllllIlIIIllIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIllIIlIlllI) {
            lllllllllllllllllIlIIIllIIlIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIlllIIlIl(C0004e.j(llllllIlII[9]), llllllIlII[7]) && llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iF), llllllIlII[43])) {
            ?? r0 = llllllIlII[1];
            "".length();
            return ((62 ^ 117) ^ (232 ^ 167)) != ((((43 + 183) - 179) + 142) ^ (((32 + 160) - 167) + 160)) ? ((((4 + 71) - 38) + 119) ^ (((90 + 14) - 39) + 75)) & (((23 ^ 31) ^ (160 ^ 184)) ^ (-" ".length())) : r0;
        }
        return llllllIlII[0];
    }

    private static void llIlIllIllIII() {
        llllllIlII = new int[74];
        llllllIlII[0] = ((((11 + 145) - 83) + 119) ^ (((5 + 29) - (-1)) + 163)) & (((85 ^ 126) ^ (94 ^ 115)) ^ (-" ".length()));
        llllllIlII[1] = " ".length();
        llllllIlII[2] = (((97 + 64) - 124) + 92) ^ (((191 + 58) - 222) + 165);
        llllllIlII[3] = (97 ^ 104) ^ "   ".length();
        llllllIlII[4] = (((181 + 210) - 216) + 38) ^ (((64 + 23) - 56) + 116);
        llllllIlII[5] = "  ".length();
        llllllIlII[6] = (-16005) & 16383;
        llllllIlII[7] = "   ".length();
        llllllIlII[8] = (-((-20133) & 32437)) & (-17421) & 30719;
        llllllIlII[9] = ((173 + 118) - 185) + 72;
        llllllIlII[10] = (((164 + 12) - 9) + 20) ^ (((6 + 161) - 20) + 44);
        llllllIlII[11] = 183 ^ 178;
        llllllIlII[12] = (-18438) & 23437;
        llllllIlII[13] = (-((-4293) & 6343)) & (-12417) & 16383;
        llllllIlII[14] = (-((-5351) & 13815)) & (-16577) & 26590;
        llllllIlII[15] = (-12497) & 14843;
        llllllIlII[16] = (-((-18085) & 26285)) & (-16513) & 32719;
        llllllIlII[17] = (-((-1061) & 24301)) & (-3) & 24575;
        llllllIlII[18] = 113 ^ 119;
        llllllIlII[19] = (-((-15946) & 32587)) & (-4129) & 32747;
        llllllIlII[20] = 103 ^ 96;
        llllllIlII[21] = (201 ^ 147) ^ (254 ^ 172);
        llllllIlII[22] = (((61 + 91) - 116) + 153) ^ (((10 + 157) - 152) + 165);
        llllllIlII[23] = (163 ^ 196) ^ (210 ^ 190);
        llllllIlII[24] = 13 ^ 1;
        llllllIlII[25] = 142 ^ 131;
        llllllIlII[26] = 46 ^ 32;
        llllllIlII[27] = (106 ^ 114) ^ (49 ^ 38);
        llllllIlII[28] = (81 ^ 111) ^ (62 ^ 16);
        llllllIlII[29] = (255 ^ 131) ^ (10 ^ 103);
        llllllIlII[30] = (199 ^ 153) ^ (72 ^ 4);
        llllllIlII[31] = 187 ^ 168;
        llllllIlII[32] = 45 ^ 57;
        llllllIlII[33] = (-14338) & 15051;
        llllllIlII[34] = 67 ^ 86;
        llllllIlII[35] = (92 ^ 9) ^ (70 ^ 5);
        llllllIlII[36] = (((38 + 15) - (-53)) + 40) ^ (((131 + 30) - 149) + 121);
        llllllIlII[37] = (69 ^ 108) ^ (137 ^ 184);
        llllllIlII[38] = 17 ^ 8;
        llllllIlII[39] = (((84 + 41) - 45) + 60) ^ (((112 + 16) - 123) + 145);
        llllllIlII[40] = (19 ^ 61) ^ (8 ^ 61);
        llllllIlII[41] = (162 ^ 193) ^ (((20 + 54) - 22) + 75);
        llllllIlII[42] = 95 ^ 66;
        llllllIlII[43] = (((66 + 74) - 73) + 155) ^ (((145 + 49) - 95) + 93);
        llllllIlII[44] = 175 ^ 176;
        llllllIlII[45] = (((161 + 216) - 207) + 60) ^ (((193 + 57) - 171) + 119);
        llllllIlII[46] = (((112 + 44) - 58) + 41) ^ (((42 + 38) - 77) + 167);
        llllllIlII[47] = (53 ^ 19) ^ (42 ^ 46);
        llllllIlII[48] = (223 ^ 130) ^ (232 ^ 150);
        llllllIlII[49] = 102 ^ 66;
        llllllIlII[50] = (-2259) & 8158;
        llllllIlII[51] = (-4753) & 30652;
        llllllIlII[52] = (-16866) & 32765;
        llllllIlII[53] = (((72 + 180) - 190) + 125) ^ (((71 + 140) - 140) + 76);
        llllllIlII[54] = (-29704) & 30103;
        llllllIlII[55] = (-16385) & 28364;
        llllllIlII[56] = (-((-25475) & 30663)) & (-2049) & 32236;
        llllllIlII[57] = (-((-1901) & 14333)) & (-1) & 14332;
        llllllIlII[58] = (-19079) & 31703;
        llllllIlII[59] = (((145 + 110) - 135) + 42) ^ (((142 + 120) - 129) + 65);
        llllllIlII[60] = 37 ^ 0;
        llllllIlII[61] = 12 ^ 42;
        llllllIlII[62] = (-801) & 3898;
        llllllIlII[63] = (-29225) & 32492;
        llllllIlII[64] = (-((-53) & 25149)) & (-321) & 28639;
        llllllIlII[65] = (-(((59 + 107) - 65) + 28)) & (-12837) & 16359;
        llllllIlII[66] = (-((-6441) & 31610)) & (-131) & 28415;
        llllllIlII[67] = (-12515) & 15870;
        llllllIlII[68] = (-28747) & 31823;
        llllllIlII[69] = (-((-545) & 21489)) & (-1) & 30715;
        llllllIlII[70] = 54 ^ 17;
        llllllIlII[71] = 128 ^ 169;
        llllllIlII[72] = 90 ^ 112;
        llllllIlII[73] = (77 ^ 95) ^ (82 ^ 107);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0142, code lost:
        if (llIlIllIlllll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x054a, code lost:
        if (llIlIllIlllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v369, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dl() {
        if (llIlIllIllIlI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllllIIll[llllllIlII[0]];
            C0001b.a(bu);
            if (llIlIllIllIll(bu.size(), llllllIlII[1])) {
                System.out.println(llllllIIll[llllllIlII[1]]);
                bs = llllllIlII[0];
            }
        }
        if (llIlIllIlllII(bs ? 1 : 0) && llIlIllIllIll(C0004e.j(llllllIlII[2]), llllllIlII[3])) {
            C0021v.by();
        }
        if (llIlIllIlllII(bs ? 1 : 0) && llIlIllIlllIl(C0004e.j(llllllIlII[2]), llllllIlII[3])) {
            if (llIlIllIllIlI(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlIllIllIll(Movement.getRunEnergy(), llllllIlII[4])) {
                Inventory.getFirst(C0005f.aU).interact(llllllIIll[llllllIlII[5]]);
                Time.sleepTicks(llllllIlII[1]);
                "".length();
            }
            if (llIlIllIllllI(llIlIllIllIIl(C0004e.u(), 70.0d))) {
                int[] iArr = new int[llllllIlII[1]];
                iArr[llllllIlII[0]] = llllllIlII[6];
                if (llIlIllIllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llllllIlII[1]];
                    iArr2[llllllIlII[0]] = llllllIlII[6];
                    Inventory.getFirst(iArr2).interact(llllllIIll[llllllIlII[7]]);
                }
            }
            if (llIlIllIlllII(Movement.isRunEnabled() ? 1 : 0) && llIlIllIlllll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIlIllIllIlI(aa() ? 1 : 0)) {
                int[] iArr3 = new int[llllllIlII[1]];
                iArr3[llllllIlII[0]] = llllllIlII[8];
            }
            if (llIlIllIllIll(C0004e.j(llllllIlII[9]), llllllIlII[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIlllIIIII(nearest) && llIlIllIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllllIIll[llllllIlII[10]];
                    C0000a.a(nearest);
                    Time.sleepTicks(llllllIlII[5]);
                    "".length();
                }
                if (llIlIlllIIIII(nearest) && llIlIllIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllllIIll[llllllIlII[11]];
                    if (llIlIllIlllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllllIlII[12]);
                        "".length();
                    }
                    if (llIlIllIllIlI(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIllIlllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllllIlII[10]);
                            "".length();
                        }
                        if (llIlIllIlllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllllIlII[5]);
                            "".length();
                        }
                        int[] iArr4 = new int[llllllIlII[11]];
                        iArr4[llllllIlII[0]] = llllllIlII[13];
                        iArr4[llllllIlII[1]] = llllllIlII[14];
                        iArr4[llllllIlII[5]] = llllllIlII[15];
                        iArr4[llllllIlII[7]] = llllllIlII[16];
                        iArr4[llllllIlII[10]] = llllllIlII[17];
                        if (llIlIllIlllII(C0004e.b(iArr4) ? 1 : 0)) {
                            ae();
                            System.out.println(llllllIIll[llllllIlII[18]]);
                            bs = llllllIlII[1];
                            return;
                        }
                        Bank.withdraw(llllllIlII[13], llllllIlII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIlII[1]);
                        "".length();
                        Bank.withdraw(llllllIlII[14], llllllIlII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIlII[1]);
                        "".length();
                        Bank.withdraw(llllllIlII[15], llllllIlII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIlII[1]);
                        "".length();
                        Bank.withdraw(llllllIlII[16], llllllIlII[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIlII[1]);
                        "".length();
                        Bank.withdraw(llllllIlII[19], llllllIlII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIlII[1]);
                        "".length();
                        Bank.withdraw(llllllIlII[17], llllllIlII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIlII[1]);
                        "".length();
                        C0000a.b(C0005f.aU, llllllIlII[1]);
                        C0000a.a(llllllIlII[6], llllllIlII[3]);
                        C0000a.b(C0005f.be, llllllIlII[1]);
                    }
                }
            }
            if (llIlIllIllIlI(aa() ? 1 : 0) && llIlIllIllIll(C0004e.j(llllllIlII[9]), llllllIlII[1])) {
                if (llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iC), llllllIlII[5])) {
                    AccBuilderTempleTrek.c = llllllIIll[llllllIlII[20]];
                    if (llIlIllIlllII(Equipment.contains(C0005f.aQ) ? 1 : 0) && llIlIllIllIlI(Inventory.contains(C0005f.aQ) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aQ).interact(llllllIIll[llllllIlII[21]]);
                        Time.sleepTicks(llllllIlII[1]);
                        "".length();
                    }
                    if (llIlIllIllIll(bS, llllllIlII[1])) {
                        C0004e.v();
                        bS += llllllIlII[1];
                    }
                    Movement.walkTo(iC);
                    "".length();
                    Time.sleepTicks(llllllIlII[1]);
                    "".length();
                }
                if (llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iC), llllllIlII[7])) {
                    AccBuilderTempleTrek.c = llllllIIll[llllllIlII[22]];
                    C0006g.a(llllllIIll[llllllIlII[3]], iG);
                }
            }
            if (llIlIllIlllIl(C0004e.j(llllllIlII[9]), llllllIlII[1])) {
                ck = llllllIlII[0];
                if (llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iD), llllllIlII[21])) {
                    AccBuilderTempleTrek.c = llllllIIll[llllllIlII[23]];
                    Movement.walkTo(iD);
                    "".length();
                    Time.sleepTicks(llllllIlII[1]);
                    "".length();
                }
                if (llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iD), llllllIlII[21])) {
                    AccBuilderTempleTrek.c = llllllIIll[llllllIlII[24]];
                    C0006g.a(llllllIIll[llllllIlII[25]], iG);
                }
            }
            if (llIlIllIlllIl(C0004e.j(llllllIlII[9]), llllllIlII[5])) {
                String[] strArr = new String[llllllIlII[1]];
                strArr[llllllIlII[0]] = llllllIIll[llllllIlII[26]];
                if (llIlIllIlllII(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llllllIlII[1]];
                    strArr2[llllllIlII[0]] = llllllIIll[llllllIlII[27]];
                }
                AccBuilderTempleTrek.c = llllllIIll[llllllIlII[28]];
                C0006g.a(llllllIIll[llllllIlII[29]], iG);
                C0006g.a(iG);
            }
            if (llIlIllIlllIl(C0004e.j(llllllIlII[9]), llllllIlII[5])) {
                String[] strArr3 = new String[llllllIlII[1]];
                strArr3[llllllIlII[0]] = llllllIIll[llllllIlII[30]];
                if (llIlIllIlllII(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llllllIlII[1]];
                    strArr4[llllllIlII[0]] = llllllIIll[llllllIlII[31]];
                    if (llIlIllIllIlI(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iE), llllllIlII[5]) && llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iF), llllllIlII[3])) {
                            AccBuilderTempleTrek.c = llllllIIll[llllllIlII[32]];
                            if (llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iD), llllllIlII[3]) && llIlIllIllIlI(Equipment.contains(C0005f.aQ) ? 1 : 0) && llIlIlllIIIll(Players.getLocal().getAnimation(), llllllIlII[33])) {
                                Equipment.getFirst(C0005f.aQ).interact(llllllIIll[llllllIlII[34]]);
                                Time.sleepTicks(llllllIlII[7]);
                                "".length();
                            }
                            Movement.walkTo(iE);
                            "".length();
                            Time.sleepTicks(llllllIlII[1]);
                            "".length();
                        }
                        if (llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iE), llllllIlII[10])) {
                            AccBuilderTempleTrek.c = llllllIIll[llllllIlII[35]];
                            String[] strArr5 = new String[llllllIlII[1]];
                            strArr5[llllllIlII[0]] = llllllIIll[llllllIlII[36]];
                            TileObjects.getNearest(strArr5).interact(llllllIIll[llllllIlII[37]]);
                            Time.sleepTicks(llllllIlII[7]);
                            "".length();
                        }
                        if (llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iF), llllllIlII[3])) {
                            String[] strArr6 = new String[llllllIlII[1]];
                            strArr6[llllllIlII[0]] = llllllIIll[llllllIlII[38]];
                            if (llIlIlllIIlII(NPCs.getNearest(strArr6))) {
                                AccBuilderTempleTrek.c = llllllIIll[llllllIlII[39]];
                                if (llIlIllIllIll(ck, llllllIlII[1])) {
                                    ac.mK += llllllIlII[1];
                                    ac.d(AccBuilderTempleTrek.m);
                                    ck += llllllIlII[1];
                                    ac.mK = llllllIlII[0];
                                    cl = llllllIlII[0];
                                }
                                String[] strArr7 = new String[llllllIlII[1]];
                                strArr7[llllllIlII[0]] = llllllIIll[llllllIlII[40]];
                                TileObjects.getNearest(strArr7).interact(llllllIIll[llllllIlII[41]]);
                                Time.sleepTicks(llllllIlII[10]);
                                "".length();
                            }
                            String[] strArr8 = new String[llllllIlII[1]];
                            strArr8[llllllIlII[0]] = llllllIIll[llllllIlII[42]];
                            NPC nearest2 = NPCs.getNearest(strArr8);
                            if (llIlIlllIIIII(nearest2)) {
                                AccBuilderTempleTrek.c = llllllIIll[llllllIlII[43]];
                                int[] iArr5 = new int[llllllIlII[1]];
                                iArr5[llllllIlII[0]] = llllllIlII[17];
                                if (llIlIllIlllII(Equipment.contains(iArr5) ? 1 : 0)) {
                                    int[] iArr6 = new int[llllllIlII[1]];
                                    iArr6[llllllIlII[0]] = llllllIlII[17];
                                    if (llIlIllIllIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                                        int[] iArr7 = new int[llllllIlII[1]];
                                        iArr7[llllllIlII[0]] = llllllIlII[17];
                                        Inventory.getFirst(iArr7).interact(llllllIIll[llllllIlII[44]]);
                                        Time.sleepTicks(llllllIlII[1]);
                                        "".length();
                                    }
                                }
                                if (llIlIlllIIlII(Players.getLocal().getInteracting()) && llIlIllIlllII(nearest2.isDead() ? 1 : 0)) {
                                    nearest2.interact(llllllIIll[llllllIlII[45]]);
                                    Time.sleepTicks(llllllIlII[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (llIlIllIlllIl(C0004e.j(llllllIlII[9]), llllllIlII[7]) && llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iF), llllllIlII[3])) {
                int[] iArr8 = new int[llllllIlII[1]];
                iArr8[llllllIlII[0]] = llllllIlII[16];
                if (llIlIllIllIlI(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llllllIlII[1]];
                    iArr9[llllllIlII[0]] = llllllIlII[16];
                    Inventory.getFirst(iArr9).interact(llllllIIll[llllllIlII[46]]);
                    Time.sleepTicks(llllllIlII[5]);
                    "".length();
                }
            }
            C0006g.a(new String[llllllIlII[0]]);
        }
    }

    private static void ae() {
        int[] iArr = new int[llllllIlII[1]];
        iArr[llllllIlII[0]] = llllllIlII[13];
        if (llIlIllIlllII(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlII[13], llllllIlII[1], llllllIlII[50]));
            "".length();
        }
        int[] iArr2 = new int[llllllIlII[1]];
        iArr2[llllllIlII[0]] = llllllIlII[15];
        if (llIlIllIlllII(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlII[15], llllllIlII[1], llllllIlII[50]));
            "".length();
        }
        int[] iArr3 = new int[llllllIlII[1]];
        iArr3[llllllIlII[0]] = llllllIlII[17];
        if (llIlIllIlllII(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlII[17], llllllIlII[1], llllllIlII[51]));
            "".length();
        }
        int[] iArr4 = new int[llllllIlII[1]];
        iArr4[llllllIlII[0]] = llllllIlII[14];
        if (llIlIllIlllII(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlII[14], llllllIlII[1], llllllIlII[50]));
            "".length();
        }
        int[] iArr5 = new int[llllllIlII[1]];
        iArr5[llllllIlII[0]] = llllllIlII[19];
        if (llIlIllIlllII(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlII[19], llllllIlII[1], llllllIlII[52]));
            "".length();
        }
        int[] iArr6 = new int[llllllIlII[1]];
        iArr6[llllllIlII[0]] = llllllIlII[6];
        if (llIlIllIlllII(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlII[6], llllllIlII[3], llllllIlII[50]));
            "".length();
        }
        int[] iArr7 = new int[llllllIlII[1]];
        iArr7[llllllIlII[0]] = llllllIlII[6];
        if (llIlIllIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[llllllIlII[1]];
            iArr8[llllllIlII[0]] = llllllIlII[6];
            if (llIlIllIllIll(Bank.getFirst(iArr8).getQuantity(), llllllIlII[32])) {
                bu.add(new C0003d(llllllIlII[6], llllllIlII[53], llllllIlII[54]));
                "".length();
            }
        }
        if (llIlIllIlllII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llllllIIll[llllllIlII[61]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlII[55], llllllIlII[11], llllllIlII[56]));
            "".length();
        }
        int[] iArr9 = new int[llllllIlII[1]];
        iArr9[llllllIlII[0]] = llllllIlII[16];
        if (llIlIllIlllII(Bank.contains(iArr9) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlII[16], llllllIlII[53], llllllIlII[57]));
            "".length();
        }
        int[] iArr10 = new int[llllllIlII[1]];
        iArr10[llllllIlII[0]] = llllllIlII[58];
        if (llIlIllIlllII(Bank.contains(iArr10) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlII[58], llllllIlII[11], C0008i.bp));
            "".length();
        }
    }

    private static void llIlIllIlIlll() {
        llllllIIll = new String[llllllIlII[73]];
        llllllIIll[llllllIlII[0]] = llIlIllIlIIll("86fUhHQihCYnzAWCtZ1oew==", "ngORC");
        llllllIIll[llllllIlII[1]] = llIlIllIlIlII("BQo6BjIrBjBPIzYaPQEmYwogCiwwT3QcNioXNwcoLQR0DSAgCHQbLmMSIQoyNw==", "CcToA");
        llllllIIll[llllllIlII[5]] = llIlIllIlIlIl("04OruyyoDf0=", "eZdmO");
        llllllIIll[llllllIlII[7]] = llIlIllIlIIll("qMBxZtu2PZo=", "lzEwD");
        llllllIIll[llllllIlII[10]] = llIlIllIlIlII("ARkiVTcgWDYULSQ=", "OxTuC");
        llllllIIll[llllllIlII[11]] = llIlIllIlIIll("dbl4jbMysYNWUAEADs+jOt4kq954LU40", "LJHAe");
        llllllIIll[llllllIlII[18]] = llIlIllIlIlIl("ki3L/TjtCA1L4ZbBKIv1mO8i3PdaBPQxO0i7YUa11QSJ9hkwbC1YlgsWMaV7Ijm0PUtcqAuqEh8=", "bGWwc");
        llllllIIll[llllllIlII[20]] = llIlIllIlIIll("8Ib40OVN4E8iTNmvixFaqg==", "GGjhX");
        llllllIIll[llllllIlII[21]] = llIlIllIlIIll("Zg4+4XOsXVA=", "ZLDvJ");
        llllllIIll[llllllIlII[22]] = llIlIllIlIIll("ILyv7NMuWDNw6Jht8gVaWg==", "URBhb");
        llllllIIll[llllllIlII[3]] = llIlIllIlIIll("2rJxBzRr2Xc=", "YDydk");
        llllllIIll[llllllIlII[23]] = llIlIllIlIlII("PzseTS0eehgYOw==", "qZhmY");
        llllllIIll[llllllIlII[24]] = llIlIllIlIIll("heINpuZKDrMLUG7/CxGetw==", "PXdcM");
        llllllIIll[llllllIlII[25]] = llIlIllIlIlII("DAtMJjU6FQMZ", "HylnT");
        llllllIIll[llllllIlII[26]] = llIlIllIlIlIl("hkZeb8EKaMk=", "QxDdw");
        llllllIIll[llllllIlII[27]] = llIlIllIlIlIl("mgPdZaLnTRM=", "MkFex");
        llllllIIll[llllllIlII[28]] = llIlIllIlIlIl("2mPrT3dBOWuOPY+H4wC3IA==", "BLFuz");
        llllllIIll[llllllIlII[29]] = llIlIllIlIIll("2ka98WsOgqx0x0QKjEjgRA==", "KubGg");
        llllllIIll[llllllIlII[30]] = llIlIllIlIIll("bwvHO5AJqaI=", "VSTuM");
        llllllIIll[llllllIlII[31]] = llIlIllIlIIll("ZUJCit4B5Eo=", "yecsy");
        llllllIIll[llllllIlII[32]] = llIlIllIlIIll("pMoiAv+izw/1MWm9zglQEA==", "TzluF");
        llllllIIll[llllllIlII[34]] = llIlIllIlIlII("NRcLGCoeF0o3LR0JCwYh", "qejaD");
        llllllIIll[llllllIlII[35]] = llIlIllIlIlIl("PkCxVMo4pyfLo/FAzN091gMISmuPOTXW", "QIfHR");
        llllllIIll[llllllIlII[36]] = llIlIllIlIlII("ERINAjAx", "BflkB");
        llllllIIll[llllllIlII[37]] = llIlIllIlIlII("Mis4KXchJSMs", "eJTBZ");
        llllllIIll[llllllIlII[38]] = llIlIllIlIlII("LQQUBSVOLxMKKAAEEw==", "nkakQ");
        llllllIIll[llllllIlII[39]] = llIlIllIlIIll("NtBf9fBaAU9PxhdKOM+8OQ==", "KdNJR");
        llllllIIll[llllllIlII[40]] = llIlIllIlIlII("BS4vCgwo", "FAIle");
        llllllIIll[llllllIlII[41]] = llIlIllIlIlIl("1XvqdfSxOkU=", "oZwSC");
        llllllIIll[llllllIlII[42]] = llIlIllIlIlII("ICAgCANDCycHDg0gJw==", "cOUfw");
        llllllIIll[llllllIlII[43]] = llIlIllIlIlIl("WbPRGbwsP7A1M/TjfyxPeA==", "DSBbk");
        llllllIIll[llllllIlII[44]] = llIlIllIlIIll("O6jRR4lodbw=", "IvbWU");
        llllllIIll[llllllIlII[45]] = llIlIllIlIlII("ICQ5EQ8K", "aPMpl");
        llllllIIll[llllllIlII[46]] = llIlIllIlIlII("NysmDzI=", "uYCnY");
        llllllIIll[llllllIlII[47]] = llIlIllIlIIll("18V/p2SW25s=", "FbpyY");
        llllllIIll[llllllIlII[48]] = llIlIllIlIIll("o76quW9krp4=", "smhVn");
        llllllIIll[llllllIlII[49]] = llIlIllIlIlII("Lw4YBhQV", "goukq");
        llllllIIll[llllllIlII[60]] = llIlIllIlIlII("NCg4BjAQLHUFNQMwMAR5EzwwBS0=", "bIUvY");
        llllllIIll[llllllIlII[61]] = llIlIllIlIIll("mZF8+Z5Vk/gmgX1ohaltf21mKkuk2JyL", "JWvge");
        llllllIIll[llllllIlII[70]] = llIlIllIlIlII("LRlkSx5FH2geJ0IUJxl3AxxoCjMUFyYfIhAXZg==", "brHkW");
        llllllIIll[llllllIlII[53]] = llIlIllIlIlIl("POmo0yZ3eeQmwB8th5Rjziq3DObYWI2hRXrEE88/HYpMQ220SejTrA==", "zxiPd");
        llllllIIll[llllllIlII[71]] = llIlIllIlIlII("DwkDIQssRh8jDyYVUT8FNxRRLg8uFlA=", "BfqFj");
        llllllIIll[llllllIlII[72]] = llIlIllIlIIll("0Ipelg7uiK0=", "ZKHKq");
    }

    private static boolean llIlIllIlllll(int i) {
        return i > 0;
    }

    private static boolean llIlIlllIIlII(Object obj) {
        return obj == null;
    }

    private static boolean llIlIlllIIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIlllIIlIl(int i, int i2) {
        return i >= i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllllIIll[llllllIlII[60]];
    }

    private static boolean llIlIllIlllII(int i) {
        return i == 0;
    }

    private static boolean llIlIllIlllIl(int i, int i2) {
        return i == i2;
    }
}
