/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Attack Boss", priority=4000, blocking=true)
public class AttackBossTask
extends VardorvisTaskBase {
    private  List<Widget> ap;
    
    private static  int ao;

    private static boolean lIlllllIIllIIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean l() {
        int var1;
        int n2;
        u var2;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIII(this.z ? 1 : 0)) {
            return lIlIlIlIIIIII[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIII(var2.x.getWorldLocation().equals((Object)p) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIII(var2.x.getWorldLocation().equals((Object)q) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIII(var2.x.getWorldLocation().equals((Object)r) ? 1 : 0)) {
            return lIlIlIlIIIIII[0];
        }
        Actor var3 = Players.getLocal().getInteracting();
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIIl(var3) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIlI(var3.hasAction(lIlIlIIllllll[lIlIlIlIIIIII[0]]::equals) ? 1 : 0)) {
            n2 = lIlIlIlIIIIII[1];

            if (1 <= ((0x82 ^ 0xB1) & ~(0x68 ^ 0x5B))) {
                return false;
            }
        } else {
            n2 = lIlIlIlIIIIII[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIlI(var1 = n2)) {
            return lIlIlIlIIIIII[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIlI(var2.y.getWorldArea().getMeleeTiles(var2.w).contains(var2.x.getWorldLocation()) ? 1 : 0)) {
            var2.y.interact(lIlIlIIllllll[lIlIlIlIIIIII[1]]);
            return lIlIlIlIIIIII[1];
        }
        return lIlIlIlIIIIII[0];
    }

        return String.valueOf(var4);
    }

    private static boolean lIlllllIIllIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    protected AttackBossTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
        this.ap = new ArrayList<Widget>();
    }

    private static void lIlllllIIlIlllI() {
        lIlIlIIllllll = new String[lIlIlIlIIIIII[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIIllllll[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIlIIIIII[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Attack";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIIllllll[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIlIIIIII[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Attack";
    }

    private static boolean lIlllllIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIlIllll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIlIlllI();
        ao = lIlIlIlIIIIII[2];
    }

    private static boolean lIlllllIIllIIII(int n2) {
        return n2 == 0;
    }
}

