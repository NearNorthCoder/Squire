/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 */
package r.e.o.r.h.s.b.e.q.l.e.u.-.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c;

public abstract class d
extends Task {
    private static /* synthetic */ int[] lllIlIIIIllI;
    private final /* synthetic */ SquireHerblore j;
    private final /* synthetic */ HerbloreConfig i;
    private final /* synthetic */ List<c> h;

    public abstract boolean h();

    private static boolean lIIIlIlllIIIIIl(int n) {
        return n != 0;
    }

    public List<c> i() {
        return this.h;
    }

    public boolean run() {
        if (d.lIIIlIlllIIIIIl(this.h.contains((Object)this.i.method()) ? 1 : 0)) {
            return this.h();
        }
        return lllIlIIIIllI[0];
    }

    private static void lIIIlIllIllllll() {
        lllIlIIIIllI = new int[1];
        d.lllIlIIIIllI[0] = (0x61 ^ 0x45) & ~(0x21 ^ 5);
    }

    public SquireHerblore k() {
        return this.j;
    }

    static {
        d.lIIIlIllIllllll();
    }

    private static boolean lIIIlIlllIIIIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Inject
    public d(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig, c ... cArray) {
        List list;
        this.j = squireHerblore;
        if (d.lIIIlIlllIIIIII(cArray)) {
            list = Collections.emptyList();
            0;
            if (3 == 0) {
                throw null;
            }
        } else {
            void var1;
            list = Arrays.asList(var1);
        }
        this.h = list;
        this.i = herbloreConfig;
    }

    public HerbloreConfig j() {
        return this.i;
    }
}

