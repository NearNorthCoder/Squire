/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g_Unknown;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class M_Unknown
implements W {
    private static final /* synthetic */ WorldPoint je;
    private static final /* synthetic */ String[] jf;
    static /* synthetic */ int bT;
    private static /* synthetic */ int[] lIIIIlIII;
    static /* synthetic */ int cl;
    static /* synthetic */ boolean cm;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ int jb;
    private static final /* synthetic */ int jc;
    private static /* synthetic */ String[] lIIIIIlll;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int jd;

    private static String llIllIlIIll(String lIIlIIlllIllIll, String lIIlIIlllIllIlI) {
        try {
            SecretKeySpec lIIlIIllllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIlllIllIlI.getBytes(StandardCharsets.UTF_8)), lIIIIlIII[16]), "DES");
            Cipher lIIlIIlllIlllll = Cipher.getInstance("DES");
            lIIlIIlllIlllll.init(lIIIIlIII[3], lIIlIIllllIIIII);
            return new String(lIIlIIlllIlllll.doFinal(Base64.getDecoder().decode(lIIlIIlllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIlllIllllI) {
            lIIlIIlllIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIllIIl(int n2) {
        return n2 > 0;
    }

    private static void llIllIlIlIl() {
        lIIIIlIII = new int[39];
        M.lIIIIlIII[0] = (0x41 ^ 0xD) & ~(0xDC ^ 0x90);
        M.lIIIIlIII[1] = 1;
        M.lIIIIlIII[2] = 0xB0 ^ 0x82;
        M.lIIIIlIII[3] = 2;
        M.lIIIIlIII[4] = 0x4C ^ 0xF ^ (0xCB ^ 0x97);
        M.lIIIIlIII[5] = 3;
        M.lIIIIlIII[6] = 0x41 ^ 0x45;
        M.lIIIIlIII[7] = 0xFFFFF3CF & 0x1FB8;
        M.lIIIIlIII[8] = 0xFFFF97B3 & 0x69FE;
        M.lIIIIlIII[9] = 0x60 ^ 0x23 ^ (3 ^ 0x46);
        M.lIIIIlIII[10] = -(0xFFFFCBD9 & 0x7E2E) & (0xFFFFCBBF & Short.MAX_VALUE);
        M.lIIIIlIII[11] = -(0xFFFFFC7A & 0x5BCF) & (0xFFFFDBFF & 0x7DFD);
        M.lIIIIlIII[12] = 7 ^ 0x40 ^ (0x14 ^ 0x56);
        M.lIIIIlIII[13] = 0xFFFFDFCD & 0x3F7B;
        M.lIIIIlIII[14] = 0xCC ^ 0xA8;
        M.lIIIIlIII[15] = 0x86 ^ 0x81;
        M.lIIIIlIII[16] = 0xCE ^ 0xA8 ^ (0x14 ^ 0x7A);
        M.lIIIIlIII[17] = 71 + 91 - 101 + 103 ^ 34 + 85 - -1 + 53;
        M.lIIIIlIII[18] = 0x6A ^ 0x60;
        M.lIIIIlIII[19] = 0x5B ^ 0x50;
        M.lIIIIlIII[20] = 9 ^ 5;
        M.lIIIIlIII[21] = 0xB5 ^ 0xB8;
        M.lIIIIlIII[22] = 0x35 ^ 0x3B;
        M.lIIIIlIII[23] = 0x34 ^ 0x76 ^ (0xD4 ^ 0x99);
        M.lIIIIlIII[24] = -(0xFFFFDB36 & 0x74CB) & (0xFFFFD1F7 & 0x7FFD);
        M.lIIIIlIII[25] = 0xFFFFBFCC & 0x6EFF;
        M.lIIIIlIII[26] = -(0xFFFFDCD7 & 0x377C) & (0xFFFFFDFF & 0x77FB);
        M.lIIIIlIII[27] = 0xFFFFDF57 & 0x3FEF;
        M.lIIIIlIII[28] = 0xA7 ^ 0x8F;
        M.lIIIIlIII[29] = 0xFFFFADDD & 0x57FE;
        M.lIIIIlIII[30] = 43 + 36 - -13 + 42 ^ 95 + 134 - 191 + 112;
        M.lIIIIlIII[31] = 0xAA ^ 0xBB;
        M.lIIIIlIII[32] = -(0xFFFFFC35 & 0x77CB) & (0xFFFFFFA7 & 0x7FDF);
        M.lIIIIlIII[33] = -(0xFFFFF9CF & 0x7635) & (0xFFFFFFFF & 0x7D7F);
        M.lIIIIlIII[34] = 0xB ^ 0x19;
        M.lIIIIlIII[35] = 0x2A ^ 0x50 ^ (0xC1 ^ 0xA8);
        M.lIIIIlIII[36] = 0x15 ^ 0x67 ^ (0xC4 ^ 0xA2);
        M.lIIIIlIII[37] = 0x8F ^ 0x9A;
        M.lIIIIlIII[38] = 0xD4 ^ 0xC2;
    }

    private static boolean llIllIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIllIlIlII() {
        lIIIIIlll = new String[lIIIIlIII[38]];
        M.lIIIIIlll[M.lIIIIlIII[0]] = M."Buying items";
        M.lIIIIIlll[M.lIIIIlIII[1]] = M."Finished buying items, switching back to quest";
        M.lIIIIIlll[M.lIIIIlIII[3]] = M."Drink";
        M.lIIIIIlll[M.lIIIIlIII[5]] = M."Nav to bank";
        M.lIIIIIlll[M.lIIIIlIII[6]] = M."Handling banking";
        M.lIIIIIlll[M.lIIIIlIII[12]] = M."We are missing quest supplies, switching to BUYING";
        M.lIIIIIlll[M.lIIIIlIII[9]] = M."We are missing quest supplies, switching to BUYING";
        M.lIIIIIlll[M.lIIIIlIII[15]] = M."Nav to start";
        M.lIIIIIlll[M.lIIIIlIII[16]] = M."Handle dialog";
        M.lIIIIIlll[M.lIIIIlIII[17]] = M."Door";
        M.lIIIIIlll[M.lIIIIlIII[18]] = M."Open";
        M.lIIIIIlll[M.lIIIIlIII[19]] = M."Open";
        M.lIIIIIlll[M.lIIIIlIII[20]] = M."Doric";
        M.lIIIIIlll[M.lIIIIlIII[21]] = M."Nav to bank";
        M.lIIIIIlll[M.lIIIIlIII[22]] = M."Handling banking";
        M.lIIIIIlll[M.lIIIIlIII[23]] = M."We are missing quest supplies, switching to BUYING";
        M.lIIIIIlll[M.lIIIIlIII[30]] = M."Dorics quest";
        M.lIIIIIlll[M.lIIIIlIII[31]] = M."ring of wealth (";
        M.lIIIIIlll[M.lIIIIlIII[34]] = M."I wanted to use your anvils.";
        M.lIIIIIlll[M.lIIIIlIII[35]] = M."Yes, I will get you the materials.";
        M.lIIIIIlll[M.lIIIIlIII[36]] = M."Certainly, I'll be right back!";
        M.lIIIIIlll[M.lIIIIlIII[37]] = M."Yes.";
    }

    private static boolean llIllIlIllI(int n2) {
        return n2 != 0;
    }

    public static void cj() {
        block22: {
            BankLocation lIIlIlIIIIlIIlI;
            block23: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                if (M.llIllIlIllI(bt ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[0]];
                                    b.a(bv);
                                    if (M.llIllIlIlll(bv.size(), lIIIIlIII[1])) {
                                        System.out.println(lIIIIIlll[lIIIIlIII[1]]);
                                        bt = lIIIIlIII[0];
                                    }
                                }
                                if (!M.llIllIllIII(bt ? 1 : 0)) break block22;
                                if (M.llIllIlIllI(Inventory.contains((int[])f.aV) ? 1 : 0) && M.llIllIlIlll(Movement.getRunEnergy(), lIIIIlIII[2])) {
                                    Inventory.getFirst((int[])f.aV).interact(lIIIIIlll[lIIIIlIII[3]]);
                                    Time.sleepTicks((int)lIIIIlIII[1]);
                                    0;
                                }
                                if (M.llIllIllIII(Movement.isRunEnabled() ? 1 : 0) && M.llIllIllIIl(Movement.getRunEnergy())) {
                                    Movement.toggleRun();
                                }
                                if (!M.llIllIllIII(M.ab() ? 1 : 0) || !M.llIllIlIlll(e.j(lIIIIlIII[4]), lIIIIlIII[1])) break block23;
                                lIIlIlIIIIlIIlI = BankLocation.getNearest();
                                if (M.llIllIllIlI(lIIlIlIIIIlIIlI) && M.llIllIllIII(lIIlIlIIIIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[5]];
                                    a.a(lIIlIlIIIIlIIlI);
                                    Time.sleepTicks((int)lIIIIlIII[3]);
                                    0;
                                }
                                if (!M.llIllIllIlI(lIIlIlIIIIlIIlI) || !M.llIllIlIllI(lIIlIlIIIIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block23;
                                AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[6]];
                                if (M.llIllIllIII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlIII[7]);
                                    0;
                                }
                                if (!M.llIllIlIllI(Bank.isOpen() ? 1 : 0)) break block23;
                                if (M.llIllIllIIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIIIlIII[6]);
                                    0;
                                }
                                if (M.llIllIllIIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIIIlIII[3]);
                                    0;
                                }
                                int[] nArray = new int[lIIIIlIII[1]];
                                nArray[M.lIIIIlIII[0]] = lIIIIlIII[8];
                                if (!M.llIllIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                int[] nArray2 = new int[lIIIIlIII[1]];
                                nArray2[M.lIIIIlIII[0]] = lIIIIlIII[8];
                                if (!M.llIllIllIll(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIlIII[9])) break block25;
                            }
                            int[] nArray = new int[lIIIIlIII[1]];
                            nArray[M.lIIIIlIII[0]] = lIIIIlIII[10];
                            if (!M.llIllIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray3 = new int[lIIIIlIII[1]];
                            nArray3[M.lIIIIlIII[0]] = lIIIIlIII[10];
                            if (!M.llIllIllIll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlIII[3])) break block25;
                        }
                        int[] nArray = new int[lIIIIlIII[1]];
                        nArray[M.lIIIIlIII[0]] = lIIIIlIII[11];
                        if (!M.llIllIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                        int[] nArray4 = new int[lIIIIlIII[1]];
                        nArray4[M.lIIIIlIII[0]] = lIIIIlIII[11];
                        if (!M.llIllIlIlll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIlIII[6])) break block27;
                    }
                    M.af();
                    System.out.println(lIIIIIlll[lIIIIlIII[12]]);
                    bt = lIIIIlIII[1];
                    return;
                }
                int[] nArray = new int[lIIIIlIII[6]];
                nArray[M.lIIIIlIII[0]] = lIIIIlIII[11];
                nArray[M.lIIIIlIII[1]] = lIIIIlIII[10];
                nArray[M.lIIIIlIII[3]] = lIIIIlIII[8];
                nArray[M.lIIIIlIII[5]] = lIIIIlIII[13];
                if (M.llIllIllIII(e.b(nArray) ? 1 : 0)) {
                    M.af();
                    System.out.println(lIIIIIlll[lIIIIlIII[9]]);
                    bt = lIIIIlIII[1];
                    return;
                }
                int[] nArray5 = new int[lIIIIlIII[6]];
                nArray5[M.lIIIIlIII[0]] = lIIIIlIII[11];
                nArray5[M.lIIIIlIII[1]] = lIIIIlIII[10];
                nArray5[M.lIIIIlIII[3]] = lIIIIlIII[8];
                nArray5[M.lIIIIlIII[5]] = lIIIIlIII[13];
                if (M.llIllIlIllI(e.b(nArray5) ? 1 : 0)) {
                    a.a(lIIIIlIII[11], lIIIIlIII[6]);
                    a.a(lIIIIlIII[10], lIIIIlIII[3]);
                    a.a(lIIIIlIII[8], lIIIIlIII[9]);
                    a.a(lIIIIlIII[13], lIIIIlIII[1]);
                }
                if (M.llIllIlIllI(AccBuilderEasyClues.e ? 1 : 0)) {
                    a.b(f.bf, lIIIIlIII[1]);
                }
            }
            if (M.llIllIllIII(M.ab() ? 1 : 0) && M.llIllIllIIl(e.j(lIIIIlIII[4])) && M.llIllIlllII(Players.getLocal().getWorldLocation().distanceTo(je), lIIIIlIII[12])) {
                M.ck();
            }
            if ((!M.llIllIllIII(M.ab() ? 1 : 0) || M.llIllIlllIl(Players.getLocal().getWorldLocation().distanceTo(je), lIIIIlIII[12])) && M.llIllIlIlll(e.j(lIIIIlIII[4]), lIIIIlIII[14])) {
                if (M.llIllIlllII(Players.getLocal().getWorldLocation().distanceTo(je), lIIIIlIII[6])) {
                    cl = lIIIIlIII[0];
                    AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[15]];
                    if (M.llIllIlIlll(bT, lIIIIlIII[1])) {
                        e.v();
                        bT += lIIIIlIII[1];
                    }
                    Movement.walkTo((WorldPoint)je);
                    0;
                }
                if (M.llIllIlllIl(Players.getLocal().getWorldLocation().distanceTo(je), lIIIIlIII[9])) {
                    AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[16]];
                    String[] stringArray = new String[lIIIIlIII[1]];
                    stringArray[M.lIIIIlIII[0]] = lIIIIIlll[lIIIIlIII[17]];
                    lIIlIlIIIIlIIlI = TileObjects.getNearest((String[])stringArray);
                    if (M.llIllIllIlI(lIIlIlIIIIlIIlI)) {
                        String[] stringArray2 = new String[lIIIIlIII[1]];
                        stringArray2[M.lIIIIlIII[0]] = lIIIIIlll[lIIIIlIII[18]];
                        if (M.llIllIlIllI(lIIlIlIIIIlIIlI.hasAction(stringArray2) ? 1 : 0)) {
                            lIIlIlIIIIlIIlI.interact(lIIIIIlll[lIIIIlIII[19]]);
                            Time.sleepTicks((int)lIIIIlIII[5]);
                            0;
                        }
                    }
                    if (M.llIllIlIlll(cl, lIIIIlIII[1])) {
                        an.pO += lIIIIlIII[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIIIlIII[1];
                        an.pO = lIIIIlIII[0];
                        cm = lIIIIlIII[0];
                    }
                    g.a(lIIIIIlll[lIIIIlIII[20]], jf);
                }
            }
            g.a(new String[lIIIIlIII[0]]);
        }
        System.out.println("Setting: " + e.j(lIIIIlIII[4]));
    }

    private static boolean llIllIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return lIIIIlIII[0];
    }

    private static boolean llIllIllIII(int n2) {
        return n2 == 0;
    }

    @Override
    public int T() {
        try {
            M.cj();
            0;
        }
        catch (Exception lIIlIlIIIIIlIlI) {
            lIIlIlIIIIIlIlI.printStackTrace();
        }
        if (((0x3E ^ 0x75 ^ (0xCB ^ 0x93)) & (0xC5 ^ 0xA4 ^ (0x4F ^ 0x3D) ^ -1)) == 1) {
            return (0x10 ^ 0x78 ^ (0xDF ^ 0xA7)) & (0x1A ^ 0x43 ^ (0x2B ^ 0x62) ^ -1);
        }
        return lIIIIlIII[18];
    }

    private static String llIllIlIIIl(String lIIlIIllllllIlI, String lIIlIIllllllllI) {
        lIIlIIllllllIlI = new String(Base64.getDecoder().decode(lIIlIIllllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIlllllllIl = new StringBuilder();
        char[] lIIlIIlllllllII = lIIlIIllllllllI.toCharArray();
        int lIIlIIllllllIll = lIIIIlIII[0];
        char[] lIIlIIlllllIlIl = lIIlIIllllllIlI.toCharArray();
        int lIIlIIlllllIlII = lIIlIIlllllIlIl.length;
        int lIIlIIlllllIIll = lIIIIlIII[0];
        while (M.llIllIlIlll(lIIlIIlllllIIll, lIIlIIlllllIlII)) {
            char lIIlIlIIIIIIIII = lIIlIIlllllIlIl[lIIlIIlllllIIll];
            lIIlIIlllllllIl.append((char)(lIIlIlIIIIIIIII ^ lIIlIIlllllllII[lIIlIIllllllIll % lIIlIIlllllllII.length]));
            0;
            ++lIIlIIllllllIll;
            ++lIIlIIlllllIIll;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(lIIlIIlllllllIl);
    }

    private static boolean llIllIllIlI(Object object) {
        return object != null;
    }

    @Override
    public String U() {
        return lIIIIIlll[lIIIIlIII[30]];
    }

    private static String llIllIlIIlI(String lIIlIIllllIlIlI, String lIIlIIllllIlIIl) {
        try {
            SecretKeySpec lIIlIIllllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIllllIllII = Cipher.getInstance("Blowfish");
            lIIlIIllllIllII.init(lIIIIlIII[3], lIIlIIllllIllIl);
            return new String(lIIlIIllllIllII.doFinal(Base64.getDecoder().decode(lIIlIIllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIllllIlIll) {
            lIIlIIllllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        M.llIllIlIlIl();
        M.llIllIlIlII();
        jb = lIIIIlIII[8];
        jc = lIIIIlIII[10];
        jd = lIIIIlIII[11];
        je = new WorldPoint(lIIIIlIII[32], lIIIIlIII[33], lIIIIlIII[0]);
        String[] stringArray = new String[lIIIIlIII[6]];
        stringArray[M.lIIIIlIII[0]] = lIIIIIlll[lIIIIlIII[34]];
        stringArray[M.lIIIIlIII[1]] = lIIIIIlll[lIIIIlIII[35]];
        stringArray[M.lIIIIlIII[3]] = lIIIIIlll[lIIIIlIII[36]];
        stringArray[M.lIIIIlIII[5]] = lIIIIIlll[lIIIIlIII[37]];
        jf = stringArray;
        bv = new ArrayList<d>();
        bT = lIIIIlIII[0];
    }

    private static boolean llIllIlllII(int n2, int n3) {
        return n2 > n3;
    }

    private static void af() {
        d lIIlIlIIIIIllII;
        Object lIIlIlIIIIIllIl;
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                int[] nArray = new int[lIIIIlIII[1]];
                                nArray[M.lIIIIlIII[0]] = lIIIIlIII[8];
                                if (!M.llIllIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lIIIIlIII[1]];
                                nArray2[M.lIIIIlIII[0]] = lIIIIlIII[8];
                                if (!M.llIllIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lIIIIlIII[1]];
                                nArray3[M.lIIIIlIII[0]] = lIIIIlIII[8];
                                if (!M.llIllIlIlll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlIII[9])) break block13;
                            }
                            lIIlIlIIIIIllIl = new d(lIIIIlIII[8], lIIIIlIII[9], lIIIIlIII[24]);
                            bv.add((d)lIIlIlIIIIIllIl);
                            0;
                        }
                        int[] nArray = new int[lIIIIlIII[1]];
                        nArray[M.lIIIIlIII[0]] = lIIIIlIII[10];
                        if (!M.llIllIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray4 = new int[lIIIIlIII[1]];
                        nArray4[M.lIIIIlIII[0]] = lIIIIlIII[10];
                        if (!M.llIllIlIllI(Bank.contains((int[])nArray4) ? 1 : 0)) break block15;
                        int[] nArray5 = new int[lIIIIlIII[1]];
                        nArray5[M.lIIIIlIII[0]] = lIIIIlIII[10];
                        if (!M.llIllIlIlll(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIlIII[3])) break block15;
                    }
                    lIIlIlIIIIIllIl = new d(lIIIIlIII[10], lIIIIlIII[3], lIIIIlIII[24]);
                    bv.add((d)lIIlIlIIIIIllIl);
                    0;
                }
                int[] nArray = new int[lIIIIlIII[1]];
                nArray[M.lIIIIlIII[0]] = lIIIIlIII[11];
                if (!M.llIllIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray6 = new int[lIIIIlIII[1]];
                nArray6[M.lIIIIlIII[0]] = lIIIIlIII[11];
                if (!M.llIllIlIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block17;
                int[] nArray7 = new int[lIIIIlIII[1]];
                nArray7[M.lIIIIlIII[0]] = lIIIIlIII[11];
                if (!M.llIllIlIlll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlIII[6])) break block17;
            }
            lIIlIlIIIIIllIl = new d(lIIIIlIII[11], lIIIIlIII[6], lIIIIlIII[24]);
            bv.add((d)lIIlIlIIIIIllIl);
            0;
        }
        int[] nArray = new int[lIIIIlIII[1]];
        nArray[M.lIIIIlIII[0]] = lIIIIlIII[13];
        if (M.llIllIllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlIlIIIIIllIl = new d(lIIIIlIII[13], lIIIIlIII[12], lIIIIlIII[7]);
            bv.add((d)lIIlIlIIIIIllIl);
            0;
        }
        if (M.llIllIllIII(Bank.contains((Predicate)(lIIlIlIIIIIllIl = item -> item.getName().toLowerCase().contains(lIIIIIlll[lIIIIlIII[31]]))) ? 1 : 0)) {
            lIIlIlIIIIIllII = new d(lIIIIlIII[25], lIIIIlIII[12], lIIIIlIII[26]);
            bv.add(lIIlIlIIIIIllII);
            0;
        }
        int[] nArray8 = new int[lIIIIlIII[1]];
        nArray8[M.lIIIIlIII[0]] = lIIIIlIII[27];
        if (M.llIllIllIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIIlIlIIIIIllII = new d(lIIIIlIII[27], lIIIIlIII[28], lIIIIlIII[29]);
            bv.add(lIIlIlIIIIIllII);
            0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIIIIlIII[1]];
        nArray[M.lIIIIlIII[0]] = lIIIIlIII[8];
        if (M.llIllIllIll(Inventory.getCount((int[])nArray), lIIIIlIII[9])) {
            int[] nArray2 = new int[lIIIIlIII[1]];
            nArray2[M.lIIIIlIII[0]] = lIIIIlIII[10];
            if (M.llIllIllIll(Inventory.getCount((int[])nArray2), lIIIIlIII[3])) {
                int[] nArray3 = new int[lIIIIlIII[1]];
                nArray3[M.lIIIIlIII[0]] = lIIIIlIII[11];
                if (M.llIllIllIll(Inventory.getCount((int[])nArray3), lIIIIlIII[6])) {
                    n2 = lIIIIlIII[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIIlIII[0];
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (M.llIllIllIll(e.j(lIIIIlIII[4]), lIIIIlIII[14])) {
            bl = lIIIIlIII[1];
            0;
            if (-3 > 0) {
                return ((3 ^ (0xC2 ^ 0xC6)) & (11 + 75 - 54 + 107 ^ 18 + 135 - 64 + 51 ^ -1)) != 0;
            }
        } else {
            bl = lIIIIlIII[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static void ck() {
        void lIIlIlIIIIlIIII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (M.llIllIllIlI(bankLocation) && M.llIllIllIII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[21]];
            a.a(bankLocation);
            Time.sleepTicks((int)lIIIIlIII[3]);
            0;
        }
        if (M.llIllIllIlI(lIIlIlIIIIlIIII) && M.llIllIlIllI(lIIlIlIIIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIIlll[lIIIIlIII[22]];
            if (M.llIllIllIII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlIII[7]);
                0;
            }
            if (M.llIllIlIllI(Bank.isOpen() ? 1 : 0)) {
                if (M.llIllIllIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIIlIII[6]);
                    0;
                }
                if (M.llIllIllIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIIlIII[3]);
                    0;
                }
                int[] nArray = new int[lIIIIlIII[6]];
                nArray[M.lIIIIlIII[0]] = lIIIIlIII[11];
                nArray[M.lIIIIlIII[1]] = lIIIIlIII[10];
                nArray[M.lIIIIlIII[3]] = lIIIIlIII[8];
                nArray[M.lIIIIlIII[5]] = lIIIIlIII[13];
                if (M.llIllIllIII(e.b(nArray) ? 1 : 0)) {
                    M.af();
                    System.out.println(lIIIIIlll[lIIIIlIII[23]]);
                    bt = lIIIIlIII[1];
                    return;
                }
                int[] nArray2 = new int[lIIIIlIII[6]];
                nArray2[M.lIIIIlIII[0]] = lIIIIlIII[11];
                nArray2[M.lIIIIlIII[1]] = lIIIIlIII[10];
                nArray2[M.lIIIIlIII[3]] = lIIIIlIII[8];
                nArray2[M.lIIIIlIII[5]] = lIIIIlIII[13];
                if (M.llIllIlIllI(e.b(nArray2) ? 1 : 0)) {
                    a.a(lIIIIlIII[11], lIIIIlIII[6]);
                    a.a(lIIIIlIII[10], lIIIIlIII[3]);
                    a.a(lIIIIlIII[8], lIIIIlIII[9]);
                    a.a(lIIIIlIII[13], lIIIIlIII[1]);
                }
                a.b(f.bf, lIIIIlIII[1]);
            }
        }
    }
}

