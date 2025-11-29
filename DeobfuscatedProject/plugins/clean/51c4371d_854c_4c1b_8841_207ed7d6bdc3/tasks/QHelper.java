/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.account.AccBuilderBarrows;
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

public class QHelper
implements F {
    public static  int lt;
    public static  int lF;
    public static  int jT;
    static  long mF;
    public static  int md;
    public static  int jM;
    public static  int mA;
    public static  int jI;
    public static  int kE;
    public static  int lW;
    public static  int lj;
    public static  int li;
    public static  int kM;
    public static  int kf;
    public static  int lK;
    public static  int jt;
    public static  int kz;
    public static  int mi;
    public static  int lm;
    public static  int mw;
    public static  int kG;
    public static  int kA;
    public static  int lT;
    public static  int mc;
    public static  int kY;
    public static  int ko;
    public static  int jP;
    public static final  WorldPoint js;
    public static  int lM;
    public static  int jW;
    public static  int kb;
    public static  int kO;
    public static  int ln;
    public static  int kQ;
    public static  int lv;
    public static  int lc;
    public static  int jB;
    public static  int kL;
    public static  int kw;
    public static  int ma;
    public static  int jQ;
    public static  int kJ;
    public static  int kS;
    public static  int lH;
    public static  int lX;
    public static  int ml;
    public static  int mC;
    public static  int lo;
    public static  int mv;
    public static  int lL;
    public static  int kq;
    public static  int lS;
    public static  int mB;
    public static  int jD;
    public static  int mn;
    public static  int lx;
    public static  int mf;
    public static  int ki;
    public static  int lq;
    public static  int jZ;
    public static  int kt;
    public static  int kK;
    public static  int ld;
    public static  int jN;
    public static  int lD;
    public static  int mb;
    public static  int lw;
    public static  int kc;
    public static  int jw;
    public static  int jA;
    public static  int mx;
    public static  int lz;
    public static  int jG;
    public static  int kv;
    public static  int jz;
    public static  int ly;
    public static  int kj;
    public static  int mu;
    public static  int me;
    public static  int kP;
    public static  int lh;
    public static  int lV;
    public static  int lu;
    public static  int kX;
    public static  int kD;
    public static  int kR;
    public static  int kN;
    public static  int lQ;
    public static  int lG;
    public static  int lP;
    public static  int kV;
    public static  int jX;
    public static  int lr;
    public static  int mo;
    public static  int lO;
    public static  int kr;
    public static  int ku;
    public static  int mz;
    public static  int jK;
    public static  int ju;
    public static  int ls;
    public static  int jE;
    public static  int jR;
    public static  int lZ;
    public static  int jY;
    public static  int jU;
    public static  int jJ;
    public static  int jL;
    public static  int lR;
    
    public static  int km;
    public static  int kx;
    public static  int kh;
    public static  int jx;
    public static  int jC;
    public static  int lU;
    public static  int jv;
    public static  int ms;
    public static  int kp;
    public static  int my;
    public static  int jS;
    public static  int lI;
    public static  int kW;
    public static  int lf;
    public static  int ky;
    public static  int lA;
    public static  int mg;
    public static  int kn;
    public static  int lY;
    public static  int kH;
    public static  int jF;
    public static  int mr;
    public static  int mh;
    public static  int lJ;
    public static  int jH;
    public static  int mj;
    public static  int mE;
    public static  int lB;
    public static  int mq;
    public static  int lN;
    public static  int kB;
    public static  int mm;
    public static  int lC;
    public static  int jy;
    public static  int kd;
    public static  int mt;
    public static  int ke;
    public static  int mD;
    public static  int mk;
    public static  int kZ;
    public static  int kC;
    public static  int lb;
    
    public static  int kl;
    public static  int le;
    public static  int ll;
    public static  int lE;
    public static  int kk;
    public static  int kg;
    public static  int jV;
    public static  int kT;
    public static  int ks;
    public static  int lp;
    public static  int mp;
    public static  int ka;
    public static  int kI;
    public static  int lg;
    public static  int kU;
    public static  int kF;
    public static  int lk;
    public static  int la;
    public static  int jO;

    private static int lIIlIlIIlIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIIlIlIIIll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean W() {
        return lIllIIIl[0];
    }

    private static boolean lIIlIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean T() {
        return lIllIIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean b(String string, long l2, String string2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n23, int n24, int n25, int n26, int n27, int n28, int n29, int n30, int n31, int n32, int n33, int n34, int n35, int n36, int n37, int n38, int n39, int n40, int n41, int n42, int n43, int n44, int n45, int n46, int n47, int n48, int n49, int n50, int n51, int n52, int n53, int n54, int n55, int n56, int n57, int n58, int n59, int n60, int n61, int n62, int n63, int n64, int n65, int n66, int n67, int n68, int n69, int n70, int n71, int n72, int n73, int n74, int n75, int n76, int n77, int n78, int n79, int n80, int n81, int n82, int n83, int n84, int n85, int n86, int n87, int n88, int n89, int n90, int n91, int n92, int n93, int n94, int n95, int n96, int n97, int n98, int n99, int n100, int n101, int n102, int n103, int n104, int n105, int n106, int n107, int n108, int n109, int n110, int n111, int n112, int n113, int n114, int n115, int n116, int n117, int n118, int n119, int n120, int n121, int n122, int n123, int n124, int n125, int n126, int n127, int n128, int n129, int n130, int n131, int n132, int n133, int n134, int n135, int n136, int n137, int n138, int n139, int n140, int n141, int n142, int n143, int n144, int n145, int n146, int n147, int n148, int n149, int n150, int n151, int n152, int n153, int n154, int n155, int n156, int n157, int n158, int n159, int n160, int n161, int n162, int n163, int n164, int n165, int n166, int n167, int n168, int n169) {
        String lIllIlIlllIlIIl;
        long lIllIlIlllIlIII;
        if (Q.lIIlIlIIIll(Q.lIIlIlIIlIl(l2, 660000L))) {
            lIllIlIlllIlIII = 100L;
        }
        String lIllIlIIIlllllI = lIlIlllI[lIllIIIl[9]];
        String lIllIlIIIllllIl = lIlIlllI[lIllIIIl[10]];
        String lIllIlIIIllllII = lIllIlIlllIlIIl;
        try {
            void lIllIlIIIllllll;
            void lIllIlIIlIIIIII;
            void lIllIlIIlIIIIIl;
            void lIllIlIIlIIIIlI;
            void lIllIlIIlIIIIll;
            void lIllIlIIlIIIlII;
            void lIllIlIIlIIIlIl;
            void lIllIlIIlIIIllI;
            void lIllIlIIlIIIlll;
            void lIllIlIIlIIlIII;
            void lIllIlIIlIIlIIl;
            void lIllIlIIlIIlIlI;
            void lIllIlIIlIIlIll;
            void lIllIlIIlIIllII;
            void lIllIlIIlIIllIl;
            void lIllIlIIlIIlllI;
            void lIllIlIIlIIllll;
            void lIllIlIIlIlIIII;
            void lIllIlIIlIlIIIl;
            void lIllIlIIlIlIIlI;
            void lIllIlIIlIlIIll;
            void lIllIlIIlIlIlII;
            void lIllIlIIlIlIlIl;
            void lIllIlIIlIlIllI;
            void lIllIlIIlIlIlll;
            void lIllIlIIlIllIII;
            void lIllIlIIlIllIIl;
            void lIllIlIIlIllIlI;
            void lIllIlIIlIllIll;
            void lIllIlIIlIlllII;
            void lIllIlIIlIlllIl;
            void lIllIlIIlIllllI;
            void lIllIlIIlIlllll;
            void lIllIlIIllIIIII;
            void lIllIlIIllIIIIl;
            void lIllIlIIllIIIlI;
            void lIllIlIIllIIIll;
            void lIllIlIIllIIlII;
            void lIllIlIIllIIlIl;
            void lIllIlIIllIIllI;
            void lIllIlIIllIIlll;
            void lIllIlIIllIlIII;
            void lIllIlIIllIlIIl;
            void lIllIlIIllIlIlI;
            void lIllIlIIllIlIll;
            void lIllIlIIllIllII;
            void lIllIlIIllIllIl;
            void lIllIlIIllIlllI;
            void lIllIlIIllIllll;
            void lIllIlIIlllIIII;
            void lIllIlIIlllIIIl;
            void lIllIlIIlllIIlI;
            void lIllIlIIlllIIll;
            void lIllIlIIlllIlII;
            void lIllIlIIlllIlIl;
            void lIllIlIIlllIllI;
            void lIllIlIIlllIlll;
            void lIllIlIIllllIII;
            void lIllIlIIllllIIl;
            void lIllIlIIllllIlI;
            void lIllIlIIllllIll;
            void lIllIlIIlllllII;
            void lIllIlIIlllllIl;
            void lIllIlIIllllllI;
            void lIllIlIIlllllll;
            void lIllIlIlIIIIIII;
            void lIllIlIlIIIIIIl;
            void lIllIlIlIIIIIlI;
            void lIllIlIlIIIIIll;
            void lIllIlIlIIIIlII;
            void lIllIlIlIIIIlIl;
            void lIllIlIlIIIIllI;
            void lIllIlIlIIIIlll;
            void lIllIlIlIIIlIII;
            void lIllIlIlIIIlIIl;
            void lIllIlIlIIIlIlI;
            void lIllIlIlIIIlIll;
            void lIllIlIlIIIllII;
            void lIllIlIlIIIllIl;
            void lIllIlIlIIIlllI;
            void lIllIlIlIIIllll;
            void lIllIlIlIIlIIII;
            void lIllIlIlIIlIIIl;
            void lIllIlIlIIlIIlI;
            void lIllIlIlIIlIIll;
            void lIllIlIlIIlIlII;
            void lIllIlIlIIlIlIl;
            void lIllIlIlIIlIllI;
            void lIllIlIlIIlIlll;
            void lIllIlIlIIllIII;
            void lIllIlIlIIllIIl;
            void lIllIlIlIIllIlI;
            void lIllIlIlIIllIll;
            void lIllIlIlIIlllII;
            void lIllIlIlIIlllIl;
            void lIllIlIlIIllllI;
            void lIllIlIlIIlllll;
            void lIllIlIlIlIIIII;
            void lIllIlIlIlIIIIl;
            void lIllIlIlIlIIIlI;
            void lIllIlIlIlIIIll;
            void lIllIlIlIlIIlII;
            void lIllIlIlIlIIlIl;
            void lIllIlIlIlIIllI;
            void lIllIlIlIlIIlll;
            void lIllIlIlIlIlIII;
            void lIllIlIlIlIlIIl;
            void lIllIlIlIlIlIlI;
            void lIllIlIlIlIlIll;
            void lIllIlIlIlIllII;
            void lIllIlIlIlIllIl;
            void lIllIlIlIlIlllI;
            void lIllIlIlIlIllll;
            void lIllIlIlIllIIII;
            void lIllIlIlIllIIIl;
            void lIllIlIlIllIIlI;
            void lIllIlIlIllIIll;
            void lIllIlIlIllIlII;
            void lIllIlIlIllIlIl;
            void lIllIlIlIllIllI;
            void lIllIlIlIllIlll;
            void lIllIlIlIlllIII;
            void lIllIlIlIlllIIl;
            void lIllIlIlIlllIlI;
            void lIllIlIlIlllIll;
            void lIllIlIlIllllII;
            void lIllIlIlIllllIl;
            void lIllIlIlIlllllI;
            void lIllIlIlIllllll;
            void lIllIlIllIIIIII;
            void lIllIlIllIIIIIl;
            void lIllIlIllIIIIlI;
            void lIllIlIllIIIIll;
            void lIllIlIllIIIlII;
            void lIllIlIllIIIlIl;
            void lIllIlIllIIIllI;
            void lIllIlIllIIIlll;
            void lIllIlIllIIlIII;
            void lIllIlIllIIlIIl;
            void lIllIlIllIIlIlI;
            void lIllIlIllIIlIll;
            void lIllIlIllIIllII;
            void lIllIlIllIIllIl;
            void lIllIlIllIIlllI;
            void lIllIlIllIIllll;
            void lIllIlIllIlIIII;
            void lIllIlIllIlIIIl;
            void lIllIlIllIlIIlI;
            void lIllIlIllIlIIll;
            void lIllIlIllIlIlII;
            void lIllIlIllIlIlIl;
            void lIllIlIllIlIllI;
            void lIllIlIllIlIlll;
            void lIllIlIllIllIII;
            void lIllIlIllIllIIl;
            void lIllIlIllIllIlI;
            void lIllIlIllIllIll;
            void lIllIlIllIlllII;
            void lIllIlIllIlllIl;
            void lIllIlIllIllllI;
            void lIllIlIllIlllll;
            void lIllIlIlllIIIII;
            void lIllIlIlllIIIIl;
            void lIllIlIlllIIIlI;
            void lIllIlIlllIIIll;
            void lIllIlIlllIIlII;
            void lIllIlIlllIIlIl;
            void lIllIlIlllIIllI;
            void lIllIlIlllIIlll;
            Object lIllIlIIIlllIll = lIllIlIIIllllIl + "," + lIllIlIIIllllII + "," + (String)lIllIlIlllIIlll + "," + lIllIlIlllIlIII + "," + (int)lIllIlIlllIIllI + "," + (int)lIllIlIlllIIlIl + "," + (int)lIllIlIlllIIlII + "," + (int)lIllIlIlllIIIll + "," + (int)lIllIlIlllIIIlI + "," + (int)lIllIlIlllIIIIl + "," + (int)lIllIlIlllIIIII + "," + (int)lIllIlIllIlllll + "," + (int)lIllIlIllIllllI + "," + (int)lIllIlIllIlllIl + "," + (int)lIllIlIllIlllII + "," + (int)lIllIlIllIllIll + "," + (int)lIllIlIllIllIlI + "," + (int)lIllIlIllIllIIl + "," + (int)lIllIlIllIllIII + "," + (int)lIllIlIllIlIlll + "," + (int)lIllIlIllIlIllI + "," + (int)lIllIlIllIlIlIl + "," + (int)lIllIlIllIlIlII + "," + (int)lIllIlIllIlIIll + "," + (int)lIllIlIllIlIIlI + "," + (int)lIllIlIllIlIIIl + "," + (int)lIllIlIllIlIIII + "," + (int)lIllIlIllIIllll + "," + (int)lIllIlIllIIlllI + "," + (int)lIllIlIllIIllIl + "," + (int)lIllIlIllIIllII + "," + (int)lIllIlIllIIlIll + "," + (int)lIllIlIllIIlIlI + "," + (int)lIllIlIllIIlIIl + "," + (int)lIllIlIllIIlIII + "," + (int)lIllIlIllIIIlll + "," + (int)lIllIlIllIIIllI + "," + (int)lIllIlIllIIIlIl + "," + (int)lIllIlIllIIIlII + "," + (int)lIllIlIllIIIIll + "," + (int)lIllIlIllIIIIlI + "," + (int)lIllIlIllIIIIIl + "," + (int)lIllIlIllIIIIII + "," + (int)lIllIlIlIllllll + "," + (int)lIllIlIlIlllllI + "," + (int)lIllIlIlIllllIl + "," + (int)lIllIlIlIllllII + "," + (int)lIllIlIlIlllIll + "," + (int)lIllIlIlIlllIlI + "," + (int)lIllIlIlIlllIIl + "," + (int)lIllIlIlIlllIII + "," + (int)lIllIlIlIllIlll + "," + (int)lIllIlIlIllIllI + "," + (int)lIllIlIlIllIlIl + "," + (int)lIllIlIlIllIlII + "," + (int)lIllIlIlIllIIll + "," + (int)lIllIlIlIllIIlI + "," + (int)lIllIlIlIllIIIl + "," + (int)lIllIlIlIllIIII + "," + (int)lIllIlIlIlIllll + "," + (int)lIllIlIlIlIlllI + "," + (int)lIllIlIlIlIllIl + "," + (int)lIllIlIlIlIllII + "," + (int)lIllIlIlIlIlIll + "," + (int)lIllIlIlIlIlIlI + "," + (int)lIllIlIlIlIlIIl + "," + (int)lIllIlIlIlIlIII + "," + (int)lIllIlIlIlIIlll + "," + (int)lIllIlIlIlIIllI + "," + (int)lIllIlIlIlIIlIl + "," + (int)lIllIlIlIlIIlII + "," + (int)lIllIlIlIlIIIll + "," + (int)lIllIlIlIlIIIlI + "," + (int)lIllIlIlIlIIIIl + "," + (int)lIllIlIlIlIIIII + "," + (int)lIllIlIlIIlllll + "," + (int)lIllIlIlIIllllI + "," + (int)lIllIlIlIIlllIl + "," + (int)lIllIlIlIIlllII + "," + (int)lIllIlIlIIllIll + "," + (int)lIllIlIlIIllIlI + "," + (int)lIllIlIlIIllIIl + "," + (int)lIllIlIlIIllIII + "," + (int)lIllIlIlIIlIlll + "," + (int)lIllIlIlIIlIllI + "," + (int)lIllIlIlIIlIlIl + "," + (int)lIllIlIlIIlIlII + "," + (int)lIllIlIlIIlIIll + "," + (int)lIllIlIlIIlIIlI + "," + (int)lIllIlIlIIlIIIl + "," + (int)lIllIlIlIIlIIII + "," + (int)lIllIlIlIIIllll + "," + (int)lIllIlIlIIIlllI + "," + (int)lIllIlIlIIIllIl + "," + (int)lIllIlIlIIIllII + "," + (int)lIllIlIlIIIlIll + "," + (int)lIllIlIlIIIlIlI + "," + (int)lIllIlIlIIIlIIl + "," + (int)lIllIlIlIIIlIII + "," + ((int)lIllIlIlIIIIlll + "," + (int)lIllIlIlIIIIllI + "," + (int)lIllIlIlIIIIlIl + "," + (int)lIllIlIlIIIIlII + "," + (int)lIllIlIlIIIIIll + "," + (int)lIllIlIlIIIIIlI + "," + (int)lIllIlIlIIIIIIl + "," + (int)lIllIlIlIIIIIII + "," + (int)lIllIlIIlllllll + "," + (int)lIllIlIIllllllI + "," + (int)lIllIlIIlllllIl + "," + (int)lIllIlIIlllllII + "," + (int)lIllIlIIllllIll + "," + (int)lIllIlIIllllIlI + "," + (int)lIllIlIIllllIIl + "," + (int)lIllIlIIllllIII + "," + (int)lIllIlIIlllIlll + "," + (int)lIllIlIIlllIllI + "," + (int)lIllIlIIlllIlIl + "," + (int)lIllIlIIlllIlII + "," + (int)lIllIlIIlllIIll + "," + (int)lIllIlIIlllIIlI + "," + (int)lIllIlIIlllIIIl + "," + (int)lIllIlIIlllIIII + "," + (int)lIllIlIIllIllll + "," + (int)lIllIlIIllIlllI + "," + (int)lIllIlIIllIllIl + "," + (int)lIllIlIIllIllII + "," + (int)lIllIlIIllIlIll + "," + (int)lIllIlIIllIlIlI + "," + (int)lIllIlIIllIlIIl + "," + (int)lIllIlIIllIlIII + "," + (int)lIllIlIIllIIlll + "," + (int)lIllIlIIllIIllI + "," + (int)lIllIlIIllIIlIl + "," + (int)lIllIlIIllIIlII + "," + (int)lIllIlIIllIIIll + "," + (int)lIllIlIIllIIIlI + "," + (int)lIllIlIIllIIIIl + "," + (int)lIllIlIIllIIIII + "," + (int)lIllIlIIlIlllll + "," + (int)lIllIlIIlIllllI + "," + (int)lIllIlIIlIlllIl + "," + (int)lIllIlIIlIlllII + "," + (int)lIllIlIIlIllIll + "," + (int)lIllIlIIlIllIlI + "," + (int)lIllIlIIlIllIIl + "," + (int)lIllIlIIlIllIII + "," + (int)lIllIlIIlIlIlll + "," + (int)lIllIlIIlIlIllI + "," + (int)lIllIlIIlIlIlIl + "," + (int)lIllIlIIlIlIlII + "," + (int)lIllIlIIlIlIIll + "," + (int)lIllIlIIlIlIIlI + "," + (int)lIllIlIIlIlIIIl + "," + (int)lIllIlIIlIlIIII + "," + (int)lIllIlIIlIIllll + "," + (int)lIllIlIIlIIlllI + "," + (int)lIllIlIIlIIllIl + "," + (int)lIllIlIIlIIllII + "," + (int)lIllIlIIlIIlIll + "," + (int)lIllIlIIlIIlIlI + "," + (int)lIllIlIIlIIlIIl + "," + (int)lIllIlIIlIIlIII + "," + (int)lIllIlIIlIIIlll + "," + (int)lIllIlIIlIIIllI + "," + (int)lIllIlIIlIIIlIl + "," + (int)lIllIlIIlIIIlII + "," + (int)lIllIlIIlIIIIll + "," + (int)lIllIlIIlIIIIlI + "," + (int)lIllIlIIlIIIIIl + "," + (int)lIllIlIIlIIIIII + "," + (int)lIllIlIIIllllll);
            IvParameterSpec lIllIlIIIlllIlI = new IvParameterSpec(lIllIlIIIllllIl.getBytes());
            SecretKeySpec lIllIlIIIlllIIl = new SecretKeySpec(lIllIlIIIlllllI.getBytes(), lIlIlllI[lIllIIIl[11]]);
            Cipher lIllIlIIIlllIII = Cipher.getInstance(lIlIlllI[lIllIIIl[12]]);
            if (Q.lIIlIlIIlII(((String)lIllIlIIIlllIll).contains(lIlIlllI[lIllIIIl[13]]) ? 1 : 0)) {
                lIllIlIIIlllIll = ((String)lIllIlIIIlllIll).replace(lIlIlllI[lIllIIIl[14]], lIlIlllI[lIllIIIl[15]]);
            }
            URL lIllIlIIIllIlll = new URL("https://highscores.squireplugins.com/updatequest.php?token=" + (String)lIllIlIIIlllIll);
            URLConnection lIllIlIIIllIllI = lIllIlIIIllIlll.openConnection();
            lIllIlIIIllIllI.setRequestProperty(lIlIlllI[lIllIIIl[16]], lIlIlllI[lIllIIIl[17]]);
            lIllIlIIIllIllI.setDoOutput(lIllIIIl[1]);
            BufferedReader lIllIlIIIllIlIl = new BufferedReader(new InputStreamReader(lIllIlIIIllIllI.getInputStream()));
            lIllIlIIIllIlIl.readLine();

            lIllIlIIIllIlIl.close();
            return lIllIIIl[1];
        }
        catch (Exception exception) {
            return lIllIIIl[0];
        }
    }

    private static int lIIlIlIIIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string, long l2, String string2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n23, int n24, int n25, int n26, int n27, int n28, int n29, int n30, int n31, int n32, int n33, int n34, int n35, int n36, int n37, int n38, int n39, int n40, int n41, int n42, int n43, int n44, int n45, int n46, int n47, int n48, int n49, int n50, int n51, int n52, int n53, int n54, int n55, int n56, int n57, int n58, int n59, int n60, int n61, int n62, int n63, int n64, int n65, int n66, int n67, int n68, int n69, int n70, int n71, int n72, int n73, int n74, int n75, int n76, int n77, int n78, int n79, int n80, int n81, int n82, int n83, int n84, int n85, int n86, int n87, int n88, int n89, int n90, int n91, int n92, int n93, int n94, int n95, int n96, int n97, int n98, int n99, int n100, int n101, int n102, int n103, int n104, int n105, int n106, int n107, int n108, int n109, int n110, int n111, int n112, int n113, int n114, int n115, int n116, int n117, int n118, int n119, int n120, int n121, int n122, int n123, int n124, int n125, int n126, int n127, int n128, int n129, int n130, int n131, int n132, int n133, int n134, int n135, int n136, int n137, int n138, int n139, int n140, int n141, int n142, int n143, int n144, int n145, int n146, int n147, int n148, int n149, int n150, int n151, int n152, int n153, int n154, int n155, int n156, int n157, int n158, int n159, int n160, int n161, int n162, int n163, int n164, int n165, int n166, int n167, int n168, int n169) {
        String lIlllIIIlIlIIll;
        long lIlllIIIlIlIIlI;
        if (Q.lIIlIlIIIll(Q.lIIlIlIIIlI(l2, 660000L))) {
            lIlllIIIlIlIIlI = 100L;
        }
        String lIllIlllIlIlIII = lIlIlllI[lIllIIIl[0]];
        String lIllIlllIlIIlll = lIlIlllI[lIllIIIl[1]];
        String lIllIlllIlIIllI = lIlllIIIlIlIIll;
        try {
            void lIllIlllIlIlIIl;
            void lIllIlllIlIlIlI;
            void lIllIlllIlIlIll;
            void lIllIlllIlIllII;
            void lIllIlllIlIllIl;
            void lIllIlllIlIlllI;
            void lIllIlllIlIllll;
            void lIllIlllIllIIII;
            void lIllIlllIllIIIl;
            void lIllIlllIllIIlI;
            void lIllIlllIllIIll;
            void lIllIlllIllIlII;
            void lIllIlllIllIlIl;
            void lIllIlllIllIllI;
            void lIllIlllIllIlll;
            void lIllIlllIlllIII;
            void lIllIlllIlllIIl;
            void lIllIlllIlllIlI;
            void lIllIlllIlllIll;
            void lIllIlllIllllII;
            void lIllIlllIllllIl;
            void lIllIlllIlllllI;
            void lIllIlllIllllll;
            void lIllIllllIIIIII;
            void lIllIllllIIIIIl;
            void lIllIllllIIIIlI;
            void lIllIllllIIIIll;
            void lIllIllllIIIlII;
            void lIllIllllIIIlIl;
            void lIllIllllIIIllI;
            void lIllIllllIIIlll;
            void lIllIllllIIlIII;
            void lIllIllllIIlIIl;
            void lIllIllllIIlIlI;
            void lIllIllllIIlIll;
            void lIllIllllIIllII;
            void lIllIllllIIllIl;
            void lIllIllllIIlllI;
            void lIllIllllIIllll;
            void lIllIllllIlIIII;
            void lIllIllllIlIIIl;
            void lIllIllllIlIIlI;
            void lIllIllllIlIIll;
            void lIllIllllIlIlII;
            void lIllIllllIlIlIl;
            void lIllIllllIlIllI;
            void lIllIllllIlIlll;
            void lIllIllllIllIII;
            void lIllIllllIllIIl;
            void lIllIllllIllIlI;
            void lIllIllllIllIll;
            void lIllIllllIlllII;
            void lIllIllllIlllIl;
            void lIllIllllIllllI;
            void lIllIllllIlllll;
            void lIllIlllllIIIII;
            void lIllIlllllIIIIl;
            void lIllIlllllIIIlI;
            void lIllIlllllIIIll;
            void lIllIlllllIIlII;
            void lIllIlllllIIlIl;
            void lIllIlllllIIllI;
            void lIllIlllllIIlll;
            void lIllIlllllIlIII;
            void lIllIlllllIlIIl;
            void lIllIlllllIlIlI;
            void lIllIlllllIlIll;
            void lIllIlllllIllII;
            void lIllIlllllIllIl;
            void lIllIlllllIlllI;
            void lIllIlllllIllll;
            void lIllIllllllIIII;
            void lIllIllllllIIIl;
            void lIllIllllllIIlI;
            void lIllIllllllIIll;
            void lIllIllllllIlII;
            void lIllIllllllIlIl;
            void lIllIllllllIllI;
            void lIllIllllllIlll;
            void lIllIlllllllIII;
            void lIllIlllllllIIl;
            void lIllIlllllllIlI;
            void lIllIlllllllIll;
            void lIllIllllllllII;
            void lIllIllllllllIl;
            void lIllIlllllllllI;
            void lIllIllllllllll;
            void lIlllIIIIIIIIII;
            void lIlllIIIIIIIIIl;
            void lIlllIIIIIIIIlI;
            void lIlllIIIIIIIIll;
            void lIlllIIIIIIIlII;
            void lIlllIIIIIIIlIl;
            void lIlllIIIIIIIllI;
            void lIlllIIIIIIIlll;
            void lIlllIIIIIIlIII;
            void lIlllIIIIIIlIIl;
            void lIlllIIIIIIlIlI;
            void lIlllIIIIIIlIll;
            void lIlllIIIIIIllII;
            void lIlllIIIIIIllIl;
            void lIlllIIIIIIlllI;
            void lIlllIIIIIIllll;
            void lIlllIIIIIlIIII;
            void lIlllIIIIIlIIIl;
            void lIlllIIIIIlIIlI;
            void lIlllIIIIIlIIll;
            void lIlllIIIIIlIlII;
            void lIlllIIIIIlIlIl;
            void lIlllIIIIIlIllI;
            void lIlllIIIIIlIlll;
            void lIlllIIIIIllIII;
            void lIlllIIIIIllIIl;
            void lIlllIIIIIllIlI;
            void lIlllIIIIIllIll;
            void lIlllIIIIIlllII;
            void lIlllIIIIIlllIl;
            void lIlllIIIIIllllI;
            void lIlllIIIIIlllll;
            void lIlllIIIIlIIIII;
            void lIlllIIIIlIIIIl;
            void lIlllIIIIlIIIlI;
            void lIlllIIIIlIIIll;
            void lIlllIIIIlIIlII;
            void lIlllIIIIlIIlIl;
            void lIlllIIIIlIIllI;
            void lIlllIIIIlIIlll;
            void lIlllIIIIlIlIII;
            void lIlllIIIIlIlIIl;
            void lIlllIIIIlIlIlI;
            void lIlllIIIIlIlIll;
            void lIlllIIIIlIllII;
            void lIlllIIIIlIllIl;
            void lIlllIIIIlIlllI;
            void lIlllIIIIlIllll;
            void lIlllIIIIllIIII;
            void lIlllIIIIllIIIl;
            void lIlllIIIIllIIlI;
            void lIlllIIIIllIIll;
            void lIlllIIIIllIlII;
            void lIlllIIIIllIlIl;
            void lIlllIIIIllIllI;
            void lIlllIIIIllIlll;
            void lIlllIIIIlllIII;
            void lIlllIIIIlllIIl;
            void lIlllIIIIlllIlI;
            void lIlllIIIIlllIll;
            void lIlllIIIIllllII;
            void lIlllIIIIllllIl;
            void lIlllIIIIlllllI;
            void lIlllIIIIllllll;
            void lIlllIIIlIIIIII;
            void lIlllIIIlIIIIIl;
            void lIlllIIIlIIIIlI;
            void lIlllIIIlIIIIll;
            void lIlllIIIlIIIlII;
            void lIlllIIIlIIIlIl;
            void lIlllIIIlIIIllI;
            void lIlllIIIlIIIlll;
            void lIlllIIIlIIlIII;
            void lIlllIIIlIIlIIl;
            void lIlllIIIlIIlIlI;
            void lIlllIIIlIIlIll;
            void lIlllIIIlIIllII;
            void lIlllIIIlIIllIl;
            void lIlllIIIlIIlllI;
            void lIlllIIIlIIllll;
            void lIlllIIIlIlIIII;
            void lIlllIIIlIlIIIl;
            Object lIllIlllIlIIlIl = lIllIlllIlIIlll + "," + lIllIlllIlIIllI + "," + (String)lIlllIIIlIlIIIl + "," + lIlllIIIlIlIIlI + "," + (int)lIlllIIIlIlIIII + "," + (int)lIlllIIIlIIllll + "," + (int)lIlllIIIlIIlllI + "," + (int)lIlllIIIlIIllIl + "," + (int)lIlllIIIlIIllII + "," + (int)lIlllIIIlIIlIll + "," + (int)lIlllIIIlIIlIlI + "," + (int)lIlllIIIlIIlIIl + "," + (int)lIlllIIIlIIlIII + "," + (int)lIlllIIIlIIIlll + "," + (int)lIlllIIIlIIIllI + "," + (int)lIlllIIIlIIIlIl + "," + (int)lIlllIIIlIIIlII + "," + (int)lIlllIIIlIIIIll + "," + (int)lIlllIIIlIIIIlI + "," + (int)lIlllIIIlIIIIIl + "," + (int)lIlllIIIlIIIIII + "," + (int)lIlllIIIIllllll + "," + (int)lIlllIIIIlllllI + "," + (int)lIlllIIIIllllIl + "," + (int)lIlllIIIIllllII + "," + (int)lIlllIIIIlllIll + "," + (int)lIlllIIIIlllIlI + "," + (int)lIlllIIIIlllIIl + "," + (int)lIlllIIIIlllIII + "," + (int)lIlllIIIIllIlll + "," + (int)lIlllIIIIllIllI + "," + (int)lIlllIIIIllIlIl + "," + (int)lIlllIIIIllIlII + "," + (int)lIlllIIIIllIIll + "," + (int)lIlllIIIIllIIlI + "," + (int)lIlllIIIIllIIIl + "," + (int)lIlllIIIIllIIII + "," + (int)lIlllIIIIlIllll + "," + (int)lIlllIIIIlIlllI + "," + (int)lIlllIIIIlIllIl + "," + (int)lIlllIIIIlIllII + "," + (int)lIlllIIIIlIlIll + "," + (int)lIlllIIIIlIlIlI + "," + (int)lIlllIIIIlIlIIl + "," + (int)lIlllIIIIlIlIII + "," + (int)lIlllIIIIlIIlll + "," + (int)lIlllIIIIlIIllI + "," + (int)lIlllIIIIlIIlIl + "," + (int)lIlllIIIIlIIlII + "," + (int)lIlllIIIIlIIIll + "," + (int)lIlllIIIIlIIIlI + "," + (int)lIlllIIIIlIIIIl + "," + (int)lIlllIIIIlIIIII + "," + (int)lIlllIIIIIlllll + "," + (int)lIlllIIIIIllllI + "," + (int)lIlllIIIIIlllIl + "," + (int)lIlllIIIIIlllII + "," + (int)lIlllIIIIIllIll + "," + (int)lIlllIIIIIllIlI + "," + (int)lIlllIIIIIllIIl + "," + (int)lIlllIIIIIllIII + "," + (int)lIlllIIIIIlIlll + "," + (int)lIlllIIIIIlIllI + "," + (int)lIlllIIIIIlIlIl + "," + (int)lIlllIIIIIlIlII + "," + (int)lIlllIIIIIlIIll + "," + (int)lIlllIIIIIlIIlI + "," + (int)lIlllIIIIIlIIIl + "," + (int)lIlllIIIIIlIIII + "," + (int)lIlllIIIIIIllll + "," + (int)lIlllIIIIIIlllI + "," + (int)lIlllIIIIIIllIl + "," + (int)lIlllIIIIIIllII + "," + (int)lIlllIIIIIIlIll + "," + (int)lIlllIIIIIIlIlI + "," + (int)lIlllIIIIIIlIIl + "," + (int)lIlllIIIIIIlIII + "," + (int)lIlllIIIIIIIlll + "," + (int)lIlllIIIIIIIllI + "," + (int)lIlllIIIIIIIlIl + "," + (int)lIlllIIIIIIIlII + "," + (int)lIlllIIIIIIIIll + "," + (int)lIlllIIIIIIIIlI + "," + (int)lIlllIIIIIIIIIl + "," + (int)lIlllIIIIIIIIII + "," + (int)lIllIllllllllll + "," + (int)lIllIlllllllllI + "," + (int)lIllIllllllllIl + "," + (int)lIllIllllllllII + "," + (int)lIllIlllllllIll + "," + (int)lIllIlllllllIlI + "," + (int)lIllIlllllllIIl + "," + (int)lIllIlllllllIII + "," + (int)lIllIllllllIlll + "," + (int)lIllIllllllIllI + "," + (int)lIllIllllllIlIl + "," + (int)lIllIllllllIlII + "," + (int)lIllIllllllIIll + "," + (int)lIllIllllllIIlI + "," + ((int)lIllIllllllIIIl + "," + (int)lIllIllllllIIII + "," + (int)lIllIlllllIllll + "," + (int)lIllIlllllIlllI + "," + (int)lIllIlllllIllIl + "," + (int)lIllIlllllIllII + "," + (int)lIllIlllllIlIll + "," + (int)lIllIlllllIlIlI + "," + (int)lIllIlllllIlIIl + "," + (int)lIllIlllllIlIII + "," + (int)lIllIlllllIIlll + "," + (int)lIllIlllllIIllI + "," + (int)lIllIlllllIIlIl + "," + (int)lIllIlllllIIlII + "," + (int)lIllIlllllIIIll + "," + (int)lIllIlllllIIIlI + "," + (int)lIllIlllllIIIIl + "," + (int)lIllIlllllIIIII + "," + (int)lIllIllllIlllll + "," + (int)lIllIllllIllllI + "," + (int)lIllIllllIlllIl + "," + (int)lIllIllllIlllII + "," + (int)lIllIllllIllIll + "," + (int)lIllIllllIllIlI + "," + (int)lIllIllllIllIIl + "," + (int)lIllIllllIllIII + "," + (int)lIllIllllIlIlll + "," + (int)lIllIllllIlIllI + "," + (int)lIllIllllIlIlIl + "," + (int)lIllIllllIlIlII + "," + (int)lIllIllllIlIIll + "," + (int)lIllIllllIlIIlI + "," + (int)lIllIllllIlIIIl + "," + (int)lIllIllllIlIIII + "," + (int)lIllIllllIIllll + "," + (int)lIllIllllIIlllI + "," + (int)lIllIllllIIllIl + "," + (int)lIllIllllIIllII + "," + (int)lIllIllllIIlIll + "," + (int)lIllIllllIIlIlI + "," + (int)lIllIllllIIlIIl + "," + (int)lIllIllllIIlIII + "," + (int)lIllIllllIIIlll + "," + (int)lIllIllllIIIllI + "," + (int)lIllIllllIIIlIl + "," + (int)lIllIllllIIIlII + "," + (int)lIllIllllIIIIll + "," + (int)lIllIllllIIIIlI + "," + (int)lIllIllllIIIIIl + "," + (int)lIllIllllIIIIII + "," + (int)lIllIlllIllllll + "," + (int)lIllIlllIlllllI + "," + (int)lIllIlllIllllIl + "," + (int)lIllIlllIllllII + "," + (int)lIllIlllIlllIll + "," + (int)lIllIlllIlllIlI + "," + (int)lIllIlllIlllIIl + "," + (int)lIllIlllIlllIII + "," + (int)lIllIlllIllIlll + "," + (int)lIllIlllIllIllI + "," + (int)lIllIlllIllIlIl + "," + (int)lIllIlllIllIlII + "," + (int)lIllIlllIllIIll + "," + (int)lIllIlllIllIIlI + "," + (int)lIllIlllIllIIIl + "," + (int)lIllIlllIllIIII + "," + (int)lIllIlllIlIllll + "," + (int)lIllIlllIlIlllI + "," + (int)lIllIlllIlIllIl + "," + (int)lIllIlllIlIllII + "," + (int)lIllIlllIlIlIll + "," + (int)lIllIlllIlIlIlI + "," + (int)lIllIlllIlIlIIl + ",1");
            IvParameterSpec lIllIlllIlIIlII = new IvParameterSpec(lIllIlllIlIIlll.getBytes());
            SecretKeySpec lIllIlllIlIIIll = new SecretKeySpec(lIllIlllIlIlIII.getBytes(), lIlIlllI[lIllIIIl[2]]);
            Cipher lIllIlllIlIIIlI = Cipher.getInstance(lIlIlllI[lIllIIIl[3]]);
            if (Q.lIIlIlIIlII(((String)lIllIlllIlIIlIl).contains(lIlIlllI[lIllIIIl[4]]) ? 1 : 0)) {
                lIllIlllIlIIlIl = ((String)lIllIlllIlIIlIl).replace(lIlIlllI[lIllIIIl[5]], lIlIlllI[lIllIIIl[6]]);
            }
            URL lIllIlllIlIIIIl = new URL("http://godscripting.com/stats/input.php?token=" + (String)lIllIlllIlIIlIl);
            URLConnection lIllIlllIlIIIII = lIllIlllIlIIIIl.openConnection();
            lIllIlllIlIIIII.setRequestProperty(lIlIlllI[lIllIIIl[7]], lIlIlllI[lIllIIIl[8]]);
            lIllIlllIlIIIII.setDoOutput(lIllIIIl[1]);
            BufferedReader lIllIlllIIlllll = new BufferedReader(new InputStreamReader(lIllIlllIlIIIII.getInputStream()));
            lIllIlllIIlllll.readLine();

            lIllIlllIIlllll.close();
            return lIllIIIl[1];
        }
        catch (Exception exception) {
            return lIllIIIl[0];
        }
    }

    private static void lIIlIlIIIII() {
        lIlIlllI = new String[lIllIIIl[22]];
        Q.lIlIlllI[Q.lIllIIIl[0]] = "1234567891234567";
        Q.lIlIlllI[Q.lIllIIIl[1]] = "1234567891234568";
        Q.lIlIlllI[Q.lIllIIIl[2]] = "AES";
        Q.lIlIlllI[Q.lIllIIIl[3]] = "AES/CBC/PKCS5Padding";
        Q.lIlIlllI[Q.lIllIIIl[4]] = " ";
        Q.lIlIlllI[Q.lIllIIIl[5]] = " ";
        Q.lIlIlllI[Q.lIllIIIl[6]] = "%20";
        Q.lIlIlllI[Q.lIllIIIl[7]] = "User-Agent";
        Q.lIlIlllI[Q.lIllIIIl[8]] = "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2.13) Gecko/20101203 Firefox/3.6.13 (.NET CLR 3.5.30729)";
        Q.lIlIlllI[Q.lIllIIIl[9]] = "1234567891234567";
        Q.lIlIlllI[Q.lIllIIIl[10]] = "1234567891234568";
        Q.lIlIlllI[Q.lIllIIIl[11]] = "AES";
        Q.lIlIlllI[Q.lIllIIIl[12]] = "AES/CBC/PKCS5Padding";
        Q.lIlIlllI[Q.lIllIIIl[13]] = " ";
        Q.lIlIlllI[Q.lIllIIIl[14]] = " ";
        Q.lIlIlllI[Q.lIllIIIl[15]] = "%20";
        Q.lIlIlllI[Q.lIllIIIl[16]] = "User-Agent";
        Q.lIlIlllI[Q.lIllIIIl[17]] = "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2.13) Gecko/20101203 Firefox/3.6.13 (.NET CLR 3.5.30729)";
        Q.lIlIlllI[Q.lIllIIIl[19]] = "Testing";
    }

    public static void o(String string) {
        long l2 = (System.currentTimeMillis() - AccBuilderBarrows.b) / 1000L;
        long l3 = Math.abs(l2 - mF / 1000L);
        Q.a(string, l3, null, jt, ju, jv, jw, jx, jy, jz, jA, jB, jC, jD, jE, jF, jG, jH, jI, jJ, jK, jL, jM, jN, jO, jP, jQ, jR, jS, jT, jU, jV, jW, jX, jY, jZ, ka, kb, kc, kd, ke, kf, kg, kh, ki, kj, kk, kl, km, kn, ko, kp, kq, kr, ks, kt, ku, kv, kw, kx, ky, kz, kA, kB, kC, kD, kE, kF, kG, kH, kI, kJ, kK, kL, kM, kN, kO, kP, kQ, kR, kS, kT, kU, kV, kW, kX, kY, kZ, la, lb, lc, ld, le, lf, lg, lh, li, lj, lk, ll, lm, ln, lo, lp, lq, lr, ls, lt, lu, lv, lw, lx, ly, lz, lA, lB, lC, lD, lE, lF, lG, lH, lI, lJ, lK, lL, lM, lN, lO, lP, lQ, lR, lS, lT, lU, lV, lW, lX, lY, lZ, ma, mb, mc, md, me, mf, mg, mh, mi, mj, mk, ml, mm, mn, mo, mp, mq, mr, ms, mt, mu, mv, mw, mx, my, mz, mA, mB, mC, mD, mE);

        Q.b(String.valueOf(string), l3, null, jt, ju, jv, jw, jx, jy, jz, jA, jB, jC, jD, jE, jF, jG, jH, jI, jJ, jK, jL, jM, jN, jO, jP, jQ, jR, jS, jT, jU, jV, jW, jX, jY, jZ, ka, kb, kc, kd, ke, kf, kg, kh, ki, kj, kk, kl, km, kn, ko, kp, kq, kr, ks, kt, ku, kv, kw, kx, ky, kz, kA, kB, kC, kD, kE, kF, kG, kH, kI, kJ, kK, kL, kM, kN, kO, kP, kQ, kR, kS, kT, kU, kV, kW, kX, kY, kZ, la, lb, lc, ld, le, lf, lg, lh, li, lj, lk, ll, lm, ln, lo, lp, lq, lr, ls, lt, lu, lv, lw, lx, ly, lz, lA, lB, lC, lD, lE, lF, lG, lH, lI, lJ, lK, lL, lM, lN, lO, lP, lQ, lR, lS, lT, lU, lV, lW, lX, lY, lZ, ma, mb, mc, md, me, mf, mg, mh, mi, mj, mk, ml, mm, mn, mo, mp, mq, mr, ms, mt, mu, mv, mw, mx, my, mz, mA, mB, mC, mD, mE);

        mF = System.currentTimeMillis() - AccBuilderBarrows.b;
    }

    private static boolean lIIlIlIIlII(int n2) {
        return n2 != 0;
    }

    public static void dq() {
    }

    static {
        Q.lIIlIlIIIIl();
        Q.lIIlIlIIIII();
        js = new WorldPoint(lIllIIIl[20], lIllIIIl[21], lIllIIIl[0]);
    }

    @Override
    public int U() {
        try {
            Q.dq();

        }
        catch (Exception lIllIlIIIllIIll) {
            lIllIlIIIllIIll.printStackTrace();
        }
        if (3 != 3) {
            return (0x47 ^ 0x5B) & ~(0xA7 ^ 0xBB);
        }
        return lIllIIIl[18];
    }

    @Override
    public String V() {
        return lIlIlllI[lIllIIIl[19]];
    }

        return String.valueOf(lIllIlIIIlIIllI);
    }
}

