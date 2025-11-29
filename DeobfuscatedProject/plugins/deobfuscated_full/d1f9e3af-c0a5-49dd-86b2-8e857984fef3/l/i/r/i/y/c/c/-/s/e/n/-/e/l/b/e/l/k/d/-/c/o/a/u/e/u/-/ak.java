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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
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

public class ak
implements W {
    public static final /* synthetic */ int mk;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ int mh;
    private static /* synthetic */ String[] lIlllllll;
    public static /* synthetic */ int[] mn;
    public static final /* synthetic */ int ml;
    public static final /* synthetic */ int mg;
    public static final /* synthetic */ int mj;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ int mi;
    public static /* synthetic */ int[] mo;
    public static /* synthetic */ WorldArea z;
    public static final /* synthetic */ int[] mm;
    private static /* synthetic */ int[] llIIIIIII;
    public static /* synthetic */ boolean bt;

    private static void lIlIIIIIlllI() {
        lIlllllll = new String[llIIIIIII[63]];
        ak.lIlllllll[ak.llIIIIIII[0]] = ak."Buying items";
        ak.lIlllllll[ak.llIIIIIII[1]] = ak."Finished buying items, switching back to mining";
        ak.lIlllllll[ak.llIIIIIII[2]] = ak."Navigating to bank";
        ak.lIlllllll[ak.llIIIIIII[3]] = ak."Handling banking";
        ak.lIlllllll[ak.llIIIIIII[5]] = ak."We are missing axes, switching to BUYING";
        ak.lIlllllll[ak.llIIIIIII[23]] = ak."Dropping";
        ak.lIlllllll[ak.llIIIIIII[21]] = ak."Walking to mine";
        ak.lIlllllll[ak.llIIIIIII[25]] = ak."Mining copper";
        ak.lIlllllll[ak.llIIIIIII[26]] = ak."Mine";
        ak.lIlllllll[ak.llIIIIIII[27]] = ak."Walking to iron ores";
        ak.lIlllllll[ak.llIIIIIII[28]] = ak."Mining iron";
        ak.lIlllllll[ak.llIIIIIII[29]] = ak."Mine";
        ak.lIlllllll[ak.llIIIIIII[41]] = ak."Mining";
        ak.lIlllllll[ak.llIIIIIII[43]] = ak."ring of wealth (";
    }

    private static boolean lIlIIIIlIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIlllllll[llIIIIIII[41]];
    }

    private static boolean lIlIIIIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIIIIIllII(String lIlllllllllIlI, String lIlllllllllllI) {
        lIlllllllllIlI = new String(Base64.getDecoder().decode(lIlllllllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllllllllllIl = new StringBuilder();
        char[] lIllllllllllII = lIlllllllllllI.toCharArray();
        int lIlllllllllIll = llIIIIIII[0];
        char[] lIllllllllIlIl = lIlllllllllIlI.toCharArray();
        int lIllllllllIlII = lIllllllllIlIl.length;
        int lIllllllllIIll = llIIIIIII[0];
        while (ak.lIlIIIIlIIlI(lIllllllllIIll, lIllllllllIlII)) {
            char llIIIIIIIIIIII = lIllllllllIlIl[lIllllllllIIll];
            lIllllllllllIl.append((char)(llIIIIIIIIIIII ^ lIllllllllllII[lIlllllllllIll % lIllllllllllII.length]));
            0;
            ++lIlllllllllIll;
            ++lIllllllllIIll;
            0;
            if (((0x30 ^ 0x52) & ~(0x37 ^ 0x55)) == 0) continue;
            return null;
        }
        return String.valueOf(lIllllllllllIl);
    }

    private static boolean lIlIIIIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ak.lIlIIIIlIllI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[42])) {
            bl = llIIIIIII[1];
            0;
            if (-1 == 1) {
                return ((0x6E ^ 0x16 ^ (0x39 ^ 0xB)) & (0x57 ^ 0x18 ^ (0xF ^ 0xA) ^ -1)) != 0;
            }
        } else {
            bl = llIIIIIII[0];
        }
        return bl;
    }

    @Override
    public int T() {
        ak.er();
        return llIIIIIII[40];
    }

    private static boolean lIlIIIIlIIll(int n2) {
        return n2 == 0;
    }

    static {
        ak.lIlIIIIlIIII();
        ak.lIlIIIIIlllI();
        mj = llIIIIIII[9];
        ml = llIIIIIII[17];
        mk = llIIIIIII[10];
        mh = llIIIIIII[7];
        mi = llIIIIIII[8];
        mg = llIIIIIII[6];
        int[] nArray = new int[llIIIIIII[27]];
        nArray[ak.llIIIIIII[0]] = llIIIIIII[44];
        nArray[ak.llIIIIIII[1]] = llIIIIIII[45];
        nArray[ak.llIIIIIII[2]] = llIIIIIII[46];
        nArray[ak.llIIIIIII[3]] = llIIIIIII[47];
        nArray[ak.llIIIIIII[5]] = llIIIIIII[48];
        nArray[ak.llIIIIIII[23]] = llIIIIIII[49];
        nArray[ak.llIIIIIII[21]] = llIIIIIII[50];
        nArray[ak.llIIIIIII[25]] = llIIIIIII[51];
        nArray[ak.llIIIIIII[26]] = llIIIIIII[52];
        mm = nArray;
        bv = new ArrayList<d>();
        int[] nArray2 = new int[llIIIIIII[2]];
        nArray2[ak.llIIIIIII[0]] = llIIIIIII[53];
        nArray2[ak.llIIIIIII[1]] = llIIIIIII[54];
        mn = nArray2;
        int[] nArray3 = new int[llIIIIIII[2]];
        nArray3[ak.llIIIIIII[0]] = llIIIIIII[55];
        nArray3[ak.llIIIIIII[1]] = llIIIIIII[56];
        mo = nArray3;
        z = new WorldArea(llIIIIIII[57], llIIIIIII[58], llIIIIIII[59], llIIIIIII[60], llIIIIIII[0]);
        G = new WorldPoint(llIIIIIII[61], llIIIIIII[62], llIIIIIII[0]);
    }

    @Override
    public boolean S() {
        return llIIIIIII[0];
    }

    private static boolean lIlIIIIlIlII(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static void af() {
        d llIIIIIIlIIlII;
        Object llIIIIIIlIIlIl;
        d d2 = new d(llIIIIIII[17], llIIIIIII[1], llIIIIIII[33]);
        bv.add(d2);
        0;
        int[] nArray = new int[llIIIIIII[1]];
        nArray[ak.llIIIIIII[0]] = llIIIIIII[6];
        if (ak.lIlIIIIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d3 = new d(llIIIIIII[6], llIIIIIII[1], llIIIIIII[4]);
            bv.add(d3);
            0;
        }
        int[] nArray2 = new int[llIIIIIII[1]];
        nArray2[ak.llIIIIIII[0]] = llIIIIIII[7];
        if (ak.lIlIIIIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIIIIIIlIIlIl = new d(llIIIIIII[7], llIIIIIII[1], llIIIIIII[4]);
            bv.add((d)llIIIIIIlIIlIl);
            0;
        }
        int[] nArray3 = new int[llIIIIIII[1]];
        nArray3[ak.llIIIIIII[0]] = llIIIIIII[8];
        if (ak.lIlIIIIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIIIIIIlIIlIl = new d(llIIIIIII[8], llIIIIIII[1], llIIIIIII[34]);
            bv.add((d)llIIIIIIlIIlIl);
            0;
        }
        int[] nArray4 = new int[llIIIIIII[1]];
        nArray4[ak.llIIIIIII[0]] = llIIIIIII[9];
        if (ak.lIlIIIIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIIIIIIlIIlIl = new d(llIIIIIII[9], llIIIIIII[1], llIIIIIII[35]);
            bv.add((d)llIIIIIIlIIlIl);
            0;
        }
        int[] nArray5 = new int[llIIIIIII[1]];
        nArray5[ak.llIIIIIII[0]] = llIIIIIII[10];
        if (ak.lIlIIIIlIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIIIIIIlIIlIl = new d(llIIIIIII[10], llIIIIIII[1], llIIIIIII[36]);
            bv.add((d)llIIIIIIlIIlIl);
            0;
        }
        if (ak.lIlIIIIlIIll(Bank.contains((Predicate)(llIIIIIIlIIlIl = item -> item.getName().toLowerCase().contains(lIlllllll[llIIIIIII[43]]))) ? 1 : 0)) {
            llIIIIIIlIIlII = new d(llIIIIIII[19], llIIIIIII[23], llIIIIIII[36]);
            bv.add(llIIIIIIlIIlII);
            0;
        }
        int[] nArray6 = new int[llIIIIIII[1]];
        nArray6[ak.llIIIIIII[0]] = llIIIIIII[37];
        if (ak.lIlIIIIlIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llIIIIIIlIIlII = new d(llIIIIIII[37], llIIIIIII[38], llIIIIIII[39]);
            bv.add(llIIIIIIlIIlII);
            0;
        }
    }

    private static boolean lIlIIIIlIlIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ab() {
        int n2;
        if (ak.lIlIIIIlIllI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[30])) {
            boolean bl;
            int[] nArray = new int[llIIIIIII[1]];
            nArray[ak.llIIIIIII[0]] = llIIIIIII[10];
            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                bl = llIIIIIII[1];
                0;
                if (1 >= 0) return bl;
                return false;
            }
            bl = llIIIIIII[0];
            return bl;
        }
        if (ak.lIlIIIIlIllI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[31]) && ak.lIlIIIIlIIlI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[30])) {
            int n3;
            int[] nArray = new int[llIIIIIII[1]];
            nArray[ak.llIIIIIII[0]] = llIIIIIII[10];
            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llIIIIIII[1]];
                nArray2[ak.llIIIIIII[0]] = llIIIIIII[9];
                if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray2))) {
                    n3 = llIIIIIII[1];
                    0;
                    if (1 >= 1) return n3 != 0;
                    return false;
                }
            }
            n3 = llIIIIIII[0];
            return n3 != 0;
        }
        if (ak.lIlIIIIlIllI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[32]) && ak.lIlIIIIlIIlI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[31])) {
            int n4;
            int[] nArray = new int[llIIIIIII[1]];
            nArray[ak.llIIIIIII[0]] = llIIIIIII[10];
            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[llIIIIIII[1]];
                nArray3[ak.llIIIIIII[0]] = llIIIIIII[9];
                if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[llIIIIIII[1]];
                    nArray4[ak.llIIIIIII[0]] = llIIIIIII[8];
                    if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray4))) {
                        n4 = llIIIIIII[1];
                        0;
                        if (2 >= 0) return n4 != 0;
                        return ((0x30 ^ 0x6B ^ (0x43 ^ 0x23)) & (116 + 50 - 164 + 135 ^ 167 + 157 - 311 + 165 ^ -1)) != 0;
                    }
                }
            }
            n4 = llIIIIIII[0];
            return n4 != 0;
        }
        if (ak.lIlIIIIlIllI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[21]) && ak.lIlIIIIlIIlI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[32])) {
            int n5;
            int[] nArray = new int[llIIIIIII[1]];
            nArray[ak.llIIIIIII[0]] = llIIIIIII[10];
            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[llIIIIIII[1]];
                nArray5[ak.llIIIIIII[0]] = llIIIIIII[9];
                if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[llIIIIIII[1]];
                    nArray6[ak.llIIIIIII[0]] = llIIIIIII[8];
                    if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[llIIIIIII[1]];
                        nArray7[ak.llIIIIIII[0]] = llIIIIIII[7];
                        if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray7))) {
                            n5 = llIIIIIII[1];
                            0;
                            if (((0x58 ^ 0x4D) & ~(0x84 ^ 0x91)) == ((0x9C ^ 0x84) & ~(0xAF ^ 0xB7))) return n5 != 0;
                            return false;
                        }
                    }
                }
            }
            n5 = llIIIIIII[0];
            return n5 != 0;
        }
        int[] nArray = new int[llIIIIIII[1]];
        nArray[ak.llIIIIIII[0]] = llIIIIIII[10];
        if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[llIIIIIII[1]];
            nArray8[ak.llIIIIIII[0]] = llIIIIIII[9];
            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[llIIIIIII[1]];
                nArray9[ak.llIIIIIII[0]] = llIIIIIII[8];
                if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[llIIIIIII[1]];
                    nArray10[ak.llIIIIIII[0]] = llIIIIIII[7];
                    if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[llIIIIIII[1]];
                        nArray11[ak.llIIIIIII[0]] = llIIIIIII[6];
                        if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray11))) {
                            n2 = llIIIIIII[1];
                            0;
                            if (1 < 3) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = llIIIIIII[0];
        return n2 != 0;
    }

    private static void lIlIIIIlIIII() {
        llIIIIIII = new int[64];
        ak.llIIIIIII[0] = (23 + 152 - 150 + 181 ^ 7 + 146 - 138 + 181) & (47 + 122 - 0 + 20 ^ 106 + 29 - 93 + 141 ^ -1);
        ak.llIIIIIII[1] = 1;
        ak.llIIIIIII[2] = 2;
        ak.llIIIIIII[3] = 3;
        ak.llIIIIIII[4] = 0xFFFFDF9A & 0x33ED;
        ak.llIIIIIII[5] = 15 + 132 - 36 + 29 ^ 123 + 82 - 203 + 134;
        ak.llIIIIIII[6] = 0xFFFFB7F1 & 0x4CFF;
        ak.llIIIIIII[7] = -(0xFFFFFBFB & 0x3F0F) & (0xFFFFFFFF & 0x3FFF);
        ak.llIIIIIII[8] = 0xFFFFC6FF & 0x3DF9;
        ak.llIIIIIII[9] = -(0xFFFFCB2B & 0x7DDD) & (0xFFFFEFFF & 0x5DFF);
        ak.llIIIIIII[10] = -(0xFFFFAB05 & 0x74FF) & (0xFFFFF4FF & 0x2FFF);
        ak.llIIIIIII[11] = -(0xFFFFEC7B & 0x5385) & (0xFFFFEF56 & 0x7EFD);
        ak.llIIIIIII[12] = -(106 + 139 - 200 + 119) & (0xFFFFAFFF & 0x7EF3);
        ak.llIIIIIII[13] = 0xFFFFBECE & 0x6F7F;
        ak.llIIIIIII[14] = 0xFFFFFF4E & 0x2EFD;
        ak.llIIIIIII[15] = -(0x60 ^ 0x66) & (0xFFFFBE57 & 0x6FFF);
        ak.llIIIIIII[16] = -(0xFFFFF9EF & 0x57B6) & (0xFFFFFFEF & Short.MAX_VALUE);
        ak.llIIIIIII[17] = -(0xFFFFD2FF & 0x6D15) & (0xFFFFEFD4 & 0x7EFF);
        ak.llIIIIIII[18] = 0x54 ^ 0x5A ^ (0xEA ^ 0xBC);
        ak.llIIIIIII[19] = 0xFFFFFEEC & 0x2FDF;
        ak.llIIIIIII[20] = 0xFFFFDF2B & 0x6FDF;
        ak.llIIIIIII[21] = 0xA0 ^ 0xA6;
        ak.llIIIIIII[22] = 0xA6 ^ 0xB2;
        ak.llIIIIIII[23] = 0x79 ^ 0x7C;
        ak.llIIIIIII[24] = 0x66 ^ 0x24 ^ (0x14 ^ 0x59);
        ak.llIIIIIII[25] = 141 + 154 - 174 + 48 ^ 162 + 0 - 50 + 62;
        ak.llIIIIIII[26] = 0x24 ^ 0x31 ^ (0x76 ^ 0x6B);
        ak.llIIIIIII[27] = 0x96 ^ 0x9F;
        ak.llIIIIIII[28] = 0xA ^ 0;
        ak.llIIIIIII[29] = 0x26 ^ 0x2D;
        ak.llIIIIIII[30] = 0x59 ^ 0x70;
        ak.llIIIIIII[31] = 0xF8 ^ 0x92 ^ (0x28 ^ 0x5D);
        ak.llIIIIIII[32] = 0x13 ^ 6;
        ak.llIIIIIII[33] = -(0xFFFFF6EF & 0x1D52) & (0xFFFFFDFF & 0x9EF9);
        ak.llIIIIIII[34] = 0xFFFFE7EE & 0x3B39;
        ak.llIIIIIII[35] = -(0xFFFFE787 & 0x5D7F) & (0xFFFFFFDF & 0x7FBE);
        ak.llIIIIIII[36] = 0xFFFFF5BD & 0x6BEA;
        ak.llIIIIIII[37] = 0xFFFFDF6F & 0x3FD7;
        ak.llIIIIIII[38] = 4 ^ 0x2C;
        ak.llIIIIIII[39] = -(0xFFFFDAFD & 0x7506) & (0xFFFFDBF7 & 0x778F);
        ak.llIIIIIII[40] = 0xCA ^ 0xAE;
        ak.llIIIIIII[41] = 0x40 ^ 0x20 ^ (0x65 ^ 9);
        ak.llIIIIIII[42] = 0x49 ^ 0x2A;
        ak.llIIIIIII[43] = 0x57 ^ 0x5A;
        ak.llIIIIIII[44] = -(0xFFFF9D9D & 0x7E6E) & (0xFFFF9FFF & 0x7DBF);
        ak.llIIIIIII[45] = 0xFFFF85BE & 0x7BF9;
        ak.llIIIIIII[46] = 0xFFFFDE7B & 0x27D5;
        ak.llIIIIIII[47] = 0xFFFF97D7 & 0x6E7D;
        ak.llIIIIIII[48] = -(0xFFFFDFB7 & 0x7969) & (0xFFFFFF7B & 0x5FF7);
        ak.llIIIIIII[49] = 0xFFFFB6DF & 0x4F77;
        ak.llIIIIIII[50] = -(0xFFFFFF3B & 0x24C5) & (0xFFFFFF92 & Short.MAX_VALUE);
        ak.llIIIIIII[51] = 0xFFFFFF8D & 0x4FFA;
        ak.llIIIIIII[52] = -(0xFFFFBDF9 & 0x723F) & (0xFFFFFFBE & Short.MAX_VALUE);
        ak.llIIIIIII[53] = -(0xFFFFF38F & 0x1DF1) & (0xFFFFBFEF & 0x7DF5);
        ak.llIIIIIII[54] = 0xFFFFAE6F & 0x7DF4;
        ak.llIIIIIII[55] = -(0xFFFFDCF7 & 0x770F) & (0xFFFFFFBF & 0x7FDF);
        ak.llIIIIIII[56] = -(0xCA ^ 0x8B) & (0xFFFFABFF & 0x7EFF);
        ak.llIIIIIII[57] = -(0xFFFFE7FD & 0x3C6F) & (0xFFFFBFFF & 0x6FFD);
        ak.llIIIIIII[58] = 0xFFFFEF9C & 0x1CFF;
        ak.llIIIIIII[59] = 0xBA ^ 0xA6;
        ak.llIIIIIII[60] = 0x28 ^ 0x2D ^ (0xAE ^ 0xB0);
        ak.llIIIIIII[61] = -(0xFFFFF4EF & 0x3F31) & (0xFFFFBFBF & Short.MAX_VALUE);
        ak.llIIIIIII[62] = 0xFFFFEDEE & 0x1EBB;
        ak.llIIIIIII[63] = 0x2B ^ 0x77 ^ (0x25 ^ 0x77);
    }

    private static String lIlIIIIIllIl(String llIIIIIIIlllII, String llIIIIIIIllIll) {
        try {
            SecretKeySpec llIIIIIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIIIllIll.getBytes(StandardCharsets.UTF_8)), llIIIIIII[26]), "DES");
            Cipher llIIIIIIIllllI = Cipher.getInstance("DES");
            llIIIIIIIllllI.init(llIIIIIII[2], llIIIIIIIlllll);
            return new String(llIIIIIIIllllI.doFinal(Base64.getDecoder().decode(llIIIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIIlllIl) {
            llIIIIIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIIlIll(String llIIIIIIIIllIl, String llIIIIIIIIllII) {
        try {
            SecretKeySpec llIIIIIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIIIlIIIl = Cipher.getInstance("Blowfish");
            llIIIIIIIlIIIl.init(llIIIIIII[2], llIIIIIIIlIIlI);
            return new String(llIIIIIIIlIIIl.doFinal(Base64.getDecoder().decode(llIIIIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIIlIIII) {
            llIIIIIIIlIIII.printStackTrace();
            return null;
        }
    }

    public static void er() {
        block32: {
            BankLocation llIIIIIIlIlIlI;
            block33: {
                block39: {
                    block35: {
                        block38: {
                            block37: {
                                block36: {
                                    block34: {
                                        if (ak.lIlIIIIlIIIl(bt ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[0]];
                                            b.a(bv);
                                            if (ak.lIlIIIIlIIlI(bv.size(), llIIIIIII[1])) {
                                                System.out.println(lIlllllll[llIIIIIII[1]]);
                                                bt = llIIIIIII[0];
                                            }
                                        }
                                        if (!ak.lIlIIIIlIIll(bt ? 1 : 0)) break block32;
                                        if (!ak.lIlIIIIlIIll(ak.ab() ? 1 : 0)) break block33;
                                        llIIIIIIlIlIlI = BankLocation.getNearest();
                                        if (ak.lIlIIIIlIlII(llIIIIIIlIlIlI) && ak.lIlIIIIlIIll(llIIIIIIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[2]];
                                            a.a(llIIIIIIlIlIlI);
                                        }
                                        if (!ak.lIlIIIIlIlII(llIIIIIIlIlIlI) || !ak.lIlIIIIlIIIl(llIIIIIIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block33;
                                        AccBuilderEasyClues.c = lIlllllll[llIIIIIII[3]];
                                        if (ak.lIlIIIIlIIll(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIIII[4]);
                                            0;
                                        }
                                        if (!ak.lIlIIIIlIIIl(Bank.isOpen() ? 1 : 0)) break block33;
                                        if (ak.lIlIIIIlIlIl(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llIIIIIII[5]);
                                            0;
                                        }
                                        if (ak.lIlIIIIlIlIl(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llIIIIIII[2]);
                                            0;
                                        }
                                        int[] nArray = new int[llIIIIIII[1]];
                                        nArray[ak.llIIIIIII[0]] = llIIIIIII[6];
                                        if (!ak.lIlIIIIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                        int[] nArray2 = new int[llIIIIIII[1]];
                                        nArray2[ak.llIIIIIII[0]] = llIIIIIII[6];
                                        if (!ak.lIlIIIIlIllI(Inventory.getCount((int[])nArray2), llIIIIIII[1])) break block35;
                                    }
                                    int[] nArray = new int[llIIIIIII[1]];
                                    nArray[ak.llIIIIIII[0]] = llIIIIIII[7];
                                    if (!ak.lIlIIIIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                    int[] nArray3 = new int[llIIIIIII[1]];
                                    nArray3[ak.llIIIIIII[0]] = llIIIIIII[7];
                                    if (!ak.lIlIIIIlIllI(Inventory.getCount((int[])nArray3), llIIIIIII[1])) break block35;
                                }
                                int[] nArray = new int[llIIIIIII[1]];
                                nArray[ak.llIIIIIII[0]] = llIIIIIII[8];
                                if (!ak.lIlIIIIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                int[] nArray4 = new int[llIIIIIII[1]];
                                nArray4[ak.llIIIIIII[0]] = llIIIIIII[8];
                                if (!ak.lIlIIIIlIllI(Inventory.getCount((int[])nArray4), llIIIIIII[1])) break block35;
                            }
                            int[] nArray = new int[llIIIIIII[1]];
                            nArray[ak.llIIIIIII[0]] = llIIIIIII[9];
                            if (!ak.lIlIIIIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                            int[] nArray5 = new int[llIIIIIII[1]];
                            nArray5[ak.llIIIIIII[0]] = llIIIIIII[9];
                            if (!ak.lIlIIIIlIllI(Inventory.getCount((int[])nArray5), llIIIIIII[1])) break block35;
                        }
                        int[] nArray = new int[llIIIIIII[1]];
                        nArray[ak.llIIIIIII[0]] = llIIIIIII[10];
                        if (!ak.lIlIIIIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                        int[] nArray6 = new int[llIIIIIII[1]];
                        nArray6[ak.llIIIIIII[0]] = llIIIIIII[10];
                        if (!ak.lIlIIIIlIIlI(Inventory.getCount((int[])nArray6), llIIIIIII[1])) break block39;
                    }
                    ak.af();
                    System.out.println(lIlllllll[llIIIIIII[5]]);
                    bt = llIIIIIII[1];
                    return;
                }
                a.a(llIIIIIII[11], llIIIIIII[1]);
                a.a(llIIIIIII[12], llIIIIIII[1]);
                a.a(llIIIIIII[13], llIIIIIII[1]);
                a.a(llIIIIIII[14], llIIIIIII[1]);
                a.a(llIIIIIII[15], llIIIIIII[1]);
                a.a(llIIIIIII[16], llIIIIIII[1]);
                a.a(llIIIIIII[17], llIIIIIII[1]);
                int[] nArray = new int[llIIIIIII[1]];
                nArray[ak.llIIIIIII[0]] = llIIIIIII[11];
                if (ak.lIlIIIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray7 = new int[llIIIIIII[1]];
                    nArray7[ak.llIIIIIII[0]] = llIIIIIII[11];
                    if (ak.lIlIIIIlIIll(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[llIIIIIII[1]];
                        nArray8[ak.llIIIIIII[0]] = llIIIIIII[11];
                        if (ak.lIlIIIIlIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            a.a(llIIIIIII[18], llIIIIIII[1]);
                        }
                    }
                }
                a.a(llIIIIIII[19], llIIIIIII[1]);
                e.l(llIIIIIII[11]);
                e.l(llIIIIIII[12]);
                e.l(llIIIIIII[13]);
                e.l(llIIIIIII[14]);
                e.l(llIIIIIII[15]);
                Time.sleepTicks((int)llIIIIIII[1]);
                0;
                e.l(llIIIIIII[17]);
                e.l(llIIIIIII[20]);
                e.l(llIIIIIII[16]);
                e.l(llIIIIIII[18]);
                e.l(llIIIIIII[19]);
                Time.sleepTicks((int)llIIIIIII[3]);
                0;
                if (ak.lIlIIIIlIIll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)llIIIIIII[21]);
                    0;
                }
                if (ak.lIlIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray9 = new int[llIIIIIII[1]];
                    nArray9[ak.llIIIIIII[0]] = llIIIIIII[6];
                    if (ak.lIlIIIIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIIIII[6], (int)llIIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIIII[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIIII[1]];
                            nArray[ak.llIIIIIII[0]] = llIIIIIII[6];
                            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIIII[1];
                                0;
                                if ((0x2B ^ 0x2F) <= 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIIIIII[0];
                            }
                            return bl;
                        }, (int)llIIIIIII[4]);
                        0;
                    }
                    int[] nArray10 = new int[llIIIIIII[1]];
                    nArray10[ak.llIIIIIII[0]] = llIIIIIII[7];
                    if (ak.lIlIIIIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIIIII[7], (int)llIIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIIII[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIIII[1]];
                            nArray[ak.llIIIIIII[0]] = llIIIIIII[7];
                            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIIII[1];
                                0;
                                if (2 <= 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIIIIII[0];
                            }
                            return bl;
                        }, (int)llIIIIIII[4]);
                        0;
                    }
                    int[] nArray11 = new int[llIIIIIII[1]];
                    nArray11[ak.llIIIIIII[0]] = llIIIIIII[8];
                    if (ak.lIlIIIIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIIIII[8], (int)llIIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIIII[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIIII[1]];
                            nArray[ak.llIIIIIII[0]] = llIIIIIII[8];
                            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIIII[1];
                                0;
                                if ((0x43 ^ 0x47) < (1 & ~1)) {
                                    return false;
                                }
                            } else {
                                bl = llIIIIIII[0];
                            }
                            return bl;
                        }, (int)llIIIIIII[4]);
                        0;
                    }
                    int[] nArray12 = new int[llIIIIIII[1]];
                    nArray12[ak.llIIIIIII[0]] = llIIIIIII[9];
                    if (ak.lIlIIIIlIIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIIIII[9], (int)llIIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIIII[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIIII[1]];
                            nArray[ak.llIIIIIII[0]] = llIIIIIII[9];
                            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIIII[1];
                                0;
                                if (2 == 0) {
                                    return ((0x53 ^ 0xE ^ (0xB ^ 0x7C)) & (24 + 135 - 133 + 145 ^ 119 + 31 - 108 + 87 ^ -1)) != 0;
                                }
                            } else {
                                bl = llIIIIIII[0];
                            }
                            return bl;
                        }, (int)llIIIIIII[4]);
                        0;
                    }
                    int[] nArray13 = new int[llIIIIIII[1]];
                    nArray13[ak.llIIIIIII[0]] = llIIIIIII[10];
                    if (ak.lIlIIIIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIIIII[10], (int)llIIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIIII[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIIII[1]];
                            nArray[ak.llIIIIIII[0]] = llIIIIIII[10];
                            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIIII[1];
                                0;
                                
                                }
                            } else {
                                bl = llIIIIIII[0];
                            }
                            return bl;
                        }, (int)llIIIIIII[4]);
                        0;
                    }
                    int[] nArray14 = new int[llIIIIIII[1]];
                    nArray14[ak.llIIIIIII[0]] = llIIIIIII[17];
                    if (ak.lIlIIIIlIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIIIII[17], (int)llIIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIIIII[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIIIII[1]];
                            nArray[ak.llIIIIIII[0]] = llIIIIIII[17];
                            if (ak.lIlIIIIlIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIIIIIII[1];
                                0;
                                if (3 < 1) {
                                    return ((0xBA ^ 0x91 ^ (0x2D ^ 0x43)) & (0xB7 ^ 0xA6 ^ (0x59 ^ 0xD) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIIIIIII[0];
                            }
                            return bl;
                        }, (int)llIIIIIII[4]);
                        0;
                    }
                }
            }
            if (ak.lIlIIIIlIIIl(ak.ab() ? 1 : 0)) {
                if (ak.lIlIIIIlIIll(Movement.isRunEnabled() ? 1 : 0) && ak.lIlIIIIlIlll(Movement.getRunEnergy(), llIIIIIII[22])) {
                    Movement.toggleRun();
                    Time.sleepTicks((int)llIIIIIII[23]);
                    0;
                }
                if (ak.lIlIIIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllllll[llIIIIIII[23]];
                    Inventory.getAll((int[])mm).stream().forEach(Item::drop);
                }
                if (ak.lIlIIIIlIIll(Inventory.isFull() ? 1 : 0)) {
                    if (ak.lIlIIIIlIIlI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[24])) {
                        if (ak.lIlIIIIlIIll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[21]];
                            Movement.walkTo((WorldPoint)G);
                            0;
                            Time.sleepTicks((int)llIIIIIII[5]);
                            0;
                        }
                        if (ak.lIlIIIIlIIIl(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[25]];
                            llIIIIIIlIlIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mo);
                            if (ak.lIlIIIIlIIll(Players.getLocal().isAnimating() ? 1 : 0) && ak.lIlIIIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && ak.lIlIIIIlIlII(llIIIIIIlIlIlI)) {
                                llIIIIIIlIlIlI.interact(lIlllllll[llIIIIIII[26]]);
                                Time.sleepTicks((int)llIIIIIII[2]);
                                0;
                            }
                        }
                    }
                    if (ak.lIlIIIIlIllI(Skills.getLevel((Skill)Skill.MINING), llIIIIIII[24])) {
                        if (ak.lIlIIIIlIIll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[27]];
                            Movement.walkTo((WorldPoint)G);
                            0;
                            Time.sleepTicks((int)llIIIIIII[5]);
                            0;
                        }
                        if (ak.lIlIIIIlIIIl(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllll[llIIIIIII[28]];
                            llIIIIIIlIlIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mn);
                            if (ak.lIlIIIIlIIll(Players.getLocal().isAnimating() ? 1 : 0) && ak.lIlIIIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && ak.lIlIIIIlIlII(llIIIIIIlIlIlI)) {
                                llIIIIIIlIlIlI.interact(lIlllllll[llIIIIIII[29]]);
                                Time.sleepTicks((int)llIIIIIII[2]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }
}

