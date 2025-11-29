/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class K
implements M {
    static /* synthetic */ int co;
    public static final /* synthetic */ WorldPoint hU;
    private static final /* synthetic */ String[] hW;
    public static /* synthetic */ List<d> bA;
    public static final /* synthetic */ WorldPoint hT;
    private static /* synthetic */ int[] lIIIllllIllIl;
    public static /* synthetic */ boolean by;
    static /* synthetic */ boolean cp;
    static /* synthetic */ int bY;
    public static final /* synthetic */ WorldPoint hV;
    private static /* synthetic */ String[] lIIIllllIlIlI;

    public static void cz() {
        block48: {
            BankLocation lllllllllllllllIIIIIIllIIIIlIIll;
            block51: {
                block52: {
                    block50: {
                        block49: {
                            if (K.lIlIIlIlllllIII(by ? 1 : 0)) {
                                AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[0]];
                                b.a(bA);
                                if (K.lIlIIlIlllllIIl(bA.size(), lIIIllllIllIl[1])) {
                                    System.out.println(lIIIllllIlIlI[lIIIllllIllIl[1]]);
                                    by = lIIIllllIllIl[0];
                                }
                            }
                            if (!K.lIlIIlIlllllIlI(by ? 1 : 0)) break block48;
                            if (K.lIlIIlIlllllIII(Inventory.contains((int[])f.ba) ? 1 : 0) && K.lIlIIlIlllllIIl(Movement.getRunEnergy(), lIIIllllIllIl[2])) {
                                Inventory.getFirst((int[])f.ba).interact(lIIIllllIlIlI[lIIIllllIllIl[3]]);
                                Time.sleepTicks((int)lIIIllllIllIl[1]);
                                0;
                            }
                            if (K.lIlIIlIlllllIll(K.lIlIIlIllllIlll(e.v(), 70.0))) {
                                int[] nArray = new int[lIIIllllIllIl[1]];
                                nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[4];
                                if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[lIIIllllIllIl[1]];
                                    nArray2[K.lIIIllllIllIl[0]] = lIIIllllIllIl[4];
                                    Inventory.getFirst((int[])nArray2).interact(lIIIllllIlIlI[lIIIllllIllIl[5]]);
                                }
                            }
                            if (K.lIlIIlIlllllIlI(Movement.isRunEnabled() ? 1 : 0) && K.lIlIIlIllllllII(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!K.lIlIIlIlllllIII(K.S() ? 1 : 0)) break block49;
                            int[] nArray = new int[lIIIllllIllIl[1]];
                            nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[6];
                            if (!K.lIlIIlIllllllII(Inventory.getCount((int[])nArray))) break block50;
                        }
                        if (K.lIlIIlIlllllIIl(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                            lllllllllllllllIIIIIIllIIIIlIIll = BankLocation.getNearest();
                            if (K.lIlIIlIllllllIl(lllllllllllllllIIIIIIllIIIIlIIll) && K.lIlIIlIlllllIlI(lllllllllllllllIIIIIIllIIIIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[8]];
                                Movement.walkTo((BankLocation)lllllllllllllllIIIIIIllIIIIlIIll);
                                0;
                                Time.sleepTicks((int)lIIIllllIllIl[3]);
                                0;
                            }
                            if (K.lIlIIlIllllllIl(lllllllllllllllIIIIIIllIIIIlIIll) && K.lIlIIlIlllllIII(lllllllllllllllIIIIIIllIIIIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[9]];
                                if (K.lIlIIlIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIllIl[10]);
                                    0;
                                }
                                if (K.lIlIIlIlllllIII(Bank.isOpen() ? 1 : 0)) {
                                    if (K.lIlIIlIllllllII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIllllIllIl[8]);
                                        0;
                                    }
                                    if (K.lIlIIlIllllllII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIllllIllIl[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lIIIllllIllIl[9]];
                                    nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[11];
                                    nArray[K.lIIIllllIllIl[1]] = lIIIllllIllIl[12];
                                    nArray[K.lIIIllllIllIl[3]] = lIIIllllIllIl[13];
                                    nArray[K.lIIIllllIllIl[5]] = lIIIllllIllIl[14];
                                    nArray[K.lIIIllllIllIl[8]] = lIIIllllIllIl[15];
                                    if (K.lIlIIlIlllllIlI(e.b(nArray) ? 1 : 0)) {
                                        K.W();
                                        System.out.println(lIIIllllIlIlI[lIIIllllIllIl[16]]);
                                        by = lIIIllllIllIl[1];
                                        return;
                                    }
                                    Bank.withdraw((int)lIIIllllIllIl[11], (int)lIIIllllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);
                                    0;
                                    Bank.withdraw((int)lIIIllllIllIl[14], (int)lIIIllllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);
                                    0;
                                    Bank.withdraw((int)lIIIllllIllIl[15], (int)lIIIllllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);
                                    0;
                                    Bank.withdraw((int)lIIIllllIllIl[17], (int)lIIIllllIllIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);
                                    0;
                                    Bank.withdraw((int)lIIIllllIllIl[13], (int)lIIIllllIllIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);
                                    0;
                                    a.b(f.ba, lIIIllllIllIl[1]);
                                    a.a(lIIIllllIllIl[4], lIIIllllIllIl[18]);
                                    a.b(f.bk, lIIIllllIllIl[1]);
                                }
                            }
                        }
                    }
                    if (K.lIlIIlIlllllIIl(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1]) && K.lIlIIlIlllllIII(K.S() ? 1 : 0)) {
                        if (K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[5])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[19]];
                            if (K.lIlIIlIlllllIIl(bY, lIIIllllIllIl[1])) {
                                e.w();
                                bY += lIIIllllIllIl[1];
                            }
                            Movement.walkTo((WorldPoint)hT);
                            0;
                            Time.sleepTicks((int)lIIIllllIllIl[1]);
                            0;
                        }
                        if (K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[9])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[20]];
                            String[] stringArray = new String[lIIIllllIllIl[1]];
                            stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[21]];
                            lllllllllllllllIIIIIIllIIIIlIIll = TileObjects.getNearest((String[])stringArray);
                            if (K.lIlIIlIllllllIl(lllllllllllllllIIIIIIllIIIIlIIll)) {
                                String[] stringArray2 = new String[lIIIllllIllIl[1]];
                                stringArray2[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[18]];
                                if (K.lIlIIlIlllllIII(lllllllllllllllIIIIIIllIIIIlIIll.hasAction(stringArray2) ? 1 : 0) && K.lIlIIlIllllllll(lllllllllllllllIIIIIIllIIIIlIIll.getWorldLocation().distanceTo(hT), lIIIllllIllIl[16])) {
                                    lllllllllllllllIIIIIIllIIIIlIIll.interact(lIIIllllIlIlI[lIIIllllIllIl[22]]);
                                    Time.sleepTicks((int)lIIIllllIllIl[5]);
                                    0;
                                }
                            }
                            g.a(lIIIllllIlIlI[lIIIllllIllIl[23]], hW, lIIIllllIllIl[1]);
                        }
                    }
                    if (!K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) break block51;
                    String[] stringArray = new String[lIIIllllIllIl[1]];
                    stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[24]];
                    if (!K.lIlIIlIlllllIIl(Inventory.getCount((String[])stringArray), lIIIllllIllIl[1])) break block51;
                    String[] stringArray3 = new String[lIIIllllIllIl[1]];
                    stringArray3[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[25]];
                    if (!K.lIlIIllIIIIIIIl(Inventory.getCount((String[])stringArray3))) break block52;
                    String[] stringArray4 = new String[lIIIllllIllIl[1]];
                    stringArray4[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[26]];
                    if (!K.lIlIIlIllllllII(Inventory.getCount((String[])stringArray4))) break block51;
                }
                co = lIIIllllIllIl[0];
                if (K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hU), lIIIllllIllIl[3])) {
                    AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[27]];
                    Movement.walkTo((WorldPoint)hU);
                    0;
                    Time.sleepTicks((int)lIIIllllIllIl[1]);
                    0;
                }
                if (K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hU), lIIIllllIllIl[3])) {
                    String[] stringArray = new String[lIIIllllIllIl[1]];
                    stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[28]];
                    lllllllllllllllIIIIIIllIIIIlIIll = Inventory.getFirst((String[])stringArray);
                    String[] stringArray5 = new String[lIIIllllIllIl[1]];
                    stringArray5[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[29]];
                    Item lllllllllllllllIIIIIIllIIIIlIIlI = Inventory.getFirst((String[])stringArray5);
                    if (K.lIlIIlIllllllIl(lllllllllllllllIIIIIIllIIIIlIIll)) {
                        String[] stringArray6 = new String[lIIIllllIllIl[1]];
                        stringArray6[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[30]];
                        lllllllllllllllIIIIIIllIIIIlIIll.useOn(TileObjects.getNearest((String[])stringArray6));
                        Time.sleepTicks((int)lIIIllllIllIl[3]);
                        0;
                    }
                    if (K.lIlIIlIllllllIl(lllllllllllllllIIIIIIllIIIIlIIlI)) {
                        String[] stringArray7 = new String[lIIIllllIllIl[1]];
                        stringArray7[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[31]];
                        lllllllllllllllIIIIIIllIIIIlIIlI.useOn(TileObjects.getNearest((String[])stringArray7));
                        Time.sleepTicks((int)lIIIllllIllIl[3]);
                        0;
                    }
                    Keyboard.type((String)lIIIllllIlIlI[lIIIllllIllIl[32]]);
                }
            }
            if (K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                String[] stringArray = new String[lIIIllllIllIl[1]];
                stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[33]];
                if (K.lIlIIlIllllllII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray8 = new String[lIIIllllIllIl[1]];
                    stringArray8[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[34]];
                    if (K.lIlIIlIlllllIIl(Inventory.getCount((String[])stringArray8), lIIIllllIllIl[1])) {
                        if (K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hV), lIIIllllIllIl[3])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[35]];
                            Movement.walkTo((WorldPoint)hV);
                            0;
                            Time.sleepTicks((int)lIIIllllIllIl[1]);
                            0;
                        }
                        if (K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hV), lIIIllllIllIl[3])) {
                            String[] stringArray9 = new String[lIIIllllIllIl[1]];
                            stringArray9[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[36]];
                            lllllllllllllllIIIIIIllIIIIlIIll = TileItems.getNearest((String[])stringArray9);
                            if (K.lIlIIllIIIIIIlI(lllllllllllllllIIIIIIllIIIIlIIll)) {
                                String[] stringArray10 = new String[lIIIllllIllIl[1]];
                                stringArray10[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[37]];
                                NPCs.getNearest((String[])stringArray10).interact(lIIIllllIlIlI[lIIIllllIllIl[38]]);
                                Time.sleepTicks((int)lIIIllllIllIl[9]);
                                0;
                            }
                            if (K.lIlIIlIllllllIl(lllllllllllllllIIIIIIllIIIIlIIll)) {
                                lllllllllllllllIIIIIIllIIIIlIIll.interact(lIIIllllIlIlI[lIIIllllIllIl[39]]);
                                Time.sleepTicks((int)lIIIllllIllIl[3]);
                                0;
                            }
                        }
                    }
                }
            }
            if (K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                String[] stringArray = new String[lIIIllllIllIl[1]];
                stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[40]];
                if (K.lIlIIlIllllllII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray11 = new String[lIIIllllIllIl[1]];
                    stringArray11[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[41]];
                    if (K.lIlIIlIllllllII(Inventory.getCount((String[])stringArray11))) {
                        if (K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[5])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[42]];
                            Movement.walkTo((WorldPoint)hT);
                            0;
                            Time.sleepTicks((int)lIIIllllIllIl[1]);
                            0;
                        }
                        if (K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[9])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[43]];
                            g.a(lIIIllllIlIlI[lIIIllllIllIl[44]], hW, lIIIllllIllIl[1]);
                        }
                    }
                }
            }
            if (K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[3])) {
                String[] stringArray = new String[lIIIllllIllIl[1]];
                stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[45]];
                lllllllllllllllIIIIIIllIIIIlIIll = TileObjects.getNearest((String[])stringArray);
                if (K.lIlIIlIllllllIl(lllllllllllllllIIIIIIllIIIIlIIll)) {
                    String[] stringArray12 = new String[lIIIllllIllIl[1]];
                    stringArray12[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[46]];
                    if (K.lIlIIlIlllllIII(lllllllllllllllIIIIIIllIIIIlIIll.hasAction(stringArray12) ? 1 : 0)) {
                        if (K.lIlIIlIlllllIIl(co, lIIIllllIllIl[1])) {
                            P.ll += lIIIllllIllIl[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIllllIllIl[1];
                            P.ll = lIIIllllIllIl[0];
                            cp = lIIIllllIllIl[0];
                        }
                        lllllllllllllllIIIIIIllIIIIlIIll.interact(lIIIllllIlIlI[lIIIllllIllIl[47]]);
                        Time.sleepTicks((int)lIIIllllIllIl[5]);
                        0;
                    }
                }
                g.a(hW);
            }
            if (K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[5]) && K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[41])) {
                int[] nArray = new int[lIIIllllIllIl[1]];
                nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[13];
                if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIllllIllIl[1]];
                    nArray3[K.lIIIllllIllIl[0]] = lIIIllllIllIl[13];
                    Inventory.getFirst((int[])nArray3).interact(lIIIllllIlIlI[lIIIllllIllIl[48]]);
                    Time.sleepTicks((int)lIIIllllIllIl[16]);
                    0;
                }
            }
            g.a(new String[lIIIllllIllIl[0]]);
            System.out.println("Setting: " + e.j(lIIIllllIllIl[7]));
        }
    }

    private static void lIlIIlIllllIllI() {
        lIIIllllIllIl = new int[66];
        K.lIIIllllIllIl[0] = (0x17 ^ 0x3E) & ~(0x32 ^ 0x1B);
        K.lIIIllllIllIl[1] = 1;
        K.lIIIllllIllIl[2] = 8 ^ 0x4E;
        K.lIIIllllIllIl[3] = 2;
        K.lIIIllllIllIl[4] = 0xFFFFAFFB & 0x517F;
        K.lIIIllllIllIl[5] = 3;
        K.lIIIllllIllIl[6] = 0xFFFF8FF7 & 0x73EB;
        K.lIIIllllIllIl[7] = 0xA5 ^ 0xBA ^ (0xE7 ^ 0xBB);
        K.lIIIllllIllIl[8] = 0x71 ^ 0 ^ (0x25 ^ 0x50);
        K.lIIIllllIllIl[9] = 1 ^ 4;
        K.lIIIllllIllIl[10] = 0xFFFFDBCE & 0x37B9;
        K.lIIIllllIllIl[11] = 0xFFFFBDF7 & 0x4A5E;
        K.lIIIllllIllIl[12] = 0xFFFFBB51 & 0x75FF;
        K.lIIIllllIllIl[13] = 0xFFFFBFE7 & 0x5F5F;
        K.lIIIllllIllIl[14] = 185 + 27 - 102 + 111;
        K.lIIIllllIllIl[15] = 0xFFFFE7BD & 0x1FE7;
        K.lIIIllllIllIl[16] = 0x38 ^ 0x3E;
        K.lIIIllllIllIl[17] = -(39 + 132 - 109 + 71) & (0xFFFFBFED & 0x5FDF);
        K.lIIIllllIllIl[18] = 0xA3 ^ 0xA9;
        K.lIIIllllIllIl[19] = 0x61 ^ 0x66;
        K.lIIIllllIllIl[20] = 0x22 ^ 0x2A;
        K.lIIIllllIllIl[21] = 0 ^ 0x6C ^ (3 ^ 0x66);
        K.lIIIllllIllIl[22] = 0x1E ^ 0x2A ^ (6 ^ 0x39);
        K.lIIIllllIllIl[23] = 0xF4 ^ 0x91 ^ (2 ^ 0x6B);
        K.lIIIllllIllIl[24] = 5 + 135 - 28 + 43 ^ 81 + 24 - 26 + 71;
        K.lIIIllllIllIl[25] = 0x8B ^ 0x85;
        K.lIIIllllIllIl[26] = 0xB7 ^ 0xB8;
        K.lIIIllllIllIl[27] = 0x78 ^ 0x68;
        K.lIIIllllIllIl[28] = 0x9A ^ 0x8B;
        K.lIIIllllIllIl[29] = 0x6E ^ 2 ^ (0x5D ^ 0x23);
        K.lIIIllllIllIl[30] = 0x93 ^ 0x80;
        K.lIIIllllIllIl[31] = 0xB7 ^ 0xA3;
        K.lIIIllllIllIl[32] = 0xAE ^ 0xBB;
        K.lIIIllllIllIl[33] = 0xB2 ^ 0xA4;
        K.lIIIllllIllIl[34] = 0xBD ^ 0xB8 ^ (0x6E ^ 0x7C);
        K.lIIIllllIllIl[35] = 0xC7 ^ 0xB4 ^ (0xC4 ^ 0xAF);
        K.lIIIllllIllIl[36] = 0x14 ^ 0x6C ^ (0x2C ^ 0x4D);
        K.lIIIllllIllIl[37] = 0x74 ^ 0x6E;
        K.lIIIllllIllIl[38] = 3 ^ (0x8E ^ 0x96);
        K.lIIIllllIllIl[39] = 0x5D ^ 0x40 ^ 1;
        K.lIIIllllIllIl[40] = 127 + 110 - 205 + 96 ^ 59 + 153 - 71 + 16;
        K.lIIIllllIllIl[41] = 0x93 ^ 0x8D;
        K.lIIIllllIllIl[42] = 0x5A ^ 0x45;
        K.lIIIllllIllIl[43] = 0x63 ^ 0x29 ^ (0xDB ^ 0xB1);
        K.lIIIllllIllIl[44] = 178 + 128 - 280 + 153 ^ 87 + 24 - 41 + 76;
        K.lIIIllllIllIl[45] = 0x34 ^ 0x16;
        K.lIIIllllIllIl[46] = 126 + 54 - 101 + 69 ^ 94 + 131 - 145 + 103;
        K.lIIIllllIllIl[47] = 0xB4 ^ 0xC2 ^ (0xC0 ^ 0x92);
        K.lIIIllllIllIl[48] = 0x39 ^ 0x72 ^ (0xDE ^ 0xB0);
        K.lIIIllllIllIl[49] = 0xFFFFFFCE & 0x173D;
        K.lIIIllllIllIl[50] = -(0xFFFFF262 & 0x5D9F) & (0xFFFFFEDD & 0x7FEF);
        K.lIIIllllIllIl[51] = -(0xFFFFB7DC & 0x5E67) & (0xFFFFF7FB & 0x7FEF);
        K.lIIIllllIllIl[52] = 0xFFFFCFFC & 0x376F;
        K.lIIIllllIllIl[53] = 0xDF ^ 0xAF ^ (0x49 ^ 0x11);
        K.lIIIllllIllIl[54] = 5 ^ 0x61;
        K.lIIIllllIllIl[55] = 0x46 ^ 0x60;
        K.lIIIllllIllIl[56] = 0xB1 ^ 0x96;
        K.lIIIllllIllIl[57] = 0xFFFFFBBD & 0xFDA;
        K.lIIIllllIllIl[58] = 0xFFFF8ED7 & 0x7DAD;
        K.lIIIllllIllIl[59] = 0xFFFF8F9B & 0x7BFD;
        K.lIIIllllIllIl[60] = 0xFFFFBDAB & 0x4EDF;
        K.lIIIllllIllIl[61] = 0xFFFF8F9F & 0x7BED;
        K.lIIIllllIllIl[62] = 0xFFFFBD87 & 0x4EFB;
        K.lIIIllllIllIl[63] = 42 + 61 - 75 + 103 ^ 115 + 144 - 235 + 146;
        K.lIIIllllIllIl[64] = 0x36 ^ 0x52 ^ (0x7B ^ 0x35);
        K.lIIIllllIllIl[65] = 0xCB ^ 0xC3 ^ (0x90 ^ 0xB3);
    }

    @Override
    public String Z() {
        return lIIIllllIlIlI[lIIIllllIllIl[55]];
    }

    private static boolean lIlIIlIlllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIIIIIIlI(Object object) {
        return object == null;
    }

    private static String lIlIIlIlllIIlIl(String lllllllllllllllIIIIIIlIllllIlIlI, String lllllllllllllllIIIIIIlIllllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlIllllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlIllllIlIll.getBytes(StandardCharsets.UTF_8)), lIIIllllIllIl[20]), "DES");
            Cipher lllllllllllllllIIIIIIlIllllIlllI = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIlIllllIlllI.init(lIIIllllIllIl[3], lllllllllllllllIIIIIIlIllllIllll);
            return new String(lllllllllllllllIIIIIIlIllllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIlIllllIllIl) {
            lllllllllllllllIIIIIIlIllllIllIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean aa() {
        int n2;
        if (K.lIlIIllIIIIIIll(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[5]) && K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[41])) {
            n2 = lIIIllllIllIl[1];
            0;
            if (((28 + 18 - 31 + 206 ^ 42 + 58 - 41 + 96) & (0xD6 ^ 0x85 ^ (0x7A ^ 0x6F) ^ -1)) != 0) {
                return ((0x5E ^ 0x2B ^ (0xF2 ^ 0xB5)) & (0x8F ^ 0x88 ^ (0x96 ^ 0xA3) ^ -1)) != 0;
            }
        } else {
            n2 = lIIIllllIllIl[0];
        }
        return n2 != 0;
    }

    @Override
    public boolean X() {
        return lIIIllllIllIl[0];
    }

    static {
        K.lIlIIlIllllIllI();
        K.lIlIIlIlllIlIll();
        hT = new WorldPoint(lIIIllllIllIl[57], lIIIllllIllIl[58], lIIIllllIllIl[0]);
        hU = new WorldPoint(lIIIllllIllIl[59], lIIIllllIllIl[60], lIIIllllIllIl[0]);
        hV = new WorldPoint(lIIIllllIllIl[61], lIIIllllIllIl[62], lIIIllllIllIl[0]);
        String[] stringArray = new String[lIIIllllIllIl[5]];
        stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[53]];
        stringArray[K.lIIIllllIllIl[1]] = lIIIllllIlIlI[lIIIllllIllIl[63]];
        stringArray[K.lIIIllllIllIl[3]] = lIIIllllIlIlI[lIIIllllIllIl[64]];
        hW = stringArray;
        bA = new ArrayList<d>();
        bY = lIIIllllIllIl[0];
    }

    private static boolean lIlIIlIlllllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIllllllIl(Object object) {
        return object != null;
    }

    private static String lIlIIlIlllIIlII(String lllllllllllllllIIIIIIlIlllllllII, String lllllllllllllllIIIIIIllIIIIIIIII) {
        lllllllllllllllIIIIIIlIlllllllII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIlllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIlIlllllllll = new StringBuilder();
        char[] lllllllllllllllIIIIIIlIllllllllI = lllllllllllllllIIIIIIllIIIIIIIII.toCharArray();
        int lllllllllllllllIIIIIIlIlllllllIl = lIIIllllIllIl[0];
        char[] lllllllllllllllIIIIIIlIlllllIlll = lllllllllllllllIIIIIIlIlllllllII.toCharArray();
        int lllllllllllllllIIIIIIlIlllllIllI = lllllllllllllllIIIIIIlIlllllIlll.length;
        int lllllllllllllllIIIIIIlIlllllIlIl = lIIIllllIllIl[0];
        while (K.lIlIIlIlllllIIl(lllllllllllllllIIIIIIlIlllllIlIl, lllllllllllllllIIIIIIlIlllllIllI)) {
            char lllllllllllllllIIIIIIllIIIIIIIlI = lllllllllllllllIIIIIIlIlllllIlll[lllllllllllllllIIIIIIlIlllllIlIl];
            lllllllllllllllIIIIIIlIlllllllll.append((char)(lllllllllllllllIIIIIIllIIIIIIIlI ^ lllllllllllllllIIIIIIlIllllllllI[lllllllllllllllIIIIIIlIlllllllIl % lllllllllllllllIIIIIIlIllllllllI.length]));
            0;
            ++lllllllllllllllIIIIIIlIlllllllIl;
            ++lllllllllllllllIIIIIIlIlllllIlIl;
            0;
            if ((0x6A ^ 0x17 ^ (0x21 ^ 0x58)) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIIlIlllllllll);
    }

    @Override
    public int Y() {
        try {
            K.cz();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0x7D ^ 0x41) & ~(0x91 ^ 0xAD);
        }
        return lIIIllllIllIl[54];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIllllIllIl[1]];
        nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[14];
        if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllllIllIl[1]];
            nArray2[K.lIIIllllIllIl[0]] = lIIIllllIllIl[11];
            if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIllllIllIl[1]];
                nArray3[K.lIIIllllIllIl[0]] = lIIIllllIllIl[15];
                if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIllllIllIl[1];
                    0;
                    if (3 == 3) return n2 != 0;
                    return ((0x62 ^ 3) & ~(0xA2 ^ 0xC3)) != 0;
                }
            }
        }
        n2 = lIIIllllIllIl[0];
        return n2 != 0;
    }

    private static void W() {
        d lllllllllllllllIIIIIIllIIIIIlllI;
        Object lllllllllllllllIIIIIIllIIIIIllll;
        int[] nArray = new int[lIIIllllIllIl[1]];
        nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[15];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIllllIllIl[15], lIIIllllIllIl[1], lIIIllllIllIl[49]);
            bA.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIllllIllIl[1]];
        nArray2[K.lIIIllllIllIl[0]] = lIIIllllIllIl[11];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllIIIIIIllIIIIIllll = new d(lIIIllllIllIl[11], lIIIllllIllIl[1], lIIIllllIllIl[49]);
            bA.add((d)lllllllllllllllIIIIIIllIIIIIllll);
            0;
        }
        int[] nArray3 = new int[lIIIllllIllIl[1]];
        nArray3[K.lIIIllllIllIl[0]] = lIIIllllIllIl[14];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllIIIIIIllIIIIIllll = new d(lIIIllllIllIl[14], lIIIllllIllIl[1], lIIIllllIllIl[49]);
            bA.add((d)lllllllllllllllIIIIIIllIIIIIllll);
            0;
        }
        if (K.lIlIIlIlllllIlI(Bank.contains((Predicate)(lllllllllllllllIIIIIIllIIIIIllll = item -> item.getName().toLowerCase().contains(lIIIllllIlIlI[lIIIllllIllIl[56]]))) ? 1 : 0)) {
            lllllllllllllllIIIIIIllIIIIIlllI = new d(lIIIllllIllIl[50], lIIIllllIllIl[9], lIIIllllIllIl[51]);
            bA.add(lllllllllllllllIIIIIIllIIIIIlllI);
            0;
        }
        int[] nArray4 = new int[lIIIllllIllIl[1]];
        nArray4[K.lIIIllllIllIl[0]] = lIIIllllIllIl[17];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllIIIIIIllIIIIIlllI = new d(lIIIllllIllIl[17], lIIIllllIllIl[18], lIIIllllIllIl[52]);
            bA.add(lllllllllllllllIIIIIIllIIIIIlllI);
            0;
        }
        int[] nArray5 = new int[lIIIllllIllIl[1]];
        nArray5[K.lIIIllllIllIl[0]] = lIIIllllIllIl[13];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllIIIIIIllIIIIIlllI = new d(lIIIllllIllIl[13], lIIIllllIllIl[53], lIIIllllIllIl[52]);
            bA.add(lllllllllllllllIIIIIIllIIIIIlllI);
            0;
        }
        int[] nArray6 = new int[lIIIllllIllIl[1]];
        nArray6[K.lIIIllllIllIl[0]] = lIIIllllIllIl[12];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllIIIIIIllIIIIIlllI = new d(lIIIllllIllIl[12], lIIIllllIllIl[9], h.bv);
            bA.add(lllllllllllllllIIIIIIllIIIIIlllI);
            0;
        }
    }

    private static String lIlIIlIlllIIIll(String lllllllllllllllIIIIIIlIlllIlllIl, String lllllllllllllllIIIIIIlIlllIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlIllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlIlllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIlIllllIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIlIllllIIIIl.init(lIIIllllIllIl[3], lllllllllllllllIIIIIIlIllllIIIlI);
            return new String(lllllllllllllllIIIIIIlIllllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIlIllllIIIII) {
            lllllllllllllllIIIIIIlIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIlllllIll(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIIlIllllllII(int n2) {
        return n2 > 0;
    }

    private static void lIlIIlIlllIlIll() {
        lIIIllllIlIlI = new String[lIIIllllIllIl[65]];
        K.lIIIllllIlIlI[K.lIIIllllIllIl[0]] = K."Buying items";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[1]] = K."Finished buying items, switching back to quest";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[3]] = K."Drink";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[5]] = K."Eat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[8]] = K."Nav to bank";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[9]] = K."Handling banking";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[16]] = K."We are missing quest supplies, switching to BUYING";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[19]] = K."Nav to start";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[20]] = K."Starting quest";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[21]] = K."Door";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[18]] = K."Open";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[22]] = K."Open";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[23]] = K."Hetty";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[24]] = K."Burnt meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[25]] = K."Raw rat meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[26]] = K."Cooked meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[27]] = K."Nav to range";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[28]] = K."Raw rat meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[29]] = K."Cooked meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[30]] = K."Range";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[31]] = K."Range";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[32]] = K." ";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[33]] = K."Burnt meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[34]] = K."Rat's tail";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[35]] = K."Nav to rat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[36]] = K."Rat's tail";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[37]] = K."Rat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[38]] = K."Attack";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[39]] = K."Take";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[40]] = K."Burnt meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[41]] = K."Rat's tail";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[42]] = K."Nav to start";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[43]] = K."Starting quest";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[44]] = K."Hetty";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[45]] = K."Cauldron";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[46]] = K."Drink From";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[47]] = K."Drink From";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[48]] = K."Break";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[55]] = K."Witches potion quest";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[56]] = K."ring of wealth (";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[53]] = K."I am in search of a quest.";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[63]] = K."Yes, help me become one with my darker side.";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[64]] = K."Yes.";
    }

    private static boolean lIlIIllIIIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIlllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlllllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIllIIIIIIIl(int n2) {
        return n2 <= 0;
    }

    private static int lIlIIlIllllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIlIllllllll(int n2, int n3) {
        return n2 <= n3;
    }
}

