/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.X;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
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
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class G
implements ab {
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint fw;
    private static /* synthetic */ int[] llllIlIIl;
    public static final /* synthetic */ WorldPoint ft;
    static /* synthetic */ String[] cG;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint fu;
    static /* synthetic */ ArrayList<Integer> fC;
    static /* synthetic */ int dk;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ String[] llllIIlll;
    public static final /* synthetic */ WorldPoint fz;
    public static /* synthetic */ boolean fB;
    public static /* synthetic */ int fb;
    public static final /* synthetic */ WorldPoint fv;
    public static final /* synthetic */ WorldPoint fA;
    public static /* synthetic */ int fc;
    public static final /* synthetic */ WorldPoint fx;
    public static final /* synthetic */ WorldPoint fy;

    private static boolean llIlIIIIllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bL() {
        void lIlllllIIlllI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (G.llIlIIIlIIIl(bankLocation) && G.llIlIIIIllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIIlll[llllIlIIl[136]];
            a.a(bankLocation);
        }
        if (G.llIlIIIlIIIl(lIlllllIIlllI) && G.llIlIIIIllIl(lIlllllIIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (G.llIlIIIIllll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIIl[4]);
                0;
            }
            if (G.llIlIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llllIIlll[llllIlIIl[137]];
                if (G.llIlIIIlIIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIlIIl[6]);
                    0;
                }
                a.a(llllIlIIl[7], llllIlIIl[13]);
                a.a(llllIlIIl[11], llllIlIIl[0]);
                a.a(llllIlIIl[9], llllIlIIl[41]);
            }
        }
    }

    private static boolean llIlIIIlIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIIIllll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        int n2;
        if (G.llIlIIIlIlll(e.j(fb), llllIlIIl[72]) && G.llIlIIIlIlll(e.j(fc), llllIlIIl[3])) {
            n2 = llllIlIIl[0];
            0;
            if (-3 >= 0) {
                return ((0x27 ^ 0x7A) & ~(0xD8 ^ 0x85)) != 0;
            }
        } else {
            n2 = llllIlIIl[1];
        }
        return n2 != 0;
    }

    private static int llIlIIIIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIlIIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bI() {
        if (G.llIlIIIIllIl(bv ? 1 : 0)) {
            b.a(bx);
            if (G.llIlIIIIlllI(bx.size(), llllIlIIl[0])) {
                System.out.println(llllIIlll[llllIlIIl[1]]);
                bv = llllIlIIl[1];
            }
        }
        if (G.llIlIIIIllll(bv ? 1 : 0)) {
            TileObject lIlllllIllIII;
            TileObject lIlllllIllIIl;
            BankLocation lIlllllIllIlI;
            if (G.llIlIIIIlllI(e.j(llllIlIIl[2]), llllIlIIl[3])) {
                X.dJ();
            }
            if (G.llIlIIIIllll(G.bN() ? 1 : 0) && G.llIlIIIIlllI(e.j(fb), llllIlIIl[0]) && G.llIlIIIlIIII(e.j(llllIlIIl[2]), llllIlIIl[3])) {
                lIlllllIllIlI = BankLocation.getNearest();
                if (G.llIlIIIlIIIl(lIlllllIllIlI) && G.llIlIIIIllll(lIlllllIllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[0]];
                    a.a(lIlllllIllIlI);
                }
                if (G.llIlIIIlIIIl(lIlllllIllIlI) && G.llIlIIIIllIl(lIlllllIllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (G.llIlIIIIllll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIIl[4]);
                        0;
                    }
                    if (G.llIlIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[5]];
                        if (G.llIlIIIlIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIlIIl[6]);
                            0;
                        }
                        if (G.llIlIIIlIIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIlIIl[5]);
                            0;
                        }
                        int[] nArray = new int[llllIlIIl[3]];
                        nArray[G.llllIlIIl[1]] = llllIlIIl[7];
                        nArray[G.llllIlIIl[0]] = llllIlIIl[8];
                        nArray[G.llllIlIIl[5]] = llllIlIIl[9];
                        nArray[G.llllIlIIl[10]] = llllIlIIl[11];
                        nArray[G.llllIlIIl[6]] = llllIlIIl[12];
                        if (G.llIlIIIIllll(e.d(nArray) ? 1 : 0)) {
                            G.Q();
                            System.out.println(llllIIlll[llllIlIIl[10]]);
                            bv = llllIlIIl[0];
                            return;
                        }
                        int[] nArray2 = new int[llllIlIIl[3]];
                        nArray2[G.llllIlIIl[1]] = llllIlIIl[7];
                        nArray2[G.llllIlIIl[0]] = llllIlIIl[8];
                        nArray2[G.llllIlIIl[5]] = llllIlIIl[9];
                        nArray2[G.llllIlIIl[10]] = llllIlIIl[11];
                        nArray2[G.llllIlIIl[6]] = llllIlIIl[12];
                        if (G.llIlIIIIllIl(e.d(nArray2) ? 1 : 0)) {
                            a.a(llllIlIIl[7], llllIlIIl[13]);
                            a.a(llllIlIIl[14], llllIlIIl[0]);
                            a.a(llllIlIIl[8], llllIlIIl[0]);
                            a.a(llllIlIIl[11], llllIlIIl[6]);
                            a.a(llllIlIIl[12], llllIlIIl[13]);
                        }
                    }
                }
            }
            if (G.llIlIIIIllIl(Inventory.contains((int[])f.bc) ? 1 : 0) && G.llIlIIIIlllI(Movement.getRunEnergy(), llllIlIIl[15])) {
                Inventory.getFirst((int[])f.bc).interact(llllIIlll[llllIlIIl[6]]);
                Time.sleepTicks((int)llllIlIIl[0]);
                0;
            }
            int[] nArray = new int[llllIlIIl[0]];
            nArray[G.llllIlIIl[1]] = llllIlIIl[12];
            if (G.llIlIIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0) && G.llIlIIIlIIll(G.llIlIIIIllII(e.w(), 60.0))) {
                int[] nArray3 = new int[llllIlIIl[0]];
                nArray3[G.llllIlIIl[1]] = llllIlIIl[12];
                Inventory.getFirst((int[])nArray3).interact(llllIIlll[llllIlIIl[3]]);
                Time.sleepTicks((int)llllIlIIl[0]);
                0;
            }
            if (G.llIlIIIIlllI(e.j(fb), llllIlIIl[0]) && G.llIlIIIIllIl(G.bN() ? 1 : 0)) {
                if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(ft), llllIlIIl[10])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[16]];
                    if (G.llIlIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)ft);
                    0;
                    Time.sleepTicks((int)llllIlIIl[0]);
                    0;
                }
                if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(ft), llllIlIIl[10])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[17]];
                    g.a(llllIIlll[llllIlIIl[18]], cG);
                }
            }
            if (G.llIlIIIlIIII(e.j(fb), llllIlIIl[0])) {
                if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fu), llllIlIIl[5])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[19]];
                    Movement.walkTo((WorldPoint)fu);
                    0;
                    Time.sleepTicks((int)llllIlIIl[0]);
                    0;
                }
                if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fu), llllIlIIl[5])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[13]];
                    if (G.llIlIIIIllll(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llllIlIIl[0]];
                        stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[20]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIIlll[llllIlIIl[21]]);
                    }
                    g.a(cG);
                }
            }
            if (G.llIlIIIlIIII(e.j(fb), llllIlIIl[5])) {
                String[] stringArray = new String[llllIlIIl[0]];
                stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[22]];
                if (G.llIlIIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[23]];
                    String[] stringArray2 = new String[llllIlIIl[0]];
                    stringArray2[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[24]];
                    lIlllllIllIlI = TileObjects.getNearest((String[])stringArray2);
                    if (G.llIlIIIlIIIl(lIlllllIllIlI) && G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((Locatable)lIlllllIllIlI), llllIlIIl[6]) && G.llIlIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        g.a(cG);
                    }
                    if (!G.llIlIIIIllIl(Dialog.isOpen() ? 1 : 0) || G.llIlIIIlIlII(Players.getLocal().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[26], llllIlIIl[1])), llllIlIIl[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llllIlIIl[25], llllIlIIl[26], llllIlIIl[1]));
                        0;
                        Time.sleepTicks((int)llllIlIIl[10]);
                        0;
                    }
                }
                if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[26], llllIlIIl[1])), llllIlIIl[3])) {
                    String[] stringArray3 = new String[llllIlIIl[0]];
                    stringArray3[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[27]];
                    if (G.llIlIIIlIllI(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[llllIlIIl[0]];
                        stringArray4[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[28]];
                        lIlllllIllIlI = TileObjects.getNearest((String[])stringArray4);
                        if (G.llIlIIIlIIIl(lIlllllIllIlI) && G.llIlIIIIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[llllIlIIl[0]];
                            stringArray5[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[29]];
                            if (G.llIlIIIIllIl(lIlllllIllIlI.hasAction(stringArray5) ? 1 : 0)) {
                                lIlllllIllIlI.interact(llllIIlll[llllIlIIl[30]]);
                                Time.sleepTicks((int)llllIlIIl[5]);
                                0;
                            }
                            String[] stringArray6 = new String[llllIlIIl[0]];
                            stringArray6[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[31]];
                            if (G.llIlIIIIllIl(lIlllllIllIlI.hasAction(stringArray6) ? 1 : 0)) {
                                lIlllllIllIlI.interact(llllIIlll[llllIlIIl[32]]);
                                Time.sleepTicks((int)llllIlIIl[5]);
                                0;
                            }
                        }
                        g.a(cG);
                    }
                }
                String[] stringArray7 = new String[llllIlIIl[0]];
                stringArray7[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[33]];
                if (G.llIlIIIlIIIl(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[llllIlIIl[0]];
                    nArray4[G.llllIlIIl[1]] = llllIlIIl[14];
                    if (G.llIlIIIIllIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[llllIlIIl[0]];
                        nArray5[G.llllIlIIl[1]] = llllIlIIl[14];
                        if (G.llIlIIIIllll(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[llllIlIIl[0]];
                            nArray6[G.llllIlIIl[1]] = llllIlIIl[14];
                            Inventory.getFirst((int[])nArray6).interact(llllIIlll[llllIlIIl[34]]);
                        }
                    }
                    if (G.llIlIIIlIllI(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[llllIlIIl[0]];
                        stringArray8[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[35]];
                        NPCs.getNearest((String[])stringArray8).interact(llllIIlll[llllIlIIl[36]]);
                        Time.sleepTicks((int)llllIlIIl[5]);
                        0;
                    }
                }
            }
            if (G.llIlIIIlIIII(e.j(fb), llllIlIIl[10])) {
                if (G.llIlIIIIllll(fB ? 1 : 0)) {
                    if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fu), llllIlIIl[5])) {
                        String[] stringArray = new String[llllIlIIl[0]];
                        stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[37]];
                        if (G.llIlIIIlIIIl(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[llllIlIIl[0]];
                            nArray7[G.llllIlIIl[1]] = llllIlIIl[7];
                            if (G.llIlIIIIllIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llllIlIIl[0]];
                                nArray8[G.llllIlIIl[1]] = llllIlIIl[7];
                                Inventory.getFirst((int[])nArray8).interact(llllIIlll[llllIlIIl[38]]);
                                Time.sleepTicks((int)llllIlIIl[3]);
                                0;
                            }
                        }
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[39]];
                        Movement.walkTo((WorldPoint)fu);
                        0;
                        Time.sleepTicks((int)llllIlIIl[0]);
                        0;
                    }
                    if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fu), llllIlIIl[5])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[40]];
                        if (G.llIlIIIIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llllIlIIl[0]];
                            stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[41]];
                            TileObjects.getNearest((String[])stringArray).interact(llllIIlll[llllIlIIl[42]]);
                        }
                        g.a(cG);
                        if (G.llIlIIIIllIl(Dialog.isOpen() ? 1 : 0) && G.llIlIIIIllIl(Dialog.getText().contains(llllIIlll[llllIlIIl[43]]) ? 1 : 0)) {
                            fB = llllIlIIl[0];
                        }
                    }
                }
                if (G.llIlIIIIllIl(fB ? 1 : 0)) {
                    if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(ft), llllIlIIl[10])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[44]];
                        Movement.walkTo((WorldPoint)ft);
                        0;
                        Time.sleepTicks((int)llllIlIIl[0]);
                        0;
                    }
                    if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(ft), llllIlIIl[10])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[45]];
                        g.a(llllIIlll[llllIlIIl[46]], cG);
                    }
                }
            }
            if (G.llIlIIIlIIII(e.j(fb), llllIlIIl[6])) {
                dk = llllIlIIl[1];
                if (G.llIlIIIIllll(G.an() ? 1 : 0)) {
                    G.bM();
                }
                if (G.llIlIIIIllIl(G.an() ? 1 : 0)) {
                    if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fx), llllIlIIl[10])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[47]];
                        if (G.llIlIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)fx);
                        0;
                        Time.sleepTicks((int)llllIlIIl[0]);
                        0;
                    }
                    if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fx), llllIlIIl[10])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[48]];
                        if (G.llIlIIIIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llllIlIIl[0]];
                            stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[49]];
                            TileObjects.getNearest((String[])stringArray).interact(llllIIlll[llllIlIIl[50]]);
                        }
                        g.a(cG);
                    }
                }
            }
            if (G.llIlIIIlIIII(e.j(fb), llllIlIIl[3])) {
                String[] stringArray = new String[llllIlIIl[0]];
                stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[51]];
                if (G.llIlIIIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[llllIlIIl[0]];
                    stringArray9[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[52]];
                    if (G.llIlIIIIllll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fy), llllIlIIl[17]) || G.llIlIIIIllIl(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[53]];
                            Movement.walkTo((WorldPoint)fy);
                            0;
                            Time.sleepTicks((int)llllIlIIl[0]);
                            0;
                        }
                        if (!G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fy), llllIlIIl[17]) || G.llIlIIIIllll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (G.llIlIIIlIllI(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[llllIlIIl[0]];
                                nArray9[G.llllIlIIl[1]] = llllIlIIl[54];
                                NPCs.getNearest((int[])nArray9).interact(llllIIlll[llllIlIIl[55]]);
                                Time.sleepTicks((int)llllIlIIl[5]);
                                0;
                            }
                            String[] stringArray10 = new String[llllIlIIl[0]];
                            stringArray10[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[56]];
                            lIlllllIllIlI = TileItems.getNearest((String[])stringArray10);
                            if (G.llIlIIIIllIl(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[llllIlIIl[0]];
                                nArray10[G.llllIlIIl[1]] = llllIlIIl[12];
                                Inventory.getFirst((int[])nArray10).interact(llllIIlll[llllIlIIl[57]]);
                                Time.sleepTicks((int)llllIlIIl[0]);
                                0;
                            }
                            if (G.llIlIIIlIIIl(lIlllllIllIlI)) {
                                lIlllllIllIlI.interact(llllIIlll[llllIlIIl[58]]);
                                Time.sleepTicks((int)llllIlIIl[5]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray11 = new String[llllIlIIl[0]];
                stringArray11[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[59]];
                if (G.llIlIIIIllIl(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fz), llllIlIIl[13])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[60]];
                        Movement.walkTo((WorldPoint)fz);
                        0;
                        Time.sleepTicks((int)llllIlIIl[0]);
                        0;
                    }
                    if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fz), llllIlIIl[13])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[61]];
                        G.bJ();
                    }
                }
                String[] stringArray12 = new String[llllIlIIl[0]];
                stringArray12[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[15]];
                if (G.llIlIIIIllIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[llllIlIIl[0]];
                    stringArray13[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[62]];
                    if (G.llIlIIIIllll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[63]];
                        String[] stringArray14 = new String[llllIlIIl[0]];
                        stringArray14[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[64]];
                        int[] nArray11 = new int[llllIlIIl[0]];
                        nArray11[G.llllIlIIl[1]] = llllIlIIl[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)llllIlIIl[6]);
                        0;
                    }
                }
                String[] stringArray15 = new String[llllIlIIl[0]];
                stringArray15[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[66]];
                if (G.llIlIIIIllIl(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[llllIlIIl[0]];
                    stringArray16[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[67]];
                    if (G.llIlIIIIllIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fx), llllIlIIl[10])) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[68]];
                            if (G.llIlIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)fx);
                            0;
                            Time.sleepTicks((int)llllIlIIl[0]);
                            0;
                        }
                        if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fx), llllIlIIl[10])) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[69]];
                            String[] stringArray17 = new String[llllIlIIl[0]];
                            stringArray17[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[70]];
                            String[] stringArray18 = new String[llllIlIIl[0]];
                            stringArray18[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)llllIlIIl[10]);
                            0;
                        }
                    }
                }
            }
            if (G.llIlIIIlIIII(e.j(fb), llllIlIIl[16])) {
                String[] stringArray = new String[llllIlIIl[0]];
                stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[72]];
                lIlllllIllIlI = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[llllIlIIl[0]];
                stringArray19[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[73]];
                if (G.llIlIIIIllll(Inventory.contains((String[])stringArray19) ? 1 : 0) && G.llIlIIIlIIIl(lIlllllIllIlI)) {
                    if (G.llIlIIIIllIl(Reachable.isInteractable((Locatable)lIlllllIllIlI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[74]];
                        g.a(llllIIlll[llllIlIIl[75]], cG);
                    }
                    if (G.llIlIIIIllll(Reachable.isInteractable((Locatable)lIlllllIllIlI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[76]];
                        String[] stringArray20 = new String[llllIlIIl[0]];
                        stringArray20[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(llllIIlll[llllIlIIl[78]]);
                        Time.sleepTicks((int)llllIlIIl[5]);
                        0;
                    }
                }
                String[] stringArray21 = new String[llllIlIIl[0]];
                stringArray21[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[79]];
                if (G.llIlIIIIllIl(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[llllIlIIl[0]];
                    stringArray22[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[80]];
                    lIlllllIllIIl = TileObjects.getNearest((String[])stringArray22);
                    if (G.llIlIIIlIIIl(lIlllllIllIIl)) {
                        if (G.llIlIIIIllIl(Reachable.isInteractable((Locatable)lIlllllIllIIl) ? 1 : 0)) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[81]];
                            String[] stringArray23 = new String[llllIlIIl[0]];
                            stringArray23[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(lIlllllIllIIl);
                            Time.sleepTicks((int)llllIlIIl[5]);
                            0;
                        }
                        if (G.llIlIIIIllll(Reachable.isInteractable((Locatable)lIlllllIllIIl) ? 1 : 0)) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[83]];
                            String[] stringArray24 = new String[llllIlIIl[0]];
                            stringArray24[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(llllIIlll[llllIlIIl[85]]);
                            Time.sleepTicks((int)llllIlIIl[5]);
                            0;
                        }
                    }
                }
            }
            if (G.llIlIIIlIIII(e.j(fb), llllIlIIl[17])) {
                String[] stringArray = new String[llllIlIIl[0]];
                stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[86]];
                lIlllllIllIlI = NPCs.getNearest((String[])stringArray);
                if (G.llIlIIIlIIIl(lIlllllIllIlI)) {
                    if (G.llIlIIIIllIl(Reachable.isInteractable((Locatable)lIlllllIllIlI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[87]];
                        g.a(llllIIlll[llllIlIIl[88]], cG);
                    }
                    if (G.llIlIIIIllll(Reachable.isInteractable((Locatable)lIlllllIllIlI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[89]];
                        String[] stringArray25 = new String[llllIlIIl[0]];
                        stringArray25[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(llllIIlll[llllIlIIl[91]]);
                        Time.sleepTicks((int)llllIlIIl[5]);
                        0;
                    }
                }
            }
            if (G.llIlIIIlIIII(e.j(fb), llllIlIIl[18])) {
                if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[92]];
                    lIlllllIllIlI = new WorldArea(llllIlIIl[93], llllIlIIl[94], llllIlIIl[60], llllIlIIl[43], llllIlIIl[1]);
                    if (G.llIlIIIIllll(lIlllllIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lIlllllIllIIl = new WorldArea(llllIlIIl[95], llllIlIIl[96], llllIlIIl[48], llllIlIIl[63], llllIlIIl[1]);
                        if (G.llIlIIIIllll(lIlllllIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                            0;
                            Time.sleepTicks((int)llllIlIIl[0]);
                            0;
                        }
                        if (G.llIlIIIIllIl(lIlllllIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                                0;
                                Time.sleepTicks((int)llllIlIIl[0]);
                                0;
                            }
                            if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                                String[] stringArray = new String[llllIlIIl[0]];
                                stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[98]];
                                lIlllllIllIII = TileObjects.getNearest((String[])stringArray);
                                if (G.llIlIIIlIIIl(lIlllllIllIII)) {
                                    String[] stringArray26 = new String[llllIlIIl[0]];
                                    stringArray26[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[99]];
                                    if (G.llIlIIIIllIl(lIlllllIllIII.hasAction(stringArray26) ? 1 : 0)) {
                                        lIlllllIllIII.interact(llllIIlll[llllIlIIl[100]]);
                                        Time.sleepTicks((int)llllIlIIl[10]);
                                        0;
                                    }
                                    String[] stringArray27 = new String[llllIlIIl[0]];
                                    stringArray27[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[101]];
                                    if (G.llIlIIIIllIl(lIlllllIllIII.hasAction(stringArray27) ? 1 : 0)) {
                                        lIlllllIllIII.interact(llllIIlll[llllIlIIl[102]]);
                                        Time.sleepTicks((int)llllIlIIl[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (G.llIlIIIIllIl(lIlllllIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)fA);
                        0;
                        Time.sleepTicks((int)llllIlIIl[0]);
                        0;
                    }
                }
                if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[103]];
                    g.a(llllIIlll[llllIlIIl[104]], cG);
                }
            }
            if (G.llIlIIIlIlll(e.j(fb), llllIlIIl[13]) && G.llIlIIIIlllI(e.j(fb), llllIlIIl[72])) {
                if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    String[] stringArray = new String[llllIlIIl[0]];
                    stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[105]];
                    if (G.llIlIIIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[106]];
                        if (G.llIlIIIIlllI(dk, llllIlIIl[0])) {
                            as.nB += llllIlIIl[0];
                            as.u(AccBuilderGWD.m);
                            dk += llllIlIIl[0];
                            as.nB = llllIlIIl[1];
                            dl = llllIlIIl[1];
                        }
                        g.a(llllIIlll[llllIlIIl[107]], cG);
                    }
                }
                String[] stringArray = new String[llllIlIIl[0]];
                stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[108]];
                if (G.llIlIIIIllll(Inventory.contains((String[])stringArray) ? 1 : 0) && G.llIlIIIIlllI(e.j(fb), llllIlIIl[72])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[109]];
                    G.bL();
                }
                String[] stringArray28 = new String[llllIlIIl[0]];
                stringArray28[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[110]];
                if (G.llIlIIIIllIl(Inventory.contains((String[])stringArray28) ? 1 : 0) && G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3]) && G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[111]];
                    lIlllllIllIlI = new WorldArea(llllIlIIl[93], llllIlIIl[94], llllIlIIl[60], llllIlIIl[43], llllIlIIl[1]);
                    if (G.llIlIIIIllll(lIlllllIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lIlllllIllIIl = new WorldArea(llllIlIIl[95], llllIlIIl[96], llllIlIIl[48], llllIlIIl[63], llllIlIIl[1]);
                        if (G.llIlIIIIllll(lIlllllIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                            0;
                            Time.sleepTicks((int)llllIlIIl[0]);
                            0;
                        }
                        if (G.llIlIIIIllIl(lIlllllIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                                0;
                                Time.sleepTicks((int)llllIlIIl[0]);
                                0;
                            }
                            if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                                String[] stringArray29 = new String[llllIlIIl[0]];
                                stringArray29[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[112]];
                                lIlllllIllIII = TileObjects.getNearest((String[])stringArray29);
                                if (G.llIlIIIlIIIl(lIlllllIllIII)) {
                                    String[] stringArray30 = new String[llllIlIIl[0]];
                                    stringArray30[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[113]];
                                    if (G.llIlIIIIllIl(lIlllllIllIII.hasAction(stringArray30) ? 1 : 0)) {
                                        lIlllllIllIII.interact(llllIIlll[llllIlIIl[114]]);
                                        Time.sleepTicks((int)llllIlIIl[10]);
                                        0;
                                    }
                                    String[] stringArray31 = new String[llllIlIIl[0]];
                                    stringArray31[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[115]];
                                    if (G.llIlIIIIllIl(lIlllllIllIII.hasAction(stringArray31) ? 1 : 0)) {
                                        lIlllllIllIII.interact(llllIIlll[llllIlIIl[116]]);
                                        Time.sleepTicks((int)llllIlIIl[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (G.llIlIIIIllIl(lIlllllIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)fA);
                        0;
                        Time.sleepTicks((int)llllIlIIl[0]);
                        0;
                    }
                }
            }
            if (G.llIlIIIlIlll(e.j(fb), llllIlIIl[72]) && G.llIlIIIIlllI(e.j(fc), llllIlIIl[3])) {
                AccBuilderGWD.c = llllIIlll[llllIlIIl[117]];
                if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    G.bK();
                }
                if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    if (G.llIlIIIlIIIl(Widgets.get((int)llllIlIIl[118], (int)llllIlIIl[27]))) {
                        Mouse.click((int)Widgets.get((int)llllIlIIl[118], (int)llllIlIIl[27]).getClickPoint().getX(), (int)Widgets.get((int)llllIlIIl[118], (int)llllIlIIl[27]).getClickPoint().getY(), (boolean)llllIlIIl[0]);
                        Time.sleepTicks((int)llllIlIIl[10]);
                        0;
                    }
                    g.a(llllIIlll[llllIlIIl[119]], cG);
                    g.a(cG);
                }
            }
            g.a(cG);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llllIlIIl[0]];
        stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[141]];
        if (G.llIlIIIlIIlI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllIlIIl[0]];
            nArray[G.llllIlIIl[1]] = llllIlIIl[12];
            if (G.llIlIIIlIIlI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llllIlIIl[0]];
                nArray2[G.llllIlIIl[1]] = llllIlIIl[7];
                if (G.llIlIIIIllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llllIlIIl[0]];
                    nArray3[G.llllIlIIl[1]] = llllIlIIl[9];
                    if (G.llIlIIIIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = llllIlIIl[0];
                        0;
                        if (3 > 1) return n2 != 0;
                        return ((28 + 143 - 105 + 104 ^ 127 + 119 - 90 + 22) & (69 + 96 - 57 + 83 ^ 54 + 1 - -62 + 50 ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = llllIlIIl[1];
        return n2 != 0;
    }

    private static void bJ() {
        fC.add(llllIlIIl[120]);
        0;
        fC.add(llllIlIIl[121]);
        0;
        fC.add(llllIlIIl[122]);
        0;
        fC.add(llllIlIIl[123]);
        0;
        fC.add(llllIlIIl[124]);
        0;
        fC.add(llllIlIIl[125]);
        0;
        fC.add(llllIlIIl[126]);
        0;
        while (G.llIlIIIIllll(fC.isEmpty() ? 1 : 0) && G.llIlIIIIllll(fC.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[llllIlIIl[0]];
            stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[127]];
            if (G.llIlIIIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                0;
                if (3 >= 0) break;
                return;
            }
            int[] nArray = new int[llllIlIIl[0]];
            nArray[G.llllIlIIl[1]] = fC.get(llllIlIIl[1]);
            TileObject lIlllllIlIllI = TileObjects.getNearest((int[])nArray);
            if (G.llIlIIIlIIIl(lIlllllIlIllI)) {
                String[] stringArray2 = new String[llllIlIIl[0]];
                stringArray2[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[128]];
                if (G.llIlIIIIllIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[llllIlIIl[0]];
                    stringArray3[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(lIlllllIlIllI);
                    Time.sleepTicks((int)llllIlIIl[3]);
                    0;
                }
            }
            String[] stringArray4 = new String[llllIlIIl[0]];
            stringArray4[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[130]];
            if (G.llIlIIIIllll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                fC.remove(llllIlIIl[1]);
                0;
                Time.sleepTicks((int)llllIlIIl[5]);
                0;
            }
            0;
            if (null == null) continue;
            return;
        }
    }

    private static boolean llIlIIIlIllI(Object object) {
        return object == null;
    }

    private static void llIlIIIIlIll() {
        llllIlIIl = new int[186];
        G.llllIlIIl[0] = 1;
        G.llllIlIIl[1] = (0x46 ^ 0x51) & ~(0x33 ^ 0x24);
        G.llllIlIIl[2] = 0xFB ^ 0x90;
        G.llllIlIIl[3] = 0x5E ^ 0x5B;
        G.llllIlIIl[4] = 0xFFFFD7CC & 0x3BBB;
        G.llllIlIIl[5] = 2;
        G.llllIlIIl[6] = 68 + 120 - 130 + 141 ^ 84 + 182 - 138 + 67;
        G.llllIlIIl[7] = 0xFFFFDF77 & 0x3FCF;
        G.llllIlIIl[8] = 0xFFFFF7D7 & 0xFAD;
        G.llllIlIIl[9] = -(0xFFFFF59E & 0x6AEF) & (0xFFFFFFED & 0x7F9F);
        G.llllIlIIl[10] = 3;
        G.llllIlIIl[11] = -(0xFFFFE86D & 0x57BF) & (0xFFFFFDFF & 0x737D);
        G.llllIlIIl[12] = 0xFFFFD9FF & 0x277B;
        G.llllIlIIl[13] = 0x7A ^ 0x70;
        G.llllIlIIl[14] = 0xFFFFEF3B & 0x15F7;
        G.llllIlIIl[15] = 0x6C ^ 0x5E;
        G.llllIlIIl[16] = 126 + 24 - 111 + 100 ^ 57 + 30 - 58 + 112;
        G.llllIlIIl[17] = 62 + 127 - 53 + 9 ^ 121 + 10 - 121 + 140;
        G.llllIlIIl[18] = 0x90 ^ 0xC4 ^ (3 ^ 0x5F);
        G.llllIlIIl[19] = 0xC1 ^ 0xBD ^ (0xD6 ^ 0xA3);
        G.llllIlIIl[20] = 0x31 ^ 0x3A;
        G.llllIlIIl[21] = 0x94 ^ 0xC6 ^ (0x42 ^ 0x1C);
        G.llllIlIIl[22] = 74 + 18 - 1 + 42 ^ 67 + 36 - 63 + 96;
        G.llllIlIIl[23] = 0x58 ^ 0x78 ^ (0xB2 ^ 0x9C);
        G.llllIlIIl[24] = 0xA6 ^ 0xA9;
        G.llllIlIIl[25] = -(0xFFFFE357 & 0x7EBB) & (0xFFFFFFDF & 0x6F7F);
        G.llllIlIIl[26] = 0xFFFFEFB6 & 0x1DFB;
        G.llllIlIIl[27] = 0x38 ^ 0x62 ^ (0x36 ^ 0x7C);
        G.llllIlIIl[28] = 0xB9 ^ 0xA8;
        G.llllIlIIl[29] = 0xAB ^ 0xB9;
        G.llllIlIIl[30] = 76 + 65 - 133 + 161 ^ 80 + 141 - 165 + 130;
        G.llllIlIIl[31] = 0x48 ^ 6 ^ (0x56 ^ 0xC);
        G.llllIlIIl[32] = 0x66 ^ 0x2A ^ (0x5C ^ 5);
        G.llllIlIIl[33] = 0x67 ^ 0x3A ^ (0x7E ^ 0x35);
        G.llllIlIIl[34] = 0xF4 ^ 0x9F ^ (0xE2 ^ 0x9E);
        G.llllIlIIl[35] = 108 + 68 - 172 + 218 ^ 40 + 67 - 88 + 179;
        G.llllIlIIl[36] = 0x3B ^ 0x22;
        G.llllIlIIl[37] = 0xF2 ^ 0xB9 ^ (0xB ^ 0x5A);
        G.llllIlIIl[38] = 20 + 37 - -53 + 18 ^ 85 + 73 - 19 + 16;
        G.llllIlIIl[39] = 0x50 ^ 0x66 ^ (0x9B ^ 0xB1);
        G.llllIlIIl[40] = 0x74 ^ 0x69;
        G.llllIlIIl[41] = 0xDD ^ 0x89 ^ (0xD8 ^ 0x92);
        G.llllIlIIl[42] = 0xEA ^ 0xA4 ^ (0x3E ^ 0x6F);
        G.llllIlIIl[43] = 53 + 56 - 68 + 110 ^ 157 + 22 - 122 + 126;
        G.llllIlIIl[44] = 0x5B ^ 0x7A;
        G.llllIlIIl[45] = 0x68 ^ 0x22 ^ (0xF8 ^ 0x90);
        G.llllIlIIl[46] = 0xEF ^ 0xA4 ^ (0xD4 ^ 0xBC);
        G.llllIlIIl[47] = 0x16 ^ 0x32;
        G.llllIlIIl[48] = 0x5D ^ 0x78;
        G.llllIlIIl[49] = 0x11 ^ 0x37;
        G.llllIlIIl[50] = 0xD9 ^ 0xB3 ^ (0x1F ^ 0x52);
        G.llllIlIIl[51] = 22 + 24 - 18 + 121 ^ 180 + 31 - 84 + 62;
        G.llllIlIIl[52] = 4 ^ 0x3F ^ (0x4D ^ 0x5F);
        G.llllIlIIl[53] = 0x7A ^ 0x52 ^ 2;
        G.llllIlIIl[54] = -(0xFFFFD733 & 0x3ACD) & (0xFFFFFFFE & 0x1F9F);
        G.llllIlIIl[55] = 175 + 27 - 200 + 233 ^ 178 + 141 - 220 + 93;
        G.llllIlIIl[56] = 5 ^ 0x51 ^ (0 ^ 0x78);
        G.llllIlIIl[57] = 0x4C ^ 0x17 ^ (0xD1 ^ 0xA7);
        G.llllIlIIl[58] = 0x31 ^ 0x50 ^ (0x8E ^ 0xC1);
        G.llllIlIIl[59] = 0x4D ^ 0x22 ^ (0x16 ^ 0x56);
        G.llllIlIIl[60] = 0x19 ^ 0x29;
        G.llllIlIIl[61] = 0x61 ^ 0x35 ^ (0xC4 ^ 0xA1);
        G.llllIlIIl[62] = 0x19 ^ 0x2A;
        G.llllIlIIl[63] = 155 + 87 - 99 + 26 ^ 80 + 128 - 77 + 26;
        G.llllIlIIl[64] = 7 ^ 0x32;
        G.llllIlIIl[65] = 0xFFFFDD9F & 0x2FFD;
        G.llllIlIIl[66] = 0xB1 ^ 0x87;
        G.llllIlIIl[67] = 62 + 29 - 86 + 132 ^ 54 + 169 - 50 + 17;
        G.llllIlIIl[68] = 0x9B ^ 0xA3;
        G.llllIlIIl[69] = 102 + 153 - 151 + 52 ^ 98 + 113 - 107 + 61;
        G.llllIlIIl[70] = 0x44 ^ 0x7E;
        G.llllIlIIl[71] = 138 + 5 - 133 + 139 ^ 93 + 114 - 67 + 34;
        G.llllIlIIl[72] = 0x45 ^ 7 ^ (0x2E ^ 0x50);
        G.llllIlIIl[73] = 0x64 ^ 0xA ^ (5 ^ 0x56);
        G.llllIlIIl[74] = 0xB ^ 0x51 ^ (0x73 ^ 0x17);
        G.llllIlIIl[75] = 0x73 ^ 0x4C;
        G.llllIlIIl[76] = 0x4E ^ 0x2B ^ (0x56 ^ 0x73);
        G.llllIlIIl[77] = 0x68 ^ 0x79 ^ (0x69 ^ 0x39);
        G.llllIlIIl[78] = 0x12 ^ 0x50;
        G.llllIlIIl[79] = 1 ^ 0xE ^ (0x31 ^ 0x7D);
        G.llllIlIIl[80] = 136 + 26 - -11 + 53 ^ 103 + 74 - 88 + 77;
        G.llllIlIIl[81] = 200 + 166 - 265 + 106 ^ 54 + 41 - 21 + 64;
        G.llllIlIIl[82] = 0x7C ^ 0x69 ^ (0xF ^ 0x5C);
        G.llllIlIIl[83] = 0xC0 ^ 0x88 ^ (0x35 ^ 0x3A);
        G.llllIlIIl[84] = 93 + 188 - 134 + 90 ^ 96 + 4 - -24 + 41;
        G.llllIlIIl[85] = 0x90 ^ 0xA0 ^ (0x10 ^ 0x69);
        G.llllIlIIl[86] = 1 ^ (0x4B ^ 0);
        G.llllIlIIl[87] = 0xDB ^ 0x90;
        G.llllIlIIl[88] = 9 ^ 0x27 ^ (0x46 ^ 0x24);
        G.llllIlIIl[89] = 0x1D ^ 0x50;
        G.llllIlIIl[90] = 0xF5 ^ 0xB6 ^ (0x2B ^ 0x26);
        G.llllIlIIl[91] = 0x37 ^ 0x78;
        G.llllIlIIl[92] = 0xE5 ^ 0xB5;
        G.llllIlIIl[93] = -(0xFFFFD739 & 0x7AF7) & (0xFFFFDFF7 & 0x7F7F);
        G.llllIlIIl[94] = -(0xFFFFF9D5 & 0x4F6B) & (0xFFFFEFDF & 0x7FF7);
        G.llllIlIIl[95] = -3 & (0xFFFFCFFE & 0x3D3F);
        G.llllIlIIl[96] = 0xFFFFEFAE & 0x1DD7;
        G.llllIlIIl[97] = -(0xFFFFE36F & 0x7C99) & (0xFFFFEDBA & 0x7FFD);
        G.llllIlIIl[98] = 110 + 47 - 92 + 85 ^ 197 + 112 - 146 + 36;
        G.llllIlIIl[99] = 0xED ^ 0xB7 ^ (0x88 ^ 0x80);
        G.llllIlIIl[100] = 0x37 ^ 0x64;
        G.llllIlIIl[101] = 8 ^ 0x4D ^ (0x39 ^ 0x28);
        G.llllIlIIl[102] = 0x7A ^ 0x2F;
        G.llllIlIIl[103] = 0x53 ^ 5;
        G.llllIlIIl[104] = 0x5C ^ 0xB;
        G.llllIlIIl[105] = 0xC1 ^ 0x8B ^ (0xB ^ 0x19);
        G.llllIlIIl[106] = 0x6F ^ 0x36;
        G.llllIlIIl[107] = 0x5A ^ 0x13 ^ (0x4F ^ 0x5C);
        G.llllIlIIl[108] = 0x39 ^ 0x62;
        G.llllIlIIl[109] = 0x7B ^ 0x5D ^ (0x53 ^ 0x29);
        G.llllIlIIl[110] = 135 + 113 - 112 + 91 ^ 184 + 124 - 225 + 107;
        G.llllIlIIl[111] = 99 + 160 - 190 + 162 ^ 57 + 22 - 16 + 122;
        G.llllIlIIl[112] = 0x3E ^ 0x61;
        G.llllIlIIl[113] = 0x60 ^ 0;
        G.llllIlIIl[114] = 124 + 120 - 202 + 154 ^ 46 + 63 - 59 + 115;
        G.llllIlIIl[115] = 0x2D ^ 0x4F;
        G.llllIlIIl[116] = 0x10 ^ 0x73;
        G.llllIlIIl[117] = 0x2E ^ 0x4A;
        G.llllIlIIl[118] = 79 + 81 - 142 + 125 + (0x30 ^ 0x6D) - (51 + 129 - 80 + 30) + (0x4B ^ 0x64);
        G.llllIlIIl[119] = 0xD0 ^ 0xB5;
        G.llllIlIIl[120] = -(0xFFFFE5DD & 0x5A37) & (0xFFFFEDFC & 0x5FBF);
        G.llllIlIIl[121] = 0xFFFFCDFE & 0x3FAB;
        G.llllIlIIl[122] = -(7 ^ 0x1E) & (0xFFFF8FBF & 0x7DFF);
        G.llllIlIIl[123] = -(0xFFFFF225 & 0x7FDB) & (0xFFFFFFFB & 0x7FAD);
        G.llllIlIIl[124] = -(0xFFFFBF5F & 0x62E9) & (0xFFFFFFFF & 0x2FEE);
        G.llllIlIIl[125] = -(0xFFFFB67F & 0x7BD1) & (0xFFFFBFFF & 0x7FFB);
        G.llllIlIIl[126] = 0xFFFF8DE5 & 0x7FBF;
        G.llllIlIIl[127] = 0x1F ^ 0x79;
        G.llllIlIIl[128] = 0x4E ^ 0x29;
        G.llllIlIIl[129] = 9 ^ 7 ^ (0x10 ^ 0x76);
        G.llllIlIIl[130] = 0xF4 ^ 0x9D;
        G.llllIlIIl[131] = 0x37 ^ 0x5D;
        G.llllIlIIl[132] = 0x7E ^ 0x12;
        G.llllIlIIl[133] = 0x51 ^ 0x3C;
        G.llllIlIIl[134] = 0xE4 ^ 0x8A;
        G.llllIlIIl[135] = 0x61 ^ 0xE;
        G.llllIlIIl[136] = 0xCF ^ 0xBF;
        G.llllIlIIl[137] = 0x42 ^ 0x33;
        G.llllIlIIl[138] = 130 + 57 - 183 + 230 ^ 81 + 65 - 30 + 36;
        G.llllIlIIl[139] = 0x9A ^ 0xBB ^ (0xF4 ^ 0xA6);
        G.llllIlIIl[140] = 0x42 ^ 0x36;
        G.llllIlIIl[141] = 0x3A ^ 0x64 ^ (0x89 ^ 0xA2);
        G.llllIlIIl[142] = -(0x13 ^ 5) & (0xFFFFEB3F & 0x37FD);
        G.llllIlIIl[143] = 0xFFFF8B2E & 0x75FD;
        G.llllIlIIl[144] = 0xFFFFBFCC & 0x6EFF;
        G.llllIlIIl[145] = -(0xFFFFB2F6 & 0x5F0B) & (0xFFFFF3BF & 0x7FE9);
        G.llllIlIIl[146] = 0xFFFFA3BC & 0x5FC7;
        G.llllIlIIl[147] = 107 + 216 - 150 + 47 ^ 58 + 5 - 31 + 138;
        G.llllIlIIl[148] = 0xE6 ^ 0xB2 ^ (0x20 ^ 3);
        G.llllIlIIl[149] = -(0xFFFF93D7 & 0x7F6A) & (0xFFFFDFFF & 0x3FD7);
        G.llllIlIIl[150] = 0xFFFFEDF5 & 0x1F9B;
        G.llllIlIIl[151] = -(0xFFFFEBFF & 0x76B1) & (0xFFFFFFFF & 0x6FFF);
        G.llllIlIIl[152] = -(0xFFFFE0B3 & 0x5F5D) & (0xFFFFCDB3 & 0x7FFD);
        G.llllIlIIl[153] = 0xFFFFBEFF & 0x67AE;
        G.llllIlIIl[154] = 0xFFFFFFCF & 0x1F7D;
        G.llllIlIIl[155] = 0xFFFFBF36 & 0x59DF;
        G.llllIlIIl[156] = -(0xFFFF9AA9 & 0x77F7) & (0xFFFFBFF7 & 0x5FFF);
        G.llllIlIIl[157] = -(0xFFFFF28B & 0x2F77) & (0xFFFFBFDE & 0x6F77);
        G.llllIlIIl[158] = 0xFFFFFFB6 & 0xDE9;
        G.llllIlIIl[159] = -(0xFFFFF327 & 0x7EF9) & (0xFFFFFF7F & 0x7FFE);
        G.llllIlIIl[160] = -(0xFFFFC329 & 0x7CF7) & (0xFFFFF6BF & 0x6FFF);
        G.llllIlIIl[161] = 0xFFFFAD7D & 0x5FF2;
        G.llllIlIIl[162] = 0xFFFFB7AF & 0x6EF7;
        G.llllIlIIl[163] = -(0xFFFFFFDA & 0x7EA7) & (0xFFFFFFAF & Short.MAX_VALUE);
        G.llllIlIIl[164] = 0xFFFFE1FB & 0x1F37;
        G.llllIlIIl[165] = 0x32 ^ 0x4A;
        G.llllIlIIl[166] = 3 ^ 0x7A;
        G.llllIlIIl[167] = 5 ^ 0x7F;
        G.llllIlIIl[168] = 0x9B ^ 0xB4 ^ (4 ^ 0x50);
        G.llllIlIIl[169] = 0x4E ^ 0x2F ^ (8 ^ 0x15);
        G.llllIlIIl[170] = 0x58 ^ 0x25;
        G.llllIlIIl[171] = 0xF9 ^ 0x87;
        G.llllIlIIl[172] = 114 + 37 - 142 + 118;
        G.llllIlIIl[173] = (0x98 ^ 0xBA) + (0xE6 ^ 0x84) - (0xB4 ^ 0xA2) + (0x75 ^ 0x67);
        G.llllIlIIl[174] = (0x74 ^ 0x5C) + (0xD4 ^ 0xBE) - (0x20 ^ 0x1F) + (0x2C ^ 2);
        G.llllIlIIl[175] = (0xBB ^ 0x9C) + (0x47 ^ 0x2E) - (0x3B ^ 0x1F) + (0x18 ^ 0xE);
        G.llllIlIIl[176] = (0x6C ^ 0x5F) + (0x2F ^ 0x31) - (0x8C ^ 0xAC) + (0x97 ^ 0xC5);
        G.llllIlIIl[177] = 12 + 7 - -88 + 25;
        G.llllIlIIl[178] = (0x14 ^ 0x2E) + (0xC ^ 0x6C) - (0x81 ^ 0x9B) + (0x30 ^ 0x35);
        G.llllIlIIl[179] = (0x5A ^ 0x57) + (0xB7 ^ 0xBA) - -(0x7A ^ 0x59) + (0x67 ^ 0x2E);
        G.llllIlIIl[180] = 43 + 14 - -73 + 5;
        G.llllIlIIl[181] = 51 + 12 - 3 + 70 + (0x17 ^ 0x55) - (164 + 9 - 107 + 113) + (0xED ^ 0x9A);
        G.llllIlIIl[182] = (0xAE ^ 0xC2) + (0xCB ^ 0x9E) - (109 + 92 - 136 + 126) + (78 + 102 - 78 + 33);
        G.llllIlIIl[183] = (0xEB ^ 0xB4) + (0x1A ^ 0x7B) - (25 + 29 - -20 + 62) + (0x37 ^ 0x65);
        G.llllIlIIl[184] = 92 + 62 - 49 + 28 + (0x99 ^ 0xA0) - (0xF2 ^ 0xC7) + 2;
        G.llllIlIIl[185] = 86 + 52 - 61 + 63;
    }

    @Override
    public int af() {
        try {
            G.bI();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-2 > 0) {
            return (0x23 ^ 0x30) & ~(0x8B ^ 0x98);
        }
        return llllIlIIl[117];
    }

    @Override
    public boolean ae() {
        return llllIlIIl[1];
    }

    private static String llIlIIIIIlIl(String lIllllIlIIllI, String lIllllIlIIIll) {
        try {
            SecretKeySpec lIllllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIlIIIll.getBytes(StandardCharsets.UTF_8)), llllIlIIl[18]), "DES");
            Cipher lIllllIlIlIII = Cipher.getInstance("DES");
            lIllllIlIlIII.init(llllIlIIl[5], lIllllIlIlIIl);
            return new String(lIllllIlIlIII.doFinal(Base64.getDecoder().decode(lIllllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIlIIlll) {
            lIllllIlIIlll.printStackTrace();
            return null;
        }
    }

    private static String llIlIIIIIlII(String lIllllIIlIlll, String lIllllIIllIII) {
        try {
            SecretKeySpec lIllllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllllIIllIll = Cipher.getInstance("Blowfish");
            lIllllIIllIll.init(llllIlIIl[5], lIllllIIlllII);
            return new String(lIllllIIllIll.doFinal(Base64.getDecoder().decode(lIllllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIIllIlI) {
            lIllllIIllIlI.printStackTrace();
            return null;
        }
    }

    static {
        G.llIlIIIIlIll();
        G.llIlIIIIlIlI();
        ft = new WorldPoint(llllIlIIl[149], llllIlIIl[150], llllIlIIl[1]);
        fu = new WorldPoint(llllIlIIl[151], llllIlIIl[152], llllIlIIl[1]);
        fv = new WorldPoint(llllIlIIl[25], llllIlIIl[153], llllIlIIl[1]);
        fw = new WorldPoint(llllIlIIl[154], llllIlIIl[155], llllIlIIl[1]);
        fx = new WorldPoint(llllIlIIl[156], llllIlIIl[152], llllIlIIl[5]);
        fy = new WorldPoint(llllIlIIl[157], llllIlIIl[158], llllIlIIl[1]);
        fz = new WorldPoint(llllIlIIl[159], llllIlIIl[160], llllIlIIl[1]);
        fA = new WorldPoint(llllIlIIl[161], llllIlIIl[162], llllIlIIl[1]);
        bx = new ArrayList<d>();
        fb = llllIlIIl[163];
        fc = llllIlIIl[164];
        String[] stringArray = new String[llllIlIIl[31]];
        stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[165]];
        stringArray[G.llllIlIIl[0]] = llllIIlll[llllIlIIl[166]];
        stringArray[G.llllIlIIl[5]] = llllIIlll[llllIlIIl[167]];
        stringArray[G.llllIlIIl[10]] = llllIIlll[llllIlIIl[168]];
        stringArray[G.llllIlIIl[6]] = llllIIlll[llllIlIIl[169]];
        stringArray[G.llllIlIIl[3]] = llllIIlll[llllIlIIl[170]];
        stringArray[G.llllIlIIl[16]] = llllIIlll[llllIlIIl[171]];
        stringArray[G.llllIlIIl[17]] = llllIIlll[llllIlIIl[172]];
        stringArray[G.llllIlIIl[18]] = llllIIlll[llllIlIIl[173]];
        stringArray[G.llllIlIIl[19]] = llllIIlll[llllIlIIl[174]];
        stringArray[G.llllIlIIl[13]] = llllIIlll[llllIlIIl[175]];
        stringArray[G.llllIlIIl[20]] = llllIIlll[llllIlIIl[176]];
        stringArray[G.llllIlIIl[21]] = llllIIlll[llllIlIIl[177]];
        stringArray[G.llllIlIIl[22]] = llllIIlll[llllIlIIl[178]];
        stringArray[G.llllIlIIl[23]] = llllIIlll[llllIlIIl[179]];
        stringArray[G.llllIlIIl[24]] = llllIIlll[llllIlIIl[180]];
        stringArray[G.llllIlIIl[27]] = llllIIlll[llllIlIIl[181]];
        stringArray[G.llllIlIIl[28]] = llllIIlll[llllIlIIl[182]];
        stringArray[G.llllIlIIl[29]] = llllIIlll[llllIlIIl[183]];
        stringArray[G.llllIlIIl[30]] = llllIIlll[llllIlIIl[184]];
        cG = stringArray;
        fC = new ArrayList();
    }

    /*
     * WARNING - void declaration
     */
    private static void bK() {
        if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
            void lIlllllIlIIlI;
            AccBuilderGWD.c = llllIIlll[llllIlIIl[131]];
            WorldArea worldArea = new WorldArea(llllIlIIl[93], llllIlIIl[94], llllIlIIl[60], llllIlIIl[43], llllIlIIl[1]);
            if (G.llIlIIIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void lIlllllIlIIIl;
                WorldArea worldArea2 = new WorldArea(llllIlIIl[95], llllIlIIl[96], llllIlIIl[48], llllIlIIl[63], llllIlIIl[1]);
                if (G.llIlIIIIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                    0;
                    Time.sleepTicks((int)llllIlIIl[0]);
                    0;
                }
                if (G.llIlIIIIllIl(lIlllllIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (G.llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                        0;
                        Time.sleepTicks((int)llllIlIIl[0]);
                        0;
                    }
                    if (G.llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                        String[] stringArray = new String[llllIlIIl[0]];
                        stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[2]];
                        TileObject lIlllllIlIIII = TileObjects.getNearest((String[])stringArray);
                        if (G.llIlIIIlIIIl(lIlllllIlIIII)) {
                            String[] stringArray2 = new String[llllIlIIl[0]];
                            stringArray2[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[132]];
                            if (G.llIlIIIIllIl(lIlllllIlIIII.hasAction(stringArray2) ? 1 : 0)) {
                                lIlllllIlIIII.interact(llllIIlll[llllIlIIl[133]]);
                                Time.sleepTicks((int)llllIlIIl[10]);
                                0;
                            }
                            String[] stringArray3 = new String[llllIlIIl[0]];
                            stringArray3[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[134]];
                            if (G.llIlIIIIllIl(lIlllllIlIIII.hasAction(stringArray3) ? 1 : 0)) {
                                lIlllllIlIIII.interact(llllIIlll[llllIlIIl[135]]);
                                Time.sleepTicks((int)llllIlIIl[10]);
                                0;
                            }
                        }
                    }
                }
            }
            if (G.llIlIIIIllIl(lIlllllIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)fA);
                0;
                Time.sleepTicks((int)llllIlIIl[0]);
                0;
            }
        }
    }

    private static boolean llIlIIIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIIIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void bM() {
        void lIlllllIIllII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (G.llIlIIIlIIIl(bankLocation) && G.llIlIIIIllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIIlll[llllIlIIl[138]];
            a.a(bankLocation);
        }
        if (G.llIlIIIlIIIl(lIlllllIIllII) && G.llIlIIIIllIl(lIlllllIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (G.llIlIIIIllll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIIl[4]);
                0;
            }
            if (G.llIlIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llllIIlll[llllIlIIl[139]];
                if (G.llIlIIIlIIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIlIIl[6]);
                    0;
                }
                a.a(llllIlIIl[7], llllIlIIl[13]);
                a.a(llllIlIIl[8], llllIlIIl[0]);
                a.a(llllIlIIl[11], llllIlIIl[0]);
                a.a(llllIlIIl[12], llllIlIIl[3]);
                a.a(llllIlIIl[9], llllIlIIl[41]);
            }
        }
    }

    private static void Q() {
        d lIlllllIIlIII;
        Object lIlllllIIlIIl;
        block10: {
            block9: {
                int[] nArray = new int[llllIlIIl[0]];
                nArray[G.llllIlIIl[1]] = llllIlIIl[14];
                if (G.llIlIIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llllIlIIl[14], llllIlIIl[0], llllIlIIl[142]);
                    bx.add(d2);
                    0;
                }
                int[] nArray2 = new int[llllIlIIl[0]];
                nArray2[G.llllIlIIl[1]] = llllIlIIl[8];
                if (G.llIlIIIIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIlllllIIlIIl = new d(llllIlIIl[8], llllIlIIl[0], llllIlIIl[142]);
                    bx.add((d)lIlllllIIlIIl);
                    0;
                }
                int[] nArray3 = new int[llllIlIIl[0]];
                nArray3[G.llllIlIIl[1]] = llllIlIIl[11];
                if (G.llIlIIIIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIlllllIIlIIl = new d(llllIlIIl[11], llllIlIIl[3], j.ch);
                    bx.add((d)lIlllllIIlIIl);
                    0;
                }
                int[] nArray4 = new int[llllIlIIl[0]];
                nArray4[G.llllIlIIl[1]] = llllIlIIl[12];
                if (G.llIlIIIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIlllllIIlIIl = new d(llllIlIIl[12], llllIlIIl[41], llllIlIIl[143]);
                    bx.add((d)lIlllllIIlIIl);
                    0;
                }
                int[] nArray5 = new int[llllIlIIl[0]];
                nArray5[G.llllIlIIl[1]] = llllIlIIl[9];
                if (!G.llIlIIIIllIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[llllIlIIl[0]];
                nArray6[G.llllIlIIl[1]] = llllIlIIl[9];
                if (!G.llIlIIIIllIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[llllIlIIl[0]];
                nArray7[G.llllIlIIl[1]] = llllIlIIl[9];
                if (!G.llIlIIIIlllI(Bank.getFirst((int[])nArray7).getQuantity(), llllIlIIl[15])) break block10;
            }
            lIlllllIIlIIl = new d(llllIlIIl[9], llllIlIIl[15], llllIlIIl[107]);
            bx.add((d)lIlllllIIlIIl);
            0;
        }
        if (G.llIlIIIIllll(Bank.contains((Predicate)(lIlllllIIlIIl = item -> item.getName().toLowerCase().contains(llllIIlll[llllIlIIl[148]]))) ? 1 : 0)) {
            lIlllllIIlIII = new d(llllIlIIl[144], llllIlIIl[3], llllIlIIl[145]);
            bx.add(lIlllllIIlIII);
            0;
        }
        int[] nArray = new int[llllIlIIl[0]];
        nArray[G.llllIlIIl[1]] = llllIlIIl[7];
        if (G.llIlIIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlllllIIlIII = new d(llllIlIIl[7], llllIlIIl[51], llllIlIIl[146]);
            bx.add(lIlllllIIlIII);
            0;
        }
    }

    private static void llIlIIIIlIlI() {
        llllIIlll = new String[llllIlIIl[185]];
        G.llllIIlll[G.llllIlIIl[1]] = G."Finished buying items, switching back to quest";
        G.llllIIlll[G.llllIlIIl[0]] = G."Nav to bank";
        G.llllIIlll[G.llllIlIIl[5]] = G."Handling banking";
        G.llllIIlll[G.llllIlIIl[10]] = G."We are missing quest supplies, switching to BUYING";
        G.llllIIlll[G.llllIlIIl[6]] = G."Drink";
        G.llllIIlll[G.llllIlIIl[3]] = G."Eat";
        G.llllIIlll[G.llllIlIIl[16]] = G."Nav to start";
        G.llllIIlll[G.llllIlIIl[17]] = G."Starting quest";
        G.llllIIlll[G.llllIlIIl[18]] = G."King Roald";
        G.llllIIlll[G.llllIlIIl[19]] = G."Nav to temple door";
        G.llllIIlll[G.llllIlIIl[13]] = G."Interesting door";
        G.llllIIlll[G.llllIlIIl[20]] = G."Large door";
        G.llllIIlll[G.llllIlIIl[21]] = G."Open";
        G.llllIIlll[G.llllIlIIl[22]] = G."Temple Guardian";
        G.llllIIlll[G.llllIlIIl[23]] = G."Nav to doggo";
        G.llllIIlll[G.llllIlIIl[24]] = G."Trapdoor";
        G.llllIIlll[G.llllIlIIl[27]] = G."Temple Guardian";
        G.llllIIlll[G.llllIlIIl[28]] = G."Trapdoor";
        G.llllIIlll[G.llllIlIIl[29]] = G."Open";
        G.llllIIlll[G.llllIlIIl[30]] = G."Open";
        G.llllIIlll[G.llllIlIIl[31]] = G."Climb-down";
        G.llllIIlll[G.llllIlIIl[32]] = G."Climb-down";
        G.llllIIlll[G.llllIlIIl[33]] = G."Temple Guardian";
        G.llllIIlll[G.llllIlIIl[34]] = G."Wield";
        G.llllIIlll[G.llllIlIIl[35]] = G."Temple Guardian";
        G.llllIIlll[G.llllIlIIl[36]] = G."Attack";
        G.llllIIlll[G.llllIlIIl[37]] = G."Monument";
        G.llllIIlll[G.llllIlIIl[38]] = G."Break";
        G.llllIIlll[G.llllIlIIl[39]] = G."Nav to temple door";
        G.llllIIlll[G.llllIlIIl[40]] = G."Interacting door";
        G.llllIIlll[G.llllIlIIl[41]] = G."Large door";
        G.llllIIlll[G.llllIlIIl[42]] = G."Open";
        G.llllIIlll[G.llllIlIIl[43]] = G."tell the king";
        G.llllIIlll[G.llllIlIIl[44]] = G."Nav to king";
        G.llllIIlll[G.llllIlIIl[45]] = G."talk king";
        G.llllIIlll[G.llllIlIIl[46]] = G."King Roald";
        G.llllIIlll[G.llllIlIIl[47]] = G."Nav to jail";
        G.llllIIlll[G.llllIlIIl[48]] = G."Interesting door";
        G.llllIIlll[G.llllIlIIl[49]] = G."Cell door";
        G.llllIIlll[G.llllIlIIl[50]] = G."Open";
        G.llllIIlll[G.llllIlIIl[51]] = G."Golden key";
        G.llllIIlll[G.llllIlIIl[52]] = G."Iron key";
        G.llllIIlll[G.llllIlIIl[53]] = G."Nav to gold key tile";
        G.llllIIlll[G.llllIlIIl[55]] = G."Attack";
        G.llllIIlll[G.llllIlIIl[56]] = G."Golden key";
        G.llllIIlll[G.llllIlIIl[57]] = G."Eat";
        G.llllIIlll[G.llllIlIIl[58]] = G."Take";
        G.llllIIlll[G.llllIlIIl[59]] = G."Golden key";
        G.llllIIlll[G.llllIlIIl[60]] = G."Nav to statues";
        G.llllIIlll[G.llllIlIIl[61]] = G."Finding key";
        G.llllIIlll[G.llllIlIIl[15]] = G."Iron key";
        G.llllIIlll[G.llllIlIIl[62]] = G."Murky water";
        G.llllIIlll[G.llllIlIIl[63]] = G."Getting water";
        G.llllIIlll[G.llllIlIIl[64]] = G."Bucket";
        G.llllIIlll[G.llllIlIIl[66]] = G."Iron key";
        G.llllIIlll[G.llllIlIIl[67]] = G."Murky water";
        G.llllIIlll[G.llllIlIIl[68]] = G."Nav to jail";
        G.llllIIlll[G.llllIlIIl[69]] = G."Interesting door";
        G.llllIIlll[G.llllIlIIl[70]] = G."Iron key";
        G.llllIIlll[G.llllIlIIl[71]] = G."Cell door";
        G.llllIIlll[G.llllIlIIl[72]] = G."Drezel";
        G.llllIIlll[G.llllIlIIl[73]] = G."Blessed water";
        G.llllIIlll[G.llllIlIIl[74]] = G."Handling chat";
        G.llllIIlll[G.llllIlIIl[75]] = G."Drezel";
        G.llllIIlll[G.llllIlIIl[76]] = G."Entering cell";
        G.llllIIlll[G.llllIlIIl[77]] = G."Cell door";
        G.llllIIlll[G.llllIlIIl[78]] = G."Open";
        G.llllIIlll[G.llllIlIIl[79]] = G."Blessed water";
        G.llllIIlll[G.llllIlIIl[80]] = G."Coffin";
        G.llllIIlll[G.llllIlIIl[81]] = G."Using water on coffin";
        G.llllIIlll[G.llllIlIIl[82]] = G."Blessed water";
        G.llllIIlll[G.llllIlIIl[83]] = G."Exiting cell";
        G.llllIIlll[G.llllIlIIl[84]] = G."Cell door";
        G.llllIIlll[G.llllIlIIl[85]] = G."Open";
        G.llllIIlll[G.llllIlIIl[86]] = G."Drezel";
        G.llllIIlll[G.llllIlIIl[87]] = G."Handling chat";
        G.llllIIlll[G.llllIlIIl[88]] = G."Drezel";
        G.llllIIlll[G.llllIlIIl[89]] = G."Entering cell";
        G.llllIIlll[G.llllIlIIl[90]] = G."Cell door";
        G.llllIIlll[G.llllIlIIl[91]] = G."Open";
        G.llllIIlll[G.llllIlIIl[92]] = G."Nav to final tile";
        G.llllIIlll[G.llllIlIIl[98]] = G."Trapdoor";
        G.llllIIlll[G.llllIlIIl[99]] = G."Open";
        G.llllIIlll[G.llllIlIIl[100]] = G."Open";
        G.llllIIlll[G.llllIlIIl[101]] = G."Climb-down";
        G.llllIIlll[G.llllIlIIl[102]] = G."Climb-down";
        G.llllIIlll[G.llllIlIIl[103]] = G."Handling chat";
        G.llllIIlll[G.llllIlIIl[104]] = G."Drezel";
        G.llllIIlll[G.llllIlIIl[105]] = G."Pure essence";
        G.llllIIlll[G.llllIlIIl[106]] = G."Turning in ess";
        G.llllIIlll[G.llllIlIIl[107]] = G."Drezel";
        G.llllIIlll[G.llllIlIIl[108]] = G."Pure essence";
        G.llllIIlll[G.llllIlIIl[109]] = G."Grabbing more ess";
        G.llllIIlll[G.llllIlIIl[110]] = G."Pure essence";
        G.llllIIlll[G.llllIlIIl[111]] = G."Nav to final tile";
        G.llllIIlll[G.llllIlIIl[112]] = G."Trapdoor";
        G.llllIIlll[G.llllIlIIl[113]] = G."Open";
        G.llllIIlll[G.llllIlIIl[114]] = G."Open";
        G.llllIIlll[G.llllIlIIl[115]] = G."Climb-down";
        G.llllIIlll[G.llllIlIIl[116]] = G."Climb-down";
        G.llllIIlll[G.llllIlIIl[117]] = G."Finish & Unlock morty/start nature";
        G.llllIIlll[G.llllIlIIl[119]] = G."Drezel";
        G.llllIIlll[G.llllIlIIl[127]] = G."Iron key";
        G.llllIIlll[G.llllIlIIl[128]] = G."Golden key";
        G.llllIIlll[G.llllIlIIl[129]] = G."Golden key";
        G.llllIIlll[G.llllIlIIl[130]] = G."Iron key";
        G.llllIIlll[G.llllIlIIl[131]] = G."Nav to final tile";
        G.llllIIlll[G.llllIlIIl[2]] = G."Trapdoor";
        G.llllIIlll[G.llllIlIIl[132]] = G."Open";
        G.llllIIlll[G.llllIlIIl[133]] = G."Open";
        G.llllIIlll[G.llllIlIIl[134]] = G."Climb-down";
        G.llllIIlll[G.llllIlIIl[135]] = G."Climb-down";
        G.llllIIlll[G.llllIlIIl[136]] = G."Nav to bank";
        G.llllIIlll[G.llllIlIIl[137]] = G."Handling banking";
        G.llllIIlll[G.llllIlIIl[138]] = G."Nav to bank";
        G.llllIIlll[G.llllIlIIl[139]] = G."Handling banking";
        G.llllIIlll[G.llllIlIIl[140]] = G."Bucket";
        G.llllIIlll[G.llllIlIIl[141]] = G."Bucket";
        G.llllIIlll[G.llllIlIIl[147]] = G."Priest In Peril";
        G.llllIIlll[G.llllIlIIl[148]] = G."ring of wealth (";
        G.llllIIlll[G.llllIlIIl[165]] = G."I'm looking for a quest!";
        G.llllIIlll[G.llllIlIIl[166]] = G."Yes.";
        G.llllIIlll[G.llllIlIIl[167]] = G."Ok, let me help then.";
        G.llllIIlll[G.llllIlIIl[168]] = G."Yep, now tell me what the problem is.";
        G.llllIIlll[G.llllIlIIl[169]] = G."Sure.";
        G.llllIIlll[G.llllIlIIl[170]] = G."You're right, we don't.";
        G.llllIIlll[G.llllIlIIl[171]] = G."Is there anything else interesting to do around here?";
        G.llllIIlll[G.llllIlIIl[172]] = G."Well, what is it, I may be able to help?";
        G.llllIIlll[G.llllIlIIl[173]] = G."Yes, I'll go and look for him.";
        G.llllIIlll[G.llllIlIIl[174]] = G."Yes, I'm sure.";
        G.llllIIlll[G.llllIlIIl[175]] = G."I'll get going.";
        G.llllIIlll[G.llllIlIIl[176]] = G."Ok, thanks.";
        G.llllIIlll[G.llllIlIIl[177]] = G."I think I've solved the puzzle!";
        G.llllIIlll[G.llllIlIIl[178]] = G."How can I help?";
        G.llllIIlll[G.llllIlIIl[179]] = G."Roald sent me to check on Drezel.";
        G.llllIIlll[G.llllIlIIl[180]] = G."Why is the river such a good defence?";
        G.llllIIlll[G.llllIlIIl[181]] = G."You're right, we don't.";
        G.llllIIlll[G.llllIlIIl[182]] = G."Yes, of course.";
        G.llllIIlll[G.llllIlIIl[183]] = G."Do you know of anything I can do in Morytania?";
        G.llllIIlll[G.llllIlIIl[184]] = G."Well, what is it, I may be able to help?";
    }

    private static boolean llIlIIIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIIlIIll(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIIIlIIIl(Object object) {
        return object != null;
    }

    private static String llIlIIIIIllI(String lIllllIllIllI, String lIllllIllIlIl) {
        lIllllIllIllI = new String(Base64.getDecoder().decode(lIllllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllllIlllIIl = new StringBuilder();
        char[] lIllllIlllIII = lIllllIllIlIl.toCharArray();
        int lIllllIllIlll = llllIlIIl[1];
        char[] lIllllIllIIIl = lIllllIllIllI.toCharArray();
        int lIllllIllIIII = lIllllIllIIIl.length;
        int lIllllIlIllll = llllIlIIl[1];
        while (G.llIlIIIIlllI(lIllllIlIllll, lIllllIllIIII)) {
            char lIllllIllllII = lIllllIllIIIl[lIllllIlIllll];
            lIllllIlllIIl.append((char)(lIllllIllllII ^ lIllllIlllIII[lIllllIllIlll % lIllllIlllIII.length]));
            0;
            ++lIllllIllIlll;
            ++lIllllIlIllll;
            0;
            if (-(0xE2 ^ 0x9C ^ (5 ^ 0x7F)) < 0) continue;
            return null;
        }
        return String.valueOf(lIllllIlllIIl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bN() {
        int n2;
        String[] stringArray = new String[llllIlIIl[0]];
        stringArray[G.llllIlIIl[1]] = llllIIlll[llllIlIIl[140]];
        if (G.llIlIIIlIIlI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllIlIIl[0]];
            nArray[G.llllIlIIl[1]] = llllIlIIl[12];
            if (G.llIlIIIlIIlI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llllIlIIl[0]];
                nArray2[G.llllIlIIl[1]] = llllIlIIl[11];
                if (G.llIlIIIlIIlI(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[llllIlIIl[0]];
                    nArray3[G.llllIlIIl[1]] = llllIlIIl[7];
                    if (G.llIlIIIIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = llllIlIIl[0];
                        0;
                        if (null == null) return n2 != 0;
                        return ((133 + 90 - 2 + 27 ^ 149 + 54 - 14 + 9) & (125 + 47 - 81 + 78 ^ 140 + 103 - 169 + 77 ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = llllIlIIl[1];
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llllIIlll[llllIlIIl[147]];
    }

    private static boolean llIlIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }
}

