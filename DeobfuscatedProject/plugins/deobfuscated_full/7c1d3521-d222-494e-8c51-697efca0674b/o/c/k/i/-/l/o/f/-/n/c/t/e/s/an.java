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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.l;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.p;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.r;

public class an
implements ac {
    private static /* synthetic */ int[] llIlIlIllI;
    public static /* synthetic */ WorldArea cM;
    public static /* synthetic */ int[] cK;
    public static /* synthetic */ WorldPoint ck;
    private static /* synthetic */ String[] llIlIlIlIl;
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ int[] np;
    public static /* synthetic */ WorldArea cL;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint cO;
    public static /* synthetic */ WorldPoint cP;
    public static /* synthetic */ List<d> bv;

    private static boolean lIllIIllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String ag() {
        return llIlIlIlIl[llIlIlIllI[86]];
    }

    private static String lIllIIllIlIII(String var4, String var3) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llIlIlIllI[20]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(llIlIlIllI[4], var13);
            return new String(var21.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ae() {
        return llIlIlIllI[0];
    }

    private static boolean lIllIIllllIll(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aN() {
        int n2;
        block28: {
            block35: {
                block34: {
                    block33: {
                        block32: {
                            block31: {
                                block30: {
                                    block29: {
                                        block27: {
                                            block17: {
                                                int n3;
                                                block19: {
                                                    block26: {
                                                        block25: {
                                                            block24: {
                                                                block23: {
                                                                    block22: {
                                                                        block21: {
                                                                            block20: {
                                                                                block18: {
                                                                                    block6: {
                                                                                        int n4;
                                                                                        block8: {
                                                                                            block16: {
                                                                                                block15: {
                                                                                                    block14: {
                                                                                                        block13: {
                                                                                                            block12: {
                                                                                                                block11: {
                                                                                                                    block10: {
                                                                                                                        block9: {
                                                                                                                            block7: {
                                                                                                                                if (!an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) || !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) || !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2])) break block6;
                                                                                                                                int[] nArray = new int[llIlIlIllI[1]];
                                                                                                                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[19];
                                                                                                                                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                                                                int[] nArray2 = new int[llIlIlIllI[1]];
                                                                                                                                nArray2[an.llIlIlIllI[0]] = llIlIlIllI[19];
                                                                                                                                if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block7;
                                                                                                                                int[] nArray3 = new int[llIlIlIllI[1]];
                                                                                                                                nArray3[an.llIlIlIllI[0]] = llIlIlIllI[19];
                                                                                                                                if (!an.lIllIIlllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) break block8;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[llIlIlIllI[1]];
                                                                                                                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[36];
                                                                                                                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                                                                            int[] nArray4 = new int[llIlIlIllI[1]];
                                                                                                                            nArray4[an.llIlIlIllI[0]] = llIlIlIllI[36];
                                                                                                                            if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block9;
                                                                                                                            int[] nArray5 = new int[llIlIlIllI[1]];
                                                                                                                            nArray5[an.llIlIlIllI[0]] = llIlIlIllI[36];
                                                                                                                            if (!an.lIllIIlllIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block8;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[llIlIlIllI[1]];
                                                                                                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[37];
                                                                                                                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                                                                        int[] nArray6 = new int[llIlIlIllI[1]];
                                                                                                                        nArray6[an.llIlIlIllI[0]] = llIlIlIllI[37];
                                                                                                                        if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                                                                                        int[] nArray7 = new int[llIlIlIllI[1]];
                                                                                                                        nArray7[an.llIlIlIllI[0]] = llIlIlIllI[37];
                                                                                                                        if (!an.lIllIIlllIlll(Bank.contains((int[])nArray7) ? 1 : 0)) break block8;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[llIlIlIllI[1]];
                                                                                                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[35];
                                                                                                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                                                                    int[] nArray8 = new int[llIlIlIllI[1]];
                                                                                                                    nArray8[an.llIlIlIllI[0]] = llIlIlIllI[35];
                                                                                                                    if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block11;
                                                                                                                    int[] nArray9 = new int[llIlIlIllI[1]];
                                                                                                                    nArray9[an.llIlIlIllI[0]] = llIlIlIllI[35];
                                                                                                                    if (!an.lIllIIlllIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block8;
                                                                                                                }
                                                                                                                int[] nArray = new int[llIlIlIllI[1]];
                                                                                                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[39];
                                                                                                                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                                                                int[] nArray10 = new int[llIlIlIllI[1]];
                                                                                                                nArray10[an.llIlIlIllI[0]] = llIlIlIllI[39];
                                                                                                                if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block12;
                                                                                                                int[] nArray11 = new int[llIlIlIllI[1]];
                                                                                                                nArray11[an.llIlIlIllI[0]] = llIlIlIllI[39];
                                                                                                                if (!an.lIllIIlllIlll(Bank.contains((int[])nArray11) ? 1 : 0)) break block8;
                                                                                                            }
                                                                                                            int[] nArray = new int[llIlIlIllI[1]];
                                                                                                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[38];
                                                                                                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                                                            int[] nArray12 = new int[llIlIlIllI[1]];
                                                                                                            nArray12[an.llIlIlIllI[0]] = llIlIlIllI[38];
                                                                                                            if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) break block13;
                                                                                                            int[] nArray13 = new int[llIlIlIllI[1]];
                                                                                                            nArray13[an.llIlIlIllI[0]] = llIlIlIllI[38];
                                                                                                            if (!an.lIllIIlllIlll(Bank.contains((int[])nArray13) ? 1 : 0)) break block8;
                                                                                                        }
                                                                                                        int[] nArray = new int[llIlIlIllI[1]];
                                                                                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[34];
                                                                                                        if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block14;
                                                                                                        int[] nArray14 = new int[llIlIlIllI[1]];
                                                                                                        nArray14[an.llIlIlIllI[0]] = llIlIlIllI[34];
                                                                                                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray14) ? 1 : 0)) break block14;
                                                                                                        int[] nArray15 = new int[llIlIlIllI[1]];
                                                                                                        nArray15[an.llIlIlIllI[0]] = llIlIlIllI[34];
                                                                                                        if (!an.lIllIIlllIlll(Bank.contains((int[])nArray15) ? 1 : 0)) break block8;
                                                                                                    }
                                                                                                    int[] nArray = new int[llIlIlIllI[1]];
                                                                                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                                                                    if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block15;
                                                                                                    int[] nArray16 = new int[llIlIlIllI[1]];
                                                                                                    nArray16[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                                                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray16) ? 1 : 0)) break block15;
                                                                                                    int[] nArray17 = new int[llIlIlIllI[1]];
                                                                                                    nArray17[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                                                                    if (!an.lIllIIlllIlll(Bank.contains((int[])nArray17) ? 1 : 0)) break block8;
                                                                                                }
                                                                                                int[] nArray = new int[llIlIlIllI[1]];
                                                                                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[12];
                                                                                                if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block16;
                                                                                                int[] nArray18 = new int[llIlIlIllI[1]];
                                                                                                nArray18[an.llIlIlIllI[0]] = llIlIlIllI[12];
                                                                                                if (!an.lIllIIlllIlll(Bank.contains((int[])nArray18) ? 1 : 0)) break block8;
                                                                                            }
                                                                                            n4 = llIlIlIllI[1];
                                                                                            0;
                                                                                            if (-3 <= 0) return n4 != 0;
                                                                                            return false;
                                                                                        }
                                                                                        n4 = llIlIlIllI[0];
                                                                                        return n4 != 0;
                                                                                    }
                                                                                    if ((!an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) || an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2])) && (!an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) || !an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]))) break block17;
                                                                                    int[] nArray = new int[llIlIlIllI[1]];
                                                                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[18];
                                                                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                                                                    int[] nArray19 = new int[llIlIlIllI[1]];
                                                                                    nArray19[an.llIlIlIllI[0]] = llIlIlIllI[18];
                                                                                    if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) break block18;
                                                                                    int[] nArray20 = new int[llIlIlIllI[1]];
                                                                                    nArray20[an.llIlIlIllI[0]] = llIlIlIllI[18];
                                                                                    if (!an.lIllIIlllIlll(Bank.contains((int[])nArray20) ? 1 : 0)) break block19;
                                                                                }
                                                                                int[] nArray = new int[llIlIlIllI[1]];
                                                                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                                                                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                int[] nArray21 = new int[llIlIlIllI[1]];
                                                                                nArray21[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                                                                if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) break block20;
                                                                                int[] nArray22 = new int[llIlIlIllI[1]];
                                                                                nArray22[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                                                                if (!an.lIllIIlllIlll(Bank.contains((int[])nArray22) ? 1 : 0)) break block19;
                                                                            }
                                                                            int[] nArray = new int[llIlIlIllI[1]];
                                                                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                                                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                            int[] nArray23 = new int[llIlIlIllI[1]];
                                                                            nArray23[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                                                            if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray23) ? 1 : 0)) break block21;
                                                                            int[] nArray24 = new int[llIlIlIllI[1]];
                                                                            nArray24[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                                                            if (!an.lIllIIlllIlll(Bank.contains((int[])nArray24) ? 1 : 0)) break block19;
                                                                        }
                                                                        int[] nArray = new int[llIlIlIllI[1]];
                                                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[52];
                                                                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                        int[] nArray25 = new int[llIlIlIllI[1]];
                                                                        nArray25[an.llIlIlIllI[0]] = llIlIlIllI[52];
                                                                        if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray25) ? 1 : 0)) break block22;
                                                                        int[] nArray26 = new int[llIlIlIllI[1]];
                                                                        nArray26[an.llIlIlIllI[0]] = llIlIlIllI[52];
                                                                        if (!an.lIllIIlllIlll(Bank.contains((int[])nArray26) ? 1 : 0)) break block19;
                                                                    }
                                                                    int[] nArray = new int[llIlIlIllI[1]];
                                                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[58];
                                                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                    int[] nArray27 = new int[llIlIlIllI[1]];
                                                                    nArray27[an.llIlIlIllI[0]] = llIlIlIllI[58];
                                                                    if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) break block23;
                                                                    int[] nArray28 = new int[llIlIlIllI[1]];
                                                                    nArray28[an.llIlIlIllI[0]] = llIlIlIllI[58];
                                                                    if (!an.lIllIIlllIlll(Bank.contains((int[])nArray28) ? 1 : 0)) break block19;
                                                                }
                                                                int[] nArray = new int[llIlIlIllI[1]];
                                                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[60];
                                                                if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block24;
                                                                int[] nArray29 = new int[llIlIlIllI[1]];
                                                                nArray29[an.llIlIlIllI[0]] = llIlIlIllI[60];
                                                                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray29) ? 1 : 0)) break block24;
                                                                int[] nArray30 = new int[llIlIlIllI[1]];
                                                                nArray30[an.llIlIlIllI[0]] = llIlIlIllI[60];
                                                                if (!an.lIllIIlllIlll(Bank.contains((int[])nArray30) ? 1 : 0)) break block19;
                                                            }
                                                            int[] nArray = new int[llIlIlIllI[1]];
                                                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                            if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                            int[] nArray31 = new int[llIlIlIllI[1]];
                                                            nArray31[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray31) ? 1 : 0)) break block25;
                                                            int[] nArray32 = new int[llIlIlIllI[1]];
                                                            nArray32[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                            if (!an.lIllIIlllIlll(Bank.contains((int[])nArray32) ? 1 : 0)) break block19;
                                                        }
                                                        int[] nArray = new int[llIlIlIllI[1]];
                                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[12];
                                                        if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                                                        int[] nArray33 = new int[llIlIlIllI[1]];
                                                        nArray33[an.llIlIlIllI[0]] = llIlIlIllI[12];
                                                        if (!an.lIllIIlllIlll(Bank.contains((int[])nArray33) ? 1 : 0)) break block19;
                                                    }
                                                    n3 = llIlIlIllI[1];
                                                    0;
                                                    if ((0x4A ^ 0x29 ^ (0x60 ^ 6)) > 0) return n3 != 0;
                                                    return ((0xA9 ^ 0xB7 ^ (0x73 ^ 0x49)) & (0x12 ^ 0x38 ^ (0x7F ^ 0x71) ^ -1)) != 0;
                                                }
                                                n3 = llIlIlIllI[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[llIlIlIllI[1]];
                                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[17];
                                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                                            int[] nArray34 = new int[llIlIlIllI[1]];
                                            nArray34[an.llIlIlIllI[0]] = llIlIlIllI[17];
                                            if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray34) ? 1 : 0)) break block27;
                                            int[] nArray35 = new int[llIlIlIllI[1]];
                                            nArray35[an.llIlIlIllI[0]] = llIlIlIllI[17];
                                            if (!an.lIllIIlllIlll(Bank.contains((int[])nArray35) ? 1 : 0)) break block28;
                                        }
                                        int[] nArray = new int[llIlIlIllI[1]];
                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block29;
                                        int[] nArray36 = new int[llIlIlIllI[1]];
                                        nArray36[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                        if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray36) ? 1 : 0)) break block29;
                                        int[] nArray37 = new int[llIlIlIllI[1]];
                                        nArray37[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                        if (!an.lIllIIlllIlll(Bank.contains((int[])nArray37) ? 1 : 0)) break block28;
                                    }
                                    int[] nArray = new int[llIlIlIllI[1]];
                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray38 = new int[llIlIlIllI[1]];
                                    nArray38[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                    if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray38) ? 1 : 0)) break block30;
                                    int[] nArray39 = new int[llIlIlIllI[1]];
                                    nArray39[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                    if (!an.lIllIIlllIlll(Bank.contains((int[])nArray39) ? 1 : 0)) break block28;
                                }
                                int[] nArray = new int[llIlIlIllI[1]];
                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[52];
                                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray40 = new int[llIlIlIllI[1]];
                                nArray40[an.llIlIlIllI[0]] = llIlIlIllI[52];
                                if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray40) ? 1 : 0)) break block31;
                                int[] nArray41 = new int[llIlIlIllI[1]];
                                nArray41[an.llIlIlIllI[0]] = llIlIlIllI[52];
                                if (!an.lIllIIlllIlll(Bank.contains((int[])nArray41) ? 1 : 0)) break block28;
                            }
                            int[] nArray = new int[llIlIlIllI[1]];
                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[58];
                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray42 = new int[llIlIlIllI[1]];
                            nArray42[an.llIlIlIllI[0]] = llIlIlIllI[58];
                            if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray42) ? 1 : 0)) break block32;
                            int[] nArray43 = new int[llIlIlIllI[1]];
                            nArray43[an.llIlIlIllI[0]] = llIlIlIllI[58];
                            if (!an.lIllIIlllIlll(Bank.contains((int[])nArray43) ? 1 : 0)) break block28;
                        }
                        int[] nArray = new int[llIlIlIllI[1]];
                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[60];
                        if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray44 = new int[llIlIlIllI[1]];
                        nArray44[an.llIlIlIllI[0]] = llIlIlIllI[60];
                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray44) ? 1 : 0)) break block33;
                        int[] nArray45 = new int[llIlIlIllI[1]];
                        nArray45[an.llIlIlIllI[0]] = llIlIlIllI[60];
                        if (!an.lIllIIlllIlll(Bank.contains((int[])nArray45) ? 1 : 0)) break block28;
                    }
                    int[] nArray = new int[llIlIlIllI[1]];
                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[62];
                    if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray46 = new int[llIlIlIllI[1]];
                    nArray46[an.llIlIlIllI[0]] = llIlIlIllI[62];
                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray46) ? 1 : 0)) break block34;
                    int[] nArray47 = new int[llIlIlIllI[1]];
                    nArray47[an.llIlIlIllI[0]] = llIlIlIllI[62];
                    if (!an.lIllIIlllIlll(Bank.contains((int[])nArray47) ? 1 : 0)) break block28;
                }
                int[] nArray = new int[llIlIlIllI[1]];
                nArray[an.llIlIlIllI[0]] = llIlIlIllI[12];
                if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                int[] nArray48 = new int[llIlIlIllI[1]];
                nArray48[an.llIlIlIllI[0]] = llIlIlIllI[12];
                if (!an.lIllIIlllIlll(Bank.contains((int[])nArray48) ? 1 : 0)) break block28;
            }
            n2 = llIlIlIllI[1];
            0;
            if (-(82 + 55 - 125 + 181 ^ 190 + 26 - 103 + 83) < 0) return n2 != 0;
            return ((0x3F ^ 0x7F ^ (0x42 ^ 0xB) & ~(0x34 ^ 0x7D)) & (0x2C ^ 0x24 ^ (7 ^ 0x4F) ^ -1)) != 0;
        }
        n2 = llIlIlIllI[0];
        return n2 != 0;
    }

    private static void lIllIIllIlIlI() {
        llIlIlIlIl = new String[llIlIlIllI[100]];
        an.llIlIlIlIl[an.llIlIlIllI[0]] = an."Buying items";
        an.llIlIlIlIl[an.llIlIlIllI[1]] = an."Finished buying items, switching back to melee training";
        an.llIlIlIlIl[an.llIlIlIllI[4]] = an."Navigating to bank";
        an.llIlIlIlIl[an.llIlIlIllI[5]] = an."Handling banking";
        an.llIlIlIlIl[an.llIlIlIllI[7]] = an."We are missing supplies, switching to BUYING";
        an.llIlIlIlIl[an.llIlIlIllI[11]] = an."Iron scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[15]] = an."Steel scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[16]] = an."Mithril scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[20]] = an."Eat";
        an.llIlIlIlIl[an.llIlIlIllI[23]] = an."Iron scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[22]] = an."Steel scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[24]] = an."Mithril scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[25]] = an."Walking to cow area";
        an.llIlIlIlIl[an.llIlIlIllI[26]] = an."Killing cows";
        an.llIlIlIlIl[an.llIlIlIllI[27]] = an."Cow";
        an.llIlIlIlIl[an.llIlIlIllI[14]] = an."cow";
        an.llIlIlIlIl[an.llIlIlIllI[28]] = an."Attack";
        an.llIlIlIlIl[an.llIlIlIllI[29]] = an."Attack";
        an.llIlIlIlIl[an.llIlIlIllI[30]] = an."Auto retaliate";
        an.llIlIlIlIl[an.llIlIlIllI[31]] = an."";
        an.llIlIlIlIl[an.llIlIlIllI[41]] = an."Iron scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[42]] = an."Iron scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[43]] = an."Wield";
        an.llIlIlIlIl[an.llIlIlIllI[44]] = an."Steel scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[45]] = an."Steel scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[46]] = an."Wield";
        an.llIlIlIlIl[an.llIlIlIllI[48]] = an."Mithril scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[49]] = an."Mithril scimitar";
        an.llIlIlIlIl[an.llIlIlIllI[50]] = an."Wield";
        an.llIlIlIlIl[an.llIlIlIllI[51]] = an."Wield";
        an.llIlIlIlIl[an.llIlIlIllI[47]] = an."Wield";
        an.llIlIlIlIl[an.llIlIlIllI[53]] = an."Wear";
        an.llIlIlIlIl[an.llIlIlIllI[55]] = an."Wear";
        an.llIlIlIlIl[an.llIlIlIllI[57]] = an."Wear";
        an.llIlIlIlIl[an.llIlIlIllI[59]] = an."Wear";
        an.llIlIlIlIl[an.llIlIlIllI[61]] = an."Wear";
        an.llIlIlIlIl[an.llIlIlIllI[63]] = an."Wear";
        an.llIlIlIlIl[an.llIlIlIllI[86]] = an."75/75/60 Melee";
        an.llIlIlIlIl[an.llIlIlIllI[87]] = an."Cow";
    }

    public static void aL() {
        if (an.lIllIlIIIIIII(Static.getClient().getVar(llIlIlIllI[24]), llIlIlIllI[1])) {
            Static.getClient().invokeMenuAction(llIlIlIlIl[llIlIlIllI[30]], llIlIlIlIl[llIlIlIllI[31]], llIlIlIllI[1], MenuAction.CC_OP.getId(), llIlIlIllI[32], llIlIlIllI[33]);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2])) {
            e.l(llIlIlIllI[19]);
            e.l(llIlIlIllI[34]);
            e.l(llIlIlIllI[35]);
            e.l(llIlIlIllI[36]);
            e.l(llIlIlIllI[37]);
            e.l(llIlIlIllI[38]);
            e.l(llIlIlIllI[39]);
            e.l(llIlIlIllI[40]);
        }
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[11])) {
            String[] stringArray = new String[llIlIlIllI[1]];
            stringArray[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[41]];
            if (an.lIllIIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIlIlIllI[1]];
                stringArray2[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[42]];
                Inventory.getFirst((String[])stringArray2).interact(llIlIlIlIl[llIlIlIllI[43]]);
            }
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[11]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[41])) {
            String[] stringArray = new String[llIlIlIllI[1]];
            stringArray[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[44]];
            if (an.lIllIIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[llIlIlIllI[1]];
                stringArray3[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[45]];
                Inventory.getFirst((String[])stringArray3).interact(llIlIlIlIl[llIlIlIllI[46]]);
            }
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[41]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[47])) {
            String[] stringArray = new String[llIlIlIllI[1]];
            stringArray[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[48]];
            if (an.lIllIIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[llIlIlIllI[1]];
                stringArray4[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[49]];
                Inventory.getFirst((String[])stringArray4).interact(llIlIlIlIl[llIlIlIllI[50]]);
            }
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[47]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21])) {
            int[] nArray = new int[llIlIlIllI[1]];
            nArray[an.llIlIlIllI[0]] = llIlIlIllI[17];
            if (an.lIllIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIlIllI[1]];
                nArray2[an.llIlIlIllI[0]] = llIlIlIllI[17];
                Inventory.getFirst((int[])nArray2).interact(llIlIlIlIl[llIlIlIllI[51]]);
            }
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21])) {
            int[] nArray = new int[llIlIlIllI[1]];
            nArray[an.llIlIlIllI[0]] = llIlIlIllI[18];
            if (an.lIllIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIlIlIllI[1]];
                nArray3[an.llIlIlIllI[0]] = llIlIlIllI[18];
                Inventory.getFirst((int[])nArray3).interact(llIlIlIlIl[llIlIlIllI[47]]);
            }
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[47])) {
            int[] nArray = new int[llIlIlIllI[1]];
            nArray[an.llIlIlIllI[0]] = llIlIlIllI[52];
            if (an.lIllIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[llIlIlIllI[1]];
                nArray4[an.llIlIlIllI[0]] = llIlIlIllI[52];
                Inventory.getFirst((int[])nArray4).interact(llIlIlIlIl[llIlIlIllI[53]]);
            }
            int[] nArray5 = new int[llIlIlIllI[1]];
            nArray5[an.llIlIlIllI[0]] = llIlIlIllI[54];
            if (an.lIllIIlllIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[llIlIlIllI[1]];
                nArray6[an.llIlIlIllI[0]] = llIlIlIllI[54];
                Inventory.getFirst((int[])nArray6).interact(llIlIlIlIl[llIlIlIllI[55]]);
            }
            int[] nArray7 = new int[llIlIlIllI[1]];
            nArray7[an.llIlIlIllI[0]] = llIlIlIllI[56];
            if (an.lIllIIlllIlll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[llIlIlIllI[1]];
                nArray8[an.llIlIlIllI[0]] = llIlIlIllI[56];
                Inventory.getFirst((int[])nArray8).interact(llIlIlIlIl[llIlIlIllI[57]]);
            }
            int[] nArray9 = new int[llIlIlIllI[1]];
            nArray9[an.llIlIlIllI[0]] = llIlIlIllI[58];
            if (an.lIllIIlllIlll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[llIlIlIllI[1]];
                nArray10[an.llIlIlIllI[0]] = llIlIlIllI[58];
                Inventory.getFirst((int[])nArray10).interact(llIlIlIlIl[llIlIlIllI[59]]);
            }
        }
        int[] nArray = new int[llIlIlIllI[1]];
        nArray[an.llIlIlIllI[0]] = llIlIlIllI[60];
        if (an.lIllIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[llIlIlIllI[1]];
            nArray11[an.llIlIlIllI[0]] = llIlIlIllI[60];
            Inventory.getFirst((int[])nArray11).interact(llIlIlIlIl[llIlIlIllI[61]]);
        }
        int[] nArray12 = new int[llIlIlIllI[1]];
        nArray12[an.llIlIlIllI[0]] = llIlIlIllI[62];
        if (an.lIllIIlllIlll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llIlIlIllI[1]];
            nArray13[an.llIlIlIllI[0]] = llIlIlIllI[62];
            Inventory.getFirst((int[])nArray13).interact(llIlIlIlIl[llIlIlIllI[63]]);
        }
    }

    private static void lIllIIlllIlIl() {
        llIlIlIllI = new int[101];
        an.llIlIlIllI[0] = (127 + 111 - 194 + 86 ^ 110 + 159 - 91 + 2) & (0x68 ^ 0x4C ^ (0x94 ^ 0x86) ^ -1);
        an.llIlIlIllI[1] = 1;
        an.llIlIlIllI[2] = 0x1C ^ 0x20;
        an.llIlIlIllI[3] = 0x74 ^ 0x3F;
        an.llIlIlIllI[4] = 2;
        an.llIlIlIllI[5] = 3;
        an.llIlIlIllI[6] = -(0xFFFFEC78 & 0x77EF) & (0xFFFFF7EF & Short.MAX_VALUE);
        an.llIlIlIllI[7] = 105 + 28 - 130 + 138 ^ 30 + 77 - 101 + 131;
        an.llIlIlIllI[8] = 0xFFFFD3F3 & 0x2FEF;
        an.llIlIlIllI[9] = -(0xFFFF9C3F & 0x6FD2) & (0xFFFF9FFD & 0x6FFB);
        an.llIlIlIllI[10] = 0xFFFFBFCF & 0x5F77;
        an.llIlIlIllI[11] = 0x52 ^ 0x57;
        an.llIlIlIllI[12] = 0xFFFFAB7B & 0x55FF;
        an.llIlIlIllI[13] = 0xEB ^ 0x8F;
        an.llIlIlIllI[14] = 26 + 51 - -55 + 42 ^ 45 + 20 - -63 + 33;
        an.llIlIlIllI[15] = 0x26 ^ 0x20;
        an.llIlIlIllI[16] = 0x66 ^ 0x11 ^ (0xD9 ^ 0xA9);
        an.llIlIlIllI[17] = 0xFFFFB7B3 & 0x4D7F;
        an.llIlIlIllI[18] = 0xFFFFC7FD & 0x3D37;
        an.llIlIlIllI[19] = -(0xFFFFFBE5 & 0x641B) & (0xFFFFFF7B & 0x79FF);
        an.llIlIlIllI[20] = 0x3D ^ 0x35;
        an.llIlIlIllI[21] = 0x68 ^ 0x40;
        an.llIlIlIllI[22] = 0xE ^ 0x49 ^ (0xD5 ^ 0x98);
        an.llIlIlIllI[23] = 0x65 ^ 1 ^ (0x3F ^ 0x52);
        an.llIlIlIllI[24] = 0xAA ^ 0xC7 ^ (0xFE ^ 0x98);
        an.llIlIlIllI[25] = 6 ^ 0xA;
        an.llIlIlIllI[26] = 0x55 ^ 0x58;
        an.llIlIlIllI[27] = 0x87 ^ 0x89;
        an.llIlIlIllI[28] = 0x8C ^ 0x9C;
        an.llIlIlIllI[29] = 0xD8 ^ 0xAF ^ (0xDA ^ 0xBC);
        an.llIlIlIllI[30] = 0x3E ^ 0x72 ^ (0x78 ^ 0x26);
        an.llIlIlIllI[31] = 0xD2 ^ 0xC1;
        an.llIlIlIllI[32] = -1;
        an.llIlIlIllI[33] = 0xFFFFD15F & 0x2512EBE;
        an.llIlIlIllI[34] = 0xFFFFFB7E & 0x2FF9;
        an.llIlIlIllI[35] = 0xFFFFDFB3 & 0x737E;
        an.llIlIlIllI[36] = 0xFFFFF7FD & 0x5B37;
        an.llIlIlIllI[37] = 0xFFFFD73A & 0x7BFD;
        an.llIlIlIllI[38] = -(0xFFFFE6EB & 0x1B1C) & (0xFFFF9FFF & 0x7BAF);
        an.llIlIlIllI[39] = 0xFFFFFBFE & 0x1D7D;
        an.llIlIlIllI[40] = -(0xFFFFDDBF & 0x73CF) & (0xFFFFFFDF & 0x7FEE);
        an.llIlIlIllI[41] = 0x47 ^ 0x57 ^ (0x3B ^ 0x3F);
        an.llIlIlIllI[42] = 0x9E ^ 0xB3 ^ (0x1E ^ 0x26);
        an.llIlIlIllI[43] = 0x1D ^ 0x65 ^ (0x1F ^ 0x71);
        an.llIlIlIllI[44] = 144 + 51 - 178 + 169 ^ 13 + 40 - 48 + 168;
        an.llIlIlIllI[45] = 0x81 ^ 0x99;
        an.llIlIlIllI[46] = 0x50 ^ 0x49;
        an.llIlIlIllI[47] = 0x7F ^ 0x61;
        an.llIlIlIllI[48] = 0x59 ^ 0x1A ^ (0xD0 ^ 0x89);
        an.llIlIlIllI[49] = 0x24 ^ 0x32 ^ (0x1D ^ 0x10);
        an.llIlIlIllI[50] = 96 + 103 - 97 + 43 ^ 43 + 110 - 93 + 81;
        an.llIlIlIllI[51] = 0x96 ^ 0x8B;
        an.llIlIlIllI[52] = -(0xFFFFF7CB & 0x7935) & (0xFFFFF7C9 & 0x7DBF);
        an.llIlIlIllI[53] = 0x83 ^ 0x9C;
        an.llIlIlIllI[54] = 0xFFFFA56B & 0x5EF7;
        an.llIlIlIllI[55] = 0x61 ^ 0x41;
        an.llIlIlIllI[56] = -(0xFFFFFBCD & 0x7DF7) & (0xFFFFFFF5 & 0x7DFF);
        an.llIlIlIllI[57] = 68 + 162 - 159 + 104 ^ 32 + 128 - 63 + 45;
        an.llIlIlIllI[58] = -(0xFFFFFAD3 & 0x5F7D) & (0xFFFFFFFF & 0x5EFF);
        an.llIlIlIllI[59] = 0x86 ^ 0xA4;
        an.llIlIlIllI[60] = 0xFFFFCEAC & 0x37FB;
        an.llIlIlIllI[61] = 0x8A ^ 0xA9;
        an.llIlIlIllI[62] = 0xFFFFAB76 & Short.MAX_VALUE;
        an.llIlIlIllI[63] = 0xB ^ 0x34 ^ (0x5B ^ 0x40);
        an.llIlIlIllI[64] = 0x9E ^ 0xAC;
        an.llIlIlIllI[65] = 0x31 ^ 0x77;
        an.llIlIlIllI[66] = 0xFFFFB7ED & 0x4B96;
        an.llIlIlIllI[67] = 0xFFFF9FED & 0x7F5A;
        an.llIlIlIllI[68] = 0xFFFFDDFA & 0xAABD;
        an.llIlIlIllI[69] = 0xFFFFFDBC & 0x63EB;
        an.llIlIlIllI[70] = -(0xFFFFC01B & 0x7FEF) & (0xFFFFE1FF & 0x5FFE);
        an.llIlIlIllI[71] = 0xFFFFBBBB & 0x7EDC;
        an.llIlIlIllI[72] = 0xFFFFED3A & 0x8FFED;
        an.llIlIlIllI[73] = 0xFFFFCD6E & 0x9BBF9;
        an.llIlIlIllI[74] = 0xFFFFFF98 & 0x2ABFF;
        an.llIlIlIllI[75] = 0xFFFFF6AD & 0x2DBFA;
        an.llIlIlIllI[76] = -(0xFFFFDFFF & 0x61A7) & (0xFFFFEFFE & 0xDF9BF);
        an.llIlIlIllI[77] = -(0xFFFFCEBC & 0x71D7) & (0xFFFFDFFB & 0xE7DDF);
        an.llIlIlIllI[78] = -(0xFFFFDFEC & 0x3BBF) & (0xFFFFBBFB & 0x167FBF);
        an.llIlIlIllI[79] = -(0xFFFF83F7 & 0x7FAD) & (0xFFFFBFFC & 0x16FFF7);
        an.llIlIlIllI[80] = 0xFFFFAC39 & 0x11DFF6;
        an.llIlIlIllI[81] = 0xFFFFBFFA & 0x1352D5;
        an.llIlIlIllI[82] = -(0xFFFFE3A7 & 0x7CFD) & (0xFFFFEFFF & 0xAF7F4);
        an.llIlIlIllI[83] = 0xFFFFCAAA & 0xB7FF5;
        an.llIlIlIllI[84] = -(0xFFFFFFC3 & 0x3CBE) & (0xFFFFBFFD & 0x2D7FF3);
        an.llIlIlIllI[85] = -(0xFFFFDA3F & 0x67E7) & (0xFFFFFFBF & 0x2EDFFE);
        an.llIlIlIllI[86] = 44 + 75 - -17 + 3 ^ 73 + 84 - 151 + 168;
        an.llIlIlIllI[87] = 3 + 99 - 24 + 60 ^ 99 + 126 - 89 + 36;
        an.llIlIlIllI[88] = -(0xFFFFFB2F & 0x77F5) & (0xFFFFFFFF & 0x7FBD);
        an.llIlIlIllI[89] = 0xFFFFDEFA & 0x2DDF;
        an.llIlIlIllI[90] = -(0xFFFFA65F & 0x7BB2) & (0xFFFFBEBD & 0x6FFF);
        an.llIlIlIllI[91] = 0xFFFFDCFB & 0x2FD4;
        an.llIlIlIllI[92] = -(0xFFFFCAB7 & 0x77CF) & (0xFFFFFEFF & 0x4FF7);
        an.llIlIlIllI[93] = -(0xFFFFF339 & 0x7FE7) & (0xFFFFFF7F & Short.MAX_VALUE);
        an.llIlIlIllI[94] = 140 + 115 - 73 + 1 ^ 74 + 124 - 91 + 28;
        an.llIlIlIllI[95] = 0xFFFF8F8F & 0x7CFD;
        an.llIlIlIllI[96] = -(0xFFFFF3D7 & 0x6FBB) & (0xFFFFEFFF & Short.MAX_VALUE);
        an.llIlIlIllI[97] = -(0xFFFFF1EE & 0x7F5B) & (0xFFFFFDFF & Short.MAX_VALUE);
        an.llIlIlIllI[98] = -(0xFFFFD7A1 & 0x395F) & (0xFFFFFFFF & 0x1D9F);
        an.llIlIlIllI[99] = -(0xFFFFBB7B & 0x779D) & (0xFFFFFFFC & 0x3FFB);
        an.llIlIlIllI[100] = 0x80 ^ 0xA7;
    }

    @Override
    public boolean ah() {
        int n2;
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[3]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[3]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2])) {
            n2 = llIlIlIllI[1];
            0;
            if (-1 > 0) {
                return false;
            }
        } else {
            n2 = llIlIlIllI[0];
        }
        return n2 != 0;
    }

    public static void aJ() {
        block26: {
            block27: {
                block23: {
                    block25: {
                        block24: {
                            if (an.lIllIIlllIlll(bt ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[0]];
                                b.a(bv);
                                if (an.lIllIIllllIII(bv.size(), llIlIlIllI[1])) {
                                    System.out.println(llIlIlIlIl[llIlIlIllI[1]]);
                                    bt = llIlIlIllI[0];
                                }
                            }
                            if (!an.lIllIIllllIIl(bt ? 1 : 0) || an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) && !an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2])) break block23;
                            if (an.lIllIIllllIIl(an.aM() ? 1 : 0) && (!an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]) || !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[3]) || an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[3]))) {
                                BankLocation var1 = BankLocation.getNearest();
                                if (an.lIllIIllllIll(var1) && an.lIllIIllllIIl(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[4]];
                                    a.a(var1);
                                }
                                if (an.lIllIIllllIll(var1) && an.lIllIIlllIlll(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[5]];
                                    if (an.lIllIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlIllI[6]);
                                        0;
                                    }
                                    if (an.lIllIIlllIlll(Bank.isOpen() ? 1 : 0)) {
                                        if (an.lIllIIlllllII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llIlIlIllI[1]);
                                            0;
                                        }
                                        if (an.lIllIIlllllII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llIlIlIllI[4]);
                                            0;
                                        }
                                        if (an.lIllIIllllIIl(an.aN() ? 1 : 0)) {
                                            an.Q();
                                            System.out.println(llIlIlIlIl[llIlIlIllI[7]]);
                                            bt = llIlIlIllI[1];
                                            return;
                                        }
                                        if (!an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) || an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2])) {
                                            a.a(cK, llIlIlIllI[1]);
                                        }
                                        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2])) {
                                            a.a(np, llIlIlIllI[1]);
                                        }
                                        a.a(llIlIlIllI[8], llIlIlIllI[9]);
                                        a.b(f.ba, llIlIlIllI[1]);
                                        a.a(llIlIlIllI[10], llIlIlIllI[11]);
                                        a.a(llIlIlIllI[12], llIlIlIllI[13]);
                                    }
                                }
                            }
                            if (!an.lIllIIlllIlll(an.aM() ? 1 : 0)) break block23;
                            an.aL();
                            if (an.lIllIIllllIlI(Movement.getRunEnergy(), llIlIlIllI[14]) && an.lIllIIllllIIl(Movement.isRunEnabled() ? 1 : 0)) {
                                Movement.toggleRun();
                            }
                            String[] stringArray = new String[llIlIlIllI[1]];
                            stringArray[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[11]];
                            if (!an.lIllIIllllIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) break block24;
                            String[] stringArray2 = new String[llIlIlIllI[1]];
                            stringArray2[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[15]];
                            if (!an.lIllIIllllIIl(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block24;
                            String[] stringArray3 = new String[llIlIlIllI[1]];
                            stringArray3[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[16]];
                            if (!an.lIllIIllllIIl(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block24;
                            int[] nArray = new int[llIlIlIllI[1]];
                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[17];
                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                            int[] nArray2 = new int[llIlIlIllI[1]];
                            nArray2[an.llIlIlIllI[0]] = llIlIlIllI[18];
                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block24;
                            int[] nArray3 = new int[llIlIlIllI[1]];
                            nArray3[an.llIlIlIllI[0]] = llIlIlIllI[19];
                            if (!an.lIllIIlllIlll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block25;
                        }
                        an.aO();
                    }
                    if (an.lIllIIllllllI(an.lIllIIlllIllI(e.w(), 45.0))) {
                        int[] nArray = new int[llIlIlIllI[1]];
                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[12];
                        if (an.lIllIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray4 = new int[llIlIlIllI[1]];
                            nArray4[an.llIlIlIllI[0]] = llIlIlIllI[12];
                            Inventory.getFirst((int[])nArray4).interact(llIlIlIlIl[llIlIlIllI[20]]);
                            Time.sleepTicks((int)llIlIlIllI[1]);
                            0;
                        }
                    }
                    if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) && !an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[22]) || an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[21]) && !an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[22]) || an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[21]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[22])) {
                        p.al();
                    }
                    if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[21]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[21]) && (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) && !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) || an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[21]) && !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) || an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[21]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]))) {
                        l.aj();
                    }
                }
                if (!an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) || !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]) || !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) || an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[3]) && !an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[3])) break block26;
                r.aV();
                String[] stringArray = new String[llIlIlIllI[1]];
                stringArray[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[23]];
                if (!an.lIllIIllllIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) break block27;
                String[] stringArray4 = new String[llIlIlIllI[1]];
                stringArray4[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[22]];
                if (!an.lIllIIllllIIl(Equipment.contains((String[])stringArray4) ? 1 : 0)) break block27;
                String[] stringArray5 = new String[llIlIlIllI[1]];
                stringArray5[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[24]];
                if (!an.lIllIIllllIIl(Equipment.contains((String[])stringArray5) ? 1 : 0)) break block27;
                int[] nArray = new int[llIlIlIllI[1]];
                nArray[an.llIlIlIllI[0]] = llIlIlIllI[17];
                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                int[] nArray5 = new int[llIlIlIllI[1]];
                nArray5[an.llIlIlIllI[0]] = llIlIlIllI[18];
                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block27;
                int[] nArray6 = new int[llIlIlIllI[1]];
                nArray6[an.llIlIlIllI[0]] = llIlIlIllI[19];
                if (!an.lIllIIlllIlll(Equipment.contains((int[])nArray6) ? 1 : 0)) break block26;
            }
            an.aO();
        }
    }

    private static String lIllIIllIlIIl(String var11, String var12) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(llIlIlIllI[4], var2);
            return new String(var20.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllllIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public int af() {
        try {
            an.aJ();
            0;
        }
        catch (Exception var19) {
            var19.printStackTrace();
        }
        if (2 >= (0xF5 ^ 0xB3 ^ (0x67 ^ 0x25))) {
            return (0xAB ^ 0xA2 ^ (0xC9 ^ 0x82)) & (0x2A ^ 0x24 ^ (0x4C ^ 0) ^ -1);
        }
        return llIlIlIllI[0];
    }

    private static boolean lIllIIlllllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIllllllI(int n2) {
        return n2 < 0;
    }

    public static void Q() {
        d var8;
        int[] nArray = new int[llIlIlIllI[1]];
        nArray[an.llIlIlIllI[0]] = llIlIlIllI[10];
        if (an.lIllIIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIlIlIllI[10], llIlIlIllI[21], llIlIlIllI[66]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIlIlIllI[1]];
        nArray2[an.llIlIlIllI[0]] = llIlIlIllI[67];
        if (an.lIllIIllllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var8 = new d(llIlIlIllI[67], llIlIlIllI[11], llIlIlIllI[66]);
            bv.add(var8);
            0;
        }
        int[] nArray3 = new int[llIlIlIllI[1]];
        nArray3[an.llIlIlIllI[0]] = llIlIlIllI[62];
        if (an.lIllIIllllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var8 = new d(llIlIlIllI[62], llIlIlIllI[1], llIlIlIllI[68]);
            bv.add(var8);
            0;
        }
        int[] nArray4 = new int[llIlIlIllI[1]];
        nArray4[an.llIlIlIllI[0]] = llIlIlIllI[60];
        if (an.lIllIIllllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var8 = new d(llIlIlIllI[60], llIlIlIllI[1], llIlIlIllI[69]);
            bv.add(var8);
            0;
        }
        int[] nArray5 = new int[llIlIlIllI[1]];
        nArray5[an.llIlIlIllI[0]] = llIlIlIllI[12];
        if (an.lIllIIllllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var8 = new d(llIlIlIllI[12], llIlIlIllI[13], llIlIlIllI[70]);
            bv.add(var8);
            0;
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) && !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) || an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2])) {
            int[] nArray6 = new int[llIlIlIllI[1]];
            nArray6[an.llIlIlIllI[0]] = llIlIlIllI[52];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[52], llIlIlIllI[1], llIlIlIllI[71]);
                bv.add(var8);
                0;
            }
            int[] nArray7 = new int[llIlIlIllI[1]];
            nArray7[an.llIlIlIllI[0]] = llIlIlIllI[56];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[56], llIlIlIllI[1], llIlIlIllI[71]);
                bv.add(var8);
                0;
            }
            int[] nArray8 = new int[llIlIlIllI[1]];
            nArray8[an.llIlIlIllI[0]] = llIlIlIllI[58];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[58], llIlIlIllI[1], llIlIlIllI[71]);
                bv.add(var8);
                0;
            }
            int[] nArray9 = new int[llIlIlIllI[1]];
            nArray9[an.llIlIlIllI[0]] = llIlIlIllI[54];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[54], llIlIlIllI[1], llIlIlIllI[71]);
                bv.add(var8);
                0;
            }
        }
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2])) {
            int[] nArray10 = new int[llIlIlIllI[1]];
            nArray10[an.llIlIlIllI[0]] = llIlIlIllI[52];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[52], llIlIlIllI[1], llIlIlIllI[71]);
                bv.add(var8);
                0;
            }
            int[] nArray11 = new int[llIlIlIllI[1]];
            nArray11[an.llIlIlIllI[0]] = llIlIlIllI[56];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[56], llIlIlIllI[1], llIlIlIllI[71]);
                bv.add(var8);
                0;
            }
            int[] nArray12 = new int[llIlIlIllI[1]];
            nArray12[an.llIlIlIllI[0]] = llIlIlIllI[58];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[58], llIlIlIllI[1], llIlIlIllI[71]);
                bv.add(var8);
                0;
            }
            int[] nArray13 = new int[llIlIlIllI[1]];
            nArray13[an.llIlIlIllI[0]] = llIlIlIllI[54];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[54], llIlIlIllI[1], llIlIlIllI[71]);
                bv.add(var8);
                0;
            }
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2])) {
            int[] nArray14 = new int[llIlIlIllI[1]];
            nArray14[an.llIlIlIllI[0]] = llIlIlIllI[19];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[19], llIlIlIllI[1], e.c(llIlIlIllI[72], llIlIlIllI[73]));
                bv.add(var8);
                0;
            }
            int[] nArray15 = new int[llIlIlIllI[1]];
            nArray15[an.llIlIlIllI[0]] = llIlIlIllI[40];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[40], llIlIlIllI[1], e.c(llIlIlIllI[74], llIlIlIllI[75]));
                bv.add(var8);
                0;
            }
            int[] nArray16 = new int[llIlIlIllI[1]];
            nArray16[an.llIlIlIllI[0]] = llIlIlIllI[38];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[38], llIlIlIllI[1], e.c(llIlIlIllI[76], llIlIlIllI[77]));
                bv.add(var8);
                0;
            }
            int[] nArray17 = new int[llIlIlIllI[1]];
            nArray17[an.llIlIlIllI[0]] = llIlIlIllI[35];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[35], llIlIlIllI[1], e.c(llIlIlIllI[76], llIlIlIllI[77]));
                bv.add(var8);
                0;
            }
            int[] nArray18 = new int[llIlIlIllI[1]];
            nArray18[an.llIlIlIllI[0]] = llIlIlIllI[36];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[36], llIlIlIllI[1], e.c(llIlIlIllI[78], llIlIlIllI[79]));
                bv.add(var8);
                0;
            }
            int[] nArray19 = new int[llIlIlIllI[1]];
            nArray19[an.llIlIlIllI[0]] = llIlIlIllI[37];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[37], llIlIlIllI[1], e.c(llIlIlIllI[80], llIlIlIllI[81]));
                bv.add(var8);
                0;
            }
            int[] nArray20 = new int[llIlIlIllI[1]];
            nArray20[an.llIlIlIllI[0]] = llIlIlIllI[39];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[39], llIlIlIllI[1], e.c(llIlIlIllI[82], llIlIlIllI[83]));
                bv.add(var8);
                0;
            }
            int[] nArray21 = new int[llIlIlIllI[1]];
            nArray21[an.llIlIlIllI[0]] = llIlIlIllI[34];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[34], llIlIlIllI[1], e.c(llIlIlIllI[84], llIlIlIllI[85]));
                bv.add(var8);
                0;
            }
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21])) {
            int[] nArray22 = new int[llIlIlIllI[1]];
            nArray22[an.llIlIlIllI[0]] = llIlIlIllI[18];
            if (an.lIllIIllllIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                var8 = new d(llIlIlIllI[18], llIlIlIllI[1], llIlIlIllI[69]);
                bv.add(var8);
                0;
            }
        }
        int[] nArray23 = new int[llIlIlIllI[1]];
        nArray23[an.llIlIlIllI[0]] = llIlIlIllI[17];
        if (an.lIllIIllllIIl(Bank.contains((int[])nArray23) ? 1 : 0) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[47])) {
            var8 = new d(llIlIlIllI[17], llIlIlIllI[1], llIlIlIllI[71]);
            bv.add(var8);
            0;
        }
    }

    private static boolean lIllIlIIIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static String lIllIIllIIlll(String var18, String var5) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var10 = var5.toCharArray();
        int var22 = llIlIlIllI[0];
        char[] var23 = var18.toCharArray();
        int var14 = var23.length;
        int var9 = llIlIlIllI[0];
        while (an.lIllIIllllIII(var9, var14)) {
            char var7 = var23[var9];
            var16.append((char)(var7 ^ var10[var22 % var10.length]));
            0;
            ++var22;
            ++var9;
            0;
            if (3 >= 3) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean lIllIlIIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aM() {
        int n2;
        block32: {
            block38: {
                block37: {
                    block36: {
                        block35: {
                            block34: {
                                block33: {
                                    block31: {
                                        block22: {
                                            int n3;
                                            block24: {
                                                block30: {
                                                    block29: {
                                                        block28: {
                                                            block27: {
                                                                block26: {
                                                                    block25: {
                                                                        block23: {
                                                                            block11: {
                                                                                int n4;
                                                                                block13: {
                                                                                    block21: {
                                                                                        block20: {
                                                                                            block19: {
                                                                                                block18: {
                                                                                                    block17: {
                                                                                                        block16: {
                                                                                                            block15: {
                                                                                                                block14: {
                                                                                                                    block12: {
                                                                                                                        if (!an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) || !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) || !an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2])) break block11;
                                                                                                                        int[] nArray = new int[llIlIlIllI[1]];
                                                                                                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[19];
                                                                                                                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                                                                        int[] nArray2 = new int[llIlIlIllI[1]];
                                                                                                                        nArray2[an.llIlIlIllI[0]] = llIlIlIllI[19];
                                                                                                                        if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block13;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[llIlIlIllI[1]];
                                                                                                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[36];
                                                                                                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                                                                                    int[] nArray3 = new int[llIlIlIllI[1]];
                                                                                                                    nArray3[an.llIlIlIllI[0]] = llIlIlIllI[36];
                                                                                                                    if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block13;
                                                                                                                }
                                                                                                                int[] nArray = new int[llIlIlIllI[1]];
                                                                                                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[37];
                                                                                                                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                                                                                int[] nArray4 = new int[llIlIlIllI[1]];
                                                                                                                nArray4[an.llIlIlIllI[0]] = llIlIlIllI[37];
                                                                                                                if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block13;
                                                                                                            }
                                                                                                            int[] nArray = new int[llIlIlIllI[1]];
                                                                                                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[35];
                                                                                                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                                                                            int[] nArray5 = new int[llIlIlIllI[1]];
                                                                                                            nArray5[an.llIlIlIllI[0]] = llIlIlIllI[35];
                                                                                                            if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block13;
                                                                                                        }
                                                                                                        int[] nArray = new int[llIlIlIllI[1]];
                                                                                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[39];
                                                                                                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                        int[] nArray6 = new int[llIlIlIllI[1]];
                                                                                                        nArray6[an.llIlIlIllI[0]] = llIlIlIllI[39];
                                                                                                        if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block13;
                                                                                                    }
                                                                                                    int[] nArray = new int[llIlIlIllI[1]];
                                                                                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[38];
                                                                                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                                                                                    int[] nArray7 = new int[llIlIlIllI[1]];
                                                                                                    nArray7[an.llIlIlIllI[0]] = llIlIlIllI[38];
                                                                                                    if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray7) ? 1 : 0)) break block13;
                                                                                                }
                                                                                                int[] nArray = new int[llIlIlIllI[1]];
                                                                                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[34];
                                                                                                if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                int[] nArray8 = new int[llIlIlIllI[1]];
                                                                                                nArray8[an.llIlIlIllI[0]] = llIlIlIllI[34];
                                                                                                if (!an.lIllIIlllIlll(Equipment.contains((int[])nArray8) ? 1 : 0)) break block13;
                                                                                            }
                                                                                            int[] nArray = new int[llIlIlIllI[1]];
                                                                                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                                                            if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                            int[] nArray9 = new int[llIlIlIllI[1]];
                                                                                            nArray9[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                                                            if (!an.lIllIIlllIlll(Equipment.contains((int[])nArray9) ? 1 : 0)) break block13;
                                                                                        }
                                                                                        int[] nArray = new int[llIlIlIllI[1]];
                                                                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[12];
                                                                                        if (!an.lIllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                        int[] nArray10 = new int[llIlIlIllI[1]];
                                                                                        nArray10[an.llIlIlIllI[0]] = llIlIlIllI[12];
                                                                                        if (!an.lIllIIlllIlll(Bank.contains((int[])nArray10) ? 1 : 0)) break block13;
                                                                                    }
                                                                                    n4 = llIlIlIllI[1];
                                                                                    0;
                                                                                    if (((111 + 184 - 104 + 0 ^ 108 + 20 - 68 + 73) & (0xF2 ^ 0xC2 ^ (0x4B ^ 0x41) ^ -1)) == 0) return n4 != 0;
                                                                                    return ((24 + 113 - -39 + 38 ^ 35 + 37 - -8 + 51) & (0x4A ^ 0x41 ^ (3 ^ 0x5D) ^ -1)) != 0;
                                                                                }
                                                                                n4 = llIlIlIllI[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if ((!an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) || an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2])) && (!an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) || !an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]))) break block22;
                                                                            int[] nArray = new int[llIlIlIllI[1]];
                                                                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[18];
                                                                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                            int[] nArray11 = new int[llIlIlIllI[1]];
                                                                            nArray11[an.llIlIlIllI[0]] = llIlIlIllI[18];
                                                                            if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                                                        }
                                                                        int[] nArray = new int[llIlIlIllI[1]];
                                                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                                                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                        int[] nArray12 = new int[llIlIlIllI[1]];
                                                                        nArray12[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                                                        if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray12) ? 1 : 0)) break block24;
                                                                    }
                                                                    int[] nArray = new int[llIlIlIllI[1]];
                                                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block26;
                                                                    int[] nArray13 = new int[llIlIlIllI[1]];
                                                                    nArray13[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                                                    if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray13) ? 1 : 0)) break block24;
                                                                }
                                                                int[] nArray = new int[llIlIlIllI[1]];
                                                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[52];
                                                                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                int[] nArray14 = new int[llIlIlIllI[1]];
                                                                nArray14[an.llIlIlIllI[0]] = llIlIlIllI[52];
                                                                if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray14) ? 1 : 0)) break block24;
                                                            }
                                                            int[] nArray = new int[llIlIlIllI[1]];
                                                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[58];
                                                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block28;
                                                            int[] nArray15 = new int[llIlIlIllI[1]];
                                                            nArray15[an.llIlIlIllI[0]] = llIlIlIllI[58];
                                                            if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray15) ? 1 : 0)) break block24;
                                                        }
                                                        int[] nArray = new int[llIlIlIllI[1]];
                                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[60];
                                                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block29;
                                                        int[] nArray16 = new int[llIlIlIllI[1]];
                                                        nArray16[an.llIlIlIllI[0]] = llIlIlIllI[60];
                                                        if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray16) ? 1 : 0)) break block24;
                                                    }
                                                    int[] nArray = new int[llIlIlIllI[1]];
                                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block30;
                                                    int[] nArray17 = new int[llIlIlIllI[1]];
                                                    nArray17[an.llIlIlIllI[0]] = llIlIlIllI[62];
                                                    if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray17) ? 1 : 0)) break block24;
                                                }
                                                int[] nArray = new int[llIlIlIllI[1]];
                                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[12];
                                                if (an.lIllIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = llIlIlIllI[1];
                                                    0;
                                                    if (-1 < 0) return n3 != 0;
                                                    return (1 & ~1) != 0;
                                                }
                                            }
                                            n3 = llIlIlIllI[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[llIlIlIllI[1]];
                                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[17];
                                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block31;
                                        int[] nArray18 = new int[llIlIlIllI[1]];
                                        nArray18[an.llIlIlIllI[0]] = llIlIlIllI[17];
                                        if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray18) ? 1 : 0)) break block32;
                                    }
                                    int[] nArray = new int[llIlIlIllI[1]];
                                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                                    int[] nArray19 = new int[llIlIlIllI[1]];
                                    nArray19[an.llIlIlIllI[0]] = llIlIlIllI[54];
                                    if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray19) ? 1 : 0)) break block32;
                                }
                                int[] nArray = new int[llIlIlIllI[1]];
                                nArray[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block34;
                                int[] nArray20 = new int[llIlIlIllI[1]];
                                nArray20[an.llIlIlIllI[0]] = llIlIlIllI[56];
                                if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray20) ? 1 : 0)) break block32;
                            }
                            int[] nArray = new int[llIlIlIllI[1]];
                            nArray[an.llIlIlIllI[0]] = llIlIlIllI[52];
                            if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block35;
                            int[] nArray21 = new int[llIlIlIllI[1]];
                            nArray21[an.llIlIlIllI[0]] = llIlIlIllI[52];
                            if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray21) ? 1 : 0)) break block32;
                        }
                        int[] nArray = new int[llIlIlIllI[1]];
                        nArray[an.llIlIlIllI[0]] = llIlIlIllI[58];
                        if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block36;
                        int[] nArray22 = new int[llIlIlIllI[1]];
                        nArray22[an.llIlIlIllI[0]] = llIlIlIllI[58];
                        if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray22) ? 1 : 0)) break block32;
                    }
                    int[] nArray = new int[llIlIlIllI[1]];
                    nArray[an.llIlIlIllI[0]] = llIlIlIllI[60];
                    if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block37;
                    int[] nArray23 = new int[llIlIlIllI[1]];
                    nArray23[an.llIlIlIllI[0]] = llIlIlIllI[60];
                    if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray23) ? 1 : 0)) break block32;
                }
                int[] nArray = new int[llIlIlIllI[1]];
                nArray[an.llIlIlIllI[0]] = llIlIlIllI[62];
                if (!an.lIllIIllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block38;
                int[] nArray24 = new int[llIlIlIllI[1]];
                nArray24[an.llIlIlIllI[0]] = llIlIlIllI[62];
                if (!an.lIllIIlllIlll(Inventory.contains((int[])nArray24) ? 1 : 0)) break block32;
            }
            int[] nArray = new int[llIlIlIllI[1]];
            nArray[an.llIlIlIllI[0]] = llIlIlIllI[12];
            if (an.lIllIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIlIlIllI[1];
                0;
                if (-(0x85 ^ 0x80) < 0) return n2 != 0;
                return false;
            }
        }
        n2 = llIlIlIllI[0];
        return n2 != 0;
    }

    public static void aO() {
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[22]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[22]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[22]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[41]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[22]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[41]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[41]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[41]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[41]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[41])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[47]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[41]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[41])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[47]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[47]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[41])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[47]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[47]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[47]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[21]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[47]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[47]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[21]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[47]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[21]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[21]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[64]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[21]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[21]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[64]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[64]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[21]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[64]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[64]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[64]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[64]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[64]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[64]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[65]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[2]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[65]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[65]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (an.lIllIIllllIII(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[3]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[65]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIlIlIllI[3]) && an.lIllIIllllIII(Skills.getLevel((Skill)Skill.ATTACK), llIlIlIllI[3]) && an.lIllIIllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlIlIllI[2]) && an.lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
    }

    public static void am() {
        if (an.lIllIIllllIIl(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[25]];
            Movement.walkTo((WorldPoint)ck);
            0;
            Time.sleepTicks((int)llIlIlIllI[1]);
            0;
        }
        if (an.lIllIIlllIlll(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[26]];
            if (an.lIllIIlllllll(Players.getLocal().getInteracting())) {
                NPC var24 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (an.lIllIIlllIlll(nPC.getName().contains(llIlIlIlIl[llIlIlIllI[87]]) ? 1 : 0) && an.lIllIIlllllll(nPC.getInteracting()) && an.lIllIIllllIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = llIlIlIllI[1];
                        0;
                        if (1 <= -1) {
                            return ((0x50 ^ 0x44 ^ (0xD7 ^ 0x85)) & (0x61 ^ 0x48 ^ (0x16 ^ 0x79) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIlIlIllI[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[llIlIlIllI[4]];
                stringArray[an.llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[27]];
                stringArray[an.llIlIlIllI[1]] = llIlIlIlIl[llIlIlIllI[14]];
                List var17 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (an.lIllIlIIIIIlI(nPC.getInteracting(), Players.getLocal())) {
                        bl = llIlIlIllI[1];
                        0;
                        if (1 <= -1) {
                            return false;
                        }
                    } else {
                        bl = llIlIlIllI[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (an.lIllIIllllIIl(var17.isEmpty() ? 1 : 0)) {
                    ((NPC)var17.get(llIlIlIllI[0])).interact(llIlIlIlIl[llIlIlIllI[28]]);
                    Time.sleepTicks((int)llIlIlIllI[4]);
                    0;
                }
                if (an.lIllIIllllIll(var24) && an.lIllIIllllIIl(Players.getLocal().isMoving() ? 1 : 0) && an.lIllIIlllIlll(var17.isEmpty() ? 1 : 0)) {
                    var24.interact(llIlIlIlIl[llIlIlIllI[29]]);
                    Time.sleepTicks((int)llIlIlIllI[4]);
                    0;
                }
            }
            if (an.lIllIIllllIll(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)llIlIlIllI[7]);
                0;
            }
        }
    }

    private static boolean lIllIIlllllll(Object object) {
        return object == null;
    }

    private static int lIllIIlllIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        an.lIllIIlllIlIl();
        an.lIllIIllIlIlI();
        bv = new ArrayList<d>();
        int[] nArray = new int[llIlIlIllI[20]];
        nArray[an.llIlIlIllI[0]] = llIlIlIllI[17];
        nArray[an.llIlIlIllI[1]] = llIlIlIllI[18];
        nArray[an.llIlIlIllI[4]] = llIlIlIllI[54];
        nArray[an.llIlIlIllI[5]] = llIlIlIllI[56];
        nArray[an.llIlIlIllI[7]] = llIlIlIllI[52];
        nArray[an.llIlIlIllI[11]] = llIlIlIllI[58];
        nArray[an.llIlIlIllI[15]] = llIlIlIllI[60];
        nArray[an.llIlIlIllI[16]] = llIlIlIllI[62];
        cK = nArray;
        int[] nArray2 = new int[llIlIlIllI[23]];
        nArray2[an.llIlIlIllI[0]] = llIlIlIllI[19];
        nArray2[an.llIlIlIllI[1]] = llIlIlIllI[34];
        nArray2[an.llIlIlIllI[4]] = llIlIlIllI[35];
        nArray2[an.llIlIlIllI[5]] = llIlIlIllI[36];
        nArray2[an.llIlIlIllI[7]] = llIlIlIllI[37];
        nArray2[an.llIlIlIllI[11]] = llIlIlIllI[38];
        nArray2[an.llIlIlIllI[15]] = llIlIlIllI[39];
        nArray2[an.llIlIlIllI[16]] = llIlIlIllI[62];
        nArray2[an.llIlIlIllI[20]] = llIlIlIllI[40];
        np = nArray2;
        cL = new WorldArea(llIlIlIllI[88], llIlIlIllI[89], llIlIlIllI[24], llIlIlIllI[24], llIlIlIllI[0]);
        cM = new WorldArea(llIlIlIllI[90], llIlIlIllI[91], llIlIlIllI[42], llIlIlIllI[28], llIlIlIllI[0]);
        cN = new WorldArea(llIlIlIllI[92], llIlIlIllI[93], llIlIlIllI[94], llIlIlIllI[47], llIlIlIllI[0]);
        cO = new WorldPoint(llIlIlIllI[95], llIlIlIllI[96], llIlIlIllI[0]);
        ck = new WorldPoint(llIlIlIllI[97], llIlIlIllI[89], llIlIlIllI[0]);
        cP = new WorldPoint(llIlIlIllI[98], llIlIlIllI[99], llIlIlIllI[0]);
    }

    private static boolean lIllIIlllIlll(int n2) {
        return n2 != 0;
    }
}

