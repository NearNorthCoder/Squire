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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
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

public class BHelper
implements F {
    static  int ci;
    public static  WorldPoint hS;
    
    public static  WorldPoint hQ;
    public static  WorldPoint hR;
    public static  WorldPoint hT;
    public static  WorldPoint ce;
    public static  boolean bz;
    static  WorldArea hV;
    static  int hU;
    public static  List<d> bB;
    
    static  String[] bX;
    static  boolean cj;

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

            if (-3 <= 0) continue;
            return false;
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

                                }
                                if (B.lIllIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[3]];
                                    if (B.lIllIlIIlIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIlIlll[4]);

                                    }
                                    if (B.lIllIlIIlIl(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIlIlll[3]);

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

                        }
                        int[] nArray = new int[llIlIlll[0]];
                        nArray[B.llIlIlll[1]] = llIlIlll[13];
                        if (B.lIllIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && B.lIllIlIIllI(B.lIllIIlllIl(e.v(), 50.0))) {
                            int[] nArray3 = new int[llIlIlll[0]];
                            nArray3[B.llIlIlll[1]] = llIlIlll[13];
                            Inventory.getFirst((int[])nArray3).interact(llIlIIll[llIlIlll[14]]);
                            Time.sleepTicks((int)llIlIlll[3]);

                        }
                        if (B.lIllIlIIIIl(B.ac() ? 1 : 0) && B.lIllIlIIIll(e.j(hU))) {
                            if (B.lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(ce), llIlIlll[16])) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[17]];
                                Movement.walkTo((WorldPoint)ce);

                                Time.sleepTicks((int)llIlIlll[0]);

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

                                            Time.sleepTicks((int)llIlIlll[0]);

                                        }
                                        if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIlIlIlIlIll), llIlIlll[14])) {
                                            int[] nArray7 = new int[llIlIlll[0]];
                                            nArray7[B.llIlIlll[1]] = llIlIlll[11];
                                            lIlIIlIlIlIlIlI = TileItems.getNearest((int[])nArray7);
                                            if (B.lIllIlIIlII(lIlIIlIlIlIlIlI)) {
                                                if (B.lIllIlIIIll(Reachable.isInteractable((Locatable)lIlIIlIlIlIlIlI) ? 1 : 0)) {
                                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[23]];
                                                    Movement.walkTo((WorldPoint)lIlIIlIlIlIlIlI.getWorldLocation());

                                                    Time.sleepTicks((int)llIlIlll[0]);

                                                }
                                                if (B.lIllIlIIIIl(Reachable.isInteractable((Locatable)lIlIIlIlIlIlIlI) ? 1 : 0)) {
                                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[24]];
                                                    lIlIIlIlIlIlIlI.interact(llIlIIll[llIlIlll[25]]);
                                                    Time.sleepTicks((int)llIlIlll[8]);

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

                                Time.sleepTicks((int)llIlIlll[0]);

                            }
                            if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hQ), llIlIlll[4])) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[29]];
                                String[] stringArray2 = new String[llIlIlll[0]];
                                stringArray2[B.llIlIlll[1]] = llIlIIll[llIlIlll[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(llIlIIll[llIlIlll[31]]);
                                Time.sleepTicks((int)llIlIlll[20]);

                            }
                        }
                        String[] stringArray3 = new String[llIlIlll[0]];
                        stringArray3[B.llIlIlll[1]] = llIlIIll[llIlIlll[32]];
                        if (B.lIllIlIIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (B.lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hR), llIlIlll[8])) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[33]];
                                Movement.walkTo((WorldPoint)hR);

                                Time.sleepTicks((int)llIlIlll[0]);

                            }
                            if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hR), llIlIlll[8])) {
                                int[] nArray14 = new int[llIlIlll[0]];
                                nArray14[B.llIlIlll[1]] = llIlIlll[19];
                                String[] stringArray4 = new String[llIlIlll[0]];
                                stringArray4[B.llIlIlll[1]] = llIlIIll[llIlIlll[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)llIlIlll[0]);

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

                                Time.sleepTicks((int)llIlIlll[0]);

                            }
                            if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIll) ? 1 : 0)) {
                                String[] stringArray10 = new String[llIlIlll[0]];
                                stringArray10[B.llIlIlll[1]] = llIlIIll[llIlIlll[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(llIlIIll[llIlIlll[48]]);
                                Time.sleepTicks((int)llIlIlll[3]);

                            }
                            if (B.lIllIlIIIIl(lIlIIlIlIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[49]];
                                String[] stringArray11 = new String[llIlIlll[0]];
                                stringArray11[B.llIlIlll[1]] = llIlIIll[llIlIlll[50]];
                                TileItems.getNearest((String[])stringArray11).interact(llIlIIll[llIlIlll[51]]);
                                Time.sleepTicks((int)llIlIlll[8]);

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

                        }
                        if (B.lIllIlIIIll(lIlIIlIlIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && B.lIllIlIIIll(hV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[58]];
                            Movement.walkTo((WorldPoint)hS);

                            Time.sleepTicks((int)llIlIlll[0]);

                        }
                        if (B.lIllIlIIIIl(lIlIIlIlIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[llIlIlll[0]];
                            stringArray15[B.llIlIlll[1]] = llIlIIll[llIlIlll[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(llIlIIll[llIlIlll[60]]);
                            Time.sleepTicks((int)llIlIlll[4]);

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

                                    Time.sleepTicks((int)llIlIlll[0]);

                                }
                                if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIIl) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[77]];
                                    String[] stringArray16 = new String[llIlIlll[0]];
                                    stringArray16[B.llIlIlll[1]] = llIlIIll[llIlIlll[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(llIlIIll[llIlIlll[79]]);
                                    Time.sleepTicks((int)llIlIlll[8]);

                                }
                            }
                            if (B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[74]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[75]))) {
                                if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIII) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[81]];
                                    Movement.walkTo((WorldPoint)lIlIIlIlIlIlIII);

                                    Time.sleepTicks((int)llIlIlll[0]);

                                }
                                if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIII) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[82]];
                                    String[] stringArray17 = new String[llIlIlll[0]];
                                    stringArray17[B.llIlIlll[1]] = llIlIIll[llIlIlll[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(llIlIIll[llIlIlll[83]]);
                                    Time.sleepTicks((int)llIlIlll[8]);

                                }
                            }
                            if (B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[74]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[80]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[75]))) {
                                if (B.lIllIlIIIll(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIlIIIII = new WorldPoint(llIlIlll[21], llIlIlll[84], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[85]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIIIII);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                        String[] stringArray18 = new String[llIlIlll[0]];
                                        stringArray18[B.llIlIlll[1]] = llIlIIll[llIlIlll[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(llIlIIll[llIlIlll[87]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[88]];
                                    String[] stringArray19 = new String[llIlIlll[0]];
                                    stringArray19[B.llIlIlll[1]] = llIlIIll[llIlIlll[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(llIlIIll[llIlIlll[90]]);
                                    Time.sleepTicks((int)llIlIlll[8]);

                                }
                            }
                            if (B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[74]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[80]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0])) {
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIlIIIII = new WorldPoint(llIlIlll[21], llIlIlll[91], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[92]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIIIII);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                        String[] stringArray20 = new String[llIlIlll[0]];
                                        stringArray20[B.llIlIlll[1]] = llIlIIll[llIlIlll[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(llIlIIll[llIlIlll[94]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                                if (B.lIllIlIIIll(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIII) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[95]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIlIII);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIII) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[96]];
                                        String[] stringArray21 = new String[llIlIlll[0]];
                                        stringArray21[B.llIlIlll[1]] = llIlIIll[llIlIlll[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(llIlIIll[llIlIlll[98]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                            }
                            if (B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[74]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0])) {
                                if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIIl) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[99]];
                                    Movement.walkTo((WorldPoint)lIlIIlIlIlIlIIl);

                                    Time.sleepTicks((int)llIlIlll[0]);

                                }
                                if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIlIIl) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[100]];
                                    String[] stringArray22 = new String[llIlIlll[0]];
                                    stringArray22[B.llIlIlll[1]] = llIlIIll[llIlIlll[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(llIlIIll[llIlIlll[102]]);
                                    Time.sleepTicks((int)llIlIlll[8]);

                                }
                            }
                            if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[103])) && B.lIllIlIIIll(B.bG() ? 1 : 0)) {
                                if (B.lIllIlIIIll(lIlIIlIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (B.lIllIlIIIIl(lIlIIlIlIlIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lIlIIlIlIlIIIII = new WorldPoint(llIlIlll[104], llIlIlll[84], llIlIlll[1]);
                                        if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[105]];
                                            Movement.walkTo((WorldPoint)lIlIIlIlIlIIIII);

                                            Time.sleepTicks((int)llIlIlll[0]);

                                        }
                                        if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIIII) ? 1 : 0)) {
                                            String[] stringArray23 = new String[llIlIlll[0]];
                                            stringArray23[B.llIlIlll[1]] = llIlIIll[llIlIlll[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(llIlIIll[llIlIlll[107]]);
                                            Time.sleepTicks((int)llIlIlll[8]);

                                        }
                                    }
                                    if (B.lIllIlIIIIl((lIlIIlIlIlIIIII = new WorldArea(llIlIlll[72], llIlIlll[69], llIlIlll[14], llIlIlll[14], llIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && B.lIllIlIIIll(B.bG() ? 1 : 0)) {
                                        lIlIIlIlIIlllll = new WorldPoint(llIlIlll[108], llIlIlll[109], llIlIlll[1]);
                                        if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[110]];
                                            Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);

                                            Time.sleepTicks((int)llIlIlll[0]);

                                        }
                                        if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                            String[] stringArray24 = new String[llIlIlll[0]];
                                            stringArray24[B.llIlIlll[1]] = llIlIIll[llIlIlll[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(llIlIIll[llIlIlll[112]]);
                                            Time.sleepTicks((int)llIlIlll[8]);

                                        }
                                    }
                                    if (B.lIllIlIIIIl((lIlIIlIlIIlllll = new WorldArea(llIlIlll[70], llIlIlll[69], llIlIlll[14], llIlIlll[14], llIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lIlIIlIlIIllllI = new WorldPoint(llIlIlll[67], llIlIlll[113], llIlIlll[1]);
                                        if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIllllI) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[114]];
                                            Movement.walkTo((WorldPoint)lIlIIlIlIIllllI);

                                            Time.sleepTicks((int)llIlIlll[0]);

                                        }
                                        if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIllllI) ? 1 : 0)) {
                                            String[] stringArray25 = new String[llIlIlll[0]];
                                            stringArray25[B.llIlIlll[1]] = llIlIIll[llIlIlll[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(llIlIIll[llIlIlll[116]]);
                                            Time.sleepTicks((int)llIlIlll[8]);

                                        }
                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && B.lIllIlIIIll(B.bG() ? 1 : 0)) {
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlIl) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[117]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIIlIl);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlIl) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[118]];
                                        String[] stringArray26 = new String[llIlIlll[0]];
                                        stringArray26[B.llIlIlll[1]] = llIlIIll[llIlIlll[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(llIlIIll[llIlIlll[120]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                            }
                            if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[103]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[121]))) {
                                if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlII) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[122]];
                                    Movement.walkTo((WorldPoint)lIlIIlIlIlIIlII);

                                    Time.sleepTicks((int)llIlIlll[0]);

                                }
                                if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlII) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[123]];
                                    String[] stringArray27 = new String[llIlIlll[0]];
                                    stringArray27[B.llIlIlll[1]] = llIlIIll[llIlIlll[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(llIlIIll[llIlIlll[125]]);
                                    Time.sleepTicks((int)llIlIlll[8]);

                                }
                            }
                            if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[103]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[121]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[126]))) {
                                lIlIIlIlIlIIIII = new WorldArea(llIlIlll[72], llIlIlll[71], llIlIlll[14], llIlIlll[14], llIlIlll[1]);
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[127], llIlIlll[66], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[128]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray28 = new String[llIlIlll[0]];
                                        stringArray28[B.llIlIlll[1]] = llIlIIll[llIlIlll[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(llIlIIll[llIlIlll[130]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[131], llIlIlll[66], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[132]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray29 = new String[llIlIlll[0]];
                                        stringArray29[B.llIlIlll[1]] = llIlIIll[llIlIlll[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(llIlIIll[llIlIlll[134]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[135]];
                                    String[] stringArray30 = new String[llIlIlll[0]];
                                    stringArray30[B.llIlIlll[1]] = llIlIIll[llIlIlll[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(llIlIIll[llIlIlll[137]]);
                                    Time.sleepTicks((int)llIlIlll[16]);

                                }
                            }
                            if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[103]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[121]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[126]), llIlIlll[0])) {
                                lIlIIlIlIlIIIII = new WorldArea(llIlIlll[72], llIlIlll[71], llIlIlll[14], llIlIlll[14], llIlIlll[1]);
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[138], llIlIlll[66], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[139]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray31 = new String[llIlIlll[0]];
                                        stringArray31[B.llIlIlll[1]] = llIlIIll[llIlIlll[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(llIlIIll[llIlIlll[141]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[108], llIlIlll[66], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[142]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray32 = new String[llIlIlll[0]];
                                        stringArray32[B.llIlIlll[1]] = llIlIIll[llIlIlll[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(llIlIIll[llIlIlll[144]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlIl) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[145]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIlIIlIl);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIlIIlIl) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[146]];
                                        String[] stringArray33 = new String[llIlIlll[0]];
                                        stringArray33[B.llIlIlll[1]] = llIlIIll[llIlIlll[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(llIlIIll[llIlIlll[148]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

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

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        String[] stringArray34 = new String[llIlIlll[0]];
                                        stringArray34[B.llIlIlll[1]] = llIlIIll[llIlIlll[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(llIlIIll[llIlIlll[151]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIlIIlIlIIlllll = new WorldPoint(llIlIlll[104], llIlIlll[152], llIlIlll[1]);
                                    if (B.lIllIlIIIll(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[153]];
                                        Movement.walkTo((WorldPoint)lIlIIlIlIIlllll);

                                        Time.sleepTicks((int)llIlIlll[0]);

                                    }
                                    if (B.lIllIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIlIIlllll) ? 1 : 0)) {
                                        Time.sleepTicks((int)llIlIlll[0]);

                                        String[] stringArray35 = new String[llIlIlll[0]];
                                        stringArray35[B.llIlIlll[1]] = llIlIIll[llIlIlll[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(llIlIIll[llIlIlll[155]]);
                                        Time.sleepTicks((int)llIlIlll[8]);

                                    }
                                }
                                if (B.lIllIlIIIIl((lIlIIlIlIIlllll = new WorldArea(llIlIlll[72], llIlIlll[69], llIlIlll[14], llIlIlll[14], llIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && B.lIllIlIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[156]];
                                    Time.sleepTicks((int)llIlIlll[0]);

                                    int[] nArray = new int[llIlIlll[0]];
                                    nArray[B.llIlIlll[1]] = llIlIlll[157];
                                    TileObjects.getNearest((int[])nArray).interact(llIlIIll[llIlIlll[158]]);
                                    Time.sleepTicks((int)llIlIlll[8]);

                                }
                                if (B.lIllIlIIIIl(lIlIIlIlIlIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[llIlIlll[0]];
                                    nArray[B.llIlIlll[1]] = llIlIlll[159];
                                    TileObjects.getNearest((int[])nArray).interact(llIlIIll[llIlIlll[160]]);
                                    Time.sleepTicks((int)llIlIlll[8]);

                                }
                                if (B.lIllIlIIIIl((lIlIIlIlIIllllI = new WorldArea(llIlIlll[161], llIlIlll[162], llIlIlll[23], llIlIlll[14], llIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[llIlIlll[0]];
                                    stringArray36[B.llIlIlll[1]] = llIlIIll[llIlIlll[163]];
                                    if (B.lIllIlIIIll(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[llIlIlll[0]];
                                        stringArray37[B.llIlIlll[1]] = llIlIIll[llIlIlll[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(llIlIIll[llIlIlll[165]]);
                                        Time.sleepTicks((int)llIlIlll[14]);

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

                        }
                        if (B.lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[169]];
                            Movement.walkTo((WorldPoint)hT);

                            Time.sleepTicks((int)llIlIlll[0]);

                        }
                        if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                            lIlIIlIlIlIlIlI = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (B.lIllIlIIIIl(tileObject.getName().contains(llIlIIll[llIlIlll[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[llIlIlll[0]];
                                    stringArray[B.llIlIlll[1]] = llIlIIll[llIlIlll[186]];
                                    if (B.lIllIlIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && B.lIllIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlll[21], llIlIlll[184], llIlIlll[3])), llIlIlll[3])) {
                                        n2 = llIlIlll[0];

                                        if (-(0xBA ^ 0xBE) < 0) return n2 != 0;
                                        return false;
                                    }
                                }
                                n2 = llIlIlll[1];
                                return n2 != 0;
                            });
                            if (B.lIllIlIIlII(lIlIIlIlIlIlIlI)) {
                                lIlIIlIlIlIlIlI.interact(llIlIIll[llIlIlll[170]]);
                                Time.sleepTicks((int)llIlIlll[8]);

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

                    Time.sleepTicks((int)llIlIlll[0]);

                }
                if (B.lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                    lIlIIlIlIlIlIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (B.lIllIlIIIIl(tileObject.getName().contains(llIlIIll[llIlIlll[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[llIlIlll[0]];
                            stringArray[B.llIlIlll[1]] = llIlIIll[llIlIlll[183]];
                            if (B.lIllIlIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && B.lIllIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlll[21], llIlIlll[184], llIlIlll[3])), llIlIlll[3])) {
                                n2 = llIlIlll[0];

                                if (null == null) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = llIlIlll[1];
                        return n2 != 0;
                    });
                    if (B.lIllIlIIlII(lIlIIlIlIlIlIll)) {
                        lIlIIlIlIlIlIll.interact(llIlIIll[llIlIlll[173]]);
                        Time.sleepTicks((int)llIlIlll[8]);

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
        B.llIlIIll[B.llIlIlll[1]] = "Finished buying items, switching back to quest";
        B.llIlIIll[B.llIlIlll[0]] = "Nav to bank";
        B.llIlIIll[B.llIlIlll[3]] = "Handling banking";
        B.llIlIIll[B.llIlIlll[8]] = "We are missing quest supplies, switching to BUYING";
        B.llIlIIll[B.llIlIlll[4]] = "Drink";
        B.llIlIIll[B.llIlIlll[14]] = "Eat";
        B.llIlIIll[B.llIlIlll[17]] = "Nav to start";
        B.llIlIIll[B.llIlIlll[18]] = "Start quest";
        B.llIlIIll[B.llIlIlll[16]] = "Veronica";
        B.llIlIIll[B.llIlIlll[20]] = "Key";
        B.llIlIIll[B.llIlIlll[10]] = "Nav to fish food";
        B.llIlIIll[B.llIlIlll[23]] = "Can't reach, navigating";
        B.llIlIIll[B.llIlIlll[24]] = "Taking food";
        B.llIlIIll[B.llIlIlll[25]] = "Take";
        B.llIlIIll[B.llIlIlll[26]] = "Making poison fish food";
        B.llIlIIll[B.llIlIlll[27]] = "Key";
        B.llIlIIll[B.llIlIlll[28]] = "Nav to compost";
        B.llIlIIll[B.llIlIlll[29]] = "Digging";
        B.llIlIIll[B.llIlIlll[30]] = "Compost heap";
        B.llIlIIll[B.llIlIlll[31]] = "Search";
        B.llIlIIll[B.llIlIlll[32]] = "Key";
        B.llIlIIll[B.llIlIlll[33]] = "Nav to fountain";
        B.llIlIIll[B.llIlIlll[34]] = "Fountain";
        B.llIlIIll[B.llIlIlll[35]] = "Key";
        B.llIlIIll[B.llIlIlll[36]] = "Pressure gauge";
        B.llIlIIll[B.llIlIlll[37]] = "Getting guage";
        B.llIlIIll[B.llIlIlll[38]] = "Fountain";
        B.llIlIIll[B.llIlIlll[39]] = "Search";
        B.llIlIIll[B.llIlIlll[40]] = "Key";
        B.llIlIIll[B.llIlIlll[41]] = "Pressure gauge";
        B.llIlIIll[B.llIlIlll[42]] = "Rubber tube";
        B.llIlIIll[B.llIlIlll[46]] = "Nav to door";
        B.llIlIIll[B.llIlIlll[47]] = "Door";
        B.llIlIIll[B.llIlIlll[48]] = "Open";
        B.llIlIIll[B.llIlIlll[49]] = "Get tube";
        B.llIlIIll[B.llIlIlll[50]] = "Rubber tube";
        B.llIlIIll[B.llIlIlll[51]] = "Take";
        B.llIlIIll[B.llIlIlll[52]] = "Rubber tube";
        B.llIlIIll[B.llIlIlll[53]] = "Oil can";
        B.llIlIIll[B.llIlIlll[56]] = "Door";
        B.llIlIIll[B.llIlIlll[57]] = "Open";
        B.llIlIIll[B.llIlIlll[58]] = "Nav to final room";
        B.llIlIIll[B.llIlIlll[59]] = "Ladder";
        B.llIlIIll[B.llIlIlll[60]] = "Climb-down";
        B.llIlIIll[B.llIlIlll[76]] = "Nav to a";
        B.llIlIIll[B.llIlIlll[77]] = "Pull lever";
        B.llIlIIll[B.llIlIlll[78]] = "Lever A";
        B.llIlIIll[B.llIlIlll[79]] = "Pull";
        B.llIlIIll[B.llIlIlll[81]] = "Nav to b";
        B.llIlIIll[B.llIlIlll[82]] = "Pull lever";
        B.llIlIIll[B.llIlIlll[15]] = "Lever B";
        B.llIlIIll[B.llIlIlll[83]] = "Pull";
        B.llIlIIll[B.llIlIlll[85]] = "Nav to d";
        B.llIlIIll[B.llIlIlll[86]] = "Door";
        B.llIlIIll[B.llIlIlll[87]] = "Open";
        B.llIlIIll[B.llIlIlll[88]] = "Pull lever";
        B.llIlIIll[B.llIlIlll[89]] = "Lever D";
        B.llIlIIll[B.llIlIlll[90]] = "Pull";
        B.llIlIIll[B.llIlIlll[92]] = "Move to door";
        B.llIlIIll[B.llIlIlll[93]] = "Door";
        B.llIlIIll[B.llIlIlll[94]] = "Open";
        B.llIlIIll[B.llIlIlll[95]] = "Nav to b";
        B.llIlIIll[B.llIlIlll[96]] = "Pull lever";
        B.llIlIIll[B.llIlIlll[97]] = "Lever B";
        B.llIlIIll[B.llIlIlll[98]] = "Pull";
        B.llIlIIll[B.llIlIlll[99]] = "Nav to a";
        B.llIlIIll[B.llIlIlll[100]] = "Pull lever";
        B.llIlIIll[B.llIlIlll[101]] = "Lever A";
        B.llIlIIll[B.llIlIlll[102]] = "Pull";
        B.llIlIIll[B.llIlIlll[105]] = "Move to door";
        B.llIlIIll[B.llIlIlll[106]] = "Door";
        B.llIlIIll[B.llIlIlll[107]] = "Open";
        B.llIlIIll[B.llIlIlll[110]] = "Move to door";
        B.llIlIIll[B.llIlIlll[111]] = "Door";
        B.llIlIIll[B.llIlIlll[112]] = "Open";
        B.llIlIIll[B.llIlIlll[114]] = "Move to door";
        B.llIlIIll[B.llIlIlll[115]] = "Door";
        B.llIlIIll[B.llIlIlll[116]] = "Open";
        B.llIlIIll[B.llIlIlll[117]] = "Nav to e";
        B.llIlIIll[B.llIlIlll[118]] = "Pull lever";
        B.llIlIIll[B.llIlIlll[119]] = "Lever E";
        B.llIlIIll[B.llIlIlll[120]] = "Pull";
        B.llIlIIll[B.llIlIlll[122]] = "Nav to f";
        B.llIlIIll[B.llIlIlll[123]] = "Pull lever";
        B.llIlIIll[B.llIlIlll[124]] = "Lever F";
        B.llIlIIll[B.llIlIlll[125]] = "Pull";
        B.llIlIIll[B.llIlIlll[128]] = "Move to door";
        B.llIlIIll[B.llIlIlll[129]] = "Door";
        B.llIlIIll[B.llIlIlll[130]] = "Open";
        B.llIlIIll[B.llIlIlll[132]] = "Move to door";
        B.llIlIIll[B.llIlIlll[133]] = "Door";
        B.llIlIIll[B.llIlIlll[134]] = "Open";
        B.llIlIIll[B.llIlIlll[135]] = "Pull lever";
        B.llIlIIll[B.llIlIlll[136]] = "Lever C";
        B.llIlIIll[B.llIlIlll[137]] = "Pull";
        B.llIlIIll[B.llIlIlll[139]] = "Move to door";
        B.llIlIIll[B.llIlIlll[140]] = "Door";
        B.llIlIIll[B.llIlIlll[141]] = "Open";
        B.llIlIIll[B.llIlIlll[142]] = "Move to door";
        B.llIlIIll[B.llIlIlll[143]] = "Door";
        B.llIlIIll[B.llIlIlll[144]] = "Open";
        B.llIlIIll[B.llIlIlll[145]] = "Nav to e";
        B.llIlIIll[B.llIlIlll[146]] = "Pull lever";
        B.llIlIIll[B.llIlIlll[147]] = "Lever E";
        B.llIlIIll[B.llIlIlll[148]] = "Pull";
        B.llIlIIll[B.llIlIlll[149]] = "Move to door";
        B.llIlIIll[B.llIlIlll[150]] = "Door";
        B.llIlIIll[B.llIlIlll[151]] = "Open";
        B.llIlIIll[B.llIlIlll[153]] = "Move to door";
        B.llIlIIll[B.llIlIlll[154]] = "Door";
        B.llIlIIll[B.llIlIlll[155]] = "Open";
        B.llIlIIll[B.llIlIlll[156]] = "Opening 145";
        B.llIlIIll[B.llIlIlll[158]] = "Open";
        B.llIlIIll[B.llIlIlll[160]] = "Open";
        B.llIlIIll[B.llIlIlll[163]] = "Oil can";
        B.llIlIIll[B.llIlIlll[164]] = "Oil can";
        B.llIlIIll[B.llIlIlll[165]] = "Take";
        B.llIlIIll[B.llIlIlll[166]] = "Rubber tube";
        B.llIlIIll[B.llIlIlll[167]] = "Oil can";
        B.llIlIIll[B.llIlIlll[168]] = "Open";
        B.llIlIIll[B.llIlIlll[169]] = "Nav to professor";
        B.llIlIIll[B.llIlIlll[170]] = "Open";
        B.llIlIIll[B.llIlIlll[171]] = "Professor Oddenstein";
        B.llIlIIll[B.llIlIlll[172]] = "Nav to professor";
        B.llIlIIll[B.llIlIlll[173]] = "Open";
        B.llIlIIll[B.llIlIlll[174]] = "Professor Oddenstein";
        B.llIlIIll[B.llIlIlll[180]] = "Ernest the Chicken";
        B.llIlIIll[B.llIlIlll[181]] = "ring of wealth (";
        B.llIlIIll[B.llIlIlll[182]] = "Door";
        B.llIlIIll[B.llIlIlll[183]] = "Open";
        B.llIlIIll[B.llIlIlll[185]] = "Door";
        B.llIlIIll[B.llIlIlll[186]] = "Open";
        B.llIlIIll[B.llIlIlll[193]] = "Yes.";
        B.llIlIIll[B.llIlIlll[194]] = "I'm looking for a guy called Ernest.";
        B.llIlIIll[B.llIlIlll[195]] = "I'm glad Veronica didn't actually get engaged to a chicken.";
    }

    private static boolean lIllIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (B.lIllIlIllII(e.j(llIlIlll[47]), llIlIlll[8])) {
            bl = llIlIlll[0];

            if (2 >= 3) {
                return ((0x3D ^ 0x2C ^ (0x51 ^ 0x5A)) & (0x40 ^ 0x39 ^ (0xE0 ^ 0x83) ^ -1)) != 0;
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

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 == 0) {
            return (0x4D ^ 0x4B ^ (0xC3 ^ 0x94)) & (0x81 ^ 0x86 ^ (0x49 ^ 0x1F) ^ -1);
        }
        return llIlIlll[144];
    }

    private static int lIllIIlllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static boolean bG() {
        int n2;
        if (B.lIllIlIIIll(Vars.getBit((int)llIlIlll[74])) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[80])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[75]), llIlIlll[0]) && B.lIllIlIIIll(Vars.getBit((int)llIlIlll[103])) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[121]), llIlIlll[0]) && B.lIllIlIlIIl(Vars.getBit((int)llIlIlll[126]), llIlIlll[0])) {
            n2 = llIlIlll[0];

            if (3 <= 2) {
                return false;
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
                            d d2 = new DHelper(llIlIlll[6], llIlIlll[10], llIlIlll[175]);
                            bB.add(d2);

                        }
                        int[] nArray2 = new int[llIlIlll[0]];
                        nArray2[B.llIlIlll[1]] = llIlIlll[7];
                        if (B.lIllIlIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIlIIlIlIIlIlll = new DHelper(llIlIlll[7], llIlIlll[0], llIlIlll[175]);
                            bB.add((DHelper) IlIIlIlIIlIlll);

                        }
                        int[] nArray3 = new int[llIlIlll[0]];
                        nArray3[B.llIlIlll[1]] = llIlIlll[9];
                        if (B.lIllIlIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIlIIlIlIIlIlll = new DHelper(llIlIlll[9], llIlIlll[0], llIlIlll[175]);
                            bB.add((DHelper) IlIIlIlIIlIlll);

                        }
                        if (B.lIllIlIIIll(Bank.contains((Predicate)(lIlIIlIlIIlIlll = item -> item.getName().toLowerCase().contains(llIlIIll[llIlIlll[181]]))) ? 1 : 0)) {
                            lIlIIlIlIIlIllI = new DHelper(llIlIlll[176], llIlIlll[14], llIlIlll[177]);
                            bB.add(lIlIIlIlIIlIllI);

                        }
                        int[] nArray4 = new int[llIlIlll[0]];
                        nArray4[B.llIlIlll[1]] = llIlIlll[12];
                        if (B.lIllIlIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIlIIlIlIIlIllI = new DHelper(llIlIlll[12], llIlIlll[4], i.bw);
                            bB.add(lIlIIlIlIIlIllI);

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
                    lIlIIlIlIIlIllI = new DHelper(llIlIlll[13], llIlIlll[10], llIlIlll[178]);
                    bB.add(lIlIIlIlIIlIllI);

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
            lIlIIlIlIIlIllI = new DHelper(llIlIlll[5], llIlIlll[57], llIlIlll[179]);
            bB.add(lIlIIlIlIIlIllI);

        }
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

