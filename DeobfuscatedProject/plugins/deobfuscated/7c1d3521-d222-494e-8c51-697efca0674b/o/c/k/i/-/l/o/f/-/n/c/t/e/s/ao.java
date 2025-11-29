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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

public class ao
implements ac {
    public static final /* synthetic */ int nv;
    public static final /* synthetic */ int nq;
    public static final /* synthetic */ int[] nw;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldArea y;
    public static final /* synthetic */ int nt;
    public static /* synthetic */ int[] ny;
    public static /* synthetic */ WorldPoint F;
    private static /* synthetic */ String[] llIlIIIlII;
    public static final /* synthetic */ int ns;
    public static final /* synthetic */ int nu;
    private static /* synthetic */ int[] llIlIIIlIl;
    public static /* synthetic */ int[] nx;
    public static final /* synthetic */ int nr;
    public static /* synthetic */ List<d> bv;

    private static boolean lIllIIIIlllll(Object object) {
        return object != null;
    }

    private static String lIllIIIIllIIl(String llllllllllllllllllIIlIIlIllIIIll, String llllllllllllllllllIIlIIlIllIIIlI) {
        llllllllllllllllllIIlIIlIllIIIll = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIIlIllIIIIl = new StringBuilder();
        char[] llllllllllllllllllIIlIIlIllIIIII = llllllllllllllllllIIlIIlIllIIIlI.toCharArray();
        int llllllllllllllllllIIlIIlIlIlllll = llIlIIIlIl[0];
        char[] llllllllllllllllllIIlIIlIlIllIIl = llllllllllllllllllIIlIIlIllIIIll.toCharArray();
        int llllllllllllllllllIIlIIlIlIllIII = llllllllllllllllllIIlIIlIlIllIIl.length;
        int llllllllllllllllllIIlIIlIlIlIlll = llIlIIIlIl[0];
        while (ao.lIllIIIIlllIl(llllllllllllllllllIIlIIlIlIlIlll, llllllllllllllllllIIlIIlIlIllIII)) {
            char llllllllllllllllllIIlIIlIllIIlII = llllllllllllllllllIIlIIlIlIllIIl[llllllllllllllllllIIlIIlIlIlIlll];
            llllllllllllllllllIIlIIlIllIIIIl.append((char)(llllllllllllllllllIIlIIlIllIIlII ^ llllllllllllllllllIIlIIlIllIIIII[llllllllllllllllllIIlIIlIlIlllll % llllllllllllllllllIIlIIlIllIIIII.length]));
            0;
            ++llllllllllllllllllIIlIIlIlIlllll;
            ++llllllllllllllllllIIlIIlIlIlIlll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIlIIlIllIIIIl);
    }

    @Override
    public int af() {
        ao.fQ();
        return llIlIIIlIl[41];
    }

    private static void lIllIIIIllIlI() {
        llIlIIIlII = new String[llIlIIIlIl[63]];
        ao.llIlIIIlII[ao.llIlIIIlIl[0]] = ao."Buying items";
        ao.llIlIIIlII[ao.llIlIIIlIl[1]] = ao."Finished buying items, switching back to mining";
        ao.llIlIIIlII[ao.llIlIIIlIl[3]] = ao."Navigating to bank";
        ao.llIlIIIlII[ao.llIlIIIlIl[4]] = ao."Handling banking";
        ao.llIlIIIlII[ao.llIlIIIlIl[6]] = ao."We are missing axes, switching to BUYING";
        ao.llIlIIIlII[ao.llIlIIIlIl[24]] = ao."Dropping";
        ao.llIlIIIlII[ao.llIlIIIlIl[22]] = ao."Walking to mine";
        ao.llIlIIIlII[ao.llIlIIIlIl[26]] = ao."Mining copper";
        ao.llIlIIIlII[ao.llIlIIIlIl[27]] = ao."Mine";
        ao.llIlIIIlII[ao.llIlIIIlIl[28]] = ao."Walking to iron ores";
        ao.llIlIIIlII[ao.llIlIIIlIl[29]] = ao."Mining iron";
        ao.llIlIIIlII[ao.llIlIIIlIl[30]] = ao."Mine";
        ao.llIlIIIlII[ao.llIlIIIlIl[42]] = ao."Mining";
        ao.llIlIIIlII[ao.llIlIIIlIl[43]] = ao."ring of wealth (";
    }

    private static String lIllIIIIllIII(String llllllllllllllllllIIlIIlIlIIllII, String llllllllllllllllllIIlIIlIlIIlIll) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIlIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIlIlIIlIll.getBytes(StandardCharsets.UTF_8)), llIlIIIlIl[27]), "DES");
            Cipher llllllllllllllllllIIlIIlIlIlIIII = Cipher.getInstance("DES");
            llllllllllllllllllIIlIIlIlIlIIII.init(llIlIIIlIl[3], llllllllllllllllllIIlIIlIlIlIIIl);
            return new String(llllllllllllllllllIIlIIlIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIlIIlIlIIllll) {
            llllllllllllllllllIIlIIlIlIIllll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[31])) {
            boolean bl;
            int[] nArray = new int[llIlIIIlIl[1]];
            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                bl = llIlIIIlIl[1];
                0;
                if (((0x36 ^ 0x2D) & ~(0x10 ^ 0xB)) == 0) return bl;
                return ((0x53 ^ 0xD) & ~(0x54 ^ 0xA)) != 0;
            }
            bl = llIlIIIlIl[0];
            return bl;
        }
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[32]) && ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[31])) {
            int n3;
            int[] nArray = new int[llIlIIIlIl[1]];
            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llIlIIIlIl[1]];
                nArray2[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray2))) {
                    n3 = llIlIIIlIl[1];
                    0;
                    if (((0x2A ^ 0x11) & ~(0x3E ^ 5)) >= 0) return n3 != 0;
                    return ((0x52 ^ 0xB) & ~(0xE0 ^ 0xB9)) != 0;
                }
            }
            n3 = llIlIIIlIl[0];
            return n3 != 0;
        }
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[33]) && ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[32])) {
            int n4;
            int[] nArray = new int[llIlIIIlIl[1]];
            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[llIlIIIlIl[1]];
                nArray3[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[llIlIIIlIl[1]];
                    nArray4[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                    if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray4))) {
                        n4 = llIlIIIlIl[1];
                        0;
                        if (-2 < 0) return n4 != 0;
                        return ((0x62 ^ 0x65) & ~(0x5A ^ 0x5D)) != 0;
                    }
                }
            }
            n4 = llIlIIIlIl[0];
            return n4 != 0;
        }
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[22]) && ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[33])) {
            int n5;
            int[] nArray = new int[llIlIIIlIl[1]];
            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[llIlIIIlIl[1]];
                nArray5[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[llIlIIIlIl[1]];
                    nArray6[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                    if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[llIlIIIlIl[1]];
                        nArray7[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                        if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray7))) {
                            n5 = llIlIIIlIl[1];
                            0;
                            if ((0xAB ^ 0xC4 ^ (0xA9 ^ 0xC2)) != 0) return n5 != 0;
                            return ((0x3B ^ 0x5C ^ (0xCC ^ 0xBE)) & (77 + 133 - 185 + 131 ^ 29 + 77 - 36 + 67 ^ -1)) != 0;
                        }
                    }
                }
            }
            n5 = llIlIIIlIl[0];
            return n5 != 0;
        }
        int[] nArray = new int[llIlIIIlIl[1]];
        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
        if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[llIlIIIlIl[1]];
            nArray8[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[llIlIIIlIl[1]];
                nArray9[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[llIlIIIlIl[1]];
                    nArray10[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                    if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[llIlIIIlIl[1]];
                        nArray11[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                        if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray11))) {
                            n2 = llIlIIIlIl[1];
                            0;
                            if (null == null) return n2 != 0;
                            return ((0x8E ^ 0x82) & ~(0x4C ^ 0x40)) != 0;
                        }
                    }
                }
            }
        }
        n2 = llIlIIIlIl[0];
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIlIIIlII[llIlIIIlIl[42]];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[2])) {
            bl = llIlIIIlIl[1];
            0;
            if (2 < 1) {
                return ((0x61 ^ 0x54) & ~(0xBE ^ 0x8B)) != 0;
            }
        } else {
            bl = llIlIIIlIl[0];
        }
        return bl;
    }

    private static boolean lIllIIIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllIIIIllIll() {
        llIlIIIlIl = new int[64];
        ao.llIlIIIlIl[0] = (57 + 211 - 100 + 59 ^ 30 + 60 - 83 + 153) & (0xE9 ^ 0xC7 ^ (0x71 ^ 0x1C) ^ -1);
        ao.llIlIIIlIl[1] = 1;
        ao.llIlIIIlIl[2] = 0xA4 ^ 0xB2;
        ao.llIlIIIlIl[3] = 2;
        ao.llIlIIIlIl[4] = 3;
        ao.llIlIIIlIl[5] = -(0xFFFFEEFF & 0x3113) & (0xFFFFBFBB & 0x73DE);
        ao.llIlIIIlIl[6] = 56 + 11 - -13 + 67 ^ 120 + 43 - 37 + 25;
        ao.llIlIIIlIl[7] = 0xFFFFBEF7 & 0x45F9;
        ao.llIlIIIlIl[8] = 0xFFFFDFF5 & 0x24FF;
        ao.llIlIIIlIl[9] = 0xFFFF8FF9 & 0x74FF;
        ao.llIlIIIlIl[10] = 0xFFFF87F7 & 0x7CFF;
        ao.llIlIIIlIl[11] = 0xFFFF85FB & 0x7EFF;
        ao.llIlIIIlIl[12] = 0xFFFFAEF5 & 0x7F5E;
        ao.llIlIIIlIl[13] = 0xFFFFFEF7 & 0x2F58;
        ao.llIlIIIlIl[14] = -(0xFFFFFDB1 & 0x427F) & (0xFFFFEEFE & 0x7F7F);
        ao.llIlIIIlIl[15] = -(0xFFFFF6BB & 0x59F7) & (0xFFFFFFFE & 0x7EFF);
        ao.llIlIIIlIl[16] = 0xFFFFEE57 & 0x3FFA;
        ao.llIlIIIlIl[17] = 0xFFFFBECA & 0x6F7F;
        ao.llIlIIIlIl[18] = -(0xFFFFEF98 & 0x1177) & (0xFFFFAFCF & Short.MAX_VALUE);
        ao.llIlIIIlIl[19] = 0x37 ^ 0x5B ^ (0x9E ^ 0xAA);
        ao.llIlIIIlIl[20] = 0xFFFFFECE & 0x2FFD;
        ao.llIlIIIlIl[21] = -(0xFFFFF3B5 & 0x1C7F) & (0xFFFFFF7F & 0x5FBF);
        ao.llIlIIIlIl[22] = 0x89 ^ 0x8F;
        ao.llIlIIIlIl[23] = 0x6A ^ 0x7E;
        ao.llIlIIIlIl[24] = 0x43 ^ 0x46;
        ao.llIlIIIlIl[25] = 0x44 ^ 0x4B;
        ao.llIlIIIlIl[26] = 98 + 93 - 139 + 91 ^ 121 + 9 - 99 + 105;
        ao.llIlIIIlIl[27] = 0x69 ^ 0x61;
        ao.llIlIIIlIl[28] = 0x73 ^ 0x4F ^ (0x4A ^ 0x7F);
        ao.llIlIIIlIl[29] = 0x70 ^ 0x7A;
        ao.llIlIIIlIl[30] = 0x82 ^ 0x89;
        ao.llIlIIIlIl[31] = 0x29 ^ 0;
        ao.llIlIIIlIl[32] = 0x5A ^ 0x3E ^ (0x2E ^ 0x55);
        ao.llIlIIIlIl[33] = 0x1C ^ 0x2B ^ (0xB8 ^ 0x9A);
        ao.llIlIIIlIl[34] = -(0xFFFFDCDE & 0x6763) & (0xFFFFDEFB & 0xEDFD);
        ao.llIlIIIlIl[35] = 0xFFFFA77E & 0x7BA9;
        ao.llIlIIIlIl[36] = 0xFFFFBABC & 0x7FDB;
        ao.llIlIIIlIl[37] = -(0xAF ^ 0xB8) & (0xFFFFF7BF & 0x69FE);
        ao.llIlIIIlIl[38] = -(0xFFFFCE7D & 0x71AB) & (0xFFFFDF6F & Short.MAX_VALUE);
        ao.llIlIIIlIl[39] = 0x78 ^ 0x50;
        ao.llIlIIIlIl[40] = -(0xFFFFFDBE & 0x3E7D) & (0xFFFFBFFF & 0x7FBF);
        ao.llIlIIIlIl[41] = 0xF1 ^ 0x8A ^ (0xDC ^ 0xC3);
        ao.llIlIIIlIl[42] = 0x36 ^ 0x3A;
        ao.llIlIIIlIl[43] = 0x28 ^ 0x12 ^ (0xA8 ^ 0x9F);
        ao.llIlIIIlIl[44] = 0xFFFFE7B5 & 0x19FE;
        ao.llIlIIIlIl[45] = 0xFFFF93FE & 0x6DB9;
        ao.llIlIIIlIl[46] = 0xFFFFA653 & 0x5FFD;
        ao.llIlIIIlIl[47] = -(0xFFFF9D37 & 0x7BE9) & (0xFFFF9F77 & 0x7FFD);
        ao.llIlIIIlIl[48] = -(0xFFFFBDCF & 0x4BB9) & (0xFFFFFFFB & 0xFDF);
        ao.llIlIIIlIl[49] = -(0xFFFFB84F & 0x5FB9) & (0xFFFFFE7F & 0x1FDF);
        ao.llIlIIIlIl[50] = -(0xFFFFA6FE & 0x792F) & (0xFFFFFFBF & 0x7BFF);
        ao.llIlIIIlIl[51] = -(0xFFFFF1FF & 0x3E77) & (0xFFFFFFFE & Short.MAX_VALUE);
        ao.llIlIIIlIl[52] = -(0xFFFFF533 & 0x3AFD) & (0xFFFFFFF7 & 0x7FBE);
        ao.llIlIIIlIl[53] = 0xFFFFEFE7 & 0x3C7D;
        ao.llIlIIIlIl[54] = -(0xFFFFDBBB & 0x6757) & (0xFFFFEFF7 & 0x7F7E);
        ao.llIlIIIlIl[55] = -(0xFFFFF37F & 0x4CC7) & (0xFFFFFBFF & 0x6FDF);
        ao.llIlIIIlIl[56] = -(0xFFFFE943 & 0x57FD) & (0xFFFFEBFF & Short.MAX_VALUE);
        ao.llIlIIIlIl[57] = 0xFFFF9FFB & 0x6B95;
        ao.llIlIIIlIl[58] = -(0xFFFFE6AF & 0x7B74) & (0xFFFFFEFF & 0x6FBF);
        ao.llIlIIIlIl[59] = 0xA0 ^ 0xBC;
        ao.llIlIIIlIl[60] = 59 + 18 - -16 + 54 ^ 56 + 5 - 0 + 75;
        ao.llIlIIIlIl[61] = -(0xFFFFB973 & 0x56ED) & (0xFFFFFBFF & 0x1FFF);
        ao.llIlIIIlIl[62] = 0xFFFF8DBA & 0x7EEF;
        ao.llIlIIIlIl[63] = 0x43 ^ 0x4D;
    }

    public static void Q() {
        d llllllllllllllllllIIlIIlIllllIll;
        Object llllllllllllllllllIIlIIlIlllllII;
        d d2 = new d(llIlIIIlIl[18], llIlIIIlIl[1], llIlIIIlIl[34]);
        bv.add(d2);
        0;
        int[] nArray = new int[llIlIIIlIl[1]];
        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d3 = new d(llIlIIIlIl[7], llIlIIIlIl[1], llIlIIIlIl[5]);
            bv.add(d3);
            0;
        }
        int[] nArray2 = new int[llIlIIIlIl[1]];
        nArray2[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIlllllII = new d(llIlIIIlIl[8], llIlIIIlIl[1], llIlIIIlIl[5]);
            bv.add((d)llllllllllllllllllIIlIIlIlllllII);
            0;
        }
        int[] nArray3 = new int[llIlIIIlIl[1]];
        nArray3[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIlllllII = new d(llIlIIIlIl[9], llIlIIIlIl[1], llIlIIIlIl[35]);
            bv.add((d)llllllllllllllllllIIlIIlIlllllII);
            0;
        }
        int[] nArray4 = new int[llIlIIIlIl[1]];
        nArray4[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIlllllII = new d(llIlIIIlIl[10], llIlIIIlIl[1], llIlIIIlIl[36]);
            bv.add((d)llllllllllllllllllIIlIIlIlllllII);
            0;
        }
        int[] nArray5 = new int[llIlIIIlIl[1]];
        nArray5[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIlllllII = new d(llIlIIIlIl[11], llIlIIIlIl[1], llIlIIIlIl[37]);
            bv.add((d)llllllllllllllllllIIlIIlIlllllII);
            0;
        }
        if (ao.lIllIIIIllllI(Bank.contains((Predicate)(llllllllllllllllllIIlIIlIlllllII = item -> item.getName().toLowerCase().contains(llIlIIIlII[llIlIIIlIl[43]]))) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIllllIll = new d(llIlIIIlIl[20], llIlIIIlIl[24], llIlIIIlIl[37]);
            bv.add(llllllllllllllllllIIlIIlIllllIll);
            0;
        }
        int[] nArray6 = new int[llIlIIIlIl[1]];
        nArray6[ao.llIlIIIlIl[0]] = llIlIIIlIl[38];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllllllllllllllllIIlIIlIllllIll = new d(llIlIIIlIl[38], llIlIIIlIl[39], llIlIIIlIl[40]);
            bv.add(llllllllllllllllllIIlIIlIllllIll);
            0;
        }
    }

    @Override
    public boolean ae() {
        return llIlIIIlIl[0];
    }

    private static boolean lIllIIIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIllllI(int n2) {
        return n2 == 0;
    }

    public static void fQ() {
        block32: {
            BankLocation llllllllllllllllllIIlIIllIIIIIIl;
            block33: {
                block39: {
                    block35: {
                        block38: {
                            block37: {
                                block36: {
                                    block34: {
                                        if (ao.lIllIIIIlllII(bt ? 1 : 0)) {
                                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[0]];
                                            b.a(bv);
                                            if (ao.lIllIIIIlllIl(bv.size(), llIlIIIlIl[1])) {
                                                System.out.println(llIlIIIlII[llIlIIIlIl[1]]);
                                                bt = llIlIIIlIl[0];
                                            }
                                        }
                                        if (!ao.lIllIIIIllllI(bt ? 1 : 0) || !ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[2])) break block32;
                                        if (!ao.lIllIIIIllllI(ao.an() ? 1 : 0)) break block33;
                                        llllllllllllllllllIIlIIllIIIIIIl = BankLocation.getNearest();
                                        if (ao.lIllIIIIlllll(llllllllllllllllllIIlIIllIIIIIIl) && ao.lIllIIIIllllI(llllllllllllllllllIIlIIllIIIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[3]];
                                            a.a(llllllllllllllllllIIlIIllIIIIIIl);
                                        }
                                        if (!ao.lIllIIIIlllll(llllllllllllllllllIIlIIllIIIIIIl) || !ao.lIllIIIIlllII(llllllllllllllllllIIlIIllIIIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block33;
                                        AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[4]];
                                        if (ao.lIllIIIIllllI(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIlIl[5]);
                                            0;
                                        }
                                        if (!ao.lIllIIIIlllII(Bank.isOpen() ? 1 : 0)) break block33;
                                        if (ao.lIllIIIlIIIII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llIlIIIlIl[6]);
                                            0;
                                        }
                                        if (ao.lIllIIIlIIIII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llIlIIIlIl[3]);
                                            0;
                                        }
                                        int[] nArray = new int[llIlIIIlIl[1]];
                                        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                                        if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                        int[] nArray2 = new int[llIlIIIlIl[1]];
                                        nArray2[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                                        if (!ao.lIllIIIlIIIIl(Inventory.getCount((int[])nArray2), llIlIIIlIl[1])) break block35;
                                    }
                                    int[] nArray = new int[llIlIIIlIl[1]];
                                    nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                                    if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                    int[] nArray3 = new int[llIlIIIlIl[1]];
                                    nArray3[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                                    if (!ao.lIllIIIlIIIIl(Inventory.getCount((int[])nArray3), llIlIIIlIl[1])) break block35;
                                }
                                int[] nArray = new int[llIlIIIlIl[1]];
                                nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                                if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                int[] nArray4 = new int[llIlIIIlIl[1]];
                                nArray4[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                                if (!ao.lIllIIIlIIIIl(Inventory.getCount((int[])nArray4), llIlIIIlIl[1])) break block35;
                            }
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                            if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                            int[] nArray5 = new int[llIlIIIlIl[1]];
                            nArray5[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                            if (!ao.lIllIIIlIIIIl(Inventory.getCount((int[])nArray5), llIlIIIlIl[1])) break block35;
                        }
                        int[] nArray = new int[llIlIIIlIl[1]];
                        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
                        if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                        int[] nArray6 = new int[llIlIIIlIl[1]];
                        nArray6[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
                        if (!ao.lIllIIIIlllIl(Inventory.getCount((int[])nArray6), llIlIIIlIl[1])) break block39;
                    }
                    ao.Q();
                    System.out.println(llIlIIIlII[llIlIIIlIl[6]]);
                    bt = llIlIIIlIl[1];
                    return;
                }
                a.a(llIlIIIlIl[12], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[13], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[14], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[15], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[16], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[17], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[18], llIlIIIlIl[1]);
                int[] nArray = new int[llIlIIIlIl[1]];
                nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[12];
                if (ao.lIllIIIIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray7 = new int[llIlIIIlIl[1]];
                    nArray7[ao.llIlIIIlIl[0]] = llIlIIIlIl[12];
                    if (ao.lIllIIIIllllI(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[llIlIIIlIl[1]];
                        nArray8[ao.llIlIIIlIl[0]] = llIlIIIlIl[12];
                        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            a.a(llIlIIIlIl[19], llIlIIIlIl[1]);
                        }
                    }
                }
                a.a(llIlIIIlIl[20], llIlIIIlIl[1]);
                e.l(llIlIIIlIl[12]);
                e.l(llIlIIIlIl[13]);
                e.l(llIlIIIlIl[14]);
                e.l(llIlIIIlIl[15]);
                e.l(llIlIIIlIl[16]);
                Time.sleepTicks((int)llIlIIIlIl[1]);
                0;
                e.l(llIlIIIlIl[18]);
                e.l(llIlIIIlIl[21]);
                e.l(llIlIIIlIl[17]);
                e.l(llIlIIIlIl[19]);
                e.l(llIlIIIlIl[20]);
                Time.sleepTicks((int)llIlIIIlIl[4]);
                0;
                if (ao.lIllIIIIllllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)llIlIIIlIl[22]);
                    0;
                }
                if (ao.lIllIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray9 = new int[llIlIIIlIl[1]];
                    nArray9[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[7], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];
                                0;
                                if (-3 >= 0) {
                                    return ((0x54 ^ 0x3F ^ (0x48 ^ 0x6D)) & (0x4D ^ 0x1E ^ (0xDF ^ 0xC2) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);
                        0;
                    }
                    int[] nArray10 = new int[llIlIIIlIl[1]];
                    nArray10[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[8], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];
                                0;
                                if (2 < 1) {
                                    return ((54 + 171 - 79 + 28 ^ 6 + 138 - 94 + 100) & (0xBB ^ 0xA4 ^ (0xAD ^ 0x8A) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);
                        0;
                    }
                    int[] nArray11 = new int[llIlIIIlIl[1]];
                    nArray11[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[9], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];
                                0;
                                if (-1 >= 3) {
                                    return ((0x39 ^ 0x2C) & ~(0x73 ^ 0x66)) != 0;
                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);
                        0;
                    }
                    int[] nArray12 = new int[llIlIIIlIl[1]];
                    nArray12[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[10], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];
                                0;
                                if (-1 >= 0) {
                                    return ((0xD7 ^ 0xA9 ^ (0xE9 ^ 0xB1)) & (0xCD ^ 0x9D ^ (0xD6 ^ 0xA0) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);
                        0;
                    }
                    int[] nArray13 = new int[llIlIIIlIl[1]];
                    nArray13[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[11], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];
                                0;
                                if (null != null) {
                                    return ((0xED ^ 0xAE) & ~(0x53 ^ 0x10)) != 0;
                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);
                        0;
                    }
                    int[] nArray14 = new int[llIlIIIlIl[1]];
                    nArray14[ao.llIlIIIlIl[0]] = llIlIIIlIl[18];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[18], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[18];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];
                                0;
                                if (2 <= 1) {
                                    return ((158 + 171 - 188 + 40 ^ 135 + 3 - 106 + 129) & (0xB1 ^ 0x89 ^ (0x54 ^ 0x78) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);
                        0;
                    }
                }
            }
            if (ao.lIllIIIIlllII(ao.an() ? 1 : 0)) {
                if (ao.lIllIIIIllllI(Movement.isRunEnabled() ? 1 : 0) && ao.lIllIIIlIIIlI(Movement.getRunEnergy(), llIlIIIlIl[23])) {
                    Movement.toggleRun();
                    Time.sleepTicks((int)llIlIIIlIl[24]);
                    0;
                }
                if (ao.lIllIIIIlllII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[24]];
                    Inventory.getAll((int[])nw).stream().forEach(Item::drop);
                }
                if (ao.lIllIIIIllllI(Inventory.isFull() ? 1 : 0)) {
                    if (ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[25])) {
                        if (ao.lIllIIIIllllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[22]];
                            Movement.walkTo((WorldPoint)F);
                            0;
                            Time.sleepTicks((int)llIlIIIlIl[6]);
                            0;
                        }
                        if (ao.lIllIIIIlllII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[26]];
                            llllllllllllllllllIIlIIllIIIIIIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ny);
                            if (ao.lIllIIIIllllI(Players.getLocal().isAnimating() ? 1 : 0) && ao.lIllIIIIllllI(Players.getLocal().isMoving() ? 1 : 0) && ao.lIllIIIIlllll(llllllllllllllllllIIlIIllIIIIIIl)) {
                                llllllllllllllllllIIlIIllIIIIIIl.interact(llIlIIIlII[llIlIIIlIl[27]]);
                                Time.sleepTicks((int)llIlIIIlIl[3]);
                                0;
                            }
                        }
                    }
                    if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[25])) {
                        if (ao.lIllIIIIllllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[28]];
                            Movement.walkTo((WorldPoint)F);
                            0;
                            Time.sleepTicks((int)llIlIIIlIl[6]);
                            0;
                        }
                        if (ao.lIllIIIIlllII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[29]];
                            llllllllllllllllllIIlIIllIIIIIIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])nx);
                            if (ao.lIllIIIIllllI(Players.getLocal().isAnimating() ? 1 : 0) && ao.lIllIIIIllllI(Players.getLocal().isMoving() ? 1 : 0) && ao.lIllIIIIlllll(llllllllllllllllllIIlIIllIIIIIIl)) {
                                llllllllllllllllllIIlIIllIIIIIIl.interact(llIlIIIlII[llIlIIIlIl[30]]);
                                Time.sleepTicks((int)llIlIIIlIl[3]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    private static String lIllIIIIlIlll(String llllllllllllllllllIIlIIlIlllIIll, String llllllllllllllllllIIlIIlIlllIIII) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIlIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIlIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIlIIlIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIlIIlIlllIlIl.init(llIlIIIlIl[3], llllllllllllllllllIIlIIlIlllIllI);
            return new String(llllllllllllllllllIIlIIlIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIlIIlIlllIlII) {
            llllllllllllllllllIIlIIlIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        ao.lIllIIIIllIll();
        ao.lIllIIIIllIlI();
        nr = llIlIIIlIl[8];
        nt = llIlIIIlIl[10];
        nq = llIlIIIlIl[7];
        nv = llIlIIIlIl[18];
        nu = llIlIIIlIl[11];
        ns = llIlIIIlIl[9];
        int[] nArray = new int[llIlIIIlIl[28]];
        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[44];
        nArray[ao.llIlIIIlIl[1]] = llIlIIIlIl[45];
        nArray[ao.llIlIIIlIl[3]] = llIlIIIlIl[46];
        nArray[ao.llIlIIIlIl[4]] = llIlIIIlIl[47];
        nArray[ao.llIlIIIlIl[6]] = llIlIIIlIl[48];
        nArray[ao.llIlIIIlIl[24]] = llIlIIIlIl[49];
        nArray[ao.llIlIIIlIl[22]] = llIlIIIlIl[50];
        nArray[ao.llIlIIIlIl[26]] = llIlIIIlIl[51];
        nArray[ao.llIlIIIlIl[27]] = llIlIIIlIl[52];
        nw = nArray;
        bv = new ArrayList<d>();
        int[] nArray2 = new int[llIlIIIlIl[3]];
        nArray2[ao.llIlIIIlIl[0]] = llIlIIIlIl[53];
        nArray2[ao.llIlIIIlIl[1]] = llIlIIIlIl[54];
        nx = nArray2;
        int[] nArray3 = new int[llIlIIIlIl[3]];
        nArray3[ao.llIlIIIlIl[0]] = llIlIIIlIl[55];
        nArray3[ao.llIlIIIlIl[1]] = llIlIIIlIl[56];
        ny = nArray3;
        y = new WorldArea(llIlIIIlIl[57], llIlIIIlIl[58], llIlIIIlIl[59], llIlIIIlIl[60], llIlIIIlIl[0]);
        F = new WorldPoint(llIlIIIlIl[61], llIlIIIlIl[62], llIlIIIlIl[0]);
    }

    private static boolean lIllIIIIlllII(int n2) {
        return n2 != 0;
    }
}

