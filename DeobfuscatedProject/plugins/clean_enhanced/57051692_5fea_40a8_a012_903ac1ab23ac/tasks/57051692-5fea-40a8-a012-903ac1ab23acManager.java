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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.57051692-5fea-40a8-a012-903ac1ab23acManager;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.57051692-5fea-40a8-a012-903ac1ab23acManager;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.57051692-5fea-40a8-a012-903ac1ab23acManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class 57051692-5fea-40a8-a012-903ac1ab23acManager {
    
    private static  int bV;
    private static  Map<Integer, Integer> bw;
    private static  Map<Integer, Integer> bt;
    private static  int bE;
    private static  int bT;
    
    private static  Map<Integer, Integer> bz;
    private static  int bW;
    private static  int bH;
    private static  int bR;
    public static  boolean bo;
    private static  Map<Integer, Integer> bA;
    private static  int bD;
    private static  int bC;
    private static  int bS;
    private static  Map<Integer, Integer> bx;
    private static  int bF;
    private static  int bU;
    private static  int bB;
    private static  int bK;
    private static  int bP;
    private static  int bO;
    private static  int bN;
    public static  List<d> bp;
    private static  int bL;
    private static  Map<Integer, Integer> bq;
    private static  int bM;
    private static  int bI;
    private static  Map<Integer, Integer> bv;
    public static  boolean bn;
    private static  Map<Integer, Integer> bu;
    private static  Map<Integer, Integer> br;
    private static  int bQ;
    private static  int bJ;
    private static  Map<Integer, Integer> by;
    private static  Map<Integer, Integer> bs;
    private static  int bG;

    private static boolean n(int n2) {
        if (h.var3(n2, var1[16])) {
            int[] nArray = new int[var1[10]];
            nArray[h.var1[0]] = bB;
            nArray[h.var1[1]] = bC;
            nArray[h.var1[2]] = bD;
            nArray[h.var1[3]] = bE;
            nArray[h.var1[4]] = bF;
            nArray[h.var1[5]] = bG;
            nArray[h.var1[6]] = bH;
            nArray[h.var1[7]] = bI;
            nArray[h.var1[8]] = bJ;
            nArray[h.var1[9]] = bK;
            return h.b(nArray);
        }
        int[] nArray = new int[var1[11]];
        nArray[h.var1[0]] = bB;
        nArray[h.var1[1]] = bC;
        nArray[h.var1[2]] = bD;
        nArray[h.var1[3]] = bE;
        nArray[h.var1[4]] = bF;
        nArray[h.var1[5]] = bG;
        nArray[h.var1[6]] = bH;
        nArray[h.var1[7]] = bI;
        nArray[h.var1[8]] = bJ;
        nArray[h.var1[9]] = bK;
        nArray[h.var1[10]] = n2;
        return h.b(nArray);
    }

    private static void var4() {
        var1 = new int[219];
        h.var1[0] = (0x5E ^ 0x7C) & ~(9 ^ 0x2B);
        h.var1[1] = 1;
        h.var1[2] = 2;
        h.var1[3] = 3;
        h.var1[4] = 0x29 ^ 0x1C ^ (0x4B ^ 0x7A);
        h.var1[5] = 0x6F ^ 6 ^ (0xE5 ^ 0x89);
        h.var1[6] = 0xBA ^ 0x9A ^ (0x78 ^ 0x5E);
        h.var1[7] = 0x3E ^ 0x39;
        h.var1[8] = 0x38 ^ 0x30;
        h.var1[9] = 0xB5 ^ 0xBC;
        h.var1[10] = 0xDC ^ 0xB9 ^ (0x36 ^ 0x59);
        h.var1[11] = 0x19 ^ 0x12;
        h.var1[12] = 181 + 85 - 152 + 91 ^ 71 + 31 - 38 + 129;
        h.var1[13] = 0xEF ^ 0xAF ^ (0x71 ^ 0x3C);
        h.var1[14] = 0x59 ^ 0x57;
        h.var1[15] = -(0xFFFFF453 & 0x6FFF) & (0xFFFFF7DF & 0x7FFA);
        h.var1[16] = -(0xFFFF8BF2 & 0x753F) & (0xFFFFFFFD & 0x2FFF);
        h.var1[17] = 0xFFFFAECF & 0x7FFE;
        h.var1[18] = -(0xFFFFD17B & 0x7EB4) & (0xFFFFFEFF & Short.MAX_VALUE);
        h.var1[19] = 64 + 134 - 132 + 105 ^ 107 + 111 - 87 + 33;
        h.var1[20] = 0x9D ^ 0x8D;
        h.var1[21] = 29 + 73 - 64 + 140 ^ 139 + 94 - 120 + 50;
        h.var1[22] = -(0xFFFFFB0B & 0x45F5) & (0xFFFFEFF2 & 0x7FDF);
        h.var1[23] = 0xFFFFAFDD & 0x7EF6;
        h.var1[24] = 0 ^ 0x12;
        h.var1[25] = 0xFFFFFDC1 & 0x6BF;
        h.var1[26] = -(0xFFFFE98F & 0x3673) & (0xFFFFFEFE & 0x655F);
        h.var1[27] = -(0xFFFFDD91 & 0x33FF) & (0xFFFFDDFC & 0x7FBF);
        h.var1[28] = -(0xFFFFBFDD & 0x6B3B) & (0xFFFFFFBB & 0x2FDF);
        h.var1[29] = -(0xFFFFBEEB & 0x7117) & (0xFFFFB5E7 & 0x7EBF);
        h.var1[30] = -(88 + 100 - 8 + 34) & (0xFFFFBDF7 & Short.MAX_VALUE);
        h.var1[31] = 0xFFFFFF9D & 0x4BEE;
        h.var1[32] = -(0xFFFF91C7 & 0x7F39) & (0xFFFFD5AF & 0x3FF7);
        h.var1[33] = 0xFFFFBD2F & 0x47FB;
        h.var1[34] = 0xFFFFE4C5 & 0x5FBE;
        h.var1[35] = -(0xFFFFB95A & 0x67A7) & (0xFFFFFFFF & 0x7BBF);
        h.var1[36] = -(0xFFFFBB6B & 0x5D97) & (0xFFFFFF7F & 0x1DDF);
        h.var1[37] = -(0xFFFFF7BE & 0x3F6F) & (0xFFFFFFFF & 0x7F3F);
        h.var1[38] = 0xFFFFDAEF & 0x77FE;
        h.var1[39] = -(0xFFFFEFC7 & 0x7339) & (0xFFFFE7FF & 0x7F5B);
        h.var1[40] = -(0xFFFFBB4B & 0x76B7) & (0xFFFFF67F & 0x3FCF);
        h.var1[41] = -(0xFFFFEB3D & 0x7CD3) & (0xFFFFFFFB & 0x6C3F);
        h.var1[42] = -(0xFFFFFC5B & 0xBBE) & (0xFFFFFFFD & 0x5FFF);
        h.var1[43] = -(0xFFFFFC45 & 0x1FFF) & (0xFFFFFF7C & Short.MAX_VALUE);
        h.var1[44] = 0xFFFFB4FF & 0x4F33;
        h.var1[45] = -(0xFFFFBFD1 & 0x7AEF) & (0xFFFFBFFB & 0x7EFD);
        h.var1[46] = 0x3F ^ 0x1B ^ (0x8D ^ 0xBD);
        h.var1[47] = -(0xFFFFCFF3 & 0x705F) & (0xFFFFD6F7 & 0x6DDF);
        h.var1[48] = -(0xFFFFE9DD & 0x5F27) & (0xFFFFDFAF & 0x6DFD);
        h.var1[49] = -(0xFFFFD1D9 & 0x7EF7) & (0xFFFFD7FD & 0x7DFF);
        h.var1[50] = -(0xFFFFF5E1 & 0x5ABF) & (0xFFFFFFFF & 0x54FF);
        h.var1[51] = 0xFFFFFF7D & 0x4AF;
        h.var1[52] = 0x2E ^ 0x30;
        h.var1[53] = 0xFFFFCDEF & 0x3697;
        h.var1[54] = 0xFFFFDFF2 & 0x6EDF;
        h.var1[55] = -(0xFFFFE9DA & 0x76A7) & (0xFFFFFFFD & 0xF2FF);
        h.var1[56] = 0xFFFFC3FC & 0xFD5F;
        h.var1[57] = 0xFFFFCEEF & 0x35BD;
        h.var1[58] = -(0xFFFFFCCF & 0x537D) & (0xFFFFDFFD & 0x757F);
        h.var1[59] = -(0xFFFFD9EF & 0x7E1F) & (0xFFFFFEFF & 0x5D6F);
        h.var1[60] = 0xFFFFFFFF & 0x2FFF;
        h.var1[61] = 0xFFFFB67A & 0xDFB7;
        h.var1[62] = 0xFFFFBF1F & 0xE1EE;
        h.var1[63] = -(0xFFFFFAF1 & 0x6D1F) & (0xFFFFEDBF & 0x7E7F);
        h.var1[64] = -(0xFFFFF64B & 0x2BF7) & (0xFFFFA7FF & 0x7E7F);
        h.var1[65] = 0x3A ^ 0x12;
        h.var1[66] = 0xFFFFAD8F & 0x56F9;
        h.var1[67] = -(0xFFFFF1F7 & 0x6FDB) & (0xFFFFEFFF & 0x7BFF);
        h.var1[68] = -(0xFFFF8786 & 0x7DFB) & (0xFFFFFFFF & 0x9FCD);
        h.var1[69] = 0xFFFF9FFF & 0x64AF;
        h.var1[70] = 0xFFFFAFFF & 0x5A2B;
        h.var1[71] = -(0xFFFFFBBD & 0x7ECB) & (0xFFFFFFBB & Short.MAX_VALUE);
        h.var1[72] = 0xFFFF966F & 0x6DF3;
        h.var1[73] = 0xFFFFFAFF & 0xF2F;
        h.var1[74] = -(0xFFFFEAFF & 0x5732) & (0xFFFFFFF3 & 0xFF7F);
        h.var1[75] = -(0xFFFFD5E7 & 0x2FDA) & (0xFFFFDDFF & 0xEFDF);
        h.var1[76] = 0xFFFFF75F & 0xCF7;
        h.var1[77] = 0xFFFF873B & 0x7CF5;
        h.var1[78] = 0xFFFF864F & 0x7DF3;
        h.var1[79] = 3 ^ (0xA4 ^ 0x9B);
        h.var1[80] = 0xFFFFE4DB & 0x1FAF;
        h.var1[81] = -(0xFFFFBB8F & 0x46F5) & (0xFFFFFFFF & 0x6FF);
        h.var1[82] = 0xFFFFFF0F & 0x175FC;
        h.var1[83] = 0xFFFFBF1F & 0x1DCFC;
        h.var1[84] = -(0xFFFFBFFB & 0x690F) & (0xFFFFFFBF & 0x2DFB);
        h.var1[85] = 0xFFFFEEFB & 0x1B77;
        h.var1[86] = 0xFFFFF6BC & 0x39F7;
        h.var1[87] = -(0xFFFFFD9D & 0x726B) & (0xFFFFF7BB & 0x7CED);
        h.var1[88] = 0xFFFFFF7B & 0xAE7;
        h.var1[89] = 0xFFFFB777 & 0x4DBD;
        h.var1[90] = -(0xFFFFF97A & 0x679F) & (0xFFFFF3FD & 0xFFBF);
        h.var1[91] = -(0xFFFFD14F & 0x3EB1) & (0xFFFFF8DE & 0xBFFF);
        h.var1[92] = 0xFFFFAD5F & 0x56F9;
        h.var1[93] = 0xFFFFAC7F & 0x57B7;
        h.var1[94] = -(0xFFFFE37F & 0x1FDB) & (0xFFFFFFFF & 0xF77E);
        h.var1[95] = -(0xFFFFF66F & 0x5993) & (0xFFFFF7FA & 0x17E8F);
        h.var1[96] = 0xFFFFA575 & 0x5ECF;
        h.var1[97] = 0xFFFFFEFF & 0x7BD;
        h.var1[98] = -(0xFFFFCD3A & 0x36FF) & (0xFFFFFDFD & 0x4E7F);
        h.var1[99] = -(0xFFFFFDB5 & 0x637B) & (0xFFFFF7F7 & 0x6FFB);
        h.var1[100] = 0xFFFFFBFF & 0x2C7C;
        h.var1[101] = -(16 + 103 - 49 + 83) & (0xFFFF97FC & 0xFEFF);
        h.var1[102] = 0xFFFFA6DC & 0xFF27;
        h.var1[103] = 0xFFFF8EF3 & 0x77CD;
        h.var1[104] = 0xFFFF9BFB & 0x67FF;
        h.var1[105] = -(0xFFFFEDA7 & 0x165B) & (0xFFFFFF6F & 0x5F96);
        h.var1[106] = -(0xFFFFFDBD & 0xA4E) & (0xFFFFFB6F & Short.MAX_VALUE);
        h.var1[107] = 0xFFFFAFFF & 0x53EF;
        h.var1[108] = 0xFFFFDFFF & 0x23FF;
        h.var1[109] = -(0xFFFFBA3D & 0x47F7) & (0xFFFFD7BF & 0x2E77);
        h.var1[110] = -(0xFFFFD7CF & 0x6E7B) & (0xFFFFD7EB & 0x7F7F);
        h.var1[111] = 0xFFFFEFFE & 0x1373;
        h.var1[112] = 60 + 129 - 46 + 30 + (0x9A ^ 0x91) - (0x7B ^ 0x38) + (0xF ^ 0x66);
        h.var1[113] = 157 + 113 - 216 + 179;
        h.var1[114] = -(0xFFFFDBED & 0x3C5F) & (0xFFFFDEEF & 0x3D7F);
        h.var1[115] = 0xFFFFEF7C & 0x7BEF;
        h.var1[116] = 0xFFFFFEAE & 0x7F7D;
        h.var1[117] = -(0xFFFFA4DD & 0x5F37) & (0xFFFFFFFF & 0xF7E);
        h.var1[118] = -(0xFFFFFD6A & 0x669F) & (0xFFFFEF6F & 0x7FF9);
        h.var1[119] = 0xFFFF8FA5 & 0x747F;
        h.var1[120] = -(0xFFFFD6D3 & 0x7DBD) & (0xFFFFDFDE & Short.MAX_VALUE);
        h.var1[121] = -(0xFFFFE692 & 0x79FF) & (0xFFFFFBF3 & 0x6FFF);
        h.var1[122] = -(0xFFFFF4C9 & 0xF3E) & (0xFFFFDFFF & 0x2F5F);
        h.var1[123] = -(0xFFFFB8ED & 0x7F1F) & (0xFFFFBFEF & 0x7E7F);
        h.var1[124] = 0xFFFFFF6F & 0x6F5;
        h.var1[125] = -(0xFFFFFD93 & 0x5B7D) & (0xFFFFFFFB & 0x5F7F);
        h.var1[126] = 0xFFFFAFE7 & 0x567F;
        h.var1[127] = 0xFFFFF577 & 0x3A8B;
        h.var1[128] = 0xFFFFBBFD & 0x4E73;
        h.var1[129] = 0xFFFF8EBC & 0x77EB;
        h.var1[130] = -(0xFFFFF337 & 0x3DCB) & (0xFFFFFFFE & Short.MAX_VALUE);
        h.var1[131] = 0xFFFFD7FB & 0xFEDC;
        h.var1[132] = 0xFFFFFFEB & 0xFDFC;
        h.var1[133] = -(0xFFFFE2DE & 0x3DFF) & (0xFFFFFFFF & 0x6FDF);
        h.var1[134] = -(0xFFFFD6FD & 0x3983) & (0xFFFFFFCB & 0x5FBF);
        h.var1[135] = 0xFFFFFF3F & 0x4FC8;
        h.var1[136] = -(0xFFFFF0EE & 0x4F9B) & (0xFFFFEFFF & 0x7BFF);
        h.var1[137] = -(0xFFFFF5B7 & 0x7E7D) & (0xFFFFFF7C & 0xFEFF);
        h.var1[138] = -(0xFFFFF4D7 & 0x4B69) & (0xFFFFEFFF & 0x576D);
        h.var1[139] = 0xFFFFF73B & 0x18DD;
        h.var1[140] = -(0xFFFFCE9E & 0x3D6B) & (0xFFFFDEFF & 0x3DDF);
        h.var1[141] = 0xFFFF96F6 & 0x6B7B;
        h.var1[142] = 0xFFFF929F & 0x7D7B;
        h.var1[143] = -(0xFFFFCF6F & 0x77F1) & (0xFFFFFFFF & 0x577F);
        h.var1[144] = 0xFFFFD1E3 & 0x3E3F;
        h.var1[145] = 0xFFFFE79E & 0x7BFD;
        h.var1[146] = -(0xFFFFBF73 & 0x448F) & (0xFFFFFFBF & 0x777E);
        h.var1[147] = 88 + 170 - 226 + 185 ^ 3 + 158 - 125 + 123;
        h.var1[148] = 0xFFFFD8FE & 0x3FB7;
        h.var1[149] = -(0xFFFFFF56 & 0x8FF) & (0xFFFFFFFF & 0x69FD);
        h.var1[150] = -(0xFFFFF707 & 0x7EFF) & (0xFFFFFEFE & 0xFFBF);
        h.var1[151] = 0xFFFFAFAF & 0x7FFB;
        h.var1[152] = -(0xFFFFD777 & 0x2AD9) & (0xFFFFFFFA & 0x4F7DD);
        h.var1[153] = -(0xFFFFEFE7 & 0x513F) & (0xFFFFFDBE & 0x55FFF);
        h.var1[154] = -(0xFFFFAD3A & 0x56C7) & (0xFFFFBDFD & 0x77F7);
        h.var1[155] = 0xFFFFBFF8 & 0xAC757;
        h.var1[156] = -(0xFFFFB2A7 & 0x5D5A) & (0xFFFFDFFD & 0xB7AA3);
        h.var1[157] = -(0xFFFFE3F9 & 0x7C2F) & (0xFFFFEDFB & 0x7BEF);
        h.var1[158] = -(0xFFFF92B9 & 0x7F67) & (0xFFFFDFF7 & 0x3BED);
        h.var1[159] = 0xFFFFBEEE & 0x71DD;
        h.var1[160] = -(0xFFFFD756 & 0x3DEF) & (0xFFFFFFFD & 0x57FFF);
        h.var1[161] = -(0xFFFFCFBB & 0x3C77) & (0xFFFFBFFF & 0x5DDFA);
        h.var1[162] = 0xFFFF9DFD & 0x6BBF;
        h.var1[163] = -(0xFFFFE62B & 0x5BD5) & (0xFFFFCBFF & 0x7FBF);
        h.var1[164] = -(0xFFFFF837 & 0xFF9) & (0xFFFFB8FE & Short.MAX_VALUE);
        h.var1[165] = -(0xFFFFEDFF & 0x1362) & (0xFFFFFFFF & 0x9FFF9);
        h.var1[166] = -(0xFFFF9FF3 & 0x7A0D) & (0xFFFFFFFF & 0xA3FA8);
        h.var1[167] = 0xFFFFEDD9 & 0x15E2E;
        h.var1[168] = 0xFFFFFB3F & 0x177D8;
        h.var1[169] = -(0xFFFFC6F3 & 0x7FFD) & (0xFFFFFFF3 & 0x6FFF);
        h.var1[170] = -(0xFFFFD1F2 & 0x3ECF) & (0xFFFFB8DD & 0xDFFFB);
        h.var1[171] = -(0xFFFFB8F7 & 0x67AF) & (0xFFFFFDFF & 0xE3FEE);
        h.var1[172] = 0xFFFFFCCF & 0x33FA;
        h.var1[173] = 0xFFFFFFBB & 0x51E6C;
        h.var1[174] = 0xFFFFAE2D & 0x57FFE;
        h.var1[175] = -(0xFFFF9F7F & 0x67C7) & (0xFFFFDFFE & 0x3FFF);
        h.var1[176] = 0xFFFFEB9D & 0x2BFFA;
        h.var1[177] = -(0xFFFFA977 & 0x7FDA) & (0xFFFFFBFB & 0x2FFFD);
        h.var1[178] = 0xFFFFCDD7 & 0x7FF9;
        h.var1[179] = -(0x1F ^ 0x1A) & (0xFFFFFFDF & 0x11EDFC);
        h.var1[180] = -(0xFFFFDFB7 & 0x624C) & (0xFFFFFEFB & 0x1257EF);
        h.var1[181] = 0xFFFFF3B6 & 0x5F7B;
        h.var1[182] = -(0xFFFFED85 & 0x76FF) & (0xFFFFFDFF & Short.MAX_VALUE);
        h.var1[183] = -(0xE6 ^ 0xB0) & (0xFFFFFF7D & 0x8EDFF);
        h.var1[184] = -(0xFFFFA71F & 0x7EF3) & (0xFFFFBF7E & 0x9EFFB);
        h.var1[185] = -(0xFFFFE8AC & 0x3757) & (0xFFFFBB7F & 0x7DFF);
        h.var1[186] = 0xFFFFD3BF & 0x7F75;
        h.var1[187] = 0xFFFFFA1D & 0x1625F2;
        h.var1[188] = 0xFFFFFCFE & 0x16BF51;
        h.var1[189] = 0xFFFFDB7A & 0x77BD;
        h.var1[190] = 0xFFFFFCF0 & 0x118F3F;
        h.var1[191] = 0xFFFF97FC & 0x137AD3;
        h.var1[192] = 0xFFFFEBFF & 0x3F78;
        h.var1[193] = 0xFFFFF374 & 0x2D0FFB;
        h.var1[194] = -(0xFFFFEF7B & 0x12C7) & (0xFFFF9FDB & 0x2EFFFE);
        h.var1[195] = 0xFFFFD9FE & 0x3FA9;
        h.var1[196] = -(0xFFFFD7FF & 0x29BB) & (0xFFFFAFFF & 0x7FFA);
        h.var1[197] = 0xFFFFDC1B & 0x27FE;
        h.var1[198] = 0xFFFF8ED2 & 0x753F;
        h.var1[199] = -(0xFFFFD2DE & 0x7DE3) & (0xFFFFD5F7 & 0x7EDF);
        h.var1[200] = 0xFFFFFDB5 & 0x3AEE;
        h.var1[201] = 0xFFFF861D & 0x7DF6;
        h.var1[202] = 0xFFFF850F & 0x7EFE;
        h.var1[203] = -(0xFFFFB967 & 0x5E9F) & (0xFFFFFDFF & 0x1E1E);
        h.var1[204] = 0xFFFFADB4 & 0x565B;
        h.var1[205] = 0xFFFF95DD & 0x6E3F;
        h.var1[206] = -(0xFFFFFDFD & 0x4E9F) & (0xFFFFFEFF & 0x4FDF);
        h.var1[207] = 0xFFFFF3FF & 0xFF9;
        h.var1[208] = -(0x20 ^ 3) & (0xFFFFBFBF & 0x47FF);
        h.var1[209] = -(0xFFFFA973 & 0x7ECD) & (0xFFFFEFFF & 0x3EFF);
        h.var1[210] = 0xFFFFEDF5 & 0x176F;
        h.var1[211] = 0xFFFFFF33 & 0x2EC;
        h.var1[212] = 0xFFFF8B79 & 0x76C7;
        h.var1[213] = 0xFFFFD51F & 0x2EEB;
        h.var1[214] = -(0xFFFFBEE5 & 0x6DFB) & (0xFFFFFFFF & 0x2EFE);
        h.var1[215] = -(0xFFFFDBF7 & 0x3CCF) & (0xFFFFFEEF & 0x1DDF);
        h.var1[216] = 7 + 116 - -4 + 16 ^ 155 + 153 - 299 + 147;
        h.var1[217] = 4 ^ 0x33 ^ (0x9A ^ 0xB8);
        h.var1[218] = 0x89 ^ 0xBB ^ (0x20 ^ 4);
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
        bK = bL = var1[0];
        bJ = bL;
        bI = bL;
        bH = bL;
        bG = bL;
        bF = bL;
        bE = bL;
        bD = bL;
        bC = bL;
        bB = bL;
        bV = bW = var1[0];
        bU = bW;
        bT = bW;
        bS = bW;
        bR = bW;
        bQ = bW;
        bP = bW;
        bO = bW;
        bN = bW;
        bM = bW;
        bo = var1[0];
        System.out.println(var2[var1[46]]);
    }

    private static void var5() {
        var2 = new String[var1[218]];
        h.var2[h.var1[0]] = "f2pmelee";
        h.var2[h.var1[1]] = "f2pquest";
        h.var2[h.var1[2]] = "f2pmage";
        h.var2[h.var1[3]] = "mage";
        h.var2[h.var1[4]] = "quest";
        h.var2[h.var1[5]] = "questNoWep";
        h.var2[h.var1[6]] = "melee";
        h.var2[h.var1[7]] = "agility";
        h.var2[h.var1[8]] = "meleeNmz";
        h.var2[h.var1[9]] = "rangeNmz";
        h.var2[h.var1[10]] = "Randomized Equipment:";
        h.var2[h.var1[11]] = "Buying items";
        h.var2[h.var1[12]] = "Finished buying items, switching back to randomGearing";
        h.var2[h.var1[13]] = "Navigating to bank";
        h.var2[h.var1[14]] = "Handling banking";
        h.var2[h.var1[19]] = "We are missing random gear, switching to BUYING";
        h.var2[h.var1[20]] = "We are missing random gear, switching to BUYING";
        h.var2[h.var1[21]] = "We are missing random gear, switching to BUYING";
        h.var2[h.var1[24]] = "Finished gearing random";
        h.var2[h.var1[216]] = "Unexpected error occurred while getting a random key.";
        h.var2[h.var1[46]] = "Random gear lists CLEARED";
        h.var2[h.var1[217]] = "wealth";
    }

    private static boolean var6(int n2, int n3) {
        return n2 >= n3;
    }

    public static boolean b(int[] nArray) {
        int[] var7;
        int var8 = var1[0];
        while (h.var9(var8, var7.length)) {
            if (h.var10(var7[var8])) {
                int[] nArray2 = new int[var1[1]];
                nArray2[h.var1[0]] = var7[var8];
                if (h.var11(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + var7[var8]);
                    return var1[0];
                }
            }
            ++var8;
            0;
            if (((0x58 ^ 0x36 ^ (0xEA ^ 0x83)) & (67 + 7 - 23 + 76 ^ (0x1C ^ 0x64) ^ -1)) == 0) continue;
            return ((0xA1 ^ 0xC1 ^ (0x74 ^ 0x19)) & (0x30 ^ 0x34 ^ (0x74 ^ 0x7D) ^ -1)) != 0;
        }
        return var1[1];
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static void T() {
        bq.putAll(Map.of(var1[197], e.c(var1[26], var1[27]), var1[198], e.c(var1[26], var1[27]), var1[199], e.c(var1[200], var1[98]), var1[201], e.c(var1[200], var1[98]), var1[202], e.c(var1[200], var1[98]), var1[203], e.c(var1[200], var1[98]), var1[204], e.c(var1[200], var1[98]), var1[205], e.c(var1[115], var1[146]), var1[206], e.c(var1[26], var1[27])));
        bq.putAll(Map.of(var1[25], e.c(var1[200], var1[98]), var1[207], e.c(var1[200], var1[98]), var1[208], e.c(var1[200], var1[98])));
        br.putAll(Map.of(var1[97], e.c(var1[98], var1[42]), var1[99], e.c(var1[98], var1[42]), var1[209], e.c(var1[98], var1[42])));
        bs.putAll(Map.of(var1[104], e.c(var1[105], var1[106]), var1[107], e.c(var1[105], var1[106]), var1[108], e.c(var1[105], var1[106]), var1[109], e.c(var1[105], var1[106]), var1[110], e.c(var1[105], var1[106])));
        bt.putAll(Map.of());
        bu.putAll(Map.of(var1[210], e.c(var1[34], var1[35])));
        bw.putAll(Map.of(var1[211], e.c(var1[37], var1[38]), var1[212], e.c(var1[37], var1[38]), var1[213], e.c(var1[37], var1[38])));
        bx.putAll(Map.of(var1[214], e.c(var1[42], var1[43]), var1[215], e.c(var1[42], var1[43])));
        by.putAll(Map.of(var1[114], e.c(var1[137], var1[68]), var1[118], e.c(var1[115], var1[116]), var1[117], e.c(var1[115], var1[116])));
        bz.putAll(Map.of(var1[119], e.c(var1[115], var1[116]), var1[121], e.c(var1[115], var1[116]), var1[122], e.c(var1[115], var1[116]), var1[120], e.c(var1[115], var1[116])));
        bA.putAll(Map.of(var1[123], e.c(var1[115], var1[116]), var1[125], e.c(var1[115], var1[116]), var1[126], e.c(var1[115], var1[116])));
    }

    public static void d(String string) {
        if (!h.var12(bB) || h.var11(bH)) {
            String var13;
            if (h.var12(var13.equalsIgnoreCase(var2[var1[0]]) ? 1 : 0)) {
                h.P();
            }
            if (h.var12(var13.equalsIgnoreCase(var2[var1[1]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.var12(var13.equalsIgnoreCase(var2[var1[2]]) ? 1 : 0)) {
                h.T();
            }
            if (h.var12(var13.equalsIgnoreCase(var2[var1[3]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.var12(var13.equalsIgnoreCase(var2[var1[4]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.var12(var13.equalsIgnoreCase(var2[var1[5]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.var12(var13.equalsIgnoreCase(var2[var1[6]]) ? 1 : 0)) {
                h.Q();
            }
            if (h.var12(var13.equalsIgnoreCase(var2[var1[7]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.var12(var13.equalsIgnoreCase(var2[var1[8]]) ? 1 : 0)) {
                h.S();
            }
            if (h.var12(var13.equalsIgnoreCase(var2[var1[9]]) ? 1 : 0)) {
                h.R();
            }
            h.U();
            System.out.println(var2[var1[10]]);
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
        if (h.var12(bB) && h.var12(bH)) {
            if (h.var12(bn)) {
                AccBuilderShamans.c = var2[var1[11]];
                b.a(bp);
                if (h.var9(bp.size(), var1[1])) {
                    System.out.println(var2[var1[12]]);
                    bn = var1[0];
                }
            }
            if (h.var11(bn)) {
                BankLocation var14 = BankLocation.getNearest();
                if (h.var15(var14) && h.var11(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = var2[var1[13]];
                    a.a(var14);
                }
                if (h.var15(var14) && h.var12(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = var2[var1[14]];
                    if (h.var11(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)var1[15]);
                        0;
                    }
                    if (h.var12(Bank.isOpen() ? 1 : 0)) {
                        if (h.var10(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)var1[4]);
                            0;
                        }
                        if (h.var10(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)var1[2]);
                            0;
                        }
                        if (h.var3(bL, var1[16])) {
                            int[] nArray = new int[var1[1]];
                            nArray[h.var1[0]] = var1[17];
                            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[var1[1]];
                                nArray2[h.var1[0]] = var1[16];
                                if (h.var11(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[var1[1]];
                                    nArray3[h.var1[0]] = var1[18];
                                    if (h.var11(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                        h.O();
                                        System.out.println(var2[var1[19]]);
                                        bn = var1[1];
                                        return;
                                    }
                                }
                            }
                            int[] nArray4 = new int[var1[10]];
                            nArray4[h.var1[0]] = bB;
                            nArray4[h.var1[1]] = bC;
                            nArray4[h.var1[2]] = bD;
                            nArray4[h.var1[3]] = bE;
                            nArray4[h.var1[4]] = bF;
                            nArray4[h.var1[5]] = bG;
                            nArray4[h.var1[6]] = bH;
                            nArray4[h.var1[7]] = bI;
                            nArray4[h.var1[8]] = bJ;
                            nArray4[h.var1[9]] = bK;
                            if (h.var11(h.b(nArray4) ? 1 : 0)) {
                                h.O();
                                System.out.println(var2[var1[20]]);
                                bn = var1[1];
                                return;
                            }
                        }
                        if (h.var16(bL, var1[16])) {
                            int[] nArray = new int[var1[11]];
                            nArray[h.var1[0]] = bB;
                            nArray[h.var1[1]] = bC;
                            nArray[h.var1[2]] = bD;
                            nArray[h.var1[3]] = bE;
                            nArray[h.var1[4]] = bF;
                            nArray[h.var1[5]] = bG;
                            nArray[h.var1[6]] = bH;
                            nArray[h.var1[7]] = bI;
                            nArray[h.var1[8]] = bJ;
                            nArray[h.var1[9]] = bK;
                            nArray[h.var1[10]] = bL;
                            if (h.var11(h.b(nArray) ? 1 : 0)) {
                                h.O();
                                System.out.println(var2[var1[21]]);
                                bn = var1[1];
                                return;
                            }
                        }
                        if (h.var12(h.n(bL) ? 1 : 0)) {
                            int[] nArray = new int[var1[11]];
                            nArray[h.var1[0]] = bB;
                            nArray[h.var1[1]] = bC;
                            nArray[h.var1[2]] = bD;
                            nArray[h.var1[3]] = bE;
                            nArray[h.var1[4]] = bF;
                            nArray[h.var1[5]] = bG;
                            nArray[h.var1[6]] = bH;
                            nArray[h.var1[7]] = bI;
                            nArray[h.var1[8]] = bJ;
                            nArray[h.var1[9]] = bK;
                            nArray[h.var1[10]] = bL;
                            int[] var17 = nArray;
                            if (h.var3(bL, var1[16])) {
                                int[] nArray5 = new int[var1[1]];
                                nArray5[h.var1[0]] = var1[16];
                                if (h.var11(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    int[] nArray6 = new int[var1[1]];
                                    nArray6[h.var1[0]] = var1[17];
                                    if (h.var12(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                        a.a(var1[17], var1[1]);
                                    }
                                }
                                int[] nArray7 = new int[var1[1]];
                                nArray7[h.var1[0]] = var1[16];
                                if (h.var11(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                    int[] nArray8 = new int[var1[1]];
                                    nArray8[h.var1[0]] = var1[17];
                                    if (h.var11(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                        int[] nArray9 = new int[var1[1]];
                                        nArray9[h.var1[0]] = var1[17];
                                        if (h.var11(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                            int[] nArray10 = new int[var1[1]];
                                            nArray10[h.var1[0]] = var1[18];
                                            if (h.var12(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                                a.a(var1[18], var1[1]);
                                            }
                                        }
                                    }
                                }
                            }
                            a.a(var17, var1[1]);
                            Time.sleepTicks((int)e.c(var1[10], var1[14]));
                            0;
                            if (h.var12(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks((int)e.c(var1[3], var1[5]));
                                0;
                            }
                            while (!h.var11(Inventory.contains((int[])var17) ? 1 : 0) || h.var12(Inventory.contains(item -> {
                                int n2;
                                if (h.var12(item.getName().contains(var2[var1[217]]) ? 1 : 0) && h.var11(item.isNoted() ? 1 : 0)) {
                                    n2 = var1[1];
                                    0;
                                    if null != null {
                                        return ((0x28 ^ 0x7B) & ~(0xC ^ 0x5F)) != 0;
                                    }
                                } else {
                                    n2 = var1[0];
                                }
                                return n2 != 0;
                            }) ? 1 : 0)) {
                                e.l(bB);
                                e.l(bC);
                                e.l(bD);
                                e.l(bE);
                                Time.sleepTicks((int)var1[1]);
                                0;
                                e.l(bF);
                                e.l(bG);
                                e.l(bH);
                                Time.sleepTicks((int)var1[1]);
                                0;
                                e.l(bI);
                                e.l(bJ);
                                e.l(bK);
                                e.l(bL);
                                Time.sleepTicks((int)var1[1]);
                                0;
                                e.l(var1[16]);
                                e.l(var1[17]);
                                e.l(var1[18]);
                                e.l(var1[22]);
                                e.l(var1[23]);
                                0;
                                if (((3 ^ 0x5D) & ~(0x23 ^ 0x7D)) <= 0) continue;
                                return;
                            }
                            if (h.var11(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)var1[15]);
                                0;
                                Time.sleepTicks((int)var1[4]);
                                0;
                                System.out.println(var2[var1[24]]);
                                bo = var1[1];
                            }
                        }
                    }
                }
            }
        }
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 > 0;
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static int a(Map<Integer, Integer> map, Random random) {
        Map<Integer, Integer> var24;
        void var25;
        if (h.var12(map.isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        int var26 = var25.nextInt(var24.size());
        int var27 = var1[0];
        Iterator<Integer> var28 = var24.keySet().iterator();
        while (h.var12(var28.hasNext() ? 1 : 0)) {
            int var29 = var28.next();
            if (h.var3(var27, var26)) {
                return var29;
            }
            ++var27;
            0;
            if (2 > 1) continue;
            return (0x62 ^ 0x56) & ~(0x8C ^ 0xB8);
        }
        throw new IllegalStateException(var2[var1[216]]);
    }

    private static String var30(String var31, String var32) {
        var31 = new String(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var33 = new StringBuilder();
        char[] var34 = var32.toCharArray();
        int var35 = var1[0];
        char[] var36 = var31.toCharArray();
        int var37 = var36.length;
        int var38 = var1[0];
        while (h.var9(var38, var37)) {
            char var39 = var36[var38];
            var33.append((char)(var39 ^ var34[var35 % var34.length]));
            0;
            ++var35;
            ++var38;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var33);
    }

    private static void U() {
        Random random = new Random();
        bB = h.a(bq, random);
        bM = bq.getOrDefault(bB, var1[0]);
        bC = h.a(br, random);
        bN = br.getOrDefault(bC, var1[0]);
        bD = h.a(bs, random);
        bO = bs.getOrDefault(bD, var1[0]);
        bE = h.a(bt, random);
        bP = bt.getOrDefault(bE, var1[0]);
        bF = h.a(bu, random);
        bQ = bu.getOrDefault(bF, var1[0]);
        bG = h.a(bv, random);
        bR = bv.getOrDefault(bG, var1[0]);
        bH = h.a(bw, random);
        bS = bw.getOrDefault(bH, var1[0]);
        bI = h.a(bx, random);
        bT = bx.getOrDefault(bI, var1[0]);
        bJ = h.a(by, random);
        bU = by.getOrDefault(bJ, var1[0]);
        bK = h.a(bz, random);
        bV = bz.getOrDefault(bK, var1[0]);
        bL = h.a(bA, random);
        bW = bA.getOrDefault(bL, var1[0]);
    }

        catch (Exception var45) {
            var45.printStackTrace();
            return null;
        }
    }

    private static void O() {
        d var46;
        if (h.var12(bB)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bB;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(bB, var1[1], bM);
                bp.add(d2);
                0;
            }
        }
        if (h.var12(bC)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bC;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                var46 = new DHelper(bC, var1[1], bN);
                bp.add(var46);
                0;
            }
        }
        if (h.var12(bD)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bD;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                var46 = new DHelper(bD, var1[1], bO);
                bp.add(var46);
                0;
            }
        }
        if (h.var12(bE)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bE;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                var46 = new DHelper(bE, var1[1], bP);
                bp.add(var46);
                0;
            }
        }
        if (h.var12(bF)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bF;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                var46 = new DHelper(bF, var1[1], bQ);
                bp.add(var46);
                0;
            }
        }
        if (h.var12(bG)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bG;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                var46 = new DHelper(bG, var1[1], bR);
                bp.add(var46);
                0;
            }
        }
        if (h.var12(bH)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bH;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                var46 = new DHelper(bH, var1[1], bS);
                bp.add(var46);
                0;
            }
        }
        if (h.var12(bI)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bI;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                var46 = new DHelper(bI, var1[1], bT);
                bp.add(var46);
                0;
            }
        }
        if (h.var12(bJ)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bJ;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                var46 = new DHelper(bJ, var1[1], bU);
                bp.add(var46);
                0;
            }
        }
        if (h.var12(bK)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bK;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                var46 = new DHelper(bK, var1[1], bV);
                bp.add(var46);
                0;
            }
        }
        if (h.var12(bL)) {
            int[] nArray = new int[var1[1]];
            nArray[h.var1[0]] = bL;
            if (h.var11(Bank.contains((int[])nArray) ? 1 : 0)) {
                if (h.var3(bL, var1[16])) {
                    int[] nArray2 = new int[var1[1]];
                    nArray2[h.var1[0]] = var1[16];
                    if (h.var11(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[var1[1]];
                        nArray3[h.var1[0]] = var1[17];
                        if (h.var11(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[var1[1]];
                            nArray4[h.var1[0]] = var1[18];
                            if (h.var11(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                var46 = new DHelper(bL, var1[1], bW);
                                bp.add(var46);
                                0;
                                0;
                                if null != null {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    var46 = new DHelper(bL, var1[1], bW);
                    bp.add(var46);
                    0;
                }
            }
        }
    }

    private static void S() {
        bq.putAll(Map.of(var1[181], e.c(var1[170], var1[171])));
        bv.putAll(Map.of(var1[182], e.c(var1[183], var1[184])));
        bu.putAll(Map.of(var1[185], e.c(var1[155], var1[156])));
        bw.putAll(Map.of(var1[186], e.c(var1[187], var1[188])));
        bx.putAll(Map.of(var1[189], e.c(var1[190], var1[191])));
        br.putAll(Map.of(var1[192], e.c(var1[193], var1[194])));
        bs.putAll(Map.of(var1[195], e.c(var1[170], var1[171])));
        bt.putAll(Map.of(var1[134], e.c(var1[131], var1[132])));
        by.putAll(Map.of(var1[136], e.c(var1[137], var1[68])));
        bz.putAll(Map.of(var1[196], e.c(var1[176], var1[177])));
        bA.putAll(Map.of(var1[16], e.c(var1[145], var1[146])));
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    private static void Q() {
        if (h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[5])) {
            bq.putAll(Map.of(var1[25], e.c(var1[26], var1[27])));
            bv.putAll(Map.of(var1[29], e.c(var1[30], var1[31]), var1[32], e.c(var1[30], var1[31])));
            bu.putAll(Map.of(var1[33], e.c(var1[34], var1[35])));
            bw.putAll(Map.of(var1[36], e.c(var1[37], var1[38]), var1[39], e.c(var1[37], var1[38]), var1[40], e.c(var1[37], var1[38])));
            bx.putAll(Map.of(var1[41], e.c(var1[42], var1[43]), var1[44], e.c(var1[42], var1[43]), var1[45], e.c(var1[42], var1[43])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[5]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[46])) {
            bq.putAll(Map.of(var1[47], e.c(var1[26], var1[27])));
            bv.putAll(Map.of(var1[48], e.c(var1[26], var1[27]), var1[32], e.c(var1[30], var1[31])));
            bu.putAll(Map.of(var1[49], e.c(var1[34], var1[35])));
            bw.putAll(Map.of(var1[50], e.c(var1[37], var1[38]), var1[39], e.c(var1[37], var1[38])));
            bx.putAll(Map.of(var1[41], e.c(var1[42], var1[43]), var1[51], e.c(var1[42], var1[43])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[46]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[52])) {
            bq.putAll(Map.of(var1[53], e.c(var1[26], var1[27]), var1[47], e.c(var1[26], var1[27]), var1[54], e.c(var1[55], var1[56])));
            bv.putAll(Map.of(var1[57], e.c(var1[26], var1[27]), var1[48], e.c(var1[26], var1[27]), var1[127], e.c(var1[55], var1[56])));
            bu.putAll(Map.of(var1[58], e.c(var1[34], var1[35])));
            bw.putAll(Map.of(var1[50], e.c(var1[37], var1[38]), var1[59], e.c(var1[37], var1[38]), var1[60], e.c(var1[61], var1[62])));
            bx.putAll(Map.of(var1[63], e.c(var1[42], var1[43]), var1[51], e.c(var1[42], var1[43]), var1[64], e.c(var1[42], var1[43])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[52]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[65])) {
            bq.putAll(Map.of(var1[66], e.c(var1[26], var1[27]), var1[67], e.c(var1[55], var1[68])));
            bv.putAll(Map.of(var1[69], e.c(var1[26], var1[27]), var1[70], e.c(var1[55], var1[68]), var1[57], e.c(var1[26], var1[27])));
            bu.putAll(Map.of(var1[71], e.c(var1[34], var1[35])));
            bw.putAll(Map.of(var1[72], e.c(var1[37], var1[38]), var1[59], e.c(var1[37], var1[38]), var1[73], e.c(var1[74], var1[75]), var1[76], e.c(var1[74], var1[75])));
            bx.putAll(Map.of(var1[63], e.c(var1[42], var1[43]), var1[77], e.c(var1[42], var1[43]), var1[78], e.c(var1[42], var1[43])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[65]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[79])) {
            bq.putAll(Map.of(var1[66], e.c(var1[26], var1[27]), var1[80], e.c(var1[55], var1[68]), var1[128], e.c(var1[82], var1[83])));
            bv.putAll(Map.of(var1[69], e.c(var1[26], var1[27]), var1[84], e.c(var1[55], var1[68]), var1[85], e.c(var1[82], var1[83])));
            bu.putAll(Map.of(var1[89], e.c(var1[90], var1[91])));
            bw.putAll(Map.of(var1[72], e.c(var1[37], var1[38]), var1[92], e.c(var1[74], var1[75]), var1[73], e.c(var1[74], var1[75]), var1[76], e.c(var1[74], var1[75])));
            bx.putAll(Map.of(var1[93], e.c(var1[42], var1[43]), var1[77], e.c(var1[42], var1[43]), var1[96], e.c(var1[94], var1[95])));
        }
        br.putAll(Map.of(var1[129], e.c(var1[98], var1[42]), var1[97], e.c(var1[98], var1[42]), var1[99], e.c(var1[98], var1[42]), var1[100], e.c(var1[101], var1[102]), var1[103], e.c(var1[98], var1[42])));
        bs.putAll(Map.of(var1[104], e.c(var1[105], var1[106]), var1[107], e.c(var1[105], var1[106]), var1[108], e.c(var1[105], var1[106]), var1[109], e.c(var1[105], var1[106]), var1[110], e.c(var1[105], var1[106])));
        bt.putAll(Map.of(var1[130], e.c(var1[131], var1[132]), var1[133], e.c(var1[131], var1[132]), var1[134], e.c(var1[131], var1[132]), var1[135], e.c(var1[131], var1[132])));
        by.putAll(Map.of(var1[136], e.c(var1[137], var1[68])));
        bz.putAll(Map.of(var1[119], e.c(var1[115], var1[116]), var1[138], e.c(var1[115], var1[116]), var1[139], e.c(var1[115], var1[116]), var1[140], e.c(var1[115], var1[116]), var1[141], e.c(var1[115], var1[116])));
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[5]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[46])) {
            bz.putAll(Map.of(var1[142], e.c(var1[115], var1[116])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[46]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[52])) {
            bz.putAll(Map.of(var1[143], e.c(var1[115], var1[116])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[65]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[79])) {
            bz.putAll(Map.of(var1[144], e.c(var1[115], var1[116])));
        }
        bA.putAll(Map.of(var1[16], e.c(var1[145], var1[146])));
    }

    private static void P() {
        if (h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[5])) {
            bq.putAll(Map.of(var1[25], e.c(var1[26], var1[27]), var1[28], e.c(var1[26], var1[27])));
            bv.putAll(Map.of(var1[29], e.c(var1[30], var1[31]), var1[32], e.c(var1[30], var1[31])));
            bu.putAll(Map.of(var1[33], e.c(var1[34], var1[35])));
            bw.putAll(Map.of(var1[36], e.c(var1[37], var1[38]), var1[39], e.c(var1[37], var1[38]), var1[40], e.c(var1[37], var1[38])));
            bx.putAll(Map.of(var1[41], e.c(var1[42], var1[43]), var1[44], e.c(var1[42], var1[43]), var1[45], e.c(var1[42], var1[43])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[5]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[46])) {
            bq.putAll(Map.of(var1[47], e.c(var1[26], var1[27])));
            bv.putAll(Map.of(var1[48], e.c(var1[26], var1[27]), var1[32], e.c(var1[30], var1[31])));
            bu.putAll(Map.of(var1[49], e.c(var1[34], var1[35])));
            bw.putAll(Map.of(var1[50], e.c(var1[37], var1[38]), var1[39], e.c(var1[37], var1[38])));
            bx.putAll(Map.of(var1[41], e.c(var1[42], var1[43]), var1[51], e.c(var1[42], var1[43])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[46]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[52])) {
            bq.putAll(Map.of(var1[53], e.c(var1[26], var1[27]), var1[47], e.c(var1[26], var1[27]), var1[54], e.c(var1[55], var1[56])));
            bv.putAll(Map.of(var1[57], e.c(var1[26], var1[27]), var1[48], e.c(var1[26], var1[27])));
            bu.putAll(Map.of(var1[58], e.c(var1[34], var1[35])));
            bw.putAll(Map.of(var1[50], e.c(var1[37], var1[38]), var1[59], e.c(var1[37], var1[38]), var1[60], e.c(var1[61], var1[62])));
            bx.putAll(Map.of(var1[63], e.c(var1[42], var1[43]), var1[51], e.c(var1[42], var1[43]), var1[64], e.c(var1[42], var1[43])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[52]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[65])) {
            bq.putAll(Map.of(var1[66], e.c(var1[26], var1[27]), var1[67], e.c(var1[55], var1[68])));
            bv.putAll(Map.of(var1[69], e.c(var1[26], var1[27]), var1[70], e.c(var1[55], var1[68]), var1[57], e.c(var1[26], var1[27])));
            bu.putAll(Map.of(var1[71], e.c(var1[34], var1[35])));
            bw.putAll(Map.of(var1[72], e.c(var1[37], var1[38]), var1[59], e.c(var1[37], var1[38]), var1[73], e.c(var1[74], var1[75]), var1[76], e.c(var1[74], var1[75])));
            bx.putAll(Map.of(var1[63], e.c(var1[42], var1[43]), var1[77], e.c(var1[42], var1[43]), var1[78], e.c(var1[42], var1[43])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.DEFENCE), var1[65]) && h.var9(Skills.getLevel((SkiSkill.DEFENCE), var1[79])) {
            bq.putAll(Map.of(var1[66], e.c(var1[26], var1[27]), var1[80], e.c(var1[55], var1[68]), var1[81], e.c(var1[82], var1[83])));
            bv.putAll(Map.of(var1[69], e.c(var1[26], var1[27]), var1[84], e.c(var1[55], var1[68]), var1[85], e.c(var1[82], var1[83]), var1[86], e.c(var1[82], var1[83]), var1[87], e.c(var1[82], var1[83]), var1[88], e.c(var1[82], var1[83])));
            bu.putAll(Map.of(var1[89], e.c(var1[90], var1[91])));
            bw.putAll(Map.of(var1[72], e.c(var1[37], var1[38]), var1[92], e.c(var1[74], var1[75]), var1[73], e.c(var1[74], var1[75])));
            bx.putAll(Map.of(var1[93], e.c(var1[94], var1[95]), var1[96], e.c(var1[94], var1[95])));
        }
        br.putAll(Map.of(var1[97], e.c(var1[98], var1[42]), var1[99], e.c(var1[98], var1[42]), var1[100], e.c(var1[101], var1[102]), var1[103], e.c(var1[98], var1[42])));
        bs.putAll(Map.of(var1[104], e.c(var1[105], var1[106]), var1[107], e.c(var1[105], var1[106]), var1[108], e.c(var1[105], var1[106]), var1[109], e.c(var1[105], var1[106]), var1[110], e.c(var1[105], var1[106])));
        bt.putAll(Map.of(var1[111], e.c(var1[112], var1[113])));
        by.putAll(Map.of(var1[114], e.c(var1[115], var1[116]), var1[117], e.c(var1[115], var1[116]), var1[118], e.c(var1[115], var1[116])));
        bz.putAll(Map.of(var1[119], e.c(var1[115], var1[116]), var1[120], e.c(var1[115], var1[116]), var1[121], e.c(var1[115], var1[116]), var1[122], e.c(var1[115], var1[116])));
        bA.putAll(Map.of(var1[123], e.c(var1[115], var1[116]), var1[124], e.c(var1[115], var1[116]), var1[125], e.c(var1[115], var1[116]), var1[126], e.c(var1[115], var1[116])));
    }

    static {
        h.var4();
        h.var5();
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

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

    private static void R() {
        if (h.var9(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            bq.putAll(Map.of(var1[148], e.c(var1[149], var1[150])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            bq.putAll(Map.of(var1[151], e.c(var1[152], var1[153])));
        }
        bu.putAll(Map.of(var1[154], e.c(var1[155], var1[156])));
        if (h.var9(Skills.getLevel((SkiSkill.RANGED), var1[79])) {
            bw.putAll(Map.of(var1[157], e.c(var1[131], var1[132])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.RANGED), var1[79]) && h.var9(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            bw.putAll(Map.of(var1[158], e.c(var1[131], var1[132])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            bw.putAll(Map.of(var1[159], e.c(var1[160], var1[161])));
        }
        if (h.var9(Skills.getLevel((SkiSkill.RANGED), var1[79])) {
            bx.putAll(Map.of(var1[162], e.c(var1[131], var1[132])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.RANGED), var1[79]) && h.var9(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            bx.putAll(Map.of(var1[163], e.c(var1[131], var1[132])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            bx.putAll(Map.of(var1[164], e.c(var1[165], var1[166])));
        }
        br.putAll(Map.of(var1[129], e.c(var1[167], var1[168])));
        bs.putAll(Map.of(var1[169], e.c(var1[170], var1[171])));
        if (h.var9(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            by.putAll(Map.of(var1[136], e.c(var1[137], var1[68])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            by.putAll(Map.of(var1[172], e.c(var1[173], var1[174])));
        }
        if (h.var9(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            bz.putAll(Map.of(var1[175], e.c(var1[176], var1[177])));
        }
        if (h.var6(Skills.getLevel((SkiSkill.RANGED), var1[147])) {
            bz.putAll(Map.of(var1[178], e.c(var1[179], var1[180])));
        }
        bA.putAll(Map.of(var1[16], e.c(var1[145], var1[146])));
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }
}

