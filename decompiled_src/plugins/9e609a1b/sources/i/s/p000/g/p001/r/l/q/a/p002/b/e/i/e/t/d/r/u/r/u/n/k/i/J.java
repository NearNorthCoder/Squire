package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.J  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/J.class */
public class J implements M {
    static /* synthetic */ int bY;
    public static final /* synthetic */ WorldPoint hR;
    public static final /* synthetic */ WorldPoint hO;
    public static final /* synthetic */ WorldPoint hQ;
    private static /* synthetic */ int[] lIIIllllIIIIl;
    public static final /* synthetic */ String[] hS;
    public static final /* synthetic */ WorldPoint hP;
    static /* synthetic */ boolean cp;
    static /* synthetic */ int co;
    private static /* synthetic */ String[] lIIIlllIlllll;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ List<C0003d> bA;

    private static boolean lIlIIlIlIlIlIII(int i2) {
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIlIlIlllI(C0004e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[7]) && lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hR), lIIIllllIIIIl[43])) {
            ?? r0 = lIIIllllIIIIl[1];
            "".length();
            return (63 ^ 59) > (185 ^ 189) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIllllIIIIl[0];
    }

    private static boolean lIlIIlIlIlIlIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIlIlIlIll(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIllllIIIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        String[] strArr = new String[lIIIllllIIIIl[1]];
        strArr[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[47]];
        if (lIlIIlIlIlIIIll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIIIllllIIIIl[1]];
            strArr2[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[48]];
            if (lIlIIlIlIlIIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIIIllllIIIIl[1]];
                strArr3[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[49]];
                if (lIlIIlIlIlIIIll(Inventory.contains(strArr3) ? 1 : 0)) {
                    ?? r0 = lIIIllllIIIIl[1];
                    "".length();
                    return " ".length() == 0 ? ((((187 + 69) - 248) + 201) ^ (((113 + 21) - 27) + 31)) & (((((236 + 50) - 36) + 5) ^ (((26 + 5) - (-96)) + 37)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIIllllIIIIl[0];
    }

    private static String lIlIIlIlIIlIIIl(String lllllllllllllllIIIIIIlllllllllll, String lllllllllllllllIIIIIIllllllllllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIIIIIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIllllllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllllIIIIl[5], lllllllllllllllIIIIIlIIIIIIIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIIIIIIIIII) {
            lllllllllllllllIIIIIlIIIIIIIIIII.printStackTrace();
            return null;
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cx();
            "".length();
            if ((-((68 ^ 90) ^ (23 ^ 12))) >= 0) {
                return ((((136 + 127) - 119) + 16) ^ (((74 + 130) - 96) + 67)) & (((((27 + 54) - 43) + 97) ^ (((86 + 45) - 66) + 71)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIllllIIIIl[59];
    }

    private static boolean lIlIIlIlIlIIlII(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIlIlIlIIlll(int i2) {
        return i2 < 0;
    }

    private static boolean lIlIIlIlIlIlIlI(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlIIlIlIlIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIlIlIlIIlIl(int i2) {
        return i2 == 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIlllll[lIIIllllIIIIl[60]];
    }

    private static boolean lIlIIlIlIlIIIll(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIlIlIlIllII(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlIIlIlIlIIllI(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIlIlIlIlllI(int i2, int i3) {
        return i2 >= i3;
    }

    static {
        lIlIIlIlIlIIIIl();
        lIlIIlIlIlIIIII();
        hO = new WorldPoint(lIIIllllIIIIl[62], lIIIllllIIIIl[63], lIIIllllIIIIl[0]);
        hP = new WorldPoint(lIIIllllIIIIl[64], lIIIllllIIIIl[65], lIIIllllIIIIl[0]);
        hQ = new WorldPoint(lIIIllllIIIIl[66], lIIIllllIIIIl[67], lIIIllllIIIIl[0]);
        hR = new WorldPoint(lIIIllllIIIIl[68], lIIIllllIIIIl[69], lIIIllllIIIIl[0]);
        String[] strArr = new String[lIIIllllIIIIl[10]];
        strArr[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[70]];
        strArr[lIIIllllIIIIl[1]] = lIIIlllIlllll[lIIIllllIIIIl[53]];
        strArr[lIIIllllIIIIl[5]] = lIIIlllIlllll[lIIIllllIIIIl[71]];
        strArr[lIIIllllIIIIl[7]] = lIIIlllIlllll[lIIIllllIIIIl[72]];
        hS = strArr;
        bA = new ArrayList();
        bY = lIIIllllIIIIl[0];
    }

    private static String lIlIIlIlIIlIIII(String lllllllllllllllIIIIIlIIIIIlIIlII, String lllllllllllllllIIIIIlIIIIIlIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), lIIIllllIIIIl[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllllIIIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIIIIlIIlIl) {
            lllllllllllllllIIIIIlIIIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIlIlIIIII() {
        lIIIlllIlllll = new String[lIIIllllIIIIl[73]];
        lIIIlllIlllll[lIIIllllIIIIl[0]] = lIlIIlIlIIIllll("NwUBGRgSUBEEExgD", "upxpv");
        lIIIlllIlllll[lIIIllllIIIIl[1]] = lIlIIlIlIIlIIII("RHcxnzdmt07nzhk5WcL7sDOv4+CfZqxIhuXse5uN9ekfxKUBLS0wTRNa64+znDWg", "FdRnu");
        lIIIlllIlllll[lIIIllllIIIIl[5]] = lIlIIlIlIIlIIII("sNmgq78BJ7E=", "sSwCp");
        lIIIlllIlllll[lIIIllllIIIIl[7]] = lIlIIlIlIIlIIIl("NR2OUs9V+lk=", "cmcsy");
        lIIIlllIlllll[lIIIllllIIIIl[10]] = lIlIIlIlIIIllll("JDUgSxcFdDQKDQE=", "jTVkc");
        lIIIlllIlllll[lIIIllllIIIIl[11]] = lIlIIlIlIIIllll("LikJICYPJgBkKAcmDC0kAQ==", "fHgDJ");
        lIIIlllIlllll[lIIIllllIIIIl[18]] = lIlIIlIlIIlIIIl("aPwhTYCdh8SUjz1X9ZkCruWXRolWALMh4Bj3LmTeLpa6Vd5k1UlU1erKCUFWgfSpy2TjDFpFRKc=", "jaKNv");
        lIIIlllIlllll[lIIIllllIIIIl[20]] = lIlIIlIlIIlIIII("Jv4g+orPBy6Tfs6+gY8vmg==", "Ujapy");
        lIIIlllIlllll[lIIIllllIIIIl[21]] = lIlIIlIlIIIllll("BwgCIQ==", "PmcSY");
        lIIIlllIlllll[lIIIllllIIIIl[22]] = lIlIIlIlIIIllll("ISohEhkbLG0XABY=", "uKMyp");
        lIIIlllIlllll[lIIIllllIIIIl[3]] = lIlIIlIlIIlIIII("b4HyOyY0aGk=", "lgTdO");
        lIIIlllIlllll[lIIIllllIIIIl[23]] = lIlIIlIlIIlIIIl("4i4VJ9b1oQUw7B3MehAS/A==", "eguMZ");
        lIIIlllIlllll[lIIIllllIIIIl[24]] = lIlIIlIlIIlIIII("UQ7nZeLxFTrOEj3VpPqPcA==", "SnreL");
        lIIIlllIlllll[lIIIllllIIIIl[25]] = lIlIIlIlIIlIIII("RMWKk16l0etv3FYSzLu/jQ==", "nIJyA");
        lIIIlllIlllll[lIIIllllIIIIl[26]] = lIlIIlIlIIIllll("GCYxBw==", "ZCTuC");
        lIIIlllIlllll[lIIIllllIIIIl[27]] = lIlIIlIlIIlIIII("6jqEHOvuBYE=", "FpOJw");
        lIIIlllIlllll[lIIIllllIIIIl[28]] = lIlIIlIlIIIllll("AiwBOGgiIk03OiMjBg==", "VMmSH");
        lIIIlllIlllll[lIIIllllIIIIl[29]] = lIlIIlIlIIIllll("MgJoPiYEHCcB", "vpHvG");
        lIIIlllIlllll[lIIIllllIIIIl[30]] = lIlIIlIlIIlIIII("ogKi0sQ1D88=", "KrQkd");
        lIIIlllIlllll[lIIIllllIIIIl[31]] = lIlIIlIlIIlIIIl("y6+5Jm6WgBg=", "swQFp");
        lIIIlllIlllll[lIIIllllIIIIl[32]] = lIlIIlIlIIIllll("GSg4dzI4aT0jJz47PQ==", "WINWF");
        lIIIlllIlllll[lIIIllllIIIIl[34]] = lIlIIlIlIIlIIII("XA1yhaXBRXeOUqejtl/EBQ==", "cRdEk");
        lIIIlllIlllll[lIIIllllIIIIl[35]] = lIlIIlIlIIIllll("PRAtDTMEFmECNR0fYRUuCxgzFQ==", "jqAfZ");
        lIIIlllIlllll[lIIIllllIIIIl[36]] = lIlIIlIlIIlIIIl("iPg3sCh70Zw=", "Aqepl");
        lIIIlllIlllll[lIIIllllIIIIl[37]] = lIlIIlIlIIIllll("ICghGGAzJjod", "wIMsM");
        lIIIlllIlllll[lIIIllllIIIIl[38]] = lIlIIlIlIIlIIIl("Qz9dKm+iST6vq4oWvhLUJg==", "kXZyC");
        lIIIlllIlllll[lIIIllllIIIIl[39]] = lIlIIlIlIIlIIII("Oodb3ZUQ8K04E++usYVxFA==", "Uiujk");
        lIIIlllIlllll[lIIIllllIIIIl[40]] = lIlIIlIlIIlIIIl("Cn/m4gz4KoE=", "WNRXc");
        lIIIlllIlllll[lIIIllllIIIIl[41]] = lIlIIlIlIIlIIII("1bSBt2K7acI=", "iemdO");
        lIIIlllIlllll[lIIIllllIIIIl[42]] = lIlIIlIlIIlIIII("PASM+vcrkDULFch5+2OvYg==", "oppJC");
        lIIIlllIlllll[lIIIllllIIIIl[43]] = lIlIIlIlIIIllll("KQ4qPBIGCSo=", "ogMTf");
        lIIIlllIlllll[lIIIllllIIIIl[44]] = lIlIIlIlIIIllll("AA4qGgk=", "WgOvm");
        lIIIlllIlllll[lIIIllllIIIIl[45]] = lIlIIlIlIIlIIIl("qkoBz5xanuM=", "hpVpA");
        lIIIlllIlllll[lIIIllllIIIIl[46]] = lIlIIlIlIIIllll("IyEjJTs=", "aSFDP");
        lIIIlllIlllll[lIIIllllIIIIl[47]] = lIlIIlIlIIlIIIl("Xww2KlGHkPw=", "JBCxH");
        lIIIlllIlllll[lIIIllllIIIIl[48]] = lIlIIlIlIIIllll("KzkXOiYP", "lXeVO");
        lIIIlllIlllll[lIIIllllIIIIl[49]] = lIlIIlIlIIIllll("Ig4/BTcY", "joRhR");
        lIIIlllIlllll[lIIIllllIIIIl[60]] = lIlIIlIlIIlIIIl("/2lQKdsD2UpdUcMgl/vhlTEQP3h3Mn+Z", "SITcG");
        lIIIlllIlllll[lIIIllllIIIIl[61]] = lIlIIlIlIIIllll("HQw0LUwAA3o9CQ4JLiJMRw==", "oeZJl");
        lIIIlllIlllll[lIIIllllIIIIl[70]] = lIlIIlIlIIlIIIl("wgIoCiP1H3rPIikfM2ihsRK1b4tv5wZ7ejpnKDxplc0=", "dbYyV");
        lIIIlllIlllll[lIIIllllIIIIl[53]] = lIlIIlIlIIIllll("MFMDPSACAEQ+J1EKCyQzURUNPyQCB0QwLRRTFD0kEAABfw==", "qsdQA");
        lIIIlllIlllll[lIIIllllIIIIl[71]] = lIlIIlIlIIlIIIl("NCQ9BuEQ1gbdhZvTo5sF0j9qBcncN83c", "UtBLi");
        lIIIlllIlllll[lIIIllllIIIIl[72]] = lIlIIlIlIIIllll("Ey4fSQ==", "JKlgd");
    }

    private static int lIlIIlIlIlIIIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIlIIlIlIlIIIIl() {
        lIIIllllIIIIl = new int[74];
        lIIIllllIIIIl[0] = ((108 ^ 75) ^ (149 ^ 168)) & (((108 ^ 8) ^ (227 ^ 157)) ^ (-" ".length()));
        lIIIllllIIIIl[1] = " ".length();
        lIIIllllIIIIl[2] = (248 ^ 187) ^ "  ".length();
        lIIIllllIIIIl[3] = (106 ^ 102) ^ (107 ^ 109);
        lIIIllllIIIIl[4] = 72 ^ 14;
        lIIIllllIIIIl[5] = "  ".length();
        lIIIllllIIIIl[6] = (-1669) & 2047;
        lIIIllllIIIIl[7] = "   ".length();
        lIIIllllIIIIl[8] = (-((-1679) & 16031)) & (-1037) & 16383;
        lIIIllllIIIIl[9] = ((177 + 110) - 283) + 174;
        lIIIllllIIIIl[10] = "  ".length() ^ (40 ^ 46);
        lIIIllllIIIIl[11] = (120 ^ 104) ^ (115 ^ 102);
        lIIIllllIIIIl[12] = (-((-5581) & 15839)) & (-17506) & 32763;
        lIIIllllIIIIl[13] = (-((-13753) & 32187)) & (-4225) & 24575;
        lIIIllllIIIIl[14] = (-((-3591) & 15959)) & (-18721) & 32638;
        lIIIllllIIIIl[15] = (-((-2347) & 7663)) & (-513) & 8175;
        lIIIllllIIIIl[16] = (-((-21069) & 29389)) & (-57) & 16383;
        lIIIllllIIIIl[17] = (-((-33) & 27371)) & (-1) & 28671;
        lIIIllllIIIIl[18] = 115 ^ 117;
        lIIIllllIIIIl[19] = (-((-31433) & 31722)) & (-20481) & 32747;
        lIIIllllIIIIl[20] = (130 ^ 150) ^ (154 ^ 137);
        lIIIllllIIIIl[21] = (((75 + 56) - 43) + 59) ^ (((139 + 119) - 191) + 88);
        lIIIllllIIIIl[22] = (((27 + 114) - 101) + 104) ^ (((40 + 81) - 55) + 87);
        lIIIllllIIIIl[23] = (((106 + 71) - 142) + 142) ^ (((0 + 145) - 18) + 59);
        lIIIllllIIIIl[24] = 207 ^ 195;
        lIIIllllIIIIl[25] = 92 ^ 81;
        lIIIllllIIIIl[26] = (123 ^ 72) ^ (99 ^ 94);
        lIIIllllIIIIl[27] = 8 ^ 7;
        lIIIllllIIIIl[28] = (((16 + 11) - (-80)) + 72) ^ (((58 + 155) - 177) + 127);
        lIIIllllIIIIl[29] = (((104 + 32) - 16) + 42) ^ (((68 + 48) - 102) + 165);
        lIIIllllIIIIl[30] = 119 ^ 101;
        lIIIllllIIIIl[31] = 66 ^ 81;
        lIIIllllIIIIl[32] = 83 ^ 71;
        lIIIllllIIIIl[33] = (-((-1993) & 24573)) & (-9474) & 32767;
        lIIIllllIIIIl[34] = 44 ^ 57;
        lIIIllllIIIIl[35] = (56 ^ 103) ^ (241 ^ 184);
        lIIIllllIIIIl[36] = 153 ^ 142;
        lIIIllllIIIIl[37] = 153 ^ 129;
        lIIIllllIIIIl[38] = (146 ^ 151) ^ (169 ^ 181);
        lIIIllllIIIIl[39] = (((132 + 2) - 11) + 20) ^ (((82 + 54) - 79) + 92);
        lIIIllllIIIIl[40] = 73 ^ 82;
        lIIIllllIIIIl[41] = 102 ^ 122;
        lIIIllllIIIIl[42] = 47 ^ 50;
        lIIIllllIIIIl[43] = 170 ^ 180;
        lIIIllllIIIIl[44] = (108 ^ 105) ^ (49 ^ 43);
        lIIIllllIIIIl[45] = (19 ^ 125) ^ (55 ^ 121);
        lIIIllllIIIIl[46] = (128 ^ 154) ^ (97 ^ 90);
        lIIIllllIIIIl[47] = 190 ^ 156;
        lIIIllllIIIIl[48] = 47 ^ 12;
        lIIIllllIIIIl[49] = 128 ^ 164;
        lIIIllllIIIIl[50] = (-2194) & 8093;
        lIIIllllIIIIl[51] = (-((-17673) & 24394)) & (-147) & 32767;
        lIIIllllIIIIl[52] = (-16418) & 32317;
        lIIIllllIIIIl[53] = 0 ^ 40;
        lIIIllllIIIIl[54] = (-((-2051) & 15975)) & (-18441) & 32764;
        lIIIllllIIIIl[55] = (-(108 ^ 104)) & (-16689) & 28671;
        lIIIllllIIIIl[56] = (-((-28711) & 31806)) & (-513) & 28607;
        lIIIllllIIIIl[57] = (-((-525) & 4765)) & (-10244) & 16383;
        lIIIllllIIIIl[58] = (-((-12561) & 32691)) & (-9) & 32763;
        lIIIllllIIIIl[59] = (54 ^ 31) ^ (25 ^ 84);
        lIIIllllIIIIl[60] = (((137 + 16) - 92) + 117) ^ (((124 + 136) - 120) + 11);
        lIIIllllIIIIl[61] = (92 ^ 28) ^ (228 ^ 130);
        lIIIllllIIIIl[62] = (-21217) & 24314;
        lIIIllllIIIIl[63] = (-4649) & 7916;
        lIIIllllIIIIl[64] = (-((-2051) & 15179)) & (-1) & 16351;
        lIIIllllIIIIl[65] = (-25241) & 28635;
        lIIIllllIIIIl[66] = (-28881) & 31996;
        lIIIllllIIIIl[67] = (-20675) & 24030;
        lIIIllllIIIIl[68] = (-13073) & 16149;
        lIIIllllIIIIl[69] = (-2065) & 11835;
        lIIIllllIIIIl[70] = (136 ^ 183) ^ (96 ^ 120);
        lIIIllllIIIIl[71] = (253 ^ 189) ^ (32 ^ 73);
        lIIIllllIIIIl[72] = (136 ^ 168) ^ (125 ^ 119);
        lIIIllllIIIIl[73] = (169 ^ 176) ^ (27 ^ 41);
    }

    private static void W() {
        int[] iArr = new int[lIIIllllIIIIl[1]];
        iArr[lIIIllllIIIIl[0]] = lIIIllllIIIIl[13];
        if (lIlIIlIlIlIIlIl(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIIl[13], lIIIllllIIIIl[1], lIIIllllIIIIl[50]));
            "".length();
        }
        int[] iArr2 = new int[lIIIllllIIIIl[1]];
        iArr2[lIIIllllIIIIl[0]] = lIIIllllIIIIl[15];
        if (lIlIIlIlIlIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIIl[15], lIIIllllIIIIl[1], lIIIllllIIIIl[50]));
            "".length();
        }
        int[] iArr3 = new int[lIIIllllIIIIl[1]];
        iArr3[lIIIllllIIIIl[0]] = lIIIllllIIIIl[17];
        if (lIlIIlIlIlIIlIl(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIIl[17], lIIIllllIIIIl[1], lIIIllllIIIIl[51]));
            "".length();
        }
        int[] iArr4 = new int[lIIIllllIIIIl[1]];
        iArr4[lIIIllllIIIIl[0]] = lIIIllllIIIIl[14];
        if (lIlIIlIlIlIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIIl[14], lIIIllllIIIIl[1], lIIIllllIIIIl[50]));
            "".length();
        }
        int[] iArr5 = new int[lIIIllllIIIIl[1]];
        iArr5[lIIIllllIIIIl[0]] = lIIIllllIIIIl[19];
        if (lIlIIlIlIlIIlIl(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIIl[19], lIIIllllIIIIl[1], lIIIllllIIIIl[52]));
            "".length();
        }
        int[] iArr6 = new int[lIIIllllIIIIl[1]];
        iArr6[lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
        if (lIlIIlIlIlIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIIl[6], lIIIllllIIIIl[3], lIIIllllIIIIl[50]));
            "".length();
        }
        int[] iArr7 = new int[lIIIllllIIIIl[1]];
        iArr7[lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
        if (lIlIIlIlIlIIIll(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIIIllllIIIIl[1]];
            iArr8[lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
            if (lIlIIlIlIlIIlII(Bank.getFirst(iArr8).getQuantity(), lIIIllllIIIIl[32])) {
                bA.add(new C0003d(lIIIllllIIIIl[6], lIIIllllIIIIl[53], lIIIllllIIIIl[54]));
                "".length();
            }
        }
        if (lIlIIlIlIlIIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlllIlllll[lIIIllllIIIIl[61]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIIl[55], lIIIllllIIIIl[11], lIIIllllIIIIl[56]));
            "".length();
        }
        int[] iArr9 = new int[lIIIllllIIIIl[1]];
        iArr9[lIIIllllIIIIl[0]] = lIIIllllIIIIl[16];
        if (lIlIIlIlIlIIlIl(Bank.contains(iArr9) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIIl[16], lIIIllllIIIIl[53], lIIIllllIIIIl[57]));
            "".length();
        }
        int[] iArr10 = new int[lIIIllllIIIIl[1]];
        iArr10[lIIIllllIIIIl[0]] = lIIIllllIIIIl[58];
        if (lIlIIlIlIlIIlIl(Bank.contains(iArr10) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIIl[58], lIIIllllIIIIl[11], C0007h.bv));
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0142, code lost:
        if (lIlIIlIlIlIlIII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x054a, code lost:
        if (lIlIIlIlIlIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v369, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cx() {
        if (lIlIIlIlIlIIIll(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[0]];
            C0001b.a(bA);
            if (lIlIIlIlIlIIlII(bA.size(), lIIIllllIIIIl[1])) {
                System.out.println(lIIIlllIlllll[lIIIllllIIIIl[1]]);
                by = lIIIllllIIIIl[0];
            }
        }
        if (lIlIIlIlIlIIlIl(by ? 1 : 0) && lIlIIlIlIlIIlII(C0004e.j(lIIIllllIIIIl[2]), lIIIllllIIIIl[3])) {
            C0014o.aI();
        }
        if (lIlIIlIlIlIIlIl(by ? 1 : 0) && lIlIIlIlIlIIllI(C0004e.j(lIIIllllIIIIl[2]), lIIIllllIIIIl[3])) {
            if (lIlIIlIlIlIIIll(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIlIlIlIIlII(Movement.getRunEnergy(), lIIIllllIIIIl[4])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIlllIlllll[lIIIllllIIIIl[5]]);
                Time.sleepTicks(lIIIllllIIIIl[1]);
                "".length();
            }
            if (lIlIIlIlIlIIlll(lIlIIlIlIlIIIlI(C0004e.v(), 70.0d))) {
                int[] iArr = new int[lIIIllllIIIIl[1]];
                iArr[lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
                if (lIlIIlIlIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIllllIIIIl[1]];
                    iArr2[lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
                    Inventory.getFirst(iArr2).interact(lIIIlllIlllll[lIIIllllIIIIl[7]]);
                }
            }
            if (lIlIIlIlIlIIlIl(Movement.isRunEnabled() ? 1 : 0) && lIlIIlIlIlIlIII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIIlIlIlIIIll(S() ? 1 : 0)) {
                int[] iArr3 = new int[lIIIllllIIIIl[1]];
                iArr3[lIIIllllIIIIl[0]] = lIIIllllIIIIl[8];
            }
            if (lIlIIlIlIlIIlII(C0004e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIlIlIlIIl(nearest) && lIlIIlIlIlIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[10]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIllllIIIIl[5]);
                    "".length();
                }
                if (lIlIIlIlIlIlIIl(nearest) && lIlIIlIlIlIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[11]];
                    if (lIlIIlIlIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIllllIIIIl[12]);
                        "".length();
                    }
                    if (lIlIIlIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIlIlIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIllllIIIIl[10]);
                            "".length();
                        }
                        if (lIlIIlIlIlIlIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIllllIIIIl[5]);
                            "".length();
                        }
                        int[] iArr4 = new int[lIIIllllIIIIl[11]];
                        iArr4[lIIIllllIIIIl[0]] = lIIIllllIIIIl[13];
                        iArr4[lIIIllllIIIIl[1]] = lIIIllllIIIIl[14];
                        iArr4[lIIIllllIIIIl[5]] = lIIIllllIIIIl[15];
                        iArr4[lIIIllllIIIIl[7]] = lIIIllllIIIIl[16];
                        iArr4[lIIIllllIIIIl[10]] = lIIIllllIIIIl[17];
                        if (lIlIIlIlIlIIlIl(C0004e.b(iArr4) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllIlllll[lIIIllllIIIIl[18]]);
                            by = lIIIllllIIIIl[1];
                            return;
                        }
                        Bank.withdraw(lIIIllllIIIIl[13], lIIIllllIIIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIIIIl[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIIIIl[14], lIIIllllIIIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIIIIl[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIIIIl[15], lIIIllllIIIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIIIIl[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIIIIl[16], lIIIllllIIIIl[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIIIIl[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIIIIl[19], lIIIllllIIIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIIIIl[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIIIIl[17], lIIIllllIIIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIIIIl[1]);
                        "".length();
                        C0000a.b(C0005f.ba, lIIIllllIIIIl[1]);
                        C0000a.a(lIIIllllIIIIl[6], lIIIllllIIIIl[3]);
                        C0000a.b(C0005f.bk, lIIIllllIIIIl[1]);
                    }
                }
            }
            if (lIlIIlIlIlIIIll(S() ? 1 : 0) && lIlIIlIlIlIIlII(C0004e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[1])) {
                if (lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hO), lIIIllllIIIIl[5])) {
                    AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[20]];
                    if (lIlIIlIlIlIIlIl(Equipment.contains(C0005f.aW) ? 1 : 0) && lIlIIlIlIlIIIll(Inventory.contains(C0005f.aW) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aW).interact(lIIIlllIlllll[lIIIllllIIIIl[21]]);
                        Time.sleepTicks(lIIIllllIIIIl[1]);
                        "".length();
                    }
                    if (lIlIIlIlIlIIlII(bY, lIIIllllIIIIl[1])) {
                        C0004e.w();
                        bY += lIIIllllIIIIl[1];
                    }
                    Movement.walkTo(hO);
                    "".length();
                    Time.sleepTicks(lIIIllllIIIIl[1]);
                    "".length();
                }
                if (lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hO), lIIIllllIIIIl[7])) {
                    AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[22]];
                    C0006g.a(lIIIlllIlllll[lIIIllllIIIIl[3]], hS);
                }
            }
            if (lIlIIlIlIlIIllI(C0004e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[1])) {
                co = lIIIllllIIIIl[0];
                if (lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIllllIIIIl[21])) {
                    AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[23]];
                    Movement.walkTo(hP);
                    "".length();
                    Time.sleepTicks(lIIIllllIIIIl[1]);
                    "".length();
                }
                if (lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIllllIIIIl[21])) {
                    AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[24]];
                    C0006g.a(lIIIlllIlllll[lIIIllllIIIIl[25]], hS);
                }
            }
            if (lIlIIlIlIlIIllI(C0004e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[5])) {
                String[] strArr = new String[lIIIllllIIIIl[1]];
                strArr[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[26]];
                if (lIlIIlIlIlIIlIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIllllIIIIl[1]];
                    strArr2[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[27]];
                }
                AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[28]];
                C0006g.a(lIIIlllIlllll[lIIIllllIIIIl[29]], hS);
                C0006g.a(hS);
            }
            if (lIlIIlIlIlIIllI(C0004e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[5])) {
                String[] strArr3 = new String[lIIIllllIIIIl[1]];
                strArr3[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[30]];
                if (lIlIIlIlIlIIlIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIllllIIIIl[1]];
                    strArr4[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[31]];
                    if (lIlIIlIlIlIIIll(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hQ), lIIIllllIIIIl[5]) && lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hR), lIIIllllIIIIl[3])) {
                            AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[32]];
                            if (lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIllllIIIIl[3]) && lIlIIlIlIlIIIll(Equipment.contains(C0005f.aW) ? 1 : 0) && lIlIIlIlIlIllII(Players.getLocal().getAnimation(), lIIIllllIIIIl[33])) {
                                Equipment.getFirst(C0005f.aW).interact(lIIIlllIlllll[lIIIllllIIIIl[34]]);
                                Time.sleepTicks(lIIIllllIIIIl[7]);
                                "".length();
                            }
                            Movement.walkTo(hQ);
                            "".length();
                            Time.sleepTicks(lIIIllllIIIIl[1]);
                            "".length();
                        }
                        if (lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hQ), lIIIllllIIIIl[10])) {
                            AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[35]];
                            String[] strArr5 = new String[lIIIllllIIIIl[1]];
                            strArr5[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[36]];
                            TileObjects.getNearest(strArr5).interact(lIIIlllIlllll[lIIIllllIIIIl[37]]);
                            Time.sleepTicks(lIIIllllIIIIl[7]);
                            "".length();
                        }
                        if (lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hR), lIIIllllIIIIl[3])) {
                            String[] strArr6 = new String[lIIIllllIIIIl[1]];
                            strArr6[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[38]];
                            if (lIlIIlIlIlIllIl(NPCs.getNearest(strArr6))) {
                                AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[39]];
                                if (lIlIIlIlIlIIlII(co, lIIIllllIIIIl[1])) {
                                    P.lm += lIIIllllIIIIl[1];
                                    P.d(AccBuilderRat.m);
                                    co += lIIIllllIIIIl[1];
                                    P.lm = lIIIllllIIIIl[0];
                                    cp = lIIIllllIIIIl[0];
                                }
                                String[] strArr7 = new String[lIIIllllIIIIl[1]];
                                strArr7[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[40]];
                                TileObjects.getNearest(strArr7).interact(lIIIlllIlllll[lIIIllllIIIIl[41]]);
                                Time.sleepTicks(lIIIllllIIIIl[10]);
                                "".length();
                            }
                            String[] strArr8 = new String[lIIIllllIIIIl[1]];
                            strArr8[lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[42]];
                            NPC nearest2 = NPCs.getNearest(strArr8);
                            if (lIlIIlIlIlIlIIl(nearest2)) {
                                AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[43]];
                                int[] iArr5 = new int[lIIIllllIIIIl[1]];
                                iArr5[lIIIllllIIIIl[0]] = lIIIllllIIIIl[17];
                                if (lIlIIlIlIlIIlIl(Equipment.contains(iArr5) ? 1 : 0)) {
                                    int[] iArr6 = new int[lIIIllllIIIIl[1]];
                                    iArr6[lIIIllllIIIIl[0]] = lIIIllllIIIIl[17];
                                    if (lIlIIlIlIlIIIll(Inventory.contains(iArr6) ? 1 : 0)) {
                                        int[] iArr7 = new int[lIIIllllIIIIl[1]];
                                        iArr7[lIIIllllIIIIl[0]] = lIIIllllIIIIl[17];
                                        Inventory.getFirst(iArr7).interact(lIIIlllIlllll[lIIIllllIIIIl[44]]);
                                        Time.sleepTicks(lIIIllllIIIIl[1]);
                                        "".length();
                                    }
                                }
                                if (lIlIIlIlIlIllIl(Players.getLocal().getInteracting()) && lIlIIlIlIlIIlIl(nearest2.isDead() ? 1 : 0)) {
                                    nearest2.interact(lIIIlllIlllll[lIIIllllIIIIl[45]]);
                                    Time.sleepTicks(lIIIllllIIIIl[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (lIlIIlIlIlIIllI(C0004e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[7]) && lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hR), lIIIllllIIIIl[3])) {
                int[] iArr8 = new int[lIIIllllIIIIl[1]];
                iArr8[lIIIllllIIIIl[0]] = lIIIllllIIIIl[16];
                if (lIlIIlIlIlIIIll(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIIIllllIIIIl[1]];
                    iArr9[lIIIllllIIIIl[0]] = lIIIllllIIIIl[16];
                    Inventory.getFirst(iArr9).interact(lIIIlllIlllll[lIIIllllIIIIl[46]]);
                    Time.sleepTicks(lIIIllllIIIIl[5]);
                    "".length();
                }
            }
            C0006g.a(new String[lIIIllllIIIIl[0]]);
        }
    }

    private static String lIlIIlIlIIIllll(String lllllllllllllllIIIIIlIIIIIIlIlII, String lllllllllllllllIIIIIlIIIIIIlIIll) {
        String lllllllllllllllIIIIIlIIIIIIlIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIIlIIIIIIlIIIl = lllllllllllllllIIIIIlIIIIIIlIIll.toCharArray();
        int lllllllllllllllIIIIIlIIIIIIlIIII = lIIIllllIIIIl[0];
        char[] charArray = lllllllllllllllIIIIIlIIIIIIlIlII2.toCharArray();
        int length = charArray.length;
        int i2 = lIIIllllIIIIl[0];
        while (lIlIIlIlIlIIlII(i2, length)) {
            char lllllllllllllllIIIIIlIIIIIIlIlIl = charArray[i2];
            sb.append((char) (lllllllllllllllIIIIIlIIIIIIlIlIl ^ lllllllllllllllIIIIIlIIIIIIlIIIl[lllllllllllllllIIIIIlIIIIIIlIIII % lllllllllllllllIIIIIlIIIIIIlIIIl.length]));
            "".length();
            lllllllllllllllIIIIIlIIIIIIlIIII++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
