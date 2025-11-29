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

public class RHelper
implements ac {
    
    public static  boolean bt;
    private static  int db;
    static  String h;
    static  String da;
    
    public static  List<d> bv;

    private static void lIllIIllIIIII() {
        llIlIlIIII = new String[llIlIlIIlI[10]];
        r.llIlIlIIII[r.llIlIlIIlI[2]] = "- Vamp Slayer";
        r.llIlIlIIII[r.llIlIlIIlI[5]] = "- Lost City";
        r.llIlIlIIII[r.llIlIlIIlI[8]] = "- Fight Arena";
        r.llIlIlIIII[r.llIlIlIIlI[1]] = "- Tree Gnome village";
        r.llIlIlIIII[r.llIlIlIIlI[13]] = "- Grand Tree";
        r.llIlIlIIII[r.llIlIlIIlI[14]] = r.lIllIIlIlllIl("Lk8vvW90Dlk=", "pPmZi");
        r.llIlIlIIII[r.llIlIlIIlI[4]] = "melee";
        r.llIlIlIIII[r.llIlIlIIlI[16]] = r.lIllIIlIllllI("puPYGIsgLAg=", "lKmBg");
        r.llIlIlIIII[r.llIlIlIIlI[17]] = "NMZ Melee ";
    }

    @Override
    public String ag() {
        return h;
    }

    @Override
    public boolean ae() {
        return llIlIlIIlI[2];
    }

        return String.valueOf(var1);
    }

    static {
        r.lIllIIllIIlII();
        r.lIllIIllIIIII();
        bv = new ArrayList<d>();
        da = llIlIlIIII[llIlIlIIlI[16]];
        h = llIlIlIIII[llIlIlIIlI[17]];
        db = e.c(llIlIlIIlI[5], llIlIlIIlI[8]);
    }

    @Override
    public int af() {
        try {
            r.aV();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= -1) {
            return (8 ^ 0x22) & ~(0x7C ^ 0x56);
        }
        return llIlIlIIlI[15];
    }

    public static void aV() {
        if (r.lIllIIllIIlIl(e.j(llIlIlIIlI[0]), llIlIlIIlI[1])) {
            da = llIlIlIIII[llIlIlIIlI[2]];
            aa.ev();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIlIl(e.j(llIlIlIIlI[3]), llIlIlIIlI[4])) {
            da = llIlIlIIII[llIlIlIIlI[5]];
            F.bY();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && r.lIllIIllIIlIl(e.j(llIlIlIIlI[6]), llIlIlIIlI[7])) {
            da = llIlIlIIII[llIlIlIIlI[8]];
            A.bw();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[6]), llIlIlIIlI[7]) && r.lIllIIllIIlIl(e.j(llIlIlIIlI[9]), llIlIlIIlI[10])) {
            da = llIlIlIIII[llIlIlIIlI[1]];
            M.cT();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[6]), llIlIlIIlI[7]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[9]), llIlIlIIlI[10]) && r.lIllIIllIIlIl(e.j(llIlIlIIlI[11]), llIlIlIIlI[12])) {
            da = llIlIlIIII[llIlIlIIlI[13]];
            C.bA();
        }
        if (r.lIllIIllIIllI(e.j(llIlIlIIlI[0]), llIlIlIIlI[1]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[3]), llIlIlIIlI[4]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[6]), llIlIlIIlI[7]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[9]), llIlIlIIlI[10]) && r.lIllIIllIIllI(e.j(llIlIlIIlI[11]), llIlIlIIlI[12])) {
            da = llIlIlIIII[llIlIlIIlI[14]];
            q.e(llIlIlIIII[llIlIlIIlI[4]]);
        }
    }

    @Override
    public boolean ah() {
        return llIlIlIIlI[2];
    }

    private static boolean lIllIIllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }
}

