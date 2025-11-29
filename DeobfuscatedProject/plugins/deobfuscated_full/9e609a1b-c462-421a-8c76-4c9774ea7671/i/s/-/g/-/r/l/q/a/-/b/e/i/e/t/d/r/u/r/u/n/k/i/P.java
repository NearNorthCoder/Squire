/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
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

public class P
implements M {
    public static /* synthetic */ int jb;
    public static /* synthetic */ int jn;
    public static /* synthetic */ int iJ;
    public static /* synthetic */ int kj;
    public static /* synthetic */ int lC;
    public static /* synthetic */ int iQ;
    public static /* synthetic */ int kF;
    public static /* synthetic */ int jL;
    public static /* synthetic */ int jH;
    public static /* synthetic */ int kb;
    public static /* synthetic */ int kE;
    public static /* synthetic */ int iT;
    public static /* synthetic */ int jo;
    public static /* synthetic */ int lB;
    public static /* synthetic */ int jY;
    public static /* synthetic */ int iZ;
    public static /* synthetic */ int iE;
    public static /* synthetic */ int kc;
    public static /* synthetic */ int jz;
    public static /* synthetic */ int la;
    public static /* synthetic */ int iF;
    public static /* synthetic */ int iM;
    public static /* synthetic */ int lv;
    public static /* synthetic */ int jr;
    public static /* synthetic */ int lc;
    public static /* synthetic */ int kO;
    public static /* synthetic */ int ld;
    public static /* synthetic */ int ja;
    public static /* synthetic */ int lo;
    public static /* synthetic */ int kw;
    public static /* synthetic */ int lF;
    public static /* synthetic */ int jV;
    public static /* synthetic */ int iI;
    public static /* synthetic */ int ky;
    public static /* synthetic */ int lf;
    public static /* synthetic */ int lx;
    public static /* synthetic */ int ke;
    public static /* synthetic */ int iY;
    public static /* synthetic */ int jI;
    public static /* synthetic */ int kk;
    public static /* synthetic */ int jJ;
    public static /* synthetic */ int kh;
    public static /* synthetic */ int lu;
    public static /* synthetic */ int kB;
    public static /* synthetic */ int jD;
    public static /* synthetic */ int kS;
    public static /* synthetic */ int ls;
    public static /* synthetic */ int jl;
    public static /* synthetic */ int iU;
    public static /* synthetic */ int ju;
    public static /* synthetic */ int jx;
    public static /* synthetic */ int iw;
    public static /* synthetic */ int ku;
    public static /* synthetic */ int jX;
    public static /* synthetic */ int kf;
    public static /* synthetic */ int lE;
    public static /* synthetic */ int kV;
    public static /* synthetic */ int jh;
    public static /* synthetic */ int ly;
    public static /* synthetic */ int ln;
    public static /* synthetic */ int kC;
    public static /* synthetic */ int jS;
    public static /* synthetic */ int km;
    public static /* synthetic */ int lk;
    public static final /* synthetic */ WorldPoint it;
    public static /* synthetic */ int jR;
    public static /* synthetic */ int kI;
    public static /* synthetic */ int jB;
    public static /* synthetic */ int kK;
    public static /* synthetic */ int kt;
    private static /* synthetic */ String[] lIIIlllllIIII;
    public static /* synthetic */ int kT;
    public static /* synthetic */ int kl;
    public static /* synthetic */ int iK;
    public static /* synthetic */ int kG;
    public static /* synthetic */ int iR;
    public static /* synthetic */ int jq;
    public static /* synthetic */ int jE;
    public static /* synthetic */ int jm;
    public static /* synthetic */ int iu;
    public static /* synthetic */ int lh;
    public static /* synthetic */ int jj;
    public static /* synthetic */ int lw;
    public static /* synthetic */ int jM;
    public static /* synthetic */ int kU;
    public static /* synthetic */ int iC;
    public static /* synthetic */ int jA;
    public static /* synthetic */ int jN;
    public static /* synthetic */ int kY;
    public static /* synthetic */ int iD;
    public static /* synthetic */ int je;
    public static /* synthetic */ int jv;
    public static /* synthetic */ int lz;
    public static /* synthetic */ int ix;
    public static /* synthetic */ int jk;
    public static /* synthetic */ int kq;
    public static /* synthetic */ int jg;
    public static /* synthetic */ int ll;
    public static /* synthetic */ int lm;
    public static /* synthetic */ int iX;
    public static /* synthetic */ int jd;
    public static /* synthetic */ int kQ;
    public static /* synthetic */ int lg;
    public static /* synthetic */ int jQ;
    public static /* synthetic */ int jO;
    public static /* synthetic */ int js;
    public static /* synthetic */ int jp;
    public static /* synthetic */ int kA;
    public static /* synthetic */ int kr;
    public static /* synthetic */ int kz;
    public static /* synthetic */ int ki;
    public static /* synthetic */ int kW;
    public static /* synthetic */ int iV;
    public static /* synthetic */ int jP;
    static /* synthetic */ long lG;
    public static /* synthetic */ int iO;
    public static /* synthetic */ int kM;
    public static /* synthetic */ int iW;
    public static /* synthetic */ int kx;
    public static /* synthetic */ int iv;
    public static /* synthetic */ int iL;
    public static /* synthetic */ int jt;
    public static /* synthetic */ int li;
    public static /* synthetic */ int iA;
    private static /* synthetic */ int[] lIIIlllllIIIl;
    public static /* synthetic */ int ks;
    public static /* synthetic */ int jK;
    public static /* synthetic */ int kH;
    public static /* synthetic */ int lr;
    public static /* synthetic */ int kn;
    public static /* synthetic */ int jc;
    public static /* synthetic */ int iN;
    public static /* synthetic */ int jF;
    public static /* synthetic */ int kN;
    public static /* synthetic */ int lA;
    public static /* synthetic */ int le;
    public static /* synthetic */ int kv;
    public static /* synthetic */ int jW;
    public static /* synthetic */ int iG;
    public static /* synthetic */ int jC;
    public static /* synthetic */ int lt;
    public static /* synthetic */ int lp;
    public static /* synthetic */ int iy;
    public static /* synthetic */ int jT;
    public static /* synthetic */ int iP;
    public static /* synthetic */ int lq;
    public static /* synthetic */ int lD;
    public static /* synthetic */ int lb;
    public static /* synthetic */ int jy;
    public static /* synthetic */ int ji;
    public static /* synthetic */ int kD;
    public static /* synthetic */ int iB;
    public static /* synthetic */ int iS;
    public static /* synthetic */ int iz;
    public static /* synthetic */ int lj;
    public static /* synthetic */ int iH;
    public static /* synthetic */ int kZ;
    public static /* synthetic */ int kd;
    public static /* synthetic */ int jG;
    public static /* synthetic */ int kP;
    public static /* synthetic */ int jw;
    public static /* synthetic */ int ka;
    public static /* synthetic */ int kp;
    public static /* synthetic */ int jf;
    public static /* synthetic */ int jU;
    public static /* synthetic */ int kR;
    public static /* synthetic */ int jZ;
    public static /* synthetic */ int kL;
    public static /* synthetic */ int kJ;
    public static /* synthetic */ int kg;
    public static /* synthetic */ int kX;
    public static /* synthetic */ int ko;

    @Override
    public String Z() {
        return lIIIlllllIIII[lIIIlllllIIIl[19]];
    }

    private static String lIlIIllIIIlIlll(String var276, String var151) {
        var276 = new String(Base64.getDecoder().decode(var276.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var96 = new StringBuilder();
        char[] var110 = var151.toCharArray();
        int var286 = lIIIlllllIIIl[0];
        char[] var70 = var276.toCharArray();
        int var256 = var70.length;
        int var335 = lIIIlllllIIIl[0];
        while (P.lIlIIllIIIllllI(var335, var256)) {
            char var124 = var70[var335];
            var96.append((char)(var124 ^ var110[var286 % var110.length]));
            0;
            ++var286;
            ++var335;
            0;
            
            return null;
        }
        return String.valueOf(var96);
    }

    private static boolean lIlIIllIIIllIll(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean b(String string, long l2, String string2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n23, int n24, int n25, int n26, int n27, int n28, int n29, int n30, int n31, int n32, int n33, int n34, int n35, int n36, int n37, int n38, int n39, int n40, int n41, int n42, int n43, int n44, int n45, int n46, int n47, int n48, int n49, int n50, int n51, int n52, int n53, int n54, int n55, int n56, int n57, int n58, int n59, int n60, int n61, int n62, int n63, int n64, int n65, int n66, int n67, int n68, int n69, int n70, int n71, int n72, int n73, int n74, int n75, int n76, int n77, int n78, int n79, int n80, int n81, int n82, int n83, int n84, int n85, int n86, int n87, int n88, int n89, int n90, int n91, int n92, int n93, int n94, int n95, int n96, int n97, int n98, int n99, int n100, int n101, int n102, int n103, int n104, int n105, int n106, int n107, int n108, int n109, int n110, int n111, int n112, int n113, int n114, int n115, int n116, int n117, int n118, int n119, int n120, int n121, int n122, int n123, int n124, int n125, int n126, int n127, int n128, int n129, int n130, int n131, int n132, int n133, int n134, int n135, int n136, int n137, int n138, int n139, int n140, int n141, int n142, int n143, int n144, int n145, int n146, int n147, int n148, int n149, int n150, int n151, int n152, int n153, int n154, int n155, int n156, int n157, int n158, int n159, int n160, int n161, int n162, int n163, int n164, int n165, int n166, int n167, int n168, int n169) {
        String var297;
        long var200;
        if (P.lIlIIllIIIllIll(P.lIlIIllIIIlllIl(l2, 660000L))) {
            var200 = 100L;
        }
        String var7 = lIIIlllllIIII[lIIIlllllIIIl[9]];
        String var47 = lIIIlllllIIII[lIIIlllllIIIl[10]];
        String var132 = var297;
        try {
            void var14;
            void var243;
            void var248;
            void var55;
            void var159;
            void var68;
            void var112;
            void var143;
            void var184;
            void var307;
            void var361;
            void var240;
            void var232;
            void var351;
            void var357;
            void var260;
            void var347;
            void var299;
            void var314;
            void var186;
            void var288;
            void var183;
            void var192;
            void var165;
            void var73;
            void var21;
            void var177;
            void var313;
            void var41;
            void var209;
            void var134;
            void var162;
            void var203;
            void var4;
            void var290;
            void var105;
            void var206;
            void var309;
            void var119;
            void var303;
            void var319;
            void var257;
            void var312;
            void var167;
            void var264;
            void var294;
            void var44;
            void var1;
            void var365;
            void var207;
            void var277;
            void var221;
            void var176;
            void var271;
            void var249;
            void var123;
            void var211;
            void var371;
            void var66;
            void var196;
            void var113;
            void var109;
            void var220;
            void var131;
            void var341;
            void var36;
            void var149;
            void var376;
            void var251;
            void var326;
            void var270;
            void var255;
            void var316;
            void var93;
            void var289;
            void var236;
            void var280;
            void var31;
            void var201;
            void var321;
            void var336;
            void var353;
            void var210;
            void var355;
            void var320;
            void var64;
            void var27;
            void var89;
            void var107;
            void var329;
            void var223;
            void var215;
            void var375;
            void var153;
            void var79;
            void var283;
            void var274;
            void var356;
            void var142;
            void var322;
            void var156;
            void var92;
            void var11;
            void var26;
            void var101;
            void var8;
            void var369;
            void var302;
            void var318;
            void var267;
            void var172;
            void var327;
            void var83;
            void var51;
            void var194;
            void var247;
            void var218;
            void var189;
            void var239;
            void var265;
            void var57;
            void var72;
            void var82;
            void var370;
            void var85;
            void var181;
            void var224;
            void var38;
            void var250;
            void var54;
            void var310;
            void var86;
            void var161;
            void var296;
            void var301;
            void var58;
            void var56;
            void var127;
            void var235;
            void var97;
            void var180;
            void var217;
            void var367;
            void var338;
            void var84;
            void var35;
            void var354;
            void var362;
            void var5;
            void var204;
            void var285;
            void var298;
            void var6;
            void var179;
            void var195;
            void var173;
            void var32;
            void var268;
            void var154;
            void var360;
            void var128;
            void var148;
            void var75;
            void var88;
            void var324;
            void var33;
            void var227;
            void var233;
            void var339;
            Object var272 = var47 + "," + var132 + "," + (String)var339 + "," + var200 + "," + (int)var233 + "," + (int)var227 + "," + (int)var33 + "," + (int)var324 + "," + (int)var88 + "," + (int)var75 + "," + (int)var148 + "," + (int)var128 + "," + (int)var360 + "," + (int)var154 + "," + (int)var268 + "," + (int)var32 + "," + (int)var173 + "," + (int)var195 + "," + (int)var179 + "," + (int)var6 + "," + (int)var298 + "," + (int)var285 + "," + (int)var204 + "," + (int)var5 + "," + (int)var362 + "," + (int)var354 + "," + (int)var35 + "," + (int)var84 + "," + (int)var338 + "," + (int)var367 + "," + (int)var217 + "," + (int)var180 + "," + (int)var97 + "," + (int)var235 + "," + (int)var127 + "," + (int)var56 + "," + (int)var58 + "," + (int)var301 + "," + (int)var296 + "," + (int)var161 + "," + (int)var86 + "," + (int)var310 + "," + (int)var54 + "," + (int)var250 + "," + (int)var38 + "," + (int)var224 + "," + (int)var181 + "," + (int)var85 + "," + (int)var370 + "," + (int)var82 + "," + (int)var72 + "," + (int)var57 + "," + (int)var265 + "," + (int)var239 + "," + (int)var189 + "," + (int)var218 + "," + (int)var247 + "," + (int)var194 + "," + (int)var51 + "," + (int)var83 + "," + (int)var327 + "," + (int)var172 + "," + (int)var267 + "," + (int)var318 + "," + (int)var302 + "," + (int)var369 + "," + (int)var8 + "," + (int)var101 + "," + (int)var26 + "," + (int)var11 + "," + (int)var92 + "," + (int)var156 + "," + (int)var322 + "," + (int)var142 + "," + (int)var356 + "," + (int)var274 + "," + (int)var283 + "," + (int)var79 + "," + (int)var153 + "," + (int)var375 + "," + (int)var215 + "," + (int)var223 + "," + (int)var329 + "," + (int)var107 + "," + (int)var89 + "," + (int)var27 + "," + (int)var64 + "," + (int)var320 + "," + (int)var355 + "," + (int)var210 + "," + (int)var353 + "," + (int)var336 + "," + (int)var321 + "," + (int)var201 + "," + (int)var31 + "," + (int)var280 + "," + (int)var236 + "," + (int)var289 + "," + (int)var93 + "," + ((int)var316 + "," + (int)var255 + "," + (int)var270 + "," + (int)var326 + "," + (int)var251 + "," + (int)var376 + "," + (int)var149 + "," + (int)var36 + "," + (int)var341 + "," + (int)var131 + "," + (int)var220 + "," + (int)var109 + "," + (int)var113 + "," + (int)var196 + "," + (int)var66 + "," + (int)var371 + "," + (int)var211 + "," + (int)var123 + "," + (int)var249 + "," + (int)var271 + "," + (int)var176 + "," + (int)var221 + "," + (int)var277 + "," + (int)var207 + "," + (int)var365 + "," + (int)var1 + "," + (int)var44 + "," + (int)var294 + "," + (int)var264 + "," + (int)var167 + "," + (int)var312 + "," + (int)var257 + "," + (int)var319 + "," + (int)var303 + "," + (int)var119 + "," + (int)var309 + "," + (int)var206 + "," + (int)var105 + "," + (int)var290 + "," + (int)var4 + "," + (int)var203 + "," + (int)var162 + "," + (int)var134 + "," + (int)var209 + "," + (int)var41 + "," + (int)var313 + "," + (int)var177 + "," + (int)var21 + "," + (int)var73 + "," + (int)var165 + "," + (int)var192 + "," + (int)var183 + "," + (int)var288 + "," + (int)var186 + "," + (int)var314 + "," + (int)var299 + "," + (int)var347 + "," + (int)var260 + "," + (int)var357 + "," + (int)var351 + "," + (int)var232 + "," + (int)var240 + "," + (int)var361 + "," + (int)var307 + "," + (int)var184 + "," + (int)var143 + "," + (int)var112 + "," + (int)var68 + "," + (int)var159 + "," + (int)var55 + "," + (int)var248 + "," + (int)var243 + "," + (int)var14);
            IvParameterSpec lllllllllllllllIIIIIIIlIlIIIllIl = new IvParameterSpec(var47.getBytes());
            SecretKeySpec lllllllllllllllIIIIIIIlIlIIIllII = new SecretKeySpec(var7.getBytes(), lIIIlllllIIII[lIIIlllllIIIl[11]]);
            Cipher lllllllllllllllIIIIIIIlIlIIIlIll = Cipher.getInstance(lIIIlllllIIII[lIIIlllllIIIl[12]]);
            if (P.lIlIIllIIIlllII(((String)var272).contains(lIIIlllllIIII[lIIIlllllIIIl[13]]) ? 1 : 0)) {
                var272 = ((String)var272).replace(lIIIlllllIIII[lIIIlllllIIIl[14]], lIIIlllllIIII[lIIIlllllIIIl[15]]);
            }
            URL var20 = new URL("https://highscores.squireplugins.com/updatequest.php?token=" + (String)var272);
            URLConnection var61 = var20.openConnection();
            var61.setRequestProperty(lIIIlllllIIII[lIIIlllllIIIl[16]], lIIIlllllIIII[lIIIlllllIIIl[17]]);
            var61.setDoOutput(lIIIlllllIIIl[1]);
            BufferedReader var350 = new BufferedReader(new InputStreamReader(var61.getInputStream()));
            var350.readLine();
            0;
            var350.close();
            return lIIIlllllIIIl[1];
        }
        catch (Exception exception) {
            return lIIIlllllIIIl[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string, long l2, String string2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n23, int n24, int n25, int n26, int n27, int n28, int n29, int n30, int n31, int n32, int n33, int n34, int n35, int n36, int n37, int n38, int n39, int n40, int n41, int n42, int n43, int n44, int n45, int n46, int n47, int n48, int n49, int n50, int n51, int n52, int n53, int n54, int n55, int n56, int n57, int n58, int n59, int n60, int n61, int n62, int n63, int n64, int n65, int n66, int n67, int n68, int n69, int n70, int n71, int n72, int n73, int n74, int n75, int n76, int n77, int n78, int n79, int n80, int n81, int n82, int n83, int n84, int n85, int n86, int n87, int n88, int n89, int n90, int n91, int n92, int n93, int n94, int n95, int n96, int n97, int n98, int n99, int n100, int n101, int n102, int n103, int n104, int n105, int n106, int n107, int n108, int n109, int n110, int n111, int n112, int n113, int n114, int n115, int n116, int n117, int n118, int n119, int n120, int n121, int n122, int n123, int n124, int n125, int n126, int n127, int n128, int n129, int n130, int n131, int n132, int n133, int n134, int n135, int n136, int n137, int n138, int n139, int n140, int n141, int n142, int n143, int n144, int n145, int n146, int n147, int n148, int n149, int n150, int n151, int n152, int n153, int n154, int n155, int n156, int n157, int n158, int n159, int n160, int n161, int n162, int n163, int n164, int n165, int n166, int n167, int n168, int n169) {
        String var193;
        long var94;
        if (P.lIlIIllIIIllIll(P.lIlIIllIIIllIlI(l2, 660000L))) {
            var94 = 100L;
        }
        String var366 = lIIIlllllIIII[lIIIlllllIIIl[0]];
        String var152 = lIIIlllllIIII[lIIIlllllIIIl[1]];
        String var352 = var193;
        try {
            void var263;
            void var231;
            void var144;
            void var91;
            void var188;
            void var291;
            void var65;
            void var17;
            void var332;
            void var187;
            void var228;
            void var122;
            void var22;
            void var139;
            void var171;
            void var315;
            void var114;
            void var126;
            void var214;
            void var226;
            void var234;
            void var190;
            void var287;
            void var78;
            void var328;
            void var325;
            void var337;
            void var343;
            void var373;
            void var104;
            void var346;
            void var18;
            void var174;
            void var145;
            void var330;
            void var269;
            void var293;
            void var261;
            void var311;
            void var108;
            void var169;
            void var115;
            void var52;
            void var253;
            void var136;
            void var348;
            void var317;
            void var15;
            void var300;
            void var25;
            void var374;
            void var368;
            void var118;
            void var199;
            void var254;
            void var87;
            void var9;
            void var12;
            void var198;
            void var137;
            void var59;
            void var292;
            void var80;
            void var205;
            void var116;
            void var106;
            void var308;
            void var74;
            void var191;
            void var219;
            void var67;
            void var34;
            void var279;
            void var146;
            void var135;
            void var50;
            void var60;
            void var340;
            void var295;
            void var282;
            void var331;
            void var63;
            void var19;
            void var111;
            void var225;
            void var158;
            void var120;
            void var129;
            void var28;
            void var306;
            void var275;
            void var182;
            void var246;
            void var334;
            void var49;
            void var102;
            void var345;
            void var10;
            void var157;
            void var76;
            void var103;
            void var185;
            void var178;
            void var2;
            void var53;
            void var197;
            void var349;
            void var62;
            void var284;
            void var163;
            void var245;
            void var304;
            void var364;
            void var333;
            void var48;
            void var121;
            void var40;
            void var147;
            void var37;
            void var100;
            void var39;
            void var216;
            void var262;
            void var258;
            void var130;
            void var208;
            void var230;
            void var42;
            void var150;
            void var23;
            void var29;
            void var95;
            void var164;
            void var202;
            void var281;
            void var43;
            void var342;
            void var212;
            void var45;
            void var13;
            void var305;
            void var166;
            void var141;
            void var24;
            void var168;
            void var359;
            void var133;
            void var138;
            void var117;
            void var90;
            void var69;
            void var213;
            void var363;
            void var238;
            void var273;
            void var140;
            void var237;
            void var175;
            void var46;
            void var16;
            void var266;
            void var81;
            void var3;
            void var99;
            void var125;
            void var252;
            void var259;
            void var358;
            void var222;
            Object var155 = var152 + "," + var352 + "," + (String)var222 + "," + var94 + "," + (int)var358 + "," + (int)var259 + "," + (int)var252 + "," + (int)var125 + "," + (int)var99 + "," + (int)var3 + "," + (int)var81 + "," + (int)var266 + "," + (int)var16 + "," + (int)var46 + "," + (int)var175 + "," + (int)var237 + "," + (int)var140 + "," + (int)var273 + "," + (int)var238 + "," + (int)var363 + "," + (int)var213 + "," + (int)var69 + "," + (int)var90 + "," + (int)var117 + "," + (int)var138 + "," + (int)var133 + "," + (int)var359 + "," + (int)var168 + "," + (int)var24 + "," + (int)var141 + "," + (int)var166 + "," + (int)var305 + "," + (int)var13 + "," + (int)var45 + "," + (int)var212 + "," + (int)var342 + "," + (int)var43 + "," + (int)var281 + "," + (int)var202 + "," + (int)var164 + "," + (int)var95 + "," + (int)var29 + "," + (int)var23 + "," + (int)var150 + "," + (int)var42 + "," + (int)var230 + "," + (int)var208 + "," + (int)var130 + "," + (int)var258 + "," + (int)var262 + "," + (int)var216 + "," + (int)var39 + "," + (int)var100 + "," + (int)var37 + "," + (int)var147 + "," + (int)var40 + "," + (int)var121 + "," + (int)var48 + "," + (int)var333 + "," + (int)var364 + "," + (int)var304 + "," + (int)var245 + "," + (int)var163 + "," + (int)var284 + "," + (int)var62 + "," + (int)var349 + "," + (int)var197 + "," + (int)var53 + "," + (int)var2 + "," + (int)var178 + "," + (int)var185 + "," + (int)var103 + "," + (int)var76 + "," + (int)var157 + "," + (int)var10 + "," + (int)var345 + "," + (int)var102 + "," + (int)var49 + "," + (int)var334 + "," + (int)var246 + "," + (int)var182 + "," + (int)var275 + "," + (int)var306 + "," + (int)var28 + "," + (int)var129 + "," + (int)var120 + "," + (int)var158 + "," + (int)var225 + "," + (int)var111 + "," + (int)var19 + "," + (int)var63 + "," + (int)var331 + "," + (int)var282 + "," + (int)var295 + "," + (int)var340 + "," + (int)var60 + "," + (int)var50 + "," + (int)var135 + "," + (int)var146 + "," + ((int)var279 + "," + (int)var34 + "," + (int)var67 + "," + (int)var219 + "," + (int)var191 + "," + (int)var74 + "," + (int)var308 + "," + (int)var106 + "," + (int)var116 + "," + (int)var205 + "," + (int)var80 + "," + (int)var292 + "," + (int)var59 + "," + (int)var137 + "," + (int)var198 + "," + (int)var12 + "," + (int)var9 + "," + (int)var87 + "," + (int)var254 + "," + (int)var199 + "," + (int)var118 + "," + (int)var368 + "," + (int)var374 + "," + (int)var25 + "," + (int)var300 + "," + (int)var15 + "," + (int)var317 + "," + (int)var348 + "," + (int)var136 + "," + (int)var253 + "," + (int)var52 + "," + (int)var115 + "," + (int)var169 + "," + (int)var108 + "," + (int)var311 + "," + (int)var261 + "," + (int)var293 + "," + (int)var269 + "," + (int)var330 + "," + (int)var145 + "," + (int)var174 + "," + (int)var18 + "," + (int)var346 + "," + (int)var104 + "," + (int)var373 + "," + (int)var343 + "," + (int)var337 + "," + (int)var325 + "," + (int)var328 + "," + (int)var78 + "," + (int)var287 + "," + (int)var190 + "," + (int)var234 + "," + (int)var226 + "," + (int)var214 + "," + (int)var126 + "," + (int)var114 + "," + (int)var315 + "," + (int)var171 + "," + (int)var139 + "," + (int)var22 + "," + (int)var122 + "," + (int)var228 + "," + (int)var187 + "," + (int)var332 + "," + (int)var17 + "," + (int)var65 + "," + (int)var291 + "," + (int)var188 + "," + (int)var91 + "," + (int)var144 + "," + (int)var231 + "," + (int)var263 + ",1");
            IvParameterSpec lllllllllllllllIIIIIIIllllllIlll = new IvParameterSpec(var152.getBytes());
            SecretKeySpec lllllllllllllllIIIIIIIllllllIllI = new SecretKeySpec(var366.getBytes(), lIIIlllllIIII[lIIIlllllIIIl[2]]);
            Cipher lllllllllllllllIIIIIIIllllllIlIl = Cipher.getInstance(lIIIlllllIIII[lIIIlllllIIIl[3]]);
            if (P.lIlIIllIIIlllII(((String)var155).contains(lIIIlllllIIII[lIIIlllllIIIl[4]]) ? 1 : 0)) {
                var155 = ((String)var155).replace(lIIIlllllIIII[lIIIlllllIIIl[5]], lIIIlllllIIII[lIIIlllllIIIl[6]]);
            }
            URL var229 = new URL("http://godscripting.com/stats/input.php?token=" + (String)var155);
            URLConnection var30 = var229.openConnection();
            var30.setRequestProperty(lIIIlllllIIII[lIIIlllllIIIl[7]], lIIIlllllIIII[lIIIlllllIIIl[8]]);
            var30.setDoOutput(lIIIlllllIIIl[1]);
            BufferedReader var160 = new BufferedReader(new InputStreamReader(var30.getInputStream()));
            var160.readLine();
            0;
            var160.close();
            return lIIIlllllIIIl[1];
        }
        catch (Exception exception) {
            return lIIIlllllIIIl[0];
        }
    }

    private static String lIlIIllIIIlIlIl(String var244, String var372) {
        try {
            SecretKeySpec var344 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var372.getBytes(StandardCharsets.UTF_8)), lIIIlllllIIIl[8]), "DES");
            Cipher var98 = Cipher.getInstance("DES");
            var98.init(lIIIlllllIIIl[2], var344);
            return new String(var98.doFinal(Base64.getDecoder().decode(var244.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var170) {
            var170.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean X() {
        return lIIIlllllIIIl[1];
    }

    @Override
    public boolean aa() {
        return lIIIlllllIIIl[0];
    }

    public static void cO() {
    }

    private static String lIlIIllIIIlIllI(String var71, String var278) {
        try {
            SecretKeySpec var77 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var278.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var242 = Cipher.getInstance("Blowfish");
            var242.init(lIIIlllllIIIl[2], var77);
            return new String(var242.doFinal(Base64.getDecoder().decode(var71.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var323) {
            var323.printStackTrace();
            return null;
        }
    }

    private static int lIlIIllIIIllIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIlIIllIIIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        P.lIlIIllIIIllIIl();
        P.lIlIIllIIIllIII();
        it = new WorldPoint(lIIIlllllIIIl[20], lIIIlllllIIIl[21], lIIIlllllIIIl[0]);
    }

    @Override
    public int Y() {
        try {
            P.cO();
            0;
        }
        catch (Exception var241) {
            var241.printStackTrace();
        }
        
        }
        return lIIIlllllIIIl[18];
    }

    public static void d(String string) {
        long l2 = (System.currentTimeMillis() - AccBuilderRat.b) / 1000L;
        long l3 = Math.abs(l2 - lG / 1000L);
        P.a(string, l3, null, iu, iv, iw, ix, iy, iz, iA, iB, iC, iD, iE, iF, iG, iH, iI, iJ, iK, iL, iM, iN, iO, iP, iQ, iR, iS, iT, iU, iV, iW, iX, iY, iZ, ja, jb, jc, jd, je, jf, jg, jh, ji, jj, jk, jl, jm, jn, jo, jp, jq, jr, js, jt, ju, jv, jw, jx, jy, jz, jA, jB, jC, jD, jE, jF, jG, jH, jI, jJ, jK, jL, jM, jN, jO, jP, jQ, jR, jS, jT, jU, jV, jW, jX, jY, jZ, ka, kb, kc, kd, ke, kf, kg, kh, ki, kj, kk, kl, km, kn, ko, kp, kq, kr, ks, kt, ku, kv, kw, kx, ky, kz, kA, kB, kC, kD, kE, kF, kG, kH, kI, kJ, kK, kL, kM, kN, kO, kP, kQ, kR, kS, kT, kU, kV, kW, kX, kY, kZ, la, lb, lc, ld, le, lf, lg, lh, li, lj, lk, ll, lm, ln, lo, lp, lq, lr, ls, lt, lu, lv, lw, lx, ly, lz, lA, lB, lC, lD, lE, lF);
        0;
        P.b(String.valueOf(string), l3, null, iu, iv, iw, ix, iy, iz, iA, iB, iC, iD, iE, iF, iG, iH, iI, iJ, iK, iL, iM, iN, iO, iP, iQ, iR, iS, iT, iU, iV, iW, iX, iY, iZ, ja, jb, jc, jd, je, jf, jg, jh, ji, jj, jk, jl, jm, jn, jo, jp, jq, jr, js, jt, ju, jv, jw, jx, jy, jz, jA, jB, jC, jD, jE, jF, jG, jH, jI, jJ, jK, jL, jM, jN, jO, jP, jQ, jR, jS, jT, jU, jV, jW, jX, jY, jZ, ka, kb, kc, kd, ke, kf, kg, kh, ki, kj, kk, kl, km, kn, ko, kp, kq, kr, ks, kt, ku, kv, kw, kx, ky, kz, kA, kB, kC, kD, kE, kF, kG, kH, kI, kJ, kK, kL, kM, kN, kO, kP, kQ, kR, kS, kT, kU, kV, kW, kX, kY, kZ, la, lb, lc, ld, le, lf, lg, lh, li, lj, lk, ll, lm, ln, lo, lp, lq, lr, ls, lt, lu, lv, lw, lx, ly, lz, lA, lB, lC, lD, lE, lF);
        0;
        lG = System.currentTimeMillis() - AccBuilderRat.b;
    }

    private static void lIlIIllIIIllIII() {
        lIIIlllllIIII = new String[lIIIlllllIIIl[22]];
        P.lIIIlllllIIII[P.lIIIlllllIIIl[0]] = P."1234567891234567";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[1]] = P."1234567891234568";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[2]] = P."AES";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[3]] = P."AES/CBC/PKCS5Padding";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[4]] = P." ";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[5]] = P." ";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[6]] = P."%20";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[7]] = P."User-Agent";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[8]] = P."Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2.13) Gecko/20101203 Firefox/3.6.13 (.NET CLR 3.5.30729)";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[9]] = P."1234567891234567";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[10]] = P."1234567891234568";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[11]] = P."AES";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[12]] = P."AES/CBC/PKCS5Padding";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[13]] = P." ";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[14]] = P." ";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[15]] = P."%20";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[16]] = P."User-Agent";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[17]] = P."Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2.13) Gecko/20101203 Firefox/3.6.13 (.NET CLR 3.5.30729)";
        P.lIIIlllllIIII[P.lIIIlllllIIIl[19]] = P."Testing";
    }

    private static void lIlIIllIIIllIIl() {
        lIIIlllllIIIl = new int[23];
        P.lIIIlllllIIIl[0] = (0x7C ^ 0x75) & ~(0x38 ^ 0x31);
        P.lIIIlllllIIIl[1] = 1;
        P.lIIIlllllIIIl[2] = 2;
        P.lIIIlllllIIIl[3] = 3;
        P.lIIIlllllIIIl[4] = 0x64 ^ 0x60;
        P.lIIIlllllIIIl[5] = 0xBD ^ 0xB8;
        P.lIIIlllllIIIl[6] = 0x69 ^ 0x41 ^ (0x14 ^ 0x3A);
        P.lIIIlllllIIIl[7] = 0x95 ^ 0x92;
        P.lIIIlllllIIIl[8] = 0x3D ^ 0x35;
        P.lIIIlllllIIIl[9] = 0x75 ^ 0x7C;
        P.lIIIlllllIIIl[10] = 0xB5 ^ 0xBF;
        P.lIIIlllllIIIl[11] = 0xDC ^ 0x8C ^ (9 ^ 0x52);
        P.lIIIlllllIIIl[12] = 0x10 ^ 0x1C;
        P.lIIIlllllIIIl[13] = 0xF ^ 0x55 ^ (0xEE ^ 0xB9);
        P.lIIIlllllIIIl[14] = 0xAC ^ 0xA2;
        P.lIIIlllllIIIl[15] = 0x57 ^ 0x58;
        P.lIIIlllllIIIl[16] = 0xD ^ 0x1D;
        P.lIIIlllllIIIl[17] = 28 + 107 - 19 + 56 ^ 115 + 23 - -20 + 31;
        P.lIIIlllllIIIl[18] = 0xFFFFB3EC & 0x4FFB;
        P.lIIIlllllIIIl[19] = 0xA2 ^ 0xB0;
        P.lIIIlllllIIIl[20] = -(0xFFFFD7A3 & 0x2B7D) & (0xFFFF9FFD & 0x6F7F);
        P.lIIIlllllIIIl[21] = 0xFFFFDF9F & 0x2DFF;
        P.lIIIlllllIIIl[22] = 0x10 ^ 3;
    }

    private static int lIlIIllIIIlllIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

