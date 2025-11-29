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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.y_Unknown;
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

public class G_Unknown
implements K {
    private static final /* synthetic */ int iO;
    private static final /* synthetic */ int iV;
    private static final /* synthetic */ int iP;
    private static final /* synthetic */ int iX;
    static /* synthetic */ boolean dd;
    private static final /* synthetic */ int iQ;
    private static final /* synthetic */ int iW;
    private static /* synthetic */ String[] lIlIlIlIlI;
    private static final /* synthetic */ int iR;
    private static final /* synthetic */ int iU;
    public static /* synthetic */ boolean bn;
    private static final /* synthetic */ int iT;
    static /* synthetic */ int cA;
    private static final /* synthetic */ WorldPoint iM;
    private static /* synthetic */ int[] lIlIlIllII;
    private static final /* synthetic */ int iS;
    static /* synthetic */ String iy;
    static /* synthetic */ String[] hn;
    private static final /* synthetic */ int iN;
    static /* synthetic */ int dc;
    public static /* synthetic */ List<d> bp;

    private static boolean lIIlIIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ac() {
        return lIlIlIllII[0];
    }

    private static void lIIlIIIlIlllI() {
        lIlIlIllII = new int[97];
        G.lIlIlIllII[0] = (31 + 35 - 61 + 124 ^ 138 + 147 - 256 + 135) & (0x30 ^ 0x5A ^ (0x7E ^ 0x31) ^ -1);
        G.lIlIlIllII[1] = 1;
        G.lIlIlIllII[2] = (0x11 ^ 0x34) + (0x3E ^ 0xC) - (0xBF ^ 0xA6) + (0x40 ^ 0x22);
        G.lIlIlIllII[3] = 2;
        G.lIlIlIllII[4] = 3;
        G.lIlIlIllII[5] = -(0xFFFF9EFE & 0x6D57) & (0xFFFFFFDF & 0x1FFD);
        G.lIlIlIllII[6] = 15 + 145 - 127 + 155 ^ 120 + 93 - 201 + 172;
        G.lIlIlIllII[7] = -(0xFFFFECF9 & 0x73B7) & (0xFFFFFFFD & 0x7FFB);
        G.lIlIlIllII[8] = 0x4E ^ 0x44;
        G.lIlIlIllII[9] = 0x44 ^ 0x1F ^ (0x6C ^ 0x32);
        G.lIlIlIllII[10] = -(0xFFFFDF1F & 0x6DF2) & (0xFFFFFFBF & 0x4F7F);
        G.lIlIlIllII[11] = 0xFFFFE7ED & 0x1BFA;
        G.lIlIlIllII[12] = 0x6B ^ 0x2A ^ (0x3F ^ 0x78);
        G.lIlIlIllII[13] = -(0xFFFFFC9B & 0x5FE7) & (0xFFFFDFAF & 0x7EFF);
        G.lIlIlIllII[14] = 0xB0 ^ 0xB7;
        G.lIlIlIllII[15] = -(0xFFFFF839 & 0x77D7) & (0xFFFFFE3B & 0x73FF);
        G.lIlIlIllII[16] = 0x63 ^ 5 ^ (0xFA ^ 0x94);
        G.lIlIlIllII[17] = -(0xFFFFF98F & 0x6E73) & (0xFFFFEFDB & 0x7FE7);
        G.lIlIlIllII[18] = 0x6A ^ 0x23 ^ (0x11 ^ 0x51);
        G.lIlIlIllII[19] = 137 + 110 - 66 + 0 ^ 183 + 60 - 235 + 182;
        G.lIlIlIllII[20] = 0xFFFF9FDF & 0x7F67;
        G.lIlIlIllII[21] = -(0xFFFFF673 & 0x59CD) & (0xFFFFD7FF & 0x7DFE);
        G.lIlIlIllII[22] = -(0xFFFFAA3F & 0x7FEC) & (0xFFFFEFEF & 0x3FFB);
        G.lIlIlIllII[23] = -(0xFFFFFAB9 & 0x777F) & (0xFFFFF7FA & Short.MAX_VALUE);
        G.lIlIlIllII[24] = 0xFFFF8DFE & 0x77C5;
        G.lIlIlIllII[25] = -(0xFFFFFDA7 & 0x2E5D) & (0xFFFFBD7F & 0x6FFF);
        G.lIlIlIllII[26] = 0xFFFFFBFE & 0x5F5;
        G.lIlIlIllII[27] = -(0xFFFFFDBF & 0x4EEB) & (0xFFFFFDFB & Short.MAX_VALUE);
        G.lIlIlIllII[28] = -(0xFFFFC47C & 0x3FCF) & (0xFFFF9FFF & 0x6E5F);
        G.lIlIlIllII[29] = -(0xFFFFF5B6 & 0x7BCD) & (0xFFFFFFEB & 0x7D9F);
        G.lIlIlIllII[30] = 0x91 ^ 0x85;
        G.lIlIlIllII[31] = 1 ^ 0xE;
        G.lIlIlIllII[32] = 0xCC ^ 0xC0;
        G.lIlIlIllII[33] = 0xE1 ^ 0xC5 ^ (0x21 ^ 8);
        G.lIlIlIllII[34] = 0xB7 ^ 0xAE ^ (0x64 ^ 0x73);
        G.lIlIlIllII[35] = 0xA ^ 0x62 ^ (0 ^ 0x78);
        G.lIlIlIllII[36] = 0xA5 ^ 0xBD ^ (0x11 ^ 0x18);
        G.lIlIlIllII[37] = 0xFFFFFD3E & 0x27E7;
        G.lIlIlIllII[38] = 0xB7 ^ 0xBA ^ (0x7A ^ 0x65);
        G.lIlIlIllII[39] = -(0xFFFFEC79 & 0x53E7) & (0xFFFFFBFF & 0x67F6);
        G.lIlIlIllII[40] = 0xA5 ^ 0xB6;
        G.lIlIlIllII[41] = 0x23 ^ 0x1B ^ (0xA7 ^ 0x8A);
        G.lIlIlIllII[42] = 0xC4 ^ 0xA0;
        G.lIlIlIllII[43] = 0xFFFFFB9F & 0x5F0;
        G.lIlIlIllII[44] = 0x59 ^ 0x31 ^ (0x41 ^ 0x3F);
        G.lIlIlIllII[45] = 9 + 113 - 66 + 91 ^ 55 + 0 - -75 + 57;
        G.lIlIlIllII[46] = 0xAB ^ 0xBC;
        G.lIlIlIllII[47] = -(0xFFFFF96D & 0x6E9B) & (0xFFFFFBFF & 0x7FFE);
        G.lIlIlIllII[48] = 0xBA ^ 0xA2;
        G.lIlIlIllII[49] = 0x12 ^ 0xB;
        G.lIlIlIllII[50] = -(0xFFFFD8BE & 0x6755) & (0xFFFFFFFF & 0x6EDF);
        G.lIlIlIllII[51] = -(0xFFFFBCA3 & 0x77DF) & (0xFFFFF7EE & 0x7EFB);
        G.lIlIlIllII[52] = 0x18 ^ 2;
        G.lIlIlIllII[53] = 0xFFFF87EC & 0x7F7F;
        G.lIlIlIllII[54] = 0x2A ^ 0x31;
        G.lIlIlIllII[55] = 0x6D ^ 0x71;
        G.lIlIlIllII[56] = 0x4E ^ 0x53;
        G.lIlIlIllII[57] = 0x2F ^ 0x34 ^ (0x8E ^ 0x8B);
        G.lIlIlIllII[58] = -(0xFFFF9D8B & 0x7A76) & (0xFFFFFFD7 & 0x1FF9);
        G.lIlIlIllII[59] = -(0xFFFFBF93 & 0x587D) & (0xFFFFBF3D & 0x5AFE);
        G.lIlIlIllII[60] = 0x34 ^ 0x2B;
        G.lIlIlIllII[61] = 0xBA ^ 0x9A;
        G.lIlIlIllII[62] = 0x95 ^ 0xB4;
        G.lIlIlIllII[63] = 0xA7 ^ 0x85;
        G.lIlIlIllII[64] = 0x8A ^ 0xA9;
        G.lIlIlIllII[65] = 0xA ^ 0x2E;
        G.lIlIlIllII[66] = 0xA8 ^ 0x8D;
        G.lIlIlIllII[67] = 39 + 11 - 14 + 111 ^ 166 + 84 - 216 + 147;
        G.lIlIlIllII[68] = 0x6A ^ 0x4D;
        G.lIlIlIllII[69] = 0x1C ^ 0x35;
        G.lIlIlIllII[70] = 0xAD ^ 0xA0 ^ (0x3B ^ 0x1C);
        G.lIlIlIllII[71] = 0x24 ^ 0xF;
        G.lIlIlIllII[72] = 51 + 57 - 19 + 56 ^ 7 + 156 - 152 + 178;
        G.lIlIlIllII[73] = 53 + 166 - 75 + 28 ^ 79 + 98 - 164 + 116;
        G.lIlIlIllII[74] = 21 + 30 - -90 + 16 ^ 50 + 1 - -101 + 27;
        G.lIlIlIllII[75] = 0xAC ^ 0x9E ^ (0xAF ^ 0xB2);
        G.lIlIlIllII[76] = 18 + 64 - 75 + 153 ^ 118 + 140 - 147 + 33;
        G.lIlIlIllII[77] = 116 + 37 - 141 + 178 ^ 93 + 120 - 178 + 108;
        G.lIlIlIllII[78] = 0x53 ^ 0x7A ^ (0x18 ^ 3);
        G.lIlIlIllII[79] = 0x26 ^ 0x53 ^ (0xE7 ^ 0xA1);
        G.lIlIlIllII[80] = 0x4D ^ 0x3C ^ (0x60 ^ 0x25);
        G.lIlIlIllII[81] = 0x17 ^ 0x22;
        G.lIlIlIllII[82] = 139 + 124 - 252 + 129 ^ 142 + 118 - 90 + 16;
        G.lIlIlIllII[83] = 0xBC ^ 0x9E ^ (0x30 ^ 0x25);
        G.lIlIlIllII[84] = 0xA1 ^ 0x99;
        G.lIlIlIllII[85] = 6 + 135 - -6 + 5 ^ 16 + 41 - -62 + 42;
        G.lIlIlIllII[86] = 0xFFFF8EBE & 0x736B;
        G.lIlIlIllII[87] = 0xFFFF8E33 & 0x7DEC;
        G.lIlIlIllII[88] = 0xFFFFECDB & 0x1F7F;
        G.lIlIlIllII[89] = 0xFA ^ 0xC3 ^ 3;
        G.lIlIlIllII[90] = 0x2B ^ 0x6C ^ (0x46 ^ 0x3A);
        G.lIlIlIllII[91] = 0x13 ^ 0x2F;
        G.lIlIlIllII[92] = 0x14 ^ 0x39 ^ (0x9E ^ 0x8E);
        G.lIlIlIllII[93] = 27 + 70 - 22 + 69 ^ 6 + 97 - 37 + 108;
        G.lIlIlIllII[94] = 0x91 ^ 0xAE;
        G.lIlIlIllII[95] = 7 ^ 0x11 ^ (0xE3 ^ 0xB5);
        G.lIlIlIllII[96] = 0x7A ^ 0x7D ^ (0x87 ^ 0xC1);
    }

    @Override
    public boolean af() {
        boolean bl;
        if (G.lIIlIIIllIlll(e.j(lIlIlIllII[2]), lIlIlIllII[3])) {
            bl = lIlIlIllII[1];
            0;
            if ((0x94 ^ 0x90) < 1) {
                return false;
            }
        } else {
            bl = lIlIlIllII[0];
        }
        return bl;
    }

    private static boolean lIIlIIIllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIIllIlIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String ae() {
        return lIlIlIlIlI[lIlIlIllII[84]];
    }

    private static boolean lIIlIIIllIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIlIllll(int n2) {
        return n2 != 0;
    }

    private static String lIIlIIIlIlIII(String var16, String var20) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var18 = var20.toCharArray();
        int var17 = lIlIlIllII[0];
        char[] var3 = var16.toCharArray();
        int var12 = var3.length;
        int var13 = lIlIlIllII[0];
        while (G.lIIlIIIllIIII(var13, var12)) {
            char var5 = var3[var13];
            var10.append((char)(var5 ^ var18[var17 % var18.length]));
            0;
            ++var17;
            ++var13;
            0;
            if (((1 ^ (0x62 ^ 0x7D)) & (0xA9 ^ 0x82 ^ (0x7D ^ 0x48) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    static {
        G.lIIlIIIlIlllI();
        G.lIIlIIIlIllIl();
        iS = lIlIlIllII[10];
        iR = lIlIlIllII[24];
        iQ = lIlIlIllII[23];
        iU = lIlIlIllII[13];
        iW = lIlIlIllII[25];
        iV = lIlIlIllII[86];
        iN = lIlIlIllII[2];
        iP = lIlIlIllII[22];
        iT = lIlIlIllII[15];
        iO = lIlIlIllII[21];
        iX = lIlIlIllII[17];
        iM = new WorldPoint(lIlIlIllII[87], lIlIlIllII[88], lIlIlIllII[3]);
        bp = new ArrayList<d>();
        iy = lIlIlIlIlI[lIlIlIllII[89]];
        String[] stringArray = new String[lIlIlIllII[12]];
        stringArray[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[90]];
        stringArray[G.lIlIlIllII[1]] = lIlIlIlIlI[lIlIlIllII[91]];
        stringArray[G.lIlIlIllII[3]] = lIlIlIlIlI[lIlIlIllII[92]];
        stringArray[G.lIlIlIllII[4]] = lIlIlIlIlI[lIlIlIllII[93]];
        stringArray[G.lIlIlIllII[6]] = lIlIlIlIlI[lIlIlIllII[94]];
        stringArray[G.lIlIlIllII[9]] = lIlIlIlIlI[lIlIlIllII[95]];
        hn = stringArray;
        cA = lIlIlIllII[0];
    }

    private static void lIIlIIIlIllIl() {
        lIlIlIlIlI = new String[lIlIlIllII[96]];
        G.lIlIlIlIlI[G.lIlIlIllII[0]] = G."Buying items";
        G.lIlIlIlIlI[G.lIlIlIllII[1]] = G."Finished buying items, switching back to questing";
        G.lIlIlIlIlI[G.lIlIlIllII[3]] = G."Navigating to bank";
        G.lIlIlIlIlI[G.lIlIlIllII[4]] = G."Opening bank";
        G.lIlIlIlIlI[G.lIlIlIllII[6]] = G."Handling banking";
        G.lIlIlIlIlI[G.lIlIlIllII[9]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[12]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[14]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[16]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[18]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[8]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[19]] = G."Walking to imp start";
        G.lIlIlIlIlI[G.lIlIlIllII[32]] = G."Magic Portal";
        G.lIlIlIlIlI[G.lIlIlIllII[33]] = G."Enter";
        G.lIlIlIlIlI[G.lIlIlIllII[34]] = G."Handling quest";
        G.lIlIlIlIlI[G.lIlIlIllII[31]] = G."Nav to start";
        G.lIlIlIlIlI[G.lIlIlIllII[35]] = G."Finishing quest";
        G.lIlIlIlIlI[G.lIlIlIllII[36]] = G."Adding red bead to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[38]] = G."Adding yellow bead to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[40]] = G."Adding black bead to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[30]] = G."Adding white bead to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[41]] = G."Adding lobster to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[44]] = G."Adding lobster to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[46]] = G."Adding cheese to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[48]] = G."Adding cheese to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[49]] = G."Adding wealth to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[52]] = G."Adding varrock tabs to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[54]] = G."Adding fally tabs to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[55]] = G."Adding fally tabs to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[56]] = G."Adding staminas to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[57]] = G."Adding mind runes to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[60]] = G."Adding air runes to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[61]] = G."Adding water runes to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[62]] = G."Adding earth runes to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[63]] = G."Adding air runes to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[64]] = G."Adding water runes to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[65]] = G."Adding earth runes to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[66]] = G."Adding mind runes to buy list";
        G.lIlIlIlIlI[G.lIlIlIllII[67]] = G."Red bead";
        G.lIlIlIlIlI[G.lIlIlIllII[68]] = G."Yellow bead";
        G.lIlIlIlIlI[G.lIlIlIllII[45]] = G."Black bead";
        G.lIlIlIlIlI[G.lIlIlIllII[69]] = G."White bead";
        G.lIlIlIlIlI[G.lIlIlIllII[70]] = G."Cheese";
        G.lIlIlIlIlI[G.lIlIlIllII[71]] = G."Navigating to bank";
        G.lIlIlIlIlI[G.lIlIlIllII[72]] = G."Opening bank";
        G.lIlIlIlIlI[G.lIlIlIllII[73]] = G."Handling banking";
        G.lIlIlIlIlI[G.lIlIlIllII[74]] = G."Mind rune";
        G.lIlIlIlIlI[G.lIlIlIllII[75]] = G."Mind rune";
        G.lIlIlIlIlI[G.lIlIlIllII[76]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[77]] = G."Earth rune";
        G.lIlIlIlIlI[G.lIlIlIllII[78]] = G."Earth rune";
        G.lIlIlIlIlI[G.lIlIlIllII[79]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[80]] = G."Water rune";
        G.lIlIlIlIlI[G.lIlIlIllII[81]] = G."Water rune";
        G.lIlIlIlIlI[G.lIlIlIllII[82]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[83]] = G."We are missing supplies, switching to BUYING";
        G.lIlIlIlIlI[G.lIlIlIllII[84]] = G."Imp Catcher quest";
        G.lIlIlIlIlI[G.lIlIlIllII[85]] = G."ring of wealth (";
        G.lIlIlIlIlI[G.lIlIlIllII[89]] = G."Wizard Mizgog";
        G.lIlIlIlIlI[G.lIlIlIllII[90]] = G."Give me a quest please.";
        G.lIlIlIlIlI[G.lIlIlIllII[91]] = G."I'll try.";
        G.lIlIlIlIlI[G.lIlIlIllII[92]] = G."Actually, I know where to find this stuff.";
        G.lIlIlIlIlI[G.lIlIlIllII[93]] = G."Yes.";
        G.lIlIlIlIlI[G.lIlIlIllII[94]] = G."What's the matter?";
        G.lIlIlIlIlI[G.lIlIlIllII[95]] = G."Ok, I'll see what I can do.";
    }

    /*
     * WARNING - void declaration
     */
    private static void ci() {
        void var9;
        BankLocation bankLocation = BankLocation.getNearest();
        if (G.lIIlIIIllIIlI(bankLocation) && G.lIIlIIIllIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[71]];
            a.a(bankLocation);
        }
        if (G.lIIlIIIllIIlI(var9) && G.lIIlIIIlIllll(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (G.lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[72]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIllII[5]);
                0;
            }
            if (G.lIIlIIIlIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[73]];
                if (G.lIIlIIIllIIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIlIlIllII[4]);
                    0;
                }
                if (G.lIIlIIIllIIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIlIlIllII[3]);
                    0;
                }
                String[] stringArray = new String[lIlIlIllII[1]];
                stringArray[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[74]];
                if (G.lIIlIIIlIllll(Bank.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlIlIllII[1]];
                    stringArray2[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[75]];
                    if (G.lIIlIIIllIIII(Bank.getFirst((String[])stringArray2).getQuantity(), lIlIlIllII[11])) {
                        G.O();
                        System.out.println(lIlIlIlIlI[lIlIlIllII[76]]);
                        bn = lIlIlIllII[1];
                        return;
                    }
                }
                String[] stringArray3 = new String[lIlIlIllII[1]];
                stringArray3[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[77]];
                if (G.lIIlIIIlIllll(Bank.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIlIlIllII[1]];
                    stringArray4[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[78]];
                    if (G.lIIlIIIllIIII(Bank.getFirst((String[])stringArray4).getQuantity(), lIlIlIllII[11])) {
                        G.O();
                        System.out.println(lIlIlIlIlI[lIlIlIllII[79]]);
                        bn = lIlIlIllII[1];
                        return;
                    }
                }
                String[] stringArray5 = new String[lIlIlIllII[1]];
                stringArray5[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[80]];
                if (G.lIIlIIIlIllll(Bank.contains((String[])stringArray5) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIlIlIllII[1]];
                    stringArray6[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[81]];
                    if (G.lIIlIIIllIIII(Bank.getFirst((String[])stringArray6).getQuantity(), lIlIlIllII[11])) {
                        G.O();
                        System.out.println(lIlIlIlIlI[lIlIlIllII[82]]);
                        bn = lIlIlIllII[1];
                        return;
                    }
                }
                int[] nArray = new int[lIlIlIllII[19]];
                nArray[G.lIlIlIllII[0]] = lIlIlIllII[20];
                nArray[G.lIlIlIllII[1]] = lIlIlIllII[21];
                nArray[G.lIlIlIllII[3]] = lIlIlIllII[22];
                nArray[G.lIlIlIllII[4]] = lIlIlIllII[23];
                nArray[G.lIlIlIllII[6]] = lIlIlIllII[24];
                nArray[G.lIlIlIllII[9]] = lIlIlIllII[7];
                nArray[G.lIlIlIllII[12]] = lIlIlIllII[17];
                nArray[G.lIlIlIllII[14]] = lIlIlIllII[25];
                nArray[G.lIlIlIllII[16]] = lIlIlIllII[10];
                nArray[G.lIlIlIllII[18]] = lIlIlIllII[15];
                nArray[G.lIlIlIllII[8]] = lIlIlIllII[13];
                if (G.lIIlIIIllIIIl(e.b(nArray) ? 1 : 0)) {
                    G.O();
                    System.out.println(lIlIlIlIlI[lIlIlIllII[83]]);
                    bn = lIlIlIllII[1];
                    return;
                }
                while (G.lIIlIIIllIIIl(y.bv() ? 1 : 0)) {
                    y.bt();
                    Time.sleepTicks((int)lIlIlIllII[1]);
                    0;
                    0;
                    if ((0x13 ^ 0x4A ^ (0xED ^ 0xB0)) >= 1) continue;
                    return;
                }
                if (G.lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lIlIlIllII[6]);
                    0;
                }
                int[] nArray2 = new int[lIlIlIllII[1]];
                nArray2[G.lIlIlIllII[0]] = lIlIlIllII[22];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIlIlIllII[1]];
                    nArray3[G.lIlIlIllII[0]] = lIlIlIllII[22];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray3), lIlIlIllII[1])) {
                        Bank.withdraw((int)lIlIlIllII[22], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[22];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                if (2 <= ((0x7E ^ 0x1B ^ (0x76 ^ 0x57)) & (104 + 22 - -3 + 6 ^ 66 + 35 - -63 + 31 ^ -1))) {
                                    return false;
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray4 = new int[lIlIlIllII[1]];
                nArray4[G.lIlIlIllII[0]] = lIlIlIllII[23];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lIlIlIllII[1]];
                    nArray5[G.lIlIlIllII[0]] = lIlIlIllII[23];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray5), lIlIlIllII[1])) {
                        Bank.withdraw((int)lIlIlIllII[23], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[23];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                if (-2 >= 0) {
                                    return ((0x6F ^ 0x45 ^ (0x17 ^ 0x7D)) & (0x84 ^ 0xC4 ^ (0x6F ^ 0x43) & ~(0x66 ^ 0x4A) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray6 = new int[lIlIlIllII[1]];
                nArray6[G.lIlIlIllII[0]] = lIlIlIllII[21];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[lIlIlIllII[1]];
                    nArray7[G.lIlIlIllII[0]] = lIlIlIllII[21];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray7), lIlIlIllII[1])) {
                        Bank.withdraw((int)lIlIlIllII[21], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[21];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                if (((7 ^ 0x48) & ~(0xDC ^ 0x93)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray8 = new int[lIlIlIllII[1]];
                nArray8[G.lIlIlIllII[0]] = lIlIlIllII[24];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    int[] nArray9 = new int[lIlIlIllII[1]];
                    nArray9[G.lIlIlIllII[0]] = lIlIlIllII[24];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray9), lIlIlIllII[1])) {
                        Bank.withdraw((int)lIlIlIllII[24], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[24];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                if ((0x72 ^ 0x76) <= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray10 = new int[lIlIlIllII[1]];
                nArray10[G.lIlIlIllII[0]] = lIlIlIllII[7];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    int[] nArray11 = new int[lIlIlIllII[1]];
                    nArray11[G.lIlIlIllII[0]] = lIlIlIllII[7];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray11), lIlIlIllII[1])) {
                        Bank.withdraw((int)lIlIlIllII[7], (int)lIlIlIllII[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[7];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                if ((0x3F ^ 0x3B) != (0x15 ^ 0x11)) {
                                    return false;
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray12 = new int[lIlIlIllII[1]];
                nArray12[G.lIlIlIllII[0]] = lIlIlIllII[17];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    int[] nArray13 = new int[lIlIlIllII[1]];
                    nArray13[G.lIlIlIllII[0]] = lIlIlIllII[17];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray13), lIlIlIllII[1])) {
                        Bank.withdraw((int)lIlIlIllII[17], (int)lIlIlIllII[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[17];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray14 = new int[lIlIlIllII[1]];
                nArray14[G.lIlIlIllII[0]] = lIlIlIllII[10];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    int[] nArray15 = new int[lIlIlIllII[1]];
                    nArray15[G.lIlIlIllII[0]] = lIlIlIllII[10];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray15), lIlIlIllII[1])) {
                        Bank.withdraw((int)lIlIlIllII[10], (int)lIlIlIllII[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[10];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                if (-3 > 0) {
                                    return ((0x71 ^ 0x47 ^ (0x3E ^ 0x2D)) & (0x4F ^ 0x73 ^ (0x71 ^ 0x68) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray16 = new int[lIlIlIllII[1]];
                nArray16[G.lIlIlIllII[0]] = lIlIlIllII[15];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIlIllII[1]];
                    nArray17[G.lIlIlIllII[0]] = lIlIlIllII[15];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray17), lIlIlIllII[1])) {
                        Bank.withdraw((int)lIlIlIllII[15], (int)lIlIlIllII[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[15];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                if (((0x67 ^ 0x3F) & ~(0x68 ^ 0x30)) == -1) {
                                    return false;
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray18 = new int[lIlIlIllII[1]];
                nArray18[G.lIlIlIllII[0]] = lIlIlIllII[13];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                    int[] nArray19 = new int[lIlIlIllII[1]];
                    nArray19[G.lIlIlIllII[0]] = lIlIlIllII[13];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray19), lIlIlIllII[1])) {
                        Bank.withdraw((int)lIlIlIllII[13], (int)lIlIlIllII[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[13];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                if (1 == 0) {
                                    return ((54 + 121 - 136 + 112 ^ 170 + 85 - 234 + 178) & (8 ^ 0x6A ^ (0x21 ^ 0x13) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray20 = new int[lIlIlIllII[1]];
                nArray20[G.lIlIlIllII[0]] = lIlIlIllII[27];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIlIlIllII[1]];
                    nArray21[G.lIlIlIllII[0]] = lIlIlIllII[27];
                    if (G.lIIlIIIllIIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        Bank.withdraw((int)lIlIlIllII[27], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[27];
                            return Inventory.contains((int[])nArray);
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
                int[] nArray22 = new int[lIlIlIllII[1]];
                nArray22[G.lIlIlIllII[0]] = lIlIlIllII[25];
                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIlIlIllII[1]];
                    nArray23[G.lIlIlIllII[0]] = lIlIlIllII[25];
                    if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray23), lIlIlIllII[1])) {
                        Bank.withdrawAll((int)lIlIlIllII[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[25];
                            if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIllII[1];
                                0;
                                if (((28 + 59 - -102 + 41 ^ 37 + 125 - 76 + 106) & (0x92 ^ 0x85 ^ (0x53 ^ 0x62) ^ -1)) < 0) {
                                    return ((0xC9 ^ 0x86 ^ (0xF6 ^ 0xB2)) & (0xDF ^ 0xBA ^ (0xCB ^ 0xA5) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIlIllII[0];
                            }
                            return bl;
                        }, (int)lIlIlIllII[5]);
                        0;
                    }
                }
            }
        }
    }

    public static void ch() {
        if (G.lIIlIIIlIllll(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[0]];
            b.a(bp);
            if (G.lIIlIIIllIIII(bp.size(), lIlIlIllII[1])) {
                System.out.println(lIlIlIlIlI[lIlIlIllII[1]]);
                bn = lIlIlIllII[0];
            }
        }
        if (G.lIIlIIIllIIIl(bn ? 1 : 0)) {
            if (G.lIIlIIIllIIIl(e.j(lIlIlIllII[2]))) {
                BankLocation var8;
                if (G.lIIlIIIllIIIl(G.aK() ? 1 : 0)) {
                    var8 = BankLocation.getNearest();
                    if (G.lIIlIIIllIIlI(var8) && G.lIIlIIIllIIIl(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[3]];
                        a.a(var8);
                    }
                    if (G.lIIlIIIllIIlI(var8) && G.lIIlIIIlIllll(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (G.lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[4]];
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIllII[5]);
                            0;
                        }
                        if (G.lIIlIIIlIllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[6]];
                            if (G.lIIlIIIllIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIlIllII[4]);
                                0;
                            }
                            if (G.lIIlIIIllIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIlIllII[3]);
                                0;
                            }
                            int[] nArray = new int[lIlIlIllII[1]];
                            nArray[G.lIlIlIllII[0]] = lIlIlIllII[7];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIlIlIllII[1]];
                                nArray2[G.lIlIlIllII[0]] = lIlIlIllII[7];
                                if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray2).getQuantity(), lIlIlIllII[8])) {
                                    G.O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[9]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIlIlIllII[1]];
                            nArray3[G.lIlIlIllII[0]] = lIlIlIllII[10];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlIlIllII[1]];
                                nArray4[G.lIlIlIllII[0]] = lIlIlIllII[10];
                                if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray4).getQuantity(), lIlIlIllII[11])) {
                                    G.O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[12]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIlIlIllII[1]];
                            nArray5[G.lIlIlIllII[0]] = lIlIlIllII[13];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIlIlIllII[1]];
                                nArray6[G.lIlIlIllII[0]] = lIlIlIllII[13];
                                if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray6).getQuantity(), lIlIlIllII[11])) {
                                    G.O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[14]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIlIlIllII[1]];
                            nArray7[G.lIlIlIllII[0]] = lIlIlIllII[15];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIlIlIllII[1]];
                                nArray8[G.lIlIlIllII[0]] = lIlIlIllII[15];
                                if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray8).getQuantity(), lIlIlIllII[11])) {
                                    G.O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[16]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] nArray9 = new int[lIlIlIllII[1]];
                            nArray9[G.lIlIlIllII[0]] = lIlIlIllII[17];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIlIllII[1]];
                                nArray10[G.lIlIlIllII[0]] = lIlIlIllII[17];
                                if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray10).getQuantity(), lIlIlIllII[9])) {
                                    G.O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[18]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] nArray11 = new int[lIlIlIllII[19]];
                            nArray11[G.lIlIlIllII[0]] = lIlIlIllII[20];
                            nArray11[G.lIlIlIllII[1]] = lIlIlIllII[21];
                            nArray11[G.lIlIlIllII[3]] = lIlIlIllII[22];
                            nArray11[G.lIlIlIllII[4]] = lIlIlIllII[23];
                            nArray11[G.lIlIlIllII[6]] = lIlIlIllII[24];
                            nArray11[G.lIlIlIllII[9]] = lIlIlIllII[7];
                            nArray11[G.lIlIlIllII[12]] = lIlIlIllII[17];
                            nArray11[G.lIlIlIllII[14]] = lIlIlIllII[25];
                            nArray11[G.lIlIlIllII[16]] = lIlIlIllII[10];
                            nArray11[G.lIlIlIllII[18]] = lIlIlIllII[15];
                            nArray11[G.lIlIlIllII[8]] = lIlIlIllII[13];
                            if (G.lIIlIIIllIIIl(e.b(nArray11) ? 1 : 0)) {
                                G.O();
                                System.out.println(lIlIlIlIlI[lIlIlIllII[8]]);
                                bn = lIlIlIllII[1];
                                return;
                            }
                            while (G.lIIlIIIllIIIl(y.bv() ? 1 : 0)) {
                                y.bt();
                                Time.sleepTicks((int)lIlIlIllII[1]);
                                0;
                                0;
                                if (1 > ((0x1C ^ 0x7C ^ (0xCB ^ 0xA4)) & (8 ^ 0x27 ^ (0x83 ^ 0xA3) ^ -1))) continue;
                                return;
                            }
                            if (G.lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)lIlIlIllII[6]);
                                0;
                            }
                            int[] nArray12 = new int[lIlIlIllII[1]];
                            nArray12[G.lIlIlIllII[0]] = lIlIlIllII[22];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                int[] nArray13 = new int[lIlIlIllII[1]];
                                nArray13[G.lIlIlIllII[0]] = lIlIlIllII[22];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray13), lIlIlIllII[1])) {
                                    Bank.withdraw((int)lIlIlIllII[22], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[22];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray14 = new int[lIlIlIllII[1]];
                            nArray14[G.lIlIlIllII[0]] = lIlIlIllII[23];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[lIlIlIllII[1]];
                                nArray15[G.lIlIlIllII[0]] = lIlIlIllII[23];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray15), lIlIlIllII[1])) {
                                    Bank.withdraw((int)lIlIlIllII[23], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[23];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray16 = new int[lIlIlIllII[1]];
                            nArray16[G.lIlIlIllII[0]] = lIlIlIllII[21];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                int[] nArray17 = new int[lIlIlIllII[1]];
                                nArray17[G.lIlIlIllII[0]] = lIlIlIllII[21];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray17), lIlIlIllII[1])) {
                                    Bank.withdraw((int)lIlIlIllII[21], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[21];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            if ((0x4F ^ 0x76 ^ (0x20 ^ 0x1D)) <= 2) {
                                                return ((130 + 124 - 230 + 144 ^ 80 + 39 - 63 + 86) & (0x27 ^ 0x3D ^ (0xB4 ^ 0x88) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray18 = new int[lIlIlIllII[1]];
                            nArray18[G.lIlIlIllII[0]] = lIlIlIllII[24];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                int[] nArray19 = new int[lIlIlIllII[1]];
                                nArray19[G.lIlIlIllII[0]] = lIlIlIllII[24];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray19), lIlIlIllII[1])) {
                                    Bank.withdraw((int)lIlIlIllII[24], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[24];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            if (((141 + 94 - 96 + 23 ^ 122 + 67 - 22 + 5) & (0x3F ^ 0x26 ^ (0xD2 ^ 0xC5) ^ -1)) == 3) {
                                                return ((85 + 118 - 91 + 61 ^ 20 + 46 - -96 + 0) & (0x30 ^ 0x34 ^ (8 ^ 3) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray20 = new int[lIlIlIllII[1]];
                            nArray20[G.lIlIlIllII[0]] = lIlIlIllII[7];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                int[] nArray21 = new int[lIlIlIllII[1]];
                                nArray21[G.lIlIlIllII[0]] = lIlIlIllII[7];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray21), lIlIlIllII[1])) {
                                    Bank.withdraw((int)lIlIlIllII[7], (int)lIlIlIllII[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[7];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            if (3 != 3) {
                                                return ((0x66 ^ 0x56 ^ (0x26 ^ 0x49)) & (11 + 105 - 84 + 221 ^ 42 + 14 - -28 + 78 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray22 = new int[lIlIlIllII[1]];
                            nArray22[G.lIlIlIllII[0]] = lIlIlIllII[17];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                int[] nArray23 = new int[lIlIlIllII[1]];
                                nArray23[G.lIlIlIllII[0]] = lIlIlIllII[17];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray23), lIlIlIllII[1])) {
                                    Bank.withdraw((int)lIlIlIllII[17], (int)lIlIlIllII[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[17];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            if (-(0x45 ^ 0x40) >= 0) {
                                                return (1 & ~1) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray24 = new int[lIlIlIllII[1]];
                            nArray24[G.lIlIlIllII[0]] = lIlIlIllII[10];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                int[] nArray25 = new int[lIlIlIllII[1]];
                                nArray25[G.lIlIlIllII[0]] = lIlIlIllII[10];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray25), lIlIlIllII[1])) {
                                    Bank.withdraw((int)lIlIlIllII[10], (int)lIlIlIllII[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[10];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            if (2 == 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray26 = new int[lIlIlIllII[1]];
                            nArray26[G.lIlIlIllII[0]] = lIlIlIllII[15];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                int[] nArray27 = new int[lIlIlIllII[1]];
                                nArray27[G.lIlIlIllII[0]] = lIlIlIllII[15];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray27), lIlIlIllII[1])) {
                                    Bank.withdraw((int)lIlIlIllII[15], (int)lIlIlIllII[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[15];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            if ((0xB3 ^ 0xB7) != (0x1F ^ 0x1B)) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray28 = new int[lIlIlIllII[1]];
                            nArray28[G.lIlIlIllII[0]] = lIlIlIllII[13];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray28) ? 1 : 0)) {
                                int[] nArray29 = new int[lIlIlIllII[1]];
                                nArray29[G.lIlIlIllII[0]] = lIlIlIllII[13];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray29), lIlIlIllII[1])) {
                                    Bank.withdraw((int)lIlIlIllII[13], (int)lIlIlIllII[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[13];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            if (-1 == ((0xF5 ^ 0xAA) & ~(0x33 ^ 0x6C))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray30 = new int[lIlIlIllII[1]];
                            nArray30[G.lIlIlIllII[0]] = lIlIlIllII[27];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray30) ? 1 : 0)) {
                                int[] nArray31 = new int[lIlIlIllII[1]];
                                nArray31[G.lIlIlIllII[0]] = lIlIlIllII[27];
                                if (G.lIIlIIIllIIIl(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                                    Bank.withdraw((int)lIlIlIllII[27], (int)lIlIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[27];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                            int[] nArray32 = new int[lIlIlIllII[1]];
                            nArray32[G.lIlIlIllII[0]] = lIlIlIllII[25];
                            if (G.lIIlIIIlIllll(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                int[] nArray33 = new int[lIlIlIllII[1]];
                                nArray33[G.lIlIlIllII[0]] = lIlIlIllII[25];
                                if (G.lIIlIIIllIIII(Inventory.getCount((int[])nArray33), lIlIlIllII[1])) {
                                    Bank.withdrawAll((int)lIlIlIllII[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIllII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIllII[1]];
                                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[25];
                                        if (G.lIIlIIIllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIllII[1];
                                            0;
                                            if ((35 + 117 - -5 + 3 ^ 120 + 106 - 83 + 21) < 2) {
                                                return ((0xDA ^ 0x81 ^ (0x94 ^ 0x9E)) & (0x32 ^ 0x54 ^ (0x77 ^ 0x40) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIllII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIllII[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (G.lIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(iM), lIlIlIllII[6]) && G.lIIlIIIllIlIl(Players.getLocal().getWorldLocation().getPlane(), lIlIlIllII[3]) && G.lIIlIIIlIllll(G.aK() ? 1 : 0)) {
                    if (G.lIIlIIIlIllll(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIlIlIllII[6]);
                        0;
                    }
                    AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[19]];
                    if (G.lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (G.lIIlIIIllIIII(cA, lIlIlIllII[1])) {
                            e.v();
                            cA += lIlIlIllII[1];
                        }
                        if (G.lIIlIIIlIllll((var8 = new WorldArea(lIlIlIllII[28], lIlIlIllII[29], lIlIlIllII[30], lIlIlIllII[31], lIlIlIllII[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIlIlIllII[1]];
                            stringArray[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[32]];
                            TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIlI[lIlIlIllII[33]]);
                            Time.sleepTicks((int)e.c(lIlIlIllII[12], lIlIlIllII[16]));
                            0;
                        }
                        Movement.walkTo((WorldPoint)iM);
                        0;
                        Time.sleepTicks((int)lIlIlIllII[3]);
                        0;
                    }
                }
                if (G.lIIlIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(iM), lIlIlIllII[12])) {
                    AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[34]];
                    dc = lIlIlIllII[0];
                    g.a(iy, hn);
                    if (G.lIIlIIIlIllll(g.K() ? 1 : 0)) {
                        g.a(hn);
                    }
                }
            }
            if (G.lIIlIIIllIIll(e.j(lIlIlIllII[2])) && G.lIIlIIIllIIII(e.j(lIlIlIllII[2]), lIlIlIllII[3])) {
                if (G.lIIlIIIllIIIl(G.aK() ? 1 : 0)) {
                    G.ci();
                }
                if (G.lIIlIIIlIllll(G.aK() ? 1 : 0)) {
                    if (G.lIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(iM), lIlIlIllII[12])) {
                        AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[31]];
                        if (G.lIIlIIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)iM);
                        0;
                        Time.sleepTicks((int)lIlIlIllII[1]);
                        0;
                    }
                    if (G.lIIlIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(iM), lIlIlIllII[12])) {
                        AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[35]];
                        if (G.lIIlIIIllIIII(dc, lIlIlIllII[1])) {
                            Z.og += lIlIlIllII[1];
                            Z.p(AccBuilderShamans.m);
                            dc += lIlIlIllII[1];
                            Z.og = lIlIlIllII[0];
                            dd = lIlIlIllII[0];
                        }
                        g.a(iy, hn);
                        if (G.lIIlIIIlIllll(g.K() ? 1 : 0)) {
                            g.a(hn);
                        }
                    }
                }
            }
            System.out.println("Setting: " + e.j(lIlIlIllII[2]));
            g.a(new String[lIlIlIllII[0]]);
        }
    }

    private static boolean lIIlIIIllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIlIIIlIIlll(String var2, String var6) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIlIllII[3], var15);
            return new String(var7.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Override
    public int ad() {
        try {
            G.ch();
            0;
        }
        catch (Exception var11) {
            var11.printStackTrace();
        }
        if (3 < 0) {
            return (0x25 ^ 0x3D) & ~(0xF ^ 0x17);
        }
        return lIlIlIllII[42];
    }

    private static String lIIlIIIlIlIIl(String var22, String var14) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIlIlIllII[16]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(lIlIlIllII[3], var24);
            return new String(var23.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aK() {
        int n2;
        String[] stringArray = new String[lIlIlIllII[1]];
        stringArray[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[67]];
        if (G.lIIlIIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIlIllII[1]];
            stringArray2[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[68]];
            if (G.lIIlIIIlIllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIlIlIllII[1]];
                stringArray3[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[45]];
                if (G.lIIlIIIlIllll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIlIlIllII[1]];
                    stringArray4[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[69]];
                    if (G.lIIlIIIlIllll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        int[] nArray = new int[lIlIlIllII[1]];
                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[10];
                        if (G.lIIlIIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIlIlIllII[1]];
                            nArray2[G.lIlIlIllII[0]] = lIlIlIllII[15];
                            if (G.lIIlIIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                int[] nArray3 = new int[lIlIlIllII[1]];
                                nArray3[G.lIlIlIllII[0]] = lIlIlIllII[13];
                                if (G.lIIlIIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    int[] nArray4 = new int[lIlIlIllII[1]];
                                    nArray4[G.lIlIlIllII[0]] = lIlIlIllII[7];
                                    if (G.lIIlIIIlIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[lIlIlIllII[1]];
                                        nArray5[G.lIlIlIllII[0]] = lIlIlIllII[25];
                                        if (G.lIIlIIIlIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            String[] stringArray5 = new String[lIlIlIllII[1]];
                                            stringArray5[G.lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[70]];
                                            if (G.lIIlIIIlIllll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                                n2 = lIlIlIllII[1];
                                                0;
                                                if (((0x57 ^ 0x36 ^ (0x4D ^ 0x36)) & (156 + 74 - 102 + 61 ^ 14 + 40 - -43 + 70 ^ -1)) == 0) return n2 != 0;
                                                return ((0x42 ^ 0x6E ^ (0xBE ^ 0xB3)) & (0x9A ^ 0x87 ^ (0xAA ^ 0x96) ^ -1)) != 0;
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
        n2 = lIlIlIllII[0];
        return n2 != 0;
    }

    private static void O() {
        d var21;
        block37: {
            block36: {
                block35: {
                    block34: {
                        Object var4;
                        block33: {
                            block32: {
                                int[] nArray = new int[lIlIlIllII[1]];
                                nArray[G.lIlIlIllII[0]] = lIlIlIllII[21];
                                if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[36]]);
                                    d d2 = new d(lIlIlIllII[21], lIlIlIllII[1], lIlIlIllII[37]);
                                    bp.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[lIlIlIllII[1]];
                                nArray2[G.lIlIlIllII[0]] = lIlIlIllII[22];
                                if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[38]]);
                                    var4 = new d(lIlIlIllII[22], lIlIlIllII[1], lIlIlIllII[39]);
                                    bp.add((d)var4);
                                    0;
                                }
                                int[] nArray3 = new int[lIlIlIllII[1]];
                                nArray3[G.lIlIlIllII[0]] = lIlIlIllII[23];
                                if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[40]]);
                                    var4 = new d(lIlIlIllII[23], lIlIlIllII[1], lIlIlIllII[39]);
                                    bp.add((d)var4);
                                    0;
                                }
                                int[] nArray4 = new int[lIlIlIllII[1]];
                                nArray4[G.lIlIlIllII[0]] = lIlIlIllII[24];
                                if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[30]]);
                                    var4 = new d(lIlIlIllII[24], lIlIlIllII[1], lIlIlIllII[39]);
                                    bp.add((d)var4);
                                    0;
                                }
                                int[] nArray5 = new int[lIlIlIllII[1]];
                                nArray5[G.lIlIlIllII[0]] = lIlIlIllII[25];
                                if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[41]]);
                                    var4 = new d(lIlIlIllII[25], lIlIlIllII[42], lIlIlIllII[43]);
                                    bp.add((d)var4);
                                    0;
                                }
                                int[] nArray6 = new int[lIlIlIllII[1]];
                                nArray6[G.lIlIlIllII[0]] = lIlIlIllII[25];
                                if (G.lIIlIIIlIllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[lIlIlIllII[1]];
                                    nArray7[G.lIlIlIllII[0]] = lIlIlIllII[25];
                                    if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray7).getQuantity(), lIlIlIllII[30])) {
                                        System.out.println(lIlIlIlIlI[lIlIlIllII[44]]);
                                        var4 = new d(lIlIlIllII[25], lIlIlIllII[45], lIlIlIllII[43]);
                                        bp.add((d)var4);
                                        0;
                                    }
                                }
                                int[] nArray8 = new int[lIlIlIllII[1]];
                                nArray8[G.lIlIlIllII[0]] = lIlIlIllII[17];
                                if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[46]]);
                                    var4 = new d(lIlIlIllII[17], lIlIlIllII[9], lIlIlIllII[47]);
                                    bp.add((d)var4);
                                    0;
                                }
                                int[] nArray9 = new int[lIlIlIllII[1]];
                                nArray9[G.lIlIlIllII[0]] = lIlIlIllII[17];
                                if (!G.lIIlIIIlIllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block32;
                                int[] nArray10 = new int[lIlIlIllII[1]];
                                nArray10[G.lIlIlIllII[0]] = lIlIlIllII[17];
                                if (!G.lIIlIIIlIllll(Bank.contains((int[])nArray10) ? 1 : 0)) break block33;
                                int[] nArray11 = new int[lIlIlIllII[1]];
                                nArray11[G.lIlIlIllII[0]] = lIlIlIllII[17];
                                if (!G.lIIlIIIllIIII(Bank.getFirst((int[])nArray11).getQuantity(), lIlIlIllII[9])) break block33;
                            }
                            System.out.println(lIlIlIlIlI[lIlIlIllII[48]]);
                            var4 = new d(lIlIlIllII[17], lIlIlIllII[9], lIlIlIllII[47]);
                            bp.add((d)var4);
                            0;
                        }
                        if (G.lIIlIIIllIIIl(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lIlIlIlIlI[lIlIlIllII[85]]))) ? 1 : 0)) {
                            System.out.println(lIlIlIlIlI[lIlIlIllII[49]]);
                            var21 = new d(lIlIlIllII[50], lIlIlIllII[38], lIlIlIllII[51]);
                            bp.add(var21);
                            0;
                        }
                        int[] nArray = new int[lIlIlIllII[1]];
                        nArray[G.lIlIlIllII[0]] = lIlIlIllII[20];
                        if (!G.lIIlIIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray12 = new int[lIlIlIllII[1]];
                        nArray12[G.lIlIlIllII[0]] = lIlIlIllII[20];
                        if (!G.lIIlIIIlIllll(Bank.contains((int[])nArray12) ? 1 : 0)) break block35;
                        int[] nArray13 = new int[lIlIlIllII[1]];
                        nArray13[G.lIlIlIllII[0]] = lIlIlIllII[20];
                        if (!G.lIIlIIIllIIII(Bank.getFirst((int[])nArray13).getQuantity(), lIlIlIllII[30])) break block35;
                    }
                    System.out.println(lIlIlIlIlI[lIlIlIllII[52]]);
                    var21 = new d(lIlIlIllII[20], lIlIlIllII[45], lIlIlIllII[53]);
                    bp.add(var21);
                    0;
                }
                int[] nArray = new int[lIlIlIllII[1]];
                nArray[G.lIlIlIllII[0]] = lIlIlIllII[7];
                if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    System.out.println(lIlIlIlIlI[lIlIlIllII[54]]);
                    var21 = new d(lIlIlIllII[7], lIlIlIllII[30], lIlIlIllII[53]);
                    bp.add(var21);
                    0;
                }
                int[] nArray14 = new int[lIlIlIllII[1]];
                nArray14[G.lIlIlIllII[0]] = lIlIlIllII[7];
                if (!G.lIIlIIIlIllll(Bank.contains((int[])nArray14) ? 1 : 0)) break block36;
                int[] nArray15 = new int[lIlIlIllII[1]];
                nArray15[G.lIlIlIllII[0]] = lIlIlIllII[7];
                if (!G.lIIlIIIlIllll(Bank.contains((int[])nArray15) ? 1 : 0)) break block37;
                int[] nArray16 = new int[lIlIlIllII[1]];
                nArray16[G.lIlIlIllII[0]] = lIlIlIllII[7];
                if (!G.lIIlIIIllIIII(Bank.getFirst((int[])nArray16).getQuantity(), lIlIlIllII[30])) break block37;
            }
            System.out.println(lIlIlIlIlI[lIlIlIllII[55]]);
            var21 = new d(lIlIlIllII[7], lIlIlIllII[30], lIlIlIllII[53]);
            bp.add(var21);
            0;
        }
        int[] nArray = new int[lIlIlIllII[1]];
        nArray[G.lIlIlIllII[0]] = lIlIlIllII[27];
        if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[56]]);
            var21 = new d(lIlIlIllII[27], lIlIlIllII[9], j.bZ);
            bp.add(var21);
            0;
        }
        int[] nArray17 = new int[lIlIlIllII[1]];
        nArray17[G.lIlIlIllII[0]] = lIlIlIllII[10];
        if (G.lIIlIIIlIllll(Bank.contains((int[])nArray17) ? 1 : 0)) {
            int[] nArray18 = new int[lIlIlIllII[1]];
            nArray18[G.lIlIlIllII[0]] = lIlIlIllII[10];
            if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray18).getQuantity(), lIlIlIllII[11])) {
                System.out.println(lIlIlIlIlI[lIlIlIllII[57]]);
                var21 = new d(lIlIlIllII[10], lIlIlIllII[58], lIlIlIllII[14]);
                bp.add(var21);
                0;
            }
        }
        int[] nArray19 = new int[lIlIlIllII[1]];
        nArray19[G.lIlIlIllII[0]] = lIlIlIllII[59];
        if (G.lIIlIIIlIllll(Bank.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIlIlIllII[1]];
            nArray20[G.lIlIlIllII[0]] = lIlIlIllII[59];
            if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray20).getQuantity(), lIlIlIllII[11])) {
                System.out.println(lIlIlIlIlI[lIlIlIllII[60]]);
                var21 = new d(lIlIlIllII[59], lIlIlIllII[58], lIlIlIllII[14]);
                bp.add(var21);
                0;
            }
        }
        int[] nArray21 = new int[lIlIlIllII[1]];
        nArray21[G.lIlIlIllII[0]] = lIlIlIllII[15];
        if (G.lIIlIIIlIllll(Bank.contains((int[])nArray21) ? 1 : 0)) {
            int[] nArray22 = new int[lIlIlIllII[1]];
            nArray22[G.lIlIlIllII[0]] = lIlIlIllII[15];
            if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray22).getQuantity(), lIlIlIllII[11])) {
                System.out.println(lIlIlIlIlI[lIlIlIllII[61]]);
                var21 = new d(lIlIlIllII[15], lIlIlIllII[58], lIlIlIllII[14]);
                bp.add(var21);
                0;
            }
        }
        int[] nArray23 = new int[lIlIlIllII[1]];
        nArray23[G.lIlIlIllII[0]] = lIlIlIllII[13];
        if (G.lIIlIIIlIllll(Bank.contains((int[])nArray23) ? 1 : 0)) {
            int[] nArray24 = new int[lIlIlIllII[1]];
            nArray24[G.lIlIlIllII[0]] = lIlIlIllII[13];
            if (G.lIIlIIIllIIII(Bank.getFirst((int[])nArray24).getQuantity(), lIlIlIllII[11])) {
                System.out.println(lIlIlIlIlI[lIlIlIllII[62]]);
                var21 = new d(lIlIlIllII[13], lIlIlIllII[58], lIlIlIllII[14]);
                bp.add(var21);
                0;
            }
        }
        int[] nArray25 = new int[lIlIlIllII[1]];
        nArray25[G.lIlIlIllII[0]] = lIlIlIllII[59];
        if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[63]]);
            var21 = new d(lIlIlIllII[59], lIlIlIllII[58], lIlIlIllII[14]);
            bp.add(var21);
            0;
        }
        int[] nArray26 = new int[lIlIlIllII[1]];
        nArray26[G.lIlIlIllII[0]] = lIlIlIllII[15];
        if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray26) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[64]]);
            var21 = new d(lIlIlIllII[15], lIlIlIllII[58], lIlIlIllII[14]);
            bp.add(var21);
            0;
        }
        int[] nArray27 = new int[lIlIlIllII[1]];
        nArray27[G.lIlIlIllII[0]] = lIlIlIllII[13];
        if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray27) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[65]]);
            var21 = new d(lIlIlIllII[13], lIlIlIllII[58], lIlIlIllII[14]);
            bp.add(var21);
            0;
        }
        int[] nArray28 = new int[lIlIlIllII[1]];
        nArray28[G.lIlIlIllII[0]] = lIlIlIllII[10];
        if (G.lIIlIIIllIIIl(Bank.contains((int[])nArray28) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[66]]);
            var21 = new d(lIlIlIllII[10], lIlIlIllII[58], lIlIlIllII[14]);
            bp.add(var21);
            0;
        }
    }

    private static boolean lIIlIIIllIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIllIIlI(Object object) {
        return object != null;
    }
}

