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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
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

public class am
implements W {
    public static final /* synthetic */ int mA;
    public static final /* synthetic */ WorldArea mD;
    public static /* synthetic */ int[] mf;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ int my;
    public static final /* synthetic */ int mx;
    public static final /* synthetic */ int mB;
    public static /* synthetic */ int[] mG;
    public static /* synthetic */ int[] mF;
    public static final /* synthetic */ WorldArea mC;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint mE;
    private static /* synthetic */ int[] lIIIIlllI;
    public static final /* synthetic */ int mz;
    private static /* synthetic */ String[] lIIIIllIl;

    public static void af() {
        d lIIlIIIllllIIlI;
        Object lIIlIIIllllIIll;
        int[] nArray = new int[lIIIIlllI[1]];
        nArray[am.lIIIIlllI[0]] = lIIIIlllI[7];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIIlllI[7], lIIIIlllI[1], lIIIIlllI[5]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIIlllI[1]];
        nArray2[am.lIIIIlllI[0]] = lIIIIlllI[8];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlIIIllllIIll = new d(lIIIIlllI[8], lIIIIlllI[1], lIIIIlllI[5]);
            bv.add((d)lIIlIIIllllIIll);
            0;
        }
        int[] nArray3 = new int[lIIIIlllI[1]];
        nArray3[am.lIIIIlllI[0]] = lIIIIlllI[9];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlIIIllllIIll = new d(lIIIIlllI[9], lIIIIlllI[1], lIIIIlllI[26]);
            bv.add((d)lIIlIIIllllIIll);
            0;
        }
        int[] nArray4 = new int[lIIIIlllI[1]];
        nArray4[am.lIIIIlllI[0]] = lIIIIlllI[10];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlIIIllllIIll = new d(lIIIIlllI[10], lIIIIlllI[1], lIIIIlllI[27]);
            bv.add((d)lIIlIIIllllIIll);
            0;
        }
        int[] nArray5 = new int[lIIIIlllI[1]];
        nArray5[am.lIIIIlllI[0]] = lIIIIlllI[11];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlIIIllllIIll = new d(lIIIIlllI[11], lIIIIlllI[1], lIIIIlllI[28]);
            bv.add((d)lIIlIIIllllIIll);
            0;
        }
        if (am.lllIIIIIIlI(Bank.contains((Predicate)(lIIlIIIllllIIll = item -> item.getName().toLowerCase().contains(lIIIIllIl[lIIIIlllI[36]]))) ? 1 : 0)) {
            lIIlIIIllllIIlI = new d(lIIIIlllI[29], lIIIIlllI[12], lIIIIlllI[28]);
            bv.add(lIIlIIIllllIIlI);
            0;
        }
        int[] nArray6 = new int[lIIIIlllI[1]];
        nArray6[am.lIIIIlllI[0]] = lIIIIlllI[30];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIlIIIllllIIlI = new d(lIIIIlllI[30], lIIIIlllI[31], lIIIIlllI[32]);
            bv.add(lIIlIIIllllIIlI);
            0;
        }
    }

    @Override
    public String U() {
        return lIIIIllIl[lIIIIlllI[34]];
    }

    private static boolean lllIIIIIIll(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ab() {
        int n2;
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[23])) {
            boolean bl;
            int[] nArray = new int[lIIIIlllI[1]];
            nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                bl = lIIIIlllI[1];
                0;
                if (null == null) return bl;
                return false;
            }
            bl = lIIIIlllI[0];
            return bl;
        }
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[24]) && am.lllIIIIIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[23])) {
            int n3;
            int[] nArray = new int[lIIIIlllI[1]];
            nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIIIlllI[1]];
                nArray2[am.lIIIIlllI[0]] = lIIIIlllI[10];
                if (am.lllIIIIIIll(Inventory.getCount((int[])nArray2))) {
                    n3 = lIIIIlllI[1];
                    0;
                    if (3 < (5 ^ 1)) return n3 != 0;
                    return false;
                }
            }
            n3 = lIIIIlllI[0];
            return n3 != 0;
        }
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[25]) && am.lllIIIIIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[24])) {
            int n4;
            int[] nArray = new int[lIIIIlllI[1]];
            nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lIIIIlllI[1]];
                nArray3[am.lIIIIlllI[0]] = lIIIIlllI[10];
                if (am.lllIIIIIIll(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lIIIIlllI[1]];
                    nArray4[am.lIIIIlllI[0]] = lIIIIlllI[9];
                    if (am.lllIIIIIIll(Inventory.getCount((int[])nArray4))) {
                        n4 = lIIIIlllI[1];
                        0;
                        if (3 >= 0) return n4 != 0;
                        return ((0x42 ^ 0x6D ^ (0x6B ^ 0x50)) & (0x1A ^ 0xC ^ 2 ^ -1)) != 0;
                    }
                }
            }
            n4 = lIIIIlllI[0];
            return n4 != 0;
        }
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[13]) && am.lllIIIIIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[25])) {
            int n5;
            int[] nArray = new int[lIIIIlllI[1]];
            nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lIIIIlllI[1]];
                nArray5[am.lIIIIlllI[0]] = lIIIIlllI[10];
                if (am.lllIIIIIIll(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lIIIIlllI[1]];
                    nArray6[am.lIIIIlllI[0]] = lIIIIlllI[9];
                    if (am.lllIIIIIIll(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lIIIIlllI[1]];
                        nArray7[am.lIIIIlllI[0]] = lIIIIlllI[8];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray7))) {
                            n5 = lIIIIlllI[1];
                            0;
                            if (3 > 1) return n5 != 0;
                            return ((6 + 23 - 28 + 169 ^ 51 + 49 - -20 + 13) & (0xF6 ^ 0xA7 ^ (0x2A ^ 0x54) ^ -1)) != 0;
                        }
                    }
                }
            }
            n5 = lIIIIlllI[0];
            return n5 != 0;
        }
        int[] nArray = new int[lIIIIlllI[1]];
        nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lIIIIlllI[1]];
            nArray8[am.lIIIIlllI[0]] = lIIIIlllI[10];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lIIIIlllI[1]];
                nArray9[am.lIIIIlllI[0]] = lIIIIlllI[9];
                if (am.lllIIIIIIll(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lIIIIlllI[1]];
                    nArray10[am.lIIIIlllI[0]] = lIIIIlllI[8];
                    if (am.lllIIIIIIll(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lIIIIlllI[1]];
                        nArray11[am.lIIIIlllI[0]] = lIIIIlllI[7];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray11))) {
                            n2 = lIIIIlllI[1];
                            0;
                            if (-(0x5C ^ 0x58) <= 0) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lIIIIlllI[0];
        return n2 != 0;
    }

    private static void llIllllllll() {
        lIIIIlllI = new int[53];
        am.lIIIIlllI[0] = (0x78 ^ 0x1B) & ~(0x53 ^ 0x30);
        am.lIIIIlllI[1] = 1;
        am.lIIIIlllI[2] = 0xFFFF8FE3 & 0x73FF;
        am.lIIIIlllI[3] = 2;
        am.lIIIIlllI[4] = 3;
        am.lIIIIlllI[5] = 0xFFFFF3DA & 0x1FAD;
        am.lIIIIlllI[6] = 0xE5 ^ 0x9C ^ (0x55 ^ 0x28);
        am.lIIIIlllI[7] = -(0xFFFFABBF & 0x5E71) & (0xFFFFCF77 & 0x3FFF);
        am.lIIIIlllI[8] = -(0xFFFFF3BF & 0x5CE5) & (0xFFFFDFED & 0x75FF);
        am.lIIIIlllI[9] = 0xFFFFFFFB & 0x54F;
        am.lIIIIlllI[10] = 0xFFFFC5DD & 0x3F6F;
        am.lIIIIlllI[11] = -(0xFFFFE7B9 & 0x3857) & (0xFFFFE5DF & 0x3F7F);
        am.lIIIIlllI[12] = 8 ^ 0xD;
        am.lIIIIlllI[13] = 0x2D ^ 0x70 ^ (0x37 ^ 0x6C);
        am.lIIIIlllI[14] = 0x6A ^ 0x6D;
        am.lIIIIlllI[15] = 0xD1 ^ 0x8E ^ (0x53 ^ 3);
        am.lIIIIlllI[16] = 38 + 59 - 75 + 152 ^ 62 + 125 - 96 + 75;
        am.lIIIIlllI[17] = 0x71 ^ 0x78;
        am.lIIIIlllI[18] = 0x68 ^ 0x62;
        am.lIIIIlllI[19] = 80 + 12 - 16 + 61 ^ 85 + 1 - 56 + 100;
        am.lIIIIlllI[20] = 0x7B ^ 0x77;
        am.lIIIIlllI[21] = (0x4D ^ 0x40) & ~(0x38 ^ 0x35) ^ (0x88 ^ 0x85);
        am.lIIIIlllI[22] = 0xC7 ^ 0xB4 ^ (0x7C ^ 1);
        am.lIIIIlllI[23] = 141 + 148 - 71 + 14 ^ 71 + 24 - -27 + 71;
        am.lIIIIlllI[24] = 0x29 ^ 0x36;
        am.lIIIIlllI[25] = 0x36 ^ 0x23;
        am.lIIIIlllI[26] = -(0xFFFFFDF2 & 0x468F) & (0xFFFFE7B9 & 0x7FEF);
        am.lIIIIlllI[27] = 0xFFFFAEEE & 0x7FF1;
        am.lIIIIlllI[28] = 0xFFFFF9EC & 0x67BB;
        am.lIIIIlllI[29] = -(0xFFFFE3BB & 0x5C66) & (0xFFFFEFEF & 0x7EFD);
        am.lIIIIlllI[30] = 0xFFFFBFF7 & 0x5F4F;
        am.lIIIIlllI[31] = 0x8C ^ 0xA4;
        am.lIIIIlllI[32] = -(0xFFFFF5A7 & 0x7E7A) & (0xFFFFF7FF & 0x7FA5);
        am.lIIIIlllI[33] = 0xB0 ^ 0xB8 ^ (0x60 ^ 0xC);
        am.lIIIIlllI[34] = 98 + 1 - -51 + 8 ^ 131 + 36 - 132 + 107;
        am.lIIIIlllI[35] = 0x7A ^ 0x19;
        am.lIIIIlllI[36] = 0x3F ^ 0x2E;
        am.lIIIIlllI[37] = -(0xFFFFB7F5 & 0x7BAB) & (0xFFFFFFFF & 0x3FF5);
        am.lIIIIlllI[38] = -(0xFFFFF4E1 & 0x5BDF) & (0xFFFFFDFE & 0x5FEF);
        am.lIIIIlllI[39] = 0x6D ^ 0x40;
        am.lIIIIlllI[40] = -(0xFFFFFFCB & 0x2136) & (0xFFFFAD7F & Short.MAX_VALUE);
        am.lIIIIlllI[41] = 0xFFFFDF67 & 0x2DB9;
        am.lIIIIlllI[42] = 0xFFFFAE87 & 0x5DFC;
        am.lIIIIlllI[43] = -(0xFFFFF3FB & 0x7E1F) & (0xFFFFFF3F & Short.MAX_VALUE);
        am.lIIIIlllI[44] = 0xFFFF9FFE & 0x64FD;
        am.lIIIIlllI[45] = -(0xFFFFFF35 & 0x58CB) & (0xFFFFFCFE & 0x5FFF);
        am.lIIIIlllI[46] = -(0xFFFFFAF6 & 0x5DCF) & (0xFFFFFDD7 & 0x5FEF);
        am.lIIIIlllI[47] = -(0xFFFFBD0D & 0x6AFB) & (0xFFFFAFBF & 0x7D4E);
        am.lIIIIlllI[48] = 0xFFFFABED & 0x7E56;
        am.lIIIIlllI[49] = -(0xFFFFBED9 & 0x713F) & (0xFFFFBFFF & 0x75FF);
        am.lIIIIlllI[50] = 0xFFFFDFF5 & 0x25FB;
        am.lIIIIlllI[51] = -(0xFFFFFA15 & 0x7FEB) & (0xFFFFFFFF & 0x7FEF);
        am.lIIIIlllI[52] = 0x65 ^ 0x79 ^ (0x7D ^ 0x73);
    }

    @Override
    public int T() {
        am.ez();
        return lIIIIlllI[33];
    }

    private static String llIllllllII(String lIIlIIIlllIlIII, String lIIlIIIlllIIlll) {
        try {
            SecretKeySpec lIIlIIIlllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIIlllIllII = Cipher.getInstance("Blowfish");
            lIIlIIIlllIllII.init(lIIIIlllI[3], lIIlIIIlllIllIl);
            return new String(lIIlIIIlllIllII.doFinal(Base64.getDecoder().decode(lIIlIIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIlllIlIll) {
            lIIlIIIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        am.llIllllllll();
        am.llIlllllllI();
        mx = lIIIIlllI[7];
        my = lIIIIlllI[8];
        mB = lIIIIlllI[11];
        mA = lIIIIlllI[10];
        mz = lIIIIlllI[9];
        mC = new WorldArea(lIIIIlllI[37], lIIIIlllI[38], lIIIIlllI[34], lIIIIlllI[39], lIIIIlllI[0]);
        mD = new WorldArea(lIIIIlllI[40], lIIIIlllI[41], lIIIIlllI[22], lIIIIlllI[34], lIIIIlllI[0]);
        mE = new WorldPoint(lIIIIlllI[42], lIIIIlllI[43], lIIIIlllI[0]);
        int[] nArray = new int[lIIIIlllI[6]];
        nArray[am.lIIIIlllI[0]] = lIIIIlllI[44];
        nArray[am.lIIIIlllI[1]] = lIIIIlllI[45];
        nArray[am.lIIIIlllI[3]] = lIIIIlllI[46];
        nArray[am.lIIIIlllI[4]] = lIIIIlllI[47];
        mF = nArray;
        int[] nArray2 = new int[lIIIIlllI[1]];
        nArray2[am.lIIIIlllI[0]] = lIIIIlllI[48];
        mG = nArray2;
        int[] nArray3 = new int[lIIIIlllI[4]];
        nArray3[am.lIIIIlllI[0]] = lIIIIlllI[49];
        nArray3[am.lIIIIlllI[1]] = lIIIIlllI[50];
        nArray3[am.lIIIIlllI[3]] = lIIIIlllI[51];
        mf = nArray3;
        bv = new ArrayList<d>();
    }

    private static boolean lllIIIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIlllllllI() {
        lIIIIllIl = new String[lIIIIlllI[52]];
        am.lIIIIllIl[am.lIIIIlllI[0]] = am."Buying items";
        am.lIIIIllIl[am.lIIIIlllI[1]] = am."Finished buying items, switching back to woodcutting";
        am.lIIIIllIl[am.lIIIIlllI[3]] = am."Navigating to bank";
        am.lIIIIllIl[am.lIIIIlllI[4]] = am."Opening bank";
        am.lIIIIllIl[am.lIIIIlllI[6]] = am."Handling banking";
        am.lIIIIllIl[am.lIIIIlllI[12]] = am."We are missing pickaxes, switching to BUYING";
        am.lIIIIllIl[am.lIIIIlllI[13]] = am."Dropping logs";
        am.lIIIIllIl[am.lIIIIlllI[14]] = am."Dropping logs";
        am.lIIIIllIl[am.lIIIIlllI[16]] = am."Walking to trees";
        am.lIIIIllIl[am.lIIIIlllI[17]] = am."Chopping";
        am.lIIIIllIl[am.lIIIIlllI[18]] = am."Chopping logs";
        am.lIIIIllIl[am.lIIIIlllI[19]] = am."Chop down";
        am.lIIIIllIl[am.lIIIIlllI[20]] = am."Walking to oak trees";
        am.lIIIIllIl[am.lIIIIlllI[21]] = am."Chopping oaks";
        am.lIIIIllIl[am.lIIIIlllI[22]] = am."Chopping oak logs";
        am.lIIIIllIl[am.lIIIIlllI[15]] = am."Chop down";
        am.lIIIIllIl[am.lIIIIlllI[34]] = am."Woodcutting";
        am.lIIIIllIl[am.lIIIIlllI[36]] = am."ring of wealth (";
    }

    private static boolean lllIIIIIlII(Object object) {
        return object != null;
    }

    private static String llIllllllIl(String lIIlIIIllIIlIII, String lIIlIIIllIIllII) {
        lIIlIIIllIIlIII = new String(Base64.getDecoder().decode(lIIlIIIllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIIllIIlIll = new StringBuilder();
        char[] lIIlIIIllIIlIlI = lIIlIIIllIIllII.toCharArray();
        int lIIlIIIllIIlIIl = lIIIIlllI[0];
        char[] lIIlIIIllIIIIll = lIIlIIIllIIlIII.toCharArray();
        int lIIlIIIllIIIIlI = lIIlIIIllIIIIll.length;
        int lIIlIIIllIIIIIl = lIIIIlllI[0];
        while (am.lllIIIIIIIl(lIIlIIIllIIIIIl, lIIlIIIllIIIIlI)) {
            char lIIlIIIllIIlllI = lIIlIIIllIIIIll[lIIlIIIllIIIIIl];
            lIIlIIIllIIlIll.append((char)(lIIlIIIllIIlllI ^ lIIlIIIllIIlIlI[lIIlIIIllIIlIIl % lIIlIIIllIIlIlI.length]));
            0;
            ++lIIlIIIllIIlIIl;
            ++lIIlIIIllIIIIIl;
            0;
            if (3 > 1) continue;
            return null;
        }
        return String.valueOf(lIIlIIIllIIlIll);
    }

    private static String llIlllllIll(String lIIlIIIllIllIll, String lIIlIIIllIllIlI) {
        try {
            SecretKeySpec lIIlIIIlllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIIllIllIlI.getBytes(StandardCharsets.UTF_8)), lIIIIlllI[16]), "DES");
            Cipher lIIlIIIllIlllll = Cipher.getInstance("DES");
            lIIlIIIllIlllll.init(lIIIIlllI[3], lIIlIIIlllIIIII);
            return new String(lIIlIIIllIlllll.doFinal(Base64.getDecoder().decode(lIIlIIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIllIllllI) {
            lIIlIIIllIllllI.printStackTrace();
            return null;
        }
    }

    public static void ez() {
        block25: {
            BankLocation lIIlIIIllllIllI;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (am.lllIIIIIIII(bt ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[0]];
                                                b.a(bv);
                                                if (am.lllIIIIIIIl(bv.size(), lIIIIlllI[1])) {
                                                    System.out.println(lIIIIllIl[lIIIIlllI[1]]);
                                                    bt = lIIIIlllI[0];
                                                }
                                            }
                                            if (!am.lllIIIIIIlI(bt ? 1 : 0)) break block25;
                                            if (!am.lllIIIIIIII(am.ab() ? 1 : 0)) break block26;
                                            int[] nArray = new int[lIIIIlllI[1]];
                                            nArray[am.lIIIIlllI[0]] = lIIIIlllI[2];
                                            if (!am.lllIIIIIIll(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (am.lllIIIIIlII(lIIlIIIllllIllI = BankLocation.getNearest()) && am.lllIIIIIIlI(lIIlIIIllllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[3]];
                                            a.a(lIIlIIIllllIllI);
                                        }
                                        if (!am.lllIIIIIlII(lIIlIIIllllIllI) || !am.lllIIIIIIII(lIIlIIIllllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (am.lllIIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[4]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllI[5]);
                                            0;
                                        }
                                        if (!am.lllIIIIIIII(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[6]];
                                        if (am.lllIIIIIIll(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIIIlllI[6]);
                                            0;
                                        }
                                        if (am.lllIIIIIIll(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIIIlllI[3]);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIIlllI[1]];
                                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[7];
                                        if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[lIIIIlllI[1]];
                                        nArray2[am.lIIIIlllI[0]] = lIIIIlllI[7];
                                        if (!am.lllIIIIIlIl(Inventory.getCount((int[])nArray2), lIIIIlllI[1])) break block29;
                                    }
                                    int[] nArray = new int[lIIIIlllI[1]];
                                    nArray[am.lIIIIlllI[0]] = lIIIIlllI[8];
                                    if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[lIIIIlllI[1]];
                                    nArray3[am.lIIIIlllI[0]] = lIIIIlllI[8];
                                    if (!am.lllIIIIIlIl(Inventory.getCount((int[])nArray3), lIIIIlllI[1])) break block29;
                                }
                                int[] nArray = new int[lIIIIlllI[1]];
                                nArray[am.lIIIIlllI[0]] = lIIIIlllI[9];
                                if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[lIIIIlllI[1]];
                                nArray4[am.lIIIIlllI[0]] = lIIIIlllI[9];
                                if (!am.lllIIIIIlIl(Inventory.getCount((int[])nArray4), lIIIIlllI[1])) break block29;
                            }
                            int[] nArray = new int[lIIIIlllI[1]];
                            nArray[am.lIIIIlllI[0]] = lIIIIlllI[10];
                            if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[lIIIIlllI[1]];
                            nArray5[am.lIIIIlllI[0]] = lIIIIlllI[10];
                            if (!am.lllIIIIIlIl(Inventory.getCount((int[])nArray5), lIIIIlllI[1])) break block29;
                        }
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
                        if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[lIIIIlllI[1]];
                        nArray6[am.lIIIIlllI[0]] = lIIIIlllI[11];
                        if (!am.lllIIIIIIIl(Inventory.getCount((int[])nArray6), lIIIIlllI[1])) break block33;
                    }
                    am.af();
                    System.out.println(lIIIIllIl[lIIIIlllI[12]]);
                    bt = lIIIIlllI[1];
                    return;
                }
                int[] nArray = new int[lIIIIlllI[1]];
                nArray[am.lIIIIlllI[0]] = lIIIIlllI[7];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[7], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[7];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];
                            0;
                            
                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);
                    0;
                }
                int[] nArray7 = new int[lIIIIlllI[1]];
                nArray7[am.lIIIIlllI[0]] = lIIIIlllI[8];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[8], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[8];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];
                            0;
                            if (((0x29 ^ 0x24 ^ (2 ^ 0x54)) & (0x64 ^ 0x73 ^ (0x71 ^ 0x3D) ^ -1)) != 0) {
                                return ((0xF2 ^ 0x87 ^ (0xFA ^ 0xAB)) & (28 + 12 - -35 + 107 ^ 70 + 61 - 64 + 79 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);
                    0;
                }
                int[] nArray8 = new int[lIIIIlllI[1]];
                nArray8[am.lIIIIlllI[0]] = lIIIIlllI[9];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[9], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[9];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];
                            0;
                            if (3 <= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);
                    0;
                }
                int[] nArray9 = new int[lIIIIlllI[1]];
                nArray9[am.lIIIIlllI[0]] = lIIIIlllI[10];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[10], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[10];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];
                            0;
                            if (3 < 0) {
                                return ((2 + 106 - -65 + 3 ^ 14 + 10 - -128 + 5) & (0xC ^ 0x36 ^ (5 ^ 0x12) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);
                    0;
                }
                int[] nArray10 = new int[lIIIIlllI[1]];
                nArray10[am.lIIIIlllI[0]] = lIIIIlllI[11];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[11], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];
                            0;
                            if (3 < 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);
                    0;
                }
            }
            if (am.lllIIIIIIII(am.ab() ? 1 : 0)) {
                if (am.lllIIIIIIII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[13]];
                    System.out.println(lIIIIllIl[lIIIIlllI[14]]);
                    Inventory.getAll((int[])mf).stream().forEach(Item::drop);
                }
                if (am.lllIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
                    if (am.lllIIIIIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[15])) {
                        if (am.lllIIIIIIlI(mC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[16]];
                            Movement.walkTo((WorldPoint)mC.toWorldPoint());
                            0;
                            Time.sleepTicks((int)lIIIIlllI[6]);
                            0;
                        }
                        if (am.lllIIIIIIII(mC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[17]];
                            lIIlIIIllllIllI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mF);
                            if (am.lllIIIIIIlI(Players.getLocal().isAnimating() ? 1 : 0) && am.lllIIIIIIlI(Players.getLocal().isMoving() ? 1 : 0) && am.lllIIIIIlII(lIIlIIIllllIllI)) {
                                System.out.println(lIIIIllIl[lIIIIlllI[18]]);
                                lIIlIIIllllIllI.interact(lIIIIllIl[lIIIIlllI[19]]);
                                Time.sleepTicks((int)lIIIIlllI[4]);
                                0;
                            }
                        }
                    }
                    if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[15])) {
                        if (am.lllIIIIIIlI(mD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[20]];
                            Movement.walkTo((WorldPoint)mE);
                            0;
                            Time.sleepTicks((int)lIIIIlllI[6]);
                            0;
                        }
                        if (am.lllIIIIIIII(mD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[21]];
                            lIIlIIIllllIllI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mG);
                            if (am.lllIIIIIIlI(Players.getLocal().isAnimating() ? 1 : 0) && am.lllIIIIIIlI(Players.getLocal().isMoving() ? 1 : 0) && am.lllIIIIIlII(lIIlIIIllllIllI)) {
                                System.out.println(lIIIIllIl[lIIIIlllI[22]]);
                                lIIlIIIllllIllI.interact(lIIIIllIl[lIIIIlllI[15]]);
                                Time.sleepTicks((int)lIIIIlllI[4]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean S() {
        return lIIIIlllI[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[35])) {
            bl = lIIIIlllI[1];
            0;
            
            }
        } else {
            bl = lIIIIlllI[0];
        }
        return bl;
    }

    private static boolean lllIIIIIIlI(int n2) {
        return n2 == 0;
    }
}

