/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;

public class ag
implements ac {
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] llIlIllIIl;
    public static final /* synthetic */ int nc;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIlIllIlI;
    public static final /* synthetic */ int nd;

    private static String lIllIlIIIIlll(String llllllllllllllllllIIIllIlIIlIlll, String llllllllllllllllllIIIllIlIIlIllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIllIlIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIllIlIIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIllIlIIllIIl.init(llIlIllIlI[4], llllllllllllllllllIIIllIlIIllIlI);
            return new String(llllllllllllllllllIIIllIlIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIllIlIIllIII) {
            llllllllllllllllllIIIllIlIIllIII.printStackTrace();
            return null;
        }
    }

    @Override
    public String ag() {
        return llIlIllIIl[llIlIllIlI[44]];
    }

    private static void lIllIlIIIlIlI() {
        llIlIllIlI = new int[47];
        ag.llIlIllIlI[0] = (0x29 ^ 0x1F ^ (0x22 ^ 0x4E)) & (4 ^ 0x68 ^ (0x3F ^ 9) ^ -" ".length());
        ag.llIlIllIlI[1] = " ".length();
        ag.llIlIllIlI[2] = 0x8C ^ 0xB4;
        ag.llIlIllIlI[3] = -(0xFFFFEF19 & 0x70FF) & (0xFFFFE7FF & 0x7BFB);
        ag.llIlIllIlI[4] = "  ".length();
        ag.llIlIllIlI[5] = "   ".length();
        ag.llIlIllIlI[6] = -(0xFFFFFEEC & 0x2937) & (0xFFFFFFAF & 0x3BFB);
        ag.llIlIllIlI[7] = 0x55 ^ 0x51;
        ag.llIlIllIlI[8] = 0xFFFFA7EF & 0x5EFF;
        ag.llIlIllIlI[9] = 0xFFFFBFF9 & 0x46FF;
        ag.llIlIllIlI[10] = 51 + 170 - 96 + 57 ^ 34 + 115 - 79 + 109;
        ag.llIlIllIlI[11] = 0xAB ^ 0xAD;
        ag.llIlIllIlI[12] = 0x2B ^ 0x2C;
        ag.llIlIllIlI[13] = 0x24 ^ 0x2C;
        ag.llIlIllIlI[14] = 0xFFFFE2B2 & 0xFFDD;
        ag.llIlIllIlI[15] = 0x46 ^ 0x4A;
        ag.llIlIllIlI[16] = 0xB9 ^ 0xB0;
        ag.llIlIllIlI[17] = 0x9E ^ 0xBF;
        ag.llIlIllIlI[18] = 0x47 ^ 0x26 ^ (0x17 ^ 0x7C);
        ag.llIlIllIlI[19] = 0x3C ^ 0x37;
        ag.llIlIllIlI[20] = 0x88 ^ 0xA2;
        ag.llIlIllIlI[21] = 0x60 ^ 0x74 ^ (0x59 ^ 0x40);
        ag.llIlIllIlI[22] = 0x73 ^ 0x5D;
        ag.llIlIllIlI[23] = 0x42 ^ 0x4C;
        ag.llIlIllIlI[24] = 0x14 ^ 0x1B;
        ag.llIlIllIlI[25] = 0x6B ^ 0x5A;
        ag.llIlIllIlI[26] = 0x8D ^ 0x9D;
        ag.llIlIllIlI[27] = 0x83 ^ 0x92;
        ag.llIlIllIlI[28] = 8 ^ 0x5F;
        ag.llIlIllIlI[29] = 0xF5 ^ 0x8B ^ (0xFB ^ 0x97);
        ag.llIlIllIlI[30] = 105 + 48 - 132 + 127 ^ 4 + 84 - 18 + 65;
        ag.llIlIllIlI[31] = 0x18 ^ 0xC;
        ag.llIlIllIlI[32] = 0x48 ^ 0x5D;
        ag.llIlIllIlI[33] = 0xA9 ^ 0xBF;
        ag.llIlIllIlI[34] = -(0xFFFFFCED & 0x5B53) & (0xFFFFFF7F & 0x5FFA);
        ag.llIlIllIlI[35] = 198 + 110 - 263 + 189 ^ 50 + 16 - -10 + 56;
        ag.llIlIllIlI[36] = 61 + 99 - 125 + 124 ^ 88 + 2 - 41 + 87;
        ag.llIlIllIlI[37] = 0xFFFFB7FA & 0x5DEF;
        ag.llIlIllIlI[38] = 0xFFFFEFDE & 0x3EED;
        ag.llIlIllIlI[39] = 0xFFFFEFBB & 0x71EC;
        ag.llIlIllIlI[40] = 0xFFFFDF57 & 0x3FEF;
        ag.llIlIllIlI[41] = 0x84 ^ 0xAC;
        ag.llIlIllIlI[42] = 0xFFFF839E & 0x7FE5;
        ag.llIlIllIlI[43] = 0x2C ^ 0x48;
        ag.llIlIllIlI[44] = 0xDE ^ 0xC6;
        ag.llIlIllIlI[45] = 0x30 ^ 0x29;
        ag.llIlIllIlI[46] = 0x38 ^ 0x22;
    }

    @Override
    public boolean ae() {
        return llIlIllIlI[0];
    }

    public static void fi() {
        block29: {
            BankLocation llllllllllllllllllIIIllIllIIlIIl;
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                if (ag.lIllIlIIIlIll(bt ? 1 : 0)) {
                                    AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[0]];
                                    b.a(bv);
                                    if (ag.lIllIlIIIllII(bv.size(), llIlIllIlI[1])) {
                                        System.out.println(llIlIllIIl[llIlIllIlI[1]]);
                                        bt = llIlIllIlI[0];
                                    }
                                }
                                if (!ag.lIllIlIIIllIl(bt ? 1 : 0) || !ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[2])) break block29;
                                if (!ag.lIllIlIIIlIll(ag.an() ? 1 : 0)) break block30;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[3];
                                if (!ag.lIllIlIIIlllI(Inventory.getCount((int[])nArray))) break block31;
                            }
                            if (ag.lIllIlIIIllll(llllllllllllllllllIIIllIllIIlIIl = BankLocation.getNearest()) && ag.lIllIlIIIllIl(llllllllllllllllllIIIllIllIIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[4]];
                                a.a(llllllllllllllllllIIIllIllIIlIIl);
                            }
                            if (!ag.lIllIlIIIllll(llllllllllllllllllIIIllIllIIlIIl) || !ag.lIllIlIIIlIll(llllllllllllllllllIIIllIllIIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (ag.lIllIlIIIllIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[5]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllIlI[6]);
                                "".length();
                            }
                            if (!ag.lIllIlIIIlIll(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[7]];
                            if (ag.lIllIlIIIlllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIlIllIlI[5]);
                                "".length();
                            }
                            if (ag.lIllIlIIIlllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIlIllIlI[4]);
                                "".length();
                            }
                            int[] nArray = new int[llIlIllIlI[1]];
                            nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                            if (!ag.lIllIlIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray2 = new int[llIlIllIlI[1]];
                            nArray2[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                            if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray2), llIlIllIlI[1])) break block33;
                        }
                        int[] nArray = new int[llIlIllIlI[1]];
                        nArray[ag.llIlIllIlI[0]] = llIlIllIlI[9];
                        if (!ag.lIllIlIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray3 = new int[llIlIllIlI[1]];
                        nArray3[ag.llIlIllIlI[0]] = llIlIllIlI[9];
                        if (!ag.lIllIlIIIllII(Inventory.getCount((int[])nArray3), llIlIllIlI[1])) break block34;
                    }
                    ag.Q();
                    System.out.println(llIlIllIIl[llIlIllIlI[10]]);
                    bt = llIlIllIlI[1];
                    return;
                }
                int[] nArray = new int[llIlIllIlI[1]];
                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[9];
                if (ag.lIllIlIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llIlIllIlI[1]];
                    nArray4[ag.llIlIllIlI[0]] = llIlIllIlI[9];
                    if (ag.lIllIlIIIllII(Inventory.getCount((int[])nArray4), llIlIllIlI[1])) {
                        Bank.withdraw((int)llIlIllIlI[9], (int)llIlIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIllIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIllIlI[1]];
                            nArray[ag.llIlIllIlI[0]] = llIlIllIlI[9];
                            if (ag.lIllIlIIIlllI(Inventory.getCount((int[])nArray))) {
                                bl = llIlIllIlI[1];
                                "".length();
                                if ("   ".length() < -" ".length()) {
                                    return ((0x42 ^ 0x7E ^ (0xB2 ^ 0xC1)) & (0xE1 ^ 0x81 ^ (0xA6 ^ 0x89) ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = llIlIllIlI[0];
                            }
                            return bl;
                        }, (int)llIlIllIlI[6]);
                        "".length();
                    }
                }
                int[] nArray5 = new int[llIlIllIlI[1]];
                nArray5[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                if (ag.lIllIlIIIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[llIlIllIlI[1]];
                    nArray6[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                    if (ag.lIllIlIIIllII(Inventory.getCount((int[])nArray6), llIlIllIlI[1])) {
                        int[] nArray7 = new int[llIlIllIlI[1]];
                        nArray7[ag.llIlIllIlI[0]] = llIlIllIlI[9];
                        if (ag.lIllIlIIIlllI(Inventory.getCount((int[])nArray7))) {
                            Bank.withdrawAll((int)llIlIllIlI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIlIllIlI[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (ag.lIllIlIIIlllI(Inventory.getCount((int[])nArray))) {
                                    bl = llIlIllIlI[1];
                                    "".length();
                                    if (null != null) {
                                        return ((135 + 78 - 86 + 84 ^ 57 + 132 - 150 + 95) & (53 + 149 - 16 + 44 ^ 40 + 111 - 20 + 48 ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[6]);
                            "".length();
                        }
                    }
                }
            }
            if (ag.lIllIlIIIlIll(ag.an() ? 1 : 0)) {
                if (ag.lIllIlIIIlIll(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (ag.lIllIlIIIllIl(Bank.isOpen() ? 1 : 0) && ag.lIllIlIIIllIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[11]];
                    if (ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (ag.lIllIlIIIllIl(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)llIlIllIlI[4]);
                        "".length();
                        int[] nArray = new int[llIlIllIlI[1]];
                        nArray[ag.llIlIllIlI[0]] = llIlIllIlI[9];
                        llllllllllllllllllIIIllIllIIlIIl = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[llIlIllIlI[1]];
                        nArray8[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                        Item llllllllllllllllllIIIllIllIIlIII = Inventory.getFirst((int[])nArray8);
                        if (ag.lIllIlIIIllll(llllllllllllllllllIIIllIllIIlIIl) && ag.lIllIlIIIllll(llllllllllllllllllIIIllIllIIlIII)) {
                            llllllllllllllllllIIIllIllIIlIIl.useOn(llllllllllllllllllIIIllIllIIlIII);
                            Time.sleepUntil(() -> Production.isOpen(), (int)llIlIllIlI[6]);
                            "".length();
                        }
                    }
                    if (ag.lIllIlIIIlIll(Production.isOpen() ? 1 : 0)) {
                        if (ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[7])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[12]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[13]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    "".length();
                                    if (" ".length() >= "  ".length()) {
                                        return ((0x79 ^ 0x39) & ~(0x11 ^ 0x51)) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            "".length();
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[7]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[15])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[16]];
                            Production.chooseOption((int)llIlIllIlI[4]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    "".length();
                                    if (null != null) {
                                        return ((0x41 ^ 0x35 ^ (0xDA ^ 0x94)) & (0x5F ^ 0x3B ^ (0xC7 ^ 0x99) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            "".length();
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[15]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[17])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[18]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[19]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    "".length();
                                    if ((77 + 19 - 49 + 144 ^ 109 + 39 - 143 + 182) < " ".length()) {
                                        return ((0xA5 ^ 0x94 ^ (0x4F ^ 0x24)) & (0x69 ^ 9 ^ (0x23 ^ 0x19) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            "".length();
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[17]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[20])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[15]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[21]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    "".length();
                                    if (-" ".length() >= "  ".length()) {
                                        return ((82 + 107 - 121 + 113 ^ 44 + 98 - 114 + 117) & (12 + 92 - 67 + 99 ^ 43 + 66 - 93 + 156 ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            "".length();
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[20]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[22])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[23]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[24]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    "".length();
                                    if (((0xBD ^ 0x8A) & ~(0xF2 ^ 0xC5)) != 0) {
                                        return ((1 ^ 0x41) & ~(0x83 ^ 0xC3)) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            "".length();
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[22]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[25])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[26]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[27]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    "".length();
                                    if (((143 + 123 - 143 + 28 ^ 28 + 116 - 4 + 3) & (0x72 ^ 0x18 ^ (0xD9 ^ 0xAB) ^ -" ".length())) != 0) {
                                        return ((55 + 1 - -67 + 8 ^ 96 + 125 - 132 + 46) & (61 + 57 - 61 + 75 ^ 38 + 127 - 46 + 9 ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            "".length();
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[25]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[28])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[29]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[30]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    "".length();
                                    if (" ".length() != " ".length()) {
                                        return ((0xC ^ 0x1B) & ~(0x87 ^ 0x90)) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            "".length();
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[28])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[31]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[32]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    "".length();
                                    if (((0xE8 ^ 0x94 ^ (0x15 ^ 0x21)) & (2 + 212 - 1 + 3 ^ 77 + 79 - 86 + 74 ^ -" ".length())) > 0) {
                                        return ((0xD3 ^ 0xB5 ^ (0x4B ^ 0x79)) & (0xCC ^ 0x9A ^ "  ".length() ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    @Override
    public int af() {
        ag.fi();
        return llIlIllIlI[43];
    }

    private static String lIllIlIIIIllI(String llllllllllllllllllIIIllIlIlIIlll, String llllllllllllllllllIIIllIlIlIlIll) {
        llllllllllllllllllIIIllIlIlIIlll = new String(Base64.getDecoder().decode(llllllllllllllllllIIIllIlIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIllIlIlIlIlI = new StringBuilder();
        char[] llllllllllllllllllIIIllIlIlIlIIl = llllllllllllllllllIIIllIlIlIlIll.toCharArray();
        int llllllllllllllllllIIIllIlIlIlIII = llIlIllIlI[0];
        char[] llllllllllllllllllIIIllIlIlIIIlI = llllllllllllllllllIIIllIlIlIIlll.toCharArray();
        int llllllllllllllllllIIIllIlIlIIIIl = llllllllllllllllllIIIllIlIlIIIlI.length;
        int llllllllllllllllllIIIllIlIlIIIII = llIlIllIlI[0];
        while (ag.lIllIlIIIllII(llllllllllllllllllIIIllIlIlIIIII, llllllllllllllllllIIIllIlIlIIIIl)) {
            char llllllllllllllllllIIIllIlIlIllIl = llllllllllllllllllIIIllIlIlIIIlI[llllllllllllllllllIIIllIlIlIIIII];
            llllllllllllllllllIIIllIlIlIlIlI.append((char)(llllllllllllllllllIIIllIlIlIllIl ^ llllllllllllllllllIIIllIlIlIlIIl[llllllllllllllllllIIIllIlIlIlIII % llllllllllllllllllIIIllIlIlIlIIl.length]));
            "".length();
            ++llllllllllllllllllIIIllIlIlIlIII;
            ++llllllllllllllllllIIIllIlIlIIIII;
            "".length();
            if ("   ".length() > ((0xF5 ^ 0xC7) & ~(0x6F ^ 0x5D))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIllIlIlIlIlI);
    }

    private static boolean lIllIlIIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        int[] nArray = new int[llIlIllIlI[1]];
        nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
        if (ag.lIllIlIIIlllI(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llIlIllIlI[1]];
            nArray2[ag.llIlIllIlI[0]] = llIlIllIlI[9];
            if (ag.lIllIlIIIlllI(Inventory.getCount((int[])nArray2))) {
                n2 = llIlIllIlI[1];
                "".length();
                if ("   ".length() <= "   ".length()) return n2 != 0;
                return ((0x9A ^ 0xA4) & ~(0xAF ^ 0x91)) != 0;
            }
        }
        n2 = llIlIllIlI[0];
        return n2 != 0;
    }

    private static boolean lIllIlIIIllIl(int n2) {
        return n2 == 0;
    }

    static {
        ag.lIllIlIIIlIlI();
        ag.lIllIlIIIlIIl();
        nc = llIlIllIlI[8];
        nd = llIlIllIlI[9];
        bv = new ArrayList<d>();
    }

    public static void Q() {
        d llllllllllllllllllIIIllIllIIIlII;
        Object llllllllllllllllllIIIllIllIIIlIl;
        int[] nArray = new int[llIlIllIlI[1]];
        nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
        if (ag.lIllIlIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(llIlIllIIl[llIlIllIlI[33]]);
            d d2 = new d(llIlIllIlI[8], llIlIllIlI[34], llIlIllIlI[35]);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llIlIllIlI[1]];
        nArray2[ag.llIlIllIlI[0]] = llIlIllIlI[9];
        if (ag.lIllIlIIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(llIlIllIIl[llIlIllIlI[36]]);
            llllllllllllllllllIIIllIllIIIlIl = new d(llIlIllIlI[9], llIlIllIlI[1], llIlIllIlI[37]);
            bv.add((d)llllllllllllllllllIIIllIllIIIlIl);
            "".length();
        }
        if (ag.lIllIlIIIllIl(Bank.contains(llllllllllllllllllIIIllIllIIIlIl = item -> item.getName().toLowerCase().contains(llIlIllIIl[llIlIllIlI[45]])) ? 1 : 0)) {
            llllllllllllllllllIIIllIllIIIlII = new d(llIlIllIlI[38], llIlIllIlI[10], llIlIllIlI[39]);
            bv.add(llllllllllllllllllIIIllIllIIIlII);
            "".length();
        }
        int[] nArray3 = new int[llIlIllIlI[1]];
        nArray3[ag.llIlIllIlI[0]] = llIlIllIlI[40];
        if (ag.lIllIlIIIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIIIllIllIIIlII = new d(llIlIllIlI[40], llIlIllIlI[41], llIlIllIlI[42]);
            bv.add(llllllllllllllllllIIIllIllIIIlII);
            "".length();
        }
    }

    private static boolean lIllIlIIIllll(Object object) {
        return object != null;
    }

    private static void lIllIlIIIlIIl() {
        llIlIllIIl = new String[llIlIllIlI[46]];
        ag.llIlIllIIl[ag.llIlIllIlI[0]] = ag.lIllIlIIIIllI("IRcbIRcEQgs8HA4R", "cbbHy");
        ag.llIlIllIIl[ag.llIlIllIlI[1]] = ag.lIllIlIIIIllI("PA0rCwsSASFCGg8dLAwfWg0xBxUJSGURDxMQJgoRFANlABkZD2UWF1oHNwMeDg0rBQ==", "zdEbx");
        ag.llIlIllIIl[ag.llIlIllIlI[4]] = ag.lIllIlIIIIllI("FzgGBgI4LRkBAnktH08HODcb", "YYpoe");
        ag.llIlIllIIl[ag.llIlIllIlI[5]] = ag.lIllIlIIIIlll("sdZwwS5E0Vu+zr1Blv5rGg==", "BDAry");
        ag.llIlIllIIl[ag.llIlIllIlI[7]] = ag.lIllIlIIIIlll("jUtERWewRzKNpvkVmChluucxS3qeevAC", "MvKmg");
        ag.llIlIllIIl[ag.llIlIllIlI[10]] = ag.lIllIlIIIIlll("4D8hS+kqd65hRBt1RUic72q1wvk1FGmJOIyYBcr9I/czIWZuM88M0pJbf1pg2hLM", "XYUsv");
        ag.llIlIllIIl[ag.llIlIllIlI[11]] = ag.lIllIlIIIlIII("g/OLAT3qiOViYcva8GUQkg==", "zdEfG");
        ag.llIlIllIIl[ag.llIlIllIlI[12]] = ag.lIllIlIIIIlll("93SJv8pJ/jFn9JXcdiUQWA==", "ZCnXb");
        ag.llIlIllIIl[ag.llIlIllIlI[13]] = ag.lIllIlIIIlIII("RIzlaxgiWDaXv/GXvaQuAg==", "NLoDQ");
        ag.llIlIllIIl[ag.llIlIllIlI[16]] = ag.lIllIlIIIIllI("BTo2DgMvJjBIFCcmMwQSZiQ2BgMjOjk=", "FHWhw");
        ag.llIlIllIIl[ag.llIlIllIlI[18]] = ag.lIllIlIIIIllI("AjstPCYoJyt6PiAkPA==", "AILZR");
        ag.llIlIllIIl[ag.llIlIllIlI[19]] = ag.lIllIlIIIIlll("j7028K+vddVe3u9NY8SfjA==", "jcKWU");
        ag.llIlIllIIl[ag.llIlIllIlI[15]] = ag.lIllIlIIIlIII("IPMzg/ewcBXhHnVxcsxwAA==", "gneDT");
        ag.llIlIllIIl[ag.llIlIllIlI[21]] = ag.lIllIlIIIIllI("DxM3CA==", "YzVdE");
        ag.llIlIllIIl[ag.llIlIllIlI[23]] = ag.lIllIlIIIIlll("O4tcoNQPzPpzPP3owY1En1a/jqgNBOpI", "aSQUf");
        ag.llIlIllIIl[ag.llIlIllIlI[24]] = ag.lIllIlIIIIlll("UZzvZbbdNdXvNz6lCKB22Q==", "pihlL");
        ag.llIlIllIIl[ag.llIlIllIlI[26]] = ag.lIllIlIIIIllI("BDMrHDcuLy1aLDUj", "GAJzC");
        ag.llIlIllIIl[ag.llIlIllIlI[27]] = ag.lIllIlIIIIlll("QSjiGOwInag0bsE1TRbdvRxepVZDqE87", "UCRfG");
        ag.llIlIllIIl[ag.llIlIllIlI[29]] = ag.lIllIlIIIlIII("j53mW8p802t0BfTpbYQMpA==", "oeVIx");
        ag.llIlIllIIl[ag.llIlIllIlI[30]] = ag.lIllIlIIIlIII("XrY8R0LDT6X4ER41q6dhkg==", "kOIOM");
        ag.llIlIllIIl[ag.llIlIllIlI[31]] = ag.lIllIlIIIIlll("ZTzS5XfWQZ+rXNjEPnmaTx7jyF4/QfEh", "qUSww");
        ag.llIlIllIIl[ag.llIlIllIlI[32]] = ag.lIllIlIIIlIII("rv25vEXy/VkE8waOIOo0FQ==", "QykMc");
        ag.llIlIllIIl[ag.llIlIllIlI[33]] = ag.lIllIlIIIlIII("oVu873G6fdud0bbS4Ga5sbfdy1O8ZOxv", "tIskT");
        ag.llIlIllIIl[ag.llIlIllIlI[36]] = ag.lIllIlIIIIllI("MSYQLjcUcw4rOAAgCys2BDoHIHkDOhki", "sSiGY");
        ag.llIlIllIIl[ag.llIlIllIlI[44]] = ag.lIllIlIIIIlll("5Pbl1Ac2TkWxE44hFmXEgQ==", "FKALU");
        ag.llIlIllIIl[ag.llIlIllIlI[45]] = ag.lIllIlIIIIllI("FxoBInoKFU8yPwQfGy16TQ==", "esoEZ");
    }

    private static String lIllIlIIIlIII(String llllllllllllllllllIIIllIlIllllII, String llllllllllllllllllIIIllIlIlllIll) {
        try {
            SecretKeySpec llllllllllllllllllIIIllIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIlIlllIll.getBytes(StandardCharsets.UTF_8)), llIlIllIlI[13]), "DES");
            Cipher llllllllllllllllllIIIllIlIlllllI = Cipher.getInstance("DES");
            llllllllllllllllllIIIllIlIlllllI.init(llIlIllIlI[4], llllllllllllllllllIIIllIlIllllll);
            return new String(llllllllllllllllllIIIllIlIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIllIlIllllIl) {
            llllllllllllllllllIIIllIlIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIlIIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[2])) {
            bl = llIlIllIlI[1];
            "".length();
            if ((0xD0 ^ 0xC7 ^ (0x7F ^ 0x6D)) <= 0) {
                return ((0x53 ^ 0x77 ^ (0x88 ^ 0x95)) & (44 + 127 - 99 + 64 ^ 106 + 59 - 97 + 109 ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIllIlI[0];
        }
        return bl;
    }
}

