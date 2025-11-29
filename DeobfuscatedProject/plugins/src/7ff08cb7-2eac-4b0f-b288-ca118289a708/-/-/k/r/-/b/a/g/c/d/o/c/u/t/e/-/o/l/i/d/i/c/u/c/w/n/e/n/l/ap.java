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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.y;
import gg.squire.account.AccBuilderGWD;
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

public class ap
implements ab {
    private static /* synthetic */ int[] llIIlIIII;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ String[] llIIIlllI;
    public static /* synthetic */ List<d> bx;

    private static boolean lIlIlIIIIlIl(int n2) {
        return n2 != 0;
    }

    static {
        ap.lIlIlIIIIlII();
        ap.lIlIlIIIIIll();
        bx = new ArrayList<d>();
    }

    @Override
    public String ag() {
        return llIIIlllI[llIIlIIII[30]];
    }

    @Override
    public boolean ae() {
        return llIIlIIII[0];
    }

    private static String lIlIIlllllll(String lIllIlIIIIlllI, String lIllIlIIIIlIll) {
        try {
            SecretKeySpec lIllIlIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIlIIIlIIII = Cipher.getInstance("Blowfish");
            lIllIlIIIlIIII.init(llIIlIIII[4], lIllIlIIIlIIIl);
            return new String(lIllIlIIIlIIII.doFinal(Base64.getDecoder().decode(lIllIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlIIIIllll) {
            lIllIlIIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIlIIl(Object object) {
        return object != null;
    }

    public static void Q() {
        d lIllIlIIIllIlI;
        if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(llIIlIIII[8], llIIlIIII[19], llIIlIIII[20]);
                bx.add(d2);
                "".length();
            }
            int[] nArray2 = new int[llIIlIIII[1]];
            nArray2[ap.llIIlIIII[0]] = llIIlIIII[10];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIllIlIIIllIlI = new d(llIIlIIII[10], ap.eL(), llIIlIIII[21]);
                bx.add(lIllIlIIIllIlI);
                "".length();
            }
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[12];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                lIllIlIIIllIlI = new d(llIIlIIII[12], ap.eL(), llIIlIIII[22]);
                bx.add(lIllIlIIIllIlI);
                "".length();
            }
            int[] nArray3 = new int[llIIlIIII[1]];
            nArray3[ap.llIIlIIII[0]] = llIIlIIII[13];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIllIlIIIllIlI = new d(llIIlIIII[13], ap.eL(), llIIlIIII[23]);
                bx.add(lIllIlIIIllIlI);
                "".length();
            }
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                lIllIlIIIllIlI = new d(llIIlIIII[8], llIIlIIII[19], llIIlIIII[20]);
                bx.add(lIllIlIIIllIlI);
                "".length();
            }
            int[] nArray4 = new int[llIIlIIII[1]];
            nArray4[ap.llIIlIIII[0]] = llIIlIIII[14];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIllIlIIIllIlI = new d(llIIlIIII[14], llIIlIIII[19], llIIlIIII[24]);
                bx.add(lIllIlIIIllIlI);
                "".length();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
            int n3;
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
            if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlIIII[1]];
                nArray2[ap.llIIlIIII[0]] = llIIlIIII[10];
                if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = llIIlIIII[1];
                    "".length();
                    if (-(8 ^ 0xD) < 0) return n3 != 0;
                    return ((0x7E ^ 0x3C) & ~(0xF ^ 0x4D)) != 0;
                }
            }
            n3 = llIIlIIII[0];
            return n3 != 0;
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            int n4;
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[12];
            if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIlIIII[1]];
                nArray3[ap.llIIlIIII[0]] = llIIlIIII[13];
                if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = llIIlIIII[1];
                    "".length();
                    if (null == null) return n4 != 0;
                    return ((0x8F ^ 0x9A) & ~(0x3E ^ 0x2B)) != 0;
                }
            }
            n4 = llIIlIIII[0];
            return n4 != 0;
        }
        if (!ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) return llIIlIIII[0];
        int[] nArray = new int[llIIlIIII[1]];
        nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
        if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIlIIII[1]];
            nArray4[ap.llIIlIIII[0]] = llIIlIIII[14];
            if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                n2 = llIIlIIII[1];
                "".length();
                if ("  ".length() == "  ".length()) return n2 != 0;
                return ((0xA3 ^ 0x9F ^ "  ".length()) & (69 + 79 - 42 + 39 ^ 99 + 9 - -13 + 54 ^ -" ".length())) != 0;
            }
        }
        n2 = llIIlIIII[0];
        return n2 != 0;
    }

    private static boolean lIlIlIIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlIIIIlII() {
        llIIlIIII = new int[36];
        ap.llIIlIIII[0] = (0xA3 ^ 0x88 ^ (7 ^ 0xA)) & (0x7D ^ 0x1C ^ (0xE ^ 0x49) ^ -" ".length());
        ap.llIIlIIII[1] = " ".length();
        ap.llIIlIIII[2] = 0xCF ^ 0x9F;
        ap.llIIlIIII[3] = 0x23 ^ 0x47 ^ (0x63 ^ 3);
        ap.llIIlIIII[4] = "  ".length();
        ap.llIIlIIII[5] = "   ".length();
        ap.llIIlIIII[6] = -(0xFFFFBDC6 & 0x6E3D) & (0xFFFFFFFF & 0x3F8B);
        ap.llIIlIIII[7] = 0xBE ^ 0xA4;
        ap.llIIlIIII[8] = 143 + 23 - 57 + 96 + (0xD5 ^ 0xAD) - (7 + 83 - -77 + 51) + (0x48 ^ 0x3A);
        ap.llIIlIIII[9] = 0xA9 ^ 0x92 ^ (0x20 ^ 0x15);
        ap.llIIlIIII[10] = 0xE5 ^ 0xBE;
        ap.llIIlIIII[11] = 22 + 144 - 20 + 36 ^ 102 + 42 - 107 + 118;
        ap.llIIlIIII[12] = 0xFFFFAFF7 & 0x57BF;
        ap.llIIlIIII[13] = 135 + 186 - 314 + 205 ^ 35 + 71 - 45 + 120;
        ap.llIIlIIII[14] = 101 + 40 - -46 + 25 ^ 75 + 102 - 69 + 69;
        ap.llIIlIIII[15] = 0x21 ^ 0x24;
        ap.llIIlIIII[16] = 0xFFFFFD2E & 0x3DF;
        ap.llIIlIIII[17] = 0xA3 ^ 0xAE;
        ap.llIIlIIII[18] = 0xFFFFFFB8 & 0x61EF;
        ap.llIIlIIII[19] = 0xFFFF83ED & 0x7FFA;
        ap.llIIlIIII[20] = 154 + 112 - 188 + 85 ^ 136 + 28 - -13 + 6;
        ap.llIIlIIII[21] = 0xFFFFDBF0 & 0x259F;
        ap.llIIlIIII[22] = 0xF6 ^ 0x92;
        ap.llIIlIIII[23] = 0xFFFF8F53 & 0x73FE;
        ap.llIIlIIII[24] = 0xFFFF8FEF & 0x7718;
        ap.llIIlIIII[25] = 0xFFFFAF25 & 0x72FE;
        ap.llIIlIIII[26] = -(0xFFFFA4CB & 0x5F37) & (0xFFFFFE6E & 0xF5DB);
        ap.llIIlIIII[27] = 0x26 ^ 0x78 ^ (0xD6 ^ 0x91);
        ap.llIIlIIII[28] = 0x7E ^ 0x2F ^ (0x8C ^ 0x9E);
        ap.llIIlIIII[29] = 0xC9 ^ 0xC6;
        ap.llIIlIIII[30] = 0x3E ^ 0x38;
        ap.llIIlIIII[31] = 111 + 200 - 117 + 32 ^ 59 + 5 - 58 + 123;
        ap.llIIlIIII[32] = 0x94 ^ 0x93;
        ap.llIIlIIII[33] = 125 + 61 - 103 + 92 ^ 106 + 6 - 54 + 109;
        ap.llIIlIIII[34] = 0x3C ^ 0x46 ^ (0xF7 ^ 0x84);
        ap.llIIlIIII[35] = 0x6E ^ 0x64;
    }

    private static boolean lIlIlIIIllII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public int af() {
        ap.eK();
        return llIIlIIII[22];
    }

    private static boolean lIlIlIIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static int eL() {
        int n2 = llIIlIIII[25];
        int n3 = llIIlIIII[26];
        if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
            return (n2 - Skills.getExperience((Skill)Skill.HERBLORE)) / llIIlIIII[27] + llIIlIIII[15];
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            void lIllIlIIIlIllI;
            return (int)((lIllIlIIIlIllI - Skills.getExperience((Skill)Skill.HERBLORE)) / llIIlIIII[28] + llIIlIIII[29]);
        }
        return llIIlIIII[1];
    }

    private static String lIlIIlllllIl(String lIllIIlllllIIl, String lIllIIlllllIII) {
        lIllIIlllllIIl = new String(Base64.getDecoder().decode(lIllIIlllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIllllllII = new StringBuilder();
        char[] lIllIIlllllIll = lIllIIlllllIII.toCharArray();
        int lIllIIlllllIlI = llIIlIIII[0];
        char[] lIllIIllllIlII = lIllIIlllllIIl.toCharArray();
        int lIllIIllllIIll = lIllIIllllIlII.length;
        int lIllIIllllIIlI = llIIlIIII[0];
        while (ap.lIlIlIIIIllI(lIllIIllllIIlI, lIllIIllllIIll)) {
            char lIllIIllllllll = lIllIIllllIlII[lIllIIllllIIlI];
            lIllIIllllllII.append((char)(lIllIIllllllll ^ lIllIIlllllIll[lIllIIlllllIlI % lIllIIlllllIll.length]));
            "".length();
            ++lIllIIlllllIlI;
            ++lIllIIllllIIlI;
            "".length();
            if ((0x71 ^ 0x75) >= 0) continue;
            return null;
        }
        return String.valueOf(lIllIIllllllII);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean eM() {
        int n2;
        if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
            int n3;
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
            if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlIIII[1]];
                nArray2[ap.llIIlIIII[0]] = llIIlIIII[10];
                if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = llIIlIIII[1];
                    "".length();
                    if (((6 ^ 0x26) & ~(0x9F ^ 0xBF)) == 0) return n3 != 0;
                    return ((0x40 ^ 0x5C) & ~(0xAD ^ 0xB1) & ~((0xA1 ^ 0xC1) & ~(0xC1 ^ 0xA1))) != 0;
                }
            }
            n3 = llIIlIIII[0];
            return n3 != 0;
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            int n4;
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[12];
            if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIlIIII[1]];
                nArray3[ap.llIIlIIII[0]] = llIIlIIII[13];
                if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = llIIlIIII[1];
                    "".length();
                    if (((8 + 117 - 11 + 30 ^ 33 + 51 - -34 + 42) & (0x91 ^ 0xAF ^ (0x16 ^ 0x18) ^ -" ".length())) == 0) return n4 != 0;
                    return ((36 + 4 - -84 + 3 ^ (0xCB ^ 0xAA)) & (20 + 139 - 4 + 23 ^ 82 + 21 - 95 + 164 ^ -" ".length())) != 0;
                }
            }
            n4 = llIIlIIII[0];
            return n4 != 0;
        }
        if (!ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) return llIIlIIII[0];
        int[] nArray = new int[llIIlIIII[1]];
        nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
        if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIlIIII[1]];
            nArray4[ap.llIIlIIII[0]] = llIIlIIII[14];
            if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                n2 = llIIlIIII[1];
                "".length();
                if (((0x3B ^ 0x53 ^ (0x25 ^ 0x4A)) & (109 + 0 - 79 + 109 ^ 25 + 125 - 33 + 23 ^ -" ".length())) <= "  ".length()) return n2 != 0;
                return ((0x15 ^ 0x23 ^ (0xB8 ^ 0xA5)) & (0xDF ^ 0xA5 ^ (0xA ^ 0x5B) ^ -" ".length())) != 0;
            }
        }
        n2 = llIIlIIII[0];
        return n2 != 0;
    }

    private static String lIlIIllllllI(String lIllIIlllIlIIl, String lIllIIlllIlIII) {
        try {
            SecretKeySpec lIllIIlllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlllIlIII.getBytes(StandardCharsets.UTF_8)), llIIlIIII[33]), "DES");
            Cipher lIllIIlllIlIll = Cipher.getInstance("DES");
            lIllIIlllIlIll.init(llIIlIIII[4], lIllIIlllIllII);
            return new String(lIllIIlllIlIll.doFinal(Base64.getDecoder().decode(lIllIIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIlllIlIlI) {
            lIllIIlllIlIlI.printStackTrace();
            return null;
        }
    }

    public static void eK() {
        block26: {
            BankLocation lIllIlIIIlllII;
            block28: {
                block27: {
                    if (ap.lIlIlIIIIlIl(bv ? 1 : 0)) {
                        AccBuilderGWD.c = llIIIlllI[llIIlIIII[0]];
                        b.a(bx);
                        if (ap.lIlIlIIIIllI(bx.size(), llIIlIIII[1])) {
                            System.out.println(llIIIlllI[llIIlIIII[1]]);
                            bv = llIIlIIII[0];
                        }
                    }
                    if (!ap.lIlIlIIIIlll(bv ? 1 : 0)) break block26;
                    if (ap.lIlIlIIIIllI(e.j(llIIlIIII[2]), llIIlIIII[3])) {
                        y.bh();
                    }
                    if (ap.lIlIlIIIIlll(ap.an() ? 1 : 0) && ap.lIlIlIIIlIII(e.j(llIIlIIII[2]), llIIlIIII[3])) {
                        lIllIlIIIlllII = BankLocation.getNearest();
                        if (ap.lIlIlIIIlIIl(lIllIlIIIlllII) && ap.lIlIlIIIIlll(lIllIlIIIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIIlllI[llIIlIIII[4]];
                            a.a(lIllIlIIIlllII);
                        }
                        if (ap.lIlIlIIIlIIl(lIllIlIIIlllII) && ap.lIlIlIIIIlIl(lIllIlIIIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIIlllI[llIIlIIII[5]];
                            if (ap.lIlIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIII[6]);
                                "".length();
                            }
                            if (ap.lIlIlIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                                if (ap.lIlIlIIIlIlI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIlIIII[5]);
                                    "".length();
                                }
                                if (ap.lIlIlIIIIlll(ap.eM() ? 1 : 0)) {
                                    ap.Q();
                                    System.out.println(llIIIlllI[llIIlIIII[3]]);
                                    bv = llIIlIIII[1];
                                    return;
                                }
                                if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
                                    a.a(llIIlIIII[8], llIIlIIII[9]);
                                    a.a(llIIlIIII[10], llIIlIIII[9]);
                                }
                                if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
                                    a.a(llIIlIIII[12], llIIlIIII[9]);
                                    a.a(llIIlIIII[13], llIIlIIII[9]);
                                }
                                if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
                                    a.a(llIIlIIII[8], llIIlIIII[9]);
                                    a.a(llIIlIIII[14], llIIlIIII[9]);
                                }
                            }
                        }
                    }
                    if (!ap.lIlIlIIIIlIl(ap.an() ? 1 : 0)) break block26;
                    if (ap.lIlIlIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                    }
                    if (ap.lIlIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderGWD.c = llIIIlllI[llIIlIIII[15]];
                    int[] nArray = new int[llIIlIIII[1]];
                    nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
                    if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIIlIIII[1]];
                        nArray2[ap.llIIlIIII[0]] = llIIlIIII[10];
                        if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIIlIIII[1]];
                            nArray3[ap.llIIlIIII[0]] = llIIlIIII[8];
                            int[] nArray4 = new int[llIIlIIII[1]];
                            nArray4[ap.llIIlIIII[0]] = llIIlIIII[10];
                            Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));
                            Time.sleepTicks((int)llIIlIIII[1]);
                            "".length();
                        }
                    }
                    int[] nArray5 = new int[llIIlIIII[1]];
                    nArray5[ap.llIIlIIII[0]] = llIIlIIII[12];
                    if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIlIIII[1]];
                        nArray6[ap.llIIlIIII[0]] = llIIlIIII[13];
                        if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[llIIlIIII[1]];
                            nArray7[ap.llIIlIIII[0]] = llIIlIIII[12];
                            int[] nArray8 = new int[llIIlIIII[1]];
                            nArray8[ap.llIIlIIII[0]] = llIIlIIII[13];
                            Inventory.getFirst((int[])nArray7).useOn(Inventory.getFirst((int[])nArray8));
                            Time.sleepTicks((int)llIIlIIII[1]);
                            "".length();
                        }
                    }
                    int[] nArray9 = new int[llIIlIIII[1]];
                    nArray9[ap.llIIlIIII[0]] = llIIlIIII[8];
                    if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[llIIlIIII[1]];
                        nArray10[ap.llIIlIIII[0]] = llIIlIIII[14];
                        if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            int[] nArray11 = new int[llIIlIIII[1]];
                            nArray11[ap.llIIlIIII[0]] = llIIlIIII[8];
                            int[] nArray12 = new int[llIIlIIII[1]];
                            nArray12[ap.llIIlIIII[0]] = llIIlIIII[14];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)llIIlIIII[1]);
                            "".length();
                        }
                    }
                    int[] nArray13 = new int[llIIlIIII[1]];
                    nArray13[ap.llIIlIIII[0]] = llIIlIIII[8];
                    if (!ap.lIlIlIIIllII(Inventory.getAll((int[])nArray13).size(), llIIlIIII[1])) break block27;
                    int[] nArray14 = new int[llIIlIIII[1]];
                    nArray14[ap.llIIlIIII[0]] = llIIlIIII[14];
                    if (!ap.lIlIlIIIllII(Inventory.getAll((int[])nArray14).size(), llIIlIIII[1])) break block27;
                    int[] nArray15 = new int[llIIlIIII[1]];
                    nArray15[ap.llIIlIIII[0]] = llIIlIIII[13];
                    if (!ap.lIlIlIIIllII(Inventory.getAll((int[])nArray15).size(), llIIlIIII[1])) break block27;
                    int[] nArray16 = new int[llIIlIIII[1]];
                    nArray16[ap.llIIlIIII[0]] = llIIlIIII[10];
                    if (!ap.lIlIlIIIllII(Inventory.getAll((int[])nArray16).size(), llIIlIIII[1])) break block27;
                    int[] nArray17 = new int[llIIlIIII[1]];
                    nArray17[ap.llIIlIIII[0]] = llIIlIIII[12];
                    if (!ap.lIlIlIIIlIII(Inventory.getAll((int[])nArray17).size(), llIIlIIII[1])) break block28;
                }
                Time.sleepTicks((int)llIIlIIII[15]);
                "".length();
            }
            if (ap.lIlIlIIIIlIl(Inventory.contains(item -> item.getName().contains(llIIIlllI[llIIlIIII[34]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(llIIIlllI[llIIlIIII[33]])).useOn(Inventory.getFirst(item -> item.getName().contains(llIIIlllI[llIIlIIII[32]])));
            }
            if (ap.lIlIlIIIlIIl(lIllIlIIIlllII = Widgets.get((int)llIIlIIII[16], (int)llIIlIIII[17]))) {
                Dialog.continueSpace();
                Time.sleepTicks((int)llIIlIIII[4]);
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    block4: {
                        block3: {
                            block2: {
                                int[] nArray = new int[llIIlIIII[1]];
                                nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
                                if (!ap.lIlIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                                int[] nArray2 = new int[llIIlIIII[1]];
                                nArray2[ap.llIIlIIII[0]] = llIIlIIII[12];
                                if (!ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                            }
                            if (!ap.lIlIlIIIIlIl(Dialog.canLevelUpContinue() ? 1 : 0)) break block4;
                        }
                        bl = llIIlIIII[1];
                        "".length();
                        if (((0x9C ^ 0xAB) & ~(0xB8 ^ 0x8F)) >= 0) return bl;
                        return ((0x4C ^ 0x73) & ~(0x38 ^ 7)) != 0;
                    }
                    bl = llIIlIIII[0];
                    return bl;
                }, (int)llIIlIIII[18]);
                "".length();
            }
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[31])) {
            bl = llIIlIIII[1];
            "".length();
            if (-" ".length() > 0) {
                return ((0x4B ^ 0x63 ^ (0x7A ^ 7)) & (0x19 ^ 0x5E ^ (0x27 ^ 0x35) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIlIIII[0];
        }
        return bl;
    }

    private static boolean lIlIlIIIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlIIIIlll(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIIIIIll() {
        llIIIlllI = new String[llIIlIIII[35]];
        ap.llIIIlllI[ap.llIIlIIII[0]] = ap.lIlIIlllllIl("GwQDGzQ+URMGPzQC", "YqzrZ");
        ap.llIIIlllI[ap.llIIlIIII[1]] = ap.lIlIIllllllI("dItApc4gSBZ+iSXjyKc2EUv7/YJKihN+lQIk4uSMx11plEYegTTlfZ8RoCBuN9Qo/ebQTzNSxMU=", "yJJJQ");
        ap.llIIIlllI[ap.llIIlIIII[4]] = ap.lIlIIlllllll("Ueoo3By6npWrZHeKWC7JNSReygwgmdYe", "QqGyu");
        ap.llIIIlllI[ap.llIIlIIII[5]] = ap.lIlIIllllllI("3n2oqc09ysQ5FxYeJQrPEn3f+ACMJMof", "uscdE");
        ap.llIIIlllI[ap.llIIlIIII[3]] = ap.lIlIIlllllll("t2elnFmHy9mXKaFUfdWtk9kA2D3jY6jvyHli3/qB8gHVuVI8HWV8saZuoA4IlWv5", "ObzpM");
        ap.llIIIlllI[ap.llIIlIIII[15]] = ap.lIlIIlllllIl("Px0KEAoVVAIWEBsbHAo=", "rtryd");
        ap.llIIIlllI[ap.llIIlIIII[30]] = ap.lIlIIllllllI("Xzu92lNiBhxQIHRgqqpoRA==", "wPGea");
        ap.llIIIlllI[ap.llIIlIIII[32]] = ap.lIlIIlllllIl("AT07LBo=", "TSXYn");
        ap.llIIIlllI[ap.llIIlIIII[33]] = ap.lIlIIllllllI("MdC6243Zkcc=", "KzPDk");
        ap.llIIIlllI[ap.llIIlIIII[34]] = ap.lIlIIlllllll("L9+pK1+T6wg=", "mZHbs");
    }

    private static boolean lIlIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

