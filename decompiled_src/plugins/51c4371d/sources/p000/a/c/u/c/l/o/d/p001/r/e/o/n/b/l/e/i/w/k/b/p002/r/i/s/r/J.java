package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.J  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/J.class */
public class J implements F {
    static /* synthetic */ WorldArea bC;
    static /* synthetic */ WorldPoint bD;
    public static /* synthetic */ boolean bA;
    public static /* synthetic */ boolean bz;
    public static /* synthetic */ List<C0003d> bB;
    private static /* synthetic */ int[] lllIIIIl;
    private static /* synthetic */ String[] llIllllI;
    static /* synthetic */ WorldPoint bE;

    private static String lIllIlllllI(String lIlIIIlIIlIllIl, String lIlIIIlIIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIlIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIIlIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIlIIlIlllI) {
            lIlIIIlIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIll(int i) {
        return i != 0;
    }

    private static boolean lIlllIllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIlllII(int i) {
        return i < 0;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llIllllI[lllIIIIl[74]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[2])) {
            ?? r0 = lllIIIIl[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIIl[0];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            Z();
            "".length();
            if ("  ".length() <= 0) {
                return ((((16 + 151) - (-6)) + 15) ^ (((124 + 31) - 50) + 68)) & (((65 ^ 55) ^ (254 ^ 153)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIIIIl[69];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ae() {
        if (lIlllIllIIl(Vars.getBit(lllIIIIl[50]), lllIIIIl[1]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[19])) {
            return lllIIIIl[1];
        }
        if (lIlllIllIIl(Vars.getBit(lllIIIIl[50]), lllIIIIl[3]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[32]) && lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[19])) {
            return lllIIIIl[1];
        }
        if (lIlllIllIIl(Vars.getBit(lllIIIIl[50]), lllIIIIl[4]) && lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[32]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[39])) {
            return lllIIIIl[1];
        }
        if (lIlllIllIIl(Vars.getBit(lllIIIIl[50]), lllIIIIl[4]) && lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[32])) {
            int[] iArr = new int[lllIIIIl[1]];
            iArr[lllIIIIl[0]] = lllIIIIl[14];
            if (lIlllIlIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                return lllIIIIl[1];
            }
        }
        if (lIlllIllIIl(Vars.getBit(lllIIIIl[50]), lllIIIIl[7]) && lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[39])) {
            int[] iArr2 = new int[lllIIIIl[1]];
            iArr2[lllIIIIl[0]] = lllIIIIl[14];
            if (lIlllIlIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIIIIl[1];
            }
        }
        return lllIIIIl[0];
    }

    private static boolean lIlllIllIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIllIllllIl(String lIlIIIlIlIlIIlI, String lIlIIIlIlIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIIl[30]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIlIlIlIIll) {
            lIlIIIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIl(int i) {
        return i == 0;
    }

    private static boolean lIlllIlIlll(int i) {
        return i > 0;
    }

    private static boolean lIlllIlIllI(Object obj) {
        return obj != null;
    }

    private static void lIlllIIIIll() {
        llIllllI = new String[lllIIIIl[81]];
        llIllllI[lllIIIIl[0]] = lIllIllllIl("xRfAIs5jcvKKK5chq5TT8Q==", "kCGCw");
        llIllllI[lllIIIIl[1]] = lIllIlllllI("oXNp2lITAhtPXjQ1QgWzQ+iTzPeI4mM/FGnxaH1lXT97Sa/x+rDOWefxY5NfwZ17VpsypnbDEG4=", "RSPYx");
        llIllllI[lllIIIIl[3]] = lIllIllllIl("K3zTXKbkm0DjUEHUqBWoYS2QHx/x6hBM", "HjZDh");
        llIllllI[lllIIIIl[4]] = lIlllIIIIIl("DicZDScvKBBJKScoHAAlIQ==", "FFwiK");
        llIllllI[lllIIIIl[7]] = lIllIllllIl("501Yx1Q2CFsKdLKq/pVpXtgAkkmw/wY7wTDf96zYPILGk80YHgi0U7pZnlWI5S4Z", "BBbHL");
        llIllllI[lllIIIIl[19]] = lIllIllllIl("CPOM/KY/Mp3yuF4q4GJm0A==", "GCSPM");
        llIllllI[lllIIIIl[6]] = lIllIlllllI("BRjm4lC78uc1WwMamm/Zqg==", "OJBDn");
        llIllllI[lllIIIIl[27]] = lIllIlllllI("r8zoGY53qDIr46yFpmswOWCEWRly/CEf", "RuhLj");
        llIllllI[lllIIIIl[30]] = lIllIllllIl("XcvXfCU8T9FmICUu9Ig5M3VyDttA7bf3", "IfZfE");
        llIllllI[lllIIIIl[32]] = lIllIllllIl("xTiSPF0qBk3+c/1KuyCzc9dm6vpRY0p1", "DowmD");
        llIllllI[lllIIIIl[33]] = lIllIlllllI("6VIM17qbtcx52VF/KoRG4caPvymUSmfI", "QcdIs");
        llIllllI[lllIIIIl[34]] = lIllIllllIl("Y2EQflVwPFE=", "YgQot");
        llIllllI[lllIIIIl[37]] = lIllIllllIl("RuIY7Zo3Nkk=", "IXXwG");
        llIllllI[lllIIIIl[39]] = lIllIllllIl("pHv2OZlfDcJ2sNnRo0wNncoKSfRJm0Z3", "EwwsK");
        llIllllI[lllIIIIl[43]] = lIllIllllIl("abJbQh1LssRw2Oy5X1ONcg==", "CXgtr");
        llIllllI[lllIIIIl[44]] = lIllIllllIl("9MJOGzad91yDXAqBQ9+pGA==", "IFMxu");
        llIllllI[lllIIIIl[45]] = lIllIlllllI("hiVINE5gD48=", "oqpRz");
        llIllllI[lllIIIIl[46]] = lIllIlllllI("GwQcBgC45kU=", "TjGgy");
        llIllllI[lllIIIIl[47]] = lIllIllllIl("gS6q5Y91YxU=", "YnFKr");
        llIllllI[lllIIIIl[49]] = lIllIllllIl("nx4Z6laufoM=", "NupBG");
        llIllllI[lllIIIIl[53]] = lIllIllllIl("ryWrh5VB9Ij+UkOLH1IEPtauiQ9UC0Pw", "TwxyX");
        llIllllI[lllIIIIl[54]] = lIllIlllllI("jHZTee23XneiTYJ7LFvINA==", "axaNI");
        llIllllI[lllIIIIl[56]] = lIllIllllIl("dNdlBc6z52qzLV0NvJhk2g==", "BkFIq");
        llIllllI[lllIIIIl[57]] = lIllIlllllI("wk3mwBY2sV9wu6+oEDWq1A==", "yaZIv");
        llIllllI[lllIIIIl[58]] = lIllIlllllI("914OMkrtLuGyuwpsAy/0rg==", "OGnkO");
        llIllllI[lllIIIIl[21]] = lIllIlllllI("JtNh4Ic62am/J06ii3wYhw==", "Sjnky");
        llIllllI[lllIIIIl[52]] = lIllIllllIl("/hLKvzOTJEqRVq513j/znA==", "TkNub");
        llIllllI[lllIIIIl[74]] = lIllIllllIl("3qozUU7SddhQTJBcmlk+fA==", "PdlNN");
        llIllllI[lllIIIIl[75]] = lIlllIIIIIl("MAYXDmstCVkeLiMDDQFrag==", "BoyiK");
        llIllllI[lllIIIIl[76]] = lIllIllllIl("MLRS4N0fYb8=", "KiDfv");
    }

    private static String lIlllIIIIIl(String lIlIIIlIlIIIIlI, String lIlIIIlIlIIIIIl) {
        String lIlIIIlIlIIIIlI2 = new String(Base64.getDecoder().decode(lIlIIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIIIlIlIIIIIl.toCharArray();
        int lIlIIIlIIlllllI = lllIIIIl[0];
        char[] charArray2 = lIlIIIlIlIIIIlI2.toCharArray();
        int length = charArray2.length;
        int lIlIIIlIIllIllI = lllIIIIl[0];
        while (lIlllIlIlII(lIlIIIlIIllIllI, length)) {
            sb.append((char) (charArray2[lIlIIIlIIllIllI] ^ charArray[lIlIIIlIIlllllI % charArray.length]));
            "".length();
            lIlIIIlIIlllllI++;
            lIlIIIlIIllIllI++;
            "".length();
            if (((81 ^ 13) & ((13 ^ 81) ^ (-1))) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlllIlllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlllIllllI(int i, int i2) {
        return i > i2;
    }

    private static void ab() {
        if (lIlllIlllII(lIlllIllIll(C0004e.v(), 30.0d))) {
            int[] iArr = new int[lllIIIIl[1]];
            iArr[lllIIIIl[0]] = lllIIIIl[20];
            if (lIlllIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIIIl[1]];
                iArr2[lllIIIIl[0]] = lllIIIIl[20];
                Inventory.getFirst(iArr2).interact(llIllllI[lllIIIIl[45]]);
                Time.sleepTicks(lllIIIIl[1]);
                "".length();
            }
        }
        if (lIlllIllIlI(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlllIlIIll(npc.getName().contains(llIllllI[lllIIIIl[76]]) ? 1 : 0) && lIlllIlIlIl(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lllIIIIl[1];
                    "".length();
                    return "  ".length() >= ((213 ^ 131) ^ (90 ^ 8)) ? ((1 ^ 125) ^ (101 ^ 76)) & (((43 ^ 31) ^ (120 ^ 25)) ^ (-" ".length())) : r0;
                }
                return lllIIIIl[0];
            });
            String[] strArr = new String[lllIIIIl[3]];
            strArr[lllIIIIl[0]] = llIllllI[lllIIIIl[46]];
            strArr[lllIIIIl[1]] = llIllllI[lllIIIIl[47]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIlllIlllIl(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lllIIIIl[1];
                    "".length();
                    return (((((43 + 0) - (-20)) + 138) ^ (((85 + 27) - 4) + 37)) & (((((67 + 133) - 67) + 110) ^ (((90 + 136) - 111) + 56)) ^ (-" ".length()))) != 0 ? ((56 ^ 121) ^ (74 ^ 86)) & (((54 ^ 121) ^ (172 ^ 190)) ^ (-" ".length())) : r0;
                }
                return lllIIIIl[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lllIIIIl[1]];
            iArr3[lllIIIIl[0]] = lllIIIIl[48];
            if (lIlllIlIIll(Equipment.contains(iArr3) ? 1 : 0) && lIlllIlIlIl(ae() ? 1 : 0)) {
                af();
            }
            if (lIlllIlIllI(nearest) && lIlllIlIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(llIllllI[lllIIIIl[49]]);
                Time.sleepTicks(lllIIIIl[4]);
                "".length();
            }
        }
    }

    private static int lIlllIllIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlllIllIII(int i, int i2) {
        return i >= i2;
    }

    private static void lIlllIlIIlI() {
        lllIIIIl = new int[82];
        lllIIIIl[0] = (149 ^ 184) & ((100 ^ 73) ^ (-1));
        lllIIIIl[1] = " ".length();
        lllIIIIl[2] = 42 ^ 97;
        lllIIIIl[3] = "  ".length();
        lllIIIIl[4] = "   ".length();
        lllIIIIl[5] = (-2098) & 7097;
        lllIIIIl[6] = 13 ^ 11;
        lllIIIIl[7] = 133 ^ 129;
        lllIIIIl[8] = (((40 + 50) - (-23)) + 43) ^ (((143 + 139) - 162) + 51);
        lllIIIIl[9] = (-((-2569) & 8089)) & (-2049) & 8126;
        lllIIIIl[10] = (-18468) & 19967;
        lllIIIIl[11] = (-9665) & 10219;
        lllIIIIl[12] = (-24593) & 27092;
        lllIIIIl[13] = (-23553) & 24109;
        lllIIIIl[14] = (-((-2603) & 24127)) & (-450) & 22527;
        lllIIIIl[15] = (-2059) & 6558;
        lllIIIIl[16] = (-((-1705) & 28653)) & (-137) & 27647;
        lllIIIIl[17] = (-18987) & 31611;
        lllIIIIl[18] = (-(((133 + 32) - 62) + 32)) & (-8225) & 16367;
        lllIIIIl[19] = (((51 + 96) - 22) + 6) ^ (((78 + 45) - 39) + 50);
        lllIIIIl[20] = (-1029) & 1407;
        lllIIIIl[21] = (79 ^ 124) ^ (126 ^ 84);
        lllIIIIl[22] = (-((-16657) & 19349)) & (-16401) & 20479;
        lllIIIIl[23] = (-14594) & 15149;
        lllIIIIl[24] = (-((-939) & 24555)) & (-13) & 24189;
        lllIIIIl[25] = 82 ^ 108;
        lllIIIIl[26] = (215 ^ 172) ^ (93 ^ 57);
        lllIIIIl[27] = (176 ^ 135) ^ (143 ^ 191);
        lllIIIIl[28] = -" ".length();
        lllIIIIl[29] = 129 ^ 164;
        lllIIIIl[30] = 48 ^ 56;
        lllIIIIl[31] = (67 ^ 18) ^ (11 ^ 119);
        lllIIIIl[32] = 114 ^ 123;
        lllIIIIl[33] = 180 ^ 190;
        lllIIIIl[34] = (((56 + 60) - (-1)) + 60) ^ (((154 + 48) - 189) + 173);
        lllIIIIl[35] = (-8710) & 11871;
        lllIIIIl[36] = (-((-5149) & 5757)) & (-12289) & 16383;
        lllIIIIl[37] = (143 ^ 163) ^ (1 ^ 33);
        lllIIIIl[38] = (63 ^ 47) ^ (143 ^ 160);
        lllIIIIl[39] = (((82 + 16) - 78) + 108) ^ (((107 + 98) - 198) + 134);
        lllIIIIl[40] = (-((-4937) & 32719)) & (-26) & 28127;
        lllIIIIl[41] = (-((-12305) & 31165)) & (-12289) & 31678;
        lllIIIIl[42] = (-24642) & 28141;
        lllIIIIl[43] = 105 ^ 103;
        lllIIIIl[44] = 200 ^ 199;
        lllIIIIl[45] = 81 ^ 65;
        lllIIIIl[46] = (126 ^ 15) ^ (8 ^ 104);
        lllIIIIl[47] = 29 ^ 15;
        lllIIIIl[48] = (-20499) & 21879;
        lllIIIIl[49] = 64 ^ 83;
        lllIIIIl[50] = (-((-1350) & 24527)) & (-3) & 23455;
        lllIIIIl[51] = (-8227) & 8819;
        lllIIIIl[52] = 21 ^ 15;
        lllIIIIl[53] = (16 ^ 55) ^ (48 ^ 3);
        lllIIIIl[54] = 34 ^ 55;
        lllIIIIl[55] = (((238 ^ 132) + (((90 + 124) - 100) + 44)) - (((41 + 45) - (-21)) + 66)) + (124 ^ 18);
        lllIIIIl[56] = 188 ^ 170;
        lllIIIIl[57] = (((18 + 67) - 78) + 126) ^ (((93 + 65) - 75) + 63);
        lllIIIIl[58] = (132 ^ 151) ^ (14 ^ 5);
        lllIIIIl[59] = (-((-737) & 19186)) & (-5125) & 24573;
        lllIIIIl[60] = (((160 ^ 184) + (((127 + 77) - 89) + 36)) - (115 ^ 39)) + (28 ^ 83);
        lllIIIIl[61] = (-((-12070) & 32639)) & (-8193) & 32761;
        lllIIIIl[62] = (-((-14) & 30767)) & (-11) & 32763;
        lllIIIIl[63] = (-16386) & 19385;
        lllIIIIl[64] = (-((-49) & 18745)) & (-1059) & 32254;
        lllIIIIl[65] = (-((-70) & 375)) & (-579) & 16383;
        lllIIIIl[66] = (140 ^ 182) ^ (99 ^ 33);
        lllIIIIl[67] = ((127 + 0) - 83) + 106;
        lllIIIIl[68] = (-1127) & 16126;
        lllIIIIl[69] = 105 ^ 13;
        lllIIIIl[70] = (-(179 ^ 151)) & (-20753) & 32767;
        lllIIIIl[71] = (-((-4963) & 5991)) & (-4675) & 30702;
        lllIIIIl[72] = (-((-4255) & 12447)) & (-16569) & 32767;
        lllIIIIl[73] = (-((-1158) & 11503)) & (-17) & 11261;
        lllIIIIl[74] = (134 ^ 167) ^ (87 ^ 109);
        lllIIIIl[75] = 21 ^ 9;
        lllIIIIl[76] = 27 ^ 6;
        lllIIIIl[77] = (-((-2907) & 31579)) & (-2) & 31695;
        lllIIIIl[78] = (-20753) & 24051;
        lllIIIIl[79] = (-13321) & 16351;
        lllIIIIl[80] = (-16641) & 19945;
        lllIIIIl[81] = 103 ^ 121;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        lIlllIlIIlI();
        lIlllIIIIll();
        bA = lllIIIIl[0];
        bB = new ArrayList();
        bC = new WorldArea(lllIIIIl[77], lllIIIIl[78], lllIIIIl[53], lllIIIIl[43], lllIIIIl[0]);
        bD = new WorldPoint(lllIIIIl[79], lllIIIIl[80], lllIIIIl[0]);
        bE = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v368, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v402, types: [boolean] */
    public static void Z() {
        if (lIlllIlIIll(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llIllllI[lllIIIIl[0]];
            C0001b.a(bB);
            if (lIlllIlIlII(bB.size(), lllIIIIl[1])) {
                System.out.println(llIllllI[lllIIIIl[1]]);
                bz = lllIIIIl[0];
            }
        }
        if (lIlllIlIlIl(bz ? 1 : 0) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[2])) {
            if (lIlllIlIlIl(ac() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlllIlIllI(nearest) && lIlllIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[3]];
                    C0000a.a(nearest);
                }
                if (lIlllIlIllI(nearest) && lIlllIlIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[4]];
                    if (lIlllIlIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIIl[5]);
                        "".length();
                        Time.sleepTicks(lllIIIIl[6]);
                        "".length();
                    }
                    if (lIlllIlIIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlllIlIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIIl[7]);
                            "".length();
                        }
                        while (lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8]) && lIlllIlIlIl(u.aV() ? 1 : 0)) {
                            u.aT();
                            Time.sleepTicks(lllIIIIl[1]);
                            "".length();
                            "".length();
                            if ((-"  ".length()) >= 0) {
                                return;
                            }
                        }
                        if (lIlllIlIlIl(ad() ? 1 : 0)) {
                            ag();
                            System.out.println(llIllllI[lllIIIIl[7]]);
                            bz = lllIIIIl[1];
                            return;
                        }
                        if (lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8])) {
                            int[] iArr = new int[lllIIIIl[1]];
                            iArr[lllIIIIl[0]] = lllIIIIl[9];
                            if (lIlllIlIIll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllIIIIl[1]];
                                iArr2[lllIIIIl[0]] = lllIIIIl[9];
                                if (lIlllIlIlII(Inventory.getCount(iArr2), lllIIIIl[1])) {
                                    Bank.withdraw(lllIIIIl[9], lllIIIIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIIIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lllIIIIl[1]];
                                        iArr3[lllIIIIl[0]] = lllIIIIl[9];
                                        if (lIlllIlIlll(Inventory.getCount(iArr3))) {
                                            ?? r0 = lllIIIIl[1];
                                            "".length();
                                            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllIIIIl[0];
                                    }, lllIIIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lllIIIIl[1]];
                            iArr3[lllIIIIl[0]] = lllIIIIl[11];
                            if (lIlllIlIIll(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lllIIIIl[1]];
                                iArr4[lllIIIIl[0]] = lllIIIIl[11];
                                if (lIlllIlIlII(Inventory.getCount(iArr4), lllIIIIl[1])) {
                                    Bank.withdraw(lllIIIIl[11], lllIIIIl[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIIIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lllIIIIl[1]];
                                        iArr5[lllIIIIl[0]] = lllIIIIl[11];
                                        if (lIlllIlIlll(Inventory.getCount(iArr5))) {
                                            ?? r0 = lllIIIIl[1];
                                            "".length();
                                            return ("   ".length() & ("   ".length() ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllIIIIl[0];
                                    }, lllIIIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lllIIIIl[1]];
                            iArr5[lllIIIIl[0]] = lllIIIIl[13];
                            if (lIlllIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lllIIIIl[1]];
                                iArr6[lllIIIIl[0]] = lllIIIIl[13];
                                if (lIlllIlIlII(Inventory.getCount(iArr6), lllIIIIl[1])) {
                                    Bank.withdraw(lllIIIIl[13], lllIIIIl[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIIIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lllIIIIl[1]];
                                        iArr7[lllIIIIl[0]] = lllIIIIl[13];
                                        if (lIlllIlIlll(Inventory.getCount(iArr7))) {
                                            ?? r0 = lllIIIIl[1];
                                            "".length();
                                            return " ".length() != " ".length() ? ((135 ^ 143) ^ (71 ^ 29)) & (((219 ^ 141) ^ (90 ^ 94)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIIIIl[0];
                                    }, lllIIIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lllIIIIl[1]];
                            iArr7[lllIIIIl[0]] = lllIIIIl[14];
                            if (lIlllIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lllIIIIl[1]];
                                iArr8[lllIIIIl[0]] = lllIIIIl[14];
                                if (lIlllIlIlII(Inventory.getCount(iArr8), lllIIIIl[1])) {
                                    Bank.withdraw(lllIIIIl[14], lllIIIIl[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIIIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lllIIIIl[1]];
                                        iArr9[lllIIIIl[0]] = lllIIIIl[14];
                                        if (lIlllIlIlll(Inventory.getCount(iArr9))) {
                                            ?? r0 = lllIIIIl[1];
                                            "".length();
                                            return (((103 ^ 85) ^ (42 ^ 61)) & (((((33 + 3) - (-2)) + 97) ^ (((148 + 61) - 82) + 35)) ^ (-" ".length()))) != 0 ? ((((86 + 122) - 200) + 131) ^ (((80 + 158) - 125) + 49)) & (((((64 + 13) - 43) + 138) ^ (((57 + 42) - 70) + 104)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIIIIl[0];
                                    }, lllIIIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lllIIIIl[1]];
                            iArr9[lllIIIIl[0]] = lllIIIIl[16];
                            if (lIlllIlIIll(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lllIIIIl[1]];
                                iArr10[lllIIIIl[0]] = lllIIIIl[16];
                                if (lIlllIlIlII(Inventory.getCount(iArr10), lllIIIIl[1])) {
                                    Bank.withdraw(lllIIIIl[16], lllIIIIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIIIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lllIIIIl[1]];
                                        iArr11[lllIIIIl[0]] = lllIIIIl[16];
                                        if (lIlllIlIlll(Inventory.getCount(iArr11))) {
                                            ?? r0 = lllIIIIl[1];
                                            "".length();
                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllIIIIl[0];
                                    }, lllIIIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lllIIIIl[1]];
                            iArr11[lllIIIIl[0]] = lllIIIIl[17];
                            if (lIlllIlIIll(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lllIIIIl[1]];
                                iArr12[lllIIIIl[0]] = lllIIIIl[17];
                                if (lIlllIlIlIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lllIIIIl[17], lllIIIIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIIIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lllIIIIl[1]];
                                        iArr13[lllIIIIl[0]] = lllIIIIl[17];
                                        return Inventory.contains(iArr13);
                                    }, lllIIIIl[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lllIIIIl[18], lllIIIIl[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lllIIIIl[1]];
                            iArr13[lllIIIIl[0]] = lllIIIIl[20];
                            if (lIlllIlIIll(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lllIIIIl[1]];
                                iArr14[lllIIIIl[0]] = lllIIIIl[20];
                                if (lIlllIlIlII(Inventory.getCount(iArr14), lllIIIIl[1]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[21])) {
                                    Bank.withdrawAll(lllIIIIl[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIIIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lllIIIIl[1]];
                                        iArr15[lllIIIIl[0]] = lllIIIIl[20];
                                        if (lIlllIlIlll(Inventory.getCount(iArr15))) {
                                            ?? r0 = lllIIIIl[1];
                                            "".length();
                                            return " ".length() != " ".length() ? ((28 ^ 17) ^ (17 ^ 62)) & (((62 ^ 67) ^ (227 ^ 188)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIIIIl[0];
                                    }, lllIIIIl[5]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8])) {
                            int[] iArr15 = new int[lllIIIIl[1]];
                            iArr15[lllIIIIl[0]] = lllIIIIl[22];
                            if (lIlllIlIlIl(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lllIIIIl[22], lllIIIIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIIIIl[1]);
                                "".length();
                            }
                            if (lIlllIlIIll(bA ? 1 : 0)) {
                                Bank.withdrawAll(lllIIIIl[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIIIIl[1]);
                                "".length();
                                Bank.withdrawAll(lllIIIIl[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIIIIl[1]);
                                "".length();
                            }
                            Time.sleepTicks(lllIIIIl[4]);
                            "".length();
                            Bank.withdrawAll(lllIIIIl[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lllIIIIl[1]);
                            "".length();
                            Bank.withdrawAll(lllIIIIl[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lllIIIIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlllIlIIll(ac() ? 1 : 0)) {
                if (lIlllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[21])) {
                    if (lIlllIlIlIl(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIllllI[lllIIIIl[19]];
                        Movement.walkTo(bD);
                        "".length();
                        Time.sleepTicks(lllIIIIl[1]);
                        "".length();
                    }
                    if (lIlllIlIIll(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIllllI[lllIIIIl[6]];
                        ab();
                    }
                }
                if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[21]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[26])) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[27]];
                    if (lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lllIIIIl[1]);
                        "".length();
                    }
                }
                if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[26]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[29])) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[30]];
                    if (lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lllIIIIl[1]);
                        "".length();
                    }
                }
                if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[29]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[31])) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[32]];
                    if (lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lllIIIIl[1]);
                        "".length();
                    }
                }
                if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[31]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8])) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[33]];
                    if (lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lllIIIIl[1]);
                        "".length();
                    }
                }
                if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8])) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[34]];
                    if (lIlllIllIlI(bE)) {
                        bE = new WorldPoint(lllIIIIl[35] + C0004e.c(lllIIIIl[1], lllIIIIl[7]), lllIIIIl[36], lllIIIIl[0]);
                    }
                    int[] iArr16 = new int[lllIIIIl[1]];
                    iArr16[lllIIIIl[0]] = lllIIIIl[22];
                    if (lIlllIlIIll(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lllIIIIl[1]];
                        iArr17[lllIIIIl[0]] = lllIIIIl[22];
                        if (lIlllIlIlIl(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lllIIIIl[1]];
                            iArr18[lllIIIIl[0]] = lllIIIIl[22];
                            Inventory.getFirst(iArr18).interact(llIllllI[lllIIIIl[37]]);
                            Time.sleepTicks(lllIIIIl[1]);
                            "".length();
                        }
                    }
                    if (lIlllIlIIll(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lllIIIIl[1]];
                    iArr19[lllIIIIl[0]] = lllIIIIl[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lllIIIIl[1]];
                    iArr20[lllIIIIl[0]] = lllIIIIl[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIlllIlIlIl(bA ? 1 : 0) && lIlllIlIllI(bE)) {
                        if (lIlllIlIlIl(Players.getLocal().getWorldLocation().equals(bE) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIllllI[lllIIIIl[39]];
                            Movement.walkTo(bE);
                            "".length();
                            Time.sleepTicks(lllIIIIl[1]);
                            "".length();
                        }
                        if (lIlllIlIIll(Players.getLocal().getWorldLocation().equals(bE) ? 1 : 0) && lIlllIlIllI(first) && lIlllIlIllI(first2)) {
                            int lIlIIIlIllIllII = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlllIllllI(Skills.getExperience(Skill.MAGIC), lIlIIIlIllIllII)) {
                                    ?? r0 = lllIIIIl[1];
                                    "".length();
                                    return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIIIIl[0];
                            }, lllIIIIl[10]);
                            "".length();
                            Time.sleep(C0004e.c(lllIIIIl[40], lllIIIIl[41]));
                            "".length();
                        }
                    }
                    if (lIlllIlIIll(bA ? 1 : 0)) {
                        if (lIlllIlIllI(first) && lIlllIlIllI(first2) && lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                            int lIlIIIlIllIllII2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlllIllllI(Skills.getExperience(Skill.MAGIC), lIlIIIlIllIllII2)) {
                                    ?? r0 = lllIIIIl[1];
                                    "".length();
                                    return (((18 ^ 41) ^ (45 ^ 51)) & (((((45 + 106) - 75) + 66) ^ (((23 + 110) - 96) + 134)) ^ (-" ".length()))) == ((58 ^ 48) ^ (22 ^ 24)) ? ((((150 + 78) - 119) + 65) ^ (((111 + 47) - 14) + 27)) & (((83 ^ 2) ^ (107 ^ 63)) ^ (-" ".length())) : r0;
                                }
                                return lllIIIIl[0];
                            }, lllIIIIl[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                                ?? r0 = lllIIIIl[1];
                                "".length();
                                return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIIIl[0];
                        }, lllIIIIl[42]);
                        "".length();
                    }
                }
            }
        }
    }

    public static void aa() {
        if (lIlllIlIIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlllIlIlIl(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llIllllI[lllIIIIl[43]];
            Movement.walkTo(bD);
            "".length();
            Time.sleepTicks(lllIIIIl[1]);
            "".length();
        }
        if (lIlllIlIIll(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llIllllI[lllIIIIl[44]];
            ab();
        }
    }

    private static boolean lIlllIlIlII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlllIlIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f6, code lost:
        if (lIlllIlIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027f, code lost:
        if (lIlllIlIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0364, code lost:
        if (lIlllIlIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        if (lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[21])) {
            int[] iArr = new int[lllIIIIl[1]];
            iArr[lllIIIIl[0]] = lllIIIIl[9];
            if (lIlllIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIIIl[1]];
                iArr2[lllIIIIl[0]] = lllIIIIl[13];
                if (lIlllIlIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllIIIIl[1]];
                    iArr3[lllIIIIl[0]] = lllIIIIl[11];
                    if (lIlllIlIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIIIIl[1]];
                        iArr4[lllIIIIl[0]] = lllIIIIl[14];
                        if (lIlllIlIIll(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lllIIIIl[1]];
                            iArr5[lllIIIIl[0]] = lllIIIIl[20];
                            if (lIlllIlIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lllIIIIl[1]];
                                iArr6[lllIIIIl[0]] = lllIIIIl[48];
                                if (lIlllIlIlIl(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lllIIIIl[1]];
                                    iArr7[lllIIIIl[0]] = lllIIIIl[48];
                                }
                                ?? r0 = lllIIIIl[1];
                                "".length();
                                return "   ".length() < 0 ? ((222 ^ 175) ^ (165 ^ 156)) & (((((147 + 85) - 74) + 59) ^ (((127 + 11) - 92) + 99)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lllIIIIl[0];
        } else if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[21]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8])) {
            int[] iArr8 = new int[lllIIIIl[1]];
            iArr8[lllIIIIl[0]] = lllIIIIl[13];
            if (lIlllIlIIll(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lllIIIIl[1]];
                iArr9[lllIIIIl[0]] = lllIIIIl[11];
                if (lIlllIlIIll(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIIIIl[1]];
                    iArr10[lllIIIIl[0]] = lllIIIIl[14];
                    if (lIlllIlIIll(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIIIIl[1]];
                        iArr11[lllIIIIl[0]] = lllIIIIl[16];
                        if (lIlllIlIIll(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lllIIIIl[1]];
                            iArr12[lllIIIIl[0]] = lllIIIIl[48];
                            if (lIlllIlIlIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lllIIIIl[1]];
                                iArr13[lllIIIIl[0]] = lllIIIIl[48];
                            }
                            ?? r02 = lllIIIIl[1];
                            "".length();
                            return (10 ^ 14) <= ("   ".length() & ("   ".length() ^ (-1))) ? (!true) & (true ^ true) : r02;
                        }
                    }
                }
            }
            return lllIIIIl[0];
        } else if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8]) && lIlllIlIlIl(bA ? 1 : 0)) {
            int[] iArr14 = new int[lllIIIIl[1]];
            iArr14[lllIIIIl[0]] = lllIIIIl[22];
            if (lIlllIlIlIl(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lllIIIIl[1]];
                iArr15[lllIIIIl[0]] = lllIIIIl[22];
            }
            int[] iArr16 = new int[lllIIIIl[1]];
            iArr16[lllIIIIl[0]] = lllIIIIl[24];
            if (lIlllIlIIll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lllIIIIl[1]];
                iArr17[lllIIIIl[0]] = lllIIIIl[38];
                if (lIlllIlIIll(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lllIIIIl[1];
                    "".length();
                    return "   ".length() <= 0 ? ((((151 + 56) - 72) + 102) ^ (((123 + 14) - 75) + 122)) & (((((181 + 181) - 239) + 85) ^ (((13 + 130) - 92) + 82)) ^ (-" ".length())) : r03;
                }
            }
            return lllIIIIl[0];
        } else if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8]) && lIlllIlIIll(bA ? 1 : 0)) {
            int[] iArr18 = new int[lllIIIIl[1]];
            iArr18[lllIIIIl[0]] = lllIIIIl[22];
            if (lIlllIlIlIl(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lllIIIIl[1]];
                iArr19[lllIIIIl[0]] = lllIIIIl[22];
            }
            int[] iArr20 = new int[lllIIIIl[1]];
            iArr20[lllIIIIl[0]] = lllIIIIl[16];
            if (lIlllIlIIll(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lllIIIIl[1]];
                iArr21[lllIIIIl[0]] = lllIIIIl[23];
                if (lIlllIlIIll(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lllIIIIl[1]];
                    iArr22[lllIIIIl[0]] = lllIIIIl[23];
                    if (lIlllIllIII(Inventory.getFirst(iArr22).getQuantity(), lllIIIIl[19])) {
                        int[] iArr23 = new int[lllIIIIl[1]];
                        iArr23[lllIIIIl[0]] = lllIIIIl[24];
                        if (lIlllIlIIll(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lllIIIIl[1]];
                            iArr24[lllIIIIl[0]] = lllIIIIl[38];
                            if (lIlllIlIIll(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lllIIIIl[1];
                                "".length();
                                return 0 != 0 ? ((((6 + 148) - 47) + 50) ^ (((18 + 73) - 21) + 125)) & (((((102 + 51) - 73) + 79) ^ (((24 + 190) - 115) + 94)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lllIIIIl[0];
        } else {
            return lllIIIIl[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lllIIIIl[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlllIlIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e3, code lost:
        if (lIlllIlIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025d, code lost:
        if (lIlllIlIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0338, code lost:
        if (lIlllIlIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ad() {
        if (lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[21])) {
            int[] iArr = new int[lllIIIIl[1]];
            iArr[lllIIIIl[0]] = lllIIIIl[9];
            if (lIlllIlIIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIIIl[1]];
                iArr2[lllIIIIl[0]] = lllIIIIl[13];
                if (lIlllIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllIIIIl[1]];
                    iArr3[lllIIIIl[0]] = lllIIIIl[11];
                    if (lIlllIlIIll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIIIIl[1]];
                        iArr4[lllIIIIl[0]] = lllIIIIl[14];
                        if (lIlllIlIIll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lllIIIIl[1]];
                            iArr5[lllIIIIl[0]] = lllIIIIl[20];
                            if (lIlllIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lllIIIIl[1]];
                                iArr6[lllIIIIl[0]] = lllIIIIl[48];
                                if (lIlllIlIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lllIIIIl[1]];
                                    iArr7[lllIIIIl[0]] = lllIIIIl[48];
                                }
                                ?? r0 = lllIIIIl[1];
                                "".length();
                                return "  ".length() <= 0 ? ((21 ^ 99) ^ (13 ^ 109)) & (((90 ^ 102) ^ (47 ^ 5)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lllIIIIl[0];
        } else if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[21]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8])) {
            int[] iArr8 = new int[lllIIIIl[1]];
            iArr8[lllIIIIl[0]] = lllIIIIl[13];
            if (lIlllIlIIll(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lllIIIIl[1]];
                iArr9[lllIIIIl[0]] = lllIIIIl[11];
                if (lIlllIlIIll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIIIIl[1]];
                    iArr10[lllIIIIl[0]] = lllIIIIl[14];
                    if (lIlllIlIIll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIIIIl[1]];
                        iArr11[lllIIIIl[0]] = lllIIIIl[16];
                        if (lIlllIlIIll(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lllIIIIl[1]];
                            iArr12[lllIIIIl[0]] = lllIIIIl[48];
                            if (lIlllIlIlIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lllIIIIl[1]];
                                iArr13[lllIIIIl[0]] = lllIIIIl[48];
                            }
                            ?? r02 = lllIIIIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lllIIIIl[0];
        } else if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8]) && lIlllIlIlIl(bA ? 1 : 0)) {
            int[] iArr14 = new int[lllIIIIl[1]];
            iArr14[lllIIIIl[0]] = lllIIIIl[22];
            if (lIlllIlIlIl(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lllIIIIl[1]];
                iArr15[lllIIIIl[0]] = lllIIIIl[22];
            }
            int[] iArr16 = new int[lllIIIIl[1]];
            iArr16[lllIIIIl[0]] = lllIIIIl[24];
            if (lIlllIlIIll(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lllIIIIl[1]];
                iArr17[lllIIIIl[0]] = lllIIIIl[25];
                if (lIlllIlIIll(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lllIIIIl[1];
                    "".length();
                    return ((((46 + 105) - 80) + 79) ^ (((20 + 142) - 72) + 57)) <= 0 ? ((4 ^ 62) ^ (17 ^ 45)) & (((213 ^ 178) ^ (51 ^ 82)) ^ (-" ".length())) : r03;
                }
            }
            return lllIIIIl[0];
        } else if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8]) && lIlllIlIIll(bA ? 1 : 0)) {
            int[] iArr18 = new int[lllIIIIl[1]];
            iArr18[lllIIIIl[0]] = lllIIIIl[22];
            if (lIlllIlIlIl(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lllIIIIl[1]];
                iArr19[lllIIIIl[0]] = lllIIIIl[22];
            }
            int[] iArr20 = new int[lllIIIIl[1]];
            iArr20[lllIIIIl[0]] = lllIIIIl[16];
            if (lIlllIlIIll(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lllIIIIl[1]];
                iArr21[lllIIIIl[0]] = lllIIIIl[23];
                if (lIlllIlIIll(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lllIIIIl[1]];
                    iArr22[lllIIIIl[0]] = lllIIIIl[23];
                    if (lIlllIllIII(Bank.getFirst(iArr22).getQuantity(), lllIIIIl[19])) {
                        int[] iArr23 = new int[lllIIIIl[1]];
                        iArr23[lllIIIIl[0]] = lllIIIIl[24];
                        if (lIlllIlIIll(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lllIIIIl[1]];
                            iArr24[lllIIIIl[0]] = lllIIIIl[25];
                            if (lIlllIlIIll(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lllIIIIl[1];
                                "".length();
                                return (((29 ^ 61) ^ (182 ^ 167)) & (((216 ^ 135) ^ (214 ^ 184)) ^ (-" ".length()))) != 0 ? ((134 ^ 136) ^ (165 ^ 158)) & (((14 ^ 93) ^ (247 ^ 145)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lllIIIIl[0];
        } else {
            return lllIIIIl[0];
        }
    }

    private static void ag() {
        if (lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8])) {
            int[] iArr = new int[lllIIIIl[1]];
            iArr[lllIIIIl[0]] = lllIIIIl[16];
            if (lIlllIlIlIl(Bank.contains(iArr) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIIl[16], lllIIIIl[59], lllIIIIl[60]));
                "".length();
            }
            int[] iArr2 = new int[lllIIIIl[1]];
            iArr2[lllIIIIl[0]] = lllIIIIl[9];
            if (lIlllIlIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIIl[9], lllIIIIl[61], lllIIIIl[6]));
                "".length();
            }
            int[] iArr3 = new int[lllIIIIl[1]];
            iArr3[lllIIIIl[0]] = lllIIIIl[11];
            if (lIlllIlIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIIl[11], lllIIIIl[62], lllIIIIl[6]));
                "".length();
            }
            int[] iArr4 = new int[lllIIIIl[1]];
            iArr4[lllIIIIl[0]] = lllIIIIl[13];
            if (lIlllIlIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIIl[13], lllIIIIl[63], lllIIIIl[6]));
                "".length();
            }
            int[] iArr5 = new int[lllIIIIl[1]];
            iArr5[lllIIIIl[0]] = lllIIIIl[14];
            if (lIlllIlIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIIl[14], lllIIIIl[5], lllIIIIl[6]));
                "".length();
            }
            int[] iArr6 = new int[lllIIIIl[1]];
            iArr6[lllIIIIl[0]] = lllIIIIl[48];
            if (lIlllIlIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIIl[48], lllIIIIl[1], C0004e.c(lllIIIIl[64], lllIIIIl[65])));
                "".length();
            }
        }
        if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[8])) {
            int[] iArr7 = new int[lllIIIIl[1]];
            iArr7[lllIIIIl[0]] = lllIIIIl[24];
            if (lIlllIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIIIIl[1]];
                iArr8[lllIIIIl[0]] = lllIIIIl[24];
                if (lIlllIlIlII(Bank.getFirst(iArr8).getQuantity(), lllIIIIl[63])) {
                    int i = lllIIIIl[24];
                    int i2 = lllIIIIl[63];
                    int[] iArr9 = new int[lllIIIIl[1]];
                    iArr9[lllIIIIl[0]] = lllIIIIl[24];
                    bB.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lllIIIIl[66]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lllIIIIl[1]];
            iArr10[lllIIIIl[0]] = lllIIIIl[24];
            if (lIlllIlIlIl(Bank.contains(iArr10) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIIl[24], lllIIIIl[63], lllIIIIl[66]));
                "".length();
            }
            int[] iArr11 = new int[lllIIIIl[1]];
            iArr11[lllIIIIl[0]] = lllIIIIl[25];
            if (lIlllIlIIll(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIIIIl[1]];
                iArr12[lllIIIIl[0]] = lllIIIIl[25];
                if (lIlllIlIlII(Bank.getFirst(iArr12).getQuantity(), lllIIIIl[63])) {
                    int i3 = lllIIIIl[25];
                    int i4 = lllIIIIl[63];
                    int[] iArr13 = new int[lllIIIIl[1]];
                    iArr13[lllIIIIl[0]] = lllIIIIl[25];
                    bB.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lllIIIIl[67]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lllIIIIl[1]];
            iArr14[lllIIIIl[0]] = lllIIIIl[25];
            if (lIlllIlIlIl(Bank.contains(iArr14) ? 1 : 0)) {
                bB.add(new C0003d(lllIIIIl[25], lllIIIIl[63], lllIIIIl[67]));
                "".length();
            }
            int[] iArr15 = new int[lllIIIIl[1]];
            iArr15[lllIIIIl[0]] = lllIIIIl[22];
            if (lIlllIlIlIl(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lllIIIIl[1]];
                iArr16[lllIIIIl[0]] = lllIIIIl[22];
                if (lIlllIlIlIl(Equipment.contains(iArr16) ? 1 : 0)) {
                    bB.add(new C0003d(lllIIIIl[22], lllIIIIl[1], lllIIIIl[68]));
                    "".length();
                }
            }
            if (lIlllIlIIll(bA ? 1 : 0)) {
                int[] iArr17 = new int[lllIIIIl[1]];
                iArr17[lllIIIIl[0]] = lllIIIIl[16];
                if (lIlllIlIIll(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lllIIIIl[1]];
                    iArr18[lllIIIIl[0]] = lllIIIIl[16];
                    if (lIlllIlIlII(Bank.getFirst(iArr18).getQuantity(), lllIIIIl[63])) {
                        int i5 = lllIIIIl[16];
                        int i6 = lllIIIIl[63];
                        int[] iArr19 = new int[lllIIIIl[1]];
                        iArr19[lllIIIIl[0]] = lllIIIIl[16];
                        bB.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lllIIIIl[60]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lllIIIIl[1]];
                iArr20[lllIIIIl[0]] = lllIIIIl[16];
                if (lIlllIlIlIl(Bank.contains(iArr20) ? 1 : 0)) {
                    bB.add(new C0003d(lllIIIIl[16], lllIIIIl[63], lllIIIIl[60]));
                    "".length();
                }
                int[] iArr21 = new int[lllIIIIl[1]];
                iArr21[lllIIIIl[0]] = lllIIIIl[23];
                if (lIlllIlIIll(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lllIIIIl[1]];
                    iArr22[lllIIIIl[0]] = lllIIIIl[23];
                    if (lIlllIlIlII(Bank.getFirst(iArr22).getQuantity(), lllIIIIl[68])) {
                        int i7 = lllIIIIl[23];
                        int i8 = lllIIIIl[68];
                        int[] iArr23 = new int[lllIIIIl[1]];
                        iArr23[lllIIIIl[0]] = lllIIIIl[23];
                        bB.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lllIIIIl[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lllIIIIl[1]];
                iArr24[lllIIIIl[0]] = lllIIIIl[23];
                if (lIlllIlIlIl(Bank.contains(iArr24) ? 1 : 0)) {
                    bB.add(new C0003d(lllIIIIl[23], lllIIIIl[68], lllIIIIl[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lllIIIIl[1]];
        iArr25[lllIIIIl[0]] = lllIIIIl[20];
        if (lIlllIlIlIl(Bank.contains(iArr25) ? 1 : 0)) {
            bB.add(new C0003d(lllIIIIl[20], lllIIIIl[69], lllIIIIl[40]));
            "".length();
        }
        if (lIlllIlIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIllllI[lllIIIIl[75]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lllIIIIl[70], lllIIIIl[19], lllIIIIl[71]));
            "".length();
        }
        int[] iArr26 = new int[lllIIIIl[1]];
        iArr26[lllIIIIl[0]] = lllIIIIl[72];
        if (lIlllIlIlIl(Bank.contains(iArr26) ? 1 : 0)) {
            bB.add(new C0003d(lllIIIIl[72], lllIIIIl[33], lllIIIIl[73]));
            "".length();
        }
        int[] iArr27 = new int[lllIIIIl[1]];
        iArr27[lllIIIIl[0]] = lllIIIIl[18];
        if (lIlllIlIlIl(Bank.contains(iArr27) ? 1 : 0)) {
            bB.add(new C0003d(lllIIIIl[18], lllIIIIl[33], lllIIIIl[73]));
            "".length();
        }
    }

    public static void af() {
        if (lIlllIlIllI(Widgets.get(lllIIIIl[51], lllIIIIl[52]))) {
            AccBuilderBarrows.c = llIllllI[lllIIIIl[53]];
            Widgets.get(lllIIIIl[51], lllIIIIl[52]).interact(llIllllI[lllIIIIl[54]]);
            Time.sleepTicks(lllIIIIl[7]);
            "".length();
        }
        if (lIlllIllIlI(Widgets.get(lllIIIIl[51], lllIIIIl[52])) && lIlllIlIlIl(Widgets.get(lllIIIIl[55]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lllIIIIl[1]);
            "".length();
            if (lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[19])) {
                Widgets.get(lllIIIIl[55], lllIIIIl[1]).getChild(lllIIIIl[1]).interact(llIllllI[lllIIIIl[56]]);
            }
            if (lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[32]) && lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[19])) {
                Widgets.get(lllIIIIl[55], lllIIIIl[1]).getChild(lllIIIIl[3]).interact(llIllllI[lllIIIIl[57]]);
            }
            if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[32]) && lIlllIlIlII(Skills.getLevel(Skill.MAGIC), lllIIIIl[39])) {
                Widgets.get(lllIIIIl[55], lllIIIIl[1]).getChild(lllIIIIl[4]).interact(llIllllI[lllIIIIl[58]]);
            }
            if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[32])) {
                int[] iArr = new int[lllIIIIl[1]];
                iArr[lllIIIIl[0]] = lllIIIIl[14];
                if (lIlllIlIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lllIIIIl[55], lllIIIIl[1]).getChild(lllIIIIl[4]).interact(llIllllI[lllIIIIl[21]]);
                }
            }
            if (lIlllIllIII(Skills.getLevel(Skill.MAGIC), lllIIIIl[39])) {
                int[] iArr2 = new int[lllIIIIl[1]];
                iArr2[lllIIIIl[0]] = lllIIIIl[14];
                if (lIlllIlIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lllIIIIl[55], lllIIIIl[1]).getChild(lllIIIIl[7]).interact(llIllllI[lllIIIIl[52]]);
                }
            }
            Time.sleepTicks(lllIIIIl[1]);
            "".length();
        }
    }
}
