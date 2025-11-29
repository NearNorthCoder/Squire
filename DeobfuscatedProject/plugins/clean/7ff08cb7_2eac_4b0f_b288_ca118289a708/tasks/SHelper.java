/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.CHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.KHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ZHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.QHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class SHelper
implements ab {
    private static  int dd;
    public static  List<d> bx;
    public static  boolean bv;

    static  String dc;
    static  String h;

    @Override
    public boolean ae() {
        return llllIlllI[2];
    }

    @Override
    public String ag() {
        return h;
    }

    private static void llIlIIlIllII() {
        llllIllIl = new String[llllIlllI[10]];
        s.llllIllIl[s.llllIlllI[2]] = "- Vamp Slayer";
        s.llllIllIl[s.llllIlllI[5]] = "- Lost City";
        s.llllIllIl[s.llllIlllI[8]] = "- Fight Arena";
        s.llllIllIl[s.llllIlllI[1]] = "- Tree Gnome village";
        s.llllIllIl[s.llllIlllI[13]] = "- Grand Tree";
        s.llllIllIl[s.llllIlllI[14]] = s.llIlIIlIlIll("DmSeBiuavbg=", "KtWAy");
        s.llllIllIl[s.llllIlllI[4]] = "range";
        s.llllIllIl[s.llllIlllI[16]] = s.llIlIIlIlIll("QhZ5WIlumvs=", "VjEIu");
        s.llllIllIl[s.llllIlllI[17]] = "NMZ Range ";
    }

    public static void aV() {
        if (s.llIlIIlIlllI(e.j(llllIlllI[0]), llllIlllI[1])) {
            dc = llllIllIl[llllIlllI[2]];
            Z.dO();
        }
        if (s.llIlIIlIllll(e.j(llllIlllI[0]), llllIlllI[1]) && s.llIlIIlIlllI(e.j(llllIlllI[3]), llllIlllI[4])) {
            dc = llllIllIl[llllIlllI[5]];
            D.bz();
        }
        if (s.llIlIIlIllll(e.j(llllIlllI[0]), llllIlllI[1]) && s.llIlIIlIllll(e.j(llllIlllI[3]), llllIlllI[4]) && s.llIlIIlIlllI(e.j(llllIlllI[6]), llllIlllI[7])) {
            dc = llllIllIl[llllIlllI[8]];
            A.bq();
        }
        if (s.llIlIIlIllll(e.j(llllIlllI[0]), llllIlllI[1]) && s.llIlIIlIllll(e.j(llllIlllI[3]), llllIlllI[4]) && s.llIlIIlIllll(e.j(llllIlllI[6]), llllIlllI[7]) && s.llIlIIlIlllI(e.j(llllIlllI[9]), llllIlllI[10])) {
            dc = llllIllIl[llllIlllI[1]];
            K.cg();
        }
        if (s.llIlIIlIllll(e.j(llllIlllI[0]), llllIlllI[1]) && s.llIlIIlIllll(e.j(llllIlllI[3]), llllIlllI[4]) && s.llIlIIlIllll(e.j(llllIlllI[6]), llllIlllI[7]) && s.llIlIIlIllll(e.j(llllIlllI[9]), llllIlllI[10]) && s.llIlIIlIlllI(e.j(llllIlllI[11]), llllIlllI[12])) {
            dc = llllIllIl[llllIlllI[13]];
            C.bu();
        }
        if (s.llIlIIlIllll(e.j(llllIlllI[0]), llllIlllI[1]) && s.llIlIIlIllll(e.j(llllIlllI[3]), llllIlllI[4]) && s.llIlIIlIllll(e.j(llllIlllI[6]), llllIlllI[7]) && s.llIlIIlIllll(e.j(llllIlllI[9]), llllIlllI[10]) && s.llIlIIlIllll(e.j(llllIlllI[11]), llllIlllI[12])) {
            dc = llllIllIl[llllIlllI[14]];
            q.e(llllIllIl[llllIlllI[4]]);
        }
    }

        return String.valueOf(lIllIlllIlIll);
    }

    private static boolean llIlIIlIllll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ah() {
        return llllIlllI[2];
    }

    private static boolean llIlIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        s.llIlIIlIllIl();
        s.llIlIIlIllII();
        bx = new ArrayList<d>();
        dc = llllIllIl[llllIlllI[16]];
        h = llllIllIl[llllIlllI[17]];
        dd = e.c(llllIlllI[5], llllIlllI[8]);
    }

    @Override
    public int af() {
        try {
            s.aV();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 == -1) {
            return (0x27 ^ 0x69) & ~(0x73 ^ 0x3D);
        }
        return llllIlllI[15];
    }

}

