/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.y;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class R
implements K {
    static /* synthetic */ WorldPoint cf;
    private static /* synthetic */ String[] lIlllIIllI;
    public static /* synthetic */ boolean cc;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<d> bp;
    static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ int[] lIlllIlIII;
    static /* synthetic */ WorldArea cd;

    private static boolean lIIlllIlIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean am() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[21])) break block19;
                                                    int[] nArray = new int[lIlllIlIII[1]];
                                                    nArray[R.lIlllIlIII[0]] = lIlllIlIII[9];
                                                    if (!R.lIIlllIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlllIlIII[1]];
                                                    nArray2[R.lIlllIlIII[0]] = lIlllIlIII[13];
                                                    if (!R.lIIlllIlIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlllIlIII[1]];
                                                    nArray3[R.lIlllIlIII[0]] = lIlllIlIII[11];
                                                    if (!R.lIIlllIlIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlllIlIII[1]];
                                                    nArray4[R.lIlllIlIII[0]] = lIlllIlIII[14];
                                                    if (!R.lIIlllIlIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlllIlIII[1]];
                                                    nArray5[R.lIlllIlIII[0]] = lIlllIlIII[20];
                                                    if (!R.lIIlllIlIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlllIlIII[1]];
                                                    nArray6[R.lIlllIlIII[0]] = lIlllIlIII[48];
                                                    if (!R.lIIlllIlIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlllIlIII[1]];
                                                    nArray7[R.lIlllIlIII[0]] = lIlllIlIII[48];
                                                    if (!R.lIIlllIlIIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlllIlIII[1];
                                                0;
                                                if (-(19 + 100 - -1 + 12 ^ 95 + 19 - 45 + 59) <= 0) return n5 != 0;
                                                return ((0x1D ^ 0xE ^ (0xDA ^ 0x8E)) & (99 + 179 - 137 + 81 ^ 116 + 31 - 73 + 79 ^ -1)) != 0;
                                            }
                                            n5 = lIlllIlIII[0];
                                            return n5 != 0;
                                        }
                                        if (!R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[21]) || !R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8])) break block22;
                                        int[] nArray = new int[lIlllIlIII[1]];
                                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[13];
                                        if (!R.lIIlllIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlllIlIII[1]];
                                        nArray8[R.lIlllIlIII[0]] = lIlllIlIII[11];
                                        if (!R.lIIlllIlIIlII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlllIlIII[1]];
                                        nArray9[R.lIlllIlIII[0]] = lIlllIlIII[14];
                                        if (!R.lIIlllIlIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlllIlIII[1]];
                                        nArray10[R.lIlllIlIII[0]] = lIlllIlIII[16];
                                        if (!R.lIIlllIlIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlllIlIII[1]];
                                        nArray11[R.lIlllIlIII[0]] = lIlllIlIII[48];
                                        if (!R.lIIlllIlIIllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlllIlIII[1]];
                                        nArray12[R.lIlllIlIII[0]] = lIlllIlIII[48];
                                        if (!R.lIIlllIlIIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlllIlIII[1];
                                    0;
                                    if ((0x7F ^ 0x7A) != 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lIlllIlIII[0];
                                return n4 != 0;
                            }
                            if (!R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8]) || !R.lIIlllIlIIllI(cc ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlllIlIII[1]];
                            nArray[R.lIlllIlIII[0]] = lIlllIlIII[22];
                            if (!R.lIIlllIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlllIlIII[1]];
                            nArray13[R.lIlllIlIII[0]] = lIlllIlIII[22];
                            if (!R.lIIlllIlIIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlllIlIII[1]];
                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[24];
                        if (R.lIIlllIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlllIlIII[1]];
                            nArray14[R.lIlllIlIII[0]] = lIlllIlIII[25];
                            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlllIlIII[1];
                                0;
                                if (1 >= 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIlllIlIII[0];
                    return n3 != 0;
                }
                if (!R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8]) || !R.lIIlllIlIIlII(cc ? 1 : 0)) return lIlllIlIII[0];
                int[] nArray = new int[lIlllIlIII[1]];
                nArray[R.lIlllIlIII[0]] = lIlllIlIII[22];
                if (!R.lIIlllIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlllIlIII[1]];
                nArray15[R.lIlllIlIII[0]] = lIlllIlIII[22];
                if (!R.lIIlllIlIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlllIlIII[1]];
            nArray[R.lIlllIlIII[0]] = lIlllIlIII[16];
            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlllIlIII[1]];
                nArray16[R.lIlllIlIII[0]] = lIlllIlIII[23];
                if (R.lIIlllIlIIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlllIlIII[1]];
                    nArray17[R.lIlllIlIII[0]] = lIlllIlIII[23];
                    if (R.lIIlllIlIlIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIlllIlIII[19])) {
                        int[] nArray18 = new int[lIlllIlIII[1]];
                        nArray18[R.lIlllIlIII[0]] = lIlllIlIII[24];
                        if (R.lIIlllIlIIlII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlllIlIII[1]];
                            nArray19[R.lIlllIlIII[0]] = lIlllIlIII[25];
                            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlllIlIII[1];
                                0;
                                if (2 <= 3) return n2 != 0;
                                return ((0x28 ^ 0x72 ^ (0x5E ^ 0x53)) & (0x4A ^ 0x27 ^ (0xAD ^ 0x97) ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlllIlIII[0];
        return n2 != 0;
    }

    private static boolean lIIlllIlIlIII(int n2) {
        return n2 > 0;
    }

    public static boolean an() {
        if (R.lIIlllIlIlIlI(Vars.getBit((int)lIlllIlIII[50]), lIlllIlIII[1]) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[19])) {
            return lIlllIlIII[1];
        }
        if (R.lIIlllIlIlIlI(Vars.getBit((int)lIlllIlIII[50]), lIlllIlIII[3]) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[32]) && R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[19])) {
            return lIlllIlIII[1];
        }
        if (R.lIIlllIlIlIlI(Vars.getBit((int)lIlllIlIII[50]), lIlllIlIII[4]) && R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[32]) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[39])) {
            return lIlllIlIII[1];
        }
        if (R.lIIlllIlIlIlI(Vars.getBit((int)lIlllIlIII[50]), lIlllIlIII[4]) && R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[32])) {
            int[] nArray = new int[lIlllIlIII[1]];
            nArray[R.lIlllIlIII[0]] = lIlllIlIII[14];
            if (R.lIIlllIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlllIlIII[1];
            }
        }
        if (R.lIIlllIlIlIlI(Vars.getBit((int)lIlllIlIII[50]), lIlllIlIII[7]) && R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[39])) {
            int[] nArray = new int[lIlllIlIII[1]];
            nArray[R.lIlllIlIII[0]] = lIlllIlIII[14];
            if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlllIlIII[1];
            }
        }
        return lIlllIlIII[0];
    }

    public static void ao() {
        if (R.lIIlllIlIIlll(Widgets.get((int)lIlllIlIII[51], (int)lIlllIlIII[52]))) {
            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[53]];
            Widgets.get((int)lIlllIlIII[51], (int)lIlllIlIII[52]).interact(lIlllIIllI[lIlllIlIII[54]]);
            Time.sleepTicks((int)lIlllIlIII[7]);
            0;
        }
        if (R.lIIlllIlIlIll(Widgets.get((int)lIlllIlIII[51], (int)lIlllIlIII[52])) && R.lIIlllIlIIllI(Widgets.get((int)lIlllIlIII[55]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIlllIlIII[1]);
            0;
            if (R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[19])) {
                Widgets.get((int)lIlllIlIII[55], (int)lIlllIlIII[1]).getChild(lIlllIlIII[1]).interact(lIlllIIllI[lIlllIlIII[56]]);
            }
            if (R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[32]) && R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[19])) {
                Widgets.get((int)lIlllIlIII[55], (int)lIlllIlIII[1]).getChild(lIlllIlIII[3]).interact(lIlllIIllI[lIlllIlIII[57]]);
            }
            if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[32]) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[39])) {
                Widgets.get((int)lIlllIlIII[55], (int)lIlllIlIII[1]).getChild(lIlllIlIII[4]).interact(lIlllIIllI[lIlllIlIII[58]]);
            }
            if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[32])) {
                int[] nArray = new int[lIlllIlIII[1]];
                nArray[R.lIlllIlIII[0]] = lIlllIlIII[14];
                if (R.lIIlllIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlllIlIII[55], (int)lIlllIlIII[1]).getChild(lIlllIlIII[4]).interact(lIlllIIllI[lIlllIlIII[21]]);
                }
            }
            if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[39])) {
                int[] nArray = new int[lIlllIlIII[1]];
                nArray[R.lIlllIlIII[0]] = lIlllIlIII[14];
                if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlllIlIII[55], (int)lIlllIlIII[1]).getChild(lIlllIlIII[7]).interact(lIlllIIllI[lIlllIlIII[52]]);
                }
            }
            Time.sleepTicks((int)lIlllIlIII[1]);
            0;
        }
    }

    private static String lIIlllIIlllII(String var10, String var4) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIlllIlIII[30]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlllIlIII[3], var12);
            return new String(var7.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIlIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIlllIlIllIl(int n2) {
        return n2 < 0;
    }

    private static String lIIlllIIlllIl(String var8, String var6) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var24 = var6.toCharArray();
        int var20 = lIlllIlIII[0];
        char[] var13 = var8.toCharArray();
        int var15 = var13.length;
        int var14 = lIlllIlIII[0];
        while (R.lIIlllIlIIlIl(var14, var15)) {
            char var5 = var13[var14];
            var19.append((char)(var5 ^ var24[var20 % var24.length]));
            0;
            ++var20;
            ++var14;
            0;
            if (((0xAA ^ 0xB8) & ~(0xA1 ^ 0xB3)) == 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    @Override
    public boolean ac() {
        return lIlllIlIII[0];
    }

    @Override
    public int ad() {
        try {
            R.ai();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 > 0) {
            return (0x22 ^ 0x44 ^ (0x1E ^ 0x52)) & (0x16 ^ 0x4A ^ (0x21 ^ 0x57) ^ -1);
        }
        return lIlllIlIII[69];
    }

    private static boolean lIIlllIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    private static int lIIlllIlIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void O() {
        d var16;
        Object var2;
        if (R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8])) {
            int[] nArray = new int[lIlllIlIII[1]];
            nArray[R.lIlllIlIII[0]] = lIlllIlIII[16];
            if (R.lIIlllIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIlllIlIII[16], lIlllIlIII[59], lIlllIlIII[60]);
                bp.add(d2);
                0;
            }
            int[] nArray2 = new int[lIlllIlIII[1]];
            nArray2[R.lIlllIlIII[0]] = lIlllIlIII[9];
            if (R.lIIlllIlIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var2 = new d(lIlllIlIII[9], lIlllIlIII[61], lIlllIlIII[6]);
                bp.add((d)var2);
                0;
            }
            int[] nArray3 = new int[lIlllIlIII[1]];
            nArray3[R.lIlllIlIII[0]] = lIlllIlIII[11];
            if (R.lIIlllIlIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var2 = new d(lIlllIlIII[11], lIlllIlIII[62], lIlllIlIII[6]);
                bp.add((d)var2);
                0;
            }
            int[] nArray4 = new int[lIlllIlIII[1]];
            nArray4[R.lIlllIlIII[0]] = lIlllIlIII[13];
            if (R.lIIlllIlIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var2 = new d(lIlllIlIII[13], lIlllIlIII[63], lIlllIlIII[6]);
                bp.add((d)var2);
                0;
            }
            int[] nArray5 = new int[lIlllIlIII[1]];
            nArray5[R.lIlllIlIII[0]] = lIlllIlIII[14];
            if (R.lIIlllIlIIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var2 = new d(lIlllIlIII[14], lIlllIlIII[5], lIlllIlIII[6]);
                bp.add((d)var2);
                0;
            }
            int[] nArray6 = new int[lIlllIlIII[1]];
            nArray6[R.lIlllIlIII[0]] = lIlllIlIII[48];
            if (R.lIIlllIlIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var2 = new d(lIlllIlIII[48], lIlllIlIII[1], e.c(lIlllIlIII[64], lIlllIlIII[65]));
                bp.add((d)var2);
                0;
            }
        }
        if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8])) {
            int[] nArray = new int[lIlllIlIII[1]];
            nArray[R.lIlllIlIII[0]] = lIlllIlIII[24];
            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIlllIlIII[1]];
                nArray7[R.lIlllIlIII[0]] = lIlllIlIII[24];
                if (R.lIIlllIlIIlIl(Bank.getFirst((int[])nArray7).getQuantity(), lIlllIlIII[63])) {
                    int[] nArray8 = new int[lIlllIlIII[1]];
                    nArray8[R.lIlllIlIII[0]] = lIlllIlIII[24];
                    var2 = new d(lIlllIlIII[24], lIlllIlIII[63] - Bank.getFirst((int[])nArray8).getQuantity(), lIlllIlIII[66]);
                    bp.add((d)var2);
                    0;
                }
            }
            int[] nArray9 = new int[lIlllIlIII[1]];
            nArray9[R.lIlllIlIII[0]] = lIlllIlIII[24];
            if (R.lIIlllIlIIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var2 = new d(lIlllIlIII[24], lIlllIlIII[63], lIlllIlIII[66]);
                bp.add((d)var2);
                0;
            }
            int[] nArray10 = new int[lIlllIlIII[1]];
            nArray10[R.lIlllIlIII[0]] = lIlllIlIII[25];
            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIlllIlIII[1]];
                nArray11[R.lIlllIlIII[0]] = lIlllIlIII[25];
                if (R.lIIlllIlIIlIl(Bank.getFirst((int[])nArray11).getQuantity(), lIlllIlIII[63])) {
                    int[] nArray12 = new int[lIlllIlIII[1]];
                    nArray12[R.lIlllIlIII[0]] = lIlllIlIII[25];
                    var2 = new d(lIlllIlIII[25], lIlllIlIII[63] - Bank.getFirst((int[])nArray12).getQuantity(), lIlllIlIII[67]);
                    bp.add((d)var2);
                    0;
                }
            }
            int[] nArray13 = new int[lIlllIlIII[1]];
            nArray13[R.lIlllIlIII[0]] = lIlllIlIII[25];
            if (R.lIIlllIlIIllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var2 = new d(lIlllIlIII[25], lIlllIlIII[63], lIlllIlIII[67]);
                bp.add((d)var2);
                0;
            }
            int[] nArray14 = new int[lIlllIlIII[1]];
            nArray14[R.lIlllIlIII[0]] = lIlllIlIII[22];
            if (R.lIIlllIlIIllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIlllIlIII[1]];
                nArray15[R.lIlllIlIII[0]] = lIlllIlIII[22];
                if (R.lIIlllIlIIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var2 = new d(lIlllIlIII[22], lIlllIlIII[1], lIlllIlIII[68]);
                    bp.add((d)var2);
                    0;
                }
            }
            if (R.lIIlllIlIIlII(cc ? 1 : 0)) {
                int[] nArray16 = new int[lIlllIlIII[1]];
                nArray16[R.lIlllIlIII[0]] = lIlllIlIII[16];
                if (R.lIIlllIlIIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlllIlIII[1]];
                    nArray17[R.lIlllIlIII[0]] = lIlllIlIII[16];
                    if (R.lIIlllIlIIlIl(Bank.getFirst((int[])nArray17).getQuantity(), lIlllIlIII[63])) {
                        int[] nArray18 = new int[lIlllIlIII[1]];
                        nArray18[R.lIlllIlIII[0]] = lIlllIlIII[16];
                        var2 = new d(lIlllIlIII[16], lIlllIlIII[63] - Bank.getFirst((int[])nArray18).getQuantity(), lIlllIlIII[60]);
                        bp.add((d)var2);
                        0;
                    }
                }
                int[] nArray19 = new int[lIlllIlIII[1]];
                nArray19[R.lIlllIlIII[0]] = lIlllIlIII[16];
                if (R.lIIlllIlIIllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var2 = new d(lIlllIlIII[16], lIlllIlIII[63], lIlllIlIII[60]);
                    bp.add((d)var2);
                    0;
                }
                int[] nArray20 = new int[lIlllIlIII[1]];
                nArray20[R.lIlllIlIII[0]] = lIlllIlIII[23];
                if (R.lIIlllIlIIlII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIlllIlIII[1]];
                    nArray21[R.lIlllIlIII[0]] = lIlllIlIII[23];
                    if (R.lIIlllIlIIlIl(Bank.getFirst((int[])nArray21).getQuantity(), lIlllIlIII[68])) {
                        int[] nArray22 = new int[lIlllIlIII[1]];
                        nArray22[R.lIlllIlIII[0]] = lIlllIlIII[23];
                        var2 = new d(lIlllIlIII[23], lIlllIlIII[68] - Bank.getFirst((int[])nArray22).getQuantity(), lIlllIlIII[6]);
                        bp.add((d)var2);
                        0;
                    }
                }
                int[] nArray23 = new int[lIlllIlIII[1]];
                nArray23[R.lIlllIlIII[0]] = lIlllIlIII[23];
                if (R.lIIlllIlIIllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var2 = new d(lIlllIlIII[23], lIlllIlIII[68], lIlllIlIII[6]);
                    bp.add((d)var2);
                    0;
                }
            }
        }
        int[] nArray = new int[lIlllIlIII[1]];
        nArray[R.lIlllIlIII[0]] = lIlllIlIII[20];
        if (R.lIIlllIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var2 = new d(lIlllIlIII[20], lIlllIlIII[69], lIlllIlIII[40]);
            bp.add((d)var2);
            0;
        }
        if (R.lIIlllIlIIllI(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(lIlllIIllI[lIlllIlIII[75]])) ? 1 : 0)) {
            var16 = new d(lIlllIlIII[70], lIlllIlIII[19], lIlllIlIII[71]);
            bp.add(var16);
            0;
        }
        int[] nArray24 = new int[lIlllIlIII[1]];
        nArray24[R.lIlllIlIII[0]] = lIlllIlIII[72];
        if (R.lIIlllIlIIllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var16 = new d(lIlllIlIII[72], lIlllIlIII[33], lIlllIlIII[73]);
            bp.add(var16);
            0;
        }
        int[] nArray25 = new int[lIlllIlIII[1]];
        nArray25[R.lIlllIlIII[0]] = lIlllIlIII[18];
        if (R.lIIlllIlIIllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var16 = new d(lIlllIlIII[18], lIlllIlIII[33], lIlllIlIII[73]);
            bp.add(var16);
            0;
        }
    }

    private static boolean lIIlllIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lIIlllIlIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIlIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[2])) {
            bl = lIlllIlIII[1];
            0;
            if ((106 + 71 - 76 + 52 ^ 8 + 152 - 125 + 122) <= 3) {
                return ((0x75 ^ 0xB ^ (0xF3 ^ 0xAB)) & (44 + 91 - 5 + 38 ^ 141 + 48 - 87 + 40 ^ -1)) != 0;
            }
        } else {
            bl = lIlllIlIII[0];
        }
        return bl;
    }

    public static void ai() {
        if (R.lIIlllIlIIlII(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[0]];
            b.a(bp);
            if (R.lIIlllIlIIlIl(bp.size(), lIlllIlIII[1])) {
                System.out.println(lIlllIIllI[lIlllIlIII[1]]);
                bn = lIlllIlIII[0];
            }
        }
        if (R.lIIlllIlIIllI(bn ? 1 : 0) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[2])) {
            BankLocation var22;
            if (R.lIIlllIlIIllI(R.al() ? 1 : 0)) {
                var22 = BankLocation.getNearest();
                if (R.lIIlllIlIIlll(var22) && R.lIIlllIlIIllI(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[3]];
                    a.a(var22);
                }
                if (R.lIIlllIlIIlll(var22) && R.lIIlllIlIIlII(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[4]];
                    if (R.lIIlllIlIIllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIlIII[5]);
                        0;
                        Time.sleepTicks((int)lIlllIlIII[6]);
                        0;
                    }
                    if (R.lIIlllIlIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (R.lIIlllIlIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIlIII[7]);
                            0;
                        }
                        while (R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8]) && R.lIIlllIlIIllI(y.bv() ? 1 : 0)) {
                            y.bt();
                            Time.sleepTicks((int)lIlllIlIII[1]);
                            0;
                            0;
                            if (1 != 2) continue;
                            return;
                        }
                        if (R.lIIlllIlIIllI(R.am() ? 1 : 0)) {
                            R.O();
                            System.out.println(lIlllIIllI[lIlllIlIII[7]]);
                            bn = lIlllIlIII[1];
                            return;
                        }
                        if (R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8])) {
                            int[] nArray = new int[lIlllIlIII[1]];
                            nArray[R.lIlllIlIII[0]] = lIlllIlIII[9];
                            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIlllIlIII[1]];
                                nArray2[R.lIlllIlIII[0]] = lIlllIlIII[9];
                                if (R.lIIlllIlIIlIl(Inventory.getCount((int[])nArray2), lIlllIlIII[1])) {
                                    Bank.withdraw((int)lIlllIlIII[9], (int)lIlllIlIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlIII[1]];
                                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[9];
                                        if (R.lIIlllIlIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlIII[1];
                                            0;
                                            if (((0x77 ^ 0x37 ^ (0x31 ^ 0x61)) & (31 + 136 - 137 + 120 ^ 94 + 121 - 144 + 63 ^ -1)) != 0) {
                                                return ((0xEE ^ 0xA4 ^ (0x5E ^ 0x53)) & (182 + 33 - -5 + 10 ^ 30 + 138 - 135 + 128 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlllIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlIII[5]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIlllIlIII[1]];
                            nArray3[R.lIlllIlIII[0]] = lIlllIlIII[11];
                            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlllIlIII[1]];
                                nArray4[R.lIlllIlIII[0]] = lIlllIlIII[11];
                                if (R.lIIlllIlIIlIl(Inventory.getCount((int[])nArray4), lIlllIlIII[1])) {
                                    Bank.withdraw((int)lIlllIlIII[11], (int)lIlllIlIII[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlIII[1]];
                                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[11];
                                        if (R.lIIlllIlIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlIII[1];
                                            0;
                                            if ((0x43 ^ 0x47) <= 3) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlllIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlIII[5]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIlllIlIII[1]];
                            nArray5[R.lIlllIlIII[0]] = lIlllIlIII[13];
                            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIlllIlIII[1]];
                                nArray6[R.lIlllIlIII[0]] = lIlllIlIII[13];
                                if (R.lIIlllIlIIlIl(Inventory.getCount((int[])nArray6), lIlllIlIII[1])) {
                                    Bank.withdraw((int)lIlllIlIII[13], (int)lIlllIlIII[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlIII[1]];
                                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[13];
                                        if (R.lIIlllIlIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlIII[1];
                                            0;
                                            if (1 == 2) {
                                                return ((0x48 ^ 8) & ~(0xFF ^ 0xBF) & ~((8 ^ 0x68) & ~(0x3A ^ 0x5A))) != 0;
                                            }
                                        } else {
                                            bl = lIlllIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlIII[5]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIlllIlIII[1]];
                            nArray7[R.lIlllIlIII[0]] = lIlllIlIII[14];
                            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIlllIlIII[1]];
                                nArray8[R.lIlllIlIII[0]] = lIlllIlIII[14];
                                if (R.lIIlllIlIIlIl(Inventory.getCount((int[])nArray8), lIlllIlIII[1])) {
                                    Bank.withdraw((int)lIlllIlIII[14], (int)lIlllIlIII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlIII[1]];
                                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[14];
                                        if (R.lIIlllIlIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlIII[1];
                                            0;
                                            if (3 <= 0) {
                                                return ((53 + 121 - 125 + 85 ^ 155 + 90 - 211 + 152) & (0x73 ^ 4 ^ (0xB ^ 0x40) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlllIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlIII[5]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIlllIlIII[1]];
                            nArray9[R.lIlllIlIII[0]] = lIlllIlIII[16];
                            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlllIlIII[1]];
                                nArray10[R.lIlllIlIII[0]] = lIlllIlIII[16];
                                if (R.lIIlllIlIIlIl(Inventory.getCount((int[])nArray10), lIlllIlIII[1])) {
                                    Bank.withdraw((int)lIlllIlIII[16], (int)lIlllIlIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlIII[1]];
                                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[16];
                                        if (R.lIIlllIlIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlIII[1];
                                            0;
                                            if (((7 ^ 0x27 ^ (0x71 ^ 0xB)) & (160 + 195 - 227 + 118 ^ 127 + 42 - 113 + 116 ^ -1)) != 0) {
                                                return ((0x2F ^ 0xC ^ (0x2E ^ 0x3F)) & (131 + 23 - -5 + 11 ^ 151 + 22 - 107 + 86 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlllIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlIII[5]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIlllIlIII[1]];
                            nArray11[R.lIlllIlIII[0]] = lIlllIlIII[17];
                            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIlllIlIII[1]];
                                nArray12[R.lIlllIlIII[0]] = lIlllIlIII[17];
                                if (R.lIIlllIlIIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIlllIlIII[17], (int)lIlllIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIlllIlIII[1]];
                                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIlllIlIII[5]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIlllIlIII[18], (int)lIlllIlIII[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIlllIlIII[1]];
                            nArray13[R.lIlllIlIII[0]] = lIlllIlIII[20];
                            if (R.lIIlllIlIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIlllIlIII[1]];
                                nArray14[R.lIlllIlIII[0]] = lIlllIlIII[20];
                                if (R.lIIlllIlIIlIl(Inventory.getCount((int[])nArray14), lIlllIlIII[1]) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[21])) {
                                    Bank.withdrawAll((int)lIlllIlIII[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlIII[1]];
                                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[20];
                                        if (R.lIIlllIlIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlIII[1];
                                            0;
                                            if (1 <= ((0xE ^ 0x35 ^ (0x73 ^ 0x5D)) & (0x73 ^ 0x12 ^ (0xB ^ 0x7F) ^ -1))) {
                                                return ((0xFA ^ 0xAE ^ (0x5E ^ 0x45)) & (134 + 188 - 144 + 17 ^ 96 + 42 - 34 + 36 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlllIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlIII[5]);
                                    0;
                                }
                            }
                        }
                        if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8])) {
                            int[] nArray = new int[lIlllIlIII[1]];
                            nArray[R.lIlllIlIII[0]] = lIlllIlIII[22];
                            if (R.lIIlllIlIIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIlllIlIII[22], (int)lIlllIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlllIlIII[1]);
                                0;
                            }
                            if (R.lIIlllIlIIlII(cc ? 1 : 0)) {
                                Bank.withdrawAll((int)lIlllIlIII[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlllIlIII[1]);
                                0;
                                Bank.withdrawAll((int)lIlllIlIII[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlllIlIII[1]);
                                0;
                            }
                            Time.sleepTicks((int)lIlllIlIII[4]);
                            0;
                            Bank.withdrawAll((int)lIlllIlIII[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIlllIlIII[1]);
                            0;
                            Bank.withdrawAll((int)lIlllIlIII[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIlllIlIII[1]);
                            0;
                        }
                    }
                }
            }
            if (R.lIIlllIlIIlII(R.al() ? 1 : 0)) {
                if (R.lIIlllIlIIlII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[21])) {
                    if (R.lIIlllIlIIllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[19]];
                        Movement.walkTo((WorldPoint)ce);
                        0;
                        Time.sleepTicks((int)lIlllIlIII[1]);
                        0;
                    }
                    if (R.lIIlllIlIIlII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[6]];
                        R.ak();
                    }
                }
                if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[21]) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[26])) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[27]];
                    if (R.lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIlllIlIII[1]);
                        0;
                    }
                }
                if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[26]) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[29])) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[30]];
                    if (R.lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIlllIlIII[1]);
                        0;
                    }
                }
                if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[29]) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[31])) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[32]];
                    if (R.lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIlllIlIII[1]);
                        0;
                    }
                }
                if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[31]) && R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8])) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[33]];
                    if (R.lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIlllIlIII[1]);
                        0;
                    }
                }
                if (R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8])) {
                    int var3;
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[34]];
                    if (R.lIIlllIlIlIll(cf)) {
                        cf = new WorldPoint(lIlllIlIII[35] + e.c(lIlllIlIII[1], lIlllIlIII[7]), lIlllIlIII[36], lIlllIlIII[0]);
                    }
                    int[] nArray = new int[lIlllIlIII[1]];
                    nArray[R.lIlllIlIII[0]] = lIlllIlIII[22];
                    if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIlllIlIII[1]];
                        nArray15[R.lIlllIlIII[0]] = lIlllIlIII[22];
                        if (R.lIIlllIlIIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIlllIlIII[1]];
                            nArray16[R.lIlllIlIII[0]] = lIlllIlIII[22];
                            Inventory.getFirst((int[])nArray16).interact(lIlllIIllI[lIlllIlIII[37]]);
                            Time.sleepTicks((int)lIlllIlIII[1]);
                            0;
                        }
                    }
                    if (R.lIIlllIlIIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIlllIlIII[1]];
                    nArray17[R.lIlllIlIII[0]] = lIlllIlIII[24];
                    var22 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIlllIlIII[1]];
                    nArray18[R.lIlllIlIII[0]] = lIlllIlIII[38];
                    Item var25 = Inventory.getFirst((int[])nArray18);
                    if (R.lIIlllIlIIllI(cc ? 1 : 0) && R.lIIlllIlIIlll(cf)) {
                        if (R.lIIlllIlIIllI(Players.getLocal().getWorldLocation().equals((Object)cf) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[39]];
                            Movement.walkTo((WorldPoint)cf);
                            0;
                            Time.sleepTicks((int)lIlllIlIII[1]);
                            0;
                        }
                        if (R.lIIlllIlIIlII(Players.getLocal().getWorldLocation().equals((Object)cf) ? 1 : 0) && R.lIIlllIlIIlll(var22) && R.lIIlllIlIIlll(var25)) {
                            var3 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var25);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (R.lIIlllIlIllll(Skills.getExperience((Skill)Skill.MAGIC), var3)) {
                                    bl = lIlllIlIII[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = lIlllIlIII[0];
                                }
                                return bl;
                            }, (int)lIlllIlIII[10]);
                            0;
                            Time.sleep((long)e.c(lIlllIlIII[40], lIlllIlIII[41]));
                            0;
                        }
                    }
                    if (R.lIIlllIlIIlII(cc ? 1 : 0)) {
                        if (R.lIIlllIlIIlll(var22) && R.lIIlllIlIIlll(var25) && R.lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                            var3 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var25);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (R.lIIlllIlIllll(Skills.getExperience((Skill)Skill.MAGIC), var3)) {
                                    bl = lIlllIlIII[1];
                                    0;
                                    if (((0x74 ^ 0x71 ^ (0x14 ^ 0x31)) & (0xED ^ 0x87 ^ (0x39 ^ 0x73) ^ -1)) < 0) {
                                        return ((0x45 ^ 0x11 ^ (0x6D ^ 6)) & (205 + 240 - 343 + 147 ^ 83 + 173 - 94 + 36 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlllIlIII[0];
                                }
                                return bl;
                            }, (int)lIlllIlIII[10]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (R.lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                                bl = lIlllIlIII[1];
                                0;
                                if (-1 >= ((0xC2 ^ 0xA8 ^ (0x53 ^ 8)) & (74 + 96 - 123 + 84 ^ 160 + 4 - -12 + 2 ^ -1))) {
                                    return ((23 + 9 - -117 + 72 ^ 24 + 34 - 30 + 160) & (0x65 ^ 0x28 ^ (0xED ^ 0xC1) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlllIlIII[0];
                            }
                            return bl;
                        }, (int)lIlllIlIII[42]);
                        0;
                    }
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[21])) break block19;
                                                    int[] nArray = new int[lIlllIlIII[1]];
                                                    nArray[R.lIlllIlIII[0]] = lIlllIlIII[9];
                                                    if (!R.lIIlllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlllIlIII[1]];
                                                    nArray2[R.lIlllIlIII[0]] = lIlllIlIII[13];
                                                    if (!R.lIIlllIlIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlllIlIII[1]];
                                                    nArray3[R.lIlllIlIII[0]] = lIlllIlIII[11];
                                                    if (!R.lIIlllIlIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlllIlIII[1]];
                                                    nArray4[R.lIlllIlIII[0]] = lIlllIlIII[14];
                                                    if (!R.lIIlllIlIIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlllIlIII[1]];
                                                    nArray5[R.lIlllIlIII[0]] = lIlllIlIII[20];
                                                    if (!R.lIIlllIlIIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlllIlIII[1]];
                                                    nArray6[R.lIlllIlIII[0]] = lIlllIlIII[48];
                                                    if (!R.lIIlllIlIIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlllIlIII[1]];
                                                    nArray7[R.lIlllIlIII[0]] = lIlllIlIII[48];
                                                    if (!R.lIIlllIlIIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlllIlIII[1];
                                                0;
                                                if (-1 <= -1) return n5 != 0;
                                                return ((0xF2 ^ 0xA6 ^ (0x89 ^ 0x99)) & (0x34 ^ 0x10 ^ (0xD8 ^ 0xB8) ^ -1)) != 0;
                                            }
                                            n5 = lIlllIlIII[0];
                                            return n5 != 0;
                                        }
                                        if (!R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[21]) || !R.lIIlllIlIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8])) break block22;
                                        int[] nArray = new int[lIlllIlIII[1]];
                                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[13];
                                        if (!R.lIIlllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlllIlIII[1]];
                                        nArray8[R.lIlllIlIII[0]] = lIlllIlIII[11];
                                        if (!R.lIIlllIlIIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlllIlIII[1]];
                                        nArray9[R.lIlllIlIII[0]] = lIlllIlIII[14];
                                        if (!R.lIIlllIlIIlII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlllIlIII[1]];
                                        nArray10[R.lIlllIlIII[0]] = lIlllIlIII[16];
                                        if (!R.lIIlllIlIIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlllIlIII[1]];
                                        nArray11[R.lIlllIlIII[0]] = lIlllIlIII[48];
                                        if (!R.lIIlllIlIIllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlllIlIII[1]];
                                        nArray12[R.lIlllIlIII[0]] = lIlllIlIII[48];
                                        if (!R.lIIlllIlIIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlllIlIII[1];
                                    0;
                                    if (1 >= -1) return n4 != 0;
                                    return ((0xA5 ^ 0x9A ^ 1) & (0x67 ^ 0x68 ^ (0x2D ^ 0x1C) ^ -1)) != 0;
                                }
                                n4 = lIlllIlIII[0];
                                return n4 != 0;
                            }
                            if (!R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8]) || !R.lIIlllIlIIllI(cc ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlllIlIII[1]];
                            nArray[R.lIlllIlIII[0]] = lIlllIlIII[22];
                            if (!R.lIIlllIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlllIlIII[1]];
                            nArray13[R.lIlllIlIII[0]] = lIlllIlIII[22];
                            if (!R.lIIlllIlIIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlllIlIII[1]];
                        nArray[R.lIlllIlIII[0]] = lIlllIlIII[24];
                        if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlllIlIII[1]];
                            nArray14[R.lIlllIlIII[0]] = lIlllIlIII[38];
                            if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlllIlIII[1];
                                0;
                                if (((6 ^ 0xE) & ~(0x40 ^ 0x48)) == 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIlllIlIII[0];
                    return n3 != 0;
                }
                if (!R.lIIlllIlIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIII[8]) || !R.lIIlllIlIIlII(cc ? 1 : 0)) return lIlllIlIII[0];
                int[] nArray = new int[lIlllIlIII[1]];
                nArray[R.lIlllIlIII[0]] = lIlllIlIII[22];
                if (!R.lIIlllIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlllIlIII[1]];
                nArray15[R.lIlllIlIII[0]] = lIlllIlIII[22];
                if (!R.lIIlllIlIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlllIlIII[1]];
            nArray[R.lIlllIlIII[0]] = lIlllIlIII[16];
            if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlllIlIII[1]];
                nArray16[R.lIlllIlIII[0]] = lIlllIlIII[23];
                if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlllIlIII[1]];
                    nArray17[R.lIlllIlIII[0]] = lIlllIlIII[23];
                    if (R.lIIlllIlIlIIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIlllIlIII[19])) {
                        int[] nArray18 = new int[lIlllIlIII[1]];
                        nArray18[R.lIlllIlIII[0]] = lIlllIlIII[24];
                        if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlllIlIII[1]];
                            nArray19[R.lIlllIlIII[0]] = lIlllIlIII[38];
                            if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlllIlIII[1];
                                0;
                                if ((0xC2 ^ 0xC6) >= -1) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlllIlIII[0];
        return n2 != 0;
    }

    static {
        R.lIIlllIlIIIll();
        R.lIIlllIlIIIlI();
        cc = lIlllIlIII[0];
        bp = new ArrayList<d>();
        cd = new WorldArea(lIlllIlIII[77], lIlllIlIII[78], lIlllIlIII[53], lIlllIlIII[43], lIlllIlIII[0]);
        ce = new WorldPoint(lIlllIlIII[79], lIlllIlIII[80], lIlllIlIII[0]);
        cf = null;
    }

    private static boolean lIIlllIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlllIlIIIlI() {
        lIlllIIllI = new String[lIlllIlIII[81]];
        R.lIlllIIllI[R.lIlllIlIII[0]] = R."Buying items";
        R.lIlllIIllI[R.lIlllIlIII[1]] = R."Finished buying items, switching back to magic training";
        R.lIlllIIllI[R.lIlllIlIII[3]] = R."Navigating to bank";
        R.lIlllIIllI[R.lIlllIlIII[4]] = R."Handling banking";
        R.lIlllIIllI[R.lIlllIlIII[7]] = R."We are missing supplies, switching to BUYING";
        R.lIlllIIllI[R.lIlllIlIII[19]] = R."Nav to cows";
        R.lIlllIIllI[R.lIlllIlIII[6]] = R."Attacking cows";
        R.lIlllIIllI[R.lIlllIlIII[27]] = R."Casting varrock tele";
        R.lIlllIIllI[R.lIlllIlIII[30]] = R."Casting lumby tele";
        R.lIlllIIllI[R.lIlllIlIII[32]] = R."Casting fally tele";
        R.lIlllIIllI[R.lIlllIlIII[33]] = R."Casting cammy tele";
        R.lIlllIIllI[R.lIlllIlIII[34]] = R."Alching";
        R.lIlllIIllI[R.lIlllIlIII[37]] = R."Wield";
        R.lIlllIIllI[R.lIlllIlIII[39]] = R."Move to alch spot";
        R.lIlllIIllI[R.lIlllIlIII[43]] = R."Nav to cows";
        R.lIlllIIllI[R.lIlllIlIII[44]] = R."Attacking cows";
        R.lIlllIIllI[R.lIlllIlIII[45]] = R."Eat";
        R.lIlllIIllI[R.lIlllIlIII[46]] = R."Cow";
        R.lIlllIIllI[R.lIlllIlIII[47]] = R."cow";
        R.lIlllIIllI[R.lIlllIlIII[49]] = R."Attack";
        R.lIlllIIllI[R.lIlllIlIII[53]] = R."Opening autocast";
        R.lIlllIIllI[R.lIlllIlIII[54]] = R."Choose spell";
        R.lIlllIIllI[R.lIlllIlIII[56]] = R."Wind Strike";
        R.lIlllIIllI[R.lIlllIlIII[57]] = R."Water Strike";
        R.lIlllIIllI[R.lIlllIlIII[58]] = R."Earth Strike";
        R.lIlllIIllI[R.lIlllIlIII[21]] = R."Earth Strike";
        R.lIlllIIllI[R.lIlllIlIII[52]] = R."Fire Strike";
        R.lIlllIIllI[R.lIlllIlIII[74]] = R."Magic training";
        R.lIlllIIllI[R.lIlllIlIII[75]] = R."ring of wealth (";
        R.lIlllIIllI[R.lIlllIlIII[76]] = R."Cow";
    }

    private static void lIIlllIlIIIll() {
        lIlllIlIII = new int[82];
        R.lIlllIlIII[0] = (0x8A ^ 0xAD) & ~(0x52 ^ 0x75);
        R.lIlllIlIII[1] = 1;
        R.lIlllIlIII[2] = 0xED ^ 0xA6;
        R.lIlllIlIII[3] = 2;
        R.lIlllIlIII[4] = 3;
        R.lIlllIlIII[5] = -(0x2D ^ 0x19) & (0xFFFFBFFF & 0x53BB);
        R.lIlllIlIII[6] = 0xCA ^ 0x9B ^ (0xE7 ^ 0xB0);
        R.lIlllIlIII[7] = 46 + 5 - -96 + 17 ^ 59 + 50 - 0 + 51;
        R.lIlllIlIII[8] = 0x4F ^ 0x78;
        R.lIlllIlIII[9] = 0xFFFFF33E & 0xEEF;
        R.lIlllIlIII[10] = -(0xFFFFBA25 & 0x7DDB) & (0xFFFFBDFD & 0x7FDE);
        R.lIlllIlIII[11] = -(0xFFFFD7B5 & 0x2DDF) & (0xFFFF8FFF & 0x77BF);
        R.lIlllIlIII[12] = -(0xFFFFE1BB & 0x7E7E) & (0xFFFFEFFF & 0x79FD);
        R.lIlllIlIII[13] = 0xFFFFC7EF & 0x3A3D;
        R.lIlllIlIII[14] = 0xFFFF8A7E & 0x77AB;
        R.lIlllIlIII[15] = 0xFFFFBBB7 & 0x55DC;
        R.lIlllIlIII[16] = -(0xFFFFA5F7 & 0x7BCD) & (0xFFFFFFF7 & 0x23FF);
        R.lIlllIlIII[17] = -(0xFFFFFCFF & 0x4727) & (0xFFFFFFFF & 0x7577);
        R.lIlllIlIII[18] = 0xFFFF9FFF & 0x7F49;
        R.lIlllIlIII[19] = 0x40 ^ 0x45;
        R.lIlllIlIII[20] = -(0xFFFFBA5D & 0x7FA7) & (0xFFFFBF7F & 0x7BFF);
        R.lIlllIlIII[21] = 66 + 43 - 91 + 203 ^ 187 + 78 - 130 + 61;
        R.lIlllIlIII[22] = -(0xFFFFFBD1 & 0x36BF) & (0xFFFFBFFF & 0x77FB);
        R.lIlllIlIII[23] = 0xFFFFFFFF & 0x22C;
        R.lIlllIlIII[24] = -(0xFFFFFDDB & 0xEAF) & (0xFFFFBFBF & 0x4EFB);
        R.lIlllIlIII[25] = 0x33 ^ 0x58 ^ (0xF5 ^ 0xA0);
        R.lIlllIlIII[26] = 18 + 110 - 97 + 137 ^ 22 + 160 - 131 + 132;
        R.lIlllIlIII[27] = 0x95 ^ 0x92;
        R.lIlllIlIII[28] = -1;
        R.lIlllIlIII[29] = 0x63 ^ 0x77 ^ (0x9F ^ 0xAE);
        R.lIlllIlIII[30] = 0x2D ^ 0x3E ^ (0x56 ^ 0x4D);
        R.lIlllIlIII[31] = 0x39 ^ 0x14;
        R.lIlllIlIII[32] = 0x4F ^ 0x46;
        R.lIlllIlIII[33] = 0x53 ^ 0x1F ^ (0x1A ^ 0x5C);
        R.lIlllIlIII[34] = 0x34 ^ 0x3F;
        R.lIlllIlIII[35] = -2 & (0xFFFFECDB & 0x1F7F);
        R.lIlllIlIII[36] = 0xFFFFCFFF & 0x3D9F;
        R.lIlllIlIII[37] = 49 + 67 - 20 + 33 ^ 137 + 48 - 120 + 76;
        R.lIlllIlIII[38] = 0x32 ^ 0x3A ^ (0x64 ^ 0x53);
        R.lIlllIlIII[39] = 0x1B ^ 0x16;
        R.lIlllIlIII[40] = 0xFFFFD77F & 0x29C0;
        R.lIlllIlIII[41] = -(0xFFFFDFCB & 0x39FE) & (0xFFFFFFDB & 0x1BFF);
        R.lIlllIlIII[42] = -(0xFFFFDF5B & 0x30B6) & (0xFFFFBDBD & 0x5FFF);
        R.lIlllIlIII[43] = 0x23 ^ 0x2D;
        R.lIlllIlIII[44] = 0x50 ^ 0x4B ^ (0xD2 ^ 0xC6);
        R.lIlllIlIII[45] = 0x37 ^ 0x27;
        R.lIlllIlIII[46] = 0x40 ^ 0x51;
        R.lIlllIlIII[47] = 0xA1 ^ 0xBD ^ (0x37 ^ 0x39);
        R.lIlllIlIII[48] = 0xFFFFAFF5 & 0x556F;
        R.lIlllIlIII[49] = 0xA5 ^ 0xB6;
        R.lIlllIlIII[50] = 0xFFFFCB7F & 0x3594;
        R.lIlllIlIII[51] = 0xFFFF8ADF & 0x7771;
        R.lIlllIlIII[52] = 162 + 67 - 203 + 144 ^ 38 + 167 - 180 + 151;
        R.lIlllIlIII[53] = 170 + 179 - 348 + 212 ^ 111 + 108 - 181 + 155;
        R.lIlllIlIII[54] = 27 + 15 - -67 + 80 ^ 137 + 74 - 169 + 126;
        R.lIlllIlIII[55] = 138 + 58 - 59 + 64;
        R.lIlllIlIII[56] = 0x5A ^ 0x4C;
        R.lIlllIlIII[57] = 0x8A ^ 0x9D;
        R.lIlllIlIII[58] = 0xC6 ^ 0xA3 ^ (0xF6 ^ 0x8B);
        R.lIlllIlIII[59] = 0xFFFFABFD & 0x57EA;
        R.lIlllIlIII[60] = 19 + 77 - -13 + 61;
        R.lIlllIlIII[61] = -(0xFFFFFB3E & 0x64D1) & (0xFFFFFFAF & 0x6FFF);
        R.lIlllIlIII[62] = 0xFFFFF7D9 & 0xFF6;
        R.lIlllIlIII[63] = 0xFFFFEBBE & 0x1FF9;
        R.lIlllIlIII[64] = -(0xFFFFED3B & 0x57E6) & (0xFFFFF5F7 & 0x7FFD);
        R.lIlllIlIII[65] = -(0xFFFFBFEF & 0x4334) & (0xFFFFBFEF & 0x7FBF);
        R.lIlllIlIII[66] = 81 + 161 - 128 + 131 ^ 15 + 80 - 39 + 85;
        R.lIlllIlIII[67] = 49 + 119 - 63 + 32 + (0x16 ^ 0x7A) - (100 + 34 - 131 + 208) + (0x1E ^ 0x6A);
        R.lIlllIlIII[68] = -(0xFFFFF5EA & 0x4F7D) & (0xFFFFFFFF & Short.MAX_VALUE);
        R.lIlllIlIII[69] = 208 + 203 - 254 + 77 ^ 1 + 137 - 27 + 31;
        R.lIlllIlIII[70] = -(0xFFFFAB93 & 0x557E) & (0xFFFFEFDD & 0x3FFF);
        R.lIlllIlIII[71] = 0xFFFFEFBE & 0x71E9;
        R.lIlllIlIII[72] = -(0xC ^ 0x2D) & (0xFFFFFF77 & 0x1FEF);
        R.lIlllIlIII[73] = -(0xFFFFF559 & 0x6EB7) & (0xFFFFE7B6 & 0x7FDD);
        R.lIlllIlIII[74] = 0x6E ^ 0x75;
        R.lIlllIlIII[75] = 0x7B ^ 0x67;
        R.lIlllIlIII[76] = 0x23 ^ 0x4E ^ (0xD8 ^ 0xA8);
        R.lIlllIlIII[77] = 0xFFFFFFCE & 0xBFF;
        R.lIlllIlIII[78] = 0xFFFF9CE7 & 0x6FFB;
        R.lIlllIlIII[79] = 0xFFFFEFFF & 0x1BD7;
        R.lIlllIlIII[80] = 0xFFFFECE9 & 0x1FFF;
        R.lIlllIlIII[81] = 0x2E ^ 0x56 ^ (0x2F ^ 0x49);
    }

    private static String lIIlllIIllllI(String var17, String var18) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIlllIlIII[3], var1);
            return new String(var9.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void ak() {
        if (R.lIIlllIlIllIl(R.lIIlllIlIllII(e.u(), 30.0))) {
            int[] nArray = new int[lIlllIlIII[1]];
            nArray[R.lIlllIlIII[0]] = lIlllIlIII[20];
            if (R.lIIlllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlllIlIII[1]];
                nArray2[R.lIlllIlIII[0]] = lIlllIlIII[20];
                Inventory.getFirst((int[])nArray2).interact(lIlllIIllI[lIlllIlIII[45]]);
                Time.sleepTicks((int)lIlllIlIII[1]);
                0;
            }
        }
        if (R.lIIlllIlIlIll(Players.getLocal().getInteracting())) {
            NPC var23 = NPCs.getNearest(nPC -> {
                int n2;
                if (R.lIIlllIlIIlII(nPC.getName().contains(lIlllIIllI[lIlllIlIII[76]]) ? 1 : 0) && R.lIIlllIlIIllI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIlllIlIII[1];
                    0;
                    if (3 <= 0) {
                        return ((54 + 173 - 32 + 6 ^ 5 + 33 - 30 + 150) & (0xAA ^ 0xB9 ^ (0xD1 ^ 0x95) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlllIlIII[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIlllIlIII[3]];
            stringArray[R.lIlllIlIII[0]] = lIlllIIllI[lIlllIlIII[46]];
            stringArray[R.lIlllIlIII[1]] = lIlllIIllI[lIlllIlIII[47]];
            List llllllllllllllllllIlllllIlIllIIl = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (R.lIIlllIlIlllI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIlllIlIII[1];
                    0;
                    if (((97 + 83 - 121 + 73 ^ 68 + 77 - 117 + 111) & (0xE5 ^ 0xAA ^ (0x34 ^ 0x74) ^ -1)) >= 1) {
                        return ((0xF0 ^ 0xA0 ^ (0xCD ^ 0xC7)) & (0xBC ^ 0xA8 ^ (0xF ^ 0x41) ^ -1)) != 0;
                    }
                } else {
                    bl = lIlllIlIII[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIlllIlIII[1]];
            nArray[R.lIlllIlIII[0]] = lIlllIlIII[48];
            if (R.lIIlllIlIIlII(Equipment.contains((int[])nArray) ? 1 : 0) && R.lIIlllIlIIllI(R.an() ? 1 : 0)) {
                R.ao();
            }
            if (R.lIIlllIlIIlll(var23) && R.lIIlllIlIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                var23.interact(lIlllIIllI[lIlllIlIII[49]]);
                Time.sleepTicks((int)lIlllIlIII[4]);
                0;
            }
        }
    }

    private static boolean lIIlllIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void aj() {
        if (R.lIIlllIlIIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (R.lIIlllIlIIllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[43]];
            Movement.walkTo((WorldPoint)ce);
            0;
            Time.sleepTicks((int)lIlllIlIII[1]);
            0;
        }
        if (R.lIIlllIlIIlII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[44]];
            R.ak();
        }
    }

    @Override
    public String ae() {
        return lIlllIIllI[lIlllIlIII[74]];
    }
}

