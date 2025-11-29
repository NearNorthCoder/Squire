package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.I  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/I.class */
public class I implements F {
    public static /* synthetic */ boolean bA;
    public static /* synthetic */ List<C0003d> bB;
    private static /* synthetic */ String[] llllIlIl;
    static /* synthetic */ WorldPoint bE;
    static /* synthetic */ WorldPoint bD;
    private static /* synthetic */ int[] llllIllI;
    static /* synthetic */ WorldArea bC;
    public static /* synthetic */ boolean bz;

    private static String llIIlIlllII(String lIIllIllllIlIIl, String lIIllIllllIlIII) {
        try {
            SecretKeySpec lIIllIllllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIllllIlIII.getBytes(StandardCharsets.UTF_8)), llllIllI[30]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIllI[3], lIIllIllllIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIllIllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIllllIlIlI) {
            lIIllIllllIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llllIllI[0];
    }

    public static void aa() {
        if (llIIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIllIIIll(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llllIlIl[llllIllI[41]];
            Movement.walkTo(bD);
            "".length();
            Time.sleepTicks(llllIllI[1]);
            "".length();
        }
        if (llIIllIIIIl(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llllIlIl[llllIllI[42]];
            ab();
        }
    }

    private static void llIIllIIIII() {
        llllIllI = new int[81];
        llllIllI[0] = ((19 ^ 78) ^ (91 ^ 87)) & (((5 ^ 20) ^ (37 ^ 101)) ^ (-" ".length()));
        llllIllI[1] = " ".length();
        llllIllI[2] = (167 ^ 133) ^ (208 ^ 192);
        llllIllI[3] = "  ".length();
        llllIllI[4] = "   ".length();
        llllIllI[5] = (-((-31450) & 32507)) & (-8273) & 14329;
        llllIllI[6] = 198 ^ 192;
        llllIllI[7] = (113 ^ 28) ^ (69 ^ 44);
        llllIllI[8] = (((118 + 107) - 221) + 140) ^ (((144 + 18) - 145) + 150);
        llllIllI[9] = (-((-25001) & 32186)) & (-16769) & 24511;
        llllIllI[10] = (-26660) & 28159;
        llllIllI[11] = (-31957) & 32511;
        llllIllI[12] = (-8203) & 10702;
        llllIllI[13] = (-((-14119) & 30583)) & (-9347) & 26367;
        llllIllI[14] = (-((-1065) & 15418)) & (-16577) & 31483;
        llllIllI[15] = (-((-822) & 3903)) & (-1) & 7581;
        llllIllI[16] = (-((-753) & 16381)) & (-16513) & 32703;
        llllIllI[17] = (-((-5397) & 24479)) & (-37) & 31743;
        llllIllI[18] = (-16515) & 24523;
        llllIllI[19] = (69 ^ 64) ^ ((51 ^ 98) & ((96 ^ 49) ^ (-1)));
        llllIllI[20] = (-((-4151) & 29239)) & (-7173) & 32639;
        llllIllI[21] = 126 ^ 103;
        llllIllI[22] = (-8341) & 9727;
        llllIllI[23] = (-20481) & 21036;
        llllIllI[24] = (-((-4149) & 12791)) & (-5121) & 14323;
        llllIllI[25] = 88 ^ 102;
        llllIllI[26] = (79 ^ 98) ^ (111 ^ 93);
        llllIllI[27] = 102 ^ 97;
        llllIllI[28] = -" ".length();
        llllIllI[29] = 21 ^ 48;
        llllIllI[30] = (91 ^ 7) ^ (11 ^ 95);
        llllIllI[31] = (((20 + 55) - (-42)) + 15) ^ (((28 + 43) - (-65)) + 33);
        llllIllI[32] = (((47 + 113) - 50) + 41) ^ (((40 + 82) - 29) + 65);
        llllIllI[33] = 144 ^ 154;
        llllIllI[34] = 25 ^ 18;
        llllIllI[35] = (-24613) & 27774;
        llllIllI[36] = (-((-2565) & 23045)) & (-8289) & 32255;
        llllIllI[37] = (230 ^ 170) ^ (106 ^ 42);
        llllIllI[38] = 65 ^ 126;
        llllIllI[39] = 93 ^ 80;
        llllIllI[40] = (-28755) & 32254;
        llllIllI[41] = (((33 + 60) - (-52)) + 33) ^ (((65 + 42) - 73) + 154);
        llllIllI[42] = (73 ^ 68) ^ "  ".length();
        llllIllI[43] = (20 ^ 10) ^ (78 ^ 64);
        llllIllI[44] = (3 ^ 87) ^ (215 ^ 146);
        llllIllI[45] = (221 ^ 129) ^ (88 ^ 22);
        llllIllI[46] = (-((-17637) & 20199)) & (-28825) & 32767;
        llllIllI[47] = 101 ^ 118;
        llllIllI[48] = (-9379) & 9654;
        llllIllI[49] = (-((-8193) & 27911)) & (-4225) & 24535;
        llllIllI[50] = 109 ^ 119;
        llllIllI[51] = (16 ^ 92) ^ (14 ^ 86);
        llllIllI[52] = 167 ^ 178;
        llllIllI[53] = (((47 ^ 58) + (57 ^ 75)) - (-(143 ^ 177))) + (132 ^ 128);
        llllIllI[54] = (98 ^ 23) ^ (194 ^ 161);
        llllIllI[55] = 101 ^ 114;
        llllIllI[56] = (219 ^ 163) ^ (50 ^ 82);
        llllIllI[57] = (-5137) & 6136;
        llllIllI[58] = ((133 + 77) - 132) + 92;
        llllIllI[59] = (-((-18465) & 22573)) & (-8260) & 16367;
        llllIllI[60] = (-4134) & 6133;
        llllIllI[61] = (-9219) & 12218;
        llllIllI[62] = (-3107) & 15606;
        llllIllI[63] = (-((-4265) & 21500)) & (-33) & 32767;
        llllIllI[64] = (((155 + 96) - 206) + 160) ^ (((160 + 172) - 221) + 70);
        llllIllI[65] = ((143 + 114) - 109) + 2;
        llllIllI[66] = (-((-8845) & 25327)) & (-1025) & 32506;
        llllIllI[67] = (53 ^ 90) ^ (150 ^ 157);
        llllIllI[68] = (-((-12649) & 15866)) & (-25089) & 28625;
        llllIllI[69] = (-((-10433) & 27123)) & (-4098) & 32767;
        llllIllI[70] = (-((-16426) & 22653)) & (-1) & 31227;
        llllIllI[71] = (-24705) & 32711;
        llllIllI[72] = (-1049) & 1948;
        llllIllI[73] = (244 ^ 190) ^ (5 ^ 84);
        llllIllI[74] = 71 ^ 91;
        llllIllI[75] = 29 ^ 0;
        llllIllI[76] = (-((-10307) & 27763)) & (-1) & 20478;
        llllIllI[77] = (-((-9217) & 26397)) & (-1) & 20479;
        llllIllI[78] = (-((-435) & 20923)) & (-33) & 23551;
        llllIllI[79] = (-((-7263) & 32607)) & (-4103) & 32751;
        llllIllI[80] = (((49 + 151) - 197) + 172) ^ (((123 + 87) - 122) + 89);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v398, types: [boolean] */
    public static void Z() {
        if (llIIllIIIIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llllIlIl[llllIllI[0]];
            C0001b.a(bB);
            if (llIIllIIIlI(bB.size(), llllIllI[1])) {
                System.out.println(llllIlIl[llllIllI[1]]);
                bz = llllIllI[0];
            }
        }
        if (llIIllIIIll(bz ? 1 : 0) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[2])) {
            if (llIIllIIIll(ac() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIllIIlII(nearest) && llIIllIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[3]];
                    C0000a.a(nearest);
                }
                if (llIIllIIlII(nearest) && llIIllIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[4]];
                    if (llIIllIIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIllI[5]);
                        "".length();
                        Time.sleepTicks(llllIllI[6]);
                        "".length();
                    }
                    if (llIIllIIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (llIIllIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIllI[7]);
                            "".length();
                        }
                        while (llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[8]) && llIIllIIIll(u.aV() ? 1 : 0)) {
                            u.aT();
                            Time.sleepTicks(llllIllI[1]);
                            "".length();
                            "".length();
                            if (0 != 0) {
                                return;
                            }
                        }
                        if (llIIllIIIll(ad() ? 1 : 0)) {
                            ag();
                            System.out.println(llllIlIl[llllIllI[7]]);
                            bz = llllIllI[1];
                            return;
                        }
                        if (llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[8])) {
                            int[] iArr = new int[llllIllI[1]];
                            iArr[llllIllI[0]] = llllIllI[9];
                            if (llIIllIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llllIllI[1]];
                                iArr2[llllIllI[0]] = llllIllI[9];
                                if (llIIllIIIlI(Inventory.getCount(iArr2), llllIllI[1])) {
                                    Bank.withdraw(llllIllI[9], llllIllI[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[llllIllI[1]];
                                        iArr3[llllIllI[0]] = llllIllI[9];
                                        if (llIIllIIlIl(Inventory.getCount(iArr3))) {
                                            ?? r0 = llllIllI[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllIllI[0];
                                    }, llllIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[llllIllI[1]];
                            iArr3[llllIllI[0]] = llllIllI[11];
                            if (llIIllIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llllIllI[1]];
                                iArr4[llllIllI[0]] = llllIllI[11];
                                if (llIIllIIIlI(Inventory.getCount(iArr4), llllIllI[1])) {
                                    Bank.withdraw(llllIllI[11], llllIllI[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[llllIllI[1]];
                                        iArr5[llllIllI[0]] = llllIllI[11];
                                        if (llIIllIIlIl(Inventory.getCount(iArr5))) {
                                            ?? r0 = llllIllI[1];
                                            "".length();
                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllIllI[0];
                                    }, llllIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[llllIllI[1]];
                            iArr5[llllIllI[0]] = llllIllI[13];
                            if (llIIllIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llllIllI[1]];
                                iArr6[llllIllI[0]] = llllIllI[13];
                                if (llIIllIIIlI(Inventory.getCount(iArr6), llllIllI[1])) {
                                    Bank.withdraw(llllIllI[13], llllIllI[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[llllIllI[1]];
                                        iArr7[llllIllI[0]] = llllIllI[13];
                                        if (llIIllIIlIl(Inventory.getCount(iArr7))) {
                                            ?? r0 = llllIllI[1];
                                            "".length();
                                            return (((149 ^ 133) ^ (36 ^ 111)) & (("  ".length() ^ (157 ^ 196)) ^ (-" ".length()))) < 0 ? ((57 ^ 38) ^ (255 ^ 164)) & (((96 ^ 76) ^ (196 ^ 172)) ^ (-" ".length())) : r0;
                                        }
                                        return llllIllI[0];
                                    }, llllIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[llllIllI[1]];
                            iArr7[llllIllI[0]] = llllIllI[14];
                            if (llIIllIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llllIllI[1]];
                                iArr8[llllIllI[0]] = llllIllI[14];
                                if (llIIllIIIlI(Inventory.getCount(iArr8), llllIllI[1])) {
                                    Bank.withdraw(llllIllI[14], llllIllI[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[llllIllI[1]];
                                        iArr9[llllIllI[0]] = llllIllI[14];
                                        if (llIIllIIlIl(Inventory.getCount(iArr9))) {
                                            ?? r0 = llllIllI[1];
                                            "".length();
                                            return "  ".length() <= 0 ? ((94 ^ 75) ^ "   ".length()) & (((167 ^ 146) ^ (60 ^ 31)) ^ (-" ".length())) : r0;
                                        }
                                        return llllIllI[0];
                                    }, llllIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[llllIllI[1]];
                            iArr9[llllIllI[0]] = llllIllI[16];
                            if (llIIllIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llllIllI[1]];
                                iArr10[llllIllI[0]] = llllIllI[16];
                                if (llIIllIIIlI(Inventory.getCount(iArr10), llllIllI[1])) {
                                    Bank.withdraw(llllIllI[16], llllIllI[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[llllIllI[1]];
                                        iArr11[llllIllI[0]] = llllIllI[16];
                                        if (llIIllIIlIl(Inventory.getCount(iArr11))) {
                                            ?? r0 = llllIllI[1];
                                            "".length();
                                            return " ".length() != " ".length() ? ((85 ^ 107) ^ (193 ^ 164)) & (((((163 + 22) - 171) + 206) ^ (((0 + 74) - 50) + 111)) ^ (-" ".length())) : r0;
                                        }
                                        return llllIllI[0];
                                    }, llllIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[llllIllI[1]];
                            iArr11[llllIllI[0]] = llllIllI[17];
                            if (llIIllIIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llllIllI[1]];
                                iArr12[llllIllI[0]] = llllIllI[17];
                                if (llIIllIIIll(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(llllIllI[17], llllIllI[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[llllIllI[1]];
                                        iArr13[llllIllI[0]] = llllIllI[17];
                                        return Inventory.contains(iArr13);
                                    }, llllIllI[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(llllIllI[18], llllIllI[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[llllIllI[1]];
                            iArr13[llllIllI[0]] = llllIllI[20];
                            if (llIIllIIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[llllIllI[1]];
                                iArr14[llllIllI[0]] = llllIllI[20];
                                if (llIIllIIIlI(Inventory.getCount(iArr14), llllIllI[1]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[21])) {
                                    Bank.withdrawAll(llllIllI[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[llllIllI[1]];
                                        iArr15[llllIllI[0]] = llllIllI[20];
                                        if (llIIllIIlIl(Inventory.getCount(iArr15))) {
                                            ?? r0 = llllIllI[1];
                                            "".length();
                                            return ((80 ^ 11) & ((70 ^ 29) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllIllI[0];
                                    }, llllIllI[5]);
                                    "".length();
                                }
                            }
                        }
                        if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[8])) {
                            int[] iArr15 = new int[llllIllI[1]];
                            iArr15[llllIllI[0]] = llllIllI[22];
                            if (llIIllIIIll(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(llllIllI[22], llllIllI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llllIllI[1]);
                                "".length();
                            }
                            if (llIIllIIIIl(bA ? 1 : 0)) {
                                Bank.withdrawAll(llllIllI[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llllIllI[1]);
                                "".length();
                                Bank.withdrawAll(llllIllI[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llllIllI[1]);
                                "".length();
                            }
                            Time.sleepTicks(llllIllI[4]);
                            "".length();
                            Bank.withdrawAll(llllIllI[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llllIllI[1]);
                            "".length();
                            Bank.withdrawAll(llllIllI[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(llllIllI[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llIIllIIIIl(ac() ? 1 : 0)) {
                if (llIIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[21])) {
                    if (llIIllIIIll(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIlIl[llllIllI[19]];
                        Movement.walkTo(bD);
                        "".length();
                        Time.sleepTicks(llllIllI[1]);
                        "".length();
                    }
                    if (llIIllIIIIl(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIlIl[llllIllI[6]];
                        ab();
                    }
                }
                if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[21]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[26])) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[27]];
                    if (llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(llllIllI[1]);
                        "".length();
                    }
                }
                if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[26]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[29])) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[30]];
                    if (llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(llllIllI[1]);
                        "".length();
                    }
                }
                if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[29]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[31])) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[32]];
                    if (llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(llllIllI[1]);
                        "".length();
                    }
                }
                if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[31]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[8])) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[33]];
                    if (llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(llllIllI[1]);
                        "".length();
                    }
                }
                if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[8])) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[34]];
                    if (llIIllIlIII(bE)) {
                        bE = new WorldPoint(llllIllI[35] + C0004e.c(llllIllI[1], llllIllI[7]), llllIllI[36], llllIllI[0]);
                    }
                    int[] iArr16 = new int[llllIllI[1]];
                    iArr16[llllIllI[0]] = llllIllI[22];
                    if (llIIllIIIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llllIllI[1]];
                        iArr17[llllIllI[0]] = llllIllI[22];
                        if (llIIllIIIll(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llllIllI[1]];
                            iArr18[llllIllI[0]] = llllIllI[22];
                            Inventory.getFirst(iArr18).interact(llllIlIl[llllIllI[37]]);
                            Time.sleepTicks(llllIllI[1]);
                            "".length();
                        }
                    }
                    if (llIIllIIIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[llllIllI[1]];
                    iArr19[llllIllI[0]] = llllIllI[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[llllIllI[1]];
                    iArr20[llllIllI[0]] = llllIllI[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (llIIllIIIll(bA ? 1 : 0) && llIIllIIlII(bE)) {
                        if (llIIllIIIll(Players.getLocal().getWorldLocation().equals(bE) ? 1 : 0)) {
                            AccBuilderBarrows.c = llllIlIl[llllIllI[39]];
                            Movement.walkTo(bE);
                            "".length();
                            Time.sleepTicks(llllIllI[1]);
                            "".length();
                        }
                        if (llIIllIIIIl(Players.getLocal().getWorldLocation().equals(bE) ? 1 : 0) && llIIllIIlII(first) && llIIllIIlII(first2) && llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIIllIllII(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = llllIllI[1];
                                    "".length();
                                    return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llllIllI[0];
                            }, llllIllI[10]);
                            "".length();
                        }
                    }
                    if (llIIllIIIIl(bA ? 1 : 0)) {
                        if (llIIllIIlII(first) && llIIllIIlII(first2) && llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIIllIllII(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = llllIllI[1];
                                    "".length();
                                    return (182 ^ 178) < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llllIllI[0];
                            }, llllIllI[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                                ?? r0 = llllIllI[1];
                                "".length();
                                return ((72 ^ 97) ^ (127 ^ 82)) < (((((169 + 109) - 107) + 57) ^ (((108 + 12) - 89) + 101)) & (((((164 + 21) - 61) + 42) ^ (((121 + 100) - 148) + 125)) ^ (-" ".length()))) ? ((233 ^ 194) ^ (24 ^ 108)) & (((245 ^ 154) ^ (136 ^ 184)) ^ (-" ".length())) : r0;
                            }
                            return llllIllI[0];
                        }, llllIllI[40]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean llIIllIllII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIllIIIll(int i) {
        return i == 0;
    }

    private static void ab() {
        if (llIIllIlIlI(llIIllIlIIl(C0004e.v(), 30.0d))) {
            int[] iArr = new int[llllIllI[1]];
            iArr[llllIllI[0]] = llllIllI[20];
            if (llIIllIIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllIllI[1]];
                iArr2[llllIllI[0]] = llllIllI[20];
                Inventory.getFirst(iArr2).interact(llllIlIl[llllIllI[43]]);
                Time.sleepTicks(llllIllI[1]);
                "".length();
            }
        }
        if (llIIllIlIII(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (llIIllIIIIl(npc.getName().contains(llllIlIl[llllIllI[75]]) ? 1 : 0) && llIIllIIIll(npc.isDead() ? 1 : 0)) {
                    ?? r0 = llllIllI[1];
                    "".length();
                    return (187 ^ 191) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIllI[0];
            });
            String[] strArr = new String[llllIllI[3]];
            strArr[llllIllI[0]] = llllIlIl[llllIllI[44]];
            strArr[llllIllI[1]] = llllIlIl[llllIllI[45]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (llIIllIlIll(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = llllIllI[1];
                    "".length();
                    return (((172 ^ 167) ^ (37 ^ 23)) & (((((79 + 39) - 68) + 136) ^ (((3 + 16) - (-56)) + 56)) ^ (-" ".length()))) != 0 ? ((100 ^ 70) ^ (84 ^ 75)) & (((142 ^ 165) ^ (209 ^ 199)) ^ (-" ".length())) : r0;
                }
                return llllIllI[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[llllIllI[1]];
            iArr3[llllIllI[0]] = llllIllI[46];
            if (llIIllIIIIl(Equipment.contains(iArr3) ? 1 : 0) && llIIllIIIll(ae() ? 1 : 0)) {
                af();
            }
            if (llIIllIIlII(nearest) && llIIllIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(llllIlIl[llllIllI[47]]);
                Time.sleepTicks(llllIllI[4]);
                "".length();
            }
        }
    }

    public static void af() {
        if (llIIllIIlII(Widgets.get(llllIllI[49], llllIllI[50]))) {
            AccBuilderBarrows.c = llllIlIl[llllIllI[51]];
            Widgets.get(llllIllI[49], llllIllI[50]).interact(llllIlIl[llllIllI[52]]);
            Time.sleepTicks(llllIllI[7]);
            "".length();
        }
        if (llIIllIlIII(Widgets.get(llllIllI[49], llllIllI[50])) && llIIllIIIll(Widgets.get(llllIllI[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(llllIllI[1]);
            "".length();
            if (llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[19])) {
                Widgets.get(llllIllI[53], llllIllI[1]).getChild(llllIllI[1]).interact(llllIlIl[llllIllI[54]]);
            }
            if (llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[32]) && llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[19])) {
                Widgets.get(llllIllI[53], llllIllI[1]).getChild(llllIllI[3]).interact(llllIlIl[llllIllI[55]]);
            }
            if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[32]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[39])) {
                Widgets.get(llllIllI[53], llllIllI[1]).getChild(llllIllI[4]).interact(llllIlIl[llllIllI[56]]);
            }
            if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[32])) {
                int[] iArr = new int[llllIllI[1]];
                iArr[llllIllI[0]] = llllIllI[14];
                if (llIIllIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(llllIllI[53], llllIllI[1]).getChild(llllIllI[4]).interact(llllIlIl[llllIllI[21]]);
                }
            }
            if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[39])) {
                int[] iArr2 = new int[llllIllI[1]];
                iArr2[llllIllI[0]] = llllIllI[14];
                if (llIIllIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(llllIllI[53], llllIllI[1]).getChild(llllIllI[7]).interact(llllIlIl[llllIllI[50]]);
                }
            }
            Time.sleepTicks(llllIllI[1]);
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIIllIIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e0, code lost:
        if (llIIllIIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02b5, code lost:
        if (llIIllIIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0374, code lost:
        if (llIIllIIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[21])) {
            int[] iArr = new int[llllIllI[1]];
            iArr[llllIllI[0]] = llllIllI[9];
            if (llIIllIIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllIllI[1]];
                iArr2[llllIllI[0]] = llllIllI[13];
                if (llIIllIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llllIllI[1]];
                    iArr3[llllIllI[0]] = llllIllI[11];
                    if (llIIllIIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llllIllI[1]];
                        iArr4[llllIllI[0]] = llllIllI[14];
                        if (llIIllIIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llllIllI[1]];
                            iArr5[llllIllI[0]] = llllIllI[20];
                            if (llIIllIIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llllIllI[1]];
                                iArr6[llllIllI[0]] = llllIllI[46];
                                if (llIIllIIIll(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llllIllI[1]];
                                    iArr7[llllIllI[0]] = llllIllI[46];
                                }
                                ?? r0 = llllIllI[1];
                                "".length();
                                return " ".length() == ("   ".length() & ("   ".length() ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llllIllI[0];
        } else if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[21]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[8])) {
            int[] iArr8 = new int[llllIllI[1]];
            iArr8[llllIllI[0]] = llllIllI[13];
            if (llIIllIIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llllIllI[1]];
                iArr9[llllIllI[0]] = llllIllI[11];
                if (llIIllIIIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llllIllI[1]];
                    iArr10[llllIllI[0]] = llllIllI[14];
                    if (llIIllIIIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llllIllI[1]];
                        iArr11[llllIllI[0]] = llllIllI[16];
                        if (llIIllIIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llllIllI[1]];
                            iArr12[llllIllI[0]] = llllIllI[46];
                            if (llIIllIIIll(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llllIllI[1]];
                                iArr13[llllIllI[0]] = llllIllI[46];
                            }
                            ?? r02 = llllIllI[1];
                            "".length();
                            return (((((40 + 14) - 4) + 134) ^ (((82 + 8) - 36) + 84)) & (((((23 + 71) - (-11)) + 43) ^ (((65 + 127) - 85) + 59)) ^ (-" ".length()))) == (-" ".length()) ? ((((121 + 208) - 143) + 61) ^ (((7 + 129) - 87) + 112)) & (((123 ^ 40) ^ (153 ^ 156)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return llllIllI[0];
        } else if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[8]) && llIIllIIIll(bA ? 1 : 0)) {
            int[] iArr14 = new int[llllIllI[1]];
            iArr14[llllIllI[0]] = llllIllI[22];
            if (llIIllIIIll(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llllIllI[1]];
                iArr15[llllIllI[0]] = llllIllI[22];
            }
            int[] iArr16 = new int[llllIllI[1]];
            iArr16[llllIllI[0]] = llllIllI[24];
            if (llIIllIIIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llllIllI[1]];
                iArr17[llllIllI[0]] = llllIllI[38];
                if (llIIllIIIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llllIllI[1];
                    "".length();
                    return "   ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return llllIllI[0];
        } else if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[8]) && llIIllIIIIl(bA ? 1 : 0)) {
            int[] iArr18 = new int[llllIllI[1]];
            iArr18[llllIllI[0]] = llllIllI[22];
            if (llIIllIIIll(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llllIllI[1]];
                iArr19[llllIllI[0]] = llllIllI[22];
            }
            int[] iArr20 = new int[llllIllI[1]];
            iArr20[llllIllI[0]] = llllIllI[16];
            if (llIIllIIIIl(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llllIllI[1]];
                iArr21[llllIllI[0]] = llllIllI[23];
                if (llIIllIIIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllIllI[1]];
                    iArr22[llllIllI[0]] = llllIllI[23];
                    if (llIIllIIllI(Inventory.getFirst(iArr22).getQuantity(), llllIllI[19])) {
                        int[] iArr23 = new int[llllIllI[1]];
                        iArr23[llllIllI[0]] = llllIllI[24];
                        if (llIIllIIIIl(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llllIllI[1]];
                            iArr24[llllIllI[0]] = llllIllI[38];
                            if (llIIllIIIIl(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llllIllI[1];
                                "".length();
                                return 0 != 0 ? ((4 ^ 11) ^ (254 ^ 146)) & (((((175 + 171) - 153) + 2) ^ (((11 + 151) - 11) + 9)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return llllIllI[0];
        } else {
            return llllIllI[0];
        }
    }

    private static boolean llIIllIIIlI(int i, int i2) {
        return i < i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            Z();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (64 ^ 81) & ((78 ^ 95) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llllIllI[67];
    }

    private static int llIIllIlIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIllIIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[2])) {
            ?? r0 = llllIllI[1];
            "".length();
            return ((102 ^ 114) ^ (63 ^ 47)) == (((156 ^ 177) ^ (63 ^ 90)) & (((187 ^ 132) ^ (21 ^ 98)) ^ (-" ".length()))) ? ((199 ^ 180) ^ (239 ^ 138)) & (((((15 + 172) - 112) + 114) ^ (((131 + 167) - 210) + 83)) ^ (-" ".length())) : r0;
        }
        return llllIllI[0];
    }

    private static boolean llIIllIIllI(int i, int i2) {
        return i >= i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llllIlIl[llllIllI[73]];
    }

    private static boolean llIIllIlIlI(int i) {
        return i < 0;
    }

    private static String llIIlIlllIl(String lIIllIlllllIllI, String lIIllIlllllIlIl) {
        try {
            SecretKeySpec lIIllIllllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIlllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIllllllIII = Cipher.getInstance("Blowfish");
            lIIllIllllllIII.init(llllIllI[3], lIIllIllllllIIl);
            return new String(lIIllIllllllIII.doFinal(Base64.getDecoder().decode(lIIllIlllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIlllllIlll) {
            lIIllIlllllIlll.printStackTrace();
            return null;
        }
    }

    private static void llIIlIlllll() {
        llllIlIl = new String[llllIllI[80]];
        llllIlIl[llllIllI[0]] = llIIlIlllII("tzr0dam8BDPmHdn6uFGB4w==", "poULN");
        llllIlIl[llllIllI[1]] = llIIlIlllIl("uB5eh3Rm9ETbAyRDICShdPhY2/Wt0T1HVZ0FqSJHkbPiNRATN6TV92cMkm2crXOhYMbG60c127Q=", "RgWWG");
        llllIlIl[llllIllI[3]] = llIIlIlllII("GJI9a/GEtqpu7H6qb8Dn8BaekXEdzamq", "aNhLZ");
        llllIlIl[llllIllI[4]] = llIIlIlllIl("3Fyc/zG9XqhUwQRvWlxyN0e/RQ/5iRKt", "aWinP");
        llllIlIl[llllIllI[7]] = llIIlIllllI("DS1xMz4/aDw7PykhPzVsKT0hIiAzLSJ+bCk/OCYvMiE/NWwuJ3EQGQMBHxU=", "ZHQRL");
        llllIlIl[llllIllI[19]] = llIIlIlllIl("q1A9rWbvv7GOeoKoL9xQqw==", "NmXQa");
        llllIlIl[llllIllI[6]] = llIIlIlllII("bweKrhNbT6pbliwM/lw50A==", "iUTPB");
        llllIlIl[llllIllI[27]] = llIIlIlllIl("SuudtT0trEEoGAPd5AK7rL1d5weUU9Uy", "YBhea");
        llllIlIl[llllIllI[30]] = llIIlIlllIl("nV0hIeF3d1dcPe4vcd1Tau8saOyINFAr", "gBcbN");
        llllIlIl[llllIllI[32]] = llIIlIllllI("JhY7MywLEGghJAkbMWcxABst", "ewHGE");
        llllIlIl[llllIllI[33]] = llIIlIlllIl("0CVp0gA/6W1UAe+kNbU3IdaaJGomPCOP", "Ztphw");
        llllIlIl[llllIllI[34]] = llIIlIlllIl("WALEo61sCB4=", "xQEue");
        llllIlIl[llllIllI[37]] = llIIlIlllIl("vSdWTblVW5w=", "yXJjE");
        llllIlIl[llllIllI[39]] = llIIlIlllIl("lNVOngcL7PGhsci7sohKhKc/DAOAhFBZ", "yAfnv");
        llllIlIl[llllIllI[41]] = llIIlIllllI("OCg1cjUZaSA9NgU=", "vICRA");
        llllIlIl[llllIllI[42]] = llIIlIllllI("FyACGyY9PRgdZTU7AQk=", "VTvzE");
        llllIlIl[llllIllI[43]] = llIIlIllllI("AycB", "FFurd");
        llllIlIl[llllIllI[44]] = llIIlIllllI("GyoV", "XEbkT");
        llllIlIl[llllIllI[45]] = llIIlIlllIl("nW4mWIog4Tg=", "XLtpO");
        llllIlIl[llllIllI[47]] = llIIlIllllI("JxsVDjoN", "foaoY");
        llllIlIl[llllIllI[51]] = llIIlIlllII("7Di9bqOTSqeze0EqEnw7ZOz5Y61/JMMD", "aVJJQ");
        llllIlIl[llllIllI[52]] = llIIlIlllII("3NA4VQDe0ZTbHvPI1hhT9A==", "jCFML");
        llllIlIl[llllIllI[54]] = llIIlIlllIl("y9En0k1W9L10CNdc2SR30Q==", "jYuON");
        llllIlIl[llllIllI[55]] = llIIlIlllII("NwKuMI7ahwbn65cWt8y/Cw==", "gVHvs");
        llllIlIl[llllIllI[56]] = llIIlIlllII("uHSenNcViq1ZkmLzaFL+IQ==", "hpoAF");
        llllIlIl[llllIllI[21]] = llIIlIlllIl("w8/xgMRJvWaP5J75m1VQ3w==", "Qmojn");
        llllIlIl[llllIllI[50]] = llIIlIlllII("5dyOJ0f6N8WYHwwtRURkRw==", "VgXVJ");
        llllIlIl[llllIllI[73]] = llIIlIlllII("9wwlWzsDYf89Hr70owXH/A==", "leHuU");
        llllIlIl[llllIllI[74]] = llIIlIlllII("AgNZZ9OFqPHIF2lB01KBUFQLJMuvi2YT", "TMgIo");
        llllIlIl[llllIllI[75]] = llIIlIllllI("IBs0", "ctCcn");
    }

    private static boolean llIIllIlIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIllIlIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ae() {
        if (llIIllIIlll(Vars.getBit(llllIllI[48]), llllIllI[1]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[19])) {
            return llllIllI[1];
        }
        if (llIIllIIlll(Vars.getBit(llllIllI[48]), llllIllI[3]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[32]) && llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[19])) {
            return llllIllI[1];
        }
        if (llIIllIIlll(Vars.getBit(llllIllI[48]), llllIllI[4]) && llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[32]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[39])) {
            return llllIllI[1];
        }
        if (llIIllIIlll(Vars.getBit(llllIllI[48]), llllIllI[4]) && llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[32])) {
            int[] iArr = new int[llllIllI[1]];
            iArr[llllIllI[0]] = llllIllI[14];
            if (llIIllIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                return llllIllI[1];
            }
        }
        if (llIIllIIlll(Vars.getBit(llllIllI[48]), llllIllI[7]) && llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[39])) {
            int[] iArr2 = new int[llllIllI[1]];
            iArr2[llllIllI[0]] = llllIllI[14];
            if (llIIllIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return llllIllI[1];
            }
        }
        return llllIllI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIIllIIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ce, code lost:
        if (llIIllIIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0252, code lost:
        if (llIIllIIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0349, code lost:
        if (llIIllIIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean ad() {
        if (llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[21])) {
            int[] iArr = new int[llllIllI[1]];
            iArr[llllIllI[0]] = llllIllI[9];
            if (llIIllIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllIllI[1]];
                iArr2[llllIllI[0]] = llllIllI[13];
                if (llIIllIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llllIllI[1]];
                    iArr3[llllIllI[0]] = llllIllI[11];
                    if (llIIllIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llllIllI[1]];
                        iArr4[llllIllI[0]] = llllIllI[14];
                        if (llIIllIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llllIllI[1]];
                            iArr5[llllIllI[0]] = llllIllI[20];
                            if (llIIllIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llllIllI[1]];
                                iArr6[llllIllI[0]] = llllIllI[46];
                                if (llIIllIIIll(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llllIllI[1]];
                                    iArr7[llllIllI[0]] = llllIllI[46];
                                }
                                ?? r0 = llllIllI[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llllIllI[0];
        } else if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[21]) && llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[8])) {
            int[] iArr8 = new int[llllIllI[1]];
            iArr8[llllIllI[0]] = llllIllI[13];
            if (llIIllIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llllIllI[1]];
                iArr9[llllIllI[0]] = llllIllI[11];
                if (llIIllIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llllIllI[1]];
                    iArr10[llllIllI[0]] = llllIllI[14];
                    if (llIIllIIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llllIllI[1]];
                        iArr11[llllIllI[0]] = llllIllI[16];
                        if (llIIllIIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llllIllI[1]];
                            iArr12[llllIllI[0]] = llllIllI[46];
                            if (llIIllIIIll(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llllIllI[1]];
                                iArr13[llllIllI[0]] = llllIllI[46];
                            }
                            ?? r02 = llllIllI[1];
                            "".length();
                            return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return llllIllI[0];
        } else if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[8]) && llIIllIIIll(bA ? 1 : 0)) {
            int[] iArr14 = new int[llllIllI[1]];
            iArr14[llllIllI[0]] = llllIllI[22];
            if (llIIllIIIll(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llllIllI[1]];
                iArr15[llllIllI[0]] = llllIllI[22];
            }
            int[] iArr16 = new int[llllIllI[1]];
            iArr16[llllIllI[0]] = llllIllI[24];
            if (llIIllIIIIl(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llllIllI[1]];
                iArr17[llllIllI[0]] = llllIllI[25];
                if (llIIllIIIIl(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llllIllI[1];
                    "".length();
                    return "  ".length() <= (((78 ^ 37) ^ (4 ^ 49)) & (((233 ^ 179) ^ (134 ^ 130)) ^ (-" ".length()))) ? ((((0 + 20) - (-6)) + 138) ^ (((164 + 183) - 251) + 88)) & (((116 ^ 61) ^ (62 ^ 107)) ^ (-" ".length())) : r03;
                }
            }
            return llllIllI[0];
        } else if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[8]) && llIIllIIIIl(bA ? 1 : 0)) {
            int[] iArr18 = new int[llllIllI[1]];
            iArr18[llllIllI[0]] = llllIllI[22];
            if (llIIllIIIll(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llllIllI[1]];
                iArr19[llllIllI[0]] = llllIllI[22];
            }
            int[] iArr20 = new int[llllIllI[1]];
            iArr20[llllIllI[0]] = llllIllI[16];
            if (llIIllIIIIl(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llllIllI[1]];
                iArr21[llllIllI[0]] = llllIllI[23];
                if (llIIllIIIIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllIllI[1]];
                    iArr22[llllIllI[0]] = llllIllI[23];
                    if (llIIllIIllI(Bank.getFirst(iArr22).getQuantity(), llllIllI[19])) {
                        int[] iArr23 = new int[llllIllI[1]];
                        iArr23[llllIllI[0]] = llllIllI[24];
                        if (llIIllIIIIl(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llllIllI[1]];
                            iArr24[llllIllI[0]] = llllIllI[25];
                            if (llIIllIIIIl(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llllIllI[1];
                                "".length();
                                return (-" ".length()) >= (125 ^ 121) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return llllIllI[0];
        } else {
            return llllIllI[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        llIIllIIIII();
        llIIlIlllll();
        bA = llllIllI[0];
        bB = new ArrayList();
        bC = new WorldArea(llllIllI[76], llllIllI[77], llllIllI[51], llllIllI[41], llllIllI[0]);
        bD = new WorldPoint(llllIllI[78], llllIllI[79], llllIllI[0]);
        bE = null;
    }

    private static boolean llIIllIIlll(int i, int i2) {
        return i == i2;
    }

    private static String llIIlIllllI(String lIIlllIIIIIlIll, String lIIlllIIIIIlIlI) {
        String lIIlllIIIIIlIll2 = new String(Base64.getDecoder().decode(lIIlllIIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlllIIIIIlIIl = new StringBuilder();
        char[] lIIlllIIIIIlIII = lIIlllIIIIIlIlI.toCharArray();
        int lIIlllIIIIIIlll = llllIllI[0];
        char[] charArray = lIIlllIIIIIlIll2.toCharArray();
        int length = charArray.length;
        int i = llllIllI[0];
        while (llIIllIIIlI(i, length)) {
            char lIIlllIIIIIllII = charArray[i];
            lIIlllIIIIIlIIl.append((char) (lIIlllIIIIIllII ^ lIIlllIIIIIlIII[lIIlllIIIIIIlll % lIIlllIIIIIlIII.length]));
            "".length();
            lIIlllIIIIIIlll++;
            i++;
            "".length();
            if (((151 ^ 171) & ((1 ^ 61) ^ (-1))) > ((14 ^ 82) & ((95 ^ 3) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lIIlllIIIIIlIIl);
    }

    private static boolean llIIllIIIIl(int i) {
        return i != 0;
    }

    private static void ag() {
        if (llIIllIIIlI(Skills.getLevel(Skill.MAGIC), llllIllI[8])) {
            int[] iArr = new int[llllIllI[1]];
            iArr[llllIllI[0]] = llllIllI[16];
            if (llIIllIIIll(Bank.contains(iArr) ? 1 : 0)) {
                bB.add(new C0003d(llllIllI[16], llllIllI[57], llllIllI[58]));
                "".length();
            }
            int[] iArr2 = new int[llllIllI[1]];
            iArr2[llllIllI[0]] = llllIllI[9];
            if (llIIllIIIll(Bank.contains(iArr2) ? 1 : 0)) {
                bB.add(new C0003d(llllIllI[9], llllIllI[59], llllIllI[6]));
                "".length();
            }
            int[] iArr3 = new int[llllIllI[1]];
            iArr3[llllIllI[0]] = llllIllI[11];
            if (llIIllIIIll(Bank.contains(iArr3) ? 1 : 0)) {
                bB.add(new C0003d(llllIllI[11], llllIllI[60], llllIllI[6]));
                "".length();
            }
            int[] iArr4 = new int[llllIllI[1]];
            iArr4[llllIllI[0]] = llllIllI[13];
            if (llIIllIIIll(Bank.contains(iArr4) ? 1 : 0)) {
                bB.add(new C0003d(llllIllI[13], llllIllI[61], llllIllI[6]));
                "".length();
            }
            int[] iArr5 = new int[llllIllI[1]];
            iArr5[llllIllI[0]] = llllIllI[14];
            if (llIIllIIIll(Bank.contains(iArr5) ? 1 : 0)) {
                bB.add(new C0003d(llllIllI[14], llllIllI[5], llllIllI[6]));
                "".length();
            }
            int[] iArr6 = new int[llllIllI[1]];
            iArr6[llllIllI[0]] = llllIllI[46];
            if (llIIllIIIll(Bank.contains(iArr6) ? 1 : 0)) {
                bB.add(new C0003d(llllIllI[46], llllIllI[1], C0004e.c(llllIllI[62], llllIllI[63])));
                "".length();
            }
        }
        if (llIIllIIllI(Skills.getLevel(Skill.MAGIC), llllIllI[8])) {
            int[] iArr7 = new int[llllIllI[1]];
            iArr7[llllIllI[0]] = llllIllI[24];
            if (llIIllIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llllIllI[1]];
                iArr8[llllIllI[0]] = llllIllI[24];
                if (llIIllIIIlI(Bank.getFirst(iArr8).getQuantity(), llllIllI[61])) {
                    int i = llllIllI[24];
                    int i2 = llllIllI[61];
                    int[] iArr9 = new int[llllIllI[1]];
                    iArr9[llllIllI[0]] = llllIllI[24];
                    bB.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), llllIllI[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[llllIllI[1]];
            iArr10[llllIllI[0]] = llllIllI[24];
            if (llIIllIIIll(Bank.contains(iArr10) ? 1 : 0)) {
                bB.add(new C0003d(llllIllI[24], llllIllI[61], llllIllI[64]));
                "".length();
            }
            int[] iArr11 = new int[llllIllI[1]];
            iArr11[llllIllI[0]] = llllIllI[25];
            if (llIIllIIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llllIllI[1]];
                iArr12[llllIllI[0]] = llllIllI[25];
                if (llIIllIIIlI(Bank.getFirst(iArr12).getQuantity(), llllIllI[61])) {
                    int i3 = llllIllI[25];
                    int i4 = llllIllI[61];
                    int[] iArr13 = new int[llllIllI[1]];
                    iArr13[llllIllI[0]] = llllIllI[25];
                    bB.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), llllIllI[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[llllIllI[1]];
            iArr14[llllIllI[0]] = llllIllI[25];
            if (llIIllIIIll(Bank.contains(iArr14) ? 1 : 0)) {
                bB.add(new C0003d(llllIllI[25], llllIllI[61], llllIllI[65]));
                "".length();
            }
            int[] iArr15 = new int[llllIllI[1]];
            iArr15[llllIllI[0]] = llllIllI[22];
            if (llIIllIIIll(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llllIllI[1]];
                iArr16[llllIllI[0]] = llllIllI[22];
                if (llIIllIIIll(Equipment.contains(iArr16) ? 1 : 0)) {
                    bB.add(new C0003d(llllIllI[22], llllIllI[1], llllIllI[66]));
                    "".length();
                }
            }
            if (llIIllIIIIl(bA ? 1 : 0)) {
                int[] iArr17 = new int[llllIllI[1]];
                iArr17[llllIllI[0]] = llllIllI[16];
                if (llIIllIIIIl(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llllIllI[1]];
                    iArr18[llllIllI[0]] = llllIllI[16];
                    if (llIIllIIIlI(Bank.getFirst(iArr18).getQuantity(), llllIllI[61])) {
                        int i5 = llllIllI[16];
                        int i6 = llllIllI[61];
                        int[] iArr19 = new int[llllIllI[1]];
                        iArr19[llllIllI[0]] = llllIllI[16];
                        bB.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), llllIllI[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[llllIllI[1]];
                iArr20[llllIllI[0]] = llllIllI[16];
                if (llIIllIIIll(Bank.contains(iArr20) ? 1 : 0)) {
                    bB.add(new C0003d(llllIllI[16], llllIllI[61], llllIllI[58]));
                    "".length();
                }
                int[] iArr21 = new int[llllIllI[1]];
                iArr21[llllIllI[0]] = llllIllI[23];
                if (llIIllIIIIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllIllI[1]];
                    iArr22[llllIllI[0]] = llllIllI[23];
                    if (llIIllIIIlI(Bank.getFirst(iArr22).getQuantity(), llllIllI[66])) {
                        int i7 = llllIllI[23];
                        int i8 = llllIllI[66];
                        int[] iArr23 = new int[llllIllI[1]];
                        iArr23[llllIllI[0]] = llllIllI[23];
                        bB.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), llllIllI[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[llllIllI[1]];
                iArr24[llllIllI[0]] = llllIllI[23];
                if (llIIllIIIll(Bank.contains(iArr24) ? 1 : 0)) {
                    bB.add(new C0003d(llllIllI[23], llllIllI[66], llllIllI[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[llllIllI[1]];
        iArr25[llllIllI[0]] = llllIllI[20];
        if (llIIllIIIll(Bank.contains(iArr25) ? 1 : 0)) {
            bB.add(new C0003d(llllIllI[20], llllIllI[67], llllIllI[68]));
            "".length();
        }
        if (llIIllIIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llllIlIl[llllIllI[74]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(llllIllI[69], llllIllI[19], llllIllI[70]));
            "".length();
        }
        int[] iArr26 = new int[llllIllI[1]];
        iArr26[llllIllI[0]] = llllIllI[71];
        if (llIIllIIIll(Bank.contains(iArr26) ? 1 : 0)) {
            bB.add(new C0003d(llllIllI[71], llllIllI[33], llllIllI[72]));
            "".length();
        }
        int[] iArr27 = new int[llllIllI[1]];
        iArr27[llllIllI[0]] = llllIllI[18];
        if (llIIllIIIll(Bank.contains(iArr27) ? 1 : 0)) {
            bB.add(new C0003d(llllIllI[18], llllIllI[33], llllIllI[72]));
            "".length();
        }
    }
}
