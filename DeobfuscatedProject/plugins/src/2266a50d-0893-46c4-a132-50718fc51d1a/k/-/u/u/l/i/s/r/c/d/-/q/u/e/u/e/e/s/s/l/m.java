/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;

@TaskDesc(name="Test Task", priority=0x7FFFFFFF)
public class m
extends Task {
    private static /* synthetic */ int[] lIllIlllIlIl;
    final /* synthetic */ SquireDukeSucellus an;
    final /* synthetic */ a ao;

    static {
        m.lllIlIIlllIlII();
    }

    private static void lllIlIIlllIlII() {
        lIllIlllIlIl = new int[1];
        m.lIllIlllIlIl[0] = (247 + 95 - 223 + 133 ^ 75 + 63 - 2 + 57) & (162 + 2 - -3 + 1 ^ 20 + 148 - 145 + 126 ^ -" ".length());
    }

    public boolean run() {
        return lIllIlllIlIl[0];
    }

    @Inject
    public m(SquireDukeSucellus squireDukeSucellus) {
        this.an = squireDukeSucellus;
        this.ao = squireDukeSucellus.s();
    }
}

