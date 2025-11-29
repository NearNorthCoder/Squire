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
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.a;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

@TaskDesc(name="Looting", priority=20, blocking=true)
public class x
extends Task {
    public static final /* synthetic */ List<String> az;
    private static /* synthetic */ int[] lIIllIIIlllII;
    private final /* synthetic */ SquireShamansPlugin aD;
    private final /* synthetic */ SquireShamanConfig aB;
    private final /* synthetic */ c aA;
    private final /* synthetic */ a aC;
    private static final /* synthetic */ Logger ay;
    private static /* synthetic */ String[] lIIllIIIllIll;

    private static void lIlIllllIlIllII() {
        lIIllIIIlllII = new int[141];
        x.lIIllIIIlllII[0] = (0xB ^ 0x4F) & ~(0xE9 ^ 0xAD);
        x.lIIllIIIlllII[1] = 1;
        x.lIIllIIIlllII[2] = 2;
        x.lIIllIIIlllII[3] = 3;
        x.lIIllIIIlllII[4] = 0x29 ^ 0x2D;
        x.lIIllIIIlllII[5] = 23 + 21 - -34 + 57;
        x.lIIllIIIlllII[6] = 0x35 ^ 0x30;
        x.lIIllIIIlllII[7] = 0x1B ^ 0x1C ^ 1;
        x.lIIllIIIlllII[8] = 0x80 ^ 0x91 ^ (0x1B ^ 0xD);
        x.lIIllIIIlllII[9] = 0xDA ^ 0x84 ^ (0xF9 ^ 0xAF);
        x.lIIllIIIlllII[10] = 76 + 113 - 161 + 108 ^ 38 + 42 - 64 + 113;
        x.lIIllIIIlllII[11] = 49 + 13 - 46 + 120 ^ 82 + 4 - 33 + 77;
        x.lIIllIIIlllII[12] = 0x85 ^ 0x9C ^ (0xE ^ 0x1C);
        x.lIIllIIIlllII[13] = 35 + 52 - 49 + 89 ^ (0xDC ^ 0xAF);
        x.lIIllIIIlllII[14] = 0x3A ^ 0x37;
        x.lIIllIIIlllII[15] = 0x88 ^ 0x86;
        x.lIIllIIIlllII[16] = 0x40 ^ 0x4F;
        x.lIIllIIIlllII[17] = 0x8D ^ 0x9D;
        x.lIIllIIIlllII[18] = 0xB4 ^ 0xA5;
        x.lIIllIIIlllII[19] = 0x6F ^ 0x7D;
        x.lIIllIIIlllII[20] = 0x65 ^ 0x76;
        x.lIIllIIIlllII[21] = 0x2C ^ 0x38;
        x.lIIllIIIlllII[22] = 0x61 ^ 0x74;
        x.lIIllIIIlllII[23] = 0xE6 ^ 0x8B ^ (0xC5 ^ 0xBE);
        x.lIIllIIIlllII[24] = 175 + 117 - 273 + 165 ^ 159 + 10 - 17 + 23;
        x.lIIllIIIlllII[25] = 177 + 141 - 144 + 4 ^ 54 + 13 - 37 + 140;
        x.lIIllIIIlllII[26] = 0x64 ^ 0x7D;
        x.lIIllIIIlllII[27] = 0xD5 ^ 0x93 ^ (0xD2 ^ 0x8E);
        x.lIIllIIIlllII[28] = 0x3B ^ 0x66 ^ (0x7C ^ 0x3A);
        x.lIIllIIIlllII[29] = 96 + 24 - 5 + 71 ^ 80 + 109 - 47 + 24;
        x.lIIllIIIlllII[30] = 123 + 39 - 43 + 103 ^ 89 + 35 - 108 + 179;
        x.lIIllIIIlllII[31] = 68 + 153 - 123 + 73 ^ 94 + 161 - 215 + 141;
        x.lIIllIIIlllII[32] = 0x35 ^ 0x2A;
        x.lIIllIIIlllII[33] = 0x10 ^ 0x30;
        x.lIIllIIIlllII[34] = 0x73 ^ 0x52;
        x.lIIllIIIlllII[35] = 0x87 ^ 0xA5;
        x.lIIllIIIlllII[36] = 0x2B ^ 8;
        x.lIIllIIIlllII[37] = 0x36 ^ 0x53 ^ (0x2E ^ 0x6F);
        x.lIIllIIIlllII[38] = 0xE2 ^ 0xC7;
        x.lIIllIIIlllII[39] = 0xE7 ^ 0xC1;
        x.lIIllIIIlllII[40] = 0x6F ^ 0x56 ^ (0xA8 ^ 0xB6);
        x.lIIllIIIlllII[41] = 0x61 ^ 0x49;
        x.lIIllIIIlllII[42] = 0x29 ^ 0;
        x.lIIllIIIlllII[43] = 0x80 ^ 0xAA;
        x.lIIllIIIlllII[44] = 0x94 ^ 0x8C ^ (0x4C ^ 0x7F);
        x.lIIllIIIlllII[45] = 0xAE ^ 0x82;
        x.lIIllIIIlllII[46] = 0x10 ^ 0x2B ^ (0x2A ^ 0x3C);
        x.lIIllIIIlllII[47] = 0x3A ^ 1 ^ (0x33 ^ 0x26);
        x.lIIllIIIlllII[48] = 0x4D ^ 0x58 ^ (0x50 ^ 0x6A);
        x.lIIllIIIlllII[49] = 66 + 89 - 82 + 88 ^ 85 + 8 - 28 + 80;
        x.lIIllIIIlllII[50] = 75 + 74 - 140 + 164 ^ 94 + 139 - 101 + 24;
        x.lIIllIIIlllII[51] = 0x93 ^ 0xA1;
        x.lIIllIIIlllII[52] = 0xBA ^ 0x89;
        x.lIIllIIIlllII[53] = 0x60 ^ 0x20 ^ (0x6E ^ 0x1A);
        x.lIIllIIIlllII[54] = 0xBB ^ 0xAA ^ (0x2F ^ 0xB);
        x.lIIllIIIlllII[55] = 8 ^ 0x75 ^ (0x2A ^ 0x61);
        x.lIIllIIIlllII[56] = 0x6B ^ 0x5C;
        x.lIIllIIIlllII[57] = 0xA9 ^ 0x91;
        x.lIIllIIIlllII[58] = 0xCF ^ 0xC5 ^ (0x70 ^ 0x43);
        x.lIIllIIIlllII[59] = 0x80 ^ 0xBA;
        x.lIIllIIIlllII[60] = 0x7F ^ 0x44;
        x.lIIllIIIlllII[61] = 0x6D ^ 0x44 ^ (0x96 ^ 0x83);
        x.lIIllIIIlllII[62] = 0xBA ^ 0x87;
        x.lIIllIIIlllII[63] = 0x5D ^ 0x63;
        x.lIIllIIIlllII[64] = 0x2C ^ 0x5D ^ (0xD1 ^ 0x9F);
        x.lIIllIIIlllII[65] = 0x88 ^ 0xA1 ^ (0xEC ^ 0x85);
        x.lIIllIIIlllII[66] = 5 ^ 0x4E ^ (0xA3 ^ 0xA9);
        x.lIIllIIIlllII[67] = 13 + 70 - -86 + 83 ^ 14 + 117 - -4 + 55;
        x.lIIllIIIlllII[68] = 0x61 ^ 0x2C ^ (0x7B ^ 0x75);
        x.lIIllIIIlllII[69] = 0x68 ^ 0x2C;
        x.lIIllIIIlllII[70] = 0x71 ^ 0x34;
        x.lIIllIIIlllII[71] = 87 + 111 - 158 + 211 ^ 177 + 78 - 165 + 99;
        x.lIIllIIIlllII[72] = 0x21 ^ 0x66;
        x.lIIllIIIlllII[73] = 0xA7 ^ 0xB9 ^ (0x5F ^ 9);
        x.lIIllIIIlllII[74] = 0x55 ^ 0x1C;
        x.lIIllIIIlllII[75] = 107 + 143 - 159 + 127 ^ 96 + 106 - 142 + 84;
        x.lIIllIIIlllII[76] = 0x46 ^ 0xD;
        x.lIIllIIIlllII[77] = 0x4B ^ 7;
        x.lIIllIIIlllII[78] = 3 ^ 0x4E;
        x.lIIllIIIlllII[79] = 0x25 ^ 0x6B;
        x.lIIllIIIlllII[80] = 0x69 ^ 0x26;
        x.lIIllIIIlllII[81] = 8 ^ 0x58;
        x.lIIllIIIlllII[82] = 31 + 76 - -55 + 37 ^ 113 + 140 - 204 + 101;
        x.lIIllIIIlllII[83] = 2 ^ 0x7E ^ (0x5F ^ 0x71);
        x.lIIllIIIlllII[84] = 0x42 ^ 0x11;
        x.lIIllIIIlllII[85] = 0xE ^ 0x38 ^ (0xEF ^ 0x8D);
        x.lIIllIIIlllII[86] = 0x74 ^ 0x21;
        x.lIIllIIIlllII[87] = 0xBA ^ 0xA6 ^ (0xF2 ^ 0xB8);
        x.lIIllIIIlllII[88] = 0xC9 ^ 0x9E;
        x.lIIllIIIlllII[89] = 0x6D ^ 0x35;
        x.lIIllIIIlllII[90] = 81 + 8 - -34 + 84 ^ 14 + 54 - -70 + 12;
        x.lIIllIIIlllII[91] = 0xA2 ^ 0x91 ^ (0xFE ^ 0x97);
        x.lIIllIIIlllII[92] = 0xC8 ^ 0x93;
        x.lIIllIIIlllII[93] = 0x11 ^ 0x14 ^ (0xFB ^ 0xA2);
        x.lIIllIIIlllII[94] = 0xEA ^ 0xC6 ^ (0x24 ^ 0x55);
        x.lIIllIIIlllII[95] = 0x5D ^ 3;
        x.lIIllIIIlllII[96] = 0x6D ^ 0x32;
        x.lIIllIIIlllII[97] = 0xD4 ^ 0x86 ^ (0xB8 ^ 0x8A);
        x.lIIllIIIlllII[98] = 0x77 ^ 0x23 ^ (0x27 ^ 0x12);
        x.lIIllIIIlllII[99] = 98 + 58 - -49 + 0 ^ 39 + 125 - 158 + 169;
        x.lIIllIIIlllII[100] = 0x5B ^ 0x38;
        x.lIIllIIIlllII[101] = 0xDA ^ 0xBE;
        x.lIIllIIIlllII[102] = 0x3F ^ 0x5A;
        x.lIIllIIIlllII[103] = 0xA4 ^ 0xC2;
        x.lIIllIIIlllII[104] = 36 + 64 - 15 + 117 ^ 159 + 72 - 107 + 49;
        x.lIIllIIIlllII[105] = 0xE8 ^ 0xAA ^ (0xE ^ 0x24);
        x.lIIllIIIlllII[106] = 190 + 30 - 3 + 13 ^ 127 + 111 - 183 + 88;
        x.lIIllIIIlllII[107] = 8 ^ 0x62;
        x.lIIllIIIlllII[108] = 0x4B ^ 7 ^ (0xBF ^ 0x98);
        x.lIIllIIIlllII[109] = 0x5E ^ 0x32;
        x.lIIllIIIlllII[110] = 130 + 12 - -97 + 11 ^ 21 + 96 - -30 + 4;
        x.lIIllIIIlllII[111] = 0x19 ^ 0x58 ^ (0x1E ^ 0x31);
        x.lIIllIIIlllII[112] = 0xE4 ^ 0xC0 ^ (0x79 ^ 0x32);
        x.lIIllIIIlllII[113] = 0x55 ^ 0x25 ^ (0xEB ^ 0xC2) & ~(0x93 ^ 0xBA);
        x.lIIllIIIlllII[114] = 4 ^ 0x6B ^ (0x29 ^ 0x37);
        x.lIIllIIIlllII[115] = 69 + 148 - 181 + 180 ^ 108 + 5 - 79 + 136;
        x.lIIllIIIlllII[116] = 40 + 135 - 89 + 132 ^ 128 + 152 - 149 + 38;
        x.lIIllIIIlllII[117] = 0x54 ^ 0x20;
        x.lIIllIIIlllII[118] = 0xF6 ^ 0x83;
        x.lIIllIIIlllII[119] = 0x41 ^ 0x37;
        x.lIIllIIIlllII[120] = 0x41 ^ 5 ^ (0xB8 ^ 0x8B);
        x.lIIllIIIlllII[121] = 147 + 33 - 140 + 191 ^ 101 + 157 - 126 + 27;
        x.lIIllIIIlllII[122] = 0xD9 ^ 0xA0;
        x.lIIllIIIlllII[123] = 0xCE ^ 0xB4;
        x.lIIllIIIlllII[124] = 0x66 ^ 0x6B ^ (0xCF ^ 0xB9);
        x.lIIllIIIlllII[125] = 207 + 137 - 322 + 212 ^ 111 + 21 - 114 + 132;
        x.lIIllIIIlllII[126] = 0xE3 ^ 0xB2 ^ (0xA3 ^ 0x8F);
        x.lIIllIIIlllII[127] = 0xE2 ^ 0x9C;
        x.lIIllIIIlllII[128] = 67 + 48 - 72 + 84;
        x.lIIllIIIlllII[129] = 110 + 54 - 51 + 15;
        x.lIIllIIIlllII[130] = 86 + 121 - 194 + 116;
        x.lIIllIIIlllII[131] = 83 + 36 - 86 + 97;
        x.lIIllIIIlllII[132] = (0xFA ^ 0xB7) + (0xF3 ^ 0xA5) - (0x72 ^ 0x58) + (0x9B ^ 0x91);
        x.lIIllIIIlllII[133] = 82 + 13 - 6 + 42 + (0xEA ^ 0xB0) - (0x63 ^ 0x3F) + 3;
        x.lIIllIIIlllII[134] = (3 ^ 0x38) + (0xA4 ^ 0xBE) - (0x7A ^ 0x61) + (0x18 ^ 0x53);
        x.lIIllIIIlllII[135] = 69 + 97 - 93 + 61;
        x.lIIllIIIlllII[136] = (0x50 ^ 0x3D) + (0x9A ^ 0x84) - (0xDB ^ 0xC5) + (0x9B ^ 0x80);
        x.lIIllIIIlllII[137] = 92 + 4 - 25 + 66;
        x.lIIllIIIlllII[138] = 18 + 68 - -37 + 15;
        x.lIIllIIIlllII[139] = 43 + 137 - 94 + 53;
        x.lIIllIIIlllII[140] = 70 + 132 - 175 + 113;
    }

    private static boolean lIlIllllIlIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllllIlIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        TileItem llllllllllllllIllllIIIlIlllllIII;
        x llllllllllllllIllllIIIlIlllllIlI;
        block12: {
            block10: {
                block11: {
                    void llllllllllllllIllllIIIlIlllllIIl;
                    Player player = Players.getLocal();
                    if (x.lIlIllllIlIllIl(this.aB.room().x().contains((Locatable)player) ? 1 : 0)) {
                        this.aC.g(lIIllIIIlllII[0]);
                        return lIIllIIIlllII[0];
                    }
                    if (x.lIlIllllIlIlllI(llllllllllllllIllllIIIlIlllllIlI.aD.j() ? 1 : 0)) {
                        return lIIllIIIlllII[0];
                    }
                    llllllllllllllIllllIIIlIlllllIII = llllllllllllllIllllIIIlIlllllIlI.aC.k().orElse(null);
                    if (x.lIlIllllIlIllll(llllllllllllllIllllIIIlIlllllIII)) {
                        llllllllllllllIllllIIIlIlllllIlI.aC.g(lIIllIIIlllII[0]);
                        return lIIllIIIlllII[0];
                    }
                    if (x.lIlIllllIlIllIl(llllllllllllllIllllIIIlIlllllIlI.aB.room().x().contains((Locatable)llllllllllllllIllllIIIlIlllllIII) ? 1 : 0)) {
                        llllllllllllllIllllIIIlIlllllIlI.aC.g(lIIllIIIlllII[0]);
                        return lIIllIIIlllII[0];
                    }
                    NPC llllllllllllllIllllIIIlIllllIlll = Combat.getAttackableNPC(arg_0 -> x.b((Player)llllllllllllllIllllIIIlIlllllIIl, arg_0));
                    if (x.lIlIllllIllIIII(llllllllllllllIllllIIIlIllllIlll) && x.lIlIllllIlIlllI(llllllllllllllIllllIIIlIllllIlll.getWorldArea().contains((Locatable)llllllllllllllIllllIIIlIlllllIII) ? 1 : 0)) {
                        llllllllllllllIllllIIIlIlllllIlI.aC.g(lIIllIIIlllII[0]);
                        return lIIllIIIlllII[0];
                    }
                    if (!x.lIlIllllIllIIIl(Prices.getItemPrice((int)llllllllllllllIllllIIIlIlllllIII.getId()) * llllllllllllllIllllIIIlIlllllIII.getQuantity(), llllllllllllllIllllIIIlIlllllIlI.aB.lootValue())) break block10;
                    if (!x.lIlIllllIlIlllI(Inventory.isFull() ? 1 : 0)) break block11;
                    int[] nArray = new int[lIIllIIIlllII[1]];
                    nArray[x.lIIllIIIlllII[0]] = llllllllllllllIllllIIIlIlllllIII.getId();
                    if (!x.lIlIllllIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                }
                if (!x.lIlIllllIlIlllI(llllllllllllllIllllIIIlIlllllIII.isStackable() ? 1 : 0)) break block12;
            }
            llllllllllllllIllllIIIlIlllllIlI.aC.g(lIIllIIIlllII[1]);
            if (x.lIlIllllIlIlllI(Inventory.isFull() ? 1 : 0)) {
                Item llllllllllllllIllllIIIlIllllIllI = Inventory.getFirst(item -> {
                    String[] stringArray = new String[lIIllIIIlllII[1]];
                    stringArray[x.lIIllIIIlllII[0]] = lIIllIIIllIll[lIIllIIIlllII[3]];
                    return item.hasAction(stringArray);
                });
                llllllllllllllIllllIIIlIllllIllI.interact(lIIllIIIllIll[lIIllIIIlllII[0]]);
                return lIIllIIIlllII[1];
            }
            llllllllllllllIllllIIIlIlllllIII.interact(lIIllIIIllIll[lIIllIIIlllII[1]]);
            return lIIllIIIlllII[1];
        }
        if (x.lIlIllllIlIlllI(llllllllllllllIllllIIIlIlllllIlI.aC.a(llllllllllllllIllllIIIlIlllllIII) ? 1 : 0) && x.lIlIllllIlIllIl(Inventory.isFull() ? 1 : 0)) {
            llllllllllllllIllllIIIlIlllllIlI.aC.g(lIIllIIIlllII[1]);
            llllllllllllllIllllIIIlIlllllIII.interact(lIIllIIIllIll[lIIllIIIlllII[2]]);
            return lIIllIIIlllII[1];
        }
        this.aC.g(lIIllIIIlllII[0]);
        return lIIllIIIlllII[0];
    }

    private static boolean lIlIllllIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllllIlIlIlI(String llllllllllllllIllllIIIlIllIIIlIl, String llllllllllllllIllllIIIlIllIIIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIlIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlIllIIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIIlllII[9]), "DES");
            Cipher llllllllllllllIllllIIIlIllIIIlll = Cipher.getInstance("DES");
            llllllllllllllIllllIIIlIllIIIlll.init(lIIllIIIlllII[2], llllllllllllllIllllIIIlIllIIlIII);
            return new String(llllllllllllllIllllIIIlIllIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIlIllIIIllI) {
            llllllllllllllIllllIIIlIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIllIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIllllIlIllll(Object object) {
        return object == null;
    }

    private static void lIlIllllIlIlIll() {
        lIIllIIIllIll = new String[lIIllIIIlllII[140]];
        x.lIIllIIIllIll[x.lIIllIIIlllII[0]] = x."Eat";
        x.lIIllIIIllIll[x.lIIllIIIlllII[1]] = x."Take";
        x.lIIllIIIllIll[x.lIIllIIIlllII[2]] = x."Take";
        x.lIIllIIIllIll[x.lIIllIIIlllII[3]] = x."Eat";
        x.lIIllIIIllIll[x.lIIllIIIlllII[4]] = x."Lizardman";
        x.lIIllIIIllIll[x.lIIllIIIlllII[6]] = x."Brimstone key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[7]] = x."Broad arrows";
        x.lIIllIIIllIll[x.lIIllIIIlllII[8]] = x."Mystic earth staff";
        x.lIIllIIIllIll[x.lIIllIIIlllII[9]] = x."Earth battlestaff";
        x.lIIllIIIllIll[x.lIIllIIIlllII[10]] = x."Rune med helm";
        x.lIIllIIIllIll[x.lIIllIIIlllII[11]] = x."Rune chainbody";
        x.lIIllIIIllIll[x.lIIllIIIlllII[12]] = x."Rune warhammer";
        x.lIIllIIIllIll[x.lIIllIIIlllII[13]] = x."Dragon warhammer";
        x.lIIllIIIllIll[x.lIIllIIIlllII[14]] = x."Iron ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[15]] = x."Coal";
        x.lIIllIIIllIll[x.lIIllIIIlllII[16]] = x."Runite ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[17]] = x."Grimy kwuarm";
        x.lIIllIIIllIll[x.lIIllIIIlllII[18]] = x."Grimy dwarf weed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[19]] = x."Grimy lantadyme";
        x.lIIllIIIllIll[x.lIIllIIIlllII[20]] = x."Grimy cadantine";
        x.lIIllIIIllIll[x.lIIllIIIlllII[21]] = x."Ranarr seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[22]] = x."Snapdragon seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[23]] = x."Torstol seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[24]] = x."Maple seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[25]] = x."Yew seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[26]] = x."Magic seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[27]] = x."Celastrus seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[28]] = x."Onyx bolt tips";
        x.lIIllIIIllIll[x.lIIllIIIlllII[29]] = x."Magic logs";
        x.lIIllIIIllIll[x.lIIllIIIlllII[30]] = x."Redwood tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[31]] = x."Dragonfruit tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[32]] = x."Chaos rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[33]] = x."Death rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[34]] = x."Uncut ruby";
        x.lIIllIIIllIll[x.lIIllIIIlllII[35]] = x."Uncut diamond";
        x.lIIllIIIllIll[x.lIIllIIIlllII[36]] = x."Chilli potato";
        x.lIIllIIIllIll[x.lIIllIIIlllII[37]] = x."Loop half of key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[38]] = x."Tooth half of key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[39]] = x."Diamond bolts (e)";
        x.lIIllIIIllIll[x.lIIllIIIlllII[40]] = x."Runite bar";
        x.lIIllIIIllIll[x.lIIllIIIlllII[41]] = x."Nature rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[42]] = x."Rune 2h sword";
        x.lIIllIIIllIll[x.lIIllIIIlllII[43]] = x."Rune battleaxe";
        x.lIIllIIIllIll[x.lIIllIIIlllII[44]] = x."Law rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[45]] = x."Rune 2h sword";
        x.lIIllIIIllIll[x.lIIllIIIlllII[46]] = x."Blood rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[47]] = x."Rune sq shield";
        x.lIIllIIIllIll[x.lIIllIIIlllII[48]] = x."Dragonstone";
        x.lIIllIIIllIll[x.lIIllIIIlllII[49]] = x."Silver ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[50]] = x."Coins";
        x.lIIllIIIllIll[x.lIIllIIIlllII[51]] = x."Treasonous ring";
        x.lIIllIIIllIll[x.lIIllIIIlllII[52]] = x."Rune pickaxe";
        x.lIIllIIIllIll[x.lIIllIIIlllII[53]] = x."Rune knife";
        x.lIIllIIIllIll[x.lIIllIIIlllII[54]] = x."Rune kiteshield";
        x.lIIllIIIllIll[x.lIIllIIIlllII[55]] = x."Dragon med helm";
        x.lIIllIIIllIll[x.lIIllIIIlllII[56]] = x."Rune spear";
        x.lIIllIIIllIll[x.lIIllIIIlllII[57]] = x."Shield left half";
        x.lIIllIIIllIll[x.lIIllIIIlllII[58]] = x."Dragon spear";
        x.lIIllIIIllIll[x.lIIllIIIlllII[59]] = x."Uncut diamond";
        x.lIIllIIIllIll[x.lIIllIIIlllII[60]] = x."Ring of wealth";
        x.lIIllIIIllIll[x.lIIllIIIlllII[61]] = x."Skills necklace";
        x.lIIllIIIllIll[x.lIIllIIIlllII[62]] = x."Mahogany seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[63]] = x."Palm tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[64]] = x."Dragon pickaxe";
        x.lIIllIIIllIll[x.lIIllIIIlllII[65]] = x."Dragon 2h sword";
        x.lIIllIIIllIll[x.lIIllIIIlllII[66]] = x."Red spiders' eggs";
        x.lIIllIIIllIll[x.lIIllIIIlllII[67]] = x."Unicorn horn";
        x.lIIllIIIllIll[x.lIIllIIIlllII[68]] = x."Uncut dragonstone";
        x.lIIllIIIllIll[x.lIIllIIIlllII[69]] = x."Grimy snapdragon";
        x.lIIllIIIllIll[x.lIIllIIIlllII[70]] = x."Supercompost";
        x.lIIllIIIllIll[x.lIIllIIIlllII[71]] = x."Cannonball";
        x.lIIllIIIllIll[x.lIIllIIIlllII[72]] = x."Mysterious emblem";
        x.lIIllIIIllIll[x.lIIllIIIlllII[73]] = x."Tanzanite fang";
        x.lIIllIIIllIll[x.lIIllIIIlllII[74]] = x."Magic fang";
        x.lIIllIIIllIll[x.lIIllIIIlllII[75]] = x."Serpentine visage";
        x.lIIllIIIllIll[x.lIIllIIIlllII[76]] = x."Uncut onyx";
        x.lIIllIIIllIll[x.lIIllIIIlllII[77]] = x."Dragon med helm";
        x.lIIllIIIllIll[x.lIIllIIIlllII[78]] = x."Dragon halberd";
        x.lIIllIIIllIll[x.lIIllIIIlllII[79]] = x."Law rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[80]] = x."Pure essence";
        x.lIIllIIIllIll[x.lIIllIIIlllII[81]] = x."Toadflax";
        x.lIIllIIIllIll[x.lIIllIIIlllII[82]] = x."Snapdragon";
        x.lIIllIIIllIll[x.lIIllIIIlllII[83]] = x."Dwarf weed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[84]] = x."Torstol";
        x.lIIllIIIllIll[x.lIIllIIIlllII[85]] = x."Flax";
        x.lIIllIIIllIll[x.lIIllIIIlllII[86]] = x."Snakeskin";
        x.lIIllIIIllIll[x.lIIllIIIlllII[87]] = x."Dragonstone bolt tips";
        x.lIIllIIIllIll[x.lIIllIIIlllII[88]] = x."Yew logs";
        x.lIIllIIIllIll[x.lIIllIIIlllII[89]] = x."Mahogany logs";
        x.lIIllIIIllIll[x.lIIllIIIlllII[90]] = x."Coal";
        x.lIIllIIIllIll[x.lIIllIIIlllII[91]] = x."Runite ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[92]] = x."Calquat tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[93]] = x."Palm tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[94]] = x."Papaya tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[95]] = x."Magic seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[96]] = x."Toadflax seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[97]] = x."Snapdragon seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[98]] = x."Dwarf weed seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[99]] = x."Torstol seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[100]] = x."Crystal seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[101]] = x."Dragon bones";
        x.lIIllIIIllIll[x.lIIllIIIlllII[102]] = x."Coconut";
        x.lIIllIIIllIll[x.lIIllIIIlllII[103]] = x."Grapes";
        x.lIIllIIIllIll[x.lIIllIIIlllII[104]] = x."Battlestaff";
        x.lIIllIIIllIll[x.lIIllIIIlllII[105]] = x."Manta ray";
        x.lIIllIIIllIll[x.lIIllIIIlllII[106]] = x."Swamp tar";
        x.lIIllIIIllIll[x.lIIllIIIlllII[107]] = x."Crushed nest";
        x.lIIllIIIllIll[x.lIIllIIIlllII[108]] = x."Adamantite bar";
        x.lIIllIIIllIll[x.lIIllIIIlllII[109]] = x."Uncut sapphire";
        x.lIIllIIIllIll[x.lIIllIIIlllII[110]] = x."Uncut emerald";
        x.lIIllIIIllIll[x.lIIllIIIlllII[111]] = x."Uncut ruby";
        x.lIIllIIIllIll[x.lIIllIIIlllII[112]] = x."Chaos talisman";
        x.lIIllIIIllIll[x.lIIllIIIlllII[113]] = x."Uncut diamond";
        x.lIIllIIIllIll[x.lIIllIIIlllII[114]] = x."Rune javelin";
        x.lIIllIIIllIll[x.lIIllIIIlllII[115]] = x."Loop half of key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[116]] = x."Tooth half of key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[117]] = x."Rune spear";
        x.lIIllIIIllIll[x.lIIllIIIlllII[118]] = x."Shield left half";
        x.lIIllIIIllIll[x.lIIllIIIlllII[119]] = x."Dragon spear";
        x.lIIllIIIllIll[x.lIIllIIIlllII[120]] = x."Runite bar";
        x.lIIllIIIllIll[x.lIIllIIIlllII[121]] = x."Dragonstone";
        x.lIIllIIIllIll[x.lIIllIIIlllII[122]] = x."Silver ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[123]] = x."Rune kiteshield";
        x.lIIllIIIllIll[x.lIIllIIIlllII[124]] = x."Rune sq shield";
        x.lIIllIIIllIll[x.lIIllIIIlllII[125]] = x."Rune battleaxe";
        x.lIIllIIIllIll[x.lIIllIIIlllII[126]] = x."Rune 2h sword";
        x.lIIllIIIllIll[x.lIIllIIIlllII[127]] = x."Nature rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[128]] = x."Steel arrow";
        x.lIIllIIIllIll[x.lIIllIIIlllII[129]] = x."Rune arrow";
        x.lIIllIIIllIll[x.lIIllIIIlllII[130]] = x."Adamant javelin";
        x.lIIllIIIllIll[x.lIIllIIIlllII[131]] = x."Rune javelin";
        x.lIIllIIIllIll[x.lIIllIIIlllII[132]] = x."Jar of swamp";
        x.lIIllIIIllIll[x.lIIllIIIlllII[133]] = x."Lizardman fang";
        x.lIIllIIIllIll[x.lIIllIIIlllII[134]] = x."Red d'hide vamb";
        x.lIIllIIIllIll[x.lIIllIIIlllII[135]] = x."Xeric's talisman (inert)";
        x.lIIllIIIllIll[x.lIIllIIIlllII[5]] = x."Ancient shard";
        x.lIIllIIIllIll[x.lIIllIIIlllII[136]] = x."Eternal gem";
        x.lIIllIIIllIll[x.lIIllIIIlllII[137]] = x."Imbued heart";
        x.lIIllIIIllIll[x.lIIllIIIlllII[138]] = x."Mist battlestaff";
        x.lIIllIIIllIll[x.lIIllIIIlllII[139]] = x."Dust battlestaff";
    }

    private static String lIlIllllIlIlIIl(String llllllllllllllIllllIIIlIllIllIlI, String llllllllllllllIllllIIIlIllIllIIl) {
        llllllllllllllIllllIIIlIllIllIlI = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIlIllIllIII = new StringBuilder();
        char[] llllllllllllllIllllIIIlIllIlIlll = llllllllllllllIllllIIIlIllIllIIl.toCharArray();
        int llllllllllllllIllllIIIlIllIlIllI = lIIllIIIlllII[0];
        char[] llllllllllllllIllllIIIlIllIlIIII = llllllllllllllIllllIIIlIllIllIlI.toCharArray();
        int llllllllllllllIllllIIIlIllIIllll = llllllllllllllIllllIIIlIllIlIIII.length;
        int llllllllllllllIllllIIIlIllIIlllI = lIIllIIIlllII[0];
        while (x.lIlIllllIllIIll(llllllllllllllIllllIIIlIllIIlllI, llllllllllllllIllllIIIlIllIIllll)) {
            char llllllllllllllIllllIIIlIllIllIll = llllllllllllllIllllIIIlIllIlIIII[llllllllllllllIllllIIIlIllIIlllI];
            llllllllllllllIllllIIIlIllIllIII.append((char)(llllllllllllllIllllIIIlIllIllIll ^ llllllllllllllIllllIIIlIllIlIlll[llllllllllllllIllllIIIlIllIlIllI % llllllllllllllIllllIIIlIllIlIlll.length]));
            0;
            ++llllllllllllllIllllIIIlIllIlIllI;
            ++llllllllllllllIllllIIIlIllIIlllI;
            0;
            if ((158 + 128 - 117 + 28 ^ 119 + 122 - 95 + 46) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIlIllIllIII);
    }

    private static boolean lIlIllllIllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        x.lIlIllllIlIllII();
        x.lIlIllllIlIlIll();
        ay = LoggerFactory.getLogger(x.class);
        String[] stringArray = new String[lIIllIIIlllII[5]];
        stringArray[x.lIIllIIIlllII[0]] = lIIllIIIllIll[lIIllIIIlllII[6]];
        stringArray[x.lIIllIIIlllII[1]] = lIIllIIIllIll[lIIllIIIlllII[7]];
        stringArray[x.lIIllIIIlllII[2]] = lIIllIIIllIll[lIIllIIIlllII[8]];
        stringArray[x.lIIllIIIlllII[3]] = lIIllIIIllIll[lIIllIIIlllII[9]];
        stringArray[x.lIIllIIIlllII[4]] = lIIllIIIllIll[lIIllIIIlllII[10]];
        stringArray[x.lIIllIIIlllII[6]] = lIIllIIIllIll[lIIllIIIlllII[11]];
        stringArray[x.lIIllIIIlllII[7]] = lIIllIIIllIll[lIIllIIIlllII[12]];
        stringArray[x.lIIllIIIlllII[8]] = lIIllIIIllIll[lIIllIIIlllII[13]];
        stringArray[x.lIIllIIIlllII[9]] = lIIllIIIllIll[lIIllIIIlllII[14]];
        stringArray[x.lIIllIIIlllII[10]] = lIIllIIIllIll[lIIllIIIlllII[15]];
        stringArray[x.lIIllIIIlllII[11]] = lIIllIIIllIll[lIIllIIIlllII[16]];
        stringArray[x.lIIllIIIlllII[12]] = lIIllIIIllIll[lIIllIIIlllII[17]];
        stringArray[x.lIIllIIIlllII[13]] = lIIllIIIllIll[lIIllIIIlllII[18]];
        stringArray[x.lIIllIIIlllII[14]] = lIIllIIIllIll[lIIllIIIlllII[19]];
        stringArray[x.lIIllIIIlllII[15]] = lIIllIIIllIll[lIIllIIIlllII[20]];
        stringArray[x.lIIllIIIlllII[16]] = lIIllIIIllIll[lIIllIIIlllII[21]];
        stringArray[x.lIIllIIIlllII[17]] = lIIllIIIllIll[lIIllIIIlllII[22]];
        stringArray[x.lIIllIIIlllII[18]] = lIIllIIIllIll[lIIllIIIlllII[23]];
        stringArray[x.lIIllIIIlllII[19]] = lIIllIIIllIll[lIIllIIIlllII[24]];
        stringArray[x.lIIllIIIlllII[20]] = lIIllIIIllIll[lIIllIIIlllII[25]];
        stringArray[x.lIIllIIIlllII[21]] = lIIllIIIllIll[lIIllIIIlllII[26]];
        stringArray[x.lIIllIIIlllII[22]] = lIIllIIIllIll[lIIllIIIlllII[27]];
        stringArray[x.lIIllIIIlllII[23]] = lIIllIIIllIll[lIIllIIIlllII[28]];
        stringArray[x.lIIllIIIlllII[24]] = lIIllIIIllIll[lIIllIIIlllII[29]];
        stringArray[x.lIIllIIIlllII[25]] = lIIllIIIllIll[lIIllIIIlllII[30]];
        stringArray[x.lIIllIIIlllII[26]] = lIIllIIIllIll[lIIllIIIlllII[31]];
        stringArray[x.lIIllIIIlllII[27]] = lIIllIIIllIll[lIIllIIIlllII[32]];
        stringArray[x.lIIllIIIlllII[28]] = lIIllIIIllIll[lIIllIIIlllII[33]];
        stringArray[x.lIIllIIIlllII[29]] = lIIllIIIllIll[lIIllIIIlllII[34]];
        stringArray[x.lIIllIIIlllII[30]] = lIIllIIIllIll[lIIllIIIlllII[35]];
        stringArray[x.lIIllIIIlllII[31]] = lIIllIIIllIll[lIIllIIIlllII[36]];
        stringArray[x.lIIllIIIlllII[32]] = lIIllIIIllIll[lIIllIIIlllII[37]];
        stringArray[x.lIIllIIIlllII[33]] = lIIllIIIllIll[lIIllIIIlllII[38]];
        stringArray[x.lIIllIIIlllII[34]] = lIIllIIIllIll[lIIllIIIlllII[39]];
        stringArray[x.lIIllIIIlllII[35]] = lIIllIIIllIll[lIIllIIIlllII[40]];
        stringArray[x.lIIllIIIlllII[36]] = lIIllIIIllIll[lIIllIIIlllII[41]];
        stringArray[x.lIIllIIIlllII[37]] = lIIllIIIllIll[lIIllIIIlllII[42]];
        stringArray[x.lIIllIIIlllII[38]] = lIIllIIIllIll[lIIllIIIlllII[43]];
        stringArray[x.lIIllIIIlllII[39]] = lIIllIIIllIll[lIIllIIIlllII[44]];
        stringArray[x.lIIllIIIlllII[40]] = lIIllIIIllIll[lIIllIIIlllII[45]];
        stringArray[x.lIIllIIIlllII[41]] = lIIllIIIllIll[lIIllIIIlllII[46]];
        stringArray[x.lIIllIIIlllII[42]] = lIIllIIIllIll[lIIllIIIlllII[47]];
        stringArray[x.lIIllIIIlllII[43]] = lIIllIIIllIll[lIIllIIIlllII[48]];
        stringArray[x.lIIllIIIlllII[44]] = lIIllIIIllIll[lIIllIIIlllII[49]];
        stringArray[x.lIIllIIIlllII[45]] = lIIllIIIllIll[lIIllIIIlllII[50]];
        stringArray[x.lIIllIIIlllII[46]] = lIIllIIIllIll[lIIllIIIlllII[51]];
        stringArray[x.lIIllIIIlllII[47]] = lIIllIIIllIll[lIIllIIIlllII[52]];
        stringArray[x.lIIllIIIlllII[48]] = lIIllIIIllIll[lIIllIIIlllII[53]];
        stringArray[x.lIIllIIIlllII[49]] = lIIllIIIllIll[lIIllIIIlllII[54]];
        stringArray[x.lIIllIIIlllII[50]] = lIIllIIIllIll[lIIllIIIlllII[55]];
        stringArray[x.lIIllIIIlllII[51]] = lIIllIIIllIll[lIIllIIIlllII[56]];
        stringArray[x.lIIllIIIlllII[52]] = lIIllIIIllIll[lIIllIIIlllII[57]];
        stringArray[x.lIIllIIIlllII[53]] = lIIllIIIllIll[lIIllIIIlllII[58]];
        stringArray[x.lIIllIIIlllII[54]] = lIIllIIIllIll[lIIllIIIlllII[59]];
        stringArray[x.lIIllIIIlllII[55]] = lIIllIIIllIll[lIIllIIIlllII[60]];
        stringArray[x.lIIllIIIlllII[56]] = lIIllIIIllIll[lIIllIIIlllII[61]];
        stringArray[x.lIIllIIIlllII[57]] = lIIllIIIllIll[lIIllIIIlllII[62]];
        stringArray[x.lIIllIIIlllII[58]] = lIIllIIIllIll[lIIllIIIlllII[63]];
        stringArray[x.lIIllIIIlllII[59]] = lIIllIIIllIll[lIIllIIIlllII[64]];
        stringArray[x.lIIllIIIlllII[60]] = lIIllIIIllIll[lIIllIIIlllII[65]];
        stringArray[x.lIIllIIIlllII[61]] = lIIllIIIllIll[lIIllIIIlllII[66]];
        stringArray[x.lIIllIIIlllII[62]] = lIIllIIIllIll[lIIllIIIlllII[67]];
        stringArray[x.lIIllIIIlllII[63]] = lIIllIIIllIll[lIIllIIIlllII[68]];
        stringArray[x.lIIllIIIlllII[64]] = lIIllIIIllIll[lIIllIIIlllII[69]];
        stringArray[x.lIIllIIIlllII[65]] = lIIllIIIllIll[lIIllIIIlllII[70]];
        stringArray[x.lIIllIIIlllII[66]] = lIIllIIIllIll[lIIllIIIlllII[71]];
        stringArray[x.lIIllIIIlllII[67]] = lIIllIIIllIll[lIIllIIIlllII[72]];
        stringArray[x.lIIllIIIlllII[68]] = lIIllIIIllIll[lIIllIIIlllII[73]];
        stringArray[x.lIIllIIIlllII[69]] = lIIllIIIllIll[lIIllIIIlllII[74]];
        stringArray[x.lIIllIIIlllII[70]] = lIIllIIIllIll[lIIllIIIlllII[75]];
        stringArray[x.lIIllIIIlllII[71]] = lIIllIIIllIll[lIIllIIIlllII[76]];
        stringArray[x.lIIllIIIlllII[72]] = lIIllIIIllIll[lIIllIIIlllII[77]];
        stringArray[x.lIIllIIIlllII[73]] = lIIllIIIllIll[lIIllIIIlllII[78]];
        stringArray[x.lIIllIIIlllII[74]] = lIIllIIIllIll[lIIllIIIlllII[79]];
        stringArray[x.lIIllIIIlllII[75]] = lIIllIIIllIll[lIIllIIIlllII[80]];
        stringArray[x.lIIllIIIlllII[76]] = lIIllIIIllIll[lIIllIIIlllII[81]];
        stringArray[x.lIIllIIIlllII[77]] = lIIllIIIllIll[lIIllIIIlllII[82]];
        stringArray[x.lIIllIIIlllII[78]] = lIIllIIIllIll[lIIllIIIlllII[83]];
        stringArray[x.lIIllIIIlllII[79]] = lIIllIIIllIll[lIIllIIIlllII[84]];
        stringArray[x.lIIllIIIlllII[80]] = lIIllIIIllIll[lIIllIIIlllII[85]];
        stringArray[x.lIIllIIIlllII[81]] = lIIllIIIllIll[lIIllIIIlllII[86]];
        stringArray[x.lIIllIIIlllII[82]] = lIIllIIIllIll[lIIllIIIlllII[87]];
        stringArray[x.lIIllIIIlllII[83]] = lIIllIIIllIll[lIIllIIIlllII[88]];
        stringArray[x.lIIllIIIlllII[84]] = lIIllIIIllIll[lIIllIIIlllII[89]];
        stringArray[x.lIIllIIIlllII[85]] = lIIllIIIllIll[lIIllIIIlllII[90]];
        stringArray[x.lIIllIIIlllII[86]] = lIIllIIIllIll[lIIllIIIlllII[91]];
        stringArray[x.lIIllIIIlllII[87]] = lIIllIIIllIll[lIIllIIIlllII[92]];
        stringArray[x.lIIllIIIlllII[88]] = lIIllIIIllIll[lIIllIIIlllII[93]];
        stringArray[x.lIIllIIIlllII[89]] = lIIllIIIllIll[lIIllIIIlllII[94]];
        stringArray[x.lIIllIIIlllII[90]] = lIIllIIIllIll[lIIllIIIlllII[95]];
        stringArray[x.lIIllIIIlllII[91]] = lIIllIIIllIll[lIIllIIIlllII[96]];
        stringArray[x.lIIllIIIlllII[92]] = lIIllIIIllIll[lIIllIIIlllII[97]];
        stringArray[x.lIIllIIIlllII[93]] = lIIllIIIllIll[lIIllIIIlllII[98]];
        stringArray[x.lIIllIIIlllII[94]] = lIIllIIIllIll[lIIllIIIlllII[99]];
        stringArray[x.lIIllIIIlllII[95]] = lIIllIIIllIll[lIIllIIIlllII[100]];
        stringArray[x.lIIllIIIlllII[96]] = lIIllIIIllIll[lIIllIIIlllII[101]];
        stringArray[x.lIIllIIIlllII[97]] = lIIllIIIllIll[lIIllIIIlllII[102]];
        stringArray[x.lIIllIIIlllII[98]] = lIIllIIIllIll[lIIllIIIlllII[103]];
        stringArray[x.lIIllIIIlllII[99]] = lIIllIIIllIll[lIIllIIIlllII[104]];
        stringArray[x.lIIllIIIlllII[100]] = lIIllIIIllIll[lIIllIIIlllII[105]];
        stringArray[x.lIIllIIIlllII[101]] = lIIllIIIllIll[lIIllIIIlllII[106]];
        stringArray[x.lIIllIIIlllII[102]] = lIIllIIIllIll[lIIllIIIlllII[107]];
        stringArray[x.lIIllIIIlllII[103]] = lIIllIIIllIll[lIIllIIIlllII[108]];
        stringArray[x.lIIllIIIlllII[104]] = lIIllIIIllIll[lIIllIIIlllII[109]];
        stringArray[x.lIIllIIIlllII[105]] = lIIllIIIllIll[lIIllIIIlllII[110]];
        stringArray[x.lIIllIIIlllII[106]] = lIIllIIIllIll[lIIllIIIlllII[111]];
        stringArray[x.lIIllIIIlllII[107]] = lIIllIIIllIll[lIIllIIIlllII[112]];
        stringArray[x.lIIllIIIlllII[108]] = lIIllIIIllIll[lIIllIIIlllII[113]];
        stringArray[x.lIIllIIIlllII[109]] = lIIllIIIllIll[lIIllIIIlllII[114]];
        stringArray[x.lIIllIIIlllII[110]] = lIIllIIIllIll[lIIllIIIlllII[115]];
        stringArray[x.lIIllIIIlllII[111]] = lIIllIIIllIll[lIIllIIIlllII[116]];
        stringArray[x.lIIllIIIlllII[112]] = lIIllIIIllIll[lIIllIIIlllII[117]];
        stringArray[x.lIIllIIIlllII[113]] = lIIllIIIllIll[lIIllIIIlllII[118]];
        stringArray[x.lIIllIIIlllII[114]] = lIIllIIIllIll[lIIllIIIlllII[119]];
        stringArray[x.lIIllIIIlllII[115]] = lIIllIIIllIll[lIIllIIIlllII[120]];
        stringArray[x.lIIllIIIlllII[116]] = lIIllIIIllIll[lIIllIIIlllII[121]];
        stringArray[x.lIIllIIIlllII[117]] = lIIllIIIllIll[lIIllIIIlllII[122]];
        stringArray[x.lIIllIIIlllII[118]] = lIIllIIIllIll[lIIllIIIlllII[123]];
        stringArray[x.lIIllIIIlllII[119]] = lIIllIIIllIll[lIIllIIIlllII[124]];
        stringArray[x.lIIllIIIlllII[120]] = lIIllIIIllIll[lIIllIIIlllII[125]];
        stringArray[x.lIIllIIIlllII[121]] = lIIllIIIllIll[lIIllIIIlllII[126]];
        stringArray[x.lIIllIIIlllII[122]] = lIIllIIIllIll[lIIllIIIlllII[127]];
        stringArray[x.lIIllIIIlllII[123]] = lIIllIIIllIll[lIIllIIIlllII[128]];
        stringArray[x.lIIllIIIlllII[124]] = lIIllIIIllIll[lIIllIIIlllII[129]];
        stringArray[x.lIIllIIIlllII[125]] = lIIllIIIllIll[lIIllIIIlllII[130]];
        stringArray[x.lIIllIIIlllII[126]] = lIIllIIIllIll[lIIllIIIlllII[131]];
        stringArray[x.lIIllIIIlllII[127]] = lIIllIIIllIll[lIIllIIIlllII[132]];
        stringArray[x.lIIllIIIlllII[128]] = lIIllIIIllIll[lIIllIIIlllII[133]];
        stringArray[x.lIIllIIIlllII[129]] = lIIllIIIllIll[lIIllIIIlllII[134]];
        stringArray[x.lIIllIIIlllII[130]] = lIIllIIIllIll[lIIllIIIlllII[135]];
        stringArray[x.lIIllIIIlllII[131]] = lIIllIIIllIll[lIIllIIIlllII[5]];
        stringArray[x.lIIllIIIlllII[132]] = lIIllIIIllIll[lIIllIIIlllII[136]];
        stringArray[x.lIIllIIIlllII[133]] = lIIllIIIllIll[lIIllIIIlllII[137]];
        stringArray[x.lIIllIIIlllII[134]] = lIIllIIIllIll[lIIllIIIlllII[138]];
        stringArray[x.lIIllIIIlllII[135]] = lIIllIIIllIll[lIIllIIIlllII[139]];
        az = Arrays.asList(stringArray);
    }

    private static String lIlIllllIlIlIII(String llllllllllllllIllllIIIlIlllIlIII, String llllllllllllllIllllIIIlIlllIIlll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIlIlllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIlIlllIllII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIlIlllIllII.init(lIIllIIIlllII[2], llllllllllllllIllllIIIlIlllIllIl);
            return new String(llllllllllllllIllllIIIlIlllIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIlIlllIlIll) {
            llllllllllllllIllllIIIlIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIllIIlI(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public x(SquireShamansPlugin squireShamansPlugin, c c2, SquireShamanConfig squireShamanConfig, a a2) {
        this.aD = squireShamansPlugin;
        this.aA = c2;
        this.aB = squireShamanConfig;
        this.aC = a2;
    }

    private static /* synthetic */ boolean b(Player player, NPC nPC) {
        int n2;
        if (x.lIlIllllIlIlllI(nPC.getName().contains(lIIllIIIllIll[lIIllIIIlllII[4]]) ? 1 : 0) && x.lIlIllllIllIIlI(nPC.getInteracting(), player)) {
            n2 = lIIllIIIlllII[1];
            0;
            if (1 == 0) {
                return ((0x40 ^ 0x7E ^ (0x16 ^ 0x6E)) & (0xB4 ^ 0x81 ^ (0x31 ^ 0x42) ^ -1)) != 0;
            }
        } else {
            n2 = lIIllIIIlllII[0];
        }
        return n2 != 0;
    }
}

