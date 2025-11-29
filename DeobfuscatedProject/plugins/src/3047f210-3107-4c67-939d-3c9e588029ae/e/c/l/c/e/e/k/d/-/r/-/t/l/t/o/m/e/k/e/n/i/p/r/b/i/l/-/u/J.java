/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
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

public class J
implements S {
    static /* synthetic */ WorldPoint hP;
    static /* synthetic */ WorldPoint gf;
    static /* synthetic */ boolean cl;
    static /* synthetic */ String[] bQ;
    public static /* synthetic */ List<d> bu;
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

    private static String llIlIIIIIIlIl(String lllllllllllllllllIlIlIIllIllIllI, String lllllllllllllllllIlIlIIllIllIIll) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIllIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIllIllIIll.getBytes(StandardCharsets.UTF_8)), llllIllIII[20]), "DES");
            Cipher lllllllllllllllllIlIlIIllIlllIII = Cipher.getInstance("DES");
            lllllllllllllllllIlIlIIllIlllIII.init(llllIllIII[4], lllllllllllllllllIlIlIIllIlllIIl);
            return new String(lllllllllllllllllIlIlIIllIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIlIIllIllIlll) {
            lllllllllllllllllIlIlIIllIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIIIllII(int n2) {
        return n2 != 0;
    }

    private static void llIlIIIIIlIIl() {
        llllIlIllI = new String[llllIllIII[129]];
        J.llllIlIllI[J.llllIllIII[1]] = J.llIlIIIIIIIll("Pgc/MTkQCzV4KA0XODYtWAclPScLQnErPREaMjAjFglxOisbBXEsJVgfJD05DA==", "xnQXJ");
        J.llllIlIllI[J.llllIllIII[0]] = J.llIlIIIIIIlII("TrXvrLjgxbA6B0Kk3tUgoQ==", "pAezh");
        J.llllIlIllI[J.llllIllIII[4]] = J.llIlIIIIIIlII("YVHjo+Z/2L/EtjnGYcjDskcpWuIP+s2D", "JFWHO");
        J.llllIlIllI[J.llllIllIII[7]] = J.llIlIIIIIIIll("GAtOAzUqTgMLNDwHAAVnPhsLETNvHRsSNyMHCxFrbx0ZCzMsBgcMIG8aAUIFGjcnLAA=", "OnnbG");
        J.llllIlIllI[J.llllIllIII[5]] = J.llIlIIIIIIlII("7rMRqyoi33Qy5/lL1jnew0/5hdb29bACYc5mnCBpVytIQpM0iLuNAw9Jsl35h4TO2oYugBu9pjc=", "GXjjg");
        J.llllIlIllI[J.llllIllIII[14]] = J.llIlIIIIIIlII("eIF6zqeMgfE=", "QsRNH");
        J.llllIlIllI[J.llllIllIII[16]] = J.llIlIIIIIIlII("pxnR+teSq2g=", "WLpdh");
        J.llllIlIllI[J.llllIllIII[18]] = J.llIlIIIIIIIll("NgMbSD0XQh4cKAoW", "xbmhI");
        J.llllIlIllI[J.llllIllIII[20]] = J.llIlIIIIIIIll("ASA0JBUnJDklBGIANDkFIyY=", "BHUJv");
        J.llllIlIllI[J.llllIllIII[22]] = J.llIlIIIIIIlIl("+ktKxMtao4/qur1d2jf19w==", "LLyYu");
        J.llllIlIllI[J.llllIllIII[24]] = J.llIlIIIIIIlIl("REhw2xkhuGg=", "DHWGG");
        J.llllIlIllI[J.llllIllIII[25]] = J.llIlIIIIIIlIl("oT6x1IgWV5I=", "vfSWk");
        J.llllIlIllI[J.llllIllIII[8]] = J.llIlIIIIIIIll("AjQqNw==", "UQKEq");
        J.llllIlIllI[J.llllIllIII[34]] = J.llIlIIIIIIlIl("tAFlS/EQLKOsN0bAXZgiKg==", "mEBNV");
        J.llllIlIllI[J.llllIllIII[35]] = J.llIlIIIIIIIll("Fwsc", "YnxSe");
        J.llllIlIllI[J.llllIllIII[36]] = J.llIlIIIIIIlII("dNh4WVMdK+Y=", "yhyPV");
        J.llllIlIllI[J.llllIllIII[37]] = J.llIlIIIIIIlII("0zsfGXUPXmY=", "CSKBg");
        J.llllIlIllI[J.llllIllIII[38]] = J.llIlIIIIIIlII("lw2vEzU1ghk=", "YGKlm");
        J.llllIlIllI[J.llllIllIII[39]] = J.llIlIIIIIIlIl("hUKbs1OhdSM=", "oouVj");
        J.llllIlIllI[J.llllIllIII[42]] = J.llIlIIIIIIlIl("ltYTLNG022A=", "iQVEp");
        J.llllIlIllI[J.llllIllIII[33]] = J.llIlIIIIIIlIl("CN3G2Moypx8=", "UgVvW");
        J.llllIlIllI[J.llllIllIII[43]] = J.llIlIIIIIIlIl("Q/GtE6RnSMg=", "YuThT");
        J.llllIlIllI[J.llllIllIII[44]] = J.llIlIIIIIIlIl("ZjIfimiN6eB4331S16lW/Q==", "eeDeo");
        J.llllIlIllI[J.llllIllIII[46]] = J.llIlIIIIIIlII("NnqUKvQWno2Eawar7qckpg==", "sZKZF");
        J.llllIlIllI[J.llllIllIII[52]] = J.llIlIIIIIIlII("1Y6LX4MO7+o4JMkERdOkBA==", "aLnqh");
        J.llllIlIllI[J.llllIllIII[45]] = J.llIlIIIIIIIll("GAAy", "OiUEN");
        J.llllIlIllI[J.llllIllIII[53]] = J.llIlIIIIIIlIl("2I48fbf0PRg=", "UASJT");
        J.llllIlIllI[J.llllIllIII[54]] = J.llIlIIIIIIlIl("/Jbfvk7cWlYzryhbz6b6LQ==", "BYMiP");
        J.llllIlIllI[J.llllIllIII[55]] = J.llIlIIIIIIlII("/F+j8wk/kFCPBevrQ+MnOg==", "SpAAV");
        J.llllIlIllI[J.llllIllIII[56]] = J.llIlIIIIIIlIl("Ztk1Ek2BKhM=", "qhWpj");
        J.llllIlIllI[J.llllIllIII[57]] = J.llIlIIIIIIlII("k93EXzUvb4zjXnfJALOn2A==", "refDo");
        J.llllIlIllI[J.llllIllIII[58]] = J.llIlIIIIIIIll("AiN1MgFFIDAjAgQ=", "eLUFn");
        J.llllIlIllI[J.llllIllIII[59]] = J.llIlIIIIIIIll("BSMI", "RJoxf");
        J.llllIlIllI[J.llllIllIII[60]] = J.llIlIIIIIIIll("KjIHJBY=", "zStPs");
        J.llllIlIllI[J.llllIllIII[61]] = J.llIlIIIIIIlIl("CKSSdjSUhMs=", "vgbAH");
        J.llllIlIllI[J.llllIllIII[62]] = J.llIlIIIIIIlII("G7IaKsYC/672JDX4sO8PQg==", "CzrzC");
        J.llllIlIllI[J.llllIllIII[63]] = J.llIlIIIIIIIll("EiVrIwpVJi4yCRQ=", "uJKWe");
        J.llllIlIllI[J.llllIllIII[64]] = J.llIlIIIIIIlII("fiGsunxt8Gw=", "ISDOz");
        J.llllIlIllI[J.llllIllIII[65]] = J.llIlIIIIIIlIl("i6JyP6Mu+y8=", "SWCIV");
        J.llllIlIllI[J.llllIllIII[66]] = J.llIlIIIIIIIll("ESYWKw==", "FCwYZ");
        J.llllIlIllI[J.llllIllIII[67]] = J.llIlIIIIIIlIl("BzmFTzTGsR25UIdTNjYX8g==", "ucSKG");
        J.llllIlIllI[J.llllIllIII[68]] = J.llIlIIIIIIlIl("60OOZ1b4r6b2vYexTtEK8Q==", "ojGKg");
        J.llllIlIllI[J.llllIllIII[69]] = J.llIlIIIIIIlII("ChqSeUpmGh8=", "kofLJ");
        J.llllIlIllI[J.llllIllIII[70]] = J.llIlIIIIIIIll("GgcVHDI9VREXMQ==", "XuzrH");
        J.llllIlIllI[J.llllIllIII[73]] = J.llIlIIIIIIlII("Wyg7LPQHpTWZAqpvZ3Jkjg==", "JMZfk");
        J.llllIlIllI[J.llllIllIII[74]] = J.llIlIIIIIIlIl("9dxOlWcUxSk1CKAI+dbwCg==", "hqFhc");
        J.llllIlIllI[J.llllIllIII[75]] = J.llIlIIIIIIIll("IwM/", "ilZfr");
        J.llllIlIllI[J.llllIllIII[76]] = J.llIlIIIIIIlIl("hkwzezNtGkM=", "VbfzO");
        J.llllIlIllI[J.llllIllIII[77]] = J.llIlIIIIIIIll("PQAfGAJJDAY=", "iyvve");
        J.llllIlIllI[J.llllIllIII[78]] = J.llIlIIIIIIIll("PyQgMA==", "mKPUg");
        J.llllIlIllI[J.llllIllIII[32]] = J.llIlIIIIIIIll("KxkUMUksHRwh", "gxpHi");
        J.llllIlIllI[J.llllIllIII[79]] = J.llIlIIIIIIlII("h38wvIVQi1/1oLBBs11N3g==", "cNMph");
        J.llllIlIllI[J.llllIllIII[80]] = J.llIlIIIIIIlIl("B8gKXy+bTkEeleJ9DmpZBQ==", "BjPFr");
        J.llllIlIllI[J.llllIllIII[81]] = J.llIlIIIIIIIll("HxY8GwohRBIJESo=", "OdUhe");
        J.llllIlIllI[J.llllIllIII[82]] = J.llIlIIIIIIlII("7cGbdMhZUsKy2snz0bWwMQ==", "CsCkp");
        J.llllIlIllI[J.llllIllIII[84]] = J.llIlIIIIIIlII("L2SP6F15f08=", "olZww");
        J.llllIlIllI[J.llllIllIII[87]] = J.llIlIIIIIIIll("OQANLWkRERwm", "vphCI");
        J.llllIlIllI[J.llllIllIII[88]] = J.llIlIIIIIIlIl("BsuFEGZ+KBY=", "HhbVm");
        J.llllIlIllI[J.llllIllIII[89]] = J.llIlIIIIIIlIl("qrES+AdyE34=", "zgyRn");
        J.llllIlIllI[J.llllIllIII[90]] = J.llIlIIIIIIlIl("6m1RjXno7qSK/buxOYAOYg==", "ZMHFf");
        J.llllIlIllI[J.llllIllIII[91]] = J.llIlIIIIIIIll("LiIQFw4IJh0WH00CEAoeDCQ=", "mJqym");
        J.llllIlIllI[J.llllIllIII[97]] = J.llIlIIIIIIlII("aPUdvnMz4ASspZX66hXsydJhJVBAmA6q", "yeyqC");
        J.llllIlIllI[J.llllIllIII[99]] = J.llIlIIIIIIlIl("tYqICcYECS0GYwJOBwNgNglLPi+4ore+", "rnLQV");
        J.llllIlIllI[J.llllIllIII[100]] = J.llIlIIIIIIlII("2ZeGMTGPlvA=", "ZXJjO");
        J.llllIlIllI[J.llllIllIII[101]] = J.llIlIIIIIIIll("HRQJMQk=", "zxfCp");
        J.llllIlIllI[J.llllIllIII[102]] = J.llIlIIIIIIIll("ITsbBQo=", "FWtws");
        J.llllIlIllI[J.llllIllIII[103]] = J.llIlIIIIIIlII("MbMnr5g0pb4=", "DXYkK");
        J.llllIlIllI[J.llllIllIII[116]] = J.llIlIIIIIIIll("NAQ+dA==", "maMZy");
        J.llllIlIllI[J.llllIllIII[117]] = J.llIlIIIIIIlIl("x+2Tm0FWxmO8gDWJqx91PSbjhRQ43hdfbi2IQ+yRPQcTRnEpg6+A+g==", "GrTtZ");
        J.llllIlIllI[J.llllIllIII[118]] = J.llIlIIIIIIIll("CikxCRBpPysQVCQnLwBUJjIsAAZpMiwMGi41ZAQEKDQwRRI7KSlFBiY2IVo=", "IFDet");
        J.llllIlIllI[J.llllIllIII[119]] = J.llIlIIIIIIIll("DA0RRxcmDRMTVjcNCwJWNw0UE1YrBEYQHyNd", "Dbfgv");
        J.llllIlIllI[J.llllIllIII[120]] = J.llIlIIIIIIlII("sHDowjMtRPqN7qesXRBkH95yPqxOPjXuoaldZ+/oBcn52QuAZyfkeQ==", "IkMYZ");
        J.llllIlIllI[J.llllIllIII[121]] = J.llIlIIIIIIlIl("QIg84N8m7LdJmuned5Twm9zOwRkwHYR1hvnmy9o0ycE=", "UBGgN");
        J.llllIlIllI[J.llllIllIII[122]] = J.llIlIIIIIIlII("RMYs1q+sbxQpVMphlpuAZdSP/TGa8SP/bY0xT0YQEr8OOgBiyH0ycg==", "eyHHv");
        J.llllIlIllI[J.llllIllIII[123]] = J.llIlIIIIIIlIl("UuAIDDHuD1FxuBieNBj9uG8WfSNQ4fLYDk5dgUB/8Kojl88Bg8tvPDrUiBOg9IkO", "DjdJg");
        J.llllIlIllI[J.llllIllIII[124]] = J.llIlIIIIIIlIl("tVKrL/1bTlD0+jRAp1H9p/ONc6upz76LHRWvS1RfV2c=", "YVSJT");
        J.llllIlIllI[J.llllIllIII[125]] = J.llIlIIIIIIlII("CSuMGW48lfRj6tiOlNTF1LdW2JFPDFER/OHLgBIu1ItBRkaTt6ErsTKl7cdlKDSl", "lrkAe");
        J.llllIlIllI[J.llllIllIII[126]] = J.llIlIIIIIIIll("AgQMITNhIlk+MiRLDSUyYQAcNHcxBxwsJCRU", "AkyMW");
        J.llllIlIllI[J.llllIllIII[127]] = J.llIlIIIIIIlII("0oGiJxDjWAq2y777ptL2QyJdQ5NO8QP2g/T9usqhpORmhBv8hrDklvglVRs8KRYP", "KdUof");
        J.llllIlIllI[J.llllIllIII[128]] = J.llIlIIIIIIlII("J59cS2dF8ZqvRDol7sl/HBSUIAMtfuJj/A6qi6mAv6Gx4X1SgP5A8w==", "BPFjo");
    }

    private static boolean llIlIIIIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String U() {
        return llllIlIllI[llllIllIII[97]];
    }

    private static boolean llIlIIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIIIIIlIlI() {
        llllIllIII = new int[130];
        J.llllIllIII[0] = " ".length();
        J.llllIllIII[1] = (0x20 ^ 0x63 ^ (0xEB ^ 0xAC)) & (0x74 ^ 0x7A ^ (0xAE ^ 0xA4) ^ -" ".length());
        J.llllIllIII[2] = 0xFFFFFD7F & 0x391;
        J.llllIllIII[3] = -(0xFFFFD8B7 & 0x6F7F) & (0xFFFFDFBF & 0x7BFE);
        J.llllIllIII[4] = "  ".length();
        J.llllIllIII[5] = 0x76 ^ 0x72;
        J.llllIllIII[6] = 0xFFFFCFFD & 0x377F;
        J.llllIllIII[7] = "   ".length();
        J.llllIllIII[8] = 0x81 ^ 0x8D;
        J.llllIllIII[9] = 0xFFFFDFFF & 0x3F47;
        J.llllIllIII[10] = -(0xFFFFF14B & 0x7EB5) & (0xFFFFFEE7 & 0x77F9);
        J.llllIllIII[11] = -(0xFFFFDD93 & 0x7B6D) & (0xFFFFFFDF & 0x5FFF);
        J.llllIllIII[12] = -(0xFFFFF993 & 0x176D) & (0xFFFFF7F7 & 0x1FED);
        J.llllIllIII[13] = -(0xFFFFFE75 & 0x59EB) & (0xFFFFDFFF & Short.MAX_VALUE);
        J.llllIllIII[14] = 0xFB ^ 0xB6 ^ (0xFB ^ 0xB3);
        J.llllIllIII[15] = -(0xFFFF8D69 & 0x7FBF) & (0xFFFF9F7B & 0x6FFC);
        J.llllIllIII[16] = 0x71 ^ 0x77;
        J.llllIllIII[17] = 0xFFFF9FA9 & 0x67DF;
        J.llllIllIII[18] = 0x77 ^ 0x70;
        J.llllIllIII[19] = -(0xFFFFCAF3 & 0x7D4D) & (0xFFFFCFDD & 0x7FEF);
        J.llllIllIII[20] = 0x35 ^ 0x3D;
        J.llllIllIII[21] = 0xFFFFCBFF & 0x3D2D;
        J.llllIllIII[22] = 0x35 ^ 0x55 ^ (0xFD ^ 0x94);
        J.llllIllIII[23] = -(0xFFFFF029 & 0x7FD7) & (0xFFFFF7FF & 0x7BF5);
        J.llllIllIII[24] = 0x40 ^ 0x2A ^ (0x41 ^ 0x21);
        J.llllIllIII[25] = 0x41 ^ 0x4A;
        J.llllIllIII[26] = -(0xFFFFCE75 & 0x75CF) & (0xFFFFF7FF & 0x4FFE);
        J.llllIllIII[27] = -(0xFFFFEAFF & 0x3D01) & (0xFFFFFB7F & 0x2DFB);
        J.llllIllIII[28] = 0xFFFFBEEB & 0x6FDE;
        J.llllIllIII[29] = -(0xFFFFCBAF & 0x3EFD) & (0xFFFFFBFD & 0x3FFF);
        J.llllIllIII[30] = -(0xFFFFFD3F & 0x3ED5) & (0xFFFFBFF7 & Short.MAX_VALUE);
        J.llllIllIII[31] = 0xFFFFD3FB & 0x2FEC;
        J.llllIllIII[32] = 0x16 ^ 0x50 ^ (0x5A ^ 0x2E);
        J.llllIllIII[33] = 0xBD ^ 0xA9;
        J.llllIllIII[34] = 9 ^ 0x5B ^ (0x25 ^ 0x7A);
        J.llllIllIII[35] = 0x8C ^ 0x82;
        J.llllIllIII[36] = 0xBD ^ 0xB2;
        J.llllIllIII[37] = 0x50 ^ 0x40;
        J.llllIllIII[38] = 0xB8 ^ 0xA9;
        J.llllIllIII[39] = 0x2C ^ 0x34 ^ (0xB9 ^ 0xB3);
        J.llllIllIII[40] = 0xFFFFDD4B & 0x2EBF;
        J.llllIllIII[41] = 0xFFFF8EB9 & 0x7DFE;
        J.llllIllIII[42] = 0xB6 ^ 0xA5;
        J.llllIllIII[43] = 0x18 ^ 0xD;
        J.llllIllIII[44] = 0x69 ^ 0x7F;
        J.llllIllIII[45] = 0 + 134 - -20 + 5 ^ 128 + 24 - 58 + 40;
        J.llllIllIII[46] = "  ".length() ^ (9 ^ 0x1C);
        J.llllIllIII[47] = 0xFFFFEDF8 & 0x1E3F;
        J.llllIllIII[48] = -(0xFFFFF1C7 & 0x7F3A) & (0xFFFFFFFF & 0x7DAF);
        J.llllIllIII[49] = 0xFFFFCEFF & 0x3DAF;
        J.llllIllIII[50] = 0xFFFFED7D & 0x1EBB;
        J.llllIllIII[51] = -(0xFFFFFCD3 & 0x633D) & (0xFFFFEEFF & 0x7DBD);
        J.llllIllIII[52] = 0xB4 ^ 0xAC;
        J.llllIllIII[53] = 0x53 ^ 0x46 ^ (0xB0 ^ 0xBF);
        J.llllIllIII[54] = 0x64 ^ 0x46 ^ (0x4B ^ 0x72);
        J.llllIllIII[55] = 0x81 ^ 0x9D;
        J.llllIllIII[56] = 0x3B ^ 0x54 ^ (0x76 ^ 4);
        J.llllIllIII[57] = 0x26 ^ 0x62 ^ (0x68 ^ 0x32);
        J.llllIllIII[58] = 0x51 ^ 0x4E;
        J.llllIllIII[59] = 0x81 ^ 0xAA ^ (0x76 ^ 0x7D);
        J.llllIllIII[60] = 0x19 ^ 0x4F ^ (0x36 ^ 0x41);
        J.llllIllIII[61] = 0xA3 ^ 0x81;
        J.llllIllIII[62] = 50 + 94 - 7 + 27 ^ 10 + 121 - 59 + 63;
        J.llllIllIII[63] = 0x81 ^ 0xA5;
        J.llllIllIII[64] = 0x1B ^ 0x3E;
        J.llllIllIII[65] = 0xE9 ^ 0x9A ^ (0xCE ^ 0x9B);
        J.llllIllIII[66] = 0x80 ^ 0xA7;
        J.llllIllIII[67] = 0xB7 ^ 0x9F;
        J.llllIllIII[68] = 0xE2 ^ 0xBF ^ (0x7C ^ 8);
        J.llllIllIII[69] = 0x4A ^ 0x60;
        J.llllIllIII[70] = 0x4B ^ 0x74 ^ (0xA6 ^ 0xB2);
        J.llllIllIII[71] = -(0xFFFFFDEF & 0x5393) & (0xFFFFDDBB & 0x7FF7);
        J.llllIllIII[72] = -(0xFFFFFF5D & 0x73A6) & (0xFFFFFFAF & 0x7FFB);
        J.llllIllIII[73] = 112 + 1 - 30 + 89 ^ 4 + 4 - -8 + 112;
        J.llllIllIII[74] = 0x75 ^ 0x58;
        J.llllIllIII[75] = 161 + 29 - 82 + 58 ^ 48 + 112 - 135 + 111;
        J.llllIllIII[76] = 0x7E ^ 0x42 ^ (0x91 ^ 0x82);
        J.llllIllIII[77] = 0x6D ^ 0x5D;
        J.llllIllIII[78] = 9 ^ 0x27 ^ (0x73 ^ 0x6C);
        J.llllIllIII[79] = 0x64 ^ 0x57;
        J.llllIllIII[80] = 0xF6 ^ 0xC2;
        J.llllIllIII[81] = 0xFB ^ 0xA1 ^ (0x27 ^ 0x48);
        J.llllIllIII[82] = 0xA1 ^ 0x97;
        J.llllIllIII[83] = 0x8C ^ 0xC0 ^ (0x96 ^ 0xBE);
        J.llllIllIII[84] = 21 + 79 - 96 + 172 ^ 43 + 78 - 52 + 66;
        J.llllIllIII[85] = 0xFFFFDFB4 & 0x2CDF;
        J.llllIllIII[86] = -(0xFFFFF92D & 0x16D7) & (0xFFFF9CDF & 0x7FE7);
        J.llllIllIII[87] = 0x45 ^ 0x7D;
        J.llllIllIII[88] = 0xAC ^ 0xC2 ^ (0x6D ^ 0x3A);
        J.llllIllIII[89] = 44 + 143 - 137 + 96 ^ 161 + 3 - 27 + 31;
        J.llllIllIII[90] = 0xBA ^ 0x81;
        J.llllIllIII[91] = 0x2C ^ 0x10;
        J.llllIllIII[92] = 0xFFFFDDFF & 0x6E2C;
        J.llllIllIII[93] = -(0xFFFFF377 & 0x2C8B) & (0xFFFFFFFF & 0x357E);
        J.llllIllIII[94] = 0xFFFFBFED & 0x6EDE;
        J.llllIllIII[95] = 0xFFFFFBED & 0x65BA;
        J.llllIllIII[96] = -(0xFFFFE959 & 0x56B7) & (0xFFFFE77D & 0x5FFE);
        J.llllIllIII[97] = 0x84 ^ 0xB9;
        J.llllIllIII[98] = 0x77 ^ 0x17 ^ (0x64 ^ 0x6A);
        J.llllIllIII[99] = 0xBB ^ 0x85;
        J.llllIllIII[100] = 0x4D ^ 0x72;
        J.llllIllIII[101] = 0x1C ^ 0x5C;
        J.llllIllIII[102] = 0x53 ^ 0x12;
        J.llllIllIII[103] = 0xE5 ^ 0xA7;
        J.llllIllIII[104] = -(0xFFFF879B & 0x7B75) & (0xFFFF8FFB & 0x7FF7);
        J.llllIllIII[105] = 0xFFFFFC5F & 0xFF9;
        J.llllIllIII[106] = 0xFFFFDDDF & 0x2EFA;
        J.llllIllIII[107] = -(0xFFFFB3C3 & 0x6EBE) & (0xFFFFBFEF & 0x6EFF);
        J.llllIllIII[108] = 0xFFFF8C9B & 0x7F7E;
        J.llllIllIII[109] = -(0xFFFFE3EF & 0x5E52) & (0xFFFFEFFB & 0x5EFF);
        J.llllIllIII[110] = -(0xFFFFE7E5 & 0x3B5B) & (0xFFFFBF6D & 0x6FDF);
        J.llllIllIII[111] = 0xFFFFADFB & 0x5EBF;
        J.llllIllIII[112] = 0xFFFFCF77 & 0x3CBE;
        J.llllIllIII[113] = 0xFFFF9CBB & 0x6FEF;
        J.llllIllIII[114] = -(0xFFFFADDD & 0x53E3) & (0xFFFF9FEE & 0x6DF9);
        J.llllIllIII[115] = -(0xFFFFF3DE & 0x5F23) & (0xFFFFFFBF & 0x5FFF);
        J.llllIllIII[116] = " ".length() ^ (0xC0 ^ 0x82);
        J.llllIllIII[117] = 0x4A ^ 0x2E ^ (0x18 ^ 0x38);
        J.llllIllIII[118] = 0x5F ^ 0x1A;
        J.llllIllIII[119] = 0xC4 ^ 0x82;
        J.llllIllIII[120] = 0xDD ^ 0x9A;
        J.llllIllIII[121] = 0xF1 ^ 0xB9;
        J.llllIllIII[122] = 0x69 ^ 0x20;
        J.llllIllIII[123] = 0x34 ^ 0x7E;
        J.llllIllIII[124] = 0xA1 ^ 0x84 ^ (0xE ^ 0x60);
        J.llllIllIII[125] = 0x96 ^ 0xB7 ^ (0x7D ^ 0x10);
        J.llllIllIII[126] = 0x3F ^ 0x5D ^ (0xB ^ 0x24);
        J.llllIllIII[127] = 99 + 96 - 108 + 156 ^ 143 + 13 - 66 + 99;
        J.llllIllIII[128] = 139 + 86 - 89 + 91 ^ 73 + 76 - 102 + 125;
        J.llllIllIII[129] = 119 + 198 - 309 + 227 ^ 73 + 61 - 42 + 95;
    }

    private static boolean llIlIIIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void ae() {
        block22: {
            d lllllllllllllllllIlIlIIlllIIllIl;
            block21: {
                Object lllllllllllllllllIlIlIIlllIIlllI;
                block20: {
                    block19: {
                        int[] nArray = new int[llllIllIII[0]];
                        nArray[J.llllIllIII[1]] = llllIllIII[28];
                        if (J.llIlIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llllIllIII[28], llllIllIII[0], llllIllIII[92]);
                            bu.add(d2);
                            "".length();
                        }
                        int[] nArray2 = new int[llllIllIII[0]];
                        nArray2[J.llllIllIII[1]] = llllIllIII[26];
                        if (J.llIlIIIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[26], llllIllIII[0], llllIllIII[93]);
                            bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                            "".length();
                        }
                        int[] nArray3 = new int[llllIllIII[0]];
                        nArray3[J.llllIllIII[1]] = llllIllIII[23];
                        if (J.llIlIIIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[23], llllIllIII[0], llllIllIII[93]);
                            bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                            "".length();
                        }
                        int[] nArray4 = new int[llllIllIII[0]];
                        nArray4[J.llllIllIII[1]] = llllIllIII[21];
                        if (J.llIlIIIIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[21], llllIllIII[0], llllIllIII[93]);
                            bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                            "".length();
                        }
                        int[] nArray5 = new int[llllIllIII[0]];
                        nArray5[J.llllIllIII[1]] = llllIllIII[6];
                        if (!J.llIlIIIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[llllIllIII[0]];
                        nArray6[J.llllIllIII[1]] = llllIllIII[6];
                        if (!J.llIlIIIIIllII(Bank.contains((int[])nArray6) ? 1 : 0)) break block20;
                        int[] nArray7 = new int[llllIllIII[0]];
                        nArray7[J.llllIllIII[1]] = llllIllIII[6];
                        if (!J.llIlIIIIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), llllIllIII[7])) break block20;
                    }
                    lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[6], llllIllIII[7], llllIllIII[93]);
                    bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                    "".length();
                }
                int[] nArray = new int[llllIllIII[0]];
                nArray[J.llllIllIII[1]] = llllIllIII[15];
                if (J.llIlIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[15], llllIllIII[0], llllIllIII[93]);
                    bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                    "".length();
                }
                int[] nArray8 = new int[llllIllIII[0]];
                nArray8[J.llllIllIII[1]] = llllIllIII[17];
                if (J.llIlIIIIIlllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[17], llllIllIII[0], llllIllIII[93]);
                    bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                    "".length();
                }
                int[] nArray9 = new int[llllIllIII[0]];
                nArray9[J.llllIllIII[1]] = llllIllIII[19];
                if (J.llIlIIIIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[19], llllIllIII[0], llllIllIII[93]);
                    bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                    "".length();
                }
                int[] nArray10 = new int[llllIllIII[0]];
                nArray10[J.llllIllIII[1]] = llllIllIII[13];
                if (J.llIlIIIIIlllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[13], llllIllIII[0], llllIllIII[93]);
                    bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                    "".length();
                }
                int[] nArray11 = new int[llllIllIII[0]];
                nArray11[J.llllIllIII[1]] = llllIllIII[12];
                if (J.llIlIIIIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[12], llllIllIII[0], llllIllIII[93]);
                    bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                    "".length();
                }
                int[] nArray12 = new int[llllIllIII[0]];
                nArray12[J.llllIllIII[1]] = llllIllIII[11];
                if (J.llIlIIIIIlllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[11], llllIllIII[7], llllIllIII[93]);
                    bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                    "".length();
                }
                int[] nArray13 = new int[llllIllIII[0]];
                nArray13[J.llllIllIII[1]] = llllIllIII[10];
                if (J.llIlIIIIIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIIlllI = new d(llllIllIII[10], llllIllIII[0], llllIllIII[93]);
                    bu.add((d)lllllllllllllllllIlIlIIlllIIlllI);
                    "".length();
                }
                if (J.llIlIIIIIlllI(Bank.contains((Predicate)(lllllllllllllllllIlIlIIlllIIlllI = item -> item.getName().toLowerCase().contains(llllIlIllI[llllIllIII[99]]))) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIIllIl = new d(llllIllIII[94], llllIllIII[14], llllIllIII[95]);
                    bu.add(lllllllllllllllllIlIlIIlllIIllIl);
                    "".length();
                }
                int[] nArray14 = new int[llllIllIII[0]];
                nArray14[J.llllIllIII[1]] = llllIllIII[29];
                if (J.llIlIIIIIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIIllIl = new d(llllIllIII[29], llllIllIII[5], i.bp);
                    bu.add(lllllllllllllllllIlIlIIlllIIllIl);
                    "".length();
                }
                int[] nArray15 = new int[llllIllIII[0]];
                nArray15[J.llllIllIII[1]] = llllIllIII[9];
                if (!J.llIlIIIIIllII(Bank.contains((int[])nArray15) ? 1 : 0)) break block21;
                int[] nArray16 = new int[llllIllIII[0]];
                nArray16[J.llllIllIII[1]] = llllIllIII[9];
                if (!J.llIlIIIIIllII(Bank.contains((int[])nArray16) ? 1 : 0)) break block22;
                int[] nArray17 = new int[llllIllIII[0]];
                nArray17[J.llllIllIII[1]] = llllIllIII[9];
                if (!J.llIlIIIIIllIl(Bank.getFirst((int[])nArray17).getQuantity(), llllIllIII[36])) break block22;
            }
            lllllllllllllllllIlIlIIlllIIllIl = new d(llllIllIII[9], llllIllIII[67], llllIllIII[96]);
            bu.add(lllllllllllllllllIlIlIIlllIIllIl);
            "".length();
        }
    }

    private static boolean llIlIIIIIlllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void lllllllllllllllllIlIlIIlllIlIIlI;
        int[] nArray = new int[llllIllIII[8]];
        nArray[J.llllIllIII[1]] = llllIllIII[9];
        nArray[J.llllIllIII[0]] = llllIllIII[10];
        nArray[J.llllIllIII[4]] = llllIllIII[11];
        nArray[J.llllIllIII[7]] = llllIllIII[12];
        nArray[J.llllIllIII[5]] = llllIllIII[13];
        nArray[J.llllIllIII[14]] = llllIllIII[15];
        nArray[J.llllIllIII[16]] = llllIllIII[17];
        nArray[J.llllIllIII[18]] = llllIllIII[19];
        nArray[J.llllIllIII[20]] = llllIllIII[21];
        nArray[J.llllIllIII[22]] = llllIllIII[23];
        nArray[J.llllIllIII[24]] = llllIllIII[6];
        nArray[J.llllIllIII[25]] = llllIllIII[26];
        int[] nArray2 = nArray;
        int lllllllllllllllllIlIlIIlllIlIIIl = llllIllIII[1];
        while (J.llIlIIIIIllIl(lllllllllllllllllIlIlIIlllIlIIIl, ((void)lllllllllllllllllIlIlIIlllIlIIlI).length)) {
            int[] nArray3 = new int[llllIllIII[0]];
            nArray3[J.llllIllIII[1]] = lllllllllllllllllIlIlIIlllIlIIlI[lllllllllllllllllIlIlIIlllIlIIIl];
            if (J.llIlIIIIIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llllIllIII[1];
            }
            ++lllllllllllllllllIlIlIIlllIlIIIl;
            "".length();
            if (" ".length() > 0) continue;
            return ((0xF3 ^ 0xA8 ^ (0x52 ^ 0x39)) & (0x15 ^ 0x45 ^ (0x50 ^ 0x30) ^ -" ".length())) != 0;
        }
        return llllIllIII[0];
    }

    private static int llIlIIIIIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (J.llIlIIIIlIlII(e.j(llllIllIII[2]), llllIllIII[98])) {
            bl = llllIllIII[0];
            "".length();
            if ((0x9D ^ 0x99) <= "   ".length()) {
                return ((0xCC ^ 0x90) & ~(0xC6 ^ 0x9A)) != 0;
            }
        } else {
            bl = llllIllIII[1];
        }
        return bl;
    }

    public static void cW() {
        if (J.llIlIIIIIllII(bs ? 1 : 0)) {
            b.a(bu);
            if (J.llIlIIIIIllIl(bu.size(), llllIllIII[0])) {
                System.out.println(llllIlIllI[llllIllIII[1]]);
                bs = llllIllIII[1];
            }
        }
        if (J.llIlIIIIIlllI(bs ? 1 : 0)) {
            Object lllllllllllllllllIlIlIIlllIlIllI;
            if (J.llIlIIIIIlllI(J.aa() ? 1 : 0) && J.llIlIIIIIllIl(e.j(llllIllIII[2]), llllIllIII[0])) {
                lllllllllllllllllIlIlIIlllIlIllI = BankLocation.getNearest();
                if (J.llIlIIIIIllll(lllllllllllllllllIlIlIIlllIlIllI) && J.llIlIIIIIlllI(lllllllllllllllllIlIlIIlllIlIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[0]];
                    a.a((BankLocation)lllllllllllllllllIlIlIIlllIlIllI);
                }
                if (J.llIlIIIIIllll(lllllllllllllllllIlIlIIlllIlIllI) && J.llIlIIIIIllII(lllllllllllllllllIlIlIIlllIlIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (J.llIlIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIllIII[3]);
                        "".length();
                    }
                    if (J.llIlIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[4]];
                        if (J.llIlIIIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIllIII[5]);
                            "".length();
                        }
                        if (J.llIlIIIIlIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIllIII[4]);
                            "".length();
                        }
                        int[] nArray = new int[llllIllIII[0]];
                        nArray[J.llllIllIII[1]] = llllIllIII[6];
                        if (J.llIlIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[llllIllIII[0]];
                            nArray2[J.llllIllIII[1]] = llllIllIII[6];
                            if (J.llIlIIIIIllIl(Bank.getFirst((int[])nArray2).getQuantity(), llllIllIII[7])) {
                                J.ae();
                                System.out.println(llllIlIllI[llllIllIII[7]]);
                                bs = llllIllIII[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[llllIllIII[8]];
                        nArray3[J.llllIllIII[1]] = llllIllIII[9];
                        nArray3[J.llllIllIII[0]] = llllIllIII[10];
                        nArray3[J.llllIllIII[4]] = llllIllIII[11];
                        nArray3[J.llllIllIII[7]] = llllIllIII[12];
                        nArray3[J.llllIllIII[5]] = llllIllIII[13];
                        nArray3[J.llllIllIII[14]] = llllIllIII[15];
                        nArray3[J.llllIllIII[16]] = llllIllIII[17];
                        nArray3[J.llllIllIII[18]] = llllIllIII[19];
                        nArray3[J.llllIllIII[20]] = llllIllIII[21];
                        nArray3[J.llllIllIII[22]] = llllIllIII[23];
                        nArray3[J.llllIllIII[24]] = llllIllIII[6];
                        nArray3[J.llllIllIII[25]] = llllIllIII[26];
                        if (J.llIlIIIIIlllI(e.b(nArray3) ? 1 : 0)) {
                            J.ae();
                            System.out.println(llllIlIllI[llllIllIII[5]]);
                            bs = llllIllIII[0];
                            return;
                        }
                        int[] nArray4 = new int[llllIllIII[8]];
                        nArray4[J.llllIllIII[1]] = llllIllIII[9];
                        nArray4[J.llllIllIII[0]] = llllIllIII[10];
                        nArray4[J.llllIllIII[4]] = llllIllIII[11];
                        nArray4[J.llllIllIII[7]] = llllIllIII[12];
                        nArray4[J.llllIllIII[5]] = llllIllIII[13];
                        nArray4[J.llllIllIII[14]] = llllIllIII[15];
                        nArray4[J.llllIllIII[16]] = llllIllIII[17];
                        nArray4[J.llllIllIII[18]] = llllIllIII[19];
                        nArray4[J.llllIllIII[20]] = llllIllIII[21];
                        nArray4[J.llllIllIII[22]] = llllIllIII[23];
                        nArray4[J.llllIllIII[24]] = llllIllIII[6];
                        nArray4[J.llllIllIII[25]] = llllIllIII[26];
                        if (J.llIlIIIIIllII(e.b(nArray4) ? 1 : 0)) {
                            a.a(llllIllIII[10], llllIllIII[0]);
                            a.a(llllIllIII[12], llllIllIII[0]);
                            a.a(llllIllIII[13], llllIllIII[0]);
                            a.a(llllIllIII[15], llllIllIII[0]);
                            a.a(llllIllIII[17], llllIllIII[0]);
                            a.a(llllIllIII[21], llllIllIII[0]);
                            a.a(llllIllIII[19], llllIllIII[0]);
                            a.a(llllIllIII[23], llllIllIII[0]);
                            a.a(llllIllIII[26], llllIllIII[0]);
                            a.a(llllIllIII[27], llllIllIII[14]);
                            a.a(llllIllIII[9], llllIllIII[24]);
                            a.a(llllIllIII[28], llllIllIII[0]);
                            a.a(llllIllIII[6], llllIllIII[7]);
                            a.a(llllIllIII[11], llllIllIII[7]);
                            a.a(llllIllIII[29], llllIllIII[4]);
                            a.a(llllIllIII[30], llllIllIII[31]);
                        }
                    }
                }
            }
            if (J.llIlIIIIIllII(Inventory.contains((int[])f.aU) ? 1 : 0) && J.llIlIIIIIllIl(Movement.getRunEnergy(), llllIllIII[32])) {
                Inventory.getFirst((int[])f.aU).interact(llllIlIllI[llllIllIII[14]]);
                Time.sleepTicks((int)llllIllIII[0]);
                "".length();
            }
            int[] nArray = new int[llllIllIII[0]];
            nArray[J.llllIllIII[1]] = llllIllIII[27];
            if (J.llIlIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0) && J.llIlIIIIlIIIl(J.llIlIIIIIlIll(e.u(), 50.0))) {
                int[] nArray5 = new int[llllIllIII[0]];
                nArray5[J.llllIllIII[1]] = llllIllIII[27];
                Inventory.getFirst((int[])nArray5).interact(llllIlIllI[llllIllIII[16]]);
                Time.sleepTicks((int)llllIllIII[0]);
                "".length();
            }
            if (J.llIlIIIIIllII(J.aa() ? 1 : 0) && J.llIlIIIIIlllI(e.j(llllIllIII[2]))) {
                if (J.llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(gf), llllIllIII[18])) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[18]];
                    Movement.walkTo((WorldPoint)gf);
                    "".length();
                    Time.sleepTicks((int)llllIllIII[0]);
                    "".length();
                }
                if (J.llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(gf), llllIllIII[18])) {
                    g.a(llllIlIllI[llllIllIII[20]], bQ);
                }
            }
            if (J.llIlIIIIlIlII(e.j(llllIllIII[2]), llllIllIII[24])) {
                if (J.llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[14])) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[22]];
                    Movement.walkTo((WorldPoint)hN);
                    "".length();
                    Time.sleepTicks((int)llllIllIII[0]);
                    "".length();
                }
                if (J.llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[14])) {
                    g.a(llllIlIllI[llllIllIII[24]], bQ);
                }
            }
            if (J.llIlIIIIlIlII(e.j(llllIllIII[2]), llllIllIII[33])) {
                WorldArea lllllllllllllllllIlIlIIlllIlIlIl2;
                ck = llllIllIII[1];
                String[] stringArray = new String[llllIllIII[0]];
                stringArray[J.llllIllIII[1]] = llllIlIllI[llllIllIII[25]];
                if (J.llIlIIIIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (J.llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hO), llllIllIII[4])) {
                        if (J.llIlIIIIIllII(Inventory.contains(item -> item.getName().contains(llllIlIllI[llllIllIII[103]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(llllIlIllI[llllIllIII[102]])).interact(llllIlIllI[llllIllIII[8]]);
                        }
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[34]];
                        Movement.walkTo((WorldPoint)hO);
                        "".length();
                        Time.sleepTicks((int)llllIllIII[0]);
                        "".length();
                    }
                    if (J.llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hO), llllIllIII[4])) {
                        g.a(llllIlIllI[llllIllIII[35]], bQ);
                    }
                }
                String[] stringArray2 = new String[llllIllIII[0]];
                stringArray2[J.llllIllIII[1]] = llllIlIllI[llllIllIII[36]];
                if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[llllIllIII[0]];
                    stringArray3[J.llllIllIII[1]] = llllIlIllI[llllIllIII[37]];
                    if (J.llIlIIIIIlllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        int[] nArray6 = new int[llllIllIII[0]];
                        nArray6[J.llllIllIII[1]] = llllIllIII[12];
                        if (J.llIlIIIIIllII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[llllIllIII[0]];
                            nArray7[J.llllIllIII[1]] = llllIllIII[12];
                            String[] stringArray4 = new String[llllIllIII[0]];
                            stringArray4[J.llllIllIII[1]] = llllIlIllI[llllIllIII[38]];
                            Inventory.getFirst((int[])nArray7).useOn(Inventory.getFirst((String[])stringArray4));
                            Time.sleepTicks((int)llllIllIII[4]);
                            "".length();
                        }
                        int[] nArray8 = new int[llllIllIII[0]];
                        nArray8[J.llllIllIII[1]] = llllIllIII[12];
                        if (J.llIlIIIIIlllI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            String[] stringArray5 = new String[llllIllIII[0]];
                            stringArray5[J.llllIllIII[1]] = llllIlIllI[llllIllIII[39]];
                            lllllllllllllllllIlIlIIlllIlIllI = NPCs.getNearest((String[])stringArray5);
                            lllllllllllllllllIlIlIIlllIlIlIl2 = new WorldArea(llllIllIII[40], llllIllIII[41], llllIllIII[14], llllIllIII[16], llllIllIII[1]);
                            if (!J.llIlIIIIIllll(lllllllllllllllllIlIlIIlllIlIllI) || J.llIlIIIIIllll(lllllllllllllllllIlIlIIlllIlIllI) && J.llIlIIIIIlllI(Reachable.isInteractable((Locatable)lllllllllllllllllIlIlIIlllIlIllI) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)hP);
                                "".length();
                                Time.sleepTicks((int)llllIllIII[0]);
                                "".length();
                            }
                            if (J.llIlIIIIIllll(lllllllllllllllllIlIlIIlllIlIllI)) {
                                g.a(llllIlIllI[llllIllIII[42]], bQ, llllIllIII[0]);
                            }
                        }
                    }
                }
                String[] stringArray6 = new String[llllIllIII[0]];
                stringArray6[J.llllIllIII[1]] = llllIlIllI[llllIllIII[33]];
                if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                    String[] stringArray7 = new String[llllIllIII[0]];
                    stringArray7[J.llllIllIII[1]] = llllIlIllI[llllIllIII[43]];
                    if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                        String[] stringArray8 = new String[llllIllIII[0]];
                        stringArray8[J.llllIllIII[1]] = llllIlIllI[llllIllIII[44]];
                        if (J.llIlIIIIIlllI(Inventory.contains((String[])stringArray8) ? 1 : 0) && J.llIlIIIIIlllI(hS ? 1 : 0)) {
                            if (J.llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hQ), llllIllIII[18]) && J.llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[45])) {
                                AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[46]];
                                Movement.walkTo((WorldPoint)hQ);
                                "".length();
                                Time.sleepTicks((int)llllIllIII[0]);
                                "".length();
                            }
                            if (J.llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hQ), llllIllIII[18])) {
                                lllllllllllllllllIlIlIIlllIlIllI = new WorldPoint(llllIllIII[47], llllIllIII[48], llllIllIII[1]);
                                lllllllllllllllllIlIlIIlllIlIlIl2 = new WorldPoint(llllIllIII[47], llllIllIII[49], llllIllIII[1]);
                                if ((!J.llIlIIIIIlllI(Players.getLocal().getWorldLocation().equals(lllllllllllllllllIlIlIIlllIlIllI) ? 1 : 0) || J.llIlIIIIIllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIlIIlllIlIlIl2) ? 1 : 0)) && J.llIlIIIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)new WorldPoint(llllIllIII[50], llllIllIII[51], llllIllIII[1]));
                                    "".length();
                                    Time.sleepTicks((int)llllIllIII[7]);
                                    "".length();
                                }
                                g.a(llllIlIllI[llllIllIII[52]], bQ, llllIllIII[0]);
                            }
                        }
                    }
                }
                String[] stringArray9 = new String[llllIllIII[0]];
                stringArray9[J.llllIllIII[1]] = llllIlIllI[llllIllIII[45]];
                if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                    String[] stringArray10 = new String[llllIllIII[0]];
                    stringArray10[J.llllIllIII[1]] = llllIlIllI[llllIllIII[53]];
                    if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                        String[] stringArray11 = new String[llllIllIII[0]];
                        stringArray11[J.llllIllIII[1]] = llllIlIllI[llllIllIII[54]];
                        if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray11) ? 1 : 0) && J.llIlIIIIIlllI(hS ? 1 : 0)) {
                            if (J.llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[14])) {
                                AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[55]];
                                Movement.walkTo((WorldPoint)hN);
                                "".length();
                                Time.sleepTicks((int)llllIllIII[0]);
                                "".length();
                            }
                            if (J.llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[14])) {
                                g.a(llllIlIllI[llllIllIII[56]], bQ);
                                lllllllllllllllllIlIlIIlllIlIllI = Dialog.getOptions();
                                if (J.llIlIIIIIlllI(lllllllllllllllllIlIlIIlllIlIllI.isEmpty() ? 1 : 0)) {
                                    int lllllllllllllllllIlIlIIlllIlIlIl2 = llllIllIII[1];
                                    while (J.llIlIIIIIllIl(lllllllllllllllllIlIlIIlllIlIlIl2, lllllllllllllllllIlIlIIlllIlIllI.size())) {
                                        if (J.llIlIIIIIllII(((Widget)lllllllllllllllllIlIlIIlllIlIllI.get(lllllllllllllllllIlIlIIlllIlIlIl2)).getText().contains(llllIlIllI[llllIllIII[57]]) ? 1 : 0)) {
                                            System.out.println(llllIlIllI[llllIllIII[58]]);
                                            hS = llllIllIII[0];
                                        }
                                        ++lllllllllllllllllIlIlIIlllIlIlIl2;
                                        "".length();
                                        if ((66 + 104 - 56 + 28 ^ 59 + 77 - 57 + 59) >= 0) continue;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                if (J.llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hN), llllIllIII[20]) && J.llIlIIIIIlllI(hS ? 1 : 0)) {
                    String[] stringArray12 = new String[llllIllIII[0]];
                    stringArray12[J.llllIllIII[1]] = llllIlIllI[llllIllIII[59]];
                    if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        String[] stringArray13 = new String[llllIllIII[0]];
                        stringArray13[J.llllIllIII[1]] = llllIlIllI[llllIllIII[60]];
                        if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            g.a(llllIlIllI[llllIllIII[61]], bQ);
                            lllllllllllllllllIlIlIIlllIlIllI = Dialog.getOptions();
                            if (J.llIlIIIIIlllI(lllllllllllllllllIlIlIIlllIlIllI.isEmpty() ? 1 : 0)) {
                                int lllllllllllllllllIlIlIIlllIlIlIl2 = llllIllIII[1];
                                while (J.llIlIIIIIllIl(lllllllllllllllllIlIlIIlllIlIlIl2, lllllllllllllllllIlIlIIlllIlIllI.size())) {
                                    if (J.llIlIIIIIllII(((Widget)lllllllllllllllllIlIlIIlllIlIllI.get(lllllllllllllllllIlIlIIlllIlIlIl2)).getText().contains(llllIlIllI[llllIllIII[62]]) ? 1 : 0)) {
                                        System.out.println(llllIlIllI[llllIllIII[63]]);
                                        hS = llllIllIII[0];
                                    }
                                    ++lllllllllllllllllIlIlIIlllIlIlIl2;
                                    "".length();
                                    if (" ".length() >= 0) continue;
                                    return;
                                }
                            }
                        }
                    }
                }
                if (J.llIlIIIIIllII(hS ? 1 : 0)) {
                    String[] stringArray14 = new String[llllIllIII[0]];
                    stringArray14[J.llllIllIII[1]] = llllIlIllI[llllIllIII[64]];
                    if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        String[] stringArray15 = new String[llllIllIII[0]];
                        stringArray15[J.llllIllIII[1]] = llllIlIllI[llllIllIII[65]];
                        if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                            if (J.llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hR), llllIllIII[16])) {
                                if (J.llIlIIIIIllII(Inventory.contains(item -> item.getName().contains(llllIlIllI[llllIllIII[101]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(llllIlIllI[llllIllIII[100]])).interact(llllIlIllI[llllIllIII[66]]);
                                }
                                if (J.llIlIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] stringArray16 = new String[llllIllIII[0]];
                                stringArray16[J.llllIllIII[1]] = llllIlIllI[llllIllIII[67]];
                                g.a(stringArray16);
                                AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[68]];
                                Movement.walkTo((WorldPoint)hR);
                                "".length();
                                Time.sleepTicks((int)llllIllIII[0]);
                                "".length();
                            }
                            if (J.llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hR), llllIllIII[16])) {
                                g.a(llllIlIllI[llllIllIII[69]], bQ);
                            }
                        }
                    }
                }
            }
            if (!J.llIlIIIIlIlIl(e.j(llllIllIII[2]), llllIllIII[57]) || J.llIlIIIIlIlII(e.j(llllIllIII[2]), llllIllIII[58])) {
                String[] stringArray = new String[llllIllIII[0]];
                stringArray[J.llllIllIII[1]] = llllIlIllI[llllIllIII[70]];
                if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lllllllllllllllllIlIlIIlllIlIllI = new WorldArea(llllIllIII[71], llllIllIII[72], llllIllIII[24], llllIllIII[18], llllIllIII[1]);
                    g.a(bQ);
                    if (J.llIlIIIIIlllI(lllllllllllllllllIlIlIIlllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[73]];
                        Movement.walkTo((WorldPoint)hQ);
                        "".length();
                        Time.sleepTicks((int)llllIllIII[0]);
                        "".length();
                    }
                    if (J.llIlIIIIIllII(lllllllllllllllllIlIlIIlllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[74]];
                        g.a(llllIlIllI[llllIllIII[75]], bQ, llllIllIII[0]);
                    }
                }
            }
            if (J.llIlIIIIlIlII(e.j(llllIllIII[2]), llllIllIII[67])) {
                String[] stringArray = new String[llllIllIII[0]];
                stringArray[J.llllIllIII[1]] = llllIlIllI[llllIllIII[76]];
                if (J.llIlIIIIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[77]];
                    String[] stringArray17 = new String[llllIllIII[0]];
                    stringArray17[J.llllIllIII[1]] = llllIlIllI[llllIllIII[78]];
                    String[] stringArray18 = new String[llllIllIII[0]];
                    stringArray18[J.llllIllIII[1]] = llllIlIllI[llllIllIII[32]];
                    Inventory.getFirst((String[])stringArray17).useOn((Actor)NPCs.getNearest((String[])stringArray18));
                    Time.sleepTicks((int)llllIllIII[20]);
                    "".length();
                }
            }
            if (J.llIlIIIIlIlII(e.j(llllIllIII[2]), llllIllIII[32])) {
                lllllllllllllllllIlIlIIlllIlIllI = new WorldArea(llllIllIII[71], llllIllIII[72], llllIllIII[14], llllIllIII[5], llllIllIII[1]);
                if (J.llIlIIIIIlllI(lllllllllllllllllIlIlIIlllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[79]];
                    String[] stringArray = new String[llllIllIII[0]];
                    stringArray[J.llllIllIII[1]] = llllIlIllI[llllIllIII[80]];
                    String[] stringArray19 = new String[llllIllIII[0]];
                    stringArray19[J.llllIllIII[1]] = llllIlIllI[llllIllIII[81]];
                    Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray19));
                    Time.sleepTicks((int)llllIllIII[7]);
                    "".length();
                }
                if (J.llIlIIIIIllII(lllllllllllllllllIlIlIIlllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(llllIlIllI[llllIllIII[82]], bQ);
                }
            }
            if (J.llIlIIIIlIlII(e.j(llllIllIII[2]), llllIllIII[83])) {
                if (J.llIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(gf), llllIllIII[18])) {
                    WorldArea lllllllllllllllllIlIlIIlllIlIlIl2;
                    lllllllllllllllllIlIlIIlllIlIllI = new WorldArea(llllIllIII[71], llllIllIII[72], llllIllIII[14], llllIllIII[5], llllIllIII[1]);
                    if (J.llIlIIIIIllII(lllllllllllllllllIlIlIIlllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.llIlIIIIIlllI(Equipment.contains((int[])f.aQ) ? 1 : 0)) {
                        int[] nArray9 = new int[llllIllIII[0]];
                        nArray9[J.llllIllIII[1]] = llllIllIII[9];
                        if (J.llIlIIIIIllII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                            int[] nArray10 = new int[llllIllIII[0]];
                            nArray10[J.llllIllIII[1]] = llllIllIII[9];
                            Inventory.getFirst((int[])nArray10).interact(llllIlIllI[llllIllIII[84]]);
                            Time.sleepTicks((int)e.c(llllIllIII[16], llllIllIII[20]));
                            "".length();
                        }
                    }
                    if (J.llIlIIIIIllII((lllllllllllllllllIlIlIIlllIlIlIl2 = new WorldArea(llllIllIII[51], llllIllIII[85], llllIllIII[52], llllIllIII[55], llllIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.llIlIIIIlIIll(Players.getLocal().getWorldLocation().getX(), llllIllIII[86])) {
                        AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[87]];
                        String[] stringArray = new String[llllIllIII[0]];
                        stringArray[J.llllIllIII[1]] = llllIlIllI[llllIllIII[88]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIlIllI[llllIllIII[89]]);
                        Time.sleepTicks((int)e.c(llllIllIII[5], llllIllIII[16]));
                        "".length();
                    }
                    AccBuilderTempleTrek.c = llllIlIllI[llllIllIII[90]];
                    Movement.walkTo((WorldPoint)gf);
                    "".length();
                    Time.sleepTicks((int)llllIllIII[0]);
                    "".length();
                }
                if (J.llIlIIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(gf), llllIllIII[18])) {
                    if (J.llIlIIIIIllIl(ck, llllIllIII[0])) {
                        ac.mQ += llllIllIII[0];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllIllIII[0];
                        ac.mQ = llllIllIII[1];
                        cl = llllIllIII[1];
                    }
                    g.a(llllIlIllI[llllIllIII[91]], bQ);
                }
            }
            g.a(new String[llllIllIII[1]]);
        }
    }

    private static String llIlIIIIIIIll(String lllllllllllllllllIlIlIIllIlIIIIl, String lllllllllllllllllIlIlIIllIlIIlIl) {
        lllllllllllllllllIlIlIIllIlIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIIllIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIlIIllIlIIlII = new StringBuilder();
        char[] lllllllllllllllllIlIlIIllIlIIIll = lllllllllllllllllIlIlIIllIlIIlIl.toCharArray();
        int lllllllllllllllllIlIlIIllIlIIIlI = llllIllIII[1];
        char[] lllllllllllllllllIlIlIIllIIlllII = lllllllllllllllllIlIlIIllIlIIIIl.toCharArray();
        int lllllllllllllllllIlIlIIllIIllIll = lllllllllllllllllIlIlIIllIIlllII.length;
        int lllllllllllllllllIlIlIIllIIllIlI = llllIllIII[1];
        while (J.llIlIIIIIllIl(lllllllllllllllllIlIlIIllIIllIlI, lllllllllllllllllIlIlIIllIIllIll)) {
            char lllllllllllllllllIlIlIIllIlIIlll = lllllllllllllllllIlIlIIllIIlllII[lllllllllllllllllIlIlIIllIIllIlI];
            lllllllllllllllllIlIlIIllIlIIlII.append((char)(lllllllllllllllllIlIlIIllIlIIlll ^ lllllllllllllllllIlIlIIllIlIIIll[lllllllllllllllllIlIlIIllIlIIIlI % lllllllllllllllllIlIlIIllIlIIIll.length]));
            "".length();
            ++lllllllllllllllllIlIlIIllIlIIIlI;
            ++lllllllllllllllllIlIlIIllIIllIlI;
            "".length();
            if ((21 + 17 - 11 + 145 ^ 95 + 103 - 132 + 102) >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIlIIllIlIIlII);
    }

    @Override
    public int T() {
        try {
            J.cW();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x28 ^ 0xD) & ~(0xA4 ^ 0x81)) != 0) {
            return (0xF8 ^ 0xB0) & ~(0xEB ^ 0xA3);
        }
        return llllIllIII[83];
    }

    private static boolean llIlIIIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIIIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIlIIIIlIIII(int n2) {
        return n2 > 0;
    }

    static {
        J.llIlIIIIIlIlI();
        J.llIlIIIIIlIIl();
        hM = llllIllIII[2];
        bu = new ArrayList<d>();
        gf = new WorldPoint(llllIllIII[104], llllIllIII[105], llllIllIII[1]);
        hN = new WorldPoint(llllIllIII[106], llllIllIII[107], llllIllIII[1]);
        hO = new WorldPoint(llllIllIII[108], llllIllIII[109], llllIllIII[1]);
        hP = new WorldPoint(llllIllIII[110], llllIllIII[111], llllIllIII[1]);
        hQ = new WorldPoint(llllIllIII[112], llllIllIII[113], llllIllIII[1]);
        hR = new WorldPoint(llllIllIII[114], llllIllIII[115], llllIllIII[1]);
        String[] stringArray = new String[llllIllIII[34]];
        stringArray[J.llllIllIII[1]] = llllIlIllI[llllIllIII[116]];
        stringArray[J.llllIllIII[0]] = llllIlIllI[llllIllIII[117]];
        stringArray[J.llllIllIII[4]] = llllIlIllI[llllIllIII[118]];
        stringArray[J.llllIllIII[7]] = llllIlIllI[llllIllIII[119]];
        stringArray[J.llllIllIII[5]] = llllIlIllI[llllIllIII[120]];
        stringArray[J.llllIllIII[14]] = llllIlIllI[llllIllIII[121]];
        stringArray[J.llllIllIII[16]] = llllIlIllI[llllIllIII[122]];
        stringArray[J.llllIllIII[18]] = llllIlIllI[llllIllIII[123]];
        stringArray[J.llllIllIII[20]] = llllIlIllI[llllIllIII[124]];
        stringArray[J.llllIllIII[22]] = llllIlIllI[llllIllIII[125]];
        stringArray[J.llllIllIII[24]] = llllIlIllI[llllIllIII[126]];
        stringArray[J.llllIllIII[25]] = llllIlIllI[llllIllIII[127]];
        stringArray[J.llllIllIII[8]] = llllIlIllI[llllIllIII[128]];
        bQ = stringArray;
    }

    @Override
    public boolean S() {
        return llllIllIII[1];
    }

    private static String llIlIIIIIIlII(String lllllllllllllllllIlIlIIlllIIIIll, String lllllllllllllllllIlIlIIlllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIlllIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIlIIlllIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIlIIlllIIIlIl.init(llllIllIII[4], lllllllllllllllllIlIlIIlllIIIllI);
            return new String(lllllllllllllllllIlIlIIlllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIlllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIlIIlllIIIlII) {
            lllllllllllllllllIlIlIIlllIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIIIllll(Object object) {
        return object != null;
    }

    private static boolean llIlIIIIlIIIl(int n2) {
        return n2 < 0;
    }
}

