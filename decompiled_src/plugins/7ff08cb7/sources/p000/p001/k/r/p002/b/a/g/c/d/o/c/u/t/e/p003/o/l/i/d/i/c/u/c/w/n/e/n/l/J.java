package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
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
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.J  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/J.class */
public class J implements ab {
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint fM;
    static /* synthetic */ int dk;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ int[] llllllIll;
    private static /* synthetic */ String[] llllllIlI;
    private static /* synthetic */ String[] cG;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint fL;

    private static boolean llIllIIIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01f7, code lost:
        if (llIlIlllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.J.llllllIll[2]) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2 = new int[llllllIll[3]];
        iArr2[llllllIll[4]] = llllllIll[19];
        if (llIllIIIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(llllllIll[19], llllllIll[2], C0009j.ch));
            "".length();
        }
        int[] iArr3 = new int[llllllIll[3]];
        iArr3[llllllIll[4]] = llllllIll[11];
        if (llIllIIIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(llllllIll[11], llllllIll[3], llllllIll[51]));
            "".length();
        }
        int[] iArr4 = new int[llllllIll[3]];
        iArr4[llllllIll[4]] = llllllIll[14];
        if (llIllIIIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llllllIll[14], llllllIll[3], llllllIll[51]));
            "".length();
        }
        int[] iArr5 = new int[llllllIll[3]];
        iArr5[llllllIll[4]] = llllllIll[18];
        if (llIllIIIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llllllIll[18], llllllIll[3], llllllIll[51]));
            "".length();
        }
        int[] iArr6 = new int[llllllIll[3]];
        iArr6[llllllIll[4]] = llllllIll[16];
        if (llIllIIIIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(llllllIll[16], llllllIll[3], llllllIll[51]));
            "".length();
        }
        int[] iArr7 = new int[llllllIll[3]];
        iArr7[llllllIll[4]] = llllllIll[13];
        if (llIllIIIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(llllllIll[13], llllllIll[3], llllllIll[52]));
            "".length();
        }
        int[] iArr8 = new int[llllllIll[3]];
        iArr8[llllllIll[4]] = llllllIll[10];
        if (llIllIIIIIII(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llllllIll[3]];
            iArr9[llllllIll[4]] = llllllIll[10];
            if (llIllIIIIIII(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llllllIll[3]];
                iArr10[llllllIll[4]] = llllllIll[10];
            }
            if (llIllIIIIIIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llllllIlI[llllllIll[59]]);
            }) ? 1 : 0)) {
                bx.add(new C0003d(llllllIll[54], llllllIll[15], llllllIll[55]));
                "".length();
            }
            iArr = new int[llllllIll[3]];
            iArr[llllllIll[4]] = llllllIll[9];
            if (llIllIIIIIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[llllllIll[3]];
                iArr11[llllllIll[4]] = llllllIll[9];
                if (!llIllIIIIIII(Bank.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[llllllIll[3]];
                iArr12[llllllIll[4]] = llllllIll[9];
                if (!llIlIlllllIl(Bank.getFirst(iArr12).getQuantity(), llllllIll[2])) {
                    return;
                }
            }
            bx.add(new C0003d(llllllIll[9], llllllIll[56], llllllIll[52]));
            "".length();
        }
        bx.add(new C0003d(llllllIll[10], llllllIll[2], llllllIll[53]));
        "".length();
        if (llIllIIIIIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llllllIlI[llllllIll[59]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[llllllIll[3]];
        iArr[llllllIll[4]] = llllllIll[9];
        if (llIllIIIIIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(llllllIll[9], llllllIll[56], llllllIll[52]));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIllIIIIlll(Quests.getState(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            ?? r0 = llllllIll[3];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllllIll[4];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            System.out.println("678: " + C0004e.j(llllllIll[5]));
            cd();
            "".length();
            if ((-"  ".length()) >= 0) {
                return "   ".length() & ("   ".length() ^ (-1));
            }
        } catch (Exception e) {
        }
        return llllllIll[57];
    }

    private static String llIlIllllIIl(String lIlIIlllIIIll, String lIlIIlllIIIlI) {
        String str = new String(Base64.getDecoder().decode(lIlIIlllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlIIlllIIIII = lIlIIlllIIIlI.toCharArray();
        int lIlIIllIlllll = llllllIll[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllllIll[4];
        while (llIlIlllllIl(i, length)) {
            sb.append((char) (charArray[i] ^ lIlIIlllIIIII[lIlIIllIlllll % lIlIIlllIIIII.length]));
            "".length();
            lIlIIllIlllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIlIllllIll() {
        llllllIlI = new String[llllllIll[21]];
        llllllIlI[llllllIll[4]] = llIlIllllIII("u67fJZILkD/jV+LPe5gN+tD+CEWvxlO3gBmmxc8iwaRZvbLV/gQQVh1r3t5PHELV", "nbwpo");
        llllllIlI[llllllIll[3]] = llIlIllllIIl("GQ4SSSI4TwYIODw=", "WodiV");
        llllllIlI[llllllIll[1]] = llIlIllllIlI("te1Kfv/92N2ILTnojbwSte1lvpbYr68b", "vJIvA");
        llllllIlI[llllllIll[12]] = llIlIllllIIl("OD1PED8KeAIYPhwxARZtHi0KAjlPKxoBPQMxCgJhTysYGDkMMAYfKk8sAFEPOgEmPwo=", "oXoqM");
        llllllIlI[llllllIll[7]] = llIlIllllIIl("LT8fFwQ=", "iMvyo");
        llllllIlI[llllllIll[15]] = llIlIllllIII("VlWB+hB+XEKDRE4/NIYueA==", "WQDWw");
        llllllIlI[llllllIll[17]] = llIlIllllIIl("JSceJzoEKBdjMgQnHCwx", "mFpCV");
        llllllIlI[llllllIll[8]] = llIlIllllIlI("DDdd7vLSTm4=", "mgLID");
        llllllIlI[llllllIll[23]] = llIlIllllIIl("DA0rHzBoBjUKOjw=", "HdYkI");
        llllllIlI[llllllIll[24]] = llIlIllllIIl("IgwVRhYDTREJFhgIDUYWAwACEg0=", "lmcfb");
        llllllIlI[llllllIll[2]] = llIlIllllIII("HrNuYP4XT3Y=", "YTpIw");
        llllllIlI[llllllIll[30]] = llIlIllllIIl("KgIDQRUIET0A", "ztSaT");
        llllllIlI[llllllIll[31]] = llIlIllllIIl("KBQSLh8BFkYuGQIQEjU=", "oqfZv");
        llllllIlI[llllllIll[33]] = llIlIllllIlI("me3v/dAFoOs=", "mbELZ");
        llllllIlI[llllllIll[34]] = llIlIllllIII("UgK6kVq89c4=", "HCNCf");
        llllllIlI[llllllIll[36]] = llIlIllllIII("sywNnws2SrE=", "TIpUB");
        llllllIlI[llllllIll[35]] = llIlIllllIII("jrMaXJASKRw=", "gtupd");
        llllllIlI[llllllIll[37]] = llIlIllllIlI("fYmCy+CbtUEzmqEiakAeuA==", "VyMZG");
        llllllIlI[llllllIll[38]] = llIlIllllIII("LSAE3VfDjGg=", "jjjNH");
        llllllIlI[llllllIll[39]] = llIlIllllIIl("EBYDLCd2BhokICI=", "VdvES");
        llllllIlI[llllllIll[40]] = llIlIllllIII("aRtBsNRPiCmNEQfRdShGjg==", "JhZFg");
        llllllIlI[llllllIll[41]] = llIlIllllIIl("Lik4Kw==", "yLYYQ");
        llllllIlI[llllllIll[42]] = llIlIllllIIl("MSwFJzoQIwxjMhAsBywx", "yMkCV");
        llllllIlI[llllllIll[43]] = llIlIllllIIl("KB4HMQ==", "kqhZz");
        llllllIlI[llllllIll[44]] = llIlIllllIlI("/SMzG1eM5rk=", "ETPSY");
        llllllIlI[llllllIll[45]] = llIlIllllIIl("OxMSFA==", "tcwzR");
        llllllIlI[llllllIll[46]] = llIlIllllIIl("Oz8FCg==", "zMlyp");
        llllllIlI[llllllIll[47]] = llIlIllllIlI("e8k28dAHavp/9zKG0MWZFg==", "ZEsVO");
        llllllIlI[llllllIll[48]] = llIlIllllIII("ViR7vcuyS8c=", "TNzNq");
        llllllIlI[llllllIll[0]] = llIlIllllIII("8D5jurrWXpw=", "CraHg");
        llllllIlI[llllllIll[49]] = llIlIllllIIl("AxExShkgSDoPATI=", "FhTjv");
        llllllIlI[llllllIll[50]] = llIlIllllIlI("MeqE7yIIy5fce3IvVfUjpQ==", "sfBPw");
        llllllIlI[llllllIll[58]] = llIlIllllIIl("MwMoeBsVJB4sSBAwCSsc", "aElXh");
        llllllIlI[llllllIll[59]] = llIlIllllIIl("Gi8lMHUHIGsgMAkqPz91QA==", "hFKWU");
        llllllIlI[llllllIll[60]] = llIlIllllIlI("RNMVoTUNAlA=", "UhaVZ");
        llllllIlI[llllllIll[61]] = llIlIllllIlI("7G5XNBO/G48=", "caCEn");
        llllllIlI[llllllIll[62]] = llIlIllllIlI("A8uUqrZO36k=", "RnlGU");
        llllllIlI[llllllIll[63]] = llIlIllllIIl("ExAcFisZAg==", "weyzB");
        llllllIlI[llllllIll[64]] = llIlIllllIIl("PSEGKSc3Mw==", "YTcEN");
        llllllIlI[llllllIll[65]] = llIlIllllIII("WLaEtJOoqK0=", "SuVYo");
        llllllIlI[llllllIll[56]] = llIlIllllIlI("Sj1xUOjDQfY=", "RCAqI");
        llllllIlI[llllllIll[66]] = llIlIllllIlI("RJq3acQj4hQ=", "TGlEI");
        llllllIlI[llllllIll[71]] = llIlIllllIIl("CBk6TQ8kDXQAFyAddAATaxl0DhcgHWs=", "KxTmv");
        llllllIlI[llllllIll[72]] = llIlIllllIlI("OpYXImcWPrHQtvziEx+kWyIbd9iSmWEU9Zs2TRueiIVjO2/rZKzJ3Q7szuPFO6gf", "mlAIa");
        llllllIlI[llllllIll[73]] = llIlIllllIlI("85jAorWAbYoBO2/8DmrMtcPGA03H0ay49mImaENNJ8+jy9X/uC6SoQnnqofL7gbh", "RqfiL");
        llllllIlI[llllllIll[74]] = llIlIllllIlI("lOb1RRuIRd0=", "NAprP");
        llllllIlI[llllllIll[75]] = llIlIllllIIl("ETwzFWw1dCUTJCgzbQ==", "FTRaK");
        llllllIlI[llllllIll[76]] = llIlIllllIlI("a65v43GwlwIg03gZPXPG9k5g38txbO4lP5MHdRSxLB2Pi4uF+L2jEg==", "MyoMj");
        llllllIlI[llllllIll[77]] = llIlIllllIII("JX3SyEIhAxEAeR8r3nYP3qlcjIiaYxe6eLVYyiOktpE=", "opYiX");
        llllllIlI[llllllIll[78]] = llIlIllllIlI("FnMtSySjl0oMOV7ufepPxxqxCnpUnuaIUzlMscoYHU8=", "UNcdt");
    }

    private static boolean llIllIIIIIII(int i) {
        return i != 0;
    }

    private static boolean llIlIllllllI(int i, int i2) {
        return i == i2;
    }

    private static void llIlIlllllII() {
        llllllIll = new int[79];
        llllllIll[0] = 163 ^ 190;
        llllllIll[1] = "  ".length();
        llllllIll[2] = 108 ^ 102;
        llllllIll[3] = " ".length();
        llllllIll[4] = ((((209 + 154) - 153) + 9) ^ (((34 + 53) - 9) + 50)) & (((((117 + 77) - 119) + 121) ^ (((69 + 22) - 50) + 118)) ^ (-" ".length()));
        llllllIll[5] = (-3417) & 4094;
        llllllIll[6] = (-((-4230) & 23773)) & (-8193) & 32735;
        llllllIll[7] = (((36 + 101) - 125) + 115) ^ (216 ^ 163);
        llllllIll[8] = 101 ^ 98;
        llllllIll[9] = (-49) & 8055;
        llllllIll[10] = (-((-2145) & 10487)) & (-34) & 16383;
        llllllIll[11] = (-((-26809) & 31934)) & (-3) & 7679;
        llllllIll[12] = "   ".length();
        llllllIll[13] = ((36 + 130) - 117) + 172;
        llllllIll[14] = (-137) & 2045;
        llllllIll[15] = 127 ^ 122;
        llllllIll[16] = (-17548) & 19631;
        llllllIll[17] = 95 ^ 89;
        llllllIll[18] = (-8334) & 8925;
        llllllIll[19] = (-2051) & 14675;
        llllllIll[20] = (-27657) & 28651;
        llllllIll[21] = 68 ^ 118;
        llllllIll[22] = (-20490) & 23007;
        llllllIll[23] = 168 ^ 160;
        llllllIll[24] = 75 ^ 66;
        llllllIll[25] = (-((-10369) & 15011)) & (-24577) & 32511;
        llllllIll[26] = (-8841) & 12030;
        llllllIll[27] = 57 ^ 79;
        llllllIll[28] = ((75 + 64) - 6) + 4;
        llllllIll[29] = -" ".length();
        llllllIll[30] = 88 ^ 83;
        llllllIll[31] = 185 ^ 181;
        llllllIll[32] = (-((-4958) & 24415)) & (-12417) & 32173;
        llllllIll[33] = 146 ^ 159;
        llllllIll[34] = (93 ^ 102) ^ (58 ^ 15);
        llllllIll[35] = 113 ^ 97;
        llllllIll[36] = (38 ^ 0) ^ (157 ^ 180);
        llllllIll[37] = (87 ^ 44) ^ (34 ^ 72);
        llllllIll[38] = (((115 + 62) - 76) + 53) ^ (((1 + 46) - (-6)) + 83);
        llllllIll[39] = (((23 + 19) - (-9)) + 96) ^ (((22 + 108) - 10) + 8);
        llllllIll[40] = 16 ^ 4;
        llllllIll[41] = (((157 + 19) - 30) + 26) ^ (((19 + 151) - 93) + 108);
        llllllIll[42] = (((135 + 67) - 58) + 28) ^ (((149 + 2) - 114) + 149);
        llllllIll[43] = 113 ^ 102;
        llllllIll[44] = (106 ^ 127) ^ (200 ^ 197);
        llllllIll[45] = 117 ^ 108;
        llllllIll[46] = (((92 + 111) - 44) + 9) ^ (((122 + 120) - 200) + 136);
        llllllIll[47] = 150 ^ 141;
        llllllIll[48] = 52 ^ 40;
        llllllIll[49] = 130 ^ 156;
        llllllIll[50] = 173 ^ 178;
        llllllIll[51] = (-((-4322) & 22771)) & (-7) & 27455;
        llllllIll[52] = (-25650) & 26549;
        llllllIll[53] = (-((-19067) & 23163)) & (-26626) & 32621;
        llllllIll[54] = (-51) & 12030;
        llllllIll[55] = (-7170) & 32169;
        llllllIll[56] = 187 ^ 147;
        llllllIll[57] = (28 ^ 70) ^ (147 ^ 173);
        llllllIll[58] = 35 ^ 3;
        llllllIll[59] = (((153 + 51) - 44) + 21) ^ (((70 + 79) - 105) + 104);
        llllllIll[60] = 79 ^ 109;
        llllllIll[61] = (((105 + 94) - 132) + 60) ^ (213 ^ 137);
        llllllIll[62] = (210 ^ 176) ^ (17 ^ 87);
        llllllIll[63] = (((6 + 125) - (-22)) + 38) ^ (((134 + 33) - 99) + 86);
        llllllIll[64] = 84 ^ 114;
        llllllIll[65] = (180 ^ 155) ^ (135 ^ 143);
        llllllIll[66] = 108 ^ 69;
        llllllIll[67] = (-20585) & 23791;
        llllllIll[68] = (-24882) & 28095;
        llllllIll[69] = (-193) & 3574;
        llllllIll[70] = (-((-18449) & 22841)) & (-25109) & 32767;
        llllllIll[71] = 27 ^ 49;
        llllllIll[72] = 25 ^ 50;
        llllllIll[73] = (76 ^ 64) ^ (51 ^ 19);
        llllllIll[74] = 43 ^ 6;
        llllllIll[75] = 171 ^ 133;
        llllllIll[76] = 7 ^ 40;
        llllllIll[77] = 244 ^ 196;
        llllllIll[78] = (37 ^ 33) ^ (59 ^ 14);
    }

    private static boolean llIllIIIIIIl(int i) {
        return i == 0;
    }

    private static boolean llIlIlllllIl(int i, int i2) {
        return i < i2;
    }

    private static String llIlIllllIII(String lIlIIllIIlllI, String lIlIIllIIllIl) {
        try {
            SecretKeySpec lIlIIllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIllIlIIII = Cipher.getInstance("Blowfish");
            lIlIIllIlIIII.init(llllllIll[1], lIlIIllIlIIIl);
            return new String(lIlIIllIlIIII.doFinal(Base64.getDecoder().decode(lIlIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIllIIllll) {
            lIlIIllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIIlIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llllllIll[4];
    }

    private static String llIlIllllIlI(String lIlIIllIIIIIl, String lIlIIllIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllIIIIII.getBytes(StandardCharsets.UTF_8)), llllllIll[23]), "DES");
            Cipher lIlIIllIIIIll = Cipher.getInstance("DES");
            lIlIIllIIIIll.init(llllllIll[1], secretKeySpec);
            return new String(lIlIIllIIIIll.doFinal(Base64.getDecoder().decode(lIlIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIllIIIIlI) {
            lIlIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIIlII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v300, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v322, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    public static void cd() {
        if (llIlIlllllIl(C0004e.j(llllllIll[0]), llllllIll[1])) {
            P.cM();
        }
        if (llIlIlllllIl(Skills.getLevel(Skill.COOKING), llllllIll[2]) && llIlIllllllI(C0004e.j(llllllIll[0]), llllllIll[1])) {
            am.ed();
        }
        if (llIlIlllllll(Skills.getLevel(Skill.COOKING), llllllIll[2]) && llIlIllllllI(C0004e.j(llllllIll[0]), llllllIll[1])) {
            if (llIllIIIIIII(bv ? 1 : 0)) {
                C0001b.a(bx);
                if (llIlIlllllIl(bx.size(), llllllIll[3])) {
                    System.out.println(llllllIlI[llllllIll[4]]);
                    bv = llllllIll[4];
                }
            }
            if (llIllIIIIIIl(bv ? 1 : 0)) {
                if (llIllIIIIIIl(an() ? 1 : 0) && llIllIIIIIIl(C0004e.j(llllllIll[5]))) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (llIllIIIIIlI(nearest) && llIllIIIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llllllIlI[llllllIll[3]];
                        C0000a.a(nearest);
                    }
                    if (llIllIIIIIlI(nearest) && llIllIIIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, llllllIll[6]);
                            "".length();
                        }
                        if (llIllIIIIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = llllllIlI[llllllIll[1]];
                            if (llIllIIIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llllllIll[7]);
                                "".length();
                            }
                            if (llIllIIIIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(llllllIll[1]);
                                "".length();
                            }
                            int[] iArr = new int[llllllIll[8]];
                            iArr[llllllIll[4]] = llllllIll[9];
                            iArr[llllllIll[3]] = llllllIll[10];
                            iArr[llllllIll[1]] = llllllIll[11];
                            iArr[llllllIll[12]] = llllllIll[13];
                            iArr[llllllIll[7]] = llllllIll[14];
                            iArr[llllllIll[15]] = llllllIll[16];
                            iArr[llllllIll[17]] = llllllIll[18];
                            if (llIllIIIIIIl(C0004e.d(iArr) ? 1 : 0)) {
                                Q();
                                System.out.println(llllllIlI[llllllIll[12]]);
                                bv = llllllIll[3];
                                return;
                            }
                            int[] iArr2 = new int[llllllIll[8]];
                            iArr2[llllllIll[4]] = llllllIll[9];
                            iArr2[llllllIll[3]] = llllllIll[10];
                            iArr2[llllllIll[1]] = llllllIll[11];
                            iArr2[llllllIll[12]] = llllllIll[13];
                            iArr2[llllllIll[7]] = llllllIll[14];
                            iArr2[llllllIll[15]] = llllllIll[16];
                            iArr2[llllllIll[17]] = llllllIll[18];
                            if (llIllIIIIIII(C0004e.d(iArr2) ? 1 : 0)) {
                                C0000a.a(llllllIll[9], llllllIll[2]);
                                C0000a.a(llllllIll[10], llllllIll[2]);
                                C0000a.a(llllllIll[11], llllllIll[3]);
                                C0000a.a(llllllIll[13], llllllIll[3]);
                                C0000a.a(llllllIll[14], llllllIll[3]);
                                C0000a.a(llllllIll[16], llllllIll[3]);
                                C0000a.a(llllllIll[18], llllllIll[3]);
                                C0000a.a(llllllIll[19], llllllIll[1]);
                                C0000a.a(llllllIll[20], llllllIll[6]);
                            }
                        }
                    }
                }
                if (llIllIIIIIII(Inventory.contains(C0005f.bc) ? 1 : 0) && llIlIlllllIl(Movement.getRunEnergy(), llllllIll[21])) {
                    Inventory.getFirst(C0005f.bc).interact(llllllIlI[llllllIll[7]]);
                    Time.sleepTicks(llllllIll[3]);
                    "".length();
                }
                if (llIllIIIIIIl(C0004e.j(llllllIll[5])) && llIllIIIIIII(an() ? 1 : 0)) {
                    AccBuilderGWD.c = llllllIlI[llllllIll[15]];
                    if (llIllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                        if (llIllIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(fL);
                        "".length();
                        Time.sleepTicks(llllllIll[3]);
                        "".length();
                    }
                    if (llIllIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                        AccBuilderGWD.c = llllllIlI[llllllIll[17]];
                        C0006g.a(llllllIlI[llllllIll[8]], cG);
                    }
                }
                if (llIlIllllllI(C0004e.j(llllllIll[5]), llllllIll[3])) {
                    int[] iArr3 = new int[llllllIll[3]];
                    iArr3[llllllIll[4]] = llllllIll[22];
                    if (llIllIIIIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        String[] strArr = new String[llllllIll[3]];
                        strArr[llllllIll[4]] = llllllIlI[llllllIll[23]];
                        if (llIllIIIIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                            dk = llllllIll[4];
                            if (llIllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(fM), llllllIll[7])) {
                                AccBuilderGWD.c = llllllIlI[llllllIll[24]];
                                WorldArea worldArea = new WorldArea(llllllIll[25], llllllIll[26], llllllIll[27], llllllIll[28], llllllIll[4]);
                                if (llIllIIIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (llIllIIIIIII(Inventory.contains(item -> {
                                        return item.getName().contains(llllllIlI[llllllIll[66]]);
                                    }) ? 1 : 0) && llIllIIIIIIl(Equipment.contains(item2 -> {
                                        return item2.getName().contains(llllllIlI[llllllIll[56]]);
                                    }) ? 1 : 0)) {
                                        Inventory.getFirst(item3 -> {
                                            return item3.getName().contains(llllllIlI[llllllIll[65]]);
                                        }).interact(llllllIlI[llllllIll[2]]);
                                    }
                                    if (llIllIIIIIII(Equipment.contains(item4 -> {
                                        return item4.getName().contains(llllllIlI[llllllIll[64]]);
                                    }) ? 1 : 0) && llIlIllllllI(Players.getLocal().getAnimation(), llllllIll[29])) {
                                        Equipment.getFirst(item5 -> {
                                            return item5.getName().contains(llllllIlI[llllllIll[63]]);
                                        }).interact(llllllIlI[llllllIll[30]]);
                                        Time.sleepTicks(llllllIll[7]);
                                        "".length();
                                    }
                                }
                                if (llIllIIIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo(fM);
                                    "".length();
                                    Time.sleepTicks(llllllIll[3]);
                                    "".length();
                                }
                            }
                            if (llIllIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fM), llllllIll[7])) {
                                AccBuilderGWD.c = llllllIlI[llllllIll[31]];
                                if (llIllIIIIIII(Widgets.get(llllllIll[32]).isEmpty() ? 1 : 0)) {
                                    String[] strArr2 = new String[llllllIll[3]];
                                    strArr2[llllllIll[4]] = llllllIlI[llllllIll[33]];
                                    NPCs.getNearest(strArr2).interact(llllllIlI[llllllIll[34]]);
                                    Time.sleepTicks(llllllIll[12]);
                                    "".length();
                                }
                                if (llIllIIIIIIl(Widgets.get(llllllIll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(llllllIll[32], llllllIll[35], llllllIll[3]).interact(llllllIlI[llllllIll[36]]);
                                    Time.sleepTicks(llllllIll[1]);
                                    "".length();
                                }
                                int[] iArr4 = new int[llllllIll[3]];
                                iArr4[llllllIll[4]] = llllllIll[22];
                                if (llIllIIIIIII(Inventory.contains(iArr4) ? 1 : 0) && llIllIIIIIIl(Widgets.get(llllllIll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(llllllIll[32], llllllIll[3], llllllIll[30]).interact(llllllIlI[llllllIll[35]]);
                                    Time.sleepTicks(llllllIll[3]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[llllllIll[3]];
                    iArr5[llllllIll[4]] = llllllIll[22];
                    if (llIllIIIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                        String[] strArr3 = new String[llllllIll[3]];
                        strArr3[llllllIll[4]] = llllllIlI[llllllIll[37]];
                        if (llIllIIIIIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                            int[] iArr6 = new int[llllllIll[3]];
                            iArr6[llllllIll[4]] = llllllIll[22];
                            if (llIllIIIIIII(Inventory.contains(iArr6) ? 1 : 0) && llIllIIIIIIl(Widgets.get(llllllIll[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get(llllllIll[32], llllllIll[3], llllllIll[30]).interact(llllllIlI[llllllIll[38]]);
                                Time.sleepTicks(llllllIll[3]);
                                "".length();
                            }
                            int[] iArr7 = new int[llllllIll[3]];
                            iArr7[llllllIll[4]] = llllllIll[18];
                            Item first = Inventory.getFirst(iArr7);
                            String[] strArr4 = new String[llllllIll[3]];
                            strArr4[llllllIll[4]] = llllllIlI[llllllIll[39]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(llllllIll[1]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[llllllIll[3]];
                    strArr5[llllllIll[4]] = llllllIlI[llllllIll[40]];
                    if (llIllIIIIIII(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (llIllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                            if (llIllIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (llIllIIIIIII(Inventory.contains(item6 -> {
                                return item6.getName().contains(llllllIlI[llllllIll[62]]);
                            }) ? 1 : 0) && llIllIIIIIIl(Equipment.contains(item7 -> {
                                return item7.getName().contains(llllllIlI[llllllIll[61]]);
                            }) ? 1 : 0)) {
                                Inventory.getFirst(item8 -> {
                                    return item8.getName().contains(llllllIlI[llllllIll[60]]);
                                }).interact(llllllIlI[llllllIll[41]]);
                                Time.sleepTicks(llllllIll[1]);
                                "".length();
                            }
                            Movement.walkTo(fL);
                            "".length();
                            Time.sleepTicks(llllllIll[3]);
                            "".length();
                        }
                        if (llIllIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                            AccBuilderGWD.c = llllllIlI[llllllIll[42]];
                            if (llIlIlllllIl(dk, llllllIll[3])) {
                                as.ow += llllllIll[3];
                                as.u(AccBuilderGWD.m);
                                dk += llllllIll[3];
                                as.ow = llllllIll[4];
                                dl = llllllIll[4];
                            }
                            C0006g.a(llllllIlI[llllllIll[43]], cG);
                        }
                    }
                }
                if (llIlIllllllI(C0004e.j(llllllIll[5]), llllllIll[1])) {
                    String[] strArr6 = new String[llllllIll[3]];
                    strArr6[llllllIll[4]] = llllllIlI[llllllIll[44]];
                    TileObjects.getNearest(strArr6).interact(llllllIlI[llllllIll[45]]);
                    Time.sleepTicks(llllllIll[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIlIlllllll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIllIIIIllI(Object obj) {
        return obj == null;
    }

    static {
        llIlIlllllII();
        llIlIllllIll();
        fL = new WorldPoint(llllllIll[67], llllllIll[68], llllllIll[4]);
        fM = new WorldPoint(llllllIll[69], llllllIll[70], llllllIll[4]);
        bx = new ArrayList();
        String[] strArr = new String[llllllIll[23]];
        strArr[llllllIll[4]] = llllllIlI[llllllIll[71]];
        strArr[llllllIll[3]] = llllllIlI[llllllIll[72]];
        strArr[llllllIll[1]] = llllllIlI[llllllIll[73]];
        strArr[llllllIll[12]] = llllllIlI[llllllIll[74]];
        strArr[llllllIll[7]] = llllllIlI[llllllIll[75]];
        strArr[llllllIll[15]] = llllllIlI[llllllIll[76]];
        strArr[llllllIll[17]] = llllllIlI[llllllIll[77]];
        strArr[llllllIll[8]] = llllllIlI[llllllIll[78]];
        cG = strArr;
    }

    public static void ce() {
        String[] strArr = new String[llllllIll[3]];
        strArr[llllllIll[4]] = llllllIlI[llllllIll[46]];
        if (llIllIIIIllI(NPCs.getNearest(strArr))) {
            if (llIllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                if (llIllIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo(fL);
                "".length();
                Time.sleepTicks(llllllIll[3]);
                "".length();
            }
            if (llIllIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fL), llllllIll[12])) {
                AccBuilderGWD.c = llllllIlI[llllllIll[47]];
                String[] strArr2 = new String[llllllIll[3]];
                strArr2[llllllIll[4]] = llllllIlI[llllllIll[48]];
                TileObjects.getNearest(strArr2).interact(llllllIlI[llllllIll[0]]);
                Time.sleepTicks(llllllIll[1]);
                "".length();
            }
        }
    }

    private static boolean llIllIIIIIll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llllllIll[3]];
        strArr[llllllIll[4]] = llllllIlI[llllllIll[49]];
        if (llIllIIIIIll(Inventory.getCount(strArr))) {
            int[] iArr = new int[llllllIll[3]];
            iArr[llllllIll[4]] = llllllIll[14];
            if (llIllIIIIIll(Inventory.getCount(iArr))) {
                String[] strArr2 = new String[llllllIll[3]];
                strArr2[llllllIll[4]] = llllllIlI[llllllIll[50]];
                if (llIllIIIIIII(Inventory.contains(strArr2) ? 1 : 0)) {
                    int[] iArr2 = new int[llllllIll[3]];
                    iArr2[llllllIll[4]] = llllllIll[18];
                    if (llIllIIIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llllllIll[3]];
                        iArr3[llllllIll[4]] = llllllIll[11];
                        if (llIllIIIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                            ?? r0 = llllllIll[3];
                            "".length();
                            return ((240 ^ 166) ^ (103 ^ 53)) > ((223 ^ 163) ^ (56 ^ 64)) ? ((84 ^ 49) ^ (128 ^ 177)) & (((((157 + 36) - 7) + 15) ^ (((142 + 43) - 157) + 129)) ^ (-" ".length())) : r0;
                        }
                    }
                }
            }
        }
        return llllllIll[4];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llllllIlI[llllllIll[58]];
    }

    private static boolean llIllIIIIIlI(Object obj) {
        return obj != null;
    }
}
