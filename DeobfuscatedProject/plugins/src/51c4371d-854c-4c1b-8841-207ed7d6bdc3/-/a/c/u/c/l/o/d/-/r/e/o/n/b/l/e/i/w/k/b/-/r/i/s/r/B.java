/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import gg.squire.account.AccBuilderBarrows;
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
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class B
implements F {
    static /* synthetic */ int ci;
    public static /* synthetic */ WorldPoint hS;
    private static /* synthetic */ String[] llIlIIll;
    public static /* synthetic */ WorldPoint hQ;
    public static /* synthetic */ WorldPoint hR;
    public static /* synthetic */ WorldPoint hT;
    public static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ boolean bz;
    static /* synthetic */ WorldArea hV;
    static /* synthetic */ int hU;
    public static /* synthetic */ List<d> bB;
    private static /* synthetic */ int[] llIlIlll;
    static /* synthetic */ String[] bX;
    static /* synthetic */ boolean cj;

    /*
     * WARNING - void declaration
     */
    private static boolean ac() {
        void lIlIIlIlIIllIll;
        int[] nArray = new int[llIlIlll[4]];
        nArray[B.llIlIlll[1]] = llIlIlll[5];
        nArray[B.llIlIlll[0]] = llIlIlll[6];
        nArray[B.llIlIlll[3]] = llIlIlll[7];
        nArray[B.llIlIlll[8]] = llIlIlll[9];
        int[] nArray2 = nArray;
        int lIlIIlIlIIllIlI = llIlIlll[1];
        while (B.lIllIlIIIlI(lIlIIlIlIIllIlI, ((void)lIlIIlIlIIllIll).length)) {
            int[] nArray3 = new int[llIlIlll[0]];
            nArray3[B.llIlIlll[1]] = lIlIIlIlIIllIll[lIlIIlIlIIllIlI];
            if (B.lIllIlIIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIlIlll[1];
            }
            ++lIlIIlIlIIllIlI;
            "".length();
            if (-"   ".length() <= 0) continue;
            return ((115 + 65 - 136 + 88 ^ 41 + 143 - 94 + 89) & (99 + 87 - 182 + 139 ^ 162 + 103 - 86 + 5 ^ -" ".length())) != 0;
        }
        return llIlIlll[0];
    }

    private static boolean lIllIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIIIll(int n2) {
        return n2 == 0;
    }

    static {
        B.lIllIIlllII();
        B.lIllIIllIll();
        bB = new ArrayList<d>();
        ce = new WorldPoint(llIlIlll[64], llIlIlll[187], llIlIlll[1]);
        hQ = new WorldPoint(llIlIlll[188], llIlIlll[189], llIlIlll[1]);
        hR = new WorldPoint(llIlIlll[161], llIlIlll[190], llIlIlll[1]);
        hS = new WorldPoint(llIlIlll[191], llIlIlll[192], llIlIlll[1]);
        hT = new WorldPoint(llIlIlll[64], llIlIlll[45], llIlIlll[3]);
        hU = llIlIlll[47];
        String[] stringArray = new String[llIlIlll[8]];
        stringArray[B.llIlIlll[1]] = llIlIIll[llIlIlll[193]];
        stringArray[B.llIlIlll[0]] = llIlIIll[llIlIlll[194]];
        stringArray[B.llIlIlll[3]] = llIlIIll[llIlIlll[195]];
        bX = stringArray;
        hV = new WorldArea(llIlIlll[188], llIlIlll[196], llIlIlll[50], llIlIlll[40], llIlIlll[1]);
    }

    private static boolean lIllIlIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void bF() {
        block134: {
            BankLocation lIlIIlIlIlIlIll;
            block135: {
                WorldArea lIlIIlIlIlIlIIl;
                TileItem lIlIIlIlIlIlIlI;
                block137: {
                    block136: {
                        if (B.lIllIlIIIIl(bz ? 1 : 0)) {
                            b.a(bB);
                            if (B.lIllIlIIIlI(bB.size(), llIlIlll[0])) {
                                System.out.println(llIlIIll[llIlIlll[1]]);
                                bz = llIlIlll[1];
                            }
                        }
                        if (!B.lIllIlIIIll(bz ? 1 : 0)) break block134;
                        if (B.lIllIlIIIll(B.ac() ? 1 : 0) && B.lIllIlIIIlI(e.j(hU), llIlIlll[0])) {
                            lIlIIlIlIlIlIll = BankLocation.getNearest();
                            if (B.lIllIlIIlII(lIlIIlIlIlIlIll) && B.lIllIlIIIll(lIlIIlIlIlIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[0]];
                                a.a(lIlIIlIlIlIlIll);
                            }
                            if (B.lIllIlIIlII(lIlIIlIlIlIlIll) && B.lIllIlIIIIl(lIlIIlIlIlIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (B.lIllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlll[2]);
                                    "".length();
                                }
                                if (B.lIllIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[3]];
                                    if (B.lIllIlIIlIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIlIlll[4]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIlIl(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIlIlll[3]);
                                        "".length();
                                    }
                                    int[] nArray = new int[llIlIlll[4]];
                                    nArray[B.llIlIlll[1]] = llIlIlll[5];
                                    nArray[B.llIlIlll[0]] = llIlIlll[6];
                                    nArray[B.llIlIlll[3]] = llIlIlll[7];
                                    nArray[B.llIlIlll[8]] = llIlIlll[9];
                                    if (B.lIllIlIIIll(e.b(nArray) ? 1 : 0)) {
                                        B.ag();
                                        System.out.println(llIlIIll[llIlIlll[8]]);
                                        bz = llIlIlll[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[llIlIlll[4]];
                                    nArray2[B.llIlIlll[1]] = llIlIlll[5];
                                    nArray2[B.llIlIlll[0]] = llIlIlll[6];
                                    nArray2[B.llIlIlll[3]] = llIlIlll[7];
                                    nArray2[B.llIlIlll[8]] = llIlIlll[9];
                                    if (B.lIllIlIIIIl(e.b(nArray2) ? 1 : 0)) {
                                        a.a(llIlIlll[5], llIlIlll[10]);
                                        a.a(llIlIlll[6], llIlIlll[10]);
                                        a.a(llIlIlll[7], llIlIlll[0]);
                                        a.a(llIlIlll[11], llIlIlll[0]);
                                        a.a(llIlIlll[9], llIlIlll[0]);
                                        a.a(llIlIlll[12], llIlIlll[0]);
                                        a.a(llIlIlll[13], llIlIlll[14]);
                                    }
                                }
                            }
                        }
                        if (B.lIllIlIIIIl(Inventory.contains((int[])f.bb) ? 1 : 0) && B.lIllIlIIIlI(Movement.getRunEnergy(), llIlIlll[15])) {
                            Inventory.getFirst((int[])f.bb).interact(llIlIIll[llIlIlll[4]]);
                            Time.sleepTicks((int)llIlIlll[0]);
                            "".length();
                        }
                        int[] nArray = new int[llIlIlll[0]];
                        nArray[B.llIlIlll[1]] = llIlIlll[13];
                        if (B.lIllIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && B.lIllIlIIllI(B.lIllIIlllIl(e.v(), 50.0))) {
                            int[] nArray3 = new int[llIlIlll[0]];
                            nArray3[B.llIlIlll[1]] = llIlIlll[13];
                            Inventory.getFirst((int[])nArray3).interact(llIlIIll[llIlIlll[14]]);
                            Time.sleepTicks((int)llIlIlll[3]);
                            "".length();
                        }
                        if (B.lIllIlIIIIl(B.ac() ? 1 : 0) && B.lIllIlIIIll(e.j(hU))) {
                            if (B.lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(ce), llIlIlll[16])) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[17]];
                                Movement.walkTo((WorldPoint)ce);
                                "".length();
                                Time.sleepTicks((int)llIlIlll[0]);
                                "".length();
                            }
                            if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(ce), llIlIlll[16])) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[18]];
                                if (B.lIllIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(llIlIIll[llIlIlll[16]], bX);
                            }
                        }
                        if (!B.lIllIlIlIIl(e.j(hU), llIlIlll[0])) break block135;
                        ci = llIlIlll[1];
                        int[] nArray4 = new int[llIlIlll[0]];
                        nArray4[B.llIlIlll[1]] = llIlIlll[11];
                        if (B.lIllIlIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[llIlIlll[0]];
                            nArray5[B.llIlIlll[1]] = llIlIlll[19];
                            if (B.lIllIlIIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[llIlIlll[0]];
                                stringArray[B.llIlIlll[1]] = llIlIIll[llIlIlll[20]];
                                if (B.lIllIlIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    lIlIIlIlIlIlIll = new WorldPoint(llIlIlll[21], llIlIlll[22], llIlIlll[0]);
                                    int[] nArray6 = new int[llIlIlll[0]];
                                    nArray6[B.llIlIlll[1]] = llIlIlll[11];
                                    if (B.lIllIlIIIll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (B.lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIlIlIlIlIll), llIlIlll[14])) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[10]];
                                            Movement.walkTo((WorldPoint)lIlIIlIlIlIlIll);
                                            "".length();
                                            Time.sleepTicks((int)llIlIlll[0]);
                                            "".length();
                                        }
                                        if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIlIlIlIlIll), llIlIlll[14])) {
                                            int[] nArray7 = new int[llIlIlll[0]];
                                            nArray7[B.llIlIlll[1]] = llIlIlll[11];
                                            lIlIIlIlIlIlIlI = TileItems.getNearest((int[])nArray7);
                                            if (B.lIllIlIIlII(lIlIIlIlIlIlIlI)) {
                                                if (B.lIllIlIIIll(Reachable.isInteractable((Locatable)lIlIIlIlIlIlIlI) ? 1 : 0)) {
                                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[23]];
                                                    Movement.walkTo((WorldPoint)lIlIIlIlIlIlIlI.getWorldLocation());
                                                    "".length();
                                                    Time.sleepTicks((int)llIlIlll[0]);
                                                    "".length();
                                                }
                                                if (B.lIllIlIIIIl(Reachable.isInteractable((Locatable)lIlIIlIlIlIlIlI) ? 1 : 0)) {
                                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[24]];
                                                    lIlIIlIlIlIlIlI.interact(llIlIIll[llIlIlll[25]]);
                                                    Time.sleepTicks((int)llIlIlll[8]);
                                                    "".length();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[llIlIlll[0]];
                        nArray8[B.llIlIlll[1]] = llIlIlll[11];
                        if (!B.lIllIlIIIll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[llIlIlll[0]];
                        nArray9[B.llIlIlll[1]] = llIlIlll[19];
                        if (!B.lIllIlIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[llIlIlll[0]];
                    nArray[B.llIlIlll[1]] = llIlIlll[19];
                    if (B.lIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[llIlIlll[0]];
                        nArray10[B.llIlIlll[1]] = llIlIlll[11];
                        if (B.lIllIlIIIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[26]];
                            int[] nArray11 = new int[llIlIlll[0]];
                            nArray11[B.llIlIlll[1]] = llIlIlll[11];
                            int[] nArray12 = new int[llIlIlll[0]];
                            nArray12[B.llIlIlll[1]] = llIlIlll[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)llIlIlll[0]);
                            "".length();
                        }
                    }
                    int[] nArray13 = new int[llIlIlll[0]];
                    nArray13[B.llIlIlll[1]] = llIlIlll[19];
                    if (B.lIllIlIIIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIlll[0]];
                        stringArray[B.llIlIlll[1]] = llIlIIll[llIlIlll[27]];
                        if (B.lIllIlIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (B.lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hQ), llIlIlll[4])) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[28]];
                                Movement.walkTo((WorldPoint)hQ);
                                "".length();
                                Time.sleepTicks((int)llIlIlll[0]);
                                "".length();
                            }
                            if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hQ), llIlIlll[4])) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[29]];
                                String[] stringArray2 = new String[llIlIlll[0]];
                                stringArray2[B.llIlIlll[1]] = llIlIIll[llIlIlll[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(llIlIIll[llIlIlll[31]]);
                                Time.sleepTicks((int)llIlIlll[20]);
                                "".length();
                            }
                        }
                        String[] stringArray3 = new String[llIlIlll[0]];
                        stringArray3[B.llIlIlll[1]] = llIlIIll[llIlIlll[32]];
                        if (B.lIllIlIIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (B.lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hR), llIlIlll[8])) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[33]];
                                Movement.walkTo((WorldPoint)hR);
                                "".length();
                                Time.sleepTicks((int)llIlIlll[0]);
                                "".length();
                            }
                            if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hR), llIlIlll[8])) {
                                int[] nArray14 = new int[llIlIlll[0]];
                                nArray14[B.llIlIlll[1]] = llIlIlll[19];
                                String[] stringArray4 = new String[llIlIlll[0]];
                                stringArray4[B.llIlIlll[1]] = llIlIIll[llIlIlll[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)llIlIlll[0]);
                                "".length();
                            }
                        }
                    }
                }
                String[] stringArray = new String[llIlIlll[0]];
                stringArray[B.llIlIlll[1]] = llIlIIll[llIlIlll[35]];
                if (B.lIllIlIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[llIlIlll[0]];
                    nArray[B.llIlIlll[1]] = llIlIlll[19];
                    if (B.lIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[llIlIlll[0]];
                        stringArray5[B.llIlIlll[1]] = llIlIIll[llIlIlll[36]];
                        if (B.lIllIlIIIll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[37]];
                            if (B.lIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[llIlIlll[0]];
                                stringArray6[B.llIlIlll[1]] = llIlIIll[llIlIlll[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(llIlIIll[llIlIlll[39]]);
                                Time.sleepTicks((int)llIlIlll[4]);
                                "".length();
                            }
                            g.a(bX);
                        }
                    }
                }
                String[] stringArray7 = new String[llIlIlll[0]];
                stringArray7[B.llIlIlll[1]] = llIlIIll[llIlIlll[40]];
                if (B.lIllIlIIIIl(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[llIlIlll[0]];
                    stringArray8[B.llIlIlll[1]] = llIlIIll[llIlIlll[41]];
                    if (B.lIllIlIIIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[llIlIlll[0]];
                        stringArray9[B.llIlIlll[1]] = llIlIIll[llIlIlll[42]];
                        if (B.lIllIlIIIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            lIlIIlIlIlIlIll = new WorldPoint(llIlIlll[43], llIlIlll[44], llIlIlll[1]);
                            lIlIIlIlIlIlIlI = new WorldPoint(llIlIlll[21], llIlIlll[44], llIlIlll[1]);
                            lIlIIlIlIlIlIIl = new WorldArea(llIlIlll[21], llIlIlll[45], llIlIlll[14], llIlIlll[8], llIlIlll[1]);
                            if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIll) ? 1 : 0) && B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIlI) ? 1 : 0) && B.lIllIlIIIll(lIlIIlIlIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[46]];
                                Movement.walkTo((WorldPoint)lIlIIlIlIlIlIll);
                                "".length();
                                Time.sleepTicks((int)llIlIlll[0]);
                                "".length();
                            }
                            if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIll) ? 1 : 0)) {
                                String[] stringArray10 = new String[llIlIlll[0]];
                                stringArray10[B.llIlIlll[1]] = llIlIIll[llIlIlll[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(llIlIIll[llIlIlll[48]]);
                                Time.sleepTicks((int)llIlIlll[3]);
                                "".length();
                            }
                            if (B.lIllIlIIIIl(lIlIIlIlIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[49]];
                                String[] stringArray11 = new String[llIlIlll[0]];
                                stringArray11[B.llIlIlll[1]] = llIlIIll[llIlIlll[50]];
                                TileItems.getNearest((String[])stringArray11).interact(llIlIIll[llIlIlll[51]]);
                                Time.sleepTicks((int)llIlIlll[8]);
                                "".length();
                            }
                        }
                    }
                }
                String[] stringArray12 = new String[llIlIlll[0]];
                stringArray12[B.llIlIlll[1]] = llIlIIll[llIlIlll[52]];
                if (B.lIllIlIIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[llIlIlll[0]];
                    stringArray13[B.llIlIlll[1]] = llIlIIll[llIlIlll[53]];
                    if (B.lIllIlIIIll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        lIlIIlIlIlIlIll = new WorldArea(llIlIlll[21], llIlIlll[45], llIlIlll[14], llIlIlll[8], llIlIlll[1]);
                        lIlIIlIlIlIlIlI = new WorldArea(llIlIlll[54], llIlIlll[55], llIlIlll[18], llIlIlll[23], llIlIlll[1]);
                        if (B.lIllIlIIIIl(lIlIIlIlIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[llIlIlll[0]];
                            stringArray14[B.llIlIlll[1]] = llIlIIll[llIlIlll[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(llIlIIll[llIlIlll[57]]);
                            Time.sleepTicks((int)llIlIlll[3]);
                            "".length();
                        }
                        if (B.lIllIlIIIll(lIlIIlIlIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && B.lIllIlIIIll(hV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[58]];
                            Movement.walkTo((WorldPoint)hS);
                            "".length();
                            Time.sleepTicks((int)llIlIlll[0]);
                            "".length();
                        }
                        if (B.lIllIlIIIIl(lIlIIlIlIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[llIlIlll[0]];
                            stringArray15[B.llIlIlll[1]] = llIlIIll[llIlIlll[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(llIlIIll[llIlIlll[60]]);
                            Time.sleepTicks((int)llIlIlll[4]);
                            "".length();
                        }
                        if (B.lIllIlIIIIl(hV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint lIlIIlIlIIllllI;
                            WorldPoint lIlIIlIlIIlllll;
                            WorldPoint lIlIIlIlIlIIIII;
                            lIlIIlIlIlIlIIl = new WorldPoint(llIlIlll[21], llIlIlll[61], llIlIlll[1]);
                            WorldPoint lIlIIlIlIlIlIII = new WorldPoint(llIlIlll[62], llIlIlll[63], llIlIlll[1]);
                            WorldPoint lIlIIlIlIlIIlll = new WorldPoint(llIlIlll[64], llIlIlll[65], llIlIlll[1]);
                            WorldPoint lIlIIlIlIlIIllI = new WorldPoint(llIlIlll[43], llIlIlll[66], llIlIlll[1]);
                            WorldPoint lIlIIlIlIlIIlIl = new WorldPoint(llIlIlll[67], llIlIlll[66], llIlIlll[1]);
                            WorldPoint lIlIIlIlIlIIlII = new WorldPoint(llIlIlll[67], llIlIlll[66], llIlIlll[1]);
                            WorldArea lIlIIlIlIlIIIll = new WorldArea(llIlIlll[68], llIlIlll[69], llIlIlll[20], llIlIlll[23], llIlIlll[1]);
                            WorldArea lIlIIlIlIlIIIlI = new WorldArea(llIlIlll[70], llIlIlll[71], llIlIlll[14], llIlIlll[17], llIlIlll[1]);
                            WorldArea lIlIIlIlIlIIIIl = new WorldArea(llIlIlll[72], llIlIlll[73], llIlIlll[32], llIlIlll[25], llIlIlll[1]);
                            if (B.lIllIlIlIlI(Vars.getBit((int)llIlIlll[74]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[75]))) {
                                if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIIl) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[76]];
                                    Movement.walkTo((WorldPoint)lIlIIlIlIlIlIIl);
                                    "".length();
                                    Time.sleepTicks((int)llIlIlll[0]);
                                    "".length();
                                }
                                if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIIl) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[77]];
                                    String[] stringArray16 = new String[llIlIlll[0]];
                                    stringArray16[B.llIlIlll[1]] = llIlIIll[llIlIlll[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(llIlIIll[llIlIlll[79]]);
                                    Time.sleepTicks((int)llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[74]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[75]))) {
                                if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIII) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[81]];
                                    Movement.walkTo((WorldPoint)lIlIIlIlIlIlIII);
                                    "".length();
                                    Time.sleepTicks((int)llIlIlll[0]);
                                    "".length();
                                }
                                if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIII) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[82]];
                                    String[] stringArray17 = new String[llIlIlll[0]];
                                    stringArray17[B.llIlIlll[1]] = llIlIIll[llIlIlll[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(llIlIIll[llIlIlll[83]]);
                                    Time.sleepTicks((int)llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[74]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[80]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[75]))) {
                                if (B.lIllIlIIIll(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIlIIIII = new WorldPoint(llIlIlll[21], llIlIlll[84], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[85]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIIIII);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                        String[] stringArray18 = new String[llIlIlll[0]];
                                        stringArray18[B.llIlIlll[1]] = llIlIIll[llIlIlll[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(llIlIIll[llIlIlll[87]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[88]];
                                    String[] stringArray19 = new String[llIlIlll[0]];
                                    stringArray19[B.llIlIlll[1]] = llIlIIll[llIlIlll[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(llIlIIll[llIlIlll[90]]);
                                    Time.sleepTicks((int)llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[74]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[80]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0])) {
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIlIIIII = new WorldPoint(llIlIlll[21], llIlIlll[91], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[92]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIIIII);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                        String[] stringArray20 = new String[llIlIlll[0]];
                                        stringArray20[B.llIlIlll[1]] = llIlIIll[llIlIlll[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(llIlIIll[llIlIlll[94]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (B.lIllIlIIIll(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIII) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[95]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIlIII);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIII) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[96]];
                                        String[] stringArray21 = new String[llIlIlll[0]];
                                        stringArray21[B.llIlIlll[1]] = llIlIIll[llIlIlll[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(llIlIIll[llIlIlll[98]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[74]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0])) {
                                if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIIl) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[99]];
                                    Movement.walkTo((WorldPoint)lIlIIlIlIlIlIIl);
                                    "".length();
                                    Time.sleepTicks((int)llIlIlll[0]);
                                    "".length();
                                }
                                if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIIl) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[100]];
                                    String[] stringArray22 = new String[llIlIlll[0]];
                                    stringArray22[B.llIlIlll[1]] = llIlIIll[llIlIlll[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(llIlIIll[llIlIlll[102]]);
                                    Time.sleepTicks((int)llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[103])) && B.lIllIlIIIll(B.bG() ? 1 : 0)) {
                                if (B.lIllIlIIIll(lIlIIlIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (B.lIllIlIIIIl(lIlIIlIlIlIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lIlIIlIlIlIIIII = new WorldPoint(llIlIlll[104], llIlIlll[84], llIlIlll[1]);
                                        if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[105]];
                                            Movement.walkTo((WorldPoint)lIlIIlIlIlIIIII);
                                            "".length();
                                            Time.sleepTicks((int)llIlIlll[0]);
                                            "".length();
                                        }
                                        if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                            String[] stringArray23 = new String[llIlIlll[0]];
                                            stringArray23[B.llIlIlll[1]] = llIlIIll[llIlIlll[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(llIlIIll[llIlIlll[107]]);
                                            Time.sleepTicks((int)llIlIlll[8]);
                                            "".length();
                                        }
                                    }
                                    if (B.lIllIlIIIIl((lIlIIlIlIlIIIII = new WorldArea(llIlIlll[72], llIlIlll[69], llIlIlll[14], llIlIlll[14], llIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && B.lIllIlIIIll(B.bG() ? 1 : 0)) {
                                        lIlIIlIlIIlllll = new WorldPoint(llIlIlll[108], llIlIlll[109], llIlIlll[1]);
                                        if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[110]];
                                            Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);
                                            "".length();
                                            Time.sleepTicks((int)llIlIlll[0]);
                                            "".length();
                                        }
                                        if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                            String[] stringArray24 = new String[llIlIlll[0]];
                                            stringArray24[B.llIlIlll[1]] = llIlIIll[llIlIlll[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(llIlIIll[llIlIlll[112]]);
                                            Time.sleepTicks((int)llIlIlll[8]);
                                            "".length();
                                        }
                                    }
                                    if (B.lIllIlIIIIl((lIlIIlIlIIlllll = new WorldArea(llIlIlll[70], llIlIlll[69], llIlIlll[14], llIlIlll[14], llIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lIlIIlIlIIllllI = new WorldPoint(llIlIlll[67], llIlIlll[113], llIlIlll[1]);
                                        if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIllllI) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[114]];
                                            Movement.walkTo((WorldPoint)lIlIIlIlIIllllI);
                                            "".length();
                                            Time.sleepTicks((int)llIlIlll[0]);
                                            "".length();
                                        }
                                        if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIllllI) ? 1 : 0)) {
                                            String[] stringArray25 = new String[llIlIlll[0]];
                                            stringArray25[B.llIlIlll[1]] = llIlIIll[llIlIlll[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(llIlIIll[llIlIlll[116]]);
                                            Time.sleepTicks((int)llIlIlll[8]);
                                            "".length();
                                        }
                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && B.lIllIlIIIll(B.bG() ? 1 : 0)) {
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlIl) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[117]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIIlIl);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlIl) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[118]];
                                        String[] stringArray26 = new String[llIlIlll[0]];
                                        stringArray26[B.llIlIlll[1]] = llIlIIll[llIlIlll[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(llIlIIll[llIlIlll[120]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[103]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[121]))) {
                                if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlII) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[122]];
                                    Movement.walkTo((WorldPoint)lIlIIlIlIlIIlII);
                                    "".length();
                                    Time.sleepTicks((int)llIlIlll[0]);
                                    "".length();
                                }
                                if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlII) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[123]];
                                    String[] stringArray27 = new String[llIlIlll[0]];
                                    stringArray27[B.llIlIlll[1]] = llIlIIll[llIlIlll[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(llIlIIll[llIlIlll[125]]);
                                    Time.sleepTicks((int)llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[103]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[121]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[126]))) {
                                lIlIIlIlIlIIIII = new WorldArea(llIlIlll[72], llIlIlll[71], llIlIlll[14], llIlIlll[14], llIlIlll[1]);
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[127], llIlIlll[66], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[128]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray28 = new String[llIlIlll[0]];
                                        stringArray28[B.llIlIlll[1]] = llIlIIll[llIlIlll[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(llIlIIll[llIlIlll[130]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[131], llIlIlll[66], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[132]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray29 = new String[llIlIlll[0]];
                                        stringArray29[B.llIlIlll[1]] = llIlIIll[llIlIlll[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(llIlIIll[llIlIlll[134]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[135]];
                                    String[] stringArray30 = new String[llIlIlll[0]];
                                    stringArray30[B.llIlIlll[1]] = llIlIIll[llIlIlll[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(llIlIIll[llIlIlll[137]]);
                                    Time.sleepTicks((int)llIlIlll[16]);
                                    "".length();
                                }
                            }
                            if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[103]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[121]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[126]), llIlIlll[0])) {
                                lIlIIlIlIlIIIII = new WorldArea(llIlIlll[72], llIlIlll[71], llIlIlll[14], llIlIlll[14], llIlIlll[1]);
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[138], llIlIlll[66], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[139]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray31 = new String[llIlIlll[0]];
                                        stringArray31[B.llIlIlll[1]] = llIlIIll[llIlIlll[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(llIlIIll[llIlIlll[141]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[108], llIlIlll[66], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[142]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray32 = new String[llIlIlll[0]];
                                        stringArray32[B.llIlIlll[1]] = llIlIIll[llIlIlll[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(llIlIIll[llIlIlll[144]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlIl) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[145]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIIlIl);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlIl) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[146]];
                                        String[] stringArray33 = new String[llIlIlll[0]];
                                        stringArray33[B.llIlIlll[1]] = llIlIIll[llIlIlll[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(llIlIIll[llIlIlll[148]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[103])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[121]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[126]), llIlIlll[0])) {
                                lIlIIlIlIlIIIII = new WorldArea(llIlIlll[72], llIlIlll[71], llIlIlll[14], llIlIlll[14], llIlIlll[1]);
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[127], llIlIlll[66], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[149]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray34 = new String[llIlIlll[0]];
                                        stringArray34[B.llIlIlll[1]] = llIlIIll[llIlIlll[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(llIlIIll[llIlIlll[151]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[104], llIlIlll[152], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[153]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);
                                        "".length();
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        Time.sleepTicks((int)llIlIlll[0]);
                                        "".length();
                                        String[] stringArray35 = new String[llIlIlll[0]];
                                        stringArray35[B.llIlIlll[1]] = llIlIIll[llIlIlll[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(llIlIIll[llIlIlll[155]]);
                                        Time.sleepTicks((int)llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (B.lIllIlIIIIl((lIlIIlIlIIlllll = new WorldArea(llIlIlll[72], llIlIlll[69], llIlIlll[14], llIlIlll[14], llIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && B.lIllIlIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[156]];
                                    Time.sleepTicks((int)llIlIlll[0]);
                                    "".length();
                                    int[] nArray = new int[llIlIlll[0]];
                                    nArray[B.llIlIlll[1]] = llIlIlll[157];
                                    TileObjects.getNearest((int[])nArray).interact(llIlIIll[llIlIlll[158]]);
                                    Time.sleepTicks((int)llIlIlll[8]);
                                    "".length();
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[llIlIlll[0]];
                                    nArray[B.llIlIlll[1]] = llIlIlll[159];
                                    TileObjects.getNearest((int[])nArray).interact(llIlIIll[llIlIlll[160]]);
                                    Time.sleepTicks((int)llIlIlll[8]);
                                    "".length();
                                }
                                if (B.lIllIlIIIIl((lIlIIlIlIIllllI = new WorldArea(llIlIlll[161], llIlIlll[162], llIlIlll[23], llIlIlll[14], llIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[llIlIlll[0]];
                                    stringArray36[B.llIlIlll[1]] = llIlIIll[llIlIlll[163]];
                                    if (B.lIllIlIIIll(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[llIlIlll[0]];
                                        stringArray37[B.llIlIlll[1]] = llIlIIll[llIlIlll[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(llIlIIll[llIlIlll[165]]);
                                        Time.sleepTicks((int)llIlIlll[14]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[llIlIlll[0]];
                stringArray38[B.llIlIlll[1]] = llIlIIll[llIlIlll[166]];
                if (B.lIllIlIIIIl(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[llIlIlll[0]];
                    stringArray39[B.llIlIlll[1]] = llIlIIll[llIlIlll[167]];
                    if (B.lIllIlIIIIl(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        lIlIIlIlIlIlIll = new WorldArea(llIlIlll[161], llIlIlll[162], llIlIlll[23], llIlIlll[14], llIlIlll[1]);
                        if (B.lIllIlIIIIl(lIlIIlIlIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[llIlIlll[0]];
                            nArray[B.llIlIlll[1]] = llIlIlll[159];
                            TileObjects.getNearest((int[])nArray).interact(llIlIIll[llIlIlll[168]]);
                            Time.sleepTicks((int)llIlIlll[14]);
                            "".length();
                        }
                        if (B.lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[169]];
                            Movement.walkTo((WorldPoint)hT);
                            "".length();
                            Time.sleepTicks((int)llIlIlll[0]);
                            "".length();
                        }
                        if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                            lIlIIlIlIlIlIlI = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (B.lIllIlIIIIl(tileObject.getName().contains(llIlIIll[llIlIlll[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[llIlIlll[0]];
                                    stringArray[B.llIlIlll[1]] = llIlIIll[llIlIlll[186]];
                                    if (B.lIllIlIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && B.lIllIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlll[21], llIlIlll[184], llIlIlll[3])), llIlIlll[3])) {
                                        n2 = llIlIlll[0];
                                        "".length();
                                        if (-(0xBA ^ 0xBE) < 0) return n2 != 0;
                                        return ((0x2B ^ 9) & ~(0x44 ^ 0x66)) != 0;
                                    }
                                }
                                n2 = llIlIlll[1];
                                return n2 != 0;
                            });
                            if (B.lIllIlIIlII(lIlIIlIlIlIlIlI)) {
                                lIlIIlIlIlIlIlI.interact(llIlIIll[llIlIlll[170]]);
                                Time.sleepTicks((int)llIlIlll[8]);
                                "".length();
                            }
                            if (B.lIllIlIlIll(lIlIIlIlIlIlIlI)) {
                                g.a(llIlIIll[llIlIlll[171]], bX, llIlIlll[0]);
                            }
                        }
                    }
                }
            }
            if (B.lIllIlIlIIl(e.j(hU), llIlIlll[3])) {
                if (B.lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                    AccBuilderBarrows.c = llIlIIll[llIlIlll[172]];
                    Movement.walkTo((WorldPoint)hT);
                    "".length();
                    Time.sleepTicks((int)llIlIlll[0]);
                    "".length();
                }
                if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                    lIlIIlIlIlIlIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (B.lIllIlIIIIl(tileObject.getName().contains(llIlIIll[llIlIlll[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[llIlIlll[0]];
                            stringArray[B.llIlIlll[1]] = llIlIIll[llIlIlll[183]];
                            if (B.lIllIlIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && B.lIllIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlll[21], llIlIlll[184], llIlIlll[3])), llIlIlll[3])) {
                                n2 = llIlIlll[0];
                                "".length();
                                if (null == null) return n2 != 0;
                                return ((0xE7 ^ 0xBB) & ~(0x67 ^ 0x3B)) != 0;
                            }
                        }
                        n2 = llIlIlll[1];
                        return n2 != 0;
                    });
                    if (B.lIllIlIIlII(lIlIIlIlIlIlIll)) {
                        lIlIIlIlIlIlIll.interact(llIlIIll[llIlIlll[173]]);
                        Time.sleepTicks((int)llIlIlll[8]);
                        "".length();
                    }
                    if (B.lIllIlIlIll(lIlIIlIlIlIlIll)) {
                        if (B.lIllIlIIIlI(ci, llIlIlll[0])) {
                            Q.mx += llIlIlll[0];
                            Q.o(AccBuilderBarrows.m);
                            ci += llIlIlll[0];
                            Q.mx = llIlIlll[1];
                            cj = llIlIlll[1];
                        }
                        g.a(llIlIIll[llIlIlll[174]], bX, llIlIlll[0]);
                    }
                }
            }
            g.a(bX);
        }
    }

    @Override
    public boolean T() {
        return llIlIlll[1];
    }

    private static boolean lIllIlIlIll(Object object) {
        return object == null;
    }

    private static void lIllIIllIll() {
        llIlIIll = new String[llIlIlll[197]];
        B.llIlIIll[B.llIlIlll[1]] = B.lIlIllllIII("CColLRsmJi9kCjs6IioPbio/IQU9b2s3Hyc3KCwBICRrJgktKGswB24yPiEbOg==", "NCKDh");
        B.llIlIIll[B.llIlIlll[0]] = B.lIlIllllIIl("jQt0D+Hb58gVXMrJcYyPfg==", "IvYvz");
        B.llIlIIll[B.llIlIlll[3]] = B.lIlIllllIII("MioMKBYTJQVsGBslCSUUHQ==", "zKbLz");
        B.llIlIIll[B.llIlIlll[8]] = B.lIlIllllIlI("gDxcF+dNtM15b4n0NLBU0rKfVSm48IpKZOLrneQCxvJb6J16e2V+2w24MmANbAN8mhtCpM+3zcA=", "YBUjS");
        B.llIlIIll[B.llIlIlll[4]] = B.lIlIllllIIl("7G1S6/gnShI=", "IQQos");
        B.llIlIIll[B.llIlIlll[14]] = B.lIlIllllIlI("Vuw1mc0WgrI=", "kVTup");
        B.llIlIIll[B.llIlIlll[17]] = B.lIlIllllIlI("4ufZbDkAY4CSxPZEsv5VVQ==", "NWaLp");
        B.llIlIIll[B.llIlIlll[18]] = B.lIlIllllIlI("e59qE6sORtfEDMismdEy/g==", "yrqRv");
        B.llIlIIll[B.llIlIlll[16]] = B.lIlIllllIlI("sZ126CZE42Prp+d6UZujGA==", "jVmjB");
        B.llIlIIll[B.llIlIlll[20]] = B.lIlIllllIII("HgA4", "UeAMB");
        B.llIlIIll[B.llIlIlll[10]] = B.lIlIllllIIl("C+N34LjtIrn2VF4fjBRdamfdwm9jRYN2", "cXqvX");
        B.llIlIIll[B.llIlIlll[23]] = B.lIlIllllIIl("LZVy/AHt6EKjlgzLOe+z72zcJZnFbqMC", "zvYqd");
        B.llIlIIll[B.llIlIlll[24]] = B.lIlIllllIIl("Frwc17uljZfGGV3ZhBdujw==", "ZKbaA");
        B.llIlIIll[B.llIlIlll[25]] = B.lIlIllllIII("HiQ8NQ==", "JEWPr");
        B.llIlIIll[B.llIlIlll[26]] = B.lIlIllllIII("PywlIxcVbT4lEAEiIGofGz4mah8dIio=", "rMNJy");
        B.llIlIIll[B.llIlIlll[27]] = B.lIlIllllIIl("F/PuQIT4Z9E=", "WLlTx");
        B.llIlIIll[B.llIlIlll[28]] = B.lIlIllllIlI("PrVR2K5t4Go/wcKPqBI6hg==", "bxeCK");
        B.llIlIIll[B.llIlIlll[29]] = B.lIlIllllIlI("5tIZhSQpM5A=", "UZQuU");
        B.llIlIIll[B.llIlIlll[30]] = B.lIlIllllIlI("pW5OHwLPxBAy9PQi71yt+A==", "lGCNn");
        B.llIlIIll[B.llIlIlll[31]] = B.lIlIllllIIl("fTgeUE29Hro=", "QVoaa");
        B.llIlIIll[B.llIlIlll[32]] = B.lIlIllllIIl("xMxMh1ZDMI0=", "GYtVL");
        B.llIlIIll[B.llIlIlll[33]] = B.lIlIllllIIl("v+r26S5LyuOFRC/NBvilLQ==", "CVfIb");
        B.llIlIIll[B.llIlIlll[34]] = B.lIlIllllIlI("yHPFBxfR0lFCu7wnLAs3ZA==", "QGWIh");
        B.llIlIIll[B.llIlIlll[35]] = B.lIlIllllIIl("7OVyuYLWhto=", "FiVgS");
        B.llIlIIll[B.llIlIlll[36]] = B.lIlIllllIII("IxEfBAcGER9XExIWHRI=", "sczwt");
        B.llIlIIll[B.llIlIlll[37]] = B.lIlIllllIlI("fTaWHrv6XKz8qdnoLU3FAA==", "KKtMr");
        B.llIlIIll[B.llIlIlll[38]] = B.lIlIllllIII("IQAGCBoGBh0=", "gosfn");
        B.llIlIIll[B.llIlIlll[39]] = B.lIlIllllIlI("uoEE/6fgGpg=", "mYAaq");
        B.llIlIIll[B.llIlIlll[40]] = B.lIlIllllIlI("PpfSvfj33L4=", "OYHDW");
        B.llIlIIll[B.llIlIlll[41]] = B.lIlIllllIlI("XV3hoi+XMF7kGiTuJXbT6w==", "tHOvM");
        B.llIlIIll[B.llIlIlll[42]] = B.lIlIllllIIl("fctHWTgDDn1KJxJ2KgX4gA==", "xSCrr");
        B.llIlIIll[B.llIlIlll[46]] = B.lIlIllllIIl("OoXjWah0pOpIQ8IisxPukg==", "JqtJs");
        B.llIlIIll[B.llIlIlll[47]] = B.lIlIllllIIl("+Vg23QA1CgI=", "BImat");
        B.llIlIIll[B.llIlIlll[48]] = B.lIlIllllIII("DAgrAg==", "CxNlh");
        B.llIlIIll[B.llIlIlll[49]] = B.lIlIllllIIl("g5GJAPmlyGvB3/qVZzuyLA==", "PTjqS");
        B.llIlIIll[B.llIlIlll[50]] = B.lIlIllllIlI("+LULHUlXhmn2ZrHdvQ2Jww==", "hNdlq");
        B.llIlIIll[B.llIlIlll[51]] = B.lIlIllllIII("GSg5Fw==", "MIRrV");
        B.llIlIIll[B.llIlIlll[52]] = B.lIlIllllIIl("pciKp3NwRrJtqP2c6oJxCA==", "lWCgq");
        B.llIlIIll[B.llIlIlll[53]] = B.lIlIllllIII("HwEPTwkxBg==", "Phcoj");
        B.llIlIIll[B.llIlIlll[56]] = B.lIlIllllIII("KDkIKg==", "lVgXB");
        B.llIlIIll[B.llIlIlll[57]] = B.lIlIllllIlI("/RCXj+oFC7s=", "Mfslo");
        B.llIlIIll[B.llIlIlll[58]] = B.lIlIllllIlI("Y8E4hMhKt/VY6OduI+IvJJJJVrD8Y2SY", "UXLyU");
        B.llIlIIll[B.llIlIlll[59]] = B.lIlIllllIlI("raGDm9FKIf8=", "qxPde");
        B.llIlIIll[B.llIlIlll[60]] = B.lIlIllllIIl("XErEygWjk3LZs9Z1koBSXA==", "haYfj");
        B.llIlIIll[B.llIlIlll[76]] = B.lIlIllllIIl("+sBgie0Cs3T/NBhjvngaRQ==", "ZODZq");
        B.llIlIIll[B.llIlIlll[77]] = B.lIlIllllIIl("UOkNTIJ7USFsQ1oyumGOug==", "SvpbN");
        B.llIlIIll[B.llIlIlll[78]] = B.lIlIllllIII("ND0YLSFYGQ==", "xXnHS");
        B.llIlIIll[B.llIlIlll[79]] = B.lIlIllllIII("AzQjCw==", "SAOgW");
        B.llIlIIll[B.llIlIlll[81]] = B.lIlIllllIII("BTsycDskeiY=", "KZDPO");
        B.llIlIIll[B.llIlIlll[82]] = B.lIlIllllIlI("VIiXRU/3K7PjqfQOjcEoDQ==", "LKhoG");
        B.llIlIIll[B.llIlIlll[15]] = B.lIlIllllIIl("ZWbrf35kA2A=", "LEvnH");
        B.llIlIIll[B.llIlIlll[83]] = B.lIlIllllIlI("SeehXlS+gNw=", "YSoXa");
        B.llIlIIll[B.llIlIlll[85]] = B.lIlIllllIlI("VUunmXCsXRTNYZ/dq9cvGA==", "UOTlG");
        B.llIlIIll[B.llIlIlll[86]] = B.lIlIllllIIl("O2ZZaNPXLbM=", "EBoFw");
        B.llIlIIll[B.llIlIlll[87]] = B.lIlIllllIlI("vJQBuPKbWhk=", "jVnhT");
        B.llIlIIll[B.llIlIlll[88]] = B.lIlIllllIII("MyYoDlUPNjIHBw==", "cSDbu");
        B.llIlIIll[B.llIlIlll[89]] = B.lIlIllllIII("Jz0GHRxLHA==", "kXpxn");
        B.llIlIIll[B.llIlIlll[90]] = B.lIlIllllIlI("Dr1UBGQ+PSs=", "DloQn");
        B.llIlIIll[B.llIlIlll[92]] = B.lIlIllllIII("LzoVFXYWOkMUOQ0n", "bUcpV");
        B.llIlIIll[B.llIlIlll[93]] = B.lIlIllllIlI("d2wJMVBzn4k=", "rrHYM");
        B.llIlIIll[B.llIlIlll[94]] = B.lIlIllllIlI("36wHih/hEkI=", "VvnQg");
        B.llIlIIll[B.llIlIlll[95]] = B.lIlIllllIlI("8CaIuuY2mOF90PDVhPjZdg==", "vfQXX");
        B.llIlIIll[B.llIlIlll[96]] = B.lIlIllllIII("KjchAFEWJzsJAw==", "zBMlq");
        B.llIlIIll[B.llIlIlll[97]] = B.lIlIllllIlI("HsnCmVEzU40=", "lgNXf");
        B.llIlIIll[B.llIlIlll[98]] = B.lIlIllllIlI("U+8D17Mya6w=", "tqObP");
        B.llIlIIll[B.llIlIlll[99]] = B.lIlIllllIII("JTkFcRMEeBI=", "kXsQg");
        B.llIlIIll[B.llIlIlll[100]] = B.lIlIllllIII("NgQiPmgKFDg3Og==", "fqNRH");
        B.llIlIIll[B.llIlIlll[101]] = B.lIlIllllIIl("pb9vUxxJtT8=", "IpJOD");
        B.llIlIIll[B.llIlIlll[102]] = B.lIlIllllIIl("VkIUTg/QqVA=", "QlNla");
        B.llIlIIll[B.llIlIlll[105]] = B.lIlIllllIIl("6LaC1PDsryCeE1M6p859og==", "qFCQN");
        B.llIlIIll[B.llIlIlll[106]] = B.lIlIllllIlI("2OzULFaXWQQ=", "wlMOg");
        B.llIlIIll[B.llIlIlll[107]] = B.lIlIllllIlI("jZhOuG+gsFQ=", "bwaVs");
        B.llIlIIll[B.llIlIlll[110]] = B.lIlIllllIIl("XUFHkaIUgS59REzvuVLSjg==", "EeojF");
        B.llIlIIll[B.llIlIlll[111]] = B.lIlIllllIII("BSkMHA==", "AFcnQ");
        B.llIlIIll[B.llIlIlll[112]] = B.lIlIllllIIl("yBBpuT2K008=", "udDso");
        B.llIlIIll[B.llIlIlll[114]] = B.lIlIllllIII("Kw0gA0kSDXYCBgkQ", "fbVfi");
        B.llIlIIll[B.llIlIlll[115]] = B.lIlIllllIlI("6Nh3gYnYjIg=", "sZQsO");
        B.llIlIIll[B.llIlIlll[116]] = B.lIlIllllIII("BQEdLA==", "JqxBq");
        B.llIlIIll[B.llIlIlll[117]] = B.lIlIllllIII("ITkERgAAeBc=", "oXrft");
        B.llIlIIll[B.llIlIlll[118]] = B.lIlIllllIlI("zGGJlXETK3A4ZfbJNcHAEg==", "Kscum");
        B.llIlIIll[B.llIlIlll[119]] = B.lIlIllllIII("JBMwMjZIMw==", "hvFWD");
        B.llIlIIll[B.llIlIlll[120]] = B.lIlIllllIIl("jqMND+gQMYM=", "BAzTi");
        B.llIlIIll[B.llIlIlll[122]] = B.lIlIllllIII("JTE+WBYEcC4=", "kPHxb");
        B.llIlIIll[B.llIlIlll[123]] = B.lIlIllllIlI("urQkDOpS0Y2s1SzK322RXA==", "LdKbq");
        B.llIlIIll[B.llIlIlll[124]] = B.lIlIllllIlI("RbMEo1hyZ6o=", "cmDNM");
        B.llIlIIll[B.llIlIlll[125]] = B.lIlIllllIII("IAwFCw==", "pyigy");
        B.llIlIIll[B.llIlIlll[128]] = B.lIlIllllIlI("T7dyh5ZVI8s4CmlUs65atg==", "dMuBZ");
        B.llIlIIll[B.llIlIlll[129]] = B.lIlIllllIlI("AeQ1QFyocBc=", "kXzGn");
        B.llIlIIll[B.llIlIlll[130]] = B.lIlIllllIIl("4qdqIc4KwkI=", "mAITm");
        B.llIlIIll[B.llIlIlll[132]] = B.lIlIllllIlI("RB5LIqxvNfG8qyVBvGAj4w==", "zJyYw");
        B.llIlIIll[B.llIlIlll[133]] = B.lIlIllllIlI("gNE3EVKWkhY=", "eaggl");
        B.llIlIIll[B.llIlIlll[134]] = B.lIlIllllIlI("22imJoT250w=", "YhYHA");
        B.llIlIIll[B.llIlIlll[135]] = B.lIlIllllIIl("/ApCOOVS6Ceo/3evcdVARA==", "vppXw");
        B.llIlIIll[B.llIlIlll[136]] = B.lIlIllllIII("HDMzAgNwFQ==", "PVEgq");
        B.llIlIIll[B.llIlIlll[137]] = B.lIlIllllIlI("x93nQC18zZU=", "mLUjx");
        B.llIlIIll[B.llIlIlll[139]] = B.lIlIllllIII("AgUsLGo7BXotJSAY", "OjZIJ");
        B.llIlIIll[B.llIlIlll[140]] = B.lIlIllllIlI("H3spY2xtl5A=", "tkZEH");
        B.llIlIIll[B.llIlIlll[141]] = B.lIlIllllIlI("g+udZyFdTvU=", "wMdma");
        B.llIlIIll[B.llIlIlll[142]] = B.lIlIllllIII("BQgOLms8CFgvJCcV", "HgxKK");
        B.llIlIIll[B.llIlIlll[143]] = B.lIlIllllIII("HQY2JA==", "YiYVN");
        B.llIlIIll[B.llIlIlll[144]] = B.lIlIllllIlI("3F5+LB5Zlh8=", "pTBhf");
        B.llIlIIll[B.llIlIlll[145]] = B.lIlIllllIII("GREgVRs4UDM=", "WpVuo");
        B.llIlIIll[B.llIlIlll[146]] = B.lIlIllllIIl("IZKkzIKZWOCNsyx629kXjw==", "KVMOE");
        B.llIlIIll[B.llIlIlll[147]] = B.lIlIllllIIl("FcrqIOdkqxA=", "TkXSA");
        B.llIlIIll[B.llIlIlll[148]] = B.lIlIllllIIl("fWbmqR5tsE0=", "kPnvH");
        B.llIlIIll[B.llIlIlll[149]] = B.lIlIllllIlI("rKp8LaraWd2Ap6Eor7t4Jg==", "JQnpH");
        B.llIlIIll[B.llIlIlll[150]] = B.lIlIllllIlI("OZVxBbCySGw=", "PpoFZ");
        B.llIlIIll[B.llIlIlll[151]] = B.lIlIllllIIl("jlPv7NctA94=", "ZZpTD");
        B.llIlIIll[B.llIlIlll[153]] = B.lIlIllllIlI("B+wvz10ZfYm/MY59VTLpJQ==", "NVfKP");
        B.llIlIIll[B.llIlIlll[154]] = B.lIlIllllIIl("2z5K1hfijzo=", "jaIvN");
        B.llIlIIll[B.llIlIlll[155]] = B.lIlIllllIlI("etBwcNl2QEE=", "pGvwh");
        B.llIlIIll[B.llIlIlll[156]] = B.lIlIllllIIl("Zv5lLE7rJwgsi+2BZLKi9Q==", "uRbSF");
        B.llIlIIll[B.llIlIlll[158]] = B.lIlIllllIII("KikBAQ==", "eYdoq");
        B.llIlIIll[B.llIlIlll[160]] = B.lIlIllllIII("CCEuLw==", "GQKAP");
        B.llIlIIll[B.llIlIlll[163]] = B.lIlIllllIlI("NADmhdt6B8Q=", "nvNGB");
        B.llIlIIll[B.llIlIlll[164]] = B.lIlIllllIII("DS8ubQwjKA==", "BFBMo");
        B.llIlIIll[B.llIlIlll[165]] = B.lIlIllllIlI("3mg7VfXtwTY=", "fZeRb");
        B.llIlIIll[B.llIlIlll[166]] = B.lIlIllllIII("IBkJOAsATB8vDBc=", "rlkZn");
        B.llIlIIll[B.llIlIlll[167]] = B.lIlIllllIlI("LILYQo1nu1k=", "GiUIV");
        B.llIlIIll[B.llIlIlll[168]] = B.lIlIllllIII("KiUyGg==", "eUWtY");
        B.llIlIIll[B.llIlIlll[169]] = B.lIlIllllIIl("fGdjecGF19Z/TtoXDnro8Dr7Bd5Tzmot", "BMMsi");
        B.llIlIIll[B.llIlIlll[170]] = B.lIlIllllIIl("/0AO566pooE=", "eqqLQ");
        B.llIlIIll[B.llIlIlll[171]] = B.lIlIllllIII("OzUNAxcYNA0XUiQjBgAcGDMHDBw=", "kGber");
        B.llIlIIll[B.llIlIlll[172]] = B.lIlIllllIIl("kb4NM5yI3mmrtlyHYygDofJbNyb41/h7", "TaEXp");
        B.llIlIIll[B.llIlIlll[173]] = B.lIlIllllIlI("Y/1cHNwWUC4=", "nZubu");
        B.llIlIIll[B.llIlIlll[174]] = B.lIlIllllIIl("VMCupC6ZNEpchzY0nKDBIhjMjKpOJ+7q", "LJgdZ");
        B.llIlIIll[B.llIlIlll[180]] = B.lIlIllllIlI("E0kZaT6brMsXXB+nLb3wUAXR8ZyjcXVY", "vDwNY");
        B.llIlIIll[B.llIlIlll[181]] = B.lIlIllllIlI("TMfU7B5YPxWR8BI10tiIRDaOVVmG/GO/", "WHXWo");
        B.llIlIIll[B.llIlIlll[182]] = B.lIlIllllIIl("qJtEeCmzt6A=", "ckoma");
        B.llIlIIll[B.llIlIlll[183]] = B.lIlIllllIlI("5lyg7jgZZJs=", "dzvam");
        B.llIlIIll[B.llIlIlll[185]] = B.lIlIllllIlI("WUvWXgsRUH8=", "DJIei");
        B.llIlIIll[B.llIlIlll[186]] = B.lIlIllllIII("GjMBBQ==", "UCdkf");
        B.llIlIIll[B.llIlIlll[193]] = B.lIlIllllIlI("qJDHruvHmxY=", "tsnup");
        B.llIlIIll[B.llIlIlll[194]] = B.lIlIllllIII("MHUVSz0WPRMCPx5yHgQjWTNYDCQAchsKPRU3HEsUCzwdGCVX", "yRxkQ");
        B.llIlIIll[B.llIlIlll[195]] = B.lIlIllllIlI("ko21TuB97D3dh1Pb2gl2Xc/WN7y+aCSXHSuCNxx9Q+/niz3URlQf2MX6+9dGM0HYfgjpgCQfb3y/69y5655QIg==", "EoTZe");
    }

    private static boolean lIllIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (B.lIllIlIllII(e.j(llIlIlll[47]), llIlIlll[8])) {
            bl = llIlIlll[0];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((0x3D ^ 0x2C ^ (0x51 ^ 0x5A)) & (0x40 ^ 0x39 ^ (0xE0 ^ 0x83) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIlll[1];
        }
        return bl;
    }

    private static boolean lIllIlIIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int U() {
        try {
            B.bF();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() == 0) {
            return (0x4D ^ 0x4B ^ (0xC3 ^ 0x94)) & (0x81 ^ 0x86 ^ (0x49 ^ 0x1F) ^ -" ".length());
        }
        return llIlIlll[144];
    }

    private static String lIlIllllIlI(String lIlIIlIIllIlllI, String lIlIIlIIllIllIl) {
        try {
            SecretKeySpec lIlIIlIIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIIllIllIl.getBytes(StandardCharsets.UTF_8)), llIlIlll[16]), "DES");
            Cipher lIlIIlIIlllIIlI = Cipher.getInstance("DES");
            lIlIIlIIlllIIlI.init(llIlIlll[3], lIlIIlIIlllIIll);
            return new String(lIlIIlIIlllIIlI.doFinal(Base64.getDecoder().decode(lIlIIlIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlIIlllIIIl) {
            lIlIIlIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static int lIllIIlllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void lIllIIlllII() {
        llIlIlll = new int[198];
        B.llIlIlll[0] = " ".length();
        B.llIlIlll[1] = (0xA9 ^ 0x9E) & ~(0x3B ^ 0xC);
        B.llIlIlll[2] = 0xFFFFF7A9 & 0x1BDE;
        B.llIlIlll[3] = "  ".length();
        B.llIlIlll[4] = 0xD3 ^ 0xC7 ^ (8 ^ 0x18);
        B.llIlIlll[5] = 0xFFFFBFD7 & 0x5F6F;
        B.llIlIlll[6] = -(0xFFFFF3AB & 0x2F75) & (0xFFFFFFFF & 0x6FBF);
        B.llIlIlll[7] = 0xFFFF9FBF & 0x63F8;
        B.llIlIlll[8] = "   ".length();
        B.llIlIlll[9] = -(0xFFFFFEEF & 0x5F5D) & (0xFFFFDFFD & 0x7F5F);
        B.llIlIlll[10] = 0x98 ^ 0x92;
        B.llIlIlll[11] = -(0xFFFFF6E6 & Short.MAX_VALUE) & (0xFFFFFFF5 & 0x77FF);
        B.llIlIlll[12] = 0xFFFFBDDB & 0x7375;
        B.llIlIlll[13] = -(0xFFFFFC93 & 0x73ED) & (0xFFFFF5FB & 0x7BFF);
        B.llIlIlll[14] = 111 + 49 - 45 + 58 ^ 152 + 2 - 62 + 76;
        B.llIlIlll[15] = 0x46 ^ 0x74;
        B.llIlIlll[16] = 0x9B ^ 0x93;
        B.llIlIlll[17] = 0xFC ^ 0xB0 ^ (0xF2 ^ 0xB8);
        B.llIlIlll[18] = 0x33 ^ 0x5D ^ (0xC5 ^ 0xAC);
        B.llIlIlll[19] = 0xFFFFFD5F & 0x3B2;
        B.llIlIlll[20] = 0x1E ^ 0x17;
        B.llIlIlll[21] = 0xFFFF9F3F & 0x6CE4;
        B.llIlIlll[22] = -(0xFFFFFBAB & 0x64D7) & (0xFFFFFDBF & 0x6FDF);
        B.llIlIlll[23] = 0x9C ^ 0x97;
        B.llIlIlll[24] = 27 + 82 - 31 + 108 ^ 19 + 49 - -25 + 89;
        B.llIlIlll[25] = 0x67 ^ 0x6A;
        B.llIlIlll[26] = (0x97 ^ 0xAE) & ~(0xAA ^ 0x93) ^ (0x20 ^ 0x2E);
        B.llIlIlll[27] = 166 + 138 - 258 + 157 ^ 74 + 165 - 174 + 131;
        B.llIlIlll[28] = 0x20 ^ 0x30;
        B.llIlIlll[29] = 0x6B ^ 0x7A;
        B.llIlIlll[30] = 7 ^ 0x15;
        B.llIlIlll[31] = 147 + 28 - 81 + 72 ^ 117 + 34 - 73 + 103;
        B.llIlIlll[32] = 0xB2 ^ 0xA6;
        B.llIlIlll[33] = 0x10 ^ 5;
        B.llIlIlll[34] = 0x88 ^ 0x9E;
        B.llIlIlll[35] = 0x50 ^ 0x47;
        B.llIlIlll[36] = 0xAE ^ 0xB6;
        B.llIlIlll[37] = 0xB6 ^ 0xAF;
        B.llIlIlll[38] = 0x74 ^ 0x6E;
        B.llIlIlll[39] = 0x6E ^ 0x75;
        B.llIlIlll[40] = 85 + 50 - 90 + 136 ^ 149 + 90 - 168 + 98;
        B.llIlIlll[41] = 0x54 ^ 0x46 ^ (0x9C ^ 0x93);
        B.llIlIlll[42] = 0xD ^ 0x29 ^ (0xA ^ 0x30);
        B.llIlIlll[43] = -(0xFFFFFAFB & 0x75DD) & (0xFFFFFEFF & 0x7DFB);
        B.llIlIlll[44] = 0xFFFFAD2F & 0x5FF7;
        B.llIlIlll[45] = 0xFFFFCFA6 & 0x3D7F;
        B.llIlIlll[46] = 124 + 115 - 200 + 102 ^ 58 + 122 - 116 + 82;
        B.llIlIlll[47] = 0x8C ^ 0xA2 ^ (0x8C ^ 0x82);
        B.llIlIlll[48] = 0xAB ^ 0xB7 ^ (0x20 ^ 0x1D);
        B.llIlIlll[49] = 0x8A ^ 0xA8;
        B.llIlIlll[50] = 0x60 ^ 0x43;
        B.llIlIlll[51] = 0x96 ^ 0xB8 ^ (0x5E ^ 0x54);
        B.llIlIlll[52] = 0x65 ^ 0x40;
        B.llIlIlll[53] = 0x72 ^ 0x54;
        B.llIlIlll[54] = 0xFFFF8E7B & 0x7D96;
        B.llIlIlll[55] = 0xFFFF8D3F & 0x7FD9;
        B.llIlIlll[56] = 24 + 190 - 77 + 54 ^ 103 + 6 - 68 + 111;
        B.llIlIlll[57] = 0x55 ^ 0x7D;
        B.llIlIlll[58] = 0x6F ^ 0x2B ^ (0xAA ^ 0xC7);
        B.llIlIlll[59] = 116 + 158 - 181 + 144 ^ 104 + 180 - 217 + 132;
        B.llIlIlll[60] = 0x21 ^ 0xA;
        B.llIlIlll[61] = 0xFFFFF6F2 & 0x2F1F;
        B.llIlIlll[62] = -(0xFFFFF9D6 & 0x263B) & (0xFFFFEDBD & 0x3E7F);
        B.llIlIlll[63] = 0xFFFFE7BF & 0x3E58;
        B.llIlIlll[64] = 0xFFFF9E6E & 0x6DB7;
        B.llIlIlll[65] = -(0xFFFFFC4F & 0x43F7) & (0xFFFFE767 & 0x7EFF);
        B.llIlIlll[66] = -(20 + 134 - 9 + 2) & (0xFFFFB6FF & 0x6FB7);
        B.llIlIlll[67] = -(0xFFFFFF93 & 0x71ED) & (0xFFFFFFDB & 0x7DBD);
        B.llIlIlll[68] = 0xFFFFFC3D & 0xFE3;
        B.llIlIlll[69] = 0xFFFFBE1F & 0x67FE;
        B.llIlIlll[70] = -(0xFFFFF7FF & 0x5A61) & (0xFFFFFF7F & 0x5EF7);
        B.llIlIlll[71] = 0xFFFFE677 & 0x3FAB;
        B.llIlIlll[72] = 0xFFFFDF5E & 0x2CBD;
        B.llIlIlll[73] = 0xFFFFAE31 & 0x77DF;
        B.llIlIlll[74] = -(0xFFFFDB66 & 0x359B) & (0xFFFF9FFF & 0x77FD);
        B.llIlIlll[75] = 0xFFFFFEFF & 0x7FF;
        B.llIlIlll[76] = 0x4B ^ 0x30 ^ (0x52 ^ 5);
        B.llIlIlll[77] = 0x47 ^ 0x48 ^ (0x5B ^ 0x79);
        B.llIlIlll[78] = 0x58 ^ 0x76;
        B.llIlIlll[79] = 171 + 18 - 115 + 162 ^ 79 + 106 - 33 + 43;
        B.llIlIlll[80] = -(0xFFFFEF31 & 0x59CF) & (0xFFFFEFFD & 0x5FFF);
        B.llIlIlll[81] = 68 + 96 - 155 + 140 ^ 35 + 101 - 7 + 36;
        B.llIlIlll[82] = 0x91 ^ 0xA0;
        B.llIlIlll[83] = 15 + 32 - 17 + 113 ^ 3 + 122 - -29 + 34;
        B.llIlIlll[84] = -(0xFFFFDFFD & 0x39C3) & (0xFFFFFFDD & 0x3FFF);
        B.llIlIlll[85] = 130 + 143 - 251 + 138 ^ 48 + 35 - 61 + 126;
        B.llIlIlll[86] = 0x85 ^ 0xB0;
        B.llIlIlll[87] = 0x75 ^ 0x6E ^ (0x96 ^ 0xBB);
        B.llIlIlll[88] = 86 + 29 - -6 + 39 ^ 29 + 114 - 55 + 63;
        B.llIlIlll[89] = 0x20 ^ 0x18;
        B.llIlIlll[90] = 0xFE ^ 0xC7;
        B.llIlIlll[91] = -(0xFFFF93D7 & 0x7D69) & (0xFFFFBFFF & 0x775F);
        B.llIlIlll[92] = 0x62 ^ 0x58;
        B.llIlIlll[93] = 0x26 ^ 0x1D;
        B.llIlIlll[94] = 0x13 ^ 0x36 ^ (0x26 ^ 0x3F);
        B.llIlIlll[95] = 0x37 ^ 0x11 ^ (0x3D ^ 0x26);
        B.llIlIlll[96] = 77 + 24 - -3 + 73 ^ 135 + 2 - 91 + 97;
        B.llIlIlll[97] = 0x39 ^ 6;
        B.llIlIlll[98] = 0x2B ^ 0x6B;
        B.llIlIlll[99] = " ".length() ^ (0x26 ^ 0x66);
        B.llIlIlll[100] = 0x32 ^ 0x70;
        B.llIlIlll[101] = 113 + 208 - 273 + 187 ^ 161 + 94 - 156 + 69;
        B.llIlIlll[102] = 0x53 ^ 0x17;
        B.llIlIlll[103] = -(0xFFFFBF79 & 0x708F) & (0xFFFFB7FA & 0x7F0D);
        B.llIlIlll[104] = 0xFFFFFEFE & 0xD1F;
        B.llIlIlll[105] = 0xE6 ^ 0xA3;
        B.llIlIlll[106] = 0x8E ^ 0x85 ^ (8 ^ 0x45);
        B.llIlIlll[107] = 0x11 ^ 0x14 ^ (0xF8 ^ 0xBA);
        B.llIlIlll[108] = 0xFFFF8E1D & 0x7DFF;
        B.llIlIlll[109] = -(0xFFFFFFEC & 0x59DF) & (0xFFFFFFEB & Short.MAX_VALUE);
        B.llIlIlll[110] = 0x79 ^ 0x31;
        B.llIlIlll[111] = 75 + 3 - 39 + 104 ^ 68 + 173 - 136 + 93;
        B.llIlIlll[112] = 0x48 ^ 2;
        B.llIlIlll[113] = 0xFFFFE6EA & 0x3F37;
        B.llIlIlll[114] = 202 + 23 - 33 + 34 ^ 98 + 79 - 137 + 129;
        B.llIlIlll[115] = 0 ^ 0x4C;
        B.llIlIlll[116] = 0xF3 ^ 0xBE;
        B.llIlIlll[117] = 0xA4 ^ 0x99 ^ (0xEB ^ 0x98);
        B.llIlIlll[118] = 0x1A ^ 0x55;
        B.llIlIlll[119] = 0xA4 ^ 0x9F ^ (0xFD ^ 0x96);
        B.llIlIlll[120] = 157 + 168 - 168 + 59 ^ 37 + 9 - 31 + 122;
        B.llIlIlll[121] = -(0xFFFFDADF & 0x7DAB) & (0xFFFFDFAB & 0x7FDF);
        B.llIlIlll[122] = 0xD7 ^ 0x85;
        B.llIlIlll[123] = 0x11 ^ 0x42;
        B.llIlIlll[124] = 0xDE ^ 0x8A;
        B.llIlIlll[125] = 0x57 ^ 2;
        B.llIlIlll[126] = 0xFFFFE7FE & 0x1EFF;
        B.llIlIlll[127] = -(0xFFFFFBF7 & 0x55CD) & (0xFFFFFFDF & 0x5DFF);
        B.llIlIlll[128] = 0xD0 ^ 0x86;
        B.llIlIlll[129] = 0xCD ^ 0x9A;
        B.llIlIlll[130] = 0xE1 ^ 0xB9;
        B.llIlIlll[131] = 0xFFFFFF30 & 0xCEF;
        B.llIlIlll[132] = 73 + 112 - 18 + 35 ^ 64 + 54 - 73 + 102;
        B.llIlIlll[133] = 0xEB ^ 0xB1;
        B.llIlIlll[134] = 0x15 ^ 0x4E;
        B.llIlIlll[135] = 0xE ^ 0x52;
        B.llIlIlll[136] = "  ".length() ^ (3 ^ 0x5C);
        B.llIlIlll[137] = 0xE9 ^ 0xB7;
        B.llIlIlll[138] = 0xFFFFCDBB & 0x3E66;
        B.llIlIlll[139] = 20 + 132 - -1 + 72 ^ 183 + 176 - 288 + 119;
        B.llIlIlll[140] = 204 + 230 - 189 + 10 ^ 17 + 63 - 69 + 148;
        B.llIlIlll[141] = 185 + 158 - 279 + 145 ^ 148 + 49 - 65 + 44;
        B.llIlIlll[142] = 0xCA ^ 0xA8;
        B.llIlIlll[143] = 0xB ^ 0x7A ^ (0x9A ^ 0x88);
        B.llIlIlll[144] = 0x82 ^ 0x91 ^ (0xF6 ^ 0x81);
        B.llIlIlll[145] = 0x6A ^ 0xF;
        B.llIlIlll[146] = 0xC3 ^ 0xA5;
        B.llIlIlll[147] = 0x25 ^ 0x42;
        B.llIlIlll[148] = 0x76 ^ 0x1E;
        B.llIlIlll[149] = 0x73 ^ 0x1A;
        B.llIlIlll[150] = 0xC8 ^ 0xA2;
        B.llIlIlll[151] = 0x6F ^ 4;
        B.llIlIlll[152] = -(0xFFFFDFBF & 0x78DB) & (0xFFFFFEBE & Short.MAX_VALUE);
        B.llIlIlll[153] = 0x73 ^ 0x5C ^ (0x3D ^ 0x7E);
        B.llIlIlll[154] = 0x21 ^ 0x4C;
        B.llIlIlll[155] = 0x43 ^ 0x4B ^ (0x45 ^ 0x23);
        B.llIlIlll[156] = 0x4D ^ 0x22;
        B.llIlIlll[157] = 57 + 51 - 100 + 137;
        B.llIlIlll[158] = 0xEF ^ 0x9C ^ "   ".length();
        B.llIlIlll[159] = 3 + 78 - -7 + 53;
        B.llIlIlll[160] = " ".length() ^ (0x48 ^ 0x38);
        B.llIlIlll[161] = -(0xFFFFDB67 & 0x75FF) & (0xFFFFDDFF & 0x7F77);
        B.llIlIlll[162] = 0xFFFFAEBB & 0x775D;
        B.llIlIlll[163] = 0xE0 ^ 0xB2 ^ (0xA5 ^ 0x85);
        B.llIlIlll[164] = 0x65 ^ 0x16;
        B.llIlIlll[165] = 8 + 53 - -107 + 24 ^ 151 + 59 - 134 + 104;
        B.llIlIlll[166] = 0x77 ^ 2;
        B.llIlIlll[167] = 0x81 ^ 0xAF ^ (0x21 ^ 0x79);
        B.llIlIlll[168] = 0x1C ^ 0x6B;
        B.llIlIlll[169] = 0x6F ^ 0x62 ^ (0xDB ^ 0xAE);
        B.llIlIlll[170] = 0xED ^ 0xB3 ^ (0xB0 ^ 0x97);
        B.llIlIlll[171] = 0xE4 ^ 0x9E;
        B.llIlIlll[172] = 95 + 153 - 116 + 81 ^ 44 + 66 - -18 + 46;
        B.llIlIlll[173] = 0x55 ^ 0x29;
        B.llIlIlll[174] = 0x60 ^ 0x1D;
        B.llIlIlll[175] = 0xFFFFA7A4 & 0x7C5F;
        B.llIlIlll[176] = -(0xFFFFE1A6 & 0x5F7D) & (0xFFFFFFEF & 0x6FFF);
        B.llIlIlll[177] = 0xFFFFFFBB & 0x61EC;
        B.llIlIlll[178] = 0xFFFFB7AF & 0x497C;
        B.llIlIlll[179] = -(0xFFFFDFEC & 0x7AF7) & (0xFFFFDFFF & 0x7FF7);
        B.llIlIlll[180] = 0x11 ^ 0x67 ^ (0x8F ^ 0x87);
        B.llIlIlll[181] = 30 + 94 - 63 + 66;
        B.llIlIlll[182] = 59 + 112 - 105 + 62;
        B.llIlIlll[183] = (0xB ^ 0x2F) + (0x2F ^ 0x36) - -(0xBE ^ 0xAE) + (0xB7 ^ 0x83);
        B.llIlIlll[184] = 0xFFFFEF3F & 0x1DE5;
        B.llIlIlll[185] = (0x23 ^ 5) + (0x67 ^ 0x70) - -(0xC5 ^ 0x85) + (0x63 ^ 0x66);
        B.llIlIlll[186] = 29 + 123 - 41 + 20;
        B.llIlIlll[187] = -(0xFFFFE7EB & 0x3AFF) & (0xFFFFFFFF & 0x2FEB);
        B.llIlIlll[188] = 0xFFFFBD3F & 0x4ECF;
        B.llIlIlll[189] = -(0xFFFFFEFE & 0x738F) & (0xFFFFFFFD & 0x7FAF);
        B.llIlIlll[190] = 0xFFFFEFB8 & 0x1D4F;
        B.llIlIlll[191] = 0xFFFF8DBE & 0x7E57;
        B.llIlIlll[192] = -(13 + 141 - 123 + 130) & (0xFFFFCDBF & 0x3FFF);
        B.llIlIlll[193] = ("  ".length() & ~"  ".length()) + (6 ^ 0x12) - -(0x5B ^ 0x65) + (0xB1 ^ 0x83);
        B.llIlIlll[194] = (0xE7 ^ 0xBD) + (0x6C ^ 0x1C) - (42 + 120 - 50 + 85) + (53 + 91 - 104 + 88);
        B.llIlIlll[195] = 102 + 117 - 109 + 24;
        B.llIlIlll[196] = 0xFFFFA73F & 0x7ECF;
        B.llIlIlll[197] = 87 + 88 - 115 + 75;
    }

    private static String lIlIllllIIl(String lIlIIlIIllIIIIl, String lIlIIlIIllIIIlI) {
        try {
            SecretKeySpec lIlIIlIIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIlIIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIlIIllIIlIl = Cipher.getInstance("Blowfish");
            lIlIIlIIllIIlIl.init(llIlIlll[3], lIlIIlIIllIIllI);
            return new String(lIlIIlIIllIIlIl.doFinal(Base64.getDecoder().decode(lIlIIlIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlIIllIIlII) {
            lIlIIlIIllIIlII.printStackTrace();
            return null;
        }
    }

    static boolean bG() {
        int n2;
        if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[103])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[121]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[126]), llIlIlll[0])) {
            n2 = llIlIlll[0];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((0x48 ^ 0x7A) & ~(0xB2 ^ 0x80)) != 0;
            }
        } else {
            n2 = llIlIlll[1];
        }
        return n2 != 0;
    }

    private static void ag() {
        block14: {
            d lIlIIlIlIIlIllI;
            block13: {
                block12: {
                    block11: {
                        Object lIlIIlIlIIlIlll;
                        int[] nArray = new int[llIlIlll[0]];
                        nArray[B.llIlIlll[1]] = llIlIlll[6];
                        if (B.lIllIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llIlIlll[6], llIlIlll[10], llIlIlll[175]);
                            bB.add(d2);
                            "".length();
                        }
                        int[] nArray2 = new int[llIlIlll[0]];
                        nArray2[B.llIlIlll[1]] = llIlIlll[7];
                        if (B.lIllIlIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIlIIlIlIIlIlll = new d(llIlIlll[7], llIlIlll[0], llIlIlll[175]);
                            bB.add((d)lIlIIlIlIIlIlll);
                            "".length();
                        }
                        int[] nArray3 = new int[llIlIlll[0]];
                        nArray3[B.llIlIlll[1]] = llIlIlll[9];
                        if (B.lIllIlIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIlIIlIlIIlIlll = new d(llIlIlll[9], llIlIlll[0], llIlIlll[175]);
                            bB.add((d)lIlIIlIlIIlIlll);
                            "".length();
                        }
                        if (B.lIllIlIIIll(Bank.contains((Predicate)(lIlIIlIlIIlIlll = item -> item.getName().toLowerCase().contains(llIlIIll[llIlIlll[181]]))) ? 1 : 0)) {
                            lIlIIlIlIIlIllI = new d(llIlIlll[176], llIlIlll[14], llIlIlll[177]);
                            bB.add(lIlIIlIlIIlIllI);
                            "".length();
                        }
                        int[] nArray4 = new int[llIlIlll[0]];
                        nArray4[B.llIlIlll[1]] = llIlIlll[12];
                        if (B.lIllIlIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIlIIlIlIIlIllI = new d(llIlIlll[12], llIlIlll[4], i.bw);
                            bB.add(lIlIIlIlIIlIllI);
                            "".length();
                        }
                        int[] nArray5 = new int[llIlIlll[0]];
                        nArray5[B.llIlIlll[1]] = llIlIlll[13];
                        if (!B.lIllIlIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[llIlIlll[0]];
                        nArray6[B.llIlIlll[1]] = llIlIlll[13];
                        if (!B.lIllIlIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[llIlIlll[0]];
                        nArray7[B.llIlIlll[1]] = llIlIlll[13];
                        if (!B.lIllIlIIIlI(Bank.getFirst((int[])nArray7).getQuantity(), llIlIlll[14])) break block12;
                    }
                    lIlIIlIlIIlIllI = new d(llIlIlll[13], llIlIlll[10], llIlIlll[178]);
                    bB.add(lIlIIlIlIIlIllI);
                    "".length();
                }
                int[] nArray = new int[llIlIlll[0]];
                nArray[B.llIlIlll[1]] = llIlIlll[5];
                if (!B.lIllIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[llIlIlll[0]];
                nArray8[B.llIlIlll[1]] = llIlIlll[5];
                if (!B.lIllIlIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[llIlIlll[0]];
                nArray9[B.llIlIlll[1]] = llIlIlll[5];
                if (!B.lIllIlIIIlI(Bank.getFirst((int[])nArray9).getQuantity(), llIlIlll[27])) break block14;
            }
            lIlIIlIlIIlIllI = new d(llIlIlll[5], llIlIlll[57], llIlIlll[179]);
            bB.add(lIlIIlIlIIlIllI);
            "".length();
        }
    }

    private static String lIlIllllIII(String lIlIIlIlIIIIlIl, String lIlIIlIIlllllll) {
        lIlIIlIlIIIIlIl = new String(Base64.getDecoder().decode(lIlIIlIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIlIlIIIIIll = new StringBuilder();
        char[] lIlIIlIlIIIIIlI = lIlIIlIIlllllll.toCharArray();
        int lIlIIlIlIIIIIIl = llIlIlll[1];
        char[] lIlIIlIIllllIll = lIlIIlIlIIIIlIl.toCharArray();
        int lIlIIlIIllllIlI = lIlIIlIIllllIll.length;
        int lIlIIlIIllllIIl = llIlIlll[1];
        while (B.lIllIlIIIlI(lIlIIlIIllllIIl, lIlIIlIIllllIlI)) {
            char lIlIIlIlIIIIllI = lIlIIlIIllllIll[lIlIIlIIllllIIl];
            lIlIIlIlIIIIIll.append((char)(lIlIIlIlIIIIllI ^ lIlIIlIlIIIIIlI[lIlIIlIlIIIIIIl % lIlIIlIlIIIIIlI.length]));
            "".length();
            ++lIlIIlIlIIIIIIl;
            ++lIlIIlIIllllIIl;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lIlIIlIlIIIIIll);
    }

    private static boolean lIllIlIIlII(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIlIIllI(int n2) {
        return n2 < 0;
    }

    private static boolean lIllIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String V() {
        return llIlIIll[llIlIlll[180]];
    }

    private static boolean lIllIlIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIlIllII(int n2, int n3) {
        return n2 >= n3;
    }
}

