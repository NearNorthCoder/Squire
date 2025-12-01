package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/o.class */
public class C0028o implements InterfaceC0003ac {
    public static /* synthetic */ WorldPoint cx;
    public static /* synthetic */ WorldPoint cw;
    public static /* synthetic */ WorldPoint cC;
    public static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ WorldPoint cp;
    public static /* synthetic */ WorldPoint cv;
    public static /* synthetic */ WorldPoint cq;
    public static /* synthetic */ WorldPoint cn;
    private static /* synthetic */ String[] llIllIllll;
    public static /* synthetic */ WorldPoint cs;
    public static /* synthetic */ String[] cE;
    public static /* synthetic */ WorldPoint cr;
    public static /* synthetic */ int cH;
    private static /* synthetic */ int[] llIlllIIIl;
    public static /* synthetic */ WorldPoint cB;
    public static /* synthetic */ int cG;
    public static /* synthetic */ WorldPoint co;
    public static /* synthetic */ WorldPoint cA;
    public static /* synthetic */ WorldPoint cu;
    static /* synthetic */ int cI;
    public static /* synthetic */ long cD;
    public static /* synthetic */ WorldPoint ct;
    public static /* synthetic */ WorldPoint cy;
    public static /* synthetic */ WorldPoint cz;
    public static /* synthetic */ WorldArea cF;

    private static boolean lIlllIIlIIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlllIIIlIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIlllIIIlllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIIlIIIII(int i) {
        return i >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlllIIlIIIlI(Skills.getLevel(Skill.RANGED), llIlllIIIl[35]) && lIlllIIlIIIlI(Skills.getLevel(Skill.DEFENCE), llIlllIIIl[35])) {
            ?? r0 = llIlllIIIl[0];
            "".length();
            return (-" ".length()) > 0 ? ((((139 + 123) - 224) + 107) ^ (((156 + 110) - 226) + 134)) & (((20 ^ 127) ^ (208 ^ 132)) ^ (-" ".length())) : r0;
        }
        return llIlllIIIl[1];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIllIllll[llIlllIIIl[34]];
    }

    private static int lIlllIIIllIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static void aD() {
        if (lIlllIIIlIlIl(cH, llIlllIIIl[0])) {
            cD = System.currentTimeMillis();
            System.out.println(llIllIllll[llIlllIIIl[1]]);
            cH += llIlllIIIl[0];
        }
        int[] iArr = new int[llIlllIIIl[0]];
        iArr[llIlllIIIl[1]] = llIlllIIIl[2];
        if (lIlllIIIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIlllIIIlIlll(nearest) && lIlllIIIlIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllll[llIlllIIIl[0]];
                C0000a.a(nearest);
            }
            if (lIlllIIIlIlll(nearest) && lIlllIIIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllll[llIlllIIIl[3]];
                if (lIlllIIIlIllI(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlllIIIl[4]);
                    "".length();
                }
                if (lIlllIIIllIII(Bank.isOpen() ? 1 : 0)) {
                    if (lIlllIIIllIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIlllIIIl[0]);
                        "".length();
                    }
                    C0000a.a(llIlllIIIl[2], llIlllIIIl[5]);
                    C0000a.a(llIlllIIIl[6], llIlllIIIl[0]);
                    C0000a.a(llIlllIIIl[7], llIlllIIIl[8]);
                }
            }
        }
        int[] iArr2 = new int[llIlllIIIl[0]];
        iArr2[llIlllIIIl[1]] = llIlllIIIl[2];
        if (lIlllIIIllIII(Inventory.contains(iArr2) ? 1 : 0)) {
            aE();
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aD();
            "".length();
            if (((191 ^ 158) ^ (15 ^ 42)) < 0) {
                return ((12 ^ 86) ^ (110 ^ 30)) & (((((17 + 44) - (-65)) + 25) ^ (((72 + 79) - 112) + 150)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlllIIIl[33];
    }

    public static void aH() {
        int c = C0018e.c(llIlllIIIl[0], llIlllIIIl[13]);
        if (lIlllIIlIIIIl(c, llIlllIIIl[0])) {
            cC = cm;
            cs = cn;
        }
        if (lIlllIIlIIIIl(c, llIlllIIIl[3])) {
            cC = ct;
            cs = cu;
        }
        if (lIlllIIlIIIIl(c, llIlllIIIl[10])) {
            cC = cv;
            cs = cw;
        }
        if (lIlllIIlIIIIl(c, llIlllIIIl[12])) {
            cC = cx;
            cs = cy;
        }
        if (lIlllIIlIIIIl(c, llIlllIIIl[13])) {
            cC = cz;
            cs = cA;
        }
    }

    private static boolean lIlllIIlIIIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlllIIIl[1];
    }

    private static boolean lIlllIIIllllI(int i, int i2) {
        return i <= i2;
    }

    private static void lIlllIIIlIIll() {
        llIllIllll = new String[llIlllIIIl[67]];
        llIllIllll[llIlllIIIl[1]] = lIlllIIIlIIII("nvl+b7U/oJUFko1J3SDnEgRKjsLtooy8", "HAlSi");
        llIllIllll[llIlllIIIl[0]] = lIlllIIIlIIIl("NzEDGw0YJBwcDVkkGlIIGD4e", "yPurj");
        llIllIllll[llIlllIIIl[3]] = lIlllIIIlIIlI("4SlofLP2A0EDbgf4/K/eAS2fYQq6ElTZ", "cisOg");
        llIllIllll[llIlllIIIl[10]] = lIlllIIIlIIII("+H9fQbXKqRGcUdQ8BgcFF05t8V3unjhe", "QeHkj");
        llIllIllll[llIlllIIIl[12]] = lIlllIIIlIIIl("Fz8YAQ0=", "SMqof");
        llIllIllll[llIlllIIIl[13]] = lIlllIIIlIIlI("n3Xp61DVWC2TC1ckAWmCKA==", "cdVSJ");
        llIllIllll[llIlllIIIl[14]] = lIlllIIIlIIII("kxRka8ylPrpynlZB6Zvtj7Xu2hn6u3nK", "maudT");
        llIllIllll[llIlllIIIl[15]] = lIlllIIIlIIlI("toqKjskKuDw=", "suBKL");
        llIllIllll[llIlllIIIl[16]] = lIlllIIIlIIIl("NSEaDHg1JxsbORcnBBEtFg==", "eNhxX");
        llIllIllll[llIlllIIIl[17]] = lIlllIIIlIIIl("GhY4E1EaEDkEEDgQJg4EOQ==", "JyJgq");
        llIllIllll[llIlllIIIl[8]] = lIlllIIIlIIIl("ITc1M3khMTQkOAMxKy4sAg==", "qXGGY");
        llIllIllll[llIlllIIIl[18]] = lIlllIIIlIIIl("DAgmMQ==", "ZmIBH");
        llIllIllll[llIlllIIIl[19]] = lIlllIIIlIIIl("MCUZ", "uDmPn");
        llIllIllll[llIlllIIIl[20]] = lIlllIIIlIIlI("jeXsqol1eyGukz73XpulDA==", "qObXy");
        llIllIllll[llIlllIIIl[21]] = lIlllIIIlIIlI("v5kUwcXtAqhy0w4rzHAM9Q==", "Ndrhp");
        llIllIllll[llIlllIIIl[22]] = lIlllIIIlIIlI("p1FUb/ewXCR07IW77mPOKNxB7+aw/rSU", "GrOFM");
        llIllIllll[llIlllIIIl[23]] = lIlllIIIlIIII("Eqa1AH9J5Ug=", "xbARk");
        llIllIllll[llIlllIIIl[30]] = lIlllIIIlIIlI("Gk79Qbyr9YDkHVX07taLfw==", "mJEDV");
        llIllIllll[llIlllIIIl[34]] = lIlllIIIlIIlI("R0KuiKg3Stz37K8qqWj9mA==", "lLegV");
        llIllIllll[llIlllIIIl[36]] = lIlllIIIlIIII("dapjPCj/vmbWXtkvc9MkKQ==", "opkfC");
        llIllIllll[llIlllIIIl[60]] = lIlllIIIlIIlI("+9Vc469CWpxBQbjQxCvDOsxJIauYQG6cCfDbPQdPiImHKw7S/0pc3w+kNKoQZjKf", "QbQbz");
        llIllIllll[llIlllIIIl[61]] = lIlllIIIlIIlI("bMI/46rbogsQpNBppfb+NQqVjQQwA+rJSLGU1ylnBuRYXmLQ94h7Vg==", "zoLoS");
        llIllIllll[llIlllIIIl[62]] = lIlllIIIlIIII("Xc9KkiFgFwSsscPoP2EmKw==", "WAOeu");
    }

    private static String lIlllIIIlIIlI(String llllllllllllllllllIIIIlIlllllIlI, String llllllllllllllllllIIIIlIlllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIlIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIlIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIlIlllllIll) {
            llllllllllllllllllIIIIlIlllllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aG() {
        WorldArea worldArea = new WorldArea(cC, llIlllIIIl[10], llIlllIIIl[10]);
        List all = Players.getAll();
        if (lIlllIIIlIllI(all.isEmpty() ? 1 : 0) && lIlllIIIlllIl(all.size(), llIlllIIIl[0])) {
            int i = llIlllIIIl[1];
            while (lIlllIIIlIlIl(i, all.size())) {
                if (lIlllIIIllIII(((Player) all.get(i)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if ((((11 ^ 79) ^ (66 ^ 86)) & ((" ".length() ^ (114 ^ 35)) ^ (-" ".length()))) >= ((190 ^ 153) ^ (133 ^ 166))) {
                        return ((((138 + 83) - 161) + 95) ^ (((81 + 143) - 73) + 36)) & (((126 ^ 60) ^ (66 ^ 32)) ^ (-" ".length()));
                    }
                } else if (lIlllIIIllIII(worldArea.contains(((Player) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return llIlllIIIl[0];
                }
                i++;
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llIlllIIIl[1];
    }

    private static boolean lIlllIIIllIIl(int i) {
        return i > 0;
    }

    private static boolean lIlllIIIlllIl(int i, int i2) {
        return i > i2;
    }

    private static String lIlllIIIlIIII(String llllllllllllllllllIIIIllIIIlllll, String llllllllllllllllllIIIIllIIIllllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIIllIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIllIIIllllI.getBytes(StandardCharsets.UTF_8)), llIlllIIIl[16]), "DES");
            Cipher llllllllllllllllllIIIIllIIlIIIIl = Cipher.getInstance("DES");
            llllllllllllllllllIIIIllIIlIIIIl.init(llIlllIIIl[3], llllllllllllllllllIIIIllIIlIIIlI);
            return new String(llllllllllllllllllIIIIllIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIllIIlIIIII) {
            llllllllllllllllllIIIIllIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIlIIIl(String llllllllllllllllllIIIIllIIIIllll, String llllllllllllllllllIIIIllIIIIlllI) {
        String llllllllllllllllllIIIIllIIIIllll2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIllIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIIIIllIIIIllII = llllllllllllllllllIIIIllIIIIlllI.toCharArray();
        int llllllllllllllllllIIIIllIIIIlIll = llIlllIIIl[1];
        char[] charArray = llllllllllllllllllIIIIllIIIIllll2.toCharArray();
        int length = charArray.length;
        int i = llIlllIIIl[1];
        while (lIlllIIIlIlIl(i, length)) {
            char llllllllllllllllllIIIIllIIIlIIII = charArray[i];
            sb.append((char) (llllllllllllllllllIIIIllIIIlIIII ^ llllllllllllllllllIIIIllIIIIllII[llllllllllllllllllIIIIllIIIIlIll % llllllllllllllllllIIIIllIIIIllII.length]));
            "".length();
            llllllllllllllllllIIIIllIIIIlIll++;
            i++;
            "".length();
            if ((-" ".length()) > ((37 ^ 40) & ((54 ^ 59) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static int lIlllIIIllIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlllIIIlllII(int i) {
        return i < 0;
    }

    private static void lIlllIIIlIlII() {
        llIlllIIIl = new int[68];
        llIlllIIIl[0] = " ".length();
        llIlllIIIl[1] = (85 ^ 107) & ((144 ^ 174) ^ (-1));
        llIlllIIIl[2] = (-3201) & 3579;
        llIlllIIIl[3] = "  ".length();
        llIlllIIIl[4] = (-((-3717) & 11959)) & (-18502) & 31743;
        llIlllIIIl[5] = (((189 + 74) - 168) + 124) ^ (((99 + 46) - 48) + 98);
        llIlllIIIl[6] = (-((-8467) & 28603)) & (-7) & 32767;
        llIlllIIIl[7] = (-8353) & 16361;
        llIlllIIIl[8] = 123 ^ 113;
        llIlllIIIl[9] = (-((-545) & 21051)) & (-2082) & 622587;
        llIlllIIIl[10] = "   ".length();
        llIlllIIIl[11] = (109 ^ 74) ^ (73 ^ 40);
        llIlllIIIl[12] = 9 ^ 13;
        llIlllIIIl[13] = 161 ^ 164;
        llIlllIIIl[14] = 83 ^ 85;
        llIlllIIIl[15] = (145 ^ 180) ^ (88 ^ 122);
        llIlllIIIl[16] = (25 ^ 51) ^ (168 ^ 138);
        llIlllIIIl[17] = 38 ^ 47;
        llIlllIIIl[18] = (25 ^ 60) ^ (4 ^ 42);
        llIlllIIIl[19] = (((154 + 74) - 201) + 157) ^ (((70 + 1) - 40) + 149);
        llIlllIIIl[20] = 61 ^ 48;
        llIlllIIIl[21] = 78 ^ 64;
        llIlllIIIl[22] = 191 ^ 176;
        llIlllIIIl[23] = (170 ^ 157) ^ (146 ^ 181);
        llIlllIIIl[24] = (-((-2181) & 11397)) & (-20545) & 32764;
        llIlllIIIl[25] = (-29266) & 32497;
        llIlllIIIl[26] = 108 ^ 45;
        llIlllIIIl[27] = 141 ^ 170;
        llIlllIIIl[28] = (-((-665) & 30363)) & (-1) & 32751;
        llIlllIIIl[29] = (-25153) & 28399;
        llIlllIIIl[30] = 171 ^ 186;
        llIlllIIIl[31] = (-16419) & 31418;
        llIlllIIIl[32] = (-((-5443) & 5959)) & (-2050) & 32565;
        llIlllIIIl[33] = (10 ^ 60) ^ (52 ^ 102);
        llIlllIIIl[34] = 93 ^ 79;
        llIlllIIIl[35] = (74 ^ 71) ^ (63 ^ 81);
        llIlllIIIl[36] = (0 ^ 59) ^ (26 ^ 50);
        llIlllIIIl[37] = (-12299) & 14074;
        llIlllIIIl[38] = (-16388) & 19855;
        llIlllIIIl[39] = (-((-2434) & 23007)) & (-10241) & 32605;
        llIlllIIIl[40] = (-((-28401) & 32500)) & (-25153) & 32759;
        llIlllIIIl[41] = (-((-14489) & 31165)) & (-17) & 18429;
        llIlllIIIl[42] = (-((-3739) & 16027)) & (-16993) & 32749;
        llIlllIIIl[43] = (-10548) & 12279;
        llIlllIIIl[44] = (-((-1401) & 10111)) & (-16457) & 28670;
        llIlllIIIl[45] = (-((-1273) & 31993)) & (-257) & 32766;
        llIlllIIIl[46] = (-24837) & 26622;
        llIlllIIIl[47] = (-29265) & 32767;
        llIlllIIIl[48] = (-16649) & 18413;
        llIlllIIIl[49] = (-((-2995) & 31667)) & (-2330) & 32767;
        llIlllIIIl[50] = (-573) & 4095;
        llIlllIIIl[51] = (-((-1155) & 13731)) & (-16387) & 30711;
        llIlllIIIl[52] = (-8469) & 10143;
        llIlllIIIl[53] = (-((-7366) & 32495)) & (-65) & 28671;
        llIlllIIIl[54] = (-((-8739) & 25379)) & (-75) & 18431;
        llIlllIIIl[55] = (-((-3115) & 7803)) & (-33) & 8187;
        llIlllIIIl[56] = (-((-203) & 23003)) & (-1) & 24573;
        llIlllIIIl[57] = (-((-3457) & 32155)) & (-609) & 32767;
        llIlllIIIl[58] = (-25618) & 28671;
        llIlllIIIl[59] = (-2) & 3247;
        llIlllIIIl[60] = 170 ^ 190;
        llIlllIIIl[61] = 209 ^ 196;
        llIlllIIIl[62] = (((116 + 9) - 118) + 129) ^ (((77 + 39) - 8) + 50);
        llIlllIIIl[63] = (-23154) & 24319;
        llIlllIIIl[64] = (-((-2235) & 19134)) & (-4293) & 24575;
        llIlllIIIl[65] = (-((-3861) & 32765)) & (-2049) & 31739;
        llIlllIIIl[66] = (-((-20053) & 24413)) & (-26689) & 31743;
        llIlllIIIl[67] = (227 ^ 130) ^ (108 ^ 26);
    }

    public static void aE() {
        if (lIlllIIIlllII(lIlllIIIllIlI(C0018e.a(cD), llIlllIIIl[9] + cI))) {
            if (lIlllIIIlIllI(Players.getLocal().getWorldLocation().equals(cC) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllll[llIlllIIIl[10]];
                if (lIlllIIIlIlIl(Movement.getRunEnergy(), llIlllIIIl[11]) && lIlllIIIllIII(Inventory.contains(C0019f.ba) ? 1 : 0)) {
                    Inventory.getFirst(C0019f.ba).interact(llIllIllll[llIlllIIIl[12]]);
                    Time.sleepTicks(llIlllIIIl[0]);
                    "".length();
                }
                if (lIlllIIIlIllI(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cB), llIlllIIIl[10])) {
                        AccBuilderSotf.c = llIllIllll[llIlllIIIl[13]];
                        Movement.walkTo(cB);
                        "".length();
                        Time.sleepTicks(llIlllIIIl[0]);
                        "".length();
                    }
                    if (lIlllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(cB), llIlllIIIl[10])) {
                        AccBuilderSotf.c = llIllIllll[llIlllIIIl[14]];
                        if (lIlllIIIlIlIl(cG, llIlllIIIl[0])) {
                            C0018e.x();
                            cG += llIlllIIIl[0];
                        }
                        String[] strArr = new String[llIlllIIIl[0]];
                        strArr[llIlllIIIl[1]] = llIllIllll[llIlllIIIl[15]];
                        NPC nearest = NPCs.getNearest(strArr);
                        if (lIlllIIIlIlll(nearest)) {
                            String[] strArr2 = new String[llIlllIIIl[0]];
                            strArr2[llIlllIIIl[1]] = llIllIllll[llIlllIIIl[16]];
                            if (lIlllIIIllIII(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(llIllIllll[llIlllIIIl[17]]);
                                Time.sleepTicks(llIlllIIIl[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[llIlllIIIl[0]];
                            strArr3[llIlllIIIl[1]] = llIllIllll[llIlllIIIl[8]];
                            if (lIlllIIIlIllI(nearest.hasAction(strArr3) ? 1 : 0)) {
                                C0020g.b(llIllIllll[llIlllIIIl[18]], cE);
                                Time.sleepTicks(llIlllIIIl[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIlllIIIllIII(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(cC);
                    "".length();
                    Time.sleepTicks(llIlllIIIl[0]);
                    "".length();
                }
            }
            if (lIlllIIIllIII(Players.getLocal().getWorldLocation().equals(cC) ? 1 : 0)) {
                if (lIlllIIIlllII(lIlllIIIllIll(C0018e.w(), 45.0d))) {
                    int[] iArr = new int[llIlllIIIl[0]];
                    iArr[llIlllIIIl[1]] = llIlllIIIl[2];
                    if (lIlllIIIllIII(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[llIlllIIIl[0]];
                        iArr2[llIlllIIIl[1]] = llIlllIIIl[2];
                        Inventory.getFirst(iArr2).interact(llIllIllll[llIlllIIIl[19]]);
                        Time.sleepTicks(llIlllIIIl[0]);
                        "".length();
                    }
                }
                if (lIlllIIIlIllI(aG() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllll[llIlllIIIl[20]];
                    Time.sleepTicks(llIlllIIIl[15]);
                    "".length();
                }
                if (lIlllIIIllIII(aG() ? 1 : 0)) {
                    new WorldArea(cC, llIlllIIIl[3], llIlllIIIl[3]);
                    NPC aF = aF();
                    AccBuilderSotf.c = llIllIllll[llIlllIIIl[21]];
                    if (lIlllIIIlllll(Players.getLocal().getInteracting()) && lIlllIIIlIlll(aF) && lIlllIIIlIllI(aF.isDead() ? 1 : 0)) {
                        System.out.println(llIllIllll[llIlllIIIl[22]]);
                        aF.interact(llIllIllll[llIlllIIIl[23]]);
                        Time.sleepTicks(llIlllIIIl[3]);
                        "".length();
                    }
                    Time.sleepTicks(llIlllIIIl[12]);
                    "".length();
                }
            }
        }
        if (lIlllIIlIIIII(lIlllIIIllIlI(C0018e.a(cD), llIlllIIIl[9] + cI))) {
            WorldArea worldArea = new WorldArea(llIlllIIIl[24], llIlllIIIl[25], llIlllIIIl[26], llIlllIIIl[27], llIlllIIIl[1]);
            WorldPoint worldPoint = new WorldPoint(llIlllIIIl[28], llIlllIIIl[29], llIlllIIIl[1]);
            if (lIlllIIIllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlllIIIl[13])) {
                Movement.walkTo(worldPoint);
                "".length();
            }
            AccBuilderSotf.c = llIllIllll[llIlllIIIl[30]];
            Movement.walkTo(cs);
            "".length();
            Time.sleepTicks(llIlllIIIl[0]);
            "".length();
            if (lIlllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(cs), llIlllIIIl[3])) {
                cD = System.currentTimeMillis();
                cI = C0018e.c(llIlllIIIl[31], llIlllIIIl[32]);
            }
        }
    }

    private static boolean lIlllIIIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllIIIllIII(int i) {
        return i != 0;
    }

    private static boolean lIlllIIIlIllI(int i) {
        return i == 0;
    }

    static {
        lIlllIIIlIlII();
        lIlllIIIlIIll();
        cm = new WorldPoint(llIlllIIIl[37], llIlllIIIl[38], llIlllIIIl[1]);
        cn = new WorldPoint(llIlllIIIl[39], llIlllIIIl[40], llIlllIIIl[1]);
        co = new WorldPoint(llIlllIIIl[41], llIlllIIIl[42], llIlllIIIl[1]);
        cp = new WorldPoint(llIlllIIIl[43], llIlllIIIl[44], llIlllIIIl[1]);
        cq = new WorldPoint(llIlllIIIl[45], llIlllIIIl[38], llIlllIIIl[1]);
        cr = new WorldPoint(llIlllIIIl[46], llIlllIIIl[47], llIlllIIIl[1]);
        cs = new WorldPoint(llIlllIIIl[39], llIlllIIIl[40], llIlllIIIl[1]);
        ct = new WorldPoint(llIlllIIIl[48], llIlllIIIl[38], llIlllIIIl[1]);
        cu = new WorldPoint(llIlllIIIl[49], llIlllIIIl[50], llIlllIIIl[1]);
        cv = new WorldPoint(llIlllIIIl[51], llIlllIIIl[42], llIlllIIIl[1]);
        cw = new WorldPoint(llIlllIIIl[49], llIlllIIIl[50], llIlllIIIl[1]);
        cx = new WorldPoint(llIlllIIIl[52], llIlllIIIl[53], llIlllIIIl[1]);
        cy = new WorldPoint(llIlllIIIl[54], llIlllIIIl[55], llIlllIIIl[1]);
        cz = new WorldPoint(llIlllIIIl[56], llIlllIIIl[57], llIlllIIIl[1]);
        cA = new WorldPoint(llIlllIIIl[39], llIlllIIIl[40], llIlllIIIl[1]);
        cB = new WorldPoint(llIlllIIIl[58], llIlllIIIl[59], llIlllIIIl[1]);
        cC = new WorldPoint(llIlllIIIl[37], llIlllIIIl[38], llIlllIIIl[1]);
        cD = System.currentTimeMillis();
        String[] strArr = new String[llIlllIIIl[10]];
        strArr[llIlllIIIl[1]] = llIllIllll[llIlllIIIl[60]];
        strArr[llIlllIIIl[0]] = llIllIllll[llIlllIIIl[61]];
        strArr[llIlllIIIl[3]] = llIllIllll[llIlllIIIl[62]];
        cE = strArr;
        cF = new WorldArea(llIlllIIIl[63], llIlllIIIl[64], llIlllIIIl[65], llIlllIIIl[66], llIlllIIIl[1]);
        cG = llIlllIIIl[1];
        cI = C0018e.c(llIlllIIIl[31], llIlllIIIl[32]);
    }

    static NPC aF() {
        WorldPoint worldPoint = cC;
        WorldPoint worldPoint2 = new WorldPoint(cC.getX() - llIlllIIIl[0], cC.getWorldY() + llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(cC.getX(), cC.getWorldY() + llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(cC.getX() + llIlllIIIl[0], cC.getWorldY() + llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(cC.getX() + llIlllIIIl[0], cC.getWorldY(), llIlllIIIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(cC.getX() + llIlllIIIl[0], cC.getWorldY() - llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(cC.getX(), cC.getWorldY() - llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(cC.getX() - llIlllIIIl[0], cC.getWorldY() - llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(cC.getX() - llIlllIIIl[0], cC.getWorldY(), llIlllIIIl[1]);
        List all = NPCs.getAll(npc -> {
            return npc.getName().equalsIgnoreCase(llIllIllll[llIlllIIIl[36]]);
        });
        if (lIlllIIIlIlll(all)) {
            List of = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int i = llIlllIIIl[1];
            while (lIlllIIIlIlIl(i, all.size())) {
                if (lIlllIIIllIII(of.contains(((NPC) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC) all.get(i);
                }
                i++;
                "".length();
                if ((-((233 ^ 146) ^ (245 ^ 139))) >= 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
