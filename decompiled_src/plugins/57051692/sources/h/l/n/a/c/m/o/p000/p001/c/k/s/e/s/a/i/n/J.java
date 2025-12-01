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
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.J  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/J.class */
public class J implements K {
    public static /* synthetic */ List<C0003d> bp;
    private static final /* synthetic */ WorldPoint jl;
    private static final /* synthetic */ WorldPoint jn;
    static /* synthetic */ int cA;
    public static /* synthetic */ long g;
    public static final /* synthetic */ String[] jk;
    private static final /* synthetic */ WorldPoint jo;
    private static final /* synthetic */ WorldPoint jp;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ int dc;
    private static final /* synthetic */ WorldPoint jm;
    private static /* synthetic */ String[] lIlIIIIIIl;
    private static /* synthetic */ int[] lIlIIIIIlI;
    private static final /* synthetic */ WorldPoint jq;
    static /* synthetic */ boolean dd;

    private static void lIIIIllllIllI() {
        lIlIIIIIIl = new String[lIlIIIIIlI[88]];
        lIlIIIIIIl[lIlIIIIIlI[0]] = lIIIIllllIIll("W3K3Ezn0zcS7ukGJc4+cpw==", "WIZMZ");
        lIlIIIIIIl[lIlIIIIIlI[1]] = lIIIIllllIlII("EhM5GzQ8HzNSJSEDPhwgdBMjFyonVncBMD0ONBouOh13ECY3EXcGKHQLIhc0IA==", "TzWrG");
        lIlIIIIIIl[lIlIIIIIlI[3]] = lIIIIllllIlIl("ekSH9I4jXyw=", "yVtkl");
        lIlIIIIIIl[lIlIIIIIlI[5]] = lIIIIllllIIll("+ieUGOuUs5k=", "osUdO");
        lIlIIIIIIl[lIlIIIIIlI[6]] = lIIIIllllIlII("FC83RwQ1biMGHjE=", "ZNAgp");
        lIlIIIIIIl[lIlIIIIIlI[7]] = lIIIIllllIIll("VMj99nE/ieRag2XxC0mMVl0FqhtDYXfx", "pttCF");
        lIlIIIIIIl[lIlIIIIIlI[9]] = lIIIIllllIlII("BgtUJCg0ThksKSIHGiJ6IBsRNi5xHQE1Kj0HETZ2cR0DLC4yBh0rPXEaG2UYBDc9Cx0=", "QntEZ");
        lIlIIIIIIl[lIlIIIIIlI[17]] = lIIIIllllIlII("PwIRcSAeQxQlNQMX", "qcgQT");
        lIlIIIIIIl[lIlIIIIIlI[18]] = lIIIIllllIIll("Jg0zxVMil70IRjtYXlc7xA==", "kiPDm");
        lIlIIIIIIl[lIlIIIIIlI[19]] = lIIIIllllIlIl("KNW8F270yFg=", "yhLVw");
        lIlIIIIIIl[lIlIIIIIlI[15]] = lIIIIllllIIll("4r/jHKuLVrw=", "KUUgQ");
        lIlIIIIIIl[lIlIIIIIlI[20]] = lIIIIllllIlII("JRMiBQEEEyJEARITKAge", "qaGdr");
        lIlIIIIIIl[lIlIIIIIlI[21]] = lIIIIllllIIll("5r+4E8PPA9U=", "aOPRk");
        lIlIIIIIIl[lIlIIIIIlI[22]] = lIIIIllllIlII("IwwrFQ==", "tiJgb");
        lIlIIIIIIl[lIlIIIIIlI[23]] = lIIIIllllIIll("OKsD+pXFoOEOvaGFIqe9gw==", "BaXwY");
        lIlIIIIIIl[lIlIIIIIlI[24]] = lIIIIllllIlIl("GvOdi2RzlcY=", "Nhosm");
        lIlIIIIIIl[lIlIIIIIlI[25]] = lIIIIllllIlII("Ly0w", "kDWcE");
        lIlIIIIIIl[lIlIIIIIlI[26]] = lIIIIllllIlIl("ef2QIx0Lsi+jwm20RC0gjg==", "TYxql");
        lIlIIIIIIl[lIlIIIIIlI[27]] = lIIIIllllIlII("Fxg0NB8=", "DhUPz");
        lIlIIIIIIl[lIlIIIIIlI[28]] = lIIIIllllIlII("KRkP", "mpheY");
        lIlIIIIIIl[lIlIIIIIlI[29]] = lIIIIllllIlII("DQc3ZxksRiUuCmNV", "CfAGm");
        lIlIIIIIIl[lIlIIIIIlI[30]] = lIIIIllllIlIl("GOHRjKOEmIM=", "NTocy");
        lIlIIIIIIl[lIlIIIIIlI[31]] = lIIIIllllIlIl("ctsk/cgYN7Y=", "rtloQ");
        lIlIIIIIIl[lIlIIIIIlI[32]] = lIIIIllllIlIl("kko4QLj8x+MLOx6OridqKg==", "JLqUS");
        lIlIIIIIIl[lIlIIIIIlI[33]] = lIIIIllllIlIl("APaBwszuTj4=", "TodJf");
        lIlIIIIIIl[lIlIIIIIlI[34]] = lIIIIllllIIll("WoWsy3sIq6w=", "FeRZX");
        lIlIIIIIIl[lIlIIIIIlI[35]] = lIIIIllllIlII("LQ8SbiIMThIrORBOAic4Ch0M", "cndNV");
        lIlIIIIIIl[lIlIIIIIlI[36]] = lIIIIllllIIll("EvvFkRsbCD42ZV4Vxkg+JA==", "iimKd");
        lIlIIIIIIl[lIlIIIIIlI[37]] = lIIIIllllIlIl("C/JtzqYdNM0=", "HWsMH");
        lIlIIIIIIl[lIlIIIIIlI[40]] = lIIIIllllIIll("TFPMHpZ5F+S1vVDKmMXThg==", "YfqkV");
        lIlIIIIIIl[lIlIIIIIlI[41]] = lIIIIllllIIll("RuEXEYk/H7k=", "JZppy");
        lIlIIIIIIl[lIlIIIIIlI[42]] = lIIIIllllIlIl("MRhRdLePp73ZwU5d/vHj1gdKYn1vqtzU", "qZXJP");
        lIlIIIIIIl[lIlIIIIIlI[43]] = lIIIIllllIlII("Pj8SPgYf", "mSsGc");
        lIlIIIIIIl[lIlIIIIIlI[44]] = lIIIIllllIlII("IT0rICwQPw==", "bREFE");
        lIlIIIIIIl[lIlIIIIIlI[45]] = lIIIIllllIlIl("43gjGXBNN84=", "WeIap");
        lIlIIIIIIl[lIlIIIIIlI[55]] = lIIIIllllIIll("eydP6i/NCI/OwFJbXArNX8ZsFjPoqmrO", "DZGRn");
        lIlIIIIIIl[lIlIIIIIlI[56]] = lIIIIllllIlII("Pjk3LnkjNnk+PC08LSF5ZA==", "LPYIY");
        lIlIIIIIIl[lIlIIIIIlI[57]] = lIIIIllllIIll("K9d+YxPD36A=", "Vkcav");
        lIlIIIIIIl[lIlIIIIIlI[58]] = lIIIIllllIIll("5XF231hSR/g=", "xwZYU");
        lIlIIIIIIl[lIlIIIIIlI[59]] = lIIIIllllIlII("LwopOjAw", "XoHVD");
        lIlIIIIIIl[lIlIIIIIlI[53]] = lIIIIllllIlII("HRo/Fy0=", "zvPeT");
        lIlIIIIIIl[lIlIIIIIlI[60]] = lIIIIllllIlIl("cnk/ZrlYlGs=", "RcCSm");
        lIlIIIIIIl[lIlIIIIIlI[61]] = lIIIIllllIIll("eKJZRVVZ2Sk=", "tzFVM");
        lIlIIIIIIl[lIlIIIIIlI[62]] = lIIIIllllIlII("OxxaSRFTGlYcKFQRGRt4FRlWCDwCEhgdLQYSWA==", "twviX");
        lIlIIIIIIl[lIlIIIIIlI[63]] = lIIIIllllIlIl("eLnBhAeYiHYIgLlzNjL7KHMz8rRgjZJ90802rJjhCMaY8XZRH/hsZw==", "vmghn");
        lIlIIIIIIl[lIlIIIIIlI[64]] = lIIIIllllIlII("Cys1PxkoZCk9HSI3ZyEXMzZnMB0qNGY=", "FDGXx");
        lIlIIIIIIl[lIlIIIIIlI[65]] = lIIIIllllIlII("AA4+aQ==", "YkMGU");
        lIlIIIIIIl[lIlIIIIIlI[66]] = lIIIIllllIlIl("hC+ya97nBq+UWdLo1AyNYuKKOpBHkJUOLLCGgekcs4E=", "EyMnU");
        lIlIIIIIIl[lIlIIIIIlI[67]] = lIIIIllllIlII("JAFuSCYOHmIFL0sCJwQ6Sx4qDSRF", "kjBhJ");
        lIlIIIIIIl[lIlIIIIIlI[68]] = lIIIIllllIlII("NQ0XPykBTCIyPhYPCHc/FgIXdyEWTBc4bAcNDzxsBwNDLiMGQg==", "slcWL");
        lIlIIIIIIl[lIlIIIIIlI[69]] = lIIIIllllIIll("7N/tLiwgelFKJG36B9QdEGwBFvdhTUwWO/igplF0djxvXReoaHGLCwnnMm9QBs/a", "GNeie");
        lIlIIIIIIl[lIlIIIIIlI[70]] = lIIIIllllIlIl("RukqMV4NMw1jmYQe9hVgKSiOwUuwGNXP0NbdcemCb/pXMsmnzXVwDA==", "psylT");
        lIlIIIIIIl[lIlIIIIIlI[71]] = lIIIIllllIlIl("uz+W3A5cydg=", "WUgbi");
        lIlIIIIIIl[lIlIIIIIlI[72]] = lIIIIllllIlII("CF4sRDkkGDMNICZZIApuIBQ0CCs1WS4CbiYRLhc6YQoxAS8qWA==", "AyAdN");
        lIlIIIIIIl[lIlIIIIIlI[73]] = lIIIIllllIlII("Ez8+a2gDfSBnOz8oKGk=", "JZMGH");
        lIlIIIIIIl[lIlIIIIIlI[48]] = lIIIIllllIlII("ERcOWRI4FlkwUTEdFQlO", "Yxyyq");
        lIlIIIIIIl[lIlIIIIIlI[74]] = lIIIIllllIlIl("7UgieFECSdmxv6hP1uL3Gbf7kwr5XyQZ5BS1SeSHA4Q=", "ptGYU");
        lIlIIIIIIl[lIlIIIIIlI[75]] = lIIIIllllIIll("JRN1jEixkMswdtb9/fUOgA==", "YbElc");
    }

    private static void lIIIIllllIlll() {
        lIlIIIIIlI = new int[89];
        lIlIIIIIlI[0] = (154 ^ 178) & ((1 ^ 41) ^ (-1));
        lIlIIIIIlI[1] = " ".length();
        lIlIIIIIlI[2] = 203 ^ 141;
        lIlIIIIIlI[3] = "  ".length();
        lIlIIIIIlI[4] = (-6273) & 6651;
        lIlIIIIIlI[5] = "   ".length();
        lIlIIIIIlI[6] = (82 ^ 60) ^ (14 ^ 100);
        lIlIIIIIlI[7] = (((91 + 148) - 156) + 86) ^ (((60 + 152) - 110) + 70);
        lIlIIIIIlI[8] = (-((-2973) & 27647)) & (-1029) & 30702;
        lIlIIIIIlI[9] = (((149 + 81) - 206) + 132) ^ (((22 + 122) - 58) + 68);
        lIlIIIIIlI[10] = (-((-15881) & 32574)) & (-1) & 28671;
        lIlIIIIIlI[11] = (-(75 ^ 106)) & (-133) & 8172;
        lIlIIIIIlI[12] = (-(((53 + 94) - 113) + 107)) & (-1539) & 14303;
        lIlIIIIIlI[13] = (-(156 ^ 189)) & (-8193) & 16231;
        lIlIIIIIlI[14] = (-6146) & 7097;
        lIlIIIIIlI[15] = 20 ^ 30;
        lIlIIIIIlI[16] = (-((-6209) & 14583)) & (-1) & 16383;
        lIlIIIIIlI[17] = 5 ^ 2;
        lIlIIIIIlI[18] = (((118 + 116) - 223) + 178) ^ (((2 + 46) - (-128)) + 5);
        lIlIIIIIlI[19] = (88 ^ 81) ^ ((48 ^ 101) & ((208 ^ 133) ^ (-1)));
        lIlIIIIIlI[20] = 75 ^ 64;
        lIlIIIIIlI[21] = 128 ^ 140;
        lIlIIIIIlI[22] = 32 ^ 45;
        lIlIIIIIlI[23] = (232 ^ 176) ^ (213 ^ 131);
        lIlIIIIIlI[24] = (44 ^ 102) ^ (8 ^ 77);
        lIlIIIIIlI[25] = 184 ^ 168;
        lIlIIIIIlI[26] = (79 ^ 121) ^ (146 ^ 181);
        lIlIIIIIlI[27] = 13 ^ 31;
        lIlIIIIIlI[28] = (228 ^ 167) ^ (234 ^ 186);
        lIlIIIIIlI[29] = 14 ^ 26;
        lIlIIIIIlI[30] = (((4 + 177) - 141) + 150) ^ (((111 + 85) - 175) + 150);
        lIlIIIIIlI[31] = 146 ^ 132;
        lIlIIIIIlI[32] = 72 ^ 95;
        lIlIIIIIlI[33] = (((136 + 51) - 98) + 87) ^ (((165 + 47) - 140) + 96);
        lIlIIIIIlI[34] = 155 ^ 130;
        lIlIIIIIlI[35] = (((65 + 95) - 158) + 140) ^ (((130 + 106) - 128) + 40);
        lIlIIIIIlI[36] = (118 ^ 56) ^ (222 ^ 139);
        lIlIIIIIlI[37] = 178 ^ 174;
        lIlIIIIIlI[38] = (-8606) & 31677;
        lIlIIIIIlI[39] = (((2 ^ 95) + (1 ^ 82)) - (37 ^ 12)) + (95 ^ 54);
        lIlIIIIIlI[40] = 9 ^ 20;
        lIlIIIIIlI[41] = (((3 + 78) - 5) + 54) ^ (((59 + 131) - 86) + 52);
        lIlIIIIIlI[42] = 53 ^ 42;
        lIlIIIIIlI[43] = (20 ^ 36) ^ (185 ^ 169);
        lIlIIIIIlI[44] = (68 ^ 88) ^ (63 ^ 2);
        lIlIIIIIlI[45] = 95 ^ 125;
        lIlIIIIIlI[46] = (-16388) & 32287;
        lIlIIIIIlI[47] = (-((-20657) & 22770)) & (-8211) & 16223;
        lIlIIIIIlI[48] = (215 ^ 172) ^ (71 ^ 11);
        lIlIIIIIlI[49] = (-((-8516) & 12111)) & (-28673) & 32767;
        lIlIIIIIlI[50] = (-((-4749) & 21406)) & (-4099) & 32735;
        lIlIIIIIlI[51] = (-((-17025) & 24276)) & (-1) & 32251;
        lIlIIIIIlI[52] = (-16402) & 18301;
        lIlIIIIIlI[53] = (30 ^ 8) ^ (121 ^ 71);
        lIlIIIIIlI[54] = 122 ^ 30;
        lIlIIIIIlI[55] = (((0 + 103) - 82) + 112) ^ (((159 + 83) - 110) + 34);
        lIlIIIIIlI[56] = 133 ^ 161;
        lIlIIIIIlI[57] = 36 ^ 1;
        lIlIIIIIlI[58] = (111 ^ 81) ^ (68 ^ 92);
        lIlIIIIIlI[59] = (194 ^ 187) ^ (77 ^ 19);
        lIlIIIIIlI[60] = 138 ^ 163;
        lIlIIIIIlI[61] = 139 ^ 161;
        lIlIIIIIlI[62] = (((173 + 114) - 252) + 150) ^ (((81 + 138) - 176) + 103);
        lIlIIIIIlI[63] = 16 ^ 60;
        lIlIIIIIlI[64] = (9 ^ 47) ^ (95 ^ 84);
        lIlIIIIIlI[65] = 81 ^ 127;
        lIlIIIIIlI[66] = 155 ^ 180;
        lIlIIIIIlI[67] = (193 ^ 164) ^ (23 ^ 66);
        lIlIIIIIlI[68] = (212 ^ 187) ^ (42 ^ 116);
        lIlIIIIIlI[69] = (((128 + 72) - 177) + 164) ^ (((33 + 65) - 81) + 120);
        lIlIIIIIlI[70] = 180 ^ 135;
        lIlIIIIIlI[71] = 128 ^ 180;
        lIlIIIIIlI[72] = 167 ^ 146;
        lIlIIIIIlI[73] = (((176 + 42) - 190) + 161) ^ (((66 + 36) - 9) + 46);
        lIlIIIIIlI[74] = 113 ^ 73;
        lIlIIIIIlI[75] = "  ".length() ^ (80 ^ 107);
        lIlIIIIIlI[76] = (-((-13445) & 14277)) & (-8193) & 12253;
        lIlIIIIIlI[77] = (-24900) & 28139;
        lIlIIIIIlI[78] = (-29217) & 32446;
        lIlIIIIIlI[79] = (-((-11457) & 31957)) & (-65) & 23773;
        lIlIIIIIlI[80] = (-28761) & 31963;
        lIlIIIIIlI[81] = (-((-2306) & 14645)) & (-257) & 15807;
        lIlIIIIIlI[82] = (-((-3125) & 28669)) & (-19) & 28671;
        lIlIIIIIlI[83] = (-((-9435) & 10239)) & (-24580) & 28647;
        lIlIIIIIlI[84] = (-((-18823) & 19439)) & (-12546) & 16239;
        lIlIIIIIlI[85] = (-8261) & 11519;
        lIlIIIIIlI[86] = (-((-14991) & 32399)) & (-8193) & 28654;
        lIlIIIIIlI[87] = (-20737) & 23982;
        lIlIIIIIlI[88] = (248 ^ 139) ^ (252 ^ 181);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean al() {
        String[] strArr = new String[lIlIIIIIlI[1]];
        strArr[lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[45]];
        if (lIIIIlllllIlI(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIlIIIIIlI[1]];
            iArr[lIlIIIIIlI[0]] = lIlIIIIIlI[4];
            if (lIIIIlllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIlIIIIIlI[1];
                "".length();
                return (-"   ".length()) > 0 ? (true ^ true) & ((false ^ true) ^ true) : r0;
            }
        }
        return lIlIIIIIlI[0];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIIIIIl[lIlIIIIIlI[55]];
    }

    static {
        lIIIIllllIlll();
        lIIIIllllIllI();
        String[] strArr = new String[lIlIIIIIlI[24]];
        strArr[lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[62]];
        strArr[lIlIIIIIlI[1]] = lIlIIIIIIl[lIlIIIIIlI[63]];
        strArr[lIlIIIIIlI[3]] = lIlIIIIIIl[lIlIIIIIlI[64]];
        strArr[lIlIIIIIlI[5]] = lIlIIIIIIl[lIlIIIIIlI[65]];
        strArr[lIlIIIIIlI[6]] = lIlIIIIIIl[lIlIIIIIlI[66]];
        strArr[lIlIIIIIlI[7]] = lIlIIIIIIl[lIlIIIIIlI[67]];
        strArr[lIlIIIIIlI[9]] = lIlIIIIIIl[lIlIIIIIlI[68]];
        strArr[lIlIIIIIlI[17]] = lIlIIIIIIl[lIlIIIIIlI[69]];
        strArr[lIlIIIIIlI[18]] = lIlIIIIIIl[lIlIIIIIlI[70]];
        strArr[lIlIIIIIlI[19]] = lIlIIIIIIl[lIlIIIIIlI[71]];
        strArr[lIlIIIIIlI[15]] = lIlIIIIIIl[lIlIIIIIlI[72]];
        strArr[lIlIIIIIlI[20]] = lIlIIIIIIl[lIlIIIIIlI[73]];
        strArr[lIlIIIIIlI[21]] = lIlIIIIIIl[lIlIIIIIlI[48]];
        strArr[lIlIIIIIlI[22]] = lIlIIIIIIl[lIlIIIIIlI[74]];
        strArr[lIlIIIIIlI[23]] = lIlIIIIIIl[lIlIIIIIlI[75]];
        jk = strArr;
        jl = new WorldPoint(lIlIIIIIlI[76], lIlIIIIIlI[77], lIlIIIIIlI[0]);
        jm = new WorldPoint(lIlIIIIIlI[78], lIlIIIIIlI[79], lIlIIIIIlI[0]);
        jn = new WorldPoint(lIlIIIIIlI[80], lIlIIIIIlI[81], lIlIIIIIlI[0]);
        jo = new WorldPoint(lIlIIIIIlI[82], lIlIIIIIlI[83], lIlIIIIIlI[0]);
        jp = new WorldPoint(lIlIIIIIlI[84], lIlIIIIIlI[85], lIlIIIIIlI[0]);
        jq = new WorldPoint(lIlIIIIIlI[86], lIlIIIIIlI[87], lIlIIIIIlI[0]);
        bp = new ArrayList();
        cA = lIlIIIIIlI[0];
    }

    private static boolean lIIIlIIIIIIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIllllllll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlIIIIIIII(int i, int i2) {
        return i > i2;
    }

    private static String lIIIIllllIIll(String llllllllllllllllllllIllIIIlIllII, String llllllllllllllllllllIllIIIlIllIl) {
        try {
            SecretKeySpec llllllllllllllllllllIllIIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllIIIlIllIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlI[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIlI[3], llllllllllllllllllllIllIIIllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIllIIIlIllll) {
            llllllllllllllllllllIllIIIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllllllII(int i) {
        return i == 0;
    }

    private static boolean lIIIlIIIIIIlI(int i, int i2) {
        return i == i2;
    }

    private static String lIIIIllllIlIl(String llllllllllllllllllllIllIIIlllIll, String llllllllllllllllllllIllIIIlllIlI) {
        try {
            SecretKeySpec llllllllllllllllllllIllIIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllIIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIllIIIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIllIIIllllIl.init(lIlIIIIIlI[3], llllllllllllllllllllIllIIIlllllI);
            return new String(llllllllllllllllllllIllIIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIllIIIllllII) {
            llllllllllllllllllllIllIIIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIIIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIlIIIIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[18])) {
            int[] iArr = new int[lIlIIIIIlI[1]];
            iArr[lIlIIIIIlI[0]] = lIlIIIIIlI[38];
            if (lIIIIllllllII(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIlIIIIIlI[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlIIIIIlI[0];
    }

    private static boolean lIIIIlllllllI(int i) {
        return i > 0;
    }

    private static boolean lIIIIlllllIll(int i, int i2) {
        return i < i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            cL();
            "".length();
            if (" ".length() >= "  ".length()) {
                return ("   ".length() ^ (137 ^ 134)) & (((24 ^ 71) ^ (60 ^ 111)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIIIIlI[54];
    }

    private static int lIIIIlllllIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static int lIIIIlllllIIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static String lIIIIllllIlII(String llllllllllllllllllllIllIIIIllllI, String llllllllllllllllllllIllIIIIlllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIllIIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIllIIIIlllII = new StringBuilder();
        char[] llllllllllllllllllllIllIIIIllIll = llllllllllllllllllllIllIIIIlllIl.toCharArray();
        int llllllllllllllllllllIllIIIIllIlI = lIlIIIIIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIlI[0];
        while (lIIIIlllllIll(i, length)) {
            llllllllllllllllllllIllIIIIlllII.append((char) (charArray[i] ^ llllllllllllllllllllIllIIIIllIll[llllllllllllllllllllIllIIIIllIlI % llllllllllllllllllllIllIIIIllIll.length]));
            "".length();
            llllllllllllllllllllIllIIIIllIlI++;
            i++;
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllIllIIIIlllII);
    }

    private static boolean lIIIIlllllIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v354, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean] */
    public static void cL() {
        if (lIIIIlllllIlI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[0]];
            C0001b.a(bp);
            if (lIIIIlllllIll(bp.size(), lIlIIIIIlI[1])) {
                System.out.println(lIlIIIIIIl[lIlIIIIIlI[1]]);
                bn = lIlIIIIIlI[0];
            }
        }
        if (lIIIIllllllII(bn ? 1 : 0)) {
            if (lIIIIlllllIlI(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIIIlllllIll(Movement.getRunEnergy(), lIlIIIIIlI[2])) {
                Inventory.getFirst(C0005f.aU).interact(lIlIIIIIIl[lIlIIIIIlI[3]]);
                Time.sleepTicks(lIlIIIIIlI[1]);
                "".length();
            }
            if (lIIIIllllllIl(lIIIIlllllIII(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lIlIIIIIlI[1]];
                iArr[lIlIIIIIlI[0]] = lIlIIIIIlI[4];
                if (lIIIIlllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIIIIIlI[1]];
                    iArr2[lIlIIIIIlI[0]] = lIlIIIIIlI[4];
                    Inventory.getFirst(iArr2).interact(lIlIIIIIIl[lIlIIIIIlI[5]]);
                }
            }
            if (lIIIIllllllII(Movement.isRunEnabled() ? 1 : 0) && lIIIIlllllllI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIIIIllllllII(al() ? 1 : 0) && lIIIIllllllII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIllllllll(nearest) && lIIIIllllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIlIIIIIlI[3]);
                    "".length();
                }
                if (lIIIIllllllll(nearest) && lIIIIlllllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[7]];
                    if (lIIIIllllllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIIIIlI[8]);
                        "".length();
                    }
                    if (lIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIIlllllllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIIIIlI[6]);
                            "".length();
                        }
                        if (lIIIIlllllllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIIIIlI[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIlIIIIIlI[9]];
                        iArr3[lIlIIIIIlI[0]] = lIlIIIIIlI[10];
                        iArr3[lIlIIIIIlI[1]] = lIlIIIIIlI[11];
                        iArr3[lIlIIIIIlI[3]] = lIlIIIIIlI[12];
                        iArr3[lIlIIIIIlI[5]] = lIlIIIIIlI[13];
                        iArr3[lIlIIIIIlI[6]] = lIlIIIIIlI[4];
                        iArr3[lIlIIIIIlI[7]] = lIlIIIIIlI[14];
                        if (lIIIIllllllII(C0004e.b(iArr3) ? 1 : 0)) {
                            O();
                            System.out.println(lIlIIIIIIl[lIlIIIIIlI[9]]);
                            bn = lIlIIIIIlI[1];
                            return;
                        }
                        int[] iArr4 = new int[lIlIIIIIlI[9]];
                        iArr4[lIlIIIIIlI[0]] = lIlIIIIIlI[10];
                        iArr4[lIlIIIIIlI[1]] = lIlIIIIIlI[11];
                        iArr4[lIlIIIIIlI[3]] = lIlIIIIIlI[12];
                        iArr4[lIlIIIIIlI[5]] = lIlIIIIIlI[13];
                        iArr4[lIlIIIIIlI[6]] = lIlIIIIIlI[4];
                        iArr4[lIlIIIIIlI[7]] = lIlIIIIIlI[14];
                        if (lIIIIlllllIlI(C0004e.b(iArr4) ? 1 : 0)) {
                            Bank.withdraw(lIlIIIIIlI[11], lIlIIIIIlI[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIIIIIlI[1]);
                            "".length();
                            Bank.withdraw(lIlIIIIIlI[14], lIlIIIIIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIIIIIlI[1]);
                            "".length();
                            Bank.withdraw(lIlIIIIIlI[16], lIlIIIIIlI[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIIIIIlI[1]);
                            "".length();
                            Bank.withdraw(lIlIIIIIlI[13], lIlIIIIIlI[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIIIIIlI[1]);
                            "".length();
                            Bank.withdraw(lIlIIIIIlI[10], lIlIIIIIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIIIIIlI[1]);
                            "".length();
                            C0000a.b(C0005f.aU, lIlIIIIIlI[6]);
                            C0000a.a(lIlIIIIIlI[4], lIlIIIIIlI[15]);
                            C0000a.b(C0005f.be, lIlIIIIIlI[1]);
                        }
                    }
                }
            }
            if (lIIIIllllllII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && lIIIIlllllIlI(al() ? 1 : 0)) {
                if (lIIIlIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(jl), lIlIIIIIlI[3])) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[17]];
                    if (lIIIIlllllIll(cA, lIlIIIIIlI[1])) {
                        C0004e.v();
                        cA += lIlIIIIIlI[1];
                    }
                    Movement.walkTo(jl);
                    "".length();
                    Time.sleepTicks(lIlIIIIIlI[1]);
                    "".length();
                }
                if (lIIIlIIIIIIIl(Players.getLocal().getWorldLocation().distanceTo(jl), lIlIIIIIlI[3])) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[18]];
                    if (lIIIIllllllII(lIIIIlllllIIl(g, 0L))) {
                        g = System.currentTimeMillis();
                    }
                    if (lIIIIlllllIlI(lIIIIlllllIIl(g, 0L)) && lIIIIlllllllI(lIIIIlllllIIl(C0004e.a(g), 30000L))) {
                        cA = lIlIIIIIlI[0];
                        g = System.currentTimeMillis();
                    }
                    if (lIIIIlllllIll(cA, lIlIIIIIlI[1])) {
                        C0004e.v();
                        cA += lIlIIIIIlI[1];
                    }
                    if (lIIIIlllllIlI(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIIIIIlI[1]];
                        iArr5[lIlIIIIIlI[0]] = lIlIIIIIlI[4];
                        Inventory.getFirst(iArr5).interact(lIlIIIIIIl[lIlIIIIIlI[19]]);
                        Time.sleepTicks(lIlIIIIIlI[3]);
                        "".length();
                    }
                    C0006g.a(lIlIIIIIIl[lIlIIIIIlI[15]], jk, lIlIIIIIlI[1]);
                }
            }
            if (lIIIlIIIIIIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[1])) {
                dc = lIlIIIIIlI[0];
                String[] strArr = new String[lIlIIIIIlI[1]];
                strArr[lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[20]];
                if (lIIIIllllllII(Inventory.contains(strArr) ? 1 : 0)) {
                    C0006g.a(jk);
                }
            }
            if (lIIIlIIIIIIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[3])) {
                if (lIIIIlllllIlI(Inventory.contains(item -> {
                    return item.getName().contains(lIlIIIIIIl[lIlIIIIIlI[61]]);
                }) ? 1 : 0) && lIIIIllllllII(Equipment.contains(item2 -> {
                    return item2.getName().contains(lIlIIIIIIl[lIlIIIIIlI[60]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lIlIIIIIIl[lIlIIIIIlI[53]]);
                    }).interact(lIlIIIIIIl[lIlIIIIIlI[21]]);
                }
                if (lIIIIlllllIlI(Inventory.contains(item4 -> {
                    return item4.getName().contains(lIlIIIIIIl[lIlIIIIIlI[59]]);
                }) ? 1 : 0) && lIIIIllllllII(Equipment.contains(item5 -> {
                    return item5.getName().contains(lIlIIIIIIl[lIlIIIIIlI[58]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(lIlIIIIIIl[lIlIIIIIlI[57]]);
                    }).interact(lIlIIIIIIl[lIlIIIIIlI[22]]);
                }
                if (lIIIIllllllII(Players.getLocal().getWorldLocation().equals(jm) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[23]];
                    Movement.walkTo(jm);
                    "".length();
                    Time.sleepTicks(lIlIIIIIlI[1]);
                    "".length();
                }
                if (lIIIIlllllIlI(Players.getLocal().getWorldLocation().equals(jm) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIIIIIlI[1]];
                    strArr2[lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[24]];
                    Inventory.getFirst(strArr2).interact(lIlIIIIIIl[lIlIIIIIlI[25]]);
                    Time.sleepTicks(lIlIIIIIlI[3]);
                    "".length();
                }
            }
            if (lIIIlIIIIIIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[5])) {
                if (lIIIIllllllII(Players.getLocal().getWorldLocation().equals(jn) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[26]];
                    Movement.walkTo(jn);
                    "".length();
                    Time.sleepTicks(lIlIIIIIlI[1]);
                    "".length();
                }
                if (lIIIIlllllIlI(Players.getLocal().getWorldLocation().equals(jn) ? 1 : 0)) {
                    String[] strArr3 = new String[lIlIIIIIlI[1]];
                    strArr3[lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[27]];
                    Inventory.getFirst(strArr3).interact(lIlIIIIIIl[lIlIIIIIlI[28]]);
                    Time.sleepTicks(lIlIIIIIlI[3]);
                    "".length();
                }
            }
            if (lIIIlIIIIIIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[6])) {
                if (lIIIIllllllII(Players.getLocal().getWorldLocation().equals(jo) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[29]];
                    Movement.walkTo(jo);
                    "".length();
                    Time.sleepTicks(lIlIIIIIlI[1]);
                    "".length();
                }
                if (lIIIIlllllIlI(Players.getLocal().getWorldLocation().equals(jo) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIIIIIlI[1]];
                    strArr4[lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[30]];
                    Inventory.getFirst(strArr4).interact(lIlIIIIIIl[lIlIIIIIlI[31]]);
                    Time.sleepTicks(lIlIIIIIlI[3]);
                    "".length();
                }
            }
            if (lIIIlIIIIIIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[7])) {
                if (lIIIIllllllII(Players.getLocal().getWorldLocation().equals(jp) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[32]];
                    Movement.walkTo(jp);
                    "".length();
                    Time.sleepTicks(lIlIIIIIlI[1]);
                    "".length();
                }
                if (lIIIIlllllIlI(Players.getLocal().getWorldLocation().equals(jp) ? 1 : 0)) {
                    String[] strArr5 = new String[lIlIIIIIlI[1]];
                    strArr5[lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[33]];
                    Inventory.getFirst(strArr5).interact(lIlIIIIIIl[lIlIIIIIlI[34]]);
                    Time.sleepTicks(lIlIIIIIlI[3]);
                    "".length();
                }
            }
            if (lIIIlIIIIIIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[9])) {
                if (lIIIlIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(jq), lIlIIIIIlI[5])) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[35]];
                    Movement.walkTo(jq);
                    "".length();
                    Time.sleepTicks(lIlIIIIIlI[1]);
                    "".length();
                }
                if (lIIIlIIIIIIIl(Players.getLocal().getWorldLocation().distanceTo(jq), lIlIIIIIlI[5])) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[36]];
                    if (lIIIIlllllIll(dc, lIlIIIIIlI[1])) {
                        Z.nU += lIlIIIIIlI[1];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlIIIIIlI[1];
                        Z.nU = lIlIIIIIlI[0];
                        dd = lIlIIIIIlI[0];
                    }
                    C0006g.a(lIlIIIIIIl[lIlIIIIIlI[37]], jk);
                }
            }
            if (lIIIlIIIIIIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[17])) {
                C0006g.a(jk);
            }
            do {
                int[] iArr6 = new int[lIlIIIIIlI[1]];
                iArr6[lIlIIIIIlI[0]] = lIlIIIIIlI[38];
                if (!lIIIIlllllIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                    C0006g.a(new String[lIlIIIIIlI[0]]);
                    return;
                }
                if (lIIIIllllllll(Widgets.get(lIlIIIIIlI[39]))) {
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[40]];
                    int[] iArr7 = new int[lIlIIIIIlI[1]];
                    iArr7[lIlIIIIIlI[0]] = lIlIIIIIlI[38];
                    Inventory.getFirst(iArr7).interact(lIlIIIIIIl[lIlIIIIIlI[41]]);
                    Time.sleepTicks(lIlIIIIIlI[6]);
                    "".length();
                    AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[42]];
                    Widget widget = Widgets.get(lIlIIIIIlI[39], lIlIIIIIlI[23]);
                    if (lIIIIllllllll(widget)) {
                        widget.interact(lIlIIIIIIl[lIlIIIIIlI[43]]);
                        Time.sleepTicks(lIlIIIIIlI[1]);
                        "".length();
                    }
                    Widget widget2 = Widgets.get(lIlIIIIIlI[39], lIlIIIIIlI[35]);
                    if (lIIIIllllllll(widget2)) {
                        widget2.interact(lIlIIIIIIl[lIlIIIIIlI[44]]);
                        Time.sleepTicks(lIlIIIIIlI[3]);
                        "".length();
                    }
                }
                Time.sleepTicks(lIlIIIIIlI[1]);
                "".length();
                "".length();
            } while (0 == 0);
        }
    }

    private static void O() {
        int[] iArr = new int[lIlIIIIIlI[1]];
        iArr[lIlIIIIIlI[0]] = lIlIIIIIlI[10];
        if (lIIIIllllllII(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIIlI[10], lIlIIIIIlI[1], lIlIIIIIlI[46]));
            "".length();
        }
        int[] iArr2 = new int[lIlIIIIIlI[1]];
        iArr2[lIlIIIIIlI[0]] = lIlIIIIIlI[14];
        if (lIIIIllllllII(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIIlI[14], lIlIIIIIlI[1], lIlIIIIIlI[47]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIIIIlI[1]];
        iArr3[lIlIIIIIlI[0]] = lIlIIIIIlI[4];
        if (lIIIIllllllII(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIIlI[4], lIlIIIIIlI[48], lIlIIIIIlI[49]));
            "".length();
        }
        if (lIIIIllllllII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIIIIIl[lIlIIIIIlI[56]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIIlI[50], lIlIIIIIlI[7], lIlIIIIIlI[51]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIIIIlI[1]];
        iArr4[lIlIIIIIlI[0]] = lIlIIIIIlI[11];
        if (lIIIIllllllII(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIIlI[11], lIlIIIIIlI[15], lIlIIIIIlI[52]));
            "".length();
        }
        int[] iArr5 = new int[lIlIIIIIlI[1]];
        iArr5[lIlIIIIIlI[0]] = lIlIIIIIlI[16];
        if (lIIIIllllllII(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIIlI[16], lIlIIIIIlI[15], lIlIIIIIlI[52]));
            "".length();
        }
        int[] iArr6 = new int[lIlIIIIIlI[1]];
        iArr6[lIlIIIIIlI[0]] = lIlIIIIIlI[13];
        if (lIIIIllllllII(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIIlI[13], lIlIIIIIlI[53], lIlIIIIIlI[52]));
            "".length();
        }
        int[] iArr7 = new int[lIlIIIIIlI[1]];
        iArr7[lIlIIIIIlI[0]] = lIlIIIIIlI[12];
        if (lIIIIllllllII(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIIlI[12], lIlIIIIIlI[7], C0009j.bZ));
            "".length();
        }
    }

    private static boolean lIIIIllllllIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIIIIlI[0];
    }
}
