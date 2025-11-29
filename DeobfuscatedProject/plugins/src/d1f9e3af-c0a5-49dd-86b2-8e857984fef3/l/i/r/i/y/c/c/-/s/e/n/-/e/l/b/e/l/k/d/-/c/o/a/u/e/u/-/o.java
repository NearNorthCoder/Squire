/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.Q;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class o
implements W {
    static /* synthetic */ WorldPoint bX;
    static /* synthetic */ int bY;
    private static /* synthetic */ String[] lIIlllIII;
    public static /* synthetic */ boolean bW;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] bR;
    private static /* synthetic */ int[] lIIlllIlI;
    public static /* synthetic */ List<d> bv;

    @Override
    public boolean V() {
        boolean bl;
        if (o.lIIIIIllIIll(Skills.getLevel((Skill)Skill.FARMING), lIIlllIlI[91])) {
            bl = lIIlllIlI[0];
            "".length();
            if ((120 + 112 - 63 + 10 ^ 70 + 108 - 170 + 175) <= "   ".length()) {
                return ((0x56 ^ 0x38 ^ (0x75 ^ 0x27)) & (29 + 157 - 151 + 124 ^ 17 + 31 - -77 + 38 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIlllIlI[1];
        }
        return bl;
    }

    private static String lIIIIIIlllIl(String llllllIlIllIll, String llllllIlIlIlIl) {
        llllllIlIllIll = new String(Base64.getDecoder().decode(llllllIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIlIllIIl = new StringBuilder();
        char[] llllllIlIllIII = llllllIlIlIlIl.toCharArray();
        int llllllIlIlIlll = lIIlllIlI[1];
        char[] llllllIlIlIIIl = llllllIlIllIll.toCharArray();
        int llllllIlIlIIII = llllllIlIlIIIl.length;
        int llllllIlIIllll = lIIlllIlI[1];
        while (o.lIIIIIllIIIl(llllllIlIIllll, llllllIlIlIIII)) {
            char llllllIlIlllII = llllllIlIlIIIl[llllllIlIIllll];
            llllllIlIllIIl.append((char)(llllllIlIlllII ^ llllllIlIllIII[llllllIlIlIlll % llllllIlIllIII.length]));
            "".length();
            ++llllllIlIlIlll;
            ++llllllIlIIllll;
            "".length();
            if ("   ".length() > ("  ".length() & ("  ".length() ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllIlIllIIl);
    }

    private static String lIIIIIIlllll(String llllllIllIlIIl, String llllllIllIlIII) {
        try {
            SecretKeySpec llllllIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIllIlIII.getBytes(StandardCharsets.UTF_8)), lIIlllIlI[20]), "DES");
            Cipher llllllIllIllIl = Cipher.getInstance("DES");
            llllllIllIllIl.init(lIIlllIlI[5], llllllIllIlllI);
            return new String(llllllIllIllIl.doFinal(Base64.getDecoder().decode(llllllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIllIllII) {
            llllllIllIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIlllIIl(Object object) {
        return object == null;
    }

    @Override
    public boolean S() {
        return lIIlllIlI[1];
    }

    private static /* synthetic */ boolean b(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[96]]) ? 1 : 0) && o.lIIIIIllIlll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIlllIlI[18])) {
            n2 = lIIlllIlI[0];
            "".length();
            if ("   ".length() < 0) {
                return ((0x75 ^ 0x52) & ~(0x8E ^ 0xA9)) != 0;
            }
        } else {
            n2 = lIIlllIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIIIllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIIlllIlI[0]];
        nArray[o.lIIlllIlI[1]] = lIIlllIlI[10];
        if (o.lIIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0) && o.lIIIIIllIIII(Inventory.contains(item -> item.getName().contains(lIIlllIII[lIIlllIlI[94]])) ? 1 : 0) && (!o.lIIIIIllIIlI(Equipment.contains(item -> item.getName().contains(lIIlllIII[lIIlllIlI[93]])) ? 1 : 0) || o.lIIIIIllIIII(Inventory.contains(item -> item.getName().contains(lIIlllIII[lIIlllIlI[92]])) ? 1 : 0))) {
            n2 = lIIlllIlI[0];
            "".length();
            if (((0x7E ^ 0x73) & ~(0x45 ^ 0x48)) != ((0xBA ^ 0x9F) & ~(0xE6 ^ 0xC3))) {
                return ((0x46 ^ 0x15) & ~(0x68 ^ 0x3B)) != 0;
            }
        } else {
            n2 = lIIlllIlI[1];
        }
        return n2 != 0;
    }

    private static boolean az() {
        int n2;
        WorldArea worldArea = new WorldArea(lIIlllIlI[40], lIIlllIlI[41], lIIlllIlI[36], lIIlllIlI[42], lIIlllIlI[1]);
        if (o.lIIIIIllIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIIIIllIlll(Players.getLocal().getWorldLocation().getX(), lIIlllIlI[43])) {
            n2 = lIIlllIlI[0];
            "".length();
            if (" ".length() < 0) {
                return ((0x18 ^ 0x69 ^ (0x18 ^ 0x27)) & (0x3A ^ 0x2C ^ (1 ^ 0x59) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIlllIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIllIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIlllIII[lIIlllIlI[90]];
    }

    static {
        o.lIIIIIlIllll();
        o.lIIIIIlIlllI();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIIlllIlI[1], lIIlllIlI[1], lIIlllIlI[1]);
        bY = lIIlllIlI[1];
        String[] stringArray = new String[lIIlllIlI[0]];
        stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[102]];
        bR = stringArray;
    }

    private static boolean lIIIIIllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIllIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIllIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIIIIIllllI(String llllllIlllIllI, String llllllIlllIlIl) {
        try {
            SecretKeySpec llllllIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIllllIlI = Cipher.getInstance("Blowfish");
            llllllIllllIlI.init(lIIlllIlI[5], llllllIllllIll);
            return new String(llllllIllllIlI.doFinal(Base64.getDecoder().decode(llllllIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIllllIIl) {
            llllllIllllIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIlIllll() {
        lIIlllIlI = new int[104];
        o.lIIlllIlI[0] = " ".length();
        o.lIIlllIlI[1] = (0x92 ^ 0x99) & ~(0x7F ^ 0x74);
        o.lIIlllIlI[2] = -(0xFFFFFEFF & 0x6FCF) & (0xFFFFFFDF & 0x6FFF);
        o.lIIlllIlI[3] = 155 + 116 - 110 + 54 ^ 73 + 105 - 60 + 67;
        o.lIIlllIlI[4] = -(0xFFFFECFD & 0x3B5A) & (0xFFFFFFFF & 0x3BDF);
        o.lIIlllIlI[5] = "  ".length();
        o.lIIlllIlI[6] = 10 + 119 - 45 + 70 ^ 52 + 33 - 41 + 114;
        o.lIIlllIlI[7] = -(78 + 131 - 207 + 161) & (0xFFFFFBF7 & 0x35FB);
        o.lIIlllIlI[8] = 0x5F ^ 0x55;
        o.lIIlllIlI[9] = "   ".length();
        o.lIIlllIlI[10] = -(0xFFFFE3C1 & 0x7CBF) & (0xFFFFFFDF & 0x7FE7);
        o.lIIlllIlI[11] = -(0xFFFFF9A6 & 0x765F) & (0xFFFFFBFD & 0x7DFF);
        o.lIIlllIlI[12] = 70 + 76 - 141 + 141 ^ 17 + 89 - -10 + 17;
        o.lIIlllIlI[13] = 0x4E ^ 0x7C;
        o.lIIlllIlI[14] = 0x4F ^ 0x4A;
        o.lIIlllIlI[15] = -(0xFFFFEBBF & 0x74E3) & (0xFFFFFDFB & 0x6FA7);
        o.lIIlllIlI[16] = 0xFFFFCDDB & 0x3EFD;
        o.lIIlllIlI[17] = -(0xFFFFF3E7 & 0x6F99) & (0xFFFFFFFE & 0x6FEF);
        o.lIIlllIlI[18] = 0x60 ^ 0x66;
        o.lIIlllIlI[19] = 0x2C ^ 0x2B;
        o.lIIlllIlI[20] = 66 + 173 - 235 + 199 ^ 187 + 2 - 72 + 78;
        o.lIIlllIlI[21] = 0xFFFFDFA5 & 0x2D5A;
        o.lIIlllIlI[22] = 0xFFFF8CF8 & Short.MAX_VALUE;
        o.lIIlllIlI[23] = -(0xFFFFD9F1 & 0x27AF) & (0xFFFFEFFF & 0x1DE3);
        o.lIIlllIlI[24] = 0x11 ^ 0x18;
        o.lIIlllIlI[25] = 9 ^ 2;
        o.lIIlllIlI[26] = 0x14 ^ 0x18;
        o.lIIlllIlI[27] = 0x65 ^ 0x17 ^ 46 + 115 - 37 + 3;
        o.lIIlllIlI[28] = 0x44 ^ 0x4A;
        o.lIIlllIlI[29] = 0x27 ^ 0x5E ^ (2 ^ 0x74);
        o.lIIlllIlI[30] = 0x6F ^ 1 ^ (0x7B ^ 5);
        o.lIIlllIlI[31] = -(0xFFFFFDDF & 0x66B3) & (0xFFFFEFF6 & 0x7FDF);
        o.lIIlllIlI[32] = 0xFFFFBDFB & 0x5746;
        o.lIIlllIlI[33] = 0x7E ^ 0x49 ^ (0xA9 ^ 0xA7);
        o.lIIlllIlI[34] = 0x63 ^ 0x58;
        o.lIIlllIlI[35] = 0x36 ^ 0x27;
        o.lIIlllIlI[36] = 0x3F ^ 0x2D;
        o.lIIlllIlI[37] = 0xB3 ^ 0xA0;
        o.lIIlllIlI[38] = 0x73 ^ 0x6E ^ (0x1E ^ 0x17);
        o.lIIlllIlI[39] = 0xF2 ^ 0xA9 ^ (0xFC ^ 0xB2);
        o.lIIlllIlI[40] = -(0xFFFFFBBB & 0x544D) & (0xFFFFDBDE & 0x7F6F);
        o.lIIlllIlI[41] = 0xFFFFBD5A & 0x57FD;
        o.lIIlllIlI[42] = 0x70 ^ 0x12 ^ (0x18 ^ 0x62);
        o.lIIlllIlI[43] = 0xFFFFABDF & 0x5F76;
        o.lIIlllIlI[44] = 0x5A ^ 0x4C;
        o.lIIlllIlI[45] = (0x48 ^ 0x70) + (0x4C ^ 0xA) - (0xF9 ^ 0x95) + (88 + 223 - 253 + 173);
        o.lIIlllIlI[46] = (0xA7 ^ 0xBD) + (0xA3 ^ 0x93) - -(0xD5 ^ 0xB5) + (0x63 ^ 0x32);
        o.lIIlllIlI[47] = 205 + 72 - 120 + 96;
        o.lIIlllIlI[48] = 233 + 90 - 310 + 242;
        o.lIIlllIlI[49] = -(0xFFFFD4C7 & 0x7BBD) & (0xFFFFDFFF & 0x75FC);
        o.lIIlllIlI[50] = 0xFFFFE77A & 0x1EF7;
        o.lIIlllIlI[51] = -" ".length() & (0xFFFF97F7 & 0x7EAE);
        o.lIIlllIlI[52] = -(0xFFFFF97F & 0x6EC9) & (0xFFFFFFEF & 0x7EFF);
        o.lIIlllIlI[53] = 0xFFFF9FEF & 0x76B8;
        o.lIIlllIlI[54] = 0xFFFFDEFF & 0x37A9;
        o.lIIlllIlI[55] = 0xFFFFAFF6 & 0x5B5B;
        o.lIIlllIlI[56] = 0xFFFFF7DB & 0x1D7F;
        o.lIIlllIlI[57] = -(0xFFFFFD9F & 0x72ED) & (0xFFFFFFFE & 0x7BDD);
        o.lIIlllIlI[58] = 0xFFFFF563 & 0x1FFF;
        o.lIIlllIlI[59] = -(0xFFFFBC8F & 0x77FC) & (0xFFFFBFDF & Short.MAX_VALUE);
        o.lIIlllIlI[60] = 0xFFFFF57F & 0x1FDE;
        o.lIIlllIlI[61] = -(0xFFFFEC8D & 0x1B76) & (0xFFFFDD6F & 0x3FF7);
        o.lIIlllIlI[62] = 0x42 ^ 0x5B;
        o.lIIlllIlI[63] = -(0xFFFFFDAB & 0x76F5) & (0xFFFFFFFF & 0x7FEB);
        o.lIIlllIlI[64] = -(0xFFFFEB83 & 0x7E7D) & (0xFFFFFF6D & 0x7FFA);
        o.lIIlllIlI[65] = 0xFFFFEF75 & 0x1BDB;
        o.lIIlllIlI[66] = -(0xFFFFF9E1 & 0x4EBF) & (0xFFFFFDFF & 0x5FFF);
        o.lIIlllIlI[67] = 85 + 102 - 56 + 7 ^ 95 + 111 - 114 + 52;
        o.lIIlllIlI[68] = -(0xFFFFC9BB & 0x7E47) & (0xFFFFFF6F & 0x5DFB);
        o.lIIlllIlI[69] = 0x86 ^ 0x9D;
        o.lIIlllIlI[70] = -(56 + 8 - 43 + 141) & (0xFFFFCFEF & 0x3BFD);
        o.lIIlllIlI[71] = 0xFFFFFF7D & 0x15EE;
        o.lIIlllIlI[72] = 117 + 52 - 33 + 42 ^ 125 + 113 - 93 + 29;
        o.lIIlllIlI[73] = 0xFFFF8F77 & 0x7BCF;
        o.lIIlllIlI[74] = 0xFFFFF579 & 0x1FDF;
        o.lIIlllIlI[75] = -(0xFFFFEBBD & 0x7CD3) & (0xFFFFFDF7 & Short.MAX_VALUE);
        o.lIIlllIlI[76] = 0xFFFFE7F6 & 0x1E09;
        o.lIIlllIlI[77] = 0xFFFF8FEF & 0x7B5D;
        o.lIIlllIlI[78] = -(0xFFFFEBD7 & 0x3D3A) & (0xFFFFFF53 & 0x2BBD);
        o.lIIlllIlI[79] = 0x31 ^ 0x2C;
        o.lIIlllIlI[80] = 0x37 ^ 0x29;
        o.lIIlllIlI[81] = 0x19 ^ 0x53 ^ (0x31 ^ 0x64);
        o.lIIlllIlI[82] = 0x23 ^ 3;
        o.lIIlllIlI[83] = 0xFFFFCFBF & 0x35E0;
        o.lIIlllIlI[84] = -(0xFFFFF936 & 0x57FD) & (0xFFFFFFFF & Short.MAX_VALUE);
        o.lIIlllIlI[85] = 0xFFFFF5B8 & 0x6BEF;
        o.lIIlllIlI[86] = 0x30 ^ 0xC;
        o.lIIlllIlI[87] = 83 + 61 - 9 + 48 ^ 60 + 116 - 98 + 81;
        o.lIIlllIlI[88] = 0xFFFFE397 & 0x1FEC;
        o.lIIlllIlI[89] = 0xD8 ^ 0xBC;
        o.lIIlllIlI[90] = 0xC1 ^ 0xA4 ^ (0xEB ^ 0xAF);
        o.lIIlllIlI[91] = 84 + 116 - 168 + 131 ^ 9 + 87 - 17 + 50;
        o.lIIlllIlI[92] = 0x7F ^ 0x6D ^ (0x54 ^ 0x65);
        o.lIIlllIlI[93] = 1 ^ 0x25;
        o.lIIlllIlI[94] = 0xAE ^ 0x8B;
        o.lIIlllIlI[95] = 0x29 ^ 0xF;
        o.lIIlllIlI[96] = 49 + 51 - -81 + 49 ^ 153 + 99 - 199 + 140;
        o.lIIlllIlI[97] = -(0xFFFFB0BB & 0x5FC5) & (0xFFFFFBF7 & 0x1FDF);
        o.lIIlllIlI[98] = 0x34 ^ 0x2C ^ (0x6E ^ 0x5F);
        o.lIIlllIlI[99] = 0x7D ^ 0x57;
        o.lIIlllIlI[100] = 0x81 ^ 0xAA;
        o.lIIlllIlI[101] = 0x25 ^ 9;
        o.lIIlllIlI[102] = 0x73 ^ 0x5E;
        o.lIIlllIlI[103] = 0x5D ^ 0x73;
    }

    private static boolean lIIIIIllIlII(Object object) {
        return object != null;
    }

    private static void aA() {
        if (o.lIIIIIllIIlI(o.az() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[44]];
            int[] nArray = new int[lIIlllIlI[6]];
            nArray[o.lIIlllIlI[1]] = lIIlllIlI[45];
            nArray[o.lIIlllIlI[0]] = lIIlllIlI[46];
            nArray[o.lIIlllIlI[5]] = lIIlllIlI[47];
            nArray[o.lIIlllIlI[9]] = lIIlllIlI[48];
            int[] nArray2 = nArray;
            if (o.lIIIIIllIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                Inventory.getAll((int[])nArray2).stream().forEach(Item::drop);
                Time.sleepTicks((int)lIIlllIlI[0]);
                "".length();
            }
            TileObjects.getNearest(tileObject -> {
                int n2;
                if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[87]]) ? 1 : 0) && o.lIIIIIllIlll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlllIlI[97], lIIlllIlI[60], lIIlllIlI[1])), lIIlllIlI[5])) {
                    n2 = lIIlllIlI[0];
                    "".length();
                    if (null != null) {
                        return ((0x99 ^ 0xB2) & ~(8 ^ 0x23)) != 0;
                    }
                } else {
                    n2 = lIIlllIlI[1];
                }
                return n2 != 0;
            }).interact(lIIlllIII[lIIlllIlI[12]]);
            Time.sleepUntil(() -> o.az(), (int)e.c(lIIlllIlI[49], lIIlllIlI[50]));
            "".length();
        }
        if (o.lIIIIIllIIII(o.az() ? 1 : 0)) {
            WorldPoint lllllllIIlIlIl;
            TileObject lllllllIIlIlII;
            WorldArea lllllllIIlIlll;
            WorldArea lllllllIIllIII;
            WorldArea lllllllIIllIll;
            WorldArea lllllllIIlllII;
            int[] nArray = new int[lIIlllIlI[0]];
            nArray[o.lIIlllIlI[1]] = lIIlllIlI[51];
            NPC lllllllIlIIIIl = NPCs.getNearest((int[])nArray);
            int[] nArray3 = new int[lIIlllIlI[0]];
            nArray3[o.lIIlllIlI[1]] = lIIlllIlI[52];
            NPC lllllllIlIIIII = NPCs.getNearest((int[])nArray3);
            int[] nArray4 = new int[lIIlllIlI[0]];
            nArray4[o.lIIlllIlI[1]] = lIIlllIlI[53];
            NPC lllllllIIlllll = NPCs.getNearest((int[])nArray4);
            int[] nArray5 = new int[lIIlllIlI[0]];
            nArray5[o.lIIlllIlI[1]] = lIIlllIlI[54];
            NPC lllllllIIllllI = NPCs.getNearest((int[])nArray5);
            WorldArea lllllllIIlllIl = new WorldArea(lIIlllIlI[55], lIIlllIlI[56], lIIlllIlI[14], lIIlllIlI[14], lIIlllIlI[1]);
            if (o.lIIIIIllIIII(lllllllIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIIIIllIlII(lllllllIlIIIIl)) {
                lllllllIIlllII = new WorldArea(lIIlllIlI[57], lIIlllIlI[58], lIIlllIlI[14], lIIlllIlI[6], lIIlllIlI[1]);
                if (o.lIIIIIllIIlI(lllllllIIlllII.contains((Locatable)lllllllIlIIIIl) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[42]];
                    lllllllIIllIll = new WorldPoint(lIIlllIlI[59], lIIlllIlI[60], lIIlllIlI[1]);
                    if (o.lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lllllllIIllIll) ? 1 : 0)) {
                        e.c((WorldPoint)lllllllIIllIll);
                        Time.sleepTicks((int)lIIlllIlI[0]);
                        "".length();
                    }
                }
                if (o.lIIIIIllIIII(lllllllIIlllII.contains((Locatable)lllllllIlIIIIl) ? 1 : 0)) {
                    lllllllIIllIll = new WorldPoint(lIIlllIlI[59], lIIlllIlI[61], lIIlllIlI[1]);
                    if (o.lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lllllllIIllIll) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[62]];
                        e.c((WorldPoint)lllllllIIllIll);
                        Time.sleepTicks((int)lIIlllIlI[0]);
                        "".length();
                    }
                }
            }
            lllllllIIlllII = new WorldArea(lIIlllIlI[63], lIIlllIlI[64], lIIlllIlI[25], lIIlllIlI[6], lIIlllIlI[1]);
            lllllllIIllIll = new WorldArea(lIIlllIlI[65], lIIlllIlI[58], lIIlllIlI[18], lIIlllIlI[19], lIIlllIlI[1]);
            WorldArea lllllllIIllIlI = new WorldArea(lIIlllIlI[57], lIIlllIlI[66], lIIlllIlI[9], lIIlllIlI[20], lIIlllIlI[1]);
            WorldArea lllllllIIllIIl = new WorldArea(lIIlllIlI[65], lIIlllIlI[60], lIIlllIlI[6], lIIlllIlI[6], lIIlllIlI[1]);
            if (!o.lIIIIIllIIlI(lllllllIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || o.lIIIIIllIIII(lllllllIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lllllllIIllIII = new WorldArea(lIIlllIlI[63], lIIlllIlI[64], lIIlllIlI[24], lIIlllIlI[9], lIIlllIlI[1]);
                if (o.lIIIIIllIlII(lllllllIlIIIII) && o.lIIIIIllIlII(lllllllIIlllll) && o.lIIIIIllIlII(lllllllIlIIIIl)) {
                    if (!o.lIIIIIllIIII(lllllllIIllIII.contains((Locatable)lllllllIlIIIII) ? 1 : 0) || o.lIIIIIllIIlI(lllllllIIllIII.contains((Locatable)lllllllIIlllll) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[67]];
                    }
                    if (o.lIIIIIllIIII(lllllllIIllIII.contains((Locatable)lllllllIlIIIII) ? 1 : 0) && o.lIIIIIllIIII(lllllllIIllIII.contains((Locatable)lllllllIIlllll) ? 1 : 0) && (!o.lIIIIIllIIlI(lllllllIIllIlI.contains((Locatable)lllllllIlIIIIl) ? 1 : 0) || o.lIIIIIllIIII(lllllllIIllIIl.contains((Locatable)lllllllIlIIIIl) ? 1 : 0))) {
                        lllllllIIlIlll = new WorldPoint(lIIlllIlI[63], lIIlllIlI[68], lIIlllIlI[1]);
                        if (o.lIIIIIllIIII(lllllllIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lllllllIIlIlll) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[69]];
                            e.c((WorldPoint)lllllllIIlIlll);
                            Time.sleepTicks((int)lIIlllIlI[0]);
                            "".length();
                        }
                    }
                }
                if (o.lIIIIIllIIII(lllllllIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIIIIllIIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlllIlI[63], lIIlllIlI[68], lIIlllIlI[1])) ? 1 : 0)) {
                    lllllllIIlIlll = new WorldPoint(lIIlllIlI[70], lIIlllIlI[71], lIIlllIlI[1]);
                    if (o.lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lllllllIIlIlll) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[72]];
                        e.c((WorldPoint)lllllllIIlIlll);
                        Time.sleepTicks((int)lIIlllIlI[0]);
                        "".length();
                    }
                }
            }
            lllllllIIllIII = new WorldArea(lIIlllIlI[73], lIIlllIlI[74], lIIlllIlI[8], lIIlllIlI[29], lIIlllIlI[1]);
            lllllllIIlIlll = new WorldArea(lIIlllIlI[73], lIIlllIlI[75], lIIlllIlI[6], lIIlllIlI[19], lIIlllIlI[1]);
            WorldPoint lllllllIIlIllI = new WorldPoint(lIIlllIlI[70], lIIlllIlI[71], lIIlllIlI[1]);
            if (o.lIIIIIllIIII(Players.getLocal().getWorldLocation().equals((Object)lllllllIIlIllI) ? 1 : 0) && o.lIIIIIllIlII(lllllllIIllllI) && (o.lIIIIIlllIII(lllllllIIllllI.getOrientation(), lIIlllIlI[76]) && !o.lIIIIIllIIIl(lllllllIIllllI.getWorldLocation().getX(), lIIlllIlI[77]) || o.lIIIIIlllIII(lllllllIIllllI.getOrientation(), lIIlllIlI[78]) && o.lIIIIIllIIll(lllllllIIllllI.getWorldLocation().getX(), lIIlllIlI[57])) && o.lIIIIIllIlII(lllllllIIlIlII = TileObjects.getNearest(arg_0 -> o.b(lllllllIIlIlIl = new WorldPoint(lIIlllIlI[63], lIIlllIlI[56], lIIlllIlI[1]), arg_0)))) {
                AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[79]];
                lllllllIIlIlII.interact(lIIlllIII[lIIlllIlI[80]]);
                Time.sleepTicks((int)lIIlllIlI[5]);
                "".length();
            }
            if ((!o.lIIIIIllIIlI(lllllllIIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || o.lIIIIIllIIII(lllllllIIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && o.lIIIIIllIlII(lllllllIIlIlII = TileObjects.getNearest(arg_0 -> o.a(lllllllIIlIlIl = new WorldPoint(lIIlllIlI[63], lIIlllIlI[56], lIIlllIlI[1]), arg_0)))) {
                AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[81]];
                lllllllIIlIlII.interact(lIIlllIII[lIIlllIlI[82]]);
                Time.sleepTicks((int)lIIlllIlI[5]);
                "".length();
            }
        }
    }

    @Override
    public int T() {
        try {
            o.ay();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0xAF ^ 0xBB ^ "  ".length()) & (58 + 131 - 180 + 134 ^ 137 + 90 - 159 + 85 ^ -" ".length());
        }
        return lIIlllIlI[89];
    }

    private static /* synthetic */ boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[95]]) ? 1 : 0) && o.lIIIIIllIlll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIlllIlI[18])) {
            n2 = lIIlllIlI[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x26 ^ 0x14) & ~(0x34 ^ 6)) != 0;
            }
        } else {
            n2 = lIIlllIlI[1];
        }
        return n2 != 0;
    }

    public static void ay() {
        if (o.lIIIIIllIIII(bt ? 1 : 0)) {
            b.a(bv);
            if (o.lIIIIIllIIIl(bv.size(), lIIlllIlI[0])) {
                System.out.println(lIIlllIII[lIIlllIlI[1]]);
                bt = lIIlllIlI[1];
            }
        }
        if (o.lIIIIIllIIlI(bt ? 1 : 0)) {
            if (o.lIIIIIllIIIl(e.j(lIIlllIlI[2]), lIIlllIlI[3])) {
                Q.cS();
            }
            if (o.lIIIIIllIIll(e.j(lIIlllIlI[2]), lIIlllIlI[3])) {
                BankLocation lllllllIllIlII;
                if (o.lIIIIIllIIlI(o.ab() ? 1 : 0)) {
                    lllllllIllIlII = BankLocation.getNearest();
                    if (o.lIIIIIllIlII(lllllllIllIlII) && o.lIIIIIllIIlI(lllllllIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[0]];
                        a.a(lllllllIllIlII);
                    }
                    if (o.lIIIIIllIlII(lllllllIllIlII) && o.lIIIIIllIIII(lllllllIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (o.lIIIIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllIlI[4]);
                            "".length();
                        }
                        if (o.lIIIIIllIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[5]];
                            if (o.lIIIIIllIlIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlllIlI[6]);
                                "".length();
                            }
                            if (o.lIIIIIllIlIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIlllIlI[5]);
                                "".length();
                            }
                            int[] nArray = new int[lIIlllIlI[0]];
                            nArray[o.lIIlllIlI[1]] = lIIlllIlI[7];
                            if (o.lIIIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlllIlI[0]];
                                nArray2[o.lIIlllIlI[1]] = lIIlllIlI[7];
                                if (o.lIIIIIllIIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIlllIlI[8])) {
                                    o.af();
                                    System.out.println(lIIlllIII[lIIlllIlI[9]]);
                                    bt = lIIlllIlI[0];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIlllIlI[9]];
                            nArray3[o.lIIlllIlI[1]] = lIIlllIlI[10];
                            nArray3[o.lIIlllIlI[0]] = lIIlllIlI[7];
                            nArray3[o.lIIlllIlI[5]] = lIIlllIlI[11];
                            if (o.lIIIIIllIIlI(e.b(nArray3) ? 1 : 0)) {
                                o.af();
                                System.out.println(lIIlllIII[lIIlllIlI[6]]);
                                bt = lIIlllIlI[0];
                                return;
                            }
                            int[] nArray4 = new int[lIIlllIlI[9]];
                            nArray4[o.lIIlllIlI[1]] = lIIlllIlI[10];
                            nArray4[o.lIIlllIlI[0]] = lIIlllIlI[7];
                            nArray4[o.lIIlllIlI[5]] = lIIlllIlI[11];
                            if (o.lIIIIIllIIII(e.b(nArray4) ? 1 : 0)) {
                                a.a(lIIlllIlI[10], lIIlllIlI[8]);
                                a.a(lIIlllIlI[7], lIIlllIlI[12]);
                                a.a(lIIlllIlI[11], lIIlllIlI[0]);
                            }
                        }
                    }
                }
                if (o.lIIIIIllIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && o.lIIIIIllIIIl(Movement.getRunEnergy(), lIIlllIlI[13])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIlllIII[lIIlllIlI[14]]);
                    Time.sleepTicks((int)lIIlllIlI[0]);
                    "".length();
                }
                if (o.lIIIIIllIIII(o.ab() ? 1 : 0)) {
                    TileObject lllllllIllIIll;
                    e.l(lIIlllIlI[11]);
                    if (o.lIIIIIllIIIl(Vars.getBit((int)lIIlllIlI[15]), lIIlllIlI[0])) {
                        lllllllIllIlII = new WorldPoint(lIIlllIlI[16], lIIlllIlI[17], lIIlllIlI[1]);
                        if (o.lIIIIIllIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIlII), lIIlllIlI[8])) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[18]];
                            Movement.walkTo((WorldPoint)lllllllIllIlII);
                            "".length();
                            Time.sleepTicks((int)lIIlllIlI[0]);
                            "".length();
                        }
                        if (o.lIIIIIllIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIlII), lIIlllIlI[8])) {
                            String[] stringArray = new String[lIIlllIlI[0]];
                            stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[20]];
                            g.a(lIIlllIII[lIIlllIlI[19]], stringArray);
                        }
                    }
                    if (o.lIIIIIlllIII(Vars.getBit((int)lIIlllIlI[15]), lIIlllIlI[0]) && o.lIIIIIllIIlI(Vars.getBit((int)lIIlllIlI[21]))) {
                        lllllllIllIlII = new WorldPoint(lIIlllIlI[22], lIIlllIlI[23], lIIlllIlI[1]);
                        if (o.lIIIIIllIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIlII), lIIlllIlI[19])) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[24]];
                            Movement.walkTo((WorldPoint)lllllllIllIlII);
                            "".length();
                            Time.sleepTicks((int)lIIlllIlI[0]);
                            "".length();
                        }
                        if (o.lIIIIIllIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIlII), lIIlllIlI[19])) {
                            lllllllIllIIll = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[100]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIlllIlI[0]];
                                    stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[101]];
                                    if (o.lIIIIIllIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                        n2 = lIIlllIlI[0];
                                        "".length();
                                        if (null == null) return n2 != 0;
                                        return ((0x35 ^ 0x44 ^ (0x96 ^ 0xB7)) & (0x47 ^ 0x7A ^ (0x63 ^ 0xE) ^ -" ".length())) != 0;
                                    }
                                }
                                n2 = lIIlllIlI[1];
                                return n2 != 0;
                            });
                            if (o.lIIIIIllIlII(lllllllIllIIll)) {
                                lllllllIllIIll.interact(lIIlllIII[lIIlllIlI[8]]);
                                Time.sleepTicks((int)lIIlllIlI[6]);
                                "".length();
                            }
                            if (o.lIIIIIlllIIl(lllllllIllIIll)) {
                                String[] stringArray = new String[lIIlllIlI[14]];
                                stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[26]];
                                stringArray[o.lIIlllIlI[0]] = lIIlllIII[lIIlllIlI[27]];
                                stringArray[o.lIIlllIlI[5]] = lIIlllIII[lIIlllIlI[28]];
                                stringArray[o.lIIlllIlI[9]] = lIIlllIII[lIIlllIlI[29]];
                                stringArray[o.lIIlllIlI[6]] = lIIlllIII[lIIlllIlI[30]];
                                g.a(lIIlllIII[lIIlllIlI[25]], stringArray);
                            }
                        }
                    }
                    if (o.lIIIIIlllIII(Vars.getBit((int)lIIlllIlI[15]), lIIlllIlI[0]) && o.lIIIIIlllIII(Vars.getBit((int)lIIlllIlI[21]), lIIlllIlI[0])) {
                        lllllllIllIlII = new WorldArea(lIIlllIlI[31], lIIlllIlI[32], lIIlllIlI[33], lIIlllIlI[34], lIIlllIlI[1]);
                        if (o.lIIIIIllIIlI(lllllllIllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lllllllIllIIll = new WorldPoint(lIIlllIlI[22], lIIlllIlI[23], lIIlllIlI[1]);
                            if (o.lIIIIIllIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIIll), lIIlllIlI[19])) {
                                AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[35]];
                                Movement.walkTo((WorldPoint)lllllllIllIIll);
                                "".length();
                                Time.sleepTicks((int)lIIlllIlI[0]);
                                "".length();
                            }
                            if (o.lIIIIIllIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIIll), lIIlllIlI[19])) {
                                TileObject lllllllIllIIlI = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[98]]) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIlllIlI[0]];
                                        stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[99]];
                                        if (o.lIIIIIllIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                            n2 = lIIlllIlI[0];
                                            "".length();
                                            if ("  ".length() == "  ".length()) return n2 != 0;
                                            return ((0x7F ^ 0x74) & ~(0x26 ^ 0x2D)) != 0;
                                        }
                                    }
                                    n2 = lIIlllIlI[1];
                                    return n2 != 0;
                                });
                                if (o.lIIIIIllIlII(lllllllIllIIlI)) {
                                    lllllllIllIIlI.interact(lIIlllIII[lIIlllIlI[36]]);
                                    Time.sleepTicks((int)lIIlllIlI[6]);
                                    "".length();
                                }
                                if (o.lIIIIIlllIIl(lllllllIllIIlI)) {
                                    AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[37]];
                                    String[] stringArray = new String[lIIlllIlI[0]];
                                    stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[38]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIlllIII[lIIlllIlI[39]]);
                                    Time.sleepTicks((int)lIIlllIlI[6]);
                                    "".length();
                                }
                            }
                        }
                        if (o.lIIIIIllIIII(lllllllIllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            o.aA();
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIIIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIIlIlllI() {
        lIIlllIII = new String[lIIlllIlI[103]];
        o.lIIlllIII[o.lIIlllIlI[1]] = o.lIIIIIIlllIl("EjkJLCk8NQNlOCEpDis9dDkTIDcnfEc2LT0kBC0zOjdHJzs3O0cxNXQhEiApIA==", "TPgEZ");
        o.lIIlllIII[o.lIIlllIlI[0]] = o.lIIIIIIllllI("m7b+vE6NOHBmAKwBBqDTqA==", "pmCsS");
        o.lIIlllIII[o.lIIlllIlI[5]] = o.lIIIIIIlllll("2ZUm8YnFQUGNGm16t00eTr8wRBhy076V", "SSurx");
        o.lIIlllIII[o.lIIlllIlI[9]] = o.lIIIIIIllllI("x1mxSQedcmqFPjTxge4KRoRF1sVvM3maSjfhgGzB3/DBOYs0oGxPqOTazHXzCzzp6F0ZpHucV+Q=", "Drbed");
        o.lIIlllIII[o.lIIlllIlI[6]] = o.lIIIIIIlllll("Qi0k+pCHXiM2G0nNRucPMmfKhqlUNy1MHjoWlAhCvo3RdBRWJxiZgb06AwM6M/qhLWyJ7VURHO8=", "cBbnZ");
        o.lIIlllIII[o.lIIlllIlI[14]] = o.lIIIIIIlllIl("EAg/AwI=", "TzVmi");
        o.lIIlllIII[o.lIIlllIlI[18]] = o.lIIIIIIlllll("/8A39rYU/T64dDePb8dQsQ==", "OKbGF");
        o.lIIlllIII[o.lIIlllIlI[19]] = o.lIIIIIIlllll("DsNd0XKMpYo=", "nFucc");
        o.lIIlllIII[o.lIIlllIlI[20]] = o.lIIIIIIlllll("7RH8FkV/6dRtqf0Riru2nwu3eETKRl1otBZl7KZ0mslA6RADcAXWUg==", "oiaBz");
        o.lIIlllIII[o.lIIlllIlI[24]] = o.lIIIIIIlllll("4U5zc9D2aiI/1TqfP5PxB4noM3pqmys3", "JZVDa");
        o.lIIlllIII[o.lIIlllIlI[8]] = o.lIIIIIIlllIl("LQIVIg==", "brpLd");
        o.lIIlllIII[o.lIIlllIlI[25]] = o.lIIIIIIllllI("tlSb5zuRdlA3nMnkmw1NDg==", "pYfii");
        o.lIIlllIII[o.lIIlllIlI[26]] = o.lIIIIIIlllIl("NQA6FSgfVTwYIRQQaB0xFQFoEiFGADgDLQIQO1AwCVU8GCFGASkDL1k=", "fuHpD");
        o.lIIlllIII[o.lIIlllIlI[27]] = o.lIIIIIIlllll("cmph/TBycADqglkhfTLfvietw6MSliSPJwkj+mIP00We0CtpnHBLe60qk/YrIjUAOMSr1HhQ3iEnERbVyM1eLQ==", "KbQIa");
        o.lIIlllIII[o.lIIlllIlI[28]] = o.lIIIIIIlllll("LhaFn+pHOk0VOMBzTF0dZt1C97EmiotQUKX9QcvPG87QrAFpAORU9w==", "Crjwh");
        o.lIIlllIII[o.lIIlllIlI[29]] = o.lIIIIIIlllIl("FwMtSAgrAiwBCiAJPEgWIQE9HA0nAj9IBCwDLRxFOgQ9SAIvHjwNC2A=", "NlXhe");
        o.lIIlllIII[o.lIIlllIlI[30]] = o.lIIIIIIlllll("ocAxXK/kt5YpXOBDPQDLAvsgk4h+TMsYpWlHPlyDKbzefE/ciR8hecrPUIuPH0bGhRFr2LfF/HT18rLtv2Ck5l8FpBXTc3cX", "uAfzk");
        o.lIIlllIII[o.lIIlllIlI[35]] = o.lIIIIIIlllIl("CAYMQgQpRxsSADQCFBYZJQI=", "Fgzbp");
        o.lIIlllIII[o.lIIlllIlI[36]] = o.lIIIIIIlllll("0j7X+lpl7+k=", "ljeLQ");
        o.lIIlllIII[o.lIIlllIlI[37]] = o.lIIIIIIllllI("uLXUB9kuZnLSLVzbyRuJXI5XG9c2F3n1", "UBdeS");
        o.lIIlllIII[o.lIIlllIlI[38]] = o.lIIIIIIllllI("CXEzev1xYSbu5A1tqeNlgg==", "kIsBL");
        o.lIIlllIII[o.lIIlllIlI[39]] = o.lIIIIIIllllI("3l6wbuTi8nvBmxGLRh0KEA==", "OpcPN");
        o.lIIlllIII[o.lIIlllIlI[44]] = o.lIIIIIIlllIl("AyMiNzwvIzFyKSc/Mjcg", "FMVRN");
        o.lIIlllIII[o.lIIlllIlI[12]] = o.lIIIIIIlllIl("BjEgKg==", "IAEDi");
        o.lIIlllIII[o.lIIlllIlI[42]] = o.lIIIIIIlllll("1MQZYpB5IQlT16fDlf0dkoys+a0jq7mjoqKjkpXS7TsMMqbVKgGXyA==", "SMKeL");
        o.lIIlllIII[o.lIIlllIlI[62]] = o.lIIIIIIllllI("61G+lUMbAoZkJirxHKZHtLSoN2DhHwvP", "QeRQh");
        o.lIIlllIII[o.lIIlllIlI[67]] = o.lIIIIIIllllI("gt0TEHm3/eWrjJT4Te2Z/epKvlrELZ7hCdsfOlPOanGOAYade4pKpg==", "zgerV");
        o.lIIlllIII[o.lIIlllIlI[69]] = o.lIIIIIIllllI("cPZTMH95aqjAo9mkxtmYNA==", "gpQxQ");
        o.lIIlllIII[o.lIIlllIlI[72]] = o.lIIIIIIlllIl("FQ82ZTooWiwtJzUeeDEnKx8=", "GzXEN");
        o.lIIlllIII[o.lIIlllIlI[79]] = o.lIIIIIIllllI("efhMgXctot6kcPImy/QfIA==", "rEyuH");
        o.lIIlllIII[o.lIIlllIlI[80]] = o.lIIIIIIlllIl("NS8NPA==", "eFnWC");
        o.lIIlllIII[o.lIIlllIlI[81]] = o.lIIIIIIlllIl("KTkIHj8XN0sdMwsyGA==", "yPkuV");
        o.lIIlllIII[o.lIIlllIlI[82]] = o.lIIIIIIllllI("iXbnaK//dEM=", "WjNEq");
        o.lIIlllIII[o.lIIlllIlI[90]] = o.lIIIIIIllllI("JrcI5Ssf9cRZCw3n8wYbdpvG7Y0nln+/", "wYNyi");
        o.lIIlllIII[o.lIIlllIlI[91]] = o.lIIIIIIlllll("J+1CxzfxNvpc5TQMdhNEljAirMOv5/Ar", "jbVeZ");
        o.lIIlllIII[o.lIIlllIlI[92]] = o.lIIIIIIlllIl("DgQiOyEEFg==", "jqGWH");
        o.lIIlllIII[o.lIIlllIlI[93]] = o.lIIIIIIllllI("JGEYqcaJwVw=", "QHPSB");
        o.lIIlllIII[o.lIIlllIlI[94]] = o.lIIIIIIllllI("4ZCCazqk4Gk=", "qPOwG");
        o.lIIlllIII[o.lIIlllIlI[95]] = o.lIIIIIIlllIl("KywABSY=", "cIrgU");
        o.lIIlllIII[o.lIIlllIlI[96]] = o.lIIIIIIlllll("ovILSZ4C3lI=", "Ovtgg");
        o.lIIlllIII[o.lIIlllIlI[87]] = o.lIIIIIIlllIl("CwU5Ag==", "LdMgA");
        o.lIIlllIII[o.lIIlllIlI[98]] = o.lIIIIIIlllll("6RrSliMoQRI=", "NVrdS");
        o.lIIlllIII[o.lIIlllIlI[99]] = o.lIIIIIIlllll("VS3USsDgUj8=", "niNCe");
        o.lIIlllIII[o.lIIlllIlI[100]] = o.lIIIIIIllllI("IgK05fE1YBQ=", "Hmwdd");
        o.lIIlllIII[o.lIIlllIlI[101]] = o.lIIIIIIlllIl("HQoMDA==", "Rzibk");
        o.lIIlllIII[o.lIIlllIlI[102]] = o.lIIIIIIlllIl("KRUFfQ==", "ppvSG");
    }

    private static void af() {
        block11: {
            d lllllllIIlIIII;
            block10: {
                block9: {
                    block8: {
                        Predicate<Item> lllllllIIlIIIl;
                        int[] nArray = new int[lIIlllIlI[0]];
                        nArray[o.lIIlllIlI[1]] = lIIlllIlI[11];
                        if (o.lIIIIIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIlllIlI[11], lIIlllIlI[0], e.c(lIIlllIlI[83], lIIlllIlI[50]));
                            bv.add(d2);
                            "".length();
                        }
                        if (o.lIIIIIllIIlI(Bank.contains(lllllllIIlIIIl = item -> item.getName().toLowerCase().contains(lIIlllIII[lIIlllIlI[91]])) ? 1 : 0)) {
                            lllllllIIlIIII = new d(lIIlllIlI[84], lIIlllIlI[14], lIIlllIlI[85]);
                            bv.add(lllllllIIlIIII);
                            "".length();
                        }
                        int[] nArray2 = new int[lIIlllIlI[0]];
                        nArray2[o.lIIlllIlI[1]] = lIIlllIlI[7];
                        if (!o.lIIIIIllIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block8;
                        int[] nArray3 = new int[lIIlllIlI[0]];
                        nArray3[o.lIIlllIlI[1]] = lIIlllIlI[7];
                        if (!o.lIIIIIllIIII(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                        int[] nArray4 = new int[lIIlllIlI[0]];
                        nArray4[o.lIIlllIlI[1]] = lIIlllIlI[7];
                        if (!o.lIIIIIllIIIl(Bank.getFirst((int[])nArray4).getQuantity(), lIIlllIlI[86])) break block9;
                    }
                    lllllllIIlIIII = new d(lIIlllIlI[7], lIIlllIlI[86], i.bq);
                    bv.add(lllllllIIlIIII);
                    "".length();
                }
                int[] nArray = new int[lIIlllIlI[0]];
                nArray[o.lIIlllIlI[1]] = lIIlllIlI[10];
                if (!o.lIIIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block10;
                int[] nArray5 = new int[lIIlllIlI[0]];
                nArray5[o.lIIlllIlI[1]] = lIIlllIlI[10];
                if (!o.lIIIIIllIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                int[] nArray6 = new int[lIIlllIlI[0]];
                nArray6[o.lIIlllIlI[1]] = lIIlllIlI[10];
                if (!o.lIIIIIllIIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIlllIlI[29])) break block11;
            }
            lllllllIIlIIII = new d(lIIlllIlI[10], lIIlllIlI[87], lIIlllIlI[88]);
            bv.add(lllllllIIlIIII);
            "".length();
        }
    }
}

