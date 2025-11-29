package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.aq  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/aq.class */
public class aq implements ab {
    public static final /* synthetic */ WorldPoint mB;
    public static /* synthetic */ List<C0003d> bx;
    public static final /* synthetic */ WorldPoint mz;
    public static final /* synthetic */ WorldPoint mC;
    static final /* synthetic */ WorldPoint mD;
    public static /* synthetic */ boolean bv;
    private final /* synthetic */ int mG = lIIIIIIIIl[0];
    public static final /* synthetic */ WorldPoint mA;
    private static /* synthetic */ int[] lIIIIIIIIl;
    static final /* synthetic */ WorldPoint mF;
    private static /* synthetic */ String[] lIIIIIIIII;
    static final /* synthetic */ WorldPoint mE;

    private static boolean llIllIlIIlIl(int i) {
        return i == 0;
    }

    private static boolean llIllIlIIllI(Object obj) {
        return obj != null;
    }

    private static int eb() {
        return (llIllIlIIlII(Skills.getLevel(Skill.PRAYER), lIIIIIIIIl[70]) && llIllIlIlIll(Skills.getLevel(Skill.PRAYER), lIIIIIIIIl[71])) ? ((lIIIIIIIIl[69] - Skills.getExperience(Skill.PRAYER)) / lIIIIIIIIl[72]) + lIIIIIIIIl[21] : ((lIIIIIIIIl[73] - Skills.getExperience(Skill.PRAYER)) / lIIIIIIIIl[72]) + lIIIIIIIIl[62];
    }

    private static void Q() {
        int[] iArr = new int[lIIIIIIIIl[2]];
        iArr[lIIIIIIIIl[1]] = lIIIIIIIIl[8];
        if (llIllIlIIlIl(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIIIl[8], lIIIIIIIIl[13], C0009j.ch));
            "".length();
        }
        int[] iArr2 = new int[lIIIIIIIIl[2]];
        iArr2[lIIIIIIIIl[1]] = lIIIIIIIIl[0];
        if (llIllIlIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIIIl[0], eb(), lIIIIIIIIl[63]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIIIIIl[2]];
        iArr3[lIIIIIIIIl[1]] = lIIIIIIIIl[7];
        if (llIllIlIIlIl(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIIIl[7], lIIIIIIIIl[3], lIIIIIIIIl[5]));
            "".length();
        }
        if (llIllIlIIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIIIIII[lIIIIIIIIl[77]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIIIl[64], lIIIIIIIIl[13], lIIIIIIIIl[65]));
            "".length();
        }
        int[] iArr4 = new int[lIIIIIIIIl[2]];
        iArr4[lIIIIIIIIl[1]] = lIIIIIIIIl[66];
        if (llIllIlIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIIIl[66], lIIIIIIIIl[67], lIIIIIIIIl[68]));
            "".length();
        }
    }

    private static boolean llIllIlIlIlI(int i, int i2) {
        return i <= i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            ea();
            "".length();
            if (" ".length() != " ".length()) {
                return (104 ^ 89) & ((241 ^ 192) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIIIIIIl[74];
    }

    private static void llIllIlIIIIl() {
        lIIIIIIIII = new String[lIIIIIIIIl[87]];
        lIIIIIIIII[lIIIIIIIIl[1]] = llIllIIllllI("JB4TJAYBSwM5DQsY", "fkjMh");
        lIIIIIIIII[lIIIIIIIIl[2]] = llIllIIlllll("mMVbwBPSCMPOCCQ44vdDQU/yPmqXvqArPbxK3EHwVwUM2IPkoxPR2eGTa7MugLuW", "LxfyC");
        lIIIIIIIII[lIIIIIIIIl[3]] = llIllIIlllll("zsv94OTeaYGV4Rn/KxLIB3BQM2csj8Fa", "ppWAo");
        lIIIIIIIII[lIIIIIIIIl[4]] = llIllIIlllll("+Nu6bgHd8rfTwmFLti2nXdqNnxzKjKbj", "xzEml");
        lIIIIIIIII[lIIIIIIIIl[6]] = llIllIIllllI("LS9ZLSAfahQlIQkjFytyCjgYNTcIago5IgomECkhVmoKOzsOKRElPB1qDSNyOB8gBRw9", "zJyLR");
        lIIIIIIIII[lIIIIIIIIl[13]] = llIllIlIIIII("jJJYGov8xcw=", "vhEHT");
        lIIIIIIIII[lIIIIIIIIl[15]] = llIllIIlllll("hs3XtSS9US2JyKgSKAyKXA==", "AaCcL");
        lIIIIIIIII[lIIIIIIIIl[17]] = llIllIIlllll("bwTpBFvRe40=", "wnWEh");
        lIIIIIIIII[lIIIIIIIIl[18]] = llIllIlIIIII("BnFO51YUu+r5KnnT2Nbswg==", "fEvqD");
        lIIIIIIIII[lIIIIIIIIl[19]] = llIllIIllllI("NSYqMm5aOS4nJwoiOT9iDiJrJycMKCdrdkttHCIuHig5JScJPmU=", "zMKKB");
        lIIIIIIIII[lIIIIIIIIl[21]] = llIllIlIIIII("lETkc2bvAuOd6sPR7x9jNw==", "CWroz");
        lIIIIIIIII[lIIIIIIIIl[41]] = llIllIIlllll("E/UPq7NTsVY1MTcZeEjMXQ==", "mTqyB");
        lIIIIIIIII[lIIIIIIIIl[44]] = llIllIlIIIII("Tx/Girg54jnttNHD3A4PIA==", "kKAEh");
        lIIIIIIIII[lIIIIIIIIl[20]] = llIllIIllllI("LRUfPxBBEAI3Bw==", "atmXu");
        lIIIIIIIII[lIIIIIIIIl[46]] = llIllIIlllll("C6cLmWaxPEg=", "bhEGB");
        lIIIIIIIII[lIIIIIIIIl[47]] = llIllIlIIIII("RSBMHFCW8uE=", "tGvlu");
        lIIIIIIIII[lIIIIIIIIl[48]] = llIllIIllllI("Oj8uHg==", "uOKpc");
        lIIIIIIIII[lIIIIIIIIl[49]] = llIllIIlllll("71lNEuUphj+7VaQusSlhlA==", "wJkcY");
        lIIIIIIIII[lIIIIIIIIl[51]] = llIllIIllllI("Cy4ATxMqbxcDEyQ9", "EOvog");
        lIIIIIIIII[lIIIIIIIIl[52]] = llIllIlIIIII("lTDVDRZNxBC2vEfNmpH30w==", "qoEoL");
        lIIIIIIIII[lIIIIIIIIl[14]] = llIllIlIIIII("cpWGl5t62GoUgigbZsekmaeuACPT1MBb", "wtOiB");
        lIIIIIIIII[lIIIIIIIIl[53]] = llIllIlIIIII("nL0fvLcQlkyFBCt4V4Dq4A==", "ckyQn");
        lIIIIIIIII[lIIIIIIIIl[54]] = llIllIlIIIII("HHZTwby84oc=", "jYUVm");
        lIIIIIIIII[lIIIIIIIIl[55]] = llIllIIllllI("IhMHOQ==", "mcbWd");
        lIIIIIIIII[lIIIIIIIIl[56]] = llIllIIlllll("oP0XstmSgy4=", "zsbrW");
        lIIIIIIIII[lIIIIIIIIl[57]] = llIllIlIIIII("r+ueoYqvPbKf/o+rEtbiLw==", "lisya");
        lIIIIIIIII[lIIIIIIIIl[58]] = llIllIIllllI("FwkqMTs8Fix5bw==", "RqIYZ");
        lIIIIIIIII[lIIIIIIIIl[59]] = llIllIlIIIII("kfGm1DLDUKETT14gskVFNQ==", "AXbvc");
        lIIIIIIIII[lIIIIIIIIl[60]] = llIllIlIIIII("624yE0arppUrsjETN4Ifgg==", "uJrMb");
        lIIIIIIIII[lIIIIIIIIl[61]] = llIllIIlllll("HNQ+keFY9LMOFxPSRzXWbw==", "iBWcD");
        lIIIIIIIII[lIIIIIIIIl[62]] = llIllIIllllI("GhIELg==", "NsoKu");
        lIIIIIIIII[lIIIIIIIIl[75]] = llIllIIllllI("OwskFi4ZWTEdKgIXLAEs", "kyEoK");
        lIIIIIIIII[lIIIIIIIIl[77]] = llIllIIllllI("FAgNFFUJB0MEEAcNFxtVTg==", "facsu");
    }

    private static boolean llIllIlIIlII(int i, int i2) {
        return i < i2;
    }

    private static void llIllIlIIIlI() {
        lIIIIIIIIl = new int[88];
        lIIIIIIIIl[0] = (-((-16413) & 30078)) & (-18437) & 32637;
        lIIIIIIIIl[1] = ((((37 + 81) - (-8)) + 23) ^ (((79 + 18) - (-75)) + 1)) & (((197 ^ 157) ^ (200 ^ 168)) ^ (-" ".length()));
        lIIIIIIIIl[2] = " ".length();
        lIIIIIIIIl[3] = "  ".length();
        lIIIIIIIIl[4] = "   ".length();
        lIIIIIIIIl[5] = (-16389) & 21388;
        lIIIIIIIIl[6] = (194 ^ 188) ^ (244 ^ 142);
        lIIIIIIIIl[7] = (-((-22765) & 23790)) & (-10241) & 32431;
        lIIIIIIIIl[8] = (-((-8287) & 27263)) & (-3) & 31603;
        lIIIIIIIIl[9] = (-16405) & 17399;
        lIIIIIIIIl[10] = (-((-4425) & 22009)) & (-585) & 28668;
        lIIIIIIIIl[11] = (((105 ^ 26) + (((5 + 74) - 60) + 120)) - (((60 + 34) - (-8)) + 148)) + ((128 + 68) - 25) + 25;
        lIIIIIIIIl[12] = (((77 + 238) - 313) + 244) ^ (((92 + 179) - 118) + 43);
        lIIIIIIIIl[13] = (((14 + 32) - 22) + 168) ^ (((78 + 95) - 151) + 175);
        lIIIIIIIIl[14] = 95 ^ 75;
        lIIIIIIIIl[15] = (7 ^ 54) ^ (49 ^ 6);
        lIIIIIIIIl[16] = -" ".length();
        lIIIIIIIIl[17] = 77 ^ 74;
        lIIIIIIIIl[18] = 133 ^ 141;
        lIIIIIIIIl[19] = (6 ^ 83) ^ (95 ^ 3);
        lIIIIIIIIl[20] = 21 ^ 24;
        lIIIIIIIIl[21] = 32 ^ 42;
        lIIIIIIIIl[22] = (-41) & 3068;
        lIIIIIIIIl[23] = (-((-643) & 25267)) & (-4162) & 32627;
        lIIIIIIIIl[24] = (-13325) & 16350;
        lIIIIIIIIl[25] = (-((-17825) & 21925)) & (-16385) & 24319;
        lIIIIIIIIl[26] = (-17457) & 20475;
        lIIIIIIIIl[27] = (-28680) & 32511;
        lIIIIIIIIl[28] = (-((-8257) & 29817)) & (-1) & 24575;
        lIIIIIIIIl[29] = (-((-18101) & 22455)) & (-16385) & 24567;
        lIIIIIIIIl[30] = (-((-321) & 30054)) & (-17) & 32759;
        lIIIIIIIIl[31] = (-28687) & 32511;
        lIIIIIIIIl[32] = (-((-2431) & 11647)) & (-4099) & 16319;
        lIIIIIIIIl[33] = (-((-18821) & 31125)) & (-16641) & 32766;
        lIIIIIIIIl[34] = (-1089) & 4087;
        lIIIIIIIIl[35] = (-24582) & 28399;
        lIIIIIIIIl[36] = (-((-3053) & 32765)) & (-65) & 32767;
        lIIIIIIIIl[37] = (-28929) & 32747;
        lIIIIIIIIl[38] = (-((-11113) & 12153)) & (-4097) & 8119;
        lIIIIIIIIl[39] = (-((-51) & 4223)) & (-24594) & 31741;
        lIIIIIIIIl[40] = (-((-11145) & 32749)) & (-8194) & 32767;
        lIIIIIIIIl[41] = (104 ^ 41) ^ (119 ^ 61);
        lIIIIIIIIl[42] = (-4165) & 7127;
        lIIIIIIIIl[43] = (-(30 ^ 10)) & (-16385) & 20223;
        lIIIIIIIIl[44] = 139 ^ 135;
        lIIIIIIIIl[45] = (-((-1423) & 30207)) & (-1025) & 32767;
        lIIIIIIIIl[46] = 75 ^ 69;
        lIIIIIIIIl[47] = 152 ^ 151;
        lIIIIIIIIl[48] = 131 ^ 147;
        lIIIIIIIIl[49] = (185 ^ 159) ^ (125 ^ 74);
        lIIIIIIIIl[50] = (-((-17201) & 30643)) & (-2149) & 16127;
        lIIIIIIIIl[51] = (((108 + 135) - 174) + 110) ^ (((40 + 2) - (-112)) + 7);
        lIIIIIIIIl[52] = "  ".length() ^ (186 ^ 171);
        lIIIIIIIIl[53] = (0 ^ 43) ^ (83 ^ 109);
        lIIIIIIIIl[54] = 103 ^ 113;
        lIIIIIIIIl[55] = (252 ^ 141) ^ (244 ^ 146);
        lIIIIIIIIl[56] = 87 ^ 79;
        lIIIIIIIIl[57] = 43 ^ 50;
        lIIIIIIIIl[58] = 65 ^ 91;
        lIIIIIIIIl[59] = (57 ^ 89) ^ (55 ^ 76);
        lIIIIIIIIl[60] = (220 ^ 147) ^ (9 ^ 90);
        lIIIIIIIIl[61] = 71 ^ 90;
        lIIIIIIIIl[62] = (((153 + 144) - 124) + 7) ^ (((43 + 168) - 165) + 124);
        lIIIIIIIIl[63] = (-25604) & 28403;
        lIIIIIIIIl[64] = (-"   ".length()) & (-4145) & 16126;
        lIIIIIIIIl[65] = (-((-937) & 6058)) & (-2065) & 32185;
        lIIIIIIIIl[66] = (-9) & 8015;
        lIIIIIIIIl[67] = (((98 + 1) - (-1)) + 43) ^ (((49 + 88) - 32) + 62);
        lIIIIIIIIl[68] = (-((-8202) & 12397)) & (-16393) & 21487;
        lIIIIIIIIl[69] = (-((-19737) & 24474)) & (-49) & 278527;
        lIIIIIIIIl[70] = (5 ^ 21) ^ (8 ^ 36);
        lIIIIIIIIl[71] = 78 ^ 99;
        lIIIIIIIIl[72] = (-((-673) & 28342)) & (-545) & 28663;
        lIIIIIIIIl[73] = (-817) & 62328;
        lIIIIIIIIl[74] = (20 ^ 124) ^ (151 ^ 155);
        lIIIIIIIIl[75] = 159 ^ 128;
        lIIIIIIIIl[76] = 116 ^ 23;
        lIIIIIIIIl[77] = (((129 + 107) - 105) + 12) ^ (((146 + 31) - 143) + 141);
        lIIIIIIIIl[78] = (-((-339) & 12659)) & (-16393) & 31741;
        lIIIIIIIIl[79] = (-((-3843) & 24558)) & (-1) & 24559;
        lIIIIIIIIl[80] = (-((-7953) & 32542)) & (-5185) & 32767;
        lIIIIIIIIl[81] = (-24849) & 28665;
        lIIIIIIIIl[82] = (-106) & 3055;
        lIIIIIIIIl[83] = (-19) & 3839;
        lIIIIIIIIl[84] = (-((-1801) & 14156)) & (-1041) & 16343;
        lIIIIIIIIl[85] = (-24802) & 27895;
        lIIIIIIIIl[86] = (-537) & 4027;
        lIIIIIIIIl[87] = (59 ^ 98) ^ (8 ^ 112);
    }

    private static String llIllIIllllI(String lIIlIlllIllII, String lIIlIlllIlIll) {
        String str = new String(Base64.getDecoder().decode(lIIlIlllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIlIlllIlIll.toCharArray();
        int lIIlIlllIlIII = lIIIIIIIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIIIl[1];
        while (llIllIlIIlII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIIlIlllIlIII % charArray.length]));
            "".length();
            lIIlIlllIlIII++;
            i++;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIllIlIlIII(int i, int i2) {
        return i > i2;
    }

    private static String llIllIIlllll(String lIIlIllIlIlll, String lIIlIllIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIl[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIllIllIII) {
            lIIlIllIllIII.printStackTrace();
            return null;
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIIIIII[lIIIIIIIIl[75]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v305, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v329, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v52, types: [boolean] */
    public static void ea() {
        if (llIllIlIIIll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[1]];
            C0001b.a(bx);
            if (llIllIlIIlII(bx.size(), lIIIIIIIIl[2])) {
                System.out.println(lIIIIIIIII[lIIIIIIIIl[2]]);
                bv = lIIIIIIIIl[1];
            }
        }
        if (llIllIlIIlIl(bv ? 1 : 0)) {
            if (llIllIlIIlIl(an() ? 1 : 0) && llIllIlIIlII(Game.getWildyLevel(), lIIIIIIIIl[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIllIlIIllI(nearest) && llIllIlIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[3]];
                    C0000a.a(nearest);
                }
                if (llIllIlIIllI(nearest) && llIllIlIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[4]];
                    if (llIllIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIIIIl[5]);
                        "".length();
                    }
                    if (llIllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                        if (llIllIlIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIIIIl[6]);
                            "".length();
                        }
                        if (llIllIlIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIIIIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIIIIIl[4]];
                        iArr[lIIIIIIIIl[1]] = lIIIIIIIIl[7];
                        iArr[lIIIIIIIIl[2]] = lIIIIIIIIl[0];
                        iArr[lIIIIIIIIl[3]] = lIIIIIIIIl[8];
                        if (llIllIlIIlIl(C0004e.d(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIIIIII[lIIIIIIIIl[6]]);
                            bv = lIIIIIIIIl[2];
                            return;
                        }
                        int[] iArr2 = new int[lIIIIIIIIl[4]];
                        iArr2[lIIIIIIIIl[1]] = lIIIIIIIIl[7];
                        iArr2[lIIIIIIIIl[2]] = lIIIIIIIIl[0];
                        iArr2[lIIIIIIIIl[3]] = lIIIIIIIIl[8];
                        if (llIllIlIIIll(C0004e.d(iArr2) ? 1 : 0)) {
                            if (llIllIlIIlIl(Equipment.contains(C0005f.bh) ? 1 : 0)) {
                                C0000a.b(C0005f.bh, lIIIIIIIIl[2]);
                            }
                            C0000a.b(C0005f.bc, lIIIIIIIIl[2]);
                            C0000a.a(lIIIIIIIIl[9], lIIIIIIIIl[10]);
                            C0000a.b(lIIIIIIIIl[0], lIIIIIIIIl[11]);
                        }
                    }
                }
            }
            if (llIllIlIIIll(an() ? 1 : 0)) {
                if (llIllIlIIIll(Inventory.contains(C0005f.bc) ? 1 : 0) && llIllIlIIlII(Movement.getRunEnergy(), lIIIIIIIIl[12])) {
                    Inventory.getFirst(C0005f.bc).interact(lIIIIIIIII[lIIIIIIIIl[13]]);
                    Time.sleepTicks(lIIIIIIIIl[2]);
                    "".length();
                }
                if (llIllIlIIlIl(Movement.isRunEnabled() ? 1 : 0) && llIllIlIlIII(Movement.getRunEnergy(), lIIIIIIIIl[14])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIIIIIIIIl[13]);
                    "".length();
                }
                if (llIllIlIIlII(Game.getWildyLevel(), lIIIIIIIIl[2])) {
                    AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[15]];
                    if (llIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (llIllIlIIlIl(Dialog.isOpen() ? 1 : 0) && llIllIlIIIll(Inventory.contains(C0005f.bh) ? 1 : 0) && llIllIlIlIIl(Players.getLocal().getAnimation(), lIIIIIIIIl[16])) {
                        Inventory.getFirst(C0005f.bh).interact(lIIIIIIIII[lIIIIIIIIl[17]]);
                        Time.sleepTicks(lIIIIIIIIl[3]);
                        "".length();
                    }
                    String[] strArr = new String[lIIIIIIIIl[3]];
                    strArr[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[18]];
                    strArr[lIIIIIIIIl[2]] = lIIIIIIIII[lIIIIIIIIl[19]];
                    C0006g.a(strArr);
                }
                if (llIllIlIIlll(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIIIIIIIIl[2]];
                    iArr3[lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                    if (llIllIlIIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (llIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                            AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[21]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIIIIIIIIl[20]];
                            worldPointArr[lIIIIIIIIl[1]] = new WorldPoint(lIIIIIIIIl[22], lIIIIIIIIl[23], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[2]] = new WorldPoint(lIIIIIIIIl[24], lIIIIIIIIl[25], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[3]] = new WorldPoint(lIIIIIIIIl[26], lIIIIIIIIl[27], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[4]] = new WorldPoint(lIIIIIIIIl[28], lIIIIIIIIl[29], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[6]] = new WorldPoint(lIIIIIIIIl[30], lIIIIIIIIl[31], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[13]] = new WorldPoint(lIIIIIIIIl[32], lIIIIIIIIl[33], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[15]] = new WorldPoint(lIIIIIIIIl[34], lIIIIIIIIl[35], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[17]] = new WorldPoint(lIIIIIIIIl[36], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[18]] = new WorldPoint(lIIIIIIIIl[38], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[19]] = new WorldPoint(lIIIIIIIIl[39], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[21]] = new WorldPoint(lIIIIIIIIl[40], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[41]] = new WorldPoint(lIIIIIIIIl[42], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                            worldPointArr[lIIIIIIIIl[44]] = new WorldPoint(lIIIIIIIIl[45], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIIIIIIIl[2]);
                            "".length();
                        }
                        if (llIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                            AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[41]];
                            String[] strArr2 = new String[lIIIIIIIIl[2]];
                            strArr2[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[44]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIIIIIIIIl[2]];
                            strArr3[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[20]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIIIIIIIIl[2]];
                            strArr4[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[46]];
                            if (llIllIlIIIll(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIIIIIIIII[lIIIIIIIIl[47]]);
                            }
                            if (llIllIlIIllI(nearest2)) {
                                String[] strArr5 = new String[lIIIIIIIIl[2]];
                                strArr5[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[48]];
                                if (llIllIlIIlIl(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIIIIIIIIl[2]];
                                    iArr4[lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIIIIIIIIl[2]];
                                    strArr6[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[49]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIIIIIIIIl[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIIIIIIIIl[2]];
                    iArr5[lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                    if (llIllIlIIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIIIIIIIl[2]];
                        iArr6[lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                        if (llIllIlIIIll(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (llIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[51]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIIIIIIIIl[20]];
                                worldPointArr2[lIIIIIIIIl[1]] = new WorldPoint(lIIIIIIIIl[22], lIIIIIIIIl[23], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[2]] = new WorldPoint(lIIIIIIIIl[24], lIIIIIIIIl[25], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[3]] = new WorldPoint(lIIIIIIIIl[26], lIIIIIIIIl[27], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[4]] = new WorldPoint(lIIIIIIIIl[28], lIIIIIIIIl[29], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[6]] = new WorldPoint(lIIIIIIIIl[30], lIIIIIIIIl[31], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[13]] = new WorldPoint(lIIIIIIIIl[32], lIIIIIIIIl[33], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[15]] = new WorldPoint(lIIIIIIIIl[34], lIIIIIIIIl[35], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[17]] = new WorldPoint(lIIIIIIIIl[36], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[18]] = new WorldPoint(lIIIIIIIIl[38], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[19]] = new WorldPoint(lIIIIIIIIl[39], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[21]] = new WorldPoint(lIIIIIIIIl[40], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[41]] = new WorldPoint(lIIIIIIIIl[42], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                worldPointArr2[lIIIIIIIIl[44]] = new WorldPoint(lIIIIIIIIl[45], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIIIIIIIIl[2]);
                                "".length();
                            }
                            if (llIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[52]];
                                if (!llIllIlIIlIl(Dialog.canLevelUpContinue() ? 1 : 0) || llIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIIIIIIIIl[2]];
                                strArr7[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[14]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIIIIIIIIl[2]];
                                strArr8[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[53]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIIIIIIIIl[2]];
                                strArr9[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[54]];
                                if (llIllIlIIIll(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIIIIIIIII[lIIIIIIIIl[55]]);
                                }
                                if (llIllIlIIllI(nearest4)) {
                                    String[] strArr10 = new String[lIIIIIIIIl[2]];
                                    strArr10[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[56]];
                                    if (llIllIlIIlIl(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (llIllIlIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIIIIIIIIl[2]];
                                            iArr7[lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIIIIIIIIl[3]);
                                            "".length();
                                        }
                                        if (llIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (llIllIlIIlIl(options.isEmpty() ? 1 : 0)) {
                                                int i = lIIIIIIIIl[1];
                                                while (llIllIlIIlII(i, options.size())) {
                                                    int[] iArr8 = new int[lIIIIIIIIl[2]];
                                                    iArr8[lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                                                    if (llIllIlIlIIl(((Item) Inventory.getAll(iArr8).get(lIIIIIIIIl[1])).getQuantity(), lIIIIIIIIl[2]) && llIllIlIIIll(((Widget) options.get(i)).getText().contains(lIIIIIIIII[lIIIIIIIIl[57]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIIIIIIIl[2]);
                                                        Time.sleepTicks(lIIIIIIIIl[3]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIIIIIIIIl[2]];
                                                    iArr9[lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                                                    if (llIllIlIlIIl(((Item) Inventory.getAll(iArr9).get(lIIIIIIIIl[1])).getQuantity(), lIIIIIIIIl[13]) && llIllIlIIIll(((Widget) options.get(i)).getText().contains(lIIIIIIIII[lIIIIIIIIl[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIIIIIIIl[2]);
                                                        Time.sleepTicks(lIIIIIIIIl[3]);
                                                        "".length();
                                                    }
                                                    if (llIllIlIIIll(((Widget) options.get(i)).getText().contains(lIIIIIIIII[lIIIIIIIIl[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIIIIIIIl[2]);
                                                        Time.sleepTicks(lIIIIIIIIl[3]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if (0 != 0) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int[] iArr10 = new int[lIIIIIIIIl[2]];
            iArr10[lIIIIIIIIl[1]] = lIIIIIIIIl[9];
            if (llIllIlIIIll(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIIIIIIIIl[2]];
                iArr11[lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                if (!llIllIlIIlIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIIIIIIIIl[2]];
                iArr12[lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                if (!llIllIlIIlIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (llIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[60]];
                String[] strArr11 = new String[lIIIIIIIIl[2]];
                strArr11[lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[61]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (llIllIlIIllI(nearest6)) {
                    nearest6.interact(lIIIIIIIII[lIIIIIIIIl[62]]);
                }
            }
        }
    }

    private static boolean llIllIlIIIll(int i) {
        return i != 0;
    }

    private static String llIllIlIIIII(String lIIlIllllllII, String lIIlIlllllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIlllllllI = Cipher.getInstance("Blowfish");
            lIIlIlllllllI.init(lIIIIIIIIl[3], secretKeySpec);
            return new String(lIIlIlllllllI.doFinal(Base64.getDecoder().decode(lIIlIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIllllllIl) {
            lIIlIllllllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIllIlIlIll(Skills.getLevel(Skill.PRAYER), lIIIIIIIIl[76])) {
            ?? r0 = lIIIIIIIIl[2];
            "".length();
            return (((27 ^ 23) ^ (110 ^ 101)) & (((18 ^ 99) ^ (48 ^ 70)) ^ (-" ".length()))) != (((((16 + 105) - 86) + 160) ^ (((141 + 142) - 273) + 134)) & (((124 ^ 74) ^ (63 ^ 90)) ^ (-" ".length()))) ? ((((72 + 3) - (-52)) + 54) ^ (((109 + 96) - 179) + 120)) & (((57 ^ 39) ^ (16 ^ 41)) ^ (-" ".length())) : r0;
        }
        return lIIIIIIIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIIIIIl[1];
    }

    private static boolean llIllIlIlIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIllIlIlIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIllIlIIlll(int i) {
        return i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (llIllIlIIIll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        int[] iArr = new int[lIIIIIIIIl[2]];
        iArr[lIIIIIIIIl[1]] = lIIIIIIIIl[9];
        if (llIllIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIIIIIIl[2]];
            iArr2[lIIIIIIIIl[1]] = lIIIIIIIIl[9];
            if (llIllIlIlIll(Inventory.getFirst(iArr2).getQuantity(), lIIIIIIIIl[12])) {
                if (llIllIlIIlIl(Inventory.contains(C0005f.bh) ? 1 : 0)) {
                    if (llIllIlIIIll(Equipment.contains(C0005f.bh) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIIIIIIl[2]];
                        iArr3[lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                        if (llIllIlIIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIIIIIIl[2]];
                            iArr4[lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                        }
                    }
                }
                ?? r0 = lIIIIIIIIl[2];
                "".length();
                return (((131 ^ 155) ^ (167 ^ 133)) & (((45 ^ 56) ^ (83 ^ 124)) ^ (-" ".length()))) < 0 ? ((95 ^ 91) ^ (50 ^ 99)) & (((((116 + 5) - (-10)) + 62) ^ (((20 + 58) - 6) + 76)) ^ (-" ".length())) : r0;
            }
        }
        return lIIIIIIIIl[1];
    }

    static {
        llIllIlIIIlI();
        llIllIlIIIIl();
        mz = new WorldPoint(lIIIIIIIIl[78], lIIIIIIIIl[79], lIIIIIIIIl[1]);
        mA = new WorldPoint(lIIIIIIIIl[80], lIIIIIIIIl[81], lIIIIIIIIl[1]);
        mB = new WorldPoint(lIIIIIIIIl[82], lIIIIIIIIl[83], lIIIIIIIIl[1]);
        mC = new WorldPoint(lIIIIIIIIl[84], lIIIIIIIIl[43], lIIIIIIIIl[1]);
        mD = new WorldPoint(lIIIIIIIIl[1], lIIIIIIIIl[1], lIIIIIIIIl[1]);
        mE = new WorldPoint(lIIIIIIIIl[1], lIIIIIIIIl[1], lIIIIIIIIl[1]);
        mF = new WorldPoint(lIIIIIIIIl[85], lIIIIIIIIl[86], lIIIIIIIIl[1]);
        bx = new ArrayList();
    }
}
