/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;

@TaskDesc(name="Clicking Spores", priority=6000, blocking=true)
public class v
extends a {
    private static /* synthetic */ int ao;
    private static /* synthetic */ String[] lIlIIllllllll;
    private static /* synthetic */ int[] lIlIlIIIIIIII;
    private /* synthetic */ List<Widget> ap;

    @Inject
    protected v(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
        this.ap = new ArrayList<Widget>();
    }

    private static void lIllllIIllIIlIl() {
        lIlIlIIIIIIII = new int[6];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[0] = (0xC2 ^ 0x9C) & ~(0x7F ^ 0x21);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[1] = 5 ^ 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[2] = "  ".length();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[3] = " ".length();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[4] = 0xFFFFCDBF & 0x341324B;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[5] = 3 ^ 0x47 ^ (0x43 ^ 0xF);
    }

    private static boolean lIllllIIllIIlll(Object object) {
        return object != null;
    }

    private static boolean lIllllIIllIlIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void llllllllllllllIllIllIIllIIllIIll;
        Widget llllllllllllllIllIllIIllIIllIIIl;
        v llllllllllllllIllIllIIllIIllIlII;
        int n2 = lIlIlIIIIIIII[0];
        this.ap.clear();
        int llllllllllllllIllIllIIllIIllIIlI = lIlIlIIIIIIII[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIllI(llllllllllllllIllIllIIllIIllIIlI, lIlIlIIIIIIII[1])) {
            llllllllllllllIllIllIIllIIllIIIl = llllllllllllllIllIllIIllIIllIlII.w.getWidget(ao - llllllllllllllIllIllIIllIIllIIlI);
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlll(llllllllllllllIllIllIIllIIllIIIl)) {
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII(llllllllllllllIllIllIIllIIllIIIl.isVisible() ? 1 : 0)) {
                    "".length();
                    if (null != null) {
                        return ((0x6E ^ 0x6A ^ (0x56 ^ 0x78)) & (9 ^ 7 ^ (0x7E ^ 0x5A) ^ -" ".length())) != 0;
                    }
                } else {
                    ++llllllllllllllIllIllIIllIIllIIll;
                    llllllllllllllIllIllIIllIIllIlII.ap.add(llllllllllllllIllIllIIllIIllIIIl);
                    "".length();
                }
            }
            ++llllllllllllllIllIllIIllIIllIIlI;
            "".length();
            if (" ".length() != -" ".length()) continue;
            return ((5 ^ 0x5E ^ "  ".length()) & (0x17 ^ 0x1F ^ (0xC1 ^ 0x90) ^ -" ".length())) != 0;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII((int)llllllllllllllIllIllIIllIIllIIll)) {
            return lIlIlIIIIIIII[0];
        }
        Collections.shuffle(llllllllllllllIllIllIIllIIllIlII.ap);
        llllllllllllllIllIllIIllIIllIIlI = lIlIlIIIIIIII[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIllI(llllllllllllllIllIllIIllIIllIIlI, lIlIlIIIIIIII[2])) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII(llllllllllllllIllIllIIllIIllIlII.ap.size())) {
                return lIlIlIIIIIIII[0];
            }
            llllllllllllllIllIllIIllIIllIIIl = llllllllllllllIllIllIIllIIllIlII.ap.get(lIlIlIIIIIIII[0]);
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlll(llllllllllllllIllIllIIllIIllIIIl)) {
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII(llllllllllllllIllIllIIllIIllIIIl.isVisible() ? 1 : 0)) {
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return ((0x96 ^ 0xB1 ^ (0x96 ^ 0x92)) & (0xA3 ^ 0xBB ^ (0xF9 ^ 0xC2) ^ -" ".length())) != 0;
                    }
                } else {
                    llllllllllllllIllIllIIllIIllIIIl.interact(lIlIIllllllll[lIlIlIIIIIIII[0]]);
                    llllllllllllllIllIllIIllIIllIlII.ap.remove(lIlIlIIIIIIII[0]);
                    "".length();
                }
            }
            ++llllllllllllllIllIllIIllIIllIIlI;
            "".length();
            if (null == null) continue;
            return ((0xBD ^ 0xA6) & ~(0x74 ^ 0x6F)) != 0;
        }
        return lIlIlIIIIIIII[3];
    }

    private static void lIllllIIllIIlII() {
        lIlIIllllllll = new String[lIlIlIIIIIIII[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIIllllllll[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIIll("6rVHJ9FAbus=", "JfZau");
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlIl();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlII();
        ao = lIlIlIIIIIIII[4];
    }

    private static String lIllllIIllIIIll(String llllllllllllllIllIllIIllIIlIlIIl, String llllllllllllllIllIllIIllIIlIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIllIIllIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIllIIlIlIII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIIII[5]), "DES");
            Cipher llllllllllllllIllIllIIllIIlIlIll = Cipher.getInstance("DES");
            llllllllllllllIllIllIIllIIlIlIll.init(lIlIlIIIIIIII[2], llllllllllllllIllIllIIllIIlIllII);
            return new String(llllllllllllllIllIllIIllIIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIllIIlIlIlI) {
            llllllllllllllIllIllIIllIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

