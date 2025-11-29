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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;

public class Q
implements ac {
    static /* synthetic */ int di;
    static /* synthetic */ boolean dj;
    public static /* synthetic */ WorldPoint lF;
    static /* synthetic */ int cG;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ String[] lE;
    public static final /* synthetic */ int lB;
    public static final /* synthetic */ WorldPoint lD;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIlIIlIII;
    private static /* synthetic */ String[] llIlIIIlll;
    public static final /* synthetic */ int lA;
    public static final /* synthetic */ int lC;

    private static String lIllIIIlIlIII(String llllllllllllllllllIIlIIlIIIlIlIl, String llllllllllllllllllIIlIIlIIIlIlII) {
        llllllllllllllllllIIlIIlIIIlIlIl = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIIlIIIlIIll = new StringBuilder();
        char[] llllllllllllllllllIIlIIlIIIlIIlI = llllllllllllllllllIIlIIlIIIlIlII.toCharArray();
        int llllllllllllllllllIIlIIlIIIlIIIl = llIlIIlIII[0];
        char[] llllllllllllllllllIIlIIlIIIIlIll = llllllllllllllllllIIlIIlIIIlIlIl.toCharArray();
        int llllllllllllllllllIIlIIlIIIIlIlI = llllllllllllllllllIIlIIlIIIIlIll.length;
        int llllllllllllllllllIIlIIlIIIIlIIl = llIlIIlIII[0];
        while (Q.lIllIIIlIllII(llllllllllllllllllIIlIIlIIIIlIIl, llllllllllllllllllIIlIIlIIIIlIlI)) {
            char llllllllllllllllllIIlIIlIIIlIllI = llllllllllllllllllIIlIIlIIIIlIll[llllllllllllllllllIIlIIlIIIIlIIl];
            llllllllllllllllllIIlIIlIIIlIIll.append((char)(llllllllllllllllllIIlIIlIIIlIllI ^ llllllllllllllllllIIlIIlIIIlIIlI[llllllllllllllllllIIlIIlIIIlIIIl % llllllllllllllllllIIlIIlIIIlIIlI.length]));
            0;
            ++llllllllllllllllllIIlIIlIIIlIIIl;
            ++llllllllllllllllllIIlIIlIIIIlIIl;
            0;
            if ((191 + 26 - 105 + 85 ^ 71 + 138 - 195 + 179) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIlIIlIIIlIIll);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (Q.lIllIIIllIIlI(e.j(llIlIIlIII[3]), llIlIIlIII[4])) {
            bl = llIlIIlIII[1];
            0;
            if (2 < 0) {
                return ((0xAA ^ 0x89) & ~(0xA ^ 0x29)) != 0;
            }
        } else {
            bl = llIlIIlIII[0];
        }
        return bl;
    }

    private static boolean lIllIIIllIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIIlIllll(Object object) {
        return object != null;
    }

    @Override
    public int af() {
        try {
            Q.ds();
            0;
        }
        catch (Exception llllllllllllllllllIIlIIlIIlIllIl) {
            llllllllllllllllllIIlIIlIIlIllIl.printStackTrace();
        }
        if (3 == 0) {
            return (5 + 8 - -144 + 25 ^ 100 + 2 - -9 + 61) & (0x73 ^ 0x56 ^ (9 ^ 0x36) ^ -1);
        }
        return llIlIIlIII[21];
    }

    private static void lIllIIIlIlIlI() {
        llIlIIlIII = new int[33];
        Q.llIlIIlIII[0] = (0x3E ^ 0x76 ^ (0x20 ^ 0x72)) & (38 + 77 - -1 + 65 ^ 46 + 1 - -110 + 18 ^ -1);
        Q.llIlIIlIII[1] = 1;
        Q.llIlIIlIII[2] = 0x29 ^ 0x15 ^ (0xAD ^ 0x95);
        Q.llIlIIlIII[3] = 1 ^ 0x1C;
        Q.llIlIIlIII[4] = 2;
        Q.llIlIIlIII[5] = 3;
        Q.llIlIIlIII[6] = -(0xFFFFF5D3 & 0x2E6D) & (0xFFFFBFD8 & 0x77EF);
        Q.llIlIIlIII[7] = -(0xFFFFEA7F & 0x55E1) & (0xFFFFFFEF & 0x47FD);
        Q.llIlIIlIII[8] = 0xFFFFC79F & 0x3FF8;
        Q.llIlIIlIII[9] = -(0xFFFFD9BD & 0x2E63) & (0xFFFFFFB7 & 0xFEF);
        Q.llIlIIlIII[10] = 0xFFFFDFDC & 0x3F6B;
        Q.llIlIIlIII[11] = 0xA9 ^ 0xAC;
        Q.llIlIIlIII[12] = 0x21 ^ 0x27;
        Q.llIlIIlIII[13] = 0xC3 ^ 0xC4;
        Q.llIlIIlIII[14] = 0x8D ^ 0x87;
        Q.llIlIIlIII[15] = -(0xFFFFFAF5 & 0x7D3A) & (0xFFFFFFFF & Short.MAX_VALUE);
        Q.llIlIIlIII[16] = 0xFFFFBECD & 0x6FFE;
        Q.llIlIIlIII[17] = 0xFFFFFBBC & 0x65EB;
        Q.llIlIIlIII[18] = 0xFFFFDF57 & 0x3FEF;
        Q.llIlIIlIII[19] = 0x46 ^ 0x6E;
        Q.llIlIIlIII[20] = 0xFFFFE77E & 0x1FED;
        Q.llIlIIlIII[21] = 0xC0 ^ 0xA4;
        Q.llIlIIlIII[22] = 0x77 ^ 0x3C ^ (0x64 ^ 0x27);
        Q.llIlIIlIII[23] = 0x5A ^ 0x53;
        Q.llIlIIlIII[24] = -(0xFFFFE77B & 0x58B5) & (0xFFFFDEF7 & 0x6DBF);
        Q.llIlIIlIII[25] = -(0xFFFFBBB2 & 0x574F) & (0xFFFFDFAF & 0x3FDF);
        Q.llIlIIlIII[26] = 0x44 ^ 0x4F;
        Q.llIlIIlIII[27] = 104 + 15 - 76 + 109 ^ 102 + 57 - 97 + 86;
        Q.llIlIIlIII[28] = 0x9E ^ 0x93;
        Q.llIlIIlIII[29] = 0x67 ^ 5 ^ (0x11 ^ 0x7D);
        Q.llIlIIlIII[30] = -(0xFFFFDB77 & 0x368D) & (0xFFFF9EBD & 0x7FCF);
        Q.llIlIIlIII[31] = -(0xFFFF9B3F & 0x76CD) & (0xFFFF9E9F & Short.MAX_VALUE);
        Q.llIlIIlIII[32] = 174 + 81 - 181 + 101 ^ 18 + 141 - 20 + 21;
    }

    private static void lIllIIIlIlIIl() {
        llIlIIIlll = new String[llIlIIlIII[32]];
        Q.llIlIIIlll[Q.llIlIIlIII[0]] = Q."Buying items";
        Q.llIlIIIlll[Q.llIlIIlIII[1]] = Q."Finished buying items, switching back to quest";
        Q.llIlIIIlll[Q.llIlIIlIII[4]] = Q."Walking to bank";
        Q.llIlIIIlll[Q.llIlIIlIII[5]] = Q."Handling banking";
        Q.llIlIIIlll[Q.llIlIIlIII[2]] = Q."We are missing quest supplies, switching to BUYING";
        Q.llIlIIIlll[Q.llIlIIlIII[11]] = Q."Nav to start";
        Q.llIlIIIlll[Q.llIlIIlIII[12]] = Q."Handling dialog";
        Q.llIlIIIlll[Q.llIlIIlIII[13]] = Q."Cook";
        Q.llIlIIIlll[Q.llIlIIlIII[22]] = Q."Cooks Assistant Quest";
        Q.llIlIIIlll[Q.llIlIIlIII[23]] = Q."ring of wealth (";
        Q.llIlIIIlll[Q.llIlIIlIII[14]] = Q."Can you make me a cake?";
        Q.llIlIIIlll[Q.llIlIIlIII[26]] = Q."I'm always happy to help a cook in distress.";
        Q.llIlIIIlll[Q.llIlIIlIII[27]] = Q."Actually, I know where to find this stuff.";
        Q.llIlIIIlll[Q.llIlIIlIII[28]] = Q."Yes.";
        Q.llIlIIIlll[Q.llIlIIlIII[29]] = Q."What's wrong?";
    }

    private static boolean lIllIIIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    public static void ds() {
        if (Q.lIllIIIlIlIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[0]];
            b.a(bv);
            if (Q.lIllIIIlIllII(bv.size(), llIlIIlIII[1])) {
                System.out.println(llIlIIIlll[llIlIIlIII[1]]);
                bt = llIlIIlIII[0];
            }
        }
        if (Q.lIllIIIlIllIl(bt ? 1 : 0)) {
            if (Q.lIllIIIlIllIl(Q.an() ? 1 : 0) && Q.lIllIIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[2]) && Q.lIllIIIlIllII(e.j(llIlIIlIII[3]), llIlIIlIII[4])) {
                BankLocation llllllllllllllllllIIlIIlIIllIIll = BankLocation.getNearest();
                if (Q.lIllIIIlIllll(llllllllllllllllllIIlIIlIIllIIll) && Q.lIllIIIlIllIl(llllllllllllllllllIIlIIlIIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[4]];
                    a.a(llllllllllllllllllIIlIIlIIllIIll);
                }
                if (Q.lIllIIIlIllll(llllllllllllllllllIIlIIlIIllIIll) && Q.lIllIIIlIlIll(llllllllllllllllllIIlIIlIIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[5]];
                    if (Q.lIllIIIlIllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIlIII[6]);
                        0;
                    }
                    if (Q.lIllIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (Q.lIllIIIllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIlIIlIII[2]);
                            0;
                        }
                        if (Q.lIllIIIllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIlIIlIII[4]);
                            0;
                        }
                        int[] nArray = new int[llIlIIlIII[2]];
                        nArray[Q.llIlIIlIII[0]] = llIlIIlIII[7];
                        nArray[Q.llIlIIlIII[1]] = llIlIIlIII[8];
                        nArray[Q.llIlIIlIII[4]] = llIlIIlIII[9];
                        nArray[Q.llIlIIlIII[5]] = llIlIIlIII[10];
                        if (Q.lIllIIIlIllIl(e.c(nArray) ? 1 : 0)) {
                            Q.Q();
                            System.out.println(llIlIIIlll[llIlIIlIII[2]]);
                            bt = llIlIIlIII[1];
                            return;
                        }
                        if (Q.lIllIIIlIlIll(AccBuilderSotf.e ? 1 : 0)) {
                            a.b(f.bk, llIlIIlIII[1]);
                        }
                        int[] nArray2 = new int[llIlIIlIII[2]];
                        nArray2[Q.llIlIIlIII[0]] = llIlIIlIII[7];
                        nArray2[Q.llIlIIlIII[1]] = llIlIIlIII[8];
                        nArray2[Q.llIlIIlIII[4]] = llIlIIlIII[9];
                        nArray2[Q.llIlIIlIII[5]] = llIlIIlIII[10];
                        if (Q.lIllIIIlIlIll(e.c(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIlIIlIII[2]];
                            nArray3[Q.llIlIIlIII[0]] = llIlIIlIII[7];
                            nArray3[Q.llIlIIlIII[1]] = llIlIIlIII[8];
                            nArray3[Q.llIlIIlIII[4]] = llIlIIlIII[9];
                            nArray3[Q.llIlIIlIII[5]] = llIlIIlIII[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!Q.lIllIIIlIllIl(Q.an() ? 1 : 0) || Q.lIllIIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[2])) && Q.lIllIIIlIllII(e.j(llIlIIlIII[3]), llIlIIlIII[4])) {
                AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[11]];
                if (Q.lIllIIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[5])) {
                    di = llIlIIlIII[0];
                    Movement.walkTo((WorldPoint)lD);
                    0;
                }
                if (Q.lIllIIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[5])) {
                    if (Q.lIllIIIlIllII(di, llIlIIlIII[1])) {
                        aN.tg += llIlIIlIII[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIlIIlIII[1];
                        aN.tg = llIlIIlIII[0];
                        dj = llIlIIlIII[0];
                    }
                    AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[12]];
                    if (Q.lIllIIIlIllII(cG, llIlIIlIII[1])) {
                        e.x();
                        cG += llIlIIlIII[1];
                    }
                    g.a(llIlIIIlll[llIlIIlIII[13]], lE);
                }
            }
            g.a(new String[llIlIIlIII[0]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIlIIlIII[1]];
        nArray[Q.llIlIIlIII[0]] = llIlIIlIII[7];
        if (Q.lIllIIIllIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llIlIIlIII[1]];
            nArray2[Q.llIlIIlIII[0]] = llIlIIlIII[9];
            if (Q.lIllIIIllIIII(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[llIlIIlIII[1]];
                nArray3[Q.llIlIIlIII[0]] = llIlIIlIII[8];
                if (Q.lIllIIIllIIII(Inventory.getCount((int[])nArray3))) {
                    n2 = llIlIIlIII[1];
                    0;
                    if (-1 != 1) return n2 != 0;
                    return ((25 + 148 - 168 + 152 ^ 86 + 103 - 111 + 52) & (24 + 95 - 9 + 70 ^ 114 + 92 - 106 + 71 ^ -1)) != 0;
                }
            }
        }
        n2 = llIlIIlIII[0];
        return n2 != 0;
    }

    private static boolean lIllIIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIlIIlll(String llllllllllllllllllIIlIIlIIlIIlIl, String llllllllllllllllllIIlIIlIIlIIlII) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIlIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), llIlIIlIII[22]), "DES");
            Cipher llllllllllllllllllIIlIIlIIlIIlll = Cipher.getInstance("DES");
            llllllllllllllllllIIlIIlIIlIIlll.init(llIlIIlIII[4], llllllllllllllllllIIlIIlIIlIlIII);
            return new String(llllllllllllllllllIIlIIlIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIlIIlIIlIIllI) {
            llllllllllllllllllIIlIIlIIlIIllI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ae() {
        return llIlIIlIII[0];
    }

    private static void Q() {
        d llllllllllllllllllIIlIIlIIlIllll;
        Object llllllllllllllllllIIlIIlIIllIIII;
        int[] nArray = new int[llIlIIlIII[1]];
        nArray[Q.llIlIIlIII[0]] = llIlIIlIII[9];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIlIIlIII[9], llIlIIlIII[1], llIlIIlIII[6]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIlIIlIII[1]];
        nArray2[Q.llIlIIlIII[0]] = llIlIIlIII[8];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIIllIIII = new d(llIlIIlIII[8], llIlIIlIII[1], llIlIIlIII[6]);
            bv.add((d)llllllllllllllllllIIlIIlIIllIIII);
            0;
        }
        int[] nArray3 = new int[llIlIIlIII[1]];
        nArray3[Q.llIlIIlIII[0]] = llIlIIlIII[7];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIIllIIII = new d(llIlIIlIII[7], llIlIIlIII[1], llIlIIlIII[6]);
            bv.add((d)llllllllllllllllllIIlIIlIIllIIII);
            0;
        }
        int[] nArray4 = new int[llIlIIlIII[1]];
        nArray4[Q.llIlIIlIII[0]] = llIlIIlIII[10];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIIllIIII = new d(llIlIIlIII[10], llIlIIlIII[14], llIlIIlIII[15]);
            bv.add((d)llllllllllllllllllIIlIIlIIllIIII);
            0;
        }
        if (Q.lIllIIIlIllIl(Bank.contains((Predicate)(llllllllllllllllllIIlIIlIIllIIII = item -> item.getName().toLowerCase().contains(llIlIIIlll[llIlIIlIII[23]]))) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIIlIllll = new d(llIlIIlIII[16], llIlIIlIII[11], llIlIIlIII[17]);
            bv.add(llllllllllllllllllIIlIIlIIlIllll);
            0;
        }
        int[] nArray5 = new int[llIlIIlIII[1]];
        nArray5[Q.llIlIIlIII[0]] = llIlIIlIII[18];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIIlIllll = new d(llIlIIlIII[18], llIlIIlIII[19], llIlIIlIII[20]);
            bv.add(llllllllllllllllllIIlIIlIIlIllll);
            0;
        }
    }

    static {
        Q.lIllIIIlIlIlI();
        Q.lIllIIIlIlIIl();
        lB = llIlIIlIII[8];
        lC = llIlIIlIII[7];
        lA = llIlIIlIII[9];
        lD = new WorldPoint(llIlIIlIII[24], llIlIIlIII[25], llIlIIlIII[0]);
        String[] stringArray = new String[llIlIIlIII[11]];
        stringArray[Q.llIlIIlIII[0]] = llIlIIIlll[llIlIIlIII[14]];
        stringArray[Q.llIlIIlIII[1]] = llIlIIIlll[llIlIIlIII[26]];
        stringArray[Q.llIlIIlIII[4]] = llIlIIIlll[llIlIIlIII[27]];
        stringArray[Q.llIlIIlIII[5]] = llIlIIIlll[llIlIIlIII[28]];
        stringArray[Q.llIlIIlIII[2]] = llIlIIIlll[llIlIIlIII[29]];
        lE = stringArray;
        lF = new WorldPoint(llIlIIlIII[30], llIlIIlIII[31], llIlIIlIII[4]);
        bv = new ArrayList<d>();
        cG = llIlIIlIII[0];
    }

    @Override
    public String ag() {
        return llIlIIIlll[llIlIIlIII[22]];
    }

    private static boolean lIllIIIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIllIl(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIlIIllI(String llllllllllllllllllIIlIIlIIIIIIII, String llllllllllllllllllIIlIIIllllllIl) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIlIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIIllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIlIIlIIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIlIIlIIIIIIlI.init(llIlIIlIII[4], llllllllllllllllllIIlIIlIIIIIIll);
            return new String(llllllllllllllllllIIlIIlIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIlIIlIIIIIIIl) {
            llllllllllllllllllIIlIIlIIIIIIIl.printStackTrace();
            return null;
        }
    }
}

