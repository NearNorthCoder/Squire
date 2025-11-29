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
 *  net.unethicalite.api.widgets.Dialog
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
import net.unethicalite.api.widgets.Dialog;

public class F
implements M {
    public static final /* synthetic */ WorldPoint hn;
    public static /* synthetic */ List<d> bA;
    static /* synthetic */ int co;
    public static final /* synthetic */ WorldPoint hk;
    static /* synthetic */ int bY;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ WorldPoint hl;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ String[] bW;
    private static /* synthetic */ int[] lIIIlllIlIllI;
    private static /* synthetic */ String[] lIIIlllIlIlII;
    public static final /* synthetic */ WorldPoint hm;

    private static boolean lIlIIlIIlIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIIlIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIIlIIlIIlIIl() {
        lIIIlllIlIlII = new String[lIIIlllIlIllI[75]];
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[0]] = F."Buying items";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[1]] = F."Finished buying items, switching back to quest";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[3]] = F."Drink";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[6]] = F."Nav to bank";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[7]] = F."Handling banking";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[10]] = F."We are missing quest supplies, switching to BUYING";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[14]] = F."Nav to romeo";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[15]] = F."Starting quest";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[13]] = F."Romeo";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[16]] = F."Wear";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[12]] = F."Nav to juliet";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[17]] = F."Talk to juliet";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[18]] = F."Open";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[19]] = F."Juliet";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[21]] = F."Nav to romeo";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[22]] = F."Starting quest";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[23]] = F."Romeo";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[25]] = F."Nav to father";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[26]] = F."talk father";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[27]] = F."Father Lawrence";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[20]] = F."Nav to potion guy";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[29]] = F."talk potions";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[30]] = F."Apothecary";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[31]] = F."Cadava potion";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[32]] = F."Nav to potion guy";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[33]] = F."Cadava potion";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[34]] = F."talk potions";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[35]] = F."Apothecary";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[36]] = F."Cadava potion";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[37]] = F."Wear";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[24]] = F."Nav to juliet";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[38]] = F."Talk to juliet";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[39]] = F."Open";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[40]] = F."Juliet";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[42]] = F."Nav to romeo";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[43]] = F."Finishing quest";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[44]] = F."Romeo";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[45]] = F."Nav to bank";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[46]] = F."Handling banking";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[47]] = F."We are missing quest supplies, switching to BUYING";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[28]] = F."Romeo & Juliet quest";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[54]] = F."ring of wealth (";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[55]] = F."Door";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[58]] = F."Open";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[59]] = F."Door";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[60]] = F."Open";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[69]] = F."Yes, I have seen her actually!";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[70]] = F."Yes, ok, I'll let her know.";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[71]] = F."Ok, thanks.";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[72]] = F."Talk about something else.";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[2]] = F."Talk about Romeo & Juliet.";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[73]] = F."Ok, thanks.";
        F.lIIIlllIlIlII[F.lIIIlllIlIllI[74]] = F."Yes.";
    }

    private static boolean lIlIIlIIlIIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    public static void cm() {
        block52: {
            BankLocation lllllllllllllllIIIIIlIlIlIlllIlI;
            block54: {
                block53: {
                    if (F.lIlIIlIIlIIlIll(by ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[0]];
                        b.a(bA);
                        if (F.lIlIIlIIlIIllII(bA.size(), lIIIlllIlIllI[1])) {
                            System.out.println(lIIIlllIlIlII[lIIIlllIlIllI[1]]);
                            by = lIIIlllIlIllI[0];
                        }
                    }
                    if (!F.lIlIIlIIlIIllIl(by ? 1 : 0)) break block52;
                    if (F.lIlIIlIIlIIlIll(Inventory.contains((int[])f.ba) ? 1 : 0) && F.lIlIIlIIlIIllII(Movement.getRunEnergy(), lIIIlllIlIllI[2])) {
                        Inventory.getFirst((int[])f.ba).interact(lIIIlllIlIlII[lIIIlllIlIllI[3]]);
                        Time.sleepTicks((int)lIIIlllIlIllI[1]);
                        0;
                    }
                    if (F.lIlIIlIIlIIllIl(Movement.isRunEnabled() ? 1 : 0) && F.lIlIIlIIlIIlllI(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!F.lIlIIlIIlIIlIll(F.S() ? 1 : 0)) break block53;
                    int[] nArray = new int[lIIIlllIlIllI[1]];
                    nArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIllI[4];
                    if (!F.lIlIIlIIlIIlllI(Inventory.getCount((int[])nArray))) break block54;
                }
                if (F.lIlIIlIIlIIllII(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[1])) {
                    lllllllllllllllIIIIIlIlIlIlllIlI = BankLocation.getNearest();
                    if (F.lIlIIlIIlIIllll(lllllllllllllllIIIIIlIlIlIlllIlI) && F.lIlIIlIIlIIllIl(lllllllllllllllIIIIIlIlIlIlllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[6]];
                        a.a(lllllllllllllllIIIIIlIlIlIlllIlI);
                        Time.sleepTicks((int)lIIIlllIlIllI[3]);
                        0;
                    }
                    if (F.lIlIIlIIlIIllll(lllllllllllllllIIIIIlIlIlIlllIlI) && F.lIlIIlIIlIIlIll(lllllllllllllllIIIIIlIlIlIlllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[7]];
                        if (F.lIlIIlIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlIllI[8]);
                            0;
                        }
                        if (F.lIlIIlIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                            if (F.lIlIIlIIlIIlllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlllIlIllI[7]);
                                0;
                            }
                            if (F.lIlIIlIIlIIlllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlllIlIllI[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIlllIlIllI[1]];
                            nArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
                            if (F.lIlIIlIIlIIllIl(e.b(nArray) ? 1 : 0)) {
                                F.W();
                                System.out.println(lIIIlllIlIlII[lIIIlllIlIllI[10]]);
                                by = lIIIlllIlIllI[1];
                                return;
                            }
                            int[] nArray2 = new int[lIIIlllIlIllI[1]];
                            nArray2[F.lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
                            if (F.lIlIIlIIlIIlIll(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIIIlllIlIllI[9], lIIIlllIlIllI[1]);
                                a.b(f.ba, lIIIlllIlIllI[3]);
                                a.a(lIIIlllIlIllI[11], lIIIlllIlIllI[12]);
                                a.b(f.bk, lIIIlllIlIllI[1]);
                            }
                        }
                    }
                }
            }
            if (F.lIlIIlIIlIIlIll(F.S() ? 1 : 0) && F.lIlIIlIIlIIllII(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[1])) {
                if (F.lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[14]];
                    if (F.lIlIIlIIlIIllII(bY, lIIIlllIlIllI[1])) {
                        e.w();
                        bY += lIIIlllIlIllI[1];
                    }
                    Movement.walkTo((WorldPoint)hk);
                    0;
                    Time.sleepTicks((int)lIIIlllIlIllI[1]);
                    0;
                }
                if (F.lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[15]];
                    g.a(lIIIlllIlIlII[lIIIlllIlIllI[13]], bW);
                }
            }
            if (F.lIlIIlIIlIlIIlI(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[12])) {
                if (F.lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hl), lIIIlllIlIllI[3])) {
                    if (F.lIlIIlIIlIIlIll(Inventory.contains((int[])f.bk) ? 1 : 0) && F.lIlIIlIIlIIllIl(Equipment.contains((int[])f.bk) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.bk).interact(lIIIlllIlIlII[lIIIlllIlIllI[16]]);
                        Time.sleepTicks((int)lIIIlllIlIllI[1]);
                        0;
                    }
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[12]];
                    Movement.walkTo((WorldPoint)hl);
                    0;
                    Time.sleepTicks((int)lIIIlllIlIllI[1]);
                    0;
                }
                if (F.lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hl), lIIIlllIlIllI[3])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[17]];
                    lllllllllllllllIIIIIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (F.lIlIIlIIlIIlIll(tileObject.getName().contains(lIIIlllIlIlII[lIIIlllIlIllI[59]]) ? 1 : 0) && F.lIlIIlIIlIlIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllIlIllI[56], lIIIlllIlIllI[57], lIIIlllIlIllI[1])), lIIIlllIlIllI[3])) {
                            String[] stringArray = new String[lIIIlllIlIllI[1]];
                            stringArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[60]];
                            if (F.lIlIIlIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIIlllIlIllI[1];
                                0;
                                if (-3 <= 0) return n2 != 0;
                                return ((0xD8 ^ 0x80) & ~(6 ^ 0x5E)) != 0;
                            }
                        }
                        n2 = lIIIlllIlIllI[0];
                        return n2 != 0;
                    });
                    if (F.lIlIIlIIlIIllll(lllllllllllllllIIIIIlIlIlIlllIlI)) {
                        lllllllllllllllIIIIIlIlIlIlllIlI.interact(lIIIlllIlIlII[lIIIlllIlIllI[18]]);
                        Time.sleepTicks((int)lIIIlllIlIllI[6]);
                        0;
                    }
                    g.a(lIIIlllIlIlII[lIIIlllIlIllI[19]], bW);
                }
            }
            if (F.lIlIIlIIlIlIIlI(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[20])) {
                if (F.lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[21]];
                    Movement.walkTo((WorldPoint)hk);
                    0;
                    Time.sleepTicks((int)lIIIlllIlIllI[1]);
                    0;
                }
                if (F.lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[22]];
                    g.a(lIIIlllIlIlII[lIIIlllIlIllI[23]], bW);
                }
            }
            if (F.lIlIIlIIlIlIIlI(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[24])) {
                if (F.lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hm), lIIIlllIlIllI[10])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[25]];
                    Movement.walkTo((WorldPoint)hm);
                    0;
                    Time.sleepTicks((int)lIIIlllIlIllI[1]);
                    0;
                }
                if (F.lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hm), lIIIlllIlIllI[10])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[26]];
                    g.a(lIIIlllIlIlII[lIIIlllIlIllI[27]], bW);
                }
                g.a(bW);
            }
            if (F.lIlIIlIIlIlIIlI(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[28])) {
                if (F.lIlIIlIIlIIllIl(F.S() ? 1 : 0)) {
                    F.bm();
                }
                if (F.lIlIIlIIlIIlIll(F.S() ? 1 : 0)) {
                    if (F.lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[20]];
                        Movement.walkTo((WorldPoint)hn);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIllI[1]);
                        0;
                    }
                    if (F.lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[29]];
                        g.a(lIIIlllIlIlII[lIIIlllIlIllI[30]], bW);
                    }
                }
            }
            if (F.lIlIIlIIlIlIIlI(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[2])) {
                String[] stringArray = new String[lIIIlllIlIllI[1]];
                stringArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[31]];
                if (F.lIlIIlIIlIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0) && F.lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                    if (F.lIlIIlIIlIIllIl(F.S() ? 1 : 0)) {
                        F.bm();
                    }
                    if (F.lIlIIlIIlIIlIll(F.S() ? 1 : 0) && F.lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[32]];
                        Movement.walkTo((WorldPoint)hn);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIllI[1]);
                        0;
                    }
                }
            }
            if (F.lIlIIlIIlIlIIlI(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[2])) {
                String[] stringArray = new String[lIIIlllIlIllI[1]];
                stringArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[33]];
                if (F.lIlIIlIIlIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0) && F.lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                    co = lIIIlllIlIllI[0];
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[34]];
                    g.a(lIIIlllIlIlII[lIIIlllIlIllI[35]], bW);
                }
            }
            if (F.lIlIIlIIlIlIIlI(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[2])) {
                String[] stringArray = new String[lIIIlllIlIllI[1]];
                stringArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[36]];
                if (F.lIlIIlIIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (F.lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hl), lIIIlllIlIllI[3])) {
                        if (F.lIlIIlIIlIIlIll(Inventory.contains((int[])f.bk) ? 1 : 0) && F.lIlIIlIIlIIllIl(Equipment.contains((int[])f.bk) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bk).interact(lIIIlllIlIlII[lIIIlllIlIllI[37]]);
                            Time.sleepTicks((int)lIIIlllIlIllI[1]);
                            0;
                        }
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[24]];
                        Movement.walkTo((WorldPoint)hl);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIllI[1]);
                        0;
                    }
                    if (F.lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hl), lIIIlllIlIllI[3])) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[38]];
                        lllllllllllllllIIIIIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (F.lIlIIlIIlIIlIll(tileObject.getName().contains(lIIIlllIlIlII[lIIIlllIlIllI[55]]) ? 1 : 0) && F.lIlIIlIIlIlIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllIlIllI[56], lIIIlllIlIllI[57], lIIIlllIlIllI[1])), lIIIlllIlIllI[3])) {
                                String[] stringArray = new String[lIIIlllIlIllI[1]];
                                stringArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[58]];
                                if (F.lIlIIlIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIlllIlIllI[1];
                                    0;
                                    if (3 != (0xB5 ^ 0x87 ^ (0xAB ^ 0x9D))) return n2 != 0;
                                    return ((165 + 149 - 202 + 65 ^ 109 + 45 - 100 + 91) & (0x3B ^ 0x75 ^ (0xE ^ 0x60) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIIlllIlIllI[0];
                            return n2 != 0;
                        });
                        if (F.lIlIIlIIlIIllll(lllllllllllllllIIIIIlIlIlIlllIlI)) {
                            lllllllllllllllIIIIIlIlIlIlllIlI.interact(lIIIlllIlIlII[lIIIlllIlIllI[39]]);
                            Time.sleepTicks((int)lIIIlllIlIllI[6]);
                            0;
                        }
                        g.a(lIIIlllIlIlII[lIIIlllIlIllI[40]], bW);
                    }
                    g.a(bW);
                }
            }
            if (F.lIlIIlIIlIlIIlI(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[41])) {
                if (F.lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13]) && F.lIlIIlIIlIIllIl(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[42]];
                    Movement.walkTo((WorldPoint)hk);
                    0;
                    Time.sleepTicks((int)lIIIlllIlIllI[1]);
                    0;
                }
                if (F.lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[43]];
                    if (F.lIlIIlIIlIIllII(co, lIIIlllIlIllI[1])) {
                        P.lq += lIIIlllIlIllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllIlIllI[1];
                        P.lq = lIIIlllIlIllI[0];
                        cp = lIIIlllIlIllI[0];
                    }
                    g.a(lIIIlllIlIlII[lIIIlllIlIllI[44]], bW);
                    Time.sleepTicks((int)lIIIlllIlIllI[10]);
                    0;
                }
            }
            g.a(bW);
            System.out.println("Setting: " + e.j(lIIIlllIlIllI[5]));
        }
    }

    private static boolean lIlIIlIIlIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String Z() {
        return lIIIlllIlIlII[lIIIlllIlIllI[28]];
    }

    private static String lIlIIlIIlIIIlII(String lllllllllllllllIIIIIlIlIlIIIIIIl, String lllllllllllllllIIIIIlIlIlIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIlIlIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIlIlIIIIIII.getBytes(StandardCharsets.UTF_8)), lIIIlllIlIllI[13]), "DES");
            Cipher lllllllllllllllIIIIIlIlIlIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlIlIlIIIIIll.init(lIIIlllIlIllI[3], lllllllllllllllIIIIIlIlIlIIIIlII);
            return new String(lllllllllllllllIIIIIlIlIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlIlIlIIIIIlI) {
            lllllllllllllllIIIIIlIlIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIlIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIIlIIllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (F.lIlIIlIIlIlIIll(e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[53])) {
            bl = lIIIlllIlIllI[1];
            0;
            if ((0xA6 ^ 0xA2) == ((0x88 ^ 0xB9) & ~(0xB7 ^ 0x86))) {
                return (3 & ~3) != 0;
            }
        } else {
            bl = lIIIlllIlIllI[0];
        }
        return bl;
    }

    private static String lIlIIlIIlIIIlIl(String lllllllllllllllIIIIIlIlIlIIIllII, String lllllllllllllllIIIIIlIlIlIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIlIlIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIlIlIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlIlIlIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlIlIlIIlIIII.init(lIIIlllIlIllI[3], lllllllllllllllIIIIIlIlIlIIlIIIl);
            return new String(lllllllllllllllIIIIIlIlIlIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlIlIlIIIllll) {
            lllllllllllllllIIIIIlIlIlIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIIllll(Object object) {
        return object != null;
    }

    @Override
    public boolean X() {
        return lIIIlllIlIllI[0];
    }

    private static void lIlIIlIIlIIlIlI() {
        lIIIlllIlIllI = new int[76];
        F.lIIIlllIlIllI[0] = (0xD3 ^ 0xC6) & ~(0 ^ 0x15);
        F.lIIIlllIlIllI[1] = 1;
        F.lIIIlllIlIllI[2] = 0xA1 ^ 0x93;
        F.lIIIlllIlIllI[3] = 2;
        F.lIIIlllIlIllI[4] = 0xFFFFEFF7 & 0x13EB;
        F.lIIIlllIlIllI[5] = 22 + 46 - -13 + 63;
        F.lIIIlllIlIllI[6] = 3;
        F.lIIIlllIlIllI[7] = 1 ^ (0xC5 ^ 0xC0);
        F.lIIIlllIlIllI[8] = 0xFFFFB7FA & 0x5B8D;
        F.lIIIlllIlIllI[9] = -(0xFFFFFDDF & 0x632B) & (0xFFFFEBFB & 0x77FF);
        F.lIIIlllIlIllI[10] = 0x89 ^ 0x8C;
        F.lIIIlllIlIllI[11] = -(0xFFFFF3ED & 0x2C9B) & (0xFFFFBFCF & Short.MAX_VALUE);
        F.lIIIlllIlIllI[12] = 112 + 99 - 184 + 152 ^ 150 + 114 - 183 + 104;
        F.lIIIlllIlIllI[13] = 0x21 ^ 0x6C ^ (0xF0 ^ 0xB5);
        F.lIIIlllIlIllI[14] = 88 + 51 - 53 + 43 ^ 82 + 29 - 36 + 60;
        F.lIIIlllIlIllI[15] = 0x24 ^ 0x18 ^ (0x56 ^ 0x6D);
        F.lIIIlllIlIllI[16] = 0xC7 ^ 0x87 ^ (0x5A ^ 0x13);
        F.lIIIlllIlIllI[17] = 0x3E ^ 0x58 ^ (0xF8 ^ 0x95);
        F.lIIIlllIlIllI[18] = 0x26 ^ 0x2A;
        F.lIIIlllIlIllI[19] = 29 + 143 - 63 + 47 ^ 31 + 11 - -81 + 22;
        F.lIIIlllIlIllI[20] = 0 + 11 - -64 + 73 ^ 0 + 53 - -74 + 1;
        F.lIIIlllIlIllI[21] = 0x1A ^ 0x14;
        F.lIIIlllIlIllI[22] = 0x47 ^ 0x64 ^ (0x4A ^ 0x66);
        F.lIIIlllIlIllI[23] = 0x71 ^ 0x19 ^ (0x7A ^ 2);
        F.lIIIlllIlIllI[24] = 0x76 ^ 0x46 ^ (0x60 ^ 0x4E);
        F.lIIIlllIlIllI[25] = 0xA0 ^ 0xB1;
        F.lIIIlllIlIllI[26] = 0x6F ^ 0x7D;
        F.lIIIlllIlIllI[27] = 0xA ^ 0x19;
        F.lIIIlllIlIllI[28] = 0x6F ^ 0x47;
        F.lIIIlllIlIllI[29] = 55 + 148 - 169 + 119 ^ 18 + 42 - -72 + 8;
        F.lIIIlllIlIllI[30] = 0x88 ^ 0x9E;
        F.lIIIlllIlIllI[31] = 0xD5 ^ 0xC2;
        F.lIIIlllIlIllI[32] = 0x78 ^ 0x60;
        F.lIIIlllIlIllI[33] = 0xB5 ^ 0xAC;
        F.lIIIlllIlIllI[34] = 0xDD ^ 0xC7;
        F.lIIIlllIlIllI[35] = 24 + 41 - -120 + 2 ^ 109 + 48 - 134 + 137;
        F.lIIIlllIlIllI[36] = 0xE8 ^ 0xC4 ^ (0x51 ^ 0x61);
        F.lIIIlllIlIllI[37] = 0x9C ^ 0x81;
        F.lIIIlllIlIllI[38] = 0xD3 ^ 0x85 ^ (0x8D ^ 0xC4);
        F.lIIIlllIlIllI[39] = 0x75 ^ 9 ^ (0xC8 ^ 0x94);
        F.lIIIlllIlIllI[40] = 0x15 ^ 0x34;
        F.lIIIlllIlIllI[41] = 110 + 52 - 18 + 14 ^ 85 + 43 - 41 + 75;
        F.lIIIlllIlIllI[42] = 0x2D ^ 0x58 ^ (0xC5 ^ 0x92);
        F.lIIIlllIlIllI[43] = 6 ^ 0x60 ^ (0x2A ^ 0x6F);
        F.lIIIlllIlIllI[44] = 10 + 41 - -115 + 19 ^ 18 + 14 - -34 + 91;
        F.lIIIlllIlIllI[45] = 0x39 ^ 9 ^ (0x15 ^ 0);
        F.lIIIlllIlIllI[46] = 0x79 ^ 0x5F;
        F.lIIIlllIlIllI[47] = 0x4E ^ 0x63 ^ (0xF ^ 5);
        F.lIIIlllIlIllI[48] = -(0xFFFFCFF9 & 0x7E87) & (0xFFFFFFFF & 0x7FD1);
        F.lIIIlllIlIllI[49] = 0xFFFFF70F & 0x1FFC;
        F.lIIIlllIlIllI[50] = -(0xFFFFF37F & 0x5DB2) & (0xFFFFFFFD & Short.MAX_VALUE);
        F.lIIIlllIlIllI[51] = -(0xFFFFDED7 & 0x3D7F) & (0xFFFFFDFE & Short.MAX_VALUE);
        F.lIIIlllIlIllI[52] = 0xFFFFEFEC & 0x177F;
        F.lIIIlllIlIllI[53] = 145 + 74 - 90 + 68 ^ 89 + 51 - 49 + 70;
        F.lIIIlllIlIllI[54] = 167 + 88 - 213 + 128 ^ 70 + 77 - 117 + 101;
        F.lIIIlllIlIllI[55] = 0x9C ^ 0xBD ^ (0x68 ^ 0x63);
        F.lIIIlllIlIllI[56] = -(0xFFFFBE9B & 0x53ED) & (0xFFFFFFFE & 0x1EDF);
        F.lIIIlllIlIllI[57] = -(0xFFFFFFBF & 0x72DE) & (0xFFFFFFFF & Short.MAX_VALUE);
        F.lIIIlllIlIllI[58] = 27 + 80 - 16 + 95 ^ 120 + 118 - 186 + 93;
        F.lIIIlllIlIllI[59] = 0x72 ^ 0x5E;
        F.lIIIlllIlIllI[60] = 0x47 ^ 0x6A;
        F.lIIIlllIlIllI[61] = -(0xFFFFD63E & 0x79F5) & (0xFFFFFFFF & 0x5CBF);
        F.lIIIlllIlIllI[62] = -(0xFFFFFBC7 & 0x363D) & (0xFFFFFFF7 & 0x3F6C);
        F.lIIIlllIlIllI[63] = 0xFFFFFFF7 & 0xC5D;
        F.lIIIlllIlIllI[64] = -(0xFFFFC53D & 0x7ADF) & (0xFFFFEFFD & 0x5D7F);
        F.lIIIlllIlIllI[65] = -(0xFFFFBBDB & 0x566D) & (0xFFFF9EFF & Short.MAX_VALUE);
        F.lIIIlllIlIllI[66] = 0xFFFF8DFC & 0x7F9F;
        F.lIIIlllIlIllI[67] = -(0xFFFFE2A3 & 0x3F5D) & (0xFFFFAE7B & Short.MAX_VALUE);
        F.lIIIlllIlIllI[68] = -(0xFFFFE373 & 0x5EAD) & (0xFFFFFFFC & 0x4F6F);
        F.lIIIlllIlIllI[69] = 0xBA ^ 0x94;
        F.lIIIlllIlIllI[70] = 0xB9 ^ 0x96;
        F.lIIIlllIlIllI[71] = 0x80 ^ 0x96 ^ (0x1F ^ 0x39);
        F.lIIIlllIlIllI[72] = 0x7B ^ 0x6C ^ (0x72 ^ 0x54);
        F.lIIIlllIlIllI[73] = 0x22 ^ 0x11;
        F.lIIIlllIlIllI[74] = 0x8D ^ 0xA1 ^ (0x2C ^ 0x34);
        F.lIIIlllIlIllI[75] = 0xF7 ^ 0xC2;
    }

    private static String lIlIIlIIlIIIIll(String lllllllllllllllIIIIIlIlIlIIllllI, String lllllllllllllllIIIIIlIlIlIIlllIl) {
        lllllllllllllllIIIIIlIlIlIIllllI = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlIlIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIlIlIlIlIIIIl = new StringBuilder();
        char[] lllllllllllllllIIIIIlIlIlIlIIIII = lllllllllllllllIIIIIlIlIlIIlllIl.toCharArray();
        int lllllllllllllllIIIIIlIlIlIIlllll = lIIIlllIlIllI[0];
        char[] lllllllllllllllIIIIIlIlIlIIllIIl = lllllllllllllllIIIIIlIlIlIIllllI.toCharArray();
        int lllllllllllllllIIIIIlIlIlIIllIII = lllllllllllllllIIIIIlIlIlIIllIIl.length;
        int lllllllllllllllIIIIIlIlIlIIlIlll = lIIIlllIlIllI[0];
        while (F.lIlIIlIIlIIllII(lllllllllllllllIIIIIlIlIlIIlIlll, lllllllllllllllIIIIIlIlIlIIllIII)) {
            char lllllllllllllllIIIIIlIlIlIlIIlII = lllllllllllllllIIIIIlIlIlIIllIIl[lllllllllllllllIIIIIlIlIlIIlIlll];
            lllllllllllllllIIIIIlIlIlIlIIIIl.append((char)(lllllllllllllllIIIIIlIlIlIlIIlII ^ lllllllllllllllIIIIIlIlIlIlIIIII[lllllllllllllllIIIIIlIlIlIIlllll % lllllllllllllllIIIIIlIlIlIlIIIII.length]));
            0;
            ++lllllllllllllllIIIIIlIlIlIIlllll;
            ++lllllllllllllllIIIIIlIlIlIIlIlll;
            0;
            if ((0xD ^ 9) >= ((0x4B ^ 0x75) & ~(0x5D ^ 0x63))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIlIlIlIlIIIIl);
    }

    static {
        F.lIlIIlIIlIIlIlI();
        F.lIlIIlIIlIIlIIl();
        hk = new WorldPoint(lIIIlllIlIllI[61], lIIIlllIlIllI[62], lIIIlllIlIllI[0]);
        hl = new WorldPoint(lIIIlllIlIllI[63], lIIIlllIlIllI[64], lIIIlllIlIllI[1]);
        hm = new WorldPoint(lIIIlllIlIllI[65], lIIIlllIlIllI[66], lIIIlllIlIllI[0]);
        hn = new WorldPoint(lIIIlllIlIllI[67], lIIIlllIlIllI[68], lIIIlllIlIllI[0]);
        String[] stringArray = new String[lIIIlllIlIllI[15]];
        stringArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[69]];
        stringArray[F.lIIIlllIlIllI[1]] = lIIIlllIlIlII[lIIIlllIlIllI[70]];
        stringArray[F.lIIIlllIlIllI[3]] = lIIIlllIlIlII[lIIIlllIlIllI[71]];
        stringArray[F.lIIIlllIlIllI[6]] = lIIIlllIlIlII[lIIIlllIlIllI[72]];
        stringArray[F.lIIIlllIlIllI[7]] = lIIIlllIlIlII[lIIIlllIlIllI[2]];
        stringArray[F.lIIIlllIlIllI[10]] = lIIIlllIlIlII[lIIIlllIlIllI[73]];
        stringArray[F.lIIIlllIlIllI[14]] = lIIIlllIlIlII[lIIIlllIlIllI[74]];
        bW = stringArray;
        bA = new ArrayList<d>();
        bY = lIIIlllIlIllI[0];
    }

    private static boolean S() {
        int[] nArray = new int[lIIIlllIlIllI[1]];
        nArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
        return Inventory.contains((int[])nArray);
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void lllllllllllllllIIIIIlIlIlIlllIII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (F.lIlIIlIIlIIllll(bankLocation) && F.lIlIIlIIlIIllIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[45]];
            a.a(bankLocation);
            Time.sleepTicks((int)lIIIlllIlIllI[3]);
            0;
        }
        if (F.lIlIIlIIlIIllll(lllllllllllllllIIIIIlIlIlIlllIII) && F.lIlIIlIIlIIlIll(lllllllllllllllIIIIIlIlIlIlllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[46]];
            if (F.lIlIIlIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlIllI[8]);
                0;
            }
            if (F.lIlIIlIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                if (F.lIlIIlIIlIIlllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIlllIlIllI[7]);
                    0;
                }
                if (F.lIlIIlIIlIIlllI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIlllIlIllI[3]);
                    0;
                }
                int[] nArray = new int[lIIIlllIlIllI[1]];
                nArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
                if (F.lIlIIlIIlIIllIl(e.b(nArray) ? 1 : 0)) {
                    F.W();
                    System.out.println(lIIIlllIlIlII[lIIIlllIlIllI[47]]);
                    by = lIIIlllIlIllI[1];
                    return;
                }
                int[] nArray2 = new int[lIIIlllIlIllI[1]];
                nArray2[F.lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
                if (F.lIlIIlIIlIIlIll(e.b(nArray2) ? 1 : 0)) {
                    a.a(lIIIlllIlIllI[9], lIIIlllIlIllI[1]);
                    a.b(f.ba, lIIIlllIlIllI[3]);
                    a.a(lIIIlllIlIllI[11], lIIIlllIlIllI[12]);
                    a.b(f.bk, lIIIlllIlIllI[1]);
                }
            }
        }
    }

    private static void W() {
        d lllllllllllllllIIIIIlIlIlIllIlII;
        Object lllllllllllllllIIIIIlIlIlIllIlIl;
        int[] nArray = new int[lIIIlllIlIllI[1]];
        nArray[F.lIIIlllIlIllI[0]] = lIIIlllIlIllI[48];
        if (F.lIlIIlIIlIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIlllIlIllI[48], lIIIlllIlIllI[10], h.bv);
            bA.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIlllIlIllI[1]];
        nArray2[F.lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
        if (F.lIlIIlIIlIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllIIIIIlIlIlIllIlIl = new d(lIIIlllIlIllI[9], lIIIlllIlIllI[1], lIIIlllIlIllI[49]);
            bA.add((d)lllllllllllllllIIIIIlIlIlIllIlIl);
            0;
        }
        if (F.lIlIIlIIlIIllIl(Bank.contains(lllllllllllllllIIIIIlIlIlIllIlIl = item -> item.getName().toLowerCase().contains(lIIIlllIlIlII[lIIIlllIlIllI[54]])) ? 1 : 0)) {
            lllllllllllllllIIIIIlIlIlIllIlII = new d(lIIIlllIlIllI[50], lIIIlllIlIllI[10], lIIIlllIlIllI[51]);
            bA.add(lllllllllllllllIIIIIlIlIlIllIlII);
            0;
        }
        int[] nArray3 = new int[lIIIlllIlIllI[1]];
        nArray3[F.lIIIlllIlIllI[0]] = lIIIlllIlIllI[11];
        if (F.lIlIIlIIlIIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllIIIIIlIlIlIllIlII = new d(lIIIlllIlIllI[11], lIIIlllIlIllI[20], lIIIlllIlIllI[52]);
            bA.add(lllllllllllllllIIIIIlIlIlIllIlII);
            0;
        }
    }

    @Override
    public int Y() {
        try {
            F.cm();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x47 ^ 0x14) & ~(0x23 ^ 0x70)) >= (0x29 ^ 0x2D)) {
            return (0x1B ^ 0x59) & ~(0xEB ^ 0xA9);
        }
        return lIIIlllIlIllI[53];
    }
}

