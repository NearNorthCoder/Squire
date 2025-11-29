/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
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
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.P;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.am;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
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
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
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
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class J
implements ab {
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint fM;
    static /* synthetic */ int dk;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ int[] llllllIll;
    private static /* synthetic */ String[] llllllIlI;
    private static /* synthetic */ String[] cG;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint fL;

    private static boolean llIllIIIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static void Q() {
        block16: {
            d lIlIIllllIIII;
            block15: {
                Object lIlIIllllIIIl;
                block14: {
                    block13: {
                        int[] nArray = new int[llllllIll[3]];
                        nArray[J.llllllIll[4]] = llllllIll[19];
                        if (J.llIllIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llllllIll[19], llllllIll[2], j.ch);
                            bx.add(d2);
                            "".length();
                        }
                        int[] nArray2 = new int[llllllIll[3]];
                        nArray2[J.llllllIll[4]] = llllllIll[11];
                        if (J.llIllIIIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIlIIllllIIIl = new d(llllllIll[11], llllllIll[3], llllllIll[51]);
                            bx.add((d)lIlIIllllIIIl);
                            "".length();
                        }
                        int[] nArray3 = new int[llllllIll[3]];
                        nArray3[J.llllllIll[4]] = llllllIll[14];
                        if (J.llIllIIIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIlIIllllIIIl = new d(llllllIll[14], llllllIll[3], llllllIll[51]);
                            bx.add((d)lIlIIllllIIIl);
                            "".length();
                        }
                        int[] nArray4 = new int[llllllIll[3]];
                        nArray4[J.llllllIll[4]] = llllllIll[18];
                        if (J.llIllIIIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIlIIllllIIIl = new d(llllllIll[18], llllllIll[3], llllllIll[51]);
                            bx.add((d)lIlIIllllIIIl);
                            "".length();
                        }
                        int[] nArray5 = new int[llllllIll[3]];
                        nArray5[J.llllllIll[4]] = llllllIll[16];
                        if (J.llIllIIIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIlIIllllIIIl = new d(llllllIll[16], llllllIll[3], llllllIll[51]);
                            bx.add((d)lIlIIllllIIIl);
                            "".length();
                        }
                        int[] nArray6 = new int[llllllIll[3]];
                        nArray6[J.llllllIll[4]] = llllllIll[13];
                        if (J.llIllIIIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIlIIllllIIIl = new d(llllllIll[13], llllllIll[3], llllllIll[52]);
                            bx.add((d)lIlIIllllIIIl);
                            "".length();
                        }
                        int[] nArray7 = new int[llllllIll[3]];
                        nArray7[J.llllllIll[4]] = llllllIll[10];
                        if (!J.llIllIIIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[llllllIll[3]];
                        nArray8[J.llllllIll[4]] = llllllIll[10];
                        if (!J.llIllIIIIIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[llllllIll[3]];
                        nArray9[J.llllllIll[4]] = llllllIll[10];
                        if (!J.llIlIlllllIl(Bank.getFirst((int[])nArray9).getQuantity(), llllllIll[2])) break block14;
                    }
                    lIlIIllllIIIl = new d(llllllIll[10], llllllIll[2], llllllIll[53]);
                    bx.add((d)lIlIIllllIIIl);
                    "".length();
                }
                if (J.llIllIIIIIIl(Bank.contains((Predicate)(lIlIIllllIIIl = item -> item.getName().toLowerCase().contains(llllllIlI[llllllIll[59]]))) ? 1 : 0)) {
                    lIlIIllllIIII = new d(llllllIll[54], llllllIll[15], llllllIll[55]);
                    bx.add(lIlIIllllIIII);
                    "".length();
                }
                int[] nArray = new int[llllllIll[3]];
                nArray[J.llllllIll[4]] = llllllIll[9];
                if (!J.llIllIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[llllllIll[3]];
                nArray10[J.llllllIll[4]] = llllllIll[9];
                if (!J.llIllIIIIIII(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[llllllIll[3]];
                nArray11[J.llllllIll[4]] = llllllIll[9];
                if (!J.llIlIlllllIl(Bank.getFirst((int[])nArray11).getQuantity(), llllllIll[2])) break block16;
            }
            lIlIIllllIIII = new d(llllllIll[9], llllllIll[56], llllllIll[52]);
            bx.add(lIlIIllllIIII);
            "".length();
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (J.llIllIIIIlll(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = llllllIll[3];
            "".length();
            if ((0x21 ^ 0x25) == 0) {
                return ((0x55 ^ 0x1D) & ~(0x19 ^ 0x51)) != 0;
            }
        } else {
            bl = llllllIll[4];
        }
        return bl;
    }

    @Override
    public int af() {
        try {
            System.out.println("678: " + e.j(llllllIll[5]));
            J.cd();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-"  ".length() >= 0) {
            return "   ".length() & ~"   ".length();
        }
        return llllllIll[57];
    }

    private static String llIlIllllIIl(String lIlIIlllIIIll, String lIlIIllIlllIl) {
        lIlIIlllIIIll = new String(Base64.getDecoder().decode(lIlIIlllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIlllIIIIl = new StringBuilder();
        char[] lIlIIlllIIIII = lIlIIllIlllIl.toCharArray();
        int lIlIIllIlllll = llllllIll[4];
        char[] lIlIIllIllIIl = lIlIIlllIIIll.toCharArray();
        int lIlIIllIllIII = lIlIIllIllIIl.length;
        int lIlIIllIlIlll = llllllIll[4];
        while (J.llIlIlllllIl(lIlIIllIlIlll, lIlIIllIllIII)) {
            char lIlIIlllIIlII = lIlIIllIllIIl[lIlIIllIlIlll];
            lIlIIlllIIIIl.append((char)(lIlIIlllIIlII ^ lIlIIlllIIIII[lIlIIllIlllll % lIlIIlllIIIII.length]));
            "".length();
            ++lIlIIllIlllll;
            ++lIlIIllIlIlll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIlIIlllIIIIl);
    }

    private static void llIlIllllIll() {
        llllllIlI = new String[llllllIll[21]];
        J.llllllIlI[J.llllllIll[4]] = J.llIlIllllIII("u67fJZILkD/jV+LPe5gN+tD+CEWvxlO3gBmmxc8iwaRZvbLV/gQQVh1r3t5PHELV", "nbwpo");
        J.llllllIlI[J.llllllIll[3]] = J.llIlIllllIIl("GQ4SSSI4TwYIODw=", "WodiV");
        J.llllllIlI[J.llllllIll[1]] = J.llIlIllllIlI("te1Kfv/92N2ILTnojbwSte1lvpbYr68b", "vJIvA");
        J.llllllIlI[J.llllllIll[12]] = J.llIlIllllIIl("OD1PED8KeAIYPhwxARZtHi0KAjlPKxoBPQMxCgJhTysYGDkMMAYfKk8sAFEPOgEmPwo=", "oXoqM");
        J.llllllIlI[J.llllllIll[7]] = J.llIlIllllIIl("LT8fFwQ=", "iMvyo");
        J.llllllIlI[J.llllllIll[15]] = J.llIlIllllIII("VlWB+hB+XEKDRE4/NIYueA==", "WQDWw");
        J.llllllIlI[J.llllllIll[17]] = J.llIlIllllIIl("JSceJzoEKBdjMgQnHCwx", "mFpCV");
        J.llllllIlI[J.llllllIll[8]] = J.llIlIllllIlI("DDdd7vLSTm4=", "mgLID");
        J.llllllIlI[J.llllllIll[23]] = J.llIlIllllIIl("DA0rHzBoBjUKOjw=", "HdYkI");
        J.llllllIlI[J.llllllIll[24]] = J.llIlIllllIIl("IgwVRhYDTREJFhgIDUYWAwACEg0=", "lmcfb");
        J.llllllIlI[J.llllllIll[2]] = J.llIlIllllIII("HrNuYP4XT3Y=", "YTpIw");
        J.llllllIlI[J.llllllIll[30]] = J.llIlIllllIIl("KgIDQRUIET0A", "ztSaT");
        J.llllllIlI[J.llllllIll[31]] = J.llIlIllllIIl("KBQSLh8BFkYuGQIQEjU=", "oqfZv");
        J.llllllIlI[J.llllllIll[33]] = J.llIlIllllIlI("me3v/dAFoOs=", "mbELZ");
        J.llllllIlI[J.llllllIll[34]] = J.llIlIllllIII("UgK6kVq89c4=", "HCNCf");
        J.llllllIlI[J.llllllIll[36]] = J.llIlIllllIII("sywNnws2SrE=", "TIpUB");
        J.llllllIlI[J.llllllIll[35]] = J.llIlIllllIII("jrMaXJASKRw=", "gtupd");
        J.llllllIlI[J.llllllIll[37]] = J.llIlIllllIlI("fYmCy+CbtUEzmqEiakAeuA==", "VyMZG");
        J.llllllIlI[J.llllllIll[38]] = J.llIlIllllIII("LSAE3VfDjGg=", "jjjNH");
        J.llllllIlI[J.llllllIll[39]] = J.llIlIllllIIl("EBYDLCd2BhokICI=", "VdvES");
        J.llllllIlI[J.llllllIll[40]] = J.llIlIllllIII("aRtBsNRPiCmNEQfRdShGjg==", "JhZFg");
        J.llllllIlI[J.llllllIll[41]] = J.llIlIllllIIl("Lik4Kw==", "yLYYQ");
        J.llllllIlI[J.llllllIll[42]] = J.llIlIllllIIl("MSwFJzoQIwxjMhAsBywx", "yMkCV");
        J.llllllIlI[J.llllllIll[43]] = J.llIlIllllIIl("KB4HMQ==", "kqhZz");
        J.llllllIlI[J.llllllIll[44]] = J.llIlIllllIlI("/SMzG1eM5rk=", "ETPSY");
        J.llllllIlI[J.llllllIll[45]] = J.llIlIllllIIl("OxMSFA==", "tcwzR");
        J.llllllIlI[J.llllllIll[46]] = J.llIlIllllIIl("Oz8FCg==", "zMlyp");
        J.llllllIlI[J.llllllIll[47]] = J.llIlIllllIlI("e8k28dAHavp/9zKG0MWZFg==", "ZEsVO");
        J.llllllIlI[J.llllllIll[48]] = J.llIlIllllIII("ViR7vcuyS8c=", "TNzNq");
        J.llllllIlI[J.llllllIll[0]] = J.llIlIllllIII("8D5jurrWXpw=", "CraHg");
        J.llllllIlI[J.llllllIll[49]] = J.llIlIllllIIl("AxExShkgSDoPATI=", "FhTjv");
        J.llllllIlI[J.llllllIll[50]] = J.llIlIllllIlI("MeqE7yIIy5fce3IvVfUjpQ==", "sfBPw");
        J.llllllIlI[J.llllllIll[58]] = J.llIlIllllIIl("MwMoeBsVJB4sSBAwCSsc", "aElXh");
        J.llllllIlI[J.llllllIll[59]] = J.llIlIllllIIl("Gi8lMHUHIGsgMAkqPz91QA==", "hFKWU");
        J.llllllIlI[J.llllllIll[60]] = J.llIlIllllIlI("RNMVoTUNAlA=", "UhaVZ");
        J.llllllIlI[J.llllllIll[61]] = J.llIlIllllIlI("7G5XNBO/G48=", "caCEn");
        J.llllllIlI[J.llllllIll[62]] = J.llIlIllllIlI("A8uUqrZO36k=", "RnlGU");
        J.llllllIlI[J.llllllIll[63]] = J.llIlIllllIIl("ExAcFisZAg==", "weyzB");
        J.llllllIlI[J.llllllIll[64]] = J.llIlIllllIIl("PSEGKSc3Mw==", "YTcEN");
        J.llllllIlI[J.llllllIll[65]] = J.llIlIllllIII("WLaEtJOoqK0=", "SuVYo");
        J.llllllIlI[J.llllllIll[56]] = J.llIlIllllIlI("Sj1xUOjDQfY=", "RCAqI");
        J.llllllIlI[J.llllllIll[66]] = J.llIlIllllIlI("RJq3acQj4hQ=", "TGlEI");
        J.llllllIlI[J.llllllIll[71]] = J.llIlIllllIIl("CBk6TQ8kDXQAFyAddAATaxl0DhcgHWs=", "KxTmv");
        J.llllllIlI[J.llllllIll[72]] = J.llIlIllllIlI("OpYXImcWPrHQtvziEx+kWyIbd9iSmWEU9Zs2TRueiIVjO2/rZKzJ3Q7szuPFO6gf", "mlAIa");
        J.llllllIlI[J.llllllIll[73]] = J.llIlIllllIlI("85jAorWAbYoBO2/8DmrMtcPGA03H0ay49mImaENNJ8+jy9X/uC6SoQnnqofL7gbh", "RqfiL");
        J.llllllIlI[J.llllllIll[74]] = J.llIlIllllIlI("lOb1RRuIRd0=", "NAprP");
        J.llllllIlI[J.llllllIll[75]] = J.llIlIllllIIl("ETwzFWw1dCUTJCgzbQ==", "FTRaK");
        J.llllllIlI[J.llllllIll[76]] = J.llIlIllllIlI("a65v43GwlwIg03gZPXPG9k5g38txbO4lP5MHdRSxLB2Pi4uF+L2jEg==", "MyoMj");
        J.llllllIlI[J.llllllIll[77]] = J.llIlIllllIII("JX3SyEIhAxEAeR8r3nYP3qlcjIiaYxe6eLVYyiOktpE=", "opYiX");
        J.llllllIlI[J.llllllIll[78]] = J.llIlIllllIlI("FnMtSySjl0oMOV7ufepPxxqxCnpUnuaIUzlMscoYHU8=", "UNcdt");
    }

    private static boolean llIllIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlIlllllII() {
        llllllIll = new int[79];
        J.llllllIll[0] = 0xA3 ^ 0xBE;
        J.llllllIll[1] = "  ".length();
        J.llllllIll[2] = 0x6C ^ 0x66;
        J.llllllIll[3] = " ".length();
        J.llllllIll[4] = (209 + 154 - 153 + 9 ^ 34 + 53 - 9 + 50) & (117 + 77 - 119 + 121 ^ 69 + 22 - 50 + 118 ^ -" ".length());
        J.llllllIll[5] = 0xFFFFF2A7 & 0xFFE;
        J.llllllIll[6] = -(0xFFFFEF7A & 0x5CDD) & (0xFFFFDFFF & 0x7FDF);
        J.llllllIll[7] = 36 + 101 - 125 + 115 ^ (0xD8 ^ 0xA3);
        J.llllllIll[8] = 0x65 ^ 0x62;
        J.llllllIll[9] = 0xFFFFFFCF & 0x1F77;
        J.llllllIll[10] = -(0xFFFFF79F & 0x28F7) & (0xFFFFFFDE & 0x3FFF);
        J.llllllIll[11] = -(0xFFFF9747 & 0x7CBE) & (0xFFFFFFFD & 0x1DFF);
        J.llllllIll[12] = "   ".length();
        J.llllllIll[13] = 36 + 130 - 117 + 172;
        J.llllllIll[14] = 0xFFFFFF77 & 0x7FD;
        J.llllllIll[15] = 0x7F ^ 0x7A;
        J.llllllIll[16] = 0xFFFFBB74 & 0x4CAF;
        J.llllllIll[17] = 0x5F ^ 0x59;
        J.llllllIll[18] = 0xFFFFDF72 & 0x22DD;
        J.llllllIll[19] = 0xFFFFF7FD & 0x3953;
        J.llllllIll[20] = 0xFFFF93F7 & 0x6FEB;
        J.llllllIll[21] = 0x44 ^ 0x76;
        J.llllllIll[22] = 0xFFFFAFF6 & 0x59DF;
        J.llllllIll[23] = 0xA8 ^ 0xA0;
        J.llllllIll[24] = 0x4B ^ 0x42;
        J.llllllIll[25] = -(0xFFFFD77F & 0x3AA3) & (0xFFFF9FFF & 0x7EFF);
        J.llllllIll[26] = 0xFFFFDD77 & 0x2EFE;
        J.llllllIll[27] = 0x39 ^ 0x4F;
        J.llllllIll[28] = 75 + 64 - 6 + 4;
        J.llllllIll[29] = -" ".length();
        J.llllllIll[30] = 0x58 ^ 0x53;
        J.llllllIll[31] = 0xB9 ^ 0xB5;
        J.llllllIll[32] = -(0xFFFFECA2 & 0x5F5F) & (0xFFFFCF7F & 0x7DAD);
        J.llllllIll[33] = 0x92 ^ 0x9F;
        J.llllllIll[34] = 0x5D ^ 0x66 ^ (0x3A ^ 0xF);
        J.llllllIll[35] = 0x71 ^ 0x61;
        J.llllllIll[36] = 0x26 ^ 0 ^ (0x9D ^ 0xB4);
        J.llllllIll[37] = 0x57 ^ 0x2C ^ (0x22 ^ 0x48);
        J.llllllIll[38] = 115 + 62 - 76 + 53 ^ 1 + 46 - -6 + 83;
        J.llllllIll[39] = 23 + 19 - -9 + 96 ^ 22 + 108 - 10 + 8;
        J.llllllIll[40] = 0x10 ^ 4;
        J.llllllIll[41] = 157 + 19 - 30 + 26 ^ 19 + 151 - 93 + 108;
        J.llllllIll[42] = 135 + 67 - 58 + 28 ^ 149 + 2 - 114 + 149;
        J.llllllIll[43] = 0x71 ^ 0x66;
        J.llllllIll[44] = 0x6A ^ 0x7F ^ (0xC8 ^ 0xC5);
        J.llllllIll[45] = 0x75 ^ 0x6C;
        J.llllllIll[46] = 92 + 111 - 44 + 9 ^ 122 + 120 - 200 + 136;
        J.llllllIll[47] = 0x96 ^ 0x8D;
        J.llllllIll[48] = 0x34 ^ 0x28;
        J.llllllIll[49] = 0x82 ^ 0x9C;
        J.llllllIll[50] = 0xAD ^ 0xB2;
        J.llllllIll[51] = -(0xFFFFEF1E & 0x58F3) & (0xFFFFFFF9 & 0x6B3F);
        J.llllllIll[52] = 0xFFFF9BCE & 0x67B5;
        J.llllllIll[53] = -(0xFFFFB585 & 0x5A7B) & (0xFFFF97FE & 0x7F6D);
        J.llllllIll[54] = 0xFFFFFFCD & 0x2EFE;
        J.llllllIll[55] = 0xFFFFE3FE & 0x7DA9;
        J.llllllIll[56] = 0xBB ^ 0x93;
        J.llllllIll[57] = 0x1C ^ 0x46 ^ (0x93 ^ 0xAD);
        J.llllllIll[58] = 0x23 ^ 3;
        J.llllllIll[59] = 153 + 51 - 44 + 21 ^ 70 + 79 - 105 + 104;
        J.llllllIll[60] = 0x4F ^ 0x6D;
        J.llllllIll[61] = 105 + 94 - 132 + 60 ^ (0xD5 ^ 0x89);
        J.llllllIll[62] = 0xD2 ^ 0xB0 ^ (0x11 ^ 0x57);
        J.llllllIll[63] = 6 + 125 - -22 + 38 ^ 134 + 33 - 99 + 86;
        J.llllllIll[64] = 0x54 ^ 0x72;
        J.llllllIll[65] = 0xB4 ^ 0x9B ^ (0x87 ^ 0x8F);
        J.llllllIll[66] = 0x6C ^ 0x45;
        J.llllllIll[67] = 0xFFFFAF97 & 0x5CEF;
        J.llllllIll[68] = 0xFFFF9ECE & 0x6DBF;
        J.llllllIll[69] = 0xFFFFFF3F & 0xDF6;
        J.llllllIll[70] = -(0xFFFFB7EF & 0x5939) & (0xFFFF9DEB & Short.MAX_VALUE);
        J.llllllIll[71] = 0x1B ^ 0x31;
        J.llllllIll[72] = 0x19 ^ 0x32;
        J.llllllIll[73] = 0x4C ^ 0x40 ^ (0x33 ^ 0x13);
        J.llllllIll[74] = 0x2B ^ 6;
        J.llllllIll[75] = 0xAB ^ 0x85;
        J.llllllIll[76] = 7 ^ 0x28;
        J.llllllIll[77] = 0xF4 ^ 0xC4;
        J.llllllIll[78] = 0x25 ^ 0x21 ^ (0x3B ^ 0xE);
    }

    private static boolean llIllIIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIllllIII(String lIlIIllIIllII, String lIlIIllIIllIl) {
        try {
            SecretKeySpec lIlIIllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIllIlIIII = Cipher.getInstance("Blowfish");
            lIlIIllIlIIII.init(llllllIll[1], lIlIIllIlIIIl);
            return new String(lIlIIllIlIIII.doFinal(Base64.getDecoder().decode(lIlIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIllIIllll) {
            lIlIIllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ae() {
        return llllllIll[4];
    }

    private static String llIlIllllIlI(String lIlIIlIllllll, String lIlIIllIIIIII) {
        try {
            SecretKeySpec lIlIIllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllIIIIII.getBytes(StandardCharsets.UTF_8)), llllllIll[23]), "DES");
            Cipher lIlIIllIIIIll = Cipher.getInstance("DES");
            lIlIIllIIIIll.init(llllllIll[1], lIlIIllIIIlII);
            return new String(lIlIIllIIIIll.doFinal(Base64.getDecoder().decode(lIlIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIllIIIIlI) {
            lIlIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    public static void cd() {
        if (J.llIlIlllllIl(e.j(llllllIll[0]), llllllIll[1])) {
            P.cM();
        }
        if (J.llIlIlllllIl(Skills.getLevel((Skill)Skill.COOKING), llllllIll[2]) && J.llIlIllllllI(e.j(llllllIll[0]), llllllIll[1])) {
            am.ed();
        }
        if (J.llIlIlllllll(Skills.getLevel((Skill)Skill.COOKING), llllllIll[2]) && J.llIlIllllllI(e.j(llllllIll[0]), llllllIll[1])) {
            if (J.llIllIIIIIII(bv ? 1 : 0)) {
                b.a(bx);
                if (J.llIlIlllllIl(bx.size(), llllllIll[3])) {
                    System.out.println(llllllIlI[llllllIll[4]]);
                    bv = llllllIll[4];
                }
            }
            if (J.llIllIIIIIIl(bv ? 1 : 0)) {
                BankLocation lIlIIllllIlII;
                if (J.llIllIIIIIIl(J.an() ? 1 : 0) && J.llIllIIIIIIl(e.j(llllllIll[5]))) {
                    lIlIIllllIlII = BankLocation.getNearest();
                    if (J.llIllIIIIIlI(lIlIIllllIlII) && J.llIllIIIIIIl(lIlIIllllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llllllIlI[llllllIll[3]];
                        a.a(lIlIIllllIlII);
                    }
                    if (J.llIllIIIIIlI(lIlIIllllIlII) && J.llIllIIIIIII(lIlIIllllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (J.llIllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llllllIll[6]);
                            "".length();
                        }
                        if (J.llIllIIIIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = llllllIlI[llllllIll[1]];
                            if (J.llIllIIIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllllIll[7]);
                                "".length();
                            }
                            if (J.llIllIIIIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llllllIll[1]);
                                "".length();
                            }
                            int[] nArray = new int[llllllIll[8]];
                            nArray[J.llllllIll[4]] = llllllIll[9];
                            nArray[J.llllllIll[3]] = llllllIll[10];
                            nArray[J.llllllIll[1]] = llllllIll[11];
                            nArray[J.llllllIll[12]] = llllllIll[13];
                            nArray[J.llllllIll[7]] = llllllIll[14];
                            nArray[J.llllllIll[15]] = llllllIll[16];
                            nArray[J.llllllIll[17]] = llllllIll[18];
                            if (J.llIllIIIIIIl(e.d(nArray) ? 1 : 0)) {
                                J.Q();
                                System.out.println(llllllIlI[llllllIll[12]]);
                                bv = llllllIll[3];
                                return;
                            }
                            int[] nArray2 = new int[llllllIll[8]];
                            nArray2[J.llllllIll[4]] = llllllIll[9];
                            nArray2[J.llllllIll[3]] = llllllIll[10];
                            nArray2[J.llllllIll[1]] = llllllIll[11];
                            nArray2[J.llllllIll[12]] = llllllIll[13];
                            nArray2[J.llllllIll[7]] = llllllIll[14];
                            nArray2[J.llllllIll[15]] = llllllIll[16];
                            nArray2[J.llllllIll[17]] = llllllIll[18];
                            if (J.llIllIIIIIII(e.d(nArray2) ? 1 : 0)) {
                                a.a(llllllIll[9], llllllIll[2]);
                                a.a(llllllIll[10], llllllIll[2]);
                                a.a(llllllIll[11], llllllIll[3]);
                                a.a(llllllIll[13], llllllIll[3]);
                                a.a(llllllIll[14], llllllIll[3]);
                                a.a(llllllIll[16], llllllIll[3]);
                                a.a(llllllIll[18], llllllIll[3]);
                                a.a(llllllIll[19], llllllIll[1]);
                                a.a(llllllIll[20], llllllIll[6]);
                            }
                        }
                    }
                }
                if (J.llIllIIIIIII(Inventory.contains((int[])f.bc) ? 1 : 0) && J.llIlIlllllIl(Movement.getRunEnergy(), llllllIll[21])) {
                    Inventory.getFirst((int[])f.bc).interact(llllllIlI[llllllIll[7]]);
                    Time.sleepTicks((int)llllllIll[3]);
                    "".length();
                }
                if (J.llIllIIIIIIl(e.j(llllllIll[5])) && J.llIllIIIIIII(J.an() ? 1 : 0)) {
                    AccBuilderGWD.c = llllllIlI[llllllIll[15]];
                    if (J.llIllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                        if (J.llIllIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)fL);
                        "".length();
                        Time.sleepTicks((int)llllllIll[3]);
                        "".length();
                    }
                    if (J.llIllIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                        AccBuilderGWD.c = llllllIlI[llllllIll[17]];
                        g.a(llllllIlI[llllllIll[8]], cG);
                    }
                }
                if (J.llIlIllllllI(e.j(llllllIll[5]), llllllIll[3])) {
                    int[] nArray = new int[llllllIll[3]];
                    nArray[J.llllllIll[4]] = llllllIll[22];
                    if (J.llIllIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[llllllIll[3]];
                        stringArray[J.llllllIll[4]] = llllllIlI[llllllIll[23]];
                        if (J.llIllIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            dk = llllllIll[4];
                            if (J.llIllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(fM), llllllIll[7])) {
                                AccBuilderGWD.c = llllllIlI[llllllIll[24]];
                                lIlIIllllIlII = new WorldArea(llllllIll[25], llllllIll[26], llllllIll[27], llllllIll[28], llllllIll[4]);
                                if (J.llIllIIIIIIl(lIlIIllllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (J.llIllIIIIIII(Inventory.contains(item -> item.getName().contains(llllllIlI[llllllIll[66]])) ? 1 : 0) && J.llIllIIIIIIl(Equipment.contains(item -> item.getName().contains(llllllIlI[llllllIll[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(llllllIlI[llllllIll[65]])).interact(llllllIlI[llllllIll[2]]);
                                    }
                                    if (J.llIllIIIIIII(Equipment.contains(item -> item.getName().contains(llllllIlI[llllllIll[64]])) ? 1 : 0) && J.llIlIllllllI(Players.getLocal().getAnimation(), llllllIll[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(llllllIlI[llllllIll[63]])).interact(llllllIlI[llllllIll[30]]);
                                        Time.sleepTicks((int)llllllIll[7]);
                                        "".length();
                                    }
                                }
                                if (J.llIllIIIIIII(lIlIIllllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)fM);
                                    "".length();
                                    Time.sleepTicks((int)llllllIll[3]);
                                    "".length();
                                }
                            }
                            if (J.llIllIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fM), llllllIll[7])) {
                                AccBuilderGWD.c = llllllIlI[llllllIll[31]];
                                if (J.llIllIIIIIII(Widgets.get((int)llllllIll[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[llllllIll[3]];
                                    stringArray2[J.llllllIll[4]] = llllllIlI[llllllIll[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(llllllIlI[llllllIll[34]]);
                                    Time.sleepTicks((int)llllllIll[12]);
                                    "".length();
                                }
                                if (J.llIllIIIIIIl(Widgets.get((int)llllllIll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)llllllIll[32], (int)llllllIll[35], (int)llllllIll[3]).interact(llllllIlI[llllllIll[36]]);
                                    Time.sleepTicks((int)llllllIll[1]);
                                    "".length();
                                }
                                int[] nArray3 = new int[llllllIll[3]];
                                nArray3[J.llllllIll[4]] = llllllIll[22];
                                if (J.llIllIIIIIII(Inventory.contains((int[])nArray3) ? 1 : 0) && J.llIllIIIIIIl(Widgets.get((int)llllllIll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)llllllIll[32], (int)llllllIll[3], (int)llllllIll[30]).interact(llllllIlI[llllllIll[35]]);
                                    Time.sleepTicks((int)llllllIll[3]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[llllllIll[3]];
                    nArray4[J.llllllIll[4]] = llllllIll[22];
                    if (J.llIllIIIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[llllllIll[3]];
                        stringArray[J.llllllIll[4]] = llllllIlI[llllllIll[37]];
                        if (J.llIllIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[llllllIll[3]];
                            nArray5[J.llllllIll[4]] = llllllIll[22];
                            if (J.llIllIIIIIII(Inventory.contains((int[])nArray5) ? 1 : 0) && J.llIllIIIIIIl(Widgets.get((int)llllllIll[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)llllllIll[32], (int)llllllIll[3], (int)llllllIll[30]).interact(llllllIlI[llllllIll[38]]);
                                Time.sleepTicks((int)llllllIll[3]);
                                "".length();
                            }
                            int[] nArray6 = new int[llllllIll[3]];
                            nArray6[J.llllllIll[4]] = llllllIll[18];
                            String[] stringArray3 = new String[llllllIll[3]];
                            stringArray3[J.llllllIll[4]] = llllllIlI[llllllIll[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)llllllIll[1]);
                            "".length();
                        }
                    }
                    String[] stringArray = new String[llllllIll[3]];
                    stringArray[J.llllllIll[4]] = llllllIlI[llllllIll[40]];
                    if (J.llIllIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (J.llIllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                            if (J.llIllIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (J.llIllIIIIIII(Inventory.contains(item -> item.getName().contains(llllllIlI[llllllIll[62]])) ? 1 : 0) && J.llIllIIIIIIl(Equipment.contains(item -> item.getName().contains(llllllIlI[llllllIll[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(llllllIlI[llllllIll[60]])).interact(llllllIlI[llllllIll[41]]);
                                Time.sleepTicks((int)llllllIll[1]);
                                "".length();
                            }
                            Movement.walkTo((WorldPoint)fL);
                            "".length();
                            Time.sleepTicks((int)llllllIll[3]);
                            "".length();
                        }
                        if (J.llIllIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                            AccBuilderGWD.c = llllllIlI[llllllIll[42]];
                            if (J.llIlIlllllIl(dk, llllllIll[3])) {
                                as.ow += llllllIll[3];
                                as.u(AccBuilderGWD.m);
                                dk += llllllIll[3];
                                as.ow = llllllIll[4];
                                dl = llllllIll[4];
                            }
                            g.a(llllllIlI[llllllIll[43]], cG);
                        }
                    }
                }
                if (J.llIlIllllllI(e.j(llllllIll[5]), llllllIll[1])) {
                    String[] stringArray = new String[llllllIll[3]];
                    stringArray[J.llllllIll[4]] = llllllIlI[llllllIll[44]];
                    TileObjects.getNearest((String[])stringArray).interact(llllllIlI[llllllIll[45]]);
                    Time.sleepTicks((int)llllllIll[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIlIlllllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIllIIIIllI(Object object) {
        return object == null;
    }

    static {
        J.llIlIlllllII();
        J.llIlIllllIll();
        fL = new WorldPoint(llllllIll[67], llllllIll[68], llllllIll[4]);
        fM = new WorldPoint(llllllIll[69], llllllIll[70], llllllIll[4]);
        bx = new ArrayList<d>();
        String[] stringArray = new String[llllllIll[23]];
        stringArray[J.llllllIll[4]] = llllllIlI[llllllIll[71]];
        stringArray[J.llllllIll[3]] = llllllIlI[llllllIll[72]];
        stringArray[J.llllllIll[1]] = llllllIlI[llllllIll[73]];
        stringArray[J.llllllIll[12]] = llllllIlI[llllllIll[74]];
        stringArray[J.llllllIll[7]] = llllllIlI[llllllIll[75]];
        stringArray[J.llllllIll[15]] = llllllIlI[llllllIll[76]];
        stringArray[J.llllllIll[17]] = llllllIlI[llllllIll[77]];
        stringArray[J.llllllIll[8]] = llllllIlI[llllllIll[78]];
        cG = stringArray;
    }

    public static void ce() {
        String[] stringArray = new String[llllllIll[3]];
        stringArray[J.llllllIll[4]] = llllllIlI[llllllIll[46]];
        if (J.llIllIIIIllI(NPCs.getNearest((String[])stringArray))) {
            if (J.llIllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                if (J.llIllIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)fL);
                "".length();
                Time.sleepTicks((int)llllllIll[3]);
                "".length();
            }
            if (J.llIllIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                AccBuilderGWD.c = llllllIlI[llllllIll[47]];
                String[] stringArray2 = new String[llllllIll[3]];
                stringArray2[J.llllllIll[4]] = llllllIlI[llllllIll[48]];
                TileObjects.getNearest((String[])stringArray2).interact(llllllIlI[llllllIll[0]]);
                Time.sleepTicks((int)llllllIll[1]);
                "".length();
            }
        }
    }

    private static boolean llIllIIIIIll(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llllllIll[3]];
        stringArray[J.llllllIll[4]] = llllllIlI[llllllIll[49]];
        if (J.llIllIIIIIll(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllllIll[3]];
            nArray[J.llllllIll[4]] = llllllIll[14];
            if (J.llIllIIIIIll(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[llllllIll[3]];
                stringArray2[J.llllllIll[4]] = llllllIlI[llllllIll[50]];
                if (J.llIllIIIIIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[llllllIll[3]];
                    nArray2[J.llllllIll[4]] = llllllIll[18];
                    if (J.llIllIIIIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[llllllIll[3]];
                        nArray3[J.llllllIll[4]] = llllllIll[11];
                        if (J.llIllIIIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = llllllIll[3];
                            "".length();
                            if ((0xF0 ^ 0xA6 ^ (0x67 ^ 0x35)) <= (0xDF ^ 0xA3 ^ (0x38 ^ 0x40))) return n2 != 0;
                            return ((0x54 ^ 0x31 ^ (0x80 ^ 0xB1)) & (157 + 36 - 7 + 15 ^ 142 + 43 - 157 + 129 ^ -" ".length())) != 0;
                        }
                    }
                }
            }
        }
        n2 = llllllIll[4];
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llllllIlI[llllllIll[58]];
    }

    private static boolean llIllIIIIIlI(Object object) {
        return object != null;
    }
}

