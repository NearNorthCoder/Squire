/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;

public abstract class x
extends Task {
    private static /* synthetic */ int[] lIIlllIIlIIll;
    protected final /* synthetic */ SquireTempoross aB;
    protected final /* synthetic */ a ay;
    protected final /* synthetic */ Client aA;
    protected final /* synthetic */ SquireTemporossConfig az;

    public boolean run() {
        if (x.lIllIIlIlIlIIII(this.aA.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllIIlIIll[0];
        }
        this.ay.w();
        this.ay.v();
        return this.al();
    }

    private static void lIllIIlIlIIllll() {
        lIIlllIIlIIll = new int[1];
        x.lIIlllIIlIIll[0] = (0xAD ^ 0x91) & ~(0xFE ^ 0xC2);
    }

    public abstract boolean al();

    protected x(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        this.ay = a2;
        this.az = squireTemporossConfig;
        this.aA = client;
        this.aB = squireTempoross;
    }

    static {
        x.lIllIIlIlIIllll();
    }

    private static boolean lIllIIlIlIlIIII(int n2) {
        return n2 != 0;
    }
}

