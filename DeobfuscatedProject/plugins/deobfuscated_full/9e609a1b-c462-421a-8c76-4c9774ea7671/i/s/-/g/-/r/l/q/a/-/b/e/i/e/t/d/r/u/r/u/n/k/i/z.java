/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.m;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class z
implements M {
    private static final /* synthetic */ int gh;
    static /* synthetic */ String[] dP;
    private static final /* synthetic */ int gm;
    private static final /* synthetic */ int gk;
    private static final /* synthetic */ int gl;
    private static final /* synthetic */ int gf;
    public static /* synthetic */ boolean by;
    static /* synthetic */ String fa;
    private static final /* synthetic */ int gd;
    private static final /* synthetic */ int gi;
    private static final /* synthetic */ int ge;
    static /* synthetic */ boolean cp;
    private static /* synthetic */ int[] lIIIlllIlIIll;
    private static final /* synthetic */ int gc;
    private static final /* synthetic */ WorldPoint gb;
    public static /* synthetic */ List<d> bA;
    private static final /* synthetic */ int gg;
    private static final /* synthetic */ int gj;
    static /* synthetic */ int co;
    static /* synthetic */ int bY;
    private static /* synthetic */ String[] lIIIlllIlIIIl;

    private static String lIlIIlIIIlIIlll(String var1, String var5) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var17 = var5.toCharArray();
        int var8 = lIIIlllIlIIll[0];
        char[] var10 = var1.toCharArray();
        int var21 = var10.length;
        int var19 = lIIIlllIlIIll[0];
        while (z.lIlIIlIIIlllIlI(var19, var21)) {
            char var4 = var10[var19];
            var9.append((char)(var4 ^ var17[var8 % var17.length]));
            0;
            ++var8;
            ++var19;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIlIIlIIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIIlIIIlllIII() {
        lIIIlllIlIIll = new int[97];
        z.lIIIlllIlIIll[0] = (80 + 111 - 165 + 218 ^ 25 + 130 - 55 + 50) & (0x64 ^ 0x4F ^ (0x38 ^ 0x71) ^ -1);
        z.lIIIlllIlIIll[1] = 1;
        z.lIIIlllIlIIll[2] = 95 + 79 - 68 + 54;
        z.lIIIlllIlIIll[3] = 2;
        z.lIIIlllIlIIll[4] = 3;
        z.lIIIlllIlIIll[5] = 0xFFFFDFEF & 0x3398;
        z.lIIIlllIlIIll[6] = 0xBE ^ 0xBA;
        z.lIIIlllIlIIll[7] = 0xFFFFBFFD & 0x5F4B;
        z.lIIIlllIlIIll[8] = 0xCB ^ 0xC1;
        z.lIIIlllIlIIll[9] = 0xAE ^ 0xAB;
        z.lIIIlllIlIIll[10] = -(0xFFFFDFB6 & 0x75CB) & (0xFFFFF7AF & 0x5FFF);
        z.lIIIlllIlIIll[11] = -(0xFFFFB817 & 0x5FFE) & (0xFFFFDBFF & 0x3FFD);
        z.lIIIlllIlIIll[12] = 0xE ^ 8;
        z.lIIIlllIlIIll[13] = -(0xFFFFFDD1 & 0x5F2F) & (0xFFFFDF6D & 0x7FBF);
        z.lIIIlllIlIIll[14] = 0xA3 ^ 0xA4;
        z.lIIIlllIlIIll[15] = -(0xFFFFEF47 & 0x75B9) & (0xFFFFFFBF & 0x676B);
        z.lIIIlllIlIIll[16] = 0xC8 ^ 0xC0;
        z.lIIIlllIlIIll[17] = -(0x10 ^ 0x35) & (0xFFFFEFFF & 0x17E5);
        z.lIIIlllIlIIll[18] = 0x9E ^ 0x97;
        z.lIIIlllIlIIll[19] = 0xD6 ^ 0xA0 ^ (0xE9 ^ 0x94);
        z.lIIIlllIlIIll[20] = -(0xFFFFD6F9 & 0x6937) & (0xFFFFDF7F & 0x7FF7);
        z.lIIIlllIlIIll[21] = 0xFFFFEDFF & 0x17BE;
        z.lIIIlllIlIIll[22] = 0xFFFFD7F1 & 0x2DCE;
        z.lIIIlllIlIIll[23] = -(0xFFFFBB75 & 0x7C9B) & (0xFFFFFDF7 & 0x3FDA);
        z.lIIIlllIlIIll[24] = 0xFFFFE7EF & 0x1DD4;
        z.lIIIlllIlIIll[25] = 0xFFFF897B & 0x77FF;
        z.lIIIlllIlIIll[26] = -(0xFFFFDE0B & 0x37F5) & (0xFFFFFFF6 & 0x17FD);
        z.lIIIlllIlIIll[27] = -(0xFFFFA71F & 0x5AED) & (0xFFFFFF5D & 0x33FF);
        z.lIIIlllIlIIll[28] = 0xFFFF9EBF & 0x6B54;
        z.lIIIlllIlIIll[29] = 0xFFFFBD3B & 0x4ECC;
        z.lIIIlllIlIIll[30] = 0x9E ^ 0xA5 ^ (0x1F ^ 0x30);
        z.lIIIlllIlIIll[31] = 0x32 ^ 0x3D;
        z.lIIIlllIlIIll[32] = 92 + 81 - 149 + 129 ^ 147 + 106 - 110 + 6;
        z.lIIIlllIlIIll[33] = 21 + 77 - 76 + 139 ^ 150 + 127 - 116 + 11;
        z.lIIIlllIlIIll[34] = 0xBA ^ 0xBF ^ (0x5E ^ 0x55);
        z.lIIIlllIlIIll[35] = 0x44 ^ 0x54;
        z.lIIIlllIlIIll[36] = 0xA7 ^ 0xB6;
        z.lIIIlllIlIIll[37] = 0xFFFFE726 & 0x3DFF;
        z.lIIIlllIlIIll[38] = 2 ^ (0xD3 ^ 0xC3);
        z.lIIIlllIlIIll[39] = -(0xFFFF8EFF & 0x7D6A) & (0xFFFFBFFF & 0x6FFF);
        z.lIIIlllIlIIll[40] = 0x2E ^ 0x3D;
        z.lIIIlllIlIIll[41] = 0x72 ^ 0x67;
        z.lIIIlllIlIIll[42] = 0x3D ^ 0x37 ^ (0xCF ^ 0xA1);
        z.lIIIlllIlIIll[43] = 0xFFFFE3BC & 0x1DD3;
        z.lIIIlllIlIIll[44] = 92 + 146 - 174 + 91 ^ 132 + 62 - 109 + 56;
        z.lIIIlllIlIIll[45] = 0x65 ^ 0x4D;
        z.lIIIlllIlIIll[46] = 0x32 ^ 0x7D ^ (0x6C ^ 0x34);
        z.lIIIlllIlIIll[47] = 0xFFFFD3F6 & 0x3FFF;
        z.lIIIlllIlIIll[48] = 0xA0 ^ 0xB8;
        z.lIIIlllIlIIll[49] = 0xF7 ^ 0x82 ^ (0x30 ^ 0x5C);
        z.lIIIlllIlIIll[50] = 0xFFFFFFDE & 0x2EED;
        z.lIIIlllIlIIll[51] = 0xFFFFE7ED & 0x5A7A;
        z.lIIIlllIlIIll[52] = 0x79 ^ 0x63;
        z.lIIIlllIlIIll[53] = -(0xFFFF9E03 & 0x69FF) & (0xFFFFFFFF & 0xF6E);
        z.lIIIlllIlIIll[54] = 1 ^ 6 ^ (0x70 ^ 0x6C);
        z.lIIIlllIlIIll[55] = 91 + 98 - 126 + 80 ^ 88 + 66 - 90 + 83;
        z.lIIIlllIlIIll[56] = 0xB5 ^ 0xA8;
        z.lIIIlllIlIIll[57] = 73 + 50 - 68 + 86 ^ 76 + 26 - 3 + 48;
        z.lIIIlllIlIIll[58] = 0xFFFF97D1 & 0x6FFE;
        z.lIIIlllIlIIll[59] = 0xFFFF86EE & 0x7B3D;
        z.lIIIlllIlIIll[60] = 0xB2 ^ 0xAD;
        z.lIIIlllIlIIll[61] = 0x77 ^ 0x57;
        z.lIIIlllIlIIll[62] = 0x47 ^ 0x66;
        z.lIIIlllIlIIll[63] = 0x95 ^ 0xB7;
        z.lIIIlllIlIIll[64] = 6 ^ 0x25;
        z.lIIIlllIlIIll[65] = 0x76 ^ 0x31 ^ (0x50 ^ 0x33);
        z.lIIIlllIlIIll[66] = 0x5F ^ 0x7A;
        z.lIIIlllIlIIll[67] = 131 + 90 - 209 + 131 ^ 69 + 165 - 113 + 48;
        z.lIIIlllIlIIll[68] = 79 + 0 - 56 + 132 ^ 88 + 86 - 149 + 163;
        z.lIIIlllIlIIll[69] = 0xCD ^ 0xA4 ^ (0xCA ^ 0x8A);
        z.lIIIlllIlIIll[70] = 0x4D ^ 0x67;
        z.lIIIlllIlIIll[71] = 121 + 27 - 11 + 33 ^ 91 + 89 - 103 + 52;
        z.lIIIlllIlIIll[72] = 0xE7 ^ 0x86 ^ (0x2C ^ 0x61);
        z.lIIIlllIlIIll[73] = 0x96 ^ 0xBB;
        z.lIIIlllIlIIll[74] = 0x45 ^ 0x6B;
        z.lIIIlllIlIIll[75] = 0x9F ^ 0xB0;
        z.lIIIlllIlIIll[76] = 70 + 164 - 219 + 167 ^ 48 + 0 - 28 + 114;
        z.lIIIlllIlIIll[77] = 0x40 ^ 0x71;
        z.lIIIlllIlIIll[78] = 0xA9 ^ 0x9B;
        z.lIIIlllIlIIll[79] = 7 + 133 - 25 + 56 ^ 150 + 109 - 237 + 130;
        z.lIIIlllIlIIll[80] = 8 ^ 0x3C;
        z.lIIIlllIlIIll[81] = 111 + 147 - 199 + 100 ^ 88 + 15 - 92 + 159;
        z.lIIIlllIlIIll[82] = 0x12 ^ 0 ^ (0xA8 ^ 0x8C);
        z.lIIIlllIlIIll[83] = 0x3F ^ 8;
        z.lIIIlllIlIIll[84] = 0xFF ^ 0xC7;
        z.lIIIlllIlIIll[85] = 0x28 ^ 0x11;
        z.lIIIlllIlIIll[86] = -(0xFFFFFBFB & 0x2CD5) & (0xFFFFEBFB & 0x3EFE);
        z.lIIIlllIlIIll[87] = -(0xFFFFD9D9 & 0x77FF) & (0xFFFFFFFC & 0x5DFB);
        z.lIIIlllIlIIll[88] = -(0xFFFFBCCD & 0x63B7) & (0xFFFFEDDF & 0x3EFF);
        z.lIIIlllIlIIll[89] = 0x7E ^ 0x44;
        z.lIIIlllIlIIll[90] = 0xB0 ^ 0x8B;
        z.lIIIlllIlIIll[91] = 0x9C ^ 0xA0;
        z.lIIIlllIlIIll[92] = 28 + 79 - 56 + 78 ^ 150 + 98 - 203 + 143;
        z.lIIIlllIlIIll[93] = 0x54 ^ 0x6A;
        z.lIIIlllIlIIll[94] = 0xE4 ^ 0xA8 ^ (0xF7 ^ 0x84);
        z.lIIIlllIlIIll[95] = 0x79 ^ 0x39;
        z.lIIIlllIlIIll[96] = 0x2E ^ 0x3B ^ (0x46 ^ 0x12);
    }

    private static boolean lIlIIlIIIllllII(Object object) {
        return object != null;
    }

    private static void lIlIIlIIIllIlll() {
        lIIIlllIlIIIl = new String[lIIIlllIlIIll[96]];
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[0]] = z."Buying items";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[1]] = z."Finished buying items, switching back to questing";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[3]] = z."Navigating to bank";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[4]] = z."Opening bank";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[6]] = z."Handling banking";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[9]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[12]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[14]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[16]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[18]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[8]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[19]] = z."Walking to imp start";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[32]] = z."Magic Portal";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[33]] = z."Enter";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[34]] = z."Handling quest";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[31]] = z."Nav to start";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[35]] = z."Finishing quest";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[36]] = z."Adding red bead to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[38]] = z."Adding yellow bead to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[40]] = z."Adding black bead to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[30]] = z."Adding white bead to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[41]] = z."Adding lobster to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[44]] = z."Adding lobster to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[46]] = z."Adding cheese to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[48]] = z."Adding cheese to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[49]] = z."Adding wealth to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[52]] = z."Adding varrock tabs to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[54]] = z."Adding fally tabs to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[55]] = z."Adding fally tabs to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[56]] = z."Adding staminas to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[57]] = z."Adding mind runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[60]] = z."Adding air runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[61]] = z."Adding water runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[62]] = z."Adding earth runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[63]] = z."Adding air runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[64]] = z."Adding water runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[65]] = z."Adding earth runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[66]] = z."Adding mind runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[67]] = z."Red bead";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[68]] = z."Yellow bead";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[45]] = z."Black bead";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[69]] = z."White bead";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[70]] = z."Cheese";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[71]] = z."Navigating to bank";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[72]] = z."Opening bank";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[73]] = z."Handling banking";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[74]] = z."Mind rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[75]] = z."Mind rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[76]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[77]] = z."Earth rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[78]] = z."Earth rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[79]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[80]] = z."Water rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[81]] = z."Water rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[82]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[83]] = z."We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[84]] = z."Imp Catcher quest";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[85]] = z."ring of wealth (";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[89]] = z."Wizard Mizgog";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[90]] = z."Give me a quest please.";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[91]] = z."I'll try.";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[92]] = z."Actually, I know where to find this stuff.";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[93]] = z."Yes.";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[94]] = z."What's the matter?";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[95]] = z."Ok, I'll see what I can do.";
    }

    private static boolean lIlIIlIIIlllIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (z.lIlIIlIIlIIIIIl(e.j(lIIIlllIlIIll[2]), lIIIlllIlIIll[3])) {
            bl = lIIIlllIlIIll[1];
            0;
            if (-1 >= 0) {
                return false;
            }
        } else {
            bl = lIIIlllIlIIll[0];
        }
        return bl;
    }

    private static String lIlIIlIIIlIlIII(String var3, String var7) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIIlllIlIIll[16]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(lIIIlllIlIIll[3], var2);
            return new String(var22.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIllllll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public int Y() {
        try {
            z.bD();
            0;
        }
        catch (Exception var12) {
            var12.printStackTrace();
        }
        if (((0x52 ^ 0x5F) & ~(0x53 ^ 0x5E)) != ((0x26 ^ 0x29) & ~(0x35 ^ 0x3A))) {
            return (0xDE ^ 0xC0) & ~(0x23 ^ 0x3D);
        }
        return lIIIlllIlIIll[42];
    }

    private static boolean lIlIIlIIIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIIlllIIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIIlIIIlIIllI(String var20, String var24) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIIIlllIlIIll[3], var18);
            return new String(var14.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean X() {
        return lIIIlllIlIIll[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aJ() {
        int n2;
        String[] stringArray = new String[lIIIlllIlIIll[1]];
        stringArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[67]];
        if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIlllIlIIll[1]];
            stringArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[68]];
            if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIIlllIlIIll[1]];
                stringArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[45]];
                if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIIlllIlIIll[1]];
                    stringArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[69]];
                    if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        int[] nArray = new int[lIIIlllIlIIll[1]];
                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                        if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIlllIlIIll[1]];
                            nArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                int[] nArray3 = new int[lIIIlllIlIIll[1]];
                                nArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    int[] nArray4 = new int[lIIIlllIlIIll[1]];
                                    nArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                    if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[lIIIlllIlIIll[1]];
                                        nArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                        if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            String[] stringArray5 = new String[lIIIlllIlIIll[1]];
                                            stringArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[70]];
                                            if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                                n2 = lIIIlllIlIIll[1];
                                                0;
                                                if ((0x65 ^ 0x60) > 0) return n2 != 0;
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIlllIlIIll[0];
        return n2 != 0;
    }

    private static boolean lIlIIlIIIllllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIIlIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIIlIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void W() {
        d var6;
        block37: {
            block36: {
                block35: {
                    block34: {
                        Object var16;
                        block33: {
                            block32: {
                                int[] nArray = new int[lIIIlllIlIIll[1]];
                                nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[36]]);
                                    d d2 = new d(lIIIlllIlIIll[21], lIIIlllIlIIll[1], lIIIlllIlIIll[37]);
                                    bA.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[lIIIlllIlIIll[1]];
                                nArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[38]]);
                                    var16 = new d(lIIIlllIlIIll[22], lIIIlllIlIIll[1], lIIIlllIlIIll[39]);
                                    bA.add((d)var16);
                                    0;
                                }
                                int[] nArray3 = new int[lIIIlllIlIIll[1]];
                                nArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[40]]);
                                    var16 = new d(lIIIlllIlIIll[23], lIIIlllIlIIll[1], lIIIlllIlIIll[39]);
                                    bA.add((d)var16);
                                    0;
                                }
                                int[] nArray4 = new int[lIIIlllIlIIll[1]];
                                nArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[30]]);
                                    var16 = new d(lIIIlllIlIIll[24], lIIIlllIlIIll[1], lIIIlllIlIIll[39]);
                                    bA.add((d)var16);
                                    0;
                                }
                                int[] nArray5 = new int[lIIIlllIlIIll[1]];
                                nArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[41]]);
                                    var16 = new d(lIIIlllIlIIll[25], lIIIlllIlIIll[42], lIIIlllIlIIll[43]);
                                    bA.add((d)var16);
                                    0;
                                }
                                int[] nArray6 = new int[lIIIlllIlIIll[1]];
                                nArray6[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[lIIIlllIlIIll[1]];
                                    nArray7[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                    if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlllIlIIll[30])) {
                                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[44]]);
                                        var16 = new d(lIIIlllIlIIll[25], lIIIlllIlIIll[45], lIIIlllIlIIll[43]);
                                        bA.add((d)var16);
                                        0;
                                    }
                                }
                                int[] nArray8 = new int[lIIIlllIlIIll[1]];
                                nArray8[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[46]]);
                                    var16 = new d(lIIIlllIlIIll[17], lIIIlllIlIIll[9], lIIIlllIlIIll[47]);
                                    bA.add((d)var16);
                                    0;
                                }
                                int[] nArray9 = new int[lIIIlllIlIIll[1]];
                                nArray9[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block32;
                                int[] nArray10 = new int[lIIIlllIlIIll[1]];
                                nArray10[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block33;
                                int[] nArray11 = new int[lIIIlllIlIIll[1]];
                                nArray11[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (!z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlllIlIIll[9])) break block33;
                            }
                            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[48]]);
                            var16 = new d(lIIIlllIlIIll[17], lIIIlllIlIIll[9], lIIIlllIlIIll[47]);
                            bA.add((d)var16);
                            0;
                        }
                        if (z.lIlIIlIIIlllIll(Bank.contains((Predicate)(var16 = item -> item.getName().toLowerCase().contains(lIIIlllIlIIIl[lIIIlllIlIIll[85]]))) ? 1 : 0)) {
                            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[49]]);
                            var6 = new d(lIIIlllIlIIll[50], lIIIlllIlIIll[38], lIIIlllIlIIll[51]);
                            bA.add(var6);
                            0;
                        }
                        int[] nArray = new int[lIIIlllIlIIll[1]];
                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                        if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray12 = new int[lIIIlllIlIIll[1]];
                        nArray12[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                        if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block35;
                        int[] nArray13 = new int[lIIIlllIlIIll[1]];
                        nArray13[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                        if (!z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray13).getQuantity(), lIIIlllIlIIll[30])) break block35;
                    }
                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[52]]);
                    var6 = new d(lIIIlllIlIIll[20], lIIIlllIlIIll[45], lIIIlllIlIIll[53]);
                    bA.add(var6);
                    0;
                }
                int[] nArray = new int[lIIIlllIlIIll[1]];
                nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[54]]);
                    var6 = new d(lIIIlllIlIIll[7], lIIIlllIlIIll[30], lIIIlllIlIIll[53]);
                    bA.add(var6);
                    0;
                }
                int[] nArray14 = new int[lIIIlllIlIIll[1]];
                nArray14[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block36;
                int[] nArray15 = new int[lIIIlllIlIIll[1]];
                nArray15[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block37;
                int[] nArray16 = new int[lIIIlllIlIIll[1]];
                nArray16[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (!z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray16).getQuantity(), lIIIlllIlIIll[30])) break block37;
            }
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[55]]);
            var6 = new d(lIIIlllIlIIll[7], lIIIlllIlIIll[30], lIIIlllIlIIll[53]);
            bA.add(var6);
            0;
        }
        int[] nArray = new int[lIIIlllIlIIll[1]];
        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[56]]);
            var6 = new d(lIIIlllIlIIll[27], lIIIlllIlIIll[9], h.bv);
            bA.add(var6);
            0;
        }
        int[] nArray17 = new int[lIIIlllIlIIll[1]];
        nArray17[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
        if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
            int[] nArray18 = new int[lIIIlllIlIIll[1]];
            nArray18[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
            if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray18).getQuantity(), lIIIlllIlIIll[11])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[57]]);
                var6 = new d(lIIIlllIlIIll[10], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
                bA.add(var6);
                0;
            }
        }
        int[] nArray19 = new int[lIIIlllIlIIll[1]];
        nArray19[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
        if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIIIlllIlIIll[1]];
            nArray20[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
            if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray20).getQuantity(), lIIIlllIlIIll[11])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[60]]);
                var6 = new d(lIIIlllIlIIll[59], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
                bA.add(var6);
                0;
            }
        }
        int[] nArray21 = new int[lIIIlllIlIIll[1]];
        nArray21[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
        if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
            int[] nArray22 = new int[lIIIlllIlIIll[1]];
            nArray22[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
            if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray22).getQuantity(), lIIIlllIlIIll[11])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[61]]);
                var6 = new d(lIIIlllIlIIll[15], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
                bA.add(var6);
                0;
            }
        }
        int[] nArray23 = new int[lIIIlllIlIIll[1]];
        nArray23[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
        if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
            int[] nArray24 = new int[lIIIlllIlIIll[1]];
            nArray24[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
            if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray24).getQuantity(), lIIIlllIlIIll[11])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[62]]);
                var6 = new d(lIIIlllIlIIll[13], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
                bA.add(var6);
                0;
            }
        }
        int[] nArray25 = new int[lIIIlllIlIIll[1]];
        nArray25[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[63]]);
            var6 = new d(lIIIlllIlIIll[59], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
            bA.add(var6);
            0;
        }
        int[] nArray26 = new int[lIIIlllIlIIll[1]];
        nArray26[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray26) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[64]]);
            var6 = new d(lIIIlllIlIIll[15], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
            bA.add(var6);
            0;
        }
        int[] nArray27 = new int[lIIIlllIlIIll[1]];
        nArray27[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray27) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[65]]);
            var6 = new d(lIIIlllIlIIll[13], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
            bA.add(var6);
            0;
        }
        int[] nArray28 = new int[lIIIlllIlIIll[1]];
        nArray28[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray28) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[66]]);
            var6 = new d(lIIIlllIlIIll[10], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
            bA.add(var6);
            0;
        }
    }

    public static void bD() {
        if (z.lIlIIlIIIlllIIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[0]];
            b.a(bA);
            if (z.lIlIIlIIIlllIlI(bA.size(), lIIIlllIlIIll[1])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[1]]);
                by = lIIIlllIlIIll[0];
            }
        }
        if (z.lIlIIlIIIlllIll(by ? 1 : 0)) {
            if (z.lIlIIlIIIlllIll(e.j(lIIIlllIlIIll[2]))) {
                BankLocation var15;
                if (z.lIlIIlIIIlllIll(z.aJ() ? 1 : 0)) {
                    var15 = BankLocation.getNearest();
                    if (z.lIlIIlIIIllllII(var15) && z.lIlIIlIIIlllIll(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[3]];
                        a.a(var15);
                    }
                    if (z.lIlIIlIIIllllII(var15) && z.lIlIIlIIIlllIIl(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[4]];
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlIIll[5]);
                            0;
                        }
                        if (z.lIlIIlIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[6]];
                            if (z.lIlIIlIIIllllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlllIlIIll[4]);
                                0;
                            }
                            if (z.lIlIIlIIIllllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlllIlIIll[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIlllIlIIll[1]];
                                nArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIlIIll[8])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[9]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIIlllIlIIll[1]];
                            nArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIlllIlIIll[1]];
                                nArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIlIIll[11])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[12]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIIIlllIlIIll[1]];
                            nArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIlllIlIIll[1]];
                                nArray6[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray6).getQuantity(), lIIIlllIlIIll[11])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[14]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIIIlllIlIIll[1]];
                            nArray7[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIlllIlIIll[1]];
                                nArray8[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray8).getQuantity(), lIIIlllIlIIll[11])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[16]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray9 = new int[lIIIlllIlIIll[1]];
                            nArray9[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIlllIlIIll[1]];
                                nArray10[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlllIlIIll[9])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[18]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray11 = new int[lIIIlllIlIIll[19]];
                            nArray11[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                            nArray11[z.lIIIlllIlIIll[1]] = lIIIlllIlIIll[21];
                            nArray11[z.lIIIlllIlIIll[3]] = lIIIlllIlIIll[22];
                            nArray11[z.lIIIlllIlIIll[4]] = lIIIlllIlIIll[23];
                            nArray11[z.lIIIlllIlIIll[6]] = lIIIlllIlIIll[24];
                            nArray11[z.lIIIlllIlIIll[9]] = lIIIlllIlIIll[7];
                            nArray11[z.lIIIlllIlIIll[12]] = lIIIlllIlIIll[17];
                            nArray11[z.lIIIlllIlIIll[14]] = lIIIlllIlIIll[25];
                            nArray11[z.lIIIlllIlIIll[16]] = lIIIlllIlIIll[10];
                            nArray11[z.lIIIlllIlIIll[18]] = lIIIlllIlIIll[15];
                            nArray11[z.lIIIlllIlIIll[8]] = lIIIlllIlIIll[13];
                            if (z.lIlIIlIIIlllIll(e.b(nArray11) ? 1 : 0)) {
                                z.W();
                                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[8]]);
                                by = lIIIlllIlIIll[1];
                                return;
                            }
                            while (z.lIlIIlIIIlllIll(m.av() ? 1 : 0)) {
                                m.at();
                                Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                0;
                                0;
                                if (1 < (0xC2 ^ 0x99 ^ (0xF7 ^ 0xA8))) continue;
                                return;
                            }
                            if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)lIIIlllIlIIll[6]);
                                0;
                            }
                            int[] nArray12 = new int[lIIIlllIlIIll[1]];
                            nArray12[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                int[] nArray13 = new int[lIIIlllIlIIll[1]];
                                nArray13[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray13), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[22], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray14 = new int[lIIIlllIlIIll[1]];
                            nArray14[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[lIIIlllIlIIll[1]];
                                nArray15[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray15), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[23], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            if (3 <= ((0xF3 ^ 0xAD) & ~(0x46 ^ 0x18))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray16 = new int[lIIIlllIlIIll[1]];
                            nArray16[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                int[] nArray17 = new int[lIIIlllIlIIll[1]];
                                nArray17[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray17), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[21], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            if (((0x8F ^ 0xAB ^ (0x1F ^ 8)) & (131 + 27 - 73 + 66 ^ 64 + 76 - 30 + 54 ^ -1)) != 0) {
                                                return ((1 ^ 0x55 ^ (0x38 ^ 0x71)) & (0x52 ^ 0x3D ^ (0x3B ^ 0x49) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray18 = new int[lIIIlllIlIIll[1]];
                            nArray18[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                int[] nArray19 = new int[lIIIlllIlIIll[1]];
                                nArray19[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray19), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[24], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            if (-3 >= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray20 = new int[lIIIlllIlIIll[1]];
                            nArray20[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                int[] nArray21 = new int[lIIIlllIlIIll[1]];
                                nArray21[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray21), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[7], (int)lIIIlllIlIIll[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            if (-3 > 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray22 = new int[lIIIlllIlIIll[1]];
                            nArray22[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                int[] nArray23 = new int[lIIIlllIlIIll[1]];
                                nArray23[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray23), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[17], (int)lIIIlllIlIIll[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            if (1 < ((0xA0 ^ 0xC6 ^ (0x91 ^ 0xBF)) & (0x9E ^ 0x81 ^ (5 ^ 0x52) ^ -1))) {
                                                return ((0xF0 ^ 0x81 ^ (8 ^ 0x61)) & (0x7F ^ 0x53 ^ (0x7B ^ 0x4F) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray24 = new int[lIIIlllIlIIll[1]];
                            nArray24[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                int[] nArray25 = new int[lIIIlllIlIIll[1]];
                                nArray25[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray25), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[10], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            if (((0x13 ^ 0x7F ^ (0xB6 ^ 0x98)) & (210 + 111 - 131 + 53 ^ 156 + 91 - 245 + 175 ^ -1)) != ((0xBD ^ 0x8E ^ (0xF9 ^ 0x84)) & (0x20 ^ 0x62 ^ (0xA6 ^ 0xAA) ^ -1))) {
                                                return ((0xBC ^ 0xC1 ^ (9 ^ 0x6E)) & (46 + 3 - 46 + 139 ^ 90 + 125 - 104 + 37 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray26 = new int[lIIIlllIlIIll[1]];
                            nArray26[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                int[] nArray27 = new int[lIIIlllIlIIll[1]];
                                nArray27[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray27), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[15], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            if (2 == 3) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray28 = new int[lIIIlllIlIIll[1]];
                            nArray28[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray28) ? 1 : 0)) {
                                int[] nArray29 = new int[lIIIlllIlIIll[1]];
                                nArray29[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray29), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[13], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            if (3 == ((0x2B ^ 0x35) & ~(0 ^ 0x1E))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray30 = new int[lIIIlllIlIIll[1]];
                            nArray30[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray30) ? 1 : 0)) {
                                int[] nArray31 = new int[lIIIlllIlIIll[1]];
                                nArray31[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                                if (z.lIlIIlIIIlllIll(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIIlllIlIIll[27], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                            int[] nArray32 = new int[lIIIlllIlIIll[1]];
                            nArray32[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                int[] nArray33 = new int[lIIIlllIlIIll[1]];
                                nArray33[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray33), lIIIlllIlIIll[1])) {
                                    Bank.withdrawAll((int)lIIIlllIlIIll[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];
                                            0;
                                            if (-1 >= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (z.lIlIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[6]) && z.lIlIIlIIIllllll(Players.getLocal().getWorldLocation().getPlane(), lIIIlllIlIIll[3]) && z.lIlIIlIIIlllIIl(z.aJ() ? 1 : 0)) {
                    if (z.lIlIIlIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIIIlllIlIIll[6]);
                        0;
                    }
                    AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[19]];
                    if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                        if (z.lIlIIlIIIlllIlI(bY, lIIIlllIlIIll[1])) {
                            e.w();
                            bY += lIIIlllIlIIll[1];
                        }
                        if (z.lIlIIlIIIlllIIl((var15 = new WorldArea(lIIIlllIlIIll[28], lIIIlllIlIIll[29], lIIIlllIlIIll[30], lIIIlllIlIIll[31], lIIIlllIlIIll[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllIlIIll[1]];
                            stringArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[32]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIlllIlIIIl[lIIIlllIlIIll[33]]);
                            Time.sleepTicks((int)e.c(lIIIlllIlIIll[12], lIIIlllIlIIll[16]));
                            0;
                        }
                        Movement.walkTo((WorldPoint)gb);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIll[3]);
                        0;
                    }
                }
                if (z.lIlIIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[12])) {
                    AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[34]];
                    co = lIIIlllIlIIll[0];
                    g.a(fa, dP);
                    if (z.lIlIIlIIIlllIIl(g.L() ? 1 : 0)) {
                        g.a(dP);
                    }
                }
            }
            if (z.lIlIIlIIIllllIl(e.j(lIIIlllIlIIll[2])) && z.lIlIIlIIIlllIlI(e.j(lIIIlllIlIIll[2]), lIIIlllIlIIll[3])) {
                if (z.lIlIIlIIIlllIll(z.aJ() ? 1 : 0)) {
                    z.bm();
                }
                if (z.lIlIIlIIIlllIIl(z.aJ() ? 1 : 0)) {
                    if (z.lIlIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[12])) {
                        AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[31]];
                        if (z.lIlIIlIIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)gb);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                    }
                    if (z.lIlIIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[12])) {
                        AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[35]];
                        if (z.lIlIIlIIIlllIlI(co, lIIIlllIlIIll[1])) {
                            P.lw += lIIIlllIlIIll[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllIlIIll[1];
                            P.lw = lIIIlllIlIIll[0];
                            cp = lIIIlllIlIIll[0];
                        }
                        g.a(fa, dP);
                        if (z.lIlIIlIIIlllIIl(g.L() ? 1 : 0)) {
                            g.a(dP);
                        }
                    }
                }
            }
            System.out.println("Setting: " + e.j(lIIIlllIlIIll[2]));
            g.a(new String[lIIIlllIlIIll[0]]);
        }
    }

    static {
        z.lIlIIlIIIlllIII();
        z.lIlIIlIIIllIlll();
        gf = lIIIlllIlIIll[23];
        gj = lIIIlllIlIIll[13];
        gi = lIIIlllIlIIll[15];
        gg = lIIIlllIlIIll[24];
        ge = lIIIlllIlIIll[22];
        gk = lIIIlllIlIIll[86];
        gh = lIIIlllIlIIll[10];
        gc = lIIIlllIlIIll[2];
        gd = lIIIlllIlIIll[21];
        gm = lIIIlllIlIIll[17];
        gl = lIIIlllIlIIll[25];
        gb = new WorldPoint(lIIIlllIlIIll[87], lIIIlllIlIIll[88], lIIIlllIlIIll[3]);
        bA = new ArrayList<d>();
        fa = lIIIlllIlIIIl[lIIIlllIlIIll[89]];
        String[] stringArray = new String[lIIIlllIlIIll[12]];
        stringArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[90]];
        stringArray[z.lIIIlllIlIIll[1]] = lIIIlllIlIIIl[lIIIlllIlIIll[91]];
        stringArray[z.lIIIlllIlIIll[3]] = lIIIlllIlIIIl[lIIIlllIlIIll[92]];
        stringArray[z.lIIIlllIlIIll[4]] = lIIIlllIlIIIl[lIIIlllIlIIll[93]];
        stringArray[z.lIIIlllIlIIll[6]] = lIIIlllIlIIIl[lIIIlllIlIIll[94]];
        stringArray[z.lIIIlllIlIIll[9]] = lIIIlllIlIIIl[lIIIlllIlIIll[95]];
        dP = stringArray;
        bY = lIIIlllIlIIll[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void var23;
        BankLocation bankLocation = BankLocation.getNearest();
        if (z.lIlIIlIIIllllII(bankLocation) && z.lIlIIlIIIlllIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[71]];
            a.a(bankLocation);
        }
        if (z.lIlIIlIIIllllII(var23) && z.lIlIIlIIIlllIIl(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[72]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlIIll[5]);
                0;
            }
            if (z.lIlIIlIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[73]];
                if (z.lIlIIlIIIllllIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIlllIlIIll[4]);
                    0;
                }
                if (z.lIlIIlIIIllllIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIlllIlIIll[3]);
                    0;
                }
                String[] stringArray = new String[lIIIlllIlIIll[1]];
                stringArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[74]];
                if (z.lIlIIlIIIlllIIl(Bank.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlllIlIIll[1]];
                    stringArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[75]];
                    if (z.lIlIIlIIIlllIlI(Bank.getFirst((String[])stringArray2).getQuantity(), lIIIlllIlIIll[11])) {
                        z.W();
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[76]]);
                        by = lIIIlllIlIIll[1];
                        return;
                    }
                }
                String[] stringArray3 = new String[lIIIlllIlIIll[1]];
                stringArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[77]];
                if (z.lIlIIlIIIlllIIl(Bank.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIIlllIlIIll[1]];
                    stringArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[78]];
                    if (z.lIlIIlIIIlllIlI(Bank.getFirst((String[])stringArray4).getQuantity(), lIIIlllIlIIll[11])) {
                        z.W();
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[79]]);
                        by = lIIIlllIlIIll[1];
                        return;
                    }
                }
                String[] stringArray5 = new String[lIIIlllIlIIll[1]];
                stringArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[80]];
                if (z.lIlIIlIIIlllIIl(Bank.contains((String[])stringArray5) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIIIlllIlIIll[1]];
                    stringArray6[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[81]];
                    if (z.lIlIIlIIIlllIlI(Bank.getFirst((String[])stringArray6).getQuantity(), lIIIlllIlIIll[11])) {
                        z.W();
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[82]]);
                        by = lIIIlllIlIIll[1];
                        return;
                    }
                }
                int[] nArray = new int[lIIIlllIlIIll[19]];
                nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                nArray[z.lIIIlllIlIIll[1]] = lIIIlllIlIIll[21];
                nArray[z.lIIIlllIlIIll[3]] = lIIIlllIlIIll[22];
                nArray[z.lIIIlllIlIIll[4]] = lIIIlllIlIIll[23];
                nArray[z.lIIIlllIlIIll[6]] = lIIIlllIlIIll[24];
                nArray[z.lIIIlllIlIIll[9]] = lIIIlllIlIIll[7];
                nArray[z.lIIIlllIlIIll[12]] = lIIIlllIlIIll[17];
                nArray[z.lIIIlllIlIIll[14]] = lIIIlllIlIIll[25];
                nArray[z.lIIIlllIlIIll[16]] = lIIIlllIlIIll[10];
                nArray[z.lIIIlllIlIIll[18]] = lIIIlllIlIIll[15];
                nArray[z.lIIIlllIlIIll[8]] = lIIIlllIlIIll[13];
                if (z.lIlIIlIIIlllIll(e.b(nArray) ? 1 : 0)) {
                    z.W();
                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[83]]);
                    by = lIIIlllIlIIll[1];
                    return;
                }
                while (z.lIlIIlIIIlllIll(m.av() ? 1 : 0)) {
                    m.at();
                    Time.sleepTicks((int)lIIIlllIlIIll[1]);
                    0;
                    0;
                    if (1 >= 0) continue;
                    return;
                }
                if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lIIIlllIlIIll[6]);
                    0;
                }
                int[] nArray2 = new int[lIIIlllIlIIll[1]];
                nArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIlllIlIIll[1]];
                    nArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray3), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[22], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                if ((127 + 162 - 125 + 7 ^ 157 + 155 - 291 + 154) <= ((0x43 ^ 0x24 ^ (0xE2 ^ 0x83)) & (0x55 ^ 0x58 ^ (0x71 ^ 0x7A) ^ -1))) {
                                    return ((0x1F ^ 5 ^ (0x64 ^ 0x6D)) & (63 + 67 - 80 + 114 ^ 43 + 106 - 1 + 35 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray4 = new int[lIIIlllIlIIll[1]];
                nArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lIIIlllIlIIll[1]];
                    nArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray5), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[23], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                if (2 > 2) {
                                    return ((24 + 44 - 60 + 138 ^ 129 + 9 - 133 + 166) & (0x14 ^ 0x38 ^ (0x41 ^ 0x54) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray6 = new int[lIIIlllIlIIll[1]];
                nArray6[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[lIIIlllIlIIll[1]];
                    nArray7[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray7), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[21], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                if (-(3 ^ (0x5F ^ 0x58)) > 0) {
                                    return ((146 + 207 - 221 + 117 ^ 160 + 31 - 118 + 113) & (0x39 ^ 0x7C ^ (0x27 ^ 0x21) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray8 = new int[lIIIlllIlIIll[1]];
                nArray8[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    int[] nArray9 = new int[lIIIlllIlIIll[1]];
                    nArray9[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray9), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[24], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                if ((0xA5 ^ 0xA1) != (0xBF ^ 0xBB)) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray10 = new int[lIIIlllIlIIll[1]];
                nArray10[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    int[] nArray11 = new int[lIIIlllIlIIll[1]];
                    nArray11[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray11), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[7], (int)lIIIlllIlIIll[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                if (2 < 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray12 = new int[lIIIlllIlIIll[1]];
                nArray12[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    int[] nArray13 = new int[lIIIlllIlIIll[1]];
                    nArray13[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray13), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[17], (int)lIIIlllIlIIll[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                if (-2 > 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray14 = new int[lIIIlllIlIIll[1]];
                nArray14[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    int[] nArray15 = new int[lIIIlllIlIIll[1]];
                    nArray15[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray15), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[10], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                if (((0x44 ^ 0x7B) & ~(0x7A ^ 0x45)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray16 = new int[lIIIlllIlIIll[1]];
                nArray16[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIlllIlIIll[1]];
                    nArray17[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray17), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[15], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                if (-2 > 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray18 = new int[lIIIlllIlIIll[1]];
                nArray18[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                    int[] nArray19 = new int[lIIIlllIlIIll[1]];
                    nArray19[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray19), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[13], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray20 = new int[lIIIlllIlIIll[1]];
                nArray20[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIIlllIlIIll[1]];
                    nArray21[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                    if (z.lIlIIlIIIlllIll(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        Bank.withdraw((int)lIIIlllIlIIll[27], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                            return Inventory.contains((int[])nArray);
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
                int[] nArray22 = new int[lIIIlllIlIIll[1]];
                nArray22[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIIIlllIlIIll[1]];
                    nArray23[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray23), lIIIlllIlIIll[1])) {
                        Bank.withdrawAll((int)lIIIlllIlIIll[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];
                                0;
                                if (3 <= 0) {
                                    return ((124 + 80 - 142 + 95 ^ 131 + 170 - 281 + 160) & (0x10 ^ 0x61 ^ (0xC ^ 0x54) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);
                        0;
                    }
                }
            }
        }
    }

    @Override
    public String Z() {
        return lIIIlllIlIIIl[lIIIlllIlIIll[84]];
    }
}

