/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.OHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
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
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class NHelper
implements ab {
    static final  int iA;
    private static final  int jh;
    static  WorldPoint jw;
    private static final  WorldPoint jd;
    static final  WorldPoint[] iD;
    public static final  WorldPoint ir;
    private static final  WorldPoint iV;
    static final  int iu;
    private static final  WorldPoint iU;
    private static final  WorldPoint iS;
    public static  List<d> bx;
    private static final  WorldPoint iI;
    private static final  WorldPoint je;
    public static final  int[] im;
    static  int jq;
    static  String jv;
    public static final  int[] ik;
    private static final  WorldPoint iY;
    static  int dk;
    static  WorldPoint jy;
    public static final  WorldPoint ip;
    
    static final  int ix;
    private static final  int jj;
    public static final  WorldArea in;
    public static  WorldArea jk;
    public static final  WorldPoint iq;
    private static final  WorldPoint jc;
    static  String[] eY;
    private static final  WorldPoint iE;
    static  int js;
    
    static  String jt;
    static final  int iB;
    private static final  WorldPoint iG;
    private static final  WorldPoint iM;
    private static final  int jf;
    private static final  WorldPoint iZ;
    public static final  WorldPoint it;
    private static final  WorldPoint iP;
    private static final  WorldPoint iK;
    public static final  WorldPoint io;
    static final  int iC;
    static final  int iz;
    private static final  WorldPoint jb;
    static  int jo;
    public static final  int[] il;
    private static final  WorldPoint iH;
    static  boolean dl;
    private static final  WorldPoint iL;
    private static final  WorldPoint iT;
    private static final  WorldPoint iF;
    private static final  int ji;
    static  WorldArea jz;
    private static final  WorldPoint iR;
    private static final  WorldPoint iJ;
    private static final  WorldPoint iN;
    static  int jp;
    static final  int iw;
    private static final  int jg;
    private static final  WorldPoint iQ;
    private static final  WorldPoint iX;
    static final  int iv;
    private static final  WorldPoint ja;
    public static  boolean bv;
    static  int jr;
    public static  int jm;
    public static  int jl;
    static  WorldArea jx;
    private static final  WorldPoint iO;
    private static final  WorldPoint iW;
    static final  int iy;
    static  int jn;
    public static final  WorldPoint is;
    static  int cI;
    static  String ju;

    private static boolean llIIlIIlIIII(Object object) {
        return object != null;
    }

    private static boolean llIIlIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void cv() {
        block254: {
            block289: {
                Item llIllIIIIlllI;
                BankLocation llIllIIIIllll;
                block270: {
                    block253: {
                        block252: {
                            block251: {
                                block250: {
                                    block249: {
                                        block248: {
                                            block265: {
                                                block268: {
                                                    block269: {
                                                        block266: {
                                                            block267: {
                                                                block255: {
                                                                    block256: {
                                                                        block264: {
                                                                            block262: {
                                                                                block263: {
                                                                                    block261: {
                                                                                        block260: {
                                                                                            block258: {
                                                                                                block259: {
                                                                                                    block257: {
                                                                                                        if (N.llIIlIIIlIll(bv ? 1 : 0)) {
                                                                                                            AccBuilderGWD.c = lllIIlIII[lllIlIllI[0]];
                                                                                                            b.a(bx);
                                                                                                            if (N.llIIlIIIllII(bx.size(), lllIlIllI[1])) {
                                                                                                                System.out.println(lllIIlIII[lllIlIllI[1]]);
                                                                                                                bv = lllIlIllI[0];
                                                                                                            }
                                                                                                        }
                                                                                                        if (!N.llIIlIIIllIl(bv ? 1 : 0)) break block254;
                                                                                                        if (N.llIIlIIIlIll(Inventory.contains((int[])f.bc) ? 1 : 0) && N.llIIlIIIllII(Movement.getRunEnergy(), lllIlIllI[2]) && N.llIIlIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                                                                                                            Inventory.getFirst((int[])f.bc).interact(lllIIlIII[lllIlIllI[3]]);
                                                                                                            Time.sleepTicks((int)lllIlIllI[1]);

                                                                                                        }
                                                                                                        if (!N.llIIlIIIlllI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllIlIllI[4]) || N.llIIlIIIlIll(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lllIlIllI[1]];
                                                                                                            stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[5]];
                                                                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lllIlIllI[1]];
                                                                                                                stringArray2[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(lllIIlIII[lllIlIllI[7]]);
                                                                                                                Time.sleepTicks((int)lllIlIllI[1]);

                                                                                                            }
                                                                                                        }
                                                                                                        if (N.llIIlIIIllII(e.j(lllIlIllI[8]), lllIlIllI[9])) {
                                                                                                            O.cB();
                                                                                                        }
                                                                                                        if (!N.llIIlIIIllIl(e.j(lllIlIllI[10])) || !N.llIIlIIIllll(e.j(lllIlIllI[8]), lllIlIllI[9])) break block255;
                                                                                                        if (!N.llIIlIIIllIl(N.aM() ? 1 : 0)) break block256;
                                                                                                        llIllIIIIllll = BankLocation.getNearest();
                                                                                                        if (N.llIIlIIlIIII(llIllIIIIllll) && N.llIIlIIIllIl(llIllIIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderGWD.c = lllIIlIII[lllIlIllI[11]];
                                                                                                            a.a(llIllIIIIllll);
                                                                                                        }
                                                                                                        if (!N.llIIlIIlIIII(llIllIIIIllll) || !N.llIIlIIIlIll(llIllIIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (N.llIIlIIIllIl(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderGWD.c = lllIIlIII[lllIlIllI[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIllI[12]);

                                                                                                        }
                                                                                                        if (!N.llIIlIIIlIll(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[13]];
                                                                                                        if (N.llIIlIIlIIIl(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lllIlIllI[5]);

                                                                                                        }
                                                                                                        if (N.llIIlIIlIIIl(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lllIlIllI[3]);

                                                                                                        }
                                                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[14];
                                                                                                        if (!N.llIIlIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block257;
                                                                                                        int[] nArray2 = new int[lllIlIllI[1]];
                                                                                                        nArray2[N.lllIlIllI[0]] = lllIlIllI[14];
                                                                                                        if (!N.llIIlIIIllll(Bank.getFirst((int[])nArray2).getQuantity(), lllIlIllI[11])) break block258;
                                                                                                    }
                                                                                                    int[] nArray = new int[lllIlIllI[1]];
                                                                                                    nArray[N.lllIlIllI[0]] = lllIlIllI[15];
                                                                                                    if (!N.llIIlIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block259;
                                                                                                    int[] nArray3 = new int[lllIlIllI[1]];
                                                                                                    nArray3[N.lllIlIllI[0]] = lllIlIllI[15];
                                                                                                    if (!N.llIIlIIIllll(Bank.getFirst((int[])nArray3).getQuantity(), lllIlIllI[11])) break block258;
                                                                                                }
                                                                                                int[] nArray = new int[lllIlIllI[1]];
                                                                                                nArray[N.lllIlIllI[0]] = lllIlIllI[16];
                                                                                                if (!N.llIIlIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block260;
                                                                                                int[] nArray4 = new int[lllIlIllI[1]];
                                                                                                nArray4[N.lllIlIllI[0]] = lllIlIllI[16];
                                                                                                if (!N.llIIlIIIllII(Bank.getFirst((int[])nArray4).getQuantity(), lllIlIllI[11])) break block260;
                                                                                            }
                                                                                            N.Q();
                                                                                            System.out.println(lllIIlIII[lllIlIllI[17]]);
                                                                                            bv = lllIlIllI[1];
                                                                                            return;
                                                                                        }
                                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[18];
                                                                                        if (!N.llIIlIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block261;
                                                                                        String[] stringArray = new String[lllIlIllI[1]];
                                                                                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[19]];
                                                                                        if (!N.llIIlIIIllll(Inventory.getCount((String[])stringArray), lllIlIllI[1])) break block262;
                                                                                    }
                                                                                    int[] nArray = new int[lllIlIllI[1]];
                                                                                    nArray[N.lllIlIllI[0]] = lllIlIllI[20];
                                                                                    if (!N.llIIlIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block263;
                                                                                    String[] stringArray = new String[lllIlIllI[1]];
                                                                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[21]];
                                                                                    if (!N.llIIlIIIllll(Inventory.getCount((String[])stringArray), lllIlIllI[1])) break block262;
                                                                                }
                                                                                if (!(N.llIIlIIIllIl(Bank.contains((int[])f.aV) ? 1 : 0) && !N.llIIlIIIllll(Inventory.getCount((int[])f.aV), lllIlIllI[1]) || N.llIIlIIIllIl(Bank.contains((int[])f.aU) ? 1 : 0) && !N.llIIlIIIllll(Inventory.getCount((int[])f.aU), lllIlIllI[1])) && (!N.llIIlIIIllIl(Bank.contains((int[])f.bc) ? 1 : 0) || !N.llIIlIIIllII(Inventory.getCount((int[])f.bc), lllIlIllI[1]))) break block264;
                                                                            }
                                                                            N.Q();
                                                                            System.out.println(lllIIlIII[lllIlIllI[22]]);
                                                                            bv = lllIlIllI[1];
                                                                            return;
                                                                        }
                                                                        String[] stringArray = new String[lllIlIllI[1]];
                                                                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[23]];
                                                                        if (N.llIIlIIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            a.a(lllIlIllI[18], lllIlIllI[1]);
                                                                        }
                                                                        if (N.llIIlIIIllIl(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                                                                            a.a(f.aV, lllIlIllI[1]);
                                                                        }
                                                                        if (N.llIIlIIIllIl(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                                                                            a.a(lllIlIllI[24], lllIlIllI[1]);
                                                                        }
                                                                        if (N.llIIlIIIllIl(Inventory.contains((int[])f.bc) ? 1 : 0)) {
                                                                            a.a(f.bc, lllIlIllI[6]);
                                                                        }
                                                                        String[] stringArray3 = new String[lllIlIllI[1]];
                                                                        stringArray3[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[4]];
                                                                        if (N.llIIlIIIllIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                                            a.a(lllIlIllI[20], lllIlIllI[25]);
                                                                        }
                                                                    }
                                                                    if (N.llIIlIIIlIll(N.aM() ? 1 : 0)) {
                                                                        if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iI), lllIlIllI[7])) {
                                                                            if (N.llIIlIIIlIll(Bank.isOpen() ? 1 : 0)) {
                                                                                Bank.close();
                                                                                Time.sleepTicks((int)lllIlIllI[5]);

                                                                            }
                                                                            if (N.llIIlIIIllIl(Bank.isOpen() ? 1 : 0)) {
                                                                                if (N.llIIlIIIllII(cI, lllIlIllI[1])) {
                                                                                    if (N.llIIlIIIlIll(Inventory.contains((int[])f.bc) ? 1 : 0) && N.llIIlIIIllII(Movement.getRunEnergy(), lllIlIllI[2])) {
                                                                                        Inventory.getFirst((int[])f.bc).interact(lllIIlIII[lllIlIllI[26]]);
                                                                                        Time.sleepTicks((int)lllIlIllI[1]);

                                                                                    }
                                                                                    e.x();
                                                                                    cI += lllIlIllI[1];
                                                                                }
                                                                                AccBuilderGWD.c = lllIIlIII[lllIlIllI[27]];
                                                                                Movement.walkTo((WorldPoint)iI);

                                                                                Time.sleepTicks((int)lllIlIllI[1]);

                                                                            }
                                                                        }
                                                                        if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iI), lllIlIllI[7])) {
                                                                            AccBuilderGWD.c = lllIIlIII[lllIlIllI[28]];
                                                                            g.a(jv, eY);
                                                                        }
                                                                    }
                                                                }
                                                                if (N.llIIlIIlIIll(e.j(lllIlIllI[10]), lllIlIllI[1])) {
                                                                    if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iL), lllIlIllI[5])) {
                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[25]];
                                                                        Movement.walkTo((WorldPoint)iL);

                                                                    }
                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iL), lllIlIllI[5])) {
                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[29]];
                                                                        g.a(ju, eY);
                                                                    }
                                                                }
                                                                if (N.llIIlIIlIIll(e.j(lllIlIllI[10]), lllIlIllI[3])) {
                                                                    if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iN), lllIlIllI[6])) {
                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[30]];
                                                                        Movement.walkTo((WorldPoint)iN);

                                                                        Time.sleepTicks((int)lllIlIllI[1]);

                                                                    }
                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iN), lllIlIllI[6])) {
                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[31];
                                                                        llIllIIIIllll = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[lllIlIllI[1]];
                                                                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[32]];
                                                                        if (N.llIIlIIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderGWD.c = lllIIlIII[lllIlIllI[33]];
                                                                            if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                                llIllIIIIllll.interact(lllIIlIII[lllIlIllI[34]]);
                                                                                Time.sleepTicks((int)lllIlIllI[3]);

                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iN), lllIlIllI[19])) {
                                                                    String[] stringArray = new String[lllIlIllI[1]];
                                                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[35]];
                                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0) && N.llIIlIIlIIll(Players.getLocal().getAnimation(), lllIlIllI[36]) && N.llIIlIIlIlII(e.j(lllIlIllI[10]), lllIlIllI[5])) {
                                                                        String[] stringArray4 = new String[lllIlIllI[1]];
                                                                        stringArray4[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[37]];
                                                                        llIllIIIIllll = Inventory.getFirst((String[])stringArray4);
                                                                        if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                            AccBuilderGWD.c = lllIIlIII[lllIlIllI[38]];
                                                                            llIllIIIIllll.interact(lllIIlIII[lllIlIllI[39]]);
                                                                            Time.sleepTicks((int)lllIlIllI[3]);

                                                                        }
                                                                    }
                                                                }
                                                                if (N.llIIlIIlIIll(e.j(lllIlIllI[10]), lllIlIllI[5])) {
                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iN), lllIlIllI[19])) {
                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                        if (N.llIIlIIIllII(Inventory.getCount((int[])nArray), lllIlIllI[1])) {
                                                                            int[] nArray5 = new int[lllIlIllI[1]];
                                                                            nArray5[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                            if (N.llIIlIIIllII(Inventory.getCount((int[])nArray5), lllIlIllI[1])) {
                                                                                AccBuilderGWD.c = lllIIlIII[lllIlIllI[42]];
                                                                                if (N.llIIlIIIlIll(Inventory.contains(item -> item.getName().contains(lllIIlIII[lllIlIllI[304]])) ? 1 : 0) && N.llIIlIIIllIl(Equipment.contains(item -> item.getName().contains(lllIIlIII[lllIlIllI[41]])) ? 1 : 0)) {
                                                                                    Inventory.getFirst(item -> item.getName().contains(lllIIlIII[lllIlIllI[40]])).interact(lllIIlIII[lllIlIllI[43]]);
                                                                                }
                                                                                if (N.llIIlIIIlIll(Equipment.contains(item -> item.getName().contains(lllIIlIII[lllIlIllI[332]])) ? 1 : 0) && N.llIIlIIIllIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                                                                                    Equipment.getFirst(item -> item.getName().contains(lllIIlIII[lllIlIllI[331]])).interact(lllIIlIII[lllIlIllI[44]]);
                                                                                    Time.sleepTicks((int)lllIlIllI[6]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iO), lllIlIllI[5])) {
                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                        if (N.llIIlIIIllII(Inventory.getCount((int[])nArray), lllIlIllI[1])) {
                                                                            int[] nArray6 = new int[lllIlIllI[1]];
                                                                            nArray6[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                            if (N.llIIlIIIllII(Inventory.getCount((int[])nArray6), lllIlIllI[1]) && N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iP), lllIlIllI[44]) && N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iN), lllIlIllI[19])) {
                                                                                AccBuilderGWD.c = lllIIlIII[lllIlIllI[45]];
                                                                                if (N.llIIlIIIllIl(jx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)jy);

                                                                                }
                                                                                if (N.llIIlIIIlIll(jx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(iD));

                                                                                    Time.sleepTicks((int)lllIlIllI[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iO), lllIlIllI[5])) {
                                                                        String[] stringArray = new String[lllIlIllI[1]];
                                                                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[46]];
                                                                        if (N.llIIlIIlIIII(TileObjects.getNearest((String[])stringArray))) {
                                                                            int[] nArray = new int[lllIlIllI[1]];
                                                                            nArray[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                            if (N.llIIlIIIllII(Inventory.getCount((int[])nArray), lllIlIllI[1])) {
                                                                                int[] nArray7 = new int[lllIlIllI[1]];
                                                                                nArray7[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                                if (N.llIIlIIIllII(Inventory.getCount((int[])nArray7), lllIlIllI[1])) {
                                                                                    int[] nArray8 = new int[lllIlIllI[1]];
                                                                                    nArray8[N.lllIlIllI[0]] = lllIlIllI[47];
                                                                                    llIllIIIIllll = TileObjects.getNearest((int[])nArray8);
                                                                                    if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                                        llIllIIIIllll.interact(lllIIlIII[lllIlIllI[48]]);
                                                                                        Time.sleepTicks((int)lllIlIllI[5]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iP), lllIlIllI[3])) {
                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[49];
                                                                        if (N.llIIlIIlIIII(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray9 = new int[lllIlIllI[1]];
                                                                            nArray9[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                            if (N.llIIlIIIllII(Inventory.getCount((int[])nArray9), lllIlIllI[1])) {
                                                                                int[] nArray10 = new int[lllIlIllI[1]];
                                                                                nArray10[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                                if (N.llIIlIIIllII(Inventory.getCount((int[])nArray10), lllIlIllI[1])) {
                                                                                    AccBuilderGWD.c = lllIIlIII[lllIlIllI[50]];
                                                                                    Movement.walkTo((WorldPoint)iP);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iP), lllIlIllI[5])) {
                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[49];
                                                                        if (N.llIIlIIlIIII(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray11 = new int[lllIlIllI[1]];
                                                                            nArray11[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                            if (N.llIIlIIIllII(Inventory.getCount((int[])nArray11), lllIlIllI[1])) {
                                                                                int[] nArray12 = new int[lllIlIllI[1]];
                                                                                nArray12[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                                if (N.llIIlIIIllII(Inventory.getCount((int[])nArray12), lllIlIllI[1])) {
                                                                                    AccBuilderGWD.c = lllIIlIII[lllIlIllI[51]];
                                                                                    int[] nArray13 = new int[lllIlIllI[1]];
                                                                                    nArray13[N.lllIlIllI[0]] = lllIlIllI[49];
                                                                                    llIllIIIIllll = TileObjects.getNearest((int[])nArray13);
                                                                                    if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                                        llIllIIIIllll.interact(lllIIlIII[lllIlIllI[52]]);
                                                                                        Time.sleepTicks((int)lllIlIllI[3]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iQ), lllIlIllI[3])) {
                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                        if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray)) && N.llIIlIIIllII(Players.getLocal().getWorldLocation().getY(), lllIlIllI[53])) {
                                                                            int[] nArray14 = new int[lllIlIllI[1]];
                                                                            nArray14[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                            if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray14))) {
                                                                                int[] nArray15 = new int[lllIlIllI[1]];
                                                                                nArray15[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                                if (N.llIIlIIIllII(Inventory.getCount((int[])nArray15), lllIlIllI[1])) {
                                                                                    AccBuilderGWD.c = lllIIlIII[lllIlIllI[54]];
                                                                                    Movement.walkTo((WorldPoint)iQ);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iQ), lllIlIllI[3])) {
                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                        if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray)) && N.llIIlIIIllII(Players.getLocal().getWorldLocation().getY(), lllIlIllI[53])) {
                                                                            int[] nArray16 = new int[lllIlIllI[1]];
                                                                            nArray16[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                            if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray16))) {
                                                                                int[] nArray17 = new int[lllIlIllI[1]];
                                                                                nArray17[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                                if (N.llIIlIIIllII(Inventory.getCount((int[])nArray17), lllIlIllI[1])) {
                                                                                    int[] nArray18 = new int[lllIlIllI[1]];
                                                                                    nArray18[N.lllIlIllI[0]] = lllIlIllI[55];
                                                                                    llIllIIIIllll = TileObjects.getNearest((int[])nArray18);
                                                                                    if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[56]];
                                                                                        int[] nArray19 = new int[lllIlIllI[1]];
                                                                                        nArray19[N.lllIlIllI[0]] = lllIlIllI[40];
                                                                                        llIllIIIIlllI = Inventory.getFirst((int[])nArray19);
                                                                                        if (N.llIIlIIlIIII(llIllIIIIlllI)) {
                                                                                            llIllIIIIlllI.useOn((TileObject)llIllIIIIllll);
                                                                                            Time.sleep((long)1L);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (N.llIIlIIIllll(Players.getLocal().getWorldLocation().getY(), lllIlIllI[53])) {
                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                        if (N.llIIlIIIllII(Inventory.getCount((int[])nArray), lllIlIllI[1])) {
                                                                            AccBuilderGWD.c = lllIIlIII[lllIlIllI[57]];
                                                                            g.a(jt, eY);
                                                                        }
                                                                    }
                                                                    int[] nArray = new int[lllIlIllI[1]];
                                                                    nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                    if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray)) && N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iS), lllIlIllI[6])) {
                                                                        String[] stringArray = new String[lllIlIllI[1]];
                                                                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[58]];
                                                                        if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray), lllIlIllI[1])) {
                                                                            String[] stringArray5 = new String[lllIlIllI[1]];
                                                                            stringArray5[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[59]];
                                                                            if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray5), lllIlIllI[1])) {
                                                                                AccBuilderGWD.c = lllIIlIII[lllIlIllI[60]];
                                                                                if (N.llIIlIIIllIl(jz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    if (N.llIIlIIIlIll(Inventory.contains(item -> item.getName().contains(lllIIlIII[lllIlIllI[330]])) ? 1 : 0) && N.llIIlIIIllIl(Equipment.contains(item -> item.getName().contains(lllIIlIII[lllIlIllI[329]])) ? 1 : 0)) {
                                                                                        Inventory.getFirst(item -> item.getName().contains(lllIIlIII[lllIlIllI[328]])).interact(lllIIlIII[lllIlIllI[61]]);
                                                                                        Time.sleepTicks((int)lllIlIllI[1]);

                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)iI);

                                                                                    Time.sleepTicks((int)lllIlIllI[1]);

                                                                                }
                                                                                if (N.llIIlIIIlIll(jz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)iS);

                                                                                    Time.sleepTicks((int)lllIlIllI[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray20 = new int[lllIlIllI[1]];
                                                                    nArray20[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                    if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray20)) && N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iS), lllIlIllI[6])) {
                                                                        String[] stringArray = new String[lllIlIllI[1]];
                                                                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[62]];
                                                                        if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray), lllIlIllI[1])) {
                                                                            String[] stringArray6 = new String[lllIlIllI[1]];
                                                                            stringArray6[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[63]];
                                                                            if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray6), lllIlIllI[1])) {
                                                                                AccBuilderGWD.c = lllIIlIII[lllIlIllI[64]];
                                                                                int[] nArray21 = new int[lllIlIllI[1]];
                                                                                nArray21[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                                llIllIIIIllll = Inventory.getFirst((int[])nArray21);
                                                                                if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                                    int[] nArray22 = new int[lllIlIllI[1]];
                                                                                    nArray22[N.lllIlIllI[0]] = lllIlIllI[65];
                                                                                    llIllIIIIlllI = TileObjects.getNearest((int[])nArray22);
                                                                                    if (N.llIIlIIlIIII(llIllIIIIlllI)) {
                                                                                        llIllIIIIllll.useOn((TileObject)llIllIIIIlllI);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[lllIlIllI[1]];
                                                                                            stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[327]];
                                                                                            if (N.llIIlIIlIIII(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = lllIlIllI[1];

                                                                                                if (3 < 0) {
                                                                                                    return false;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lllIlIllI[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lllIlIllI[66]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray23 = new int[lllIlIllI[1]];
                                                                    nArray23[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                    if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray23))) {
                                                                        String[] stringArray = new String[lllIlIllI[1]];
                                                                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[67]];
                                                                        if (N.llIIlIIlIIII(TileObjects.getNearest((String[])stringArray))) {
                                                                            String[] stringArray7 = new String[lllIlIllI[1]];
                                                                            stringArray7[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[68]];
                                                                            if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray7), lllIlIllI[1])) {
                                                                                String[] stringArray8 = new String[lllIlIllI[1]];
                                                                                stringArray8[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[69]];
                                                                                if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray8), lllIlIllI[1])) {
                                                                                    AccBuilderGWD.c = lllIIlIII[lllIlIllI[2]];
                                                                                    if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iT), lllIlIllI[6])) {
                                                                                        Movement.walkTo((WorldPoint)iT);

                                                                                    }
                                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iT), lllIlIllI[6])) {
                                                                                        int[] nArray24 = new int[lllIlIllI[1]];
                                                                                        nArray24[N.lllIlIllI[0]] = lllIlIllI[70];
                                                                                        llIllIIIIllll = TileObjects.getNearest((int[])nArray24);
                                                                                        if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                                            llIllIIIIllll.interact(lllIIlIII[lllIlIllI[71]]);
                                                                                            Time.sleepTicks((int)lllIlIllI[1]);

                                                                                        }
                                                                                        int[] nArray25 = new int[lllIlIllI[1]];
                                                                                        nArray25[N.lllIlIllI[0]] = lllIlIllI[72];
                                                                                        llIllIIIIlllI = TileObjects.getNearest((int[])nArray25);
                                                                                        if (N.llIIlIIlIIII(llIllIIIIlllI)) {
                                                                                            llIllIIIIlllI.interact(lllIIlIII[lllIlIllI[73]]);
                                                                                            Time.sleepTicks((int)lllIlIllI[1]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!N.llIIlIIlIIll(e.j(lllIlIllI[10]), lllIlIllI[6])) break block265;
                                                                dk = lllIlIllI[0];
                                                                int[] nArray = new int[lllIlIllI[1]];
                                                                nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray))) {
                                                                    String[] stringArray = new String[lllIlIllI[1]];
                                                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[74]];
                                                                    if (N.llIIlIIlIIII(TileObjects.getNearest((String[])stringArray))) {
                                                                        String[] stringArray9 = new String[lllIlIllI[1]];
                                                                        stringArray9[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[75]];
                                                                        if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray9), lllIlIllI[1])) {
                                                                            String[] stringArray10 = new String[lllIlIllI[1]];
                                                                            stringArray10[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[76]];
                                                                            if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray10), lllIlIllI[1])) {
                                                                                AccBuilderGWD.c = lllIIlIII[lllIlIllI[77]];
                                                                                if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iT), lllIlIllI[6])) {
                                                                                    Movement.walkTo((WorldPoint)iT);

                                                                                }
                                                                                if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iT), lllIlIllI[6])) {
                                                                                    int[] nArray26 = new int[lllIlIllI[1]];
                                                                                    nArray26[N.lllIlIllI[0]] = lllIlIllI[70];
                                                                                    llIllIIIIllll = TileObjects.getNearest((int[])nArray26);
                                                                                    if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                                        llIllIIIIllll.interact(lllIIlIII[lllIlIllI[78]]);
                                                                                        Time.sleepTicks((int)lllIlIllI[1]);

                                                                                    }
                                                                                    int[] nArray27 = new int[lllIlIllI[1]];
                                                                                    nArray27[N.lllIlIllI[0]] = lllIlIllI[72];
                                                                                    llIllIIIIlllI = TileObjects.getNearest((int[])nArray27);
                                                                                    if (N.llIIlIIlIIII(llIllIIIIlllI)) {
                                                                                        llIllIIIIlllI.interact(lllIIlIII[lllIlIllI[79]]);
                                                                                        Time.sleepTicks((int)lllIlIllI[1]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int[] nArray28 = new int[lllIlIllI[1]];
                                                                nArray28[N.lllIlIllI[0]] = lllIlIllI[41];
                                                                if (!N.llIIlIIlIIIl(Inventory.getCount((int[])nArray28))) break block266;
                                                                String[] stringArray = new String[lllIlIllI[1]];
                                                                stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[80]];
                                                                if (!N.llIIlIIlIlIl(TileObjects.getNearest((String[])stringArray))) break block267;
                                                                int[] nArray29 = new int[lllIlIllI[1]];
                                                                nArray29[N.lllIlIllI[0]] = lllIlIllI[81];
                                                                if (!N.llIIlIIlIIII(TileObjects.getNearest((int[])nArray29))) break block266;
                                                            }
                                                            String[] stringArray = new String[lllIlIllI[1]];
                                                            stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[82]];
                                                            if (N.llIIlIIlIIIl(Inventory.getCount((String[])stringArray))) {
                                                                String[] stringArray11 = new String[lllIlIllI[1]];
                                                                stringArray11[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[83]];
                                                                if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray11), lllIlIllI[1])) {
                                                                    if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iU), lllIlIllI[5])) {
                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[84]];
                                                                        Movement.walkTo((WorldPoint)iU);

                                                                        Time.sleepTicks((int)lllIlIllI[1]);

                                                                    }
                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iU), lllIlIllI[5])) {
                                                                        int[] nArray = new int[lllIlIllI[1]];
                                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[81];
                                                                        llIllIIIIllll = TileObjects.getNearest((int[])nArray);
                                                                        if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                            llIllIIIIllll.interact(lllIIlIII[lllIlIllI[85]]);
                                                                            Time.sleepTicks((int)lllIlIllI[1]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int[] nArray = new int[lllIlIllI[1]];
                                                        nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                                        if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray))) {
                                                            String[] stringArray = new String[lllIlIllI[1]];
                                                            stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[86]];
                                                            if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray), lllIlIllI[1])) {
                                                                String[] stringArray12 = new String[lllIlIllI[1]];
                                                                stringArray12[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[10]];
                                                                if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray12), lllIlIllI[1])) {
                                                                    String[] stringArray13 = new String[lllIlIllI[1]];
                                                                    stringArray13[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[87]];
                                                                    if (N.llIIlIIIllII(Inventory.getCount((String[])stringArray13), lllIlIllI[1]) && N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iU), lllIlIllI[6])) {
                                                                        String[] stringArray14 = new String[lllIlIllI[1]];
                                                                        stringArray14[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[88]];
                                                                        if (N.llIIlIIlIIIl(Inventory.getCount((String[])stringArray14))) {
                                                                            String[] stringArray15 = new String[lllIlIllI[1]];
                                                                            stringArray15[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[89]];
                                                                            if (N.llIIlIIlIIIl(Inventory.getCount((String[])stringArray15))) {
                                                                                AccBuilderGWD.c = lllIIlIII[lllIlIllI[90]];
                                                                                if (N.llIIlIIIllIl(Equipment.contains((int[])f.aV) ? 1 : 0) && N.llIIlIIIlIll(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                                                                                    Inventory.getFirst((int[])f.aV).interact(lllIIlIII[lllIlIllI[91]]);
                                                                                    Time.sleepTicks((int)lllIlIllI[1]);

                                                                                }
                                                                                if (N.llIIlIIIlIll(Equipment.contains((int[])f.aV) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)iR);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iR), lllIlIllI[30])) break block268;
                                                        int[] nArray30 = new int[lllIlIllI[1]];
                                                        nArray30[N.lllIlIllI[0]] = lllIlIllI[41];
                                                        if (!N.llIIlIIlIIIl(Inventory.getCount((int[])nArray30))) break block268;
                                                        String[] stringArray = new String[lllIlIllI[1]];
                                                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[92]];
                                                        if (!N.llIIlIIIllll(Inventory.getCount((String[])stringArray), lllIlIllI[1])) break block269;
                                                        String[] stringArray16 = new String[lllIlIllI[1]];
                                                        stringArray16[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[93]];
                                                        if (!N.llIIlIIIllll(Inventory.getCount((String[])stringArray16), lllIlIllI[1])) break block269;
                                                        String[] stringArray17 = new String[lllIlIllI[1]];
                                                        stringArray17[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[94]];
                                                        if (!N.llIIlIIIllII(Inventory.getCount((String[])stringArray17), lllIlIllI[1])) break block268;
                                                    }
                                                    String[] stringArray = new String[lllIlIllI[1]];
                                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[95]];
                                                    if (N.llIIlIIlIIIl(Inventory.getCount((String[])stringArray))) {
                                                        String[] stringArray18 = new String[lllIlIllI[1]];
                                                        stringArray18[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[96]];
                                                        if (N.llIIlIIlIIIl(Inventory.getCount((String[])stringArray18))) {
                                                            if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iR), lllIlIllI[6])) {
                                                                Movement.walkTo((WorldPoint)iR);

                                                            }
                                                            if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iR), lllIlIllI[6])) {
                                                                if (N.llIIlIIIllIl(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderGWD.c = lllIIlIII[lllIlIllI[97]];
                                                                    a.a();
                                                                }
                                                                if (N.llIIlIIIlIll(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderGWD.c = lllIIlIII[lllIlIllI[98]];
                                                                    String[] stringArray19 = new String[lllIlIllI[1]];
                                                                    stringArray19[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[99]];
                                                                    Bank.depositAll((String[])stringArray19);
                                                                    if (N.llIIlIIIlllI(Inventory.getAll().size(), lllIlIllI[34])) {
                                                                        Bank.deposit((String)lllIIlIII[lllIlIllI[100]], (int)lllIlIllI[7]);
                                                                    }
                                                                    String[] stringArray20 = new String[lllIlIllI[1]];
                                                                    stringArray20[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[101]];
                                                                    if (N.llIIlIIIllIl(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                                                                        a.a(lllIlIllI[15], lllIlIllI[11]);
                                                                    }
                                                                    String[] stringArray21 = new String[lllIlIllI[1]];
                                                                    stringArray21[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[102]];
                                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                                                                        String[] stringArray22 = new String[lllIlIllI[1]];
                                                                        stringArray22[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[103]];
                                                                        if (N.llIIlIIIllII(Inventory.getFirst((String[])stringArray22).getQuantity(), lllIlIllI[11])) {
                                                                            String[] stringArray23 = new String[lllIlIllI[1]];
                                                                            stringArray23[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[105]];
                                                                            Bank.withdraw((String)lllIIlIII[lllIlIllI[104]], (int)(lllIlIllI[11] - Inventory.getFirst((String[])stringArray23).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lllIlIllI[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray24 = new String[lllIlIllI[1]];
                                                                    stringArray24[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[106]];
                                                                    if (N.llIIlIIIllIl(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                                                        a.a(lllIlIllI[16], lllIlIllI[11]);
                                                                    }
                                                                    String[] stringArray25 = new String[lllIlIllI[1]];
                                                                    stringArray25[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[107]];
                                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                                                        String[] stringArray26 = new String[lllIlIllI[1]];
                                                                        stringArray26[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[108]];
                                                                        if (N.llIIlIIIllII(Inventory.getFirst((String[])stringArray26).getQuantity(), lllIlIllI[11])) {
                                                                            String[] stringArray27 = new String[lllIlIllI[1]];
                                                                            stringArray27[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[110]];
                                                                            Bank.withdraw((String)lllIIlIII[lllIlIllI[109]], (int)(lllIlIllI[11] - Inventory.getFirst((String[])stringArray27).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lllIlIllI[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray28 = new String[lllIlIllI[1]];
                                                                    stringArray28[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[111]];
                                                                    if (N.llIIlIIIllIl(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                                                        a.a(lllIlIllI[14], lllIlIllI[11]);
                                                                    }
                                                                    String[] stringArray29 = new String[lllIlIllI[1]];
                                                                    stringArray29[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[112]];
                                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                                                                        String[] stringArray30 = new String[lllIlIllI[1]];
                                                                        stringArray30[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[113]];
                                                                        if (N.llIIlIIIllII(Inventory.getFirst((String[])stringArray30).getQuantity(), lllIlIllI[11])) {
                                                                            String[] stringArray31 = new String[lllIlIllI[1]];
                                                                            stringArray31[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[115]];
                                                                            Bank.withdraw((String)lllIIlIII[lllIlIllI[114]], (int)(lllIlIllI[11] - Inventory.getFirst((String[])stringArray31).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lllIlIllI[9]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray = new int[lllIlIllI[1]];
                                                nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                                if (N.llIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lllIlIllI[1]];
                                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[116]];
                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray32 = new String[lllIlIllI[1]];
                                                        stringArray32[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[117]];
                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray32).getQuantity(), lllIlIllI[11])) {
                                                            String[] stringArray33 = new String[lllIlIllI[1]];
                                                            stringArray33[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[118]];
                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray33) ? 1 : 0)) {
                                                                String[] stringArray34 = new String[lllIlIllI[1]];
                                                                stringArray34[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[119]];
                                                                if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray34).getQuantity(), lllIlIllI[11])) {
                                                                    String[] stringArray35 = new String[lllIlIllI[1]];
                                                                    stringArray35[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[120]];
                                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                                                        String[] stringArray36 = new String[lllIlIllI[1]];
                                                                        stringArray36[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[121]];
                                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray36).getQuantity(), lllIlIllI[11])) {
                                                                            String[] stringArray37 = new String[lllIlIllI[1]];
                                                                            stringArray37[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[122]];
                                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                                                                                String[] stringArray38 = new String[lllIlIllI[1]];
                                                                                stringArray38[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[123]];
                                                                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray38) ? 1 : 0) && N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iW), lllIlIllI[1])) {
                                                                                    if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iL), lllIlIllI[6]) && N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iK), lllIlIllI[6])) {
                                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[124]];
                                                                                        if (N.llIIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                                                                            Dialog.close();
                                                                                        }
                                                                                        Movement.walkTo((WorldPoint)iW);

                                                                                    }
                                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iL), lllIlIllI[7]) && N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iK), lllIlIllI[6])) {
                                                                                        String[] stringArray39 = new String[lllIlIllI[1]];
                                                                                        stringArray39[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[125]];
                                                                                        llIllIIIIllll = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[lllIlIllI[1]];
                                                                                        stringArray40[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[126]];
                                                                                        llIllIIIIlllI = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[127]];
                                                                                        if (N.llIIlIIlIIII(llIllIIIIllll) && N.llIIlIIlIIII(llIllIIIIlllI)) {
                                                                                            llIllIIIIllll.useOn((TileObject)llIllIIIIlllI);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iK), lllIlIllI[6])) {
                                                                                                    bl = lllIlIllI[1];

                                                                                                    if (((0x3C ^ 0x6C) & ~(0x1C ^ 0x4C)) != 0) {
                                                                                                        return false;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = lllIlIllI[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lllIlIllI[128]);

                                                                                        }
                                                                                    }
                                                                                    if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iK), lllIlIllI[6])) {
                                                                                        String[] stringArray41 = new String[lllIlIllI[1]];
                                                                                        stringArray41[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[129]];
                                                                                        llIllIIIIllll = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[lllIlIllI[1]];
                                                                                        nArray31[N.lllIlIllI[0]] = lllIlIllI[130];
                                                                                        llIllIIIIlllI = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[131]];
                                                                                        if (N.llIIlIIlIIII(llIllIIIIllll) && N.llIIlIIlIIII(llIllIIIIlllI)) {
                                                                                            llIllIIIIllll.useOn((TileObject)llIllIIIIlllI);
                                                                                            Time.sleepTicks((int)lllIlIllI[7]);

                                                                                        }
                                                                                    }
                                                                                    if (N.llIIlIIIlIll(Players.getLocal().getWorldLocation().equals((Object)iV) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[lllIlIllI[1]];
                                                                                        stringArray42[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[132]];
                                                                                        llIllIIIIllll = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[133]];
                                                                                        if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                                            llIllIIIIllll.interact(lllIIlIII[lllIlIllI[134]]);
                                                                                            Time.sleepTicks((int)lllIlIllI[3]);

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
                                                }
                                            }
                                            if (N.llIIlIIlIIll(e.j(lllIlIllI[10]), lllIlIllI[7])) {
                                                int[] nArray = new int[lllIlIllI[1]];
                                                nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                                if (N.llIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lllIlIllI[1]];
                                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[135]];
                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray43 = new String[lllIlIllI[1]];
                                                        stringArray43[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[136]];
                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray43).getQuantity(), lllIlIllI[11])) {
                                                            String[] stringArray44 = new String[lllIlIllI[1]];
                                                            stringArray44[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[137]];
                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                                                                String[] stringArray45 = new String[lllIlIllI[1]];
                                                                stringArray45[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[138]];
                                                                if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray45).getQuantity(), lllIlIllI[11])) {
                                                                    String[] stringArray46 = new String[lllIlIllI[1]];
                                                                    stringArray46[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[139]];
                                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray46) ? 1 : 0)) {
                                                                        String[] stringArray47 = new String[lllIlIllI[1]];
                                                                        stringArray47[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[140]];
                                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray47).getQuantity(), lllIlIllI[11])) {
                                                                            String[] stringArray48 = new String[lllIlIllI[1]];
                                                                            stringArray48[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[141]];
                                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray48) ? 1 : 0)) {
                                                                                String[] stringArray49 = new String[lllIlIllI[1]];
                                                                                stringArray49[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[142]];
                                                                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray49) ? 1 : 0)) {
                                                                                    int[] nArray32 = new int[lllIlIllI[1]];
                                                                                    nArray32[N.lllIlIllI[0]] = lllIlIllI[143];
                                                                                    if (N.llIIlIIIllII(Inventory.getCount((int[])nArray32), lllIlIllI[1]) && N.llIIlIIIllIl(Players.getLocal().getWorldLocation().equals((Object)iV) ? 1 : 0)) {
                                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[144]];
                                                                                        if (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iW), lllIlIllI[3])) {
                                                                                            Movement.walkTo((WorldPoint)iW);

                                                                                        }
                                                                                        if (N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iW), lllIlIllI[3])) {
                                                                                            int[] nArray33 = new int[lllIlIllI[1]];
                                                                                            nArray33[N.lllIlIllI[0]] = lllIlIllI[145];
                                                                                            llIllIIIIllll = TileObjects.getNearest((int[])nArray33);
                                                                                            if (N.llIIlIIlIIII(llIllIIIIllll)) {
                                                                                                llIllIIIIllll.interact(lllIIlIII[lllIlIllI[146]]);
                                                                                                Time.sleepTicks((int)lllIlIllI[3]);

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
                                                    }
                                                }
                                                int[] nArray34 = new int[lllIlIllI[1]];
                                                nArray34[N.lllIlIllI[0]] = lllIlIllI[41];
                                                if (N.llIIlIIIlIll(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                                                    String[] stringArray = new String[lllIlIllI[1]];
                                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[147]];
                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray50 = new String[lllIlIllI[1]];
                                                        stringArray50[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[148]];
                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray50).getQuantity(), lllIlIllI[11])) {
                                                            String[] stringArray51 = new String[lllIlIllI[1]];
                                                            stringArray51[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[149]];
                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                                                                String[] stringArray52 = new String[lllIlIllI[1]];
                                                                stringArray52[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[150]];
                                                                if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray52).getQuantity(), lllIlIllI[11])) {
                                                                    String[] stringArray53 = new String[lllIlIllI[1]];
                                                                    stringArray53[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[151]];
                                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray53) ? 1 : 0)) {
                                                                        String[] stringArray54 = new String[lllIlIllI[1]];
                                                                        stringArray54[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[152]];
                                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray54).getQuantity(), lllIlIllI[11])) {
                                                                            String[] stringArray55 = new String[lllIlIllI[1]];
                                                                            stringArray55[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[153]];
                                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray55) ? 1 : 0)) {
                                                                                String[] stringArray56 = new String[lllIlIllI[1]];
                                                                                stringArray56[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[154]];
                                                                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray56) ? 1 : 0)) {
                                                                                    int[] nArray35 = new int[lllIlIllI[1]];
                                                                                    nArray35[N.lllIlIllI[0]] = lllIlIllI[143];
                                                                                    if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray35)) && N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iX), lllIlIllI[3]) && N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iY), lllIlIllI[5])) {
                                                                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[155]];
                                                                                        Movement.walkTo((WorldPoint)iX);

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
                                                int[] nArray36 = new int[lllIlIllI[1]];
                                                nArray36[N.lllIlIllI[0]] = lllIlIllI[41];
                                                if (N.llIIlIIIlIll(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                                                    String[] stringArray = new String[lllIlIllI[1]];
                                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[156]];
                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray57 = new String[lllIlIllI[1]];
                                                        stringArray57[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[157]];
                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray57).getQuantity(), lllIlIllI[11])) {
                                                            String[] stringArray58 = new String[lllIlIllI[1]];
                                                            stringArray58[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[158]];
                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray58) ? 1 : 0)) {
                                                                String[] stringArray59 = new String[lllIlIllI[1]];
                                                                stringArray59[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[159]];
                                                                if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray59).getQuantity(), lllIlIllI[11])) {
                                                                    String[] stringArray60 = new String[lllIlIllI[1]];
                                                                    stringArray60[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[160]];
                                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray60) ? 1 : 0)) {
                                                                        String[] stringArray61 = new String[lllIlIllI[1]];
                                                                        stringArray61[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[161]];
                                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray61).getQuantity(), lllIlIllI[11])) {
                                                                            String[] stringArray62 = new String[lllIlIllI[1]];
                                                                            stringArray62[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[162]];
                                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray62) ? 1 : 0)) {
                                                                                String[] stringArray63 = new String[lllIlIllI[1]];
                                                                                stringArray63[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[163]];
                                                                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray63) ? 1 : 0)) {
                                                                                    int[] nArray37 = new int[lllIlIllI[1]];
                                                                                    nArray37[N.lllIlIllI[0]] = lllIlIllI[143];
                                                                                    if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray37)) && N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iX), lllIlIllI[5])) {
                                                                                        int[] nArray38 = new int[lllIlIllI[1]];
                                                                                        nArray38[N.lllIlIllI[0]] = lllIlIllI[143];
                                                                                        llIllIIIIllll = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[lllIlIllI[1]];
                                                                                        stringArray64[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[164]];
                                                                                        llIllIIIIlllI = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (N.llIIlIIlIIII(llIllIIIIllll) && N.llIIlIIlIIII(llIllIIIIlllI)) {
                                                                                            llIllIIIIllll.useOn((TileObject)llIllIIIIlllI);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)iV), (int)lllIlIllI[165]);

                                                                                        }
                                                                                        while (N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(iY), lllIlIllI[3])) {
                                                                                            Movement.walkTo((WorldPoint)iY);

                                                                                            Time.sleepTicks((int)lllIlIllI[1]);

                                                                                            if (1 >= 0) continue;
                                                                                            return;
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
                                                }
                                                int[] nArray39 = new int[lllIlIllI[1]];
                                                nArray39[N.lllIlIllI[0]] = lllIlIllI[41];
                                                if (N.llIIlIIIlIll(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                                                    String[] stringArray = new String[lllIlIllI[1]];
                                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[166]];
                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray65 = new String[lllIlIllI[1]];
                                                        stringArray65[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[167]];
                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray65).getQuantity(), lllIlIllI[11])) {
                                                            String[] stringArray66 = new String[lllIlIllI[1]];
                                                            stringArray66[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[168]];
                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray66) ? 1 : 0)) {
                                                                String[] stringArray67 = new String[lllIlIllI[1]];
                                                                stringArray67[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[169]];
                                                                if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray67).getQuantity(), lllIlIllI[11])) {
                                                                    String[] stringArray68 = new String[lllIlIllI[1]];
                                                                    stringArray68[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[170]];
                                                                    if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray68) ? 1 : 0)) {
                                                                        String[] stringArray69 = new String[lllIlIllI[1]];
                                                                        stringArray69[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[171]];
                                                                        if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray69).getQuantity(), lllIlIllI[11])) {
                                                                            String[] stringArray70 = new String[lllIlIllI[1]];
                                                                            stringArray70[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[172]];
                                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray70) ? 1 : 0)) {
                                                                                String[] stringArray71 = new String[lllIlIllI[1]];
                                                                                stringArray71[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[173]];
                                                                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                                                                    int[] nArray40 = new int[lllIlIllI[1]];
                                                                                    nArray40[N.lllIlIllI[0]] = lllIlIllI[143];
                                                                                    if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray40)) && N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iY), lllIlIllI[5])) {
                                                                                        int[] nArray41 = new int[lllIlIllI[1]];
                                                                                        nArray41[N.lllIlIllI[0]] = lllIlIllI[143];
                                                                                        llIllIIIIllll = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[lllIlIllI[1]];
                                                                                        stringArray72[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[174]];
                                                                                        llIllIIIIlllI = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (N.llIIlIIlIIII(llIllIIIIllll) && N.llIIlIIlIIII(llIllIIIIlllI)) {
                                                                                            llIllIIIIlllI.interact(lllIIlIII[lllIlIllI[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)iV), (int)lllIlIllI[165]);

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
                                                }
                                            }
                                            if (!N.llIIlIIlIIll(e.j(lllIlIllI[10]), lllIlIllI[11])) break block270;
                                            int[] nArray = new int[lllIlIllI[1]];
                                            nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                            if (N.llIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                String[] stringArray = new String[lllIlIllI[1]];
                                                stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[176]];
                                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                    String[] stringArray73 = new String[lllIlIllI[1]];
                                                    stringArray73[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[177]];
                                                    if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray73).getQuantity(), lllIlIllI[11])) {
                                                        String[] stringArray74 = new String[lllIlIllI[1]];
                                                        stringArray74[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[178]];
                                                        if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                                                            String[] stringArray75 = new String[lllIlIllI[1]];
                                                            stringArray75[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[179]];
                                                            if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray75).getQuantity(), lllIlIllI[11])) {
                                                                String[] stringArray76 = new String[lllIlIllI[1]];
                                                                stringArray76[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[180]];
                                                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray76) ? 1 : 0)) {
                                                                    String[] stringArray77 = new String[lllIlIllI[1]];
                                                                    stringArray77[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[181]];
                                                                    if (N.llIIlIIIllll(Inventory.getFirst((String[])stringArray77).getQuantity(), lllIlIllI[11])) {
                                                                        String[] stringArray78 = new String[lllIlIllI[1]];
                                                                        stringArray78[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[182]];
                                                                        if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray78) ? 1 : 0)) {
                                                                            String[] stringArray79 = new String[lllIlIllI[1]];
                                                                            stringArray79[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[183]];
                                                                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray79) ? 1 : 0)) {
                                                                                int[] nArray42 = new int[lllIlIllI[1]];
                                                                                nArray42[N.lllIlIllI[0]] = lllIlIllI[143];
                                                                                if (N.llIIlIIlIIIl(Inventory.getCount((int[])nArray42)) && N.llIIlIIIlIll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(je), lllIlIllI[1])) {
                                                                                    AccBuilderGWD.c = lllIIlIII[lllIlIllI[184]];
                                                                                    Movement.walkTo((WorldPoint)je);

                                                                                    Time.sleepTicks((int)lllIlIllI[6]);

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
                                            int[] nArray43 = new int[lllIlIllI[1]];
                                            nArray43[N.lllIlIllI[0]] = lllIlIllI[41];
                                            if (!N.llIIlIIIlIll(Inventory.contains((int[])nArray43) ? 1 : 0)) break block248;
                                            String[] stringArray = new String[lllIlIllI[1]];
                                            stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[185]];
                                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block248;
                                            String[] stringArray80 = new String[lllIlIllI[1]];
                                            stringArray80[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[186]];
                                            if (!N.llIIlIIIllll(Inventory.getFirst((String[])stringArray80).getQuantity(), lllIlIllI[11])) break block248;
                                            String[] stringArray81 = new String[lllIlIllI[1]];
                                            stringArray81[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[187]];
                                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray81) ? 1 : 0)) break block248;
                                            String[] stringArray82 = new String[lllIlIllI[1]];
                                            stringArray82[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[188]];
                                            if (!N.llIIlIIIllll(Inventory.getFirst((String[])stringArray82).getQuantity(), lllIlIllI[11])) break block248;
                                            String[] stringArray83 = new String[lllIlIllI[1]];
                                            stringArray83[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[189]];
                                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray83) ? 1 : 0)) break block248;
                                            String[] stringArray84 = new String[lllIlIllI[1]];
                                            stringArray84[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[190]];
                                            if (!N.llIIlIIIllll(Inventory.getFirst((String[])stringArray84).getQuantity(), lllIlIllI[11])) break block248;
                                            String[] stringArray85 = new String[lllIlIllI[1]];
                                            stringArray85[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[191]];
                                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray85) ? 1 : 0)) break block248;
                                            String[] stringArray86 = new String[lllIlIllI[1]];
                                            stringArray86[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[192]];
                                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray86) ? 1 : 0)) break block248;
                                            int[] nArray44 = new int[lllIlIllI[1]];
                                            nArray44[N.lllIlIllI[0]] = lllIlIllI[143];
                                            if (!N.llIIlIIlIIIl(Inventory.getCount((int[])nArray44)) || !N.llIIlIIIlIll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !N.llIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(je), lllIlIllI[3])) break block248;
                                            AccBuilderGWD.c = lllIIlIII[lllIlIllI[193]];
                                            do {
                                                block272: {
                                                    block273: {
                                                        block271: {
                                                            String[] stringArray87 = new String[lllIlIllI[1]];
                                                            stringArray87[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[194]];
                                                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray87) ? 1 : 0)) break block271;
                                                            String[] stringArray88 = new String[lllIlIllI[1]];
                                                            stringArray88[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[195]];
                                                            if (!N.llIIlIIIllII(Inventory.getFirst((String[])stringArray88).getQuantity(), lllIlIllI[11])) break block272;
                                                        }
                                                        String[] stringArray89 = new String[lllIlIllI[1]];
                                                        stringArray89[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[196]];
                                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray89) ? 1 : 0)) break block273;
                                                        String[] stringArray90 = new String[lllIlIllI[1]];
                                                        stringArray90[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[197]];
                                                        if (!N.llIIlIIIllII(Inventory.getFirst((String[])stringArray90).getQuantity(), lllIlIllI[11])) break block272;
                                                    }
                                                    String[] stringArray91 = new String[lllIlIllI[1]];
                                                    stringArray91[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[198]];
                                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray91) ? 1 : 0)) break block248;
                                                    String[] stringArray92 = new String[lllIlIllI[1]];
                                                    stringArray92[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[199]];
                                                    if (!N.llIIlIIIllll(Inventory.getFirst((String[])stringArray92).getQuantity(), lllIlIllI[11])) break block248;
                                                }
                                                if (!N.llIIlIIIllIl(AccBuilderGWD.d ? 1 : 0)) break block248;
                                                int[] nArray45 = new int[lllIlIllI[1]];
                                                nArray45[N.lllIlIllI[0]] = lllIlIllI[200];
                                                llIllIIIIllll = TileObjects.getFirstAt((WorldPoint)io, (int[])nArray45);
                                                String[] stringArray93 = new String[lllIlIllI[1]];
                                                stringArray93[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)llIllIIIIllll);
                                                Time.sleepTicks((int)lllIlIllI[1]);

                                                String[] stringArray94 = new String[lllIlIllI[1]];
                                                stringArray94[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)llIllIIIIllll);
                                                Time.sleepTicks((int)lllIlIllI[1]);

                                                String[] stringArray95 = new String[lllIlIllI[1]];
                                                stringArray95[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)llIllIIIIllll);
                                                Time.sleepTicks((int)lllIlIllI[1]);

                                            } while (null == null);
                                            return;
                                        }
                                        int[] nArray = new int[lllIlIllI[1]];
                                        nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                        if (!N.llIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block249;
                                        String[] stringArray = new String[lllIlIllI[1]];
                                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[204]];
                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block249;
                                        String[] stringArray96 = new String[lllIlIllI[1]];
                                        stringArray96[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[205]];
                                        if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray96).getQuantity(), lllIlIllI[7])) break block249;
                                        String[] stringArray97 = new String[lllIlIllI[1]];
                                        stringArray97[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[206]];
                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray97) ? 1 : 0)) break block249;
                                        String[] stringArray98 = new String[lllIlIllI[1]];
                                        stringArray98[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[207]];
                                        if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray98).getQuantity(), lllIlIllI[7])) break block249;
                                        String[] stringArray99 = new String[lllIlIllI[1]];
                                        stringArray99[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[208]];
                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray99) ? 1 : 0)) break block249;
                                        String[] stringArray100 = new String[lllIlIllI[1]];
                                        stringArray100[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[209]];
                                        if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray100).getQuantity(), lllIlIllI[7])) break block249;
                                        String[] stringArray101 = new String[lllIlIllI[1]];
                                        stringArray101[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[210]];
                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray101) ? 1 : 0)) break block249;
                                        String[] stringArray102 = new String[lllIlIllI[1]];
                                        stringArray102[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[211]];
                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray102) ? 1 : 0)) break block249;
                                        int[] nArray46 = new int[lllIlIllI[1]];
                                        nArray46[N.lllIlIllI[0]] = lllIlIllI[143];
                                        if (!N.llIIlIIlIIIl(Inventory.getCount((int[])nArray46)) || !N.llIIlIIIlIll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !N.llIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(jd), lllIlIllI[1])) break block249;
                                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[212]];
                                        while (true) {
                                            block275: {
                                                block276: {
                                                    block274: {
                                                        String[] stringArray103 = new String[lllIlIllI[1]];
                                                        stringArray103[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[213]];
                                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray103) ? 1 : 0)) break block274;
                                                        String[] stringArray104 = new String[lllIlIllI[1]];
                                                        stringArray104[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[214]];
                                                        if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray104).getQuantity(), lllIlIllI[7])) break block275;
                                                    }
                                                    String[] stringArray105 = new String[lllIlIllI[1]];
                                                    stringArray105[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[215]];
                                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray105) ? 1 : 0)) break block276;
                                                    String[] stringArray106 = new String[lllIlIllI[1]];
                                                    stringArray106[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[216]];
                                                    if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray106).getQuantity(), lllIlIllI[7])) break block275;
                                                }
                                                String[] stringArray107 = new String[lllIlIllI[1]];
                                                stringArray107[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[217]];
                                                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray107) ? 1 : 0)) break block249;
                                                String[] stringArray108 = new String[lllIlIllI[1]];
                                                stringArray108[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[218]];
                                                if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray108).getQuantity(), lllIlIllI[7])) break block249;
                                            }
                                            if (!N.llIIlIIIllIl(AccBuilderGWD.d ? 1 : 0)) break block249;
                                            if (N.llIIlIIIllIl(Players.getLocal().getWorldLocation().equals((Object)jd) ? 1 : 0)) {
                                                Movement.walkTo((WorldPoint)jd);

                                                Time.sleepTicks((int)lllIlIllI[5]);

                                            }
                                            if (!N.llIIlIIIlIll(Players.getLocal().getWorldLocation().equals((Object)jd) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lllIlIllI[1]];
                                            nArray47[N.lllIlIllI[0]] = lllIlIllI[200];
                                            llIllIIIIllll = TileObjects.getFirstAt((WorldPoint)ip, (int[])nArray47);
                                            String[] stringArray109 = new String[lllIlIllI[1]];
                                            stringArray109[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)llIllIIIIllll);
                                            Time.sleepTicks((int)lllIlIllI[1]);

                                            String[] stringArray110 = new String[lllIlIllI[1]];
                                            stringArray110[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)llIllIIIIllll);
                                            Time.sleepTicks((int)lllIlIllI[1]);

                                            String[] stringArray111 = new String[lllIlIllI[1]];
                                            stringArray111[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)llIllIIIIllll);
                                            Time.sleepTicks((int)lllIlIllI[1]);

                                            if ((64 + 125 - 61 + 2 ^ 116 + 116 - 193 + 95) <= 0) break;
                                        }
                                        return;
                                    }
                                    int[] nArray = new int[lllIlIllI[1]];
                                    nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                    if (!N.llIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block250;
                                    String[] stringArray = new String[lllIlIllI[1]];
                                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[222]];
                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block250;
                                    String[] stringArray112 = new String[lllIlIllI[1]];
                                    stringArray112[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[223]];
                                    if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray112).getQuantity(), lllIlIllI[6])) break block250;
                                    String[] stringArray113 = new String[lllIlIllI[1]];
                                    stringArray113[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[224]];
                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray113) ? 1 : 0)) break block250;
                                    String[] stringArray114 = new String[lllIlIllI[1]];
                                    stringArray114[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[225]];
                                    if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray114).getQuantity(), lllIlIllI[6])) break block250;
                                    String[] stringArray115 = new String[lllIlIllI[1]];
                                    stringArray115[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[226]];
                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray115) ? 1 : 0)) break block250;
                                    String[] stringArray116 = new String[lllIlIllI[1]];
                                    stringArray116[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[227]];
                                    if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray116).getQuantity(), lllIlIllI[6])) break block250;
                                    String[] stringArray117 = new String[lllIlIllI[1]];
                                    stringArray117[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[228]];
                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray117) ? 1 : 0)) break block250;
                                    String[] stringArray118 = new String[lllIlIllI[1]];
                                    stringArray118[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[229]];
                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray118) ? 1 : 0)) break block250;
                                    int[] nArray48 = new int[lllIlIllI[1]];
                                    nArray48[N.lllIlIllI[0]] = lllIlIllI[143];
                                    if (!N.llIIlIIlIIIl(Inventory.getCount((int[])nArray48)) || !N.llIIlIIIlIll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block250;
                                    AccBuilderGWD.c = lllIIlIII[lllIlIllI[230]];
                                    while (true) {
                                        block278: {
                                            block279: {
                                                block277: {
                                                    String[] stringArray119 = new String[lllIlIllI[1]];
                                                    stringArray119[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[231]];
                                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray119) ? 1 : 0)) break block277;
                                                    String[] stringArray120 = new String[lllIlIllI[1]];
                                                    stringArray120[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[232]];
                                                    if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray120).getQuantity(), lllIlIllI[6])) break block278;
                                                }
                                                String[] stringArray121 = new String[lllIlIllI[1]];
                                                stringArray121[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[233]];
                                                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray121) ? 1 : 0)) break block279;
                                                String[] stringArray122 = new String[lllIlIllI[1]];
                                                stringArray122[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[234]];
                                                if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray122).getQuantity(), lllIlIllI[6])) break block278;
                                            }
                                            String[] stringArray123 = new String[lllIlIllI[1]];
                                            stringArray123[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[235]];
                                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray123) ? 1 : 0)) break block250;
                                            String[] stringArray124 = new String[lllIlIllI[1]];
                                            stringArray124[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[236]];
                                            if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray124).getQuantity(), lllIlIllI[6])) break block250;
                                        }
                                        if (!N.llIIlIIIllIl(AccBuilderGWD.d ? 1 : 0)) break block250;
                                        if (N.llIIlIIIllIl(Players.getLocal().getWorldLocation().equals((Object)jc) ? 1 : 0)) {
                                            Movement.walkTo((WorldPoint)jc);

                                            Time.sleepTicks((int)lllIlIllI[5]);

                                        }
                                        if (!N.llIIlIIIlIll(Players.getLocal().getWorldLocation().equals((Object)jc) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lllIlIllI[1]];
                                        nArray49[N.lllIlIllI[0]] = lllIlIllI[200];
                                        llIllIIIIllll = TileObjects.getFirstAt((WorldPoint)iq, (int[])nArray49);
                                        String[] stringArray125 = new String[lllIlIllI[1]];
                                        stringArray125[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)llIllIIIIllll);
                                        Time.sleepTicks((int)lllIlIllI[1]);

                                        String[] stringArray126 = new String[lllIlIllI[1]];
                                        stringArray126[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)llIllIIIIllll);
                                        Time.sleepTicks((int)lllIlIllI[1]);

                                        String[] stringArray127 = new String[lllIlIllI[1]];
                                        stringArray127[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)llIllIIIIllll);
                                        Time.sleepTicks((int)lllIlIllI[1]);

                                        if (-1 >= 1) break;
                                    }
                                    return;
                                }
                                int[] nArray = new int[lllIlIllI[1]];
                                nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                                if (!N.llIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block251;
                                String[] stringArray = new String[lllIlIllI[1]];
                                stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[240]];
                                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block251;
                                String[] stringArray128 = new String[lllIlIllI[1]];
                                stringArray128[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[241]];
                                if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray128).getQuantity(), lllIlIllI[5])) break block251;
                                String[] stringArray129 = new String[lllIlIllI[1]];
                                stringArray129[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[242]];
                                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray129) ? 1 : 0)) break block251;
                                String[] stringArray130 = new String[lllIlIllI[1]];
                                stringArray130[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[243]];
                                if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray130).getQuantity(), lllIlIllI[5])) break block251;
                                String[] stringArray131 = new String[lllIlIllI[1]];
                                stringArray131[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[244]];
                                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray131) ? 1 : 0)) break block251;
                                String[] stringArray132 = new String[lllIlIllI[1]];
                                stringArray132[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[245]];
                                if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray132).getQuantity(), lllIlIllI[5])) break block251;
                                String[] stringArray133 = new String[lllIlIllI[1]];
                                stringArray133[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[246]];
                                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray133) ? 1 : 0)) break block251;
                                String[] stringArray134 = new String[lllIlIllI[1]];
                                stringArray134[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[247]];
                                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray134) ? 1 : 0)) break block251;
                                int[] nArray50 = new int[lllIlIllI[1]];
                                nArray50[N.lllIlIllI[0]] = lllIlIllI[143];
                                if (!N.llIIlIIlIIIl(Inventory.getCount((int[])nArray50)) || !N.llIIlIIIlIll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block251;
                                AccBuilderGWD.c = lllIIlIII[lllIlIllI[248]];
                                while (true) {
                                    block281: {
                                        block282: {
                                            block280: {
                                                String[] stringArray135 = new String[lllIlIllI[1]];
                                                stringArray135[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[249]];
                                                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray135) ? 1 : 0)) break block280;
                                                String[] stringArray136 = new String[lllIlIllI[1]];
                                                stringArray136[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[250]];
                                                if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray136).getQuantity(), lllIlIllI[5])) break block281;
                                            }
                                            String[] stringArray137 = new String[lllIlIllI[1]];
                                            stringArray137[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[251]];
                                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray137) ? 1 : 0)) break block282;
                                            String[] stringArray138 = new String[lllIlIllI[1]];
                                            stringArray138[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[252]];
                                            if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray138).getQuantity(), lllIlIllI[5])) break block281;
                                        }
                                        String[] stringArray139 = new String[lllIlIllI[1]];
                                        stringArray139[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[8]];
                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray139) ? 1 : 0)) break block251;
                                        String[] stringArray140 = new String[lllIlIllI[1]];
                                        stringArray140[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[253]];
                                        if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray140).getQuantity(), lllIlIllI[5])) break block251;
                                    }
                                    if (!N.llIIlIIIllIl(AccBuilderGWD.d ? 1 : 0)) break block251;
                                    if (N.llIIlIIIllIl(Players.getLocal().getWorldLocation().equals((Object)jb) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)jb);

                                        Time.sleepTicks((int)lllIlIllI[5]);

                                    }
                                    if (!N.llIIlIIIlIll(Players.getLocal().getWorldLocation().equals((Object)jb) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lllIlIllI[1]];
                                    nArray51[N.lllIlIllI[0]] = lllIlIllI[200];
                                    llIllIIIIllll = TileObjects.getFirstAt((WorldPoint)ir, (int[])nArray51);
                                    String[] stringArray141 = new String[lllIlIllI[1]];
                                    stringArray141[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)llIllIIIIllll);
                                    Time.sleepTicks((int)lllIlIllI[1]);

                                    String[] stringArray142 = new String[lllIlIllI[1]];
                                    stringArray142[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)llIllIIIIllll);
                                    Time.sleepTicks((int)lllIlIllI[1]);

                                    String[] stringArray143 = new String[lllIlIllI[1]];
                                    stringArray143[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)llIllIIIIllll);
                                    Time.sleepTicks((int)lllIlIllI[1]);

                                    if ((0x77 ^ 0x10 ^ (0x75 ^ 0x16)) < 0) break;
                                }
                                return;
                            }
                            int[] nArray = new int[lllIlIllI[1]];
                            nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                            if (!N.llIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block252;
                            String[] stringArray = new String[lllIlIllI[1]];
                            stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[257]];
                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block252;
                            String[] stringArray144 = new String[lllIlIllI[1]];
                            stringArray144[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[258]];
                            if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray144).getQuantity(), lllIlIllI[3])) break block252;
                            String[] stringArray145 = new String[lllIlIllI[1]];
                            stringArray145[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[259]];
                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray145) ? 1 : 0)) break block252;
                            String[] stringArray146 = new String[lllIlIllI[1]];
                            stringArray146[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[260]];
                            if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray146).getQuantity(), lllIlIllI[3])) break block252;
                            String[] stringArray147 = new String[lllIlIllI[1]];
                            stringArray147[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[261]];
                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray147) ? 1 : 0)) break block252;
                            String[] stringArray148 = new String[lllIlIllI[1]];
                            stringArray148[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[262]];
                            if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray148).getQuantity(), lllIlIllI[3])) break block252;
                            String[] stringArray149 = new String[lllIlIllI[1]];
                            stringArray149[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[263]];
                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray149) ? 1 : 0)) break block252;
                            String[] stringArray150 = new String[lllIlIllI[1]];
                            stringArray150[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[264]];
                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray150) ? 1 : 0)) break block252;
                            int[] nArray52 = new int[lllIlIllI[1]];
                            nArray52[N.lllIlIllI[0]] = lllIlIllI[143];
                            if (!N.llIIlIIlIIIl(Inventory.getCount((int[])nArray52)) || !N.llIIlIIIlIll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block252;
                            AccBuilderGWD.c = lllIIlIII[lllIlIllI[265]];
                            while (true) {
                                block284: {
                                    block285: {
                                        block283: {
                                            String[] stringArray151 = new String[lllIlIllI[1]];
                                            stringArray151[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[266]];
                                            if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray151) ? 1 : 0)) break block283;
                                            String[] stringArray152 = new String[lllIlIllI[1]];
                                            stringArray152[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[267]];
                                            if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray152).getQuantity(), lllIlIllI[3])) break block284;
                                        }
                                        String[] stringArray153 = new String[lllIlIllI[1]];
                                        stringArray153[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[268]];
                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray153) ? 1 : 0)) break block285;
                                        String[] stringArray154 = new String[lllIlIllI[1]];
                                        stringArray154[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[269]];
                                        if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray154).getQuantity(), lllIlIllI[3])) break block284;
                                    }
                                    String[] stringArray155 = new String[lllIlIllI[1]];
                                    stringArray155[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[270]];
                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray155) ? 1 : 0)) break block252;
                                    String[] stringArray156 = new String[lllIlIllI[1]];
                                    stringArray156[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[271]];
                                    if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray156).getQuantity(), lllIlIllI[3])) break block252;
                                }
                                if (!N.llIIlIIIllIl(AccBuilderGWD.d ? 1 : 0)) break block252;
                                if (N.llIIlIIIllIl(Players.getLocal().getWorldLocation().equals((Object)ja) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)ja);

                                    Time.sleepTicks((int)lllIlIllI[5]);

                                }
                                if (!N.llIIlIIIlIll(Players.getLocal().getWorldLocation().equals((Object)ja) ? 1 : 0)) continue;
                                int[] nArray53 = new int[lllIlIllI[1]];
                                nArray53[N.lllIlIllI[0]] = lllIlIllI[200];
                                llIllIIIIllll = TileObjects.getFirstAt((WorldPoint)is, (int[])nArray53);
                                String[] stringArray157 = new String[lllIlIllI[1]];
                                stringArray157[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[272]];
                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[lllIlIllI[1]];
                                    stringArray158[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)llIllIIIIllll);
                                    Time.sleepTicks((int)lllIlIllI[1]);

                                }
                                String[] stringArray159 = new String[lllIlIllI[1]];
                                stringArray159[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[274]];
                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lllIlIllI[1]];
                                    stringArray160[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)llIllIIIIllll);
                                    Time.sleepTicks((int)lllIlIllI[1]);

                                }
                                String[] stringArray161 = new String[lllIlIllI[1]];
                                stringArray161[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[276]];
                                if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lllIlIllI[1]];
                                    stringArray162[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)llIllIIIIllll);
                                    Time.sleepTicks((int)lllIlIllI[1]);

                                }

                                if (3 < 2) break;
                            }
                            return;
                        }
                        int[] nArray = new int[lllIlIllI[1]];
                        nArray[N.lllIlIllI[0]] = lllIlIllI[41];
                        if (!N.llIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block253;
                        String[] stringArray = new String[lllIlIllI[1]];
                        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[278]];
                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block253;
                        String[] stringArray163 = new String[lllIlIllI[1]];
                        stringArray163[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[279]];
                        if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray163).getQuantity(), lllIlIllI[1])) break block253;
                        String[] stringArray164 = new String[lllIlIllI[1]];
                        stringArray164[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[280]];
                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray164) ? 1 : 0)) break block253;
                        String[] stringArray165 = new String[lllIlIllI[1]];
                        stringArray165[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[281]];
                        if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray165).getQuantity(), lllIlIllI[1])) break block253;
                        String[] stringArray166 = new String[lllIlIllI[1]];
                        stringArray166[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[282]];
                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray166) ? 1 : 0)) break block253;
                        String[] stringArray167 = new String[lllIlIllI[1]];
                        stringArray167[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[283]];
                        if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray167).getQuantity(), lllIlIllI[1])) break block253;
                        String[] stringArray168 = new String[lllIlIllI[1]];
                        stringArray168[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[284]];
                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray168) ? 1 : 0)) break block253;
                        String[] stringArray169 = new String[lllIlIllI[1]];
                        stringArray169[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[285]];
                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray169) ? 1 : 0)) break block253;
                        int[] nArray54 = new int[lllIlIllI[1]];
                        nArray54[N.lllIlIllI[0]] = lllIlIllI[143];
                        if (!N.llIIlIIlIIIl(Inventory.getCount((int[])nArray54)) || !N.llIIlIIIlIll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block253;
                        AccBuilderGWD.c = lllIIlIII[lllIlIllI[286]];
                        while (true) {
                            block287: {
                                block288: {
                                    block286: {
                                        String[] stringArray170 = new String[lllIlIllI[1]];
                                        stringArray170[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[287]];
                                        if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray170) ? 1 : 0)) break block286;
                                        String[] stringArray171 = new String[lllIlIllI[1]];
                                        stringArray171[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[288]];
                                        if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray171).getQuantity(), lllIlIllI[1])) break block287;
                                    }
                                    String[] stringArray172 = new String[lllIlIllI[1]];
                                    stringArray172[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[289]];
                                    if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray172) ? 1 : 0)) break block288;
                                    String[] stringArray173 = new String[lllIlIllI[1]];
                                    stringArray173[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[290]];
                                    if (!N.llIIlIIlIlII(Inventory.getFirst((String[])stringArray173).getQuantity(), lllIlIllI[1])) break block287;
                                }
                                String[] stringArray174 = new String[lllIlIllI[1]];
                                stringArray174[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[291]];
                                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray174) ? 1 : 0)) break block253;
                                String[] stringArray175 = new String[lllIlIllI[1]];
                                stringArray175[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[292]];
                                if (!N.llIIlIIlIIll(Inventory.getFirst((String[])stringArray175).getQuantity(), lllIlIllI[1])) break block253;
                            }
                            if (!N.llIIlIIIllIl(AccBuilderGWD.d ? 1 : 0)) break block253;
                            if (N.llIIlIIIllIl(Players.getLocal().getWorldLocation().equals((Object)iZ) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)iZ);

                            }
                            if (!N.llIIlIIIlIll(Players.getLocal().getWorldLocation().equals((Object)iZ) ? 1 : 0)) continue;
                            int[] nArray55 = new int[lllIlIllI[1]];
                            nArray55[N.lllIlIllI[0]] = lllIlIllI[200];
                            llIllIIIIllll = TileObjects.getFirstAt((WorldPoint)it, (int[])nArray55);
                            String[] stringArray176 = new String[lllIlIllI[1]];
                            stringArray176[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[293]];
                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[lllIlIllI[1]];
                                stringArray177[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)llIllIIIIllll);
                                Time.sleepTicks((int)lllIlIllI[1]);

                            }
                            String[] stringArray178 = new String[lllIlIllI[1]];
                            stringArray178[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[295]];
                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lllIlIllI[1]];
                                stringArray179[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)llIllIIIIllll);
                                Time.sleepTicks((int)lllIlIllI[1]);

                            }
                            String[] stringArray180 = new String[lllIlIllI[1]];
                            stringArray180[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[297]];
                            if (N.llIIlIIIlIll(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lllIlIllI[1]];
                                stringArray181[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)llIllIIIIllll);
                                Time.sleepTicks((int)lllIlIllI[1]);

                            }

                            if (((0x37 ^ 3) & ~(0x88 ^ 0xBC)) < -1) break;
                        }
                        return;
                    }
                    String[] stringArray = new String[lllIlIllI[1]];
                    stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[299]];
                    if (N.llIIlIIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray182 = new String[lllIlIllI[1]];
                        stringArray182[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[300]];
                        if (N.llIIlIIIllIl(Inventory.contains((String[])stringArray182) ? 1 : 0)) {
                            String[] stringArray183 = new String[lllIlIllI[1]];
                            stringArray183[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[301]];
                            if (N.llIIlIIIllIl(Inventory.contains((String[])stringArray183) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIlIII[lllIlIllI[302]];
                                int[] nArray = new int[lllIlIllI[1]];
                                nArray[N.lllIlIllI[0]] = lllIlIllI[303];
                                llIllIIIIllll = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[lllIlIllI[1]];
                                nArray56[N.lllIlIllI[0]] = lllIlIllI[304];
                                llIllIIIIlllI = Inventory.getFirst((int[])nArray56);
                                if (N.llIIlIIlIIII(llIllIIIIllll) && N.llIIlIIlIIII(llIllIIIIlllI)) {
                                    llIllIIIIlllI.useOn((TileObject)llIllIIIIllll);
                                    Time.sleepTicks((int)lllIlIllI[5]);

                                }
                            }
                        }
                    }
                }
                if (N.llIIlIIlIIll(e.j(lllIlIllI[10]), lllIlIllI[13])) {
                    AccBuilderGWD.c = lllIIlIII[lllIlIllI[305]];
                    int[] nArray = new int[lllIlIllI[1]];
                    nArray[N.lllIlIllI[0]] = lllIlIllI[306];
                    llIllIIIIllll = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[lllIlIllI[1]];
                    nArray57[N.lllIlIllI[0]] = lllIlIllI[307];
                    llIllIIIIlllI = Inventory.getFirst((int[])nArray57);
                    if (N.llIIlIIIllII(dk, lllIlIllI[1])) {
                        as.nl += lllIlIllI[1];
                        as.u(AccBuilderGWD.m);
                        dk += lllIlIllI[1];
                        as.nl = lllIlIllI[0];
                        dl = lllIlIllI[0];
                    }
                    if (N.llIIlIIlIIII(llIllIIIIllll) && N.llIIlIIlIIII(llIllIIIIlllI)) {
                        llIllIIIIlllI.useOn((TileObject)llIllIIIIllll);
                        Time.sleepTicks((int)lllIlIllI[7]);

                        g.a(eY);
                    }
                }
                if (!N.llIIlIIlIIll(e.j(lllIlIllI[10]), lllIlIllI[19])) break block254;
                String[] stringArray = new String[lllIlIllI[1]];
                stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[308]];
                if (!N.llIIlIIlIlIl(TileObjects.getNearest((String[])stringArray))) break block289;
                String[] stringArray184 = new String[lllIlIllI[1]];
                stringArray184[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[309]];
                if (!N.llIIlIIlIIII(TileObjects.getNearest((String[])stringArray184))) break block254;
            }
            String[] stringArray = new String[lllIlIllI[1]];
            stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[310]];
            if (N.llIIlIIlIIII(TileObjects.getNearest((String[])stringArray))) {
                AccBuilderGWD.c = lllIIlIII[lllIlIllI[311]];
                if (N.llIIlIIIllIl(Equipment.contains((int[])f.aU) ? 1 : 0) && N.llIIlIIIlIll(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aU).interact(lllIIlIII[lllIlIllI[312]]);
                    Time.sleepTicks((int)lllIlIllI[6]);

                }
                if (N.llIIlIIIlIll(Equipment.contains((int[])f.aU) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aU).interact(lllIIlIII[lllIlIllI[313]]);
                    Time.sleepTicks((int)lllIlIllI[6]);

                }
            }
        }
    }

    private static void llIIIllIIIll() {
        lllIIlIII = new String[lllIlIllI[413]];
        N.lllIIlIII[N.lllIlIllI[0]] = "Buying items";
        N.lllIIlIII[N.lllIlIllI[1]] = "Finished buying items, switching back to questing";
        N.lllIIlIII[N.lllIlIllI[3]] = "Drink";
        N.lllIIlIII[N.lllIlIllI[5]] = "Shark";
        N.lllIIlIII[N.lllIlIllI[6]] = "Shark";
        N.lllIIlIII[N.lllIlIllI[7]] = "Eat";
        N.lllIIlIII[N.lllIlIllI[11]] = "Navigating to bank";
        N.lllIIlIII[N.lllIlIllI[9]] = "Opening bank";
        N.lllIIlIII[N.lllIlIllI[13]] = "Handling banking";
        N.lllIIlIII[N.lllIlIllI[17]] = "We are missing runessupplies, switching to BUYING";
        N.lllIIlIII[N.lllIlIllI[19]] = "Rope";
        N.lllIIlIII[N.lllIlIllI[21]] = "Shark";
        N.lllIIlIII[N.lllIlIllI[22]] = "We are missing supplies, switching to BUYING";
        N.lllIIlIII[N.lllIlIllI[23]] = "Rope";
        N.lllIIlIII[N.lllIlIllI[4]] = "Shark";
        N.lllIIlIII[N.lllIlIllI[26]] = "Drink";
        N.lllIIlIII[N.lllIlIllI[27]] = "Nav to start";
        N.lllIIlIII[N.lllIlIllI[28]] = "Chatting";
        N.lllIIlIII[N.lllIlIllI[25]] = "Nav to boy";
        N.lllIIlIII[N.lllIlIllI[29]] = "Chat boy";
        N.lllIIlIII[N.lllIlIllI[30]] = "Nav to bookcase";
        N.lllIIlIII[N.lllIlIllI[32]] = "Book on baxtorian";
        N.lllIIlIII[N.lllIlIllI[33]] = "Searching bookcase";
        N.lllIIlIII[N.lllIlIllI[34]] = "Search";
        N.lllIIlIII[N.lllIlIllI[35]] = "Book on baxtorian";
        N.lllIIlIII[N.lllIlIllI[37]] = "Book on baxtorian";
        N.lllIIlIII[N.lllIlIllI[38]] = "Reading";
        N.lllIIlIII[N.lllIlIllI[39]] = "Read";
        N.lllIIlIII[N.lllIlIllI[42]] = "Tele to CW";
        N.lllIIlIII[N.lllIlIllI[43]] = "Wear";
        N.lllIIlIII[N.lllIlIllI[44]] = "Castle Wars";
        N.lllIIlIII[N.lllIlIllI[45]] = "Nav to maze ladder";
        N.lllIIlIII[N.lllIlIllI[46]] = "Fountain";
        N.lllIIlIII[N.lllIlIllI[48]] = "Climb-down";
        N.lllIIlIII[N.lllIlIllI[50]] = "nav to box";
        N.lllIIlIII[N.lllIlIllI[51]] = "Searching crate";
        N.lllIIlIII[N.lllIlIllI[52]] = "Search";
        N.lllIIlIII[N.lllIlIllI[54]] = "Nav to cage";
        N.lllIIlIII[N.lllIlIllI[56]] = "Entering cage";
        N.lllIIlIII[N.lllIlIllI[57]] = "Chat npc";
        N.lllIIlIII[N.lllIlIllI[58]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[59]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[60]] = "Nav to tombstone";
        N.lllIIlIII[N.lllIlIllI[61]] = "Wear";
        N.lllIIlIII[N.lllIlIllI[62]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[63]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[64]] = "Entering tomb";
        N.lllIIlIII[N.lllIlIllI[67]] = "Stalagmite";
        N.lllIIlIII[N.lllIlIllI[68]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[69]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[2]] = "Getting ammy";
        N.lllIIlIII[N.lllIlIllI[71]] = "Open";
        N.lllIIlIII[N.lllIlIllI[73]] = "Search";
        N.lllIIlIII[N.lllIlIllI[74]] = "Stalagmite";
        N.lllIIlIII[N.lllIlIllI[75]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[76]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[77]] = "Getting ammy";
        N.lllIIlIII[N.lllIlIllI[78]] = "Open";
        N.lllIIlIII[N.lllIlIllI[79]] = "Search";
        N.lllIIlIII[N.lllIlIllI[80]] = "Stalagmite";
        N.lllIIlIII[N.lllIlIllI[82]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[83]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[84]] = "Getting ashes";
        N.lllIIlIII[N.lllIlIllI[85]] = "Search";
        N.lllIIlIII[N.lllIlIllI[86]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[10]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[87]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[88]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[89]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[90]] = "Nav to bank";
        N.lllIIlIII[N.lllIlIllI[91]] = "Wear";
        N.lllIIlIII[N.lllIlIllI[92]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[93]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[94]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[95]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[96]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[97]] = "Opening bank";
        N.lllIIlIII[N.lllIlIllI[98]] = "Withdrawing runes";
        N.lllIIlIII[N.lllIlIllI[99]] = "Vial";
        N.lllIIlIII[N.lllIlIllI[100]] = "Shark";
        N.lllIIlIII[N.lllIlIllI[101]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[102]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[103]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[104]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[105]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[106]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[107]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[108]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[109]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[110]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[111]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[112]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[113]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[114]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[115]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[116]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[117]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[118]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[119]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[120]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[121]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[122]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[123]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[124]] = "Nav to door entrance";
        N.lllIIlIII[N.lllIlIllI[125]] = "Rope";
        N.lllIIlIII[N.lllIlIllI[126]] = "Rock";
        N.lllIIlIII[N.lllIlIllI[127]] = "Roping rock";
        N.lllIIlIII[N.lllIlIllI[129]] = "Rope";
        N.lllIIlIII[N.lllIlIllI[131]] = "Roping tree";
        N.lllIIlIII[N.lllIlIllI[132]] = "Door";
        N.lllIIlIII[N.lllIlIllI[133]] = "Entering door";
        N.lllIIlIII[N.lllIlIllI[134]] = "Open";
        N.lllIIlIII[N.lllIlIllI[135]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[136]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[137]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[138]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[139]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[140]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[141]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[142]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[144]] = "Nav to key and get";
        N.lllIIlIII[N.lllIlIllI[146]] = "Search";
        N.lllIIlIII[N.lllIlIllI[147]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[148]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[149]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[150]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[151]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[152]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[153]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[154]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[155]] = "Nav to last room";
        N.lllIIlIII[N.lllIlIllI[156]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[157]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[158]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[159]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[160]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[161]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[162]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[163]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[164]] = "Door";
        N.lllIIlIII[N.lllIlIllI[166]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[167]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[168]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[169]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[170]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[171]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[172]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[173]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[174]] = "Door";
        N.lllIIlIII[N.lllIlIllI[175]] = "Open";
        N.lllIIlIII[N.lllIlIllI[176]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[177]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[178]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[179]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[180]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[181]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[182]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[183]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[184]] = "Nav to SE Pillar";
        N.lllIIlIII[N.lllIlIllI[185]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[186]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[187]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[188]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[189]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[190]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[191]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[192]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[193]] = "Using runes";
        N.lllIIlIII[N.lllIlIllI[194]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[195]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[196]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[197]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[198]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[199]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[201]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[202]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[203]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[204]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[205]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[206]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[207]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[208]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[209]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[210]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[211]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[212]] = "Using runes";
        N.lllIIlIII[N.lllIlIllI[213]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[214]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[215]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[216]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[217]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[218]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[219]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[220]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[221]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[222]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[223]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[224]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[225]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[226]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[227]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[228]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[229]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[230]] = "Using runes";
        N.lllIIlIII[N.lllIlIllI[231]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[232]] = "\"Yb[P";
        N.lllIIlIII[N.lllIlIllI[233]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[234]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[235]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[236]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[237]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[238]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[239]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[240]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[241]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[242]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[243]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[244]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[245]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[246]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[247]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[248]] = "Using runes";
        N.lllIIlIII[N.lllIlIllI[249]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[250]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[251]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[252]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[8]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[253]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[254]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[255]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[256]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[257]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[258]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[259]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[260]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[261]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[262]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[263]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[264]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[265]] = "Using runes";
        N.lllIIlIII[N.lllIlIllI[266]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[267]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[268]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[269]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[270]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[271]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[272]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[273]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[274]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[275]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[276]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[277]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[278]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[279]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[280]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[281]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[282]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[283]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[284]] = "Glarial's amulet";
        N.lllIIlIII[N.lllIlIllI[285]] = "Glarial's urn";
        N.lllIIlIII[N.lllIlIllI[286]] = "Using runes";
        N.lllIIlIII[N.lllIlIllI[287]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[288]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[289]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[290]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[291]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[292]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[293]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[294]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[295]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[296]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[297]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[298]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[299]] = "Air rune";
        N.lllIIlIII[N.lllIlIllI[300]] = "Earth rune";
        N.lllIIlIII[N.lllIlIllI[301]] = "Water rune";
        N.lllIIlIII[N.lllIlIllI[302]] = "Putting neck on statue";
        N.lllIIlIII[N.lllIlIllI[305]] = "Putting ashes inside";
        N.lllIIlIII[N.lllIlIllI[308]] = "Chalice";
        N.lllIIlIII[N.lllIlIllI[309]] = "Statue of Glarial";
        N.lllIIlIII[N.lllIlIllI[310]] = "Pillar";
        N.lllIIlIII[N.lllIlIllI[311]] = "Teleporting to CW";
        N.lllIIlIII[N.lllIlIllI[312]] = "Wear";
        N.lllIIlIII[N.lllIlIllI[313]] = "Castle Wars";
        N.lllIIlIII[N.lllIlIllI[314]] = "Rope";
        N.lllIIlIII[N.lllIlIllI[325]] = "Waterfall quest";
        N.lllIIlIII[N.lllIlIllI[326]] = "ring of wealth (";
        N.lllIIlIII[N.lllIlIllI[327]] = "Stalagmite";
        N.lllIIlIII[N.lllIlIllI[328]] = "Games";
        N.lllIIlIII[N.lllIlIllI[329]] = "Games";
        N.lllIIlIII[N.lllIlIllI[330]] = "Games";
        N.lllIIlIII[N.lllIlIllI[331]] = "dueling";
        N.lllIIlIII[N.lllIlIllI[332]] = "dueling";
        N.lllIIlIII[N.lllIlIllI[40]] = "dueling";
        N.lllIIlIII[N.lllIlIllI[41]] = "dueling";
        N.lllIIlIII[N.lllIlIllI[304]] = "dueling";
        N.lllIIlIII[N.lllIlIllI[307]] = "How can I help?";
        N.lllIIlIII[N.lllIlIllI[402]] = "I'm always happy to help a cook in distress.";
        N.lllIIlIII[N.lllIlIllI[143]] = "Yes.";
        N.lllIIlIII[N.lllIlIllI[403]] = "Golrie";
        N.lllIIlIII[N.lllIlIllI[404]] = "Hudon";
        N.lllIIlIII[N.lllIlIllI[405]] = "Almera";
    }

    private static boolean llIIlIIIllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ae() {
        return lllIlIllI[0];
    }

    public static void Q() {
        d llIllIIIIlIlI;
        Object llIllIIIIlIll;
        block20: {
            block19: {
                int[] nArray = new int[lllIlIllI[1]];
                nArray[N.lllIlIllI[0]] = lllIlIllI[20];
                if (N.llIIlIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lllIlIllI[20], lllIlIllI[44], lllIlIllI[315]);
                    bx.add(d2);

                }
                int[] nArray2 = new int[lllIlIllI[1]];
                nArray2[N.lllIlIllI[0]] = lllIlIllI[316];
                if (N.llIIlIIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    llIllIIIIlIll = new DHelper(lllIlIllI[316], lllIlIllI[7], j.ch);
                    bx.add((DHelper) lIllIIIIlIll);

                }
                int[] nArray3 = new int[lllIlIllI[1]];
                nArray3[N.lllIlIllI[0]] = lllIlIllI[14];
                if (N.llIIlIIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lllIlIllI[1]];
                    nArray4[N.lllIlIllI[0]] = lllIlIllI[14];
                    if (N.llIIlIIIllII(Bank.getFirst((int[])nArray4).getQuantity(), lllIlIllI[11])) {
                        llIllIIIIlIll = new DHelper(lllIlIllI[14], lllIlIllI[317], lllIlIllI[19]);
                        bx.add((DHelper) lIllIIIIlIll);

                    }
                }
                int[] nArray5 = new int[lllIlIllI[1]];
                nArray5[N.lllIlIllI[0]] = lllIlIllI[15];
                if (N.llIIlIIIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lllIlIllI[1]];
                    nArray6[N.lllIlIllI[0]] = lllIlIllI[15];
                    if (N.llIIlIIIllII(Bank.getFirst((int[])nArray6).getQuantity(), lllIlIllI[11])) {
                        llIllIIIIlIll = new DHelper(lllIlIllI[15], lllIlIllI[317], lllIlIllI[19]);
                        bx.add((DHelper) lIllIIIIlIll);

                    }
                }
                int[] nArray7 = new int[lllIlIllI[1]];
                nArray7[N.lllIlIllI[0]] = lllIlIllI[16];
                if (N.llIIlIIIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lllIlIllI[1]];
                    nArray8[N.lllIlIllI[0]] = lllIlIllI[16];
                    if (N.llIIlIIIllII(Bank.getFirst((int[])nArray8).getQuantity(), lllIlIllI[11])) {
                        llIllIIIIlIll = new DHelper(lllIlIllI[16], lllIlIllI[317], lllIlIllI[19]);
                        bx.add((DHelper) lIllIIIIlIll);

                    }
                }
                int[] nArray9 = new int[lllIlIllI[1]];
                nArray9[N.lllIlIllI[0]] = lllIlIllI[14];
                if (N.llIIlIIIllIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    llIllIIIIlIll = new DHelper(lllIlIllI[14], lllIlIllI[317], lllIlIllI[19]);
                    bx.add((DHelper) lIllIIIIlIll);

                }
                int[] nArray10 = new int[lllIlIllI[1]];
                nArray10[N.lllIlIllI[0]] = lllIlIllI[15];
                if (N.llIIlIIIllIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    llIllIIIIlIll = new DHelper(lllIlIllI[15], lllIlIllI[317], lllIlIllI[19]);
                    bx.add((DHelper) lIllIIIIlIll);

                }
                int[] nArray11 = new int[lllIlIllI[1]];
                nArray11[N.lllIlIllI[0]] = lllIlIllI[16];
                if (N.llIIlIIIllIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    llIllIIIIlIll = new DHelper(lllIlIllI[16], lllIlIllI[317], lllIlIllI[19]);
                    bx.add((DHelper) lIllIIIIlIll);

                }
                int[] nArray12 = new int[lllIlIllI[1]];
                nArray12[N.lllIlIllI[0]] = lllIlIllI[14];
                if (N.llIIlIIIllIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    llIllIIIIlIll = new DHelper(lllIlIllI[14], lllIlIllI[317], lllIlIllI[19]);
                    bx.add((DHelper) lIllIIIIlIll);

                }
                int[] nArray13 = new int[lllIlIllI[1]];
                nArray13[N.lllIlIllI[0]] = lllIlIllI[318];
                if (N.llIIlIIIllIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    llIllIIIIlIll = new DHelper(lllIlIllI[318], lllIlIllI[7], lllIlIllI[315]);
                    bx.add((DHelper) lIllIIIIlIll);

                }
                int[] nArray14 = new int[lllIlIllI[1]];
                nArray14[N.lllIlIllI[0]] = lllIlIllI[24];
                if (!N.llIIlIIIlIll(Bank.contains((int[])nArray14) ? 1 : 0)) break block19;
                int[] nArray15 = new int[lllIlIllI[1]];
                nArray15[N.lllIlIllI[0]] = lllIlIllI[24];
                if (!N.llIIlIIIlIll(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lllIlIllI[1]];
                nArray16[N.lllIlIllI[0]] = lllIlIllI[24];
                if (!N.llIIlIIIllII(Bank.getFirst((int[])nArray16).getQuantity(), lllIlIllI[19])) break block20;
            }
            llIllIIIIlIll = new DHelper(lllIlIllI[24], lllIlIllI[19], lllIlIllI[319]);
            bx.add((DHelper) lIllIIIIlIll);

        }
        int[] nArray = new int[lllIlIllI[1]];
        nArray[N.lllIlIllI[0]] = lllIlIllI[18];
        if (N.llIIlIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIllIIIIlIll = new DHelper(lllIlIllI[18], lllIlIllI[7], lllIlIllI[320]);
            bx.add((DHelper) lIllIIIIlIll);

        }
        if (N.llIIlIIIllIl(Bank.contains((Predicate)(llIllIIIIlIll = item -> item.getName().toLowerCase().contains(lllIIlIII[lllIlIllI[326]]))) ? 1 : 0)) {
            llIllIIIIlIlI = new DHelper(lllIlIllI[321], lllIlIllI[25], lllIlIllI[322]);
            bx.add(llIllIIIIlIlI);

        }
        int[] nArray17 = new int[lllIlIllI[1]];
        nArray17[N.lllIlIllI[0]] = lllIlIllI[323];
        if (N.llIIlIIIllIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
            llIllIIIIlIlI = new DHelper(lllIlIllI[323], lllIlIllI[58], lllIlIllI[324]);
            bx.add(llIllIIIIlIlI);

        }
    }

    private static boolean llIIlIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        N.llIIlIIIlIlI();
        N.llIIIllIIIll();
        iu = lllIlIllI[10];
        ji = lllIlIllI[306];
        iz = lllIlIllI[7];
        iv = lllIlIllI[1];
        jh = lllIlIllI[303];
        iA = lllIlIllI[11];
        jf = lllIlIllI[49];
        iy = lllIlIllI[6];
        jg = lllIlIllI[145];
        iw = lllIlIllI[3];
        iC = lllIlIllI[19];
        ix = lllIlIllI[5];
        iB = lllIlIllI[13];
        jj = lllIlIllI[143];
        int[] nArray = new int[lllIlIllI[17]];
        nArray[N.lllIlIllI[0]] = lllIlIllI[318];
        nArray[N.lllIlIllI[1]] = lllIlIllI[333];
        nArray[N.lllIlIllI[3]] = lllIlIllI[334];
        nArray[N.lllIlIllI[5]] = lllIlIllI[335];
        nArray[N.lllIlIllI[6]] = lllIlIllI[336];
        nArray[N.lllIlIllI[7]] = lllIlIllI[337];
        nArray[N.lllIlIllI[11]] = lllIlIllI[338];
        nArray[N.lllIlIllI[9]] = lllIlIllI[339];
        nArray[N.lllIlIllI[13]] = lllIlIllI[339];
        ik = nArray;
        int[] nArray2 = new int[lllIlIllI[6]];
        nArray2[N.lllIlIllI[0]] = lllIlIllI[316];
        nArray2[N.lllIlIllI[1]] = lllIlIllI[340];
        nArray2[N.lllIlIllI[3]] = lllIlIllI[341];
        nArray2[N.lllIlIllI[5]] = lllIlIllI[342];
        il = nArray2;
        int[] nArray3 = new int[lllIlIllI[17]];
        nArray3[N.lllIlIllI[0]] = lllIlIllI[24];
        nArray3[N.lllIlIllI[1]] = lllIlIllI[343];
        nArray3[N.lllIlIllI[3]] = lllIlIllI[344];
        nArray3[N.lllIlIllI[5]] = lllIlIllI[345];
        nArray3[N.lllIlIllI[6]] = lllIlIllI[346];
        nArray3[N.lllIlIllI[7]] = lllIlIllI[347];
        nArray3[N.lllIlIllI[11]] = lllIlIllI[348];
        nArray3[N.lllIlIllI[9]] = lllIlIllI[349];
        nArray3[N.lllIlIllI[13]] = lllIlIllI[348];
        im = nArray3;
        in = new WorldArea(lllIlIllI[344], lllIlIllI[350], lllIlIllI[26], lllIlIllI[25], lllIlIllI[0]);
        io = new WorldPoint(lllIlIllI[351], lllIlIllI[352], lllIlIllI[0]);
        ip = new WorldPoint(lllIlIllI[351], lllIlIllI[353], lllIlIllI[0]);
        iq = new WorldPoint(lllIlIllI[351], lllIlIllI[354], lllIlIllI[0]);
        ir = new WorldPoint(lllIlIllI[346], lllIlIllI[354], lllIlIllI[0]);
        is = new WorldPoint(lllIlIllI[346], lllIlIllI[353], lllIlIllI[0]);
        it = new WorldPoint(lllIlIllI[346], lllIlIllI[352], lllIlIllI[0]);
        WorldPoint[] worldPointArray = new WorldPoint[lllIlIllI[7]];
        worldPointArray[N.lllIlIllI[0]] = new WorldPoint(lllIlIllI[355], lllIlIllI[356], lllIlIllI[0]);
        worldPointArray[N.lllIlIllI[1]] = new WorldPoint(lllIlIllI[357], lllIlIllI[358], lllIlIllI[0]);
        worldPointArray[N.lllIlIllI[3]] = new WorldPoint(lllIlIllI[359], lllIlIllI[360], lllIlIllI[0]);
        worldPointArray[N.lllIlIllI[5]] = new WorldPoint(lllIlIllI[361], lllIlIllI[362], lllIlIllI[0]);
        worldPointArray[N.lllIlIllI[6]] = new WorldPoint(lllIlIllI[363], lllIlIllI[364], lllIlIllI[0]);
        iD = worldPointArray;
        iE = new WorldPoint(lllIlIllI[365], lllIlIllI[53], lllIlIllI[0]);
        iF = new WorldPoint(lllIlIllI[366], lllIlIllI[367], lllIlIllI[0]);
        iG = new WorldPoint(lllIlIllI[368], lllIlIllI[369], lllIlIllI[0]);
        iH = new WorldPoint(lllIlIllI[370], lllIlIllI[371], lllIlIllI[0]);
        iI = new WorldPoint(lllIlIllI[372], lllIlIllI[373], lllIlIllI[0]);
        iJ = new WorldPoint(lllIlIllI[374], lllIlIllI[375], lllIlIllI[0]);
        iK = new WorldPoint(lllIlIllI[376], lllIlIllI[377], lllIlIllI[0]);
        iL = new WorldPoint(lllIlIllI[374], lllIlIllI[378], lllIlIllI[0]);
        iM = new WorldPoint(lllIlIllI[379], lllIlIllI[380], lllIlIllI[0]);
        iN = new WorldPoint(lllIlIllI[379], lllIlIllI[381], lllIlIllI[1]);
        iO = new WorldPoint(lllIlIllI[363], lllIlIllI[382], lllIlIllI[0]);
        iP = new WorldPoint(lllIlIllI[383], lllIlIllI[384], lllIlIllI[0]);
        iQ = new WorldPoint(lllIlIllI[365], lllIlIllI[385], lllIlIllI[0]);
        iR = new WorldPoint(lllIlIllI[386], lllIlIllI[387], lllIlIllI[0]);
        iS = new WorldPoint(lllIlIllI[388], lllIlIllI[389], lllIlIllI[0]);
        iT = new WorldPoint(lllIlIllI[390], lllIlIllI[391], lllIlIllI[0]);
        iU = new WorldPoint(lllIlIllI[392], lllIlIllI[393], lllIlIllI[0]);
        iV = new WorldPoint(lllIlIllI[394], lllIlIllI[395], lllIlIllI[0]);
        iW = new WorldPoint(lllIlIllI[396], lllIlIllI[397], lllIlIllI[0]);
        iX = new WorldPoint(lllIlIllI[398], lllIlIllI[399], lllIlIllI[0]);
        iY = new WorldPoint(lllIlIllI[349], lllIlIllI[350], lllIlIllI[0]);
        iZ = new WorldPoint(lllIlIllI[400], lllIlIllI[352], lllIlIllI[0]);
        ja = new WorldPoint(lllIlIllI[400], lllIlIllI[353], lllIlIllI[0]);
        jb = new WorldPoint(lllIlIllI[400], lllIlIllI[354], lllIlIllI[0]);
        jc = new WorldPoint(lllIlIllI[398], lllIlIllI[354], lllIlIllI[0]);
        jd = new WorldPoint(lllIlIllI[398], lllIlIllI[353], lllIlIllI[0]);
        je = new WorldPoint(lllIlIllI[398], lllIlIllI[352], lllIlIllI[0]);
        bx = new ArrayList<d>();
        jk = new WorldArea(new WorldPoint(lllIlIllI[379], lllIlIllI[53], lllIlIllI[0]), new WorldPoint(lllIlIllI[368], lllIlIllI[401], lllIlIllI[0]));
        jl = lllIlIllI[40];
        jm = lllIlIllI[41];
        jn = lllIlIllI[0];
        jo = lllIlIllI[0];
        jp = lllIlIllI[0];
        jq = lllIlIllI[0];
        jr = lllIlIllI[0];
        js = lllIlIllI[0];
        String[] stringArray = new String[lllIlIllI[5]];
        stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[307]];
        stringArray[N.lllIlIllI[1]] = lllIIlIII[lllIlIllI[402]];
        stringArray[N.lllIlIllI[3]] = lllIIlIII[lllIlIllI[143]];
        eY = stringArray;
        jt = lllIIlIII[lllIlIllI[403]];
        ju = lllIIlIII[lllIlIllI[404]];
        jv = lllIIlIII[lllIlIllI[405]];
        jw = new WorldPoint(lllIlIllI[349], lllIlIllI[406], lllIlIllI[0]);
        jx = new WorldArea(lllIlIllI[407], lllIlIllI[408], lllIlIllI[10], lllIlIllI[84], lllIlIllI[0]);
        jy = new WorldPoint(lllIlIllI[409], lllIlIllI[410], lllIlIllI[0]);
        jz = new WorldArea(lllIlIllI[411], lllIlIllI[412], lllIlIllI[82], lllIlIllI[90], lllIlIllI[0]);
        cI = lllIlIllI[0];
    }

        return String.valueOf(llIlIlllIIIIl);
    }

    @Override
    public String ag() {
        return lllIIlIII[lllIlIllI[325]];
    }

    private static boolean llIIlIIlIlIl(Object object) {
        return object == null;
    }

    private static boolean llIIlIIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (N.llIIlIIIllll(e.j(lllIlIllI[10]), lllIlIllI[19])) {
            bl = lllIlIllI[1];

            if (3 == 0) {
                return false;
            }
        } else {
            bl = lllIlIllI[0];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aM() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lllIlIllI[1]];
                nArray[N.lllIlIllI[0]] = lllIlIllI[20];
                if (!N.llIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0) || !N.llIIlIIIlIll(Inventory.contains((int[])f.bc) ? 1 : 0)) break block2;
                if (!N.llIIlIIIllIl(Inventory.contains((int[])f.aV) ? 1 : 0)) break block3;
                if (!N.llIIlIIIlIll(Equipment.contains((int[])f.aV) ? 1 : 0) || N.llIIlIIIllIl(Inventory.contains((int[])f.aU) ? 1 : 0) && !N.llIIlIIIlIll(Equipment.contains((int[])f.aU) ? 1 : 0)) break block2;
                String[] stringArray = new String[lllIlIllI[1]];
                stringArray[N.lllIlIllI[0]] = lllIIlIII[lllIlIllI[314]];
                if (!N.llIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
            }
            n2 = lllIlIllI[1];

            if (null == null) return n2 != 0;
            return ((9 ^ 0x5C ^ (0xD9 ^ 0x8A)) & (0x29 ^ 0x76 ^ (0x47 ^ 0x1E) ^ -1)) != 0;
        }
        n2 = lllIlIllI[0];
        return n2 != 0;
    }

    private static boolean llIIlIIlIIIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlIIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIlIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int af() {
        try {
            N.cv();

        }
        catch (Exception llIllIIIIlIII) {
            llIllIIIIlIII.printStackTrace();
        }
        if (3 <= 0) {
            return (5 + 195 - 24 + 29 ^ 23 + 141 - 88 + 77) & (0xE1 ^ 0x99 ^ (0x80 ^ 0xAC) ^ -1);
        }
        return lllIlIllI[121];
    }

    private static boolean llIIlIIIlIll(int n2) {
        return n2 != 0;
    }
}

