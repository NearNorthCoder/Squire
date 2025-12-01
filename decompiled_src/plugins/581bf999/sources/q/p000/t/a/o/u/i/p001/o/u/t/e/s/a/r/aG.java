package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Handling Tumeken P3 Prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aG  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aG.class */
public class aG extends W {
    private /* synthetic */ Prayer dE;
    private static /* synthetic */ int[] llIIIlIIIII;

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        SquireAutoTOA squireAutoTOA = this.cm;
        int[] iArr = new int[llIIIlIIIII[1]];
        iArr[llIIIlIIIII[2]] = llIIIlIIIII[3];
        iArr[llIIIlIIIII[4]] = llIIIlIIIII[5];
        return squireAutoTOA.a(iArr);
    }

    private static boolean lIIlllIlllIIll(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return aL();
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        Prayer prayer;
        NPC npc = npcSpawned.getNpc();
        if (lIIlllIlllIIlI(npc.getId(), llIIIlIIIII[7])) {
            if (lIIlllIlllIIlI(npc.getGraphic(), llIIIlIIIII[8])) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                "".length();
                if ("  ".length() > "   ".length()) {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            this.dE = prayer;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        return lIIlllIlllIIIl(this.dE) ? List.of(aQ()) : List.of(aQ(), this.dE);
    }

    private static void lIIlllIlllIIII() {
        llIIIlIIIII = new int[9];
        llIIIlIIIII[0] = (-((-3377) & 4020)) & (-16429) & 32767;
        llIIIlIIIII[1] = "  ".length();
        llIIIlIIIII[2] = (244 ^ 197) & ((31 ^ 46) ^ (-1));
        llIIIlIIIII[3] = (-((-8657) & 25557)) & (-4097) & 32758;
        llIIIlIIIII[4] = " ".length();
        llIIIlIIIII[5] = (-((-11301) & 31789)) & (-1) & 32252;
        llIIIlIIIII[6] = (-12651) & 14831;
        llIIIlIIIII[7] = (-((-3233) & 7358)) & (-16899) & 32767;
        llIIIlIIIII[8] = (-822) & 3007;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return llIIIlIIIII[0];
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (!lIIlllIlllIIlI(projectileSpawned.getProjectile().getId(), llIIIlIIIII[6])) {
            if (lIIlllIlllIIll(C0057f.E.contains(Integer.valueOf(projectileSpawned.getProjectile().getId())) ? 1 : 0)) {
                this.dE = Prayer.PROTECT_FROM_MISSILES;
                return;
            }
            return;
        }
        this.dE = Prayer.PROTECT_FROM_MAGIC;
        "".length();
        if (((17 ^ 100) ^ (20 ^ 101)) <= " ".length()) {
        }
    }

    @Inject
    public aG(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dE = null;
    }

    private static boolean lIIlllIlllIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlllIlllIIIl(Object obj) {
        return obj == null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    static {
        lIIlllIlllIIII();
    }
}
