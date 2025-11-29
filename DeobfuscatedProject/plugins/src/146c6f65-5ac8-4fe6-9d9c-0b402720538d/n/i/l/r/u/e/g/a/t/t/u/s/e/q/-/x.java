/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;

@TaskDesc(name="Idle")
public class x
extends n {
    private static /* synthetic */ int[] llIIllIllIll;

    @Inject
    public x(c c2) {
        d[] dArray = new d[llIIllIllIll[0]];
        dArray[x.llIIllIllIll[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
    }

    @Override
    public boolean be() {
        return llIIllIllIll[0];
    }

    private static void lllllllIIlllII() {
        llIIllIllIll = new int[2];
        x.llIIllIllIll[0] = " ".length();
        x.llIIllIllIll[1] = (0xC7 ^ 0x97 ^ (0xE8 ^ 0xAE)) & (160 + 106 - 150 + 55 ^ 117 + 78 - 147 + 141 ^ -" ".length());
    }

    static {
        x.lllllllIIlllII();
    }
}

