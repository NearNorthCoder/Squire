package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.y  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/y.class */
public class y implements G {
    public static final /* synthetic */ String ek;
    public static final /* synthetic */ String er;
    public static final /* synthetic */ int dz;
    public static final /* synthetic */ String eJ;
    public static final /* synthetic */ String dX;
    public static final /* synthetic */ int dq;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ String ej;
    public static final /* synthetic */ String em;
    public static final /* synthetic */ String fo;
    public static final /* synthetic */ String fb;
    public static final /* synthetic */ String eW;
    public static final /* synthetic */ String eo;
    public static /* synthetic */ WorldArea bS;
    public static final /* synthetic */ int dB;
    public static final /* synthetic */ String dW;
    public static final /* synthetic */ String fd;
    public static final /* synthetic */ String eZ;
    public static final /* synthetic */ String eG;
    public static final /* synthetic */ String eU;
    public static final /* synthetic */ String eX;
    public static final /* synthetic */ int dA;
    public static final /* synthetic */ String fa;
    public static final /* synthetic */ String dM;
    public static final /* synthetic */ int dw;
    public static final /* synthetic */ String el;
    public static final /* synthetic */ String ef;
    public static final /* synthetic */ String eS;
    static /* synthetic */ int ck;
    public static final /* synthetic */ String eb;
    public static /* synthetic */ String[] fp;
    public static final /* synthetic */ String en;
    public static final /* synthetic */ String eD;
    public static final /* synthetic */ String eB;
    public static final /* synthetic */ String ex;
    public static final /* synthetic */ String ep;
    public static final /* synthetic */ WorldPoint dI;
    public static final /* synthetic */ String dO;
    public static final /* synthetic */ String eN;
    public static final /* synthetic */ String es;
    public static final /* synthetic */ String fe;
    public static final /* synthetic */ String eg;
    public static final /* synthetic */ String fm;
    public static final /* synthetic */ String dN;
    public static final /* synthetic */ String fl;
    public static final /* synthetic */ String ec;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ String ey;
    public static final /* synthetic */ int dn;
    public static final /* synthetic */ String dQ;
    public static final /* synthetic */ String eL;

    /* renamed from: do  reason: not valid java name */
    public static final /* synthetic */ int f1do;
    public static final /* synthetic */ String dT;
    public static final /* synthetic */ WorldPoint dE;
    public static final /* synthetic */ String ev;
    public static final /* synthetic */ String et;
    public static final /* synthetic */ String eY;
    public static final /* synthetic */ String fk;
    public static final /* synthetic */ WorldPoint dC;
    public static final /* synthetic */ int dl;
    public static final /* synthetic */ String dZ;
    public static final /* synthetic */ int dx;
    public static final /* synthetic */ int dv;
    public static final /* synthetic */ int dp;
    public static final /* synthetic */ int dr;
    public static final /* synthetic */ String ed;
    public static final /* synthetic */ String ez;
    public static final /* synthetic */ String dP;
    public static final /* synthetic */ String ew;
    public static final /* synthetic */ String ea;
    public static final /* synthetic */ String fn;
    public static final /* synthetic */ String eu;
    public static final /* synthetic */ String eh;
    public static final /* synthetic */ String eC;
    public static final /* synthetic */ String dS;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ String fj;
    public static final /* synthetic */ WorldPoint dH;
    public static final /* synthetic */ String dU;
    public static final /* synthetic */ String eV;
    public static final /* synthetic */ String eR;
    public static final /* synthetic */ String eA;
    public static final /* synthetic */ String eE;
    public static final /* synthetic */ String fg;
    public static final /* synthetic */ String eK;
    public static final /* synthetic */ String dV;
    public static final /* synthetic */ String ei;
    public static final /* synthetic */ String dJ;
    public static final /* synthetic */ String dL;
    public static final /* synthetic */ int du;
    public static final /* synthetic */ String eF;
    public static final /* synthetic */ String dR;
    public static final /* synthetic */ String eO;
    public static final /* synthetic */ WorldPoint dF;
    public static final /* synthetic */ String eT;
    public static final /* synthetic */ String eQ;
    public static final /* synthetic */ String eM;
    public static final /* synthetic */ int dm;
    public static final /* synthetic */ String fi;
    public static final /* synthetic */ String ff;
    public static final /* synthetic */ String dK;
    public static final /* synthetic */ String fc;
    public static final /* synthetic */ String eq;
    public static final /* synthetic */ int ds;
    public static final /* synthetic */ String eI;
    private static /* synthetic */ int[] lIIlIIlIll;
    public static final /* synthetic */ String fh;
    public static final /* synthetic */ String dY;
    public static final /* synthetic */ String eP;
    public static final /* synthetic */ WorldPoint dD;
    public static final /* synthetic */ WorldPoint dG;
    public static final /* synthetic */ int dy;
    public static final /* synthetic */ int dt;
    public static final /* synthetic */ String ee;
    private static /* synthetic */ String[] lIIlIIlIIl;
    public static final /* synthetic */ String eH;

    private static boolean lllllIIlIlII(int i) {
        return i == 0;
    }

    private static String lllllIIIIIll(String lIIlIl, String lIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIlIll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllI) {
            lIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static boolean ab() {
        if (lllllIIlIllI(Inventory.getCount(C0005f.aV))) {
            int[] iArr = new int[lIIlIIlIll[2]];
            iArr[lIIlIIlIll[1]] = lIIlIIlIll[7];
            if (lllllIIlIllI(Inventory.getCount(iArr))) {
                ?? r0 = lIIlIIlIll[2];
                "".length();
                return (((106 ^ 80) ^ (32 ^ 22)) & (((215 ^ 174) ^ (218 ^ 175)) ^ (-" ".length()))) < (-" ".length()) ? ((((44 + 129) - 48) + 11) ^ (((85 + 30) - 50) + 108)) & (((238 ^ 192) ^ (58 ^ 49)) ^ (-" ".length())) : r0;
            }
        }
        return lIIlIIlIll[1];
    }

    static {
        lllllIIlIIIl();
        lllllIIlIIII();
        dm = lIIlIIlIll[6];
        er = lIIlIIlIIl[lIIlIIlIll[70]];
        eB = lIIlIIlIIl[lIIlIIlIll[71]];
        eu = lIIlIIlIIl[lIIlIIlIll[72]];
        dQ = lIIlIIlIIl[lIIlIIlIll[73]];
        eR = lIIlIIlIIl[lIIlIIlIll[74]];
        fa = lIIlIIlIIl[lIIlIIlIll[75]];
        dw = lIIlIIlIll[40];
        eM = lIIlIIlIIl[lIIlIIlIll[76]];
        dP = lIIlIIlIIl[lIIlIIlIll[77]];
        fn = lIIlIIlIIl[lIIlIIlIll[78]];
        eY = lIIlIIlIIl[lIIlIIlIll[79]];
        ea = lIIlIIlIIl[lIIlIIlIll[80]];
        eD = lIIlIIlIIl[lIIlIIlIll[11]];
        eQ = lIIlIIlIIl[lIIlIIlIll[81]];
        eS = lIIlIIlIIl[lIIlIIlIll[82]];
        ey = lIIlIIlIIl[lIIlIIlIll[83]];
        dA = lIIlIIlIll[52];
        dy = lIIlIIlIll[46];
        dr = lIIlIIlIll[26];
        ds = lIIlIIlIll[28];
        eW = lIIlIIlIIl[lIIlIIlIll[84]];
        ez = lIIlIIlIIl[lIIlIIlIll[85]];
        dL = lIIlIIlIIl[lIIlIIlIll[86]];
        fe = lIIlIIlIIl[lIIlIIlIll[87]];
        eU = lIIlIIlIIl[lIIlIIlIll[88]];
        ef = lIIlIIlIIl[lIIlIIlIll[89]];
        dp = lIIlIIlIll[22];
        eX = lIIlIIlIIl[lIIlIIlIll[0]];
        eo = lIIlIIlIIl[lIIlIIlIll[90]];
        fk = lIIlIIlIIl[lIIlIIlIll[91]];
        eb = lIIlIIlIIl[lIIlIIlIll[92]];
        dU = lIIlIIlIIl[lIIlIIlIll[93]];
        eP = lIIlIIlIIl[lIIlIIlIll[94]];
        ek = lIIlIIlIIl[lIIlIIlIll[95]];
        eK = lIIlIIlIIl[lIIlIIlIll[96]];
        eG = lIIlIIlIIl[lIIlIIlIll[97]];
        fj = lIIlIIlIIl[lIIlIIlIll[98]];
        et = lIIlIIlIIl[lIIlIIlIll[99]];
        eE = lIIlIIlIIl[lIIlIIlIll[100]];
        dx = lIIlIIlIll[43];
        eT = lIIlIIlIIl[lIIlIIlIll[101]];
        dK = lIIlIIlIIl[lIIlIIlIll[102]];
        eq = lIIlIIlIIl[lIIlIIlIll[103]];
        ep = lIIlIIlIIl[lIIlIIlIll[104]];
        eN = lIIlIIlIIl[lIIlIIlIll[105]];
        el = lIIlIIlIIl[lIIlIIlIll[106]];
        eh = lIIlIIlIIl[lIIlIIlIll[107]];
        dl = lIIlIIlIll[3];
        ff = lIIlIIlIIl[lIIlIIlIll[108]];
        dz = lIIlIIlIll[49];
        dB = lIIlIIlIll[55];
        fi = lIIlIIlIIl[lIIlIIlIll[109]];
        es = lIIlIIlIIl[lIIlIIlIll[110]];
        fo = lIIlIIlIIl[lIIlIIlIll[111]];
        ew = lIIlIIlIIl[lIIlIIlIll[112]];
        fl = lIIlIIlIIl[lIIlIIlIll[113]];
        ex = lIIlIIlIIl[lIIlIIlIll[114]];
        eJ = lIIlIIlIIl[lIIlIIlIll[115]];
        dn = lIIlIIlIll[19];
        dM = lIIlIIlIIl[lIIlIIlIll[116]];
        dW = lIIlIIlIIl[lIIlIIlIll[117]];
        ei = lIIlIIlIIl[lIIlIIlIll[118]];
        fd = lIIlIIlIIl[lIIlIIlIll[119]];
        eH = lIIlIIlIIl[lIIlIIlIll[120]];
        dZ = lIIlIIlIIl[lIIlIIlIll[121]];
        ej = lIIlIIlIIl[lIIlIIlIll[122]];
        en = lIIlIIlIIl[lIIlIIlIll[123]];
        fh = lIIlIIlIIl[lIIlIIlIll[124]];
        eL = lIIlIIlIIl[lIIlIIlIll[125]];
        dR = lIIlIIlIIl[lIIlIIlIll[126]];
        dq = lIIlIIlIll[24];
        ec = lIIlIIlIIl[lIIlIIlIll[127]];
        dT = lIIlIIlIIl[lIIlIIlIll[128]];
        eO = lIIlIIlIIl[lIIlIIlIll[129]];
        dJ = lIIlIIlIIl[lIIlIIlIll[130]];
        ee = lIIlIIlIIl[lIIlIIlIll[131]];
        dt = lIIlIIlIll[31];
        dX = lIIlIIlIIl[lIIlIIlIll[132]];
        eC = lIIlIIlIIl[lIIlIIlIll[133]];
        eZ = lIIlIIlIIl[lIIlIIlIll[134]];
        dN = lIIlIIlIIl[lIIlIIlIll[135]];
        fg = lIIlIIlIIl[lIIlIIlIll[136]];
        dS = lIIlIIlIIl[lIIlIIlIll[137]];
        fb = lIIlIIlIIl[lIIlIIlIll[138]];
        fc = lIIlIIlIIl[lIIlIIlIll[68]];
        dO = lIIlIIlIIl[lIIlIIlIll[139]];
        f1do = lIIlIIlIll[18];
        ev = lIIlIIlIIl[lIIlIIlIll[140]];
        du = lIIlIIlIll[34];
        em = lIIlIIlIIl[lIIlIIlIll[141]];
        eF = lIIlIIlIIl[lIIlIIlIll[142]];
        eg = lIIlIIlIIl[lIIlIIlIll[143]];
        eI = lIIlIIlIIl[lIIlIIlIll[144]];
        fm = lIIlIIlIIl[lIIlIIlIll[145]];
        dv = lIIlIIlIll[37];
        ed = lIIlIIlIIl[lIIlIIlIll[146]];
        dV = lIIlIIlIIl[lIIlIIlIll[147]];
        eV = lIIlIIlIIl[lIIlIIlIll[148]];
        dY = lIIlIIlIIl[lIIlIIlIll[149]];
        eA = lIIlIIlIIl[lIIlIIlIll[150]];
        dC = new WorldPoint(lIIlIIlIll[151], lIIlIIlIll[152], lIIlIIlIll[1]);
        dD = new WorldPoint(lIIlIIlIll[153], lIIlIIlIll[154], lIIlIIlIll[1]);
        dE = new WorldPoint(lIIlIIlIll[155], lIIlIIlIll[156], lIIlIIlIll[1]);
        dF = new WorldPoint(lIIlIIlIll[157], lIIlIIlIll[158], lIIlIIlIll[1]);
        dG = new WorldPoint(lIIlIIlIll[159], lIIlIIlIll[160], lIIlIIlIll[1]);
        dH = new WorldPoint(lIIlIIlIll[161], lIIlIIlIll[162], lIIlIIlIll[1]);
        dI = new WorldPoint(lIIlIIlIll[163], lIIlIIlIll[164], lIIlIIlIll[1]);
        bv = new ArrayList();
        String[] strArr = new String[lIIlIIlIll[2]];
        strArr[lIIlIIlIll[1]] = lIIlIIlIIl[lIIlIIlIll[165]];
        fp = strArr;
        bS = new WorldArea(lIIlIIlIll[166], lIIlIIlIll[167], lIIlIIlIll[168], lIIlIIlIll[169], lIIlIIlIll[1]);
    }

    private static boolean lllllIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static void lllllIIlIIII() {
        lIIlIIlIIl = new String[lIIlIIlIll[170]];
        lIIlIIlIIl[lIIlIIlIll[1]] = lllllIIIIIlI("NT89Fgo=", "qMTxa");
        lIIlIIlIIl[lIIlIIlIll[2]] = lllllIIIIIll("ZituCJBny/geG6Xejpve7qaernFaNUyxtegztfP4zAVNkgUVhv4O9bkZ9eWp0DcY", "zNUnm");
        lIIlIIlIIl[lIIlIIlIll[6]] = lllllIIIIlII("aftBqpHLhntWPKwNmK0EZG8rWZe7iabzQnPO5uuS8wfSHoaf23jf4zNfsO4XIyHiCAClzbxJ6dg=", "srQSa");
        lIIlIIlIIl[lIIlIIlIll[12]] = lllllIIIIIll("m92fCzzlS/E=", "LqeuZ");
        lIIlIIlIIl[lIIlIIlIll[5]] = lllllIIIIlII("HFtNwKnzMAYnDO03uGjLJQ==", "UpQLS");
        lIIlIIlIIl[lIIlIIlIll[10]] = lllllIIIIIll("5tBDtsUBjVba4qzfTyhSAA==", "jslWX");
        lIIlIIlIIl[lIIlIIlIll[16]] = lllllIIIIIll("cnqjNgS4CNaiV48Z6S1Djpxjoth6BeSY", "ntuCX");
        lIIlIIlIIl[lIIlIIlIll[21]] = lllllIIIIIlI("EAMYBhMtC1QbGy8cHBkOJg==", "Cltpz");
        lIIlIIlIIl[lIIlIIlIll[13]] = lllllIIIIlII("AcckfXlZLiwzRNrYAkD0Hw==", "onAEF");
        lIIlIIlIIl[lIIlIIlIll[17]] = lllllIIIIlII("bYJX1ZVqDorDXI2rL2BII6Kd9mZXKYwW", "GXgAo");
        lIIlIIlIIl[lIIlIIlIll[9]] = lllllIIIIIlI("BgICLAU7Ck4pAjQGCw==", "UmnZl");
        lIIlIIlIIl[lIIlIIlIll[30]] = lllllIIIIlII("dwHC84ww1w4xAKB2JBe1A9ApY8oEfEuL", "tgSBi");
        lIIlIIlIIl[lIIlIIlIll[33]] = lllllIIIIIll("TH1i4Gs3YLGBq4I+HZ7FZw==", "BylZb");
        lIIlIIlIIl[lIIlIIlIll[36]] = lllllIIIIIll("e5MUjfY5uIAcM1G1QFm51w==", "XLsEK");
        lIIlIIlIIl[lIIlIIlIll[39]] = lllllIIIIIlI("Chc9Pj43H3E8OCsM", "YxQHW");
        lIIlIIlIIl[lIIlIIlIll[42]] = lllllIIIIIlI("KR0vEx8UFWMGBBUR", "zrCev");
        lIIlIIlIIl[lIIlIIlIll[45]] = lllllIIIIlII("PUvQCY5PIPW6gb+U53B+ng==", "SpAaP");
        lIIlIIlIIl[lIIlIIlIll[48]] = lllllIIIIIll("zqXcEnCoLh8vRwa0soyOmw==", "rkHuj");
        lIIlIIlIIl[lIIlIIlIll[51]] = lllllIIIIIlI("BDYjPg05Pm8lCzs8", "WYOHd");
        lIIlIIlIIl[lIIlIIlIll[54]] = lllllIIIIlII("W+wMDTtCH6tJfjGLkNpvgg==", "piSxL");
        lIIlIIlIIl[lIIlIIlIll[57]] = lllllIIIIIll("yc3/zzT7SaC/jMTMpo5kyuR19tYCeCZf", "aZrsy");
        lIIlIIlIIl[lIIlIIlIll[58]] = lllllIIIIlII("650pilJ1rNxapI8q4dXixQ==", "FapRV");
        lIIlIIlIIl[lIIlIIlIll[59]] = lllllIIIIlII("3hC/fPy085o=", "VmeaF");
        lIIlIIlIIl[lIIlIIlIll[60]] = lllllIIIIlII("8orj3n0GlwN1bBXTV29o5w==", "ZQYsZ");
        lIIlIIlIIl[lIIlIIlIll[62]] = lllllIIIIlII("5GhbUCf/UT49gU369544xQ==", "tpfKW");
        lIIlIIlIIl[lIIlIIlIll[63]] = lllllIIIIIll("uko4x5C0LSR2CBxjTNVH5A==", "CEqRO");
        lIIlIIlIIl[lIIlIIlIll[64]] = lllllIIIIIlI("PyUaKzI=", "lQoOK");
        lIIlIIlIIl[lIIlIIlIll[69]] = lllllIIIIIlI("EAQ+PAwlDmwfFi8f", "FeLNc");
        lIIlIIlIIl[lIIlIIlIll[61]] = lllllIIIIIlI("GTg8I2MEN3IzJgo9JixjQw==", "kQRDC");
        lIIlIIlIIl[lIIlIIlIll[70]] = lllllIIIIlII("9vCJ9qAbWe/qYzrYOv+W+XRDARuPyLFk", "jYEHf");
        lIIlIIlIIl[lIIlIIlIll[71]] = lllllIIIIIll("3jq9OouU1FQ=", "nyvQA");
        lIIlIIlIIl[lIIlIIlIll[72]] = lllllIIIIIll("P5hY/Q62wzr0x27qkMg/QA==", "sxWys");
        lIIlIIlIIl[lIIlIIlIll[73]] = lllllIIIIlII("juPCLEV+lpJnK2fP4jnK+A==", "alaid");
        lIIlIIlIIl[lIIlIIlIll[74]] = lllllIIIIIll("8U2qLDkZz6I=", "SRQcs");
        lIIlIIlIIl[lIIlIIlIll[75]] = lllllIIIIIll("AJM4zZf5ragfuOUXqutr9A==", "nCUuy");
        lIIlIIlIIl[lIIlIIlIll[76]] = lllllIIIIIll("4yRtuNfXqrk=", "LNVIi");
        lIIlIIlIIl[lIIlIIlIll[77]] = lllllIIIIIll("SzumQSwLuvskhXRrwZp84A==", "MeDcW");
        lIIlIIlIIl[lIIlIIlIll[78]] = lllllIIIIIlI("MhEHPEoHDRYkCQ1ZADxKDAwPNQMIHg==", "fybEj");
        lIIlIIlIIl[lIIlIIlIll[79]] = lllllIIIIlII("lxh1tga7SkZpvlm/jHP2PQ==", "GMMBJ");
        lIIlIIlIIl[lIIlIIlIll[80]] = lllllIIIIIll("nKvnASZnguKIAuwhUPs+Yw==", "LfgoQ");
        lIIlIIlIIl[lIIlIIlIll[11]] = lllllIIIIIll("DgKVv6XyMaRDb0uEsnPO2bqJocdRAv1e", "SOiAw");
        lIIlIIlIIl[lIIlIIlIll[81]] = lllllIIIIIll("k0fI69Bj6eo=", "xjgvk");
        lIIlIIlIIl[lIIlIIlIll[82]] = lllllIIIIIlI("OQ0pPAsADy8=", "iaHRe");
        lIIlIIlIIl[lIIlIIlIll[83]] = lllllIIIIIll("oAWCqIB1+qk=", "MnfSv");
        lIIlIIlIIl[lIIlIIlIll[84]] = lllllIIIIIll("qPj375nzCPW9dFU85dvy/g==", "HXJRS");
        lIIlIIlIIl[lIIlIIlIll[85]] = lllllIIIIIll("c9SXC+h5jBZJ+xyp7lAcgA==", "jKfrE");
        lIIlIIlIIl[lIIlIIlIll[86]] = lllllIIIIIlI("AiUoNSsvNyk=", "JDZXG");
        lIIlIIlIIl[lIIlIIlIll[87]] = lllllIIIIIll("6YfxJiM9WRU=", "auoTB");
        lIIlIIlIIl[lIIlIIlIll[88]] = lllllIIIIIll("DPpAtzgd6eM=", "oKMGG");
        lIIlIIlIIl[lIIlIIlIll[89]] = lllllIIIIIll("Wf986XnoMZbDn74mu69aIiiAZLfpGQLOLoVOa7kt4Fw=", "KgSPO");
        lIIlIIlIIl[lIIlIIlIll[0]] = lllllIIIIlII("zi0HNjVUWjqe8Uj2nkwFKA==", "bTTev");
        lIIlIIlIIl[lIIlIIlIll[90]] = lllllIIIIIll("1US2UrSWsJIzyRi9jGc1HqLD4c2JDQziEyv0ZOLneRQ=", "EpXxp");
        lIIlIIlIIl[lIIlIIlIll[91]] = lllllIIIIIll("3BeTbh+PhThZbFN/2Zy8aA==", "UYItH");
        lIIlIIlIIl[lIIlIIlIll[92]] = lllllIIIIIlI("IxxQAQlKGhUbExkcEQYOShwfSBsJARQ=", "jhphz");
        lIIlIIlIIl[lIIlIIlIll[93]] = lllllIIIIIll("Jholw3/dh6yLqBj+uK6GAQ==", "Gklot");
        lIIlIIlIIl[lIIlIIlIll[94]] = lllllIIIIIlI("GBc5ORQ4", "KcVWq");
        lIIlIIlIIl[lIIlIIlIll[95]] = lllllIIIIIlI("JAAqLQ4aACk=", "veZYg");
        lIIlIIlIIl[lIIlIIlIll[96]] = lllllIIIIIll("Z5e6Zn6vfdNeM2FitgLjAg==", "rGHls");
        lIIlIIlIIl[lIIlIIlIll[97]] = lllllIIIIIll("RCl5eyhTj2w=", "WXTHu");
        lIIlIIlIIl[lIIlIIlIll[98]] = lllllIIIIlII("TWseAs71l7A=", "PesEA");
        lIIlIIlIIl[lIIlIIlIll[99]] = lllllIIIIIll("Gt9DKYRckLzO5dSD+b1Tmw==", "HDtnM");
        lIIlIIlIIl[lIIlIIlIll[100]] = lllllIIIIlII("mCX9XvcYFa8=", "JjFFF");
        lIIlIIlIIl[lIIlIIlIll[101]] = lllllIIIIlII("mJGDqi9PIlsBxkKtXqQ9eg==", "AMeOF");
        lIIlIIlIIl[lIIlIIlIll[102]] = lllllIIIIIll("421isyQBVUc=", "ooPOw");
        lIIlIIlIIl[lIIlIIlIll[103]] = lllllIIIIIlI("FzsrHhI8Iy8f", "RWNsw");
        lIIlIIlIIl[lIIlIIlIll[104]] = lllllIIIIlII("djAitocVtyo=", "iiuPf");
        lIIlIIlIIl[lIIlIIlIll[105]] = lllllIIIIlII("ejQ5fQq2u/zjEk6NnwnAuw==", "JgrAc");
        lIIlIIlIIl[lIIlIIlIll[106]] = lllllIIIIlII("ik4WkvclIrg=", "QLxMX");
        lIIlIIlIIl[lIIlIIlIll[107]] = lllllIIIIlII("0bqWOltkHRWNqV4NxRTIWg==", "NXgLa");
        lIIlIIlIIl[lIIlIIlIll[108]] = lllllIIIIIlI("Oic5Iw8aODI=", "uJWJy");
        lIIlIIlIIl[lIIlIIlIll[109]] = lllllIIIIlII("vGvZGN5qI8M=", "gEydW");
        lIIlIIlIIl[lIIlIIlIll[110]] = lllllIIIIIll("CFpHKfPV2dE=", "ZloRc");
        lIIlIIlIIl[lIIlIIlIll[111]] = lllllIIIIlII("slkmAtjFu6fCoJ3b/SBTk92RBFMw9JcE", "iFNbu");
        lIIlIIlIIl[lIIlIIlIll[112]] = lllllIIIIlII("SH7PGXdAosgbrwSjxy3FKQ==", "yuRMB");
        lIIlIIlIIl[lIIlIIlIll[113]] = lllllIIIIlII("MRdth5AKZGE=", "WtlLn");
        lIIlIIlIIl[lIIlIIlIll[114]] = lllllIIIIIll("Q/YwwyubpJvfaTUNuq3zcw==", "hZiiY");
        lIIlIIlIIl[lIIlIIlIll[115]] = lllllIIIIIll("LRPmhn+OF0Ir0QROxrN8PA==", "ubrYI");
        lIIlIIlIIl[lIIlIIlIll[116]] = lllllIIIIlII("Lo0VDF8+zW5XrEVZF7mKgQ==", "SZgcS");
        lIIlIIlIIl[lIIlIIlIll[117]] = lllllIIIIIll("b4EHU+4IXtM=", "SKXBg");
        lIIlIIlIIl[lIIlIIlIll[118]] = lllllIIIIIll("d9oW9ZDB5GE=", "lOQUH");
        lIIlIIlIIl[lIIlIIlIll[119]] = lllllIIIIIlI("NiMfLjtCKBIpPw==", "bLgGX");
        lIIlIIlIIl[lIIlIIlIll[120]] = lllllIIIIIlI("FhsjDiA2Gys=", "ZzNkL");
        lIIlIIlIIl[lIIlIIlIll[121]] = lllllIIIIlII("3LUVSGNRRkMj3F7qfjVATw==", "AyffY");
        lIIlIIlIIl[lIIlIIlIll[122]] = lllllIIIIlII("RUD52oYc8d/oOTCZC5+Xrw==", "ivjGc");
        lIIlIIlIIl[lIIlIIlIll[123]] = lllllIIIIIll("Zk0dHZw28+Q=", "gQyIF");
        lIIlIIlIIl[lIIlIIlIll[124]] = lllllIIIIIll("VJT92MBjI9tlPoeRCve1IQ==", "XHhZP");
        lIIlIIlIIl[lIIlIIlIll[125]] = lllllIIIIIlI("NQsuHAwdCzA=", "teWhd");
        lIIlIIlIIl[lIIlIIlIll[126]] = lllllIIIIlII("N7mBd+TfxGA=", "KiEUu");
        lIIlIIlIIl[lIIlIIlIll[127]] = lllllIIIIlII("h558NLvpbMIXN5cHTJeGCw==", "vHsQt");
        lIIlIIlIIl[lIIlIIlIll[128]] = lllllIIIIIll("0l9ct0CMsvX7fJvnBvYruA==", "yCPiy");
        lIIlIIlIIl[lIIlIIlIll[129]] = lllllIIIIIlI("FBY/Ew==", "RyJaR");
        lIIlIIlIIl[lIIlIIlIll[130]] = lllllIIIIlII("6y81jq+tvsaIF/QxkjHDzg==", "SqXIX");
        lIIlIIlIIl[lIIlIIlIll[131]] = lllllIIIIIll("RMHPBBTX+oAI05KRfOIPOdwC2ByLuMvv", "byKib");
        lIIlIIlIIl[lIIlIIlIll[132]] = lllllIIIIlII("eet1Fs3LYkmRNkzMzapHE4LI6ujA/PfU", "FfezN");
        lIIlIIlIIl[lIIlIIlIll[133]] = lllllIIIIIll("IIwt7A7NAE25nTeeLPrrdg==", "ldqAw");
        lIIlIIlIIl[lIIlIIlIll[134]] = lllllIIIIIll("gdOow6+NZdfCO15EC7R61Nqg7zW/GKbs", "TzXOP");
        lIIlIIlIIl[lIIlIIlIll[135]] = lllllIIIIlII("qJZFZY3Lu0Y=", "yePNw");
        lIIlIIlIIl[lIIlIIlIll[136]] = lllllIIIIIll("WjGC76RR5oc=", "zCHsp");
        lIIlIIlIIl[lIIlIIlIll[137]] = lllllIIIIIlI("CRYpIQcuFg==", "MsODi");
        lIIlIIlIIl[lIIlIIlIll[138]] = lllllIIIIlII("7pz99MyYvNk1FIlOAjkp+d9m/RdNnVgEmFn3erL1tO0=", "TvVle");
        lIIlIIlIIl[lIIlIIlIll[68]] = lllllIIIIlII("q0zbTnONF7gEOU/fD1LtCxxaHp2bv2NA", "kLbiU");
        lIIlIIlIIl[lIIlIIlIll[139]] = lllllIIIIIll("cgvAZzUinrY=", "BxDNT");
        lIIlIIlIIl[lIIlIIlIll[140]] = lllllIIIIlII("JfJv+OpDVSC2VOdlgls6vg==", "sxvTy");
        lIIlIIlIIl[lIIlIIlIll[141]] = lllllIIIIIll("lQDODAUxPH0LRIa3i1iMAvsQetsb3dSP", "acQxt");
        lIIlIIlIIl[lIIlIIlIll[142]] = lllllIIIIlII("EuWFHKWHFH4=", "MZALk");
        lIIlIIlIIl[lIIlIIlIll[143]] = lllllIIIIIlI("GSViPDU9OSEmKS0m", "XKBSE");
        lIIlIIlIIl[lIIlIIlIll[144]] = lllllIIIIIlI("JhU/IhETGz8pCw==", "etMLx");
        lIIlIIlIIl[lIIlIIlIll[145]] = lllllIIIIIll("2kCWhDQNuh33sSeQUzOWvw==", "GWyQC");
        lIIlIIlIIl[lIIlIIlIll[146]] = lllllIIIIlII("40WwhIFtW1Eu5VZ8Nq8+fA==", "fCTjp");
        lIIlIIlIIl[lIIlIIlIll[147]] = lllllIIIIIlI("OyAEGQ4LPEsVDAEw", "hTkto");
        lIIlIIlIIl[lIIlIIlIll[148]] = lllllIIIIIlI("PSslLDIC", "nDFES");
        lIIlIIlIIl[lIIlIIlIll[149]] = lllllIIIIlII("5bYBeEo9/Tt+Z33JnHHvVg==", "UAtZT");
        lIIlIIlIIl[lIIlIIlIll[150]] = lllllIIIIIll("XzMvyK00vkQ9R7fKApsWNjSkAqztO1Mp", "UPALL");
        lIIlIIlIIl[lIIlIIlIll[165]] = lllllIIIIIll("ARYFLNCUvNZU4P2a+8A3Zg==", "JgTgT");
    }

    private static boolean lllllIIlIlll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllllIIllIll(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[56]) && lllllIIllIll(Skills.getLevel(Skill.HUNTER), lIIlIIlIll[17])) {
            ?? r0 = lIIlIIlIll[2];
            "".length();
            return 0 != 0 ? ((28 ^ 51) ^ (125 ^ 66)) & (((103 ^ 5) ^ (193 ^ 179)) ^ (-" ".length())) : r0;
        }
        return lIIlIIlIll[1];
    }

    private static boolean lllllIIlIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lllllIIlIIlI(int i) {
        return i != 0;
    }

    private static String lllllIIIIIlI(String lIII, String lll) {
        String str = new String(Base64.getDecoder().decode(lIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIl = lll.toCharArray();
        int lII = lIIlIIlIll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIIlIll[1];
        while (lllllIIlIIll(i, length)) {
            char lIIl = charArray[i];
            sb.append((char) (lIIl ^ lIl[lII % lIl.length]));
            "".length();
            lII++;
            i++;
            "".length();
            if ((-(166 ^ 163)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIIlIIl[lIIlIIlIll[69]];
    }

    private static boolean lllllIIlIllI(int i) {
        return i > 0;
    }

    private static boolean lllllIIllIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIIlIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v546, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v566, types: [boolean] */
    public static void bk() {
        if (lllllIIlIIlI(Inventory.contains(C0005f.aV) ? 1 : 0) && lllllIIlIIll(Movement.getRunEnergy(), lIIlIIlIll[0])) {
            Inventory.getFirst(C0005f.aV).interact(lIIlIIlIIl[lIIlIIlIll[1]]);
            Time.sleepTicks(lIIlIIlIll[2]);
            "".length();
        }
        if (lllllIIlIlII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (lllllIIlIIlI(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lllllIIlIIll(bv.size(), lIIlIIlIll[2])) {
                System.out.println(lIIlIIlIIl[lIIlIIlIll[2]]);
                bt = lIIlIIlIll[1];
            }
        }
        if (lllllIIlIlII(bt ? 1 : 0)) {
            if (lllllIIlIlII(ab() ? 1 : 0) && lllllIIlIIll(C0004e.j(lIIlIIlIll[3]), lIIlIIlIll[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllllIIlIlIl(nearest) && lllllIIlIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0000a.a(nearest);
                }
                if (lllllIIlIlIl(nearest) && lllllIIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllllIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIlIll[4]);
                        "".length();
                    }
                    if (lllllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lllllIIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIlIll[5]);
                            "".length();
                        }
                        if (lllllIIlIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIlIll[6]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIIlIll[6]];
                        iArr[lIIlIIlIll[1]] = lIIlIIlIll[7];
                        iArr[lIIlIIlIll[2]] = lIIlIIlIll[8];
                        if (lllllIIlIlII(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIIlIIl[lIIlIIlIll[6]]);
                            bt = lIIlIIlIll[2];
                            return;
                        }
                        int[] iArr2 = new int[lIIlIIlIll[6]];
                        iArr2[lIIlIIlIll[1]] = lIIlIIlIll[7];
                        iArr2[lIIlIIlIll[2]] = lIIlIIlIll[8];
                        if (lllllIIlIIlI(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIlIIlIll[7], lIIlIIlIll[9]);
                            C0000a.b(C0005f.aV, lIIlIIlIll[10]);
                        }
                    }
                }
            }
            if (lllllIIlIIlI(ab() ? 1 : 0) && lllllIIlIlII(C0004e.j(lIIlIIlIll[3]))) {
                if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[11])) {
                    if (lllllIIlIIlI(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIlIIlIll[2]];
                        iArr3[lIIlIIlIll[1]] = lIIlIIlIll[7];
                        if (lllllIIlIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIlIIlIll[2]];
                            iArr4[lIIlIIlIll[1]] = lIIlIIlIll[7];
                            Inventory.getFirst(iArr4).interact(lIIlIIlIIl[lIIlIIlIll[12]]);
                            Time.sleepTicks(lIIlIIlIll[13]);
                            "".length();
                        }
                    }
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[5]];
                    Movement.walkTo(dD);
                    "".length();
                    Time.sleepTicks(lIIlIIlIll[2]);
                    "".length();
                }
                if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[13])) {
                    C0006g.a(lIIlIIlIIl[lIIlIIlIll[10]], fp);
                    Time.sleepTicks(lIIlIIlIll[2]);
                    "".length();
                }
            }
            if (lllllIIlIllI(C0004e.j(lIIlIIlIll[3]))) {
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[15])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[16]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dE), lIIlIIlIll[17])) {
                        Movement.walkTo(dE);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dE), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[18]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[20])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[21]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dE), lIIlIIlIll[17])) {
                        Movement.walkTo(dE);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dE), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[22]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[23])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[13]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        Movement.walkTo(dF);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[24]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[25])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[17]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        Movement.walkTo(dF);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[26]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[27])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[9]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        Movement.walkTo(dF);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[28]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[29])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[30]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        Movement.walkTo(dF);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[31]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[32])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[33]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dG), lIIlIIlIll[17])) {
                        Movement.walkTo(dG);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dG), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[34]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[35])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[36]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dG), lIIlIIlIll[17])) {
                        Movement.walkTo(dG);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dG), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[37]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[38])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[39]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIIlIIlIll[17])) {
                        Movement.walkTo(dH);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dH), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[40]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[41])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[42]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIIlIIlIll[17])) {
                        Movement.walkTo(dH);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dH), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[43]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[44])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[45]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        Movement.walkTo(dI);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[46]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[47])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[48]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        Movement.walkTo(dI);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[49]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[50])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[51]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        Movement.walkTo(dI);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[52]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[53])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[54]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        Movement.walkTo(dI);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        p(lIIlIIlIll[55]);
                        if (!lllllIIlIIlI(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIlIlIl(Widgets.get(lIIlIIlIll[19]))) {
                            bl();
                        }
                    }
                }
                if (lllllIIllIIl(C0004e.j(lIIlIIlIll[14]), lIIlIIlIll[56]) && lllllIIlIIll(Skills.getLevel(Skill.HUNTER), lIIlIIlIll[17])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[57]];
                    if (lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[13])) {
                        AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[58]];
                        Movement.walkTo(dD);
                        "".length();
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                    if (lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[13])) {
                        AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[59]];
                        C0006g.a(lIIlIIlIIl[lIIlIIlIll[60]], fp);
                        Time.sleepTicks(lIIlIIlIll[2]);
                        "".length();
                    }
                }
            }
            System.out.println(C0004e.j(lIIlIIlIll[14]));
        }
    }

    private static void lllllIIlIIIl() {
        lIIlIIlIll = new int[171];
        lIIlIIlIll[0] = 2 ^ 48;
        lIIlIIlIll[1] = (84 ^ 7) & ((236 ^ 191) ^ (-1));
        lIIlIIlIll[2] = " ".length();
        lIIlIIlIll[3] = (-((-8646) & 26063)) & (-1) & 18431;
        lIIlIIlIll[4] = (-((-31249) & 32373)) & (-24579) & 30702;
        lIIlIIlIll[5] = 22 ^ 18;
        lIIlIIlIll[6] = "  ".length();
        lIIlIIlIll[7] = (-16433) & 24439;
        lIIlIIlIll[8] = (-((-10899) & 27323)) & (-3591) & 32639;
        lIIlIIlIll[9] = (214 ^ 181) ^ (81 ^ 56);
        lIIlIIlIll[10] = (194 ^ 171) ^ (116 ^ 24);
        lIIlIIlIll[11] = 48 ^ 24;
        lIIlIIlIll[12] = "   ".length();
        lIIlIIlIll[13] = (((11 + 80) - 50) + 108) ^ (((148 + 9) - 77) + 77);
        lIIlIIlIll[14] = (-18434) & 19443;
        lIIlIIlIll[15] = (-((-21121) & 30412)) & (-4273) & 15611;
        lIIlIIlIll[16] = (110 ^ 54) ^ (96 ^ 62);
        lIIlIIlIll[17] = 72 ^ 65;
        lIIlIIlIll[18] = (-3777) & 28393;
        lIIlIIlIll[19] = (-((-321) & 25929)) & (-163) & 26303;
        lIIlIIlIll[20] = (-((-17) & 22238)) & (-8241) & 32511;
        lIIlIIlIll[21] = (((122 + 121) - 207) + 110) ^ (((25 + 128) - 106) + 102);
        lIIlIIlIll[22] = (-((-17974) & 22519)) & (-517) & 29679;
        lIIlIIlIll[23] = (-28898) & 30949;
        lIIlIIlIll[24] = (-2193) & 26807;
        lIIlIIlIll[25] = (-24762) & 26815;
        lIIlIIlIll[26] = (-3731) & 28346;
        lIIlIIlIll[27] = (-((-3521) & 8183)) & (-8257) & 14974;
        lIIlIIlIll[28] = (-(99 ^ 106)) & (-1681) & 26302;
        lIIlIIlIll[29] = (-((-2063) & 15231)) & (-1030) & 16255;
        lIIlIIlIll[30] = (74 ^ 88) ^ (40 ^ 49);
        lIIlIIlIll[31] = (-7811) & 32423;
        lIIlIIlIll[32] = (-((-2341) & 31605)) & (-4) & 31327;
        lIIlIIlIll[33] = (((136 + 66) - 77) + 58) ^ (((95 + 145) - 86) + 33);
        lIIlIIlIll[34] = (-((-16513) & 20382)) & (-65) & 28541;
        lIIlIIlIll[35] = (-((-2053) & 31941)) & (-514) & 32463;
        lIIlIIlIll[36] = 177 ^ 188;
        lIIlIIlIll[37] = (-((-11413) & 16277)) & (-3265) & 32735;
        lIIlIIlIll[38] = (-21123) & 23186;
        lIIlIIlIll[39] = (31 ^ 86) ^ (235 ^ 172);
        lIIlIIlIll[40] = (-1218) & 25823;
        lIIlIIlIll[41] = (-((-18497) & 32717)) & (-34) & 16319;
        lIIlIIlIll[42] = 157 ^ 146;
        lIIlIIlIll[43] = (-((-28833) & 32163)) & (-1) & 27935;
        lIIlIIlIll[44] = (-((-18461) & 32669)) & (-16481) & 32756;
        lIIlIIlIll[45] = (((47 + 70) - 89) + 102) ^ (((46 + 99) - 110) + 111);
        lIIlIIlIll[46] = (-((-10529) & 15806)) & (-2305) & 32191;
        lIIlIIlIll[47] = (-((-18977) & 32746)) & (-513) & 16351;
        lIIlIIlIll[48] = (((117 + 101) - 96) + 23) ^ (((77 + 59) - 25) + 17);
        lIIlIIlIll[49] = (-((-15427) & 16203)) & (-3073) & 28457;
        lIIlIIlIll[50] = (-((-2578) & 24533)) & (-545) & 24571;
        lIIlIIlIll[51] = 214 ^ 196;
        lIIlIIlIll[52] = (-1281) & 25891;
        lIIlIIlIll[53] = (-22498) & 24571;
        lIIlIIlIll[54] = (0 ^ 9) ^ (141 ^ 151);
        lIIlIIlIll[55] = (-((-20514) & 24317)) & (-1) & 28415;
        lIIlIIlIll[56] = (-((-30759) & 32231)) & (-20484) & 24031;
        lIIlIIlIll[57] = (84 ^ 53) ^ (249 ^ 140);
        lIIlIIlIll[58] = (125 ^ 45) ^ (77 ^ 8);
        lIIlIIlIll[59] = 140 ^ 154;
        lIIlIIlIll[60] = 25 ^ 14;
        lIIlIIlIll[61] = 147 ^ 143;
        lIIlIIlIll[62] = (2 ^ 6) ^ (188 ^ 160);
        lIIlIIlIll[63] = 134 ^ 159;
        lIIlIIlIll[64] = (((57 + 111) - 55) + 78) ^ (((138 + 9) - 103) + 121);
        lIIlIIlIll[65] = (-((-10766) & 27455)) & (-3) & 28671;
        lIIlIIlIll[66] = (-((-8393) & 16095)) & (-2) & 32703;
        lIIlIIlIll[67] = (-7282) & 8181;
        lIIlIIlIll[68] = 3 ^ 103;
        lIIlIIlIll[69] = (((9 + 128) - 76) + 108) ^ (((94 + 73) - 18) + 29);
        lIIlIIlIll[70] = (233 ^ 197) ^ (32 ^ 17);
        lIIlIIlIll[71] = (((27 + 116) - 123) + 133) ^ (((48 + 131) - 132) + 88);
        lIIlIIlIll[72] = (115 ^ 45) ^ (65 ^ 0);
        lIIlIIlIll[73] = (((86 + 145) - 84) + 12) ^ (((155 + 37) - 108) + 107);
        lIIlIIlIll[74] = (((154 + 154) - 238) + 104) ^ (((50 + 69) - 60) + 84);
        lIIlIIlIll[75] = (136 ^ 154) ^ (42 ^ 26);
        lIIlIIlIll[76] = 176 ^ 147;
        lIIlIIlIll[77] = (158 ^ 177) ^ (61 ^ 54);
        lIIlIIlIll[78] = 67 ^ 102;
        lIIlIIlIll[79] = (((6 + 46) - (-64)) + 20) ^ (((120 + 83) - 106) + 77);
        lIIlIIlIll[80] = 163 ^ 132;
        lIIlIIlIll[81] = (((51 + 21) - 65) + 137) ^ (((142 + 35) - 43) + 51);
        lIIlIIlIll[82] = 159 ^ 181;
        lIIlIIlIll[83] = (210 ^ 129) ^ (45 ^ 85);
        lIIlIIlIll[84] = 97 ^ 77;
        lIIlIIlIll[85] = 166 ^ 139;
        lIIlIIlIll[86] = (188 ^ 152) ^ (114 ^ 120);
        lIIlIIlIll[87] = (44 ^ 73) ^ (139 ^ 193);
        lIIlIIlIll[88] = 177 ^ 129;
        lIIlIIlIll[89] = (81 ^ 58) ^ (61 ^ 103);
        lIIlIIlIll[90] = 22 ^ 37;
        lIIlIIlIll[91] = (((28 + 110) - 31) + 72) ^ (((5 + 2) - (-57)) + 71);
        lIIlIIlIll[92] = 139 ^ 190;
        lIIlIIlIll[93] = (13 ^ 43) ^ (18 ^ 2);
        lIIlIIlIll[94] = 140 ^ 187;
        lIIlIIlIll[95] = (233 ^ 157) ^ (143 ^ 195);
        lIIlIIlIll[96] = (250 ^ 177) ^ (94 ^ 44);
        lIIlIIlIll[97] = (104 ^ 34) ^ (238 ^ 158);
        lIIlIIlIll[98] = (((67 + 156) - 83) + 49) ^ (((34 + 34) - 5) + 71);
        lIIlIIlIll[99] = 85 ^ 105;
        lIIlIIlIll[100] = 137 ^ 180;
        lIIlIIlIll[101] = 128 ^ 190;
        lIIlIIlIll[102] = (159 ^ 190) ^ (163 ^ 189);
        lIIlIIlIll[103] = 62 ^ 126;
        lIIlIIlIll[104] = (97 ^ 17) ^ (136 ^ 185);
        lIIlIIlIll[105] = 67 ^ 1;
        lIIlIIlIll[106] = (48 ^ 119) ^ (150 ^ 146);
        lIIlIIlIll[107] = (((114 + 84) - 149) + 82) ^ (((120 + 147) - 189) + 121);
        lIIlIIlIll[108] = 202 ^ 143;
        lIIlIIlIll[109] = (3 ^ 96) ^ (13 ^ 40);
        lIIlIIlIll[110] = 107 ^ 44;
        lIIlIIlIll[111] = 123 ^ 51;
        lIIlIIlIll[112] = 139 ^ 194;
        lIIlIIlIll[113] = 91 ^ 17;
        lIIlIIlIll[114] = (((128 + 7) - 0) + 87) ^ (((135 + 108) - 147) + 53);
        lIIlIIlIll[115] = (145 ^ 161) ^ (189 ^ 193);
        lIIlIIlIll[116] = (((76 + 48) - 101) + 104) ^ (16 ^ 34);
        lIIlIIlIll[117] = 17 ^ 95;
        lIIlIIlIll[118] = 49 ^ 126;
        lIIlIIlIll[119] = (((114 + 123) - 229) + 206) ^ (((111 + 78) - 182) + 127);
        lIIlIIlIll[120] = (106 ^ 52) ^ (204 ^ 195);
        lIIlIIlIll[121] = 104 ^ 58;
        lIIlIIlIll[122] = 126 ^ 45;
        lIIlIIlIll[123] = (((63 + 32) - 0) + 54) ^ (((57 + 187) - 167) + 116);
        lIIlIIlIll[124] = 31 ^ 74;
        lIIlIIlIll[125] = 150 ^ 192;
        lIIlIIlIll[126] = (156 ^ 182) ^ (124 ^ 1);
        lIIlIIlIll[127] = (237 ^ 142) ^ (59 ^ 0);
        lIIlIIlIll[128] = 3 ^ 90;
        lIIlIIlIll[129] = (64 ^ 89) ^ (54 ^ 117);
        lIIlIIlIll[130] = (((55 + 180) - 153) + 121) ^ (((138 + 51) - 164) + 119);
        lIIlIIlIll[131] = 43 ^ 119;
        lIIlIIlIll[132] = (45 ^ 16) ^ (54 ^ 86);
        lIIlIIlIll[133] = 19 ^ 77;
        lIIlIIlIll[134] = 25 ^ 70;
        lIIlIIlIll[135] = 61 ^ 93;
        lIIlIIlIll[136] = (((69 + 10) - 52) + 173) ^ (((35 + 3) - (-86)) + 45);
        lIIlIIlIll[137] = (((58 + 138) - 120) + 161) ^ (((39 + 33) - (-48)) + 23);
        lIIlIIlIll[138] = (86 ^ 3) ^ (23 ^ 33);
        lIIlIIlIll[139] = 244 ^ 145;
        lIIlIIlIll[140] = "   ".length() ^ (81 ^ 52);
        lIIlIIlIll[141] = (244 ^ 182) ^ (131 ^ 166);
        lIIlIIlIll[142] = (((38 + 114) - 148) + 170) ^ (((17 + 20) - (-114)) + 47);
        lIIlIIlIll[143] = (97 ^ 101) ^ (79 ^ 34);
        lIIlIIlIll[144] = (((114 + 65) - (-14)) + 17) ^ (((179 + 81) - 159) + 83);
        lIIlIIlIll[145] = (49 ^ 27) ^ (46 ^ 111);
        lIIlIIlIll[146] = (((112 + 117) - 226) + 124) ^ (138 ^ 153);
        lIIlIIlIll[147] = 59 ^ 86;
        lIIlIIlIll[148] = (235 ^ 138) ^ (179 ^ 188);
        lIIlIIlIll[149] = 49 ^ 94;
        lIIlIIlIll[150] = 48 ^ 64;
        lIIlIIlIll[151] = (-28674) & 31931;
        lIIlIIlIll[152] = (-((-9302) & 29911)) & (-515) & 24575;
        lIIlIIlIll[153] = (-14337) & 16094;
        lIIlIIlIll[154] = (-27781) & 32735;
        lIIlIIlIll[155] = (-4099) & 5855;
        lIIlIIlIll[156] = (-((-4619) & 32399)) & (-49) & 32767;
        lIIlIIlIll[157] = (-14343) & 16119;
        lIIlIIlIll[158] = (-19585) & 24543;
        lIIlIIlIll[159] = (-8452) & 10223;
        lIIlIIlIll[160] = (-26625) & 31601;
        lIIlIIlIll[161] = (-((-2697) & 31662)) & (-2057) & 32767;
        lIIlIIlIll[162] = (-((-853) & 3935)) & (-16513) & 24570;
        lIIlIIlIll[163] = (-((-625) & 14961)) & (-306) & 16383;
        lIIlIIlIll[164] = (-((-9025) & 28627)) & (-9) & 24570;
        lIIlIIlIll[165] = 5 ^ 116;
        lIIlIIlIll[166] = (-((-1293) & 24350)) & (-33) & 24255;
        lIIlIIlIll[167] = (-582) & 3965;
        lIIlIIlIll[168] = (-26857) & 27643;
        lIIlIIlIll[169] = (-24841) & 25535;
        lIIlIIlIll[170] = (123 ^ 113) ^ (84 ^ 44);
    }

    private static boolean lllllIIllIII(int i, int i2) {
        return i <= i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            bk();
            "".length();
            if (0 != 0) {
                return ((((57 + 176) - 199) + 203) ^ (((24 + 2) - 3) + 145)) & (((((27 + 4) - (-38)) + 61) ^ (((130 + 21) - 71) + 119)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIIlIll[68];
    }

    private static void af() {
        int[] iArr = new int[lIIlIIlIll[2]];
        iArr[lIIlIIlIll[1]] = lIIlIIlIll[8];
        if (lllllIIlIlII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIll[8], lIIlIIlIll[10], C0008i.bq));
            "".length();
        }
        if (lllllIIlIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIIlIIl[lIIlIIlIll[61]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIll[65], lIIlIIlIll[10], lIIlIIlIll[66]));
            "".length();
        }
        int[] iArr2 = new int[lIIlIIlIll[2]];
        iArr2[lIIlIIlIll[1]] = lIIlIIlIll[7];
        if (lllllIIlIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIll[7], lIIlIIlIll[11], lIIlIIlIll[67]));
            "".length();
        }
    }

    private static boolean lllllIIllIlI(Object obj) {
        return obj == null;
    }

    private static String lllllIIIIlII(String llIII, String lIlll) {
        try {
            SecretKeySpec llIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlll.getBytes(StandardCharsets.UTF_8)), lIIlIIlIll[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIlIll[6], llIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIl) {
            llIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIllIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    private static void bl() {
        Widget widget = Widgets.get(lIIlIIlIll[19], lIIlIIlIll[61]);
        if (lllllIIllIlI(widget)) {
            System.out.println(lIIlIIlIIl[lIIlIIlIll[62]]);
            return;
        }
        if (lllllIIlIlIl(widget)) {
            System.out.println(widget.getText());
        }
        int i = lIIlIIlIll[1];
        while (lllllIIlIIll(i, EnumC0007h.values().length)) {
            if (lllllIIlIIlI(widget.getText().equalsIgnoreCase(EnumC0007h.values()[i].O()) ? 1 : 0)) {
                System.out.println("answer: " + EnumC0007h.values()[i].P());
                int llIllI = i;
                Widget widget2 = Widgets.get(lIIlIIlIll[19], widget3 -> {
                    return widget3.getText().strip().contains(EnumC0007h.values()[llIllI].P());
                });
                if (lllllIIlIlIl(widget2)) {
                    System.out.println(lIIlIIlIIl[lIIlIIlIll[63]]);
                    Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) lIIlIIlIll[2]);
                    Time.sleepTicks(lIIlIIlIll[6]);
                    "".length();
                    "".length();
                    if ((-" ".length()) > (((207 ^ 169) ^ (254 ^ 166)) & (((161 ^ 198) ^ (193 ^ 152)) ^ (-" ".length())))) {
                        return;
                    }
                    return;
                }
            }
            i++;
            "".length();
            if ((-((((126 + 68) - 147) + 136) ^ (((49 + 17) - (-38)) + 75))) > 0) {
                return;
            }
        }
    }

    private static void p(int i) {
        if (!lllllIIlIlII(Widgets.get(lIIlIIlIll[19]).isEmpty() ? 1 : 0) || lllllIIllIlI(Widgets.get(lIIlIIlIll[19]))) {
            int[] iArr = new int[lIIlIIlIll[2]];
            iArr[lIIlIIlIll[1]] = i;
            if (lllllIIlIlIl(TileObjects.getNearest(iArr))) {
                int[] iArr2 = new int[lIIlIIlIll[2]];
                iArr2[lIIlIIlIll[1]] = i;
                TileObjects.getNearest(iArr2).interact(lIIlIIlIIl[lIIlIIlIll[64]]);
                Time.sleepTicks(lIIlIIlIll[6]);
                "".length();
            }
        }
    }
}
