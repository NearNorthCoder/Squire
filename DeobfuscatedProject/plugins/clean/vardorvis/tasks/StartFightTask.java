/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Start Fight", priority=10000, blocking=true)
public class StartFightTask
extends VardorvisTaskBase {

    @Override
    public boolean l() {
        p var1;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIlllII(this.z ? 1 : 0)) {
            return lIlIlIIlllIll[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIlllIl(var1.x.getInteracting()) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIlllII(var1.x.getInteracting().getName().equals(lIlIlIIlllIlI[lIlIlIIlllIll[0]]) ? 1 : 0)) {
            return lIlIlIIlllIll[1];
        }
        int var2 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIlIlIIlllIll[1]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[0]] = lIlIlIIlllIlI[lIlIlIIlllIll[2]];
            return item.hasAction(stringArray);
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIllllI(var2, var1.t.food())) {
            var1.s.c(lIlIlIIlllIll[1]);
            return lIlIlIIlllIll[0];
        }
        this.y.interact(lIlIlIIlllIlI[lIlIlIIlllIll[1]]);
        return lIlIlIIlllIll[1];
    }

    private static boolean lIlllllIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var3);
    }

    private static void lIlllllIIIllIlI() {
        lIlIlIIlllIlI = new String[lIlIlIIlllIll[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Vardorvis";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Attack";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[2]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Eat";
    }

    @Inject
    protected StartFightTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIllIll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIllIlI();
    }

    private static boolean lIlllllIIIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllIIIlllIl(Object object) {
        return object != null;
    }
}

