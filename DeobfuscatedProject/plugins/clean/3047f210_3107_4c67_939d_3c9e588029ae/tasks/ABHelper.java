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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.account.AccBuilderTempleTrek;
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

public class ABHelper
implements S {
    public static final  WorldPoint jI;
    public static  WorldPoint jC;
    
    static  int dg;
    public static final  WorldPoint jL;
    public static final  WorldPoint jM;
    public static  long jD;
    public static final  WorldPoint jN;
    
    public static final  WorldPoint jK;
    public static final  WorldPoint jQ;
    static  int bS;
    public static  List<d> bu;
    static  int bU;
    static  WorldArea jH;
    public static  WorldPoint jA;
    public static  WorldPoint jB;
    public static final  WorldPoint jJ;
    public static  boolean bs;
    public static final  WorldPoint jP;
    static  int jG;
    static  int jF;
    public static  String[] jE;
    public static final  WorldPoint jO;

    public static void eE() {
        if (ab.llIlIIllIllIl(Inventory.isFull() ? 1 : 0)) {
            Inventory.getAll((String[])jE).forEach(item -> item.interact(lllllIIllI[lllllIIlll[56]]));
        }
        if (ab.llIlIIllIllll(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lllllIIlll[1]];
            nArray[ab.lllllIIlll[0]] = lllllIIlll[7];
            if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIIlll[1]];
                nArray2[ab.lllllIIlll[0]] = lllllIIlll[6];
                if (ab.llIlIIllIllll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lllllIIlll[1]];
                    nArray3[ab.lllllIIlll[0]] = lllllIIlll[6];
                    if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[lllllIIlll[1]];
                        nArray4[ab.lllllIIlll[0]] = lllllIIlll[6];
                        Inventory.getFirst((int[])nArray4).interact(lllllIIllI[lllllIIlll[17]]);
                        Time.sleepTicks((int)lllllIIlll[1]);

                    }
                }
            }
        }
        if (ab.llIlIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(jO), lllllIIlll[16])) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[18]];
            Movement.walkTo((WorldPoint)jO);

            Time.sleepTicks((int)lllllIIlll[1]);

        }
        if (ab.llIlIIlllIlIl(Players.getLocal().getWorldLocation().distanceTo(jO), lllllIIlll[16])) {
            if (ab.llIlIIllIllll(jH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)jO);

                Time.sleepTicks((int)lllllIIlll[1]);

            }
            if (ab.llIlIIllIllIl(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (ab.llIlIIlllIllI(Players.getLocal().getGraphic(), lllllIIlll[19])) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[20]];
                String[] stringArray = new String[lllllIIlll[1]];
                stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[21]];
                if (ab.llIlIIlllIIII(NPCs.getNearest((String[])stringArray)) && ab.llIlIIlllIlll(Players.getLocal().getInteracting())) {
                    String[] stringArray2 = new String[lllllIIlll[1]];
                    stringArray2[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[13]];
                    NPCs.getNearest((String[])stringArray2).interact(lllllIIllI[lllllIIlll[22]]);
                    Time.sleepTicks((int)lllllIIlll[1]);

                }
            }
            if (ab.llIlIIllllIII(Players.getLocal().getGraphic(), lllllIIlll[19])) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[23]];
                if (!ab.llIlIIllllIIl(ab.llIlIIlllIlII(e.u(), 70.0)) || ab.llIlIIlllIlIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllllIIlll[8])) {
                    int[] nArray = new int[lllllIIlll[1]];
                    nArray[ab.lllllIIlll[0]] = lllllIIlll[7];
                    if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[lllllIIlll[1]];
                        nArray5[ab.lllllIIlll[0]] = lllllIIlll[7];
                        Inventory.getFirst((int[])nArray5).interact(lllllIIllI[lllllIIlll[24]]);
                        Time.sleepTicks((int)lllllIIlll[1]);

                    }
                }
                String[] stringArray = new String[lllllIIlll[1]];
                stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[25]];
                if (ab.llIlIIllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllllIIlll[1]];
                    stringArray3[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[16]];
                    Inventory.getAll((String[])stringArray3).stream().forEach(item -> item.interact(lllllIIllI[lllllIIlll[55]]));
                }
                Inventory.getAll((String[])jE).forEach(item -> item.interact(lllllIIllI[lllllIIlll[54]]));
            }
        }
    }

    public static void eD() {
        block20: {
            block21: {
                block22: {
                    block26: {
                        block25: {
                            block23: {
                                block24: {
                                    if (ab.llIlIIllIllIl(bs ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[0]];
                                        b.a(bu);
                                        if (ab.llIlIIllIlllI(bu.size(), lllllIIlll[1])) {
                                            System.out.println(lllllIIllI[lllllIIlll[1]]);
                                            bs = lllllIIlll[0];
                                        }
                                    }
                                    if (!ab.llIlIIllIllll(bs ? 1 : 0)) break block20;
                                    if (!ab.llIlIIllIllll(ab.aa() ? 1 : 0)) break block21;
                                    BankLocation var1 = BankLocation.getNearest();
                                    if (ab.llIlIIlllIIII(var1) && ab.llIlIIllIllll(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[2]];
                                        a.a(var1);
                                    }
                                    if (!ab.llIlIIlllIIII(var1) || !ab.llIlIIllIllIl(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block22;
                                    AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[3]];
                                    if (ab.llIlIIllIllll(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIIlll[4]);

                                    }
                                    if (!ab.llIlIIllIllIl(Bank.isOpen() ? 1 : 0)) break block22;
                                    if (ab.llIlIIlllIIIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllllIIlll[3]);

                                    }
                                    if (!ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) break block23;
                                    int[] nArray = new int[lllllIIlll[1]];
                                    nArray[ab.lllllIIlll[0]] = lllllIIlll[6];
                                    if (!ab.llIlIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                    int[] nArray2 = new int[lllllIIlll[1]];
                                    nArray2[ab.lllllIIlll[0]] = lllllIIlll[7];
                                    if (!ab.llIlIIllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                }
                                ab.ae();
                                System.out.println(lllllIIllI[lllllIIlll[8]]);
                                bs = lllllIIlll[1];
                                return;
                            }
                            int[] nArray = new int[lllllIIlll[1]];
                            nArray[ab.lllllIIlll[0]] = lllllIIlll[9];
                            if (!ab.llIlIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                            int[] nArray3 = new int[lllllIIlll[1]];
                            nArray3[ab.lllllIIlll[0]] = lllllIIlll[10];
                            if (!ab.llIlIIllIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block25;
                            int[] nArray4 = new int[lllllIIlll[1]];
                            nArray4[ab.lllllIIlll[0]] = lllllIIlll[11];
                            if (!ab.llIlIIllIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                        }
                        ab.ae();
                        System.out.println(lllllIIllI[lllllIIlll[12]]);
                        bs = lllllIIlll[1];
                        return;
                    }
                    if (ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12])) {
                        a.a(lllllIIlll[10], lllllIIlll[12]);
                        a.a(lllllIIlll[9], lllllIIlll[12]);
                        a.a(lllllIIlll[11], lllllIIlll[13]);
                    }
                    if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12]) && ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                        a.a(lllllIIlll[9], lllllIIlll[12]);
                    }
                    if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                        a.a(lllllIIlll[6], lllllIIlll[12]);
                        a.a(lllllIIlll[7], lllllIIlll[14]);
                        a.a(lllllIIlll[15], lllllIIlll[14]);
                    }
                    bS += lllllIIlll[1];
                }
                if (ab.llIlIIlllIIll(Inventory.getFreeSlots(), lllllIIlll[16])) {
                    bS += lllllIIlll[1];
                }
            }
            if (ab.llIlIIllIllIl(ab.aa() ? 1 : 0) && ab.llIlIIlllIIIl(bS)) {
                if (ab.llIlIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12])) {
                    ab.eF();
                }
                if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12]) && ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                    ab.eG();
                }
                if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                    ab.eE();
                }
            }
        }
    }

    private static boolean llIlIIllllIIl(int n2) {
        return n2 >= 0;
    }

    private static boolean llIlIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static int llIlIIllllIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public static void ae() {
        d var2;
        int[] nArray = new int[lllllIIlll[1]];
        nArray[ab.lllllIIlll[0]] = lllllIIlll[9];
        if (ab.llIlIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllllIIlll[9], lllllIIlll[13], lllllIIlll[43]);
            bu.add(d2);

        }
        int[] nArray2 = new int[lllllIIlll[1]];
        nArray2[ab.lllllIIlll[0]] = lllllIIlll[10];
        if (ab.llIlIIllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lllllIIlll[10], lllllIIlll[13], lllllIIlll[43]);
            bu.add(var2);

        }
        int[] nArray3 = new int[lllllIIlll[1]];
        nArray3[ab.lllllIIlll[0]] = lllllIIlll[11];
        if (ab.llIlIIllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lllllIIlll[11], lllllIIlll[40], lllllIIlll[44]);
            bu.add(var2);

        }
        int[] nArray4 = new int[lllllIIlll[1]];
        nArray4[ab.lllllIIlll[0]] = lllllIIlll[45];
        if (ab.llIlIIllIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(lllllIIlll[45], lllllIIlll[12], i.bp);
            bu.add(var2);

        }
        if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
            int[] nArray5 = new int[lllllIIlll[1]];
            nArray5[ab.lllllIIlll[0]] = lllllIIlll[7];
            if (ab.llIlIIllIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var2 = new DHelper(lllllIIlll[7], lllllIIlll[46], lllllIIlll[20]);
                bu.add(var2);

            }
            int[] nArray6 = new int[lllllIIlll[1]];
            nArray6[ab.lllllIIlll[0]] = lllllIIlll[6];
            if (ab.llIlIIllIllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var2 = new DHelper(lllllIIlll[6], lllllIIlll[44], lllllIIlll[47]);
                bu.add(var2);

            }
        }
    }

    @Override
    public String U() {
        return lllllIIllI[lllllIIlll[49]];
    }

    private static void eG() {
        if (ab.llIlIIllIllll(Players.getLocal().getWorldLocation().equals((Object)jB) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[34]];
            if (ab.llIlIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)jB);

            Time.sleepTicks((int)lllllIIlll[1]);

        }
        if (ab.llIlIIllIllIl(Players.getLocal().getWorldLocation().equals((Object)jB) ? 1 : 0)) {
            int[] nArray = new int[lllllIIlll[1]];
            nArray[ab.lllllIIlll[0]] = jF;
            if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIIlll[1]];
                nArray2[ab.lllllIIlll[0]] = jF;
                Inventory.getFirst((int[])nArray2).interact(lllllIIllI[lllllIIlll[28]]);
                Time.sleepTicks((int)lllllIIlll[1]);

            }
            if (ab.llIlIIllIllll(Inventory.isFull() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[35]];
                String[] stringArray = new String[lllllIIlll[1]];
                stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[36]];
                if (ab.llIlIIlllIIII(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[lllllIIlll[1]];
                    stringArray2[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[37]];
                    TileObjects.getNearest((String[])stringArray2).interact(lllllIIllI[lllllIIlll[38]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllllIIlll[1]];
                        stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[53]];
                        if (ab.llIlIIlllIlll(TileObjects.getNearest((String[])stringArray))) {
                            bl = lllllIIlll[1];

                            }
                        } else {
                            bl = lllllIIlll[0];
                        }
                        return bl;
                    }, (int)lllllIIlll[39]);

                }
            }
            if (ab.llIlIIllIllIl(Inventory.isFull() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[40]];
                int[] nArray3 = new int[lllllIIlll[2]];
                nArray3[ab.lllllIIlll[0]] = lllllIIlll[41];
                nArray3[ab.lllllIIlll[1]] = lllllIIlll[42];
                Inventory.getAll((int[])nArray3).forEach(item -> item.interact(lllllIIllI[lllllIIlll[52]]));
                int[] nArray4 = new int[lllllIIlll[1]];
                nArray4[ab.lllllIIlll[0]] = lllllIIlll[11];
                if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lllllIIlll[1]];
                    nArray5[ab.lllllIIlll[0]] = lllllIIlll[11];
                    Inventory.getAll((int[])nArray5).forEach(item -> item.interact(lllllIIllI[lllllIIlll[51]]));
                }
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[50])) {
            bl = lllllIIlll[1];

            if ((0x7C ^ 0x78) <= ((0x65 ^ 0x32) & ~(0xF1 ^ 0xA6))) {
                return false;
            }
        } else {
            bl = lllllIIlll[0];
        }
        return bl;
    }

    private static boolean llIlIIlllIlll(Object object) {
        return object == null;
    }

    static {
        ab.llIlIIllIllII();
        ab.llIlIIllIlIll();
        bu = new ArrayList<d>();
        jA = new WorldPoint(lllllIIlll[57], lllllIIlll[58], lllllIIlll[0]);
        jB = new WorldPoint(lllllIIlll[59], lllllIIlll[60], lllllIIlll[0]);
        jC = new WorldPoint(lllllIIlll[0], lllllIIlll[0], lllllIIlll[0]);
        jD = System.currentTimeMillis();
        String[] stringArray = new String[lllllIIlll[56]];
        stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[5]];
        stringArray[ab.lllllIIlll[1]] = lllllIIllI[lllllIIlll[61]];
        stringArray[ab.lllllIIlll[2]] = lllllIIllI[lllllIIlll[62]];
        stringArray[ab.lllllIIlll[3]] = lllllIIllI[lllllIIlll[63]];
        stringArray[ab.lllllIIlll[8]] = lllllIIllI[lllllIIlll[64]];
        stringArray[ab.lllllIIlll[12]] = lllllIIllI[lllllIIlll[65]];
        stringArray[ab.lllllIIlll[17]] = lllllIIllI[lllllIIlll[66]];
        stringArray[ab.lllllIIlll[18]] = lllllIIllI[lllllIIlll[67]];
        stringArray[ab.lllllIIlll[20]] = lllllIIllI[lllllIIlll[68]];
        stringArray[ab.lllllIIlll[21]] = lllllIIllI[lllllIIlll[69]];
        stringArray[ab.lllllIIlll[13]] = lllllIIllI[lllllIIlll[70]];
        stringArray[ab.lllllIIlll[22]] = lllllIIllI[lllllIIlll[71]];
        stringArray[ab.lllllIIlll[23]] = lllllIIllI[lllllIIlll[72]];
        stringArray[ab.lllllIIlll[24]] = lllllIIllI[lllllIIlll[73]];
        stringArray[ab.lllllIIlll[25]] = lllllIIllI[lllllIIlll[74]];
        stringArray[ab.lllllIIlll[16]] = lllllIIllI[lllllIIlll[75]];
        stringArray[ab.lllllIIlll[26]] = lllllIIllI[lllllIIlll[76]];
        stringArray[ab.lllllIIlll[27]] = lllllIIllI[lllllIIlll[77]];
        stringArray[ab.lllllIIlll[29]] = lllllIIllI[lllllIIlll[78]];
        stringArray[ab.lllllIIlll[30]] = lllllIIllI[lllllIIlll[79]];
        stringArray[ab.lllllIIlll[14]] = lllllIIllI[lllllIIlll[80]];
        stringArray[ab.lllllIIlll[31]] = lllllIIllI[lllllIIlll[81]];
        stringArray[ab.lllllIIlll[32]] = lllllIIllI[lllllIIlll[82]];
        stringArray[ab.lllllIIlll[33]] = lllllIIllI[lllllIIlll[83]];
        stringArray[ab.lllllIIlll[34]] = lllllIIllI[lllllIIlll[84]];
        stringArray[ab.lllllIIlll[28]] = lllllIIllI[lllllIIlll[85]];
        stringArray[ab.lllllIIlll[35]] = lllllIIllI[lllllIIlll[86]];
        stringArray[ab.lllllIIlll[36]] = lllllIIllI[lllllIIlll[87]];
        stringArray[ab.lllllIIlll[37]] = lllllIIllI[lllllIIlll[88]];
        stringArray[ab.lllllIIlll[38]] = lllllIIllI[lllllIIlll[89]];
        stringArray[ab.lllllIIlll[40]] = lllllIIllI[lllllIIlll[90]];
        stringArray[ab.lllllIIlll[49]] = lllllIIllI[lllllIIlll[91]];
        stringArray[ab.lllllIIlll[51]] = lllllIIllI[lllllIIlll[92]];
        stringArray[ab.lllllIIlll[52]] = lllllIIllI[lllllIIlll[93]];
        stringArray[ab.lllllIIlll[53]] = lllllIIllI[lllllIIlll[94]];
        stringArray[ab.lllllIIlll[54]] = lllllIIllI[lllllIIlll[95]];
        stringArray[ab.lllllIIlll[55]] = lllllIIllI[lllllIIlll[96]];
        jE = stringArray;
        jF = lllllIIlll[97];
        dg = lllllIIlll[0];
        bU = e.c(lllllIIlll[20], lllllIIlll[32]);
        jG = e.c(lllllIIlll[5], lllllIIlll[76]);
        bS = lllllIIlll[1];
        jH = new WorldArea(lllllIIlll[98], lllllIIlll[99], lllllIIlll[32], lllllIIlll[28], lllllIIlll[0]);
        jI = new WorldPoint(lllllIIlll[100], lllllIIlll[101], lllllIIlll[0]);
        jJ = new WorldPoint(lllllIIlll[102], lllllIIlll[103], lllllIIlll[0]);
        jK = new WorldPoint(lllllIIlll[104], lllllIIlll[105], lllllIIlll[0]);
        jL = new WorldPoint(lllllIIlll[106], lllllIIlll[107], lllllIIlll[0]);
        jM = new WorldPoint(lllllIIlll[108], lllllIIlll[109], lllllIIlll[0]);
        jN = new WorldPoint(lllllIIlll[110], lllllIIlll[111], lllllIIlll[0]);
        jO = jI;
        jQ = jP = jJ;
    }

    private static int llIlIIlllIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIlIIlllIIIl(int n2) {
        return n2 > 0;
    }

        return String.valueOf(var3);
    }

    @Override
    public int T() {
        ab.eD();
        return lllllIIlll[48];
    }

    private static int llIlIIllllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean S() {
        return lllllIIlll[0];
    }

    private static boolean llIlIIlllllII(int n2) {
        return n2 <= 0;
    }

    private static boolean llIlIIlllIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIlIIllIlIll() {
        lllllIIllI = new String[lllllIIlll[112]];
        ab.lllllIIllI[ab.lllllIIlll[0]] = "Buying items";
        ab.lllllIIllI[ab.lllllIIlll[1]] = "Finished buying items, switching back to mining";
        ab.lllllIIllI[ab.lllllIIlll[2]] = "Navigating to bank";
        ab.lllllIIllI[ab.lllllIIlll[3]] = "Handling banking";
        ab.lllllIIllI[ab.lllllIIlll[8]] = "We are missing supplies, switching to BUYING";
        ab.lllllIIllI[ab.lllllIIlll[12]] = "We are missing supplies, switching to BUYING";
        ab.lllllIIllI[ab.lllllIIlll[17]] = "Wear";
        ab.lllllIIllI[ab.lllllIIlll[18]] = "Nav to farmer";
        ab.lllllIIllI[ab.lllllIIlll[20]] = "Pickpocketing";
        ab.lllllIIllI[ab.lllllIIlll[21]] = "Master Farmer";
        ab.lllllIIllI[ab.lllllIIlll[13]] = "Master Farmer";
        ab.lllllIIllI[ab.lllllIIlll[22]] = "Pickpocket";
        ab.lllllIIllI[ab.lllllIIlll[23]] = "Stunned";
        ab.lllllIIllI[ab.lllllIIlll[24]] = "Drink";
        ab.lllllIIllI[ab.lllllIIlll[25]] = "Jug";
        ab.lllllIIllI[ab.lllllIIlll[16]] = "Jug";
        ab.lllllIIllI[ab.lllllIIlll[26]] = "Nav to men";
        ab.lllllIIllI[ab.lllllIIlll[27]] = "Pickpocketing";
        ab.lllllIIllI[ab.lllllIIlll[29]] = "Open-all";
        ab.lllllIIllI[ab.lllllIIlll[30]] = "Man";
        ab.lllllIIllI[ab.lllllIIlll[14]] = "Man";
        ab.lllllIIllI[ab.lllllIIlll[31]] = "Pickpocket";
        ab.lllllIIllI[ab.lllllIIlll[32]] = "Stunned";
        ab.lllllIIllI[ab.lllllIIlll[33]] = "Eat";
        ab.lllllIIllI[ab.lllllIIlll[34]] = "Nav to tea tile";
        ab.lllllIIllI[ab.lllllIIlll[28]] = "Open-all";
        ab.lllllIIllI[ab.lllllIIlll[35]] = "Stealing";
        ab.lllllIIllI[ab.lllllIIlll[36]] = "Tea stall";
        ab.lllllIIllI[ab.lllllIIlll[37]] = "Tea stall";
        ab.lllllIIllI[ab.lllllIIlll[38]] = "Steal-from";
        ab.lllllIIllI[ab.lllllIIlll[40]] = "Dropping";
        ab.lllllIIllI[ab.lllllIIlll[49]] = "Thieving";
        ab.lllllIIllI[ab.lllllIIlll[51]] = "Drop";
        ab.lllllIIllI[ab.lllllIIlll[52]] = "Drop";
        ab.lllllIIllI[ab.lllllIIlll[53]] = "Tea stall";
        ab.lllllIIllI[ab.lllllIIlll[54]] = "Drop";
        ab.lllllIIllI[ab.lllllIIlll[55]] = "Drop";
        ab.lllllIIllI[ab.lllllIIlll[56]] = "Drop";
        ab.lllllIIllI[ab.lllllIIlll[5]] = "Onion seed";
        ab.lllllIIllI[ab.lllllIIlll[61]] = "Marigold seed";
        ab.lllllIIllI[ab.lllllIIlll[62]] = "Cabbage seed";
        ab.lllllIIllI[ab.lllllIIlll[63]] = "Jute seed";
        ab.lllllIIllI[ab.lllllIIlll[64]] = "Potato seed";
        ab.lllllIIllI[ab.lllllIIlll[65]] = "Tomato seed";
        ab.lllllIIllI[ab.lllllIIlll[66]] = "Nasturtium seed";
        ab.lllllIIllI[ab.lllllIIlll[67]] = "Holy handegg";
        ab.lllllIIllI[ab.lllllIIlll[68]] = "Peaceful handegg";
        ab.lllllIIllI[ab.lllllIIlll[69]] = "Chaotic handegg";
        ab.lllllIIllI[ab.lllllIIlll[70]] = "Sweetcorn seed";
        ab.lllllIIllI[ab.lllllIIlll[71]] = "Woad seed";
        ab.lllllIIllI[ab.lllllIIlll[72]] = "Redberry seed";
        ab.lllllIIllI[ab.lllllIIlll[73]] = "Jangerberry seed";
        ab.lllllIIllI[ab.lllllIIlll[74]] = "Tarromin seed";
        ab.lllllIIllI[ab.lllllIIlll[75]] = "Rosemary seed";
        ab.lllllIIllI[ab.lllllIIlll[76]] = "Strawberry seed";
        ab.lllllIIllI[ab.lllllIIlll[77]] = "Hammerstone seed";
        ab.lllllIIllI[ab.lllllIIlll[78]] = "Asgarnian seed";
        ab.lllllIIllI[ab.lllllIIlll[79]] = "Yanillian seed";
        ab.lllllIIllI[ab.lllllIIlll[80]] = "Krandorian seed";
        ab.lllllIIllI[ab.lllllIIlll[81]] = "Wildblood seed";
        ab.lllllIIllI[ab.lllllIIlll[82]] = "Marigold seed";
        ab.lllllIIllI[ab.lllllIIlll[83]] = "Rosemary seed";
        ab.lllllIIllI[ab.lllllIIlll[84]] = "Cadavaberry seed";
        ab.lllllIIllI[ab.lllllIIlll[85]] = "Dwellberry seed";
        ab.lllllIIllI[ab.lllllIIlll[86]] = "Jangerberry seed";
        ab.lllllIIllI[ab.lllllIIlll[87]] = "Poison ivy seed";
        ab.lllllIIllI[ab.lllllIIlll[88]] = "Guam seed";
        ab.lllllIIllI[ab.lllllIIlll[89]] = "Marrentill seed";
        ab.lllllIIllI[ab.lllllIIlll[90]] = "Tarromin seed";
        ab.lllllIIllI[ab.lllllIIlll[91]] = "Harralander seed";
        ab.lllllIIllI[ab.lllllIIlll[92]] = "Mushroom spore";
        ab.lllllIIllI[ab.lllllIIlll[93]] = "Belladonna seed";
        ab.lllllIIllI[ab.lllllIIlll[94]] = "Cactus seed";
        ab.lllllIIllI[ab.lllllIIlll[95]] = "Potato cactus seed";
        ab.lllllIIllI[ab.lllllIIlll[96]] = "Jug";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        block7: {
            block8: {
                if (ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12])) {
                    int n3;
                    int[] nArray = new int[lllllIIlll[1]];
                    nArray[ab.lllllIIlll[0]] = lllllIIlll[11];
                    if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllllIIlll[1]];
                        nArray2[ab.lllllIIlll[0]] = lllllIIlll[10];
                        int[] nArray3 = new int[lllllIIlll[1]];
                        nArray3[ab.lllllIIlll[0]] = lllllIIlll[9];
                        if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray2) & Inventory.contains((int[])nArray3)) && ab.llIlIIlllIIIl(bS)) {
                            n3 = lllllIIlll[1];

                            if (2 > 0) return n3 != 0;
                            return false;
                        }
                    }
                    n3 = lllllIIlll[0];
                    return n3 != 0;
                }
                if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12]) && ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                    return lllllIIlll[1];
                }
                if (!ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) return lllllIIlll[0];
                int[] nArray = new int[lllllIIlll[1]];
                nArray[ab.lllllIIlll[0]] = lllllIIlll[7];
                if (!ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray4 = new int[lllllIIlll[1]];
                nArray4[ab.lllllIIlll[0]] = lllllIIlll[6];
                if (!ab.llIlIIllIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block8;
                int[] nArray5 = new int[lllllIIlll[1]];
                nArray5[ab.lllllIIlll[0]] = lllllIIlll[6];
                if (!ab.llIlIIllIllIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block7;
            }
            n2 = lllllIIlll[1];

            if (3 > 0) return n2 != 0;
            return false;
        }
        n2 = lllllIIlll[0];
        return n2 != 0;
    }

    private static boolean eH() {
        return lllllIIlll[0];
    }

    private static boolean llIlIIlllIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIlllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIIllIllll(int n2) {
        return n2 == 0;
    }

    private static void eF() {
        if (ab.llIlIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(jA), lllllIIlll[16])) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[26]];
            Movement.walkTo((WorldPoint)jA);

            Time.sleepTicks((int)lllllIIlll[1]);

        }
        if (ab.llIlIIlllIlIl(Players.getLocal().getWorldLocation().distanceTo(jA), lllllIIlll[16])) {
            if (ab.llIlIIllIllIl(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (ab.llIlIIllllIIl(ab.llIlIIllllIlI(System.currentTimeMillis(), jD))) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[27]];
                int[] nArray = new int[lllllIIlll[1]];
                nArray[ab.lllllIIlll[0]] = jF;
                if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllllIIlll[1]];
                    nArray2[ab.lllllIIlll[0]] = jF;
                    if (ab.llIlIIlllIIlI(Inventory.getFirst((int[])nArray2).getQuantity(), lllllIIlll[28])) {
                        int[] nArray3 = new int[lllllIIlll[1]];
                        nArray3[ab.lllllIIlll[0]] = jF;
                        Inventory.getFirst((int[])nArray3).interact(lllllIIllI[lllllIIlll[29]]);
                        Time.sleepTicks((int)lllllIIlll[1]);

                    }
                }
                String[] stringArray = new String[lllllIIlll[1]];
                stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[30]];
                if (ab.llIlIIlllIIII(NPCs.getNearest((String[])stringArray)) && ab.llIlIIlllIlll(Players.getLocal().getInteracting()) && ab.llIlIIllIllll(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] stringArray2 = new String[lllllIIlll[1]];
                    stringArray2[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[14]];
                    NPCs.getNearest((String[])stringArray2).interact(lllllIIllI[lllllIIlll[31]]);
                    Time.sleepTicks((int)lllllIIlll[1]);

                }
            }
            if (ab.llIlIIlllllII(ab.llIlIIllllIlI(System.currentTimeMillis(), jD))) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[32]];
                if (!ab.llIlIIllllIIl(ab.llIlIIllllIll(e.u(), 30.0)) || ab.llIlIIlllIlIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllllIIlll[8])) {
                    int[] nArray = new int[lllllIIlll[1]];
                    nArray[ab.lllllIIlll[0]] = lllllIIlll[11];
                    if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lllllIIlll[1]];
                        nArray4[ab.lllllIIlll[0]] = lllllIIlll[11];
                        Inventory.getFirst((int[])nArray4).interact(lllllIIllI[lllllIIlll[33]]);
                        Time.sleepTicks((int)lllllIIlll[1]);

                    }
                }
            }
        }
    }

    private static boolean llIlIIlllIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIIllllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIIllIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlllIIII(Object object) {
        return object != null;
    }
}

