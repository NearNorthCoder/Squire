/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.aa;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class w
implements ab {
    private static /* synthetic */ WorldPoint dz;
    public static /* synthetic */ boolean dx;
    private static /* synthetic */ String[] cG;
    public static /* synthetic */ boolean dw;
    private static /* synthetic */ WorldPoint dC;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ boolean dv;
    static /* synthetic */ boolean dl;
    private static /* synthetic */ String[] lllIllllI;
    private static /* synthetic */ WorldPoint dF;
    public static /* synthetic */ boolean du;
    private static /* synthetic */ int[] llllIIIIl;
    static /* synthetic */ int dy;
    private static /* synthetic */ WorldPoint dA;
    public static /* synthetic */ boolean dt;
    private static /* synthetic */ WorldPoint dD;
    static /* synthetic */ int dk;
    private static /* synthetic */ WorldPoint dB;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ WorldPoint dE;

    public static void bd() {
        String[] stringArray = new String[llllIIIIl[0]];
        stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[66]];
        if (w.llIIllIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (w.llIIllIlllII(Widgets.get((int)llllIIIIl[59]))) {
                Widget llIIlIlIllllI;
                AccBuilderGWD.c = lllIllllI[llllIIIIl[67]];
                String[] stringArray2 = new String[llllIIIIl[0]];
                stringArray2[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[68]];
                Inventory.getFirst((String[])stringArray2).interact(lllIllllI[llllIIIIl[69]]);
                Time.sleepTicks((int)llllIIIIl[6]);
                "".length();
                AccBuilderGWD.c = lllIllllI[llllIIIIl[70]];
                Widget widget = Widgets.get((int)llllIIIIl[59], (int)llllIIIIl[27]);
                if (w.llIIllIlllII(widget)) {
                    widget.interact(lllIllllI[llllIIIIl[71]]);
                    Time.sleepTicks((int)llllIIIIl[0]);
                    "".length();
                }
                if (w.llIIllIlllII(llIIlIlIllllI = Widgets.get((int)llllIIIIl[59], (int)llllIIIIl[39]))) {
                    llIIlIlIllllI.interact(lllIllllI[llllIIIIl[72]]);
                    Time.sleepTicks((int)llllIIIIl[5]);
                    "".length();
                }
            }
            Time.sleepTicks((int)llllIIIIl[0]);
            "".length();
        }
    }

    private static boolean llIIllIllIIl(int n2) {
        return n2 == 0;
    }

    private static String llIIllIIIIIl(String llIIlIIlIlIIl, String llIIlIIlIlIII) {
        try {
            SecretKeySpec llIIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIIlIllIl = Cipher.getInstance("Blowfish");
            llIIlIIlIllIl.init(llllIIIIl[5], llIIlIIlIlllI);
            return new String(llIIlIIlIllIl.doFinal(Base64.getDecoder().decode(llIIlIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIlIllII) {
            llIIlIIlIllII.printStackTrace();
            return null;
        }
    }

    private static String llIIllIIIIlI(String llIIlIlIIIIII, String llIIlIIllllll) {
        llIIlIlIIIIII = new String(Base64.getDecoder().decode(llIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIIlllllI = new StringBuilder();
        char[] llIIlIIllllIl = llIIlIIllllll.toCharArray();
        int llIIlIIllllII = llllIIIIl[1];
        char[] llIIlIIllIllI = llIIlIlIIIIII.toCharArray();
        int llIIlIIllIlIl = llIIlIIllIllI.length;
        int llIIlIIllIlII = llllIIIIl[1];
        while (w.llIIllIllIII(llIIlIIllIlII, llIIlIIllIlIl)) {
            char llIIlIlIIIIIl = llIIlIIllIllI[llIIlIIllIlII];
            llIIlIIlllllI.append((char)(llIIlIlIIIIIl ^ llIIlIIllllIl[llIIlIIllllII % llIIlIIllllIl.length]));
            "".length();
            ++llIIlIIllllII;
            ++llIIlIIllIlII;
            "".length();
            if (" ".length() > ((0x87 ^ 0x97 ^ (0xF5 ^ 0xAB)) & (1 ^ 0x4C ^ "   ".length() ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llIIlIIlllllI);
    }

    private static void llIIllIlIllI() {
        llllIIIIl = new int[126];
        w.llllIIIIl[0] = " ".length();
        w.llllIIIIl[1] = (" ".length() ^ (0x46 ^ 0x5F)) & (6 ^ 0x2C ^ (0x83 ^ 0xB1) ^ -" ".length());
        w.llllIIIIl[2] = 29 + 110 - -15 + 1 ^ 120 + 79 - 53 + 1;
        w.llllIIIIl[3] = -(0xFFFFC377 & 0x3DDD) & (0xFFFFFBFC & 0x5F77);
        w.llllIIIIl[4] = 0xFFFF9389 & 0x7FFE;
        w.llllIIIIl[5] = "  ".length();
        w.llllIIIIl[6] = 0x80 ^ 0x84;
        w.llllIIIIl[7] = 0xFFFFDF67 & 0x3FDF;
        w.llllIIIIl[8] = -(0xFFFFE53F & 0x7AC7) & (0xFFFFFFEF & 0x7F5F);
        w.llllIIIIl[9] = -(0xFFFF9EF5 & 0x6F4F) & (0xFFFFEF7E & 0x1FFF);
        w.llllIIIIl[10] = "   ".length();
        w.llllIIIIl[11] = 0xFFFFBFDF & 0x7171;
        w.llllIIIIl[12] = 0x8C ^ 0x86;
        w.llllIIIIl[13] = 0x87 ^ 0x82;
        w.llllIIIIl[14] = -(0xFFFFF3F3 & 0x3E8D) & (0xFFFFF3FF & 0x3FFB);
        w.llllIIIIl[15] = 0xBE ^ 0xB2;
        w.llllIIIIl[16] = 0x4A ^ 0xB;
        w.llllIIIIl[17] = 0xC1 ^ 0xB2 ^ (0xD3 ^ 0xA6);
        w.llllIIIIl[18] = 21 + 32 - 15 + 117 ^ 67 + 32 - 27 + 84;
        w.llllIIIIl[19] = -(0xFFFFDE2F & 0x69DC) & (0xFFFFDFFF & 0x7DFF);
        w.llllIIIIl[20] = -(0xFFFFEACD & 0x1D33) & (0xFFFFFFFF & 0x1DF5);
        w.llllIIIIl[21] = -(0xFFFFDDCF & 0x6A39) & (0xFFFFDDFF & 0x7FFE);
        w.llllIIIIl[22] = 0xFFFFF5FF & 0x1FF7;
        w.llllIIIIl[23] = 0xFFFF9DFC & 0x77FB;
        w.llllIIIIl[24] = 0xA1 ^ 0xA8;
        w.llllIIIIl[25] = 0x2A ^ 0x62 ^ (0xF4 ^ 0xB7);
        w.llllIIIIl[26] = 0x1E ^ 0x13;
        w.llllIIIIl[27] = 0xA ^ 0x31 ^ (0xB7 ^ 0x82);
        w.llllIIIIl[28] = 0x68 ^ 0x67;
        w.llllIIIIl[29] = 0xA ^ 0x1A;
        w.llllIIIIl[30] = 0x43 ^ 0x52;
        w.llllIIIIl[31] = 0x64 ^ 0x76;
        w.llllIIIIl[32] = 0x50 ^ 0x13 ^ (0xFF ^ 0xAF);
        w.llllIIIIl[33] = 0xB1 ^ 0xA5;
        w.llllIIIIl[34] = 0x46 ^ 9 ^ (0x17 ^ 0x4D);
        w.llllIIIIl[35] = 3 ^ 0x27 ^ (7 ^ 0x35);
        w.llllIIIIl[36] = 0x58 ^ 0x4F;
        w.llllIIIIl[37] = 0x63 ^ 0x79 ^ "  ".length();
        w.llllIIIIl[38] = 73 + 104 - 68 + 67 ^ 145 + 69 - 87 + 42;
        w.llllIIIIl[39] = 104 + 121 - 170 + 91 ^ 50 + 20 - -12 + 54;
        w.llllIIIIl[40] = 0x81 ^ 0x9A;
        w.llllIIIIl[41] = 0xDE ^ 0x8A ^ (0x61 ^ 0x29);
        w.llllIIIIl[42] = 0x79 ^ 0x64;
        w.llllIIIIl[43] = 0x3D ^ 0x5C ^ 30 + 53 - 73 + 117;
        w.llllIIIIl[44] = 0x31 ^ 0x2E;
        w.llllIIIIl[45] = 82 + 11 - -10 + 59 ^ 43 + 72 - 66 + 81;
        w.llllIIIIl[46] = 0 ^ 0x56 ^ (0xDE ^ 0xA9);
        w.llllIIIIl[47] = 0x16 ^ 0x5E ^ (0xEC ^ 0x86);
        w.llllIIIIl[48] = 0x38 ^ 0x1B;
        w.llllIIIIl[49] = 0x54 ^ 0x70;
        w.llllIIIIl[50] = " ".length() ^ (0xBE ^ 0x9A);
        w.llllIIIIl[51] = 67 + 28 - 50 + 133 ^ 78 + 109 - 155 + 116;
        w.llllIIIIl[52] = 0x13 ^ 0x34;
        w.llllIIIIl[53] = 54 + 58 - -4 + 26 ^ 8 + 79 - -13 + 66;
        w.llllIIIIl[54] = 19 + 12 - -18 + 85 ^ 3 + 65 - 13 + 120;
        w.llllIIIIl[55] = 0x4E ^ 0x48 ^ (0x7D ^ 0x51);
        w.llllIIIIl[56] = 125 + 52 - 44 + 35 ^ 5 + 55 - 20 + 91;
        w.llllIIIIl[57] = 0x49 ^ 6 ^ (0x6C ^ 0xF);
        w.llllIIIIl[58] = (0x38 ^ 0x67) & ~(0x4A ^ 0x15) ^ (0x27 ^ 0xA);
        w.llllIIIIl[59] = 145 + 104 - 238 + 229;
        w.llllIIIIl[60] = 8 ^ 0x7B ^ (0xC ^ 0x51);
        w.llllIIIIl[61] = 0x84 ^ 0xBC ^ (0 ^ 0x17);
        w.llllIIIIl[62] = 7 ^ 0x2F ^ (0 ^ 0x18);
        w.llllIIIIl[63] = 0x21 ^ 0x18 ^ (0xCB ^ 0xC3);
        w.llllIIIIl[64] = 0x70 ^ 0x42;
        w.llllIIIIl[65] = 0x50 ^ 0x63;
        w.llllIIIIl[66] = 0x47 ^ 0x73;
        w.llllIIIIl[67] = 0x25 ^ 0x10;
        w.llllIIIIl[68] = 0x66 ^ 0x50;
        w.llllIIIIl[69] = 0x4E ^ 0x79;
        w.llllIIIIl[70] = 59 + 164 - 206 + 234 ^ 114 + 188 - 249 + 142;
        w.llllIIIIl[71] = 0x46 ^ 0x63 ^ (0xBC ^ 0xA0);
        w.llllIIIIl[72] = 0x94 ^ 0xC6 ^ (0xF5 ^ 0x9D);
        w.llllIIIIl[73] = 0xFF ^ 0xC4;
        w.llllIIIIl[74] = -(0xFFFFDFE3 & 0x2C3F) & (0xFFFF8FE6 & 0x7FBF);
        w.llllIIIIl[75] = 0xFFFFAECD & 0x7FFE;
        w.llllIIIIl[76] = -(0xFFFFFE7F & 0x13D8) & (0xFFFFFBFF & 0x77FF);
        w.llllIIIIl[77] = 0xC0 ^ 0xA4;
        w.llllIIIIl[78] = 2 ^ 0x77 ^ (0x8E ^ 0xC7);
        w.llllIIIIl[79] = 0xB3 ^ 0x8E;
        w.llllIIIIl[80] = 0x10 ^ 0x2E;
        w.llllIIIIl[81] = 0x6F ^ 0x50;
        w.llllIIIIl[82] = 0xA2 ^ 0x9A ^ (0x12 ^ 0x6A);
        w.llllIIIIl[83] = 0x2D ^ 0x31 ^ (0x50 ^ 0xE);
        w.llllIIIIl[84] = 0xF4 ^ 0xB2 ^ (0xC3 ^ 0xC6);
        w.llllIIIIl[85] = 0x2C ^ 0x68;
        w.llllIIIIl[86] = 92 + 175 - 95 + 31 ^ 110 + 80 - 75 + 27;
        w.llllIIIIl[87] = 0x26 ^ 0x60;
        w.llllIIIIl[88] = 0x5D ^ 0x1A;
        w.llllIIIIl[89] = 0xF2 ^ 0xBA;
        w.llllIIIIl[90] = 3 ^ 0x3A ^ (0x52 ^ 0x22);
        w.llllIIIIl[91] = 0xFFFF87FB & 0x7F25;
        w.llllIIIIl[92] = -" ".length() & (0xFFFFAF6F & 0x5EFA);
        w.llllIIIIl[93] = -(0xFFFFFCFD & 0x73B3) & (0xFFFFFFFF & 0x77BF);
        w.llllIIIIl[94] = -(0xFFFFF773 & 0x78DD) & (0xFFFFFEDF & 0x7FFE);
        w.llllIIIIl[95] = -(0xFFFFAD73 & 0x7BCD) & (0xFFFFBFFF & 0x6FF7);
        w.llllIIIIl[96] = -(0xFFFFBFE1 & 0x617F) & (0xFFFFBFFD & 0x6FEF);
        w.llllIIIIl[97] = 0xFFFFC74F & 0x3EBF;
        w.llllIIIIl[98] = -(0xFFFFC797 & 0x397B) & (0xFFFFAFBF & 0x5FF7);
        w.llllIIIIl[99] = -(0xFFFFFB77 & 0x748B) & (0xFFFFF7FE & 0x7DF3);
        w.llllIIIIl[100] = -(0xFFFFF77B & 0x38D5) & (0xFFFFBED7 & 0x7F7F);
        w.llllIIIIl[101] = -(0xFFFFF5F2 & 0x3A1F) & (0xFFFFFEFF & 0x37FF);
        w.llllIIIIl[102] = -(0xFFFFBBFE & 0x75ED) & (0xFFFFFFFF & 0x3FEF);
        w.llllIIIIl[103] = -(0xFFFFEC9F & 0x7367) & (0xFFFFE7BE & 0x7EF7);
        w.llllIIIIl[104] = -(0xFFFFFEBB & 0x71D5) & (0xFFFFFFFF & 0x7FBB);
        w.llllIIIIl[105] = 0xDF ^ 0xAA ^ (0x8B ^ 0xB4);
        w.llllIIIIl[106] = 113 + 172 - 188 + 98 ^ 96 + 90 - 109 + 59;
        w.llllIIIIl[107] = 0xF5 ^ 0xB9;
        w.llllIIIIl[108] = 35 + 16 - 3 + 79 ^ (0x2A ^ 0x18);
        w.llllIIIIl[109] = 0xEE ^ 0xA0;
        w.llllIIIIl[110] = 72 + 19 - 87 + 132 ^ 174 + 196 - 258 + 87;
        w.llllIIIIl[111] = 0x2B ^ 0x7B;
        w.llllIIIIl[112] = 2 ^ 0x5F ^ (0xB4 ^ 0xB8);
        w.llllIIIIl[113] = 0xCB ^ 0x99;
        w.llllIIIIl[114] = 48 + 79 - 116 + 212 ^ 13 + 92 - 22 + 57;
        w.llllIIIIl[115] = 0x12 ^ 0x1B ^ (0x14 ^ 0x49);
        w.llllIIIIl[116] = 18 + 87 - -4 + 18 ^ (0x43 ^ 0x69);
        w.llllIIIIl[117] = 93 + 180 - 104 + 69 ^ 0 + 50 - -118 + 16;
        w.llllIIIIl[118] = 0xC7 ^ 0x90;
        w.llllIIIIl[119] = 0x29 ^ 0x71;
        w.llllIIIIl[120] = 132 + 55 - 72 + 120 ^ 105 + 108 - 36 + 1;
        w.llllIIIIl[121] = 0x9A ^ 0xC0;
        w.llllIIIIl[122] = 0xDF ^ 0x84;
        w.llllIIIIl[123] = 0xDA ^ 0x86;
        w.llllIIIIl[124] = 0x7C ^ 0x1D ^ (0xA6 ^ 0x9A);
        w.llllIIIIl[125] = 0xF8 ^ 0x89 ^ (0xB0 ^ 0x9F);
    }

    private static boolean llIIllIlIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            w.bc();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() < 0) {
            return (0x94 ^ 0x90) & ~(0xAC ^ 0xA8);
        }
        return llllIIIIl[77];
    }

    private static boolean llIIlllIIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean ae() {
        return llllIIIIl[1];
    }

    private static boolean llIIllIlllII(Object object) {
        return object != null;
    }

    @Override
    public String ag() {
        return lllIllllI[llllIIIIl[78]];
    }

    static {
        w.llIIllIlIllI();
        w.llIIllIlIlIl();
        bx = new ArrayList<d>();
        dy = llllIIIIl[1];
        dz = new WorldPoint(llllIIIIl[91], llllIIIIl[92], llllIIIIl[1]);
        dA = new WorldPoint(llllIIIIl[93], llllIIIIl[94], llllIIIIl[1]);
        dB = new WorldPoint(llllIIIIl[95], llllIIIIl[96], llllIIIIl[1]);
        dC = new WorldPoint(llllIIIIl[97], llllIIIIl[98], llllIIIIl[1]);
        dD = new WorldPoint(llllIIIIl[99], llllIIIIl[100], llllIIIIl[1]);
        dE = new WorldPoint(llllIIIIl[101], llllIIIIl[102], llllIIIIl[1]);
        dF = new WorldPoint(llllIIIIl[103], llllIIIIl[104], llllIIIIl[1]);
        String[] stringArray = new String[llllIIIIl[33]];
        stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[105]];
        stringArray[w.llllIIIIl[0]] = lllIllllI[llllIIIIl[106]];
        stringArray[w.llllIIIIl[5]] = lllIllllI[llllIIIIl[107]];
        stringArray[w.llllIIIIl[10]] = lllIllllI[llllIIIIl[108]];
        stringArray[w.llllIIIIl[6]] = lllIllllI[llllIIIIl[109]];
        stringArray[w.llllIIIIl[13]] = lllIllllI[llllIIIIl[110]];
        stringArray[w.llllIIIIl[17]] = lllIllllI[llllIIIIl[111]];
        stringArray[w.llllIIIIl[18]] = lllIllllI[llllIIIIl[112]];
        stringArray[w.llllIIIIl[2]] = lllIllllI[llllIIIIl[113]];
        stringArray[w.llllIIIIl[24]] = lllIllllI[llllIIIIl[114]];
        stringArray[w.llllIIIIl[12]] = lllIllllI[llllIIIIl[115]];
        stringArray[w.llllIIIIl[25]] = lllIllllI[llllIIIIl[116]];
        stringArray[w.llllIIIIl[15]] = lllIllllI[llllIIIIl[117]];
        stringArray[w.llllIIIIl[26]] = lllIllllI[llllIIIIl[118]];
        stringArray[w.llllIIIIl[27]] = lllIllllI[llllIIIIl[119]];
        stringArray[w.llllIIIIl[28]] = lllIllllI[llllIIIIl[120]];
        stringArray[w.llllIIIIl[29]] = lllIllllI[llllIIIIl[121]];
        stringArray[w.llllIIIIl[30]] = lllIllllI[llllIIIIl[122]];
        stringArray[w.llllIIIIl[31]] = lllIllllI[llllIIIIl[123]];
        stringArray[w.llllIIIIl[32]] = lllIllllI[llllIIIIl[124]];
        cG = stringArray;
    }

    private static void Q() {
        d llIIlIlIllIlI;
        Object llIIlIlIllIll;
        int[] nArray = new int[llllIIIIl[0]];
        nArray[w.llllIIIIl[1]] = llllIIIIl[9];
        if (w.llIIllIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llllIIIIl[9], llllIIIIl[12], llllIIIIl[74]);
            bx.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llllIIIIl[0]];
        nArray2[w.llllIIIIl[1]] = llllIIIIl[11];
        if (w.llIIllIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIIlIlIllIll = new d(llllIIIIl[11], llllIIIIl[13], j.ch);
            bx.add((d)llIIlIlIllIll);
            "".length();
        }
        if (w.llIIllIllIIl(Bank.contains(llIIlIlIllIll = item -> item.getName().toLowerCase().contains(lllIllllI[llllIIIIl[80]])) ? 1 : 0)) {
            llIIlIlIllIlI = new d(llllIIIIl[75], llllIIIIl[13], llllIIIIl[76]);
            bx.add(llIIlIlIllIlI);
            "".length();
        }
        int[] nArray3 = new int[llllIIIIl[0]];
        nArray3[w.llllIIIIl[1]] = llllIIIIl[7];
        if (w.llIIllIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIIlIlIllIlI = new d(llllIIIIl[7], llllIIIIl[53], llllIIIIl[74]);
            bx.add(llIIlIlIllIlI);
            "".length();
        }
        int[] nArray4 = new int[llllIIIIl[0]];
        nArray4[w.llllIIIIl[1]] = llllIIIIl[8];
        if (w.llIIllIllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIIlIlIllIlI = new d(llllIIIIl[8], llllIIIIl[12], llllIIIIl[74]);
            bx.add(llIIlIlIllIlI);
            "".length();
        }
    }

    private static boolean llIIllIlllIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (w.llIIllIllIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[24])) {
            String[] stringArray = new String[llllIIIIl[0]];
            stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[79]];
            if (w.llIIllIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = llllIIIIl[0];
                "".length();
                if (" ".length() < "   ".length()) return n2 != 0;
                return ((0xF ^ 0x7B ^ (0x2B ^ 0x6D)) & (35 + 6 - 22 + 118 ^ 172 + 0 - 36 + 51 ^ -" ".length())) != 0;
            }
        }
        n2 = llllIIIIl[1];
        return n2 != 0;
    }

    public static void bc() {
        block80: {
            Widget llIIlIllIIlIl;
            Object llIIlIllIIllI;
            block82: {
                block81: {
                    if (w.llIIllIlIlll(bv ? 1 : 0)) {
                        b.a(bx);
                        if (w.llIIllIllIII(bx.size(), llllIIIIl[0])) {
                            System.out.println(lllIllllI[llllIIIIl[1]]);
                            bv = llllIIIIl[1];
                        }
                    }
                    if (!w.llIIllIllIIl(bv ? 1 : 0)) break block80;
                    if (!w.llIIllIllIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllIIIIl[2])) break block81;
                    int[] nArray = new int[llllIIIIl[0]];
                    nArray[w.llllIIIIl[1]] = llllIIIIl[3];
                    if (!w.llIIllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                aa.dQ();
            }
            if (w.llIIllIllIIl(w.an() ? 1 : 0) && w.llIIllIllIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[0]) && w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllIIIIl[2])) {
                int[] nArray = new int[llllIIIIl[0]];
                nArray[w.llllIIIIl[1]] = llllIIIIl[3];
                if (w.llIIllIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    llIIlIllIIllI = BankLocation.getNearest();
                    if (w.llIIllIlllII(llIIlIllIIllI) && w.llIIllIllIIl(llIIlIllIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[0]];
                        a.a((BankLocation)llIIlIllIIllI);
                    }
                    if (w.llIIllIlllII(llIIlIllIIllI) && w.llIIllIlIlll(llIIlIllIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (w.llIIllIllIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIIIl[4]);
                            "".length();
                        }
                        if (w.llIIllIlIlll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = lllIllllI[llllIIIIl[5]];
                            if (w.llIIllIlllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllIIIIl[6]);
                                "".length();
                            }
                            if (w.llIIllIlllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llllIIIIl[5]);
                                "".length();
                            }
                            int[] nArray2 = new int[llllIIIIl[6]];
                            nArray2[w.llllIIIIl[1]] = llllIIIIl[7];
                            nArray2[w.llllIIIIl[0]] = llllIIIIl[8];
                            nArray2[w.llllIIIIl[5]] = llllIIIIl[9];
                            nArray2[w.llllIIIIl[10]] = llllIIIIl[11];
                            if (w.llIIllIllIIl(e.d(nArray2) ? 1 : 0)) {
                                w.Q();
                                System.out.println(lllIllllI[llllIIIIl[10]]);
                                bv = llllIIIIl[0];
                                return;
                            }
                            int[] nArray3 = new int[llllIIIIl[6]];
                            nArray3[w.llllIIIIl[1]] = llllIIIIl[7];
                            nArray3[w.llllIIIIl[0]] = llllIIIIl[8];
                            nArray3[w.llllIIIIl[5]] = llllIIIIl[9];
                            nArray3[w.llllIIIIl[10]] = llllIIIIl[11];
                            if (w.llIIllIlIlll(e.d(nArray3) ? 1 : 0)) {
                                a.a(llllIIIIl[7], llllIIIIl[12]);
                                a.a(llllIIIIl[8], llllIIIIl[12]);
                                a.a(llllIIIIl[9], llllIIIIl[0]);
                                a.a(llllIIIIl[11], llllIIIIl[13]);
                                a.a(llllIIIIl[14], llllIIIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[llllIIIIl[0]];
            nArray[w.llllIIIIl[1]] = llllIIIIl[14];
            if (w.llIIllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0) && w.llIIllIllIlI(Combat.getMissingHealth(), llllIIIIl[15])) {
                int[] nArray4 = new int[llllIIIIl[0]];
                nArray4[w.llllIIIIl[1]] = llllIIIIl[14];
                Inventory.getFirst((int[])nArray4).interact(lllIllllI[llllIIIIl[6]]);
                Time.sleepTicks((int)llllIIIIl[5]);
                "".length();
            }
            if (w.llIIllIlIlll(Inventory.contains((int[])f.bc) ? 1 : 0) && w.llIIllIllIII(Movement.getRunEnergy(), llllIIIIl[16])) {
                Inventory.getFirst((int[])f.bc).interact(lllIllllI[llllIIIIl[13]]);
                Time.sleepTicks((int)llllIIIIl[0]);
                "".length();
            }
            if (w.llIIllIllIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[0]) && w.llIIllIlIlll(w.an() ? 1 : 0) && w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllIIIIl[2])) {
                int[] nArray5 = new int[llllIIIIl[0]];
                nArray5[w.llllIIIIl[1]] = llllIIIIl[3];
                if (w.llIIllIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (w.llIIllIllIIl(Players.getLocal().getWorldLocation().equals((Object)dz) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[17]];
                        if (w.llIIllIlIlll(Dialog.isOpen() ? 1 : 0) && w.llIIllIllIII(dy, llllIIIIl[5])) {
                            Dialog.close();
                            dy += llllIIIIl[0];
                        }
                        e.a(dz);
                    }
                    if (w.llIIllIlIlll(Players.getLocal().getWorldLocation().equals((Object)dz) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[18]];
                        g.a(lllIllllI[llllIIIIl[2]], cG);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)llllIIIIl[19]));
            System.out.println("5621: " + Vars.getBit((int)llllIIIIl[20]));
            System.out.println("5622: " + Vars.getBit((int)llllIIIIl[21]));
            System.out.println("5623: " + Vars.getBit((int)llllIIIIl[22]));
            System.out.println("5624: " + Vars.getBit((int)llllIIIIl[23]));
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[19]), llllIIIIl[0])) {
                dt = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[20]), llllIIIIl[0])) {
                du = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[21]), llllIIIIl[0])) {
                dv = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[22]), llllIIIIl[0])) {
                dw = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[23]), llllIIIIl[0])) {
                dx = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[0])) {
                int llIIlIllIIlII;
                dk = llllIIIIl[1];
                if (w.llIIllIllIIl(dt ? 1 : 0)) {
                    String[] stringArray = new String[llllIIIIl[0]];
                    stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[24]];
                    if (w.llIIllIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[llllIIIIl[0]];
                        stringArray2[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[12]];
                        if (w.llIIllIlIlll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[llllIIIIl[0]];
                            stringArray3[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[25]];
                            if (w.llIIllIllIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[llllIIIIl[0]];
                                stringArray4[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[15]];
                                String[] stringArray5 = new String[llllIIIIl[0]];
                                stringArray5[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)llllIIIIl[5]);
                                "".length();
                            }
                        }
                    }
                    String[] stringArray6 = new String[llllIIIIl[0]];
                    stringArray6[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[27]];
                    if (w.llIIllIlIlll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dA), llllIIIIl[2])) {
                            AccBuilderGWD.c = lllIllllI[llllIIIIl[28]];
                            Movement.walkTo((WorldPoint)dA);
                            "".length();
                            Time.sleepTicks((int)llllIIIIl[0]);
                            "".length();
                        }
                        if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dA), llllIIIIl[2])) {
                            AccBuilderGWD.c = lllIllllI[llllIIIIl[29]];
                            g.a(lllIllllI[llllIIIIl[30]], cG, llllIIIIl[0]);
                            Time.sleepTicks((int)llllIIIIl[0]);
                            "".length();
                            llIIlIllIIllI = Dialog.getOptions();
                            llIIlIllIIlIl = new ArrayList();
                            if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                                llIIlIllIIlII = llllIIIIl[1];
                                while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                    llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());
                                    "".length();
                                    ++llIIlIllIIlII;
                                    "".length();
                                    if (((0x32 ^ 0xA) & ~(0x33 ^ 0xB)) == 0) continue;
                                    return;
                                }
                                llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[90]])) ? 1 : 0;
                                int n2 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[89]]));
                                if (w.llIIllIlIlll(llIIlIllIIlII) && w.llIIllIlIlll(n2)) {
                                    System.out.println(lllIllllI[llllIIIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (w.llIIllIllIIl(du ? 1 : 0) && w.llIIllIlIlll(dt ? 1 : 0)) {
                    if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[32]];
                        Movement.walkTo((WorldPoint)dB);
                        "".length();
                        Time.sleepTicks((int)llllIIIIl[0]);
                        "".length();
                    }
                    if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[33]];
                        g.a(lllIllllI[llllIIIIl[34]], cG, llllIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIl[0]);
                        "".length();
                        llIIlIllIIllI = Dialog.getOptions();
                        llIIlIllIIlIl = new ArrayList();
                        if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                            llIIlIllIIlII = llllIIIIl[1];
                            while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());
                                "".length();
                                ++llIIlIllIIlII;
                                "".length();
                                if (((0x90 ^ 0xB5 ^ (0x56 ^ 0x3E)) & (16 + 200 - 84 + 115 ^ 151 + 35 - 50 + 50 ^ -" ".length())) == 0) continue;
                                return;
                            }
                            llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[88]])) ? 1 : 0;
                            int n3 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[87]]));
                            if (w.llIIllIlIlll(llIIlIllIIlII) && w.llIIllIlIlll(n3)) {
                                System.out.println(lllIllllI[llllIIIIl[35]]);
                            }
                        }
                    }
                }
                if (w.llIIllIllIIl(dv ? 1 : 0) && w.llIIllIlIlll(du ? 1 : 0) && w.llIIllIlIlll(dt ? 1 : 0)) {
                    if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[36]];
                        Movement.walkTo((WorldPoint)dC);
                        "".length();
                        Time.sleepTicks((int)llllIIIIl[0]);
                        "".length();
                    }
                    if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[37]];
                        g.a(lllIllllI[llllIIIIl[38]], cG, llllIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIl[0]);
                        "".length();
                        llIIlIllIIllI = Dialog.getOptions();
                        llIIlIllIIlIl = new ArrayList();
                        if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                            llIIlIllIIlII = llllIIIIl[1];
                            while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());
                                "".length();
                                ++llIIlIllIIlII;
                                "".length();
                                if (" ".length() != 0) continue;
                                return;
                            }
                            llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[86]])) ? 1 : 0;
                            int n4 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[85]]));
                            if (w.llIIllIlIlll(llIIlIllIIlII) && w.llIIllIlIlll(n4)) {
                                System.out.println(lllIllllI[llllIIIIl[39]]);
                            }
                        }
                    }
                }
                if (w.llIIllIllIIl(dw ? 1 : 0) && w.llIIllIlIlll(dv ? 1 : 0) && w.llIIllIlIlll(du ? 1 : 0) && w.llIIllIlIlll(dt ? 1 : 0)) {
                    if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[40]];
                        Movement.walkTo((WorldPoint)dD);
                        "".length();
                        Time.sleepTicks((int)llllIIIIl[0]);
                        "".length();
                    }
                    if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[41]];
                        g.a(lllIllllI[llllIIIIl[42]], cG, llllIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIl[0]);
                        "".length();
                        llIIlIllIIllI = Dialog.getOptions();
                        llIIlIllIIlIl = new ArrayList();
                        if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                            llIIlIllIIlII = llllIIIIl[1];
                            while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());
                                "".length();
                                ++llIIlIllIIlII;
                                "".length();
                                if (((0x46 ^ 0x27 ^ (0x79 ^ 0x21)) & (0xAA ^ 0xC4 ^ (0x5C ^ 0xB) ^ -" ".length())) < " ".length()) continue;
                                return;
                            }
                            llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[84]])) ? 1 : 0;
                            int n5 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[83]]));
                            if (w.llIIllIlIlll(llIIlIllIIlII) && w.llIIllIlIlll(n5)) {
                                System.out.println(lllIllllI[llllIIIIl[43]]);
                            }
                        }
                    }
                }
                if (w.llIIllIllIIl(dx ? 1 : 0) && w.llIIllIlIlll(dw ? 1 : 0) && w.llIIllIlIlll(dv ? 1 : 0) && w.llIIllIlIlll(du ? 1 : 0) && w.llIIllIlIlll(dt ? 1 : 0)) {
                    if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[44]];
                        Movement.walkTo((WorldPoint)dE);
                        "".length();
                        Time.sleepTicks((int)llllIIIIl[0]);
                        "".length();
                    }
                    if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[45]];
                        g.a(lllIllllI[llllIIIIl[46]], cG, llllIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIl[0]);
                        "".length();
                        llIIlIllIIllI = Dialog.getOptions();
                        llIIlIllIIlIl = new ArrayList();
                        if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                            llIIlIllIIlII = llllIIIIl[1];
                            while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());
                                "".length();
                                ++llIIlIllIIlII;
                                "".length();
                                if (null == null) continue;
                                return;
                            }
                            llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[16]])) ? 1 : 0;
                            int n6 = llIIlIllIIlIl.stream().anyMatch(string -> string.contains(lllIllllI[llllIIIIl[82]]));
                            int n7 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[81]]));
                            if ((!w.llIIllIllIIl(llIIlIllIIlII) || w.llIIllIlIlll(n6)) && w.llIIllIlIlll(n7)) {
                                System.out.println(lllIllllI[llllIIIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[5])) {
                if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[48]];
                    if (w.llIIllIlIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(dz);
                }
                if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[49]];
                    g.a(lllIllllI[llllIIIIl[50]], cG);
                }
            }
            if (!w.llIIlllIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[10]) || w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[17])) {
                g.a(cG);
            }
            if (w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[6])) {
                if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIIl[6])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[51]];
                    Movement.walkTo((WorldPoint)dF);
                    "".length();
                    Time.sleepTicks((int)llllIIIIl[0]);
                    "".length();
                }
                if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIIl[6])) {
                    String[] stringArray = new String[llllIIIIl[0]];
                    stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[52]];
                    if (w.llIIllIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[llllIIIIl[0]];
                        stringArray7[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(lllIllllI[llllIIIIl[54]]);
                        Time.sleepTicks((int)llllIIIIl[10]);
                        "".length();
                    }
                }
            }
            if (w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[13])) {
                if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[55]];
                    e.a(dz);
                }
                if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[56]];
                    g.a(lllIllllI[llllIIIIl[57]], cG);
                }
            }
            if (!w.llIIlllIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[18]) || w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[2])) {
                if (w.llIIllIllIII(dk, llllIIIIl[0])) {
                    as.pi += llllIIIIl[0];
                    as.u(AccBuilderGWD.m);
                    dk += llllIIIIl[0];
                    as.pi = llllIIIIl[1];
                    dl = llllIIIIl[1];
                }
                String[] stringArray = new String[llllIIIIl[0]];
                stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[58]];
                if (w.llIIllIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (w.llIIllIlllII(Widgets.get((int)llllIIIIl[59]))) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[60]];
                        String[] stringArray8 = new String[llllIIIIl[0]];
                        stringArray8[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[61]];
                        Inventory.getFirst((String[])stringArray8).interact(lllIllllI[llllIIIIl[62]]);
                        Time.sleepTicks((int)llllIIIIl[6]);
                        "".length();
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[63]];
                        llIIlIllIIllI = Widgets.get((int)llllIIIIl[59], (int)llllIIIIl[27]);
                        if (w.llIIllIlllII(llIIlIllIIllI)) {
                            llIIlIllIIllI.interact(lllIllllI[llllIIIIl[64]]);
                            Time.sleepTicks((int)llllIIIIl[0]);
                            "".length();
                        }
                        if (w.llIIllIlllII(llIIlIllIIlIl = Widgets.get((int)llllIIIIl[59], (int)llllIIIIl[39]))) {
                            llIIlIllIIlIl.interact(lllIllllI[llllIIIIl[65]]);
                            Time.sleepTicks((int)llllIIIIl[5]);
                            "".length();
                        }
                    }
                    Time.sleepTicks((int)llllIIIIl[0]);
                    "".length();
                }
            }
        }
    }

    private static void llIIllIlIlIl() {
        lllIllllI = new String[llllIIIIl[125]];
        w.lllIllllI[w.llllIIIIl[1]] = w.llIIllIIIIIl("DrC5yYdngDl8nm6rt/fyKSeNYLAvMAIFK0TqLMROK0l7gkZg6pOLrnOnU8xmz640", "DwSXw");
        w.lllIllllI[w.llllIIIIl[0]] = w.llIIllIIIIlI("LDY1WRUNdyEYDwk=", "bWCya");
        w.lllIllllI[w.llllIIIIl[5]] = w.llIIllIIIIIl("7+M293NWRn1BKInxdIZZ4jcsMpXjr3Mr", "lAEgK");
        w.lllIllllI[w.llllIIIIl[10]] = w.llIIllIIIIIl("hpRuAYfsErVv4+sZhsWLCRSeQ8h7MNq7Xq/9H5hqj9nnBVpQosHJwnhIQx20pGy/Ufloc7h9qDQ=", "uDnlB");
        w.lllIllllI[w.llllIIIIl[6]] = w.llIIllIIIIIl("H6AIDbzI08A=", "LIONs");
        w.lllIllllI[w.llllIIIIl[13]] = w.llIIllIIIIIl("BSPrATzxd2M=", "miDPD");
        w.lllIllllI[w.llllIIIIl[17]] = w.llIIllIIIIll("aW69znQVb1BRaVGX+YT3Nw==", "oAsYj");
        w.lllIllllI[w.llllIIIIl[18]] = w.llIIllIIIIlI("HB4lPCYmBCNuIzoPNzo=", "OjDNR");
        w.lllIllllI[w.llllIIIIl[2]] = w.llIIllIIIIIl("M+dQSmjn9ow=", "EYBzB");
        w.lllIllllI[w.llllIIIIl[24]] = w.llIIllIIIIll("xCQiUE5/ML57Ad0mzv31Hku3otWXCBxA", "xHCrz");
        w.lllIllllI[w.llllIIIIl[12]] = w.llIIllIIIIlI("LQMwICYOFA==", "kfQTN");
        w.lllIllllI[w.llllIIIIl[25]] = w.llIIllIIIIll("1i1ryCbwgS6/xVXbRn/6fg==", "NbyMP");
        w.lllIllllI[w.llllIIIIl[15]] = w.llIIllIIIIlI("EQ8XOCU6FRE0ZCcCBj8oOA==", "TatPD");
        w.lllIllllI[w.llllIIIIl[26]] = w.llIIllIIIIlI("PhYwLB4dAQ==", "xsQXv");
        w.lllIllllI[w.llllIIIIl[27]] = w.llIIllIIIIll("cLQMYFczA3bWRLCB2Hxb3A==", "pjvQW");
        w.lllIllllI[w.llllIIIIl[28]] = w.llIIllIIIIll("oRRFqMnx5prZjWvONUsYCITfR2bgsmpC", "elPNu");
        w.lllIllllI[w.llllIIIIl[29]] = w.llIIllIIIIIl("VKKWqi37/pOP/vm1vqioTQ==", "FzArV");
        w.lllIllllI[w.llllIIIIl[30]] = w.llIIllIIIIIl("UADH9UJEglE=", "lqujP");
        w.lllIllllI[w.llllIIIIl[31]] = w.llIIllIIIIll("yeqdZjIMqPNwVgOXFfubCg==", "cvnEx");
        w.lllIllllI[w.llllIIIIl[32]] = w.llIIllIIIIll("l8QKkB0rtSTMDd5J90SZ9w==", "gFopb");
        w.lllIllllI[w.llllIIIIl[33]] = w.llIIllIIIIlI("HgotMi0kDGE4Nik=", "JkAYD");
        w.lllIllllI[w.llllIIIIl[34]] = w.llIIllIIIIll("jdVOxLs+Jrw=", "PjPir");
        w.lllIllllI[w.llllIIIIl[35]] = w.llIIllIIIIll("g3hDJz/vtDK7hiDqZeQjnQ==", "kVJDW");
        w.lllIllllI[w.llllIIIIl[36]] = w.llIIllIIIIlI("GAYsRBc5RzYLFTdHLg0PMw==", "VgZdc");
        w.lllIllllI[w.llllIIIIl[37]] = w.llIIllIIIIlI("Ag0aKQA4C1YuBiAN", "VlvBi");
        w.lllIllllI[w.llllIIIIl[38]] = w.llIIllIIIIll("iuarTfpM7pk=", "SZToG");
        w.lllIllllI[w.llllIIIIl[39]] = w.llIIllIIIIlI("Ijs+BhAMNzRPDhE8JBY=", "dRPoc");
        w.lllIllllI[w.llllIIIIl[40]] = w.llIIllIIIIlI("GhUOUBg7VAsYFS4dHR5MIB0UFQ==", "Ttxpl");
        w.lllIllllI[w.llllIIIIl[41]] = w.llIIllIIIIlI("HjQIEw4kMkQLDzMvDR0J", "JUdxg");
        w.lllIllllI[w.llllIIIIl[42]] = w.llIIllIIIIIl("3HeZmpfvCA2l1HGJDYLpRA==", "TeVSM");
        w.lllIllllI[w.llllIIIIl[43]] = w.llIIllIIIIll("Y3BJQs4Kdtkjc55d2VSjwUln/FTGIJTQ", "qisgO");
        w.lllIllllI[w.llllIIIIl[44]] = w.llIIllIIIIll("SbYHdMhx7BZyOgWMNN/9Idh5Kf1a5v9g", "fegQI");
        w.lllIllllI[w.llllIIIIl[45]] = w.llIIllIIIIll("r2OM2r4CXr2JGBjUdle1Nvl2zzaSE8ko", "EdSIO");
        w.lllIllllI[w.llllIIIIl[46]] = w.llIIllIIIIlI("MSIwBQcc", "yMBdd");
        w.lllIllllI[w.llllIIIIl[47]] = w.llIIllIIIIlI("KSwXGxYHIB1SDQA2EBYMGjY=", "oEyre");
        w.lllIllllI[w.llllIIIIl[48]] = w.llIIllIIIIlI("IAA+eT0BQTstKBwV", "naHYI");
        w.lllIllllI[w.llllIIIIl[49]] = w.llIIllIIIIIl("FfpFHjPwN23xMTSwSzAOyg==", "YNyxt");
        w.lllIllllI[w.llllIIIIl[50]] = w.llIIllIIIIll("5vp1SA/Usxk=", "ceEuk");
        w.lllIllllI[w.llllIIIIl[51]] = w.llIIllIIIIll("OhUssx3LM1X87lscWe6qlb0uU2yM0v/A", "iKJmy");
        w.lllIllllI[w.llllIIIIl[52]] = w.llIIllIIIIlI("Jx8qHDYYDzYdIEoJKwo=", "jfYhS");
        w.lllIllllI[w.llllIIIIl[53]] = w.llIIllIIIIIl("OYsuposA143gSftCINgwXA==", "qBUwm");
        w.lllIllllI[w.llllIIIIl[54]] = w.llIIllIIIIlI("GSgzBBM5PyI=", "XKGme");
        w.lllIllllI[w.llllIIIIl[55]] = w.llIIllIIIIll("z1lE3zf71fkheEzkhfAcuQ==", "EsUcU");
        w.lllIllllI[w.llllIIIIl[56]] = w.llIIllIIIIll("LeRDyufmwIj/zVl12x27qw==", "AbUWQ");
        w.lllIllllI[w.llllIIIIl[57]] = w.llIIllIIIIIl("4tfYpKeQ2Ms=", "ylHOp");
        w.lllIllllI[w.llllIIIIl[58]] = w.llIIllIIIIlI("LSUjDjIZLncLIgE7", "lKWgC");
        w.lllIllllI[w.llllIIIIl[60]] = w.llIIllIIIIll("iN2gOValjPGLsByZGXTAjQ==", "upoYV");
        w.lllIllllI[w.llllIIIIl[61]] = w.llIIllIIIIIl("avYIcbB56jabNtNxlRafDg==", "NbAqU");
        w.lllIllllI[w.llllIIIIl[62]] = w.llIIllIIIIlI("JTIK", "wGhHz");
        w.lllIllllI[w.llllIIIIl[63]] = w.llIIllIIIIlI("Ni89HyARIz8dYxYmMAMmFw==", "eJQzC");
        w.lllIllllI[w.llllIIIIl[64]] = w.llIIllIIIIIl("iNLt4xKcb2A=", "pgVsw");
        w.lllIllllI[w.llllIIIIl[65]] = w.llIIllIIIIlI("FyMfNTMmIQ==", "TLqSZ");
        w.lllIllllI[w.llllIIIIl[66]] = w.llIIllIIIIIl("wHc//tfdJ47nbEtvRiJhFg==", "jkHPg");
        w.lllIllllI[w.llllIIIIl[67]] = w.llIIllIIIIlI("ABQyFx88BnAZFz8R", "RaPuv");
        w.lllIllllI[w.llllIIIIl[68]] = w.llIIllIIIIlI("AC0YBTQ0JkwAJCwz", "ACllE");
        w.lllIllllI[w.llllIIIIl[69]] = w.llIIllIIIIIl("d7TLOQJn/qs=", "wGvnB");
        w.lllIllllI[w.llllIIIIl[70]] = w.llIIllIIIIlI("AhI/Mg8lHj0wTCIbMi4JIw==", "QwSWl");
        w.lllIllllI[w.llllIIIIl[71]] = w.llIIllIIIIIl("ZDdXWNShwOc=", "zXSRB");
        w.lllIllllI[w.llllIIIIl[72]] = w.llIIllIIIIIl("Lh45IVkPKnM=", "pdirI");
        w.lllIllllI[w.llllIIIIl[73]] = w.llIIllIIIIlI("AwQyBzggEw==", "EaSsP");
        w.lllIllllI[w.llllIIIIl[78]] = w.llIIllIIIIIl("tbKdQWaOyYdibXqY/lM+v8/RYtvIlut1", "ETvjJ");
        w.lllIllllI[w.llllIIIIl[79]] = w.llIIllIIIIlI("FDwkPSMgN3A4Mzgi", "URPTR");
        w.lllIllllI[w.llllIIIIl[80]] = w.llIIllIIIIlI("HQA7Jm8AD3U2Kg4FISlvRw==", "oiUAO");
        w.lllIllllI[w.llllIIIIl[81]] = w.llIIllIIIIIl("WB5J+glUhocKkXfGnBNKKnvQFr19Bbw/L2T8ueaU96Y=", "wtSnz");
        w.lllIllllI[w.llllIIIIl[82]] = w.llIIllIIIIlI("AgQEbjdOFQIoIAtP", "napID");
        w.lllIllllI[w.llllIIIIl[16]] = w.llIIllIIIIIl("wScr5Xy9yFuTXbTfRG5UPQ==", "vBblZ");
        w.lllIllllI[w.llllIIIIl[83]] = w.llIIllIIIIlI("Fw4cSB10DgEDdC0AB0g1NgAHHHQHBxMRLj0KHFc=", "TorhT");
        w.lllIllllI[w.llllIIIIl[84]] = w.llIIllIIIIll("u+F6BEFxR/hZ8bOFr2IcWg==", "sbYko");
        w.lllIllllI[w.llllIIIIl[85]] = w.llIIllIIIIll("zzT2c+1qmP0/6Fzsf1CpK8OoXHEbG+6Aj2Qu/NyLXT4=", "UuEIL");
        w.lllIllllI[w.llllIIIIl[86]] = w.llIIllIIIIlI("BR0YcT9pDB43KCxW", "IxlVL");
        w.lllIllllI[w.llllIIIIl[87]] = w.llIIllIIIIll("aDrufboXCKZIdmKgJTb75ghw3SwMJP2sPgO28G+jz88=", "pZyQw");
        w.lllIllllI[w.llllIIIIl[88]] = w.llIIllIIIIlI("Ik8CBQJMG0YECQ4LRgsCEhsOAwIMQQ==", "kofjl");
        w.lllIllllI[w.llllIIIIl[89]] = w.llIIllIIIIIl("35oWEVcJdI4Mv+OnAMJEi4ejNQ3OOESmEEE+zt/vb7VFsBRYUmmbTA==", "Wbvis");
        w.lllIllllI[w.llllIIIIl[90]] = w.llIIllIIIIIl("CJxrko3eZwXWg7wbJ1x+rnVr2S60rIQDIPL1iT1NOdmWKObNbGG1eg==", "UJxoj");
        w.lllIllllI[w.llllIIIIl[105]] = w.llIIllIIIIIl("qMMn8FwFVlByjy40kd2v2LRB48fjo89g73wm9FthPSI=", "lvzGh");
        w.lllIllllI[w.llllIIIIl[106]] = w.llIIllIIIIll("XchvfDHW5TA=", "jyZWJ");
        w.lllIllllI[w.llllIIIIl[107]] = w.llIIllIIIIIl("03Cu5KcWRyE=", "hVbpJ");
        w.lllIllllI[w.llllIIIIl[108]] = w.llIIllIIIIlI("Nws7cAVUCyY7bA0FIHAtFgUgJGwkBSckbCQDJjMtBgM5OTkHVQ==", "tjUPL");
        w.lllIllllI[w.llllIIIIl[109]] = w.llIIllIIIIlI("OwkSciMEDh4+NEwoSzUxBQ9LNDEaDh4gcBsIHzpwPA4ZJnA8CBgxMR4IBzslH14=", "lakRP");
        w.lllIllllI[w.llllIIIIl[110]] = w.llIIllIIIIlI("DTg/eCFuOCIzSDc2JHgJLDYkLEgeNiMsSA8rMj0dOypu", "NYQXh");
        w.lllIllllI[w.llllIIIIl[111]] = w.llIIllIIIIlI("JTY6WApGNicTYx84IVgiBDghDGMnJTcdNhMkaw==", "fWTxC");
        w.lllIllllI[w.llllIIIIl[112]] = w.llIIllIIIIlI("FiIPYh0pJQMuCmEDViUPKCRWJA83JQMwTjYjAipOADgVJxs0OUk=", "AJvBn");
        w.lllIllllI[w.llllIIIIl[113]] = w.llIIllIIIIlI("BAIeZhhnAgMtcT4MBWYwJQwFMnELDAYnOiINFyxu", "GcpFQ");
        w.lllIllllI[w.llllIIIIl[114]] = w.llIIllIIIIll("8J/jxGF3nmqTbOz4YegaJM5yqXmDvjS45BWMROGQtxMmomLkgRqgjUYb9JmNeuYx", "bBTJI");
        w.lllIllllI[w.llllIIIIl[115]] = w.llIIllIIIIlI("Ni0/ehxVLSIxdQwjJHo0FyMkLnUmJDAjLxwpP2U=", "uLQZU");
        w.lllIllllI[w.llllIIIIl[116]] = w.llIIllIIIIlI("Jy0vRBIYKiMIBVAMdgMAGSt2AgAGKiMWQQcsIgxBIy03HRsZIDhb", "pEVda");
        w.lllIllllI[w.llllIIIIl[117]] = w.llIIllIIIIIl("a6DgoCT/vXsNMSXmAOokJIonAulEeKOE/XunINNFcqM=", "QdhJr");
        w.lllIllllI[w.llllIIIIl[118]] = w.llIIllIIIIll("yGlhMKBRYMioodMooAigp+REW9TLVU8ZLv/Ts5ziTszJ0HHPJeZbQw==", "gQSUW");
        w.lllIllllI[w.llllIIIIl[119]] = w.llIIllIIIIll("b5mEi/8VmhhoUkIe9PsFr+Qx4+YrXJdKe+YxyUidvJqadXB84rkzqQdi20GDlrJZ", "ooiVZ");
        w.lllIllllI[w.llllIIIIl[120]] = w.llIIllIIIIll("nosShX1Ms6jlyfAUnhfCgC5TpK2QPZw6mmz/4m/50bI=", "jAchY");
        w.lllIllllI[w.llllIIIIl[121]] = w.llIIllIIIIIl("IHCFNbfVk2JkY7gGaP0/YPcFBO/akqoUXYRl8vJ4k9Gdvbg9t5EFXw==", "eOVKk");
        w.lllIllllI[w.llllIIIIl[122]] = w.llIIllIIIIll("WIYCuYpOzJ0YD2O4Rltce41kh7K/OnZlnyMHT8H+oziA6YTt+o30Hw==", "BbABa");
        w.lllIllllI[w.llllIIIIl[123]] = w.llIIllIIIIIl("VvZcm/AKGxucm/jVXcmufobBgJP/SW/MkrbcmHLIyf75V+XPeyW4Tw==", "wSdte");
        w.lllIllllI[w.llllIIIIl[124]] = w.llIIllIIIIlI("DSQWQwNhNQMIG2EgAAsFNWEbCwUzYQEIGSQvFkpebw==", "AAbdp");
    }

    private static boolean llIIllIlllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIllIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIllIllllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llllIIIIl[0]];
        stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[73]];
        if (w.llIIllIlllIl(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllIIIIl[0]];
            nArray[w.llllIIIIl[1]] = llllIIIIl[7];
            if (w.llIIllIlllIl(Inventory.getCount((int[])nArray)) && w.llIIllIlllIl(Inventory.getCount((int[])f.bc))) {
                int[] nArray2 = new int[llllIIIIl[0]];
                nArray2[w.llllIIIIl[1]] = llllIIIIl[8];
                if (w.llIIllIlllIl(Inventory.getCount((int[])nArray2))) {
                    n2 = llllIIIIl[0];
                    "".length();
                    if (" ".length() < (0x45 ^ 0x6A ^ (0x10 ^ 0x3B))) return n2 != 0;
                    return ((" ".length() ^ (0x8F ^ 0x88)) & (113 + 28 - -31 + 10 ^ 122 + 58 - 65 + 61 ^ -" ".length())) != 0;
                }
            }
        }
        n2 = llllIIIIl[1];
        return n2 != 0;
    }

    private static boolean llIIllIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIIllIIIIll(String llIIlIlIlIIII, String llIIlIlIIllIl) {
        try {
            SecretKeySpec llIIlIlIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), llllIIIIl[2]), "DES");
            Cipher llIIlIlIlIIlI = Cipher.getInstance("DES");
            llIIlIlIlIIlI.init(llllIIIIl[5], llIIlIlIlIIll);
            return new String(llIIlIlIlIIlI.doFinal(Base64.getDecoder().decode(llIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlIlIIIl) {
            llIIlIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIllIII(int n2, int n3) {
        return n2 < n3;
    }
}

