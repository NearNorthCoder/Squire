/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Looting", priority=20, blocking=true)
public class LootingTask
extends Task {
    public static final  List<String> az;
    
    private final  SquireShamansPlugin aD;
    private final  SquireShamanConfig aB;
    private final  c aA;
    private final  a aC;
    private static final  Logger ay;

    private static void var3() {
        var1 = new int[141];
        x.var1[0] = (0xB ^ 0x4F) & ~(0xE9 ^ 0xAD);
        x.var1[1] = 1;
        x.var1[2] = 2;
        x.var1[3] = 3;
        x.var1[4] = 0x29 ^ 0x2D;
        x.var1[5] = 23 + 21 - -34 + 57;
        x.var1[6] = 0x35 ^ 0x30;
        x.var1[7] = 0x1B ^ 0x1C ^ 1;
        x.var1[8] = 0x80 ^ 0x91 ^ (0x1B ^ 0xD);
        x.var1[9] = 0xDA ^ 0x84 ^ (0xF9 ^ 0xAF);
        x.var1[10] = 76 + 113 - 161 + 108 ^ 38 + 42 - 64 + 113;
        x.var1[11] = 49 + 13 - 46 + 120 ^ 82 + 4 - 33 + 77;
        x.var1[12] = 0x85 ^ 0x9C ^ (0xE ^ 0x1C);
        x.var1[13] = 35 + 52 - 49 + 89 ^ (0xDC ^ 0xAF);
        x.var1[14] = 0x3A ^ 0x37;
        x.var1[15] = 0x88 ^ 0x86;
        x.var1[16] = 0x40 ^ 0x4F;
        x.var1[17] = 0x8D ^ 0x9D;
        x.var1[18] = 0xB4 ^ 0xA5;
        x.var1[19] = 0x6F ^ 0x7D;
        x.var1[20] = 0x65 ^ 0x76;
        x.var1[21] = 0x2C ^ 0x38;
        x.var1[22] = 0x61 ^ 0x74;
        x.var1[23] = 0xE6 ^ 0x8B ^ (0xC5 ^ 0xBE);
        x.var1[24] = 175 + 117 - 273 + 165 ^ 159 + 10 - 17 + 23;
        x.var1[25] = 177 + 141 - 144 + 4 ^ 54 + 13 - 37 + 140;
        x.var1[26] = 0x64 ^ 0x7D;
        x.var1[27] = 0xD5 ^ 0x93 ^ (0xD2 ^ 0x8E);
        x.var1[28] = 0x3B ^ 0x66 ^ (0x7C ^ 0x3A);
        x.var1[29] = 96 + 24 - 5 + 71 ^ 80 + 109 - 47 + 24;
        x.var1[30] = 123 + 39 - 43 + 103 ^ 89 + 35 - 108 + 179;
        x.var1[31] = 68 + 153 - 123 + 73 ^ 94 + 161 - 215 + 141;
        x.var1[32] = 0x35 ^ 0x2A;
        x.var1[33] = 0x10 ^ 0x30;
        x.var1[34] = 0x73 ^ 0x52;
        x.var1[35] = 0x87 ^ 0xA5;
        x.var1[36] = 0x2B ^ 8;
        x.var1[37] = 0x36 ^ 0x53 ^ (0x2E ^ 0x6F);
        x.var1[38] = 0xE2 ^ 0xC7;
        x.var1[39] = 0xE7 ^ 0xC1;
        x.var1[40] = 0x6F ^ 0x56 ^ (0xA8 ^ 0xB6);
        x.var1[41] = 0x61 ^ 0x49;
        x.var1[42] = 0x29 ^ 0;
        x.var1[43] = 0x80 ^ 0xAA;
        x.var1[44] = 0x94 ^ 0x8C ^ (0x4C ^ 0x7F);
        x.var1[45] = 0xAE ^ 0x82;
        x.var1[46] = 0x10 ^ 0x2B ^ (0x2A ^ 0x3C);
        x.var1[47] = 0x3A ^ 1 ^ (0x33 ^ 0x26);
        x.var1[48] = 0x4D ^ 0x58 ^ (0x50 ^ 0x6A);
        x.var1[49] = 66 + 89 - 82 + 88 ^ 85 + 8 - 28 + 80;
        x.var1[50] = 75 + 74 - 140 + 164 ^ 94 + 139 - 101 + 24;
        x.var1[51] = 0x93 ^ 0xA1;
        x.var1[52] = 0xBA ^ 0x89;
        x.var1[53] = 0x60 ^ 0x20 ^ (0x6E ^ 0x1A);
        x.var1[54] = 0xBB ^ 0xAA ^ (0x2F ^ 0xB);
        x.var1[55] = 8 ^ 0x75 ^ (0x2A ^ 0x61);
        x.var1[56] = 0x6B ^ 0x5C;
        x.var1[57] = 0xA9 ^ 0x91;
        x.var1[58] = 0xCF ^ 0xC5 ^ (0x70 ^ 0x43);
        x.var1[59] = 0x80 ^ 0xBA;
        x.var1[60] = 0x7F ^ 0x44;
        x.var1[61] = 0x6D ^ 0x44 ^ (0x96 ^ 0x83);
        x.var1[62] = 0xBA ^ 0x87;
        x.var1[63] = 0x5D ^ 0x63;
        x.var1[64] = 0x2C ^ 0x5D ^ (0xD1 ^ 0x9F);
        x.var1[65] = 0x88 ^ 0xA1 ^ (0xEC ^ 0x85);
        x.var1[66] = 5 ^ 0x4E ^ (0xA3 ^ 0xA9);
        x.var1[67] = 13 + 70 - -86 + 83 ^ 14 + 117 - -4 + 55;
        x.var1[68] = 0x61 ^ 0x2C ^ (0x7B ^ 0x75);
        x.var1[69] = 0x68 ^ 0x2C;
        x.var1[70] = 0x71 ^ 0x34;
        x.var1[71] = 87 + 111 - 158 + 211 ^ 177 + 78 - 165 + 99;
        x.var1[72] = 0x21 ^ 0x66;
        x.var1[73] = 0xA7 ^ 0xB9 ^ (0x5F ^ 9);
        x.var1[74] = 0x55 ^ 0x1C;
        x.var1[75] = 107 + 143 - 159 + 127 ^ 96 + 106 - 142 + 84;
        x.var1[76] = 0x46 ^ 0xD;
        x.var1[77] = 0x4B ^ 7;
        x.var1[78] = 3 ^ 0x4E;
        x.var1[79] = 0x25 ^ 0x6B;
        x.var1[80] = 0x69 ^ 0x26;
        x.var1[81] = 8 ^ 0x58;
        x.var1[82] = 31 + 76 - -55 + 37 ^ 113 + 140 - 204 + 101;
        x.var1[83] = 2 ^ 0x7E ^ (0x5F ^ 0x71);
        x.var1[84] = 0x42 ^ 0x11;
        x.var1[85] = 0xE ^ 0x38 ^ (0xEF ^ 0x8D);
        x.var1[86] = 0x74 ^ 0x21;
        x.var1[87] = 0xBA ^ 0xA6 ^ (0xF2 ^ 0xB8);
        x.var1[88] = 0xC9 ^ 0x9E;
        x.var1[89] = 0x6D ^ 0x35;
        x.var1[90] = 81 + 8 - -34 + 84 ^ 14 + 54 - -70 + 12;
        x.var1[91] = 0xA2 ^ 0x91 ^ (0xFE ^ 0x97);
        x.var1[92] = 0xC8 ^ 0x93;
        x.var1[93] = 0x11 ^ 0x14 ^ (0xFB ^ 0xA2);
        x.var1[94] = 0xEA ^ 0xC6 ^ (0x24 ^ 0x55);
        x.var1[95] = 0x5D ^ 3;
        x.var1[96] = 0x6D ^ 0x32;
        x.var1[97] = 0xD4 ^ 0x86 ^ (0xB8 ^ 0x8A);
        x.var1[98] = 0x77 ^ 0x23 ^ (0x27 ^ 0x12);
        x.var1[99] = 98 + 58 - -49 + 0 ^ 39 + 125 - 158 + 169;
        x.var1[100] = 0x5B ^ 0x38;
        x.var1[101] = 0xDA ^ 0xBE;
        x.var1[102] = 0x3F ^ 0x5A;
        x.var1[103] = 0xA4 ^ 0xC2;
        x.var1[104] = 36 + 64 - 15 + 117 ^ 159 + 72 - 107 + 49;
        x.var1[105] = 0xE8 ^ 0xAA ^ (0xE ^ 0x24);
        x.var1[106] = 190 + 30 - 3 + 13 ^ 127 + 111 - 183 + 88;
        x.var1[107] = 8 ^ 0x62;
        x.var1[108] = 0x4B ^ 7 ^ (0xBF ^ 0x98);
        x.var1[109] = 0x5E ^ 0x32;
        x.var1[110] = 130 + 12 - -97 + 11 ^ 21 + 96 - -30 + 4;
        x.var1[111] = 0x19 ^ 0x58 ^ (0x1E ^ 0x31);
        x.var1[112] = 0xE4 ^ 0xC0 ^ (0x79 ^ 0x32);
        x.var1[113] = 0x55 ^ 0x25 ^ (0xEB ^ 0xC2) & ~(0x93 ^ 0xBA);
        x.var1[114] = 4 ^ 0x6B ^ (0x29 ^ 0x37);
        x.var1[115] = 69 + 148 - 181 + 180 ^ 108 + 5 - 79 + 136;
        x.var1[116] = 40 + 135 - 89 + 132 ^ 128 + 152 - 149 + 38;
        x.var1[117] = 0x54 ^ 0x20;
        x.var1[118] = 0xF6 ^ 0x83;
        x.var1[119] = 0x41 ^ 0x37;
        x.var1[120] = 0x41 ^ 5 ^ (0xB8 ^ 0x8B);
        x.var1[121] = 147 + 33 - 140 + 191 ^ 101 + 157 - 126 + 27;
        x.var1[122] = 0xD9 ^ 0xA0;
        x.var1[123] = 0xCE ^ 0xB4;
        x.var1[124] = 0x66 ^ 0x6B ^ (0xCF ^ 0xB9);
        x.var1[125] = 207 + 137 - 322 + 212 ^ 111 + 21 - 114 + 132;
        x.var1[126] = 0xE3 ^ 0xB2 ^ (0xA3 ^ 0x8F);
        x.var1[127] = 0xE2 ^ 0x9C;
        x.var1[128] = 67 + 48 - 72 + 84;
        x.var1[129] = 110 + 54 - 51 + 15;
        x.var1[130] = 86 + 121 - 194 + 116;
        x.var1[131] = 83 + 36 - 86 + 97;
        x.var1[132] = (0xFA ^ 0xB7) + (0xF3 ^ 0xA5) - (0x72 ^ 0x58) + (0x9B ^ 0x91);
        x.var1[133] = 82 + 13 - 6 + 42 + (0xEA ^ 0xB0) - (0x63 ^ 0x3F) + 3;
        x.var1[134] = (3 ^ 0x38) + (0xA4 ^ 0xBE) - (0x7A ^ 0x61) + (0x18 ^ 0x53);
        x.var1[135] = 69 + 97 - 93 + 61;
        x.var1[136] = (0x50 ^ 0x3D) + (0x9A ^ 0x84) - (0xDB ^ 0xC5) + (0x9B ^ 0x80);
        x.var1[137] = 92 + 4 - 25 + 66;
        x.var1[138] = 18 + 68 - -37 + 15;
        x.var1[139] = 43 + 137 - 94 + 53;
        x.var1[140] = 70 + 132 - 175 + 113;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        TileItem var6;
        x var7;
        block12: {
            block10: {
                block11: {
                    void var8;
                    Player player = Players.getLocal();
                    if (x.var5(this.aB.room().LootingTask().contains((Locatable)player) ? 1 : 0)) {
                        this.aC.g(var1[0]);
                        return var1[0];
                    }
                    if (x.var4(var7.aD.j() ? 1 : 0)) {
                        return var1[0];
                    }
                    var6 = var7.aC.k().orElse(null);
                    if (x.var9(var6)) {
                        var7.aC.g(var1[0]);
                        return var1[0];
                    }
                    if (x.var5(var7.aB.room().LootingTask().contains((Locatable)var6) ? 1 : 0)) {
                        var7.aC.g(var1[0]);
                        return var1[0];
                    }
                    NPC var10 = Combat.getAttackableNPC(arg_0 -> x.b((Player)var8, arg_0));
                    if (x.var11(var10) && x.var4(var10.getWorldArea().contains((Locatable)var6) ? 1 : 0)) {
                        var7.aC.g(var1[0]);
                        return var1[0];
                    }
                    if (!x.var12(Prices.getItemPrice((int)var6.getId()) * var6.getQuantity(), var7.aB.lootValue())) break block10;
                    if (!x.var4(Inventory.isFull() ? 1 : 0)) break block11;
                    int[] nArray = new int[var1[1]];
                    nArray[x.var1[0]] = var6.getId();
                    if (!x.var4(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                }
                if (!x.var4(var6.isStackable() ? 1 : 0)) break block12;
            }
            var7.aC.g(var1[1]);
            if (x.var4(Inventory.isFull() ? 1 : 0)) {
                Item var13 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[var1[1]];
                    stringArray[x.var1[0]] = var2[var1[3]];
                    return item.hasAction(stringArray);
                });
                var13.interact(var2[var1[0]]);
                return var1[1];
            }
            var6.interact(var2[var1[1]]);
            return var1[1];
        }
        if (x.var4(var7.aC.a(var6) ? 1 : 0) && x.var5(Inventory.isFull() ? 1 : 0)) {
            var7.aC.g(var1[1]);
            var6.interact(var2[var1[2]]);
            return var1[1];
        }
        this.aC.g(var1[0]);
        return var1[0];
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static void var21() {
        var2 = new String[var1[140]];
        x.var2[x.var1[0]] = "Eat";
        x.var2[x.var1[1]] = "Take";
        x.var2[x.var1[2]] = "Take";
        x.var2[x.var1[3]] = "Eat";
        x.var2[x.var1[4]] = "Lizardman";
        x.var2[x.var1[6]] = "Brimstone key";
        x.var2[x.var1[7]] = "Broad arrows";
        x.var2[x.var1[8]] = "Mystic earth staff";
        x.var2[x.var1[9]] = "Earth battlestaff";
        x.var2[x.var1[10]] = "Rune med helm";
        x.var2[x.var1[11]] = "Rune chainbody";
        x.var2[x.var1[12]] = "Rune warhammer";
        x.var2[x.var1[13]] = "Dragon warhammer";
        x.var2[x.var1[14]] = "Iron ore";
        x.var2[x.var1[15]] = "Coal";
        x.var2[x.var1[16]] = "Runite ore";
        x.var2[x.var1[17]] = "Grimy kwuarm";
        x.var2[x.var1[18]] = "Grimy dwarf weed";
        x.var2[x.var1[19]] = "Grimy lantadyme";
        x.var2[x.var1[20]] = "Grimy cadantine";
        x.var2[x.var1[21]] = "Ranarr seed";
        x.var2[x.var1[22]] = "Snapdragon seed";
        x.var2[x.var1[23]] = "Torstol seed";
        x.var2[x.var1[24]] = "Maple seed";
        x.var2[x.var1[25]] = "Yew seed";
        x.var2[x.var1[26]] = "Magic seed";
        x.var2[x.var1[27]] = "Celastrus seed";
        x.var2[x.var1[28]] = "Onyx bolt tips";
        x.var2[x.var1[29]] = "Magic logs";
        x.var2[x.var1[30]] = "Redwood tree seed";
        x.var2[x.var1[31]] = "Dragonfruit tree seed";
        x.var2[x.var1[32]] = "Chaos rune";
        x.var2[x.var1[33]] = "Death rune";
        x.var2[x.var1[34]] = "Uncut ruby";
        x.var2[x.var1[35]] = "Uncut diamond";
        x.var2[x.var1[36]] = "Chilli potato";
        x.var2[x.var1[37]] = "Loop half of key";
        x.var2[x.var1[38]] = "Tooth half of key";
        x.var2[x.var1[39]] = "Diamond bolts (e)";
        x.var2[x.var1[40]] = "Runite bar";
        x.var2[x.var1[41]] = "Nature rune";
        x.var2[x.var1[42]] = "Rune 2h sword";
        x.var2[x.var1[43]] = "Rune battleaxe";
        x.var2[x.var1[44]] = "Law rune";
        x.var2[x.var1[45]] = "Rune 2h sword";
        x.var2[x.var1[46]] = "Blood rune";
        x.var2[x.var1[47]] = "Rune sq shield";
        x.var2[x.var1[48]] = "Dragonstone";
        x.var2[x.var1[49]] = "Silver ore";
        x.var2[x.var1[50]] = "Coins";
        x.var2[x.var1[51]] = "Treasonous ring";
        x.var2[x.var1[52]] = "Rune pickaxe";
        x.var2[x.var1[53]] = "Rune knife";
        x.var2[x.var1[54]] = "Rune kiteshield";
        x.var2[x.var1[55]] = "Dragon med helm";
        x.var2[x.var1[56]] = "Rune spear";
        x.var2[x.var1[57]] = "Shield left half";
        x.var2[x.var1[58]] = "Dragon spear";
        x.var2[x.var1[59]] = "Uncut diamond";
        x.var2[x.var1[60]] = "Ring of wealth";
        x.var2[x.var1[61]] = "Skills necklace";
        x.var2[x.var1[62]] = "Mahogany seed";
        x.var2[x.var1[63]] = "Palm tree seed";
        x.var2[x.var1[64]] = "Dragon pickaxe";
        x.var2[x.var1[65]] = "Dragon 2h sword";
        x.var2[x.var1[66]] = "Red spiders' eggs";
        x.var2[x.var1[67]] = "Unicorn horn";
        x.var2[x.var1[68]] = "Uncut dragonstone";
        x.var2[x.var1[69]] = "Grimy snapdragon";
        x.var2[x.var1[70]] = "Supercompost";
        x.var2[x.var1[71]] = "Cannonball";
        x.var2[x.var1[72]] = "Mysterious emblem";
        x.var2[x.var1[73]] = "Tanzanite fang";
        x.var2[x.var1[74]] = "Magic fang";
        x.var2[x.var1[75]] = "Serpentine visage";
        x.var2[x.var1[76]] = "Uncut onyx";
        x.var2[x.var1[77]] = "Dragon med helm";
        x.var2[x.var1[78]] = "Dragon halberd";
        x.var2[x.var1[79]] = "Law rune";
        x.var2[x.var1[80]] = "Pure essence";
        x.var2[x.var1[81]] = "Toadflax";
        x.var2[x.var1[82]] = "Snapdragon";
        x.var2[x.var1[83]] = "Dwarf weed";
        x.var2[x.var1[84]] = "Torstol";
        x.var2[x.var1[85]] = "Flax";
        x.var2[x.var1[86]] = "Snakeskin";
        x.var2[x.var1[87]] = "Dragonstone bolt tips";
        x.var2[x.var1[88]] = "Yew logs";
        x.var2[x.var1[89]] = "Mahogany logs";
        x.var2[x.var1[90]] = "Coal";
        x.var2[x.var1[91]] = "Runite ore";
        x.var2[x.var1[92]] = "Calquat tree seed";
        x.var2[x.var1[93]] = "Palm tree seed";
        x.var2[x.var1[94]] = "Papaya tree seed";
        x.var2[x.var1[95]] = "Magic seed";
        x.var2[x.var1[96]] = "Toadflax seed";
        x.var2[x.var1[97]] = "Snapdragon seed";
        x.var2[x.var1[98]] = "Dwarf weed seed";
        x.var2[x.var1[99]] = "Torstol seed";
        x.var2[x.var1[100]] = "Crystal seed";
        x.var2[x.var1[101]] = "Dragon bones";
        x.var2[x.var1[102]] = "Coconut";
        x.var2[x.var1[103]] = "Grapes";
        x.var2[x.var1[104]] = "Battlestaff";
        x.var2[x.var1[105]] = "Manta ray";
        x.var2[x.var1[106]] = "Swamp tar";
        x.var2[x.var1[107]] = "Crushed nest";
        x.var2[x.var1[108]] = "Adamantite bar";
        x.var2[x.var1[109]] = "Uncut sapphire";
        x.var2[x.var1[110]] = "Uncut emerald";
        x.var2[x.var1[111]] = "Uncut ruby";
        x.var2[x.var1[112]] = "Chaos talisman";
        x.var2[x.var1[113]] = "Uncut diamond";
        x.var2[x.var1[114]] = "Rune javelin";
        x.var2[x.var1[115]] = "Loop half of key";
        x.var2[x.var1[116]] = "Tooth half of key";
        x.var2[x.var1[117]] = "Rune spear";
        x.var2[x.var1[118]] = "Shield left half";
        x.var2[x.var1[119]] = "Dragon spear";
        x.var2[x.var1[120]] = "Runite bar";
        x.var2[x.var1[121]] = "Dragonstone";
        x.var2[x.var1[122]] = "Silver ore";
        x.var2[x.var1[123]] = "Rune kiteshield";
        x.var2[x.var1[124]] = "Rune sq shield";
        x.var2[x.var1[125]] = "Rune battleaxe";
        x.var2[x.var1[126]] = "Rune 2h sword";
        x.var2[x.var1[127]] = "Nature rune";
        x.var2[x.var1[128]] = "Steel arrow";
        x.var2[x.var1[129]] = "Rune arrow";
        x.var2[x.var1[130]] = "Adamant javelin";
        x.var2[x.var1[131]] = "Rune javelin";
        x.var2[x.var1[132]] = "Jar of swamp";
        x.var2[x.var1[133]] = "Lizardman fang";
        x.var2[x.var1[134]] = "Red d'hide vamb";
        x.var2[x.var1[135]] = "Xeric's talisman (inert)";
        x.var2[x.var1[5]] = "Ancient shard";
        x.var2[x.var1[136]] = "Eternal gem";
        x.var2[x.var1[137]] = "Imbued heart";
        x.var2[x.var1[138]] = "Mist battlestaff";
        x.var2[x.var1[139]] = "Dust battlestaff";
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var1[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var1[0];
        while (x.var14(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if ((158 + 128 - 117 + 28 ^ 119 + 122 - 95 + 46) != 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private static boolean var12(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        x.var3();
        x.var21();
        ay = LoggerFactory.getLogger(LootingTask.class);
        String[] stringArray = new String[var1[5]];
        stringArray[x.var1[0]] = var2[var1[6]];
        stringArray[x.var1[1]] = var2[var1[7]];
        stringArray[x.var1[2]] = var2[var1[8]];
        stringArray[x.var1[3]] = var2[var1[9]];
        stringArray[x.var1[4]] = var2[var1[10]];
        stringArray[x.var1[6]] = var2[var1[11]];
        stringArray[x.var1[7]] = var2[var1[12]];
        stringArray[x.var1[8]] = var2[var1[13]];
        stringArray[x.var1[9]] = var2[var1[14]];
        stringArray[x.var1[10]] = var2[var1[15]];
        stringArray[x.var1[11]] = var2[var1[16]];
        stringArray[x.var1[12]] = var2[var1[17]];
        stringArray[x.var1[13]] = var2[var1[18]];
        stringArray[x.var1[14]] = var2[var1[19]];
        stringArray[x.var1[15]] = var2[var1[20]];
        stringArray[x.var1[16]] = var2[var1[21]];
        stringArray[x.var1[17]] = var2[var1[22]];
        stringArray[x.var1[18]] = var2[var1[23]];
        stringArray[x.var1[19]] = var2[var1[24]];
        stringArray[x.var1[20]] = var2[var1[25]];
        stringArray[x.var1[21]] = var2[var1[26]];
        stringArray[x.var1[22]] = var2[var1[27]];
        stringArray[x.var1[23]] = var2[var1[28]];
        stringArray[x.var1[24]] = var2[var1[29]];
        stringArray[x.var1[25]] = var2[var1[30]];
        stringArray[x.var1[26]] = var2[var1[31]];
        stringArray[x.var1[27]] = var2[var1[32]];
        stringArray[x.var1[28]] = var2[var1[33]];
        stringArray[x.var1[29]] = var2[var1[34]];
        stringArray[x.var1[30]] = var2[var1[35]];
        stringArray[x.var1[31]] = var2[var1[36]];
        stringArray[x.var1[32]] = var2[var1[37]];
        stringArray[x.var1[33]] = var2[var1[38]];
        stringArray[x.var1[34]] = var2[var1[39]];
        stringArray[x.var1[35]] = var2[var1[40]];
        stringArray[x.var1[36]] = var2[var1[41]];
        stringArray[x.var1[37]] = var2[var1[42]];
        stringArray[x.var1[38]] = var2[var1[43]];
        stringArray[x.var1[39]] = var2[var1[44]];
        stringArray[x.var1[40]] = var2[var1[45]];
        stringArray[x.var1[41]] = var2[var1[46]];
        stringArray[x.var1[42]] = var2[var1[47]];
        stringArray[x.var1[43]] = var2[var1[48]];
        stringArray[x.var1[44]] = var2[var1[49]];
        stringArray[x.var1[45]] = var2[var1[50]];
        stringArray[x.var1[46]] = var2[var1[51]];
        stringArray[x.var1[47]] = var2[var1[52]];
        stringArray[x.var1[48]] = var2[var1[53]];
        stringArray[x.var1[49]] = var2[var1[54]];
        stringArray[x.var1[50]] = var2[var1[55]];
        stringArray[x.var1[51]] = var2[var1[56]];
        stringArray[x.var1[52]] = var2[var1[57]];
        stringArray[x.var1[53]] = var2[var1[58]];
        stringArray[x.var1[54]] = var2[var1[59]];
        stringArray[x.var1[55]] = var2[var1[60]];
        stringArray[x.var1[56]] = var2[var1[61]];
        stringArray[x.var1[57]] = var2[var1[62]];
        stringArray[x.var1[58]] = var2[var1[63]];
        stringArray[x.var1[59]] = var2[var1[64]];
        stringArray[x.var1[60]] = var2[var1[65]];
        stringArray[x.var1[61]] = var2[var1[66]];
        stringArray[x.var1[62]] = var2[var1[67]];
        stringArray[x.var1[63]] = var2[var1[68]];
        stringArray[x.var1[64]] = var2[var1[69]];
        stringArray[x.var1[65]] = var2[var1[70]];
        stringArray[x.var1[66]] = var2[var1[71]];
        stringArray[x.var1[67]] = var2[var1[72]];
        stringArray[x.var1[68]] = var2[var1[73]];
        stringArray[x.var1[69]] = var2[var1[74]];
        stringArray[x.var1[70]] = var2[var1[75]];
        stringArray[x.var1[71]] = var2[var1[76]];
        stringArray[x.var1[72]] = var2[var1[77]];
        stringArray[x.var1[73]] = var2[var1[78]];
        stringArray[x.var1[74]] = var2[var1[79]];
        stringArray[x.var1[75]] = var2[var1[80]];
        stringArray[x.var1[76]] = var2[var1[81]];
        stringArray[x.var1[77]] = var2[var1[82]];
        stringArray[x.var1[78]] = var2[var1[83]];
        stringArray[x.var1[79]] = var2[var1[84]];
        stringArray[x.var1[80]] = var2[var1[85]];
        stringArray[x.var1[81]] = var2[var1[86]];
        stringArray[x.var1[82]] = var2[var1[87]];
        stringArray[x.var1[83]] = var2[var1[88]];
        stringArray[x.var1[84]] = var2[var1[89]];
        stringArray[x.var1[85]] = var2[var1[90]];
        stringArray[x.var1[86]] = var2[var1[91]];
        stringArray[x.var1[87]] = var2[var1[92]];
        stringArray[x.var1[88]] = var2[var1[93]];
        stringArray[x.var1[89]] = var2[var1[94]];
        stringArray[x.var1[90]] = var2[var1[95]];
        stringArray[x.var1[91]] = var2[var1[96]];
        stringArray[x.var1[92]] = var2[var1[97]];
        stringArray[x.var1[93]] = var2[var1[98]];
        stringArray[x.var1[94]] = var2[var1[99]];
        stringArray[x.var1[95]] = var2[var1[100]];
        stringArray[x.var1[96]] = var2[var1[101]];
        stringArray[x.var1[97]] = var2[var1[102]];
        stringArray[x.var1[98]] = var2[var1[103]];
        stringArray[x.var1[99]] = var2[var1[104]];
        stringArray[x.var1[100]] = var2[var1[105]];
        stringArray[x.var1[101]] = var2[var1[106]];
        stringArray[x.var1[102]] = var2[var1[107]];
        stringArray[x.var1[103]] = var2[var1[108]];
        stringArray[x.var1[104]] = var2[var1[109]];
        stringArray[x.var1[105]] = var2[var1[110]];
        stringArray[x.var1[106]] = var2[var1[111]];
        stringArray[x.var1[107]] = var2[var1[112]];
        stringArray[x.var1[108]] = var2[var1[113]];
        stringArray[x.var1[109]] = var2[var1[114]];
        stringArray[x.var1[110]] = var2[var1[115]];
        stringArray[x.var1[111]] = var2[var1[116]];
        stringArray[x.var1[112]] = var2[var1[117]];
        stringArray[x.var1[113]] = var2[var1[118]];
        stringArray[x.var1[114]] = var2[var1[119]];
        stringArray[x.var1[115]] = var2[var1[120]];
        stringArray[x.var1[116]] = var2[var1[121]];
        stringArray[x.var1[117]] = var2[var1[122]];
        stringArray[x.var1[118]] = var2[var1[123]];
        stringArray[x.var1[119]] = var2[var1[124]];
        stringArray[x.var1[120]] = var2[var1[125]];
        stringArray[x.var1[121]] = var2[var1[126]];
        stringArray[x.var1[122]] = var2[var1[127]];
        stringArray[x.var1[123]] = var2[var1[128]];
        stringArray[x.var1[124]] = var2[var1[129]];
        stringArray[x.var1[125]] = var2[var1[130]];
        stringArray[x.var1[126]] = var2[var1[131]];
        stringArray[x.var1[127]] = var2[var1[132]];
        stringArray[x.var1[128]] = var2[var1[133]];
        stringArray[x.var1[129]] = var2[var1[134]];
        stringArray[x.var1[130]] = var2[var1[135]];
        stringArray[x.var1[131]] = var2[var1[5]];
        stringArray[x.var1[132]] = var2[var1[136]];
        stringArray[x.var1[133]] = var2[var1[137]];
        stringArray[x.var1[134]] = var2[var1[138]];
        stringArray[x.var1[135]] = var2[var1[139]];
        az = Arrays.asList(stringArray);
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static boolean var38(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public LootingTask(SquireShamansPlugin squireShamansPlugin, c c2, SquireShamanConfig squireShamanConfig, a a2) {
        this.aD = squireShamansPlugin;
        this.aA = c2;
        this.aB = squireShamanConfig;
        this.aC = a2;
    }

    private static  boolean b(Player player, NPC nPC) {
        int n2;
        if (x.var4(nPC.getName().contains(var2[var1[4]]) ? 1 : 0) && x.var38(nPC.getInteracting(), player)) {
            n2 = var1[1];
            0;
            
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }
}

