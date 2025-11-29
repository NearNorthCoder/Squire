/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.F_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.L_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ap_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class z_Unknown
implements ab {
    public static /* synthetic */ boolean dQ;
    private static /* synthetic */ int[] lIIIIlllII;
    private static /* synthetic */ String[] cG;
    private static /* synthetic */ String[] lIIIIlIlII;
    public static /* synthetic */ boolean dP;
    static /* synthetic */ String dc;
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ boolean dR;
    static /* synthetic */ int dS;
    static /* synthetic */ int dk;
    static /* synthetic */ String h;
    static /* synthetic */ int dL;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint dg;

    private static String lllIIIIllIll(String llIlIlIIIIIl, String llIlIlIIIIII) {
        llIlIlIIIIIl = new String(Base64.getDecoder().decode(llIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIllllll = new StringBuilder();
        char[] llIlIIlllllI = llIlIlIIIIII.toCharArray();
        int llIlIIllllIl = lIIIIlllII[1];
        char[] llIlIIllIlll = llIlIlIIIIIl.toCharArray();
        int llIlIIllIllI = llIlIIllIlll.length;
        int llIlIIllIlIl = lIIIIlllII[1];
        while (z.lllIIlIIllII(llIlIIllIlIl, llIlIIllIllI)) {
            char llIlIlIIIIlI = llIlIIllIlll[llIlIIllIlIl];
            llIlIIllllll.append((char)(llIlIlIIIIlI ^ llIlIIlllllI[llIlIIllllIl % llIlIIlllllI.length]));
            0;
            ++llIlIIllllIl;
            ++llIlIIllIlIl;
            0;
            if (((0x9F ^ 0x97) & ~(0x88 ^ 0x80)) == 0) continue;
            return null;
        }
        return String.valueOf(llIlIIllllll);
    }

    private static boolean lllIIllIIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllIIIIllIlI(String llIlIIlIlIlI, String llIlIIlIlIIl) {
        try {
            SecretKeySpec llIlIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIlIlllI = Cipher.getInstance("Blowfish");
            llIlIIlIlllI.init(lIIIIlllII[7], llIlIIlIllll);
            return new String(llIlIIlIlllI.doFinal(Base64.getDecoder().decode(llIlIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlIllIl) {
            llIlIIlIllIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ah() {
        int n2;
        if (z.lllIIlIlllII(e.j(dL), lIIIIlllII[152]) && z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
            n2 = lIIIIlllII[0];
            0;
            if (((0xB6 ^ 0x92) & ~(0xA2 ^ 0x86)) > 0) {
                return false;
            }
        } else {
            n2 = lIIIIlllII[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llIlIlllIlIl;
        int[] nArray = new int[lIIIIlllII[13]];
        nArray[z.lIIIIlllII[1]] = lIIIIlllII[22];
        nArray[z.lIIIIlllII[0]] = lIIIIlllII[23];
        nArray[z.lIIIIlllII[7]] = lIIIIlllII[36];
        nArray[z.lIIIIlllII[9]] = lIIIIlllII[24];
        nArray[z.lIIIIlllII[10]] = lIIIIlllII[26];
        nArray[z.lIIIIlllII[11]] = lIIIIlllII[25];
        int[] nArray2 = nArray;
        int llIlIlllIlII = lIIIIlllII[1];
        while (z.lllIIlIIllII(llIlIlllIlII, ((void)llIlIlllIlIl).length)) {
            int[] nArray3 = new int[lIIIIlllII[0]];
            nArray3[z.lIIIIlllII[1]] = llIlIlllIlIl[llIlIlllIlII];
            if (z.lllIIlIllIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIIlllII[1];
            }
            ++llIlIlllIlII;
            0;
            if ((2 ^ 7) != 0) continue;
            return false;
        }
        return lIIIIlllII[0];
    }

    @Override
    public String ag() {
        return h;
    }

    private static boolean lllIIlIllIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void llIlIlllIIlI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (z.lllIIlIlllIl(bankLocation) && z.lllIIlIllIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[236]];
            a.a(bankLocation);
        }
        if (z.lllIIlIlllIl(llIlIlllIIlI) && z.lllIIlIIlIll(llIlIlllIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (z.lllIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllII[12]);
                0;
            }
            if (z.lllIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[237]];
                if (z.lllIIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIIlllII[10]);
                    0;
                }
                a.a(lIIIIlllII[22], lIIIIlllII[15]);
                a.a(lIIIIlllII[36], lIIIIlllII[7]);
                a.a(lIIIIlllII[14], lIIIIlllII[15]);
                a.a(lIIIIlllII[16], lIIIIlllII[11]);
                a.a(lIIIIlllII[18], lIIIIlllII[7]);
                a.a(lIIIIlllII[32], lIIIIlllII[0]);
                a.a(lIIIIlllII[30], lIIIIlllII[0]);
                a.a(lIIIIlllII[28], lIIIIlllII[0]);
                a.a(lIIIIlllII[19], lIIIIlllII[15]);
                a.a(lIIIIlllII[35], Inventory.getFreeSlots() - lIIIIlllII[0]);
            }
        }
    }

    private static boolean lllIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlIllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lllIIlIlllll(int n2) {
        return n2 < 0;
    }

    private static boolean lllIIlIlllIl(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bn() {
        int n2;
        int[] nArray = new int[lIIIIlllII[0]];
        nArray[z.lIIIIlllII[1]] = lIIIIlllII[14];
        if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIIlllII[0]];
            nArray2[z.lIIIIlllII[1]] = lIIIIlllII[16];
            if (z.lllIIlIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIIlllII[0]];
                nArray3[z.lIIIIlllII[1]] = lIIIIlllII[18];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIIlllII[0];
                    0;
                    if ((0x1C ^ 0x18) >= 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIIlllII[1];
        return n2 != 0;
    }

    private static boolean lllIIllIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int af() {
        try {
            z.bk();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 2) {
            return (170 + 41 - 124 + 136 ^ 179 + 181 - 328 + 159) & (0x58 ^ 0x31 ^ (0xBC ^ 0xB5) ^ -1);
        }
        return lIIIIlllII[139];
    }

    private static String lllIIIIllIIl(String llIlIIIlllll, String llIlIIIllllI) {
        try {
            SecretKeySpec llIlIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIllllI.getBytes(StandardCharsets.UTF_8)), lIIIIlllII[27]), "DES");
            Cipher llIlIIlIIIIl = Cipher.getInstance("DES");
            llIlIIlIIIIl.init(lIIIIlllII[7], llIlIIlIIIlI);
            return new String(llIlIIlIIIIl.doFinal(Base64.getDecoder().decode(llIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlIIIII) {
            llIlIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static int lllIIlIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void lllIIlIIlIIl() {
        lIIIIlllII = new int[310];
        z.lIIIIlllII[0] = 1;
        z.lIIIIlllII[1] = (0x74 ^ 0x73 ^ (0x79 ^ 0x6D)) & (0x69 ^ 0x3D ^ (0x80 ^ 0xC7) ^ -1);
        z.lIIIIlllII[2] = 118 + 26 - -5 + 16;
        z.lIIIIlllII[3] = 0x5A ^ 0x7E ^ (0x99 ^ 0xA3);
        z.lIIIIlllII[4] = 0xFFFF9DF7 & 0x67E9;
        z.lIIIIlllII[5] = -(0xFFFFAA83 & 0x7DFF) & (0xFFFFAFBF & 0x79FF);
        z.lIIIIlllII[6] = 0x70 ^ 0x59 ^ (0xB8 ^ 0xA3);
        z.lIIIIlllII[7] = 2;
        z.lIIIIlllII[8] = 0x2E ^ 0x31;
        z.lIIIIlllII[9] = 3;
        z.lIIIIlllII[10] = 0x8F ^ 0x8B;
        z.lIIIIlllII[11] = 0x83 ^ 0xB7 ^ (0xA ^ 0x3B);
        z.lIIIIlllII[12] = 0xFFFFBFD8 & 0x53AF;
        z.lIIIIlllII[13] = 0x1E ^ 0x18;
        z.lIIIIlllII[14] = 0xFFFF8FFB & 0x779F;
        z.lIIIIlllII[15] = 13 + 107 - 19 + 39 ^ 99 + 108 - 80 + 7;
        z.lIIIIlllII[16] = 0xFFFFDADF & 0x2D7A;
        z.lIIIIlllII[17] = -(0xFFFFC71E & 0x7AEF) & (0xFFFFDB9F & 0x6FEF);
        z.lIIIIlllII[18] = 0xFFFFE7E7 & 0x1DFF;
        z.lIIIIlllII[19] = 0xFFFF9F4F & 0x7FF9;
        z.lIIIIlllII[20] = 0x91 ^ 0x96;
        z.lIIIIlllII[21] = 0xB7 ^ 0xBA;
        z.lIIIIlllII[22] = -(120 + 103 - 201 + 115) & (0xFFFFDFEF & 0x3FDF);
        z.lIIIIlllII[23] = 0xFFFF9FEB & 0x7F5F;
        z.lIIIIlllII[24] = 0xFFFFED79 & 0x1EA7;
        z.lIIIIlllII[25] = -(0xFFFFF2BD & 0x7D43) & (0xFFFFFFFF & 0x77DF);
        z.lIIIIlllII[26] = -(0xFFFFF36D & 0x1EBE) & (0xFFFFFE7F & 0x1BEF);
        z.lIIIIlllII[27] = 60 + 177 - 57 + 23 ^ 52 + 177 - 221 + 187;
        z.lIIIIlllII[28] = 217 + 198 - 321 + 126 + (0xCC ^ 0x9F) - (0x4A ^ 6) + (0x5C ^ 0x5A);
        z.lIIIIlllII[29] = 0x3A ^ 0x33;
        z.lIIIIlllII[30] = 0x51 ^ 0x32;
        z.lIIIIlllII[31] = 0x4A ^ 0x6D ^ (0x88 ^ 0xA4);
        z.lIIIIlllII[32] = -(0xFFFF9E77 & 0x7D9A) & (0xFFFFDFFF & 0x3E5F);
        z.lIIIIlllII[33] = 0x21 ^ 0x3C ^ (0xD4 ^ 0xC5);
        z.lIIIIlllII[34] = 0xFFFF9FCF & 0x6F3D;
        z.lIIIIlllII[35] = -(0xFFFFF0ED & 0x2F37) & (0xFFFFF5BD & 0x2BE7);
        z.lIIIIlllII[36] = 0xFFFFB1FF & 0x7F51;
        z.lIIIIlllII[37] = 0xC8 ^ 0x92 ^ (0x6E ^ 0x2C);
        z.lIIIIlllII[38] = 0xBC ^ 0xB2;
        z.lIIIIlllII[39] = 0x70 ^ 0xB ^ (0 ^ 0x74);
        z.lIIIIlllII[40] = 0x89 ^ 0x99;
        z.lIIIIlllII[41] = 0xB1 ^ 0xA0;
        z.lIIIIlllII[42] = 40 + 135 - 156 + 129 ^ 26 + 121 - 49 + 36;
        z.lIIIIlllII[43] = 0x25 ^ 0x60 ^ (0x7D ^ 0x2B);
        z.lIIIIlllII[44] = 0x60 ^ 0x74;
        z.lIIIIlllII[45] = 0x78 ^ 0x6D;
        z.lIIIIlllII[46] = 112 + 19 - 9 + 43 ^ 57 + 166 - 102 + 58;
        z.lIIIIlllII[47] = 0xD0 ^ 0xC7;
        z.lIIIIlllII[48] = 0x4E ^ 0x5E ^ (0x8D ^ 0x84);
        z.lIIIIlllII[49] = 0x1E ^ 0x13 ^ (0x1B ^ 0xC);
        z.lIIIIlllII[50] = 0x7B ^ 0x60;
        z.lIIIIlllII[51] = 0xFFFF8B9F & 0x7F7D;
        z.lIIIIlllII[52] = 0xFFFFF7E3 & 0x2F5F;
        z.lIIIIlllII[53] = 52 + 159 - 123 + 83 ^ 119 + 127 - 143 + 80;
        z.lIIIIlllII[54] = 0x69 ^ 0xB ^ 64 + 91 - 93 + 65;
        z.lIIIIlllII[55] = 0xB4 ^ 0x94;
        z.lIIIIlllII[56] = 0x6C ^ 0x4D;
        z.lIIIIlllII[57] = 0x1D ^ 0x3F;
        z.lIIIIlllII[58] = 0xB7 ^ 0x94;
        z.lIIIIlllII[59] = 0xFFFFBFFC & 0x4B17;
        z.lIIIIlllII[60] = -(0xFFFFF99F & 0x5EE2) & (0xFFFFFFFB & 0x7FEF);
        z.lIIIIlllII[61] = 0x61 ^ 0x3E ^ (0x76 ^ 0xD);
        z.lIIIIlllII[62] = 20 + 91 - 95 + 122 ^ 44 + 144 - 18 + 5;
        z.lIIIIlllII[63] = 0x4E ^ 0x27 ^ (0x50 ^ 0x1F);
        z.lIIIIlllII[64] = 0x7E ^ 0x6A ^ (0x18 ^ 0x2B);
        z.lIIIIlllII[65] = 97 + 3 - 9 + 40 ^ 63 + 115 - 129 + 122;
        z.lIIIIlllII[66] = -(0xFFFF94DB & 0x7FA5) & (0xFFFFFFDF & 0x1FB3);
        z.lIIIIlllII[67] = 0xFFFFAFF5 & 0x5E6B;
        z.lIIIIlllII[68] = 0x8B ^ 0xA2;
        z.lIIIIlllII[69] = -(0xFFFFFC5F & 0x77AF) & (0xFFFFFFBF & 0x7F7F);
        z.lIIIIlllII[70] = -(0xFFFFF7EF & 0x7838) & (0xFFFFFEFF & 0x7F77);
        z.lIIIIlllII[71] = 69 + 48 - -32 + 9 ^ 174 + 178 - 272 + 100;
        z.lIIIIlllII[72] = 0xD ^ 0x1B ^ (0x64 ^ 0x59);
        z.lIIIIlllII[73] = 0xFFFFEFCB & 0x1CF6;
        z.lIIIIlllII[74] = 0x43 ^ 0x25 ^ (0x2E ^ 0x64);
        z.lIIIIlllII[75] = 0xA7 ^ 0x8A;
        z.lIIIIlllII[76] = 23 + 49 - 62 + 176 ^ 95 + 107 - 156 + 102;
        z.lIIIIlllII[77] = 0x2F ^ 0;
        z.lIIIIlllII[78] = 0x36 ^ 0x5B ^ (0xD0 ^ 0x8D);
        z.lIIIIlllII[79] = 0xFFFFAE7B & 0x5BB7;
        z.lIIIIlllII[80] = -(0xFFFFF2E5 & 0x2F1F) & (0xFFFFFFDF & 0x2EF7);
        z.lIIIIlllII[81] = 170 + 115 - 182 + 80 ^ 40 + 74 - 100 + 120;
        z.lIIIIlllII[82] = 0x6E ^ 0x5D;
        z.lIIIIlllII[83] = 0x5B ^ 0x6F;
        z.lIIIIlllII[84] = 0x47 ^ 0x64 ^ (0xBD ^ 0xAB);
        z.lIIIIlllII[85] = 155 + 113 - 125 + 18 ^ 31 + 62 - 65 + 123;
        z.lIIIIlllII[86] = 0xD1 ^ 0xC2 ^ (0x99 ^ 0xBD);
        z.lIIIIlllII[87] = 0xFFFFDEC7 & 0x2DFE;
        z.lIIIIlllII[88] = 0x11 ^ 0x29;
        z.lIIIIlllII[89] = 0x49 ^ 0xB ^ (0x70 ^ 0xB);
        z.lIIIIlllII[90] = 0x29 ^ 0x13;
        z.lIIIIlllII[91] = 0x4C ^ 0x16 ^ (0x5E ^ 0x3F);
        z.lIIIIlllII[92] = 0xD ^ 0x31;
        z.lIIIIlllII[93] = 0xA7 ^ 0x9A;
        z.lIIIIlllII[94] = 0xA9 ^ 0x97;
        z.lIIIIlllII[95] = 0xB1 ^ 0x8E;
        z.lIIIIlllII[96] = 0xF9 ^ 0xB9;
        z.lIIIIlllII[97] = 0x74 ^ 0x7A ^ (0x57 ^ 0x18);
        z.lIIIIlllII[98] = 0x2C ^ 3 ^ (0xA8 ^ 0xC5);
        z.lIIIIlllII[99] = 0xE ^ 0x6E ^ (0x8D ^ 0xAE);
        z.lIIIIlllII[100] = 0x1B ^ 0x38 ^ (0xB ^ 0x6C);
        z.lIIIIlllII[101] = -(0xFFFFFF93 & 0x506D) & (0xFFFFF77F & 0x7FFD);
        z.lIIIIlllII[102] = 0 ^ 0x50 ^ (0x19 ^ 0xC);
        z.lIIIIlllII[103] = 0x79 ^ 0x39 ^ (0x97 ^ 0x91);
        z.lIIIIlllII[104] = 0x72 ^ 0x35;
        z.lIIIIlllII[105] = 0x47 ^ 0xF;
        z.lIIIIlllII[106] = 0x3F ^ 0x76;
        z.lIIIIlllII[107] = 0x94 ^ 0xC4 ^ (0xB4 ^ 0xAE);
        z.lIIIIlllII[108] = 0xCB ^ 0x80;
        z.lIIIIlllII[109] = 0x66 ^ 0x2A;
        z.lIIIIlllII[110] = 0x9B ^ 0xB2 ^ (0xFB ^ 0x9F);
        z.lIIIIlllII[111] = -(0xFFFFF4FF & 0x5B51) & (0xFFFFFBFF & 0x5F5F);
        z.lIIIIlllII[112] = 0xFFFFEFF3 & 0x377D;
        z.lIIIIlllII[113] = 0xEB ^ 0xA5;
        z.lIIIIlllII[114] = 0x3F ^ 0x54 ^ (0x71 ^ 0x55);
        z.lIIIIlllII[115] = 0x18 ^ 0x38 ^ (0xCB ^ 0xBB);
        z.lIIIIlllII[116] = -(0xFFFFFFBD & 0x607F) & (0xFFFFFFFF & 0x6CFF);
        z.lIIIIlllII[117] = -(0xFFFFB4BD & 0x7F5B) & (0xFFFFBFFB & 0x7F7D);
        z.lIIIIlllII[118] = -(0xFFFFF2AF & 0x7FF1) & (0xFFFFFFFB & Short.MAX_VALUE);
        z.lIIIIlllII[119] = 0xC1 ^ 0x90;
        z.lIIIIlllII[120] = 6 ^ 0x1B ^ (0xFE ^ 0xB1);
        z.lIIIIlllII[121] = 0xB8 ^ 0x91 ^ (0xE ^ 0x74);
        z.lIIIIlllII[122] = 0x7C ^ 0x28;
        z.lIIIIlllII[123] = 30 + 11 - -8 + 143 ^ 138 + 27 - 67 + 51;
        z.lIIIIlllII[124] = 0x5B ^ 0x43 ^ (0x6C ^ 0x22);
        z.lIIIIlllII[125] = 0xE4 ^ 0xB3;
        z.lIIIIlllII[126] = 0xDA ^ 0x82;
        z.lIIIIlllII[127] = 0x4E ^ 0x17;
        z.lIIIIlllII[128] = 0x79 ^ 0x23;
        z.lIIIIlllII[129] = 0x5E ^ 5;
        z.lIIIIlllII[130] = 0x6E ^ 0x10 ^ (0xAC ^ 0x8E);
        z.lIIIIlllII[131] = 0x39 ^ 0x64;
        z.lIIIIlllII[132] = 0x17 ^ 0x5D ^ (0x39 ^ 0x2D);
        z.lIIIIlllII[133] = 0xEC ^ 0xB3;
        z.lIIIIlllII[134] = -(0xFFFFF9B4 & 0x777B) & (0xFFFFFDFF & 0x7FEF);
        z.lIIIIlllII[135] = 0xFFFFEFFF & 0x1CBF;
        z.lIIIIlllII[136] = 0xE6 ^ 0x90 ^ (0x20 ^ 0x36);
        z.lIIIIlllII[137] = 0xF3 ^ 0x92;
        z.lIIIIlllII[138] = 0x55 ^ 0x37;
        z.lIIIIlllII[139] = 0xCE ^ 0xAA;
        z.lIIIIlllII[140] = 0xFFFFCF7F & 0x3BC9;
        z.lIIIIlllII[141] = 0xFFFF9E5D & 0x6FFF;
        z.lIIIIlllII[142] = 127 + 55 - 83 + 61 ^ 171 + 126 - 178 + 78;
        z.lIIIIlllII[143] = 34 + 81 - 85 + 162 ^ 53 + 101 - 21 + 33;
        z.lIIIIlllII[144] = 0xD2 ^ 0xB5;
        z.lIIIIlllII[145] = 0x4B ^ 0x23;
        z.lIIIIlllII[146] = 95 + 208 - 144 + 71 ^ 92 + 112 - 79 + 18;
        z.lIIIIlllII[147] = 0x23 ^ 0x49;
        z.lIIIIlllII[148] = 0x4D ^ 0x7D ^ (0x1F ^ 0x44);
        z.lIIIIlllII[149] = 0x5B ^ 0x37;
        z.lIIIIlllII[150] = 0xAC ^ 0xC1;
        z.lIIIIlllII[151] = -(0xFFFFF3F9 & 0x4E3F) & (0xFFFFEFFB & 0x5EFD);
        z.lIIIIlllII[152] = 0xB ^ 0x65;
        z.lIIIIlllII[153] = 0x3F ^ 0x50;
        z.lIIIIlllII[154] = 0xFB ^ 0x8B;
        z.lIIIIlllII[155] = 7 ^ 0x1F ^ (0x12 ^ 0x7B);
        z.lIIIIlllII[156] = 0x58 ^ 0x25 ^ (0x9D ^ 0x92);
        z.lIIIIlllII[157] = 0x80 ^ 0x9C ^ (0xE1 ^ 0x8E);
        z.lIIIIlllII[158] = 0x4D ^ 0x39;
        z.lIIIIlllII[159] = 109 + 63 - 41 + 110 ^ 91 + 116 - 201 + 126;
        z.lIIIIlllII[160] = 0xF2 ^ 0x84;
        z.lIIIIlllII[161] = 0x21 ^ 0x56;
        z.lIIIIlllII[162] = 0x70 ^ 0x51 ^ (0x1A ^ 0x43);
        z.lIIIIlllII[163] = 0x1E ^ 0x18 ^ 77 + 81 - 150 + 119;
        z.lIIIIlllII[164] = 6 ^ 0x7C;
        z.lIIIIlllII[165] = 0xD1 ^ 0xAA;
        z.lIIIIlllII[166] = 0xF7 ^ 0x8B;
        z.lIIIIlllII[167] = 15 + 73 - -6 + 108 ^ 31 + 100 - 125 + 177;
        z.lIIIIlllII[168] = 146 + 4 - -59 + 0 ^ 0 + 154 - 57 + 78;
        z.lIIIIlllII[169] = (0x3C ^ 0x37) + (0x64 ^ 0x36) - (0x1C ^ 0x13) + (0x83 ^ 0xB2);
        z.lIIIIlllII[170] = (0xB6 ^ 0xB9) + (0xFE ^ 0x8B) - (0xEC ^ 0x87) + (0x5D ^ 0x3A);
        z.lIIIIlllII[171] = 4 + 123 - 89 + 91;
        z.lIIIIlllII[172] = (0x64 ^ 0x2F) + (0xE5 ^ 0xA8) - (0xA5 ^ 0x89) + (0x4A ^ 0x5C);
        z.lIIIIlllII[173] = -(0xFFFFF6AB & 0x1D5F) & (0xFFFF9F3E & 0x7FCF);
        z.lIIIIlllII[174] = -(0xB5 ^ 0xA4) & (0xFFFFA77F & 0x7FFD);
        z.lIIIIlllII[175] = 0xFFFF8FB3 & 0x7B6E;
        z.lIIIIlllII[176] = 0xFFFFF77A & 0x2FFF;
        z.lIIIIlllII[177] = 13 + 78 - 5 + 45;
        z.lIIIIlllII[178] = 72 + 78 - 66 + 48;
        z.lIIIIlllII[179] = 22 + 51 - 50 + 110;
        z.lIIIIlllII[180] = (0xC5 ^ 0x8F) + (0x3D ^ 0x18) - (0x83 ^ 0xC4) + (0x38 ^ 0x66);
        z.lIIIIlllII[181] = -(0xFFFFFEDD & 0x75EB) & (0xFFFFFFFF & 0x7FDA);
        z.lIIIIlllII[182] = -(0xFFFFCFFD & 0x7807) & (0xFFFFEFFF & 0x7F76);
        z.lIIIIlllII[183] = 62 + 41 - 23 + 55;
        z.lIIIIlllII[184] = (4 ^ 0x72) + (0xAF ^ 0x8E) - (0xB8 ^ 0x89) + (2 ^ 0x20);
        z.lIIIIlllII[185] = (0x78 ^ 0x14) + (0x18 ^ 0x6F) - (124 + 98 - 189 + 108) + (0xA8 ^ 0x9B);
        z.lIIIIlllII[186] = (4 ^ 0x63) + (97 + 72 - 49 + 15) - (8 ^ 0x79) + (0 ^ 0xD);
        z.lIIIIlllII[187] = (0x24 ^ 0x1A) + (9 + 109 - 114 + 125) - (95 + 20 - 20 + 45) + (0xFF ^ 0xA7);
        z.lIIIIlllII[188] = 81 + 72 - 39 + 26;
        z.lIIIIlllII[189] = 3 + 0 - -72 + 66;
        z.lIIIIlllII[190] = 65 + 96 - 79 + 60;
        z.lIIIIlllII[191] = 74 + 93 - 161 + 137;
        z.lIIIIlllII[192] = (0xC2 ^ 0x9B) + (0x7B ^ 0x23) - (0x93 ^ 0xC2) + (0x38 ^ 8);
        z.lIIIIlllII[193] = 82 + 22 - 71 + 97 + (0xEA ^ 0x89) - (0x69 ^ 0x1C) + (0x39 ^ 0x18);
        z.lIIIIlllII[194] = 33 + 41 - 7 + 79;
        z.lIIIIlllII[195] = 75 + 41 - 34 + 65;
        z.lIIIIlllII[196] = (0x27 ^ 0x2C) + (0x5B ^ 0x3F) - -(0x2C ^ 0x28) + (0xA7 ^ 0x86);
        z.lIIIIlllII[197] = (0x60 ^ 0x29) + (0x58 ^ 0x14) - (0x71 ^ 0x5A) + (0xB ^ 0x20);
        z.lIIIIlllII[198] = (0x47 ^ 0x65) + (0xDD ^ 0x91) - (0x22 ^ 0x7D) + (108 + 96 - 84 + 15);
        z.lIIIIlllII[199] = 69 + 7 - 29 + 104;
        z.lIIIIlllII[200] = (0xC7 ^ 0xA0) + (0xB2 ^ 0xA9) - (0x62 ^ 0x2A) + (0x78 ^ 0x26);
        z.lIIIIlllII[201] = (0x1D ^ 5) + (0x13 ^ 0x2E) - (0xE ^ 0x3C) + (0x7B ^ 0xD);
        z.lIIIIlllII[202] = -(0xFFFFE5DB & 0x7B2F) & (0xFFFFEDCF & Short.MAX_VALUE);
        z.lIIIIlllII[203] = (0x10 ^ 0x60) + (0x99 ^ 0x8B) - (0x24 ^ 0x6E) + (0x4A ^ 0x28);
        z.lIIIIlllII[204] = 137 + 84 - 205 + 139;
        z.lIIIIlllII[205] = 46 + 31 - 40 + 119;
        z.lIIIIlllII[206] = 98 + 153 - 229 + 135;
        z.lIIIIlllII[207] = 125 + 87 - 202 + 148;
        z.lIIIIlllII[208] = 35 + 47 - 27 + 104;
        z.lIIIIlllII[209] = 112 + 68 - 47 + 7 + (0x6D ^ 0x7D) - (0xD3 ^ 0xA9) + (0xFC ^ 0x82);
        z.lIIIIlllII[210] = (0xC1 ^ 0xBF) + (0xCC ^ 0xC1) - (0 ^ 0x52) + (0x4E ^ 0x26);
        z.lIIIIlllII[211] = -(0xFFFFCB4F & 0x75B1) & (0xFFFFFDBF & 0x4FFD);
        z.lIIIIlllII[212] = (0xD2 ^ 0xC0) + (0x1A ^ 1) - -(0xA ^ 0x60) + (0x5C ^ 0x57);
        z.lIIIIlllII[213] = 81 + 113 - 60 + 29;
        z.lIIIIlllII[214] = (0xB8 ^ 0x98) + 3 - -(0x18 ^ 0x41) + (3 ^ 0x2B);
        z.lIIIIlllII[215] = 0xFFFFCFB3 & 0x3B6C;
        z.lIIIIlllII[216] = 0xFFFFB75B & 0x6FFD;
        z.lIIIIlllII[217] = 0xFFFFE7FF & 0x3F65;
        z.lIIIIlllII[218] = -(0xFFFF9C97 & 0x67EB) & (0xFFFFFFEF & 0xFBF);
        z.lIIIIlllII[219] = 0xFFFFEFFE & 0x376D;
        z.lIIIIlllII[220] = -(0xFFFFEFFF & 0x34D3) & (0xFFFFEFFF & 0x3FFE);
        z.lIIIIlllII[221] = -(0xFFFFF2EF & 0x6DDE) & (0xFFFFFBFF & 0x6FFF);
        z.lIIIIlllII[222] = 0xFFFFFFFF & 0xB2F;
        z.lIIIIlllII[223] = 0xFFFFB77F & 0x6FE7;
        z.lIIIIlllII[224] = 0xFFFFCF6E & 0x3BBF;
        z.lIIIIlllII[225] = (0x6B ^ 0x6C) + 1 - -(0x2D ^ 0x7A) + (0x3D ^ 0x7A);
        z.lIIIIlllII[226] = (0x2C ^ 0x5A) + (0xEB ^ 0x9A) - (0x5E ^ 0x24) + (0x66 ^ 0x5C);
        z.lIIIIlllII[227] = 8 + 77 - -7 + 76;
        z.lIIIIlllII[228] = -(0xFFFFFE52 & 0x11AF) & (0xFFFFF769 & 0x3FFF);
        z.lIIIIlllII[229] = 0xFFFF8F6A & 0x7BBF;
        z.lIIIIlllII[230] = 0xFFFFAF7B & 0x77DE;
        z.lIIIIlllII[231] = -(0xFFFFAED5 & 0x55EB) & (0xFFFFEFFB & 0x1FEF);
        z.lIIIIlllII[232] = -(0x6D ^ 0x7C) & (0xFFFFE77E & 0x3FF5);
        z.lIIIIlllII[233] = 77 + 43 - 65 + 114;
        z.lIIIIlllII[234] = (0x10 ^ 0x41) + (0x70 ^ 0x4D) - (0xE3 ^ 0xB3) + (0xDB ^ 0xB7);
        z.lIIIIlllII[235] = 156 + 57 - 56 + 14;
        z.lIIIIlllII[236] = 83 + 119 - 182 + 152;
        z.lIIIIlllII[237] = (0x13 ^ 0x51) + (0xA4 ^ 0x85) - -(0x2F ^ 0x31) + (0x37 ^ 0x1B);
        z.lIIIIlllII[238] = 0xFFFFDF7A & 0x3FCF;
        z.lIIIIlllII[239] = -(0xFFFFF1B5 & 0x7E4E) & (0xFFFFFF7B & 0x75FF);
        z.lIIIIlllII[240] = 0xFFFFDE57 & 0x27E8;
        z.lIIIIlllII[241] = -(0xFFFFD4FE & 0x3B03) & (0xFFFFBFFF & 0x53FD);
        z.lIIIIlllII[242] = 0xFFFFACFE & 0x5FE5;
        z.lIIIIlllII[243] = -(0xFFFFEE2C & 0x15DF) & (0xFFFFBFBB & 0x557F);
        z.lIIIIlllII[244] = 0xFFFFFDFC & 0x1653;
        z.lIIIIlllII[245] = -(0xFFFFEED3 & 0x7B2F) & (0xFFFFFF7E & Short.MAX_VALUE);
        z.lIIIIlllII[246] = 0xFFFFFB75 & 0x66FA;
        z.lIIIIlllII[247] = 0xFFFFEAFF & 0x9FAC;
        z.lIIIIlllII[248] = -(0xFFFFFFBB & 0x5347) & (0xFFFFDBBF & 0x7FDA);
        z.lIIIIlllII[249] = -(0xFFFFB5B2 & 0x7E5F) & (0xFFFFFDD7 & 0x3FFD);
        z.lIIIIlllII[250] = -(0xFFFF9EBF & 0x65C5) & (0xFFFFFFED & 0x3FF6);
        z.lIIIIlllII[251] = -(0xFFFFD2F3 & 0x2F7D) & (0xFFFFBEFE & 0x7FFD);
        z.lIIIIlllII[252] = 0xFFFFEECD & 0x3FFE;
        z.lIIIIlllII[253] = 0xFFFFFBAB & 0x65FC;
        z.lIIIIlllII[254] = 0xFFFFBDF5 & 0x4B9A;
        z.lIIIIlllII[255] = 0xFFFFDBB7 & 0x3CF8;
        z.lIIIIlllII[256] = -(0xFFFFBF2F & 0x45D7) & (0xFFFFFFEE & 0x37DF);
        z.lIIIIlllII[257] = -(0xFFFFEEF6 & 0x514D) & (0xFFFFFADB & Short.MAX_VALUE);
        z.lIIIIlllII[258] = -(0xFFFFFF5F & 0x18AA) & (0xFFFFFF8D & 0x1BFF);
        z.lIIIIlllII[259] = -(0xFFFFFEC6 & 0x71BD) & (0xFFFFFFFF & 0x77EF);
        z.lIIIIlllII[260] = 68 + 75 - 62 + 93;
        z.lIIIIlllII[261] = 111 + 25 - -12 + 8 + (1 ^ 8) - (0x28 ^ 0x3E) + (0x84 ^ 0xA4);
        z.lIIIIlllII[262] = -(0xFFFFF3E7 & 0x6C9D) & (0xFFFFFFAD & 0x6BFF);
        z.lIIIIlllII[263] = 0xFFFFBA7E & 0x55BB;
        z.lIIIIlllII[264] = 0xFFFFBF6F & 0x67F2;
        z.lIIIIlllII[265] = 0xFFFFFF3A & 0xBED;
        z.lIIIIlllII[266] = -(0xFFFFEBDA & 0x5DAF) & (0xFFFFFFFF & 0x59BF);
        z.lIIIIlllII[267] = 0xFFFFE7E9 & 0x3F7F;
        z.lIIIIlllII[268] = -(0xFFFFBFEA & 0x6FDF) & (0xFFFFBFFF & 0x7FFD);
        z.lIIIIlllII[269] = 153 + 45 - 22 + 0;
        z.lIIIIlllII[270] = (0x21 ^ 0x59) + (0x46 ^ 0x43) - (0x19 ^ 9) + (0xF ^ 0x4B);
        z.lIIIIlllII[271] = (0x9C ^ 0x97) + (107 + 92 - 130 + 67) - (0x26 ^ 0xD) + (0xC7 ^ 0x8D);
        z.lIIIIlllII[272] = 0xFFFFCEEB & 0x3FFD;
        z.lIIIIlllII[273] = -(0xFFFFC7FD & 0x3C97) & (0xFFFFFFBF & 0xFF7);
        z.lIIIIlllII[274] = -(0xFFFFFCB7 & 0x5BFE) & (0xFFFFFFF7 & Short.MAX_VALUE);
        z.lIIIIlllII[275] = -(0xFFFF94CD & 0x7B37) & (0xFFFFFEFC & 0x1FEF);
        z.lIIIIlllII[276] = 47 + 63 - -68 + 1;
        z.lIIIIlllII[277] = (0x11 ^ 0x4F) + (0x76 ^ 0xF) - (0xD9 ^ 0xAA) + (0x30 ^ 0x60);
        z.lIIIIlllII[278] = 114 + 69 - 9 + 7;
        z.lIIIIlllII[279] = 10 + 94 - 62 + 140;
        z.lIIIIlllII[280] = (0x2A ^ 0x36) + (106 + 37 - 123 + 108) - (0x7D ^ 0x51) + (0x2A ^ 0x6D);
        z.lIIIIlllII[281] = 158 + 148 - 208 + 86;
        z.lIIIIlllII[282] = 129 + 122 - 136 + 70;
        z.lIIIIlllII[283] = 70 + 31 - 3 + 88;
        z.lIIIIlllII[284] = 80 + 180 - 111 + 38;
        z.lIIIIlllII[285] = 163 + 7 - 117 + 135;
        z.lIIIIlllII[286] = 88 + 148 - 225 + 178;
        z.lIIIIlllII[287] = (0x29 ^ 0x36) + (0xDA ^ 0x8A) - (0x2D ^ 0x3D) + (0xE1 ^ 0xBE);
        z.lIIIIlllII[288] = (0xB ^ 0x59) + (0xDD ^ 0xA3) - (1 + 19 - -41 + 72) + (0x47 ^ 0x33);
        z.lIIIIlllII[289] = 124 + 51 - 108 + 125;
        z.lIIIIlllII[290] = 14 + 46 - 36 + 169;
        z.lIIIIlllII[291] = 100 + 49 - 35 + 27 + (0x45 ^ 0x39) - (0x17 ^ 0x48) + (0x47 ^ 0x5F);
        z.lIIIIlllII[292] = 32 + 36 - -16 + 104 + (147 + 39 - 60 + 41) - (0xFFFFE5AF & 0x1B59) + (0x4C ^ 0x25);
        z.lIIIIlllII[293] = 59 + 116 - 90 + 111;
        z.lIIIIlllII[294] = (0x59 ^ 0x46) + (0xE ^ 0x67) - (0xF5 ^ 0xB2) + (67 + 116 - 132 + 81);
        z.lIIIIlllII[295] = 26 + 96 - 38 + 114;
        z.lIIIIlllII[296] = (6 ^ 0x15) + (32 + 7 - -56 + 73) - (13 + 89 - 70 + 105) + (61 + 141 - 185 + 132);
        z.lIIIIlllII[297] = 160 + 38 - 176 + 178;
        z.lIIIIlllII[298] = 112 + 134 - 158 + 113;
        z.lIIIIlllII[299] = 85 + 122 - 152 + 125 + (0xEC ^ 0xB2) - (72 + 129 - 156 + 88) + (0x3D ^ 0);
        z.lIIIIlllII[300] = (0x6C ^ 0x53) + (103 + 164 - 105 + 14) - (102 + 162 - 223 + 129) + (114 + 63 - 158 + 115);
        z.lIIIIlllII[301] = 154 + 164 - 220 + 106;
        z.lIIIIlllII[302] = -(0xFFFFF5FF & 0x7E2E) & (0xFFFFFF7F & Short.MAX_VALUE);
        z.lIIIIlllII[303] = 0xFFFFCD7F & 0x3FE3;
        z.lIIIIlllII[304] = 0xFFFFB1EF & 0x4F5F;
        z.lIIIIlllII[305] = (0xCF ^ 0x91) + (83 + 23 - 49 + 134) - (77 + 23 - -72 + 19) + (0xE9 ^ 0x86);
        z.lIIIIlllII[306] = (0xCE ^ 0xA0) + (0xC7 ^ 0x9C) - (0x34 ^ 0xC) + (0x68 ^ 0x55);
        z.lIIIIlllII[307] = 48 + 157 - 107 + 109;
        z.lIIIIlllII[308] = 0 + 196 - 36 + 48;
        z.lIIIIlllII[309] = (0xC0 ^ 0xAC) + (0x33 ^ 0x4B) - (0x64 ^ 0x7D) + (0xC6 ^ 0xC0);
    }

    private static boolean lllIIllIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lllIIlIIlIII() {
        lIIIIlIlII = new String[lIIIIlllII[309]];
        z.lIIIIlIlII[z.lIIIIlllII[1]] = z."Finished buying items, switching back to quest";
        z.lIIIIlIlII[z.lIIIIlllII[0]] = z."- Plague city";
        z.lIIIIlIlII[z.lIIIIlllII[7]] = z."- Troll Stronghold";
        z.lIIIIlIlII[z.lIIIIlllII[9]] = z."- Herblore";
        z.lIIIIlIlII[z.lIIIIlllII[10]] = z."";
        z.lIIIIlIlII[z.lIIIIlllII[11]] = z."Nav to bank";
        z.lIIIIlIlII[z.lIIIIlllII[13]] = z."Handling banking";
        z.lIIIIlIlII[z.lIIIIlllII[20]] = z."We are missing quest supplies, switching to BUYING";
        z.lIIIIlIlII[z.lIIIIlllII[27]] = z."We are missing quest supplies, switching to BUYING";
        z.lIIIIlIlII[z.lIIIIlllII[29]] = z."Drink";
        z.lIIIIlIlII[z.lIIIIlllII[15]] = z."Drink";
        z.lIIIIlIlII[z.lIIIIlllII[31]] = z."Shark";
        z.lIIIIlIlII[z.lIIIIlllII[33]] = z."Shark";
        z.lIIIIlIlII[z.lIIIIlllII[21]] = z."Eat";
        z.lIIIIlIlII[z.lIIIIlllII[38]] = z."Drink";
        z.lIIIIlIlII[z.lIIIIlllII[39]] = z."Nav to start";
        z.lIIIIlIlII[z.lIIIIlllII[40]] = z."Sanfew";
        z.lIIIIlIlII[z.lIIIIlllII[41]] = z."Nav to burthrope";
        z.lIIIIlIlII[z.lIIIIlllII[42]] = z."Wear";
        z.lIIIIlIlII[z.lIIIIlllII[43]] = z."Burthorpe";
        z.lIIIIlIlII[z.lIIIIlllII[44]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[45]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[46]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[47]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[37]] = z."Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[48]] = z."Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[49]] = z."Exit";
        z.lIIIIlIlII[z.lIIIIlllII[50]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[53]] = z."Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[54]] = z."Going down stairs";
        z.lIIIIlIlII[z.lIIIIlllII[3]] = z."Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[8]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[55]] = z."Burntmeat";
        z.lIIIIlIlII[z.lIIIIlllII[56]] = z."Going upstairs";
        z.lIIIIlIlII[z.lIIIIlllII[57]] = z."Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[58]] = z."Climb-up";
        z.lIIIIlIlII[z.lIIIIlllII[61]] = z."Nav to exit";
        z.lIIIIlIlII[z.lIIIIlllII[62]] = z."Exiting";
        z.lIIIIlIlII[z.lIIIIlllII[63]] = z."Exit";
        z.lIIIIlIlII[z.lIIIIlllII[64]] = z."Leave";
        z.lIIIIlIlII[z.lIIIIlllII[65]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[68]] = z."Nav to Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[71]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[72]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[74]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[75]] = z."Tele to ardy";
        z.lIIIIlIlII[z.lIIIIlllII[76]] = z."Break";
        z.lIIIIlIlII[z.lIIIIlllII[77]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[78]] = z."Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[81]] = z."Nav to parroty pete";
        z.lIIIIlIlII[z.lIIIIlllII[6]] = z."Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[82]] = z."Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[83]] = z."Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[84]] = z."When did you add it?";
        z.lIIIIlIlII[z.lIIIIlllII[85]] = z."Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[86]] = z."What do you feed them?";
        z.lIIIIlIlII[z.lIIIIlllII[88]] = z."Aviary Hatch";
        z.lIIIIlIlII[z.lIIIIlllII[89]] = z."Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[90]] = z."Nav to burthrope";
        z.lIIIIlIlII[z.lIIIIlllII[91]] = z."Wear";
        z.lIIIIlIlII[z.lIIIIlllII[92]] = z."Burthorpe";
        z.lIIIIlIlII[z.lIIIIlllII[93]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[94]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[95]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[96]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[97]] = z."Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[98]] = z."Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[99]] = z."Exit";
        z.lIIIIlIlII[z.lIIIIlllII[100]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[102]] = z."Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[103]] = z."Going down stairs";
        z.lIIIIlIlII[z.lIIIIlllII[104]] = z."Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[105]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[106]] = z."Nav to stair";
        z.lIIIIlIlII[z.lIIIIlllII[107]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[108]] = z."Shark";
        z.lIIIIlIlII[z.lIIIIlllII[109]] = z."Eat";
        z.lIIIIlIlII[z.lIIIIlllII[110]] = z."Drink";
        z.lIIIIlIlII[z.lIIIIlllII[113]] = z."Nav to rack";
        z.lIIIIlIlII[z.lIIIIlllII[114]] = z."Putting parrot on rack";
        z.lIIIIlIlII[z.lIIIIlllII[115]] = z."Rack";
        z.lIIIIlIlII[z.lIIIIlllII[119]] = z."Nav to tegrid";
        z.lIIIIlIlII[z.lIIIIlllII[120]] = z."Tegid";
        z.lIIIIlIlII[z.lIIIIlllII[121]] = z."Sanfew won't be happy...";
        z.lIIIIlIlII[z.lIIIIlllII[122]] = z."Tegid";
        z.lIIIIlIlII[z.lIIIIlllII[123]] = z."Nav to burthrope";
        z.lIIIIlIlII[z.lIIIIlllII[124]] = z."Wear";
        z.lIIIIlIlII[z.lIIIIlllII[125]] = z."Burthorpe";
        z.lIIIIlIlII[z.lIIIIlllII[126]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[127]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[128]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[129]] = z."Troll potion";
        z.lIIIIlIlII[z.lIIIIlllII[130]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[131]] = z."Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[132]] = z."Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[133]] = z."Exit";
        z.lIIIIlIlII[z.lIIIIlllII[136]] = z."Troll thistle";
        z.lIIIIlIlII[z.lIIIIlllII[137]] = z."Getting thistle";
        z.lIIIIlIlII[z.lIIIIlllII[138]] = z."Thistle";
        z.lIIIIlIlII[z.lIIIIlllII[30]] = z."Pick";
        z.lIIIIlIlII[z.lIIIIlllII[139]] = z."Troll thistle";
        z.lIIIIlIlII[z.lIIIIlllII[142]] = z."Nav to FM tile";
        z.lIIIIlIlII[z.lIIIIlllII[143]] = z."Burning fire";
        z.lIIIIlIlII[z.lIIIIlllII[144]] = z."Tinderbox";
        z.lIIIIlIlII[z.lIIIIlllII[145]] = z."Logs";
        z.lIIIIlIlII[z.lIIIIlllII[146]] = z."Burning thistle";
        z.lIIIIlIlII[z.lIIIIlllII[147]] = z."Troll thistle";
        z.lIIIIlIlII[z.lIIIIlllII[148]] = z."Fire";
        z.lIIIIlIlII[z.lIIIIlllII[149]] = z."Crushing thistle";
        z.lIIIIlIlII[z.lIIIIlllII[150]] = z."Mixing potion";
        z.lIIIIlIlII[z.lIIIIlllII[152]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[153]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[154]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[155]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[156]] = z."Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[157]] = z."Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[158]] = z."Exit";
        z.lIIIIlIlII[z.lIIIIlllII[159]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[160]] = z."Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[161]] = z."Going down stairs";
        z.lIIIIlIlII[z.lIIIIlllII[162]] = z."Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[163]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[164]] = z."Nav to stair";
        z.lIIIIlIlII[z.lIIIIlllII[165]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[166]] = z."Shark";
        z.lIIIIlIlII[z.lIIIIlllII[167]] = z."Eat";
        z.lIIIIlIlII[z.lIIIIlllII[168]] = z."Drink";
        z.lIIIIlIlII[z.lIIIIlllII[169]] = z."Nav to rack";
        z.lIIIIlIlII[z.lIIIIlllII[170]] = z."Getting parrot";
        z.lIIIIlIlII[z.lIIIIlllII[171]] = z."Rack";
        z.lIIIIlIlII[z.lIIIIlllII[172]] = z."Search";
        z.lIIIIlIlII[z.lIIIIlllII[177]] = z."Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[178]] = z."Go upstairs";
        z.lIIIIlIlII[z.lIIIIlllII[179]] = z."Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[180]] = z."Climb-up";
        z.lIIIIlIlII[z.lIIIIlllII[183]] = z."Nav to stair";
        z.lIIIIlIlII[z.lIIIIlllII[184]] = z."Climb-up";
        z.lIIIIlIlII[z.lIIIIlllII[185]] = z."Exiting stronghold";
        z.lIIIIlIlII[z.lIIIIlllII[186]] = z."Exit";
        z.lIIIIlIlII[z.lIIIIlllII[187]] = z."Use";
        z.lIIIIlIlII[z.lIIIIlllII[188]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[189]] = z."Nav to Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[190]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[191]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[192]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[193]] = z."Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[194]] = z."Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[195]] = z."Exit";
        z.lIIIIlIlII[z.lIIIIlllII[196]] = z."Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[197]] = z."Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[198]] = z."Going down stairs";
        z.lIIIIlIlII[z.lIIIIlllII[199]] = z."Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[200]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[201]] = z."Burntmeat";
        z.lIIIIlIlII[z.lIIIIlllII[203]] = z."Burntmeat";
        z.lIIIIlIlII[z.lIIIIlllII[204]] = z."So, where can I get some goutweed?";
        z.lIIIIlIlII[z.lIIIIlllII[205]] = z."Getting key";
        z.lIIIIlIlII[z.lIIIIlllII[206]] = z."Open";
        z.lIIIIlIlII[z.lIIIIlllII[207]] = z."Open";
        z.lIIIIlIlII[z.lIIIIlllII[208]] = z."Search";
        z.lIIIIlIlII[z.lIIIIlllII[209]] = z."Go downstairs";
        z.lIIIIlIlII[z.lIIIIlllII[210]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[212]] = z."Nav to start";
        z.lIIIIlIlII[z.lIIIIlllII[213]] = z."Sanfew";
        z.lIIIIlIlII[z.lIIIIlllII[214]] = z."Break";
        z.lIIIIlIlII[z.lIIIIlllII[2]] = z."Entering maze";
        z.lIIIIlIlII[z.lIIIIlllII[225]] = z."Open";
        z.lIIIIlIlII[z.lIIIIlllII[226]] = z."Open";
        z.lIIIIlIlII[z.lIIIIlllII[227]] = z."Open";
        z.lIIIIlIlII[z.lIIIIlllII[233]] = z."Run to first hide spot";
        z.lIIIIlIlII[z.lIIIIlllII[234]] = z."Run to crate";
        z.lIIIIlIlII[z.lIIIIlllII[235]] = z."Search";
        z.lIIIIlIlII[z.lIIIIlllII[236]] = z."Nav to bank";
        z.lIIIIlIlII[z.lIIIIlllII[237]] = z."Handling banking";
        z.lIIIIlIlII[z.lIIIIlllII[260]] = z."ring of wealth (";
        z.lIIIIlIlII[z.lIIIIlllII[261]] = z."Goutweed";
        z.lIIIIlIlII[z.lIIIIlllII[269]] = z."Door";
        z.lIIIIlIlII[z.lIIIIlllII[270]] = z."Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[271]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[276]] = z."Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[277]] = z."Climb-up";
        z.lIIIIlIlII[z.lIIIIlllII[278]] = z."Prayer";
        z.lIIIIlIlII[z.lIIIIlllII[279]] = z."Prayer";
        z.lIIIIlIlII[z.lIIIIlllII[280]] = z."Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[281]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[282]] = z."Fire";
        z.lIIIIlIlII[z.lIIIIlllII[283]] = z."Fire";
        z.lIIIIlIlII[z.lIIIIlllII[284]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[285]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[286]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[287]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[288]] = z."Prayer";
        z.lIIIIlIlII[z.lIIIIlllII[289]] = z."Prayer";
        z.lIIIIlIlII[z.lIIIIlllII[290]] = z."Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[291]] = z."Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[292]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[293]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[294]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[295]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[296]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[297]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[298]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[299]] = z."Games";
        z.lIIIIlIlII[z.lIIIIlllII[300]] = z."poison";
        z.lIIIIlIlII[z.lIIIIlllII[301]] = z."poison";
        z.lIIIIlIlII[z.lIIIIlllII[305]] = z."Yes.";
        z.lIIIIlIlII[z.lIIIIlllII[306]] = z."Have you any more work for me, to help reclaim the circle?";
        z.lIIIIlIlII[z.lIIIIlllII[307]] = z."I need to find some goutweed.";
        z.lIIIIlIlII[z.lIIIIlllII[308]] = z."";
    }

    private static /* synthetic */ boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[269]]) ? 1 : 0) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIlllII[9])) {
            n2 = lIIIIlllII[0];
            0;
            if (-3 > 0) {
                return (1 & ~1) != 0;
            }
        } else {
            n2 = lIIIIlllII[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIlIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIllIIIll(Object object) {
        return object == null;
    }

    @Override
    public boolean ae() {
        return lIIIIlllII[1];
    }

    static {
        z.lllIIlIIlIIl();
        z.lllIIlIIlIII();
        bx = new ArrayList<d>();
        dg = new WorldPoint(lIIIIlllII[302], lIIIIlllII[303], lIIIIlllII[0]);
        dL = lIIIIlllII[304];
        dS = lIIIIlllII[1];
        String[] stringArray = new String[lIIIIlllII[9]];
        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[305]];
        stringArray[z.lIIIIlllII[0]] = lIIIIlIlII[lIIIIlllII[306]];
        stringArray[z.lIIIIlllII[7]] = lIIIIlIlII[lIIIIlllII[307]];
        cG = stringArray;
        dc = lIIIIlIlII[lIIIIlllII[308]];
        h = "Eadgars Ruse " + dc;
    }

    private static boolean lllIIlIIlIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void bl() {
        void llIllIIIIIII;
        void llIllIIIIIIl;
        void llIlIlllllll;
        NPC llIlIllllIll;
        NPC llIlIllllIlI;
        WorldArea worldArea = new WorldArea(lIIIIlllII[215], lIIIIlllII[216], lIIIIlllII[42], lIIIIlllII[38], lIIIIlllII[1]);
        WorldArea worldArea2 = new WorldArea(lIIIIlllII[215], lIIIIlllII[217], lIIIIlllII[38], lIIIIlllII[31], lIIIIlllII[1]);
        WorldPoint worldPoint = new WorldPoint(lIIIIlllII[218], lIIIIlllII[219], lIIIIlllII[1]);
        if (z.lllIIlIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.lllIIlIllIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint2 = new WorldPoint(lIIIIlllII[220], lIIIIlllII[219], lIIIIlllII[1]);
            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[2]];
            Movement.walkTo((WorldPoint)worldPoint);
            0;
            Time.sleepTicks((int)lIIIIlllII[0]);
            0;
            WorldArea worldArea3 = new WorldArea(lIIIIlllII[221], lIIIIlllII[217], lIIIIlllII[20], lIIIIlllII[29], lIIIIlllII[1]);
            WorldArea worldArea4 = new WorldArea(lIIIIlllII[222], lIIIIlllII[223], lIIIIlllII[11], lIIIIlllII[20], lIIIIlllII[1]);
            if ((!z.lllIIlIllIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || z.lllIIlIIlIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && z.lllIIlIlllIl(llIlIllllIlI = TileObjects.getNearest(arg_0 -> z.a((WorldPoint)(llIlIllllIll = new WorldPoint(lIIIIlllII[224], lIIIIlllII[219], lIIIIlllII[1])), arg_0)))) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[225]];
                if (z.lllIIlIIlIll(llIlIllllIlI.hasAction(stringArray) ? 1 : 0)) {
                    llIlIllllIlI.interact(lIIIIlIlII[lIIIIlllII[226]]);
                    Time.sleepTicks((int)lIIIIlllII[9]);
                    0;
                }
                String[] stringArray2 = new String[lIIIIlllII[0]];
                stringArray2[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[227]];
                if (z.lllIIlIllIll(llIlIllllIlI.hasAction(stringArray2) ? 1 : 0) && z.lllIIlIllIll(Players.getLocal().getWorldLocation().equals((Object)llIlIlllllll) ? 1 : 0)) {
                    e.c((WorldPoint)llIlIlllllll);
                    Time.sleepTicks((int)lIIIIlllII[7]);
                    0;
                }
            }
        }
        if (!z.lllIIlIllIll(llIllIIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !z.lllIIlIllIll(llIllIIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || z.lllIIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIlIlllllll) ? 1 : 0)) {
            TileObject llIlIllllIII;
            WorldArea llIlIllllllI = new WorldArea(lIIIIlllII[215], lIIIIlllII[228], lIIIIlllII[27], lIIIIlllII[13], lIIIIlllII[1]);
            WorldPoint llIlIlllllIl = new WorldPoint(lIIIIlllII[229], lIIIIlllII[230], lIIIIlllII[1]);
            NPC llIlIlllllII = NPCs.getNearest(nPC -> {
                int n2;
                if (z.lllIIllIIIlI(nPC.getId(), lIIIIlllII[268]) && z.lllIIlIIlIll(llIlIllllllI.contains(nPC.getWorldLocation()) ? 1 : 0)) {
                    n2 = lIIIIlllII[0];
                    0;
                    if (1 >= 2) {
                        return false;
                    }
                } else {
                    n2 = lIIIIlllII[1];
                }
                return n2 != 0;
            });
            llIlIllllIll = NPCs.getNearest(nPC -> {
                int n2;
                if (z.lllIIllIIIlI(nPC.getId(), lIIIIlllII[266]) && (!z.lllIIlIllIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[231], lIIIIlllII[267], lIIIIlllII[1])) ? 1 : 0) || !z.lllIIlIllIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[262], lIIIIlllII[267], lIIIIlllII[1])) ? 1 : 0) || z.lllIIlIIlIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[229], lIIIIlllII[267], lIIIIlllII[1])) ? 1 : 0))) {
                    n2 = lIIIIlllII[0];
                    0;
                    if (2 >= (0x34 ^ 0x30)) {
                        return false;
                    }
                } else {
                    n2 = lIIIIlllII[1];
                }
                return n2 != 0;
            });
            llIlIllllIlI = NPCs.getNearest(nPC -> {
                int n2;
                if (z.lllIIllIIIlI(nPC.getId(), lIIIIlllII[263]) && (!z.lllIIlIllIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[262], lIIIIlllII[264], lIIIIlllII[1])) ? 1 : 0) || z.lllIIlIIlIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[265], lIIIIlllII[264], lIIIIlllII[1])) ? 1 : 0))) {
                    n2 = lIIIIlllII[0];
                    0;
                    if (-3 >= 0) {
                        return false;
                    }
                } else {
                    n2 = lIIIIlllII[1];
                }
                return n2 != 0;
            });
            WorldPoint llIlIllllIIl = new WorldPoint(lIIIIlllII[231], lIIIIlllII[232], lIIIIlllII[1]);
            if (z.lllIIlIlllIl(llIlIlllllII) && z.lllIIlIlllIl(llIlIllllIll) && z.lllIIllIIIII(Players.getLocal().getWorldLocation().getY(), lIIIIlllII[217]) && z.lllIIlIlllII(Movement.getRunEnergy(), lIIIIlllII[44])) {
                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[233]];
                e.c(llIlIllllIIl);
                Time.sleepTicks((int)lIIIIlllII[7]);
                0;
            }
            if (z.lllIIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIlIllllIIl) ? 1 : 0) && z.lllIIlIlllIl(llIlIllllIlI)) {
                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[234]];
                e.c(llIlIlllllIl);
                Time.sleepTicks((int)lIIIIlllII[7]);
                0;
            }
            if (z.lllIIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIlIlllllIl) ? 1 : 0) && z.lllIIlIlllIl(llIlIllllIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[261]]) ? 1 : 0) && z.lllIIlIIlIll(tileObject.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[262], lIIIIlllII[230], lIIIIlllII[1])) ? 1 : 0)) {
                    n2 = lIIIIlllII[0];
                    0;
                    if (-2 >= 0) {
                        return ((0x3A ^ 0x4A ^ (0xC3 ^ 0xB5)) & (0xB1 ^ 0x97 ^ (0x57 ^ 0x77) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIlllII[1];
                }
                return n2 != 0;
            }))) {
                llIlIllllIII.interact(lIIIIlIlII[lIIIIlllII[235]]);
                Time.sleepTicks((int)lIIIIlllII[7]);
                0;
            }
        }
    }

    private static void Q() {
        block58: {
            d llIlIllIlllI;
            block57: {
                block56: {
                    block55: {
                        block54: {
                            block53: {
                                block52: {
                                    block51: {
                                        block50: {
                                            block49: {
                                                Object llIlIllIllll;
                                                block48: {
                                                    block47: {
                                                        block46: {
                                                            block45: {
                                                                block44: {
                                                                    block43: {
                                                                        block42: {
                                                                            block41: {
                                                                                block40: {
                                                                                    block39: {
                                                                                        int[] nArray = new int[lIIIIlllII[0]];
                                                                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[238];
                                                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                                                                        int[] nArray2 = new int[lIIIIlllII[0]];
                                                                                        nArray2[z.lIIIIlllII[1]] = lIIIIlllII[238];
                                                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block40;
                                                                                        int[] nArray3 = new int[lIIIIlllII[0]];
                                                                                        nArray3[z.lIIIIlllII[1]] = lIIIIlllII[238];
                                                                                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlllII[15])) break block40;
                                                                                    }
                                                                                    llIlIllIllll = new d(lIIIIlllII[238], lIIIIlllII[15], e.c(lIIIIlllII[239], lIIIIlllII[240]));
                                                                                    bx.add((d)llIlIllIllll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray = new int[lIIIIlllII[0]];
                                                                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[19];
                                                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                                                                int[] nArray4 = new int[lIIIIlllII[0]];
                                                                                nArray4[z.lIIIIlllII[1]] = lIIIIlllII[19];
                                                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block42;
                                                                                int[] nArray5 = new int[lIIIIlllII[0]];
                                                                                nArray5[z.lIIIIlllII[1]] = lIIIIlllII[19];
                                                                                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIlllII[15])) break block42;
                                                                            }
                                                                            llIlIllIllll = new d(lIIIIlllII[19], lIIIIlllII[15], lIIIIlllII[241]);
                                                                            bx.add((d)llIlIllIllll);
                                                                            0;
                                                                        }
                                                                        int[] nArray = new int[lIIIIlllII[0]];
                                                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                                                                        int[] nArray6 = new int[lIIIIlllII[0]];
                                                                        nArray6[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block44;
                                                                        int[] nArray7 = new int[lIIIIlllII[0]];
                                                                        nArray7[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                                                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlllII[15])) break block44;
                                                                    }
                                                                    llIlIllIllll = new d(lIIIIlllII[14], lIIIIlllII[15], e.c(lIIIIlllII[242], lIIIIlllII[243]));
                                                                    bx.add((d)llIlIllIllll);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lIIIIlllII[0]];
                                                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                                                int[] nArray8 = new int[lIIIIlllII[0]];
                                                                nArray8[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block46;
                                                                int[] nArray9 = new int[lIIIIlllII[0]];
                                                                nArray9[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                                                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray9).getQuantity(), lIIIIlllII[11])) break block46;
                                                            }
                                                            llIlIllIllll = new d(lIIIIlllII[16], lIIIIlllII[11], e.c(lIIIIlllII[242], lIIIIlllII[243]));
                                                            bx.add((d)llIlIllIllll);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lIIIIlllII[0]];
                                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[28];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            llIlIllIllll = new d(lIIIIlllII[28], lIIIIlllII[0], e.c(lIIIIlllII[244], lIIIIlllII[245]));
                                                            bx.add((d)llIlIllIllll);
                                                            0;
                                                        }
                                                        int[] nArray10 = new int[lIIIIlllII[0]];
                                                        nArray10[z.lIIIIlllII[1]] = lIIIIlllII[32];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                                            llIlIllIllll = new d(lIIIIlllII[32], lIIIIlllII[0], e.c(lIIIIlllII[244], lIIIIlllII[245]));
                                                            bx.add((d)llIlIllIllll);
                                                            0;
                                                        }
                                                        int[] nArray11 = new int[lIIIIlllII[0]];
                                                        nArray11[z.lIIIIlllII[1]] = lIIIIlllII[30];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                                            llIlIllIllll = new d(lIIIIlllII[30], lIIIIlllII[0], e.c(lIIIIlllII[246], lIIIIlllII[247]));
                                                            bx.add((d)llIlIllIllll);
                                                            0;
                                                        }
                                                        int[] nArray12 = new int[lIIIIlllII[0]];
                                                        nArray12[z.lIIIIlllII[1]] = lIIIIlllII[24];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                            llIlIllIllll = new d(lIIIIlllII[24], lIIIIlllII[0], e.c(lIIIIlllII[244], lIIIIlllII[245]));
                                                            bx.add((d)llIlIllIllll);
                                                            0;
                                                        }
                                                        int[] nArray13 = new int[lIIIIlllII[0]];
                                                        nArray13[z.lIIIIlllII[1]] = lIIIIlllII[34];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                                            llIlIllIllll = new d(lIIIIlllII[34], lIIIIlllII[11], e.c(lIIIIlllII[248], lIIIIlllII[249]));
                                                            bx.add((d)llIlIllIllll);
                                                            0;
                                                        }
                                                        int[] nArray14 = new int[lIIIIlllII[0]];
                                                        nArray14[z.lIIIIlllII[1]] = lIIIIlllII[25];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                            llIlIllIllll = new d(lIIIIlllII[25], lIIIIlllII[0], e.c(lIIIIlllII[250], lIIIIlllII[251]));
                                                            bx.add((d)llIlIllIllll);
                                                            0;
                                                        }
                                                        int[] nArray15 = new int[lIIIIlllII[0]];
                                                        nArray15[z.lIIIIlllII[1]] = lIIIIlllII[26];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                            llIlIllIllll = new d(lIIIIlllII[26], lIIIIlllII[0], e.c(lIIIIlllII[250], lIIIIlllII[251]));
                                                            bx.add((d)llIlIllIllll);
                                                            0;
                                                        }
                                                        int[] nArray16 = new int[lIIIIlllII[0]];
                                                        nArray16[z.lIIIIlllII[1]] = lIIIIlllII[18];
                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray16) ? 1 : 0)) break block47;
                                                        int[] nArray17 = new int[lIIIIlllII[0]];
                                                        nArray17[z.lIIIIlllII[1]] = lIIIIlllII[18];
                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray17) ? 1 : 0)) break block48;
                                                        int[] nArray18 = new int[lIIIIlllII[0]];
                                                        nArray18[z.lIIIIlllII[1]] = lIIIIlllII[18];
                                                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray18).getQuantity(), lIIIIlllII[7])) break block48;
                                                    }
                                                    llIlIllIllll = new d(lIIIIlllII[18], lIIIIlllII[7], e.c(lIIIIlllII[250], lIIIIlllII[251]));
                                                    bx.add((d)llIlIllIllll);
                                                    0;
                                                }
                                                if (z.lllIIlIllIll(Bank.contains((Predicate)(llIlIllIllll = item -> item.getName().toLowerCase().contains(lIIIIlIlII[lIIIIlllII[260]]))) ? 1 : 0)) {
                                                    llIlIllIlllI = new d(lIIIIlllII[252], lIIIIlllII[11], lIIIIlllII[253]);
                                                    bx.add(llIlIllIlllI);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIIIlllII[0]];
                                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[254];
                                                if (z.lllIIlIllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    llIlIllIlllI = new d(lIIIIlllII[254], lIIIIlllII[0], lIIIIlllII[255]);
                                                    bx.add(llIlIllIlllI);
                                                    0;
                                                }
                                                int[] nArray19 = new int[lIIIIlllII[0]];
                                                nArray19[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray19) ? 1 : 0)) break block49;
                                                int[] nArray20 = new int[lIIIIlllII[0]];
                                                nArray20[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray20) ? 1 : 0)) break block50;
                                                int[] nArray21 = new int[lIIIIlllII[0]];
                                                nArray21[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray21).getQuantity(), lIIIIlllII[15])) break block50;
                                            }
                                            llIlIllIlllI = new d(lIIIIlllII[17], lIIIIlllII[15], e.c(lIIIIlllII[256], lIIIIlllII[257]));
                                            bx.add(llIlIllIlllI);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIIlllII[0]];
                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[36];
                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block51;
                                        int[] nArray22 = new int[lIIIIlllII[0]];
                                        nArray22[z.lIIIIlllII[1]] = lIIIIlllII[36];
                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray22) ? 1 : 0)) break block52;
                                        int[] nArray23 = new int[lIIIIlllII[0]];
                                        nArray23[z.lIIIIlllII[1]] = lIIIIlllII[36];
                                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray23).getQuantity(), lIIIIlllII[10])) break block52;
                                    }
                                    llIlIllIlllI = new d(lIIIIlllII[36], lIIIIlllII[10], j.ch);
                                    bx.add(llIlIllIlllI);
                                    0;
                                }
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block53;
                                int[] nArray24 = new int[lIIIIlllII[0]];
                                nArray24[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray24) ? 1 : 0)) break block54;
                                int[] nArray25 = new int[lIIIIlllII[0]];
                                nArray25[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray25).getQuantity(), lIIIIlllII[44])) break block54;
                            }
                            llIlIllIlllI = new d(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]);
                            bx.add(llIlIllIlllI);
                            0;
                        }
                        int[] nArray = new int[lIIIIlllII[0]];
                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[22];
                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                        int[] nArray26 = new int[lIIIIlllII[0]];
                        nArray26[z.lIIIIlllII[1]] = lIIIIlllII[22];
                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray26) ? 1 : 0)) break block56;
                        int[] nArray27 = new int[lIIIIlllII[0]];
                        nArray27[z.lIIIIlllII[1]] = lIIIIlllII[22];
                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray27).getQuantity(), lIIIIlllII[39])) break block56;
                    }
                    llIlIllIlllI = new d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]);
                    bx.add(llIlIllIlllI);
                    0;
                }
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[23];
                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block57;
                int[] nArray28 = new int[lIIIIlllII[0]];
                nArray28[z.lIIIIlllII[1]] = lIIIIlllII[23];
                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray28) ? 1 : 0)) break block58;
                int[] nArray29 = new int[lIIIIlllII[0]];
                nArray29[z.lIIIIlllII[1]] = lIIIIlllII[23];
                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray29).getQuantity(), lIIIIlllII[39])) break block58;
            }
            llIlIllIlllI = new d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]);
            bx.add(llIlIllIlllI);
            0;
        }
    }

    public static void bk() {
        block177: {
            WorldPoint llIllIIIlllI;
            BankLocation llIllIIIllll;
            block180: {
                block186: {
                    block182: {
                        block185: {
                            block184: {
                                block183: {
                                    block181: {
                                        block179: {
                                            block178: {
                                                if (z.lllIIlIIlIll(bv ? 1 : 0)) {
                                                    b.a(bx);
                                                    if (z.lllIIlIIllII(bx.size(), lIIIIlllII[0])) {
                                                        System.out.println(lIIIIlIlII[lIIIIlllII[1]]);
                                                        bv = lIIIIlllII[1];
                                                    }
                                                }
                                                if (!z.lllIIlIllIll(bv ? 1 : 0)) break block177;
                                                if (!z.lllIIlIlllII(e.j(lIIIIlllII[2]), lIIIIlllII[3])) break block178;
                                                int[] nArray = new int[lIIIIlllII[0]];
                                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[4];
                                                if (!z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block179;
                                            }
                                            dc = lIIIIlIlII[lIIIIlllII[0]];
                                            F.bG();
                                        }
                                        if (z.lllIIlIlllII(e.j(lIIIIlllII[2]), lIIIIlllII[3])) {
                                            int[] nArray = new int[lIIIIlllII[0]];
                                            nArray[z.lIIIIlllII[1]] = lIIIIlllII[4];
                                            if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0) && z.lllIIlIIllII(e.j(lIIIIlllII[5]), lIIIIlllII[6])) {
                                                dc = lIIIIlIlII[lIIIIlllII[7]];
                                                L.cl();
                                            }
                                        }
                                        if (z.lllIIlIlllII(e.j(lIIIIlllII[2]), lIIIIlllII[3])) {
                                            int[] nArray = new int[lIIIIlllII[0]];
                                            nArray[z.lIIIIlllII[1]] = lIIIIlllII[4];
                                            if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0) && z.lllIIlIlllII(e.j(lIIIIlllII[5]), lIIIIlllII[6]) && z.lllIIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), lIIIIlllII[8])) {
                                                dc = lIIIIlIlII[lIIIIlllII[9]];
                                                ap.eK();
                                            }
                                        }
                                        e.t();
                                        if (!z.lllIIlIllIll(z.an() ? 1 : 0) || !z.lllIIlIlllII(e.j(lIIIIlllII[2]), lIIIIlllII[3])) break block180;
                                        int[] nArray = new int[lIIIIlllII[0]];
                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[4];
                                        if (!z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0) || !z.lllIIlIlllII(e.j(lIIIIlllII[5]), lIIIIlllII[6]) || !z.lllIIlIlllII(Skills.getLevel((Skill)Skill.HERBLORE), lIIIIlllII[8]) || !z.lllIIlIIllII(e.j(dL), lIIIIlllII[0])) break block180;
                                        dc = lIIIIlIlII[lIIIIlllII[10]];
                                        llIllIIIllll = BankLocation.getNearest();
                                        if (z.lllIIlIlllIl(llIllIIIllll) && z.lllIIlIllIll(llIllIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[11]];
                                            a.a(llIllIIIllll);
                                        }
                                        if (!z.lllIIlIlllIl(llIllIIIllll) || !z.lllIIlIIlIll(llIllIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block180;
                                        if (z.lllIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllII[12]);
                                            0;
                                        }
                                        if (!z.lllIIlIIlIll(Bank.isOpen() ? 1 : 0)) break block180;
                                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[13]];
                                        if (z.lllIIlIllllI(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIIIlllII[10]);
                                            0;
                                        }
                                        if (z.lllIIlIllllI(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIIIlllII[7]);
                                            0;
                                        }
                                        int[] nArray2 = new int[lIIIIlllII[0]];
                                        nArray2[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block181;
                                        int[] nArray3 = new int[lIIIIlllII[0]];
                                        nArray3[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                        if (!z.lllIIlIlllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlllII[15])) break block182;
                                    }
                                    int[] nArray = new int[lIIIIlllII[0]];
                                    nArray[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                    if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block183;
                                    int[] nArray4 = new int[lIIIIlllII[0]];
                                    nArray4[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                    if (!z.lllIIlIlllII(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIlllII[11])) break block182;
                                }
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block184;
                                int[] nArray5 = new int[lIIIIlllII[0]];
                                nArray5[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                if (!z.lllIIlIlllII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIlllII[11])) break block182;
                            }
                            int[] nArray = new int[lIIIIlllII[0]];
                            nArray[z.lIIIIlllII[1]] = lIIIIlllII[18];
                            if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block185;
                            int[] nArray6 = new int[lIIIIlllII[0]];
                            nArray6[z.lIIIIlllII[1]] = lIIIIlllII[18];
                            if (!z.lllIIlIlllII(Bank.getFirst((int[])nArray6).getQuantity(), lIIIIlllII[7])) break block182;
                        }
                        int[] nArray = new int[lIIIIlllII[0]];
                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[19];
                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block186;
                        int[] nArray7 = new int[lIIIIlllII[0]];
                        nArray7[z.lIIIIlllII[1]] = lIIIIlllII[19];
                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlllII[11])) break block186;
                    }
                    z.Q();
                    System.out.println(lIIIIlIlII[lIIIIlllII[20]]);
                    bv = lIIIIlllII[0];
                    return;
                }
                int[] nArray = new int[lIIIIlllII[21]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[22];
                nArray[z.lIIIIlllII[0]] = lIIIIlllII[23];
                nArray[z.lIIIIlllII[7]] = lIIIIlllII[24];
                nArray[z.lIIIIlllII[9]] = lIIIIlllII[25];
                nArray[z.lIIIIlllII[10]] = lIIIIlllII[26];
                nArray[z.lIIIIlllII[11]] = lIIIIlllII[18];
                nArray[z.lIIIIlllII[13]] = lIIIIlllII[14];
                nArray[z.lIIIIlllII[20]] = lIIIIlllII[16];
                nArray[z.lIIIIlllII[27]] = lIIIIlllII[28];
                nArray[z.lIIIIlllII[29]] = lIIIIlllII[30];
                nArray[z.lIIIIlllII[15]] = lIIIIlllII[17];
                nArray[z.lIIIIlllII[31]] = lIIIIlllII[32];
                nArray[z.lIIIIlllII[33]] = lIIIIlllII[19];
                if (z.lllIIlIllIll(e.d(nArray) ? 1 : 0)) {
                    z.Q();
                    System.out.println(lIIIIlIlII[lIIIIlllII[27]]);
                    bv = lIIIIlllII[0];
                    return;
                }
                int[] nArray8 = new int[lIIIIlllII[21]];
                nArray8[z.lIIIIlllII[1]] = lIIIIlllII[22];
                nArray8[z.lIIIIlllII[0]] = lIIIIlllII[23];
                nArray8[z.lIIIIlllII[7]] = lIIIIlllII[24];
                nArray8[z.lIIIIlllII[9]] = lIIIIlllII[25];
                nArray8[z.lIIIIlllII[10]] = lIIIIlllII[26];
                nArray8[z.lIIIIlllII[11]] = lIIIIlllII[18];
                nArray8[z.lIIIIlllII[13]] = lIIIIlllII[14];
                nArray8[z.lIIIIlllII[20]] = lIIIIlllII[16];
                nArray8[z.lIIIIlllII[27]] = lIIIIlllII[28];
                nArray8[z.lIIIIlllII[29]] = lIIIIlllII[30];
                nArray8[z.lIIIIlllII[15]] = lIIIIlllII[17];
                nArray8[z.lIIIIlllII[31]] = lIIIIlllII[32];
                nArray8[z.lIIIIlllII[33]] = lIIIIlllII[19];
                if (z.lllIIlIIlIll(e.d(nArray8) ? 1 : 0)) {
                    a.a(lIIIIlllII[22], lIIIIlllII[15]);
                    a.a(lIIIIlllII[25], lIIIIlllII[0]);
                    a.a(lIIIIlllII[26], lIIIIlllII[0]);
                    a.a(lIIIIlllII[23], lIIIIlllII[15]);
                    a.a(lIIIIlllII[34], lIIIIlllII[0]);
                    a.a(lIIIIlllII[35], lIIIIlllII[13]);
                    a.a(lIIIIlllII[17], lIIIIlllII[7]);
                    a.a(lIIIIlllII[36], lIIIIlllII[9]);
                    a.a(lIIIIlllII[24], lIIIIlllII[0]);
                    a.a(lIIIIlllII[19], lIIIIlllII[15]);
                }
            }
            if (z.lllIIlIIlIll(Inventory.contains((int[])f.bc) ? 1 : 0) && z.lllIIlIIllII(Movement.getRunEnergy(), lIIIIlllII[6])) {
                Inventory.getFirst((int[])f.bc).interact(lIIIIlIlII[lIIIIlllII[29]]);
                Time.sleepTicks((int)lIIIIlllII[0]);
                0;
            }
            if (z.lllIIlIIlIll(Inventory.contains((int[])f.aZ) ? 1 : 0) && z.lllIIlIIllII(Prayers.getPoints(), lIIIIlllII[37])) {
                Inventory.getFirst((int[])f.aZ).interact(lIIIIlIlII[lIIIIlllII[15]]);
            }
            if (z.lllIIlIlllll(z.lllIIlIIlIlI(e.w(), 60.0))) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[31]];
                if (z.lllIIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIlllII[0]];
                    stringArray2[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[33]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIlIlII[lIIIIlllII[21]]);
                    Time.sleepTicks((int)lIIIIlllII[7]);
                    0;
                }
            }
            if (z.lllIIlIIlIll(e.s() ? 1 : 0) && z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[301]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[300]])).interact(lIIIIlIlII[lIIIIlllII[38]]);
                Time.sleepTicks((int)lIIIIlllII[7]);
                0;
            }
            if (z.lllIIlIllIll(e.j(dL)) && z.lllIIlIIlIll(z.an() ? 1 : 0)) {
                if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[39]];
                    if (z.lllIIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dg);
                    0;
                    Time.sleepTicks((int)lIIIIlllII[0]);
                    0;
                }
                if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                    g.a(lIIIIlIlII[lIIIIlllII[40]], cG, lIIIIlllII[0]);
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[15])) {
                dk = lIIIIlllII[1];
                if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[41]];
                    if (z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[299]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[298]])).interact(lIIIIlIlII[lIIIIlllII[42]]);
                    }
                    if (z.lllIIlIIlIll(Equipment.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[297]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[296]])).interact(lIIIIlIlII[lIIIIlllII[43]]);
                        Time.sleepTicks((int)lIIIIlllII[13]);
                        0;
                    }
                }
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[44]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray))) {
                    L.cp();
                }
                String[] stringArray3 = new String[lIIIIlllII[0]];
                stringArray3[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[45]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray3))) {
                    g.a(lIIIIlIlII[lIIIIlllII[46]], cG);
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[39])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[47]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[37]];
                    String[] stringArray4 = new String[lIIIIlllII[0]];
                    stringArray4[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[48]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIIlIlII[lIIIIlllII[49]]);
                    Time.sleepTicks((int)lIIIIlllII[9]);
                    0;
                }
                String[] stringArray5 = new String[lIIIIlllII[0]];
                stringArray5[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[50]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray5))) {
                    if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[51], lIIIIlllII[52], lIIIIlllII[7]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[53]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);
                                0;
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[54]];
                                String[] stringArray6 = new String[lIIIIlllII[0]];
                                stringArray6[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[3]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIIIIlIlII[lIIIIlllII[8]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);
                                0;
                            }
                        }
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                            g.a(lIIIIlIlII[lIIIIlllII[55]], cG);
                        }
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[48])) {
                if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                    if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[56]];
                        String[] stringArray = new String[lIIIIlllII[0]];
                        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[57]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlII[lIIIIlllII[58]]);
                        Time.sleepTicks((int)lIIIIlllII[10]);
                        0;
                    }
                    if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                        llIllIIIllll = new WorldPoint(lIIIIlllII[59], lIIIIlllII[60], lIIIIlllII[7]);
                        if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[9])) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[61]];
                            Movement.walkTo((WorldPoint)llIllIIIllll);
                            0;
                            Time.sleepTicks((int)lIIIIlllII[0]);
                            0;
                        }
                        if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[9])) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[62]];
                            String[] stringArray = new String[lIIIIlllII[0]];
                            stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[63]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlII[lIIIIlllII[64]]);
                            Time.sleepTicks((int)lIIIIlllII[9]);
                            0;
                        }
                    }
                }
                if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[65]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray))) {
                        llIllIIIllll = new WorldArea(lIIIIlllII[66], lIIIIlllII[67], lIIIIlllII[44], lIIIIlllII[43], lIIIIlllII[1]);
                        if (z.lllIIlIIlIll(llIllIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[68]];
                            llIllIIIlllI = new WorldPoint(lIIIIlllII[69], lIIIIlllII[70], lIIIIlllII[1]);
                            Movement.walkTo((WorldPoint)llIllIIIlllI);
                            0;
                            Time.sleepTicks((int)lIIIIlllII[0]);
                            0;
                        }
                        if (z.lllIIlIllIll(llIllIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            L.cp();
                        }
                    }
                }
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[71]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    g.a(lIIIIlIlII[lIIIIlllII[72]], cG);
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[3])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[73];
                if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[74]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                        int[] nArray9 = new int[lIIIIlllII[0]];
                        nArray9[z.lIIIIlllII[1]] = lIIIIlllII[23];
                        if (z.lllIIlIIlIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[75]];
                            int[] nArray10 = new int[lIIIIlllII[0]];
                            nArray10[z.lIIIIlllII[1]] = lIIIIlllII[23];
                            Inventory.getFirst((int[])nArray10).interact(lIIIIlIlII[lIIIIlllII[76]]);
                            Time.sleepTicks((int)lIIIIlllII[13]);
                            0;
                        }
                    }
                    String[] stringArray7 = new String[lIIIIlllII[0]];
                    stringArray7[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[77]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray7))) {
                        String[] stringArray8 = new String[lIIIIlllII[0]];
                        stringArray8[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[78]];
                        if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray8))) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[79], lIIIIlllII[80], lIIIIlllII[1]);
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[81]];
                            Movement.walkTo((WorldPoint)llIllIIIllll);
                            0;
                            Time.sleepTicks((int)lIIIIlllII[0]);
                            0;
                        }
                    }
                    String[] stringArray9 = new String[lIIIIlllII[0]];
                    stringArray9[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[6]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray9))) {
                        if (z.lllIIlIllIll(dP ? 1 : 0) && z.lllIIlIllIll(dQ ? 1 : 0)) {
                            g.a(lIIIIlIlII[lIIIIlllII[82]], cG);
                        }
                        if (z.lllIIlIllIll(dP ? 1 : 0)) {
                            String[] stringArray10 = new String[lIIIIlllII[0]];
                            stringArray10[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[84]];
                            g.a(lIIIIlIlII[lIIIIlllII[83]], stringArray10);
                        }
                        if (z.lllIIlIIlIll(dP ? 1 : 0) && z.lllIIlIllIll(dQ ? 1 : 0)) {
                            String[] stringArray11 = new String[lIIIIlllII[0]];
                            stringArray11[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[86]];
                            g.a(lIIIIlIlII[lIIIIlllII[85]], stringArray11);
                        }
                        if (z.lllIIlIIlIll(dQ ? 1 : 0) && z.lllIIlIIlIll(dP ? 1 : 0)) {
                            int[] nArray11 = new int[lIIIIlllII[0]];
                            nArray11[z.lIIIIlllII[1]] = lIIIIlllII[26];
                            if (z.lllIIlIIlIll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIIIlllII[0]];
                                nArray12[z.lIIIIlllII[1]] = lIIIIlllII[26];
                                int[] nArray13 = new int[lIIIIlllII[0]];
                                nArray13[z.lIIIIlllII[1]] = lIIIIlllII[25];
                                Inventory.getFirst((int[])nArray12).useOn(Inventory.getFirst((int[])nArray13));
                            }
                            int[] nArray14 = new int[lIIIIlllII[0]];
                            nArray14[z.lIIIIlllII[1]] = lIIIIlllII[87];
                            if (z.lllIIlIIlIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[lIIIIlllII[0]];
                                nArray15[z.lIIIIlllII[1]] = lIIIIlllII[87];
                                String[] stringArray12 = new String[lIIIIlllII[0]];
                                stringArray12[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[88]];
                                Inventory.getFirst((int[])nArray15).useOn(TileObjects.getNearest((String[])stringArray12));
                            }
                        }
                    }
                }
                int[] nArray16 = new int[lIIIIlllII[0]];
                nArray16[z.lIIIIlllII[1]] = lIIIIlllII[73];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[89]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[90]];
                        if (z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[295]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[294]])).interact(lIIIIlIlII[lIIIIlllII[91]]);
                        }
                        if (z.lllIIlIIlIll(Equipment.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[293]])) ? 1 : 0)) {
                            Equipment.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[292]])).interact(lIIIIlIlII[lIIIIlllII[92]]);
                            Time.sleepTicks((int)lIIIIlllII[13]);
                            0;
                        }
                    }
                    String[] stringArray13 = new String[lIIIIlllII[0]];
                    stringArray13[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[93]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray13))) {
                        L.cp();
                    }
                    String[] stringArray14 = new String[lIIIIlllII[0]];
                    stringArray14[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[94]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray14))) {
                        g.a(lIIIIlIlII[lIIIIlllII[95]], cG);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[6])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[96]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[97]];
                    String[] stringArray15 = new String[lIIIIlllII[0]];
                    stringArray15[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[98]];
                    TileObjects.getNearest((String[])stringArray15).interact(lIIIIlIlII[lIIIIlllII[99]]);
                    Time.sleepTicks((int)lIIIIlllII[9]);
                    0;
                }
                String[] stringArray16 = new String[lIIIIlllII[0]];
                stringArray16[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[100]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray16))) {
                    if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[51], lIIIIlllII[101], lIIIIlllII[7]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[102]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);
                                0;
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[103]];
                                String[] stringArray17 = new String[lIIIIlllII[0]];
                                stringArray17[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[104]];
                                TileObjects.getNearest((String[])stringArray17).interact(lIIIIlIlII[lIIIIlllII[105]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);
                                0;
                            }
                        }
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0]) && z.lllIIlIlllIl(llIllIIIllll = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[290]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIlllII[0]];
                                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[291]];
                                if (z.lllIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIIlllII[0];
                                    0;
                                    if (-3 < 0) return n2 != 0;
                                    return ((146 + 183 - 315 + 201 ^ 144 + 120 - 236 + 117) & (0x11 ^ 0x1E ^ (0x51 ^ 0x18) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIIIlllII[1];
                            return n2 != 0;
                        }))) {
                            if (z.lllIIlIllIll(Reachable.isInteractable((Locatable)llIllIIIllll) ? 1 : 0)) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[106]];
                                Movement.walkTo((WorldPoint)llIllIIIllll.getWorldLocation());
                                0;
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            if (z.lllIIlIIlIll(Reachable.isInteractable((Locatable)llIllIIIllll) ? 1 : 0)) {
                                llIllIIIllll.interact(lIIIIlIlII[lIIIIlllII[107]]);
                                Time.sleepTicks((int)lIIIIlllII[7]);
                                0;
                            }
                        }
                        if (z.lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (z.lllIIlIlllll(z.lllIIlIIlIlI(e.w(), 100.0))) {
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    String[] stringArray18 = new String[lIIIIlllII[0]];
                                    stringArray18[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[108]];
                                    Inventory.getFirst((String[])stringArray18).interact(lIIIIlIlII[lIIIIlllII[109]]);
                                    Time.sleepTicks((int)lIIIIlllII[0]);
                                    0;
                                }
                            }
                            if (z.lllIIllIIlII(Prayers.getPoints(), Skills.getLevel((Skill)Skill.PRAYER)) && z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[289]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[288]])).interact(lIIIIlIlII[lIIIIlllII[110]]);
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            llIllIIIllll = new WorldPoint(lIIIIlllII[111], lIIIIlllII[112], lIIIIlllII[1]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[15])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[113]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);
                                0;
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[15])) {
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[73];
                                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[114]];
                                    int[] nArray17 = new int[lIIIIlllII[0]];
                                    nArray17[z.lIIIIlllII[1]] = lIIIIlllII[73];
                                    String[] stringArray19 = new String[lIIIIlllII[0]];
                                    stringArray19[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[115]];
                                    Inventory.getFirst((int[])nArray17).useOn(TileObjects.getNearest((String[])stringArray19));
                                    Time.sleepTicks((int)lIIIIlllII[9]);
                                    0;
                                }
                            }
                        }
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[92])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[116];
                if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (z.lllIIlIllIll(z.bn() ? 1 : 0)) {
                        z.bm();
                    }
                    if (z.lllIIlIIlIll(z.bn() ? 1 : 0)) {
                        llIllIIIllll = new WorldPoint(lIIIIlllII[117], lIIIIlllII[118], lIIIIlllII[1]);
                        if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[11])) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[119]];
                            Movement.walkTo((WorldPoint)llIllIIIllll);
                            0;
                            Time.sleepTicks((int)lIIIIlllII[0]);
                            0;
                        }
                        if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[11])) {
                            String[] stringArray = new String[lIIIIlllII[0]];
                            stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[121]];
                            g.a(lIIIIlIlII[lIIIIlllII[120]], stringArray);
                        }
                    }
                }
                int[] nArray18 = new int[lIIIIlllII[0]];
                nArray18[z.lIIIIlllII[1]] = lIIIIlllII[116];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[122]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[123]];
                        if (z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[287]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[286]])).interact(lIIIIlIlII[lIIIIlllII[124]]);
                        }
                        if (z.lllIIlIIlIll(Equipment.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[285]])) ? 1 : 0)) {
                            Equipment.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[284]])).interact(lIIIIlIlII[lIIIIlllII[125]]);
                            Time.sleepTicks((int)lIIIIlllII[13]);
                            0;
                        }
                    }
                    String[] stringArray20 = new String[lIIIIlllII[0]];
                    stringArray20[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[126]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray20))) {
                        L.cp();
                    }
                    String[] stringArray21 = new String[lIIIIlllII[0]];
                    stringArray21[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[127]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray21))) {
                        g.a(lIIIIlIlII[lIIIIlllII[128]], cG);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[103])) {
                g.a(new String[lIIIIlllII[1]]);
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[115])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[129]];
                if (z.lllIIlIllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray22 = new String[lIIIIlllII[0]];
                    stringArray22[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[130]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray22))) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[131]];
                        String[] stringArray23 = new String[lIIIIlllII[0]];
                        stringArray23[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[132]];
                        TileObjects.getNearest((String[])stringArray23).interact(lIIIIlIlII[lIIIIlllII[133]]);
                        Time.sleepTicks((int)lIIIIlllII[10]);
                        0;
                    }
                    int[] nArray = new int[lIIIIlllII[0]];
                    nArray[z.lIIIIlllII[1]] = lIIIIlllII[134];
                    if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray19 = new int[lIIIIlllII[0]];
                        nArray19[z.lIIIIlllII[1]] = lIIIIlllII[135];
                        if (z.lllIIlIllIll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                            String[] stringArray24 = new String[lIIIIlllII[0]];
                            stringArray24[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[136]];
                            if (z.lllIIlIllIll(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[137]];
                                String[] stringArray25 = new String[lIIIIlllII[0]];
                                stringArray25[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[138]];
                                NPCs.getNearest((String[])stringArray25).interact(lIIIIlIlII[lIIIIlllII[30]]);
                                Time.sleepTicks((int)lIIIIlllII[9]);
                                0;
                            }
                            String[] stringArray26 = new String[lIIIIlllII[0]];
                            stringArray26[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[139]];
                            if (z.lllIIlIIlIll(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                                if (z.lllIIllIIIll(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[283]]) ? 1 : 0) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[140], lIIIIlllII[141], lIIIIlllII[1])), lIIIIlllII[15])) {
                                        n2 = lIIIIlllII[0];
                                        0;
                                        
                                        }
                                    } else {
                                        n2 = lIIIIlllII[1];
                                    }
                                    return n2 != 0;
                                }))) {
                                    llIllIIIllll = new WorldPoint(lIIIIlllII[140], lIIIIlllII[141], lIIIIlllII[1]);
                                    if (z.lllIIlIllIll(Players.getLocal().getWorldLocation().equals((Object)llIllIIIllll) ? 1 : 0)) {
                                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[142]];
                                        Movement.walkTo((WorldPoint)llIllIIIllll);
                                        0;
                                        Time.sleepTicks((int)lIIIIlllII[0]);
                                        0;
                                    }
                                    if (z.lllIIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIllIIIllll) ? 1 : 0)) {
                                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[143]];
                                        String[] stringArray27 = new String[lIIIIlllII[0]];
                                        stringArray27[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[144]];
                                        String[] stringArray28 = new String[lIIIIlllII[0]];
                                        stringArray28[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[145]];
                                        Inventory.getFirst((String[])stringArray27).useOn(Inventory.getFirst((String[])stringArray28));
                                        Time.sleepTicks((int)lIIIIlllII[11]);
                                        0;
                                    }
                                }
                                if (z.lllIIlIlllIl(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[282]]) ? 1 : 0) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[140], lIIIIlllII[141], lIIIIlllII[1])), lIIIIlllII[15])) {
                                        n2 = lIIIIlllII[0];
                                        0;
                                        if (-1 > 0) {
                                            return ((0x58 ^ 0x3F ^ (0x1F ^ 0x26)) & (81 + 218 - 124 + 70 ^ 63 + 119 - 135 + 124 ^ -1) & ((125 + 62 - 97 + 89 ^ 132 + 41 - 80 + 54) & (0xC4 ^ 0x8E ^ (0x5B ^ 0x31) ^ -1) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = lIIIIlllII[1];
                                    }
                                    return n2 != 0;
                                }))) {
                                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[146]];
                                    String[] stringArray29 = new String[lIIIIlllII[0]];
                                    stringArray29[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[147]];
                                    String[] stringArray30 = new String[lIIIIlllII[0]];
                                    stringArray30[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[148]];
                                    Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                    Time.sleepTicks((int)lIIIIlllII[9]);
                                    0;
                                }
                            }
                        }
                        int[] nArray20 = new int[lIIIIlllII[0]];
                        nArray20[z.lIIIIlllII[1]] = lIIIIlllII[135];
                        if (z.lllIIlIIlIll(Inventory.contains((int[])nArray20) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[149]];
                            int[] nArray21 = new int[lIIIIlllII[0]];
                            nArray21[z.lIIIIlllII[1]] = lIIIIlllII[135];
                            int[] nArray22 = new int[lIIIIlllII[0]];
                            nArray22[z.lIIIIlllII[1]] = lIIIIlllII[28];
                            Inventory.getFirst((int[])nArray21).useOn(Inventory.getFirst((int[])nArray22));
                            Time.sleepTicks((int)lIIIIlllII[7]);
                            0;
                        }
                    }
                    int[] nArray23 = new int[lIIIIlllII[0]];
                    nArray23[z.lIIIIlllII[1]] = lIIIIlllII[134];
                    if (z.lllIIlIIlIll(Inventory.contains((int[])nArray23) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[150]];
                        int[] nArray24 = new int[lIIIIlllII[0]];
                        nArray24[z.lIIIIlllII[1]] = lIIIIlllII[134];
                        int[] nArray25 = new int[lIIIIlllII[0]];
                        nArray25[z.lIIIIlllII[1]] = lIIIIlllII[30];
                        Inventory.getFirst((int[])nArray24).useOn(Inventory.getFirst((int[])nArray25));
                        Time.sleepTicks((int)lIIIIlllII[7]);
                        0;
                    }
                }
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[151];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray31 = new String[lIIIIlllII[0]];
                    stringArray31[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[152]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray31))) {
                        L.cp();
                    }
                    String[] stringArray32 = new String[lIIIIlllII[0]];
                    stringArray32[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[153]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray32))) {
                        g.a(lIIIIlIlII[lIIIIlllII[154]], cG);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[123])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[155]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[156]];
                    String[] stringArray33 = new String[lIIIIlllII[0]];
                    stringArray33[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[157]];
                    TileObjects.getNearest((String[])stringArray33).interact(lIIIIlIlII[lIIIIlllII[158]]);
                    Time.sleepTicks((int)lIIIIlllII[10]);
                    0;
                }
                String[] stringArray34 = new String[lIIIIlllII[0]];
                stringArray34[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[159]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray34))) {
                    if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[51], lIIIIlllII[101], lIIIIlllII[7]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[160]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);
                                0;
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[161]];
                                String[] stringArray35 = new String[lIIIIlllII[0]];
                                stringArray35[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[162]];
                                TileObjects.getNearest((String[])stringArray35).interact(lIIIIlIlII[lIIIIlllII[163]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);
                                0;
                            }
                        }
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0]) && z.lllIIlIlllIl(llIllIIIllll = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[280]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIlllII[0]];
                                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[281]];
                                if (z.lllIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIIlllII[0];
                                    0;
                                    if (3 != (0x56 ^ 0x63 ^ (0x7D ^ 0x4C))) return n2 != 0;
                                    return ((152 + 175 - 178 + 32 ^ 130 + 27 - 54 + 40) & (0x3D ^ 9 ^ (0xD ^ 3) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIIIlllII[1];
                            return n2 != 0;
                        }))) {
                            if (z.lllIIlIllIll(Reachable.isInteractable((Locatable)llIllIIIllll) ? 1 : 0)) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[164]];
                                Movement.walkTo((WorldPoint)llIllIIIllll.getWorldLocation());
                                0;
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            if (z.lllIIlIIlIll(Reachable.isInteractable((Locatable)llIllIIIllll) ? 1 : 0)) {
                                llIllIIIllll.interact(lIIIIlIlII[lIIIIlllII[165]]);
                                Time.sleepTicks((int)lIIIIlllII[7]);
                                0;
                            }
                        }
                        if (z.lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (z.lllIIlIlllll(z.lllIIlIIlIlI(e.w(), 100.0))) {
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lIIIIlllII[0]];
                                    stringArray36[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[166]];
                                    Inventory.getFirst((String[])stringArray36).interact(lIIIIlIlII[lIIIIlllII[167]]);
                                    Time.sleepTicks((int)lIIIIlllII[0]);
                                    0;
                                }
                            }
                            if (z.lllIIllIIlII(Prayers.getPoints(), Skills.getLevel((Skill)Skill.PRAYER)) && z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[279]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[278]])).interact(lIIIIlIlII[lIIIIlllII[168]]);
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            llIllIIIllll = new WorldPoint(lIIIIlllII[111], lIIIIlllII[112], lIIIIlllII[1]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[15])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[169]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);
                                0;
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[15])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[170]];
                                String[] stringArray37 = new String[lIIIIlllII[0]];
                                stringArray37[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[171]];
                                TileObjects.getNearest((String[])stringArray37).interact(lIIIIlIlII[lIIIIlllII[172]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);
                                0;
                            }
                        }
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[124])) {
                TileObject llIllIIIllIl;
                llIllIIIllll = new WorldArea(lIIIIlllII[173], lIIIIlllII[174], lIIIIlllII[72], lIIIIlllII[47], lIIIIlllII[1]);
                if (z.lllIIlIIlIll(llIllIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    llIllIIIlllI = new WorldPoint(lIIIIlllII[175], lIIIIlllII[176], lIIIIlllII[1]);
                    if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(llIllIIIlllI), lIIIIlllII[11])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[177]];
                        Movement.walkTo((WorldPoint)llIllIIIlllI);
                        0;
                        Time.sleepTicks((int)lIIIIlllII[0]);
                        0;
                    }
                    if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(llIllIIIlllI), lIIIIlllII[11])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[178]];
                        String[] stringArray = new String[lIIIIlllII[0]];
                        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[179]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlII[lIIIIlllII[180]]);
                        Time.sleepTicks((int)lIIIIlllII[9]);
                        0;
                    }
                }
                if (z.lllIIlIIlIll((llIllIIIlllI = new WorldArea(lIIIIlllII[181], lIIIIlllII[182], lIIIIlllII[53], lIIIIlllII[42], lIIIIlllII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.lllIIlIlllIl(llIllIIIllIl = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[276]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIlllII[0]];
                        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[277]];
                        if (z.lllIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIIIIlllII[0];
                            0;
                            if (null == null) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIIIIlllII[1];
                    return n2 != 0;
                }))) {
                    if (z.lllIIlIllIll(Reachable.isInteractable((Locatable)llIllIIIllIl) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[183]];
                        Movement.walkTo((WorldPoint)llIllIIIllIl.getWorldLocation());
                        0;
                        Time.sleepTicks((int)lIIIIlllII[0]);
                        0;
                    }
                    if (z.lllIIlIIlIll(Reachable.isInteractable((Locatable)llIllIIIllIl) ? 1 : 0)) {
                        llIllIIIllIl.interact(lIIIIlIlII[lIIIIlllII[184]]);
                        Time.sleepTicks((int)lIIIIlllII[7]);
                        0;
                    }
                }
                if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[185]];
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[186]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlII[lIIIIlllII[187]]);
                    Time.sleepTicks((int)lIIIIlllII[10]);
                    0;
                }
                if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[188]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray))) {
                        llIllIIIllIl = new WorldArea(lIIIIlllII[66], lIIIIlllII[67], lIIIIlllII[44], lIIIIlllII[43], lIIIIlllII[1]);
                        if (z.lllIIlIIlIll(llIllIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[189]];
                            WorldPoint llIllIIIllII = new WorldPoint(lIIIIlllII[69], lIIIIlllII[70], lIIIIlllII[1]);
                            Movement.walkTo((WorldPoint)llIllIIIllII);
                            0;
                            Time.sleepTicks((int)lIIIIlllII[0]);
                            0;
                        }
                        if (z.lllIIlIllIll(llIllIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            L.cp();
                        }
                    }
                    String[] stringArray38 = new String[lIIIIlllII[0]];
                    stringArray38[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[190]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray38))) {
                        g.a(lIIIIlIlII[lIIIIlllII[191]], cG);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[125])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[192]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[193]];
                    String[] stringArray39 = new String[lIIIIlllII[0]];
                    stringArray39[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[194]];
                    TileObjects.getNearest((String[])stringArray39).interact(lIIIIlIlII[lIIIIlllII[195]]);
                    Time.sleepTicks((int)lIIIIlllII[9]);
                    0;
                }
                String[] stringArray40 = new String[lIIIIlllII[0]];
                stringArray40[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[196]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray40))) {
                    if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[51], lIIIIlllII[52], lIIIIlllII[7]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[197]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);
                                0;
                                Time.sleepTicks((int)lIIIIlllII[0]);
                                0;
                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[198]];
                                String[] stringArray41 = new String[lIIIIlllII[0]];
                                stringArray41[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[199]];
                                TileObjects.getNearest((String[])stringArray41).interact(lIIIIlIlII[lIIIIlllII[200]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);
                                0;
                            }
                        }
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                            g.a(lIIIIlIlII[lIIIIlllII[201]], cG);
                        }
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[128])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[202];
                if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (z.lllIIlIllIll(dR ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIlllII[0]];
                        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[204]];
                        g.a(lIIIIlIlII[lIIIIlllII[203]], stringArray);
                    }
                    if (z.lllIIlIIlIll(dR ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[205]];
                        llIllIIIllll = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIllIIIlI(tileObject.getId(), lIIIIlllII[275]) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[273], lIIIIlllII[274], lIIIIlllII[0])), lIIIIlllII[7])) {
                                n2 = lIIIIlllII[0];
                                0;
                                
                                }
                            } else {
                                n2 = lIIIIlllII[1];
                            }
                            return n2 != 0;
                        });
                        if (z.lllIIlIlllIl(llIllIIIllll)) {
                            String[] stringArray = new String[lIIIIlllII[0]];
                            stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[206]];
                            if (z.lllIIlIIlIll(llIllIIIllll.hasAction(stringArray) ? 1 : 0)) {
                                llIllIIIllll.interact(lIIIIlIlII[lIIIIlllII[207]]);
                                Time.sleepTicks((int)lIIIIlllII[9]);
                                0;
                            }
                        }
                        if (z.lllIIlIlllIl(TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIllIIIlI(tileObject.getId(), lIIIIlllII[272]) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[273], lIIIIlllII[274], lIIIIlllII[0])), lIIIIlllII[7])) {
                                n2 = lIIIIlllII[0];
                                0;
                                if (((32 + 150 - 177 + 166 ^ 135 + 10 - 93 + 103) & (0xA0 ^ 0xA5 ^ (0x4D ^ 0x78) ^ -1)) == -1) {
                                    return ((1 ^ (0x91 ^ 0x97)) & (0xF8 ^ 0xA0 ^ (0xEF ^ 0xB0) ^ -1)) != 0;
                                }
                            } else {
                                n2 = lIIIIlllII[1];
                            }
                            return n2 != 0;
                        }))) {
                            TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (z.lllIIllIIIlI(tileObject.getId(), lIIIIlllII[272]) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[273], lIIIIlllII[274], lIIIIlllII[0])), lIIIIlllII[7])) {
                                    n2 = lIIIIlllII[0];
                                    0;
                                    
                                    }
                                } else {
                                    n2 = lIIIIlllII[1];
                                }
                                return n2 != 0;
                            }).interact(lIIIIlIlII[lIIIIlllII[208]]);
                            Time.sleepTicks((int)lIIIIlllII[9]);
                            0;
                        }
                    }
                }
                int[] nArray26 = new int[lIIIIlllII[0]];
                nArray26[z.lIIIIlllII[1]] = lIIIIlllII[202];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray26) ? 1 : 0)) {
                    if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[209]];
                        TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[270]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIlllII[0]];
                                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[271]];
                                if (z.lllIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIIlllII[0];
                                    0;
                                    if (3 >= 0) return n2 != 0;
                                    return false;
                                }
                            }
                            n2 = lIIIIlllII[1];
                            return n2 != 0;
                        }).interact(lIIIIlIlII[lIIIIlllII[210]]);
                        Time.sleepTicks((int)lIIIIlllII[9]);
                        0;
                    }
                    if (z.lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                        z.bl();
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[139])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[211];
                if (z.lllIIlIIllII(Inventory.getAll((int[])nArray).size(), lIIIIlllII[9]) && z.lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                    z.bl();
                }
                int[] nArray27 = new int[lIIIIlllII[0]];
                nArray27[z.lIIIIlllII[1]] = lIIIIlllII[211];
                if (z.lllIIlIlllII(Inventory.getAll((int[])nArray27).size(), lIIIIlllII[9])) {
                    if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[212]];
                        if (z.lllIIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dg);
                        0;
                        Time.sleepTicks((int)lIIIIlllII[0]);
                        0;
                    }
                    if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                        if (z.lllIIlIIllII(dk, lIIIIlllII[0])) {
                            as.nH += lIIIIlllII[0];
                            as.u(AccBuilderGWD.m);
                            dk += lIIIIlllII[0];
                            as.nH = lIIIIlllII[1];
                        }
                        g.a(lIIIIlIlII[lIIIIlllII[213]], cG, lIIIIlllII[0]);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[152]) && z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[22];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray28 = new int[lIIIIlllII[0]];
                    nArray28[z.lIIIIlllII[1]] = lIIIIlllII[22];
                    Inventory.getFirst((int[])nArray28).interact(lIIIIlIlII[lIIIIlllII[214]]);
                    Time.sleepTicks((int)lIIIIlllII[13]);
                    0;
                }
            }
        }
    }

    private static boolean lllIIllIIIII(int n2, int n3) {
        return n2 > n3;
    }
}

