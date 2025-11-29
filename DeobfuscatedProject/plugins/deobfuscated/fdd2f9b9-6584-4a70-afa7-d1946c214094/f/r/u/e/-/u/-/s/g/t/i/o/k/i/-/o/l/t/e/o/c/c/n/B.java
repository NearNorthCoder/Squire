/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
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

public class B
implements G {
    public static final /* synthetic */ int hM;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint hR;
    private static /* synthetic */ int[] lIIIlIllII;
    public static final /* synthetic */ int hN;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ String[] hQ;
    public static final /* synthetic */ int hO;
    private static /* synthetic */ String[] lIIIlIlIll;
    static /* synthetic */ int ck;
    static /* synthetic */ int bT;
    public static final /* synthetic */ WorldPoint hP;

    @Override
    public String U() {
        return lIIIlIlIll[lIIIlIllII[22]];
    }

    private static void lllIllIIIIIl() {
        lIIIlIllII = new int[33];
        B.lIIIlIllII[0] = (0xDA ^ 0x8A) & ~(0xF9 ^ 0xA9) & ~((0x5B ^ 0x6E) & ~(0x3B ^ 0xE));
        B.lIIIlIllII[1] = 1;
        B.lIIIlIllII[2] = 0x99 ^ 0x9D;
        B.lIIIlIllII[3] = 77 + 52 - 0 + 45 ^ 34 + 117 - 23 + 51;
        B.lIIIlIllII[4] = 2;
        B.lIIIlIllII[5] = 3;
        B.lIIIlIllII[6] = 0xFFFF97DD & 0x7BAA;
        B.lIIIlIllII[7] = 0xFFFFA7FD & 0x5F8F;
        B.lIIIlIllII[8] = -(0xFFFFF95B & 0x5EE6) & (0xFFFFFFFD & 0x5FDB);
        B.lIIIlIllII[9] = -(0xFFFF9099 & 0x7F6F) & (0xFFFFB7FF & 0x5F8F);
        B.lIIIlIllII[10] = -(0xFFFFFB2E & 0x24F7) & (0xFFFFFF6D & 0x3FFF);
        B.lIIIlIllII[11] = 0x98 ^ 0x9D;
        B.lIIIlIllII[12] = 0x88 ^ 0x8E;
        B.lIIIlIllII[13] = 13 + 49 - 26 + 113 ^ 39 + 50 - -6 + 51;
        B.lIIIlIllII[14] = 13 + 2 - -32 + 127 ^ 104 + 80 - 108 + 88;
        B.lIIIlIllII[15] = 0xFFFFEFD5 & 0x17FA;
        B.lIIIlIllII[16] = 0xFFFFBFCC & 0x6EFF;
        B.lIIIlIllII[17] = -(0xFFFF9EC3 & 0x7B7F) & (0xFFFFFFEE & 0x7BFB);
        B.lIIIlIllII[18] = -(0xFFFFA925 & 0x76FB) & (0xFFFFBF6F & 0x7FF7);
        B.lIIIlIllII[19] = 0x66 ^ 0x27 ^ (0xEA ^ 0x83);
        B.lIIIlIllII[20] = 0xFFFFAF7F & 0x57EC;
        B.lIIIlIllII[21] = 110 + 185 - 185 + 108 ^ 45 + 0 - 22 + 167;
        B.lIIIlIllII[22] = 0xBE ^ 0xB6;
        B.lIIIlIllII[23] = 0x86 ^ 0x8F;
        B.lIIIlIllII[24] = -(0xFFFFE969 & 0x76D7) & (0xFFFFEDC7 & 0x7EFF);
        B.lIIIlIllII[25] = -(0xFFFFCBE6 & 0x757B) & (0xFFFFDDEF & 0x6FFF);
        B.lIIIlIllII[26] = 0x20 ^ 0x2B;
        B.lIIIlIllII[27] = 0x44 ^ 0x48;
        B.lIIIlIllII[28] = 0x7F ^ 0x65 ^ (0x8A ^ 0x9D);
        B.lIIIlIllII[29] = 0x5C ^ 0x52;
        B.lIIIlIllII[30] = -(0xFFFF957D & 0x6BE7) & (0xFFFFDFFD & 0x2DEF);
        B.lIIIlIllII[31] = 0xFFFFAF9F & 0x5CF3;
        B.lIIIlIllII[32] = 0x82 ^ 0x8D;
    }

    private static boolean lllIllIIIllI(Object object) {
        return object != null;
    }

    @Override
    public boolean S() {
        return lIIIlIllII[0];
    }

    public static void bF() {
        if (B.lllIllIIIIlI(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[0]];
            b.a(bv);
            if (B.lllIllIIIIll(bv.size(), lIIIlIllII[1])) {
                System.out.println(lIIIlIlIll[lIIIlIllII[1]]);
                bt = lIIIlIllII[0];
            }
        }
        if (B.lllIllIIIlII(bt ? 1 : 0)) {
            if (B.lllIllIIIlII(B.ab() ? 1 : 0) && B.lllIllIIIlIl(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[2]) && B.lllIllIIIIll(e.j(lIIIlIllII[3]), lIIIlIllII[4])) {
                BankLocation lIIllllIIIlI = BankLocation.getNearest();
                if (B.lllIllIIIllI(lIIllllIIIlI) && B.lllIllIIIlII(lIIllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[4]];
                    a.a(lIIllllIIIlI);
                }
                if (B.lllIllIIIllI(lIIllllIIIlI) && B.lllIllIIIIlI(lIIllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[5]];
                    if (B.lllIllIIIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIllII[6]);
                        0;
                    }
                    if (B.lllIllIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (B.lllIllIIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlIllII[2]);
                            0;
                        }
                        if (B.lllIllIIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlIllII[4]);
                            0;
                        }
                        int[] nArray = new int[lIIIlIllII[2]];
                        nArray[B.lIIIlIllII[0]] = lIIIlIllII[7];
                        nArray[B.lIIIlIllII[1]] = lIIIlIllII[8];
                        nArray[B.lIIIlIllII[4]] = lIIIlIllII[9];
                        nArray[B.lIIIlIllII[5]] = lIIIlIllII[10];
                        if (B.lllIllIIIlII(e.b(nArray) ? 1 : 0)) {
                            B.af();
                            System.out.println(lIIIlIlIll[lIIIlIllII[2]]);
                            bt = lIIIlIllII[1];
                            return;
                        }
                        if (B.lllIllIIIIlI(AccBuilderRogues.e ? 1 : 0)) {
                            a.b(f.bf, lIIIlIllII[1]);
                        }
                        int[] nArray2 = new int[lIIIlIllII[2]];
                        nArray2[B.lIIIlIllII[0]] = lIIIlIllII[7];
                        nArray2[B.lIIIlIllII[1]] = lIIIlIllII[8];
                        nArray2[B.lIIIlIllII[4]] = lIIIlIllII[9];
                        nArray2[B.lIIIlIllII[5]] = lIIIlIllII[10];
                        if (B.lllIllIIIIlI(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIIlIllII[2]];
                            nArray3[B.lIIIlIllII[0]] = lIIIlIllII[7];
                            nArray3[B.lIIIlIllII[1]] = lIIIlIllII[8];
                            nArray3[B.lIIIlIllII[4]] = lIIIlIllII[9];
                            nArray3[B.lIIIlIllII[5]] = lIIIlIllII[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!B.lllIllIIIlII(B.ab() ? 1 : 0) || B.lllIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[2])) && B.lllIllIIIIll(e.j(lIIIlIllII[3]), lIIIlIllII[4])) {
                AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[11]];
                if (B.lllIllIIIlIl(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[5])) {
                    ck = lIIIlIllII[0];
                    Movement.walkTo((WorldPoint)hP);
                    0;
                }
                if (B.lllIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[5])) {
                    if (B.lllIllIIIIll(ck, lIIIlIllII[1])) {
                        U.mV += lIIIlIllII[1];
                        U.o(AccBuilderRogues.m);
                        ck += lIIIlIllII[1];
                        U.mV = lIIIlIllII[0];
                        cl = lIIIlIllII[0];
                    }
                    AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[12]];
                    if (B.lllIllIIIIll(bT, lIIIlIllII[1])) {
                        e.v();
                        bT += lIIIlIllII[1];
                    }
                    g.a(lIIIlIlIll[lIIIlIllII[13]], hQ);
                }
            }
            g.a(new String[lIIIlIllII[0]]);
        }
    }

    private static boolean lllIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIlIllllIl(String lIIlllIlIlII, String lIIlllIlIIIl) {
        try {
            SecretKeySpec lIIlllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIllII[22]), "DES");
            Cipher lIIlllIlIllI = Cipher.getInstance("DES");
            lIIlllIlIllI.init(lIIIlIllII[4], lIIlllIlIlll);
            return new String(lIIlllIlIllI.doFinal(Base64.getDecoder().decode(lIIlllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlllIlIlIl) {
            lIIlllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String lllIlIlllllI(String lIIllIllIIlI, String lIIllIllIIIl) {
        lIIllIllIIlI = new String(Base64.getDecoder().decode(lIIllIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIllIlIl = new StringBuilder();
        char[] lIIllIllIlII = lIIllIllIIIl.toCharArray();
        int lIIllIllIIll = lIIIlIllII[0];
        char[] lIIllIlIllIl = lIIllIllIIlI.toCharArray();
        int lIIllIlIllII = lIIllIlIllIl.length;
        int lIIllIlIlIll = lIIIlIllII[0];
        while (B.lllIllIIIIll(lIIllIlIlIll, lIIllIlIllII)) {
            char lIIllIlllIII = lIIllIlIllIl[lIIllIlIlIll];
            lIIllIllIlIl.append((char)(lIIllIlllIII ^ lIIllIllIlII[lIIllIllIIll % lIIllIllIlII.length]));
            0;
            ++lIIllIllIIll;
            ++lIIllIlIlIll;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(lIIllIllIlIl);
    }

    private static boolean lllIllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIllIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lllIllIIIIII() {
        lIIIlIlIll = new String[lIIIlIllII[32]];
        B.lIIIlIlIll[B.lIIIlIllII[0]] = B."Buying items";
        B.lIIIlIlIll[B.lIIIlIllII[1]] = B."Finished buying items, switching back to quest";
        B.lIIIlIlIll[B.lIIIlIllII[4]] = B."Walking to bank";
        B.lIIIlIlIll[B.lIIIlIllII[5]] = B."Handling banking";
        B.lIIIlIlIll[B.lIIIlIllII[2]] = B."We are missing quest supplies, switching to BUYING";
        B.lIIIlIlIll[B.lIIIlIllII[11]] = B."Nav to start";
        B.lIIIlIlIll[B.lIIIlIllII[12]] = B."Handling dialog";
        B.lIIIlIlIll[B.lIIIlIllII[13]] = B."Cook";
        B.lIIIlIlIll[B.lIIIlIllII[22]] = B."Cooks Assistant Quest";
        B.lIIIlIlIll[B.lIIIlIllII[23]] = B."ring of wealth (";
        B.lIIIlIlIll[B.lIIIlIllII[14]] = B."Can you make me a cake?";
        B.lIIIlIlIll[B.lIIIlIllII[26]] = B."I'm always happy to help a cook in distress.";
        B.lIIIlIlIll[B.lIIIlIllII[27]] = B."Actually, I know where to find this stuff.";
        B.lIIIlIlIll[B.lIIIlIllII[28]] = B."Yes.";
        B.lIIIlIlIll[B.lIIIlIllII[29]] = B."What's wrong?";
    }

    private static boolean lllIllIIIlll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (B.lllIllIIlIIl(e.j(lIIIlIllII[3]), lIIIlIllII[4])) {
            bl = lIIIlIllII[1];
            0;
            if (2 >= (0x41 ^ 0x45)) {
                return ((0xA4 ^ 0x9D) & ~(0x3A ^ 3)) != 0;
            }
        } else {
            bl = lIIIlIllII[0];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIIIlIllII[1]];
        nArray[B.lIIIlIllII[0]] = lIIIlIllII[7];
        if (B.lllIllIIIlll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIlIllII[1]];
            nArray2[B.lIIIlIllII[0]] = lIIIlIllII[9];
            if (B.lllIllIIIlll(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIlIllII[1]];
                nArray3[B.lIIIlIllII[0]] = lIIIlIllII[8];
                if (B.lllIllIIIlll(Inventory.getCount((int[])nArray3))) {
                    n2 = lIIIlIllII[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x46 ^ 0x75 ^ (0x70 ^ 0x21)) & (0x41 ^ 0x22 ^ 1 ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIlIllII[0];
        return n2 != 0;
    }

    static {
        B.lllIllIIIIIl();
        B.lllIllIIIIII();
        hM = lIIIlIllII[9];
        hN = lIIIlIllII[8];
        hO = lIIIlIllII[7];
        hP = new WorldPoint(lIIIlIllII[24], lIIIlIllII[25], lIIIlIllII[0]);
        String[] stringArray = new String[lIIIlIllII[11]];
        stringArray[B.lIIIlIllII[0]] = lIIIlIlIll[lIIIlIllII[14]];
        stringArray[B.lIIIlIllII[1]] = lIIIlIlIll[lIIIlIllII[26]];
        stringArray[B.lIIIlIllII[4]] = lIIIlIlIll[lIIIlIllII[27]];
        stringArray[B.lIIIlIllII[5]] = lIIIlIlIll[lIIIlIllII[28]];
        stringArray[B.lIIIlIllII[2]] = lIIIlIlIll[lIIIlIllII[29]];
        hQ = stringArray;
        hR = new WorldPoint(lIIIlIllII[30], lIIIlIllII[31], lIIIlIllII[4]);
        bv = new ArrayList<d>();
        bT = lIIIlIllII[0];
    }

    private static void af() {
        d lIIlllIllllI;
        Object lIIlllIlllll;
        int[] nArray = new int[lIIIlIllII[1]];
        nArray[B.lIIIlIllII[0]] = lIIIlIllII[9];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIlIllII[9], lIIIlIllII[1], lIIIlIllII[6]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIlIllII[1]];
        nArray2[B.lIIIlIllII[0]] = lIIIlIllII[8];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlllIlllll = new d(lIIIlIllII[8], lIIIlIllII[1], lIIIlIllII[6]);
            bv.add((d)lIIlllIlllll);
            0;
        }
        int[] nArray3 = new int[lIIIlIllII[1]];
        nArray3[B.lIIIlIllII[0]] = lIIIlIllII[7];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlllIlllll = new d(lIIIlIllII[7], lIIIlIllII[1], lIIIlIllII[6]);
            bv.add((d)lIIlllIlllll);
            0;
        }
        int[] nArray4 = new int[lIIIlIllII[1]];
        nArray4[B.lIIIlIllII[0]] = lIIIlIllII[10];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlllIlllll = new d(lIIIlIllII[10], lIIIlIllII[14], lIIIlIllII[15]);
            bv.add((d)lIIlllIlllll);
            0;
        }
        if (B.lllIllIIIlII(Bank.contains((Predicate)(lIIlllIlllll = item -> item.getName().toLowerCase().contains(lIIIlIlIll[lIIIlIllII[23]]))) ? 1 : 0)) {
            lIIlllIllllI = new d(lIIIlIllII[16], lIIIlIllII[11], lIIIlIllII[17]);
            bv.add(lIIlllIllllI);
            0;
        }
        int[] nArray5 = new int[lIIIlIllII[1]];
        nArray5[B.lIIIlIllII[0]] = lIIIlIllII[18];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlllIllllI = new d(lIIIlIllII[18], lIIIlIllII[19], lIIIlIllII[20]);
            bv.add(lIIlllIllllI);
            0;
        }
    }

    @Override
    public int T() {
        try {
            B.bF();
            0;
        }
        catch (Exception lIIlllIlllII) {
            lIIlllIlllII.printStackTrace();
        }
        if (null != null) {
            return (0xDD ^ 0xB5 ^ (6 ^ 0x5C)) & (0xDB ^ 0xA0 ^ (0x7D ^ 0x34) ^ -1);
        }
        return lIIIlIllII[21];
    }

    private static boolean lllIllIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIllIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIllIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIlIllllll(String lIIlllIIIlll, String lIIlllIIIllI) {
        try {
            SecretKeySpec lIIlllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlllIIlIIl = Cipher.getInstance("Blowfish");
            lIIlllIIlIIl.init(lIIIlIllII[4], lIIlllIIlIlI);
            return new String(lIIlllIIlIIl.doFinal(Base64.getDecoder().decode(lIIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlllIIlIII) {
            lIIlllIIlIII.printStackTrace();
            return null;
        }
    }
}

