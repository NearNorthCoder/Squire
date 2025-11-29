/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.widgets.Prayers
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Turning off prayers -> TurningoffprayersTask */
@TaskDesc(name="Turning off prayers", priority=0x7FFFFFFF, blocking=true)
public class TurningOffPrayersTask
extends n_Unknown {
    private static /* synthetic */ int[] llIlIIIllIII;

    @Override
    public boolean be() {
        if (ab.lIIIIIIlIIlllll(Prayers.anyActive() ? 1 : 0)) {
            return llIlIIIllIII[1];
        }
        Prayers.disableAll();
        return llIlIIIllIII[0];
    }

    @Inject
    public ab(c c2) {
        d[] dArray = new d[llIlIIIllIII[0]];
        dArray[ab.llIlIIIllIII[1]] = d.OUTSIDE;
        super(c2, dArray);
    }

    static {
        ab.lIIIIIIlIIllllI();
    }

    private static boolean lIIIIIIlIIlllll(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIIlIIllllI() {
        llIlIIIllIII = new int[2];
        ab.llIlIIIllIII[0] = 1;
        ab.llIlIIIllIII[1] = (0xCD ^ 0xA7 ^ (0x42 ^ 0x68)) & (0x51 ^ 0x60 ^ (0x4F ^ 0x3E) ^ -1);
    }
}

