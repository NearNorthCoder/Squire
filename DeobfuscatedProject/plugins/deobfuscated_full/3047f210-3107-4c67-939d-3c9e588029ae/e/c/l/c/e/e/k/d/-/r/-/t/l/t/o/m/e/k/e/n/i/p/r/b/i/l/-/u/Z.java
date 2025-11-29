/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class Z
implements S {
    public static final /* synthetic */ int jk;
    public static final /* synthetic */ int jo;
    public static /* synthetic */ WorldArea y;
    public static final /* synthetic */ int jl;
    public static final /* synthetic */ int jn;
    public static final /* synthetic */ int jm;
    public static final /* synthetic */ int[] jp;
    public static /* synthetic */ WorldPoint F;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ int[] jr;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] lllllIlllI;
    private static /* synthetic */ String[] lllllIllIl;
    public static /* synthetic */ int[] jq;
    public static final /* synthetic */ int jj;

    @Override
    public int T() {
        Z.es();
        return lllllIlllI[40];
    }

    private static String llIlIlIlIIlIl(String var7, String var15) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lllllIlllI[26]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lllllIlllI[2], var20);
            return new String(var16.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIlIlIII() {
        lllllIlllI = new int[64];
        Z.lllllIlllI[0] = (57 + 56 - -31 + 95 ^ 62 + 6 - -89 + 17) & (2 ^ 0x2C ^ (0x2D ^ 0x42) ^ -1);
        Z.lllllIlllI[1] = 1;
        Z.lllllIlllI[2] = 2;
        Z.lllllIlllI[3] = 3;
        Z.lllllIlllI[4] = 0xFFFFBBAD & 0x57DA;
        Z.lllllIlllI[5] = 0xA7 ^ 0xA3;
        Z.lllllIlllI[6] = -(0xFFFFD58D & 0x7A7F) & (0xFFFFF5FF & 0x5EFD);
        Z.lllllIlllI[7] = 0xFFFFE7FF & 0x1CF5;
        Z.lllllIlllI[8] = 0xFFFFE4FF & 0x1FF9;
        Z.lllllIlllI[9] = 0xFFFFB7F7 & 0x4CFF;
        Z.lllllIlllI[10] = 0xFFFF95FB & 0x6EFF;
        Z.lllllIlllI[11] = -(0xFFFFFD5B & 0x53AE) & (0xFFFFFFDF & 0x7F7D);
        Z.lllllIlllI[12] = -(0xFFFFFDC9 & 0x13BF) & (0xFFFFBFDA & 0x7FFD);
        Z.lllllIlllI[13] = 0xFFFFBFDF & 0x6E6E;
        Z.lllllIlllI[14] = -(0xFFFF92FE & 0x7D15) & (0xFFFFBEFF & 0x7F5F);
        Z.lllllIlllI[15] = 0xFFFFAEF7 & 0x7F5A;
        Z.lllllIlllI[16] = 0xFFFFEF5A & 0x3EEF;
        Z.lllllIlllI[17] = 0xFFFFFFD9 & 0x2EE6;
        Z.lllllIlllI[18] = 77 + 62 - 11 + 83 ^ 56 + 40 - 70 + 113;
        Z.lllllIlllI[19] = -(0xFFFF9F34 & 0x71FF) & (0xFFFFFFFF & 0x3FFF);
        Z.lllllIlllI[20] = -(0xF3 ^ 0xB2) & (0xFFFFDFCF & 0x6F7B);
        Z.lllllIlllI[21] = 0x23 ^ 0x25;
        Z.lllllIlllI[22] = 0xA1 ^ 0xB5;
        Z.lllllIlllI[23] = 71 + 32 - -68 + 27 ^ 10 + 147 - 12 + 50;
        Z.lllllIlllI[24] = 0xDB ^ 0xA3 ^ (0x59 ^ 0x2E);
        Z.lllllIlllI[25] = 0x1A ^ 0x1D;
        Z.lllllIlllI[26] = 112 + 20 - 63 + 84 ^ 85 + 78 - 160 + 142;
        Z.lllllIlllI[27] = 0x3C ^ 0x35;
        Z.lllllIlllI[28] = 0x15 ^ 0x1F;
        Z.lllllIlllI[29] = 159 + 123 - 279 + 171 ^ 106 + 39 - 115 + 135;
        Z.lllllIlllI[30] = 0xE2 ^ 0xC5 ^ (0x82 ^ 0x8C);
        Z.lllllIlllI[31] = 149 + 127 - 142 + 45 ^ 150 + 76 - 220 + 166;
        Z.lllllIlllI[32] = 0x3C ^ 0x29;
        Z.lllllIlllI[33] = -(0xFFFFE367 & 0x7EDD) & (0xFFFFEAFD & 0xFFFE);
        Z.lllllIlllI[34] = -(0xFFFFBFD8 & 0x50BF) & (0xFFFFF7FF & 0x3BBF);
        Z.lllllIlllI[35] = 0xFFFFFF9A & 0x3AFD;
        Z.lllllIlllI[36] = 0xFFFFFFF8 & 0x61AF;
        Z.lllllIlllI[37] = -(0xFFFFF9F5 & 0x468B) & (0xFFFFDFC7 & Short.MAX_VALUE);
        Z.lllllIlllI[38] = 0x56 ^ 0x19 ^ (0x77 ^ 0x10);
        Z.lllllIlllI[39] = -(0xFFFFFC3B & 0x2FFE) & (0xFFFFBFBD & 0x6FFF);
        Z.lllllIlllI[40] = 0xF ^ 0x59 ^ (0x57 ^ 0x65);
        Z.lllllIlllI[41] = 5 ^ 9;
        Z.lllllIlllI[42] = 81 + 0 - 70 + 191 ^ 14 + 118 - 103 + 140;
        Z.lllllIlllI[43] = 0x31 ^ 0x60 ^ (0x7D ^ 0x21);
        Z.lllllIlllI[44] = 0xFFFFB7FE & 0x49B5;
        Z.lllllIlllI[45] = 0xFFFF99FD & 0x67BA;
        Z.lllllIlllI[46] = -(0xFFFFDFD7 & 0x31AB) & (0xFFFFBFDF & 0x57F3);
        Z.lllllIlllI[47] = 0xFFFFF675 & 0xFDF;
        Z.lllllIlllI[48] = -(0xFFFFB9BD & 0x7ECB) & (0xFFFFFFDB & 0x3EFF);
        Z.lllllIlllI[49] = 0xFFFFC77F & 0x3ED7;
        Z.lllllIlllI[50] = 0xFFFFDBF7 & 0x7F9A;
        Z.lllllIlllI[51] = -(0xFFFFE6ED & 0x3973) & (0xFFFFEFE8 & Short.MAX_VALUE);
        Z.lllllIlllI[52] = 0xFFFFDFF6 & 0x6F8F;
        Z.lllllIlllI[53] = 0xFFFFEE7F & 0x3DE5;
        Z.lllllIlllI[54] = -(0xFFFFD59F & 0x3BFA) & (0xFFFFBDFF & 0x7FFD);
        Z.lllllIlllI[55] = 0xFFFFEBBD & 0x3FDB;
        Z.lllllIlllI[56] = 0xFFFFFAFF & 0x2FBF;
        Z.lllllIlllI[57] = 0xFFFFFF99 & 0xBF7;
        Z.lllllIlllI[58] = -(0xFFFF92AB & 0x7F75) & (0xFFFFBFBD & 0x5EFE);
        Z.lllllIlllI[59] = 0x67 ^ 0x3D ^ (0xD ^ 0x4B);
        Z.lllllIlllI[60] = 0x6B ^ 0x70;
        Z.lllllIlllI[61] = 0xFFFF8BFF & 0x7F9F;
        Z.lllllIlllI[62] = -(0xFFFF9EDF & 0x7376) & (0xFFFFDFFF & 0x3EFF);
        Z.lllllIlllI[63] = 0xA7 ^ 0x91 ^ (0x73 ^ 0x4B);
    }

    private static boolean llIlIlIlIllIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aa() {
        int n2;
        if (Z.llIlIlIlIlllI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[30])) {
            boolean bl;
            int[] nArray = new int[lllllIlllI[1]];
            nArray[Z.lllllIlllI[0]] = lllllIlllI[10];
            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                bl = lllllIlllI[1];
                0;
                if ((0x19 ^ 0x1C) > 0) return bl;
                return false;
            }
            bl = lllllIlllI[0];
            return bl;
        }
        if (Z.llIlIlIlIlllI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[31]) && Z.llIlIlIlIlIlI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[30])) {
            int n3;
            int[] nArray = new int[lllllIlllI[1]];
            nArray[Z.lllllIlllI[0]] = lllllIlllI[10];
            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lllllIlllI[1]];
                nArray2[Z.lllllIlllI[0]] = lllllIlllI[9];
                if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray2))) {
                    n3 = lllllIlllI[1];
                    0;
                    if (((0xA1 ^ 0x9D) & ~(7 ^ 0x3B)) == ((0x28 ^ 0x66) & ~(0x46 ^ 8))) return n3 != 0;
                    return false;
                }
            }
            n3 = lllllIlllI[0];
            return n3 != 0;
        }
        if (Z.llIlIlIlIlllI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[32]) && Z.llIlIlIlIlIlI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[31])) {
            int n4;
            int[] nArray = new int[lllllIlllI[1]];
            nArray[Z.lllllIlllI[0]] = lllllIlllI[10];
            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lllllIlllI[1]];
                nArray3[Z.lllllIlllI[0]] = lllllIlllI[9];
                if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lllllIlllI[1]];
                    nArray4[Z.lllllIlllI[0]] = lllllIlllI[8];
                    if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray4))) {
                        n4 = lllllIlllI[1];
                        0;
                        if (2 <= (0x48 ^ 0x4C)) return n4 != 0;
                        return false;
                    }
                }
            }
            n4 = lllllIlllI[0];
            return n4 != 0;
        }
        if (Z.llIlIlIlIlllI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[21]) && Z.llIlIlIlIlIlI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[32])) {
            int n5;
            int[] nArray = new int[lllllIlllI[1]];
            nArray[Z.lllllIlllI[0]] = lllllIlllI[10];
            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lllllIlllI[1]];
                nArray5[Z.lllllIlllI[0]] = lllllIlllI[9];
                if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lllllIlllI[1]];
                    nArray6[Z.lllllIlllI[0]] = lllllIlllI[8];
                    if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lllllIlllI[1]];
                        nArray7[Z.lllllIlllI[0]] = lllllIlllI[7];
                        if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray7))) {
                            n5 = lllllIlllI[1];
                            0;
                            if (null == null) return n5 != 0;
                            return false;
                        }
                    }
                }
            }
            n5 = lllllIlllI[0];
            return n5 != 0;
        }
        int[] nArray = new int[lllllIlllI[1]];
        nArray[Z.lllllIlllI[0]] = lllllIlllI[10];
        if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lllllIlllI[1]];
            nArray8[Z.lllllIlllI[0]] = lllllIlllI[9];
            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lllllIlllI[1]];
                nArray9[Z.lllllIlllI[0]] = lllllIlllI[8];
                if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lllllIlllI[1]];
                    nArray10[Z.lllllIlllI[0]] = lllllIlllI[7];
                    if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lllllIlllI[1]];
                        nArray11[Z.lllllIlllI[0]] = lllllIlllI[6];
                        if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray11))) {
                            n2 = lllllIlllI[1];
                            0;
                            if ((85 + 5 - 34 + 104 ^ 47 + 158 - 204 + 163) != 0) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lllllIlllI[0];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lllllIllIl[lllllIlllI[41]];
    }

    private static boolean llIlIlIlIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIlIlIlIIllI(String var5, String var9) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lllllIlllI[2], var8);
            return new String(var13.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lllllIlllI[0];
    }

    static {
        Z.llIlIlIlIlIII();
        Z.llIlIlIlIIlll();
        jm = lllllIlllI[9];
        jl = lllllIlllI[8];
        jn = lllllIlllI[10];
        jo = lllllIlllI[17];
        jj = lllllIlllI[6];
        jk = lllllIlllI[7];
        int[] nArray = new int[lllllIlllI[27]];
        nArray[Z.lllllIlllI[0]] = lllllIlllI[44];
        nArray[Z.lllllIlllI[1]] = lllllIlllI[45];
        nArray[Z.lllllIlllI[2]] = lllllIlllI[46];
        nArray[Z.lllllIlllI[3]] = lllllIlllI[47];
        nArray[Z.lllllIlllI[5]] = lllllIlllI[48];
        nArray[Z.lllllIlllI[23]] = lllllIlllI[49];
        nArray[Z.lllllIlllI[21]] = lllllIlllI[50];
        nArray[Z.lllllIlllI[25]] = lllllIlllI[51];
        nArray[Z.lllllIlllI[26]] = lllllIlllI[52];
        jp = nArray;
        bu = new ArrayList<d>();
        int[] nArray2 = new int[lllllIlllI[2]];
        nArray2[Z.lllllIlllI[0]] = lllllIlllI[53];
        nArray2[Z.lllllIlllI[1]] = lllllIlllI[54];
        jq = nArray2;
        int[] nArray3 = new int[lllllIlllI[2]];
        nArray3[Z.lllllIlllI[0]] = lllllIlllI[55];
        nArray3[Z.lllllIlllI[1]] = lllllIlllI[56];
        jr = nArray3;
        y = new WorldArea(lllllIlllI[57], lllllIlllI[58], lllllIlllI[59], lllllIlllI[60], lllllIlllI[0]);
        F = new WorldPoint(lllllIlllI[61], lllllIlllI[62], lllllIlllI[0]);
    }

    private static void llIlIlIlIIlll() {
        lllllIllIl = new String[lllllIlllI[63]];
        Z.lllllIllIl[Z.lllllIlllI[0]] = Z."Buying items";
        Z.lllllIllIl[Z.lllllIlllI[1]] = Z."Finished buying items, switching back to mining";
        Z.lllllIllIl[Z.lllllIlllI[2]] = Z."Navigating to bank";
        Z.lllllIllIl[Z.lllllIlllI[3]] = Z."Handling banking";
        Z.lllllIllIl[Z.lllllIlllI[5]] = Z."We are missing axes, switching to BUYING";
        Z.lllllIllIl[Z.lllllIlllI[23]] = Z."Dropping";
        Z.lllllIllIl[Z.lllllIlllI[21]] = Z."Walking to mine";
        Z.lllllIllIl[Z.lllllIlllI[25]] = Z."Mining copper";
        Z.lllllIllIl[Z.lllllIlllI[26]] = Z."Mine";
        Z.lllllIllIl[Z.lllllIlllI[27]] = Z."Walking to iron ores";
        Z.lllllIllIl[Z.lllllIlllI[28]] = Z."Mining iron";
        Z.lllllIllIl[Z.lllllIlllI[29]] = Z."Mine";
        Z.lllllIllIl[Z.lllllIlllI[41]] = Z."Mining";
        Z.lllllIllIl[Z.lllllIlllI[43]] = Z."ring of wealth (";
    }

    private static boolean llIlIlIlIllII(Object object) {
        return object != null;
    }

    public static void es() {
        block32: {
            BankLocation var21;
            block33: {
                block39: {
                    block35: {
                        block38: {
                            block37: {
                                block36: {
                                    block34: {
                                        if (Z.llIlIlIlIlIIl(bs ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[0]];
                                            b.a(bu);
                                            if (Z.llIlIlIlIlIlI(bu.size(), lllllIlllI[1])) {
                                                System.out.println(lllllIllIl[lllllIlllI[1]]);
                                                bs = lllllIlllI[0];
                                            }
                                        }
                                        if (!Z.llIlIlIlIlIll(bs ? 1 : 0)) break block32;
                                        if (!Z.llIlIlIlIlIll(Z.aa() ? 1 : 0)) break block33;
                                        var21 = BankLocation.getNearest();
                                        if (Z.llIlIlIlIllII(var21) && Z.llIlIlIlIlIll(var21.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[2]];
                                            a.a(var21);
                                        }
                                        if (!Z.llIlIlIlIllII(var21) || !Z.llIlIlIlIlIIl(var21.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block33;
                                        AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[3]];
                                        if (Z.llIlIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIlllI[4]);
                                            0;
                                        }
                                        if (!Z.llIlIlIlIlIIl(Bank.isOpen() ? 1 : 0)) break block33;
                                        if (Z.llIlIlIlIllIl(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lllllIlllI[5]);
                                            0;
                                        }
                                        if (Z.llIlIlIlIllIl(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lllllIlllI[2]);
                                            0;
                                        }
                                        int[] nArray = new int[lllllIlllI[1]];
                                        nArray[Z.lllllIlllI[0]] = lllllIlllI[6];
                                        if (!Z.llIlIlIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                        int[] nArray2 = new int[lllllIlllI[1]];
                                        nArray2[Z.lllllIlllI[0]] = lllllIlllI[6];
                                        if (!Z.llIlIlIlIlllI(Inventory.getCount((int[])nArray2), lllllIlllI[1])) break block35;
                                    }
                                    int[] nArray = new int[lllllIlllI[1]];
                                    nArray[Z.lllllIlllI[0]] = lllllIlllI[7];
                                    if (!Z.llIlIlIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                    int[] nArray3 = new int[lllllIlllI[1]];
                                    nArray3[Z.lllllIlllI[0]] = lllllIlllI[7];
                                    if (!Z.llIlIlIlIlllI(Inventory.getCount((int[])nArray3), lllllIlllI[1])) break block35;
                                }
                                int[] nArray = new int[lllllIlllI[1]];
                                nArray[Z.lllllIlllI[0]] = lllllIlllI[8];
                                if (!Z.llIlIlIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                int[] nArray4 = new int[lllllIlllI[1]];
                                nArray4[Z.lllllIlllI[0]] = lllllIlllI[8];
                                if (!Z.llIlIlIlIlllI(Inventory.getCount((int[])nArray4), lllllIlllI[1])) break block35;
                            }
                            int[] nArray = new int[lllllIlllI[1]];
                            nArray[Z.lllllIlllI[0]] = lllllIlllI[9];
                            if (!Z.llIlIlIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                            int[] nArray5 = new int[lllllIlllI[1]];
                            nArray5[Z.lllllIlllI[0]] = lllllIlllI[9];
                            if (!Z.llIlIlIlIlllI(Inventory.getCount((int[])nArray5), lllllIlllI[1])) break block35;
                        }
                        int[] nArray = new int[lllllIlllI[1]];
                        nArray[Z.lllllIlllI[0]] = lllllIlllI[10];
                        if (!Z.llIlIlIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                        int[] nArray6 = new int[lllllIlllI[1]];
                        nArray6[Z.lllllIlllI[0]] = lllllIlllI[10];
                        if (!Z.llIlIlIlIlIlI(Inventory.getCount((int[])nArray6), lllllIlllI[1])) break block39;
                    }
                    Z.ae();
                    System.out.println(lllllIllIl[lllllIlllI[5]]);
                    bs = lllllIlllI[1];
                    return;
                }
                a.a(lllllIlllI[11], lllllIlllI[1]);
                a.a(lllllIlllI[12], lllllIlllI[1]);
                a.a(lllllIlllI[13], lllllIlllI[1]);
                a.a(lllllIlllI[14], lllllIlllI[1]);
                a.a(lllllIlllI[15], lllllIlllI[1]);
                a.a(lllllIlllI[16], lllllIlllI[1]);
                a.a(lllllIlllI[17], lllllIlllI[1]);
                int[] nArray = new int[lllllIlllI[1]];
                nArray[Z.lllllIlllI[0]] = lllllIlllI[11];
                if (Z.llIlIlIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray7 = new int[lllllIlllI[1]];
                    nArray7[Z.lllllIlllI[0]] = lllllIlllI[11];
                    if (Z.llIlIlIlIlIll(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lllllIlllI[1]];
                        nArray8[Z.lllllIlllI[0]] = lllllIlllI[11];
                        if (Z.llIlIlIlIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            a.a(lllllIlllI[18], lllllIlllI[1]);
                        }
                    }
                }
                a.a(lllllIlllI[19], lllllIlllI[1]);
                e.l(lllllIlllI[11]);
                e.l(lllllIlllI[12]);
                e.l(lllllIlllI[13]);
                e.l(lllllIlllI[14]);
                e.l(lllllIlllI[15]);
                Time.sleepTicks((int)lllllIlllI[1]);
                0;
                e.l(lllllIlllI[17]);
                e.l(lllllIlllI[20]);
                e.l(lllllIlllI[16]);
                e.l(lllllIlllI[18]);
                e.l(lllllIlllI[19]);
                Time.sleepTicks((int)lllllIlllI[3]);
                0;
                if (Z.llIlIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lllllIlllI[21]);
                    0;
                }
                if (Z.llIlIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray9 = new int[lllllIlllI[1]];
                    nArray9[Z.lllllIlllI[0]] = lllllIlllI[6];
                    if (Z.llIlIlIlIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        Bank.withdraw((int)lllllIlllI[6], (int)lllllIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllllIlllI[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllllIlllI[1]];
                            nArray[Z.lllllIlllI[0]] = lllllIlllI[6];
                            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                                bl = lllllIlllI[1];
                                0;
                                if ((0x34 ^ 0x30) < (8 ^ 0xC)) {
                                    return false;
                                }
                            } else {
                                bl = lllllIlllI[0];
                            }
                            return bl;
                        }, (int)lllllIlllI[4]);
                        0;
                    }
                    int[] nArray10 = new int[lllllIlllI[1]];
                    nArray10[Z.lllllIlllI[0]] = lllllIlllI[7];
                    if (Z.llIlIlIlIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                        Bank.withdraw((int)lllllIlllI[7], (int)lllllIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllllIlllI[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllllIlllI[1]];
                            nArray[Z.lllllIlllI[0]] = lllllIlllI[7];
                            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                                bl = lllllIlllI[1];
                                0;
                                if (3 != 3) {
                                    return ((71 + 11 - -26 + 50 ^ 90 + 114 - 177 + 113) & (0xE4 ^ 0x93 ^ (0x1C ^ 0x79) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllllIlllI[0];
                            }
                            return bl;
                        }, (int)lllllIlllI[4]);
                        0;
                    }
                    int[] nArray11 = new int[lllllIlllI[1]];
                    nArray11[Z.lllllIlllI[0]] = lllllIlllI[8];
                    if (Z.llIlIlIlIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        Bank.withdraw((int)lllllIlllI[8], (int)lllllIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllllIlllI[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllllIlllI[1]];
                            nArray[Z.lllllIlllI[0]] = lllllIlllI[8];
                            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                                bl = lllllIlllI[1];
                                0;
                                if (((2 ^ (0xEE ^ 0xA5)) & (0x7E ^ 0x46 ^ (0x1D ^ 0x6C) ^ -1)) > 1) {
                                    return ((0xC ^ 0x45 ^ (0xC8 ^ 0xA6)) & (0x6F ^ 0x4F ^ (6 ^ 1) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllllIlllI[0];
                            }
                            return bl;
                        }, (int)lllllIlllI[4]);
                        0;
                    }
                    int[] nArray12 = new int[lllllIlllI[1]];
                    nArray12[Z.lllllIlllI[0]] = lllllIlllI[9];
                    if (Z.llIlIlIlIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                        Bank.withdraw((int)lllllIlllI[9], (int)lllllIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllllIlllI[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllllIlllI[1]];
                            nArray[Z.lllllIlllI[0]] = lllllIlllI[9];
                            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                                bl = lllllIlllI[1];
                                0;
                                if (-(1 ^ 5) > 0) {
                                    return false;
                                }
                            } else {
                                bl = lllllIlllI[0];
                            }
                            return bl;
                        }, (int)lllllIlllI[4]);
                        0;
                    }
                    int[] nArray13 = new int[lllllIlllI[1]];
                    nArray13[Z.lllllIlllI[0]] = lllllIlllI[10];
                    if (Z.llIlIlIlIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                        Bank.withdraw((int)lllllIlllI[10], (int)lllllIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllllIlllI[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllllIlllI[1]];
                            nArray[Z.lllllIlllI[0]] = lllllIlllI[10];
                            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                                bl = lllllIlllI[1];
                                0;
                                
                                }
                            } else {
                                bl = lllllIlllI[0];
                            }
                            return bl;
                        }, (int)lllllIlllI[4]);
                        0;
                    }
                    int[] nArray14 = new int[lllllIlllI[1]];
                    nArray14[Z.lllllIlllI[0]] = lllllIlllI[17];
                    if (Z.llIlIlIlIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                        Bank.withdraw((int)lllllIlllI[17], (int)lllllIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllllIlllI[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllllIlllI[1]];
                            nArray[Z.lllllIlllI[0]] = lllllIlllI[17];
                            if (Z.llIlIlIlIllIl(Inventory.getCount((int[])nArray))) {
                                bl = lllllIlllI[1];
                                0;
                                if (3 <= -1) {
                                    return ((0xB0 ^ 0xBA ^ (0xCD ^ 0x88)) & (0x3A ^ 0x18 ^ (0xC6 ^ 0xAB) ^ -1) & ((108 + 28 - -70 + 45 ^ 50 + 117 - 134 + 130) & (0xA3 ^ 0x95 ^ (0x57 ^ 0x39) ^ -1) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllllIlllI[0];
                            }
                            return bl;
                        }, (int)lllllIlllI[4]);
                        0;
                    }
                }
            }
            if (Z.llIlIlIlIlIIl(Z.aa() ? 1 : 0)) {
                if (Z.llIlIlIlIlIll(Movement.isRunEnabled() ? 1 : 0) && Z.llIlIlIlIllll(Movement.getRunEnergy(), lllllIlllI[22])) {
                    Movement.toggleRun();
                    Time.sleepTicks((int)lllllIlllI[23]);
                    0;
                }
                if (Z.llIlIlIlIlIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[23]];
                    Inventory.getAll((int[])jp).stream().forEach(Item::drop);
                }
                if (Z.llIlIlIlIlIll(Inventory.isFull() ? 1 : 0)) {
                    if (Z.llIlIlIlIlIlI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[24])) {
                        if (Z.llIlIlIlIlIll(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[21]];
                            Movement.walkTo((WorldPoint)F);
                            0;
                            Time.sleepTicks((int)lllllIlllI[5]);
                            0;
                        }
                        if (Z.llIlIlIlIlIIl(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[25]];
                            var21 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])jr);
                            if (Z.llIlIlIlIlIll(Players.getLocal().isAnimating() ? 1 : 0) && Z.llIlIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && Z.llIlIlIlIllII(var21)) {
                                var21.interact(lllllIllIl[lllllIlllI[26]]);
                                Time.sleepTicks((int)lllllIlllI[2]);
                                0;
                            }
                        }
                    }
                    if (Z.llIlIlIlIlllI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[24])) {
                        if (Z.llIlIlIlIlIll(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[27]];
                            Movement.walkTo((WorldPoint)F);
                            0;
                            Time.sleepTicks((int)lllllIlllI[5]);
                            0;
                        }
                        if (Z.llIlIlIlIlIIl(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIllIl[lllllIlllI[28]];
                            var21 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])jq);
                            if (Z.llIlIlIlIlIll(Players.getLocal().isAnimating() ? 1 : 0) && Z.llIlIlIlIlIll(Players.getLocal().isMoving() ? 1 : 0) && Z.llIlIlIlIllII(var21)) {
                                var21.interact(lllllIllIl[lllllIlllI[29]]);
                                Time.sleepTicks((int)lllllIlllI[2]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (Z.llIlIlIlIlllI(Skills.getLevel((Skill)Skill.MINING), lllllIlllI[42])) {
            bl = lllllIlllI[1];
            0;
            if ((152 + 33 - 78 + 46 ^ 122 + 112 - 115 + 38) != (0x29 ^ 0x13 ^ (0xAD ^ 0x93))) {
                return ((3 ^ (0xA3 ^ 0xBD)) & (0xBE ^ 0x80 ^ (0xBB ^ 0x98) ^ -1)) != 0;
            }
        } else {
            bl = lllllIlllI[0];
        }
        return bl;
    }

    private static boolean llIlIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static void ae() {
        d var17;
        Object var1;
        d d2 = new d(lllllIlllI[17], lllllIlllI[1], lllllIlllI[33]);
        bu.add(d2);
        0;
        int[] nArray = new int[lllllIlllI[1]];
        nArray[Z.lllllIlllI[0]] = lllllIlllI[6];
        if (Z.llIlIlIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d3 = new d(lllllIlllI[6], lllllIlllI[1], lllllIlllI[4]);
            bu.add(d3);
            0;
        }
        int[] nArray2 = new int[lllllIlllI[1]];
        nArray2[Z.lllllIlllI[0]] = lllllIlllI[7];
        if (Z.llIlIlIlIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var1 = new d(lllllIlllI[7], lllllIlllI[1], lllllIlllI[4]);
            bu.add((d)var1);
            0;
        }
        int[] nArray3 = new int[lllllIlllI[1]];
        nArray3[Z.lllllIlllI[0]] = lllllIlllI[8];
        if (Z.llIlIlIlIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var1 = new d(lllllIlllI[8], lllllIlllI[1], lllllIlllI[34]);
            bu.add((d)var1);
            0;
        }
        int[] nArray4 = new int[lllllIlllI[1]];
        nArray4[Z.lllllIlllI[0]] = lllllIlllI[9];
        if (Z.llIlIlIlIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new d(lllllIlllI[9], lllllIlllI[1], lllllIlllI[35]);
            bu.add((d)var1);
            0;
        }
        int[] nArray5 = new int[lllllIlllI[1]];
        nArray5[Z.lllllIlllI[0]] = lllllIlllI[10];
        if (Z.llIlIlIlIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var1 = new d(lllllIlllI[10], lllllIlllI[1], lllllIlllI[36]);
            bu.add((d)var1);
            0;
        }
        if (Z.llIlIlIlIlIll(Bank.contains((Predicate)(var1 = item -> item.getName().toLowerCase().contains(lllllIllIl[lllllIlllI[43]]))) ? 1 : 0)) {
            var17 = new d(lllllIlllI[19], lllllIlllI[23], lllllIlllI[36]);
            bu.add(var17);
            0;
        }
        int[] nArray6 = new int[lllllIlllI[1]];
        nArray6[Z.lllllIlllI[0]] = lllllIlllI[37];
        if (Z.llIlIlIlIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var17 = new d(lllllIlllI[37], lllllIlllI[38], lllllIlllI[39]);
            bu.add(var17);
            0;
        }
    }

    private static boolean llIlIlIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIlIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static String llIlIlIlIIlII(String var2, String var22) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var18 = var22.toCharArray();
        int var3 = lllllIlllI[0];
        char[] var14 = var2.toCharArray();
        int var12 = var14.length;
        int var4 = lllllIlllI[0];
        while (Z.llIlIlIlIlIlI(var4, var12)) {
            char var10 = var14[var4];
            var11.append((char)(var10 ^ var18[var3 % var18.length]));
            0;
            ++var3;
            ++var4;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }
}

