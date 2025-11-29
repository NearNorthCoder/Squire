package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.B  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/B.class */
public class B implements InterfaceC0003ac {
    private static /* synthetic */ WorldPoint eu;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ String[] cE;
    static /* synthetic */ boolean ep;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ WorldPoint et;
    private static /* synthetic */ String[] llIlIllIII;
    private static /* synthetic */ int[] llIlIllIll;
    private static /* synthetic */ WorldPoint es;
    private static /* synthetic */ int ev;
    private static /* synthetic */ WorldPoint eq;
    static /* synthetic */ int di;
    private static /* synthetic */ WorldPoint de;
    static /* synthetic */ WorldArea eo;
    private static /* synthetic */ WorldPoint er;

    private static boolean lIllIlIIllIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIlIllIll[1]];
        iArr[llIlIllIll[2]] = llIlIllIll[8];
        if (lIllIlIIllIII(Inventory.getCount(iArr))) {
            String[] strArr = new String[llIlIllIll[1]];
            strArr[llIlIllIll[2]] = llIlIllIII[llIlIllIll[52]];
            if (lIllIlIIllIII(Inventory.getCount(strArr))) {
                String[] strArr2 = new String[llIlIllIll[1]];
                strArr2[llIlIllIll[2]] = llIlIllIII[llIlIllIll[53]];
                if (lIllIlIIllIII(Inventory.getCount(strArr2))) {
                    String[] strArr3 = new String[llIlIllIll[1]];
                    strArr3[llIlIllIll[2]] = llIlIllIII[llIlIllIll[54]];
                    if (lIllIlIIllIII(Inventory.getCount(strArr3))) {
                        String[] strArr4 = new String[llIlIllIll[1]];
                        strArr4[llIlIllIll[2]] = llIlIllIII[llIlIllIll[55]];
                        if (lIllIlIIllIII(Inventory.getCount(strArr4))) {
                            String[] strArr5 = new String[llIlIllIll[1]];
                            strArr5[llIlIllIll[2]] = llIlIllIII[llIlIllIll[56]];
                            if (lIllIlIIllIII(Inventory.getCount(strArr5))) {
                                int[] iArr2 = new int[llIlIllIll[1]];
                                iArr2[llIlIllIll[2]] = llIlIllIll[17];
                                if (lIllIlIIllIII(Inventory.getCount(iArr2)) && lIllIlIIlIlIl(Inventory.contains(C0019f.ba) ? 1 : 0)) {
                                    ?? r0 = llIlIllIll[1];
                                    "".length();
                                    return (-(145 ^ 149)) > 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return llIlIllIll[2];
    }

    private static boolean lIllIlIIlIlIl(int i) {
        return i != 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIllIII[llIlIllIll[63]];
    }

    private static void Q() {
        int[] iArr = new int[llIlIllIll[1]];
        iArr[llIlIllIll[2]] = llIlIllIll[12];
        if (lIllIlIIlIllI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIll[12], llIlIllIll[1], llIlIllIll[57]));
            "".length();
        }
        int[] iArr2 = new int[llIlIllIll[1]];
        iArr2[llIlIllIll[2]] = llIlIllIll[10];
        if (lIllIlIIlIllI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIll[10], llIlIllIll[1], llIlIllIll[4]));
            "".length();
        }
        int[] iArr3 = new int[llIlIllIll[1]];
        iArr3[llIlIllIll[2]] = llIlIllIll[9];
        if (lIllIlIIlIllI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIll[9], llIlIllIll[1], llIlIllIll[4]));
            "".length();
        }
        int[] iArr4 = new int[llIlIllIll[1]];
        iArr4[llIlIllIll[2]] = llIlIllIll[14];
        if (lIllIlIIlIllI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIll[14], llIlIllIll[24], llIlIllIll[4]));
            "".length();
        }
        int[] iArr5 = new int[llIlIllIll[1]];
        iArr5[llIlIllIll[2]] = llIlIllIll[16];
        if (lIllIlIIlIllI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIll[16], llIlIllIll[24], C0023j.cf));
            "".length();
        }
        int[] iArr6 = new int[llIlIllIll[1]];
        iArr6[llIlIllIll[2]] = llIlIllIll[11];
        if (lIllIlIIlIllI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIll[11], llIlIllIll[0], llIlIllIll[58]));
            "".length();
        }
        if (lIllIlIIlIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIllIII[llIlIllIll[64]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIll[59], llIlIllIll[13], llIlIllIll[60]));
            "".length();
        }
        int[] iArr7 = new int[llIlIllIll[1]];
        iArr7[llIlIllIll[2]] = llIlIllIll[8];
        if (lIllIlIIlIllI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIll[8], llIlIllIll[52], llIlIllIll[61]));
            "".length();
        }
    }

    static {
        lIllIlIIlIIlI();
        lIllIlIIlIIIl();
        bv = new ArrayList();
        eo = new WorldArea(llIlIllIll[65], llIlIllIll[66], llIlIllIll[24], llIlIllIll[25], llIlIllIll[2]);
        String[] strArr = new String[llIlIllIll[22]];
        strArr[llIlIllIll[2]] = llIlIllIII[llIlIllIll[67]];
        strArr[llIlIllIll[1]] = llIlIllIII[llIlIllIll[68]];
        strArr[llIlIllIll[3]] = llIlIllIII[llIlIllIll[69]];
        strArr[llIlIllIll[5]] = llIlIllIII[llIlIllIll[19]];
        strArr[llIlIllIll[6]] = llIlIllIII[llIlIllIll[70]];
        strArr[llIlIllIll[13]] = llIlIllIII[llIlIllIll[71]];
        strArr[llIlIllIll[15]] = llIlIllIII[llIlIllIll[72]];
        strArr[llIlIllIll[7]] = llIlIllIII[llIlIllIll[73]];
        cE = strArr;
        de = new WorldPoint(llIlIllIll[74], llIlIllIll[75], llIlIllIll[2]);
        eq = new WorldPoint(llIlIllIll[76], llIlIllIll[77], llIlIllIll[2]);
        er = new WorldPoint(llIlIllIll[78], llIlIllIll[79], llIlIllIll[2]);
        es = new WorldPoint(llIlIllIll[80], llIlIllIll[81], llIlIllIll[2]);
        et = new WorldPoint(llIlIllIll[82], llIlIllIll[83], llIlIllIll[2]);
        eu = new WorldPoint(llIlIllIll[84], llIlIllIll[85], llIlIllIll[2]);
        ev = llIlIllIll[24];
    }

    private static void lIllIlIIlIIlI() {
        llIlIllIll = new int[87];
        llIlIllIll[0] = 129 ^ 139;
        llIlIllIll[1] = " ".length();
        llIlIllIll[2] = (23 ^ 47) & ((1 ^ 57) ^ (-1));
        llIlIllIll[3] = "  ".length();
        llIlIllIll[4] = (-(49 ^ 6)) & (-17474) & 22527;
        llIlIllIll[5] = "   ".length();
        llIlIllIll[6] = (((57 + 141) - 144) + 101) ^ (((5 + 136) - 4) + 22);
        llIlIllIll[7] = 35 ^ 36;
        llIlIllIll[8] = (-((-1155) & 17595)) & (-129) & 24575;
        llIlIllIll[9] = (-((-8877) & 26285)) & (-14405) & 32764;
        llIlIllIll[10] = (-24717) & 25023;
        llIlIllIll[11] = (-((-16665) & 20379)) & (-4101) & 8127;
        llIlIllIll[12] = (-31217) & 32766;
        llIlIllIll[13] = 39 ^ 34;
        llIlIllIll[14] = (-(((148 + 170) - 212) + 72)) & (-8197) & 16383;
        llIlIllIll[15] = (202 ^ 169) ^ (109 ^ 8);
        llIlIllIll[16] = (-((-20737) & 22435)) & (-16385) & 30707;
        llIlIllIll[17] = (-((-2343) & 11567)) & (-16389) & 26607;
        llIlIllIll[18] = (-18435) & 19434;
        llIlIllIll[19] = 62 ^ 12;
        llIlIllIll[20] = 33 ^ 58;
        llIlIllIll[21] = 125 ^ 113;
        llIlIllIll[22] = 82 ^ 90;
        llIlIllIll[23] = 105 ^ 96;
        llIlIllIll[24] = (((19 + 85) - 60) + 124) ^ (((62 + 29) - (-67)) + 5);
        llIlIllIll[25] = 44 ^ 33;
        llIlIllIll[26] = (((4 + 53) - (-11)) + 67) ^ (((106 + 17) - 69) + 83);
        llIlIllIll[27] = (217 ^ 132) ^ (94 ^ 12);
        llIlIllIll[28] = 208 ^ 192;
        llIlIllIll[29] = 125 ^ 108;
        llIlIllIll[30] = (((22 + 86) - 9) + 88) ^ (((142 + 143) - 161) + 45);
        llIlIllIll[31] = (((80 + 6) - 77) + 139) ^ (((68 + 19) - (-29)) + 19);
        llIlIllIll[32] = 125 ^ 105;
        llIlIllIll[33] = (47 ^ 67) ^ (84 ^ 45);
        llIlIllIll[34] = 187 ^ 173;
        llIlIllIll[35] = 91 ^ 76;
        llIlIllIll[36] = (172 ^ 146) ^ (22 ^ 48);
        llIlIllIll[37] = (((30 + 123) - 82) + 60) ^ (((70 + 100) - 107) + 91);
        llIlIllIll[38] = 101 ^ 127;
        llIlIllIll[39] = 38 ^ 58;
        llIlIllIll[40] = (95 ^ 114) ^ (185 ^ 137);
        llIlIllIll[41] = (168 ^ 144) ^ (61 ^ 27);
        llIlIllIll[42] = (((64 + 149) - 93) + 55) ^ (((170 + 50) - 45) + 1);
        llIlIllIll[43] = (-((-1988) & 6087)) & (-24581) & 32759;
        llIlIllIll[44] = (234 ^ 147) ^ (239 ^ 182);
        llIlIllIll[45] = (((123 + 1) - 60) + 94) ^ (((163 + 99) - 203) + 132);
        llIlIllIll[46] = 134 ^ 164;
        llIlIllIll[47] = 1 ^ 34;
        llIlIllIll[48] = (126 ^ 69) ^ (36 ^ 59);
        llIlIllIll[49] = (((131 + 173) - 131) + 9) ^ (((70 + 133) - 176) + 120);
        llIlIllIll[50] = (109 ^ 92) ^ (212 ^ 195);
        llIlIllIll[51] = 162 ^ 133;
        llIlIllIll[52] = (95 ^ 5) ^ (27 ^ 105);
        llIlIllIll[53] = 137 ^ 160;
        llIlIllIll[54] = 161 ^ 139;
        llIlIllIll[55] = (((187 + 151) - 170) + 71) ^ (((113 + 3) - 11) + 91);
        llIlIllIll[56] = 121 ^ 85;
        llIlIllIll[57] = (-((-24841) & 32011)) & (-16534) & 32703;
        llIlIllIll[58] = (-31244) & 31743;
        llIlIllIll[59] = (-4098) & 16077;
        llIlIllIll[60] = (-((-3553) & 8182)) & (-67) & 29695;
        llIlIllIll[61] = (-((-8453) & 15671)) & (-24642) & 32759;
        llIlIllIll[62] = (17 ^ 113) ^ (126 ^ 122);
        llIlIllIll[63] = (((18 + 128) - 65) + 90) ^ (((32 + 56) - (-30)) + 16);
        llIlIllIll[64] = 237 ^ 195;
        llIlIllIll[65] = (-((-4188) & 13823)) & (-21) & 12287;
        llIlIllIll[66] = (-529) & 3962;
        llIlIllIll[67] = 164 ^ 139;
        llIlIllIll[68] = 108 ^ 92;
        llIlIllIll[69] = (87 ^ 5) ^ (118 ^ 21);
        llIlIllIll[70] = 70 ^ 117;
        llIlIllIll[71] = (239 ^ 190) ^ (200 ^ 173);
        llIlIllIll[72] = (113 ^ 21) ^ (70 ^ 23);
        llIlIllIll[73] = 164 ^ 146;
        llIlIllIll[74] = (-((-2049) & 15573)) & (-9) & 16351;
        llIlIllIll[75] = (-21005) & 24492;
        llIlIllIll[76] = (-((-2891) & 12127)) & (-4225) & 16119;
        llIlIllIll[77] = (-3) & 3502;
        llIlIllIll[78] = (-((-2051) & 27035)) & (-4129) & 31743;
        llIlIllIll[79] = (-((-2181) & 6869)) & (-16385) & 24566;
        llIlIllIll[80] = (-4108) & 6751;
        llIlIllIll[81] = (-(172 ^ 165)) & (-4226) & 7675;
        llIlIllIll[82] = (-((-10249) & 30761)) & (-1025) & 24174;
        llIlIllIll[83] = (-((-2597) & 23215)) & (-1) & 24063;
        llIlIllIll[84] = (-9381) & 12021;
        llIlIllIll[85] = (-21137) & 24575;
        llIlIllIll[86] = (158 ^ 131) ^ (82 ^ 120);
    }

    private static String lIllIlIIIIIll(String llllllllllllllllllIIIllIIlllIIlI, String llllllllllllllllllIIIllIIlllIIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIllIIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIllIIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIllIIlllIlII.init(llIlIllIll[3], llllllllllllllllllIIIllIIlllIlIl);
            return new String(llllllllllllllllllIIIllIIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIllIIlllIIll) {
            llllllllllllllllllIIIllIIlllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIlIllI(int i) {
        return i == 0;
    }

    private static String lIllIlIIIIlII(String llllllllllllllllllIIIllIIllIIlIl, String llllllllllllllllllIIIllIIllIIlII) {
        try {
            SecretKeySpec llllllllllllllllllIIIllIIllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIIllIIlII.getBytes(StandardCharsets.UTF_8)), llIlIllIll[22]), "DES");
            Cipher llllllllllllllllllIIIllIIllIIlll = Cipher.getInstance("DES");
            llllllllllllllllllIIIllIIllIIlll.init(llIlIllIll[3], llllllllllllllllllIIIllIIllIlIII);
            return new String(llllllllllllllllllIIIllIIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIllIIllIIllI) {
            llllllllllllllllllIIIllIIllIIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIIIIlIl(String llllllllllllllllllIIIllIIlIlIlIl, String llllllllllllllllllIIIllIIlIlIlII) {
        String llllllllllllllllllIIIllIIlIlIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIllIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIIIllIIlIlIIlI = llllllllllllllllllIIIllIIlIlIlII.toCharArray();
        int llllllllllllllllllIIIllIIlIlIIIl = llIlIllIll[2];
        char[] charArray = llllllllllllllllllIIIllIIlIlIlIl2.toCharArray();
        int length = charArray.length;
        int i = llIlIllIll[2];
        while (lIllIlIIlIIll(i, length)) {
            char llllllllllllllllllIIIllIIlIlIllI = charArray[i];
            sb.append((char) (llllllllllllllllllIIIllIIlIlIllI ^ llllllllllllllllllIIIllIIlIlIIlI[llllllllllllllllllIIIllIIlIlIIIl % llllllllllllllllllIIIllIIlIlIIlI.length]));
            "".length();
            llllllllllllllllllIIIllIIlIlIIIl++;
            i++;
            "".length();
            if ((109 ^ 104) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIlIIlIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIllIll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIlIIlIlII(C0018e.j(ev), llIlIllIll[13])) {
            ?? r0 = llIlIllIll[1];
            "".length();
            return (-" ".length()) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIllIll[2];
    }

    private static boolean lIllIlIIlIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlIIllIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIlIIllIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIlIIlIlII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIlIIllIIl(int i, int i2) {
        return i > i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            by();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (34 ^ 54) & ((85 ^ 65) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIlIllIll[62];
    }

    private static void lIllIlIIlIIIl() {
        llIlIllIII = new String[llIlIllIll[86]];
        llIlIllIII[llIlIllIll[2]] = lIllIlIIIIIll("m9PcBsjO039dDetJkH9TNG+5KNPZrTzI3lGCRnEFhHXZJsBdUfseZP/RkSHxbMOd", "VZTjZ");
        llIlIllIII[llIlIllIll[1]] = lIllIlIIIIlII("l56q6WSRz9zk+ufOWDIOIA==", "gowKu");
        llIlIllIII[llIlIllIll[3]] = lIllIlIIIIIll("iv39y5ypCLNf8g9ctUasyQ==", "wYZCA");
        llIlIllIII[llIlIllIll[5]] = lIllIlIIIIIll("vC+bYh453qG2z4EKYAY8NwJy87Yf72Ka", "fEcFB");
        llIlIllIII[llIlIllIll[6]] = lIllIlIIIIlII("9nvYeds9R0dvgSi92op+feoT9VuzKSE/dk5xSnewxoHhpVOhRm0J3wDBL9p97ZoEkFJ9G22Y3aw=", "XdBWH");
        llIlIllIII[llIlIllIll[13]] = lIllIlIIIIIll("lu0WsvOTKbs=", "MxafV");
        llIlIllIII[llIlIllIll[15]] = lIllIlIIIIlIl("OwM6dicaQj8iMgcW", "ubLVS");
        llIlIllIII[llIlIllIll[7]] = lIllIlIIIIlIl("OSM3IREDOTFzFB8yJSc=", "jWVSe");
        llIlIllIII[llIlIllIll[22]] = lIllIlIIIIlII("ITy4YaZsmdc=", "XTHxQ");
        llIlIllIII[llIlIllIll[23]] = lIllIlIIIIlII("Yu+4jKDS2TFr4p+xFmXk+g==", "SFIsR");
        llIlIllIII[llIlIllIll[0]] = lIllIlIIIIlIl("PDIqdBAHOSt0EQElIw==", "nWNTf");
        llIlIllIII[llIlIllIll[24]] = lIllIlIIIIlII("48qcTjOyxK26ixYBRwIQTA==", "uFeEr");
        llIlIllIII[llIlIllIll[21]] = lIllIlIIIIlII("9LU0/pl/cNg=", "hWjXB");
        llIlIllIII[llIlIllIll[25]] = lIllIlIIIIIll("cqs2KokeQnLGLUvVJJwtwA==", "wIhGR");
        llIlIllIII[llIlIllIll[26]] = lIllIlIIIIlIl("Dy8XNQ==", "YFyPZ");
        llIlIllIII[llIlIllIll[27]] = lIllIlIIIIlIl("GCwhLg==", "NEOKO");
        llIlIllIII[llIlIllIll[28]] = lIllIlIIIIIll("QR7MNSsdPQM=", "TIaYv");
        llIlIllIII[llIlIllIll[29]] = lIllIlIIIIIll("srqSf+v9EyS/7G96s5jsdA==", "fkLHr");
        llIlIllIII[llIlIllIll[30]] = lIllIlIIIIlII("j53GFOjq9ntLv2aYEcXefQ==", "JRVsv");
        llIlIllIII[llIlIllIll[31]] = lIllIlIIIIIll("Xr8IGvOq58s=", "ZXrKX");
        llIlIllIII[llIlIllIll[32]] = lIllIlIIIIlII("nfKTDOXxwd2zLF7tAranGw==", "SEFQC");
        llIlIllIII[llIlIllIll[33]] = lIllIlIIIIlII("FtaPHZ1r4XLFuOzjRtS6iQ==", "ZjxKC");
        llIlIllIII[llIlIllIll[34]] = lIllIlIIIIIll("0yID9JeTrXAzGDAMc1tENQ==", "YiGZD");
        llIlIllIII[llIlIllIll[35]] = lIllIlIIIIIll("qSLowiC4Pbc=", "oriuo");
        llIlIllIII[llIlIllIll[36]] = lIllIlIIIIlIl("GBsUIW4fEwgo", "OzxMN");
        llIlIllIII[llIlIllIll[37]] = lIllIlIIIIIll("0+m14AHPQaA=", "FUxPa");
        llIlIllIII[llIlIllIll[38]] = lIllIlIIIIIll("GVF1szrRCVmaMbkfLQ6krw==", "YbXAJ");
        llIlIllIII[llIlIllIll[20]] = lIllIlIIIIIll("k6cxFuHmfY8=", "Ipguj");
        llIlIllIII[llIlIllIll[39]] = lIllIlIIIIlIl("E3YVKz4yIlgxLTM6FGI7P3YZIDU/dgwteTw/FiZ5O3YaKz49MwpiPzMlEA==", "ZVxBY");
        llIlIllIII[llIlIllIll[40]] = lIllIlIIIIlIl("DjE6Lgsq", "IPHBb");
        llIlIllIII[llIlIllIll[41]] = lIllIlIIIIlIl("PTATbyYGMAo7YQwwFj8=", "oQdOA");
        llIlIllIII[llIlIllIll[42]] = lIllIlIIIIlII("C0Wze8RmHdA=", "zMlCU");
        llIlIllIII[llIlIllIll[44]] = lIllIlIIIIlII("I+L6SYKjaP8=", "pBmTQ");
        llIlIllIII[llIlIllIll[45]] = lIllIlIIIIlII("x5UpjfTi93UJBisX4tsieQ==", "ovleg");
        llIlIllIII[llIlIllIll[46]] = lIllIlIIIIlII("OXIQR5d24Qpp9wlM4Frr0w==", "uAtQG");
        llIlIllIII[llIlIllIll[47]] = lIllIlIIIIIll("CvAwBQLHWas=", "bXktW");
        llIlIllIII[llIlIllIll[48]] = lIllIlIIIIlII("RZftkgjYCncFG3gJFWjSUg==", "eKLIS");
        llIlIllIII[llIlIllIll[49]] = lIllIlIIIIIll("MUpjNpwMK4nwHmYml4YP+Q==", "nuubF");
        llIlIllIII[llIlIllIll[50]] = lIllIlIIIIlII("SJRWxUMmPaCstH/AhxTR7w==", "LRJkJ");
        llIlIllIII[llIlIllIll[51]] = lIllIlIIIIlIl("OiYyFx0F", "lCAco");
        llIlIllIII[llIlIllIll[52]] = lIllIlIIIIIll("VtUSqvo+9Fn8bI2urxzTWzY0PISd+SpS", "DQTuf");
        llIlIllIII[llIlIllIll[53]] = lIllIlIIIIIll("xcEPaQ+iVA8=", "RjrJy");
        llIlIllIII[llIlIllIll[54]] = lIllIlIIIIlII("xreSmGdoRP4=", "dLpcv");
        llIlIllIII[llIlIllIll[55]] = lIllIlIIIIIll("iU+LkIIDfwiZ+nfLokYCug==", "LDfYV");
        llIlIllIII[llIlIllIll[56]] = lIllIlIIIIlII("xwA+dpLyZx8n2C7Az8H7WQ==", "VgtmP");
        llIlIllIII[llIlIllIll[63]] = lIllIlIIIIlII("NJXex7uXiXwEUFo4LYkC9w==", "HDbLo");
        llIlIllIII[llIlIllIll[64]] = lIllIlIIIIlII("lAnS6xy8+TUhX33rGesoLvgUV+pfSW4F", "PNeti");
        llIlIllIII[llIlIllIll[67]] = lIllIlIIIIIll("4PD30JvJREoDt9tgtsWQm9gRTifyZjXQaAI3z5QmKDTx0tro6c426bNGPIBb9L2J", "mWjLW");
        llIlIllIII[llIlIllIll[68]] = lIllIlIIIIIll("wD9WNrRCGNSbV3eAhguJcA==", "werYn");
        llIlIllIII[llIlIllIll[69]] = lIllIlIIIIlII("YkOcY4pwHbYTeg9meYv8Cr1o9Xc1aFnbDtGQAJDF3jI5cfa5TsKiRcOh//bygMXD", "cTuaK");
        llIlIllIII[llIlIllIll[19]] = lIllIlIIIIlIl("PA8ZAUBLBhAZSxhKFwhMDRgcCAIPGVQ=", "kjuml");
        llIlIllIII[llIlIllIll[70]] = lIllIlIIIIlII("qGKjzlHRdGx9kIqmssr3ITmy02Q656pmyD7G4pHfho8=", "XKVav");
        llIlIllIII[llIlIllIll[71]] = lIllIlIIIIIll("flvpsdblKtVW/eWg2+c5I8n+J2vkBMk9UHPQJSsDjM3+spNK0ceqbg==", "WxqLh");
        llIlIllIII[llIlIllIll[72]] = lIllIlIIIIlII("RisVAlh+/ggzGH6bQa9eS4tfx6cBJzPr51obh137mxLXOtF5hPfLcOJSfdD1Kc87", "DOVTO");
        llIlIllIII[llIlIllIll[73]] = lIllIlIIIIIll("fl9iEW8HAVc=", "zvmMb");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v294, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public static void by() {
        if (lIllIlIIlIIll(Skills.getLevel(Skill.FISHING), llIlIllIll[0])) {
            az.gH();
        }
        if (lIllIlIIlIlII(Skills.getLevel(Skill.FISHING), llIlIllIll[0])) {
            if (lIllIlIIlIlIl(bt ? 1 : 0)) {
                C0015b.a(bv);
                if (lIllIlIIlIIll(bv.size(), llIlIllIll[1])) {
                    System.out.println(llIlIllIII[llIlIllIll[2]]);
                    bt = llIlIllIll[2];
                }
            }
            if (lIllIlIIlIllI(bt ? 1 : 0)) {
                if (lIllIlIIlIllI(an() ? 1 : 0) && lIllIlIIlIIll(C0018e.j(ev), llIlIllIll[1])) {
                    String[] strArr = new String[llIlIllIll[1]];
                    strArr[llIlIllIll[2]] = llIlIllIII[llIlIllIll[1]];
                    if (lIllIlIIlIllI(Inventory.contains(strArr) ? 1 : 0)) {
                        BankLocation nearest = BankLocation.getNearest();
                        if (lIllIlIIlIlll(nearest) && lIllIlIIlIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[3]];
                            C0000a.a(nearest);
                        }
                        if (lIllIlIIlIlll(nearest) && lIllIlIIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIllIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepUntil(() -> {
                                    return Bank.isOpen();
                                }, llIlIllIll[4]);
                                "".length();
                            }
                            if (lIllIlIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIllIII[llIlIllIll[5]];
                                if (lIllIlIIllIII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks(llIlIllIll[6]);
                                    "".length();
                                }
                                if (lIllIlIIllIII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks(llIlIllIll[3]);
                                    "".length();
                                }
                                int[] iArr = new int[llIlIllIll[7]];
                                iArr[llIlIllIll[2]] = llIlIllIll[8];
                                iArr[llIlIllIll[1]] = llIlIllIll[9];
                                iArr[llIlIllIll[3]] = llIlIllIll[10];
                                iArr[llIlIllIll[5]] = llIlIllIll[11];
                                iArr[llIlIllIll[6]] = llIlIllIll[12];
                                iArr[llIlIllIll[13]] = llIlIllIll[14];
                                iArr[llIlIllIll[15]] = llIlIllIll[16];
                                if (lIllIlIIlIllI(C0018e.c(iArr) ? 1 : 0)) {
                                    Q();
                                    System.out.println(llIlIllIII[llIlIllIll[6]]);
                                    bt = llIlIllIll[1];
                                    return;
                                }
                                int[] iArr2 = new int[llIlIllIll[15]];
                                iArr2[llIlIllIll[2]] = llIlIllIll[8];
                                iArr2[llIlIllIll[1]] = llIlIllIll[9];
                                iArr2[llIlIllIll[3]] = llIlIllIll[10];
                                iArr2[llIlIllIll[5]] = llIlIllIll[11];
                                iArr2[llIlIllIll[6]] = llIlIllIll[12];
                                iArr2[llIlIllIll[13]] = llIlIllIll[14];
                                if (lIllIlIIlIlIl(C0018e.c(iArr2) ? 1 : 0)) {
                                    C0000a.a(llIlIllIll[8], llIlIllIll[0]);
                                    C0000a.a(llIlIllIll[14], llIlIllIll[0]);
                                    C0000a.a(llIlIllIll[9], llIlIllIll[1]);
                                    C0000a.a(llIlIllIll[10], llIlIllIll[1]);
                                    C0000a.a(llIlIllIll[11], llIlIllIll[0]);
                                    C0000a.a(llIlIllIll[12], llIlIllIll[1]);
                                    C0000a.a(llIlIllIll[16], llIlIllIll[5]);
                                    C0000a.a(llIlIllIll[17], llIlIllIll[18]);
                                }
                            }
                        }
                    }
                }
                if (lIllIlIIlIlIl(Inventory.contains(C0019f.ba) ? 1 : 0) && lIllIlIIlIIll(Movement.getRunEnergy(), llIlIllIll[19])) {
                    Inventory.getFirst(C0019f.ba).interact(llIlIllIII[llIlIllIll[13]]);
                    Time.sleepTicks(llIlIllIll[1]);
                    "".length();
                }
                if (lIllIlIIlIlIl(an() ? 1 : 0) && lIllIlIIlIIll(C0018e.j(ev), llIlIllIll[1])) {
                    int[] iArr3 = new int[llIlIllIll[1]];
                    iArr3[llIlIllIll[2]] = llIlIllIll[20];
                    if (lIllIlIIlIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[0])) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[15]];
                            if (lIllIlIIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(de);
                            "".length();
                            Time.sleepTicks(llIlIllIll[1]);
                            "".length();
                        }
                        if (lIllIlIIllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[21])) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[7]];
                            C0020g.a(llIlIllIII[llIlIllIll[22]], cE);
                        }
                    }
                }
                if (lIllIlIIllIll(C0018e.j(ev), llIlIllIll[1])) {
                    int[] iArr4 = new int[llIlIllIll[1]];
                    iArr4[llIlIllIll[2]] = llIlIllIll[20];
                    if (lIllIlIIlIlIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        String[] strArr2 = new String[llIlIllIll[1]];
                        strArr2[llIlIllIll[2]] = llIlIllIII[llIlIllIll[23]];
                        if (lIllIlIIlIllI(Inventory.contains(strArr2) ? 1 : 0)) {
                            di = llIlIllIll[2];
                            String[] strArr3 = new String[llIlIllIll[1]];
                            strArr3[llIlIllIll[2]] = llIlIllIII[llIlIllIll[0]];
                            if (lIllIlIIlIllI(Inventory.contains(strArr3) ? 1 : 0)) {
                                if (lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(er), llIlIllIll[6])) {
                                    AccBuilderSotf.c = llIlIllIII[llIlIllIll[24]];
                                    Movement.walkTo(er);
                                    "".length();
                                }
                                if (lIllIlIIllIlI(Players.getLocal().getWorldLocation().distanceTo(er), llIlIllIll[6])) {
                                    AccBuilderSotf.c = llIlIllIII[llIlIllIll[21]];
                                    String[] strArr4 = new String[llIlIllIll[1]];
                                    strArr4[llIlIllIll[2]] = llIlIllIII[llIlIllIll[25]];
                                    if (lIllIlIIlIllI(Inventory.contains(strArr4) ? 1 : 0)) {
                                        String[] strArr5 = new String[llIlIllIll[1]];
                                        strArr5[llIlIllIll[2]] = llIlIllIII[llIlIllIll[26]];
                                        if (lIllIlIIlIlll(TileObjects.getNearest(strArr5))) {
                                            String[] strArr6 = new String[llIlIllIll[1]];
                                            strArr6[llIlIllIll[2]] = llIlIllIII[llIlIllIll[27]];
                                            TileObjects.getNearest(strArr6).interact(llIlIllIII[llIlIllIll[28]]);
                                            Time.sleepTicks(llIlIllIll[3]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                            String[] strArr7 = new String[llIlIllIll[1]];
                            strArr7[llIlIllIll[2]] = llIlIllIII[llIlIllIll[29]];
                            if (lIllIlIIlIlIl(Inventory.contains(strArr7) ? 1 : 0)) {
                                if (lIllIlIIlIllI(eo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIlIllIII[llIlIllIll[30]];
                                    if (lIllIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo(eu);
                                        "".length();
                                        Time.sleepTicks(llIlIllIll[1]);
                                        "".length();
                                    }
                                    C0020g.a(cE);
                                }
                                if (lIllIlIIlIlIl(eo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr8 = new String[llIlIllIll[1]];
                                    strArr8[llIlIllIll[2]] = llIlIllIII[llIlIllIll[31]];
                                    if (lIllIlIIlIlIl(Inventory.contains(strArr8) ? 1 : 0)) {
                                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[32]];
                                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                                        String[] strArr9 = new String[llIlIllIll[1]];
                                        strArr9[llIlIllIll[2]] = llIlIllIII[llIlIllIll[33]];
                                        if (lIllIlIIllIIl(worldLocation.distanceTo(TileObjects.getNearest(strArr9).getWorldLocation()), llIlIllIll[3])) {
                                            String[] strArr10 = new String[llIlIllIll[1]];
                                            strArr10[llIlIllIll[2]] = llIlIllIII[llIlIllIll[34]];
                                            Movement.walkTo(TileObjects.getNearest(strArr10).getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(llIlIllIll[6]);
                                            "".length();
                                        }
                                        if (lIllIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr11 = new String[llIlIllIll[1]];
                                            strArr11[llIlIllIll[2]] = llIlIllIII[llIlIllIll[35]];
                                            Item first = Inventory.getFirst(strArr11);
                                            String[] strArr12 = new String[llIlIllIll[1]];
                                            strArr12[llIlIllIll[2]] = llIlIllIII[llIlIllIll[36]];
                                            first.useOn(TileObjects.getNearest(strArr12));
                                            Time.sleepTicks(llIlIllIll[3]);
                                            "".length();
                                        }
                                        C0020g.a(cE);
                                    }
                                    String[] strArr13 = new String[llIlIllIll[1]];
                                    strArr13[llIlIllIll[2]] = llIlIllIII[llIlIllIll[37]];
                                    if (lIllIlIIlIllI(Inventory.contains(strArr13) ? 1 : 0) && lIllIlIIlIllI(ep ? 1 : 0)) {
                                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[38]];
                                        C0020g.a(llIlIllIII[llIlIllIll[20]], cE);
                                        if (lIllIlIIlIlIl(Dialog.getText().contains(llIlIllIII[llIlIllIll[39]]) ? 1 : 0)) {
                                            ep = llIlIllIll[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIllIlIIllIll(C0018e.j(ev), llIlIllIll[5])) {
                    String[] strArr14 = new String[llIlIllIll[1]];
                    strArr14[llIlIllIll[2]] = llIlIllIII[llIlIllIll[40]];
                    if (lIllIlIIlIllI(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[llIlIllIll[1]];
                        strArr15[llIlIllIll[2]] = llIlIllIII[llIlIllIll[41]];
                        if (lIllIlIIlIllI(Inventory.contains(strArr15) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[42]];
                            int[] iArr5 = new int[llIlIllIll[1]];
                            iArr5[llIlIllIll[2]] = llIlIllIll[43];
                            NPCs.getNearest(iArr5).interact(llIlIllIII[llIlIllIll[44]]);
                            Time.sleepTicks(llIlIllIll[13]);
                            "".length();
                        }
                    }
                    String[] strArr16 = new String[llIlIllIll[1]];
                    strArr16[llIlIllIll[2]] = llIlIllIII[llIlIllIll[45]];
                    if (lIllIlIIlIlIl(Inventory.contains(strArr16) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[46]];
                        C0020g.a(llIlIllIII[llIlIllIll[47]], cE);
                    }
                }
                String[] strArr17 = new String[llIlIllIll[1]];
                strArr17[llIlIllIll[2]] = llIlIllIII[llIlIllIll[48]];
                if (lIllIlIIlIlIl(Inventory.contains(strArr17) ? 1 : 0)) {
                    if (lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[13])) {
                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[49]];
                        Movement.walkTo(de);
                        "".length();
                        Time.sleepTicks(llIlIllIll[1]);
                        "".length();
                    }
                    if (lIllIlIIllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[13])) {
                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[50]];
                        if (lIllIlIIlIIll(di, llIlIllIll[1])) {
                            aN.qf += llIlIllIll[1];
                            aN.u(AccBuilderSotf.m);
                            di += llIlIllIll[1];
                            aN.qf = llIlIllIll[2];
                            dj = llIlIllIll[2];
                        }
                        C0020g.a(llIlIllIII[llIlIllIll[51]], cE);
                    }
                }
            }
        }
    }
}
