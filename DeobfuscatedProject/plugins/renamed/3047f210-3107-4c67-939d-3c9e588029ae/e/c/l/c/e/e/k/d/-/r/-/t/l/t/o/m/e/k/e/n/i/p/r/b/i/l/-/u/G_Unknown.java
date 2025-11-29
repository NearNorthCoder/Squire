/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.t_Unknown;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class G_Unknown
implements S {
    private static final /* synthetic */ int hi;
    public static /* synthetic */ List<d> bu;
    private static /* synthetic */ int[] lllIlIllIl;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ WorldPoint hd;
    private static final /* synthetic */ int hf;
    static /* synthetic */ int bS;
    private static final /* synthetic */ int hk;
    private static final /* synthetic */ int hj;
    private static /* synthetic */ String[] lllIlIllII;
    private static final /* synthetic */ int hn;
    private static final /* synthetic */ int hl;
    private static final /* synthetic */ int hh;
    static /* synthetic */ String[] eR;
    public static /* synthetic */ boolean bs;
    private static final /* synthetic */ int ho;
    private static final /* synthetic */ int hg;
    static /* synthetic */ int ck;
    static /* synthetic */ String gc;
    private static final /* synthetic */ int he;
    private static final /* synthetic */ int hm;

    private static boolean llIIIllIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        G.llIIIllIlllIl();
        G.llIIIllIlllII();
        hf = lllIlIllIl[21];
        hj = lllIlIllIl[10];
        hm = lllIlIllIl[86];
        hn = lllIlIllIl[25];
        he = lllIlIllIl[2];
        hi = lllIlIllIl[24];
        hk = lllIlIllIl[15];
        ho = lllIlIllIl[17];
        hh = lllIlIllIl[23];
        hg = lllIlIllIl[22];
        hl = lllIlIllIl[13];
        hd = new WorldPoint(lllIlIllIl[87], lllIlIllIl[88], lllIlIllIl[3]);
        bu = new ArrayList<d>();
        gc = lllIlIllII[lllIlIllIl[89]];
        String[] stringArray = new String[lllIlIllIl[12]];
        stringArray[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[90]];
        stringArray[G.lllIlIllIl[1]] = lllIlIllII[lllIlIllIl[91]];
        stringArray[G.lllIlIllIl[3]] = lllIlIllII[lllIlIllIl[92]];
        stringArray[G.lllIlIllIl[4]] = lllIlIllII[lllIlIllIl[93]];
        stringArray[G.lllIlIllIl[6]] = lllIlIllII[lllIlIllIl[94]];
        stringArray[G.lllIlIllIl[9]] = lllIlIllII[lllIlIllIl[95]];
        eR = stringArray;
        bS = lllIlIllIl[0];
    }

    private static boolean llIIIlllIIIll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (G.llIIIlllIIllI(e.j(lllIlIllIl[2]), lllIlIllIl[3])) {
            bl = lllIlIllIl[1];
            0;
            
            }
        } else {
            bl = lllIlIllIl[0];
        }
        return bl;
    }

    private static boolean llIIIlllIIIIl(Object object) {
        return object != null;
    }

    private static boolean llIIIlllIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIlllIIIlI(int n2) {
        return n2 > 0;
    }

    public static void ct() {
        if (G.llIIIllIllllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[0]];
            b.a(bu);
            if (G.llIIIllIlllll(bu.size(), lllIlIllIl[1])) {
                System.out.println(lllIlIllII[lllIlIllIl[1]]);
                bs = lllIlIllIl[0];
            }
        }
        if (G.llIIIlllIIIII(bs ? 1 : 0)) {
            if (G.llIIIlllIIIII(e.j(lllIlIllIl[2]))) {
                BankLocation var15;
                if (G.llIIIlllIIIII(G.bz() ? 1 : 0)) {
                    var15 = BankLocation.getNearest();
                    if (G.llIIIlllIIIIl(var15) && G.llIIIlllIIIII(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[3]];
                        a.a(var15);
                    }
                    if (G.llIIIlllIIIIl(var15) && G.llIIIllIllllI(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (G.llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[4]];
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIllIl[5]);
                            0;
                        }
                        if (G.llIIIllIllllI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[6]];
                            if (G.llIIIlllIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIlIllIl[4]);
                                0;
                            }
                            if (G.llIIIlllIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIlIllIl[3]);
                                0;
                            }
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[7];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lllIlIllIl[1]];
                                nArray2[G.lllIlIllIl[0]] = lllIlIllIl[7];
                                if (G.llIIIllIlllll(Bank.getFirst((int[])nArray2).getQuantity(), lllIlIllIl[8])) {
                                    G.ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[9]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lllIlIllIl[1]];
                            nArray3[G.lllIlIllIl[0]] = lllIlIllIl[10];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lllIlIllIl[1]];
                                nArray4[G.lllIlIllIl[0]] = lllIlIllIl[10];
                                if (G.llIIIllIlllll(Bank.getFirst((int[])nArray4).getQuantity(), lllIlIllIl[11])) {
                                    G.ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[12]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lllIlIllIl[1]];
                            nArray5[G.lllIlIllIl[0]] = lllIlIllIl[13];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lllIlIllIl[1]];
                                nArray6[G.lllIlIllIl[0]] = lllIlIllIl[13];
                                if (G.llIIIllIlllll(Bank.getFirst((int[])nArray6).getQuantity(), lllIlIllIl[11])) {
                                    G.ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[14]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lllIlIllIl[1]];
                            nArray7[G.lllIlIllIl[0]] = lllIlIllIl[15];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lllIlIllIl[1]];
                                nArray8[G.lllIlIllIl[0]] = lllIlIllIl[15];
                                if (G.llIIIllIlllll(Bank.getFirst((int[])nArray8).getQuantity(), lllIlIllIl[11])) {
                                    G.ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[16]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] nArray9 = new int[lllIlIllIl[1]];
                            nArray9[G.lllIlIllIl[0]] = lllIlIllIl[17];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lllIlIllIl[1]];
                                nArray10[G.lllIlIllIl[0]] = lllIlIllIl[17];
                                if (G.llIIIllIlllll(Bank.getFirst((int[])nArray10).getQuantity(), lllIlIllIl[9])) {
                                    G.ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[18]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] nArray11 = new int[lllIlIllIl[19]];
                            nArray11[G.lllIlIllIl[0]] = lllIlIllIl[20];
                            nArray11[G.lllIlIllIl[1]] = lllIlIllIl[21];
                            nArray11[G.lllIlIllIl[3]] = lllIlIllIl[22];
                            nArray11[G.lllIlIllIl[4]] = lllIlIllIl[23];
                            nArray11[G.lllIlIllIl[6]] = lllIlIllIl[24];
                            nArray11[G.lllIlIllIl[9]] = lllIlIllIl[7];
                            nArray11[G.lllIlIllIl[12]] = lllIlIllIl[17];
                            nArray11[G.lllIlIllIl[14]] = lllIlIllIl[25];
                            nArray11[G.lllIlIllIl[16]] = lllIlIllIl[10];
                            nArray11[G.lllIlIllIl[18]] = lllIlIllIl[15];
                            nArray11[G.lllIlIllIl[8]] = lllIlIllIl[13];
                            if (G.llIIIlllIIIII(e.b(nArray11) ? 1 : 0)) {
                                G.ae();
                                System.out.println(lllIlIllII[lllIlIllIl[8]]);
                                bs = lllIlIllIl[1];
                                return;
                            }
                            while (G.llIIIlllIIIII(t.bl() ? 1 : 0)) {
                                t.bj();
                                Time.sleepTicks((int)lllIlIllIl[1]);
                                0;
                                0;
                                if (-2 < 0) continue;
                                return;
                            }
                            if (G.llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)lllIlIllIl[6]);
                                0;
                            }
                            int[] nArray12 = new int[lllIlIllIl[1]];
                            nArray12[G.lllIlIllIl[0]] = lllIlIllIl[22];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                int[] nArray13 = new int[lllIlIllIl[1]];
                                nArray13[G.lllIlIllIl[0]] = lllIlIllIl[22];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray13), lllIlIllIl[1])) {
                                    Bank.withdraw((int)lllIlIllIl[22], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[22];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if (2 < 0) {
                                                return ((55 + 91 - 12 + 20 ^ 46 + 33 - 27 + 90) & (0xC6 ^ 0xB3 ^ (0xF8 ^ 0x99) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray14 = new int[lllIlIllIl[1]];
                            nArray14[G.lllIlIllIl[0]] = lllIlIllIl[23];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[lllIlIllIl[1]];
                                nArray15[G.lllIlIllIl[0]] = lllIlIllIl[23];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray15), lllIlIllIl[1])) {
                                    Bank.withdraw((int)lllIlIllIl[23], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[23];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if (1 >= 3) {
                                                return false;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray16 = new int[lllIlIllIl[1]];
                            nArray16[G.lllIlIllIl[0]] = lllIlIllIl[21];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                int[] nArray17 = new int[lllIlIllIl[1]];
                                nArray17[G.lllIlIllIl[0]] = lllIlIllIl[21];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray17), lllIlIllIl[1])) {
                                    Bank.withdraw((int)lllIlIllIl[21], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[21];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if (((165 + 81 - 129 + 84 ^ 67 + 119 - 88 + 54) & (0x21 ^ 0x76 ^ (0x22 ^ 0x24) ^ -1)) != 0) {
                                                return ((0x5D ^ 0x2D ^ (0x8B ^ 0xAA)) & (0xB ^ 0x5B ^ 1 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray18 = new int[lllIlIllIl[1]];
                            nArray18[G.lllIlIllIl[0]] = lllIlIllIl[24];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                int[] nArray19 = new int[lllIlIllIl[1]];
                                nArray19[G.lllIlIllIl[0]] = lllIlIllIl[24];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray19), lllIlIllIl[1])) {
                                    Bank.withdraw((int)lllIlIllIl[24], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[24];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if (((0x64 ^ 0x2B) & ~(0x42 ^ 0xD)) < -1) {
                                                return false;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray20 = new int[lllIlIllIl[1]];
                            nArray20[G.lllIlIllIl[0]] = lllIlIllIl[7];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                int[] nArray21 = new int[lllIlIllIl[1]];
                                nArray21[G.lllIlIllIl[0]] = lllIlIllIl[7];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray21), lllIlIllIl[1])) {
                                    Bank.withdraw((int)lllIlIllIl[7], (int)lllIlIllIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[7];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if (2 != 2) {
                                                return ((27 + 59 - -18 + 96 ^ 36 + 59 - -55 + 5) & (0x9D ^ 0x93 ^ (0x69 ^ 0x34) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray22 = new int[lllIlIllIl[1]];
                            nArray22[G.lllIlIllIl[0]] = lllIlIllIl[17];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                int[] nArray23 = new int[lllIlIllIl[1]];
                                nArray23[G.lllIlIllIl[0]] = lllIlIllIl[17];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray23), lllIlIllIl[1])) {
                                    Bank.withdraw((int)lllIlIllIl[17], (int)lllIlIllIl[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[17];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if (2 != 2) {
                                                return false;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray24 = new int[lllIlIllIl[1]];
                            nArray24[G.lllIlIllIl[0]] = lllIlIllIl[10];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                int[] nArray25 = new int[lllIlIllIl[1]];
                                nArray25[G.lllIlIllIl[0]] = lllIlIllIl[10];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray25), lllIlIllIl[1])) {
                                    Bank.withdraw((int)lllIlIllIl[10], (int)lllIlIllIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[10];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if ((0xF9 ^ 0x96 ^ (8 ^ 0x63)) < 0) {
                                                return ((0xB6 ^ 0xC3 ^ (0x72 ^ 0x3D)) & (0x3A ^ 0x2A ^ (0x66 ^ 0x4C) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray26 = new int[lllIlIllIl[1]];
                            nArray26[G.lllIlIllIl[0]] = lllIlIllIl[15];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                int[] nArray27 = new int[lllIlIllIl[1]];
                                nArray27[G.lllIlIllIl[0]] = lllIlIllIl[15];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray27), lllIlIllIl[1])) {
                                    Bank.withdraw((int)lllIlIllIl[15], (int)lllIlIllIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[15];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if (2 != 2) {
                                                return false;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray28 = new int[lllIlIllIl[1]];
                            nArray28[G.lllIlIllIl[0]] = lllIlIllIl[13];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray28) ? 1 : 0)) {
                                int[] nArray29 = new int[lllIlIllIl[1]];
                                nArray29[G.lllIlIllIl[0]] = lllIlIllIl[13];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray29), lllIlIllIl[1])) {
                                    Bank.withdraw((int)lllIlIllIl[13], (int)lllIlIllIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[13];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if (((0x26 ^ 0xB ^ (0x9C ^ 0xBF)) & (0x7F ^ 0x72 ^ 3 ^ -1)) != 0) {
                                                return ((0xA6 ^ 0x83 ^ (0x6F ^ 0x57)) & (129 + 56 - 57 + 46 ^ 132 + 64 - 20 + 3 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray30 = new int[lllIlIllIl[1]];
                            nArray30[G.lllIlIllIl[0]] = lllIlIllIl[27];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray30) ? 1 : 0)) {
                                int[] nArray31 = new int[lllIlIllIl[1]];
                                nArray31[G.lllIlIllIl[0]] = lllIlIllIl[27];
                                if (G.llIIIlllIIIII(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                                    Bank.withdraw((int)lllIlIllIl[27], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[27];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray32 = new int[lllIlIllIl[1]];
                            nArray32[G.lllIlIllIl[0]] = lllIlIllIl[25];
                            if (G.llIIIllIllllI(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                int[] nArray33 = new int[lllIlIllIl[1]];
                                nArray33[G.lllIlIllIl[0]] = lllIlIllIl[25];
                                if (G.llIIIllIlllll(Inventory.getCount((int[])nArray33), lllIlIllIl[1])) {
                                    Bank.withdrawAll((int)lllIlIllIl[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIllIl[1]];
                                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[25];
                                        if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIllIl[1];
                                            0;
                                            if (2 < 1) {
                                                return ((0xC8 ^ 0xC7 ^ (0xB6 ^ 0x88)) & (0x3C ^ 0x36 ^ (0x99 ^ 0xA2) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIlIllIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIllIl[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (G.llIIIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(hd), lllIlIllIl[6]) && G.llIIIlllIIlII(Players.getLocal().getWorldLocation().getPlane(), lllIlIllIl[3]) && G.llIIIllIllllI(G.bz() ? 1 : 0)) {
                    if (G.llIIIllIllllI(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lllIlIllIl[6]);
                        0;
                    }
                    AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[19]];
                    if (G.llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (G.llIIIllIlllll(bS, lllIlIllIl[1])) {
                            e.v();
                            bS += lllIlIllIl[1];
                        }
                        if (G.llIIIllIllllI((var15 = new WorldArea(lllIlIllIl[28], lllIlIllIl[29], lllIlIllIl[30], lllIlIllIl[31], lllIlIllIl[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lllIlIllIl[1]];
                            stringArray[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[32]];
                            TileObjects.getNearest((String[])stringArray).interact(lllIlIllII[lllIlIllIl[33]]);
                            Time.sleepTicks((int)e.c(lllIlIllIl[12], lllIlIllIl[16]));
                            0;
                        }
                        Movement.walkTo((WorldPoint)hd);
                        0;
                        Time.sleepTicks((int)lllIlIllIl[3]);
                        0;
                    }
                }
                if (G.llIIIlllIIlIl(Players.getLocal().getWorldLocation().distanceTo(hd), lllIlIllIl[12])) {
                    AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[34]];
                    ck = lllIlIllIl[0];
                    g.a(gc, eR);
                    if (G.llIIIllIllllI(g.K() ? 1 : 0)) {
                        g.a(eR);
                    }
                }
            }
            if (G.llIIIlllIIIlI(e.j(lllIlIllIl[2])) && G.llIIIllIlllll(e.j(lllIlIllIl[2]), lllIlIllIl[3])) {
                if (G.llIIIlllIIIII(G.bz() ? 1 : 0)) {
                    G.cc();
                }
                if (G.llIIIllIllllI(G.bz() ? 1 : 0)) {
                    if (G.llIIIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(hd), lllIlIllIl[12])) {
                        AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[31]];
                        if (G.llIIIllIllllI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)hd);
                        0;
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                    }
                    if (G.llIIIlllIIlIl(Players.getLocal().getWorldLocation().distanceTo(hd), lllIlIllIl[12])) {
                        AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[35]];
                        if (G.llIIIllIlllll(ck, lllIlIllIl[1])) {
                            ac.mU += lllIlIllIl[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllIlIllIl[1];
                            ac.mU = lllIlIllIl[0];
                            cl = lllIlIllIl[0];
                        }
                        g.a(gc, eR);
                        if (G.llIIIllIllllI(g.K() ? 1 : 0)) {
                            g.a(eR);
                        }
                    }
                }
            }
            System.out.println("Setting: " + e.j(lllIlIllIl[2]));
            g.a(new String[lllIlIllIl[0]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cc() {
        void var9;
        BankLocation bankLocation = BankLocation.getNearest();
        if (G.llIIIlllIIIIl(bankLocation) && G.llIIIlllIIIII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[71]];
            a.a(bankLocation);
        }
        if (G.llIIIlllIIIIl(var9) && G.llIIIllIllllI(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (G.llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[72]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIllIl[5]);
                0;
            }
            if (G.llIIIllIllllI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[73]];
                if (G.llIIIlllIIIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIlIllIl[4]);
                    0;
                }
                if (G.llIIIlllIIIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lllIlIllIl[3]);
                    0;
                }
                String[] stringArray = new String[lllIlIllIl[1]];
                stringArray[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[74]];
                if (G.llIIIllIllllI(Bank.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIlIllIl[1]];
                    stringArray2[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[75]];
                    if (G.llIIIllIlllll(Bank.getFirst((String[])stringArray2).getQuantity(), lllIlIllIl[11])) {
                        G.ae();
                        System.out.println(lllIlIllII[lllIlIllIl[76]]);
                        bs = lllIlIllIl[1];
                        return;
                    }
                }
                String[] stringArray3 = new String[lllIlIllIl[1]];
                stringArray3[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[77]];
                if (G.llIIIllIllllI(Bank.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lllIlIllIl[1]];
                    stringArray4[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[78]];
                    if (G.llIIIllIlllll(Bank.getFirst((String[])stringArray4).getQuantity(), lllIlIllIl[11])) {
                        G.ae();
                        System.out.println(lllIlIllII[lllIlIllIl[79]]);
                        bs = lllIlIllIl[1];
                        return;
                    }
                }
                String[] stringArray5 = new String[lllIlIllIl[1]];
                stringArray5[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[80]];
                if (G.llIIIllIllllI(Bank.contains((String[])stringArray5) ? 1 : 0)) {
                    String[] stringArray6 = new String[lllIlIllIl[1]];
                    stringArray6[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[81]];
                    if (G.llIIIllIlllll(Bank.getFirst((String[])stringArray6).getQuantity(), lllIlIllIl[11])) {
                        G.ae();
                        System.out.println(lllIlIllII[lllIlIllIl[82]]);
                        bs = lllIlIllIl[1];
                        return;
                    }
                }
                int[] nArray = new int[lllIlIllIl[19]];
                nArray[G.lllIlIllIl[0]] = lllIlIllIl[20];
                nArray[G.lllIlIllIl[1]] = lllIlIllIl[21];
                nArray[G.lllIlIllIl[3]] = lllIlIllIl[22];
                nArray[G.lllIlIllIl[4]] = lllIlIllIl[23];
                nArray[G.lllIlIllIl[6]] = lllIlIllIl[24];
                nArray[G.lllIlIllIl[9]] = lllIlIllIl[7];
                nArray[G.lllIlIllIl[12]] = lllIlIllIl[17];
                nArray[G.lllIlIllIl[14]] = lllIlIllIl[25];
                nArray[G.lllIlIllIl[16]] = lllIlIllIl[10];
                nArray[G.lllIlIllIl[18]] = lllIlIllIl[15];
                nArray[G.lllIlIllIl[8]] = lllIlIllIl[13];
                if (G.llIIIlllIIIII(e.b(nArray) ? 1 : 0)) {
                    G.ae();
                    System.out.println(lllIlIllII[lllIlIllIl[83]]);
                    bs = lllIlIllIl[1];
                    return;
                }
                while (G.llIIIlllIIIII(t.bl() ? 1 : 0)) {
                    t.bj();
                    Time.sleepTicks((int)lllIlIllIl[1]);
                    0;
                    0;
                    if (-1 < ((5 ^ 9) & ~(0x50 ^ 0x5C))) continue;
                    return;
                }
                if (G.llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lllIlIllIl[6]);
                    0;
                }
                int[] nArray2 = new int[lllIlIllIl[1]];
                nArray2[G.lllIlIllIl[0]] = lllIlIllIl[22];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIlIllIl[1]];
                    nArray3[G.lllIlIllIl[0]] = lllIlIllIl[22];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray3), lllIlIllIl[1])) {
                        Bank.withdraw((int)lllIlIllIl[22], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[22];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if (((0x54 ^ 0x6B) & ~(0x77 ^ 0x48)) < 0) {
                                    return false;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray4 = new int[lllIlIllIl[1]];
                nArray4[G.lllIlIllIl[0]] = lllIlIllIl[23];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lllIlIllIl[1]];
                    nArray5[G.lllIlIllIl[0]] = lllIlIllIl[23];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray5), lllIlIllIl[1])) {
                        Bank.withdraw((int)lllIlIllIl[23], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[23];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if ((0xA8 ^ 0xAD) == 0) {
                                    return false;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray6 = new int[lllIlIllIl[1]];
                nArray6[G.lllIlIllIl[0]] = lllIlIllIl[21];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[lllIlIllIl[1]];
                    nArray7[G.lllIlIllIl[0]] = lllIlIllIl[21];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray7), lllIlIllIl[1])) {
                        Bank.withdraw((int)lllIlIllIl[21], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[21];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if (-1 > -1) {
                                    return false;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray8 = new int[lllIlIllIl[1]];
                nArray8[G.lllIlIllIl[0]] = lllIlIllIl[24];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    int[] nArray9 = new int[lllIlIllIl[1]];
                    nArray9[G.lllIlIllIl[0]] = lllIlIllIl[24];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray9), lllIlIllIl[1])) {
                        Bank.withdraw((int)lllIlIllIl[24], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[24];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if ((3 & ~3) == -1) {
                                    return false;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray10 = new int[lllIlIllIl[1]];
                nArray10[G.lllIlIllIl[0]] = lllIlIllIl[7];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    int[] nArray11 = new int[lllIlIllIl[1]];
                    nArray11[G.lllIlIllIl[0]] = lllIlIllIl[7];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray11), lllIlIllIl[1])) {
                        Bank.withdraw((int)lllIlIllIl[7], (int)lllIlIllIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[7];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if ((0x5B ^ 0x5F) == 1) {
                                    return false;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray12 = new int[lllIlIllIl[1]];
                nArray12[G.lllIlIllIl[0]] = lllIlIllIl[17];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    int[] nArray13 = new int[lllIlIllIl[1]];
                    nArray13[G.lllIlIllIl[0]] = lllIlIllIl[17];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray13), lllIlIllIl[1])) {
                        Bank.withdraw((int)lllIlIllIl[17], (int)lllIlIllIl[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[17];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if (2 == 0) {
                                    return false;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray14 = new int[lllIlIllIl[1]];
                nArray14[G.lllIlIllIl[0]] = lllIlIllIl[10];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    int[] nArray15 = new int[lllIlIllIl[1]];
                    nArray15[G.lllIlIllIl[0]] = lllIlIllIl[10];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray15), lllIlIllIl[1])) {
                        Bank.withdraw((int)lllIlIllIl[10], (int)lllIlIllIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[10];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if ((0x82 ^ 0x86) == 2) {
                                    return false;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray16 = new int[lllIlIllIl[1]];
                nArray16[G.lllIlIllIl[0]] = lllIlIllIl[15];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIlIllIl[1]];
                    nArray17[G.lllIlIllIl[0]] = lllIlIllIl[15];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray17), lllIlIllIl[1])) {
                        Bank.withdraw((int)lllIlIllIl[15], (int)lllIlIllIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[15];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if (((0x89 ^ 0xB1) & ~(0xFB ^ 0xC3)) > (0xBD ^ 0xB9)) {
                                    return false;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray18 = new int[lllIlIllIl[1]];
                nArray18[G.lllIlIllIl[0]] = lllIlIllIl[13];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                    int[] nArray19 = new int[lllIlIllIl[1]];
                    nArray19[G.lllIlIllIl[0]] = lllIlIllIl[13];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray19), lllIlIllIl[1])) {
                        Bank.withdraw((int)lllIlIllIl[13], (int)lllIlIllIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[13];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if (2 <= 1) {
                                    return ((155 + 153 - 224 + 170 ^ 107 + 66 - 64 + 79) & (0xD6 ^ 0xC4 ^ (0x78 ^ 0x28) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray20 = new int[lllIlIllIl[1]];
                nArray20[G.lllIlIllIl[0]] = lllIlIllIl[27];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lllIlIllIl[1]];
                    nArray21[G.lllIlIllIl[0]] = lllIlIllIl[27];
                    if (G.llIIIlllIIIII(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        Bank.withdraw((int)lllIlIllIl[27], (int)lllIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[27];
                            return Inventory.contains((int[])nArray);
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
                int[] nArray22 = new int[lllIlIllIl[1]];
                nArray22[G.lllIlIllIl[0]] = lllIlIllIl[25];
                if (G.llIIIllIllllI(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lllIlIllIl[1]];
                    nArray23[G.lllIlIllIl[0]] = lllIlIllIl[25];
                    if (G.llIIIllIlllll(Inventory.getCount((int[])nArray23), lllIlIllIl[1])) {
                        Bank.withdrawAll((int)lllIlIllIl[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIllIl[1]];
                            nArray[G.lllIlIllIl[0]] = lllIlIllIl[25];
                            if (G.llIIIlllIIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lllIlIllIl[1];
                                0;
                                if (-2 > 0) {
                                    return ((0xA1 ^ 0x89 ^ (0xFD ^ 0x9D)) & (2 ^ 0x71 ^ (0x46 ^ 0x7D) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIlIllIl[0];
                            }
                            return bl;
                        }, (int)lllIlIllIl[5]);
                        0;
                    }
                }
            }
        }
    }

    private static String llIIIllIllIll(String var7, String var10) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var23 = var10.toCharArray();
        int var19 = lllIlIllIl[0];
        char[] var8 = var7.toCharArray();
        int var24 = var8.length;
        int var21 = lllIlIllIl[0];
        while (G.llIIIllIlllll(var21, var24)) {
            char var16 = var8[var21];
            var14.append((char)(var16 ^ var23[var19 % var23.length]));
            0;
            ++var19;
            ++var21;
            0;
            if (((1 ^ (0x94 ^ 0x84)) & (0x58 ^ 0x62 ^ (0x97 ^ 0xBC) ^ -1)) == ((209 + 234 - 315 + 115 ^ 127 + 28 - 127 + 157) & (0xC1 ^ 0x8F ^ (0x37 ^ 0x33) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static String llIIIllIllIIl(String var11, String var6) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lllIlIllIl[16]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllIlIllIl[3], var5);
            return new String(var2.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlllIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bz() {
        int n2;
        String[] stringArray = new String[lllIlIllIl[1]];
        stringArray[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[67]];
        if (G.llIIIllIllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lllIlIllIl[1]];
            stringArray2[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[68]];
            if (G.llIIIllIllllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lllIlIllIl[1]];
                stringArray3[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[45]];
                if (G.llIIIllIllllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lllIlIllIl[1]];
                    stringArray4[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[69]];
                    if (G.llIIIllIllllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        int[] nArray = new int[lllIlIllIl[1]];
                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[10];
                        if (G.llIIIllIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lllIlIllIl[1]];
                            nArray2[G.lllIlIllIl[0]] = lllIlIllIl[15];
                            if (G.llIIIllIllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                int[] nArray3 = new int[lllIlIllIl[1]];
                                nArray3[G.lllIlIllIl[0]] = lllIlIllIl[13];
                                if (G.llIIIllIllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    int[] nArray4 = new int[lllIlIllIl[1]];
                                    nArray4[G.lllIlIllIl[0]] = lllIlIllIl[7];
                                    if (G.llIIIllIllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[lllIlIllIl[1]];
                                        nArray5[G.lllIlIllIl[0]] = lllIlIllIl[25];
                                        if (G.llIIIllIllllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            String[] stringArray5 = new String[lllIlIllIl[1]];
                                            stringArray5[G.lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[70]];
                                            if (G.llIIIllIllllI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                                n2 = lllIlIllIl[1];
                                                0;
                                                if ((0x25 ^ 0x21) > -1) return n2 != 0;
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIlIllIl[0];
        return n2 != 0;
    }

    private static void llIIIllIlllII() {
        lllIlIllII = new String[lllIlIllIl[96]];
        G.lllIlIllII[G.lllIlIllIl[0]] = G."Buying items";
        G.lllIlIllII[G.lllIlIllIl[1]] = G."Finished buying items, switching back to questing";
        G.lllIlIllII[G.lllIlIllIl[3]] = G."Navigating to bank";
        G.lllIlIllII[G.lllIlIllIl[4]] = G."Opening bank";
        G.lllIlIllII[G.lllIlIllIl[6]] = G."Handling banking";
        G.lllIlIllII[G.lllIlIllIl[9]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[12]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[14]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[16]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[18]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[8]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[19]] = G."Walking to imp start";
        G.lllIlIllII[G.lllIlIllIl[32]] = G."Magic Portal";
        G.lllIlIllII[G.lllIlIllIl[33]] = G."Enter";
        G.lllIlIllII[G.lllIlIllIl[34]] = G."Handling quest";
        G.lllIlIllII[G.lllIlIllIl[31]] = G."Nav to start";
        G.lllIlIllII[G.lllIlIllIl[35]] = G."Finishing quest";
        G.lllIlIllII[G.lllIlIllIl[36]] = G."Adding red bead to buy list";
        G.lllIlIllII[G.lllIlIllIl[38]] = G."Adding yellow bead to buy list";
        G.lllIlIllII[G.lllIlIllIl[40]] = G."Adding black bead to buy list";
        G.lllIlIllII[G.lllIlIllIl[30]] = G."Adding white bead to buy list";
        G.lllIlIllII[G.lllIlIllIl[41]] = G."Adding lobster to buy list";
        G.lllIlIllII[G.lllIlIllIl[44]] = G."Adding lobster to buy list";
        G.lllIlIllII[G.lllIlIllIl[46]] = G."Adding cheese to buy list";
        G.lllIlIllII[G.lllIlIllIl[48]] = G."Adding cheese to buy list";
        G.lllIlIllII[G.lllIlIllIl[49]] = G."Adding wealth to buy list";
        G.lllIlIllII[G.lllIlIllIl[52]] = G."Adding varrock tabs to buy list";
        G.lllIlIllII[G.lllIlIllIl[54]] = G."Adding fally tabs to buy list";
        G.lllIlIllII[G.lllIlIllIl[55]] = G."Adding fally tabs to buy list";
        G.lllIlIllII[G.lllIlIllIl[56]] = G."Adding staminas to buy list";
        G.lllIlIllII[G.lllIlIllIl[57]] = G."Adding mind runes to buy list";
        G.lllIlIllII[G.lllIlIllIl[60]] = G."Adding air runes to buy list";
        G.lllIlIllII[G.lllIlIllIl[61]] = G."Adding water runes to buy list";
        G.lllIlIllII[G.lllIlIllIl[62]] = G."Adding earth runes to buy list";
        G.lllIlIllII[G.lllIlIllIl[63]] = G."Adding air runes to buy list";
        G.lllIlIllII[G.lllIlIllIl[64]] = G."Adding water runes to buy list";
        G.lllIlIllII[G.lllIlIllIl[65]] = G."Adding earth runes to buy list";
        G.lllIlIllII[G.lllIlIllIl[66]] = G."Adding mind runes to buy list";
        G.lllIlIllII[G.lllIlIllIl[67]] = G."Red bead";
        G.lllIlIllII[G.lllIlIllIl[68]] = G."Yellow bead";
        G.lllIlIllII[G.lllIlIllIl[45]] = G."Black bead";
        G.lllIlIllII[G.lllIlIllIl[69]] = G."White bead";
        G.lllIlIllII[G.lllIlIllIl[70]] = G."Cheese";
        G.lllIlIllII[G.lllIlIllIl[71]] = G."Navigating to bank";
        G.lllIlIllII[G.lllIlIllIl[72]] = G."Opening bank";
        G.lllIlIllII[G.lllIlIllIl[73]] = G."Handling banking";
        G.lllIlIllII[G.lllIlIllIl[74]] = G."Mind rune";
        G.lllIlIllII[G.lllIlIllIl[75]] = G."Mind rune";
        G.lllIlIllII[G.lllIlIllIl[76]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[77]] = G."Earth rune";
        G.lllIlIllII[G.lllIlIllIl[78]] = G."Earth rune";
        G.lllIlIllII[G.lllIlIllIl[79]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[80]] = G."Water rune";
        G.lllIlIllII[G.lllIlIllIl[81]] = G."Water rune";
        G.lllIlIllII[G.lllIlIllIl[82]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[83]] = G."We are missing supplies, switching to BUYING";
        G.lllIlIllII[G.lllIlIllIl[84]] = G."Imp Catcher quest";
        G.lllIlIllII[G.lllIlIllIl[85]] = G."ring of wealth (";
        G.lllIlIllII[G.lllIlIllIl[89]] = G."Wizard Mizgog";
        G.lllIlIllII[G.lllIlIllIl[90]] = G."Give me a quest please.";
        G.lllIlIllII[G.lllIlIllIl[91]] = G."I'll try.";
        G.lllIlIllII[G.lllIlIllIl[92]] = G."Actually, I know where to find this stuff.";
        G.lllIlIllII[G.lllIlIllIl[93]] = G."Yes.";
        G.lllIlIllII[G.lllIlIllIl[94]] = G."What's the matter?";
        G.lllIlIllII[G.lllIlIllIl[95]] = G."Ok, I'll see what I can do.";
    }

    private static String llIIIllIllIlI(String var20, String var12) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lllIlIllIl[3], var4);
            return new String(var13.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void ae() {
        d var17;
        block37: {
            block36: {
                block35: {
                    block34: {
                        Object var3;
                        block33: {
                            block32: {
                                int[] nArray = new int[lllIlIllIl[1]];
                                nArray[G.lllIlIllIl[0]] = lllIlIllIl[21];
                                if (G.llIIIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    System.out.println(lllIlIllII[lllIlIllIl[36]]);
                                    d d2 = new d(lllIlIllIl[21], lllIlIllIl[1], lllIlIllIl[37]);
                                    bu.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[lllIlIllIl[1]];
                                nArray2[G.lllIlIllIl[0]] = lllIlIllIl[22];
                                if (G.llIIIlllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    System.out.println(lllIlIllII[lllIlIllIl[38]]);
                                    var3 = new d(lllIlIllIl[22], lllIlIllIl[1], lllIlIllIl[39]);
                                    bu.add((d)var3);
                                    0;
                                }
                                int[] nArray3 = new int[lllIlIllIl[1]];
                                nArray3[G.lllIlIllIl[0]] = lllIlIllIl[23];
                                if (G.llIIIlllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    System.out.println(lllIlIllII[lllIlIllIl[40]]);
                                    var3 = new d(lllIlIllIl[23], lllIlIllIl[1], lllIlIllIl[39]);
                                    bu.add((d)var3);
                                    0;
                                }
                                int[] nArray4 = new int[lllIlIllIl[1]];
                                nArray4[G.lllIlIllIl[0]] = lllIlIllIl[24];
                                if (G.llIIIlllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    System.out.println(lllIlIllII[lllIlIllIl[30]]);
                                    var3 = new d(lllIlIllIl[24], lllIlIllIl[1], lllIlIllIl[39]);
                                    bu.add((d)var3);
                                    0;
                                }
                                int[] nArray5 = new int[lllIlIllIl[1]];
                                nArray5[G.lllIlIllIl[0]] = lllIlIllIl[25];
                                if (G.llIIIlllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    System.out.println(lllIlIllII[lllIlIllIl[41]]);
                                    var3 = new d(lllIlIllIl[25], lllIlIllIl[42], lllIlIllIl[43]);
                                    bu.add((d)var3);
                                    0;
                                }
                                int[] nArray6 = new int[lllIlIllIl[1]];
                                nArray6[G.lllIlIllIl[0]] = lllIlIllIl[25];
                                if (G.llIIIllIllllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[lllIlIllIl[1]];
                                    nArray7[G.lllIlIllIl[0]] = lllIlIllIl[25];
                                    if (G.llIIIllIlllll(Bank.getFirst((int[])nArray7).getQuantity(), lllIlIllIl[30])) {
                                        System.out.println(lllIlIllII[lllIlIllIl[44]]);
                                        var3 = new d(lllIlIllIl[25], lllIlIllIl[45], lllIlIllIl[43]);
                                        bu.add((d)var3);
                                        0;
                                    }
                                }
                                int[] nArray8 = new int[lllIlIllIl[1]];
                                nArray8[G.lllIlIllIl[0]] = lllIlIllIl[17];
                                if (G.llIIIlllIIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                    System.out.println(lllIlIllII[lllIlIllIl[46]]);
                                    var3 = new d(lllIlIllIl[17], lllIlIllIl[9], lllIlIllIl[47]);
                                    bu.add((d)var3);
                                    0;
                                }
                                int[] nArray9 = new int[lllIlIllIl[1]];
                                nArray9[G.lllIlIllIl[0]] = lllIlIllIl[17];
                                if (!G.llIIIllIllllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block32;
                                int[] nArray10 = new int[lllIlIllIl[1]];
                                nArray10[G.lllIlIllIl[0]] = lllIlIllIl[17];
                                if (!G.llIIIllIllllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block33;
                                int[] nArray11 = new int[lllIlIllIl[1]];
                                nArray11[G.lllIlIllIl[0]] = lllIlIllIl[17];
                                if (!G.llIIIllIlllll(Bank.getFirst((int[])nArray11).getQuantity(), lllIlIllIl[9])) break block33;
                            }
                            System.out.println(lllIlIllII[lllIlIllIl[48]]);
                            var3 = new d(lllIlIllIl[17], lllIlIllIl[9], lllIlIllIl[47]);
                            bu.add((d)var3);
                            0;
                        }
                        if (G.llIIIlllIIIII(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lllIlIllII[lllIlIllIl[85]]))) ? 1 : 0)) {
                            System.out.println(lllIlIllII[lllIlIllIl[49]]);
                            var17 = new d(lllIlIllIl[50], lllIlIllIl[38], lllIlIllIl[51]);
                            bu.add(var17);
                            0;
                        }
                        int[] nArray = new int[lllIlIllIl[1]];
                        nArray[G.lllIlIllIl[0]] = lllIlIllIl[20];
                        if (!G.llIIIllIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray12 = new int[lllIlIllIl[1]];
                        nArray12[G.lllIlIllIl[0]] = lllIlIllIl[20];
                        if (!G.llIIIllIllllI(Bank.contains((int[])nArray12) ? 1 : 0)) break block35;
                        int[] nArray13 = new int[lllIlIllIl[1]];
                        nArray13[G.lllIlIllIl[0]] = lllIlIllIl[20];
                        if (!G.llIIIllIlllll(Bank.getFirst((int[])nArray13).getQuantity(), lllIlIllIl[30])) break block35;
                    }
                    System.out.println(lllIlIllII[lllIlIllIl[52]]);
                    var17 = new d(lllIlIllIl[20], lllIlIllIl[45], lllIlIllIl[53]);
                    bu.add(var17);
                    0;
                }
                int[] nArray = new int[lllIlIllIl[1]];
                nArray[G.lllIlIllIl[0]] = lllIlIllIl[7];
                if (G.llIIIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    System.out.println(lllIlIllII[lllIlIllIl[54]]);
                    var17 = new d(lllIlIllIl[7], lllIlIllIl[30], lllIlIllIl[53]);
                    bu.add(var17);
                    0;
                }
                int[] nArray14 = new int[lllIlIllIl[1]];
                nArray14[G.lllIlIllIl[0]] = lllIlIllIl[7];
                if (!G.llIIIllIllllI(Bank.contains((int[])nArray14) ? 1 : 0)) break block36;
                int[] nArray15 = new int[lllIlIllIl[1]];
                nArray15[G.lllIlIllIl[0]] = lllIlIllIl[7];
                if (!G.llIIIllIllllI(Bank.contains((int[])nArray15) ? 1 : 0)) break block37;
                int[] nArray16 = new int[lllIlIllIl[1]];
                nArray16[G.lllIlIllIl[0]] = lllIlIllIl[7];
                if (!G.llIIIllIlllll(Bank.getFirst((int[])nArray16).getQuantity(), lllIlIllIl[30])) break block37;
            }
            System.out.println(lllIlIllII[lllIlIllIl[55]]);
            var17 = new d(lllIlIllIl[7], lllIlIllIl[30], lllIlIllIl[53]);
            bu.add(var17);
            0;
        }
        int[] nArray = new int[lllIlIllIl[1]];
        nArray[G.lllIlIllIl[0]] = lllIlIllIl[27];
        if (G.llIIIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[56]]);
            var17 = new d(lllIlIllIl[27], lllIlIllIl[9], i.bp);
            bu.add(var17);
            0;
        }
        int[] nArray17 = new int[lllIlIllIl[1]];
        nArray17[G.lllIlIllIl[0]] = lllIlIllIl[10];
        if (G.llIIIllIllllI(Bank.contains((int[])nArray17) ? 1 : 0)) {
            int[] nArray18 = new int[lllIlIllIl[1]];
            nArray18[G.lllIlIllIl[0]] = lllIlIllIl[10];
            if (G.llIIIllIlllll(Bank.getFirst((int[])nArray18).getQuantity(), lllIlIllIl[11])) {
                System.out.println(lllIlIllII[lllIlIllIl[57]]);
                var17 = new d(lllIlIllIl[10], lllIlIllIl[58], lllIlIllIl[14]);
                bu.add(var17);
                0;
            }
        }
        int[] nArray19 = new int[lllIlIllIl[1]];
        nArray19[G.lllIlIllIl[0]] = lllIlIllIl[59];
        if (G.llIIIllIllllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lllIlIllIl[1]];
            nArray20[G.lllIlIllIl[0]] = lllIlIllIl[59];
            if (G.llIIIllIlllll(Bank.getFirst((int[])nArray20).getQuantity(), lllIlIllIl[11])) {
                System.out.println(lllIlIllII[lllIlIllIl[60]]);
                var17 = new d(lllIlIllIl[59], lllIlIllIl[58], lllIlIllIl[14]);
                bu.add(var17);
                0;
            }
        }
        int[] nArray21 = new int[lllIlIllIl[1]];
        nArray21[G.lllIlIllIl[0]] = lllIlIllIl[15];
        if (G.llIIIllIllllI(Bank.contains((int[])nArray21) ? 1 : 0)) {
            int[] nArray22 = new int[lllIlIllIl[1]];
            nArray22[G.lllIlIllIl[0]] = lllIlIllIl[15];
            if (G.llIIIllIlllll(Bank.getFirst((int[])nArray22).getQuantity(), lllIlIllIl[11])) {
                System.out.println(lllIlIllII[lllIlIllIl[61]]);
                var17 = new d(lllIlIllIl[15], lllIlIllIl[58], lllIlIllIl[14]);
                bu.add(var17);
                0;
            }
        }
        int[] nArray23 = new int[lllIlIllIl[1]];
        nArray23[G.lllIlIllIl[0]] = lllIlIllIl[13];
        if (G.llIIIllIllllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
            int[] nArray24 = new int[lllIlIllIl[1]];
            nArray24[G.lllIlIllIl[0]] = lllIlIllIl[13];
            if (G.llIIIllIlllll(Bank.getFirst((int[])nArray24).getQuantity(), lllIlIllIl[11])) {
                System.out.println(lllIlIllII[lllIlIllIl[62]]);
                var17 = new d(lllIlIllIl[13], lllIlIllIl[58], lllIlIllIl[14]);
                bu.add(var17);
                0;
            }
        }
        int[] nArray25 = new int[lllIlIllIl[1]];
        nArray25[G.lllIlIllIl[0]] = lllIlIllIl[59];
        if (G.llIIIlllIIIII(Bank.contains((int[])nArray25) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[63]]);
            var17 = new d(lllIlIllIl[59], lllIlIllIl[58], lllIlIllIl[14]);
            bu.add(var17);
            0;
        }
        int[] nArray26 = new int[lllIlIllIl[1]];
        nArray26[G.lllIlIllIl[0]] = lllIlIllIl[15];
        if (G.llIIIlllIIIII(Bank.contains((int[])nArray26) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[64]]);
            var17 = new d(lllIlIllIl[15], lllIlIllIl[58], lllIlIllIl[14]);
            bu.add(var17);
            0;
        }
        int[] nArray27 = new int[lllIlIllIl[1]];
        nArray27[G.lllIlIllIl[0]] = lllIlIllIl[13];
        if (G.llIIIlllIIIII(Bank.contains((int[])nArray27) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[65]]);
            var17 = new d(lllIlIllIl[13], lllIlIllIl[58], lllIlIllIl[14]);
            bu.add(var17);
            0;
        }
        int[] nArray28 = new int[lllIlIllIl[1]];
        nArray28[G.lllIlIllIl[0]] = lllIlIllIl[10];
        if (G.llIIIlllIIIII(Bank.contains((int[])nArray28) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[66]]);
            var17 = new d(lllIlIllIl[10], lllIlIllIl[58], lllIlIllIl[14]);
            bu.add(var17);
            0;
        }
    }

    private static void llIIIllIlllIl() {
        lllIlIllIl = new int[97];
        G.lllIlIllIl[0] = (0x58 ^ 0x52) & ~(0x33 ^ 0x39);
        G.lllIlIllIl[1] = 1;
        G.lllIlIllIl[2] = 70 + 159 - 172 + 103;
        G.lllIlIllIl[3] = 2;
        G.lllIlIllIl[4] = 3;
        G.lllIlIllIl[5] = -(0xFFFFA865 & 0x7FFE) & (0xFFFFFBEF & 0x3FFB);
        G.lllIlIllIl[6] = 84 + 122 - 117 + 75 ^ 90 + 159 - 179 + 90;
        G.lllIlIllIl[7] = -(0xFFFFC79F & 0x78F3) & (0xFFFFDFDF & 0x7FFB);
        G.lllIlIllIl[8] = 0x77 ^ 0x54 ^ (0x24 ^ 0xD);
        G.lllIlIllIl[9] = 0x66 ^ 0x63;
        G.lllIlIllIl[10] = 0xFFFFF3AF & 0xE7E;
        G.lllIlIllIl[11] = -(0xFFFFFF97 & 0x86F) & (0xFFFF8FFE & 0x7BEF);
        G.lllIlIllIl[12] = 0xBD ^ 0xBB;
        G.lllIlIllIl[13] = 0xFFFFD33F & 0x2EED;
        G.lllIlIllIl[14] = 0xA3 ^ 0x8C ^ (0x4C ^ 0x64);
        G.lllIlIllIl[15] = -(0xFFFFF5ED & 0x7ED7) & (0xFFFFFFEF & 0x76FF);
        G.lllIlIllIl[16] = 0x50 ^ 0x35 ^ (0x16 ^ 0x7B);
        G.lllIlIllIl[17] = 0xFFFF97ED & 0x6FD3;
        G.lllIlIllIl[18] = 0x2E ^ 0x27;
        G.lllIlIllIl[19] = 56 + 112 - 150 + 149 ^ 164 + 104 - 267 + 171;
        G.lllIlIllIl[20] = -(0xFFFFAF7F & 0x70B9) & (0xFFFFBFFF & 0x7F7F);
        G.lllIlIllIl[21] = 0xFFFFA7FF & 0x5DBE;
        G.lllIlIllIl[22] = 0xFFFFADC0 & 0x57FF;
        G.lllIlIllIl[23] = -(0xFFFFEF0A & 0x78FF) & (0xFFFFFDDF & 0x6FEB);
        G.lllIlIllIl[24] = -(0xFFFFF6D6 & 0x1B2D) & (0xFFFFDFF7 & 0x37CF);
        G.lllIlIllIl[25] = 0xFFFFAB7F & 0x55FB;
        G.lllIlIllIl[26] = 0xFFFFB5FF & 0x4BF4;
        G.lllIlIllIl[27] = -(0xFFFFEAEF & 0x5FBF) & (0xFFFFFFFF & 0x7BFF);
        G.lllIlIllIl[28] = -(0xFFFFB1CF & 0x7F72) & (0xFFFFBFF7 & 0x7B5D);
        G.lllIlIllIl[29] = 0xFFFFCE7B & 0x3D8C;
        G.lllIlIllIl[30] = 0x20 ^ 0x24 ^ (0x68 ^ 0x78);
        G.lllIlIllIl[31] = 0x6A ^ 0x3B ^ (0x6A ^ 0x34);
        G.lllIlIllIl[32] = 85 + 100 - 162 + 107 ^ 18 + 98 - -20 + 6;
        G.lllIlIllIl[33] = 0x24 ^ 0x29;
        G.lllIlIllIl[34] = 0x6E ^ 0x4A ^ (0x47 ^ 0x6D);
        G.lllIlIllIl[35] = 0x25 ^ 0x35;
        G.lllIlIllIl[36] = 10 + 97 - 8 + 88 ^ 56 + 33 - 56 + 137;
        G.lllIlIllIl[37] = 0xFFFFBDEE & 0x6737;
        G.lllIlIllIl[38] = 61 + 106 - 148 + 125 ^ 48 + 88 - 53 + 47;
        G.lllIlIllIl[39] = -(0xFFFFDF59 & 0x70EF) & (0xFFFFF3DF & 0x7FFE);
        G.lllIlIllIl[40] = 0xB7 ^ 0xA4 ^ (0x9A ^ 0x85) & ~(0x7C ^ 0x63);
        G.lllIlIllIl[41] = 0x60 ^ 0x75;
        G.lllIlIllIl[42] = 0x4A ^ 0x2E;
        G.lllIlIllIl[43] = 0xFFFF87D0 & 0x79BF;
        G.lllIlIllIl[44] = 0xF2 ^ 0xA5 ^ (0xD7 ^ 0x96);
        G.lllIlIllIl[45] = 0x2F ^ 7;
        G.lllIlIllIl[46] = 0x49 ^ 0x5E;
        G.lllIlIllIl[47] = 0xFFFFB7F7 & 0x5BFE;
        G.lllIlIllIl[48] = 0x45 ^ 0x55 ^ (0xA0 ^ 0xA8);
        G.lllIlIllIl[49] = 0x41 ^ 0x58;
        G.lllIlIllIl[50] = 0xFFFFBFCF & 0x6EFC;
        G.lllIlIllIl[51] = -(0xFFFFBD97 & 0x7EFC) & (0xFFFFFFFB & 0x7EFF);
        G.lllIlIllIl[52] = 30 + 16 - 19 + 154 ^ 80 + 36 - 18 + 77;
        G.lllIlIllIl[53] = 0xFFFFE7FC & 0x1F6F;
        G.lllIlIllIl[54] = 2 ^ (0xA6 ^ 0xBF);
        G.lllIlIllIl[55] = 0xB1 ^ 0xAD;
        G.lllIlIllIl[56] = 0x29 ^ 0x7F ^ (0xCC ^ 0x87);
        G.lllIlIllIl[57] = 127 + 42 - 59 + 110 ^ 155 + 154 - 294 + 179;
        G.lllIlIllIl[58] = 0xFFFF97D8 & 0x6FF7;
        G.lllIlIllIl[59] = -(0xFFFFFD97 & 0x7AEA) & (0xFFFFFBAF & 0x7EFD);
        G.lllIlIllIl[60] = 0x45 ^ 0x5A;
        G.lllIlIllIl[61] = 0x69 ^ 0x49;
        G.lllIlIllIl[62] = 0xBA ^ 0x9B;
        G.lllIlIllIl[63] = 0x6A ^ 0x18 ^ (0x40 ^ 0x10);
        G.lllIlIllIl[64] = 103 + 147 - 183 + 112 ^ 84 + 39 - 2 + 23;
        G.lllIlIllIl[65] = 0x28 ^ 0xC;
        G.lllIlIllIl[66] = 0xFD ^ 0x9D ^ (0x6F ^ 0x2A);
        G.lllIlIllIl[67] = 86 + 71 - 99 + 93 ^ 135 + 89 - 202 + 155;
        G.lllIlIllIl[68] = 0xAC ^ 0x8B;
        G.lllIlIllIl[69] = 0xC5 ^ 0xC0 ^ (0x8D ^ 0xA1);
        G.lllIlIllIl[70] = 0x7F ^ 0x55;
        G.lllIlIllIl[71] = 0x70 ^ 0x51 ^ (1 ^ 0xB);
        G.lllIlIllIl[72] = 0x8B ^ 0xA7;
        G.lllIlIllIl[73] = 0x63 ^ 0x41 ^ (0x32 ^ 0x3D);
        G.lllIlIllIl[74] = 0xAA ^ 0x84;
        G.lllIlIllIl[75] = 0x81 ^ 0xAE;
        G.lllIlIllIl[76] = 0xBC ^ 0x8C;
        G.lllIlIllIl[77] = 0xA9 ^ 0x98;
        G.lllIlIllIl[78] = 0xBC ^ 0x8E;
        G.lllIlIllIl[79] = 0x4F ^ 0x7C;
        G.lllIlIllIl[80] = 0xBC ^ 0xC5 ^ (0x88 ^ 0xC5);
        G.lllIlIllIl[81] = 0x6D ^ 0x58;
        G.lllIlIllIl[82] = 41 + 85 - 3 + 9 ^ 44 + 98 - 25 + 61;
        G.lllIlIllIl[83] = 0x64 ^ 0x53;
        G.lllIlIllIl[84] = 0xBC ^ 0x83 ^ (0 ^ 7);
        G.lllIlIllIl[85] = 0x38 ^ 1;
        G.lllIlIllIl[86] = 0xFFFFF62B & 0xBFE;
        G.lllIlIllIl[87] = 0xFFFFEC3D & 0x1FE2;
        G.lllIlIllIl[88] = -(0xFFFFFAB5 & 0x77EB) & (0xFFFFFFFB & 0x7EFF);
        G.lllIlIllIl[89] = 120 + 52 - 79 + 36 ^ 79 + 0 - 47 + 155;
        G.lllIlIllIl[90] = 0x19 ^ 0x22;
        G.lllIlIllIl[91] = 0x31 ^ 0x67 ^ (0x3E ^ 0x54);
        G.lllIlIllIl[92] = 0xAC ^ 0x91;
        G.lllIlIllIl[93] = 0xBA ^ 0x84;
        G.lllIlIllIl[94] = 0x97 ^ 0xA8;
        G.lllIlIllIl[95] = 0x30 ^ 0x70;
        G.lllIlIllIl[96] = 0xE5 ^ 0xA4;
    }

    @Override
    public String U() {
        return lllIlIllII[lllIlIllIl[84]];
    }

    private static boolean llIIIlllIIlII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean S() {
        return lllIlIllIl[0];
    }

    @Override
    public int T() {
        try {
            G.ct();
            0;
        }
        catch (Exception var1) {
            var1.printStackTrace();
        }
        
        }
        return lllIlIllIl[42];
    }

    private static boolean llIIIllIlllll(int n2, int n3) {
        return n2 < n3;
    }
}

