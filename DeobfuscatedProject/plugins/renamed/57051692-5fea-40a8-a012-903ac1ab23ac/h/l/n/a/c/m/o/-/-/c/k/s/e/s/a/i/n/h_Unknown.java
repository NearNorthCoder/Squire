/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class h_Unknown {
    private static /* synthetic */ int[] lIllIlIIII;
    private static /* synthetic */ int bV;
    private static /* synthetic */ Map<Integer, Integer> bw;
    private static /* synthetic */ Map<Integer, Integer> bt;
    private static /* synthetic */ int bE;
    private static /* synthetic */ int bT;
    private static /* synthetic */ String[] lIllIIllll;
    private static /* synthetic */ Map<Integer, Integer> bz;
    private static /* synthetic */ int bW;
    private static /* synthetic */ int bH;
    private static /* synthetic */ int bR;
    public static /* synthetic */ boolean bo;
    private static /* synthetic */ Map<Integer, Integer> bA;
    private static /* synthetic */ int bD;
    private static /* synthetic */ int bC;
    private static /* synthetic */ int bS;
    private static /* synthetic */ Map<Integer, Integer> bx;
    private static /* synthetic */ int bF;
    private static /* synthetic */ int bU;
    private static /* synthetic */ int bB;
    private static /* synthetic */ int bK;
    private static /* synthetic */ int bP;
    private static /* synthetic */ int bO;
    private static /* synthetic */ int bN;
    public static /* synthetic */ List<d> bp;
    private static /* synthetic */ int bL;
    private static /* synthetic */ Map<Integer, Integer> bq;
    private static /* synthetic */ int bM;
    private static /* synthetic */ int bI;
    private static /* synthetic */ Map<Integer, Integer> bv;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ Map<Integer, Integer> bu;
    private static /* synthetic */ Map<Integer, Integer> br;
    private static /* synthetic */ int bQ;
    private static /* synthetic */ int bJ;
    private static /* synthetic */ Map<Integer, Integer> by;
    private static /* synthetic */ Map<Integer, Integer> bs;
    private static /* synthetic */ int bG;

    private static boolean n(int n2) {
        if (h.lIIllIIlIlIll(n2, lIllIlIIII[16])) {
            int[] nArray = new int[lIllIlIIII[10]];
            nArray[h.lIllIlIIII[0]] = bB;
            nArray[h.lIllIlIIII[1]] = bC;
            nArray[h.lIllIlIIII[2]] = bD;
            nArray[h.lIllIlIIII[3]] = bE;
            nArray[h.lIllIlIIII[4]] = bF;
            nArray[h.lIllIlIIII[5]] = bG;
            nArray[h.lIllIlIIII[6]] = bH;
            nArray[h.lIllIlIIII[7]] = bI;
            nArray[h.lIllIlIIII[8]] = bJ;
            nArray[h.lIllIlIIII[9]] = bK;
            return h.b(nArray);
        }
        int[] nArray = new int[lIllIlIIII[11]];
        nArray[h.lIllIlIIII[0]] = bB;
        nArray[h.lIllIlIIII[1]] = bC;
        nArray[h.lIllIlIIII[2]] = bD;
        nArray[h.lIllIlIIII[3]] = bE;
        nArray[h.lIllIlIIII[4]] = bF;
        nArray[h.lIllIlIIII[5]] = bG;
        nArray[h.lIllIlIIII[6]] = bH;
        nArray[h.lIllIlIIII[7]] = bI;
        nArray[h.lIllIlIIII[8]] = bJ;
        nArray[h.lIllIlIIII[9]] = bK;
        nArray[h.lIllIlIIII[10]] = n2;
        return h.b(nArray);
    }

    private static void lIIllIIlIIlIl() {
        lIllIlIIII = new int[219];
        h.lIllIlIIII[0] = (0x5E ^ 0x7C) & ~(9 ^ 0x2B);
        h.lIllIlIIII[1] = 1;
        h.lIllIlIIII[2] = 2;
        h.lIllIlIIII[3] = 3;
        h.lIllIlIIII[4] = 0x29 ^ 0x1C ^ (0x4B ^ 0x7A);
        h.lIllIlIIII[5] = 0x6F ^ 6 ^ (0xE5 ^ 0x89);
        h.lIllIlIIII[6] = 0xBA ^ 0x9A ^ (0x78 ^ 0x5E);
        h.lIllIlIIII[7] = 0x3E ^ 0x39;
        h.lIllIlIIII[8] = 0x38 ^ 0x30;
        h.lIllIlIIII[9] = 0xB5 ^ 0xBC;
        h.lIllIlIIII[10] = 0xDC ^ 0xB9 ^ (0x36 ^ 0x59);
        h.lIllIlIIII[11] = 0x19 ^ 0x12;
        h.lIllIlIIII[12] = 181 + 85 - 152 + 91 ^ 71 + 31 - 38 + 129;
        h.lIllIlIIII[13] = 0xEF ^ 0xAF ^ (0x71 ^ 0x3C);
        h.lIllIlIIII[14] = 0x59 ^ 0x57;
        h.lIllIlIIII[15] = -(0xFFFFF453 & 0x6FFF) & (0xFFFFF7DF & 0x7FFA);
        h.lIllIlIIII[16] = -(0xFFFF8BF2 & 0x753F) & (0xFFFFFFFD & 0x2FFF);
        h.lIllIlIIII[17] = 0xFFFFAECF & 0x7FFE;
        h.lIllIlIIII[18] = -(0xFFFFD17B & 0x7EB4) & (0xFFFFFEFF & Short.MAX_VALUE);
        h.lIllIlIIII[19] = 64 + 134 - 132 + 105 ^ 107 + 111 - 87 + 33;
        h.lIllIlIIII[20] = 0x9D ^ 0x8D;
        h.lIllIlIIII[21] = 29 + 73 - 64 + 140 ^ 139 + 94 - 120 + 50;
        h.lIllIlIIII[22] = -(0xFFFFFB0B & 0x45F5) & (0xFFFFEFF2 & 0x7FDF);
        h.lIllIlIIII[23] = 0xFFFFAFDD & 0x7EF6;
        h.lIllIlIIII[24] = 0 ^ 0x12;
        h.lIllIlIIII[25] = 0xFFFFFDC1 & 0x6BF;
        h.lIllIlIIII[26] = -(0xFFFFE98F & 0x3673) & (0xFFFFFEFE & 0x655F);
        h.lIllIlIIII[27] = -(0xFFFFDD91 & 0x33FF) & (0xFFFFDDFC & 0x7FBF);
        h.lIllIlIIII[28] = -(0xFFFFBFDD & 0x6B3B) & (0xFFFFFFBB & 0x2FDF);
        h.lIllIlIIII[29] = -(0xFFFFBEEB & 0x7117) & (0xFFFFB5E7 & 0x7EBF);
        h.lIllIlIIII[30] = -(88 + 100 - 8 + 34) & (0xFFFFBDF7 & Short.MAX_VALUE);
        h.lIllIlIIII[31] = 0xFFFFFF9D & 0x4BEE;
        h.lIllIlIIII[32] = -(0xFFFF91C7 & 0x7F39) & (0xFFFFD5AF & 0x3FF7);
        h.lIllIlIIII[33] = 0xFFFFBD2F & 0x47FB;
        h.lIllIlIIII[34] = 0xFFFFE4C5 & 0x5FBE;
        h.lIllIlIIII[35] = -(0xFFFFB95A & 0x67A7) & (0xFFFFFFFF & 0x7BBF);
        h.lIllIlIIII[36] = -(0xFFFFBB6B & 0x5D97) & (0xFFFFFF7F & 0x1DDF);
        h.lIllIlIIII[37] = -(0xFFFFF7BE & 0x3F6F) & (0xFFFFFFFF & 0x7F3F);
        h.lIllIlIIII[38] = 0xFFFFDAEF & 0x77FE;
        h.lIllIlIIII[39] = -(0xFFFFEFC7 & 0x7339) & (0xFFFFE7FF & 0x7F5B);
        h.lIllIlIIII[40] = -(0xFFFFBB4B & 0x76B7) & (0xFFFFF67F & 0x3FCF);
        h.lIllIlIIII[41] = -(0xFFFFEB3D & 0x7CD3) & (0xFFFFFFFB & 0x6C3F);
        h.lIllIlIIII[42] = -(0xFFFFFC5B & 0xBBE) & (0xFFFFFFFD & 0x5FFF);
        h.lIllIlIIII[43] = -(0xFFFFFC45 & 0x1FFF) & (0xFFFFFF7C & Short.MAX_VALUE);
        h.lIllIlIIII[44] = 0xFFFFB4FF & 0x4F33;
        h.lIllIlIIII[45] = -(0xFFFFBFD1 & 0x7AEF) & (0xFFFFBFFB & 0x7EFD);
        h.lIllIlIIII[46] = 0x3F ^ 0x1B ^ (0x8D ^ 0xBD);
        h.lIllIlIIII[47] = -(0xFFFFCFF3 & 0x705F) & (0xFFFFD6F7 & 0x6DDF);
        h.lIllIlIIII[48] = -(0xFFFFE9DD & 0x5F27) & (0xFFFFDFAF & 0x6DFD);
        h.lIllIlIIII[49] = -(0xFFFFD1D9 & 0x7EF7) & (0xFFFFD7FD & 0x7DFF);
        h.lIllIlIIII[50] = -(0xFFFFF5E1 & 0x5ABF) & (0xFFFFFFFF & 0x54FF);
        h.lIllIlIIII[51] = 0xFFFFFF7D & 0x4AF;
        h.lIllIlIIII[52] = 0x2E ^ 0x30;
        h.lIllIlIIII[53] = 0xFFFFCDEF & 0x3697;
        h.lIllIlIIII[54] = 0xFFFFDFF2 & 0x6EDF;
        h.lIllIlIIII[55] = -(0xFFFFE9DA & 0x76A7) & (0xFFFFFFFD & 0xF2FF);
        h.lIllIlIIII[56] = 0xFFFFC3FC & 0xFD5F;
        h.lIllIlIIII[57] = 0xFFFFCEEF & 0x35BD;
        h.lIllIlIIII[58] = -(0xFFFFFCCF & 0x537D) & (0xFFFFDFFD & 0x757F);
        h.lIllIlIIII[59] = -(0xFFFFD9EF & 0x7E1F) & (0xFFFFFEFF & 0x5D6F);
        h.lIllIlIIII[60] = 0xFFFFFFFF & 0x2FFF;
        h.lIllIlIIII[61] = 0xFFFFB67A & 0xDFB7;
        h.lIllIlIIII[62] = 0xFFFFBF1F & 0xE1EE;
        h.lIllIlIIII[63] = -(0xFFFFFAF1 & 0x6D1F) & (0xFFFFEDBF & 0x7E7F);
        h.lIllIlIIII[64] = -(0xFFFFF64B & 0x2BF7) & (0xFFFFA7FF & 0x7E7F);
        h.lIllIlIIII[65] = 0x3A ^ 0x12;
        h.lIllIlIIII[66] = 0xFFFFAD8F & 0x56F9;
        h.lIllIlIIII[67] = -(0xFFFFF1F7 & 0x6FDB) & (0xFFFFEFFF & 0x7BFF);
        h.lIllIlIIII[68] = -(0xFFFF8786 & 0x7DFB) & (0xFFFFFFFF & 0x9FCD);
        h.lIllIlIIII[69] = 0xFFFF9FFF & 0x64AF;
        h.lIllIlIIII[70] = 0xFFFFAFFF & 0x5A2B;
        h.lIllIlIIII[71] = -(0xFFFFFBBD & 0x7ECB) & (0xFFFFFFBB & Short.MAX_VALUE);
        h.lIllIlIIII[72] = 0xFFFF966F & 0x6DF3;
        h.lIllIlIIII[73] = 0xFFFFFAFF & 0xF2F;
        h.lIllIlIIII[74] = -(0xFFFFEAFF & 0x5732) & (0xFFFFFFF3 & 0xFF7F);
        h.lIllIlIIII[75] = -(0xFFFFD5E7 & 0x2FDA) & (0xFFFFDDFF & 0xEFDF);
        h.lIllIlIIII[76] = 0xFFFFF75F & 0xCF7;
        h.lIllIlIIII[77] = 0xFFFF873B & 0x7CF5;
        h.lIllIlIIII[78] = 0xFFFF864F & 0x7DF3;
        h.lIllIlIIII[79] = 3 ^ (0xA4 ^ 0x9B);
        h.lIllIlIIII[80] = 0xFFFFE4DB & 0x1FAF;
        h.lIllIlIIII[81] = -(0xFFFFBB8F & 0x46F5) & (0xFFFFFFFF & 0x6FF);
        h.lIllIlIIII[82] = 0xFFFFFF0F & 0x175FC;
        h.lIllIlIIII[83] = 0xFFFFBF1F & 0x1DCFC;
        h.lIllIlIIII[84] = -(0xFFFFBFFB & 0x690F) & (0xFFFFFFBF & 0x2DFB);
        h.lIllIlIIII[85] = 0xFFFFEEFB & 0x1B77;
        h.lIllIlIIII[86] = 0xFFFFF6BC & 0x39F7;
        h.lIllIlIIII[87] = -(0xFFFFFD9D & 0x726B) & (0xFFFFF7BB & 0x7CED);
        h.lIllIlIIII[88] = 0xFFFFFF7B & 0xAE7;
        h.lIllIlIIII[89] = 0xFFFFB777 & 0x4DBD;
        h.lIllIlIIII[90] = -(0xFFFFF97A & 0x679F) & (0xFFFFF3FD & 0xFFBF);
        h.lIllIlIIII[91] = -(0xFFFFD14F & 0x3EB1) & (0xFFFFF8DE & 0xBFFF);
        h.lIllIlIIII[92] = 0xFFFFAD5F & 0x56F9;
        h.lIllIlIIII[93] = 0xFFFFAC7F & 0x57B7;
        h.lIllIlIIII[94] = -(0xFFFFE37F & 0x1FDB) & (0xFFFFFFFF & 0xF77E);
        h.lIllIlIIII[95] = -(0xFFFFF66F & 0x5993) & (0xFFFFF7FA & 0x17E8F);
        h.lIllIlIIII[96] = 0xFFFFA575 & 0x5ECF;
        h.lIllIlIIII[97] = 0xFFFFFEFF & 0x7BD;
        h.lIllIlIIII[98] = -(0xFFFFCD3A & 0x36FF) & (0xFFFFFDFD & 0x4E7F);
        h.lIllIlIIII[99] = -(0xFFFFFDB5 & 0x637B) & (0xFFFFF7F7 & 0x6FFB);
        h.lIllIlIIII[100] = 0xFFFFFBFF & 0x2C7C;
        h.lIllIlIIII[101] = -(16 + 103 - 49 + 83) & (0xFFFF97FC & 0xFEFF);
        h.lIllIlIIII[102] = 0xFFFFA6DC & 0xFF27;
        h.lIllIlIIII[103] = 0xFFFF8EF3 & 0x77CD;
        h.lIllIlIIII[104] = 0xFFFF9BFB & 0x67FF;
        h.lIllIlIIII[105] = -(0xFFFFEDA7 & 0x165B) & (0xFFFFFF6F & 0x5F96);
        h.lIllIlIIII[106] = -(0xFFFFFDBD & 0xA4E) & (0xFFFFFB6F & Short.MAX_VALUE);
        h.lIllIlIIII[107] = 0xFFFFAFFF & 0x53EF;
        h.lIllIlIIII[108] = 0xFFFFDFFF & 0x23FF;
        h.lIllIlIIII[109] = -(0xFFFFBA3D & 0x47F7) & (0xFFFFD7BF & 0x2E77);
        h.lIllIlIIII[110] = -(0xFFFFD7CF & 0x6E7B) & (0xFFFFD7EB & 0x7F7F);
        h.lIllIlIIII[111] = 0xFFFFEFFE & 0x1373;
        h.lIllIlIIII[112] = 60 + 129 - 46 + 30 + (0x9A ^ 0x91) - (0x7B ^ 0x38) + (0xF ^ 0x66);
        h.lIllIlIIII[113] = 157 + 113 - 216 + 179;
        h.lIllIlIIII[114] = -(0xFFFFDBED & 0x3C5F) & (0xFFFFDEEF & 0x3D7F);
        h.lIllIlIIII[115] = 0xFFFFEF7C & 0x7BEF;
        h.lIllIlIIII[116] = 0xFFFFFEAE & 0x7F7D;
        h.lIllIlIIII[117] = -(0xFFFFA4DD & 0x5F37) & (0xFFFFFFFF & 0xF7E);
        h.lIllIlIIII[118] = -(0xFFFFFD6A & 0x669F) & (0xFFFFEF6F & 0x7FF9);
        h.lIllIlIIII[119] = 0xFFFF8FA5 & 0x747F;
        h.lIllIlIIII[120] = -(0xFFFFD6D3 & 0x7DBD) & (0xFFFFDFDE & Short.MAX_VALUE);
        h.lIllIlIIII[121] = -(0xFFFFE692 & 0x79FF) & (0xFFFFFBF3 & 0x6FFF);
        h.lIllIlIIII[122] = -(0xFFFFF4C9 & 0xF3E) & (0xFFFFDFFF & 0x2F5F);
        h.lIllIlIIII[123] = -(0xFFFFB8ED & 0x7F1F) & (0xFFFFBFEF & 0x7E7F);
        h.lIllIlIIII[124] = 0xFFFFFF6F & 0x6F5;
        h.lIllIlIIII[125] = -(0xFFFFFD93 & 0x5B7D) & (0xFFFFFFFB & 0x5F7F);
        h.lIllIlIIII[126] = 0xFFFFAFE7 & 0x567F;
        h.lIllIlIIII[127] = 0xFFFFF577 & 0x3A8B;
        h.lIllIlIIII[128] = 0xFFFFBBFD & 0x4E73;
        h.lIllIlIIII[129] = 0xFFFF8EBC & 0x77EB;
        h.lIllIlIIII[130] = -(0xFFFFF337 & 0x3DCB) & (0xFFFFFFFE & Short.MAX_VALUE);
        h.lIllIlIIII[131] = 0xFFFFD7FB & 0xFEDC;
        h.lIllIlIIII[132] = 0xFFFFFFEB & 0xFDFC;
        h.lIllIlIIII[133] = -(0xFFFFE2DE & 0x3DFF) & (0xFFFFFFFF & 0x6FDF);
        h.lIllIlIIII[134] = -(0xFFFFD6FD & 0x3983) & (0xFFFFFFCB & 0x5FBF);
        h.lIllIlIIII[135] = 0xFFFFFF3F & 0x4FC8;
        h.lIllIlIIII[136] = -(0xFFFFF0EE & 0x4F9B) & (0xFFFFEFFF & 0x7BFF);
        h.lIllIlIIII[137] = -(0xFFFFF5B7 & 0x7E7D) & (0xFFFFFF7C & 0xFEFF);
        h.lIllIlIIII[138] = -(0xFFFFF4D7 & 0x4B69) & (0xFFFFEFFF & 0x576D);
        h.lIllIlIIII[139] = 0xFFFFF73B & 0x18DD;
        h.lIllIlIIII[140] = -(0xFFFFCE9E & 0x3D6B) & (0xFFFFDEFF & 0x3DDF);
        h.lIllIlIIII[141] = 0xFFFF96F6 & 0x6B7B;
        h.lIllIlIIII[142] = 0xFFFF929F & 0x7D7B;
        h.lIllIlIIII[143] = -(0xFFFFCF6F & 0x77F1) & (0xFFFFFFFF & 0x577F);
        h.lIllIlIIII[144] = 0xFFFFD1E3 & 0x3E3F;
        h.lIllIlIIII[145] = 0xFFFFE79E & 0x7BFD;
        h.lIllIlIIII[146] = -(0xFFFFBF73 & 0x448F) & (0xFFFFFFBF & 0x777E);
        h.lIllIlIIII[147] = 88 + 170 - 226 + 185 ^ 3 + 158 - 125 + 123;
        h.lIllIlIIII[148] = 0xFFFFD8FE & 0x3FB7;
        h.lIllIlIIII[149] = -(0xFFFFFF56 & 0x8FF) & (0xFFFFFFFF & 0x69FD);
        h.lIllIlIIII[150] = -(0xFFFFF707 & 0x7EFF) & (0xFFFFFEFE & 0xFFBF);
        h.lIllIlIIII[151] = 0xFFFFAFAF & 0x7FFB;
        h.lIllIlIIII[152] = -(0xFFFFD777 & 0x2AD9) & (0xFFFFFFFA & 0x4F7DD);
        h.lIllIlIIII[153] = -(0xFFFFEFE7 & 0x513F) & (0xFFFFFDBE & 0x55FFF);
        h.lIllIlIIII[154] = -(0xFFFFAD3A & 0x56C7) & (0xFFFFBDFD & 0x77F7);
        h.lIllIlIIII[155] = 0xFFFFBFF8 & 0xAC757;
        h.lIllIlIIII[156] = -(0xFFFFB2A7 & 0x5D5A) & (0xFFFFDFFD & 0xB7AA3);
        h.lIllIlIIII[157] = -(0xFFFFE3F9 & 0x7C2F) & (0xFFFFEDFB & 0x7BEF);
        h.lIllIlIIII[158] = -(0xFFFF92B9 & 0x7F67) & (0xFFFFDFF7 & 0x3BED);
        h.lIllIlIIII[159] = 0xFFFFBEEE & 0x71DD;
        h.lIllIlIIII[160] = -(0xFFFFD756 & 0x3DEF) & (0xFFFFFFFD & 0x57FFF);
        h.lIllIlIIII[161] = -(0xFFFFCFBB & 0x3C77) & (0xFFFFBFFF & 0x5DDFA);
        h.lIllIlIIII[162] = 0xFFFF9DFD & 0x6BBF;
        h.lIllIlIIII[163] = -(0xFFFFE62B & 0x5BD5) & (0xFFFFCBFF & 0x7FBF);
        h.lIllIlIIII[164] = -(0xFFFFF837 & 0xFF9) & (0xFFFFB8FE & Short.MAX_VALUE);
        h.lIllIlIIII[165] = -(0xFFFFEDFF & 0x1362) & (0xFFFFFFFF & 0x9FFF9);
        h.lIllIlIIII[166] = -(0xFFFF9FF3 & 0x7A0D) & (0xFFFFFFFF & 0xA3FA8);
        h.lIllIlIIII[167] = 0xFFFFEDD9 & 0x15E2E;
        h.lIllIlIIII[168] = 0xFFFFFB3F & 0x177D8;
        h.lIllIlIIII[169] = -(0xFFFFC6F3 & 0x7FFD) & (0xFFFFFFF3 & 0x6FFF);
        h.lIllIlIIII[170] = -(0xFFFFD1F2 & 0x3ECF) & (0xFFFFB8DD & 0xDFFFB);
        h.lIllIlIIII[171] = -(0xFFFFB8F7 & 0x67AF) & (0xFFFFFDFF & 0xE3FEE);
        h.lIllIlIIII[172] = 0xFFFFFCCF & 0x33FA;
        h.lIllIlIIII[173] = 0xFFFFFFBB & 0x51E6C;
        h.lIllIlIIII[174] = 0xFFFFAE2D & 0x57FFE;
        h.lIllIlIIII[175] = -(0xFFFF9F7F & 0x67C7) & (0xFFFFDFFE & 0x3FFF);
        h.lIllIlIIII[176] = 0xFFFFEB9D & 0x2BFFA;
        h.lIllIlIIII[177] = -(0xFFFFA977 & 0x7FDA) & (0xFFFFFBFB & 0x2FFFD);
        h.lIllIlIIII[178] = 0xFFFFCDD7 & 0x7FF9;
        h.lIllIlIIII[179] = -(0x1F ^ 0x1A) & (0xFFFFFFDF & 0x11EDFC);
        h.lIllIlIIII[180] = -(0xFFFFDFB7 & 0x624C) & (0xFFFFFEFB & 0x1257EF);
        h.lIllIlIIII[181] = 0xFFFFF3B6 & 0x5F7B;
        h.lIllIlIIII[182] = -(0xFFFFED85 & 0x76FF) & (0xFFFFFDFF & Short.MAX_VALUE);
        h.lIllIlIIII[183] = -(0xE6 ^ 0xB0) & (0xFFFFFF7D & 0x8EDFF);
        h.lIllIlIIII[184] = -(0xFFFFA71F & 0x7EF3) & (0xFFFFBF7E & 0x9EFFB);
        h.lIllIlIIII[185] = -(0xFFFFE8AC & 0x3757) & (0xFFFFBB7F & 0x7DFF);
        h.lIllIlIIII[186] = 0xFFFFD3BF & 0x7F75;
        h.lIllIlIIII[187] = 0xFFFFFA1D & 0x1625F2;
        h.lIllIlIIII[188] = 0xFFFFFCFE & 0x16BF51;
        h.lIllIlIIII[189] = 0xFFFFDB7A & 0x77BD;
        h.lIllIlIIII[190] = 0xFFFFFCF0 & 0x118F3F;
        h.lIllIlIIII[191] = 0xFFFF97FC & 0x137AD3;
        h.lIllIlIIII[192] = 0xFFFFEBFF & 0x3F78;
        h.lIllIlIIII[193] = 0xFFFFF374 & 0x2D0FFB;
        h.lIllIlIIII[194] = -(0xFFFFEF7B & 0x12C7) & (0xFFFF9FDB & 0x2EFFFE);
        h.lIllIlIIII[195] = 0xFFFFD9FE & 0x3FA9;
        h.lIllIlIIII[196] = -(0xFFFFD7FF & 0x29BB) & (0xFFFFAFFF & 0x7FFA);
        h.lIllIlIIII[197] = 0xFFFFDC1B & 0x27FE;
        h.lIllIlIIII[198] = 0xFFFF8ED2 & 0x753F;
        h.lIllIlIIII[199] = -(0xFFFFD2DE & 0x7DE3) & (0xFFFFD5F7 & 0x7EDF);
        h.lIllIlIIII[200] = 0xFFFFFDB5 & 0x3AEE;
        h.lIllIlIIII[201] = 0xFFFF861D & 0x7DF6;
        h.lIllIlIIII[202] = 0xFFFF850F & 0x7EFE;
        h.lIllIlIIII[203] = -(0xFFFFB967 & 0x5E9F) & (0xFFFFFDFF & 0x1E1E);
        h.lIllIlIIII[204] = 0xFFFFADB4 & 0x565B;
        h.lIllIlIIII[205] = 0xFFFF95DD & 0x6E3F;
        h.lIllIlIIII[206] = -(0xFFFFFDFD & 0x4E9F) & (0xFFFFFEFF & 0x4FDF);
        h.lIllIlIIII[207] = 0xFFFFF3FF & 0xFF9;
        h.lIllIlIIII[208] = -(0x20 ^ 3) & (0xFFFFBFBF & 0x47FF);
        h.lIllIlIIII[209] = -(0xFFFFA973 & 0x7ECD) & (0xFFFFEFFF & 0x3EFF);
        h.lIllIlIIII[210] = 0xFFFFEDF5 & 0x176F;
        h.lIllIlIIII[211] = 0xFFFFFF33 & 0x2EC;
        h.lIllIlIIII[212] = 0xFFFF8B79 & 0x76C7;
        h.lIllIlIIII[213] = 0xFFFFD51F & 0x2EEB;
        h.lIllIlIIII[214] = -(0xFFFFBEE5 & 0x6DFB) & (0xFFFFFFFF & 0x2EFE);
        h.lIllIlIIII[215] = -(0xFFFFDBF7 & 0x3CCF) & (0xFFFFFEEF & 0x1DDF);
        h.lIllIlIIII[216] = 7 + 116 - -4 + 16 ^ 155 + 153 - 299 + 147;
        h.lIllIlIIII[217] = 4 ^ 0x33 ^ (0x9A ^ 0xB8);
        h.lIllIlIIII[218] = 0x89 ^ 0xBB ^ (0x20 ^ 4);
    }

    public static void V() {
        bq.clear();
        br.clear();
        bs.clear();
        bt.clear();
        bu.clear();
        bv.clear();
        bw.clear();
        bx.clear();
        by.clear();
        bz.clear();
        bA.clear();
        bK = bL = lIllIlIIII[0];
        bJ = bL;
        bI = bL;
        bH = bL;
        bG = bL;
        bF = bL;
        bE = bL;
        bD = bL;
        bC = bL;
        bB = bL;
        bV = bW = lIllIlIIII[0];
        bU = bW;
        bT = bW;
        bS = bW;
        bR = bW;
        bQ = bW;
        bP = bW;
        bO = bW;
        bN = bW;
        bM = bW;
        bo = lIllIlIIII[0];
        System.out.println(lIllIIllll[lIllIlIIII[46]]);
    }

    private static void lIIllIIIlIIll() {
        lIllIIllll = new String[lIllIlIIII[218]];
        h.lIllIIllll[h.lIllIlIIII[0]] = h."f2pmelee";
        h.lIllIIllll[h.lIllIlIIII[1]] = h."f2pquest";
        h.lIllIIllll[h.lIllIlIIII[2]] = h."f2pmage";
        h.lIllIIllll[h.lIllIlIIII[3]] = h."mage";
        h.lIllIIllll[h.lIllIlIIII[4]] = h."quest";
        h.lIllIIllll[h.lIllIlIIII[5]] = h."questNoWep";
        h.lIllIIllll[h.lIllIlIIII[6]] = h."melee";
        h.lIllIIllll[h.lIllIlIIII[7]] = h."agility";
        h.lIllIIllll[h.lIllIlIIII[8]] = h."meleeNmz";
        h.lIllIIllll[h.lIllIlIIII[9]] = h."rangeNmz";
        h.lIllIIllll[h.lIllIlIIII[10]] = h."Randomized Equipment:";
        h.lIllIIllll[h.lIllIlIIII[11]] = h."Buying items";
        h.lIllIIllll[h.lIllIlIIII[12]] = h."Finished buying items, switching back to randomGearing";
        h.lIllIIllll[h.lIllIlIIII[13]] = h."Navigating to bank";
        h.lIllIIllll[h.lIllIlIIII[14]] = h."Handling banking";
        h.lIllIIllll[h.lIllIlIIII[19]] = h."We are missing random gear, switching to BUYING";
        h.lIllIIllll[h.lIllIlIIII[20]] = h."We are missing random gear, switching to BUYING";
        h.lIllIIllll[h.lIllIlIIII[21]] = h."We are missing random gear, switching to BUYING";
        h.lIllIIllll[h.lIllIlIIII[24]] = h."Finished gearing random";
        h.lIllIIllll[h.lIllIlIIII[216]] = h."Unexpected error occurred while getting a random key.";
        h.lIllIIllll[h.lIllIlIIII[46]] = h."Random gear lists CLEARED";
        h.lIllIIllll[h.lIllIlIIII[217]] = h."wealth";
    }

    private static boolean lIIllIIlIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static boolean b(int[] nArray) {
        int[] var16;
        int var11 = lIllIlIIII[0];
        while (h.lIIllIIlIlIII(var11, var16.length)) {
            if (h.lIIllIIlIlIlI(var16[var11])) {
                int[] nArray2 = new int[lIllIlIIII[1]];
                nArray2[h.lIllIlIIII[0]] = var16[var11];
                if (h.lIIllIIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + var16[var11]);
                    return lIllIlIIII[0];
                }
            }
            ++var11;
            0;
            if (((0x58 ^ 0x36 ^ (0xEA ^ 0x83)) & (67 + 7 - 23 + 76 ^ (0x1C ^ 0x64) ^ -1)) == 0) continue;
            return ((0xA1 ^ 0xC1 ^ (0x74 ^ 0x19)) & (0x30 ^ 0x34 ^ (0x74 ^ 0x7D) ^ -1)) != 0;
        }
        return lIllIlIIII[1];
    }

    private static boolean lIIllIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void T() {
        bq.putAll(Map.of(lIllIlIIII[197], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[198], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[199], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[201], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[202], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[203], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[204], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[205], e.c(lIllIlIIII[115], lIllIlIIII[146]), lIllIlIIII[206], e.c(lIllIlIIII[26], lIllIlIIII[27])));
        bq.putAll(Map.of(lIllIlIIII[25], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[207], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[208], e.c(lIllIlIIII[200], lIllIlIIII[98])));
        br.putAll(Map.of(lIllIlIIII[97], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[99], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[209], e.c(lIllIlIIII[98], lIllIlIIII[42])));
        bs.putAll(Map.of(lIllIlIIII[104], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[107], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[108], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[109], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[110], e.c(lIllIlIIII[105], lIllIlIIII[106])));
        bt.putAll(Map.of());
        bu.putAll(Map.of(lIllIlIIII[210], e.c(lIllIlIIII[34], lIllIlIIII[35])));
        bw.putAll(Map.of(lIllIlIIII[211], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[212], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[213], e.c(lIllIlIIII[37], lIllIlIIII[38])));
        bx.putAll(Map.of(lIllIlIIII[214], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[215], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        by.putAll(Map.of(lIllIlIIII[114], e.c(lIllIlIIII[137], lIllIlIIII[68]), lIllIlIIII[118], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[117], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        bz.putAll(Map.of(lIllIlIIII[119], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[121], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[122], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[120], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        bA.putAll(Map.of(lIllIlIIII[123], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[125], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[126], e.c(lIllIlIIII[115], lIllIlIIII[116])));
    }

    public static void d(String string) {
        if (!h.lIIllIIlIIllI(bB) || h.lIIllIIlIIlll(bH)) {
            String var10;
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[0]]) ? 1 : 0)) {
                h.P();
            }
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[1]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[2]]) ? 1 : 0)) {
                h.T();
            }
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[3]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[4]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[5]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[6]]) ? 1 : 0)) {
                h.Q();
            }
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[7]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[8]]) ? 1 : 0)) {
                h.S();
            }
            if (h.lIIllIIlIIllI(var10.equalsIgnoreCase(lIllIIllll[lIllIlIIII[9]]) ? 1 : 0)) {
                h.R();
            }
            h.U();
            System.out.println(lIllIIllll[lIllIlIIII[10]]);
            System.out.println("Helm: " + bB + ", Price: " + bM);
            System.out.println("Amulet: " + bC + ", Price: " + bN);
            System.out.println("Cape: " + bD + ", Price: " + bO);
            System.out.println("Ammo: " + bE + ", Price: " + bP);
            System.out.println("Weapon: " + bF + ", Price: " + bQ);
            System.out.println("Shield: " + bG + ", Price: " + bR);
            System.out.println("Body: " + bH + ", Price: " + bS);
            System.out.println("Legs: " + bI + ", Price: " + bT);
            System.out.println("Gloves: " + bJ + ", Price: " + bU);
            System.out.println("Boots: " + bK + ", Price: " + bV);
            System.out.println("Ring: " + bL + ", Price: " + bW);
        }
        if (h.lIIllIIlIIllI(bB) && h.lIIllIIlIIllI(bH)) {
            if (h.lIIllIIlIIllI(bn ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIllll[lIllIlIIII[11]];
                b.a(bp);
                if (h.lIIllIIlIlIII(bp.size(), lIllIlIIII[1])) {
                    System.out.println(lIllIIllll[lIllIlIIII[12]]);
                    bn = lIllIlIIII[0];
                }
            }
            if (h.lIIllIIlIIlll(bn ? 1 : 0)) {
                BankLocation var3 = BankLocation.getNearest();
                if (h.lIIllIIlIlIIl(var3) && h.lIIllIIlIIlll(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIllll[lIllIlIIII[13]];
                    a.a(var3);
                }
                if (h.lIIllIIlIlIIl(var3) && h.lIIllIIlIIllI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIllll[lIllIlIIII[14]];
                    if (h.lIIllIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlIIII[15]);
                        0;
                    }
                    if (h.lIIllIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (h.lIIllIIlIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllIlIIII[4]);
                            0;
                        }
                        if (h.lIIllIIlIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllIlIIII[2]);
                            0;
                        }
                        if (h.lIIllIIlIlIll(bL, lIllIlIIII[16])) {
                            int[] nArray = new int[lIllIlIIII[1]];
                            nArray[h.lIllIlIIII[0]] = lIllIlIIII[17];
                            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIllIlIIII[1]];
                                nArray2[h.lIllIlIIII[0]] = lIllIlIIII[16];
                                if (h.lIIllIIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIllIlIIII[1]];
                                    nArray3[h.lIllIlIIII[0]] = lIllIlIIII[18];
                                    if (h.lIIllIIlIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                        h.O();
                                        System.out.println(lIllIIllll[lIllIlIIII[19]]);
                                        bn = lIllIlIIII[1];
                                        return;
                                    }
                                }
                            }
                            int[] nArray4 = new int[lIllIlIIII[10]];
                            nArray4[h.lIllIlIIII[0]] = bB;
                            nArray4[h.lIllIlIIII[1]] = bC;
                            nArray4[h.lIllIlIIII[2]] = bD;
                            nArray4[h.lIllIlIIII[3]] = bE;
                            nArray4[h.lIllIlIIII[4]] = bF;
                            nArray4[h.lIllIlIIII[5]] = bG;
                            nArray4[h.lIllIlIIII[6]] = bH;
                            nArray4[h.lIllIlIIII[7]] = bI;
                            nArray4[h.lIllIlIIII[8]] = bJ;
                            nArray4[h.lIllIlIIII[9]] = bK;
                            if (h.lIIllIIlIIlll(h.b(nArray4) ? 1 : 0)) {
                                h.O();
                                System.out.println(lIllIIllll[lIllIlIIII[20]]);
                                bn = lIllIlIIII[1];
                                return;
                            }
                        }
                        if (h.lIIllIIlIllII(bL, lIllIlIIII[16])) {
                            int[] nArray = new int[lIllIlIIII[11]];
                            nArray[h.lIllIlIIII[0]] = bB;
                            nArray[h.lIllIlIIII[1]] = bC;
                            nArray[h.lIllIlIIII[2]] = bD;
                            nArray[h.lIllIlIIII[3]] = bE;
                            nArray[h.lIllIlIIII[4]] = bF;
                            nArray[h.lIllIlIIII[5]] = bG;
                            nArray[h.lIllIlIIII[6]] = bH;
                            nArray[h.lIllIlIIII[7]] = bI;
                            nArray[h.lIllIlIIII[8]] = bJ;
                            nArray[h.lIllIlIIII[9]] = bK;
                            nArray[h.lIllIlIIII[10]] = bL;
                            if (h.lIIllIIlIIlll(h.b(nArray) ? 1 : 0)) {
                                h.O();
                                System.out.println(lIllIIllll[lIllIlIIII[21]]);
                                bn = lIllIlIIII[1];
                                return;
                            }
                        }
                        if (h.lIIllIIlIIllI(h.n(bL) ? 1 : 0)) {
                            int[] nArray = new int[lIllIlIIII[11]];
                            nArray[h.lIllIlIIII[0]] = bB;
                            nArray[h.lIllIlIIII[1]] = bC;
                            nArray[h.lIllIlIIII[2]] = bD;
                            nArray[h.lIllIlIIII[3]] = bE;
                            nArray[h.lIllIlIIII[4]] = bF;
                            nArray[h.lIllIlIIII[5]] = bG;
                            nArray[h.lIllIlIIII[6]] = bH;
                            nArray[h.lIllIlIIII[7]] = bI;
                            nArray[h.lIllIlIIII[8]] = bJ;
                            nArray[h.lIllIlIIII[9]] = bK;
                            nArray[h.lIllIlIIII[10]] = bL;
                            int[] var23 = nArray;
                            if (h.lIIllIIlIlIll(bL, lIllIlIIII[16])) {
                                int[] nArray5 = new int[lIllIlIIII[1]];
                                nArray5[h.lIllIlIIII[0]] = lIllIlIIII[16];
                                if (h.lIIllIIlIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    int[] nArray6 = new int[lIllIlIIII[1]];
                                    nArray6[h.lIllIlIIII[0]] = lIllIlIIII[17];
                                    if (h.lIIllIIlIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                        a.a(lIllIlIIII[17], lIllIlIIII[1]);
                                    }
                                }
                                int[] nArray7 = new int[lIllIlIIII[1]];
                                nArray7[h.lIllIlIIII[0]] = lIllIlIIII[16];
                                if (h.lIIllIIlIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                    int[] nArray8 = new int[lIllIlIIII[1]];
                                    nArray8[h.lIllIlIIII[0]] = lIllIlIIII[17];
                                    if (h.lIIllIIlIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                        int[] nArray9 = new int[lIllIlIIII[1]];
                                        nArray9[h.lIllIlIIII[0]] = lIllIlIIII[17];
                                        if (h.lIIllIIlIIlll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                            int[] nArray10 = new int[lIllIlIIII[1]];
                                            nArray10[h.lIllIlIIII[0]] = lIllIlIIII[18];
                                            if (h.lIIllIIlIIllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                                a.a(lIllIlIIII[18], lIllIlIIII[1]);
                                            }
                                        }
                                    }
                                }
                            }
                            a.a(var23, lIllIlIIII[1]);
                            Time.sleepTicks((int)e.c(lIllIlIIII[10], lIllIlIIII[14]));
                            0;
                            if (h.lIIllIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks((int)e.c(lIllIlIIII[3], lIllIlIIII[5]));
                                0;
                            }
                            while (!h.lIIllIIlIIlll(Inventory.contains((int[])var23) ? 1 : 0) || h.lIIllIIlIIllI(Inventory.contains(item -> {
                                int n2;
                                if (h.lIIllIIlIIllI(item.getName().contains(lIllIIllll[lIllIlIIII[217]]) ? 1 : 0) && h.lIIllIIlIIlll(item.isNoted() ? 1 : 0)) {
                                    n2 = lIllIlIIII[1];
                                    0;
                                    
                                    }
                                } else {
                                    n2 = lIllIlIIII[0];
                                }
                                return n2 != 0;
                            }) ? 1 : 0)) {
                                e.l(bB);
                                e.l(bC);
                                e.l(bD);
                                e.l(bE);
                                Time.sleepTicks((int)lIllIlIIII[1]);
                                0;
                                e.l(bF);
                                e.l(bG);
                                e.l(bH);
                                Time.sleepTicks((int)lIllIlIIII[1]);
                                0;
                                e.l(bI);
                                e.l(bJ);
                                e.l(bK);
                                e.l(bL);
                                Time.sleepTicks((int)lIllIlIIII[1]);
                                0;
                                e.l(lIllIlIIII[16]);
                                e.l(lIllIlIIII[17]);
                                e.l(lIllIlIIII[18]);
                                e.l(lIllIlIIII[22]);
                                e.l(lIllIlIIII[23]);
                                0;
                                if (((3 ^ 0x5D) & ~(0x23 ^ 0x7D)) <= 0) continue;
                                return;
                            }
                            if (h.lIIllIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlIIII[15]);
                                0;
                                Time.sleepTicks((int)lIllIlIIII[4]);
                                0;
                                System.out.println(lIllIIllll[lIllIlIIII[24]]);
                                bo = lIllIlIIII[1];
                            }
                        }
                    }
                }
            }
        }
    }

    private static String lIIllIIIlIIIl(String var21, String var19) {
        try {
            SecretKeySpec var31 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIllIlIIII[8]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIllIlIIII[2], var31);
            return new String(var4.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllIIlIlIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static int a(Map<Integer, Integer> map, Random random) {
        Map<Integer, Integer> var12;
        void var15;
        if (h.lIIllIIlIIllI(map.isEmpty() ? 1 : 0)) {
            return lIllIlIIII[0];
        }
        int var5 = var15.nextInt(var12.size());
        int var24 = lIllIlIIII[0];
        Iterator<Integer> var13 = var12.keySet().iterator();
        while (h.lIIllIIlIIllI(var13.hasNext() ? 1 : 0)) {
            int var30 = var13.next();
            if (h.lIIllIIlIlIll(var24, var5)) {
                return var30;
            }
            ++var24;
            0;
            if (2 > 1) continue;
            return (0x62 ^ 0x56) & ~(0x8C ^ 0xB8);
        }
        throw new IllegalStateException(lIllIIllll[lIllIlIIII[216]]);
    }

    private static String lIIllIIIlIIII(String var18, String var6) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var17 = var6.toCharArray();
        int var28 = lIllIlIIII[0];
        char[] var2 = var18.toCharArray();
        int var20 = var2.length;
        int var25 = lIllIlIIII[0];
        while (h.lIIllIIlIlIII(var25, var20)) {
            char var22 = var2[var25];
            var1.append((char)(var22 ^ var17[var28 % var17.length]));
            0;
            ++var28;
            ++var25;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static void U() {
        Random random = new Random();
        bB = h.a(bq, random);
        bM = bq.getOrDefault(bB, lIllIlIIII[0]);
        bC = h.a(br, random);
        bN = br.getOrDefault(bC, lIllIlIIII[0]);
        bD = h.a(bs, random);
        bO = bs.getOrDefault(bD, lIllIlIIII[0]);
        bE = h.a(bt, random);
        bP = bt.getOrDefault(bE, lIllIlIIII[0]);
        bF = h.a(bu, random);
        bQ = bu.getOrDefault(bF, lIllIlIIII[0]);
        bG = h.a(bv, random);
        bR = bv.getOrDefault(bG, lIllIlIIII[0]);
        bH = h.a(bw, random);
        bS = bw.getOrDefault(bH, lIllIlIIII[0]);
        bI = h.a(bx, random);
        bT = bx.getOrDefault(bI, lIllIlIIII[0]);
        bJ = h.a(by, random);
        bU = by.getOrDefault(bJ, lIllIlIIII[0]);
        bK = h.a(bz, random);
        bV = bz.getOrDefault(bK, lIllIlIIII[0]);
        bL = h.a(bA, random);
        bW = bA.getOrDefault(bL, lIllIlIIII[0]);
    }

    private static String lIIllIIIlIIlI(String var27, String var14) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var26 = Cipher.getInstance("Blowfish");
            var26.init(lIllIlIIII[2], var7);
            return new String(var26.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void O() {
        d var29;
        if (h.lIIllIIlIIllI(bB)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bB;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(bB, lIllIlIIII[1], bM);
                bp.add(d2);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bC)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bC;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var29 = new d(bC, lIllIlIIII[1], bN);
                bp.add(var29);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bD)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bD;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var29 = new d(bD, lIllIlIIII[1], bO);
                bp.add(var29);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bE)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bE;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var29 = new d(bE, lIllIlIIII[1], bP);
                bp.add(var29);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bF)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bF;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var29 = new d(bF, lIllIlIIII[1], bQ);
                bp.add(var29);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bG)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bG;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var29 = new d(bG, lIllIlIIII[1], bR);
                bp.add(var29);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bH)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bH;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var29 = new d(bH, lIllIlIIII[1], bS);
                bp.add(var29);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bI)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bI;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var29 = new d(bI, lIllIlIIII[1], bT);
                bp.add(var29);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bJ)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bJ;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var29 = new d(bJ, lIllIlIIII[1], bU);
                bp.add(var29);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bK)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bK;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var29 = new d(bK, lIllIlIIII[1], bV);
                bp.add(var29);
                0;
            }
        }
        if (h.lIIllIIlIIllI(bL)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bL;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                if (h.lIIllIIlIlIll(bL, lIllIlIIII[16])) {
                    int[] nArray2 = new int[lIllIlIIII[1]];
                    nArray2[h.lIllIlIIII[0]] = lIllIlIIII[16];
                    if (h.lIIllIIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIllIlIIII[1]];
                        nArray3[h.lIllIlIIII[0]] = lIllIlIIII[17];
                        if (h.lIIllIIlIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIllIlIIII[1]];
                            nArray4[h.lIllIlIIII[0]] = lIllIlIIII[18];
                            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                var29 = new d(bL, lIllIlIIII[1], bW);
                                bp.add(var29);
                                0;
                                0;
                                
                                }
                            }
                        }
                    }
                } else {
                    var29 = new d(bL, lIllIlIIII[1], bW);
                    bp.add(var29);
                    0;
                }
            }
        }
    }

    private static void S() {
        bq.putAll(Map.of(lIllIlIIII[181], e.c(lIllIlIIII[170], lIllIlIIII[171])));
        bv.putAll(Map.of(lIllIlIIII[182], e.c(lIllIlIIII[183], lIllIlIIII[184])));
        bu.putAll(Map.of(lIllIlIIII[185], e.c(lIllIlIIII[155], lIllIlIIII[156])));
        bw.putAll(Map.of(lIllIlIIII[186], e.c(lIllIlIIII[187], lIllIlIIII[188])));
        bx.putAll(Map.of(lIllIlIIII[189], e.c(lIllIlIIII[190], lIllIlIIII[191])));
        br.putAll(Map.of(lIllIlIIII[192], e.c(lIllIlIIII[193], lIllIlIIII[194])));
        bs.putAll(Map.of(lIllIlIIII[195], e.c(lIllIlIIII[170], lIllIlIIII[171])));
        bt.putAll(Map.of(lIllIlIIII[134], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        by.putAll(Map.of(lIllIlIIII[136], e.c(lIllIlIIII[137], lIllIlIIII[68])));
        bz.putAll(Map.of(lIllIlIIII[196], e.c(lIllIlIIII[176], lIllIlIIII[177])));
        bA.putAll(Map.of(lIllIlIIII[16], e.c(lIllIlIIII[145], lIllIlIIII[146])));
    }

    private static boolean lIIllIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static void Q() {
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5])) {
            bq.putAll(Map.of(lIllIlIIII[25], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bv.putAll(Map.of(lIllIlIIII[29], e.c(lIllIlIIII[30], lIllIlIIII[31]), lIllIlIIII[32], e.c(lIllIlIIII[30], lIllIlIIII[31])));
            bu.putAll(Map.of(lIllIlIIII[33], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[36], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[39], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[40], e.c(lIllIlIIII[37], lIllIlIIII[38])));
            bx.putAll(Map.of(lIllIlIIII[41], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[44], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[45], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46])) {
            bq.putAll(Map.of(lIllIlIIII[47], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bv.putAll(Map.of(lIllIlIIII[48], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[32], e.c(lIllIlIIII[30], lIllIlIIII[31])));
            bu.putAll(Map.of(lIllIlIIII[49], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[50], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[39], e.c(lIllIlIIII[37], lIllIlIIII[38])));
            bx.putAll(Map.of(lIllIlIIII[41], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[51], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52])) {
            bq.putAll(Map.of(lIllIlIIII[53], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[47], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[54], e.c(lIllIlIIII[55], lIllIlIIII[56])));
            bv.putAll(Map.of(lIllIlIIII[57], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[48], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[127], e.c(lIllIlIIII[55], lIllIlIIII[56])));
            bu.putAll(Map.of(lIllIlIIII[58], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[50], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[59], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[60], e.c(lIllIlIIII[61], lIllIlIIII[62])));
            bx.putAll(Map.of(lIllIlIIII[63], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[51], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[64], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65])) {
            bq.putAll(Map.of(lIllIlIIII[66], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[67], e.c(lIllIlIIII[55], lIllIlIIII[68])));
            bv.putAll(Map.of(lIllIlIIII[69], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[70], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[57], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bu.putAll(Map.of(lIllIlIIII[71], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[72], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[59], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[73], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[76], e.c(lIllIlIIII[74], lIllIlIIII[75])));
            bx.putAll(Map.of(lIllIlIIII[63], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[77], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[78], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[79])) {
            bq.putAll(Map.of(lIllIlIIII[66], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[80], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[128], e.c(lIllIlIIII[82], lIllIlIIII[83])));
            bv.putAll(Map.of(lIllIlIIII[69], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[84], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[85], e.c(lIllIlIIII[82], lIllIlIIII[83])));
            bu.putAll(Map.of(lIllIlIIII[89], e.c(lIllIlIIII[90], lIllIlIIII[91])));
            bw.putAll(Map.of(lIllIlIIII[72], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[92], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[73], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[76], e.c(lIllIlIIII[74], lIllIlIIII[75])));
            bx.putAll(Map.of(lIllIlIIII[93], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[77], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[96], e.c(lIllIlIIII[94], lIllIlIIII[95])));
        }
        br.putAll(Map.of(lIllIlIIII[129], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[97], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[99], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[100], e.c(lIllIlIIII[101], lIllIlIIII[102]), lIllIlIIII[103], e.c(lIllIlIIII[98], lIllIlIIII[42])));
        bs.putAll(Map.of(lIllIlIIII[104], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[107], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[108], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[109], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[110], e.c(lIllIlIIII[105], lIllIlIIII[106])));
        bt.putAll(Map.of(lIllIlIIII[130], e.c(lIllIlIIII[131], lIllIlIIII[132]), lIllIlIIII[133], e.c(lIllIlIIII[131], lIllIlIIII[132]), lIllIlIIII[134], e.c(lIllIlIIII[131], lIllIlIIII[132]), lIllIlIIII[135], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        by.putAll(Map.of(lIllIlIIII[136], e.c(lIllIlIIII[137], lIllIlIIII[68])));
        bz.putAll(Map.of(lIllIlIIII[119], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[138], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[139], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[140], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[141], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46])) {
            bz.putAll(Map.of(lIllIlIIII[142], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52])) {
            bz.putAll(Map.of(lIllIlIIII[143], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[79])) {
            bz.putAll(Map.of(lIllIlIIII[144], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        }
        bA.putAll(Map.of(lIllIlIIII[16], e.c(lIllIlIIII[145], lIllIlIIII[146])));
    }

    private static void P() {
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5])) {
            bq.putAll(Map.of(lIllIlIIII[25], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[28], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bv.putAll(Map.of(lIllIlIIII[29], e.c(lIllIlIIII[30], lIllIlIIII[31]), lIllIlIIII[32], e.c(lIllIlIIII[30], lIllIlIIII[31])));
            bu.putAll(Map.of(lIllIlIIII[33], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[36], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[39], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[40], e.c(lIllIlIIII[37], lIllIlIIII[38])));
            bx.putAll(Map.of(lIllIlIIII[41], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[44], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[45], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46])) {
            bq.putAll(Map.of(lIllIlIIII[47], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bv.putAll(Map.of(lIllIlIIII[48], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[32], e.c(lIllIlIIII[30], lIllIlIIII[31])));
            bu.putAll(Map.of(lIllIlIIII[49], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[50], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[39], e.c(lIllIlIIII[37], lIllIlIIII[38])));
            bx.putAll(Map.of(lIllIlIIII[41], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[51], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52])) {
            bq.putAll(Map.of(lIllIlIIII[53], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[47], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[54], e.c(lIllIlIIII[55], lIllIlIIII[56])));
            bv.putAll(Map.of(lIllIlIIII[57], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[48], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bu.putAll(Map.of(lIllIlIIII[58], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[50], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[59], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[60], e.c(lIllIlIIII[61], lIllIlIIII[62])));
            bx.putAll(Map.of(lIllIlIIII[63], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[51], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[64], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65])) {
            bq.putAll(Map.of(lIllIlIIII[66], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[67], e.c(lIllIlIIII[55], lIllIlIIII[68])));
            bv.putAll(Map.of(lIllIlIIII[69], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[70], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[57], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bu.putAll(Map.of(lIllIlIIII[71], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[72], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[59], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[73], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[76], e.c(lIllIlIIII[74], lIllIlIIII[75])));
            bx.putAll(Map.of(lIllIlIIII[63], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[77], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[78], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[79])) {
            bq.putAll(Map.of(lIllIlIIII[66], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[80], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[81], e.c(lIllIlIIII[82], lIllIlIIII[83])));
            bv.putAll(Map.of(lIllIlIIII[69], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[84], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[85], e.c(lIllIlIIII[82], lIllIlIIII[83]), lIllIlIIII[86], e.c(lIllIlIIII[82], lIllIlIIII[83]), lIllIlIIII[87], e.c(lIllIlIIII[82], lIllIlIIII[83]), lIllIlIIII[88], e.c(lIllIlIIII[82], lIllIlIIII[83])));
            bu.putAll(Map.of(lIllIlIIII[89], e.c(lIllIlIIII[90], lIllIlIIII[91])));
            bw.putAll(Map.of(lIllIlIIII[72], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[92], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[73], e.c(lIllIlIIII[74], lIllIlIIII[75])));
            bx.putAll(Map.of(lIllIlIIII[93], e.c(lIllIlIIII[94], lIllIlIIII[95]), lIllIlIIII[96], e.c(lIllIlIIII[94], lIllIlIIII[95])));
        }
        br.putAll(Map.of(lIllIlIIII[97], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[99], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[100], e.c(lIllIlIIII[101], lIllIlIIII[102]), lIllIlIIII[103], e.c(lIllIlIIII[98], lIllIlIIII[42])));
        bs.putAll(Map.of(lIllIlIIII[104], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[107], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[108], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[109], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[110], e.c(lIllIlIIII[105], lIllIlIIII[106])));
        bt.putAll(Map.of(lIllIlIIII[111], e.c(lIllIlIIII[112], lIllIlIIII[113])));
        by.putAll(Map.of(lIllIlIIII[114], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[117], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[118], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        bz.putAll(Map.of(lIllIlIIII[119], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[120], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[121], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[122], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        bA.putAll(Map.of(lIllIlIIII[123], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[124], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[125], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[126], e.c(lIllIlIIII[115], lIllIlIIII[116])));
    }

    static {
        h.lIIllIIlIIlIl();
        h.lIIllIIIlIIll();
        bp = new ArrayList<d>();
        bq = new HashMap<Integer, Integer>();
        br = new HashMap<Integer, Integer>();
        bs = new HashMap<Integer, Integer>();
        bt = new HashMap<Integer, Integer>();
        bu = new HashMap<Integer, Integer>();
        bv = new HashMap<Integer, Integer>();
        bw = new HashMap<Integer, Integer>();
        bx = new HashMap<Integer, Integer>();
        by = new HashMap<Integer, Integer>();
        bz = new HashMap<Integer, Integer>();
        bA = new HashMap<Integer, Integer>();
    }

    private static boolean lIIllIIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void R() {
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bq.putAll(Map.of(lIllIlIIII[148], e.c(lIllIlIIII[149], lIllIlIIII[150])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bq.putAll(Map.of(lIllIlIIII[151], e.c(lIllIlIIII[152], lIllIlIIII[153])));
        }
        bu.putAll(Map.of(lIllIlIIII[154], e.c(lIllIlIIII[155], lIllIlIIII[156])));
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[79])) {
            bw.putAll(Map.of(lIllIlIIII[157], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[79]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bw.putAll(Map.of(lIllIlIIII[158], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bw.putAll(Map.of(lIllIlIIII[159], e.c(lIllIlIIII[160], lIllIlIIII[161])));
        }
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[79])) {
            bx.putAll(Map.of(lIllIlIIII[162], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[79]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bx.putAll(Map.of(lIllIlIIII[163], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bx.putAll(Map.of(lIllIlIIII[164], e.c(lIllIlIIII[165], lIllIlIIII[166])));
        }
        br.putAll(Map.of(lIllIlIIII[129], e.c(lIllIlIIII[167], lIllIlIIII[168])));
        bs.putAll(Map.of(lIllIlIIII[169], e.c(lIllIlIIII[170], lIllIlIIII[171])));
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            by.putAll(Map.of(lIllIlIIII[136], e.c(lIllIlIIII[137], lIllIlIIII[68])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            by.putAll(Map.of(lIllIlIIII[172], e.c(lIllIlIIII[173], lIllIlIIII[174])));
        }
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bz.putAll(Map.of(lIllIlIIII[175], e.c(lIllIlIIII[176], lIllIlIIII[177])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bz.putAll(Map.of(lIllIlIIII[178], e.c(lIllIlIIII[179], lIllIlIIII[180])));
        }
        bA.putAll(Map.of(lIllIlIIII[16], e.c(lIllIlIIII[145], lIllIlIIII[146])));
    }

    private static boolean lIIllIIlIIllI(int n2) {
        return n2 != 0;
    }
}

