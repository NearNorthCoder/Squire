/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.h;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.l;

@TaskDesc(name="Prep supplies")
public class k
extends Task {
    static /* synthetic */ WorldArea K;
    private static /* synthetic */ String[] lIIIIIIIllllI;
    static /* synthetic */ WorldArea Q;
    static final /* synthetic */ WorldArea at;
    static final /* synthetic */ WorldArea au;
    static /* synthetic */ int an;
    static /* synthetic */ int am;
    static /* synthetic */ WorldArea ap;
    static final /* synthetic */ WorldArea as;
    static /* synthetic */ WorldPoint al;
    static /* synthetic */ WorldArea aq;
    private final /* synthetic */ SquireMoonsOfPerilConfig aj;
    static /* synthetic */ WorldPoint ak;
    private static /* synthetic */ int[] lIIIIIIIlllll;
    static /* synthetic */ long ao;
    static final /* synthetic */ WorldArea ar;

    static {
        k.lIIlIlllIIlIIIl();
        k.lIIlIlllIIIIllI();
        ak = new WorldPoint(lIIIIIIIlllll[95], lIIIIIIIlllll[96], lIIIIIIIlllll[0]);
        al = new WorldPoint(lIIIIIIIlllll[97], lIIIIIIIlllll[98], lIIIIIIIlllll[0]);
        am = lIIIIIIIlllll[0];
        ao = System.currentTimeMillis();
        ap = new WorldArea(lIIIIIIIlllll[99], lIIIIIIIlllll[100], lIIIIIIIlllll[51], lIIIIIIIlllll[57], lIIIIIIIlllll[0]);
        aq = new WorldArea(lIIIIIIIlllll[101], lIIIIIIIlllll[102], lIIIIIIIlllll[54], lIIIIIIIlllll[50], lIIIIIIIlllll[0]);
        Q = new WorldArea(lIIIIIIIlllll[103], lIIIIIIIlllll[100], lIIIIIIIlllll[51], lIIIIIIIlllll[57], lIIIIIIIlllll[0]);
        K = new WorldArea(lIIIIIIIlllll[104], lIIIIIIIlllll[105], lIIIIIIIlllll[55], lIIIIIIIlllll[55], lIIIIIIIlllll[0]);
        ar = new WorldArea(lIIIIIIIlllll[106], lIIIIIIIlllll[107], lIIIIIIIlllll[66], lIIIIIIIlllll[80], lIIIIIIIlllll[0]);
        as = new WorldArea(lIIIIIIIlllll[106], lIIIIIIIlllll[108], lIIIIIIIlllll[82], lIIIIIIIlllll[109], lIIIIIIIlllll[0]);
        at = new WorldArea(lIIIIIIIlllll[110], lIIIIIIIlllll[102], lIIIIIIIlllll[74], lIIIIIIIlllll[77], lIIIIIIIlllll[0]);
        au = new WorldArea(lIIIIIIIlllll[111], lIIIIIIIlllll[112], lIIIIIIIlllll[63], lIIIIIIIlllll[59], lIIIIIIIlllll[1]);
    }

    private static int lIIlIlllIIllIIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIIlIlllIIlllll(int n, int n2) {
        return n <= n2;
    }

    private static String lIIlIlllIIIIIll(String lllllllllllllllIIIllllIlIIIllIlI, String lllllllllllllllIIIllllIlIIIllllI) {
        lllllllllllllllIIIllllIlIIIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIIllllIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIllllIlIIIlllIl = new StringBuilder();
        char[] lllllllllllllllIIIllllIlIIIlllII = lllllllllllllllIIIllllIlIIIllllI.toCharArray();
        int lllllllllllllllIIIllllIlIIIllIll = lIIIIIIIlllll[0];
        char[] lllllllllllllllIIIllllIlIIIlIlIl = lllllllllllllllIIIllllIlIIIllIlI.toCharArray();
        int lllllllllllllllIIIllllIlIIIlIlII = lllllllllllllllIIIllllIlIIIlIlIl.length;
        int lllllllllllllllIIIllllIlIIIlIIll = lIIIIIIIlllll[0];
        while (k.lIIlIlllIIllIlI(lllllllllllllllIIIllllIlIIIlIIll, lllllllllllllllIIIllllIlIIIlIlII)) {
            char lllllllllllllllIIIllllIlIIlIIIII = lllllllllllllllIIIllllIlIIIlIlIl[lllllllllllllllIIIllllIlIIIlIIll];
            lllllllllllllllIIIllllIlIIIlllIl.append((char)(lllllllllllllllIIIllllIlIIlIIIII ^ lllllllllllllllIIIllllIlIIIlllII[lllllllllllllllIIIllllIlIIIllIll % lllllllllllllllIIIllllIlIIIlllII.length]));
            0;
            ++lllllllllllllllIIIllllIlIIIllIll;
            ++lllllllllllllllIIIllllIlIIIlIIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIllllIlIIIlllIl);
    }

    private static int lIIlIlllIlIIIIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIIlIlllIIlIIll(int n) {
        return n != 0;
    }

    private static String lIIlIlllIIIIlII(String lllllllllllllllIIIllllIlIIIIlIlI, String lllllllllllllllIIIllllIlIIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIllllIlIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlllll[9]), "DES");
            Cipher lllllllllllllllIIIllllIlIIIIllII = Cipher.getInstance("DES");
            lllllllllllllllIIIllllIlIIIIllII.init(lIIIIIIIlllll[2], lllllllllllllllIIIllllIlIIIIllIl);
            return new String(lllllllllllllllIIIllllIlIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIllllIlIIIIlIll) {
            lllllllllllllllIIIllllIlIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIIlIIIl() {
        lIIIIIIIlllll = new int[114];
        k.lIIIIIIIlllll[0] = (0x8C ^ 0x82) & ~(0x31 ^ 0x3F);
        k.lIIIIIIIlllll[1] = 1;
        k.lIIIIIIIlllll[2] = 2;
        k.lIIIIIIIlllll[3] = 3;
        k.lIIIIIIIlllll[4] = 0xAB ^ 0xAF;
        k.lIIIIIIIlllll[5] = 0x57 ^ 0x52;
        k.lIIIIIIIlllll[6] = 0x24 ^ 0x6C ^ (0xDE ^ 0x90);
        k.lIIIIIIIlllll[7] = 0x26 ^ 0x21;
        k.lIIIIIIIlllll[8] = 11 + 38 - -97 + 57 ^ 67 + 33 - 80 + 121;
        k.lIIIIIIIlllll[9] = 1 ^ 9;
        k.lIIIIIIIlllll[10] = 61 + 104 - 126 + 119 ^ 62 + 94 - 12 + 7;
        k.lIIIIIIIlllll[11] = -(0xFFFFFF76 & 0x58D9) & (0xFFFFFFFF & 0x5DFF);
        k.lIIIIIIIlllll[12] = -(0xFFFFFD57 & 0x52EC) & (0xFFFFFDFF & 0x77F3);
        k.lIIIIIIIlllll[13] = 121 + 114 - 185 + 128 ^ 35 + 74 - 49 + 124;
        k.lIIIIIIIlllll[14] = 0 ^ 0x24 ^ (0xB7 ^ 0x98);
        k.lIIIIIIIlllll[15] = 0xB9 ^ 0xB5;
        k.lIIIIIIIlllll[16] = -(0xFFFFFDF3 & 0x7ABF) & (0xFFFFFDF6 & Short.MAX_VALUE);
        k.lIIIIIIIlllll[17] = 0xFFFFFF77 & 0x25FF;
        k.lIIIIIIIlllll[18] = 0x3E ^ 0x1A ^ (0x71 ^ 0x58);
        k.lIIIIIIIlllll[19] = 0xCA ^ 0xC4;
        k.lIIIIIIIlllll[20] = 0x84 ^ 0x8B;
        k.lIIIIIIIlllll[21] = -(0xFFFFCA75 & 0x7F8B) & (0xFFFFFFEF & 0x4F7E);
        k.lIIIIIIIlllll[22] = 0xFFFFE5DF & 0x3FED;
        k.lIIIIIIIlllll[23] = 0x8B ^ 0x9B;
        k.lIIIIIIIlllll[24] = 0x20 ^ 0x3D ^ (0x91 ^ 0x9D);
        k.lIIIIIIIlllll[25] = 179 + 91 - 201 + 118 ^ 16 + 40 - -50 + 63;
        k.lIIIIIIIlllll[26] = 0xBE ^ 0xAD;
        k.lIIIIIIIlllll[27] = 0xA1 ^ 0xB5;
        k.lIIIIIIIlllll[28] = 0x4A ^ 0x5F;
        k.lIIIIIIIlllll[29] = 0xB0 ^ 0xA6;
        k.lIIIIIIIlllll[30] = 0x4B ^ 0xF ^ (0xC1 ^ 0x92);
        k.lIIIIIIIlllll[31] = 0x98 ^ 0x80;
        k.lIIIIIIIlllll[32] = 0xAC ^ 0xB5;
        k.lIIIIIIIlllll[33] = 0x7D ^ 0x67;
        k.lIIIIIIIlllll[34] = 0x61 ^ 0x7A;
        k.lIIIIIIIlllll[35] = 105 + 13 - 100 + 215;
        k.lIIIIIIIlllll[36] = 98 + 0 - 54 + 183;
        k.lIIIIIIIlllll[37] = 0x90 ^ 0x8C;
        k.lIIIIIIIlllll[38] = 0x87 ^ 0x9A;
        k.lIIIIIIIlllll[39] = 0xC6 ^ 0x94 ^ (0x26 ^ 0x6A);
        k.lIIIIIIIlllll[40] = 0x76 ^ 0x3F ^ (0xEC ^ 0xBA);
        k.lIIIIIIIlllll[41] = 0x79 ^ 7 ^ (0xE0 ^ 0xBE);
        k.lIIIIIIIlllll[42] = 0x51 ^ 0x70;
        k.lIIIIIIIlllll[43] = 0x1F ^ 0x3D;
        k.lIIIIIIIlllll[44] = -(0xFFFFF85B & 0xFB5) & (0xFFFFADFD & 0x5FFF);
        k.lIIIIIIIlllll[45] = -(0xFFFFD85F & 0x7FA5) & (0xFFFFFFFF & 0x7DDF);
        k.lIIIIIIIlllll[46] = -(0xFFFFCD3C & 0x36DF) & (0xFFFFBF7F & 0x5DFF);
        k.lIIIIIIIlllll[47] = -(0xFFFFA62F & 0x7BF1) & (0xFFFFBF7C & 0x7FEF);
        k.lIIIIIIIlllll[48] = 61 + 78 - 83 + 76 ^ 126 + 140 - 246 + 147;
        k.lIIIIIIIlllll[49] = 6 ^ 0x22;
        k.lIIIIIIIlllll[50] = 0x9F ^ 0xBA;
        k.lIIIIIIIlllll[51] = 0x7B ^ 0x3F ^ (0x57 ^ 0x35);
        k.lIIIIIIIlllll[52] = 15 + 61 - 2 + 67 ^ 128 + 33 - 148 + 157;
        k.lIIIIIIIlllll[53] = 28 + 47 - 35 + 140 ^ 78 + 0 - 20 + 98;
        k.lIIIIIIIlllll[54] = 0xB ^ 0x73 ^ (0x7B ^ 0x2A);
        k.lIIIIIIIlllll[55] = 62 + 150 - 166 + 115 ^ 4 + 115 - 72 + 92;
        k.lIIIIIIIlllll[56] = 0x77 ^ 0x5C;
        k.lIIIIIIIlllll[57] = 0x5E ^ 0x25 ^ (0xF5 ^ 0xA2);
        k.lIIIIIIIlllll[58] = 3 ^ (0x5E ^ 0x70);
        k.lIIIIIIIlllll[59] = 92 + 57 - 106 + 144 ^ 1 + 9 - -42 + 97;
        k.lIIIIIIIlllll[60] = 110 + 63 - 47 + 6 ^ 64 + 35 - 54 + 126;
        k.lIIIIIIIlllll[61] = 31 + 39 - -83 + 0 ^ 63 + 83 - 14 + 37;
        k.lIIIIIIIlllll[62] = 0x2F ^ 0x1E;
        k.lIIIIIIIlllll[63] = 0x30 ^ 2;
        k.lIIIIIIIlllll[64] = 98 + 81 - 37 + 33 ^ 69 + 97 - 165 + 155;
        k.lIIIIIIIlllll[65] = 0x1B ^ 0x2F;
        k.lIIIIIIIlllll[66] = 3 ^ 0x36;
        k.lIIIIIIIlllll[67] = 0 ^ 0x36;
        k.lIIIIIIIlllll[68] = 0x18 ^ 0x5A ^ (0x3F ^ 0x4A);
        k.lIIIIIIIlllll[69] = 0x62 ^ 0xD ^ (0xF7 ^ 0xA0);
        k.lIIIIIIIlllll[70] = 0xF9 ^ 0xC0;
        k.lIIIIIIIlllll[71] = 0x6A ^ 0x31 ^ (0xE3 ^ 0x82);
        k.lIIIIIIIlllll[72] = 0xFFFFC9F7 & 0x3739;
        k.lIIIIIIIlllll[73] = 8 ^ 0x68 ^ (0x1E ^ 0x45);
        k.lIIIIIIIlllll[74] = 0x79 ^ 0x64 ^ (0x2D ^ 0xC);
        k.lIIIIIIIlllll[75] = 0x7F ^ 0x42;
        k.lIIIIIIIlllll[76] = 124 + 65 - 60 + 125 ^ 144 + 15 - 113 + 146;
        k.lIIIIIIIlllll[77] = 21 + 67 - 17 + 85 ^ 87 + 97 - 91 + 70;
        k.lIIIIIIIlllll[78] = 7 ^ 0x47;
        k.lIIIIIIIlllll[79] = 2 ^ (0x73 ^ 0x30);
        k.lIIIIIIIlllll[80] = 0xFF ^ 0xB5 ^ (0x3C ^ 0x34);
        k.lIIIIIIIlllll[81] = 2 + 87 - -89 + 55 ^ 159 + 87 - 150 + 74;
        k.lIIIIIIIlllll[82] = 0x76 ^ 0x32;
        k.lIIIIIIIlllll[83] = 0xA8 ^ 0xBE ^ (0x69 ^ 0x3A);
        k.lIIIIIIIlllll[84] = 0x51 ^ 9 ^ (0x35 ^ 0x2A);
        k.lIIIIIIIlllll[85] = 14 + 230 - 210 + 204 ^ 112 + 31 - 4 + 27;
        k.lIIIIIIIlllll[86] = 0x69 ^ 0xC ^ (0x8A ^ 0xA6);
        k.lIIIIIIIlllll[87] = 0 ^ 0x4A;
        k.lIIIIIIIlllll[88] = 0x6C ^ 0x27;
        k.lIIIIIIIlllll[89] = 0x68 ^ 0x24;
        k.lIIIIIIIlllll[90] = 0x8A ^ 0xC7;
        k.lIIIIIIIlllll[91] = 0x3A ^ 0x74;
        k.lIIIIIIIlllll[92] = 0x31 ^ 0x7E;
        k.lIIIIIIIlllll[93] = 0x72 ^ 0x22;
        k.lIIIIIIIlllll[94] = 0 ^ 0x51;
        k.lIIIIIIIlllll[95] = 0xFFFFBDF8 & 0x47F7;
        k.lIIIIIIIlllll[96] = -(0xFFFFDE37 & 0x71EF) & (0xFFFFF5FF & Short.MAX_VALUE);
        k.lIIIIIIIlllll[97] = -(0xFFFFFCDF & 0x6337) & (0xFFFFEDFE & 0x77FF);
        k.lIIIIIIIlllll[98] = 0xFFFFB7FE & 0x6DDF;
        k.lIIIIIIIlllll[99] = 0xFFFFADFF & 0x575B;
        k.lIIIIIIIlllll[100] = 0xFFFFEDBB & 0x37CE;
        k.lIIIIIIIlllll[101] = 0xFFFFCFFB & 0x358F;
        k.lIIIIIIIlllll[102] = -(0xFFFFF26D & 0xF93) & (0xFFFFBFBF & 0x67FF);
        k.lIIIIIIIlllll[103] = -(0xFFFFAA25 & 0x7DDB) & (0xFFFFBFBF & 0x6DFF);
        k.lIIIIIIIlllll[104] = -(0xFFFF9A9D & 0x6D67) & (0xFFFFFFFF & 0xDD7);
        k.lIIIIIIIlllll[105] = 0xFFFFFFDD & 0x257A;
        k.lIIIIIIIlllll[106] = 0xFFFF9D7F & 0x67BE;
        k.lIIIIIIIlllll[107] = -(0xFFFFFBE7 & 0x4E19) & (0xFFFFFF3D & 0x6FFF);
        k.lIIIIIIIlllll[108] = -(0xFFFFFA4B & 0x4FF6) & (0xFFFFEFFF & Short.MAX_VALUE);
        k.lIIIIIIIlllll[109] = 0x2E ^ 0x78 ^ 2;
        k.lIIIIIIIlllll[110] = 0xFFFF8FE5 & 0x75DB;
        k.lIIIIIIIlllll[111] = 0xFFFFBF8E & 0x45F7;
        k.lIIIIIIIlllll[112] = -(0xFFFFDB65 & 0x64BF) & (0xFFFFF7EF & 0x6DBF);
        k.lIIIIIIIlllll[113] = 173 + 32 - 54 + 84 ^ 172 + 25 - 38 + 26;
    }

    private static boolean lIIlIlllIIllIlI(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIlllIlIIIlI(int n) {
        return n > 0;
    }

    private static boolean lIIlIlllIIlIllI(Object object) {
        return object != null;
    }

    public static void f() {
        block5: {
            block4: {
                if (!k.lIIlIlllIIlIIll(Inventory.contains(item -> item.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[94]])) ? 1 : 0)) break block4;
                String[] stringArray = new String[lIIIIIIIlllll[1]];
                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[0]];
                if (!k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block5;
            }
            k.h();
            return;
        }
        if (k.lIIlIlllIIlIIll(Inventory.contains(item -> item.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[93]])) ? 1 : 0)) {
            k.g();
            k.i();
            return;
        }
    }

    private static boolean lIIlIlllIIllllI(int n, int n2) {
        return n > n2;
    }

    private static String lIIlIlllIIIIlIl(String lllllllllllllllIIIllllIIllllllIl, String lllllllllllllllIIIllllIIllllllII) {
        try {
            SecretKeySpec lllllllllllllllIIIllllIlIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIIllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIllllIIllllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIllllIIllllllll.init(lIIIIIIIlllll[2], lllllllllllllllIIIllllIlIIIIIIII);
            return new String(lllllllllllllllIIIllllIIllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIllllIIlllllllI) {
            lllllllllllllllIIIllllIIlllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIIlllIl(int n) {
        return n == 0;
    }

    private static void lIIlIlllIIIIllI() {
        lIIIIIIIllllI = new String[lIIIIIIIlllll[113]];
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[0]] = k."Moonlight grub paste";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[1]] = k."Moonlight potion(1)";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[2]] = k."Moonlight potion(2)";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[3]] = k."Moonlight potion(3)";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[4]] = k."Moonlight potion(2)";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[5]] = k."Vial of water";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[6]] = k."Vial of water";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[7]] = k."Drop";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[9]] = k."Drinking tea";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[10]] = k."Make-cuppa";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[13]] = k."Nav to streambound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[14]] = k."Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[15]] = k."Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[18]] = k."Nav to earthbound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[19]] = k."Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[20]] = k."Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[23]] = k."Nav to streambound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[24]] = k."Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[25]] = k."Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[26]] = k."Vial";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[27]] = k."Vial";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[28]] = k."Drop";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[29]] = k."Raw bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[30]] = k."Raw bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[31]] = k."Drop";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[32]] = k."Cooked bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[33]] = k."Cooked bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[34]] = k."Drop";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[37]] = k."Nav to supplies";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[38]] = k."Get Herb supplies";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[39]] = k."Supply crates";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[40]] = k."Moonlight grub paste";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[41]] = k."Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[42]] = k."Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[43]] = k."Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[48]] = k."Nav to grub tile";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[49]] = k."Gathering grubs";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[50]] = k."Grubby sapling";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[51]] = k."Collect-from";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[52]] = k."Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[53]] = k."Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[54]] = k."Crushing grubs";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[55]] = k."Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[56]] = k."Moonlight grub paste";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[57]] = k."Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[58]] = k."Mixing potions";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[59]] = k."Moonlight grub paste";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[60]] = k."Drinking tea";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[61]] = k."Make-cuppa";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[62]] = k."Nav to streambound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[63]] = k."Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[64]] = k."Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[65]] = k."Nav to earthbound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[66]] = k."Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[67]] = k."Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[68]] = k."Nav to streambound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[69]] = k."Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[70]] = k."Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[71]] = k."Raw bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[73]] = k."Nav to supplies";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[74]] = k."Get net";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[75]] = k."Supply crates";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[76]] = k."Nav to fishing tile";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[77]] = k."Fishing";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[78]] = k."Fish";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[79]] = k."Raw bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[80]] = k."Nav to stove";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[81]] = k."Cooking fish";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[82]] = k."Cooking stove";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[83]] = k."Cook";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[8]] = k."Fishing spot";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[84]] = k."Fish";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[85]] = k."Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[86]] = k."Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[87]] = k."Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[88]] = k."Cooking stove";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[89]] = k."Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[90]] = k."Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[91]] = k."Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[92]] = k."Cooking stove";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[93]] = k."Moonlight potion";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[94]] = k."Moonlight potion";
    }

    private static boolean lIIlIlllIIllIll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlllIIlIlll(int n, int n2) {
        return n >= n2;
    }

    /*
     * WARNING - void declaration
     */
    private static void g() {
        void lllllllllllllllIIIllllIlIllIllIl;
        String[] stringArray = new String[lIIIIIIIlllll[1]];
        stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[1]];
        Item item = Inventory.getFirst((String[])stringArray);
        String[] stringArray2 = new String[lIIIIIIIlllll[1]];
        stringArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[2]];
        Item item2 = Inventory.getFirst((String[])stringArray2);
        String[] stringArray3 = new String[lIIIIIIIlllll[1]];
        stringArray3[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[3]];
        Item item3 = Inventory.getFirst((String[])stringArray3);
        if (k.lIIlIlllIIlIllI(item) && k.lIIlIlllIIlIllI(item3)) {
            item.useOn(item3);
            return;
        }
        if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIllIllIl)) {
            void lllllllllllllllIIIllllIlIllIlIll;
            void lllllllllllllllIIIllllIlIllIllll;
            String[] stringArray4 = new String[lIIIIIIIlllll[1]];
            stringArray4[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[4]];
            List lllllllllllllllIIIllllIlIllIlIlI = Inventory.getAll((String[])stringArray4);
            if (k.lIIlIlllIIlIlll(lllllllllllllllIIIllllIlIllIlIlI.size(), lIIIIIIIlllll[2])) {
                ((Item)lllllllllllllllIIIllllIlIllIlIlI.get(lIIIIIIIlllll[0])).useOn((Item)lllllllllllllllIIIllllIlIllIlIlI.get(lIIIIIIIlllll[1]));
                return;
            }
            if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIllIllll)) {
                lllllllllllllllIIIllllIlIllIllll.useOn((Item)lllllllllllllllIIIllllIlIllIllIl);
                return;
            }
            if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIllIlIll)) {
                lllllllllllllllIIIllllIlIllIllIl.useOn((Item)lllllllllllllllIIIllllIlIllIlIll);
                return;
            }
        }
        String[] stringArray5 = new String[lIIIIIIIlllll[1]];
        stringArray5[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[5]];
        if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
            String[] stringArray6 = new String[lIIIIIIIlllll[1]];
            stringArray6[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[6]];
            Inventory.getFirst((String[])stringArray6).interact(lIIIIIIIllllI[lIIIIIIIlllll[7]]);
            return;
        }
    }

    private static void i() {
        TileObject lllllllllllllllIIIllllIlIlIIlIII;
        WorldPoint lllllllllllllllIIIllllIlIlIIlIIl;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n;
            if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[88]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIlllll[5])) {
                n = lIIIIIIIlllll[1];
                0;
                if (-2 >= 0) {
                    return ((0x52 ^ 0x3E ^ (0x21 ^ 0x6D)) & (140 + 106 - 216 + 140 ^ 36 + 11 - 3 + 94 ^ -1)) != 0;
                }
            } else {
                n = lIIIIIIIlllll[0];
            }
            return n != 0;
        });
        if (k.lIIlIlllIIlIllI(tileObject2) && k.lIIlIlllIIllIlI(Movement.getRunEnergy(), lIIIIIIIlllll[8])) {
            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[60]];
            tileObject2.interact(lIIIIIIIllllI[lIIIIIIIlllll[61]]);
            return;
        }
        if (k.lIIlIlllIIlIIll(au.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIIIllllIlIlIIlIIl = new WorldPoint(lIIIIIIIlllll[11], lIIIIIIIlllll[12], lIIIIIIIlllll[1]);
            lllllllllllllllIIIllllIlIlIIlIII = TileObjects.getNearest(tileObject -> {
                int n;
                if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[87]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(lllllllllllllllIIIllllIlIlIIlIIl), lIIIIIIIlllll[5])) {
                    n = lIIIIIIIlllll[1];
                    0;
                    if (((0x30 ^ 0x7A ^ (0xAA ^ 0x83)) & (0xE7 ^ 0xB0 ^ (0xF4 ^ 0xC0) ^ -1)) > 0) {
                        return ((76 + 92 - 2 + 70 ^ 6 + 64 - -53 + 59) & (0x7E ^ 0x20 ^ (3 ^ 7) ^ -1)) != 0;
                    }
                } else {
                    n = lIIIIIIIlllll[0];
                }
                return n != 0;
            });
            if (k.lIIlIlllIIllIll(lllllllllllllllIIIllllIlIlIIlIII)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[62]];
                Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIlIlIIlIIl);
                0;
                return;
            }
            if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlIII)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[63]];
                lllllllllllllllIIIllllIlIlIIlIII.interact(lIIIIIIIllllI[lIIIIIIIlllll[64]]);
                return;
            }
        }
        if (k.lIIlIlllIIlIIll(ar.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIIIllllIlIlIIlIIl = new WorldPoint(lIIIIIIIlllll[16], lIIIIIIIlllll[17], lIIIIIIIlllll[0]);
            lllllllllllllllIIIllllIlIlIIlIII = TileObjects.getNearest(tileObject -> {
                int n;
                if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[86]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(lllllllllllllllIIIllllIlIlIIlIIl), lIIIIIIIlllll[5])) {
                    n = lIIIIIIIlllll[1];
                    0;
                    if (2 == 0) {
                        return ((0x65 ^ 0x7F) & ~(0xB ^ 0x11)) != 0;
                    }
                } else {
                    n = lIIIIIIIlllll[0];
                }
                return n != 0;
            });
            if (k.lIIlIlllIIllIll(lllllllllllllllIIIllllIlIlIIlIII)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[65]];
                Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIlIlIIlIIl);
                0;
                return;
            }
            if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlIII)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[66]];
                lllllllllllllllIIIllllIlIlIIlIII.interact(lIIIIIIIllllI[lIIIIIIIlllll[67]]);
                return;
            }
        }
        if (k.lIIlIlllIIlIIll(as.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIIIllllIlIlIIlIIl = new WorldPoint(lIIIIIIIlllll[21], lIIIIIIIlllll[22], lIIIIIIIlllll[0]);
            lllllllllllllllIIIllllIlIlIIlIII = TileObjects.getNearest(tileObject -> {
                int n;
                if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[85]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(lllllllllllllllIIIllllIlIlIIlIIl), lIIIIIIIlllll[7])) {
                    n = lIIIIIIIlllll[1];
                    0;
                    if (2 < 2) {
                        return ((29 + 156 - 91 + 121 ^ 92 + 102 - 84 + 47) & (151 + 184 - 272 + 139 ^ 116 + 70 - 117 + 59 ^ -1)) != 0;
                    }
                } else {
                    n = lIIIIIIIlllll[0];
                }
                return n != 0;
            });
            if (k.lIIlIlllIIllIll(lllllllllllllllIIIllllIlIlIIlIII)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[68]];
                Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIlIlIIlIIl);
                0;
                return;
            }
            if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlIII)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[69]];
                lllllllllllllllIIIllllIlIlIIlIII.interact(lIIIIIIIllllI[lIIIIIIIlllll[70]]);
                return;
            }
        }
        if (k.lIIlIlllIIlIIll(at.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (k.lIIlIlllIIlllIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIlllll[1]];
                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[71]];
                if (!k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0) || k.lIIlIlllIlIIIlI(Inventory.getFreeSlots())) {
                    int[] nArray = new int[lIIIIIIIlllll[1]];
                    nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[72];
                    if (k.lIIlIlllIIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[73]];
                            Movement.walkTo((WorldPoint)al);
                            0;
                            return;
                        }
                        if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[74]];
                            String[] stringArray2 = new String[lIIIIIIIlllll[1]];
                            stringArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[75]];
                            lllllllllllllllIIIllllIlIlIIlIIl = TileObjects.getNearest((String[])stringArray2);
                            if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlIIl)) {
                                lllllllllllllllIIIllllIlIlIIlIIl.interact(lIIIIIIIlllll[1]);
                                return;
                            }
                        }
                    }
                    int[] nArray2 = new int[lIIIIIIIlllll[1]];
                    nArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[72];
                    if (k.lIIlIlllIIlIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ak), lIIIIIIIlllll[9])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[76]];
                            Movement.walkTo((WorldPoint)ak);
                            0;
                            return;
                        }
                        if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(ak), lIIIIIIIlllll[9]) && k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlIIl = TileObjects.getNearest(tileObject -> {
                            int n;
                            if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[8]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIIIIlllll[1]];
                                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[84]];
                                if (k.lIIlIlllIIlIIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n = lIIIIIIIlllll[1];
                                    0;
                                    if (null == null) return n != 0;
                                    return (3 & ~3) != 0;
                                }
                            }
                            n = lIIIIIIIlllll[0];
                            return n != 0;
                        }))) {
                            am = lIIIIIIIlllll[0];
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[77]];
                            lllllllllllllllIIIllllIlIlIIlIIl.interact(lIIIIIIIllllI[lIIIIIIIlllll[78]]);
                            return;
                        }
                    }
                }
            }
            if (k.lIIlIlllIIlIIll(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIlllll[1]];
                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[79]];
                if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                        ao = System.currentTimeMillis() + (long)l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[80]];
                        Movement.walkTo((WorldPoint)al);
                        0;
                        return;
                    }
                    if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[81]];
                        if (k.lIIlIlllIlIIIII(k.lIIlIlllIlIIIIl(System.currentTimeMillis(), ao))) {
                            am = lIIIIIIIlllll[0];
                            ao = System.currentTimeMillis() + (long)l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        }
                        String[] stringArray3 = new String[lIIIIIIIlllll[1]];
                        stringArray3[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[82]];
                        lllllllllllllllIIIllllIlIlIIlIIl = TileObjects.getNearest((String[])stringArray3);
                        if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlIIl) && k.lIIlIlllIIllIlI(am, lIIIIIIIlllll[3])) {
                            lllllllllllllllIIIllllIlIlIIlIIl.interact(lIIIIIIIllllI[lIIIIIIIlllll[83]]);
                            am += lIIIIIIIlllll[1];
                            return;
                        }
                    }
                }
            }
        }
    }

    public static boolean j() {
        int n;
        if (!k.lIIlIlllIIlllIl(ap.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !k.lIIlIlllIIlllIl(aq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !k.lIIlIlllIIlllIl(Q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || k.lIIlIlllIIlIIll(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n = lIIIIIIIlllll[1];
            0;
            if (null != null) {
                return ((0xCB ^ 0xA7 ^ (0x41 ^ 0x7C)) & (0x48 ^ 0x76 ^ (0x7C ^ 0x13) ^ -1)) != 0;
            }
        } else {
            n = lIIIIIIIlllll[0];
        }
        return n != 0;
    }

    private static boolean lIIlIlllIlIIIII(int n) {
        return n >= 0;
    }

    public boolean run() {
        an = this.aj.makeXPotions();
        if (k.lIIlIlllIIlIIll(k.j() ? 1 : 0)) {
            return lIIIIIIIlllll[0];
        }
        if (k.lIIlIlllIIlIIll(h.d() ? 1 : 0)) {
            return lIIIIIIIlllll[0];
        }
        k.f();
        return lIIIIIIIlllll[0];
    }

    private static void h() {
        block31: {
            block34: {
                block36: {
                    TileObject lllllllllllllllIIIllllIlIlIIlllI;
                    WorldPoint lllllllllllllllIIIllllIlIlIIllll;
                    block35: {
                        block33: {
                            block32: {
                                TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                                    int n;
                                    if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[92]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIlllll[5])) {
                                        n = lIIIIIIIlllll[1];
                                        0;
                                        if (null != null) {
                                            return ((0x6E ^ 0x28) & ~(0 ^ 0x46)) != 0;
                                        }
                                    } else {
                                        n = lIIIIIIIlllll[0];
                                    }
                                    return n != 0;
                                });
                                if (k.lIIlIlllIIlIllI(tileObject2) && k.lIIlIlllIIllIlI(Movement.getRunEnergy(), lIIIIIIIlllll[8])) {
                                    SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[9]];
                                    tileObject2.interact(lIIIIIIIllllI[lIIIIIIIlllll[10]]);
                                    return;
                                }
                                if (k.lIIlIlllIIlIIll(au.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllIIIllllIlIlIIllll = new WorldPoint(lIIIIIIIlllll[11], lIIIIIIIlllll[12], lIIIIIIIlllll[1]);
                                    lllllllllllllllIIIllllIlIlIIlllI = TileObjects.getNearest(tileObject -> {
                                        int n;
                                        if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[91]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(lllllllllllllllIIIllllIlIlIIllll), lIIIIIIIlllll[5])) {
                                            n = lIIIIIIIlllll[1];
                                            0;
                                            if (-(0x49 ^ 0x4C) >= 0) {
                                                return ((0x17 ^ 8) & ~(0x25 ^ 0x3A)) != 0;
                                            }
                                        } else {
                                            n = lIIIIIIIlllll[0];
                                        }
                                        return n != 0;
                                    });
                                    if (k.lIIlIlllIIllIll(lllllllllllllllIIIllllIlIlIIlllI)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[13]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIlIlIIllll);
                                        0;
                                        return;
                                    }
                                    if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlllI)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[14]];
                                        lllllllllllllllIIIllllIlIlIIlllI.interact(lIIIIIIIllllI[lIIIIIIIlllll[15]]);
                                        return;
                                    }
                                }
                                if (k.lIIlIlllIIlIIll(ar.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllIIIllllIlIlIIllll = new WorldPoint(lIIIIIIIlllll[16], lIIIIIIIlllll[17], lIIIIIIIlllll[0]);
                                    lllllllllllllllIIIllllIlIlIIlllI = TileObjects.getNearest(tileObject -> {
                                        int n;
                                        if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[90]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(lllllllllllllllIIIllllIlIlIIllll), lIIIIIIIlllll[5])) {
                                            n = lIIIIIIIlllll[1];
                                            0;
                                            if (3 < 0) {
                                                return ((0x62 ^ 0x64) & ~(0x19 ^ 0x1F)) != 0;
                                            }
                                        } else {
                                            n = lIIIIIIIlllll[0];
                                        }
                                        return n != 0;
                                    });
                                    if (k.lIIlIlllIIllIll(lllllllllllllllIIIllllIlIlIIlllI)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[18]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIlIlIIllll);
                                        0;
                                        return;
                                    }
                                    if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlllI)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[19]];
                                        lllllllllllllllIIIllllIlIlIIlllI.interact(lIIIIIIIllllI[lIIIIIIIlllll[20]]);
                                        return;
                                    }
                                }
                                if (k.lIIlIlllIIlIIll(as.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllIIIllllIlIlIIllll = new WorldPoint(lIIIIIIIlllll[21], lIIIIIIIlllll[22], lIIIIIIIlllll[0]);
                                    lllllllllllllllIIIllllIlIlIIlllI = TileObjects.getNearest(tileObject -> {
                                        int n;
                                        if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[89]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(lllllllllllllllIIIllllIlIlIIllll), lIIIIIIIlllll[7])) {
                                            n = lIIIIIIIlllll[1];
                                            0;
                                            if (-3 > 0) {
                                                return ((0x82 ^ 0xA5) & ~(0x9F ^ 0xB8)) != 0;
                                            }
                                        } else {
                                            n = lIIIIIIIlllll[0];
                                        }
                                        return n != 0;
                                    });
                                    if (k.lIIlIlllIIllIll(lllllllllllllllIIIllllIlIlIIlllI)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[23]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIlIlIIllll);
                                        0;
                                        return;
                                    }
                                    if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlllI)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[24]];
                                        lllllllllllllllIIIllllIlIlIIlllI.interact(lIIIIIIIllllI[lIIIIIIIlllll[25]]);
                                        return;
                                    }
                                }
                                if (!k.lIIlIlllIIlIIll(at.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                                if (k.lIIlIlllIIllIlI(Inventory.getFreeSlots(), lIIIIIIIlllll[6])) {
                                    String[] stringArray = new String[lIIIIIIIlllll[1]];
                                    stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[26]];
                                    if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                        String[] stringArray2 = new String[lIIIIIIIlllll[1]];
                                        stringArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[27]];
                                        Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIllllI[lIIIIIIIlllll[28]]);
                                        return;
                                    }
                                    String[] stringArray3 = new String[lIIIIIIIlllll[1]];
                                    stringArray3[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[29]];
                                    if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIIIIIlllll[1]];
                                        stringArray4[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[30]];
                                        Inventory.getFirst((String[])stringArray4).interact(lIIIIIIIllllI[lIIIIIIIlllll[31]]);
                                        return;
                                    }
                                    String[] stringArray5 = new String[lIIIIIIIlllll[1]];
                                    stringArray5[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[32]];
                                    if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                        String[] stringArray6 = new String[lIIIIIIIlllll[1]];
                                        stringArray6[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[33]];
                                        Inventory.getFirst((String[])stringArray6).interact(lIIIIIIIllllI[lIIIIIIIlllll[34]]);
                                        return;
                                    }
                                }
                                int[] nArray = new int[lIIIIIIIlllll[1]];
                                nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[35];
                                if (!k.lIIlIlllIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray2 = new int[lIIIIIIIlllll[1]];
                                nArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[36];
                                if (!k.lIIlIlllIIlllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block33;
                            }
                            if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[37]];
                                Movement.walkTo((WorldPoint)al);
                                0;
                                return;
                            }
                            if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[38]];
                                String[] stringArray = new String[lIIIIIIIlllll[1]];
                                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[39]];
                                lllllllllllllllIIIllllIlIlIIllll = TileObjects.getNearest((String[])stringArray);
                                if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIllll)) {
                                    lllllllllllllllIIIllllIlIlIIllll.interact(lIIIIIIIlllll[3]);
                                    return;
                                }
                            }
                        }
                        int[] nArray = new int[lIIIIIIIlllll[1]];
                        nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[35];
                        if (!k.lIIlIlllIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                        int[] nArray3 = new int[lIIIIIIIlllll[1]];
                        nArray3[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[36];
                        if (!k.lIIlIlllIIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                        String[] stringArray = new String[lIIIIIIIlllll[1]];
                        stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[40]];
                        if (!k.lIIlIlllIIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block34;
                        String[] stringArray7 = new String[lIIIIIIIlllll[1]];
                        stringArray7[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[41]];
                        if (!k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray7) ? 1 : 0)) break block35;
                        String[] stringArray8 = new String[lIIIIIIIlllll[1]];
                        stringArray8[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[42]];
                        if (!k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray8) ? 1 : 0)) break block36;
                        String[] stringArray9 = new String[lIIIIIIIlllll[1]];
                        stringArray9[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[43]];
                        if (!k.lIIlIlllIIllIlI(Inventory.getCount((String[])stringArray9), lIIIIIIIlllll[2])) break block36;
                    }
                    lllllllllllllllIIIllllIlIlIIllll = new WorldPoint(lIIIIIIIlllll[44], lIIIIIIIlllll[45], lIIIIIIIlllll[0]);
                    if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIllllIlIlIIllll), lIIIIIIIlllll[13])) {
                        am = lIIIIIIIlllll[0];
                        ao = System.currentTimeMillis() + (long)l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[48]];
                        Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIlIlIIllll);
                        0;
                        return;
                    }
                    if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIllllIlIlIIllll), lIIIIIIIlllll[13])) {
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[49]];
                        if (k.lIIlIlllIlIIIII(k.lIIlIlllIIllIIl(System.currentTimeMillis(), ao))) {
                            am = lIIIIIIIlllll[0];
                            ao = System.currentTimeMillis() + (long)l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        }
                        String[] stringArray = new String[lIIIIIIIlllll[1]];
                        stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[50]];
                        lllllllllllllllIIIllllIlIlIIlllI = TileObjects.getNearest((String[])stringArray);
                        if (k.lIIlIlllIIlIllI(lllllllllllllllIIIllllIlIlIIlllI) && k.lIIlIlllIIllIlI(am, lIIIIIIIlllll[3])) {
                            lllllllllllllllIIIllllIlIlIIlllI.interact(lIIIIIIIllllI[lIIIIIIIlllll[51]]);
                            am += lIIIIIIIlllll[1];
                            return;
                        }
                    }
                }
                String[] stringArray = new String[lIIIIIIIlllll[1]];
                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[52]];
                if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray10 = new String[lIIIIIIIlllll[1]];
                    stringArray10[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[53]];
                    if (k.lIIlIlllIIlIlll(Inventory.getCount((String[])stringArray10), lIIIIIIIlllll[2])) {
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[54]];
                        int[] nArray = new int[lIIIIIIIlllll[1]];
                        nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[35];
                        String[] stringArray11 = new String[lIIIIIIIlllll[1]];
                        stringArray11[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[55]];
                        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((String[])stringArray11));
                        return;
                    }
                }
            }
            String[] stringArray = new String[lIIIIIIIlllll[1]];
            stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[56]];
            if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray12 = new String[lIIIIIIIlllll[1]];
                stringArray12[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[57]];
                if (k.lIIlIlllIIlllIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[58]];
                    int[] nArray = new int[lIIIIIIIlllll[1]];
                    nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[36];
                    String[] stringArray13 = new String[lIIIIIIIlllll[1]];
                    stringArray13[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[59]];
                    Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((String[])stringArray13));
                    return;
                }
            }
        }
    }

    @Inject
    public k(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.aj = squireMoonsOfPerilConfig;
    }
}

