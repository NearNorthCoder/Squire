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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import gg.squire.account.AccBuilderGWD;
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

public class P
implements ab {
    public static final /* synthetic */ int kH;
    public static /* synthetic */ WorldPoint kK;
    public static final /* synthetic */ int kF;
    private static /* synthetic */ String[] lIIIIIllII;
    private static /* synthetic */ int[] lIIIIIllIl;
    private static final /* synthetic */ String[] kJ;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ int dk;
    static /* synthetic */ int cI;
    public static /* synthetic */ List<d> bx;
    public static final /* synthetic */ int kG;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint kI;

    private static boolean llIllllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int af() {
        try {
            P.cM();
            0;
        }
        catch (Exception lIIIIIlIlllII) {
            lIIIIIlIlllII.printStackTrace();
        }
        if (2 > 3) {
            return (0x39 ^ 9) & ~(0x41 ^ 0x71);
        }
        return lIIIIIllIl[21];
    }

    private static boolean llIllllIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIllllIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[lIIIIIllIl[1]];
        nArray[P.lIIIIIllIl[0]] = lIIIIIllIl[7];
        if (P.llIllllIlIll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIIIllIl[1]];
            nArray2[P.lIIIIIllIl[0]] = lIIIIIllIl[9];
            if (P.llIllllIlIll(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIIIllIl[1]];
                nArray3[P.lIIIIIllIl[0]] = lIIIIIllIl[8];
                if (P.llIllllIlIll(Inventory.getCount((int[])nArray3))) {
                    n2 = lIIIIIllIl[1];
                    0;
                    if (((0x78 ^ 0x41) & ~(0xFC ^ 0xC5)) < 2) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIIIllIl[0];
        return n2 != 0;
    }

    @Override
    public String ag() {
        return lIIIIIllII[lIIIIIllIl[22]];
    }

    private static boolean llIllllIllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllllIlIlI(Object object) {
        return object != null;
    }

    private static String llIllllIIIIl(String lIIIIIIlIllll, String lIIIIIIlIlllI) {
        try {
            SecretKeySpec lIIIIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIIllIIIl = Cipher.getInstance("Blowfish");
            lIIIIIIllIIIl.init(lIIIIIllIl[4], lIIIIIIllIIlI);
            return new String(lIIIIIIllIIIl.doFinal(Base64.getDecoder().decode(lIIIIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIllIIII) {
            lIIIIIIllIIII.printStackTrace();
            return null;
        }
    }

    static {
        P.llIllllIIlIl();
        P.llIllllIIlII();
        kF = lIIIIIllIl[9];
        kG = lIIIIIllIl[8];
        kH = lIIIIIllIl[7];
        kI = new WorldPoint(lIIIIIllIl[24], lIIIIIllIl[25], lIIIIIllIl[0]);
        String[] stringArray = new String[lIIIIIllIl[11]];
        stringArray[P.lIIIIIllIl[0]] = lIIIIIllII[lIIIIIllIl[14]];
        stringArray[P.lIIIIIllIl[1]] = lIIIIIllII[lIIIIIllIl[26]];
        stringArray[P.lIIIIIllIl[4]] = lIIIIIllII[lIIIIIllIl[27]];
        stringArray[P.lIIIIIllIl[5]] = lIIIIIllII[lIIIIIllIl[28]];
        stringArray[P.lIIIIIllIl[2]] = lIIIIIllII[lIIIIIllIl[29]];
        kJ = stringArray;
        kK = new WorldPoint(lIIIIIllIl[30], lIIIIIllIl[31], lIIIIIllIl[4]);
        bx = new ArrayList<d>();
        cI = lIIIIIllIl[0];
    }

    private static String llIllllIIIlI(String lIIIIIlIIIlII, String lIIIIIlIIIIll) {
        lIIIIIlIIIlII = new String(Base64.getDecoder().decode(lIIIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIIlIIIIlI = new StringBuilder();
        char[] lIIIIIlIIIIIl = lIIIIIlIIIIll.toCharArray();
        int lIIIIIlIIIIII = lIIIIIllIl[0];
        char[] lIIIIIIlllIlI = lIIIIIlIIIlII.toCharArray();
        int lIIIIIIlllIIl = lIIIIIIlllIlI.length;
        int lIIIIIIlllIII = lIIIIIllIl[0];
        while (P.llIllllIIlll(lIIIIIIlllIII, lIIIIIIlllIIl)) {
            char lIIIIIlIIIlIl = lIIIIIIlllIlI[lIIIIIIlllIII];
            lIIIIIlIIIIlI.append((char)(lIIIIIlIIIlIl ^ lIIIIIlIIIIIl[lIIIIIlIIIIII % lIIIIIlIIIIIl.length]));
            0;
            ++lIIIIIlIIIIII;
            ++lIIIIIIlllIII;
            0;
            if (-(0x7C ^ 0x67 ^ (0x1B ^ 4)) < 0) continue;
            return null;
        }
        return String.valueOf(lIIIIIlIIIIlI);
    }

    @Override
    public boolean ae() {
        return lIIIIIllIl[0];
    }

    private static boolean llIllllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void Q() {
        d lIIIIIlIllllI;
        Object lIIIIIlIlllll;
        int[] nArray = new int[lIIIIIllIl[1]];
        nArray[P.lIIIIIllIl[0]] = lIIIIIllIl[9];
        if (P.llIllllIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIIIllIl[9], lIIIIIllIl[1], lIIIIIllIl[6]);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIIIllIl[1]];
        nArray2[P.lIIIIIllIl[0]] = lIIIIIllIl[8];
        if (P.llIllllIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIIIIlIlllll = new d(lIIIIIllIl[8], lIIIIIllIl[1], lIIIIIllIl[6]);
            bx.add((d)lIIIIIlIlllll);
            0;
        }
        int[] nArray3 = new int[lIIIIIllIl[1]];
        nArray3[P.lIIIIIllIl[0]] = lIIIIIllIl[7];
        if (P.llIllllIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIIIIlIlllll = new d(lIIIIIllIl[7], lIIIIIllIl[1], lIIIIIllIl[6]);
            bx.add((d)lIIIIIlIlllll);
            0;
        }
        int[] nArray4 = new int[lIIIIIllIl[1]];
        nArray4[P.lIIIIIllIl[0]] = lIIIIIllIl[10];
        if (P.llIllllIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIIIIlIlllll = new d(lIIIIIllIl[10], lIIIIIllIl[14], lIIIIIllIl[15]);
            bx.add((d)lIIIIIlIlllll);
            0;
        }
        if (P.llIllllIlIII(Bank.contains((Predicate)(lIIIIIlIlllll = item -> item.getName().toLowerCase().contains(lIIIIIllII[lIIIIIllIl[23]]))) ? 1 : 0)) {
            lIIIIIlIllllI = new d(lIIIIIllIl[16], lIIIIIllIl[11], lIIIIIllIl[17]);
            bx.add(lIIIIIlIllllI);
            0;
        }
        int[] nArray5 = new int[lIIIIIllIl[1]];
        nArray5[P.lIIIIIllIl[0]] = lIIIIIllIl[18];
        if (P.llIllllIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIIIIlIllllI = new d(lIIIIIllIl[18], lIIIIIllIl[19], lIIIIIllIl[20]);
            bx.add(lIIIIIlIllllI);
            0;
        }
    }

    public static void cM() {
        if (P.llIllllIIllI(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[0]];
            b.a(bx);
            if (P.llIllllIIlll(bx.size(), lIIIIIllIl[1])) {
                System.out.println(lIIIIIllII[lIIIIIllIl[1]]);
                bv = lIIIIIllIl[0];
            }
        }
        if (P.llIllllIlIII(bv ? 1 : 0)) {
            if (P.llIllllIlIII(P.an() ? 1 : 0) && P.llIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(kI), lIIIIIllIl[2]) && P.llIllllIIlll(e.j(lIIIIIllIl[3]), lIIIIIllIl[4])) {
                BankLocation lIIIIIllIIIlI = BankLocation.getNearest();
                if (P.llIllllIlIlI(lIIIIIllIIIlI) && P.llIllllIlIII(lIIIIIllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[4]];
                    a.a(lIIIIIllIIIlI);
                }
                if (P.llIllllIlIlI(lIIIIIllIIIlI) && P.llIllllIIllI(lIIIIIllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[5]];
                    if (P.llIllllIlIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIllIl[6]);
                        0;
                    }
                    if (P.llIllllIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (P.llIllllIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIllIl[2]);
                            0;
                        }
                        if (P.llIllllIlIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIllIl[4]);
                            0;
                        }
                        int[] nArray = new int[lIIIIIllIl[2]];
                        nArray[P.lIIIIIllIl[0]] = lIIIIIllIl[7];
                        nArray[P.lIIIIIllIl[1]] = lIIIIIllIl[8];
                        nArray[P.lIIIIIllIl[4]] = lIIIIIllIl[9];
                        nArray[P.lIIIIIllIl[5]] = lIIIIIllIl[10];
                        if (P.llIllllIlIII(e.d(nArray) ? 1 : 0)) {
                            P.Q();
                            System.out.println(lIIIIIllII[lIIIIIllIl[2]]);
                            bv = lIIIIIllIl[1];
                            return;
                        }
                        if (P.llIllllIIllI(AccBuilderGWD.e ? 1 : 0)) {
                            a.b(f.bm, lIIIIIllIl[1]);
                        }
                        int[] nArray2 = new int[lIIIIIllIl[2]];
                        nArray2[P.lIIIIIllIl[0]] = lIIIIIllIl[7];
                        nArray2[P.lIIIIIllIl[1]] = lIIIIIllIl[8];
                        nArray2[P.lIIIIIllIl[4]] = lIIIIIllIl[9];
                        nArray2[P.lIIIIIllIl[5]] = lIIIIIllIl[10];
                        if (P.llIllllIIllI(e.d(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIIIIllIl[2]];
                            nArray3[P.lIIIIIllIl[0]] = lIIIIIllIl[7];
                            nArray3[P.lIIIIIllIl[1]] = lIIIIIllIl[8];
                            nArray3[P.lIIIIIllIl[4]] = lIIIIIllIl[9];
                            nArray3[P.lIIIIIllIl[5]] = lIIIIIllIl[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!P.llIllllIlIII(P.an() ? 1 : 0) || P.llIllllIllII(Players.getLocal().getWorldLocation().distanceTo(kI), lIIIIIllIl[2])) && P.llIllllIIlll(e.j(lIIIIIllIl[3]), lIIIIIllIl[4])) {
                AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[11]];
                if (P.llIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(kI), lIIIIIllIl[5])) {
                    dk = lIIIIIllIl[0];
                    Movement.walkTo((WorldPoint)kI);
                    0;
                }
                if (P.llIllllIllII(Players.getLocal().getWorldLocation().distanceTo(kI), lIIIIIllIl[5])) {
                    if (P.llIllllIIlll(dk, lIIIIIllIl[1])) {
                        as.qb += lIIIIIllIl[1];
                        as.u(AccBuilderGWD.m);
                        dk += lIIIIIllIl[1];
                        as.qb = lIIIIIllIl[0];
                        dl = lIIIIIllIl[0];
                    }
                    AccBuilderGWD.c = lIIIIIllII[lIIIIIllIl[12]];
                    if (P.llIllllIIlll(cI, lIIIIIllIl[1])) {
                        e.x();
                        cI += lIIIIIllIl[1];
                    }
                    g.a(lIIIIIllII[lIIIIIllIl[13]], kJ);
                }
            }
            g.a(new String[lIIIIIllIl[0]]);
        }
    }

    private static void llIllllIIlII() {
        lIIIIIllII = new String[lIIIIIllIl[32]];
        P.lIIIIIllII[P.lIIIIIllIl[0]] = P."Buying items";
        P.lIIIIIllII[P.lIIIIIllIl[1]] = P."Finished buying items, switching back to quest";
        P.lIIIIIllII[P.lIIIIIllIl[4]] = P."Walking to bank";
        P.lIIIIIllII[P.lIIIIIllIl[5]] = P."Handling banking";
        P.lIIIIIllII[P.lIIIIIllIl[2]] = P."We are missing quest supplies, switching to BUYING";
        P.lIIIIIllII[P.lIIIIIllIl[11]] = P."Nav to start";
        P.lIIIIIllII[P.lIIIIIllIl[12]] = P."Handling dialog";
        P.lIIIIIllII[P.lIIIIIllIl[13]] = P."Cook";
        P.lIIIIIllII[P.lIIIIIllIl[22]] = P."Cooks Assistant Quest";
        P.lIIIIIllII[P.lIIIIIllIl[23]] = P."ring of wealth (";
        P.lIIIIIllII[P.lIIIIIllIl[14]] = P."Can you make me a cake?";
        P.lIIIIIllII[P.lIIIIIllIl[26]] = P."I'm always happy to help a cook in distress.";
        P.lIIIIIllII[P.lIIIIIllIl[27]] = P."Actually, I know where to find this stuff.";
        P.lIIIIIllII[P.lIIIIIllIl[28]] = P."Yes.";
        P.lIIIIIllII[P.lIIIIIllIl[29]] = P."What's wrong?";
    }

    private static String llIllllIIIll(String lIIIIIlIlIlII, String lIIIIIlIlIIll) {
        try {
            SecretKeySpec lIIIIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIllIl[22]), "DES");
            Cipher lIIIIIlIlIllI = Cipher.getInstance("DES");
            lIIIIIlIlIllI.init(lIIIIIllIl[4], lIIIIIlIlIlll);
            return new String(lIIIIIlIlIllI.doFinal(Base64.getDecoder().decode(lIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIlIlIlIl) {
            lIIIIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllIlIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIllllIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIllllIIlIl() {
        lIIIIIllIl = new int[33];
        P.lIIIIIllIl[0] = (133 + 127 - 255 + 144 ^ 15 + 75 - -6 + 57) & (26 + 21 - -42 + 68 ^ 61 + 115 - 88 + 57 ^ -1);
        P.lIIIIIllIl[1] = 1;
        P.lIIIIIllIl[2] = 22 + 174 - 19 + 17 ^ 164 + 188 - 177 + 23;
        P.lIIIIIllIl[3] = 0x1F ^ 2;
        P.lIIIIIllIl[4] = 2;
        P.lIIIIIllIl[5] = 3;
        P.lIIIIIllIl[6] = 0xFFFFD3BA & 0x3FCD;
        P.lIIIIIllIl[7] = -(0xFFFFEE35 & 0x71FB) & (0xFFFFFFFF & 0x67BD);
        P.lIIIIIllIl[8] = -(0xFFFFD8EF & 0x7F16) & (0xFFFFDF9F & 0x7FFD);
        P.lIIIIIllIl[9] = 0xFFFFFFBF & 0x7C7;
        P.lIIIIIllIl[10] = 0xFFFFDF5B & 0x3FEC;
        P.lIIIIIllIl[11] = 0x6D ^ 0x60 ^ (0x10 ^ 0x18);
        P.lIIIIIllIl[12] = 0x3C ^ 0x3A;
        P.lIIIIIllIl[13] = 1 ^ 6;
        P.lIIIIIllIl[14] = 0xD8 ^ 0x95 ^ (2 ^ 0x45);
        P.lIIIIIllIl[15] = -(0xFFFFFEAF & 0x7956) & (0xFFFFFFDF & 0x7FF5);
        P.lIIIIIllIl[16] = -(0xFFFFAFF7 & 0x511B) & (0xFFFFFFDF & 0x2FFE);
        P.lIIIIIllIl[17] = -(0xFFFFE50B & 0x1EF6) & (0xFFFFEFED & 0x75BB);
        P.lIIIIIllIl[18] = 0xFFFFBFEF & 0x5F57;
        P.lIIIIIllIl[19] = 0x79 ^ 0x51;
        P.lIIIIIllIl[20] = -(0xFFFFFD7B & 0x3286) & (0xFFFFFF7D & 0x37EF);
        P.lIIIIIllIl[21] = 0xCC ^ 0x8E ^ (0x21 ^ 7);
        P.lIIIIIllIl[22] = 0x1D ^ 0x17 ^ 2;
        P.lIIIIIllIl[23] = 0xEB ^ 0x9A ^ (0xEB ^ 0x93);
        P.lIIIIIllIl[24] = 0xFFFFAD97 & 0x5EEF;
        P.lIIIIIllIl[25] = -(0xFFFFEBE2 & 0x775F) & (0xFFFFFFDF & 0x6FEF);
        P.lIIIIIllIl[26] = 9 ^ 2;
        P.lIIIIIllIl[27] = 0xE3 ^ 0x88 ^ (0xEC ^ 0x8B);
        P.lIIIIIllIl[28] = 0x80 ^ 0x86 ^ (0x2E ^ 0x25);
        P.lIIIIIllIl[29] = 0x76 ^ 0x78;
        P.lIIIIIllIl[30] = 0xFFFFACC9 & 0x5FBF;
        P.lIIIIIllIl[31] = 0xFFFFDCB7 & 0x2FDB;
        P.lIIIIIllIl[32] = 0xBB ^ 0xB5 ^ 1;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (P.llIllllIllIl(e.j(lIIIIIllIl[3]), lIIIIIllIl[4])) {
            bl = lIIIIIllIl[1];
            0;
            if ((0x80 ^ 0xAC ^ (0x59 ^ 0x70)) == 0) {
                return ((0x1F ^ 0x48 ^ (0xC2 ^ 0x8A)) & (135 + 144 - 119 + 2 ^ 57 + 47 - 11 + 96 ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIllIl[0];
        }
        return bl;
    }
}

