/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 */
package gg.squire.vardorvis.tasks;

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
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Clicking Spores", priority=6000, blocking=true)
public class ClickingSporesTask
extends VardorvisTaskBase {
    private static  int ao;

    private  List<Widget> ap;

    @Inject
    protected ClickingSporesTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
        this.ap = new ArrayList<Widget>();
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
        void var1;
        Widget var2;
        v var3;
        int n2 = lIlIlIIIIIIII[0];
        this.ap.clear();
        int var4 = lIlIlIIIIIIII[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIllI(var4, lIlIlIIIIIIII[1])) {
            var2 = var3.w.getWidget(ao - var4);
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlll(var2)) {
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII(var2.isVisible() ? 1 : 0)) {

                    }
                } else {
                    ++var1;
                    var3.ap.add(var2);

                }
            }
            ++var4;

            if (1 != -1) continue;
            return ((5 ^ 0x5E ^ 2) & (0x17 ^ 0x1F ^ (0xC1 ^ 0x90) ^ -1)) != 0;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII((int)var1)) {
            return lIlIlIIIIIIII[0];
        }
        Collections.shuffle(var3.ap);
        var4 = lIlIlIIIIIIII[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIllI(var4, lIlIlIIIIIIII[2])) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII(var3.ap.size())) {
                return lIlIlIIIIIIII[0];
            }
            var2 = var3.ap.get(lIlIlIIIIIIII[0]);
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlll(var2)) {
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIlIII(var2.isVisible() ? 1 : 0)) {

                    if (3 <= -1) {
                        return ((0x96 ^ 0xB1 ^ (0x96 ^ 0x92)) & (0xA3 ^ 0xBB ^ (0xF9 ^ 0xC2) ^ -1)) != 0;
                    }
                } else {
                    var2.interact(lIlIIllllllll[lIlIlIIIIIIII[0]]);
                    var3.ap.remove(lIlIlIIIIIIII[0]);

                }
            }
            ++var4;

            return false;
        }
        return lIlIlIIIIIIII[3];
    }

    private static void lIllllIIllIIlII() {
        lIlIIllllllll = new String[lIlIlIIIIIIII[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIIllllllll[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIlIlIIIIIIII[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Destroy";
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlIl();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.lIllllIIllIIlII();
        ao = lIlIlIIIIIIII[4];
    }

    private static boolean lIllllIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

