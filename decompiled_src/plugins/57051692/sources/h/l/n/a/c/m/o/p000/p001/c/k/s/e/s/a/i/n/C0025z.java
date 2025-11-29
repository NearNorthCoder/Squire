package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.z  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/z.class */
public class C0025z implements K {
    static /* synthetic */ WorldPoint cS;
    static /* synthetic */ int dc;
    static /* synthetic */ String[] cy;
    static /* synthetic */ WorldPoint cU;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ boolean dd;
    private static /* synthetic */ String[] lIlIIlllII;
    static /* synthetic */ WorldPoint cR;
    static /* synthetic */ WorldPoint cT;
    static /* synthetic */ int dW;
    private static /* synthetic */ int[] lIlIIllllI;
    public static /* synthetic */ List<C0003d> bp;

    private static boolean lIIIlllIlIllI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIlllIlIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIllllI[6];
    }

    private static boolean lIIIlllIlIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlllIlIIll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIlllIllIII(Quests.getState(Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            ?? r0 = lIlIIllllI[5];
            "".length();
            return ((((139 + 45) - 159) + 166) ^ (((19 + 54) - (-60)) + 54)) <= "   ".length() ? ((((121 + 63) - 59) + 66) ^ (((81 + 17) - 65) + 102)) & (((14 ^ 117) ^ (3 ^ 64)) ^ (-" ".length())) : r0;
        }
        return lIlIIllllI[6];
    }

    static {
        lIIIlllIIllII();
        lIIIlllIIlIll();
        bp = new ArrayList();
        cR = new WorldPoint(lIlIIllllI[68], lIlIIllllI[69], lIlIIllllI[6]);
        cS = new WorldPoint(lIlIIllllI[70], lIlIIllllI[71], lIlIIllllI[6]);
        cT = new WorldPoint(lIlIIllllI[72], lIlIIllllI[73], lIlIIllllI[6]);
        cU = new WorldPoint(lIlIIllllI[74], lIlIIllllI[75], lIlIIllllI[6]);
        String[] strArr = new String[lIlIIllllI[1]];
        strArr[lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[76]];
        strArr[lIlIIllllI[5]] = lIlIIlllII[lIlIIllllI[42]];
        strArr[lIlIIllllI[8]] = lIlIIlllII[lIlIIllllI[77]];
        cy = strArr;
        dW = lIlIIllllI[78];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIlllII[lIlIIllllI[66]];
    }

    private static void lIIIlllIIlIll() {
        lIlIIlllII = new String[lIlIIllllI[79]];
        lIlIIlllII[lIlIIllllI[6]] = lIIIlllIIIlIl("LhsILmLed6p97lvu4wp4ulR4WQ27Ehz2Ccaug+XG+2xLHbiUa01w+epFr3twOfGQ", "FJbWs");
        lIlIIlllII[lIlIIllllI[5]] = lIIIlllIIIllI("FBs0TCE1WiANOzE=", "ZzBlU");
        lIlIIlllII[lIlIIllllI[8]] = lIIIlllIIIllI("HTYsFyk8OSVTJzQ5KRorMg==", "UWBsE");
        lIlIIlllII[lIlIIllllI[1]] = lIIIlllIIIlll("QC85FUNAUPOiJu1QTTsVmO0WY3prdT9fP5FjoCjuTsV2oepw6pQEBDCENc+hdmbPP+b5REq+ztA=", "bDaNV");
        lIlIIlllII[lIlIIllllI[9]] = lIIIlllIIIlll("K24RHMrmP25dQRlQYpuzqm/mhnx3kxDYD8+9Z6KVQIQuPUh71FkUoBI9SGL9fqA6KUF7paoxwEA=", "kBKUn");
        lIlIIlllII[lIlIIllllI[3]] = lIIIlllIIIlll("rWOn7B3yyOw=", "zxpkZ");
        lIlIIlllII[lIlIIllllI[18]] = lIIIlllIIIlIl("uQgTtQuaUPI=", "hTtiD");
        lIlIIlllII[lIlIIllllI[20]] = lIIIlllIIIllI("NwcmVyYWRiIRNlkUPxg/", "yfPwR");
        lIlIIlllII[lIlIIllllI[21]] = lIIIlllIIIlll("tDWARvQw6q8=", "nixHV");
        lIlIIlllII[lIlIIllllI[23]] = lIIIlllIIIlll("LCvDQBe4ex0=", "pAVhT");
        lIlIIlllII[lIlIIllllI[4]] = lIIIlllIIIllI("AyIhJyspOA==", "JLRWN");
        lIlIIlllII[lIlIIllllI[2]] = lIIIlllIIIllI("NwcFbAwWRhUtFBUfUzwNGw==", "yfsLx");
        lIlIIlllII[lIlIIllllI[29]] = lIIIlllIIIlIl("RjUhD9TBmwMrujaMTVbY2Q==", "zjrHr");
        lIlIIlllII[lIlIIllllI[30]] = lIIIlllIIIlIl("xZNjBpYCPGQ=", "DzJXM");
        lIlIIlllII[lIlIIllllI[31]] = lIIIlllIIIlIl("rHGUHopWpHZj3HZS6nNMnXiV+8L+zu7T", "uNvKU");
        lIlIIlllII[lIlIIllllI[32]] = lIIIlllIIIllI("LwIhHBkCQywQFBM=", "gcOxu");
        lIlIIlllII[lIlIIllllI[33]] = lIIIlllIIIlIl("MOX885kA/Wehcm1tkpketg==", "uWjMB");
        lIlIIlllII[lIlIIllllI[36]] = lIIIlllIIIlll("gjuorSklZvzXR9RhH3ZSMdKYbWoWFxRQ", "EDygP");
        lIlIIlllII[lIlIIllllI[37]] = lIIIlllIIIlIl("NS9QGUUggk2LbKQmqvrQ5w==", "wdwBw");
        lIlIIlllII[lIlIIllllI[38]] = lIIIlllIIIllI("JSFNAjwAbykaMRYp", "dOmmP");
        lIlIIlllII[lIlIIllllI[34]] = lIIIlllIIIllI("GBYtLyk=", "JyENB");
        lIlIIlllII[lIlIIllllI[39]] = lIIIlllIIIlIl("E3bN+eKMxd8WZZEQr+qheg==", "twmaq");
        lIlIIlllII[lIlIIllllI[40]] = lIIIlllIIIlIl("D+COjKIg2Wk=", "iWUbt");
        lIlIIlllII[lIlIIllllI[43]] = lIIIlllIIIlll("LJccCuBVC9hfMvJxwogioQ==", "SfKcK");
        lIlIIlllII[lIlIIllllI[44]] = lIIIlllIIIlll("pzp4SlPfxPs=", "wAVcD");
        lIlIIlllII[lIlIIllllI[45]] = lIIIlllIIIllI("GD8MKA==", "OZmZq");
        lIlIIlllII[lIlIIllllI[47]] = lIIIlllIIIllI("IgIYHw==", "vcszr");
        lIlIIlllII[lIlIIllllI[48]] = lIIIlllIIIlll("Py8t6LmPXu4=", "USazS");
        lIlIIlllII[lIlIIllllI[49]] = lIIIlllIIIlll("P57nwxPPsjc78DPGjtXPCA==", "HvRUr");
        lIlIIlllII[lIlIIllllI[50]] = lIIIlllIIIllI("FB8NDw8+SxANCTMCHAAI", "Ukynl");
        lIlIIlllII[lIlIIllllI[41]] = lIIIlllIIIlIl("uCfiVqvuWhMtjaqmUKXlXQ==", "ZrpIn");
        lIlIIlllII[lIlIIllllI[51]] = lIIIlllIIIllI("BgIOEBcs", "Gvzqt");
        lIlIIlllII[lIlIIllllI[55]] = lIIIlllIIIlll("02hx4k9m6EE=", "RZFQn");
        lIlIIlllII[lIlIIllllI[56]] = lIIIlllIIIllI("AAsFchYhSgE0Bm4YHD0P", "NjsRb");
        lIlIIlllII[lIlIIllllI[57]] = lIIIlllIIIlll("fv2rZlVZZcE=", "omGCe");
        lIlIIlllII[lIlIIllllI[58]] = lIIIlllIIIlll("ka5qDtfOodKSOQOBJKAJjw==", "zYuDD");
        lIlIIlllII[lIlIIllllI[59]] = lIIIlllIIIlll("mNgYy3osRzY=", "ifCAe");
        lIlIIlllII[lIlIIllllI[66]] = lIIIlllIIIlIl("/kfQ9b5WF4GIl7o6EDuYzg==", "iVlel");
        lIlIIlllII[lIlIIllllI[67]] = lIIIlllIIIlll("UayqD6UWRCJChXE5cstA5kvbNjpWU+X+", "BPpyB");
        lIlIIlllII[lIlIIllllI[76]] = lIIIlllIIIlll("xJxwtRkqByY=", "jKBWx");
        lIlIIlllII[lIlIIllllI[42]] = lIIIlllIIIlIl("NGzzZRBfy7MsL7GTsJF/15FteqXHNX7h0yoAy76vz57LTxOQ/e5gz6O5EMWK6MyB", "Qbcej");
        lIlIIlllII[lIlIIllllI[77]] = lIIIlllIIIlll("PhcYNl83GI/eCaZ28R//m+R1hGkQEuiE8zJ20ZqdXozuUnKTIazgIHwvSBlo5FPimHK0PSz9sMw=", "rLSkI");
    }

    private static String lIIIlllIIIllI(String llllllllllllllllllllIIIIIllIIIll, String llllllllllllllllllllIIIIIllIIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIIIIIllIIIIl = new StringBuilder();
        char[] llllllllllllllllllllIIIIIllIIIII = llllllllllllllllllllIIIIIllIIIlI.toCharArray();
        int llllllllllllllllllllIIIIIlIlllll = lIlIIllllI[6];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIllllI[6];
        while (lIIIlllIIllIl(i, length)) {
            llllllllllllllllllllIIIIIllIIIIl.append((char) (charArray[i] ^ llllllllllllllllllllIIIIIllIIIII[llllllllllllllllllllIIIIIlIlllll % llllllllllllllllllllIIIIIllIIIII.length]));
            "".length();
            llllllllllllllllllllIIIIIlIlllll++;
            i++;
            "".length();
            if (((((94 + 60) - 113) + 88) ^ (((22 + 39) - (-58)) + 14)) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllIIIIIllIIIIl);
    }

    private static boolean lIIIlllIlIlll(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIlllIIIlll(String llllllllllllllllllllIIIIIlIIlllI, String llllllllllllllllllllIIIIIlIIllIl) {
        try {
            SecretKeySpec llllllllllllllllllllIIIIIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIIIIIlIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIIIIIlIlIIII.init(lIlIIllllI[8], llllllllllllllllllllIIIIIlIlIIIl);
            return new String(llllllllllllllllllllIIIIIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIIIIlIIllll) {
            llllllllllllllllllllIIIIIlIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlllIIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlllIIllII() {
        lIlIIllllI = new int[80];
        lIlIIllllI[0] = (-((-8706) & 29531)) & (-2049) & 23551;
        lIlIIllllI[1] = "   ".length();
        lIlIIllllI[2] = (25 ^ 8) ^ (131 ^ 153);
        lIlIIllllI[3] = (124 ^ 44) ^ (147 ^ 198);
        lIlIIllllI[4] = (((99 + 141) - 232) + 142) ^ (((14 + 89) - 46) + 99);
        lIlIIllllI[5] = " ".length();
        lIlIIllllI[6] = ((163 ^ 152) ^ (87 ^ 118)) & (((110 ^ 36) ^ (108 ^ 60)) ^ (-" ".length()));
        lIlIIllllI[7] = (-((-257) & 26997)) & (-1025) & 32764;
        lIlIIllllI[8] = "  ".length();
        lIlIIllllI[9] = 75 ^ 79;
        lIlIIllllI[10] = (-18447) & 20351;
        lIlIIllllI[11] = (-19077) & 31701;
        lIlIIllllI[12] = (-((-5273) & 29855)) & (-145) & 32735;
        lIlIIllllI[13] = (-((-803) & 17323)) & (-8241) & 32767;
        lIlIIllllI[14] = (-55) & 8062;
        lIlIIllllI[15] = (-12409) & 14335;
        lIlIIllllI[16] = (-((-7337) & 15595)) & (-6145) & 16335;
        lIlIIllllI[17] = (-((-7299) & 15594)) & (-20481) & 30719;
        lIlIIllllI[18] = 43 ^ 45;
        lIlIIllllI[19] = (-((-18435) & 30811)) & (-18469) & 32765;
        lIlIIllllI[20] = 108 ^ 107;
        lIlIIllllI[21] = (242 ^ 142) ^ (108 ^ 24);
        lIlIIllllI[22] = (-31189) & 32247;
        lIlIIllllI[23] = 118 ^ 127;
        lIlIIllllI[24] = (-((-523) & 28303)) & (-4097) & 32255;
        lIlIIllllI[25] = (-((-1147) & 12027)) & (-20493) & 32703;
        lIlIIllllI[26] = (-1049) & 2043;
        lIlIIllllI[27] = 246 ^ 196;
        lIlIIllllI[28] = (-4245) & 6135;
        lIlIIllllI[29] = (((72 + 68) - 26) + 89) ^ (((157 + 123) - 204) + 123);
        lIlIIllllI[30] = (14 ^ 40) ^ (232 ^ 195);
        lIlIIllllI[31] = (215 ^ 164) ^ (210 ^ 175);
        lIlIIllllI[32] = (109 ^ 105) ^ (165 ^ 174);
        lIlIIllllI[33] = (25 ^ 62) ^ (88 ^ 111);
        lIlIIllllI[34] = 124 ^ 104;
        lIlIIllllI[35] = (-22529) & 24511;
        lIlIIllllI[36] = (232 ^ 140) ^ (83 ^ 38);
        lIlIIllllI[37] = 36 ^ 54;
        lIlIIllllI[38] = 47 ^ 60;
        lIlIIllllI[39] = 45 ^ 56;
        lIlIIllllI[40] = 147 ^ 133;
        lIlIIllllI[41] = 92 ^ 66;
        lIlIIllllI[42] = (15 ^ 120) ^ (127 ^ 32);
        lIlIIllllI[43] = 145 ^ 134;
        lIlIIllllI[44] = 124 ^ 100;
        lIlIIllllI[45] = (251 ^ 176) ^ (193 ^ 147);
        lIlIIllllI[46] = (-((-6933) & 31551)) & (-129) & 32255;
        lIlIIllllI[47] = (((83 + 93) - 175) + 148) ^ (((16 + 90) - 64) + 101);
        lIlIIllllI[48] = (21 ^ 55) ^ (116 ^ 77);
        lIlIIllllI[49] = (((27 + 145) - 111) + 122) ^ (((31 + 38) - (-3)) + 99);
        lIlIIllllI[50] = (((107 + 91) - 167) + 111) ^ (((27 + 144) - 143) + 119);
        lIlIIllllI[51] = (((63 + 78) - 133) + 119) ^ (26 ^ 122);
        lIlIIllllI[52] = (-16898) & 24407;
        lIlIIllllI[53] = (-((-3714) & 32451)) & (-41) & 31983;
        lIlIIllllI[54] = (-29215) & 32638;
        lIlIIllllI[55] = (((142 + 33) - 126) + 115) ^ (((41 + 0) - (-4)) + 87);
        lIlIIllllI[56] = (((88 + 35) - 28) + 76) ^ (((10 + 83) - (-23)) + 22);
        lIlIIllllI[57] = 68 ^ 102;
        lIlIIllllI[58] = 187 ^ 152;
        lIlIIllllI[59] = (((160 + 21) - 80) + 70) ^ (((72 + 95) - 146) + 122);
        lIlIIllllI[60] = (-((-6934) & 23517)) & (-4097) & 29679;
        lIlIIllllI[61] = (-((-28585) & 32702)) & (-16451) & 24567;
        lIlIIllllI[62] = (-16516) & 18415;
        lIlIIllllI[63] = (-((-3213) & 3471)) & (-18) & 12255;
        lIlIIllllI[64] = (-((-26641) & 32341)) & (-2052) & 32751;
        lIlIIllllI[65] = (122 ^ 116) ^ (118 ^ 28);
        lIlIIllllI[66] = (((7 + 30) - (-80)) + 16) ^ (((77 + 92) - 145) + 136);
        lIlIIllllI[67] = (110 ^ 28) ^ (6 ^ 82);
        lIlIIllllI[68] = (-((-11589) & 28501)) & (-12361) & 32479;
        lIlIIllllI[69] = (-((-7258) & 32379)) & (-265) & 28607;
        lIlIIllllI[70] = (-25633) & 28589;
        lIlIIllllI[71] = (-((-22577) & 31347)) & (-17) & 12158;
        lIlIIllllI[72] = (-(74 ^ 67)) & (-28807) & 31679;
        lIlIIllllI[73] = (-((-25713) & 32115)) & (-9) & 16287;
        lIlIIllllI[74] = (-17423) & 20431;
        lIlIIllllI[75] = (-8233) & 11705;
        lIlIIllllI[76] = (68 ^ 103) ^ (153 ^ 157);
        lIlIIllllI[77] = 140 ^ 165;
        lIlIIllllI[78] = (-17495) & 18175;
        lIlIIllllI[79] = 123 ^ 81;
    }

    private static boolean lIIIlllIlIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlllIlIIlI(Object obj) {
        return obj != null;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            bD();
            "".length();
            if ((-"   ".length()) >= 0) {
                return (54 ^ 13) & ((154 ^ 161) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIIllllI[65];
    }

    private static boolean lIIIlllIIllll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0173, code lost:
        if (lIIIlllIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[9]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0316, code lost:
        if (lIIIlllIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03a0, code lost:
        if (lIIIlllIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[4]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (lIIIlllIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[3]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11 = new int[lIlIIllllI[5]];
        iArr11[lIlIIllllI[6]] = lIlIIllllI[11];
        if (lIIIlllIlIIII(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIlIIllllI[5]];
            iArr12[lIlIIllllI[6]] = lIlIIllllI[11];
            if (lIIIlllIlIIII(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIlIIllllI[5]];
                iArr13[lIlIIllllI[6]] = lIlIIllllI[11];
            }
            iArr = new int[lIlIIllllI[5]];
            iArr[lIlIIllllI[6]] = lIlIIllllI[25];
            if (lIIIlllIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllllI[25], lIlIIllllI[5], lIlIIllllI[60]));
                "".length();
            }
            iArr2 = new int[lIlIIllllI[5]];
            iArr2[lIlIIllllI[6]] = lIlIIllllI[22];
            if (lIIIlllIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllllI[22], lIlIIllllI[5], lIlIIllllI[60]));
                "".length();
            }
            iArr3 = new int[lIlIIllllI[5]];
            iArr3[lIlIIllllI[6]] = lIlIIllllI[10];
            if (lIIIlllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr14 = new int[lIlIIllllI[5]];
                iArr14[lIlIIllllI[6]] = lIlIIllllI[10];
                if (lIIIlllIlIIII(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlIIllllI[5]];
                    iArr15[lIlIIllllI[6]] = lIlIIllllI[10];
                }
                iArr4 = new int[lIlIIllllI[5]];
                iArr4[lIlIIllllI[6]] = lIlIIllllI[19];
                if (lIIIlllIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIllllI[19], lIlIIllllI[5], lIlIIllllI[60]));
                    "".length();
                }
                iArr5 = new int[lIlIIllllI[5]];
                iArr5[lIlIIllllI[6]] = lIlIIllllI[17];
                if (lIIIlllIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIllllI[17], lIlIIllllI[5], lIlIIllllI[60]));
                    "".length();
                }
                iArr6 = new int[lIlIIllllI[5]];
                iArr6[lIlIIllllI[6]] = lIlIIllllI[15];
                if (lIIIlllIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIllllI[15], lIlIIllllI[5], lIlIIllllI[60]));
                    "".length();
                }
                iArr7 = new int[lIlIIllllI[5]];
                iArr7[lIlIIllllI[6]] = lIlIIllllI[16];
                if (lIIIlllIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIllllI[16], lIlIIllllI[5], lIlIIllllI[60]));
                    "".length();
                }
                iArr8 = new int[lIlIIllllI[5]];
                iArr8[lIlIIllllI[6]] = lIlIIllllI[14];
                if (lIIIlllIlIIII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr16 = new int[lIlIIllllI[5]];
                    iArr16[lIlIIllllI[6]] = lIlIIllllI[14];
                    if (lIIIlllIlIIII(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIlIIllllI[5]];
                        iArr17[lIlIIllllI[6]] = lIlIIllllI[14];
                    }
                    iArr9 = new int[lIlIIllllI[5]];
                    iArr9[lIlIIllllI[6]] = lIlIIllllI[12];
                    if (lIIIlllIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
                        int[] iArr18 = new int[lIlIIllllI[5]];
                        iArr18[lIlIIllllI[6]] = lIlIIllllI[12];
                        if (lIIIlllIlIIII(Bank.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[lIlIIllllI[5]];
                            iArr19[lIlIIllllI[6]] = lIlIIllllI[12];
                        }
                        if (lIIIlllIlIIIl(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(lIlIIlllII[lIlIIllllI[67]]);
                        }) ? 1 : 0)) {
                            bp.add(new C0003d(lIlIIllllI[63], lIlIIllllI[3], lIlIIllllI[64]));
                            "".length();
                        }
                        iArr10 = new int[lIlIIllllI[5]];
                        iArr10[lIlIIllllI[6]] = lIlIIllllI[13];
                        if (lIIIlllIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                            bp.add(new C0003d(lIlIIllllI[13], lIlIIllllI[42], lIlIIllllI[62]));
                            "".length();
                            return;
                        }
                        return;
                    }
                    bp.add(new C0003d(lIlIIllllI[12], lIlIIllllI[4], lIlIIllllI[62]));
                    "".length();
                    if (lIIIlllIlIIIl(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(lIlIIlllII[lIlIIllllI[67]]);
                    }) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIlIIllllI[5]];
                    iArr10[lIlIIllllI[6]] = lIlIIllllI[13];
                    if (lIIIlllIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                }
                bp.add(new C0003d(lIlIIllllI[14], lIlIIllllI[4], lIlIIllllI[62]));
                "".length();
                iArr9 = new int[lIlIIllllI[5]];
                iArr9[lIlIIllllI[6]] = lIlIIllllI[12];
                if (lIIIlllIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bp.add(new C0003d(lIlIIllllI[12], lIlIIllllI[4], lIlIIllllI[62]));
                "".length();
                if (lIIIlllIlIIIl(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(lIlIIlllII[lIlIIllllI[67]]);
                }) ? 1 : 0)) {
                }
                iArr10 = new int[lIlIIllllI[5]];
                iArr10[lIlIIllllI[6]] = lIlIIllllI[13];
                if (lIIIlllIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                }
            }
            bp.add(new C0003d(lIlIIllllI[10], lIlIIllllI[9], lIlIIllllI[61]));
            "".length();
            iArr4 = new int[lIlIIllllI[5]];
            iArr4[lIlIIllllI[6]] = lIlIIllllI[19];
            if (lIIIlllIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIlIIllllI[5]];
            iArr5[lIlIIllllI[6]] = lIlIIllllI[17];
            if (lIIIlllIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIlIIllllI[5]];
            iArr6[lIlIIllllI[6]] = lIlIIllllI[15];
            if (lIIIlllIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIlIIllllI[5]];
            iArr7[lIlIIllllI[6]] = lIlIIllllI[16];
            if (lIIIlllIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIlIIllllI[5]];
            iArr8[lIlIIllllI[6]] = lIlIIllllI[14];
            if (lIIIlllIlIIII(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bp.add(new C0003d(lIlIIllllI[14], lIlIIllllI[4], lIlIIllllI[62]));
            "".length();
            iArr9 = new int[lIlIIllllI[5]];
            iArr9[lIlIIllllI[6]] = lIlIIllllI[12];
            if (lIIIlllIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bp.add(new C0003d(lIlIIllllI[12], lIlIIllllI[4], lIlIIllllI[62]));
            "".length();
            if (lIIIlllIlIIIl(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(lIlIIlllII[lIlIIllllI[67]]);
            }) ? 1 : 0)) {
            }
            iArr10 = new int[lIlIIllllI[5]];
            iArr10[lIlIIllllI[6]] = lIlIIllllI[13];
            if (lIIIlllIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
            }
        }
        bp.add(new C0003d(lIlIIllllI[11], lIlIIllllI[3], C0009j.bZ));
        "".length();
        iArr = new int[lIlIIllllI[5]];
        iArr[lIlIIllllI[6]] = lIlIIllllI[25];
        if (lIIIlllIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIlIIllllI[5]];
        iArr2[lIlIIllllI[6]] = lIlIIllllI[22];
        if (lIIIlllIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlIIllllI[5]];
        iArr3[lIlIIllllI[6]] = lIlIIllllI[10];
        if (lIIIlllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIIllllI[10], lIlIIllllI[9], lIlIIllllI[61]));
        "".length();
        iArr4 = new int[lIlIIllllI[5]];
        iArr4[lIlIIllllI[6]] = lIlIIllllI[19];
        if (lIIIlllIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIlIIllllI[5]];
        iArr5[lIlIIllllI[6]] = lIlIIllllI[17];
        if (lIIIlllIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIlIIllllI[5]];
        iArr6[lIlIIllllI[6]] = lIlIIllllI[15];
        if (lIIIlllIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIlIIllllI[5]];
        iArr7[lIlIIllllI[6]] = lIlIIllllI[16];
        if (lIIIlllIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIlIIllllI[5]];
        iArr8[lIlIIllllI[6]] = lIlIIllllI[14];
        if (lIIIlllIlIIII(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIIllllI[14], lIlIIllllI[4], lIlIIllllI[62]));
        "".length();
        iArr9 = new int[lIlIIllllI[5]];
        iArr9[lIlIIllllI[6]] = lIlIIllllI[12];
        if (lIIIlllIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIIllllI[12], lIlIIllllI[4], lIlIIllllI[62]));
        "".length();
        if (lIIIlllIlIIIl(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(lIlIIlllII[lIlIIllllI[67]]);
        }) ? 1 : 0)) {
        }
        iArr10 = new int[lIlIIllllI[5]];
        iArr10[lIlIIllllI[6]] = lIlIIllllI[13];
        if (lIIIlllIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
        }
    }

    private static String lIIIlllIIIlIl(String llllllllllllllllllllIIIIIlllIIll, String llllllllllllllllllllIIIIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIllllI[21]), "DES");
            Cipher llllllllllllllllllllIIIIIlllIlIl = Cipher.getInstance("DES");
            llllllllllllllllllllIIIIIlllIlIl.init(lIlIIllllI[8], secretKeySpec);
            return new String(llllllllllllllllllllIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIIIIlllIlII) {
            llllllllllllllllllllIIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIlllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b28, code lost:
        if (lIIIlllIlIIlI(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0b40, code lost:
        if (lIIIlllIlIlll(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[41]) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0b43, code lost:
        gg.squire.account.AccBuilderShamans.c = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIlllII[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[56]];
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.A.bG();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b53, code lost:
        r0 = new java.lang.String[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[5]];
        r0[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[6]] = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIlllII[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[57]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0b73, code lost:
        if (lIIIlllIlIIlI(net.unethicalite.api.entities.NPCs.getNearest(r0)) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0b7c, code lost:
        if (lIIIlllIlIIIl(net.unethicalite.api.widgets.Dialog.isOpen() ? 1 : 0) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b7f, code lost:
        gg.squire.account.AccBuilderShamans.c = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIlllII[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[58]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0b97, code lost:
        if (lIIIlllIIllIl(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.dc, h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[5]) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0b9a, code lost:
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Z.mK += h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[5];
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Z.p(gg.squire.account.AccBuilderShamans.m);
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.dc += h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[5];
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Z.mK = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[6];
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.dd = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0bca, code lost:
        r0 = new int[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[5]];
        r0[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[6]] = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[52];
        r0 = net.unethicalite.api.items.Inventory.getFirst(r0);
        r1 = new java.lang.String[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[5]];
        r1[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[6]] = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIlllII[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[59]];
        r0.useOn(net.unethicalite.api.entities.TileObjects.getNearest(r1));
        net.unethicalite.api.commons.Time.sleepTicks(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0c10, code lost:
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0006g.a(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.cy);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0c16, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d6, code lost:
        if (lIIIlllIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[9]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021a, code lost:
        if (lIIIlllIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[3]) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025e, code lost:
        if (lIIIlllIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[4]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0261, code lost:
        O();
        java.lang.System.out.println(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIlllII[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[1]]);
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.bn = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0025z.lIlIIllllI[5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v414, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v442, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bD() {
        if (lIIIlllIIllIl(C0004e.j(lIlIIllllI[0]), lIlIIllllI[1])) {
            A.bF();
        }
        if (lIIIlllIIlllI(C0004e.j(lIlIIllllI[0]), lIlIIllllI[1]) && lIIIlllIIllIl(C0004e.j(lIlIIllllI[2]), lIlIIllllI[3])) {
            C0022w.bi();
        }
        if (!lIIIlllIIlllI(Skills.getLevel(Skill.COOKING), lIlIIllllI[4]) || !lIIIlllIIlllI(C0004e.j(lIlIIllllI[0]), lIlIIllllI[1]) || !lIIIlllIIllll(C0004e.j(lIlIIllllI[2]), lIlIIllllI[3])) {
            return;
        }
        if (lIIIlllIlIIII(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIIlllIIllIl(bp.size(), lIlIIllllI[5])) {
                System.out.println(lIlIIlllII[lIlIIllllI[6]]);
                bn = lIlIIllllI[6];
            }
        }
        if (!lIIIlllIlIIIl(bn ? 1 : 0)) {
            return;
        }
        if (lIIIlllIlIIIl(al() ? 1 : 0) && lIIIlllIlIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIIIlllIlIIlI(nearest) && lIIIlllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[5]];
                C0000a.a(nearest);
            }
            if (lIIIlllIlIIlI(nearest) && lIIIlllIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIIIlllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlIIllllI[7]);
                    "".length();
                }
                if (lIIIlllIlIIII(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[8]];
                    if (lIIIlllIlIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIlIIllllI[9]);
                        "".length();
                    }
                    if (lIIIlllIlIIll(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIlIIllllI[8]);
                        "".length();
                    }
                    int[] iArr = new int[lIlIIllllI[5]];
                    iArr[lIlIIllllI[6]] = lIlIIllllI[10];
                    if (lIIIlllIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIlIIllllI[5]];
                        iArr2[lIlIIllllI[6]] = lIlIIllllI[10];
                    }
                    int[] iArr3 = new int[lIlIIllllI[5]];
                    iArr3[lIlIIllllI[6]] = lIlIIllllI[11];
                    if (lIIIlllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIIllllI[5]];
                        iArr4[lIlIIllllI[6]] = lIlIIllllI[11];
                    }
                    int[] iArr5 = new int[lIlIIllllI[5]];
                    iArr5[lIlIIllllI[6]] = lIlIIllllI[12];
                    if (lIIIlllIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIlIIllllI[5]];
                        iArr6[lIlIIllllI[6]] = lIlIIllllI[12];
                    }
                    int[] iArr7 = new int[lIlIIllllI[2]];
                    iArr7[lIlIIllllI[6]] = lIlIIllllI[13];
                    iArr7[lIlIIllllI[5]] = lIlIIllllI[14];
                    iArr7[lIlIIllllI[8]] = lIlIIllllI[12];
                    iArr7[lIlIIllllI[1]] = lIlIIllllI[15];
                    iArr7[lIlIIllllI[9]] = lIlIIllllI[16];
                    iArr7[lIlIIllllI[3]] = lIlIIllllI[17];
                    iArr7[lIlIIllllI[18]] = lIlIIllllI[19];
                    iArr7[lIlIIllllI[20]] = lIlIIllllI[10];
                    iArr7[lIlIIllllI[21]] = lIlIIllllI[22];
                    iArr7[lIlIIllllI[23]] = lIlIIllllI[24];
                    iArr7[lIlIIllllI[4]] = lIlIIllllI[25];
                    if (lIIIlllIlIIIl(C0004e.b(iArr7) ? 1 : 0)) {
                        O();
                        System.out.println(lIlIIlllII[lIlIIllllI[9]]);
                        bn = lIlIIllllI[5];
                        return;
                    }
                    int[] iArr8 = new int[lIlIIllllI[2]];
                    iArr8[lIlIIllllI[6]] = lIlIIllllI[13];
                    iArr8[lIlIIllllI[5]] = lIlIIllllI[14];
                    iArr8[lIlIIllllI[8]] = lIlIIllllI[12];
                    iArr8[lIlIIllllI[1]] = lIlIIllllI[15];
                    iArr8[lIlIIllllI[9]] = lIlIIllllI[16];
                    iArr8[lIlIIllllI[3]] = lIlIIllllI[17];
                    iArr8[lIlIIllllI[18]] = lIlIIllllI[19];
                    iArr8[lIlIIllllI[20]] = lIlIIllllI[10];
                    iArr8[lIlIIllllI[21]] = lIlIIllllI[22];
                    iArr8[lIlIIllllI[23]] = lIlIIllllI[24];
                    iArr8[lIlIIllllI[4]] = lIlIIllllI[25];
                    if (lIIIlllIlIIII(C0004e.b(iArr8) ? 1 : 0)) {
                        C0000a.a(lIlIIllllI[13], lIlIIllllI[4]);
                        C0000a.a(lIlIIllllI[14], lIlIIllllI[4]);
                        C0000a.a(lIlIIllllI[12], lIlIIllllI[4]);
                        C0000a.a(lIlIIllllI[15], lIlIIllllI[5]);
                        C0000a.a(lIlIIllllI[16], lIlIIllllI[5]);
                        C0000a.a(lIlIIllllI[17], lIlIIllllI[5]);
                        C0000a.a(lIlIIllllI[19], lIlIIllllI[5]);
                        C0000a.a(lIlIIllllI[10], lIlIIllllI[9]);
                        C0000a.a(lIlIIllllI[22], lIlIIllllI[5]);
                        C0000a.a(lIlIIllllI[25], lIlIIllllI[5]);
                        C0000a.a(lIlIIllllI[24], lIlIIllllI[3]);
                        C0000a.a(lIlIIllllI[11], lIlIIllllI[8]);
                        C0000a.a(lIlIIllllI[26], lIlIIllllI[7]);
                    }
                }
            }
        }
        if (lIIIlllIlIIII(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIIlllIIllIl(Movement.getRunEnergy(), lIlIIllllI[27])) {
            Inventory.getFirst(C0005f.aU).interact(lIlIIlllII[lIlIIllllI[3]]);
            Time.sleepTicks(lIlIIllllI[5]);
            "".length();
        }
        if (lIIIlllIlIIII(al() ? 1 : 0) && lIIIlllIlIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            if (lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cR), lIlIIllllI[9])) {
                String[] strArr = new String[lIlIIllllI[5]];
                strArr[lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[18]];
                if (lIIIlllIlIlIl(NPCs.getNearest(strArr))) {
                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[20]];
                    A.bG();
                }
            }
            String[] strArr2 = new String[lIlIIllllI[5]];
            strArr2[lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[21]];
            if (lIIIlllIlIIlI(NPCs.getNearest(strArr2))) {
                if (lIIIlllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr3 = new String[lIlIIllllI[5]];
                    strArr3[lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[23]];
                    TileObjects.getNearest(strArr3).interact(lIlIIlllII[lIlIIllllI[4]]);
                    Time.sleepTicks(lIlIIllllI[5]);
                    "".length();
                }
                C0006g.a(cy);
            }
        }
        if (lIIIlllIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[4])) {
            if (lIIIlllIlIllI(Vars.getBit(lIlIIllllI[28]), lIlIIllllI[5])) {
                if (lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cS), lIlIIllllI[20])) {
                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[2]];
                    Movement.walkTo(cS);
                    "".length();
                    Time.sleepTicks(lIlIIllllI[5]);
                    "".length();
                }
                if (lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cS), lIlIIllllI[20])) {
                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[29]];
                    C0006g.a(lIlIIlllII[lIlIIllllI[30]], cy);
                }
            }
            if (lIIIlllIIllll(Vars.getBit(lIlIIllllI[28]), lIlIIllllI[5])) {
                int[] iArr9 = new int[lIlIIllllI[5]];
                iArr9[lIlIIllllI[6]] = lIlIIllllI[10];
                if (lIIIlllIlIIII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIllllI[5]];
                    iArr10[lIlIIllllI[6]] = lIlIIllllI[26];
                    Item first = Inventory.getFirst(iArr10);
                    int[] iArr11 = new int[lIlIIllllI[5]];
                    iArr11[lIlIIllllI[6]] = lIlIIllllI[10];
                    first.useOn(Inventory.getFirst(iArr11));
                    Time.sleepTicks(lIlIIllllI[5]);
                    "".length();
                }
                int[] iArr12 = new int[lIlIIllllI[5]];
                iArr12[lIlIIllllI[6]] = lIlIIllllI[10];
                if (lIIIlllIlIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    if (lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                        AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[31]];
                        Movement.walkTo(cT);
                        "".length();
                        Time.sleepTicks(lIlIIllllI[5]);
                        "".length();
                    }
                    if (lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                        AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[32]];
                        C0006g.a(lIlIIlllII[lIlIIllllI[33]], cy);
                    }
                }
            }
        }
        if (lIIIlllIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[34])) {
            if (lIIIlllIlIllI(Vars.getBit(lIlIIllllI[35]), lIlIIllllI[9])) {
                dc = lIlIIllllI[6];
                if (lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[36]];
                    Movement.walkTo(cT);
                    "".length();
                    Time.sleepTicks(lIlIIllllI[5]);
                    "".length();
                }
                if (lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[37]];
                    C0006g.a(lIlIIlllII[lIlIIllllI[38]], cy);
                    C0006g.a(lIlIIlllII[lIlIIllllI[34]], cy);
                }
            }
            if (lIIIlllIIllll(Vars.getBit(lIlIIllllI[35]), lIlIIllllI[9])) {
                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[39]];
                C0006g.a(lIlIIlllII[lIlIIllllI[40]], cy);
            }
        }
        if (!lIIIlllIlIllI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[41]) || lIIIlllIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[42])) {
            AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[43]];
            C0006g.a(lIlIIlllII[lIlIIllllI[44]], cy);
        }
        if (!lIIIlllIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[27])) {
            return;
        }
        int[] iArr13 = new int[lIlIIllllI[5]];
        iArr13[lIlIIllllI[6]] = lIlIIllllI[22];
        if (lIIIlllIlIIIl(Equipment.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIlIIllllI[5]];
            iArr14[lIlIIllllI[6]] = lIlIIllllI[22];
            if (lIIIlllIlIIII(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlIIllllI[5]];
                iArr15[lIlIIllllI[6]] = lIlIIllllI[22];
                Inventory.getFirst(iArr15).interact(lIlIIlllII[lIlIIllllI[45]]);
                Time.sleepTicks(lIlIIllllI[5]);
                "".length();
            }
        }
        int[] iArr16 = new int[lIlIIllllI[5]];
        iArr16[lIlIIllllI[6]] = lIlIIllllI[22];
        if (lIIIlllIlIIII(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lIlIIllllI[5]];
            iArr17[lIlIIllllI[6]] = lIlIIllllI[46];
            if (lIIIlllIlIIlI(TileItems.getNearest(iArr17))) {
                int[] iArr18 = new int[lIlIIllllI[5]];
                iArr18[lIlIIllllI[6]] = lIlIIllllI[46];
                TileItems.getNearest(iArr18).interact(lIlIIlllII[lIlIIllllI[47]]);
                Time.sleepTicks(lIlIIllllI[5]);
                "".length();
            }
        }
        int[] iArr19 = new int[lIlIIllllI[5]];
        iArr19[lIlIIllllI[6]] = lIlIIllllI[46];
        if (lIIIlllIlIIII(Inventory.contains(iArr19) ? 1 : 0)) {
            int[] iArr20 = new int[lIlIIllllI[5]];
            iArr20[lIlIIllllI[6]] = lIlIIllllI[25];
            if (lIIIlllIlIIII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlIIllllI[5]];
                iArr21[lIlIIllllI[6]] = lIlIIllllI[25];
                if (lIIIlllIlIIIl(Equipment.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIIllllI[5]];
                    iArr22[lIlIIllllI[6]] = lIlIIllllI[25];
                    Inventory.getFirst(iArr22).interact(lIlIIlllII[lIlIIllllI[48]]);
                    Time.sleepTicks(lIlIIllllI[5]);
                    "".length();
                }
            }
            if (lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cU), lIlIIllllI[18])) {
                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[49]];
                Movement.walkTo(cU);
                "".length();
                Time.sleepTicks(lIlIIllllI[5]);
                "".length();
            }
            if (lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cU), lIlIIllllI[18])) {
                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[50]];
                if (lIIIlllIlIlIl(Players.getLocal().getInteracting())) {
                    String[] strArr4 = new String[lIlIIllllI[5]];
                    strArr4[lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[41]];
                    NPCs.getNearest(strArr4).interact(lIlIIlllII[lIlIIllllI[51]]);
                    Time.sleepTicks(lIlIIllllI[1]);
                    "".length();
                }
            }
        }
        int[] iArr23 = new int[lIlIIllllI[5]];
        iArr23[lIlIIllllI[6]] = lIlIIllllI[52];
        if (!lIIIlllIlIIII(Inventory.contains(iArr23) ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIlIIllllI[53], lIlIIllllI[54], lIlIIllllI[6]);
        if (lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cR), lIlIIllllI[9])) {
            String[] strArr5 = new String[lIlIIllllI[5]];
            strArr5[lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[55]];
        }
    }

    private static boolean lIIIlllIlIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean al() {
        int[] iArr = new int[lIlIIllllI[5]];
        iArr[lIlIIllllI[6]] = lIlIIllllI[25];
        if (lIIIlllIlIIll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIlIIllllI[5]];
            iArr2[lIlIIllllI[6]] = lIlIIllllI[16];
            if (lIIIlllIlIIll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIlIIllllI[5]];
                iArr3[lIlIIllllI[6]] = lIlIIllllI[17];
                if (lIIIlllIlIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIlIIllllI[5]];
                    iArr4[lIlIIllllI[6]] = lIlIIllllI[19];
                    if (lIIIlllIlIIII(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIIllllI[5]];
                        iArr5[lIlIIllllI[6]] = lIlIIllllI[10];
                        if (lIIIlllIlIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIlIIllllI[5]];
                            iArr6[lIlIIllllI[6]] = lIlIIllllI[22];
                            if (lIIIlllIlIIII(Inventory.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lIlIIllllI[5]];
                                iArr7[lIlIIllllI[6]] = lIlIIllllI[26];
                                if (lIIIlllIlIIII(Inventory.contains(iArr7) ? 1 : 0)) {
                                    ?? r0 = lIlIIllllI[5];
                                    "".length();
                                    return ((51 ^ 96) ^ (17 ^ 70)) < 0 ? ((57 ^ 83) ^ (116 ^ 78)) & (((125 ^ 14) ^ (9 ^ 42)) ^ (-" ".length())) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return lIlIIllllI[6];
    }
}
