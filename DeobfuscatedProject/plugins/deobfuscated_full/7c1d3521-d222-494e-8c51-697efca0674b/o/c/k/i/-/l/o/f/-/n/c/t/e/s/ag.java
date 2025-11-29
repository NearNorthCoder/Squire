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

    private static String lIllIlIIIIlll(String var19, String var2) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llIlIllIlI[4], var1);
            return new String(var13.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    @Override
    public String ag() {
        return llIlIllIIl[llIlIllIlI[44]];
    }

    private static void lIllIlIIIlIlI() {
        llIlIllIlI = new int[47];
        ag.llIlIllIlI[0] = (0x29 ^ 0x1F ^ (0x22 ^ 0x4E)) & (4 ^ 0x68 ^ (0x3F ^ 9) ^ -1);
        ag.llIlIllIlI[1] = 1;
        ag.llIlIllIlI[2] = 0x8C ^ 0xB4;
        ag.llIlIllIlI[3] = -(0xFFFFEF19 & 0x70FF) & (0xFFFFE7FF & 0x7BFB);
        ag.llIlIllIlI[4] = 2;
        ag.llIlIllIlI[5] = 3;
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
            BankLocation var17;
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
                            if (ag.lIllIlIIIllll(var17 = BankLocation.getNearest()) && ag.lIllIlIIIllIl(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[4]];
                                a.a(var17);
                            }
                            if (!ag.lIllIlIIIllll(var17) || !ag.lIllIlIIIlIll(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (ag.lIllIlIIIllIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[5]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllIlI[6]);
                                0;
                            }
                            if (!ag.lIllIlIIIlIll(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[7]];
                            if (ag.lIllIlIIIlllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIlIllIlI[5]);
                                0;
                            }
                            if (ag.lIllIlIIIlllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIlIllIlI[4]);
                                0;
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
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIllIlI[1]];
                            nArray[ag.llIlIllIlI[0]] = llIlIllIlI[9];
                            if (ag.lIllIlIIIlllI(Inventory.getCount((int[])nArray))) {
                                bl = llIlIllIlI[1];
                                0;
                                if (3 < -1) {
                                    return ((0x42 ^ 0x7E ^ (0xB2 ^ 0xC1)) & (0xE1 ^ 0x81 ^ (0xA6 ^ 0x89) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlIllIlI[0];
                            }
                            return bl;
                        }, (int)llIlIllIlI[6]);
                        0;
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
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (ag.lIllIlIIIlllI(Inventory.getCount((int[])nArray))) {
                                    bl = llIlIllIlI[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[6]);
                            0;
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
                        0;
                        int[] nArray = new int[llIlIllIlI[1]];
                        nArray[ag.llIlIllIlI[0]] = llIlIllIlI[9];
                        var17 = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[llIlIllIlI[1]];
                        nArray8[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                        Item var8 = Inventory.getFirst((int[])nArray8);
                        if (ag.lIllIlIIIllll(var17) && ag.lIllIlIIIllll(var8)) {
                            var17.useOn(var8);
                            Time.sleepUntil(() -> Production.isOpen(), (int)llIlIllIlI[6]);
                            0;
                        }
                    }
                    if (ag.lIllIlIIIlIll(Production.isOpen() ? 1 : 0)) {
                        if (ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[7])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[12]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[13]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    0;
                                    if (1 >= 2) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            0;
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[7]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[15])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[16]];
                            Production.chooseOption((int)llIlIllIlI[4]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            0;
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[15]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[17])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[18]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[19]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    0;
                                    if ((77 + 19 - 49 + 144 ^ 109 + 39 - 143 + 182) < 1) {
                                        return ((0xA5 ^ 0x94 ^ (0x4F ^ 0x24)) & (0x69 ^ 9 ^ (0x23 ^ 0x19) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            0;
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[17]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[20])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[15]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[21]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    0;
                                    if (-1 >= 2) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            0;
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[20]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[22])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[23]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[24]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    0;
                                    if (((0xBD ^ 0x8A) & ~(0xF2 ^ 0xC5)) != 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            0;
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[22]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[25])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[26]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[27]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    0;
                                    if (((143 + 123 - 143 + 28 ^ 28 + 116 - 4 + 3) & (0x72 ^ 0x18 ^ (0xD9 ^ 0xAB) ^ -1)) != 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            0;
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[25]) && ag.lIllIlIIIllII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[28])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[29]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[30]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    0;
                                    if (1 != 1) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            0;
                        }
                        if (ag.lIllIlIIlIIII(Skills.getLevel((Skill)Skill.CRAFTING), llIlIllIlI[28])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[31]];
                            Production.chooseOption((String)llIlIllIIl[llIlIllIlI[32]]);
                            Time.sleepTicks((int)llIlIllIlI[11]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlIllIlI[1]];
                                nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!ag.lIllIlIIlIIII(Inventory.getCount((int[])nArray), llIlIllIlI[1]) || ag.lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIlIllIlI[1];
                                    0;
                                    if (((0xE8 ^ 0x94 ^ (0x15 ^ 0x21)) & (2 + 212 - 1 + 3 ^ 77 + 79 - 86 + 74 ^ -1)) > 0) {
                                        return ((0xD3 ^ 0xB5 ^ (0x4B ^ 0x79)) & (0xCC ^ 0x9A ^ 2 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIlIllIlI[0];
                                }
                                return bl;
                            }, (int)llIlIllIlI[14]);
                            0;
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

    private static String lIllIlIIIIllI(String var16, String var22) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var5 = var22.toCharArray();
        int var4 = llIlIllIlI[0];
        char[] var14 = var16.toCharArray();
        int var10 = var14.length;
        int var21 = llIlIllIlI[0];
        while (ag.lIllIlIIIllII(var21, var10)) {
            char var3 = var14[var21];
            var23.append((char)(var3 ^ var5[var4 % var5.length]));
            0;
            ++var4;
            ++var21;
            0;
            if (3 > ((0xF5 ^ 0xC7) & ~(0x6F ^ 0x5D))) continue;
            return null;
        }
        return String.valueOf(var23);
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
                0;
                if (3 <= 3) return n2 != 0;
                return false;
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
        d var11;
        Object var15;
        int[] nArray = new int[llIlIllIlI[1]];
        nArray[ag.llIlIllIlI[0]] = llIlIllIlI[8];
        if (ag.lIllIlIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(llIlIllIIl[llIlIllIlI[33]]);
            d d2 = new d(llIlIllIlI[8], llIlIllIlI[34], llIlIllIlI[35]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIlIllIlI[1]];
        nArray2[ag.llIlIllIlI[0]] = llIlIllIlI[9];
        if (ag.lIllIlIIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(llIlIllIIl[llIlIllIlI[36]]);
            var15 = new d(llIlIllIlI[9], llIlIllIlI[1], llIlIllIlI[37]);
            bv.add((d)var15);
            0;
        }
        if (ag.lIllIlIIIllIl(Bank.contains(var15 = item -> item.getName().toLowerCase().contains(llIlIllIIl[llIlIllIlI[45]])) ? 1 : 0)) {
            var11 = new d(llIlIllIlI[38], llIlIllIlI[10], llIlIllIlI[39]);
            bv.add(var11);
            0;
        }
        int[] nArray3 = new int[llIlIllIlI[1]];
        nArray3[ag.llIlIllIlI[0]] = llIlIllIlI[40];
        if (ag.lIllIlIIIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var11 = new d(llIlIllIlI[40], llIlIllIlI[41], llIlIllIlI[42]);
            bv.add(var11);
            0;
        }
    }

    private static boolean lIllIlIIIllll(Object object) {
        return object != null;
    }

    private static void lIllIlIIIlIIl() {
        llIlIllIIl = new String[llIlIllIlI[46]];
        ag.llIlIllIIl[ag.llIlIllIlI[0]] = ag."Buying items";
        ag.llIlIllIIl[ag.llIlIllIlI[1]] = ag."Finished buying items, switching back to crafting";
        ag.llIlIllIIl[ag.llIlIllIlI[4]] = ag."Navigating to bank";
        ag.llIlIllIIl[ag.llIlIllIlI[5]] = ag."Opening bank";
        ag.llIlIllIIl[ag.llIlIllIlI[7]] = ag."Handling banking";
        ag.llIlIllIIl[ag.llIlIllIlI[10]] = ag."We are missing supplies, switching to BUYING";
        ag.llIlIllIIl[ag.llIlIllIlI[11]] = ag."Crafting ";
        ag.llIlIllIIl[ag.llIlIllIlI[12]] = ag."Crafting glass";
        ag.llIlIllIIl[ag.llIlIllIlI[13]] = ag."Beer glass";
        ag.llIlIllIIl[ag.llIlIllIlI[16]] = ag."Crafting candle lantern";
        ag.llIlIllIIl[ag.llIlIllIlI[18]] = ag."Crafting lamp";
        ag.llIlIllIIl[ag.llIlIllIlI[19]] = ag."Oil lamp";
        ag.llIlIllIIl[ag.llIlIllIlI[15]] = ag."Crafting vial";
        ag.llIlIllIIl[ag.llIlIllIlI[21]] = ag."Vial";
        ag.llIlIllIIl[ag.llIlIllIlI[23]] = ag."Crafting fishbowl";
        ag.llIlIllIIl[ag.llIlIllIlI[24]] = ag."Fishbowl";
        ag.llIlIllIIl[ag.llIlIllIlI[26]] = ag."Crafting orb";
        ag.llIlIllIIl[ag.llIlIllIlI[27]] = ag."Unpowered staff orb";
        ag.llIlIllIIl[ag.llIlIllIlI[29]] = ag."Crafting lens";
        ag.llIlIllIIl[ag.llIlIllIlI[30]] = ag."Lantern lens";
        ag.llIlIllIIl[ag.llIlIllIlI[31]] = ag."Crafting light orb";
        ag.llIlIllIIl[ag.llIlIllIlI[32]] = ag."Light orb";
        ag.llIlIllIIl[ag.llIlIllIlI[33]] = ag."Buying molten glass";
        ag.llIlIllIIl[ag.llIlIllIlI[36]] = ag."Buying glassblowing pipe";
        ag.llIlIllIIl[ag.llIlIllIlI[44]] = ag."Crafting";
        ag.llIlIllIIl[ag.llIlIllIlI[45]] = ag."ring of wealth (";
    }

    private static String lIllIlIIIlIII(String var7, String var12) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llIlIllIlI[13]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(llIlIllIlI[4], var18);
            return new String(var9.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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
            0;
            if ((0xD0 ^ 0xC7 ^ (0x7F ^ 0x6D)) <= 0) {
                return ((0x53 ^ 0x77 ^ (0x88 ^ 0x95)) & (44 + 127 - 99 + 64 ^ 106 + 59 - 97 + 109 ^ -1)) != 0;
            }
        } else {
            bl = llIlIllIlI[0];
        }
        return bl;
    }
}

