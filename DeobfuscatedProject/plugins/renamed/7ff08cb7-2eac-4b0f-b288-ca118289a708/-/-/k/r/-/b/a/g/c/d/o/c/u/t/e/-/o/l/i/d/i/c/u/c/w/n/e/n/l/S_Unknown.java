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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g_Unknown;
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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class S_Unknown
implements ab {
    static /* synthetic */ int cI;
    private static /* synthetic */ int[] lIIIIllIII;
    static /* synthetic */ int dk;
    private static final /* synthetic */ String[] la;
    private static final /* synthetic */ WorldPoint kZ;
    private static final /* synthetic */ int kW;
    static /* synthetic */ boolean dl;
    private static final /* synthetic */ int kX;
    public static /* synthetic */ boolean bv;
    private static final /* synthetic */ int kY;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ String[] lIIIIlIlll;

    private static void lllIIIlIlllI() {
        lIIIIlIlll = new String[lIIIIllIII[38]];
        S.lIIIIlIlll[S.lIIIIllIII[0]] = S."Buying items";
        S.lIIIIlIlll[S.lIIIIllIII[1]] = S."Finished buying items, switching back to quest";
        S.lIIIIlIlll[S.lIIIIllIII[3]] = S."Drink";
        S.lIIIIlIlll[S.lIIIIllIII[5]] = S."Nav to bank";
        S.lIIIIlIlll[S.lIIIIllIII[6]] = S."Handling banking";
        S.lIIIIlIlll[S.lIIIIllIII[12]] = S."We are missing quest supplies, switching to BUYING";
        S.lIIIIlIlll[S.lIIIIllIII[9]] = S."We are missing quest supplies, switching to BUYING";
        S.lIIIIlIlll[S.lIIIIllIII[15]] = S."Nav to start";
        S.lIIIIlIlll[S.lIIIIllIII[16]] = S."Handle dialog";
        S.lIIIIlIlll[S.lIIIIllIII[17]] = S."Door";
        S.lIIIIlIlll[S.lIIIIllIII[18]] = S."Open";
        S.lIIIIlIlll[S.lIIIIllIII[19]] = S."Open";
        S.lIIIIlIlll[S.lIIIIllIII[20]] = S."Doric";
        S.lIIIIlIlll[S.lIIIIllIII[21]] = S."Nav to bank";
        S.lIIIIlIlll[S.lIIIIllIII[22]] = S."Handling banking";
        S.lIIIIlIlll[S.lIIIIllIII[23]] = S."We are missing quest supplies, switching to BUYING";
        S.lIIIIlIlll[S.lIIIIllIII[30]] = S."Dorics quest";
        S.lIIIIlIlll[S.lIIIIllIII[31]] = S."ring of wealth (";
        S.lIIIIlIlll[S.lIIIIllIII[34]] = S."I wanted to use your anvils.";
        S.lIIIIlIlll[S.lIIIIllIII[35]] = S."Yes, I will get you the materials.";
        S.lIIIIlIlll[S.lIIIIllIII[36]] = S."Certainly, I'll be right back!";
        S.lIIIIlIlll[S.lIIIIllIII[37]] = S."Yes.";
    }

    private static boolean lllIIIllIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ae() {
        return lIIIIllIII[0];
    }

    private static boolean lllIIIllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void Q() {
        d lllIlIIlllII;
        Object lllIlIIlllIl;
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                int[] nArray = new int[lIIIIllIII[1]];
                                nArray[S.lIIIIllIII[0]] = lIIIIllIII[8];
                                if (!S.lllIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lIIIIllIII[1]];
                                nArray2[S.lIIIIllIII[0]] = lIIIIllIII[8];
                                if (!S.lllIIIllIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lIIIIllIII[1]];
                                nArray3[S.lIIIIllIII[0]] = lIIIIllIII[8];
                                if (!S.lllIIIllIIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIllIII[9])) break block13;
                            }
                            lllIlIIlllIl = new d(lIIIIllIII[8], lIIIIllIII[9], lIIIIllIII[24]);
                            bx.add((d)lllIlIIlllIl);
                            0;
                        }
                        int[] nArray = new int[lIIIIllIII[1]];
                        nArray[S.lIIIIllIII[0]] = lIIIIllIII[10];
                        if (!S.lllIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray4 = new int[lIIIIllIII[1]];
                        nArray4[S.lIIIIllIII[0]] = lIIIIllIII[10];
                        if (!S.lllIIIllIIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block15;
                        int[] nArray5 = new int[lIIIIllIII[1]];
                        nArray5[S.lIIIIllIII[0]] = lIIIIllIII[10];
                        if (!S.lllIIIllIIIl(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIllIII[3])) break block15;
                    }
                    lllIlIIlllIl = new d(lIIIIllIII[10], lIIIIllIII[3], lIIIIllIII[24]);
                    bx.add((d)lllIlIIlllIl);
                    0;
                }
                int[] nArray = new int[lIIIIllIII[1]];
                nArray[S.lIIIIllIII[0]] = lIIIIllIII[11];
                if (!S.lllIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray6 = new int[lIIIIllIII[1]];
                nArray6[S.lIIIIllIII[0]] = lIIIIllIII[11];
                if (!S.lllIIIllIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block17;
                int[] nArray7 = new int[lIIIIllIII[1]];
                nArray7[S.lIIIIllIII[0]] = lIIIIllIII[11];
                if (!S.lllIIIllIIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIllIII[6])) break block17;
            }
            lllIlIIlllIl = new d(lIIIIllIII[11], lIIIIllIII[6], lIIIIllIII[24]);
            bx.add((d)lllIlIIlllIl);
            0;
        }
        int[] nArray = new int[lIIIIllIII[1]];
        nArray[S.lIIIIllIII[0]] = lIIIIllIII[13];
        if (S.lllIIIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIlIIlllIl = new d(lIIIIllIII[13], lIIIIllIII[12], lIIIIllIII[7]);
            bx.add((d)lllIlIIlllIl);
            0;
        }
        if (S.lllIIIllIIlI(Bank.contains((Predicate)(lllIlIIlllIl = item -> item.getName().toLowerCase().contains(lIIIIlIlll[lIIIIllIII[31]]))) ? 1 : 0)) {
            lllIlIIlllII = new d(lIIIIllIII[25], lIIIIllIII[12], lIIIIllIII[26]);
            bx.add(lllIlIIlllII);
            0;
        }
        int[] nArray8 = new int[lIIIIllIII[1]];
        nArray8[S.lIIIIllIII[0]] = lIIIIllIII[27];
        if (S.lllIIIllIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lllIlIIlllII = new d(lIIIIllIII[27], lIIIIllIII[28], lIIIIllIII[29]);
            bx.add(lllIlIIlllII);
            0;
        }
    }

    private static String lllIIIlIllII(String lllIIllIlIll, String lllIIllIlIlI) {
        try {
            SecretKeySpec lllIIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIIllIII[16]), "DES");
            Cipher lllIIllIllll = Cipher.getInstance("DES");
            lllIIllIllll.init(lIIIIllIII[3], lllIIlllIIII);
            return new String(lllIIllIllll.doFinal(Base64.getDecoder().decode(lllIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllIlllI) {
            lllIIllIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIllIIlI(int n2) {
        return n2 == 0;
    }

    static {
        S.lllIIIlIllll();
        S.lllIIIlIlllI();
        kY = lIIIIllIII[11];
        kW = lIIIIllIII[8];
        kX = lIIIIllIII[10];
        kZ = new WorldPoint(lIIIIllIII[32], lIIIIllIII[33], lIIIIllIII[0]);
        String[] stringArray = new String[lIIIIllIII[6]];
        stringArray[S.lIIIIllIII[0]] = lIIIIlIlll[lIIIIllIII[34]];
        stringArray[S.lIIIIllIII[1]] = lIIIIlIlll[lIIIIllIII[35]];
        stringArray[S.lIIIIllIII[3]] = lIIIIlIlll[lIIIIllIII[36]];
        stringArray[S.lIIIIllIII[5]] = lIIIIlIlll[lIIIIllIII[37]];
        la = stringArray;
        bx = new ArrayList<d>();
        cI = lIIIIllIII[0];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (S.lllIIIllIlIl(e.j(lIIIIllIII[4]), lIIIIllIII[14])) {
            bl = lIIIIllIII[1];
            0;
            if ((((0xE ^ 0x44) & ~(0xE ^ 0x44) ^ (0x44 ^ 0x59)) & (0xB ^ 0x28 ^ (0x7C ^ 0x42) ^ -1)) > 0) {
                return ((0x4A ^ 0x69 ^ (0x67 ^ 0x1A)) & (0xAF ^ 0x8B ^ (0xF2 ^ 0x88) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIllIII[0];
        }
        return bl;
    }

    private static void lllIIIlIllll() {
        lIIIIllIII = new int[39];
        S.lIIIIllIII[0] = (0x19 ^ 0x49 ^ (0xF6 ^ 0x80)) & (0xB3 ^ 0x8A ^ (0x2A ^ 0x35) ^ -1);
        S.lIIIIllIII[1] = 1;
        S.lIIIIllIII[2] = 0xBB ^ 0x89;
        S.lIIIIllIII[3] = 2;
        S.lIIIIllIII[4] = 0x77 ^ 0x68;
        S.lIIIIllIII[5] = 3;
        S.lIIIIllIII[6] = 120 + 153 - 106 + 29 ^ 69 + 152 - 79 + 50;
        S.lIIIIllIII[7] = -(0xFFFFEB6E & 0x74F7) & (0xFFFFFFED & 0x73FF);
        S.lIIIIllIII[8] = 0xFFFFF7F7 & 0x9BA;
        S.lIIIIllIII[9] = 0x7B ^ 0x4D ^ (1 ^ 0x31);
        S.lIIIIllIII[10] = 0xFFFFAFB8 & 0x51FF;
        S.lIIIIllIII[11] = -(0xFFFFF6CC & 0x1F3F) & (0xFFFF97FF & 0x7FBF);
        S.lIIIIllIII[12] = 0xD8 ^ 0xBA ^ (0x64 ^ 3);
        S.lIIIIllIII[13] = 0xFFFF9FC9 & 0x7F7F;
        S.lIIIIllIII[14] = 0xE4 ^ 0x80;
        S.lIIIIllIII[15] = 57 + 118 - 54 + 10 ^ 22 + 130 - 65 + 45;
        S.lIIIIllIII[16] = 0x95 ^ 0x9D;
        S.lIIIIllIII[17] = 0x88 ^ 0x81;
        S.lIIIIllIII[18] = 1 ^ (0 ^ 0xB);
        S.lIIIIllIII[19] = 0xA5 ^ 0xAE;
        S.lIIIIllIII[20] = 0x90 ^ 0xB6 ^ (9 ^ 0x23);
        S.lIIIIllIII[21] = 0xCE ^ 0xC3;
        S.lIIIIllIII[22] = 0x93 ^ 0x9D;
        S.lIIIIllIII[23] = 136 + 4 - 60 + 106 ^ 116 + 132 - 153 + 86;
        S.lIIIIllIII[24] = -(0xFFFFF63D & 0x39CE) & (0xFFFFB1FF & Short.MAX_VALUE);
        S.lIIIIllIII[25] = -(0xFFFFCEEE & 0x7115) & (0xFFFFEFFF & 0x7ECF);
        S.lIIIIllIII[26] = 0xFFFFE9BF & 0x77E8;
        S.lIIIIllIII[27] = 0xFFFF9FD7 & 0x7F6F;
        S.lIIIIllIII[28] = 0x49 ^ 0x61;
        S.lIIIIllIII[29] = 0xFFFFFDDF & 0x7FC;
        S.lIIIIllIII[30] = 0x4E ^ 0x5E;
        S.lIIIIllIII[31] = 30 + 126 - 9 + 2 ^ 81 + 53 - 52 + 50;
        S.lIIIIllIII[32] = 0xFFFFBBD7 & 0x4FAF;
        S.lIIIIllIII[33] = 0xFFFFEDFB & 0x1F7F;
        S.lIIIIllIII[34] = 0x30 ^ 0x5A ^ (0x2C ^ 0x54);
        S.lIIIIllIII[35] = 156 + 26 - 12 + 6 ^ 78 + 41 - 98 + 142;
        S.lIIIIllIII[36] = 0x8B ^ 0x9F;
        S.lIIIIllIII[37] = 0x95 ^ 0x80;
        S.lIIIIllIII[38] = 0xF ^ 0x19;
    }

    private static boolean lllIIIllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIIIlIlIll(String lllIlIIIIIlI, String lllIIlllllII) {
        lllIlIIIIIlI = new String(Base64.getDecoder().decode(lllIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIIIIII = new StringBuilder();
        char[] lllIIlllllll = lllIIlllllII.toCharArray();
        int lllIIllllllI = lIIIIllIII[0];
        char[] lllIIllllIII = lllIlIIIIIlI.toCharArray();
        int lllIIlllIlll = lllIIllllIII.length;
        int lllIIlllIllI = lIIIIllIII[0];
        while (S.lllIIIllIIIl(lllIIlllIllI, lllIIlllIlll)) {
            char lllIlIIIIIll = lllIIllllIII[lllIIlllIllI];
            lllIlIIIIIII.append((char)(lllIlIIIIIll ^ lllIIlllllll[lllIIllllllI % lllIIlllllll.length]));
            0;
            ++lllIIllllllI;
            ++lllIIlllIllI;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllIlIIIIIII);
    }

    private static boolean lllIIIllIlII(Object object) {
        return object != null;
    }

    public static void cT() {
        block22: {
            BankLocation lllIlIlIIIlI;
            block23: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                if (S.lllIIIllIIII(bv ? 1 : 0)) {
                                    AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[0]];
                                    b.a(bx);
                                    if (S.lllIIIllIIIl(bx.size(), lIIIIllIII[1])) {
                                        System.out.println(lIIIIlIlll[lIIIIllIII[1]]);
                                        bv = lIIIIllIII[0];
                                    }
                                }
                                if (!S.lllIIIllIIlI(bv ? 1 : 0)) break block22;
                                if (S.lllIIIllIIII(Inventory.contains((int[])f.bc) ? 1 : 0) && S.lllIIIllIIIl(Movement.getRunEnergy(), lIIIIllIII[2])) {
                                    Inventory.getFirst((int[])f.bc).interact(lIIIIlIlll[lIIIIllIII[3]]);
                                    Time.sleepTicks((int)lIIIIllIII[1]);
                                    0;
                                }
                                if (S.lllIIIllIIlI(Movement.isRunEnabled() ? 1 : 0) && S.lllIIIllIIll(Movement.getRunEnergy())) {
                                    Movement.toggleRun();
                                }
                                if (!S.lllIIIllIIlI(S.an() ? 1 : 0) || !S.lllIIIllIIIl(e.j(lIIIIllIII[4]), lIIIIllIII[1])) break block23;
                                lllIlIlIIIlI = BankLocation.getNearest();
                                if (S.lllIIIllIlII(lllIlIlIIIlI) && S.lllIIIllIIlI(lllIlIlIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[5]];
                                    a.a(lllIlIlIIIlI);
                                    Time.sleepTicks((int)lIIIIllIII[3]);
                                    0;
                                }
                                if (!S.lllIIIllIlII(lllIlIlIIIlI) || !S.lllIIIllIIII(lllIlIlIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block23;
                                AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[6]];
                                if (S.lllIIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIllIII[7]);
                                    0;
                                }
                                if (!S.lllIIIllIIII(Bank.isOpen() ? 1 : 0)) break block23;
                                if (S.lllIIIllIIll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIIIllIII[6]);
                                    0;
                                }
                                if (S.lllIIIllIIll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIIIllIII[3]);
                                    0;
                                }
                                int[] nArray = new int[lIIIIllIII[1]];
                                nArray[S.lIIIIllIII[0]] = lIIIIllIII[8];
                                if (!S.lllIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                int[] nArray2 = new int[lIIIIllIII[1]];
                                nArray2[S.lIIIIllIII[0]] = lIIIIllIII[8];
                                if (!S.lllIIIllIlIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIllIII[9])) break block25;
                            }
                            int[] nArray = new int[lIIIIllIII[1]];
                            nArray[S.lIIIIllIII[0]] = lIIIIllIII[10];
                            if (!S.lllIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray3 = new int[lIIIIllIII[1]];
                            nArray3[S.lIIIIllIII[0]] = lIIIIllIII[10];
                            if (!S.lllIIIllIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIllIII[3])) break block25;
                        }
                        int[] nArray = new int[lIIIIllIII[1]];
                        nArray[S.lIIIIllIII[0]] = lIIIIllIII[11];
                        if (!S.lllIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                        int[] nArray4 = new int[lIIIIllIII[1]];
                        nArray4[S.lIIIIllIII[0]] = lIIIIllIII[11];
                        if (!S.lllIIIllIIIl(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIllIII[6])) break block27;
                    }
                    S.Q();
                    System.out.println(lIIIIlIlll[lIIIIllIII[12]]);
                    bv = lIIIIllIII[1];
                    return;
                }
                int[] nArray = new int[lIIIIllIII[6]];
                nArray[S.lIIIIllIII[0]] = lIIIIllIII[11];
                nArray[S.lIIIIllIII[1]] = lIIIIllIII[10];
                nArray[S.lIIIIllIII[3]] = lIIIIllIII[8];
                nArray[S.lIIIIllIII[5]] = lIIIIllIII[13];
                if (S.lllIIIllIIlI(e.d(nArray) ? 1 : 0)) {
                    S.Q();
                    System.out.println(lIIIIlIlll[lIIIIllIII[9]]);
                    bv = lIIIIllIII[1];
                    return;
                }
                int[] nArray5 = new int[lIIIIllIII[6]];
                nArray5[S.lIIIIllIII[0]] = lIIIIllIII[11];
                nArray5[S.lIIIIllIII[1]] = lIIIIllIII[10];
                nArray5[S.lIIIIllIII[3]] = lIIIIllIII[8];
                nArray5[S.lIIIIllIII[5]] = lIIIIllIII[13];
                if (S.lllIIIllIIII(e.d(nArray5) ? 1 : 0)) {
                    a.a(lIIIIllIII[11], lIIIIllIII[6]);
                    a.a(lIIIIllIII[10], lIIIIllIII[3]);
                    a.a(lIIIIllIII[8], lIIIIllIII[9]);
                    a.a(lIIIIllIII[13], lIIIIllIII[1]);
                }
                if (S.lllIIIllIIII(AccBuilderGWD.e ? 1 : 0)) {
                    a.b(f.bm, lIIIIllIII[1]);
                }
            }
            if (S.lllIIIllIIlI(S.an() ? 1 : 0) && S.lllIIIllIIll(e.j(lIIIIllIII[4])) && S.lllIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIIIllIII[12])) {
                S.bm();
            }
            if ((!S.lllIIIllIIlI(S.an() ? 1 : 0) || S.lllIIIllIlll(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIIIllIII[12])) && S.lllIIIllIIIl(e.j(lIIIIllIII[4]), lIIIIllIII[14])) {
                if (S.lllIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIIIllIII[6])) {
                    dk = lIIIIllIII[0];
                    AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[15]];
                    if (S.lllIIIllIIIl(cI, lIIIIllIII[1])) {
                        e.x();
                        cI += lIIIIllIII[1];
                    }
                    Movement.walkTo((WorldPoint)kZ);
                    0;
                }
                if (S.lllIIIllIlll(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIIIllIII[9])) {
                    AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[16]];
                    String[] stringArray = new String[lIIIIllIII[1]];
                    stringArray[S.lIIIIllIII[0]] = lIIIIlIlll[lIIIIllIII[17]];
                    lllIlIlIIIlI = TileObjects.getNearest((String[])stringArray);
                    if (S.lllIIIllIlII(lllIlIlIIIlI)) {
                        String[] stringArray2 = new String[lIIIIllIII[1]];
                        stringArray2[S.lIIIIllIII[0]] = lIIIIlIlll[lIIIIllIII[18]];
                        if (S.lllIIIllIIII(lllIlIlIIIlI.hasAction(stringArray2) ? 1 : 0)) {
                            lllIlIlIIIlI.interact(lIIIIlIlll[lIIIIllIII[19]]);
                            Time.sleepTicks((int)lIIIIllIII[5]);
                            0;
                        }
                    }
                    if (S.lllIIIllIIIl(dk, lIIIIllIII[1])) {
                        as.pY += lIIIIllIII[1];
                        as.u(AccBuilderGWD.m);
                        dk += lIIIIllIII[1];
                        as.pY = lIIIIllIII[0];
                        dl = lIIIIllIII[0];
                    }
                    g.a(lIIIIlIlll[lIIIIllIII[20]], la);
                }
            }
            g.a(new String[lIIIIllIII[0]]);
        }
        System.out.println("Setting: " + e.j(lIIIIllIII[4]));
    }

    private static boolean lllIIIllIIll(int n2) {
        return n2 > 0;
    }

    @Override
    public String ag() {
        return lIIIIlIlll[lIIIIllIII[30]];
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void lllIlIlIIIII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (S.lllIIIllIlII(bankLocation) && S.lllIIIllIIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[21]];
            a.a(bankLocation);
            Time.sleepTicks((int)lIIIIllIII[3]);
            0;
        }
        if (S.lllIIIllIlII(lllIlIlIIIII) && S.lllIIIllIIII(lllIlIlIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[22]];
            if (S.lllIIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIllIII[7]);
                0;
            }
            if (S.lllIIIllIIII(Bank.isOpen() ? 1 : 0)) {
                if (S.lllIIIllIIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIIllIII[6]);
                    0;
                }
                if (S.lllIIIllIIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIIllIII[3]);
                    0;
                }
                int[] nArray = new int[lIIIIllIII[6]];
                nArray[S.lIIIIllIII[0]] = lIIIIllIII[11];
                nArray[S.lIIIIllIII[1]] = lIIIIllIII[10];
                nArray[S.lIIIIllIII[3]] = lIIIIllIII[8];
                nArray[S.lIIIIllIII[5]] = lIIIIllIII[13];
                if (S.lllIIIllIIlI(e.d(nArray) ? 1 : 0)) {
                    S.Q();
                    System.out.println(lIIIIlIlll[lIIIIllIII[23]]);
                    bv = lIIIIllIII[1];
                    return;
                }
                int[] nArray2 = new int[lIIIIllIII[6]];
                nArray2[S.lIIIIllIII[0]] = lIIIIllIII[11];
                nArray2[S.lIIIIllIII[1]] = lIIIIllIII[10];
                nArray2[S.lIIIIllIII[3]] = lIIIIllIII[8];
                nArray2[S.lIIIIllIII[5]] = lIIIIllIII[13];
                if (S.lllIIIllIIII(e.d(nArray2) ? 1 : 0)) {
                    a.a(lIIIIllIII[11], lIIIIllIII[6]);
                    a.a(lIIIIllIII[10], lIIIIllIII[3]);
                    a.a(lIIIIllIII[8], lIIIIllIII[9]);
                    a.a(lIIIIllIII[13], lIIIIllIII[1]);
                }
                a.b(f.bm, lIIIIllIII[1]);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[lIIIIllIII[1]];
        nArray[S.lIIIIllIII[0]] = lIIIIllIII[8];
        if (S.lllIIIllIlIl(Inventory.getCount((int[])nArray), lIIIIllIII[9])) {
            int[] nArray2 = new int[lIIIIllIII[1]];
            nArray2[S.lIIIIllIII[0]] = lIIIIllIII[10];
            if (S.lllIIIllIlIl(Inventory.getCount((int[])nArray2), lIIIIllIII[3])) {
                int[] nArray3 = new int[lIIIIllIII[1]];
                nArray3[S.lIIIIllIII[0]] = lIIIIllIII[11];
                if (S.lllIIIllIlIl(Inventory.getCount((int[])nArray3), lIIIIllIII[6])) {
                    n2 = lIIIIllIII[1];
                    0;
                    if ((22 + 168 - 123 + 130 ^ 61 + 74 - -54 + 4) >= (((0xB0 ^ 0x99) & ~(0xB7 ^ 0x9E) ^ (0x46 ^ 0x74)) & (101 + 148 - 201 + 107 ^ 106 + 111 - 118 + 70 ^ -1))) return n2 != 0;
                    return ((0xCA ^ 0xB4 ^ (0xB6 ^ 0xC6)) & ((0xDF ^ 0x91) & ~(0x38 ^ 0x76) ^ (0x72 ^ 0x7C) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIIllIII[0];
        return n2 != 0;
    }

    private static boolean lllIIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIIIlIllIl(String lllIlIIlIIlI, String lllIlIIIllll) {
        try {
            SecretKeySpec lllIlIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIlIlII = Cipher.getInstance("Blowfish");
            lllIlIIlIlII.init(lIIIIllIII[3], lllIlIIlIlIl);
            return new String(lllIlIIlIlII.doFinal(Base64.getDecoder().decode(lllIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIlIIll) {
            lllIlIIlIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            S.cT();
            0;
        }
        catch (Exception lllIlIIllIlI) {
            lllIlIIllIlI.printStackTrace();
        }
        if (((0x34 ^ 0x39) & ~(0x3E ^ 0x33)) != ((0x56 ^ 0x1E) & ~(0x38 ^ 0x70))) {
            return (0x1B ^ 0x51) & ~(0x7E ^ 0x34);
        }
        return lIIIIllIII[18];
    }

    private static boolean lllIIIllIlll(int n2, int n3) {
        return n2 <= n3;
    }
}

