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

/* TASK: Clicking Spores -> ClickingsporesTask */
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
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[2] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[3] = 1;
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
        void var9;
        Widget var8;
        v var4;
        int n2 = lIlIlIIIIIIII[0];
        this.ap.clear();
        int var1 = lIlIlIIIIIIII[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIllI(var1, lIlIlIIIIIIII[1])) {
            var8 = var4.w.getWidget(ao - var1);
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlll(var8)) {
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII(var8.isVisible() ? 1 : 0)) {
                    0;
                    
                    }
                } else {
                    ++var9;
                    var4.ap.add(var8);
                    0;
                }
            }
            ++var1;
            0;
            if (1 != -1) continue;
            return ((5 ^ 0x5E ^ 2) & (0x17 ^ 0x1F ^ (0xC1 ^ 0x90) ^ -1)) != 0;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII((int)var9)) {
            return lIlIlIIIIIIII[0];
        }
        Collections.shuffle(var4.ap);
        var1 = lIlIlIIIIIIII[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIllI(var1, lIlIlIIIIIIII[2])) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII(var4.ap.size())) {
                return lIlIlIIIIIIII[0];
            }
            var8 = var4.ap.get(lIlIlIIIIIIII[0]);
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlll(var8)) {
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII(var8.isVisible() ? 1 : 0)) {
                    0;
                    if (3 <= -1) {
                        return ((0x96 ^ 0xB1 ^ (0x96 ^ 0x92)) & (0xA3 ^ 0xBB ^ (0xF9 ^ 0xC2) ^ -1)) != 0;
                    }
                } else {
                    var8.interact(lIlIIllllllll[lIlIlIIIIIIII[0]]);
                    var4.ap.remove(lIlIlIIIIIIII[0]);
                    0;
                }
            }
            ++var1;
            0;
            
            return false;
        }
        return lIlIlIIIIIIII[3];
    }

    private static void lIllllIIllIIlII() {
        lIlIIllllllll = new String[lIlIlIIIIIIII[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIIllllllll[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v."Destroy";
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlIl();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlII();
        ao = lIlIlIIIIIIII[4];
    }

    private static String lIllllIIllIIIll(String var5, String var7) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIIII[5]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIlIlIIIIIIII[2], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

