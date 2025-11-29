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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
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

public class E
implements K {
    private static /* synthetic */ int[] lIlllIlIll;
    private static final /* synthetic */ String[] iE;
    public static final /* synthetic */ int iB;
    public static final /* synthetic */ WorldPoint iD;
    static /* synthetic */ int cA;
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ int iC;
    public static /* synthetic */ WorldPoint iF;
    static /* synthetic */ int dc;
    public static final /* synthetic */ int iA;
    private static /* synthetic */ String[] lIlllIlIlI;
    static /* synthetic */ boolean dd;

    @Override
    public int ad() {
        try {
            E.cc();
            0;
        }
        catch (Exception llllllllllllllllllIllllIlIIIlIll) {
            llllllllllllllllllIllllIlIIIlIll.printStackTrace();
        }
        if (((0x42 ^ 0xC ^ (0xD0 ^ 0xBB)) & (0xE1 ^ 0xB6 ^ (0xEC ^ 0x9E) ^ -1)) == 2) {
            return (0x6F ^ 0x5F ^ 1) & (0x10 ^ 0x7A ^ (0xF7 ^ 0xAC) ^ -1);
        }
        return lIlllIlIll[21];
    }

    private static void lIIllllIIIIII() {
        lIlllIlIll = new int[33];
        E.lIlllIlIll[0] = (0x74 ^ 0x2A) & ~(0xA ^ 0x54);
        E.lIlllIlIll[1] = 1;
        E.lIlllIlIll[2] = 98 + 32 - 58 + 60 ^ 10 + 106 - 30 + 42;
        E.lIlllIlIll[3] = 0x31 ^ 0x2C;
        E.lIlllIlIll[4] = 2;
        E.lIlllIlIll[5] = 3;
        E.lIlllIlIll[6] = -(4 ^ 0x72) & (0xFFFFD7FF & 0x3BFD);
        E.lIlllIlIll[7] = 0xFFFFF7DF & 0xFAD;
        E.lIlllIlIll[8] = -(0xFFFFF37C & 0x2CA7) & (0xFFFFB7BB & 0x6FFF);
        E.lIlllIlIll[9] = -(0xFFFFFBEF & 0x1479) & (0xFFFF97FF & 0x7FEF);
        E.lIlllIlIll[10] = -(0xFFFFF29F & 0x4D75) & (0xFFFFDF5E & 0x7FFD);
        E.lIlllIlIll[11] = 0xB6 ^ 0xB3;
        E.lIlllIlIll[12] = 0x85 ^ 0x83;
        E.lIlllIlIll[13] = 129 + 32 - 127 + 153 ^ 180 + 94 - 88 + 2;
        E.lIlllIlIll[14] = 0x7C ^ 0x76;
        E.lIlllIlIll[15] = -(0xFFFF9CFB & 0x7B2F) & (0xFFFF9FFF & 0x7FFA);
        E.lIlllIlIll[16] = 0xFFFFBFDD & 0x6EEE;
        E.lIlllIlIll[17] = -(0xFFFFBDDB & 0x5E76) & (0xFFFFFFFF & 0x7DF9);
        E.lIlllIlIll[18] = -(0xFFFFC2EB & 0x7D35) & (0xFFFFFFE7 & 0x5F7F);
        E.lIlllIlIll[19] = 0x58 ^ 0x37 ^ (0x75 ^ 0x32);
        E.lIlllIlIll[20] = 0xFFFFCFFE & 0x376D;
        E.lIlllIlIll[21] = 0x45 ^ 0x21;
        E.lIlllIlIll[22] = 0xB2 ^ 0xBA;
        E.lIlllIlIll[23] = 0x83 ^ 0x8A;
        E.lIlllIlIll[24] = -(0xFFFFF95B & 0x37FD) & (0xFFFFBFDF & 0x7DFF);
        E.lIlllIlIll[25] = 0xFFFFBE8F & 0x4DFE;
        E.lIlllIlIll[26] = 144 + 133 - 170 + 72 ^ 42 + 23 - -1 + 118;
        E.lIlllIlIll[27] = 87 + 128 - 192 + 140 ^ 40 + 12 - -34 + 89;
        E.lIlllIlIll[28] = 0x58 ^ 0x4C ^ (0x89 ^ 0x90);
        E.lIlllIlIll[29] = 0xB2 ^ 0xA9 ^ (0x13 ^ 6);
        E.lIlllIlIll[30] = 0xFFFFFFCB & 0xCBD;
        E.lIlllIlIll[31] = 0xFFFF9FBB & 0x6CD7;
        E.lIlllIlIll[32] = 0x82 ^ 0x8D;
    }

    private static boolean lIIllllIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ac() {
        return lIlllIlIll[0];
    }

    @Override
    public boolean af() {
        boolean bl;
        if (E.lIIllllIIlIII(e.j(lIlllIlIll[3]), lIlllIlIll[4])) {
            bl = lIlllIlIll[1];
            0;
            if ((0x7E ^ 0x7A) <= ((0xA9 ^ 0x89) & ~(0x39 ^ 0x19))) {
                return ((0xEF ^ 0xC4) & ~(0x63 ^ 0x48)) != 0;
            }
        } else {
            bl = lIlllIlIll[0];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        int[] nArray = new int[lIlllIlIll[1]];
        nArray[E.lIlllIlIll[0]] = lIlllIlIll[7];
        if (E.lIIllllIIIllI(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIlllIlIll[1]];
            nArray2[E.lIlllIlIll[0]] = lIlllIlIll[9];
            if (E.lIIllllIIIllI(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIlllIlIll[1]];
                nArray3[E.lIlllIlIll[0]] = lIlllIlIll[8];
                if (E.lIIllllIIIllI(Inventory.getCount((int[])nArray3))) {
                    n2 = lIlllIlIll[1];
                    0;
                    if (((0x94 ^ 0xA5 ^ (0xC0 ^ 0xC7)) & (0xAA ^ 0x82 ^ (0x7C ^ 0x62) ^ -1)) >= 0) return n2 != 0;
                    return ((0xAC ^ 0x87 ^ (0x45 ^ 0x25)) & (88 + 77 - 68 + 39 ^ 88 + 97 - 99 + 109 ^ -1)) != 0;
                }
            }
        }
        n2 = lIlllIlIll[0];
        return n2 != 0;
    }

    private static boolean lIIllllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ae() {
        return lIlllIlIlI[lIlllIlIll[22]];
    }

    private static boolean lIIllllIIIlIl(Object object) {
        return object != null;
    }

    private static String lIIlllIllllIl(String llllllllllllllllllIllllIIllIlIll, String llllllllllllllllllIllllIIllIlIII) {
        try {
            SecretKeySpec llllllllllllllllllIllllIIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIIllIlIII.getBytes(StandardCharsets.UTF_8)), lIlllIlIll[22]), "DES");
            Cipher llllllllllllllllllIllllIIllIllIl = Cipher.getInstance("DES");
            llllllllllllllllllIllllIIllIllIl.init(lIlllIlIll[4], llllllllllllllllllIllllIIllIlllI);
            return new String(llllllllllllllllllIllllIIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIllllIIllIllII) {
            llllllllllllllllllIllllIIllIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    public static void cc() {
        if (E.lIIllllIIIIIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[0]];
            b.a(bp);
            if (E.lIIllllIIIIlI(bp.size(), lIlllIlIll[1])) {
                System.out.println(lIlllIlIlI[lIlllIlIll[1]]);
                bn = lIlllIlIll[0];
            }
        }
        if (E.lIIllllIIIIll(bn ? 1 : 0)) {
            if (E.lIIllllIIIIll(E.al() ? 1 : 0) && E.lIIllllIIIlII(Players.getLocal().getWorldLocation().distanceTo(iD), lIlllIlIll[2]) && E.lIIllllIIIIlI(e.j(lIlllIlIll[3]), lIlllIlIll[4])) {
                BankLocation llllllllllllllllllIllllIlIIlIIIl = BankLocation.getNearest();
                if (E.lIIllllIIIlIl(llllllllllllllllllIllllIlIIlIIIl) && E.lIIllllIIIIll(llllllllllllllllllIllllIlIIlIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[4]];
                    a.a(llllllllllllllllllIllllIlIIlIIIl);
                }
                if (E.lIIllllIIIlIl(llllllllllllllllllIllllIlIIlIIIl) && E.lIIllllIIIIIl(llllllllllllllllllIllllIlIIlIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[5]];
                    if (E.lIIllllIIIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIlIll[6]);
                        0;
                    }
                    if (E.lIIllllIIIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (E.lIIllllIIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIlIll[2]);
                            0;
                        }
                        if (E.lIIllllIIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllIlIll[4]);
                            0;
                        }
                        int[] nArray = new int[lIlllIlIll[2]];
                        nArray[E.lIlllIlIll[0]] = lIlllIlIll[7];
                        nArray[E.lIlllIlIll[1]] = lIlllIlIll[8];
                        nArray[E.lIlllIlIll[4]] = lIlllIlIll[9];
                        nArray[E.lIlllIlIll[5]] = lIlllIlIll[10];
                        if (E.lIIllllIIIIll(e.b(nArray) ? 1 : 0)) {
                            E.O();
                            System.out.println(lIlllIlIlI[lIlllIlIll[2]]);
                            bn = lIlllIlIll[1];
                            return;
                        }
                        if (E.lIIllllIIIIIl(AccBuilderShamans.e ? 1 : 0)) {
                            a.b(f.be, lIlllIlIll[1]);
                        }
                        int[] nArray2 = new int[lIlllIlIll[2]];
                        nArray2[E.lIlllIlIll[0]] = lIlllIlIll[7];
                        nArray2[E.lIlllIlIll[1]] = lIlllIlIll[8];
                        nArray2[E.lIlllIlIll[4]] = lIlllIlIll[9];
                        nArray2[E.lIlllIlIll[5]] = lIlllIlIll[10];
                        if (E.lIIllllIIIIIl(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIlllIlIll[2]];
                            nArray3[E.lIlllIlIll[0]] = lIlllIlIll[7];
                            nArray3[E.lIlllIlIll[1]] = lIlllIlIll[8];
                            nArray3[E.lIlllIlIll[4]] = lIlllIlIll[9];
                            nArray3[E.lIlllIlIll[5]] = lIlllIlIll[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!E.lIIllllIIIIll(E.al() ? 1 : 0) || E.lIIllllIIIlll(Players.getLocal().getWorldLocation().distanceTo(iD), lIlllIlIll[2])) && E.lIIllllIIIIlI(e.j(lIlllIlIll[3]), lIlllIlIll[4])) {
                AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[11]];
                if (E.lIIllllIIIlII(Players.getLocal().getWorldLocation().distanceTo(iD), lIlllIlIll[5])) {
                    dc = lIlllIlIll[0];
                    Movement.walkTo((WorldPoint)iD);
                    0;
                }
                if (E.lIIllllIIIlll(Players.getLocal().getWorldLocation().distanceTo(iD), lIlllIlIll[5])) {
                    if (E.lIIllllIIIIlI(dc, lIlllIlIll[1])) {
                        Z.on += lIlllIlIll[1];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlllIlIll[1];
                        Z.on = lIlllIlIll[0];
                        dd = lIlllIlIll[0];
                    }
                    AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[12]];
                    if (E.lIIllllIIIIlI(cA, lIlllIlIll[1])) {
                        e.v();
                        cA += lIlllIlIll[1];
                    }
                    g.a(lIlllIlIlI[lIlllIlIll[13]], iE);
                }
            }
            g.a(new String[lIlllIlIll[0]]);
        }
    }

    private static String lIIlllIllllII(String llllllllllllllllllIllllIIllllIll, String llllllllllllllllllIllllIIllllIlI) {
        llllllllllllllllllIllllIIllllIll = new String(Base64.getDecoder().decode(llllllllllllllllllIllllIIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllllIIllllllI = new StringBuilder();
        char[] llllllllllllllllllIllllIIlllllIl = llllllllllllllllllIllllIIllllIlI.toCharArray();
        int llllllllllllllllllIllllIIlllllII = lIlllIlIll[0];
        char[] llllllllllllllllllIllllIIlllIllI = llllllllllllllllllIllllIIllllIll.toCharArray();
        int llllllllllllllllllIllllIIlllIlIl = llllllllllllllllllIllllIIlllIllI.length;
        int llllllllllllllllllIllllIIlllIlII = lIlllIlIll[0];
        while (E.lIIllllIIIIlI(llllllllllllllllllIllllIIlllIlII, llllllllllllllllllIllllIIlllIlIl)) {
            char llllllllllllllllllIllllIlIIIIIIl = llllllllllllllllllIllllIIlllIllI[llllllllllllllllllIllllIIlllIlII];
            llllllllllllllllllIllllIIllllllI.append((char)(llllllllllllllllllIllllIlIIIIIIl ^ llllllllllllllllllIllllIIlllllIl[llllllllllllllllllIllllIIlllllII % llllllllllllllllllIllllIIlllllIl.length]));
            0;
            ++llllllllllllllllllIllllIIlllllII;
            ++llllllllllllllllllIllllIIlllIlII;
            0;
            if ((0xB ^ 0x10 ^ (0xD ^ 0x13)) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIllllIIllllllI);
    }

    private static boolean lIIllllIIIIll(int n2) {
        return n2 == 0;
    }

    static {
        E.lIIllllIIIIII();
        E.lIIlllIllllll();
        iC = lIlllIlIll[7];
        iA = lIlllIlIll[9];
        iB = lIlllIlIll[8];
        iD = new WorldPoint(lIlllIlIll[24], lIlllIlIll[25], lIlllIlIll[0]);
        String[] stringArray = new String[lIlllIlIll[11]];
        stringArray[E.lIlllIlIll[0]] = lIlllIlIlI[lIlllIlIll[14]];
        stringArray[E.lIlllIlIll[1]] = lIlllIlIlI[lIlllIlIll[26]];
        stringArray[E.lIlllIlIll[4]] = lIlllIlIlI[lIlllIlIll[27]];
        stringArray[E.lIlllIlIll[5]] = lIlllIlIlI[lIlllIlIll[28]];
        stringArray[E.lIlllIlIll[2]] = lIlllIlIlI[lIlllIlIll[29]];
        iE = stringArray;
        iF = new WorldPoint(lIlllIlIll[30], lIlllIlIll[31], lIlllIlIll[4]);
        bp = new ArrayList<d>();
        cA = lIlllIlIll[0];
    }

    private static boolean lIIllllIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlllIlllllI(String llllllllllllllllllIllllIIlIllllI, String llllllllllllllllllIllllIIlIlllIl) {
        try {
            SecretKeySpec llllllllllllllllllIllllIIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllllIIllIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllllIIllIIIII.init(lIlllIlIll[4], llllllllllllllllllIllllIIllIIIIl);
            return new String(llllllllllllllllllIllllIIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIllllIIlIlllll) {
            llllllllllllllllllIllllIIlIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIIllI(int n2) {
        return n2 > 0;
    }

    private static void lIIlllIllllll() {
        lIlllIlIlI = new String[lIlllIlIll[32]];
        E.lIlllIlIlI[E.lIlllIlIll[0]] = E."Buying items";
        E.lIlllIlIlI[E.lIlllIlIll[1]] = E."Finished buying items, switching back to quest";
        E.lIlllIlIlI[E.lIlllIlIll[4]] = E."Walking to bank";
        E.lIlllIlIlI[E.lIlllIlIll[5]] = E."Handling banking";
        E.lIlllIlIlI[E.lIlllIlIll[2]] = E."We are missing quest supplies, switching to BUYING";
        E.lIlllIlIlI[E.lIlllIlIll[11]] = E."Nav to start";
        E.lIlllIlIlI[E.lIlllIlIll[12]] = E."Handling dialog";
        E.lIlllIlIlI[E.lIlllIlIll[13]] = E."Cook";
        E.lIlllIlIlI[E.lIlllIlIll[22]] = E."Cooks Assistant Quest";
        E.lIlllIlIlI[E.lIlllIlIll[23]] = E."ring of wealth (";
        E.lIlllIlIlI[E.lIlllIlIll[14]] = E."Can you make me a cake?";
        E.lIlllIlIlI[E.lIlllIlIll[26]] = E."I'm always happy to help a cook in distress.";
        E.lIlllIlIlI[E.lIlllIlIll[27]] = E."Actually, I know where to find this stuff.";
        E.lIlllIlIlI[E.lIlllIlIll[28]] = E."Yes.";
        E.lIlllIlIlI[E.lIlllIlIll[29]] = E."What's wrong?";
    }

    private static void O() {
        d llllllllllllllllllIllllIlIIIllIl;
        Object llllllllllllllllllIllllIlIIIlllI;
        int[] nArray = new int[lIlllIlIll[1]];
        nArray[E.lIlllIlIll[0]] = lIlllIlIll[9];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlllIlIll[9], lIlllIlIll[1], lIlllIlIll[6]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlllIlIll[1]];
        nArray2[E.lIlllIlIll[0]] = lIlllIlIll[8];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIllllIlIIIlllI = new d(lIlllIlIll[8], lIlllIlIll[1], lIlllIlIll[6]);
            bp.add((d)llllllllllllllllllIllllIlIIIlllI);
            0;
        }
        int[] nArray3 = new int[lIlllIlIll[1]];
        nArray3[E.lIlllIlIll[0]] = lIlllIlIll[7];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIllllIlIIIlllI = new d(lIlllIlIll[7], lIlllIlIll[1], lIlllIlIll[6]);
            bp.add((d)llllllllllllllllllIllllIlIIIlllI);
            0;
        }
        int[] nArray4 = new int[lIlllIlIll[1]];
        nArray4[E.lIlllIlIll[0]] = lIlllIlIll[10];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIllllIlIIIlllI = new d(lIlllIlIll[10], lIlllIlIll[14], lIlllIlIll[15]);
            bp.add((d)llllllllllllllllllIllllIlIIIlllI);
            0;
        }
        if (E.lIIllllIIIIll(Bank.contains((Predicate)(llllllllllllllllllIllllIlIIIlllI = item -> item.getName().toLowerCase().contains(lIlllIlIlI[lIlllIlIll[23]]))) ? 1 : 0)) {
            llllllllllllllllllIllllIlIIIllIl = new d(lIlllIlIll[16], lIlllIlIll[11], lIlllIlIll[17]);
            bp.add(llllllllllllllllllIllllIlIIIllIl);
            0;
        }
        int[] nArray5 = new int[lIlllIlIll[1]];
        nArray5[E.lIlllIlIll[0]] = lIlllIlIll[18];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllllllllllllllIllllIlIIIllIl = new d(lIlllIlIll[18], lIlllIlIll[19], lIlllIlIll[20]);
            bp.add(llllllllllllllllllIllllIlIIIllIl);
            0;
        }
    }
}

