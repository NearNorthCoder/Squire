package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

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
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ac  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/ac.class */
public class ac implements W {
    private static /* synthetic */ int[] lIIIIlIll;
    static /* synthetic */ WorldPoint by;
    static /* synthetic */ WorldArea bw;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bu;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint bx;
    private static /* synthetic */ String[] lIIIIlIlI;

    private static boolean llIllllIlIl(int i, int i2) {
        return i == i2;
    }

    private static String llIlllIlIll(String lIIlIIllIlIIIII, String lIIlIIllIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIllIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIllIlIIIlI = Cipher.getInstance("Blowfish");
            lIIlIIllIlIIIlI.init(lIIIIlIll[3], secretKeySpec);
            return new String(lIIlIIllIlIIIlI.doFinal(Base64.getDecoder().decode(lIIlIIllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIllIIlllII) {
            lIIlIIllIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllllIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIllllIIll(int i) {
        return i > 0;
    }

    private static boolean llIllllIIIl(int i) {
        return i == 0;
    }

    private static void llIlllIllIl() {
        lIIIIlIlI = new String[lIIIIlIll[80]];
        lIIIIlIlI[lIIIIlIll[0]] = llIlllIlIlI("nuvUmnZXX8RFQmOeEbJYvQ==", "RXpvS");
        lIIIIlIlI[lIIIIlIll[1]] = llIlllIlIll("1op8CHtI7eEooH1Q9PALyLP/3/ju/Lhe5b2pZxn1+22Aa3DbwcKLUQ9/tXPPOITpamqWAxX0B3k=", "TsYjm");
        lIIIIlIlI[lIIIIlIll[3]] = llIlllIlIlI("kZ80Zomk2QPAS0Eu4uEQ85+ylgWOurXM", "pqCQT");
        lIIIIlIlI[lIIIIlIll[4]] = llIlllIlIll("EgdiRGMrPuMCDMRRkLYPLam2AD0j2a7l", "dnMou");
        lIIIIlIlI[lIIIIlIll[7]] = llIlllIlIll("cjMF+7Q61poG1cIU2ZeYiZU/TG62yyVud7yFE9qXXwKBhqUkTe/E63atKpNxAX7G", "NcTCP");
        lIIIIlIlI[lIIIIlIll[19]] = llIlllIllII("JTI1UhYEcyAdFRg=", "kSCrb");
        lIIIIlIlI[lIIIIlIll[6]] = llIlllIllII("IAQgDA8KGToKTAIfIx4=", "apTml");
        lIIIIlIlI[lIIIIlIll[27]] = llIlllIlIll("JGsvZDPeQKBFW9cQ+4+T+xd2aryglUH5", "qwTMW");
        lIIIIlIlI[lIIIIlIll[30]] = llIlllIlIll("kxjjDoqvmVHGPrbolTZ8O57V9IYKaxaF", "jBbmc");
        lIIIIlIlI[lIIIIlIll[32]] = llIlllIlIlI("nUmMmheLR5EI0CiXzEDbp1B3qFG8VQ9S", "mvauL");
        lIIIIlIlI[lIIIIlIll[33]] = llIlllIlIll("ToWlr1ILsPBSUQT6JK2AG/KQgxiRJhJ3", "XkLwC");
        lIIIIlIlI[lIIIIlIll[34]] = llIlllIlIll("2pYVTbPvCOY=", "gPMUC");
        lIIIIlIlI[lIIIIlIll[37]] = llIlllIlIll("3niZDauSSWY=", "joDKQ");
        lIIIIlIlI[lIIIIlIll[39]] = llIlllIlIll("GCLqO+GhDns4agSRM2I92fk4XgfmivwN", "cvNnf");
        lIIIIlIlI[lIIIIlIll[41]] = llIlllIlIll("dJnhifP8Szsil7tKnnvfGA==", "vwfbf");
        lIIIIlIlI[lIIIIlIll[42]] = llIlllIllII("MB4bFyIaAwERYRIFGAU=", "qjovA");
        lIIIIlIlI[lIIIIlIll[43]] = llIlllIlIlI("pbWZ3PWtEOA=", "xLsdo");
        lIIIIlIlI[lIIIIlIll[44]] = llIlllIlIlI("BK3BY6HRqus=", "VKIPu");
        lIIIIlIlI[lIIIIlIll[45]] = llIlllIlIlI("3szokRCFCJk=", "SgHcn");
        lIIIIlIlI[lIIIIlIll[47]] = llIlllIlIll("HNLTBu6xw/4=", "mHfFf");
        lIIIIlIlI[lIIIIlIll[51]] = llIlllIlIll("t2zLY9rdNoumIA2Y9gA1zCUYFTQ987QM", "fOZvS");
        lIIIIlIlI[lIIIIlIll[52]] = llIlllIllII("GRsjIiA/Uz89NjYf", "ZsLMS");
        lIIIIlIlI[lIIIIlIll[54]] = llIlllIlIll("s4LrRQFdlWIPOBCosJeuWA==", "TvxLY");
        lIIIIlIlI[lIIIIlIll[55]] = llIlllIlIlI("S8GpzWrlPqg8470uojlD2A==", "WYOja");
        lIIIIlIlI[lIIIIlIll[56]] = llIlllIlIlI("pldxjGfy49BgBL1HuEZJpA==", "VNEBX");
        lIIIIlIlI[lIIIIlIll[21]] = llIlllIlIlI("xrw39h4ErxxMoMjUGzYWjA==", "JJxFd");
        lIIIIlIlI[lIIIIlIll[50]] = llIlllIlIlI("3BG6pk16caVGNLPvXDEq1Q==", "LBjzv");
        lIIIIlIlI[lIIIIlIll[73]] = llIlllIlIll("xGrItT48Da4gd1b47wsDdQ==", "RIWzp");
        lIIIIlIlI[lIIIIlIll[74]] = llIlllIlIlI("3cgIhc3ZYv+xSBL0p2//JknRwe4wJ8IG", "YMfHR");
        lIIIIlIlI[lIIIIlIll[75]] = llIlllIlIll("VM73tD6JXdc=", "sutfI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    public static void Y() {
        if (llIlllIllll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[0]];
            C0001b.a(bv);
            if (llIllllIIII(bv.size(), lIIIIlIll[1])) {
                System.out.println(lIIIIlIlI[lIIIIlIll[1]]);
                bt = lIIIIlIll[0];
            }
        }
        if (llIllllIIIl(bt ? 1 : 0) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[2])) {
            if (llIllllIIIl(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIllllIIlI(nearest) && llIllllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[3]];
                    C0000a.a(nearest);
                }
                if (llIllllIIlI(nearest) && llIlllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[4]];
                    if (llIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIlIll[5]);
                        "".length();
                        Time.sleepTicks(lIIIIlIll[6]);
                        "".length();
                    }
                    if (llIlllIllll(Bank.isOpen() ? 1 : 0)) {
                        if (llIllllIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIlIll[7]);
                            "".length();
                        }
                        while (llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8]) && llIllllIIIl(C0025z.bi() ? 1 : 0)) {
                            C0025z.bg();
                            Time.sleepTicks(lIIIIlIll[1]);
                            "".length();
                            "".length();
                            if ("   ".length() <= 0) {
                                return;
                            }
                        }
                        if (llIllllIIIl(ac() ? 1 : 0)) {
                            af();
                            System.out.println(lIIIIlIlI[lIIIIlIll[7]]);
                            bt = lIIIIlIll[1];
                            return;
                        }
                        if (llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8])) {
                            int[] iArr = new int[lIIIIlIll[1]];
                            iArr[lIIIIlIll[0]] = lIIIIlIll[9];
                            if (llIlllIllll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIIIlIll[1]];
                                iArr2[lIIIIlIll[0]] = lIIIIlIll[9];
                                if (llIllllIIII(Inventory.getCount(iArr2), lIIIIlIll[1])) {
                                    Bank.withdraw(lIIIIlIll[9], lIIIIlIll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIIIIlIll[1]];
                                        iArr3[lIIIIlIll[0]] = lIIIIlIll[9];
                                        if (llIllllIIll(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIIIIlIll[1];
                                            "".length();
                                            return ((24 ^ 32) ^ (44 ^ 16)) < 0 ? ((41 ^ 118) ^ (38 ^ 24)) & (((24 ^ 28) ^ (30 ^ 123)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIIlIll[0];
                                    }, lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIIIIlIll[1]];
                            iArr3[lIIIIlIll[0]] = lIIIIlIll[11];
                            if (llIlllIllll(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIIlIll[1]];
                                iArr4[lIIIIlIll[0]] = lIIIIlIll[11];
                                if (llIllllIIII(Inventory.getCount(iArr4), lIIIIlIll[1])) {
                                    Bank.withdraw(lIIIIlIll[11], lIIIIlIll[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIIIIlIll[1]];
                                        iArr5[lIIIIlIll[0]] = lIIIIlIll[11];
                                        if (llIllllIIll(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIIIIlIll[1];
                                            "".length();
                                            return ((212 ^ 159) & ((88 ^ 19) ^ (-1))) >= " ".length() ? " ".length() & (" ".length() ^ (-1)) : r0;
                                        }
                                        return lIIIIlIll[0];
                                    }, lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIIIIlIll[1]];
                            iArr5[lIIIIlIll[0]] = lIIIIlIll[13];
                            if (llIlllIllll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIlIll[1]];
                                iArr6[lIIIIlIll[0]] = lIIIIlIll[13];
                                if (llIllllIIII(Inventory.getCount(iArr6), lIIIIlIll[1])) {
                                    Bank.withdraw(lIIIIlIll[13], lIIIIlIll[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIIIIlIll[1]];
                                        iArr7[lIIIIlIll[0]] = lIIIIlIll[13];
                                        if (llIllllIIll(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIIIIlIll[1];
                                            "".length();
                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIIlIll[0];
                                    }, lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIIIIlIll[1]];
                            iArr7[lIIIIlIll[0]] = lIIIIlIll[14];
                            if (llIlllIllll(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIIIlIll[1]];
                                iArr8[lIIIIlIll[0]] = lIIIIlIll[14];
                                if (llIllllIIII(Inventory.getCount(iArr8), lIIIIlIll[1])) {
                                    Bank.withdraw(lIIIIlIll[14], lIIIIlIll[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIIIIlIll[1]];
                                        iArr9[lIIIIlIll[0]] = lIIIIlIll[14];
                                        if (llIllllIIll(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIIIIlIll[1];
                                            "".length();
                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIIlIll[0];
                                    }, lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIIIIlIll[1]];
                            iArr9[lIIIIlIll[0]] = lIIIIlIll[16];
                            if (llIlllIllll(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIIIlIll[1]];
                                iArr10[lIIIIlIll[0]] = lIIIIlIll[16];
                                if (llIllllIIII(Inventory.getCount(iArr10), lIIIIlIll[1])) {
                                    Bank.withdraw(lIIIIlIll[16], lIIIIlIll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIIIIlIll[1]];
                                        iArr11[lIIIIlIll[0]] = lIIIIlIll[16];
                                        if (llIllllIIll(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIIIIlIll[1];
                                            "".length();
                                            return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIIlIll[0];
                                    }, lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIIIIlIll[1]];
                            iArr11[lIIIIlIll[0]] = lIIIIlIll[17];
                            if (llIlllIllll(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIIIlIll[1]];
                                iArr12[lIIIIlIll[0]] = lIIIIlIll[17];
                                if (llIllllIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIIIIlIll[17], lIIIIlIll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIIIIlIll[1]];
                                        iArr13[lIIIIlIll[0]] = lIIIIlIll[17];
                                        return Inventory.contains(iArr13);
                                    }, lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIIIIlIll[18], lIIIIlIll[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIIIIlIll[1]];
                            iArr13[lIIIIlIll[0]] = lIIIIlIll[20];
                            if (llIlllIllll(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIIIIlIll[1]];
                                iArr14[lIIIIlIll[0]] = lIIIIlIll[20];
                                if (llIllllIIII(Inventory.getCount(iArr14), lIIIIlIll[1]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[21])) {
                                    Bank.withdrawAll(lIIIIlIll[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIIIIlIll[1]];
                                        iArr15[lIIIIlIll[0]] = lIIIIlIll[20];
                                        if (llIllllIIll(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIIIIlIll[1];
                                            "".length();
                                            return " ".length() < 0 ? ((237 ^ 195) ^ (93 ^ 80)) & (((((112 + 45) - 144) + 114) ^ (26 ^ 70)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIIlIll[0];
                                    }, lIIIIlIll[5]);
                                    "".length();
                                }
                            }
                        }
                        if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8])) {
                            int[] iArr15 = new int[lIIIIlIll[1]];
                            iArr15[lIIIIlIll[0]] = lIIIIlIll[22];
                            if (llIllllIIIl(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIIIIlIll[22], lIIIIlIll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlIll[1]);
                                "".length();
                            }
                            if (llIlllIllll(bu ? 1 : 0)) {
                                Bank.withdrawAll(lIIIIlIll[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlIll[1]);
                                "".length();
                                Bank.withdrawAll(lIIIIlIll[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlIll[1]);
                                "".length();
                            }
                            Time.sleepTicks(lIIIIlIll[4]);
                            "".length();
                            Bank.withdrawAll(lIIIIlIll[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIIIlIll[1]);
                            "".length();
                            Bank.withdrawAll(lIIIIlIll[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIIIIlIll[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlllIllll(ab() ? 1 : 0)) {
                if (llIlllIllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[21])) {
                    if (llIllllIIIl(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[19]];
                        Movement.walkTo(bx);
                        "".length();
                        Time.sleepTicks(lIIIIlIll[1]);
                        "".length();
                    }
                    if (llIlllIllll(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[6]];
                        aa();
                    }
                }
                if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[21]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[26])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[27]];
                    if (llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIIIIlIll[1]);
                        "".length();
                    }
                }
                if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[26]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[29])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[30]];
                    if (llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIIIIlIll[1]);
                        "".length();
                    }
                }
                if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[29]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[31])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[32]];
                    if (llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIIIIlIll[1]);
                        "".length();
                    }
                }
                if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[31]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[33]];
                    if (llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIIIIlIll[1]);
                        "".length();
                    }
                }
                if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[34]];
                    if (llIllllIllI(by)) {
                        by = new WorldPoint(lIIIIlIll[35] + C0004e.c(lIIIIlIll[1], lIIIIlIll[7]), lIIIIlIll[36], lIIIIlIll[0]);
                    }
                    int[] iArr16 = new int[lIIIIlIll[1]];
                    iArr16[lIIIIlIll[0]] = lIIIIlIll[22];
                    if (llIlllIllll(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIIIlIll[1]];
                        iArr17[lIIIIlIll[0]] = lIIIIlIll[22];
                        if (llIllllIIIl(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIIIlIll[1]];
                            iArr18[lIIIIlIll[0]] = lIIIIlIll[22];
                            Inventory.getFirst(iArr18).interact(lIIIIlIlI[lIIIIlIll[37]]);
                            Time.sleepTicks(lIIIIlIll[1]);
                            "".length();
                        }
                    }
                    if (llIlllIllll(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIIIIlIll[1]];
                    iArr19[lIIIIlIll[0]] = lIIIIlIll[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIIIIlIll[1]];
                    iArr20[lIIIIlIll[0]] = lIIIIlIll[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (llIllllIIIl(bu ? 1 : 0) && llIllllIIlI(by)) {
                        if (llIllllIIIl(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[39]];
                            Movement.walkTo(by);
                            "".length();
                            Time.sleepTicks(lIIIIlIll[1]);
                            "".length();
                        }
                        if (llIlllIllll(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0) && llIllllIIlI(first) && llIllllIIlI(first2) && llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                            int lIIlIIllIlllIlI = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIlllllIlI(Skills.getExperience(Skill.MAGIC), lIIlIIllIlllIlI)) {
                                    ?? r0 = lIIIIlIll[1];
                                    "".length();
                                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIIlIll[0];
                            }, lIIIIlIll[10]);
                            "".length();
                        }
                    }
                    if (llIlllIllll(bu ? 1 : 0)) {
                        if (llIllllIIlI(first) && llIllllIIlI(first2) && llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                            int lIIlIIllIlllIlI2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIlllllIlI(Skills.getExperience(Skill.MAGIC), lIIlIIllIlllIlI2)) {
                                    ?? r0 = lIIIIlIll[1];
                                    "".length();
                                    return ((85 ^ 100) & ((70 ^ 119) ^ (-1))) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIIlIll[0];
                            }, lIIIIlIll[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                                ?? r0 = lIIIIlIll[1];
                                "".length();
                                return (-" ".length()) > "  ".length() ? ((176 ^ 166) ^ (4 ^ 92)) & (((51 ^ 93) ^ (96 ^ 64)) ^ (-" ".length())) : r0;
                            }
                            return lIIIIlIll[0];
                        }, lIIIIlIll[40]);
                        "".length();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIlllIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x023c, code lost:
        if (llIlllIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02e9, code lost:
        if (llIlllIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03be, code lost:
        if (llIlllIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        if (llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[21])) {
            int[] iArr = new int[lIIIIlIll[1]];
            iArr[lIIIIlIll[0]] = lIIIIlIll[9];
            if (llIlllIllll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIlIll[1]];
                iArr2[lIIIIlIll[0]] = lIIIIlIll[13];
                if (llIlllIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIIlIll[1]];
                    iArr3[lIIIIlIll[0]] = lIIIIlIll[11];
                    if (llIlllIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIIlIll[1]];
                        iArr4[lIIIIlIll[0]] = lIIIIlIll[14];
                        if (llIlllIllll(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIIIlIll[1]];
                            iArr5[lIIIIlIll[0]] = lIIIIlIll[20];
                            if (llIlllIllll(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIlIll[1]];
                                iArr6[lIIIIlIll[0]] = lIIIIlIll[46];
                                if (llIllllIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIIIlIll[1]];
                                    iArr7[lIIIIlIll[0]] = lIIIIlIll[46];
                                }
                                ?? r0 = lIIIIlIll[1];
                                "".length();
                                return (((((45 + 98) - 104) + 90) ^ (((29 + 32) - (-83)) + 9)) & (((16 ^ 7) ^ (140 ^ 131)) ^ (-" ".length()))) != (((62 ^ 55) ^ (241 ^ 189)) & (((80 ^ 38) ^ (161 ^ 146)) ^ (-" ".length()))) ? ((((86 + 94) - 41) + 113) ^ (((88 + 50) - (-13)) + 28)) & (((107 ^ 42) ^ (68 ^ 74)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIIIIlIll[0];
        } else if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[21]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8])) {
            int[] iArr8 = new int[lIIIIlIll[1]];
            iArr8[lIIIIlIll[0]] = lIIIIlIll[13];
            if (llIlllIllll(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIIlIll[1]];
                iArr9[lIIIIlIll[0]] = lIIIIlIll[11];
                if (llIlllIllll(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIlIll[1]];
                    iArr10[lIIIIlIll[0]] = lIIIIlIll[14];
                    if (llIlllIllll(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIIlIll[1]];
                        iArr11[lIIIIlIll[0]] = lIIIIlIll[16];
                        if (llIlllIllll(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIIlIll[1]];
                            iArr12[lIIIIlIll[0]] = lIIIIlIll[46];
                            if (llIllllIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIIlIll[1]];
                                iArr13[lIIIIlIll[0]] = lIIIIlIll[46];
                            }
                            ?? r02 = lIIIIlIll[1];
                            "".length();
                            return "   ".length() == 0 ? ((((168 + 97) - 224) + 197) ^ (((119 + 51) - 78) + 104)) & (((((72 + 21) - (-6)) + 30) ^ (((62 + 136) - 161) + 134)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIIIIlIll[0];
        } else if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8]) && llIllllIIIl(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIIIlIll[1]];
            iArr14[lIIIIlIll[0]] = lIIIIlIll[22];
            if (llIllllIIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIIlIll[1]];
                iArr15[lIIIIlIll[0]] = lIIIIlIll[22];
            }
            int[] iArr16 = new int[lIIIIlIll[1]];
            iArr16[lIIIIlIll[0]] = lIIIIlIll[24];
            if (llIlllIllll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIIlIll[1]];
                iArr17[lIIIIlIll[0]] = lIIIIlIll[38];
                if (llIlllIllll(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIIIlIll[1];
                    "".length();
                    return (-" ".length()) != (-" ".length()) ? ((197 ^ 128) ^ (62 ^ 41)) & (((71 ^ 61) ^ (171 ^ 131)) ^ (-" ".length())) : r03;
                }
            }
            return lIIIIlIll[0];
        } else if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8]) && llIlllIllll(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIIIlIll[1]];
            iArr18[lIIIIlIll[0]] = lIIIIlIll[22];
            if (llIllllIIIl(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIIlIll[1]];
                iArr19[lIIIIlIll[0]] = lIIIIlIll[22];
            }
            int[] iArr20 = new int[lIIIIlIll[1]];
            iArr20[lIIIIlIll[0]] = lIIIIlIll[16];
            if (llIlllIllll(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIIlIll[1]];
                iArr21[lIIIIlIll[0]] = lIIIIlIll[23];
                if (llIlllIllll(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIIlIll[1]];
                    iArr22[lIIIIlIll[0]] = lIIIIlIll[23];
                    if (llIllllIlII(Inventory.getFirst(iArr22).getQuantity(), lIIIIlIll[19])) {
                        int[] iArr23 = new int[lIIIIlIll[1]];
                        iArr23[lIIIIlIll[0]] = lIIIIlIll[24];
                        if (llIlllIllll(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIIIlIll[1]];
                            iArr24[lIIIIlIll[0]] = lIIIIlIll[38];
                            if (llIlllIllll(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIIIlIll[1];
                                "".length();
                                return 0 != 0 ? ((29 ^ 61) ^ (50 ^ 14)) & (((62 ^ 8) ^ (153 ^ 179)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIIIIlIll[0];
        } else {
            return lIIIIlIll[0];
        }
    }

    private static boolean llIlllllIII(int i) {
        return i < 0;
    }

    private static int llIllllIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ad() {
        if (llIllllIlIl(Vars.getBit(lIIIIlIll[48]), lIIIIlIll[1]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[19])) {
            return lIIIIlIll[1];
        }
        if (llIllllIlIl(Vars.getBit(lIIIIlIll[48]), lIIIIlIll[3]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[32]) && llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[19])) {
            return lIIIIlIll[1];
        }
        if (llIllllIlIl(Vars.getBit(lIIIIlIll[48]), lIIIIlIll[4]) && llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[32]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[39])) {
            return lIIIIlIll[1];
        }
        if (llIllllIlIl(Vars.getBit(lIIIIlIll[48]), lIIIIlIll[4]) && llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[32])) {
            int[] iArr = new int[lIIIIlIll[1]];
            iArr[lIIIIlIll[0]] = lIIIIlIll[14];
            if (llIllllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                return lIIIIlIll[1];
            }
        }
        if (llIllllIlIl(Vars.getBit(lIIIIlIll[48]), lIIIIlIll[7]) && llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[39])) {
            int[] iArr2 = new int[lIIIIlIll[1]];
            iArr2[lIIIIlIll[0]] = lIIIIlIll[14];
            if (llIlllIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIIlIll[1];
            }
        }
        return lIIIIlIll[0];
    }

    private static void af() {
        if (llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8])) {
            int[] iArr = new int[lIIIIlIll[1]];
            iArr[lIIIIlIll[0]] = lIIIIlIll[16];
            if (llIllllIIIl(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIll[16], lIIIIlIll[57], lIIIIlIll[58]));
                "".length();
            }
            int[] iArr2 = new int[lIIIIlIll[1]];
            iArr2[lIIIIlIll[0]] = lIIIIlIll[9];
            if (llIllllIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIll[9], lIIIIlIll[59], lIIIIlIll[6]));
                "".length();
            }
            int[] iArr3 = new int[lIIIIlIll[1]];
            iArr3[lIIIIlIll[0]] = lIIIIlIll[11];
            if (llIllllIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIll[11], lIIIIlIll[60], lIIIIlIll[6]));
                "".length();
            }
            int[] iArr4 = new int[lIIIIlIll[1]];
            iArr4[lIIIIlIll[0]] = lIIIIlIll[13];
            if (llIllllIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIll[13], lIIIIlIll[61], lIIIIlIll[6]));
                "".length();
            }
            int[] iArr5 = new int[lIIIIlIll[1]];
            iArr5[lIIIIlIll[0]] = lIIIIlIll[14];
            if (llIllllIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIll[14], lIIIIlIll[5], lIIIIlIll[6]));
                "".length();
            }
            int[] iArr6 = new int[lIIIIlIll[1]];
            iArr6[lIIIIlIll[0]] = lIIIIlIll[46];
            if (llIllllIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIll[46], lIIIIlIll[1], C0004e.c(lIIIIlIll[62], lIIIIlIll[63])));
                "".length();
            }
        }
        if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8])) {
            int[] iArr7 = new int[lIIIIlIll[1]];
            iArr7[lIIIIlIll[0]] = lIIIIlIll[24];
            if (llIlllIllll(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIIlIll[1]];
                iArr8[lIIIIlIll[0]] = lIIIIlIll[24];
                if (llIllllIIII(Bank.getFirst(iArr8).getQuantity(), lIIIIlIll[61])) {
                    int i = lIIIIlIll[24];
                    int i2 = lIIIIlIll[61];
                    int[] iArr9 = new int[lIIIIlIll[1]];
                    iArr9[lIIIIlIll[0]] = lIIIIlIll[24];
                    bv.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIIIIlIll[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIIIIlIll[1]];
            iArr10[lIIIIlIll[0]] = lIIIIlIll[24];
            if (llIllllIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIll[24], lIIIIlIll[61], lIIIIlIll[64]));
                "".length();
            }
            int[] iArr11 = new int[lIIIIlIll[1]];
            iArr11[lIIIIlIll[0]] = lIIIIlIll[25];
            if (llIlllIllll(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIIIlIll[1]];
                iArr12[lIIIIlIll[0]] = lIIIIlIll[25];
                if (llIllllIIII(Bank.getFirst(iArr12).getQuantity(), lIIIIlIll[61])) {
                    int i3 = lIIIIlIll[25];
                    int i4 = lIIIIlIll[61];
                    int[] iArr13 = new int[lIIIIlIll[1]];
                    iArr13[lIIIIlIll[0]] = lIIIIlIll[25];
                    bv.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIIIIlIll[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIIIIlIll[1]];
            iArr14[lIIIIlIll[0]] = lIIIIlIll[25];
            if (llIllllIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIll[25], lIIIIlIll[61], lIIIIlIll[65]));
                "".length();
            }
            int[] iArr15 = new int[lIIIIlIll[1]];
            iArr15[lIIIIlIll[0]] = lIIIIlIll[22];
            if (llIllllIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIIIlIll[1]];
                iArr16[lIIIIlIll[0]] = lIIIIlIll[22];
                if (llIllllIIIl(Equipment.contains(iArr16) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIIlIll[22], lIIIIlIll[1], lIIIIlIll[66]));
                    "".length();
                }
            }
            if (llIlllIllll(bu ? 1 : 0)) {
                int[] iArr17 = new int[lIIIIlIll[1]];
                iArr17[lIIIIlIll[0]] = lIIIIlIll[16];
                if (llIlllIllll(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIIIlIll[1]];
                    iArr18[lIIIIlIll[0]] = lIIIIlIll[16];
                    if (llIllllIIII(Bank.getFirst(iArr18).getQuantity(), lIIIIlIll[61])) {
                        int i5 = lIIIIlIll[16];
                        int i6 = lIIIIlIll[61];
                        int[] iArr19 = new int[lIIIIlIll[1]];
                        iArr19[lIIIIlIll[0]] = lIIIIlIll[16];
                        bv.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIIIIlIll[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIIIlIll[1]];
                iArr20[lIIIIlIll[0]] = lIIIIlIll[16];
                if (llIllllIIIl(Bank.contains(iArr20) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIIlIll[16], lIIIIlIll[61], lIIIIlIll[58]));
                    "".length();
                }
                int[] iArr21 = new int[lIIIIlIll[1]];
                iArr21[lIIIIlIll[0]] = lIIIIlIll[23];
                if (llIlllIllll(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIIlIll[1]];
                    iArr22[lIIIIlIll[0]] = lIIIIlIll[23];
                    if (llIllllIIII(Bank.getFirst(iArr22).getQuantity(), lIIIIlIll[66])) {
                        int i7 = lIIIIlIll[23];
                        int i8 = lIIIIlIll[66];
                        int[] iArr23 = new int[lIIIIlIll[1]];
                        iArr23[lIIIIlIll[0]] = lIIIIlIll[23];
                        bv.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIIIIlIll[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIIIIlIll[1]];
                iArr24[lIIIIlIll[0]] = lIIIIlIll[23];
                if (llIllllIIIl(Bank.contains(iArr24) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIIlIll[23], lIIIIlIll[66], lIIIIlIll[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIIIIlIll[1]];
        iArr25[lIIIIlIll[0]] = lIIIIlIll[20];
        if (llIllllIIIl(Bank.contains(iArr25) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIll[20], lIIIIlIll[67], lIIIIlIll[68]));
            "".length();
        }
        if (llIllllIIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIlIlI[lIIIIlIll[74]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIll[69], lIIIIlIll[19], lIIIIlIll[70]));
            "".length();
        }
        int[] iArr26 = new int[lIIIIlIll[1]];
        iArr26[lIIIIlIll[0]] = lIIIIlIll[71];
        if (llIllllIIIl(Bank.contains(iArr26) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIll[71], lIIIIlIll[33], lIIIIlIll[72]));
            "".length();
        }
        int[] iArr27 = new int[lIIIIlIll[1]];
        iArr27[lIIIIlIll[0]] = lIIIIlIll[18];
        if (llIllllIIIl(Bank.contains(iArr27) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIll[18], lIIIIlIll[33], lIIIIlIll[72]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[2])) {
            ?? r0 = lIIIIlIll[1];
            "".length();
            return (-" ".length()) >= " ".length() ? ((185 ^ 137) ^ (106 ^ 65)) & (((56 ^ 17) ^ (242 ^ 192)) ^ (-" ".length())) : r0;
        }
        return lIIIIlIll[0];
    }

    private static String llIlllIllII(String lIIlIIllIIIIIll, String lIIlIIllIIIIIlI) {
        String lIIlIIllIIIIIll2 = new String(Base64.getDecoder().decode(lIIlIIllIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIllIIIIIIl = new StringBuilder();
        char[] lIIlIIllIIIIIII = lIIlIIllIIIIIlI.toCharArray();
        int lIIlIIlIlllllll = lIIIIlIll[0];
        char[] charArray = lIIlIIllIIIIIll2.toCharArray();
        int length = charArray.length;
        int i = lIIIIlIll[0];
        while (llIllllIIII(i, length)) {
            char lIIlIIllIIIIlII = charArray[i];
            lIIlIIllIIIIIIl.append((char) (lIIlIIllIIIIlII ^ lIIlIIllIIIIIII[lIIlIIlIlllllll % lIIlIIllIIIIIII.length]));
            "".length();
            lIIlIIlIlllllll++;
            i++;
            "".length();
            if ((((36 ^ 124) & ((46 ^ 118) ^ (-1))) ^ (108 ^ 104)) < 0) {
                return null;
            }
        }
        return String.valueOf(lIIlIIllIIIIIIl);
    }

    private static boolean llIlllIllll(int i) {
        return i != 0;
    }

    private static String llIlllIlIlI(String lIIlIIllIIlIIll, String lIIlIIllIIlIIlI) {
        try {
            SecretKeySpec lIIlIIllIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIIIlIll[30]), "DES");
            Cipher lIIlIIllIIlIlIl = Cipher.getInstance("DES");
            lIIlIIllIIlIlIl.init(lIIIIlIll[3], lIIlIIllIIlIllI);
            return new String(lIIlIIllIIlIlIl.doFinal(Base64.getDecoder().decode(lIIlIIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIllIIlIlII) {
            lIIlIIllIIlIlII.printStackTrace();
            return null;
        }
    }

    public static void Z() {
        if (llIlllIllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIllllIIIl(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[41]];
            Movement.walkTo(bx);
            "".length();
            Time.sleepTicks(lIIIIlIll[1]);
            "".length();
        }
        if (llIlllIllll(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[42]];
            aa();
        }
    }

    private static void llIlllIlllI() {
        lIIIIlIll = new int[81];
        lIIIIlIll[0] = ((((59 + 93) - 67) + 122) ^ (((85 + 2) - (-5)) + 40)) & (((89 ^ 6) ^ (96 ^ 116)) ^ (-" ".length()));
        lIIIIlIll[1] = " ".length();
        lIIIIlIll[2] = 136 ^ 186;
        lIIIIlIll[3] = "  ".length();
        lIIIIlIll[4] = "   ".length();
        lIIIIlIll[5] = (-((-17033) & 28398)) & (-16385) & 32749;
        lIIIIlIll[6] = 159 ^ 153;
        lIIIIlIll[7] = (98 ^ 27) ^ (119 ^ 10);
        lIIIIlIll[8] = (((109 + 13) - 40) + 46) ^ (((38 + 126) - 147) + 166);
        lIIIIlIll[9] = (-10689) & 11246;
        lIIIIlIll[10] = (-21025) & 22524;
        lIIIIlIll[11] = (-12309) & 12863;
        lIIIIlIll[12] = (-((-24642) & 29813)) & (-25089) & 32759;
        lIIIIlIll[13] = (-((-25459) & 26611)) & (-24579) & 26287;
        lIIIIlIll[14] = (-((-289) & 31221)) & (-2) & 31487;
        lIIIIlIll[15] = (-((-2337) & 11564)) & (-16993) & 30719;
        lIIIIlIll[16] = (-((-10247) & 15823)) & (-10241) & 16379;
        lIIIIlIll[17] = (-((-16969) & 19179)) & (-521) & 15355;
        lIIIIlIll[18] = (-8357) & 16365;
        lIIIIlIll[19] = (143 ^ 185) ^ (160 ^ 147);
        lIIIIlIll[20] = (-(((26 + 15) - (-22)) + 70)) & (-11265) & 11775;
        lIIIIlIll[21] = 136 ^ 145;
        lIIIIlIll[22] = (-((-3241) & 16061)) & (-1) & 14207;
        lIIIIlIll[23] = (-((-16915) & 31382)) & (-1297) & 16319;
        lIIIIlIll[24] = (-((-4121) & 31839)) & (-9) & 28287;
        lIIIIlIll[25] = (85 ^ 77) ^ (25 ^ 63);
        lIIIIlIll[26] = (111 ^ 89) ^ (45 ^ 4);
        lIIIIlIll[27] = (((56 + 3) - (-1)) + 108) ^ (((139 + 44) - 129) + 121);
        lIIIIlIll[28] = -" ".length();
        lIIIIlIll[29] = 123 ^ 94;
        lIIIIlIll[30] = (136 ^ 153) ^ (134 ^ 159);
        lIIIIlIll[31] = (253 ^ 139) ^ (248 ^ 163);
        lIIIIlIll[32] = 204 ^ 197;
        lIIIIlIll[33] = (52 ^ 69) ^ (113 ^ 10);
        lIIIIlIll[34] = (((153 + 109) - 237) + 146) ^ (((23 + 128) - 59) + 68);
        lIIIIlIll[35] = (-9093) & 12254;
        lIIIIlIll[36] = (-4705) & 8191;
        lIIIIlIll[37] = 118 ^ 122;
        lIIIIlIll[38] = (((53 + 1) - 40) + 113) ^ (31 ^ 95);
        lIIIIlIll[39] = (((48 + 130) - 77) + 44) ^ (((150 + 113) - 195) + 88);
        lIIIIlIll[40] = (-16900) & 20399;
        lIIIIlIll[41] = 172 ^ 162;
        lIIIIlIll[42] = (128 ^ 135) ^ (83 ^ 91);
        lIIIIlIll[43] = 33 ^ 49;
        lIIIIlIll[44] = (3 ^ 50) ^ (107 ^ 75);
        lIIIIlIll[45] = (((29 + 95) - (-9)) + 0) ^ (((83 + 117) - 145) + 96);
        lIIIIlIll[46] = (-((-753) & 27385)) & (-657) & 28669;
        lIIIIlIll[47] = "  ".length() ^ (137 ^ 152);
        lIIIIlIll[48] = (-((-16645) & 32207)) & (-34) & 15871;
        lIIIIlIll[49] = (-((-12865) & 32741)) & (-1) & 20469;
        lIIIIlIll[50] = (17 ^ 29) ^ (107 ^ 125);
        lIIIIlIll[51] = 98 ^ 118;
        lIIIIlIll[52] = (((43 + 162) - 106) + 81) ^ (((48 + 126) - 44) + 31);
        lIIIIlIll[53] = (((36 ^ 48) + (131 ^ 165)) - (163 ^ 139)) + ((77 + 72) - 107) + 141;
        lIIIIlIll[54] = (((88 + 9) - 40) + 74) ^ (((75 + 140) - 151) + 85);
        lIIIIlIll[55] = 36 ^ 51;
        lIIIIlIll[56] = 116 ^ 108;
        lIIIIlIll[57] = (-12309) & 13308;
        lIIIIlIll[58] = ((29 + 133) - 68) + 76;
        lIIIIlIll[59] = (-8272) & 12271;
        lIIIIlIll[60] = (-((-3802) & 32477)) & (-37) & 30711;
        lIIIIlIll[61] = (-((-2885) & 28487)) & (-4102) & 32703;
        lIIIIlIll[62] = (-16387) & 28886;
        lIIIIlIll[63] = (-((-210) & 499)) & (-1) & 15789;
        lIIIIlIll[64] = (117 ^ 77) ^ (18 ^ 82);
        lIIIIlIll[65] = ((71 + 139) - 65) + 5;
        lIIIIlIll[66] = (-((-14977) & 32679)) & (-1) & 32702;
        lIIIIlIll[67] = 111 ^ 11;
        lIIIIlIll[68] = (-((-1797) & 32685)) & (-1032) & 32239;
        lIIIIlIll[69] = (-((-2689) & 2995)) & (-16385) & 28670;
        lIIIIlIll[70] = (-((-17777) & 20339)) & (-6) & 27567;
        lIIIIlIll[71] = (-((-10003) & 26555)) & (-1) & 24559;
        lIIIIlIll[72] = (-((-837) & 32591)) & (-1) & 32654;
        lIIIIlIll[73] = (((64 + 39) - 16) + 49) ^ (((132 + 37) - 104) + 82);
        lIIIIlIll[74] = 153 ^ 133;
        lIIIIlIll[75] = 11 ^ 22;
        lIIIIlIll[76] = (-((-586) & 26203)) & (-33) & 28671;
        lIIIIlIll[77] = (-8965) & 12263;
        lIIIIlIll[78] = (-((-885) & 26493)) & (-1) & 28639;
        lIIIIlIll[79] = (-4099) & 7403;
        lIIIIlIll[80] = (80 ^ 95) ^ (62 ^ 47);
    }

    private static void aa() {
        if (llIlllllIII(llIllllIlll(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIIIIlIll[1]];
            iArr[lIIIIlIll[0]] = lIIIIlIll[20];
            if (llIlllIllll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIlIll[1]];
                iArr2[lIIIIlIll[0]] = lIIIIlIll[20];
                Inventory.getFirst(iArr2).interact(lIIIIlIlI[lIIIIlIll[43]]);
                Time.sleepTicks(lIIIIlIll[1]);
                "".length();
            }
        }
        if (llIllllIllI(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (llIlllIllll(npc.getName().contains(lIIIIlIlI[lIIIIlIll[75]]) ? 1 : 0) && llIllllIIIl(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIIIIlIll[1];
                    "".length();
                    return ((((14 + 40) - (-62)) + 50) ^ (((44 + 87) - 18) + 49)) == 0 ? ((((198 + 33) - 31) + 14) ^ (((96 + 70) - 58) + 20)) & (((((129 + 20) - 135) + 132) ^ (((155 + 128) - 153) + 66)) ^ (-" ".length())) : r0;
                }
                return lIIIIlIll[0];
            });
            String[] strArr = new String[lIIIIlIll[3]];
            strArr[lIIIIlIll[0]] = lIIIIlIlI[lIIIIlIll[44]];
            strArr[lIIIIlIll[1]] = lIIIIlIlI[lIIIIlIll[45]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (llIlllllIIl(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIIIIlIll[1];
                    "".length();
                    return (-" ".length()) >= (192 ^ 196) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIIlIll[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIIIIlIll[1]];
            iArr3[lIIIIlIll[0]] = lIIIIlIll[46];
            if (llIlllIllll(Equipment.contains(iArr3) ? 1 : 0) && llIllllIIIl(ad() ? 1 : 0)) {
                ae();
            }
            if (llIllllIIlI(nearest) && llIllllIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIIIIlIlI[lIIIIlIll[47]]);
                Time.sleepTicks(lIIIIlIll[4]);
                "".length();
            }
        }
    }

    private static boolean llIllllIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllllIIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        llIlllIlllI();
        llIlllIllIl();
        bu = lIIIIlIll[0];
        bv = new ArrayList();
        bw = new WorldArea(lIIIIlIll[76], lIIIIlIll[77], lIIIIlIll[51], lIIIIlIll[41], lIIIIlIll[0]);
        bx = new WorldPoint(lIIIIlIll[78], lIIIIlIll[79], lIIIIlIll[0]);
        by = null;
    }

    public static void ae() {
        if (llIllllIIlI(Widgets.get(lIIIIlIll[49], lIIIIlIll[50]))) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[51]];
            Widgets.get(lIIIIlIll[49], lIIIIlIll[50]).interact(lIIIIlIlI[lIIIIlIll[52]]);
            Time.sleepTicks(lIIIIlIll[7]);
            "".length();
        }
        if (llIllllIllI(Widgets.get(lIIIIlIll[49], lIIIIlIll[50])) && llIllllIIIl(Widgets.get(lIIIIlIll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIIIIlIll[1]);
            "".length();
            if (llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[19])) {
                Widgets.get(lIIIIlIll[53], lIIIIlIll[1]).getChild(lIIIIlIll[1]).interact(lIIIIlIlI[lIIIIlIll[54]]);
            }
            if (llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[32]) && llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[19])) {
                Widgets.get(lIIIIlIll[53], lIIIIlIll[1]).getChild(lIIIIlIll[3]).interact(lIIIIlIlI[lIIIIlIll[55]]);
            }
            if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[32]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[39])) {
                Widgets.get(lIIIIlIll[53], lIIIIlIll[1]).getChild(lIIIIlIll[4]).interact(lIIIIlIlI[lIIIIlIll[56]]);
            }
            if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[32])) {
                int[] iArr = new int[lIIIIlIll[1]];
                iArr[lIIIIlIll[0]] = lIIIIlIll[14];
                if (llIllllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIIIIlIll[53], lIIIIlIll[1]).getChild(lIIIIlIll[4]).interact(lIIIIlIlI[lIIIIlIll[21]]);
                }
            }
            if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[39])) {
                int[] iArr2 = new int[lIIIIlIll[1]];
                iArr2[lIIIIlIll[0]] = lIIIIlIll[14];
                if (llIlllIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIIIIlIll[53], lIIIIlIll[1]).getChild(lIIIIlIll[7]).interact(lIIIIlIlI[lIIIIlIll[50]]);
                }
            }
            Time.sleepTicks(lIIIIlIll[1]);
            "".length();
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            Y();
            "".length();
            if ((((80 ^ 7) ^ (29 ^ 21)) & (((238 ^ 182) ^ (87 ^ 80)) ^ (-" ".length()))) >= "   ".length()) {
                return ((((173 + 230) - 356) + 188) ^ (((17 + 67) - (-24)) + 29)) & (((44 ^ 39) ^ (252 ^ 149)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIIlIll[67];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIlllIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0210, code lost:
        if (llIlllIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028d, code lost:
        if (llIlllIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0366, code lost:
        if (llIlllIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        if (llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[21])) {
            int[] iArr = new int[lIIIIlIll[1]];
            iArr[lIIIIlIll[0]] = lIIIIlIll[9];
            if (llIlllIllll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIlIll[1]];
                iArr2[lIIIIlIll[0]] = lIIIIlIll[13];
                if (llIlllIllll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIIlIll[1]];
                    iArr3[lIIIIlIll[0]] = lIIIIlIll[11];
                    if (llIlllIllll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIIlIll[1]];
                        iArr4[lIIIIlIll[0]] = lIIIIlIll[14];
                        if (llIlllIllll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIIIlIll[1]];
                            iArr5[lIIIIlIll[0]] = lIIIIlIll[20];
                            if (llIlllIllll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIlIll[1]];
                                iArr6[lIIIIlIll[0]] = lIIIIlIll[46];
                                if (llIllllIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIIIlIll[1]];
                                    iArr7[lIIIIlIll[0]] = lIIIIlIll[46];
                                }
                                ?? r0 = lIIIIlIll[1];
                                "".length();
                                return (((74 ^ 112) ^ (204 ^ 191)) & (((121 ^ 49) ^ " ".length()) ^ (-" ".length()))) != 0 ? ((((83 + 165) - 64) + 4) ^ (((27 + 85) - 73) + 121)) & (((232 ^ 134) ^ (44 ^ 94)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIIIIlIll[0];
        } else if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[21]) && llIllllIIII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8])) {
            int[] iArr8 = new int[lIIIIlIll[1]];
            iArr8[lIIIIlIll[0]] = lIIIIlIll[13];
            if (llIlllIllll(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIIlIll[1]];
                iArr9[lIIIIlIll[0]] = lIIIIlIll[11];
                if (llIlllIllll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIlIll[1]];
                    iArr10[lIIIIlIll[0]] = lIIIIlIll[14];
                    if (llIlllIllll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIIlIll[1]];
                        iArr11[lIIIIlIll[0]] = lIIIIlIll[16];
                        if (llIlllIllll(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIIlIll[1]];
                            iArr12[lIIIIlIll[0]] = lIIIIlIll[46];
                            if (llIllllIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIIlIll[1]];
                                iArr13[lIIIIlIll[0]] = lIIIIlIll[46];
                            }
                            ?? r02 = lIIIIlIll[1];
                            "".length();
                            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIIIIlIll[0];
        } else if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8]) && llIllllIIIl(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIIIlIll[1]];
            iArr14[lIIIIlIll[0]] = lIIIIlIll[22];
            if (llIllllIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIIlIll[1]];
                iArr15[lIIIIlIll[0]] = lIIIIlIll[22];
            }
            int[] iArr16 = new int[lIIIIlIll[1]];
            iArr16[lIIIIlIll[0]] = lIIIIlIll[24];
            if (llIlllIllll(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIIlIll[1]];
                iArr17[lIIIIlIll[0]] = lIIIIlIll[25];
                if (llIlllIllll(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIIIlIll[1];
                    "".length();
                    return (-"  ".length()) >= 0 ? ((126 ^ 112) ^ (3 ^ 86)) & (((((172 + 104) - 145) + 99) ^ (((114 + 175) - 220) + 120)) ^ (-" ".length())) : r03;
                }
            }
            return lIIIIlIll[0];
        } else if (llIllllIlII(Skills.getLevel(Skill.MAGIC), lIIIIlIll[8]) && llIlllIllll(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIIIlIll[1]];
            iArr18[lIIIIlIll[0]] = lIIIIlIll[22];
            if (llIllllIIIl(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIIlIll[1]];
                iArr19[lIIIIlIll[0]] = lIIIIlIll[22];
            }
            int[] iArr20 = new int[lIIIIlIll[1]];
            iArr20[lIIIIlIll[0]] = lIIIIlIll[16];
            if (llIlllIllll(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIIlIll[1]];
                iArr21[lIIIIlIll[0]] = lIIIIlIll[23];
                if (llIlllIllll(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIIlIll[1]];
                    iArr22[lIIIIlIll[0]] = lIIIIlIll[23];
                    if (llIllllIlII(Bank.getFirst(iArr22).getQuantity(), lIIIIlIll[19])) {
                        int[] iArr23 = new int[lIIIIlIll[1]];
                        iArr23[lIIIIlIll[0]] = lIIIIlIll[24];
                        if (llIlllIllll(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIIIlIll[1]];
                            iArr24[lIIIIlIll[0]] = lIIIIlIll[25];
                            if (llIlllIllll(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIIIlIll[1];
                                "".length();
                                return "   ".length() == (129 ^ 133) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return lIIIIlIll[0];
        } else {
            return lIIIIlIll[0];
        }
    }

    private static boolean llIllllIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIIIlIll[0];
    }

    private static boolean llIllllIlII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlllllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIIIlIlI[lIIIIlIll[73]];
    }
}
