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
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.X  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/X.class */
public class X implements W {
    static /* synthetic */ WorldArea kA;
    private static /* synthetic */ int[] lIIlIlIIl;
    public static /* synthetic */ int ky;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea kB;
    static /* synthetic */ WorldArea kC;
    public static /* synthetic */ int kz;
    public static /* synthetic */ int kx;
    private static /* synthetic */ String[] lIIlIIllI;
    private static /* synthetic */ WorldPoint kD;

    private static void llllIllIllI() {
        lIIlIIllI = new String[lIIlIlIIl[238]];
        lIIlIIllI[lIIlIlIIl[0]] = llllIlIIIlI("OiAzPBwfdSMhFxUm", "xUJUr");
        lIIlIIllI[lIIlIlIIl[1]] = llllIlIIIlI("DiMGERQgLwxYBT0zARYAaCMcHQo7ZkgLECE+CxAOJi1IGgYrIUgMCGgrDxELIT4R", "HJhxg");
        lIIlIIllI[lIIlIlIIl[3]] = llllIlIIIll("fmaN8cYXN17nFnQCUQLAkEqkNQZslwoZ", "fiYgl");
        lIIlIIllI[lIIlIlIIl[10]] = llllIlIIIlI("HwIdIjg+DRRmNjYNGC86MA==", "WcsFT");
        lIIlIIllI[lIIlIlIIl[17]] = llllIlIIIlI("GSNGJB8rZgssHj0vCCJNPzMDNhluNRM1HSIvAzZBbjURLBktLg8rCm4yCWUvGx8vCyo=", "NFfEm");
        lIIlIIllI[lIIlIlIIl[19]] = llllIlIIlII("UInm95hJmI4=", "dHtkQ");
        lIIlIIllI[lIIlIlIIl[21]] = llllIlIIIlI("JREvHA==", "sxNpQ");
        lIIlIIllI[lIIlIlIIl[23]] = llllIlIIIll("1HTwTbxv8v0=", "pITlM");
        lIIlIIllI[lIIlIlIIl[25]] = llllIlIIIlI("DzgHLBk=", "KJnBr");
        lIIlIIllI[lIIlIlIIl[27]] = llllIlIIlII("I99Dt/9LEak=", "yqpLN");
        lIIlIIllI[lIIlIlIIl[12]] = llllIlIIIlI("LCocbD4Naw0iJQ8uSi8lFzkZKQ==", "bKjLJ");
        lIIlIIllI[lIIlIlIIl[50]] = llllIlIIlII("oiG5FyEXvolAsSpXpRNUnA==", "CHnNL");
        lIIlIIllI[lIIlIlIIl[64]] = llllIlIIIlI("LgwTTzIDDxUBMwc=", "bctoP");
        lIIlIIllI[lIIlIlIIl[65]] = llllIlIIlII("zis8bG1+EdGHwsMwttfuSw==", "ktnsB");
        lIIlIIllI[lIIlIlIIl[54]] = llllIlIIlII("Ji8CBvyWawXhZADS0HmXGQ==", "YypUQ");
        lIIlIIllI[lIIlIlIIl[39]] = llllIlIIIll("5vAnxhVYmB3POwLDBAHozg==", "TWdfJ");
        lIIlIIllI[lIIlIlIIl[66]] = llllIlIIlII("5IzFG50h5GdpWSMV1JSHLQ==", "cdWIX");
        lIIlIIllI[lIIlIlIIl[67]] = llllIlIIIlI("KCIAJDQCIA5pNBkvByo+", "kNiIV");
        lIIlIIllI[lIIlIlIIl[55]] = llllIlIIIlI("HxAhAWwpECUKLyM=", "KbDdL");
        lIIlIIllI[lIIlIlIIl[68]] = llllIlIIlII("TmmmlCcIlJI=", "xYFOB");
        lIIlIIllI[lIIlIlIIl[41]] = llllIlIIIll("v6qwkqvHXZv3RRRObDHvPA==", "xaFXh");
        lIIlIIllI[lIIlIlIIl[69]] = llllIlIIIlI("NhAvDCoXGC0KZAYeMwg=", "tqCmD");
        lIIlIIllI[lIIlIlIIl[62]] = llllIlIIIlI("AwA0Emw7Dw==", "TaXyA");
        lIIlIIllI[lIIlIlIIl[70]] = llllIlIIIll("+I9zS9Mcz8uw9VW1oIRcsg==", "bkLqX");
        lIIlIIllI[lIIlIlIIl[71]] = llllIlIIlII("+4h9zxJtpDKYYb5dRCmo/A==", "maEhC");
        lIIlIIllI[lIIlIlIIl[42]] = llllIlIIIll("5KeLYNOpna2lZM5IS+JBnw==", "QPdOI");
        lIIlIIllI[lIIlIlIIl[72]] = llllIlIIIlI("NTkdHA8fOxNRAxMh", "vUtqm");
        lIIlIIllI[lIIlIlIIl[73]] = llllIlIIIlI("KDQWPxYEOgBrGQIi", "gVeKw");
        lIIlIIllI[lIIlIlIIl[74]] = llllIlIIIll("6Pz/mAwNYmU/nfTA6EhlhQ==", "vkzmq");
        lIIlIIllI[lIIlIlIIl[75]] = llllIlIIIll("0AzavzDp7jb46yWinVCR+w==", "dlnUg");
        lIIlIIllI[lIIlIlIIl[43]] = llllIlIIlII("FwHZnqu8Az/h0fYTiiBBuQ==", "jpSYi");
        lIIlIIllI[lIIlIlIIl[76]] = llllIlIIIlI("FjYTNSY/IkskKzcoEzcr", "EGfPC");
        lIIlIIllI[lIIlIlIIl[96]] = llllIlIIIll("jGSCDhckckIlMxN+hKD1Zw==", "swxtu");
        lIIlIIllI[lIIlIlIIl[98]] = llllIlIIlII("fLJ8BPU0J1J7AnnHew8ElA==", "aaHpc");
        lIIlIIllI[lIIlIlIIl[99]] = llllIlIIIll("DR2hwcrVj4OiXsiPKHf9VQ==", "YqiKH");
        lIIlIIllI[lIIlIlIIl[100]] = llllIlIIIlI("ERo+BwF3GCobDncaJUkCJRo+BwE=", "WuKie");
        lIIlIIllI[lIIlIlIIl[101]] = llllIlIIIll("l1KiXbX9DWY=", "fZjDz");
        lIIlIIllI[lIIlIlIIl[102]] = llllIlIIlII("zYd25s7L0cziaGvY6qjkDQ==", "xhBGC");
        lIIlIIllI[lIIlIlIIl[103]] = llllIlIIIll("QPup9EVgCZmOQEw4pQuCng==", "NFElh");
        lIIlIIllI[lIIlIlIIl[104]] = llllIlIIIlI("KC0/OwY=", "kAVVd");
        lIIlIIllI[lIIlIlIIl[38]] = llllIlIIlII("Zi1IsU9Gw/nDx5O6KFev3vmTRBadbHm3", "ltsyY");
        lIIlIIllI[lIIlIlIIl[106]] = llllIlIIlII("g22gTXS/d7tvq8KlYtpoZw==", "LANvP");
        lIIlIIllI[lIIlIlIIl[107]] = llllIlIIlII("ztoHBWHWevg=", "puNtI");
        lIIlIIllI[lIIlIlIIl[108]] = llllIlIIIll("9q/1UkiAfiM=", "uDiHi");
        lIIlIIllI[lIIlIlIIl[109]] = llllIlIIIlI("PQAZ", "zaieH");
        lIIlIIllI[lIIlIlIIl[2]] = llllIlIIIll("DN/HHimsGhs=", "WRNQY");
        lIIlIIllI[lIIlIlIIl[110]] = llllIlIIlII("QGysHRpRq74UTNplFYWQkg==", "ttNDe");
        lIIlIIllI[lIIlIlIIl[111]] = llllIlIIIll("z1xrup3ywgg=", "RcnNg");
        lIIlIIllI[lIIlIlIIl[112]] = llllIlIIIll("5aOyA/ANr0A=", "FComD");
        lIIlIIllI[lIIlIlIIl[113]] = llllIlIIIll("zasGQaR0wA7LGILKiMofdg==", "NXtAO");
        lIIlIIllI[lIIlIlIIl[40]] = llllIlIIlII("Mjn5DxtszK8=", "WQAWt");
        lIIlIIllI[lIIlIlIIl[7]] = llllIlIIIll("cTFUruLh998=", "kBoHE");
        lIIlIIllI[lIIlIlIIl[114]] = llllIlIIIll("tN4VPDH4SK3Cz7LNJK9jbA==", "NgMMt");
        lIIlIIllI[lIIlIlIIl[116]] = llllIlIIlII("OabSL4c7lzs=", "rGgDw");
        lIIlIIllI[lIIlIlIIl[117]] = llllIlIIIlI("LCIsKRwIMGE+FBZ3cg==", "fWAYu");
        lIIlIIllI[lIIlIlIIl[119]] = llllIlIIlII("0OUoXGKq6Rw=", "xZnzF");
        lIIlIIllI[lIIlIlIIl[120]] = llllIlIIIll("UrxWDIdWYvjO7JvmPOO61A==", "bzNwd");
        lIIlIIllI[lIIlIlIIl[122]] = llllIlIIIlI("OTkICRoU", "qLzmv");
        lIIlIIllI[lIIlIlIIl[123]] = llllIlIIlII("3PMYO6USmqLkEbgtaEO9e3UHiKysKEHO", "CGAeb");
        lIIlIIllI[lIIlIlIIl[124]] = llllIlIIIll("jEihaxXrJxs=", "SplcZ");
        lIIlIIllI[lIIlIlIIl[45]] = llllIlIIIll("rBlN2BBFq2Sd8xC4pAqkfw==", "UwCIE");
        lIIlIIllI[lIIlIlIIl[140]] = llllIlIIIlI("OiUgYjobZDUjIBUiPzFuFysjMD0R", "tDVBN");
        lIIlIIllI[lIIlIlIIl[6]] = llllIlIIIll("ffjcThZWnwjbJMVuFQRilA==", "RdYXk");
        lIIlIIllI[lIIlIlIIl[141]] = llllIlIIlII("12lkztS7ioB7284K6jKYhA==", "Mbvvw");
        lIIlIIllI[lIIlIlIIl[142]] = llllIlIIIlI("OA8dCHUYHBQB", "lnqdU");
        lIIlIIllI[lIIlIlIIl[143]] = llllIlIIIll("8Fv+h+GJ4z4=", "hdSYB");
        lIIlIIllI[lIIlIlIIl[144]] = llllIlIIIlI("FzMABms1NFIKOTsxFw==", "ZRrmK");
        lIIlIIllI[lIIlIlIIl[145]] = llllIlIIIlI("GiwxJTwpbTctICU=", "NMZLR");
        lIIlIIllI[lIIlIlIIl[146]] = llllIlIIlII("AQOE6BKOzvdvsvcYY1Mnva7m26nSkhLK", "qThCD");
        lIIlIIllI[lIIlIlIIl[147]] = llllIlIIlII("7wy5oZ5x28I=", "LPRNz");
        lIIlIIllI[lIIlIlIIl[148]] = llllIlIIlII("Sx0UMw9gyoqnfWoKyoC2Kg==", "zLMQI");
        lIIlIIllI[lIIlIlIIl[149]] = llllIlIIIlI("CSM6Eg==", "CVWbp");
        lIIlIIllI[lIIlIlIIl[150]] = llllIlIIIlI("OSYbJg0dNFYxBQNzRA==", "sSvVd");
        lIIlIIllI[lIIlIlIIl[151]] = llllIlIIIll("F3A34DPmngE=", "LiiGf");
        lIIlIIllI[lIIlIlIIl[152]] = llllIlIIIlI("CR0rEgctD2YFDzNIdQ==", "ChFbn");
        lIIlIIllI[lIIlIlIIl[153]] = llllIlIIlII("rtZ+TUL8RAY=", "zYPao");
        lIIlIIllI[lIIlIlIIl[154]] = llllIlIIlII("m0S9nZiYPAu2uXnzjU/Udw==", "HMVPh");
        lIIlIIllI[lIIlIlIIl[155]] = llllIlIIlII("ya2l7BnLe3M=", "VSVwc");
        lIIlIIllI[lIIlIlIIl[156]] = llllIlIIIlI("IjY5Kh8dOSs=", "tWLFk");
        lIIlIIllI[lIIlIlIIl[157]] = llllIlIIIlI("NAQnJxE=", "beRKe");
        lIIlIIllI[lIIlIlIIl[158]] = llllIlIIIlI("HBE3BCQ4A3oTLCZEbw==", "VdZtM");
        lIIlIIllI[lIIlIlIIl[159]] = llllIlIIlII("D6+M+TpZKEM=", "nmtLy");
        lIIlIIllI[lIIlIlIIl[160]] = llllIlIIIlI("Jj0YEQECL1UGCRxoQw==", "lHuah");
        lIIlIIllI[lIIlIlIIl[161]] = llllIlIIlII("lDKyyx+rC00=", "EariP");
        lIIlIIllI[lIIlIlIIl[172]] = llllIlIIlII("TCqduSAG/XTGjpUfGflwqCP5LMpUvaUr", "MPvpi");
        lIIlIIllI[lIIlIlIIl[173]] = llllIlIIIlI("OwM4RwUaQj0TEAcW", "ubNgq");
        lIIlIIllI[lIIlIlIIl[174]] = llllIlIIlII("mBD89cNofGSE4EFKuj9P3g==", "QOAVr");
        lIIlIIllI[lIIlIlIIl[175]] = llllIlIIIlI("HRcVAQ==", "Jvymv");
        lIIlIIllI[lIIlIlIIl[36]] = llllIlIIIll("uMtYquvkOKe0nYWBzCzdrw==", "YVxYu");
        lIIlIIllI[lIIlIlIIl[176]] = llllIlIIIlI("ARURKW8jEkMlPS0XBg==", "LtcBO");
        lIIlIIllI[lIIlIlIIl[177]] = llllIlIIlII("pip4a0OJkXPShAXRpZ6cAg==", "eGCrk");
        lIIlIIllI[lIIlIlIIl[178]] = llllIlIIlII("fTCVeSZO4ZKk5/L0g+yJrylTO7QQbP78", "jSNxN");
        lIIlIIllI[lIIlIlIIl[179]] = llllIlIIlII("c3d1n1ZcrnI=", "Rtmmw");
        lIIlIIllI[lIIlIlIIl[180]] = llllIlIIIll("Le3r+EyqktcdTwgJE7CoMA==", "DDAlV");
        lIIlIIllI[lIIlIlIIl[80]] = llllIlIIIll("xdR+3BeWCns=", "NCuBR");
        lIIlIIllI[lIIlIlIIl[181]] = llllIlIIlII("yHj4ODwm8PdS3agjO1TkPA==", "rwiAP");
        lIIlIIllI[lIIlIlIIl[182]] = llllIlIIIlI("KRwuBzA=", "jnAtC");
        lIIlIIllI[lIIlIlIIl[183]] = llllIlIIIlI("KycgGBwPNW0PFBFyfg==", "aRMhu");
        lIIlIIllI[lIIlIlIIl[184]] = llllIlIIIlI("Og81PQ==", "pzXMz");
        lIIlIIllI[lIIlIlIIl[185]] = llllIlIIIll("Em1wpbtRxmEYkB1SkxD7PA==", "KQDNl");
        lIIlIIllI[lIIlIlIIl[186]] = llllIlIIIll("TV1/zDmJ6ek=", "fjiHr");
        lIIlIIllI[lIIlIlIIl[187]] = llllIlIIIll("PUmjuCuMZC98y1l7/Nl+Zw==", "xEGJI");
        lIIlIIllI[lIIlIlIIl[188]] = llllIlIIIll("btgJ92kfy1k=", "wFDjx");
        lIIlIIllI[lIIlIlIIl[194]] = llllIlIIIlI("AiYUDBVkJAAQGmQmD0IWNiYUDBU=", "DIabq");
        lIIlIIllI[lIIlIlIIl[203]] = llllIlIIIlI("CSAwBCo8Pg==", "HGYhC");
        lIIlIIllI[lIIlIlIIl[204]] = llllIlIIIlI("ETckJjQGMw==", "aVWUU");
        lIIlIIllI[lIIlIlIIl[205]] = llllIlIIIlI("ODs5AwAvPw==", "HZJpa");
        lIIlIIllI[lIIlIlIIl[206]] = llllIlIIlII("Pys7Ww7uii4=", "tCtGo");
        lIIlIIllI[lIIlIlIIl[207]] = llllIlIIlII("Qu3pNd+FA/M=", "wPggt");
        lIIlIIllI[lIIlIlIIl[208]] = llllIlIIlII("Mm7uReZP9/U=", "yVxWA");
        lIIlIIllI[lIIlIlIIl[211]] = llllIlIIIll("nb1/oA90IM0=", "mCADp");
        lIIlIIllI[lIIlIlIIl[213]] = llllIlIIIll("oaBKqNtwS28=", "oyCsJ");
        lIIlIIllI[lIIlIlIIl[216]] = llllIlIIIll("/TAs3RsFmKfmvJtut5Z/NQ==", "BmbGb");
        lIIlIIllI[lIIlIlIIl[218]] = llllIlIIIll("HcefdgLnzvk=", "AsAfw");
        lIIlIIllI[lIIlIlIIl[221]] = llllIlIIlII("sq5Y6xhWp7Y=", "rpZSU");
        lIIlIIllI[lIIlIlIIl[224]] = llllIlIIIlI("MRgl", "vyUxG");
        lIIlIIllI[lIIlIlIIl[226]] = llllIlIIIlI("FzsYNGoxNQE9Mw==", "GTtQG");
        lIIlIIllI[lIIlIlIIl[227]] = llllIlIIlII("35Yh8BKQi1Y=", "cjTKK");
        lIIlIIllI[lIIlIlIIl[230]] = llllIlIIIll("T3fUliaap0Y=", "ZyDJY");
        lIIlIIllI[lIIlIlIIl[232]] = llllIlIIlII("200376Edh94=", "MbGBu");
        lIIlIIllI[lIIlIlIIl[233]] = llllIlIIIll("43AcKeuYFOs=", "ZMeYx");
    }

    private static boolean lllllIIIIII(int i, int i2) {
        return i <= i2;
    }

    private static void dh() {
        new WorldArea(lIIlIlIIl[47], lIIlIlIIl[48], lIIlIlIIl[12], lIIlIlIIl[21], lIIlIlIIl[0]);
        WorldArea worldArea = new WorldArea(lIIlIlIIl[47], lIIlIlIIl[49], lIIlIlIIl[50], lIIlIlIIl[25], lIIlIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[47], lIIlIlIIl[51], lIIlIlIIl[50], lIIlIlIIl[25], lIIlIlIIl[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[52], lIIlIlIIl[53], lIIlIlIIl[54], lIIlIlIIl[55], lIIlIlIIl[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[56], lIIlIlIIl[57], lIIlIlIIl[25], lIIlIlIIl[12], lIIlIlIIl[3]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[58], lIIlIlIIl[59], lIIlIlIIl[50], lIIlIlIIl[12], lIIlIlIIl[0]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[60], lIIlIlIIl[61], lIIlIlIIl[12], lIIlIlIIl[21], lIIlIlIIl[0]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[47], lIIlIlIIl[48], lIIlIlIIl[62], lIIlIlIIl[21], lIIlIlIIl[0]);
        if (llllIlllIlI(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(kB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(kC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[12]];
            C0004e.b(kD);
            Time.sleepTicks(lIIlIlIIl[1]);
            "".length();
        }
        if (!(llllIlllIlI(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(kB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llllIlllIII(kC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llllIllllll(Players.getLocal().getAnimation(), lIIlIlIIl[63]) && llllIlllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            if (llllIlllIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[50]];
                String[] strArr = new String[lIIlIlIIl[1]];
                strArr[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[64]];
                TileObjects.getNearest(strArr).interact(lIIlIIllI[lIIlIlIIl[65]]);
                Time.sleepTicks(lIIlIlIIl[3]);
                "".length();
            }
            if (llllIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[54]];
                String[] strArr2 = new String[lIIlIlIIl[1]];
                strArr2[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[39]];
                TileObjects.getNearest(strArr2).interact(lIIlIIllI[lIIlIlIIl[66]]);
                Time.sleepTicks(lIIlIlIIl[3]);
                "".length();
            }
            if (llllIlllIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[67]];
                String[] strArr3 = new String[lIIlIlIIl[1]];
                strArr3[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[55]];
                TileObjects.getNearest(strArr3).interact(lIIlIIllI[lIIlIlIIl[68]]);
                Time.sleepTicks(lIIlIlIIl[3]);
                "".length();
            }
            if (llllIlllIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[41]];
                String[] strArr4 = new String[lIIlIlIIl[1]];
                strArr4[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[69]];
                TileObjects.getNearest(strArr4).interact(lIIlIIllI[lIIlIlIIl[62]]);
                Time.sleepTicks(lIIlIlIIl[19]);
                "".length();
            }
            if (llllIlllIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[70]];
                String[] strArr5 = new String[lIIlIlIIl[1]];
                strArr5[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[71]];
                TileObjects.getNearest(strArr5).interact(lIIlIIllI[lIIlIlIIl[42]]);
                Time.sleepTicks(lIIlIlIIl[17]);
                "".length();
            }
            if (llllIlllIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[72]];
                String[] strArr6 = new String[lIIlIlIIl[1]];
                strArr6[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[73]];
                TileObjects.getNearest(strArr6).interact(lIIlIIllI[lIIlIlIIl[74]]);
                Time.sleepTicks(lIIlIlIIl[10]);
                "".length();
            }
            if (llllIlllIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[75]];
                String[] strArr7 = new String[lIIlIlIIl[1]];
                strArr7[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[43]];
                TileObjects.getNearest(strArr7).interact(lIIlIIllI[lIIlIlIIl[76]]);
                Time.sleepTicks(lIIlIlIIl[17]);
                "".length();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (llllIlllllI(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[2])) {
            ?? r0 = lIIlIlIIl[1];
            "".length();
            return (((((156 + 36) - 9) + 64) ^ (((109 + 158) - 101) + 33)) & (((127 ^ 68) ^ (99 ^ 104)) ^ (-" ".length()))) != 0 ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
        }
        return lIIlIlIIl[0];
    }

    private static void di() {
        WorldArea worldArea = new WorldArea(lIIlIlIIl[77], lIIlIlIIl[78], lIIlIlIIl[79], lIIlIlIIl[80], lIIlIlIIl[1]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[77], lIIlIlIIl[78], lIIlIlIIl[79], lIIlIlIIl[80], lIIlIlIIl[3]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[77], lIIlIlIIl[78], lIIlIlIIl[79], lIIlIlIIl[80], lIIlIlIIl[10]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[81], lIIlIlIIl[82], lIIlIlIIl[70], lIIlIlIIl[65], lIIlIlIIl[0]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[83], lIIlIlIIl[82], lIIlIlIIl[12], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[84], lIIlIlIIl[85], lIIlIlIIl[64], lIIlIlIIl[50], lIIlIlIIl[10]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[86], lIIlIlIIl[87], lIIlIlIIl[27], lIIlIlIIl[23], lIIlIlIIl[1]);
        WorldArea worldArea8 = new WorldArea(lIIlIlIIl[86], lIIlIlIIl[88], lIIlIlIIl[12], lIIlIlIIl[25], lIIlIlIIl[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIlIIl[89], lIIlIlIIl[90], lIIlIlIIl[76], lIIlIlIIl[41], lIIlIlIIl[10]);
        WorldArea worldArea10 = new WorldArea(lIIlIlIIl[91], lIIlIlIIl[92], lIIlIlIIl[67], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea11 = new WorldArea(lIIlIlIIl[93], lIIlIlIIl[94], lIIlIlIIl[23], lIIlIlIIl[27], lIIlIlIIl[10]);
        WorldArea worldArea12 = new WorldArea(lIIlIlIIl[93], lIIlIlIIl[95], lIIlIlIIl[12], lIIlIlIIl[23], lIIlIlIIl[10]);
        if (llllIlllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[96]];
            if (llllIlllIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (llllIlllIII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIIlIlIIl[97], lIIlIlIIl[53], lIIlIlIIl[0]));
            "".length();
            Time.sleepTicks(lIIlIlIIl[1]);
            "".length();
        }
        if (llllIllllll(Players.getLocal().getAnimation(), lIIlIlIIl[63]) && llllIlllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIIlIlIIl[1]];
            strArr[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[98]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (llllIlllIll(nearest) && llllIlllIII(dl() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[99]];
                System.out.println(lIIlIIllI[lIIlIlIIl[100]]);
                nearest.interact(lIIlIIllI[lIIlIlIIl[101]]);
                Time.sleepTicks(lIIlIlIIl[10]);
                "".length();
            }
            if (llllIlllIlI(dl() ? 1 : 0)) {
                if (llllIlllIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[102]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIIlIlIIl[1]];
                    strArr2[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[103]];
                    TileObjects.getNearest(strArr2).interact(lIIlIIllI[lIIlIlIIl[104]]);
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return (-" ".length()) >= (((223 ^ 193) ^ (253 ^ 199)) & (((127 ^ 67) ^ (90 ^ 66)) ^ (-" ".length()))) ? ((((120 + 23) - 70) + 117) ^ (((70 + 103) - 115) + 111)) & (((77 ^ 11) ^ (196 ^ 149)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
                if (llllIlllIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[38]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIIlIlIIl[1]];
                    strArr3[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[106]];
                    TileObjects.getNearest(strArr3).interact(lIIlIIllI[lIIlIlIIl[107]]);
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return "  ".length() < "  ".length() ? ((76 ^ 35) ^ (71 ^ 9)) & (((115 ^ 54) ^ (239 ^ 139)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
                if (llllIlllIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[108]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIIlIlIIl[1]];
                    strArr4[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[109]];
                    TileObjects.getNearest(strArr4).interact(lIIlIIllI[lIIlIlIIl[2]]);
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
                if (llllIlllIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIIlIlIIl[1]];
                    strArr5[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[111]];
                    TileObjects.getNearest(strArr5).interact(lIIlIIllI[lIIlIlIIl[112]]);
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return ((64 ^ 57) ^ (26 ^ 103)) <= (-" ".length()) ? ((((135 + 105) - 190) + 137) ^ (((85 + 116) - 109) + 83)) & (((((16 + 14) - (-3)) + 96) ^ (((67 + 129) - 111) + 64)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
                if (llllIlllIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIIlIlIIl[1]];
                    strArr6[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[40]];
                    TileObjects.getNearest(strArr6).interact(lIIlIIllI[lIIlIlIIl[7]]);
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return "  ".length() != "  ".length() ? ((182 ^ 161) ^ (121 ^ 90)) & (((46 ^ 82) ^ (87 ^ 31)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
                if (llllIlllIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIIlIlIIl[1]];
                    iArr[lIIlIlIIl[0]] = lIIlIlIIl[115];
                    TileObjects.getNearest(iArr).interact(lIIlIIllI[lIIlIlIIl[116]]);
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return ((((83 + 59) - 13) + 53) ^ (((94 + 114) - 178) + 149)) == 0 ? ((213 ^ 151) ^ (61 ^ 112)) & (((126 ^ 80) ^ (96 ^ 65)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
                if (llllIlllIII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIIlIlIIl[1]];
                    iArr2[lIIlIlIIl[0]] = lIIlIlIIl[118];
                    TileObjects.getNearest(iArr2).interact(lIIlIIllI[lIIlIlIIl[119]]);
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return (8 ^ 12) <= 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
                if (llllIlllIII(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIIlIlIIl[1]];
                    iArr3[lIIlIlIIl[0]] = lIIlIlIIl[121];
                    TileObjects.getNearest(iArr3).interact(lIIlIIllI[lIIlIlIIl[122]]);
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
                if (llllIlllIII(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIIlIlIIl[1]];
                    strArr7[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[124]];
                    TileObjects.getNearest(strArr7).interact(lIIlIIllI[lIIlIlIIl[45]]);
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return (53 ^ 49) < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
        }
    }

    private static String llllIlIIIll(String lIIIIllIIlIIlII, String lIIIIllIIlIIIll) {
        try {
            SecretKeySpec lIIIIllIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIllIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlIIl[3], lIIIIllIIlIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIllIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIllIIlIIlIl) {
            lIIIIllIIlIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlIlIIl[0];
    }

    private static boolean llllIllllll(int i, int i2) {
        return i == i2;
    }

    static {
        llllIllIlll();
        llllIllIllI();
        bv = new ArrayList();
        kx = lIIlIlIIl[28];
        ky = lIIlIlIIl[24];
        kA = new WorldArea(lIIlIlIIl[235], lIIlIlIIl[53], lIIlIlIIl[70], lIIlIlIIl[73], lIIlIlIIl[0]);
        kB = new WorldArea(lIIlIlIIl[235], lIIlIlIIl[53], lIIlIlIIl[70], lIIlIlIIl[73], lIIlIlIIl[1]);
        kC = new WorldArea(lIIlIlIIl[235], lIIlIlIIl[53], lIIlIlIIl[70], lIIlIlIIl[73], lIIlIlIIl[3]);
        kD = new WorldPoint(lIIlIlIIl[236], lIIlIlIIl[237], lIIlIlIIl[0]);
    }

    private static void dk() {
        WorldArea worldArea = new WorldArea(lIIlIlIIl[162], lIIlIlIIl[163], lIIlIlIIl[111], lIIlIlIIl[111], lIIlIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[162], lIIlIlIIl[163], lIIlIlIIl[111], lIIlIlIIl[111], lIIlIlIIl[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[162], lIIlIlIIl[163], lIIlIlIIl[111], lIIlIlIIl[111], lIIlIlIIl[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[162], lIIlIlIIl[163], lIIlIlIIl[111], lIIlIlIIl[111], lIIlIlIIl[10]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[164], lIIlIlIIl[133], lIIlIlIIl[65], lIIlIlIIl[12], lIIlIlIIl[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[165], lIIlIlIIl[139], lIIlIlIIl[39], lIIlIlIIl[54], lIIlIlIIl[3]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[166], lIIlIlIIl[134], lIIlIlIIl[50], lIIlIlIIl[27], lIIlIlIIl[3]);
        WorldArea worldArea8 = new WorldArea(lIIlIlIIl[167], lIIlIlIIl[136], lIIlIlIIl[71], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIlIIl[168], lIIlIlIIl[169], lIIlIlIIl[55], lIIlIlIIl[64], lIIlIlIIl[3]);
        WorldPoint worldPoint = new WorldPoint(lIIlIlIIl[170], lIIlIlIIl[171], lIIlIlIIl[0]);
        if (llllIlllIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llllIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIlIlIIl[1]);
            "".length();
        }
        if (llllIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llllIllllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIIl[21])) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIlIlIIl[1]);
                "".length();
            }
            if (lllllIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIIl[21])) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIlIlIIl[1]];
                strArr[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[175]];
                TileObjects.getNearest(strArr).interact(lIIlIIllI[lIIlIlIIl[36]]);
                Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return (10 ^ 14) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIl[0];
                }, lIIlIlIIl[105]);
                "".length();
                Time.sleepTicks(lIIlIlIIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIlIlIIl[1]];
        strArr2[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llllIlllIll(nearest) && llllIlllIII(dl() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[177]];
            System.out.println(lIIlIIllI[lIIlIlIIl[178]]);
            nearest.interact(lIIlIIllI[lIIlIlIIl[179]]);
            Time.sleepTicks(lIIlIlIIl[10]);
            "".length();
        }
        if (llllIlllIlI(dl() ? 1 : 0)) {
            if (llllIlllIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[218]]) ? 1 : 0) && lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[219], lIIlIlIIl[220], lIIlIlIIl[10])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return (-"  ".length()) >= 0 ? ((((35 + 24) - (-117)) + 41) ^ (((75 + 58) - 32) + 44)) & (((48 ^ 4) ^ (100 ^ 24)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[180]];
                    nearest2.interact(lIIlIIllI[lIIlIlIIl[80]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return " ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (llllIlllIII(dl() ? 1 : 0)) {
                return;
            }
            if (llllIlllIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llllIlllIII(tileObject2.getName().contains(lIIlIIllI[lIIlIlIIl[216]]) ? 1 : 0) && lllllIIIIII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[217], lIIlIlIIl[128], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return "  ".length() != "  ".length() ? " ".length() & (" ".length() ^ (-1)) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest3)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIlIIllI[lIIlIlIIl[182]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (llllIlllIII(dl() ? 1 : 0)) {
                return;
            }
            if (llllIlllIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llllIlllIII(tileObject3.getName().contains(lIIlIIllI[lIIlIlIIl[213]]) ? 1 : 0) && lllllIIIIII(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[214], lIIlIlIIl[215], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return (-" ".length()) == " ".length() ? ((150 ^ 159) ^ (107 ^ 57)) & (((88 ^ 63) ^ (105 ^ 85)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest4)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIlIIllI[lIIlIlIIl[184]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (llllIlllIII(dl() ? 1 : 0)) {
                return;
            }
            if (llllIlllIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llllIlllIII(tileObject4.getName().contains(lIIlIIllI[lIIlIlIIl[211]]) ? 1 : 0) && lllllIIIIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[209], lIIlIlIIl[212], lIIlIlIIl[10])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest5)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIlIIllI[lIIlIlIIl[186]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return " ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (!llllIlllIII(dl() ? 1 : 0) && llllIlllIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llllIlllIII(tileObject5.getName().contains(lIIlIIllI[lIIlIlIIl[208]]) ? 1 : 0) && lllllIIIIII(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[209], lIIlIlIIl[210], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return 0 != 0 ? ((119 ^ 93) ^ (52 ^ 76)) & (((((101 + 92) - 97) + 108) ^ (((106 + 8) - (-12)) + 32)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest6)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIlIIllI[lIIlIlIIl[188]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return ((80 ^ 111) ^ (74 ^ 113)) == (((115 ^ 8) ^ (43 ^ 117)) & (((((7 + 42) - (-21)) + 74) ^ (((5 + 1) - (-158)) + 17)) ^ (-" ".length()))) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llllIlllllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean ab() {
        if (llllIlllllI(Skills.getBoostedLevel(Skill.AGILITY), lIIlIlIIl[38])) {
            int[] iArr = new int[lIIlIlIIl[1]];
            iArr[lIIlIlIIl[0]] = lIIlIlIIl[13];
            if (llllIlllIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIlIIl[1]];
                iArr2[lIIlIlIIl[0]] = lIIlIlIIl[26];
                if (llllIlllIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlIlIIl[1]];
                    iArr3[lIIlIlIIl[0]] = lIIlIlIIl[24];
                    if (llllIlllIII(Inventory.contains(iArr3) ? 1 : 0) && ((!llllIlllIlI(Inventory.contains(item -> {
                        return item.getName().contains(lIIlIIllI[lIIlIlIIl[207]]);
                    }) ? 1 : 0) || llllIlllIII(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIIlIIllI[lIIlIlIIl[206]]);
                    }) ? 1 : 0)) && (!llllIlllIlI(Inventory.contains(C0005f.bf) ? 1 : 0) || llllIlllIII(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return "  ".length() == 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                    }
                }
            }
            return lIIlIlIIl[0];
        }
        int[] iArr4 = new int[lIIlIlIIl[1]];
        iArr4[lIIlIlIIl[0]] = lIIlIlIIl[13];
        if (llllIlllIII(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIIlIlIIl[1]];
            iArr5[lIIlIlIIl[0]] = lIIlIlIIl[15];
            if (llllIlllIII(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIlIlIIl[1]];
                iArr6[lIIlIlIIl[0]] = lIIlIlIIl[14];
                if (llllIlllIII(Inventory.contains(iArr6) ? 1 : 0) && ((!llllIlllIlI(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIlIIllI[lIIlIlIIl[205]]);
                }) ? 1 : 0) || llllIlllIII(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIIlIIllI[lIIlIlIIl[204]]);
                }) ? 1 : 0)) && (!llllIlllIlI(Inventory.contains(C0005f.bf) ? 1 : 0) || llllIlllIII(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                    ?? r02 = lIIlIlIIl[1];
                    "".length();
                    return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
        }
        return lIIlIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    private static boolean dl() {
        WorldArea worldArea = new WorldArea(lIIlIlIIl[81], lIIlIlIIl[82], lIIlIlIIl[70], lIIlIlIIl[65], lIIlIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[83], lIIlIlIIl[82], lIIlIlIIl[12], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[84], lIIlIlIIl[85], lIIlIlIIl[64], lIIlIlIIl[50], lIIlIlIIl[10]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[189], lIIlIlIIl[190], lIIlIlIIl[25], lIIlIlIIl[19], lIIlIlIIl[1]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[86], lIIlIlIIl[88], lIIlIlIIl[12], lIIlIlIIl[25], lIIlIlIIl[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[191], lIIlIlIIl[192], lIIlIlIIl[74], lIIlIlIIl[39], lIIlIlIIl[10]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[91], lIIlIlIIl[92], lIIlIlIIl[67], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea8 = new WorldArea(lIIlIlIIl[93], lIIlIlIIl[94], lIIlIlIIl[23], lIIlIlIIl[27], lIIlIlIIl[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIlIIl[93], lIIlIlIIl[95], lIIlIlIIl[12], lIIlIlIIl[23], lIIlIlIIl[10]);
        WorldArea worldArea10 = new WorldArea(lIIlIlIIl[127], lIIlIlIIl[128], lIIlIlIIl[50], lIIlIlIIl[12], lIIlIlIIl[3]);
        WorldArea worldArea11 = new WorldArea(lIIlIlIIl[129], lIIlIlIIl[127], lIIlIlIIl[50], lIIlIlIIl[25], lIIlIlIIl[3]);
        WorldArea worldArea12 = new WorldArea(lIIlIlIIl[130], lIIlIlIIl[131], lIIlIlIIl[64], lIIlIlIIl[50], lIIlIlIIl[3]);
        WorldArea worldArea13 = new WorldArea(lIIlIlIIl[132], lIIlIlIIl[133], lIIlIlIIl[12], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea14 = new WorldArea(lIIlIlIIl[134], lIIlIlIIl[9], lIIlIlIIl[50], lIIlIlIIl[27], lIIlIlIIl[3]);
        WorldArea worldArea15 = new WorldArea(lIIlIlIIl[135], lIIlIlIIl[136], lIIlIlIIl[69], lIIlIlIIl[54], lIIlIlIIl[10]);
        WorldArea worldArea16 = new WorldArea(lIIlIlIIl[137], lIIlIlIIl[138], lIIlIlIIl[64], lIIlIlIIl[65], lIIlIlIIl[3]);
        WorldArea worldArea17 = new WorldArea(lIIlIlIIl[164], lIIlIlIIl[133], lIIlIlIIl[65], lIIlIlIIl[12], lIIlIlIIl[10]);
        WorldArea worldArea18 = new WorldArea(lIIlIlIIl[165], lIIlIlIIl[139], lIIlIlIIl[39], lIIlIlIIl[54], lIIlIlIIl[3]);
        WorldArea worldArea19 = new WorldArea(lIIlIlIIl[166], lIIlIlIIl[134], lIIlIlIIl[50], lIIlIlIIl[27], lIIlIlIIl[3]);
        WorldArea worldArea20 = new WorldArea(lIIlIlIIl[167], lIIlIlIIl[136], lIIlIlIIl[71], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea21 = new WorldArea(lIIlIlIIl[168], lIIlIlIIl[169], lIIlIlIIl[55], lIIlIlIIl[64], lIIlIlIIl[3]);
        WorldArea[] worldAreaArr = new WorldArea[lIIlIlIIl[69]];
        worldAreaArr[lIIlIlIIl[0]] = worldArea;
        worldAreaArr[lIIlIlIIl[1]] = worldArea2;
        worldAreaArr[lIIlIlIIl[3]] = worldArea3;
        worldAreaArr[lIIlIlIIl[10]] = worldArea4;
        worldAreaArr[lIIlIlIIl[17]] = worldArea5;
        worldAreaArr[lIIlIlIIl[19]] = worldArea6;
        worldAreaArr[lIIlIlIIl[21]] = worldArea7;
        worldAreaArr[lIIlIlIIl[23]] = worldArea8;
        worldAreaArr[lIIlIlIIl[25]] = worldArea9;
        worldAreaArr[lIIlIlIIl[27]] = worldArea10;
        worldAreaArr[lIIlIlIIl[12]] = worldArea11;
        worldAreaArr[lIIlIlIIl[50]] = worldArea12;
        worldAreaArr[lIIlIlIIl[64]] = worldArea13;
        worldAreaArr[lIIlIlIIl[65]] = worldArea14;
        worldAreaArr[lIIlIlIIl[54]] = worldArea15;
        worldAreaArr[lIIlIlIIl[39]] = worldArea16;
        worldAreaArr[lIIlIlIIl[66]] = worldArea17;
        worldAreaArr[lIIlIlIIl[67]] = worldArea18;
        worldAreaArr[lIIlIlIIl[55]] = worldArea19;
        worldAreaArr[lIIlIlIIl[68]] = worldArea20;
        worldAreaArr[lIIlIlIIl[41]] = worldArea21;
        int[] iArr = new int[lIIlIlIIl[1]];
        iArr[lIIlIlIIl[0]] = lIIlIlIIl[193];
        if (llllIlllIll(TileItems.getNearest(iArr))) {
            System.out.println(lIIlIIllI[lIIlIlIIl[194]]);
            int lIIIIllIlllIllI = lIIlIlIIl[0];
            while (llllIlllIIl(lIIIIllIlllIllI, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[lIIIIllIlllIllI];
                int[] iArr2 = new int[lIIlIlIIl[1]];
                iArr2[lIIlIlIIl[0]] = lIIlIlIIl[193];
                if (llllIlllIII(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && llllIlllIII(worldAreaArr[lIIIIllIlllIllI].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIlIlIIl[1];
                }
                lIIIIllIlllIllI++;
                "".length();
                if (" ".length() > "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIlIlIIl[0];
    }

    private static String llllIlIIlII(String lIIIIllIIIlIlll, String lIIIIllIIIlIllI) {
        try {
            SecretKeySpec lIIIIllIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIllIIIlIllI.getBytes(StandardCharsets.UTF_8)), lIIlIlIIl[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlIIl[3], lIIIIllIIIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIllIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIllIIIllIII) {
            lIIIIllIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlllIll(Object obj) {
        return obj != null;
    }

    private static void llllIllIlll() {
        lIIlIlIIl = new int[239];
        lIIlIlIIl[0] = ((56 ^ 6) ^ (152 ^ 182)) & (((((122 + 109) - 81) + 18) ^ (((79 + 89) - 41) + 57)) ^ (-" ".length()));
        lIIlIlIIl[1] = " ".length();
        lIIlIlIIl[2] = (222 ^ 151) ^ (123 ^ 31);
        lIIlIlIIl[3] = "  ".length();
        lIIlIlIIl[4] = (-12817) & 16279;
        lIIlIlIIl[5] = (-8193) & 11653;
        lIIlIlIIl[6] = 189 ^ 131;
        lIIlIlIIl[7] = (25 ^ 21) ^ (55 ^ 8);
        lIIlIlIIl[8] = (-((-1298) & 30041)) & (-1) & 32255;
        lIIlIlIIl[9] = (-16486) & 19965;
        lIIlIlIIl[10] = "   ".length();
        lIIlIlIIl[11] = (-((-7155) & 32758)) & (-2145) & 32747;
        lIIlIlIIl[12] = (((33 + 88) - 27) + 62) ^ (((143 + 18) - 69) + 58);
        lIIlIlIIl[13] = (-24753) & 32759;
        lIIlIlIIl[14] = (-152) & 8159;
        lIIlIlIIl[15] = (-((-3585) & 28311)) & (-33) & 32767;
        lIIlIlIIl[16] = (-((-8557) & 29165)) & (-51) & 24511;
        lIIlIlIIl[17] = (((34 + 110) - 73) + 71) ^ (((37 + 52) - (-12)) + 37);
        lIIlIlIIl[18] = (-((-31957) & 32247)) & (-16386) & 28655;
        lIIlIlIIl[19] = 143 ^ 138;
        lIIlIlIIl[20] = (-2181) & 14805;
        lIIlIlIIl[21] = 140 ^ 138;
        lIIlIlIIl[22] = (-178) & 8187;
        lIIlIlIIl[23] = 6 ^ 1;
        lIIlIlIIl[24] = (-26129) & 26513;
        lIIlIlIIl[25] = (((80 + 52) - (-42)) + 7) ^ (((152 + 177) - 283) + 143);
        lIIlIlIIl[26] = (-" ".length()) & (-8473) & 28091;
        lIIlIlIIl[27] = 98 ^ 107;
        lIIlIlIIl[28] = (-2310) & 23455;
        lIIlIlIIl[29] = (-4362) & 16221;
        lIIlIlIIl[30] = (-((-10284) & 26939)) & (-4225) & 32735;
        lIIlIlIIl[31] = (-((-14349) & 31150)) & (-17) & 28671;
        lIIlIlIIl[32] = (-((-7113) & 23530)) & (-4241) & 32509;
        lIIlIlIIl[33] = (-16517) & 28374;
        lIIlIlIIl[34] = (-4502) & 16351;
        lIIlIlIIl[35] = (-"   ".length()) & (-20502) & 32471;
        lIIlIlIIl[36] = 206 ^ 150;
        lIIlIlIIl[37] = (-((-7499) & 15835)) & (-4101) & 32671;
        lIIlIlIIl[38] = (208 ^ 167) ^ (255 ^ 160);
        lIIlIlIIl[39] = (43 ^ 26) ^ (121 ^ 71);
        lIIlIlIIl[40] = 86 ^ 100;
        lIIlIlIIl[41] = 52 ^ 32;
        lIIlIlIIl[42] = (113 ^ 7) ^ (93 ^ 50);
        lIIlIlIIl[43] = 65 ^ 95;
        lIIlIlIIl[44] = (-16914) & 17215;
        lIIlIlIIl[45] = (((47 + 110) - 125) + 100) ^ (((4 + 28) - (-100)) + 52);
        lIIlIlIIl[46] = (-22217) & 22523;
        lIIlIlIIl[47] = (-30219) & 32687;
        lIIlIlIIl[48] = (-((-819) & 25399)) & (-641) & 28655;
        lIIlIlIIl[49] = (-((-18575) & 31375)) & (-28) & 16251;
        lIIlIlIIl[50] = (((32 + 128) - 43) + 16) ^ (((21 + 2) - (-40)) + 79);
        lIIlIlIIl[51] = (-((-411) & 13243)) & (-3) & 16255;
        lIIlIlIIl[52] = (-23) & 2487;
        lIIlIlIIl[53] = (-((-16983) & 21247)) & (-8193) & 15871;
        lIIlIlIIl[54] = (18 ^ 107) ^ (227 ^ 148);
        lIIlIlIIl[55] = 11 ^ 25;
        lIIlIlIIl[56] = (-(10 ^ 79)) & (-28681) & 31231;
        lIIlIlIIl[57] = (-((-16705) & 17380)) & (-16385) & 20475;
        lIIlIlIIl[58] = (-12361) & 14842;
        lIIlIlIIl[59] = (-24711) & 28127;
        lIIlIlIIl[60] = (-1035) & 3515;
        lIIlIlIIl[61] = (-((-19571) & 32511)) & (-1) & 16367;
        lIIlIlIIl[62] = 103 ^ 113;
        lIIlIlIIl[63] = -" ".length();
        lIIlIlIIl[64] = (16 ^ 26) ^ (60 ^ 58);
        lIIlIlIIl[65] = 60 ^ 49;
        lIIlIlIIl[66] = 122 ^ 106;
        lIIlIlIIl[67] = 208 ^ 193;
        lIIlIlIIl[68] = (140 ^ 137) ^ (93 ^ 75);
        lIIlIlIIl[69] = (92 ^ 96) ^ (87 ^ 126);
        lIIlIlIIl[70] = 105 ^ 126;
        lIIlIlIIl[71] = 49 ^ 41;
        lIIlIlIIl[72] = (79 ^ 10) ^ (14 ^ 81);
        lIIlIlIIl[73] = 147 ^ 136;
        lIIlIlIIl[74] = (((126 + 102) - 192) + 128) ^ (((145 + 89) - 160) + 110);
        lIIlIlIIl[75] = (((109 + 159) - 171) + 124) ^ (((7 + 152) - 96) + 129);
        lIIlIlIIl[76] = 77 ^ 82;
        lIIlIlIIl[77] = (-25473) & 28639;
        lIIlIlIIl[78] = (-16514) & 19863;
        lIIlIlIIl[79] = (((208 ^ 166) + (90 ^ 100)) - (((76 + 28) - 86) + 129)) + (66 ^ 42);
        lIIlIlIIl[80] = 41 ^ 119;
        lIIlIlIIl[81] = (-25153) & 28371;
        lIIlIlIIl[82] = (-28837) & 32245;
        lIIlIlIIl[83] = (-((-21) & 29014)) & (-51) & 32255;
        lIIlIlIIl[84] = (-((-4534) & 13239)) & (-129) & 12031;
        lIIlIlIIl[85] = (-4265) & 7676;
        lIIlIlIIl[86] = (-((-3637) & 16318)) & (-1) & 15871;
        lIIlIlIIl[87] = (-((-1925) & 10151)) & (-9) & 11647;
        lIIlIlIIl[88] = (-28853) & 32253;
        lIIlIlIIl[89] = (-((-14461) & 31357)) & (-12433) & 32507;
        lIIlIlIIl[90] = (-16386) & 19767;
        lIIlIlIIl[91] = (-((-9251) & 30511)) & (-3) & 24479;
        lIIlIlIIl[92] = (-((-517) & 21151)) & (-33) & 24058;
        lIIlIlIIl[93] = (-((-1547) & 30303)) & (-521) & 32510;
        lIIlIlIIl[94] = (-4662) & 8063;
        lIIlIlIIl[95] = (-12297) & 15706;
        lIIlIlIIl[96] = 67 ^ 99;
        lIIlIlIIl[97] = (-((-1026) & 30245)) & (-65) & 32507;
        lIIlIlIIl[98] = (144 ^ 156) ^ (238 ^ 195);
        lIIlIlIIl[99] = 142 ^ 172;
        lIIlIlIIl[100] = (22 ^ 65) ^ (108 ^ 24);
        lIIlIlIIl[101] = (64 ^ 47) ^ (253 ^ 182);
        lIIlIlIIl[102] = 147 ^ 182;
        lIIlIlIIl[103] = 169 ^ 143;
        lIIlIlIIl[104] = 117 ^ 82;
        lIIlIlIIl[105] = (-((-329) & 8138)) & (-16387) & 32695;
        lIIlIlIIl[106] = (190 ^ 186) ^ (70 ^ 107);
        lIIlIlIIl[107] = (((106 + 115) - 186) + 109) ^ (((1 + 91) - 57) + 151);
        lIIlIlIIl[108] = (35 ^ 119) ^ (((87 + 98) - 114) + 56);
        lIIlIlIIl[109] = 188 ^ 144;
        lIIlIlIIl[110] = (125 ^ 29) ^ (73 ^ 7);
        lIIlIlIIl[111] = 73 ^ 102;
        lIIlIlIIl[112] = 98 ^ 82;
        lIIlIlIIl[113] = (239 ^ 198) ^ (167 ^ 191);
        lIIlIlIIl[114] = (((48 + 113) - 135) + 121) ^ (((132 + 92) - 223) + 166);
        lIIlIlIIl[115] = (-((-18801) & 19326)) & (-1025) & 16383;
        lIIlIlIIl[116] = 79 ^ 122;
        lIIlIlIIl[117] = (3 ^ 8) ^ (168 ^ 149);
        lIIlIlIIl[118] = (-((-23859) & 24383)) & (-17409) & 32767;
        lIIlIlIIl[119] = 176 ^ 135;
        lIIlIlIIl[120] = 250 ^ 194;
        lIIlIlIIl[121] = (-((-13525) & 30430)) & (-1) & 31741;
        lIIlIlIIl[122] = (141 ^ 169) ^ (90 ^ 71);
        lIIlIlIIl[123] = (207 ^ 156) ^ (173 ^ 196);
        lIIlIlIIl[124] = 0 ^ 59;
        lIIlIlIIl[125] = (-((-3849) & 32553)) & (-65) & 32239;
        lIIlIlIIl[126] = (-29186) & 32651;
        lIIlIlIIl[127] = (-((-2755) & 15059)) & (-578) & 16383;
        lIIlIlIIl[128] = (-29198) & 32687;
        lIIlIlIIl[129] = (-4185) & 7679;
        lIIlIlIIl[130] = (-((-667) & 13055)) & (-513) & 16383;
        lIIlIlIIl[131] = (-((-5517) & 30671)) & (-1) & 28651;
        lIIlIlIIl[132] = (-((-261) & 9068)) & (-1) & 12279;
        lIIlIlIIl[133] = (-((-2183) & 15007)) & (-65) & 16377;
        lIIlIlIIl[134] = (-12869) & 16343;
        lIIlIlIIl[135] = (-((-227) & 25315)) & (-4161) & 32733;
        lIIlIlIIl[136] = (-29221) & 32687;
        lIIlIlIIl[137] = (-((-10414) & 27375)) & (-1) & 20467;
        lIIlIlIIl[138] = (-((-1059) & 13419)) & (-3) & 15835;
        lIIlIlIIl[139] = (-24674) & 28159;
        lIIlIlIIl[140] = 61 ^ 0;
        lIIlIlIIl[141] = (79 ^ 53) ^ (99 ^ 38);
        lIIlIlIIl[142] = 237 ^ 173;
        lIIlIlIIl[143] = (((18 + 73) - 12) + 130) ^ (((128 + 54) - 102) + 64);
        lIIlIlIIl[144] = 214 ^ 148;
        lIIlIlIIl[145] = 18 ^ 81;
        lIIlIlIIl[146] = 24 ^ 92;
        lIIlIlIIl[147] = 129 ^ 196;
        lIIlIlIIl[148] = (((170 + 171) - 280) + 134) ^ (((103 + 90) - 138) + 78);
        lIIlIlIIl[149] = 44 ^ 107;
        lIIlIlIIl[150] = (119 ^ 59) ^ (26 ^ 30);
        lIIlIlIIl[151] = 62 ^ 119;
        lIIlIlIIl[152] = 35 ^ 105;
        lIIlIlIIl[153] = 111 ^ 36;
        lIIlIlIIl[154] = 53 ^ 121;
        lIIlIlIIl[155] = (140 ^ 163) ^ (14 ^ 108);
        lIIlIlIIl[156] = 213 ^ 155;
        lIIlIlIIl[157] = (22 ^ 2) ^ (79 ^ 20);
        lIIlIlIIl[158] = 108 ^ 60;
        lIIlIlIIl[159] = (((16 + 228) - 59) + 64) ^ (((67 + 21) - (-38)) + 42);
        lIIlIlIIl[160] = (49 ^ 65) ^ (148 ^ 182);
        lIIlIlIIl[161] = 43 ^ 120;
        lIIlIlIIl[162] = (-((-1663) & 26495)) & (-1) & 27519;
        lIIlIlIIl[163] = (-4098) & 7551;
        lIIlIlIIl[164] = (-1057) & 3775;
        lIIlIlIIl[165] = (-((-20485) & 21607)) & (-12289) & 16111;
        lIIlIlIIl[166] = (-((-2659) & 12143)) & (-16417) & 28607;
        lIIlIlIIl[167] = (-28787) & 31483;
        lIIlIlIIl[168] = (-309) & 2996;
        lIIlIlIIl[169] = (-16991) & 20447;
        lIIlIlIIl[170] = (-1047) & 3775;
        lIIlIlIIl[171] = (-((-385) & 29635)) & (-18) & 32755;
        lIIlIlIIl[172] = 24 ^ 76;
        lIIlIlIIl[173] = (((33 + 87) - (-32)) + 62) ^ (((115 + 119) - 104) + 1);
        lIIlIlIIl[174] = (64 ^ 39) ^ (28 ^ 45);
        lIIlIlIIl[175] = 116 ^ 35;
        lIIlIlIIl[176] = (30 ^ 79) ^ (3 ^ 11);
        lIIlIlIIl[177] = (28 ^ 57) ^ (((18 + 105) - 115) + 119);
        lIIlIlIIl[178] = 52 ^ 111;
        lIIlIlIIl[179] = (((177 + 196) - 357) + 211) ^ (((76 + 174) - 154) + 95);
        lIIlIlIIl[180] = (9 ^ 115) ^ (170 ^ 141);
        lIIlIlIIl[181] = 228 ^ 187;
        lIIlIlIIl[182] = (33 ^ 71) ^ (104 ^ 110);
        lIIlIlIIl[183] = 59 ^ 90;
        lIIlIlIIl[184] = (((211 + 148) - 170) + 26) ^ (((87 + 93) - 83) + 84);
        lIIlIlIIl[185] = (((53 + 130) - 23) + 63) ^ (((8 + 79) - 10) + 111);
        lIIlIlIIl[186] = 83 ^ 55;
        lIIlIlIIl[187] = 93 ^ 56;
        lIIlIlIIl[188] = 49 ^ 87;
        lIIlIlIIl[189] = (-((-53) & 21429)) & (-8201) & 32767;
        lIIlIlIIl[190] = (-12329) & 15742;
        lIIlIlIIl[191] = (-((-9223) & 30615)) & (-2) & 24575;
        lIIlIlIIl[192] = (-28677) & 32063;
        lIIlIlIIl[193] = (-(103 ^ 96)) & (-4481) & 16335;
        lIIlIlIIl[194] = (42 ^ 24) ^ (10 ^ 95);
        lIIlIlIIl[195] = (-26756) & 32255;
        lIIlIlIIl[196] = (-1093) & 26092;
        lIIlIlIIl[197] = (-19489) & 20388;
        lIIlIlIIl[198] = (-((-1061) & 11374)) & (-16385) & 27647;
        lIIlIlIIl[199] = (-((-9219) & 31843)) & (-8193) & 32766;
        lIIlIlIIl[200] = (-((-3683) & 7787)) & (-2049) & 15102;
        lIIlIlIIl[201] = (-((-8106) & 24511)) & (-4097) & 32479;
        lIIlIlIIl[202] = (-((-7547) & 8187)) & (-4097) & 30686;
        lIIlIlIIl[203] = 55 ^ 95;
        lIIlIlIIl[204] = 104 ^ 1;
        lIIlIlIIl[205] = (207 ^ 187) ^ (51 ^ 45);
        lIIlIlIIl[206] = 42 ^ 65;
        lIIlIlIIl[207] = (((61 + 152) - 116) + 143) ^ (((128 + 40) - 29) + 17);
        lIIlIlIIl[208] = (68 ^ 11) ^ (38 ^ 4);
        lIIlIlIIl[209] = (-((-2255) & 27135)) & (-1025) & 28607;
        lIIlIlIIl[210] = (-((-12497) & 13045)) & (-12369) & 16381;
        lIIlIlIIl[211] = 105 ^ 7;
        lIIlIlIIl[212] = (-609) & 4077;
        lIIlIlIIl[213] = 197 ^ 170;
        lIIlIlIIl[214] = (-24649) & 27359;
        lIIlIlIIl[215] = (-8258) & 11733;
        lIIlIlIIl[216] = 105 ^ 25;
        lIIlIlIIl[217] = (-((-22) & 30007)) & (-9) & 32703;
        lIIlIlIIl[218] = 42 ^ 91;
        lIIlIlIIl[219] = (-((-2049) & 3167)) & (-8449) & 12287;
        lIIlIlIIl[220] = (-(69 ^ 94)) & (-4161) & 7679;
        lIIlIlIIl[221] = 198 ^ 180;
        lIIlIlIIl[222] = (-((-913) & 29657)) & (-514) & 32767;
        lIIlIlIIl[223] = (-((-3409) & 32083)) & (-513) & 32670;
        lIIlIlIIl[224] = (146 ^ 181) ^ (61 ^ 105);
        lIIlIlIIl[225] = (-21073) & 24575;
        lIIlIlIIl[226] = (((24 + 172) - 99) + 141) ^ (((100 + 33) - (-18)) + 3);
        lIIlIlIIl[227] = 38 ^ 83;
        lIIlIlIIl[228] = (-553) & 4030;
        lIIlIlIIl[229] = (-((-5991) & 30583)) & (-4169) & 32252;
        lIIlIlIIl[230] = (114 ^ 15) ^ (102 ^ 109);
        lIIlIlIIl[231] = (-8261) & 11759;
        lIIlIlIIl[232] = 114 ^ 5;
        lIIlIlIIl[233] = (66 ^ 35) ^ (98 ^ 123);
        lIIlIlIIl[234] = (-12355) & 15859;
        lIIlIlIIl[235] = (-(200 ^ 139)) & (-12810) & 15343;
        lIIlIlIIl[236] = (-((-16897) & 26181)) & (-16385) & 28142;
        lIIlIlIIl[237] = (-21011) & 24447;
        lIIlIlIIl[238] = 249 ^ 128;
    }

    private static boolean llllIlllIII(int i) {
        return i != 0;
    }

    private static boolean llllIlllIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (llllIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.X.lIIlIlIIl[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (llllIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.X.lIIlIlIIl[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIIlIlIIl[1]];
        iArr4[lIIlIlIIl[0]] = lIIlIlIIl[16];
        if (llllIlllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIl[16], lIIlIlIIl[1], lIIlIlIIl[195]));
            "".length();
        }
        int[] iArr5 = new int[lIIlIlIIl[1]];
        iArr5[lIIlIlIIl[0]] = lIIlIlIIl[18];
        if (llllIlllIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIl[18], lIIlIlIIl[3], lIIlIlIIl[196]));
            "".length();
        }
        int[] iArr6 = new int[lIIlIlIIl[1]];
        iArr6[lIIlIlIIl[0]] = lIIlIlIIl[28];
        if (llllIlllIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIl[28], lIIlIlIIl[3], lIIlIlIIl[196]));
            "".length();
        }
        int[] iArr7 = new int[lIIlIlIIl[1]];
        iArr7[lIIlIlIIl[0]] = lIIlIlIIl[13];
        if (llllIlllIlI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIl[13], lIIlIlIIl[12], lIIlIlIIl[197]));
            "".length();
        }
        int[] iArr8 = new int[lIIlIlIIl[1]];
        iArr8[lIIlIlIIl[0]] = lIIlIlIIl[22];
        if (llllIlllIlI(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIl[22], lIIlIlIIl[12], lIIlIlIIl[198]));
            "".length();
        }
        int[] iArr9 = new int[lIIlIlIIl[1]];
        iArr9[lIIlIlIIl[0]] = lIIlIlIIl[15];
        if (llllIlllIlI(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIl[15], lIIlIlIIl[12], lIIlIlIIl[198]));
            "".length();
        }
        int[] iArr10 = new int[lIIlIlIIl[1]];
        iArr10[lIIlIlIIl[0]] = lIIlIlIIl[14];
        if (llllIlllIlI(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIl[14], lIIlIlIIl[12], lIIlIlIIl[198]));
            "".length();
        }
        int[] iArr11 = new int[lIIlIlIIl[1]];
        iArr11[lIIlIlIIl[0]] = lIIlIlIIl[24];
        if (llllIlllIII(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIlIlIIl[1]];
            iArr12[lIIlIlIIl[0]] = lIIlIlIIl[24];
            if (llllIlllIII(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIIlIlIIl[1]];
                iArr13[lIIlIlIIl[0]] = lIIlIlIIl[24];
            }
            iArr = new int[lIIlIlIIl[1]];
            iArr[lIIlIlIIl[0]] = lIIlIlIIl[26];
            if (llllIlllIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIIlIlIIl[1]];
                iArr14[lIIlIlIIl[0]] = lIIlIlIIl[26];
                if (llllIlllIII(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIlIlIIl[1]];
                    iArr15[lIIlIlIIl[0]] = lIIlIlIIl[26];
                }
                iArr2 = new int[lIIlIlIIl[1]];
                iArr2[lIIlIlIIl[0]] = lIIlIlIIl[201];
                if (llllIlllIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlIlIIl[201], lIIlIlIIl[1], lIIlIlIIl[202]));
                    "".length();
                }
                iArr3 = new int[lIIlIlIIl[1]];
                iArr3[lIIlIlIIl[0]] = lIIlIlIIl[20];
                if (llllIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlIlIIl[20], lIIlIlIIl[41], C0008i.bq));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0003d(lIIlIlIIl[26], lIIlIlIIl[12], lIIlIlIIl[200]));
            "".length();
            iArr2 = new int[lIIlIlIIl[1]];
            iArr2[lIIlIlIIl[0]] = lIIlIlIIl[201];
            if (llllIlllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIIlIlIIl[1]];
            iArr3[lIIlIlIIl[0]] = lIIlIlIIl[20];
            if (llllIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(ky, lIIlIlIIl[45], lIIlIlIIl[199]));
        "".length();
        iArr = new int[lIIlIlIIl[1]];
        iArr[lIIlIlIIl[0]] = lIIlIlIIl[26];
        if (llllIlllIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIlIIl[26], lIIlIlIIl[12], lIIlIlIIl[200]));
        "".length();
        iArr2 = new int[lIIlIlIIl[1]];
        iArr2[lIIlIlIIl[0]] = lIIlIlIIl[201];
        if (llllIlllIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIlIlIIl[1]];
        iArr3[lIIlIlIIl[0]] = lIIlIlIIl[20];
        if (llllIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            dg();
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return ((99 ^ 10) ^ (115 ^ 58)) & (((156 ^ 172) ^ (138 ^ 154)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIlIIl[186];
    }

    private static boolean llllIlllIlI(int i) {
        return i == 0;
    }

    private static void dj() {
        WorldArea worldArea = new WorldArea(lIIlIlIIl[125], lIIlIlIIl[126], lIIlIlIIl[112], lIIlIlIIl[108], lIIlIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[125], lIIlIlIIl[126], lIIlIlIIl[112], lIIlIlIIl[108], lIIlIlIIl[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[125], lIIlIlIIl[126], lIIlIlIIl[112], lIIlIlIIl[108], lIIlIlIIl[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[125], lIIlIlIIl[126], lIIlIlIIl[112], lIIlIlIIl[108], lIIlIlIIl[10]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[127], lIIlIlIIl[128], lIIlIlIIl[50], lIIlIlIIl[12], lIIlIlIIl[3]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[129], lIIlIlIIl[127], lIIlIlIIl[50], lIIlIlIIl[25], lIIlIlIIl[3]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[130], lIIlIlIIl[131], lIIlIlIIl[64], lIIlIlIIl[50], lIIlIlIIl[3]);
        WorldArea worldArea8 = new WorldArea(lIIlIlIIl[132], lIIlIlIIl[133], lIIlIlIIl[12], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIlIIl[134], lIIlIlIIl[9], lIIlIlIIl[50], lIIlIlIIl[27], lIIlIlIIl[3]);
        WorldArea worldArea10 = new WorldArea(lIIlIlIIl[135], lIIlIlIIl[136], lIIlIlIIl[69], lIIlIlIIl[54], lIIlIlIIl[10]);
        WorldArea worldArea11 = new WorldArea(lIIlIlIIl[137], lIIlIlIIl[138], lIIlIlIIl[64], lIIlIlIIl[65], lIIlIlIIl[3]);
        WorldPoint worldPoint = new WorldPoint(lIIlIlIIl[137], lIIlIlIIl[139], lIIlIlIIl[0]);
        if (llllIlllIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llllIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIlIlIIl[1]);
            "".length();
        }
        if (llllIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llllIllllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIIl[21])) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIlIlIIl[1]);
                "".length();
            }
            if (lllllIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIIl[21])) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIlIlIIl[1]];
                strArr[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[142]];
                TileObjects.getNearest(strArr).interact(lIIlIIllI[lIIlIlIIl[143]]);
                Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return " ".length() != " ".length() ? (false ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIl[0];
                }, lIIlIlIIl[105]);
                "".length();
                Time.sleepTicks(lIIlIlIIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIlIlIIl[1]];
        strArr2[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llllIlllIll(nearest) && llllIlllIII(dl() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[145]];
            System.out.println(lIIlIIllI[lIIlIlIIl[146]]);
            nearest.interact(lIIlIIllI[lIIlIlIIl[147]]);
            Time.sleepTicks(lIIlIlIIl[10]);
            "".length();
        }
        if (llllIlllIlI(dl() ? 1 : 0)) {
            if (llllIlllIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[233]]) ? 1 : 0) && lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[234], lIIlIlIIl[131], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[148]];
                    nearest2.interact(lIIlIIllI[lIIlIlIIl[149]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return 0 != 0 ? ((((52 + 18) - (-19)) + 99) ^ (((74 + 21) - 85) + 125)) & (((48 ^ 55) ^ (78 ^ 114)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (llllIlllIII(dl() ? 1 : 0)) {
                return;
            }
            if (llllIlllIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llllIlllIII(tileObject2.getName().contains(lIIlIIllI[lIIlIlIIl[232]]) ? 1 : 0) && lllllIIIIII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[131], lIIlIlIIl[225], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest3)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIlIIllI[lIIlIlIIl[151]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return "   ".length() <= 0 ? ((((143 + 101) - 238) + 169) ^ (((102 + 1) - 5) + 59)) & (((103 ^ 105) ^ (65 ^ 125)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (llllIlllIII(dl() ? 1 : 0)) {
                return;
            }
            if (llllIlllIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llllIlllIII(tileObject3.getName().contains(lIIlIIllI[lIIlIlIIl[230]]) ? 1 : 0) && lllllIIIIII(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[139], lIIlIlIIl[231], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return (((48 ^ 92) ^ (85 ^ 115)) & (((((194 + 165) - 168) + 56) ^ (((141 + 73) - 151) + 126)) ^ (-" ".length()))) == ((254 ^ 164) ^ (197 ^ 155)) ? ((137 ^ 167) ^ (98 ^ 89)) & (((((15 + 62) - (-86)) + 46) ^ (((167 + 116) - 92) + 5)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest4)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIlIIllI[lIIlIlIIl[153]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (llllIlllIII(dl() ? 1 : 0)) {
                return;
            }
            if (llllIlllIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llllIlllIII(tileObject4.getName().contains(lIIlIIllI[lIIlIlIIl[227]]) ? 1 : 0) && lllllIIIIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[228], lIIlIlIIl[229], lIIlIlIIl[10])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest5)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIlIIllI[lIIlIlIIl[155]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return (-"   ".length()) > 0 ? ((79 ^ 106) ^ (116 ^ 10)) & (((((77 + 165) - 234) + 189) ^ (((22 + 107) - 119) + 148)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (llllIlllIII(dl() ? 1 : 0)) {
                return;
            }
            if (llllIlllIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llllIlllIII(tileObject5.getName().contains(lIIlIIllI[lIIlIlIIl[226]]) ? 1 : 0) && lllllIIIIII(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[9], lIIlIlIIl[130], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return "  ".length() <= ((99 ^ 117) & ((0 ^ 22) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest6)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIlIIllI[lIIlIlIIl[157]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (llllIlllIII(dl() ? 1 : 0)) {
                return;
            }
            if (llllIlllIII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (llllIlllIII(tileObject6.getName().contains(lIIlIIllI[lIIlIlIIl[224]]) ? 1 : 0) && lllllIIIIII(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[225], lIIlIlIIl[215], lIIlIlIIl[10])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return ((((48 + 106) - 23) + 35) ^ (((70 + 141) - 117) + 68)) < 0 ? ((165 ^ 183) ^ (74 ^ 64)) & (((11 ^ 51) ^ (20 ^ 52)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest7)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIIlIIllI[lIIlIlIIl[159]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return ((164 ^ 128) & ((72 ^ 108) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
            if (!llllIlllIII(dl() ? 1 : 0) && llllIlllIII(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (llllIlllIII(tileObject7.getName().contains(lIIlIIllI[lIIlIlIIl[221]]) ? 1 : 0) && lllllIIIIII(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[222], lIIlIlIIl[223], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                        ?? r0 = lIIlIlIIl[1];
                        "".length();
                        return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIl[0];
                });
                if (llllIlllIll(nearest8)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIIlIIllI[lIIlIlIIl[161]]);
                    Time.sleepTicks(C0004e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llllIllllII(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIlIlIIl[1];
                            "".length();
                            return (((11 ^ 82) ^ (88 ^ 94)) & (((((148 + 124) - 270) + 235) ^ (((108 + 43) - 88) + 115)) ^ (-" ".length()))) > "   ".length() ? ((250 ^ 180) ^ (30 ^ 51)) & (((73 ^ 94) ^ (45 ^ 89)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIl[0];
                    }, lIIlIlIIl[105]);
                    "".length();
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void dg() {
        if (llllIlllIII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[0]];
            C0001b.a(bv);
            if (llllIlllIIl(bv.size(), lIIlIlIIl[1])) {
                System.out.println(lIIlIIllI[lIIlIlIIl[1]]);
                bt = lIIlIlIIl[0];
            }
        }
        if (llllIlllIlI(bt ? 1 : 0) && llllIlllIIl(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[2])) {
            if (llllIlllIlI(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllIlllIll(nearest) && llllIlllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[3]];
                    if (llllIlllIII(new WorldArea(lIIlIlIIl[4], lIIlIlIIl[5], lIIlIlIIl[6], lIIlIlIIl[7], lIIlIlIIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIIlIlIIl[8], lIIlIlIIl[9], lIIlIlIIl[0]);
                        if (llllIllllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIIl[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIlIlIIl[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (llllIlllIll(nearest) && llllIlllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[10]];
                    if (llllIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIlIIl[11]);
                        "".length();
                    }
                    if (llllIlllIII(Bank.isOpen() ? 1 : 0)) {
                        if (llllIllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIlIIl[1]);
                            "".length();
                        }
                        if (llllIllllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIlIIl[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIIlIlIIl[12]];
                    iArr[lIIlIlIIl[0]] = lIIlIlIIl[13];
                    iArr[lIIlIlIIl[1]] = lIIlIlIIl[14];
                    iArr[lIIlIlIIl[3]] = lIIlIlIIl[15];
                    iArr[lIIlIlIIl[10]] = lIIlIlIIl[16];
                    iArr[lIIlIlIIl[17]] = lIIlIlIIl[18];
                    iArr[lIIlIlIIl[19]] = lIIlIlIIl[20];
                    iArr[lIIlIlIIl[21]] = lIIlIlIIl[22];
                    iArr[lIIlIlIIl[23]] = lIIlIlIIl[24];
                    iArr[lIIlIlIIl[25]] = lIIlIlIIl[26];
                    iArr[lIIlIlIIl[27]] = lIIlIlIIl[28];
                    if (llllIlllIlI(C0004e.b(iArr) ? 1 : 0)) {
                        af();
                        System.out.println(lIIlIIllI[lIIlIlIIl[17]]);
                        bt = lIIlIlIIl[1];
                        return;
                    }
                    int[] iArr2 = new int[lIIlIlIIl[12]];
                    iArr2[lIIlIlIIl[0]] = lIIlIlIIl[13];
                    iArr2[lIIlIlIIl[1]] = lIIlIlIIl[14];
                    iArr2[lIIlIlIIl[3]] = lIIlIlIIl[15];
                    iArr2[lIIlIlIIl[10]] = lIIlIlIIl[16];
                    iArr2[lIIlIlIIl[17]] = lIIlIlIIl[18];
                    iArr2[lIIlIlIIl[19]] = lIIlIlIIl[20];
                    iArr2[lIIlIlIIl[21]] = lIIlIlIIl[22];
                    iArr2[lIIlIlIIl[23]] = lIIlIlIIl[24];
                    iArr2[lIIlIlIIl[25]] = lIIlIlIIl[26];
                    iArr2[lIIlIlIIl[27]] = lIIlIlIIl[28];
                    if (llllIlllIII(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(lIIlIlIIl[29], lIIlIlIIl[1]);
                        C0000a.a(lIIlIlIIl[30], lIIlIlIIl[1]);
                        C0000a.a(lIIlIlIIl[31], lIIlIlIIl[1]);
                        C0000a.a(lIIlIlIIl[32], lIIlIlIIl[1]);
                        C0000a.a(lIIlIlIIl[33], lIIlIlIIl[1]);
                        C0000a.a(lIIlIlIIl[34], lIIlIlIIl[1]);
                        C0000a.a(lIIlIlIIl[35], lIIlIlIIl[1]);
                        int[] iArr3 = new int[lIIlIlIIl[1]];
                        iArr3[lIIlIlIIl[0]] = lIIlIlIIl[29];
                        if (llllIlllIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIlIlIIl[1]];
                            iArr4[lIIlIlIIl[0]] = lIIlIlIIl[29];
                            if (llllIlllIlI(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIIlIlIIl[1]];
                                iArr5[lIIlIlIIl[0]] = lIIlIlIIl[29];
                                if (llllIlllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIIlIlIIl[36], lIIlIlIIl[1]);
                                }
                            }
                        }
                        C0000a.a(lIIlIlIIl[18], lIIlIlIIl[1]);
                        C0004e.l(lIIlIlIIl[29]);
                        C0004e.l(lIIlIlIIl[30]);
                        C0004e.l(lIIlIlIIl[31]);
                        C0004e.l(lIIlIlIIl[32]);
                        C0004e.l(lIIlIlIIl[33]);
                        Time.sleepTicks(lIIlIlIIl[1]);
                        "".length();
                        C0004e.l(lIIlIlIIl[35]);
                        C0004e.l(lIIlIlIIl[37]);
                        C0004e.l(lIIlIlIIl[34]);
                        C0004e.l(lIIlIlIIl[36]);
                        C0004e.l(lIIlIlIIl[18]);
                        Time.sleepTicks(lIIlIlIIl[10]);
                        "".length();
                        if (llllIlllIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIIlIlIIl[21]);
                            "".length();
                        }
                        if (llllIlllIII(Bank.isOpen() ? 1 : 0)) {
                            if (llllIlllIIl(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[38])) {
                                C0000a.a(lIIlIlIIl[13], lIIlIlIIl[12]);
                                C0000a.a(lIIlIlIIl[14], lIIlIlIIl[12]);
                                C0000a.a(lIIlIlIIl[22], lIIlIlIIl[12]);
                                C0000a.a(lIIlIlIIl[15], lIIlIlIIl[12]);
                                C0000a.b(C0005f.bf, lIIlIlIIl[1]);
                                C0000a.a(lIIlIlIIl[28], lIIlIlIIl[1]);
                                C0000a.a(lIIlIlIIl[20], lIIlIlIIl[19]);
                                C0000a.a(lIIlIlIIl[24], lIIlIlIIl[39]);
                            }
                            if (llllIlllllI(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[38])) {
                                C0000a.a(lIIlIlIIl[13], lIIlIlIIl[12]);
                                C0000a.a(lIIlIlIIl[22], lIIlIlIIl[12]);
                                C0000a.a(lIIlIlIIl[26], lIIlIlIIl[12]);
                                C0000a.b(C0005f.bf, lIIlIlIIl[1]);
                                C0000a.a(lIIlIlIIl[28], lIIlIlIIl[1]);
                                C0000a.a(lIIlIlIIl[20], lIIlIlIIl[25]);
                                C0000a.a(lIIlIlIIl[24], lIIlIlIIl[12]);
                            }
                        }
                    }
                }
            }
            if (llllIlllIII(ab() ? 1 : 0)) {
                String[] strArr = new String[lIIlIlIIl[1]];
                strArr[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[19]];
                if (llllIlllIII(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlIlIIl[1]];
                    strArr2[lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[21]];
                    Inventory.getFirst(strArr2).interact(lIIlIIllI[lIIlIlIIl[23]]);
                }
                if (llllIlllIII(Inventory.contains(C0005f.aV) ? 1 : 0) && llllIlllIIl(Movement.getRunEnergy(), lIIlIlIIl[40])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIlIIllI[lIIlIlIIl[25]]);
                    Time.sleepTicks(lIIlIlIIl[1]);
                    "".length();
                }
                if (llllIllllII(Combat.getMissingHealth(), lIIlIlIIl[41])) {
                    int[] iArr6 = new int[lIIlIlIIl[1]];
                    iArr6[lIIlIlIIl[0]] = lIIlIlIIl[24];
                    if (llllIlllIII(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIlIlIIl[1]];
                        iArr7[lIIlIlIIl[0]] = lIIlIlIIl[24];
                        Inventory.getFirst(iArr7).interact(lIIlIIllI[lIIlIlIIl[27]]);
                        Time.sleepTicks(lIIlIlIIl[3]);
                        "".length();
                    }
                }
                if (llllIllllII(Movement.getRunEnergy(), lIIlIlIIl[42]) && llllIlllIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (llllIlllIIl(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[43])) {
                    dh();
                }
                if ((!llllIlllllI(C0004e.j(lIIlIlIIl[44]), lIIlIlIIl[45]) || llllIlllIIl(C0004e.j(lIIlIlIIl[46]), lIIlIlIIl[19])) && llllIlllllI(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[43]) && llllIlllIIl(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[45])) {
                    di();
                }
                if (llllIlllllI(C0004e.j(lIIlIlIIl[44]), lIIlIlIIl[45]) && llllIlllllI(C0004e.j(lIIlIlIIl[46]), lIIlIlIIl[19])) {
                    if (llllIlllllI(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[43]) && llllIlllIIl(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[38])) {
                        di();
                    }
                    if (llllIlllllI(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[38]) && llllIlllIIl(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[45])) {
                        dj();
                    }
                }
                if (llllIlllllI(Skills.getLevel(Skill.AGILITY), lIIlIlIIl[45])) {
                    dk();
                }
            }
        }
    }

    private static boolean llllIllllII(int i, int i2) {
        return i > i2;
    }

    private static boolean llllIllllIl(int i) {
        return i > 0;
    }

    private static String llllIlIIIlI(String lIIIIllIIIIIlll, String lIIIIllIIIIIllI) {
        String str = new String(Base64.getDecoder().decode(lIIIIllIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIllIIIIIlIl = new StringBuilder();
        char[] lIIIIllIIIIIlII = lIIIIllIIIIIllI.toCharArray();
        int lIIIIlIlllllllI = lIIlIlIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIlIIl[0];
        while (llllIlllIIl(i, length)) {
            char lIIIIllIIIIlIII = charArray[i];
            lIIIIllIIIIIlIl.append((char) (lIIIIllIIIIlIII ^ lIIIIllIIIIIlII[lIIIIlIlllllllI % lIIIIllIIIIIlII.length]));
            "".length();
            lIIIIlIlllllllI++;
            i++;
            "".length();
            if ("  ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIIIllIIIIIlIl);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIlIIllI[lIIlIlIIl[203]];
    }
}
