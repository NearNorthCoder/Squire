/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-;

import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.f;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.g;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.h;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.j;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.m;
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.plugins.logout.Clues;

public class e {
    private static /* synthetic */ int[] ll;
    public static /* synthetic */ boolean G;
    private static /* synthetic */ String[] l;
    public static /* synthetic */ List<j> H;

    private static void lIlII() {
        ll = new int[231];
        e.ll[0] = (0xC0 ^ 0x89) & ~(0xED ^ 0xA4);
        e.ll[1] = 1;
        e.ll[2] = 0xA2 ^ 0xBC ^ (0x7F ^ 0x71);
        e.ll[3] = 2;
        e.ll[4] = 3;
        e.ll[5] = 66 + 62 - 126 + 180 ^ 167 + 72 - 216 + 155;
        e.ll[6] = 0x30 ^ 0x35;
        e.ll[7] = 65 + 57 - 43 + 60 ^ 1 + 71 - -68 + 1;
        e.ll[8] = 0xA9 ^ 0xAE;
        e.ll[9] = 0xA3 ^ 0x96 ^ (0xA4 ^ 0x99);
        e.ll[10] = 0x16 ^ 0x1F;
        e.ll[11] = 0xA2 ^ 0xC6 ^ (0x49 ^ 0x27);
        e.ll[12] = 0x63 ^ 0x68;
        e.ll[13] = 0x15 ^ 0x19;
        e.ll[14] = 8 ^ 0x3C ^ (0x8E ^ 0xB7);
        e.ll[15] = 0x62 ^ 0xA ^ (0xE6 ^ 0x80);
        e.ll[16] = 0xF8 ^ 0xA9 ^ (0x31 ^ 0x6F);
        e.ll[17] = 0xFFFFAE6F & 0x5DDD;
        e.ll[18] = -(0xFFFF9B7D & 0x7C8E) & (0xFFFFFFFF & 0x3DBF);
        e.ll[19] = -(0xFFFFFD71 & 0x6EEF) & (0xFFFFFFFA & 0x7FED);
        e.ll[20] = 0xFFFF9FC7 & 0x7F7F;
        e.ll[21] = -(0xFFFFFB9C & 0x24FB) & (0xFFFFBFFF & 0x7FDF);
        e.ll[22] = 0xFFFFAA6E & 0x57BB;
        e.ll[23] = 0xFFFFFFE9 & 0x3FE;
        e.ll[24] = 0xFFFF9BBF & 0x6673;
        e.ll[25] = 0xE7 ^ 0x83;
        e.ll[26] = 0xFFFFC76F & 0x3ABC;
        e.ll[27] = -(0xFFFFDDDB & 0x3FF7) & (0xFFFFBFFF & 0x5FFF);
        e.ll[28] = 0x1D ^ 0x2F;
        e.ll[29] = 63 + 113 - 155 + 122 ^ 151 + 66 - 135 + 76;
        e.ll[30] = 0x8C ^ 0x9E;
        e.ll[31] = 0x3B ^ 0x28;
        e.ll[32] = 59 + 74 - 48 + 124 ^ 122 + 129 - 199 + 145;
        e.ll[33] = 0xFFFFDBFD & 0x2DFA;
        e.ll[34] = -(0xFFFFEADF & 0x3526) & (0xFFFFAFFF & 0x79FF);
        e.ll[35] = 0xFFFFABFF & 0x5DFC;
        e.ll[36] = 0xFFFFBBFF & 0x4DFE;
        e.ll[37] = -(0xC6 ^ 0x8F) & (0xFFFF9BD9 & 0x6E6E);
        e.ll[38] = 0xFFFFAE3A & 0x5BC7;
        e.ll[39] = 0x19 ^ 0xC;
        e.ll[40] = 5 ^ 0x13;
        e.ll[41] = 0xFFFFDFEE & 0x3F5B;
        e.ll[42] = -(90 + 50 - 21 + 16) & (0xFFFFDFCF & 0x3FFF);
        e.ll[43] = 0xFFFF9F7B & 0x7FCF;
        e.ll[44] = 0xFFFFB3E3 & 0x4FFF;
        e.ll[45] = -(0xFFFFFBEF & 0x1CF7) & (0xFFFFBFFF & 0x7FF6);
        e.ll[46] = 0xFFFFDFFE & 0x23B9;
        e.ll[47] = -(0xFFFFBFE3 & 0x7D1D) & (0xFFFFFFBB & 0x3F6F);
        e.ll[48] = -(0xFFFF96DE & 0x7923) & (0xFFFFF7FF & 0x3FDF);
        e.ll[49] = 0xFFFFD7C7 & 0x2AB8;
        e.ll[50] = 0xFFFFF5DD & 0x1AEE;
        e.ll[51] = 0xFFFF97F7 & 0x7D9D;
        e.ll[52] = 0x3F ^ 0x28;
        e.ll[53] = 0xBD ^ 0xA6 ^ 3;
        e.ll[54] = -(0xFFFFD4B6 & 0x7B4B) & (0xFFFFFFD7 & 0x77FF);
        e.ll[55] = 0xFFFFBAFF & 0x478E;
        e.ll[56] = 0xFFFFE7FB & 0x1B4F;
        e.ll[57] = 0xBB ^ 0x85 ^ (0x96 ^ 0xB1);
        e.ll[58] = 110 + 37 - 144 + 138 ^ 136 + 17 - 26 + 24;
        e.ll[59] = -(0xFFFF9A4B & 0x75BD) & (0xFFFFFFEE & 0x37DF);
        e.ll[60] = -(0xFFFFE8DF & 0x772F) & (0xFFFFF57F & 0x6EFF);
        e.ll[61] = -(0xFFFFEDFF & 0x5381) & (0xFFFFF7FF & 0x4FE7);
        e.ll[62] = -(0xFFFFCA23 & 0x75DF) & (0xFFFFCFEF & 0x73FF);
        e.ll[63] = 2 + 130 - 125 + 125 ^ 136 + 64 - 44 + 3;
        e.ll[64] = 0x29 ^ 0x35;
        e.ll[65] = 0xFFFFE7F0 & 0x3FEF;
        e.ll[66] = -(0xFFFFF36F & 0x6EBB) & (0xFFFFF7AF & 0x6EFF);
        e.ll[67] = -(0xFFFFD2E3 & 0x7D3D) & (0xFFFFFE7F & 0x55FF);
        e.ll[68] = -(0xFFFFBBDF & 0x5DE3) & (0xFFFF9FFF & 0x7DFB);
        e.ll[69] = 0xDD ^ 0xC0;
        e.ll[70] = 0xBD ^ 0xA3;
        e.ll[71] = -(0xFFFFDE7E & 0x3983) & (0xFFFFFFCF & 0x3FFF);
        e.ll[72] = 0xFFFF93FF & 0x6FFB;
        e.ll[73] = -(0xFFFFFEB9 & 0x2B7F) & (0xFFFFFFFF & 0x2E7F);
        e.ll[74] = 0xFFFF8DD4 & 0x77BB;
        e.ll[75] = 0x71 ^ 0x4A ^ (0x26 ^ 2);
        e.ll[76] = 0xAF ^ 0x8F;
        e.ll[77] = 0xFFFFE7DE & 0x3FE5;
        e.ll[78] = 0xFFFFDFF7 & 0x24BD;
        e.ll[79] = -(0xFFFFF775 & 0x698F) & (0xFFFFEFFF & 0x7767);
        e.ll[80] = -(0xFFFFFF0F & 0x1BF7) & (0xFFFFDF8F & 0x3FF7);
        e.ll[81] = 0x52 ^ 0x11 ^ (0xD0 ^ 0xB2);
        e.ll[82] = 0x5C ^ 0x7E;
        e.ll[83] = 0xFFFFFF8D & 0x2FF6;
        e.ll[84] = -(0xFFFFB2EF & 0x5F13) & (0xFFFFBFFF & 0x56FB);
        e.ll[85] = 0xFFFFAC77 & 0x57ED;
        e.ll[86] = -(0xFFFFDBCB & 0x777D) & (0xFFFFDFFF & 0x77EF);
        e.ll[87] = 96 + 114 - 149 + 83 ^ 47 + 80 - 51 + 103;
        e.ll[88] = 0x16 ^ 0x32;
        e.ll[89] = -(0xFFFFD96F & 0x3E93) & (0xFFFFFFFB & 0x3FFE);
        e.ll[90] = -(0xFFFFFBE3 & 0x73D) & (0xFFFFC7EF & 0x3F7D);
        e.ll[91] = -(0xFFFFFFFF & 0x5B01) & (0xFFFFFFB1 & 0x5FDF);
        e.ll[92] = 0xA4 ^ 0x81;
        e.ll[93] = 0x47 ^ 0x61;
        e.ll[94] = 0xFFFFAFFF & 0x77E8;
        e.ll[95] = 0xFFFFF47F & 0xFED;
        e.ll[96] = 0xFFFFF733 & 0xCFF;
        e.ll[97] = -(0xFFFFEB91 & 0x5CFF) & (0xFFFFEFFB & 0x5DF7);
        e.ll[98] = 0xBC ^ 0x9B;
        e.ll[99] = 0x2E ^ 0x5B ^ (0x5A ^ 7);
        e.ll[100] = -(0xFFFFD1C7 & 0x3E3B) & (0xFFFFDFFF & 0x7D7B);
        e.ll[101] = 0xFFFFB59F & 0x5FF7;
        e.ll[102] = 0xFFFFFFF7 & 0x56F;
        e.ll[103] = 0x84 ^ 0xAD;
        e.ll[104] = 0x34 ^ 0x1E;
        e.ll[105] = 0xFFFFF7CF & 0x2FFC;
        e.ll[106] = -(0xFFFFFCFF & 0x7B55) & (0xFFFFFDFF & 0x7E7F);
        e.ll[107] = -(0xFFFFEC37 & 0x5FD9) & (0xFFFFDFDD & 0x6F7F);
        e.ll[108] = 0xFFFFC6A2 & 0x3FFD;
        e.ll[109] = 0x55 ^ 0x7E;
        e.ll[110] = 0x29 ^ 0x4C ^ (0xE3 ^ 0xAA);
        e.ll[111] = 0xFFFFE7FE & 0x3FE7;
        e.ll[112] = -(0xFFFFC5F7 & 0x7A5F) & (0xFFFFF77F & 0x4FFF);
        e.ll[113] = 0xFFFFD3BC & 0x2ECB;
        e.ll[114] = 0xFFFFC74F & 0x3DF9;
        e.ll[115] = 0xEB ^ 0xB9 ^ 97 + 101 - 112 + 41;
        e.ll[116] = 0x1F ^ 0x31;
        e.ll[117] = 0xFFFFB7F7 & 0x6FFA;
        e.ll[118] = 0xFFFFAE9F & 0x55EF;
        e.ll[119] = -(0xFFFFF57B & 0x5FA7) & (0xFFFFD76F & 0x7FF3);
        e.ll[120] = -(0xFFFFB8C5 & 0x4FBF) & (0xFFFFFFEF & 0xDBF);
        e.ll[121] = 1 ^ (0x94 ^ 0xBA);
        e.ll[122] = 0x42 ^ 0x17 ^ (0x5F ^ 0x3A);
        e.ll[123] = -(0xFFFFF6FF & 0x1928) & (0xFFFFF7EF & 0x3FFF);
        e.ll[124] = -(0xFFFF9F6B & 0x6BB7) & (0xFFFFFF7B & 0xFEF);
        e.ll[125] = 0xFFFF9D6F & 0x679F;
        e.ll[126] = 0x14 ^ 0x10 ^ (0x57 ^ 0x62);
        e.ll[127] = -(0xFFFFDA7E & 0x35E7) & (0xFFFFFFF7 & 0x3FEF);
        e.ll[128] = 0xFFFFB7DB & 0x4D75;
        e.ll[129] = -(0xFFFFBB99 & 0x4C67) & (0xFFFFCFEF & 0x3E79);
        e.ll[130] = 0x67 ^ 0x26 ^ (0x7F ^ 0xD);
        e.ll[131] = 0xAA ^ 0x9E;
        e.ll[132] = -3 & (0xFFFFEFEE & 0x37FF);
        e.ll[133] = -(0xFFFFE35F & 0x5DA2) & (0xFFFFE7FF & 0x5F9F);
        e.ll[134] = 0xFFFFA7DF & 0x5C6F;
        e.ll[135] = 75 + 21 - -23 + 67 ^ 127 + 122 - 117 + 11;
        e.ll[136] = 5 ^ 0x33;
        e.ll[137] = 0xFFFFFFEF & 0x27FA;
        e.ll[138] = -(0xFFFF9CCE & 0x7F7F) & (0xFFFF9FFF & 0x7EDF);
        e.ll[139] = -(0xFFFFE9FD & 0x5F43) & (0xFFFFDFD6 & 0x6BEB);
        e.ll[140] = 141 + 17 - 78 + 90 ^ 95 + 150 - 116 + 28;
        e.ll[141] = 0xBD ^ 0x85;
        e.ll[142] = -(0xFFFF9884 & 0x7F7F) & (0xFFFFBFDF & 0x7FF7);
        e.ll[143] = 0xFFFFD6DF & 0x2D7B;
        e.ll[144] = 0xFFFFACEB & 0x5797;
        e.ll[145] = 0xB7 ^ 0x8E;
        e.ll[146] = 198 + 99 - 190 + 148 ^ 166 + 54 - 160 + 137;
        e.ll[147] = 0xFFFFB7EF & 0x6FFE;
        e.ll[148] = 0xFFFFBE67 & 0x45BB;
        e.ll[149] = 0x69 ^ 0x52;
        e.ll[150] = 0x3E ^ 2;
        e.ll[151] = 0xFFFFFFFA & 0x27E7;
        e.ll[152] = 0xFFFFEB4B & 0x16F7;
        e.ll[153] = -(0xFFFFBE7B & 0x53E5) & (0xFFFFB7FF & 0x5F7B);
        e.ll[154] = -(0xFFFFBF31 & 0x6FCF) & (0xFFFFBFD7 & 0x7FFE);
        e.ll[155] = 0x25 ^ 0x18;
        e.ll[156] = 0x72 ^ 0x4C;
        e.ll[157] = 0xFFFFB7FE & 0x6FDD;
        e.ll[158] = 0xFFFF8B7F & 0x76FE;
        e.ll[159] = -(0xFFFFBF4D & 0x70FB) & (0xFFFFB57F & Short.MAX_VALUE);
        e.ll[160] = 111 + 121 - 122 + 17 ^ (0x53 ^ 0x13);
        e.ll[161] = 0x38 ^ 0x78;
        e.ll[162] = -(0xA1 ^ 0x80) & (0xFFFFB7FA & 0x6FFD);
        e.ll[163] = 0xFFFF8FE5 & 0x767F;
        e.ll[164] = -(0xFFFFCFF3 & 0x70AD) & (0xFFFFCFF7 & 0x73EF);
        e.ll[165] = 0x25 ^ 0x64;
        e.ll[166] = 5 ^ 0x47;
        e.ll[167] = 0xFFFFB7FF & 0x6FF6;
        e.ll[168] = 0xFFFF947F & 0x6FEB;
        e.ll[169] = -(0xFFFFF87D & 0x7FB3) & (0xFFFFFD7F & 0x7FF7);
        e.ll[170] = 0x70 ^ 0x33;
        e.ll[171] = 246 + 155 - 294 + 140 ^ 86 + 25 - -62 + 6;
        e.ll[172] = -(0xFFFF9B3C & 0x74CF) & (0xFFFFB7FF & Short.MAX_VALUE);
        e.ll[173] = 0xFFFFBFF4 & 0x427F;
        e.ll[174] = 0xDA ^ 0x9F;
        e.ll[175] = 0x43 ^ 5;
        e.ll[176] = -(0xFFFFEBDF & 0x5C2D) & (0xFFFFFFFF & 0x6FDE);
        e.ll[177] = -(0xFFFFBAEF & 0x5D59) & (0xFFFFDDFF & 0x3E6D);
        e.ll[178] = 0xF2 ^ 0x83 ^ (0xB3 ^ 0x85);
        e.ll[179] = 149 + 163 - 139 + 36 ^ 56 + 127 - 53 + 23;
        e.ll[180] = 0xFFFFEFD8 & 0x37F7;
        e.ll[181] = 0xFFFFBDBB & 0x467F;
        e.ll[182] = -(0xFFFFFDDF & 0x3A26) & (0xFFFFFF7F & 0x3EFD);
        e.ll[183] = 0x2E ^ 0x67;
        e.ll[184] = 0x34 ^ 0x29 ^ (0x4A ^ 0x1D);
        e.ll[185] = -(0xFFFFD6E7 & 0x791D) & (0xFFFFFFDF & 0x77FE);
        e.ll[186] = -(0xFFFFFB8B & 0x75FE) & (0xFFFFFFFF & 0x77FF);
        e.ll[187] = 0xFFFF8ED7 & 0x75FD;
        e.ll[188] = 0x68 ^ 0x7B ^ (0xFC ^ 0xA4);
        e.ll[189] = 0x7D ^ 0x31;
        e.ll[190] = 0xFFFFCD77 & Short.MAX_VALUE;
        e.ll[191] = -(0xFFFFFD4F & 0x76BB) & (0xFFFFF7FF & Short.MAX_VALUE);
        e.ll[192] = 0xFFFFDBFE & 0x267D;
        e.ll[193] = -(0xFFFFEEAD & 0x7373) & (0xFFFFFFFD & 0x77BF);
        e.ll[194] = 35 + 90 - -34 + 82 ^ 2 + 109 - 67 + 144;
        e.ll[195] = 0x77 ^ 0x33 ^ (0x93 ^ 0x99);
        e.ll[196] = -(0xFFFFFBFF & 0x1C35) & (0xFFFFFFFE & 0x3FFF);
        e.ll[197] = 0xFFFFA7FD & 0x5CF7;
        e.ll[198] = -(0xFFFFFFB1 & 0x63CF) & (0xFFFFEFF7 & 0x77FD);
        e.ll[199] = 175 + 213 - 349 + 181 ^ 53 + 38 - 39 + 95;
        e.ll[200] = 0xF3 ^ 0xA6 ^ (0x14 ^ 0x11);
        e.ll[201] = 0xFFFFF3DC & 0x6FBF;
        e.ll[202] = -(141 + 45 - 129 + 90) & (0xFFFFFBFF & 0x6FFE);
        e.ll[203] = 0xFFFFB5FF & 0x5F7C;
        e.ll[204] = -(0xFFFFEB87 & 0x367A) & (0xFFFFBF5F & 0x7FED);
        e.ll[205] = 0xFFFFFEFE & 0x2FCD;
        e.ll[206] = -(0x29 ^ 0x21) & (0xFFFFEBFF & 0x75AF);
        e.ll[207] = -(0xFFFFE51E & 0x3FFB) & (0xFFFFB7BF & 0x6F7F);
        e.ll[208] = 0xFFFF87EE & 0x7A9B;
        e.ll[209] = 0xFFFF8BC6 & 0x77BD;
        e.ll[210] = 0xFFFFADFF & 0x57AA;
        e.ll[211] = -(0xFFFFE86B & 0x77B7) & (0xFFFFFFBF & 0x6F6F);
        e.ll[212] = -(0xFFFFEDCF & 0x7A33) & (0xFFFFFBFE & 0x6FFF);
        e.ll[213] = 0xFFFFE91A & 0x1FF5;
        e.ll[214] = 0xFFFFE9FF & 0x1FF6;
        e.ll[215] = -(0xFFFFF7A9 & 0x4C77) & (0xFFFFFD77 & 0x77F9);
        e.ll[216] = 0xFFFFB1FB & 0x7F57;
        e.ll[217] = -(0xFFFFF77B & 0x4E85) & (0xFFFFFF55 & 0x77FF);
        e.ll[218] = 0xFFFFF97F & 0x37D7;
        e.ll[219] = 0xFFFFBFAF & 0x78F4;
        e.ll[220] = 0xCD ^ 0x9C;
        e.ll[221] = 0x23 ^ 0x71;
        e.ll[222] = 0x33 ^ 0x60;
        e.ll[223] = 0x2D ^ 0x79;
        e.ll[224] = 0xCE ^ 0x9B;
        e.ll[225] = 44 + 56 - -5 + 43 ^ 55 + 2 - -85 + 52;
        e.ll[226] = 21 + 109 - 67 + 189 ^ 69 + 162 - 187 + 127;
        e.ll[227] = 154 + 125 - 125 + 87 ^ 96 + 5 - 28 + 96;
        e.ll[228] = 0x80 ^ 0x9B ^ (0x3A ^ 0x78);
        e.ll[229] = 26 + 9 - -96 + 91 ^ 130 + 103 - 160 + 59;
        e.ll[230] = 0xF7 ^ 0xAC;
    }

    public static void w() {
        if (e.llIIl(G ? 1 : 0) && e.llIlI(Clues.e ? 1 : 0)) {
            Clues.c = l[ll[0]];
            h.a(H);
            if (e.llIll(H.size(), ll[1])) {
                System.out.println(l[ll[1]]);
                G = ll[0];
                return;
            }
        }
        if (e.llIlI(G ? 1 : 0)) {
            BankLocation[] bankLocationArray = new BankLocation[ll[2]];
            bankLocationArray[e.ll[0]] = BankLocation.VARROCK_WEST_BANK;
            bankLocationArray[e.ll[1]] = BankLocation.AL_KHARID_BANK;
            bankLocationArray[e.ll[3]] = BankLocation.CANIFIS_BANK;
            bankLocationArray[e.ll[4]] = BankLocation.VARROCK_EAST_BANK;
            bankLocationArray[e.ll[5]] = BankLocation.GRAND_EXCHANGE_BANK;
            bankLocationArray[e.ll[6]] = BankLocation.FALADOR_EAST_BANK;
            bankLocationArray[e.ll[7]] = BankLocation.FALADOR_WEST_BANK;
            bankLocationArray[e.ll[8]] = BankLocation.LUMBRIDGE_BANK;
            bankLocationArray[e.ll[9]] = BankLocation.ARDOUGNE_NORTH_BANK;
            bankLocationArray[e.ll[10]] = BankLocation.ARDOUGNE_SOUTH_BANK;
            bankLocationArray[e.ll[11]] = BankLocation.CASTLE_WARS_BANK;
            bankLocationArray[e.ll[12]] = BankLocation.CATHERBY_BANK;
            bankLocationArray[e.ll[13]] = BankLocation.DRAYNOR_BANK;
            bankLocationArray[e.ll[14]] = BankLocation.EDGEVILLE_BANK;
            bankLocationArray[e.ll[15]] = BankLocation.FEROX_ENCLAVE_BANK;
            bankLocationArray[e.ll[16]] = BankLocation.HOSIDIUS_BANK;
            BankLocation llllllIlllIIlIl = BankLocation.getNearestFrom((BankLocation[])bankLocationArray);
            if (e.llIIl(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIlI(e.A() ? 1 : 0)) {
                WorldPoint llllllIlllIIlII = new WorldPoint(ll[17], ll[18], ll[0]);
                if (e.lllII(Players.getLocal().getWorldLocation().distanceTo(llllllIlllIIlII), ll[5])) {
                    Clues.c = l[ll[3]];
                    Movement.walkTo((WorldPoint)llllllIlllIIlII);
                    0;
                    Time.sleepTicks((int)ll[1]);
                    0;
                }
                if (e.lllIl(Players.getLocal().getWorldLocation().distanceTo(llllllIlllIIlII), ll[5])) {
                    Clues.c = l[ll[4]];
                    String[] stringArray = new String[ll[1]];
                    stringArray[e.ll[0]] = l[ll[5]];
                    TileObjects.getNearest((String[])stringArray).interact(l[ll[6]]);
                    Time.sleepTicks((int)ll[5]);
                    0;
                }
            }
            if ((e.llIIl(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !e.llIlI(e.A() ? 1 : 0) || e.llIlI(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && e.llllI(llllllIlllIIlIl) && e.llIlI(llllllIlllIIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Clues.c = l[ll[7]];
                g.a(llllllIlllIIlIl);
            }
            if (e.llllI(llllllIlllIIlIl) && e.llIIl(llllllIlllIIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (e.llIlI(Bank.isOpen() ? 1 : 0)) {
                    g.G();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)ll[19]);
                    0;
                }
                if (e.llIIl(Bank.isOpen() ? 1 : 0)) {
                    Clues.c = l[ll[8]];
                    if (e.lllll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)ll[5]);
                        0;
                    }
                    if (e.lllll(Equipment.getAll().size())) {
                        // empty if block
                    }
                    if (e.llIlI(e.z() ? 1 : 0)) {
                        if (e.llIIl(Clues.e ? 1 : 0)) {
                            System.out.println(l[ll[9]]);
                            Clues.d = ll[1];
                            return;
                        }
                        e.B();
                        System.out.println(l[ll[10]]);
                        G = ll[1];
                        return;
                    }
                    if (e.llIIl(e.z() ? 1 : 0)) {
                        Clues.g = ll[0];
                        Clues.j = ll[0];
                        if (e.llIIl(Clues.h ? 1 : 0)) {
                            g.b(m.bM, ll[3]);
                        }
                        if (e.llIlI(Clues.e ? 1 : 0)) {
                            g.a(ll[20], ll[11]);
                            g.a(ll[21], ll[11]);
                        }
                        if (e.llIIl(Clues.e ? 1 : 0)) {
                            g.a(ll[22], ll[23]);
                            g.a(ll[24], ll[25]);
                            g.a(ll[26], ll[23]);
                            g.a(ll[27], ll[23]);
                        }
                        if (e.llIll(Skills.getLevel((Skill)Skill.THIEVING), ll[28])) {
                            g.a(Clues.k, ll[9]);
                        }
                        if (e.lIIIII(Skills.getLevel((Skill)Skill.THIEVING), ll[28])) {
                            g.a(Clues.k, ll[5]);
                        }
                        Bank.withdraw(item -> {
                            int n2;
                            if (e.llIIl(item.getName().contains(l[ll[228]]) ? 1 : 0) && e.llIIl(item.getName().contains(l[ll[229]]) ? 1 : 0)) {
                                n2 = ll[1];
                                0;
                                
                                }
                            } else {
                                n2 = ll[0];
                            }
                            return n2 != 0;
                        }, (int)ll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)k.c(ll[4], ll[6]));
                        0;
                    }
                }
            }
        }
    }

    private static void lll() {
        l = new String[ll[230]];
        e.l[e.ll[0]] = e."Buying items";
        e.l[e.ll[1]] = e."Finished buying, switching back to clues";
        e.l[e.ll[3]] = e."Nav to ladder out of ham";
        e.l[e.ll[4]] = e."Exiting ham hide out";
        e.l[e.ll[5]] = e."Ladder";
        e.l[e.ll[6]] = e."Climb-up";
        e.l[e.ll[7]] = e."Nav to bank";
        e.l[e.ll[8]] = e."Handling banking";
        e.l[e.ll[9]] = e."Missing runes, either law, water, air, earth, food id, or printed ID";
        e.l[e.ll[10]] = e."We are missing quest supplies, switching to BUYING";
        e.l[e.ll[11]] = e."Buying items";
        e.l[e.ll[12]] = e."Finished buying, switching back to clues";
        e.l[e.ll[13]] = e."Nav to ladder out of ham";
        e.l[e.ll[14]] = e."Exiting ham hide out";
        e.l[e.ll[15]] = e."Ladder";
        e.l[e.ll[16]] = e."Climb-up";
        e.l[e.ll[2]] = e."Nav to bank";
        e.l[e.ll[29]] = e."Handling banking";
        e.l[e.ll[30]] = e."Missing law runes or air runes or water runes or earth runes or spade or food";
        e.l[e.ll[31]] = e."We are missing clue supplies, switching to BUYING";
        e.l[e.ll[32]] = e."We are missing staminas, switching to BUYING";
        e.l[e.ll[39]] = e."We are missing quest supplies, switching to BUYING";
        e.l[e.ll[40]] = e."We are missing dueling supplies, switching to BUYING";
        e.l[e.ll[52]] = e."Missing clue emote items, ending script";
        e.l[e.ll[53]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[57]] = e."Missing clue emote items, ending script";
        e.l[e.ll[58]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[63]] = e."Missing clue emote items, ending script";
        e.l[e.ll[64]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[69]] = e."Missing clue emote items, ending script";
        e.l[e.ll[70]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[75]] = e."Missing clue emote items, ending script";
        e.l[e.ll[76]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[81]] = e."Missing clue emote items, ending script";
        e.l[e.ll[82]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[87]] = e."Missing clue emote items, ending script";
        e.l[e.ll[88]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[92]] = e."Missing clue emote items, ending script";
        e.l[e.ll[93]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[98]] = e."Missing clue emote items, ending script";
        e.l[e.ll[99]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[103]] = e."Missing clue emote items, ending script";
        e.l[e.ll[104]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[109]] = e."Missing clue emote items, ending script";
        e.l[e.ll[110]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[115]] = e."Missing clue emote items, ending script";
        e.l[e.ll[116]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[121]] = e."Missing clue emote items, ending script";
        e.l[e.ll[122]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[126]] = e."Missing clue emote items, ending script";
        e.l[e.ll[28]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[130]] = e."Missing clue emote items, ending script";
        e.l[e.ll[131]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[135]] = e."Missing clue emote items, ending script";
        e.l[e.ll[136]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[140]] = e."Missing clue emote items, ending script";
        e.l[e.ll[141]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[145]] = e."Missing clue emote items, ending script";
        e.l[e.ll[146]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[149]] = e."Missing clue emote items, ending script";
        e.l[e.ll[150]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[155]] = e."Missing clue emote items, ending script";
        e.l[e.ll[156]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[160]] = e."Missing clue emote items, ending script";
        e.l[e.ll[161]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[165]] = e."Missing clue emote items, ending script";
        e.l[e.ll[166]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[170]] = e."Missing clue emote items, ending script";
        e.l[e.ll[171]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[174]] = e."Missing clue emote items, ending script";
        e.l[e.ll[175]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[178]] = e."Missing clue emote items, ending script";
        e.l[e.ll[179]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[183]] = e."Missing clue emote items, ending script";
        e.l[e.ll[184]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[188]] = e."Missing clue emote items, ending script";
        e.l[e.ll[189]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[194]] = e."Missing clue emote items, ending script";
        e.l[e.ll[195]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[199]] = e."Missing clue emote items, ending script";
        e.l[e.ll[200]] = e."We are missing supplies, switching to BUYING";
        e.l[e.ll[220]] = e."Stamina";
        e.l[e.ll[221]] = e."Games";
        e.l[e.ll[222]] = e."dueling";
        e.l[e.ll[223]] = e."ring of wealth (";
        e.l[e.ll[224]] = e."Clue scroll";
        e.l[e.ll[225]] = e."easy";
        e.l[e.ll[226]] = e."dueling";
        e.l[e.ll[227]] = e."Stamina";
        e.l[e.ll[228]] = e."Clue scroll";
        e.l[e.ll[229]] = e."easy";
    }

    private static boolean llIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean y() {
        block4: {
            int n2;
            block7: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                block11: {
                                    block10: {
                                        block9: {
                                            block8: {
                                                block6: {
                                                    block5: {
                                                        if (!e.llIIl(Clues.e ? 1 : 0)) break block4;
                                                        int[] nArray = new int[ll[1]];
                                                        nArray[e.ll[0]] = ll[24];
                                                        if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block5;
                                                        int[] nArray2 = new int[ll[1]];
                                                        nArray2[e.ll[0]] = ll[26];
                                                        if (!e.llIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                        int[] nArray3 = new int[ll[1]];
                                                        nArray3[e.ll[0]] = ll[22];
                                                        if (!e.llIlI(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                    }
                                                    int[] nArray = new int[ll[1]];
                                                    nArray[e.ll[0]] = ll[20];
                                                    if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block7;
                                                }
                                                int[] nArray = new int[ll[1]];
                                                nArray[e.ll[0]] = ll[24];
                                                if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block8;
                                                int[] nArray4 = new int[ll[1]];
                                                nArray4[e.ll[0]] = ll[26];
                                                if (!e.llIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block8;
                                                int[] nArray5 = new int[ll[1]];
                                                nArray5[e.ll[0]] = ll[27];
                                                if (!e.llIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                                            }
                                            int[] nArray = new int[ll[1]];
                                            nArray[e.ll[0]] = ll[21];
                                            if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block7;
                                        }
                                        int[] nArray = new int[ll[1]];
                                        nArray[e.ll[0]] = ll[24];
                                        if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block10;
                                        int[] nArray6 = new int[ll[1]];
                                        nArray6[e.ll[0]] = ll[26];
                                        if (!e.llIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                                        int[] nArray7 = new int[ll[1]];
                                        nArray7[e.ll[0]] = ll[47];
                                        if (!e.llIlI(Bank.contains((int[])nArray7) ? 1 : 0)) break block11;
                                    }
                                    int[] nArray = new int[ll[1]];
                                    nArray[e.ll[0]] = ll[42];
                                    if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block7;
                                }
                                int[] nArray = new int[ll[1]];
                                nArray[e.ll[0]] = ll[24];
                                if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray8 = new int[ll[1]];
                                nArray8[e.ll[0]] = ll[26];
                                if (!e.llIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block12;
                                int[] nArray9 = new int[ll[1]];
                                nArray9[e.ll[0]] = ll[47];
                                if (!e.llIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block13;
                            }
                            int[] nArray = new int[ll[1]];
                            nArray[e.ll[0]] = ll[43];
                            if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block7;
                        }
                        int[] nArray = new int[ll[1]];
                        nArray[e.ll[0]] = ll[24];
                        if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray10 = new int[ll[1]];
                        nArray10[e.ll[0]] = ll[26];
                        if (!e.llIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[ll[1]];
                    nArray[e.ll[0]] = ll[41];
                    if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block7;
                }
                int[] nArray = new int[ll[3]];
                nArray[e.ll[0]] = ll[46];
                nArray[e.ll[1]] = Clues.k;
                if (e.llIIl(k.c(nArray) ? 1 : 0)) {
                    n2 = ll[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = ll[0];
            return n2 != 0;
        }
        int[] nArray = new int[ll[8]];
        nArray[e.ll[0]] = ll[20];
        nArray[e.ll[1]] = ll[41];
        nArray[e.ll[3]] = ll[43];
        nArray[e.ll[4]] = ll[42];
        nArray[e.ll[5]] = ll[21];
        nArray[e.ll[6]] = ll[46];
        nArray[e.ll[7]] = Clues.k;
        return k.c(nArray);
    }

    static boolean z() {
        if (e.llIIl(Clues.e ? 1 : 0)) {
            int[] nArray = new int[ll[7]];
            nArray[e.ll[0]] = ll[24];
            nArray[e.ll[1]] = ll[26];
            nArray[e.ll[3]] = ll[27];
            nArray[e.ll[4]] = ll[47];
            nArray[e.ll[5]] = ll[47];
            nArray[e.ll[6]] = Clues.k;
            return k.c(nArray);
        }
        int[] nArray = new int[ll[4]];
        nArray[e.ll[0]] = ll[20];
        nArray[e.ll[1]] = ll[21];
        nArray[e.ll[3]] = Clues.k;
        return k.c(nArray);
    }

    private static boolean llIlI(int n2) {
        return n2 == 0;
    }

    static {
        e.lIlII();
        e.lll();
        H = new ArrayList<j>();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean A() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[ll[1]];
                nArray[e.ll[0]] = ll[20];
                if (!e.llIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[ll[1]];
                nArray2[e.ll[0]] = ll[24];
                if (!e.llIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                int[] nArray3 = new int[ll[1]];
                nArray3[e.ll[0]] = ll[22];
                if (!e.llIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[ll[1]];
                nArray4[e.ll[0]] = ll[26];
                if (!e.llIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block3;
                int[] nArray5 = new int[ll[1]];
                nArray5[e.ll[0]] = ll[26];
                if (!e.lIIIII(Inventory.getFirst((int[])nArray5).getQuantity(), ll[4])) break block3;
            }
            n2 = ll[1];
            0;
            if (2 < (0x14 ^ 0x7D ^ (0x74 ^ 0x19))) return n2 != 0;
            return false;
        }
        n2 = ll[0];
        return n2 != 0;
    }

    private static void B() {
        j llllllIllIllIlI;
        block166: {
            block165: {
                block164: {
                    block163: {
                        block162: {
                            block161: {
                                block160: {
                                    block159: {
                                        Object llllllIllIllIll;
                                        block158: {
                                            block157: {
                                                block156: {
                                                    block155: {
                                                        Object llllllIllIlllII;
                                                        int[] nArray = new int[ll[1]];
                                                        nArray[e.ll[0]] = ll[196];
                                                        if (e.llIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            int[] nArray2 = new int[ll[1]];
                                                            nArray2[e.ll[0]] = ll[96];
                                                            if (e.llIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                                                j j2 = new j(ll[96], ll[1], k.c(ll[201], ll[202]));
                                                                H.add(j2);
                                                                0;
                                                            }
                                                            int[] nArray3 = new int[ll[1]];
                                                            nArray3[e.ll[0]] = ll[197];
                                                            if (e.llIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[197], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray4 = new int[ll[1]];
                                                            nArray4[e.ll[0]] = ll[198];
                                                            if (e.llIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[198], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray5 = new int[ll[1]];
                                                        nArray5[e.ll[0]] = ll[190];
                                                        if (e.llIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                            int[] nArray6 = new int[ll[1]];
                                                            nArray6[e.ll[0]] = ll[191];
                                                            if (e.llIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[191], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray7 = new int[ll[1]];
                                                            nArray7[e.ll[0]] = ll[192];
                                                            if (e.llIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[192], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray8 = new int[ll[1]];
                                                            nArray8[e.ll[0]] = ll[193];
                                                            if (e.llIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[193], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray9 = new int[ll[1]];
                                                        nArray9[e.ll[0]] = ll[185];
                                                        if (e.llIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                                            int[] nArray10 = new int[ll[1]];
                                                            nArray10[e.ll[0]] = ll[186];
                                                            if (e.llIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[186], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray11 = new int[ll[1]];
                                                            nArray11[e.ll[0]] = ll[79];
                                                            if (e.llIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[79], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray12 = new int[ll[1]];
                                                            nArray12[e.ll[0]] = ll[187];
                                                            if (e.llIlI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[187], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray13 = new int[ll[1]];
                                                        nArray13[e.ll[0]] = ll[180];
                                                        if (e.llIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                                            int[] nArray14 = new int[ll[1]];
                                                            nArray14[e.ll[0]] = ll[91];
                                                            if (e.llIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[91], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray15 = new int[ll[1]];
                                                            nArray15[e.ll[0]] = ll[181];
                                                            if (e.llIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[181], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray16 = new int[ll[1]];
                                                            nArray16[e.ll[0]] = ll[182];
                                                            if (e.llIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[182], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray17 = new int[ll[1]];
                                                        nArray17[e.ll[0]] = ll[176];
                                                        if (e.llIIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                                                            int[] nArray18 = new int[ll[1]];
                                                            nArray18[e.ll[0]] = ll[112];
                                                            if (e.llIlI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[112], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray19 = new int[ll[1]];
                                                            nArray19[e.ll[0]] = ll[177];
                                                            if (e.llIlI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[177], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray20 = new int[ll[1]];
                                                            nArray20[e.ll[0]] = ll[148];
                                                            if (e.llIlI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[148], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray21 = new int[ll[1]];
                                                        nArray21[e.ll[0]] = ll[172];
                                                        if (e.llIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                                                            int[] nArray22 = new int[ll[1]];
                                                            nArray22[e.ll[0]] = ll[62];
                                                            if (e.llIlI(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[62], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray23 = new int[ll[1]];
                                                            nArray23[e.ll[0]] = ll[173];
                                                            if (e.llIlI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[173], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray24 = new int[ll[1]];
                                                            nArray24[e.ll[0]] = ll[148];
                                                            if (e.llIlI(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[148], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray25 = new int[ll[1]];
                                                        nArray25[e.ll[0]] = ll[167];
                                                        if (e.llIIl(Inventory.contains((int[])nArray25) ? 1 : 0)) {
                                                            int[] nArray26 = new int[ll[1]];
                                                            nArray26[e.ll[0]] = ll[168];
                                                            if (e.llIlI(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[168], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray27 = new int[ll[1]];
                                                            nArray27[e.ll[0]] = ll[73];
                                                            if (e.llIlI(Bank.contains((int[])nArray27) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[73], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray28 = new int[ll[1]];
                                                            nArray28[e.ll[0]] = ll[73];
                                                            if (e.llIlI(Bank.contains((int[])nArray28) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[73], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray29 = new int[ll[1]];
                                                        nArray29[e.ll[0]] = ll[162];
                                                        if (e.llIIl(Inventory.contains((int[])nArray29) ? 1 : 0)) {
                                                            int[] nArray30 = new int[ll[1]];
                                                            nArray30[e.ll[0]] = ll[90];
                                                            if (e.llIlI(Bank.contains((int[])nArray30) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[90], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray31 = new int[ll[1]];
                                                            nArray31[e.ll[0]] = ll[163];
                                                            if (e.llIlI(Bank.contains((int[])nArray31) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[163], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray32 = new int[ll[1]];
                                                            nArray32[e.ll[0]] = ll[164];
                                                            if (e.llIlI(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[164], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray33 = new int[ll[1]];
                                                        nArray33[e.ll[0]] = ll[157];
                                                        if (e.llIIl(Inventory.contains((int[])nArray33) ? 1 : 0)) {
                                                            int[] nArray34 = new int[ll[1]];
                                                            nArray34[e.ll[0]] = ll[158];
                                                            if (e.llIlI(Bank.contains((int[])nArray34) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[158], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray35 = new int[ll[1]];
                                                            nArray35[e.ll[0]] = ll[50];
                                                            if (e.llIlI(Bank.contains((int[])nArray35) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[50], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray36 = new int[ll[1]];
                                                            nArray36[e.ll[0]] = ll[159];
                                                            if (e.llIlI(Bank.contains((int[])nArray36) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[159], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray37 = new int[ll[1]];
                                                        nArray37[e.ll[0]] = ll[151];
                                                        if (e.llIIl(Inventory.contains((int[])nArray37) ? 1 : 0)) {
                                                            int[] nArray38 = new int[ll[1]];
                                                            nArray38[e.ll[0]] = ll[152];
                                                            if (e.llIlI(Bank.contains((int[])nArray38) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[152], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray39 = new int[ll[1]];
                                                            nArray39[e.ll[0]] = ll[153];
                                                            if (e.llIlI(Bank.contains((int[])nArray39) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[153], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray40 = new int[ll[1]];
                                                            nArray40[e.ll[0]] = ll[154];
                                                            if (e.llIlI(Bank.contains((int[])nArray40) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[154], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray41 = new int[ll[1]];
                                                        nArray41[e.ll[0]] = ll[147];
                                                        if (e.llIIl(Inventory.contains((int[])nArray41) ? 1 : 0)) {
                                                            int[] nArray42 = new int[ll[1]];
                                                            nArray42[e.ll[0]] = ll[143];
                                                            if (e.llIlI(Bank.contains((int[])nArray42) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[143], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray43 = new int[ll[1]];
                                                            nArray43[e.ll[0]] = ll[91];
                                                            if (e.llIlI(Bank.contains((int[])nArray43) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[91], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray44 = new int[ll[1]];
                                                            nArray44[e.ll[0]] = ll[148];
                                                            if (e.llIlI(Bank.contains((int[])nArray44) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[148], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray45 = new int[ll[1]];
                                                        nArray45[e.ll[0]] = ll[142];
                                                        if (e.llIIl(Inventory.contains((int[])nArray45) ? 1 : 0)) {
                                                            int[] nArray46 = new int[ll[1]];
                                                            nArray46[e.ll[0]] = ll[143];
                                                            if (e.llIlI(Bank.contains((int[])nArray46) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[143], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray47 = new int[ll[1]];
                                                            nArray47[e.ll[0]] = ll[124];
                                                            if (e.llIlI(Bank.contains((int[])nArray47) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[124], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray48 = new int[ll[1]];
                                                            nArray48[e.ll[0]] = ll[144];
                                                            if (e.llIlI(Bank.contains((int[])nArray48) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[144], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray49 = new int[ll[1]];
                                                        nArray49[e.ll[0]] = ll[137];
                                                        if (e.llIIl(Inventory.contains((int[])nArray49) ? 1 : 0)) {
                                                            int[] nArray50 = new int[ll[1]];
                                                            nArray50[e.ll[0]] = ll[138];
                                                            if (e.llIlI(Bank.contains((int[])nArray50) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[138], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray51 = new int[ll[1]];
                                                            nArray51[e.ll[0]] = ll[139];
                                                            if (e.llIlI(Bank.contains((int[])nArray51) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[139], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray52 = new int[ll[1]];
                                                            nArray52[e.ll[0]] = ll[73];
                                                            if (e.llIlI(Bank.contains((int[])nArray52) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[73], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray53 = new int[ll[1]];
                                                        nArray53[e.ll[0]] = ll[127];
                                                        if (e.llIIl(Inventory.contains((int[])nArray53) ? 1 : 0)) {
                                                            int[] nArray54 = new int[ll[1]];
                                                            nArray54[e.ll[0]] = ll[128];
                                                            if (e.llIlI(Bank.contains((int[])nArray54) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[128], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray55 = new int[ll[1]];
                                                            nArray55[e.ll[0]] = ll[91];
                                                            if (e.llIlI(Bank.contains((int[])nArray55) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[91], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray56 = new int[ll[1]];
                                                            nArray56[e.ll[0]] = ll[129];
                                                            if (e.llIlI(Bank.contains((int[])nArray56) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[129], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray57 = new int[ll[1]];
                                                        nArray57[e.ll[0]] = ll[123];
                                                        if (e.llIIl(Inventory.contains((int[])nArray57) ? 1 : 0)) {
                                                            int[] nArray58 = new int[ll[1]];
                                                            nArray58[e.ll[0]] = ll[124];
                                                            if (e.llIlI(Bank.contains((int[])nArray58) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[124], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray59 = new int[ll[1]];
                                                            nArray59[e.ll[0]] = ll[86];
                                                            if (e.llIlI(Bank.contains((int[])nArray59) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[86], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray60 = new int[ll[1]];
                                                            nArray60[e.ll[0]] = ll[125];
                                                            if (e.llIlI(Bank.contains((int[])nArray60) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[125], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray61 = new int[ll[1]];
                                                        nArray61[e.ll[0]] = ll[117];
                                                        if (e.llIIl(Inventory.contains((int[])nArray61) ? 1 : 0)) {
                                                            int[] nArray62 = new int[ll[1]];
                                                            nArray62[e.ll[0]] = ll[118];
                                                            if (e.llIlI(Bank.contains((int[])nArray62) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[118], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray63 = new int[ll[1]];
                                                            nArray63[e.ll[0]] = ll[119];
                                                            if (e.llIlI(Bank.contains((int[])nArray63) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[119], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray64 = new int[ll[1]];
                                                            nArray64[e.ll[0]] = ll[120];
                                                            if (e.llIlI(Bank.contains((int[])nArray64) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[120], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray65 = new int[ll[1]];
                                                        nArray65[e.ll[0]] = ll[111];
                                                        if (e.llIIl(Inventory.contains((int[])nArray65) ? 1 : 0)) {
                                                            int[] nArray66 = new int[ll[1]];
                                                            nArray66[e.ll[0]] = ll[112];
                                                            if (e.llIlI(Bank.contains((int[])nArray66) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[112], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray67 = new int[ll[1]];
                                                            nArray67[e.ll[0]] = ll[113];
                                                            if (e.llIlI(Bank.contains((int[])nArray67) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[113], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray68 = new int[ll[1]];
                                                            nArray68[e.ll[0]] = ll[114];
                                                            if (e.llIlI(Bank.contains((int[])nArray68) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[114], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray69 = new int[ll[1]];
                                                        nArray69[e.ll[0]] = ll[105];
                                                        if (e.llIIl(Inventory.contains((int[])nArray69) ? 1 : 0)) {
                                                            int[] nArray70 = new int[ll[1]];
                                                            nArray70[e.ll[0]] = ll[106];
                                                            if (e.llIlI(Bank.contains((int[])nArray70) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[106], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray71 = new int[ll[1]];
                                                            nArray71[e.ll[0]] = ll[107];
                                                            if (e.llIlI(Bank.contains((int[])nArray71) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[107], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray72 = new int[ll[1]];
                                                            nArray72[e.ll[0]] = ll[108];
                                                            if (e.llIlI(Bank.contains((int[])nArray72) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[108], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray73 = new int[ll[1]];
                                                        nArray73[e.ll[0]] = ll[94];
                                                        if (e.llIIl(Inventory.contains((int[])nArray73) ? 1 : 0)) {
                                                            int[] nArray74 = new int[ll[1]];
                                                            nArray74[e.ll[0]] = ll[95];
                                                            if (e.llIlI(Bank.contains((int[])nArray74) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[95], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray75 = new int[ll[1]];
                                                            nArray75[e.ll[0]] = ll[96];
                                                            if (e.llIlI(Bank.contains((int[])nArray75) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[96], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray76 = new int[ll[1]];
                                                            nArray76[e.ll[0]] = ll[97];
                                                            if (e.llIlI(Bank.contains((int[])nArray76) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[97], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray77 = new int[ll[1]];
                                                        nArray77[e.ll[0]] = ll[89];
                                                        if (e.llIIl(Inventory.contains((int[])nArray77) ? 1 : 0)) {
                                                            int[] nArray78 = new int[ll[1]];
                                                            nArray78[e.ll[0]] = ll[90];
                                                            if (e.llIlI(Bank.contains((int[])nArray78) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[90], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray79 = new int[ll[1]];
                                                            nArray79[e.ll[0]] = ll[73];
                                                            if (e.llIlI(Bank.contains((int[])nArray79) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[73], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray80 = new int[ll[1]];
                                                            nArray80[e.ll[0]] = ll[91];
                                                            if (e.llIlI(Bank.contains((int[])nArray80) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[91], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray81 = new int[ll[1]];
                                                        nArray81[e.ll[0]] = ll[83];
                                                        if (e.llIIl(Inventory.contains((int[])nArray81) ? 1 : 0)) {
                                                            int[] nArray82 = new int[ll[1]];
                                                            nArray82[e.ll[0]] = ll[84];
                                                            if (e.llIlI(Bank.contains((int[])nArray82) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[84], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray83 = new int[ll[1]];
                                                            nArray83[e.ll[0]] = ll[85];
                                                            if (e.llIlI(Bank.contains((int[])nArray83) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[85], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray84 = new int[ll[1]];
                                                            nArray84[e.ll[0]] = ll[86];
                                                            if (e.llIlI(Bank.contains((int[])nArray84) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[86], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray85 = new int[ll[1]];
                                                        nArray85[e.ll[0]] = ll[100];
                                                        if (e.llIIl(Inventory.contains((int[])nArray85) ? 1 : 0)) {
                                                            int[] nArray86 = new int[ll[1]];
                                                            nArray86[e.ll[0]] = ll[101];
                                                            if (e.llIlI(Bank.contains((int[])nArray86) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[101], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray87 = new int[ll[1]];
                                                            nArray87[e.ll[0]] = ll[102];
                                                            if (e.llIlI(Bank.contains((int[])nArray87) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[102], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray88 = new int[ll[1]];
                                                        nArray88[e.ll[0]] = ll[77];
                                                        if (e.llIIl(Inventory.contains((int[])nArray88) ? 1 : 0)) {
                                                            int[] nArray89 = new int[ll[1]];
                                                            nArray89[e.ll[0]] = ll[78];
                                                            if (e.llIlI(Bank.contains((int[])nArray89) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[78], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray90 = new int[ll[1]];
                                                            nArray90[e.ll[0]] = ll[79];
                                                            if (e.llIlI(Bank.contains((int[])nArray90) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[79], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray91 = new int[ll[1]];
                                                            nArray91[e.ll[0]] = ll[80];
                                                            if (e.llIlI(Bank.contains((int[])nArray91) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[80], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray92 = new int[ll[1]];
                                                        nArray92[e.ll[0]] = ll[71];
                                                        if (e.llIIl(Inventory.contains((int[])nArray92) ? 1 : 0)) {
                                                            int[] nArray93 = new int[ll[1]];
                                                            nArray93[e.ll[0]] = ll[72];
                                                            if (e.llIlI(Bank.contains((int[])nArray93) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[72], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray94 = new int[ll[1]];
                                                            nArray94[e.ll[0]] = ll[73];
                                                            if (e.llIlI(Bank.contains((int[])nArray94) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[73], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray95 = new int[ll[1]];
                                                            nArray95[e.ll[0]] = ll[74];
                                                            if (e.llIlI(Bank.contains((int[])nArray95) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[74], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray96 = new int[ll[1]];
                                                        nArray96[e.ll[0]] = ll[65];
                                                        if (e.llIIl(Inventory.contains((int[])nArray96) ? 1 : 0)) {
                                                            int[] nArray97 = new int[ll[1]];
                                                            nArray97[e.ll[0]] = ll[66];
                                                            if (e.llIlI(Bank.contains((int[])nArray97) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[66], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray98 = new int[ll[1]];
                                                            nArray98[e.ll[0]] = ll[67];
                                                            if (e.llIlI(Bank.contains((int[])nArray98) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[67], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray99 = new int[ll[1]];
                                                            nArray99[e.ll[0]] = ll[68];
                                                            if (e.llIlI(Bank.contains((int[])nArray99) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[68], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray100 = new int[ll[1]];
                                                        nArray100[e.ll[0]] = ll[59];
                                                        if (e.llIIl(Inventory.contains((int[])nArray100) ? 1 : 0)) {
                                                            int[] nArray101 = new int[ll[1]];
                                                            nArray101[e.ll[0]] = ll[60];
                                                            if (e.llIlI(Bank.contains((int[])nArray101) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[60], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray102 = new int[ll[1]];
                                                            nArray102[e.ll[0]] = ll[61];
                                                            if (e.llIlI(Bank.contains((int[])nArray102) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[61], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray103 = new int[ll[1]];
                                                            nArray103[e.ll[0]] = ll[62];
                                                            if (e.llIlI(Bank.contains((int[])nArray103) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[62], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray104 = new int[ll[1]];
                                                        nArray104[e.ll[0]] = ll[54];
                                                        if (e.llIIl(Inventory.contains((int[])nArray104) ? 1 : 0)) {
                                                            int[] nArray105 = new int[ll[1]];
                                                            nArray105[e.ll[0]] = ll[49];
                                                            if (e.llIlI(Bank.contains((int[])nArray105) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[49], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray106 = new int[ll[1]];
                                                            nArray106[e.ll[0]] = ll[55];
                                                            if (e.llIlI(Bank.contains((int[])nArray106) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[55], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray107 = new int[ll[1]];
                                                            nArray107[e.ll[0]] = ll[56];
                                                            if (e.llIlI(Bank.contains((int[])nArray107) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[56], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray108 = new int[ll[1]];
                                                        nArray108[e.ll[0]] = ll[48];
                                                        if (e.llIIl(Inventory.contains((int[])nArray108) ? 1 : 0)) {
                                                            int[] nArray109 = new int[ll[1]];
                                                            nArray109[e.ll[0]] = ll[51];
                                                            if (e.llIlI(Bank.contains((int[])nArray109) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[51], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray110 = new int[ll[1]];
                                                            nArray110[e.ll[0]] = ll[49];
                                                            if (e.llIlI(Bank.contains((int[])nArray110) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[49], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray111 = new int[ll[1]];
                                                            nArray111[e.ll[0]] = ll[50];
                                                            if (e.llIlI(Bank.contains((int[])nArray111) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[50], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray112 = new int[ll[1]];
                                                        nArray112[e.ll[0]] = ll[132];
                                                        if (e.llIIl(Inventory.contains((int[])nArray112) ? 1 : 0)) {
                                                            int[] nArray113 = new int[ll[1]];
                                                            nArray113[e.ll[0]] = ll[61];
                                                            if (e.llIlI(Bank.contains((int[])nArray113) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[61], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray114 = new int[ll[1]];
                                                            nArray114[e.ll[0]] = ll[133];
                                                            if (e.llIlI(Bank.contains((int[])nArray114) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[133], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                            int[] nArray115 = new int[ll[1]];
                                                            nArray115[e.ll[0]] = ll[134];
                                                            if (e.llIlI(Bank.contains((int[])nArray115) ? 1 : 0)) {
                                                                llllllIllIlllII = new j(ll[134], ll[1], k.c(ll[201], ll[202]));
                                                                H.add((j)llllllIllIlllII);
                                                                0;
                                                            }
                                                        }
                                                        int[] nArray116 = new int[ll[1]];
                                                        nArray116[e.ll[0]] = ll[46];
                                                        if (e.llIlI(Bank.contains((int[])nArray116) ? 1 : 0)) {
                                                            llllllIllIlllII = new j(ll[46], ll[1], k.c(ll[203], ll[204]));
                                                            H.add((j)llllllIllIlllII);
                                                            0;
                                                        }
                                                        if (e.llIlI(Bank.contains((Predicate)(llllllIllIlllII = item -> item.getName().toLowerCase().contains(l[ll[223]]))) ? 1 : 0)) {
                                                            llllllIllIllIll = new j(ll[205], ll[6], ll[206]);
                                                            H.add((j)llllllIllIllIll);
                                                            0;
                                                        }
                                                        int[] nArray117 = new int[ll[1]];
                                                        nArray117[e.ll[0]] = Clues.k;
                                                        if (!e.llIIl(Bank.contains((int[])nArray117) ? 1 : 0)) break block155;
                                                        int[] nArray118 = new int[ll[1]];
                                                        nArray118[e.ll[0]] = Clues.k;
                                                        if (!e.llIIl(Bank.contains((int[])nArray118) ? 1 : 0)) break block156;
                                                        int[] nArray119 = new int[ll[1]];
                                                        nArray119[e.ll[0]] = Clues.k;
                                                        if (!e.llIll(Bank.getFirst((int[])nArray119).getQuantity(), ll[16])) break block156;
                                                    }
                                                    llllllIllIllIll = new j(Clues.k, ll[99], k.c(ll[207], ll[208]));
                                                    H.add((j)llllllIllIllIll);
                                                    0;
                                                }
                                                int[] nArray = new int[ll[1]];
                                                nArray[e.ll[0]] = ll[20];
                                                if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block157;
                                                int[] nArray120 = new int[ll[1]];
                                                nArray120[e.ll[0]] = ll[20];
                                                if (!e.llIIl(Bank.contains((int[])nArray120) ? 1 : 0)) break block158;
                                                int[] nArray121 = new int[ll[1]];
                                                nArray121[e.ll[0]] = ll[20];
                                                if (!e.llIll(Bank.getFirst((int[])nArray121).getQuantity(), ll[70])) break block158;
                                            }
                                            llllllIllIllIll = new j(ll[20], ll[99], ll[209]);
                                            H.add((j)llllllIllIllIll);
                                            0;
                                        }
                                        if (e.llIIl((llllllIllIllIll = Bank.getAll(item -> item.getName().contains(l[ll[222]]))).isEmpty() ? 1 : 0)) {
                                            llllllIllIllIlI = new j(ll[33], ll[25], ll[210]);
                                            H.add(llllllIllIllIlI);
                                            0;
                                        }
                                        if (e.llIlI(Bank.contains(item -> item.getName().contains(l[ll[221]])) ? 1 : 0)) {
                                            llllllIllIllIlI = new j(ll[211], ll[28], ll[210]);
                                            H.add(llllllIllIllIlI);
                                            0;
                                        }
                                        if (e.llIlI(llllllIllIllIll.isEmpty() ? 1 : 0)) {
                                            int[] nArray = new int[ll[1]];
                                            nArray[e.ll[0]] = ll[33];
                                            if (e.llIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray122 = new int[ll[1]];
                                                nArray122[e.ll[0]] = ll[34];
                                                if (e.llIlI(Bank.contains((int[])nArray122) ? 1 : 0)) {
                                                    int[] nArray123 = new int[ll[1]];
                                                    nArray123[e.ll[0]] = ll[35];
                                                    if (e.llIlI(Bank.contains((int[])nArray123) ? 1 : 0)) {
                                                        int[] nArray124 = new int[ll[1]];
                                                        nArray124[e.ll[0]] = ll[36];
                                                        if (e.llIlI(Bank.contains((int[])nArray124) ? 1 : 0)) {
                                                            int[] nArray125 = new int[ll[1]];
                                                            nArray125[e.ll[0]] = ll[37];
                                                            if (e.llIlI(Bank.contains((int[])nArray125) ? 1 : 0)) {
                                                                llllllIllIllIlI = new j(ll[33], ll[25], ll[210]);
                                                                H.add(llllllIllIllIlI);
                                                                0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        int[] nArray = new int[ll[1]];
                                        nArray[e.ll[0]] = ll[33];
                                        if (e.llIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            int[] nArray126 = new int[ll[1]];
                                            nArray126[e.ll[0]] = ll[34];
                                            if (e.llIlI(Bank.contains((int[])nArray126) ? 1 : 0)) {
                                                int[] nArray127 = new int[ll[1]];
                                                nArray127[e.ll[0]] = ll[35];
                                                if (e.llIlI(Bank.contains((int[])nArray127) ? 1 : 0)) {
                                                    int[] nArray128 = new int[ll[1]];
                                                    nArray128[e.ll[0]] = ll[36];
                                                    if (e.llIlI(Bank.contains((int[])nArray128) ? 1 : 0)) {
                                                        int[] nArray129 = new int[ll[1]];
                                                        nArray129[e.ll[0]] = ll[37];
                                                        if (e.llIlI(Bank.contains((int[])nArray129) ? 1 : 0)) {
                                                            int[] nArray130 = new int[ll[1]];
                                                            nArray130[e.ll[0]] = ll[38];
                                                            if (e.llIlI(Bank.contains((int[])nArray130) ? 1 : 0)) {
                                                                llllllIllIllIlI = new j(ll[33], ll[25], ll[210]);
                                                                H.add(llllllIllIllIlI);
                                                                0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        int[] nArray131 = new int[ll[1]];
                                        nArray131[e.ll[0]] = ll[41];
                                        if (!e.llIIl(Bank.contains((int[])nArray131) ? 1 : 0)) break block159;
                                        int[] nArray132 = new int[ll[1]];
                                        nArray132[e.ll[0]] = ll[41];
                                        if (!e.llIIl(Bank.contains((int[])nArray132) ? 1 : 0)) break block160;
                                        int[] nArray133 = new int[ll[1]];
                                        nArray133[e.ll[0]] = ll[41];
                                        if (!e.llIll(Bank.getFirst((int[])nArray133).getQuantity(), ll[70])) break block160;
                                    }
                                    llllllIllIllIlI = new j(ll[41], ll[70], ll[212]);
                                    H.add(llllllIllIllIlI);
                                    0;
                                }
                                int[] nArray = new int[ll[1]];
                                nArray[e.ll[0]] = ll[43];
                                if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block161;
                                int[] nArray134 = new int[ll[1]];
                                nArray134[e.ll[0]] = ll[43];
                                if (!e.llIIl(Bank.contains((int[])nArray134) ? 1 : 0)) break block162;
                                int[] nArray135 = new int[ll[1]];
                                nArray135[e.ll[0]] = ll[43];
                                if (!e.llIll(Bank.getFirst((int[])nArray135).getQuantity(), ll[70])) break block162;
                            }
                            llllllIllIllIlI = new j(ll[43], ll[70], k.c(ll[213], ll[214]));
                            H.add(llllllIllIllIlI);
                            0;
                        }
                        int[] nArray = new int[ll[1]];
                        nArray[e.ll[0]] = ll[21];
                        if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block163;
                        int[] nArray136 = new int[ll[1]];
                        nArray136[e.ll[0]] = ll[21];
                        if (!e.llIIl(Bank.contains((int[])nArray136) ? 1 : 0)) break block164;
                        int[] nArray137 = new int[ll[1]];
                        nArray137[e.ll[0]] = ll[21];
                        if (!e.llIll(Bank.getFirst((int[])nArray137).getQuantity(), ll[70])) break block164;
                    }
                    llllllIllIllIlI = new j(ll[21], ll[70], ll[212]);
                    H.add(llllllIllIllIlI);
                    0;
                }
                int[] nArray = new int[ll[1]];
                nArray[e.ll[0]] = ll[42];
                if (!e.llIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block165;
                int[] nArray138 = new int[ll[1]];
                nArray138[e.ll[0]] = ll[42];
                if (!e.llIIl(Bank.contains((int[])nArray138) ? 1 : 0)) break block166;
                int[] nArray139 = new int[ll[1]];
                nArray139[e.ll[0]] = ll[42];
                if (!e.llIll(Bank.getFirst((int[])nArray139).getQuantity(), ll[70])) break block166;
            }
            llllllIllIllIlI = new j(ll[42], ll[70], ll[212]);
            H.add(llllllIllIllIlI);
            0;
        }
        if (e.llIIl(Clues.h ? 1 : 0)) {
            int[] nArray = new int[ll[1]];
            nArray[e.ll[0]] = ll[215];
            if (e.llIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray140 = new int[ll[1]];
                nArray140[e.ll[0]] = ll[216];
                if (e.llIlI(Bank.contains((int[])nArray140) ? 1 : 0)) {
                    int[] nArray141 = new int[ll[1]];
                    nArray141[e.ll[0]] = ll[217];
                    if (e.llIlI(Bank.contains((int[])nArray141) ? 1 : 0)) {
                        int[] nArray142 = new int[ll[1]];
                        nArray142[e.ll[0]] = ll[218];
                        if (e.llIlI(Bank.contains((int[])nArray142) ? 1 : 0)) {
                            llllllIllIllIlI = new j(ll[215], ll[70], ll[219]);
                            H.add(llllllIllIllIlI);
                            0;
                        }
                    }
                }
            }
            if (e.llIlI(Bank.contains(item -> item.getName().contains(l[ll[220]])) ? 1 : 0)) {
                llllllIllIllIlI = new j(ll[215], ll[70], ll[219]);
                H.add(llllllIllIllIlI);
                0;
            }
        }
    }

    private static boolean lIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    public static void x() {
        if (e.llIIl(G ? 1 : 0) && e.llIlI(Clues.e ? 1 : 0)) {
            Clues.c = l[ll[11]];
            h.a(H);
            if (e.llIll(H.size(), ll[1])) {
                System.out.println(l[ll[12]]);
                G = ll[0];
                return;
            }
        }
        if (e.llIlI(G ? 1 : 0)) {
            BankLocation[] bankLocationArray = new BankLocation[ll[2]];
            bankLocationArray[e.ll[0]] = BankLocation.VARROCK_WEST_BANK;
            bankLocationArray[e.ll[1]] = BankLocation.AL_KHARID_BANK;
            bankLocationArray[e.ll[3]] = BankLocation.CANIFIS_BANK;
            bankLocationArray[e.ll[4]] = BankLocation.VARROCK_EAST_BANK;
            bankLocationArray[e.ll[5]] = BankLocation.GRAND_EXCHANGE_BANK;
            bankLocationArray[e.ll[6]] = BankLocation.FALADOR_EAST_BANK;
            bankLocationArray[e.ll[7]] = BankLocation.FALADOR_WEST_BANK;
            bankLocationArray[e.ll[8]] = BankLocation.LUMBRIDGE_BANK;
            bankLocationArray[e.ll[9]] = BankLocation.ARDOUGNE_NORTH_BANK;
            bankLocationArray[e.ll[10]] = BankLocation.ARDOUGNE_SOUTH_BANK;
            bankLocationArray[e.ll[11]] = BankLocation.CASTLE_WARS_BANK;
            bankLocationArray[e.ll[12]] = BankLocation.CATHERBY_BANK;
            bankLocationArray[e.ll[13]] = BankLocation.DRAYNOR_BANK;
            bankLocationArray[e.ll[14]] = BankLocation.EDGEVILLE_BANK;
            bankLocationArray[e.ll[15]] = BankLocation.FEROX_ENCLAVE_BANK;
            bankLocationArray[e.ll[16]] = BankLocation.HOSIDIUS_BANK;
            BankLocation llllllIlllIIIIl = BankLocation.getNearestFrom((BankLocation[])bankLocationArray);
            if (e.llIIl(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIlI(e.A() ? 1 : 0)) {
                WorldPoint llllllIlllIIIII = new WorldPoint(ll[17], ll[18], ll[0]);
                if (e.lllII(Players.getLocal().getWorldLocation().distanceTo(llllllIlllIIIII), ll[5])) {
                    Clues.c = l[ll[13]];
                    Movement.walkTo((WorldPoint)llllllIlllIIIII);
                    0;
                    Time.sleepTicks((int)ll[1]);
                    0;
                }
                if (e.lllIl(Players.getLocal().getWorldLocation().distanceTo(llllllIlllIIIII), ll[5])) {
                    Clues.c = l[ll[14]];
                    String[] stringArray = new String[ll[1]];
                    stringArray[e.ll[0]] = l[ll[15]];
                    TileObjects.getNearest((String[])stringArray).interact(l[ll[16]]);
                    Time.sleepTicks((int)ll[5]);
                    0;
                }
            }
            if ((e.llIIl(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !e.llIlI(e.A() ? 1 : 0) || e.llIlI(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && e.llllI(llllllIlllIIIIl) && e.llIlI(llllllIlllIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Clues.c = l[ll[2]];
                g.a(llllllIlllIIIIl);
            }
            if (e.llllI(llllllIlllIIIIl) && e.llIIl(llllllIlllIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (e.llIlI(Bank.isOpen() ? 1 : 0)) {
                    g.G();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)ll[19]);
                    0;
                }
                if (e.llIIl(Bank.isOpen() ? 1 : 0)) {
                    Clues.c = l[ll[29]];
                    if (e.lllll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)ll[5]);
                        0;
                    }
                    if (e.lllll(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks((int)ll[3]);
                        0;
                    }
                    if (e.llIlI(e.y() ? 1 : 0)) {
                        if (e.llIIl(Clues.e ? 1 : 0)) {
                            System.out.println(l[ll[30]]);
                            Clues.d = ll[1];
                            return;
                        }
                        e.B();
                        System.out.println(l[ll[31]]);
                        G = ll[1];
                        return;
                    }
                    if (e.llIIl(Clues.e ? 1 : 0)) {
                        // empty if block
                    }
                    if (e.llIlI(Clues.e ? 1 : 0)) {
                        if (e.llIlI(Bank.contains(item -> item.getName().contains(l[ll[227]])) ? 1 : 0) && e.llIIl(Clues.h ? 1 : 0)) {
                            e.B();
                            System.out.println(l[ll[32]]);
                            G = ll[1];
                            return;
                        }
                        int[] nArray = new int[ll[1]];
                        nArray[e.ll[0]] = ll[33];
                        if (e.llIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[ll[1]];
                            nArray2[e.ll[0]] = ll[34];
                            if (e.llIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                int[] nArray3 = new int[ll[1]];
                                nArray3[e.ll[0]] = ll[35];
                                if (e.llIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    int[] nArray4 = new int[ll[1]];
                                    nArray4[e.ll[0]] = ll[36];
                                    if (e.llIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[ll[1]];
                                        nArray5[e.ll[0]] = ll[37];
                                        if (e.llIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                            int[] nArray6 = new int[ll[1]];
                                            nArray6[e.ll[0]] = ll[38];
                                            if (e.llIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                e.B();
                                                System.out.println(l[ll[39]]);
                                                G = ll[1];
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (e.llIlI(Bank.contains(item -> item.getName().contains(l[ll[226]])) ? 1 : 0)) {
                            e.B();
                            System.out.println(l[ll[40]]);
                            G = ll[1];
                            return;
                        }
                    }
                    if (e.llIIl(e.y() ? 1 : 0)) {
                        Clues.g = ll[0];
                        if (e.llIIl(Clues.h ? 1 : 0)) {
                            g.b(m.bM, ll[3]);
                        }
                        if (e.llIlI(Clues.e ? 1 : 0)) {
                            g.a(ll[20], ll[11]);
                            g.a(ll[41], ll[11]);
                            g.a(ll[42], ll[11]);
                            g.a(ll[21], ll[11]);
                            g.a(ll[43], ll[11]);
                        }
                        g.b(m.bE, ll[1]);
                        g.b(m.bF, ll[1]);
                        g.a(ll[44], ll[45]);
                        g.a(ll[46], ll[1]);
                        g.a(Clues.k, ll[3]);
                        if (e.llIIl(Clues.e ? 1 : 0)) {
                            g.a(ll[22], ll[23]);
                            g.a(ll[24], ll[25]);
                            g.a(ll[26], ll[23]);
                            g.a(ll[47], ll[23]);
                            g.a(ll[27], ll[23]);
                        }
                        Bank.withdraw(item -> {
                            int n2;
                            if (e.llIIl(item.getName().contains(l[ll[224]]) ? 1 : 0) && e.llIIl(item.getName().contains(l[ll[225]]) ? 1 : 0)) {
                                n2 = ll[1];
                                0;
                                if (((123 + 116 - 9 + 20 ^ 18 + 56 - -37 + 69) & (85 + 150 - -5 + 1 ^ 56 + 124 - 54 + 65 ^ -1)) > 0) {
                                    return ((25 + 71 - 28 + 63 ^ 49 + 36 - -38 + 25) & (0x43 ^ 0x59 ^ (0x88 ^ 0x85) ^ -1)) != 0;
                                }
                            } else {
                                n2 = ll[0];
                            }
                            return n2 != 0;
                        }, (int)ll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)k.c(ll[4], ll[6]));
                        0;
                        int[] nArray = new int[ll[1]];
                        nArray[e.ll[0]] = ll[48];
                        if (e.llIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray7 = new int[ll[4]];
                            nArray7[e.ll[0]] = ll[49];
                            nArray7[e.ll[1]] = ll[50];
                            nArray7[e.ll[3]] = ll[51];
                            if (e.llIlI(k.c(nArray7) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[52]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                e.B();
                                System.out.println(l[ll[53]]);
                                G = ll[1];
                                return;
                            }
                            int[] nArray8 = new int[ll[4]];
                            nArray8[e.ll[0]] = ll[49];
                            nArray8[e.ll[1]] = ll[50];
                            nArray8[e.ll[3]] = ll[51];
                            if (e.llIIl(k.c(nArray8) ? 1 : 0)) {
                                g.a(ll[49], ll[1]);
                                g.a(ll[50], ll[1]);
                                g.a(ll[51], ll[1]);
                            }
                        }
                        int[] nArray9 = new int[ll[1]];
                        nArray9[e.ll[0]] = ll[54];
                        if (e.llIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                            int[] nArray10 = new int[ll[4]];
                            nArray10[e.ll[0]] = ll[49];
                            nArray10[e.ll[1]] = ll[55];
                            nArray10[e.ll[3]] = ll[56];
                            if (e.llIlI(k.c(nArray10) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[57]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                e.B();
                                System.out.println(l[ll[58]]);
                                G = ll[1];
                                return;
                            }
                            int[] nArray11 = new int[ll[4]];
                            nArray11[e.ll[0]] = ll[49];
                            nArray11[e.ll[1]] = ll[55];
                            nArray11[e.ll[3]] = ll[56];
                            if (e.llIIl(k.c(nArray11) ? 1 : 0)) {
                                g.a(ll[49], ll[1]);
                                g.a(ll[55], ll[1]);
                                g.a(ll[56], ll[1]);
                            }
                        }
                        int[] nArray12 = new int[ll[1]];
                        nArray12[e.ll[0]] = ll[59];
                        if (e.llIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            int[] nArray13 = new int[ll[4]];
                            nArray13[e.ll[0]] = ll[60];
                            nArray13[e.ll[1]] = ll[61];
                            nArray13[e.ll[3]] = ll[62];
                            if (e.llIlI(k.c(nArray13) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[63]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                e.B();
                                System.out.println(l[ll[64]]);
                                G = ll[1];
                                return;
                            }
                            int[] nArray14 = new int[ll[4]];
                            nArray14[e.ll[0]] = ll[60];
                            nArray14[e.ll[1]] = ll[61];
                            nArray14[e.ll[3]] = ll[62];
                            if (e.llIIl(k.c(nArray14) ? 1 : 0)) {
                                g.a(ll[60], ll[1]);
                                g.a(ll[61], ll[1]);
                                g.a(ll[62], ll[1]);
                            }
                        }
                        int[] nArray15 = new int[ll[1]];
                        nArray15[e.ll[0]] = ll[65];
                        if (e.llIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[ll[4]];
                            nArray16[e.ll[0]] = ll[66];
                            nArray16[e.ll[1]] = ll[67];
                            nArray16[e.ll[3]] = ll[68];
                            if (e.llIlI(k.c(nArray16) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[69]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[70]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray17 = new int[ll[4]];
                            nArray17[e.ll[0]] = ll[66];
                            nArray17[e.ll[1]] = ll[67];
                            nArray17[e.ll[3]] = ll[68];
                            if (e.llIIl(k.c(nArray17) ? 1 : 0)) {
                                g.a(ll[66], ll[1]);
                                g.a(ll[67], ll[1]);
                                g.a(ll[68], ll[1]);
                            }
                        }
                        int[] nArray18 = new int[ll[1]];
                        nArray18[e.ll[0]] = ll[71];
                        if (e.llIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[ll[4]];
                            nArray19[e.ll[0]] = ll[72];
                            nArray19[e.ll[1]] = ll[73];
                            nArray19[e.ll[3]] = ll[74];
                            if (e.llIlI(k.c(nArray19) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[75]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[76]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray20 = new int[ll[4]];
                            nArray20[e.ll[0]] = ll[72];
                            nArray20[e.ll[1]] = ll[73];
                            nArray20[e.ll[3]] = ll[74];
                            if (e.llIIl(k.c(nArray20) ? 1 : 0)) {
                                g.a(ll[72], ll[1]);
                                g.a(ll[73], ll[1]);
                                g.a(ll[74], ll[1]);
                            }
                        }
                        int[] nArray21 = new int[ll[1]];
                        nArray21[e.ll[0]] = ll[77];
                        if (e.llIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                            int[] nArray22 = new int[ll[4]];
                            nArray22[e.ll[0]] = ll[78];
                            nArray22[e.ll[1]] = ll[79];
                            nArray22[e.ll[3]] = ll[80];
                            if (e.llIlI(k.c(nArray22) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[81]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[82]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray23 = new int[ll[4]];
                            nArray23[e.ll[0]] = ll[78];
                            nArray23[e.ll[1]] = ll[79];
                            nArray23[e.ll[3]] = ll[80];
                            if (e.llIIl(k.c(nArray23) ? 1 : 0)) {
                                g.a(ll[78], ll[1]);
                                g.a(ll[79], ll[1]);
                                g.a(ll[80], ll[1]);
                            }
                        }
                        int[] nArray24 = new int[ll[1]];
                        nArray24[e.ll[0]] = ll[83];
                        if (e.llIIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                            int[] nArray25 = new int[ll[4]];
                            nArray25[e.ll[0]] = ll[84];
                            nArray25[e.ll[1]] = ll[85];
                            nArray25[e.ll[3]] = ll[86];
                            if (e.llIlI(k.c(nArray25) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[87]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[88]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray26 = new int[ll[4]];
                            nArray26[e.ll[0]] = ll[84];
                            nArray26[e.ll[1]] = ll[85];
                            nArray26[e.ll[3]] = ll[86];
                            if (e.llIIl(k.c(nArray26) ? 1 : 0)) {
                                g.a(ll[84], ll[1]);
                                g.a(ll[85], ll[1]);
                                g.a(ll[86], ll[1]);
                            }
                        }
                        int[] nArray27 = new int[ll[1]];
                        nArray27[e.ll[0]] = ll[89];
                        if (e.llIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                            int[] nArray28 = new int[ll[4]];
                            nArray28[e.ll[0]] = ll[90];
                            nArray28[e.ll[1]] = ll[73];
                            nArray28[e.ll[3]] = ll[91];
                            if (e.llIlI(k.c(nArray28) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[92]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[93]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray29 = new int[ll[4]];
                            nArray29[e.ll[0]] = ll[90];
                            nArray29[e.ll[1]] = ll[73];
                            nArray29[e.ll[3]] = ll[91];
                            if (e.llIIl(k.c(nArray29) ? 1 : 0)) {
                                g.a(ll[90], ll[1]);
                                g.a(ll[73], ll[1]);
                                g.a(ll[91], ll[1]);
                            }
                        }
                        int[] nArray30 = new int[ll[1]];
                        nArray30[e.ll[0]] = ll[94];
                        if (e.llIIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                            int[] nArray31 = new int[ll[4]];
                            nArray31[e.ll[0]] = ll[95];
                            nArray31[e.ll[1]] = ll[96];
                            nArray31[e.ll[3]] = ll[97];
                            if (e.llIlI(k.c(nArray31) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[98]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[99]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray32 = new int[ll[4]];
                            nArray32[e.ll[0]] = ll[95];
                            nArray32[e.ll[1]] = ll[96];
                            nArray32[e.ll[3]] = ll[97];
                            if (e.llIIl(k.c(nArray32) ? 1 : 0)) {
                                g.a(ll[95], ll[1]);
                                g.a(ll[96], ll[1]);
                                g.a(ll[97], ll[1]);
                            }
                        }
                        int[] nArray33 = new int[ll[1]];
                        nArray33[e.ll[0]] = ll[100];
                        if (e.llIIl(Inventory.contains((int[])nArray33) ? 1 : 0)) {
                            int[] nArray34 = new int[ll[3]];
                            nArray34[e.ll[0]] = ll[101];
                            nArray34[e.ll[1]] = ll[102];
                            if (e.llIlI(k.c(nArray34) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[103]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[104]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray35 = new int[ll[3]];
                            nArray35[e.ll[0]] = ll[101];
                            nArray35[e.ll[1]] = ll[102];
                            if (e.llIIl(k.c(nArray35) ? 1 : 0)) {
                                g.a(ll[101], ll[1]);
                                g.a(ll[102], ll[1]);
                            }
                        }
                        int[] nArray36 = new int[ll[1]];
                        nArray36[e.ll[0]] = ll[105];
                        if (e.llIIl(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                            int[] nArray37 = new int[ll[4]];
                            nArray37[e.ll[0]] = ll[106];
                            nArray37[e.ll[1]] = ll[107];
                            nArray37[e.ll[3]] = ll[108];
                            if (e.llIlI(k.c(nArray37) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[109]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[110]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray38 = new int[ll[4]];
                            nArray38[e.ll[0]] = ll[106];
                            nArray38[e.ll[1]] = ll[107];
                            nArray38[e.ll[3]] = ll[108];
                            if (e.llIIl(k.c(nArray38) ? 1 : 0)) {
                                g.a(ll[106], ll[1]);
                                g.a(ll[107], ll[1]);
                                g.a(ll[108], ll[1]);
                            }
                        }
                        int[] nArray39 = new int[ll[1]];
                        nArray39[e.ll[0]] = ll[111];
                        if (e.llIIl(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                            int[] nArray40 = new int[ll[4]];
                            nArray40[e.ll[0]] = ll[112];
                            nArray40[e.ll[1]] = ll[113];
                            nArray40[e.ll[3]] = ll[114];
                            if (e.llIlI(k.c(nArray40) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[115]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[116]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray41 = new int[ll[4]];
                            nArray41[e.ll[0]] = ll[112];
                            nArray41[e.ll[1]] = ll[113];
                            nArray41[e.ll[3]] = ll[114];
                            if (e.llIIl(k.c(nArray41) ? 1 : 0)) {
                                g.a(ll[112], ll[1]);
                                g.a(ll[113], ll[1]);
                                g.a(ll[114], ll[1]);
                            }
                        }
                        int[] nArray42 = new int[ll[1]];
                        nArray42[e.ll[0]] = ll[117];
                        if (e.llIIl(Inventory.contains((int[])nArray42) ? 1 : 0)) {
                            int[] nArray43 = new int[ll[4]];
                            nArray43[e.ll[0]] = ll[118];
                            nArray43[e.ll[1]] = ll[119];
                            nArray43[e.ll[3]] = ll[120];
                            if (e.llIlI(k.c(nArray43) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[121]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[122]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray44 = new int[ll[4]];
                            nArray44[e.ll[0]] = ll[118];
                            nArray44[e.ll[1]] = ll[119];
                            nArray44[e.ll[3]] = ll[120];
                            if (e.llIIl(k.c(nArray44) ? 1 : 0)) {
                                g.a(ll[118], ll[1]);
                                g.a(ll[119], ll[1]);
                                g.a(ll[120], ll[1]);
                            }
                        }
                        int[] nArray45 = new int[ll[1]];
                        nArray45[e.ll[0]] = ll[123];
                        if (e.llIIl(Inventory.contains((int[])nArray45) ? 1 : 0)) {
                            int[] nArray46 = new int[ll[4]];
                            nArray46[e.ll[0]] = ll[124];
                            nArray46[e.ll[1]] = ll[86];
                            nArray46[e.ll[3]] = ll[125];
                            if (e.llIlI(k.c(nArray46) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[126]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[28]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray47 = new int[ll[4]];
                            nArray47[e.ll[0]] = ll[124];
                            nArray47[e.ll[1]] = ll[86];
                            nArray47[e.ll[3]] = ll[125];
                            if (e.llIIl(k.c(nArray47) ? 1 : 0)) {
                                g.a(ll[124], ll[1]);
                                g.a(ll[86], ll[1]);
                                g.a(ll[125], ll[1]);
                            }
                        }
                        int[] nArray48 = new int[ll[1]];
                        nArray48[e.ll[0]] = ll[127];
                        if (e.llIIl(Inventory.contains((int[])nArray48) ? 1 : 0)) {
                            int[] nArray49 = new int[ll[4]];
                            nArray49[e.ll[0]] = ll[128];
                            nArray49[e.ll[1]] = ll[91];
                            nArray49[e.ll[3]] = ll[129];
                            if (e.llIlI(k.c(nArray49) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[130]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[131]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray50 = new int[ll[4]];
                            nArray50[e.ll[0]] = ll[128];
                            nArray50[e.ll[1]] = ll[91];
                            nArray50[e.ll[3]] = ll[129];
                            if (e.llIIl(k.c(nArray50) ? 1 : 0)) {
                                g.a(ll[128], ll[1]);
                                g.a(ll[91], ll[1]);
                                g.a(ll[129], ll[1]);
                            }
                        }
                        int[] nArray51 = new int[ll[1]];
                        nArray51[e.ll[0]] = ll[132];
                        if (e.llIIl(Inventory.contains((int[])nArray51) ? 1 : 0)) {
                            int[] nArray52 = new int[ll[4]];
                            nArray52[e.ll[0]] = ll[61];
                            nArray52[e.ll[1]] = ll[133];
                            nArray52[e.ll[3]] = ll[134];
                            if (e.llIlI(k.c(nArray52) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[135]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[136]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray53 = new int[ll[4]];
                            nArray53[e.ll[0]] = ll[61];
                            nArray53[e.ll[1]] = ll[133];
                            nArray53[e.ll[3]] = ll[134];
                            if (e.llIIl(k.c(nArray53) ? 1 : 0)) {
                                g.a(ll[61], ll[1]);
                                g.a(ll[133], ll[1]);
                                g.a(ll[134], ll[1]);
                            }
                        }
                        int[] nArray54 = new int[ll[1]];
                        nArray54[e.ll[0]] = ll[137];
                        if (e.llIIl(Inventory.contains((int[])nArray54) ? 1 : 0)) {
                            int[] nArray55 = new int[ll[4]];
                            nArray55[e.ll[0]] = ll[138];
                            nArray55[e.ll[1]] = ll[139];
                            nArray55[e.ll[3]] = ll[73];
                            if (e.llIlI(k.c(nArray55) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[140]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[141]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray56 = new int[ll[4]];
                            nArray56[e.ll[0]] = ll[138];
                            nArray56[e.ll[1]] = ll[139];
                            nArray56[e.ll[3]] = ll[73];
                            if (e.llIIl(k.c(nArray56) ? 1 : 0)) {
                                g.a(ll[138], ll[1]);
                                g.a(ll[139], ll[1]);
                                g.a(ll[73], ll[1]);
                            }
                        }
                        int[] nArray57 = new int[ll[1]];
                        nArray57[e.ll[0]] = ll[142];
                        if (e.llIIl(Inventory.contains((int[])nArray57) ? 1 : 0)) {
                            int[] nArray58 = new int[ll[4]];
                            nArray58[e.ll[0]] = ll[143];
                            nArray58[e.ll[1]] = ll[124];
                            nArray58[e.ll[3]] = ll[144];
                            if (e.llIlI(k.c(nArray58) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[145]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[146]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray59 = new int[ll[4]];
                            nArray59[e.ll[0]] = ll[143];
                            nArray59[e.ll[1]] = ll[124];
                            nArray59[e.ll[3]] = ll[144];
                            if (e.llIIl(k.c(nArray59) ? 1 : 0)) {
                                g.a(ll[143], ll[1]);
                                g.a(ll[124], ll[1]);
                                g.a(ll[144], ll[1]);
                            }
                        }
                        int[] nArray60 = new int[ll[1]];
                        nArray60[e.ll[0]] = ll[147];
                        if (e.llIIl(Inventory.contains((int[])nArray60) ? 1 : 0)) {
                            int[] nArray61 = new int[ll[4]];
                            nArray61[e.ll[0]] = ll[143];
                            nArray61[e.ll[1]] = ll[91];
                            nArray61[e.ll[3]] = ll[148];
                            if (e.llIlI(k.c(nArray61) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[149]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[150]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray62 = new int[ll[4]];
                            nArray62[e.ll[0]] = ll[143];
                            nArray62[e.ll[1]] = ll[91];
                            nArray62[e.ll[3]] = ll[148];
                            if (e.llIIl(k.c(nArray62) ? 1 : 0)) {
                                g.a(ll[143], ll[1]);
                                g.a(ll[91], ll[1]);
                                g.a(ll[148], ll[1]);
                            }
                        }
                        int[] nArray63 = new int[ll[1]];
                        nArray63[e.ll[0]] = ll[151];
                        if (e.llIIl(Inventory.contains((int[])nArray63) ? 1 : 0)) {
                            int[] nArray64 = new int[ll[4]];
                            nArray64[e.ll[0]] = ll[152];
                            nArray64[e.ll[1]] = ll[153];
                            nArray64[e.ll[3]] = ll[154];
                            if (e.llIlI(k.c(nArray64) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[155]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[156]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray65 = new int[ll[4]];
                            nArray65[e.ll[0]] = ll[152];
                            nArray65[e.ll[1]] = ll[153];
                            nArray65[e.ll[3]] = ll[154];
                            if (e.llIIl(k.c(nArray65) ? 1 : 0)) {
                                g.a(ll[152], ll[1]);
                                g.a(ll[153], ll[1]);
                                g.a(ll[154], ll[1]);
                            }
                        }
                        int[] nArray66 = new int[ll[1]];
                        nArray66[e.ll[0]] = ll[157];
                        if (e.llIIl(Inventory.contains((int[])nArray66) ? 1 : 0)) {
                            int[] nArray67 = new int[ll[4]];
                            nArray67[e.ll[0]] = ll[158];
                            nArray67[e.ll[1]] = ll[50];
                            nArray67[e.ll[3]] = ll[159];
                            if (e.llIlI(k.c(nArray67) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[160]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[161]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray68 = new int[ll[4]];
                            nArray68[e.ll[0]] = ll[158];
                            nArray68[e.ll[1]] = ll[50];
                            nArray68[e.ll[3]] = ll[159];
                            if (e.llIIl(k.c(nArray68) ? 1 : 0)) {
                                g.a(ll[158], ll[1]);
                                g.a(ll[50], ll[1]);
                                g.a(ll[159], ll[1]);
                            }
                        }
                        int[] nArray69 = new int[ll[1]];
                        nArray69[e.ll[0]] = ll[162];
                        if (e.llIIl(Inventory.contains((int[])nArray69) ? 1 : 0)) {
                            int[] nArray70 = new int[ll[4]];
                            nArray70[e.ll[0]] = ll[90];
                            nArray70[e.ll[1]] = ll[163];
                            nArray70[e.ll[3]] = ll[164];
                            if (e.llIlI(k.c(nArray70) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[165]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[166]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray71 = new int[ll[4]];
                            nArray71[e.ll[0]] = ll[90];
                            nArray71[e.ll[1]] = ll[163];
                            nArray71[e.ll[3]] = ll[164];
                            if (e.llIIl(k.c(nArray71) ? 1 : 0)) {
                                g.a(ll[90], ll[1]);
                                g.a(ll[163], ll[1]);
                                g.a(ll[164], ll[1]);
                            }
                        }
                        int[] nArray72 = new int[ll[1]];
                        nArray72[e.ll[0]] = ll[167];
                        if (e.llIIl(Inventory.contains((int[])nArray72) ? 1 : 0)) {
                            int[] nArray73 = new int[ll[4]];
                            nArray73[e.ll[0]] = ll[168];
                            nArray73[e.ll[1]] = ll[73];
                            nArray73[e.ll[3]] = ll[169];
                            if (e.llIlI(k.c(nArray73) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[170]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[171]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray74 = new int[ll[4]];
                            nArray74[e.ll[0]] = ll[168];
                            nArray74[e.ll[1]] = ll[73];
                            nArray74[e.ll[3]] = ll[169];
                            if (e.llIIl(k.c(nArray74) ? 1 : 0)) {
                                g.a(ll[168], ll[1]);
                                g.a(ll[73], ll[1]);
                                g.a(ll[169], ll[1]);
                            }
                        }
                        int[] nArray75 = new int[ll[1]];
                        nArray75[e.ll[0]] = ll[172];
                        if (e.llIIl(Inventory.contains((int[])nArray75) ? 1 : 0)) {
                            int[] nArray76 = new int[ll[4]];
                            nArray76[e.ll[0]] = ll[62];
                            nArray76[e.ll[1]] = ll[173];
                            nArray76[e.ll[3]] = ll[148];
                            if (e.llIlI(k.c(nArray76) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[174]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[175]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray77 = new int[ll[4]];
                            nArray77[e.ll[0]] = ll[62];
                            nArray77[e.ll[1]] = ll[173];
                            nArray77[e.ll[3]] = ll[148];
                            if (e.llIIl(k.c(nArray77) ? 1 : 0)) {
                                g.a(ll[62], ll[1]);
                                g.a(ll[173], ll[1]);
                                g.a(ll[148], ll[1]);
                            }
                        }
                        int[] nArray78 = new int[ll[1]];
                        nArray78[e.ll[0]] = ll[176];
                        if (e.llIIl(Inventory.contains((int[])nArray78) ? 1 : 0)) {
                            int[] nArray79 = new int[ll[4]];
                            nArray79[e.ll[0]] = ll[112];
                            nArray79[e.ll[1]] = ll[148];
                            nArray79[e.ll[3]] = ll[177];
                            if (e.llIlI(k.c(nArray79) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[178]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[179]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray80 = new int[ll[4]];
                            nArray80[e.ll[0]] = ll[112];
                            nArray80[e.ll[1]] = ll[148];
                            nArray80[e.ll[3]] = ll[177];
                            if (e.llIIl(k.c(nArray80) ? 1 : 0)) {
                                g.a(ll[112], ll[1]);
                                g.a(ll[177], ll[1]);
                                g.a(ll[148], ll[1]);
                            }
                        }
                        int[] nArray81 = new int[ll[1]];
                        nArray81[e.ll[0]] = ll[180];
                        if (e.llIIl(Inventory.contains((int[])nArray81) ? 1 : 0)) {
                            int[] nArray82 = new int[ll[4]];
                            nArray82[e.ll[0]] = ll[91];
                            nArray82[e.ll[1]] = ll[181];
                            nArray82[e.ll[3]] = ll[182];
                            if (e.llIlI(k.c(nArray82) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[183]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[184]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray83 = new int[ll[4]];
                            nArray83[e.ll[0]] = ll[91];
                            nArray83[e.ll[1]] = ll[181];
                            nArray83[e.ll[3]] = ll[182];
                            if (e.llIIl(k.c(nArray83) ? 1 : 0)) {
                                g.a(ll[91], ll[1]);
                                g.a(ll[181], ll[1]);
                                g.a(ll[182], ll[1]);
                            }
                        }
                        int[] nArray84 = new int[ll[1]];
                        nArray84[e.ll[0]] = ll[185];
                        if (e.llIIl(Inventory.contains((int[])nArray84) ? 1 : 0)) {
                            int[] nArray85 = new int[ll[4]];
                            nArray85[e.ll[0]] = ll[186];
                            nArray85[e.ll[1]] = ll[79];
                            nArray85[e.ll[3]] = ll[187];
                            if (e.llIlI(k.c(nArray85) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[188]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[189]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray86 = new int[ll[4]];
                            nArray86[e.ll[0]] = ll[186];
                            nArray86[e.ll[1]] = ll[79];
                            nArray86[e.ll[3]] = ll[187];
                            if (e.llIIl(k.c(nArray86) ? 1 : 0)) {
                                g.a(ll[186], ll[1]);
                                g.a(ll[79], ll[1]);
                                g.a(ll[187], ll[1]);
                            }
                        }
                        int[] nArray87 = new int[ll[1]];
                        nArray87[e.ll[0]] = ll[190];
                        if (e.llIIl(Inventory.contains((int[])nArray87) ? 1 : 0)) {
                            int[] nArray88 = new int[ll[4]];
                            nArray88[e.ll[0]] = ll[191];
                            nArray88[e.ll[1]] = ll[192];
                            nArray88[e.ll[3]] = ll[193];
                            if (e.llIlI(k.c(nArray88) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[194]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[195]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray89 = new int[ll[4]];
                            nArray89[e.ll[0]] = ll[191];
                            nArray89[e.ll[1]] = ll[192];
                            nArray89[e.ll[3]] = ll[193];
                            if (e.llIIl(k.c(nArray89) ? 1 : 0)) {
                                g.a(ll[191], ll[1]);
                                g.a(ll[192], ll[1]);
                                g.a(ll[193], ll[1]);
                            }
                        }
                        int[] nArray90 = new int[ll[1]];
                        nArray90[e.ll[0]] = ll[196];
                        if (e.llIIl(Inventory.contains((int[])nArray90) ? 1 : 0)) {
                            int[] nArray91 = new int[ll[4]];
                            nArray91[e.ll[0]] = ll[96];
                            nArray91[e.ll[1]] = ll[197];
                            nArray91[e.ll[3]] = ll[198];
                            if (e.llIlI(k.c(nArray91) ? 1 : 0)) {
                                if (e.llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[199]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                if (e.llIlI(Clues.e ? 1 : 0)) {
                                    e.B();
                                    System.out.println(l[ll[200]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] nArray92 = new int[ll[4]];
                            nArray92[e.ll[0]] = ll[96];
                            nArray92[e.ll[1]] = ll[197];
                            nArray92[e.ll[3]] = ll[198];
                            if (e.llIIl(k.c(nArray92) ? 1 : 0)) {
                                g.a(ll[96], ll[1]);
                                g.a(ll[197], ll[1]);
                                g.a(ll[198], ll[1]);
                            }
                        }
                    }
                    if (e.llIIl(Dialog.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)ll[1]);
                        0;
                        Dialog.close();
                    }
                }
            }
        }
    }

    private static String ll(String llllllIllIIllII, String llllllIllIIlIll) {
        try {
            SecretKeySpec llllllIllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIllIIlIll.getBytes(StandardCharsets.UTF_8)), ll[9]), "DES");
            Cipher llllllIllIlIIII = Cipher.getInstance("DES");
            llllllIllIlIIII.init(ll[3], llllllIllIlIIIl);
            return new String(llllllIllIlIIII.doFinal(Base64.getDecoder().decode(llllllIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIllIIllll) {
            llllllIllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lI(String llllllIlIlIlIIl, String llllllIlIlIlIII) {
        try {
            SecretKeySpec llllllIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIlIlIlIll = Cipher.getInstance("Blowfish");
            llllllIlIlIlIll.init(ll[3], llllllIlIlIllII);
            return new String(llllllIlIlIlIll.doFinal(Base64.getDecoder().decode(llllllIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIlIlIlIlI) {
            llllllIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llllI(Object object) {
        return object != null;
    }

    private static boolean lllll(int n2) {
        return n2 > 0;
    }

    private static String lIl(String llllllIlIlllllI, String llllllIlIlllIII) {
        llllllIlIlllllI = new String(Base64.getDecoder().decode(llllllIlIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIlIllllII = new StringBuilder();
        char[] llllllIlIlllIll = llllllIlIlllIII.toCharArray();
        int llllllIlIlllIlI = ll[0];
        char[] llllllIlIllIlII = llllllIlIlllllI.toCharArray();
        int llllllIlIllIIll = llllllIlIllIlII.length;
        int llllllIlIllIIlI = ll[0];
        while (e.llIll(llllllIlIllIIlI, llllllIlIllIIll)) {
            char llllllIlIllllll = llllllIlIllIlII[llllllIlIllIIlI];
            llllllIlIllllII.append((char)(llllllIlIllllll ^ llllllIlIlllIll[llllllIlIlllIlI % llllllIlIlllIll.length]));
            0;
            ++llllllIlIlllIlI;
            ++llllllIlIllIIlI;
            0;
            if (1 >= -1) continue;
            return null;
        }
        return String.valueOf(llllllIlIllllII);
    }
}

