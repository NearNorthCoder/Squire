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

public class RHelper
implements ab {
    public static  boolean bv;
    
    static  String dc;
    static  String h;
    private static  int dd;
    public static  List<d> bx;

    @Override
    public boolean ae() {
        return lllIlIIll[2];
    }

        return String.valueOf(llIlllllllIIl);
    }

    private static boolean llIIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static void aV() {
        if (r.llIIIllIIllI(e.j(lllIlIIll[0]), lllIlIIll[1])) {
            dc = lllIlIIlI[lllIlIIll[2]];
            Z.dO();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIllI(e.j(lllIlIIll[3]), lllIlIIll[4])) {
            dc = lllIlIIlI[lllIlIIll[5]];
            D.bz();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIlll(e.j(lllIlIIll[3]), lllIlIIll[4]) && r.llIIIllIIllI(e.j(lllIlIIll[6]), lllIlIIll[7])) {
            dc = lllIlIIlI[lllIlIIll[8]];
            A.bq();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIlll(e.j(lllIlIIll[3]), lllIlIIll[4]) && r.llIIIllIIlll(e.j(lllIlIIll[6]), lllIlIIll[7]) && r.llIIIllIIllI(e.j(lllIlIIll[9]), lllIlIIll[10])) {
            dc = lllIlIIlI[lllIlIIll[1]];
            K.cg();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIlll(e.j(lllIlIIll[3]), lllIlIIll[4]) && r.llIIIllIIlll(e.j(lllIlIIll[6]), lllIlIIll[7]) && r.llIIIllIIlll(e.j(lllIlIIll[9]), lllIlIIll[10]) && r.llIIIllIIllI(e.j(lllIlIIll[11]), lllIlIIll[12])) {
            dc = lllIlIIlI[lllIlIIll[13]];
            C.bu();
        }
        if (r.llIIIllIIlll(e.j(lllIlIIll[0]), lllIlIIll[1]) && r.llIIIllIIlll(e.j(lllIlIIll[3]), lllIlIIll[4]) && r.llIIIllIIlll(e.j(lllIlIIll[6]), lllIlIIll[7]) && r.llIIIllIIlll(e.j(lllIlIIll[9]), lllIlIIll[10]) && r.llIIIllIIlll(e.j(lllIlIIll[11]), lllIlIIll[12])) {
            dc = lllIlIIlI[lllIlIIll[14]];
            q.e(lllIlIIlI[lllIlIIll[4]]);
        }
    }

    @Override
    public int af() {
        try {
            r.aV();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 == 1) {
            return (0xB8 ^ 0xA2) & ~(0x8D ^ 0x97);
        }
        return lllIlIIll[15];
    }

    @Override
    public boolean ah() {
        return lllIlIIll[2];
    }

    static {
        r.llIIIllIIlIl();
        r.llIIIllIIlII();
        bx = new ArrayList<d>();
        dc = lllIlIIlI[lllIlIIll[16]];
        h = lllIlIIlI[lllIlIIll[17]];
        dd = e.c(lllIlIIll[5], lllIlIIll[8]);
    }

    private static void llIIIllIIlII() {
        lllIlIIlI = new String[lllIlIIll[10]];
        r.lllIlIIlI[r.lllIlIIll[2]] = "- Vamp Slayer";
        r.lllIlIIlI[r.lllIlIIll[5]] = "- Lost City";
        r.lllIlIIlI[r.lllIlIIll[8]] = "- Fight Arena";
        r.lllIlIIlI[r.lllIlIIll[1]] = "- Tree Gnome village";
        r.lllIlIIlI[r.lllIlIIll[13]] = "- Grand Tree";
        r.lllIlIIlI[r.lllIlIIll[14]] = r.llIIIllIIIlI("cMo174WOXjA=", "AJhRk");
        r.lllIlIIlI[r.lllIlIIll[4]] = "melee";
        r.lllIlIIlI[r.lllIlIIll[16]] = r.llIIIllIIIlI("kRzwBZpEmU0=", "qXFKI");
        r.lllIlIIlI[r.lllIlIIll[17]] = "NMZ Melee ";
    }

    @Override
    public String ag() {
        return h;
    }

    private static boolean llIIIllIIlll(int n2, int n3) {
        return n2 >= n3;
    }
}

