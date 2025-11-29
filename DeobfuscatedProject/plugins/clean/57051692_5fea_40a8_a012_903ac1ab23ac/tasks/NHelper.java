/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.KHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

public class NHelper
implements K {
    public static  int[] cE;
    public static  WorldArea cF;
    
    public static  WorldArea cG;
    public static  boolean bn;
    public static  List<d> bp;
    public static  WorldPoint ce;
    public static  WorldPoint cI;
    
    public static  WorldArea cH;
    public static  WorldPoint cJ;

    @Override
    public boolean af() {
        boolean bl;
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIllIIl[2])) {
            bl = lIlIIllIIl[1];

            if (-(0x2D ^ 0x28) >= 0) {
                return false;
            }
        } else {
            bl = lIlIIllIIl[0];
        }
        return bl;
    }

    static {
        N.lIIIllIlIlIII();
        N.lIIIllIlIIlll();
        bp = new ArrayList<d>();
        int[] nArray = new int[lIlIIllIIl[18]];
        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
        nArray[N.lIlIIllIIl[1]] = lIlIIllIIl[17];
        nArray[N.lIlIIllIIl[3]] = lIlIIllIIl[42];
        nArray[N.lIlIIllIIl[4]] = lIlIIllIIl[44];
        nArray[N.lIlIIllIIl[6]] = lIlIIllIIl[40];
        nArray[N.lIlIIllIIl[10]] = lIlIIllIIl[45];
        nArray[N.lIlIIllIIl[14]] = lIlIIllIIl[47];
        nArray[N.lIlIIllIIl[15]] = lIlIIllIIl[49];
        cE = nArray;
        cF = new WorldArea(lIlIIllIIl[59], lIlIIllIIl[60], lIlIIllIIl[22], lIlIIllIIl[22], lIlIIllIIl[0]);
        cG = new WorldArea(lIlIIllIIl[61], lIlIIllIIl[62], lIlIIllIIl[32], lIlIIllIIl[26], lIlIIllIIl[0]);
        cH = new WorldArea(lIlIIllIIl[63], lIlIIllIIl[64], lIlIIllIIl[65], lIlIIllIIl[34], lIlIIllIIl[0]);
        cI = new WorldPoint(lIlIIllIIl[66], lIlIIllIIl[67], lIlIIllIIl[0]);
        ce = new WorldPoint(lIlIIllIIl[68], lIlIIllIIl[60], lIlIIllIIl[0]);
        cJ = new WorldPoint(lIlIIllIIl[69], lIlIIllIIl[70], lIlIIllIIl[0]);
    }

    public static void aH() {
        block17: {
            block19: {
                block18: {
                    if (N.lIIIllIlIlIlI(bn ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[0]];
                        b.a(bp);
                        if (N.lIIIllIlIlIll(bp.size(), lIlIIllIIl[1])) {
                            System.out.println(lIlIIllIII[lIlIIllIIl[1]]);
                            bn = lIlIIllIIl[0];
                        }
                    }
                    if (!N.lIIIllIlIllII(bn ? 1 : 0)) break block17;
                    if (N.lIIIllIlIllII(N.aK() ? 1 : 0) && N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIllIIl[2])) {
                        BankLocation var1 = BankLocation.getNearest();
                        if (N.lIIIllIlIllIl(var1) && N.lIIIllIlIllII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[3]];
                            a.a(var1);
                        }
                        if (N.lIIIllIlIllIl(var1) && N.lIIIllIlIlIlI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[4]];
                            if (N.lIIIllIlIllII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIllIIl[5]);

                            }
                            if (N.lIIIllIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                                if (N.lIIIllIlIlllI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIlIIllIIl[1]);

                                }
                                if (N.lIIIllIlIlllI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIlIIllIIl[3]);

                                }
                                if (N.lIIIllIlIllII(N.aL() ? 1 : 0)) {
                                    N.O();
                                    System.out.println(lIlIIllIII[lIlIIllIIl[6]]);
                                    bn = lIlIIllIIl[1];
                                    return;
                                }
                                a.a(cE, lIlIIllIIl[1]);
                                a.a(lIlIIllIIl[7], lIlIIllIIl[8]);
                                a.b(f.aU, lIlIIllIIl[1]);
                                a.a(lIlIIllIIl[9], lIlIIllIIl[10]);
                                a.a(lIlIIllIIl[11], lIlIIllIIl[12]);
                            }
                        }
                    }
                    if (!N.lIIIllIlIlIlI(N.aK() ? 1 : 0)) break block17;
                    N.aJ();
                    if (N.lIIIllIlIllll(Movement.getRunEnergy(), lIlIIllIIl[13]) && N.lIIIllIlIllII(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[lIlIIllIIl[1]];
                    stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[10]];
                    if (!N.lIIIllIlIllII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[lIlIIllIIl[1]];
                    stringArray2[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[14]];
                    if (!N.lIIIllIlIllII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[lIlIIllIIl[1]];
                    stringArray3[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[15]];
                    if (!N.lIIIllIlIllII(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[lIlIIllIIl[1]];
                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[lIlIIllIIl[1]];
                    nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                    if (!N.lIIIllIlIlIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                N.aM();
            }
            if (N.lIIIllIllIIII(N.lIIIllIlIlIIl(e.u(), 45.0))) {
                int[] nArray = new int[lIlIIllIIl[1]];
                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lIlIIllIIl[1]];
                    nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                    Inventory.getFirst((int[])nArray3).interact(lIlIIllIII[lIlIIllIIl[18]]);
                    Time.sleepTicks((int)lIlIIllIIl[1]);

                }
            }
            if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[19]) && N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIllIIl[19])) {
                k.aa();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aK() {
        int n2;
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        block8: {
                                            int n3;
                                            block10: {
                                                block16: {
                                                    block15: {
                                                        block14: {
                                                            block13: {
                                                                block12: {
                                                                    block11: {
                                                                        block9: {
                                                                            if (!N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) break block8;
                                                                            int[] nArray = new int[lIlIIllIIl[1]];
                                                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[lIlIIllIIl[1]];
                                                                            nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                            if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[lIlIIllIIl[1]];
                                                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[lIlIIllIIl[1]];
                                                                        nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                        if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[lIlIIllIIl[1]];
                                                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[lIlIIllIIl[1]];
                                                                    nArray4[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                    if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[lIlIIllIIl[1]];
                                                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[lIlIIllIIl[1]];
                                                                nArray5[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[lIlIIllIIl[1]];
                                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[lIlIIllIIl[1]];
                                                            nArray6[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                            if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[lIlIIllIIl[1]];
                                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[lIlIIllIIl[1]];
                                                        nArray7[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                        if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[lIlIIllIIl[1]];
                                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[lIlIIllIIl[1]];
                                                    nArray8[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                    if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[lIlIIllIIl[1]];
                                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                                                if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = lIlIIllIIl[1];

                                                    if (null == null) return n3 != 0;
                                                    return ((92 + 151 - 71 + 1 ^ 116 + 7 - 83 + 112) & (0x23 ^ 0x4A ^ (0xC3 ^ 0x9F) ^ -1)) != 0;
                                                }
                                            }
                                            n3 = lIlIIllIIl[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[lIlIIllIIl[1]];
                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[lIlIIllIIl[1]];
                                        nArray9[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                        if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[lIlIIllIIl[1]];
                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[lIlIIllIIl[1]];
                                    nArray10[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                    if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[lIlIIllIIl[1]];
                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[lIlIIllIIl[1]];
                                nArray11[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[lIlIIllIIl[1]];
                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[lIlIIllIIl[1]];
                            nArray12[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                            if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[lIlIIllIIl[1]];
                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[lIlIIllIIl[1]];
                        nArray13[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                        if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[lIlIIllIIl[1]];
                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[lIlIIllIIl[1]];
                    nArray14[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                    if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[lIlIIllIIl[1]];
                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[lIlIIllIIl[1]];
                nArray15[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[lIlIIllIIl[1]];
            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlIIllIIl[1];

                if (1 != 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIIllIIl[0];
        return n2 != 0;
    }

    private static boolean lIIIllIllIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIllIlIllII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var2);
    }

    private static int lIIIllIlIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIIllIllIIII(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIllIlIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIllIlIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aL() {
        int n2;
        block15: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block14: {
                                            block4: {
                                                int n3;
                                                block6: {
                                                    block13: {
                                                        block12: {
                                                            block11: {
                                                                block10: {
                                                                    block9: {
                                                                        block8: {
                                                                            block7: {
                                                                                block5: {
                                                                                    if (!N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) break block4;
                                                                                    int[] nArray = new int[lIlIIllIIl[1]];
                                                                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[lIlIIllIIl[1]];
                                                                                    nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                                    if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[lIlIIllIIl[1]];
                                                                                    nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                                    if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[lIlIIllIIl[1]];
                                                                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[lIlIIllIIl[1]];
                                                                                nArray4[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                                if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[lIlIIllIIl[1]];
                                                                                nArray5[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                                if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[lIlIIllIIl[1]];
                                                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[lIlIIllIIl[1]];
                                                                            nArray6[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                            if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[lIlIIllIIl[1]];
                                                                            nArray7[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                            if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[lIlIIllIIl[1]];
                                                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[lIlIIllIIl[1]];
                                                                        nArray8[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                        if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[lIlIIllIIl[1]];
                                                                        nArray9[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                        if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[lIlIIllIIl[1]];
                                                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[lIlIIllIIl[1]];
                                                                    nArray10[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                                    if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[lIlIIllIIl[1]];
                                                                    nArray11[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                                    if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[lIlIIllIIl[1]];
                                                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                                if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[lIlIIllIIl[1]];
                                                                nArray12[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[lIlIIllIIl[1]];
                                                                nArray13[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                                if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[lIlIIllIIl[1]];
                                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                            if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[lIlIIllIIl[1]];
                                                            nArray14[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[lIlIIllIIl[1]];
                                                            nArray15[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                            if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[lIlIIllIIl[1]];
                                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                                                        if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[lIlIIllIIl[1]];
                                                        nArray16[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                                                        if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = lIlIIllIIl[1];

                                                    if (-1 <= 3) return n3 != 0;
                                                    return false;
                                                }
                                                n3 = lIlIIllIIl[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[lIlIIllIIl[1]];
                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[lIlIIllIIl[1]];
                                            nArray17[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                            if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[lIlIIllIIl[1]];
                                            nArray18[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                            if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[lIlIIllIIl[1]];
                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[lIlIIllIIl[1]];
                                        nArray19[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                        if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[lIlIIllIIl[1]];
                                        nArray20[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                        if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[lIlIIllIIl[1]];
                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[lIlIIllIIl[1]];
                                    nArray21[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                    if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[lIlIIllIIl[1]];
                                    nArray22[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                    if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[lIlIIllIIl[1]];
                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[lIlIIllIIl[1]];
                                nArray23[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[lIlIIllIIl[1]];
                                nArray24[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[lIlIIllIIl[1]];
                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[lIlIIllIIl[1]];
                            nArray25[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                            if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[lIlIIllIIl[1]];
                            nArray26[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                            if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[lIlIIllIIl[1]];
                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                        if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[lIlIIllIIl[1]];
                        nArray27[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[lIlIIllIIl[1]];
                        nArray28[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                        if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[lIlIIllIIl[1]];
                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                    if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[lIlIIllIIl[1]];
                    nArray29[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[lIlIIllIIl[1]];
                    nArray30[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                    if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[lIlIIllIIl[1]];
                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[lIlIIllIIl[1]];
                nArray31[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = lIlIIllIIl[1];

            if (((71 + 98 - 128 + 90 ^ 80 + 2 - 42 + 120) & (0xBC ^ 0xB6 ^ (0x63 ^ 0x4A) ^ -1)) == 0) return n2 != 0;
            return ((0x57 ^ 0x1F ^ (0xF ^ 0x49)) & (82 + 43 - -2 + 10 ^ 108 + 28 - 34 + 33 ^ -1)) != 0;
        }
        n2 = lIlIIllIIl[0];
        return n2 != 0;
    }

    @Override
    public String ae() {
        return lIlIIllIII[lIlIIllIIl[57]];
    }

    public static void ak() {
        if (N.lIIIllIlIllII(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[20]];
            Movement.walkTo((WorldPoint)ce);

            Time.sleepTicks((int)lIlIIllIIl[1]);

        }
        if (N.lIIIllIlIlIlI(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[21]];
            if (N.lIIIllIllIIIl(Players.getLocal().getInteracting())) {
                NPC var3 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (N.lIIIllIlIlIlI(nPC.getName().contains(lIlIIllIII[lIlIIllIIl[58]]) ? 1 : 0) && N.lIIIllIllIIIl(nPC.getInteracting()) && N.lIIIllIlIllII(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlIIllIIl[1];

                        if (((0xC7 ^ 0xA3 ^ (0xD8 ^ 0x9A)) & (172 + 44 - 78 + 44 ^ 7 + 29 - 32 + 140 ^ -1)) > 0) {
                            return ((101 + 62 - 62 + 53 ^ 31 + 23 - -89 + 48) & (0x83 ^ 0xAC ^ (0xCA ^ 0xC0) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIlIIllIIl[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[lIlIIllIIl[3]];
                stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[22]];
                stringArray[N.lIlIIllIIl[1]] = lIlIIllIII[lIlIIllIIl[23]];
                List var4 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (N.lIIIllIllIIll(nPC.getInteracting(), Players.getLocal())) {
                        bl = lIlIIllIIl[1];

                        if (3 < 0) {
                            return (2 & (2 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlIIllIIl[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (N.lIIIllIlIllII(var4.isEmpty() ? 1 : 0)) {
                    ((NPC)var4.get(lIlIIllIIl[0])).interact(lIlIIllIII[lIlIIllIIl[24]]);
                    Time.sleepTicks((int)lIlIIllIIl[3]);

                }
                if (N.lIIIllIlIllIl(var3) && N.lIIIllIlIllII(Players.getLocal().isMoving() ? 1 : 0) && N.lIIIllIlIlIlI(var4.isEmpty() ? 1 : 0)) {
                    var3.interact(lIlIIllIII[lIlIIllIIl[25]]);
                    Time.sleepTicks((int)lIlIIllIIl[3]);

                }
            }
            if (N.lIIIllIlIllIl(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)lIlIIllIIl[6]);

            }
        }
    }

    private static boolean lIIIllIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIlIIlll() {
        lIlIIllIII = new String[lIlIIllIIl[71]];
        N.lIlIIllIII[N.lIlIIllIIl[0]] = "Buying items";
        N.lIlIIllIII[N.lIlIIllIIl[1]] = "Finished buying items, switching back to melee training";
        N.lIlIIllIII[N.lIlIIllIIl[3]] = "Navigating to bank";
        N.lIlIIllIII[N.lIlIIllIIl[4]] = "Handling banking";
        N.lIlIIllIII[N.lIlIIllIIl[6]] = "We are missing supplies, switching to BUYING";
        N.lIlIIllIII[N.lIlIIllIIl[10]] = "Iron scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[14]] = "Steel scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[15]] = "Mithril scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[18]] = "Eat";
        N.lIlIIllIII[N.lIlIIllIIl[20]] = "Walking to cow area";
        N.lIlIIllIII[N.lIlIIllIIl[21]] = "Killing cows";
        N.lIlIIllIII[N.lIlIIllIIl[22]] = "Cow";
        N.lIlIIllIII[N.lIlIIllIIl[23]] = "cow";
        N.lIlIIllIII[N.lIlIIllIIl[24]] = "Attack";
        N.lIlIIllIII[N.lIlIIllIIl[25]] = "Attack";
        N.lIlIIllIII[N.lIlIIllIIl[13]] = "Auto retaliate";
        N.lIlIIllIII[N.lIlIIllIIl[26]] = N.lIIIllIlIIlII("Kl2LbYRR7iE=", "iIHkU");
        N.lIlIIllIII[N.lIlIIllIIl[29]] = "Iron scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[30]] = "Iron scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[31]] = "Wield";
        N.lIlIIllIII[N.lIlIIllIIl[19]] = "Steel scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[32]] = "Steel scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[33]] = "Wield";
        N.lIlIIllIII[N.lIlIIllIIl[35]] = "Mithril scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[36]] = "Mithril scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[37]] = "Wield";
        N.lIlIIllIII[N.lIlIIllIIl[38]] = "ZwIQRۺv";
        N.lIlIIllIII[N.lIlIIllIIl[39]] = "Wield";
        N.lIlIIllIII[N.lIlIIllIIl[41]] = "Wear";
        N.lIlIIllIII[N.lIlIIllIIl[43]] = "Wear";
        N.lIlIIllIII[N.lIlIIllIIl[34]] = "Wear";
        N.lIlIIllIII[N.lIlIIllIIl[46]] = "Wear";
        N.lIlIIllIII[N.lIlIIllIIl[48]] = "Wear";
        N.lIlIIllIII[N.lIlIIllIIl[50]] = "Wear";
        N.lIlIIllIII[N.lIlIIllIIl[57]] = "40 Def";
        N.lIlIIllIII[N.lIlIIllIIl[58]] = "Cow";
    }

    private static boolean lIIIllIlIllIl(Object object) {
        return object != null;
    }

    private static boolean lIIIllIlIllll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void aJ() {
        if (N.lIIIllIllIIlI(Static.getClient().getVar(lIlIIllIIl[22]), lIlIIllIIl[1])) {
            Static.getClient().invokeMenuAction(lIlIIllIII[lIlIIllIIl[13]], lIlIIllIII[lIlIIllIIl[26]], lIlIIllIIl[1], MenuAction.CC_OP.getId(), lIlIIllIIl[27], lIlIIllIIl[28]);
        }
        if (N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[10])) {
            String[] stringArray = new String[lIlIIllIIl[1]];
            stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[29]];
            if (N.lIIIllIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIlIIllIIl[1]];
                stringArray2[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[30]];
                Inventory.getFirst((String[])stringArray2).interact(lIlIIllIII[lIlIIllIIl[31]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[10]) && N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[19])) {
            String[] stringArray = new String[lIlIIllIIl[1]];
            stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[19]];
            if (N.lIIIllIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lIlIIllIIl[1]];
                stringArray3[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[32]];
                Inventory.getFirst((String[])stringArray3).interact(lIlIIllIII[lIlIIllIIl[33]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[19]) && N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[34])) {
            String[] stringArray = new String[lIlIIllIIl[1]];
            stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[35]];
            if (N.lIIIllIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lIlIIllIIl[1]];
                stringArray4[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[36]];
                Inventory.getFirst((String[])stringArray4).interact(lIlIIllIII[lIlIIllIIl[37]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[34]) && N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) {
            int[] nArray = new int[lIlIIllIIl[1]];
            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIllIIl[1]];
                nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                Inventory.getFirst((int[])nArray2).interact(lIlIIllIII[lIlIIllIIl[38]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) {
            int[] nArray = new int[lIlIIllIIl[1]];
            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lIlIIllIIl[1]];
                nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                Inventory.getFirst((int[])nArray3).interact(lIlIIllIII[lIlIIllIIl[39]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIllIIl[34])) {
            int[] nArray = new int[lIlIIllIIl[1]];
            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lIlIIllIIl[1]];
                nArray4[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                Inventory.getFirst((int[])nArray4).interact(lIlIIllIII[lIlIIllIIl[41]]);
            }
            int[] nArray5 = new int[lIlIIllIIl[1]];
            nArray5[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lIlIIllIIl[1]];
                nArray6[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                Inventory.getFirst((int[])nArray6).interact(lIlIIllIII[lIlIIllIIl[43]]);
            }
            int[] nArray7 = new int[lIlIIllIIl[1]];
            nArray7[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[lIlIIllIIl[1]];
                nArray8[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                Inventory.getFirst((int[])nArray8).interact(lIlIIllIII[lIlIIllIIl[34]]);
            }
            int[] nArray9 = new int[lIlIIllIIl[1]];
            nArray9[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lIlIIllIIl[1]];
                nArray10[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                Inventory.getFirst((int[])nArray10).interact(lIlIIllIII[lIlIIllIIl[46]]);
            }
        }
        int[] nArray = new int[lIlIIllIIl[1]];
        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
        if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[lIlIIllIIl[1]];
            nArray11[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
            Inventory.getFirst((int[])nArray11).interact(lIlIIllIII[lIlIIllIIl[48]]);
        }
        int[] nArray12 = new int[lIlIIllIIl[1]];
        nArray12[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
        if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIlIIllIIl[1]];
            nArray13[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
            Inventory.getFirst((int[])nArray13).interact(lIlIIllIII[lIlIIllIIl[50]]);
        }
    }

    @Override
    public int ad() {
        try {
            N.aH();

        }
        catch (Exception var5) {
            var5.printStackTrace();
        }
        if ((0x44 ^ 0x49 ^ (0x3A ^ 0x33)) <= 3) {
            return (0xB4 ^ 0x8B ^ (3 ^ 0x37)) & (0x68 ^ 0x7C ^ (0x4C ^ 0x53) ^ -1);
        }
        return lIlIIllIIl[0];
    }

    public static void aM() {
        if (N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIllIIl[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    public static void O() {
        d var6;
        int[] nArray = new int[lIlIIllIIl[1]];
        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[9];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIlIIllIIl[9], lIlIIllIIl[2], lIlIIllIIl[51]);
            bp.add(d2);

        }
        int[] nArray2 = new int[lIlIIllIIl[1]];
        nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[52];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var6 = new DHelper(lIlIIllIIl[52], lIlIIllIIl[10], lIlIIllIIl[51]);
            bp.add(var6);

        }
        int[] nArray3 = new int[lIlIIllIIl[1]];
        nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var6 = new DHelper(lIlIIllIIl[49], lIlIIllIIl[1], lIlIIllIIl[53]);
            bp.add(var6);

        }
        int[] nArray4 = new int[lIlIIllIIl[1]];
        nArray4[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var6 = new DHelper(lIlIIllIIl[47], lIlIIllIIl[1], lIlIIllIIl[54]);
            bp.add(var6);

        }
        int[] nArray5 = new int[lIlIIllIIl[1]];
        nArray5[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var6 = new DHelper(lIlIIllIIl[11], lIlIIllIIl[12], lIlIIllIIl[55]);
            bp.add(var6);

        }
        int[] nArray6 = new int[lIlIIllIIl[1]];
        nArray6[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var6 = new DHelper(lIlIIllIIl[40], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var6);

        }
        int[] nArray7 = new int[lIlIIllIIl[1]];
        nArray7[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var6 = new DHelper(lIlIIllIIl[44], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var6);

        }
        int[] nArray8 = new int[lIlIIllIIl[1]];
        nArray8[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var6 = new DHelper(lIlIIllIIl[45], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var6);

        }
        int[] nArray9 = new int[lIlIIllIIl[1]];
        nArray9[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var6 = new DHelper(lIlIIllIIl[42], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var6);

        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) {
            int[] nArray10 = new int[lIlIIllIIl[1]];
            nArray10[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
            if (N.lIIIllIlIllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                var6 = new DHelper(lIlIIllIIl[17], lIlIIllIIl[1], lIlIIllIIl[54]);
                bp.add(var6);

            }
        }
        int[] nArray11 = new int[lIlIIllIIl[1]];
        nArray11[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var6 = new DHelper(lIlIIllIIl[16], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var6);

        }
    }

    private static boolean lIIIllIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ac() {
        return lIlIIllIIl[0];
    }

    private static boolean lIIIllIllIIll(Object object, Object object2) {
        return object == object2;
    }
}

