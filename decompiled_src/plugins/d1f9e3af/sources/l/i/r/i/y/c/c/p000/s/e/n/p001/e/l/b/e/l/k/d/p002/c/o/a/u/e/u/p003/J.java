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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.J  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/J.class */
public class J implements W {
    private static /* synthetic */ int[] lIllllIIl;
    public static final /* synthetic */ int iL;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int iM;
    private static /* synthetic */ String[] lIllllIII;
    static /* synthetic */ boolean cm;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ int iK;
    public static /* synthetic */ WorldPoint iP;
    private static final /* synthetic */ String[] iO;
    static /* synthetic */ int cl;
    static /* synthetic */ int bT;
    public static final /* synthetic */ WorldPoint iN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static void cc() {
        if (lIIllllIIIlI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIllllIII[lIllllIIl[0]];
            C0001b.a(bv);
            if (lIIllllIIIll(bv.size(), lIllllIIl[1])) {
                System.out.println(lIllllIII[lIllllIIl[1]]);
                bt = lIllllIIl[0];
            }
        }
        if (lIIllllIIlII(bt ? 1 : 0)) {
            if (lIIllllIIlII(ab() ? 1 : 0) && lIIllllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iN), lIllllIIl[2]) && lIIllllIIIll(C0004e.j(lIllllIIl[3]), lIllllIIl[4])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIllllIIllI(nearest) && lIIllllIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllllIII[lIllllIIl[4]];
                    C0000a.a(nearest);
                }
                if (lIIllllIIllI(nearest) && lIIllllIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllllIII[lIllllIIl[5]];
                    if (lIIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllllIIl[6]);
                        "".length();
                    }
                    if (lIIllllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllllIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllllIIl[2]);
                            "".length();
                        }
                        if (lIIllllIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllllIIl[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIllllIIl[2]];
                        iArr[lIllllIIl[0]] = lIllllIIl[7];
                        iArr[lIllllIIl[1]] = lIllllIIl[8];
                        iArr[lIllllIIl[4]] = lIllllIIl[9];
                        iArr[lIllllIIl[5]] = lIllllIIl[10];
                        if (lIIllllIIlII(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIllllIII[lIllllIIl[2]]);
                            bt = lIllllIIl[1];
                            return;
                        }
                        if (lIIllllIIIlI(AccBuilderEasyClues.e ? 1 : 0)) {
                            C0000a.b(C0005f.bf, lIllllIIl[1]);
                        }
                        int[] iArr2 = new int[lIllllIIl[2]];
                        iArr2[lIllllIIl[0]] = lIllllIIl[7];
                        iArr2[lIllllIIl[1]] = lIllllIIl[8];
                        iArr2[lIllllIIl[4]] = lIllllIIl[9];
                        iArr2[lIllllIIl[5]] = lIllllIIl[10];
                        if (lIIllllIIIlI(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIllllIIl[2]];
                            iArr3[lIllllIIl[0]] = lIllllIIl[7];
                            iArr3[lIllllIIl[1]] = lIllllIIl[8];
                            iArr3[lIllllIIl[4]] = lIllllIIl[9];
                            iArr3[lIllllIIl[5]] = lIllllIIl[10];
                            C0000a.a(iArr3);
                        }
                    }
                }
            }
            if ((!lIIllllIIlII(ab() ? 1 : 0) || lIIllllIlIII(Players.getLocal().getWorldLocation().distanceTo(iN), lIllllIIl[2])) && lIIllllIIIll(C0004e.j(lIllllIIl[3]), lIllllIIl[4])) {
                AccBuilderEasyClues.c = lIllllIII[lIllllIIl[11]];
                if (lIIllllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iN), lIllllIIl[5])) {
                    cl = lIllllIIl[0];
                    Movement.walkTo(iN);
                    "".length();
                }
                if (lIIllllIlIII(Players.getLocal().getWorldLocation().distanceTo(iN), lIllllIIl[5])) {
                    if (lIIllllIIIll(cl, lIllllIIl[1])) {
                        an.pR += lIllllIIl[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIllllIIl[1];
                        an.pR = lIllllIIl[0];
                        cm = lIllllIIl[0];
                    }
                    AccBuilderEasyClues.c = lIllllIII[lIllllIIl[12]];
                    if (lIIllllIIIll(bT, lIllllIIl[1])) {
                        C0004e.v();
                        bT += lIllllIIl[1];
                    }
                    C0006g.a(lIllllIII[lIllllIIl[13]], iO);
                }
            }
            C0006g.a(new String[lIllllIIl[0]]);
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIllllIII[lIllllIIl[22]];
    }

    private static boolean lIIllllIIlII(int i) {
        return i == 0;
    }

    private static String lIIlllIllllI(String llIIIlIIIlIIII, String llIIIlIIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIIIlIIIl) {
            llIIIlIIIlIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIllllIIl[1]];
        iArr[lIllllIIl[0]] = lIllllIIl[7];
        if (lIIllllIIlll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIllllIIl[1]];
            iArr2[lIllllIIl[0]] = lIllllIIl[9];
            if (lIIllllIIlll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIllllIIl[1]];
                iArr3[lIllllIIl[0]] = lIllllIIl[8];
                if (lIIllllIIlll(Inventory.getCount(iArr3))) {
                    ?? r0 = lIllllIIl[1];
                    "".length();
                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIllllIIl[0];
    }

    private static boolean lIIllllIlIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllllIIlll(int i) {
        return i > 0;
    }

    private static void lIIllllIIIIl() {
        lIllllIIl = new int[33];
        lIllllIIl[0] = ((((106 + 105) - 146) + 74) ^ (((21 + 154) - 163) + 163)) & (((170 ^ 146) ^ (172 ^ 176)) ^ (-" ".length()));
        lIllllIIl[1] = " ".length();
        lIllllIIl[2] = (255 ^ 196) ^ (179 ^ 140);
        lIllllIIl[3] = 154 ^ 135;
        lIllllIIl[4] = "  ".length();
        lIllllIIl[5] = "   ".length();
        lIllllIIl[6] = (-27751) & 32750;
        lIllllIIl[7] = (-18449) & 20381;
        lIllllIIl[8] = (-((-24645) & 30796)) & (-65) & 8159;
        lIllllIIl[9] = (-22553) & 24479;
        lIllllIIl[10] = (-24628) & 32635;
        lIllllIIl[11] = 13 ^ 8;
        lIllllIIl[12] = 3 ^ 5;
        lIllllIIl[13] = (((51 + 118) - 15) + 1) ^ (((118 + 137) - 247) + 148);
        lIllllIIl[14] = 28 ^ 22;
        lIllllIIl[15] = (-30764) & 32763;
        lIllllIIl[16] = (-((-18565) & 18871)) & (-1) & 12286;
        lIllllIIl[17] = (-3137) & 28136;
        lIllllIIl[18] = (-49) & 8055;
        lIllllIIl[19] = (((38 + 26) - (-38)) + 67) ^ (((10 + 27) - 13) + 105);
        lIllllIIl[20] = (-30849) & 32748;
        lIllllIIl[21] = (119 ^ 85) ^ (82 ^ 20);
        lIllllIIl[22] = (((120 + 133) - 186) + 76) ^ (((21 + 119) - 69) + 64);
        lIllllIIl[23] = (127 ^ 6) ^ (75 ^ 59);
        lIllllIIl[24] = (-8801) & 12007;
        lIllllIIl[25] = (-25202) & 28415;
        lIllllIIl[26] = (212 ^ 182) ^ (60 ^ 85);
        lIllllIIl[27] = 119 ^ 123;
        lIllllIIl[28] = 202 ^ 199;
        lIllllIIl[29] = 126 ^ 112;
        lIllllIIl[30] = (-((-12505) & 29689)) & (-8211) & 28603;
        lIllllIIl[31] = (-16929) & 20147;
        lIllllIIl[32] = (((143 + 107) - 114) + 42) ^ (((53 + 97) - 9) + 48);
    }

    private static String lIIlllIlllll(String llIIIlIIlIIlIl, String llIIIlIIlIIlII) {
        String str = new String(Base64.getDecoder().decode(llIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIIlIIlIIlII.toCharArray();
        int llIIIlIIlIIIIl = lIllllIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllllIIl[0];
        while (lIIllllIIIll(i, length)) {
            char llIIIlIIlIIllI = charArray2[i];
            sb.append((char) (llIIIlIIlIIllI ^ charArray[llIIIlIIlIIIIl % charArray.length]));
            "".length();
            llIIIlIIlIIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIllllIlIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllllIIllI(Object obj) {
        return obj != null;
    }

    private static void af() {
        int[] iArr = new int[lIllllIIl[1]];
        iArr[lIllllIIl[0]] = lIllllIIl[9];
        if (lIIllllIIlII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIllllIIl[9], lIllllIIl[1], lIllllIIl[6]));
            "".length();
        }
        int[] iArr2 = new int[lIllllIIl[1]];
        iArr2[lIllllIIl[0]] = lIllllIIl[8];
        if (lIIllllIIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIllllIIl[8], lIllllIIl[1], lIllllIIl[6]));
            "".length();
        }
        int[] iArr3 = new int[lIllllIIl[1]];
        iArr3[lIllllIIl[0]] = lIllllIIl[7];
        if (lIIllllIIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIllllIIl[7], lIllllIIl[1], lIllllIIl[6]));
            "".length();
        }
        int[] iArr4 = new int[lIllllIIl[1]];
        iArr4[lIllllIIl[0]] = lIllllIIl[10];
        if (lIIllllIIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIllllIIl[10], lIllllIIl[14], lIllllIIl[15]));
            "".length();
        }
        if (lIIllllIIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllllIII[lIllllIIl[23]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIllllIIl[16], lIllllIIl[11], lIllllIIl[17]));
            "".length();
        }
        int[] iArr5 = new int[lIllllIIl[1]];
        iArr5[lIllllIIl[0]] = lIllllIIl[18];
        if (lIIllllIIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIllllIIl[18], lIllllIIl[19], lIllllIIl[20]));
            "".length();
        }
    }

    private static boolean lIIllllIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllllIIlIl(int i, int i2) {
        return i > i2;
    }

    private static void lIIllllIIIII() {
        lIllllIII = new String[lIllllIIl[32]];
        lIllllIII[lIllllIIl[0]] = lIIlllIlllIl("qt8eL/wzhnjzGga4AF6xsA==", "htbEc");
        lIllllIII[lIllllIIl[1]] = lIIlllIllllI("DpK6x+VgwWNaayDJqv7K7OkZB+mq9zTEgPGbILES9qobfMIb7PMuDm0VNVFeyheX", "YfJEw");
        lIllllIII[lIllllIIl[4]] = lIIlllIllllI("Z2JLkH7LkabuuE7Jl0VGlA==", "XcvsF");
        lIllllIII[lIllllIIl[5]] = lIIlllIllllI("8zagIrlLXY+IeU5y3BoVvl70LSknKup7", "PYWXd");
        lIllllIII[lIllllIIl[2]] = lIIlllIllllI("DHEH/ESwsJ89G3+Cdcn1Cbd8l6Kxbkf9RAg+CrxbfcVlwYdSKkXA3ws6udacs2ZMHaZEB073V+M=", "jggWf");
        lIllllIII[lIllllIIl[11]] = lIIlllIlllll("AggFcTMjSQAlJj4d", "LisQG");
        lIllllIII[lIllllIIl[12]] = lIIlllIlllll("PwoUMCEeBR10KR4KFjsq", "wkzTM");
        lIllllIII[lIllllIIl[13]] = lIIlllIllllI("SKGRqcIsh5w=", "GTump");
        lIllllIII[lIllllIIl[22]] = lIIlllIlllll("Kis9Jz5JBSE/JBowMyI5SRUnKT4d", "iDRLM");
        lIllllIII[lIllllIIl[23]] = lIIlllIlllIl("KFFn6xiQzvfv2+50VsGJ4DlJMoE6sEox", "DERES");
        lIllllIII[lIllllIIl[14]] = lIIlllIlllIl("Rs39AUCDERkIEEKC32/X1dp44FGGfcUP", "qpwpn");
        lIllllIII[lIllllIIl[26]] = lIIlllIlllll("H1Afdyw6ABMuPnYfEyc9L1cGOG0+Eh4nbTdXETgiPVcbOW0yHgEjPzMEAXk=", "VwrWM");
        lIllllIII[lIllllIIl[27]] = lIIlllIllllI("eWHUDUO0DVW6hbiPOKHmscyjqagl4o6188jNtt+MapTrsbniDQUkvWSSh05KiLeO", "YqvgD");
        lIllllIII[lIllllIIl[28]] = lIIlllIlllll("HQwEdg==", "DiwXa");
        lIllllIII[lIllllIIl[29]] = lIIlllIllllI("CF9+6LHPtTwgfdVMJ/HnbA==", "zlaxF");
    }

    static {
        lIIllllIIIIl();
        lIIllllIIIII();
        iL = lIllllIIl[8];
        iM = lIllllIIl[7];
        iK = lIllllIIl[9];
        iN = new WorldPoint(lIllllIIl[24], lIllllIIl[25], lIllllIIl[0]);
        String[] strArr = new String[lIllllIIl[11]];
        strArr[lIllllIIl[0]] = lIllllIII[lIllllIIl[14]];
        strArr[lIllllIIl[1]] = lIllllIII[lIllllIIl[26]];
        strArr[lIllllIIl[4]] = lIllllIII[lIllllIIl[27]];
        strArr[lIllllIIl[5]] = lIllllIII[lIllllIIl[28]];
        strArr[lIllllIIl[2]] = lIllllIII[lIllllIIl[29]];
        iO = strArr;
        iP = new WorldPoint(lIllllIIl[30], lIllllIIl[31], lIllllIIl[4]);
        bv = new ArrayList();
        bT = lIllllIIl[0];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            cc();
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return (92 ^ 17) & ((102 ^ 43) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIllllIIl[21];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIllllIIl[0];
    }

    private static String lIIlllIlllIl(String llIIIlIIIIIIll, String llIIIlIIIIIIlI) {
        try {
            SecretKeySpec llIIIlIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIllllIIl[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllIIl[4], llIIIlIIIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIIIIIlII) {
            llIIIlIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIllllIlIIl(C0004e.j(lIllllIIl[3]), lIllllIIl[4])) {
            ?? r0 = lIllllIIl[1];
            "".length();
            return ((129 ^ 157) & ((28 ^ 0) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllllIIl[0];
    }
}
