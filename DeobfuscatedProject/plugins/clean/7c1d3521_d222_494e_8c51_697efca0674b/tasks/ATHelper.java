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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class ATHelper
implements ac {
    public static final  WorldPoint on;
    public static final  WorldPoint oj;
    static  int cG;
    public static final  WorldPoint og;
    static  int oc;
    public static  long oa;
    static  int dF;
    public static  String[] ob;
    public static final  WorldPoint ol;
    public static  boolean bt;
    public static  WorldPoint nY;
    static  int od;
    public static final  WorldPoint oi;
    
    public static final  WorldPoint oh;
    
    static  WorldArea oe;
    public static  List<d> bv;
    public static  WorldPoint nZ;
    public static final  WorldPoint ok;
    public static final  WorldPoint of;
    public static  WorldPoint nX;
    static  int cI;
    public static final  WorldPoint om;

    private static boolean lIlllllIlIIll(int n2) {
        return n2 != 0;
    }

    private static int lIlllllIllIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        at.lIlllllIlIIlI();
        at.lIlllllIIIlII();
        bv = new ArrayList<d>();
        nX = new WorldPoint(lllIIIlIII[55], lllIIIlIII[56], lllIIIlIII[0]);
        nY = new WorldPoint(lllIIIlIII[57], lllIIIlIII[58], lllIIIlIII[0]);
        nZ = new WorldPoint(lllIIIlIII[0], lllIIIlIII[0], lllIIIlIII[0]);
        oa = System.currentTimeMillis();
        String[] stringArray = new String[lllIIIlIII[54]];
        stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[6]];
        stringArray[at.lllIIIlIII[1]] = lllIIIIllI[lllIIIlIII[59]];
        stringArray[at.lllIIIlIII[3]] = lllIIIIllI[lllIIIlIII[60]];
        stringArray[at.lllIIIlIII[4]] = lllIIIIllI[lllIIIlIII[61]];
        stringArray[at.lllIIIlIII[9]] = lllIIIIllI[lllIIIlIII[62]];
        stringArray[at.lllIIIlIII[13]] = lllIIIIllI[lllIIIlIII[63]];
        stringArray[at.lllIIIlIII[18]] = lllIIIIllI[lllIIIlIII[64]];
        stringArray[at.lllIIIlIII[19]] = lllIIIIllI[lllIIIlIII[65]];
        stringArray[at.lllIIIlIII[21]] = lllIIIIllI[lllIIIlIII[66]];
        stringArray[at.lllIIIlIII[22]] = lllIIIIllI[lllIIIlIII[67]];
        stringArray[at.lllIIIlIII[14]] = lllIIIIllI[lllIIIlIII[68]];
        stringArray[at.lllIIIlIII[23]] = lllIIIIllI[lllIIIlIII[69]];
        stringArray[at.lllIIIlIII[24]] = lllIIIIllI[lllIIIlIII[70]];
        stringArray[at.lllIIIlIII[25]] = lllIIIIllI[lllIIIlIII[71]];
        stringArray[at.lllIIIlIII[26]] = lllIIIIllI[lllIIIlIII[72]];
        stringArray[at.lllIIIlIII[17]] = lllIIIIllI[lllIIIlIII[73]];
        stringArray[at.lllIIIlIII[27]] = lllIIIIllI[lllIIIlIII[74]];
        stringArray[at.lllIIIlIII[28]] = lllIIIIllI[lllIIIlIII[75]];
        stringArray[at.lllIIIlIII[30]] = lllIIIIllI[lllIIIlIII[76]];
        stringArray[at.lllIIIlIII[31]] = lllIIIIllI[lllIIIlIII[77]];
        stringArray[at.lllIIIlIII[15]] = lllIIIIllI[lllIIIlIII[78]];
        stringArray[at.lllIIIlIII[32]] = lllIIIIllI[lllIIIlIII[79]];
        stringArray[at.lllIIIlIII[2]] = lllIIIIllI[lllIIIlIII[80]];
        stringArray[at.lllIIIlIII[33]] = lllIIIIllI[lllIIIlIII[81]];
        stringArray[at.lllIIIlIII[34]] = lllIIIIllI[lllIIIlIII[82]];
        stringArray[at.lllIIIlIII[29]] = lllIIIIllI[lllIIIlIII[83]];
        stringArray[at.lllIIIlIII[35]] = lllIIIIllI[lllIIIlIII[84]];
        stringArray[at.lllIIIlIII[36]] = lllIIIIllI[lllIIIlIII[85]];
        stringArray[at.lllIIIlIII[37]] = lllIIIIllI[lllIIIlIII[86]];
        stringArray[at.lllIIIlIII[38]] = lllIIIIllI[lllIIIlIII[87]];
        stringArray[at.lllIIIlIII[40]] = lllIIIIllI[lllIIIlIII[88]];
        stringArray[at.lllIIIlIII[48]] = lllIIIIllI[lllIIIlIII[89]];
        stringArray[at.lllIIIlIII[49]] = lllIIIIllI[lllIIIlIII[90]];
        stringArray[at.lllIIIlIII[50]] = lllIIIIllI[lllIIIlIII[91]];
        stringArray[at.lllIIIlIII[51]] = lllIIIIllI[lllIIIlIII[92]];
        stringArray[at.lllIIIlIII[52]] = lllIIIIllI[lllIIIlIII[93]];
        stringArray[at.lllIIIlIII[53]] = lllIIIIllI[lllIIIlIII[94]];
        ob = stringArray;
        oc = lllIIIlIII[95];
        dF = lllIIIlIII[0];
        cI = e.c(lllIIIlIII[21], lllIIIlIII[2]);
        od = e.c(lllIIIlIII[6], lllIIIlIII[74]);
        cG = lllIIIlIII[1];
        oe = new WorldArea(lllIIIlIII[96], lllIIIlIII[97], lllIIIlIII[2], lllIIIlIII[29], lllIIIlIII[0]);
        of = new WorldPoint(lllIIIlIII[98], lllIIIlIII[99], lllIIIlIII[0]);
        og = new WorldPoint(lllIIIlIII[100], lllIIIlIII[101], lllIIIlIII[0]);
        oh = new WorldPoint(lllIIIlIII[102], lllIIIlIII[103], lllIIIlIII[0]);
        oi = new WorldPoint(lllIIIlIII[104], lllIIIlIII[105], lllIIIlIII[0]);
        oj = new WorldPoint(lllIIIlIII[106], lllIIIlIII[107], lllIIIlIII[0]);
        ok = new WorldPoint(lllIIIlIII[108], lllIIIlIII[109], lllIIIlIII[0]);
        ol = of;
        on = om = og;
    }

    private static boolean lIlllllIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlllllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static int lIllllllIIIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIlllllIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllllIlIlll(int n2) {
        return n2 > 0;
    }

    public static void gn() {
        if (at.lIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
            Inventory.getAll((String[])ob).forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[54]]));
        }
        if (at.lIlllllIlIlIl(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lllIIIlIII[1]];
            nArray[at.lllIIIlIII[0]] = lllIIIlIII[8];
            if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIIlIII[1]];
                nArray2[at.lllIIIlIII[0]] = lllIIIlIII[7];
                if (at.lIlllllIlIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIIIlIII[1]];
                    nArray3[at.lllIIIlIII[0]] = lllIIIlIII[7];
                    if (at.lIlllllIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[lllIIIlIII[1]];
                        nArray4[at.lllIIIlIII[0]] = lllIIIlIII[7];
                        Inventory.getFirst((int[])nArray4).interact(lllIIIIllI[lllIIIlIII[18]]);
                        Time.sleepTicks((int)lllIIIlIII[1]);

                    }
                }
            }
        }
        if (at.lIlllllIllIIl(Players.getLocal().getWorldLocation().distanceTo(ol), lllIIIlIII[17])) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[19]];
            Movement.walkTo((WorldPoint)ol);

            Time.sleepTicks((int)lllIIIlIII[1]);

        }
        if (at.lIlllllIllIll(Players.getLocal().getWorldLocation().distanceTo(ol), lllIIIlIII[17])) {
            if (at.lIlllllIlIlIl(oe.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)ol);

                Time.sleepTicks((int)lllIIIlIII[1]);

            }
            if (at.lIlllllIlIIll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (at.lIlllllIlllII(Players.getLocal().getGraphic(), lllIIIlIII[20])) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[21]];
                String[] stringArray = new String[lllIIIlIII[1]];
                stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[22]];
                if (at.lIlllllIlIllI(NPCs.getNearest((String[])stringArray)) && at.lIlllllIlllIl(Players.getLocal().getInteracting())) {
                    String[] stringArray2 = new String[lllIIIlIII[1]];
                    stringArray2[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[14]];
                    NPCs.getNearest((String[])stringArray2).interact(lllIIIIllI[lllIIIlIII[23]]);
                    Time.sleepTicks((int)lllIIIlIII[1]);

                }
            }
            if (at.lIlllllIllllI(Players.getLocal().getGraphic(), lllIIIlIII[20])) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[24]];
                if (!at.lIlllllIlllll(at.lIlllllIllIlI(e.w(), 70.0)) || at.lIlllllIllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllIIIlIII[9])) {
                    int[] nArray = new int[lllIIIlIII[1]];
                    nArray[at.lllIIIlIII[0]] = lllIIIlIII[8];
                    if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[lllIIIlIII[1]];
                        nArray5[at.lllIIIlIII[0]] = lllIIIlIII[8];
                        Inventory.getFirst((int[])nArray5).interact(lllIIIIllI[lllIIIlIII[25]]);
                        Time.sleepTicks((int)lllIIIlIII[1]);

                    }
                }
                String[] stringArray = new String[lllIIIlIII[1]];
                stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[26]];
                if (at.lIlllllIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllIIIlIII[1]];
                    stringArray3[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[17]];
                    Inventory.getAll((String[])stringArray3).stream().forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[53]]));
                }
                Inventory.getAll((String[])ob).forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[52]]));
            }
        }
    }

    private static boolean lIlllllIlllll(int n2) {
        return n2 >= 0;
    }

    private static boolean lIlllllIllIIl(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[2])) {
            bl = lllIIIlIII[1];

            if (((7 ^ 0x3B ^ (0xF7 ^ 0x9C)) & (112 + 61 - 73 + 47 ^ 93 + 42 - 94 + 155 ^ -1)) >= 1) {
                return ((6 ^ 0x53 ^ (0xCE ^ 0xA0)) & (0xF2 ^ 0xBC ^ (0x7A ^ 0xF) ^ -1)) != 0;
            }
        } else {
            bl = lllIIIlIII[0];
        }
        return bl;
    }

    @Override
    public boolean ae() {
        return lllIIIlIII[0];
    }

    public static void gm() {
        block20: {
            block21: {
                block22: {
                    block26: {
                        block25: {
                            block23: {
                                block24: {
                                    if (at.lIlllllIlIIll(bt ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[0]];
                                        b.a(bv);
                                        if (at.lIlllllIlIlII(bv.size(), lllIIIlIII[1])) {
                                            System.out.println(lllIIIIllI[lllIIIlIII[1]]);
                                            bt = lllIIIlIII[0];
                                        }
                                    }
                                    if (!at.lIlllllIlIlIl(bt ? 1 : 0) || !at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[2])) break block20;
                                    if (!at.lIlllllIlIlIl(at.an() ? 1 : 0)) break block21;
                                    BankLocation var2 = BankLocation.getNearest();
                                    if (at.lIlllllIlIllI(var2) && at.lIlllllIlIlIl(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[3]];
                                        a.a(var2);
                                    }
                                    if (!at.lIlllllIlIllI(var2) || !at.lIlllllIlIIll(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block22;
                                    AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[4]];
                                    if (at.lIlllllIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIlIII[5]);

                                    }
                                    if (!at.lIlllllIlIIll(Bank.isOpen() ? 1 : 0)) break block22;
                                    if (at.lIlllllIlIlll(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIIIlIII[4]);

                                    }
                                    if (!at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) break block23;
                                    int[] nArray = new int[lllIIIlIII[1]];
                                    nArray[at.lllIIIlIII[0]] = lllIIIlIII[7];
                                    if (!at.lIlllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                    int[] nArray2 = new int[lllIIIlIII[1]];
                                    nArray2[at.lllIIIlIII[0]] = lllIIIlIII[8];
                                    if (!at.lIlllllIlIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                }
                                at.Q();
                                System.out.println(lllIIIIllI[lllIIIlIII[9]]);
                                bt = lllIIIlIII[1];
                                return;
                            }
                            int[] nArray = new int[lllIIIlIII[1]];
                            nArray[at.lllIIIlIII[0]] = lllIIIlIII[10];
                            if (!at.lIlllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                            int[] nArray3 = new int[lllIIIlIII[1]];
                            nArray3[at.lllIIIlIII[0]] = lllIIIlIII[11];
                            if (!at.lIlllllIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) break block25;
                            int[] nArray4 = new int[lllIIIlIII[1]];
                            nArray4[at.lllIIIlIII[0]] = lllIIIlIII[12];
                            if (!at.lIlllllIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                        }
                        at.Q();
                        System.out.println(lllIIIIllI[lllIIIlIII[13]]);
                        bt = lllIIIlIII[1];
                        return;
                    }
                    if (at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13])) {
                        a.a(lllIIIlIII[11], lllIIIlIII[13]);
                        a.a(lllIIIlIII[10], lllIIIlIII[13]);
                        a.a(lllIIIlIII[12], lllIIIlIII[14]);
                    }
                    if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13]) && at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                        a.a(lllIIIlIII[10], lllIIIlIII[13]);
                    }
                    if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                        a.a(lllIIIlIII[7], lllIIIlIII[13]);
                        a.a(lllIIIlIII[8], lllIIIlIII[15]);
                        a.a(lllIIIlIII[16], lllIIIlIII[15]);
                    }
                    cG += lllIIIlIII[1];
                }
                if (at.lIlllllIllIIl(Inventory.getFreeSlots(), lllIIIlIII[17])) {
                    cG += lllIIIlIII[1];
                }
            }
            if (at.lIlllllIlIIll(at.an() ? 1 : 0) && at.lIlllllIlIlll(cG)) {
                if (at.lIlllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13])) {
                    at.go();
                }
                if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13]) && at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                    at.gp();
                }
                if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                    at.gn();
                }
            }
        }
    }

    @Override
    public int af() {
        at.gm();
        return lllIIIlIII[47];
    }

    private static boolean lIlllllIlllIl(Object object) {
        return object == null;
    }

    private static int lIllllllIIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean fN() {
        return lllIIIlIII[0];
    }

    private static boolean lIlllllIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlllllIIIlII() {
        lllIIIIllI = new String[lllIIIlIII[110]];
        at.lllIIIIllI[at.lllIIIlIII[0]] = "Buying items";
        at.lllIIIIllI[at.lllIIIlIII[1]] = "Finished buying items, switching back to mining";
        at.lllIIIIllI[at.lllIIIlIII[3]] = "Navigating to bank";
        at.lllIIIIllI[at.lllIIIlIII[4]] = "Handling banking";
        at.lllIIIIllI[at.lllIIIlIII[9]] = "We are missing supplies, switching to BUYING";
        at.lllIIIIllI[at.lllIIIlIII[13]] = "We are missing supplies, switching to BUYING";
        at.lllIIIIllI[at.lllIIIlIII[18]] = "Wear";
        at.lllIIIIllI[at.lllIIIlIII[19]] = "Nav to farmer";
        at.lllIIIIllI[at.lllIIIlIII[21]] = "Pickpocketing";
        at.lllIIIIllI[at.lllIIIlIII[22]] = "Master Farmer";
        at.lllIIIIllI[at.lllIIIlIII[14]] = "Master Farmer";
        at.lllIIIIllI[at.lllIIIlIII[23]] = "Pickpocket";
        at.lllIIIIllI[at.lllIIIlIII[24]] = "Stunned";
        at.lllIIIIllI[at.lllIIIlIII[25]] = "Drink";
        at.lllIIIIllI[at.lllIIIlIII[26]] = "Jug";
        at.lllIIIIllI[at.lllIIIlIII[17]] = "Jug";
        at.lllIIIIllI[at.lllIIIlIII[27]] = "Nav to men";
        at.lllIIIIllI[at.lllIIIlIII[28]] = "Pickpocketing";
        at.lllIIIIllI[at.lllIIIlIII[30]] = "Open-all";
        at.lllIIIIllI[at.lllIIIlIII[31]] = "Man";
        at.lllIIIIllI[at.lllIIIlIII[15]] = "Man";
        at.lllIIIIllI[at.lllIIIlIII[32]] = "Pickpocket";
        at.lllIIIIllI[at.lllIIIlIII[2]] = "Stunned";
        at.lllIIIIllI[at.lllIIIlIII[33]] = "Eat";
        at.lllIIIIllI[at.lllIIIlIII[34]] = "Nav to tea tile";
        at.lllIIIIllI[at.lllIIIlIII[29]] = "Open-all";
        at.lllIIIIllI[at.lllIIIlIII[35]] = "Stealing";
        at.lllIIIIllI[at.lllIIIlIII[36]] = "Tea stall";
        at.lllIIIIllI[at.lllIIIlIII[37]] = "Tea stall";
        at.lllIIIIllI[at.lllIIIlIII[38]] = "Steal-from";
        at.lllIIIIllI[at.lllIIIlIII[40]] = "Dropping";
        at.lllIIIIllI[at.lllIIIlIII[48]] = "Thieving";
        at.lllIIIIllI[at.lllIIIlIII[49]] = "Drop";
        at.lllIIIIllI[at.lllIIIlIII[50]] = "Drop";
        at.lllIIIIllI[at.lllIIIlIII[51]] = "Tea stall";
        at.lllIIIIllI[at.lllIIIlIII[52]] = "Drop";
        at.lllIIIIllI[at.lllIIIlIII[53]] = "Drop";
        at.lllIIIIllI[at.lllIIIlIII[54]] = "Drop";
        at.lllIIIIllI[at.lllIIIlIII[6]] = "Onion seed";
        at.lllIIIIllI[at.lllIIIlIII[59]] = "Marigold seed";
        at.lllIIIIllI[at.lllIIIlIII[60]] = "Cabbage seed";
        at.lllIIIIllI[at.lllIIIlIII[61]] = "Jute seed";
        at.lllIIIIllI[at.lllIIIlIII[62]] = "Potato seed";
        at.lllIIIIllI[at.lllIIIlIII[63]] = "Tomato seed";
        at.lllIIIIllI[at.lllIIIlIII[64]] = "Nasturtium seed";
        at.lllIIIIllI[at.lllIIIlIII[65]] = "Holy handegg";
        at.lllIIIIllI[at.lllIIIlIII[66]] = "Peaceful handegg";
        at.lllIIIIllI[at.lllIIIlIII[67]] = "Chaotic handegg";
        at.lllIIIIllI[at.lllIIIlIII[68]] = "Sweetcorn seed";
        at.lllIIIIllI[at.lllIIIlIII[69]] = "Woad seed";
        at.lllIIIIllI[at.lllIIIlIII[70]] = "Redberry seed";
        at.lllIIIIllI[at.lllIIIlIII[71]] = "Jangerberry seed";
        at.lllIIIIllI[at.lllIIIlIII[72]] = "Tarromin seed";
        at.lllIIIIllI[at.lllIIIlIII[73]] = "Rosemary seed";
        at.lllIIIIllI[at.lllIIIlIII[74]] = "Strawberry seed";
        at.lllIIIIllI[at.lllIIIlIII[75]] = "Hammerstone seed";
        at.lllIIIIllI[at.lllIIIlIII[76]] = "Asgarnian seed";
        at.lllIIIIllI[at.lllIIIlIII[77]] = "Yanillian seed";
        at.lllIIIIllI[at.lllIIIlIII[78]] = "Krandorian seed";
        at.lllIIIIllI[at.lllIIIlIII[79]] = "Wildblood seed";
        at.lllIIIIllI[at.lllIIIlIII[80]] = "Marigold seed";
        at.lllIIIIllI[at.lllIIIlIII[81]] = "Rosemary seed";
        at.lllIIIIllI[at.lllIIIlIII[82]] = "Cadavaberry seed";
        at.lllIIIIllI[at.lllIIIlIII[83]] = "Dwellberry seed";
        at.lllIIIIllI[at.lllIIIlIII[84]] = "Jangerberry seed";
        at.lllIIIIllI[at.lllIIIlIII[85]] = "Poison ivy seed";
        at.lllIIIIllI[at.lllIIIlIII[86]] = "Guam seed";
        at.lllIIIIllI[at.lllIIIlIII[87]] = "Marrentill seed";
        at.lllIIIIllI[at.lllIIIlIII[88]] = "Tarromin seed";
        at.lllIIIIllI[at.lllIIIlIII[89]] = "Harralander seed";
        at.lllIIIIllI[at.lllIIIlIII[90]] = "Mushroom spore";
        at.lllIIIIllI[at.lllIIIlIII[91]] = "Belladonna seed";
        at.lllIIIIllI[at.lllIIIlIII[92]] = "Cactus seed";
        at.lllIIIIllI[at.lllIIIlIII[93]] = "Potato cactus seed";
        at.lllIIIIllI[at.lllIIIlIII[94]] = "Jug";
    }

    @Override
    public String ag() {
        return lllIIIIllI[lllIIIlIII[48]];
    }

    private static boolean lIlllllIlIllI(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block7: {
            block8: {
                if (at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13])) {
                    int n3;
                    int[] nArray = new int[lllIIIlIII[1]];
                    nArray[at.lllIIIlIII[0]] = lllIIIlIII[12];
                    if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIIIlIII[1]];
                        nArray2[at.lllIIIlIII[0]] = lllIIIlIII[11];
                        int[] nArray3 = new int[lllIIIlIII[1]];
                        nArray3[at.lllIIIlIII[0]] = lllIIIlIII[10];
                        if (at.lIlllllIlIIll(Inventory.contains((int[])nArray2) & Inventory.contains((int[])nArray3)) && at.lIlllllIlIlll(cG)) {
                            n3 = lllIIIlIII[1];

                            if (-1 < 0) return n3 != 0;
                            return false;
                        }
                    }
                    n3 = lllIIIlIII[0];
                    return n3 != 0;
                }
                if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13]) && at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                    return lllIIIlIII[1];
                }
                if (!at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) return lllIIIlIII[0];
                int[] nArray = new int[lllIIIlIII[1]];
                nArray[at.lllIIIlIII[0]] = lllIIIlIII[8];
                if (!at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray4 = new int[lllIIIlIII[1]];
                nArray4[at.lllIIIlIII[0]] = lllIIIlIII[7];
                if (!at.lIlllllIlIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block8;
                int[] nArray5 = new int[lllIIIlIII[1]];
                nArray5[at.lllIIIlIII[0]] = lllIIIlIII[7];
                if (!at.lIlllllIlIIll(Equipment.contains((int[])nArray5) ? 1 : 0)) break block7;
            }
            n2 = lllIIIlIII[1];

            if (((0x28 ^ 0x4F ^ (0xDC ^ 0x91)) & (89 + 103 - 58 + 22 ^ 6 + 40 - -130 + 6 ^ -1)) == 0) return n2 != 0;
            return ((0xF2 ^ 0xB8 ^ (0x78 ^ 0x75)) & (204 + 95 - 204 + 143 ^ 64 + 148 - 208 + 165 ^ -1) & ((0x6D ^ 0x5D ^ (0x5F ^ 0x51)) & (8 + 176 - 44 + 39 ^ 66 + 89 - 146 + 132 ^ -1) ^ -1)) != 0;
        }
        n2 = lllIIIlIII[0];
        return n2 != 0;
    }

    private static void go() {
        if (at.lIlllllIllIIl(Players.getLocal().getWorldLocation().distanceTo(nX), lllIIIlIII[17])) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[27]];
            Movement.walkTo((WorldPoint)nX);

            Time.sleepTicks((int)lllIIIlIII[1]);

        }
        if (at.lIlllllIllIll(Players.getLocal().getWorldLocation().distanceTo(nX), lllIIIlIII[17])) {
            if (at.lIlllllIlIIll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (at.lIlllllIlllll(at.lIllllllIIIII(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[28]];
                int[] nArray = new int[lllIIIlIII[1]];
                nArray[at.lllIIIlIII[0]] = oc;
                if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllIIIlIII[1]];
                    nArray2[at.lllIIIlIII[0]] = oc;
                    if (at.lIlllllIllIII(Inventory.getFirst((int[])nArray2).getQuantity(), lllIIIlIII[29])) {
                        int[] nArray3 = new int[lllIIIlIII[1]];
                        nArray3[at.lllIIIlIII[0]] = oc;
                        Inventory.getFirst((int[])nArray3).interact(lllIIIIllI[lllIIIlIII[30]]);
                        Time.sleepTicks((int)lllIIIlIII[1]);

                    }
                }
                String[] stringArray = new String[lllIIIlIII[1]];
                stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[31]];
                if (at.lIlllllIlIllI(NPCs.getNearest((String[])stringArray)) && at.lIlllllIlllIl(Players.getLocal().getInteracting()) && at.lIlllllIlIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIIIlIII[1]];
                    stringArray2[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[15]];
                    NPCs.getNearest((String[])stringArray2).interact(lllIIIIllI[lllIIIlIII[32]]);
                    Time.sleepTicks((int)lllIIIlIII[1]);

                }
            }
            if (at.lIllllllIIIlI(at.lIllllllIIIII(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[2]];
                if (!at.lIlllllIlllll(at.lIllllllIIIIl(e.w(), 30.0)) || at.lIlllllIllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllIIIlIII[9])) {
                    int[] nArray = new int[lllIIIlIII[1]];
                    nArray[at.lllIIIlIII[0]] = lllIIIlIII[12];
                    if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lllIIIlIII[1]];
                        nArray4[at.lllIIIlIII[0]] = lllIIIlIII[12];
                        Inventory.getFirst((int[])nArray4).interact(lllIIIIllI[lllIIIlIII[33]]);
                        Time.sleepTicks((int)lllIIIlIII[1]);

                    }
                }
            }
        }
    }

    private static boolean lIllllllIIIlI(int n2) {
        return n2 <= 0;
    }

    public static void Q() {
        d var3;
        int[] nArray = new int[lllIIIlIII[1]];
        nArray[at.lllIIIlIII[0]] = lllIIIlIII[10];
        if (at.lIlllllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIIIlIII[10], lllIIIlIII[14], lllIIIlIII[42]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lllIIIlIII[1]];
        nArray2[at.lllIIIlIII[0]] = lllIIIlIII[11];
        if (at.lIlllllIlIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var3 = new DHelper(lllIIIlIII[11], lllIIIlIII[14], lllIIIlIII[42]);
            bv.add(var3);

        }
        int[] nArray3 = new int[lllIIIlIII[1]];
        nArray3[at.lllIIIlIII[0]] = lllIIIlIII[12];
        if (at.lIlllllIlIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var3 = new DHelper(lllIIIlIII[12], lllIIIlIII[40], lllIIIlIII[43]);
            bv.add(var3);

        }
        int[] nArray4 = new int[lllIIIlIII[1]];
        nArray4[at.lllIIIlIII[0]] = lllIIIlIII[44];
        if (at.lIlllllIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var3 = new DHelper(lllIIIlIII[44], lllIIIlIII[13], j.cf);
            bv.add(var3);

        }
        if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
            int[] nArray5 = new int[lllIIIlIII[1]];
            nArray5[at.lllIIIlIII[0]] = lllIIIlIII[8];
            if (at.lIlllllIlIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var3 = new DHelper(lllIIIlIII[8], lllIIIlIII[45], lllIIIlIII[21]);
                bv.add(var3);

            }
            int[] nArray6 = new int[lllIIIlIII[1]];
            nArray6[at.lllIIIlIII[0]] = lllIIIlIII[7];
            if (at.lIlllllIlIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var3 = new DHelper(lllIIIlIII[7], lllIIIlIII[43], lllIIIlIII[46]);
                bv.add(var3);

            }
        }
    }

    private static boolean lIlllllIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void gp() {
        if (at.lIlllllIlIlIl(Players.getLocal().getWorldLocation().equals((Object)nY) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[34]];
            if (at.lIlllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)nY);

            Time.sleepTicks((int)lllIIIlIII[1]);

        }
        if (at.lIlllllIlIIll(Players.getLocal().getWorldLocation().equals((Object)nY) ? 1 : 0)) {
            int[] nArray = new int[lllIIIlIII[1]];
            nArray[at.lllIIIlIII[0]] = oc;
            if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIIlIII[1]];
                nArray2[at.lllIIIlIII[0]] = oc;
                Inventory.getFirst((int[])nArray2).interact(lllIIIIllI[lllIIIlIII[29]]);
                Time.sleepTicks((int)lllIIIlIII[1]);

            }
            if (at.lIlllllIlIlIl(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[35]];
                String[] stringArray = new String[lllIIIlIII[1]];
                stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[36]];
                if (at.lIlllllIlIllI(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[lllIIIlIII[1]];
                    stringArray2[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[37]];
                    TileObjects.getNearest((String[])stringArray2).interact(lllIIIIllI[lllIIIlIII[38]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIIlIII[1]];
                        stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[51]];
                        if (at.lIlllllIlllIl(TileObjects.getNearest((String[])stringArray))) {
                            bl = lllIIIlIII[1];

                            if (-1 >= 1) {
                                return false;
                            }
                        } else {
                            bl = lllIIIlIII[0];
                        }
                        return bl;
                    }, (int)lllIIIlIII[39]);

                }
            }
            if (at.lIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[40]];
                int[] nArray3 = new int[lllIIIlIII[1]];
                nArray3[at.lllIIIlIII[0]] = lllIIIlIII[41];
                Inventory.getAll((int[])nArray3).forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[50]]));
                int[] nArray4 = new int[lllIIIlIII[1]];
                nArray4[at.lllIIIlIII[0]] = lllIIIlIII[12];
                if (at.lIlllllIlIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lllIIIlIII[1]];
                    nArray5[at.lllIIIlIII[0]] = lllIIIlIII[12];
                    Inventory.getAll((int[])nArray5).forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[49]]));
                }
            }
        }
    }
}

