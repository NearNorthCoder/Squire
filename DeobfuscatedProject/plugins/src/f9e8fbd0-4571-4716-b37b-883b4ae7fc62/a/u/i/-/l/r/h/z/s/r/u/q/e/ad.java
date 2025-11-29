/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.k;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

public abstract class ad
extends Task {
    protected final /* synthetic */ SquireZulrahConfig aA;
    private static /* synthetic */ int[] lIllIllIllIlI;
    protected final /* synthetic */ v az;
    @Inject
    protected /* synthetic */ SquireZulrah E;
    protected final /* synthetic */ Client aB;

    protected k C() {
        return this.az.V().C();
    }

    protected ad(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        this.az = v2;
        this.aB = client;
        this.aA = squireZulrahConfig;
    }

    static {
        ad.llIIlIIlIlIIIIl();
    }

    public boolean run() {
        ad llllllllllllllIllIIIlIIlllIlIIlI;
        if (ad.llIIlIIlIlIIIlI(this.aB.isInInstancedRegion() ? 1 : 0)) {
            return lIllIllIllIlI[0];
        }
        if (ad.llIIlIIlIlIIIll(llllllllllllllIllIIIlIIlllIlIIlI.az.V())) {
            return lIllIllIllIlI[0];
        }
        return this.ac();
    }

    private static boolean llIIlIIlIlIIIll(Object object) {
        return object == null;
    }

    private static boolean llIIlIIlIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static void llIIlIIlIlIIIIl() {
        lIllIllIllIlI = new int[1];
        ad.lIllIllIllIlI[0] = (107 + 163 - 237 + 139 ^ 56 + 50 - 37 + 117) & (7 ^ 0x6D ^ (0xFE ^ 0x82) ^ -" ".length());
    }

    protected WorldPoint ai() {
        return this.C().a(this.az.X());
    }

    public abstract boolean ac();
}

