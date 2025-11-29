package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Gear;
@TaskDesc(name = "Swapping Gear", priority = Integer.MAX_VALUE)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.k  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/k.class */
public class k extends Task {
    private static /* synthetic */ int[] lIIIlIIIlIllI;
    private final /* synthetic */ a ae;
    private final /* synthetic */ Client ad;
    private final /* synthetic */ SquireNightmareZone ab;
    private final /* synthetic */ SquireNightmareZoneConfig ac;

    private static boolean lIIllllIlIIIlll(int i) {
        return i != 0;
    }

    private static void lIIllllIlIIIlIl() {
        lIIIlIIIlIllI = new int[1];
        lIIIlIIIlIllI[0] = (213 ^ 155) & ((79 ^ 1) ^ (-1));
    }

    static {
        lIIllllIlIIIlIl();
    }

    @Inject
    public k(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client, a aVar) {
        this.ab = squireNightmareZone;
        this.ac = squireNightmareZoneConfig;
        this.ad = client;
        this.ae = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean run() {
        return lIIllllIlIIIllI(this.ad.isInInstancedRegion() ? 1 : 0) ? lIIIlIIIlIllI[0] : lIIllllIlIIIlll(this.ab.g() ? 1 : 0) ? Gear.swapTo(this.ae.i()) : Gear.swapTo(this.ab.h());
    }

    private static boolean lIIllllIlIIIllI(int i) {
        return i == 0;
    }
}
