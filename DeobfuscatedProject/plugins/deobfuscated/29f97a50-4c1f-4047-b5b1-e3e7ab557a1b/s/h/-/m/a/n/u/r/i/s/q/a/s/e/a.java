/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.b;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

@Singleton
public class a {
    public static final /* synthetic */ List<String> q;
    private static final /* synthetic */ List<String> t;
    private static /* synthetic */ int[] lIIllIIIllIlI;
    private static final /* synthetic */ HashMap<String, Integer> s;
    private /* synthetic */ boolean u;
    private final /* synthetic */ SquireShamanConfig w;
    private static /* synthetic */ String[] lIIllIIIlIlII;
    private final /* synthetic */ c v;
    public static final /* synthetic */ List<String> r;

    private static boolean lIlIllllIlIIllI(int n2) {
        return n2 != 0;
    }

    public boolean a(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = s.get(item.getName()) * item.getQuantity();
        if (a.lIlIllllIlIIIll(n3, n2 = s.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = lIIllIIIllIlI[0];
            0;
            if (-1 >= 1) {
                return ((0x16 ^ 0x5F) & ~(0xD7 ^ 0x9E)) != 0;
            }
        } else {
            bl = lIIllIIIllIlI[1];
        }
        return bl;
    }

    private static boolean lIlIllllIlIIlII(int n2) {
        return n2 == 0;
    }

    private static String lIlIllllIIIlIlI(String llllllllllllllIllllIIIllIIIlllII, String llllllllllllllIllllIIIllIIIlllIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIllIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIllIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIIllIIIllIlI[9]), "DES");
            Cipher llllllllllllllIllllIIIllIIlIIIII = Cipher.getInstance("DES");
            llllllllllllllIllllIIIllIIlIIIII.init(lIIllIIIllIlI[3], llllllllllllllIllllIIIllIIlIIIIl);
            return new String(llllllllllllllIllllIIIllIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIllIIIlllll) {
            llllllllllllllIllllIIIllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static String lIlIllllIIIlIIl(String llllllllllllllIllllIIIllIIlIlllI, String llllllllllllllIllllIIIllIIllIIlI) {
        llllllllllllllIllllIIIllIIlIlllI = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIllIIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIllIIllIIIl = new StringBuilder();
        char[] llllllllllllllIllllIIIllIIllIIII = llllllllllllllIllllIIIllIIllIIlI.toCharArray();
        int llllllllllllllIllllIIIllIIlIllll = lIIllIIIllIlI[1];
        char[] llllllllllllllIllllIIIllIIlIlIIl = llllllllllllllIllllIIIllIIlIlllI.toCharArray();
        int llllllllllllllIllllIIIllIIlIlIII = llllllllllllllIllllIIIllIIlIlIIl.length;
        int llllllllllllllIllllIIIllIIlIIlll = lIIllIIIllIlI[1];
        while (a.lIlIllllIlIIIll(llllllllllllllIllllIIIllIIlIIlll, llllllllllllllIllllIIIllIIlIlIII)) {
            char llllllllllllllIllllIIIllIIllIlII = llllllllllllllIllllIIIllIIlIlIIl[llllllllllllllIllllIIIllIIlIIlll];
            llllllllllllllIllllIIIllIIllIIIl.append((char)(llllllllllllllIllllIIIllIIllIlII ^ llllllllllllllIllllIIIllIIllIIII[llllllllllllllIllllIIIllIIlIllll % llllllllllllllIllllIIIllIIllIIII.length]));
            0;
            ++llllllllllllllIllllIIIllIIlIllll;
            ++llllllllllllllIllllIIIllIIlIIlll;
            0;
            if (((0xB7 ^ 0xBF) & ~(1 ^ 9)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIllIIllIIIl);
    }

    private static void lIlIllllIlIIIlI() {
        lIIllIIIllIlI = new int[156];
        a.lIIllIIIllIlI[0] = 1;
        a.lIIllIIIllIlI[1] = (67 + 139 - 77 + 25 ^ 44 + 58 - 13 + 57) & (0x5D ^ 0x3E ^ (0x60 ^ 0xB) ^ -1);
        a.lIIllIIIllIlI[2] = 38 + 40 - 47 + 134 ^ 167 + 90 - 200 + 111;
        a.lIIllIIIllIlI[3] = 2;
        a.lIIllIIIllIlI[4] = 3;
        a.lIIllIIIllIlI[5] = 160 + 71 - 214 + 172 ^ 91 + 36 - 95 + 153;
        a.lIIllIIIllIlI[6] = 0x30 ^ 8 ^ (0x7E ^ 0x43);
        a.lIIllIIIllIlI[7] = 0x87 ^ 0x81;
        a.lIIllIIIllIlI[8] = 0x7C ^ 0x7B;
        a.lIIllIIIllIlI[9] = 0xA2 ^ 0xAA;
        a.lIIllIIIllIlI[10] = 0x3F ^ 0x36;
        a.lIIllIIIllIlI[11] = 0x6F ^ 0x65;
        a.lIIllIIIllIlI[12] = 99 + 121 - 188 + 144 ^ 113 + 82 - 127 + 119;
        a.lIIllIIIllIlI[13] = 0x32 ^ 0x3E;
        a.lIIllIIIllIlI[14] = 0xA8 ^ 0xB8 ^ (0x20 ^ 0x3E);
        a.lIIllIIIllIlI[15] = (0x5F ^ 0x78) + (0x57 ^ 0xD) - (0x43 ^ 0x46) + (0 ^ 0xD);
        a.lIIllIIIllIlI[16] = 0x6D ^ 0x62;
        a.lIIllIIIllIlI[17] = 0x99 ^ 0x89;
        a.lIIllIIIllIlI[18] = 0x1C ^ 0xD;
        a.lIIllIIIllIlI[19] = 0xBC ^ 0xAE;
        a.lIIllIIIllIlI[20] = 0x65 ^ 0x79 ^ (0x28 ^ 0x27);
        a.lIIllIIIllIlI[21] = 0x72 ^ 0x66;
        a.lIIllIIIllIlI[22] = 0xF8 ^ 0x82 ^ (0x29 ^ 0x46);
        a.lIIllIIIllIlI[23] = 0x68 ^ 0x7E;
        a.lIIllIIIllIlI[24] = 3 ^ 0x14;
        a.lIIllIIIllIlI[25] = 0x66 ^ 0x21 ^ (0x48 ^ 0x17);
        a.lIIllIIIllIlI[26] = 0x74 ^ 0x5C ^ (0x7A ^ 0x4B);
        a.lIIllIIIllIlI[27] = 0x86 ^ 0xBC ^ (0x1B ^ 0x3B);
        a.lIIllIIIllIlI[28] = 0x47 ^ 0x73 ^ (0x35 ^ 0x1A);
        a.lIIllIIIllIlI[29] = 0x92 ^ 0xC3 ^ (0xD2 ^ 0x9F);
        a.lIIllIIIllIlI[30] = 93 + 122 - 85 + 42 ^ 59 + 58 - 61 + 121;
        a.lIIllIIIllIlI[31] = 0x41 ^ 0x4F ^ (0x3E ^ 0x2E);
        a.lIIllIIIllIlI[32] = 0x6E ^ 0x71;
        a.lIIllIIIllIlI[33] = 0x2D ^ 0xD;
        a.lIIllIIIllIlI[34] = (0xDB ^ 0x8B) & ~(0xF7 ^ 0xA7) ^ (0xB0 ^ 0x91);
        a.lIIllIIIllIlI[35] = 3 ^ (0x32 ^ 0x13);
        a.lIIllIIIllIlI[36] = 111 + 121 - 86 + 26 ^ 133 + 56 - 165 + 119;
        a.lIIllIIIllIlI[37] = 6 + 40 - -8 + 132 ^ 107 + 122 - 110 + 39;
        a.lIIllIIIllIlI[38] = 85 + 123 - 136 + 84 ^ 125 + 16 - -24 + 20;
        a.lIIllIIIllIlI[39] = 0xE9 ^ 0x88 ^ (0xD ^ 0x4A);
        a.lIIllIIIllIlI[40] = 13 + 54 - -94 + 20 ^ 125 + 91 - 208 + 138;
        a.lIIllIIIllIlI[41] = 0x6D ^ 0x45;
        a.lIIllIIIllIlI[42] = 0xB2 ^ 0x9B;
        a.lIIllIIIllIlI[43] = 0xA6 ^ 0x8C;
        a.lIIllIIIllIlI[44] = 0xD8 ^ 0x96 ^ (0x6C ^ 9);
        a.lIIllIIIllIlI[45] = 0xEA ^ 0xC6;
        a.lIIllIIIllIlI[46] = 0x6C ^ 0x41;
        a.lIIllIIIllIlI[47] = 0xF1 ^ 0xB7 ^ (0xD3 ^ 0xBB);
        a.lIIllIIIllIlI[48] = 0x9E ^ 0xB1;
        a.lIIllIIIllIlI[49] = 39 + 95 - 128 + 167 ^ 96 + 10 - 12 + 63;
        a.lIIllIIIllIlI[50] = 0x31 ^ 0;
        a.lIIllIIIllIlI[51] = 43 + 83 - 14 + 26 ^ 136 + 78 - 154 + 124;
        a.lIIllIIIllIlI[52] = 0x4F ^ 0x7C;
        a.lIIllIIIllIlI[53] = 139 + 18 - 131 + 129 ^ 144 + 164 - 252 + 119;
        a.lIIllIIIllIlI[54] = 68 + 54 - -1 + 41 ^ 58 + 59 - -1 + 27;
        a.lIIllIIIllIlI[55] = 86 + 179 - 239 + 215 ^ 18 + 107 - 82 + 156;
        a.lIIllIIIllIlI[56] = 0x85 ^ 0xB2;
        a.lIIllIIIllIlI[57] = 0x73 ^ 0x75 ^ (0x3E ^ 0);
        a.lIIllIIIllIlI[58] = 94 + 20 - -11 + 10 ^ 71 + 102 - 72 + 89;
        a.lIIllIIIllIlI[59] = 0x4E ^ 9 ^ (0xE4 ^ 0x99);
        a.lIIllIIIllIlI[60] = 0x33 ^ 8;
        a.lIIllIIIllIlI[61] = 0x2C ^ 0x10;
        a.lIIllIIIllIlI[62] = 0xAA ^ 0xB9 ^ (0x37 ^ 0x19);
        a.lIIllIIIllIlI[63] = 0xA3 ^ 0x9D;
        a.lIIllIIIllIlI[64] = 66 + 126 - 51 + 31 ^ 67 + 25 - -25 + 30;
        a.lIIllIIIllIlI[65] = 0x1F ^ 0x5F;
        a.lIIllIIIllIlI[66] = 0x5E ^ 0x1F;
        a.lIIllIIIllIlI[67] = 0x27 ^ 0x65;
        a.lIIllIIIllIlI[68] = 0x4D ^ 0x63 ^ (0x4D ^ 0x20);
        a.lIIllIIIllIlI[69] = 0x41 ^ 0x24 ^ (0xA8 ^ 0x89);
        a.lIIllIIIllIlI[70] = 0x1B ^ 0x13 ^ (0xF9 ^ 0xB4);
        a.lIIllIIIllIlI[71] = 2 ^ 0x44;
        a.lIIllIIIllIlI[72] = 203 + 169 - 230 + 110 ^ 124 + 90 - 103 + 76;
        a.lIIllIIIllIlI[73] = 0x53 ^ 0x78 ^ (0x31 ^ 0x52);
        a.lIIllIIIllIlI[74] = 0x96 ^ 0x8D ^ (0x40 ^ 0x12);
        a.lIIllIIIllIlI[75] = 0x1E ^ 0x54;
        a.lIIllIIIllIlI[76] = 0x74 ^ 0x3F;
        a.lIIllIIIllIlI[77] = 0xCB ^ 0xB6 ^ (0x99 ^ 0xA8);
        a.lIIllIIIllIlI[78] = 0x72 ^ 0x74 ^ (0xD5 ^ 0x9E);
        a.lIIllIIIllIlI[79] = 0x4E ^ 0;
        a.lIIllIIIllIlI[80] = 0x16 ^ 0x74 ^ (0xAD ^ 0x80);
        a.lIIllIIIllIlI[81] = 0x13 ^ 0x20 ^ (0x5D ^ 0x3E);
        a.lIIllIIIllIlI[82] = 0x90 ^ 0xC1;
        a.lIIllIIIllIlI[83] = 2 ^ 0x54 ^ (0x2B ^ 0x2F);
        a.lIIllIIIllIlI[84] = 0x13 ^ 0x17 ^ (4 ^ 0x53);
        a.lIIllIIIllIlI[85] = 0x5D ^ 9;
        a.lIIllIIIllIlI[86] = 0x5C ^ 9;
        a.lIIllIIIllIlI[87] = 0xC3 ^ 0x95;
        a.lIIllIIIllIlI[88] = 0xC0 ^ 0x97;
        a.lIIllIIIllIlI[89] = 55 + 97 - 15 + 76 ^ 122 + 56 - 119 + 82;
        a.lIIllIIIllIlI[90] = 39 + 168 - 140 + 132 ^ 1 + 112 - 32 + 77;
        a.lIIllIIIllIlI[91] = 0xEC ^ 0xB6;
        a.lIIllIIIllIlI[92] = 145 + 51 - 177 + 139 ^ 185 + 119 - 167 + 60;
        a.lIIllIIIllIlI[93] = 0xC2 ^ 0x9E;
        a.lIIllIIIllIlI[94] = 0x4B ^ 0x71 ^ (0xCE ^ 0xA9);
        a.lIIllIIIllIlI[95] = 0x34 ^ 0x73 ^ (0x4C ^ 0x55);
        a.lIIllIIIllIlI[96] = 0x12 ^ 0x4D;
        a.lIIllIIIllIlI[97] = 0x37 ^ 0x57;
        a.lIIllIIIllIlI[98] = 0x3C ^ 0x32 ^ (0x39 ^ 0x56);
        a.lIIllIIIllIlI[99] = 1 ^ (0xDB ^ 0xB8);
        a.lIIllIIIllIlI[100] = 0x43 ^ 0x6D ^ (0xCB ^ 0x86);
        a.lIIllIIIllIlI[101] = 0x5F ^ 0x24 ^ (0x89 ^ 0x96);
        a.lIIllIIIllIlI[102] = 0x4D ^ 0x28;
        a.lIIllIIIllIlI[103] = 0xF1 ^ 0xC2 ^ (0x16 ^ 0x43);
        a.lIIllIIIllIlI[104] = 0x36 ^ 0x51;
        a.lIIllIIIllIlI[105] = 165 + 119 - 96 + 42 ^ 109 + 30 - 77 + 80;
        a.lIIllIIIllIlI[106] = 0x50 ^ 0x68 ^ (0x40 ^ 0x11);
        a.lIIllIIIllIlI[107] = 0x62 ^ 0x5E ^ (0xC2 ^ 0x94);
        a.lIIllIIIllIlI[108] = 0xF6 ^ 0x9D;
        a.lIIllIIIllIlI[109] = 0xB3 ^ 0xC1 ^ (0x45 ^ 0x5B);
        a.lIIllIIIllIlI[110] = 0x7E ^ 0x13;
        a.lIIllIIIllIlI[111] = 0x59 ^ 0x37;
        a.lIIllIIIllIlI[112] = (0x10 ^ 0x51) & ~(0x34 ^ 0x75) ^ (0x29 ^ 0x46);
        a.lIIllIIIllIlI[113] = 0x25 ^ 0x55;
        a.lIIllIIIllIlI[114] = 0x44 ^ 0x6B ^ (0x99 ^ 0xC7);
        a.lIIllIIIllIlI[115] = 0x40 ^ 0x32;
        a.lIIllIIIllIlI[116] = 4 ^ 0x75 ^ 2;
        a.lIIllIIIllIlI[117] = 0xB1 ^ 0xC5;
        a.lIIllIIIllIlI[118] = 43 + 23 - -90 + 24 ^ 57 + 25 - 72 + 183;
        a.lIIllIIIllIlI[119] = 0x73 ^ 0x23 ^ (0xD ^ 0x2B);
        a.lIIllIIIllIlI[120] = 120 + 207 - 197 + 78 ^ 0 + 53 - -47 + 67;
        a.lIIllIIIllIlI[121] = 0xBD ^ 0xC5;
        a.lIIllIIIllIlI[122] = 0xCC ^ 0xB5;
        a.lIIllIIIllIlI[123] = 0x49 ^ 0x33;
        a.lIIllIIIllIlI[124] = 0x55 ^ 0x2E;
        a.lIIllIIIllIlI[125] = 34 + 170 - 130 + 140 ^ 58 + 150 - 87 + 49;
        a.lIIllIIIllIlI[126] = 0x73 ^ 0xE;
        a.lIIllIIIllIlI[127] = 0x6B ^ 0x15;
        a.lIIllIIIllIlI[128] = 10 + 27 - -16 + 74;
        a.lIIllIIIllIlI[129] = 78 + 125 - 202 + 127;
        a.lIIllIIIllIlI[130] = 87 + 36 - 83 + 89;
        a.lIIllIIIllIlI[131] = (0x2D ^ 0x29) + (65 + 31 - 8 + 40) - (0x50 ^ 0x5C) + (0x20 ^ 0x2A);
        a.lIIllIIIllIlI[132] = 15 + 91 - 74 + 95 + (2 ^ 0x10) - (0xB7 ^ 0x9A) + (0x5D ^ 0x42);
        a.lIIllIIIllIlI[133] = 69 + 116 - 155 + 102;
        a.lIIllIIIllIlI[134] = (0x54 ^ 0x1A) + (0xE ^ 0x4A) - (0x4C ^ 9) + (0x7E ^ 0x46);
        a.lIIllIIIllIlI[135] = (0x23 ^ 0x6D) + (0x45 ^ 0x64) - (0xFE ^ 0xA1) + (0x37 ^ 0x41);
        a.lIIllIIIllIlI[136] = 3 + (0x5D ^ 0x74) - -(0x58 ^ 0x1C) + (0x98 ^ 0x8F);
        a.lIIllIIIllIlI[137] = 18 + 91 - -5 + 22;
        a.lIIllIIIllIlI[138] = (0x3D ^ 0x35) + (0 ^ 0x61) - -(0xA7 ^ 0xBF) + (0xE ^ 7);
        a.lIIllIIIllIlI[139] = (0x8B ^ 0x91) + (0xE2 ^ 0xB2) - (0x4C ^ 3) + (0x2B ^ 0x5B);
        a.lIIllIIIllIlI[140] = (0xF ^ 0x5F) + (0xC ^ 0x26) - (0x7C ^ 0x16) + (0xDE ^ 0xA2);
        a.lIIllIIIllIlI[141] = 20 + 27 - -80 + 14;
        a.lIIllIIIllIlI[142] = 63 + 94 - 115 + 100;
        a.lIIllIIIllIlI[143] = (0xD3 ^ 0x8B) + (0x8D ^ 0xB7) - (0x6A ^ 0x7A) + (0xD ^ 0);
        a.lIIllIIIllIlI[144] = 17 + 4 - -26 + 97;
        a.lIIllIIIllIlI[145] = 140 + 44 - 100 + 61;
        a.lIIllIIIllIlI[146] = 53 + 87 - 128 + 134;
        a.lIIllIIIllIlI[147] = (0x2A ^ 0x7B) + (0x26 ^ 0xD) - (0xCB ^ 0xB1) + (17 + 128 - 133 + 133);
        a.lIIllIIIllIlI[148] = 40 + 145 - 127 + 90;
        a.lIIllIIIllIlI[149] = 127 + 4 - 33 + 51;
        a.lIIllIIIllIlI[150] = 40 + 103 - 34 + 41;
        a.lIIllIIIllIlI[151] = 102 + 74 - 63 + 38;
        a.lIIllIIIllIlI[152] = (0x17 ^ 3) + (7 ^ 0x37) - (0x53 ^ 0x71) + (0x31 ^ 0x47);
        a.lIIllIIIllIlI[153] = (0x40 ^ 0x11) + (0x3E ^ 0x6B) - (0xC ^ 0x6B) + (0x74 ^ 0x2E);
        a.lIIllIIIllIlI[154] = 122 + 150 - 206 + 88;
        a.lIIllIIIllIlI[155] = (0x7F ^ 0x2A) + (0x37 ^ 0x7D) - (21 + 56 - -11 + 58) + (9 + 85 - 41 + 89);
    }

    private static void lIlIllllIlIIIIl() {
        lIIllIIIlIlII = new String[lIIllIIIllIlI[155]];
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[1]] = a."Coins";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[0]] = a."Lizardman shaman";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[3]] = a."Rune platebody";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[4]] = a."Rune 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[5]] = a."Rune longsword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[6]] = a."Rune pickaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[7]] = a."Rune kiteshield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[8]] = a."Rune med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[9]] = a."Mystic earth staff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[10]] = a."Rune chainbody";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[11]] = a."Rune warhammer";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[12]] = a."Earth battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[13]] = a."Rune battleaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[2]] = a."Rune sq shield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[14]] = a."Dragon med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[16]] = a."Brimstone key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[17]] = a."Broad arrows";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[18]] = a."Mystic earth staff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[19]] = a."Earth battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[20]] = a."Rune med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[21]] = a."Rune chainbody";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[22]] = a."Rune warhammer";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[23]] = a."Dragon warhammer";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[24]] = a."Iron ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[25]] = a."Coal";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[26]] = a."Runite ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[27]] = a."Grimy kwuarm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[28]] = a."Grimy dwarf weed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[29]] = a."Grimy lantadyme";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[30]] = a."Grimy cadantine";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[31]] = a."Ranarr seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[32]] = a."Snapdragon seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[33]] = a."Torstol seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[34]] = a."Maple seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[35]] = a."Yew seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[36]] = a."Magic seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[37]] = a."Celastrus seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[38]] = a."Onyx bolt tips";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[39]] = a."Magic logs";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[40]] = a."Redwood tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[41]] = a."Dragonfruit tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[42]] = a."Chaos rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[43]] = a."Death rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[44]] = a."Uncut ruby";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[45]] = a."Uncut diamond";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[46]] = a."Chilli potato";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[47]] = a."Loop half of key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[48]] = a."Tooth half of key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[49]] = a."Diamond bolts (e)";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[50]] = a."Runite bar";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[51]] = a."Nature rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[52]] = a."Rune 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[53]] = a."Rune battleaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[54]] = a."Law rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[55]] = a."Rune 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[56]] = a."Blood rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[57]] = a."Rune sq shield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[58]] = a."Dragonstone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[59]] = a."Silver ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[60]] = a."Coins";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[61]] = a."Treasonous ring";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[62]] = a."Rune pickaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[63]] = a."Rune knife";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[64]] = a."Rune kiteshield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[65]] = a."Dragon med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[66]] = a."Rune spear";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[67]] = a."Shield left half";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[68]] = a."Dragon spear";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[69]] = a."Uncut diamond";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[70]] = a."Ring of wealth";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[71]] = a."Skills necklace";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[72]] = a."Mahogany seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[73]] = a."Palm tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[74]] = a."Dragon pickaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[75]] = a."Dragon 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[76]] = a."Red spiders' eggs";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[77]] = a."Unicorn horn";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[78]] = a."Uncut dragonstone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[79]] = a."Grimy snapdragon";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[80]] = a."Supercompost";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[81]] = a."Cannonball";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[82]] = a."Mysterious emblem";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[83]] = a."Tanzanite fang";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[84]] = a."Magic fang";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[85]] = a."Serpentine visage";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[86]] = a."Uncut onyx";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[87]] = a."Dragon med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[88]] = a."Dragon halberd";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[89]] = a."Law rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[90]] = a."Pure essence";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[91]] = a."Toadflax";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[92]] = a."Snapdragon";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[93]] = a."Dwarf weed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[94]] = a."Torstol";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[95]] = a."Flax";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[96]] = a."Snakeskin";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[97]] = a."Dragonstone bolt tips";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[98]] = a."Yew logs";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[99]] = a."Mahogany logs";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[100]] = a."Coal";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[101]] = a."Runite ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[102]] = a."Calquat tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[103]] = a."Palm tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[104]] = a."Papaya tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[105]] = a."Magic seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[106]] = a."Toadflax seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[107]] = a."Snapdragon seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[108]] = a."Dwarf weed seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[109]] = a."Torstol seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[110]] = a."Crystal seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[111]] = a."Dragon bones";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[112]] = a."Coconut";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[113]] = a."Grapes";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[114]] = a."Battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[115]] = a."Manta ray";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[116]] = a."Swamp tar";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[117]] = a."Crushed nest";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[118]] = a."Adamantite bar";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[119]] = a."Uncut sapphire";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[120]] = a."Uncut emerald";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[121]] = a."Uncut ruby";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[122]] = a."Chaos talisman";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[123]] = a."Uncut diamond";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[124]] = a."Rune javelin";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[125]] = a."Loop half of key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[126]] = a."Tooth half of key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[127]] = a."Rune spear";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[128]] = a."Shield left half";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[129]] = a."Dragon spear";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[130]] = a."Runite bar";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[131]] = a."Dragonstone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[132]] = a."Silver ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[133]] = a."Rune kiteshield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[134]] = a."Rune sq shield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[135]] = a."Rune battleaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[136]] = a."Rune 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[137]] = a."Nature rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[15]] = a."Steel arrow";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[138]] = a."Rune arrow";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[139]] = a."Adamant javelin";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[140]] = a."Rune javelin";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[141]] = a."Jar of swamp";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[142]] = a."Lizardman fang";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[143]] = a."Red d'hide vamb";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[144]] = a."Xeric's talisman (inert)";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[145]] = a."Ancient shard";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[146]] = a."Eternal gem";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[147]] = a."Imbued heart";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[148]] = a."Mist battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[149]] = a."Dust battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[150]] = a."Long bone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[151]] = a."Curved bone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[152]] = a."Long bone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[153]] = a."Curved bone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[154]] = a."Chilli potato";
    }

    public boolean m() {
        return this.u;
    }

    private static String lIlIllllIIIIlIl(String llllllllllllllIllllIIIllIIIIllll, String llllllllllllllIllllIIIllIIIlIIII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIllIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIllIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIllIIIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIllIIIlIIll.init(lIIllIIIllIlI[3], llllllllllllllIllllIIIllIIIlIlII);
            return new String(llllllllllllllIllllIIIllIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIllIIIlIIlI) {
            llllllllllllllIllllIIIllIIIlIIlI.printStackTrace();
            return null;
        }
    }

    static {
        a.lIlIllllIlIIIlI();
        a.lIlIllllIlIIIIl();
        String[] stringArray = new String[lIIllIIIllIlI[2]];
        stringArray[a.lIIllIIIllIlI[1]] = lIIllIIIlIlII[lIIllIIIllIlI[3]];
        stringArray[a.lIIllIIIllIlI[0]] = lIIllIIIlIlII[lIIllIIIllIlI[4]];
        stringArray[a.lIIllIIIllIlI[3]] = lIIllIIIlIlII[lIIllIIIllIlI[5]];
        stringArray[a.lIIllIIIllIlI[4]] = lIIllIIIlIlII[lIIllIIIllIlI[6]];
        stringArray[a.lIIllIIIllIlI[5]] = lIIllIIIlIlII[lIIllIIIllIlI[7]];
        stringArray[a.lIIllIIIllIlI[6]] = lIIllIIIlIlII[lIIllIIIllIlI[8]];
        stringArray[a.lIIllIIIllIlI[7]] = lIIllIIIlIlII[lIIllIIIllIlI[9]];
        stringArray[a.lIIllIIIllIlI[8]] = lIIllIIIlIlII[lIIllIIIllIlI[10]];
        stringArray[a.lIIllIIIllIlI[9]] = lIIllIIIlIlII[lIIllIIIllIlI[11]];
        stringArray[a.lIIllIIIllIlI[10]] = lIIllIIIlIlII[lIIllIIIllIlI[12]];
        stringArray[a.lIIllIIIllIlI[11]] = lIIllIIIlIlII[lIIllIIIllIlI[13]];
        stringArray[a.lIIllIIIllIlI[12]] = lIIllIIIlIlII[lIIllIIIllIlI[2]];
        stringArray[a.lIIllIIIllIlI[13]] = lIIllIIIlIlII[lIIllIIIllIlI[14]];
        q = List.of(stringArray);
        String[] stringArray2 = new String[lIIllIIIllIlI[15]];
        stringArray2[a.lIIllIIIllIlI[1]] = lIIllIIIlIlII[lIIllIIIllIlI[16]];
        stringArray2[a.lIIllIIIllIlI[0]] = lIIllIIIlIlII[lIIllIIIllIlI[17]];
        stringArray2[a.lIIllIIIllIlI[3]] = lIIllIIIlIlII[lIIllIIIllIlI[18]];
        stringArray2[a.lIIllIIIllIlI[4]] = lIIllIIIlIlII[lIIllIIIllIlI[19]];
        stringArray2[a.lIIllIIIllIlI[5]] = lIIllIIIlIlII[lIIllIIIllIlI[20]];
        stringArray2[a.lIIllIIIllIlI[6]] = lIIllIIIlIlII[lIIllIIIllIlI[21]];
        stringArray2[a.lIIllIIIllIlI[7]] = lIIllIIIlIlII[lIIllIIIllIlI[22]];
        stringArray2[a.lIIllIIIllIlI[8]] = lIIllIIIlIlII[lIIllIIIllIlI[23]];
        stringArray2[a.lIIllIIIllIlI[9]] = lIIllIIIlIlII[lIIllIIIllIlI[24]];
        stringArray2[a.lIIllIIIllIlI[10]] = lIIllIIIlIlII[lIIllIIIllIlI[25]];
        stringArray2[a.lIIllIIIllIlI[11]] = lIIllIIIlIlII[lIIllIIIllIlI[26]];
        stringArray2[a.lIIllIIIllIlI[12]] = lIIllIIIlIlII[lIIllIIIllIlI[27]];
        stringArray2[a.lIIllIIIllIlI[13]] = lIIllIIIlIlII[lIIllIIIllIlI[28]];
        stringArray2[a.lIIllIIIllIlI[2]] = lIIllIIIlIlII[lIIllIIIllIlI[29]];
        stringArray2[a.lIIllIIIllIlI[14]] = lIIllIIIlIlII[lIIllIIIllIlI[30]];
        stringArray2[a.lIIllIIIllIlI[16]] = lIIllIIIlIlII[lIIllIIIllIlI[31]];
        stringArray2[a.lIIllIIIllIlI[17]] = lIIllIIIlIlII[lIIllIIIllIlI[32]];
        stringArray2[a.lIIllIIIllIlI[18]] = lIIllIIIlIlII[lIIllIIIllIlI[33]];
        stringArray2[a.lIIllIIIllIlI[19]] = lIIllIIIlIlII[lIIllIIIllIlI[34]];
        stringArray2[a.lIIllIIIllIlI[20]] = lIIllIIIlIlII[lIIllIIIllIlI[35]];
        stringArray2[a.lIIllIIIllIlI[21]] = lIIllIIIlIlII[lIIllIIIllIlI[36]];
        stringArray2[a.lIIllIIIllIlI[22]] = lIIllIIIlIlII[lIIllIIIllIlI[37]];
        stringArray2[a.lIIllIIIllIlI[23]] = lIIllIIIlIlII[lIIllIIIllIlI[38]];
        stringArray2[a.lIIllIIIllIlI[24]] = lIIllIIIlIlII[lIIllIIIllIlI[39]];
        stringArray2[a.lIIllIIIllIlI[25]] = lIIllIIIlIlII[lIIllIIIllIlI[40]];
        stringArray2[a.lIIllIIIllIlI[26]] = lIIllIIIlIlII[lIIllIIIllIlI[41]];
        stringArray2[a.lIIllIIIllIlI[27]] = lIIllIIIlIlII[lIIllIIIllIlI[42]];
        stringArray2[a.lIIllIIIllIlI[28]] = lIIllIIIlIlII[lIIllIIIllIlI[43]];
        stringArray2[a.lIIllIIIllIlI[29]] = lIIllIIIlIlII[lIIllIIIllIlI[44]];
        stringArray2[a.lIIllIIIllIlI[30]] = lIIllIIIlIlII[lIIllIIIllIlI[45]];
        stringArray2[a.lIIllIIIllIlI[31]] = lIIllIIIlIlII[lIIllIIIllIlI[46]];
        stringArray2[a.lIIllIIIllIlI[32]] = lIIllIIIlIlII[lIIllIIIllIlI[47]];
        stringArray2[a.lIIllIIIllIlI[33]] = lIIllIIIlIlII[lIIllIIIllIlI[48]];
        stringArray2[a.lIIllIIIllIlI[34]] = lIIllIIIlIlII[lIIllIIIllIlI[49]];
        stringArray2[a.lIIllIIIllIlI[35]] = lIIllIIIlIlII[lIIllIIIllIlI[50]];
        stringArray2[a.lIIllIIIllIlI[36]] = lIIllIIIlIlII[lIIllIIIllIlI[51]];
        stringArray2[a.lIIllIIIllIlI[37]] = lIIllIIIlIlII[lIIllIIIllIlI[52]];
        stringArray2[a.lIIllIIIllIlI[38]] = lIIllIIIlIlII[lIIllIIIllIlI[53]];
        stringArray2[a.lIIllIIIllIlI[39]] = lIIllIIIlIlII[lIIllIIIllIlI[54]];
        stringArray2[a.lIIllIIIllIlI[40]] = lIIllIIIlIlII[lIIllIIIllIlI[55]];
        stringArray2[a.lIIllIIIllIlI[41]] = lIIllIIIlIlII[lIIllIIIllIlI[56]];
        stringArray2[a.lIIllIIIllIlI[42]] = lIIllIIIlIlII[lIIllIIIllIlI[57]];
        stringArray2[a.lIIllIIIllIlI[43]] = lIIllIIIlIlII[lIIllIIIllIlI[58]];
        stringArray2[a.lIIllIIIllIlI[44]] = lIIllIIIlIlII[lIIllIIIllIlI[59]];
        stringArray2[a.lIIllIIIllIlI[45]] = lIIllIIIlIlII[lIIllIIIllIlI[60]];
        stringArray2[a.lIIllIIIllIlI[46]] = lIIllIIIlIlII[lIIllIIIllIlI[61]];
        stringArray2[a.lIIllIIIllIlI[47]] = lIIllIIIlIlII[lIIllIIIllIlI[62]];
        stringArray2[a.lIIllIIIllIlI[48]] = lIIllIIIlIlII[lIIllIIIllIlI[63]];
        stringArray2[a.lIIllIIIllIlI[49]] = lIIllIIIlIlII[lIIllIIIllIlI[64]];
        stringArray2[a.lIIllIIIllIlI[50]] = lIIllIIIlIlII[lIIllIIIllIlI[65]];
        stringArray2[a.lIIllIIIllIlI[51]] = lIIllIIIlIlII[lIIllIIIllIlI[66]];
        stringArray2[a.lIIllIIIllIlI[52]] = lIIllIIIlIlII[lIIllIIIllIlI[67]];
        stringArray2[a.lIIllIIIllIlI[53]] = lIIllIIIlIlII[lIIllIIIllIlI[68]];
        stringArray2[a.lIIllIIIllIlI[54]] = lIIllIIIlIlII[lIIllIIIllIlI[69]];
        stringArray2[a.lIIllIIIllIlI[55]] = lIIllIIIlIlII[lIIllIIIllIlI[70]];
        stringArray2[a.lIIllIIIllIlI[56]] = lIIllIIIlIlII[lIIllIIIllIlI[71]];
        stringArray2[a.lIIllIIIllIlI[57]] = lIIllIIIlIlII[lIIllIIIllIlI[72]];
        stringArray2[a.lIIllIIIllIlI[58]] = lIIllIIIlIlII[lIIllIIIllIlI[73]];
        stringArray2[a.lIIllIIIllIlI[59]] = lIIllIIIlIlII[lIIllIIIllIlI[74]];
        stringArray2[a.lIIllIIIllIlI[60]] = lIIllIIIlIlII[lIIllIIIllIlI[75]];
        stringArray2[a.lIIllIIIllIlI[61]] = lIIllIIIlIlII[lIIllIIIllIlI[76]];
        stringArray2[a.lIIllIIIllIlI[62]] = lIIllIIIlIlII[lIIllIIIllIlI[77]];
        stringArray2[a.lIIllIIIllIlI[63]] = lIIllIIIlIlII[lIIllIIIllIlI[78]];
        stringArray2[a.lIIllIIIllIlI[64]] = lIIllIIIlIlII[lIIllIIIllIlI[79]];
        stringArray2[a.lIIllIIIllIlI[65]] = lIIllIIIlIlII[lIIllIIIllIlI[80]];
        stringArray2[a.lIIllIIIllIlI[66]] = lIIllIIIlIlII[lIIllIIIllIlI[81]];
        stringArray2[a.lIIllIIIllIlI[67]] = lIIllIIIlIlII[lIIllIIIllIlI[82]];
        stringArray2[a.lIIllIIIllIlI[68]] = lIIllIIIlIlII[lIIllIIIllIlI[83]];
        stringArray2[a.lIIllIIIllIlI[69]] = lIIllIIIlIlII[lIIllIIIllIlI[84]];
        stringArray2[a.lIIllIIIllIlI[70]] = lIIllIIIlIlII[lIIllIIIllIlI[85]];
        stringArray2[a.lIIllIIIllIlI[71]] = lIIllIIIlIlII[lIIllIIIllIlI[86]];
        stringArray2[a.lIIllIIIllIlI[72]] = lIIllIIIlIlII[lIIllIIIllIlI[87]];
        stringArray2[a.lIIllIIIllIlI[73]] = lIIllIIIlIlII[lIIllIIIllIlI[88]];
        stringArray2[a.lIIllIIIllIlI[74]] = lIIllIIIlIlII[lIIllIIIllIlI[89]];
        stringArray2[a.lIIllIIIllIlI[75]] = lIIllIIIlIlII[lIIllIIIllIlI[90]];
        stringArray2[a.lIIllIIIllIlI[76]] = lIIllIIIlIlII[lIIllIIIllIlI[91]];
        stringArray2[a.lIIllIIIllIlI[77]] = lIIllIIIlIlII[lIIllIIIllIlI[92]];
        stringArray2[a.lIIllIIIllIlI[78]] = lIIllIIIlIlII[lIIllIIIllIlI[93]];
        stringArray2[a.lIIllIIIllIlI[79]] = lIIllIIIlIlII[lIIllIIIllIlI[94]];
        stringArray2[a.lIIllIIIllIlI[80]] = lIIllIIIlIlII[lIIllIIIllIlI[95]];
        stringArray2[a.lIIllIIIllIlI[81]] = lIIllIIIlIlII[lIIllIIIllIlI[96]];
        stringArray2[a.lIIllIIIllIlI[82]] = lIIllIIIlIlII[lIIllIIIllIlI[97]];
        stringArray2[a.lIIllIIIllIlI[83]] = lIIllIIIlIlII[lIIllIIIllIlI[98]];
        stringArray2[a.lIIllIIIllIlI[84]] = lIIllIIIlIlII[lIIllIIIllIlI[99]];
        stringArray2[a.lIIllIIIllIlI[85]] = lIIllIIIlIlII[lIIllIIIllIlI[100]];
        stringArray2[a.lIIllIIIllIlI[86]] = lIIllIIIlIlII[lIIllIIIllIlI[101]];
        stringArray2[a.lIIllIIIllIlI[87]] = lIIllIIIlIlII[lIIllIIIllIlI[102]];
        stringArray2[a.lIIllIIIllIlI[88]] = lIIllIIIlIlII[lIIllIIIllIlI[103]];
        stringArray2[a.lIIllIIIllIlI[89]] = lIIllIIIlIlII[lIIllIIIllIlI[104]];
        stringArray2[a.lIIllIIIllIlI[90]] = lIIllIIIlIlII[lIIllIIIllIlI[105]];
        stringArray2[a.lIIllIIIllIlI[91]] = lIIllIIIlIlII[lIIllIIIllIlI[106]];
        stringArray2[a.lIIllIIIllIlI[92]] = lIIllIIIlIlII[lIIllIIIllIlI[107]];
        stringArray2[a.lIIllIIIllIlI[93]] = lIIllIIIlIlII[lIIllIIIllIlI[108]];
        stringArray2[a.lIIllIIIllIlI[94]] = lIIllIIIlIlII[lIIllIIIllIlI[109]];
        stringArray2[a.lIIllIIIllIlI[95]] = lIIllIIIlIlII[lIIllIIIllIlI[110]];
        stringArray2[a.lIIllIIIllIlI[96]] = lIIllIIIlIlII[lIIllIIIllIlI[111]];
        stringArray2[a.lIIllIIIllIlI[97]] = lIIllIIIlIlII[lIIllIIIllIlI[112]];
        stringArray2[a.lIIllIIIllIlI[98]] = lIIllIIIlIlII[lIIllIIIllIlI[113]];
        stringArray2[a.lIIllIIIllIlI[99]] = lIIllIIIlIlII[lIIllIIIllIlI[114]];
        stringArray2[a.lIIllIIIllIlI[100]] = lIIllIIIlIlII[lIIllIIIllIlI[115]];
        stringArray2[a.lIIllIIIllIlI[101]] = lIIllIIIlIlII[lIIllIIIllIlI[116]];
        stringArray2[a.lIIllIIIllIlI[102]] = lIIllIIIlIlII[lIIllIIIllIlI[117]];
        stringArray2[a.lIIllIIIllIlI[103]] = lIIllIIIlIlII[lIIllIIIllIlI[118]];
        stringArray2[a.lIIllIIIllIlI[104]] = lIIllIIIlIlII[lIIllIIIllIlI[119]];
        stringArray2[a.lIIllIIIllIlI[105]] = lIIllIIIlIlII[lIIllIIIllIlI[120]];
        stringArray2[a.lIIllIIIllIlI[106]] = lIIllIIIlIlII[lIIllIIIllIlI[121]];
        stringArray2[a.lIIllIIIllIlI[107]] = lIIllIIIlIlII[lIIllIIIllIlI[122]];
        stringArray2[a.lIIllIIIllIlI[108]] = lIIllIIIlIlII[lIIllIIIllIlI[123]];
        stringArray2[a.lIIllIIIllIlI[109]] = lIIllIIIlIlII[lIIllIIIllIlI[124]];
        stringArray2[a.lIIllIIIllIlI[110]] = lIIllIIIlIlII[lIIllIIIllIlI[125]];
        stringArray2[a.lIIllIIIllIlI[111]] = lIIllIIIlIlII[lIIllIIIllIlI[126]];
        stringArray2[a.lIIllIIIllIlI[112]] = lIIllIIIlIlII[lIIllIIIllIlI[127]];
        stringArray2[a.lIIllIIIllIlI[113]] = lIIllIIIlIlII[lIIllIIIllIlI[128]];
        stringArray2[a.lIIllIIIllIlI[114]] = lIIllIIIlIlII[lIIllIIIllIlI[129]];
        stringArray2[a.lIIllIIIllIlI[115]] = lIIllIIIlIlII[lIIllIIIllIlI[130]];
        stringArray2[a.lIIllIIIllIlI[116]] = lIIllIIIlIlII[lIIllIIIllIlI[131]];
        stringArray2[a.lIIllIIIllIlI[117]] = lIIllIIIlIlII[lIIllIIIllIlI[132]];
        stringArray2[a.lIIllIIIllIlI[118]] = lIIllIIIlIlII[lIIllIIIllIlI[133]];
        stringArray2[a.lIIllIIIllIlI[119]] = lIIllIIIlIlII[lIIllIIIllIlI[134]];
        stringArray2[a.lIIllIIIllIlI[120]] = lIIllIIIlIlII[lIIllIIIllIlI[135]];
        stringArray2[a.lIIllIIIllIlI[121]] = lIIllIIIlIlII[lIIllIIIllIlI[136]];
        stringArray2[a.lIIllIIIllIlI[122]] = lIIllIIIlIlII[lIIllIIIllIlI[137]];
        stringArray2[a.lIIllIIIllIlI[123]] = lIIllIIIlIlII[lIIllIIIllIlI[15]];
        stringArray2[a.lIIllIIIllIlI[124]] = lIIllIIIlIlII[lIIllIIIllIlI[138]];
        stringArray2[a.lIIllIIIllIlI[125]] = lIIllIIIlIlII[lIIllIIIllIlI[139]];
        stringArray2[a.lIIllIIIllIlI[126]] = lIIllIIIlIlII[lIIllIIIllIlI[140]];
        stringArray2[a.lIIllIIIllIlI[127]] = lIIllIIIlIlII[lIIllIIIllIlI[141]];
        stringArray2[a.lIIllIIIllIlI[128]] = lIIllIIIlIlII[lIIllIIIllIlI[142]];
        stringArray2[a.lIIllIIIllIlI[129]] = lIIllIIIlIlII[lIIllIIIllIlI[143]];
        stringArray2[a.lIIllIIIllIlI[130]] = lIIllIIIlIlII[lIIllIIIllIlI[144]];
        stringArray2[a.lIIllIIIllIlI[131]] = lIIllIIIlIlII[lIIllIIIllIlI[145]];
        stringArray2[a.lIIllIIIllIlI[132]] = lIIllIIIlIlII[lIIllIIIllIlI[146]];
        stringArray2[a.lIIllIIIllIlI[133]] = lIIllIIIlIlII[lIIllIIIllIlI[147]];
        stringArray2[a.lIIllIIIllIlI[134]] = lIIllIIIlIlII[lIIllIIIllIlI[148]];
        stringArray2[a.lIIllIIIllIlI[135]] = lIIllIIIlIlII[lIIllIIIllIlI[149]];
        stringArray2[a.lIIllIIIllIlI[136]] = lIIllIIIlIlII[lIIllIIIllIlI[150]];
        stringArray2[a.lIIllIIIllIlI[137]] = lIIllIIIlIlII[lIIllIIIllIlI[151]];
        r = Arrays.asList(stringArray2);
        s = new b();
        t = List.of(lIIllIIIlIlII[lIIllIIIllIlI[152]], lIIllIIIlIlII[lIIllIIIllIlI[153]], lIIllIIIlIlII[lIIllIIIllIlI[154]]);
    }

    public boolean a(TileItem tileItem) {
        return t.contains(tileItem.getName());
    }

    public void g(boolean bl) {
        this.u = bl;
    }

    private static boolean lIlIllllIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllllIlIIlIl(Object object) {
        return object != null;
    }

    public Optional<Item> l() {
        return Inventory.getAll(item -> {
            int n2;
            if (a.lIlIllllIlIIlIl(item.getName()) && a.lIlIllllIlIIllI(s.containsKey(item.getName()) ? 1 : 0)) {
                n2 = lIIllIIIllIlI[0];
                0;
                if ((91 + 55 - 94 + 90 ^ 104 + 69 - 69 + 34) == -1) {
                    return ((0x74 ^ 0x37 ^ (0x7F ^ 0x69)) & (139 + 79 - -3 + 0 ^ 69 + 11 - 21 + 77 ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIIIllIlI[1];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (a.lIlIllllIlIIlII(item.getName().equals(lIIllIIIlIlII[lIIllIIIllIlI[1]]) ? 1 : 0)) {
                bl = lIIllIIIllIlI[0];
                0;
                if (3 <= 0) {
                    return ((0x97 ^ 0xB4 ^ (0x7E ^ 0x41)) & (127 + 167 - 268 + 192 ^ 62 + 186 - 160 + 110 ^ -1)) != 0;
                }
            } else {
                bl = lIIllIIIllIlI[1];
            }
            return bl;
        }).min(Comparator.comparingInt(item -> s.get(item.getName()) * item.getQuantity()));
    }

    @Inject
    public a(c c2, SquireShamanConfig squireShamanConfig) {
        this.v = c2;
        this.w = squireShamanConfig;
    }

    private static boolean lIlIllllIlIIlll(Object object) {
        return object == null;
    }

    public Optional<TileItem> k() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (a.lIlIllllIlIIllI(this.v.t().x().contains(tileItem.getWorldLocation()) ? 1 : 0) && a.lIlIllllIlIIlIl(tileItem.getName()) && a.lIlIllllIlIIllI(r.contains(tileItem.getName()) ? 1 : 0)) {
                n2 = lIIllIIIllIlI[0];
                0;
                if (null != null) {
                    return ((0x30 ^ 0x14) & ~(0xE4 ^ 0xC0)) != 0;
                }
            } else {
                n2 = lIIllIIIllIlI[1];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            boolean bl;
            if (a.lIlIllllIlIIlll(NPCs.getNearest(nPC -> {
                int n2;
                if (a.lIlIllllIlIIllI(nPC.getName().equals(lIIllIIIlIlII[lIIllIIIllIlI[0]]) ? 1 : 0) && a.lIlIllllIlIIllI(nPC.getWorldArea().contains((Locatable)tileItem) ? 1 : 0)) {
                    n2 = lIIllIIIllIlI[0];
                    0;
                    if (-1 >= 1) {
                        return ((188 + 101 - 105 + 53 ^ 133 + 161 - 241 + 126) & (0x65 ^ 0x61 ^ (0x30 ^ 0x6A) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIIIllIlI[1];
                }
                return n2 != 0;
            }))) {
                bl = lIIllIIIllIlI[0];
                0;
                if ((0x78 ^ 0x7C) < (0x23 ^ 0x27)) {
                    return ((0xAB ^ 0x80) & ~(0x6A ^ 0x41)) != 0;
                }
            } else {
                bl = lIIllIIIllIlI[1];
            }
            return bl;
        }).filter(tileItem -> {
            boolean bl;
            if (!a.lIlIllllIlIIlII(this.w.alch() ? 1 : 0) || a.lIlIllllIlIIlII(q.contains(tileItem.getName()) ? 1 : 0)) {
                bl = lIIllIIIllIlI[0];
                0;
                if ((0x6D ^ 0x50 ^ (0xA5 ^ 0x9C)) > (0xC5 ^ 0xA0 ^ (0xFD ^ 0x9C))) {
                    return ((0x5A ^ 0x7B ^ (0x6B ^ 0x5A)) & (0x94 ^ 0xC6 ^ (0xE6 ^ 0xA4) ^ -1)) != 0;
                }
            } else {
                bl = lIIllIIIllIlI[1];
            }
            return bl;
        }).max(Comparator.comparingInt(object -> Prices.getItemPrice((int)((TileItem)object).getId()) * ((TileItem)object).getQuantity()).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }
}

