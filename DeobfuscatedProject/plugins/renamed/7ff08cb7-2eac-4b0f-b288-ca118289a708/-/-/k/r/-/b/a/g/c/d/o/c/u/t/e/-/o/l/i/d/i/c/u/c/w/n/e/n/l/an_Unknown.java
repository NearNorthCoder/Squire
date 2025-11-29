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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import gg.squire.account.AccBuilderGWD;
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

public class an_Unknown
implements ab {
    private static /* synthetic */ String[] llllIIIlI;
    public static final /* synthetic */ int mu;
    public static final /* synthetic */ int mt;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ int[] llllIIllI;
    public static /* synthetic */ boolean bv;

    @Override
    public boolean ah() {
        boolean bl;
        if (an.llIlIIIIIIll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[44])) {
            bl = llllIIllI[1];
            0;
            if (1 <= 0) {
                return false;
            }
        } else {
            bl = llllIIllI[0];
        }
        return bl;
    }

    private static boolean llIlIIIIIIII(int n2) {
        return n2 == 0;
    }

    static {
        an.llIIllllllIl();
        an.llIIllllllII();
        mu = llllIIllI[8];
        mt = llllIIllI[7];
        bx = new ArrayList<d>();
    }

    private static boolean llIlIIIIIIIl(int n2) {
        return n2 > 0;
    }

    private static void llIIllllllIl() {
        llllIIllI = new int[47];
        an.llllIIllI[0] = (0xC9 ^ 0xC6 ^ (0x8F ^ 0xC6)) & (4 ^ 0x3B ^ (0x6D ^ 0x14) ^ -1);
        an.llllIIllI[1] = 1;
        an.llllIIllI[2] = 0xFFFFCFEF & 0x33F3;
        an.llllIIllI[3] = 2;
        an.llllIIllI[4] = 3;
        an.llllIIllI[5] = 0xFFFFF38D & 0x1FFA;
        an.llllIIllI[6] = 0xE6 ^ 0xC0 ^ (0xE4 ^ 0xC6);
        an.llllIIllI[7] = 0xFFFFCFEF & 0x36FF;
        an.llllIIllI[8] = 0xFFFF9EF9 & 0x67FF;
        an.llllIIllI[9] = 0x9A ^ 0x9F;
        an.llllIIllI[10] = 0xFF ^ 0x89 ^ (0x10 ^ 0x60);
        an.llllIIllI[11] = 43 + 94 - 79 + 79 ^ 15 + 129 - 116 + 114;
        an.llllIIllI[12] = 146 + 2 - 51 + 65 ^ 63 + 154 - 215 + 168;
        an.llllIIllI[13] = 0xFFFFEFF9 & 0xF296;
        an.llllIIllI[14] = 0xCD ^ 0xC1;
        an.llllIIllI[15] = 46 + 122 - 137 + 146 ^ 47 + 110 - 150 + 177;
        an.llllIIllI[16] = 0xB0 ^ 0x85 ^ (0x52 ^ 0x46);
        an.llllIIllI[17] = 0x94 ^ 0x9E;
        an.llllIIllI[18] = 0x47 ^ 0x4C;
        an.llllIIllI[19] = 3 & ~3 ^ (0x20 ^ 0xA);
        an.llllIIllI[20] = 0x69 ^ 0x64;
        an.llllIIllI[21] = 0xA0 ^ 0x8E;
        an.llllIIllI[22] = 0xA3 ^ 0xAD;
        an.llllIIllI[23] = 116 + 12 - 41 + 84 ^ 147 + 61 - 129 + 85;
        an.llllIIllI[24] = 0x2C ^ 0x1D;
        an.llllIIllI[25] = 0x34 ^ 0x1E ^ (0xFE ^ 0xC4);
        an.llllIIllI[26] = 0x6B ^ 0x45 ^ (0x6B ^ 0x54);
        an.llllIIllI[27] = 104 + 168 - 47 + 6 ^ 175 + 60 - 151 + 92;
        an.llllIIllI[28] = 0x8D ^ 0x8A ^ (0x18 ^ 0xD);
        an.llllIIllI[29] = 0x2C ^ 0x3F;
        an.llllIIllI[30] = 0xBC ^ 0xA8;
        an.llllIIllI[31] = 0x25 ^ 0x30;
        an.llllIIllI[32] = 0x38 ^ 0x2E;
        an.llllIIllI[33] = 0xFFFF9F3B & 0x67FE;
        an.llllIIllI[34] = 0x2C ^ 0x42;
        an.llllIIllI[35] = 0x82 ^ 0x95;
        an.llllIIllI[36] = -(0xFFFFDB97 & 0x666E) & (0xFFFFDFEF & 0x77FF);
        an.llllIIllI[37] = 0xFFFFAEFD & 0x7FCE;
        an.llllIIllI[38] = -(0xFFFF975A & 0x7ABD) & (0xFFFFFFBF & 0x73FF);
        an.llllIIllI[39] = -(0x7B ^ 0x6A) & (0xFFFFBFF7 & 0x5F5F);
        an.llllIIllI[40] = 0x58 ^ 0x70;
        an.llllIIllI[41] = 0xFFFFCFDF & 0x33A4;
        an.llllIIllI[42] = 0x6B ^ 0xF;
        an.llllIIllI[43] = 0x18 ^ 0x73 ^ (5 ^ 0x76);
        an.llllIIllI[44] = 85 + 139 - 95 + 94 ^ 36 + 187 - 220 + 185;
        an.llllIIllI[45] = 0xAD ^ 0xB4;
        an.llllIIllI[46] = 0x9A ^ 0xBA ^ (0x27 ^ 0x1D);
    }

    private static boolean llIlIIIIIIlI(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        int[] nArray = new int[llllIIllI[1]];
        nArray[an.llllIIllI[0]] = llllIIllI[7];
        if (an.llIlIIIIIIIl(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llllIIllI[1]];
            nArray2[an.llllIIllI[0]] = llllIIllI[8];
            if (an.llIlIIIIIIIl(Inventory.getCount((int[])nArray2))) {
                n2 = llllIIllI[1];
                0;
                if (3 >= 0) return n2 != 0;
                return ((73 + 46 - 74 + 146 ^ 117 + 54 - 104 + 62) & (0x80 ^ 0x92 ^ (0x65 ^ 0x49) ^ -1)) != 0;
            }
        }
        n2 = llllIIllI[0];
        return n2 != 0;
    }

    private static void llIIllllllII() {
        llllIIIlI = new String[llllIIllI[46]];
        an.llllIIIlI[an.llllIIllI[0]] = an."Buying items";
        an.llllIIIlI[an.llllIIllI[1]] = an."Finished buying items, switching back to crafting";
        an.llllIIIlI[an.llllIIllI[3]] = an."Navigating to bank";
        an.llllIIIlI[an.llllIIllI[4]] = an."Opening bank";
        an.llllIIIlI[an.llllIIllI[6]] = an."Handling banking";
        an.llllIIIlI[an.llllIIllI[9]] = an."We are missing supplies, switching to BUYING";
        an.llllIIIlI[an.llllIIllI[10]] = an."Crafting ";
        an.llllIIIlI[an.llllIIllI[11]] = an."Crafting glass";
        an.llllIIIlI[an.llllIIllI[12]] = an."Beer glass";
        an.llllIIIlI[an.llllIIllI[15]] = an."Crafting candle lantern";
        an.llllIIIlI[an.llllIIllI[17]] = an."Crafting lamp";
        an.llllIIIlI[an.llllIIllI[18]] = an."Oil lamp";
        an.llllIIIlI[an.llllIIllI[14]] = an."Crafting vial";
        an.llllIIIlI[an.llllIIllI[20]] = an."Vial";
        an.llllIIIlI[an.llllIIllI[22]] = an."Crafting fishbowl";
        an.llllIIIlI[an.llllIIllI[23]] = an."Fishbowl";
        an.llllIIIlI[an.llllIIllI[25]] = an."Crafting orb";
        an.llllIIIlI[an.llllIIllI[26]] = an."Unpowered staff orb";
        an.llllIIIlI[an.llllIIllI[28]] = an."Crafting lens";
        an.llllIIIlI[an.llllIIllI[29]] = an."Lantern lens";
        an.llllIIIlI[an.llllIIllI[30]] = an."Crafting light orb";
        an.llllIIIlI[an.llllIIllI[31]] = an."Light orb";
        an.llllIIIlI[an.llllIIllI[32]] = an."Buying molten glass";
        an.llllIIIlI[an.llllIIllI[35]] = an."Buying glassblowing pipe";
        an.llllIIIlI[an.llllIIllI[43]] = an."Crafting";
        an.llllIIIlI[an.llllIIllI[45]] = an."ring of wealth (";
    }

    private static boolean llIlIIIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIllllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlllllIlI(String llIIIIlIIIlIl, String llIIIIlIIIlII) {
        try {
            SecretKeySpec llIIIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIlIIlIIl = Cipher.getInstance("Blowfish");
            llIIIIlIIlIIl.init(llllIIllI[3], llIIIIlIIlIlI);
            return new String(llIIIIlIIlIIl.doFinal(Base64.getDecoder().decode(llIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIlIIlIII) {
            llIIIIlIIlIII.printStackTrace();
            return null;
        }
    }

    public static void el() {
        block29: {
            BankLocation llIIIIllllIIl;
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                if (an.llIIlllllllI(bv ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIIIlI[llllIIllI[0]];
                                    b.a(bx);
                                    if (an.llIIllllllll(bx.size(), llllIIllI[1])) {
                                        System.out.println(llllIIIlI[llllIIllI[1]]);
                                        bv = llllIIllI[0];
                                    }
                                }
                                if (!an.llIlIIIIIIII(bv ? 1 : 0)) break block29;
                                if (!an.llIIlllllllI(an.an() ? 1 : 0)) break block30;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[2];
                                if (!an.llIlIIIIIIIl(Inventory.getCount((int[])nArray))) break block31;
                            }
                            if (an.llIlIIIIIIlI(llIIIIllllIIl = BankLocation.getNearest()) && an.llIlIIIIIIII(llIIIIllllIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = llllIIIlI[llllIIllI[3]];
                                a.a(llIIIIllllIIl);
                            }
                            if (!an.llIlIIIIIIlI(llIIIIllllIIl) || !an.llIIlllllllI(llIIIIllllIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (an.llIlIIIIIIII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderGWD.c = llllIIIlI[llllIIllI[4]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIllI[5]);
                                0;
                            }
                            if (!an.llIIlllllllI(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderGWD.c = llllIIIlI[llllIIllI[6]];
                            if (an.llIlIIIIIIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllIIllI[4]);
                                0;
                            }
                            if (an.llIlIIIIIIIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llllIIllI[3]);
                                0;
                            }
                            int[] nArray = new int[llllIIllI[1]];
                            nArray[an.llllIIllI[0]] = llllIIllI[7];
                            if (!an.llIlIIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray2 = new int[llllIIllI[1]];
                            nArray2[an.llllIIllI[0]] = llllIIllI[7];
                            if (!an.llIlIIIIIIll(Inventory.getCount((int[])nArray2), llllIIllI[1])) break block33;
                        }
                        int[] nArray = new int[llllIIllI[1]];
                        nArray[an.llllIIllI[0]] = llllIIllI[8];
                        if (!an.llIlIIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray3 = new int[llllIIllI[1]];
                        nArray3[an.llllIIllI[0]] = llllIIllI[8];
                        if (!an.llIIllllllll(Inventory.getCount((int[])nArray3), llllIIllI[1])) break block34;
                    }
                    an.Q();
                    System.out.println(llllIIIlI[llllIIllI[9]]);
                    bv = llllIIllI[1];
                    return;
                }
                int[] nArray = new int[llllIIllI[1]];
                nArray[an.llllIIllI[0]] = llllIIllI[8];
                if (an.llIIlllllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llllIIllI[1]];
                    nArray4[an.llllIIllI[0]] = llllIIllI[8];
                    if (an.llIIllllllll(Inventory.getCount((int[])nArray4), llllIIllI[1])) {
                        Bank.withdraw((int)llllIIllI[8], (int)llllIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllIIllI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llllIIllI[1]];
                            nArray[an.llllIIllI[0]] = llllIIllI[8];
                            if (an.llIlIIIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = llllIIllI[1];
                                0;
                                if (2 < 0) {
                                    return false;
                                }
                            } else {
                                bl = llllIIllI[0];
                            }
                            return bl;
                        }, (int)llllIIllI[5]);
                        0;
                    }
                }
                int[] nArray5 = new int[llllIIllI[1]];
                nArray5[an.llllIIllI[0]] = llllIIllI[7];
                if (an.llIIlllllllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[llllIIllI[1]];
                    nArray6[an.llllIIllI[0]] = llllIIllI[7];
                    if (an.llIIllllllll(Inventory.getCount((int[])nArray6), llllIIllI[1])) {
                        int[] nArray7 = new int[llllIIllI[1]];
                        nArray7[an.llllIIllI[0]] = llllIIllI[8];
                        if (an.llIlIIIIIIIl(Inventory.getCount((int[])nArray7))) {
                            Bank.withdrawAll((int)llllIIllI[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llllIIllI[1]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[7];
                                if (an.llIlIIIIIIIl(Inventory.getCount((int[])nArray))) {
                                    bl = llllIIllI[1];
                                    0;
                                    if (-2 >= 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llllIIllI[0];
                                }
                                return bl;
                            }, (int)llllIIllI[5]);
                            0;
                        }
                    }
                }
            }
            if (an.llIIlllllllI(an.an() ? 1 : 0)) {
                if (an.llIIlllllllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (an.llIlIIIIIIII(Bank.isOpen() ? 1 : 0) && an.llIlIIIIIIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderGWD.c = llllIIIlI[llllIIllI[10]];
                    if (an.llIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (an.llIlIIIIIIII(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)llllIIllI[3]);
                        0;
                        int[] nArray = new int[llllIIllI[1]];
                        nArray[an.llllIIllI[0]] = llllIIllI[8];
                        llIIIIllllIIl = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[llllIIllI[1]];
                        nArray8[an.llllIIllI[0]] = llllIIllI[7];
                        Item llIIIIllllIII = Inventory.getFirst((int[])nArray8);
                        if (an.llIlIIIIIIlI(llIIIIllllIIl) && an.llIlIIIIIIlI(llIIIIllllIII)) {
                            llIIIIllllIIl.useOn(llIIIIllllIII);
                            Time.sleepUntil(() -> Production.isOpen(), (int)llllIIllI[5]);
                            0;
                        }
                    }
                    if (an.llIIlllllllI(Production.isOpen() ? 1 : 0)) {
                        if (an.llIIllllllll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[6])) {
                            AccBuilderGWD.c = llllIIIlI[llllIIllI[11]];
                            Production.chooseOption((String)llllIIIlI[llllIIllI[12]]);
                            Time.sleepTicks((int)llllIIllI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[7];
                                if (!an.llIlIIIIIIll(Inventory.getCount((int[])nArray), llllIIllI[1]) || an.llIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llllIIllI[1];
                                    0;
                                    if (1 < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llllIIllI[0];
                                }
                                return bl;
                            }, (int)llllIIllI[13]);
                            0;
                        }
                        if (an.llIlIIIIIIll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[6]) && an.llIIllllllll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[14])) {
                            AccBuilderGWD.c = llllIIIlI[llllIIllI[15]];
                            Production.chooseOption((int)llllIIllI[3]);
                            Time.sleepTicks((int)llllIIllI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[7];
                                if (!an.llIlIIIIIIll(Inventory.getCount((int[])nArray), llllIIllI[1]) || an.llIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llllIIllI[1];
                                    0;
                                    if (-1 < -1) {
                                        return ((0x3F ^ 0x5A ^ (0x40 ^ 0x11)) & (0xA8 ^ 0xAF ^ (0xAF ^ 0x9C) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llllIIllI[0];
                                }
                                return bl;
                            }, (int)llllIIllI[13]);
                            0;
                        }
                        if (an.llIlIIIIIIll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[14]) && an.llIIllllllll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[16])) {
                            AccBuilderGWD.c = llllIIIlI[llllIIllI[17]];
                            Production.chooseOption((String)llllIIIlI[llllIIllI[18]]);
                            Time.sleepTicks((int)llllIIllI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[7];
                                if (!an.llIlIIIIIIll(Inventory.getCount((int[])nArray), llllIIllI[1]) || an.llIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llllIIllI[1];
                                    0;
                                    if (1 >= 3) {
                                        return ((0x3B ^ 0x21 ^ (5 ^ 9)) & (0xC5 ^ 0xC3 ^ (0x58 ^ 0x48) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llllIIllI[0];
                                }
                                return bl;
                            }, (int)llllIIllI[13]);
                            0;
                        }
                        if (an.llIlIIIIIIll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[16]) && an.llIIllllllll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[19])) {
                            AccBuilderGWD.c = llllIIIlI[llllIIllI[14]];
                            Production.chooseOption((String)llllIIIlI[llllIIllI[20]]);
                            Time.sleepTicks((int)llllIIllI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[7];
                                if (!an.llIlIIIIIIll(Inventory.getCount((int[])nArray), llllIIllI[1]) || an.llIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llllIIllI[1];
                                    0;
                                    if (((0x21 ^ 0x3A) & ~(0xA6 ^ 0xBD) & ~((9 ^ 0x3B) & ~(0x50 ^ 0x62))) < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llllIIllI[0];
                                }
                                return bl;
                            }, (int)llllIIllI[13]);
                            0;
                        }
                        if (an.llIlIIIIIIll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[19]) && an.llIIllllllll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[21])) {
                            AccBuilderGWD.c = llllIIIlI[llllIIllI[22]];
                            Production.chooseOption((String)llllIIIlI[llllIIllI[23]]);
                            Time.sleepTicks((int)llllIIllI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[7];
                                if (!an.llIlIIIIIIll(Inventory.getCount((int[])nArray), llllIIllI[1]) || an.llIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llllIIllI[1];
                                    0;
                                    if (2 > (0x6D ^ 0x58 ^ (0x66 ^ 0x57))) {
                                        return false;
                                    }
                                } else {
                                    bl = llllIIllI[0];
                                }
                                return bl;
                            }, (int)llllIIllI[13]);
                            0;
                        }
                        if (an.llIlIIIIIIll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[21]) && an.llIIllllllll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[24])) {
                            AccBuilderGWD.c = llllIIIlI[llllIIllI[25]];
                            Production.chooseOption((String)llllIIIlI[llllIIllI[26]]);
                            Time.sleepTicks((int)llllIIllI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[7];
                                if (!an.llIlIIIIIIll(Inventory.getCount((int[])nArray), llllIIllI[1]) || an.llIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llllIIllI[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = llllIIllI[0];
                                }
                                return bl;
                            }, (int)llllIIllI[13]);
                            0;
                        }
                        if (an.llIlIIIIIIll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[24]) && an.llIIllllllll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[27])) {
                            AccBuilderGWD.c = llllIIIlI[llllIIllI[28]];
                            Production.chooseOption((String)llllIIIlI[llllIIllI[29]]);
                            Time.sleepTicks((int)llllIIllI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[7];
                                if (!an.llIlIIIIIIll(Inventory.getCount((int[])nArray), llllIIllI[1]) || an.llIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llllIIllI[1];
                                    0;
                                    if (-1 >= ((0x62 ^ 0) & ~(0xEC ^ 0x8E))) {
                                        return false;
                                    }
                                } else {
                                    bl = llllIIllI[0];
                                }
                                return bl;
                            }, (int)llllIIllI[13]);
                            0;
                        }
                        if (an.llIlIIIIIIll(Skills.getLevel((Skill)Skill.CRAFTING), llllIIllI[27])) {
                            AccBuilderGWD.c = llllIIIlI[llllIIllI[30]];
                            Production.chooseOption((String)llllIIIlI[llllIIllI[31]]);
                            Time.sleepTicks((int)llllIIllI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIllI[1]];
                                nArray[an.llllIIllI[0]] = llllIIllI[7];
                                if (!an.llIlIIIIIIll(Inventory.getCount((int[])nArray), llllIIllI[1]) || an.llIIlllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llllIIllI[1];
                                    0;
                                    if (-3 > 0) {
                                        return ((0x1F ^ 0x18 ^ (0x96 ^ 0xA8)) & (0x1B ^ 0x42 ^ (5 ^ 0x65) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llllIIllI[0];
                                }
                                return bl;
                            }, (int)llllIIllI[13]);
                            0;
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIlllllllI(int n2) {
        return n2 != 0;
    }

    private static String llIIlllllIIl(String llIIIIlIlIlll, String llIIIIlIlIllI) {
        llIIIIlIlIlll = new String(Base64.getDecoder().decode(llIIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIlIllIlI = new StringBuilder();
        char[] llIIIIlIllIIl = llIIIIlIlIllI.toCharArray();
        int llIIIIlIllIII = llllIIllI[0];
        char[] llIIIIlIlIIlI = llIIIIlIlIlll.toCharArray();
        int llIIIIlIlIIIl = llIIIIlIlIIlI.length;
        int llIIIIlIlIIII = llllIIllI[0];
        while (an.llIIllllllll(llIIIIlIlIIII, llIIIIlIlIIIl)) {
            char llIIIIlIlllIl = llIIIIlIlIIlI[llIIIIlIlIIII];
            llIIIIlIllIlI.append((char)(llIIIIlIlllIl ^ llIIIIlIllIIl[llIIIIlIllIII % llIIIIlIllIIl.length]));
            0;
            ++llIIIIlIllIII;
            ++llIIIIlIlIIII;
            0;
            if ((0x9A ^ 0x9E) >= 1) continue;
            return null;
        }
        return String.valueOf(llIIIIlIllIlI);
    }

    @Override
    public boolean ae() {
        return llllIIllI[0];
    }

    private static String llIIlllllIll(String llIIIIllIllII, String llIIIIllIlIIl) {
        try {
            SecretKeySpec llIIIIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), llllIIllI[12]), "DES");
            Cipher llIIIIllIlllI = Cipher.getInstance("DES");
            llIIIIllIlllI.init(llllIIllI[3], llIIIIllIllll);
            return new String(llIIIIllIlllI.doFinal(Base64.getDecoder().decode(llIIIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIllIllIl) {
            llIIIIllIllIl.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        an.el();
        return llllIIllI[42];
    }

    public static void Q() {
        d llIIIIlllIlII;
        Object llIIIIlllIlIl;
        int[] nArray = new int[llllIIllI[1]];
        nArray[an.llllIIllI[0]] = llllIIllI[7];
        if (an.llIlIIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(llllIIIlI[llllIIllI[32]]);
            d d2 = new d(llllIIllI[7], llllIIllI[33], llllIIllI[34]);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[llllIIllI[1]];
        nArray2[an.llllIIllI[0]] = llllIIllI[8];
        if (an.llIlIIIIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(llllIIIlI[llllIIllI[35]]);
            llIIIIlllIlIl = new d(llllIIllI[8], llllIIllI[1], llllIIllI[36]);
            bx.add((d)llIIIIlllIlIl);
            0;
        }
        if (an.llIlIIIIIIII(Bank.contains(llIIIIlllIlIl = item -> item.getName().toLowerCase().contains(llllIIIlI[llllIIllI[45]])) ? 1 : 0)) {
            llIIIIlllIlII = new d(llllIIllI[37], llllIIllI[9], llllIIllI[38]);
            bx.add(llIIIIlllIlII);
            0;
        }
        int[] nArray3 = new int[llllIIllI[1]];
        nArray3[an.llllIIllI[0]] = llllIIllI[39];
        if (an.llIlIIIIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIIIIlllIlII = new d(llllIIllI[39], llllIIllI[40], llllIIllI[41]);
            bx.add(llIIIIlllIlII);
            0;
        }
    }

    @Override
    public String ag() {
        return llllIIIlI[llllIIllI[43]];
    }
}

