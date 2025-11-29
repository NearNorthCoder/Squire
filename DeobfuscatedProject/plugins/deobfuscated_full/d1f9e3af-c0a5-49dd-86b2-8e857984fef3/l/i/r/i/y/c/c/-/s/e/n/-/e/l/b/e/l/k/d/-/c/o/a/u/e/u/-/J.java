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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class J
implements W {
    private static /* synthetic */ int[] lIllllIIl;
    public static final /* synthetic */ int iL;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int iM;
    private static /* synthetic */ String[] lIllllIII;
    static /* synthetic */ boolean cm;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ int iK;
    public static /* synthetic */ WorldPoint iP;
    private static final /* synthetic */ String[] iO;
    static /* synthetic */ int cl;
    static /* synthetic */ int bT;
    public static final /* synthetic */ WorldPoint iN;

    public static void cc() {
        if (J.lIIllllIIIlI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIllllIII[lIllllIIl[0]];
            b.a(bv);
            if (J.lIIllllIIIll(bv.size(), lIllllIIl[1])) {
                System.out.println(lIllllIII[lIllllIIl[1]]);
                bt = lIllllIIl[0];
            }
        }
        if (J.lIIllllIIlII(bt ? 1 : 0)) {
            if (J.lIIllllIIlII(J.ab() ? 1 : 0) && J.lIIllllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iN), lIllllIIl[2]) && J.lIIllllIIIll(e.j(lIllllIIl[3]), lIllllIIl[4])) {
                BankLocation llIIIlIIllIllI = BankLocation.getNearest();
                if (J.lIIllllIIllI(llIIIlIIllIllI) && J.lIIllllIIlII(llIIIlIIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllllIII[lIllllIIl[4]];
                    a.a(llIIIlIIllIllI);
                }
                if (J.lIIllllIIllI(llIIIlIIllIllI) && J.lIIllllIIIlI(llIIIlIIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllllIII[lIllllIIl[5]];
                    if (J.lIIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllllIIl[6]);
                        0;
                    }
                    if (J.lIIllllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (J.lIIllllIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllllIIl[2]);
                            0;
                        }
                        if (J.lIIllllIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllllIIl[4]);
                            0;
                        }
                        int[] nArray = new int[lIllllIIl[2]];
                        nArray[J.lIllllIIl[0]] = lIllllIIl[7];
                        nArray[J.lIllllIIl[1]] = lIllllIIl[8];
                        nArray[J.lIllllIIl[4]] = lIllllIIl[9];
                        nArray[J.lIllllIIl[5]] = lIllllIIl[10];
                        if (J.lIIllllIIlII(e.b(nArray) ? 1 : 0)) {
                            J.af();
                            System.out.println(lIllllIII[lIllllIIl[2]]);
                            bt = lIllllIIl[1];
                            return;
                        }
                        if (J.lIIllllIIIlI(AccBuilderEasyClues.e ? 1 : 0)) {
                            a.b(f.bf, lIllllIIl[1]);
                        }
                        int[] nArray2 = new int[lIllllIIl[2]];
                        nArray2[J.lIllllIIl[0]] = lIllllIIl[7];
                        nArray2[J.lIllllIIl[1]] = lIllllIIl[8];
                        nArray2[J.lIllllIIl[4]] = lIllllIIl[9];
                        nArray2[J.lIllllIIl[5]] = lIllllIIl[10];
                        if (J.lIIllllIIIlI(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIllllIIl[2]];
                            nArray3[J.lIllllIIl[0]] = lIllllIIl[7];
                            nArray3[J.lIllllIIl[1]] = lIllllIIl[8];
                            nArray3[J.lIllllIIl[4]] = lIllllIIl[9];
                            nArray3[J.lIllllIIl[5]] = lIllllIIl[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!J.lIIllllIIlII(J.ab() ? 1 : 0) || J.lIIllllIlIII(Players.getLocal().getWorldLocation().distanceTo(iN), lIllllIIl[2])) && J.lIIllllIIIll(e.j(lIllllIIl[3]), lIllllIIl[4])) {
                AccBuilderEasyClues.c = lIllllIII[lIllllIIl[11]];
                if (J.lIIllllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iN), lIllllIIl[5])) {
                    cl = lIllllIIl[0];
                    Movement.walkTo((WorldPoint)iN);
                    0;
                }
                if (J.lIIllllIlIII(Players.getLocal().getWorldLocation().distanceTo(iN), lIllllIIl[5])) {
                    if (J.lIIllllIIIll(cl, lIllllIIl[1])) {
                        an.pR += lIllllIIl[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIllllIIl[1];
                        an.pR = lIllllIIl[0];
                        cm = lIllllIIl[0];
                    }
                    AccBuilderEasyClues.c = lIllllIII[lIllllIIl[12]];
                    if (J.lIIllllIIIll(bT, lIllllIIl[1])) {
                        e.v();
                        bT += lIllllIIl[1];
                    }
                    g.a(lIllllIII[lIllllIIl[13]], iO);
                }
            }
            g.a(new String[lIllllIIl[0]]);
        }
    }

    @Override
    public String U() {
        return lIllllIII[lIllllIIl[22]];
    }

    private static boolean lIIllllIIlII(int n2) {
        return n2 == 0;
    }

    private static String lIIlllIllllI(String llIIIlIIIIlllI, String llIIIlIIIIllIl) {
        try {
            SecretKeySpec llIIIlIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIlIIIlIIlI = Cipher.getInstance("Blowfish");
            llIIIlIIIlIIlI.init(lIllllIIl[4], llIIIlIIIlIIll);
            return new String(llIIIlIIIlIIlI.doFinal(Base64.getDecoder().decode(llIIIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIIIlIIIl) {
            llIIIlIIIlIIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIllllIIl[1]];
        nArray[J.lIllllIIl[0]] = lIllllIIl[7];
        if (J.lIIllllIIlll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIllllIIl[1]];
            nArray2[J.lIllllIIl[0]] = lIllllIIl[9];
            if (J.lIIllllIIlll(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIllllIIl[1]];
                nArray3[J.lIllllIIl[0]] = lIllllIIl[8];
                if (J.lIIllllIIlll(Inventory.getCount((int[])nArray3))) {
                    n2 = lIllllIIl[1];
                    0;
                    if (-2 <= 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIllllIIl[0];
        return n2 != 0;
    }

    private static boolean lIIllllIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllllIIlll(int n2) {
        return n2 > 0;
    }

    private static void lIIllllIIIIl() {
        lIllllIIl = new int[33];
        J.lIllllIIl[0] = (106 + 105 - 146 + 74 ^ 21 + 154 - 163 + 163) & (0xAA ^ 0x92 ^ (0xAC ^ 0xB0) ^ -1);
        J.lIllllIIl[1] = 1;
        J.lIllllIIl[2] = 0xFF ^ 0xC4 ^ (0xB3 ^ 0x8C);
        J.lIllllIIl[3] = 0x9A ^ 0x87;
        J.lIllllIIl[4] = 2;
        J.lIllllIIl[5] = 3;
        J.lIllllIIl[6] = 0xFFFF9399 & 0x7FEE;
        J.lIllllIIl[7] = 0xFFFFB7EF & 0x4F9D;
        J.lIllllIIl[8] = -(0xFFFF9FBB & 0x784C) & (0xFFFFFFBF & 0x1FDF);
        J.lIllllIIl[9] = 0xFFFFA7E7 & 0x5F9F;
        J.lIllllIIl[10] = 0xFFFF9FCC & 0x7F7B;
        J.lIllllIIl[11] = 0xD ^ 8;
        J.lIllllIIl[12] = 3 ^ 5;
        J.lIllllIIl[13] = 51 + 118 - 15 + 1 ^ 118 + 137 - 247 + 148;
        J.lIllllIIl[14] = 0x1C ^ 0x16;
        J.lIllllIIl[15] = 0xFFFF87D4 & 0x7FFB;
        J.lIllllIIl[16] = -(0xFFFFB77B & 0x49B7) & (0xFFFFFFFF & 0x2FFE);
        J.lIllllIIl[17] = 0xFFFFF3BF & 0x6DE8;
        J.lIllllIIl[18] = 0xFFFFFFCF & 0x1F77;
        J.lIllllIIl[19] = 38 + 26 - -38 + 67 ^ 10 + 27 - 13 + 105;
        J.lIllllIIl[20] = 0xFFFF877F & 0x7FEC;
        J.lIllllIIl[21] = 0x77 ^ 0x55 ^ (0x52 ^ 0x14);
        J.lIllllIIl[22] = 120 + 133 - 186 + 76 ^ 21 + 119 - 69 + 64;
        J.lIllllIIl[23] = 0x7F ^ 6 ^ (0x4B ^ 0x3B);
        J.lIllllIIl[24] = 0xFFFFDD9F & 0x2EE7;
        J.lIllllIIl[25] = 0xFFFF9D8E & 0x6EFF;
        J.lIllllIIl[26] = 0xD4 ^ 0xB6 ^ (0x3C ^ 0x55);
        J.lIllllIIl[27] = 0x77 ^ 0x7B;
        J.lIllllIIl[28] = 0xCA ^ 0xC7;
        J.lIllllIIl[29] = 0x7E ^ 0x70;
        J.lIllllIIl[30] = -(0xFFFFCF27 & 0x73F9) & (0xFFFFDFED & 0x6FBB);
        J.lIllllIIl[31] = 0xFFFFBDDF & 0x4EB3;
        J.lIllllIIl[32] = 143 + 107 - 114 + 42 ^ 53 + 97 - 9 + 48;
    }

    private static String lIIlllIlllll(String llIIIlIIlIIlIl, String llIIIlIIIlllll) {
        llIIIlIIlIIlIl = new String(Base64.getDecoder().decode(llIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIlIIlIIIll = new StringBuilder();
        char[] llIIIlIIlIIIlI = llIIIlIIIlllll.toCharArray();
        int llIIIlIIlIIIIl = lIllllIIl[0];
        char[] llIIIlIIIllIll = llIIIlIIlIIlIl.toCharArray();
        int llIIIlIIIllIlI = llIIIlIIIllIll.length;
        int llIIIlIIIllIIl = lIllllIIl[0];
        while (J.lIIllllIIIll(llIIIlIIIllIIl, llIIIlIIIllIlI)) {
            char llIIIlIIlIIllI = llIIIlIIIllIll[llIIIlIIIllIIl];
            llIIIlIIlIIIll.append((char)(llIIIlIIlIIllI ^ llIIIlIIlIIIlI[llIIIlIIlIIIIl % llIIIlIIlIIIlI.length]));
            0;
            ++llIIIlIIlIIIIl;
            ++llIIIlIIIllIIl;
            0;
            
            return null;
        }
        return String.valueOf(llIIIlIIlIIIll);
    }

    private static boolean lIIllllIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllllIIllI(Object object) {
        return object != null;
    }

    private static void af() {
        d llIIIlIIllIIlI;
        Object llIIIlIIllIIll;
        int[] nArray = new int[lIllllIIl[1]];
        nArray[J.lIllllIIl[0]] = lIllllIIl[9];
        if (J.lIIllllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIllllIIl[9], lIllllIIl[1], lIllllIIl[6]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIllllIIl[1]];
        nArray2[J.lIllllIIl[0]] = lIllllIIl[8];
        if (J.lIIllllIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIIIlIIllIIll = new d(lIllllIIl[8], lIllllIIl[1], lIllllIIl[6]);
            bv.add((d)llIIIlIIllIIll);
            0;
        }
        int[] nArray3 = new int[lIllllIIl[1]];
        nArray3[J.lIllllIIl[0]] = lIllllIIl[7];
        if (J.lIIllllIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIIIlIIllIIll = new d(lIllllIIl[7], lIllllIIl[1], lIllllIIl[6]);
            bv.add((d)llIIIlIIllIIll);
            0;
        }
        int[] nArray4 = new int[lIllllIIl[1]];
        nArray4[J.lIllllIIl[0]] = lIllllIIl[10];
        if (J.lIIllllIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIIIlIIllIIll = new d(lIllllIIl[10], lIllllIIl[14], lIllllIIl[15]);
            bv.add((d)llIIIlIIllIIll);
            0;
        }
        if (J.lIIllllIIlII(Bank.contains((Predicate)(llIIIlIIllIIll = item -> item.getName().toLowerCase().contains(lIllllIII[lIllllIIl[23]]))) ? 1 : 0)) {
            llIIIlIIllIIlI = new d(lIllllIIl[16], lIllllIIl[11], lIllllIIl[17]);
            bv.add(llIIIlIIllIIlI);
            0;
        }
        int[] nArray5 = new int[lIllllIIl[1]];
        nArray5[J.lIllllIIl[0]] = lIllllIIl[18];
        if (J.lIIllllIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIIIlIIllIIlI = new d(lIllllIIl[18], lIllllIIl[19], lIllllIIl[20]);
            bv.add(llIIIlIIllIIlI);
            0;
        }
    }

    private static boolean lIIllllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIllllIIIII() {
        lIllllIII = new String[lIllllIIl[32]];
        J.lIllllIII[J.lIllllIIl[0]] = J."Buying items";
        J.lIllllIII[J.lIllllIIl[1]] = J."Finished buying items, switching back to quest";
        J.lIllllIII[J.lIllllIIl[4]] = J."Walking to bank";
        J.lIllllIII[J.lIllllIIl[5]] = J."Handling banking";
        J.lIllllIII[J.lIllllIIl[2]] = J."We are missing quest supplies, switching to BUYING";
        J.lIllllIII[J.lIllllIIl[11]] = J."Nav to start";
        J.lIllllIII[J.lIllllIIl[12]] = J."Handling dialog";
        J.lIllllIII[J.lIllllIIl[13]] = J."Cook";
        J.lIllllIII[J.lIllllIIl[22]] = J."Cooks Assistant Quest";
        J.lIllllIII[J.lIllllIIl[23]] = J."ring of wealth (";
        J.lIllllIII[J.lIllllIIl[14]] = J."Can you make me a cake?";
        J.lIllllIII[J.lIllllIIl[26]] = J."I'm always happy to help a cook in distress.";
        J.lIllllIII[J.lIllllIIl[27]] = J."Actually, I know where to find this stuff.";
        J.lIllllIII[J.lIllllIIl[28]] = J."Yes.";
        J.lIllllIII[J.lIllllIIl[29]] = J."What's wrong?";
    }

    static {
        J.lIIllllIIIIl();
        J.lIIllllIIIII();
        iL = lIllllIIl[8];
        iM = lIllllIIl[7];
        iK = lIllllIIl[9];
        iN = new WorldPoint(lIllllIIl[24], lIllllIIl[25], lIllllIIl[0]);
        String[] stringArray = new String[lIllllIIl[11]];
        stringArray[J.lIllllIIl[0]] = lIllllIII[lIllllIIl[14]];
        stringArray[J.lIllllIIl[1]] = lIllllIII[lIllllIIl[26]];
        stringArray[J.lIllllIIl[4]] = lIllllIII[lIllllIIl[27]];
        stringArray[J.lIllllIIl[5]] = lIllllIII[lIllllIIl[28]];
        stringArray[J.lIllllIIl[2]] = lIllllIII[lIllllIIl[29]];
        iO = stringArray;
        iP = new WorldPoint(lIllllIIl[30], lIllllIIl[31], lIllllIIl[4]);
        bv = new ArrayList<d>();
        bT = lIllllIIl[0];
    }

    @Override
    public int T() {
        try {
            J.cc();
            0;
        }
        catch (Exception llIIIlIIllIIII) {
            llIIIlIIllIIII.printStackTrace();
        }
        if (2 <= -1) {
            return (0x5C ^ 0x11) & ~(0x66 ^ 0x2B);
        }
        return lIllllIIl[21];
    }

    @Override
    public boolean S() {
        return lIllllIIl[0];
    }

    private static String lIIlllIlllIl(String llIIIlIIIIIIIl, String llIIIlIIIIIIlI) {
        try {
            SecretKeySpec llIIIlIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIllllIIl[22]), "DES");
            Cipher llIIIlIIIIIlIl = Cipher.getInstance("DES");
            llIIIlIIIIIlIl.init(lIllllIIl[4], llIIIlIIIIIllI);
            return new String(llIIIlIIIIIlIl.doFinal(Base64.getDecoder().decode(llIIIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIIIIIlII) {
            llIIIlIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (J.lIIllllIlIIl(e.j(lIllllIIl[3]), lIllllIIl[4])) {
            bl = lIllllIIl[1];
            0;
            if (((0x81 ^ 0x9D) & ~(0x1C ^ 0)) > 0) {
                return false;
            }
        } else {
            bl = lIllllIIl[0];
        }
        return bl;
    }
}

