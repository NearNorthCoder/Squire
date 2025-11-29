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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.z;
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

public class ac
implements W {
    private static /* synthetic */ int[] lIIIIlIll;
    static /* synthetic */ WorldPoint by;
    static /* synthetic */ WorldArea bw;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bu;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint bx;
    private static /* synthetic */ String[] lIIIIlIlI;

    private static boolean llIllllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIlllIlIll(String lIIlIIllIIllllI, String lIIlIIllIIlllll) {
        try {
            SecretKeySpec lIIlIIllIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIllIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIllIlIIIlI = Cipher.getInstance("Blowfish");
            lIIlIIllIlIIIlI.init(lIIIIlIll[3], lIIlIIllIlIIIll);
            return new String(lIIlIIllIlIIIlI.doFinal(Base64.getDecoder().decode(lIIlIIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIllIlIIIIl) {
            lIIlIIllIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllllIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIllllIIIl(int n2) {
        return n2 == 0;
    }

    private static void llIlllIllIl() {
        lIIIIlIlI = new String[lIIIIlIll[80]];
        ac.lIIIIlIlI[ac.lIIIIlIll[0]] = ac.llIlllIlIlI("nuvUmnZXX8RFQmOeEbJYvQ==", "RXpvS");
        ac.lIIIIlIlI[ac.lIIIIlIll[1]] = ac.llIlllIlIll("1op8CHtI7eEooH1Q9PALyLP/3/ju/Lhe5b2pZxn1+22Aa3DbwcKLUQ9/tXPPOITpamqWAxX0B3k=", "TsYjm");
        ac.lIIIIlIlI[ac.lIIIIlIll[3]] = ac.llIlllIlIlI("kZ80Zomk2QPAS0Eu4uEQ85+ylgWOurXM", "pqCQT");
        ac.lIIIIlIlI[ac.lIIIIlIll[4]] = ac.llIlllIlIll("EgdiRGMrPuMCDMRRkLYPLam2AD0j2a7l", "dnMou");
        ac.lIIIIlIlI[ac.lIIIIlIll[7]] = ac.llIlllIlIll("cjMF+7Q61poG1cIU2ZeYiZU/TG62yyVud7yFE9qXXwKBhqUkTe/E63atKpNxAX7G", "NcTCP");
        ac.lIIIIlIlI[ac.lIIIIlIll[19]] = ac.llIlllIllII("JTI1UhYEcyAdFRg=", "kSCrb");
        ac.lIIIIlIlI[ac.lIIIIlIll[6]] = ac.llIlllIllII("IAQgDA8KGToKTAIfIx4=", "apTml");
        ac.lIIIIlIlI[ac.lIIIIlIll[27]] = ac.llIlllIlIll("JGsvZDPeQKBFW9cQ+4+T+xd2aryglUH5", "qwTMW");
        ac.lIIIIlIlI[ac.lIIIIlIll[30]] = ac.llIlllIlIll("kxjjDoqvmVHGPrbolTZ8O57V9IYKaxaF", "jBbmc");
        ac.lIIIIlIlI[ac.lIIIIlIll[32]] = ac.llIlllIlIlI("nUmMmheLR5EI0CiXzEDbp1B3qFG8VQ9S", "mvauL");
        ac.lIIIIlIlI[ac.lIIIIlIll[33]] = ac.llIlllIlIll("ToWlr1ILsPBSUQT6JK2AG/KQgxiRJhJ3", "XkLwC");
        ac.lIIIIlIlI[ac.lIIIIlIll[34]] = ac.llIlllIlIll("2pYVTbPvCOY=", "gPMUC");
        ac.lIIIIlIlI[ac.lIIIIlIll[37]] = ac.llIlllIlIll("3niZDauSSWY=", "joDKQ");
        ac.lIIIIlIlI[ac.lIIIIlIll[39]] = ac.llIlllIlIll("GCLqO+GhDns4agSRM2I92fk4XgfmivwN", "cvNnf");
        ac.lIIIIlIlI[ac.lIIIIlIll[41]] = ac.llIlllIlIll("dJnhifP8Szsil7tKnnvfGA==", "vwfbf");
        ac.lIIIIlIlI[ac.lIIIIlIll[42]] = ac.llIlllIllII("MB4bFyIaAwERYRIFGAU=", "qjovA");
        ac.lIIIIlIlI[ac.lIIIIlIll[43]] = ac.llIlllIlIlI("pbWZ3PWtEOA=", "xLsdo");
        ac.lIIIIlIlI[ac.lIIIIlIll[44]] = ac.llIlllIlIlI("BK3BY6HRqus=", "VKIPu");
        ac.lIIIIlIlI[ac.lIIIIlIll[45]] = ac.llIlllIlIlI("3szokRCFCJk=", "SgHcn");
        ac.lIIIIlIlI[ac.lIIIIlIll[47]] = ac.llIlllIlIll("HNLTBu6xw/4=", "mHfFf");
        ac.lIIIIlIlI[ac.lIIIIlIll[51]] = ac.llIlllIlIll("t2zLY9rdNoumIA2Y9gA1zCUYFTQ987QM", "fOZvS");
        ac.lIIIIlIlI[ac.lIIIIlIll[52]] = ac.llIlllIllII("GRsjIiA/Uz89NjYf", "ZsLMS");
        ac.lIIIIlIlI[ac.lIIIIlIll[54]] = ac.llIlllIlIll("s4LrRQFdlWIPOBCosJeuWA==", "TvxLY");
        ac.lIIIIlIlI[ac.lIIIIlIll[55]] = ac.llIlllIlIlI("S8GpzWrlPqg8470uojlD2A==", "WYOja");
        ac.lIIIIlIlI[ac.lIIIIlIll[56]] = ac.llIlllIlIlI("pldxjGfy49BgBL1HuEZJpA==", "VNEBX");
        ac.lIIIIlIlI[ac.lIIIIlIll[21]] = ac.llIlllIlIlI("xrw39h4ErxxMoMjUGzYWjA==", "JJxFd");
        ac.lIIIIlIlI[ac.lIIIIlIll[50]] = ac.llIlllIlIlI("3BG6pk16caVGNLPvXDEq1Q==", "LBjzv");
        ac.lIIIIlIlI[ac.lIIIIlIll[73]] = ac.llIlllIlIll("xGrItT48Da4gd1b47wsDdQ==", "RIWzp");
        ac.lIIIIlIlI[ac.lIIIIlIll[74]] = ac.llIlllIlIlI("3cgIhc3ZYv+xSBL0p2//JknRwe4wJ8IG", "YMfHR");
        ac.lIIIIlIlI[ac.lIIIIlIll[75]] = ac.llIlllIlIll("VM73tD6JXdc=", "sutfI");
    }

    public static void Y() {
        if (ac.llIlllIllll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[0]];
            b.a(bv);
            if (ac.llIllllIIII(bv.size(), lIIIIlIll[1])) {
                System.out.println(lIIIIlIlI[lIIIIlIll[1]]);
                bt = lIIIIlIll[0];
            }
        }
        if (ac.llIllllIIIl(bt ? 1 : 0) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[2])) {
            BankLocation lIIlIIllIllllII;
            if (ac.llIllllIIIl(ac.ab() ? 1 : 0)) {
                lIIlIIllIllllII = BankLocation.getNearest();
                if (ac.llIllllIIlI(lIIlIIllIllllII) && ac.llIllllIIIl(lIIlIIllIllllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[3]];
                    a.a(lIIlIIllIllllII);
                }
                if (ac.llIllllIIlI(lIIlIIllIllllII) && ac.llIlllIllll(lIIlIIllIllllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[4]];
                    if (ac.llIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlIll[5]);
                        "".length();
                        Time.sleepTicks((int)lIIIIlIll[6]);
                        "".length();
                    }
                    if (ac.llIlllIllll(Bank.isOpen() ? 1 : 0)) {
                        if (ac.llIllllIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIlIll[7]);
                            "".length();
                        }
                        while (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) && ac.llIllllIIIl(z.bi() ? 1 : 0)) {
                            z.bg();
                            Time.sleepTicks((int)lIIIIlIll[1]);
                            "".length();
                            "".length();
                            if ("   ".length() > 0) continue;
                            return;
                        }
                        if (ac.llIllllIIIl(ac.ac() ? 1 : 0)) {
                            ac.af();
                            System.out.println(lIIIIlIlI[lIIIIlIll[7]]);
                            bt = lIIIIlIll[1];
                            return;
                        }
                        if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
                            int[] nArray = new int[lIIIIlIll[1]];
                            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIIlIll[1]];
                                nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray2), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[9], (int)lIIIIlIll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];
                                            "".length();
                                            if ((0x18 ^ 0x20 ^ (0x2C ^ 0x10)) < 0) {
                                                return ((0x29 ^ 0x76 ^ (0x26 ^ 0x18)) & (0x18 ^ 0x1C ^ (0x1E ^ 0x7B) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] nArray3 = new int[lIIIIlIll[1]];
                            nArray3[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIIlIll[1]];
                                nArray4[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray4), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[11], (int)lIIIIlIll[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];
                                            "".length();
                                            if (((0xD4 ^ 0x9F) & ~(0x58 ^ 0x13)) >= " ".length()) {
                                                return (" ".length() & ~" ".length()) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] nArray5 = new int[lIIIIlIll[1]];
                            nArray5[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIIlIll[1]];
                                nArray6[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray6), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[13], (int)lIIIIlIll[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];
                                            "".length();
                                            if (((6 ^ 0x35) & ~(0x23 ^ 0x10)) != 0) {
                                                return ((0xB8 ^ 0xBE) & ~(0xE ^ 8)) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] nArray7 = new int[lIIIIlIll[1]];
                            nArray7[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIIlIll[1]];
                                nArray8[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray8), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[14], (int)lIIIIlIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];
                                            "".length();
                                            if (((7 ^ 0xB) & ~(0x9D ^ 0x91)) != 0) {
                                                return ((0x95 ^ 0x84) & ~(4 ^ 0x15)) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] nArray9 = new int[lIIIIlIll[1]];
                            nArray9[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIIlIll[1]];
                                nArray10[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray10), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[16], (int)lIIIIlIll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];
                                            "".length();
                                            if (-" ".length() != -" ".length()) {
                                                return ((0x43 ^ 0x6B) & ~(0x93 ^ 0xBB)) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] nArray11 = new int[lIIIIlIll[1]];
                            nArray11[ac.lIIIIlIll[0]] = lIIIIlIll[17];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIIIlIll[1]];
                                nArray12[ac.lIIIIlIll[0]] = lIIIIlIll[17];
                                if (ac.llIllllIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIIIlIll[17], (int)lIIIIlIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw((int)lIIIIlIll[18], (int)lIIIIlIll[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIIIlIll[1]];
                            nArray13[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIIIlIll[1]];
                                nArray14[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray14), lIIIIlIll[1]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21])) {
                                    Bank.withdrawAll((int)lIIIIlIll[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];
                                            "".length();
                                            if (" ".length() < 0) {
                                                return ((0xED ^ 0xC3 ^ (0x5D ^ 0x50)) & (112 + 45 - 144 + 114 ^ (0x1A ^ 0x46) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                        }
                        if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
                            int[] nArray = new int[lIIIIlIll[1]];
                            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (ac.llIllllIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIIIlIll[22], (int)lIIIIlIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlIll[1]);
                                "".length();
                            }
                            if (ac.llIlllIllll(bu ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIIIlIll[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlIll[1]);
                                "".length();
                                Bank.withdrawAll((int)lIIIIlIll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlIll[1]);
                                "".length();
                            }
                            Time.sleepTicks((int)lIIIIlIll[4]);
                            "".length();
                            Bank.withdrawAll((int)lIIIIlIll[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIIlIll[1]);
                            "".length();
                            Bank.withdrawAll((int)lIIIIlIll[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIIIlIll[1]);
                            "".length();
                        }
                    }
                }
            }
            if (ac.llIlllIllll(ac.ab() ? 1 : 0)) {
                if (ac.llIlllIllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21])) {
                    if (ac.llIllllIIIl(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[19]];
                        Movement.walkTo((WorldPoint)bx);
                        "".length();
                        Time.sleepTicks((int)lIIIIlIll[1]);
                        "".length();
                    }
                    if (ac.llIlllIllll(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[6]];
                        ac.aa();
                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[26])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[27]];
                    if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIIIlIll[1]);
                        "".length();
                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[26]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[29])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[30]];
                    if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIIIlIll[1]);
                        "".length();
                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[29]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[31])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[32]];
                    if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIIIlIll[1]);
                        "".length();
                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[31]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[33]];
                    if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIIIlIll[1]);
                        "".length();
                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
                    int lIIlIIllIlllIlI;
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[34]];
                    if (ac.llIllllIllI(by)) {
                        by = new WorldPoint(lIIIIlIll[35] + e.c(lIIIIlIll[1], lIIIIlIll[7]), lIIIIlIll[36], lIIIIlIll[0]);
                    }
                    int[] nArray = new int[lIIIIlIll[1]];
                    nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                    if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIIIlIll[1]];
                        nArray15[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                        if (ac.llIllllIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIIIlIll[1]];
                            nArray16[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            Inventory.getFirst((int[])nArray16).interact(lIIIIlIlI[lIIIIlIll[37]]);
                            Time.sleepTicks((int)lIIIIlIll[1]);
                            "".length();
                        }
                    }
                    if (ac.llIlllIllll(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIIIlIll[1]];
                    nArray17[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                    lIIlIIllIllllII = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIIIlIll[1]];
                    nArray18[ac.lIIIIlIll[0]] = lIIIIlIll[38];
                    Item lIIlIIllIlllIll = Inventory.getFirst((int[])nArray18);
                    if (ac.llIllllIIIl(bu ? 1 : 0) && ac.llIllllIIlI(by)) {
                        if (ac.llIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[39]];
                            Movement.walkTo((WorldPoint)by);
                            "".length();
                            Time.sleepTicks((int)lIIIIlIll[1]);
                            "".length();
                        }
                        if (ac.llIlllIllll(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0) && ac.llIllllIIlI(lIIlIIllIllllII) && ac.llIllllIIlI(lIIlIIllIlllIll) && ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                            lIIlIIllIlllIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIlIIllIlllIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ac.llIlllllIlI(Skills.getExperience((Skill)Skill.MAGIC), lIIlIIllIlllIlI)) {
                                    bl = lIIIIlIll[1];
                                    "".length();
                                    if (-"  ".length() > 0) {
                                        return ((0x51 ^ 0x13) & ~(0x5F ^ 0x1D)) != 0;
                                    }
                                } else {
                                    bl = lIIIIlIll[0];
                                }
                                return bl;
                            }, (int)lIIIIlIll[10]);
                            "".length();
                        }
                    }
                    if (ac.llIlllIllll(bu ? 1 : 0)) {
                        if (ac.llIllllIIlI(lIIlIIllIllllII) && ac.llIllllIIlI(lIIlIIllIlllIll) && ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                            lIIlIIllIlllIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIlIIllIlllIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ac.llIlllllIlI(Skills.getExperience((Skill)Skill.MAGIC), lIIlIIllIlllIlI)) {
                                    bl = lIIIIlIll[1];
                                    "".length();
                                    if (((0x55 ^ 0x64) & ~(0x46 ^ 0x77)) >= " ".length()) {
                                        return ((0x90 ^ 0xC0) & ~(0xEF ^ 0xBF)) != 0;
                                    }
                                } else {
                                    bl = lIIIIlIll[0];
                                }
                                return bl;
                            }, (int)lIIIIlIll[10]);
                            "".length();
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                                bl = lIIIIlIll[1];
                                "".length();
                                if (-" ".length() > "  ".length()) {
                                    return ((0xB0 ^ 0xA6 ^ (4 ^ 0x5C)) & (0x33 ^ 0x5D ^ (0x60 ^ 0x40) ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = lIIIIlIll[0];
                            }
                            return bl;
                        }, (int)lIIIIlIll[40]);
                        "".length();
                    }
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
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
                                                    if (!ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21])) break block19;
                                                    int[] nArray = new int[lIIIIlIll[1]];
                                                    nArray[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIIlIll[1]];
                                                    nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIIlIll[1]];
                                                    nArray3[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIIlIll[1]];
                                                    nArray4[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIIlIll[1]];
                                                    nArray5[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIIlIll[1]];
                                                    nArray6[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                                    if (!ac.llIllllIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIIlIll[1]];
                                                    nArray7[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                                    if (!ac.llIlllIllll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIIlIll[1];
                                                "".length();
                                                if (((45 + 98 - 104 + 90 ^ 29 + 32 - -83 + 9) & (0x10 ^ 7 ^ (0x8C ^ 0x83) ^ -" ".length())) == ((0x3E ^ 0x37 ^ (0xF1 ^ 0xBD)) & (0x50 ^ 0x26 ^ (0xA1 ^ 0x92) ^ -" ".length()))) return n5 != 0;
                                                return ((86 + 94 - 41 + 113 ^ 88 + 50 - -13 + 28) & (0x6B ^ 0x2A ^ (0x44 ^ 0x4A) ^ -" ".length())) != 0;
                                            }
                                            n5 = lIIIIlIll[0];
                                            return n5 != 0;
                                        }
                                        if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21]) || !ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) break block22;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                        if (!ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIIlIll[1]];
                                        nArray8[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                        if (!ac.llIlllIllll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIIlIll[1]];
                                        nArray9[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                        if (!ac.llIlllIllll(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIIlIll[1]];
                                        nArray10[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                                        if (!ac.llIlllIllll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIIlIll[1]];
                                        nArray11[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                        if (!ac.llIllllIIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIIlIll[1]];
                                        nArray12[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                        if (!ac.llIlllIllll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIIlIll[1];
                                    "".length();
                                    if ("   ".length() != 0) return n4 != 0;
                                    return ((168 + 97 - 224 + 197 ^ 119 + 51 - 78 + 104) & (72 + 21 - -6 + 30 ^ 62 + 136 - 161 + 134 ^ -" ".length())) != 0;
                                }
                                n4 = lIIIIlIll[0];
                                return n4 != 0;
                            }
                            if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) || !ac.llIllllIIIl(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIIlIll[1]];
                            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (!ac.llIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIIlIll[1]];
                            nArray13[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (!ac.llIlllIllll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIIlIll[1]];
                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                        if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIIlIll[1]];
                            nArray14[ac.lIIIIlIll[0]] = lIIIIlIll[38];
                            if (ac.llIlllIllll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIIlIll[1];
                                "".length();
                                if (-" ".length() == -" ".length()) return n3 != 0;
                                return ((0xC5 ^ 0x80 ^ (0x3E ^ 0x29)) & (0x47 ^ 0x3D ^ (0xAB ^ 0x83) ^ -" ".length())) != 0;
                            }
                        }
                    }
                    n3 = lIIIIlIll[0];
                    return n3 != 0;
                }
                if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) || !ac.llIlllIllll(bu ? 1 : 0)) return lIIIIlIll[0];
                int[] nArray = new int[lIIIIlIll[1]];
                nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (!ac.llIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIIlIll[1]];
                nArray15[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (!ac.llIlllIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[16];
            if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlIll[1]];
                nArray16[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                if (ac.llIlllIllll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlIll[1]];
                    nArray17[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                    if (ac.llIllllIlII(Inventory.getFirst((int[])nArray17).getQuantity(), lIIIIlIll[19])) {
                        int[] nArray18 = new int[lIIIIlIll[1]];
                        nArray18[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                        if (ac.llIlllIllll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIIlIll[1]];
                            nArray19[ac.lIIIIlIll[0]] = lIIIIlIll[38];
                            if (ac.llIlllIllll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIIlIll[1];
                                "".length();
                                if (null == null) return n2 != 0;
                                return ((0x1D ^ 0x3D ^ (0x32 ^ 0xE)) & (0x3E ^ 8 ^ (0x99 ^ 0xB3) ^ -" ".length())) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIlIll[0];
        return n2 != 0;
    }

    private static boolean llIlllllIII(int n2) {
        return n2 < 0;
    }

    private static int llIllllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static boolean ad() {
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[1]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[19])) {
            return lIIIIlIll[1];
        }
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[3]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[19])) {
            return lIIIIlIll[1];
        }
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[4]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[39])) {
            return lIIIIlIll[1];
        }
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[4]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32])) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
            if (ac.llIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIIlIll[1];
            }
        }
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[7]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[39])) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
            if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIIlIll[1];
            }
        }
        return lIIIIlIll[0];
    }

    private static void af() {
        d lIIlIIllIllIIlI;
        Object lIIlIIllIllIIll;
        if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[16];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIIIIlIll[16], lIIIIlIll[57], lIIIIlIll[58]);
                bv.add(d2);
                "".length();
            }
            int[] nArray2 = new int[lIIIIlIll[1]];
            nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[9];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIIlIIllIllIIll = new d(lIIIIlIll[9], lIIIIlIll[59], lIIIIlIll[6]);
                bv.add((d)lIIlIIllIllIIll);
                "".length();
            }
            int[] nArray3 = new int[lIIIIlIll[1]];
            nArray3[ac.lIIIIlIll[0]] = lIIIIlIll[11];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIIlIIllIllIIll = new d(lIIIIlIll[11], lIIIIlIll[60], lIIIIlIll[6]);
                bv.add((d)lIIlIIllIllIIll);
                "".length();
            }
            int[] nArray4 = new int[lIIIIlIll[1]];
            nArray4[ac.lIIIIlIll[0]] = lIIIIlIll[13];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIIlIIllIllIIll = new d(lIIIIlIll[13], lIIIIlIll[61], lIIIIlIll[6]);
                bv.add((d)lIIlIIllIllIIll);
                "".length();
            }
            int[] nArray5 = new int[lIIIIlIll[1]];
            nArray5[ac.lIIIIlIll[0]] = lIIIIlIll[14];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIIlIIllIllIIll = new d(lIIIIlIll[14], lIIIIlIll[5], lIIIIlIll[6]);
                bv.add((d)lIIlIIllIllIIll);
                "".length();
            }
            int[] nArray6 = new int[lIIIIlIll[1]];
            nArray6[ac.lIIIIlIll[0]] = lIIIIlIll[46];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIIlIIllIllIIll = new d(lIIIIlIll[46], lIIIIlIll[1], e.c(lIIIIlIll[62], lIIIIlIll[63]));
                bv.add((d)lIIlIIllIllIIll);
                "".length();
            }
        }
        if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[24];
            if (ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIIIlIll[1]];
                nArray7[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                if (ac.llIllllIIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlIll[61])) {
                    int[] nArray8 = new int[lIIIIlIll[1]];
                    nArray8[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                    lIIlIIllIllIIll = new d(lIIIIlIll[24], lIIIIlIll[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIIIlIll[64]);
                    bv.add((d)lIIlIIllIllIIll);
                    "".length();
                }
            }
            int[] nArray9 = new int[lIIIIlIll[1]];
            nArray9[ac.lIIIIlIll[0]] = lIIIIlIll[24];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIIlIIllIllIIll = new d(lIIIIlIll[24], lIIIIlIll[61], lIIIIlIll[64]);
                bv.add((d)lIIlIIllIllIIll);
                "".length();
            }
            int[] nArray10 = new int[lIIIIlIll[1]];
            nArray10[ac.lIIIIlIll[0]] = lIIIIlIll[25];
            if (ac.llIlllIllll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIIIlIll[1]];
                nArray11[ac.lIIIIlIll[0]] = lIIIIlIll[25];
                if (ac.llIllllIIII(Bank.getFirst((int[])nArray11).getQuantity(), lIIIIlIll[61])) {
                    int[] nArray12 = new int[lIIIIlIll[1]];
                    nArray12[ac.lIIIIlIll[0]] = lIIIIlIll[25];
                    lIIlIIllIllIIll = new d(lIIIIlIll[25], lIIIIlIll[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIIIlIll[65]);
                    bv.add((d)lIIlIIllIllIIll);
                    "".length();
                }
            }
            int[] nArray13 = new int[lIIIIlIll[1]];
            nArray13[ac.lIIIIlIll[0]] = lIIIIlIll[25];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIIlIIllIllIIll = new d(lIIIIlIll[25], lIIIIlIll[61], lIIIIlIll[65]);
                bv.add((d)lIIlIIllIllIIll);
                "".length();
            }
            int[] nArray14 = new int[lIIIIlIll[1]];
            nArray14[ac.lIIIIlIll[0]] = lIIIIlIll[22];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIIIlIll[1]];
                nArray15[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (ac.llIllllIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIIlIIllIllIIll = new d(lIIIIlIll[22], lIIIIlIll[1], lIIIIlIll[66]);
                    bv.add((d)lIIlIIllIllIIll);
                    "".length();
                }
            }
            if (ac.llIlllIllll(bu ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlIll[1]];
                nArray16[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                if (ac.llIlllIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlIll[1]];
                    nArray17[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                    if (ac.llIllllIIII(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIlIll[61])) {
                        int[] nArray18 = new int[lIIIIlIll[1]];
                        nArray18[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                        lIIlIIllIllIIll = new d(lIIIIlIll[16], lIIIIlIll[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIIIlIll[58]);
                        bv.add((d)lIIlIIllIllIIll);
                        "".length();
                    }
                }
                int[] nArray19 = new int[lIIIIlIll[1]];
                nArray19[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                if (ac.llIllllIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIIlIIllIllIIll = new d(lIIIIlIll[16], lIIIIlIll[61], lIIIIlIll[58]);
                    bv.add((d)lIIlIIllIllIIll);
                    "".length();
                }
                int[] nArray20 = new int[lIIIIlIll[1]];
                nArray20[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                if (ac.llIlllIllll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIIIlIll[1]];
                    nArray21[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                    if (ac.llIllllIIII(Bank.getFirst((int[])nArray21).getQuantity(), lIIIIlIll[66])) {
                        int[] nArray22 = new int[lIIIIlIll[1]];
                        nArray22[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                        lIIlIIllIllIIll = new d(lIIIIlIll[23], lIIIIlIll[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIIIlIll[6]);
                        bv.add((d)lIIlIIllIllIIll);
                        "".length();
                    }
                }
                int[] nArray23 = new int[lIIIIlIll[1]];
                nArray23[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                if (ac.llIllllIIIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIIlIIllIllIIll = new d(lIIIIlIll[23], lIIIIlIll[66], lIIIIlIll[6]);
                    bv.add((d)lIIlIIllIllIIll);
                    "".length();
                }
            }
        }
        int[] nArray = new int[lIIIIlIll[1]];
        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[20];
        if (ac.llIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlIIllIllIIll = new d(lIIIIlIll[20], lIIIIlIll[67], lIIIIlIll[68]);
            bv.add((d)lIIlIIllIllIIll);
            "".length();
        }
        if (ac.llIllllIIIl(Bank.contains(lIIlIIllIllIIll = item -> item.getName().toLowerCase().contains(lIIIIlIlI[lIIIIlIll[74]])) ? 1 : 0)) {
            lIIlIIllIllIIlI = new d(lIIIIlIll[69], lIIIIlIll[19], lIIIIlIll[70]);
            bv.add(lIIlIIllIllIIlI);
            "".length();
        }
        int[] nArray24 = new int[lIIIIlIll[1]];
        nArray24[ac.lIIIIlIll[0]] = lIIIIlIll[71];
        if (ac.llIllllIIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIIlIIllIllIIlI = new d(lIIIIlIll[71], lIIIIlIll[33], lIIIIlIll[72]);
            bv.add(lIIlIIllIllIIlI);
            "".length();
        }
        int[] nArray25 = new int[lIIIIlIll[1]];
        nArray25[ac.lIIIIlIll[0]] = lIIIIlIll[18];
        if (ac.llIllllIIIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIIlIIllIllIIlI = new d(lIIIIlIll[18], lIIIIlIll[33], lIIIIlIll[72]);
            bv.add(lIIlIIllIllIIlI);
            "".length();
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[2])) {
            bl = lIIIIlIll[1];
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((0xB9 ^ 0x89 ^ (0x6A ^ 0x41)) & (0x38 ^ 0x11 ^ (0xF2 ^ 0xC0) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIIIlIll[0];
        }
        return bl;
    }

    private static String llIlllIllII(String lIIlIIlIllllllI, String lIIlIIlIlllllIl) {
        lIIlIIlIllllllI = new String(Base64.getDecoder().decode(lIIlIIlIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIllIIIIIIl = new StringBuilder();
        char[] lIIlIIllIIIIIII = lIIlIIlIlllllIl.toCharArray();
        int lIIlIIlIlllllll = lIIIIlIll[0];
        char[] lIIlIIlIllllIIl = lIIlIIlIllllllI.toCharArray();
        int lIIlIIlIllllIII = lIIlIIlIllllIIl.length;
        int lIIlIIlIlllIlll = lIIIIlIll[0];
        while (ac.llIllllIIII(lIIlIIlIlllIlll, lIIlIIlIllllIII)) {
            char lIIlIIllIIIIlII = lIIlIIlIllllIIl[lIIlIIlIlllIlll];
            lIIlIIllIIIIIIl.append((char)(lIIlIIllIIIIlII ^ lIIlIIllIIIIIII[lIIlIIlIlllllll % lIIlIIllIIIIIII.length]));
            "".length();
            ++lIIlIIlIlllllll;
            ++lIIlIIlIlllIlll;
            "".length();
            if (((0x24 ^ 0x7C) & ~(0x2E ^ 0x76) ^ (0x6C ^ 0x68)) >= 0) continue;
            return null;
        }
        return String.valueOf(lIIlIIllIIIIIIl);
    }

    private static boolean llIlllIllll(int n2) {
        return n2 != 0;
    }

    private static String llIlllIlIlI(String lIIlIIllIIlIIll, String lIIlIIllIIlIIlI) {
        try {
            SecretKeySpec lIIlIIllIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIIIlIll[30]), "DES");
            Cipher lIIlIIllIIlIlIl = Cipher.getInstance("DES");
            lIIlIIllIIlIlIl.init(lIIIIlIll[3], lIIlIIllIIlIllI);
            return new String(lIIlIIllIIlIlIl.doFinal(Base64.getDecoder().decode(lIIlIIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIllIIlIlII) {
            lIIlIIllIIlIlII.printStackTrace();
            return null;
        }
    }

    public static void Z() {
        if (ac.llIlllIllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ac.llIllllIIIl(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[41]];
            Movement.walkTo((WorldPoint)bx);
            "".length();
            Time.sleepTicks((int)lIIIIlIll[1]);
            "".length();
        }
        if (ac.llIlllIllll(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[42]];
            ac.aa();
        }
    }

    private static void llIlllIlllI() {
        lIIIIlIll = new int[81];
        ac.lIIIIlIll[0] = (59 + 93 - 67 + 122 ^ 85 + 2 - -5 + 40) & (0x59 ^ 6 ^ (0x60 ^ 0x74) ^ -" ".length());
        ac.lIIIIlIll[1] = " ".length();
        ac.lIIIIlIll[2] = 0x88 ^ 0xBA;
        ac.lIIIIlIll[3] = "  ".length();
        ac.lIIIIlIll[4] = "   ".length();
        ac.lIIIIlIll[5] = -(0xFFFFBD77 & 0x6EEE) & (0xFFFFBFFF & 0x7FED);
        ac.lIIIIlIll[6] = 0x9F ^ 0x99;
        ac.lIIIIlIll[7] = 0x62 ^ 0x1B ^ (0x77 ^ 0xA);
        ac.lIIIIlIll[8] = 109 + 13 - 40 + 46 ^ 38 + 126 - 147 + 166;
        ac.lIIIIlIll[9] = 0xFFFFD63F & 0x2BEE;
        ac.lIIIIlIll[10] = 0xFFFFADDF & 0x57FC;
        ac.lIIIIlIll[11] = 0xFFFFCFEB & 0x323F;
        ac.lIIIIlIll[12] = -(0xFFFF9FBE & 0x7475) & (0xFFFF9DFF & 0x7FF7);
        ac.lIIIIlIll[13] = -(0xFFFF9C8D & 0x67F3) & (0xFFFF9FFD & 0x66AF);
        ac.lIIIIlIll[14] = -(0xFFFFFEDF & 0x79F5) & (0xFFFFFFFE & 0x7AFF);
        ac.lIIIIlIll[15] = -(0xFFFFF6DF & 0x2D2C) & (0xFFFFBD9F & 0x77FF);
        ac.lIIIIlIll[16] = -(0xFFFFD7F9 & 0x3DCF) & (0xFFFFD7FF & 0x3FFB);
        ac.lIIIIlIll[17] = -(0xFFFFBDB7 & 0x4AEB) & (0xFFFFFDF7 & 0x3BFB);
        ac.lIIIIlIll[18] = 0xFFFFDF5B & 0x3FED;
        ac.lIIIIlIll[19] = 0x8F ^ 0xB9 ^ (0xA0 ^ 0x93);
        ac.lIIIIlIll[20] = -(26 + 15 - -22 + 70) & (0xFFFFD3FF & 0x2DFF);
        ac.lIIIIlIll[21] = 0x88 ^ 0x91;
        ac.lIIIIlIll[22] = -(0xFFFFF357 & 0x3EBD) & (0xFFFFFFFF & 0x377F);
        ac.lIIIIlIll[23] = -(0xFFFFBDED & 0x7A96) & (0xFFFFFAEF & 0x3FBF);
        ac.lIIIIlIll[24] = -(0xFFFFEFE7 & 0x7C5F) & (0xFFFFFFF7 & 0x6E7F);
        ac.lIIIIlIll[25] = 0x55 ^ 0x4D ^ (0x19 ^ 0x3F);
        ac.lIIIIlIll[26] = 0x6F ^ 0x59 ^ (0x2D ^ 4);
        ac.lIIIIlIll[27] = 56 + 3 - -1 + 108 ^ 139 + 44 - 129 + 121;
        ac.lIIIIlIll[28] = -" ".length();
        ac.lIIIIlIll[29] = 0x7B ^ 0x5E;
        ac.lIIIIlIll[30] = 0x88 ^ 0x99 ^ (0x86 ^ 0x9F);
        ac.lIIIIlIll[31] = 0xFD ^ 0x8B ^ (0xF8 ^ 0xA3);
        ac.lIIIIlIll[32] = 0xCC ^ 0xC5;
        ac.lIIIIlIll[33] = 0x34 ^ 0x45 ^ (0x71 ^ 0xA);
        ac.lIIIIlIll[34] = 153 + 109 - 237 + 146 ^ 23 + 128 - 59 + 68;
        ac.lIIIIlIll[35] = 0xFFFFDC7B & 0x2FDE;
        ac.lIIIIlIll[36] = 0xFFFFED9F & 0x1FFF;
        ac.lIIIIlIll[37] = 0x76 ^ 0x7A;
        ac.lIIIIlIll[38] = 53 + 1 - 40 + 113 ^ (0x1F ^ 0x5F);
        ac.lIIIIlIll[39] = 48 + 130 - 77 + 44 ^ 150 + 113 - 195 + 88;
        ac.lIIIIlIll[40] = 0xFFFFBDFC & 0x4FAF;
        ac.lIIIIlIll[41] = 0xAC ^ 0xA2;
        ac.lIIIIlIll[42] = 0x80 ^ 0x87 ^ (0x53 ^ 0x5B);
        ac.lIIIIlIll[43] = 0x21 ^ 0x31;
        ac.lIIIIlIll[44] = 3 ^ 0x32 ^ (0x6B ^ 0x4B);
        ac.lIIIIlIll[45] = 29 + 95 - -9 + 0 ^ 83 + 117 - 145 + 96;
        ac.lIIIIlIll[46] = -(0xFFFFFD0F & 0x6AF9) & (0xFFFFFD6F & 0x6FFD);
        ac.lIIIIlIll[47] = "  ".length() ^ (0x89 ^ 0x98);
        ac.lIIIIlIll[48] = -(0xFFFFBEFB & 0x7DCF) & (0xFFFFFFDE & 0x3DFF);
        ac.lIIIIlIll[49] = -(0xFFFFCDBF & 0x7FE5) & (0xFFFFFFFF & 0x4FF5);
        ac.lIIIIlIll[50] = 0x11 ^ 0x1D ^ (0x6B ^ 0x7D);
        ac.lIIIIlIll[51] = 0x62 ^ 0x76;
        ac.lIIIIlIll[52] = 43 + 162 - 106 + 81 ^ 48 + 126 - 44 + 31;
        ac.lIIIIlIll[53] = (0x24 ^ 0x30) + (0x83 ^ 0xA5) - (0xA3 ^ 0x8B) + (77 + 72 - 107 + 141);
        ac.lIIIIlIll[54] = 88 + 9 - 40 + 74 ^ 75 + 140 - 151 + 85;
        ac.lIIIIlIll[55] = 0x24 ^ 0x33;
        ac.lIIIIlIll[56] = 0x74 ^ 0x6C;
        ac.lIIIIlIll[57] = 0xFFFFCFEB & 0x33FC;
        ac.lIIIIlIll[58] = 29 + 133 - 68 + 76;
        ac.lIIIIlIll[59] = 0xFFFFDFB0 & 0x2FEF;
        ac.lIIIIlIll[60] = -(0xFFFFF126 & 0x7EDD) & (0xFFFFFFDB & 0x77F7);
        ac.lIIIIlIll[61] = -(0xFFFFF4BB & 0x6F47) & (0xFFFFEFFA & 0x7FBF);
        ac.lIIIIlIll[62] = 0xFFFFBFFD & 0x70D6;
        ac.lIIIIlIll[63] = -(0xFFFFFF2E & 0x1F3) & (0xFFFFFFFF & 0x3DAD);
        ac.lIIIIlIll[64] = 0x75 ^ 0x4D ^ (0x12 ^ 0x52);
        ac.lIIIIlIll[65] = 71 + 139 - 65 + 5;
        ac.lIIIIlIll[66] = -(0xFFFFC57F & 0x7FA7) & (0xFFFFFFFF & 0x7FBE);
        ac.lIIIIlIll[67] = 0x6F ^ 0xB;
        ac.lIIIIlIll[68] = -(0xFFFFF8FB & 0x7FAD) & (0xFFFFFBF8 & 0x7DEF);
        ac.lIIIIlIll[69] = -(0xFFFFF57F & 0xBB3) & (0xFFFFBFFF & 0x6FFE);
        ac.lIIIIlIll[70] = -(0xFFFFBA8F & 0x4F73) & (0xFFFFFFFA & 0x6BAF);
        ac.lIIIIlIll[71] = -(0xFFFFD8ED & 0x67BB) & (0xFFFFFFFF & 0x5FEF);
        ac.lIIIIlIll[72] = -(0xFFFFFCBB & 0x7F4F) & (0xFFFFFFFF & 0x7F8E);
        ac.lIIIIlIll[73] = 64 + 39 - 16 + 49 ^ 132 + 37 - 104 + 82;
        ac.lIIIIlIll[74] = 0x99 ^ 0x85;
        ac.lIIIIlIll[75] = 0xB ^ 0x16;
        ac.lIIIIlIll[76] = -(0xFFFFFDB6 & 0x665B) & (0xFFFFFFDF & 0x6FFF);
        ac.lIIIIlIll[77] = 0xFFFFDCFB & 0x2FE7;
        ac.lIIIIlIll[78] = -(0xFFFFFC8B & 0x677D) & (0xFFFFFFFF & 0x6FDF);
        ac.lIIIIlIll[79] = 0xFFFFEFFD & 0x1CEB;
        ac.lIIIIlIll[80] = 0x50 ^ 0x5F ^ (0x3E ^ 0x2F);
    }

    private static void aa() {
        if (ac.llIlllllIII(ac.llIllllIlll(e.u(), 30.0))) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[20];
            if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIIlIll[1]];
                nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                Inventory.getFirst((int[])nArray2).interact(lIIIIlIlI[lIIIIlIll[43]]);
                Time.sleepTicks((int)lIIIIlIll[1]);
                "".length();
            }
        }
        if (ac.llIllllIllI(Players.getLocal().getInteracting())) {
            NPC lIIlIIllIllIlll = NPCs.getNearest(nPC -> {
                int n2;
                if (ac.llIlllIllll(nPC.getName().contains(lIIIIlIlI[lIIIIlIll[75]]) ? 1 : 0) && ac.llIllllIIIl(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIIIlIll[1];
                    "".length();
                    if ((14 + 40 - -62 + 50 ^ 44 + 87 - 18 + 49) == 0) {
                        return ((198 + 33 - 31 + 14 ^ 96 + 70 - 58 + 20) & (129 + 20 - 135 + 132 ^ 155 + 128 - 153 + 66 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIIIIlIll[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIIIlIll[3]];
            stringArray[ac.lIIIIlIll[0]] = lIIIIlIlI[lIIIIlIll[44]];
            stringArray[ac.lIIIIlIll[1]] = lIIIIlIlI[lIIIIlIll[45]];
            List lIIlIIllIllIllI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (ac.llIlllllIIl(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIIIlIll[1];
                    "".length();
                    if (-" ".length() >= (0xC0 ^ 0xC4)) {
                        return ((0x64 ^ 0x74) & ~(0x40 ^ 0x50)) != 0;
                    }
                } else {
                    bl = lIIIIlIll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[46];
            if (ac.llIlllIllll(Equipment.contains((int[])nArray) ? 1 : 0) && ac.llIllllIIIl(ac.ad() ? 1 : 0)) {
                ac.ae();
            }
            if (ac.llIllllIIlI(lIIlIIllIllIlll) && ac.llIllllIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                lIIlIIllIllIlll.interact(lIIIIlIlI[lIIIIlIll[47]]);
                Time.sleepTicks((int)lIIIIlIll[4]);
                "".length();
            }
        }
    }

    private static boolean llIllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllllIIlI(Object object) {
        return object != null;
    }

    static {
        ac.llIlllIlllI();
        ac.llIlllIllIl();
        bu = lIIIIlIll[0];
        bv = new ArrayList<d>();
        bw = new WorldArea(lIIIIlIll[76], lIIIIlIll[77], lIIIIlIll[51], lIIIIlIll[41], lIIIIlIll[0]);
        bx = new WorldPoint(lIIIIlIll[78], lIIIIlIll[79], lIIIIlIll[0]);
        by = null;
    }

    public static void ae() {
        if (ac.llIllllIIlI(Widgets.get((int)lIIIIlIll[49], (int)lIIIIlIll[50]))) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[51]];
            Widgets.get((int)lIIIIlIll[49], (int)lIIIIlIll[50]).interact(lIIIIlIlI[lIIIIlIll[52]]);
            Time.sleepTicks((int)lIIIIlIll[7]);
            "".length();
        }
        if (ac.llIllllIllI(Widgets.get((int)lIIIIlIll[49], (int)lIIIIlIll[50])) && ac.llIllllIIIl(Widgets.get((int)lIIIIlIll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIIIlIll[1]);
            "".length();
            if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[19])) {
                Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[1]).interact(lIIIIlIlI[lIIIIlIll[54]]);
            }
            if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[19])) {
                Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[3]).interact(lIIIIlIlI[lIIIIlIll[55]]);
            }
            if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[39])) {
                Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[4]).interact(lIIIIlIlI[lIIIIlIll[56]]);
            }
            if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32])) {
                int[] nArray = new int[lIIIIlIll[1]];
                nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                if (ac.llIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[4]).interact(lIIIIlIlI[lIIIIlIll[21]]);
                }
            }
            if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[39])) {
                int[] nArray = new int[lIIIIlIll[1]];
                nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[7]).interact(lIIIIlIlI[lIIIIlIll[50]]);
                }
            }
            Time.sleepTicks((int)lIIIIlIll[1]);
            "".length();
        }
    }

    @Override
    public int T() {
        try {
            ac.Y();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x50 ^ 7 ^ (0x1D ^ 0x15)) & (0xEE ^ 0xB6 ^ (0x57 ^ 0x50) ^ -" ".length())) >= "   ".length()) {
            return (173 + 230 - 356 + 188 ^ 17 + 67 - -24 + 29) & (0x2C ^ 0x27 ^ (0xFC ^ 0x95) ^ -" ".length());
        }
        return lIIIIlIll[67];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
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
                                                    if (!ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21])) break block19;
                                                    int[] nArray = new int[lIIIIlIll[1]];
                                                    nArray[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIIlIll[1]];
                                                    nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIIlIll[1]];
                                                    nArray3[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIIlIll[1]];
                                                    nArray4[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIIlIll[1]];
                                                    nArray5[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIIlIll[1]];
                                                    nArray6[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                                    if (!ac.llIllllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIIlIll[1]];
                                                    nArray7[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                                    if (!ac.llIlllIllll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIIlIll[1];
                                                "".length();
                                                if (((0x4A ^ 0x70 ^ (0xCC ^ 0xBF)) & (0x79 ^ 0x31 ^ " ".length() ^ -" ".length())) == 0) return n5 != 0;
                                                return ((83 + 165 - 64 + 4 ^ 27 + 85 - 73 + 121) & (0xE8 ^ 0x86 ^ (0x2C ^ 0x5E) ^ -" ".length())) != 0;
                                            }
                                            n5 = lIIIIlIll[0];
                                            return n5 != 0;
                                        }
                                        if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21]) || !ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) break block22;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                        if (!ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIIlIll[1]];
                                        nArray8[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                        if (!ac.llIlllIllll(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIIlIll[1]];
                                        nArray9[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                        if (!ac.llIlllIllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIIlIll[1]];
                                        nArray10[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                                        if (!ac.llIlllIllll(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIIlIll[1]];
                                        nArray11[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                        if (!ac.llIllllIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIIlIll[1]];
                                        nArray12[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                        if (!ac.llIlllIllll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIIlIll[1];
                                    "".length();
                                    if ("  ".length() >= 0) return n4 != 0;
                                    return ((0x45 ^ 0x7B) & ~(0x6B ^ 0x55)) != 0;
                                }
                                n4 = lIIIIlIll[0];
                                return n4 != 0;
                            }
                            if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) || !ac.llIllllIIIl(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIIlIll[1]];
                            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (!ac.llIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIIlIll[1]];
                            nArray13[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (!ac.llIlllIllll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIIlIll[1]];
                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                        if (ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIIlIll[1]];
                            nArray14[ac.lIIIIlIll[0]] = lIIIIlIll[25];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIIlIll[1];
                                "".length();
                                if (-"  ".length() < 0) return n3 != 0;
                                return ((0x7E ^ 0x70 ^ (3 ^ 0x56)) & (172 + 104 - 145 + 99 ^ 114 + 175 - 220 + 120 ^ -" ".length())) != 0;
                            }
                        }
                    }
                    n3 = lIIIIlIll[0];
                    return n3 != 0;
                }
                if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) || !ac.llIlllIllll(bu ? 1 : 0)) return lIIIIlIll[0];
                int[] nArray = new int[lIIIIlIll[1]];
                nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (!ac.llIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIIlIll[1]];
                nArray15[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (!ac.llIlllIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[16];
            if (ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlIll[1]];
                nArray16[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                if (ac.llIlllIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlIll[1]];
                    nArray17[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                    if (ac.llIllllIlII(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIlIll[19])) {
                        int[] nArray18 = new int[lIIIIlIll[1]];
                        nArray18[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                        if (ac.llIlllIllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIIlIll[1]];
                            nArray19[ac.lIIIIlIll[0]] = lIIIIlIll[25];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIIlIll[1];
                                "".length();
                                if ("   ".length() != (0x81 ^ 0x85)) return n2 != 0;
                                return ((0xF8 ^ 0xA9) & ~(0xD3 ^ 0x82)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIlIll[0];
        return n2 != 0;
    }

    private static boolean llIllllIllI(Object object) {
        return object == null;
    }

    @Override
    public boolean S() {
        return lIIIIlIll[0];
    }

    private static boolean llIllllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllllIIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        return lIIIIlIlI[lIIIIlIll[73]];
    }
}

