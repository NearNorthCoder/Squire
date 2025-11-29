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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.k;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.l;
import gg.squire.account.AccBuilderBarrows;
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

public class m
implements F {
    private static /* synthetic */ int[] lIIIIIIll;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] lIIIIIIlI;
    public static /* synthetic */ List<d> bB;

    private static boolean llIlIlllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIlIllIIII(String lIIlIllIIIlIIlI, String lIIlIllIIIlIIll) {
        try {
            SecretKeySpec lIIlIllIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIllIIIlIllI = Cipher.getInstance("Blowfish");
            lIIlIllIIIlIllI.init(lIIIIIIll[2], lIIlIllIIIlIlll);
            return new String(lIIlIllIIIlIllI.doFinal(Base64.getDecoder().decode(lIIlIllIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIllIIIlIlIl) {
            lIIlIllIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlllIIl(int n2) {
        return n2 > 0;
    }

    private static void llIlIllIIll() {
        lIIIIIIlI = new String[lIIIIIIll[62]];
        m.lIIIIIIlI[m.lIIIIIIll[0]] = m.llIlIllIIII("s0oF7QI3rW79zOyT5s/Hrg==", "kKpvv");
        m.lIIIIIIlI[m.lIIIIIIll[1]] = m.llIlIllIIIl("CwIvDiolDiVHOzgSKAk+bQI1AjQ+R2EULiQfIg8wIwxhBTguAGETNm0GIAAwLks1FTgkBSgJPg==", "MkAgY");
        m.lIIIIIIlI[m.lIIIIIIll[2]] = m.llIlIllIIlI("0LilH4HrJpkHFRS/XXUtEBzBUuWFtjWm", "KVTzA");
        m.lIIIIIIlI[m.lIIIIIIll[3]] = m.llIlIllIIlI("k5GhaH9ZOmmaYjcfKOfe7200+q4Ph7Sf", "rRUke");
        m.lIIIIIIlI[m.lIIIIIIll[6]] = m.llIlIllIIII("q83qZZXTZ/3qWyO+XGokTsyGElJm2CBC1wOzQV8vE8cWIy8fbWbA8uv2FgTZH5Rd", "FInNq");
        m.lIIIIIIlI[m.lIIIIIIll[5]] = m.llIlIllIIIl("HScEAw==", "IFofg");
        m.lIIIIIIlI[m.lIIIIIIll[30]] = m.llIlIllIIlI("cnG0pQ6dW7M=", "uHUIQ");
        m.lIIIIIIlI[m.lIIIIIIll[32]] = m.llIlIllIIlI("D8IgQHO+K0M=", "oRooY");
        m.lIIIIIIlI[m.lIIIIIIll[33]] = m.llIlIllIIlI("tiIOfxTEqyc=", "ZpOiF");
        m.lIIIIIIlI[m.lIIIIIIll[35]] = m.llIlIllIIII("H1qaHp7N2LQ=", "LZdxg");
        m.lIIIIIIlI[m.lIIIIIIll[24]] = m.llIlIllIIIl("MSc0NBM=", "fNQXw");
        m.lIIIIIIlI[m.lIIIIIIll[37]] = m.llIlIllIIIl("NgsvMA==", "anNBt");
        m.lIIIIIIlI[m.lIIIIIIll[38]] = m.llIlIllIIIl("LQEVNw==", "zdtEw");
        m.lIIIIIIlI[m.lIIIIIIll[39]] = m.llIlIllIIlI("EGAUDmVGlCc=", "KINbo");
        m.lIIIIIIlI[m.lIIIIIIll[40]] = m.llIlIllIIII("TRshpKJMDg4=", "WvEzD");
        m.lIIIIIIlI[m.lIIIIIIll[42]] = m.llIlIllIIlI("Ks5q46fbIhI=", "JZzZf");
        m.lIIIIIIlI[m.lIIIIIIll[43]] = m.llIlIllIIlI("hG7BvPEzgpw=", "apVWx");
        m.lIIIIIIlI[m.lIIIIIIll[44]] = m.llIlIllIIII("firF1f5PrUU=", "HMMUR");
        m.lIIIIIIlI[m.lIIIIIIll[45]] = m.llIlIllIIlI("XPwW7MXYUTc=", "pGvoE");
        m.lIIIIIIlI[m.lIIIIIIll[60]] = m.llIlIllIIIl("MTQdAxNDIQEFHw08HQM=", "cUsdv");
        m.lIIIIIIlI[m.lIIIIIIll[31]] = m.llIlIllIIII("SZ+K7hGvqTgRqwVFOBfRSbLYCfYPSSBJ", "JRuFs");
        m.lIIIIIIlI[m.lIIIIIIll[61]] = m.llIlIllIIlI("jfO2t8nPhkk=", "uzNqn");
    }

    private static boolean llIlIlllIII(Object object) {
        return object != null;
    }

    private static void ar() {
        block34: {
            block33: {
                int[] nArray = new int[lIIIIIIll[1]];
                nArray[m.lIIIIIIll[0]] = lIIIIIIll[28];
                if (!m.llIlIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[lIIIIIIll[1]];
                nArray2[m.lIIIIIIll[0]] = lIIIIIIll[29];
                if (!m.llIlIllIlll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[lIIIIIIll[1]];
                nArray3[m.lIIIIIIll[0]] = lIIIIIIll[16];
                if (!m.llIlIllIlll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[lIIIIIIll[1]];
                nArray4[m.lIIIIIIll[0]] = lIIIIIIll[11];
                if (m.llIlIllIlll(Equipment.contains((int[])nArray4) ? 1 : 0) && !m.llIlIllIlIl(Equipment.contains(item -> item.getName().contains(lIIIIIIlI[lIIIIIIll[61]])) ? 1 : 0)) break block34;
            }
            if (m.llIlIlllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[28];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[lIIIIIIll[1]];
                nArray5[m.lIIIIIIll[0]] = lIIIIIIll[28];
                Inventory.getFirst((int[])nArray5).interact(lIIIIIIlI[lIIIIIIll[30]]);
            }
            int[] nArray6 = new int[lIIIIIIll[1]];
            nArray6[m.lIIIIIIll[0]] = lIIIIIIll[12];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray6) ? 1 : 0) && m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[5])) {
                e.l(lIIIIIIll[12]);
            }
            int[] nArray7 = new int[lIIIIIIll[1]];
            nArray7[m.lIIIIIIll[0]] = lIIIIIIll[13];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray7) ? 1 : 0) && m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[5]) && m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[31])) {
                e.l(lIIIIIIll[13]);
            }
            int[] nArray8 = new int[lIIIIIIll[1]];
            nArray8[m.lIIIIIIll[0]] = lIIIIIIll[14];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray8) ? 1 : 0) && m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[31])) {
                e.l(lIIIIIIll[14]);
            }
            int[] nArray9 = new int[lIIIIIIll[1]];
            nArray9[m.lIIIIIIll[0]] = lIIIIIIll[15];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(lIIIIIIll[15]);
            }
        }
        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[31])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[lIIIIIIll[1]];
                nArray10[m.lIIIIIIll[0]] = lIIIIIIll[18];
                Inventory.getFirst((int[])nArray10).interact(lIIIIIIlI[lIIIIIIll[32]]);
            }
        }
        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[29];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[lIIIIIIll[1]];
                nArray11[m.lIIIIIIll[0]] = lIIIIIIll[29];
                Inventory.getFirst((int[])nArray11).interact(lIIIIIIlI[lIIIIIIll[33]]);
            }
            int[] nArray12 = new int[lIIIIIIll[1]];
            nArray12[m.lIIIIIIll[0]] = lIIIIIIll[34];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[lIIIIIIll[1]];
                nArray13[m.lIIIIIIll[0]] = lIIIIIIll[34];
                Inventory.getFirst((int[])nArray13).interact(lIIIIIIlI[lIIIIIIll[35]]);
            }
            int[] nArray14 = new int[lIIIIIIll[1]];
            nArray14[m.lIIIIIIll[0]] = lIIIIIIll[16];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIIIIIll[1]];
                nArray15[m.lIIIIIIll[0]] = lIIIIIIll[16];
                Inventory.getFirst((int[])nArray15).interact(lIIIIIIlI[lIIIIIIll[24]]);
            }
        }
        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[19];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIIIll[1]];
                nArray16[m.lIIIIIIll[0]] = lIIIIIIll[19];
                Inventory.getFirst((int[])nArray16).interact(lIIIIIIlI[lIIIIIIll[37]]);
            }
        }
        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[lIIIIIIll[1]];
                nArray17[m.lIIIIIIll[0]] = lIIIIIIll[17];
                Inventory.getFirst((int[])nArray17).interact(lIIIIIIlI[lIIIIIIll[38]]);
            }
        }
        int[] nArray = new int[lIIIIIIll[1]];
        nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
        if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[lIIIIIIll[1]];
            nArray18[m.lIIIIIIll[0]] = lIIIIIIll[20];
            Inventory.getFirst((int[])nArray18).interact(lIIIIIIlI[lIIIIIIll[39]]);
        }
        int[] nArray19 = new int[lIIIIIIll[1]];
        nArray19[m.lIIIIIIll[0]] = lIIIIIIll[21];
        if (m.llIlIllIlIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIIIIIIll[1]];
            nArray20[m.lIIIIIIll[0]] = lIIIIIIll[21];
            Inventory.getFirst((int[])nArray20).interact(lIIIIIIlI[lIIIIIIll[40]]);
        }
        if (m.llIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41])) {
            int[] nArray21 = new int[lIIIIIIll[1]];
            nArray21[m.lIIIIIIll[0]] = lIIIIIIll[8];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIIIIIIll[1]];
                nArray22[m.lIIIIIIll[0]] = lIIIIIIll[8];
                if (m.llIlIllIlll(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIIIIIIll[1]];
                    nArray23[m.lIIIIIIll[0]] = lIIIIIIll[8];
                    Inventory.getFirst((int[])nArray23).interact(lIIIIIIlI[lIIIIIIll[42]]);
                }
            }
            if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                int[] nArray24 = new int[lIIIIIIll[1]];
                nArray24[m.lIIIIIIll[0]] = lIIIIIIll[9];
                if (m.llIlIllIlIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[lIIIIIIll[1]];
                    nArray25[m.lIIIIIIll[0]] = lIIIIIIll[9];
                    if (m.llIlIllIlll(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[lIIIIIIll[1]];
                        nArray26[m.lIIIIIIll[0]] = lIIIIIIll[9];
                        Inventory.getFirst((int[])nArray26).interact(lIIIIIIlI[lIIIIIIll[43]]);
                    }
                }
            }
            if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7]) && m.llIlIlllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) {
                int[] nArray27 = new int[lIIIIIIll[1]];
                nArray27[m.lIIIIIIll[0]] = lIIIIIIll[10];
                if (m.llIlIllIlIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[lIIIIIIll[1]];
                    nArray28[m.lIIIIIIll[0]] = lIIIIIIll[10];
                    if (m.llIlIllIlll(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[lIIIIIIll[1]];
                        nArray29[m.lIIIIIIll[0]] = lIIIIIIll[10];
                        Inventory.getFirst((int[])nArray29).interact(lIIIIIIlI[lIIIIIIll[44]]);
                    }
                }
            }
            if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                int[] nArray30 = new int[lIIIIIIll[1]];
                nArray30[m.lIIIIIIll[0]] = lIIIIIIll[11];
                if (m.llIlIllIlIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[lIIIIIIll[1]];
                    nArray31[m.lIIIIIIll[0]] = lIIIIIIll[11];
                    Inventory.getFirst((int[])nArray31).interact(lIIIIIIlI[lIIIIIIll[45]]);
                }
            }
        }
    }

    private static String llIlIllIIlI(String lIIlIlIlllIllIl, String lIIlIlIlllIlllI) {
        try {
            SecretKeySpec lIIlIlIllllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIlIlllIlllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIll[33]), "DES");
            Cipher lIIlIlIllllIIIl = Cipher.getInstance("DES");
            lIIlIlIllllIIIl.init(lIIIIIIll[2], lIIlIlIllllIIlI);
            return new String(lIIlIlIllllIIIl.doFinal(Base64.getDecoder().decode(lIIlIlIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIllllIIII) {
            lIIlIlIllllIIII.printStackTrace();
            return null;
        }
    }

    public static void aq() {
        if (m.llIlIllIlIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIIIIIIlI[lIIIIIIll[0]];
            b.a(bB);
            if (m.llIlIllIllI(bB.size(), lIIIIIIll[1])) {
                System.out.println(lIIIIIIlI[lIIIIIIll[1]]);
                bz = lIIIIIIll[0];
            }
        }
        if (m.llIlIllIlll(bz ? 1 : 0)) {
            BankLocation lIIlIllIIlIIlII;
            if (m.llIlIllIlll(m.ac() ? 1 : 0)) {
                lIIlIllIIlIIlII = BankLocation.getNearest();
                if (m.llIlIlllIII(lIIlIllIIlIIlII) && m.llIlIllIlll(lIIlIllIIlIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIlI[lIIIIIIll[2]];
                    a.a(lIIlIllIIlIIlII);
                }
                if (m.llIlIlllIII(lIIlIllIIlIIlII) && m.llIlIllIlIl(lIIlIllIIlIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIlI[lIIIIIIll[3]];
                    if (m.llIlIllIlll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIll[4]);
                        "".length();
                        Time.sleepTicks((int)lIIIIIIll[3]);
                        "".length();
                    }
                    if (m.llIlIllIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (m.llIlIlllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIIll[5]);
                            "".length();
                        }
                        if (m.llIlIlllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIIll[2]);
                            "".length();
                        }
                        if (m.llIlIllIlll(m.ad() ? 1 : 0)) {
                            m.ag();
                            System.out.println(lIIIIIIlI[lIIIIIIll[6]]);
                            bz = lIIIIIIll[1];
                            return;
                        }
                        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                            a.a(lIIIIIIll[8], lIIIIIIll[1]);
                            a.a(lIIIIIIll[9], lIIIIIIll[1]);
                            a.a(lIIIIIIll[10], lIIIIIIll[1]);
                            Bank.withdrawAll((int)lIIIIIIll[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                            a.a(lIIIIIIll[12], lIIIIIIll[1]);
                            a.a(lIIIIIIll[13], lIIIIIIll[1]);
                            a.a(lIIIIIIll[14], lIIIIIIll[1]);
                            Bank.withdrawAll((int)lIIIIIIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIIIIll[1]);
                            "".length();
                            Bank.withdrawAll((int)lIIIIIIll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIIIIll[1]);
                            "".length();
                            a.a(lIIIIIIll[17], lIIIIIIll[1]);
                        }
                        a.a(lIIIIIIll[18], lIIIIIIll[1]);
                        a.a(lIIIIIIll[19], lIIIIIIll[1]);
                        a.a(lIIIIIIll[20], lIIIIIIll[1]);
                        a.a(lIIIIIIll[21], lIIIIIIll[1]);
                        a.a(lIIIIIIll[22], lIIIIIIll[1]);
                        a.a(lIIIIIIll[23], lIIIIIIll[24]);
                        a.a(lIIIIIIll[25], lIIIIIIll[24]);
                        a.a(lIIIIIIll[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (m.llIlIllIlIl(m.ac() ? 1 : 0)) {
                m.ar();
                if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) {
                    l.aa();
                }
                if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) {
                    lIIlIllIIlIIlII = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (m.llIlIllllII(tileItem.getId(), lIIIIIIll[16]) && m.llIlIlllIlI(tileItem.getQuantity(), lIIIIIIll[42])) {
                            n2 = lIIIIIIll[1];
                            "".length();
                            if (((0x17 ^ 4) & ~(0x5D ^ 0x4E)) != 0) {
                                return ("   ".length() & ~"   ".length()) != 0;
                            }
                        } else {
                            n2 = lIIIIIIll[0];
                        }
                        return n2 != 0;
                    });
                    if (m.llIlIlllIII(lIIlIllIIlIIlII)) {
                        lIIlIllIIlIIlII.interact(lIIIIIIlI[lIIIIIIll[5]]);
                        Time.sleepTicks((int)lIIIIIIll[6]);
                        "".length();
                    }
                    k.Y();
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ad() {
        int n2;
        block20: {
            block21: {
                if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7]) && m.llIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41]) && m.llIlIlllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) {
                    int n3;
                    int[] nArray = new int[lIIIIIIll[1]];
                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[9];
                    if (m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIIIIll[1]];
                        nArray2[m.lIIIIIIll[0]] = lIIIIIIll[10];
                        if (m.llIlIllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIIIIIll[1]];
                            nArray3[m.lIIIIIIll[0]] = lIIIIIIll[18];
                            if (m.llIlIllIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIIIIll[1]];
                                nArray4[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                if (m.llIlIllIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[lIIIIIIll[1]];
                                    nArray5[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                    if (m.llIlIllIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[lIIIIIIll[1]];
                                        nArray6[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                        if (m.llIlIllIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[lIIIIIIll[1]];
                                            nArray7[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                            if (m.llIlIllIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = lIIIIIIll[1];
                                                "".length();
                                                if ("   ".length() > 0) return n3 != 0;
                                                return ((4 ^ 0x4C ^ (0x27 ^ 0x65)) & (0x46 ^ 3 ^ (0x5C ^ 0x13) ^ -" ".length())) != 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = lIIIIIIll[0];
                    return n3 != 0;
                }
                if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27]) && m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                    int n4;
                    int[] nArray = new int[lIIIIIIll[1]];
                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
                    if (m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIIIIIll[1]];
                        nArray8[m.lIIIIIIll[0]] = lIIIIIIll[19];
                        if (m.llIlIllIlIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIIIIIIll[1]];
                            nArray9[m.lIIIIIIll[0]] = lIIIIIIll[18];
                            if (m.llIlIllIlIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIIIIll[1]];
                                nArray10[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                if (m.llIlIllIlIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[lIIIIIIll[1]];
                                    nArray11[m.lIIIIIIll[0]] = lIIIIIIll[16];
                                    if (m.llIlIllIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[lIIIIIIll[1]];
                                        nArray12[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                        if (m.llIlIllIlIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = lIIIIIIll[1];
                                            "".length();
                                            if (null == null) return n4 != 0;
                                            return ((0x17 ^ 0x36) & ~(0x8C ^ 0xAD)) != 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = lIIIIIIll[0];
                    return n4 != 0;
                }
                int[] nArray = new int[lIIIIIIll[1]];
                nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[lIIIIIIll[1]];
                nArray13[m.lIIIIIIll[0]] = lIIIIIIll[19];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[lIIIIIIll[1]];
                nArray14[m.lIIIIIIll[0]] = lIIIIIIll[18];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[lIIIIIIll[1]];
                nArray15[m.lIIIIIIll[0]] = lIIIIIIll[20];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIIIIIIll[1]];
                nArray16[m.lIIIIIIll[0]] = lIIIIIIll[12];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[lIIIIIIll[1]];
                nArray17[m.lIIIIIIll[0]] = lIIIIIIll[23];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[lIIIIIIll[1]];
                nArray18[m.lIIIIIIll[0]] = lIIIIIIll[13];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[lIIIIIIll[1]];
                nArray19[m.lIIIIIIll[0]] = lIIIIIIll[14];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[lIIIIIIll[1]];
                nArray20[m.lIIIIIIll[0]] = lIIIIIIll[15];
                if (!m.llIlIllIlll(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[lIIIIIIll[1]];
                nArray21[m.lIIIIIIll[0]] = lIIIIIIll[15];
                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[16];
            if (m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[lIIIIIIll[1]];
                nArray22[m.lIIIIIIll[0]] = lIIIIIIll[26];
                if (m.llIlIllIlIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = lIIIIIIll[1];
                    "".length();
                    if (-"   ".length() <= 0) return n2 != 0;
                    return ((0x6B ^ 0x17 ^ (0x6D ^ 0x44)) & (38 + 52 - -53 + 94 ^ 175 + 131 - 283 + 161 ^ -" ".length())) != 0;
                }
            }
        }
        n2 = lIIIIIIll[0];
        return n2 != 0;
    }

    private static String llIlIllIIIl(String lIIlIllIIIIIlII, String lIIlIllIIIIIIll) {
        lIIlIllIIIIIlII = new String(Base64.getDecoder().decode(lIIlIllIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIllIIIIIIlI = new StringBuilder();
        char[] lIIlIllIIIIIIIl = lIIlIllIIIIIIll.toCharArray();
        int lIIlIllIIIIIIII = lIIIIIIll[0];
        char[] lIIlIlIlllllIlI = lIIlIllIIIIIlII.toCharArray();
        int lIIlIlIlllllIIl = lIIlIlIlllllIlI.length;
        int lIIlIlIlllllIII = lIIIIIIll[0];
        while (m.llIlIllIllI(lIIlIlIlllllIII, lIIlIlIlllllIIl)) {
            char lIIlIllIIIIIlIl = lIIlIlIlllllIlI[lIIlIlIlllllIII];
            lIIlIllIIIIIIlI.append((char)(lIIlIllIIIIIlIl ^ lIIlIllIIIIIIIl[lIIlIllIIIIIIII % lIIlIllIIIIIIIl.length]));
            "".length();
            ++lIIlIllIIIIIIII;
            ++lIIlIlIlllllIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIIlIllIIIIIIlI);
    }

    private static boolean llIlIlllIll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
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
                                                                                                                                            if (!m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7]) || !m.llIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41]) || !m.llIlIlllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) break block16;
                                                                                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[9];
                                                                                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[lIIIIIIll[1]];
                                                                                                                                            nArray2[m.lIIIIIIll[0]] = lIIIIIIll[9];
                                                                                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[10];
                                                                                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[lIIIIIIll[1]];
                                                                                                                                        nArray3[m.lIIIIIIll[0]] = lIIIIIIll[10];
                                                                                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                                                                                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[lIIIIIIll[1]];
                                                                                                                                    nArray4[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                                                                                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                                                                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[lIIIIIIll[1]];
                                                                                                                                nArray5[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                                                                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                                                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[lIIIIIIll[1]];
                                                                                                                            nArray6[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                                                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                                                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[lIIIIIIll[1]];
                                                                                                                        nArray7[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                                                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                                                                                                    if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = lIIIIIIll[1];
                                                                                                                        "".length();
                                                                                                                        if (null == null) return n5 != 0;
                                                                                                                        return ((0x7B ^ 0x20) & ~(0x1F ^ 0x44)) != 0;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = lIIIIIIll[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7]) || !m.llIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41]) || !m.llIlIllIllI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) break block24;
                                                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[9];
                                                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[lIIIIIIll[1]];
                                                                                                            nArray8[m.lIIIIIIll[0]] = lIIIIIIll[9];
                                                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[lIIIIIIll[1]];
                                                                                                        nArray9[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                                                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[lIIIIIIll[1]];
                                                                                                    nArray10[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                                                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[lIIIIIIll[1]];
                                                                                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[lIIIIIIll[1]];
                                                                                                nArray11[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[lIIIIIIll[1]];
                                                                                            nArray12[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[lIIIIIIll[1]];
                                                                                        nArray13[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                                                                    if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = lIIIIIIll[1];
                                                                                        "".length();
                                                                                        if (-" ".length() <= -" ".length()) return n4 != 0;
                                                                                        return ((0x91 ^ 0x8C ^ (0xBE ^ 0xBB)) & (0x5F ^ 0x6B ^ (1 ^ 0x2D) ^ -" ".length())) != 0;
                                                                                    }
                                                                                }
                                                                                n4 = lIIIIIIll[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27]) || !m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) break block32;
                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[lIIIIIIll[1]];
                                                                            nArray14[m.lIIIIIIll[0]] = lIIIIIIll[17];
                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[lIIIIIIll[1]];
                                                                        nArray15[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[lIIIIIIll[1]];
                                                                    nArray16[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[lIIIIIIll[1]];
                                                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[lIIIIIIll[1]];
                                                                nArray17[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[16];
                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[lIIIIIIll[1]];
                                                            nArray18[m.lIIIIIIll[0]] = lIIIIIIll[16];
                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                                        if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = lIIIIIIll[1];
                                                            "".length();
                                                            if (" ".length() > 0) return n3 != 0;
                                                            return (("  ".length() ^ (0x4D ^ 0xC)) & (36 + 189 - 6 + 14 ^ 121 + 85 - 67 + 31 ^ -" ".length())) != 0;
                                                        }
                                                    }
                                                    n3 = lIIIIIIll[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[lIIIIIIll[1]];
                                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
                                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[lIIIIIIll[1]];
                                                nArray19[m.lIIIIIIll[0]] = lIIIIIIll[17];
                                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[lIIIIIIll[1]];
                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[lIIIIIIll[1]];
                                            nArray20[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[lIIIIIIll[1]];
                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[lIIIIIIll[1]];
                                        nArray21[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[lIIIIIIll[1]];
                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[lIIIIIIll[1]];
                                    nArray22[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[lIIIIIIll[1]];
                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[15];
                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[lIIIIIIll[1]];
                                nArray23[m.lIIIIIIll[0]] = lIIIIIIll[15];
                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[lIIIIIIll[1]];
                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[12];
                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[lIIIIIIll[1]];
                            nArray24[m.lIIIIIIll[0]] = lIIIIIIll[12];
                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[lIIIIIIll[1]];
                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[13];
                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[lIIIIIIll[1]];
                        nArray25[m.lIIIIIIll[0]] = lIIIIIIll[13];
                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[lIIIIIIll[1]];
                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[14];
                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[lIIIIIIll[1]];
                    nArray26[m.lIIIIIIll[0]] = lIIIIIIll[14];
                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[lIIIIIIll[1]];
                nArray[m.lIIIIIIll[0]] = lIIIIIIll[16];
                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[lIIIIIIll[1]];
                nArray27[m.lIIIIIIll[0]] = lIIIIIIll[16];
                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[26];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIIIIIll[1];
                "".length();
                if (-(0x64 ^ 0x61) < 0) return n2 != 0;
                return ((0x5B ^ 0x7C) & ~(0x52 ^ 0x75)) != 0;
            }
        }
        n2 = lIIIIIIll[0];
        return n2 != 0;
    }

    private static boolean llIlIllIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
            bl = lIIIIIIll[1];
            "".length();
            if ((0x4D ^ 0x49) <= 0) {
                return ((0x34 ^ 0x16) & ~(0x44 ^ 0x66)) != 0;
            }
        } else {
            bl = lIIIIIIll[0];
        }
        return bl;
    }

    @Override
    public boolean T() {
        return lIIIIIIll[0];
    }

    @Override
    public int U() {
        try {
            m.aq();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() != "   ".length()) {
            return (0x64 ^ 0x52 ^ (0xAA ^ 0xB0)) & (15 + 111 - 57 + 66 ^ 2 + 163 - 25 + 31 ^ -" ".length());
        }
        return lIIIIIIll[54];
    }

    @Override
    public String V() {
        return lIIIIIIlI[lIIIIIIll[60]];
    }

    private static boolean llIlIllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIllIlII() {
        lIIIIIIll = new int[63];
        m.lIIIIIIll[0] = (0x70 ^ 0x46 ^ " ".length()) & (17 + 24 - -78 + 24 ^ 106 + 178 - 175 + 75 ^ -" ".length());
        m.lIIIIIIll[1] = " ".length();
        m.lIIIIIIll[2] = "  ".length();
        m.lIIIIIIll[3] = "   ".length();
        m.lIIIIIIll[4] = -(0xFFFFABFE & 0x7C05) & (0xFFFFBBCB & 0x7FBF);
        m.lIIIIIIll[5] = 0x46 ^ 0x78 ^ (0xB3 ^ 0x88);
        m.lIIIIIIll[6] = 0x15 ^ 0x11;
        m.lIIIIIIll[7] = 0x48 ^ 0x7A;
        m.lIIIIIIll[8] = -(0xFFFF9CFD & 0x77FF) & (0xFFFFFFFF & 0x3DFF);
        m.lIIIIIIll[9] = 0xFFFFFDFD & 0xBBF;
        m.lIIIIIIll[10] = 0xFFFFE9C7 & 0x1FFB;
        m.lIIIIIIll[11] = -(0xFFFFFDD7 & 0x2AED) & (0xFFFFEBEF & 0x3FFE);
        m.lIIIIIIll[12] = 0xFFFFC76D & 0x3BDB;
        m.lIIIIIIll[13] = 0xFFFFF74F & 0xBFB;
        m.lIIIIIIll[14] = -(0xFFFFFDF7 & 0x2EAF) & (0xFFFFBFFF & 0x6FF7);
        m.lIIIIIIll[15] = 0xFFFFB77F & 0x4BF2;
        m.lIIIIIIll[16] = -(0xFFFFF49F & 0x1FF7) & (0xFFFFDFFF & 0x37BF);
        m.lIIIIIIll[17] = -(0xFFFFFD4D & 0x7BB3) & (0xFFFFFF7F & 0x7DC7);
        m.lIIIIIIll[18] = 0xFFFFE6F7 & 0x1D99;
        m.lIIIIIIll[19] = -(0xFFFFDB6D & 0x6E97) & (0xFFFFCF7D & 0x7EEF);
        m.lIIIIIIll[20] = 0xFFFFFB7E & 0x2FF7;
        m.lIIIIIIll[21] = -(0xFFFFB325 & 0x5DDF) & (0xFFFFB7AD & 0x5FFE);
        m.lIIIIIIll[22] = 0xFFFFF7F7 & 0x3959;
        m.lIIIIIIll[23] = -(0xFFFFF4CB & 0x2B37) & (0xFFFFBFFB & 0x7F4F);
        m.lIIIIIIll[24] = 0x67 ^ 0x6D;
        m.lIIIIIIll[25] = 0xFFFFDF6E & 0x3FDB;
        m.lIIIIIIll[26] = -(0xFFFFE5CF & 0x5E35) & (0xFFFFD57F & 0x6FFF);
        m.lIIIIIIll[27] = 0x2C ^ 0x32;
        m.lIIIIIIll[28] = -(0xFFFFDDFB & 0x3EC5) & (0xFFFFFFFF & 0x1FE7);
        m.lIIIIIIll[29] = -(0xFFFFEF2B & 0x59DC) & (0xFFFFFBF7 & 0x6FBF);
        m.lIIIIIIll[30] = 0x72 ^ 0x74;
        m.lIIIIIIll[31] = 0x98 ^ 0x8C;
        m.lIIIIIIll[32] = 90 + 124 - 198 + 153 ^ 64 + 2 - 5 + 113;
        m.lIIIIIIll[33] = 0x24 ^ 0x2A ^ (0x14 ^ 0x12);
        m.lIIIIIIll[34] = -(0xFFFFFFEE & 0x553) & (0xFFFFB7FB & 0x6FF7);
        m.lIIIIIIll[35] = 0x61 ^ 0xD ^ (0x3C ^ 0x59);
        m.lIIIIIIll[36] = 0x6B ^ 0x59 ^ (0xF ^ 0x15);
        m.lIIIIIIll[37] = 0xA8 ^ 0xA3;
        m.lIIIIIIll[38] = 123 + 153 - 239 + 168 ^ 123 + 76 - 59 + 53;
        m.lIIIIIIll[39] = 0x48 ^ 0x6A ^ (0x2B ^ 4);
        m.lIIIIIIll[40] = 0x47 ^ 0x49;
        m.lIIIIIIll[41] = (0x30 ^ 0x48) + (33 + 167 - 105 + 130) - (0xFFFFEB7F & 0x15BF) + (113 + 51 - 1 + 51);
        m.lIIIIIIll[42] = 0x6B ^ 0x64;
        m.lIIIIIIll[43] = 0x3C ^ 0x3B ^ (2 ^ 0x15);
        m.lIIIIIIll[44] = 0x42 ^ 0x1D ^ (0xE5 ^ 0xAB);
        m.lIIIIIIll[45] = 119 + 13 - 57 + 54 ^ 88 + 15 - -6 + 38;
        m.lIIIIIIll[46] = -(0xFFFFFFBF & 0x4061) & (0xFFFFFBFB & 0x7EBC);
        m.lIIIIIIll[47] = -(0xFFFFFABF & 0x2D46) & (0xFFFFEFFF & 0x3FD5);
        m.lIIIIIIll[48] = -(0xFFFFFC3F & 0x53C7) & (0xFFFFFAFE & Short.MAX_VALUE);
        m.lIIIIIIll[49] = 0xFFFFBBDB & 0x5E2E;
        m.lIIIIIIll[50] = -(0xFFFFF679 & 0x3987) & (0xFFFFBA77 & 0xFFFE);
        m.lIIIIIIll[51] = 0xFFFFBFFC & 0x5B5B;
        m.lIIIIIIll[52] = 0xFFFFEAF7 & 0x57E8;
        m.lIIIIIIll[53] = 0xB5 ^ 0xC6 ^ (0xF1 ^ 0xA1);
        m.lIIIIIIll[54] = 0x53 ^ 0x44 ^ (0x24 ^ 0x57);
        m.lIIIIIIll[55] = 0xFFFF93D3 & 0x6D6C;
        m.lIIIIIIll[56] = -(0xFFFFF1F3 & 0x4F1F) & (0xFFFFEFDF & 0x7FFE);
        m.lIIIIIIll[57] = 0xFFFFF9FB & 0x67AC;
        m.lIIIIIIll[58] = -(0xFFFFF0CD & 0x6F3B) & (0xFFFFFF7F & 0x7FCF);
        m.lIIIIIIll[59] = 0xFFFFA78E & 0x5BF5;
        m.lIIIIIIll[60] = 0xD3 ^ 0xC0;
        m.lIIIIIIll[61] = 62 + 102 - 57 + 65 ^ 2 + 162 - 12 + 33;
        m.lIIIIIIll[62] = 0x9C ^ 0x8A;
    }

    private static void ag() {
        block30: {
            d lIIlIllIIlIIIII;
            block29: {
                block28: {
                    block27: {
                        Object lIIlIllIIlIIIIl;
                        block25: {
                            block26: {
                                if (!m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) break block25;
                                int[] nArray = new int[lIIIIIIll[1]];
                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[12];
                                if (m.llIlIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(lIIIIIIll[12], lIIIIIIll[1], lIIIIIIll[46]);
                                    bB.add(d2);
                                    "".length();
                                }
                                int[] nArray2 = new int[lIIIIIIll[1]];
                                nArray2[m.lIIIIIIll[0]] = lIIIIIIll[13];
                                if (m.llIlIllIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    lIIlIllIIlIIIIl = new d(lIIIIIIll[13], lIIIIIIll[1], lIIIIIIll[46]);
                                    bB.add((d)lIIlIllIIlIIIIl);
                                    "".length();
                                }
                                int[] nArray3 = new int[lIIIIIIll[1]];
                                nArray3[m.lIIIIIIll[0]] = lIIIIIIll[14];
                                if (m.llIlIllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    lIIlIllIIlIIIIl = new d(lIIIIIIll[14], lIIIIIIll[1], lIIIIIIll[46]);
                                    bB.add((d)lIIlIllIIlIIIIl);
                                    "".length();
                                }
                                int[] nArray4 = new int[lIIIIIIll[1]];
                                nArray4[m.lIIIIIIll[0]] = lIIIIIIll[15];
                                if (!m.llIlIllIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[lIIIIIIll[1]];
                                nArray5[m.lIIIIIIll[0]] = lIIIIIIll[15];
                                if (!m.llIlIllIllI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIll[47])) break block25;
                            }
                            lIIlIllIIlIIIIl = new d(lIIIIIIll[15], lIIIIIIll[48], lIIIIIIll[35]);
                            bB.add((d)lIIlIllIIlIIIIl);
                            "".length();
                        }
                        int[] nArray = new int[lIIIIIIll[1]];
                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new d(lIIIIIIll[18], lIIIIIIll[1], lIIIIIIll[49]);
                            bB.add((d)lIIlIllIIlIIIIl);
                            "".length();
                        }
                        int[] nArray6 = new int[lIIIIIIll[1]];
                        nArray6[m.lIIIIIIll[0]] = lIIIIIIll[19];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new d(lIIIIIIll[19], lIIIIIIll[1], lIIIIIIll[49]);
                            bB.add((d)lIIlIllIIlIIIIl);
                            "".length();
                        }
                        int[] nArray7 = new int[lIIIIIIll[1]];
                        nArray7[m.lIIIIIIll[0]] = lIIIIIIll[17];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new d(lIIIIIIll[17], lIIIIIIll[1], lIIIIIIll[49]);
                            bB.add((d)lIIlIllIIlIIIIl);
                            "".length();
                        }
                        int[] nArray8 = new int[lIIIIIIll[1]];
                        nArray8[m.lIIIIIIll[0]] = lIIIIIIll[20];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new d(lIIIIIIll[20], lIIIIIIll[1], lIIIIIIll[50]);
                            bB.add((d)lIIlIllIIlIIIIl);
                            "".length();
                        }
                        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                            int[] nArray9 = new int[lIIIIIIll[1]];
                            nArray9[m.lIIIIIIll[0]] = lIIIIIIll[16];
                            if (m.llIlIllIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                lIIlIllIIlIIIIl = new d(lIIIIIIll[16], lIIIIIIll[51], lIIIIIIll[42]);
                                bB.add((d)lIIlIllIIlIIIIl);
                                "".length();
                            }
                        }
                        int[] nArray10 = new int[lIIIIIIll[1]];
                        nArray10[m.lIIIIIIll[0]] = lIIIIIIll[9];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new d(lIIIIIIll[9], lIIIIIIll[1], lIIIIIIll[52]);
                            bB.add((d)lIIlIllIIlIIIIl);
                            "".length();
                        }
                        int[] nArray11 = new int[lIIIIIIll[1]];
                        nArray11[m.lIIIIIIll[0]] = lIIIIIIll[10];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new d(lIIIIIIll[10], lIIIIIIll[1], lIIIIIIll[52]);
                            bB.add((d)lIIlIllIIlIIIIl);
                            "".length();
                        }
                        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                            int[] nArray12 = new int[lIIIIIIll[1]];
                            nArray12[m.lIIIIIIll[0]] = lIIIIIIll[11];
                            if (m.llIlIllIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                lIIlIllIIlIIIIl = new d(lIIIIIIll[11], lIIIIIIll[48], lIIIIIIll[53]);
                                bB.add((d)lIIlIllIIlIIIIl);
                                "".length();
                            }
                        }
                        int[] nArray13 = new int[lIIIIIIll[1]];
                        nArray13[m.lIIIIIIll[0]] = lIIIIIIll[22];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new d(lIIIIIIll[22], lIIIIIIll[1], i.bw);
                            bB.add((d)lIIlIllIIlIIIIl);
                            "".length();
                        }
                        int[] nArray14 = new int[lIIIIIIll[1]];
                        nArray14[m.lIIIIIIll[0]] = lIIIIIIll[26];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new d(lIIIIIIll[26], lIIIIIIll[54], lIIIIIIll[55]);
                            bB.add((d)lIIlIllIIlIIIIl);
                            "".length();
                        }
                        if (m.llIlIllIlll(Bank.contains((Predicate)(lIIlIllIIlIIIIl = item -> item.getName().toLowerCase().contains(lIIIIIIlI[lIIIIIIll[31]]))) ? 1 : 0)) {
                            lIIlIllIIlIIIII = new d(lIIIIIIll[56], lIIIIIIll[5], lIIIIIIll[57]);
                            bB.add(lIIlIllIIlIIIII);
                            "".length();
                        }
                        int[] nArray15 = new int[lIIIIIIll[1]];
                        nArray15[m.lIIIIIIll[0]] = lIIIIIIll[58];
                        if (!m.llIlIllIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[lIIIIIIll[1]];
                        nArray16[m.lIIIIIIll[0]] = lIIIIIIll[58];
                        if (!m.llIlIllIlIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[lIIIIIIll[1]];
                        nArray17[m.lIIIIIIll[0]] = lIIIIIIll[58];
                        if (!m.llIlIllIllI(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIIIll[24])) break block28;
                    }
                    lIIlIllIIlIIIII = new d(lIIIIIIll[58], lIIIIIIll[24], lIIIIIIll[59]);
                    bB.add(lIIlIllIIlIIIII);
                    "".length();
                }
                int[] nArray = new int[lIIIIIIll[1]];
                nArray[m.lIIIIIIll[0]] = lIIIIIIll[23];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[lIIIIIIll[1]];
                nArray18[m.lIIIIIIll[0]] = lIIIIIIll[23];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[lIIIIIIll[1]];
                nArray19[m.lIIIIIIll[0]] = lIIIIIIll[23];
                if (!m.llIlIllIllI(Bank.getFirst((int[])nArray19).getQuantity(), lIIIIIIll[24])) break block30;
            }
            lIIlIllIIlIIIII = new d(lIIIIIIll[23], lIIIIIIll[24], lIIIIIIll[59]);
            bB.add(lIIlIllIIlIIIII);
            "".length();
        }
    }

    private static boolean llIlIllllII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        m.llIlIllIlII();
        m.llIlIllIIll();
        bB = new ArrayList<d>();
    }
}

