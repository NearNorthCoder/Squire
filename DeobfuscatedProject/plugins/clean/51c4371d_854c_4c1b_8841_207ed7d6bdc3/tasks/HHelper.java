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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.JHelper;
import gg.squire.account.AccBuilderBarrows;
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

public class HHelper
implements F {
    public static  boolean bz;
    public static  WorldPoint iG;
    public static  WorldArea iD;
    public static  WorldPoint bD;
    public static  WorldPoint iF;
    
    public static  WorldArea iC;
    
    public static  List<d> bB;
    public static  int[] iB;
    public static  WorldArea iE;

    @Override
    public int U() {
        try {
            H.cu();

        }
        catch (Exception lIlIllIlIIllllI) {
            lIlIllIlIIllllI.printStackTrace();
        }
        if (3 != 3) {
            return (0x5C ^ 0x3A ^ (0xC ^ 0x57)) & (0x2E ^ 0x3F ^ (0xF ^ 0x23) ^ -1);
        }
        return llIIIIII[0];
    }

    @Override
    public String V() {
        return lIlllllI[llIIIIII[57]];
    }

    public static void cv() {
        if (H.lIlIIIlIIIl(Static.getClient().getVar(llIIIIII[22]), llIIIIII[1])) {
            Static.getClient().invokeMenuAction(lIlllllI[llIIIIII[13]], lIlllllI[llIIIIII[26]], llIIIIII[1], MenuAction.CC_OP.getId(), llIIIIII[27], llIIIIII[28]);
        }
        if (H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[10])) {
            String[] stringArray = new String[llIIIIII[1]];
            stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[29]];
            if (H.lIlIIIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIIIIII[1]];
                stringArray2[H.llIIIIII[0]] = lIlllllI[llIIIIII[30]];
                Inventory.getFirst((String[])stringArray2).interact(lIlllllI[llIIIIII[31]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[10]) && H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[19])) {
            String[] stringArray = new String[llIIIIII[1]];
            stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[19]];
            if (H.lIlIIIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[llIIIIII[1]];
                stringArray3[H.llIIIIII[0]] = lIlllllI[llIIIIII[32]];
                Inventory.getFirst((String[])stringArray3).interact(lIlllllI[llIIIIII[33]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[19]) && H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[34])) {
            String[] stringArray = new String[llIIIIII[1]];
            stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[35]];
            if (H.lIlIIIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[llIIIIII[1]];
                stringArray4[H.llIIIIII[0]] = lIlllllI[llIIIIII[36]];
                Inventory.getFirst((String[])stringArray4).interact(lIlllllI[llIIIIII[37]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[34]) && H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) {
            int[] nArray = new int[llIIIIII[1]];
            nArray[H.llIIIIII[0]] = llIIIIII[16];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIIIII[1]];
                nArray2[H.llIIIIII[0]] = llIIIIII[16];
                Inventory.getFirst((int[])nArray2).interact(lIlllllI[llIIIIII[38]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) {
            int[] nArray = new int[llIIIIII[1]];
            nArray[H.llIIIIII[0]] = llIIIIII[17];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIIIII[1]];
                nArray3[H.llIIIIII[0]] = llIIIIII[17];
                Inventory.getFirst((int[])nArray3).interact(lIlllllI[llIIIIII[39]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIII[34])) {
            int[] nArray = new int[llIIIIII[1]];
            nArray[H.llIIIIII[0]] = llIIIIII[40];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[llIIIIII[1]];
                nArray4[H.llIIIIII[0]] = llIIIIII[40];
                Inventory.getFirst((int[])nArray4).interact(lIlllllI[llIIIIII[41]]);
            }
            int[] nArray5 = new int[llIIIIII[1]];
            nArray5[H.llIIIIII[0]] = llIIIIII[42];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[llIIIIII[1]];
                nArray6[H.llIIIIII[0]] = llIIIIII[42];
                Inventory.getFirst((int[])nArray6).interact(lIlllllI[llIIIIII[43]]);
            }
            int[] nArray7 = new int[llIIIIII[1]];
            nArray7[H.llIIIIII[0]] = llIIIIII[44];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[llIIIIII[1]];
                nArray8[H.llIIIIII[0]] = llIIIIII[44];
                Inventory.getFirst((int[])nArray8).interact(lIlllllI[llIIIIII[34]]);
            }
            int[] nArray9 = new int[llIIIIII[1]];
            nArray9[H.llIIIIII[0]] = llIIIIII[45];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[llIIIIII[1]];
                nArray10[H.llIIIIII[0]] = llIIIIII[45];
                Inventory.getFirst((int[])nArray10).interact(lIlllllI[llIIIIII[46]]);
            }
        }
        int[] nArray = new int[llIIIIII[1]];
        nArray[H.llIIIIII[0]] = llIIIIII[47];
        if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[llIIIIII[1]];
            nArray11[H.llIIIIII[0]] = llIIIIII[47];
            Inventory.getFirst((int[])nArray11).interact(lIlllllI[llIIIIII[48]]);
        }
        int[] nArray12 = new int[llIIIIII[1]];
        nArray12[H.llIIIIII[0]] = llIIIIII[49];
        if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llIIIIII[1]];
            nArray13[H.llIIIIII[0]] = llIIIIII[49];
            Inventory.getFirst((int[])nArray13).interact(lIlllllI[llIIIIII[50]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bm() {
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
                                                                            if (!H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) break block8;
                                                                            int[] nArray = new int[llIIIIII[1]];
                                                                            nArray[H.llIIIIII[0]] = llIIIIII[17];
                                                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[llIIIIII[1]];
                                                                            nArray2[H.llIIIIII[0]] = llIIIIII[17];
                                                                            if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[llIIIIII[1]];
                                                                        nArray[H.llIIIIII[0]] = llIIIIII[42];
                                                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[llIIIIII[1]];
                                                                        nArray3[H.llIIIIII[0]] = llIIIIII[42];
                                                                        if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[llIIIIII[1]];
                                                                    nArray[H.llIIIIII[0]] = llIIIIII[44];
                                                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[llIIIIII[1]];
                                                                    nArray4[H.llIIIIII[0]] = llIIIIII[44];
                                                                    if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[llIIIIII[1]];
                                                                nArray[H.llIIIIII[0]] = llIIIIII[40];
                                                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[llIIIIII[1]];
                                                                nArray5[H.llIIIIII[0]] = llIIIIII[40];
                                                                if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[llIIIIII[1]];
                                                            nArray[H.llIIIIII[0]] = llIIIIII[45];
                                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[llIIIIII[1]];
                                                            nArray6[H.llIIIIII[0]] = llIIIIII[45];
                                                            if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[llIIIIII[1]];
                                                        nArray[H.llIIIIII[0]] = llIIIIII[47];
                                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[llIIIIII[1]];
                                                        nArray7[H.llIIIIII[0]] = llIIIIII[47];
                                                        if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[llIIIIII[1]];
                                                    nArray[H.llIIIIII[0]] = llIIIIII[49];
                                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[llIIIIII[1]];
                                                    nArray8[H.llIIIIII[0]] = llIIIIII[49];
                                                    if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[llIIIIII[1]];
                                                nArray[H.llIIIIII[0]] = llIIIIII[11];
                                                if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = llIIIIII[1];

                                                    if (-1 <= 0) return n3 != 0;
                                                    return false;
                                                }
                                            }
                                            n3 = llIIIIII[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[llIIIIII[1]];
                                        nArray[H.llIIIIII[0]] = llIIIIII[16];
                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[llIIIIII[1]];
                                        nArray9[H.llIIIIII[0]] = llIIIIII[16];
                                        if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[llIIIIII[1]];
                                    nArray[H.llIIIIII[0]] = llIIIIII[42];
                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[llIIIIII[1]];
                                    nArray10[H.llIIIIII[0]] = llIIIIII[42];
                                    if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[llIIIIII[1]];
                                nArray[H.llIIIIII[0]] = llIIIIII[44];
                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[llIIIIII[1]];
                                nArray11[H.llIIIIII[0]] = llIIIIII[44];
                                if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[llIIIIII[1]];
                            nArray[H.llIIIIII[0]] = llIIIIII[40];
                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[llIIIIII[1]];
                            nArray12[H.llIIIIII[0]] = llIIIIII[40];
                            if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[llIIIIII[1]];
                        nArray[H.llIIIIII[0]] = llIIIIII[45];
                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[llIIIIII[1]];
                        nArray13[H.llIIIIII[0]] = llIIIIII[45];
                        if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[llIIIIII[1]];
                    nArray[H.llIIIIII[0]] = llIIIIII[47];
                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[llIIIIII[1]];
                    nArray14[H.llIIIIII[0]] = llIIIIII[47];
                    if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[llIIIIII[1]];
                nArray[H.llIIIIII[0]] = llIIIIII[49];
                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[llIIIIII[1]];
                nArray15[H.llIIIIII[0]] = llIIIIII[49];
                if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[llIIIIII[1]];
            nArray[H.llIIIIII[0]] = llIIIIII[11];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIIIIII[1];

                if (2 >= 1) return n2 != 0;
                return ((0x40 ^ 0x1A ^ (0xA ^ 0x48)) & (99 + 120 - 110 + 36 ^ 119 + 11 - 102 + 109 ^ -1)) != 0;
            }
        }
        n2 = llIIIIII[0];
        return n2 != 0;
    }

    private static boolean lIlIIIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIlIll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(lIlIllIIlllIIll);
    }

    static {
        H.lIlIIIIIllI();
        H.lIlIIIIIIll();
        bB = new ArrayList<d>();
        int[] nArray = new int[llIIIIII[18]];
        nArray[H.llIIIIII[0]] = llIIIIII[16];
        nArray[H.llIIIIII[1]] = llIIIIII[17];
        nArray[H.llIIIIII[3]] = llIIIIII[42];
        nArray[H.llIIIIII[4]] = llIIIIII[44];
        nArray[H.llIIIIII[6]] = llIIIIII[40];
        nArray[H.llIIIIII[10]] = llIIIIII[45];
        nArray[H.llIIIIII[14]] = llIIIIII[47];
        nArray[H.llIIIIII[15]] = llIIIIII[49];
        iB = nArray;
        iC = new WorldArea(llIIIIII[59], llIIIIII[60], llIIIIII[22], llIIIIII[22], llIIIIII[0]);
        iD = new WorldArea(llIIIIII[61], llIIIIII[62], llIIIIII[32], llIIIIII[26], llIIIIII[0]);
        iE = new WorldArea(llIIIIII[63], llIIIIII[64], llIIIIII[65], llIIIIII[34], llIIIIII[0]);
        iF = new WorldPoint(llIIIIII[66], llIIIIII[67], llIIIIII[0]);
        bD = new WorldPoint(llIIIIII[68], llIIIIII[60], llIIIIII[0]);
        iG = new WorldPoint(llIIIIII[69], llIIIIII[70], llIIIIII[0]);
    }

    private static boolean lIlIIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIII[2])) {
            bl = llIIIIII[1];

            if (((0x45 ^ 0x5C ^ (0x4E ^ 0x67)) & (0x5C ^ 0x17 ^ (0x2B ^ 0x50) ^ -1)) != 0) {
                return ((0x19 ^ 0x10 ^ (0x51 ^ 0x7C)) & (3 ^ (0x9E ^ 0xB9) ^ -1)) != 0;
            }
        } else {
            bl = llIIIIII[0];
        }
        return bl;
    }

    public static void ag() {
        d lIlIllIlIlIIIII;
        int[] nArray = new int[llIIIIII[1]];
        nArray[H.llIIIIII[0]] = llIIIIII[9];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIIIII[9], llIIIIII[2], llIIIIII[51]);
            bB.add(d2);

        }
        int[] nArray2 = new int[llIIIIII[1]];
        nArray2[H.llIIIIII[0]] = llIIIIII[52];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIllIlIlIIIII = new DHelper(llIIIIII[52], llIIIIII[10], llIIIIII[51]);
            bB.add(lIlIllIlIlIIIII);

        }
        int[] nArray3 = new int[llIIIIII[1]];
        nArray3[H.llIIIIII[0]] = llIIIIII[49];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIllIlIlIIIII = new DHelper(llIIIIII[49], llIIIIII[1], llIIIIII[53]);
            bB.add(lIlIllIlIlIIIII);

        }
        int[] nArray4 = new int[llIIIIII[1]];
        nArray4[H.llIIIIII[0]] = llIIIIII[47];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIllIlIlIIIII = new DHelper(llIIIIII[47], llIIIIII[1], llIIIIII[54]);
            bB.add(lIlIllIlIlIIIII);

        }
        int[] nArray5 = new int[llIIIIII[1]];
        nArray5[H.llIIIIII[0]] = llIIIIII[11];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlIllIlIlIIIII = new DHelper(llIIIIII[11], llIIIIII[12], llIIIIII[55]);
            bB.add(lIlIllIlIlIIIII);

        }
        int[] nArray6 = new int[llIIIIII[1]];
        nArray6[H.llIIIIII[0]] = llIIIIII[40];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlIllIlIlIIIII = new DHelper(llIIIIII[40], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);

        }
        int[] nArray7 = new int[llIIIIII[1]];
        nArray7[H.llIIIIII[0]] = llIIIIII[44];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlIllIlIlIIIII = new DHelper(llIIIIII[44], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);

        }
        int[] nArray8 = new int[llIIIIII[1]];
        nArray8[H.llIIIIII[0]] = llIIIIII[45];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIlIllIlIlIIIII = new DHelper(llIIIIII[45], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);

        }
        int[] nArray9 = new int[llIIIIII[1]];
        nArray9[H.llIIIIII[0]] = llIIIIII[42];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIlIllIlIlIIIII = new DHelper(llIIIIII[42], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);

        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) {
            int[] nArray10 = new int[llIIIIII[1]];
            nArray10[H.llIIIIII[0]] = llIIIIII[17];
            if (H.lIlIIIIlIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                lIlIllIlIlIIIII = new DHelper(llIIIIII[17], llIIIIII[1], llIIIIII[54]);
                bB.add(lIlIllIlIlIIIII);

            }
        }
        int[] nArray11 = new int[llIIIIII[1]];
        nArray11[H.llIIIIII[0]] = llIIIIII[16];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lIlIllIlIlIIIII = new DHelper(llIIIIII[16], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);

        }
    }

    private static boolean lIlIIIlIIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void cu() {
        block17: {
            block19: {
                block18: {
                    if (H.lIlIIIIlIIl(bz ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlllllI[llIIIIII[0]];
                        b.a(bB);
                        if (H.lIlIIIIlIlI(bB.size(), llIIIIII[1])) {
                            System.out.println(lIlllllI[llIIIIII[1]]);
                            bz = llIIIIII[0];
                        }
                    }
                    if (!H.lIlIIIIlIll(bz ? 1 : 0)) break block17;
                    if (H.lIlIIIIlIll(H.bm() ? 1 : 0) && H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIII[2])) {
                        BankLocation lIlIllIlIlIIllI = BankLocation.getNearest();
                        if (H.lIlIIIIllII(lIlIllIlIlIIllI) && H.lIlIIIIlIll(lIlIllIlIlIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lIlllllI[llIIIIII[3]];
                            a.a(lIlIllIlIlIIllI);
                        }
                        if (H.lIlIIIIllII(lIlIllIlIlIIllI) && H.lIlIIIIlIIl(lIlIllIlIlIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lIlllllI[llIIIIII[4]];
                            if (H.lIlIIIIlIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIII[5]);

                            }
                            if (H.lIlIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                if (H.lIlIIIIllIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIIIII[1]);

                                }
                                if (H.lIlIIIIllIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIIIII[3]);

                                }
                                if (H.lIlIIIIlIll(H.cw() ? 1 : 0)) {
                                    H.ag();
                                    System.out.println(lIlllllI[llIIIIII[6]]);
                                    bz = llIIIIII[1];
                                    return;
                                }
                                a.a(iB, llIIIIII[1]);
                                a.a(llIIIIII[7], llIIIIII[8]);
                                a.b(f.bb, llIIIIII[1]);
                                a.a(llIIIIII[9], llIIIIII[10]);
                                a.a(llIIIIII[11], llIIIIII[12]);
                            }
                        }
                    }
                    if (!H.lIlIIIIlIIl(H.bm() ? 1 : 0)) break block17;
                    H.cv();
                    if (H.lIlIIIIlllI(Movement.getRunEnergy(), llIIIIII[13]) && H.lIlIIIIlIll(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[llIIIIII[1]];
                    stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[10]];
                    if (!H.lIlIIIIlIll(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[llIIIIII[1]];
                    stringArray2[H.llIIIIII[0]] = lIlllllI[llIIIIII[14]];
                    if (!H.lIlIIIIlIll(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[llIIIIII[1]];
                    stringArray3[H.llIIIIII[0]] = lIlllllI[llIIIIII[15]];
                    if (!H.lIlIIIIlIll(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[llIIIIII[1]];
                    nArray[H.llIIIIII[0]] = llIIIIII[16];
                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[llIIIIII[1]];
                    nArray2[H.llIIIIII[0]] = llIIIIII[17];
                    if (!H.lIlIIIIlIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                H.cx();
            }
            if (H.lIlIIIIllll(H.lIlIIIIlIII(e.v(), 45.0))) {
                int[] nArray = new int[llIIIIII[1]];
                nArray[H.llIIIIII[0]] = llIIIIII[11];
                if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIIIII[1]];
                    nArray3[H.llIIIIII[0]] = llIIIIII[11];
                    Inventory.getFirst((int[])nArray3).interact(lIlllllI[llIIIIII[18]]);
                    Time.sleepTicks((int)llIIIIII[1]);

                }
            }
            if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[19]) && H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.STRENGTH), llIIIIII[19])) {
                j.R();
            }
        }
    }

    private static int lIlIIIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean T() {
        return llIIIIII[0];
    }

    private static boolean lIlIIIIllll(int n2) {
        return n2 < 0;
    }

    private static void lIlIIIIIIll() {
        lIlllllI = new String[llIIIIII[71]];
        H.lIlllllI[H.llIIIIII[0]] = "Buying items";
        H.lIlllllI[H.llIIIIII[1]] = "Finished buying items, switching back to melee training";
        H.lIlllllI[H.llIIIIII[3]] = "Navigating to bank";
        H.lIlllllI[H.llIIIIII[4]] = "Handling banking";
        H.lIlllllI[H.llIIIIII[6]] = "We are missing supplies, switching to BUYING";
        H.lIlllllI[H.llIIIIII[10]] = "Iron scimitar";
        H.lIlllllI[H.llIIIIII[14]] = "Steel scimitar";
        H.lIlllllI[H.llIIIIII[15]] = "Mithril scimitar";
        H.lIlllllI[H.llIIIIII[18]] = "Eat";
        H.lIlllllI[H.llIIIIII[20]] = "Walking to cow area";
        H.lIlllllI[H.llIIIIII[21]] = "Killing cows";
        H.lIlllllI[H.llIIIIII[22]] = "Cow";
        H.lIlllllI[H.llIIIIII[23]] = "cow";
        H.lIlllllI[H.llIIIIII[24]] = "Attack";
        H.lIlllllI[H.llIIIIII[25]] = "Attack";
        H.lIlllllI[H.llIIIIII[13]] = "Auto retaliate";
        H.lIlllllI[H.llIIIIII[26]] = H.lIlIIIIIIIl("Ig8pLkqJUwk=", "psqbZ");
        H.lIlllllI[H.llIIIIII[29]] = "Iron scimitar";
        H.lIlllllI[H.llIIIIII[30]] = "Iron scimitar";
        H.lIlllllI[H.llIIIIII[31]] = "Wield";
        H.lIlllllI[H.llIIIIII[19]] = "Steel scimitar";
        H.lIlllllI[H.llIIIIII[32]] = "Steel scimitar";
        H.lIlllllI[H.llIIIIII[33]] = "Wield";
        H.lIlllllI[H.llIIIIII[35]] = "Mithril scimitar";
        H.lIlllllI[H.llIIIIII[36]] = "Mithril scimitar";
        H.lIlllllI[H.llIIIIII[37]] = "Wield";
        H.lIlllllI[H.llIIIIII[38]] = "Wield";
        H.lIlllllI[H.llIIIIII[39]] = "Wield";
        H.lIlllllI[H.llIIIIII[41]] = "Wear";
        H.lIlllllI[H.llIIIIII[43]] = "Wear";
        H.lIlllllI[H.llIIIIII[34]] = "Wear";
        H.lIlllllI[H.llIIIIII[46]] = "Wear";
        H.lIlllllI[H.llIIIIII[48]] = "Wear";
        H.lIlllllI[H.llIIIIII[50]] = "Wear";
        H.lIlllllI[H.llIIIIII[57]] = "40 Def";
        H.lIlllllI[H.llIIIIII[58]] = "Cow";
    }

    private static boolean lIlIIIIllII(Object object) {
        return object != null;
    }

    public static void ab() {
        if (H.lIlIIIIlIll(iD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIlllllI[llIIIIII[20]];
            Movement.walkTo((WorldPoint)bD);

            Time.sleepTicks((int)llIIIIII[1]);

        }
        if (H.lIlIIIIlIIl(iD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIlllllI[llIIIIII[21]];
            if (H.lIlIIIlIIII(Players.getLocal().getInteracting())) {
                NPC lIlIllIlIlIIIll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (H.lIlIIIIlIIl(nPC.getName().contains(lIlllllI[llIIIIII[58]]) ? 1 : 0) && H.lIlIIIlIIII(nPC.getInteracting()) && H.lIlIIIIlIll(nPC.isDead() ? 1 : 0)) {
                        n2 = llIIIIII[1];

                        if (((0x38 ^ 0x17 ^ (0x9E ^ 0x95)) & (128 + 13 - 69 + 74 ^ 20 + 80 - 84 + 166 ^ -1)) != 0) {
                            return ((0x45 ^ 0x53 ^ (4 ^ 0x31)) & (0xBE ^ 0x8E ^ (0x89 ^ 0x9A) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIIIII[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[llIIIIII[3]];
                stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[22]];
                stringArray[H.llIIIIII[1]] = lIlllllI[llIIIIII[23]];
                List lIlIllIlIlIIIlI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (H.lIlIIIlIlII(nPC.getInteracting(), Players.getLocal())) {
                        bl = llIIIIII[1];

                        }
                    } else {
                        bl = llIIIIII[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (H.lIlIIIIlIll(lIlIllIlIlIIIlI.isEmpty() ? 1 : 0)) {
                    ((NPC)lIlIllIlIlIIIlI.get(llIIIIII[0])).interact(lIlllllI[llIIIIII[24]]);
                    Time.sleepTicks((int)llIIIIII[3]);

                }
                if (H.lIlIIIIllII(lIlIllIlIlIIIll) && H.lIlIIIIlIll(Players.getLocal().isMoving() ? 1 : 0) && H.lIlIIIIlIIl(lIlIllIlIlIIIlI.isEmpty() ? 1 : 0)) {
                    lIlIllIlIlIIIll.interact(lIlllllI[llIIIIII[25]]);
                    Time.sleepTicks((int)llIIIIII[3]);

                }
            }
            if (H.lIlIIIIllII(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)llIIIIII[6]);

            }
        }
    }

    public static void cx() {
        if (H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIII[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean lIlIIIIllIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean cw() {
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
                                                                                    if (!H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) break block4;
                                                                                    int[] nArray = new int[llIIIIII[1]];
                                                                                    nArray[H.llIIIIII[0]] = llIIIIII[17];
                                                                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[llIIIIII[1]];
                                                                                    nArray2[H.llIIIIII[0]] = llIIIIII[17];
                                                                                    if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[llIIIIII[1]];
                                                                                    nArray3[H.llIIIIII[0]] = llIIIIII[17];
                                                                                    if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[llIIIIII[1]];
                                                                                nArray[H.llIIIIII[0]] = llIIIIII[42];
                                                                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[llIIIIII[1]];
                                                                                nArray4[H.llIIIIII[0]] = llIIIIII[42];
                                                                                if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[llIIIIII[1]];
                                                                                nArray5[H.llIIIIII[0]] = llIIIIII[42];
                                                                                if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[llIIIIII[1]];
                                                                            nArray[H.llIIIIII[0]] = llIIIIII[44];
                                                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[llIIIIII[1]];
                                                                            nArray6[H.llIIIIII[0]] = llIIIIII[44];
                                                                            if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[llIIIIII[1]];
                                                                            nArray7[H.llIIIIII[0]] = llIIIIII[44];
                                                                            if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[llIIIIII[1]];
                                                                        nArray[H.llIIIIII[0]] = llIIIIII[40];
                                                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[llIIIIII[1]];
                                                                        nArray8[H.llIIIIII[0]] = llIIIIII[40];
                                                                        if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[llIIIIII[1]];
                                                                        nArray9[H.llIIIIII[0]] = llIIIIII[40];
                                                                        if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[llIIIIII[1]];
                                                                    nArray[H.llIIIIII[0]] = llIIIIII[45];
                                                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[llIIIIII[1]];
                                                                    nArray10[H.llIIIIII[0]] = llIIIIII[45];
                                                                    if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[llIIIIII[1]];
                                                                    nArray11[H.llIIIIII[0]] = llIIIIII[45];
                                                                    if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[llIIIIII[1]];
                                                                nArray[H.llIIIIII[0]] = llIIIIII[47];
                                                                if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[llIIIIII[1]];
                                                                nArray12[H.llIIIIII[0]] = llIIIIII[47];
                                                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[llIIIIII[1]];
                                                                nArray13[H.llIIIIII[0]] = llIIIIII[47];
                                                                if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[llIIIIII[1]];
                                                            nArray[H.llIIIIII[0]] = llIIIIII[49];
                                                            if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[llIIIIII[1]];
                                                            nArray14[H.llIIIIII[0]] = llIIIIII[49];
                                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[llIIIIII[1]];
                                                            nArray15[H.llIIIIII[0]] = llIIIIII[49];
                                                            if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[llIIIIII[1]];
                                                        nArray[H.llIIIIII[0]] = llIIIIII[11];
                                                        if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[llIIIIII[1]];
                                                        nArray16[H.llIIIIII[0]] = llIIIIII[11];
                                                        if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = llIIIIII[1];

                                                    if (((0x72 ^ 0x64) & ~(0x39 ^ 0x2F)) == 0) return n3 != 0;
                                                    return false;
                                                }
                                                n3 = llIIIIII[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[llIIIIII[1]];
                                            nArray[H.llIIIIII[0]] = llIIIIII[16];
                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[llIIIIII[1]];
                                            nArray17[H.llIIIIII[0]] = llIIIIII[16];
                                            if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[llIIIIII[1]];
                                            nArray18[H.llIIIIII[0]] = llIIIIII[16];
                                            if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[llIIIIII[1]];
                                        nArray[H.llIIIIII[0]] = llIIIIII[42];
                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[llIIIIII[1]];
                                        nArray19[H.llIIIIII[0]] = llIIIIII[42];
                                        if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[llIIIIII[1]];
                                        nArray20[H.llIIIIII[0]] = llIIIIII[42];
                                        if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[llIIIIII[1]];
                                    nArray[H.llIIIIII[0]] = llIIIIII[44];
                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[llIIIIII[1]];
                                    nArray21[H.llIIIIII[0]] = llIIIIII[44];
                                    if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[llIIIIII[1]];
                                    nArray22[H.llIIIIII[0]] = llIIIIII[44];
                                    if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[llIIIIII[1]];
                                nArray[H.llIIIIII[0]] = llIIIIII[40];
                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[llIIIIII[1]];
                                nArray23[H.llIIIIII[0]] = llIIIIII[40];
                                if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[llIIIIII[1]];
                                nArray24[H.llIIIIII[0]] = llIIIIII[40];
                                if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[llIIIIII[1]];
                            nArray[H.llIIIIII[0]] = llIIIIII[45];
                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[llIIIIII[1]];
                            nArray25[H.llIIIIII[0]] = llIIIIII[45];
                            if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[llIIIIII[1]];
                            nArray26[H.llIIIIII[0]] = llIIIIII[45];
                            if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[llIIIIII[1]];
                        nArray[H.llIIIIII[0]] = llIIIIII[47];
                        if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[llIIIIII[1]];
                        nArray27[H.llIIIIII[0]] = llIIIIII[47];
                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[llIIIIII[1]];
                        nArray28[H.llIIIIII[0]] = llIIIIII[47];
                        if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[llIIIIII[1]];
                    nArray[H.llIIIIII[0]] = llIIIIII[49];
                    if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[llIIIIII[1]];
                    nArray29[H.llIIIIII[0]] = llIIIIII[49];
                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[llIIIIII[1]];
                    nArray30[H.llIIIIII[0]] = llIIIIII[49];
                    if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[llIIIIII[1]];
                nArray[H.llIIIIII[0]] = llIIIIII[11];
                if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[llIIIIII[1]];
                nArray31[H.llIIIIII[0]] = llIIIIII[11];
                if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = llIIIIII[1];

            if ((0x70 ^ 0x56 ^ (0x7E ^ 0x5C)) > 1) return n2 != 0;
            return ((138 + 123 - 174 + 127 ^ 4 + 97 - 63 + 111) & (0x2F ^ 0 ^ (0x55 ^ 0x39) ^ -1)) != 0;
        }
        n2 = llIIIIII[0];
        return n2 != 0;
    }

}

