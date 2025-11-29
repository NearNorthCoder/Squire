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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.z;
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

public class P
implements W {
    private static /* synthetic */ int[] llIIIIllI;
    private static /* synthetic */ String[] llIIIIlII;
    private static final /* synthetic */ int jz;
    static /* synthetic */ String iw;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int jy;
    private static final /* synthetic */ int jp;
    private static final /* synthetic */ int jw;
    static /* synthetic */ int cl;
    private static final /* synthetic */ int js;
    static /* synthetic */ String[] hl;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ int jq;
    private static final /* synthetic */ WorldPoint jo;
    private static final /* synthetic */ int ju;
    static /* synthetic */ boolean cm;
    private static final /* synthetic */ int jt;
    private static final /* synthetic */ int jv;
    private static final /* synthetic */ int jr;
    private static final /* synthetic */ int jx;
    static /* synthetic */ int bT;

    private static boolean lIlIIIllllll(int n2) {
        return n2 == 0;
    }

    public static void ct() {
        if (P.lIlIIIllllIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[0]];
            b.a(bv);
            if (P.lIlIIIlllllI(bv.size(), llIIIIllI[1])) {
                System.out.println(llIIIIlII[llIIIIllI[1]]);
                bt = llIIIIllI[0];
            }
        }
        if (P.lIlIIIllllll(bt ? 1 : 0)) {
            if (P.lIlIIIllllll(e.j(llIIIIllI[2]))) {
                BankLocation lIlllIlllIlIlI;
                if (P.lIlIIIllllll(P.bH() ? 1 : 0)) {
                    lIlllIlllIlIlI = BankLocation.getNearest();
                    if (P.lIlIIlIIIIII(lIlllIlllIlIlI) && P.lIlIIIllllll(lIlllIlllIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[3]];
                        a.a(lIlllIlllIlIlI);
                    }
                    if (P.lIlIIlIIIIII(lIlllIlllIlIlI) && P.lIlIIIllllIl(lIlllIlllIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (P.lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[4]];
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIllI[5]);
                            0;
                        }
                        if (P.lIlIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[6]];
                            if (P.lIlIIlIIIIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIllI[4]);
                                0;
                            }
                            if (P.lIlIIlIIIIIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIIIllI[3]);
                                0;
                            }
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[7];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llIIIIllI[1]];
                                nArray2[P.llIIIIllI[0]] = llIIIIllI[7];
                                if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray2).getQuantity(), llIIIIllI[8])) {
                                    P.af();
                                    System.out.println(llIIIIlII[llIIIIllI[9]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[llIIIIllI[1]];
                            nArray3[P.llIIIIllI[0]] = llIIIIllI[10];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIIIIllI[1]];
                                nArray4[P.llIIIIllI[0]] = llIIIIllI[10];
                                if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray4).getQuantity(), llIIIIllI[11])) {
                                    P.af();
                                    System.out.println(llIIIIlII[llIIIIllI[12]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[llIIIIllI[1]];
                            nArray5[P.llIIIIllI[0]] = llIIIIllI[13];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llIIIIllI[1]];
                                nArray6[P.llIIIIllI[0]] = llIIIIllI[13];
                                if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray6).getQuantity(), llIIIIllI[11])) {
                                    P.af();
                                    System.out.println(llIIIIlII[llIIIIllI[14]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[llIIIIllI[1]];
                            nArray7[P.llIIIIllI[0]] = llIIIIllI[15];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llIIIIllI[1]];
                                nArray8[P.llIIIIllI[0]] = llIIIIllI[15];
                                if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray8).getQuantity(), llIIIIllI[11])) {
                                    P.af();
                                    System.out.println(llIIIIlII[llIIIIllI[16]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] nArray9 = new int[llIIIIllI[1]];
                            nArray9[P.llIIIIllI[0]] = llIIIIllI[17];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIIIIllI[1]];
                                nArray10[P.llIIIIllI[0]] = llIIIIllI[17];
                                if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray10).getQuantity(), llIIIIllI[9])) {
                                    P.af();
                                    System.out.println(llIIIIlII[llIIIIllI[18]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] nArray11 = new int[llIIIIllI[19]];
                            nArray11[P.llIIIIllI[0]] = llIIIIllI[20];
                            nArray11[P.llIIIIllI[1]] = llIIIIllI[21];
                            nArray11[P.llIIIIllI[3]] = llIIIIllI[22];
                            nArray11[P.llIIIIllI[4]] = llIIIIllI[23];
                            nArray11[P.llIIIIllI[6]] = llIIIIllI[24];
                            nArray11[P.llIIIIllI[9]] = llIIIIllI[7];
                            nArray11[P.llIIIIllI[12]] = llIIIIllI[17];
                            nArray11[P.llIIIIllI[14]] = llIIIIllI[25];
                            nArray11[P.llIIIIllI[16]] = llIIIIllI[10];
                            nArray11[P.llIIIIllI[18]] = llIIIIllI[15];
                            nArray11[P.llIIIIllI[8]] = llIIIIllI[13];
                            if (P.lIlIIIllllll(e.b(nArray11) ? 1 : 0)) {
                                P.af();
                                System.out.println(llIIIIlII[llIIIIllI[8]]);
                                bt = llIIIIllI[1];
                                return;
                            }
                            while (P.lIlIIIllllll(z.bi() ? 1 : 0)) {
                                z.bg();
                                Time.sleepTicks((int)llIIIIllI[1]);
                                0;
                                0;
                                if (-3 < 0) continue;
                                return;
                            }
                            if (P.lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)llIIIIllI[6]);
                                0;
                            }
                            int[] nArray12 = new int[llIIIIllI[1]];
                            nArray12[P.llIIIIllI[0]] = llIIIIllI[22];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                int[] nArray13 = new int[llIIIIllI[1]];
                                nArray13[P.llIIIIllI[0]] = llIIIIllI[22];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray13), llIIIIllI[1])) {
                                    Bank.withdraw((int)llIIIIllI[22], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[22];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if (((0xC9 ^ 0x86 ^ 3) & (0xA6 ^ 0x97 ^ (0xCA ^ 0xB7) ^ -1)) != 0) {
                                                return ((0xE2 ^ 0x9A ^ (0x15 ^ 0x33)) & (55 + 122 - 20 + 66 ^ 90 + 98 - 104 + 45 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray14 = new int[llIIIIllI[1]];
                            nArray14[P.llIIIIllI[0]] = llIIIIllI[23];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[llIIIIllI[1]];
                                nArray15[P.llIIIIllI[0]] = llIIIIllI[23];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray15), llIIIIllI[1])) {
                                    Bank.withdraw((int)llIIIIllI[23], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[23];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if ((0x64 ^ 0x41 ^ (0x67 ^ 0x46)) == 0) {
                                                return ((0x40 ^ 5 ^ (0x27 ^ 0x41)) & (0xC7 ^ 0x9F ^ (0x25 ^ 0x5E) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray16 = new int[llIIIIllI[1]];
                            nArray16[P.llIIIIllI[0]] = llIIIIllI[21];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                int[] nArray17 = new int[llIIIIllI[1]];
                                nArray17[P.llIIIIllI[0]] = llIIIIllI[21];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray17), llIIIIllI[1])) {
                                    Bank.withdraw((int)llIIIIllI[21], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[21];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if (1 < 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray18 = new int[llIIIIllI[1]];
                            nArray18[P.llIIIIllI[0]] = llIIIIllI[24];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                int[] nArray19 = new int[llIIIIllI[1]];
                                nArray19[P.llIIIIllI[0]] = llIIIIllI[24];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray19), llIIIIllI[1])) {
                                    Bank.withdraw((int)llIIIIllI[24], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[24];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if (1 == -1) {
                                                return ((16 + 81 - -43 + 20 ^ 8 + 7 - -91 + 37) & (0x74 ^ 0x71 ^ (0x83 ^ 0xA9) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray20 = new int[llIIIIllI[1]];
                            nArray20[P.llIIIIllI[0]] = llIIIIllI[7];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                int[] nArray21 = new int[llIIIIllI[1]];
                                nArray21[P.llIIIIllI[0]] = llIIIIllI[7];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray21), llIIIIllI[1])) {
                                    Bank.withdraw((int)llIIIIllI[7], (int)llIIIIllI[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[7];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if ((0x63 ^ 0x67) <= ((0x53 ^ 0x1F) & ~(4 ^ 0x48))) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray22 = new int[llIIIIllI[1]];
                            nArray22[P.llIIIIllI[0]] = llIIIIllI[17];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                int[] nArray23 = new int[llIIIIllI[1]];
                                nArray23[P.llIIIIllI[0]] = llIIIIllI[17];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray23), llIIIIllI[1])) {
                                    Bank.withdraw((int)llIIIIllI[17], (int)llIIIIllI[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[17];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if (((0x32 ^ 0x20) & ~(0xD7 ^ 0xC5)) >= 3) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray24 = new int[llIIIIllI[1]];
                            nArray24[P.llIIIIllI[0]] = llIIIIllI[10];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                int[] nArray25 = new int[llIIIIllI[1]];
                                nArray25[P.llIIIIllI[0]] = llIIIIllI[10];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray25), llIIIIllI[1])) {
                                    Bank.withdraw((int)llIIIIllI[10], (int)llIIIIllI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[10];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if (((0x72 ^ 0x6E) & ~(0xBD ^ 0xA1)) >= 2) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray26 = new int[llIIIIllI[1]];
                            nArray26[P.llIIIIllI[0]] = llIIIIllI[15];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                int[] nArray27 = new int[llIIIIllI[1]];
                                nArray27[P.llIIIIllI[0]] = llIIIIllI[15];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray27), llIIIIllI[1])) {
                                    Bank.withdraw((int)llIIIIllI[15], (int)llIIIIllI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[15];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if (((22 + 115 - 67 + 163 ^ 49 + 97 - 69 + 90) & (0xA1 ^ 0x8F ^ (0xF5 ^ 0x95) ^ -1)) > 3) {
                                                return ((152 + 19 - 9 + 0 ^ 102 + 168 - 194 + 108) & (0xEA ^ 0xB4 ^ (0xFF ^ 0xBB) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray28 = new int[llIIIIllI[1]];
                            nArray28[P.llIIIIllI[0]] = llIIIIllI[13];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray28) ? 1 : 0)) {
                                int[] nArray29 = new int[llIIIIllI[1]];
                                nArray29[P.llIIIIllI[0]] = llIIIIllI[13];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray29), llIIIIllI[1])) {
                                    Bank.withdraw((int)llIIIIllI[13], (int)llIIIIllI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[13];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if (-(0xE ^ 0xA) >= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray30 = new int[llIIIIllI[1]];
                            nArray30[P.llIIIIllI[0]] = llIIIIllI[27];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray30) ? 1 : 0)) {
                                int[] nArray31 = new int[llIIIIllI[1]];
                                nArray31[P.llIIIIllI[0]] = llIIIIllI[27];
                                if (P.lIlIIIllllll(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                                    Bank.withdraw((int)llIIIIllI[27], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[27];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray32 = new int[llIIIIllI[1]];
                            nArray32[P.llIIIIllI[0]] = llIIIIllI[25];
                            if (P.lIlIIIllllIl(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                int[] nArray33 = new int[llIIIIllI[1]];
                                nArray33[P.llIIIIllI[0]] = llIIIIllI[25];
                                if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray33), llIIIIllI[1])) {
                                    Bank.withdrawAll((int)llIIIIllI[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIIllI[1]];
                                        nArray[P.llIIIIllI[0]] = llIIIIllI[25];
                                        if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIIllI[1];
                                            0;
                                            if (2 <= ((0x2C ^ 7 ^ (0xB2 ^ 0xC6)) & (106 + 71 - 99 + 74 ^ 137 + 130 - 127 + 59 ^ -1))) {
                                                return ((0xA ^ 0x1B ^ (0x1E ^ 0x20)) & (0xE0 ^ 0xA8 ^ (0xEE ^ 0x89) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIIIIllI[0];
                                        }
                                        return bl;
                                    }, (int)llIIIIllI[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (P.lIlIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(jo), llIIIIllI[6]) && P.lIlIIlIIIIll(Players.getLocal().getWorldLocation().getPlane(), llIIIIllI[3]) && P.lIlIIIllllIl(P.bH() ? 1 : 0)) {
                    if (P.lIlIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)llIIIIllI[6]);
                        0;
                    }
                    AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[19]];
                    if (P.lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                        if (P.lIlIIIlllllI(bT, llIIIIllI[1])) {
                            e.v();
                            bT += llIIIIllI[1];
                        }
                        if (P.lIlIIIllllIl((lIlllIlllIlIlI = new WorldArea(llIIIIllI[28], llIIIIllI[29], llIIIIllI[30], llIIIIllI[31], llIIIIllI[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[llIIIIllI[1]];
                            stringArray[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[32]];
                            TileObjects.getNearest((String[])stringArray).interact(llIIIIlII[llIIIIllI[33]]);
                            Time.sleepTicks((int)e.c(llIIIIllI[12], llIIIIllI[16]));
                            0;
                        }
                        Movement.walkTo((WorldPoint)jo);
                        0;
                        Time.sleepTicks((int)llIIIIllI[3]);
                        0;
                    }
                }
                if (P.lIlIIlIIIlII(Players.getLocal().getWorldLocation().distanceTo(jo), llIIIIllI[12])) {
                    AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[34]];
                    cl = llIIIIllI[0];
                    g.a(iw, hl);
                    if (P.lIlIIIllllIl(g.K() ? 1 : 0)) {
                        g.a(hl);
                    }
                }
            }
            if (P.lIlIIlIIIIIl(e.j(llIIIIllI[2])) && P.lIlIIIlllllI(e.j(llIIIIllI[2]), llIIIIllI[3])) {
                if (P.lIlIIIllllll(P.bH() ? 1 : 0)) {
                    P.ck();
                }
                if (P.lIlIIIllllIl(P.bH() ? 1 : 0)) {
                    if (P.lIlIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(jo), llIIIIllI[12])) {
                        AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[31]];
                        if (P.lIlIIIllllIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)jo);
                        0;
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                    }
                    if (P.lIlIIlIIIlII(Players.getLocal().getWorldLocation().distanceTo(jo), llIIIIllI[12])) {
                        AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[35]];
                        if (P.lIlIIIlllllI(cl, llIIIIllI[1])) {
                            an.pK += llIIIIllI[1];
                            an.o(AccBuilderEasyClues.m);
                            cl += llIIIIllI[1];
                            an.pK = llIIIIllI[0];
                            cm = llIIIIllI[0];
                        }
                        g.a(iw, hl);
                        if (P.lIlIIIllllIl(g.K() ? 1 : 0)) {
                            g.a(hl);
                        }
                    }
                }
            }
            System.out.println("Setting: " + e.j(llIIIIllI[2]));
            g.a(new String[llIIIIllI[0]]);
        }
    }

    private static String lIlIIIllIllI(String lIlllIlIllllIl, String lIlllIlIllllII) {
        lIlllIlIllllIl = new String(Base64.getDecoder().decode(lIlllIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIlIlllIll = new StringBuilder();
        char[] lIlllIlIlllIlI = lIlllIlIllllII.toCharArray();
        int lIlllIlIlllIIl = llIIIIllI[0];
        char[] lIlllIlIllIIll = lIlllIlIllllIl.toCharArray();
        int lIlllIlIllIIlI = lIlllIlIllIIll.length;
        int lIlllIlIllIIIl = llIIIIllI[0];
        while (P.lIlIIIlllllI(lIlllIlIllIIIl, lIlllIlIllIIlI)) {
            char lIlllIlIlllllI = lIlllIlIllIIll[lIlllIlIllIIIl];
            lIlllIlIlllIll.append((char)(lIlllIlIlllllI ^ lIlllIlIlllIlI[lIlllIlIlllIIl % lIlllIlIlllIlI.length]));
            0;
            ++lIlllIlIlllIIl;
            ++lIlllIlIllIIIl;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(lIlllIlIlllIll);
    }

    @Override
    public int T() {
        try {
            P.ct();
            0;
        }
        catch (Exception lIlllIlllIIIlI) {
            lIlllIlllIIIlI.printStackTrace();
        }
        if (-(0xCA ^ 0x9A ^ (0x56 ^ 3)) >= 0) {
            return 2 & (2 ^ -1);
        }
        return llIIIIllI[42];
    }

    private static boolean lIlIIIllllIl(int n2) {
        return n2 != 0;
    }

    private static void af() {
        d lIlllIlllIIllI;
        block37: {
            block36: {
                block35: {
                    block34: {
                        Object lIlllIlllIIlll;
                        block33: {
                            block32: {
                                int[] nArray = new int[llIIIIllI[1]];
                                nArray[P.llIIIIllI[0]] = llIIIIllI[21];
                                if (P.lIlIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    System.out.println(llIIIIlII[llIIIIllI[36]]);
                                    d d2 = new d(llIIIIllI[21], llIIIIllI[1], llIIIIllI[37]);
                                    bv.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[llIIIIllI[1]];
                                nArray2[P.llIIIIllI[0]] = llIIIIllI[22];
                                if (P.lIlIIIllllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    System.out.println(llIIIIlII[llIIIIllI[38]]);
                                    lIlllIlllIIlll = new d(llIIIIllI[22], llIIIIllI[1], llIIIIllI[39]);
                                    bv.add((d)lIlllIlllIIlll);
                                    0;
                                }
                                int[] nArray3 = new int[llIIIIllI[1]];
                                nArray3[P.llIIIIllI[0]] = llIIIIllI[23];
                                if (P.lIlIIIllllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    System.out.println(llIIIIlII[llIIIIllI[40]]);
                                    lIlllIlllIIlll = new d(llIIIIllI[23], llIIIIllI[1], llIIIIllI[39]);
                                    bv.add((d)lIlllIlllIIlll);
                                    0;
                                }
                                int[] nArray4 = new int[llIIIIllI[1]];
                                nArray4[P.llIIIIllI[0]] = llIIIIllI[24];
                                if (P.lIlIIIllllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    System.out.println(llIIIIlII[llIIIIllI[30]]);
                                    lIlllIlllIIlll = new d(llIIIIllI[24], llIIIIllI[1], llIIIIllI[39]);
                                    bv.add((d)lIlllIlllIIlll);
                                    0;
                                }
                                int[] nArray5 = new int[llIIIIllI[1]];
                                nArray5[P.llIIIIllI[0]] = llIIIIllI[25];
                                if (P.lIlIIIllllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    System.out.println(llIIIIlII[llIIIIllI[41]]);
                                    lIlllIlllIIlll = new d(llIIIIllI[25], llIIIIllI[42], llIIIIllI[43]);
                                    bv.add((d)lIlllIlllIIlll);
                                    0;
                                }
                                int[] nArray6 = new int[llIIIIllI[1]];
                                nArray6[P.llIIIIllI[0]] = llIIIIllI[25];
                                if (P.lIlIIIllllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[llIIIIllI[1]];
                                    nArray7[P.llIIIIllI[0]] = llIIIIllI[25];
                                    if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray7).getQuantity(), llIIIIllI[30])) {
                                        System.out.println(llIIIIlII[llIIIIllI[44]]);
                                        lIlllIlllIIlll = new d(llIIIIllI[25], llIIIIllI[45], llIIIIllI[43]);
                                        bv.add((d)lIlllIlllIIlll);
                                        0;
                                    }
                                }
                                int[] nArray8 = new int[llIIIIllI[1]];
                                nArray8[P.llIIIIllI[0]] = llIIIIllI[17];
                                if (P.lIlIIIllllll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                    System.out.println(llIIIIlII[llIIIIllI[46]]);
                                    lIlllIlllIIlll = new d(llIIIIllI[17], llIIIIllI[9], llIIIIllI[47]);
                                    bv.add((d)lIlllIlllIIlll);
                                    0;
                                }
                                int[] nArray9 = new int[llIIIIllI[1]];
                                nArray9[P.llIIIIllI[0]] = llIIIIllI[17];
                                if (!P.lIlIIIllllIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block32;
                                int[] nArray10 = new int[llIIIIllI[1]];
                                nArray10[P.llIIIIllI[0]] = llIIIIllI[17];
                                if (!P.lIlIIIllllIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block33;
                                int[] nArray11 = new int[llIIIIllI[1]];
                                nArray11[P.llIIIIllI[0]] = llIIIIllI[17];
                                if (!P.lIlIIIlllllI(Bank.getFirst((int[])nArray11).getQuantity(), llIIIIllI[9])) break block33;
                            }
                            System.out.println(llIIIIlII[llIIIIllI[48]]);
                            lIlllIlllIIlll = new d(llIIIIllI[17], llIIIIllI[9], llIIIIllI[47]);
                            bv.add((d)lIlllIlllIIlll);
                            0;
                        }
                        if (P.lIlIIIllllll(Bank.contains((Predicate)(lIlllIlllIIlll = item -> item.getName().toLowerCase().contains(llIIIIlII[llIIIIllI[85]]))) ? 1 : 0)) {
                            System.out.println(llIIIIlII[llIIIIllI[49]]);
                            lIlllIlllIIllI = new d(llIIIIllI[50], llIIIIllI[38], llIIIIllI[51]);
                            bv.add(lIlllIlllIIllI);
                            0;
                        }
                        int[] nArray = new int[llIIIIllI[1]];
                        nArray[P.llIIIIllI[0]] = llIIIIllI[20];
                        if (!P.lIlIIIllllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray12 = new int[llIIIIllI[1]];
                        nArray12[P.llIIIIllI[0]] = llIIIIllI[20];
                        if (!P.lIlIIIllllIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block35;
                        int[] nArray13 = new int[llIIIIllI[1]];
                        nArray13[P.llIIIIllI[0]] = llIIIIllI[20];
                        if (!P.lIlIIIlllllI(Bank.getFirst((int[])nArray13).getQuantity(), llIIIIllI[30])) break block35;
                    }
                    System.out.println(llIIIIlII[llIIIIllI[52]]);
                    lIlllIlllIIllI = new d(llIIIIllI[20], llIIIIllI[45], llIIIIllI[53]);
                    bv.add(lIlllIlllIIllI);
                    0;
                }
                int[] nArray = new int[llIIIIllI[1]];
                nArray[P.llIIIIllI[0]] = llIIIIllI[7];
                if (P.lIlIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    System.out.println(llIIIIlII[llIIIIllI[54]]);
                    lIlllIlllIIllI = new d(llIIIIllI[7], llIIIIllI[30], llIIIIllI[53]);
                    bv.add(lIlllIlllIIllI);
                    0;
                }
                int[] nArray14 = new int[llIIIIllI[1]];
                nArray14[P.llIIIIllI[0]] = llIIIIllI[7];
                if (!P.lIlIIIllllIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block36;
                int[] nArray15 = new int[llIIIIllI[1]];
                nArray15[P.llIIIIllI[0]] = llIIIIllI[7];
                if (!P.lIlIIIllllIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block37;
                int[] nArray16 = new int[llIIIIllI[1]];
                nArray16[P.llIIIIllI[0]] = llIIIIllI[7];
                if (!P.lIlIIIlllllI(Bank.getFirst((int[])nArray16).getQuantity(), llIIIIllI[30])) break block37;
            }
            System.out.println(llIIIIlII[llIIIIllI[55]]);
            lIlllIlllIIllI = new d(llIIIIllI[7], llIIIIllI[30], llIIIIllI[53]);
            bv.add(lIlllIlllIIllI);
            0;
        }
        int[] nArray = new int[llIIIIllI[1]];
        nArray[P.llIIIIllI[0]] = llIIIIllI[27];
        if (P.lIlIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[56]]);
            lIlllIlllIIllI = new d(llIIIIllI[27], llIIIIllI[9], i.bq);
            bv.add(lIlllIlllIIllI);
            0;
        }
        int[] nArray17 = new int[llIIIIllI[1]];
        nArray17[P.llIIIIllI[0]] = llIIIIllI[10];
        if (P.lIlIIIllllIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
            int[] nArray18 = new int[llIIIIllI[1]];
            nArray18[P.llIIIIllI[0]] = llIIIIllI[10];
            if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray18).getQuantity(), llIIIIllI[11])) {
                System.out.println(llIIIIlII[llIIIIllI[57]]);
                lIlllIlllIIllI = new d(llIIIIllI[10], llIIIIllI[58], llIIIIllI[14]);
                bv.add(lIlllIlllIIllI);
                0;
            }
        }
        int[] nArray19 = new int[llIIIIllI[1]];
        nArray19[P.llIIIIllI[0]] = llIIIIllI[59];
        if (P.lIlIIIllllIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[llIIIIllI[1]];
            nArray20[P.llIIIIllI[0]] = llIIIIllI[59];
            if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray20).getQuantity(), llIIIIllI[11])) {
                System.out.println(llIIIIlII[llIIIIllI[60]]);
                lIlllIlllIIllI = new d(llIIIIllI[59], llIIIIllI[58], llIIIIllI[14]);
                bv.add(lIlllIlllIIllI);
                0;
            }
        }
        int[] nArray21 = new int[llIIIIllI[1]];
        nArray21[P.llIIIIllI[0]] = llIIIIllI[15];
        if (P.lIlIIIllllIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
            int[] nArray22 = new int[llIIIIllI[1]];
            nArray22[P.llIIIIllI[0]] = llIIIIllI[15];
            if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray22).getQuantity(), llIIIIllI[11])) {
                System.out.println(llIIIIlII[llIIIIllI[61]]);
                lIlllIlllIIllI = new d(llIIIIllI[15], llIIIIllI[58], llIIIIllI[14]);
                bv.add(lIlllIlllIIllI);
                0;
            }
        }
        int[] nArray23 = new int[llIIIIllI[1]];
        nArray23[P.llIIIIllI[0]] = llIIIIllI[13];
        if (P.lIlIIIllllIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
            int[] nArray24 = new int[llIIIIllI[1]];
            nArray24[P.llIIIIllI[0]] = llIIIIllI[13];
            if (P.lIlIIIlllllI(Bank.getFirst((int[])nArray24).getQuantity(), llIIIIllI[11])) {
                System.out.println(llIIIIlII[llIIIIllI[62]]);
                lIlllIlllIIllI = new d(llIIIIllI[13], llIIIIllI[58], llIIIIllI[14]);
                bv.add(lIlllIlllIIllI);
                0;
            }
        }
        int[] nArray25 = new int[llIIIIllI[1]];
        nArray25[P.llIIIIllI[0]] = llIIIIllI[59];
        if (P.lIlIIIllllll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[63]]);
            lIlllIlllIIllI = new d(llIIIIllI[59], llIIIIllI[58], llIIIIllI[14]);
            bv.add(lIlllIlllIIllI);
            0;
        }
        int[] nArray26 = new int[llIIIIllI[1]];
        nArray26[P.llIIIIllI[0]] = llIIIIllI[15];
        if (P.lIlIIIllllll(Bank.contains((int[])nArray26) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[64]]);
            lIlllIlllIIllI = new d(llIIIIllI[15], llIIIIllI[58], llIIIIllI[14]);
            bv.add(lIlllIlllIIllI);
            0;
        }
        int[] nArray27 = new int[llIIIIllI[1]];
        nArray27[P.llIIIIllI[0]] = llIIIIllI[13];
        if (P.lIlIIIllllll(Bank.contains((int[])nArray27) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[65]]);
            lIlllIlllIIllI = new d(llIIIIllI[13], llIIIIllI[58], llIIIIllI[14]);
            bv.add(lIlllIlllIIllI);
            0;
        }
        int[] nArray28 = new int[llIIIIllI[1]];
        nArray28[P.llIIIIllI[0]] = llIIIIllI[10];
        if (P.lIlIIIllllll(Bank.contains((int[])nArray28) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[66]]);
            lIlllIlllIIllI = new d(llIIIIllI[10], llIIIIllI[58], llIIIIllI[14]);
            bv.add(lIlllIlllIIllI);
            0;
        }
    }

    private static boolean lIlIIlIIIIll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean S() {
        return llIIIIllI[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void ck() {
        void lIlllIlllIIlII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (P.lIlIIlIIIIII(bankLocation) && P.lIlIIIllllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[71]];
            a.a(bankLocation);
        }
        if (P.lIlIIlIIIIII(lIlllIlllIIlII) && P.lIlIIIllllIl(lIlllIlllIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (P.lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[72]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIllI[5]);
                0;
            }
            if (P.lIlIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[73]];
                if (P.lIlIIlIIIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIIIIllI[4]);
                    0;
                }
                if (P.lIlIIlIIIIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llIIIIllI[3]);
                    0;
                }
                String[] stringArray = new String[llIIIIllI[1]];
                stringArray[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[74]];
                if (P.lIlIIIllllIl(Bank.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIIIIllI[1]];
                    stringArray2[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[75]];
                    if (P.lIlIIIlllllI(Bank.getFirst((String[])stringArray2).getQuantity(), llIIIIllI[11])) {
                        P.af();
                        System.out.println(llIIIIlII[llIIIIllI[76]]);
                        bt = llIIIIllI[1];
                        return;
                    }
                }
                String[] stringArray3 = new String[llIIIIllI[1]];
                stringArray3[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[77]];
                if (P.lIlIIIllllIl(Bank.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[llIIIIllI[1]];
                    stringArray4[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[78]];
                    if (P.lIlIIIlllllI(Bank.getFirst((String[])stringArray4).getQuantity(), llIIIIllI[11])) {
                        P.af();
                        System.out.println(llIIIIlII[llIIIIllI[79]]);
                        bt = llIIIIllI[1];
                        return;
                    }
                }
                String[] stringArray5 = new String[llIIIIllI[1]];
                stringArray5[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[80]];
                if (P.lIlIIIllllIl(Bank.contains((String[])stringArray5) ? 1 : 0)) {
                    String[] stringArray6 = new String[llIIIIllI[1]];
                    stringArray6[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[81]];
                    if (P.lIlIIIlllllI(Bank.getFirst((String[])stringArray6).getQuantity(), llIIIIllI[11])) {
                        P.af();
                        System.out.println(llIIIIlII[llIIIIllI[82]]);
                        bt = llIIIIllI[1];
                        return;
                    }
                }
                int[] nArray = new int[llIIIIllI[19]];
                nArray[P.llIIIIllI[0]] = llIIIIllI[20];
                nArray[P.llIIIIllI[1]] = llIIIIllI[21];
                nArray[P.llIIIIllI[3]] = llIIIIllI[22];
                nArray[P.llIIIIllI[4]] = llIIIIllI[23];
                nArray[P.llIIIIllI[6]] = llIIIIllI[24];
                nArray[P.llIIIIllI[9]] = llIIIIllI[7];
                nArray[P.llIIIIllI[12]] = llIIIIllI[17];
                nArray[P.llIIIIllI[14]] = llIIIIllI[25];
                nArray[P.llIIIIllI[16]] = llIIIIllI[10];
                nArray[P.llIIIIllI[18]] = llIIIIllI[15];
                nArray[P.llIIIIllI[8]] = llIIIIllI[13];
                if (P.lIlIIIllllll(e.b(nArray) ? 1 : 0)) {
                    P.af();
                    System.out.println(llIIIIlII[llIIIIllI[83]]);
                    bt = llIIIIllI[1];
                    return;
                }
                while (P.lIlIIIllllll(z.bi() ? 1 : 0)) {
                    z.bg();
                    Time.sleepTicks((int)llIIIIllI[1]);
                    0;
                    0;
                    if (((0xD1 ^ 0x80 ^ (0x29 ^ 0x5A)) & (0x3B ^ 8 ^ (0xB9 ^ 0xA8) ^ -1)) < 1) continue;
                    return;
                }
                if (P.lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)llIIIIllI[6]);
                    0;
                }
                int[] nArray2 = new int[llIIIIllI[1]];
                nArray2[P.llIIIIllI[0]] = llIIIIllI[22];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIIIllI[1]];
                    nArray3[P.llIIIIllI[0]] = llIIIIllI[22];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray3), llIIIIllI[1])) {
                        Bank.withdraw((int)llIIIIllI[22], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[22];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                if (2 <= ((0x2A ^ 0x7C) & ~(5 ^ 0x53))) {
                                    return false;
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray4 = new int[llIIIIllI[1]];
                nArray4[P.llIIIIllI[0]] = llIIIIllI[23];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[llIIIIllI[1]];
                    nArray5[P.llIIIIllI[0]] = llIIIIllI[23];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray5), llIIIIllI[1])) {
                        Bank.withdraw((int)llIIIIllI[23], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[23];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray6 = new int[llIIIIllI[1]];
                nArray6[P.llIIIIllI[0]] = llIIIIllI[21];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[llIIIIllI[1]];
                    nArray7[P.llIIIIllI[0]] = llIIIIllI[21];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray7), llIIIIllI[1])) {
                        Bank.withdraw((int)llIIIIllI[21], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[21];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                if ((0x42 ^ 0x47) == 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray8 = new int[llIIIIllI[1]];
                nArray8[P.llIIIIllI[0]] = llIIIIllI[24];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    int[] nArray9 = new int[llIIIIllI[1]];
                    nArray9[P.llIIIIllI[0]] = llIIIIllI[24];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray9), llIIIIllI[1])) {
                        Bank.withdraw((int)llIIIIllI[24], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[24];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                if (1 < 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray10 = new int[llIIIIllI[1]];
                nArray10[P.llIIIIllI[0]] = llIIIIllI[7];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    int[] nArray11 = new int[llIIIIllI[1]];
                    nArray11[P.llIIIIllI[0]] = llIIIIllI[7];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray11), llIIIIllI[1])) {
                        Bank.withdraw((int)llIIIIllI[7], (int)llIIIIllI[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[7];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                if (((0xF5 ^ 0xBF) & ~(0x69 ^ 0x23)) < 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray12 = new int[llIIIIllI[1]];
                nArray12[P.llIIIIllI[0]] = llIIIIllI[17];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    int[] nArray13 = new int[llIIIIllI[1]];
                    nArray13[P.llIIIIllI[0]] = llIIIIllI[17];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray13), llIIIIllI[1])) {
                        Bank.withdraw((int)llIIIIllI[17], (int)llIIIIllI[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[17];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                if (((0x59 ^ 0 ^ (0xFE ^ 0x84)) & (56 + 6 - -86 + 25 ^ 30 + 2 - -56 + 54 ^ -1)) >= 3) {
                                    return ((0xB8 ^ 0x8C ^ (0x4D ^ 0x7D)) & (0x3A ^ 0x6B ^ (0x4A ^ 0x1F) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray14 = new int[llIIIIllI[1]];
                nArray14[P.llIIIIllI[0]] = llIIIIllI[10];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    int[] nArray15 = new int[llIIIIllI[1]];
                    nArray15[P.llIIIIllI[0]] = llIIIIllI[10];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray15), llIIIIllI[1])) {
                        Bank.withdraw((int)llIIIIllI[10], (int)llIIIIllI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[10];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                if (((0x99 ^ 0xB2) & ~(0x70 ^ 0x5B)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray16 = new int[llIIIIllI[1]];
                nArray16[P.llIIIIllI[0]] = llIIIIllI[15];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIIIIllI[1]];
                    nArray17[P.llIIIIllI[0]] = llIIIIllI[15];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray17), llIIIIllI[1])) {
                        Bank.withdraw((int)llIIIIllI[15], (int)llIIIIllI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[15];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                if (((0x42 ^ 0x62 ^ (0x83 ^ 0x87)) & (0x27 ^ 0x6A ^ (0x34 ^ 0x5D) ^ -1)) != 0) {
                                    return ((0x48 ^ 0x26 ^ (0xED ^ 0x9E)) & (51 + 150 - 57 + 32 ^ 49 + 95 - 127 + 156 ^ -1)) != 0;
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray18 = new int[llIIIIllI[1]];
                nArray18[P.llIIIIllI[0]] = llIIIIllI[13];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                    int[] nArray19 = new int[llIIIIllI[1]];
                    nArray19[P.llIIIIllI[0]] = llIIIIllI[13];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray19), llIIIIllI[1])) {
                        Bank.withdraw((int)llIIIIllI[13], (int)llIIIIllI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[13];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray20 = new int[llIIIIllI[1]];
                nArray20[P.llIIIIllI[0]] = llIIIIllI[27];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llIIIIllI[1]];
                    nArray21[P.llIIIIllI[0]] = llIIIIllI[27];
                    if (P.lIlIIIllllll(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIIllI[27], (int)llIIIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[27];
                            return Inventory.contains((int[])nArray);
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
                int[] nArray22 = new int[llIIIIllI[1]];
                nArray22[P.llIIIIllI[0]] = llIIIIllI[25];
                if (P.lIlIIIllllIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[llIIIIllI[1]];
                    nArray23[P.llIIIIllI[0]] = llIIIIllI[25];
                    if (P.lIlIIIlllllI(Inventory.getCount((int[])nArray23), llIIIIllI[1])) {
                        Bank.withdrawAll((int)llIIIIllI[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIllI[1]];
                            nArray[P.llIIIIllI[0]] = llIIIIllI[25];
                            if (P.lIlIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIllI[1];
                                0;
                                if (1 > 3) {
                                    return false;
                                }
                            } else {
                                bl = llIIIIllI[0];
                            }
                            return bl;
                        }, (int)llIIIIllI[5]);
                        0;
                    }
                }
            }
        }
    }

    private static String lIlIIIllIlIl(String lIlllIllIIllIl, String lIlllIllIIllII) {
        try {
            SecretKeySpec lIlllIllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIllIIllll = Cipher.getInstance("Blowfish");
            lIlllIllIIllll.init(llIIIIllI[3], lIlllIllIlIIII);
            return new String(lIlllIllIIllll.doFinal(Base64.getDecoder().decode(lIlllIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIllIIlllI) {
            lIlllIllIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        P.lIlIIIllllII();
        P.lIlIIIlllIll();
        jv = llIIIIllI[15];
        jy = llIIIIllI[25];
        jw = llIIIIllI[13];
        js = llIIIIllI[23];
        jr = llIIIIllI[22];
        jz = llIIIIllI[17];
        jx = llIIIIllI[86];
        jp = llIIIIllI[2];
        jq = llIIIIllI[21];
        jt = llIIIIllI[24];
        ju = llIIIIllI[10];
        jo = new WorldPoint(llIIIIllI[87], llIIIIllI[88], llIIIIllI[3]);
        bv = new ArrayList<d>();
        iw = llIIIIlII[llIIIIllI[89]];
        String[] stringArray = new String[llIIIIllI[12]];
        stringArray[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[90]];
        stringArray[P.llIIIIllI[1]] = llIIIIlII[llIIIIllI[91]];
        stringArray[P.llIIIIllI[3]] = llIIIIlII[llIIIIllI[92]];
        stringArray[P.llIIIIllI[4]] = llIIIIlII[llIIIIllI[93]];
        stringArray[P.llIIIIllI[6]] = llIIIIlII[llIIIIllI[94]];
        stringArray[P.llIIIIllI[9]] = llIIIIlII[llIIIIllI[95]];
        hl = stringArray;
        bT = llIIIIllI[0];
    }

    private static void lIlIIIllllII() {
        llIIIIllI = new int[97];
        P.llIIIIllI[0] = (0x76 ^ 0x23 ^ (0x76 ^ 0x3F)) & (0x51 ^ 0x15 ^ (0x70 ^ 0x28) ^ -1);
        P.llIIIIllI[1] = 1;
        P.llIIIIllI[2] = 3 + 64 - -21 + 72;
        P.llIIIIllI[3] = 2;
        P.llIIIIllI[4] = 3;
        P.llIIIIllI[5] = 0xFFFFDF8F & 0x33F8;
        P.llIIIIllI[6] = 0xAA ^ 0xAE;
        P.llIIIIllI[7] = 0xFFFFFFFB & 0x1F4D;
        P.llIIIIllI[8] = 0xA3 ^ 0xBE ^ (1 ^ 0x16);
        P.llIIIIllI[9] = 0x42 ^ 0x47;
        P.llIIIIllI[10] = 0xFFFF87AF & 0x7A7E;
        P.llIIIIllI[11] = -(0xFFFFCE77 & 0x358B) & (0xFFFF8FEE & 0x77FB);
        P.llIIIIllI[12] = 0x3C ^ 0x5F ^ (0x56 ^ 0x33);
        P.llIIIIllI[13] = 0xFFFFA23D & 0x5FEF;
        P.llIIIIllI[14] = 9 ^ 0xE;
        P.llIIIIllI[15] = -(0xFFFFED9D & 0x7AE3) & (0xFFFFFAEF & 0x6FBB);
        P.llIIIIllI[16] = 71 + 147 - 100 + 51 ^ 68 + 84 - 76 + 85;
        P.llIIIIllI[17] = 0xFFFFBFF3 & 0x47CD;
        P.llIIIIllI[18] = 0x30 ^ 6 ^ (0x32 ^ 0xD);
        P.llIIIIllI[19] = 0x19 ^ 0x74 ^ (7 ^ 0x61);
        P.llIIIIllI[20] = -(0xFFFFB6FB & 0x69BD) & (0xFFFFFFFF & 0x3FFF);
        P.llIIIIllI[21] = 0xFFFFB5BF & 0x4FFE;
        P.llIIIIllI[22] = 0xFFFFD5D4 & 0x2FEB;
        P.llIIIIllI[23] = 0xFFFFB5E6 & 0x4FDB;
        P.llIIIIllI[24] = 0xFFFFA7F6 & 0x5DCD;
        P.llIIIIllI[25] = 0xFFFF93FB & 0x6D7F;
        P.llIIIIllI[26] = 0xFFFF99F5 & 0x67FE;
        P.llIIIIllI[27] = 0xFFFFFB5F & 0x35F1;
        P.llIIIIllI[28] = 0xFFFFFAF7 & 0xF1C;
        P.llIIIIllI[29] = 0xFFFFED2D & 0x1EDA;
        P.llIIIIllI[30] = 0x13 ^ 0x56 ^ (0x5D ^ 0xC);
        P.llIIIIllI[31] = 0x31 ^ 0x4A ^ (0xD2 ^ 0xA6);
        P.llIIIIllI[32] = 0x72 ^ 0x66 ^ (0xB5 ^ 0xAD);
        P.llIIIIllI[33] = 96 + 65 - 115 + 144 ^ 3 + 67 - -10 + 99;
        P.llIIIIllI[34] = 0x95 ^ 0x9B;
        P.llIIIIllI[35] = 0x1F ^ 0xF;
        P.llIIIIllI[36] = 0xA4 ^ 0xB5;
        P.llIIIIllI[37] = 0xFFFFBFB7 & 0x656E;
        P.llIIIIllI[38] = 0xBA ^ 0xA8;
        P.llIIIIllI[39] = -(0xFFFFFCB9 & 0x1F4F) & (0xFFFFBFBE & 0x7FDF);
        P.llIIIIllI[40] = 3 ^ 0x29 ^ (0x8F ^ 0xB6);
        P.llIIIIllI[41] = 0xBD ^ 0xA8;
        P.llIIIIllI[42] = 0x38 ^ 0x3E ^ (0xE8 ^ 0x8A);
        P.llIIIIllI[43] = -(0xFFFFFBEA & 0x5637) & (0xFFFFD3BD & 0x7FF3);
        P.llIIIIllI[44] = 0x8D ^ 0xBD ^ (0x36 ^ 0x10);
        P.llIIIIllI[45] = 0x4F ^ 0x67;
        P.llIIIIllI[46] = 0xAE ^ 0xB9;
        P.llIIIIllI[47] = -(0xFFFFA62D & 0x5DD3) & (0xFFFFFFF6 & 0x17FF);
        P.llIIIIllI[48] = 0x28 ^ 0x3E ^ (0x99 ^ 0x97);
        P.llIIIIllI[49] = 0x70 ^ 0x69;
        P.llIIIIllI[50] = -(0xFFFFFF3A & 0x50D7) & (0xFFFFFFFF & 0x7EDD);
        P.llIIIIllI[51] = -(0xFFFFB597 & 0x7AFF) & (0xFFFFFBFF & 0x76FE);
        P.llIIIIllI[52] = 0xEC ^ 0x99 ^ (0x52 ^ 0x3D);
        P.llIIIIllI[53] = -(0xFFFFFB5F & 0x7CA1) & (0xFFFFFFEC & 0x7F7F);
        P.llIIIIllI[54] = 97 + 71 - 59 + 109 ^ 176 + 126 - 272 + 163;
        P.llIIIIllI[55] = 0x53 ^ 0x4F;
        P.llIIIIllI[56] = 0xA6 ^ 0xBB;
        P.llIIIIllI[57] = 24 + 24 - -49 + 36 ^ 9 + 152 - 122 + 116;
        P.llIIIIllI[58] = 0xFFFFB7FF & 0x4FD0;
        P.llIIIIllI[59] = 0xFFFFDF7E & 0x22AD;
        P.llIIIIllI[60] = 0x95 ^ 0xBB ^ (0xC ^ 0x3D);
        P.llIIIIllI[61] = 0xF6 ^ 0x8C ^ (0xED ^ 0xB7);
        P.llIIIIllI[62] = 0x7C ^ 0x51 ^ (0x74 ^ 0x78);
        P.llIIIIllI[63] = 0xEC ^ 0x9D ^ (0xF6 ^ 0xA5);
        P.llIIIIllI[64] = 0x89 ^ 0xAA;
        P.llIIIIllI[65] = 64 + 1 - -58 + 13 ^ 134 + 74 - 128 + 92;
        P.llIIIIllI[66] = 9 ^ 0x2C;
        P.llIIIIllI[67] = 0xB5 ^ 0x93;
        P.llIIIIllI[68] = 0xB2 ^ 0x95;
        P.llIIIIllI[69] = 0xAF ^ 0xBD ^ (0x69 ^ 0x52);
        P.llIIIIllI[70] = 0x2A ^ 0;
        P.llIIIIllI[71] = 139 + 29 - 16 + 4 ^ 10 + 32 - -14 + 127;
        P.llIIIIllI[72] = 0x89 ^ 0xA4 ^ 1;
        P.llIIIIllI[73] = 0x1C ^ 0x53 ^ (2 ^ 0x60);
        P.llIIIIllI[74] = 0x58 ^ 0x43 ^ (0x84 ^ 0xB1);
        P.llIIIIllI[75] = 0xAA ^ 0x85;
        P.llIIIIllI[76] = 0x30 ^ 0;
        P.llIIIIllI[77] = 148 + 160 - 255 + 126 ^ 52 + 98 - 117 + 97;
        P.llIIIIllI[78] = 0x62 ^ 0x2E ^ (0x31 ^ 0x4F);
        P.llIIIIllI[79] = 0xE ^ 0x41 ^ (0x5E ^ 0x22);
        P.llIIIIllI[80] = 0x33 ^ 7;
        P.llIIIIllI[81] = 3 ^ (0xB8 ^ 0x8E);
        P.llIIIIllI[82] = 80 + 8 - -21 + 30 ^ 87 + 170 - 205 + 137;
        P.llIIIIllI[83] = 0x87 ^ 0xB0;
        P.llIIIIllI[84] = 72 + 172 - 197 + 144 ^ 21 + 54 - 15 + 75;
        P.llIIIIllI[85] = 0x5F ^ 0x66;
        P.llIIIIllI[86] = 0xFFFFD7BA & 0x2A6F;
        P.llIIIIllI[87] = 0xFFFF8EF6 & 0x7D29;
        P.llIIIIllI[88] = 0xFFFFCD5B & 0x3EFF;
        P.llIIIIllI[89] = 90 + 99 - 152 + 94 ^ 162 + 94 - 231 + 160;
        P.llIIIIllI[90] = 0x90 ^ 0xAB;
        P.llIIIIllI[91] = 0x61 ^ 0x5D;
        P.llIIIIllI[92] = 0xBF ^ 0xA6 ^ (0x4A ^ 0x6E);
        P.llIIIIllI[93] = 0x74 ^ 0x4A;
        P.llIIIIllI[94] = 0x60 ^ 0x5F;
        P.llIIIIllI[95] = 0x16 ^ 0x56;
        P.llIIIIllI[96] = 0xAE ^ 0xB8 ^ (0xD1 ^ 0x86);
    }

    private static boolean lIlIIlIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIIIIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bH() {
        int n2;
        String[] stringArray = new String[llIIIIllI[1]];
        stringArray[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[67]];
        if (P.lIlIIIllllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIIllI[1]];
            stringArray2[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[68]];
            if (P.lIlIIIllllIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[llIIIIllI[1]];
                stringArray3[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[45]];
                if (P.lIlIIIllllIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[llIIIIllI[1]];
                    stringArray4[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[69]];
                    if (P.lIlIIIllllIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        int[] nArray = new int[llIIIIllI[1]];
                        nArray[P.llIIIIllI[0]] = llIIIIllI[10];
                        if (P.lIlIIIllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[llIIIIllI[1]];
                            nArray2[P.llIIIIllI[0]] = llIIIIllI[15];
                            if (P.lIlIIIllllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                int[] nArray3 = new int[llIIIIllI[1]];
                                nArray3[P.llIIIIllI[0]] = llIIIIllI[13];
                                if (P.lIlIIIllllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    int[] nArray4 = new int[llIIIIllI[1]];
                                    nArray4[P.llIIIIllI[0]] = llIIIIllI[7];
                                    if (P.lIlIIIllllIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[llIIIIllI[1]];
                                        nArray5[P.llIIIIllI[0]] = llIIIIllI[25];
                                        if (P.lIlIIIllllIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            String[] stringArray5 = new String[llIIIIllI[1]];
                                            stringArray5[P.llIIIIllI[0]] = llIIIIlII[llIIIIllI[70]];
                                            if (P.lIlIIIllllIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                                n2 = llIIIIllI[1];
                                                0;
                                                if (3 != 0) return n2 != 0;
                                                return (1 & ~1) != 0;
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
        n2 = llIIIIllI[0];
        return n2 != 0;
    }

    @Override
    public String U() {
        return llIIIIlII[llIIIIllI[84]];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (P.lIlIIlIIIlIl(e.j(llIIIIllI[2]), llIIIIllI[3])) {
            bl = llIIIIllI[1];
            0;
            if (((0xF0 ^ 0x82 ^ (0x67 ^ 0x26)) & (0x6A ^ 0x67 ^ (0x9A ^ 0xA4) ^ -1)) != 0) {
                return ((133 + 119 - 182 + 92 ^ 105 + 53 - 134 + 131) & (0xCD ^ 0x9E ^ (0xCA ^ 0xA0) ^ -1)) != 0;
            }
        } else {
            bl = llIIIIllI[0];
        }
        return bl;
    }

    private static String lIlIIIllIlll(String lIlllIllIllIII, String lIlllIllIlIlll) {
        try {
            SecretKeySpec lIlllIllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIllIlIlll.getBytes(StandardCharsets.UTF_8)), llIIIIllI[16]), "DES");
            Cipher lIlllIllIlllII = Cipher.getInstance("DES");
            lIlllIllIlllII.init(llIIIIllI[3], lIlllIllIlllIl);
            return new String(lIlllIllIlllII.doFinal(Base64.getDecoder().decode(lIlllIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIllIllIll) {
            lIlllIllIllIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlllIll() {
        llIIIIlII = new String[llIIIIllI[96]];
        P.llIIIIlII[P.llIIIIllI[0]] = P."Buying items";
        P.llIIIIlII[P.llIIIIllI[1]] = P."Finished buying items, switching back to questing";
        P.llIIIIlII[P.llIIIIllI[3]] = P."Navigating to bank";
        P.llIIIIlII[P.llIIIIllI[4]] = P."Opening bank";
        P.llIIIIlII[P.llIIIIllI[6]] = P."Handling banking";
        P.llIIIIlII[P.llIIIIllI[9]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[12]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[14]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[16]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[18]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[8]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[19]] = P."Walking to imp start";
        P.llIIIIlII[P.llIIIIllI[32]] = P."Magic Portal";
        P.llIIIIlII[P.llIIIIllI[33]] = P."Enter";
        P.llIIIIlII[P.llIIIIllI[34]] = P."Handling quest";
        P.llIIIIlII[P.llIIIIllI[31]] = P."Nav to start";
        P.llIIIIlII[P.llIIIIllI[35]] = P."Finishing quest";
        P.llIIIIlII[P.llIIIIllI[36]] = P."Adding red bead to buy list";
        P.llIIIIlII[P.llIIIIllI[38]] = P."Adding yellow bead to buy list";
        P.llIIIIlII[P.llIIIIllI[40]] = P."Adding black bead to buy list";
        P.llIIIIlII[P.llIIIIllI[30]] = P."Adding white bead to buy list";
        P.llIIIIlII[P.llIIIIllI[41]] = P."Adding lobster to buy list";
        P.llIIIIlII[P.llIIIIllI[44]] = P."Adding lobster to buy list";
        P.llIIIIlII[P.llIIIIllI[46]] = P."Adding cheese to buy list";
        P.llIIIIlII[P.llIIIIllI[48]] = P."Adding cheese to buy list";
        P.llIIIIlII[P.llIIIIllI[49]] = P."Adding wealth to buy list";
        P.llIIIIlII[P.llIIIIllI[52]] = P."Adding varrock tabs to buy list";
        P.llIIIIlII[P.llIIIIllI[54]] = P."Adding fally tabs to buy list";
        P.llIIIIlII[P.llIIIIllI[55]] = P."Adding fally tabs to buy list";
        P.llIIIIlII[P.llIIIIllI[56]] = P."Adding staminas to buy list";
        P.llIIIIlII[P.llIIIIllI[57]] = P."Adding mind runes to buy list";
        P.llIIIIlII[P.llIIIIllI[60]] = P."Adding air runes to buy list";
        P.llIIIIlII[P.llIIIIllI[61]] = P."Adding water runes to buy list";
        P.llIIIIlII[P.llIIIIllI[62]] = P."Adding earth runes to buy list";
        P.llIIIIlII[P.llIIIIllI[63]] = P."Adding air runes to buy list";
        P.llIIIIlII[P.llIIIIllI[64]] = P."Adding water runes to buy list";
        P.llIIIIlII[P.llIIIIllI[65]] = P."Adding earth runes to buy list";
        P.llIIIIlII[P.llIIIIllI[66]] = P."Adding mind runes to buy list";
        P.llIIIIlII[P.llIIIIllI[67]] = P."Red bead";
        P.llIIIIlII[P.llIIIIllI[68]] = P."Yellow bead";
        P.llIIIIlII[P.llIIIIllI[45]] = P."Black bead";
        P.llIIIIlII[P.llIIIIllI[69]] = P."White bead";
        P.llIIIIlII[P.llIIIIllI[70]] = P."Cheese";
        P.llIIIIlII[P.llIIIIllI[71]] = P."Navigating to bank";
        P.llIIIIlII[P.llIIIIllI[72]] = P."Opening bank";
        P.llIIIIlII[P.llIIIIllI[73]] = P."Handling banking";
        P.llIIIIlII[P.llIIIIllI[74]] = P."Mind rune";
        P.llIIIIlII[P.llIIIIllI[75]] = P."Mind rune";
        P.llIIIIlII[P.llIIIIllI[76]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[77]] = P."Earth rune";
        P.llIIIIlII[P.llIIIIllI[78]] = P."Earth rune";
        P.llIIIIlII[P.llIIIIllI[79]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[80]] = P."Water rune";
        P.llIIIIlII[P.llIIIIllI[81]] = P."Water rune";
        P.llIIIIlII[P.llIIIIllI[82]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[83]] = P."We are missing supplies, switching to BUYING";
        P.llIIIIlII[P.llIIIIllI[84]] = P."Imp Catcher quest";
        P.llIIIIlII[P.llIIIIllI[85]] = P."ring of wealth (";
        P.llIIIIlII[P.llIIIIllI[89]] = P."Wizard Mizgog";
        P.llIIIIlII[P.llIIIIllI[90]] = P."Give me a quest please.";
        P.llIIIIlII[P.llIIIIllI[91]] = P."I'll try.";
        P.llIIIIlII[P.llIIIIllI[92]] = P."Actually, I know where to find this stuff.";
        P.llIIIIlII[P.llIIIIllI[93]] = P."Yes.";
        P.llIIIIlII[P.llIIIIllI[94]] = P."What's the matter?";
        P.llIIIIlII[P.llIIIIllI[95]] = P."Ok, I'll see what I can do.";
    }
}

