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
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.y  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/y.class */
public class C0024y implements W {
    static /* synthetic */ boolean cm;
    static /* synthetic */ int cl;

    /* renamed from: do  reason: not valid java name */
    public static final /* synthetic */ WorldPoint f1do;
    public static final /* synthetic */ WorldPoint dr;
    public static /* synthetic */ boolean dt;
    private static /* synthetic */ String[] lIIlllIll;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ WorldPoint dn;
    static /* synthetic */ ArrayList<Integer> dw;
    public static final /* synthetic */ WorldPoint dl;
    public static /* synthetic */ int dv;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint dp;
    public static /* synthetic */ int du;
    private static /* synthetic */ int[] lIIlllllI;
    public static final /* synthetic */ WorldPoint dm;
    public static final /* synthetic */ WorldPoint ds;
    public static final /* synthetic */ WorldPoint dq;
    static /* synthetic */ String[] bR;

    static {
        lIIIIlIIlllI();
        lIIIIlIIlIlI();
        dl = new WorldPoint(lIIlllllI[149], lIIlllllI[150], lIIlllllI[1]);
        dm = new WorldPoint(lIIlllllI[151], lIIlllllI[152], lIIlllllI[1]);
        dn = new WorldPoint(lIIlllllI[25], lIIlllllI[153], lIIlllllI[1]);
        f1do = new WorldPoint(lIIlllllI[154], lIIlllllI[155], lIIlllllI[1]);
        dp = new WorldPoint(lIIlllllI[156], lIIlllllI[152], lIIlllllI[5]);
        dq = new WorldPoint(lIIlllllI[157], lIIlllllI[158], lIIlllllI[1]);
        dr = new WorldPoint(lIIlllllI[159], lIIlllllI[160], lIIlllllI[1]);
        ds = new WorldPoint(lIIlllllI[161], lIIlllllI[162], lIIlllllI[1]);
        bv = new ArrayList();
        du = lIIlllllI[163];
        dv = lIIlllllI[164];
        String[] strArr = new String[lIIlllllI[31]];
        strArr[lIIlllllI[1]] = lIIlllIll[lIIlllllI[165]];
        strArr[lIIlllllI[0]] = lIIlllIll[lIIlllllI[166]];
        strArr[lIIlllllI[5]] = lIIlllIll[lIIlllllI[167]];
        strArr[lIIlllllI[10]] = lIIlllIll[lIIlllllI[168]];
        strArr[lIIlllllI[6]] = lIIlllIll[lIIlllllI[169]];
        strArr[lIIlllllI[3]] = lIIlllIll[lIIlllllI[170]];
        strArr[lIIlllllI[16]] = lIIlllIll[lIIlllllI[171]];
        strArr[lIIlllllI[17]] = lIIlllIll[lIIlllllI[172]];
        strArr[lIIlllllI[18]] = lIIlllIll[lIIlllllI[173]];
        strArr[lIIlllllI[19]] = lIIlllIll[lIIlllllI[174]];
        strArr[lIIlllllI[13]] = lIIlllIll[lIIlllllI[175]];
        strArr[lIIlllllI[20]] = lIIlllIll[lIIlllllI[176]];
        strArr[lIIlllllI[21]] = lIIlllIll[lIIlllllI[177]];
        strArr[lIIlllllI[22]] = lIIlllIll[lIIlllllI[178]];
        strArr[lIIlllllI[23]] = lIIlllIll[lIIlllllI[179]];
        strArr[lIIlllllI[24]] = lIIlllIll[lIIlllllI[180]];
        strArr[lIIlllllI[27]] = lIIlllIll[lIIlllllI[181]];
        strArr[lIIlllllI[28]] = lIIlllIll[lIIlllllI[182]];
        strArr[lIIlllllI[29]] = lIIlllIll[lIIlllllI[183]];
        strArr[lIIlllllI[30]] = lIIlllIll[lIIlllllI[184]];
        bR = strArr;
        dw = new ArrayList<>();
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIlllIll[lIIlllllI[147]];
    }

    private static void lIIIIlIIlIlI() {
        lIIlllIll = new String[lIIlllllI[185]];
        lIIlllIll[lIIlllllI[1]] = lIIIIIlllIlI("CywGHgQlIAxXFTg8ARkQbSwcEho+aUgEACQxCx8eIyJIFRYuLkgDGG00HRIEOQ==", "MEhww");
        lIIlllIll[lIIlllllI[0]] = lIIIIIlllIll("BmHAkdc8jEhpdWSTKgM4Ew==", "iCNGm");
        lIIlllIll[lIIlllllI[5]] = lIIIIIllllII("f263DlpCTs/AyCMTEiyBtXOzlFkf8QxW", "sgJLv");
        lIIlllIll[lIIlllllI[10]] = lIIIIIlllIll("dA2Nwym6eVr3w9Z8Sca8aqAmEp34x9IU/Ll1NnLaJGAx+j6XEskEQqBW0fmWuFVCPa5P4gRcXqM=", "iznFt");
        lIIlllIll[lIIlllllI[6]] = lIIIIIlllIlI("DAUKDBE=", "Hwcbz");
        lIIlllIll[lIIlllllI[3]] = lIIIIIlllIll("7WlRqvp46Hk=", "Ccwwt");
        lIIlllIll[lIIlllllI[16]] = lIIIIIlllIll("ZB/P/Aby5h7e9xHrh0okwA==", "aykFv");
        lIIlllIll[lIIlllllI[17]] = lIIIIIlllIll("MBaKuw4gA8Po4hN8TSwjMA==", "vWeOm");
        lIIlllIll[lIIlllllI[18]] = lIIIIIllllII("ka0JFhtKGVwAyktn3Ot7yQ==", "Mbmnu");
        lIIlllIll[lIIlllllI[19]] = lIIIIIlllIlI("KDQ6RjcJdTgDLhY5KUYnCTo+", "fULfC");
        lIIlllIll[lIIlllllI[13]] = lIIIIIlllIll("QbdhD9xaY9UQWdDJgRfKcs3g/eqE2rLN", "TDKqv");
        lIIlllIll[lIIlllllI[20]] = lIIIIIllllII("jg7izyI8YcCzXXCtR7mWGg==", "SoNYD");
        lIIlllIll[lIIlllllI[21]] = lIIIIIlllIll("NfaaWTeyE5U=", "gcVmc");
        lIIlllIll[lIIlllllI[22]] = lIIIIIllllII("Uz2b/Fdv3f7SDZbQ93KXNg==", "rNivk");
        lIIlllIll[lIIlllllI[23]] = lIIIIIllllII("Qkd9fWnPWWtwSXkF6Z1vhA==", "qEIiw");
        lIIlllIll[lIIlllllI[24]] = lIIIIIlllIlI("LjERPjAVLAI=", "zCpNT");
        lIIlllIll[lIIlllllI[27]] = lIIIIIllllII("R+bTicQKGb83QNKyq2pBOQ==", "lgLoq");
        lIIlllIll[lIIlllllI[28]] = lIIIIIlllIll("++J7zV8pbVZkj7bPOEmTSQ==", "QkQDI");
        lIIlllIll[lIIlllllI[29]] = lIIIIIllllII("ykgEB0IDw3A=", "Ctefq");
        lIIlllIll[lIIlllllI[30]] = lIIIIIllllII("s/juM4qG8Vw=", "qoloe");
        lIIlllIll[lIIlllllI[31]] = lIIIIIllllII("c/eZ3E5ZuXtvllEmFHq4+w==", "uDYjY");
        lIIlllIll[lIIlllllI[32]] = lIIIIIlllIlI("Oj0OOSpUNQgjJg==", "yQgTH");
        lIIlllIll[lIIlllllI[33]] = lIIIIIllllII("6iabfqzBXqOdEyxRUSZYnQ==", "modwS");
        lIIlllIll[lIIlllllI[34]] = lIIIIIlllIll("nE1/EJZY6y0=", "cGpdE");
        lIIlllIll[lIIlllllI[35]] = lIIIIIlllIll("3yuKKwG880dlelVUgI/1aQ==", "mctTG");
        lIIlllIll[lIIlllllI[36]] = lIIIIIllllII("q8bjQ0pmBK8=", "TtGdF");
        lIIlllIll[lIIlllllI[37]] = lIIIIIlllIlI("KzwdMSsDPQc=", "fSsDF");
        lIIlllIll[lIIlllllI[38]] = lIIIIIllllII("f3ZblbkD0GE=", "mGxWn");
        lIIlllIll[lIIlllllI[39]] = lIIIIIllllII("JVbXyVxXdfSMHQ4JcoiuOM3Ni76AtciP", "jGHPD");
        lIIlllIll[lIIlllllI[40]] = lIIIIIlllIlI("ECYQLTE4KxAhLT5oACcsKw==", "YHdHC");
        lIIlllIll[lIIlllllI[41]] = lIIIIIlllIll("kE605NH6LLpwyMRe4TNDqg==", "zfvHi");
        lIIlllIll[lIIlllllI[42]] = lIIIIIlllIlI("GigKIA==", "UXoNp");
        lIIlllIll[lIIlllllI[43]] = lIIIIIlllIll("0B4DJ9qd3ty7JeZKb91IiA==", "BmPaB");
        lIIlllIll[lIIlllllI[44]] = lIIIIIlllIll("nHoRKrEJtOEr/mvTmLvynw==", "JRqRi");
        lIIlllIll[lIIlllllI[45]] = lIIIIIlllIll("tcF+OM/SGapHCE5WFSLONg==", "lDSMg");
        lIIlllIll[lIIlllllI[46]] = lIIIIIllllII("Gp1oohtOGEE54YC+bf/Lkw==", "oHfmN");
        lIIlllIll[lIIlllllI[47]] = lIIIIIllllII("XlC3jSo2BUvTgSRM1pIitw==", "RmiJA");
        lIIlllIll[lIIlllllI[48]] = lIIIIIlllIlI("OAUtIgUUGC0uGRZLPSgYAw==", "qkYGw");
        lIIlllIll[lIIlllllI[49]] = lIIIIIlllIlI("MCsrB1IXISgZ", "sNGkr");
        lIIlllIll[lIIlllllI[50]] = lIIIIIllllII("1t5jfM4EZ/I=", "rpRwb");
        lIIlllIll[lIIlllllI[51]] = lIIIIIllllII("JLBlv4pgxvq2QOM8R2vIfQ==", "lZpoZ");
        lIIlllIll[lIIlllllI[52]] = lIIIIIllllII("RAN1c/vUIZdWPDc+sYmpgQ==", "BFflJ");
        lIIlllIll[lIIlllllI[53]] = lIIIIIlllIll("/uiux7ax6HyXa7892aDyZfhR7gE6P3nK", "orHqC");
        lIIlllIll[lIIlllllI[55]] = lIIIIIlllIll("tjz4PNGtPis=", "qQGUz");
        lIIlllIll[lIIlllllI[56]] = lIIIIIllllII("V6QUpG+zOK0ET4FWVVOMHA==", "PaIgz");
        lIIlllIll[lIIlllllI[57]] = lIIIIIlllIlI("NzAf", "rQkjG");
        lIIlllIll[lIIlllllI[58]] = lIIIIIlllIll("Bm/ZdpUXUwQ=", "WwSSj");
        lIIlllIll[lIIlllllI[59]] = lIIIIIlllIlI("CCYPFTEhaQgULQ==", "OIcqT");
        lIIlllIll[lIIlllllI[60]] = lIIIIIllllII("BrA58KSdpXDKqvMWXv7kaQ==", "GKwMK");
        lIIlllIll[lIIlllllI[61]] = lIIIIIllllII("X4Fsvs5PNkZwDIYlGSqoWQ==", "aXafd");
        lIIlllIll[lIIlllllI[15]] = lIIIIIlllIlI("IgMXCVEAFAE=", "kqxgq");
        lIIlllIll[lIIlllllI[62]] = lIIIIIlllIll("rkvaZEI3lqFMrRqfl63ZQA==", "WkzYh");
        lIIlllIll[lIIlllllI[63]] = lIIIIIllllII("gg3q1Hg3yBEE59L1bTKGdA==", "zJPvk");
        lIIlllIll[lIIlllllI[64]] = lIIIIIlllIll("TnFmkL2oUUk=", "oOyTK");
        lIIlllIll[lIIlllllI[66]] = lIIIIIlllIll("pfFcliM1A7X7AE9EVHDPig==", "HOAmv");
        lIIlllIll[lIIlllllI[67]] = lIIIIIlllIlI("Jz4gGzBKPDMELBg=", "jKRpI");
        lIIlllIll[lIIlllllI[68]] = lIIIIIlllIlI("PzA+YSIecSIgPx0=", "qQHAV");
        lIIlllIll[lIIlllllI[69]] = lIIIIIlllIll("/MVpF9sXl0cfEtCRHpXTsmJ2WlXN1OIc", "SOdNA");
        lIIlllIll[lIIlllllI[70]] = lIIIIIlllIlI("Djk3IHAsLiE=", "GKXNP");
        lIIlllIll[lIIlllllI[71]] = lIIIIIlllIlI("LjUYDXQJPxsT", "mPtaT");
        lIIlllIll[lIIlllllI[72]] = lIIIIIllllII("xgEECPRwZA4=", "ZyfqN");
        lIIlllIll[lIIlllllI[73]] = lIIIIIlllIll("0Orc5SRCFGvfh+CnuGEMxQ==", "hAUCz");
        lIIlllIll[lIIlllllI[74]] = lIIIIIlllIll("RW2H5+4EmxWMQysnmbRbAA==", "ThPwu");
        lIIlllIll[lIIlllllI[75]] = lIIIIIllllII("KNYY4YR7ZWc=", "FGxcr");
        lIIlllIll[lIIlllllI[76]] = lIIIIIlllIll("K3UjOSZbroN5IpT3USlKAg==", "HqzMh");
        lIIlllIll[lIIlllllI[77]] = lIIIIIlllIll("QAerfHZa4GWejRYhqK1AUA==", "btysw");
        lIIlllIll[lIIlllllI[78]] = lIIIIIlllIll("Iqj5TKjjDOQ=", "cKvNk");
        lIIlllIll[lIIlllllI[79]] = lIIIIIllllII("UQkC90724Lld/stS5Wtxgw==", "vYfvf");
        lIIlllIll[lIIlllllI[80]] = lIIIIIllllII("zubkwNRERsE=", "DprBY");
        lIIlllIll[lIIlllllI[81]] = lIIIIIlllIlI("OAIOCzJNBgYRMB9RCAt1Dh4BAzwD", "mqgeU");
        lIIlllIll[lIIlllllI[82]] = lIIIIIlllIll("GnSAUvKBTQBD3eQeGBCwbg==", "jNNkO");
        lIIlllIll[lIIlllllI[83]] = lIIIIIlllIll("OJbGWj0okr3pAXiNxbfLPw==", "GtHxQ");
        lIIlllIll[lIIlllllI[84]] = lIIIIIlllIll("QYCI9gbUaHAaS3i7yo/PAw==", "rUKyr");
        lIIlllIll[lIIlllllI[85]] = lIIIIIlllIlI("AgYkNg==", "MvAXc");
        lIIlllIll[lIIlllllI[86]] = lIIIIIllllII("1cFRVj9KQtA=", "cUucr");
        lIIlllIll[lIIlllllI[87]] = lIIIIIllllII("1XoWWeE/ZejQQ/EFcKMAxw==", "auRkS");
        lIIlllIll[lIIlllllI[88]] = lIIIIIlllIll("Do4+IPCpLIc=", "PNbUV");
        lIIlllIll[lIIlllllI[89]] = lIIIIIlllIll("Ea4w5yk36+pIUarRTUp0jg==", "jITMl");
        lIIlllIll[lIIlllllI[90]] = lIIIIIlllIlI("NwYeCXcQDB0X", "tcreW");
        lIIlllIll[lIIlllllI[91]] = lIIIIIllllII("kQxu4GjnnDQ=", "FeVGK");
        lIIlllIll[lIIlllllI[92]] = lIIIIIlllIll("sMVYq/uVdI9KER0CbmqwuyD2fSFiReBq", "hVSUS");
        lIIlllIll[lIIlllllI[98]] = lIIIIIllllII("ndTRXhMDKW9BpaB4FZybPQ==", "jdtai");
        lIIlllIll[lIIlllllI[99]] = lIIIIIlllIll("1LO2xE0Yc40=", "chmnT");
        lIIlllIll[lIIlllllI[100]] = lIIIIIlllIlI("DDYPPg==", "CFjPU");
        lIIlllIll[lIIlllllI[101]] = lIIIIIllllII("Ezz+SQ+t9TRqmtsfRLczEA==", "uqCjc");
        lIIlllIll[lIIlllllI[102]] = lIIIIIlllIll("ZrSu/1QhJLb1+iKbBCEFZA==", "SmRQV");
        lIIlllIll[lIIlllllI[103]] = lIIIIIllllII("nF/v6fcbkJ6/NpHom1UCRg==", "PdoKJ");
        lIIlllIll[lIIlllllI[104]] = lIIIIIllllII("qkZNCn4tdMk=", "irnme");
        lIIlllIll[lIIlllllI[105]] = lIIIIIlllIll("uW66cVF7X2Dhjz44+Tv14w==", "xQMiR");
        lIIlllIll[lIIlllllI[106]] = lIIIIIllllII("8Dcnv8nACoq5HmM6JT76Qg==", "yyTBS");
        lIIlllIll[lIIlllllI[107]] = lIIIIIlllIlI("BxAiHzQv", "CbGeQ");
        lIIlllIll[lIIlllllI[108]] = lIIIIIllllII("O/v1a9UPG9W/GrQbzKpEaQ==", "iemVQ");
        lIIlllIll[lIIlllllI[109]] = lIIIIIlllIlI("IgouNwMMFih1DAoKKnUEFgs=", "exOUa");
        lIIlllIll[lIIlllllI[110]] = lIIIIIlllIlI("GCwFLE4tKgQsACs8", "HYwIn");
        lIIlllIll[lIIlllllI[111]] = lIIIIIlllIlI("PgYcazsfRwwiIRELSj8mHAI=", "pgjKO");
        lIIlllIll[lIIlllllI[112]] = lIIIIIlllIll("q6Gd7sraeBWVsOCB7tv7ig==", "xSWBO");
        lIIlllIll[lIIlllllI[113]] = lIIIIIlllIlI("ARkmCg==", "NiCdd");
        lIIlllIll[lIIlllllI[114]] = lIIIIIllllII("JrZgHwrgHNI=", "vSwhE");
        lIIlllIll[lIIlllllI[115]] = lIIIIIlllIlI("Gy0KFyZ1JQwNKg==", "XAczD");
        lIIlllIll[lIIlllllI[116]] = lIIIIIlllIll("xNcKwTo6icN+3hTZNEZv2g==", "UJPyX");
        lIIlllIll[lIIlllllI[117]] = lIIIIIlllIll("VOePodswSFglC2NlU/r6f/r7qULLDIdeHb8vgT9r8ezHHApVPWCBDA==", "FPrDs");
        lIIlllIll[lIIlllllI[119]] = lIIIIIlllIll("bG2DJx2ED2U=", "RFSds");
        lIIlllIll[lIIlllllI[127]] = lIIIIIlllIll("xzti46fP/BZQowC5Q5sX7w==", "wDAwU");
        lIIlllIll[lIIlllllI[128]] = lIIIIIlllIlI("EywGBwA6YwEGHA==", "TCjce");
        lIIlllIll[lIIlllllI[129]] = lIIIIIllllII("F9b8ElpiC4ZEWRRoOWZjGg==", "EVEwd");
        lIIlllIll[lIIlllllI[130]] = lIIIIIlllIlI("PRYuD3AfATg=", "tdAaP");
        lIIlllIll[lIIlllllI[131]] = lIIIIIllllII("in3nRPZD32N9Er5C8UrYUppdTGxIotqs", "tcLwc");
        lIIlllIll[lIIlllllI[2]] = lIIIIIlllIll("uHhxTwT4SburvnrG9wZcWw==", "AsUVO");
        lIIlllIll[lIIlllllI[132]] = lIIIIIllllII("rU2hHmXtmqg=", "tfrDQ");
        lIIlllIll[lIIlllllI[133]] = lIIIIIlllIll("NZim7yJN2yg=", "vJfql");
        lIIlllIll[lIIlllllI[134]] = lIIIIIlllIlI("DigNLCtgIAs2Jw==", "MDdAI");
        lIIlllIll[lIIlllllI[135]] = lIIIIIlllIlI("CjohASxkMicbIA==", "IVHlN");
        lIIlllIll[lIIlllllI[136]] = lIIIIIllllII("6yvQJk0/tHtxzMlV8+B46A==", "BDxtF");
        lIIlllIll[lIIlllllI[137]] = lIIIIIlllIll("4t6ox3CstsEpoLALxBxRiAImflJe40W6", "QXPTN");
        lIIlllIll[lIIlllllI[138]] = lIIIIIllllII("Fic/Ys5snYVsTwobciuPCw==", "mnWgN");
        lIIlllIll[lIIlllllI[139]] = lIIIIIllllII("ME8gaSc7/kg2kMYazuTt2fr8vLYJWICG", "SzNTT");
        lIIlllIll[lIIlllllI[140]] = lIIIIIlllIll("CV485KzBSHc=", "DeYAf");
        lIIlllIll[lIIlllllI[141]] = lIIIIIllllII("rWM1jZqo6q0=", "PvgYn");
        lIIlllIll[lIIlllllI[147]] = lIIIIIlllIlI("Bx86HxQjTRoURwcIIRML", "WmSzg");
        lIIlllIll[lIIlllllI[148]] = lIIIIIlllIlI("GTAgE1YEP24DEwo1OhxWQw==", "kYNtv");
        lIIlllIll[lIIlllllI[165]] = lIIIIIlllIll("lCv/y4zS3FQVDlZ8qbokwFF0JqtIO2JHMHaR0JsYO9Y=", "QKJat");
        lIIlllIll[lIIlllllI[166]] = lIIIIIlllIlI("IB8BXA==", "yzrrc");
        lIIlllIll[lIIlllllI[167]] = lIIIIIllllII("rQsX0TS4ue/TzB8vzVAIJpA48+Ra+SeK", "QBIEt");
        lIIlllIll[lIIlllllI[168]] = lIIIIIlllIll("REVDalNV4SxpaBeKO7XR8eMZENdfOcCxvwA12NNZQbB0/3d2vD9hcg==", "oBcqH");
        lIIlllIll[lIIlllllI[169]] = lIIIIIllllII("reYRKiT8rGk=", "rbtol");
        lIIlllIll[lIIlllllI[170]] = lIIIIIlllIlI("FT85XT4pcD4TKyQkYFo7KXAoFSJrJGI=", "LPLzL");
        lIIlllIll[lIIlllllI[171]] = lIIIIIllllII("glgRqBYq7wLwNH93MDxzkUNa7rm7y7eRBB9Fx6TH6yJzvHkyqOCwYjwDDnCil+0vzor5VUGXANA=", "mpFBU");
        lIIlllIll[lIIlllllI[172]] = lIIIIIlllIlI("PAEAIXRLEwQsLEsNH20xH0hMBHgGBRVtOg5EDS80DkQYIngDAQA9Zw==", "kdlMX");
        lIIlllIll[lIIlllllI[173]] = lIIIIIlllIll("hGEtmrR4j2VbOLFafAUQ5QgBlfOxBqIbriEGMvLn3dk=", "GFrSq");
        lIIlllIll[lIIlllllI[174]] = lIIIIIlllIlI("HxAiekcPUjx2FDMHNHg=", "FuQVg");
        lIIlllIll[lIIlllllI[175]] = lIIIIIlllIll("v132VA/8yzPgcjmszTtt7w==", "vLSuC");
        lIIlllIll[lIIlllllI[176]] = lIIIIIlllIll("d93EchajaeLWsiGXCffKnA==", "XhKLc");
        lIIlllIll[lIIlllllI[177]] = lIIIIIlllIll("eNVl/pj75REcD7SznKSttE+83M4dSiDee3kwzthbYRI=", "GAVgM");
        lIIlllIll[lIIlllllI[178]] = lIIIIIlllIlI("Ii0dcBcLLEoZVAInBiBL", "jBjPt");
        lIIlllIll[lIIlllllI[179]] = lIIIIIlllIlI("JgsjPCVUFyc+NVQJJ3A1G0QhOCQXD2I/L1QgMDU7EQhs", "tdBPA");
        lIIlllIll[lIIlllllI[180]] = lIIIIIlllIll("LOGPZkvGENlBJYruKqIxLCPisv7ssLI/Ytml/mR9jf+FLa/s2UYt7A==", "ncQsk");
        lIIlllIll[lIIlllllI[181]] = lIIIIIlllIll("vuHrWkDw2hktlipmZbzql+nU2LS1bZFD", "VTYzc");
        lIIlllIll[lIIlllllI[182]] = lIIIIIllllII("S4ke1LrdqJaYij1UbpBHBw==", "xkqoJ");
        lIIlllIll[lIIlllllI[183]] = lIIIIIllllII("vKCZ8DipD7E59Lwv/cc0o2J7VXldw8/8aotrQySB7l38Ac/lomCjiebvV8qxsCtJ", "XtSun");
        lIIlllIll[lIIlllllI[184]] = lIIIIIlllIlI("Owg0Ak9MGjAPF0wEK04KGEF4J0MBDCFOAQlNOQwPCU0sAUMECDQeXA==", "lmXnc");
    }

    private static boolean lIIIIlIllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIlIlIlll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v563, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v797, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v819, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void aX() {
        if (lIIIIlIlIIII(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIIIlIlIIIl(bv.size(), lIIlllllI[0])) {
                System.out.println(lIIlllIll[lIIlllllI[1]]);
                bt = lIIlllllI[1];
            }
        }
        if (lIIIIlIlIIlI(bt ? 1 : 0)) {
            if (lIIIIlIlIIIl(C0004e.j(lIIlllllI[2]), lIIlllllI[3])) {
                R.cU();
            }
            if (lIIIIlIlIIlI(bc() ? 1 : 0) && lIIIIlIlIIIl(C0004e.j(du), lIIlllllI[0]) && lIIIIlIlIIll(C0004e.j(lIIlllllI[2]), lIIlllllI[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIlIlIlII(nearest) && lIIIIlIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[0]];
                    C0000a.a(nearest);
                }
                if (lIIIIlIlIlII(nearest) && lIIIIlIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlllllI[4]);
                        "".length();
                    }
                    if (lIIIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[5]];
                        if (lIIIIlIlIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlllllI[6]);
                            "".length();
                        }
                        if (lIIIIlIlIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlllllI[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlllllI[3]];
                        iArr[lIIlllllI[1]] = lIIlllllI[7];
                        iArr[lIIlllllI[0]] = lIIlllllI[8];
                        iArr[lIIlllllI[5]] = lIIlllllI[9];
                        iArr[lIIlllllI[10]] = lIIlllllI[11];
                        iArr[lIIlllllI[6]] = lIIlllllI[12];
                        if (lIIIIlIlIIlI(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIlllIll[lIIlllllI[10]]);
                            bt = lIIlllllI[0];
                            return;
                        }
                        int[] iArr2 = new int[lIIlllllI[3]];
                        iArr2[lIIlllllI[1]] = lIIlllllI[7];
                        iArr2[lIIlllllI[0]] = lIIlllllI[8];
                        iArr2[lIIlllllI[5]] = lIIlllllI[9];
                        iArr2[lIIlllllI[10]] = lIIlllllI[11];
                        iArr2[lIIlllllI[6]] = lIIlllllI[12];
                        if (lIIIIlIlIIII(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIlllllI[7], lIIlllllI[13]);
                            C0000a.a(lIIlllllI[14], lIIlllllI[0]);
                            C0000a.a(lIIlllllI[8], lIIlllllI[0]);
                            C0000a.a(lIIlllllI[11], lIIlllllI[6]);
                            C0000a.a(lIIlllllI[12], lIIlllllI[13]);
                        }
                    }
                }
            }
            if (lIIIIlIlIIII(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIlIlIIIl(Movement.getRunEnergy(), lIIlllllI[15])) {
                Inventory.getFirst(C0005f.aV).interact(lIIlllIll[lIIlllllI[6]]);
                Time.sleepTicks(lIIlllllI[0]);
                "".length();
            }
            int[] iArr3 = new int[lIIlllllI[0]];
            iArr3[lIIlllllI[1]] = lIIlllllI[12];
            if (lIIIIlIlIIII(Inventory.contains(iArr3) ? 1 : 0) && lIIIIlIlIllI(lIIIIlIIllll(C0004e.u(), 60.0d))) {
                int[] iArr4 = new int[lIIlllllI[0]];
                iArr4[lIIlllllI[1]] = lIIlllllI[12];
                Inventory.getFirst(iArr4).interact(lIIlllIll[lIIlllllI[3]]);
                Time.sleepTicks(lIIlllllI[0]);
                "".length();
            }
            if (lIIIIlIlIIIl(C0004e.j(du), lIIlllllI[0]) && lIIIIlIlIIII(bc() ? 1 : 0)) {
                if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lIIlllllI[10])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[16]];
                    if (lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(dl);
                    "".length();
                    Time.sleepTicks(lIIlllllI[0]);
                    "".length();
                }
                if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lIIlllllI[10])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[17]];
                    C0006g.a(lIIlllIll[lIIlllllI[18]], bR);
                }
            }
            if (lIIIIlIlIIll(C0004e.j(du), lIIlllllI[0])) {
                if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dm), lIIlllllI[5])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[19]];
                    Movement.walkTo(dm);
                    "".length();
                    Time.sleepTicks(lIIlllllI[0]);
                    "".length();
                }
                if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dm), lIIlllllI[5])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[13]];
                    if (lIIIIlIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[lIIlllllI[0]];
                        strArr[lIIlllllI[1]] = lIIlllIll[lIIlllllI[20]];
                        TileObjects.getNearest(strArr).interact(lIIlllIll[lIIlllllI[21]]);
                    }
                    C0006g.a(bR);
                }
            }
            if (lIIIIlIlIIll(C0004e.j(du), lIIlllllI[5])) {
                String[] strArr2 = new String[lIIlllllI[0]];
                strArr2[lIIlllllI[1]] = lIIlllIll[lIIlllllI[22]];
                if (lIIIIlIllIIl(NPCs.getNearest(strArr2))) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[23]];
                    String[] strArr3 = new String[lIIlllllI[0]];
                    strArr3[lIIlllllI[1]] = lIIlllIll[lIIlllllI[24]];
                    TileObject nearest2 = TileObjects.getNearest(strArr3);
                    if (lIIIIlIlIlII(nearest2) && lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(nearest2), lIIlllllI[6]) && lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0)) {
                        C0006g.a(bR);
                    }
                    if (!lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0) || lIIIIlIlIlll(Players.getLocal().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[26], lIIlllllI[1])), lIIlllllI[3])) {
                        Movement.walkTo(new WorldPoint(lIIlllllI[25], lIIlllllI[26], lIIlllllI[1]));
                        "".length();
                        Time.sleepTicks(lIIlllllI[10]);
                        "".length();
                    }
                }
                if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[26], lIIlllllI[1])), lIIlllllI[3])) {
                    String[] strArr4 = new String[lIIlllllI[0]];
                    strArr4[lIIlllllI[1]] = lIIlllIll[lIIlllllI[27]];
                    if (lIIIIlIllIIl(NPCs.getNearest(strArr4))) {
                        String[] strArr5 = new String[lIIlllllI[0]];
                        strArr5[lIIlllllI[1]] = lIIlllIll[lIIlllllI[28]];
                        TileObject nearest3 = TileObjects.getNearest(strArr5);
                        if (lIIIIlIlIlII(nearest3) && lIIIIlIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[lIIlllllI[0]];
                            strArr6[lIIlllllI[1]] = lIIlllIll[lIIlllllI[29]];
                            if (lIIIIlIlIIII(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                nearest3.interact(lIIlllIll[lIIlllllI[30]]);
                                Time.sleepTicks(lIIlllllI[5]);
                                "".length();
                            }
                            String[] strArr7 = new String[lIIlllllI[0]];
                            strArr7[lIIlllllI[1]] = lIIlllIll[lIIlllllI[31]];
                            if (lIIIIlIlIIII(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                nearest3.interact(lIIlllIll[lIIlllllI[32]]);
                                Time.sleepTicks(lIIlllllI[5]);
                                "".length();
                            }
                        }
                        C0006g.a(bR);
                    }
                }
                String[] strArr8 = new String[lIIlllllI[0]];
                strArr8[lIIlllllI[1]] = lIIlllIll[lIIlllllI[33]];
                if (lIIIIlIlIlII(NPCs.getNearest(strArr8))) {
                    int[] iArr5 = new int[lIIlllllI[0]];
                    iArr5[lIIlllllI[1]] = lIIlllllI[14];
                    if (lIIIIlIlIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIlllllI[0]];
                        iArr6[lIIlllllI[1]] = lIIlllllI[14];
                        if (lIIIIlIlIIlI(Equipment.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[lIIlllllI[0]];
                            iArr7[lIIlllllI[1]] = lIIlllllI[14];
                            Inventory.getFirst(iArr7).interact(lIIlllIll[lIIlllllI[34]]);
                        }
                    }
                    if (lIIIIlIllIIl(Players.getLocal().getInteracting())) {
                        String[] strArr9 = new String[lIIlllllI[0]];
                        strArr9[lIIlllllI[1]] = lIIlllIll[lIIlllllI[35]];
                        NPCs.getNearest(strArr9).interact(lIIlllIll[lIIlllllI[36]]);
                        Time.sleepTicks(lIIlllllI[5]);
                        "".length();
                    }
                }
            }
            if (lIIIIlIlIIll(C0004e.j(du), lIIlllllI[10])) {
                if (lIIIIlIlIIlI(dt ? 1 : 0)) {
                    if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dm), lIIlllllI[5])) {
                        String[] strArr10 = new String[lIIlllllI[0]];
                        strArr10[lIIlllllI[1]] = lIIlllIll[lIIlllllI[37]];
                        if (lIIIIlIlIlII(TileObjects.getNearest(strArr10))) {
                            int[] iArr8 = new int[lIIlllllI[0]];
                            iArr8[lIIlllllI[1]] = lIIlllllI[7];
                            if (lIIIIlIlIIII(Inventory.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[lIIlllllI[0]];
                                iArr9[lIIlllllI[1]] = lIIlllllI[7];
                                Inventory.getFirst(iArr9).interact(lIIlllIll[lIIlllllI[38]]);
                                Time.sleepTicks(lIIlllllI[3]);
                                "".length();
                            }
                        }
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[39]];
                        Movement.walkTo(dm);
                        "".length();
                        Time.sleepTicks(lIIlllllI[0]);
                        "".length();
                    }
                    if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dm), lIIlllllI[5])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[40]];
                        if (lIIIIlIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr11 = new String[lIIlllllI[0]];
                            strArr11[lIIlllllI[1]] = lIIlllIll[lIIlllllI[41]];
                            TileObjects.getNearest(strArr11).interact(lIIlllIll[lIIlllllI[42]]);
                        }
                        C0006g.a(bR);
                        if (lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0) && lIIIIlIlIIII(Dialog.getText().contains(lIIlllIll[lIIlllllI[43]]) ? 1 : 0)) {
                            dt = lIIlllllI[0];
                        }
                    }
                }
                if (lIIIIlIlIIII(dt ? 1 : 0)) {
                    if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lIIlllllI[10])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[44]];
                        Movement.walkTo(dl);
                        "".length();
                        Time.sleepTicks(lIIlllllI[0]);
                        "".length();
                    }
                    if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lIIlllllI[10])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[45]];
                        C0006g.a(lIIlllIll[lIIlllllI[46]], bR);
                    }
                }
            }
            if (lIIIIlIlIIll(C0004e.j(du), lIIlllllI[6])) {
                cl = lIIlllllI[1];
                if (lIIIIlIlIIlI(ab() ? 1 : 0)) {
                    bb();
                }
                if (lIIIIlIlIIII(ab() ? 1 : 0)) {
                    if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dp), lIIlllllI[10])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[47]];
                        if (lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(dp);
                        "".length();
                        Time.sleepTicks(lIIlllllI[0]);
                        "".length();
                    }
                    if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIlllllI[10])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[48]];
                        if (lIIIIlIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr12 = new String[lIIlllllI[0]];
                            strArr12[lIIlllllI[1]] = lIIlllIll[lIIlllllI[49]];
                            TileObjects.getNearest(strArr12).interact(lIIlllIll[lIIlllllI[50]]);
                        }
                        C0006g.a(bR);
                    }
                }
            }
            if (lIIIIlIlIIll(C0004e.j(du), lIIlllllI[3])) {
                String[] strArr13 = new String[lIIlllllI[0]];
                strArr13[lIIlllllI[1]] = lIIlllIll[lIIlllllI[51]];
                if (lIIIIlIlIIlI(Inventory.contains(strArr13) ? 1 : 0)) {
                    String[] strArr14 = new String[lIIlllllI[0]];
                    strArr14[lIIlllllI[1]] = lIIlllIll[lIIlllllI[52]];
                    if (lIIIIlIlIIlI(Inventory.contains(strArr14) ? 1 : 0)) {
                        if (!lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dq), lIIlllllI[17]) || lIIIIlIlIIII(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[53]];
                            Movement.walkTo(dq);
                            "".length();
                            Time.sleepTicks(lIIlllllI[0]);
                            "".length();
                        }
                        if (!lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dq), lIIlllllI[17]) || lIIIIlIlIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                            if (lIIIIlIllIIl(Players.getLocal().getInteracting())) {
                                int[] iArr10 = new int[lIIlllllI[0]];
                                iArr10[lIIlllllI[1]] = lIIlllllI[54];
                                NPCs.getNearest(iArr10).interact(lIIlllIll[lIIlllllI[55]]);
                                Time.sleepTicks(lIIlllllI[5]);
                                "".length();
                            }
                            String[] strArr15 = new String[lIIlllllI[0]];
                            strArr15[lIIlllllI[1]] = lIIlllIll[lIIlllllI[56]];
                            TileItem nearest4 = TileItems.getNearest(strArr15);
                            if (lIIIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
                                int[] iArr11 = new int[lIIlllllI[0]];
                                iArr11[lIIlllllI[1]] = lIIlllllI[12];
                                Inventory.getFirst(iArr11).interact(lIIlllIll[lIIlllllI[57]]);
                                Time.sleepTicks(lIIlllllI[0]);
                                "".length();
                            }
                            if (lIIIIlIlIlII(nearest4)) {
                                nearest4.interact(lIIlllIll[lIIlllllI[58]]);
                                Time.sleepTicks(lIIlllllI[5]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr16 = new String[lIIlllllI[0]];
                strArr16[lIIlllllI[1]] = lIIlllIll[lIIlllllI[59]];
                if (lIIIIlIlIIII(Inventory.contains(strArr16) ? 1 : 0)) {
                    if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dr), lIIlllllI[13])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[60]];
                        Movement.walkTo(dr);
                        "".length();
                        Time.sleepTicks(lIIlllllI[0]);
                        "".length();
                    }
                    if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dr), lIIlllllI[13])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[61]];
                        aY();
                    }
                }
                String[] strArr17 = new String[lIIlllllI[0]];
                strArr17[lIIlllllI[1]] = lIIlllIll[lIIlllllI[15]];
                if (lIIIIlIlIIII(Inventory.contains(strArr17) ? 1 : 0)) {
                    String[] strArr18 = new String[lIIlllllI[0]];
                    strArr18[lIIlllllI[1]] = lIIlllIll[lIIlllllI[62]];
                    if (lIIIIlIlIIlI(Inventory.contains(strArr18) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[63]];
                        String[] strArr19 = new String[lIIlllllI[0]];
                        strArr19[lIIlllllI[1]] = lIIlllIll[lIIlllllI[64]];
                        Item first = Inventory.getFirst(strArr19);
                        int[] iArr12 = new int[lIIlllllI[0]];
                        iArr12[lIIlllllI[1]] = lIIlllllI[65];
                        first.useOn(TileObjects.getNearest(iArr12));
                        Time.sleepTicks(lIIlllllI[6]);
                        "".length();
                    }
                }
                String[] strArr20 = new String[lIIlllllI[0]];
                strArr20[lIIlllllI[1]] = lIIlllIll[lIIlllllI[66]];
                if (lIIIIlIlIIII(Inventory.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[lIIlllllI[0]];
                    strArr21[lIIlllllI[1]] = lIIlllIll[lIIlllllI[67]];
                    if (lIIIIlIlIIII(Inventory.contains(strArr21) ? 1 : 0)) {
                        if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dp), lIIlllllI[10])) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[68]];
                            if (lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(dp);
                            "".length();
                            Time.sleepTicks(lIIlllllI[0]);
                            "".length();
                        }
                        if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIlllllI[10])) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[69]];
                            String[] strArr22 = new String[lIIlllllI[0]];
                            strArr22[lIIlllllI[1]] = lIIlllIll[lIIlllllI[70]];
                            Item first2 = Inventory.getFirst(strArr22);
                            String[] strArr23 = new String[lIIlllllI[0]];
                            strArr23[lIIlllllI[1]] = lIIlllIll[lIIlllllI[71]];
                            first2.useOn(TileObjects.getNearest(strArr23));
                            Time.sleepTicks(lIIlllllI[10]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIIIlIlIIll(C0004e.j(du), lIIlllllI[16])) {
                String[] strArr24 = new String[lIIlllllI[0]];
                strArr24[lIIlllllI[1]] = lIIlllIll[lIIlllllI[72]];
                NPC nearest5 = NPCs.getNearest(strArr24);
                String[] strArr25 = new String[lIIlllllI[0]];
                strArr25[lIIlllllI[1]] = lIIlllIll[lIIlllllI[73]];
                if (lIIIIlIlIIlI(Inventory.contains(strArr25) ? 1 : 0) && lIIIIlIlIlII(nearest5)) {
                    if (lIIIIlIlIIII(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[74]];
                        C0006g.a(lIIlllIll[lIIlllllI[75]], bR);
                    }
                    if (lIIIIlIlIIlI(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[76]];
                        String[] strArr26 = new String[lIIlllllI[0]];
                        strArr26[lIIlllllI[1]] = lIIlllIll[lIIlllllI[77]];
                        TileObjects.getNearest(strArr26).interact(lIIlllIll[lIIlllllI[78]]);
                        Time.sleepTicks(lIIlllllI[5]);
                        "".length();
                    }
                }
                String[] strArr27 = new String[lIIlllllI[0]];
                strArr27[lIIlllllI[1]] = lIIlllIll[lIIlllllI[79]];
                if (lIIIIlIlIIII(Inventory.contains(strArr27) ? 1 : 0)) {
                    String[] strArr28 = new String[lIIlllllI[0]];
                    strArr28[lIIlllllI[1]] = lIIlllIll[lIIlllllI[80]];
                    TileObject nearest6 = TileObjects.getNearest(strArr28);
                    if (lIIIIlIlIlII(nearest6)) {
                        if (lIIIIlIlIIII(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[81]];
                            String[] strArr29 = new String[lIIlllllI[0]];
                            strArr29[lIIlllllI[1]] = lIIlllIll[lIIlllllI[82]];
                            Inventory.getFirst(strArr29).useOn(nearest6);
                            Time.sleepTicks(lIIlllllI[5]);
                            "".length();
                        }
                        if (lIIIIlIlIIlI(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[83]];
                            String[] strArr30 = new String[lIIlllllI[0]];
                            strArr30[lIIlllllI[1]] = lIIlllIll[lIIlllllI[84]];
                            TileObjects.getNearest(strArr30).interact(lIIlllIll[lIIlllllI[85]]);
                            Time.sleepTicks(lIIlllllI[5]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIIIlIlIIll(C0004e.j(du), lIIlllllI[17])) {
                String[] strArr31 = new String[lIIlllllI[0]];
                strArr31[lIIlllllI[1]] = lIIlllIll[lIIlllllI[86]];
                NPC nearest7 = NPCs.getNearest(strArr31);
                if (lIIIIlIlIlII(nearest7)) {
                    if (lIIIIlIlIIII(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[87]];
                        C0006g.a(lIIlllIll[lIIlllllI[88]], bR);
                    }
                    if (lIIIIlIlIIlI(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[89]];
                        String[] strArr32 = new String[lIIlllllI[0]];
                        strArr32[lIIlllllI[1]] = lIIlllIll[lIIlllllI[90]];
                        TileObjects.getNearest(strArr32).interact(lIIlllIll[lIIlllllI[91]]);
                        Time.sleepTicks(lIIlllllI[5]);
                        "".length();
                    }
                }
            }
            if (lIIIIlIlIIll(C0004e.j(du), lIIlllllI[18])) {
                if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[92]];
                    WorldArea worldArea = new WorldArea(lIIlllllI[93], lIIlllllI[94], lIIlllllI[60], lIIlllllI[43], lIIlllllI[1]);
                    if (lIIIIlIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lIIlllllI[95], lIIlllllI[96], lIIlllllI[48], lIIlllllI[63], lIIlllllI[1]);
                        if (lIIIIlIlIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));
                            "".length();
                            Time.sleepTicks(lIIlllllI[0]);
                            "".length();
                        }
                        if (lIIIIlIlIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                Movement.walkTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));
                                "".length();
                                Time.sleepTicks(lIIlllllI[0]);
                                "".length();
                            }
                            if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                String[] strArr33 = new String[lIIlllllI[0]];
                                strArr33[lIIlllllI[1]] = lIIlllIll[lIIlllllI[98]];
                                TileObject nearest8 = TileObjects.getNearest(strArr33);
                                if (lIIIIlIlIlII(nearest8)) {
                                    String[] strArr34 = new String[lIIlllllI[0]];
                                    strArr34[lIIlllllI[1]] = lIIlllIll[lIIlllllI[99]];
                                    if (lIIIIlIlIIII(nearest8.hasAction(strArr34) ? 1 : 0)) {
                                        nearest8.interact(lIIlllIll[lIIlllllI[100]]);
                                        Time.sleepTicks(lIIlllllI[10]);
                                        "".length();
                                    }
                                    String[] strArr35 = new String[lIIlllllI[0]];
                                    strArr35[lIIlllllI[1]] = lIIlllIll[lIIlllllI[101]];
                                    if (lIIIIlIlIIII(nearest8.hasAction(strArr35) ? 1 : 0)) {
                                        nearest8.interact(lIIlllIll[lIIlllllI[102]]);
                                        Time.sleepTicks(lIIlllllI[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIIIIlIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(ds);
                        "".length();
                        Time.sleepTicks(lIIlllllI[0]);
                        "".length();
                    }
                }
                if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[103]];
                    C0006g.a(lIIlllIll[lIIlllllI[104]], bR);
                }
            }
            if (lIIIIlIllIlI(C0004e.j(du), lIIlllllI[13]) && lIIIIlIlIIIl(C0004e.j(du), lIIlllllI[72])) {
                if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    String[] strArr36 = new String[lIIlllllI[0]];
                    strArr36[lIIlllllI[1]] = lIIlllIll[lIIlllllI[105]];
                    if (lIIIIlIlIIII(Inventory.contains(strArr36) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[106]];
                        if (lIIIIlIlIIIl(cl, lIIlllllI[0])) {
                            an.nr += lIIlllllI[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIIlllllI[0];
                            an.nr = lIIlllllI[1];
                            cm = lIIlllllI[1];
                        }
                        C0006g.a(lIIlllIll[lIIlllllI[107]], bR);
                    }
                }
                String[] strArr37 = new String[lIIlllllI[0]];
                strArr37[lIIlllllI[1]] = lIIlllIll[lIIlllllI[108]];
                if (lIIIIlIlIIlI(Inventory.contains(strArr37) ? 1 : 0) && lIIIIlIlIIIl(C0004e.j(du), lIIlllllI[72])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[109]];
                    ba();
                }
                String[] strArr38 = new String[lIIlllllI[0]];
                strArr38[lIIlllllI[1]] = lIIlllIll[lIIlllllI[110]];
                if (lIIIIlIlIIII(Inventory.contains(strArr38) ? 1 : 0) && lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3]) && lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[111]];
                    WorldArea worldArea3 = new WorldArea(lIIlllllI[93], lIIlllllI[94], lIIlllllI[60], lIIlllllI[43], lIIlllllI[1]);
                    if (lIIIIlIlIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea4 = new WorldArea(lIIlllllI[95], lIIlllllI[96], lIIlllllI[48], lIIlllllI[63], lIIlllllI[1]);
                        if (lIIIIlIlIIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));
                            "".length();
                            Time.sleepTicks(lIIlllllI[0]);
                            "".length();
                        }
                        if (lIIIIlIlIIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                Movement.walkTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));
                                "".length();
                                Time.sleepTicks(lIIlllllI[0]);
                                "".length();
                            }
                            if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                String[] strArr39 = new String[lIIlllllI[0]];
                                strArr39[lIIlllllI[1]] = lIIlllIll[lIIlllllI[112]];
                                TileObject nearest9 = TileObjects.getNearest(strArr39);
                                if (lIIIIlIlIlII(nearest9)) {
                                    String[] strArr40 = new String[lIIlllllI[0]];
                                    strArr40[lIIlllllI[1]] = lIIlllIll[lIIlllllI[113]];
                                    if (lIIIIlIlIIII(nearest9.hasAction(strArr40) ? 1 : 0)) {
                                        nearest9.interact(lIIlllIll[lIIlllllI[114]]);
                                        Time.sleepTicks(lIIlllllI[10]);
                                        "".length();
                                    }
                                    String[] strArr41 = new String[lIIlllllI[0]];
                                    strArr41[lIIlllllI[1]] = lIIlllIll[lIIlllllI[115]];
                                    if (lIIIIlIlIIII(nearest9.hasAction(strArr41) ? 1 : 0)) {
                                        nearest9.interact(lIIlllIll[lIIlllllI[116]]);
                                        Time.sleepTicks(lIIlllllI[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIIIIlIlIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(ds);
                        "".length();
                        Time.sleepTicks(lIIlllllI[0]);
                        "".length();
                    }
                }
            }
            if (lIIIIlIllIlI(C0004e.j(du), lIIlllllI[72]) && lIIIIlIlIIIl(C0004e.j(dv), lIIlllllI[3])) {
                AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[117]];
                if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    aZ();
                }
                if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    if (lIIIIlIlIlII(Widgets.get(lIIlllllI[118], lIIlllllI[27]))) {
                        Mouse.click(Widgets.get(lIIlllllI[118], lIIlllllI[27]).getClickPoint().getX(), Widgets.get(lIIlllllI[118], lIIlllllI[27]).getClickPoint().getY(), (boolean) lIIlllllI[0]);
                        Time.sleepTicks(lIIlllllI[10]);
                        "".length();
                    }
                    C0006g.a(lIIlllIll[lIIlllllI[119]], bR);
                    C0006g.a(bR);
                }
            }
            C0006g.a(bR);
        }
    }

    private static String lIIIIIllllII(String lllllIlIlIIlII, String lllllIlIlIIIll) {
        try {
            SecretKeySpec lllllIlIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIlIlIIllI = Cipher.getInstance("Blowfish");
            lllllIlIlIIllI.init(lIIlllllI[5], lllllIlIlIIlll);
            return new String(lllllIlIlIIllI.doFinal(Base64.getDecoder().decode(lllllIlIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIlIlIIlIl) {
            lllllIlIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIlIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIIlIllIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIlIlIllI(int i) {
        return i < 0;
    }

    private static void bb() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIIIlIlIlII(nearest) && lIIIIlIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[138]];
            C0000a.a(nearest);
        }
        if (lIIIIlIlIlII(nearest) && lIIIIlIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIlllllI[4]);
                "".length();
            }
            if (lIIIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[139]];
                if (lIIIIlIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIlllllI[6]);
                    "".length();
                }
                C0000a.a(lIIlllllI[7], lIIlllllI[13]);
                C0000a.a(lIIlllllI[8], lIIlllllI[0]);
                C0000a.a(lIIlllllI[11], lIIlllllI[0]);
                C0000a.a(lIIlllllI[12], lIIlllllI[3]);
                C0000a.a(lIIlllllI[9], lIIlllllI[41]);
            }
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            aX();
            "".length();
            if (0 != 0) {
                return ((12 ^ 103) ^ (230 ^ 197)) & (((137 ^ 196) ^ (190 ^ 187)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlllllI[117];
    }

    private static boolean lIIIIlIlIIlI(int i) {
        return i == 0;
    }

    private static int lIIIIlIIllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlllllI[1];
    }

    private static boolean lIIIIlIllIlI(int i, int i2) {
        return i >= i2;
    }

    private static void lIIIIlIIlllI() {
        lIIlllllI = new int[186];
        lIIlllllI[0] = " ".length();
        lIIlllllI[1] = ((((86 + 56) - 49) + 35) ^ (((65 + 154) - 80) + 58)) & (((21 ^ 62) ^ (73 ^ 39)) ^ (-" ".length()));
        lIIlllllI[2] = (81 ^ 60) ^ (97 ^ 103);
        lIIlllllI[3] = (((74 + 136) - 143) + 110) ^ (((156 + 69) - 119) + 74);
        lIIlllllI[4] = (-((-4613) & 14901)) & (-7) & 15294;
        lIIlllllI[5] = "  ".length();
        lIIlllllI[6] = (62 ^ 14) ^ (32 ^ 20);
        lIIlllllI[7] = (-16545) & 24551;
        lIIlllllI[8] = (-((-1313) & 25977)) & (-35) & 26623;
        lIIlllllI[9] = (-((-14721) & 31149)) & (-8212) & 32575;
        lIIlllllI[10] = "   ".length();
        lIIlllllI[11] = (-((-245) & 3839)) & (-37) & 16255;
        lIIlllllI[12] = (-16001) & 16379;
        lIIlllllI[13] = (76 ^ 100) ^ (151 ^ 181);
        lIIlllllI[14] = (-((-24929) & 27501)) & (-16449) & 20351;
        lIIlllllI[15] = 6 ^ 52;
        lIIlllllI[16] = 171 ^ 173;
        lIIlllllI[17] = (236 ^ 131) ^ (15 ^ 103);
        lIIlllllI[18] = (202 ^ 183) ^ (182 ^ 195);
        lIIlllllI[19] = 105 ^ 96;
        lIIlllllI[20] = (((201 + 169) - 224) + 60) ^ (((53 + 180) - 232) + 196);
        lIIlllllI[21] = 25 ^ 21;
        lIIlllllI[22] = 68 ^ 73;
        lIIlllllI[23] = (((27 + 1) - (-3)) + 152) ^ (((45 + 81) - (-39)) + 20);
        lIIlllllI[24] = 88 ^ 87;
        lIIlllllI[25] = (-8243) & 11647;
        lIIlllllI[26] = (-16898) & 20403;
        lIIlllllI[27] = 139 ^ 155;
        lIIlllllI[28] = (46 ^ 70) ^ (204 ^ 181);
        lIIlllllI[29] = 213 ^ 199;
        lIIlllllI[30] = 130 ^ 145;
        lIIlllllI[31] = 76 ^ 88;
        lIIlllllI[32] = (39 ^ 18) ^ (97 ^ 65);
        lIIlllllI[33] = (111 ^ 3) ^ (29 ^ 103);
        lIIlllllI[34] = 162 ^ 181;
        lIIlllllI[35] = 46 ^ 54;
        lIIlllllI[36] = (126 ^ 122) ^ (133 ^ 152);
        lIIlllllI[37] = (((93 + 131) - 80) + 10) ^ (((122 + 32) - 121) + 95);
        lIIlllllI[38] = (125 ^ 102) ^ ((212 ^ 152) & ((88 ^ 20) ^ (-1)));
        lIIlllllI[39] = 5 ^ 25;
        lIIlllllI[40] = (62 ^ 94) ^ (211 ^ 174);
        lIIlllllI[41] = (100 ^ 83) ^ (178 ^ 155);
        lIIlllllI[42] = 92 ^ 67;
        lIIlllllI[43] = 171 ^ 139;
        lIIlllllI[44] = (((108 + 115) - 106) + 48) ^ (((71 + 131) - 71) + 1);
        lIIlllllI[45] = 108 ^ 78;
        lIIlllllI[46] = (83 ^ 47) ^ (9 ^ 86);
        lIIlllllI[47] = (((63 + 74) - 120) + 114) ^ (((156 + 48) - 44) + 7);
        lIIlllllI[48] = (((61 + 7) - (-65)) + 54) ^ (((157 + 97) - 104) + 8);
        lIIlllllI[49] = 119 ^ 81;
        lIIlllllI[50] = 157 ^ 186;
        lIIlllllI[51] = (49 ^ 123) ^ (21 ^ 119);
        lIIlllllI[52] = (((9 + 58) - (-125)) + 42) ^ (((56 + 102) - 40) + 77);
        lIIlllllI[53] = 167 ^ 141;
        lIIlllllI[54] = (-28770) & 32255;
        lIIlllllI[55] = (154 ^ 158) ^ (92 ^ 115);
        lIIlllllI[56] = (27 ^ 17) ^ (52 ^ 18);
        lIIlllllI[57] = 171 ^ 134;
        lIIlllllI[58] = (((85 + 161) - 168) + 86) ^ (((13 + 115) - 23) + 33);
        lIIlllllI[59] = 66 ^ 109;
        lIIlllllI[60] = (49 ^ 3) ^ "  ".length();
        lIIlllllI[61] = (214 ^ 142) ^ (8 ^ 97);
        lIIlllllI[62] = (151 ^ 194) ^ (219 ^ 189);
        lIIlllllI[63] = 171 ^ 159;
        lIIlllllI[64] = 91 ^ 110;
        lIIlllllI[65] = (-12833) & 16317;
        lIIlllllI[66] = 245 ^ 195;
        lIIlllllI[67] = (((87 + 69) - 46) + 75) ^ (((51 + 11) - 7) + 87);
        lIIlllllI[68] = (97 ^ 16) ^ (220 ^ 149);
        lIIlllllI[69] = 53 ^ 12;
        lIIlllllI[70] = 190 ^ 132;
        lIIlllllI[71] = (28 ^ 58) ^ (153 ^ 132);
        lIIlllllI[72] = 69 ^ 121;
        lIIlllllI[73] = 160 ^ 157;
        lIIlllllI[74] = (((134 + 36) - 157) + 143) ^ (((104 + 138) - 184) + 104);
        lIIlllllI[75] = 253 ^ 194;
        lIIlllllI[76] = 101 ^ 37;
        lIIlllllI[77] = (107 ^ 98) ^ (204 ^ 132);
        lIIlllllI[78] = 18 ^ 80;
        lIIlllllI[79] = 106 ^ 41;
        lIIlllllI[80] = 31 ^ 91;
        lIIlllllI[81] = (71 ^ 111) ^ (47 ^ 66);
        lIIlllllI[82] = 58 ^ 124;
        lIIlllllI[83] = 50 ^ 117;
        lIIlllllI[84] = 87 ^ 31;
        lIIlllllI[85] = 241 ^ 184;
        lIIlllllI[86] = 218 ^ 144;
        lIIlllllI[87] = 12 ^ 71;
        lIIlllllI[88] = (60 ^ 30) ^ (12 ^ 98);
        lIIlllllI[89] = (((92 + 3) - 43) + 152) ^ (((38 + 58) - 31) + 64);
        lIIlllllI[90] = (((105 + 15) - 72) + 91) ^ (((188 + 28) - 59) + 40);
        lIIlllllI[91] = 11 ^ 68;
        lIIlllllI[92] = 199 ^ 151;
        lIIlllllI[93] = (-((-2087) & 15023)) & (-16385) & 32719;
        lIIlllllI[94] = (-((-10261) & 14685)) & (-33) & 14335;
        lIIlllllI[95] = (-16964) & 20351;
        lIIlllllI[96] = (-12866) & 16327;
        lIIlllllI[97] = (-((-9242) & 30299)) & (-3) & 24563;
        lIIlllllI[98] = 144 ^ 193;
        lIIlllllI[99] = (40 ^ 34) ^ (99 ^ 59);
        lIIlllllI[100] = 25 ^ 74;
        lIIlllllI[101] = (87 ^ 21) ^ (6 ^ 16);
        lIIlllllI[102] = (((80 + 55) - 21) + 35) ^ (((108 + 104) - 204) + 184);
        lIIlllllI[103] = (144 ^ 160) ^ (1 ^ 103);
        lIIlllllI[104] = (7 ^ 56) ^ (65 ^ 41);
        lIIlllllI[105] = 90 ^ 2;
        lIIlllllI[106] = 26 ^ 67;
        lIIlllllI[107] = 108 ^ 54;
        lIIlllllI[108] = (((97 + 9) - 64) + 113) ^ (((186 + 185) - 257) + 78);
        lIIlllllI[109] = 252 ^ 160;
        lIIlllllI[110] = ((211 ^ 132) & ((151 ^ 192) ^ (-1))) ^ (253 ^ 160);
        lIIlllllI[111] = (239 ^ 138) ^ (54 ^ 13);
        lIIlllllI[112] = 232 ^ 183;
        lIIlllllI[113] = 112 ^ 16;
        lIIlllllI[114] = (88 ^ 99) ^ (154 ^ 192);
        lIIlllllI[115] = (13 ^ 63) ^ (146 ^ 194);
        lIIlllllI[116] = (((139 + 147) - 168) + 134) ^ (((6 + 64) - 62) + 151);
        lIIlllllI[117] = (3 ^ 37) ^ (199 ^ 133);
        lIIlllllI[118] = (((94 ^ 126) + (174 ^ 153)) - (14 ^ 59)) + (29 ^ 106);
        lIIlllllI[119] = 63 ^ 90;
        lIIlllllI[120] = (-20549) & 24044;
        lIIlllllI[121] = (-(80 ^ 85)) & (-8769) & 12270;
        lIIlllllI[122] = (-4121) & 7615;
        lIIlllllI[123] = (-((-3553) & 28659)) & (-4161) & 32763;
        lIIlllllI[124] = (-((-4231) & 29383)) & (-25) & 28670;
        lIIlllllI[125] = (-((-20641) & 29429)) & (-20481) & 32767;
        lIIlllllI[126] = (-595) & 4087;
        lIIlllllI[127] = (128 ^ 176) ^ (200 ^ 158);
        lIIlllllI[128] = "   ".length() ^ (194 ^ 166);
        lIIlllllI[129] = 106 ^ 2;
        lIIlllllI[130] = (109 ^ 72) ^ (97 ^ 45);
        lIIlllllI[131] = 111 ^ 5;
        lIIlllllI[132] = 18 ^ 126;
        lIIlllllI[133] = (((20 + 189) - 58) + 43) ^ (((105 + 158) - 179) + 91);
        lIIlllllI[134] = 234 ^ 132;
        lIIlllllI[135] = (229 ^ 136) ^ "  ".length();
        lIIlllllI[136] = (121 ^ 45) ^ (132 ^ 160);
        lIIlllllI[137] = 233 ^ 152;
        lIIlllllI[138] = (125 ^ 6) ^ (138 ^ 131);
        lIIlllllI[139] = 204 ^ 191;
        lIIlllllI[140] = 197 ^ 177;
        lIIlllllI[141] = ((40 ^ 120) & ((67 ^ 19) ^ (-1))) ^ (123 ^ 14);
        lIIlllllI[142] = (-1094) & 10093;
        lIIlllllI[143] = (-((-4637) & 32478)) & (-1) & 28141;
        lIIlllllI[144] = (-((-11401) & 28090)) & (-4099) & 32767;
        lIIlllllI[145] = (-((-20737) & 21848)) & (-513) & 26623;
        lIIlllllI[146] = (-20545) & 21444;
        lIIlllllI[147] = (200 ^ 185) ^ (90 ^ 93);
        lIIlllllI[148] = 112 ^ 7;
        lIIlllllI[149] = (-(80 ^ 122)) & (-4929) & 8191;
        lIIlllllI[150] = (-((-3081) & 11791)) & (-41) & 12223;
        lIIlllllI[151] = (-(2 ^ 35)) & (-25233) & 28671;
        lIIlllllI[152] = (-25165) & 28653;
        lIIlllllI[153] = (-20497) & 30398;
        lIIlllllI[154] = (-49) & 8061;
        lIIlllllI[155] = (-1537) & 7958;
        lIIlllllI[156] = (-8713) & 12127;
        lIIlllllI[157] = (-2) & 3413;
        lIIlllllI[158] = (-((-10113) & 30594)) & (-595) & 24563;
        lIIlllllI[159] = (-((-18535) & 23271)) & (-24577) & 32734;
        lIIlllllI[160] = (-((-25135) & 31535)) & (-16449) & 32735;
        lIIlllllI[161] = (-((-16337) & 32724)) & (-12937) & 32763;
        lIIlllllI[162] = (-((-4839) & 23543)) & (-4097) & 32695;
        lIIlllllI[163] = (-((-43) & 28267)) & (-4098) & 32623;
        lIIlllllI[164] = (-2561) & 2867;
        lIIlllllI[165] = 198 ^ 190;
        lIIlllllI[166] = 253 ^ 132;
        lIIlllllI[167] = 7 ^ 125;
        lIIlllllI[168] = (((45 + 61) - (-136)) + 3) ^ (((106 + 81) - 166) + 121);
        lIIlllllI[169] = 45 ^ 81;
        lIIlllllI[170] = (((6 + 128) - (-82)) + 26) ^ (((24 + 90) - (-26)) + 3);
        lIIlllllI[171] = 88 ^ 38;
        lIIlllllI[172] = (((149 ^ 172) + (242 ^ 131)) - (116 ^ 74)) + (82 ^ 65);
        lIIlllllI[173] = (((109 ^ 82) + (152 ^ 142)) - (40 ^ 123)) + (86 ^ 40);
        lIIlllllI[174] = ((73 + 105) - 57) + 8;
        lIIlllllI[175] = ((87 + 113) - 157) + 87;
        lIIlllllI[176] = (((223 ^ 151) + (199 ^ 176)) - (((39 + 2) - (-51)) + 69)) + (194 ^ 167);
        lIIlllllI[177] = (((106 ^ 70) + (((79 + 79) - 50) + 19)) - (64 ^ 11)) + (54 ^ 18);
        lIIlllllI[178] = ((99 + 77) - 132) + 89;
        lIIlllllI[179] = (((((45 + 13) - (-1)) + 68) + (6 ^ 52)) - (209 ^ 155)) + (53 ^ 42);
        lIIlllllI[180] = (((((83 + 97) - 83) + 32) + (39 ^ 71)) - (((4 + 19) - (-25)) + 104)) + (139 ^ 181);
        lIIlllllI[181] = ((78 + 49) - 121) + 130;
        lIIlllllI[182] = (((22 ^ 104) + (51 ^ 21)) - (65 ^ 2)) + (76 ^ 100);
        lIIlllllI[183] = (((74 ^ 69) + (15 ^ 116)) - (49 ^ 31)) + (72 ^ 102);
        lIIlllllI[184] = ((24 + 136) - 68) + 47;
        lIIlllllI[185] = (((42 ^ 46) + (103 ^ 30)) - (3 ^ 115)) + ((52 + 100) - 101) + 76;
    }

    private static void aY() {
        dw.add(Integer.valueOf(lIIlllllI[120]));
        "".length();
        dw.add(Integer.valueOf(lIIlllllI[121]));
        "".length();
        dw.add(Integer.valueOf(lIIlllllI[122]));
        "".length();
        dw.add(Integer.valueOf(lIIlllllI[123]));
        "".length();
        dw.add(Integer.valueOf(lIIlllllI[124]));
        "".length();
        dw.add(Integer.valueOf(lIIlllllI[125]));
        "".length();
        dw.add(Integer.valueOf(lIIlllllI[126]));
        "".length();
        while (lIIIIlIlIIlI(dw.isEmpty() ? 1 : 0) && lIIIIlIlIIlI(dw.isEmpty() ? 1 : 0)) {
            String[] strArr = new String[lIIlllllI[0]];
            strArr[lIIlllllI[1]] = lIIlllIll[lIIlllllI[127]];
            if (lIIIIlIlIIII(Inventory.contains(strArr) ? 1 : 0)) {
                "".length();
                if ((((2 ^ 33) ^ (102 ^ 23)) & (((78 ^ 54) ^ (151 ^ 189)) ^ (-" ".length()))) != 0) {
                    return;
                }
                return;
            }
            int[] iArr = new int[lIIlllllI[0]];
            iArr[lIIlllllI[1]] = dw.get(lIIlllllI[1]).intValue();
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIIIlIlIlII(nearest)) {
                String[] strArr2 = new String[lIIlllllI[0]];
                strArr2[lIIlllllI[1]] = lIIlllIll[lIIlllllI[128]];
                if (lIIIIlIlIIII(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIlllllI[0]];
                    strArr3[lIIlllllI[1]] = lIIlllIll[lIIlllllI[129]];
                    Inventory.getFirst(strArr3).useOn(nearest);
                    Time.sleepTicks(lIIlllllI[3]);
                    "".length();
                }
            }
            String[] strArr4 = new String[lIIlllllI[0]];
            strArr4[lIIlllllI[1]] = lIIlllIll[lIIlllllI[130]];
            if (lIIIIlIlIIlI(Inventory.contains(strArr4) ? 1 : 0)) {
                dw.remove(lIIlllllI[1]);
                "".length();
                Time.sleepTicks(lIIlllllI[5]);
                "".length();
            }
            "".length();
            if ((33 ^ 37) <= "   ".length()) {
                return;
            }
        }
    }

    private static boolean lIIIIlIlIIII(int i) {
        return i != 0;
    }

    private static void aZ() {
        if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[131]];
            WorldArea worldArea = new WorldArea(lIIlllllI[93], lIIlllllI[94], lIIlllllI[60], lIIlllllI[43], lIIlllllI[1]);
            if (lIIIIlIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(lIIlllllI[95], lIIlllllI[96], lIIlllllI[48], lIIlllllI[63], lIIlllllI[1]);
                if (lIIIIlIlIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));
                    "".length();
                    Time.sleepTicks(lIIlllllI[0]);
                    "".length();
                }
                if (lIIIIlIlIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                        Movement.walkTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));
                        "".length();
                        Time.sleepTicks(lIIlllllI[0]);
                        "".length();
                    }
                    if (lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                        String[] strArr = new String[lIIlllllI[0]];
                        strArr[lIIlllllI[1]] = lIIlllIll[lIIlllllI[2]];
                        TileObject nearest = TileObjects.getNearest(strArr);
                        if (lIIIIlIlIlII(nearest)) {
                            String[] strArr2 = new String[lIIlllllI[0]];
                            strArr2[lIIlllllI[1]] = lIIlllIll[lIIlllllI[132]];
                            if (lIIIIlIlIIII(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIIlllIll[lIIlllllI[133]]);
                                Time.sleepTicks(lIIlllllI[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lIIlllllI[0]];
                            strArr3[lIIlllllI[1]] = lIIlllIll[lIIlllllI[134]];
                            if (lIIIIlIlIIII(nearest.hasAction(strArr3) ? 1 : 0)) {
                                nearest.interact(lIIlllIll[lIIlllllI[135]]);
                                Time.sleepTicks(lIIlllllI[10]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIIIIlIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(ds);
                "".length();
                Time.sleepTicks(lIIlllllI[0]);
                "".length();
            }
        }
    }

    private static String lIIIIIlllIll(String lllllIlIIlIlll, String lllllIlIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), lIIlllllI[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllllI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIlIIllIII) {
            lllllIlIIllIII.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIlllIlI(String lllllIlIlllIIl, String lllllIlIlllIII) {
        String lllllIlIlllIIl2 = new String(Base64.getDecoder().decode(lllllIlIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIlIllIlll = new StringBuilder();
        char[] lllllIlIllIllI = lllllIlIlllIII.toCharArray();
        int lllllIlIllIlIl = lIIlllllI[1];
        char[] charArray = lllllIlIlllIIl2.toCharArray();
        int lllllIlIlIlllI = charArray.length;
        int i = lIIlllllI[1];
        while (lIIIIlIlIIIl(i, lllllIlIlIlllI)) {
            char lllllIlIlllIlI = charArray[i];
            lllllIlIllIlll.append((char) (lllllIlIlllIlI ^ lllllIlIllIllI[lllllIlIllIlIl % lllllIlIllIllI.length]));
            "".length();
            lllllIlIllIlIl++;
            i++;
            "".length();
            if ((199 ^ 195) <= ((128 ^ 161) & ((65 ^ 96) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lllllIlIllIlll);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0176, code lost:
        if (lIIIIlIlIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0024y.lIIlllllI[15]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2 = new int[lIIlllllI[0]];
        iArr2[lIIlllllI[1]] = lIIlllllI[14];
        if (lIIIIlIlIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllllI[14], lIIlllllI[0], lIIlllllI[142]));
            "".length();
        }
        int[] iArr3 = new int[lIIlllllI[0]];
        iArr3[lIIlllllI[1]] = lIIlllllI[8];
        if (lIIIIlIlIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllllI[8], lIIlllllI[0], lIIlllllI[142]));
            "".length();
        }
        int[] iArr4 = new int[lIIlllllI[0]];
        iArr4[lIIlllllI[1]] = lIIlllllI[11];
        if (lIIIIlIlIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllllI[11], lIIlllllI[3], C0008i.bq));
            "".length();
        }
        int[] iArr5 = new int[lIIlllllI[0]];
        iArr5[lIIlllllI[1]] = lIIlllllI[12];
        if (lIIIIlIlIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllllI[12], lIIlllllI[41], lIIlllllI[143]));
            "".length();
        }
        int[] iArr6 = new int[lIIlllllI[0]];
        iArr6[lIIlllllI[1]] = lIIlllllI[9];
        if (lIIIIlIlIIII(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIlllllI[0]];
            iArr7[lIIlllllI[1]] = lIIlllllI[9];
            if (lIIIIlIlIIII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlllllI[0]];
                iArr8[lIIlllllI[1]] = lIIlllllI[9];
            }
            if (lIIIIlIlIIlI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIlllIll[lIIlllllI[148]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllllI[144], lIIlllllI[3], lIIlllllI[145]));
                "".length();
            }
            iArr = new int[lIIlllllI[0]];
            iArr[lIIlllllI[1]] = lIIlllllI[7];
            if (lIIIIlIlIIlI(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bv.add(new C0003d(lIIlllllI[7], lIIlllllI[51], lIIlllllI[146]));
            "".length();
            return;
        }
        bv.add(new C0003d(lIIlllllI[9], lIIlllllI[15], lIIlllllI[107]));
        "".length();
        if (lIIIIlIlIIlI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIlllIll[lIIlllllI[148]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIIlllllI[0]];
        iArr[lIIlllllI[1]] = lIIlllllI[7];
        if (lIIIIlIlIIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static void ba() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIIIlIlIlII(nearest) && lIIIIlIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[136]];
            C0000a.a(nearest);
        }
        if (lIIIIlIlIlII(nearest) && lIIIIlIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIlllllI[4]);
                "".length();
            }
            if (lIIIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[137]];
                if (lIIIIlIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIlllllI[6]);
                    "".length();
                }
                C0000a.a(lIIlllllI[7], lIIlllllI[13]);
                C0000a.a(lIIlllllI[11], lIIlllllI[0]);
                C0000a.a(lIIlllllI[9], lIIlllllI[41]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[lIIlllllI[0]];
        strArr[lIIlllllI[1]] = lIIlllIll[lIIlllllI[141]];
        if (lIIIIlIlIlIl(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIIlllllI[0]];
            iArr[lIIlllllI[1]] = lIIlllllI[12];
            if (lIIIIlIlIlIl(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIIlllllI[0]];
                iArr2[lIIlllllI[1]] = lIIlllllI[7];
                if (lIIIIlIlIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlllllI[0]];
                    iArr3[lIIlllllI[1]] = lIIlllllI[9];
                    if (lIIIIlIlIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = lIIlllllI[0];
                        "".length();
                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lIIlllllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIIlIllIlI(C0004e.j(du), lIIlllllI[72]) && lIIIIlIllIlI(C0004e.j(dv), lIIlllllI[3])) {
            ?? r0 = lIIlllllI[0];
            "".length();
            return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlllllI[1];
    }

    private static boolean lIIIIlIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIlIlIlIl(int i) {
        return i > 0;
    }

    private static boolean lIIIIlIlIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bc() {
        String[] strArr = new String[lIIlllllI[0]];
        strArr[lIIlllllI[1]] = lIIlllIll[lIIlllllI[140]];
        if (lIIIIlIlIlIl(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIIlllllI[0]];
            iArr[lIIlllllI[1]] = lIIlllllI[12];
            if (lIIIIlIlIlIl(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIIlllllI[0]];
                iArr2[lIIlllllI[1]] = lIIlllllI[11];
                if (lIIIIlIlIlIl(Inventory.getCount(iArr2))) {
                    int[] iArr3 = new int[lIIlllllI[0]];
                    iArr3[lIIlllllI[1]] = lIIlllllI[7];
                    if (lIIIIlIlIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = lIIlllllI[0];
                        "".length();
                        return ((125 ^ 20) ^ (242 ^ 159)) < (-" ".length()) ? ("   ".length() ^ (59 ^ 52)) & (((173 ^ 154) ^ (154 ^ 161)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return lIIlllllI[1];
    }
}
