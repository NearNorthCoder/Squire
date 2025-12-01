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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/s.class */
public class C0018s implements S {
    public static /* synthetic */ boolean dq;
    public static final /* synthetic */ WorldPoint dj;
    public static final /* synthetic */ WorldPoint dk;
    public static final /* synthetic */ WorldPoint dm;
    static /* synthetic */ ArrayList<Integer> dr;
    public static /* synthetic */ List<C0003d> bu;
    static /* synthetic */ String[] bQ;
    public static final /* synthetic */ WorldPoint di;
    public static final /* synthetic */ WorldPoint dn;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint dp;
    static /* synthetic */ int ck;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ int cY;

    /* renamed from: do  reason: not valid java name */
    public static final /* synthetic */ WorldPoint f1do;
    private static /* synthetic */ int[] lIIIIIlIIll;
    public static /* synthetic */ int cZ;
    private static /* synthetic */ String[] lIIIIIlIIIl;
    public static final /* synthetic */ WorldPoint dl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlllIllllII(C0004e.j(cY), lIIIIIlIIll[72]) && llIlllIllllII(C0004e.j(cZ), lIIIIIlIIll[3])) {
            ?? r0 = lIIIIIlIIll[0];
            "".length();
            return " ".length() != " ".length() ? ((71 ^ 45) ^ (213 ^ 182)) & (((145 ^ 156) ^ (171 ^ 175)) ^ (-" ".length())) : r0;
        }
        return lIIIIIlIIll[1];
    }

    private static boolean llIlllIllIIlI(int i) {
        return i != 0;
    }

    private static boolean llIlllIllllII(int i, int i2) {
        return i >= i2;
    }

    private static void llIlllIlIIIll() {
        lIIIIIlIIIl = new String[lIIIIIlIIll[185]];
        lIIIIIlIIIl[lIIIIIlIIll[1]] = llIlllIIlllll("JSc/BjULKzVPJBY3OAEhQyclCisQYnEcMQo6MgcvDSlxDScAJXEbKUM/JAo1Fw==", "cNQoF");
        lIIIIIlIIIl[lIIIIIlIIll[0]] = llIlllIlIIIII("D+CbLVTmGhhaRhk4azZQFA==", "VnzXN");
        lIIIIIlIIIl[lIIIIIlIIll[5]] = llIlllIlIIIIl("73I5Z5sVdMUnyFi36oiOsvt4cn2+DWcg", "llGPL");
        lIIIIIlIIIl[lIIIIIlIIll[10]] = llIlllIIlllll("LzJtJRcddyAtFgs+IyNFCSIoNxFYJDg0FRQ+KDdJWCQ6LREbPyQqAlgjImQnLQ4ECiI=", "xWMDe");
        lIIIIIlIIIl[lIIIIIlIIll[6]] = llIlllIIlllll("BQcaFBM=", "Auszx");
        lIIIIIlIIIl[lIIIIIlIIll[3]] = llIlllIlIIIIl("IVB7KkwH8/c=", "QWcKY");
        lIIIIIlIIIl[lIIIIIlIIll[16]] = llIlllIlIIIII("d/BN36Ii1uO2SK6UIHd6ig==", "PvQaS");
        lIIIIIlIIIl[lIIIIIlIIll[17]] = llIlllIIlllll("OhopJiMAAC90JhwLOyA=", "inHTW");
        lIIIIIlIIIl[lIIIIIlIIll[18]] = llIlllIlIIIII("je9FQybBbvcxvR8jl6t1fw==", "PxgED");
        lIIIIIlIIIl[lIIIIIlIIll[19]] = llIlllIIlllll("OzUgdz4adCIyJwU4M3cuGjsk", "uTVWJ");
        lIIIIIlIIIl[lIIIIIlIIll[13]] = llIlllIIlllll("MzoSLDQfJxIgKB10AiYpCA==", "zTfIF");
        lIIIIIlIIIl[lIIIIIlIIll[20]] = llIlllIlIIIII("z8ATG+SU+hpo8wr6w0LSFQ==", "UgElz");
        lIIIIIlIIIl[lIIIIIlIIll[21]] = llIlllIlIIIII("Nnyyucf94Kc=", "jjjdO");
        lIIIIIlIIIl[lIIIIIlIIll[22]] = llIlllIlIIIII("RWBUNl2FgFAnQoe6x25H5g==", "oKPKa");
        lIIIIIlIIIl[lIIIIIlIIll[23]] = llIlllIIlllll("LzMQazoOcgIkKQY9", "aRfKN");
        lIIIIIlIIIl[lIIIIIlIIll[24]] = llIlllIlIIIII("EI1j8lYqEayumyN4m/CT8Q==", "ItTgR");
        lIIIIIlIIIl[lIIIIIlIIll[27]] = llIlllIlIIIIl("hwTbSzrE4Niv8OjOsmdo/w==", "yALeR");
        lIIIIIlIIIl[lIIIIIlIIll[28]] = llIlllIlIIIII("ynsQUKi5AeZU4Uxy7QNZ/w==", "RNiZA");
        lIIIIIlIIIl[lIIIIIlIIll[29]] = llIlllIlIIIII("gh7IRJ9DLII=", "RBovS");
        lIIIIIlIIIl[lIIIIIlIIll[30]] = llIlllIIlllll("Ij8iKg==", "mOGDo");
        lIIIIIlIIIl[lIIIIIlIIll[31]] = llIlllIIlllll("ND8TJCBaNxU+LA==", "wSzIB");
        lIIIIIlIIIl[lIIIIIlIIll[32]] = llIlllIlIIIIl("Cxwc10rg8H4knj7nyiyxEw==", "RpFVL");
        lIIIIIlIIIl[lIIIIIlIIll[33]] = llIlllIlIIIIl("4Dd6qSrRj5GA0PoRnbdn0Q==", "qbKmD");
        lIIIIIlIIIl[lIIIIIlIIll[34]] = llIlllIIlllll("GDMEKCw=", "OZaDH");
        lIIIIIlIIIl[lIIIIIlIIll[35]] = llIlllIlIIIIl("snrEFE13w2sH7bZvcepqzA==", "BnapD");
        lIIIIIlIIIl[lIIIIIlIIll[36]] = llIlllIlIIIIl("Ttnypb11C0I=", "HJeHp");
        lIIIIIlIIIl[lIIIIIlIIll[37]] = llIlllIlIIIII("akZunowfYZYU7y1V3a+c1A==", "XxuQv");
        lIIIIIlIIIl[lIIIIIlIIll[38]] = llIlllIlIIIII("g31WjZAGNjg=", "ANGUa");
        lIIIIIlIIIl[lIIIIIlIIll[39]] = llIlllIlIIIIl("s0oviB0199A9tvdv5B1Z6ZXQKimB5/ll", "WsuDm");
        lIIIIIlIIIl[lIIIIIlIIll[40]] = llIlllIIlllll("MwAiKSAbDSIlPB1OMiM9CA==", "znVLR");
        lIIIIIlIIIl[lIIIIIlIIll[41]] = llIlllIlIIIIl("oVYjR8LmPQOhZngl1F/Ukw==", "fDLeM");
        lIIIIIlIIIl[lIIIIIlIIll[42]] = llIlllIlIIIII("l0jgNvmjuhs=", "JKiTy");
        lIIIIIlIIIl[lIIIIIlIIll[43]] = llIlllIIlllll("EQYPK1gRCwZnEwwNBA==", "eccGx");
        lIIIIIlIIIl[lIIIIIlIIll[44]] = llIlllIlIIIII("fdUt/v3ZIYU2hRZym0delw==", "CkANk");
        lIIIIIlIIIl[lIIIIIlIIll[45]] = llIlllIIlllll("DTM4GXASOzoV", "yRTrP");
        lIIIIIlIIIl[lIIIIIlIIll[46]] = llIlllIlIIIII("qY+I0f9AHdkgLbVrouIviA==", "nFefd");
        lIIIIIlIIIl[lIIIIIlIIll[47]] = llIlllIlIIIIl("JNTjxkRzPb1JxmJN/D/3mA==", "zrBoh");
        lIIIIIlIIIl[lIIIIIlIIll[48]] = llIlllIIlllll("PioWLBcSNxYgCxBkBiYKBQ==", "wDbIe");
        lIIIIIlIIIl[lIIIIIlIIll[49]] = llIlllIlIIIIl("NVLcqTnw9KRMxFbG7j1VnA==", "ksSQr");
        lIIIIIlIIIl[lIIIIIlIIll[50]] = llIlllIlIIIII("qI9IPMbx6AQ=", "SQBlg");
        lIIIIIlIIIl[lIIIIIlIIll[51]] = llIlllIlIIIII("E/HQeaJbTg5RyAZszw18Pg==", "HPLQW");
        lIIIIIlIIIl[lIIIIIlIIll[52]] = llIlllIlIIIIl("J655Iqutlwwd8RaLQrVMUw==", "Edxoj");
        lIIIIIlIIIl[lIIIIIlIIll[53]] = llIlllIlIIIIl("eSQ1tNk/JaxkXOMshD7paGfw/lReVqNv", "jiGVP");
        lIIIIIlIIIl[lIIIIIlIIll[55]] = llIlllIlIIIIl("5wYK1OfZjyA=", "JpaIb");
        lIIIIIlIIIl[lIIIIIlIIll[56]] = llIlllIIlllll("FDo9LgQ9dTovGA==", "SUQJa");
        lIIIIIlIIIl[lIIIIIlIIll[57]] = llIlllIlIIIIl("GgnRxG3D3ts=", "wseEO");
        lIIIIIlIIIl[lIIIIIlIIll[58]] = llIlllIIlllll("MQIzJw==", "ecXBy");
        lIIIIIlIIIl[lIIIIIlIIll[59]] = llIlllIlIIIIl("lBXXtcYl/OjzuKTzguawQw==", "XoVeb");
        lIIIIIlIIIl[lIIIIIlIIll[60]] = llIlllIIlllll("JBEvQQYFUCoVEx4FPBI=", "jpYar");
        lIIIIIlIIIl[lIIIIIlIIll[61]] = llIlllIlIIIII("IxD+cPa+hLrV04jZs/Lucw==", "mGcuj");
        lIIIIIlIIIl[lIIIIIlIIll[15]] = llIlllIIlllll("MzgiJFMRLzQ=", "zJMJs");
        lIIIIIlIIIl[lIIIIIlIIll[62]] = llIlllIlIIIIl("aXdDwhD+qcKQP9S+7/4LbA==", "VbnKm");
        lIIIIIlIIIl[lIIIIIlIIll[63]] = llIlllIIlllll("EwYeHQI6BEoeCiAGGA==", "Tcjik");
        lIIIIIlIIIl[lIIIIIlIIll[64]] = llIlllIlIIIII("drz4YyfL9Pg=", "JYaVH");
        lIIIIIlIIIl[lIIIIIlIIll[66]] = llIlllIlIIIIl("yZ8ijCtgWb01Fp8McKv0bA==", "lktNx");
        lIIIIIlIIIl[lIIIIIlIIll[67]] = llIlllIIlllll("PBEmAghREzUdFAM=", "qdTiq");
        lIIIIIlIIIl[lIIIIIlIIll[68]] = llIlllIlIIIII("kasOyH7X5dFm+kX7hXYSSQ==", "IXJTD");
        lIIIIIlIIIl[lIIIIIlIIll[69]] = llIlllIlIIIIl("10BxCqxrZY4butF3Plku8HDw/FuyZ09i", "tfMCW");
        lIIIIIlIIIl[lIIIIIlIIll[70]] = llIlllIlIIIII("gjzq+q0UqnmonoWXs1FcYg==", "nXphD");
        lIIIIIlIIIl[lIIIIIlIIll[71]] = llIlllIIlllll("NTwOBWkSNg0b", "vYbiI");
        lIIIIIlIIIl[lIIIIIlIIll[72]] = llIlllIlIIIII("6yXd/DTdJPM=", "ptBSf");
        lIIIIIlIIIl[lIIIIIlIIll[73]] = llIlllIIlllll("JTw3EBcCNHIUBRM1IA==", "gPRcd");
        lIIIIIlIIIl[lIIIIIlIIll[74]] = llIlllIlIIIII("qTHJ+W3s1d7mmedK4Znh7Q==", "YwQjF");
        lIIIIIlIIIl[lIIIIIlIIll[75]] = llIlllIlIIIIl("z3dGJAa/YrI=", "ghChp");
        lIIIIIlIIIl[lIIIIIlIIll[76]] = llIlllIlIIIII("26S3YCNErkKt12gZOyU98g==", "bWnlh");
        lIIIIIlIIIl[lIIIIIlIIll[77]] = llIlllIlIIIII("YPNsML4HTcmkFHWZSO3I1A==", "VYQUO");
        lIIIIIlIIIl[lIIIIIlIIll[78]] = llIlllIIlllll("IyAKFA==", "lPozK");
        lIIIIIlIIIl[lIIIIIlIIll[79]] = llIlllIlIIIII("wqYlGMCU2VLo6j6cXtiZ+Q==", "gFiLP");
        lIIIIIlIIIl[lIIIIIlIIll[80]] = llIlllIIlllll("OSoMHi8U", "zEjxF");
        lIIIIIlIIIl[lIIIIIlIIll[81]] = llIlllIlIIIII("MTwXaRkifRZ43f0xzTJcvzcac578wdCU", "jEmMa");
        lIIIIIlIIIl[lIIIIIlIIll[82]] = llIlllIlIIIIl("AYSsADqZaRCJrenWQYvSNQ==", "WZznH");
        lIIIIIlIIIl[lIIIIIlIIll[83]] = llIlllIIlllll("LzYeBwYEKVcQCgYi", "jNwso");
        lIIIIIlIIIl[lIIIIIlIIll[84]] = llIlllIlIIIIl("G3Y4ZcqYJJMuPO0Rk24b1A==", "bTlYE");
        lIIIIIlIIIl[lIIIIIlIIll[85]] = llIlllIIlllll("OykcOg==", "tYyTK");
        lIIIIIlIIIl[lIIIIIlIIll[86]] = llIlllIIlllll("FREXHSc9", "QcrgB");
        lIIIIIlIIIl[lIIIIIlIIll[87]] = llIlllIIlllll("Cxs5Lj0qFDBqMisbIw==", "CzWJQ");
        lIIIIIlIIIl[lIIIIIlIIll[88]] = llIlllIIlllll("KAEcHA0A", "lsyfh");
        lIIIIIlIIIl[lIIIIIlIIll[89]] = llIlllIlIIIII("XIO+V9jOKUl/1yBNY5TZcw==", "sajnv");
        lIIIIIlIIIl[lIIIIIlIIll[90]] = llIlllIlIIIIl("yaPkv8Vrsx/8EeqFmhGtJg==", "cclVd");
        lIIIIIlIIIl[lIIIIIlIIll[91]] = llIlllIlIIIII("GH7qG1yc/Qo=", "rTorh");
        lIIIIIlIIIl[lIIIIIlIIll[92]] = llIlllIIlllll("BScYRjUkZggPLyoqThIoJyM=", "KFnfA");
        lIIIIIlIIIl[lIIIIIlIIll[98]] = llIlllIlIIIIl("S7csjNLpF7kkfa4TDb7RtA==", "ypFWB");
        lIIIIIlIIIl[lIIIIIlIIll[99]] = llIlllIlIIIII("sTOKjH5zn8I=", "hlUkV");
        lIIIIIlIIIl[lIIIIIlIIll[100]] = llIlllIlIIIII("19Wa9XtkFh0=", "bNKFc");
        lIIIIIlIIIl[lIIIIIlIIll[101]] = llIlllIIlllll("NAcdIQdaDxs7Cw==", "wktLe");
        lIIIIIlIIIl[lIIIIIlIIll[102]] = llIlllIIlllll("BBg4Hw9qED4FAw==", "GtQrm");
        lIIIIIlIIIl[lIIIIIlIIll[103]] = llIlllIIlllll("PgogCgIfBSlODR4KOg==", "vkNnn");
        lIIIIIlIIIl[lIIIIIlIIll[104]] = llIlllIlIIIIl("GKr4MTlksHo=", "KCNDl");
        lIIIIIlIIIl[lIIIIIlIIll[105]] = llIlllIlIIIII("zw7wiElksuoN+1NmzFHy5g==", "XDzPQ");
        lIIIIIlIIIl[lIIIIIlIIll[106]] = llIlllIlIIIII("56K94bZN63+2rWuo1jG3Ew==", "ufKEs");
        lIIIIIlIIIl[lIIIIIlIIll[107]] = llIlllIIlllll("DSApAjcl", "IRLxR");
        lIIIIIlIIIl[lIIIIIlIIll[108]] = llIlllIIlllll("EzEBJkomNwAmBCAh", "CDsCj");
        lIIIIIlIIIl[lIIIIIlIIll[109]] = llIlllIIlllll("NjwgKjsYICZoNB48JGg8Aj0=", "qNAHY");
        lIIIIIlIIIl[lIIIIIlIIll[110]] = llIlllIlIIIIl("frohzfnnljx1QXeQ27LRwg==", "UtwQl");
        lIIIIIlIIIl[lIIIIIlIIll[111]] = llIlllIlIIIIl("pIbYTEI9ae/xJSg/kSqr/4fKghsFySfp", "jPspk");
        lIIIIIlIIIl[lIIIIIlIIll[112]] = llIlllIIlllll("ERwMNQ4qAR8=", "EnmEj");
        lIIIIIlIIIl[lIIIIIlIIll[113]] = llIlllIlIIIII("STfS8EkK38I=", "pwysq");
        lIIIIIlIIIl[lIIIIIlIIll[114]] = llIlllIlIIIIl("RfIeGraSzCU=", "ZuAfT");
        lIIIIIlIIIl[lIIIIIlIIll[115]] = llIlllIlIIIII("D4QoAmUhn1zV5KrHYhKahA==", "wAwsT");
        lIIIIIlIIIl[lIIIIIlIIll[116]] = llIlllIlIIIII("7OWHQM10y2WfNmzKA6kkMA==", "vHTIQ");
        lIIIIIlIIIl[lIIIIIlIIll[117]] = llIlllIlIIIIl("UfqHJOqs8NhlYW04EyTSlDVHVQ+0fwWxrA11tSHORVtHIlmiVaaNTg==", "cuFSw");
        lIIIIIlIIIl[lIIIIIlIIll[119]] = llIlllIIlllll("MhAzLiMa", "vbVTF");
        lIIIIIlIIIl[lIIIIIlIIll[127]] = llIlllIlIIIII("pdTcpyIUAQB8Yy1ddmvMCg==", "YvkfM");
        lIIIIIlIIIl[lIIIIIlIIll[128]] = llIlllIlIIIII("Pp9ccwojN/blwSZqngitrQ==", "bfoSd");
        lIIIIIlIIIl[lIIIIIlIIll[129]] = llIlllIlIIIIl("scp0rpgWZKUakk6NVg/9Mw==", "TEKnb");
        lIIIIIlIIIl[lIIIIIlIIll[130]] = llIlllIlIIIII("C/zLlBqB/qyjoVlaEt4lMg==", "jOYTs");
        lIIIIIlIIIl[lIIIIIlIIll[131]] = llIlllIlIIIIl("Akjm+020blVRUYQYFMedtafF9JbTvEai", "BDIsi");
        lIIIIIlIIIl[lIIIIIlIIll[2]] = llIlllIlIIIII("EBjUFdqnjwarrTai1t3PMw==", "XQpJe");
        lIIIIIlIIIl[lIIIIIlIIll[132]] = llIlllIlIIIIl("ynwCmmFY1zE=", "pZnpZ");
        lIIIIIlIIIl[lIIIIIlIIll[133]] = llIlllIlIIIII("eSOqpmTpYlk=", "AVfjr");
        lIIIIIlIIIl[lIIIIIlIIll[134]] = llIlllIlIIIIl("wrqcrHobZ59KyyGipCINWg==", "LCdLR");
        lIIIIIlIIIl[lIIIIIlIIll[135]] = llIlllIlIIIIl("BkinroUXyQgaqK8Re3gj7Q==", "PtCKc");
        lIIIIIlIIIl[lIIIIIlIIll[136]] = llIlllIlIIIII("lVDCl89E2pzVBy8IN9p1mA==", "TpvVd");
        lIIIIIlIIIl[lIIIIIlIIll[137]] = llIlllIlIIIII("N4zivkwhHRvHTCL2OqBocmMKmg1PJ2Ma", "fwpGa");
        lIIIIIlIIIl[lIIIIIlIIll[138]] = llIlllIlIIIII("GIxjLwvVPkTMR87CA+qkGg==", "ZvMUC");
        lIIIIIlIIIl[lIIIIIlIIll[139]] = llIlllIlIIIIl("4PCYLUiaCuGHDXlSaaaiX1QVKoC3FiNX", "FBpZo");
        lIIIIIlIIIl[lIIIIIlIIll[140]] = llIlllIlIIIII("i8GU/pr3uG0=", "iEoqv");
        lIIIIIlIIIl[lIIIIIlIIll[141]] = llIlllIlIIIIl("9m4a8LW66vk=", "YsCbl");
        lIIIIIlIIIl[lIIIIIlIIll[147]] = llIlllIIlllll("ACEgCh0kcwABTgA2OwYC", "PSIon");
        lIIIIIlIIIl[lIIIIIlIIll[148]] = llIlllIlIIIIl("fXh8xNhR/6ezYVV/3s65QpM7jM7sarGP", "SyAYE");
        lIIIIIlIIIl[lIIIIIlIIll[165]] = llIlllIIlllll("E0UObSc1DQgkJT1CBSI5egNDPD4/ERds", "ZbcMK");
        lIIIIIlIIIl[lIIIIIlIIll[166]] = llIlllIlIIIIl("Oqyvoal2lBo=", "NLYrL");
        lIIIIIlIIIl[lIIIIIlIIll[167]] = llIlllIIlllll("DCx4agsmM3QnAmMvMSYXYzM8Lwlt", "CGTJg");
        lIIIIIlIIIl[lIIIIIlIIll[168]] = llIlllIIlllll("NAYZaUUDDB5lEQgPBWUICEMeLQQZQx0tAE0TGyoHAQYEZQweTQ==", "mciEe");
        lIIIIIlIIIl[lIIIIIlIIll[169]] = llIlllIIlllll("PzM1F0E=", "lFGro");
        lIIIIIlIIIl[lIIIIIlIIll[170]] = llIlllIlIIIIl("IrE+askKWtXJ9CCureSit7+e3L7LNCwf", "BpqRx");
        lIIIIIlIIIl[lIIIIIlIIll[171]] = llIlllIlIIIIl("NVmmHljRVMsGqcOgM1Q0s2Q4xgM+WbjePpuqbuOib6CFRBJuFwNGcwr3EIauv+A+FpBqQ/QW7YI=", "yBtne");
        lIIIIIlIIIl[lIIIIIlIIll[172]] = llIlllIIlllll("Jy8pBnZQPS0LLlAjNkozBGZlI3odKzxKOBVqJAg2FWoxBXoYLykaZQ==", "pJEjZ");
        lIIIIIlIIIl[lIIIIIlIIll[173]] = llIlllIIlllll("EQ0HYm0BTxgibS8HVC8jLEgYISIjSBIhP2gAHSNj", "HhtNM");
        lIIIIIlIIIl[lIIIIIlIIll[174]] = llIlllIlIIIIl("o2ExPj4uzp9M5eYkalZRiQ==", "slxNh");
        lIIIIIlIIIl[lIIIIIlIIll[175]] = llIlllIlIIIII("L/axbz0QlnNP8krkOwXfZQ==", "hWfuo");
        lIIIIIlIIIl[lIIIIIlIIll[176]] = llIlllIlIIIII("BA/gONlkF1AuTHxHKifYlg==", "wUezW");
        lIIIIIlIIIl[lIIIIIlIIll[177]] = llIlllIlIIIII("f6CPTs6OhicS4ck5KUvS/CGte8ap0yq2UxCMOEqTRyQ=", "HAEWo");
        lIIIIIlIIIl[lIIIIIlIIll[178]] = llIlllIlIIIII("yaPS2eF2JsOrkoma+esAqA==", "NrlqC");
        lIIIIIlIIIl[lIIIIIlIIll[179]] = llIlllIlIIIIl("d+3cwbmBv8cgB05MtkTSW7tEJzt3SA24rKgDjsyleBQ1tyJFE6dlig==", "WgdqS");
        lIIIIIlIIIl[lIIIIIlIIll[180]] = llIlllIIlllll("NgM2Zj4SSzsuMkEZJjAyE0s8MzQJSy5mMA4EK2YzBA0qKDQEVA==", "akOFW");
        lIIIIIlIIIl[lIIIIIlIIll[181]] = llIlllIlIIIIl("OHzWhzpVLL7crGQ0uP+90hh2GpYroNvL", "vaULo");
        lIIIIIlIIIl[lIIIIIlIIll[182]] = llIlllIIlllll("AzY+YnA1NW0tPy8hPit+", "ZSMNP");
        lIIIIIlIIIl[lIIIIIlIIll[183]] = llIlllIlIIIII("5yTKYpUgvKzFLukGSxlkgeRfbDRWdoR8vxo8igiR1CApSxhffa4cMx/+cZ8AQU2y", "CYtVX");
        lIIIIIlIIIl[lIIIIIlIIll[184]] = llIlllIlIIIIl("fYfATtfmZPsR3DSXq3P2Nms/frr3Qdo59iPz/396yIFMOQYb+5/Z/rkJyMO6N1qj", "BGhwK");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0172, code lost:
        if (llIlllIllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0018s.lIIIIIlIIll[15]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2 = new int[lIIIIIlIIll[0]];
        iArr2[lIIIIIlIIll[1]] = lIIIIIlIIll[14];
        if (llIlllIllIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIlIIll[14], lIIIIIlIIll[0], lIIIIIlIIll[142]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIIlIIll[0]];
        iArr3[lIIIIIlIIll[1]] = lIIIIIlIIll[8];
        if (llIlllIllIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIlIIll[8], lIIIIIlIIll[0], lIIIIIlIIll[142]));
            "".length();
        }
        int[] iArr4 = new int[lIIIIIlIIll[0]];
        iArr4[lIIIIIlIIll[1]] = lIIIIIlIIll[11];
        if (llIlllIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIlIIll[11], lIIIIIlIIll[3], C0008i.bp));
            "".length();
        }
        int[] iArr5 = new int[lIIIIIlIIll[0]];
        iArr5[lIIIIIlIIll[1]] = lIIIIIlIIll[12];
        if (llIlllIllIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIlIIll[12], lIIIIIlIIll[41], lIIIIIlIIll[143]));
            "".length();
        }
        int[] iArr6 = new int[lIIIIIlIIll[0]];
        iArr6[lIIIIIlIIll[1]] = lIIIIIlIIll[9];
        if (llIlllIllIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIIIIlIIll[0]];
            iArr7[lIIIIIlIIll[1]] = lIIIIIlIIll[9];
            if (llIlllIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIIIlIIll[0]];
                iArr8[lIIIIIlIIll[1]] = lIIIIIlIIll[9];
            }
            if (llIlllIllIlII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIIIlIIIl[lIIIIIlIIll[148]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(lIIIIIlIIll[144], lIIIIIlIIll[3], lIIIIIlIIll[145]));
                "".length();
            }
            iArr = new int[lIIIIIlIIll[0]];
            iArr[lIIIIIlIIll[1]] = lIIIIIlIIll[7];
            if (llIlllIllIlII(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bu.add(new C0003d(lIIIIIlIIll[7], lIIIIIlIIll[51], lIIIIIlIIll[146]));
            "".length();
            return;
        }
        bu.add(new C0003d(lIIIIIlIIll[9], lIIIIIlIIll[15], lIIIIIlIIll[107]));
        "".length();
        if (llIlllIllIlII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIIIlIIIl[lIIIIIlIIll[148]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIIIIIlIIll[0]];
        iArr[lIIIIIlIIll[1]] = lIIIIIlIIll[7];
        if (llIlllIllIlII(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static boolean llIlllIllIlll(int i) {
        return i > 0;
    }

    private static boolean llIlllIlllIII(int i) {
        return i < 0;
    }

    private static boolean llIlllIllIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlllIllIIll(int i, int i2) {
        return i < i2;
    }

    private static void aM() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIlllIllIllI(nearest) && llIlllIllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[136]];
            C0000a.a(nearest);
        }
        if (llIlllIllIllI(nearest) && llIlllIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIIIlIIll[4]);
                "".length();
            }
            if (llIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[137]];
                if (llIlllIllIlll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIIIlIIll[6]);
                    "".length();
                }
                C0000a.a(lIIIIIlIIll[7], lIIIIIlIIll[13]);
                C0000a.a(lIIIIIlIIll[11], lIIIIIlIIll[0]);
                C0000a.a(lIIIIIlIIll[9], lIIIIIlIIll[41]);
            }
        }
    }

    private static void bd() {
        dr.add(Integer.valueOf(lIIIIIlIIll[120]));
        "".length();
        dr.add(Integer.valueOf(lIIIIIlIIll[121]));
        "".length();
        dr.add(Integer.valueOf(lIIIIIlIIll[122]));
        "".length();
        dr.add(Integer.valueOf(lIIIIIlIIll[123]));
        "".length();
        dr.add(Integer.valueOf(lIIIIIlIIll[124]));
        "".length();
        dr.add(Integer.valueOf(lIIIIIlIIll[125]));
        "".length();
        dr.add(Integer.valueOf(lIIIIIlIIll[126]));
        "".length();
        while (llIlllIllIlII(dr.isEmpty() ? 1 : 0) && llIlllIllIlII(dr.isEmpty() ? 1 : 0)) {
            String[] strArr = new String[lIIIIIlIIll[0]];
            strArr[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[127]];
            if (llIlllIllIIlI(Inventory.contains(strArr) ? 1 : 0)) {
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            }
            int[] iArr = new int[lIIIIIlIIll[0]];
            iArr[lIIIIIlIIll[1]] = dr.get(lIIIIIlIIll[1]).intValue();
            TileObject nearest = TileObjects.getNearest(iArr);
            if (llIlllIllIllI(nearest)) {
                String[] strArr2 = new String[lIIIIIlIIll[0]];
                strArr2[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[128]];
                if (llIlllIllIIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIIIIlIIll[0]];
                    strArr3[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[129]];
                    Inventory.getFirst(strArr3).useOn(nearest);
                    Time.sleepTicks(lIIIIIlIIll[3]);
                    "".length();
                }
            }
            String[] strArr4 = new String[lIIIIIlIIll[0]];
            strArr4[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[130]];
            if (llIlllIllIlII(Inventory.contains(strArr4) ? 1 : 0)) {
                dr.remove(lIIIIIlIIll[1]);
                "".length();
                Time.sleepTicks(lIIIIIlIIll[5]);
                "".length();
            }
            "".length();
            if ((-((95 ^ 126) ^ (121 ^ 93))) >= 0) {
                return;
            }
        }
    }

    private static boolean llIlllIlllIIl(int i, int i2) {
        return i > i2;
    }

    private static void aN() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIlllIllIllI(nearest) && llIlllIllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[138]];
            C0000a.a(nearest);
        }
        if (llIlllIllIllI(nearest) && llIlllIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIIIlIIll[4]);
                "".length();
            }
            if (llIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[139]];
                if (llIlllIllIlll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIIIlIIll[6]);
                    "".length();
                }
                C0000a.a(lIIIIIlIIll[7], lIIIIIlIIll[13]);
                C0000a.a(lIIIIIlIIll[8], lIIIIIlIIll[0]);
                C0000a.a(lIIIIIlIIll[11], lIIIIIlIIll[0]);
                C0000a.a(lIIIIIlIIll[12], lIIIIIlIIll[3]);
                C0000a.a(lIIIIIlIIll[9], lIIIIIlIIll[41]);
            }
        }
    }

    private static boolean llIlllIlllIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bf() {
        String[] strArr = new String[lIIIIIlIIll[0]];
        strArr[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[140]];
        if (llIlllIllIlll(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIIIIIlIIll[0]];
            iArr[lIIIIIlIIll[1]] = lIIIIIlIIll[12];
            if (llIlllIllIlll(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIIIIIlIIll[0]];
                iArr2[lIIIIIlIIll[1]] = lIIIIIlIIll[11];
                if (llIlllIllIlll(Inventory.getCount(iArr2))) {
                    int[] iArr3 = new int[lIIIIIlIIll[0]];
                    iArr3[lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                    if (llIlllIllIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = lIIIIIlIIll[0];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lIIIIIlIIll[1];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lIIIIIlIIIl[lIIIIIlIIll[147]];
    }

    private static String llIlllIIlllll(String lllllllllllllllllIIlllIllIIlllII, String lllllllllllllllllIIlllIllIIllIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIIlllIllIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIIlllIllIIllIll.toCharArray();
        int lllllllllllllllllIIlllIllIIllIII = lIIIIIlIIll[1];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllllIIlllIllIIlIIIl = charArray2.length;
        int i = lIIIIIlIIll[1];
        while (llIlllIllIIll(i, lllllllllllllllllIIlllIllIIlIIIl)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIIlllIllIIllIII % charArray.length]));
            "".length();
            lllllllllllllllllIIlllIllIIllIII++;
            i++;
            "".length();
            if (((((84 + 72) - 54) + 87) ^ (((148 + 98) - 186) + 125)) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            bc();
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return ((4 ^ 84) ^ (25 ^ 30)) & (((((169 + 30) - 118) + 145) ^ (((4 + 1) - (-71)) + 105)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return lIIIIIlIIll[117];
    }

    private static String llIlllIlIIIIl(String lllllllllllllllllIIlllIlIllllIlI, String lllllllllllllllllIIlllIlIllllIIl) {
        try {
            SecretKeySpec lllllllllllllllllIIlllIlIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllIlIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIlllIlIlllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIlllIlIlllllII.init(lIIIIIlIIll[5], lllllllllllllllllIIlllIlIlllllIl);
            return new String(lllllllllllllllllIIlllIlIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIlllIlIllllIll) {
            lllllllllllllllllIIlllIlIllllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v563, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v797, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v819, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void bc() {
        if (llIlllIllIIlI(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIlllIllIIll(bu.size(), lIIIIIlIIll[0])) {
                System.out.println(lIIIIIlIIIl[lIIIIIlIIll[1]]);
                bs = lIIIIIlIIll[1];
            }
        }
        if (llIlllIllIlII(bs ? 1 : 0)) {
            if (llIlllIllIIll(C0004e.j(lIIIIIlIIll[2]), lIIIIIlIIll[3])) {
                K.cY();
            }
            if (llIlllIllIlII(bf() ? 1 : 0) && llIlllIllIIll(C0004e.j(cY), lIIIIIlIIll[0]) && llIlllIllIlIl(C0004e.j(lIIIIIlIIll[2]), lIIIIIlIIll[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlllIllIllI(nearest) && llIlllIllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[0]];
                    C0000a.a(nearest);
                }
                if (llIlllIllIllI(nearest) && llIlllIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIlIIll[4]);
                        "".length();
                    }
                    if (llIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[5]];
                        if (llIlllIllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIlIIll[6]);
                            "".length();
                        }
                        if (llIlllIllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIlIIll[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIIlIIll[3]];
                        iArr[lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                        iArr[lIIIIIlIIll[0]] = lIIIIIlIIll[8];
                        iArr[lIIIIIlIIll[5]] = lIIIIIlIIll[9];
                        iArr[lIIIIIlIIll[10]] = lIIIIIlIIll[11];
                        iArr[lIIIIIlIIll[6]] = lIIIIIlIIll[12];
                        if (llIlllIllIlII(C0004e.b(iArr) ? 1 : 0)) {
                            ae();
                            System.out.println(lIIIIIlIIIl[lIIIIIlIIll[10]]);
                            bs = lIIIIIlIIll[0];
                            return;
                        }
                        int[] iArr2 = new int[lIIIIIlIIll[3]];
                        iArr2[lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                        iArr2[lIIIIIlIIll[0]] = lIIIIIlIIll[8];
                        iArr2[lIIIIIlIIll[5]] = lIIIIIlIIll[9];
                        iArr2[lIIIIIlIIll[10]] = lIIIIIlIIll[11];
                        iArr2[lIIIIIlIIll[6]] = lIIIIIlIIll[12];
                        if (llIlllIllIIlI(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIIIIlIIll[7], lIIIIIlIIll[13]);
                            C0000a.a(lIIIIIlIIll[14], lIIIIIlIIll[0]);
                            C0000a.a(lIIIIIlIIll[8], lIIIIIlIIll[0]);
                            C0000a.a(lIIIIIlIIll[11], lIIIIIlIIll[6]);
                            C0000a.a(lIIIIIlIIll[12], lIIIIIlIIll[13]);
                        }
                    }
                }
            }
            if (llIlllIllIIlI(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlllIllIIll(Movement.getRunEnergy(), lIIIIIlIIll[15])) {
                Inventory.getFirst(C0005f.aU).interact(lIIIIIlIIIl[lIIIIIlIIll[6]]);
                Time.sleepTicks(lIIIIIlIIll[0]);
                "".length();
            }
            int[] iArr3 = new int[lIIIIIlIIll[0]];
            iArr3[lIIIIIlIIll[1]] = lIIIIIlIIll[12];
            if (llIlllIllIIlI(Inventory.contains(iArr3) ? 1 : 0) && llIlllIlllIII(llIlllIllIIIl(C0004e.u(), 60.0d))) {
                int[] iArr4 = new int[lIIIIIlIIll[0]];
                iArr4[lIIIIIlIIll[1]] = lIIIIIlIIll[12];
                Inventory.getFirst(iArr4).interact(lIIIIIlIIIl[lIIIIIlIIll[3]]);
                Time.sleepTicks(lIIIIIlIIll[0]);
                "".length();
            }
            if (llIlllIllIIll(C0004e.j(cY), lIIIIIlIIll[0]) && llIlllIllIIlI(bf() ? 1 : 0)) {
                if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(di), lIIIIIlIIll[10])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[16]];
                    if (llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(di);
                    "".length();
                    Time.sleepTicks(lIIIIIlIIll[0]);
                    "".length();
                }
                if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(di), lIIIIIlIIll[10])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[17]];
                    C0006g.a(lIIIIIlIIIl[lIIIIIlIIll[18]], bQ);
                }
            }
            if (llIlllIllIlIl(C0004e.j(cY), lIIIIIlIIll[0])) {
                if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIIIlIIll[5])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[19]];
                    Movement.walkTo(dj);
                    "".length();
                    Time.sleepTicks(lIIIIIlIIll[0]);
                    "".length();
                }
                if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIIIlIIll[5])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[13]];
                    if (llIlllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[lIIIIIlIIll[0]];
                        strArr[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[20]];
                        TileObjects.getNearest(strArr).interact(lIIIIIlIIIl[lIIIIIlIIll[21]]);
                    }
                    C0006g.a(bQ);
                }
            }
            if (llIlllIllIlIl(C0004e.j(cY), lIIIIIlIIll[5])) {
                String[] strArr2 = new String[lIIIIIlIIll[0]];
                strArr2[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[22]];
                if (llIlllIlllIll(NPCs.getNearest(strArr2))) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[23]];
                    String[] strArr3 = new String[lIIIIIlIIll[0]];
                    strArr3[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[24]];
                    TileObject nearest2 = TileObjects.getNearest(strArr3);
                    if (llIlllIllIllI(nearest2) && llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(nearest2), lIIIIIlIIll[6]) && llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        C0006g.a(bQ);
                    }
                    if (!llIlllIllIIlI(Dialog.isOpen() ? 1 : 0) || llIlllIlllIIl(Players.getLocal().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[26], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                        Movement.walkTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[26], lIIIIIlIIll[1]));
                        "".length();
                        Time.sleepTicks(lIIIIIlIIll[10]);
                        "".length();
                    }
                }
                if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[26], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                    String[] strArr4 = new String[lIIIIIlIIll[0]];
                    strArr4[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[27]];
                    if (llIlllIlllIll(NPCs.getNearest(strArr4))) {
                        String[] strArr5 = new String[lIIIIIlIIll[0]];
                        strArr5[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[28]];
                        TileObject nearest3 = TileObjects.getNearest(strArr5);
                        if (llIlllIllIllI(nearest3) && llIlllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[lIIIIIlIIll[0]];
                            strArr6[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[29]];
                            if (llIlllIllIIlI(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                nearest3.interact(lIIIIIlIIIl[lIIIIIlIIll[30]]);
                                Time.sleepTicks(lIIIIIlIIll[5]);
                                "".length();
                            }
                            String[] strArr7 = new String[lIIIIIlIIll[0]];
                            strArr7[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[31]];
                            if (llIlllIllIIlI(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                nearest3.interact(lIIIIIlIIIl[lIIIIIlIIll[32]]);
                                Time.sleepTicks(lIIIIIlIIll[5]);
                                "".length();
                            }
                        }
                        C0006g.a(bQ);
                    }
                }
                String[] strArr8 = new String[lIIIIIlIIll[0]];
                strArr8[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[33]];
                if (llIlllIllIllI(NPCs.getNearest(strArr8))) {
                    int[] iArr5 = new int[lIIIIIlIIll[0]];
                    iArr5[lIIIIIlIIll[1]] = lIIIIIlIIll[14];
                    if (llIlllIllIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIIIIlIIll[0]];
                        iArr6[lIIIIIlIIll[1]] = lIIIIIlIIll[14];
                        if (llIlllIllIlII(Equipment.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[lIIIIIlIIll[0]];
                            iArr7[lIIIIIlIIll[1]] = lIIIIIlIIll[14];
                            Inventory.getFirst(iArr7).interact(lIIIIIlIIIl[lIIIIIlIIll[34]]);
                        }
                    }
                    if (llIlllIlllIll(Players.getLocal().getInteracting())) {
                        String[] strArr9 = new String[lIIIIIlIIll[0]];
                        strArr9[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[35]];
                        NPCs.getNearest(strArr9).interact(lIIIIIlIIIl[lIIIIIlIIll[36]]);
                        Time.sleepTicks(lIIIIIlIIll[5]);
                        "".length();
                    }
                }
            }
            if (llIlllIllIlIl(C0004e.j(cY), lIIIIIlIIll[10])) {
                if (llIlllIllIlII(dq ? 1 : 0)) {
                    if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIIIlIIll[5])) {
                        String[] strArr10 = new String[lIIIIIlIIll[0]];
                        strArr10[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[37]];
                        if (llIlllIllIllI(TileObjects.getNearest(strArr10))) {
                            int[] iArr8 = new int[lIIIIIlIIll[0]];
                            iArr8[lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                            if (llIlllIllIIlI(Inventory.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[lIIIIIlIIll[0]];
                                iArr9[lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                                Inventory.getFirst(iArr9).interact(lIIIIIlIIIl[lIIIIIlIIll[38]]);
                                Time.sleepTicks(lIIIIIlIIll[3]);
                                "".length();
                            }
                        }
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[39]];
                        Movement.walkTo(dj);
                        "".length();
                        Time.sleepTicks(lIIIIIlIIll[0]);
                        "".length();
                    }
                    if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIIIlIIll[5])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[40]];
                        if (llIlllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr11 = new String[lIIIIIlIIll[0]];
                            strArr11[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[41]];
                            TileObjects.getNearest(strArr11).interact(lIIIIIlIIIl[lIIIIIlIIll[42]]);
                        }
                        C0006g.a(bQ);
                        if (llIlllIllIIlI(Dialog.isOpen() ? 1 : 0) && llIlllIllIIlI(Dialog.getText().contains(lIIIIIlIIIl[lIIIIIlIIll[43]]) ? 1 : 0)) {
                            dq = lIIIIIlIIll[0];
                        }
                    }
                }
                if (llIlllIllIIlI(dq ? 1 : 0)) {
                    if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(di), lIIIIIlIIll[10])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[44]];
                        Movement.walkTo(di);
                        "".length();
                        Time.sleepTicks(lIIIIIlIIll[0]);
                        "".length();
                    }
                    if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(di), lIIIIIlIIll[10])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[45]];
                        C0006g.a(lIIIIIlIIIl[lIIIIIlIIll[46]], bQ);
                    }
                }
            }
            if (llIlllIllIlIl(C0004e.j(cY), lIIIIIlIIll[6])) {
                ck = lIIIIIlIIll[1];
                if (llIlllIllIlII(aa() ? 1 : 0)) {
                    aN();
                }
                if (llIlllIllIIlI(aa() ? 1 : 0)) {
                    if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIIIlIIll[10])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[47]];
                        if (llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(dm);
                        "".length();
                        Time.sleepTicks(lIIIIIlIIll[0]);
                        "".length();
                    }
                    if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIIIlIIll[10])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[48]];
                        if (llIlllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr12 = new String[lIIIIIlIIll[0]];
                            strArr12[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[49]];
                            TileObjects.getNearest(strArr12).interact(lIIIIIlIIIl[lIIIIIlIIll[50]]);
                        }
                        C0006g.a(bQ);
                    }
                }
            }
            if (llIlllIllIlIl(C0004e.j(cY), lIIIIIlIIll[3])) {
                String[] strArr13 = new String[lIIIIIlIIll[0]];
                strArr13[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[51]];
                if (llIlllIllIlII(Inventory.contains(strArr13) ? 1 : 0)) {
                    String[] strArr14 = new String[lIIIIIlIIll[0]];
                    strArr14[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[52]];
                    if (llIlllIllIlII(Inventory.contains(strArr14) ? 1 : 0)) {
                        if (!llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dn), lIIIIIlIIll[17]) || llIlllIllIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[53]];
                            Movement.walkTo(dn);
                            "".length();
                            Time.sleepTicks(lIIIIIlIIll[0]);
                            "".length();
                        }
                        if (!llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dn), lIIIIIlIIll[17]) || llIlllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                            if (llIlllIlllIll(Players.getLocal().getInteracting())) {
                                int[] iArr10 = new int[lIIIIIlIIll[0]];
                                iArr10[lIIIIIlIIll[1]] = lIIIIIlIIll[54];
                                NPCs.getNearest(iArr10).interact(lIIIIIlIIIl[lIIIIIlIIll[55]]);
                                Time.sleepTicks(lIIIIIlIIll[5]);
                                "".length();
                            }
                            String[] strArr15 = new String[lIIIIIlIIll[0]];
                            strArr15[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[56]];
                            TileItem nearest4 = TileItems.getNearest(strArr15);
                            if (llIlllIllIIlI(Inventory.isFull() ? 1 : 0)) {
                                int[] iArr11 = new int[lIIIIIlIIll[0]];
                                iArr11[lIIIIIlIIll[1]] = lIIIIIlIIll[12];
                                Inventory.getFirst(iArr11).interact(lIIIIIlIIIl[lIIIIIlIIll[57]]);
                                Time.sleepTicks(lIIIIIlIIll[0]);
                                "".length();
                            }
                            if (llIlllIllIllI(nearest4)) {
                                nearest4.interact(lIIIIIlIIIl[lIIIIIlIIll[58]]);
                                Time.sleepTicks(lIIIIIlIIll[5]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr16 = new String[lIIIIIlIIll[0]];
                strArr16[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[59]];
                if (llIlllIllIIlI(Inventory.contains(strArr16) ? 1 : 0)) {
                    if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(f1do), lIIIIIlIIll[13])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[60]];
                        Movement.walkTo(f1do);
                        "".length();
                        Time.sleepTicks(lIIIIIlIIll[0]);
                        "".length();
                    }
                    if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(f1do), lIIIIIlIIll[13])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[61]];
                        bd();
                    }
                }
                String[] strArr17 = new String[lIIIIIlIIll[0]];
                strArr17[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[15]];
                if (llIlllIllIIlI(Inventory.contains(strArr17) ? 1 : 0)) {
                    String[] strArr18 = new String[lIIIIIlIIll[0]];
                    strArr18[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[62]];
                    if (llIlllIllIlII(Inventory.contains(strArr18) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[63]];
                        String[] strArr19 = new String[lIIIIIlIIll[0]];
                        strArr19[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[64]];
                        Item first = Inventory.getFirst(strArr19);
                        int[] iArr12 = new int[lIIIIIlIIll[0]];
                        iArr12[lIIIIIlIIll[1]] = lIIIIIlIIll[65];
                        first.useOn(TileObjects.getNearest(iArr12));
                        Time.sleepTicks(lIIIIIlIIll[6]);
                        "".length();
                    }
                }
                String[] strArr20 = new String[lIIIIIlIIll[0]];
                strArr20[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[66]];
                if (llIlllIllIIlI(Inventory.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[lIIIIIlIIll[0]];
                    strArr21[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[67]];
                    if (llIlllIllIIlI(Inventory.contains(strArr21) ? 1 : 0)) {
                        if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIIIlIIll[10])) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[68]];
                            if (llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(dm);
                            "".length();
                            Time.sleepTicks(lIIIIIlIIll[0]);
                            "".length();
                        }
                        if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIIIlIIll[10])) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[69]];
                            String[] strArr22 = new String[lIIIIIlIIll[0]];
                            strArr22[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[70]];
                            Item first2 = Inventory.getFirst(strArr22);
                            String[] strArr23 = new String[lIIIIIlIIll[0]];
                            strArr23[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[71]];
                            first2.useOn(TileObjects.getNearest(strArr23));
                            Time.sleepTicks(lIIIIIlIIll[10]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlllIllIlIl(C0004e.j(cY), lIIIIIlIIll[16])) {
                String[] strArr24 = new String[lIIIIIlIIll[0]];
                strArr24[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[72]];
                NPC nearest5 = NPCs.getNearest(strArr24);
                String[] strArr25 = new String[lIIIIIlIIll[0]];
                strArr25[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[73]];
                if (llIlllIllIlII(Inventory.contains(strArr25) ? 1 : 0) && llIlllIllIllI(nearest5)) {
                    if (llIlllIllIIlI(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[74]];
                        C0006g.a(lIIIIIlIIIl[lIIIIIlIIll[75]], bQ);
                    }
                    if (llIlllIllIlII(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[76]];
                        String[] strArr26 = new String[lIIIIIlIIll[0]];
                        strArr26[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[77]];
                        TileObjects.getNearest(strArr26).interact(lIIIIIlIIIl[lIIIIIlIIll[78]]);
                        Time.sleepTicks(lIIIIIlIIll[5]);
                        "".length();
                    }
                }
                String[] strArr27 = new String[lIIIIIlIIll[0]];
                strArr27[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[79]];
                if (llIlllIllIIlI(Inventory.contains(strArr27) ? 1 : 0)) {
                    String[] strArr28 = new String[lIIIIIlIIll[0]];
                    strArr28[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[80]];
                    TileObject nearest6 = TileObjects.getNearest(strArr28);
                    if (llIlllIllIllI(nearest6)) {
                        if (llIlllIllIIlI(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[81]];
                            String[] strArr29 = new String[lIIIIIlIIll[0]];
                            strArr29[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[82]];
                            Inventory.getFirst(strArr29).useOn(nearest6);
                            Time.sleepTicks(lIIIIIlIIll[5]);
                            "".length();
                        }
                        if (llIlllIllIlII(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[83]];
                            String[] strArr30 = new String[lIIIIIlIIll[0]];
                            strArr30[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[84]];
                            TileObjects.getNearest(strArr30).interact(lIIIIIlIIIl[lIIIIIlIIll[85]]);
                            Time.sleepTicks(lIIIIIlIIll[5]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlllIllIlIl(C0004e.j(cY), lIIIIIlIIll[17])) {
                String[] strArr31 = new String[lIIIIIlIIll[0]];
                strArr31[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[86]];
                NPC nearest7 = NPCs.getNearest(strArr31);
                if (llIlllIllIllI(nearest7)) {
                    if (llIlllIllIIlI(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[87]];
                        C0006g.a(lIIIIIlIIIl[lIIIIIlIIll[88]], bQ);
                    }
                    if (llIlllIllIlII(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[89]];
                        String[] strArr32 = new String[lIIIIIlIIll[0]];
                        strArr32[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[90]];
                        TileObjects.getNearest(strArr32).interact(lIIIIIlIIIl[lIIIIIlIIll[91]]);
                        Time.sleepTicks(lIIIIIlIIll[5]);
                        "".length();
                    }
                }
            }
            if (llIlllIllIlIl(C0004e.j(cY), lIIIIIlIIll[18])) {
                if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[92]];
                    WorldArea worldArea = new WorldArea(lIIIIIlIIll[93], lIIIIIlIIll[94], lIIIIIlIIll[60], lIIIIIlIIll[43], lIIIIIlIIll[1]);
                    if (llIlllIllIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lIIIIIlIIll[95], lIIIIIlIIll[96], lIIIIIlIIll[48], lIIIIIlIIll[63], lIIIIIlIIll[1]);
                        if (llIlllIllIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                            "".length();
                            Time.sleepTicks(lIIIIIlIIll[0]);
                            "".length();
                        }
                        if (llIlllIllIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                Movement.walkTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                                "".length();
                                Time.sleepTicks(lIIIIIlIIll[0]);
                                "".length();
                            }
                            if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                String[] strArr33 = new String[lIIIIIlIIll[0]];
                                strArr33[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[98]];
                                TileObject nearest8 = TileObjects.getNearest(strArr33);
                                if (llIlllIllIllI(nearest8)) {
                                    String[] strArr34 = new String[lIIIIIlIIll[0]];
                                    strArr34[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[99]];
                                    if (llIlllIllIIlI(nearest8.hasAction(strArr34) ? 1 : 0)) {
                                        nearest8.interact(lIIIIIlIIIl[lIIIIIlIIll[100]]);
                                        Time.sleepTicks(lIIIIIlIIll[10]);
                                        "".length();
                                    }
                                    String[] strArr35 = new String[lIIIIIlIIll[0]];
                                    strArr35[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[101]];
                                    if (llIlllIllIIlI(nearest8.hasAction(strArr35) ? 1 : 0)) {
                                        nearest8.interact(lIIIIIlIIIl[lIIIIIlIIll[102]]);
                                        Time.sleepTicks(lIIIIIlIIll[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (llIlllIllIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(dp);
                        "".length();
                        Time.sleepTicks(lIIIIIlIIll[0]);
                        "".length();
                    }
                }
                if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[103]];
                    C0006g.a(lIIIIIlIIIl[lIIIIIlIIll[104]], bQ);
                }
            }
            if (llIlllIllllII(C0004e.j(cY), lIIIIIlIIll[13]) && llIlllIllIIll(C0004e.j(cY), lIIIIIlIIll[72])) {
                if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    String[] strArr36 = new String[lIIIIIlIIll[0]];
                    strArr36[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[105]];
                    if (llIlllIllIIlI(Inventory.contains(strArr36) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[106]];
                        if (llIlllIllIIll(ck, lIIIIIlIIll[0])) {
                            ac.kB += lIIIIIlIIll[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lIIIIIlIIll[0];
                            ac.kB = lIIIIIlIIll[1];
                            cl = lIIIIIlIIll[1];
                        }
                        C0006g.a(lIIIIIlIIIl[lIIIIIlIIll[107]], bQ);
                    }
                }
                String[] strArr37 = new String[lIIIIIlIIll[0]];
                strArr37[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[108]];
                if (llIlllIllIlII(Inventory.contains(strArr37) ? 1 : 0) && llIlllIllIIll(C0004e.j(cY), lIIIIIlIIll[72])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[109]];
                    aM();
                }
                String[] strArr38 = new String[lIIIIIlIIll[0]];
                strArr38[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[110]];
                if (llIlllIllIIlI(Inventory.contains(strArr38) ? 1 : 0) && llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3]) && llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[111]];
                    WorldArea worldArea3 = new WorldArea(lIIIIIlIIll[93], lIIIIIlIIll[94], lIIIIIlIIll[60], lIIIIIlIIll[43], lIIIIIlIIll[1]);
                    if (llIlllIllIlII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea4 = new WorldArea(lIIIIIlIIll[95], lIIIIIlIIll[96], lIIIIIlIIll[48], lIIIIIlIIll[63], lIIIIIlIIll[1]);
                        if (llIlllIllIlII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                            "".length();
                            Time.sleepTicks(lIIIIIlIIll[0]);
                            "".length();
                        }
                        if (llIlllIllIIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                Movement.walkTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                                "".length();
                                Time.sleepTicks(lIIIIIlIIll[0]);
                                "".length();
                            }
                            if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                String[] strArr39 = new String[lIIIIIlIIll[0]];
                                strArr39[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[112]];
                                TileObject nearest9 = TileObjects.getNearest(strArr39);
                                if (llIlllIllIllI(nearest9)) {
                                    String[] strArr40 = new String[lIIIIIlIIll[0]];
                                    strArr40[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[113]];
                                    if (llIlllIllIIlI(nearest9.hasAction(strArr40) ? 1 : 0)) {
                                        nearest9.interact(lIIIIIlIIIl[lIIIIIlIIll[114]]);
                                        Time.sleepTicks(lIIIIIlIIll[10]);
                                        "".length();
                                    }
                                    String[] strArr41 = new String[lIIIIIlIIll[0]];
                                    strArr41[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[115]];
                                    if (llIlllIllIIlI(nearest9.hasAction(strArr41) ? 1 : 0)) {
                                        nearest9.interact(lIIIIIlIIIl[lIIIIIlIIll[116]]);
                                        Time.sleepTicks(lIIIIIlIIll[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (llIlllIllIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(dp);
                        "".length();
                        Time.sleepTicks(lIIIIIlIIll[0]);
                        "".length();
                    }
                }
            }
            if (llIlllIllllII(C0004e.j(cY), lIIIIIlIIll[72]) && llIlllIllIIll(C0004e.j(cZ), lIIIIIlIIll[3])) {
                AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[117]];
                if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    be();
                }
                if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    if (llIlllIllIllI(Widgets.get(lIIIIIlIIll[118], lIIIIIlIIll[27]))) {
                        Mouse.click(Widgets.get(lIIIIIlIIll[118], lIIIIIlIIll[27]).getClickPoint().getX(), Widgets.get(lIIIIIlIIll[118], lIIIIIlIIll[27]).getClickPoint().getY(), (boolean) lIIIIIlIIll[0]);
                        Time.sleepTicks(lIIIIIlIIll[10]);
                        "".length();
                    }
                    C0006g.a(lIIIIIlIIIl[lIIIIIlIIll[119]], bQ);
                    C0006g.a(bQ);
                }
            }
            C0006g.a(bQ);
        }
    }

    private static String llIlllIlIIIII(String lllllllllllllllllIIlllIllIIIIlll, String lllllllllllllllllIIlllIllIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllllIIlllIllIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllIllIIIIllI.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIll[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIlIIll[5], lllllllllllllllllIIlllIllIIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIlllIllIIIlIII) {
            lllllllllllllllllIIlllIllIIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        llIlllIllIIII();
        llIlllIlIIIll();
        di = new WorldPoint(lIIIIIlIIll[149], lIIIIIlIIll[150], lIIIIIlIIll[1]);
        dj = new WorldPoint(lIIIIIlIIll[151], lIIIIIlIIll[152], lIIIIIlIIll[1]);
        dk = new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[153], lIIIIIlIIll[1]);
        dl = new WorldPoint(lIIIIIlIIll[154], lIIIIIlIIll[155], lIIIIIlIIll[1]);
        dm = new WorldPoint(lIIIIIlIIll[156], lIIIIIlIIll[152], lIIIIIlIIll[5]);
        dn = new WorldPoint(lIIIIIlIIll[157], lIIIIIlIIll[158], lIIIIIlIIll[1]);
        f1do = new WorldPoint(lIIIIIlIIll[159], lIIIIIlIIll[160], lIIIIIlIIll[1]);
        dp = new WorldPoint(lIIIIIlIIll[161], lIIIIIlIIll[162], lIIIIIlIIll[1]);
        bu = new ArrayList();
        cY = lIIIIIlIIll[163];
        cZ = lIIIIIlIIll[164];
        String[] strArr = new String[lIIIIIlIIll[31]];
        strArr[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[165]];
        strArr[lIIIIIlIIll[0]] = lIIIIIlIIIl[lIIIIIlIIll[166]];
        strArr[lIIIIIlIIll[5]] = lIIIIIlIIIl[lIIIIIlIIll[167]];
        strArr[lIIIIIlIIll[10]] = lIIIIIlIIIl[lIIIIIlIIll[168]];
        strArr[lIIIIIlIIll[6]] = lIIIIIlIIIl[lIIIIIlIIll[169]];
        strArr[lIIIIIlIIll[3]] = lIIIIIlIIIl[lIIIIIlIIll[170]];
        strArr[lIIIIIlIIll[16]] = lIIIIIlIIIl[lIIIIIlIIll[171]];
        strArr[lIIIIIlIIll[17]] = lIIIIIlIIIl[lIIIIIlIIll[172]];
        strArr[lIIIIIlIIll[18]] = lIIIIIlIIIl[lIIIIIlIIll[173]];
        strArr[lIIIIIlIIll[19]] = lIIIIIlIIIl[lIIIIIlIIll[174]];
        strArr[lIIIIIlIIll[13]] = lIIIIIlIIIl[lIIIIIlIIll[175]];
        strArr[lIIIIIlIIll[20]] = lIIIIIlIIIl[lIIIIIlIIll[176]];
        strArr[lIIIIIlIIll[21]] = lIIIIIlIIIl[lIIIIIlIIll[177]];
        strArr[lIIIIIlIIll[22]] = lIIIIIlIIIl[lIIIIIlIIll[178]];
        strArr[lIIIIIlIIll[23]] = lIIIIIlIIIl[lIIIIIlIIll[179]];
        strArr[lIIIIIlIIll[24]] = lIIIIIlIIIl[lIIIIIlIIll[180]];
        strArr[lIIIIIlIIll[27]] = lIIIIIlIIIl[lIIIIIlIIll[181]];
        strArr[lIIIIIlIIll[28]] = lIIIIIlIIIl[lIIIIIlIIll[182]];
        strArr[lIIIIIlIIll[29]] = lIIIIIlIIIl[lIIIIIlIIll[183]];
        strArr[lIIIIIlIIll[30]] = lIIIIIlIIIl[lIIIIIlIIll[184]];
        bQ = strArr;
        dr = new ArrayList<>();
    }

    private static void llIlllIllIIII() {
        lIIIIIlIIll = new int[186];
        lIIIIIlIIll[0] = " ".length();
        lIIIIIlIIll[1] = ((((5 + 186) - 82) + 92) ^ (((38 + 26) - (-15)) + 92)) & (((((4 + 27) - (-131)) + 81) ^ (((75 + 113) - 107) + 64)) ^ (-" ".length()));
        lIIIIIlIIll[2] = 29 ^ 118;
        lIIIIIlIIll[3] = (94 ^ 101) ^ (15 ^ 49);
        lIIIIIlIIll[4] = (-8210) & 13209;
        lIIIIIlIIll[5] = "  ".length();
        lIIIIIlIIll[6] = 90 ^ 94;
        lIIIIIlIIll[7] = (-8217) & 16223;
        lIIIIIlIIll[8] = (-8289) & 10213;
        lIIIIIlIIll[9] = (-24645) & 32580;
        lIIIIIlIIll[10] = "   ".length();
        lIIIIIlIIll[11] = (-((-20801) & 21989)) & (-18953) & 32765;
        lIIIIIlIIll[12] = (-((-19) & 32403)) & (-5) & 32767;
        lIIIIIlIIll[13] = 64 ^ 74;
        lIIIIIlIIll[14] = (-((-289) & 31661)) & (-65) & 32767;
        lIIIIIlIIll[15] = 173 ^ 159;
        lIIIIIlIIll[16] = (158 ^ 154) ^ "  ".length();
        lIIIIIlIIll[17] = (((5 + 89) - 1) + 78) ^ (((60 + 112) - 155) + 155);
        lIIIIIlIIll[18] = 176 ^ 184;
        lIIIIIlIIll[19] = 118 ^ 127;
        lIIIIIlIIll[20] = (67 ^ 102) ^ (111 ^ 65);
        lIIIIIlIIll[21] = (((59 + 32) - 16) + 93) ^ (((22 + 80) - 45) + 107);
        lIIIIIlIIll[22] = 21 ^ 24;
        lIIIIIlIIll[23] = (193 ^ 155) ^ (10 ^ 94);
        lIIIIIlIIll[24] = (179 ^ 162) ^ (185 ^ 167);
        lIIIIIlIIll[25] = (-12451) & 15855;
        lIIIIIlIIll[26] = (-((-1425) & 22485)) & (-9) & 24574;
        lIIIIIlIIll[27] = "   ".length() ^ (122 ^ 105);
        lIIIIIlIIll[28] = 31 ^ 14;
        lIIIIIlIIll[29] = 73 ^ 91;
        lIIIIIlIIll[30] = (121 ^ 92) ^ (110 ^ 88);
        lIIIIIlIIll[31] = (72 ^ 126) ^ (92 ^ 126);
        lIIIIIlIIll[32] = (111 ^ 114) ^ (73 ^ 65);
        lIIIIIlIIll[33] = (116 ^ 68) ^ (135 ^ 161);
        lIIIIIlIIll[34] = (((40 + 74) - 69) + 105) ^ (((84 + 40) - 114) + 119);
        lIIIIIlIIll[35] = 189 ^ 165;
        lIIIIIlIIll[36] = 217 ^ 192;
        lIIIIIlIIll[37] = (((104 + 55) - 21) + 16) ^ (((123 + 39) - 104) + 70);
        lIIIIIlIIll[38] = 38 ^ 61;
        lIIIIIlIIll[39] = 128 ^ 156;
        lIIIIIlIIll[40] = (159 ^ 172) ^ (32 ^ 14);
        lIIIIIlIIll[41] = 114 ^ 108;
        lIIIIIlIIll[42] = (((2 + 207) - 35) + 45) ^ (((90 + 18) - 70) + 158);
        lIIIIIlIIll[43] = (164 ^ 185) ^ (249 ^ 196);
        lIIIIIlIIll[44] = ((51 ^ 127) & ((76 ^ 0) ^ (-1))) ^ (103 ^ 70);
        lIIIIIlIIll[45] = 185 ^ 155;
        lIIIIIlIIll[46] = 135 ^ 164;
        lIIIIIlIIll[47] = (64 ^ 14) ^ (192 ^ 170);
        lIIIIIlIIll[48] = (219 ^ 146) ^ (227 ^ 143);
        lIIIIIlIIll[49] = (((106 + 54) - 2) + 73) ^ (((172 + 180) - 302) + 143);
        lIIIIIlIIll[50] = (66 ^ 93) ^ (27 ^ 35);
        lIIIIIlIIll[51] = (53 ^ 123) ^ (8 ^ 110);
        lIIIIIlIIll[52] = 55 ^ 30;
        lIIIIIlIIll[53] = (244 ^ 187) ^ (34 ^ 71);
        lIIIIIlIIll[54] = (-12834) & 16319;
        lIIIIIlIIll[55] = 110 ^ 69;
        lIIIIIlIIll[56] = (((151 + 114) - 204) + 124) ^ (((69 + 25) - 27) + 82);
        lIIIIIlIIll[57] = 19 ^ 62;
        lIIIIIlIIll[58] = (124 ^ 76) ^ (94 ^ 64);
        lIIIIIlIIll[59] = (98 ^ 40) ^ (82 ^ 55);
        lIIIIIlIIll[60] = 183 ^ 135;
        lIIIIIlIIll[61] = 5 ^ 52;
        lIIIIIlIIll[62] = (146 ^ 170) ^ (109 ^ 102);
        lIIIIIlIIll[63] = (141 ^ 199) ^ (185 ^ 199);
        lIIIIIlIIll[64] = (179 ^ 196) ^ (21 ^ 87);
        lIIIIIlIIll[65] = (-20995) & 24479;
        lIIIIIlIIll[66] = 110 ^ 88;
        lIIIIIlIIll[67] = (255 ^ 191) ^ (10 ^ 125);
        lIIIIIlIIll[68] = (75 ^ 17) ^ (29 ^ 127);
        lIIIIIlIIll[69] = 46 ^ 23;
        lIIIIIlIIll[70] = (((20 + 128) - 103) + 98) ^ (((170 + 176) - 322) + 157);
        lIIIIIlIIll[71] = (((0 + 157) - 12) + 35) ^ (((16 + 94) - (-23)) + 10);
        lIIIIIlIIll[72] = "  ".length() ^ (184 ^ 134);
        lIIIIIlIIll[73] = 146 ^ 175;
        lIIIIIlIIll[74] = (91 ^ 41) ^ (193 ^ 141);
        lIIIIIlIIll[75] = 115 ^ 76;
        lIIIIIlIIll[76] = 239 ^ 175;
        lIIIIIlIIll[77] = 223 ^ 158;
        lIIIIIlIIll[78] = (84 ^ 49) ^ (83 ^ 116);
        lIIIIIlIIll[79] = (((48 + 16) - (-106)) + 83) ^ (((33 + 167) - 151) + 141);
        lIIIIIlIIll[80] = (233 ^ 153) ^ (188 ^ 136);
        lIIIIIlIIll[81] = (234 ^ 197) ^ (34 ^ 72);
        lIIIIIlIIll[82] = (170 ^ 163) ^ (52 ^ 123);
        lIIIIIlIIll[83] = (80 ^ 58) ^ (87 ^ 122);
        lIIIIIlIIll[84] = (((113 + 199) - 217) + 147) ^ (((133 + 151) - 190) + 92);
        lIIIIIlIIll[85] = (242 ^ 170) ^ (32 ^ 49);
        lIIIIIlIIll[86] = 80 ^ 26;
        lIIIIIlIIll[87] = 118 ^ 61;
        lIIIIIlIIll[88] = 143 ^ 195;
        lIIIIIlIIll[89] = (((52 + 100) - 104) + 95) ^ (((37 + 107) - 117) + 167);
        lIIIIIlIIll[90] = 230 ^ 168;
        lIIIIIlIIll[91] = (((232 + 74) - 176) + 116) ^ (((76 + 19) - (-18)) + 72);
        lIIIIIlIIll[92] = 117 ^ 37;
        lIIIIIlIIll[93] = (-4153) & 7551;
        lIIIIIlIIll[94] = (-((-8403) & 14587)) & (-16705) & 32767;
        lIIIIIlIIll[95] = (-((-17706) & 26541)) & (-65) & 12287;
        lIIIIIlIIll[96] = (-16417) & 19878;
        lIIIIIlIIll[97] = (-((-24677) & 29292)) & (-24577) & 32695;
        lIIIIIlIIll[98] = 17 ^ 64;
        lIIIIIlIIll[99] = (((182 + 149) - 299) + 169) ^ (((82 + 7) - 75) + 141);
        lIIIIIlIIll[100] = (((215 + 72) - 235) + 167) ^ (((128 + 107) - 220) + 121);
        lIIIIIlIIll[101] = 30 ^ 74;
        lIIIIIlIIll[102] = 26 ^ 79;
        lIIIIIlIIll[103] = 114 ^ 36;
        lIIIIIlIIll[104] = (68 ^ 57) ^ (149 ^ 191);
        lIIIIIlIIll[105] = 84 ^ 12;
        lIIIIIlIIll[106] = (((98 + 165) - 202) + 155) ^ (((84 + 55) - 59) + 49);
        lIIIIIlIIll[107] = 77 ^ 23;
        lIIIIIlIIll[108] = (102 ^ 117) ^ (83 ^ 27);
        lIIIIIlIIll[109] = (((153 + 76) - 153) + 130) ^ (((69 + 110) - 65) + 32);
        lIIIIIlIIll[110] = (12 ^ 86) ^ (105 ^ 110);
        lIIIIIlIIll[111] = 61 ^ 99;
        lIIIIIlIIll[112] = 2 ^ 93;
        lIIIIIlIIll[113] = (100 ^ 16) ^ (183 ^ 163);
        lIIIIIlIIll[114] = (15 ^ 77) ^ (171 ^ 136);
        lIIIIIlIIll[115] = (114 ^ 120) ^ (194 ^ 170);
        lIIIIIlIIll[116] = 68 ^ 39;
        lIIIIIlIIll[117] = 56 ^ 92;
        lIIIIIlIIll[118] = (((42 ^ 111) + (33 ^ 87)) - (48 ^ 125)) + (30 ^ 53);
        lIIIIIlIIll[119] = 231 ^ 130;
        lIIIIIlIIll[120] = (-20503) & 23998;
        lIIIIIlIIll[121] = (-12309) & 15806;
        lIIIIIlIIll[122] = (-29273) & 32767;
        lIIIIIlIIll[123] = (-12373) & 15869;
        lIIIIIlIIll[124] = (-((-21862) & 30583)) & (-9) & 12223;
        lIIIIIlIIll[125] = (-513) & 4011;
        lIIIIIlIIll[126] = (-((-1293) & 13663)) & (-16905) & 32767;
        lIIIIIlIIll[127] = 221 ^ 187;
        lIIIIIlIIll[128] = 162 ^ 197;
        lIIIIIlIIll[129] = (((178 + 134) - 184) + 76) ^ (((130 + 41) - 142) + 135);
        lIIIIIlIIll[130] = (79 ^ 64) ^ (59 ^ 93);
        lIIIIIlIIll[131] = 254 ^ 148;
        lIIIIIlIIll[132] = (((48 + 147) - 168) + 226) ^ (((104 + 96) - 189) + 134);
        lIIIIIlIIll[133] = (((15 + 161) - (-44)) + 23) ^ (((67 + 116) - 140) + 115);
        lIIIIIlIIll[134] = 18 ^ 124;
        lIIIIIlIIll[135] = (102 ^ 79) ^ (119 ^ 49);
        lIIIIIlIIll[136] = 49 ^ 65;
        lIIIIIlIIll[137] = 97 ^ 16;
        lIIIIIlIIll[138] = (((31 + 175) - 15) + 15) ^ (((121 + 72) - 49) + 44);
        lIIIIIlIIll[139] = (((123 + 171) - 251) + 154) ^ (((6 + 108) - 55) + 123);
        lIIIIIlIIll[140] = 245 ^ 129;
        lIIIIIlIIll[141] = 107 ^ 30;
        lIIIIIlIIll[142] = (-20546) & 29545;
        lIIIIIlIIll[143] = (-6290) & 6589;
        lIIIIIlIIll[144] = (-((-231) & 4327)) & (-16418) & 32493;
        lIIIIIlIIll[145] = (-582) & 25581;
        lIIIIIlIIll[146] = (-((-16669) & 25951)) & (-16441) & 26622;
        lIIIIIlIIll[147] = (114 ^ 44) ^ (142 ^ 166);
        lIIIIIlIIll[148] = 197 ^ 178;
        lIIIIIlIIll[149] = (-(63 ^ 21)) & (-24833) & 28095;
        lIIIIIlIIll[150] = (-((-1421) & 30703)) & (-5) & 32759;
        lIIIIIlIIll[151] = (-21009) & 24415;
        lIIIIIlIIll[152] = (-25089) & 28577;
        lIIIIIlIIll[153] = (-((-3211) & 7371)) & (-16402) & 30463;
        lIIIIIlIIll[154] = (-147) & 8159;
        lIIIIIlIIll[155] = (-1249) & 7670;
        lIIIIIlIIll[156] = (-((-151) & 671)) & (-4097) & 8031;
        lIIIIIlIIll[157] = (-28715) & 32126;
        lIIIIIlIIll[158] = (-(132 ^ 193)) & (-8219) & 11774;
        lIIIIIlIIll[159] = (-12833) & 16254;
        lIIIIIlIIll[160] = (-((-9119) & 31647)) & (-97) & 32511;
        lIIIIIlIIll[161] = (-525) & 3964;
        lIIIIIlIIll[162] = (-((-5761) & 24457)) & (-81) & 28671;
        lIIIIIlIIll[163] = (-6337) & 6638;
        lIIIIIlIIll[164] = (-((-6939) & 31583)) & (-2049) & 26999;
        lIIIIIlIIll[165] = (157 ^ 192) ^ (185 ^ 156);
        lIIIIIlIIll[166] = (68 ^ 55) ^ (150 ^ 156);
        lIIIIIlIIll[167] = 44 ^ 86;
        lIIIIIlIIll[168] = (61 ^ 104) ^ (238 ^ 192);
        lIIIIIlIIll[169] = (((99 + 117) - 199) + 171) ^ (((178 + 82) - 171) + 103);
        lIIIIIlIIll[170] = (((52 + 81) - 126) + 241) ^ (((98 + 8) - 67) + 94);
        lIIIIIlIIll[171] = 58 ^ 68;
        lIIIIIlIIll[172] = ((30 + 73) - 63) + 87;
        lIIIIIlIIll[173] = (((70 ^ 9) + (213 ^ 187)) - (232 ^ 129)) + (43 ^ 7);
        lIIIIIlIIll[174] = (((27 ^ 92) + (6 ^ 32)) - (122 ^ 28)) + (0 ^ 122);
        lIIIIIlIIll[175] = ((60 + 95) - 127) + 102;
        lIIIIIlIIll[176] = ((100 + 19) - (-5)) + 7;
        lIIIIIlIIll[177] = (((243 ^ 144) + (39 ^ 117)) - (((125 + 53) - 114) + 95)) + (80 ^ 62);
        lIIIIIlIIll[178] = ((111 + 36) - 22) + 8;
        lIIIIIlIIll[179] = (((117 ^ 8) + (5 ^ 124)) - (((108 + 11) - 12) + 32)) + (57 ^ 34);
        lIIIIIlIIll[180] = ((20 + 73) - (-11)) + 31;
        lIIIIIlIIll[181] = (((131 ^ 160) + (41 ^ 9)) - (18 ^ 6)) + (125 ^ 36);
        lIIIIIlIIll[182] = ((5 + 115) - 8) + 25;
        lIIIIIlIIll[183] = (((((79 + 24) - 69) + 94) + (((121 + 2) - 57) + 70)) - (((118 + 5) - 111) + 193)) + (58 ^ 117);
        lIIIIIlIIll[184] = (((118 ^ 49) + (9 ^ 114)) - (92 ^ 0)) + (183 ^ 146);
        lIIIIIlIIll[185] = (((71 ^ 116) + (72 ^ 32)) - (((40 + 115) - 98) + 76)) + (176 ^ 198);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lIIIIIlIIll[1];
    }

    private static boolean llIlllIllIlII(int i) {
        return i == 0;
    }

    private static void be() {
        if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[131]];
            WorldArea worldArea = new WorldArea(lIIIIIlIIll[93], lIIIIIlIIll[94], lIIIIIlIIll[60], lIIIIIlIIll[43], lIIIIIlIIll[1]);
            if (llIlllIllIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(lIIIIIlIIll[95], lIIIIIlIIll[96], lIIIIIlIIll[48], lIIIIIlIIll[63], lIIIIIlIIll[1]);
                if (llIlllIllIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                    "".length();
                    Time.sleepTicks(lIIIIIlIIll[0]);
                    "".length();
                }
                if (llIlllIllIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                        Movement.walkTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                        "".length();
                        Time.sleepTicks(lIIIIIlIIll[0]);
                        "".length();
                    }
                    if (llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                        String[] strArr = new String[lIIIIIlIIll[0]];
                        strArr[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[2]];
                        TileObject nearest = TileObjects.getNearest(strArr);
                        if (llIlllIllIllI(nearest)) {
                            String[] strArr2 = new String[lIIIIIlIIll[0]];
                            strArr2[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[132]];
                            if (llIlllIllIIlI(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIIIIIlIIIl[lIIIIIlIIll[133]]);
                                Time.sleepTicks(lIIIIIlIIll[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lIIIIIlIIll[0]];
                            strArr3[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[134]];
                            if (llIlllIllIIlI(nearest.hasAction(strArr3) ? 1 : 0)) {
                                nearest.interact(lIIIIIlIIIl[lIIIIIlIIll[135]]);
                                Time.sleepTicks(lIIIIIlIIll[10]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (llIlllIllIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(dp);
                "".length();
                Time.sleepTicks(lIIIIIlIIll[0]);
                "".length();
            }
        }
    }

    private static boolean llIlllIlllIlI(int i, int i2) {
        return i <= i2;
    }

    private static int llIlllIllIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        String[] strArr = new String[lIIIIIlIIll[0]];
        strArr[lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[141]];
        if (llIlllIllIlll(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIIIIIlIIll[0]];
            iArr[lIIIIIlIIll[1]] = lIIIIIlIIll[12];
            if (llIlllIllIlll(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIIIIIlIIll[0]];
                iArr2[lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                if (llIlllIllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIIIlIIll[0]];
                    iArr3[lIIIIIlIIll[1]] = lIIIIIlIIll[9];
                    if (llIlllIllIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = lIIIIIlIIll[0];
                        "".length();
                        return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lIIIIIlIIll[1];
    }

    private static boolean llIlllIllIllI(Object obj) {
        return obj != null;
    }
}
