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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.z  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/z.class */
public class C0025z implements S {
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint gu;
    public static final /* synthetic */ int gt;
    private static /* synthetic */ int[] llllIIIIII;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ int gs;
    public static final /* synthetic */ int gr;
    public static /* synthetic */ WorldPoint gw;
    private static /* synthetic */ String[] lllIlllllI;
    public static /* synthetic */ List<C0003d> bu;
    static /* synthetic */ int ck;
    private static final /* synthetic */ String[] gv;
    static /* synthetic */ int bS;

    private static void ae() {
        int[] iArr = new int[llllIIIIII[1]];
        iArr[llllIIIIII[0]] = llllIIIIII[9];
        if (llIIlIllIIIII(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(llllIIIIII[9], llllIIIIII[1], llllIIIIII[6]));
            "".length();
        }
        int[] iArr2 = new int[llllIIIIII[1]];
        iArr2[llllIIIIII[0]] = llllIIIIII[8];
        if (llIIlIllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(llllIIIIII[8], llllIIIIII[1], llllIIIIII[6]));
            "".length();
        }
        int[] iArr3 = new int[llllIIIIII[1]];
        iArr3[llllIIIIII[0]] = llllIIIIII[7];
        if (llIIlIllIIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(llllIIIIII[7], llllIIIIII[1], llllIIIIII[6]));
            "".length();
        }
        int[] iArr4 = new int[llllIIIIII[1]];
        iArr4[llllIIIIII[0]] = llllIIIIII[10];
        if (llIIlIllIIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllIIIIII[10], llllIIIIII[14], llllIIIIII[15]));
            "".length();
        }
        if (llIIlIllIIIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIlllllI[llllIIIIII[23]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(llllIIIIII[16], llllIIIIII[11], llllIIIIII[17]));
            "".length();
        }
        int[] iArr5 = new int[llllIIIIII[1]];
        iArr5[llllIIIIII[0]] = llllIIIIII[18];
        if (llIIlIllIIIII(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(llllIIIIII[18], llllIIIIII[19], llllIIIIII[20]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllIIIIII[1]];
        iArr[llllIIIIII[0]] = llllIIIIII[7];
        if (llIIlIllIIIll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[llllIIIIII[1]];
            iArr2[llllIIIIII[0]] = llllIIIIII[9];
            if (llIIlIllIIIll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[llllIIIIII[1]];
                iArr3[llllIIIIII[0]] = llllIIIIII[8];
                if (llIIlIllIIIll(Inventory.getCount(iArr3))) {
                    ?? r0 = llllIIIIII[1];
                    "".length();
                    return (((((99 + 57) - 23) + 87) ^ (((79 + 16) - (-32)) + 7)) & (((109 ^ 81) ^ (59 ^ 93)) ^ (-" ".length()))) >= " ".length() ? ((((72 + 14) - 43) + 98) ^ (((100 + 137) - 233) + 154)) & (((((84 + 184) - 103) + 48) ^ (((168 + 108) - 172) + 94)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llllIIIIII[0];
    }

    private static boolean llIIlIllIIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlIllIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIIlIllIIIll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIlIlllIIIl(C0004e.j(llllIIIIII[3]), llllIIIIII[4])) {
            ?? r0 = llllIIIIII[1];
            "".length();
            return "   ".length() < 0 ? ((170 ^ 157) ^ "  ".length()) & (((217 ^ 159) ^ (229 ^ 150)) ^ (-" ".length())) : r0;
        }
        return llllIIIIII[0];
    }

    static {
        llIIlIlIlllIl();
        llIIlIlIlllII();
        gt = llllIIIIII[7];
        gs = llllIIIIII[8];
        gr = llllIIIIII[9];
        gu = new WorldPoint(llllIIIIII[24], llllIIIIII[25], llllIIIIII[0]);
        String[] strArr = new String[llllIIIIII[11]];
        strArr[llllIIIIII[0]] = lllIlllllI[llllIIIIII[14]];
        strArr[llllIIIIII[1]] = lllIlllllI[llllIIIIII[26]];
        strArr[llllIIIIII[4]] = lllIlllllI[llllIIIIII[27]];
        strArr[llllIIIIII[5]] = lllIlllllI[llllIIIIII[28]];
        strArr[llllIIIIII[2]] = lllIlllllI[llllIIIIII[29]];
        gv = strArr;
        gw = new WorldPoint(llllIIIIII[30], llllIIIIII[31], llllIIIIII[4]);
        bu = new ArrayList();
        bS = llllIIIIII[0];
    }

    private static String llIIlIlIllIlI(String lllllllllllllllllIllIIIllIlIIlII, String lllllllllllllllllIllIIIllIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllllIllIIIllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIIIllIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIIIllIlIIllI.init(llllIIIIII[4], lllllllllllllllllIllIIIllIlIIlll);
            return new String(lllllllllllllllllIllIIIllIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIIllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIIllIlIIlIl) {
            lllllllllllllllllIllIIIllIlIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static void bU() {
        if (llIIlIlIllllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[0]];
            C0001b.a(bu);
            if (llIIlIlIlllll(bu.size(), llllIIIIII[1])) {
                System.out.println(lllIlllllI[llllIIIIII[1]]);
                bs = llllIIIIII[0];
            }
        }
        if (llIIlIllIIIII(bs ? 1 : 0)) {
            if (llIIlIllIIIII(aa() ? 1 : 0) && llIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[2]) && llIIlIlIlllll(C0004e.j(llllIIIIII[3]), llllIIIIII[4])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIllIIIlI(nearest) && llIIlIllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[4]];
                    C0000a.a(nearest);
                }
                if (llIIlIllIIIlI(nearest) && llIIlIlIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[5]];
                    if (llIIlIllIIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIIIIII[6]);
                        "".length();
                    }
                    if (llIIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        if (llIIlIllIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIIIIII[2]);
                            "".length();
                        }
                        if (llIIlIllIIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIIIIII[4]);
                            "".length();
                        }
                        int[] iArr = new int[llllIIIIII[2]];
                        iArr[llllIIIIII[0]] = llllIIIIII[7];
                        iArr[llllIIIIII[1]] = llllIIIIII[8];
                        iArr[llllIIIIII[4]] = llllIIIIII[9];
                        iArr[llllIIIIII[5]] = llllIIIIII[10];
                        if (llIIlIllIIIII(C0004e.b(iArr) ? 1 : 0)) {
                            ae();
                            System.out.println(lllIlllllI[llllIIIIII[2]]);
                            bs = llllIIIIII[1];
                            return;
                        }
                        if (llIIlIlIllllI(AccBuilderTempleTrek.f3e ? 1 : 0)) {
                            C0000a.b(C0005f.be, llllIIIIII[1]);
                        }
                        int[] iArr2 = new int[llllIIIIII[2]];
                        iArr2[llllIIIIII[0]] = llllIIIIII[7];
                        iArr2[llllIIIIII[1]] = llllIIIIII[8];
                        iArr2[llllIIIIII[4]] = llllIIIIII[9];
                        iArr2[llllIIIIII[5]] = llllIIIIII[10];
                        if (llIIlIlIllllI(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llllIIIIII[2]];
                            iArr3[llllIIIIII[0]] = llllIIIIII[7];
                            iArr3[llllIIIIII[1]] = llllIIIIII[8];
                            iArr3[llllIIIIII[4]] = llllIIIIII[9];
                            iArr3[llllIIIIII[5]] = llllIIIIII[10];
                            C0000a.a(iArr3);
                        }
                    }
                }
            }
            if ((!llIIlIllIIIII(aa() ? 1 : 0) || llIIlIllIIlII(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[2])) && llIIlIlIlllll(C0004e.j(llllIIIIII[3]), llllIIIIII[4])) {
                AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[11]];
                if (llIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[5])) {
                    ck = llllIIIIII[0];
                    Movement.walkTo(gu);
                    "".length();
                }
                if (llIIlIllIIlII(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[5])) {
                    if (llIIlIlIlllll(ck, llllIIIIII[1])) {
                        ac.nb += llllIIIIII[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllIIIIII[1];
                        ac.nb = llllIIIIII[0];
                        cl = llllIIIIII[0];
                    }
                    AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[12]];
                    if (llIIlIlIlllll(bS, llllIIIIII[1])) {
                        C0004e.v();
                        bS += llllIIIIII[1];
                    }
                    C0006g.a(lllIlllllI[llllIIIIII[13]], gv);
                }
            }
            C0006g.a(new String[llllIIIIII[0]]);
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            bU();
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return ((((20 + 72) - (-95)) + 1) ^ (((180 + 11) - 140) + 133)) & (((230 ^ 169) ^ (107 ^ 32)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return llllIIIIII[21];
    }

    private static boolean llIIlIlllIIIl(int i, int i2) {
        return i == i2;
    }

    private static void llIIlIlIlllII() {
        lllIlllllI = new String[llllIIIIII[32]];
        lllIlllllI[llllIIIIII[0]] = llIIlIlIllIIl("OD8tHxgdaj0CExc5", "zJTvv");
        lllIlllllI[llllIIIIII[1]] = llIIlIlIllIlI("wCeRHt6QgkfD7JLvxm+j3Iub+8DFoNeP4+i0R38ONQ1K0XZAMbI5iKimM+xipT/F", "MDOuh");
        lllIlllllI[llllIIIIII[4]] = llIIlIlIllIlI("a/eMIkfaJQW81zLRKYM3ew==", "EcLPN");
        lllIlllllI[llllIIIIII[5]] = llIIlIlIllIIl("BgQWHj0nCx9aMy8LExM/KQ==", "NexzQ");
        lllIlllllI[llllIIIIII[2]] = llIIlIlIllIlI("vHvEVzaFONphPNuzGb5M8Yia6y17gA+4gandyfLVznTtx+pHqRe+e1Drml8VYRfH9QqOvg4g4j0=", "JuVaA");
        lllIlllllI[llllIIIIII[11]] = llIIlIlIllIlI("QDHDf5v5UrKZWc5sIT8/kA==", "veIQI");
        lllIlllllI[llllIIIIII[12]] = llIIlIlIllIIl("OysUJzgaJB1jMBorFiwz", "sJzCT");
        lllIlllllI[llllIIIIII[13]] = llIIlIlIllIlI("ZWahxn32WPA=", "pivwj");
        lllIlllllI[llllIIIIII[22]] = llIIlIlIllIll("NFj4smh3w24kyDLjKAvpVCMbYrQxZcII", "rkkZy");
        lllIlllllI[llllIIIIII[23]] = llIIlIlIllIll("VlaYgQmWeIR+cfoo1F464XqFCWcemmMa", "zZxIa");
        lllIlllllI[llllIIIIII[14]] = llIIlIlIllIlI("4sPM5M0xjTqw5g6piu0AIEH7JwFzX4Je", "RmYNK");
        lllIlllllI[llllIIIIII[26]] = llIIlIlIllIll("dMQqZMpjyd1mE0xEHFX9VWQrfTKlqGuXkSwdXyCZPlebsxBlTNqJWNbESWiqXqX1", "lXsaO");
        lllIlllllI[llllIIIIII[27]] = llIIlIlIllIll("Nn0II0inzJT+MER2to8xtuFuRT6UiMsDGSJe/7ZLgCPKRX7M5GLBAs1yTpDx/av/", "OxnLR");
        lllIlllllI[llllIIIIII[28]] = llIIlIlIllIIl("CDUBYQ==", "QPrOI");
        lllIlllllI[llllIIIIII[29]] = llIIlIlIllIll("QCQArTmza2ts1+tuJo6wCQ==", "KBYrp");
    }

    private static String llIIlIlIllIll(String lllllllllllllllllIllIIIllIIlIlll, String lllllllllllllllllIllIIIllIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllllIllIIIllIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIIllIIlIllI.getBytes(StandardCharsets.UTF_8)), llllIIIIII[22]), "DES");
            Cipher lllllllllllllllllIllIIIllIIllIIl = Cipher.getInstance("DES");
            lllllllllllllllllIllIIIllIIllIIl.init(llllIIIIII[4], lllllllllllllllllIllIIIllIIllIlI);
            return new String(lllllllllllllllllIllIIIllIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIIllIIllIII) {
            lllllllllllllllllIllIIIllIIllIII.printStackTrace();
            return null;
        }
    }

    private static String llIIlIlIllIIl(String lllllllllllllllllIllIIIllIIIIlll, String lllllllllllllllllIllIIIllIIIIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllIIIllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllIIIllIIIIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllllIllIIIllIIIIllI.toCharArray();
        int lllllllllllllllllIllIIIllIIIIIll = llllIIIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIIIII[0];
        while (llIIlIlIlllll(i, length)) {
            lllllllllllllllllIllIIIllIIIIlIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIllIIIllIIIIIll % charArray.length]));
            "".length();
            lllllllllllllllllIllIIIllIIIIIll++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIllIIIllIIIIlIl);
    }

    private static boolean llIIlIllIIIII(int i) {
        return i == 0;
    }

    private static boolean llIIlIllIIlII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIIIIII[0];
    }

    private static boolean llIIlIlIlllll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIlIllllI(int i) {
        return i != 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllIlllllI[llllIIIIII[22]];
    }

    private static void llIIlIlIlllIl() {
        llllIIIIII = new int[33];
        llllIIIIII[0] = (245 ^ 148) & ((205 ^ 172) ^ (-1));
        llllIIIIII[1] = " ".length();
        llllIIIIII[2] = (99 ^ 107) ^ (100 ^ 104);
        llllIIIIII[3] = 126 ^ 99;
        llllIIIIII[4] = "  ".length();
        llllIIIIII[5] = "   ".length();
        llllIIIIII[6] = (-((-18405) & 28661)) & (-69) & 15324;
        llllIIIIII[7] = (-((-521) & 12875)) & (-16401) & 30687;
        llllIIIIII[8] = (-16453) & 18396;
        llllIIIIII[9] = (-14441) & 16367;
        llllIIIIII[10] = (-8193) & 16200;
        llllIIIIII[11] = 174 ^ 171;
        llllIIIIII[12] = (15 ^ 27) ^ (10 ^ 24);
        llllIIIIII[13] = 34 ^ 37;
        llllIIIIII[14] = 200 ^ 194;
        llllIIIIII[15] = (-26628) & 28627;
        llllIIIIII[16] = (-4356) & 16335;
        llllIIIIII[17] = (-6212) & 31211;
        llllIIIIII[18] = (-((-2369) & 10745)) & (-16385) & 32767;
        llllIIIIII[19] = (99 ^ 77) ^ (75 ^ 77);
        llllIIIIII[20] = (-20498) & 22397;
        llllIIIIII[21] = (173 ^ 153) ^ (96 ^ 48);
        llllIIIIII[22] = (191 ^ 182) ^ " ".length();
        llllIIIIII[23] = 101 ^ 108;
        llllIIIIII[24] = (-((-2569) & 27161)) & (-329) & 28127;
        llllIIIIII[25] = (-((-1166) & 9663)) & (-513) & 12223;
        llllIIIIII[26] = (248 ^ 172) ^ (230 ^ 185);
        llllIIIIII[27] = (((131 + 73) - 82) + 85) ^ (((47 + 180) - 157) + 125);
        llllIIIIII[28] = (43 ^ 61) ^ (20 ^ 15);
        llllIIIIII[29] = (167 ^ 185) ^ (159 ^ 143);
        llllIIIIII[30] = (-25349) & 28557;
        llllIIIIII[31] = (-28769) & 31987;
        llllIIIIII[32] = 43 ^ 36;
    }
}
