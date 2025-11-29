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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.p;

public class am
implements ac {
    public static /* synthetic */ WorldPoint cO;
    private static /* synthetic */ String[] lllIIIIIII;
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ WorldArea cL;
    public static /* synthetic */ WorldPoint cP;
    public static /* synthetic */ int[] cK;
    private static /* synthetic */ int[] lllIIIIIIl;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ WorldArea cM;

    private static boolean lIllllIlIIlII(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aN() {
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
                                                                                    if (!am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[39])) break block4;
                                                                                    int[] nArray = new int[lllIIIIIIl[1]];
                                                                                    nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[18];
                                                                                    if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[lllIIIIIIl[1]];
                                                                                    nArray2[am.lllIIIIIIl[0]] = lllIIIIIIl[18];
                                                                                    if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[lllIIIIIIl[1]];
                                                                                    nArray3[am.lllIIIIIIl[0]] = lllIIIIIIl[18];
                                                                                    if (!am.lIllllIlIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[lllIIIIIIl[1]];
                                                                                nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                                                                if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[lllIIIIIIl[1]];
                                                                                nArray4[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                                                                if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[lllIIIIIIl[1]];
                                                                                nArray5[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                                                                if (!am.lIllllIlIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[lllIIIIIIl[1]];
                                                                            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                                                            if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[lllIIIIIIl[1]];
                                                                            nArray6[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                                                            if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[lllIIIIIIl[1]];
                                                                            nArray7[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                                                            if (!am.lIllllIlIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[lllIIIIIIl[1]];
                                                                        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                                                                        if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[lllIIIIIIl[1]];
                                                                        nArray8[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                                                                        if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[lllIIIIIIl[1]];
                                                                        nArray9[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                                                                        if (!am.lIllllIlIIIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[lllIIIIIIl[1]];
                                                                    nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                                                                    if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[lllIIIIIIl[1]];
                                                                    nArray10[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                                                                    if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[lllIIIIIIl[1]];
                                                                    nArray11[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                                                                    if (!am.lIllllIlIIIII(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[lllIIIIIIl[1]];
                                                                nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                                                                if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[lllIIIIIIl[1]];
                                                                nArray12[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                                                                if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[lllIIIIIIl[1]];
                                                                nArray13[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                                                                if (!am.lIllllIlIIIII(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[lllIIIIIIl[1]];
                                                            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                                                            if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[lllIIIIIIl[1]];
                                                            nArray14[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                                                            if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[lllIIIIIIl[1]];
                                                            nArray15[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                                                            if (!am.lIllllIlIIIII(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[lllIIIIIIl[1]];
                                                        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[12];
                                                        if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[lllIIIIIIl[1]];
                                                        nArray16[am.lllIIIIIIl[0]] = lllIIIIIIl[12];
                                                        if (!am.lIllllIlIIIII(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = lllIIIIIIl[1];
                                                    0;
                                                    if (1 <= 3) return n3 != 0;
                                                    return false;
                                                }
                                                n3 = lllIIIIIIl[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[lllIIIIIIl[1]];
                                            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
                                            if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[lllIIIIIIl[1]];
                                            nArray17[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
                                            if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[lllIIIIIIl[1]];
                                            nArray18[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
                                            if (!am.lIllllIlIIIII(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[lllIIIIIIl[1]];
                                        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                        if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[lllIIIIIIl[1]];
                                        nArray19[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                        if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[lllIIIIIIl[1]];
                                        nArray20[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                        if (!am.lIllllIlIIIII(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[lllIIIIIIl[1]];
                                    nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                    if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[lllIIIIIIl[1]];
                                    nArray21[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                    if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[lllIIIIIIl[1]];
                                    nArray22[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                    if (!am.lIllllIlIIIII(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[lllIIIIIIl[1]];
                                nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                                if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[lllIIIIIIl[1]];
                                nArray23[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                                if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[lllIIIIIIl[1]];
                                nArray24[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                                if (!am.lIllllIlIIIII(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[lllIIIIIIl[1]];
                            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                            if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[lllIIIIIIl[1]];
                            nArray25[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                            if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[lllIIIIIIl[1]];
                            nArray26[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                            if (!am.lIllllIlIIIII(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[lllIIIIIIl[1]];
                        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                        if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[lllIIIIIIl[1]];
                        nArray27[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                        if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[lllIIIIIIl[1]];
                        nArray28[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                        if (!am.lIllllIlIIIII(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[lllIIIIIIl[1]];
                    nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                    if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[lllIIIIIIl[1]];
                    nArray29[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                    if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[lllIIIIIIl[1]];
                    nArray30[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                    if (!am.lIllllIlIIIII(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[lllIIIIIIl[1]];
                nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[12];
                if (!am.lIllllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[lllIIIIIIl[1]];
                nArray31[am.lllIIIIIIl[0]] = lllIIIIIIl[12];
                if (!am.lIllllIlIIIII(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = lllIIIIIIl[1];
            0;
            if (null == null) return n2 != 0;
            return false;
        }
        n2 = lllIIIIIIl[0];
        return n2 != 0;
    }

    private static boolean lIllllIlIIlll(Object object) {
        return object == null;
    }

    private static boolean lIllllIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllllIIlllII(String var2, String var8) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lllIIIIIIl[19]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllIIIIIIl[4], var11);
            return new String(var5.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public static void aL() {
        if (am.lIllllIlIlIII(Static.getClient().getVar(lllIIIIIIl[23]), lllIIIIIIl[1])) {
            AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[14]];
            Static.getClient().invokeMenuAction(lllIIIIIII[lllIIIIIIl[27]], lllIIIIIII[lllIIIIIIl[28]], lllIIIIIIl[1], MenuAction.CC_OP.getId(), lllIIIIIIl[29], lllIIIIIIl[30]);
        }
        if (am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[11])) {
            String[] stringArray = new String[lllIIIIIIl[1]];
            stringArray[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[31]];
            if (am.lIllllIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIIIIIIl[1]];
                stringArray2[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[32]];
                Inventory.getFirst((String[])stringArray2).interact(lllIIIIIII[lllIIIIIIl[20]]);
            }
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[11]) && am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[20])) {
            String[] stringArray = new String[lllIIIIIIl[1]];
            stringArray[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[33]];
            if (am.lIllllIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lllIIIIIIl[1]];
                stringArray3[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[34]];
                Inventory.getFirst((String[])stringArray3).interact(lllIIIIIII[lllIIIIIIl[35]]);
            }
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[20]) && am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[2])) {
            String[] stringArray = new String[lllIIIIIIl[1]];
            stringArray[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[36]];
            if (am.lIllllIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lllIIIIIIl[1]];
                stringArray4[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[37]];
                Inventory.getFirst((String[])stringArray4).interact(lllIIIIIII[lllIIIIIIl[38]]);
            }
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[2]) && am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[39])) {
            int[] nArray = new int[lllIIIIIIl[1]];
            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
            if (am.lIllllIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIIIIIl[1]];
                nArray2[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
                Inventory.getFirst((int[])nArray2).interact(lllIIIIIII[lllIIIIIIl[40]]);
            }
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[39])) {
            int[] nArray = new int[lllIIIIIIl[1]];
            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[18];
            if (am.lIllllIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lllIIIIIIl[1]];
                nArray3[am.lllIIIIIIl[0]] = lllIIIIIIl[18];
                Inventory.getFirst((int[])nArray3).interact(lllIIIIIII[lllIIIIIIl[41]]);
            }
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[2])) {
            int[] nArray = new int[lllIIIIIIl[1]];
            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
            if (am.lIllllIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lllIIIIIIl[1]];
                nArray4[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                Inventory.getFirst((int[])nArray4).interact(lllIIIIIII[lllIIIIIIl[43]]);
            }
            int[] nArray5 = new int[lllIIIIIIl[1]];
            nArray5[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
            if (am.lIllllIlIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lllIIIIIIl[1]];
                nArray6[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                Inventory.getFirst((int[])nArray6).interact(lllIIIIIII[lllIIIIIIl[2]]);
            }
            int[] nArray7 = new int[lllIIIIIIl[1]];
            nArray7[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
            if (am.lIllllIlIIIII(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[lllIIIIIIl[1]];
                nArray8[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                Inventory.getFirst((int[])nArray8).interact(lllIIIIIII[lllIIIIIIl[46]]);
            }
            int[] nArray9 = new int[lllIIIIIIl[1]];
            nArray9[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
            if (am.lIllllIlIIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lllIIIIIIl[1]];
                nArray10[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                Inventory.getFirst((int[])nArray10).interact(lllIIIIIII[lllIIIIIIl[48]]);
            }
        }
        int[] nArray = new int[lllIIIIIIl[1]];
        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
        if (am.lIllllIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[lllIIIIIIl[1]];
            nArray11[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
            Inventory.getFirst((int[])nArray11).interact(lllIIIIIII[lllIIIIIIl[50]]);
        }
        int[] nArray12 = new int[lllIIIIIIl[1]];
        nArray12[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
        if (am.lIllllIlIIIII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lllIIIIIIl[1]];
            nArray13[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
            Inventory.getFirst((int[])nArray13).interact(lllIIIIIII[lllIIIIIIl[52]]);
        }
    }

    private static boolean lIllllIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return lllIIIIIII[lllIIIIIIl[59]];
    }

    private static void lIllllIIlllIl() {
        lllIIIIIII = new String[lllIIIIIIl[73]];
        am.lllIIIIIII[am.lllIIIIIIl[0]] = am."Buying items";
        am.lllIIIIIII[am.lllIIIIIIl[1]] = am."Finished buying items, switching back to melee training";
        am.lllIIIIIII[am.lllIIIIIIl[4]] = am."Navigating to bank";
        am.lllIIIIIII[am.lllIIIIIIl[5]] = am."Handling banking";
        am.lllIIIIIII[am.lllIIIIIIl[7]] = am."We are missing supplies, switching to BUYING";
        am.lllIIIIIII[am.lllIIIIIIl[11]] = am."Iron scimitar";
        am.lllIIIIIII[am.lllIIIIIIl[15]] = am."Steel scimitar";
        am.lllIIIIIII[am.lllIIIIIIl[16]] = am."Mithril scimitar";
        am.lllIIIIIII[am.lllIIIIIIl[19]] = am."Eat";
        am.lllIIIIIII[am.lllIIIIIIl[21]] = am."Walking to cow area";
        am.lllIIIIIII[am.lllIIIIIIl[22]] = am."Killing cows";
        am.lllIIIIIII[am.lllIIIIIIl[23]] = am."Cow";
        am.lllIIIIIII[am.lllIIIIIIl[24]] = am."cow";
        am.lllIIIIIII[am.lllIIIIIIl[25]] = am."Attack";
        am.lllIIIIIII[am.lllIIIIIIl[26]] = am."Attack";
        am.lllIIIIIII[am.lllIIIIIIl[14]] = am."Toggle auto retaliate";
        am.lllIIIIIII[am.lllIIIIIIl[27]] = am."Auto retaliate";
        am.lllIIIIIII[am.lllIIIIIIl[28]] = am."";
        am.lllIIIIIII[am.lllIIIIIIl[31]] = am."Iron scimitar";
        am.lllIIIIIII[am.lllIIIIIIl[32]] = am."Iron scimitar";
        am.lllIIIIIII[am.lllIIIIIIl[20]] = am."Wield";
        am.lllIIIIIII[am.lllIIIIIIl[33]] = am."Steel scimitar";
        am.lllIIIIIII[am.lllIIIIIIl[34]] = am."Steel scimitar";
        am.lllIIIIIII[am.lllIIIIIIl[35]] = am."Wield";
        am.lllIIIIIII[am.lllIIIIIIl[36]] = am."Mithril scimitar";
        am.lllIIIIIII[am.lllIIIIIIl[37]] = am."Mithril scimitar";
        am.lllIIIIIII[am.lllIIIIIIl[38]] = am."Wield";
        am.lllIIIIIII[am.lllIIIIIIl[40]] = am."Wield";
        am.lllIIIIIII[am.lllIIIIIIl[41]] = am."Wield";
        am.lllIIIIIII[am.lllIIIIIIl[43]] = am."Wear";
        am.lllIIIIIII[am.lllIIIIIIl[2]] = am."Wear";
        am.lllIIIIIII[am.lllIIIIIIl[46]] = am."Wear";
        am.lllIIIIIII[am.lllIIIIIIl[48]] = am."Wear";
        am.lllIIIIIII[am.lllIIIIIIl[50]] = am."Wear";
        am.lllIIIIIII[am.lllIIIIIIl[52]] = am."Wear";
        am.lllIIIIIII[am.lllIIIIIIl[59]] = am."40 Str";
        am.lllIIIIIII[am.lllIIIIIIl[60]] = am."Cow";
    }

    private static boolean lIllllIlIIlIl(int n2) {
        return n2 > 0;
    }

    private static int lIllllIIlllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aM() {
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
                                                                            if (!am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[39])) break block8;
                                                                            int[] nArray = new int[lllIIIIIIl[1]];
                                                                            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[18];
                                                                            if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[lllIIIIIIl[1]];
                                                                            nArray2[am.lllIIIIIIl[0]] = lllIIIIIIl[18];
                                                                            if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[lllIIIIIIl[1]];
                                                                        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                                                        if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[lllIIIIIIl[1]];
                                                                        nArray3[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                                                        if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[lllIIIIIIl[1]];
                                                                    nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                                                    if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[lllIIIIIIl[1]];
                                                                    nArray4[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                                                    if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[lllIIIIIIl[1]];
                                                                nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                                                                if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[lllIIIIIIl[1]];
                                                                nArray5[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                                                                if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[lllIIIIIIl[1]];
                                                            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                                                            if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[lllIIIIIIl[1]];
                                                            nArray6[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                                                            if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[lllIIIIIIl[1]];
                                                        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                                                        if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[lllIIIIIIl[1]];
                                                        nArray7[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                                                        if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[lllIIIIIIl[1]];
                                                    nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                                                    if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[lllIIIIIIl[1]];
                                                    nArray8[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                                                    if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[lllIIIIIIl[1]];
                                                nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[12];
                                                if (am.lIllllIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = lllIIIIIIl[1];
                                                    0;
                                                    if (3 > 0) return n3 != 0;
                                                    return ((0xF2 ^ 0xBF ^ (0xE8 ^ 0xAA)) & (117 + 111 - 153 + 56 ^ 36 + 88 - 89 + 105 ^ -1)) != 0;
                                                }
                                            }
                                            n3 = lllIIIIIIl[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[lllIIIIIIl[1]];
                                        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
                                        if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[lllIIIIIIl[1]];
                                        nArray9[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
                                        if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[lllIIIIIIl[1]];
                                    nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                    if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[lllIIIIIIl[1]];
                                    nArray10[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
                                    if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[lllIIIIIIl[1]];
                                nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[lllIIIIIIl[1]];
                                nArray11[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
                                if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[lllIIIIIIl[1]];
                            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                            if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[lllIIIIIIl[1]];
                            nArray12[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
                            if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[lllIIIIIIl[1]];
                        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                        if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[lllIIIIIIl[1]];
                        nArray13[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
                        if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[lllIIIIIIl[1]];
                    nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                    if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[lllIIIIIIl[1]];
                    nArray14[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
                    if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[lllIIIIIIl[1]];
                nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[lllIIIIIIl[1]];
                nArray15[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
                if (!am.lIllllIlIIIII(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[lllIIIIIIl[1]];
            nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[12];
            if (am.lIllllIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllIIIIIIl[1];
                0;
                if ((10 + 71 - -55 + 12 ^ 105 + 5 - 39 + 73) > 1) return n2 != 0;
                return ((0x7E ^ 4 ^ (0x61 ^ 0x5A)) & (70 + 107 - 173 + 131 ^ 158 + 22 - 48 + 66 ^ -1)) != 0;
            }
        }
        n2 = lllIIIIIIl[0];
        return n2 != 0;
    }

    public static void Q() {
        d var1;
        int[] nArray = new int[lllIIIIIIl[1]];
        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[10];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIIIIIIl[10], lllIIIIIIl[39], lllIIIIIIl[53]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIIIIIIl[1]];
        nArray2[am.lllIIIIIIl[0]] = lllIIIIIIl[54];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var1 = new d(lllIIIIIIl[54], lllIIIIIIl[11], lllIIIIIIl[53]);
            bv.add(var1);
            0;
        }
        int[] nArray3 = new int[lllIIIIIIl[1]];
        nArray3[am.lllIIIIIIl[0]] = lllIIIIIIl[51];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var1 = new d(lllIIIIIIl[51], lllIIIIIIl[1], lllIIIIIIl[55]);
            bv.add(var1);
            0;
        }
        int[] nArray4 = new int[lllIIIIIIl[1]];
        nArray4[am.lllIIIIIIl[0]] = lllIIIIIIl[49];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new d(lllIIIIIIl[49], lllIIIIIIl[1], lllIIIIIIl[56]);
            bv.add(var1);
            0;
        }
        int[] nArray5 = new int[lllIIIIIIl[1]];
        nArray5[am.lllIIIIIIl[0]] = lllIIIIIIl[12];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var1 = new d(lllIIIIIIl[12], lllIIIIIIl[13], lllIIIIIIl[57]);
            bv.add(var1);
            0;
        }
        int[] nArray6 = new int[lllIIIIIIl[1]];
        nArray6[am.lllIIIIIIl[0]] = lllIIIIIIl[42];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var1 = new d(lllIIIIIIl[42], lllIIIIIIl[1], lllIIIIIIl[58]);
            bv.add(var1);
            0;
        }
        int[] nArray7 = new int[lllIIIIIIl[1]];
        nArray7[am.lllIIIIIIl[0]] = lllIIIIIIl[45];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var1 = new d(lllIIIIIIl[45], lllIIIIIIl[1], lllIIIIIIl[58]);
            bv.add(var1);
            0;
        }
        int[] nArray8 = new int[lllIIIIIIl[1]];
        nArray8[am.lllIIIIIIl[0]] = lllIIIIIIl[47];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var1 = new d(lllIIIIIIl[47], lllIIIIIIl[1], lllIIIIIIl[58]);
            bv.add(var1);
            0;
        }
        int[] nArray9 = new int[lllIIIIIIl[1]];
        nArray9[am.lllIIIIIIl[0]] = lllIIIIIIl[44];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var1 = new d(lllIIIIIIl[44], lllIIIIIIl[1], lllIIIIIIl[58]);
            bv.add(var1);
            0;
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[39])) {
            int[] nArray10 = new int[lllIIIIIIl[1]];
            nArray10[am.lllIIIIIIl[0]] = lllIIIIIIl[18];
            if (am.lIllllIlIIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                var1 = new d(lllIIIIIIl[18], lllIIIIIIl[1], lllIIIIIIl[56]);
                bv.add(var1);
                0;
            }
        }
        int[] nArray11 = new int[lllIIIIIIl[1]];
        nArray11[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
        if (am.lIllllIlIIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var1 = new d(lllIIIIIIl[17], lllIIIIIIl[1], lllIIIIIIl[58]);
            bv.add(var1);
            0;
        }
    }

    private static String lIllllIIIlllI(String var17, String var20) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lllIIIIIIl[4], var21);
            return new String(var15.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIlIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllllIlIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllllIlIIllI(int n2) {
        return n2 < 0;
    }

    public static void aJ() {
        block17: {
            block19: {
                block18: {
                    if (am.lIllllIlIIIII(bt ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[0]];
                        b.a(bv);
                        if (am.lIllllIlIIIIl(bv.size(), lllIIIIIIl[1])) {
                            System.out.println(lllIIIIIII[lllIIIIIIl[1]]);
                            bt = lllIIIIIIl[0];
                        }
                    }
                    if (!am.lIllllIlIIIlI(bt ? 1 : 0)) break block17;
                    if (am.lIllllIlIIIlI(am.aM() ? 1 : 0) && (!am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[2]) || !am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[3]) || am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[3]))) {
                        BankLocation var7 = BankLocation.getNearest();
                        if (am.lIllllIlIIlII(var7) && am.lIllllIlIIIlI(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[4]];
                            a.a(var7);
                        }
                        if (am.lIllllIlIIlII(var7) && am.lIllllIlIIIII(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[5]];
                            if (am.lIllllIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIIIIl[6]);
                                0;
                            }
                            if (am.lIllllIlIIIII(Bank.isOpen() ? 1 : 0)) {
                                if (am.lIllllIlIIlIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIIIIIIl[1]);
                                    0;
                                }
                                if (am.lIllllIlIIlIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIIIIIIl[4]);
                                    0;
                                }
                                if (am.lIllllIlIIIlI(am.aN() ? 1 : 0)) {
                                    am.Q();
                                    System.out.println(lllIIIIIII[lllIIIIIIl[7]]);
                                    bt = lllIIIIIIl[1];
                                    return;
                                }
                                a.a(cK, lllIIIIIIl[1]);
                                a.a(lllIIIIIIl[8], lllIIIIIIl[9]);
                                a.b(f.ba, lllIIIIIIl[1]);
                                a.a(lllIIIIIIl[10], lllIIIIIIl[11]);
                                a.a(lllIIIIIIl[12], lllIIIIIIl[13]);
                            }
                        }
                    }
                    if (!am.lIllllIlIIIII(am.aM() ? 1 : 0)) break block17;
                    am.aL();
                    if (am.lIllllIlIIIll(Movement.getRunEnergy(), lllIIIIIIl[14]) && am.lIllllIlIIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[lllIIIIIIl[1]];
                    stringArray[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[11]];
                    if (!am.lIllllIlIIIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[lllIIIIIIl[1]];
                    stringArray2[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[15]];
                    if (!am.lIllllIlIIIlI(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[lllIIIIIIl[1]];
                    stringArray3[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[16]];
                    if (!am.lIllllIlIIIlI(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[lllIIIIIIl[1]];
                    nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
                    if (!am.lIllllIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[lllIIIIIIl[1]];
                    nArray2[am.lllIIIIIIl[0]] = lllIIIIIIl[18];
                    if (!am.lIllllIlIIIII(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                am.aO();
            }
            if (am.lIllllIlIIllI(am.lIllllIIlllll(e.w(), 45.0))) {
                int[] nArray = new int[lllIIIIIIl[1]];
                nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[12];
                if (am.lIllllIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIIIIIIl[1]];
                    nArray3[am.lllIIIIIIl[0]] = lllIIIIIIl[12];
                    Inventory.getFirst((int[])nArray3).interact(lllIIIIIII[lllIIIIIIl[19]]);
                    Time.sleepTicks((int)lllIIIIIIl[1]);
                    0;
                }
            }
            if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[20]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[20])) {
                p.al();
            }
        }
    }

    private static String lIllllIIIllll(String var4, String var12) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var13 = var12.toCharArray();
        int var14 = lllIIIIIIl[0];
        char[] var10 = var4.toCharArray();
        int var6 = var10.length;
        int var22 = lllIIIIIIl[0];
        while (am.lIllllIlIIIIl(var22, var6)) {
            char var16 = var10[var22];
            var19.append((char)(var16 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var22;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    @Override
    public boolean ae() {
        return lllIIIIIIl[0];
    }

    public static void aO() {
        if (am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[22]) && am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[22]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[22]) && am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[20]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[22]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[20]) && am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[20]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[20]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[20]) && am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[20])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[2]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[20]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[20])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[2]) && am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[2]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[20])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[2]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[2]) && am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (am.lIllllIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[39]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIIIIIl[2]) && am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIIIl[2]) && am.lIllllIlIlIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (am.lIllllIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIIIIIl[39])) {
            bl = lllIIIIIIl[1];
            0;
            if ((57 + 29 - 17 + 65 ^ 16 + 13 - -72 + 29) <= ((14 + 111 - 110 + 118 ^ 139 + 123 - 194 + 83) & (0x7B ^ 0x70 ^ (0x68 ^ 0x71) ^ -1))) {
                return ((0x53 ^ 0x2F ^ (0x7A ^ 0x19)) & (2 ^ (0x79 ^ 0x64) ^ -1)) != 0;
            }
        } else {
            bl = lllIIIIIIl[0];
        }
        return bl;
    }

    private static boolean lIllllIlIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            am.aJ();
            0;
        }
        catch (Exception var18) {
            var18.printStackTrace();
        }
        if ((0xA7 ^ 0x86 ^ (0x5A ^ 0x7F)) <= 0) {
            return (0x7A ^ 0x22 ^ (0x72 ^ 0x64)) & (0x6D ^ 0x38 ^ (0x80 ^ 0x9B) ^ -1);
        }
        return lllIIIIIIl[0];
    }

    private static boolean lIllllIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static void lIllllIIllllI() {
        lllIIIIIIl = new int[74];
        am.lllIIIIIIl[0] = (99 + 207 - 189 + 105 ^ 84 + 1 - -20 + 52) & (61 + 41 - 80 + 230 ^ 48 + 140 - 92 + 95 ^ -1);
        am.lllIIIIIIl[1] = 1;
        am.lllIIIIIIl[2] = 0xB2 ^ 0xAC;
        am.lllIIIIIIl[3] = 0xF6 ^ 0xB8 ^ (0x43 ^ 0x3F);
        am.lllIIIIIIl[4] = 2;
        am.lllIIIIIIl[5] = 3;
        am.lllIIIIIIl[6] = 0xFFFFD3BC & 0x3FCB;
        am.lllIIIIIIl[7] = 0x7A ^ 0x69 ^ (0x28 ^ 0x3F);
        am.lllIIIIIIl[8] = 0xFFFFC3FF & 0x3FE3;
        am.lllIIIIIIl[9] = 0xFFFFFBE9 & 0x7FE;
        am.lllIIIIIIl[10] = -(0xFFFFF75D & 0x28B3) & (0xFFFFBF57 & Short.MAX_VALUE);
        am.lllIIIIIIl[11] = 136 + 12 - 142 + 146 ^ 26 + 85 - 72 + 118;
        am.lllIIIIIIl[12] = -(0xFFFF9597 & 0x7A6D) & (0xFFFFFD7F & 0x13FF);
        am.lllIIIIIIl[13] = 56 + 131 - 80 + 95 ^ 101 + 20 - 116 + 169;
        am.lllIIIIIIl[14] = 0x90 ^ 0x8D ^ (4 ^ 0x16);
        am.lllIIIIIIl[15] = 18 + 87 - 38 + 80 ^ 113 + 97 - 143 + 82;
        am.lllIIIIIIl[16] = 0x99 ^ 0x9E;
        am.lllIIIIIIl[17] = 0xFFFF87FF & 0x7D33;
        am.lllIIIIIIl[18] = -(0xFFFFFED3 & 0x7BAD) & (0xFFFFFFF7 & 0x7FBD);
        am.lllIIIIIIl[19] = 0xD4 ^ 0xC2 ^ (6 ^ 0x18);
        am.lllIIIIIIl[20] = 16 + 17 - -63 + 71 ^ 76 + 96 - 82 + 89;
        am.lllIIIIIIl[21] = 0x1F ^ 0x16;
        am.lllIIIIIIl[22] = 0x3C ^ 0x36;
        am.lllIIIIIIl[23] = 0xB8 ^ 0xB3;
        am.lllIIIIIIl[24] = 0xBB ^ 0xB7;
        am.lllIIIIIIl[25] = 29 + 146 - 96 + 79 ^ 7 + 20 - 9 + 129;
        am.lllIIIIIIl[26] = 0xF ^ 1;
        am.lllIIIIIIl[27] = 0x72 ^ 0x62;
        am.lllIIIIIIl[28] = 0x50 ^ 0x41;
        am.lllIIIIIIl[29] = -1;
        am.lllIIIIIIl[30] = -(0xFFFFFEE7 & 0x6B59) & (0xFFFFFA7F & 0x2516FDE);
        am.lllIIIIIIl[31] = 0x42 ^ 0x3F ^ (0xCB ^ 0xA4);
        am.lllIIIIIIl[32] = 0x12 ^ 0x4E ^ (0x22 ^ 0x6D);
        am.lllIIIIIIl[33] = 0x5B ^ 0x4E;
        am.lllIIIIIIl[34] = 0x29 ^ 0x3F;
        am.lllIIIIIIl[35] = 0x8B ^ 0x9C;
        am.lllIIIIIIl[36] = 0x57 ^ 0x4F;
        am.lllIIIIIIl[37] = 0x85 ^ 0x9C;
        am.lllIIIIIIl[38] = 0x60 ^ 0x7A;
        am.lllIIIIIIl[39] = 139 + 49 - 87 + 75 ^ 126 + 148 - 145 + 23;
        am.lllIIIIIIl[40] = 0xAC ^ 0xB7;
        am.lllIIIIIIl[41] = 41 + 108 - -14 + 1 ^ 124 + 135 - 237 + 162;
        am.lllIIIIIIl[42] = -(0xFFFFFFE7 & 0x7A3D) & (0xFFFFFFED & 0x7EBF);
        am.lllIIIIIIl[43] = 0xA ^ 0x20 ^ (0xE ^ 0x39);
        am.lllIIIIIIl[44] = -(0xFFFFF1CF & 0x7FB5) & (0xFFFFF7E7 & 0x7DFF);
        am.lllIIIIIIl[45] = 0xFFFF8CB9 & 0x7777;
        am.lllIIIIIIl[46] = 0x1F ^ 0;
        am.lllIIIIIIl[47] = 0xFFFFECFF & 0x17AF;
        am.lllIIIIIIl[48] = 0x24 ^ 4;
        am.lllIIIIIIl[49] = 0xFFFFFEFB & 0x7AC;
        am.lllIIIIIIl[50] = 0xBB ^ 0x9A;
        am.lllIIIIIIl[51] = 0xFFFFBFF6 & 0x6B7F;
        am.lllIIIIIIl[52] = 0xC7 ^ 0x8C ^ (0x40 ^ 0x29);
        am.lllIIIIIIl[53] = 0xFFFFC3DF & 0x3FA4;
        am.lllIIIIIIl[54] = 0xFFFFDF7E & 0x3FC9;
        am.lllIIIIIIl[55] = -(0xFFFFD56D & 0x3F97) & (0xFFFF9FFF & 0xFDBC);
        am.lllIIIIIIl[56] = 0xFFFFF5E8 & 0x6BBF;
        am.lllIIIIIIl[57] = -(0xFFFFFED1 & 0xB2F) & (0xFFFFAFF5 & 0x5BFE);
        am.lllIIIIIIl[58] = -(0xFFFFFF57 & 0x4AA) & (0xFFFFFED9 & 0x3FBF);
        am.lllIIIIIIl[59] = 0x58 ^ 0x7B;
        am.lllIIIIIIl[60] = 0x65 ^ 0x15 ^ (0x1F ^ 0x4B);
        am.lllIIIIIIl[61] = 0xFFFFDD9D & 0x2EFB;
        am.lllIIIIIIl[62] = -(0xFFFFDF31 & 0x63EF) & (0xFFFFCFFF & 0x7FFA);
        am.lllIIIIIIl[63] = -(0xFFFFF85F & 0x77E3) & (0xFFFFFCEF & 0x7FFE);
        am.lllIIIIIIl[64] = -(0xFFFFE723 & 0x5BFF) & (0xFFFFFFFE & 0x4FF3);
        am.lllIIIIIIl[65] = -(0xFFFFFF5F & 0x72AB) & (0xFFFFFFFB & 0x7E7F);
        am.lllIIIIIIl[66] = -(0xFFFFFBBF & 0x75E1) & (0xFFFFFDFF & Short.MAX_VALUE);
        am.lllIIIIIIl[67] = 0x83 ^ 0xB3;
        am.lllIIIIIIl[68] = -(0xFFFFDAF1 & 0x657F) & (0xFFFFEFFF & 0x5CFD);
        am.lllIIIIIIl[69] = -(0xFFFFF31B & 0x5FF7) & (0xFFFFFFFF & 0x5F7F);
        am.lllIIIIIIl[70] = 0xFFFFBCBF & 0x4FF6;
        am.lllIIIIIIl[71] = -(0xFFFFF927 & 0x77F9) & (0xFFFFFDFF & 0x7FBF);
        am.lllIIIIIIl[72] = -(0xFFFF9EFF & 0x730F) & (0xFFFFDEEF & 0x3FFE);
        am.lllIIIIIIl[73] = 0x97 ^ 0xB2;
    }

    static {
        am.lIllllIIllllI();
        am.lIllllIIlllIl();
        bv = new ArrayList<d>();
        int[] nArray = new int[lllIIIIIIl[19]];
        nArray[am.lllIIIIIIl[0]] = lllIIIIIIl[17];
        nArray[am.lllIIIIIIl[1]] = lllIIIIIIl[18];
        nArray[am.lllIIIIIIl[4]] = lllIIIIIIl[44];
        nArray[am.lllIIIIIIl[5]] = lllIIIIIIl[45];
        nArray[am.lllIIIIIIl[7]] = lllIIIIIIl[42];
        nArray[am.lllIIIIIIl[11]] = lllIIIIIIl[47];
        nArray[am.lllIIIIIIl[15]] = lllIIIIIIl[49];
        nArray[am.lllIIIIIIl[16]] = lllIIIIIIl[51];
        cK = nArray;
        cL = new WorldArea(lllIIIIIIl[61], lllIIIIIIl[62], lllIIIIIIl[23], lllIIIIIIl[23], lllIIIIIIl[0]);
        cM = new WorldArea(lllIIIIIIl[63], lllIIIIIIl[64], lllIIIIIIl[33], lllIIIIIIl[27], lllIIIIIIl[0]);
        cN = new WorldArea(lllIIIIIIl[65], lllIIIIIIl[66], lllIIIIIIl[67], lllIIIIIIl[2], lllIIIIIIl[0]);
        cO = new WorldPoint(lllIIIIIIl[68], lllIIIIIIl[69], lllIIIIIIl[0]);
        ck = new WorldPoint(lllIIIIIIl[70], lllIIIIIIl[62], lllIIIIIIl[0]);
        cP = new WorldPoint(lllIIIIIIl[71], lllIIIIIIl[72], lllIIIIIIl[0]);
    }

    public static void am() {
        if (am.lIllllIlIIIlI(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[21]];
            Movement.walkTo((WorldPoint)ck);
            0;
            Time.sleepTicks((int)lllIIIIIIl[1]);
            0;
        }
        if (am.lIllllIlIIIII(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[22]];
            if (am.lIllllIlIIlll(Players.getLocal().getInteracting())) {
                NPC var23 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (am.lIllllIlIIIII(nPC.getName().contains(lllIIIIIII[lllIIIIIIl[60]]) ? 1 : 0) && am.lIllllIlIIlll(nPC.getInteracting()) && am.lIllllIlIIIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIIIIIl[1];
                        0;
                        if ((0x80 ^ 0x84) < (0x2C ^ 0x28)) {
                            return false;
                        }
                    } else {
                        n2 = lllIIIIIIl[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[lllIIIIIIl[4]];
                stringArray[am.lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[23]];
                stringArray[am.lllIIIIIIl[1]] = lllIIIIIII[lllIIIIIIl[24]];
                List var3 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (am.lIllllIlIlIlI(nPC.getInteracting(), Players.getLocal())) {
                        bl = lllIIIIIIl[1];
                        0;
                        if (-3 >= 0) {
                            return false;
                        }
                    } else {
                        bl = lllIIIIIIl[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (am.lIllllIlIIIlI(var3.isEmpty() ? 1 : 0)) {
                    ((NPC)var3.get(lllIIIIIIl[0])).interact(lllIIIIIII[lllIIIIIIl[25]]);
                    Time.sleepTicks((int)lllIIIIIIl[4]);
                    0;
                }
                if (am.lIllllIlIIlII(var23) && am.lIllllIlIIIlI(Players.getLocal().isMoving() ? 1 : 0) && am.lIllllIlIIIII(var3.isEmpty() ? 1 : 0)) {
                    var23.interact(lllIIIIIII[lllIIIIIIl[26]]);
                    Time.sleepTicks((int)lllIIIIIIl[4]);
                    0;
                }
            }
            if (am.lIllllIlIIlII(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)lllIIIIIIl[7]);
                0;
            }
        }
    }
}

