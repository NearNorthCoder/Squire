/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.CHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.MHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AAHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.QHelper;

public class SHelper
implements ac {
    public static  List<d> bv;
    private static  int db;

    static  String da;
    static  String h;
    public static  boolean bt;

    @Override
    public String ag() {
        return h;
    }

    @Override
    public boolean ae() {
        return lllIlIIIlI[2];
    }

        return String.valueOf(var1);
    }

    private static boolean llIIIIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        s.llIIIIlllllIl();
        s.llIIIIlllllII();
        bv = new ArrayList<d>();
        da = lllIlIIIIl[lllIlIIIlI[16]];
        h = lllIlIIIIl[lllIlIIIlI[17]];
        db = e.c(lllIlIIIlI[5], lllIlIIIlI[8]);
    }

    public static void aV() {
        if (s.llIIIIllllllI(e.j(lllIlIIIlI[0]), lllIlIIIlI[1])) {
            da = lllIlIIIIl[lllIlIIIlI[2]];
            aa.ev();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIllllllI(e.j(lllIlIIIlI[3]), lllIlIIIlI[4])) {
            da = lllIlIIIIl[lllIlIIIlI[5]];
            F.bY();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIlllllll(e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && s.llIIIIllllllI(e.j(lllIlIIIlI[6]), lllIlIIIlI[7])) {
            da = lllIlIIIIl[lllIlIIIlI[8]];
            A.bw();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIlllllll(e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && s.llIIIIlllllll(e.j(lllIlIIIlI[6]), lllIlIIIlI[7]) && s.llIIIIllllllI(e.j(lllIlIIIlI[9]), lllIlIIIlI[10])) {
            da = lllIlIIIIl[lllIlIIIlI[1]];
            M.cT();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIlllllll(e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && s.llIIIIlllllll(e.j(lllIlIIIlI[6]), lllIlIIIlI[7]) && s.llIIIIlllllll(e.j(lllIlIIIlI[9]), lllIlIIIlI[10]) && s.llIIIIllllllI(e.j(lllIlIIIlI[11]), lllIlIIIlI[12])) {
            da = lllIlIIIIl[lllIlIIIlI[13]];
            C.bA();
        }
        if (s.llIIIIlllllll(e.j(lllIlIIIlI[0]), lllIlIIIlI[1]) && s.llIIIIlllllll(e.j(lllIlIIIlI[3]), lllIlIIIlI[4]) && s.llIIIIlllllll(e.j(lllIlIIIlI[6]), lllIlIIIlI[7]) && s.llIIIIlllllll(e.j(lllIlIIIlI[9]), lllIlIIIlI[10]) && s.llIIIIlllllll(e.j(lllIlIIIlI[11]), lllIlIIIlI[12])) {
            da = lllIlIIIIl[lllIlIIIlI[14]];
            q.e(lllIlIIIIl[lllIlIIIlI[4]]);
        }
    }

    private static boolean llIIIIlllllll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            s.aV();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lllIlIIIlI[15];
    }

    @Override
    public boolean ah() {
        return lllIlIIIlI[2];
    }

    private static void llIIIIlllllII() {
        lllIlIIIIl = new String[lllIlIIIlI[10]];
        s.lllIlIIIIl[s.lllIlIIIlI[2]] = "- Vamp Slayer";
        s.lllIlIIIIl[s.lllIlIIIlI[5]] = "- Lost City";
        s.lllIlIIIIl[s.lllIlIIIlI[8]] = "- Fight Arena";
        s.lllIlIIIIl[s.lllIlIIIlI[1]] = "- Tree Gnome village";
        s.lllIlIIIIl[s.lllIlIIIlI[13]] = "- Grand Tree";
        s.lllIlIIIIl[s.lllIlIIIlI[14]] = s.llIIIIllllIIl("", "abyMt");
        s.lllIlIIIIl[s.lllIlIIIlI[4]] = "range";
        s.lllIlIIIIl[s.lllIlIIIlI[16]] = s.llIIIIllllIIl("", "zNoCK");
        s.lllIlIIIIl[s.lllIlIIIlI[17]] = "NMZ Range ";
    }

}

