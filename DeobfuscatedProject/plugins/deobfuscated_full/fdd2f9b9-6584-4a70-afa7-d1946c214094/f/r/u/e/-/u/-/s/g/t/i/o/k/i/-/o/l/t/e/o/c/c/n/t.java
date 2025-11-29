/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
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
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.R;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
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
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class t
implements G {
    static /* synthetic */ boolean cI;
    private static /* synthetic */ WorldPoint cJ;
    static /* synthetic */ int ck;
    private static /* synthetic */ int[] lIIllllIII;
    private static /* synthetic */ WorldPoint cM;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ WorldPoint cg;
    private static /* synthetic */ String[] lIIlllIllI;
    static /* synthetic */ String[] bR;
    private static /* synthetic */ int cO;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ WorldPoint cN;
    private static /* synthetic */ WorldPoint cL;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ WorldArea cH;
    private static /* synthetic */ WorldPoint cK;

    private static boolean lIIIIlIlIllII(Object object) {
        return object != null;
    }

    @Override
    public String U() {
        return lIIlllIllI[lIIllllIII[63]];
    }

    private static void lIIIIlIlIIllI() {
        lIIlllIllI = new String[lIIllllIII[86]];
        t.lIIlllIllI[t.lIIllllIII[2]] = t."Finished buying items, switching back to quest";
        t.lIIlllIllI[t.lIIllllIII[1]] = t."Fishing pass";
        t.lIIlllIllI[t.lIIllllIII[3]] = t."Nav to bank";
        t.lIIlllIllI[t.lIIllllIII[5]] = t."Handling banking";
        t.lIIlllIllI[t.lIIllllIII[6]] = t."We are missing quest supplies, switching to BUYING";
        t.lIIlllIllI[t.lIIllllIII[13]] = t."Drink";
        t.lIIlllIllI[t.lIIllllIII[15]] = t."Nav to start";
        t.lIIlllIllI[t.lIIllllIII[7]] = t."Starting quest";
        t.lIIlllIllI[t.lIIllllIII[22]] = t."Vestri";
        t.lIIlllIllI[t.lIIllllIII[23]] = t."Fishing trophy";
        t.lIIlllIllI[t.lIIllllIII[0]] = t."Red vine worm";
        t.lIIlllIllI[t.lIIllllIII[24]] = t."Nav to vine";
        t.lIIlllIllI[t.lIIllllIII[21]] = t."Digging";
        t.lIIlllIllI[t.lIIllllIII[25]] = t."Red vine worm";
        t.lIIlllIllI[t.lIIllllIII[26]] = t."Vine";
        t.lIIlllIllI[t.lIIllllIII[27]] = t."Vine";
        t.lIIlllIllI[t.lIIllllIII[28]] = t."Check";
        t.lIIlllIllI[t.lIIllllIII[29]] = t."Red vine worm";
        t.lIIlllIllI[t.lIIllllIII[30]] = t."Nav to contest";
        t.lIIlllIllI[t.lIIllllIII[31]] = t."Garlic";
        t.lIIlllIllI[t.lIIllllIII[32]] = t."Using garlic";
        t.lIIlllIllI[t.lIIllllIII[33]] = t."Wall Pipe";
        t.lIIlllIllI[t.lIIllllIII[34]] = t."Wall Pipe";
        t.lIIlllIllI[t.lIIllllIII[35]] = t."Garlic";
        t.lIIlllIllI[t.lIIllllIII[36]] = t."Wall Pipe";
        t.lIIlllIllI[t.lIIllllIII[37]] = t."Garlic";
        t.lIIlllIllI[t.lIIllllIII[38]] = t."Start contest";
        t.lIIlllIllI[t.lIIllllIII[20]] = t."Bonzo";
        t.lIIlllIllI[t.lIIllllIII[39]] = t."I might still be able to find a bigger fish";
        t.lIIlllIllI[t.lIIllllIII[40]] = t."Garlic";
        t.lIIlllIllI[t.lIIllllIII[41]] = t."Raw giant carp";
        t.lIIlllIllI[t.lIIllllIII[42]] = t."Fishing";
        t.lIIlllIllI[t.lIIllllIII[44]] = t."Bait";
        t.lIIlllIllI[t.lIIllllIII[45]] = t."Raw giant carp";
        t.lIIlllIllI[t.lIIllllIII[46]] = t."Handing in fish";
        t.lIIlllIllI[t.lIIllllIII[47]] = t."Bonzo";
        t.lIIlllIllI[t.lIIllllIII[48]] = t."Fishing trophy";
        t.lIIlllIllI[t.lIIllllIII[49]] = t."Nav to start";
        t.lIIlllIllI[t.lIIllllIII[50]] = t."Finishing quest";
        t.lIIlllIllI[t.lIIllllIII[51]] = t."Vestri";
        t.lIIlllIllI[t.lIIllllIII[52]] = t."Camelot teleport";
        t.lIIlllIllI[t.lIIllllIII[53]] = t."Garlic";
        t.lIIlllIllI[t.lIIllllIII[54]] = t."Spade";
        t.lIIlllIllI[t.lIIllllIII[55]] = t."Fishing rod";
        t.lIIlllIllI[t.lIIllllIII[56]] = t."Fishing bait";
        t.lIIlllIllI[t.lIIllllIII[63]] = t."Fishing contest";
        t.lIIlllIllI[t.lIIllllIII[64]] = t."ring of wealth (";
        t.lIIlllIllI[t.lIIllllIII[67]] = t."I was wondering what was down those stairs?";
        t.lIIlllIllI[t.lIIllllIII[68]] = t."Why not?";
        t.lIIlllIllI[t.lIIllllIII[69]] = t."If you were my friend I wouldn't mind it.";
        t.lIIlllIllI[t.lIIllllIII[19]] = t."Well, let's be friends!";
        t.lIIlllIllI[t.lIIllllIII[70]] = t."And how am I meant to do that?";
        t.lIIlllIllI[t.lIIllllIII[71]] = t."I'll enter the competition please.";
        t.lIIlllIllI[t.lIIllllIII[72]] = t."I have this big fish. Is it enough to win?";
        t.lIIlllIllI[t.lIIllllIII[73]] = t."Yes.";
    }

    private static boolean lIIIIlIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIlIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (t.lIIIIlIlIlIIl(e.j(cO), lIIllllIII[13])) {
            bl = lIIllllIII[1];
            0;
            if ((0x98 ^ 0x9C) != (0x28 ^ 0x2C)) {
                return false;
            }
        } else {
            bl = lIIllllIII[2];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIIllllIII[1]];
        nArray[t.lIIllllIII[2]] = lIIllllIII[8];
        if (t.lIIIIlIlIllIl(Inventory.getCount((int[])nArray))) {
            String[] stringArray = new String[lIIllllIII[1]];
            stringArray[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[52]];
            if (t.lIIIIlIlIllIl(Inventory.getCount((String[])stringArray))) {
                String[] stringArray2 = new String[lIIllllIII[1]];
                stringArray2[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[53]];
                if (t.lIIIIlIlIllIl(Inventory.getCount((String[])stringArray2))) {
                    String[] stringArray3 = new String[lIIllllIII[1]];
                    stringArray3[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[54]];
                    if (t.lIIIIlIlIllIl(Inventory.getCount((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIIllllIII[1]];
                        stringArray4[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[55]];
                        if (t.lIIIIlIlIllIl(Inventory.getCount((String[])stringArray4))) {
                            String[] stringArray5 = new String[lIIllllIII[1]];
                            stringArray5[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[56]];
                            if (t.lIIIIlIlIllIl(Inventory.getCount((String[])stringArray5))) {
                                int[] nArray2 = new int[lIIllllIII[1]];
                                nArray2[t.lIIllllIII[2]] = lIIllllIII[17];
                                if (t.lIIIIlIlIllIl(Inventory.getCount((int[])nArray2)) && t.lIIIIlIlIlIlI(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                                    n2 = lIIllllIII[1];
                                    0;
                                    if ((0x27 ^ 0x23) > ((9 ^ 0x56) & ~(0x4E ^ 0x11))) return n2 != 0;
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIllllIII[2];
        return n2 != 0;
    }

    private static void lIIIIlIlIIlll() {
        lIIllllIII = new int[87];
        t.lIIllllIII[0] = 14 + 121 - 53 + 106 ^ 164 + 141 - 218 + 95;
        t.lIIllllIII[1] = 1;
        t.lIIllllIII[2] = (0x12 ^ 0x4C) & ~(0x99 ^ 0xC7);
        t.lIIllllIII[3] = 2;
        t.lIIllllIII[4] = -(0xFFFFFCDC & 0x6737) & (0xFFFFFF9F & 0x77FB);
        t.lIIllllIII[5] = 3;
        t.lIIllllIII[6] = 0x84 ^ 0x80;
        t.lIIllllIII[7] = 9 + 161 - 54 + 52 ^ 134 + 128 - 159 + 72;
        t.lIIllllIII[8] = -(0xFFFFB4BB & 0x6BED) & (0xFFFFBFEF & Short.MAX_VALUE);
        t.lIIllllIII[9] = -(0xFFFFE6E3 & 0x5D1F) & (0xFFFFEFBA & 0x57FF);
        t.lIIllllIII[10] = -(0xFFFFF6FF & 0x7F8D) & (0xFFFFF7BF & Short.MAX_VALUE);
        t.lIIllllIII[11] = 0xFFFFAF3F & 0x51F9;
        t.lIIllllIII[12] = 0xFFFFFE2F & 0x7DE;
        t.lIIllllIII[13] = 0x96 ^ 0x93;
        t.lIIllllIII[14] = 0xFFFFBFFB & 0x5F4E;
        t.lIIllllIII[15] = 0x89 ^ 0x8F;
        t.lIIllllIII[16] = 0xFFFFF1F5 & 0x3F5B;
        t.lIIllllIII[17] = 0xFFFFABFF & 0x57E3;
        t.lIIllllIII[18] = 0xFFFFA7FA & 0x5BED;
        t.lIIllllIII[19] = 0x91 ^ 0xA3;
        t.lIIllllIII[20] = 0x2F ^ 0x20 ^ (0x1A ^ 0xE);
        t.lIIllllIII[21] = 0xB0 ^ 0xBC;
        t.lIIllllIII[22] = 0x74 ^ 0x7C;
        t.lIIllllIII[23] = 0x88 ^ 0x81;
        t.lIIllllIII[24] = 0x86 ^ 0x8D;
        t.lIIllllIII[25] = 0x36 ^ 0x3B;
        t.lIIllllIII[26] = 0xB8 ^ 0xB6;
        t.lIIllllIII[27] = 0xF ^ 0;
        t.lIIllllIII[28] = 4 ^ 0x1F ^ (0xF ^ 4);
        t.lIIllllIII[29] = 0xB0 ^ 0xA1;
        t.lIIllllIII[30] = 0x57 ^ 0x45;
        t.lIIllllIII[31] = 0x10 ^ 0x4E ^ (0xF3 ^ 0xBE);
        t.lIIllllIII[32] = 0x38 ^ 0x2C;
        t.lIIllllIII[33] = 0xA3 ^ 0xB6;
        t.lIIllllIII[34] = 0x7C ^ 0x33 ^ (0xD5 ^ 0x8C);
        t.lIIllllIII[35] = 0x1B ^ 0xC;
        t.lIIllllIII[36] = 0x1A ^ 2;
        t.lIIllllIII[37] = 0xBC ^ 0xA5;
        t.lIIllllIII[38] = 44 + 109 - 137 + 168 ^ 33 + 102 - 27 + 54;
        t.lIIllllIII[39] = 0xCE ^ 0x9D ^ (0xD2 ^ 0x9D);
        t.lIIllllIII[40] = 0x35 ^ 0x28;
        t.lIIllllIII[41] = 4 ^ 0x1A;
        t.lIIllllIII[42] = 0x14 ^ 0xB;
        t.lIIllllIII[43] = -3 & (0xFFFFAFFF & 0x5FF2);
        t.lIIllllIII[44] = 0x7B ^ 0x15 ^ (0xE1 ^ 0xAF);
        t.lIIllllIII[45] = 0x79 ^ 0x58;
        t.lIIllllIII[46] = 0x41 ^ 0x63;
        t.lIIllllIII[47] = 52 + 39 - -2 + 78 ^ 92 + 61 - 59 + 42;
        t.lIIllllIII[48] = 136 + 0 - 91 + 108 ^ 61 + 183 - 70 + 15;
        t.lIIllllIII[49] = 0xD6 ^ 0xA0 ^ (0xC9 ^ 0x9A);
        t.lIIllllIII[50] = 2 + 26 - -26 + 81 ^ 101 + 23 - -8 + 29;
        t.lIIllllIII[51] = 0xAF ^ 0x88;
        t.lIIllllIII[52] = 0x82 ^ 0xAA;
        t.lIIllllIII[53] = 0xF ^ 0x26;
        t.lIIllllIII[54] = 0xDE ^ 0x83 ^ (0xD0 ^ 0xA7);
        t.lIIllllIII[55] = 107 + 31 - 56 + 108 ^ 118 + 95 - 95 + 31;
        t.lIIllllIII[56] = 0x2F ^ 0x52 ^ (0x73 ^ 0x22);
        t.lIIllllIII[57] = 0xFFFFAFFC & 0x732B;
        t.lIIllllIII[58] = -(0xFFFFFBBB & 0x3E46) & (0xFFFFFBF7 & 0x3FFD);
        t.lIIllllIII[59] = -(0xFFFFDD5B & 0x73B6) & (0xFFFFFFDF & 0x7FFD);
        t.lIIllllIII[60] = -(0xFFFF9FF7 & 0x6E5E) & (0xFFFFFFFF & 0x6FFD);
        t.lIIllllIII[61] = -(0xFFFFDF5F & 0x70FB) & (0xFFFFD7DE & 0x7BFF);
        t.lIIllllIII[62] = 0x24 ^ 0x5A ^ (0xAF ^ 0xB5);
        t.lIIllllIII[63] = 0xE9 ^ 0xC4;
        t.lIIllllIII[64] = 92 + 145 - 224 + 152 ^ 107 + 8 - 54 + 78;
        t.lIIllllIII[65] = 0xFFFFAA6A & 0x5FDD;
        t.lIIllllIII[66] = -(0xFFFFFB3A & 0x46D7) & (0xFFFFDF7F & 0x6FFB);
        t.lIIllllIII[67] = 0x2C ^ 0x4F ^ (0x5F ^ 0x13);
        t.lIIllllIII[68] = 0xCC ^ 0xBB ^ (0x60 ^ 0x27);
        t.lIIllllIII[69] = 3 ^ 0x24 ^ (0x25 ^ 0x33);
        t.lIIllllIII[70] = 0x54 ^ 0x4F ^ (0x14 ^ 0x3C);
        t.lIIllllIII[71] = 7 ^ 0x71 ^ (0x7E ^ 0x3C);
        t.lIIllllIII[72] = 0x64 ^ 0x51;
        t.lIIllllIII[73] = 0x89 ^ 0xBF;
        t.lIIllllIII[74] = 0xFFFFFBEF & 0xF13;
        t.lIIllllIII[75] = -(0xFFFFE367 & 0x7EDD) & (0xFFFFEFF4 & 0x7FEF);
        t.lIIllllIII[76] = -(0xFFFFFB9D & 0x74F3) & (0xFFFFFBFF & 0x7EF3);
        t.lIIllllIII[77] = -(0xFFFFFCE7 & 0x6359) & (0xFFFFEDFC & 0x7FEF);
        t.lIIllllIII[78] = -(0xFFFFFFF5 & 0x34BB) & (0xFFFFBEF7 & Short.MAX_VALUE);
        t.lIIllllIII[79] = 0xFFFFBDF7 & 0x4FAE;
        t.lIIllllIII[80] = -(0xFFFFF52F & 0x7FF9) & (0xFFFFFF7F & 0x7FFC);
        t.lIIllllIII[81] = -(0xFFFFEB57 & 0x76AD) & (0xFFFFEFFF & 0x7F76);
        t.lIIllllIII[82] = -(0xFFFF9F93 & 0x74EE) & (0xFFFFFEFF & 0x1FCF);
        t.lIIllllIII[83] = -(0xFFFFB38B & 0x7EF7) & (0xFFFFFFF7 & 0x3FFF);
        t.lIIllllIII[84] = -(0xFFFFF15D & 0x2FAB) & (0xFFFFFF7F & 0x2BD9);
        t.lIIllllIII[85] = -(0xFFFFE3FD & 0x3E93) & (0xFFFFFFFF & 0x2FFF);
        t.lIIllllIII[86] = 0x40 ^ 0x77;
    }

    @Override
    public int T() {
        try {
            t.aK();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == (0x39 ^ 0x3D)) {
            return (0xD0 ^ 0xC6) & ~(0x8E ^ 0x98);
        }
        return lIIllllIII[62];
    }

    private static String lIIIIlIlIIIII(String var2, String var3) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIllllIII[22]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIIllllIII[3], var22);
            return new String(var1.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIlIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIIllllIII[2];
    }

    private static String lIIIIlIlIIIlI(String var10, String var21) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var11 = var21.toCharArray();
        int var9 = lIIllllIII[2];
        char[] var13 = var10.toCharArray();
        int var15 = var13.length;
        int var17 = lIIllllIII[2];
        while (t.lIIIIlIlIlIII(var17, var15)) {
            char var16 = var13[var17];
            var19.append((char)(var16 ^ var11[var9 % var11.length]));
            0;
            ++var9;
            ++var17;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean lIIIIlIlIlIll(int n2) {
        return n2 == 0;
    }

    private static void af() {
        d var12;
        Object var4;
        int[] nArray = new int[lIIllllIII[1]];
        nArray[t.lIIllllIII[2]] = lIIllllIII[12];
        if (t.lIIIIlIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIllllIII[12], lIIllllIII[1], lIIllllIII[57]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIllllIII[1]];
        nArray2[t.lIIllllIII[2]] = lIIllllIII[10];
        if (t.lIIIIlIlIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var4 = new d(lIIllllIII[10], lIIllllIII[1], lIIllllIII[4]);
            bv.add((d)var4);
            0;
        }
        int[] nArray3 = new int[lIIllllIII[1]];
        nArray3[t.lIIllllIII[2]] = lIIllllIII[9];
        if (t.lIIIIlIlIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var4 = new d(lIIllllIII[9], lIIllllIII[1], lIIllllIII[4]);
            bv.add((d)var4);
            0;
        }
        int[] nArray4 = new int[lIIllllIII[1]];
        nArray4[t.lIIllllIII[2]] = lIIllllIII[14];
        if (t.lIIIIlIlIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var4 = new d(lIIllllIII[14], lIIllllIII[24], lIIllllIII[4]);
            bv.add((d)var4);
            0;
        }
        int[] nArray5 = new int[lIIllllIII[1]];
        nArray5[t.lIIllllIII[2]] = lIIllllIII[16];
        if (t.lIIIIlIlIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var4 = new d(lIIllllIII[16], lIIllllIII[24], i.bq);
            bv.add((d)var4);
            0;
        }
        int[] nArray6 = new int[lIIllllIII[1]];
        nArray6[t.lIIllllIII[2]] = lIIllllIII[11];
        if (t.lIIIIlIlIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var4 = new d(lIIllllIII[11], lIIllllIII[0], lIIllllIII[58]);
            bv.add((d)var4);
            0;
        }
        if (t.lIIIIlIlIlIll(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lIIlllIllI[lIIllllIII[64]]))) ? 1 : 0)) {
            var12 = new d(lIIllllIII[59], lIIllllIII[13], lIIllllIII[60]);
            bv.add(var12);
            0;
        }
        int[] nArray7 = new int[lIIllllIII[1]];
        nArray7[t.lIIllllIII[2]] = lIIllllIII[8];
        if (t.lIIIIlIlIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var12 = new d(lIIllllIII[8], lIIllllIII[52], lIIllllIII[61]);
            bv.add(var12);
            0;
        }
    }

    static {
        t.lIIIIlIlIIlll();
        t.lIIIIlIlIIllI();
        bv = new ArrayList<d>();
        cH = new WorldArea(lIIllllIII[65], lIIllllIII[66], lIIllllIII[24], lIIllllIII[25], lIIllllIII[2]);
        String[] stringArray = new String[lIIllllIII[22]];
        stringArray[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[67]];
        stringArray[t.lIIllllIII[1]] = lIIlllIllI[lIIllllIII[68]];
        stringArray[t.lIIllllIII[3]] = lIIlllIllI[lIIllllIII[69]];
        stringArray[t.lIIllllIII[5]] = lIIlllIllI[lIIllllIII[19]];
        stringArray[t.lIIllllIII[6]] = lIIlllIllI[lIIllllIII[70]];
        stringArray[t.lIIllllIII[13]] = lIIlllIllI[lIIllllIII[71]];
        stringArray[t.lIIllllIII[15]] = lIIlllIllI[lIIllllIII[72]];
        stringArray[t.lIIllllIII[7]] = lIIlllIllI[lIIllllIII[73]];
        bR = stringArray;
        cg = new WorldPoint(lIIllllIII[74], lIIllllIII[75], lIIllllIII[2]);
        cJ = new WorldPoint(lIIllllIII[76], lIIllllIII[77], lIIllllIII[2]);
        cK = new WorldPoint(lIIllllIII[78], lIIllllIII[79], lIIllllIII[2]);
        cL = new WorldPoint(lIIllllIII[80], lIIllllIII[81], lIIllllIII[2]);
        cM = new WorldPoint(lIIllllIII[82], lIIllllIII[83], lIIllllIII[2]);
        cN = new WorldPoint(lIIllllIII[84], lIIllllIII[85], lIIllllIII[2]);
        cO = lIIllllIII[24];
    }

    private static String lIIIIlIlIIIIl(String var8, String var7) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIIllllIII[3], var18);
            return new String(var14.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIlIlIllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIlIlIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static void aK() {
        if (t.lIIIIlIlIlIII(Skills.getLevel((Skill)Skill.FISHING), lIIllllIII[0])) {
            R.dg();
        }
        if (t.lIIIIlIlIlIIl(Skills.getLevel((Skill)Skill.FISHING), lIIllllIII[0])) {
            if (t.lIIIIlIlIlIlI(bt ? 1 : 0)) {
                b.a(bv);
                if (t.lIIIIlIlIlIII(bv.size(), lIIllllIII[1])) {
                    System.out.println(lIIlllIllI[lIIllllIII[2]]);
                    bt = lIIllllIII[2];
                }
            }
            if (t.lIIIIlIlIlIll(bt ? 1 : 0)) {
                if (t.lIIIIlIlIlIll(t.ab() ? 1 : 0) && t.lIIIIlIlIlIII(e.j(cO), lIIllllIII[1])) {
                    String[] stringArray = new String[lIIllllIII[1]];
                    stringArray[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[1]];
                    if (t.lIIIIlIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        BankLocation var6 = BankLocation.getNearest();
                        if (t.lIIIIlIlIllII(var6) && t.lIIIIlIlIlIll(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIllI[lIIllllIII[3]];
                            a.a(var6);
                        }
                        if (t.lIIIIlIlIllII(var6) && t.lIIIIlIlIlIlI(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (t.lIIIIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllllIII[4]);
                                0;
                            }
                            if (t.lIIIIlIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIllI[lIIllllIII[5]];
                                if (t.lIIIIlIlIllIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIllllIII[6]);
                                    0;
                                }
                                if (t.lIIIIlIlIllIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIllllIII[3]);
                                    0;
                                }
                                int[] nArray = new int[lIIllllIII[7]];
                                nArray[t.lIIllllIII[2]] = lIIllllIII[8];
                                nArray[t.lIIllllIII[1]] = lIIllllIII[9];
                                nArray[t.lIIllllIII[3]] = lIIllllIII[10];
                                nArray[t.lIIllllIII[5]] = lIIllllIII[11];
                                nArray[t.lIIllllIII[6]] = lIIllllIII[12];
                                nArray[t.lIIllllIII[13]] = lIIllllIII[14];
                                nArray[t.lIIllllIII[15]] = lIIllllIII[16];
                                if (t.lIIIIlIlIlIll(e.b(nArray) ? 1 : 0)) {
                                    t.af();
                                    System.out.println(lIIlllIllI[lIIllllIII[6]]);
                                    bt = lIIllllIII[1];
                                    return;
                                }
                                int[] nArray2 = new int[lIIllllIII[15]];
                                nArray2[t.lIIllllIII[2]] = lIIllllIII[8];
                                nArray2[t.lIIllllIII[1]] = lIIllllIII[9];
                                nArray2[t.lIIllllIII[3]] = lIIllllIII[10];
                                nArray2[t.lIIllllIII[5]] = lIIllllIII[11];
                                nArray2[t.lIIllllIII[6]] = lIIllllIII[12];
                                nArray2[t.lIIllllIII[13]] = lIIllllIII[14];
                                if (t.lIIIIlIlIlIlI(e.b(nArray2) ? 1 : 0)) {
                                    a.a(lIIllllIII[8], lIIllllIII[0]);
                                    a.a(lIIllllIII[14], lIIllllIII[0]);
                                    a.a(lIIllllIII[9], lIIllllIII[1]);
                                    a.a(lIIllllIII[10], lIIllllIII[1]);
                                    a.a(lIIllllIII[11], lIIllllIII[0]);
                                    a.a(lIIllllIII[12], lIIllllIII[1]);
                                    a.a(lIIllllIII[16], lIIllllIII[5]);
                                    a.a(lIIllllIII[17], lIIllllIII[18]);
                                }
                            }
                        }
                    }
                }
                if (t.lIIIIlIlIlIlI(Inventory.contains((int[])f.aV) ? 1 : 0) && t.lIIIIlIlIlIII(Movement.getRunEnergy(), lIIllllIII[19])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIlllIllI[lIIllllIII[13]]);
                    Time.sleepTicks((int)lIIllllIII[1]);
                    0;
                }
                if (t.lIIIIlIlIlIlI(t.ab() ? 1 : 0) && t.lIIIIlIlIlIII(e.j(cO), lIIllllIII[1])) {
                    int[] nArray = new int[lIIllllIII[1]];
                    nArray[t.lIIllllIII[2]] = lIIllllIII[20];
                    if (t.lIIIIlIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (t.lIIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIII[0])) {
                            AccBuilderRogues.c = lIIlllIllI[lIIllllIII[15]];
                            if (t.lIIIIlIlIlIlI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)cg);
                            0;
                            Time.sleepTicks((int)lIIllllIII[1]);
                            0;
                        }
                        if (t.lIIIIlIlIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIII[21])) {
                            AccBuilderRogues.c = lIIlllIllI[lIIllllIII[7]];
                            g.a(lIIlllIllI[lIIllllIII[22]], bR);
                        }
                    }
                }
                if (t.lIIIIlIllIIII(e.j(cO), lIIllllIII[1])) {
                    int[] nArray = new int[lIIllllIII[1]];
                    nArray[t.lIIllllIII[2]] = lIIllllIII[20];
                    if (t.lIIIIlIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllllIII[1]];
                        stringArray[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[23]];
                        if (t.lIIIIlIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            ck = lIIllllIII[2];
                            String[] stringArray2 = new String[lIIllllIII[1]];
                            stringArray2[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[0]];
                            if (t.lIIIIlIlIlIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                if (t.lIIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(cK), lIIllllIII[6])) {
                                    AccBuilderRogues.c = lIIlllIllI[lIIllllIII[24]];
                                    Movement.walkTo((WorldPoint)cK);
                                    0;
                                }
                                if (t.lIIIIlIlIllll(Players.getLocal().getWorldLocation().distanceTo(cK), lIIllllIII[6])) {
                                    AccBuilderRogues.c = lIIlllIllI[lIIllllIII[21]];
                                    String[] stringArray3 = new String[lIIllllIII[1]];
                                    stringArray3[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[25]];
                                    if (t.lIIIIlIlIlIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIllllIII[1]];
                                        stringArray4[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[26]];
                                        if (t.lIIIIlIlIllII(TileObjects.getNearest((String[])stringArray4))) {
                                            String[] stringArray5 = new String[lIIllllIII[1]];
                                            stringArray5[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[27]];
                                            TileObjects.getNearest((String[])stringArray5).interact(lIIlllIllI[lIIllllIII[28]]);
                                            Time.sleepTicks((int)lIIllllIII[3]);
                                            0;
                                        }
                                    }
                                }
                            }
                            String[] stringArray6 = new String[lIIllllIII[1]];
                            stringArray6[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[29]];
                            if (t.lIIIIlIlIlIlI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                if (t.lIIIIlIlIlIll(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIllI[lIIllllIII[30]];
                                    if (t.lIIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)cN);
                                        0;
                                        Time.sleepTicks((int)lIIllllIII[1]);
                                        0;
                                    }
                                    g.a(bR);
                                }
                                if (t.lIIIIlIlIlIlI(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray7 = new String[lIIllllIII[1]];
                                    stringArray7[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[31]];
                                    if (t.lIIIIlIlIlIlI(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[32]];
                                        String[] stringArray8 = new String[lIIllllIII[1]];
                                        stringArray8[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[33]];
                                        if (t.lIIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray8).getWorldLocation()), lIIllllIII[3])) {
                                            String[] stringArray9 = new String[lIIllllIII[1]];
                                            stringArray9[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[34]];
                                            Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray9).getWorldLocation());
                                            0;
                                            Time.sleepTicks((int)lIIllllIII[6]);
                                            0;
                                        }
                                        if (t.lIIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[lIIllllIII[1]];
                                            stringArray10[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[35]];
                                            String[] stringArray11 = new String[lIIllllIII[1]];
                                            stringArray11[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)lIIllllIII[3]);
                                            0;
                                        }
                                        g.a(bR);
                                    }
                                    String[] stringArray12 = new String[lIIllllIII[1]];
                                    stringArray12[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[37]];
                                    if (t.lIIIIlIlIlIll(Inventory.contains((String[])stringArray12) ? 1 : 0) && t.lIIIIlIlIlIll(cI ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[38]];
                                        g.a(lIIlllIllI[lIIllllIII[20]], bR);
                                        if (t.lIIIIlIlIlIlI(Dialog.getText().contains(lIIlllIllI[lIIllllIII[39]]) ? 1 : 0)) {
                                            cI = lIIllllIII[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (t.lIIIIlIllIIII(e.j(cO), lIIllllIII[5])) {
                    String[] stringArray = new String[lIIllllIII[1]];
                    stringArray[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[40]];
                    if (t.lIIIIlIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray13 = new String[lIIllllIII[1]];
                        stringArray13[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[41]];
                        if (t.lIIIIlIlIlIll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIllI[lIIllllIII[42]];
                            int[] nArray = new int[lIIllllIII[1]];
                            nArray[t.lIIllllIII[2]] = lIIllllIII[43];
                            NPCs.getNearest((int[])nArray).interact(lIIlllIllI[lIIllllIII[44]]);
                            Time.sleepTicks((int)lIIllllIII[13]);
                            0;
                        }
                    }
                    String[] stringArray14 = new String[lIIllllIII[1]];
                    stringArray14[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[45]];
                    if (t.lIIIIlIlIlIlI(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[46]];
                        g.a(lIIlllIllI[lIIllllIII[47]], bR);
                    }
                }
                String[] stringArray = new String[lIIllllIII[1]];
                stringArray[t.lIIllllIII[2]] = lIIlllIllI[lIIllllIII[48]];
                if (t.lIIIIlIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (t.lIIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIII[13])) {
                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[49]];
                        Movement.walkTo((WorldPoint)cg);
                        0;
                        Time.sleepTicks((int)lIIllllIII[1]);
                        0;
                    }
                    if (t.lIIIIlIlIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIII[13])) {
                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[50]];
                        if (t.lIIIIlIlIlIII(ck, lIIllllIII[1])) {
                            U.jU += lIIllllIII[1];
                            U.o(AccBuilderRogues.m);
                            ck += lIIllllIII[1];
                            U.jU = lIIllllIII[2];
                            cl = lIIllllIII[2];
                        }
                        g.a(lIIlllIllI[lIIllllIII[51]], bR);
                    }
                }
            }
        }
    }

    private static boolean lIIIIlIlIlllI(int n2, int n3) {
        return n2 > n3;
    }
}

