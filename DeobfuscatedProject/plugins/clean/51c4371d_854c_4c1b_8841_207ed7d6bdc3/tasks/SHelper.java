/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.NHelper;
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
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class SHelper
implements F {
    private static  WorldPoint cJ;
    private static  WorldPoint ce;
    private static  int cM;
    
    private static  WorldPoint cH;
    static  boolean cj;
    static  int ci;
    static  String[] bX;
    private static  WorldPoint cI;
    public static  List<d> bB;
    public static  boolean bz;
    
    private static  WorldPoint cL;
    static  WorldArea cF;
    static  boolean cG;
    private static  WorldPoint cK;

        return String.valueOf(lIlIllIIIlIlIlI);
    }

    @Override
    public boolean T() {
        return llIIIlII[2];
    }

    private static boolean lIlIIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void aI() {
        if (s.lIlIIIlllIl(Skills.getLevel((Skill)Skill.FISHING), llIIIlII[0])) {
            N.cX();
        }
        if (s.lIlIIIllllI(Skills.getLevel((Skill)Skill.FISHING), llIIIlII[0])) {
            if (s.lIlIIIlllll(bz ? 1 : 0)) {
                b.a(bB);
                if (s.lIlIIIlllIl(bB.size(), llIIIlII[1])) {
                    System.out.println(llIIIIlI[llIIIlII[2]]);
                    bz = llIIIlII[2];
                }
            }
            if (s.lIlIIlIIIII(bz ? 1 : 0)) {
                if (s.lIlIIlIIIII(s.ac() ? 1 : 0) && s.lIlIIIlllIl(e.j(cM), llIIIlII[1])) {
                    String[] stringArray = new String[llIIIlII[1]];
                    stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[1]];
                    if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        BankLocation lIlIllIIlIIlIlI = BankLocation.getNearest();
                        if (s.lIlIIlIIIIl(lIlIllIIlIIlIlI) && s.lIlIIlIIIII(lIlIllIIlIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[3]];
                            a.a(lIlIllIIlIIlIlI);
                        }
                        if (s.lIlIIlIIIIl(lIlIllIIlIIlIlI) && s.lIlIIIlllll(lIlIllIIlIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (s.lIlIIlIIIII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIlII[4]);

                            }
                            if (s.lIlIIIlllll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderBarrows.c = llIIIIlI[llIIIlII[5]];
                                if (s.lIlIIlIIIlI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIIlII[6]);

                                }
                                if (s.lIlIIlIIIlI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIIlII[3]);

                                }
                                int[] nArray = new int[llIIIlII[7]];
                                nArray[s.llIIIlII[2]] = llIIIlII[8];
                                nArray[s.llIIIlII[1]] = llIIIlII[9];
                                nArray[s.llIIIlII[3]] = llIIIlII[10];
                                nArray[s.llIIIlII[5]] = llIIIlII[11];
                                nArray[s.llIIIlII[6]] = llIIIlII[12];
                                nArray[s.llIIIlII[13]] = llIIIlII[14];
                                nArray[s.llIIIlII[15]] = llIIIlII[16];
                                if (s.lIlIIlIIIII(e.b(nArray) ? 1 : 0)) {
                                    s.ag();
                                    System.out.println(llIIIIlI[llIIIlII[6]]);
                                    bz = llIIIlII[1];
                                    return;
                                }
                                int[] nArray2 = new int[llIIIlII[15]];
                                nArray2[s.llIIIlII[2]] = llIIIlII[8];
                                nArray2[s.llIIIlII[1]] = llIIIlII[9];
                                nArray2[s.llIIIlII[3]] = llIIIlII[10];
                                nArray2[s.llIIIlII[5]] = llIIIlII[11];
                                nArray2[s.llIIIlII[6]] = llIIIlII[12];
                                nArray2[s.llIIIlII[13]] = llIIIlII[14];
                                if (s.lIlIIIlllll(e.b(nArray2) ? 1 : 0)) {
                                    a.a(llIIIlII[8], llIIIlII[0]);
                                    a.a(llIIIlII[14], llIIIlII[0]);
                                    a.a(llIIIlII[9], llIIIlII[1]);
                                    a.a(llIIIlII[10], llIIIlII[1]);
                                    a.a(llIIIlII[11], llIIIlII[0]);
                                    a.a(llIIIlII[12], llIIIlII[1]);
                                    a.a(llIIIlII[16], llIIIlII[5]);
                                    a.a(llIIIlII[17], llIIIlII[18]);
                                }
                            }
                        }
                    }
                }
                if (s.lIlIIIlllll(Inventory.contains((int[])f.bb) ? 1 : 0) && s.lIlIIIlllIl(Movement.getRunEnergy(), llIIIlII[19])) {
                    Inventory.getFirst((int[])f.bb).interact(llIIIIlI[llIIIlII[13]]);
                    Time.sleepTicks((int)llIIIlII[1]);

                }
                if (s.lIlIIIlllll(s.ac() ? 1 : 0) && s.lIlIIIlllIl(e.j(cM), llIIIlII[1])) {
                    int[] nArray = new int[llIIIlII[1]];
                    nArray[s.llIIIlII[2]] = llIIIlII[20];
                    if (s.lIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (s.lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[0])) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[15]];
                            if (s.lIlIIIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)ce);

                            Time.sleepTicks((int)llIIIlII[1]);

                        }
                        if (s.lIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[21])) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[7]];
                            g.a(llIIIIlI[llIIIlII[22]], bX);
                        }
                    }
                }
                if (s.lIlIIlIIlIl(e.j(cM), llIIIlII[1])) {
                    int[] nArray = new int[llIIIlII[1]];
                    nArray[s.llIIIlII[2]] = llIIIlII[20];
                    if (s.lIlIIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIlII[1]];
                        stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[23]];
                        if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            ci = llIIIlII[2];
                            String[] stringArray2 = new String[llIIIlII[1]];
                            stringArray2[s.llIIIlII[2]] = llIIIIlI[llIIIlII[0]];
                            if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                if (s.lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(cI), llIIIlII[6])) {
                                    AccBuilderBarrows.c = llIIIIlI[llIIIlII[24]];
                                    Movement.walkTo((WorldPoint)cI);

                                }
                                if (s.lIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(cI), llIIIlII[6])) {
                                    AccBuilderBarrows.c = llIIIIlI[llIIIlII[21]];
                                    String[] stringArray3 = new String[llIIIlII[1]];
                                    stringArray3[s.llIIIlII[2]] = llIIIIlI[llIIIlII[25]];
                                    if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[llIIIlII[1]];
                                        stringArray4[s.llIIIlII[2]] = llIIIIlI[llIIIlII[26]];
                                        if (s.lIlIIlIIIIl(TileObjects.getNearest((String[])stringArray4))) {
                                            String[] stringArray5 = new String[llIIIlII[1]];
                                            stringArray5[s.llIIIlII[2]] = llIIIIlI[llIIIlII[27]];
                                            TileObjects.getNearest((String[])stringArray5).interact(llIIIIlI[llIIIlII[28]]);
                                            Time.sleepTicks((int)llIIIlII[3]);

                                        }
                                    }
                                }
                            }
                            String[] stringArray6 = new String[llIIIlII[1]];
                            stringArray6[s.llIIIlII[2]] = llIIIIlI[llIIIlII[29]];
                            if (s.lIlIIIlllll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                if (s.lIlIIlIIIII(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIIIIlI[llIIIlII[30]];
                                    if (s.lIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)cL);

                                        Time.sleepTicks((int)llIIIlII[1]);

                                    }
                                    g.a(bX);
                                }
                                if (s.lIlIIIlllll(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray7 = new String[llIIIlII[1]];
                                    stringArray7[s.llIIIlII[2]] = llIIIIlI[llIIIlII[31]];
                                    if (s.lIlIIIlllll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[32]];
                                        String[] stringArray8 = new String[llIIIlII[1]];
                                        stringArray8[s.llIIIlII[2]] = llIIIIlI[llIIIlII[33]];
                                        if (s.lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray8).getWorldLocation()), llIIIlII[3])) {
                                            String[] stringArray9 = new String[llIIIlII[1]];
                                            stringArray9[s.llIIIlII[2]] = llIIIIlI[llIIIlII[34]];
                                            Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray9).getWorldLocation());

                                            Time.sleepTicks((int)llIIIlII[6]);

                                        }
                                        if (s.lIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[llIIIlII[1]];
                                            stringArray10[s.llIIIlII[2]] = llIIIIlI[llIIIlII[35]];
                                            String[] stringArray11 = new String[llIIIlII[1]];
                                            stringArray11[s.llIIIlII[2]] = llIIIIlI[llIIIlII[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)llIIIlII[3]);

                                        }
                                        g.a(bX);
                                    }
                                    String[] stringArray12 = new String[llIIIlII[1]];
                                    stringArray12[s.llIIIlII[2]] = llIIIIlI[llIIIlII[37]];
                                    if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray12) ? 1 : 0) && s.lIlIIlIIIII(cG ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[38]];
                                        g.a(llIIIIlI[llIIIlII[20]], bX);
                                        if (s.lIlIIIlllll(Dialog.getText().contains(llIIIIlI[llIIIlII[39]]) ? 1 : 0)) {
                                            cG = llIIIlII[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (s.lIlIIlIIlIl(e.j(cM), llIIIlII[5])) {
                    String[] stringArray = new String[llIIIlII[1]];
                    stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[40]];
                    if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray13 = new String[llIIIlII[1]];
                        stringArray13[s.llIIIlII[2]] = llIIIIlI[llIIIlII[41]];
                        if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[42]];
                            int[] nArray = new int[llIIIlII[1]];
                            nArray[s.llIIIlII[2]] = llIIIlII[43];
                            NPCs.getNearest((int[])nArray).interact(llIIIIlI[llIIIlII[44]]);
                            Time.sleepTicks((int)llIIIlII[13]);

                        }
                    }
                    String[] stringArray14 = new String[llIIIlII[1]];
                    stringArray14[s.llIIIlII[2]] = llIIIIlI[llIIIlII[45]];
                    if (s.lIlIIIlllll(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[46]];
                        g.a(llIIIIlI[llIIIlII[47]], bX);
                    }
                }
                String[] stringArray = new String[llIIIlII[1]];
                stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[48]];
                if (s.lIlIIIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (s.lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[13])) {
                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[49]];
                        Movement.walkTo((WorldPoint)ce);

                        Time.sleepTicks((int)llIIIlII[1]);

                    }
                    if (s.lIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[13])) {
                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[50]];
                        if (s.lIlIIIlllIl(ci, llIIIlII[1])) {
                            Q.jB += llIIIlII[1];
                            Q.o(AccBuilderBarrows.m);
                            ci += llIIIlII[1];
                            Q.jB = llIIIlII[2];
                            cj = llIIIlII[2];
                        }
                        g.a(llIIIIlI[llIIIlII[51]], bX);
                    }
                }
            }
        }
    }

    private static boolean lIlIIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        s.lIlIIIlllII();
        s.lIlIIIllIll();
        bB = new ArrayList<d>();
        cF = new WorldArea(llIIIlII[65], llIIIlII[66], llIIIlII[24], llIIIlII[25], llIIIlII[2]);
        String[] stringArray = new String[llIIIlII[22]];
        stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[67]];
        stringArray[s.llIIIlII[1]] = llIIIIlI[llIIIlII[68]];
        stringArray[s.llIIIlII[3]] = llIIIIlI[llIIIlII[69]];
        stringArray[s.llIIIlII[5]] = llIIIIlI[llIIIlII[19]];
        stringArray[s.llIIIlII[6]] = llIIIIlI[llIIIlII[70]];
        stringArray[s.llIIIlII[13]] = llIIIIlI[llIIIlII[71]];
        stringArray[s.llIIIlII[15]] = llIIIIlI[llIIIlII[72]];
        stringArray[s.llIIIlII[7]] = llIIIIlI[llIIIlII[73]];
        bX = stringArray;
        ce = new WorldPoint(llIIIlII[74], llIIIlII[75], llIIIlII[2]);
        cH = new WorldPoint(llIIIlII[76], llIIIlII[77], llIIIlII[2]);
        cI = new WorldPoint(llIIIlII[78], llIIIlII[79], llIIIlII[2]);
        cJ = new WorldPoint(llIIIlII[80], llIIIlII[81], llIIIlII[2]);
        cK = new WorldPoint(llIIIlII[82], llIIIlII[83], llIIIlII[2]);
        cL = new WorldPoint(llIIIlII[84], llIIIlII[85], llIIIlII[2]);
        cM = llIIIlII[24];
    }

    @Override
    public String V() {
        return llIIIIlI[llIIIlII[63]];
    }

    private static boolean lIlIIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (s.lIlIIIllllI(e.j(cM), llIIIlII[13])) {
            bl = llIIIlII[1];

            if (3 <= 0) {
                return ((0x5B ^ 0x50 ^ (0x41 ^ 0x67)) & (2 ^ (0xEB ^ 0xC4) ^ -1)) != 0;
            }
        } else {
            bl = llIIIlII[2];
        }
        return bl;
    }

    private static void ag() {
        d lIlIllIIlIIIllI;
        Object lIlIllIIlIIIlll;
        int[] nArray = new int[llIIIlII[1]];
        nArray[s.llIIIlII[2]] = llIIIlII[12];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIIlII[12], llIIIlII[1], llIIIlII[57]);
            bB.add(d2);

        }
        int[] nArray2 = new int[llIIIlII[1]];
        nArray2[s.llIIIlII[2]] = llIIIlII[10];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIllIIlIIIlll = new DHelper(llIIIlII[10], llIIIlII[1], llIIIlII[4]);
            bB.add((DHelper) IlIllIIlIIIlll);

        }
        int[] nArray3 = new int[llIIIlII[1]];
        nArray3[s.llIIIlII[2]] = llIIIlII[9];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIllIIlIIIlll = new DHelper(llIIIlII[9], llIIIlII[1], llIIIlII[4]);
            bB.add((DHelper) IlIllIIlIIIlll);

        }
        int[] nArray4 = new int[llIIIlII[1]];
        nArray4[s.llIIIlII[2]] = llIIIlII[14];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIllIIlIIIlll = new DHelper(llIIIlII[14], llIIIlII[24], llIIIlII[4]);
            bB.add((DHelper) IlIllIIlIIIlll);

        }
        int[] nArray5 = new int[llIIIlII[1]];
        nArray5[s.llIIIlII[2]] = llIIIlII[16];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlIllIIlIIIlll = new DHelper(llIIIlII[16], llIIIlII[24], i.bw);
            bB.add((DHelper) IlIllIIlIIIlll);

        }
        int[] nArray6 = new int[llIIIlII[1]];
        nArray6[s.llIIIlII[2]] = llIIIlII[11];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlIllIIlIIIlll = new DHelper(llIIIlII[11], llIIIlII[0], llIIIlII[58]);
            bB.add((DHelper) IlIllIIlIIIlll);

        }
        if (s.lIlIIlIIIII(Bank.contains((Predicate)(lIlIllIIlIIIlll = item -> item.getName().toLowerCase().contains(llIIIIlI[llIIIlII[64]]))) ? 1 : 0)) {
            lIlIllIIlIIIllI = new DHelper(llIIIlII[59], llIIIlII[13], llIIIlII[60]);
            bB.add(lIlIllIIlIIIllI);

        }
        int[] nArray7 = new int[llIIIlII[1]];
        nArray7[s.llIIIlII[2]] = llIIIlII[8];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlIllIIlIIIllI = new DHelper(llIIIlII[8], llIIIlII[52], llIIIlII[61]);
            bB.add(lIlIllIIlIIIllI);

        }
    }

    private static void lIlIIIllIll() {
        llIIIIlI = new String[llIIIlII[86]];
        s.llIIIIlI[s.llIIIlII[2]] = "Finished buying items, switching back to quest";
        s.llIIIIlI[s.llIIIlII[1]] = "Fishing pass";
        s.llIIIIlI[s.llIIIlII[3]] = "Nav to bank";
        s.llIIIIlI[s.llIIIlII[5]] = "Handling banking";
        s.llIIIIlI[s.llIIIlII[6]] = "We are missing quest supplies, switching to BUYING";
        s.llIIIIlI[s.llIIIlII[13]] = "Drink";
        s.llIIIIlI[s.llIIIlII[15]] = "Nav to start";
        s.llIIIIlI[s.llIIIlII[7]] = "Starting quest";
        s.llIIIIlI[s.llIIIlII[22]] = "Vestri";
        s.llIIIIlI[s.llIIIlII[23]] = "Fishing trophy";
        s.llIIIIlI[s.llIIIlII[0]] = "Red vine worm";
        s.llIIIIlI[s.llIIIlII[24]] = "Nav to vine";
        s.llIIIIlI[s.llIIIlII[21]] = "Digging";
        s.llIIIIlI[s.llIIIlII[25]] = "Red vine worm";
        s.llIIIIlI[s.llIIIlII[26]] = "Vine";
        s.llIIIIlI[s.llIIIlII[27]] = "Vine";
        s.llIIIIlI[s.llIIIlII[28]] = "Check";
        s.llIIIIlI[s.llIIIlII[29]] = "Red vine worm";
        s.llIIIIlI[s.llIIIlII[30]] = "Nav to contest";
        s.llIIIIlI[s.llIIIlII[31]] = "Garlic";
        s.llIIIIlI[s.llIIIlII[32]] = "Using garlic";
        s.llIIIIlI[s.llIIIlII[33]] = "Wall Pipe";
        s.llIIIIlI[s.llIIIlII[34]] = "Wall Pipe";
        s.llIIIIlI[s.llIIIlII[35]] = "Garlic";
        s.llIIIIlI[s.llIIIlII[36]] = "Wall Pipe";
        s.llIIIIlI[s.llIIIlII[37]] = "Garlic";
        s.llIIIIlI[s.llIIIlII[38]] = "Start contest";
        s.llIIIIlI[s.llIIIlII[20]] = "Bonzo";
        s.llIIIIlI[s.llIIIlII[39]] = "I might still be able to find a bigger fish";
        s.llIIIIlI[s.llIIIlII[40]] = "Garlic";
        s.llIIIIlI[s.llIIIlII[41]] = "Raw giant carp";
        s.llIIIIlI[s.llIIIlII[42]] = "Fishing";
        s.llIIIIlI[s.llIIIlII[44]] = "Bait";
        s.llIIIIlI[s.llIIIlII[45]] = "Raw giant carp";
        s.llIIIIlI[s.llIIIlII[46]] = "Handing in fish";
        s.llIIIIlI[s.llIIIlII[47]] = "Bonzo";
        s.llIIIIlI[s.llIIIlII[48]] = "Fishing trophy";
        s.llIIIIlI[s.llIIIlII[49]] = "Nav to start";
        s.llIIIIlI[s.llIIIlII[50]] = "Finishing quest";
        s.llIIIIlI[s.llIIIlII[51]] = "Vestri";
        s.llIIIIlI[s.llIIIlII[52]] = "Camelot teleport";
        s.llIIIIlI[s.llIIIlII[53]] = "Garlic";
        s.llIIIIlI[s.llIIIlII[54]] = "Spade";
        s.llIIIIlI[s.llIIIlII[55]] = "Fishing rod";
        s.llIIIIlI[s.llIIIlII[56]] = "Fishing bait";
        s.llIIIIlI[s.llIIIlII[63]] = "Fishing contest";
        s.llIIIIlI[s.llIIIlII[64]] = "ring of wealth (";
        s.llIIIIlI[s.llIIIlII[67]] = "I was wondering what was down those stairs?";
        s.llIIIIlI[s.llIIIlII[68]] = "Why not?";
        s.llIIIIlI[s.llIIIlII[69]] = "If you were my friend I wouldn't mind it.";
        s.llIIIIlI[s.llIIIlII[19]] = "Well, let's be friends!";
        s.llIIIIlI[s.llIIIlII[70]] = "And how am I meant to do that?";
        s.llIIIIlI[s.llIIIlII[71]] = "I'll enter the competition please.";
        s.llIIIIlI[s.llIIIlII[72]] = "I have this big fish. Is it enough to win?";
        s.llIIIIlI[s.llIIIlII[73]] = "Yes.";
    }

    private static boolean lIlIIlIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlllll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        int[] nArray = new int[llIIIlII[1]];
        nArray[s.llIIIlII[2]] = llIIIlII[8];
        if (s.lIlIIlIIIlI(Inventory.getCount((int[])nArray))) {
            String[] stringArray = new String[llIIIlII[1]];
            stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[52]];
            if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray))) {
                String[] stringArray2 = new String[llIIIlII[1]];
                stringArray2[s.llIIIlII[2]] = llIIIIlI[llIIIlII[53]];
                if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray2))) {
                    String[] stringArray3 = new String[llIIIlII[1]];
                    stringArray3[s.llIIIlII[2]] = llIIIIlI[llIIIlII[54]];
                    if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray3))) {
                        String[] stringArray4 = new String[llIIIlII[1]];
                        stringArray4[s.llIIIlII[2]] = llIIIIlI[llIIIlII[55]];
                        if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray4))) {
                            String[] stringArray5 = new String[llIIIlII[1]];
                            stringArray5[s.llIIIlII[2]] = llIIIIlI[llIIIlII[56]];
                            if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray5))) {
                                int[] nArray2 = new int[llIIIlII[1]];
                                nArray2[s.llIIIlII[2]] = llIIIlII[17];
                                if (s.lIlIIlIIIlI(Inventory.getCount((int[])nArray2)) && s.lIlIIIlllll(Inventory.contains((int[])f.bb) ? 1 : 0)) {
                                    n2 = llIIIlII[1];

                                    if (null == null) return n2 != 0;
                                    return ((0xF2 ^ 0x99 ^ (0xE ^ 0x47)) & (0xBB ^ 0xAB ^ (0xB4 ^ 0x86) ^ -1)) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = llIIIlII[2];
        return n2 != 0;
    }

    private static boolean lIlIIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int U() {
        try {
            s.aI();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 == 3) {
            return (0xE9 ^ 0xC2) & ~(0xE8 ^ 0xC3);
        }
        return llIIIlII[62];
    }

}

