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
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.pvm.SquireShamanConfig;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.PvmManager;

@Singleton
public class PvmManager {
    public static final  List<String> q;
    private static final  List<String> t;
    
    private static final  HashMap<String, Integer> s;
    private  boolean u;
    private final  SquireShamanConfig w;
    
    private final  c v;
    public static final  List<String> r;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public boolean PvmManager(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = s.get(item.getName()) * item.getQuantity();
        if (a.var4(n3, n2 = s.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = var1[0];
            0;
            if (-1 >= 1) {
                return ((0x16 ^ 0x5F) & ~(0xD7 ^ 0x9E)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[1];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[1];
        while (a.var4(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (((0xB7 ^ 0xBF) & ~(1 ^ 9)) == 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void var22() {
        var1 = new int[156];
        a.var1[0] = 1;
        a.var1[1] = (67 + 139 - 77 + 25 ^ 44 + 58 - 13 + 57) & (0x5D ^ 0x3E ^ (0x60 ^ 0xB) ^ -1);
        a.var1[2] = 38 + 40 - 47 + 134 ^ 167 + 90 - 200 + 111;
        a.var1[3] = 2;
        a.var1[4] = 3;
        a.var1[5] = 160 + 71 - 214 + 172 ^ 91 + 36 - 95 + 153;
        a.var1[6] = 0x30 ^ 8 ^ (0x7E ^ 0x43);
        a.var1[7] = 0x87 ^ 0x81;
        a.var1[8] = 0x7C ^ 0x7B;
        a.var1[9] = 0xA2 ^ 0xAA;
        a.var1[10] = 0x3F ^ 0x36;
        a.var1[11] = 0x6F ^ 0x65;
        a.var1[12] = 99 + 121 - 188 + 144 ^ 113 + 82 - 127 + 119;
        a.var1[13] = 0x32 ^ 0x3E;
        a.var1[14] = 0xA8 ^ 0xB8 ^ (0x20 ^ 0x3E);
        a.var1[15] = (0x5F ^ 0x78) + (0x57 ^ 0xD) - (0x43 ^ 0x46) + (0 ^ 0xD);
        a.var1[16] = 0x6D ^ 0x62;
        a.var1[17] = 0x99 ^ 0x89;
        a.var1[18] = 0x1C ^ 0xD;
        a.var1[19] = 0xBC ^ 0xAE;
        a.var1[20] = 0x65 ^ 0x79 ^ (0x28 ^ 0x27);
        a.var1[21] = 0x72 ^ 0x66;
        a.var1[22] = 0xF8 ^ 0x82 ^ (0x29 ^ 0x46);
        a.var1[23] = 0x68 ^ 0x7E;
        a.var1[24] = 3 ^ 0x14;
        a.var1[25] = 0x66 ^ 0x21 ^ (0x48 ^ 0x17);
        a.var1[26] = 0x74 ^ 0x5C ^ (0x7A ^ 0x4B);
        a.var1[27] = 0x86 ^ 0xBC ^ (0x1B ^ 0x3B);
        a.var1[28] = 0x47 ^ 0x73 ^ (0x35 ^ 0x1A);
        a.var1[29] = 0x92 ^ 0xC3 ^ (0xD2 ^ 0x9F);
        a.var1[30] = 93 + 122 - 85 + 42 ^ 59 + 58 - 61 + 121;
        a.var1[31] = 0x41 ^ 0x4F ^ (0x3E ^ 0x2E);
        a.var1[32] = 0x6E ^ 0x71;
        a.var1[33] = 0x2D ^ 0xD;
        a.var1[34] = (0xDB ^ 0x8B) & ~(0xF7 ^ 0xA7) ^ (0xB0 ^ 0x91);
        a.var1[35] = 3 ^ (0x32 ^ 0x13);
        a.var1[36] = 111 + 121 - 86 + 26 ^ 133 + 56 - 165 + 119;
        a.var1[37] = 6 + 40 - -8 + 132 ^ 107 + 122 - 110 + 39;
        a.var1[38] = 85 + 123 - 136 + 84 ^ 125 + 16 - -24 + 20;
        a.var1[39] = 0xE9 ^ 0x88 ^ (0xD ^ 0x4A);
        a.var1[40] = 13 + 54 - -94 + 20 ^ 125 + 91 - 208 + 138;
        a.var1[41] = 0x6D ^ 0x45;
        a.var1[42] = 0xB2 ^ 0x9B;
        a.var1[43] = 0xA6 ^ 0x8C;
        a.var1[44] = 0xD8 ^ 0x96 ^ (0x6C ^ 9);
        a.var1[45] = 0xEA ^ 0xC6;
        a.var1[46] = 0x6C ^ 0x41;
        a.var1[47] = 0xF1 ^ 0xB7 ^ (0xD3 ^ 0xBB);
        a.var1[48] = 0x9E ^ 0xB1;
        a.var1[49] = 39 + 95 - 128 + 167 ^ 96 + 10 - 12 + 63;
        a.var1[50] = 0x31 ^ 0;
        a.var1[51] = 43 + 83 - 14 + 26 ^ 136 + 78 - 154 + 124;
        a.var1[52] = 0x4F ^ 0x7C;
        a.var1[53] = 139 + 18 - 131 + 129 ^ 144 + 164 - 252 + 119;
        a.var1[54] = 68 + 54 - -1 + 41 ^ 58 + 59 - -1 + 27;
        a.var1[55] = 86 + 179 - 239 + 215 ^ 18 + 107 - 82 + 156;
        a.var1[56] = 0x85 ^ 0xB2;
        a.var1[57] = 0x73 ^ 0x75 ^ (0x3E ^ 0);
        a.var1[58] = 94 + 20 - -11 + 10 ^ 71 + 102 - 72 + 89;
        a.var1[59] = 0x4E ^ 9 ^ (0xE4 ^ 0x99);
        a.var1[60] = 0x33 ^ 8;
        a.var1[61] = 0x2C ^ 0x10;
        a.var1[62] = 0xAA ^ 0xB9 ^ (0x37 ^ 0x19);
        a.var1[63] = 0xA3 ^ 0x9D;
        a.var1[64] = 66 + 126 - 51 + 31 ^ 67 + 25 - -25 + 30;
        a.var1[65] = 0x1F ^ 0x5F;
        a.var1[66] = 0x5E ^ 0x1F;
        a.var1[67] = 0x27 ^ 0x65;
        a.var1[68] = 0x4D ^ 0x63 ^ (0x4D ^ 0x20);
        a.var1[69] = 0x41 ^ 0x24 ^ (0xA8 ^ 0x89);
        a.var1[70] = 0x1B ^ 0x13 ^ (0xF9 ^ 0xB4);
        a.var1[71] = 2 ^ 0x44;
        a.var1[72] = 203 + 169 - 230 + 110 ^ 124 + 90 - 103 + 76;
        a.var1[73] = 0x53 ^ 0x78 ^ (0x31 ^ 0x52);
        a.var1[74] = 0x96 ^ 0x8D ^ (0x40 ^ 0x12);
        a.var1[75] = 0x1E ^ 0x54;
        a.var1[76] = 0x74 ^ 0x3F;
        a.var1[77] = 0xCB ^ 0xB6 ^ (0x99 ^ 0xA8);
        a.var1[78] = 0x72 ^ 0x74 ^ (0xD5 ^ 0x9E);
        a.var1[79] = 0x4E ^ 0;
        a.var1[80] = 0x16 ^ 0x74 ^ (0xAD ^ 0x80);
        a.var1[81] = 0x13 ^ 0x20 ^ (0x5D ^ 0x3E);
        a.var1[82] = 0x90 ^ 0xC1;
        a.var1[83] = 2 ^ 0x54 ^ (0x2B ^ 0x2F);
        a.var1[84] = 0x13 ^ 0x17 ^ (4 ^ 0x53);
        a.var1[85] = 0x5D ^ 9;
        a.var1[86] = 0x5C ^ 9;
        a.var1[87] = 0xC3 ^ 0x95;
        a.var1[88] = 0xC0 ^ 0x97;
        a.var1[89] = 55 + 97 - 15 + 76 ^ 122 + 56 - 119 + 82;
        a.var1[90] = 39 + 168 - 140 + 132 ^ 1 + 112 - 32 + 77;
        a.var1[91] = 0xEC ^ 0xB6;
        a.var1[92] = 145 + 51 - 177 + 139 ^ 185 + 119 - 167 + 60;
        a.var1[93] = 0xC2 ^ 0x9E;
        a.var1[94] = 0x4B ^ 0x71 ^ (0xCE ^ 0xA9);
        a.var1[95] = 0x34 ^ 0x73 ^ (0x4C ^ 0x55);
        a.var1[96] = 0x12 ^ 0x4D;
        a.var1[97] = 0x37 ^ 0x57;
        a.var1[98] = 0x3C ^ 0x32 ^ (0x39 ^ 0x56);
        a.var1[99] = 1 ^ (0xDB ^ 0xB8);
        a.var1[100] = 0x43 ^ 0x6D ^ (0xCB ^ 0x86);
        a.var1[101] = 0x5F ^ 0x24 ^ (0x89 ^ 0x96);
        a.var1[102] = 0x4D ^ 0x28;
        a.var1[103] = 0xF1 ^ 0xC2 ^ (0x16 ^ 0x43);
        a.var1[104] = 0x36 ^ 0x51;
        a.var1[105] = 165 + 119 - 96 + 42 ^ 109 + 30 - 77 + 80;
        a.var1[106] = 0x50 ^ 0x68 ^ (0x40 ^ 0x11);
        a.var1[107] = 0x62 ^ 0x5E ^ (0xC2 ^ 0x94);
        a.var1[108] = 0xF6 ^ 0x9D;
        a.var1[109] = 0xB3 ^ 0xC1 ^ (0x45 ^ 0x5B);
        a.var1[110] = 0x7E ^ 0x13;
        a.var1[111] = 0x59 ^ 0x37;
        a.var1[112] = (0x10 ^ 0x51) & ~(0x34 ^ 0x75) ^ (0x29 ^ 0x46);
        a.var1[113] = 0x25 ^ 0x55;
        a.var1[114] = 0x44 ^ 0x6B ^ (0x99 ^ 0xC7);
        a.var1[115] = 0x40 ^ 0x32;
        a.var1[116] = 4 ^ 0x75 ^ 2;
        a.var1[117] = 0xB1 ^ 0xC5;
        a.var1[118] = 43 + 23 - -90 + 24 ^ 57 + 25 - 72 + 183;
        a.var1[119] = 0x73 ^ 0x23 ^ (0xD ^ 0x2B);
        a.var1[120] = 120 + 207 - 197 + 78 ^ 0 + 53 - -47 + 67;
        a.var1[121] = 0xBD ^ 0xC5;
        a.var1[122] = 0xCC ^ 0xB5;
        a.var1[123] = 0x49 ^ 0x33;
        a.var1[124] = 0x55 ^ 0x2E;
        a.var1[125] = 34 + 170 - 130 + 140 ^ 58 + 150 - 87 + 49;
        a.var1[126] = 0x73 ^ 0xE;
        a.var1[127] = 0x6B ^ 0x15;
        a.var1[128] = 10 + 27 - -16 + 74;
        a.var1[129] = 78 + 125 - 202 + 127;
        a.var1[130] = 87 + 36 - 83 + 89;
        a.var1[131] = (0x2D ^ 0x29) + (65 + 31 - 8 + 40) - (0x50 ^ 0x5C) + (0x20 ^ 0x2A);
        a.var1[132] = 15 + 91 - 74 + 95 + (2 ^ 0x10) - (0xB7 ^ 0x9A) + (0x5D ^ 0x42);
        a.var1[133] = 69 + 116 - 155 + 102;
        a.var1[134] = (0x54 ^ 0x1A) + (0xE ^ 0x4A) - (0x4C ^ 9) + (0x7E ^ 0x46);
        a.var1[135] = (0x23 ^ 0x6D) + (0x45 ^ 0x64) - (0xFE ^ 0xA1) + (0x37 ^ 0x41);
        a.var1[136] = 3 + (0x5D ^ 0x74) - -(0x58 ^ 0x1C) + (0x98 ^ 0x8F);
        a.var1[137] = 18 + 91 - -5 + 22;
        a.var1[138] = (0x3D ^ 0x35) + (0 ^ 0x61) - -(0xA7 ^ 0xBF) + (0xE ^ 7);
        a.var1[139] = (0x8B ^ 0x91) + (0xE2 ^ 0xB2) - (0x4C ^ 3) + (0x2B ^ 0x5B);
        a.var1[140] = (0xF ^ 0x5F) + (0xC ^ 0x26) - (0x7C ^ 0x16) + (0xDE ^ 0xA2);
        a.var1[141] = 20 + 27 - -80 + 14;
        a.var1[142] = 63 + 94 - 115 + 100;
        a.var1[143] = (0xD3 ^ 0x8B) + (0x8D ^ 0xB7) - (0x6A ^ 0x7A) + (0xD ^ 0);
        a.var1[144] = 17 + 4 - -26 + 97;
        a.var1[145] = 140 + 44 - 100 + 61;
        a.var1[146] = 53 + 87 - 128 + 134;
        a.var1[147] = (0x2A ^ 0x7B) + (0x26 ^ 0xD) - (0xCB ^ 0xB1) + (17 + 128 - 133 + 133);
        a.var1[148] = 40 + 145 - 127 + 90;
        a.var1[149] = 127 + 4 - 33 + 51;
        a.var1[150] = 40 + 103 - 34 + 41;
        a.var1[151] = 102 + 74 - 63 + 38;
        a.var1[152] = (0x17 ^ 3) + (7 ^ 0x37) - (0x53 ^ 0x71) + (0x31 ^ 0x47);
        a.var1[153] = (0x40 ^ 0x11) + (0x3E ^ 0x6B) - (0xC ^ 0x6B) + (0x74 ^ 0x2E);
        a.var1[154] = 122 + 150 - 206 + 88;
        a.var1[155] = (0x7F ^ 0x2A) + (0x37 ^ 0x7D) - (21 + 56 - -11 + 58) + (9 + 85 - 41 + 89);
    }

    private static void var23() {
        var2 = new String[var1[155]];
        a.var2[a.var1[1]] = "Coins";
        a.var2[a.var1[0]] = "Lizardman shaman";
        a.var2[a.var1[3]] = "Rune platebody";
        a.var2[a.var1[4]] = "Rune 2h sword";
        a.var2[a.var1[5]] = "Rune longsword";
        a.var2[a.var1[6]] = "Rune pickaxe";
        a.var2[a.var1[7]] = "Rune kiteshield";
        a.var2[a.var1[8]] = "Rune med helm";
        a.var2[a.var1[9]] = "Mystic earth staff";
        a.var2[a.var1[10]] = "Rune chainbody";
        a.var2[a.var1[11]] = "Rune warhammer";
        a.var2[a.var1[12]] = "Earth battlestaff";
        a.var2[a.var1[13]] = "Rune battleaxe";
        a.var2[a.var1[2]] = "Rune sq shield";
        a.var2[a.var1[14]] = "Dragon med helm";
        a.var2[a.var1[16]] = "Brimstone key";
        a.var2[a.var1[17]] = "Broad arrows";
        a.var2[a.var1[18]] = "Mystic earth staff";
        a.var2[a.var1[19]] = "Earth battlestaff";
        a.var2[a.var1[20]] = "Rune med helm";
        a.var2[a.var1[21]] = "Rune chainbody";
        a.var2[a.var1[22]] = "Rune warhammer";
        a.var2[a.var1[23]] = "Dragon warhammer";
        a.var2[a.var1[24]] = "Iron ore";
        a.var2[a.var1[25]] = "Coal";
        a.var2[a.var1[26]] = "Runite ore";
        a.var2[a.var1[27]] = "Grimy kwuarm";
        a.var2[a.var1[28]] = "Grimy dwarf weed";
        a.var2[a.var1[29]] = "Grimy lantadyme";
        a.var2[a.var1[30]] = "Grimy cadantine";
        a.var2[a.var1[31]] = "Ranarr seed";
        a.var2[a.var1[32]] = "Snapdragon seed";
        a.var2[a.var1[33]] = "Torstol seed";
        a.var2[a.var1[34]] = "Maple seed";
        a.var2[a.var1[35]] = "Yew seed";
        a.var2[a.var1[36]] = "Magic seed";
        a.var2[a.var1[37]] = "Celastrus seed";
        a.var2[a.var1[38]] = "Onyx bolt tips";
        a.var2[a.var1[39]] = "Magic logs";
        a.var2[a.var1[40]] = "Redwood tree seed";
        a.var2[a.var1[41]] = "Dragonfruit tree seed";
        a.var2[a.var1[42]] = "Chaos rune";
        a.var2[a.var1[43]] = "Death rune";
        a.var2[a.var1[44]] = "Uncut ruby";
        a.var2[a.var1[45]] = "Uncut diamond";
        a.var2[a.var1[46]] = "Chilli potato";
        a.var2[a.var1[47]] = "Loop half of key";
        a.var2[a.var1[48]] = "Tooth half of key";
        a.var2[a.var1[49]] = "Diamond bolts (e)";
        a.var2[a.var1[50]] = "Runite bar";
        a.var2[a.var1[51]] = "Nature rune";
        a.var2[a.var1[52]] = "Rune 2h sword";
        a.var2[a.var1[53]] = "Rune battleaxe";
        a.var2[a.var1[54]] = "Law rune";
        a.var2[a.var1[55]] = "Rune 2h sword";
        a.var2[a.var1[56]] = "Blood rune";
        a.var2[a.var1[57]] = "Rune sq shield";
        a.var2[a.var1[58]] = "Dragonstone";
        a.var2[a.var1[59]] = "Silver ore";
        a.var2[a.var1[60]] = "Coins";
        a.var2[a.var1[61]] = "Treasonous ring";
        a.var2[a.var1[62]] = "Rune pickaxe";
        a.var2[a.var1[63]] = "Rune knife";
        a.var2[a.var1[64]] = "Rune kiteshield";
        a.var2[a.var1[65]] = "Dragon med helm";
        a.var2[a.var1[66]] = "Rune spear";
        a.var2[a.var1[67]] = "Shield left half";
        a.var2[a.var1[68]] = "Dragon spear";
        a.var2[a.var1[69]] = "Uncut diamond";
        a.var2[a.var1[70]] = "Ring of wealth";
        a.var2[a.var1[71]] = "Skills necklace";
        a.var2[a.var1[72]] = "Mahogany seed";
        a.var2[a.var1[73]] = "Palm tree seed";
        a.var2[a.var1[74]] = "Dragon pickaxe";
        a.var2[a.var1[75]] = "Dragon 2h sword";
        a.var2[a.var1[76]] = "Red spiders' eggs";
        a.var2[a.var1[77]] = "Unicorn horn";
        a.var2[a.var1[78]] = "Uncut dragonstone";
        a.var2[a.var1[79]] = "Grimy snapdragon";
        a.var2[a.var1[80]] = "Supercompost";
        a.var2[a.var1[81]] = "Cannonball";
        a.var2[a.var1[82]] = "Mysterious emblem";
        a.var2[a.var1[83]] = "Tanzanite fang";
        a.var2[a.var1[84]] = "Magic fang";
        a.var2[a.var1[85]] = "Serpentine visage";
        a.var2[a.var1[86]] = "Uncut onyx";
        a.var2[a.var1[87]] = "Dragon med helm";
        a.var2[a.var1[88]] = "Dragon halberd";
        a.var2[a.var1[89]] = "Law rune";
        a.var2[a.var1[90]] = "Pure essence";
        a.var2[a.var1[91]] = "Toadflax";
        a.var2[a.var1[92]] = "Snapdragon";
        a.var2[a.var1[93]] = "Dwarf weed";
        a.var2[a.var1[94]] = "Torstol";
        a.var2[a.var1[95]] = "Flax";
        a.var2[a.var1[96]] = "Snakeskin";
        a.var2[a.var1[97]] = "Dragonstone bolt tips";
        a.var2[a.var1[98]] = "Yew logs";
        a.var2[a.var1[99]] = "Mahogany logs";
        a.var2[a.var1[100]] = "Coal";
        a.var2[a.var1[101]] = "Runite ore";
        a.var2[a.var1[102]] = "Calquat tree seed";
        a.var2[a.var1[103]] = "Palm tree seed";
        a.var2[a.var1[104]] = "Papaya tree seed";
        a.var2[a.var1[105]] = "Magic seed";
        a.var2[a.var1[106]] = "Toadflax seed";
        a.var2[a.var1[107]] = "Snapdragon seed";
        a.var2[a.var1[108]] = "Dwarf weed seed";
        a.var2[a.var1[109]] = "Torstol seed";
        a.var2[a.var1[110]] = "Crystal seed";
        a.var2[a.var1[111]] = "Dragon bones";
        a.var2[a.var1[112]] = "Coconut";
        a.var2[a.var1[113]] = "Grapes";
        a.var2[a.var1[114]] = "Battlestaff";
        a.var2[a.var1[115]] = "Manta ray";
        a.var2[a.var1[116]] = "Swamp tar";
        a.var2[a.var1[117]] = "Crushed nest";
        a.var2[a.var1[118]] = "Adamantite bar";
        a.var2[a.var1[119]] = "Uncut sapphire";
        a.var2[a.var1[120]] = "Uncut emerald";
        a.var2[a.var1[121]] = "Uncut ruby";
        a.var2[a.var1[122]] = "Chaos talisman";
        a.var2[a.var1[123]] = "Uncut diamond";
        a.var2[a.var1[124]] = "Rune javelin";
        a.var2[a.var1[125]] = "Loop half of key";
        a.var2[a.var1[126]] = "Tooth half of key";
        a.var2[a.var1[127]] = "Rune spear";
        a.var2[a.var1[128]] = "Shield left half";
        a.var2[a.var1[129]] = "Dragon spear";
        a.var2[a.var1[130]] = "Runite bar";
        a.var2[a.var1[131]] = "Dragonstone";
        a.var2[a.var1[132]] = "Silver ore";
        a.var2[a.var1[133]] = "Rune kiteshield";
        a.var2[a.var1[134]] = "Rune sq shield";
        a.var2[a.var1[135]] = "Rune battleaxe";
        a.var2[a.var1[136]] = "Rune 2h sword";
        a.var2[a.var1[137]] = "Nature rune";
        a.var2[a.var1[15]] = "Steel arrow";
        a.var2[a.var1[138]] = "Rune arrow";
        a.var2[a.var1[139]] = "Adamant javelin";
        a.var2[a.var1[140]] = "Rune javelin";
        a.var2[a.var1[141]] = "Jar of swamp";
        a.var2[a.var1[142]] = "Lizardman fang";
        a.var2[a.var1[143]] = "Red d'hide vamb";
        a.var2[a.var1[144]] = "Xeric's talisman (inert)";
        a.var2[a.var1[145]] = "Ancient shard";
        a.var2[a.var1[146]] = "Eternal gem";
        a.var2[a.var1[147]] = "Imbued heart";
        a.var2[a.var1[148]] = "Mist battlestaff";
        a.var2[a.var1[149]] = "Dust battlestaff";
        a.var2[a.var1[150]] = "Long bone";
        a.var2[a.var1[151]] = "Curved bone";
        a.var2[a.var1[152]] = "Long bone";
        a.var2[a.var1[153]] = "Curved bone";
        a.var2[a.var1[154]] = "Chilli potato";
    }

    public boolean m() {
        return this.u;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    static {
        a.var22();
        a.var23();
        String[] stringArray = new String[var1[2]];
        stringArray[a.var1[1]] = var2[var1[3]];
        stringArray[a.var1[0]] = var2[var1[4]];
        stringArray[a.var1[3]] = var2[var1[5]];
        stringArray[a.var1[4]] = var2[var1[6]];
        stringArray[a.var1[5]] = var2[var1[7]];
        stringArray[a.var1[6]] = var2[var1[8]];
        stringArray[a.var1[7]] = var2[var1[9]];
        stringArray[a.var1[8]] = var2[var1[10]];
        stringArray[a.var1[9]] = var2[var1[11]];
        stringArray[a.var1[10]] = var2[var1[12]];
        stringArray[a.var1[11]] = var2[var1[13]];
        stringArray[a.var1[12]] = var2[var1[2]];
        stringArray[a.var1[13]] = var2[var1[14]];
        q = List.of(stringArray);
        String[] stringArray2 = new String[var1[15]];
        stringArray2[a.var1[1]] = var2[var1[16]];
        stringArray2[a.var1[0]] = var2[var1[17]];
        stringArray2[a.var1[3]] = var2[var1[18]];
        stringArray2[a.var1[4]] = var2[var1[19]];
        stringArray2[a.var1[5]] = var2[var1[20]];
        stringArray2[a.var1[6]] = var2[var1[21]];
        stringArray2[a.var1[7]] = var2[var1[22]];
        stringArray2[a.var1[8]] = var2[var1[23]];
        stringArray2[a.var1[9]] = var2[var1[24]];
        stringArray2[a.var1[10]] = var2[var1[25]];
        stringArray2[a.var1[11]] = var2[var1[26]];
        stringArray2[a.var1[12]] = var2[var1[27]];
        stringArray2[a.var1[13]] = var2[var1[28]];
        stringArray2[a.var1[2]] = var2[var1[29]];
        stringArray2[a.var1[14]] = var2[var1[30]];
        stringArray2[a.var1[16]] = var2[var1[31]];
        stringArray2[a.var1[17]] = var2[var1[32]];
        stringArray2[a.var1[18]] = var2[var1[33]];
        stringArray2[a.var1[19]] = var2[var1[34]];
        stringArray2[a.var1[20]] = var2[var1[35]];
        stringArray2[a.var1[21]] = var2[var1[36]];
        stringArray2[a.var1[22]] = var2[var1[37]];
        stringArray2[a.var1[23]] = var2[var1[38]];
        stringArray2[a.var1[24]] = var2[var1[39]];
        stringArray2[a.var1[25]] = var2[var1[40]];
        stringArray2[a.var1[26]] = var2[var1[41]];
        stringArray2[a.var1[27]] = var2[var1[42]];
        stringArray2[a.var1[28]] = var2[var1[43]];
        stringArray2[a.var1[29]] = var2[var1[44]];
        stringArray2[a.var1[30]] = var2[var1[45]];
        stringArray2[a.var1[31]] = var2[var1[46]];
        stringArray2[a.var1[32]] = var2[var1[47]];
        stringArray2[a.var1[33]] = var2[var1[48]];
        stringArray2[a.var1[34]] = var2[var1[49]];
        stringArray2[a.var1[35]] = var2[var1[50]];
        stringArray2[a.var1[36]] = var2[var1[51]];
        stringArray2[a.var1[37]] = var2[var1[52]];
        stringArray2[a.var1[38]] = var2[var1[53]];
        stringArray2[a.var1[39]] = var2[var1[54]];
        stringArray2[a.var1[40]] = var2[var1[55]];
        stringArray2[a.var1[41]] = var2[var1[56]];
        stringArray2[a.var1[42]] = var2[var1[57]];
        stringArray2[a.var1[43]] = var2[var1[58]];
        stringArray2[a.var1[44]] = var2[var1[59]];
        stringArray2[a.var1[45]] = var2[var1[60]];
        stringArray2[a.var1[46]] = var2[var1[61]];
        stringArray2[a.var1[47]] = var2[var1[62]];
        stringArray2[a.var1[48]] = var2[var1[63]];
        stringArray2[a.var1[49]] = var2[var1[64]];
        stringArray2[a.var1[50]] = var2[var1[65]];
        stringArray2[a.var1[51]] = var2[var1[66]];
        stringArray2[a.var1[52]] = var2[var1[67]];
        stringArray2[a.var1[53]] = var2[var1[68]];
        stringArray2[a.var1[54]] = var2[var1[69]];
        stringArray2[a.var1[55]] = var2[var1[70]];
        stringArray2[a.var1[56]] = var2[var1[71]];
        stringArray2[a.var1[57]] = var2[var1[72]];
        stringArray2[a.var1[58]] = var2[var1[73]];
        stringArray2[a.var1[59]] = var2[var1[74]];
        stringArray2[a.var1[60]] = var2[var1[75]];
        stringArray2[a.var1[61]] = var2[var1[76]];
        stringArray2[a.var1[62]] = var2[var1[77]];
        stringArray2[a.var1[63]] = var2[var1[78]];
        stringArray2[a.var1[64]] = var2[var1[79]];
        stringArray2[a.var1[65]] = var2[var1[80]];
        stringArray2[a.var1[66]] = var2[var1[81]];
        stringArray2[a.var1[67]] = var2[var1[82]];
        stringArray2[a.var1[68]] = var2[var1[83]];
        stringArray2[a.var1[69]] = var2[var1[84]];
        stringArray2[a.var1[70]] = var2[var1[85]];
        stringArray2[a.var1[71]] = var2[var1[86]];
        stringArray2[a.var1[72]] = var2[var1[87]];
        stringArray2[a.var1[73]] = var2[var1[88]];
        stringArray2[a.var1[74]] = var2[var1[89]];
        stringArray2[a.var1[75]] = var2[var1[90]];
        stringArray2[a.var1[76]] = var2[var1[91]];
        stringArray2[a.var1[77]] = var2[var1[92]];
        stringArray2[a.var1[78]] = var2[var1[93]];
        stringArray2[a.var1[79]] = var2[var1[94]];
        stringArray2[a.var1[80]] = var2[var1[95]];
        stringArray2[a.var1[81]] = var2[var1[96]];
        stringArray2[a.var1[82]] = var2[var1[97]];
        stringArray2[a.var1[83]] = var2[var1[98]];
        stringArray2[a.var1[84]] = var2[var1[99]];
        stringArray2[a.var1[85]] = var2[var1[100]];
        stringArray2[a.var1[86]] = var2[var1[101]];
        stringArray2[a.var1[87]] = var2[var1[102]];
        stringArray2[a.var1[88]] = var2[var1[103]];
        stringArray2[a.var1[89]] = var2[var1[104]];
        stringArray2[a.var1[90]] = var2[var1[105]];
        stringArray2[a.var1[91]] = var2[var1[106]];
        stringArray2[a.var1[92]] = var2[var1[107]];
        stringArray2[a.var1[93]] = var2[var1[108]];
        stringArray2[a.var1[94]] = var2[var1[109]];
        stringArray2[a.var1[95]] = var2[var1[110]];
        stringArray2[a.var1[96]] = var2[var1[111]];
        stringArray2[a.var1[97]] = var2[var1[112]];
        stringArray2[a.var1[98]] = var2[var1[113]];
        stringArray2[a.var1[99]] = var2[var1[114]];
        stringArray2[a.var1[100]] = var2[var1[115]];
        stringArray2[a.var1[101]] = var2[var1[116]];
        stringArray2[a.var1[102]] = var2[var1[117]];
        stringArray2[a.var1[103]] = var2[var1[118]];
        stringArray2[a.var1[104]] = var2[var1[119]];
        stringArray2[a.var1[105]] = var2[var1[120]];
        stringArray2[a.var1[106]] = var2[var1[121]];
        stringArray2[a.var1[107]] = var2[var1[122]];
        stringArray2[a.var1[108]] = var2[var1[123]];
        stringArray2[a.var1[109]] = var2[var1[124]];
        stringArray2[a.var1[110]] = var2[var1[125]];
        stringArray2[a.var1[111]] = var2[var1[126]];
        stringArray2[a.var1[112]] = var2[var1[127]];
        stringArray2[a.var1[113]] = var2[var1[128]];
        stringArray2[a.var1[114]] = var2[var1[129]];
        stringArray2[a.var1[115]] = var2[var1[130]];
        stringArray2[a.var1[116]] = var2[var1[131]];
        stringArray2[a.var1[117]] = var2[var1[132]];
        stringArray2[a.var1[118]] = var2[var1[133]];
        stringArray2[a.var1[119]] = var2[var1[134]];
        stringArray2[a.var1[120]] = var2[var1[135]];
        stringArray2[a.var1[121]] = var2[var1[136]];
        stringArray2[a.var1[122]] = var2[var1[137]];
        stringArray2[a.var1[123]] = var2[var1[15]];
        stringArray2[a.var1[124]] = var2[var1[138]];
        stringArray2[a.var1[125]] = var2[var1[139]];
        stringArray2[a.var1[126]] = var2[var1[140]];
        stringArray2[a.var1[127]] = var2[var1[141]];
        stringArray2[a.var1[128]] = var2[var1[142]];
        stringArray2[a.var1[129]] = var2[var1[143]];
        stringArray2[a.var1[130]] = var2[var1[144]];
        stringArray2[a.var1[131]] = var2[var1[145]];
        stringArray2[a.var1[132]] = var2[var1[146]];
        stringArray2[a.var1[133]] = var2[var1[147]];
        stringArray2[a.var1[134]] = var2[var1[148]];
        stringArray2[a.var1[135]] = var2[var1[149]];
        stringArray2[a.var1[136]] = var2[var1[150]];
        stringArray2[a.var1[137]] = var2[var1[151]];
        r = Arrays.asList(stringArray2);
        s = new PvmManager();
        t = List.of(var2[var1[152]], var2[var1[153]], var2[var1[154]]);
    }

    public boolean PvmManager(TileItem tileItem) {
        return t.contains(tileItem.getName());
    }

    public void g(boolean bl) {
        this.u = bl;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var30(Object object) {
        return object != null;
    }

    public Optional<Item> l() {
        return Inventory.getAll(item -> {
            int n2;
            if (a.var30(item.getName()) && a.var3(s.containsKey(item.getName()) ? 1 : 0)) {
                n2 = var1[0];
                0;
                if ((91 + 55 - 94 + 90 ^ 104 + 69 - 69 + 34) == -1) {
                    return ((0x74 ^ 0x37 ^ (0x7F ^ 0x69)) & (139 + 79 - -3 + 0 ^ 69 + 11 - 21 + 77 ^ -1)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (a.var5(item.getName().equals(var2[var1[1]]) ? 1 : 0)) {
                bl = var1[0];
                0;
                if (3 <= 0) {
                    return ((0x97 ^ 0xB4 ^ (0x7E ^ 0x41)) & (127 + 167 - 268 + 192 ^ 62 + 186 - 160 + 110 ^ -1)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }).min(Comparator.comparingInt(item -> s.get(item.getName()) * item.getQuantity()));
    }

    @Inject
    public PvmManager(c c2, SquireShamanConfig squireShamanConfig) {
        this.v = c2;
        this.w = squireShamanConfig;
    }

    private static boolean var31(Object object) {
        return object == null;
    }

    public Optional<TileItem> k() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (a.var3(this.v.t().x().contains(tileItem.getWorldLocation()) ? 1 : 0) && a.var30(tileItem.getName()) && a.var3(r.contains(tileItem.getName()) ? 1 : 0)) {
                n2 = var1[0];
                0;
                if null != null {
                    return ((0x30 ^ 0x14) & ~(0xE4 ^ 0xC0)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            boolean bl;
            if (a.var31(NPCs.getNearest(nPC -> {
                int n2;
                if (a.var3(nPC.getName().equals(var2[var1[0]]) ? 1 : 0) && a.var3(nPC.getWorldArea().contains((Locatable)tileItem) ? 1 : 0)) {
                    n2 = var1[0];
                    0;
                    if (-1 >= 1) {
                        return ((188 + 101 - 105 + 53 ^ 133 + 161 - 241 + 126) & (0x65 ^ 0x61 ^ (0x30 ^ 0x6A) ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[1];
                }
                return n2 != 0;
            }))) {
                bl = var1[0];
                0;
                if ((0x78 ^ 0x7C) < (0x23 ^ 0x27)) {
                    return ((0xAB ^ 0x80) & ~(0x6A ^ 0x41)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }).filter(tileItem -> {
            boolean bl;
            if (!a.var5(this.w.alch() ? 1 : 0) || a.var5(q.contains(tileItem.getName()) ? 1 : 0)) {
                bl = var1[0];
                0;
                if ((0x6D ^ 0x50 ^ (0xA5 ^ 0x9C)) > (0xC5 ^ 0xA0 ^ (0xFD ^ 0x9C))) {
                    return ((0x5A ^ 0x7B ^ (0x6B ^ 0x5A)) & (0x94 ^ 0xC6 ^ (0xE6 ^ 0xA4) ^ -1)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }).max(Comparator.comparingInt(object -> Prices.getItemPrice((int)((TileItem)object).getId()) * ((TileItem)object).getQuantity()).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }
}

