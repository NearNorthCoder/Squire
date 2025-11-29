/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;

public class aN_Unknown
implements ac {
    public static /* synthetic */ int sp;
    public static /* synthetic */ int sH;
    private static /* synthetic */ String[] llIIlIlllI;
    public static /* synthetic */ int qN;
    public static /* synthetic */ int rR;
    public static /* synthetic */ int rg;
    public static /* synthetic */ int tf;
    public static /* synthetic */ int rw;
    public static /* synthetic */ int qn;
    public static /* synthetic */ int qa;
    public static /* synthetic */ int su;
    public static /* synthetic */ int qk;
    public static /* synthetic */ int qZ;
    public static /* synthetic */ int ri;
    public static /* synthetic */ int sv;
    public static /* synthetic */ int sT;
    public static /* synthetic */ int rm;
    public static /* synthetic */ int td;
    public static /* synthetic */ int rH;
    public static /* synthetic */ int rx;
    public static /* synthetic */ int sG;
    public static /* synthetic */ int qb;
    public static /* synthetic */ int sd;
    public static /* synthetic */ int rP;
    public static /* synthetic */ int sO;
    public static /* synthetic */ int sC;
    public static /* synthetic */ int sV;
    public static /* synthetic */ int rs;
    public static /* synthetic */ int rN;
    public static /* synthetic */ int rI;
    public static /* synthetic */ int rX;
    public static /* synthetic */ int so;
    public static /* synthetic */ int rb;
    public static /* synthetic */ int qO;
    public static /* synthetic */ int rv;
    public static /* synthetic */ int qJ;
    public static /* synthetic */ int qj;
    public static /* synthetic */ int rE;
    public static /* synthetic */ int sg;
    public static /* synthetic */ int sq;
    public static /* synthetic */ int qh;
    public static /* synthetic */ int sW;
    public static /* synthetic */ int qV;
    public static /* synthetic */ int rU;
    public static /* synthetic */ int sQ;
    public static /* synthetic */ int qr;
    public static /* synthetic */ int qz;
    public static /* synthetic */ int tc;
    public static /* synthetic */ int qW;
    public static /* synthetic */ int sE;
    public static /* synthetic */ int rA;
    public static /* synthetic */ int ti;
    public static /* synthetic */ int st;
    public static /* synthetic */ int sF;
    public static /* synthetic */ int rB;
    public static /* synthetic */ int qS;
    public static /* synthetic */ int rW;
    public static /* synthetic */ int sN;
    public static /* synthetic */ int sL;
    public static /* synthetic */ int rn;
    private static /* synthetic */ int[] llIIlIllll;
    public static /* synthetic */ int qm;
    public static /* synthetic */ int sZ;
    public static /* synthetic */ int ss;
    public static /* synthetic */ int sa;
    public static /* synthetic */ int rd;
    public static /* synthetic */ int qd;
    public static /* synthetic */ int rl;
    public static /* synthetic */ int sh;
    public static /* synthetic */ int rc;
    public static /* synthetic */ int rk;
    public static /* synthetic */ int qX;
    public static /* synthetic */ int ql;
    public static /* synthetic */ int th;
    public static /* synthetic */ int qt;
    public static /* synthetic */ int qD;
    public static /* synthetic */ int qH;
    public static /* synthetic */ int qi;
    public static /* synthetic */ int te;
    static /* synthetic */ long tj;
    public static /* synthetic */ int qF;
    public static /* synthetic */ int sy;
    public static /* synthetic */ int sk;
    public static /* synthetic */ int qY;
    public static /* synthetic */ int ta;
    public static /* synthetic */ int rM;
    public static /* synthetic */ int sK;
    public static /* synthetic */ int rO;
    public static /* synthetic */ int qB;
    public static /* synthetic */ int pY;
    public static /* synthetic */ int rh;
    public static /* synthetic */ int qP;
    public static /* synthetic */ int ry;
    public static /* synthetic */ int qe;
    public static /* synthetic */ int rZ;
    public static /* synthetic */ int sM;
    public static /* synthetic */ int qg;
    public static /* synthetic */ int sw;
    public static /* synthetic */ int qp;
    public static /* synthetic */ int se;
    public static /* synthetic */ int sf;
    public static /* synthetic */ int sX;
    public static /* synthetic */ int rf;
    public static /* synthetic */ int pX;
    public static /* synthetic */ int si;
    public static /* synthetic */ int rK;
    public static /* synthetic */ int tg;
    public static /* synthetic */ int sz;
    public static /* synthetic */ int rt;
    public static /* synthetic */ int rr;
    public static /* synthetic */ int sJ;
    public static /* synthetic */ int rY;
    public static /* synthetic */ int qM;
    public static /* synthetic */ int qc;
    public static /* synthetic */ int rp;
    public static /* synthetic */ int tb;
    public static /* synthetic */ int rT;
    public static /* synthetic */ int rC;
    public static /* synthetic */ int sI;
    public static /* synthetic */ int qv;
    public static /* synthetic */ int rq;
    public static /* synthetic */ int ru;
    public static /* synthetic */ int sn;
    public static /* synthetic */ int sR;
    public static /* synthetic */ int qA;
    public static /* synthetic */ int rJ;
    public static /* synthetic */ int qU;
    public static /* synthetic */ int pZ;
    public static /* synthetic */ int qs;
    public static /* synthetic */ int sl;
    public static /* synthetic */ int rS;
    public static /* synthetic */ int sm;
    public static /* synthetic */ int qy;
    public static /* synthetic */ int sB;
    public static /* synthetic */ int qx;
    public static /* synthetic */ int qT;
    public static /* synthetic */ int qu;
    public static /* synthetic */ int qw;
    public static /* synthetic */ int sc;
    public static /* synthetic */ int qo;
    public static /* synthetic */ int sD;
    public static /* synthetic */ int rQ;
    public static /* synthetic */ int qR;
    public static /* synthetic */ int ra;
    public static /* synthetic */ int rF;
    public static /* synthetic */ int sb;
    public static /* synthetic */ int sj;
    public static /* synthetic */ int qI;
    public static final /* synthetic */ WorldPoint pW;
    public static /* synthetic */ int ro;
    public static /* synthetic */ int rV;
    public static /* synthetic */ int qK;
    public static /* synthetic */ int qE;
    public static /* synthetic */ int re;
    public static /* synthetic */ int sx;
    public static /* synthetic */ int sU;
    public static /* synthetic */ int rz;
    public static /* synthetic */ int sS;
    public static /* synthetic */ int qG;
    public static /* synthetic */ int sr;
    public static /* synthetic */ int sP;
    public static /* synthetic */ int qQ;
    public static /* synthetic */ int rL;
    public static /* synthetic */ int qf;
    public static /* synthetic */ int sA;
    public static /* synthetic */ int qC;
    public static /* synthetic */ int rD;
    public static /* synthetic */ int sY;
    public static /* synthetic */ int rj;
    public static /* synthetic */ int rG;
    public static /* synthetic */ int qq;
    public static /* synthetic */ int qL;

    @Override
    public String ag() {
        return llIIlIlllI[llIIlIllll[19]];
    }

    private static String lIlIlIllIIllI(String var340, String var215) {
        try {
            SecretKeySpec var133 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var215.getBytes(StandardCharsets.UTF_8)), llIIlIllll[8]), "DES");
            Cipher var316 = Cipher.getInstance("DES");
            var316.init(llIIlIllll[2], var133);
            return new String(var316.doFinal(Base64.getDecoder().decode(var340.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var80) {
            var80.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            aN.hd();
            0;
        }
        catch (Exception var15) {
            var15.printStackTrace();
        }
        if (2 <= 0) {
            return (0x2F ^ 4) & ~(0xA7 ^ 0x8C);
        }
        return llIIlIllll[18];
    }

    public static void hd() {
    }

    @Override
    public boolean ah() {
        return llIIlIllll[0];
    }

    public static void u(String string) {
        long l2 = (System.currentTimeMillis() - AccBuilderSotf.b) / 1000L;
        long l3 = Math.abs(l2 - tj / 1000L);
        aN.a(string, l3, null, pX, pY, pZ, qa, qb, qc, qd, qe, qf, qg, qh, qi, qj, qk, ql, qm, qn, qo, qp, qq, qr, qs, qt, qu, qv, qw, qx, qy, qz, qA, qB, qC, qD, qE, qF, qG, qH, qI, qJ, qK, qL, qM, qN, qO, qP, qQ, qR, qS, qT, qU, qV, qW, qX, qY, qZ, ra, rb, rc, rd, re, rf, rg, rh, ri, rj, rk, rl, rm, rn, ro, rp, rq, rr, rs, rt, ru, rv, rw, rx, ry, rz, rA, rB, rC, rD, rE, rF, rG, rH, rI, rJ, rK, rL, rM, rN, rO, rP, rQ, rR, rS, rT, rU, rV, rW, rX, rY, rZ, sa, sb, sc, sd, se, sf, sg, sh, si, sj, sk, sl, sm, sn, so, sp, sq, sr, ss, st, su, sv, sw, sx, sy, sz, sA, sB, sC, sD, sE, sF, sG, sH, sI, sJ, sK, sL, sM, sN, sO, sP, sQ, sR, sS, sT, sU, sV, sW, sX, sY, sZ, ta, tb, tc, td, te, tf, tg, th, ti);
        0;
        aN.b(String.valueOf(string), l3, null, pX, pY, pZ, qa, qb, qc, qd, qe, qf, qg, qh, qi, qj, qk, ql, qm, qn, qo, qp, qq, qr, qs, qt, qu, qv, qw, qx, qy, qz, qA, qB, qC, qD, qE, qF, qG, qH, qI, qJ, qK, qL, qM, qN, qO, qP, qQ, qR, qS, qT, qU, qV, qW, qX, qY, qZ, ra, rb, rc, rd, re, rf, rg, rh, ri, rj, rk, rl, rm, rn, ro, rp, rq, rr, rs, rt, ru, rv, rw, rx, ry, rz, rA, rB, rC, rD, rE, rF, rG, rH, rI, rJ, rK, rL, rM, rN, rO, rP, rQ, rR, rS, rT, rU, rV, rW, rX, rY, rZ, sa, sb, sc, sd, se, sf, sg, sh, si, sj, sk, sl, sm, sn, so, sp, sq, sr, ss, st, su, sv, sw, sx, sy, sz, sA, sB, sC, sD, sE, sF, sG, sH, sI, sJ, sK, sL, sM, sN, sO, sP, sQ, sR, sS, sT, sU, sV, sW, sX, sY, sZ, ta, tb, tc, td, te, tf, tg, th, ti);
        0;
        tj = System.currentTimeMillis() - AccBuilderSotf.b;
    }

    private static boolean lIlIlIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlIllllIIl() {
        llIIlIllll = new int[23];
        aN.llIIlIllll[0] = (0xC ^ 0x13) & ~(0x26 ^ 0x39);
        aN.llIIlIllll[1] = 1;
        aN.llIIlIllll[2] = 2;
        aN.llIIlIllll[3] = 3;
        aN.llIIlIllll[4] = 0xAB ^ 0xAF;
        aN.llIIlIllll[5] = 0xC4 ^ 0xC1;
        aN.llIIlIllll[6] = 51 + 161 - 78 + 41 ^ 34 + 136 - 16 + 15;
        aN.llIIlIllll[7] = 0xAD ^ 0xAA;
        aN.llIIlIllll[8] = 0x38 ^ 0x30;
        aN.llIIlIllll[9] = 0xCE ^ 0xC7;
        aN.llIIlIllll[10] = 132 + 127 - 201 + 80 ^ 115 + 78 - 138 + 73;
        aN.llIIlIllll[11] = 109 + 146 - 184 + 95 ^ 4 + 114 - -3 + 52;
        aN.llIIlIllll[12] = 0xBC ^ 0xB0;
        aN.llIIlIllll[13] = 136 + 118 - 108 + 17 ^ 77 + 134 - 187 + 150;
        aN.llIIlIllll[14] = 163 + 26 - 102 + 101 ^ 17 + 11 - -136 + 14;
        aN.llIIlIllll[15] = 0x22 ^ 0x2D;
        aN.llIIlIllll[16] = 6 ^ 0x28 ^ (0xAF ^ 0x91);
        aN.llIIlIllll[17] = 1 ^ 6 ^ (0x64 ^ 0x72);
        aN.llIIlIllll[18] = -(0xFFFFFE25 & 0x2DDF) & (0xFFFFAFFC & 0x7FEF);
        aN.llIIlIllll[19] = 0x1C ^ 0xE;
        aN.llIIlIllll[20] = -(0xFFFFA2A7 & 0x7F5B) & (0xFFFFEEFF & 0x3F5F);
        aN.llIIlIllll[21] = 0xFFFF8D9F & Short.MAX_VALUE;
        aN.llIIlIllll[22] = 0x66 ^ 0x4C ^ (0xFC ^ 0xC5);
    }

    @Override
    public boolean ae() {
        return llIIlIllll[1];
    }

    private static int lIlIlIlllllIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String lIlIlIllIIlll(String var285, String var280) {
        try {
            SecretKeySpec var114 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var280.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var214 = Cipher.getInstance("Blowfish");
            var214.init(llIIlIllll[2], var114);
            return new String(var214.doFinal(Base64.getDecoder().decode(var285.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var372) {
            var372.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllllIII() {
        llIIlIlllI = new String[llIIlIllll[22]];
        aN.llIIlIlllI[aN.llIIlIllll[0]] = aN."1234567891234567";
        aN.llIIlIlllI[aN.llIIlIllll[1]] = aN."1234567891234568";
        aN.llIIlIlllI[aN.llIIlIllll[2]] = aN."AES";
        aN.llIIlIlllI[aN.llIIlIllll[3]] = aN."AES/CBC/PKCS5Padding";
        aN.llIIlIlllI[aN.llIIlIllll[4]] = aN." ";
        aN.llIIlIlllI[aN.llIIlIllll[5]] = aN." ";
        aN.llIIlIlllI[aN.llIIlIllll[6]] = aN."%20";
        aN.llIIlIlllI[aN.llIIlIllll[7]] = aN."User-Agent";
        aN.llIIlIlllI[aN.llIIlIllll[8]] = aN."Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2.13) Gecko/20101203 Firefox/3.6.13 (.NET CLR 3.5.30729)";
        aN.llIIlIlllI[aN.llIIlIllll[9]] = aN."1234567891234567";
        aN.llIIlIlllI[aN.llIIlIllll[10]] = aN."1234567891234568";
        aN.llIIlIlllI[aN.llIIlIllll[11]] = aN."AES";
        aN.llIIlIlllI[aN.llIIlIllll[12]] = aN."AES/CBC/PKCS5Padding";
        aN.llIIlIlllI[aN.llIIlIllll[13]] = aN." ";
        aN.llIIlIlllI[aN.llIIlIllll[14]] = aN." ";
        aN.llIIlIlllI[aN.llIIlIllll[15]] = aN."%20";
        aN.llIIlIlllI[aN.llIIlIllll[16]] = aN."User-Agent";
        aN.llIIlIlllI[aN.llIIlIllll[17]] = aN."Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2.13) Gecko/20101203 Firefox/3.6.13 (.NET CLR 3.5.30729)";
        aN.llIIlIlllI[aN.llIIlIllll[19]] = aN."Testing";
    }

    private static boolean lIlIlIllllIll(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string, long l2, String string2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n23, int n24, int n25, int n26, int n27, int n28, int n29, int n30, int n31, int n32, int n33, int n34, int n35, int n36, int n37, int n38, int n39, int n40, int n41, int n42, int n43, int n44, int n45, int n46, int n47, int n48, int n49, int n50, int n51, int n52, int n53, int n54, int n55, int n56, int n57, int n58, int n59, int n60, int n61, int n62, int n63, int n64, int n65, int n66, int n67, int n68, int n69, int n70, int n71, int n72, int n73, int n74, int n75, int n76, int n77, int n78, int n79, int n80, int n81, int n82, int n83, int n84, int n85, int n86, int n87, int n88, int n89, int n90, int n91, int n92, int n93, int n94, int n95, int n96, int n97, int n98, int n99, int n100, int n101, int n102, int n103, int n104, int n105, int n106, int n107, int n108, int n109, int n110, int n111, int n112, int n113, int n114, int n115, int n116, int n117, int n118, int n119, int n120, int n121, int n122, int n123, int n124, int n125, int n126, int n127, int n128, int n129, int n130, int n131, int n132, int n133, int n134, int n135, int n136, int n137, int n138, int n139, int n140, int n141, int n142, int n143, int n144, int n145, int n146, int n147, int n148, int n149, int n150, int n151, int n152, int n153, int n154, int n155, int n156, int n157, int n158, int n159, int n160, int n161, int n162, int n163, int n164, int n165, int n166, int n167, int n168, int n169) {
        String var353;
        long var326;
        if (aN.lIlIlIllllIll(aN.lIlIlIllllIlI(l2, 660000L))) {
            var326 = 100L;
        }
        String var178 = llIIlIlllI[llIIlIllll[0]];
        String var37 = llIIlIlllI[llIIlIllll[1]];
        String var322 = var353;
        try {
            void var138;
            void var311;
            void var344;
            void var177;
            void var367;
            void var240;
            void var89;
            void var362;
            void var153;
            void var184;
            void var21;
            void var63;
            void var212;
            void var354;
            void var144;
            void var93;
            void var154;
            void var349;
            void var312;
            void var57;
            void var86;
            void var279;
            void var14;
            void var226;
            void var48;
            void var249;
            void var141;
            void var23;
            void var201;
            void var370;
            void var366;
            void var27;
            void var220;
            void var216;
            void var73;
            void var28;
            void var296;
            void var221;
            void var188;
            void var310;
            void var369;
            void var376;
            void var289;
            void var97;
            void var9;
            void var82;
            void var287;
            void var200;
            void var127;
            void var54;
            void var341;
            void var268;
            void var171;
            void var87;
            void var174;
            void var31;
            void var5;
            void var145;
            void var134;
            void var68;
            void var297;
            void var170;
            void var202;
            void var265;
            void var39;
            void var197;
            void var257;
            void var139;
            void var274;
            void var137;
            void var283;
            void var333;
            void var224;
            void var106;
            void var374;
            void var33;
            void var288;
            void var123;
            void var41;
            void var129;
            void var117;
            void var368;
            void var305;
            void var186;
            void var260;
            void var269;
            void var60;
            void var118;
            void var59;
            void var365;
            void var270;
            void var42;
            void var147;
            void var78;
            void var19;
            void var241;
            void var348;
            void var213;
            void var45;
            void var205;
            void var6;
            void var100;
            void var179;
            void var320;
            void var351;
            void var335;
            void var43;
            void var277;
            void var334;
            void var62;
            void var345;
            void var56;
            void var263;
            void var70;
            void var243;
            void var284;
            void var83;
            void var34;
            void var282;
            void var237;
            void var140;
            void var65;
            void var1;
            void var363;
            void var168;
            void var16;
            void var298;
            void var151;
            void var95;
            void var79;
            void var194;
            void var313;
            void var155;
            void var25;
            void var246;
            void var234;
            void var135;
            void var318;
            void var325;
            void var66;
            void var156;
            void var110;
            void var101;
            void var195;
            void var242;
            void var175;
            void var46;
            void var109;
            void var207;
            void var223;
            void var306;
            void var247;
            void var128;
            void var373;
            void var230;
            void var84;
            void var371;
            void var12;
            void var172;
            void var271;
            void var81;
            void var208;
            void var299;
            void var99;
            void var125;
            void var67;
            void var157;
            void var2;
            void var228;
            Object var236 = var37 + "," + var322 + "," + (String)var228 + "," + var326 + "," + (int)var2 + "," + (int)var157 + "," + (int)var67 + "," + (int)var125 + "," + (int)var99 + "," + (int)var299 + "," + (int)var208 + "," + (int)var81 + "," + (int)var271 + "," + (int)var172 + "," + (int)var12 + "," + (int)var371 + "," + (int)var84 + "," + (int)var230 + "," + (int)var373 + "," + (int)var128 + "," + (int)var247 + "," + (int)var306 + "," + (int)var223 + "," + (int)var207 + "," + (int)var109 + "," + (int)var46 + "," + (int)var175 + "," + (int)var242 + "," + (int)var195 + "," + (int)var101 + "," + (int)var110 + "," + (int)var156 + "," + (int)var66 + "," + (int)var325 + "," + (int)var318 + "," + (int)var135 + "," + (int)var234 + "," + (int)var246 + "," + (int)var25 + "," + (int)var155 + "," + (int)var313 + "," + (int)var194 + "," + (int)var79 + "," + (int)var95 + "," + (int)var151 + "," + (int)var298 + "," + (int)var16 + "," + (int)var168 + "," + (int)var363 + "," + (int)var1 + "," + (int)var65 + "," + (int)var140 + "," + (int)var237 + "," + (int)var282 + "," + (int)var34 + "," + (int)var83 + "," + (int)var284 + "," + (int)var243 + "," + (int)var70 + "," + (int)var263 + "," + (int)var56 + "," + (int)var345 + "," + (int)var62 + "," + (int)var334 + "," + (int)var277 + "," + (int)var43 + "," + (int)var335 + "," + (int)var351 + "," + (int)var320 + "," + (int)var179 + "," + (int)var100 + "," + (int)var6 + "," + (int)var205 + "," + (int)var45 + "," + (int)var213 + "," + (int)var348 + "," + (int)var241 + "," + (int)var19 + "," + (int)var78 + "," + (int)var147 + "," + (int)var42 + "," + (int)var270 + "," + (int)var365 + "," + (int)var59 + "," + (int)var118 + "," + (int)var60 + "," + (int)var269 + "," + (int)var260 + "," + (int)var186 + "," + (int)var305 + "," + (int)var368 + "," + (int)var117 + "," + (int)var129 + "," + (int)var41 + "," + (int)var123 + "," + (int)var288 + "," + (int)var33 + "," + (int)var374 + "," + (int)var106 + "," + ((int)var224 + "," + (int)var333 + "," + (int)var283 + "," + (int)var137 + "," + (int)var274 + "," + (int)var139 + "," + (int)var257 + "," + (int)var197 + "," + (int)var39 + "," + (int)var265 + "," + (int)var202 + "," + (int)var170 + "," + (int)var297 + "," + (int)var68 + "," + (int)var134 + "," + (int)var145 + "," + (int)var5 + "," + (int)var31 + "," + (int)var174 + "," + (int)var87 + "," + (int)var171 + "," + (int)var268 + "," + (int)var341 + "," + (int)var54 + "," + (int)var127 + "," + (int)var200 + "," + (int)var287 + "," + (int)var82 + "," + (int)var9 + "," + (int)var97 + "," + (int)var289 + "," + (int)var376 + "," + (int)var369 + "," + (int)var310 + "," + (int)var188 + "," + (int)var221 + "," + (int)var296 + "," + (int)var28 + "," + (int)var73 + "," + (int)var216 + "," + (int)var220 + "," + (int)var27 + "," + (int)var366 + "," + (int)var370 + "," + (int)var201 + "," + (int)var23 + "," + (int)var141 + "," + (int)var249 + "," + (int)var48 + "," + (int)var226 + "," + (int)var14 + "," + (int)var279 + "," + (int)var86 + "," + (int)var57 + "," + (int)var312 + "," + (int)var349 + "," + (int)var154 + "," + (int)var93 + "," + (int)var144 + "," + (int)var354 + "," + (int)var212 + "," + (int)var63 + "," + (int)var21 + "," + (int)var184 + "," + (int)var153 + "," + (int)var362 + "," + (int)var89 + "," + (int)var240 + "," + (int)var367 + "," + (int)var177 + "," + (int)var344 + "," + (int)var311 + "," + (int)var138 + ",1");
            IvParameterSpec llllllllllllllllllIIllllllIllIlI = new IvParameterSpec(var37.getBytes());
            SecretKeySpec llllllllllllllllllIIllllllIllIIl = new SecretKeySpec(var178.getBytes(), llIIlIlllI[llIIlIllll[2]]);
            Cipher llllllllllllllllllIIllllllIllIII = Cipher.getInstance(llIIlIlllI[llIIlIllll[3]]);
            if (aN.lIlIlIlllllII(((String)var236).contains(llIIlIlllI[llIIlIllll[4]]) ? 1 : 0)) {
                var236 = ((String)var236).replace(llIIlIlllI[llIIlIllll[5]], llIIlIlllI[llIIlIllll[6]]);
            }
            URL var146 = new URL("http://godscripting.com/stats/input.php?token=" + (String)var236);
            URLConnection var327 = var146.openConnection();
            var327.setRequestProperty(llIIlIlllI[llIIlIllll[7]], llIIlIlllI[llIIlIllll[8]]);
            var327.setDoOutput(llIIlIllll[1]);
            BufferedReader var317 = new BufferedReader(new InputStreamReader(var327.getInputStream()));
            var317.readLine();
            0;
            var317.close();
            return llIIlIllll[1];
        }
        catch (Exception exception) {
            return llIIlIllll[0];
        }
    }

    private static boolean lIlIlIlllllII(int n2) {
        return n2 != 0;
    }

    private static int lIlIlIllllIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String lIlIlIllIIlIl(String var337, String var94) {
        var337 = new String(Base64.getDecoder().decode(var337.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var132 = new StringBuilder();
        char[] var248 = var94.toCharArray();
        int var136 = llIIlIllll[0];
        char[] var336 = var337.toCharArray();
        int var18 = var336.length;
        int var199 = llIIlIllll[0];
        while (aN.lIlIlIllllllI(var199, var18)) {
            char var324 = var336[var199];
            var132.append((char)(var324 ^ var248[var136 % var248.length]));
            0;
            ++var136;
            ++var199;
            0;
            
            return null;
        }
        return String.valueOf(var132);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean b(String string, long l2, String string2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n23, int n24, int n25, int n26, int n27, int n28, int n29, int n30, int n31, int n32, int n33, int n34, int n35, int n36, int n37, int n38, int n39, int n40, int n41, int n42, int n43, int n44, int n45, int n46, int n47, int n48, int n49, int n50, int n51, int n52, int n53, int n54, int n55, int n56, int n57, int n58, int n59, int n60, int n61, int n62, int n63, int n64, int n65, int n66, int n67, int n68, int n69, int n70, int n71, int n72, int n73, int n74, int n75, int n76, int n77, int n78, int n79, int n80, int n81, int n82, int n83, int n84, int n85, int n86, int n87, int n88, int n89, int n90, int n91, int n92, int n93, int n94, int n95, int n96, int n97, int n98, int n99, int n100, int n101, int n102, int n103, int n104, int n105, int n106, int n107, int n108, int n109, int n110, int n111, int n112, int n113, int n114, int n115, int n116, int n117, int n118, int n119, int n120, int n121, int n122, int n123, int n124, int n125, int n126, int n127, int n128, int n129, int n130, int n131, int n132, int n133, int n134, int n135, int n136, int n137, int n138, int n139, int n140, int n141, int n142, int n143, int n144, int n145, int n146, int n147, int n148, int n149, int n150, int n151, int n152, int n153, int n154, int n155, int n156, int n157, int n158, int n159, int n160, int n161, int n162, int n163, int n164, int n165, int n166, int n167, int n168, int n169) {
        String var238;
        long var364;
        if (aN.lIlIlIllllIll(aN.lIlIlIlllllIl(l2, 660000L))) {
            var364 = 100L;
        }
        String var342 = llIIlIlllI[llIIlIllll[9]];
        String var338 = llIIlIlllI[llIIlIllll[10]];
        String var182 = var238;
        try {
            void var300;
            void var17;
            void var225;
            void var211;
            void var71;
            void var91;
            void var323;
            void var309;
            void var105;
            void var254;
            void var198;
            void var350;
            void var290;
            void var222;
            void var321;
            void var126;
            void var96;
            void var330;
            void var75;
            void var169;
            void var304;
            void var266;
            void var276;
            void var35;
            void var32;
            void var251;
            void var4;
            void var111;
            void var357;
            void var315;
            void var120;
            void var130;
            void var187;
            void var64;
            void var38;
            void var292;
            void var343;
            void var119;
            void var36;
            void var121;
            void var193;
            void var24;
            void var165;
            void var76;
            void var328;
            void var286;
            void var181;
            void var262;
            void var355;
            void var158;
            void var303;
            void var44;
            void var160;
            void var189;
            void var264;
            void var50;
            void var352;
            void var261;
            void var102;
            void var116;
            void var148;
            void var239;
            void var166;
            void var291;
            void var358;
            void var104;
            void var107;
            void var58;
            void var150;
            void var143;
            void var275;
            void var10;
            void var252;
            void var259;
            void var90;
            void var163;
            void var7;
            void var192;
            void var359;
            void var244;
            void var314;
            void var245;
            void var185;
            void var124;
            void var161;
            void var196;
            void var281;
            void var40;
            void var331;
            void var51;
            void var3;
            void var74;
            void var301;
            void var272;
            void var108;
            void var295;
            void var293;
            void var209;
            void var235;
            void var308;
            void var61;
            void var233;
            void var256;
            void var69;
            void var8;
            void var85;
            void var88;
            void var232;
            void var258;
            void var53;
            void var375;
            void var72;
            void var219;
            void var307;
            void var250;
            void var347;
            void var173;
            void var210;
            void var159;
            void var20;
            void var131;
            void var204;
            void var13;
            void var98;
            void var227;
            void var229;
            void var113;
            void var180;
            void var346;
            void var55;
            void var22;
            void var361;
            void var332;
            void var190;
            void var302;
            void var112;
            void var11;
            void var162;
            void var92;
            void var360;
            void var47;
            void var356;
            void var278;
            void var218;
            void var103;
            void var294;
            void var26;
            void var319;
            void var329;
            void var167;
            void var52;
            void var122;
            void var152;
            void var77;
            void var115;
            void var30;
            void var267;
            void var149;
            void var203;
            void var49;
            void var206;
            void var339;
            void var191;
            void var231;
            void var29;
            void var255;
            void var183;
            void var164;
            void var217;
            Object var176 = var338 + "," + var182 + "," + (String)var217 + "," + var364 + "," + (int)var164 + "," + (int)var183 + "," + (int)var255 + "," + (int)var29 + "," + (int)var231 + "," + (int)var191 + "," + (int)var339 + "," + (int)var206 + "," + (int)var49 + "," + (int)var203 + "," + (int)var149 + "," + (int)var267 + "," + (int)var30 + "," + (int)var115 + "," + (int)var77 + "," + (int)var152 + "," + (int)var122 + "," + (int)var52 + "," + (int)var167 + "," + (int)var329 + "," + (int)var319 + "," + (int)var26 + "," + (int)var294 + "," + (int)var103 + "," + (int)var218 + "," + (int)var278 + "," + (int)var356 + "," + (int)var47 + "," + (int)var360 + "," + (int)var92 + "," + (int)var162 + "," + (int)var11 + "," + (int)var112 + "," + (int)var302 + "," + (int)var190 + "," + (int)var332 + "," + (int)var361 + "," + (int)var22 + "," + (int)var55 + "," + (int)var346 + "," + (int)var180 + "," + (int)var113 + "," + (int)var229 + "," + (int)var227 + "," + (int)var98 + "," + (int)var13 + "," + (int)var204 + "," + (int)var131 + "," + (int)var20 + "," + (int)var159 + "," + (int)var210 + "," + (int)var173 + "," + (int)var347 + "," + (int)var250 + "," + (int)var307 + "," + (int)var219 + "," + (int)var72 + "," + (int)var375 + "," + (int)var53 + "," + (int)var258 + "," + (int)var232 + "," + (int)var88 + "," + (int)var85 + "," + (int)var8 + "," + (int)var69 + "," + (int)var256 + "," + (int)var233 + "," + (int)var61 + "," + (int)var308 + "," + (int)var235 + "," + (int)var209 + "," + (int)var293 + "," + (int)var295 + "," + (int)var108 + "," + (int)var272 + "," + (int)var301 + "," + (int)var74 + "," + (int)var3 + "," + (int)var51 + "," + (int)var331 + "," + (int)var40 + "," + (int)var281 + "," + (int)var196 + "," + (int)var161 + "," + (int)var124 + "," + (int)var185 + "," + (int)var245 + "," + (int)var314 + "," + (int)var244 + "," + (int)var359 + "," + (int)var192 + "," + (int)var7 + "," + (int)var163 + "," + (int)var90 + "," + (int)var259 + "," + ((int)var252 + "," + (int)var10 + "," + (int)var275 + "," + (int)var143 + "," + (int)var150 + "," + (int)var58 + "," + (int)var107 + "," + (int)var104 + "," + (int)var358 + "," + (int)var291 + "," + (int)var166 + "," + (int)var239 + "," + (int)var148 + "," + (int)var116 + "," + (int)var102 + "," + (int)var261 + "," + (int)var352 + "," + (int)var50 + "," + (int)var264 + "," + (int)var189 + "," + (int)var160 + "," + (int)var44 + "," + (int)var303 + "," + (int)var158 + "," + (int)var355 + "," + (int)var262 + "," + (int)var181 + "," + (int)var286 + "," + (int)var328 + "," + (int)var76 + "," + (int)var165 + "," + (int)var24 + "," + (int)var193 + "," + (int)var121 + "," + (int)var36 + "," + (int)var119 + "," + (int)var343 + "," + (int)var292 + "," + (int)var38 + "," + (int)var64 + "," + (int)var187 + "," + (int)var130 + "," + (int)var120 + "," + (int)var315 + "," + (int)var357 + "," + (int)var111 + "," + (int)var4 + "," + (int)var251 + "," + (int)var32 + "," + (int)var35 + "," + (int)var276 + "," + (int)var266 + "," + (int)var304 + "," + (int)var169 + "," + (int)var75 + "," + (int)var330 + "," + (int)var96 + "," + (int)var126 + "," + (int)var321 + "," + (int)var222 + "," + (int)var290 + "," + (int)var350 + "," + (int)var198 + "," + (int)var254 + "," + (int)var105 + "," + (int)var309 + "," + (int)var323 + "," + (int)var91 + "," + (int)var71 + "," + (int)var211 + "," + (int)var225 + "," + (int)var17 + "," + (int)var300);
            IvParameterSpec llllllllllllllllllIIlllIIlllIIII = new IvParameterSpec(var338.getBytes());
            SecretKeySpec llllllllllllllllllIIlllIIllIllll = new SecretKeySpec(var342.getBytes(), llIIlIlllI[llIIlIllll[11]]);
            Cipher llllllllllllllllllIIlllIIllIlllI = Cipher.getInstance(llIIlIlllI[llIIlIllll[12]]);
            if (aN.lIlIlIlllllII(((String)var176).contains(llIIlIlllI[llIIlIllll[13]]) ? 1 : 0)) {
                var176 = ((String)var176).replace(llIIlIlllI[llIIlIllll[14]], llIIlIlllI[llIIlIllll[15]]);
            }
            URL var273 = new URL("https://highscores.squireplugins.com/updatequest.php?token=" + (String)var176);
            URLConnection var253 = var273.openConnection();
            var253.setRequestProperty(llIIlIlllI[llIIlIllll[16]], llIIlIlllI[llIIlIllll[17]]);
            var253.setDoOutput(llIIlIllll[1]);
            BufferedReader var142 = new BufferedReader(new InputStreamReader(var253.getInputStream()));
            var142.readLine();
            0;
            var142.close();
            return llIIlIllll[1];
        }
        catch (Exception exception) {
            return llIIlIllll[0];
        }
    }

    static {
        aN.lIlIlIllllIIl();
        aN.lIlIlIllllIII();
        pW = new WorldPoint(llIIlIllll[20], llIIlIllll[21], llIIlIllll[0]);
    }
}

