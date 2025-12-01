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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.B  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/B.class */
public class B implements G {
    public static final /* synthetic */ int hM;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint hR;
    private static /* synthetic */ int[] lIIIlIllII;
    public static final /* synthetic */ int hN;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;
    private static final /* synthetic */ String[] hQ;
    public static final /* synthetic */ int hO;
    private static /* synthetic */ String[] lIIIlIlIll;
    static /* synthetic */ int ck;
    static /* synthetic */ int bT;
    public static final /* synthetic */ WorldPoint hP;

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIlIlIll[lIIIlIllII[22]];
    }

    private static void lllIllIIIIIl() {
        lIIIlIllII = new int[33];
        lIIIlIllII[0] = (218 ^ 138) & ((249 ^ 169) ^ (-1)) & (((91 ^ 110) & ((59 ^ 14) ^ (-1))) ^ (-1));
        lIIIlIllII[1] = " ".length();
        lIIIlIllII[2] = 153 ^ 157;
        lIIIlIllII[3] = (((77 + 52) - 0) + 45) ^ (((34 + 117) - 23) + 51);
        lIIIlIllII[4] = "  ".length();
        lIIIlIllII[5] = "   ".length();
        lIIIlIllII[6] = (-26659) & 31658;
        lIIIlIllII[7] = (-22531) & 24463;
        lIIIlIllII[8] = (-((-1701) & 24294)) & (-3) & 24539;
        lIIIlIllII[9] = (-((-28519) & 32623)) & (-18433) & 24463;
        lIIIlIllII[10] = (-((-1234) & 9463)) & (-147) & 16383;
        lIIIlIllII[11] = 152 ^ 157;
        lIIIlIllII[12] = 136 ^ 142;
        lIIIlIllII[13] = (((13 + 49) - 26) + 113) ^ (((39 + 50) - (-6)) + 51);
        lIIIlIllII[14] = (((13 + 2) - (-32)) + 127) ^ (((104 + 80) - 108) + 88);
        lIIIlIllII[15] = (-4139) & 6138;
        lIIIlIllII[16] = (-16436) & 28415;
        lIIIlIllII[17] = (-((-24893) & 31615)) & (-18) & 31739;
        lIIIlIllII[18] = (-((-22235) & 30459)) & (-16529) & 32759;
        lIIIlIllII[19] = (102 ^ 39) ^ (234 ^ 131);
        lIIIlIllII[20] = (-20609) & 22508;
        lIIIlIllII[21] = (((110 + 185) - 185) + 108) ^ (((45 + 0) - 22) + 167);
        lIIIlIllII[22] = 190 ^ 182;
        lIIIlIllII[23] = 134 ^ 143;
        lIIIlIllII[24] = (-((-5783) & 30423)) & (-4665) & 32511;
        lIIIlIllII[25] = (-((-13338) & 30075)) & (-8721) & 28671;
        lIIIlIllII[26] = 32 ^ 43;
        lIIIlIllII[27] = 68 ^ 72;
        lIIIlIllII[28] = (127 ^ 101) ^ (138 ^ 157);
        lIIIlIllII[29] = 92 ^ 82;
        lIIIlIllII[30] = (-((-27267) & 27623)) & (-8195) & 11759;
        lIIIlIllII[31] = (-20577) & 23795;
        lIIIlIllII[32] = 130 ^ 141;
    }

    private static boolean lllIllIIIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIlIllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static void bF() {
        if (lllIllIIIIlI(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[0]];
            C0001b.a(bv);
            if (lllIllIIIIll(bv.size(), lIIIlIllII[1])) {
                System.out.println(lIIIlIlIll[lIIIlIllII[1]]);
                bt = lIIIlIllII[0];
            }
        }
        if (lllIllIIIlII(bt ? 1 : 0)) {
            if (lllIllIIIlII(ab() ? 1 : 0) && lllIllIIIlIl(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[2]) && lllIllIIIIll(C0004e.j(lIIIlIllII[3]), lIIIlIllII[4])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIllIIIllI(nearest) && lllIllIIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[4]];
                    C0000a.a(nearest);
                }
                if (lllIllIIIllI(nearest) && lllIllIIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[5]];
                    if (lllIllIIIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlIllII[6]);
                        "".length();
                    }
                    if (lllIllIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lllIllIIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlIllII[2]);
                            "".length();
                        }
                        if (lllIllIIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlIllII[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlIllII[2]];
                        iArr[lIIIlIllII[0]] = lIIIlIllII[7];
                        iArr[lIIIlIllII[1]] = lIIIlIllII[8];
                        iArr[lIIIlIllII[4]] = lIIIlIllII[9];
                        iArr[lIIIlIllII[5]] = lIIIlIllII[10];
                        if (lllIllIIIlII(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIIlIlIll[lIIIlIllII[2]]);
                            bt = lIIIlIllII[1];
                            return;
                        }
                        if (lllIllIIIIlI(AccBuilderRogues.e ? 1 : 0)) {
                            C0000a.b(C0005f.bf, lIIIlIllII[1]);
                        }
                        int[] iArr2 = new int[lIIIlIllII[2]];
                        iArr2[lIIIlIllII[0]] = lIIIlIllII[7];
                        iArr2[lIIIlIllII[1]] = lIIIlIllII[8];
                        iArr2[lIIIlIllII[4]] = lIIIlIllII[9];
                        iArr2[lIIIlIllII[5]] = lIIIlIllII[10];
                        if (lllIllIIIIlI(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIIIlIllII[2]];
                            iArr3[lIIIlIllII[0]] = lIIIlIllII[7];
                            iArr3[lIIIlIllII[1]] = lIIIlIllII[8];
                            iArr3[lIIIlIllII[4]] = lIIIlIllII[9];
                            iArr3[lIIIlIllII[5]] = lIIIlIllII[10];
                            C0000a.a(iArr3);
                        }
                    }
                }
            }
            if ((!lllIllIIIlII(ab() ? 1 : 0) || lllIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[2])) && lllIllIIIIll(C0004e.j(lIIIlIllII[3]), lIIIlIllII[4])) {
                AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[11]];
                if (lllIllIIIlIl(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[5])) {
                    ck = lIIIlIllII[0];
                    Movement.walkTo(hP);
                    "".length();
                }
                if (lllIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[5])) {
                    if (lllIllIIIIll(ck, lIIIlIllII[1])) {
                        U.mV += lIIIlIllII[1];
                        U.o(AccBuilderRogues.m);
                        ck += lIIIlIllII[1];
                        U.mV = lIIIlIllII[0];
                        cl = lIIIlIllII[0];
                    }
                    AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[12]];
                    if (lllIllIIIIll(bT, lIIIlIllII[1])) {
                        C0004e.v();
                        bT += lIIIlIllII[1];
                    }
                    C0006g.a(lIIIlIlIll[lIIIlIllII[13]], hQ);
                }
            }
            C0006g.a(new String[lIIIlIllII[0]]);
        }
    }

    private static boolean lllIllIIIIll(int i, int i2) {
        return i < i2;
    }

    private static String lllIlIllllIl(String lIIlllIlIIlI, String lIIlllIlIIll) {
        try {
            SecretKeySpec lIIlllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIllII[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIllII[4], lIIlllIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlllIlIlIl) {
            lIIlllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String lllIlIlllllI(String lIIllIllIlll, String lIIllIllIllI) {
        String lIIllIllIlll2 = new String(Base64.getDecoder().decode(lIIllIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIllIlIl = new StringBuilder();
        char[] charArray = lIIllIllIllI.toCharArray();
        int lIIllIllIIll = lIIIlIllII[0];
        char[] charArray2 = lIIllIllIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIllII[0];
        while (lllIllIIIIll(i, length)) {
            char lIIllIlllIII = charArray2[i];
            lIIllIllIlIl.append((char) (lIIllIlllIII ^ charArray[lIIllIllIIll % charArray.length]));
            "".length();
            lIIllIllIIll++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lIIllIllIlIl);
    }

    private static boolean lllIllIIIIlI(int i) {
        return i != 0;
    }

    private static boolean lllIllIIIlII(int i) {
        return i == 0;
    }

    private static void lllIllIIIIII() {
        lIIIlIlIll = new String[lIIIlIllII[32]];
        lIIIlIlIll[lIIIlIllII[0]] = lllIlIllllIl("Qd3vPzfoWF2v0RHjX4UkPg==", "GBfqi");
        lIIIlIlIll[lIIIlIllII[1]] = lllIlIlllllI("JQYEIzYLCg5qJxYWAyQiQwYeLygQQ0o5MgobCSIsDQhKKCQABEo+KkMeHy82Fw==", "cojJE");
        lIIIlIlIll[lIIIlIllII[4]] = lllIlIllllIl("rLbkVCBeZiKHUtFfSnZDOg==", "vlTix");
        lIIIlIlIll[lIIIlIllII[5]] = lllIlIllllll("ksSuOOmNB1JhD+XmrG05WTbr1GMv6cKV", "ZfFCH");
        lIIIlIlIll[lIIIlIllII[2]] = lllIlIllllll("OoFXn3BMQ/BqqR269eA+y4qrt9YgHjg6t1wo1Cv61is9fZkEXxZi6OEYyn7fb/zbqjBD73O0e74=", "IHGGN");
        lIIIlIlIll[lIIIlIllII[11]] = lllIlIlllllI("HC4CUyY9bwcHMyA7", "ROtsR");
        lIIIlIlIll[lIIIlIllII[12]] = lllIlIllllIl("3khDQVuN/O7YCS9Bf/CHew==", "kfbSX");
        lIIIlIlIll[lIIIlIllII[13]] = lllIlIllllll("TvwQvEAdYV4=", "BequY");
        lIIIlIlIll[lIIIlIllII[22]] = lllIlIllllll("rPn8wLplQw+VYchmaJgee89wjbMWqCHH", "mJkHi");
        lIIIlIlIll[lIIIlIllII[23]] = lllIlIllllll("gYpg5RuRwS8WmkWlHLGGoufrdEXSXHBp", "qjqbP");
        lIIIlIlIll[lIIIlIllII[14]] = lllIlIlllllI("EjY9Si0+InMHNToycwcxcTZzCTU6Mmw=", "QWSjT");
        lIIIlIlIll[lIIIlIllII[26]] = lllIlIllllll("6FwJSjOuiqnkcZjgQhlEKgsJaUAqYxyqPtAxQcJAL29IuUJuVVH+NvO1BNy42qXQ", "hmcuV");
        lIIIlIlIll[lIIIlIllII[27]] = lllIlIlllllI("FSgNByU4JwBeZB1rEhwrI2sOGiEmLlkGK3QtEBwgdD8RGzd0OA0HIjJl", "TKyrD");
        lIIIlIlIll[lIIIlIllII[28]] = lllIlIllllll("Taw2UHCpP24=", "Jaoco");
        lIIIlIlIll[lIIIlIllII[29]] = lllIlIlllllI("PSUTEWgZbQUXIAQqTQ==", "jMreO");
    }

    private static boolean lllIllIIIlll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllIllIIlIIl(C0004e.j(lIIIlIllII[3]), lIIIlIllII[4])) {
            ?? r0 = lIIIlIllII[1];
            "".length();
            return "  ".length() >= (65 ^ 69) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlIllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIIlIllII[1]];
        iArr[lIIIlIllII[0]] = lIIIlIllII[7];
        if (lllIllIIIlll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIIlIllII[1]];
            iArr2[lIIIlIllII[0]] = lIIIlIllII[9];
            if (lllIllIIIlll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIIlIllII[1]];
                iArr3[lIIIlIllII[0]] = lIIIlIllII[8];
                if (lllIllIIIlll(Inventory.getCount(iArr3))) {
                    ?? r0 = lIIIlIllII[1];
                    "".length();
                    return 0 != 0 ? ((70 ^ 117) ^ (112 ^ 33)) & (((65 ^ 34) ^ " ".length()) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIIlIllII[0];
    }

    static {
        lllIllIIIIIl();
        lllIllIIIIII();
        hM = lIIIlIllII[9];
        hN = lIIIlIllII[8];
        hO = lIIIlIllII[7];
        hP = new WorldPoint(lIIIlIllII[24], lIIIlIllII[25], lIIIlIllII[0]);
        String[] strArr = new String[lIIIlIllII[11]];
        strArr[lIIIlIllII[0]] = lIIIlIlIll[lIIIlIllII[14]];
        strArr[lIIIlIllII[1]] = lIIIlIlIll[lIIIlIllII[26]];
        strArr[lIIIlIllII[4]] = lIIIlIlIll[lIIIlIllII[27]];
        strArr[lIIIlIllII[5]] = lIIIlIlIll[lIIIlIllII[28]];
        strArr[lIIIlIllII[2]] = lIIIlIlIll[lIIIlIllII[29]];
        hQ = strArr;
        hR = new WorldPoint(lIIIlIllII[30], lIIIlIllII[31], lIIIlIllII[4]);
        bv = new ArrayList();
        bT = lIIIlIllII[0];
    }

    private static void af() {
        int[] iArr = new int[lIIIlIllII[1]];
        iArr[lIIIlIllII[0]] = lIIIlIllII[9];
        if (lllIllIIIlII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIllII[9], lIIIlIllII[1], lIIIlIllII[6]));
            "".length();
        }
        int[] iArr2 = new int[lIIIlIllII[1]];
        iArr2[lIIIlIllII[0]] = lIIIlIllII[8];
        if (lllIllIIIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIllII[8], lIIIlIllII[1], lIIIlIllII[6]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlIllII[1]];
        iArr3[lIIIlIllII[0]] = lIIIlIllII[7];
        if (lllIllIIIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIllII[7], lIIIlIllII[1], lIIIlIllII[6]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlIllII[1]];
        iArr4[lIIIlIllII[0]] = lIIIlIllII[10];
        if (lllIllIIIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIllII[10], lIIIlIllII[14], lIIIlIllII[15]));
            "".length();
        }
        if (lllIllIIIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlIlIll[lIIIlIllII[23]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIllII[16], lIIIlIllII[11], lIIIlIllII[17]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlIllII[1]];
        iArr5[lIIIlIllII[0]] = lIIIlIllII[18];
        if (lllIllIIIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIllII[18], lIIIlIllII[19], lIIIlIllII[20]));
            "".length();
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            bF();
            "".length();
            if (0 != 0) {
                return ((221 ^ 181) ^ (6 ^ 92)) & (((219 ^ 160) ^ (125 ^ 52)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIIlIllII[21];
    }

    private static boolean lllIllIIlIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllIllIIIlIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIllIIlIIl(int i, int i2) {
        return i >= i2;
    }

    private static String lllIlIllllll(String lIIlllIIIlIl, String lIIlllIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIllII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlllIIlIII) {
            lIIlllIIlIII.printStackTrace();
            return null;
        }
    }
}
