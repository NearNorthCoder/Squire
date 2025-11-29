/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;

public abstract class l
extends Task {
    protected final /* synthetic */ SquireTemporossConfig as;
    protected final /* synthetic */ SquireTempoross au;
    private static /* synthetic */ int[] lIIllIllIIlll;
    protected final /* synthetic */ a ar;
    protected final /* synthetic */ Client at;

    public boolean run() {
        l llllllllllllllIlllIlllIlIIlIlIII;
        if (l.lIllIIIlIIlIlIl(this.at.isInInstancedRegion() ? 1 : 0)) {
            return lIIllIllIIlll[0];
        }
        if (l.lIllIIIlIIlIlIl(llllllllllllllIlllIlllIlIIlIlIII.ak() ? 1 : 0)) {
            return lIIllIllIIlll[0];
        }
        if (l.lIllIIIlIIlIllI(llllllllllllllIlllIlllIlIIlIlIII.ar.N())) {
            return lIIllIllIIlll[0];
        }
        if (l.lIllIIIlIIlIlIl(llllllllllllllIlllIlllIlIIlIlIII.as.solo() ? 1 : 0)) {
            int[] nArray = new int[lIIllIllIIlll[1]];
            nArray[l.lIIllIllIIlll[0]] = lIIllIllIIlll[2];
            NPC llllllllllllllIlllIlllIlIIlIIlll = NPCs.getNearest((WorldPoint)llllllllllllllIlllIlllIlIIlIlIII.ar.N().ag(), (int[])nArray);
            if (l.lIllIIIlIIlIlll(llllllllllllllIlllIlllIlIIlIIlll)) {
                llllllllllllllIlllIlllIlIIlIlIII.ar.d(lIIllIllIIlll[1]);
            }
        }
        if (l.lIllIIIlIIllIII(llllllllllllllIlllIlllIlIIlIlIII.ar.k() ? 1 : 0)) {
            return lIIllIllIIlll[0];
        }
        return this.al();
    }

    protected l(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        this.ar = a2;
        this.as = squireTemporossConfig;
        this.at = client;
        this.au = squireTempoross;
    }

    public abstract boolean ak();

    private static boolean lIllIIIlIIllIII(int n2) {
        return n2 != 0;
    }

    public abstract boolean al();

    static {
        l.lIllIIIlIIlIlII();
    }

    private static boolean lIllIIIlIIlIllI(Object object) {
        return object == null;
    }

    private static void lIllIIIlIIlIlII() {
        lIIllIllIIlll = new int[3];
        l.lIIllIllIIlll[0] = (0xB1 ^ 0xA4) & ~(0x10 ^ 5);
        l.lIIllIllIIlll[1] = " ".length();
        l.lIIllIllIIlll[2] = -(0xFFFFFB77 & 0x44B9) & (0xFFFFEBFF & 0x7D7B);
    }

    private static boolean lIllIIIlIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIIIlIIlIlIl(int n2) {
        return n2 == 0;
    }
}

