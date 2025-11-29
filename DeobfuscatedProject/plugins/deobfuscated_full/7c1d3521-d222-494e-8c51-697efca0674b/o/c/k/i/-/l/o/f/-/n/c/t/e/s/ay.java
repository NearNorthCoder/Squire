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

public class ay
implements ac {
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int oH;
    private static /* synthetic */ int[] llIIlIlIIl;
    public static final /* synthetic */ int oG;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] llIIlIlIII;

    @Override
    public String ag() {
        return llIIlIlIII[llIIlIlIIl[43]];
    }

    private static boolean lIlIlIlIIlIII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[44])) {
            bl = llIIlIlIIl[1];
            0;
            if (2 == ((1 ^ 0x54) & ~(0xE5 ^ 0xB0))) {
                return (3 & ~3) != 0;
            }
        } else {
            bl = llIIlIlIIl[0];
        }
        return bl;
    }

    private static String lIlIlIlIIIIIl(String var3, String var15) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIIlIlIIl[12]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(llIIlIlIIl[3], var5);
            return new String(var19.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    static {
        ay.lIlIlIlIIIlII();
        ay.lIlIlIlIIIIll();
        oH = llIIlIlIIl[8];
        oG = llIIlIlIIl[7];
        bv = new ArrayList<d>();
    }

    public static void Q() {
        d var22;
        Object var14;
        int[] nArray = new int[llIIlIlIIl[1]];
        nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
        if (ay.lIlIlIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(llIIlIlIII[llIIlIlIIl[32]]);
            d d2 = new d(llIIlIlIIl[7], llIIlIlIIl[33], llIIlIlIIl[34]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIlIlIIl[1]];
        nArray2[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
        if (ay.lIlIlIlIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(llIIlIlIII[llIIlIlIIl[35]]);
            var14 = new d(llIIlIlIIl[8], llIIlIlIIl[1], llIIlIlIIl[36]);
            bv.add((d)var14);
            0;
        }
        if (ay.lIlIlIlIIIlll(Bank.contains(var14 = item -> item.getName().toLowerCase().contains(llIIlIlIII[llIIlIlIIl[45]])) ? 1 : 0)) {
            var22 = new d(llIIlIlIIl[37], llIIlIlIIl[9], llIIlIlIIl[38]);
            bv.add(var22);
            0;
        }
        int[] nArray3 = new int[llIIlIlIIl[1]];
        nArray3[ay.llIIlIlIIl[0]] = llIIlIlIIl[39];
        if (ay.lIlIlIlIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var22 = new d(llIIlIlIIl[39], llIIlIlIIl[40], llIIlIlIIl[41]);
            bv.add(var22);
            0;
        }
    }

    private static boolean lIlIlIlIIIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public int af() {
        ay.fi();
        return llIIlIlIIl[42];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        int[] nArray = new int[llIIlIlIIl[1]];
        nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
        if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llIIlIlIIl[1]];
            nArray2[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
            if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray2))) {
                n2 = llIIlIlIIl[1];
                0;
                if (-1 < 0) return n2 != 0;
                return false;
            }
        }
        n2 = llIIlIlIIl[0];
        return n2 != 0;
    }

    private static boolean lIlIlIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return llIIlIlIIl[0];
    }

    private static String lIlIlIlIIIIII(String var6, String var21) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llIIlIlIIl[3], var13);
            return new String(var1.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIIIIll() {
        llIIlIlIII = new String[llIIlIlIIl[46]];
        ay.llIIlIlIII[ay.llIIlIlIIl[0]] = ay."Buying items";
        ay.llIIlIlIII[ay.llIIlIlIIl[1]] = ay."Finished buying items, switching back to crafting";
        ay.llIIlIlIII[ay.llIIlIlIIl[3]] = ay."Navigating to bank";
        ay.llIIlIlIII[ay.llIIlIlIIl[4]] = ay."Opening bank";
        ay.llIIlIlIII[ay.llIIlIlIIl[6]] = ay."Handling banking";
        ay.llIIlIlIII[ay.llIIlIlIIl[9]] = ay."We are missing supplies, switching to BUYING";
        ay.llIIlIlIII[ay.llIIlIlIIl[10]] = ay."Crafting ";
        ay.llIIlIlIII[ay.llIIlIlIIl[11]] = ay."Crafting glass";
        ay.llIIlIlIII[ay.llIIlIlIIl[12]] = ay."Beer glass";
        ay.llIIlIlIII[ay.llIIlIlIIl[15]] = ay."Crafting candle lantern";
        ay.llIIlIlIII[ay.llIIlIlIIl[17]] = ay."Crafting lamp";
        ay.llIIlIlIII[ay.llIIlIlIIl[18]] = ay."Oil lamp";
        ay.llIIlIlIII[ay.llIIlIlIIl[14]] = ay."Crafting vial";
        ay.llIIlIlIII[ay.llIIlIlIIl[20]] = ay."Vial";
        ay.llIIlIlIII[ay.llIIlIlIIl[22]] = ay."Crafting fishbowl";
        ay.llIIlIlIII[ay.llIIlIlIIl[23]] = ay."Fishbowl";
        ay.llIIlIlIII[ay.llIIlIlIIl[25]] = ay."Crafting orb";
        ay.llIIlIlIII[ay.llIIlIlIIl[26]] = ay."Unpowered staff orb";
        ay.llIIlIlIII[ay.llIIlIlIIl[28]] = ay."Crafting lens";
        ay.llIIlIlIII[ay.llIIlIlIIl[29]] = ay."Lantern lens";
        ay.llIIlIlIII[ay.llIIlIlIIl[30]] = ay."Crafting light orb";
        ay.llIIlIlIII[ay.llIIlIlIIl[31]] = ay."Light orb";
        ay.llIIlIlIII[ay.llIIlIlIIl[32]] = ay."Buying molten glass";
        ay.llIIlIlIII[ay.llIIlIlIIl[35]] = ay."Buying glassblowing pipe";
        ay.llIIlIlIII[ay.llIIlIlIIl[43]] = ay."Crafting";
        ay.llIIlIlIII[ay.llIIlIlIIl[45]] = ay."ring of wealth (";
    }

    private static String lIlIlIlIIIIlI(String var4, String var23) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var8 = var23.toCharArray();
        int var11 = llIIlIlIIl[0];
        char[] var9 = var4.toCharArray();
        int var7 = var9.length;
        int var16 = llIIlIlIIl[0];
        while (ay.lIlIlIlIIIllI(var16, var7)) {
            char var18 = var9[var16];
            var10.append((char)(var18 ^ var8[var11 % var8.length]));
            0;
            ++var11;
            ++var16;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean lIlIlIlIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIlIIl(Object object) {
        return object != null;
    }

    private static void lIlIlIlIIIlII() {
        llIIlIlIIl = new int[47];
        ay.llIIlIlIIl[0] = (0xA2 ^ 0x8D) & ~(0x3B ^ 0x14);
        ay.llIIlIlIIl[1] = 1;
        ay.llIIlIlIIl[2] = -(0xFFFFDAFD & 0x7D1B) & (0xFFFFFFFF & 0x5BFB);
        ay.llIIlIlIIl[3] = 2;
        ay.llIIlIlIIl[4] = 3;
        ay.llIIlIlIIl[5] = -(0xFFFFFE7D & 0x69E7) & (0xFFFFFBFC & 0x7FEF);
        ay.llIIlIlIIl[6] = 0x13 ^ 0x2D ^ (0x7A ^ 0x40);
        ay.llIIlIlIIl[7] = -(0xFFFFFF83 & 0x587D) & (0xFFFFDEFF & 0x7FEF);
        ay.llIIlIlIIl[8] = 0xFFFFDFFF & 0x26F9;
        ay.llIIlIlIIl[9] = 0x85 ^ 0x80;
        ay.llIIlIlIIl[10] = 82 + 133 - 113 + 75 ^ 121 + 12 - -50 + 0;
        ay.llIIlIlIIl[11] = 0x7C ^ 0x7B;
        ay.llIIlIlIIl[12] = 0x24 ^ 0x2C;
        ay.llIIlIlIIl[13] = 0xFFFFFBDD & 0xE6B2;
        ay.llIIlIlIIl[14] = 0x17 ^ 6 ^ (0x95 ^ 0x88);
        ay.llIIlIlIIl[15] = 0xBF ^ 0x85 ^ (0x51 ^ 0x62);
        ay.llIIlIlIIl[16] = 0x22 ^ 3;
        ay.llIIlIlIIl[17] = 134 + 31 - 89 + 80 ^ 133 + 3 - 42 + 56;
        ay.llIIlIlIIl[18] = 0x43 ^ 0x35 ^ (0x6A ^ 0x17);
        ay.llIIlIlIIl[19] = 0x38 ^ 0x3F ^ (0x5E ^ 0x73);
        ay.llIIlIlIIl[20] = 133 + 1 - 90 + 163 ^ 0 + 68 - 56 + 182;
        ay.llIIlIlIIl[21] = 0x9D ^ 0xB3;
        ay.llIIlIlIIl[22] = 0xB6 ^ 0x96 ^ (0xBD ^ 0x93);
        ay.llIIlIlIIl[23] = 0x91 ^ 0x9E;
        ay.llIIlIlIIl[24] = 0x27 ^ 0x16;
        ay.llIIlIlIIl[25] = 0x83 ^ 0x93;
        ay.llIIlIlIIl[26] = 0x41 ^ 0x50;
        ay.llIIlIlIIl[27] = 1 ^ 0x34 ^ (0x6C ^ 0xE);
        ay.llIIlIlIIl[28] = 0x74 ^ 0x27 ^ (0xF1 ^ 0xB0);
        ay.llIIlIlIIl[29] = 65 + 112 - 48 + 38 ^ 1 + 139 - -30 + 10;
        ay.llIIlIlIIl[30] = 41 + 49 - 38 + 82 ^ 41 + 13 - 35 + 127;
        ay.llIIlIlIIl[31] = 165 + 168 - 246 + 100 ^ 113 + 24 - 87 + 124;
        ay.llIIlIlIIl[32] = 0x2C ^ 0x3A;
        ay.llIIlIlIIl[33] = -(0xFFFFBF9D & 0x78E3) & (0xFFFFFFFA & 0x3FBF);
        ay.llIIlIlIIl[34] = 0x4A ^ 0x27 ^ 3;
        ay.llIIlIlIIl[35] = 139 + 162 - 134 + 19 ^ 122 + 157 - 194 + 88;
        ay.llIIlIlIIl[36] = -(0xFFFFC71E & 0x7AF3) & (0xFFFFFFFB & 0x57FF);
        ay.llIIlIlIIl[37] = -(0xFFFFD1BE & 0x3F55) & (0xFFFFFFDF & 0x3FFF);
        ay.llIIlIlIIl[38] = -(0x7C ^ 0x3E) & (0xFFFFF7EB & 0x69FD);
        ay.llIIlIlIIl[39] = 0xFFFFFFF7 & 0x1F4F;
        ay.llIIlIlIIl[40] = 0x14 ^ 0x3C;
        ay.llIIlIlIIl[41] = 0xFFFFBBBD & 0x47C6;
        ay.llIIlIlIIl[42] = 0x8F ^ 0xA0 ^ (0x3B ^ 0x70);
        ay.llIIlIlIIl[43] = 0x1F ^ 7;
        ay.llIIlIlIIl[44] = 0x5A ^ 0x39;
        ay.llIIlIlIIl[45] = 38 + 46 - -99 + 7 ^ 53 + 136 - 127 + 105;
        ay.llIIlIlIIl[46] = 0xD4 ^ 0xA7 ^ (0x19 ^ 0x70);
    }

    public static void fi() {
        block29: {
            BankLocation var20;
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                if (ay.lIlIlIlIIIlIl(bt ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[0]];
                                    b.a(bv);
                                    if (ay.lIlIlIlIIIllI(bv.size(), llIIlIlIIl[1])) {
                                        System.out.println(llIIlIlIII[llIIlIlIIl[1]]);
                                        bt = llIIlIlIIl[0];
                                    }
                                }
                                if (!ay.lIlIlIlIIIlll(bt ? 1 : 0)) break block29;
                                if (!ay.lIlIlIlIIIlIl(ay.an() ? 1 : 0)) break block30;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[2];
                                if (!ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray))) break block31;
                            }
                            if (ay.lIlIlIlIIlIIl(var20 = BankLocation.getNearest()) && ay.lIlIlIlIIIlll(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[3]];
                                a.a(var20);
                            }
                            if (!ay.lIlIlIlIIlIIl(var20) || !ay.lIlIlIlIIIlIl(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (ay.lIlIlIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[4]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIlIIl[5]);
                                0;
                            }
                            if (!ay.lIlIlIlIIIlIl(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[6]];
                            if (ay.lIlIlIlIIlIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlIlIIl[4]);
                                0;
                            }
                            if (ay.lIlIlIlIIlIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIlIlIIl[3]);
                                0;
                            }
                            int[] nArray = new int[llIIlIlIIl[1]];
                            nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                            if (!ay.lIlIlIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray2 = new int[llIIlIlIIl[1]];
                            nArray2[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                            if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray2), llIIlIlIIl[1])) break block33;
                        }
                        int[] nArray = new int[llIIlIlIIl[1]];
                        nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                        if (!ay.lIlIlIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray3 = new int[llIIlIlIIl[1]];
                        nArray3[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                        if (!ay.lIlIlIlIIIllI(Inventory.getCount((int[])nArray3), llIIlIlIIl[1])) break block34;
                    }
                    ay.Q();
                    System.out.println(llIIlIlIII[llIIlIlIIl[9]]);
                    bt = llIIlIlIIl[1];
                    return;
                }
                int[] nArray = new int[llIIlIlIIl[1]];
                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                if (ay.lIlIlIlIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llIIlIlIIl[1]];
                    nArray4[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                    if (ay.lIlIlIlIIIllI(Inventory.getCount((int[])nArray4), llIIlIlIIl[1])) {
                        Bank.withdraw((int)llIIlIlIIl[8], (int)llIIlIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIlIlIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIlIlIIl[1]];
                            nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                            if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = llIIlIlIIl[1];
                                0;
                                if (2 <= 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIlIlIIl[0];
                            }
                            return bl;
                        }, (int)llIIlIlIIl[5]);
                        0;
                    }
                }
                int[] nArray5 = new int[llIIlIlIIl[1]];
                nArray5[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                if (ay.lIlIlIlIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[llIIlIlIIl[1]];
                    nArray6[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                    if (ay.lIlIlIlIIIllI(Inventory.getCount((int[])nArray6), llIIlIlIIl[1])) {
                        int[] nArray7 = new int[llIIlIlIIl[1]];
                        nArray7[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                        if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray7))) {
                            Bank.withdrawAll((int)llIIlIlIIl[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIIlIlIIl[1]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray))) {
                                    bl = llIIlIlIIl[1];
                                    0;
                                    if (1 != 1) {
                                        return ((0x2F ^ 0x77 ^ (0x5C ^ 0x30)) & (0x67 ^ 0x51 ^ 2 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[5]);
                            0;
                        }
                    }
                }
            }
            if (ay.lIlIlIlIIIlIl(ay.an() ? 1 : 0)) {
                if (ay.lIlIlIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (ay.lIlIlIlIIIlll(Bank.isOpen() ? 1 : 0) && ay.lIlIlIlIIIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[10]];
                    if (ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (ay.lIlIlIlIIIlll(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)llIIlIlIIl[3]);
                        0;
                        int[] nArray = new int[llIIlIlIIl[1]];
                        nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                        var20 = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[llIIlIlIIl[1]];
                        nArray8[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                        Item var2 = Inventory.getFirst((int[])nArray8);
                        if (ay.lIlIlIlIIlIIl(var20) && ay.lIlIlIlIIlIIl(var2)) {
                            var20.useOn(var2);
                            Time.sleepUntil(() -> Production.isOpen(), (int)llIIlIlIIl[5]);
                            0;
                        }
                    }
                    if (ay.lIlIlIlIIIlIl(Production.isOpen() ? 1 : 0)) {
                        if (ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[6])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[11]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[12]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];
                                    0;
                                    if (((0xB8 ^ 0x94 ^ (0x10 ^ 0x28)) & (0x3D ^ 0x18 ^ (0xF3 ^ 0xC2) ^ -1)) <= -1) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);
                            0;
                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[6]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[14])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[15]];
                            Production.chooseOption((int)llIIlIlIIl[3]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];
                                    0;
                                    if (((0x4F ^ 0x5D) & ~(0x84 ^ 0x96)) != 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);
                            0;
                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[14]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[16])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[17]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[18]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];
                                    0;
                                    if ((0x4C ^ 0x48) == 3) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);
                            0;
                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[16]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[19])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[14]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[20]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];
                                    0;
                                    if (3 < 1) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);
                            0;
                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[19]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[21])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[22]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[23]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];
                                    0;
                                    if (-2 > 0) {
                                        return ((5 ^ 0x33 ^ (0xC0 ^ 0xB6)) & (80 + 190 - 235 + 187 ^ 138 + 26 - 16 + 10 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);
                            0;
                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[21]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[24])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[25]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[26]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];
                                    0;
                                    if (3 < ((0x52 ^ 0x69) & ~(0xB2 ^ 0x89))) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);
                            0;
                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[24]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[27])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[28]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[29]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];
                                    0;
                                    if (1 <= -1) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);
                            0;
                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[27])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[30]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[31]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];
                                    0;
                                    if (3 < 0) {
                                        return ((0x64 ^ 0x24 ^ (3 ^ 0xB)) & (0x53 ^ 0x6A ^ (0x7E ^ 0xF) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);
                            0;
                        }
                    }
                }
            }
        }
    }
}

