package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.V  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/V.class */
public class V implements W {
    private static final /* synthetic */ WorldPoint kt;
    static /* synthetic */ int cl;
    private static final /* synthetic */ WorldPoint kr;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ long g;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint ks;
    private static /* synthetic */ int[] lIlIlllIl;
    private static final /* synthetic */ WorldPoint kv;
    static /* synthetic */ int bT;
    static /* synthetic */ boolean cm;
    public static final /* synthetic */ String[] kq;
    private static final /* synthetic */ WorldPoint ku;
    private static /* synthetic */ String[] lIlIllIll;
    private static final /* synthetic */ WorldPoint kw;

    static {
        lIIlIIllIlII();
        lIIlIIllIIll();
        String[] strArr = new String[lIlIlllIl[24]];
        strArr[lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[62]];
        strArr[lIlIlllIl[1]] = lIlIllIll[lIlIlllIl[63]];
        strArr[lIlIlllIl[3]] = lIlIllIll[lIlIlllIl[64]];
        strArr[lIlIlllIl[5]] = lIlIllIll[lIlIlllIl[65]];
        strArr[lIlIlllIl[6]] = lIlIllIll[lIlIlllIl[66]];
        strArr[lIlIlllIl[7]] = lIlIllIll[lIlIlllIl[67]];
        strArr[lIlIlllIl[9]] = lIlIllIll[lIlIlllIl[68]];
        strArr[lIlIlllIl[17]] = lIlIllIll[lIlIlllIl[69]];
        strArr[lIlIlllIl[18]] = lIlIllIll[lIlIlllIl[70]];
        strArr[lIlIlllIl[19]] = lIlIllIll[lIlIlllIl[71]];
        strArr[lIlIlllIl[15]] = lIlIllIll[lIlIlllIl[72]];
        strArr[lIlIlllIl[20]] = lIlIllIll[lIlIlllIl[73]];
        strArr[lIlIlllIl[21]] = lIlIllIll[lIlIlllIl[48]];
        strArr[lIlIlllIl[22]] = lIlIllIll[lIlIlllIl[74]];
        strArr[lIlIlllIl[23]] = lIlIllIll[lIlIlllIl[75]];
        kq = strArr;
        kr = new WorldPoint(lIlIlllIl[76], lIlIlllIl[77], lIlIlllIl[0]);
        ks = new WorldPoint(lIlIlllIl[78], lIlIlllIl[79], lIlIlllIl[0]);
        kt = new WorldPoint(lIlIlllIl[80], lIlIlllIl[81], lIlIlllIl[0]);
        ku = new WorldPoint(lIlIlllIl[82], lIlIlllIl[83], lIlIlllIl[0]);
        kv = new WorldPoint(lIlIlllIl[84], lIlIlllIl[85], lIlIlllIl[0]);
        kw = new WorldPoint(lIlIlllIl[86], lIlIlllIl[87], lIlIlllIl[0]);
        bv = new ArrayList();
        bT = lIlIlllIl[0];
    }

    private static boolean lIIlIIllIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIlIlIIIIII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[18])) {
            int[] iArr = new int[lIlIlllIl[1]];
            iArr[lIlIlllIl[0]] = lIlIlllIl[38];
            if (lIIlIIlllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIlIlllIl[1];
                "".length();
                return ((((130 + 14) - 31) + 30) ^ (((42 + 12) - 6) + 91)) <= (((((9 + 126) - (-54)) + 27) ^ (((82 + 21) - 48) + 80)) & (((((126 + 49) - 40) + 19) ^ (((166 + 80) - 235) + 186)) ^ (-" ".length()))) ? ((178 ^ 157) ^ (150 ^ 132)) & (((114 ^ 103) ^ (121 ^ 81)) ^ (-" ".length())) : r0;
            }
        }
        return lIlIlllIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIlllIl[0];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIllIll[lIlIlllIl[55]];
    }

    private static void lIIlIIllIIll() {
        lIlIllIll = new String[lIlIlllIl[88]];
        lIlIllIll[lIlIlllIl[0]] = lIIlIIlIllII("MTAvKCAUZT81Kx42", "sEVAN");
        lIlIllIll[lIlIlllIl[1]] = lIIlIIlIllIl("qJpEgEorHqTS9bEdX7F7EVPH9Cjqrcps1LDuJe9Sjsg1FM/1zJKyIZff7q2Fl2fX", "arEFN");
        lIlIllIll[lIlIlllIl[3]] = lIIlIIlIlllI("GAU1qunzWcE=", "pvgxD");
        lIlIllIll[lIlIlllIl[5]] = lIIlIIlIlllI("BimrFSTXwtY=", "jSLKe");
        lIlIllIll[lIlIlllIl[6]] = lIIlIIlIlllI("ArjG5DjGMJQ2cuCX7Kpi6A==", "adsdH");
        lIlIllIll[lIlIlllIl[7]] = lIIlIIlIllII("Hys9JTk+JDRhNzYkOCg7MA==", "WJSAU");
        lIlIllIll[lIlIlllIl[9]] = lIIlIIlIllIl("8DB+I44IPwktvQP/yR5UHU+a6rDCMiuoRkgDWv3sRDr2wUuh7pDhbQ90GMWBWKtbRsnfXj5jdv0=", "WsDII");
        lIlIllIll[lIlIlllIl[17]] = lIIlIIlIllIl("CyVi1IevEPKkaRn2uTLD2Q==", "FMZhY");
        lIlIllIll[lIlIlllIl[18]] = lIIlIIlIlllI("Al3h7I2r3z7YPwc6k54Whw==", "YaPpW");
        lIlIllIll[lIlIlllIl[19]] = lIIlIIlIllIl("CHxuFK9KEkI=", "uKefq");
        lIlIllIll[lIlIlllIl[15]] = lIIlIIlIlllI("flLvo4AfUBM=", "bvWWC");
        lIlIllIll[lIlIlllIl[20]] = lIIlIIlIllIl("ai3SSbj29LZRjXPwx/ck6Q==", "SXUKK");
        lIlIllIll[lIlIlllIl[21]] = lIIlIIlIllIl("511OofgYW/Q=", "bSSfK");
        lIlIllIll[lIlIlllIl[22]] = lIIlIIlIllIl("FwztdkSI6js=", "rAXFm");
        lIlIllIll[lIlIlllIl[23]] = lIIlIIlIllIl("B8KfmZFmOh0N90NOYtU+6Q==", "FLDOo");
        lIlIllIll[lIlIlllIl[24]] = lIIlIIlIlllI("Yl03eZbrv+M=", "gwyjh");
        lIlIllIll[lIlIlllIl[25]] = lIIlIIlIlllI("VcAjL2MQTCs=", "ploHT");
        lIlIllIll[lIlIlllIl[26]] = lIIlIIlIlllI("mw5z96eCqGYBZK7BpUDmfQ==", "GGMdz");
        lIlIllIll[lIlIlllIl[27]] = lIIlIIlIlllI("P3LCRrAgkeM=", "UZeQr");
        lIlIllIll[lIlIlllIl[28]] = lIIlIIlIllII("KgYu", "noIXF");
        lIlIllIll[lIlIlllIl[29]] = lIIlIIlIllII("JAcRaiMFRgMjMEpV", "jfgJW");
        lIlIllIll[lIlIlllIl[30]] = lIIlIIlIllII("FDUGLQ8=", "GEgIj");
        lIlIllIll[lIlIlllIl[31]] = lIIlIIlIlllI("YRlRsDkIulg=", "FsTdR");
        lIlIllIll[lIlIlllIl[32]] = lIIlIIlIllII("Ii4eVSEDbwwcMkx7", "lOhuU");
        lIlIllIll[lIlIlllIl[33]] = lIIlIIlIllIl("LZVG7pkhrt0=", "qQHIa");
        lIlIllIll[lIlIlllIl[34]] = lIIlIIlIlllI("XdJwXXcrH8I=", "WSOAz");
        lIlIllIll[lIlIlllIl[35]] = lIIlIIlIllII("ORI7RAYYUzsBHQRTKw0cHgAl", "wsMdr");
        lIlIllIll[lIlIlllIl[36]] = lIIlIIlIllIl("wg3gMeZKxicI3mPdm2n1og==", "eVFTj");
        lIlIllIll[lIlIlllIl[37]] = lIIlIIlIllII("DgMnHQ==", "XfHnT");
        lIlIllIll[lIlIlllIl[40]] = lIIlIIlIllII("ADkLDyU8K0kBLT88", "RLimL");
        lIlIllIll[lIlIlllIl[41]] = lIIlIIlIllII("FiwF", "DYgqz");
        lIlIllIll[lIlIlllIl[42]] = lIIlIIlIllIl("JoSI/qOWJ2G7XTwo0mHe46BvWyGj8ysF", "nWQXT");
        lIlIllIll[lIlIlllIl[43]] = lIIlIIlIllIl("/tJwD6szlR8=", "ABDQx");
        lIlIllIll[lIlIlllIl[44]] = lIIlIIlIlllI("w27bpUZFRto=", "gAzkT");
        lIlIllIll[lIlIlllIl[45]] = lIIlIIlIlllI("mwfaBa8WObI=", "RXHkE");
        lIlIllIll[lIlIlllIl[55]] = lIIlIIlIlllI("qOkVely+CfL/4Eb+FGaLwoWgMoeGN0cR", "TcZFO");
        lIlIllIll[lIlIlllIl[56]] = lIIlIIlIlllI("DIL9TmZ1sAvDVt+AnTfOey4NS02K298g", "EwNKx");
        lIlIllIll[lIlIlllIl[57]] = lIIlIIlIllII("DhE7IRER", "ytZMe");
        lIlIllIll[lIlIlllIl[58]] = lIIlIIlIllIl("Iioljm8VM34=", "OuClh");
        lIlIllIll[lIlIlllIl[59]] = lIIlIIlIllII("LR0DPBUy", "ZxbPa");
        lIlIllIll[lIlIlllIl[53]] = lIIlIIlIllIl("3R9YaZrCv6U=", "rJvUs");
        lIlIllIll[lIlIlllIl[60]] = lIIlIIlIlllI("p37xuz7jq1Y=", "LlGZS");
        lIlIllIll[lIlIlllIl[61]] = lIIlIIlIlllI("OdSqyXxS4fA=", "XgvMn");
        lIlIllIll[lIlIlllIl[62]] = lIIlIIlIlllI("JKCC1+o+N1nN53W0f08vEiVGGrfuOsVZaEX7NGxTs8o=", "IYrgf");
        lIlIllIll[lIlIlllIl[63]] = lIIlIIlIlllI("iXu+NIA+T3rN/4BBBrhXDT1M6lOzyeB6CJKdVviIjUi0MUtlecSl/A==", "sHqfo");
        lIlIllIll[lIlIlllIl[64]] = lIIlIIlIllIl("zHaz9Nss7d96NZv0SHC0w2kcAwYkYUDs", "bZGcg");
        lIlIllIll[lIlIlllIl[65]] = lIIlIIlIllII("OB00Yg==", "axGLw");
        lIlIllIll[lIlIlllIl[66]] = lIIlIIlIllIl("Y7coWsddHArfEj7KVzoK3u/P6bi5pAoUXmQBKqJX+1s=", "opsGa");
        lIlIllIll[lIlIlllIl[67]] = lIIlIIlIllIl("10aV0FbaSvI5QZHlPDKBJejksz4OVdzu", "snixE");
        lIlIllIll[lIlIlllIl[68]] = lIIlIIlIllIl("I9q5h3HeGpzFEaCxs4cwtC8JOixowmXuws6BV+44zoMOTP8x4eNuag==", "rzUEa");
        lIlIllIll[lIlIlllIl[69]] = lIIlIIlIlllI("RUIKaC3n508tzvn6k6n8+zcIyH2BlAkRFf6vy+OS3NSAh5S8f91QEp0BPDNfSaf4", "khXNs");
        lIlIllIll[lIlIlllIl[70]] = lIIlIIlIlllI("/qkdOMsoBT7SiKFkFK49sbtJRBTMBc2PCr8z0xl9tpW3WvoiZJ/Wzg==", "WpErD");
        lIlIllIll[lIlIlllIl[71]] = lIIlIIlIllII("KTo1Ino=", "zOGGT");
        lIlIllIll[lIlIlllIl[72]] = lIIlIIlIllII("JlEEZhgKFxsvAQhWCChPDhscKgobVgYgTwgeBjUbTwUZIw4EVw==", "oviFo");
        lIlIllIll[lIlIlllIl[73]] = lIIlIIlIllIl("j7iarRftcIV3QnGpa89EYA==", "nDrzg");
        lIlIllIll[lIlIlllIl[48]] = lIIlIIlIllII("ED84azY5Pm8CdTA1Iztq", "XPOKU");
        lIlIllIll[lIlIlllIl[74]] = lIIlIIlIlllI("C5r6PHk8f5Cnh475xJDO6xodUYi27PYgZR26PrRlQog=", "syHxi");
        lIlIllIll[lIlIlllIl[75]] = lIIlIIlIllIl("L16Nx94qPETMULLiABrlFQ==", "EXBrN");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[lIlIlllIl[1]];
        strArr[lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[45]];
        if (lIIlIIllIlll(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIlIlllIl[1]];
            iArr[lIlIlllIl[0]] = lIlIlllIl[4];
            if (lIIlIIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIlIlllIl[1];
                "".length();
                return ((((92 + 30) - 113) + 129) ^ (((111 + 104) - 206) + 133)) < 0 ? ((((129 + 112) - 231) + 135) ^ (((166 + 1) - 145) + 167)) & (((((63 + 103) - 133) + 97) ^ (((7 + 39) - (-15)) + 113)) ^ (-" ".length())) : r0;
            }
        }
        return lIlIlllIl[0];
    }

    private static boolean lIIlIlIIIIII(int i, int i2) {
        return i >= i2;
    }

    private static void lIIlIIllIlII() {
        lIlIlllIl = new int[89];
        lIlIlllIl[0] = (118 ^ 56) & ((23 ^ 89) ^ (-1));
        lIlIlllIl[1] = " ".length();
        lIlIlllIl[2] = (36 ^ 7) ^ (211 ^ 182);
        lIlIlllIl[3] = "  ".length();
        lIlIlllIl[4] = (-23557) & 23935;
        lIlIlllIl[5] = "   ".length();
        lIlIlllIl[6] = 46 ^ 42;
        lIlIlllIl[7] = (((8 + 89) - 73) + 131) ^ (((129 + 85) - 127) + 71);
        lIlIlllIl[8] = (-(245 ^ 176)) & (-10241) & 15308;
        lIlIlllIl[9] = (63 ^ 78) ^ (233 ^ 158);
        lIlIlllIl[10] = (-20769) & 32746;
        lIlIlllIl[11] = (-((-18185) & 26553)) & (-4) & 16379;
        lIlIlllIl[12] = (-1035) & 13659;
        lIlIlllIl[13] = (-24721) & 32727;
        lIlIlllIl[14] = (-((-6145) & 23620)) & (-10245) & 28671;
        lIlIlllIl[15] = (231 ^ 164) ^ (95 ^ 22);
        lIlIlllIl[16] = (-(170 ^ 153)) & (-133) & 8191;
        lIlIlllIl[17] = 135 ^ 128;
        lIlIlllIl[18] = (95 ^ 43) ^ (95 ^ 35);
        lIlIlllIl[19] = (177 ^ 192) ^ (122 ^ 2);
        lIlIlllIl[20] = 114 ^ 121;
        lIlIlllIl[21] = (((115 + 132) - 97) + 23) ^ (((129 + 130) - 200) + 102);
        lIlIlllIl[22] = 121 ^ 116;
        lIlIlllIl[23] = 77 ^ 67;
        lIlIlllIl[24] = 148 ^ 155;
        lIlIlllIl[25] = (((174 + 119) - 124) + 18) ^ (((1 + 63) - (-7)) + 100);
        lIlIlllIl[26] = 168 ^ 185;
        lIlIlllIl[27] = (25 ^ 78) ^ (3 ^ 70);
        lIlIlllIl[28] = (30 ^ 94) ^ (218 ^ 137);
        lIlIlllIl[29] = (((128 + 114) - 222) + 157) ^ (((157 + 132) - 206) + 82);
        lIlIlllIl[30] = (207 ^ 197) ^ (186 ^ 165);
        lIlIlllIl[31] = (222 ^ 171) ^ (123 ^ 24);
        lIlIlllIl[32] = (((1 + 137) - 21) + 25) ^ (((31 + 70) - (-44)) + 8);
        lIlIlllIl[33] = (113 ^ 2) ^ (198 ^ 173);
        lIlIlllIl[34] = (((169 + 56) - 145) + 109) ^ (((30 + 47) - (-12)) + 75);
        lIlIlllIl[35] = (223 ^ 145) ^ (9 ^ 93);
        lIlIlllIl[36] = (((97 + 87) - 60) + 39) ^ (((55 + 84) - 132) + 177);
        lIlIlllIl[37] = (161 ^ 179) ^ (130 ^ 140);
        lIlIlllIl[38] = (-((-14884) & 16375)) & (-9) & 24571;
        lIlIlllIl[39] = (((((36 + 130) - 55) + 42) + (((178 + 156) - 324) + 195)) - (((69 + 88) - 68) + 40)) + (91 ^ 80);
        lIlIlllIl[40] = 184 ^ 165;
        lIlIlllIl[41] = 2 ^ 28;
        lIlIlllIl[42] = 23 ^ 8;
        lIlIlllIl[43] = 169 ^ 137;
        lIlIlllIl[44] = 59 ^ 26;
        lIlIlllIl[45] = (((29 + 33) - 60) + 139) ^ (((20 + 113) - 63) + 105);
        lIlIlllIl[46] = (-129) & 16028;
        lIlIlllIl[47] = (-8433) & 14332;
        lIlIlllIl[48] = (((22 + 72) - (-2)) + 53) ^ (((31 + 4) - (-76)) + 51);
        lIlIlllIl[49] = (-7179) & 7678;
        lIlIlllIl[50] = (-16401) & 28380;
        lIlIlllIl[51] = (-7751) & 32750;
        lIlIlllIl[52] = (-12305) & 14204;
        lIlIlllIl[53] = 142 ^ 166;
        lIlIlllIl[54] = (37 ^ 7) ^ (9 ^ 79);
        lIlIlllIl[55] = 133 ^ 166;
        lIlIlllIl[56] = (((101 + 9) - 63) + 133) ^ (((61 + 71) - 57) + 69);
        lIlIlllIl[57] = 83 ^ 118;
        lIlIlllIl[58] = (((4 + 92) - 82) + 123) ^ (((163 + 150) - 262) + 124);
        lIlIlllIl[59] = 166 ^ 129;
        lIlIlllIl[60] = (((98 + 46) - 89) + 92) ^ (((92 + 102) - 21) + 13);
        lIlIlllIl[61] = 41 ^ 3;
        lIlIlllIl[62] = 149 ^ 190;
        lIlIlllIl[63] = 112 ^ 92;
        lIlIlllIl[64] = 169 ^ 132;
        lIlIlllIl[65] = (((68 + 109) - 174) + 231) ^ (((86 + 161) - 228) + 177);
        lIlIlllIl[66] = 30 ^ 49;
        lIlIlllIl[67] = (209 ^ 163) ^ (229 ^ 167);
        lIlIlllIl[68] = (209 ^ 157) ^ (32 ^ 93);
        lIlIlllIl[69] = (58 ^ 102) ^ (198 ^ 168);
        lIlIlllIl[70] = 55 ^ 4;
        lIlIlllIl[71] = 161 ^ 149;
        lIlIlllIl[72] = (105 ^ 54) ^ (238 ^ 132);
        lIlIlllIl[73] = (90 ^ 103) ^ (0 ^ 11);
        lIlIlllIl[74] = (184 ^ 150) ^ (50 ^ 36);
        lIlIlllIl[75] = (((143 + 150) - 264) + 158) ^ (((38 + 47) - 64) + 109);
        lIlIlllIl[76] = (-((-23049) & 31563)) & (-20513) & 32255;
        lIlIlllIl[77] = (-20504) & 23743;
        lIlIlllIl[78] = (-(92 ^ 29)) & (-545) & 3838;
        lIlIlllIl[79] = (-29267) & 32475;
        lIlIlllIl[80] = (-17277) & 20479;
        lIlIlllIl[81] = (-((-11325) & 32639)) & (-8226) & 32751;
        lIlIlllIl[82] = (-((-1057) & 17593)) & (-8771) & 28415;
        lIlIlllIl[83] = (-29186) & 32449;
        lIlIlllIl[84] = (-25186) & 28263;
        lIlIlllIl[85] = (-20801) & 24059;
        lIlIlllIl[86] = (-((-16698) & 30011)) & (-16385) & 32751;
        lIlIlllIl[87] = (-12882) & 16127;
        lIlIlllIl[88] = 254 ^ 196;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v355, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v400, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean] */
    public static void dd() {
        if (lIIlIIllIlll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[0]];
            C0001b.a(bv);
            if (lIIlIIlllIII(bv.size(), lIlIlllIl[1])) {
                System.out.println(lIlIllIll[lIlIlllIl[1]]);
                bt = lIlIlllIl[0];
            }
        }
        if (lIIlIIlllIIl(bt ? 1 : 0)) {
            if (lIIlIIllIlll(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlIIlllIII(Movement.getRunEnergy(), lIlIlllIl[2])) {
                Inventory.getFirst(C0005f.aV).interact(lIlIllIll[lIlIlllIl[3]]);
                Time.sleepTicks(lIlIlllIl[1]);
                "".length();
            }
            if (lIIlIIlllIlI(lIIlIIllIlIl(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lIlIlllIl[1]];
                iArr[lIlIlllIl[0]] = lIlIlllIl[4];
                if (lIIlIIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIlllIl[1]];
                    iArr2[lIlIlllIl[0]] = lIlIlllIl[4];
                    Inventory.getFirst(iArr2).interact(lIlIllIll[lIlIlllIl[5]]);
                }
            }
            if (lIIlIIlllIIl(Movement.isRunEnabled() ? 1 : 0) && lIIlIIlllIll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIIlIIlllIIl(ab() ? 1 : 0) && lIIlIIlllIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIllllII(nearest) && lIIlIIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIlIlllIl[3]);
                    "".length();
                }
                if (lIIlIIllllII(nearest) && lIIlIIllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[7]];
                    if (lIIlIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIlllIl[8]);
                        "".length();
                    }
                    if (lIIlIIllIlll(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIIlllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIlllIl[6]);
                            "".length();
                        }
                        if (lIIlIIlllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIlllIl[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIlIlllIl[9]];
                        iArr3[lIlIlllIl[0]] = lIlIlllIl[10];
                        iArr3[lIlIlllIl[1]] = lIlIlllIl[11];
                        iArr3[lIlIlllIl[3]] = lIlIlllIl[12];
                        iArr3[lIlIlllIl[5]] = lIlIlllIl[13];
                        iArr3[lIlIlllIl[6]] = lIlIlllIl[4];
                        iArr3[lIlIlllIl[7]] = lIlIlllIl[14];
                        if (lIIlIIlllIIl(C0004e.b(iArr3) ? 1 : 0)) {
                            af();
                            System.out.println(lIlIllIll[lIlIlllIl[9]]);
                            bt = lIlIlllIl[1];
                            return;
                        }
                        int[] iArr4 = new int[lIlIlllIl[9]];
                        iArr4[lIlIlllIl[0]] = lIlIlllIl[10];
                        iArr4[lIlIlllIl[1]] = lIlIlllIl[11];
                        iArr4[lIlIlllIl[3]] = lIlIlllIl[12];
                        iArr4[lIlIlllIl[5]] = lIlIlllIl[13];
                        iArr4[lIlIlllIl[6]] = lIlIlllIl[4];
                        iArr4[lIlIlllIl[7]] = lIlIlllIl[14];
                        if (lIIlIIllIlll(C0004e.b(iArr4) ? 1 : 0)) {
                            Bank.withdraw(lIlIlllIl[11], lIlIlllIl[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIlllIl[1]);
                            "".length();
                            Bank.withdraw(lIlIlllIl[14], lIlIlllIl[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIlllIl[1]);
                            "".length();
                            Bank.withdraw(lIlIlllIl[16], lIlIlllIl[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIlllIl[1]);
                            "".length();
                            Bank.withdraw(lIlIlllIl[13], lIlIlllIl[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIlllIl[1]);
                            "".length();
                            Bank.withdraw(lIlIlllIl[10], lIlIlllIl[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIlllIl[1]);
                            "".length();
                            C0000a.b(C0005f.aV, lIlIlllIl[6]);
                            C0000a.a(lIlIlllIl[4], lIlIlllIl[15]);
                            C0000a.b(C0005f.bf, lIlIlllIl[1]);
                        }
                    }
                }
            }
            if (lIIlIIlllIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && lIIlIIllIlll(ab() ? 1 : 0)) {
                if (lIIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(kr), lIlIlllIl[3])) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[17]];
                    if (lIIlIIlllIII(bT, lIlIlllIl[1])) {
                        C0004e.v();
                        bT += lIlIlllIl[1];
                    }
                    Movement.walkTo(kr);
                    "".length();
                    Time.sleepTicks(lIlIlllIl[1]);
                    "".length();
                }
                if (lIIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(kr), lIlIlllIl[3])) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[18]];
                    if (lIIlIIlllIIl(lIIlIIllIllI(g, 0L))) {
                        g = System.currentTimeMillis();
                    }
                    if (lIIlIIllIlll(lIIlIIllIllI(g, 0L)) && lIIlIIlllIll(lIIlIIllIllI(C0004e.a(g), 30000L))) {
                        bT = lIlIlllIl[0];
                        g = System.currentTimeMillis();
                    }
                    if (lIIlIIlllIII(bT, lIlIlllIl[1])) {
                        C0004e.v();
                        bT += lIlIlllIl[1];
                    }
                    if (lIIlIIllIlll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIlllIl[1]];
                        iArr5[lIlIlllIl[0]] = lIlIlllIl[4];
                        Inventory.getFirst(iArr5).interact(lIlIllIll[lIlIlllIl[19]]);
                        Time.sleepTicks(lIlIlllIl[3]);
                        "".length();
                    }
                    C0006g.a(lIlIllIll[lIlIlllIl[15]], kq, lIlIlllIl[1]);
                }
            }
            if (lIIlIIllllll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[1])) {
                cl = lIlIlllIl[0];
                String[] strArr = new String[lIlIlllIl[1]];
                strArr[lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[20]];
                if (lIIlIIlllIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    C0006g.a(kq);
                }
            }
            if (lIIlIIllllll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[3])) {
                if (lIIlIIllIlll(Inventory.contains(item -> {
                    return item.getName().contains(lIlIllIll[lIlIlllIl[61]]);
                }) ? 1 : 0) && lIIlIIlllIIl(Equipment.contains(item2 -> {
                    return item2.getName().contains(lIlIllIll[lIlIlllIl[60]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lIlIllIll[lIlIlllIl[53]]);
                    }).interact(lIlIllIll[lIlIlllIl[21]]);
                }
                if (lIIlIIllIlll(Inventory.contains(item4 -> {
                    return item4.getName().contains(lIlIllIll[lIlIlllIl[59]]);
                }) ? 1 : 0) && lIIlIIlllIIl(Equipment.contains(item5 -> {
                    return item5.getName().contains(lIlIllIll[lIlIlllIl[58]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(lIlIllIll[lIlIlllIl[57]]);
                    }).interact(lIlIllIll[lIlIlllIl[22]]);
                }
                if (lIIlIIlllIIl(Players.getLocal().getWorldLocation().equals(ks) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[23]];
                    Movement.walkTo(ks);
                    "".length();
                    Time.sleepTicks(lIlIlllIl[1]);
                    "".length();
                }
                if (lIIlIIllIlll(Players.getLocal().getWorldLocation().equals(ks) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIlllIl[1]];
                    strArr2[lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[24]];
                    Inventory.getFirst(strArr2).interact(lIlIllIll[lIlIlllIl[25]]);
                    Time.sleepTicks(lIlIlllIl[3]);
                    "".length();
                }
            }
            if (lIIlIIllllll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[5])) {
                if (lIIlIIlllIIl(Players.getLocal().getWorldLocation().equals(kt) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[26]];
                    Movement.walkTo(kt);
                    "".length();
                    Time.sleepTicks(lIlIlllIl[1]);
                    "".length();
                }
                if (lIIlIIllIlll(Players.getLocal().getWorldLocation().equals(kt) ? 1 : 0)) {
                    String[] strArr3 = new String[lIlIlllIl[1]];
                    strArr3[lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[27]];
                    Inventory.getFirst(strArr3).interact(lIlIllIll[lIlIlllIl[28]]);
                    Time.sleepTicks(lIlIlllIl[3]);
                    "".length();
                }
            }
            if (lIIlIIllllll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[6])) {
                if (lIIlIIlllIIl(Players.getLocal().getWorldLocation().equals(ku) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[29]];
                    Movement.walkTo(ku);
                    "".length();
                    Time.sleepTicks(lIlIlllIl[1]);
                    "".length();
                }
                if (lIIlIIllIlll(Players.getLocal().getWorldLocation().equals(ku) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIlllIl[1]];
                    strArr4[lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[30]];
                    Inventory.getFirst(strArr4).interact(lIlIllIll[lIlIlllIl[31]]);
                    Time.sleepTicks(lIlIlllIl[3]);
                    "".length();
                }
            }
            if (lIIlIIllllll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[7])) {
                if (lIIlIIlllIIl(Players.getLocal().getWorldLocation().equals(kv) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[32]];
                    Movement.walkTo(kv);
                    "".length();
                    Time.sleepTicks(lIlIlllIl[1]);
                    "".length();
                }
                if (lIIlIIllIlll(Players.getLocal().getWorldLocation().equals(kv) ? 1 : 0)) {
                    String[] strArr5 = new String[lIlIlllIl[1]];
                    strArr5[lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[33]];
                    Inventory.getFirst(strArr5).interact(lIlIllIll[lIlIlllIl[34]]);
                    Time.sleepTicks(lIlIlllIl[3]);
                    "".length();
                }
            }
            if (lIIlIIllllll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[9])) {
                if (lIIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(kw), lIlIlllIl[5])) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[35]];
                    Movement.walkTo(kw);
                    "".length();
                    Time.sleepTicks(lIlIlllIl[1]);
                    "".length();
                }
                if (lIIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(kw), lIlIlllIl[5])) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[36]];
                    if (lIIlIIlllIII(cl, lIlIlllIl[1])) {
                        an.py += lIlIlllIl[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIlllIl[1];
                        an.py = lIlIlllIl[0];
                        cm = lIlIlllIl[0];
                    }
                    C0006g.a(lIlIllIll[lIlIlllIl[37]], kq);
                }
            }
            if (lIIlIIllllll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[17])) {
                C0006g.a(kq);
            }
            do {
                int[] iArr6 = new int[lIlIlllIl[1]];
                iArr6[lIlIlllIl[0]] = lIlIlllIl[38];
                if (!lIIlIIllIlll(Inventory.contains(iArr6) ? 1 : 0)) {
                    C0006g.a(new String[lIlIlllIl[0]]);
                    return;
                }
                if (lIIlIIllllII(Widgets.get(lIlIlllIl[39]))) {
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[40]];
                    int[] iArr7 = new int[lIlIlllIl[1]];
                    iArr7[lIlIlllIl[0]] = lIlIlllIl[38];
                    Inventory.getFirst(iArr7).interact(lIlIllIll[lIlIlllIl[41]]);
                    Time.sleepTicks(lIlIlllIl[6]);
                    "".length();
                    AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[42]];
                    Widget widget = Widgets.get(lIlIlllIl[39], lIlIlllIl[23]);
                    if (lIIlIIllllII(widget)) {
                        widget.interact(lIlIllIll[lIlIlllIl[43]]);
                        Time.sleepTicks(lIlIlllIl[1]);
                        "".length();
                    }
                    Widget widget2 = Widgets.get(lIlIlllIl[39], lIlIlllIl[35]);
                    if (lIIlIIllllII(widget2)) {
                        widget2.interact(lIlIllIll[lIlIlllIl[44]]);
                        Time.sleepTicks(lIlIlllIl[3]);
                        "".length();
                    }
                }
                Time.sleepTicks(lIlIlllIl[1]);
                "".length();
                "".length();
            } while ("   ".length() > (-" ".length()));
        }
    }

    private static boolean lIIlIIlllIlI(int i) {
        return i < 0;
    }

    private static boolean lIIlIIllllIl(int i, int i2) {
        return i > i2;
    }

    private static void af() {
        int[] iArr = new int[lIlIlllIl[1]];
        iArr[lIlIlllIl[0]] = lIlIlllIl[10];
        if (lIIlIIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlllIl[10], lIlIlllIl[1], lIlIlllIl[46]));
            "".length();
        }
        int[] iArr2 = new int[lIlIlllIl[1]];
        iArr2[lIlIlllIl[0]] = lIlIlllIl[14];
        if (lIIlIIlllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlllIl[14], lIlIlllIl[1], lIlIlllIl[47]));
            "".length();
        }
        int[] iArr3 = new int[lIlIlllIl[1]];
        iArr3[lIlIlllIl[0]] = lIlIlllIl[4];
        if (lIIlIIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlllIl[4], lIlIlllIl[48], lIlIlllIl[49]));
            "".length();
        }
        if (lIIlIIlllIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIllIll[lIlIlllIl[56]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlllIl[50], lIlIlllIl[7], lIlIlllIl[51]));
            "".length();
        }
        int[] iArr4 = new int[lIlIlllIl[1]];
        iArr4[lIlIlllIl[0]] = lIlIlllIl[11];
        if (lIIlIIlllIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlllIl[11], lIlIlllIl[15], lIlIlllIl[52]));
            "".length();
        }
        int[] iArr5 = new int[lIlIlllIl[1]];
        iArr5[lIlIlllIl[0]] = lIlIlllIl[16];
        if (lIIlIIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlllIl[16], lIlIlllIl[15], lIlIlllIl[52]));
            "".length();
        }
        int[] iArr6 = new int[lIlIlllIl[1]];
        iArr6[lIlIlllIl[0]] = lIlIlllIl[13];
        if (lIIlIIlllIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlllIl[13], lIlIlllIl[53], lIlIlllIl[52]));
            "".length();
        }
        int[] iArr7 = new int[lIlIlllIl[1]];
        iArr7[lIlIlllIl[0]] = lIlIlllIl[12];
        if (lIIlIIlllIIl(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlllIl[12], lIlIlllIl[7], C0008i.bq));
            "".length();
        }
    }

    private static boolean lIIlIIlllllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIIlllIII(int i, int i2) {
        return i < i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            dd();
            "".length();
            if ("   ".length() < ((48 ^ 108) & ((23 ^ 75) ^ (-1)))) {
                return "   ".length() & ("   ".length() ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIlllIl[54];
    }

    private static boolean lIIlIIllllII(Object obj) {
        return obj != null;
    }

    private static String lIIlIIlIlllI(String lllIIIIIllIlll, String lllIIIIIllIllI) {
        try {
            SecretKeySpec lllIIIIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllIl[3], lllIIIIIlllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIIIlllIII) {
            lllIIIIIlllIII.printStackTrace();
            return null;
        }
    }

    private static int lIIlIIllIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIIlllIll(int i) {
        return i > 0;
    }

    private static boolean lIIlIIllllll(int i, int i2) {
        return i == i2;
    }

    private static int lIIlIIllIllI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static String lIIlIIlIllIl(String lllIIIIlIIIlII, String lllIIIIlIIIIll) {
        try {
            SecretKeySpec lllIIIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlllIl[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlllIl[3], lllIIIIlIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIIlIIIIII) {
            lllIIIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlllIIl(int i) {
        return i == 0;
    }

    private static String lIIlIIlIllII(String lllIIIIlIllIIl, String lllIIIIlIllIII) {
        String str = new String(Base64.getDecoder().decode(lllIIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIIIIlIlIllI = lllIIIIlIllIII.toCharArray();
        int lllIIIIlIlIlIl = lIlIlllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlllIl[0];
        while (lIIlIIlllIII(i, length)) {
            char lllIIIIlIllIlI = charArray[i];
            sb.append((char) (lllIIIIlIllIlI ^ lllIIIIlIlIllI[lllIIIIlIlIlIl % lllIIIIlIlIllI.length]));
            "".length();
            lllIIIIlIlIlIl++;
            i++;
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
