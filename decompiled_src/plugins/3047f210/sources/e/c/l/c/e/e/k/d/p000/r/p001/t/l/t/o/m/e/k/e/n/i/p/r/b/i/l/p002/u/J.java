package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.J  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/J.class */
public class J implements S {
    static /* synthetic */ WorldPoint hP;
    static /* synthetic */ WorldPoint gf;
    static /* synthetic */ boolean cl;
    static /* synthetic */ String[] bQ;
    public static /* synthetic */ List<C0003d> bu;
    static /* synthetic */ WorldPoint hQ;
    static /* synthetic */ WorldPoint hR;
    static /* synthetic */ WorldPoint hO;
    static /* synthetic */ int ck;
    private static /* synthetic */ int[] llllIllIII;
    private static /* synthetic */ String[] llllIlIllI;
    public static /* synthetic */ boolean bs;
    private static final /* synthetic */ int hM;
    static /* synthetic */ boolean hS;
    static /* synthetic */ WorldPoint hN;

    private static String llIlIIIIIIlIl(String lllllllllllllllllIlIlIIllIllIlII, String lllllllllllllllllIlIlIIllIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIllIllIlIl.getBytes(StandardCharsets.UTF_8)), llllIllIII[20]), "DES");
            Cipher lllllllllllllllllIlIlIIllIlllIII = Cipher.getInstance("DES");
            lllllllllllllllllIlIlIIllIlllIII.init(llllIllIII[4], secretKeySpec);
            return new String(lllllllllllllllllIlIlIIllIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIIllIllIlll) {
            lllllllllllllllllIlIlIIllIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIIIllII(int i) {
        return i != 0;
    }

    private static void llIlIIIIIlIIl() {
        llllIlIllI = new String[llllIllIII[129]];
        llllIlIllI[llllIllIII[1]] = llIlIIIIIIIll("Pgc/MTkQCzV4KA0XODYtWAclPScLQnErPREaMjAjFglxOisbBXEsJVgfJD05DA==", "xnQXJ");
        llllIlIllI[llllIllIII[0]] = llIlIIIIIIlII("TrXvrLjgxbA6B0Kk3tUgoQ==", "pAezh");
        llllIlIllI[llllIllIII[4]] = llIlIIIIIIlII("YVHjo+Z/2L/EtjnGYcjDskcpWuIP+s2D", "JFWHO");
        llllIlIllI[llllIllIII[7]] = llIlIIIIIIIll("GAtOAzUqTgMLNDwHAAVnPhsLETNvHRsSNyMHCxFrbx0ZCzMsBgcMIG8aAUIFGjcnLAA=", "OnnbG");
        llllIlIllI[llllIllIII[5]] = llIlIIIIIIlII("7rMRqyoi33Qy5/lL1jnew0/5hdb29bACYc5mnCBpVytIQpM0iLuNAw9Jsl35h4TO2oYugBu9pjc=", "GXjjg");
        llllIlIllI[llllIllIII[14]] = llIlIIIIIIlII("eIF6zqeMgfE=", "QsRNH");
        llllIlIllI[llllIllIII[16]] = llIlIIIIIIlII("pxnR+teSq2g=", "WLpdh");
        llllIlIllI[llllIllIII[18]] = llIlIIIIIIIll("NgMbSD0XQh4cKAoW", "xbmhI");
        llllIlIllI[llllIllIII[20]] = llIlIIIIIIIll("ASA0JBUnJDklBGIANDkFIyY=", "BHUJv");
        llllIlIllI[llllIllIII[22]] = llIlIIIIIIlIl("+ktKxMtao4/qur1d2jf19w==", "LLyYu");
        llllIlIllI[llllIllIII[24]] = llIlIIIIIIlIl("REhw2xkhuGg=", "DHWGG");
        llllIlIllI[llllIllIII[25]] = llIlIIIIIIlIl("oT6x1IgWV5I=", "vfSWk");
        llllIlIllI[llllIllIII[8]] = llIlIIIIIIIll("AjQqNw==", "UQKEq");
        llllIlIllI[llllIllIII[34]] = llIlIIIIIIlIl("tAFlS/EQLKOsN0bAXZgiKg==", "mEBNV");
        llllIlIllI[llllIllIII[35]] = llIlIIIIIIIll("Fwsc", "YnxSe");
        llllIlIllI[llllIllIII[36]] = llIlIIIIIIlII("dNh4WVMdK+Y=", "yhyPV");
        llllIlIllI[llllIllIII[37]] = llIlIIIIIIlII("0zsfGXUPXmY=", "CSKBg");
        llllIlIllI[llllIllIII[38]] = llIlIIIIIIlII("lw2vEzU1ghk=", "YGKlm");
        llllIlIllI[llllIllIII[39]] = llIlIIIIIIlIl("hUKbs1OhdSM=", "oouVj");
        llllIlIllI[llllIllIII[42]] = llIlIIIIIIlIl("ltYTLNG022A=", "iQVEp");
        llllIlIllI[llllIllIII[33]] = llIlIIIIIIlIl("CN3G2Moypx8=", "UgVvW");
        llllIlIllI[llllIllIII[43]] = llIlIIIIIIlIl("Q/GtE6RnSMg=", "YuThT");
        llllIlIllI[llllIllIII[44]] = llIlIIIIIIlIl("ZjIfimiN6eB4331S16lW/Q==", "eeDeo");
        llllIlIllI[llllIllIII[46]] = llIlIIIIIIlII("NnqUKvQWno2Eawar7qckpg==", "sZKZF");
        llllIlIllI[llllIllIII[52]] = llIlIIIIIIlII("1Y6LX4MO7+o4JMkERdOkBA==", "aLnqh");
        llllIlIllI[llllIllIII[45]] = llIlIIIIIIIll("GAAy", "OiUEN");
        llllIlIllI[llllIllIII[53]] = llIlIIIIIIlIl("2I48fbf0PRg=", "UASJT");
        llllIlIllI[llllIllIII[54]] = llIlIIIIIIlIl("/Jbfvk7cWlYzryhbz6b6LQ==", "BYMiP");
        llllIlIllI[llllIllIII[55]] = llIlIIIIIIlII("/F+j8wk/kFCPBevrQ+MnOg==", "SpAAV");
        llllIlIllI[llllIllIII[56]] = llIlIIIIIIlIl("Ztk1Ek2BKhM=", "qhWpj");
        llllIlIllI[llllIllIII[57]] = llIlIIIIIIlII("k93EXzUvb4zjXnfJALOn2A==", "refDo");
        llllIlIllI[llllIllIII[58]] = llIlIIIIIIIll("AiN1MgFFIDAjAgQ=", "eLUFn");
        llllIlIllI[llllIllIII[59]] = llIlIIIIIIIll("BSMI", "RJoxf");
        llllIlIllI[llllIllIII[60]] = llIlIIIIIIIll("KjIHJBY=", "zStPs");
        llllIlIllI[llllIllIII[61]] = llIlIIIIIIlIl("CKSSdjSUhMs=", "vgbAH");
        llllIlIllI[llllIllIII[62]] = llIlIIIIIIlII("G7IaKsYC/672JDX4sO8PQg==", "CzrzC");
        llllIlIllI[llllIllIII[63]] = llIlIIIIIIIll("EiVrIwpVJi4yCRQ=", "uJKWe");
        llllIlIllI[llllIllIII[64]] = llIlIIIIIIlII("fiGsunxt8Gw=", "ISDOz");
        llllIlIllI[llllIllIII[65]] = llIlIIIIIIlIl("i6JyP6Mu+y8=", "SWCIV");
        llllIlIllI[llllIllIII[66]] = llIlIIIIIIIll("ESYWKw==", "FCwYZ");
        llllIlIllI[llllIllIII[67]] = llIlIIIIIIlIl("BzmFTzTGsR25UIdTNjYX8g==", "ucSKG");
        llllIlIllI[llllIllIII[68]] = llIlIIIIIIlIl("60OOZ1b4r6b2vYexTtEK8Q==", "ojGKg");
        llllIlIllI[llllIllIII[69]] = llIlIIIIIIlII("ChqSeUpmGh8=", "kofLJ");
        llllIlIllI[llllIllIII[70]] = llIlIIIIIIIll("GgcVHDI9VREXMQ==", "XuzrH");
        llllIlIllI[llllIllIII[73]] = llIlIIIIIIlII("Wyg7LPQHpTWZAqpvZ3Jkjg==", "JMZfk");
        llllIlIllI[llllIllIII[74]] = llIlIIIIIIlIl("9dxOlWcUxSk1CKAI+dbwCg==", "hqFhc");
        llllIlIllI[llllIllIII[75]] = llIlIIIIIIIll("IwM/", "ilZfr");
        llllIlIllI[llllIllIII[76]] = llIlIIIIIIlIl("hkwzezNtGkM=", "VbfzO");
        llllIlIllI[llllIllIII[77]] = llIlIIIIIIIll("PQAfGAJJDAY=", "iyvve");
        llllIlIllI[llllIllIII[78]] = llIlIIIIIIIll("PyQgMA==", "mKPUg");
        llllIlIllI[llllIllIII[32]] = llIlIIIIIIIll("KxkUMUksHRwh", "gxpHi");
        llllIlIllI[llllIllIII[79]] = llIlIIIIIIlII("h38wvIVQi1/1oLBBs11N3g==", "cNMph");
        llllIlIllI[llllIllIII[80]] = llIlIIIIIIlIl("B8gKXy+bTkEeleJ9DmpZBQ==", "BjPFr");
        llllIlIllI[llllIllIII[81]] = llIlIIIIIIIll("HxY8GwohRBIJESo=", "OdUhe");
        llllIlIllI[llllIllIII[82]] = llIlIIIIIIlII("7cGbdMhZUsKy2snz0bWwMQ==", "CsCkp");
        llllIlIllI[llllIllIII[84]] = llIlIIIIIIlII("L2SP6F15f08=", "olZww");
        llllIlIllI[llllIllIII[87]] = llIlIIIIIIIll("OQANLWkRERwm", "vphCI");
        llllIlIllI[llllIllIII[88]] = llIlIIIIIIlIl("BsuFEGZ+KBY=", "HhbVm");
        llllIlIllI[llllIllIII[89]] = llIlIIIIIIlIl("qrES+AdyE34=", "zgyRn");
        llllIlIllI[llllIllIII[90]] = llIlIIIIIIlIl("6m1RjXno7qSK/buxOYAOYg==", "ZMHFf");
        llllIlIllI[llllIllIII[91]] = llIlIIIIIIIll("LiIQFw4IJh0WH00CEAoeDCQ=", "mJqym");
        llllIlIllI[llllIllIII[97]] = llIlIIIIIIlII("aPUdvnMz4ASspZX66hXsydJhJVBAmA6q", "yeyqC");
        llllIlIllI[llllIllIII[99]] = llIlIIIIIIlIl("tYqICcYECS0GYwJOBwNgNglLPi+4ore+", "rnLQV");
        llllIlIllI[llllIllIII[100]] = llIlIIIIIIlII("2ZeGMTGPlvA=", "ZXJjO");
        llllIlIllI[llllIllIII[101]] = llIlIIIIIIIll("HRQJMQk=", "zxfCp");
        llllIlIllI[llllIllIII[102]] = llIlIIIIIIIll("ITsbBQo=", "FWtws");
        llllIlIllI[llllIllIII[103]] = llIlIIIIIIlII("MbMnr5g0pb4=", "DXYkK");
        llllIlIllI[llllIllIII[116]] = llIlIIIIIIIll("NAQ+dA==", "maMZy");
        llllIlIllI[llllIllIII[117]] = llIlIIIIIIlIl("x+2Tm0FWxmO8gDWJqx91PSbjhRQ43hdfbi2IQ+yRPQcTRnEpg6+A+g==", "GrTtZ");
        llllIlIllI[llllIllIII[118]] = llIlIIIIIIIll("CikxCRBpPysQVCQnLwBUJjIsAAZpMiwMGi41ZAQEKDQwRRI7KSlFBiY2IVo=", "IFDet");
        llllIlIllI[llllIllIII[119]] = llIlIIIIIIIll("DA0RRxcmDRMTVjcNCwJWNw0UE1YrBEYQHyNd", "Dbfgv");
        llllIlIllI[llllIllIII[120]] = llIlIIIIIIlII("sHDowjMtRPqN7qesXRBkH95yPqxOPjXuoaldZ+/oBcn52QuAZyfkeQ==", "IkMYZ");
        llllIlIllI[llllIllIII[121]] = llIlIIIIIIlIl("QIg84N8m7LdJmuned5Twm9zOwRkwHYR1hvnmy9o0ycE=", "UBGgN");
        llllIlIllI[llllIllIII[122]] = llIlIIIIIIlII("RMYs1q+sbxQpVMphlpuAZdSP/TGa8SP/bY0xT0YQEr8OOgBiyH0ycg==", "eyHHv");
        llllIlIllI[llllIllIII[123]] = llIlIIIIIIlIl("UuAIDDHuD1FxuBieNBj9uG8WfSNQ4fLYDk5dgUB/8Kojl88Bg8tvPDrUiBOg9IkO", "DjdJg");
        llllIlIllI[llllIllIII[124]] = llIlIIIIIIlIl("tVKrL/1bTlD0+jRAp1H9p/ONc6upz76LHRWvS1RfV2c=", "YVSJT");
        llllIlIllI[llllIllIII[125]] = llIlIIIIIIlII("CSuMGW48lfRj6tiOlNTF1LdW2JFPDFER/OHLgBIu1ItBRkaTt6ErsTKl7cdlKDSl", "lrkAe");
        llllIlIllI[llllIllIII[126]] = llIlIIIIIIIll("AgQMITNhIlk+MiRLDSUyYQAcNHcxBxwsJCRU", "AkyMW");
        llllIlIllI[llllIllIII[127]] = llIlIIIIIIlII("0oGiJxDjWAq2y777ptL2QyJdQ5NO8QP2g/T9usqhpORmhBv8hrDklvglVRs8KRYP", "KdUof");
        llllIlIllI[llllIllIII[128]] = llIlIIIIIIlII("J59cS2dF8ZqvRDol7sl/HBSUIAMtfuJj/A6qi6mAv6Gx4X1SgP5A8w==", "BPFjo");
    }

    private static boolean llIlIIIIlIlII(int i, int i2) {
        return i == i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllIlIllI[llllIllIII[97]];
    }

    private static boolean llIlIIIIIllIl(int i, int i2) {
        return i < i2;
    }

    private static void llIlIIIIIlIlI() {
        llllIllIII = new int[130];
        llllIllIII[0] = " ".length();
        llllIllIII[1] = ((32 ^ 99) ^ (235 ^ 172)) & (((116 ^ 122) ^ (174 ^ 164)) ^ (-" ".length()));
        llllIllIII[2] = (-641) & 913;
        llllIllIII[3] = (-((-10057) & 28543)) & (-8257) & 31742;
        llllIllIII[4] = "  ".length();
        llllIllIII[5] = 118 ^ 114;
        llllIllIII[6] = (-12291) & 14207;
        llllIllIII[7] = "   ".length();
        llllIllIII[8] = 129 ^ 141;
        llllIllIII[9] = (-8193) & 16199;
        llllIllIII[10] = (-((-3765) & 32437)) & (-281) & 30713;
        llllIllIII[11] = (-((-8813) & 31597)) & (-33) & 24575;
        llllIllIII[12] = (-((-1645) & 5997)) & (-2057) & 8173;
        llllIllIII[13] = (-((-395) & 23019)) & (-8193) & 32767;
        llllIllIII[14] = (251 ^ 182) ^ (251 ^ 179);
        llllIllIII[15] = (-((-29335) & 32703)) & (-24709) & 28668;
        llllIllIII[16] = 113 ^ 119;
        llllIllIII[17] = (-24663) & 26591;
        llllIllIII[18] = 119 ^ 112;
        llllIllIII[19] = (-((-13581) & 32077)) & (-12323) & 32751;
        llllIllIII[20] = 53 ^ 61;
        llllIllIII[21] = (-13313) & 15661;
        llllIllIII[22] = (53 ^ 85) ^ (253 ^ 148);
        llllIllIII[23] = (-((-4055) & 32727)) & (-2049) & 31733;
        llllIllIII[24] = (64 ^ 42) ^ (65 ^ 33);
        llllIllIII[25] = 65 ^ 74;
        llllIllIII[26] = (-((-12683) & 30159)) & (-2049) & 20478;
        llllIllIII[27] = (-((-5377) & 15617)) & (-1153) & 11771;
        llllIllIII[28] = (-16661) & 28638;
        llllIllIII[29] = (-((-13393) & 16125)) & (-1027) & 16383;
        llllIllIII[30] = (-((-705) & 16085)) & (-16393) & 32767;
        llllIllIII[31] = (-11269) & 12268;
        llllIllIII[32] = (22 ^ 80) ^ (90 ^ 46);
        llllIllIII[33] = 189 ^ 169;
        llllIllIII[34] = (9 ^ 91) ^ (37 ^ 122);
        llllIllIII[35] = 140 ^ 130;
        llllIllIII[36] = 189 ^ 178;
        llllIllIII[37] = 80 ^ 64;
        llllIllIII[38] = 184 ^ 169;
        llllIllIII[39] = (44 ^ 52) ^ (185 ^ 179);
        llllIllIII[40] = (-8885) & 11967;
        llllIllIII[41] = (-28999) & 32254;
        llllIllIII[42] = 182 ^ 165;
        llllIllIII[43] = 24 ^ 13;
        llllIllIII[44] = 105 ^ 127;
        llllIllIII[45] = (((0 + 134) - (-20)) + 5) ^ (((128 + 24) - 58) + 40);
        llllIllIII[46] = "  ".length() ^ (9 ^ 28);
        llllIllIII[47] = (-4616) & 7743;
        llllIllIII[48] = (-((-3641) & 32570)) & (-1) & 32175;
        llllIllIII[49] = (-12545) & 15791;
        llllIllIII[50] = (-4739) & 7867;
        llllIllIII[51] = (-((-813) & 25405)) & (-4353) & 32189;
        llllIllIII[52] = 180 ^ 172;
        llllIllIII[53] = (83 ^ 70) ^ (176 ^ 191);
        llllIllIII[54] = (100 ^ 70) ^ (75 ^ 114);
        llllIllIII[55] = 129 ^ 157;
        llllIllIII[56] = (59 ^ 84) ^ (118 ^ 4);
        llllIllIII[57] = (38 ^ 98) ^ (104 ^ 50);
        llllIllIII[58] = 81 ^ 78;
        llllIllIII[59] = (129 ^ 170) ^ (118 ^ 125);
        llllIllIII[60] = (25 ^ 79) ^ (54 ^ 65);
        llllIllIII[61] = 163 ^ 129;
        llllIllIII[62] = (((50 + 94) - 7) + 27) ^ (((10 + 121) - 59) + 63);
        llllIllIII[63] = 129 ^ 165;
        llllIllIII[64] = 27 ^ 62;
        llllIllIII[65] = (233 ^ 154) ^ (206 ^ 155);
        llllIllIII[66] = 128 ^ 167;
        llllIllIII[67] = 183 ^ 159;
        llllIllIII[68] = (226 ^ 191) ^ (124 ^ 8);
        llllIllIII[69] = 74 ^ 96;
        llllIllIII[70] = (75 ^ 116) ^ (166 ^ 178);
        llllIllIII[71] = (-((-529) & 21395)) & (-8773) & 32759;
        llllIllIII[72] = (-((-163) & 29606)) & (-81) & 32763;
        llllIllIII[73] = (((112 + 1) - 30) + 89) ^ (((4 + 4) - (-8)) + 112);
        llllIllIII[74] = 117 ^ 88;
        llllIllIII[75] = (((161 + 29) - 82) + 58) ^ (((48 + 112) - 135) + 111);
        llllIllIII[76] = (126 ^ 66) ^ (145 ^ 130);
        llllIllIII[77] = 109 ^ 93;
        llllIllIII[78] = (9 ^ 39) ^ (115 ^ 108);
        llllIllIII[79] = 100 ^ 87;
        llllIllIII[80] = 246 ^ 194;
        llllIllIII[81] = (251 ^ 161) ^ (39 ^ 72);
        llllIllIII[82] = 161 ^ 151;
        llllIllIII[83] = (140 ^ 192) ^ (150 ^ 190);
        llllIllIII[84] = (((21 + 79) - 96) + 172) ^ (((43 + 78) - 52) + 66);
        llllIllIII[85] = (-8268) & 11487;
        llllIllIII[86] = (-((-1747) & 5847)) & (-25377) & 32743;
        llllIllIII[87] = 69 ^ 125;
        llllIllIII[88] = (172 ^ 194) ^ (109 ^ 58);
        llllIllIII[89] = (((44 + 143) - 137) + 96) ^ (((161 + 3) - 27) + 31);
        llllIllIII[90] = 186 ^ 129;
        llllIllIII[91] = 44 ^ 16;
        llllIllIII[92] = (-8705) & 28204;
        llllIllIII[93] = (-((-3209) & 11403)) & (-1) & 13694;
        llllIllIII[94] = (-16403) & 28382;
        llllIllIII[95] = (-1043) & 26042;
        llllIllIII[96] = (-((-5799) & 22199)) & (-6275) & 24574;
        llllIllIII[97] = 132 ^ 185;
        llllIllIII[98] = (119 ^ 23) ^ (100 ^ 106);
        llllIllIII[99] = 187 ^ 133;
        llllIllIII[100] = 77 ^ 114;
        llllIllIII[101] = 28 ^ 92;
        llllIllIII[102] = 83 ^ 18;
        llllIllIII[103] = 229 ^ 167;
        llllIllIII[104] = (-((-30821) & 31605)) & (-28677) & 32759;
        llllIllIII[105] = (-929) & 4089;
        llllIllIII[106] = (-8737) & 12026;
        llllIllIII[107] = (-((-19517) & 28350)) & (-16401) & 28415;
        llllIllIII[108] = (-29541) & 32638;
        llllIllIII[109] = (-((-7185) & 24146)) & (-4101) & 24319;
        llllIllIII[110] = (-((-6171) & 15195)) & (-16531) & 28639;
        llllIllIII[111] = (-20997) & 24255;
        llllIllIII[112] = (-12425) & 15550;
        llllIllIII[113] = (-25413) & 28655;
        llllIllIII[114] = (-((-21027) & 21475)) & (-24594) & 28153;
        llllIllIII[115] = (-((-3106) & 24355)) & (-65) & 24575;
        llllIllIII[116] = " ".length() ^ (192 ^ 130);
        llllIllIII[117] = (74 ^ 46) ^ (24 ^ 56);
        llllIllIII[118] = 95 ^ 26;
        llllIllIII[119] = 196 ^ 130;
        llllIllIII[120] = 221 ^ 154;
        llllIllIII[121] = 241 ^ 185;
        llllIllIII[122] = 105 ^ 32;
        llllIllIII[123] = 52 ^ 126;
        llllIllIII[124] = (161 ^ 132) ^ (14 ^ 96);
        llllIllIII[125] = (150 ^ 183) ^ (125 ^ 16);
        llllIllIII[126] = (63 ^ 93) ^ (11 ^ 36);
        llllIllIII[127] = (((99 + 96) - 108) + 156) ^ (((143 + 13) - 66) + 99);
        llllIllIII[128] = (((139 + 86) - 89) + 91) ^ (((73 + 76) - 102) + 125);
        llllIllIII[129] = (((119 + 198) - 309) + 227) ^ (((73 + 61) - 42) + 95);
    }

    private static boolean llIlIIIIlIIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0175, code lost:
        if (llIlIIIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.J.llllIllIII[7]) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0427  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10 = new int[llllIllIII[0]];
        iArr10[llllIllIII[1]] = llllIllIII[28];
        if (llIlIIIIIlllI(Bank.contains(iArr10) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIII[28], llllIllIII[0], llllIllIII[92]));
            "".length();
        }
        int[] iArr11 = new int[llllIllIII[0]];
        iArr11[llllIllIII[1]] = llllIllIII[26];
        if (llIlIIIIIlllI(Bank.contains(iArr11) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIII[26], llllIllIII[0], llllIllIII[93]));
            "".length();
        }
        int[] iArr12 = new int[llllIllIII[0]];
        iArr12[llllIllIII[1]] = llllIllIII[23];
        if (llIlIIIIIlllI(Bank.contains(iArr12) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIII[23], llllIllIII[0], llllIllIII[93]));
            "".length();
        }
        int[] iArr13 = new int[llllIllIII[0]];
        iArr13[llllIllIII[1]] = llllIllIII[21];
        if (llIlIIIIIlllI(Bank.contains(iArr13) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIII[21], llllIllIII[0], llllIllIII[93]));
            "".length();
        }
        int[] iArr14 = new int[llllIllIII[0]];
        iArr14[llllIllIII[1]] = llllIllIII[6];
        if (llIlIIIIIllII(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[llllIllIII[0]];
            iArr15[llllIllIII[1]] = llllIllIII[6];
            if (llIlIIIIIllII(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llllIllIII[0]];
                iArr16[llllIllIII[1]] = llllIllIII[6];
            }
            iArr = new int[llllIllIII[0]];
            iArr[llllIllIII[1]] = llllIllIII[15];
            if (llIlIIIIIlllI(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(llllIllIII[15], llllIllIII[0], llllIllIII[93]));
                "".length();
            }
            iArr2 = new int[llllIllIII[0]];
            iArr2[llllIllIII[1]] = llllIllIII[17];
            if (llIlIIIIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                bu.add(new C0003d(llllIllIII[17], llllIllIII[0], llllIllIII[93]));
                "".length();
            }
            iArr3 = new int[llllIllIII[0]];
            iArr3[llllIllIII[1]] = llllIllIII[19];
            if (llIlIIIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                bu.add(new C0003d(llllIllIII[19], llllIllIII[0], llllIllIII[93]));
                "".length();
            }
            iArr4 = new int[llllIllIII[0]];
            iArr4[llllIllIII[1]] = llllIllIII[13];
            if (llIlIIIIIlllI(Bank.contains(iArr4) ? 1 : 0)) {
                bu.add(new C0003d(llllIllIII[13], llllIllIII[0], llllIllIII[93]));
                "".length();
            }
            iArr5 = new int[llllIllIII[0]];
            iArr5[llllIllIII[1]] = llllIllIII[12];
            if (llIlIIIIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                bu.add(new C0003d(llllIllIII[12], llllIllIII[0], llllIllIII[93]));
                "".length();
            }
            iArr6 = new int[llllIllIII[0]];
            iArr6[llllIllIII[1]] = llllIllIII[11];
            if (llIlIIIIIlllI(Bank.contains(iArr6) ? 1 : 0)) {
                bu.add(new C0003d(llllIllIII[11], llllIllIII[7], llllIllIII[93]));
                "".length();
            }
            iArr7 = new int[llllIllIII[0]];
            iArr7[llllIllIII[1]] = llllIllIII[10];
            if (llIlIIIIIlllI(Bank.contains(iArr7) ? 1 : 0)) {
                bu.add(new C0003d(llllIllIII[10], llllIllIII[0], llllIllIII[93]));
                "".length();
            }
            if (llIlIIIIIlllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llllIlIllI[llllIllIII[99]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(llllIllIII[94], llllIllIII[14], llllIllIII[95]));
                "".length();
            }
            iArr8 = new int[llllIllIII[0]];
            iArr8[llllIllIII[1]] = llllIllIII[29];
            if (llIlIIIIIlllI(Bank.contains(iArr8) ? 1 : 0)) {
                bu.add(new C0003d(llllIllIII[29], llllIllIII[5], C0008i.bp));
                "".length();
            }
            iArr9 = new int[llllIllIII[0]];
            iArr9[llllIllIII[1]] = llllIllIII[9];
            if (llIlIIIIIllII(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr17 = new int[llllIllIII[0]];
                iArr17[llllIllIII[1]] = llllIllIII[9];
                if (!llIlIIIIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                    return;
                }
                int[] iArr18 = new int[llllIllIII[0]];
                iArr18[llllIllIII[1]] = llllIllIII[9];
                if (!llIlIIIIIllIl(Bank.getFirst(iArr18).getQuantity(), llllIllIII[36])) {
                    return;
                }
            }
            bu.add(new C0003d(llllIllIII[9], llllIllIII[67], llllIllIII[96]));
            "".length();
        }
        bu.add(new C0003d(llllIllIII[6], llllIllIII[7], llllIllIII[93]));
        "".length();
        iArr = new int[llllIllIII[0]];
        iArr[llllIllIII[1]] = llllIllIII[15];
        if (llIlIIIIIlllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llllIllIII[0]];
        iArr2[llllIllIII[1]] = llllIllIII[17];
        if (llIlIIIIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llllIllIII[0]];
        iArr3[llllIllIII[1]] = llllIllIII[19];
        if (llIlIIIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[llllIllIII[0]];
        iArr4[llllIllIII[1]] = llllIllIII[13];
        if (llIlIIIIIlllI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llllIllIII[0]];
        iArr5[llllIllIII[1]] = llllIllIII[12];
        if (llIlIIIIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llllIllIII[0]];
        iArr6[llllIllIII[1]] = llllIllIII[11];
        if (llIlIIIIIlllI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[llllIllIII[0]];
        iArr7[llllIllIII[1]] = llllIllIII[10];
        if (llIlIIIIIlllI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        if (llIlIIIIIlllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llllIlIllI[llllIllIII[99]]);
        }) ? 1 : 0)) {
        }
        iArr8 = new int[llllIllIII[0]];
        iArr8[llllIllIII[1]] = llllIllIII[29];
        if (llIlIIIIIlllI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[llllIllIII[0]];
        iArr9[llllIllIII[1]] = llllIllIII[9];
        if (llIlIIIIIllII(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIllIII[9], llllIllIII[67], llllIllIII[96]));
        "".length();
    }

    private static boolean llIlIIIIIlllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllIllIII[8]];
        iArr[llllIllIII[1]] = llllIllIII[9];
        iArr[llllIllIII[0]] = llllIllIII[10];
        iArr[llllIllIII[4]] = llllIllIII[11];
        iArr[llllIllIII[7]] = llllIllIII[12];
        iArr[llllIllIII[5]] = llllIllIII[13];
        iArr[llllIllIII[14]] = llllIllIII[15];
        iArr[llllIllIII[16]] = llllIllIII[17];
        iArr[llllIllIII[18]] = llllIllIII[19];
        iArr[llllIllIII[20]] = llllIllIII[21];
        iArr[llllIllIII[22]] = llllIllIII[23];
        iArr[llllIllIII[24]] = llllIllIII[6];
        iArr[llllIllIII[25]] = llllIllIII[26];
        int i = llllIllIII[1];
        while (llIlIIIIIllIl(i, iArr.length)) {
            int[] iArr2 = new int[llllIllIII[0]];
            iArr2[llllIllIII[1]] = iArr[i];
            if (llIlIIIIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return llllIllIII[1];
            }
            i++;
            "".length();
            if (" ".length() <= 0) {
                return ((243 ^ 168) ^ (82 ^ 57)) & (((21 ^ 69) ^ (80 ^ 48)) ^ (-" ".length()));
            }
        }
        return llllIllIII[0];
    }

    private static int llIlIIIIIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIIIIlIlII(C0004e.j(llllIllIII[2]), llllIllIII[98])) {
            ?? r0 = llllIllIII[0];
            "".length();
            return (157 ^ 153) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIllIII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v268, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v314, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v567, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v576, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v598, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v132, types: [boolean] */
    public static void cW() {
        if (llIlIIIIIllII(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIlIIIIIllIl(bu.size(), llllIllIII[0])) {
                System.out.println(llllIlIllI[llllIllIII[1]]);
                bs = llllIllIII[1];
            }
        }
        if (llIlIIIIIlllI(bs ? 1 : 0)) {
            if (llIlIIIIIlllI(aa() ? 1 : 0) && llIlIIIIIllIl(C0004e.j(llllIllIII[2]), llllIllIII[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIIIIIllll(nearest) && llIlIIIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[0]];
                    C0000a.a(nearest);
                }
                if (llIlIIIIIllll(nearest) && llIlIIIIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIllIII[3]);
                        "".length();
                    }
                    if (llIlIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[4]];
                        if (llIlIIIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIllIII[5]);
                            "".length();
                        }
                        if (llIlIIIIlIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIllIII[4]);
                            "".length();
                        }
                        int[] iArr = new int[llllIllIII[0]];
                        iArr[llllIllIII[1]] = llllIllIII[6];
                        if (llIlIIIIIllII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llllIllIII[0]];
                            iArr2[llllIllIII[1]] = llllIllIII[6];
                            if (llIlIIIIIllIl(Bank.getFirst(iArr2).getQuantity(), llllIllIII[7])) {
                                ae();
                                System.out.println(llllIlIllI[llllIllIII[7]]);
                                bs = llllIllIII[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[llllIllIII[8]];
                        iArr3[llllIllIII[1]] = llllIllIII[9];
                        iArr3[llllIllIII[0]] = llllIllIII[10];
                        iArr3[llllIllIII[4]] = llllIllIII[11];
                        iArr3[llllIllIII[7]] = llllIllIII[12];
                        iArr3[llllIllIII[5]] = llllIllIII[13];
                        iArr3[llllIllIII[14]] = llllIllIII[15];
                        iArr3[llllIllIII[16]] = llllIllIII[17];
                        iArr3[llllIllIII[18]] = llllIllIII[19];
                        iArr3[llllIllIII[20]] = llllIllIII[21];
                        iArr3[llllIllIII[22]] = llllIllIII[23];
                        iArr3[llllIllIII[24]] = llllIllIII[6];
                        iArr3[llllIllIII[25]] = llllIllIII[26];
                        if (llIlIIIIIlllI(C0004e.b(iArr3) ? 1 : 0)) {
                            ae();
                            System.out.println(llllIlIllI[llllIllIII[5]]);
                            bs = llllIllIII[0];
                            return;
                        }
                        int[] iArr4 = new int[llllIllIII[8]];
                        iArr4[llllIllIII[1]] = llllIllIII[9];
                        iArr4[llllIllIII[0]] = llllIllIII[10];
                        iArr4[llllIllIII[4]] = llllIllIII[11];
                        iArr4[llllIllIII[7]] = llllIllIII[12];
                        iArr4[llllIllIII[5]] = llllIllIII[13];
                        iArr4[llllIllIII[14]] = llllIllIII[15];
                        iArr4[llllIllIII[16]] = llllIllIII[17];
                        iArr4[llllIllIII[18]] = llllIllIII[19];
                        iArr4[llllIllIII[20]] = llllIllIII[21];
                        iArr4[llllIllIII[22]] = llllIllIII[23];
                        iArr4[llllIllIII[24]] = llllIllIII[6];
                        iArr4[llllIllIII[25]] = llllIllIII[26];
                        if (llIlIIIIIllII(C0004e.b(iArr4) ? 1 : 0)) {
                            C0000a.a(llllIllIII[10], llllIllIII[0]);
                            C0000a.a(llllIllIII[12], llllIllIII[0]);
                            C0000a.a(llllIllIII[13], llllIllIII[0]);
                            C0000a.a(llllIllIII[15], llllIllIII[0]);
                            C0000a.a(llllIllIII[17], llllIllIII[0]);
                            C0000a.a(llllIllIII[21], llllIllIII[0]);
                            C0000a.a(llllIllIII[19], llllIllIII[0]);
                            C0000a.a(llllIllIII[23], llllIllIII[0]);
                            C0000a.a(llllIllIII[26], llllIllIII[0]);
                            C0000a.a(llllIllIII[27], llllIllIII[14]);
                            C0000a.a(llllIllIII[9], llllIllIII[24]);
                            C0000a.a(llllIllIII[28], llllIllIII[0]);
                            C0000a.a(llllIllIII[6], llllIllIII[7]);
                            C0000a.a(llllIllIII[11], llllIllIII[7]);
                            C0000a.a(llllIllIII[29], llllIllIII[4]);
                            C0000a.a(llllIllIII[30], llllIllIII[31]);
                        }
                    }
                }
            }
            if (llIlIIIIIllII(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlIIIIIllIl(Movement.getRunEnergy(), llllIllIII[32])) {
                Inventory.getFirst(C0005f.aU).interact(llllIlIllI[llllIllIII[14]]);
                Time.sleepTicks(llllIllIII[0]);
                "".length();
            }
            int[] iArr5 = new int[llllIllIII[0]];
            iArr5[llllIllIII[1]] = llllIllIII[27];
            if (llIlIIIIIllII(Inventory.contains(iArr5) ? 1 : 0) && llIlIIIIlIIIl(llIlIIIIIlIll(C0004e.u(), 50.0d))) {
                int[] iArr6 = new int[llllIllIII[0]];
                iArr6[llllIllIII[1]] = llllIllIII[27];
                Inventory.getFirst(iArr6).interact(llllIlIllI[llllIllIII[16]]);
                Time.sleepTicks(llllIllIII[0]);
                "".length();
            }
            if (llIlIIIIIllII(aa() ? 1 : 0) && llIlIIIIIlllI(C0004e.j(llllIllIII[2]))) {
                if (llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(gf), llllIllIII[18])) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[18]];
                    Movement.walkTo(gf);
                    "".length();
                    Time.sleepTicks(llllIllIII[0]);
                    "".length();
                }
                if (llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(gf), llllIllIII[18])) {
                    C0006g.a(llllIlIllI[llllIllIII[20]], bQ);
                }
            }
            if (llIlIIIIlIlII(C0004e.j(llllIllIII[2]), llllIllIII[24])) {
                if (llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[14])) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[22]];
                    Movement.walkTo(hN);
                    "".length();
                    Time.sleepTicks(llllIllIII[0]);
                    "".length();
                }
                if (llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[14])) {
                    C0006g.a(llllIlIllI[llllIllIII[24]], bQ);
                }
            }
            if (llIlIIIIlIlII(C0004e.j(llllIllIII[2]), llllIllIII[33])) {
                ck = llllIllIII[1];
                String[] strArr = new String[llllIllIII[0]];
                strArr[llllIllIII[1]] = llllIlIllI[llllIllIII[25]];
                if (llIlIIIIIlllI(Inventory.contains(strArr) ? 1 : 0)) {
                    if (llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hO), llllIllIII[4])) {
                        if (llIlIIIIIllII(Inventory.contains(item -> {
                            return item.getName().contains(llllIlIllI[llllIllIII[103]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item2 -> {
                                return item2.getName().contains(llllIlIllI[llllIllIII[102]]);
                            }).interact(llllIlIllI[llllIllIII[8]]);
                        }
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[34]];
                        Movement.walkTo(hO);
                        "".length();
                        Time.sleepTicks(llllIllIII[0]);
                        "".length();
                    }
                    if (llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hO), llllIllIII[4])) {
                        C0006g.a(llllIlIllI[llllIllIII[35]], bQ);
                    }
                }
                String[] strArr2 = new String[llllIllIII[0]];
                strArr2[llllIllIII[1]] = llllIlIllI[llllIllIII[36]];
                if (llIlIIIIIllII(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[llllIllIII[0]];
                    strArr3[llllIllIII[1]] = llllIlIllI[llllIllIII[37]];
                    if (llIlIIIIIlllI(Inventory.contains(strArr3) ? 1 : 0)) {
                        int[] iArr7 = new int[llllIllIII[0]];
                        iArr7[llllIllIII[1]] = llllIllIII[12];
                        if (llIlIIIIIllII(Inventory.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llllIllIII[0]];
                            iArr8[llllIllIII[1]] = llllIllIII[12];
                            Item first = Inventory.getFirst(iArr8);
                            String[] strArr4 = new String[llllIllIII[0]];
                            strArr4[llllIllIII[1]] = llllIlIllI[llllIllIII[38]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(llllIllIII[4]);
                            "".length();
                        }
                        int[] iArr9 = new int[llllIllIII[0]];
                        iArr9[llllIllIII[1]] = llllIllIII[12];
                        if (llIlIIIIIlllI(Inventory.contains(iArr9) ? 1 : 0)) {
                            String[] strArr5 = new String[llllIllIII[0]];
                            strArr5[llllIllIII[1]] = llllIlIllI[llllIllIII[39]];
                            NPC nearest2 = NPCs.getNearest(strArr5);
                            new WorldArea(llllIllIII[40], llllIllIII[41], llllIllIII[14], llllIllIII[16], llllIllIII[1]);
                            if (!llIlIIIIIllll(nearest2) || (llIlIIIIIllll(nearest2) && llIlIIIIIlllI(Reachable.isInteractable(nearest2) ? 1 : 0))) {
                                Movement.walkTo(hP);
                                "".length();
                                Time.sleepTicks(llllIllIII[0]);
                                "".length();
                            }
                            if (llIlIIIIIllll(nearest2)) {
                                C0006g.a(llllIlIllI[llllIllIII[42]], bQ, llllIllIII[0]);
                            }
                        }
                    }
                }
                String[] strArr6 = new String[llllIllIII[0]];
                strArr6[llllIllIII[1]] = llllIlIllI[llllIllIII[33]];
                if (llIlIIIIIllII(Inventory.contains(strArr6) ? 1 : 0)) {
                    String[] strArr7 = new String[llllIllIII[0]];
                    strArr7[llllIllIII[1]] = llllIlIllI[llllIllIII[43]];
                    if (llIlIIIIIllII(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[llllIllIII[0]];
                        strArr8[llllIllIII[1]] = llllIlIllI[llllIllIII[44]];
                        if (llIlIIIIIlllI(Inventory.contains(strArr8) ? 1 : 0) && llIlIIIIIlllI(hS ? 1 : 0)) {
                            if (llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hQ), llllIllIII[18]) && llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[45])) {
                                AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[46]];
                                Movement.walkTo(hQ);
                                "".length();
                                Time.sleepTicks(llllIllIII[0]);
                                "".length();
                            }
                            if (llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hQ), llllIllIII[18])) {
                                WorldPoint worldPoint = new WorldPoint(llllIllIII[47], llllIllIII[48], llllIllIII[1]);
                                WorldPoint worldPoint2 = new WorldPoint(llllIllIII[47], llllIllIII[49], llllIllIII[1]);
                                if ((!llIlIIIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || llIlIIIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) && llIlIIIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    Movement.walkTo(new WorldPoint(llllIllIII[50], llllIllIII[51], llllIllIII[1]));
                                    "".length();
                                    Time.sleepTicks(llllIllIII[7]);
                                    "".length();
                                }
                                C0006g.a(llllIlIllI[llllIllIII[52]], bQ, llllIllIII[0]);
                            }
                        }
                    }
                }
                String[] strArr9 = new String[llllIllIII[0]];
                strArr9[llllIllIII[1]] = llllIlIllI[llllIllIII[45]];
                if (llIlIIIIIllII(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[llllIllIII[0]];
                    strArr10[llllIllIII[1]] = llllIlIllI[llllIllIII[53]];
                    if (llIlIIIIIllII(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[llllIllIII[0]];
                        strArr11[llllIllIII[1]] = llllIlIllI[llllIllIII[54]];
                        if (llIlIIIIIllII(Inventory.contains(strArr11) ? 1 : 0) && llIlIIIIIlllI(hS ? 1 : 0)) {
                            if (llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[14])) {
                                AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[55]];
                                Movement.walkTo(hN);
                                "".length();
                                Time.sleepTicks(llllIllIII[0]);
                                "".length();
                            }
                            if (llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[14])) {
                                C0006g.a(llllIlIllI[llllIllIII[56]], bQ);
                                List options = Dialog.getOptions();
                                if (llIlIIIIIlllI(options.isEmpty() ? 1 : 0)) {
                                    int lllllllllllllllllIlIlIIlllIlIlIl = llllIllIII[1];
                                    while (llIlIIIIIllIl(lllllllllllllllllIlIlIIlllIlIlIl, options.size())) {
                                        if (llIlIIIIIllII(((Widget) options.get(lllllllllllllllllIlIlIIlllIlIlIl)).getText().contains(llllIlIllI[llllIllIII[57]]) ? 1 : 0)) {
                                            System.out.println(llllIlIllI[llllIllIII[58]]);
                                            hS = llllIllIII[0];
                                        }
                                        lllllllllllllllllIlIlIIlllIlIlIl++;
                                        "".length();
                                        if (((((66 + 104) - 56) + 28) ^ (((59 + 77) - 57) + 59)) < 0) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[20]) && llIlIIIIIlllI(hS ? 1 : 0)) {
                    String[] strArr12 = new String[llllIllIII[0]];
                    strArr12[llllIllIII[1]] = llllIlIllI[llllIllIII[59]];
                    if (llIlIIIIIllII(Inventory.contains(strArr12) ? 1 : 0)) {
                        String[] strArr13 = new String[llllIllIII[0]];
                        strArr13[llllIllIII[1]] = llllIlIllI[llllIllIII[60]];
                        if (llIlIIIIIllII(Inventory.contains(strArr13) ? 1 : 0)) {
                            C0006g.a(llllIlIllI[llllIllIII[61]], bQ);
                            List options2 = Dialog.getOptions();
                            if (llIlIIIIIlllI(options2.isEmpty() ? 1 : 0)) {
                                int lllllllllllllllllIlIlIIlllIlIlIl2 = llllIllIII[1];
                                while (llIlIIIIIllIl(lllllllllllllllllIlIlIIlllIlIlIl2, options2.size())) {
                                    if (llIlIIIIIllII(((Widget) options2.get(lllllllllllllllllIlIlIIlllIlIlIl2)).getText().contains(llllIlIllI[llllIllIII[62]]) ? 1 : 0)) {
                                        System.out.println(llllIlIllI[llllIllIII[63]]);
                                        hS = llllIllIII[0];
                                    }
                                    lllllllllllllllllIlIlIIlllIlIlIl2++;
                                    "".length();
                                    if (" ".length() < 0) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                if (llIlIIIIIllII(hS ? 1 : 0)) {
                    String[] strArr14 = new String[llllIllIII[0]];
                    strArr14[llllIllIII[1]] = llllIlIllI[llllIllIII[64]];
                    if (llIlIIIIIllII(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[llllIllIII[0]];
                        strArr15[llllIllIII[1]] = llllIlIllI[llllIllIII[65]];
                        if (llIlIIIIIllII(Inventory.contains(strArr15) ? 1 : 0)) {
                            if (llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hR), llllIllIII[16])) {
                                if (llIlIIIIIllII(Inventory.contains(item3 -> {
                                    return item3.getName().contains(llllIlIllI[llllIllIII[101]]);
                                }) ? 1 : 0)) {
                                    Inventory.getFirst(item4 -> {
                                        return item4.getName().contains(llllIlIllI[llllIllIII[100]]);
                                    }).interact(llllIlIllI[llllIllIII[66]]);
                                }
                                if (llIlIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr16 = new String[llllIllIII[0]];
                                strArr16[llllIllIII[1]] = llllIlIllI[llllIllIII[67]];
                                C0006g.a(strArr16);
                                AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[68]];
                                Movement.walkTo(hR);
                                "".length();
                                Time.sleepTicks(llllIllIII[0]);
                                "".length();
                            }
                            if (llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hR), llllIllIII[16])) {
                                C0006g.a(llllIlIllI[llllIllIII[69]], bQ);
                            }
                        }
                    }
                }
            }
            if (!llIlIIIIlIlIl(C0004e.j(llllIllIII[2]), llllIllIII[57]) || llIlIIIIlIlII(C0004e.j(llllIllIII[2]), llllIllIII[58])) {
                String[] strArr17 = new String[llllIllIII[0]];
                strArr17[llllIllIII[1]] = llllIlIllI[llllIllIII[70]];
                if (llIlIIIIIllII(Inventory.contains(strArr17) ? 1 : 0)) {
                    WorldArea worldArea = new WorldArea(llllIllIII[71], llllIllIII[72], llllIllIII[24], llllIllIII[18], llllIllIII[1]);
                    C0006g.a(bQ);
                    if (llIlIIIIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[73]];
                        Movement.walkTo(hQ);
                        "".length();
                        Time.sleepTicks(llllIllIII[0]);
                        "".length();
                    }
                    if (llIlIIIIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[74]];
                        C0006g.a(llllIlIllI[llllIllIII[75]], bQ, llllIllIII[0]);
                    }
                }
            }
            if (llIlIIIIlIlII(C0004e.j(llllIllIII[2]), llllIllIII[67])) {
                String[] strArr18 = new String[llllIllIII[0]];
                strArr18[llllIllIII[1]] = llllIlIllI[llllIllIII[76]];
                if (llIlIIIIIllII(Inventory.contains(strArr18) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[77]];
                    String[] strArr19 = new String[llllIllIII[0]];
                    strArr19[llllIllIII[1]] = llllIlIllI[llllIllIII[78]];
                    Item first2 = Inventory.getFirst(strArr19);
                    String[] strArr20 = new String[llllIllIII[0]];
                    strArr20[llllIllIII[1]] = llllIlIllI[llllIllIII[32]];
                    first2.useOn(NPCs.getNearest(strArr20));
                    Time.sleepTicks(llllIllIII[20]);
                    "".length();
                }
            }
            if (llIlIIIIlIlII(C0004e.j(llllIllIII[2]), llllIllIII[32])) {
                WorldArea worldArea2 = new WorldArea(llllIllIII[71], llllIllIII[72], llllIllIII[14], llllIllIII[5], llllIllIII[1]);
                if (llIlIIIIIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[79]];
                    String[] strArr21 = new String[llllIllIII[0]];
                    strArr21[llllIllIII[1]] = llllIlIllI[llllIllIII[80]];
                    Item first3 = Inventory.getFirst(strArr21);
                    String[] strArr22 = new String[llllIllIII[0]];
                    strArr22[llllIllIII[1]] = llllIlIllI[llllIllIII[81]];
                    first3.useOn(TileObjects.getNearest(strArr22));
                    Time.sleepTicks(llllIllIII[7]);
                    "".length();
                }
                if (llIlIIIIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(llllIlIllI[llllIllIII[82]], bQ);
                }
            }
            if (llIlIIIIlIlII(C0004e.j(llllIllIII[2]), llllIllIII[83])) {
                if (llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(gf), llllIllIII[18])) {
                    if (llIlIIIIIllII(new WorldArea(llllIllIII[71], llllIllIII[72], llllIllIII[14], llllIllIII[5], llllIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIIlllI(Equipment.contains(C0005f.aQ) ? 1 : 0)) {
                        int[] iArr10 = new int[llllIllIII[0]];
                        iArr10[llllIllIII[1]] = llllIllIII[9];
                        if (llIlIIIIIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[llllIllIII[0]];
                            iArr11[llllIllIII[1]] = llllIllIII[9];
                            Inventory.getFirst(iArr11).interact(llllIlIllI[llllIllIII[84]]);
                            Time.sleepTicks(C0004e.c(llllIllIII[16], llllIllIII[20]));
                            "".length();
                        }
                    }
                    if (llIlIIIIIllII(new WorldArea(llllIllIII[51], llllIllIII[85], llllIllIII[52], llllIllIII[55], llllIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlIIll(Players.getLocal().getWorldLocation().getX(), llllIllIII[86])) {
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[87]];
                        String[] strArr23 = new String[llllIllIII[0]];
                        strArr23[llllIllIII[1]] = llllIlIllI[llllIllIII[88]];
                        TileObjects.getNearest(strArr23).interact(llllIlIllI[llllIllIII[89]]);
                        Time.sleepTicks(C0004e.c(llllIllIII[5], llllIllIII[16]));
                        "".length();
                    }
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[90]];
                    Movement.walkTo(gf);
                    "".length();
                    Time.sleepTicks(llllIllIII[0]);
                    "".length();
                }
                if (llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(gf), llllIllIII[18])) {
                    if (llIlIIIIIllIl(ck, llllIllIII[0])) {
                        ac.mQ += llllIllIII[0];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllIllIII[0];
                        ac.mQ = llllIllIII[1];
                        cl = llllIllIII[1];
                    }
                    C0006g.a(llllIlIllI[llllIllIII[91]], bQ);
                }
            }
            C0006g.a(new String[llllIllIII[1]]);
        }
    }

    private static String llIlIIIIIIIll(String lllllllllllllllllIlIlIIllIlIIllI, String lllllllllllllllllIlIlIIllIlIIlIl) {
        String lllllllllllllllllIlIlIIllIlIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIIllIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIlIlIIllIlIIIll = lllllllllllllllllIlIlIIllIlIIlIl.toCharArray();
        int lllllllllllllllllIlIlIIllIlIIIlI = llllIllIII[1];
        char[] charArray = lllllllllllllllllIlIlIIllIlIIllI2.toCharArray();
        int length = charArray.length;
        int i = llllIllIII[1];
        while (llIlIIIIIllIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllllIlIlIIllIlIIIll[lllllllllllllllllIlIlIIllIlIIIlI % lllllllllllllllllIlIlIIllIlIIIll.length]));
            "".length();
            lllllllllllllllllIlIlIIllIlIIIlI++;
            i++;
            "".length();
            if (((((21 + 17) - 11) + 145) ^ (((95 + 103) - 132) + 102)) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            cW();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (248 ^ 176) & ((235 ^ 163) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return llllIllIII[83];
    }

    private static boolean llIlIIIIlIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIIIIlIlIl(int i, int i2) {
        return i != i2;
    }

    private static boolean llIlIIIIlIIII(int i) {
        return i > 0;
    }

    static {
        llIlIIIIIlIlI();
        llIlIIIIIlIIl();
        hM = llllIllIII[2];
        bu = new ArrayList();
        gf = new WorldPoint(llllIllIII[104], llllIllIII[105], llllIllIII[1]);
        hN = new WorldPoint(llllIllIII[106], llllIllIII[107], llllIllIII[1]);
        hO = new WorldPoint(llllIllIII[108], llllIllIII[109], llllIllIII[1]);
        hP = new WorldPoint(llllIllIII[110], llllIllIII[111], llllIllIII[1]);
        hQ = new WorldPoint(llllIllIII[112], llllIllIII[113], llllIllIII[1]);
        hR = new WorldPoint(llllIllIII[114], llllIllIII[115], llllIllIII[1]);
        String[] strArr = new String[llllIllIII[34]];
        strArr[llllIllIII[1]] = llllIlIllI[llllIllIII[116]];
        strArr[llllIllIII[0]] = llllIlIllI[llllIllIII[117]];
        strArr[llllIllIII[4]] = llllIlIllI[llllIllIII[118]];
        strArr[llllIllIII[7]] = llllIlIllI[llllIllIII[119]];
        strArr[llllIllIII[5]] = llllIlIllI[llllIllIII[120]];
        strArr[llllIllIII[14]] = llllIlIllI[llllIllIII[121]];
        strArr[llllIllIII[16]] = llllIlIllI[llllIllIII[122]];
        strArr[llllIllIII[18]] = llllIlIllI[llllIllIII[123]];
        strArr[llllIllIII[20]] = llllIlIllI[llllIllIII[124]];
        strArr[llllIllIII[22]] = llllIlIllI[llllIllIII[125]];
        strArr[llllIllIII[24]] = llllIlIllI[llllIllIII[126]];
        strArr[llllIllIII[25]] = llllIlIllI[llllIllIII[127]];
        strArr[llllIllIII[8]] = llllIlIllI[llllIllIII[128]];
        bQ = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIllIII[1];
    }

    private static String llIlIIIIIIlII(String lllllllllllllllllIlIlIIlllIIIIll, String lllllllllllllllllIlIlIIlllIIIIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIlllIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIlllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIlIIlllIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIlIIlllIIIlIl.init(llllIllIII[4], lllllllllllllllllIlIlIIlllIIIllI);
            return new String(lllllllllllllllllIlIlIIlllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIlllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIIlllIIIlII) {
            lllllllllllllllllIlIlIIlllIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIIIllll(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIIIlIIIl(int i) {
        return i < 0;
    }
}
