package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.client.Static;
@TaskDesc(name = "Handling zebak prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bW  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bW.class */
public class bW extends W {
    private /* synthetic */ Prayer dE;
    private static final /* synthetic */ int hg;
    private /* synthetic */ int hh;
    private static /* synthetic */ int[] lIllIIlIIlI;

    private static boolean lIIlIlIlllIlIl(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (!lIIlIlIlllIlIl(projectileSpawned.getProjectile().getId(), lIllIIlIIlI[4])) {
            if (lIIlIlIlllIlll(C0057f.E.contains(Integer.valueOf(projectileSpawned.getProjectile().getId())) ? 1 : 0)) {
                this.dE = Prayer.PROTECT_FROM_MISSILES;
                return;
            }
            return;
        }
        this.dE = Prayer.PROTECT_FROM_MAGIC;
        "".length();
        if ((-"   ".length()) >= 0) {
        }
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        if (lIIlIlIlllIlIl(graphicsObjectCreated.getGraphicsObject().getId(), lIllIIlIIlI[5])) {
            this.hh = Static.getClient().getTickCount() + lIllIIlIIlI[6];
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    private static boolean lIIlIlIllllIII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIlIlllIlII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIlllIlll(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return lIllIIlIIlI[2];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        NPC b = this.cm.b();
        if (lIIlIlIlllIlII(b)) {
            return List.of(aQ(), this.dE);
        }
        int llllllllllllllllIlIlIlIIIIIIIIII = (b.getHealthRatio() * lIllIIlIIlI[0]) / b.getHealthScale();
        return (lIIlIlIlllIlIl(Static.getClient().getTickCount(), this.hh) && lIIlIlIlllIllI(llllllllllllllllIlIlIlIIIIIIIIII, lIllIIlIIlI[1])) ? List.of(aQ(), Prayer.PROTECT_FROM_MAGIC) : List.of(aQ(), this.dE);
    }

    private static void lIIlIlIlllIIll() {
        lIllIIlIIlI = new int[10];
        lIllIIlIIlI[0] = 51 ^ 87;
        lIllIIlIIlI[1] = (252 ^ 191) ^ (74 ^ 16);
        lIllIIlIIlI[2] = (-171) & 15870;
        lIllIIlIIlI[3] = " ".length();
        lIllIIlIIlI[4] = (-((-31811) & 32603)) & (-17507) & 20479;
        lIllIIlIIlI[5] = (-2565) & 2941;
        lIllIIlIIlI[6] = "  ".length();
        lIllIIlIIlI[7] = (-20485) & 32214;
        lIllIIlIIlI[8] = (-16386) & 28117;
        lIllIIlIIlI[9] = ((84 ^ 22) ^ (202 ^ 142)) & (((((165 + 161) - 300) + 170) ^ (((156 + 62) - 170) + 146)) ^ (-" ".length()));
    }

    private static boolean lIIlIlIlllIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return lIllIIlIIlI[3];
    }

    static {
        lIIlIlIlllIIll();
        hg = lIllIIlIIlI[5];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        return this.cm.a(npc -> {
            if (!lIIlIlIllllIII(npc.getId(), lIllIIlIIlI[7]) || lIIlIlIlllIlIl(npc.getId(), lIllIIlIIlI[8])) {
                ?? r0 = lIllIIlIIlI[3];
                "".length();
                return (-" ".length()) >= ((152 ^ 189) & ((149 ^ 176) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIlIIlI[9];
        });
    }

    @Inject
    public bW(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dE = Prayer.PROTECT_FROM_MISSILES;
    }
}
