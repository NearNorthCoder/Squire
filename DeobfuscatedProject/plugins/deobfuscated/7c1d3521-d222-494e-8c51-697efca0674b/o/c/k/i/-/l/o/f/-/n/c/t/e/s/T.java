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
import net.unethicalite.api.entities.TileObjects;
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

public class T
implements ac {
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ int lR;
    static /* synthetic */ int di;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ String[] llIIlIIllI;
    private static final /* synthetic */ String[] lV;
    private static /* synthetic */ int[] llIIlIIlll;
    private static final /* synthetic */ WorldPoint lU;
    private static final /* synthetic */ int lT;
    private static final /* synthetic */ int lS;
    static /* synthetic */ int cG;
    public static /* synthetic */ boolean bt;

    /*
     * WARNING - void declaration
     */
    private static void dA() {
        void llllllllllllllllllIlIIllIlIIlIll;
        BankLocation bankLocation = BankLocation.getNearest();
        if (T.lIlIlIIllllII(bankLocation) && T.lIlIlIIlllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[21]];
            a.a(bankLocation);
            Time.sleepTicks((int)llIIlIIlll[3]);
            0;
        }
        if (T.lIlIlIIllllII(llllllllllllllllllIlIIllIlIIlIll) && T.lIlIlIIlllIII(llllllllllllllllllIlIIllIlIIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[22]];
            if (T.lIlIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIlll[7]);
                0;
            }
            if (T.lIlIlIIlllIII(Bank.isOpen() ? 1 : 0)) {
                if (T.lIlIlIIlllIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIIlIIlll[6]);
                    0;
                }
                if (T.lIlIlIIlllIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llIIlIIlll[3]);
                    0;
                }
                int[] nArray = new int[llIIlIIlll[6]];
                nArray[T.llIIlIIlll[0]] = llIIlIIlll[11];
                nArray[T.llIIlIIlll[1]] = llIIlIIlll[10];
                nArray[T.llIIlIIlll[3]] = llIIlIIlll[8];
                nArray[T.llIIlIIlll[5]] = llIIlIIlll[13];
                if (T.lIlIlIIlllIlI(e.c(nArray) ? 1 : 0)) {
                    T.Q();
                    System.out.println(llIIlIIllI[llIIlIIlll[23]]);
                    bt = llIIlIIlll[1];
                    return;
                }
                int[] nArray2 = new int[llIIlIIlll[6]];
                nArray2[T.llIIlIIlll[0]] = llIIlIIlll[11];
                nArray2[T.llIIlIIlll[1]] = llIIlIIlll[10];
                nArray2[T.llIIlIIlll[3]] = llIIlIIlll[8];
                nArray2[T.llIIlIIlll[5]] = llIIlIIlll[13];
                if (T.lIlIlIIlllIII(e.c(nArray2) ? 1 : 0)) {
                    a.a(llIIlIIlll[11], llIIlIIlll[6]);
                    a.a(llIIlIIlll[10], llIIlIIlll[3]);
                    a.a(llIIlIIlll[8], llIIlIIlll[9]);
                    a.a(llIIlIIlll[13], llIIlIIlll[1]);
                }
                a.b(f.bk, llIIlIIlll[1]);
            }
        }
    }

    private static boolean lIlIlIIllllII(Object object) {
        return object != null;
    }

    @Override
    public String ag() {
        return llIIlIIllI[llIIlIIlll[30]];
    }

    private static boolean lIlIlIIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIlIIllIlIl(String llllllllllllllllllIlIIllIIllllIl, String llllllllllllllllllIlIIllIIlllIlI) {
        try {
            SecretKeySpec llllllllllllllllllIlIIllIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIllIIlllIlI.getBytes(StandardCharsets.UTF_8)), llIIlIIlll[16]), "DES");
            Cipher llllllllllllllllllIlIIllIIllllll = Cipher.getInstance("DES");
            llllllllllllllllllIlIIllIIllllll.init(llIIlIIlll[3], llllllllllllllllllIlIIllIlIIIIII);
            return new String(llllllllllllllllllIlIIllIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIllIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIllIIlllllI) {
            llllllllllllllllllIlIIllIIlllllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIIllIllI() {
        llIIlIIllI = new String[llIIlIIlll[38]];
        T.llIIlIIllI[T.llIIlIIlll[0]] = T."Buying items";
        T.llIIlIIllI[T.llIIlIIlll[1]] = T."Finished buying items, switching back to quest";
        T.llIIlIIllI[T.llIIlIIlll[3]] = T."Drink";
        T.llIIlIIllI[T.llIIlIIlll[5]] = T."Nav to bank";
        T.llIIlIIllI[T.llIIlIIlll[6]] = T."Handling banking";
        T.llIIlIIllI[T.llIIlIIlll[12]] = T."We are missing quest supplies, switching to BUYING";
        T.llIIlIIllI[T.llIIlIIlll[9]] = T."We are missing quest supplies, switching to BUYING";
        T.llIIlIIllI[T.llIIlIIlll[15]] = T."Nav to start";
        T.llIIlIIllI[T.llIIlIIlll[16]] = T."Handle dialog";
        T.llIIlIIllI[T.llIIlIIlll[17]] = T."Door";
        T.llIIlIIllI[T.llIIlIIlll[18]] = T."Open";
        T.llIIlIIllI[T.llIIlIIlll[19]] = T."Open";
        T.llIIlIIllI[T.llIIlIIlll[20]] = T."Doric";
        T.llIIlIIllI[T.llIIlIIlll[21]] = T."Nav to bank";
        T.llIIlIIllI[T.llIIlIIlll[22]] = T."Handling banking";
        T.llIIlIIllI[T.llIIlIIlll[23]] = T."We are missing quest supplies, switching to BUYING";
        T.llIIlIIllI[T.llIIlIIlll[30]] = T."Dorics quest";
        T.llIIlIIllI[T.llIIlIIlll[31]] = T."ring of wealth (";
        T.llIIlIIllI[T.llIIlIIlll[34]] = T."I wanted to use your anvils.";
        T.llIIlIIllI[T.llIIlIIlll[35]] = T."Yes, I will get you the materials.";
        T.llIIlIIllI[T.llIIlIIlll[36]] = T."Certainly, I'll be right back!";
        T.llIIlIIllI[T.llIIlIIlll[37]] = T."Yes.";
    }

    private static String lIlIlIIllIIll(String llllllllllllllllllIlIIllIIlIIIII, String llllllllllllllllllIlIIllIIIlllll) {
        llllllllllllllllllIlIIllIIlIIIII = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIllIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIIllIIIllllI = new StringBuilder();
        char[] llllllllllllllllllIlIIllIIIlllIl = llllllllllllllllllIlIIllIIIlllll.toCharArray();
        int llllllllllllllllllIlIIllIIIlllII = llIIlIIlll[0];
        char[] llllllllllllllllllIlIIllIIIlIllI = llllllllllllllllllIlIIllIIlIIIII.toCharArray();
        int llllllllllllllllllIlIIllIIIlIlIl = llllllllllllllllllIlIIllIIIlIllI.length;
        int llllllllllllllllllIlIIllIIIlIlII = llIIlIIlll[0];
        while (T.lIlIlIIlllIIl(llllllllllllllllllIlIIllIIIlIlII, llllllllllllllllllIlIIllIIIlIlIl)) {
            char llllllllllllllllllIlIIllIIlIIIIl = llllllllllllllllllIlIIllIIIlIllI[llllllllllllllllllIlIIllIIIlIlII];
            llllllllllllllllllIlIIllIIIllllI.append((char)(llllllllllllllllllIlIIllIIlIIIIl ^ llllllllllllllllllIlIIllIIIlllIl[llllllllllllllllllIlIIllIIIlllII % llllllllllllllllllIlIIllIIIlllIl.length]));
            0;
            ++llllllllllllllllllIlIIllIIIlllII;
            ++llllllllllllllllllIlIIllIIIlIlII;
            0;
            if (-1 < ((0xA3 ^ 0x91) & ~(0x9E ^ 0xAC))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIIllIIIllllI);
    }

    private static void Q() {
        d llllllllllllllllllIlIIllIlIIIlll;
        Object llllllllllllllllllIlIIllIlIIlIII;
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                int[] nArray = new int[llIIlIIlll[1]];
                                nArray[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[llIIlIIlll[1]];
                                nArray2[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[llIIlIIlll[1]];
                                nArray3[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIlllIIl(Bank.getFirst((int[])nArray3).getQuantity(), llIIlIIlll[9])) break block13;
                            }
                            llllllllllllllllllIlIIllIlIIlIII = new d(llIIlIIlll[8], llIIlIIlll[9], llIIlIIlll[24]);
                            bv.add((d)llllllllllllllllllIlIIllIlIIlIII);
                            0;
                        }
                        int[] nArray = new int[llIIlIIlll[1]];
                        nArray[T.llIIlIIlll[0]] = llIIlIIlll[10];
                        if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray4 = new int[llIIlIIlll[1]];
                        nArray4[T.llIIlIIlll[0]] = llIIlIIlll[10];
                        if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block15;
                        int[] nArray5 = new int[llIIlIIlll[1]];
                        nArray5[T.llIIlIIlll[0]] = llIIlIIlll[10];
                        if (!T.lIlIlIIlllIIl(Bank.getFirst((int[])nArray5).getQuantity(), llIIlIIlll[3])) break block15;
                    }
                    llllllllllllllllllIlIIllIlIIlIII = new d(llIIlIIlll[10], llIIlIIlll[3], llIIlIIlll[24]);
                    bv.add((d)llllllllllllllllllIlIIllIlIIlIII);
                    0;
                }
                int[] nArray = new int[llIIlIIlll[1]];
                nArray[T.llIIlIIlll[0]] = llIIlIIlll[11];
                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray6 = new int[llIIlIIlll[1]];
                nArray6[T.llIIlIIlll[0]] = llIIlIIlll[11];
                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block17;
                int[] nArray7 = new int[llIIlIIlll[1]];
                nArray7[T.llIIlIIlll[0]] = llIIlIIlll[11];
                if (!T.lIlIlIIlllIIl(Bank.getFirst((int[])nArray7).getQuantity(), llIIlIIlll[6])) break block17;
            }
            llllllllllllllllllIlIIllIlIIlIII = new d(llIIlIIlll[11], llIIlIIlll[6], llIIlIIlll[24]);
            bv.add((d)llllllllllllllllllIlIIllIlIIlIII);
            0;
        }
        int[] nArray = new int[llIIlIIlll[1]];
        nArray[T.llIIlIIlll[0]] = llIIlIIlll[13];
        if (T.lIlIlIIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllllllIlIIllIlIIlIII = new d(llIIlIIlll[13], llIIlIIlll[12], llIIlIIlll[7]);
            bv.add((d)llllllllllllllllllIlIIllIlIIlIII);
            0;
        }
        if (T.lIlIlIIlllIlI(Bank.contains((Predicate)(llllllllllllllllllIlIIllIlIIlIII = item -> item.getName().toLowerCase().contains(llIIlIIllI[llIIlIIlll[31]]))) ? 1 : 0)) {
            llllllllllllllllllIlIIllIlIIIlll = new d(llIIlIIlll[25], llIIlIIlll[12], llIIlIIlll[26]);
            bv.add(llllllllllllllllllIlIIllIlIIIlll);
            0;
        }
        int[] nArray8 = new int[llIIlIIlll[1]];
        nArray8[T.llIIlIIlll[0]] = llIIlIIlll[27];
        if (T.lIlIlIIlllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            llllllllllllllllllIlIIllIlIIIlll = new d(llIIlIIlll[27], llIIlIIlll[28], llIIlIIlll[29]);
            bv.add(llllllllllllllllllIlIIllIlIIIlll);
            0;
        }
    }

    public static void dz() {
        block22: {
            BankLocation llllllllllllllllllIlIIllIlIIllIl;
            block23: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                if (T.lIlIlIIlllIII(bt ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[0]];
                                    b.a(bv);
                                    if (T.lIlIlIIlllIIl(bv.size(), llIIlIIlll[1])) {
                                        System.out.println(llIIlIIllI[llIIlIIlll[1]]);
                                        bt = llIIlIIlll[0];
                                    }
                                }
                                if (!T.lIlIlIIlllIlI(bt ? 1 : 0)) break block22;
                                if (T.lIlIlIIlllIII(Inventory.contains((int[])f.ba) ? 1 : 0) && T.lIlIlIIlllIIl(Movement.getRunEnergy(), llIIlIIlll[2])) {
                                    Inventory.getFirst((int[])f.ba).interact(llIIlIIllI[llIIlIIlll[3]]);
                                    Time.sleepTicks((int)llIIlIIlll[1]);
                                    0;
                                }
                                if (T.lIlIlIIlllIlI(Movement.isRunEnabled() ? 1 : 0) && T.lIlIlIIlllIll(Movement.getRunEnergy())) {
                                    Movement.toggleRun();
                                }
                                if (!T.lIlIlIIlllIlI(T.an() ? 1 : 0) || !T.lIlIlIIlllIIl(e.j(llIIlIIlll[4]), llIIlIIlll[1])) break block23;
                                llllllllllllllllllIlIIllIlIIllIl = BankLocation.getNearest();
                                if (T.lIlIlIIllllII(llllllllllllllllllIlIIllIlIIllIl) && T.lIlIlIIlllIlI(llllllllllllllllllIlIIllIlIIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[5]];
                                    a.a(llllllllllllllllllIlIIllIlIIllIl);
                                    Time.sleepTicks((int)llIIlIIlll[3]);
                                    0;
                                }
                                if (!T.lIlIlIIllllII(llllllllllllllllllIlIIllIlIIllIl) || !T.lIlIlIIlllIII(llllllllllllllllllIlIIllIlIIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block23;
                                AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[6]];
                                if (T.lIlIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIlll[7]);
                                    0;
                                }
                                if (!T.lIlIlIIlllIII(Bank.isOpen() ? 1 : 0)) break block23;
                                if (T.lIlIlIIlllIll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIlIIlll[6]);
                                    0;
                                }
                                if (T.lIlIlIIlllIll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIlIIlll[3]);
                                    0;
                                }
                                int[] nArray = new int[llIIlIIlll[1]];
                                nArray[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                int[] nArray2 = new int[llIIlIIlll[1]];
                                nArray2[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIllllIl(Bank.getFirst((int[])nArray2).getQuantity(), llIIlIIlll[9])) break block25;
                            }
                            int[] nArray = new int[llIIlIIlll[1]];
                            nArray[T.llIIlIIlll[0]] = llIIlIIlll[10];
                            if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray3 = new int[llIIlIIlll[1]];
                            nArray3[T.llIIlIIlll[0]] = llIIlIIlll[10];
                            if (!T.lIlIlIIllllIl(Bank.getFirst((int[])nArray3).getQuantity(), llIIlIIlll[3])) break block25;
                        }
                        int[] nArray = new int[llIIlIIlll[1]];
                        nArray[T.llIIlIIlll[0]] = llIIlIIlll[11];
                        if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                        int[] nArray4 = new int[llIIlIIlll[1]];
                        nArray4[T.llIIlIIlll[0]] = llIIlIIlll[11];
                        if (!T.lIlIlIIlllIIl(Bank.getFirst((int[])nArray4).getQuantity(), llIIlIIlll[6])) break block27;
                    }
                    T.Q();
                    System.out.println(llIIlIIllI[llIIlIIlll[12]]);
                    bt = llIIlIIlll[1];
                    return;
                }
                int[] nArray = new int[llIIlIIlll[6]];
                nArray[T.llIIlIIlll[0]] = llIIlIIlll[11];
                nArray[T.llIIlIIlll[1]] = llIIlIIlll[10];
                nArray[T.llIIlIIlll[3]] = llIIlIIlll[8];
                nArray[T.llIIlIIlll[5]] = llIIlIIlll[13];
                if (T.lIlIlIIlllIlI(e.c(nArray) ? 1 : 0)) {
                    T.Q();
                    System.out.println(llIIlIIllI[llIIlIIlll[9]]);
                    bt = llIIlIIlll[1];
                    return;
                }
                int[] nArray5 = new int[llIIlIIlll[6]];
                nArray5[T.llIIlIIlll[0]] = llIIlIIlll[11];
                nArray5[T.llIIlIIlll[1]] = llIIlIIlll[10];
                nArray5[T.llIIlIIlll[3]] = llIIlIIlll[8];
                nArray5[T.llIIlIIlll[5]] = llIIlIIlll[13];
                if (T.lIlIlIIlllIII(e.c(nArray5) ? 1 : 0)) {
                    a.a(llIIlIIlll[11], llIIlIIlll[6]);
                    a.a(llIIlIIlll[10], llIIlIIlll[3]);
                    a.a(llIIlIIlll[8], llIIlIIlll[9]);
                    a.a(llIIlIIlll[13], llIIlIIlll[1]);
                }
                if (T.lIlIlIIlllIII(AccBuilderSotf.e ? 1 : 0)) {
                    a.b(f.bk, llIIlIIlll[1]);
                }
            }
            if (T.lIlIlIIlllIlI(T.an() ? 1 : 0) && T.lIlIlIIlllIll(e.j(llIIlIIlll[4])) && T.lIlIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[12])) {
                T.dA();
            }
            if ((!T.lIlIlIIlllIlI(T.an() ? 1 : 0) || T.lIlIlIIllllll(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[12])) && T.lIlIlIIlllIIl(e.j(llIIlIIlll[4]), llIIlIIlll[14])) {
                if (T.lIlIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[6])) {
                    di = llIIlIIlll[0];
                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[15]];
                    if (T.lIlIlIIlllIIl(cG, llIIlIIlll[1])) {
                        e.x();
                        cG += llIIlIIlll[1];
                    }
                    Movement.walkTo((WorldPoint)lU);
                    0;
                }
                if (T.lIlIlIIllllll(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[9])) {
                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[16]];
                    String[] stringArray = new String[llIIlIIlll[1]];
                    stringArray[T.llIIlIIlll[0]] = llIIlIIllI[llIIlIIlll[17]];
                    llllllllllllllllllIlIIllIlIIllIl = TileObjects.getNearest((String[])stringArray);
                    if (T.lIlIlIIllllII(llllllllllllllllllIlIIllIlIIllIl)) {
                        String[] stringArray2 = new String[llIIlIIlll[1]];
                        stringArray2[T.llIIlIIlll[0]] = llIIlIIllI[llIIlIIlll[18]];
                        if (T.lIlIlIIlllIII(llllllllllllllllllIlIIllIlIIllIl.hasAction(stringArray2) ? 1 : 0)) {
                            llllllllllllllllllIlIIllIlIIllIl.interact(llIIlIIllI[llIIlIIlll[19]]);
                            Time.sleepTicks((int)llIIlIIlll[5]);
                            0;
                        }
                    }
                    if (T.lIlIlIIlllIIl(di, llIIlIIlll[1])) {
                        aN.td += llIIlIIlll[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIIlIIlll[1];
                        aN.td = llIIlIIlll[0];
                        dj = llIIlIIlll[0];
                    }
                    g.a(llIIlIIllI[llIIlIIlll[20]], lV);
                }
            }
            g.a(new String[llIIlIIlll[0]]);
        }
        System.out.println("Setting: " + e.j(llIIlIIlll[4]));
    }

    private static String lIlIlIIllIlII(String llllllllllllllllllIlIIllIIllIIII, String llllllllllllllllllIlIIllIIlIllIl) {
        try {
            SecretKeySpec llllllllllllllllllIlIIllIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIllIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIIllIIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIIllIIllIIlI.init(llIIlIIlll[3], llllllllllllllllllIlIIllIIllIIll);
            return new String(llllllllllllllllllIlIIllIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIllIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIllIIllIIIl) {
            llllllllllllllllllIlIIllIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIlllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlIIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIlIIllIlll() {
        llIIlIIlll = new int[39];
        T.llIIlIIlll[0] = (0xB1 ^ 0xAD) & ~(0xAE ^ 0xB2);
        T.llIIlIIlll[1] = 1;
        T.llIIlIIlll[2] = 0x41 ^ 0x73;
        T.llIIlIIlll[3] = 2;
        T.llIIlIIlll[4] = 0xC6 ^ 0xBF ^ (0x1D ^ 0x7B);
        T.llIIlIIlll[5] = 3;
        T.llIIlIIlll[6] = 0x34 ^ 0x30;
        T.llIIlIIlll[7] = -(0xFFFFEDF7 & 0x7E6F) & (0xFFFFFFEE & Short.MAX_VALUE);
        T.llIIlIIlll[8] = 0xFFFFF3F2 & 0xDBF;
        T.llIIlIIlll[9] = 55 + 103 - -13 + 3 ^ 154 + 68 - 63 + 9;
        T.llIIlIIlll[10] = 0xFFFFB9B9 & 0x47FE;
        T.llIIlIIlll[11] = 0xFFFFF1FE & 0xFB5;
        T.llIIlIIlll[12] = 0xC1 ^ 0xC4;
        T.llIIlIIlll[13] = 0xFFFFFFDB & 0x1F6D;
        T.llIIlIIlll[14] = 0x18 ^ 0x7C;
        T.llIIlIIlll[15] = 0xBD ^ 0xA6 ^ (0x65 ^ 0x79);
        T.llIIlIIlll[16] = 0x9C ^ 0x8C ^ (0x6A ^ 0x72);
        T.llIIlIIlll[17] = 0x59 ^ 0x50;
        T.llIIlIIlll[18] = 0xA ^ 0;
        T.llIIlIIlll[19] = 2 ^ 0x14 ^ (0x5F ^ 0x42);
        T.llIIlIIlll[20] = 0x9E ^ 0x92;
        T.llIIlIIlll[21] = 0xCA ^ 0xC7;
        T.llIIlIIlll[22] = 0xD1 ^ 0xBB ^ (0x49 ^ 0x2D);
        T.llIIlIIlll[23] = 0x56 ^ 0x59;
        T.llIIlIIlll[24] = 0xFFFF81FC & 0x7FF7;
        T.llIIlIIlll[25] = 0xFFFFFEDD & 0x2FEE;
        T.llIIlIIlll[26] = 0xFFFFE9A8 & 0x77FF;
        T.llIIlIIlll[27] = -(0xFFFFD6B9 & 0x69CF) & (0xFFFFDFCF & Short.MAX_VALUE);
        T.llIIlIIlll[28] = 0x1A ^ 0x32;
        T.llIIlIIlll[29] = 0xFFFFB7FF & 0x4DDC;
        T.llIIlIIlll[30] = 128 + 128 - 167 + 70 ^ 131 + 97 - 211 + 126;
        T.llIIlIIlll[31] = 0x49 ^ 0x58;
        T.llIIlIIlll[32] = -(0xFFFFDCAF & 0x7371) & (0xFFFFFBA7 & 0x5FFF);
        T.llIIlIIlll[33] = 0xFFFFFFFB & 0xD7F;
        T.llIIlIIlll[34] = 0xB5 ^ 0xA7;
        T.llIIlIIlll[35] = 0x2C ^ 0x3F;
        T.llIIlIIlll[36] = 0x47 ^ 0x53;
        T.llIIlIIlll[37] = 0xB5 ^ 0xA9 ^ (0x89 ^ 0x80);
        T.llIIlIIlll[38] = 138 + 73 - 8 + 8 ^ 107 + 178 - 100 + 12;
    }

    @Override
    public int af() {
        try {
            T.dz();
            0;
        }
        catch (Exception llllllllllllllllllIlIIllIlIIIlIl) {
            llllllllllllllllllIlIIllIlIIIlIl.printStackTrace();
        }
        if (-(0x55 ^ 0x50) >= 0) {
            return (0x26 ^ 0x2E) & ~(0x7C ^ 0x74);
        }
        return llIIlIIlll[18];
    }

    @Override
    public boolean ae() {
        return llIIlIIlll[0];
    }

    private static boolean lIlIlIIlllIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (T.lIlIlIIllllIl(e.j(llIIlIIlll[4]), llIIlIIlll[14])) {
            bl = llIIlIIlll[1];
            0;
            if (((0x6B ^ 0x12 ^ (0x93 ^ 0xAF)) & (0x32 ^ 0x51 ^ (0x15 ^ 0x33) ^ -1) & ((65 + 47 - 75 + 107 ^ 10 + 156 - 93 + 87) & (127 + 17 - 84 + 124 ^ 98 + 39 - 23 + 22 ^ -1) ^ -1)) != 0) {
                return ((0xD2 ^ 0xBD ^ (0x55 ^ 0x76)) & (160 + 210 - 179 + 38 ^ 150 + 18 - 27 + 28 ^ -1)) != 0;
            }
        } else {
            bl = llIIlIIlll[0];
        }
        return bl;
    }

    static {
        T.lIlIlIIllIlll();
        T.lIlIlIIllIllI();
        lR = llIIlIIlll[8];
        lT = llIIlIIlll[11];
        lS = llIIlIIlll[10];
        lU = new WorldPoint(llIIlIIlll[32], llIIlIIlll[33], llIIlIIlll[0]);
        String[] stringArray = new String[llIIlIIlll[6]];
        stringArray[T.llIIlIIlll[0]] = llIIlIIllI[llIIlIIlll[34]];
        stringArray[T.llIIlIIlll[1]] = llIIlIIllI[llIIlIIlll[35]];
        stringArray[T.llIIlIIlll[3]] = llIIlIIllI[llIIlIIlll[36]];
        stringArray[T.llIIlIIlll[5]] = llIIlIIllI[llIIlIIlll[37]];
        lV = stringArray;
        bv = new ArrayList<d>();
        cG = llIIlIIlll[0];
    }

    private static boolean lIlIlIIllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIIlllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIIlIIlll[1]];
        nArray[T.llIIlIIlll[0]] = llIIlIIlll[8];
        if (T.lIlIlIIllllIl(Inventory.getCount((int[])nArray), llIIlIIlll[9])) {
            int[] nArray2 = new int[llIIlIIlll[1]];
            nArray2[T.llIIlIIlll[0]] = llIIlIIlll[10];
            if (T.lIlIlIIllllIl(Inventory.getCount((int[])nArray2), llIIlIIlll[3])) {
                int[] nArray3 = new int[llIIlIIlll[1]];
                nArray3[T.llIIlIIlll[0]] = llIIlIIlll[11];
                if (T.lIlIlIIllllIl(Inventory.getCount((int[])nArray3), llIIlIIlll[6])) {
                    n2 = llIIlIIlll[1];
                    0;
                    if (((0x62 ^ 0x78 ^ (2 ^ 0x5E)) & (0xC5 ^ 0x94 ^ (0x52 ^ 0x45) ^ -1)) == 0) return n2 != 0;
                    return ((156 + 158 - 218 + 74 ^ 156 + 92 - 120 + 61) & (0x25 ^ 0x7F ^ (0xCF ^ 0x82) ^ -1)) != 0;
                }
            }
        }
        n2 = llIIlIIlll[0];
        return n2 != 0;
    }
}

