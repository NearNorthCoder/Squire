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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AOHelper;
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

public class BHelper
implements ab {
    private static  WorldPoint ek;
    private static  WorldPoint ei;
    public static  List<d> bx;
    
    static  boolean dl;
    static  WorldArea ee;
    static  boolean ef;
    static  String[] cG;
    private static  WorldPoint eh;
    static  int dk;
    private static  WorldPoint dg;
    private static  WorldPoint eg;
    private static  WorldPoint ej;
    public static  boolean bv;
    
    private static  int el;

        return String.valueOf(lIIIllIIIlIlIl);
    }

    private static boolean lIllIllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void Q() {
        d lIIIllIIlllllI;
        Object lIIIllIIllllll;
        int[] nArray = new int[llIlIllll[1]];
        nArray[B.llIlIllll[2]] = llIlIllll[12];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIlIllll[12], llIlIllll[1], llIlIllll[57]);
            bx.add(d2);

        }
        int[] nArray2 = new int[llIlIllll[1]];
        nArray2[B.llIlIllll[2]] = llIlIllll[10];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIIllIIllllll = new DHelper(llIlIllll[10], llIlIllll[1], llIlIllll[4]);
            bx.add((DHelper) IIIllIIllllll);

        }
        int[] nArray3 = new int[llIlIllll[1]];
        nArray3[B.llIlIllll[2]] = llIlIllll[9];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIIllIIllllll = new DHelper(llIlIllll[9], llIlIllll[1], llIlIllll[4]);
            bx.add((DHelper) IIIllIIllllll);

        }
        int[] nArray4 = new int[llIlIllll[1]];
        nArray4[B.llIlIllll[2]] = llIlIllll[14];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIIllIIllllll = new DHelper(llIlIllll[14], llIlIllll[24], llIlIllll[4]);
            bx.add((DHelper) IIIllIIllllll);

        }
        int[] nArray5 = new int[llIlIllll[1]];
        nArray5[B.llIlIllll[2]] = llIlIllll[16];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIIllIIllllll = new DHelper(llIlIllll[16], llIlIllll[24], j.ch);
            bx.add((DHelper) IIIllIIllllll);

        }
        int[] nArray6 = new int[llIlIllll[1]];
        nArray6[B.llIlIllll[2]] = llIlIllll[11];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIIllIIllllll = new DHelper(llIlIllll[11], llIlIllll[0], llIlIllll[58]);
            bx.add((DHelper) IIIllIIllllll);

        }
        if (B.lIllIllIIlll(Bank.contains((Predicate)(lIIIllIIllllll = item -> item.getName().toLowerCase().contains(llIlIlllI[llIlIllll[64]]))) ? 1 : 0)) {
            lIIIllIIlllllI = new DHelper(llIlIllll[59], llIlIllll[13], llIlIllll[60]);
            bx.add(lIIIllIIlllllI);

        }
        int[] nArray7 = new int[llIlIllll[1]];
        nArray7[B.llIlIllll[2]] = llIlIllll[8];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIIllIIlllllI = new DHelper(llIlIllll[8], llIlIllll[52], llIlIllll[61]);
            bx.add(lIIIllIIlllllI);

        }
    }

    @Override
    public String ag() {
        return llIlIlllI[llIlIllll[63]];
    }

    static {
        B.lIllIllIIIll();
        B.lIllIllIIIlI();
        bx = new ArrayList<d>();
        ee = new WorldArea(llIlIllll[65], llIlIllll[66], llIlIllll[24], llIlIllll[25], llIlIllll[2]);
        String[] stringArray = new String[llIlIllll[22]];
        stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[67]];
        stringArray[B.llIlIllll[1]] = llIlIlllI[llIlIllll[68]];
        stringArray[B.llIlIllll[3]] = llIlIlllI[llIlIllll[69]];
        stringArray[B.llIlIllll[5]] = llIlIlllI[llIlIllll[19]];
        stringArray[B.llIlIllll[6]] = llIlIlllI[llIlIllll[70]];
        stringArray[B.llIlIllll[13]] = llIlIlllI[llIlIllll[71]];
        stringArray[B.llIlIllll[15]] = llIlIlllI[llIlIllll[72]];
        stringArray[B.llIlIllll[7]] = llIlIlllI[llIlIllll[73]];
        cG = stringArray;
        dg = new WorldPoint(llIlIllll[74], llIlIllll[75], llIlIllll[2]);
        eg = new WorldPoint(llIlIllll[76], llIlIllll[77], llIlIllll[2]);
        eh = new WorldPoint(llIlIllll[78], llIlIllll[79], llIlIllll[2]);
        ei = new WorldPoint(llIlIllll[80], llIlIllll[81], llIlIllll[2]);
        ej = new WorldPoint(llIlIllll[82], llIlIllll[83], llIlIllll[2]);
        ek = new WorldPoint(llIlIllll[84], llIlIllll[85], llIlIllll[2]);
        el = llIlIllll[24];
    }

    private static boolean lIllIllIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIlIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIlIllll[2];
    }

    public static void bs() {
        if (B.lIllIllIIlII(Skills.getLevel((Skill)Skill.FISHING), llIlIllll[0])) {
            ao.ey();
        }
        if (B.lIllIllIIlIl(Skills.getLevel((Skill)Skill.FISHING), llIlIllll[0])) {
            if (B.lIllIllIIllI(bv ? 1 : 0)) {
                b.a(bx);
                if (B.lIllIllIIlII(bx.size(), llIlIllll[1])) {
                    System.out.println(llIlIlllI[llIlIllll[2]]);
                    bv = llIlIllll[2];
                }
            }
            if (B.lIllIllIIlll(bv ? 1 : 0)) {
                if (B.lIllIllIIlll(B.an() ? 1 : 0) && B.lIllIllIIlII(e.j(el), llIlIllll[1])) {
                    String[] stringArray = new String[llIlIllll[1]];
                    stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[1]];
                    if (B.lIllIllIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        BankLocation lIIIllIlIIIIlI = BankLocation.getNearest();
                        if (B.lIllIllIlIII(lIIIllIlIIIIlI) && B.lIllIllIIlll(lIIIllIlIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[3]];
                            a.a(lIIIllIlIIIIlI);
                        }
                        if (B.lIllIllIlIII(lIIIllIlIIIIlI) && B.lIllIllIIllI(lIIIllIlIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (B.lIllIllIIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllll[4]);

                            }
                            if (B.lIllIllIIllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderGWD.c = llIlIlllI[llIlIllll[5]];
                                if (B.lIllIllIlIIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIlIllll[6]);

                                }
                                if (B.lIllIllIlIIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIlIllll[3]);

                                }
                                int[] nArray = new int[llIlIllll[7]];
                                nArray[B.llIlIllll[2]] = llIlIllll[8];
                                nArray[B.llIlIllll[1]] = llIlIllll[9];
                                nArray[B.llIlIllll[3]] = llIlIllll[10];
                                nArray[B.llIlIllll[5]] = llIlIllll[11];
                                nArray[B.llIlIllll[6]] = llIlIllll[12];
                                nArray[B.llIlIllll[13]] = llIlIllll[14];
                                nArray[B.llIlIllll[15]] = llIlIllll[16];
                                if (B.lIllIllIIlll(e.d(nArray) ? 1 : 0)) {
                                    B.Q();
                                    System.out.println(llIlIlllI[llIlIllll[6]]);
                                    bv = llIlIllll[1];
                                    return;
                                }
                                int[] nArray2 = new int[llIlIllll[15]];
                                nArray2[B.llIlIllll[2]] = llIlIllll[8];
                                nArray2[B.llIlIllll[1]] = llIlIllll[9];
                                nArray2[B.llIlIllll[3]] = llIlIllll[10];
                                nArray2[B.llIlIllll[5]] = llIlIllll[11];
                                nArray2[B.llIlIllll[6]] = llIlIllll[12];
                                nArray2[B.llIlIllll[13]] = llIlIllll[14];
                                if (B.lIllIllIIllI(e.d(nArray2) ? 1 : 0)) {
                                    a.a(llIlIllll[8], llIlIllll[0]);
                                    a.a(llIlIllll[14], llIlIllll[0]);
                                    a.a(llIlIllll[9], llIlIllll[1]);
                                    a.a(llIlIllll[10], llIlIllll[1]);
                                    a.a(llIlIllll[11], llIlIllll[0]);
                                    a.a(llIlIllll[12], llIlIllll[1]);
                                    a.a(llIlIllll[16], llIlIllll[5]);
                                    a.a(llIlIllll[17], llIlIllll[18]);
                                }
                            }
                        }
                    }
                }
                if (B.lIllIllIIllI(Inventory.contains((int[])f.bc) ? 1 : 0) && B.lIllIllIIlII(Movement.getRunEnergy(), llIlIllll[19])) {
                    Inventory.getFirst((int[])f.bc).interact(llIlIlllI[llIlIllll[13]]);
                    Time.sleepTicks((int)llIlIllll[1]);

                }
                if (B.lIllIllIIllI(B.an() ? 1 : 0) && B.lIllIllIIlII(e.j(el), llIlIllll[1])) {
                    int[] nArray = new int[llIlIllll[1]];
                    nArray[B.llIlIllll[2]] = llIlIllll[20];
                    if (B.lIllIllIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (B.lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[0])) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[15]];
                            if (B.lIllIllIIllI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)dg);

                            Time.sleepTicks((int)llIlIllll[1]);

                        }
                        if (B.lIllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[21])) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[7]];
                            g.a(llIlIlllI[llIlIllll[22]], cG);
                        }
                    }
                }
                if (B.lIllIllIllII(e.j(el), llIlIllll[1])) {
                    int[] nArray = new int[llIlIllll[1]];
                    nArray[B.llIlIllll[2]] = llIlIllll[20];
                    if (B.lIllIllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIllll[1]];
                        stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[23]];
                        if (B.lIllIllIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            dk = llIlIllll[2];
                            String[] stringArray2 = new String[llIlIllll[1]];
                            stringArray2[B.llIlIllll[2]] = llIlIlllI[llIlIllll[0]];
                            if (B.lIllIllIIlll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                if (B.lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(eh), llIlIllll[6])) {
                                    AccBuilderGWD.c = llIlIlllI[llIlIllll[24]];
                                    Movement.walkTo((WorldPoint)eh);

                                }
                                if (B.lIllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(eh), llIlIllll[6])) {
                                    AccBuilderGWD.c = llIlIlllI[llIlIllll[21]];
                                    String[] stringArray3 = new String[llIlIllll[1]];
                                    stringArray3[B.llIlIllll[2]] = llIlIlllI[llIlIllll[25]];
                                    if (B.lIllIllIIlll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[llIlIllll[1]];
                                        stringArray4[B.llIlIllll[2]] = llIlIlllI[llIlIllll[26]];
                                        if (B.lIllIllIlIII(TileObjects.getNearest((String[])stringArray4))) {
                                            String[] stringArray5 = new String[llIlIllll[1]];
                                            stringArray5[B.llIlIllll[2]] = llIlIlllI[llIlIllll[27]];
                                            TileObjects.getNearest((String[])stringArray5).interact(llIlIlllI[llIlIllll[28]]);
                                            Time.sleepTicks((int)llIlIllll[3]);

                                        }
                                    }
                                }
                            }
                            String[] stringArray6 = new String[llIlIllll[1]];
                            stringArray6[B.llIlIllll[2]] = llIlIlllI[llIlIllll[29]];
                            if (B.lIllIllIIllI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                if (B.lIllIllIIlll(ee.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = llIlIlllI[llIlIllll[30]];
                                    if (B.lIllIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)ek);

                                        Time.sleepTicks((int)llIlIllll[1]);

                                    }
                                    g.a(cG);
                                }
                                if (B.lIllIllIIllI(ee.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray7 = new String[llIlIllll[1]];
                                    stringArray7[B.llIlIllll[2]] = llIlIlllI[llIlIllll[31]];
                                    if (B.lIllIllIIllI(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlIlllI[llIlIllll[32]];
                                        String[] stringArray8 = new String[llIlIllll[1]];
                                        stringArray8[B.llIlIllll[2]] = llIlIlllI[llIlIllll[33]];
                                        if (B.lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray8).getWorldLocation()), llIlIllll[3])) {
                                            String[] stringArray9 = new String[llIlIllll[1]];
                                            stringArray9[B.llIlIllll[2]] = llIlIlllI[llIlIllll[34]];
                                            Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray9).getWorldLocation());

                                            Time.sleepTicks((int)llIlIllll[6]);

                                        }
                                        if (B.lIllIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[llIlIllll[1]];
                                            stringArray10[B.llIlIllll[2]] = llIlIlllI[llIlIllll[35]];
                                            String[] stringArray11 = new String[llIlIllll[1]];
                                            stringArray11[B.llIlIllll[2]] = llIlIlllI[llIlIllll[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)llIlIllll[3]);

                                        }
                                        g.a(cG);
                                    }
                                    String[] stringArray12 = new String[llIlIllll[1]];
                                    stringArray12[B.llIlIllll[2]] = llIlIlllI[llIlIllll[37]];
                                    if (B.lIllIllIIlll(Inventory.contains((String[])stringArray12) ? 1 : 0) && B.lIllIllIIlll(ef ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlIlllI[llIlIllll[38]];
                                        g.a(llIlIlllI[llIlIllll[20]], cG);
                                        if (B.lIllIllIIllI(Dialog.getText().contains(llIlIlllI[llIlIllll[39]]) ? 1 : 0)) {
                                            ef = llIlIllll[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (B.lIllIllIllII(e.j(el), llIlIllll[5])) {
                    String[] stringArray = new String[llIlIllll[1]];
                    stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[40]];
                    if (B.lIllIllIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray13 = new String[llIlIllll[1]];
                        stringArray13[B.llIlIllll[2]] = llIlIlllI[llIlIllll[41]];
                        if (B.lIllIllIIlll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[42]];
                            int[] nArray = new int[llIlIllll[1]];
                            nArray[B.llIlIllll[2]] = llIlIllll[43];
                            NPCs.getNearest((int[])nArray).interact(llIlIlllI[llIlIllll[44]]);
                            Time.sleepTicks((int)llIlIllll[13]);

                        }
                    }
                    String[] stringArray14 = new String[llIlIllll[1]];
                    stringArray14[B.llIlIllll[2]] = llIlIlllI[llIlIllll[45]];
                    if (B.lIllIllIIllI(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlIlllI[llIlIllll[46]];
                        g.a(llIlIlllI[llIlIllll[47]], cG);
                    }
                }
                String[] stringArray = new String[llIlIllll[1]];
                stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[48]];
                if (B.lIllIllIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (B.lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[13])) {
                        AccBuilderGWD.c = llIlIlllI[llIlIllll[49]];
                        Movement.walkTo((WorldPoint)dg);

                        Time.sleepTicks((int)llIlIllll[1]);

                    }
                    if (B.lIllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[13])) {
                        AccBuilderGWD.c = llIlIlllI[llIlIllll[50]];
                        if (B.lIllIllIIlII(dk, llIlIllll[1])) {
                            as.na += llIlIllll[1];
                            as.u(AccBuilderGWD.m);
                            dk += llIlIllll[1];
                            as.na = llIlIllll[2];
                            dl = llIlIllll[2];
                        }
                        g.a(llIlIlllI[llIlIllll[51]], cG);
                    }
                }
            }
        }
    }

    private static boolean lIllIllIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int af() {
        try {
            B.bs();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((95 + 123 - 148 + 64 ^ 82 + 102 - 173 + 120) == 0) {
            return (0x44 ^ 0x70 ^ (0x52 ^ 0x2A)) & (0xAA ^ 0xC7 ^ (0xBD ^ 0x9C) ^ -1);
        }
        return llIlIllll[62];
    }

    private static void lIllIllIIIlI() {
        llIlIlllI = new String[llIlIllll[86]];
        B.llIlIlllI[B.llIlIllll[2]] = "Finished buying items, switching back to quest";
        B.llIlIlllI[B.llIlIllll[1]] = "Fishing pass";
        B.llIlIlllI[B.llIlIllll[3]] = "Nav to bank";
        B.llIlIlllI[B.llIlIllll[5]] = "Handling banking";
        B.llIlIlllI[B.llIlIllll[6]] = "We are missing quest supplies, switching to BUYING";
        B.llIlIlllI[B.llIlIllll[13]] = "Drink";
        B.llIlIlllI[B.llIlIllll[15]] = "Nav to start";
        B.llIlIlllI[B.llIlIllll[7]] = "Starting quest";
        B.llIlIlllI[B.llIlIllll[22]] = "Vestri";
        B.llIlIlllI[B.llIlIllll[23]] = "Fishing trophy";
        B.llIlIlllI[B.llIlIllll[0]] = "Red vine worm";
        B.llIlIlllI[B.llIlIllll[24]] = "Nav to vine";
        B.llIlIlllI[B.llIlIllll[21]] = "Digging";
        B.llIlIlllI[B.llIlIllll[25]] = "Red vine worm";
        B.llIlIlllI[B.llIlIllll[26]] = "Vine";
        B.llIlIlllI[B.llIlIllll[27]] = "Vine";
        B.llIlIlllI[B.llIlIllll[28]] = "Check";
        B.llIlIlllI[B.llIlIllll[29]] = "Red vine worm";
        B.llIlIlllI[B.llIlIllll[30]] = "Nav to contest";
        B.llIlIlllI[B.llIlIllll[31]] = "Garlic";
        B.llIlIlllI[B.llIlIllll[32]] = "Using garlic";
        B.llIlIlllI[B.llIlIllll[33]] = "Wall Pipe";
        B.llIlIlllI[B.llIlIllll[34]] = "Wall Pipe";
        B.llIlIlllI[B.llIlIllll[35]] = "Garlic";
        B.llIlIlllI[B.llIlIllll[36]] = "Wall Pipe";
        B.llIlIlllI[B.llIlIllll[37]] = "Garlic";
        B.llIlIlllI[B.llIlIllll[38]] = "Start contest";
        B.llIlIlllI[B.llIlIllll[20]] = "Bonzo";
        B.llIlIlllI[B.llIlIllll[39]] = "I might still be able to find a bigger fish";
        B.llIlIlllI[B.llIlIllll[40]] = "Garlic";
        B.llIlIlllI[B.llIlIllll[41]] = "Raw giant carp";
        B.llIlIlllI[B.llIlIllll[42]] = "Fishing";
        B.llIlIlllI[B.llIlIllll[44]] = "Bait";
        B.llIlIlllI[B.llIlIllll[45]] = "Raw giant carp";
        B.llIlIlllI[B.llIlIllll[46]] = "Handing in fish";
        B.llIlIlllI[B.llIlIllll[47]] = "Bonzo";
        B.llIlIlllI[B.llIlIllll[48]] = "Fishing trophy";
        B.llIlIlllI[B.llIlIllll[49]] = "Nav to start";
        B.llIlIlllI[B.llIlIllll[50]] = "Finishing quest";
        B.llIlIlllI[B.llIlIllll[51]] = "Vestri";
        B.llIlIlllI[B.llIlIllll[52]] = "Camelot teleport";
        B.llIlIlllI[B.llIlIllll[53]] = "Garlic";
        B.llIlIlllI[B.llIlIllll[54]] = "Spade";
        B.llIlIlllI[B.llIlIllll[55]] = "Fishing rod";
        B.llIlIlllI[B.llIlIllll[56]] = "Fishing bait";
        B.llIlIlllI[B.llIlIllll[63]] = "Fishing contest";
        B.llIlIlllI[B.llIlIllll[64]] = "ring of wealth (";
        B.llIlIlllI[B.llIlIllll[67]] = "I was wondering what was down those stairs?";
        B.llIlIlllI[B.llIlIllll[68]] = "Why not?";
        B.llIlIlllI[B.llIlIllll[69]] = "If you were my friend I wouldn't mind it.";
        B.llIlIlllI[B.llIlIllll[19]] = "Well, let's be friends!";
        B.llIlIlllI[B.llIlIllll[70]] = "And how am I meant to do that?";
        B.llIlIlllI[B.llIlIllll[71]] = "I'll enter the competition please.";
        B.llIlIlllI[B.llIlIllll[72]] = "I have this big fish. Is it enough to win?";
        B.llIlIlllI[B.llIlIllll[73]] = "Yes.";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIlIllll[1]];
        nArray[B.llIlIllll[2]] = llIlIllll[8];
        if (B.lIllIllIlIIl(Inventory.getCount((int[])nArray))) {
            String[] stringArray = new String[llIlIllll[1]];
            stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[52]];
            if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray))) {
                String[] stringArray2 = new String[llIlIllll[1]];
                stringArray2[B.llIlIllll[2]] = llIlIlllI[llIlIllll[53]];
                if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray2))) {
                    String[] stringArray3 = new String[llIlIllll[1]];
                    stringArray3[B.llIlIllll[2]] = llIlIlllI[llIlIllll[54]];
                    if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray3))) {
                        String[] stringArray4 = new String[llIlIllll[1]];
                        stringArray4[B.llIlIllll[2]] = llIlIlllI[llIlIllll[55]];
                        if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray4))) {
                            String[] stringArray5 = new String[llIlIllll[1]];
                            stringArray5[B.llIlIllll[2]] = llIlIlllI[llIlIllll[56]];
                            if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray5))) {
                                int[] nArray2 = new int[llIlIllll[1]];
                                nArray2[B.llIlIllll[2]] = llIlIllll[17];
                                if (B.lIllIllIlIIl(Inventory.getCount((int[])nArray2)) && B.lIllIllIIllI(Inventory.contains((int[])f.bc) ? 1 : 0)) {
                                    n2 = llIlIllll[1];

                                    if (-2 < 0) return n2 != 0;
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = llIlIllll[2];
        return n2 != 0;
    }

    private static boolean lIllIllIllII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (B.lIllIllIIlIl(e.j(el), llIlIllll[13])) {
            bl = llIlIllll[1];

        } else {
            bl = llIlIllll[2];
        }
        return bl;
    }

    private static boolean lIllIllIlIII(Object object) {
        return object != null;
    }

    private static boolean lIllIllIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIlIll(int n2, int n3) {
        return n2 <= n3;
    }
}

