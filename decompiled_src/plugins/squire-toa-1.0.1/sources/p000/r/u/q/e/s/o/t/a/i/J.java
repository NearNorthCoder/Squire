package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Handling Tumeken P3 Prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.J  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/J.class */
public class J extends z {
    private static /* synthetic */ int[] lIIlllllllIlI;
    private /* synthetic */ Prayer ba;

    private static boolean lIllIlIllIIIIll(int i) {
        return i != 0;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean I() {
        return C();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public EnumC0013n J() {
        return this.aT.prayFlickLastWarden();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean C() {
        SquireTOA squireTOA = this.aS;
        int[] iArr = new int[lIIlllllllIlI[1]];
        iArr[lIIlllllllIlI[2]] = lIIlllllllIlI[3];
        iArr[lIIlllllllIlI[4]] = lIIlllllllIlI[5];
        return squireTOA.a(iArr);
    }

    private static void lIllIlIllIIIIII() {
        lIIlllllllIlI = new int[9];
        lIIlllllllIlI[0] = (-167) & 15862;
        lIIlllllllIlI[1] = "  ".length();
        lIIlllllllIlI[2] = ((((224 + 195) - 286) + 99) ^ (((104 + 170) - 241) + 159)) & (((((68 + 13) - 39) + 127) ^ (((12 + 22) - (-35)) + 60)) ^ (-" ".length()));
        lIIlllllllIlI[3] = (-((-27649) & 32261)) & (-1) & 16374;
        lIIlllllllIlI[4] = " ".length();
        lIIlllllllIlI[5] = (-20996) & 32759;
        lIIlllllllIlI[6] = (-9819) & 11999;
        lIIlllllllIlI[7] = (-16396) & 28139;
        lIIlllllllIlI[8] = (-((-666) & 10203)) & (-16929) & 28651;
    }

    private static boolean lIllIlIllIIIIIl(Object obj) {
        return obj == null;
    }

    @Inject
    public J(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.ba = null;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (!lIllIlIllIIIIlI(projectileSpawned.getProjectile().getId(), lIIlllllllIlI[6])) {
            if (lIllIlIllIIIIll(C0001b.r.contains(Integer.valueOf(projectileSpawned.getProjectile().getId())) ? 1 : 0)) {
                this.ba = Prayer.PROTECT_FROM_MISSILES;
                return;
            }
            return;
        }
        this.ba = Prayer.PROTECT_FROM_MAGIC;
        "".length();
        if (0 != 0) {
        }
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public int F() {
        return lIIlllllllIlI[0];
    }

    static {
        lIllIlIllIIIIII();
    }

    private static boolean lIllIlIllIIIIlI(int i, int i2) {
        return i == i2;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public List<Prayer> E() {
        return lIllIlIllIIIIIl(this.ba) ? List.of(H()) : List.of(H(), this.ba);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        Prayer prayer;
        NPC npc = npcSpawned.getNpc();
        if (lIllIlIllIIIIlI(npc.getId(), lIIlllllllIlI[7])) {
            if (lIllIlIllIIIIlI(npc.getGraphic(), lIIlllllllIlI[8])) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            this.ba = prayer;
        }
    }
}
