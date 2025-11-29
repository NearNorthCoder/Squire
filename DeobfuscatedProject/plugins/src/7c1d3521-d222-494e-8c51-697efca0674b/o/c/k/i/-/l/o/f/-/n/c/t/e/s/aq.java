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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.l;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.m;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.s;

public class aq
implements ac {
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] llIllIlIIl;
    private static /* synthetic */ String[] llIllIIlll;

    private static boolean lIllIlllllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllllIllI(Object object) {
        return object != null;
    }

    @Override
    public String ag() {
        return llIllIIlll[llIllIlIIl[34]];
    }

    private static String lIllIllIllIlI(String llllllllllllllllllIIIIlllllllIII, String llllllllllllllllllIIIIllllllIlll) {
        llllllllllllllllllIIIIlllllllIII = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIlllllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIlllllllIll = new StringBuilder();
        char[] llllllllllllllllllIIIIlllllllIlI = llllllllllllllllllIIIIllllllIlll.toCharArray();
        int llllllllllllllllllIIIIlllllllIIl = llIllIlIIl[0];
        char[] llllllllllllllllllIIIIllllllIIll = llllllllllllllllllIIIIlllllllIII.toCharArray();
        int llllllllllllllllllIIIIllllllIIlI = llllllllllllllllllIIIIllllllIIll.length;
        int llllllllllllllllllIIIIllllllIIIl = llIllIlIIl[0];
        while (aq.lIllIllllIlII(llllllllllllllllllIIIIllllllIIIl, llllllllllllllllllIIIIllllllIIlI)) {
            char llllllllllllllllllIIIIlllllllllI = llllllllllllllllllIIIIllllllIIll[llllllllllllllllllIIIIllllllIIIl];
            llllllllllllllllllIIIIlllllllIll.append((char)(llllllllllllllllllIIIIlllllllllI ^ llllllllllllllllllIIIIlllllllIlI[llllllllllllllllllIIIIlllllllIIl % llllllllllllllllllIIIIlllllllIlI.length]));
            "".length();
            ++llllllllllllllllllIIIIlllllllIIl;
            ++llllllllllllllllllIIIIllllllIIIl;
            "".length();
            if (-(0x5D ^ 0x58) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIIlllllllIll);
    }

    static {
        aq.lIllIllllIIlI();
        aq.lIllIlllIlllI();
        bv = new ArrayList<d>();
    }

    private static void aB() {
        block34: {
            block33: {
                int[] nArray = new int[llIllIlIIl[1]];
                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[31];
                if (!aq.lIllIllllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[llIllIlIIl[1]];
                nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[32];
                if (!aq.lIllIllllIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[llIllIlIIl[1]];
                nArray3[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                if (!aq.lIllIllllIlIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[llIllIlIIl[1]];
                nArray4[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                if (aq.lIllIllllIlIl(Equipment.contains((int[])nArray4) ? 1 : 0) && !aq.lIllIllllIIll(Equipment.contains(item -> item.getName().contains(llIllIIlll[llIllIlIIl[64]])) ? 1 : 0)) break block34;
            }
            if (aq.lIllIlllllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[31];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[llIllIlIIl[1]];
                nArray5[aq.llIllIlIIl[0]] = llIllIlIIl[31];
                Inventory.getFirst((int[])nArray5).interact(llIllIIlll[llIllIlIIl[33]]);
            }
            int[] nArray6 = new int[llIllIlIIl[1]];
            nArray6[aq.llIllIlIIl[0]] = llIllIlIIl[12];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray6) ? 1 : 0) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[6])) {
                e.l(llIllIlIIl[12]);
            }
            int[] nArray7 = new int[llIllIlIIl[1]];
            nArray7[aq.llIllIlIIl[0]] = llIllIlIIl[13];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray7) ? 1 : 0) && aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[6]) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[34])) {
                e.l(llIllIlIIl[13]);
            }
            int[] nArray8 = new int[llIllIlIIl[1]];
            nArray8[aq.llIllIlIIl[0]] = llIllIlIIl[14];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray8) ? 1 : 0) && aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[34])) {
                e.l(llIllIlIIl[14]);
            }
            int[] nArray9 = new int[llIllIlIIl[1]];
            nArray9[aq.llIllIlIIl[0]] = llIllIlIIl[15];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(llIllIlIIl[15]);
            }
        }
        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[34])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[llIllIlIIl[1]];
                nArray10[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                Inventory.getFirst((int[])nArray10).interact(llIllIIlll[llIllIlIIl[35]]);
            }
        }
        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[32];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[llIllIlIIl[1]];
                nArray11[aq.llIllIlIIl[0]] = llIllIlIIl[32];
                Inventory.getFirst((int[])nArray11).interact(llIllIIlll[llIllIlIIl[36]]);
            }
            int[] nArray12 = new int[llIllIlIIl[1]];
            nArray12[aq.llIllIlIIl[0]] = llIllIlIIl[37];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[llIllIlIIl[1]];
                nArray13[aq.llIllIlIIl[0]] = llIllIlIIl[37];
                Inventory.getFirst((int[])nArray13).interact(llIllIIlll[llIllIlIIl[24]]);
            }
            int[] nArray14 = new int[llIllIlIIl[1]];
            nArray14[aq.llIllIlIIl[0]] = llIllIlIIl[16];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llIllIlIIl[1]];
                nArray15[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                Inventory.getFirst((int[])nArray15).interact(llIllIIlll[llIllIlIIl[38]]);
            }
        }
        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[19];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIllIlIIl[1]];
                nArray16[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                Inventory.getFirst((int[])nArray16).interact(llIllIIlll[llIllIlIIl[40]]);
            }
        }
        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[llIllIlIIl[1]];
                nArray17[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                Inventory.getFirst((int[])nArray17).interact(llIllIIlll[llIllIlIIl[41]]);
            }
        }
        int[] nArray = new int[llIllIlIIl[1]];
        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
        if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[llIllIlIIl[1]];
            nArray18[aq.llIllIlIIl[0]] = llIllIlIIl[20];
            Inventory.getFirst((int[])nArray18).interact(llIllIIlll[llIllIlIIl[42]]);
        }
        int[] nArray19 = new int[llIllIlIIl[1]];
        nArray19[aq.llIllIlIIl[0]] = llIllIlIIl[21];
        if (aq.lIllIllllIIll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[llIllIlIIl[1]];
            nArray20[aq.llIllIlIIl[0]] = llIllIlIIl[21];
            Inventory.getFirst((int[])nArray20).interact(llIllIIlll[llIllIlIIl[43]]);
        }
        if (aq.lIllIlllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44])) {
            int[] nArray21 = new int[llIllIlIIl[1]];
            nArray21[aq.llIllIlIIl[0]] = llIllIlIIl[8];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[llIllIlIIl[1]];
                nArray22[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                if (aq.lIllIllllIlIl(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[llIllIlIIl[1]];
                    nArray23[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                    Inventory.getFirst((int[])nArray23).interact(llIllIIlll[llIllIlIIl[45]]);
                }
            }
            if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                int[] nArray24 = new int[llIllIlIIl[1]];
                nArray24[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                if (aq.lIllIllllIIll(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[llIllIlIIl[1]];
                    nArray25[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                    if (aq.lIllIllllIlIl(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[llIllIlIIl[1]];
                        nArray26[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                        Inventory.getFirst((int[])nArray26).interact(llIllIIlll[llIllIlIIl[46]]);
                    }
                }
            }
            if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) && aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) {
                int[] nArray27 = new int[llIllIlIIl[1]];
                nArray27[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                if (aq.lIllIllllIIll(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[llIllIlIIl[1]];
                    nArray28[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                    if (aq.lIllIllllIlIl(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[llIllIlIIl[1]];
                        nArray29[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                        Inventory.getFirst((int[])nArray29).interact(llIllIIlll[llIllIlIIl[47]]);
                    }
                }
            }
            if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                int[] nArray30 = new int[llIllIlIIl[1]];
                nArray30[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                if (aq.lIllIllllIIll(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[llIllIlIIl[1]];
                    nArray31[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                    Inventory.getFirst((int[])nArray31).interact(llIllIIlll[llIllIlIIl[48]]);
                }
            }
        }
    }

    @Override
    public int af() {
        try {
            aq.aA();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0x21 ^ 0x7F) & ~(0xE5 ^ 0xBB);
        }
        return llIllIlIIl[57];
    }

    private static boolean lIllIlllllIIl(Object object, Object object2) {
        return object != object2;
    }

    private static String lIllIllIlllII(String llllllllllllllllllIIIlIIIIIIlIll, String llllllllllllllllllIIIlIIIIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIIIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIlIIIIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIlIIIIIIllll.init(llIllIlIIl[3], llllllllllllllllllIIIlIIIIIlIIII);
            return new String(llllllllllllllllllIIIlIIIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlIIIIIIlllI) {
            llllllllllllllllllIIIlIIIIIIlllI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ae() {
        return llIllIlIIl[0];
    }

    private static boolean lIllIlllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void Q() {
        block30: {
            d llllllllllllllllllIIIlIIIIlIIllI;
            block29: {
                block28: {
                    block27: {
                        Object llllllllllllllllllIIIlIIIIlIIlll;
                        block25: {
                            block26: {
                                if (!aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27])) break block25;
                                int[] nArray = new int[llIllIlIIl[1]];
                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[12];
                                if (aq.lIllIllllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(llIllIlIIl[12], llIllIlIIl[1], llIllIlIIl[49]);
                                    bv.add(d2);
                                    "".length();
                                }
                                int[] nArray2 = new int[llIllIlIIl[1]];
                                nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[13];
                                if (aq.lIllIllllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[13], llIllIlIIl[1], llIllIlIIl[49]);
                                    bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                                    "".length();
                                }
                                int[] nArray3 = new int[llIllIlIIl[1]];
                                nArray3[aq.llIllIlIIl[0]] = llIllIlIIl[14];
                                if (aq.lIllIllllIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[14], llIllIlIIl[1], llIllIlIIl[49]);
                                    bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                                    "".length();
                                }
                                int[] nArray4 = new int[llIllIlIIl[1]];
                                nArray4[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[llIllIlIIl[1]];
                                nArray5[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                                if (!aq.lIllIllllIlII(Bank.getFirst((int[])nArray5).getQuantity(), llIllIlIIl[50])) break block25;
                            }
                            llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[15], llIllIlIIl[51], llIllIlIIl[36]);
                            bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                            "".length();
                        }
                        int[] nArray = new int[llIllIlIIl[1]];
                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[18], llIllIlIIl[1], llIllIlIIl[52]);
                            bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                            "".length();
                        }
                        int[] nArray6 = new int[llIllIlIIl[1]];
                        nArray6[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[19], llIllIlIIl[1], llIllIlIIl[52]);
                            bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                            "".length();
                        }
                        int[] nArray7 = new int[llIllIlIIl[1]];
                        nArray7[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[17], llIllIlIIl[1], llIllIlIIl[52]);
                            bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                            "".length();
                        }
                        int[] nArray8 = new int[llIllIlIIl[1]];
                        nArray8[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[20], llIllIlIIl[1], llIllIlIIl[53]);
                            bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                            "".length();
                        }
                        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                            int[] nArray9 = new int[llIllIlIIl[1]];
                            nArray9[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                            if (aq.lIllIllllIlIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[16], llIllIlIIl[54], llIllIlIIl[43]);
                                bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                                "".length();
                            }
                        }
                        int[] nArray10 = new int[llIllIlIIl[1]];
                        nArray10[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[9], llIllIlIIl[1], llIllIlIIl[55]);
                            bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                            "".length();
                        }
                        int[] nArray11 = new int[llIllIlIIl[1]];
                        nArray11[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[10], llIllIlIIl[1], llIllIlIIl[55]);
                            bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                            "".length();
                        }
                        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                            int[] nArray12 = new int[llIllIlIIl[1]];
                            nArray12[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                            if (aq.lIllIllllIlIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[11], llIllIlIIl[51], llIllIlIIl[56]);
                                bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                                "".length();
                            }
                        }
                        int[] nArray13 = new int[llIllIlIIl[1]];
                        nArray13[aq.llIllIlIIl[0]] = llIllIlIIl[22];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[22], llIllIlIIl[1], j.cf);
                            bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                            "".length();
                        }
                        int[] nArray14 = new int[llIllIlIIl[1]];
                        nArray14[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            llllllllllllllllllIIIlIIIIlIIlll = new d(llIllIlIIl[26], llIllIlIIl[57], llIllIlIIl[58]);
                            bv.add((d)llllllllllllllllllIIIlIIIIlIIlll);
                            "".length();
                        }
                        if (aq.lIllIllllIlIl(Bank.contains((Predicate)(llllllllllllllllllIIIlIIIIlIIlll = item -> item.getName().toLowerCase().contains(llIllIIlll[llIllIlIIl[63]]))) ? 1 : 0)) {
                            llllllllllllllllllIIIlIIIIlIIllI = new d(llIllIlIIl[59], llIllIlIIl[6], llIllIlIIl[60]);
                            bv.add(llllllllllllllllllIIIlIIIIlIIllI);
                            "".length();
                        }
                        int[] nArray15 = new int[llIllIlIIl[1]];
                        nArray15[aq.llIllIlIIl[0]] = llIllIlIIl[61];
                        if (!aq.lIllIllllIIll(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[llIllIlIIl[1]];
                        nArray16[aq.llIllIlIIl[0]] = llIllIlIIl[61];
                        if (!aq.lIllIllllIIll(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[llIllIlIIl[1]];
                        nArray17[aq.llIllIlIIl[0]] = llIllIlIIl[61];
                        if (!aq.lIllIllllIlII(Bank.getFirst((int[])nArray17).getQuantity(), llIllIlIIl[24])) break block28;
                    }
                    llllllllllllllllllIIIlIIIIlIIllI = new d(llIllIlIIl[61], llIllIlIIl[24], llIllIlIIl[62]);
                    bv.add(llllllllllllllllllIIIlIIIIlIIllI);
                    "".length();
                }
                int[] nArray = new int[llIllIlIIl[1]];
                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[23];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[llIllIlIIl[1]];
                nArray18[aq.llIllIlIIl[0]] = llIllIlIIl[23];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[llIllIlIIl[1]];
                nArray19[aq.llIllIlIIl[0]] = llIllIlIIl[23];
                if (!aq.lIllIllllIlII(Bank.getFirst((int[])nArray19).getQuantity(), llIllIlIIl[24])) break block30;
            }
            llllllllllllllllllIIIlIIIIlIIllI = new d(llIllIlIIl[23], llIllIlIIl[24], llIllIlIIl[62]);
            bv.add(llllllllllllllllllIIIlIIIIlIIllI);
            "".length();
        }
    }

    public static void aA() {
        if (aq.lIllIllllIIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIllIIlll[llIllIlIIl[0]];
            b.a(bv);
            if (aq.lIllIllllIlII(bv.size(), llIllIlIIl[1])) {
                System.out.println(llIllIIlll[llIllIlIIl[1]]);
                bt = llIllIlIIl[0];
            }
        }
        if (aq.lIllIllllIlIl(bt ? 1 : 0) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
            BankLocation llllllllllllllllllIIIlIIIIlIlIlI;
            if (aq.lIllIllllIlIl(aq.an() ? 1 : 0)) {
                llllllllllllllllllIIIlIIIIlIlIlI = BankLocation.getNearest();
                if (aq.lIllIllllIllI(llllllllllllllllllIIIlIIIIlIlIlI) && aq.lIllIllllIlIl(llllllllllllllllllIIIlIIIIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIlll[llIllIlIIl[3]];
                    a.a(llllllllllllllllllIIIlIIIIlIlIlI);
                }
                if (aq.lIllIllllIllI(llllllllllllllllllIIIlIIIIlIlIlI) && aq.lIllIllllIIll(llllllllllllllllllIIIlIIIIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIlll[llIllIlIIl[4]];
                    if (aq.lIllIllllIlIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIllIlIIl[5]);
                        "".length();
                        Time.sleepTicks((int)llIllIlIIl[4]);
                        "".length();
                    }
                    if (aq.lIllIllllIIll(Bank.isOpen() ? 1 : 0)) {
                        if (aq.lIllIllllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIllIlIIl[6]);
                            "".length();
                        }
                        if (aq.lIllIllllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIllIlIIl[3]);
                            "".length();
                        }
                        if (aq.lIllIllllIlIl(aq.ao() ? 1 : 0)) {
                            aq.Q();
                            System.out.println(llIllIIlll[llIllIlIIl[7]]);
                            bt = llIllIlIIl[1];
                            return;
                        }
                        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                            a.a(llIllIlIIl[8], llIllIlIIl[1]);
                            a.a(llIllIlIIl[9], llIllIlIIl[1]);
                            a.a(llIllIlIIl[10], llIllIlIIl[1]);
                            Bank.withdrawAll((int)llIllIlIIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                            a.a(llIllIlIIl[12], llIllIlIIl[1]);
                            a.a(llIllIlIIl[13], llIllIlIIl[1]);
                            a.a(llIllIlIIl[14], llIllIlIIl[1]);
                            Bank.withdrawAll((int)llIllIlIIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIllIlIIl[1]);
                            "".length();
                            Bank.withdrawAll((int)llIllIlIIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIllIlIIl[1]);
                            "".length();
                            a.a(llIllIlIIl[17], llIllIlIIl[1]);
                        }
                        a.a(llIllIlIIl[18], llIllIlIIl[1]);
                        a.a(llIllIlIIl[19], llIllIlIIl[1]);
                        a.a(llIllIlIIl[20], llIllIlIIl[1]);
                        a.a(llIllIlIIl[21], llIllIlIIl[1]);
                        a.a(llIllIlIIl[22], llIllIlIIl[1]);
                        a.a(llIllIlIIl[23], llIllIlIIl[24]);
                        a.a(llIllIlIIl[25], llIllIlIIl[24]);
                        a.a(llIllIlIIl[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (aq.lIllIllllIIll(aq.an() ? 1 : 0)) {
                aq.aB();
                if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27])) {
                    m.al();
                }
                if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27]) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                    llllllllllllllllllIIIlIIIIlIlIlI = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (aq.lIllIlllllIlI(tileItem.getId(), llIllIlIIl[16]) && aq.lIllIlllllIII(tileItem.getQuantity(), llIllIlIIl[43])) {
                            n2 = llIllIlIIl[1];
                            "".length();
                            if (-" ".length() == (0x64 ^ 0x50 ^ (0xA1 ^ 0x91))) {
                                return ((4 + 129 - -25 + 44 ^ 138 + 68 - 202 + 146) & (245 + 172 - 307 + 144 ^ 105 + 48 - -5 + 4 ^ -" ".length())) != 0;
                            }
                        } else {
                            n2 = llIllIlIIl[0];
                        }
                        return n2 != 0;
                    });
                    if (aq.lIllIllllIllI(llllllllllllllllllIIIlIIIIlIlIlI)) {
                        llllllllllllllllllIIIlIIIIlIlIlI.interact(llIllIIlll[llIllIlIIl[6]]);
                        Time.sleepTicks((int)llIllIlIIl[7]);
                        "".length();
                    }
                    l.aj();
                }
            }
        }
        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[28])) {
            s.aV();
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[29];
            if (aq.lIllIllllIIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIllIlIIl[1]];
                nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[29];
                Equipment.getFirst((int[])nArray2).interact(llIllIIlll[llIllIlIIl[30]]);
            }
        }
    }

    private static boolean lIllIllllIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIllllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllllIlIl(int n2) {
        return n2 == 0;
    }

    private static String lIllIllIllIll(String llllllllllllllllllIIIlIIIIIllIlI, String llllllllllllllllllIIIlIIIIIllIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIIIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), llIllIlIIl[35]), "DES");
            Cipher llllllllllllllllllIIIlIIIIIlllII = Cipher.getInstance("DES");
            llllllllllllllllllIIIlIIIIIlllII.init(llIllIlIIl[3], llllllllllllllllllIIIlIIIIIlllIl);
            return new String(llllllllllllllllllIIIlIIIIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlIIIIIllIll) {
            llllllllllllllllllIIIlIIIIIllIll.printStackTrace();
            return null;
        }
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
                                                                                                                                            if (!aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) || !aq.lIllIlllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44]) || !aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) break block16;
                                                                                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                                                                                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[llIllIlIIl[1]];
                                                                                                                                            nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                                                                                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                                                                                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[llIllIlIIl[1]];
                                                                                                                                        nArray3[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                                                                                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                                                                                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[llIllIlIIl[1]];
                                                                                                                                    nArray4[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                                                                                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                                                                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[llIllIlIIl[1]];
                                                                                                                                nArray5[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                                                                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                                                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[llIllIlIIl[1]];
                                                                                                                            nArray6[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                                                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                                                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[llIllIlIIl[1]];
                                                                                                                        nArray7[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                                                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                                                                                                    if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = llIllIlIIl[1];
                                                                                                                        "".length();
                                                                                                                        if (-" ".length() == -" ".length()) return n5 != 0;
                                                                                                                        return ((0x16 ^ 0x51 ^ (0xE0 ^ 0x8F)) & (157 + 152 - 213 + 92 ^ 116 + 20 - 120 + 132 ^ -" ".length())) != 0;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = llIllIlIIl[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) || !aq.lIllIlllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44]) || !aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) break block24;
                                                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                                                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[llIllIlIIl[1]];
                                                                                                            nArray8[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                                                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[llIllIlIIl[1]];
                                                                                                        nArray9[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                                                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[llIllIlIIl[1]];
                                                                                                    nArray10[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                                                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[llIllIlIIl[1]];
                                                                                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[llIllIlIIl[1]];
                                                                                                nArray11[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[llIllIlIIl[1]];
                                                                                            nArray12[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[llIllIlIIl[1]];
                                                                                        nArray13[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                                                                    if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = llIllIlIIl[1];
                                                                                        "".length();
                                                                                        if (" ".length() >= ((0xE ^ 0x4D ^ (0x40 ^ 0x3E)) & (0x51 ^ 0x72 ^ (0x90 ^ 0x8E) ^ -" ".length()))) return n4 != 0;
                                                                                        return ((94 + 42 - -48 + 11 ^ 90 + 62 - 32 + 8) & (10 + 169 - -15 + 27 ^ 32 + 148 - 43 + 21 ^ -" ".length())) != 0;
                                                                                    }
                                                                                }
                                                                                n4 = llIllIlIIl[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27]) || !aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) break block32;
                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[llIllIlIIl[1]];
                                                                            nArray14[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[llIllIlIIl[1]];
                                                                        nArray15[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[llIllIlIIl[1]];
                                                                    nArray16[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[llIllIlIIl[1]];
                                                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[llIllIlIIl[1]];
                                                                nArray17[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[llIllIlIIl[1]];
                                                            nArray18[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                                        if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = llIllIlIIl[1];
                                                            "".length();
                                                            if (-"   ".length() < 0) return n3 != 0;
                                                            return ((0x40 ^ 0x22) & ~(0xF1 ^ 0x93)) != 0;
                                                        }
                                                    }
                                                    n3 = llIllIlIIl[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[llIllIlIIl[1]];
                                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[llIllIlIIl[1]];
                                                nArray19[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[llIllIlIIl[1]];
                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[llIllIlIIl[1]];
                                            nArray20[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[llIllIlIIl[1]];
                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[llIllIlIIl[1]];
                                        nArray21[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[llIllIlIIl[1]];
                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[llIllIlIIl[1]];
                                    nArray22[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[llIllIlIIl[1]];
                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[llIllIlIIl[1]];
                                nArray23[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[llIllIlIIl[1]];
                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[12];
                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[llIllIlIIl[1]];
                            nArray24[aq.llIllIlIIl[0]] = llIllIlIIl[12];
                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[llIllIlIIl[1]];
                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[13];
                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[llIllIlIIl[1]];
                        nArray25[aq.llIllIlIIl[0]] = llIllIlIIl[13];
                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[llIllIlIIl[1]];
                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[14];
                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[llIllIlIIl[1]];
                    nArray26[aq.llIllIlIIl[0]] = llIllIlIIl[14];
                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[llIllIlIIl[1]];
                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[llIllIlIIl[1]];
                nArray27[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[26];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIllIlIIl[1];
                "".length();
                if (null == null) return n2 != 0;
                return ((0x26 ^ 7) & ~(0xB9 ^ 0x98)) != 0;
            }
        }
        n2 = llIllIlIIl[0];
        return n2 != 0;
    }

    private static void lIllIllllIIlI() {
        llIllIlIIl = new int[66];
        aq.llIllIlIIl[0] = (12 + 125 - 61 + 83 ^ 58 + 145 - 183 + 135) & (0x55 ^ 0x7D ^ (0xB7 ^ 0x9B) ^ -" ".length());
        aq.llIllIlIIl[1] = " ".length();
        aq.llIllIlIIl[2] = 11 + 13 - 11 + 139 ^ 149 + 55 - 166 + 132;
        aq.llIllIlIIl[3] = "  ".length();
        aq.llIllIlIIl[4] = "   ".length();
        aq.llIllIlIIl[5] = 0xFFFFDBCC & 0x37BB;
        aq.llIllIlIIl[6] = 0xF2 ^ 0xB3 ^ (0xC0 ^ 0x84);
        aq.llIllIlIIl[7] = 36 + 29 - 30 + 127 ^ 73 + 154 - 180 + 119;
        aq.llIllIlIIl[8] = -(0xFFFFB7BF & 0x5E75) & (0xFFFFBFFF & 0x7F37);
        aq.llIllIlIIl[9] = 0xFFFFCFBF & 0x39FD;
        aq.llIllIlIIl[10] = 0xFFFFEBEB & 0x1DD7;
        aq.llIllIlIIl[11] = 0xFFFFC3AE & 0x3F7B;
        aq.llIllIlIIl[12] = 0xFFFF8FFB & 0x734D;
        aq.llIllIlIIl[13] = 0xFFFF87EF & 0x7B5B;
        aq.llIllIlIIl[14] = 0xFFFF9B59 & 0x67F7;
        aq.llIllIlIIl[15] = -(0xFFFFE4EE & 0x7B9F) & (0xFFFFFBFF & 0x67FF);
        aq.llIllIlIIl[16] = 0xFFFF8FAF & 0x7379;
        aq.llIllIlIIl[17] = 0xFFFFDFE7 & 0x245F;
        aq.llIllIlIIl[18] = -(0xFFFFE377 & 0x3DAB) & (0xFFFFBFBF & 0x65F3);
        aq.llIllIlIIl[19] = 0xFFFF87EF & 0x7C79;
        aq.llIllIlIIl[20] = 0xFFFFAF7E & 0x7BF7;
        aq.llIllIlIIl[21] = 0xFFFFF6B9 & 0xFEE;
        aq.llIllIlIIl[22] = 0xFFFFBDF5 & 0x735B;
        aq.llIllIlIIl[23] = -(0xFFFFC8BD & 0x77E3) & (0xFFFFDFEB & 0x7FFD);
        aq.llIllIlIIl[24] = 0x31 ^ 0x3B;
        aq.llIllIlIIl[25] = -(0x1A ^ 0x1C) & (0xFFFF9F6F & 0x7FDF);
        aq.llIllIlIIl[26] = 0xFFFFE17F & 0x1FFB;
        aq.llIllIlIIl[27] = 6 + 101 - 47 + 158 ^ 96 + 36 - -62 + 2;
        aq.llIllIlIIl[28] = 0xE8 ^ 0xAE;
        aq.llIllIlIIl[29] = -(0xFFFFCCA9 & 0x7FDF) & (0xFFFFEFFF & 0x5FFE);
        aq.llIllIlIIl[30] = " ".length() ^ (0x4D ^ 0x4A);
        aq.llIllIlIIl[31] = 0xFFFF8BBF & 0x7767;
        aq.llIllIlIIl[32] = 0xFFFFB6F4 & 0x6BBB;
        aq.llIllIlIIl[33] = 0x60 ^ 0x10 ^ (0x2D ^ 0x5A);
        aq.llIllIlIIl[34] = 0x1E ^ 3 ^ (0x3F ^ 0x36);
        aq.llIllIlIIl[35] = 0xBB ^ 0x9E ^ (0x3D ^ 0x10);
        aq.llIllIlIIl[36] = 0x91 ^ 0x98;
        aq.llIllIlIIl[37] = 0xFFFFA6B7 & 0x7BFA;
        aq.llIllIlIIl[38] = 38 + 89 - 33 + 107 ^ 87 + 4 - 47 + 150;
        aq.llIllIlIIl[39] = 0x64 ^ 0x4C;
        aq.llIllIlIIl[40] = 0x54 ^ 0x58;
        aq.llIllIlIIl[41] = 0x89 ^ 0xA3 ^ (0xAF ^ 0x88);
        aq.llIllIlIIl[42] = 0x9A ^ 0x94;
        aq.llIllIlIIl[43] = 0xAE ^ 0xA1;
        aq.llIllIlIIl[44] = 148 + 104 - 186 + 88 + (0x96 ^ 0xA3) - (56 + 82 - 28 + 63) + (155 + 62 - 164 + 153);
        aq.llIllIlIIl[45] = 0x65 ^ 0x75;
        aq.llIllIlIIl[46] = 0x3A ^ 0x2B;
        aq.llIllIlIIl[47] = 53 + 48 - 83 + 163 ^ 85 + 66 - 139 + 155;
        aq.llIllIlIIl[48] = 75 + 136 - 66 + 1 ^ 46 + 109 - 144 + 118;
        aq.llIllIlIIl[49] = 0xFFFFBEBB & 0x7BDC;
        aq.llIllIlIIl[50] = 0xFFFF9FD9 & 0x67F6;
        aq.llIllIlIIl[51] = 0xFFFFFAFD & 0x2FFA;
        aq.llIllIlIIl[52] = -(0xFFFFEDFE & 0x72F3) & (0xFFFFFBFB & 0x7EFF);
        aq.llIllIlIIl[53] = 0xFFFF9A7E & 0xEFF7;
        aq.llIllIlIIl[54] = -(0xFFFFFFC7 & 0x44BE) & (0xFFFFFFDD & 0x5FFF);
        aq.llIllIlIIl[55] = 0xFFFFF3E5 & 0x4EFA;
        aq.llIllIlIIl[56] = 0x27 ^ 4;
        aq.llIllIlIIl[57] = 0x2D ^ 5 ^ (0xFC ^ 0xB0);
        aq.llIllIlIIl[58] = -(0xFFFFDC07 & 0x6FFB) & (0xFFFFDD72 & 0x6FCF);
        aq.llIllIlIIl[59] = -(0xFFFFF37B & 0x5D85) & (0xFFFFFFEE & 0x7FDD);
        aq.llIllIlIIl[60] = 0xFFFFE3EC & 0x7DBB;
        aq.llIllIlIIl[61] = -(120 + 68 - 120 + 93) & (0xFFFFDFEF & 0x3FF7);
        aq.llIllIlIIl[62] = 0xFFFFEBFD & 0x1786;
        aq.llIllIlIIl[63] = 62 + 188 - 129 + 88 ^ 62 + 123 - 23 + 34;
        aq.llIllIlIIl[64] = 8 + 30 - 34 + 176 ^ 134 + 150 - 203 + 81;
        aq.llIllIlIIl[65] = 0xB3 ^ 0xA4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
        int n2;
        block20: {
            block21: {
                if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) && aq.lIllIlllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44]) && aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) {
                    int n3;
                    int[] nArray = new int[llIllIlIIl[1]];
                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                    if (aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIllIlIIl[1]];
                        nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                        if (aq.lIllIllllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIllIlIIl[1]];
                            nArray3[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                            if (aq.lIllIllllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIllIlIIl[1]];
                                nArray4[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                if (aq.lIllIllllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[llIllIlIIl[1]];
                                    nArray5[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                    if (aq.lIllIllllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[llIllIlIIl[1]];
                                        nArray6[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                        if (aq.lIllIllllIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[llIllIlIIl[1]];
                                            nArray7[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                            if (aq.lIllIllllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = llIllIlIIl[1];
                                                "".length();
                                                if (-" ".length() <= 0) return n3 != 0;
                                                return ((0x2B ^ 0x40 ^ (0x1F ^ 0x6C)) & (0xC ^ 0x52 ^ (0x29 ^ 0x6F) ^ -" ".length())) != 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = llIllIlIIl[0];
                    return n3 != 0;
                }
                if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27]) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                    int n4;
                    int[] nArray = new int[llIllIlIIl[1]];
                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                    if (aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[llIllIlIIl[1]];
                        nArray8[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                        if (aq.lIllIllllIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[llIllIlIIl[1]];
                            nArray9[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                            if (aq.lIllIllllIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIllIlIIl[1]];
                                nArray10[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                if (aq.lIllIllllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[llIllIlIIl[1]];
                                    nArray11[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                                    if (aq.lIllIllllIIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[llIllIlIIl[1]];
                                        nArray12[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                        if (aq.lIllIllllIIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = llIllIlIIl[1];
                                            "".length();
                                            if ("  ".length() <= "   ".length()) return n4 != 0;
                                            return ((0x46 ^ 0x54 ^ (0x2B ^ 9)) & (0x2C ^ 0x62 ^ (0x4F ^ 0x31) ^ -" ".length())) != 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = llIllIlIIl[0];
                    return n4 != 0;
                }
                int[] nArray = new int[llIllIlIIl[1]];
                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[llIllIlIIl[1]];
                nArray13[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[llIllIlIIl[1]];
                nArray14[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[llIllIlIIl[1]];
                nArray15[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[llIllIlIIl[1]];
                nArray16[aq.llIllIlIIl[0]] = llIllIlIIl[12];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[llIllIlIIl[1]];
                nArray17[aq.llIllIlIIl[0]] = llIllIlIIl[23];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[llIllIlIIl[1]];
                nArray18[aq.llIllIlIIl[0]] = llIllIlIIl[13];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[llIllIlIIl[1]];
                nArray19[aq.llIllIlIIl[0]] = llIllIlIIl[14];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[llIllIlIIl[1]];
                nArray20[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                if (!aq.lIllIllllIlIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[llIllIlIIl[1]];
                nArray21[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[16];
            if (aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[llIllIlIIl[1]];
                nArray22[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                if (aq.lIllIllllIIll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = llIllIlIIl[1];
                    "".length();
                    if (-" ".length() < (44 + 78 - 10 + 19 ^ 81 + 64 - 84 + 74)) return n2 != 0;
                    return ((0x49 ^ 0xC ^ (0x53 ^ 0x1D)) & (0xE4 ^ 0x91 ^ (0x15 ^ 0x6B) ^ -" ".length())) != 0;
                }
            }
        }
        n2 = llIllIlIIl[0];
        return n2 != 0;
    }

    private static void lIllIlllIlllI() {
        llIllIIlll = new String[llIllIlIIl[65]];
        aq.llIllIIlll[aq.llIllIlIIl[0]] = aq.lIllIllIllIlI("NDwtBCQRaT0ZLxs6", "vITmJ");
        aq.llIllIIlll[aq.llIllIlIIl[1]] = aq.lIllIllIllIll("CM4rkUQEK2v6oDkPIkXPZhRiI/e90ZJyr+tAw9xQxr2MGhaJo1xWvlxTktv/bYpfyFtiB12sPUM=", "TBasU");
        aq.llIllIIlll[aq.llIllIlIIl[3]] = aq.lIllIllIlllII("WmXMoKhv4qSj4bnn26uqwIsE3eVmxi7a", "qoyfA");
        aq.llIllIIlll[aq.llIllIlIIl[4]] = aq.lIllIllIlllII("TT+AJLhBt6LiVzsE+P1g6/W0/gEFhAmK", "wdIZg");
        aq.llIllIIlll[aq.llIllIlIIl[7]] = aq.lIllIllIlllII("e4k4vK/UXpMEYB7Fi6a57242wK8bZmDS8VyTl4HOaQJqmKcf28soLZ9X8dNh8Fc4", "xQSAl");
        aq.llIllIIlll[aq.llIllIlIIl[6]] = aq.lIllIllIlllII("SStIMXJ2Jy8=", "qcAAX");
        aq.llIllIIlll[aq.llIllIlIIl[30]] = aq.lIllIllIllIll("JEvjjVKTXu8=", "uXsFW");
        aq.llIllIIlll[aq.llIllIlIIl[33]] = aq.lIllIllIllIlI("GScpNBM=", "NNLXw");
        aq.llIllIIlll[aq.llIllIlIIl[35]] = aq.lIllIllIlllII("TayQXi+rSr0=", "cSALI");
        aq.llIllIIlll[aq.llIllIlIIl[36]] = aq.lIllIllIllIlI("NQYyByc=", "boWkC");
        aq.llIllIIlll[aq.llIllIlIIl[24]] = aq.lIllIllIlllII("mcz/5ZBbFE8=", "abTfJ");
        aq.llIllIIlll[aq.llIllIlIIl[38]] = aq.lIllIllIlllII("SVsLP9negpo=", "PDfYh");
        aq.llIllIIlll[aq.llIllIlIIl[40]] = aq.lIllIllIllIll("rxehW0MmNPA=", "IpXZh");
        aq.llIllIIlll[aq.llIllIlIIl[41]] = aq.lIllIllIlllII("5QZcHFqpvtk=", "IFAKS");
        aq.llIllIIlll[aq.llIllIlIIl[42]] = aq.lIllIllIllIlI("MQ42Pw==", "fkWMz");
        aq.llIllIIlll[aq.llIllIlIIl[43]] = aq.lIllIllIllIll("gyvBgiTjPAk=", "KQhyx");
        aq.llIllIIlll[aq.llIllIlIIl[45]] = aq.lIllIllIlllII("XgXrazZxN7A=", "cvgjM");
        aq.llIllIIlll[aq.llIllIlIIl[46]] = aq.lIllIllIllIlI("AioqBg==", "UOKta");
        aq.llIllIIlll[aq.llIllIlIIl[47]] = aq.lIllIllIllIll("6igKj9InF3A=", "KBpHP");
        aq.llIllIIlll[aq.llIllIlIIl[48]] = aq.lIllIllIllIll("v7OtAZ7pvjc=", "oqdgH");
        aq.llIllIIlll[aq.llIllIlIIl[34]] = aq.lIllIllIlllII("b3uYjJm9QyAjwTvdqzhgPA==", "sGWXm");
        aq.llIllIIlll[aq.llIllIlIIl[63]] = aq.lIllIllIllIll("j8ll3r1R8vplepCIRI0dQB8hM1Pcqc6B", "UOnSk");
        aq.llIllIIlll[aq.llIllIlIIl[64]] = aq.lIllIllIlllII("vKwtUQAaNs0=", "VbIkQ");
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[28])) {
            bl = llIllIlIIl[1];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return ((47 + 125 - 72 + 58 ^ 138 + 55 - 186 + 161) & (0x7E ^ 0x45 ^ (0x4F ^ 0x42) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIllIlIIl[0];
        }
        return bl;
    }
}

