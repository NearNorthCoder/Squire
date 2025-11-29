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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
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

public class V
implements K {
    private static /* synthetic */ String[] lIlIllIlll;
    public static final /* synthetic */ int kG;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] lIlIlllIII;
    public static /* synthetic */ List<d> bp;
    public static final /* synthetic */ int kF;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean al() {
        int n2;
        int[] nArray = new int[lIlIlllIII[1]];
        nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
        if (V.lIIlIIlllIIIl(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIlIlllIII[1]];
            nArray2[V.lIlIlllIII[0]] = lIlIlllIII[8];
            if (V.lIIlIIlllIIIl(Inventory.getCount((int[])nArray2))) {
                n2 = lIlIlllIII[1];
                0;
                if (((0x37 ^ 0x32) & ~(0x92 ^ 0x97)) >= -1) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIlllIII[0];
        return n2 != 0;
    }

    public static void O() {
        d var15;
        Object var20;
        int[] nArray = new int[lIlIlllIII[1]];
        nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
        if (V.lIIlIIlllIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIlIllIlll[lIlIlllIII[32]]);
            d d2 = new d(lIlIlllIII[7], lIlIlllIII[33], lIlIlllIII[34]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIlllIII[1]];
        nArray2[V.lIlIlllIII[0]] = lIlIlllIII[8];
        if (V.lIIlIIlllIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(lIlIllIlll[lIlIlllIII[35]]);
            var20 = new d(lIlIlllIII[8], lIlIlllIII[1], lIlIlllIII[36]);
            bp.add((d)var20);
            0;
        }
        if (V.lIIlIIlllIIII(Bank.contains(var20 = item -> item.getName().toLowerCase().contains(lIlIllIlll[lIlIlllIII[45]])) ? 1 : 0)) {
            var15 = new d(lIlIlllIII[37], lIlIlllIII[9], lIlIlllIII[38]);
            bp.add(var15);
            0;
        }
        int[] nArray3 = new int[lIlIlllIII[1]];
        nArray3[V.lIlIlllIII[0]] = lIlIlllIII[39];
        if (V.lIIlIIlllIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var15 = new d(lIlIlllIII[39], lIlIlllIII[40], lIlIlllIII[41]);
            bp.add(var15);
            0;
        }
    }

    private static boolean lIIlIIlllIIlI(Object object) {
        return object != null;
    }

    static {
        V.lIIlIIllIllIl();
        V.lIIlIIllIllII();
        kF = lIlIlllIII[7];
        kG = lIlIlllIII[8];
        bp = new ArrayList<d>();
    }

    private static String lIIlIIllIlIIl(String var19, String var16) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIlllIII[3], var6);
            return new String(var5.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllIlIll(String var10, String var17) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIlIlllIII[12]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIlIlllIII[3], var11);
            return new String(var1.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean af() {
        boolean bl;
        if (V.lIIlIIlllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[44])) {
            bl = lIlIlllIII[1];
            0;
            if (((0xEF ^ 0xAF) & ~(0x12 ^ 0x52)) < 0) {
                return false;
            }
        } else {
            bl = lIlIlllIII[0];
        }
        return bl;
    }

    private static String lIIlIIllIlIlI(String var18, String var9) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var23 = var9.toCharArray();
        int var3 = lIlIlllIII[0];
        char[] var22 = var18.toCharArray();
        int var13 = var22.length;
        int var7 = lIlIlllIII[0];
        while (V.lIIlIIllIllll(var7, var13)) {
            char var4 = var22[var7];
            var21.append((char)(var4 ^ var23[var3 % var23.length]));
            0;
            ++var3;
            ++var7;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    @Override
    public String ae() {
        return lIlIllIlll[lIlIlllIII[43]];
    }

    @Override
    public int ad() {
        V.dr();
        return lIlIlllIII[42];
    }

    private static boolean lIIlIIlllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIIllIllIl() {
        lIlIlllIII = new int[47];
        V.lIlIlllIII[0] = (3 + 56 - -80 + 72 ^ 15 + 43 - -86 + 12) & (0xDC ^ 0x9A ^ (0xB9 ^ 0xB0) ^ -1);
        V.lIlIlllIII[1] = 1;
        V.lIlIlllIII[2] = 0xFFFFE7F7 & 0x1BEB;
        V.lIlIlllIII[3] = 2;
        V.lIlIlllIII[4] = 3;
        V.lIlIlllIII[5] = 0xFFFF97B9 & 0x7BCE;
        V.lIlIlllIII[6] = 0x68 ^ 0xF ^ (0xE6 ^ 0x85);
        V.lIlIlllIII[7] = -(0xFFFFBDBF & 0x7B51) & (0xFFFFFFFF & 0x3FFF);
        V.lIlIlllIII[8] = 0xFFFF9EF9 & 0x67FF;
        V.lIlIlllIII[9] = 0x52 ^ 0x57;
        V.lIlIlllIII[10] = 0x28 ^ 0x2E;
        V.lIlIlllIII[11] = 8 ^ 0xF;
        V.lIlIlllIII[12] = 0x80 ^ 0x88;
        V.lIlIlllIII[13] = -(0xFFFFA9E5 & 0x5F5B) & (0xFFFFFFDE & 0xEBF1);
        V.lIlIlllIII[14] = 0x65 ^ 0x69;
        V.lIlIlllIII[15] = 0xCD ^ 0xC4;
        V.lIlIlllIII[16] = 0xF ^ 0x6F ^ (0xFD ^ 0xBC);
        V.lIlIlllIII[17] = 0x78 ^ 0x64 ^ (0xA8 ^ 0xBE);
        V.lIlIlllIII[18] = 0x3B ^ 0x28 ^ (0x75 ^ 0x6D);
        V.lIlIlllIII[19] = 0xF2 ^ 0x97 ^ (0xC3 ^ 0x8C);
        V.lIlIlllIII[20] = 0x35 ^ 0x5F ^ (0x39 ^ 0x5E);
        V.lIlIlllIII[21] = 42 + 31 - -24 + 88 ^ 17 + 39 - -37 + 58;
        V.lIlIlllIII[22] = 0x2C ^ 0x22;
        V.lIlIlllIII[23] = 0x3A ^ 0x35;
        V.lIlIlllIII[24] = 0xFC ^ 0x93 ^ (0xE0 ^ 0xBE);
        V.lIlIlllIII[25] = 0x64 ^ 4 ^ (0x1C ^ 0x6C);
        V.lIlIlllIII[26] = 0x85 ^ 0x94;
        V.lIlIlllIII[27] = 0x7D ^ 0x2A;
        V.lIlIlllIII[28] = 0xD2 ^ 0xC0;
        V.lIlIlllIII[29] = 0x9C ^ 0x87 ^ (0xB6 ^ 0xBE);
        V.lIlIlllIII[30] = 0x4E ^ 0x57 ^ (0x12 ^ 0x1F);
        V.lIlIlllIII[31] = 0x17 ^ 2;
        V.lIlIlllIII[32] = 0x5C ^ 0x4A;
        V.lIlIlllIII[33] = -(0xFFFFF0F5 & 0x5FCF) & (0xFFFFD7FF & 0x7FFE);
        V.lIlIlllIII[34] = 0x1F ^ 0x71;
        V.lIlIlllIII[35] = 0x44 ^ 0x53;
        V.lIlIlllIII[36] = 0xFFFF9DFA & 0x77EF;
        V.lIlIlllIII[37] = -(0xFFFFB9B7 & 0x577B) & (0xFFFFBFFF & 0x7FFE);
        V.lIlIlllIII[38] = 0xFFFFFDAC & 0x63FB;
        V.lIlIlllIII[39] = -(0xFFFFBE9B & 0x617D) & (0xFFFFBF7F & 0x7FDF);
        V.lIlIlllIII[40] = 0x30 ^ 0x70 ^ (0x56 ^ 0x3E);
        V.lIlIlllIII[41] = 0xFFFFEFF7 & 0x138C;
        V.lIlIlllIII[42] = 0x68 ^ 0xC;
        V.lIlIlllIII[43] = 0x86 ^ 0x9E;
        V.lIlIlllIII[44] = 0xF9 ^ 0x8F ^ (0x1A ^ 0xF);
        V.lIlIlllIII[45] = 0x93 ^ 0x8B ^ 1;
        V.lIlIlllIII[46] = 0xB2 ^ 0xC5 ^ (0x24 ^ 0x49);
    }

    private static boolean lIIlIIlllIIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIllIllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ac() {
        return lIlIlllIII[0];
    }

    private static boolean lIIlIIllIlllI(int n2) {
        return n2 != 0;
    }

    public static void dr() {
        block29: {
            BankLocation var8;
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                if (V.lIIlIIllIlllI(bn ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[0]];
                                    b.a(bp);
                                    if (V.lIIlIIllIllll(bp.size(), lIlIlllIII[1])) {
                                        System.out.println(lIlIllIlll[lIlIlllIII[1]]);
                                        bn = lIlIlllIII[0];
                                    }
                                }
                                if (!V.lIIlIIlllIIII(bn ? 1 : 0)) break block29;
                                if (!V.lIIlIIllIlllI(V.al() ? 1 : 0)) break block30;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[2];
                                if (!V.lIIlIIlllIIIl(Inventory.getCount((int[])nArray))) break block31;
                            }
                            if (V.lIIlIIlllIIlI(var8 = BankLocation.getNearest()) && V.lIIlIIlllIIII(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[3]];
                                a.a(var8);
                            }
                            if (!V.lIIlIIlllIIlI(var8) || !V.lIIlIIllIlllI(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (V.lIIlIIlllIIII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[4]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlllIII[5]);
                                0;
                            }
                            if (!V.lIIlIIllIlllI(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[6]];
                            if (V.lIIlIIlllIIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIlllIII[4]);
                                0;
                            }
                            if (V.lIIlIIlllIIIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIlllIII[3]);
                                0;
                            }
                            int[] nArray = new int[lIlIlllIII[1]];
                            nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                            if (!V.lIIlIIlllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray2 = new int[lIlIlllIII[1]];
                            nArray2[V.lIlIlllIII[0]] = lIlIlllIII[7];
                            if (!V.lIIlIIlllIIll(Inventory.getCount((int[])nArray2), lIlIlllIII[1])) break block33;
                        }
                        int[] nArray = new int[lIlIlllIII[1]];
                        nArray[V.lIlIlllIII[0]] = lIlIlllIII[8];
                        if (!V.lIIlIIlllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray3 = new int[lIlIlllIII[1]];
                        nArray3[V.lIlIlllIII[0]] = lIlIlllIII[8];
                        if (!V.lIIlIIllIllll(Inventory.getCount((int[])nArray3), lIlIlllIII[1])) break block34;
                    }
                    V.O();
                    System.out.println(lIlIllIlll[lIlIlllIII[9]]);
                    bn = lIlIlllIII[1];
                    return;
                }
                int[] nArray = new int[lIlIlllIII[1]];
                nArray[V.lIlIlllIII[0]] = lIlIlllIII[8];
                if (V.lIIlIIllIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIlllIII[1]];
                    nArray4[V.lIlIlllIII[0]] = lIlIlllIII[8];
                    if (V.lIIlIIllIllll(Inventory.getCount((int[])nArray4), lIlIlllIII[1])) {
                        Bank.withdraw((int)lIlIlllIII[8], (int)lIlIlllIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlllIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlllIII[1]];
                            nArray[V.lIlIlllIII[0]] = lIlIlllIII[8];
                            if (V.lIIlIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlllIII[1];
                                0;
                                if (1 == ((122 + 4 - 3 + 89 ^ 59 + 9 - 7 + 133) & (0x5D ^ 0x45 ^ (0xBC ^ 0xB2) ^ -1))) {
                                    return ((133 + 146 - 241 + 143 ^ 111 + 85 - 103 + 41) & (0x24 ^ 0x61 ^ (0x5D ^ 0x2B) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIlllIII[0];
                            }
                            return bl;
                        }, (int)lIlIlllIII[5]);
                        0;
                    }
                }
                int[] nArray5 = new int[lIlIlllIII[1]];
                nArray5[V.lIlIlllIII[0]] = lIlIlllIII[7];
                if (V.lIIlIIllIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIlIlllIII[1]];
                    nArray6[V.lIlIlllIII[0]] = lIlIlllIII[7];
                    if (V.lIIlIIllIllll(Inventory.getCount((int[])nArray6), lIlIlllIII[1])) {
                        int[] nArray7 = new int[lIlIlllIII[1]];
                        nArray7[V.lIlIlllIII[0]] = lIlIlllIII[8];
                        if (V.lIIlIIlllIIIl(Inventory.getCount((int[])nArray7))) {
                            Bank.withdrawAll((int)lIlIlllIII[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIlIlllIII[1]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                                if (V.lIIlIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                    bl = lIlIlllIII[1];
                                    0;
                                    if (-1 > ((86 + 131 - 189 + 105 ^ 95 + 13 - 87 + 108) & (93 + 46 - 119 + 153 ^ 10 + 58 - -6 + 95 ^ -1))) {
                                        return ((0x3A ^ 0x63 ^ (0x21 ^ 0x2F)) & (199 + 34 - 125 + 124 ^ 5 + 87 - -49 + 50 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlllIII[0];
                                }
                                return bl;
                            }, (int)lIlIlllIII[5]);
                            0;
                        }
                    }
                }
            }
            if (V.lIIlIIllIlllI(V.al() ? 1 : 0)) {
                if (V.lIIlIIllIlllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (V.lIIlIIlllIIII(Bank.isOpen() ? 1 : 0) && V.lIIlIIlllIIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[10]];
                    if (V.lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (V.lIIlIIlllIIII(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)lIlIlllIII[3]);
                        0;
                        int[] nArray = new int[lIlIlllIII[1]];
                        nArray[V.lIlIlllIII[0]] = lIlIlllIII[8];
                        var8 = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[lIlIlllIII[1]];
                        nArray8[V.lIlIlllIII[0]] = lIlIlllIII[7];
                        Item var14 = Inventory.getFirst((int[])nArray8);
                        if (V.lIIlIIlllIIlI(var8) && V.lIIlIIlllIIlI(var14)) {
                            var8.useOn(var14);
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIlIlllIII[5]);
                            0;
                        }
                    }
                    if (V.lIIlIIllIlllI(Production.isOpen() ? 1 : 0)) {
                        if (V.lIIlIIllIllll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[6])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[11]];
                            Production.chooseOption((String)lIlIllIlll[lIlIlllIII[12]]);
                            Time.sleepTicks((int)lIlIlllIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!V.lIIlIIlllIIll(Inventory.getCount((int[])nArray), lIlIlllIII[1]) || V.lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlllIII[1];
                                    0;
                                    if (2 >= (0xB9 ^ 0xBD)) {
                                        return false;
                                    }
                                } else {
                                    bl = lIlIlllIII[0];
                                }
                                return bl;
                            }, (int)lIlIlllIII[13]);
                            0;
                        }
                        if (V.lIIlIIlllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[6]) && V.lIIlIIllIllll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[14])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[15]];
                            Production.chooseOption((int)lIlIlllIII[3]);
                            Time.sleepTicks((int)lIlIlllIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!V.lIIlIIlllIIll(Inventory.getCount((int[])nArray), lIlIlllIII[1]) || V.lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlllIII[1];
                                    0;
                                    if (2 <= 0) {
                                        return ((0x4E ^ 0x13 ^ (0x25 ^ 0x36)) & (0xB6 ^ 0x90 ^ (0xD2 ^ 0xBA) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlllIII[0];
                                }
                                return bl;
                            }, (int)lIlIlllIII[13]);
                            0;
                        }
                        if (V.lIIlIIlllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[14]) && V.lIIlIIllIllll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[16])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[17]];
                            Production.chooseOption((String)lIlIllIlll[lIlIlllIII[18]]);
                            Time.sleepTicks((int)lIlIlllIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!V.lIIlIIlllIIll(Inventory.getCount((int[])nArray), lIlIlllIII[1]) || V.lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlllIII[1];
                                    0;
                                    if (((0x6F ^ 0x24) & ~(0x8D ^ 0xC6)) < 0) {
                                        return ((0xEC ^ 0xAC) & ~(0x5F ^ 0x1F) & ~((0x7A ^ 0x30) & ~(0x42 ^ 8))) != 0;
                                    }
                                } else {
                                    bl = lIlIlllIII[0];
                                }
                                return bl;
                            }, (int)lIlIlllIII[13]);
                            0;
                        }
                        if (V.lIIlIIlllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[16]) && V.lIIlIIllIllll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[19])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[14]];
                            Production.chooseOption((String)lIlIllIlll[lIlIlllIII[20]]);
                            Time.sleepTicks((int)lIlIlllIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!V.lIIlIIlllIIll(Inventory.getCount((int[])nArray), lIlIlllIII[1]) || V.lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlllIII[1];
                                    0;
                                    if (-1 < -1) {
                                        return ((52 + 128 - 32 + 0 ^ 10 + 33 - -112 + 5) & (0xFC ^ 0x9F ^ (0xD1 ^ 0x86) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlllIII[0];
                                }
                                return bl;
                            }, (int)lIlIlllIII[13]);
                            0;
                        }
                        if (V.lIIlIIlllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[19]) && V.lIIlIIllIllll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[21])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[22]];
                            Production.chooseOption((String)lIlIllIlll[lIlIlllIII[23]]);
                            Time.sleepTicks((int)lIlIlllIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!V.lIIlIIlllIIll(Inventory.getCount((int[])nArray), lIlIlllIII[1]) || V.lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlllIII[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = lIlIlllIII[0];
                                }
                                return bl;
                            }, (int)lIlIlllIII[13]);
                            0;
                        }
                        if (V.lIIlIIlllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[21]) && V.lIIlIIllIllll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[24])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[25]];
                            Production.chooseOption((String)lIlIllIlll[lIlIlllIII[26]]);
                            Time.sleepTicks((int)lIlIlllIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!V.lIIlIIlllIIll(Inventory.getCount((int[])nArray), lIlIlllIII[1]) || V.lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlllIII[1];
                                    0;
                                    if (((0xB5 ^ 0xBD ^ (0x1D ^ 0x25)) & (98 + 24 - 63 + 116 ^ 134 + 111 - 204 + 118 ^ -1)) != 0) {
                                        return ((0x51 ^ 0x68 ^ (0x2D ^ 0x2A)) & (0xB0 ^ 0xB7 ^ (0x4F ^ 0x76) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlllIII[0];
                                }
                                return bl;
                            }, (int)lIlIlllIII[13]);
                            0;
                        }
                        if (V.lIIlIIlllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[24]) && V.lIIlIIllIllll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[27])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[28]];
                            Production.chooseOption((String)lIlIllIlll[lIlIlllIII[29]]);
                            Time.sleepTicks((int)lIlIlllIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!V.lIIlIIlllIIll(Inventory.getCount((int[])nArray), lIlIlllIII[1]) || V.lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlllIII[1];
                                    0;
                                    if (3 == 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIlIlllIII[0];
                                }
                                return bl;
                            }, (int)lIlIlllIII[13]);
                            0;
                        }
                        if (V.lIIlIIlllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIII[27])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[30]];
                            Production.chooseOption((String)lIlIllIlll[lIlIlllIII[31]]);
                            Time.sleepTicks((int)lIlIlllIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlllIII[1]];
                                nArray[V.lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!V.lIIlIIlllIIll(Inventory.getCount((int[])nArray), lIlIlllIII[1]) || V.lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlllIII[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = lIlIlllIII[0];
                                }
                                return bl;
                            }, (int)lIlIlllIII[13]);
                            0;
                        }
                    }
                }
            }
        }
    }

    private static void lIIlIIllIllII() {
        lIlIllIlll = new String[lIlIlllIII[46]];
        V.lIlIllIlll[V.lIlIlllIII[0]] = V."Buying items";
        V.lIlIllIlll[V.lIlIlllIII[1]] = V."Finished buying items, switching back to crafting";
        V.lIlIllIlll[V.lIlIlllIII[3]] = V."Navigating to bank";
        V.lIlIllIlll[V.lIlIlllIII[4]] = V."Opening bank";
        V.lIlIllIlll[V.lIlIlllIII[6]] = V."Handling banking";
        V.lIlIllIlll[V.lIlIlllIII[9]] = V."We are missing supplies, switching to BUYING";
        V.lIlIllIlll[V.lIlIlllIII[10]] = V."Crafting ";
        V.lIlIllIlll[V.lIlIlllIII[11]] = V."Crafting glass";
        V.lIlIllIlll[V.lIlIlllIII[12]] = V."Beer glass";
        V.lIlIllIlll[V.lIlIlllIII[15]] = V."Crafting candle lantern";
        V.lIlIllIlll[V.lIlIlllIII[17]] = V."Crafting lamp";
        V.lIlIllIlll[V.lIlIlllIII[18]] = V."Oil lamp";
        V.lIlIllIlll[V.lIlIlllIII[14]] = V."Crafting vial";
        V.lIlIllIlll[V.lIlIlllIII[20]] = V."Vial";
        V.lIlIllIlll[V.lIlIlllIII[22]] = V."Crafting fishbowl";
        V.lIlIllIlll[V.lIlIlllIII[23]] = V."Fishbowl";
        V.lIlIllIlll[V.lIlIlllIII[25]] = V."Crafting orb";
        V.lIlIllIlll[V.lIlIlllIII[26]] = V."Unpowered staff orb";
        V.lIlIllIlll[V.lIlIlllIII[28]] = V."Crafting lens";
        V.lIlIllIlll[V.lIlIlllIII[29]] = V."Lantern lens";
        V.lIlIllIlll[V.lIlIlllIII[30]] = V."Crafting light orb";
        V.lIlIllIlll[V.lIlIlllIII[31]] = V."Light orb";
        V.lIlIllIlll[V.lIlIlllIII[32]] = V."Buying molten glass";
        V.lIlIllIlll[V.lIlIlllIII[35]] = V."Buying glassblowing pipe";
        V.lIlIllIlll[V.lIlIlllIII[43]] = V."Crafting";
        V.lIlIllIlll[V.lIlIlllIII[45]] = V."ring of wealth (";
    }

    private static boolean lIIlIIlllIIII(int n2) {
        return n2 == 0;
    }
}

