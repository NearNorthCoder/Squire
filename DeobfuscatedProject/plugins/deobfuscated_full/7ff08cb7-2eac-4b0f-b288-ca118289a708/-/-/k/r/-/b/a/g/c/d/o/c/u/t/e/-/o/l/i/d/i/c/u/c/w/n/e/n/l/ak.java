/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.l;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.m;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.s;
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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;

public class ak
implements ab {
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] llllIIlIl;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ String[] llllIIlII;

    private static void llIIlllIllll() {
        llllIIlII = new String[llllIIlIl[65]];
        ak.llllIIlII[ak.llllIIlIl[0]] = ak."Buying items";
        ak.llllIIlII[ak.llllIIlIl[1]] = ak."Finished buying items, switching back to magic training";
        ak.llllIIlII[ak.llllIIlIl[3]] = ak."Navigating to bank";
        ak.llllIIlII[ak.llllIIlIl[4]] = ak."Handling banking";
        ak.llllIIlII[ak.llllIIlIl[7]] = ak."We are missing supplies, switching to BUYING";
        ak.llllIIlII[ak.llllIIlIl[6]] = ak."Take";
        ak.llllIIlII[ak.llllIIlIl[30]] = ak."Remove";
        ak.llllIIlII[ak.llllIIlIl[33]] = ak."Wield";
        ak.llllIIlII[ak.llllIIlIl[35]] = ak."Wear";
        ak.llllIIlII[ak.llllIIlIl[36]] = ak."Wield";
        ak.llllIIlII[ak.llllIIlIl[24]] = ak."Wield";
        ak.llllIIlII[ak.llllIIlIl[38]] = ak."Wield";
        ak.llllIIlII[ak.llllIIlIl[40]] = ak."Wear";
        ak.llllIIlII[ak.llllIIlIl[41]] = ak."Wear";
        ak.llllIIlII[ak.llllIIlIl[42]] = ak."Wear";
        ak.llllIIlII[ak.llllIIlIl[43]] = ak."Wear";
        ak.llllIIlII[ak.llllIIlIl[45]] = ak."Wear";
        ak.llllIIlII[ak.llllIIlIl[46]] = ak."Wear";
        ak.llllIIlII[ak.llllIIlIl[47]] = ak."Wear";
        ak.llllIIlII[ak.llllIIlIl[48]] = ak."Wield";
        ak.llllIIlII[ak.llllIIlIl[34]] = ak."Range training";
        ak.llllIIlII[ak.llllIIlIl[63]] = ak."ring of wealth (";
        ak.llllIIlII[ak.llllIIlIl[64]] = ak."bow";
    }

    static {
        ak.llIIllllIIII();
        ak.llIIlllIllll();
        bx = new ArrayList<d>();
    }

    @Override
    public int af() {
        try {
            ak.aA();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x3D ^ 0xB ^ (0xFE ^ 0x97)) & (3 + 134 - -32 + 36 ^ 44 + 70 - 88 + 120 ^ -1)) >= (0x47 ^ 0x77 ^ (0x96 ^ 0xA2))) {
            return (95 + 81 - 157 + 120 ^ 51 + 146 - 100 + 82) & (0xB6 ^ 0xAC ^ (0xA5 ^ 0x87) ^ -1);
        }
        return llllIIlIl[57];
    }

    private static boolean llIIllllIllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String ag() {
        return llllIIlII[llllIIlIl[34]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block40: {
            block48: {
                block47: {
                    block46: {
                        block45: {
                            block44: {
                                block43: {
                                    block42: {
                                        block41: {
                                            block39: {
                                                block32: {
                                                    int n3;
                                                    block34: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        block33: {
                                                                            block24: {
                                                                                int n4;
                                                                                block26: {
                                                                                    block31: {
                                                                                        block30: {
                                                                                            block29: {
                                                                                                block28: {
                                                                                                    block27: {
                                                                                                        block25: {
                                                                                                            block16: {
                                                                                                                int n5;
                                                                                                                block18: {
                                                                                                                    block23: {
                                                                                                                        block22: {
                                                                                                                            block21: {
                                                                                                                                block20: {
                                                                                                                                    block19: {
                                                                                                                                        block17: {
                                                                                                                                            if (!ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2]) || !ak.llIIlllllIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llllIIlIl[44]) || !ak.llIIllllIllI(Skills.getLevel((Skill)Skill.DEFENCE), llllIIlIl[39])) break block16;
                                                                                                                                            int[] nArray = new int[llllIIlIl[1]];
                                                                                                                                            nArray[ak.llllIIlIl[0]] = llllIIlIl[9];
                                                                                                                                            if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[llllIIlIl[1]];
                                                                                                                                            nArray2[ak.llllIIlIl[0]] = llllIIlIl[9];
                                                                                                                                            if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[llllIIlIl[1]];
                                                                                                                                        nArray[ak.llllIIlIl[0]] = llllIIlIl[10];
                                                                                                                                        if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[llllIIlIl[1]];
                                                                                                                                        nArray3[ak.llllIIlIl[0]] = llllIIlIl[10];
                                                                                                                                        if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[llllIIlIl[1]];
                                                                                                                                    nArray[ak.llllIIlIl[0]] = llllIIlIl[18];
                                                                                                                                    if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[llllIIlIl[1]];
                                                                                                                                    nArray4[ak.llllIIlIl[0]] = llllIIlIl[18];
                                                                                                                                    if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[llllIIlIl[1]];
                                                                                                                                nArray[ak.llllIIlIl[0]] = llllIIlIl[20];
                                                                                                                                if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[llllIIlIl[1]];
                                                                                                                                nArray5[ak.llllIIlIl[0]] = llllIIlIl[20];
                                                                                                                                if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[llllIIlIl[1]];
                                                                                                                            nArray[ak.llllIIlIl[0]] = llllIIlIl[11];
                                                                                                                            if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[llllIIlIl[1]];
                                                                                                                            nArray6[ak.llllIIlIl[0]] = llllIIlIl[11];
                                                                                                                            if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[llllIIlIl[1]];
                                                                                                                        nArray[ak.llllIIlIl[0]] = llllIIlIl[8];
                                                                                                                        if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[llllIIlIl[1]];
                                                                                                                        nArray7[ak.llllIIlIl[0]] = llllIIlIl[8];
                                                                                                                        if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[llllIIlIl[1]];
                                                                                                                    nArray[ak.llllIIlIl[0]] = llllIIlIl[26];
                                                                                                                    if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = llllIIlIl[1];
                                                                                                                        0;
                                                                                                                        if (3 == 3) return n5 != 0;
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = llllIIlIl[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2]) || !ak.llIIlllllIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llllIIlIl[44]) || !ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.DEFENCE), llllIIlIl[39])) break block24;
                                                                                                            int[] nArray = new int[llllIIlIl[1]];
                                                                                                            nArray[ak.llllIIlIl[0]] = llllIIlIl[9];
                                                                                                            if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[llllIIlIl[1]];
                                                                                                            nArray8[ak.llllIIlIl[0]] = llllIIlIl[9];
                                                                                                            if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[llllIIlIl[1]];
                                                                                                        nArray[ak.llllIIlIl[0]] = llllIIlIl[19];
                                                                                                        if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[llllIIlIl[1]];
                                                                                                        nArray9[ak.llllIIlIl[0]] = llllIIlIl[19];
                                                                                                        if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[llllIIlIl[1]];
                                                                                                    nArray[ak.llllIIlIl[0]] = llllIIlIl[18];
                                                                                                    if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[llllIIlIl[1]];
                                                                                                    nArray10[ak.llllIIlIl[0]] = llllIIlIl[18];
                                                                                                    if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[llllIIlIl[1]];
                                                                                                nArray[ak.llllIIlIl[0]] = llllIIlIl[20];
                                                                                                if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[llllIIlIl[1]];
                                                                                                nArray11[ak.llllIIlIl[0]] = llllIIlIl[20];
                                                                                                if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[llllIIlIl[1]];
                                                                                            nArray[ak.llllIIlIl[0]] = llllIIlIl[11];
                                                                                            if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[llllIIlIl[1]];
                                                                                            nArray12[ak.llllIIlIl[0]] = llllIIlIl[11];
                                                                                            if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[llllIIlIl[1]];
                                                                                        nArray[ak.llllIIlIl[0]] = llllIIlIl[8];
                                                                                        if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[llllIIlIl[1]];
                                                                                        nArray13[ak.llllIIlIl[0]] = llllIIlIl[8];
                                                                                        if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[llllIIlIl[1]];
                                                                                    nArray[ak.llllIIlIl[0]] = llllIIlIl[26];
                                                                                    if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = llllIIlIl[1];
                                                                                        0;
                                                                                        if (1 >= 0) return n4 != 0;
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                                n4 = llllIIlIl[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[27]) || !ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) break block32;
                                                                            int[] nArray = new int[llllIIlIl[1]];
                                                                            nArray[ak.llllIIlIl[0]] = llllIIlIl[17];
                                                                            if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[llllIIlIl[1]];
                                                                            nArray14[ak.llllIIlIl[0]] = llllIIlIl[17];
                                                                            if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[llllIIlIl[1]];
                                                                        nArray[ak.llllIIlIl[0]] = llllIIlIl[19];
                                                                        if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[llllIIlIl[1]];
                                                                        nArray15[ak.llllIIlIl[0]] = llllIIlIl[19];
                                                                        if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[llllIIlIl[1]];
                                                                    nArray[ak.llllIIlIl[0]] = llllIIlIl[18];
                                                                    if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[llllIIlIl[1]];
                                                                    nArray16[ak.llllIIlIl[0]] = llllIIlIl[18];
                                                                    if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[llllIIlIl[1]];
                                                                nArray[ak.llllIIlIl[0]] = llllIIlIl[20];
                                                                if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[llllIIlIl[1]];
                                                                nArray17[ak.llllIIlIl[0]] = llllIIlIl[20];
                                                                if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[llllIIlIl[1]];
                                                            nArray[ak.llllIIlIl[0]] = llllIIlIl[16];
                                                            if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[llllIIlIl[1]];
                                                            nArray18[ak.llllIIlIl[0]] = llllIIlIl[16];
                                                            if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[llllIIlIl[1]];
                                                        nArray[ak.llllIIlIl[0]] = llllIIlIl[26];
                                                        if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = llllIIlIl[1];
                                                            0;
                                                            if (((111 + 49 - 147 + 135 ^ 89 + 81 - 113 + 138) & (0x44 ^ 0x13 ^ (0x45 ^ 0x24) & ~(0xD8 ^ 0xB9) ^ -1)) == 0) return n3 != 0;
                                                            return ((0xEE ^ 0xB3 ^ (0x48 ^ 0x18)) & (0x8F ^ 0xB8 ^ (0xBD ^ 0x87) ^ -1)) != 0;
                                                        }
                                                    }
                                                    n3 = llllIIlIl[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[llllIIlIl[1]];
                                                nArray[ak.llllIIlIl[0]] = llllIIlIl[17];
                                                if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[llllIIlIl[1]];
                                                nArray19[ak.llllIIlIl[0]] = llllIIlIl[17];
                                                if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[llllIIlIl[1]];
                                            nArray[ak.llllIIlIl[0]] = llllIIlIl[19];
                                            if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[llllIIlIl[1]];
                                            nArray20[ak.llllIIlIl[0]] = llllIIlIl[19];
                                            if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[llllIIlIl[1]];
                                        nArray[ak.llllIIlIl[0]] = llllIIlIl[18];
                                        if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[llllIIlIl[1]];
                                        nArray21[ak.llllIIlIl[0]] = llllIIlIl[18];
                                        if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[llllIIlIl[1]];
                                    nArray[ak.llllIIlIl[0]] = llllIIlIl[20];
                                    if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[llllIIlIl[1]];
                                    nArray22[ak.llllIIlIl[0]] = llllIIlIl[20];
                                    if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[llllIIlIl[1]];
                                nArray[ak.llllIIlIl[0]] = llllIIlIl[15];
                                if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[llllIIlIl[1]];
                                nArray23[ak.llllIIlIl[0]] = llllIIlIl[15];
                                if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[llllIIlIl[1]];
                            nArray[ak.llllIIlIl[0]] = llllIIlIl[12];
                            if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[llllIIlIl[1]];
                            nArray24[ak.llllIIlIl[0]] = llllIIlIl[12];
                            if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[llllIIlIl[1]];
                        nArray[ak.llllIIlIl[0]] = llllIIlIl[13];
                        if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[llllIIlIl[1]];
                        nArray25[ak.llllIIlIl[0]] = llllIIlIl[13];
                        if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[llllIIlIl[1]];
                    nArray[ak.llllIIlIl[0]] = llllIIlIl[14];
                    if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[llllIIlIl[1]];
                    nArray26[ak.llllIIlIl[0]] = llllIIlIl[14];
                    if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[llllIIlIl[1]];
                nArray[ak.llllIIlIl[0]] = llllIIlIl[16];
                if (!ak.llIIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[llllIIlIl[1]];
                nArray27[ak.llllIIlIl[0]] = llllIIlIl[16];
                if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[llllIIlIl[1]];
            nArray[ak.llllIIlIl[0]] = llllIIlIl[26];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llllIIlIl[1];
                0;
                if ((0x2F ^ 0x2A) != 0) return n2 != 0;
                return false;
            }
        }
        n2 = llllIIlIl[0];
        return n2 != 0;
    }

    private static String llIIlllIllIl(String llIIIIIIlllIl, String llIIIIIIlIlll) {
        llIIIIIIlllIl = new String(Base64.getDecoder().decode(llIIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIIIllIll = new StringBuilder();
        char[] llIIIIIIllIlI = llIIIIIIlIlll.toCharArray();
        int llIIIIIIllIIl = llllIIlIl[0];
        char[] llIIIIIIlIIll = llIIIIIIlllIl.toCharArray();
        int llIIIIIIlIIlI = llIIIIIIlIIll.length;
        int llIIIIIIlIIIl = llllIIlIl[0];
        while (ak.llIIllllIIlI(llIIIIIIlIIIl, llIIIIIIlIIlI)) {
            char llIIIIIIllllI = llIIIIIIlIIll[llIIIIIIlIIIl];
            llIIIIIIllIll.append((char)(llIIIIIIllllI ^ llIIIIIIllIlI[llIIIIIIllIIl % llIIIIIIllIlI.length]));
            0;
            ++llIIIIIIllIIl;
            ++llIIIIIIlIIIl;
            0;
            
            return null;
        }
        return String.valueOf(llIIIIIIllIll);
    }

    private static boolean llIIllllIIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[28])) {
            bl = llllIIlIl[1];
            0;
            if (((0x5A ^ 0x5C) & ~(0xC3 ^ 0xC5)) > 0) {
                return false;
            }
        } else {
            bl = llllIIlIl[0];
        }
        return bl;
    }

    @Override
    public boolean ae() {
        return llllIIlIl[0];
    }

    private static boolean llIIllllIlII(Object object) {
        return object != null;
    }

    private static String llIIlllIllII(String lIllllllllIll, String lIllllllllIII) {
        try {
            SecretKeySpec lIllllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllllllIII.getBytes(StandardCharsets.UTF_8)), llllIIlIl[35]), "DES");
            Cipher lIlllllllllIl = Cipher.getInstance("DES");
            lIlllllllllIl.init(llllIIlIl[3], lIllllllllllI);
            return new String(lIlllllllllIl.doFinal(Base64.getDecoder().decode(lIllllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllllllllII) {
            lIlllllllllII.printStackTrace();
            return null;
        }
    }

    private static void llIIllllIIII() {
        llllIIlIl = new int[66];
        ak.llllIIlIl[0] = (26 + 17 - 42 + 190 ^ 136 + 95 - 215 + 137) & (0x1E ^ 0x2F ^ (0xB5 ^ 0xA2) ^ -1);
        ak.llllIIlIl[1] = 1;
        ak.llllIIlIl[2] = 0x74 ^ 0x46;
        ak.llllIIlIl[3] = 2;
        ak.llllIIlIl[4] = 3;
        ak.llllIIlIl[5] = -(0xFFFFEDF6 & 0x5A1F) & (0xFFFFFBBD & 0x5FDF);
        ak.llllIIlIl[6] = 0x14 ^ 0x11;
        ak.llllIIlIl[7] = 0x98 ^ 0x9C;
        ak.llllIIlIl[8] = 0xFFFFF92F & 0x2FD3;
        ak.llllIIlIl[9] = -(0xFFFFDD5D & 0x72A3) & (0xFFFFFDBD & 0x5BFF);
        ak.llllIIlIl[10] = 0xFFFF9DE7 & 0x6BDB;
        ak.llllIIlIl[11] = -(0xFFFFA5DD & 0x7AF7) & (0xFFFFBBFF & 0x67FE);
        ak.llllIIlIl[12] = -(0xFFFF94B9 & 0x7BE7) & (0xFFFF93EF & 0x7FF9);
        ak.llllIIlIl[13] = -(0xFFFFDCFF & 0x7FB5) & (0xFFFFFFFF & 0x5FFF);
        ak.llllIIlIl[14] = 0xFFFFC771 & 0x3BDF;
        ak.llllIIlIl[15] = 0xFFFFA7FB & 0x5B76;
        ak.llllIIlIl[16] = 0xFFFFB7BF & 0x4B69;
        ak.llllIIlIl[17] = -(0xFFFFA5B7 & 0x7BF9) & (0xFFFFFDFF & 0x27F7);
        ak.llllIIlIl[18] = -(0xFFFFEF7F & 0x50AB) & (0xFFFFF4FF & 0x4FBB);
        ak.llllIIlIl[19] = 0xFFFFD579 & 0x2EEF;
        ak.llllIIlIl[20] = 0xFFFFAF76 & 0x7BFF;
        ak.llllIIlIl[21] = 0xFFFFEEAB & 0x17FC;
        ak.llllIIlIl[22] = -(0xFFFFF675 & 0x4BAB) & (0xFFFFFFF3 & 0x737D);
        ak.llllIIlIl[23] = -(0xFFFFB3FF & 0x6C37) & (0xFFFFBF7F & Short.MAX_VALUE);
        ak.llllIIlIl[24] = 2 ^ (0x1B ^ 0x13);
        ak.llllIIlIl[25] = 0xFFFFDFDB & 0x3F6E;
        ak.llllIIlIl[26] = 0xFFFFEDFB & 0x137F;
        ak.llllIIlIl[27] = 0xBA ^ 0xA4;
        ak.llllIIlIl[28] = 0x18 ^ 0x48;
        ak.llllIIlIl[29] = 0xFFFF93F6 & 0x6F7F;
        ak.llllIIlIl[30] = 0x8D ^ 0x98 ^ (0x8A ^ 0x99);
        ak.llllIIlIl[31] = 0xFFFFABE7 & 0x573F;
        ak.llllIIlIl[32] = -(0xFFFFDFF6 & 0x780F) & (0xFFFFFBF7 & 0x7EBD);
        ak.llllIIlIl[33] = 0x17 ^ 0x30 ^ (0x48 ^ 0x68);
        ak.llllIIlIl[34] = 0x1F ^ 0xB;
        ak.llllIIlIl[35] = 0x35 ^ 0x27 ^ (0x61 ^ 0x7B);
        ak.llllIIlIl[36] = 0x71 ^ 0x58 ^ (0x41 ^ 0x61);
        ak.llllIIlIl[37] = -(0xFFFFCDCE & 0x7B7F) & (0xFFFFEBFF & Short.MAX_VALUE);
        ak.llllIIlIl[38] = 102 + 1 - 46 + 91 ^ 41 + 8 - 22 + 132;
        ak.llllIIlIl[39] = 0x79 ^ 0x51;
        ak.llllIIlIl[40] = 0x2B ^ 0x27;
        ak.llllIIlIl[41] = 0x41 ^ 0x21 ^ (0x1E ^ 0x73);
        ak.llllIIlIl[42] = 66 + 119 - 176 + 132 ^ 95 + 105 - 118 + 49;
        ak.llllIIlIl[43] = 0x5B ^ 0x54;
        ak.llllIIlIl[44] = 91 + 193 - 135 + 91;
        ak.llllIIlIl[45] = 23 + 8 - 7 + 139 ^ 38 + 158 - 182 + 165;
        ak.llllIIlIl[46] = 0x53 ^ 0x42;
        ak.llllIIlIl[47] = 0xDE ^ 0xA9 ^ (0x6D ^ 8);
        ak.llllIIlIl[48] = 111 + 13 - 22 + 88 ^ 46 + 105 - 132 + 154;
        ak.llllIIlIl[49] = 0xFFFFBF9C & 0x7AFB;
        ak.llllIIlIl[50] = -(0xFFFFB7AF & 0x687B) & (0xFFFFB7FF & 0x6FFA);
        ak.llllIIlIl[51] = 0xFFFFFFFC & 0x2AFB;
        ak.llllIIlIl[52] = -(0xFFFFEFF7 & 0x55F9) & (0xFFFFFFFE & 0x5FFB);
        ak.llllIIlIl[53] = 0xFFFFFAFF & 0x8F76;
        ak.llllIIlIl[54] = 0xFFFFFB7D & 0x1FDA;
        ak.llllIIlIl[55] = 0xFFFFD6F3 & 0x6BEC;
        ak.llllIIlIl[56] = 0xE5 ^ 0xC6;
        ak.llllIIlIl[57] = 0xF9 ^ 0x9D;
        ak.llllIIlIl[58] = -(0xFFFFF6BF & 0x4F76) & (0xFFFFFFF7 & 0x477D);
        ak.llllIIlIl[59] = -(0xFFFFFEBD & 0x1163) & (0xFFFFFFFD & 0x3EEE);
        ak.llllIIlIl[60] = -(0xFFFFBCDB & 0x5F76) & (0xFFFFFDFD & 0x7FFB);
        ak.llllIIlIl[61] = -(0xFFFFE9BD & 0x56F3) & (0xFFFFDFF7 & Short.MAX_VALUE);
        ak.llllIIlIl[62] = 0xFFFF97EC & 0x6B97;
        ak.llllIIlIl[63] = 0x53 ^ 0x43 ^ (0xA4 ^ 0xA1);
        ak.llllIIlIl[64] = 0xB1 ^ 0xC7 ^ (0xC3 ^ 0xA3);
        ak.llllIIlIl[65] = 0x29 ^ 0x52 ^ (0x54 ^ 0x38);
    }

    private static void aB() {
        block34: {
            block33: {
                int[] nArray = new int[llllIIlIl[1]];
                nArray[ak.llllIIlIl[0]] = llllIIlIl[31];
                if (!ak.llIIllllIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[llllIIlIl[1]];
                nArray2[ak.llllIIlIl[0]] = llllIIlIl[32];
                if (!ak.llIIllllIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[llllIIlIl[1]];
                nArray3[ak.llllIIlIl[0]] = llllIIlIl[16];
                if (!ak.llIIllllIIll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[llllIIlIl[1]];
                nArray4[ak.llllIIlIl[0]] = llllIIlIl[11];
                if (ak.llIIllllIIll(Equipment.contains((int[])nArray4) ? 1 : 0) && !ak.llIIllllIIIl(Equipment.contains(item -> item.getName().contains(llllIIlII[llllIIlIl[64]])) ? 1 : 0)) break block34;
            }
            if (ak.llIIllllIlll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[27])) {
            int[] nArray = new int[llllIIlIl[1]];
            nArray[ak.llllIIlIl[0]] = llllIIlIl[31];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[llllIIlIl[1]];
                nArray5[ak.llllIIlIl[0]] = llllIIlIl[31];
                Inventory.getFirst((int[])nArray5).interact(llllIIlII[llllIIlIl[33]]);
            }
            int[] nArray6 = new int[llllIIlIl[1]];
            nArray6[ak.llllIIlIl[0]] = llllIIlIl[12];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray6) ? 1 : 0) && ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[6])) {
                e.l(llllIIlIl[12]);
            }
            int[] nArray7 = new int[llllIIlIl[1]];
            nArray7[ak.llllIIlIl[0]] = llllIIlIl[13];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray7) ? 1 : 0) && ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[6]) && ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[34])) {
                e.l(llllIIlIl[13]);
            }
            int[] nArray8 = new int[llllIIlIl[1]];
            nArray8[ak.llllIIlIl[0]] = llllIIlIl[14];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray8) ? 1 : 0) && ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[34])) {
                e.l(llllIIlIl[14]);
            }
            int[] nArray9 = new int[llllIIlIl[1]];
            nArray9[ak.llllIIlIl[0]] = llllIIlIl[15];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(llllIIlIl[15]);
            }
        }
        if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[34])) {
            int[] nArray = new int[llllIIlIl[1]];
            nArray[ak.llllIIlIl[0]] = llllIIlIl[18];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[llllIIlIl[1]];
                nArray10[ak.llllIIlIl[0]] = llllIIlIl[18];
                Inventory.getFirst((int[])nArray10).interact(llllIIlII[llllIIlIl[35]]);
            }
        }
        if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[27])) {
            int[] nArray = new int[llllIIlIl[1]];
            nArray[ak.llllIIlIl[0]] = llllIIlIl[32];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[llllIIlIl[1]];
                nArray11[ak.llllIIlIl[0]] = llllIIlIl[32];
                Inventory.getFirst((int[])nArray11).interact(llllIIlII[llllIIlIl[36]]);
            }
            int[] nArray12 = new int[llllIIlIl[1]];
            nArray12[ak.llllIIlIl[0]] = llllIIlIl[37];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[llllIIlIl[1]];
                nArray13[ak.llllIIlIl[0]] = llllIIlIl[37];
                Inventory.getFirst((int[])nArray13).interact(llllIIlII[llllIIlIl[24]]);
            }
            int[] nArray14 = new int[llllIIlIl[1]];
            nArray14[ak.llllIIlIl[0]] = llllIIlIl[16];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llllIIlIl[1]];
                nArray15[ak.llllIIlIl[0]] = llllIIlIl[16];
                Inventory.getFirst((int[])nArray15).interact(llllIIlII[llllIIlIl[38]]);
            }
        }
        if (ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.DEFENCE), llllIIlIl[39])) {
            int[] nArray = new int[llllIIlIl[1]];
            nArray[ak.llllIIlIl[0]] = llllIIlIl[19];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llllIIlIl[1]];
                nArray16[ak.llllIIlIl[0]] = llllIIlIl[19];
                Inventory.getFirst((int[])nArray16).interact(llllIIlII[llllIIlIl[40]]);
            }
        }
        if (ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
            int[] nArray = new int[llllIIlIl[1]];
            nArray[ak.llllIIlIl[0]] = llllIIlIl[17];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[llllIIlIl[1]];
                nArray17[ak.llllIIlIl[0]] = llllIIlIl[17];
                Inventory.getFirst((int[])nArray17).interact(llllIIlII[llllIIlIl[41]]);
            }
        }
        int[] nArray = new int[llllIIlIl[1]];
        nArray[ak.llllIIlIl[0]] = llllIIlIl[20];
        if (ak.llIIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[llllIIlIl[1]];
            nArray18[ak.llllIIlIl[0]] = llllIIlIl[20];
            Inventory.getFirst((int[])nArray18).interact(llllIIlII[llllIIlIl[42]]);
        }
        int[] nArray19 = new int[llllIIlIl[1]];
        nArray19[ak.llllIIlIl[0]] = llllIIlIl[21];
        if (ak.llIIllllIIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[llllIIlIl[1]];
            nArray20[ak.llllIIlIl[0]] = llllIIlIl[21];
            Inventory.getFirst((int[])nArray20).interact(llllIIlII[llllIIlIl[43]]);
        }
        if (ak.llIIlllllIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llllIIlIl[44])) {
            int[] nArray21 = new int[llllIIlIl[1]];
            nArray21[ak.llllIIlIl[0]] = llllIIlIl[8];
            if (ak.llIIllllIIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[llllIIlIl[1]];
                nArray22[ak.llllIIlIl[0]] = llllIIlIl[8];
                if (ak.llIIllllIIll(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[llllIIlIl[1]];
                    nArray23[ak.llllIIlIl[0]] = llllIIlIl[8];
                    Inventory.getFirst((int[])nArray23).interact(llllIIlII[llllIIlIl[45]]);
                }
            }
            if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
                int[] nArray24 = new int[llllIIlIl[1]];
                nArray24[ak.llllIIlIl[0]] = llllIIlIl[9];
                if (ak.llIIllllIIIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[llllIIlIl[1]];
                    nArray25[ak.llllIIlIl[0]] = llllIIlIl[9];
                    if (ak.llIIllllIIll(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[llllIIlIl[1]];
                        nArray26[ak.llllIIlIl[0]] = llllIIlIl[9];
                        Inventory.getFirst((int[])nArray26).interact(llllIIlII[llllIIlIl[46]]);
                    }
                }
            }
            if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2]) && ak.llIIllllIllI(Skills.getLevel((Skill)Skill.DEFENCE), llllIIlIl[39])) {
                int[] nArray27 = new int[llllIIlIl[1]];
                nArray27[ak.llllIIlIl[0]] = llllIIlIl[10];
                if (ak.llIIllllIIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[llllIIlIl[1]];
                    nArray28[ak.llllIIlIl[0]] = llllIIlIl[10];
                    if (ak.llIIllllIIll(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[llllIIlIl[1]];
                        nArray29[ak.llllIIlIl[0]] = llllIIlIl[10];
                        Inventory.getFirst((int[])nArray29).interact(llllIIlII[llllIIlIl[47]]);
                    }
                }
            }
            if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
                int[] nArray30 = new int[llllIIlIl[1]];
                nArray30[ak.llllIIlIl[0]] = llllIIlIl[11];
                if (ak.llIIllllIIIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[llllIIlIl[1]];
                    nArray31[ak.llllIIlIl[0]] = llllIIlIl[11];
                    Inventory.getFirst((int[])nArray31).interact(llllIIlII[llllIIlIl[48]]);
                }
            }
        }
    }

    private static void Q() {
        block30: {
            d llIIIIIlIllII;
            block29: {
                block28: {
                    block27: {
                        Object llIIIIIlIllIl;
                        block25: {
                            block26: {
                                if (!ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[27])) break block25;
                                int[] nArray = new int[llllIIlIl[1]];
                                nArray[ak.llllIIlIl[0]] = llllIIlIl[12];
                                if (ak.llIIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(llllIIlIl[12], llllIIlIl[1], llllIIlIl[49]);
                                    bx.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[llllIIlIl[1]];
                                nArray2[ak.llllIIlIl[0]] = llllIIlIl[13];
                                if (ak.llIIllllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    llIIIIIlIllIl = new d(llllIIlIl[13], llllIIlIl[1], llllIIlIl[49]);
                                    bx.add((d)llIIIIIlIllIl);
                                    0;
                                }
                                int[] nArray3 = new int[llllIIlIl[1]];
                                nArray3[ak.llllIIlIl[0]] = llllIIlIl[14];
                                if (ak.llIIllllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    llIIIIIlIllIl = new d(llllIIlIl[14], llllIIlIl[1], llllIIlIl[49]);
                                    bx.add((d)llIIIIIlIllIl);
                                    0;
                                }
                                int[] nArray4 = new int[llllIIlIl[1]];
                                nArray4[ak.llllIIlIl[0]] = llllIIlIl[15];
                                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[llllIIlIl[1]];
                                nArray5[ak.llllIIlIl[0]] = llllIIlIl[15];
                                if (!ak.llIIllllIIlI(Bank.getFirst((int[])nArray5).getQuantity(), llllIIlIl[50])) break block25;
                            }
                            llIIIIIlIllIl = new d(llllIIlIl[15], llllIIlIl[51], llllIIlIl[36]);
                            bx.add((d)llIIIIIlIllIl);
                            0;
                        }
                        int[] nArray = new int[llllIIlIl[1]];
                        nArray[ak.llllIIlIl[0]] = llllIIlIl[18];
                        if (ak.llIIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llIIIIIlIllIl = new d(llllIIlIl[18], llllIIlIl[1], llllIIlIl[52]);
                            bx.add((d)llIIIIIlIllIl);
                            0;
                        }
                        int[] nArray6 = new int[llllIIlIl[1]];
                        nArray6[ak.llllIIlIl[0]] = llllIIlIl[19];
                        if (ak.llIIllllIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llIIIIIlIllIl = new d(llllIIlIl[19], llllIIlIl[1], llllIIlIl[52]);
                            bx.add((d)llIIIIIlIllIl);
                            0;
                        }
                        int[] nArray7 = new int[llllIIlIl[1]];
                        nArray7[ak.llllIIlIl[0]] = llllIIlIl[17];
                        if (ak.llIIllllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llIIIIIlIllIl = new d(llllIIlIl[17], llllIIlIl[1], llllIIlIl[52]);
                            bx.add((d)llIIIIIlIllIl);
                            0;
                        }
                        int[] nArray8 = new int[llllIIlIl[1]];
                        nArray8[ak.llllIIlIl[0]] = llllIIlIl[20];
                        if (ak.llIIllllIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            llIIIIIlIllIl = new d(llllIIlIl[20], llllIIlIl[1], llllIIlIl[53]);
                            bx.add((d)llIIIIIlIllIl);
                            0;
                        }
                        if (ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
                            int[] nArray9 = new int[llllIIlIl[1]];
                            nArray9[ak.llllIIlIl[0]] = llllIIlIl[16];
                            if (ak.llIIllllIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                llIIIIIlIllIl = new d(llllIIlIl[16], llllIIlIl[54], llllIIlIl[43]);
                                bx.add((d)llIIIIIlIllIl);
                                0;
                            }
                        }
                        int[] nArray10 = new int[llllIIlIl[1]];
                        nArray10[ak.llllIIlIl[0]] = llllIIlIl[9];
                        if (ak.llIIllllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            llIIIIIlIllIl = new d(llllIIlIl[9], llllIIlIl[1], llllIIlIl[55]);
                            bx.add((d)llIIIIIlIllIl);
                            0;
                        }
                        int[] nArray11 = new int[llllIIlIl[1]];
                        nArray11[ak.llllIIlIl[0]] = llllIIlIl[10];
                        if (ak.llIIllllIIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            llIIIIIlIllIl = new d(llllIIlIl[10], llllIIlIl[1], llllIIlIl[55]);
                            bx.add((d)llIIIIIlIllIl);
                            0;
                        }
                        if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
                            int[] nArray12 = new int[llllIIlIl[1]];
                            nArray12[ak.llllIIlIl[0]] = llllIIlIl[11];
                            if (ak.llIIllllIIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                llIIIIIlIllIl = new d(llllIIlIl[11], llllIIlIl[51], llllIIlIl[56]);
                                bx.add((d)llIIIIIlIllIl);
                                0;
                            }
                        }
                        int[] nArray13 = new int[llllIIlIl[1]];
                        nArray13[ak.llllIIlIl[0]] = llllIIlIl[22];
                        if (ak.llIIllllIIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            llIIIIIlIllIl = new d(llllIIlIl[22], llllIIlIl[1], j.ch);
                            bx.add((d)llIIIIIlIllIl);
                            0;
                        }
                        int[] nArray14 = new int[llllIIlIl[1]];
                        nArray14[ak.llllIIlIl[0]] = llllIIlIl[26];
                        if (ak.llIIllllIIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            llIIIIIlIllIl = new d(llllIIlIl[26], llllIIlIl[57], llllIIlIl[58]);
                            bx.add((d)llIIIIIlIllIl);
                            0;
                        }
                        if (ak.llIIllllIIll(Bank.contains((Predicate)(llIIIIIlIllIl = item -> item.getName().toLowerCase().contains(llllIIlII[llllIIlIl[63]]))) ? 1 : 0)) {
                            llIIIIIlIllII = new d(llllIIlIl[59], llllIIlIl[6], llllIIlIl[60]);
                            bx.add(llIIIIIlIllII);
                            0;
                        }
                        int[] nArray15 = new int[llllIIlIl[1]];
                        nArray15[ak.llllIIlIl[0]] = llllIIlIl[61];
                        if (!ak.llIIllllIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[llllIIlIl[1]];
                        nArray16[ak.llllIIlIl[0]] = llllIIlIl[61];
                        if (!ak.llIIllllIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[llllIIlIl[1]];
                        nArray17[ak.llllIIlIl[0]] = llllIIlIl[61];
                        if (!ak.llIIllllIIlI(Bank.getFirst((int[])nArray17).getQuantity(), llllIIlIl[24])) break block28;
                    }
                    llIIIIIlIllII = new d(llllIIlIl[61], llllIIlIl[24], llllIIlIl[62]);
                    bx.add(llIIIIIlIllII);
                    0;
                }
                int[] nArray = new int[llllIIlIl[1]];
                nArray[ak.llllIIlIl[0]] = llllIIlIl[23];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[llllIIlIl[1]];
                nArray18[ak.llllIIlIl[0]] = llllIIlIl[23];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[llllIIlIl[1]];
                nArray19[ak.llllIIlIl[0]] = llllIIlIl[23];
                if (!ak.llIIllllIIlI(Bank.getFirst((int[])nArray19).getQuantity(), llllIIlIl[24])) break block30;
            }
            llIIIIIlIllII = new d(llllIIlIl[23], llllIIlIl[24], llllIIlIl[62]);
            bx.add(llIIIIIlIllII);
            0;
        }
    }

    private static boolean llIIllllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIllllIIIl(int n2) {
        return n2 != 0;
    }

    private static String llIIlllIlllI(String llIIIIIIIlIII, String llIIIIIIIIlIl) {
        try {
            SecretKeySpec llIIIIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIIIlIlI = Cipher.getInstance("Blowfish");
            llIIIIIIIlIlI.init(llllIIlIl[3], llIIIIIIIlIll);
            return new String(llIIIIIIIlIlI.doFinal(Base64.getDecoder().decode(llIIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIIlIIl) {
            llIIIIIIIlIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
        int n2;
        block20: {
            block21: {
                if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2]) && ak.llIIlllllIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llllIIlIl[44]) && ak.llIIllllIllI(Skills.getLevel((Skill)Skill.DEFENCE), llllIIlIl[39])) {
                    int n3;
                    int[] nArray = new int[llllIIlIl[1]];
                    nArray[ak.llllIIlIl[0]] = llllIIlIl[9];
                    if (ak.llIIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llllIIlIl[1]];
                        nArray2[ak.llllIIlIl[0]] = llllIIlIl[10];
                        if (ak.llIIllllIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llllIIlIl[1]];
                            nArray3[ak.llllIIlIl[0]] = llllIIlIl[18];
                            if (ak.llIIllllIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llllIIlIl[1]];
                                nArray4[ak.llllIIlIl[0]] = llllIIlIl[20];
                                if (ak.llIIllllIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[llllIIlIl[1]];
                                    nArray5[ak.llllIIlIl[0]] = llllIIlIl[11];
                                    if (ak.llIIllllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[llllIIlIl[1]];
                                        nArray6[ak.llllIIlIl[0]] = llllIIlIl[8];
                                        if (ak.llIIllllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[llllIIlIl[1]];
                                            nArray7[ak.llllIIlIl[0]] = llllIIlIl[26];
                                            if (ak.llIIllllIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = llllIIlIl[1];
                                                0;
                                                if (3 != 0) return n3 != 0;
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = llllIIlIl[0];
                    return n3 != 0;
                }
                if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[27]) && ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
                    int n4;
                    int[] nArray = new int[llllIIlIl[1]];
                    nArray[ak.llllIIlIl[0]] = llllIIlIl[17];
                    if (ak.llIIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[llllIIlIl[1]];
                        nArray8[ak.llllIIlIl[0]] = llllIIlIl[19];
                        if (ak.llIIllllIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[llllIIlIl[1]];
                            nArray9[ak.llllIIlIl[0]] = llllIIlIl[18];
                            if (ak.llIIllllIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llllIIlIl[1]];
                                nArray10[ak.llllIIlIl[0]] = llllIIlIl[20];
                                if (ak.llIIllllIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[llllIIlIl[1]];
                                    nArray11[ak.llllIIlIl[0]] = llllIIlIl[16];
                                    if (ak.llIIllllIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[llllIIlIl[1]];
                                        nArray12[ak.llllIIlIl[0]] = llllIIlIl[26];
                                        if (ak.llIIllllIIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = llllIIlIl[1];
                                            0;
                                            if (3 == 3) return n4 != 0;
                                            return ((0x42 ^ 0x2E ^ (0x1D ^ 0x13)) & (0x58 ^ 0x37 ^ (0x21 ^ 0x2C) ^ -1)) != 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = llllIIlIl[0];
                    return n4 != 0;
                }
                int[] nArray = new int[llllIIlIl[1]];
                nArray[ak.llllIIlIl[0]] = llllIIlIl[17];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[llllIIlIl[1]];
                nArray13[ak.llllIIlIl[0]] = llllIIlIl[19];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[llllIIlIl[1]];
                nArray14[ak.llllIIlIl[0]] = llllIIlIl[18];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[llllIIlIl[1]];
                nArray15[ak.llllIIlIl[0]] = llllIIlIl[20];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[llllIIlIl[1]];
                nArray16[ak.llllIIlIl[0]] = llllIIlIl[12];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[llllIIlIl[1]];
                nArray17[ak.llllIIlIl[0]] = llllIIlIl[23];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[llllIIlIl[1]];
                nArray18[ak.llllIIlIl[0]] = llllIIlIl[13];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[llllIIlIl[1]];
                nArray19[ak.llllIIlIl[0]] = llllIIlIl[14];
                if (!ak.llIIllllIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[llllIIlIl[1]];
                nArray20[ak.llllIIlIl[0]] = llllIIlIl[15];
                if (!ak.llIIllllIIll(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[llllIIlIl[1]];
                nArray21[ak.llllIIlIl[0]] = llllIIlIl[15];
                if (!ak.llIIllllIIIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[llllIIlIl[1]];
            nArray[ak.llllIIlIl[0]] = llllIIlIl[16];
            if (ak.llIIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[llllIIlIl[1]];
                nArray22[ak.llllIIlIl[0]] = llllIIlIl[26];
                if (ak.llIIllllIIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = llllIIlIl[1];
                    0;
                    if ((114 + 139 - 224 + 135 ^ 139 + 61 - 58 + 19) > 0) return n2 != 0;
                    return ((0x77 ^ 1 ^ (0xF5 ^ 0xAC)) & (80 + 83 - 89 + 54 ^ 88 + 130 - 163 + 120 ^ -1)) != 0;
                }
            }
        }
        n2 = llllIIlIl[0];
        return n2 != 0;
    }

    private static boolean llIIllllIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIIllllIlll(Object object, Object object2) {
        return object != object2;
    }

    public static void aA() {
        if (ak.llIIllllIIIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = llllIIlII[llllIIlIl[0]];
            b.a(bx);
            if (ak.llIIllllIIlI(bx.size(), llllIIlIl[1])) {
                System.out.println(llllIIlII[llllIIlIl[1]]);
                bv = llllIIlIl[0];
            }
        }
        if (ak.llIIllllIIll(bv ? 1 : 0) && ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
            BankLocation llIIIIIllIIII;
            if (ak.llIIllllIIll(ak.an() ? 1 : 0)) {
                llIIIIIllIIII = BankLocation.getNearest();
                if (ak.llIIllllIlII(llIIIIIllIIII) && ak.llIIllllIIll(llIIIIIllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llllIIlII[llllIIlIl[3]];
                    a.a(llIIIIIllIIII);
                }
                if (ak.llIIllllIlII(llIIIIIllIIII) && ak.llIIllllIIIl(llIIIIIllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llllIIlII[llllIIlIl[4]];
                    if (ak.llIIllllIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIlIl[5]);
                        0;
                        Time.sleepTicks((int)llllIIlIl[4]);
                        0;
                    }
                    if (ak.llIIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (ak.llIIllllIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIIlIl[6]);
                            0;
                        }
                        if (ak.llIIllllIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIIlIl[3]);
                            0;
                        }
                        if (ak.llIIllllIIll(ak.ao() ? 1 : 0)) {
                            ak.Q();
                            System.out.println(llllIIlII[llllIIlIl[7]]);
                            bv = llllIIlIl[1];
                            return;
                        }
                        if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
                            a.a(llllIIlIl[8], llllIIlIl[1]);
                            a.a(llllIIlIl[9], llllIIlIl[1]);
                            a.a(llllIIlIl[10], llllIIlIl[1]);
                            Bank.withdrawAll((int)llllIIlIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
                            a.a(llllIIlIl[12], llllIIlIl[1]);
                            a.a(llllIIlIl[13], llllIIlIl[1]);
                            a.a(llllIIlIl[14], llllIIlIl[1]);
                            Bank.withdrawAll((int)llllIIlIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llllIIlIl[1]);
                            0;
                            Bank.withdrawAll((int)llllIIlIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llllIIlIl[1]);
                            0;
                            a.a(llllIIlIl[17], llllIIlIl[1]);
                        }
                        a.a(llllIIlIl[18], llllIIlIl[1]);
                        a.a(llllIIlIl[19], llllIIlIl[1]);
                        a.a(llllIIlIl[20], llllIIlIl[1]);
                        a.a(llllIIlIl[21], llllIIlIl[1]);
                        a.a(llllIIlIl[22], llllIIlIl[1]);
                        a.a(llllIIlIl[23], llllIIlIl[24]);
                        a.a(llllIIlIl[25], llllIIlIl[24]);
                        a.a(llllIIlIl[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (ak.llIIllllIIIl(ak.an() ? 1 : 0)) {
                ak.aB();
                if (ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[27])) {
                    m.al();
                }
                if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[27]) && ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2])) {
                    llIIIIIllIIII = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (ak.llIIlllllIII(tileItem.getId(), llllIIlIl[16]) && ak.llIIllllIllI(tileItem.getQuantity(), llllIIlIl[43])) {
                            n2 = llllIIlIl[1];
                            0;
                            
                            }
                        } else {
                            n2 = llllIIlIl[0];
                        }
                        return n2 != 0;
                    });
                    if (ak.llIIllllIlII(llIIIIIllIIII)) {
                        llIIIIIllIIII.interact(llllIIlII[llllIIlIl[6]]);
                        Time.sleepTicks((int)llllIIlIl[7]);
                        0;
                    }
                    l.aj();
                }
            }
        }
        if (ak.llIIllllIllI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[2]) && ak.llIIllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llllIIlIl[28])) {
            s.aV();
            int[] nArray = new int[llllIIlIl[1]];
            nArray[ak.llllIIlIl[0]] = llllIIlIl[29];
            if (ak.llIIllllIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllIIlIl[1]];
                nArray2[ak.llllIIlIl[0]] = llllIIlIl[29];
                Equipment.getFirst((int[])nArray2).interact(llllIIlII[llllIIlIl[30]]);
            }
        }
    }

    private static boolean llIIlllllIII(int n2, int n3) {
        return n2 == n3;
    }
}

