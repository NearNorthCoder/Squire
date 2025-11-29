/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class aJ_Unknown
implements ac {
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ int pN;
    private static /* synthetic */ String[] lIlllllIIl;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint de;
    private static /* synthetic */ int[] lIlllllIll;
    private static /* synthetic */ String[] cE;

    public static void gY() {
        if (aJ.lIlIIIIlIlIIl(bt ? 1 : 0)) {
            b.a(bv);
            if (aJ.lIlIIIIlIlIlI(bv.size(), lIlllllIll[0])) {
                System.out.println(lIlllllIIl[lIlllllIll[1]]);
                bt = lIlllllIll[1];
            }
        }
        if (aJ.lIlIIIIlIlIll(bt ? 1 : 0)) {
            if (aJ.lIlIIIIlIlIll(aJ.an() ? 1 : 0) && aJ.lIlIIIIlIlIlI(e.j(pN), lIlllllIll[0])) {
                BankLocation var13 = BankLocation.getNearest();
                if (aJ.lIlIIIIlIllII(var13) && aJ.lIlIIIIlIlIll(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllllIIl[lIlllllIll[0]];
                    a.a(var13);
                }
                if (aJ.lIlIIIIlIllII(var13) && aJ.lIlIIIIlIlIIl(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (aJ.lIlIIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllllIll[2]);
                        0;
                    }
                    if (aJ.lIlIIIIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllIIl[lIlllllIll[3]];
                        if (aJ.lIlIIIIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllllIll[4]);
                            0;
                        }
                        if (aJ.lIlIIIIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllllIll[3]);
                            0;
                        }
                        int[] nArray = new int[lIlllllIll[3]];
                        nArray[aJ.lIlllllIll[1]] = lIlllllIll[5];
                        nArray[aJ.lIlllllIll[0]] = lIlllllIll[6];
                        if (aJ.lIlIIIIlIlIll(e.c(nArray) ? 1 : 0)) {
                            aJ.Q();
                            System.out.println(lIlllllIIl[lIlllllIll[7]]);
                            bt = lIlllllIll[0];
                            return;
                        }
                        int[] nArray2 = new int[lIlllllIll[3]];
                        nArray2[aJ.lIlllllIll[1]] = lIlllllIll[5];
                        nArray2[aJ.lIlllllIll[0]] = lIlllllIll[6];
                        if (aJ.lIlIIIIlIlIIl(e.c(nArray2) ? 1 : 0)) {
                            a.a(lIlllllIll[5], lIlllllIll[8]);
                            a.a(lIlllllIll[9], lIlllllIll[0]);
                        }
                    }
                }
            }
            if (aJ.lIlIIIIlIlIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && aJ.lIlIIIIlIlIlI(Movement.getRunEnergy(), lIlllllIll[10])) {
                Inventory.getFirst((int[])f.ba).interact(lIlllllIIl[lIlllllIll[4]]);
                Time.sleepTicks((int)lIlllllIll[0]);
                0;
            }
            if (aJ.lIlIIIIlIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0) && aJ.lIlIIIIlIlIlI(Prayers.getPoints(), lIlllllIll[11])) {
                Inventory.getFirst((int[])f.aX).interact(lIlllllIIl[lIlllllIll[12]]);
            }
            if (aJ.lIlIIIIlIlllI(aJ.lIlIIIIlIlIII(e.w(), 60.0))) {
                String[] stringArray = new String[lIlllllIll[0]];
                stringArray[aJ.lIlllllIll[1]] = lIlllllIIl[lIlllllIll[13]];
                if (aJ.lIlIIIIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlllllIll[0]];
                    stringArray2[aJ.lIlllllIll[1]] = lIlllllIIl[lIlllllIll[14]];
                    Inventory.getFirst((String[])stringArray2).interact(lIlllllIIl[lIlllllIll[15]]);
                    Time.sleepTicks((int)lIlllllIll[3]);
                    0;
                }
            }
            if (aJ.lIlIIIIlIlIIl(aJ.an() ? 1 : 0) && aJ.lIlIIIIlIlIll(e.j(pN))) {
                if (aJ.lIlIIIIlIllll(Players.getLocal().getWorldLocation().distanceTo(de), lIlllllIll[15])) {
                    AccBuilderSotf.c = lIlllllIIl[lIlllllIll[16]];
                    if (aJ.lIlIIIIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)de);
                    0;
                    Time.sleepTicks((int)lIlllllIll[0]);
                    0;
                }
                if (aJ.lIlIIIIllIIII(Players.getLocal().getWorldLocation().distanceTo(de), lIlllllIll[15])) {
                    g.a(lIlllllIIl[lIlllllIll[8]], cE);
                }
            }
        }
    }

    private static boolean lIlIIIIlIlllI(int n2) {
        return n2 < 0;
    }

    private static String lIlIIIIIlllII(String var11, String var2) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var17 = var2.toCharArray();
        int var1 = lIlllllIll[1];
        char[] var19 = var11.toCharArray();
        int var8 = var19.length;
        int var7 = lIlllllIll[1];
        while (aJ.lIlIIIIlIlIlI(var7, var8)) {
            char var21 = var19[var7];
            var14.append((char)(var21 ^ var17[var1 % var17.length]));
            0;
            ++var1;
            ++var7;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIlIIIIlIlIll(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIIIlllIl(String var18, String var4) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIlllllIll[3], var22);
            return new String(var16.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIIlIIlll() {
        lIlllllIll = new int[37];
        aJ.lIlllllIll[0] = 1;
        aJ.lIlllllIll[1] = (0x6A ^ 0x4E) & ~(0xB0 ^ 0x94);
        aJ.lIlllllIll[2] = -(0x61 ^ 0x13) & (0xFFFFD7F9 & 0x3BFF);
        aJ.lIlllllIll[3] = 2;
        aJ.lIlllllIll[4] = 0xAB ^ 0xAF;
        aJ.lIlllllIll[5] = -(0xFFFFEB3D & 0x54CB) & (0xFFFFDF7F & 0x7FCF);
        aJ.lIlllllIll[6] = -(0xFFFFE2BC & 0x7D77) & (0xFFFFFF7B & Short.MAX_VALUE);
        aJ.lIlllllIll[7] = 3;
        aJ.lIlllllIll[8] = 0x99 ^ 0x93;
        aJ.lIlllllIll[9] = -(0xFFFFFE99 & 0x45E7) & (0xFFFFF5FB & 0x7FD5);
        aJ.lIlllllIll[10] = 125 + 43 - 11 + 4 ^ 86 + 37 - 70 + 94;
        aJ.lIlllllIll[11] = 0xDB ^ 0xC3;
        aJ.lIlllllIll[12] = 0x3D ^ 9 ^ (0x6B ^ 0x5A);
        aJ.lIlllllIll[13] = 0x55 ^ 0x53;
        aJ.lIlllllIll[14] = 0x41 ^ 0x1C ^ (0xF9 ^ 0xA3);
        aJ.lIlllllIll[15] = 0x1E ^ 0x55 ^ (0x7E ^ 0x3D);
        aJ.lIlllllIll[16] = 0xEC ^ 0xB0 ^ (0x60 ^ 0x35);
        aJ.lIlllllIll[17] = 0xFFFFFF5A & 0x1FEF;
        aJ.lIlllllIll[18] = 0xFFFFD578 & 0x2FFF;
        aJ.lIlllllIll[19] = -(0xFFFFE3F7 & 0x5D3B) & (0xFFFFDFFF & 0x6772);
        aJ.lIlllllIll[20] = 175 + 186 - 329 + 189;
        aJ.lIlllllIll[21] = 0xFFFFABFB & 0x57EC;
        aJ.lIlllllIll[22] = 0x77 ^ 0x63;
        aJ.lIlllllIll[23] = -(0xFFFF9C3B & 0x73E6) & (0xFFFFBEFD & 0x7FEF);
        aJ.lIlllllIll[24] = 0xFFFFF1AA & 0x6FFD;
        aJ.lIlllllIll[25] = 0xFFFFC9B9 & 0x3FD6;
        aJ.lIlllllIll[26] = -(0xFFFFF14B & 0x6FBC) & (0xFFFFFFFF & 0x79B7);
        aJ.lIlllllIll[27] = -(0xFFFFF6B7 & 0x3F7F) & (0xFFFFB7BF & 0x7FF7);
        aJ.lIlllllIll[28] = 0xFFFFE3FE & 0x1FFD;
        aJ.lIlllllIll[29] = 0x18 ^ 0x17;
        aJ.lIlllllIll[30] = 0x27 ^ 8 ^ (0x40 ^ 0x47);
        aJ.lIlllllIll[31] = 0xFFFFDFD4 & 0x23AF;
        aJ.lIlllllIll[32] = 0x1E ^ 0x30 ^ (4 ^ 0x4E);
        aJ.lIlllllIll[33] = 1 ^ 0xA;
        aJ.lIlllllIll[34] = 0x37 ^ 0x3B;
        aJ.lIlllllIll[35] = 0x77 ^ 0x7A;
        aJ.lIlllllIll[36] = 0x93 ^ 0x9D;
    }

    private static boolean lIlIIIIlIllII(Object object) {
        return object != null;
    }

    static {
        aJ.lIlIIIIlIIlll();
        aJ.lIlIIIIlIIllI();
        bv = new ArrayList<d>();
        de = new WorldPoint(lIlllllIll[1], lIlllllIll[1], lIlllllIll[1]);
        pN = lIlllllIll[1];
        String[] stringArray = new String[lIlllllIll[0]];
        stringArray[aJ.lIlllllIll[1]] = lIlllllIIl[lIlllllIll[35]];
        cE = stringArray;
    }

    private static int lIlIIIIlIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var20;
        int[] nArray = new int[lIlllllIll[7]];
        nArray[aJ.lIlllllIll[1]] = lIlllllIll[5];
        nArray[aJ.lIlllllIll[0]] = lIlllllIll[17];
        nArray[aJ.lIlllllIll[3]] = lIlllllIll[9];
        int[] nArray2 = nArray;
        int var12 = lIlllllIll[1];
        while (aJ.lIlIIIIlIlIlI(var12, ((void)var20).length)) {
            int[] nArray3 = new int[lIlllllIll[0]];
            nArray3[aJ.lIlllllIll[1]] = var20[var12];
            if (aJ.lIlIIIIlIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIlllllIll[1];
            }
            ++var12;
            0;
            if (-(123 + 103 - 101 + 17 ^ 54 + 94 - 135 + 125) <= 0) continue;
            return ((0x91 ^ 0x8D ^ (1 ^ 0x2C)) & (0xF1 ^ 0x96 ^ (3 ^ 0x55) ^ -1)) != 0;
        }
        return lIlllllIll[0];
    }

    private static boolean lIlIIIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void Q() {
        block22: {
            d var10;
            block21: {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                Object var15;
                                block16: {
                                    block15: {
                                        int[] nArray = new int[lIlllllIll[0]];
                                        nArray[aJ.lIlllllIll[1]] = lIlllllIll[17];
                                        if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                                        int[] nArray2 = new int[lIlllllIll[0]];
                                        nArray2[aJ.lIlllllIll[1]] = lIlllllIll[17];
                                        if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block16;
                                        int[] nArray3 = new int[lIlllllIll[0]];
                                        nArray3[aJ.lIlllllIll[1]] = lIlllllIll[17];
                                        if (!aJ.lIlIIIIlIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIlllllIll[8])) break block16;
                                    }
                                    var15 = new d(lIlllllIll[17], lIlllllIll[8], e.c(lIlllllIll[18], lIlllllIll[19]));
                                    bv.add((d)var15);
                                    0;
                                }
                                int[] nArray = new int[lIlllllIll[0]];
                                nArray[aJ.lIlllllIll[1]] = lIlllllIll[20];
                                if (aJ.lIlIIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    var15 = new d(lIlllllIll[20], lIlllllIll[21], lIlllllIll[22]);
                                    bv.add((d)var15);
                                    0;
                                }
                                if (aJ.lIlIIIIlIlIll(Bank.contains((Predicate)(var15 = item -> item.getName().toLowerCase().contains(lIlllllIIl[lIlllllIll[34]]))) ? 1 : 0)) {
                                    var10 = new d(lIlllllIll[23], lIlllllIll[12], lIlllllIll[24]);
                                    bv.add(var10);
                                    0;
                                }
                                int[] nArray4 = new int[lIlllllIll[0]];
                                nArray4[aJ.lIlllllIll[1]] = lIlllllIll[25];
                                if (aJ.lIlIIIIlIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    var10 = new d(lIlllllIll[25], lIlllllIll[0], lIlllllIll[26]);
                                    bv.add(var10);
                                    0;
                                }
                                int[] nArray5 = new int[lIlllllIll[0]];
                                nArray5[aJ.lIlllllIll[1]] = lIlllllIll[9];
                                if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block17;
                                int[] nArray6 = new int[lIlllllIll[0]];
                                nArray6[aJ.lIlllllIll[1]] = lIlllllIll[9];
                                if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block18;
                                int[] nArray7 = new int[lIlllllIll[0]];
                                nArray7[aJ.lIlllllIll[1]] = lIlllllIll[9];
                                if (!aJ.lIlIIIIlIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIlllllIll[4])) break block18;
                            }
                            var10 = new d(lIlllllIll[9], lIlllllIll[4], j.cf);
                            bv.add(var10);
                            0;
                        }
                        int[] nArray = new int[lIlllllIll[0]];
                        nArray[aJ.lIlllllIll[1]] = lIlllllIll[27];
                        if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block19;
                        int[] nArray8 = new int[lIlllllIll[0]];
                        nArray8[aJ.lIlllllIll[1]] = lIlllllIll[27];
                        if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block20;
                        int[] nArray9 = new int[lIlllllIll[0]];
                        nArray9[aJ.lIlllllIll[1]] = lIlllllIll[27];
                        if (!aJ.lIlIIIIlIlIlI(Bank.getFirst((int[])nArray9).getQuantity(), lIlllllIll[22])) break block20;
                    }
                    var10 = new d(lIlllllIll[27], lIlllllIll[22], lIlllllIll[28]);
                    bv.add(var10);
                    0;
                }
                int[] nArray = new int[lIlllllIll[0]];
                nArray[aJ.lIlllllIll[1]] = lIlllllIll[5];
                if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block21;
                int[] nArray10 = new int[lIlllllIll[0]];
                nArray10[aJ.lIlllllIll[1]] = lIlllllIll[5];
                if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block22;
                int[] nArray11 = new int[lIlllllIll[0]];
                nArray11[aJ.lIlllllIll[1]] = lIlllllIll[5];
                if (!aJ.lIlIIIIlIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIlllllIll[29])) break block22;
            }
            var10 = new d(lIlllllIll[5], lIlllllIll[30], lIlllllIll[31]);
            bv.add(var10);
            0;
        }
    }

    private static boolean lIlIIIIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIlIllIl(int n2) {
        return n2 > 0;
    }

    private static String lIlIIIIlIIlIl(String var9, String var3) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIlllllIll[15]), "DES");
            Cipher var24 = Cipher.getInstance("DES");
            var24.init(lIlllllIll[3], var6);
            return new String(var24.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            aJ.gY();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-3 >= 0) {
            return (0x7B ^ 0x75 ^ (0x8F ^ 0xAD)) & (0x8E ^ 0xC3 ^ (0x5E ^ 0x3F) ^ -1);
        }
        return lIlllllIll[32];
    }

    private static boolean lIlIIIIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIIllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ag() {
        return lIlllllIIl[lIlllllIll[33]];
    }

    private static void lIlIIIIlIIllI() {
        lIlllllIIl = new String[lIlllllIll[36]];
        aJ.lIlllllIIl[aJ.lIlllllIll[1]] = aJ."Finished buying items, switching back to quest";
        aJ.lIlllllIIl[aJ.lIlllllIll[0]] = aJ."Nav to bank";
        aJ.lIlllllIIl[aJ.lIlllllIll[3]] = aJ."Handling banking";
        aJ.lIlllllIIl[aJ.lIlllllIll[7]] = aJ."We are missing quest supplies, switching to BUYING";
        aJ.lIlllllIIl[aJ.lIlllllIll[4]] = aJ."Drink";
        aJ.lIlllllIIl[aJ.lIlllllIll[12]] = aJ."Drink";
        aJ.lIlllllIIl[aJ.lIlllllIll[13]] = aJ."Shark";
        aJ.lIlllllIIl[aJ.lIlllllIll[14]] = aJ."Shark";
        aJ.lIlllllIIl[aJ.lIlllllIll[15]] = aJ."Eat";
        aJ.lIlllllIIl[aJ.lIlllllIll[16]] = aJ."Nav to start";
        aJ.lIlllllIIl[aJ.lIlllllIll[8]] = aJ."";
        aJ.lIlllllIIl[aJ.lIlllllIll[33]] = aJ."";
        aJ.lIlllllIIl[aJ.lIlllllIll[34]] = aJ."ring of wealth (";
        aJ.lIlllllIIl[aJ.lIlllllIll[35]] = aJ."Yes.";
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aJ.lIlIIIIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllllIll[15])) {
            bl = lIlllllIll[0];
            0;
            if (-(172 + 123 - 198 + 81 ^ 150 + 59 - 62 + 35) >= 0) {
                return ((0x43 ^ 0x2F ^ (0xBC ^ 0xC6)) & (0x87 ^ 0xC0 ^ (0xEE ^ 0xBF) ^ -1)) != 0;
            }
        } else {
            bl = lIlllllIll[1];
        }
        return bl;
    }

    @Override
    public boolean ae() {
        return lIlllllIll[1];
    }
}

