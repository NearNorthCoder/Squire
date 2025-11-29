package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import net.unethicalite.api.widgets.Dialog;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aE  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aE.class */
public class aE implements InterfaceC0003ac {
    public static /* synthetic */ long oa;
    public static final /* synthetic */ WorldPoint pr;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint pn;
    static /* synthetic */ int cI;
    public static final /* synthetic */ WorldPoint pt;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ int[] llIllIlIII;
    public static final /* synthetic */ WorldPoint po;
    public static final /* synthetic */ WorldPoint pm;
    static /* synthetic */ int cG;
    public static final /* synthetic */ WorldPoint pp;
    public static final /* synthetic */ WorldPoint ps;
    public static /* synthetic */ WorldPoint nX;
    public static /* synthetic */ WorldPoint nY;
    static /* synthetic */ int oc;
    public static /* synthetic */ WorldPoint nZ;
    public static final /* synthetic */ WorldPoint pl;
    private static /* synthetic */ String[] llIllIIllI;
    public static final /* synthetic */ WorldPoint pq;
    static /* synthetic */ int dF;
    static /* synthetic */ int od;
    static /* synthetic */ WorldArea oe;
    public static /* synthetic */ String[] ob;

    public static void Q() {
        int[] iArr = new int[llIllIlIII[1]];
        iArr[llIllIlIII[0]] = llIllIlIII[9];
        if (lIllIlllIIIII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIII[9], llIllIlIII[13], llIllIlIII[43]));
            "".length();
        }
        int[] iArr2 = new int[llIllIlIII[1]];
        iArr2[llIllIlIII[0]] = llIllIlIII[10];
        if (lIllIlllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIII[10], llIllIlIII[13], llIllIlIII[43]));
            "".length();
        }
        int[] iArr3 = new int[llIllIlIII[1]];
        iArr3[llIllIlIII[0]] = llIllIlIII[11];
        if (lIllIlllIIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIII[11], llIllIlIII[40], llIllIlIII[44]));
            "".length();
        }
        int[] iArr4 = new int[llIllIlIII[1]];
        iArr4[llIllIlIII[0]] = llIllIlIII[45];
        if (lIllIlllIIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIII[45], llIllIlIII[12], C0023j.cf));
            "".length();
        }
        if (lIllIlllIIIll(Skills.getLevel(Skill.THIEVING), llIllIlIII[5])) {
            int[] iArr5 = new int[llIllIlIII[1]];
            iArr5[llIllIlIII[0]] = llIllIlIII[7];
            if (lIllIlllIIIII(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0017d(llIllIlIII[7], llIllIlIII[46], llIllIlIII[20]));
                "".length();
            }
            int[] iArr6 = new int[llIllIlIII[1]];
            iArr6[llIllIlIII[0]] = llIllIlIII[6];
            if (lIllIlllIIIII(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0017d(llIllIlIII[6], llIllIlIII[44], llIllIlIII[47]));
                "".length();
            }
        }
    }

    private static boolean lIllIllIlllll(int i, int i2) {
        return i < i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIllIIllI[llIllIlIII[49]];
    }

    private static void lIllIllIllIIl() {
        llIllIIllI = new String[llIllIlIII[112]];
        llIllIIllI[llIllIlIII[0]] = lIllIllIlIllI("7Zi5p36zM0dpaC9HlswrNw==", "DCRps");
        llIllIIllI[llIllIlIII[1]] = lIllIllIlIllI("uAdix5v6pL4Sd8MKSYTuBWQEIEShmcmvi4o6fUR6HgPA3q79ALK5djYIP+xKSx5T", "AjbQF");
        llIllIIllI[llIllIlIII[2]] = lIllIllIlIllI("s8jM6GHmEb2+iZFWAebeK15rfEq+5hq4", "vsONY");
        llIllIIllI[llIllIlIII[3]] = lIllIllIlIllI("z4BjFTeriCDO48HjhltikoZ/wzdqMEtg", "eCpRg");
        llIllIIllI[llIllIlIII[8]] = lIllIllIlIllI("k7eMgf2LQuoBftyZPtX2T7JfZzCbBUMY1L8nDACl6QKWjwM1yTmc8zWofGSHzWev", "KhStf");
        llIllIIllI[llIllIlIII[12]] = lIllIllIlIlll("NrrNFgxn9QttUk/p/WJ2jKtxf8KmUGnhY/b2P4ZUi2zRn95xsRFzWJ24eYYXZ0HI", "hBwIj");
        llIllIIllI[llIllIlIII[17]] = lIllIllIlIllI("otXqcRpV5eo=", "WmPje");
        llIllIIllI[llIllIlIII[18]] = lIllIllIlIllI("K+i3kSf9+Tx8WtX4vPlUzQ==", "vEhxr");
        llIllIIllI[llIllIlIII[20]] = lIllIllIlIlll("+LzaW4dS2xH75UGPgzpZ2g==", "WAfBU");
        llIllIIllI[llIllIlIII[21]] = lIllIllIllIII("IgcKBB8dRj8RCAIDCw==", "ofypz");
        llIllIIllI[llIllIlIII[13]] = lIllIllIllIII("Oig2JwIFaQMyFRosNw==", "wIESg");
        llIllIIllI[llIllIlIII[22]] = lIllIllIlIlll("0I7vuM5hI0cW9ECYBfB/cQ==", "vnTtF");
        llIllIIllI[llIllIlIII[23]] = lIllIllIllIII("PSwfDwcLPA==", "nXjai");
        llIllIIllI[llIllIlIII[24]] = lIllIllIlIlll("7hSH/0L1TfM=", "cciVk");
        llIllIIllI[llIllIlIII[25]] = lIllIllIlIllI("HMKZJWnlRps=", "QuJdG");
        llIllIIllI[llIllIlIII[16]] = lIllIllIllIII("HRIG", "WgarW");
        llIllIIllI[llIllIlIII[26]] = lIllIllIlIlll("WSi5S1m8dRDM1Pyrv8eC8Q==", "QQeYp");
        llIllIIllI[llIllIlIII[27]] = lIllIllIlIlll("3DshM+eWQGv5j4YyX26ZjA==", "bsPFQ");
        llIllIIllI[llIllIlIII[29]] = lIllIllIlIlll("FCplxYdlrvt/CtdQpJO6cQ==", "avyXe");
        llIllIIllI[llIllIlIII[30]] = lIllIllIlIllI("Sguhdlijci0=", "TzuTE");
        llIllIIllI[llIllIlIII[14]] = lIllIllIlIlll("ReC4WL9U8/w=", "TIOjX");
        llIllIIllI[llIllIlIII[31]] = lIllIllIlIllI("V/EG0IcxcinwTiwtYsOu+A==", "IeSPW");
        llIllIIllI[llIllIlIII[32]] = lIllIllIlIlll("ZOTQbWf2ddc=", "zRlAj");
        llIllIIllI[llIllIlIII[33]] = lIllIllIllIII("MScs", "tFXhO");
        llIllIIllI[llIllIlIII[34]] = lIllIllIllIII("JjcVajYHdhcvI0giCiYn", "hVcJB");
        llIllIIllI[llIllIlIII[28]] = lIllIllIlIllI("AJycX4yRmd+iQ11VlrrX5A==", "nsVcF");
        llIllIIllI[llIllIlIII[35]] = lIllIllIllIII("HhsTKzQkARE=", "MovJX");
        llIllIIllI[llIllIlIII[36]] = lIllIllIlIllI("pScHbNehkBlKn83/qXsOdw==", "uWNhV");
        llIllIIllI[llIllIlIII[37]] = lIllIllIllIII("DTQpcRYtMCQ9", "YQHQe");
        llIllIIllI[llIllIlIII[38]] = lIllIllIlIlll("EB47oNBZSNzM2DkRotJHVg==", "XTRBW");
        llIllIIllI[llIllIlIII[40]] = lIllIllIlIlll("f6PosA6B7d+G5sqOhyCyyA==", "kvvCV");
        llIllIIllI[llIllIlIII[49]] = lIllIllIllIII("IAQsBjgdAiI=", "tlEcN");
        llIllIIllI[llIllIlIII[51]] = lIllIllIlIllI("wqUqMMv8tIo=", "jYlVY");
        llIllIIllI[llIllIlIII[52]] = lIllIllIllIII("AAoEGw==", "Dxkkn");
        llIllIIllI[llIllIlIII[53]] = lIllIllIlIlll("kBOxNiwaeiGEDkizbRECDg==", "iPLUJ");
        llIllIIllI[llIllIlIII[54]] = lIllIllIlIlll("qEbSgVl4kCc=", "uckvV");
        llIllIIllI[llIllIlIII[55]] = lIllIllIlIlll("HQnkd6RBTV0=", "EhADH");
        llIllIIllI[llIllIlIII[56]] = lIllIllIllIII("Mj0WKg==", "vOyZl");
        llIllIIllI[llIllIlIII[5]] = lIllIllIlIlll("5VY2nnhRMZQDimiMTZLpSg==", "nzZkg");
        llIllIIllI[llIllIlIII[61]] = lIllIllIllIII("PTIcIi0fPwprORU2Cg==", "pSnKJ");
        llIllIIllI[llIllIlIII[62]] = lIllIllIllIII("Nik4BScSLXoUIxAs", "uHZgF");
        llIllIIllI[llIllIlIII[63]] = lIllIllIlIllI("q/9pBxhzOq2Memf0PafhtQ==", "jSoss");
        llIllIIllI[llIllIlIII[64]] = lIllIllIlIllI("RMhyErF3suWxjnTpglJflw==", "mJTCH");
        llIllIIllI[llIllIlIII[65]] = lIllIllIlIllI("+DHfwdh4kRYb6vddLhM7+g==", "BMEMc");
        llIllIIllI[llIllIlIII[66]] = lIllIllIlIllI("9wT+cnZKXQEsZ3e1/5et/A==", "WSRSy");
        llIllIIllI[llIllIlIII[67]] = lIllIllIlIllI("IxWWdAd9Yhi9GUC6778WxQ==", "JEjag");
        llIllIIllI[llIllIlIII[68]] = lIllIllIllIII("IQIKMSYXEgdyKxAJDzckFg==", "qgkRC");
        llIllIIllI[llIllIlIII[69]] = lIllIllIlIlll("8MLrhRX8pFn4anyegs6Ldw==", "kqgdp");
        llIllIIllI[llIllIlIII[70]] = lIllIllIlIllI("1J0LHF4BEFpfq4gq8PR4CQ==", "InEiR");
        llIllIIllI[llIllIlIII[71]] = lIllIllIllIII("LRU5AmUJHz0C", "zzXfE");
        llIllIIllI[llIllIlIII[72]] = lIllIllIllIII("HTUSDQ09Ig9PGyo1Eg==", "OPvoh");
        llIllIIllI[llIllIlIII[73]] = lIllIllIllIII("MxQ2EC0LFz0FOgBVKxItHQ==", "yuXwH");
        llIllIIllI[llIllIlIII[74]] = lIllIllIlIllI("QdcJASmLP2F8i+4i771xmA==", "LWWJa");
        llIllIIllI[llIllIlIII[75]] = lIllIllIllIII("BC0/HQc3MDVYGTMnKA==", "VBLxj");
        llIllIIllI[llIllIlIII[76]] = lIllIllIllIII("FgEKDT0nEAoeM2UGHQku", "EuxlJ");
        llIllIIllI[llIllIlIII[77]] = lIllIllIlIllI("yPAzjEmmi6HjRLh/yCbHVJwM5zSmntqu", "CzUwx");
        llIllIIllI[llIllIlIII[78]] = lIllIllIlIllI("lv8yLA+5LNzWiEFEWOBqQQ==", "FAkzN");
        llIllIIllI[llIllIlIII[79]] = lIllIllIlIllI("+7ILpDhtP5f837loRD1VKA==", "Blhli");
        llIllIIllI[llIllIlIII[80]] = lIllIllIlIllI("3QEmEpOYnupGdJJ76puPMA==", "DVCFa");
        llIllIIllI[llIllIlIII[81]] = lIllIllIlIlll("fQ6HggadM+a7cLL1Tu2KgQ==", "WHynF");
        llIllIIllI[llIllIlIII[82]] = lIllIllIlIlll("drQb2QSbDbGQfcPYfPpb7A==", "KwEGP");
        llIllIIllI[llIllIlIII[83]] = lIllIllIlIllI("u93N6KvLfaLH6SFR0jSyJw==", "qNroL");
        llIllIIllI[llIllIlIII[84]] = lIllIllIlIlll("DyKC7UM4lK4oOYwgNkJi2UQ8ru19IHwx", "fYAkW");
        llIllIIllI[llIllIlIII[85]] = lIllIllIlIlll("jgouCVi891BsgLt60QjBVQ==", "ESzuQ");
        llIllIIllI[llIllIlIII[86]] = lIllIllIllIII("DjctMjY2NCYnIT12MDA2IA==", "DVCUS");
        llIllIIllI[llIllIlIII[87]] = lIllIllIlIlll("7eTQVqnSyTgUR4RCZk8sWQ==", "aOkVl");
        llIllIIllI[llIllIlIII[88]] = lIllIllIlIlll("uIP+hNtXcflSFAhASwMYXQ==", "TuRkZ");
        llIllIIllI[llIllIlIII[89]] = lIllIllIllIII("NCM4Mx8XNiMtFlkxLyQe", "yBJAz");
        llIllIIllI[llIllIlIII[90]] = lIllIllIlIlll("wEWYCwNf6pi7S31ME7UCmQ==", "UeIXx");
        llIllIIllI[llIllIlIII[91]] = lIllIllIlIllI("T6j8z6ODcMIoAsSNXeMit9tw0Sb+HVwK", "PgGBi");
        llIllIIllI[llIllIlIII[92]] = lIllIllIlIllI("NkVCiQBLTgUOmg0KC4PEuw==", "zpQRW");
        llIllIIllI[llIllIlIII[93]] = lIllIllIlIlll("Nq7ue3F7BDI+v+ZgaGY8lw==", "KsQJx");
        llIllIIllI[llIllIlIII[94]] = lIllIllIlIlll("NOG/ceq3fPZ57yO4Hz1Wag==", "biAqb");
        llIllIIllI[llIllIlIII[95]] = lIllIllIlIlll("3svEaMMyx5/BQWeISz7fGg7mZ5LZN+ua", "OmupT");
        llIllIIllI[llIllIlIII[96]] = lIllIllIllIII("ICEA", "jTgtn");
    }

    private static boolean lIllIlllIIlll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIlllIlIlI(int i) {
        return i >= 0;
    }

    private static boolean lIllIlllIllIl(int i) {
        return i <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIlllIIIll(Skills.getLevel(Skill.THIEVING), llIllIlIII[50])) {
            ?? r0 = llIllIlIII[1];
            "".length();
            return "  ".length() == (193 ^ 197) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIllIlIII[0];
    }

    private static boolean lIllIllIllllI(int i) {
        return i != 0;
    }

    static {
        lIllIllIlllIl();
        lIllIllIllIIl();
        bv = new ArrayList();
        nX = new WorldPoint(llIllIlIII[57], llIllIlIII[58], llIllIlIII[0]);
        nY = new WorldPoint(llIllIlIII[59], llIllIlIII[60], llIllIlIII[0]);
        nZ = new WorldPoint(llIllIlIII[0], llIllIlIII[0], llIllIlIII[0]);
        oa = System.currentTimeMillis();
        String[] strArr = new String[llIllIlIII[56]];
        strArr[llIllIlIII[0]] = llIllIIllI[llIllIlIII[5]];
        strArr[llIllIlIII[1]] = llIllIIllI[llIllIlIII[61]];
        strArr[llIllIlIII[2]] = llIllIIllI[llIllIlIII[62]];
        strArr[llIllIlIII[3]] = llIllIIllI[llIllIlIII[63]];
        strArr[llIllIlIII[8]] = llIllIIllI[llIllIlIII[64]];
        strArr[llIllIlIII[12]] = llIllIIllI[llIllIlIII[65]];
        strArr[llIllIlIII[17]] = llIllIIllI[llIllIlIII[66]];
        strArr[llIllIlIII[18]] = llIllIIllI[llIllIlIII[67]];
        strArr[llIllIlIII[20]] = llIllIIllI[llIllIlIII[68]];
        strArr[llIllIlIII[21]] = llIllIIllI[llIllIlIII[69]];
        strArr[llIllIlIII[13]] = llIllIIllI[llIllIlIII[70]];
        strArr[llIllIlIII[22]] = llIllIIllI[llIllIlIII[71]];
        strArr[llIllIlIII[23]] = llIllIIllI[llIllIlIII[72]];
        strArr[llIllIlIII[24]] = llIllIIllI[llIllIlIII[73]];
        strArr[llIllIlIII[25]] = llIllIIllI[llIllIlIII[74]];
        strArr[llIllIlIII[16]] = llIllIIllI[llIllIlIII[75]];
        strArr[llIllIlIII[26]] = llIllIIllI[llIllIlIII[76]];
        strArr[llIllIlIII[27]] = llIllIIllI[llIllIlIII[77]];
        strArr[llIllIlIII[29]] = llIllIIllI[llIllIlIII[78]];
        strArr[llIllIlIII[30]] = llIllIIllI[llIllIlIII[79]];
        strArr[llIllIlIII[14]] = llIllIIllI[llIllIlIII[80]];
        strArr[llIllIlIII[31]] = llIllIIllI[llIllIlIII[81]];
        strArr[llIllIlIII[32]] = llIllIIllI[llIllIlIII[82]];
        strArr[llIllIlIII[33]] = llIllIIllI[llIllIlIII[83]];
        strArr[llIllIlIII[34]] = llIllIIllI[llIllIlIII[84]];
        strArr[llIllIlIII[28]] = llIllIIllI[llIllIlIII[85]];
        strArr[llIllIlIII[35]] = llIllIIllI[llIllIlIII[86]];
        strArr[llIllIlIII[36]] = llIllIIllI[llIllIlIII[87]];
        strArr[llIllIlIII[37]] = llIllIIllI[llIllIlIII[88]];
        strArr[llIllIlIII[38]] = llIllIIllI[llIllIlIII[89]];
        strArr[llIllIlIII[40]] = llIllIIllI[llIllIlIII[90]];
        strArr[llIllIlIII[49]] = llIllIIllI[llIllIlIII[91]];
        strArr[llIllIlIII[51]] = llIllIIllI[llIllIlIII[92]];
        strArr[llIllIlIII[52]] = llIllIIllI[llIllIlIII[93]];
        strArr[llIllIlIII[53]] = llIllIIllI[llIllIlIII[94]];
        strArr[llIllIlIII[54]] = llIllIIllI[llIllIlIII[95]];
        strArr[llIllIlIII[55]] = llIllIIllI[llIllIlIII[96]];
        ob = strArr;
        oc = llIllIlIII[97];
        dF = llIllIlIII[0];
        cI = C0018e.c(llIllIlIII[20], llIllIlIII[32]);
        od = C0018e.c(llIllIlIII[5], llIllIlIII[76]);
        cG = llIllIlIII[1];
        oe = new WorldArea(llIllIlIII[98], llIllIlIII[99], llIllIlIII[32], llIllIlIII[28], llIllIlIII[0]);
        pl = new WorldPoint(llIllIlIII[100], llIllIlIII[101], llIllIlIII[0]);
        pm = new WorldPoint(llIllIlIII[102], llIllIlIII[103], llIllIlIII[0]);
        pn = new WorldPoint(llIllIlIII[104], llIllIlIII[105], llIllIlIII[0]);
        po = new WorldPoint(llIllIlIII[106], llIllIlIII[107], llIllIlIII[0]);
        pp = new WorldPoint(llIllIlIII[108], llIllIlIII[109], llIllIlIII[0]);
        pq = new WorldPoint(llIllIlIII[110], llIllIlIII[111], llIllIlIII[0]);
        pr = pl;
        ps = pm;
        pt = ps;
    }

    private static boolean lIllIlllIlIII(Object obj) {
        return obj == null;
    }

    public static void gn() {
        if (lIllIllIllllI(Inventory.isFull() ? 1 : 0)) {
            Inventory.getAll(ob).forEach(item -> {
                item.interact(llIllIIllI[llIllIlIII[56]]);
            });
        }
        if (lIllIlllIIIII(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[llIllIlIII[1]];
            iArr[llIllIlIII[0]] = llIllIlIII[7];
            if (lIllIllIllllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIllIlIII[1]];
                iArr2[llIllIlIII[0]] = llIllIlIII[6];
                if (lIllIlllIIIII(Equipment.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIllIlIII[1]];
                    iArr3[llIllIlIII[0]] = llIllIlIII[6];
                    if (lIllIllIllllI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIllIlIII[1]];
                        iArr4[llIllIlIII[0]] = llIllIlIII[6];
                        Inventory.getFirst(iArr4).interact(llIllIIllI[llIllIlIII[17]]);
                        Time.sleepTicks(llIllIlIII[1]);
                        "".length();
                    }
                }
            }
        }
        if (lIllIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(pr), llIllIlIII[16])) {
            AccBuilderSotf.c = llIllIIllI[llIllIlIII[18]];
            Movement.walkTo(pr);
            "".length();
            Time.sleepTicks(llIllIlIII[1]);
            "".length();
        }
        if (lIllIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(pr), llIllIlIII[16])) {
            if (lIllIlllIIIII(oe.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(pr);
                "".length();
                Time.sleepTicks(llIllIlIII[1]);
                "".length();
            }
            if (lIllIllIllllI(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (lIllIlllIIlll(Players.getLocal().getGraphic(), llIllIlIII[19])) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[20]];
                String[] strArr = new String[llIllIlIII[1]];
                strArr[llIllIlIII[0]] = llIllIIllI[llIllIlIII[21]];
                if (lIllIlllIIIIl(NPCs.getNearest(strArr)) && lIllIlllIlIII(Players.getLocal().getInteracting())) {
                    String[] strArr2 = new String[llIllIlIII[1]];
                    strArr2[llIllIlIII[0]] = llIllIIllI[llIllIlIII[13]];
                    NPCs.getNearest(strArr2).interact(llIllIIllI[llIllIlIII[22]]);
                    Time.sleepTicks(llIllIlIII[1]);
                    "".length();
                }
            }
            if (lIllIlllIlIIl(Players.getLocal().getGraphic(), llIllIlIII[19])) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[23]];
                if (!lIllIlllIlIlI(lIllIlllIIlIl(C0018e.w(), 70.0d)) || lIllIlllIIllI(Skills.getBoostedLevel(Skill.HITPOINTS), llIllIlIII[8])) {
                    int[] iArr5 = new int[llIllIlIII[1]];
                    iArr5[llIllIlIII[0]] = llIllIlIII[7];
                    if (lIllIllIllllI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llIllIlIII[1]];
                        iArr6[llIllIlIII[0]] = llIllIlIII[7];
                        Inventory.getFirst(iArr6).interact(llIllIIllI[llIllIlIII[24]]);
                        Time.sleepTicks(llIllIlIII[1]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[llIllIlIII[1]];
                strArr3[llIllIlIII[0]] = llIllIIllI[llIllIlIII[25]];
                if (lIllIllIllllI(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llIllIlIII[1]];
                    strArr4[llIllIlIII[0]] = llIllIIllI[llIllIlIII[16]];
                    Inventory.getAll(strArr4).stream().forEach(item2 -> {
                        item2.interact(llIllIIllI[llIllIlIII[55]]);
                    });
                }
                Inventory.getAll(ob).forEach(item3 -> {
                    item3.interact(llIllIIllI[llIllIlIII[54]]);
                });
            }
        }
    }

    private static void gp() {
        if (lIllIlllIIIII(Players.getLocal().getWorldLocation().equals(nY) ? 1 : 0)) {
            AccBuilderSotf.c = llIllIIllI[llIllIlIII[34]];
            if (lIllIllIllllI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(nY);
            "".length();
            Time.sleepTicks(llIllIlIII[1]);
            "".length();
        }
        if (lIllIllIllllI(Players.getLocal().getWorldLocation().equals(nY) ? 1 : 0)) {
            int[] iArr = new int[llIllIlIII[1]];
            iArr[llIllIlIII[0]] = oc;
            if (lIllIllIllllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIllIlIII[1]];
                iArr2[llIllIlIII[0]] = oc;
                Inventory.getFirst(iArr2).interact(llIllIIllI[llIllIlIII[28]]);
                Time.sleepTicks(llIllIlIII[1]);
                "".length();
            }
            if (lIllIlllIIIII(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[35]];
                String[] strArr = new String[llIllIlIII[1]];
                strArr[llIllIlIII[0]] = llIllIIllI[llIllIlIII[36]];
                if (lIllIlllIIIIl(TileObjects.getNearest(strArr))) {
                    String[] strArr2 = new String[llIllIlIII[1]];
                    strArr2[llIllIlIII[0]] = llIllIIllI[llIllIlIII[37]];
                    TileObjects.getNearest(strArr2).interact(llIllIIllI[llIllIlIII[38]]);
                    Time.sleepUntil(() -> {
                        String[] strArr3 = new String[llIllIlIII[1]];
                        strArr3[llIllIlIII[0]] = llIllIIllI[llIllIlIII[53]];
                        if (lIllIlllIlIII(TileObjects.getNearest(strArr3))) {
                            ?? r0 = llIllIlIII[1];
                            "".length();
                            return (-"  ".length()) > 0 ? ((228 ^ 173) ^ (55 ^ 108)) & (((((13 + 63) - 25) + 90) ^ (((11 + 34) - (-102)) + 12)) ^ (-" ".length())) : r0;
                        }
                        return llIllIlIII[0];
                    }, llIllIlIII[39]);
                    "".length();
                }
            }
            if (lIllIllIllllI(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[40]];
                int[] iArr3 = new int[llIllIlIII[2]];
                iArr3[llIllIlIII[0]] = llIllIlIII[41];
                iArr3[llIllIlIII[1]] = llIllIlIII[42];
                Inventory.getAll(iArr3).forEach(item -> {
                    item.interact(llIllIIllI[llIllIlIII[52]]);
                });
                int[] iArr4 = new int[llIllIlIII[1]];
                iArr4[llIllIlIII[0]] = llIllIlIII[11];
                if (lIllIllIllllI(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[llIllIlIII[1]];
                    iArr5[llIllIlIII[0]] = llIllIlIII[11];
                    Inventory.getAll(iArr5).forEach(item2 -> {
                        item2.interact(llIllIIllI[llIllIlIII[51]]);
                    });
                }
            }
        }
    }

    private static boolean lIllIlllIIlII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0126, code lost:
        if (lIllIllIllllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        if (lIllIllIlllll(Skills.getLevel(Skill.THIEVING), llIllIlIII[12])) {
            int[] iArr = new int[llIllIlIII[1]];
            iArr[llIllIlIII[0]] = llIllIlIII[11];
            if (lIllIllIllllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIllIlIII[1]];
                iArr2[llIllIlIII[0]] = llIllIlIII[10];
                boolean contains = Inventory.contains(iArr2);
                int[] iArr3 = new int[llIllIlIII[1]];
                iArr3[llIllIlIII[0]] = llIllIlIII[9];
                if (lIllIllIllllI((contains ? 1 : 0) & (Inventory.contains(iArr3) ? 1 : 0)) && lIllIlllIIIlI(cG)) {
                    ?? r0 = llIllIlIII[1];
                    "".length();
                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return llIllIlIII[0];
        } else if (lIllIlllIIIll(Skills.getLevel(Skill.THIEVING), llIllIlIII[12]) && lIllIllIlllll(Skills.getLevel(Skill.THIEVING), llIllIlIII[5])) {
            return llIllIlIII[1];
        } else {
            if (lIllIlllIIIll(Skills.getLevel(Skill.THIEVING), llIllIlIII[5])) {
                int[] iArr4 = new int[llIllIlIII[1]];
                iArr4[llIllIlIII[0]] = llIllIlIII[7];
                if (lIllIllIllllI(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[llIllIlIII[1]];
                    iArr5[llIllIlIII[0]] = llIllIlIII[6];
                    if (lIllIlllIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llIllIlIII[1]];
                        iArr6[llIllIlIII[0]] = llIllIlIII[6];
                    }
                    ?? r02 = llIllIlIII[1];
                    "".length();
                    return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
                return llIllIlIII[0];
            }
            return llIllIlIII[0];
        }
    }

    private static boolean lIllIlllIIIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private static boolean fN() {
        return llIllIlIII[0];
    }

    private static boolean lIllIlllIlIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIlllIIIII(int i) {
        return i == 0;
    }

    private static int lIllIlllIllII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIllIlIII[0];
    }

    private static boolean lIllIlllIIllI(int i, int i2) {
        return i <= i2;
    }

    private static String lIllIllIllIII(String llllllllllllllllllIIIlIIIlIlllll, String llllllllllllllllllIIIlIIIlIllllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIlIIIlIllllI.toCharArray();
        int llllllllllllllllllIIIlIIIlIllIll = llIllIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllllIIIlIIIlIlIIll = llIllIlIII[0];
        while (lIllIllIlllll(llllllllllllllllllIIIlIIIlIlIIll, length)) {
            char llllllllllllllllllIIIlIIIllIIIII = charArray2[llllllllllllllllllIIIlIIIlIlIIll];
            sb.append((char) (llllllllllllllllllIIIlIIIllIIIII ^ charArray[llllllllllllllllllIIIlIIIlIllIll % charArray.length]));
            "".length();
            llllllllllllllllllIIIlIIIlIllIll++;
            llllllllllllllllllIIIlIIIlIlIIll++;
            "".length();
            if (((((126 + 30) - (-19)) + 9) ^ (((186 + 45) - 150) + 107)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIlllIIIIl(Object obj) {
        return obj != null;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        gm();
        return llIllIlIII[48];
    }

    private static void lIllIllIlllIl() {
        llIllIlIII = new int[113];
        llIllIlIII[0] = ((58 ^ 2) ^ (59 ^ 36)) & (((152 ^ 183) ^ (159 ^ 151)) ^ (-" ".length()));
        llIllIlIII[1] = " ".length();
        llIllIlIII[2] = "  ".length();
        llIllIlIII[3] = "   ".length();
        llIllIlIII[4] = (-(162 ^ 138)) & (-9297) & 14335;
        llIllIlIII[5] = (138 ^ 197) ^ (28 ^ 117);
        llIllIlIII[6] = (-10313) & 31455;
        llIllIlIII[7] = (-28691) & 30683;
        llIllIlIII[8] = 143 ^ 139;
        llIllIlIII[9] = (-24761) & 32767;
        llIllIlIII[10] = (-182) & 8189;
        llIllIlIII[11] = (-((-1007) & 21487)) & (-9345) & 30203;
        llIllIlIII[12] = 199 ^ 194;
        llIllIlIII[13] = 73 ^ 67;
        llIllIlIII[14] = 51 ^ 39;
        llIllIlIII[15] = (-((-26001) & 32157)) & (-8193) & 16239;
        llIllIlIII[16] = 146 ^ 157;
        llIllIlIII[17] = (((66 + 110) - 3) + 17) ^ (((49 + 73) - 22) + 84);
        llIllIlIII[18] = (176 ^ 197) ^ (120 ^ 10);
        llIllIlIII[19] = ((7 + 9) - (-220)) + 9;
        llIllIlIII[20] = 14 ^ 6;
        llIllIlIII[21] = (((139 + 33) - 139) + 130) ^ (((63 + 168) - 120) + 59);
        llIllIlIII[22] = (80 ^ 79) ^ (66 ^ 86);
        llIllIlIII[23] = 146 ^ 158;
        llIllIlIII[24] = (115 ^ 117) ^ (70 ^ 77);
        llIllIlIII[25] = 182 ^ 184;
        llIllIlIII[26] = (((81 + 50) - 110) + 110) ^ (((59 + 137) - 98) + 49);
        llIllIlIII[27] = 73 ^ 88;
        llIllIlIII[28] = 5 ^ 28;
        llIllIlIII[29] = 214 ^ 196;
        llIllIlIII[30] = (((4 + 120) - (-32)) + 13) ^ (((32 + 8) - (-92)) + 54);
        llIllIlIII[31] = (110 ^ 65) ^ (170 ^ 144);
        llIllIlIII[32] = 184 ^ 174;
        llIllIlIII[33] = 136 ^ 159;
        llIllIlIII[34] = 95 ^ 71;
        llIllIlIII[35] = 167 ^ 189;
        llIllIlIII[36] = (((155 + 139) - 243) + 129) ^ (((23 + 53) - (-7)) + 92);
        llIllIlIII[37] = (114 ^ 99) ^ (202 ^ 199);
        llIllIlIII[38] = 3 ^ 30;
        llIllIlIII[39] = (-91) & 4090;
        llIllIlIII[40] = 70 ^ 88;
        llIllIlIII[41] = (-22593) & 24570;
        llIllIlIII[42] = (-((-14392) & 31871)) & (-1) & 17919;
        llIllIlIII[43] = (-((-8714) & 31355)) & (-8195) & 31735;
        llIllIlIII[44] = (-((-30749) & 31453)) & (-15378) & 16381;
        llIllIlIII[45] = (-18575) & 31199;
        llIllIlIII[46] = (-1380) & 16379;
        llIllIlIII[47] = (-(217 ^ 152)) & (-20514) & 22527;
        llIllIlIII[48] = (((197 + 119) - 240) + 146) ^ (((179 + 40) - 113) + 80);
        llIllIlIII[49] = 92 ^ 67;
        llIllIlIII[50] = 87 ^ 52;
        llIllIlIII[51] = (((89 + 21) - 30) + 72) ^ (((163 + 177) - 308) + 152);
        llIllIlIII[52] = (50 ^ 125) ^ (52 ^ 90);
        llIllIlIII[53] = (134 ^ 161) ^ (33 ^ 36);
        llIllIlIII[54] = (((206 + 21) - 52) + 49) ^ (((9 + 12) - (-120)) + 54);
        llIllIlIII[55] = (41 ^ 91) ^ (118 ^ 32);
        llIllIlIII[56] = 69 ^ 96;
        llIllIlIII[57] = (-((-1281) & 30059)) & (-2) & 31999;
        llIllIlIII[58] = (-((-1169) & 26073)) & (-5) & 28127;
        llIllIlIII[59] = (-((-19364) & 23487)) & (-1) & 7391;
        llIllIlIII[60] = (-16929) & 20338;
        llIllIlIII[61] = 38 ^ 1;
        llIllIlIII[62] = 70 ^ 110;
        llIllIlIII[63] = 21 ^ 60;
        llIllIlIII[64] = (((46 + 126) - 101) + 59) ^ (((149 + 147) - 249) + 121);
        llIllIlIII[65] = (190 ^ 152) ^ (145 ^ 156);
        llIllIlIII[66] = (115 ^ 126) ^ (104 ^ 73);
        llIllIlIII[67] = (19 ^ 100) ^ (199 ^ 157);
        llIllIlIII[68] = 130 ^ 172;
        llIllIlIII[69] = 234 ^ 197;
        llIllIlIII[70] = 133 ^ 181;
        llIllIlIII[71] = 31 ^ 46;
        llIllIlIII[72] = 242 ^ 192;
        llIllIlIII[73] = (149 ^ 187) ^ (219 ^ 198);
        llIllIlIII[74] = 17 ^ 37;
        llIllIlIII[75] = (26 ^ 99) ^ (66 ^ 14);
        llIllIlIII[76] = 129 ^ 183;
        llIllIlIII[77] = (((100 + 84) - 36) + 24) ^ (((42 + 8) - (-30)) + 75);
        llIllIlIII[78] = (39 ^ 21) ^ (182 ^ 188);
        llIllIlIII[79] = 184 ^ 129;
        llIllIlIII[80] = (140 ^ 189) ^ (188 ^ 183);
        llIllIlIII[81] = 158 ^ 165;
        llIllIlIII[82] = (84 ^ 91) ^ (22 ^ 37);
        llIllIlIII[83] = (153 ^ 165) ^ " ".length();
        llIllIlIII[84] = 106 ^ 84;
        llIllIlIII[85] = (101 ^ 123) ^ (116 ^ 85);
        llIllIlIII[86] = (249 ^ 149) ^ (163 ^ 143);
        llIllIlIII[87] = (111 ^ 105) ^ (237 ^ 170);
        llIllIlIII[88] = (((27 + 220) - 116) + 103) ^ (((72 + 165) - 216) + 147);
        llIllIlIII[89] = (204 ^ 131) ^ (200 ^ 196);
        llIllIlIII[90] = (30 ^ 112) ^ (100 ^ 78);
        llIllIlIII[91] = 47 ^ 106;
        llIllIlIII[92] = 29 ^ 91;
        llIllIlIII[93] = (34 ^ 3) ^ (43 ^ 77);
        llIllIlIII[94] = 112 ^ 56;
        llIllIlIII[95] = 200 ^ 129;
        llIllIlIII[96] = (((142 + 0) - 63) + 118) ^ (((51 + 88) - 92) + 96);
        llIllIlIII[97] = (-10245) & 32765;
        llIllIlIII[98] = (-16387) & 19454;
        llIllIlIII[99] = (-25409) & 28647;
        llIllIlIII[100] = (-29479) & 32559;
        llIllIlIII[101] = (-16457) & 19707;
        llIllIlIII[102] = (-25579) & 28670;
        llIllIlIII[103] = (-17173) & 20415;
        llIllIlIII[104] = (-((-16455) & 20583)) & (-24705) & 31931;
        llIllIlIII[105] = (-28685) & 31934;
        llIllIlIII[106] = (-26636) & 28395;
        llIllIlIII[107] = (-((-1833) & 30651)) & (-65) & 32511;
        llIllIlIII[108] = (-24867) & 26615;
        llIllIlIII[109] = (-(143 ^ 174)) & (-16449) & 20079;
        llIllIlIII[110] = (-((-9933) & 30717)) & (-10241) & 32763;
        llIllIlIII[111] = (-((-1957) & 18413)) & (-12421) & 32510;
        llIllIlIII[112] = (251 ^ 131) ^ (182 ^ 133);
    }

    private static int lIllIlllIlIll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static int lIllIlllIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void go() {
        if (lIllIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(nX), llIllIlIII[16])) {
            AccBuilderSotf.c = llIllIIllI[llIllIlIII[26]];
            Movement.walkTo(nX);
            "".length();
            Time.sleepTicks(llIllIlIII[1]);
            "".length();
        }
        if (lIllIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(nX), llIllIlIII[16])) {
            if (lIllIllIllllI(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (lIllIlllIlIlI(lIllIlllIlIll(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[27]];
                int[] iArr = new int[llIllIlIII[1]];
                iArr[llIllIlIII[0]] = oc;
                if (lIllIllIllllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIllIlIII[1]];
                    iArr2[llIllIlIII[0]] = oc;
                    if (lIllIlllIIIll(Inventory.getFirst(iArr2).getQuantity(), llIllIlIII[28])) {
                        int[] iArr3 = new int[llIllIlIII[1]];
                        iArr3[llIllIlIII[0]] = oc;
                        Inventory.getFirst(iArr3).interact(llIllIIllI[llIllIlIII[29]]);
                        Time.sleepTicks(llIllIlIII[1]);
                        "".length();
                    }
                }
                String[] strArr = new String[llIllIlIII[1]];
                strArr[llIllIlIII[0]] = llIllIIllI[llIllIlIII[30]];
                if (lIllIlllIIIIl(NPCs.getNearest(strArr)) && lIllIlllIlIII(Players.getLocal().getInteracting()) && lIllIlllIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] strArr2 = new String[llIllIlIII[1]];
                    strArr2[llIllIlIII[0]] = llIllIIllI[llIllIlIII[14]];
                    NPCs.getNearest(strArr2).interact(llIllIIllI[llIllIlIII[31]]);
                    Time.sleepTicks(llIllIlIII[1]);
                    "".length();
                }
            }
            if (lIllIlllIllIl(lIllIlllIlIll(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[32]];
                if (!lIllIlllIlIlI(lIllIlllIllII(C0018e.w(), 30.0d)) || lIllIlllIIllI(Skills.getBoostedLevel(Skill.HITPOINTS), llIllIlIII[8])) {
                    int[] iArr4 = new int[llIllIlIII[1]];
                    iArr4[llIllIlIII[0]] = llIllIlIII[11];
                    if (lIllIllIllllI(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIllIlIII[1]];
                        iArr5[llIllIlIII[0]] = llIllIlIII[11];
                        Inventory.getFirst(iArr5).interact(llIllIIllI[llIllIlIII[33]]);
                        Time.sleepTicks(llIllIlIII[1]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIllIlllIIIlI(int i) {
        return i > 0;
    }

    private static String lIllIllIlIllI(String llllllllllllllllllIIIlIIIlllllII, String llllllllllllllllllIIIlIIIllllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIIIllllIll.getBytes(StandardCharsets.UTF_8)), llIllIlIII[20]), "DES");
            Cipher llllllllllllllllllIIIlIIIllllllI = Cipher.getInstance("DES");
            llllllllllllllllllIIIlIIIllllllI.init(llIllIlIII[2], secretKeySpec);
            return new String(llllllllllllllllllIIIlIIIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlIIIlllllIl) {
            llllllllllllllllllIIIlIIIlllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIllIlIlll(String llllllllllllllllllIIIlIIIllIllll, String llllllllllllllllllIIIlIIIllIlllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIIIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIlIII[2], llllllllllllllllllIIIlIIIlllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlIIIlllIIII) {
            llllllllllllllllllIIIlIIIlllIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x013e, code lost:
        if (lIllIlllIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v128, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gm() {
        if (lIllIllIllllI(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIllIIllI[llIllIlIII[0]];
            C0015b.a(bv);
            if (lIllIllIlllll(bv.size(), llIllIlIII[1])) {
                System.out.println(llIllIIllI[llIllIlIII[1]]);
                bt = llIllIlIII[0];
            }
        }
        if (lIllIlllIIIII(bt ? 1 : 0)) {
            if (lIllIlllIIIII(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIlllIIIIl(nearest) && lIllIlllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIllI[llIllIlIII[2]];
                    C0000a.a(nearest);
                }
                if (lIllIlllIIIIl(nearest) && lIllIllIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIllI[llIllIlIII[3]];
                    if (lIllIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIllIlIII[4]);
                        "".length();
                    }
                    if (lIllIllIllllI(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIlllIIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIllIlIII[3]);
                            "".length();
                        }
                        if (lIllIlllIIIll(Skills.getLevel(Skill.THIEVING), llIllIlIII[5])) {
                            int[] iArr = new int[llIllIlIII[1]];
                            iArr[llIllIlIII[0]] = llIllIlIII[6];
                            if (lIllIllIllllI(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIllIlIII[1]];
                                iArr2[llIllIlIII[0]] = llIllIlIII[7];
                            }
                            Q();
                            System.out.println(llIllIIllI[llIllIlIII[8]]);
                            bt = llIllIlIII[1];
                            return;
                        }
                        int[] iArr3 = new int[llIllIlIII[1]];
                        iArr3[llIllIlIII[0]] = llIllIlIII[9];
                        if (lIllIllIllllI(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIllIlIII[1]];
                            iArr4[llIllIlIII[0]] = llIllIlIII[10];
                            if (lIllIllIllllI(Bank.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[llIllIlIII[1]];
                                iArr5[llIllIlIII[0]] = llIllIlIII[11];
                                if (!lIllIlllIIIII(Bank.contains(iArr5) ? 1 : 0)) {
                                    if (lIllIllIlllll(Skills.getLevel(Skill.THIEVING), llIllIlIII[12])) {
                                        C0000a.a(llIllIlIII[10], llIllIlIII[12]);
                                        C0000a.a(llIllIlIII[9], llIllIlIII[12]);
                                        C0000a.a(llIllIlIII[11], llIllIlIII[13]);
                                    }
                                    if (lIllIlllIIIll(Skills.getLevel(Skill.THIEVING), llIllIlIII[12]) && lIllIllIlllll(Skills.getLevel(Skill.THIEVING), llIllIlIII[5])) {
                                        C0000a.a(llIllIlIII[9], llIllIlIII[12]);
                                    }
                                    if (lIllIlllIIIll(Skills.getLevel(Skill.THIEVING), llIllIlIII[5])) {
                                        C0000a.a(llIllIlIII[6], llIllIlIII[12]);
                                        C0000a.a(llIllIlIII[7], llIllIlIII[14]);
                                        C0000a.a(llIllIlIII[15], llIllIlIII[14]);
                                    }
                                    cG += llIllIlIII[1];
                                }
                            }
                        }
                        Q();
                        System.out.println(llIllIIllI[llIllIlIII[12]]);
                        bt = llIllIlIII[1];
                        return;
                    }
                }
                if (lIllIlllIIlII(Inventory.getFreeSlots(), llIllIlIII[16])) {
                    cG += llIllIlIII[1];
                }
            }
            if (lIllIllIllllI(an() ? 1 : 0) && lIllIlllIIIlI(cG)) {
                if (lIllIllIllllI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIllIllIlllll(Skills.getLevel(Skill.THIEVING), llIllIlIII[12])) {
                    go();
                }
                if (lIllIlllIIIll(Skills.getLevel(Skill.THIEVING), llIllIlIII[12]) && lIllIllIlllll(Skills.getLevel(Skill.THIEVING), llIllIlIII[5])) {
                    gp();
                }
                if (lIllIlllIIIll(Skills.getLevel(Skill.THIEVING), llIllIlIII[5])) {
                    gn();
                }
            }
        }
    }
}
