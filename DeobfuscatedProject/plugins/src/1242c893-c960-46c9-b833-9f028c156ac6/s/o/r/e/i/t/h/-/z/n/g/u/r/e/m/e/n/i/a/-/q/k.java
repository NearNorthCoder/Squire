/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Gear
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Gear;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.a;

@TaskDesc(name="Swapping Gear", priority=0x7FFFFFFF)
public class k
extends Task {
    private static /* synthetic */ int[] lIIIlIIIlIllI;
    private final /* synthetic */ a ae;
    private final /* synthetic */ Client ad;
    private final /* synthetic */ SquireNightmareZone ab;
    private final /* synthetic */ SquireNightmareZoneConfig ac;

    private static boolean lIIllllIlIIIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIllllIlIIIlIl() {
        lIIIlIIIlIllI = new int[1];
        k.lIIIlIIIlIllI[0] = (0xD5 ^ 0x9B) & ~(0x4F ^ 1);
    }

    static {
        k.lIIllllIlIIIlIl();
    }

    @Inject
    public k(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client, a a2) {
        this.ab = squireNightmareZone;
        this.ac = squireNightmareZoneConfig;
        this.ad = client;
        this.ae = a2;
    }

    public boolean run() {
        k lllllllllllllllIIIlIIIIlIIIIlIIl;
        if (k.lIIllllIlIIIllI(this.ad.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIllI[0];
        }
        if (k.lIIllllIlIIIlll(lllllllllllllllIIIlIIIIlIIIIlIIl.ab.g() ? 1 : 0)) {
            return Gear.swapTo((int[])lllllllllllllllIIIlIIIIlIIIIlIIl.ae.i());
        }
        return Gear.swapTo((int[])this.ab.h());
    }

    private static boolean lIIllllIlIIIllI(int n2) {
        return n2 == 0;
    }
}

