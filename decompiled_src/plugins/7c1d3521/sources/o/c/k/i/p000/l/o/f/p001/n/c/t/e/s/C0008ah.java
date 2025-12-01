package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ah  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ah.class */
public class C0008ah implements InterfaceC0003ac {
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ List<C0017d> bv;
    public static /* synthetic */ int[] cK;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ WorldArea cM;
    public static /* synthetic */ WorldArea cL;
    public static /* synthetic */ WorldPoint cO;
    private static /* synthetic */ String[] llIIllIIII;
    private static /* synthetic */ int[] llIIllIIlI;
    public static /* synthetic */ WorldPoint cP;

    private static void lIlIllIIIIllI() {
        llIIllIIlI = new int[72];
        llIIllIIlI[0] = (145 ^ 149) & ((139 ^ 143) ^ (-1));
        llIIllIIlI[1] = " ".length();
        llIIllIIlI[2] = (((92 + 13) - (-21)) + 40) ^ (((91 + 11) - (-26)) + 14);
        llIIllIIlI[3] = "  ".length();
        llIIllIIlI[4] = "   ".length();
        llIIllIIlI[5] = (-8229) & 13228;
        llIIllIIlI[6] = 139 ^ 143;
        llIIllIIlI[7] = (-31769) & 32763;
        llIIllIIlI[8] = (-"  ".length()) & (-7187) & 8187;
        llIIllIIlI[9] = (-((-13575) & 30143)) & (-1) & 24575;
        llIIllIIlI[10] = 166 ^ 163;
        llIIllIIlI[11] = (-23685) & 24063;
        llIIllIIlI[12] = (106 ^ 33) ^ (142 ^ 161);
        llIIllIIlI[13] = 150 ^ 153;
        llIIllIIlI[14] = (115 ^ 66) ^ (27 ^ 44);
        llIIllIIlI[15] = 142 ^ 137;
        llIIllIIlI[16] = (-30797) & 32127;
        llIIllIIlI[17] = (-30921) & 32253;
        llIIllIIlI[18] = (204 ^ 143) ^ (212 ^ 159);
        llIIllIIlI[19] = 64 ^ 84;
        llIIllIIlI[20] = 107 ^ 98;
        llIIllIIlI[21] = (58 ^ 116) ^ (1 ^ 69);
        llIIllIIlI[22] = (((78 + 118) - 36) + 25) ^ (((80 + 106) - 39) + 31);
        llIIllIIlI[23] = (22 ^ 43) ^ (178 ^ 131);
        llIIllIIlI[24] = (183 ^ 157) ^ (62 ^ 25);
        llIIllIIlI[25] = 143 ^ 129;
        llIIllIIlI[26] = 78 ^ 94;
        llIIllIIlI[27] = -" ".length();
        llIIllIIlI[28] = (-((-839) & 23399)) & (-9794) & 38895231;
        llIIllIIlI[29] = 114 ^ 99;
        llIIllIIlI[30] = 6 ^ 20;
        llIIllIIlI[31] = 162 ^ 177;
        llIIllIIlI[32] = (118 ^ 2) ^ (51 ^ 82);
        llIIllIIlI[33] = (66 ^ 41) ^ (85 ^ 40);
        llIIllIIlI[34] = (((73 + 114) - 101) + 64) ^ (((54 + 43) - 71) + 110);
        llIIllIIlI[35] = (((13 + 121) - 48) + 55) ^ (((104 + 126) - 98) + 22);
        llIIllIIlI[36] = 3 ^ 27;
        llIIllIIlI[37] = (208 ^ 181) ^ (224 ^ 156);
        llIIllIIlI[38] = 45 ^ 55;
        llIIllIIlI[39] = 162 ^ 185;
        llIIllIIlI[40] = (-((-3491) & 24483)) & (-10263) & 32415;
        llIIllIIlI[41] = 47 ^ 51;
        llIIllIIlI[42] = (-((-30739) & 31643)) & (-18453) & 20479;
        llIIllIIlI[43] = (46 ^ 68) ^ (207 ^ 184);
        llIIllIIlI[44] = (-((-4645) & 23343)) & (-581) & 20351;
        llIIllIIlI[45] = (-10833) & 12031;
        llIIllIIlI[46] = (75 ^ 37) ^ (27 ^ 106);
        llIIllIIlI[47] = (-((-1689) & 28572)) & (-4177) & 32763;
        llIIllIIlI[48] = 144 ^ 176;
        llIIllIIlI[49] = (-4098) & 15223;
        llIIllIIlI[50] = 137 ^ 168;
        llIIllIIlI[51] = (-30795) & 31694;
        llIIllIIlI[52] = (-(153 ^ 173)) & (-24577) & 32635;
        llIIllIIlI[53] = (-22338) & 57337;
        llIIllIIlI[54] = (-((-11465) & 15582)) & (-3587) & 32703;
        llIIllIIlI[55] = (-((-4173) & 13391)) & (-16385) & 26102;
        llIIllIIlI[56] = (-17506) & 32505;
        llIIllIIlI[57] = (((99 + 134) - 208) + 126) ^ (((151 + 117) - 227) + 140);
        llIIllIIlI[58] = (243 ^ 137) ^ (99 ^ 58);
        llIIllIIlI[59] = (-((-2697) & 19433)) & (-4099) & 24059;
        llIIllIIlI[60] = (-((-4305) & 13301)) & (-16386) & 28671;
        llIIllIIlI[61] = (-((-14827) & 31739)) & (-4356) & 24511;
        llIIllIIlI[62] = (-((-7617) & 32749)) & (-258) & 28669;
        llIIllIIlI[63] = (-((-4183) & 29663)) & (-1) & 28665;
        llIIllIIlI[64] = (-16417) & 19583;
        llIIllIIlI[65] = (((157 + 60) - 172) + 134) ^ (((70 + 113) - 155) + 103);
        llIIllIIlI[66] = (-29443) & 32655;
        llIIllIIlI[67] = (-((-5587) & 30163)) & (-129) & 27885;
        llIIllIIlI[68] = (-29002) & 32255;
        llIIllIIlI[69] = (-21025) & 24255;
        llIIllIIlI[70] = (-513) & 3808;
        llIIllIIlI[71] = (84 ^ 88) ^ (173 ^ 133);
    }

    private static boolean lIlIllIIIlIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIllIIlI[0];
    }

    private static String lIlIllIIIIIIl(String llllllllllllllllllIIllIlllllIlII, String llllllllllllllllllIIllIlllllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIlllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIllIlllllIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIllIlllllIllI.init(llIIllIIlI[3], secretKeySpec);
            return new String(llllllllllllllllllIIllIlllllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIllIlllllIlIl) {
            llllllllllllllllllIIllIlllllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIlIII(int i) {
        return i != 0;
    }

    public static void Q() {
        int[] iArr = new int[llIIllIIlI[1]];
        iArr[llIIllIIlI[0]] = llIIllIIlI[9];
        if (lIlIllIIIlIlI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[9], llIIllIIlI[2], llIIllIIlI[51]));
            "".length();
        }
        int[] iArr2 = new int[llIIllIIlI[1]];
        iArr2[llIIllIIlI[0]] = llIIllIIlI[52];
        if (lIlIllIIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[52], llIIllIIlI[10], llIIllIIlI[51]));
            "".length();
        }
        int[] iArr3 = new int[llIIllIIlI[1]];
        iArr3[llIIllIIlI[0]] = llIIllIIlI[49];
        if (lIlIllIIIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[49], llIIllIIlI[1], llIIllIIlI[53]));
            "".length();
        }
        int[] iArr4 = new int[llIIllIIlI[1]];
        iArr4[llIIllIIlI[0]] = llIIllIIlI[47];
        if (lIlIllIIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[47], llIIllIIlI[1], llIIllIIlI[54]));
            "".length();
        }
        int[] iArr5 = new int[llIIllIIlI[1]];
        iArr5[llIIllIIlI[0]] = llIIllIIlI[11];
        if (lIlIllIIIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[11], llIIllIIlI[12], llIIllIIlI[55]));
            "".length();
        }
        int[] iArr6 = new int[llIIllIIlI[1]];
        iArr6[llIIllIIlI[0]] = llIIllIIlI[40];
        if (lIlIllIIIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[40], llIIllIIlI[1], llIIllIIlI[56]));
            "".length();
        }
        int[] iArr7 = new int[llIIllIIlI[1]];
        iArr7[llIIllIIlI[0]] = llIIllIIlI[44];
        if (lIlIllIIIlIlI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[44], llIIllIIlI[1], llIIllIIlI[56]));
            "".length();
        }
        int[] iArr8 = new int[llIIllIIlI[1]];
        iArr8[llIIllIIlI[0]] = llIIllIIlI[45];
        if (lIlIllIIIlIlI(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[45], llIIllIIlI[1], llIIllIIlI[56]));
            "".length();
        }
        int[] iArr9 = new int[llIIllIIlI[1]];
        iArr9[llIIllIIlI[0]] = llIIllIIlI[42];
        if (lIlIllIIIlIlI(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[42], llIIllIIlI[1], llIIllIIlI[56]));
            "".length();
        }
        if (lIlIllIIIllIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[2])) {
            int[] iArr10 = new int[llIIllIIlI[1]];
            iArr10[llIIllIIlI[0]] = llIIllIIlI[17];
            if (lIlIllIIIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0017d(llIIllIIlI[17], llIIllIIlI[1], llIIllIIlI[54]));
                "".length();
            }
        }
        int[] iArr11 = new int[llIIllIIlI[1]];
        iArr11[llIIllIIlI[0]] = llIIllIIlI[16];
        if (lIlIllIIIlIlI(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIIlI[16], llIIllIIlI[1], llIIllIIlI[56]));
            "".length();
        }
    }

    private static String lIlIllIIIIIII(String llllllllllllllllllIIlllIIIIlIllI, String llllllllllllllllllIIlllIIIIlIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIlllIIIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIIlllIIIIlIIll = llllllllllllllllllIIlllIIIIlIlIl.toCharArray();
        int llllllllllllllllllIIlllIIIIlIIlI = llIIllIIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIllIIlI[0];
        while (lIlIllIIIlIIl(i, length)) {
            char llllllllllllllllllIIlllIIIIlIlll = charArray[i];
            sb.append((char) (llllllllllllllllllIIlllIIIIlIlll ^ llllllllllllllllllIIlllIIIIlIIll[llllllllllllllllllIIlllIIIIlIIlI % llllllllllllllllllIIlllIIIIlIIll.length]));
            "".length();
            llllllllllllllllllIIlllIIIIlIIlI++;
            i++;
            "".length();
            if ((125 ^ 121) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIllIIIlIlI(int i) {
        return i == 0;
    }

    private static int lIlIllIIIIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        lIlIllIIIIllI();
        lIlIllIIIIIlI();
        bv = new ArrayList();
        int[] iArr = new int[llIIllIIlI[18]];
        iArr[llIIllIIlI[0]] = llIIllIIlI[16];
        iArr[llIIllIIlI[1]] = llIIllIIlI[17];
        iArr[llIIllIIlI[3]] = llIIllIIlI[42];
        iArr[llIIllIIlI[4]] = llIIllIIlI[44];
        iArr[llIIllIIlI[6]] = llIIllIIlI[40];
        iArr[llIIllIIlI[10]] = llIIllIIlI[45];
        iArr[llIIllIIlI[14]] = llIIllIIlI[47];
        iArr[llIIllIIlI[15]] = llIIllIIlI[49];
        cK = iArr;
        cL = new WorldArea(llIIllIIlI[59], llIIllIIlI[60], llIIllIIlI[22], llIIllIIlI[22], llIIllIIlI[0]);
        cM = new WorldArea(llIIllIIlI[61], llIIllIIlI[62], llIIllIIlI[32], llIIllIIlI[26], llIIllIIlI[0]);
        cN = new WorldArea(llIIllIIlI[63], llIIllIIlI[64], llIIllIIlI[65], llIIllIIlI[34], llIIllIIlI[0]);
        cO = new WorldPoint(llIIllIIlI[66], llIIllIIlI[67], llIIllIIlI[0]);
        ck = new WorldPoint(llIIllIIlI[68], llIIllIIlI[60], llIIllIIlI[0]);
        cP = new WorldPoint(llIIllIIlI[69], llIIllIIlI[70], llIIllIIlI[0]);
    }

    private static boolean lIlIllIIlIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIllIIIllIl(Skills.getLevel(Skill.DEFENCE), llIIllIIlI[2])) {
            ?? r0 = llIIllIIlI[1];
            "".length();
            return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIIlI[0];
    }

    private static String lIlIlIlllllll(String llllllllllllllllllIIlllIIIIIIIIl, String llllllllllllllllllIIlllIIIIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlllIIIIIIIII.getBytes(StandardCharsets.UTF_8)), llIIllIIlI[18]), "DES");
            Cipher llllllllllllllllllIIlllIIIIIIIll = Cipher.getInstance("DES");
            llllllllllllllllllIIlllIIIIIIIll.init(llIIllIIlI[3], secretKeySpec);
            return new String(llllllllllllllllllIIlllIIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlllIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIllIlllllllIl) {
            llllllllllllllllllIIllIlllllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIllll(Object obj) {
        return obj == null;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aJ();
            "".length();
            if (!(true ^ true)) {
                return (81 ^ 78) & ((57 ^ 38) ^ (-1));
            }
        } catch (Exception llllllllllllllllllIIlllIIIlIIlIl) {
            llllllllllllllllllIIlllIIIlIIlIl.printStackTrace();
        }
        return llIIllIIlI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a4, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0245, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x027f, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02b9, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02f3, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x032d, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0367, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03a1, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aM() {
        if (lIlIllIIIllIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[2])) {
            int[] iArr = new int[llIIllIIlI[1]];
            iArr[llIIllIIlI[0]] = llIIllIIlI[17];
            if (lIlIllIIIlIlI(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIllIIlI[1]];
                iArr2[llIIllIIlI[0]] = llIIllIIlI[17];
            }
            int[] iArr3 = new int[llIIllIIlI[1]];
            iArr3[llIIllIIlI[0]] = llIIllIIlI[42];
            if (lIlIllIIIlIlI(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIllIIlI[1]];
                iArr4[llIIllIIlI[0]] = llIIllIIlI[42];
            }
            int[] iArr5 = new int[llIIllIIlI[1]];
            iArr5[llIIllIIlI[0]] = llIIllIIlI[44];
            if (lIlIllIIIlIlI(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIllIIlI[1]];
                iArr6[llIIllIIlI[0]] = llIIllIIlI[44];
            }
            int[] iArr7 = new int[llIIllIIlI[1]];
            iArr7[llIIllIIlI[0]] = llIIllIIlI[40];
            if (lIlIllIIIlIlI(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIllIIlI[1]];
                iArr8[llIIllIIlI[0]] = llIIllIIlI[40];
            }
            int[] iArr9 = new int[llIIllIIlI[1]];
            iArr9[llIIllIIlI[0]] = llIIllIIlI[45];
            if (lIlIllIIIlIlI(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIllIIlI[1]];
                iArr10[llIIllIIlI[0]] = llIIllIIlI[45];
            }
            int[] iArr11 = new int[llIIllIIlI[1]];
            iArr11[llIIllIIlI[0]] = llIIllIIlI[47];
            if (lIlIllIIIlIlI(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIllIIlI[1]];
                iArr12[llIIllIIlI[0]] = llIIllIIlI[47];
            }
            int[] iArr13 = new int[llIIllIIlI[1]];
            iArr13[llIIllIIlI[0]] = llIIllIIlI[49];
            if (lIlIllIIIlIlI(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIllIIlI[1]];
                iArr14[llIIllIIlI[0]] = llIIllIIlI[49];
            }
            int[] iArr15 = new int[llIIllIIlI[1]];
            iArr15[llIIllIIlI[0]] = llIIllIIlI[11];
            if (lIlIllIIIlIII(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = llIIllIIlI[1];
                "".length();
                return "  ".length() < 0 ? ((((160 + 149) - 246) + 184) ^ (((72 + 18) - (-20)) + 56)) & (((48 ^ 117) ^ (184 ^ 172)) ^ (-" ".length())) : r0;
            }
            return llIIllIIlI[0];
        }
        int[] iArr16 = new int[llIIllIIlI[1]];
        iArr16[llIIllIIlI[0]] = llIIllIIlI[16];
        if (lIlIllIIIlIlI(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[llIIllIIlI[1]];
            iArr17[llIIllIIlI[0]] = llIIllIIlI[16];
        }
        int[] iArr18 = new int[llIIllIIlI[1]];
        iArr18[llIIllIIlI[0]] = llIIllIIlI[42];
        if (lIlIllIIIlIlI(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[llIIllIIlI[1]];
            iArr19[llIIllIIlI[0]] = llIIllIIlI[42];
        }
        int[] iArr20 = new int[llIIllIIlI[1]];
        iArr20[llIIllIIlI[0]] = llIIllIIlI[44];
        if (lIlIllIIIlIlI(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[llIIllIIlI[1]];
            iArr21[llIIllIIlI[0]] = llIIllIIlI[44];
        }
        int[] iArr22 = new int[llIIllIIlI[1]];
        iArr22[llIIllIIlI[0]] = llIIllIIlI[40];
        if (lIlIllIIIlIlI(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[llIIllIIlI[1]];
            iArr23[llIIllIIlI[0]] = llIIllIIlI[40];
        }
        int[] iArr24 = new int[llIIllIIlI[1]];
        iArr24[llIIllIIlI[0]] = llIIllIIlI[45];
        if (lIlIllIIIlIlI(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[llIIllIIlI[1]];
            iArr25[llIIllIIlI[0]] = llIIllIIlI[45];
        }
        int[] iArr26 = new int[llIIllIIlI[1]];
        iArr26[llIIllIIlI[0]] = llIIllIIlI[47];
        if (lIlIllIIIlIlI(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[llIIllIIlI[1]];
            iArr27[llIIllIIlI[0]] = llIIllIIlI[47];
        }
        int[] iArr28 = new int[llIIllIIlI[1]];
        iArr28[llIIllIIlI[0]] = llIIllIIlI[49];
        if (lIlIllIIIlIlI(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[llIIllIIlI[1]];
            iArr29[llIIllIIlI[0]] = llIIllIIlI[49];
        }
        int[] iArr30 = new int[llIIllIIlI[1]];
        iArr30[llIIllIIlI[0]] = llIIllIIlI[11];
        if (lIlIllIIIlIII(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = llIIllIIlI[1];
            "".length();
            return (103 ^ 99) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
        }
        return llIIllIIlI[0];
    }

    public static void am() {
        if (lIlIllIIIlIlI(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIllIIII[llIIllIIlI[20]];
            Movement.walkTo(ck);
            "".length();
            Time.sleepTicks(llIIllIIlI[1]);
            "".length();
        }
        if (lIlIllIIIlIII(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIllIIII[llIIllIIlI[21]];
            if (lIlIllIIIllll(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIlIllIIIlIII(npc.getName().contains(llIIllIIII[llIIllIIlI[58]]) ? 1 : 0) && lIlIllIIIllll(npc.getInteracting()) && lIlIllIIIlIlI(npc.isDead() ? 1 : 0)) {
                        ?? r0 = llIIllIIlI[1];
                        "".length();
                        return "  ".length() == (((170 ^ 139) ^ (113 ^ 5)) & (((252 ^ 134) ^ (183 ^ 152)) ^ (-" ".length()))) ? ((((95 + 58) - 127) + 121) ^ (((144 + 54) - 139) + 129)) & (((((57 + 39) - 46) + 97) ^ (((65 + 85) - 149) + 187)) ^ (-" ".length())) & ((((66 ^ 91) ^ (81 ^ 87)) & (((((75 + 39) - (-4)) + 41) ^ (((116 + 82) - 169) + 99)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                    }
                    return llIIllIIlI[0];
                });
                String[] strArr = new String[llIIllIIlI[3]];
                strArr[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[22]];
                strArr[llIIllIIlI[1]] = llIIllIIII[llIIllIIlI[23]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (lIlIllIIlIIIl(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = llIIllIIlI[1];
                        "".length();
                        return ((((116 + 108) - 160) + 76) ^ (((16 + 88) - 53) + 85)) == 0 ? ((8 ^ 77) ^ (241 ^ 138)) & (((175 ^ 159) ^ (118 ^ 120)) ^ (-" ".length())) : r0;
                    }
                    return llIIllIIlI[0];
                }).collect(Collectors.toList());
                if (lIlIllIIIlIlI(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(llIIllIIlI[0])).interact(llIIllIIII[llIIllIIlI[24]]);
                    Time.sleepTicks(llIIllIIlI[3]);
                    "".length();
                }
                if (lIlIllIIIlIll(nearest) && lIlIllIIIlIlI(Players.getLocal().isMoving() ? 1 : 0) && lIlIllIIIlIII(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(llIIllIIII[llIIllIIlI[25]]);
                    Time.sleepTicks(llIIllIIlI[3]);
                    "".length();
                }
            }
            if (lIlIllIIIlIll(Players.getLocal().getInteracting())) {
                Time.sleepTicks(llIIllIIlI[6]);
                "".length();
            }
        }
    }

    private static boolean lIlIllIIlIIII(int i, int i2) {
        return i == i2;
    }

    public static void aO() {
        if (lIlIllIIIlIIl(Skills.getLevel(Skill.DEFENCE), llIIllIIlI[2])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean lIlIllIIIllII(int i) {
        return i > 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIllIIII[llIIllIIlI[57]];
    }

    private static boolean lIlIllIIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllIIIlllI(int i) {
        return i < 0;
    }

    public static void aL() {
        if (lIlIllIIlIIII(Static.getClient().getVar(llIIllIIlI[22]), llIIllIIlI[1])) {
            Static.getClient().invokeMenuAction(llIIllIIII[llIIllIIlI[13]], llIIllIIII[llIIllIIlI[26]], llIIllIIlI[1], MenuAction.CC_OP.getId(), llIIllIIlI[27], llIIllIIlI[28]);
        }
        if (lIlIllIIIlIIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[10])) {
            String[] strArr = new String[llIIllIIlI[1]];
            strArr[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[29]];
            if (lIlIllIIIlIII(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[llIIllIIlI[1]];
                strArr2[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[30]];
                Inventory.getFirst(strArr2).interact(llIIllIIII[llIIllIIlI[31]]);
            }
        }
        if (lIlIllIIIllIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[10]) && lIlIllIIIlIIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[19])) {
            String[] strArr3 = new String[llIIllIIlI[1]];
            strArr3[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[19]];
            if (lIlIllIIIlIII(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[llIIllIIlI[1]];
                strArr4[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[32]];
                Inventory.getFirst(strArr4).interact(llIIllIIII[llIIllIIlI[33]]);
            }
        }
        if (lIlIllIIIllIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[19]) && lIlIllIIIlIIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[34])) {
            String[] strArr5 = new String[llIIllIIlI[1]];
            strArr5[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[35]];
            if (lIlIllIIIlIII(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[llIIllIIlI[1]];
                strArr6[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[36]];
                Inventory.getFirst(strArr6).interact(llIIllIIII[llIIllIIlI[37]]);
            }
        }
        if (lIlIllIIIllIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[34]) && lIlIllIIIlIIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[2])) {
            int[] iArr = new int[llIIllIIlI[1]];
            iArr[llIIllIIlI[0]] = llIIllIIlI[16];
            if (lIlIllIIIlIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIllIIlI[1]];
                iArr2[llIIllIIlI[0]] = llIIllIIlI[16];
                Inventory.getFirst(iArr2).interact(llIIllIIII[llIIllIIlI[38]]);
            }
        }
        if (lIlIllIIIllIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[2])) {
            int[] iArr3 = new int[llIIllIIlI[1]];
            iArr3[llIIllIIlI[0]] = llIIllIIlI[17];
            if (lIlIllIIIlIII(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIllIIlI[1]];
                iArr4[llIIllIIlI[0]] = llIIllIIlI[17];
                Inventory.getFirst(iArr4).interact(llIIllIIII[llIIllIIlI[39]]);
            }
        }
        if (lIlIllIIIllIl(Skills.getLevel(Skill.DEFENCE), llIIllIIlI[34])) {
            int[] iArr5 = new int[llIIllIIlI[1]];
            iArr5[llIIllIIlI[0]] = llIIllIIlI[40];
            if (lIlIllIIIlIII(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIllIIlI[1]];
                iArr6[llIIllIIlI[0]] = llIIllIIlI[40];
                Inventory.getFirst(iArr6).interact(llIIllIIII[llIIllIIlI[41]]);
            }
            int[] iArr7 = new int[llIIllIIlI[1]];
            iArr7[llIIllIIlI[0]] = llIIllIIlI[42];
            if (lIlIllIIIlIII(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIllIIlI[1]];
                iArr8[llIIllIIlI[0]] = llIIllIIlI[42];
                Inventory.getFirst(iArr8).interact(llIIllIIII[llIIllIIlI[43]]);
            }
            int[] iArr9 = new int[llIIllIIlI[1]];
            iArr9[llIIllIIlI[0]] = llIIllIIlI[44];
            if (lIlIllIIIlIII(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIllIIlI[1]];
                iArr10[llIIllIIlI[0]] = llIIllIIlI[44];
                Inventory.getFirst(iArr10).interact(llIIllIIII[llIIllIIlI[34]]);
            }
            int[] iArr11 = new int[llIIllIIlI[1]];
            iArr11[llIIllIIlI[0]] = llIIllIIlI[45];
            if (lIlIllIIIlIII(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIllIIlI[1]];
                iArr12[llIIllIIlI[0]] = llIIllIIlI[45];
                Inventory.getFirst(iArr12).interact(llIIllIIII[llIIllIIlI[46]]);
            }
        }
        int[] iArr13 = new int[llIIllIIlI[1]];
        iArr13[llIIllIIlI[0]] = llIIllIIlI[47];
        if (lIlIllIIIlIII(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[llIIllIIlI[1]];
            iArr14[llIIllIIlI[0]] = llIIllIIlI[47];
            Inventory.getFirst(iArr14).interact(llIIllIIII[llIIllIIlI[48]]);
        }
        int[] iArr15 = new int[llIIllIIlI[1]];
        iArr15[llIIllIIlI[0]] = llIIllIIlI[49];
        if (lIlIllIIIlIII(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[llIIllIIlI[1]];
            iArr16[llIIllIIlI[0]] = llIIllIIlI[49];
            Inventory.getFirst(iArr16).interact(llIIllIIII[llIIllIIlI[50]]);
        }
    }

    private static boolean lIlIllIIIllIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIlIllIIIIIlI() {
        llIIllIIII = new String[llIIllIIlI[71]];
        llIIllIIII[llIIllIIlI[0]] = lIlIlIlllllll("w4RRcrkStqNPgdUcbNPA/A==", "xwkIU");
        llIIllIIII[llIIllIIlI[1]] = lIlIllIIIIIII("NTMpIhEbPyNrAAYjLiUFUzMzLg8Admc4FRouJCMLHT1nKQMQMWc/DVM3IicHFnozOQMaNC4lBQ==", "sZGKb");
        llIIllIIII[llIIllIIlI[3]] = lIlIllIIIIIII("GyIdDyI0NwIIInU3BEYnNC0A", "UCkfE");
        llIIllIIII[llIIllIIlI[4]] = lIlIllIIIIIII("LgoPPRwPBQZ5EgcFCjAeAQ==", "fkaYp");
        llIIllIIII[llIIllIIlI[6]] = lIlIllIIIIIIl("0wfsM+oxxBfb2NxHeNLOqqYF+4SexLjjqlVfhYr3ehzPtpK/IwGTVFFSMbwyEj+z", "SsYrA");
        llIIllIIII[llIIllIIlI[10]] = lIlIlIlllllll("l85eN/duQoAsvSHL/lxxRg==", "mXwNi");
        llIIllIIII[llIIllIIlI[14]] = lIlIllIIIIIIl("79tncjHUo7z02m6cwJiyDQ==", "sGMXr");
        llIIllIIII[llIIllIIlI[15]] = lIlIllIIIIIII("JSoHAx4BL1MYDwEuGh8NGg==", "hCskl");
        llIIllIIII[llIIllIIlI[18]] = lIlIllIIIIIII("PTgi", "xYVkR");
        llIIllIIII[llIIllIIlI[20]] = lIlIllIIIIIIl("rIfp4Cg4/hXsPCo7kz2q/A867ECAHdZ1", "tBPCM");
        llIIllIIII[llIIllIIlI[21]] = lIlIllIIIIIII("LyUpACgKK2UPLhM/", "dLElA");
        llIIllIIII[llIIllIIlI[22]] = lIlIllIIIIIII("Ghk9", "YvJEO");
        llIIllIIII[llIIllIIlI[23]] = lIlIllIIIIIII("BiIz", "eMDgC");
        llIIllIIII[llIIllIIlI[24]] = lIlIllIIIIIIl("Ys+MjeGuvMQ=", "UVadc");
        llIIllIIII[llIIllIIlI[25]] = lIlIlIlllllll("zg7t+tgou40=", "CSOJk");
        llIIllIIII[llIIllIIlI[13]] = lIlIllIIIIIII("Jx0YP3QUDRgxOA8JGDU=", "fhlPT");
        llIIllIIII[llIIllIIlI[26]] = lIlIlIlllllll("S4pvpfiYiGg=", "alxYO");
        llIIllIIII[llIIllIIlI[29]] = lIlIlIlllllll("LY0ZICYhKES86KUYXi7VrA==", "Znaak");
        llIIllIIII[llIIllIIlI[30]] = lIlIlIlllllll("GAqbswUssluUthqAl+nOew==", "tbIOW");
        llIIllIIII[llIIllIIlI[31]] = lIlIllIIIIIII("JCoDLyw=", "sCfCH");
        llIIllIIII[llIIllIIlI[19]] = lIlIlIlllllll("MNkvuTAPUn/XolcAY6Il7Q==", "SwlSQ");
        llIIllIIII[llIIllIIlI[32]] = lIlIlIlllllll("tKEeornBxxLLiqq+oMUa3Q==", "xPwqJ");
        llIIllIIII[llIIllIIlI[33]] = lIlIllIIIIIII("Ex8nHgk=", "DvBrm");
        llIIllIIII[llIIllIIlI[35]] = lIlIllIIIIIIl("Y31wCXaaD4dIUNhl+fujUbhB9mG1v4HG", "DmIft");
        llIIllIIII[llIIllIIlI[36]] = lIlIllIIIIIIl("PmYY9tFwL23Ft1D6padsoq5gYVwTioM0", "gVoUe");
        llIIllIIII[llIIllIIlI[37]] = lIlIllIIIIIIl("fUnQ0g0SvOI=", "zEFOA");
        llIIllIIII[llIIllIIlI[38]] = lIlIlIlllllll("ecnMh2LGBKU=", "sFrZx");
        llIIllIIII[llIIllIIlI[39]] = lIlIlIlllllll("g4tuZd3zABE=", "dwLPZ");
        llIIllIIII[llIIllIIlI[41]] = lIlIlIlllllll("89ZNzaRkPk8=", "hwYfv");
        llIIllIIII[llIIllIIlI[43]] = lIlIllIIIIIIl("bG9VzgCj5SI=", "cNsqo");
        llIIllIIII[llIIllIIlI[34]] = lIlIlIlllllll("tA/wA4R2nys=", "KsaSq");
        llIIllIIII[llIIllIIlI[46]] = lIlIllIIIIIII("LSwPOA==", "zInJD");
        llIIllIIII[llIIllIIlI[48]] = lIlIlIlllllll("HxrUWnPw7os=", "GaNaS");
        llIIllIIII[llIIllIIlI[50]] = lIlIlIlllllll("PeTi2zly8UQ=", "TgylI");
        llIIllIIII[llIIllIIlI[57]] = lIlIlIlllllll("FxGIGUkCEKY=", "sQzTK");
        llIIllIIII[llIIllIIlI[58]] = lIlIllIIIIIII("OjsD", "yTtev");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x057c, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05ff, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0008ah.llIIllIIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c1, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0218, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x026f, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a9, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02e3, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0008ah.llIIllIIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0338, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x038f, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03e6, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x043d, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0494, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04eb, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0542, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v230, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aN() {
        if (lIlIllIIIllIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[2])) {
            int[] iArr = new int[llIIllIIlI[1]];
            iArr[llIIllIIlI[0]] = llIIllIIlI[17];
            if (lIlIllIIIlIlI(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIllIIlI[1]];
                iArr2[llIIllIIlI[0]] = llIIllIIlI[17];
                if (lIlIllIIIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIllIIlI[1]];
                    iArr3[llIIllIIlI[0]] = llIIllIIlI[17];
                }
            }
            int[] iArr4 = new int[llIIllIIlI[1]];
            iArr4[llIIllIIlI[0]] = llIIllIIlI[42];
            if (lIlIllIIIlIlI(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[llIIllIIlI[1]];
                iArr5[llIIllIIlI[0]] = llIIllIIlI[42];
                if (lIlIllIIIlIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIIllIIlI[1]];
                    iArr6[llIIllIIlI[0]] = llIIllIIlI[42];
                }
            }
            int[] iArr7 = new int[llIIllIIlI[1]];
            iArr7[llIIllIIlI[0]] = llIIllIIlI[44];
            if (lIlIllIIIlIlI(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIllIIlI[1]];
                iArr8[llIIllIIlI[0]] = llIIllIIlI[44];
                if (lIlIllIIIlIlI(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llIIllIIlI[1]];
                    iArr9[llIIllIIlI[0]] = llIIllIIlI[44];
                }
            }
            int[] iArr10 = new int[llIIllIIlI[1]];
            iArr10[llIIllIIlI[0]] = llIIllIIlI[40];
            if (lIlIllIIIlIlI(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIllIIlI[1]];
                iArr11[llIIllIIlI[0]] = llIIllIIlI[40];
                if (lIlIllIIIlIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIIllIIlI[1]];
                    iArr12[llIIllIIlI[0]] = llIIllIIlI[40];
                }
            }
            int[] iArr13 = new int[llIIllIIlI[1]];
            iArr13[llIIllIIlI[0]] = llIIllIIlI[45];
            if (lIlIllIIIlIlI(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIllIIlI[1]];
                iArr14[llIIllIIlI[0]] = llIIllIIlI[45];
                if (lIlIllIIIlIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIllIIlI[1]];
                    iArr15[llIIllIIlI[0]] = llIIllIIlI[45];
                }
            }
            int[] iArr16 = new int[llIIllIIlI[1]];
            iArr16[llIIllIIlI[0]] = llIIllIIlI[47];
            if (lIlIllIIIlIlI(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIIllIIlI[1]];
                iArr17[llIIllIIlI[0]] = llIIllIIlI[47];
                if (lIlIllIIIlIlI(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIIllIIlI[1]];
                    iArr18[llIIllIIlI[0]] = llIIllIIlI[47];
                }
            }
            int[] iArr19 = new int[llIIllIIlI[1]];
            iArr19[llIIllIIlI[0]] = llIIllIIlI[49];
            if (lIlIllIIIlIlI(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIIllIIlI[1]];
                iArr20[llIIllIIlI[0]] = llIIllIIlI[49];
                if (lIlIllIIIlIlI(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[llIIllIIlI[1]];
                    iArr21[llIIllIIlI[0]] = llIIllIIlI[49];
                }
            }
            int[] iArr22 = new int[llIIllIIlI[1]];
            iArr22[llIIllIIlI[0]] = llIIllIIlI[11];
            if (lIlIllIIIlIlI(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIIllIIlI[1]];
                iArr23[llIIllIIlI[0]] = llIIllIIlI[11];
            }
            ?? r0 = llIIllIIlI[1];
            "".length();
            return ((44 ^ 116) & ((81 ^ 9) ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        int[] iArr24 = new int[llIIllIIlI[1]];
        iArr24[llIIllIIlI[0]] = llIIllIIlI[16];
        if (lIlIllIIIlIlI(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[llIIllIIlI[1]];
            iArr25[llIIllIIlI[0]] = llIIllIIlI[16];
            if (lIlIllIIIlIlI(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[llIIllIIlI[1]];
                iArr26[llIIllIIlI[0]] = llIIllIIlI[16];
            }
        }
        int[] iArr27 = new int[llIIllIIlI[1]];
        iArr27[llIIllIIlI[0]] = llIIllIIlI[42];
        if (lIlIllIIIlIlI(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[llIIllIIlI[1]];
            iArr28[llIIllIIlI[0]] = llIIllIIlI[42];
            if (lIlIllIIIlIlI(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[llIIllIIlI[1]];
                iArr29[llIIllIIlI[0]] = llIIllIIlI[42];
            }
        }
        int[] iArr30 = new int[llIIllIIlI[1]];
        iArr30[llIIllIIlI[0]] = llIIllIIlI[44];
        if (lIlIllIIIlIlI(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[llIIllIIlI[1]];
            iArr31[llIIllIIlI[0]] = llIIllIIlI[44];
            if (lIlIllIIIlIlI(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[llIIllIIlI[1]];
                iArr32[llIIllIIlI[0]] = llIIllIIlI[44];
            }
        }
        int[] iArr33 = new int[llIIllIIlI[1]];
        iArr33[llIIllIIlI[0]] = llIIllIIlI[40];
        if (lIlIllIIIlIlI(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[llIIllIIlI[1]];
            iArr34[llIIllIIlI[0]] = llIIllIIlI[40];
            if (lIlIllIIIlIlI(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[llIIllIIlI[1]];
                iArr35[llIIllIIlI[0]] = llIIllIIlI[40];
            }
        }
        int[] iArr36 = new int[llIIllIIlI[1]];
        iArr36[llIIllIIlI[0]] = llIIllIIlI[45];
        if (lIlIllIIIlIlI(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[llIIllIIlI[1]];
            iArr37[llIIllIIlI[0]] = llIIllIIlI[45];
            if (lIlIllIIIlIlI(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[llIIllIIlI[1]];
                iArr38[llIIllIIlI[0]] = llIIllIIlI[45];
            }
        }
        int[] iArr39 = new int[llIIllIIlI[1]];
        iArr39[llIIllIIlI[0]] = llIIllIIlI[47];
        if (lIlIllIIIlIlI(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[llIIllIIlI[1]];
            iArr40[llIIllIIlI[0]] = llIIllIIlI[47];
            if (lIlIllIIIlIlI(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIIllIIlI[1]];
                iArr41[llIIllIIlI[0]] = llIIllIIlI[47];
            }
        }
        int[] iArr42 = new int[llIIllIIlI[1]];
        iArr42[llIIllIIlI[0]] = llIIllIIlI[49];
        if (lIlIllIIIlIlI(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[llIIllIIlI[1]];
            iArr43[llIIllIIlI[0]] = llIIllIIlI[49];
            if (lIlIllIIIlIlI(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[llIIllIIlI[1]];
                iArr44[llIIllIIlI[0]] = llIIllIIlI[49];
            }
        }
        int[] iArr45 = new int[llIIllIIlI[1]];
        iArr45[llIIllIIlI[0]] = llIIllIIlI[11];
        if (lIlIllIIIlIlI(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[llIIllIIlI[1]];
            iArr46[llIIllIIlI[0]] = llIIllIIlI[11];
        }
        ?? r02 = llIIllIIlI[1];
        "".length();
        return (((((155 + 218) - 297) + 153) ^ (((23 + 155) - 83) + 104)) & (("   ".length() ^ (134 ^ 167)) ^ (-" ".length()))) >= ((((131 + 103) - 225) + 126) ^ (((82 + 24) - 40) + 65)) ? ((96 ^ 45) ^ (213 ^ 172)) & (((68 ^ 46) ^ (231 ^ 185)) ^ (-" ".length())) : r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0252, code lost:
        if (lIlIllIIIlIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aJ() {
        if (lIlIllIIIlIII(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIllIIII[llIIllIIlI[0]];
            C0015b.a(bv);
            if (lIlIllIIIlIIl(bv.size(), llIIllIIlI[1])) {
                System.out.println(llIIllIIII[llIIllIIlI[1]]);
                bt = llIIllIIlI[0];
            }
        }
        if (lIlIllIIIlIlI(bt ? 1 : 0)) {
            if (lIlIllIIIlIlI(aM() ? 1 : 0) && lIlIllIIIlIIl(Skills.getLevel(Skill.DEFENCE), llIIllIIlI[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIllIIIlIll(nearest) && lIlIllIIIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIIII[llIIllIIlI[3]];
                    C0000a.a(nearest);
                }
                if (lIlIllIIIlIll(nearest) && lIlIllIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIIII[llIIllIIlI[4]];
                    if (lIlIllIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIllIIlI[5]);
                        "".length();
                    }
                    if (lIlIllIIIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIllIIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIllIIlI[1]);
                            "".length();
                        }
                        if (lIlIllIIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIllIIlI[3]);
                            "".length();
                        }
                        if (lIlIllIIIlIlI(aN() ? 1 : 0)) {
                            Q();
                            System.out.println(llIIllIIII[llIIllIIlI[6]]);
                            bt = llIIllIIlI[1];
                            return;
                        }
                        C0000a.a(cK, llIIllIIlI[1]);
                        C0000a.a(llIIllIIlI[7], llIIllIIlI[8]);
                        C0000a.b(C0019f.ba, llIIllIIlI[1]);
                        C0000a.a(llIIllIIlI[9], llIIllIIlI[10]);
                        C0000a.a(llIIllIIlI[11], llIIllIIlI[12]);
                    }
                }
            }
            if (lIlIllIIIlIII(aM() ? 1 : 0)) {
                aL();
                if (lIlIllIIIllIl(Movement.getRunEnergy(), llIIllIIlI[13]) && lIlIllIIIlIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[llIIllIIlI[1]];
                strArr[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[10]];
                if (lIlIllIIIlIlI(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIllIIlI[1]];
                    strArr2[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[14]];
                    if (lIlIllIIIlIlI(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[llIIllIIlI[1]];
                        strArr3[llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[15]];
                        if (lIlIllIIIlIlI(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[llIIllIIlI[1]];
                            iArr[llIIllIIlI[0]] = llIIllIIlI[16];
                            if (lIlIllIIIlIlI(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIIllIIlI[1]];
                                iArr2[llIIllIIlI[0]] = llIIllIIlI[17];
                            }
                        }
                    }
                }
                aO();
                if (lIlIllIIIlllI(lIlIllIIIIlll(C0018e.w(), 45.0d))) {
                    int[] iArr3 = new int[llIIllIIlI[1]];
                    iArr3[llIIllIIlI[0]] = llIIllIIlI[11];
                    if (lIlIllIIIlIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIIllIIlI[1]];
                        iArr4[llIIllIIlI[0]] = llIIllIIlI[11];
                        Inventory.getFirst(iArr4).interact(llIIllIIII[llIIllIIlI[18]]);
                        Time.sleepTicks(llIIllIIlI[1]);
                        "".length();
                    }
                }
                if (lIlIllIIIllIl(Skills.getLevel(Skill.ATTACK), llIIllIIlI[19]) && lIlIllIIIllIl(Skills.getLevel(Skill.STRENGTH), llIIllIIlI[19])) {
                    C0029p.al();
                }
            }
        }
    }
}
