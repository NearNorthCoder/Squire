/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
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
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.z;

public class aj
implements ac {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lllIIlIlII;
    private static /* synthetic */ String[] lllIIlIIll;
    public static /* synthetic */ List<d> bv;

    private static boolean llIIIIIlIIIll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private static int fM() {
        int n2 = lllIIlIlII[26];
        int n3 = lllIIlIlII[27];
        if (aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8])) {
            return (n2 - Skills.getExperience((Skill)Skill.HERBLORE)) / lllIIlIlII[28] + lllIIlIlII[16];
        }
        if (aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8]) && aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[12])) {
            void lllllllllllllllllIlllIllIIlIIllI;
            return (int)((lllllllllllllllllIlllIllIIlIIllI - Skills.getExperience((Skill)Skill.HERBLORE)) / lllIIlIlII[29] + lllIIlIlII[30]);
        }
        return lllIIlIlII[1];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean fN() {
        int n2;
        if (aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8])) {
            int n3;
            int[] nArray = new int[lllIIlIlII[1]];
            nArray[aj.lllIIlIlII[0]] = lllIIlIlII[9];
            if (aj.llIIIIIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIlIlII[1]];
                nArray2[aj.lllIIlIlII[0]] = lllIIlIlII[11];
                if (aj.llIIIIIIlllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = lllIIlIlII[1];
                    0;
                    if (-(0 ^ 9 ^ (0x78 ^ 0x75)) < 0) return n3 != 0;
                    return ((3 ^ (0x76 ^ 0x59)) & (26 + 149 - 71 + 129 ^ 115 + 163 - 274 + 193 ^ -1)) != 0;
                }
            }
            n3 = lllIIlIlII[0];
            return n3 != 0;
        }
        if (aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8]) && aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[12])) {
            int n4;
            int[] nArray = new int[lllIIlIlII[1]];
            nArray[aj.lllIIlIlII[0]] = lllIIlIlII[13];
            if (aj.llIIIIIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lllIIlIlII[1]];
                nArray3[aj.lllIIlIlII[0]] = lllIIlIlII[14];
                if (aj.llIIIIIIlllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = lllIIlIlII[1];
                    0;
                    if (1 > 0) return n4 != 0;
                    return ((0x73 ^ 0x36 ^ (0x6D ^ 8)) & (172 + 190 - 230 + 59 ^ 36 + 13 - -51 + 59 ^ -1)) != 0;
                }
            }
            n4 = lllIIlIlII[0];
            return n4 != 0;
        }
        if (!aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[12])) return lllIIlIlII[0];
        int[] nArray = new int[lllIIlIlII[1]];
        nArray[aj.lllIIlIlII[0]] = lllIIlIlII[9];
        if (aj.llIIIIIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lllIIlIlII[1]];
            nArray4[aj.lllIIlIlII[0]] = lllIIlIlII[15];
            if (aj.llIIIIIIlllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                n2 = lllIIlIlII[1];
                0;
                if (3 >= 0) return n2 != 0;
                return (3 & ~3) != 0;
            }
        }
        n2 = lllIIlIlII[0];
        return n2 != 0;
    }

    static {
        aj.llIIIIIIllIll();
        aj.llIIIIIIllIlI();
        bv = new ArrayList<d>();
    }

    @Override
    public int af() {
        aj.fL();
        return lllIIlIlII[23];
    }

    private static void llIIIIIIllIll() {
        lllIIlIlII = new int[36];
        aj.lllIIlIlII[0] = (0x1C ^ 0x11) & ~(0x41 ^ 0x4C);
        aj.lllIIlIlII[1] = 1;
        aj.lllIIlIlII[2] = 0xB1 ^ 0x99;
        aj.lllIIlIlII[3] = 0x9E ^ 0x84 ^ (0x4B ^ 1);
        aj.lllIIlIlII[4] = 0x65 ^ 0x22 ^ (0x5D ^ 0x1E);
        aj.lllIIlIlII[5] = 2;
        aj.lllIIlIlII[6] = 3;
        aj.lllIIlIlII[7] = -(0xFFFFDCF6 & 0x6F4F) & (0xFFFFFFCF & 0x5FFD);
        aj.lllIIlIlII[8] = 71 + 108 - 73 + 82 ^ 90 + 84 - 143 + 135;
        aj.lllIIlIlII[9] = 27 + 104 - 38 + 128;
        aj.lllIIlIlII[10] = 0xEC ^ 0xA0 ^ (0xDB ^ 0x99);
        aj.lllIIlIlII[11] = 0x1E ^ 0xC ^ (0x32 ^ 0x7B);
        aj.lllIIlIlII[12] = 0x51 ^ 0x7C;
        aj.lllIIlIlII[13] = 0xFFFFDFF7 & 0x27BF;
        aj.lllIIlIlII[14] = 0x4E ^ 0x2F;
        aj.lllIIlIlII[15] = 0x22 ^ 0x47;
        aj.lllIIlIlII[16] = 112 + 98 - 186 + 135 ^ 8 + 47 - 54 + 153;
        aj.lllIIlIlII[17] = 0xFFFFC97E & 0x378F;
        aj.lllIIlIlII[18] = 0xBE ^ 0xB3;
        aj.lllIIlIlII[19] = 0xFFFFE9FC & 0x77AB;
        aj.lllIIlIlII[20] = -(0xFFFFFDBF & 0x7643) & (0xFFFFFFFA & 0x77EF);
        aj.lllIIlIlII[21] = 0x33 ^ 0x27;
        aj.lllIIlIlII[22] = 0xFFFFBDF0 & 0x439F;
        aj.lllIIlIlII[23] = 1 ^ (0x1B ^ 0x7E);
        aj.lllIIlIlII[24] = -(0xFFFFAF5D & 0x58AB) & (0xFFFFCB7E & 0x3FDB);
        aj.lllIIlIlII[25] = -(0xFFFFBDF7 & 0x7ABA) & (0xFFFFFFBF & 0x3FF9);
        aj.lllIIlIlII[26] = 0xFFFFAB77 & 0x76AC;
        aj.lllIIlIlII[27] = 0xFFFFF4F8 & 0xFB4F;
        aj.lllIIlIlII[28] = 1 ^ 0x18;
        aj.lllIIlIlII[29] = 0xE3 ^ 0xA0;
        aj.lllIIlIlII[30] = 0xEE ^ 0xAE ^ (0x8A ^ 0xC5);
        aj.lllIIlIlII[31] = 4 ^ 0x15 ^ (0x95 ^ 0x82);
        aj.lllIIlIlII[32] = 141 + 1 - 99 + 118 ^ 82 + 31 - 63 + 116;
        aj.lllIIlIlII[33] = 0xE2 ^ 0xBF ^ (0xEC ^ 0xB9);
        aj.lllIIlIlII[34] = 0xA2 ^ 0xAB;
        aj.lllIIlIlII[35] = 0xF2 ^ 0x95 ^ (0xCF ^ 0xA2);
    }

    private static String llIIIIIIllIII(String lllllllllllllllllIlllIlIllllIlll, String lllllllllllllllllIlllIlIllllIllI) {
        try {
            SecretKeySpec lllllllllllllllllIlllIlIllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIlIlllllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIlIlllllIll.init(lllIIlIlII[5], lllllllllllllllllIlllIlIllllllII);
            return new String(lllllllllllllllllIlllIlIlllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIlIlllllIlI) {
            lllllllllllllllllIlllIlIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIIIlllII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ae() {
        return lllIIlIlII[0];
    }

    private static String llIIIIIIlIlll(String lllllllllllllllllIlllIllIIIIlllI, String lllllllllllllllllIlllIllIIIIlIII) {
        lllllllllllllllllIlllIllIIIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIllIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIllIIIIllII = new StringBuilder();
        char[] lllllllllllllllllIlllIllIIIIlIll = lllllllllllllllllIlllIllIIIIlIII.toCharArray();
        int lllllllllllllllllIlllIllIIIIlIlI = lllIIlIlII[0];
        char[] lllllllllllllllllIlllIllIIIIIlII = lllllllllllllllllIlllIllIIIIlllI.toCharArray();
        int lllllllllllllllllIlllIllIIIIIIll = lllllllllllllllllIlllIllIIIIIlII.length;
        int lllllllllllllllllIlllIllIIIIIIlI = lllIIlIlII[0];
        while (aj.llIIIIIIlllIl(lllllllllllllllllIlllIllIIIIIIlI, lllllllllllllllllIlllIllIIIIIIll)) {
            char lllllllllllllllllIlllIllIIIIllll = lllllllllllllllllIlllIllIIIIIlII[lllllllllllllllllIlllIllIIIIIIlI];
            lllllllllllllllllIlllIllIIIIllII.append((char)(lllllllllllllllllIlllIllIIIIllll ^ lllllllllllllllllIlllIllIIIIlIll[lllllllllllllllllIlllIllIIIIlIlI % lllllllllllllllllIlllIllIIIIlIll.length]));
            0;
            ++lllllllllllllllllIlllIllIIIIlIlI;
            ++lllllllllllllllllIlllIllIIIIIIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlllIllIIIIllII);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8])) {
            int n3;
            int[] nArray = new int[lllIIlIlII[1]];
            nArray[aj.lllIIlIlII[0]] = lllIIlIlII[9];
            if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIlIlII[1]];
                nArray2[aj.lllIIlIlII[0]] = lllIIlIlII[11];
                if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = lllIIlIlII[1];
                    0;
                    if (-1 < 2) return n3 != 0;
                    return ((0xB9 ^ 0x9B) & ~(0x5D ^ 0x7F)) != 0;
                }
            }
            n3 = lllIIlIlII[0];
            return n3 != 0;
        }
        if (aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8]) && aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[12])) {
            int n4;
            int[] nArray = new int[lllIIlIlII[1]];
            nArray[aj.lllIIlIlII[0]] = lllIIlIlII[13];
            if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lllIIlIlII[1]];
                nArray3[aj.lllIIlIlII[0]] = lllIIlIlII[14];
                if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = lllIIlIlII[1];
                    0;
                    if ((93 + 36 - 77 + 103 ^ 4 + 14 - -49 + 92) >= -1) return n4 != 0;
                    return ((0xAA ^ 0xBC ^ (0xF1 ^ 0xAA)) & (114 + 12 - -49 + 80 ^ 29 + 93 - 71 + 127 ^ -1)) != 0;
                }
            }
            n4 = lllIIlIlII[0];
            return n4 != 0;
        }
        if (!aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[12])) return lllIIlIlII[0];
        int[] nArray = new int[lllIIlIlII[1]];
        nArray[aj.lllIIlIlII[0]] = lllIIlIlII[9];
        if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lllIIlIlII[1]];
            nArray4[aj.lllIIlIlII[0]] = lllIIlIlII[15];
            if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                n2 = lllIIlIlII[1];
                0;
                if ((2 & (2 ^ -1)) >= 0) return n2 != 0;
                return ((0xA8 ^ 0xA7 ^ (0x44 ^ 3)) & (0x43 ^ 0x75 ^ (0x4F ^ 0x31) ^ -1)) != 0;
            }
        }
        n2 = lllIIlIlII[0];
        return n2 != 0;
    }

    private static boolean llIIIIIIllllI(int n2) {
        return n2 == 0;
    }

    @Override
    public String ag() {
        return lllIIlIIll[lllIIlIlII[31]];
    }

    private static boolean llIIIIIlIIIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[2])) {
            bl = lllIIlIlII[1];
            0;
            if (2 <= 1) {
                return ((85 + 73 - -11 + 15 ^ 63 + 128 - 182 + 131) & (18 + 138 - 71 + 92 ^ 58 + 72 - 32 + 35 ^ -1)) != 0;
            }
        } else {
            bl = lllIIlIlII[0];
        }
        return bl;
    }

    public static void Q() {
        d lllllllllllllllllIlllIllIIlIlIlI;
        if (aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8])) {
            int[] nArray = new int[lllIIlIlII[1]];
            nArray[aj.lllIIlIlII[0]] = lllIIlIlII[9];
            if (aj.llIIIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lllIIlIlII[9], lllIIlIlII[20], lllIIlIlII[21]);
                bv.add(d2);
                0;
            }
            int[] nArray2 = new int[lllIIlIlII[1]];
            nArray2[aj.lllIIlIlII[0]] = lllIIlIlII[11];
            if (aj.llIIIIIIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lllllllllllllllllIlllIllIIlIlIlI = new d(lllIIlIlII[11], aj.fM(), lllIIlIlII[22]);
                bv.add(lllllllllllllllllIlllIllIIlIlIlI);
                0;
            }
        }
        if (aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8]) && aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[12])) {
            int[] nArray = new int[lllIIlIlII[1]];
            nArray[aj.lllIIlIlII[0]] = lllIIlIlII[13];
            if (aj.llIIIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllllllllllllllllIlllIllIIlIlIlI = new d(lllIIlIlII[13], aj.fM(), lllIIlIlII[23]);
                bv.add(lllllllllllllllllIlllIllIIlIlIlI);
                0;
            }
            int[] nArray3 = new int[lllIIlIlII[1]];
            nArray3[aj.lllIIlIlII[0]] = lllIIlIlII[14];
            if (aj.llIIIIIIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lllllllllllllllllIlllIllIIlIlIlI = new d(lllIIlIlII[14], aj.fM(), lllIIlIlII[24]);
                bv.add(lllllllllllllllllIlllIllIIlIlIlI);
                0;
            }
        }
        if (aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[12])) {
            int[] nArray = new int[lllIIlIlII[1]];
            nArray[aj.lllIIlIlII[0]] = lllIIlIlII[9];
            if (aj.llIIIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllllllllllllllllIlllIllIIlIlIlI = new d(lllIIlIlII[9], lllIIlIlII[20], lllIIlIlII[21]);
                bv.add(lllllllllllllllllIlllIllIIlIlIlI);
                0;
            }
            int[] nArray4 = new int[lllIIlIlII[1]];
            nArray4[aj.lllIIlIlII[0]] = lllIIlIlII[15];
            if (aj.llIIIIIIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lllllllllllllllllIlllIllIIlIlIlI = new d(lllIIlIlII[15], lllIIlIlII[20], lllIIlIlII[25]);
                bv.add(lllllllllllllllllIlllIllIIlIlIlI);
                0;
            }
        }
    }

    private static boolean llIIIIIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIIIIllIlI() {
        lllIIlIIll = new String[lllIIlIlII[35]];
        aj.lllIIlIIll[aj.lllIIlIlII[0]] = aj."Buying items";
        aj.lllIIlIIll[aj.lllIIlIlII[1]] = aj."Finished buying items, switching back to herblore";
        aj.lllIIlIIll[aj.lllIIlIlII[5]] = aj."Navigating to bank";
        aj.lllIIlIIll[aj.lllIIlIlII[6]] = aj."Handling banking";
        aj.lllIIlIIll[aj.lllIIlIlII[4]] = aj."We are missing supplies, switching to BUYING";
        aj.lllIIlIIll[aj.lllIIlIlII[16]] = aj."Mixing potions";
        aj.lllIIlIIll[aj.lllIIlIlII[31]] = aj."Herblore";
        aj.lllIIlIIll[aj.lllIIlIlII[32]] = aj."Uncut";
        aj.lllIIlIIll[aj.lllIIlIlII[33]] = aj."Chisel";
        aj.lllIIlIIll[aj.lllIIlIlII[34]] = aj."Chisel";
    }

    private static boolean llIIIIIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIIIllIIl(String lllllllllllllllllIlllIllIIIllllI, String lllllllllllllllllIlllIllIIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllllIlllIllIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIllIIIlllIl.getBytes(StandardCharsets.UTF_8)), lllIIlIlII[33]), "DES");
            Cipher lllllllllllllllllIlllIllIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllllIlllIllIIlIIIII.init(lllIIlIlII[5], lllllllllllllllllIlllIllIIlIIIIl);
            return new String(lllllllllllllllllIlllIllIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIllIIIlllll) {
            lllllllllllllllllIlllIllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIIIII(Object object) {
        return object != null;
    }

    public static void fL() {
        block26: {
            BankLocation lllllllllllllllllIlllIllIIlIllII;
            block28: {
                block27: {
                    if (aj.llIIIIIIlllII(bt ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIll[lllIIlIlII[0]];
                        b.a(bv);
                        if (aj.llIIIIIIlllIl(bv.size(), lllIIlIlII[1])) {
                            System.out.println(lllIIlIIll[lllIIlIlII[1]]);
                            bt = lllIIlIlII[0];
                        }
                    }
                    if (!aj.llIIIIIIllllI(bt ? 1 : 0) || !aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[2])) break block26;
                    if (aj.llIIIIIIlllIl(e.j(lllIIlIlII[3]), lllIIlIlII[4])) {
                        z.bt();
                    }
                    if (aj.llIIIIIIllllI(aj.an() ? 1 : 0) && aj.llIIIIIIlllll(e.j(lllIIlIlII[3]), lllIIlIlII[4])) {
                        lllllllllllllllllIlllIllIIlIllII = BankLocation.getNearest();
                        if (aj.llIIIIIlIIIII(lllllllllllllllllIlllIllIIlIllII) && aj.llIIIIIIllllI(lllllllllllllllllIlllIllIIlIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIlIIll[lllIIlIlII[5]];
                            a.a(lllllllllllllllllIlllIllIIlIllII);
                        }
                        if (aj.llIIIIIlIIIII(lllllllllllllllllIlllIllIIlIllII) && aj.llIIIIIIlllII(lllllllllllllllllIlllIllIIlIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIlIIll[lllIIlIlII[6]];
                            if (aj.llIIIIIIllllI(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlIlII[7]);
                                0;
                            }
                            if (aj.llIIIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                                if (aj.llIIIIIlIIIIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIIlIlII[6]);
                                    0;
                                }
                                if (aj.llIIIIIIllllI(aj.fN() ? 1 : 0)) {
                                    aj.Q();
                                    System.out.println(lllIIlIIll[lllIIlIlII[4]]);
                                    bt = lllIIlIlII[1];
                                    return;
                                }
                                if (aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8])) {
                                    a.a(lllIIlIlII[9], lllIIlIlII[10]);
                                    a.a(lllIIlIlII[11], lllIIlIlII[10]);
                                }
                                if (aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[8]) && aj.llIIIIIIlllIl(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[12])) {
                                    a.a(lllIIlIlII[13], lllIIlIlII[10]);
                                    a.a(lllIIlIlII[14], lllIIlIlII[10]);
                                }
                                if (aj.llIIIIIlIIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlIlII[12])) {
                                    a.a(lllIIlIlII[9], lllIIlIlII[10]);
                                    a.a(lllIIlIlII[15], lllIIlIlII[10]);
                                }
                            }
                        }
                    }
                    if (!aj.llIIIIIIlllII(aj.an() ? 1 : 0)) break block26;
                    if (aj.llIIIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                    }
                    if (aj.llIIIIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderSotf.c = lllIIlIIll[lllIIlIlII[16]];
                    int[] nArray = new int[lllIIlIlII[1]];
                    nArray[aj.lllIIlIlII[0]] = lllIIlIlII[9];
                    if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIIlIlII[1]];
                        nArray2[aj.lllIIlIlII[0]] = lllIIlIlII[11];
                        if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lllIIlIlII[1]];
                            nArray3[aj.lllIIlIlII[0]] = lllIIlIlII[9];
                            int[] nArray4 = new int[lllIIlIlII[1]];
                            nArray4[aj.lllIIlIlII[0]] = lllIIlIlII[11];
                            Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));
                            Time.sleepTicks((int)lllIIlIlII[1]);
                            0;
                        }
                    }
                    int[] nArray5 = new int[lllIIlIlII[1]];
                    nArray5[aj.lllIIlIlII[0]] = lllIIlIlII[13];
                    if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[lllIIlIlII[1]];
                        nArray6[aj.lllIIlIlII[0]] = lllIIlIlII[14];
                        if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[lllIIlIlII[1]];
                            nArray7[aj.lllIIlIlII[0]] = lllIIlIlII[13];
                            int[] nArray8 = new int[lllIIlIlII[1]];
                            nArray8[aj.lllIIlIlII[0]] = lllIIlIlII[14];
                            Inventory.getFirst((int[])nArray7).useOn(Inventory.getFirst((int[])nArray8));
                            Time.sleepTicks((int)lllIIlIlII[1]);
                            0;
                        }
                    }
                    int[] nArray9 = new int[lllIIlIlII[1]];
                    nArray9[aj.lllIIlIlII[0]] = lllIIlIlII[9];
                    if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[lllIIlIlII[1]];
                        nArray10[aj.lllIIlIlII[0]] = lllIIlIlII[15];
                        if (aj.llIIIIIIlllII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            int[] nArray11 = new int[lllIIlIlII[1]];
                            nArray11[aj.lllIIlIlII[0]] = lllIIlIlII[9];
                            int[] nArray12 = new int[lllIIlIlII[1]];
                            nArray12[aj.lllIIlIlII[0]] = lllIIlIlII[15];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lllIIlIlII[1]);
                            0;
                        }
                    }
                    int[] nArray13 = new int[lllIIlIlII[1]];
                    nArray13[aj.lllIIlIlII[0]] = lllIIlIlII[9];
                    if (!aj.llIIIIIlIIIll(Inventory.getAll((int[])nArray13).size(), lllIIlIlII[1])) break block27;
                    int[] nArray14 = new int[lllIIlIlII[1]];
                    nArray14[aj.lllIIlIlII[0]] = lllIIlIlII[15];
                    if (!aj.llIIIIIlIIIll(Inventory.getAll((int[])nArray14).size(), lllIIlIlII[1])) break block27;
                    int[] nArray15 = new int[lllIIlIlII[1]];
                    nArray15[aj.lllIIlIlII[0]] = lllIIlIlII[14];
                    if (!aj.llIIIIIlIIIll(Inventory.getAll((int[])nArray15).size(), lllIIlIlII[1])) break block27;
                    int[] nArray16 = new int[lllIIlIlII[1]];
                    nArray16[aj.lllIIlIlII[0]] = lllIIlIlII[11];
                    if (!aj.llIIIIIlIIIll(Inventory.getAll((int[])nArray16).size(), lllIIlIlII[1])) break block27;
                    int[] nArray17 = new int[lllIIlIlII[1]];
                    nArray17[aj.lllIIlIlII[0]] = lllIIlIlII[13];
                    if (!aj.llIIIIIIlllll(Inventory.getAll((int[])nArray17).size(), lllIIlIlII[1])) break block28;
                }
                Time.sleepTicks((int)lllIIlIlII[16]);
                0;
            }
            if (aj.llIIIIIIlllII(Inventory.contains(item -> item.getName().contains(lllIIlIIll[lllIIlIlII[34]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lllIIlIIll[lllIIlIlII[33]])).useOn(Inventory.getFirst(item -> item.getName().contains(lllIIlIIll[lllIIlIlII[32]])));
            }
            if (aj.llIIIIIlIIIII(lllllllllllllllllIlllIllIIlIllII = Widgets.get((int)lllIIlIlII[17], (int)lllIIlIlII[18]))) {
                Dialog.continueSpace();
                Time.sleepTicks((int)lllIIlIlII[5]);
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    block4: {
                        block3: {
                            block2: {
                                int[] nArray = new int[lllIIlIlII[1]];
                                nArray[aj.lllIIlIlII[0]] = lllIIlIlII[9];
                                if (!aj.llIIIIIIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                                int[] nArray2 = new int[lllIIlIlII[1]];
                                nArray2[aj.lllIIlIlII[0]] = lllIIlIlII[13];
                                if (!aj.llIIIIIIlllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                            }
                            if (!aj.llIIIIIIlllII(Dialog.canLevelUpContinue() ? 1 : 0)) break block4;
                        }
                        bl = lllIIlIlII[1];
                        0;
                        if (3 > 1) return bl;
                        return ((141 + 91 - 161 + 75 ^ 110 + 110 - 128 + 74) & (0xC8 ^ 0xA6 ^ (0x7B ^ 0x21) ^ -1)) != 0;
                    }
                    bl = lllIIlIlII[0];
                    return bl;
                }, (int)lllIIlIlII[19]);
                0;
            }
        }
    }
}

