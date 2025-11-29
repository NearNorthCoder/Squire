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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import gg.squire.account.AccBuilderBarrows;
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

public class A
implements F {
    public static final /* synthetic */ WorldPoint hN;
    private static final /* synthetic */ String[] hO;
    public static final /* synthetic */ int hL;
    public static /* synthetic */ WorldPoint hP;
    public static /* synthetic */ List<d> bB;
    public static /* synthetic */ boolean bz;
    public static final /* synthetic */ int hK;
    static /* synthetic */ boolean cj;
    static /* synthetic */ int ci;
    private static /* synthetic */ String[] lIIIIIIII;
    private static /* synthetic */ int[] lIIIIIIIl;
    static /* synthetic */ int bZ;
    public static final /* synthetic */ int hM;

    private static boolean llIlIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIllll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        A.llIlIlIIlll();
        A.llIlIlIIllI();
        hL = lIIIIIIIl[8];
        hK = lIIIIIIIl[9];
        hM = lIIIIIIIl[7];
        hN = new WorldPoint(lIIIIIIIl[24], lIIIIIIIl[25], lIIIIIIIl[0]);
        String[] stringArray = new String[lIIIIIIIl[11]];
        stringArray[A.lIIIIIIIl[0]] = lIIIIIIII[lIIIIIIIl[14]];
        stringArray[A.lIIIIIIIl[1]] = lIIIIIIII[lIIIIIIIl[26]];
        stringArray[A.lIIIIIIIl[4]] = lIIIIIIII[lIIIIIIIl[27]];
        stringArray[A.lIIIIIIIl[5]] = lIIIIIIII[lIIIIIIIl[28]];
        stringArray[A.lIIIIIIIl[2]] = lIIIIIIII[lIIIIIIIl[29]];
        hO = stringArray;
        hP = new WorldPoint(lIIIIIIIl[30], lIIIIIIIl[31], lIIIIIIIl[4]);
        bB = new ArrayList<d>();
        bZ = lIIIIIIIl[0];
    }

    private static void ag() {
        d lIIlIllIlllIIlI;
        Object lIIlIllIlllIIll;
        int[] nArray = new int[lIIIIIIIl[1]];
        nArray[A.lIIIIIIIl[0]] = lIIIIIIIl[9];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIIIIIl[9], lIIIIIIIl[1], lIIIIIIIl[6]);
            bB.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIIIIIl[1]];
        nArray2[A.lIIIIIIIl[0]] = lIIIIIIIl[8];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlIllIlllIIll = new d(lIIIIIIIl[8], lIIIIIIIl[1], lIIIIIIIl[6]);
            bB.add((d)lIIlIllIlllIIll);
            0;
        }
        int[] nArray3 = new int[lIIIIIIIl[1]];
        nArray3[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlIllIlllIIll = new d(lIIIIIIIl[7], lIIIIIIIl[1], lIIIIIIIl[6]);
            bB.add((d)lIIlIllIlllIIll);
            0;
        }
        int[] nArray4 = new int[lIIIIIIIl[1]];
        nArray4[A.lIIIIIIIl[0]] = lIIIIIIIl[10];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlIllIlllIIll = new d(lIIIIIIIl[10], lIIIIIIIl[14], lIIIIIIIl[15]);
            bB.add((d)lIIlIllIlllIIll);
            0;
        }
        if (A.llIlIlIlIlI(Bank.contains((Predicate)(lIIlIllIlllIIll = item -> item.getName().toLowerCase().contains(lIIIIIIII[lIIIIIIIl[23]]))) ? 1 : 0)) {
            lIIlIllIlllIIlI = new d(lIIIIIIIl[16], lIIIIIIIl[11], lIIIIIIIl[17]);
            bB.add(lIIlIllIlllIIlI);
            0;
        }
        int[] nArray5 = new int[lIIIIIIIl[1]];
        nArray5[A.lIIIIIIIl[0]] = lIIIIIIIl[18];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlIllIlllIIlI = new d(lIIIIIIIl[18], lIIIIIIIl[19], lIIIIIIIl[20]);
            bB.add(lIIlIllIlllIIlI);
            0;
        }
    }

    private static boolean llIlIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIllII(Object object) {
        return object != null;
    }

    public static void bD() {
        if (A.llIlIlIlIII(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[0]];
            b.a(bB);
            if (A.llIlIlIlIIl(bB.size(), lIIIIIIIl[1])) {
                System.out.println(lIIIIIIII[lIIIIIIIl[1]]);
                bz = lIIIIIIIl[0];
            }
        }
        if (A.llIlIlIlIlI(bz ? 1 : 0)) {
            if (A.llIlIlIlIlI(A.ac() ? 1 : 0) && A.llIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[2]) && A.llIlIlIlIIl(e.j(lIIIIIIIl[3]), lIIIIIIIl[4])) {
                BankLocation lIIlIllIlllIllI = BankLocation.getNearest();
                if (A.llIlIlIllII(lIIlIllIlllIllI) && A.llIlIlIlIlI(lIIlIllIlllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[4]];
                    a.a(lIIlIllIlllIllI);
                }
                if (A.llIlIlIllII(lIIlIllIlllIllI) && A.llIlIlIlIII(lIIlIllIlllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[5]];
                    if (A.llIlIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIl[6]);
                        0;
                    }
                    if (A.llIlIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (A.llIlIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIIIl[2]);
                            0;
                        }
                        if (A.llIlIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIIIl[4]);
                            0;
                        }
                        int[] nArray = new int[lIIIIIIIl[2]];
                        nArray[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
                        nArray[A.lIIIIIIIl[1]] = lIIIIIIIl[8];
                        nArray[A.lIIIIIIIl[4]] = lIIIIIIIl[9];
                        nArray[A.lIIIIIIIl[5]] = lIIIIIIIl[10];
                        if (A.llIlIlIlIlI(e.b(nArray) ? 1 : 0)) {
                            A.ag();
                            System.out.println(lIIIIIIII[lIIIIIIIl[2]]);
                            bz = lIIIIIIIl[1];
                            return;
                        }
                        if (A.llIlIlIlIII(AccBuilderBarrows.e ? 1 : 0)) {
                            a.b(f.bl, lIIIIIIIl[1]);
                        }
                        int[] nArray2 = new int[lIIIIIIIl[2]];
                        nArray2[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
                        nArray2[A.lIIIIIIIl[1]] = lIIIIIIIl[8];
                        nArray2[A.lIIIIIIIl[4]] = lIIIIIIIl[9];
                        nArray2[A.lIIIIIIIl[5]] = lIIIIIIIl[10];
                        if (A.llIlIlIlIII(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIIIIIIl[2]];
                            nArray3[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
                            nArray3[A.lIIIIIIIl[1]] = lIIIIIIIl[8];
                            nArray3[A.lIIIIIIIl[4]] = lIIIIIIIl[9];
                            nArray3[A.lIIIIIIIl[5]] = lIIIIIIIl[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!A.llIlIlIlIlI(A.ac() ? 1 : 0) || A.llIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[2])) && A.llIlIlIlIIl(e.j(lIIIIIIIl[3]), lIIIIIIIl[4])) {
                AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[11]];
                if (A.llIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[5])) {
                    ci = lIIIIIIIl[0];
                    Movement.walkTo((WorldPoint)hN);
                    0;
                }
                if (A.llIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[5])) {
                    if (A.llIlIlIlIIl(ci, lIIIIIIIl[1])) {
                        Q.mC += lIIIIIIIl[1];
                        Q.o(AccBuilderBarrows.m);
                        ci += lIIIIIIIl[1];
                        Q.mC = lIIIIIIIl[0];
                        cj = lIIIIIIIl[0];
                    }
                    AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[12]];
                    if (A.llIlIlIlIIl(bZ, lIIIIIIIl[1])) {
                        e.w();
                        bZ += lIIIIIIIl[1];
                    }
                    g.a(lIIIIIIII[lIIIIIIIl[13]], hO);
                }
            }
            g.a(new String[lIIIIIIIl[0]]);
        }
    }

    @Override
    public boolean W() {
        boolean bl;
        if (A.llIlIlIllll(e.j(lIIIIIIIl[3]), lIIIIIIIl[4])) {
            bl = lIIIIIIIl[1];
            0;
            if (-1 > 0) {
                return ((0x5B ^ 0x32 ^ (0x78 ^ 0x33)) & (0x33 ^ 0x1E ^ (0x6E ^ 0x61) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIIIl[0];
        }
        return bl;
    }

    @Override
    public String V() {
        return lIIIIIIII[lIIIIIIIl[22]];
    }

    private static void llIlIlIIllI() {
        lIIIIIIII = new String[lIIIIIIIl[32]];
        A.lIIIIIIII[A.lIIIIIIIl[0]] = A."Buying items";
        A.lIIIIIIII[A.lIIIIIIIl[1]] = A."Finished buying items, switching back to quest";
        A.lIIIIIIII[A.lIIIIIIIl[4]] = A."Walking to bank";
        A.lIIIIIIII[A.lIIIIIIIl[5]] = A."Handling banking";
        A.lIIIIIIII[A.lIIIIIIIl[2]] = A."We are missing quest supplies, switching to BUYING";
        A.lIIIIIIII[A.lIIIIIIIl[11]] = A."Nav to start";
        A.lIIIIIIII[A.lIIIIIIIl[12]] = A."Handling dialog";
        A.lIIIIIIII[A.lIIIIIIIl[13]] = A."Cook";
        A.lIIIIIIII[A.lIIIIIIIl[22]] = A."Cooks Assistant Quest";
        A.lIIIIIIII[A.lIIIIIIIl[23]] = A."ring of wealth (";
        A.lIIIIIIII[A.lIIIIIIIl[14]] = A."Can you make me a cake?";
        A.lIIIIIIII[A.lIIIIIIIl[26]] = A."I'm always happy to help a cook in distress.";
        A.lIIIIIIII[A.lIIIIIIIl[27]] = A."Actually, I know where to find this stuff.";
        A.lIIIIIIII[A.lIIIIIIIl[28]] = A."Yes.";
        A.lIIIIIIII[A.lIIIIIIIl[29]] = A."What's wrong?";
    }

    private static boolean llIlIlIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIlIlIIIll(String lIIlIllIllIIllI, String lIIlIllIllIIlIl) {
        try {
            SecretKeySpec lIIlIllIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIllIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIllIllIlIlI = Cipher.getInstance("Blowfish");
            lIIlIllIllIlIlI.init(lIIIIIIIl[4], lIIlIllIllIlIll);
            return new String(lIIlIllIllIlIlI.doFinal(Base64.getDecoder().decode(lIIlIllIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIllIllIlIIl) {
            lIIlIllIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static String llIlIlIIlII(String lIIlIllIlIIIIll, String lIIlIllIlIIIIlI) {
        try {
            SecretKeySpec lIIlIllIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIl[22]), "DES");
            Cipher lIIlIllIlIIIlIl = Cipher.getInstance("DES");
            lIIlIllIlIIIlIl.init(lIIIIIIIl[4], lIIlIllIlIIIllI);
            return new String(lIIlIllIlIIIlIl.doFinal(Base64.getDecoder().decode(lIIlIllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIllIlIIIlII) {
            lIIlIllIlIIIlII.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        int[] nArray = new int[lIIIIIIIl[1]];
        nArray[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
        if (A.llIlIlIllIl(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIIIIIl[1]];
            nArray2[A.lIIIIIIIl[0]] = lIIIIIIIl[9];
            if (A.llIlIlIllIl(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIIIIIl[1]];
                nArray3[A.lIIIIIIIl[0]] = lIIIIIIIl[8];
                if (A.llIlIlIllIl(Inventory.getCount((int[])nArray3))) {
                    n2 = lIIIIIIIl[1];
                    0;
                    if (2 > -1) return n2 != 0;
                    return ((0xB6 ^ 0x86 ^ 118 + 110 - 140 + 39) & (39 + 181 - 207 + 217 ^ 109 + 121 - 85 + 24 ^ -1) & ((0x8C ^ 0xA9 ^ (0x74 ^ 0x14)) & (0xDC ^ 0x88 ^ (0x84 ^ 0x95) ^ -1) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIIIIIl[0];
        return n2 != 0;
    }

    private static void llIlIlIIlll() {
        lIIIIIIIl = new int[33];
        A.lIIIIIIIl[0] = (0x60 ^ 0x29) & ~(0x16 ^ 0x5F);
        A.lIIIIIIIl[1] = 1;
        A.lIIIIIIIl[2] = 0xA6 ^ 0xA2;
        A.lIIIIIIIl[3] = 0x8B ^ 0x96;
        A.lIIIIIIIl[4] = 2;
        A.lIIIIIIIl[5] = 3;
        A.lIIIIIIIl[6] = -(0xFFFFFFE5 & 0x6C3B) & (0xFFFFFFAF & 0x7FF8);
        A.lIIIIIIIl[7] = -(0xFFFFD505 & 0x7AFB) & (0xFFFFFFFD & 0x578F);
        A.lIIIIIIIl[8] = -(0xFFFFB25D & 0x5DA6) & (0xFFFFBFDF & 0x57BB);
        A.lIIIIIIIl[9] = 0xFFFFB7F7 & 0x4F8F;
        A.lIIIIIIIl[10] = 0xFFFFBFDA & 0x5F6D;
        A.lIIIIIIIl[11] = 124 + 135 - 123 + 21 ^ 2 + 148 - 41 + 43;
        A.lIIIIIIIl[12] = 0x9D ^ 0xAE ^ (0x53 ^ 0x66);
        A.lIIIIIIIl[13] = 0x4F ^ 0x48;
        A.lIIIIIIIl[14] = 0x2F ^ 0x5A ^ 90 + 18 - 69 + 88;
        A.lIIIIIIIl[15] = 0xFFFFE7D4 & 0x1FFB;
        A.lIIIIIIIl[16] = 0xFFFFEFCD & 0x3EFE;
        A.lIIIIIIIl[17] = -(0xFFFFD26F & 0x3FD7) & (0xFFFFF3FE & 0x7FEF);
        A.lIIIIIIIl[18] = 0xFFFFDF77 & 0x3FCF;
        A.lIIIIIIIl[19] = 0x6E ^ 0x46;
        A.lIIIIIIIl[20] = -(0xFFFFF8DD & 0x2733) & (0xFFFFA77D & 0x7FFE);
        A.lIIIIIIIl[21] = 0xF9 ^ 0x9D;
        A.lIIIIIIIl[22] = 0x5F ^ 0x57;
        A.lIIIIIIIl[23] = 0xAC ^ 0xA5;
        A.lIIIIIIIl[24] = 0xFFFFFECF & 0xDB7;
        A.lIIIIIIIl[25] = -(0xFFFFFB7A & 0x36F7) & (0xFFFFFEFF & 0x3FFF);
        A.lIIIIIIIl[26] = 0x64 ^ 0x6F;
        A.lIIIIIIIl[27] = 0x2C ^ 0x20;
        A.lIIIIIIIl[28] = 0xC3 ^ 0x86 ^ (0xC7 ^ 0x8F);
        A.lIIIIIIIl[29] = 0xF1 ^ 0xA8 ^ (0x13 ^ 0x44);
        A.lIIIIIIIl[30] = -(0xFFFFBFB5 & 0x516B) & (0xFFFFFDA9 & 0x1FFF);
        A.lIIIIIIIl[31] = -(0xFFFFBFDB & 0x716D) & (0xFFFFBFDB & 0x7DFF);
        A.lIIIIIIIl[32] = 0x56 ^ 0x59;
    }

    @Override
    public boolean T() {
        return lIIIIIIIl[0];
    }

    private static boolean llIlIlIllIl(int n2) {
        return n2 > 0;
    }

    @Override
    public int U() {
        try {
            A.bD();
            0;
        }
        catch (Exception lIIlIllIlllIIII) {
            lIIlIllIlllIIII.printStackTrace();
        }
        if ((0x5C ^ 0x48 ^ (0x83 ^ 0x93)) < ((80 + 89 - 140 + 142 ^ 39 + 112 - 138 + 176) & (0x68 ^ 0x3C ^ (0x3D ^ 0x7F) ^ -1))) {
            return (0xD1 ^ 0x93 ^ (0x45 ^ 0x22)) & (0x88 ^ 0x98 ^ (0x78 ^ 0x4D) ^ -1);
        }
        return lIIIIIIIl[21];
    }

    private static boolean llIlIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIlIIlIl(String lIIlIllIlIllIII, String lIIlIllIlIlIIlI) {
        lIIlIllIlIllIII = new String(Base64.getDecoder().decode(lIIlIllIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIllIlIlIllI = new StringBuilder();
        char[] lIIlIllIlIlIlIl = lIIlIllIlIlIIlI.toCharArray();
        int lIIlIllIlIlIlII = lIIIIIIIl[0];
        char[] lIIlIllIlIIlllI = lIIlIllIlIllIII.toCharArray();
        int lIIlIllIlIIllIl = lIIlIllIlIIlllI.length;
        int lIIlIllIlIIllII = lIIIIIIIl[0];
        while (A.llIlIlIlIIl(lIIlIllIlIIllII, lIIlIllIlIIllIl)) {
            char lIIlIllIlIllIIl = lIIlIllIlIIlllI[lIIlIllIlIIllII];
            lIIlIllIlIlIllI.append((char)(lIIlIllIlIllIIl ^ lIIlIllIlIlIlIl[lIIlIllIlIlIlII % lIIlIllIlIlIlIl.length]));
            0;
            ++lIIlIllIlIlIlII;
            ++lIIlIllIlIIllII;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(lIIlIllIlIlIllI);
    }

    private static boolean llIlIlIlIll(int n2, int n3) {
        return n2 > n3;
    }
}

