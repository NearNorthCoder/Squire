/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class o
implements ab {
    private static /* synthetic */ String[] lllIIIIIl;
    public static /* synthetic */ WorldPoint cv;
    public static /* synthetic */ WorldPoint cD;
    public static /* synthetic */ WorldPoint cC;
    public static /* synthetic */ WorldArea cH;
    public static /* synthetic */ WorldPoint cr;
    public static /* synthetic */ WorldPoint ct;
    static /* synthetic */ int cK;
    public static /* synthetic */ WorldPoint cu;
    public static /* synthetic */ WorldPoint cw;
    public static /* synthetic */ WorldPoint cs;
    public static /* synthetic */ WorldPoint cq;
    public static /* synthetic */ long cF;
    public static /* synthetic */ int cI;
    public static /* synthetic */ WorldPoint cE;
    public static /* synthetic */ WorldPoint cy;
    public static /* synthetic */ String[] cG;
    public static /* synthetic */ WorldPoint cx;
    public static /* synthetic */ WorldPoint co;
    public static /* synthetic */ WorldPoint cB;
    private static /* synthetic */ int[] lllIIIIlI;
    public static /* synthetic */ int cJ;
    public static /* synthetic */ WorldPoint cz;
    public static /* synthetic */ WorldPoint cp;
    public static /* synthetic */ WorldPoint cA;

    private static int lIllllIlllIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Override
    public boolean ah() {
        int n2;
        if (o.lIlllllIIlll(Skills.getLevel((Skill)Skill.RANGED), lllIIIIlI[35]) && o.lIlllllIIlll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIlI[35])) {
            n2 = lllIIIIlI[0];
            0;
            if (1 != 1) {
                return false;
            }
        } else {
            n2 = lllIIIIlI[1];
        }
        return n2 != 0;
    }

    private static void lIllllIlIlll() {
        lllIIIIlI = new int[68];
        o.lllIIIIlI[0] = 1;
        o.lllIIIIlI[1] = (0x80 ^ 0xBD) & ~(0x1B ^ 0x26);
        o.lllIIIIlI[2] = 0xFFFFB3FB & 0x4D7F;
        o.lllIIIIlI[3] = 2;
        o.lllIIIIlI[4] = 0xFFFF9BE9 & 0x779E;
        o.lllIIIIlI[5] = 0x93 ^ 0x8B;
        o.lllIIIIlI[6] = -(0xFFFFDCB7 & 0x67ED) & (0xFFFFFFFD & 0x75F7);
        o.lllIIIIlI[7] = -(0xFFFFABB7 & 0x74FF) & (0xFFFFFFFF & 0x3FFF);
        o.lllIIIIlI[8] = 0x31 ^ 0x3B;
        o.lllIIIIlI[9] = 0xFFFFE7DA & 0x93FE5;
        o.lllIIIIlI[10] = 3;
        o.lllIIIIlI[11] = 7 ^ 0x42 ^ 3;
        o.lllIIIIlI[12] = 0x83 ^ 0x87;
        o.lllIIIIlI[13] = 42 + 62 - 36 + 93 ^ 163 + 163 - 234 + 72;
        o.lllIIIIlI[14] = 76 + 124 - 130 + 92 ^ 91 + 152 - 233 + 154;
        o.lllIIIIlI[15] = 29 + 125 - 117 + 118 ^ 74 + 59 - 123 + 146;
        o.lllIIIIlI[16] = 0xA3 ^ 0xB1 ^ (0x32 ^ 0x28);
        o.lllIIIIlI[17] = 0x7F ^ 0x35 ^ (3 ^ 0x40);
        o.lllIIIIlI[18] = 0x2B ^ 0x46 ^ (0x6F ^ 9);
        o.lllIIIIlI[19] = 0x72 ^ 0x23 ^ (0x9A ^ 0xC7);
        o.lllIIIIlI[20] = 110 + 2 - 22 + 100 ^ 122 + 57 - 111 + 111;
        o.lllIIIIlI[21] = 0x2F ^ 0x6C ^ (0xEE ^ 0xA3);
        o.lllIIIIlI[22] = 0x52 ^ 0x5D;
        o.lllIIIIlI[23] = 0x5D ^ 0x4D;
        o.lllIIIIlI[24] = -(0xFFFFBD6B & 0x7697) & (0xFFFFBFBF & 0x7FFE);
        o.lllIIIIlI[25] = 0xFFFFDDE4 & 0x2EBB;
        o.lllIIIIlI[26] = 0x13 ^ 0x52;
        o.lllIIIIlI[27] = 0xA5 ^ 0x82;
        o.lllIIIIlI[28] = 0xFFFFEBFD & 0x1FEF;
        o.lllIIIIlI[29] = 0xFFFFCEFF & 0x3DAF;
        o.lllIIIIlI[30] = 2 ^ 0x13;
        o.lllIIIIlI[31] = 0xFFFFFEFE & 0x3B99;
        o.lllIIIIlI[32] = 0xFFFFFD3A & 0x77F5;
        o.lllIIIIlI[33] = 0xEC ^ 0x8C ^ (0x7B ^ 0x7F);
        o.lllIIIIlI[34] = 0x6A ^ 0x78;
        o.lllIIIIlI[35] = 0x42 ^ 0xE ^ (8 ^ 0x27);
        o.lllIIIIlI[36] = 89 + 137 - 138 + 59 ^ 89 + 6 - 67 + 100;
        o.lllIIIIlI[37] = 0xFFFF9EF7 & 0x67F8;
        o.lllIIIIlI[38] = 0xFFFFCF9C & 0x3DEF;
        o.lllIIIIlI[39] = -(0xFFFFFEBF & 0x71D9) & (0xFFFFFFBD & 0x77DA);
        o.lllIIIIlI[40] = -(0xFFFFFF03 & 0x62FE) & (0xFFFFEFFD & 0x7FB7);
        o.lllIIIIlI[41] = 0xFFFF9FCB & 0x66FD;
        o.lllIIIIlI[42] = 0xFFFFBFEF & 0x4D9D;
        o.lllIIIIlI[43] = 0xFFFF96E7 & 0x6FDC;
        o.lllIIIIlI[44] = -(0xFFFF9E6F & 0x71DD) & (0xFFFFBFFF & 0x5DFC);
        o.lllIIIIlI[45] = -(0xFFFFFD43 & 0x4ABD) & (0xFFFFDFFF & 0x6EFE);
        o.lllIIIIlI[46] = -(0xFFFFF865 & 0x5F9F) & (0xFFFFFFFE & 0x5EFF);
        o.lllIIIIlI[47] = -(0xFFFFBE57 & 0x63E9) & (0xFFFFAFFF & 0x7FEF);
        o.lllIIIIlI[48] = 0xFFFFB6F7 & 0x4FED;
        o.lllIIIIlI[49] = 0xFFFFBEFF & 0x47E6;
        o.lllIIIIlI[50] = -(0xFFFFF723 & 0x78FD) & (0xFFFFFFF3 & 0x7DEF);
        o.lllIIIIlI[51] = 0xFFFFDFDD & 0x26F7;
        o.lllIIIIlI[52] = -(0xFFFFFFE3 & 0x195D) & (0xFFFFFFDF & 0x1FEB);
        o.lllIIIIlI[53] = 0xFFFFADF7 & 0x5F9E;
        o.lllIIIIlI[54] = -(0xFFFFD99F & 0x7763) & (0xFFFFF7B7 & 0x5FFF);
        o.lllIIIIlI[55] = 0xFFFFFF9B & 0xDEF;
        o.lllIIIIlI[56] = -(0xFFFFB1AB & 0x7E57) & (0xFFFFBFEF & 0x76FF);
        o.lllIIIIlI[57] = 0xFFFFBDAF & 0x4FD5;
        o.lllIIIIlI[58] = -(0xFFFFB297 & 0x5D79) & (0xFFFFDBFF & 0x3FFE);
        o.lllIIIIlI[59] = 0xFFFFDCBF & 0x2FEE;
        o.lllIIIIlI[60] = 0x48 ^ 0x5C;
        o.lllIIIIlI[61] = 35 + 13 - -110 + 2 ^ 62 + 11 - -56 + 52;
        o.lllIIIIlI[62] = 0x1B ^ 0xD;
        o.lllIIIIlI[63] = 0xFFFFA5AE & 0x5EDF;
        o.lllIIIIlI[64] = -(0xFFFFBEFF & 0x6345) & (0xFFFFAF7D & 0x7FFE);
        o.lllIIIIlI[65] = -(0xFFFFFEAF & 0x79D1) & (0xFFFFFBB3 & 0x7FDF);
        o.lllIIIIlI[66] = -(0xFFFFF665 & 0x399B) & (0xFFFFB7BF & 0x7AF7);
        o.lllIIIIlI[67] = 0xCC ^ 0xC6 ^ (0x23 ^ 0x3E);
    }

    private static boolean lIllllIllIlI(Object object) {
        return object != null;
    }

    static {
        o.lIllllIlIlll();
        o.lIllllIlIllI();
        co = new WorldPoint(lllIIIIlI[37], lllIIIIlI[38], lllIIIIlI[1]);
        cp = new WorldPoint(lllIIIIlI[39], lllIIIIlI[40], lllIIIIlI[1]);
        cq = new WorldPoint(lllIIIIlI[41], lllIIIIlI[42], lllIIIIlI[1]);
        cr = new WorldPoint(lllIIIIlI[43], lllIIIIlI[44], lllIIIIlI[1]);
        cs = new WorldPoint(lllIIIIlI[45], lllIIIIlI[38], lllIIIIlI[1]);
        ct = new WorldPoint(lllIIIIlI[46], lllIIIIlI[47], lllIIIIlI[1]);
        cu = new WorldPoint(lllIIIIlI[39], lllIIIIlI[40], lllIIIIlI[1]);
        cv = new WorldPoint(lllIIIIlI[48], lllIIIIlI[38], lllIIIIlI[1]);
        cw = new WorldPoint(lllIIIIlI[49], lllIIIIlI[50], lllIIIIlI[1]);
        cx = new WorldPoint(lllIIIIlI[51], lllIIIIlI[42], lllIIIIlI[1]);
        cy = new WorldPoint(lllIIIIlI[49], lllIIIIlI[50], lllIIIIlI[1]);
        cz = new WorldPoint(lllIIIIlI[52], lllIIIIlI[53], lllIIIIlI[1]);
        cA = new WorldPoint(lllIIIIlI[54], lllIIIIlI[55], lllIIIIlI[1]);
        cB = new WorldPoint(lllIIIIlI[56], lllIIIIlI[57], lllIIIIlI[1]);
        cC = new WorldPoint(lllIIIIlI[39], lllIIIIlI[40], lllIIIIlI[1]);
        cD = new WorldPoint(lllIIIIlI[58], lllIIIIlI[59], lllIIIIlI[1]);
        cE = new WorldPoint(lllIIIIlI[37], lllIIIIlI[38], lllIIIIlI[1]);
        cF = System.currentTimeMillis();
        String[] stringArray = new String[lllIIIIlI[10]];
        stringArray[o.lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[60]];
        stringArray[o.lllIIIIlI[0]] = lllIIIIIl[lllIIIIlI[61]];
        stringArray[o.lllIIIIlI[3]] = lllIIIIIl[lllIIIIlI[62]];
        cG = stringArray;
        cH = new WorldArea(lllIIIIlI[63], lllIIIIlI[64], lllIIIIlI[65], lllIIIIlI[66], lllIIIIlI[1]);
        cI = lllIIIIlI[1];
        cK = e.c(lllIIIIlI[31], lllIIIIlI[32]);
    }

    private static boolean lIllllIllIIl(int n2) {
        return n2 == 0;
    }

    private static int lIllllIllllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean aG() {
        WorldArea worldArea = new WorldArea(cE, lllIIIIlI[10], lllIIIIlI[10]);
        List list = Players.getAll();
        if (o.lIllllIllIIl(list.isEmpty() ? 1 : 0) && o.lIlllllIIIII(list.size(), lllIIIIlI[0])) {
            void lIIIIIIIIlIlll;
            int lIIIIIIIIlIllI = lllIIIIlI[1];
            while (o.lIllllIllIII(lIIIIIIIIlIllI, lIIIIIIIIlIlll.size())) {
                void lIIIIIIIIllIII;
                if (o.lIllllIllIll(((Player)lIIIIIIIIlIlll.get(lIIIIIIIIlIllI)).equals(Players.getLocal()) ? 1 : 0)) {
                    0;
                    if (((0x1D ^ 4 ^ 3) & (54 + 151 - 137 + 87 ^ 26 + 114 - 117 + 106 ^ -1)) != 0) {
                        return ((0xA0 ^ 0x9A ^ (0x27 ^ 0x47)) & (49 + 138 - 54 + 22 ^ 116 + 160 - 168 + 85 ^ -1)) != 0;
                    }
                } else if (o.lIllllIllIll(lIIIIIIIIllIII.contains(((Player)lIIIIIIIIlIlll.get(lIIIIIIIIlIllI)).getWorldLocation()) ? 1 : 0)) {
                    return lllIIIIlI[0];
                }
                ++lIIIIIIIIlIllI;
                0;
                
                return false;
            }
        }
        return lllIIIIlI[1];
    }

    private static boolean lIllllIlllII(int n2) {
        return n2 > 0;
    }

    private static String lIllllIlIIll(String llllllllllIlI, String lllllllllIlII) {
        llllllllllIlI = new String(Base64.getDecoder().decode(llllllllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllIII = new StringBuilder();
        char[] lllllllllIlll = lllllllllIlII.toCharArray();
        int lllllllllIllI = lllIIIIlI[1];
        char[] lllllllllIIII = llllllllllIlI.toCharArray();
        int llllllllIllll = lllllllllIIII.length;
        int llllllllIlllI = lllIIIIlI[1];
        while (o.lIllllIllIII(llllllllIlllI, llllllllIllll)) {
            char llllllllllIll = lllllllllIIII[llllllllIlllI];
            llllllllllIII.append((char)(llllllllllIll ^ lllllllllIlll[lllllllllIllI % lllllllllIlll.length]));
            0;
            ++lllllllllIllI;
            ++llllllllIlllI;
            0;
            if (((38 + 144 - 129 + 168 ^ 137 + 100 - 220 + 124) & (0x3B ^ 0x4A ^ (0x77 ^ 0x56) ^ -1)) < 3) continue;
            return null;
        }
        return String.valueOf(llllllllllIII);
    }

    private static void aD() {
        if (o.lIllllIllIII(cJ, lllIIIIlI[0])) {
            cF = System.currentTimeMillis();
            System.out.println(lllIIIIIl[lllIIIIlI[1]]);
            cJ += lllIIIIlI[0];
        }
        int[] nArray = new int[lllIIIIlI[0]];
        nArray[o.lllIIIIlI[1]] = lllIIIIlI[2];
        if (o.lIllllIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation lIIIIIIIlllIII = BankLocation.getNearest();
            if (o.lIllllIllIlI(lIIIIIIIlllIII) && o.lIllllIllIIl(lIIIIIIIlllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[0]];
                a.a(lIIIIIIIlllIII);
            }
            if (o.lIllllIllIlI(lIIIIIIIlllIII) && o.lIllllIllIll(lIIIIIIIlllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[3]];
                if (o.lIllllIllIIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIIlI[4]);
                    0;
                }
                if (o.lIllllIllIll(Bank.isOpen() ? 1 : 0)) {
                    if (o.lIllllIlllII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lllIIIIlI[0]);
                        0;
                    }
                    a.a(lllIIIIlI[2], lllIIIIlI[5]);
                    a.a(lllIIIIlI[6], lllIIIIlI[0]);
                    a.a(lllIIIIlI[7], lllIIIIlI[8]);
                }
            }
        }
        int[] nArray2 = new int[lllIIIIlI[0]];
        nArray2[o.lllIIIIlI[1]] = lllIIIIlI[2];
        if (o.lIllllIllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            o.aE();
        }
    }

    /*
     * WARNING - void declaration
     */
    static NPC aF() {
        WorldPoint worldPoint = cE;
        WorldPoint worldPoint2 = new WorldPoint(cE.getX() - lllIIIIlI[0], cE.getWorldY() + lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint3 = new WorldPoint(cE.getX(), cE.getWorldY() + lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint4 = new WorldPoint(cE.getX() + lllIIIIlI[0], cE.getWorldY() + lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint5 = new WorldPoint(cE.getX() + lllIIIIlI[0], cE.getWorldY(), lllIIIIlI[1]);
        WorldPoint worldPoint6 = new WorldPoint(cE.getX() + lllIIIIlI[0], cE.getWorldY() - lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint7 = new WorldPoint(cE.getX(), cE.getWorldY() - lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint8 = new WorldPoint(cE.getX() - lllIIIIlI[0], cE.getWorldY() - lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint9 = new WorldPoint(cE.getX() - lllIIIIlI[0], cE.getWorldY(), lllIIIIlI[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lllIIIIIl[lllIIIIlI[36]]));
        if (o.lIllllIllIlI(list)) {
            void lIIIIIIIIllllI;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int lIIIIIIIIlllII = lllIIIIlI[1];
            while (o.lIllllIllIII(lIIIIIIIIlllII, lIIIIIIIIllllI.size())) {
                void lIIIIIIIIlllIl;
                if (o.lIllllIllIll(lIIIIIIIIlllIl.contains(((NPC)lIIIIIIIIllllI.get(lIIIIIIIIlllII)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)lIIIIIIIIllllI.get(lIIIIIIIIlllII);
                }
                ++lIIIIIIIIlllII;
                0;
                
                return null;
            }
        }
        return null;
    }

    private static String lIllllIlIlII(String lIIIIIIIIIlIlI, String lIIIIIIIIIlIIl) {
        try {
            SecretKeySpec lIIIIIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), lllIIIIlI[16]), "DES");
            Cipher lIIIIIIIIIllII = Cipher.getInstance("DES");
            lIIIIIIIIIllII.init(lllIIIIlI[3], lIIIIIIIIIllIl);
            return new String(lIIIIIIIIIllII.doFinal(Base64.getDecoder().decode(lIIIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIIIIlIll) {
            lIIIIIIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIlllll(int n2) {
        return n2 < 0;
    }

    private static boolean lIlllllIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlllllIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            o.aD();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xF ^ 0x5A) & ~(0x7F ^ 0x2A)) != 0) {
            return (0xF0 ^ 0xBD) & ~(0x6F ^ 0x22);
        }
        return lllIIIIlI[33];
    }

    private static boolean lIlllllIIIlI(Object object) {
        return object == null;
    }

    private static boolean lIllllIllIll(int n2) {
        return n2 != 0;
    }

    private static void lIllllIlIllI() {
        lllIIIIIl = new String[lllIIIIlI[67]];
        o.lllIIIIIl[o.lllIIIIlI[1]] = o."reset aggro timer";
        o.lllIIIIIl[o.lllIIIIlI[0]] = o."Navigating to bank";
        o.lllIIIIIl[o.lllIIIIlI[3]] = o."Handling banking";
        o.lllIIIIIl[o.lllIIIIlI[10]] = o."Nav to sand crabs";
        o.lllIIIIIl[o.lllIIIIlI[12]] = o."Drink";
        o.lllIIIIIl[o.lllIIIIlI[13]] = o."Nav to veos";
        o.lllIIIIIl[o.lllIIIIlI[14]] = o."Handle veos chat";
        o.lllIIIIIl[o.lllIIIIlI[15]] = o."Veos";
        o.lllIIIIIl[o.lllIIIIlI[16]] = o."Port Piscarilius";
        o.lllIIIIIl[o.lllIIIIlI[17]] = o."Port Piscarilius";
        o.lllIIIIIl[o.lllIIIIlI[8]] = o."Port Piscarilius";
        o.lllIIIIIl[o.lllIIIIlI[18]] = o."Veos";
        o.lllIIIIIl[o.lllIIIIlI[19]] = o."Eat";
        o.lllIIIIIl[o.lllIIIIlI[20]] = o."Afking in spot";
        o.lllIIIIIl[o.lllIIIIlI[21]] = o."Being crashed";
        o.lllIIIIIl[o.lllIIIIlI[22]] = o."Attacking crashed";
        o.lllIIIIIl[o.lllIIIIlI[23]] = o."Attack";
        o.lllIIIIIl[o.lllIIIIlI[30]] = o."Resetting";
        o.lllIIIIIl[o.lllIIIIlI[34]] = o."Sand Crabs";
        o.lllIIIIIl[o.lllIIIIlI[36]] = o."sand crab";
        o.lllIIIIIl[o.lllIIIIlI[60]] = o."That's great, can you take me there please?";
        o.lllIIIIIl[o.lllIIIIlI[61]] = o."Can you take me to Great Kourend?";
        o.lllIIIIIl[o.lllIIIIlI[62]] = o."Goodbye.";
    }

    private static boolean lIlllllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String ag() {
        return lllIIIIIl[lllIIIIlI[34]];
    }

    public static void aE() {
        NPC lIIIIIIIllIlII;
        WorldArea lIIIIIIIllIlIl;
        if (o.lIllllIlllll(o.lIllllIlllIl(e.a(cF), lllIIIIlI[9] + cK))) {
            if (o.lIllllIllIIl(Players.getLocal().getWorldLocation().equals((Object)cE) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[10]];
                if (o.lIllllIllIII(Movement.getRunEnergy(), lllIIIIlI[11]) && o.lIllllIllIll(Inventory.contains((int[])f.bc) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.bc).interact(lllIIIIIl[lllIIIIlI[12]]);
                    Time.sleepTicks((int)lllIIIIlI[0]);
                    0;
                }
                if (o.lIllllIllIIl(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (o.lIlllllIIIII(Players.getLocal().getWorldLocation().distanceTo(cD), lllIIIIlI[10])) {
                        AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[13]];
                        Movement.walkTo((WorldPoint)cD);
                        0;
                        Time.sleepTicks((int)lllIIIIlI[0]);
                        0;
                    }
                    if (o.lIlllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(cD), lllIIIIlI[10])) {
                        AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[14]];
                        if (o.lIllllIllIII(cI, lllIIIIlI[0])) {
                            e.x();
                            cI += lllIIIIlI[0];
                        }
                        String[] stringArray = new String[lllIIIIlI[0]];
                        stringArray[o.lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[15]];
                        lIIIIIIIllIlIl = NPCs.getNearest((String[])stringArray);
                        if (o.lIllllIllIlI(lIIIIIIIllIlIl)) {
                            String[] stringArray2 = new String[lllIIIIlI[0]];
                            stringArray2[o.lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[16]];
                            if (o.lIllllIllIll(lIIIIIIIllIlIl.hasAction(stringArray2) ? 1 : 0)) {
                                lIIIIIIIllIlIl.interact(lllIIIIIl[lllIIIIlI[17]]);
                                Time.sleepTicks((int)lllIIIIlI[10]);
                                0;
                            }
                            String[] stringArray3 = new String[lllIIIIlI[0]];
                            stringArray3[o.lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[8]];
                            if (o.lIllllIllIIl(lIIIIIIIllIlIl.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lllIIIIIl[lllIIIIlI[18]], cG);
                                Time.sleepTicks((int)lllIIIIlI[0]);
                                0;
                            }
                        }
                    }
                }
                if (o.lIllllIllIll(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)cE);
                    0;
                    Time.sleepTicks((int)lllIIIIlI[0]);
                    0;
                }
            }
            if (o.lIllllIllIll(Players.getLocal().getWorldLocation().equals((Object)cE) ? 1 : 0)) {
                if (o.lIllllIlllll(o.lIllllIllllI(e.w(), 45.0))) {
                    int[] nArray = new int[lllIIIIlI[0]];
                    nArray[o.lllIIIIlI[1]] = lllIIIIlI[2];
                    if (o.lIllllIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIIIIlI[0]];
                        nArray2[o.lllIIIIlI[1]] = lllIIIIlI[2];
                        Inventory.getFirst((int[])nArray2).interact(lllIIIIIl[lllIIIIlI[19]]);
                        Time.sleepTicks((int)lllIIIIlI[0]);
                        0;
                    }
                }
                if (o.lIllllIllIIl(o.aG() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[20]];
                    Time.sleepTicks((int)lllIIIIlI[15]);
                    0;
                }
                if (o.lIllllIllIll(o.aG() ? 1 : 0)) {
                    lIIIIIIIllIlIl = new WorldArea(cE, lllIIIIlI[3], lllIIIIlI[3]);
                    lIIIIIIIllIlII = o.aF();
                    AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[21]];
                    if (o.lIlllllIIIlI(Players.getLocal().getInteracting()) && o.lIllllIllIlI(lIIIIIIIllIlII) && o.lIllllIllIIl(lIIIIIIIllIlII.isDead() ? 1 : 0)) {
                        System.out.println(lllIIIIIl[lllIIIIlI[22]]);
                        lIIIIIIIllIlII.interact(lllIIIIIl[lllIIIIlI[23]]);
                        Time.sleepTicks((int)lllIIIIlI[3]);
                        0;
                    }
                    Time.sleepTicks((int)lllIIIIlI[12]);
                    0;
                }
            }
        }
        if (o.lIlllllIIIll(o.lIllllIlllIl(e.a(cF), lllIIIIlI[9] + cK))) {
            lIIIIIIIllIlIl = new WorldArea(lllIIIIlI[24], lllIIIIlI[25], lllIIIIlI[26], lllIIIIlI[27], lllIIIIlI[1]);
            lIIIIIIIllIlII = new WorldPoint(lllIIIIlI[28], lllIIIIlI[29], lllIIIIlI[1]);
            if (o.lIllllIllIll(lIIIIIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIlllllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIIIIllIlII), lllIIIIlI[13])) {
                Movement.walkTo((WorldPoint)lIIIIIIIllIlII);
                0;
            }
            AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[30]];
            Movement.walkTo((WorldPoint)cu);
            0;
            Time.sleepTicks((int)lllIIIIlI[0]);
            0;
            if (o.lIlllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(cu), lllIIIIlI[3])) {
                cF = System.currentTimeMillis();
                cK = e.c(lllIIIIlI[31], lllIIIIlI[32]);
            }
        }
    }

    private static String lIllllIlIlIl(String llllllllIIlIl, String llllllllIIIlI) {
        try {
            SecretKeySpec llllllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllIIlll = Cipher.getInstance("Blowfish");
            llllllllIIlll.init(lllIIIIlI[3], llllllllIlIII);
            return new String(llllllllIIlll.doFinal(Base64.getDecoder().decode(llllllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllIIllI) {
            llllllllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlllllIIIll(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void aH() {
        void lIIIIIIIIlIlII;
        int n2 = e.c(lllIIIIlI[0], lllIIIIlI[13]);
        if (o.lIlllllIIlIl(n2, lllIIIIlI[0])) {
            cE = co;
            cu = cp;
        }
        if (o.lIlllllIIlIl((int)lIIIIIIIIlIlII, lllIIIIlI[3])) {
            cE = cv;
            cu = cw;
        }
        if (o.lIlllllIIlIl((int)lIIIIIIIIlIlII, lllIIIIlI[10])) {
            cE = cx;
            cu = cy;
        }
        if (o.lIlllllIIlIl((int)lIIIIIIIIlIlII, lllIIIIlI[12])) {
            cE = cz;
            cu = cA;
        }
        if (o.lIlllllIIlIl((int)lIIIIIIIIlIlII, lllIIIIlI[13])) {
            cE = cB;
            cu = cC;
        }
    }

    @Override
    public boolean ae() {
        return lllIIIIlI[1];
    }
}

