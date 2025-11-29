/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class R
implements W {
    public static final /* synthetic */ String[] jH;
    private static /* synthetic */ String[] lIlIIlIll;
    private static final /* synthetic */ WorldPoint jJ;
    static /* synthetic */ boolean cm;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int bT;
    static /* synthetic */ int cl;
    private static final /* synthetic */ WorldPoint jI;
    private static final /* synthetic */ WorldPoint jK;
    private static /* synthetic */ int[] lIlIIllIl;
    private static final /* synthetic */ WorldPoint jL;

    public static void cU() {
        if (R.lIIIllIIIIlI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[0]];
            b.a(bv);
            if (R.lIIIllIIIIll(bv.size(), lIlIIllIl[1])) {
                System.out.println(lIlIIlIll[lIlIIllIl[1]]);
                bt = lIlIIllIl[0];
            }
        }
        if (R.lIIIllIIIlII(bt ? 1 : 0)) {
            NPC lllIllIlIIlIlI;
            BankLocation lllIllIlIIlIll;
            if (R.lIIIllIIIIlI(Inventory.contains((int[])f.aV) ? 1 : 0) && R.lIIIllIIIIll(Movement.getRunEnergy(), lIlIIllIl[2])) {
                Inventory.getFirst((int[])f.aV).interact(lIlIIlIll[lIlIIllIl[3]]);
                Time.sleepTicks((int)lIlIIllIl[1]);
                0;
            }
            if (R.lIIIllIIIlIl(R.lIIIllIIIIIl(e.u(), 70.0))) {
                int[] nArray = new int[lIlIIllIl[1]];
                nArray[R.lIlIIllIl[0]] = lIlIIllIl[4];
                if (R.lIIIllIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIlIIllIl[1]];
                    nArray2[R.lIlIIllIl[0]] = lIlIIllIl[4];
                    Inventory.getFirst((int[])nArray2).interact(lIlIIlIll[lIlIIllIl[5]]);
                }
            }
            if (R.lIIIllIIIlII(Movement.isRunEnabled() ? 1 : 0) && R.lIIIllIIIllI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (R.lIIIllIIIlII(R.ab() ? 1 : 0) && R.lIIIllIIIIll(e.j(lIlIIllIl[6]), lIlIIllIl[1])) {
                lllIllIlIIlIll = BankLocation.getNearest();
                if (R.lIIIllIIIlll(lllIllIlIIlIll) && R.lIIIllIIIlII(lllIllIlIIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[7]];
                    a.a(lllIllIlIIlIll);
                    Time.sleepTicks((int)lIlIIllIl[3]);
                    0;
                }
                if (R.lIIIllIIIlll(lllIllIlIIlIll) && R.lIIIllIIIIlI(lllIllIlIIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[8]];
                    if (R.lIIIllIIIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIllIl[9]);
                        0;
                    }
                    if (R.lIIIllIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (R.lIIIllIIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlIIllIl[7]);
                            0;
                        }
                        if (R.lIIIllIIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlIIllIl[3]);
                            0;
                        }
                        int[] nArray = new int[lIlIIllIl[8]];
                        nArray[R.lIlIIllIl[0]] = lIlIIllIl[10];
                        nArray[R.lIlIIllIl[1]] = lIlIIllIl[11];
                        nArray[R.lIlIIllIl[3]] = lIlIIllIl[12];
                        nArray[R.lIlIIllIl[5]] = lIlIIllIl[13];
                        nArray[R.lIlIIllIl[7]] = lIlIIllIl[4];
                        if (R.lIIIllIIIlII(e.b(nArray) ? 1 : 0)) {
                            R.af();
                            System.out.println(lIlIIlIll[lIlIIllIl[14]]);
                            bt = lIlIIllIl[1];
                            return;
                        }
                        Bank.withdraw((int)lIlIIllIl[11], (int)lIlIIllIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIIllIl[1]);
                        0;
                        Bank.withdraw((int)lIlIIllIl[13], (int)lIlIIllIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIIllIl[1]);
                        0;
                        Bank.withdraw((int)lIlIIllIl[10], (int)lIlIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIIllIl[1]);
                        0;
                        a.b(f.aV, lIlIIllIl[1]);
                        a.a(lIlIIllIl[4], lIlIIllIl[15]);
                        a.b(f.bf, lIlIIllIl[1]);
                    }
                }
            }
            if (R.lIIIllIIIIlI(R.ab() ? 1 : 0) && R.lIIIllIIIIll(e.j(lIlIIllIl[6]), lIlIIllIl[1])) {
                lllIllIlIIlIll = new WorldArea(lIlIIllIl[16], lIlIIllIl[17], lIlIIllIl[18], lIlIIllIl[19], lIlIIllIl[0]);
                String[] stringArray = new String[lIlIIllIl[1]];
                stringArray[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[20]];
                lllIllIlIIlIlI = NPCs.getNearest((String[])stringArray);
                if (R.lIIIllIIlIII(lllIllIlIIlIlI) && R.lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jI), lIlIIllIl[5]) && R.lIIIllIIIlII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[18]];
                    if (R.lIIIllIIIIll(bT, lIlIIllIl[1])) {
                        e.v();
                        bT += lIlIIllIl[1];
                    }
                    Movement.walkTo((WorldPoint)jI);
                    0;
                    Time.sleepTicks((int)lIlIIllIl[1]);
                    0;
                }
                if (R.lIIIllIIIlll(lllIllIlIIlIlI)) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[21]];
                    g.a(lIlIIlIll[lIlIIllIl[15]], jH, lIlIIllIl[1]);
                }
            }
            if (R.lIIIllIIlIlI(e.j(lIlIIllIl[6]), lIlIIllIl[1])) {
                if (R.lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jJ), lIlIIllIl[14])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[19]];
                    Movement.walkTo((WorldPoint)jJ);
                    0;
                    Time.sleepTicks((int)lIlIIllIl[1]);
                    0;
                }
                if (R.lIIIllIIlIll(Players.getLocal().getWorldLocation().distanceTo(jJ), lIlIIllIl[14])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[22]];
                    String[] stringArray = new String[lIlIIllIl[1]];
                    stringArray[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[23]];
                    lllIllIlIIlIll = TileObjects.getNearest((String[])stringArray);
                    if (R.lIIIllIIIlll(lllIllIlIIlIll)) {
                        String[] stringArray2 = new String[lIlIIllIl[1]];
                        stringArray2[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[24]];
                        if (R.lIIIllIIIIlI(lllIllIlIIlIll.hasAction(stringArray2) ? 1 : 0)) {
                            lllIllIlIIlIll.interact(lIlIIlIll[lIlIIllIl[25]]);
                            Time.sleepTicks((int)lIlIIllIl[8]);
                            0;
                        }
                    }
                    g.a(lIlIIlIll[lIlIIllIl[26]], jH);
                }
            }
            if (R.lIIIllIIlIlI(e.j(lIlIIllIl[6]), lIlIIllIl[3])) {
                if (R.lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jK), lIlIIllIl[3])) {
                    int[] nArray = new int[lIlIIllIl[1]];
                    nArray[R.lIlIIllIl[0]] = lIlIIllIl[27];
                    if (R.lIIIllIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIlIIllIl[1]];
                        nArray3[R.lIlIIllIl[0]] = lIlIIllIl[27];
                        Inventory.getFirst((int[])nArray3).interact(lIlIIlIll[lIlIIllIl[28]]);
                        Time.sleepTicks((int)lIlIIllIl[1]);
                        0;
                    }
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[29]];
                    Movement.walkTo((WorldPoint)jK);
                    0;
                    Time.sleepTicks((int)lIlIIllIl[1]);
                    0;
                }
                if (R.lIIIllIIlIll(Players.getLocal().getWorldLocation().distanceTo(jK), lIlIIllIl[3])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[30]];
                    String[] stringArray = new String[lIlIIllIl[1]];
                    stringArray[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[31]];
                    lllIllIlIIlIll = NPCs.getNearest((String[])stringArray);
                    if (R.lIIIllIIIlll(lllIllIlIIlIll)) {
                        g.a(lIlIIlIll[lIlIIllIl[32]], jH);
                    }
                    if (R.lIIIllIIlIII(lllIllIlIIlIll)) {
                        String[] stringArray3 = new String[lIlIIllIl[1]];
                        stringArray3[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lIlIIlIll[lIlIIllIl[34]]);
                        Time.sleepTicks((int)lIlIIllIl[3]);
                        0;
                    }
                }
            }
            if (R.lIIIllIIlIlI(e.j(lIlIIllIl[6]), lIlIIllIl[5])) {
                cl = lIlIIllIl[0];
                if (R.lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jL), lIlIIllIl[5])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[35]];
                    Movement.walkTo((WorldPoint)jL);
                    0;
                    Time.sleepTicks((int)lIlIIllIl[1]);
                    0;
                }
                if (R.lIIIllIIlIll(Players.getLocal().getWorldLocation().distanceTo(jL), lIlIIllIl[5])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[36]];
                    String[] stringArray = new String[lIlIIllIl[1]];
                    stringArray[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[37]];
                    lllIllIlIIlIll = TileObjects.getNearest((String[])stringArray);
                    if (R.lIIIllIIIlll(lllIllIlIIlIll)) {
                        lllIllIlIIlIll.interact(lIlIIlIll[lIlIIllIl[38]]);
                    }
                }
            }
            if (R.lIIIllIIlIlI(e.j(lIlIIllIl[6]), lIlIIllIl[7])) {
                if (R.lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jK), lIlIIllIl[3])) {
                    int[] nArray = new int[lIlIIllIl[1]];
                    nArray[R.lIlIIllIl[0]] = lIlIIllIl[27];
                    if (R.lIIIllIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lIlIIllIl[1]];
                        nArray4[R.lIlIIllIl[0]] = lIlIIllIl[27];
                        Inventory.getFirst((int[])nArray4).interact(lIlIIlIll[lIlIIllIl[39]]);
                        Time.sleepTicks((int)lIlIIllIl[1]);
                        0;
                    }
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[40]];
                    Movement.walkTo((WorldPoint)jK);
                    0;
                    Time.sleepTicks((int)lIlIIllIl[1]);
                    0;
                }
                if (R.lIIIllIIlIll(Players.getLocal().getWorldLocation().distanceTo(jK), lIlIIllIl[3])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[41]];
                    String[] stringArray = new String[lIlIIllIl[1]];
                    stringArray[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[42]];
                    lllIllIlIIlIll = TileObjects.getNearest((String[])stringArray);
                    if (R.lIIIllIIIlll(lllIllIlIIlIll)) {
                        String[] stringArray4 = new String[lIlIIllIl[1]];
                        stringArray4[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[43]];
                        if (R.lIIIllIIIIlI(lllIllIlIIlIll.hasAction(stringArray4) ? 1 : 0)) {
                            lllIllIlIIlIll.interact(lIlIIlIll[lIlIIllIl[44]]);
                            Time.sleepTicks((int)lIlIIllIl[3]);
                            0;
                        }
                        String[] stringArray5 = new String[lIlIIllIl[1]];
                        stringArray5[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[45]];
                        lllIllIlIIlIlI = Inventory.getFirst((String[])stringArray5);
                        if (R.lIIIllIIIlll(lllIllIlIIlIlI)) {
                            if (R.lIIIllIIIIll(cl, lIlIIllIl[1])) {
                                an.pF += lIlIIllIl[1];
                                an.o(AccBuilderEasyClues.m);
                                cl += lIlIIllIl[1];
                                an.pF = lIlIIllIl[0];
                                cm = lIlIIllIl[0];
                            }
                            lllIllIlIIlIlI.useOn((TileObject)lllIllIlIIlIll);
                            Time.sleepTicks((int)lIlIIllIl[5]);
                            0;
                        }
                    }
                }
                g.a(jH);
            }
            g.a(new String[lIlIIllIl[0]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIlIIllIl[1]];
        nArray[R.lIlIIllIl[0]] = lIlIIllIl[11];
        if (R.lIIIllIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0) && (!R.lIIIllIIIlII(Inventory.contains((int[])f.aR) ? 1 : 0) || R.lIIIllIIIIlI(Equipment.contains((int[])f.aR) ? 1 : 0)) && R.lIIIllIIIIlI(Inventory.contains((int[])f.aV) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIIllIl[1]];
            nArray2[R.lIlIIllIl[0]] = lIlIIllIl[13];
            if (R.lIIIllIIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIlIIllIl[1]];
                nArray3[R.lIlIIllIl[0]] = lIlIIllIl[4];
                if (R.lIIIllIIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIlIIllIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x80 ^ 0xB6) & ~(0x88 ^ 0xBE)) != 0;
                }
            }
        }
        n2 = lIlIIllIl[0];
        return n2 != 0;
    }

    private static void af() {
        d lllIllIlIIIllI;
        Object lllIllIlIIIlll;
        int[] nArray = new int[lIlIIllIl[1]];
        nArray[R.lIlIIllIl[0]] = lIlIIllIl[10];
        if (R.lIIIllIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIIllIl[10], lIlIIllIl[1], lIlIIllIl[46]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIIllIl[1]];
        nArray2[R.lIlIIllIl[0]] = lIlIIllIl[4];
        if (R.lIIIllIIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIllIlIIIlll = new d(lIlIIllIl[4], lIlIIllIl[15], lIlIIllIl[47]);
            bv.add((d)lllIllIlIIIlll);
            0;
        }
        if (R.lIIIllIIIlII(Bank.contains(lllIllIlIIIlll = item -> item.getName().toLowerCase().contains(lIlIIlIll[lIlIIllIl[53]])) ? 1 : 0)) {
            lllIllIlIIIllI = new d(lIlIIllIl[48], lIlIIllIl[8], lIlIIllIl[49]);
            bv.add(lllIllIlIIIllI);
            0;
        }
        int[] nArray3 = new int[lIlIIllIl[1]];
        nArray3[R.lIlIIllIl[0]] = lIlIIllIl[11];
        if (R.lIIIllIIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIllIlIIIllI = new d(lIlIIllIl[11], lIlIIllIl[15], lIlIIllIl[50]);
            bv.add(lllIllIlIIIllI);
            0;
        }
        int[] nArray4 = new int[lIlIIllIl[1]];
        nArray4[R.lIlIIllIl[0]] = lIlIIllIl[13];
        if (R.lIIIllIIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIllIlIIIllI = new d(lIlIIllIl[13], lIlIIllIl[31], lIlIIllIl[50]);
            bv.add(lllIllIlIIIllI);
            0;
        }
        int[] nArray5 = new int[lIlIIllIl[1]];
        nArray5[R.lIlIIllIl[0]] = lIlIIllIl[12];
        if (R.lIIIllIIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllIllIlIIIllI = new d(lIlIIllIl[12], lIlIIllIl[8], i.bq);
            bv.add(lllIllIlIIIllI);
            0;
        }
    }

    private static boolean lIIIllIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIllIIIllI(int n2) {
        return n2 > 0;
    }

    private static void lIIIllIIIIII() {
        lIlIIllIl = new int[75];
        R.lIlIIllIl[0] = (0xB8 ^ 0x8D ^ 24 + 64 - -9 + 30) & (0xFE ^ 0xAD ^ (0x40 ^ 0x59) ^ -1);
        R.lIlIIllIl[1] = 1;
        R.lIlIIllIl[2] = 0x7F ^ 0x2F ^ (0xBC ^ 0xAA);
        R.lIlIIllIl[3] = 2;
        R.lIlIIllIl[4] = 0xFFFFCFFF & 0x317B;
        R.lIlIIllIl[5] = 3;
        R.lIlIIllIl[6] = 0xA ^ 0x4D ^ (0x8D ^ 0xA1);
        R.lIlIIllIl[7] = 0xEB ^ 0x98 ^ (0x3D ^ 0x4A);
        R.lIlIIllIl[8] = 0x29 ^ 0x2C;
        R.lIlIIllIl[9] = 0xFFFF9BDD & 0x77AA;
        R.lIlIIllIl[10] = -(0xFFFFF31F & 0x5DF6) & (0xFFFFFFFF & 0x7FDF);
        R.lIlIIllIl[11] = -(0xFFFFA6A7 & 0x797F) & (0xFFFFFF6E & 0x3FFF);
        R.lIlIIllIl[12] = 0xFFFFFDFF & 0x3351;
        R.lIlIIllIl[13] = 0xFFFF9FEF & 0x7F57;
        R.lIlIIllIl[14] = 0xB9 ^ 0xBF;
        R.lIlIIllIl[15] = 0x3A ^ 0x28 ^ (0x87 ^ 0x9F);
        R.lIlIIllIl[16] = -(0xFFFFD351 & 0x7DBF) & (0xFFFFFDBB & 0x5FFC);
        R.lIlIIllIl[17] = -(0xFFFFA37F & 0x7FE2) & (0xFFFFAFED & 0x7FF7);
        R.lIlIIllIl[18] = 0xCF ^ 0xC7;
        R.lIlIIllIl[19] = 0xBA ^ 0xB1;
        R.lIlIIllIl[20] = 0x40 ^ 0x47;
        R.lIlIIllIl[21] = 0x11 ^ 7 ^ (0x23 ^ 0x3C);
        R.lIlIIllIl[22] = 0x6A ^ 0x5A ^ (0x80 ^ 0xBC);
        R.lIlIIllIl[23] = 0x1A ^ 0 ^ (0x51 ^ 0x46);
        R.lIlIIllIl[24] = 95 + 80 - 117 + 77 ^ 115 + 83 - 104 + 43;
        R.lIlIIllIl[25] = 6 ^ 0x15 ^ (0xA3 ^ 0xBF);
        R.lIlIIllIl[26] = 0x76 ^ 0x66;
        R.lIlIIllIl[27] = -(0xFFFFF6F7 & 0x7DDF) & (0xFFFFFEFF & 0x77FE);
        R.lIlIIllIl[28] = 4 ^ 0x77 ^ (0x32 ^ 0x50);
        R.lIlIIllIl[29] = 0x72 ^ 0x20 ^ (7 ^ 0x47);
        R.lIlIIllIl[30] = 0x97 ^ 0x8B ^ (0x31 ^ 0x3E);
        R.lIlIIllIl[31] = 97 + 152 - 228 + 145 ^ 157 + 48 - 45 + 18;
        R.lIlIIllIl[32] = 66 + 177 - 82 + 26 ^ 38 + 20 - 21 + 137;
        R.lIlIIllIl[33] = 0xBE ^ 0xA8;
        R.lIlIIllIl[34] = 57 + 69 - 12 + 22 ^ 77 + 58 - 8 + 32;
        R.lIlIIllIl[35] = 0xB2 ^ 0xAA;
        R.lIlIIllIl[36] = 0x5C ^ 0x51 ^ (0xAE ^ 0xBA);
        R.lIlIIllIl[37] = 0x5D ^ 0x47;
        R.lIlIIllIl[38] = 0x23 ^ 0x38;
        R.lIlIIllIl[39] = 0x8B ^ 0x97;
        R.lIlIIllIl[40] = 0x1C ^ 1;
        R.lIlIIllIl[41] = 96 + 75 - 68 + 83 ^ 57 + 157 - 201 + 151;
        R.lIlIIllIl[42] = 0x9B ^ 0x84;
        R.lIlIIllIl[43] = 1 ^ 0x21;
        R.lIlIIllIl[44] = 0x12 ^ 0x33;
        R.lIlIIllIl[45] = 0xC9 ^ 0xC3 ^ (0x24 ^ 0xC);
        R.lIlIIllIl[46] = -(0xFFFFF7EC & 0x49F7) & (0xFFFFFFFF & Short.MAX_VALUE);
        R.lIlIIllIl[47] = 0xFFFFD78C & 0x3F7F;
        R.lIlIIllIl[48] = 0xFFFFEECD & 0x3FFE;
        R.lIlIIllIl[49] = 0xFFFFF3EB & 0x6DBC;
        R.lIlIIllIl[50] = -(0xFFFF91B1 & 0x7EDF) & (0xFFFFDFFC & 0x37FF);
        R.lIlIIllIl[51] = 0xA9 ^ 0x9D ^ (0xDD ^ 0x8D);
        R.lIlIIllIl[52] = 0 + 159 - -4 + 2 ^ 131 + 108 - 220 + 115;
        R.lIlIIllIl[53] = 0xF8 ^ 0xA6 ^ (0xC5 ^ 0xBF);
        R.lIlIIllIl[54] = 0x90 ^ 0xB5;
        R.lIlIIllIl[55] = 0x51 ^ 0x77;
        R.lIlIIllIl[56] = 0x8F ^ 0xA8;
        R.lIlIIllIl[57] = 0xB6 ^ 0x9E;
        R.lIlIIllIl[58] = 0x1E ^ 0x37;
        R.lIlIIllIl[59] = 0x2A ^ 0x41 ^ (0xDF ^ 0x9E);
        R.lIlIIllIl[60] = 0xA3 ^ 0x88;
        R.lIlIIllIl[61] = 0x54 ^ 7 ^ 48 + 66 - -12 + 1;
        R.lIlIIllIl[62] = 0x15 ^ 0x38;
        R.lIlIIllIl[63] = 0x44 ^ 0x4C ^ (0x4A ^ 0x6C);
        R.lIlIIllIl[64] = 0x22 ^ 0xD;
        R.lIlIIllIl[65] = 0x3D ^ 0xD;
        R.lIlIIllIl[66] = 133 + 44 - 142 + 120 ^ 135 + 131 - 205 + 109;
        R.lIlIIllIl[67] = -(0xFFFFFFEF & 0x7335) & (0xFFFFFFAF & 0x7FFE);
        R.lIlIIllIl[68] = 0xFFFFDE6A & 0x2DDF;
        R.lIlIIllIl[69] = -(0xFFFFEFAE & 0x70D7) & (0xFFFFEEFD & 0x7DEF);
        R.lIlIIllIl[70] = -(0xFFFFFB6F & 0x77D3) & (0xFFFFFFFB & 0x7FF7);
        R.lIlIIllIl[71] = -(0xFFFFDBEF & 0x7615) & (0xFFFFDFFE & 0x7E7F);
        R.lIlIIllIl[72] = -(0xFFFFFFDD & 0x61B3) & (0xFFFFFFFE & 0x6DBF);
        R.lIlIIllIl[73] = -(0xFFFFEEEB & 0x5B15) & (0xFFFFFFFF & 0x6F5E);
        R.lIlIIllIl[74] = 44 + 66 - 107 + 155 ^ 112 + 126 - 67 + 1;
    }

    @Override
    public boolean S() {
        return lIlIIllIl[0];
    }

    private static boolean lIIIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static int lIIIllIIIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIIllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIIIlll(Object object) {
        return object != null;
    }

    private static boolean lIIIllIIlIII(Object object) {
        return object == null;
    }

    private static String lIIIlIlllllI(String lllIllIIIlllll, String lllIllIIIllIIl) {
        lllIllIIIlllll = new String(Base64.getDecoder().decode(lllIllIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIllIIIlllIl = new StringBuilder();
        char[] lllIllIIIlllII = lllIllIIIllIIl.toCharArray();
        int lllIllIIIllIll = lIlIIllIl[0];
        char[] lllIllIIIlIlIl = lllIllIIIlllll.toCharArray();
        int lllIllIIIlIlII = lllIllIIIlIlIl.length;
        int lllIllIIIlIIll = lIlIIllIl[0];
        while (R.lIIIllIIIIll(lllIllIIIlIIll, lllIllIIIlIlII)) {
            char lllIllIIlIIIII = lllIllIIIlIlIl[lllIllIIIlIIll];
            lllIllIIIlllIl.append((char)(lllIllIIlIIIII ^ lllIllIIIlllII[lllIllIIIllIll % lllIllIIIlllII.length]));
            0;
            ++lllIllIIIllIll;
            ++lllIllIIIlIIll;
            0;
            if ((0x4B ^ 0x2B ^ (0xD8 ^ 0xBC)) > 0) continue;
            return null;
        }
        return String.valueOf(lllIllIIIlllIl);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (R.lIIIllIIllII(e.j(lIlIIllIl[6]), lIlIIllIl[8])) {
            bl = lIlIIllIl[1];
            0;
            if (((0x65 ^ 0x2C ^ (0x50 ^ 0x33)) & (7 + 64 - 11 + 79 ^ 7 + 96 - 22 + 80 ^ -1)) >= (0x71 ^ 0x4D ^ (0x62 ^ 0x5A))) {
                return ((0x18 ^ 0x37 ^ (9 ^ 0x2D)) & (69 + 33 - 96 + 134 ^ 80 + 15 - 15 + 55 ^ -1)) != 0;
            }
        } else {
            bl = lIlIIllIl[0];
        }
        return bl;
    }

    private static boolean lIIIllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIllIIIlIl(int n2) {
        return n2 < 0;
    }

    @Override
    public String U() {
        return lIlIIlIll[lIlIIllIl[52]];
    }

    static {
        R.lIIIllIIIIII();
        R.lIIIlIllllll();
        String[] stringArray = new String[lIlIIllIl[23]];
        stringArray[R.lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[54]];
        stringArray[R.lIlIIllIl[1]] = lIlIIlIll[lIlIIllIl[55]];
        stringArray[R.lIlIIllIl[3]] = lIlIIlIll[lIlIIllIl[56]];
        stringArray[R.lIlIIllIl[5]] = lIlIIlIll[lIlIIllIl[57]];
        stringArray[R.lIlIIllIl[7]] = lIlIIlIll[lIlIIllIl[58]];
        stringArray[R.lIlIIllIl[8]] = lIlIIlIll[lIlIIllIl[59]];
        stringArray[R.lIlIIllIl[14]] = lIlIIlIll[lIlIIllIl[60]];
        stringArray[R.lIlIIllIl[20]] = lIlIIlIll[lIlIIllIl[61]];
        stringArray[R.lIlIIllIl[18]] = lIlIIlIll[lIlIIllIl[62]];
        stringArray[R.lIlIIllIl[21]] = lIlIIlIll[lIlIIllIl[63]];
        stringArray[R.lIlIIllIl[15]] = lIlIIlIll[lIlIIllIl[64]];
        stringArray[R.lIlIIllIl[19]] = lIlIIlIll[lIlIIllIl[65]];
        stringArray[R.lIlIIllIl[22]] = lIlIIlIll[lIlIIllIl[66]];
        jH = stringArray;
        jI = new WorldPoint(lIlIIllIl[16], lIlIIllIl[67], lIlIIllIl[0]);
        jJ = new WorldPoint(lIlIIllIl[68], lIlIIllIl[69], lIlIIllIl[0]);
        jK = new WorldPoint(lIlIIllIl[70], lIlIIllIl[71], lIlIIllIl[0]);
        jL = new WorldPoint(lIlIIllIl[72], lIlIIllIl[73], lIlIIllIl[0]);
        bv = new ArrayList<d>();
        bT = lIlIIllIl[0];
    }

    private static boolean lIIIllIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int T() {
        try {
            R.cU();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xB8 ^ 0x8D) & ~(0x51 ^ 0x64)) != 0) {
            return (0x16 ^ 0xC) & ~(0x4D ^ 0x57);
        }
        return lIlIIllIl[51];
    }

    private static boolean lIIIllIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIlIlllIIl(String lllIllIIlIllll, String lllIllIIlIllII) {
        try {
            SecretKeySpec lllIllIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIIlIllII.getBytes(StandardCharsets.UTF_8)), lIlIIllIl[18]), "DES");
            Cipher lllIllIIllIIIl = Cipher.getInstance("DES");
            lllIllIIllIIIl.init(lIlIIllIl[3], lllIllIIllIIlI);
            return new String(lllIllIIllIIIl.doFinal(Base64.getDecoder().decode(lllIllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIIllIIII) {
            lllIllIIllIIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIllllll() {
        lIlIIlIll = new String[lIlIIllIl[74]];
        R.lIlIIlIll[R.lIlIIllIl[0]] = R."Buying items";
        R.lIlIIlIll[R.lIlIIllIl[1]] = R."Finished buying items, switching back to quest";
        R.lIlIIlIll[R.lIlIIllIl[3]] = R."Drink";
        R.lIlIIlIll[R.lIlIIllIl[5]] = R."Eat";
        R.lIlIIlIll[R.lIlIIllIl[7]] = R."Nav to bank";
        R.lIlIIlIll[R.lIlIIllIl[8]] = R."Handling banking";
        R.lIlIIlIll[R.lIlIIllIl[14]] = R."We are missing quest supplies, switching to BUYING";
        R.lIlIIlIll[R.lIlIIllIl[20]] = R."Father Aereck";
        R.lIlIIlIll[R.lIlIIllIl[18]] = R."Nav to start";
        R.lIlIIlIll[R.lIlIIllIl[21]] = R."Starting quest";
        R.lIlIIlIll[R.lIlIIllIl[15]] = R."Father Aereck";
        R.lIlIIlIll[R.lIlIIllIl[19]] = R."Nav to necklace guy";
        R.lIlIIlIll[R.lIlIIllIl[22]] = R."Interacting npc";
        R.lIlIIlIll[R.lIlIIllIl[23]] = R."Door";
        R.lIlIIlIll[R.lIlIIllIl[24]] = R."Open";
        R.lIlIIlIll[R.lIlIIllIl[25]] = R."Open";
        R.lIlIIlIll[R.lIlIIllIl[26]] = R."Father Urhney";
        R.lIlIIlIll[R.lIlIIllIl[28]] = R."Wear";
        R.lIlIIlIll[R.lIlIIllIl[29]] = R."Nav to coffin";
        R.lIlIIlIll[R.lIlIIllIl[30]] = R."Handling coffin";
        R.lIlIIlIll[R.lIlIIllIl[31]] = R."Restless ghost";
        R.lIlIIlIll[R.lIlIIllIl[32]] = R."Restless ghost";
        R.lIlIIlIll[R.lIlIIllIl[33]] = R."Coffin";
        R.lIlIIlIll[R.lIlIIllIl[34]] = R."Open";
        R.lIlIIlIll[R.lIlIIllIl[35]] = R."Nav to skull";
        R.lIlIIlIll[R.lIlIIllIl[36]] = R."Getting skull";
        R.lIlIIlIll[R.lIlIIllIl[37]] = R."Altar";
        R.lIlIIlIll[R.lIlIIllIl[38]] = R."Search";
        R.lIlIIlIll[R.lIlIIllIl[39]] = R."Wear";
        R.lIlIIlIll[R.lIlIIllIl[40]] = R."Nav to coffin";
        R.lIlIIlIll[R.lIlIIllIl[41]] = R."Handling coffin";
        R.lIlIIlIll[R.lIlIIllIl[42]] = R."Coffin";
        R.lIlIIlIll[R.lIlIIllIl[43]] = R."Open";
        R.lIlIIlIll[R.lIlIIllIl[44]] = R."Open";
        R.lIlIIlIll[R.lIlIIllIl[45]] = R."Ghost's skull";
        R.lIlIIlIll[R.lIlIIllIl[52]] = R."Restless ghost quest";
        R.lIlIIlIll[R.lIlIIllIl[53]] = R."ring of wealth (";
        R.lIlIIlIll[R.lIlIIllIl[54]] = R."Ok, I'm up for an adventure.";
        R.lIlIIlIll[R.lIlIIllIl[55]] = R."A glass of your finest ale please.";
        R.lIlIIlIll[R.lIlIIllIl[56]] = R."Morgan needs your help!";
        R.lIlIIlIll[R.lIlIIllIl[57]] = R."Yes.";
        R.lIlIIlIll[R.lIlIIllIl[58]] = R."I'm looking for a quest!";
        R.lIlIIlIll[R.lIlIIllIl[59]] = R."Ok, let me help then.";
        R.lIlIIlIll[R.lIlIIllIl[60]] = R."Father Aereck sent me to talk to you.";
        R.lIlIIlIll[R.lIlIIllIl[61]] = R."He's got a ghost haunting his graveyard.";
        R.lIlIIlIll[R.lIlIIllIl[62]] = R."Yep, now tell me what the problem is.";
        R.lIlIIlIll[R.lIlIIllIl[63]] = R."Sure.";
        R.lIlIIlIll[R.lIlIIllIl[64]] = R."I'm wearing an amulet of ghost speak!";
        R.lIlIIlIll[R.lIlIIllIl[65]] = R."Yes, I'm sure.";
        R.lIlIIlIll[R.lIlIIllIl[66]] = R."How can I help?";
    }

    private static String lIIIlIlllIlI(String lllIllIIlllIlI, String lllIllIIlllIIl) {
        try {
            SecretKeySpec lllIllIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIllIIlllllI = Cipher.getInstance("Blowfish");
            lllIllIIlllllI.init(lIlIIllIl[3], lllIllIIllllll);
            return new String(lllIllIIlllllI.doFinal(Base64.getDecoder().decode(lllIllIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIIllllIl) {
            lllIllIIllllIl.printStackTrace();
            return null;
        }
    }
}

