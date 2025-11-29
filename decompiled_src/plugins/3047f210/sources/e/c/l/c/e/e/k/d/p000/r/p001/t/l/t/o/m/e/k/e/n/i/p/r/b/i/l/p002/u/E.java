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
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.E  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/E.class */
public class E implements S {
    public static /* synthetic */ WorldPoint gV;
    static /* synthetic */ WorldArea ha;
    public static /* synthetic */ WorldPoint gW;
    static /* synthetic */ int gZ;
    public static /* synthetic */ WorldPoint gf;
    private static /* synthetic */ String[] lllllIIIll;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ int[] lllllIIlIl;
    public static /* synthetic */ WorldPoint gX;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ int ck;
    public static /* synthetic */ WorldPoint gY;

    private static boolean llIlIIllIIIIl(int i) {
        return i < 0;
    }

    private static boolean llIlIIllIIlII(int i, int i2) {
        return i == i2;
    }

    private static String llIlIIlIIlIlI(String lllllllllllllllllIlIIllIIIlllIIl, String lllllllllllllllllIlIIllIIIlllIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIIllIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIllIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIllIIIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIllIIIlllIll.init(lllllIIlIl[3], lllllllllllllllllIlIIllIIIllllII);
            return new String(lllllllllllllllllIlIIllIIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIllIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIllIIIlllIlI) {
            lllllllllllllllllIlIIllIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIIllIl() {
        lllllIIIll = new String[lllllIIlIl[197]];
        lllllIIIll[lllllIIlIl[1]] = llIlIIlIIlIIl("Hx46JxExEjBuACwOPSAFeR4gKw8qW3Q9FTADNyYLNxB0LAM6HHQ6DXkGISsRLQ==", "YwTNb");
        lllllIIIll[lllllIIlIl[0]] = llIlIIlIIlIIl("LyYPWDwOZxsZJgo=", "aGyxH");
        lllllIIIll[lllllIIlIl[3]] = llIlIIlIIlIlI("jfHx+zBzOQGD+nK0HQI4WkPjqxZ0Jtfp", "UJAJQ");
        lllllIIIll[lllllIIlIl[8]] = llIlIIlIIlIIl("PTZBDioPcwwGKxk6Dwh4GyYEHCxKIBQfKAY6BBx0SiAWBiwJOwgBP0onDk8aPwooIR8=", "jSaoX");
        lllllIIIll[lllllIIlIl[4]] = llIlIIlIIlIlI("64qFjHutSuc=", "UmISM");
        lllllIIIll[lllllIIlIl[14]] = llIlIIlIIlIIl("ABIM", "EsxvN");
        lllllIIIll[lllllIIlIl[17]] = llIlIIlIIlIlI("MSfkVUQw8H5LeN1ci6XGTA==", "Uzqpu");
        lllllIIIll[lllllIIlIl[18]] = llIlIIlIIlIIl("PDIRHwBPNwUIBxs=", "oFpmt");
        lllllIIIll[lllllIIlIl[16]] = llIlIIlIIlIlI("TFrEFmOIUCJ7HQWXp469Sg==", "MtBJo");
        lllllIIIll[lllllIIlIl[20]] = llIlIIlIIlIlI("paQkgHgrEUg=", "cbWoy");
        lllllIIIll[lllllIIlIl[10]] = llIlIIlIIlIll("PYnrtwgkn1ihDAotgErk6CN3ydSb323Y", "CKFbw");
        lllllIIIll[lllllIIlIl[23]] = llIlIIlIIlIll("NTH5aPYz62QZd7jG5brL7VbuwzXVnUfN", "NohCU");
        lllllIIIll[lllllIIlIl[24]] = llIlIIlIIlIll("PrXrWiPQbS7b/zDPlH/Oxg==", "Vskbh");
        lllllIIIll[lllllIIlIl[25]] = llIlIIlIIlIlI("pCT13JNWhLQ=", "FtURO");
        lllllIIIll[lllllIIlIl[26]] = llIlIIlIIlIll("yWk3r0hK2Zt8XS0HVtULzleUD6llr8rc", "pBwXO");
        lllllIIIll[lllllIIlIl[27]] = llIlIIlIIlIlI("RrMPhF0MQOI=", "GGLaU");
        lllllIIIll[lllllIIlIl[28]] = llIlIIlIIlIIl("PTk6VzcceC8YLgM3PwM=", "sXLwC");
        lllllIIIll[lllllIIlIl[29]] = llIlIIlIIlIIl("IzwgDggJMg==", "gUGia");
        lllllIIIll[lllllIIlIl[30]] = llIlIIlIIlIIl("CDYnGBs4LWoAESop", "KYJht");
        lllllIIIll[lllllIIlIl[31]] = llIlIIlIIlIIl("EBw7ADor", "CyZrY");
        lllllIIIll[lllllIIlIl[32]] = llIlIIlIIlIIl("GwcT", "PbjiJ");
        lllllIIIll[lllllIIlIl[33]] = llIlIIlIIlIll("r/BVYfk8a38LEKi2W52zeA==", "DQcUl");
        lllllIIIll[lllllIIlIl[34]] = llIlIIlIIlIIl("FAkfJgwzDwQ=", "RfjHx");
        lllllIIIll[lllllIIlIl[35]] = llIlIIlIIlIIl("AQgo", "JmQcp");
        lllllIIIll[lllllIIlIl[36]] = llIlIIlIIlIlI("p2lxvDgXXuJSJIhV5P4QmQ==", "JgwOC");
        lllllIIIll[lllllIIlIl[37]] = llIlIIlIIlIll("an9qbYH/zSQxAJp5m0I+Lw==", "hyaUm");
        lllllIIIll[lllllIIlIl[38]] = llIlIIlIIlIIl("DB4AKTcrGBs=", "JquGC");
        lllllIIIll[lllllIIlIl[39]] = llIlIIlIIlIlI("aGqnO0rgCIA=", "RXMnK");
        lllllIIIll[lllllIIlIl[40]] = llIlIIlIIlIll("TQvSNtMjc40=", "YLpwV");
        lllllIIIll[lllllIIlIl[41]] = llIlIIlIIlIIl("Ah4EISEnHgRyNTMZBjc=", "RlaRR");
        lllllIIIll[lllllIIlIl[42]] = llIlIIlIIlIlI("eYYPqHkNmAR6/CPiM4tIbA==", "SwMRl");
        lllllIIIll[lllllIIlIl[46]] = llIlIIlIIlIll("pGrlQ7jCFRnzXe46bPOhdg==", "xzCrp");
        lllllIIIll[lllllIIlIl[47]] = llIlIIlIIlIll("dgv9YHm0rWo=", "CvgjP");
        lllllIIIll[lllllIIlIl[48]] = llIlIIlIIlIlI("I63XXWQGbAc=", "NRRID");
        lllllIIIll[lllllIIlIl[49]] = llIlIIlIIlIlI("2/lv1zbaoNvxjzb79iXhIg==", "fUHQn");
        lllllIIIll[lllllIIlIl[50]] = llIlIIlIIlIIl("EzchEDEzYjcHNiQ=", "ABCrT");
        lllllIIIll[lllllIIlIl[51]] = llIlIIlIIlIIl("JxgdAA==", "syveH");
        lllllIIIll[lllllIIlIl[52]] = llIlIIlIIlIll("Shw+CxAlQ7tnm9FArLkZdQ==", "ypudh");
        lllllIIIll[lllllIIlIl[53]] = llIlIIlIIlIll("3R6ZGrIsHJY=", "PZeRj");
        lllllIIIll[lllllIIlIl[56]] = llIlIIlIIlIIl("LQI/MA==", "imPBO");
        lllllIIIll[lllllIIlIl[57]] = llIlIIlIIlIIl("KjcVGg==", "eGptE");
        lllllIIIll[lllllIIlIl[58]] = llIlIIlIIlIlI("t5aEi83LDgkOLokZ8pCMcVsbyUFZiHJj", "SXlFl");
        lllllIIIll[lllllIIlIl[59]] = llIlIIlIIlIIl("KhQWEDEU", "furtT");
        lllllIIIll[lllllIIlIl[60]] = llIlIIlIIlIlI("cgDwI3BYKUIYL0uD8pm91g==", "fCKpd");
        lllllIIIll[lllllIIlIl[76]] = llIlIIlIIlIIl("FgAZSDg3QQ4=", "XaohL");
        lllllIIIll[lllllIIlIl[77]] = llIlIIlIIlIlI("CxO6h55zs71oBNR7ntjB/Q==", "jyQyX");
        lllllIIIll[lllllIIlIl[78]] = llIlIIlIIlIlI("6tb7xDKmouE=", "uYTIr");
        lllllIIIll[lllllIIlIl[79]] = llIlIIlIIlIIl("ISAgNg==", "qULZF");
        lllllIIIll[lllllIIlIl[81]] = llIlIIlIIlIll("FyK8Miaca8iSBuAUXptn+w==", "criRB");
        lllllIIIll[lllllIIlIl[82]] = llIlIIlIIlIll("JCsPHOdyB40/1tqUcc8BWg==", "siDRm");
        lllllIIIll[lllllIIlIl[15]] = llIlIIlIIlIlI("rgoAP5bGGLo=", "MtVgQ");
        lllllIIIll[lllllIIlIl[83]] = llIlIIlIIlIlI("AVf5CDwcURg=", "FBJNx");
        lllllIIIll[lllllIIlIl[85]] = llIlIIlIIlIIl("AjE/eDcjcC0=", "LPIXC");
        lllllIIIll[lllllIIlIl[86]] = llIlIIlIIlIlI("rLYGLp1e3FI=", "icnHU");
        lllllIIIll[lllllIIlIl[87]] = llIlIIlIIlIIl("OwUUCA==", "tuqfb");
        lllllIIIll[lllllIIlIl[88]] = llIlIIlIIlIlI("GTcF47BlrjIgZOMVXNWexg==", "APtoL");
        lllllIIIll[lllllIIlIl[89]] = llIlIIlIIlIll("ncdb33d1HCE=", "JxCjF");
        lllllIIIll[lllllIIlIl[90]] = llIlIIlIIlIlI("81kqvgW3BfA=", "Fkqcg");
        lllllIIIll[lllllIIlIl[92]] = llIlIIlIIlIlI("ay7hMNJyR6ePkqaPBiDimw==", "VRKBy");
        lllllIIIll[lllllIIlIl[93]] = llIlIIlIIlIll("PtOJuzDJCdQ=", "ATKhv");
        lllllIIIll[lllllIIlIl[94]] = llIlIIlIIlIIl("LAQQBw==", "ctuij");
        lllllIIIll[lllllIIlIl[95]] = llIlIIlIIlIIl("CTkSRwUoeAY=", "GXdgq");
        lllllIIIll[lllllIIlIl[96]] = llIlIIlIIlIlI("/YVMH709ETyUZAhrd5uU9A==", "olUXc");
        lllllIIIll[lllllIIlIl[97]] = llIlIIlIIlIIl("NQk7AhNZLg==", "ylMga");
        lllllIIIll[lllllIIlIl[98]] = llIlIIlIIlIll("xutBX/d1XQ8=", "IzNzH");
        lllllIIIll[lllllIIlIl[99]] = llIlIIlIIlIIl("GSI4VD04Yy8=", "WCNtI");
        lllllIIIll[lllllIIlIl[100]] = llIlIIlIIlIll("HlYYyTqs6be7EGpT0Gczug==", "YzHKF");
        lllllIIIll[lllllIIlIl[101]] = llIlIIlIIlIIl("Ly0YMAtDCQ==", "cHnUy");
        lllllIIIll[lllllIIlIl[102]] = llIlIIlIIlIll("EbbZ96zoA0U=", "pQrnb");
        lllllIIIll[lllllIIlIl[105]] = llIlIIlIIlIIl("HDURCWklNUcIJj4o", "QZglI");
        lllllIIIll[lllllIIlIl[106]] = llIlIIlIIlIIl("HBkfAA==", "Xvprp");
        lllllIIIll[lllllIIlIl[107]] = llIlIIlIIlIIl("CiIcJQ==", "ERyKc");
        lllllIIIll[lllllIIlIl[110]] = llIlIIlIIlIlI("Xakxm9gzymcnOz/Pj5z/dQ==", "yLzfB");
        lllllIIIll[lllllIIlIl[111]] = llIlIIlIIlIIl("Mg46Fw==", "vaUeO");
        lllllIIIll[lllllIIlIl[112]] = llIlIIlIIlIlI("TNBV3tHgoOg=", "AfanR");
        lllllIIIll[lllllIIlIl[114]] = llIlIIlIIlIIl("KhUXP0ITFUE+DQgI", "gzaZb");
        lllllIIIll[lllllIIlIl[115]] = llIlIIlIIlIIl("LSckIw==", "iHKQu");
        lllllIIIll[lllllIIlIl[116]] = llIlIIlIIlIlI("6H6WoNdR11U=", "nyzUl");
        lllllIIIll[lllllIIlIl[117]] = llIlIIlIIlIlI("FukCu0YLR6Hr46bpQOi+7A==", "rEdrZ");
        lllllIIIll[lllllIIlIl[118]] = llIlIIlIIlIIl("ISYHBGgdNh0NOg==", "qSkhH");
        lllllIIIll[lllllIIlIl[119]] = llIlIIlIIlIlI("52q8mlmm19w=", "gcmqF");
        lllllIIIll[lllllIIlIl[120]] = llIlIIlIIlIll("19rDXxm0uBo=", "DiESm");
        lllllIIIll[lllllIIlIl[122]] = llIlIIlIIlIlI("7GnqWcXhWjshHlNw7wfcQA==", "IHTrl");
        lllllIIIll[lllllIIlIl[123]] = llIlIIlIIlIlI("F+Te0thD0IDg6LQ/G2EUrw==", "hlkCF");
        lllllIIIll[lllllIIlIl[124]] = llIlIIlIIlIIl("BjEBIyFqEg==", "JTwFS");
        lllllIIIll[lllllIIlIl[125]] = llIlIIlIIlIll("piEHedqxEfQ=", "pPxld");
        lllllIIIll[lllllIIlIl[128]] = llIlIIlIIlIlI("8bVI66bhmmR4BU+QcRNyig==", "VjVkP");
        lllllIIIll[lllllIIlIl[129]] = llIlIIlIIlIIl("MC0AMA==", "tBoBP");
        lllllIIIll[lllllIIlIl[130]] = llIlIIlIIlIll("TuL2gMimrcI=", "piLpB");
        lllllIIIll[lllllIIlIl[132]] = llIlIIlIIlIlI("XtVYL953w5mbG1PVNI3ObA==", "pUeFM");
        lllllIIIll[lllllIIlIl[133]] = llIlIIlIIlIll("EfNo5JKgXSQ=", "PyMoH");
        lllllIIIll[lllllIIlIl[134]] = llIlIIlIIlIll("54ibz0V9RYo=", "ftYfj");
        lllllIIIll[lllllIIlIl[135]] = llIlIIlIIlIll("8e3k5O19SapBggpcFVZjiA==", "rmfyZ");
        lllllIIIll[lllllIIlIl[136]] = llIlIIlIIlIIl("FCMdJDV4BQ==", "XFkAG");
        lllllIIIll[lllllIIlIl[137]] = llIlIIlIIlIIl("Px0UJg==", "ohxJF");
        lllllIIIll[lllllIIlIl[139]] = llIlIIlIIlIlI("ir8gfDdW6MjoWvtaM7wnqg==", "RPtnj");
        lllllIIIll[lllllIIlIl[140]] = llIlIIlIIlIIl("PiAhMA==", "zONBU");
        lllllIIIll[lllllIIlIl[141]] = llIlIIlIIlIll("rhwKcw7eBtY=", "kSPSZ");
        lllllIIIll[lllllIIlIl[142]] = llIlIIlIIlIIl("JgIYIkIfAk4jDQQf", "kmnGb");
        lllllIIIll[lllllIIlIl[143]] = llIlIIlIIlIlI("4O+w6K9RbEk=", "nEwOQ");
        lllllIIIll[lllllIIlIl[144]] = llIlIIlIIlIIl("GTk/AQ==", "VIZoS");
        lllllIIIll[lllllIIlIl[145]] = llIlIIlIIlIlI("AQMDLATy8KyyTBB27vgs9g==", "AGraT");
        lllllIIIll[lllllIIlIl[146]] = llIlIIlIIlIIl("ChAZJGs2AAMtOQ==", "ZeuHK");
        lllllIIIll[lllllIIlIl[147]] = llIlIIlIIlIlI("xeqNqb3cnCE=", "nBCeX");
        lllllIIIll[lllllIIlIl[148]] = llIlIIlIIlIlI("XbU9HbPGEyo=", "KFwUt");
        lllllIIIll[lllllIIlIl[149]] = llIlIIlIIlIll("4qyN0hvCEgNaoxbycjM/5g==", "PMqiK");
        lllllIIIll[lllllIIlIl[150]] = llIlIIlIIlIIl("AzcNJQ==", "GXbWo");
        lllllIIIll[lllllIIlIl[151]] = llIlIIlIIlIll("UTtJdejunag=", "OUwtE");
        lllllIIIll[lllllIIlIl[153]] = llIlIIlIIlIll("GQTlYbyb2Bj2QOUMLZPWsg==", "SlqGu");
        lllllIIIll[lllllIIlIl[154]] = llIlIIlIIlIIl("KDsBBg==", "lTntX");
        lllllIIIll[lllllIIlIl[155]] = llIlIIlIIlIll("A1gYzGBV5p0=", "bVHLK");
        lllllIIIll[lllllIIlIl[156]] = llIlIIlIIlIll("hFOHopgGNrP5chuGhrnBCQ==", "FfnPc");
        lllllIIIll[lllllIIlIl[158]] = llIlIIlIIlIll("EQsSdU3cSBU=", "WLudd");
        lllllIIIll[lllllIIlIl[160]] = llIlIIlIIlIIl("LCEkAA==", "cQAnQ");
        lllllIIIll[lllllIIlIl[163]] = llIlIIlIIlIlI("6LFkdR5HPTQ=", "OBgEN");
        lllllIIIll[lllllIIlIl[164]] = llIlIIlIIlIlI("1b4GDscmjJg=", "zLeDs");
        lllllIIIll[lllllIIlIl[165]] = llIlIIlIIlIlI("215aPbm8qqw=", "GGzpL");
        lllllIIIll[lllllIIlIl[166]] = llIlIIlIIlIIl("KhMpBgAKRj8RBx0=", "xfKde");
        lllllIIIll[lllllIIlIl[167]] = llIlIIlIIlIll("zSsN/uuS/3s=", "rBRlT");
        lllllIIIll[lllllIIlIl[168]] = llIlIIlIIlIlI("OPqYDjaGh1s=", "RzpBP");
        lllllIIIll[lllllIIlIl[169]] = llIlIIlIIlIIl("BDYgZREldyY3CiwyJTYKOA==", "JWVEe");
        lllllIIIll[lllllIIlIl[170]] = llIlIIlIIlIlI("CvPTRWg8MmA=", "UWhpr");
        lllllIIIll[lllllIIlIl[171]] = llIlIIlIIlIll("9ndDMtIguoqTaZJoFR1L83ntl5i+hK0K", "tAxAW");
        lllllIIIll[lllllIIlIl[172]] = llIlIIlIIlIIl("BwUFVjUmRAMELi8BAAUuOw==", "IdsvA");
        lllllIIIll[lllllIIlIl[173]] = llIlIIlIIlIIl("DTUqAg==", "BEOlH");
        lllllIIIll[lllllIIlIl[174]] = llIlIIlIIlIll("O6SkdZ8dQGgJl0JjTatQXXs8m4Vw9Dyn", "ucvhI");
        lllllIIIll[lllllIIlIl[180]] = llIlIIlIIlIlI("nJRNlJ2RZOOgipCFl0xGF3cQZDhnBtXP", "nGsqM");
        lllllIIIll[lllllIIlIl[181]] = llIlIIlIIlIlI("QOlzSAvH7accd88f2eYx9ATBlK4wPpD9", "KNdFE");
        lllllIIIll[lllllIIlIl[182]] = llIlIIlIIlIIl("HhwkAQ==", "ZsKsS");
        lllllIIIll[lllllIIlIl[183]] = llIlIIlIIlIll("t4nnOSsZfx0=", "PEheo");
        lllllIIIll[lllllIIlIl[185]] = llIlIIlIIlIll("I3BJOt5D4+I=", "kYsea");
        lllllIIIll[lllllIIlIl[186]] = llIlIIlIIlIlI("ia6jQHx1ksA=", "ttrpi");
        lllllIIIll[lllllIIlIl[193]] = llIlIIlIIlIll("2A8uFRqQ3Uw=", "SSqKv");
        lllllIIIll[lllllIIlIl[194]] = llIlIIlIIlIlI("B/xGMWSfJysQL1iH5eF8slOe4AixgTrjCagSY/WTbemEapi/bd2QnA==", "uKvFM");
        lllllIIIll[lllllIIlIl[195]] = llIlIIlIIlIIl("Hmk3Rwo7Lz5HOzI8NQkENC96AwQzIH0TTTYtLhIMOyIjRwoyOnoCAzAvPQIJdzo1Rwx3LTIODjwrNEk=", "WNZgm");
    }

    private static boolean llIlIIlIlllII(int i) {
        return i != 0;
    }

    private static boolean llIlIIllIIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlIIllIIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIIlIlllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0520, code lost:
        if (llIlIIlIlllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L399;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1210, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1232, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cn() {
        if (llIlIIlIlllII(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIlIIlIlllIl(bu.size(), lllllIIlIl[0])) {
                System.out.println(lllllIIIll[lllllIIlIl[1]]);
                bs = lllllIIlIl[1];
            }
        }
        if (llIlIIlIllllI(bs ? 1 : 0)) {
            if (llIlIIlIllllI(aa() ? 1 : 0) && llIlIIlIlllIl(C0004e.j(gZ), lllllIIlIl[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIIlIlllll(nearest) && llIlIIlIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[0]];
                    C0000a.a(nearest);
                }
                if (llIlIIlIlllll(nearest) && llIlIIlIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlIIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllllIIlIl[2]);
                        "".length();
                    }
                    if (llIlIIlIlllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[3]];
                        if (llIlIIllIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllllIIlIl[4]);
                            "".length();
                        }
                        if (llIlIIllIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllllIIlIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lllllIIlIl[4]];
                        iArr[lllllIIlIl[1]] = lllllIIlIl[5];
                        iArr[lllllIIlIl[0]] = lllllIIlIl[6];
                        iArr[lllllIIlIl[3]] = lllllIIlIl[7];
                        iArr[lllllIIlIl[8]] = lllllIIlIl[9];
                        if (llIlIIlIllllI(C0004e.b(iArr) ? 1 : 0)) {
                            ae();
                            System.out.println(lllllIIIll[lllllIIlIl[8]]);
                            bs = lllllIIlIl[0];
                            return;
                        }
                        int[] iArr2 = new int[lllllIIlIl[4]];
                        iArr2[lllllIIlIl[1]] = lllllIIlIl[5];
                        iArr2[lllllIIlIl[0]] = lllllIIlIl[6];
                        iArr2[lllllIIlIl[3]] = lllllIIlIl[7];
                        iArr2[lllllIIlIl[8]] = lllllIIlIl[9];
                        if (llIlIIlIlllII(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lllllIIlIl[5], lllllIIlIl[10]);
                            C0000a.a(lllllIIlIl[6], lllllIIlIl[10]);
                            C0000a.a(lllllIIlIl[7], lllllIIlIl[0]);
                            C0000a.a(lllllIIlIl[11], lllllIIlIl[0]);
                            C0000a.a(lllllIIlIl[9], lllllIIlIl[0]);
                            C0000a.a(lllllIIlIl[12], lllllIIlIl[0]);
                            C0000a.a(lllllIIlIl[13], lllllIIlIl[14]);
                        }
                    }
                }
            }
            if (llIlIIlIlllII(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlIIlIlllIl(Movement.getRunEnergy(), lllllIIlIl[15])) {
                Inventory.getFirst(C0005f.aU).interact(lllllIIIll[lllllIIlIl[4]]);
                Time.sleepTicks(lllllIIlIl[0]);
                "".length();
            }
            int[] iArr3 = new int[lllllIIlIl[0]];
            iArr3[lllllIIlIl[1]] = lllllIIlIl[13];
            if (llIlIIlIlllII(Inventory.contains(iArr3) ? 1 : 0) && llIlIIllIIIIl(llIlIIlIllIll(C0004e.u(), 50.0d))) {
                int[] iArr4 = new int[lllllIIlIl[0]];
                iArr4[lllllIIlIl[1]] = lllllIIlIl[13];
                Inventory.getFirst(iArr4).interact(lllllIIIll[lllllIIlIl[14]]);
                Time.sleepTicks(lllllIIlIl[3]);
                "".length();
            }
            if (llIlIIlIlllII(aa() ? 1 : 0) && llIlIIlIllllI(C0004e.j(gZ))) {
                if (llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gf), lllllIIlIl[16])) {
                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[17]];
                    Movement.walkTo(gf);
                    "".length();
                    Time.sleepTicks(lllllIIlIl[0]);
                    "".length();
                }
                if (llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gf), lllllIIlIl[16])) {
                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[18]];
                    if (llIlIIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0006g.a(lllllIIIll[lllllIIlIl[16]], bQ);
                }
            }
            if (llIlIIllIIlII(C0004e.j(gZ), lllllIIlIl[0])) {
                ck = lllllIIlIl[1];
                int[] iArr5 = new int[lllllIIlIl[0]];
                iArr5[lllllIIlIl[1]] = lllllIIlIl[11];
                if (llIlIIlIllllI(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllllIIlIl[0]];
                    iArr6[lllllIIlIl[1]] = lllllIIlIl[19];
                    if (llIlIIlIllllI(Inventory.contains(iArr6) ? 1 : 0)) {
                        String[] strArr = new String[lllllIIlIl[0]];
                        strArr[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[20]];
                        if (llIlIIlIllllI(Inventory.contains(strArr) ? 1 : 0)) {
                            WorldPoint worldPoint = new WorldPoint(lllllIIlIl[21], lllllIIlIl[22], lllllIIlIl[0]);
                            int[] iArr7 = new int[lllllIIlIl[0]];
                            iArr7[lllllIIlIl[1]] = lllllIIlIl[11];
                            if (llIlIIlIllllI(Inventory.contains(iArr7) ? 1 : 0)) {
                                if (llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllllIIlIl[14])) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[10]];
                                    Movement.walkTo(worldPoint);
                                    "".length();
                                    Time.sleepTicks(lllllIIlIl[0]);
                                    "".length();
                                }
                                if (llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllllIIlIl[14])) {
                                    int[] iArr8 = new int[lllllIIlIl[0]];
                                    iArr8[lllllIIlIl[1]] = lllllIIlIl[11];
                                    TileItem nearest2 = TileItems.getNearest(iArr8);
                                    if (llIlIIlIlllll(nearest2)) {
                                        if (llIlIIlIllllI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[23]];
                                            Movement.walkTo(nearest2.getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(lllllIIlIl[0]);
                                            "".length();
                                        }
                                        if (llIlIIlIlllII(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[24]];
                                            nearest2.interact(lllllIIIll[lllllIIlIl[25]]);
                                            Time.sleepTicks(lllllIIlIl[8]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lllllIIlIl[0]];
                iArr9[lllllIIlIl[1]] = lllllIIlIl[11];
                if (llIlIIlIllllI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllllIIlIl[0]];
                    iArr10[lllllIIlIl[1]] = lllllIIlIl[19];
                }
                int[] iArr11 = new int[lllllIIlIl[0]];
                iArr11[lllllIIlIl[1]] = lllllIIlIl[19];
                if (llIlIIlIllllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllllIIlIl[0]];
                    iArr12[lllllIIlIl[1]] = lllllIIlIl[11];
                    if (llIlIIlIlllII(Inventory.contains(iArr12) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[26]];
                        int[] iArr13 = new int[lllllIIlIl[0]];
                        iArr13[lllllIIlIl[1]] = lllllIIlIl[11];
                        Item first = Inventory.getFirst(iArr13);
                        int[] iArr14 = new int[lllllIIlIl[0]];
                        iArr14[lllllIIlIl[1]] = lllllIIlIl[9];
                        first.useOn(Inventory.getFirst(iArr14));
                        Time.sleepTicks(lllllIIlIl[0]);
                        "".length();
                    }
                }
                int[] iArr15 = new int[lllllIIlIl[0]];
                iArr15[lllllIIlIl[1]] = lllllIIlIl[19];
                if (llIlIIlIlllII(Inventory.contains(iArr15) ? 1 : 0)) {
                    String[] strArr2 = new String[lllllIIlIl[0]];
                    strArr2[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[27]];
                    if (llIlIIlIllllI(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gV), lllllIIlIl[4])) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[28]];
                            Movement.walkTo(gV);
                            "".length();
                            Time.sleepTicks(lllllIIlIl[0]);
                            "".length();
                        }
                        if (llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gV), lllllIIlIl[4])) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[29]];
                            String[] strArr3 = new String[lllllIIlIl[0]];
                            strArr3[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[30]];
                            TileObjects.getNearest(strArr3).interact(lllllIIIll[lllllIIlIl[31]]);
                            Time.sleepTicks(lllllIIlIl[20]);
                            "".length();
                        }
                    }
                    String[] strArr4 = new String[lllllIIlIl[0]];
                    strArr4[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[32]];
                    if (llIlIIlIlllII(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gW), lllllIIlIl[8])) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[33]];
                            Movement.walkTo(gW);
                            "".length();
                            Time.sleepTicks(lllllIIlIl[0]);
                            "".length();
                        }
                        if (llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gW), lllllIIlIl[8])) {
                            int[] iArr16 = new int[lllllIIlIl[0]];
                            iArr16[lllllIIlIl[1]] = lllllIIlIl[19];
                            Item first2 = Inventory.getFirst(iArr16);
                            String[] strArr5 = new String[lllllIIlIl[0]];
                            strArr5[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[34]];
                            first2.useOn(TileObjects.getNearest(strArr5));
                            Time.sleepTicks(lllllIIlIl[0]);
                            "".length();
                        }
                    }
                }
                String[] strArr6 = new String[lllllIIlIl[0]];
                strArr6[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[35]];
                if (llIlIIlIlllII(Inventory.contains(strArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lllllIIlIl[0]];
                    iArr17[lllllIIlIl[1]] = lllllIIlIl[19];
                    if (llIlIIlIllllI(Inventory.contains(iArr17) ? 1 : 0)) {
                        String[] strArr7 = new String[lllllIIlIl[0]];
                        strArr7[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[36]];
                        if (llIlIIlIllllI(Inventory.contains(strArr7) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[37]];
                            if (llIlIIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr8 = new String[lllllIIlIl[0]];
                                strArr8[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[38]];
                                TileObjects.getNearest(strArr8).interact(lllllIIIll[lllllIIlIl[39]]);
                                Time.sleepTicks(lllllIIlIl[4]);
                                "".length();
                            }
                            C0006g.a(bQ);
                        }
                    }
                }
                String[] strArr9 = new String[lllllIIlIl[0]];
                strArr9[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[40]];
                if (llIlIIlIlllII(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[lllllIIlIl[0]];
                    strArr10[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[41]];
                    if (llIlIIlIlllII(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[lllllIIlIl[0]];
                        strArr11[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[42]];
                        if (llIlIIlIllllI(Inventory.contains(strArr11) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lllllIIlIl[43], lllllIIlIl[44], lllllIIlIl[1]);
                            WorldPoint worldPoint3 = new WorldPoint(lllllIIlIl[21], lllllIIlIl[44], lllllIIlIl[1]);
                            WorldArea worldArea = new WorldArea(lllllIIlIl[21], lllllIIlIl[45], lllllIIlIl[14], lllllIIlIl[8], lllllIIlIl[1]);
                            if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) && llIlIIlIllllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[46]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lllllIIlIl[0]);
                                "".length();
                            }
                            if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                String[] strArr12 = new String[lllllIIlIl[0]];
                                strArr12[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[47]];
                                TileObjects.getNearest(strArr12).interact(lllllIIIll[lllllIIlIl[48]]);
                                Time.sleepTicks(lllllIIlIl[3]);
                                "".length();
                            }
                            if (llIlIIlIlllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[49]];
                                String[] strArr13 = new String[lllllIIlIl[0]];
                                strArr13[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[50]];
                                TileItems.getNearest(strArr13).interact(lllllIIIll[lllllIIlIl[51]]);
                                Time.sleepTicks(lllllIIlIl[8]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr14 = new String[lllllIIlIl[0]];
                strArr14[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[52]];
                if (llIlIIlIlllII(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[lllllIIlIl[0]];
                    strArr15[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[53]];
                    if (llIlIIlIllllI(Inventory.contains(strArr15) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lllllIIlIl[21], lllllIIlIl[45], lllllIIlIl[14], lllllIIlIl[8], lllllIIlIl[1]);
                        WorldArea worldArea3 = new WorldArea(lllllIIlIl[54], lllllIIlIl[55], lllllIIlIl[18], lllllIIlIl[23], lllllIIlIl[1]);
                        if (llIlIIlIlllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr16 = new String[lllllIIlIl[0]];
                            strArr16[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[56]];
                            TileObjects.getNearest(strArr16).interact(lllllIIIll[lllllIIlIl[57]]);
                            Time.sleepTicks(lllllIIlIl[3]);
                            "".length();
                        }
                        if (llIlIIlIllllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIlIllllI(ha.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[58]];
                            Movement.walkTo(gX);
                            "".length();
                            Time.sleepTicks(lllllIIlIl[0]);
                            "".length();
                        }
                        if (llIlIIlIlllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr17 = new String[lllllIIlIl[0]];
                            strArr17[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[59]];
                            TileObjects.getNearest(strArr17).interact(lllllIIIll[lllllIIlIl[60]]);
                            Time.sleepTicks(lllllIIlIl[4]);
                            "".length();
                        }
                        if (llIlIIlIlllII(ha.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint4 = new WorldPoint(lllllIIlIl[21], lllllIIlIl[61], lllllIIlIl[1]);
                            WorldPoint worldPoint5 = new WorldPoint(lllllIIlIl[62], lllllIIlIl[63], lllllIIlIl[1]);
                            new WorldPoint(lllllIIlIl[64], lllllIIlIl[65], lllllIIlIl[1]);
                            new WorldPoint(lllllIIlIl[43], lllllIIlIl[66], lllllIIlIl[1]);
                            WorldPoint worldPoint6 = new WorldPoint(lllllIIlIl[67], lllllIIlIl[66], lllllIIlIl[1]);
                            WorldPoint worldPoint7 = new WorldPoint(lllllIIlIl[67], lllllIIlIl[66], lllllIIlIl[1]);
                            WorldArea worldArea4 = new WorldArea(lllllIIlIl[68], lllllIIlIl[69], lllllIIlIl[20], lllllIIlIl[23], lllllIIlIl[1]);
                            WorldArea worldArea5 = new WorldArea(lllllIIlIl[70], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[17], lllllIIlIl[1]);
                            WorldArea worldArea6 = new WorldArea(lllllIIlIl[72], lllllIIlIl[73], lllllIIlIl[32], lllllIIlIl[25], lllllIIlIl[1]);
                            if (llIlIIllIIlIl(Vars.getBit(lllllIIlIl[74]), lllllIIlIl[0]) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[75]))) {
                                if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[76]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lllllIIlIl[0]);
                                    "".length();
                                }
                                if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[77]];
                                    String[] strArr18 = new String[lllllIIlIl[0]];
                                    strArr18[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[78]];
                                    TileObjects.getNearest(strArr18).interact(lllllIIIll[lllllIIlIl[79]]);
                                    Time.sleepTicks(lllllIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (llIlIIllIIlII(Vars.getBit(lllllIIlIl[74]), lllllIIlIl[0]) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[80])) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[75]))) {
                                if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[81]];
                                    Movement.walkTo(worldPoint5);
                                    "".length();
                                    Time.sleepTicks(lllllIIlIl[0]);
                                    "".length();
                                }
                                if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[82]];
                                    String[] strArr19 = new String[lllllIIlIl[0]];
                                    strArr19[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[15]];
                                    TileObjects.getNearest(strArr19).interact(lllllIIIll[lllllIIlIl[83]]);
                                    Time.sleepTicks(lllllIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (llIlIIllIIlII(Vars.getBit(lllllIIlIl[74]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[80]), lllllIIlIl[0]) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[75]))) {
                                if (llIlIIlIllllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint8 = new WorldPoint(lllllIIlIl[21], lllllIIlIl[84], lllllIIlIl[1]);
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[85]];
                                        Movement.walkTo(worldPoint8);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        String[] strArr20 = new String[lllllIIlIl[0]];
                                        strArr20[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[86]];
                                        TileObjects.getNearest(strArr20).interact(lllllIIIll[lllllIIlIl[87]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (llIlIIlIlllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[88]];
                                    String[] strArr21 = new String[lllllIIlIl[0]];
                                    strArr21[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[89]];
                                    TileObjects.getNearest(strArr21).interact(lllllIIIll[lllllIIlIl[90]]);
                                    Time.sleepTicks(lllllIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (llIlIIllIIlII(Vars.getBit(lllllIIlIl[74]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[80]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[75]), lllllIIlIl[0])) {
                                if (llIlIIlIlllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint9 = new WorldPoint(lllllIIlIl[21], lllllIIlIl[91], lllllIIlIl[1]);
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[92]];
                                        Movement.walkTo(worldPoint9);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        String[] strArr22 = new String[lllllIIlIl[0]];
                                        strArr22[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[93]];
                                        TileObjects.getNearest(strArr22).interact(lllllIIIll[lllllIIlIl[94]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (llIlIIlIllllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[95]];
                                        Movement.walkTo(worldPoint5);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[96]];
                                        String[] strArr23 = new String[lllllIIlIl[0]];
                                        strArr23[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[97]];
                                        TileObjects.getNearest(strArr23).interact(lllllIIIll[lllllIIlIl[98]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (llIlIIllIIlII(Vars.getBit(lllllIIlIl[74]), lllllIIlIl[0]) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[80])) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[75]), lllllIIlIl[0])) {
                                if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[99]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lllllIIlIl[0]);
                                    "".length();
                                }
                                if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[100]];
                                    String[] strArr24 = new String[lllllIIlIl[0]];
                                    strArr24[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[101]];
                                    TileObjects.getNearest(strArr24).interact(lllllIIIll[lllllIIlIl[102]]);
                                    Time.sleepTicks(lllllIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (llIlIIlIllllI(Vars.getBit(lllllIIlIl[74])) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[80])) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[75]), lllllIIlIl[0]) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[103])) && llIlIIlIllllI(co() ? 1 : 0)) {
                                if (llIlIIlIllllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (llIlIIlIlllII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint10 = new WorldPoint(lllllIIlIl[104], lllllIIlIl[84], lllllIIlIl[1]);
                                        if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[105]];
                                            Movement.walkTo(worldPoint10);
                                            "".length();
                                            Time.sleepTicks(lllllIIlIl[0]);
                                            "".length();
                                        }
                                        if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            String[] strArr25 = new String[lllllIIlIl[0]];
                                            strArr25[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[106]];
                                            TileObjects.getNearest(strArr25).interact(lllllIIIll[lllllIIlIl[107]]);
                                            Time.sleepTicks(lllllIIlIl[8]);
                                            "".length();
                                        }
                                    }
                                    if (llIlIIlIlllII(new WorldArea(lllllIIlIl[72], lllllIIlIl[69], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIlIllllI(co() ? 1 : 0)) {
                                        WorldPoint worldPoint11 = new WorldPoint(lllllIIlIl[108], lllllIIlIl[109], lllllIIlIl[1]);
                                        if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[110]];
                                            Movement.walkTo(worldPoint11);
                                            "".length();
                                            Time.sleepTicks(lllllIIlIl[0]);
                                            "".length();
                                        }
                                        if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            String[] strArr26 = new String[lllllIIlIl[0]];
                                            strArr26[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[111]];
                                            TileObjects.getNearest(strArr26).interact(lllllIIIll[lllllIIlIl[112]]);
                                            Time.sleepTicks(lllllIIlIl[8]);
                                            "".length();
                                        }
                                    }
                                    if (llIlIIlIlllII(new WorldArea(lllllIIlIl[70], lllllIIlIl[69], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint12 = new WorldPoint(lllllIIlIl[67], lllllIIlIl[113], lllllIIlIl[1]);
                                        if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[114]];
                                            Movement.walkTo(worldPoint12);
                                            "".length();
                                            Time.sleepTicks(lllllIIlIl[0]);
                                            "".length();
                                        }
                                        if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            String[] strArr27 = new String[lllllIIlIl[0]];
                                            strArr27[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[115]];
                                            TileObjects.getNearest(strArr27).interact(lllllIIIll[lllllIIlIl[116]]);
                                            Time.sleepTicks(lllllIIlIl[8]);
                                            "".length();
                                        }
                                    }
                                }
                                if (llIlIIlIlllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIlIllllI(co() ? 1 : 0)) {
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[117]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[118]];
                                        String[] strArr28 = new String[lllllIIlIl[0]];
                                        strArr28[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[119]];
                                        TileObjects.getNearest(strArr28).interact(lllllIIIll[lllllIIlIl[120]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (llIlIIlIllllI(Vars.getBit(lllllIIlIl[74])) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[80])) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[75]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[103]), lllllIIlIl[0]) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[121]))) {
                                if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[122]];
                                    Movement.walkTo(worldPoint7);
                                    "".length();
                                    Time.sleepTicks(lllllIIlIl[0]);
                                    "".length();
                                }
                                if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[123]];
                                    String[] strArr29 = new String[lllllIIlIl[0]];
                                    strArr29[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[124]];
                                    TileObjects.getNearest(strArr29).interact(lllllIIIll[lllllIIlIl[125]]);
                                    Time.sleepTicks(lllllIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (llIlIIlIllllI(Vars.getBit(lllllIIlIl[74])) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[80])) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[75]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[103]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[121]), lllllIIlIl[0]) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[126]))) {
                                WorldArea worldArea7 = new WorldArea(lllllIIlIl[72], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]);
                                if (llIlIIlIlllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint13 = new WorldPoint(lllllIIlIl[127], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[128]];
                                        Movement.walkTo(worldPoint13);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        String[] strArr30 = new String[lllllIIlIl[0]];
                                        strArr30[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[129]];
                                        TileObjects.getNearest(strArr30).interact(lllllIIIll[lllllIIlIl[130]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (llIlIIlIlllII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint14 = new WorldPoint(lllllIIlIl[131], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[132]];
                                        Movement.walkTo(worldPoint14);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        String[] strArr31 = new String[lllllIIlIl[0]];
                                        strArr31[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[133]];
                                        TileObjects.getNearest(strArr31).interact(lllllIIIll[lllllIIlIl[134]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (llIlIIlIlllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[135]];
                                    String[] strArr32 = new String[lllllIIlIl[0]];
                                    strArr32[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[136]];
                                    TileObjects.getNearest(strArr32).interact(lllllIIIll[lllllIIlIl[137]]);
                                    Time.sleepTicks(lllllIIlIl[16]);
                                    "".length();
                                }
                            }
                            if (llIlIIlIllllI(Vars.getBit(lllllIIlIl[74])) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[80])) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[75]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[103]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[121]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[126]), lllllIIlIl[0])) {
                                WorldArea worldArea8 = new WorldArea(lllllIIlIl[72], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]);
                                if (llIlIIlIlllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint15 = new WorldPoint(lllllIIlIl[138], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[139]];
                                        Movement.walkTo(worldPoint15);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        String[] strArr33 = new String[lllllIIlIl[0]];
                                        strArr33[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[140]];
                                        TileObjects.getNearest(strArr33).interact(lllllIIIll[lllllIIlIl[141]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (llIlIIlIlllII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint16 = new WorldPoint(lllllIIlIl[108], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[142]];
                                        Movement.walkTo(worldPoint16);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        String[] strArr34 = new String[lllllIIlIl[0]];
                                        strArr34[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[143]];
                                        TileObjects.getNearest(strArr34).interact(lllllIIIll[lllllIIlIl[144]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (llIlIIlIlllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[145]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[146]];
                                        String[] strArr35 = new String[lllllIIlIl[0]];
                                        strArr35[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[147]];
                                        TileObjects.getNearest(strArr35).interact(lllllIIIll[lllllIIlIl[148]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (llIlIIlIllllI(Vars.getBit(lllllIIlIl[74])) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[80])) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[75]), lllllIIlIl[0]) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[103])) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[121]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[126]), lllllIIlIl[0])) {
                                WorldArea worldArea9 = new WorldArea(lllllIIlIl[72], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]);
                                if (llIlIIlIlllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint17 = new WorldPoint(lllllIIlIl[127], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[149]];
                                        Movement.walkTo(worldPoint17);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        String[] strArr36 = new String[lllllIIlIl[0]];
                                        strArr36[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[150]];
                                        TileObjects.getNearest(strArr36).interact(lllllIIIll[lllllIIlIl[151]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (llIlIIlIlllII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint18 = new WorldPoint(lllllIIlIl[104], lllllIIlIl[152], lllllIIlIl[1]);
                                    if (llIlIIlIllllI(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[153]];
                                        Movement.walkTo(worldPoint18);
                                        "".length();
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                    }
                                    if (llIlIIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        Time.sleepTicks(lllllIIlIl[0]);
                                        "".length();
                                        String[] strArr37 = new String[lllllIIlIl[0]];
                                        strArr37[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[154]];
                                        TileObjects.getNearest(strArr37).interact(lllllIIIll[lllllIIlIl[155]]);
                                        Time.sleepTicks(lllllIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (llIlIIlIlllII(new WorldArea(lllllIIlIl[72], lllllIIlIl[69], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIlIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[156]];
                                    Time.sleepTicks(lllllIIlIl[0]);
                                    "".length();
                                    int[] iArr18 = new int[lllllIIlIl[0]];
                                    iArr18[lllllIIlIl[1]] = lllllIIlIl[157];
                                    TileObjects.getNearest(iArr18).interact(lllllIIIll[lllllIIlIl[158]]);
                                    Time.sleepTicks(lllllIIlIl[8]);
                                    "".length();
                                }
                                if (llIlIIlIlllII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] iArr19 = new int[lllllIIlIl[0]];
                                    iArr19[lllllIIlIl[1]] = lllllIIlIl[159];
                                    TileObjects.getNearest(iArr19).interact(lllllIIIll[lllllIIlIl[160]]);
                                    Time.sleepTicks(lllllIIlIl[8]);
                                    "".length();
                                }
                                if (llIlIIlIlllII(new WorldArea(lllllIIlIl[161], lllllIIlIl[162], lllllIIlIl[23], lllllIIlIl[14], lllllIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr38 = new String[lllllIIlIl[0]];
                                    strArr38[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[163]];
                                    if (llIlIIlIllllI(Inventory.contains(strArr38) ? 1 : 0)) {
                                        String[] strArr39 = new String[lllllIIlIl[0]];
                                        strArr39[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[164]];
                                        TileItems.getNearest(strArr39).interact(lllllIIIll[lllllIIlIl[165]]);
                                        Time.sleepTicks(lllllIIlIl[14]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr40 = new String[lllllIIlIl[0]];
                strArr40[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[166]];
                if (llIlIIlIlllII(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[lllllIIlIl[0]];
                    strArr41[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[167]];
                    if (llIlIIlIlllII(Inventory.contains(strArr41) ? 1 : 0)) {
                        if (llIlIIlIlllII(new WorldArea(lllllIIlIl[161], lllllIIlIl[162], lllllIIlIl[23], lllllIIlIl[14], lllllIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lllllIIlIl[0]];
                            iArr20[lllllIIlIl[1]] = lllllIIlIl[159];
                            TileObjects.getNearest(iArr20).interact(lllllIIIll[lllllIIlIl[168]]);
                            Time.sleepTicks(lllllIIlIl[14]);
                            "".length();
                        }
                        if (llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[169]];
                            Movement.walkTo(gY);
                            "".length();
                            Time.sleepTicks(lllllIIlIl[0]);
                            "".length();
                        }
                        if (llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject -> {
                                if (llIlIIlIlllII(tileObject.getName().contains(lllllIIIll[lllllIIlIl[185]]) ? 1 : 0)) {
                                    String[] strArr42 = new String[lllllIIlIl[0]];
                                    strArr42[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[186]];
                                    if (llIlIIlIlllII(tileObject.hasAction(strArr42) ? 1 : 0) && llIlIIllIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllIIlIl[21], lllllIIlIl[184], lllllIIlIl[3])), lllllIIlIl[3])) {
                                        ?? r0 = lllllIIlIl[0];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                                return lllllIIlIl[1];
                            });
                            if (llIlIIlIlllll(nearest3)) {
                                nearest3.interact(lllllIIIll[lllllIIlIl[170]]);
                                Time.sleepTicks(lllllIIlIl[8]);
                                "".length();
                            }
                            if (llIlIIllIIllI(nearest3)) {
                                C0006g.a(lllllIIIll[lllllIIlIl[171]], bQ, lllllIIlIl[0]);
                            }
                        }
                    }
                }
            }
            if (llIlIIllIIlII(C0004e.j(gZ), lllllIIlIl[3])) {
                if (llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[172]];
                    Movement.walkTo(gY);
                    "".length();
                    Time.sleepTicks(lllllIIlIl[0]);
                    "".length();
                }
                if (llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                    TileObject nearest4 = TileObjects.getNearest(tileObject2 -> {
                        if (llIlIIlIlllII(tileObject2.getName().contains(lllllIIIll[lllllIIlIl[182]]) ? 1 : 0)) {
                            String[] strArr42 = new String[lllllIIlIl[0]];
                            strArr42[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[183]];
                            if (llIlIIlIlllII(tileObject2.hasAction(strArr42) ? 1 : 0) && llIlIIllIIIll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lllllIIlIl[21], lllllIIlIl[184], lllllIIlIl[3])), lllllIIlIl[3])) {
                                ?? r0 = lllllIIlIl[0];
                                "".length();
                                return "   ".length() >= ((((22 + 132) - 121) + 100) ^ (((24 + 16) - (-72)) + 17)) ? ((0 ^ 94) ^ (46 ^ 78)) & (((17 ^ 118) ^ (13 ^ 84)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lllllIIlIl[1];
                    });
                    if (llIlIIlIlllll(nearest4)) {
                        nearest4.interact(lllllIIIll[lllllIIlIl[173]]);
                        Time.sleepTicks(lllllIIlIl[8]);
                        "".length();
                    }
                    if (llIlIIllIIllI(nearest4)) {
                        if (llIlIIlIlllIl(ck, lllllIIlIl[0])) {
                            ac.mW += lllllIIlIl[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllllIIlIl[0];
                            ac.mW = lllllIIlIl[1];
                            cl = lllllIIlIl[1];
                        }
                        C0006g.a(lllllIIIll[lllllIIlIl[174]], bQ, lllllIIlIl[0]);
                    }
                }
            }
            C0006g.a(bQ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01b2, code lost:
        if (llIlIIlIlllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.E.lllllIIlIl[14]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2 = new int[lllllIIlIl[0]];
        iArr2[lllllIIlIl[1]] = lllllIIlIl[6];
        if (llIlIIlIllllI(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(lllllIIlIl[6], lllllIIlIl[10], lllllIIlIl[175]));
            "".length();
        }
        int[] iArr3 = new int[lllllIIlIl[0]];
        iArr3[lllllIIlIl[1]] = lllllIIlIl[7];
        if (llIlIIlIllllI(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lllllIIlIl[7], lllllIIlIl[0], lllllIIlIl[175]));
            "".length();
        }
        int[] iArr4 = new int[lllllIIlIl[0]];
        iArr4[lllllIIlIl[1]] = lllllIIlIl[9];
        if (llIlIIlIllllI(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lllllIIlIl[9], lllllIIlIl[0], lllllIIlIl[175]));
            "".length();
        }
        if (llIlIIlIllllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllllIIIll[lllllIIlIl[181]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(lllllIIlIl[176], lllllIIlIl[14], lllllIIlIl[177]));
            "".length();
        }
        int[] iArr5 = new int[lllllIIlIl[0]];
        iArr5[lllllIIlIl[1]] = lllllIIlIl[12];
        if (llIlIIlIllllI(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(lllllIIlIl[12], lllllIIlIl[4], C0008i.bp));
            "".length();
        }
        int[] iArr6 = new int[lllllIIlIl[0]];
        iArr6[lllllIIlIl[1]] = lllllIIlIl[13];
        if (llIlIIlIlllII(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lllllIIlIl[0]];
            iArr7[lllllIIlIl[1]] = lllllIIlIl[13];
            if (llIlIIlIlllII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllllIIlIl[0]];
                iArr8[lllllIIlIl[1]] = lllllIIlIl[13];
            }
            iArr = new int[lllllIIlIl[0]];
            iArr[lllllIIlIl[1]] = lllllIIlIl[5];
            if (llIlIIlIlllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr9 = new int[lllllIIlIl[0]];
                iArr9[lllllIIlIl[1]] = lllllIIlIl[5];
                if (!llIlIIlIlllII(Bank.contains(iArr9) ? 1 : 0)) {
                    return;
                }
                int[] iArr10 = new int[lllllIIlIl[0]];
                iArr10[lllllIIlIl[1]] = lllllIIlIl[5];
                if (!llIlIIlIlllIl(Bank.getFirst(iArr10).getQuantity(), lllllIIlIl[27])) {
                    return;
                }
            }
            bu.add(new C0003d(lllllIIlIl[5], lllllIIlIl[57], lllllIIlIl[179]));
            "".length();
        }
        bu.add(new C0003d(lllllIIlIl[13], lllllIIlIl[10], lllllIIlIl[178]));
        "".length();
        iArr = new int[lllllIIlIl[0]];
        iArr[lllllIIlIl[1]] = lllllIIlIl[5];
        if (llIlIIlIlllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bu.add(new C0003d(lllllIIlIl[5], lllllIIlIl[57], lllllIIlIl[179]));
        "".length();
    }

    private static boolean llIlIIllIIllI(Object obj) {
        return obj == null;
    }

    private static String llIlIIlIIlIIl(String lllllllllllllllllIlIIllIIlIIlllI, String lllllllllllllllllIlIIllIIlIIllIl) {
        String lllllllllllllllllIlIIllIIlIIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIllIIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIllIIlIIllII = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIllIIlIIllIl.toCharArray();
        int lllllllllllllllllIlIIllIIlIIlIlI = lllllIIlIl[1];
        char[] charArray2 = lllllllllllllllllIlIIllIIlIIlllI2.toCharArray();
        int length = charArray2.length;
        int i = lllllIIlIl[1];
        while (llIlIIlIlllIl(i, length)) {
            char lllllllllllllllllIlIIllIIlIIllll = charArray2[i];
            lllllllllllllllllIlIIllIIlIIllII.append((char) (lllllllllllllllllIlIIllIIlIIllll ^ charArray[lllllllllllllllllIlIIllIIlIIlIlI % charArray.length]));
            "".length();
            lllllllllllllllllIlIIllIIlIIlIlI++;
            i++;
            "".length();
            if (((197 ^ 165) ^ (44 ^ 72)) <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIIllIIlIIllII);
    }

    static {
        llIlIIlIllIlI();
        llIlIIlIIllIl();
        bu = new ArrayList();
        gf = new WorldPoint(lllllIIlIl[64], lllllIIlIl[187], lllllIIlIl[1]);
        gV = new WorldPoint(lllllIIlIl[188], lllllIIlIl[189], lllllIIlIl[1]);
        gW = new WorldPoint(lllllIIlIl[161], lllllIIlIl[190], lllllIIlIl[1]);
        gX = new WorldPoint(lllllIIlIl[191], lllllIIlIl[192], lllllIIlIl[1]);
        gY = new WorldPoint(lllllIIlIl[64], lllllIIlIl[45], lllllIIlIl[3]);
        gZ = lllllIIlIl[47];
        String[] strArr = new String[lllllIIlIl[8]];
        strArr[lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[193]];
        strArr[lllllIIlIl[0]] = lllllIIIll[lllllIIlIl[194]];
        strArr[lllllIIlIl[3]] = lllllIIIll[lllllIIlIl[195]];
        bQ = strArr;
        ha = new WorldArea(lllllIIlIl[188], lllllIIlIl[196], lllllIIlIl[50], lllllIIlIl[40], lllllIIlIl[1]);
    }

    private static boolean llIlIIllIIIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIIllIIlll(C0004e.j(lllllIIlIl[47]), lllllIIlIl[8])) {
            ?? r0 = lllllIIlIl[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllllIIlIl[1];
    }

    private static void llIlIIlIllIlI() {
        lllllIIlIl = new int[198];
        lllllIIlIl[0] = " ".length();
        lllllIIlIl[1] = (37 ^ 40) & ((167 ^ 170) ^ (-1));
        lllllIIlIl[2] = (-((-24073) & 32281)) & (-2082) & 15289;
        lllllIIlIl[3] = "  ".length();
        lllllIIlIl[4] = 66 ^ 70;
        lllllIIlIl[5] = (-((-21651) & 29883)) & (-1) & 16239;
        lllllIIlIl[6] = (-12353) & 31967;
        lllllIIlIl[7] = (-12358) & 13309;
        lllllIIlIl[8] = "   ".length();
        lllllIIlIl[9] = (-32333) & 32605;
        lllllIIlIl[10] = (((157 + 82) - 140) + 79) ^ (((106 + 41) - 95) + 132);
        lllllIIlIl[11] = (-12909) & 13180;
        lllllIIlIl[12] = (-17959) & 30583;
        lllllIIlIl[13] = (-((-22985) & 32713)) & (-20485) & 30591;
        lllllIIlIl[14] = 73 ^ 76;
        lllllIIlIl[15] = (((83 + 91) - 34) + 26) ^ (((25 + 5) - 6) + 124);
        lllllIIlIl[16] = (((25 + 144) - 85) + 80) ^ (((86 + 29) - (-40)) + 17);
        lllllIIlIl[17] = 78 ^ 72;
        lllllIIlIl[18] = 8 ^ 15;
        lllllIIlIl[19] = (-((-3158) & 11999)) & (-1125) & 10239;
        lllllIIlIl[20] = (135 ^ 154) ^ (150 ^ 130);
        lllllIIlIl[21] = (-((-2179) & 14747)) & (-67) & 15742;
        lllllIIlIl[22] = (-((-1045) & 5879)) & (-1) & 8191;
        lllllIIlIl[23] = (75 ^ 121) ^ (179 ^ 138);
        lllllIIlIl[24] = ((219 ^ 153) & ((234 ^ 168) ^ (-1))) ^ (69 ^ 73);
        lllllIIlIl[25] = (32 ^ 53) ^ (106 ^ 114);
        lllllIIlIl[26] = (90 ^ 69) ^ (16 ^ 1);
        lllllIIlIl[27] = 55 ^ 56;
        lllllIIlIl[28] = 115 ^ 99;
        lllllIIlIl[29] = 31 ^ 14;
        lllllIIlIl[30] = (((38 + 111) - 41) + 28) ^ (((19 + 108) - 15) + 42);
        lllllIIlIl[31] = (((77 + 52) - 57) + 61) ^ (((108 + 54) - 58) + 46);
        lllllIIlIl[32] = (221 ^ 171) ^ (35 ^ 65);
        lllllIIlIl[33] = (127 ^ 94) ^ (55 ^ 3);
        lllllIIlIl[34] = (42 ^ 58) ^ (167 ^ 161);
        lllllIIlIl[35] = 31 ^ 8;
        lllllIIlIl[36] = (((153 + 38) - 72) + 104) ^ (((197 + 162) - 212) + 52);
        lllllIIlIl[37] = (((145 + 0) - 0) + 40) ^ (((144 + 67) - 125) + 74);
        lllllIIlIl[38] = 219 ^ 193;
        lllllIIlIl[39] = 158 ^ 133;
        lllllIIlIl[40] = (60 ^ 48) ^ (19 ^ 3);
        lllllIIlIl[41] = 95 ^ 66;
        lllllIIlIl[42] = (((56 + 64) - 28) + 59) ^ (((40 + 73) - 23) + 47);
        lllllIIlIl[43] = (-((-15555) & 32731)) & (-8197) & 28479;
        lllllIIlIl[44] = (-12417) & 15783;
        lllllIIlIl[45] = (-((-2825) & 6938)) & (-8265) & 15743;
        lllllIIlIl[46] = 174 ^ 177;
        lllllIIlIl[47] = (67 ^ 123) ^ (13 ^ 21);
        lllllIIlIl[48] = (((64 + 153) - 52) + 63) ^ (((77 + 182) - 100) + 38);
        lllllIIlIl[49] = 92 ^ 126;
        lllllIIlIl[50] = 52 ^ 23;
        lllllIIlIl[51] = (50 ^ 46) ^ (67 ^ 123);
        lllllIIlIl[52] = 163 ^ 134;
        lllllIIlIl[53] = (((207 + 139) - 141) + 25) ^ (((43 + 168) - 27) + 8);
        lllllIIlIl[54] = (-29385) & 32474;
        lllllIIlIl[55] = (-4613) & 7965;
        lllllIIlIl[56] = (((30 + 69) - 12) + 41) ^ (((102 + 116) - 200) + 149);
        lllllIIlIl[57] = (189 ^ 192) ^ (238 ^ 187);
        lllllIIlIl[58] = 172 ^ 133;
        lllllIIlIl[59] = (120 ^ 54) ^ (192 ^ 164);
        lllllIIlIl[60] = (((116 + 77) - 180) + 129) ^ (((107 + 12) - 19) + 65);
        lllllIIlIl[61] = (-20517) & 30262;
        lllllIIlIl[62] = (-((-866) & 29685)) & (-321) & 32255;
        lllllIIlIl[63] = (-((-24630) & 30973)) & (-257) & 16351;
        lllllIIlIl[64] = (-29649) & 32758;
        lllllIIlIl[65] = (-16735) & 26495;
        lllllIIlIl[66] = (-((-22161) & 24539)) & (-20497) & 32639;
        lllllIIlIl[67] = (-((-6169) & 23487)) & (-4161) & 24575;
        lllllIIlIl[68] = (-20895) & 23999;
        lllllIIlIl[69] = (-2177) & 11934;
        lllllIIlIl[70] = (-4193) & 7287;
        lllllIIlIl[71] = (-((-19) & 2451)) & (-85) & 12279;
        lllllIIlIl[72] = (-((-13373) & 30206)) & (-12321) & 32253;
        lllllIIlIl[73] = (-22889) & 32633;
        lllllIIlIl[74] = (-((-21538) & 31779)) & (-4099) & 16127;
        lllllIIlIl[75] = (-24577) & 26367;
        lllllIIlIl[76] = 58 ^ 22;
        lllllIIlIl[77] = 92 ^ 113;
        lllllIIlIl[78] = 150 ^ 184;
        lllllIIlIl[79] = (79 ^ 8) ^ (55 ^ 95);
        lllllIIlIl[80] = (-((-7249) & 32083)) & (-2049) & 28671;
        lllllIIlIl[81] = (57 ^ 113) ^ (252 ^ 132);
        lllllIIlIl[82] = (173 ^ 194) ^ (225 ^ 191);
        lllllIIlIl[83] = (188 ^ 139) ^ (90 ^ 94);
        lllllIIlIl[84] = (-6275) & 16031;
        lllllIIlIl[85] = (((145 + 114) - 230) + 125) ^ (((171 + 76) - 213) + 140);
        lllllIIlIl[86] = 85 ^ 96;
        lllllIIlIl[87] = (8 ^ 41) ^ (153 ^ 142);
        lllllIIlIl[88] = 77 ^ 122;
        lllllIIlIl[89] = (73 ^ 76) ^ (104 ^ 85);
        lllllIIlIl[90] = 150 ^ 175;
        lllllIIlIl[91] = (-225) & 9983;
        lllllIIlIl[92] = 114 ^ 72;
        lllllIIlIl[93] = (3 ^ 10) ^ (165 ^ 151);
        lllllIIlIl[94] = 7 ^ 59;
        lllllIIlIl[95] = (((122 + 85) - 106) + 37) ^ (((109 + 145) - 142) + 71);
        lllllIIlIl[96] = 17 ^ 47;
        lllllIIlIl[97] = 55 ^ 8;
        lllllIIlIl[98] = (((39 + 65) - 9) + 160) ^ (((29 + 165) - 65) + 62);
        lllllIIlIl[99] = (116 ^ 77) ^ (197 ^ 189);
        lllllIIlIl[100] = (128 ^ 168) ^ (62 ^ 84);
        lllllIIlIl[101] = (216 ^ 151) ^ (163 ^ 175);
        lllllIIlIl[102] = (139 ^ 162) ^ (74 ^ 39);
        lllllIIlIl[103] = (-30860) & 32651;
        lllllIIlIl[104] = (-((-7419) & 7675)) & (-29282) & 32639;
        lllllIIlIl[105] = 229 ^ 160;
        lllllIIlIl[106] = (15 ^ 44) ^ (43 ^ 78);
        lllllIIlIl[107] = (13 ^ 36) ^ (76 ^ 34);
        lllllIIlIl[108] = (-((-3085) & 24527)) & (-8193) & 32735;
        lllllIIlIl[109] = (-20572) & 30331;
        lllllIIlIl[110] = 55 ^ 127;
        lllllIIlIl[111] = (6 ^ 23) ^ (26 ^ 66);
        lllllIIlIl[112] = (((133 + 110) - 230) + 186) ^ (((75 + 19) - (-35)) + 12);
        lllllIIlIl[113] = (-((-2061) & 6494)) & (-9) & 14203;
        lllllIIlIl[114] = 224 ^ 171;
        lllllIIlIl[115] = (51 ^ 91) ^ (34 ^ 6);
        lllllIIlIl[116] = 126 ^ 51;
        lllllIIlIl[117] = (79 ^ 117) ^ (178 ^ 198);
        lllllIIlIl[118] = 103 ^ 40;
        lllllIIlIl[119] = 110 ^ 62;
        lllllIIlIl[120] = (127 ^ 64) ^ (174 ^ 192);
        lllllIIlIl[121] = (-((-1921) & 4079)) & (-16529) & 20479;
        lllllIIlIl[122] = (13 ^ 11) ^ (13 ^ 89);
        lllllIIlIl[123] = 23 ^ 68;
        lllllIIlIl[124] = (212 ^ 164) ^ (187 ^ 159);
        lllllIIlIl[125] = (((9 + 189) - 65) + 64) ^ (((40 + 105) - 65) + 64);
        lllllIIlIl[126] = (-((-469) & 27094)) & (-1) & 28415;
        lllllIIlIl[127] = (-((-3241) & 28397)) & (-4385) & 32639;
        lllllIIlIl[128] = 240 ^ 166;
        lllllIIlIl[129] = (110 ^ 40) ^ (21 ^ 4);
        lllllIIlIl[130] = 152 ^ 192;
        lllllIIlIl[131] = (-905) & 4008;
        lllllIIlIl[132] = (14 ^ 105) ^ (63 ^ 1);
        lllllIIlIl[133] = 22 ^ 76;
        lllllIIlIl[134] = 6 ^ 93;
        lllllIIlIl[135] = (((52 + 70) - (-8)) + 76) ^ (((21 + 119) - 125) + 131);
        lllllIIlIl[136] = (81 ^ 52) ^ (69 ^ 125);
        lllllIIlIl[137] = 16 ^ 78;
        lllllIIlIl[138] = (-((-18626) & 31695)) & (-1) & 16175;
        lllllIIlIl[139] = 115 ^ 44;
        lllllIIlIl[140] = 220 ^ 188;
        lllllIIlIl[141] = (((22 + 192) - 180) + 180) ^ (((103 + 101) - 99) + 78);
        lllllIIlIl[142] = 253 ^ 159;
        lllllIIlIl[143] = (((71 + 157) - 98) + 36) ^ (((136 + 136) - 270) + 195);
        lllllIIlIl[144] = (((227 + 148) - 227) + 89) ^ (((93 + 63) - 40) + 21);
        lllllIIlIl[145] = (89 ^ 48) ^ (38 ^ 42);
        lllllIIlIl[146] = 10 ^ 108;
        lllllIIlIl[147] = (21 ^ 56) ^ (103 ^ 45);
        lllllIIlIl[148] = (198 ^ 157) ^ (89 ^ 106);
        lllllIIlIl[149] = (68 ^ 102) ^ (143 ^ 196);
        lllllIIlIl[150] = (((187 + 193) - 257) + 76) ^ (((84 + 144) - 136) + 81);
        lllllIIlIl[151] = 116 ^ 31;
        lllllIIlIl[152] = (-20492) & 30255;
        lllllIIlIl[153] = 56 ^ 84;
        lllllIIlIl[154] = (((231 + 209) - 253) + 58) ^ (((92 + 47) - 49) + 62);
        lllllIIlIl[155] = (224 ^ 140) ^ "  ".length();
        lllllIIlIl[156] = (((83 + 113) - 96) + 143) ^ (((134 + 70) - 194) + 146);
        lllllIIlIl[157] = ((123 + 77) - 88) + 33;
        lllllIIlIl[158] = (((107 + 28) - 28) + 86) ^ (((69 + 93) - 135) + 150);
        lllllIIlIl[159] = ((20 + 137) - 23) + 7;
        lllllIIlIl[160] = 237 ^ 156;
        lllllIIlIl[161] = (-29199) & 32287;
        lllllIIlIl[162] = (-16775) & 26527;
        lllllIIlIl[163] = 114 ^ 0;
        lllllIIlIl[164] = (182 ^ 133) ^ (68 ^ 4);
        lllllIIlIl[165] = (56 ^ 36) ^ (97 ^ 9);
        lllllIIlIl[166] = 39 ^ 82;
        lllllIIlIl[167] = 243 ^ 133;
        lllllIIlIl[168] = (((45 + 94) - (-60)) + 35) ^ (((65 + 144) - 146) + 94);
        lllllIIlIl[169] = 20 ^ 108;
        lllllIIlIl[170] = 203 ^ 178;
        lllllIIlIl[171] = (((12 + 153) - (-32)) + 29) ^ (((84 + 118) - 152) + 102);
        lllllIIlIl[172] = 254 ^ 133;
        lllllIIlIl[173] = (((222 + 159) - 319) + 165) ^ (((151 + 31) - 170) + 147);
        lllllIIlIl[174] = 188 ^ 193;
        lllllIIlIl[175] = (-(96 ^ 84)) & (-16777) & 26047;
        lllllIIlIl[176] = (-((-20180) & 20439)) & (-4113) & 16351;
        lllllIIlIl[177] = (-1030) & 26029;
        lllllIIlIl[178] = (-((-3275) & 31950)) & (-1089) & 30063;
        lllllIIlIl[179] = (-2219) & 3518;
        lllllIIlIl[180] = 45 ^ 83;
        lllllIIlIl[181] = ((16 + 35) - 38) + 114;
        lllllIIlIl[182] = ((103 + 77) - 175) + 123;
        lllllIIlIl[183] = (((18 ^ 92) + (163 ^ 133)) - (76 ^ 2)) + (246 ^ 173);
        lllllIIlIl[184] = (-((-19969) & 28235)) & (-21121) & 32751;
        lllllIIlIl[185] = (((60 ^ 17) + ((124 ^ 52) & ((64 ^ 8) ^ (-1)))) - (78 ^ 80)) + (96 ^ 19);
        lllllIIlIl[186] = ((55 + 15) - 48) + 109;
        lllllIIlIl[187] = (-((-12545) & 29599)) & (-8289) & 28671;
        lllllIIlIl[188] = (-16417) & 19503;
        lllllIIlIl[189] = (-4745) & 8104;
        lllllIIlIl[190] = (-17079) & 20414;
        lllllIIlIl[191] = (-29313) & 32406;
        lllllIIlIl[192] = (-((-1297) & 26481)) & (-129) & 28671;
        lllllIIlIl[193] = ((32 + 119) - 55) + 36;
        lllllIIlIl[194] = ((44 + 118) - 136) + 107;
        lllllIIlIl[195] = ((71 + 89) - 109) + 83;
        lllllIIlIl[196] = (-22977) & 32719;
        lllllIIlIl[197] = (((46 ^ 23) + (114 ^ 90)) - (66 ^ 8)) + (81 ^ 33);
    }

    private static String llIlIIlIIlIll(String lllllllllllllllllIlIIllIIIlIllII, String lllllllllllllllllIlIIllIIIlIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIlIIllIIIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIllIIIlIlIll.getBytes(StandardCharsets.UTF_8)), lllllIIlIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIIlIl[3], lllllllllllllllllIlIIllIIIlIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIllIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIllIIIlIllIl) {
            lllllllllllllllllIlIIllIIIlIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIllllI(int i) {
        return i == 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            cn();
            "".length();
            if (!((true ^ true) ^ ((true ^ true) & ((true ^ true) ^ true)))) {
                return ((((118 + 105) - 207) + 149) ^ (((4 + 89) - 63) + 99)) & (((((108 + 215) - 182) + 86) ^ (((3 + 21) - 18) + 193)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return lllllIIlIl[144];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    static boolean co() {
        if (llIlIIlIllllI(Vars.getBit(lllllIIlIl[74])) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[80])) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[75]), lllllIIlIl[0]) && llIlIIlIllllI(Vars.getBit(lllllIIlIl[103])) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[121]), lllllIIlIl[0]) && llIlIIllIIlII(Vars.getBit(lllllIIlIl[126]), lllllIIlIl[0])) {
            ?? r0 = lllllIIlIl[0];
            "".length();
            return " ".length() == "  ".length() ? ((((123 + 115) - 69) + 81) ^ (((82 + 162) - 238) + 169)) & (((((122 + 137) - 233) + 169) ^ (((37 + 73) - 21) + 61)) ^ (-" ".length())) : r0;
        }
        return lllllIIlIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllllIIlIl[1];
    }

    private static boolean llIlIIllIIlIl(int i, int i2) {
        return i != i2;
    }

    private static int llIlIIlIllIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIlIIllIIIII(int i) {
        return i > 0;
    }

    private static boolean llIlIIlIlllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[lllllIIlIl[4]];
        iArr[lllllIIlIl[1]] = lllllIIlIl[5];
        iArr[lllllIIlIl[0]] = lllllIIlIl[6];
        iArr[lllllIIlIl[3]] = lllllIIlIl[7];
        iArr[lllllIIlIl[8]] = lllllIIlIl[9];
        int i = lllllIIlIl[1];
        while (llIlIIlIlllIl(i, iArr.length)) {
            int[] iArr2 = new int[lllllIIlIl[0]];
            iArr2[lllllIIlIl[1]] = iArr[i];
            if (llIlIIlIllllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllllIIlIl[1];
            }
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return "  ".length() & ("  ".length() ^ (-" ".length()));
            }
        }
        return lllllIIlIl[0];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllllIIIll[lllllIIlIl[180]];
    }
}
