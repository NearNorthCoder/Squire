package p000.r.u.q.e.s.o.t.a.i;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Prayer;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Handling zebak prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.R  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/R.class */
public class R extends z {
    private /* synthetic */ Prayer ba;
    private static /* synthetic */ int[] lIIlllllIlllI;

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public List<Prayer> E() {
        return List.of(H(), this.ba);
    }

    private static boolean lIllIlIlIIlllll(int i, int i2) {
        return i != i2;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public EnumC0013n J() {
        return this.aT.prayModeZebak();
    }

    @Inject
    public R(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.ba = Prayer.PROTECT_FROM_MISSILES;
    }

    static {
        lIllIlIlIIlllII();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public int F() {
        return lIIlllllIlllI[0];
    }

    private static boolean lIllIlIlIIllllI(int i) {
        return i != 0;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean C() {
        return this.aS.a(npc -> {
            if (!lIllIlIlIIlllll(npc.getId(), lIIlllllIlllI[3]) || lIllIlIlIIlllIl(npc.getId(), lIIlllllIlllI[4])) {
                ?? r0 = lIIlllllIlllI[1];
                "".length();
                return ((173 ^ 181) & ((176 ^ 168) ^ (-1))) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlllllIlllI[5];
        });
    }

    private static boolean lIllIlIlIIlllIl(int i, int i2) {
        return i == i2;
    }

    private static void lIllIlIlIIlllII() {
        lIIlllllIlllI = new int[6];
        lIIlllllIlllI[0] = (-9) & 15708;
        lIIlllllIlllI[1] = " ".length();
        lIIlllllIlllI[2] = (-((-10631) & 32215)) & (-801) & 24565;
        lIIlllllIlllI[3] = (-16909) & 28638;
        lIIlllllIlllI[4] = (-20522) & 32253;
        lIIlllllIlllI[5] = (66 ^ 34) & ((210 ^ 178) ^ (-1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean I() {
        return lIIlllllIlllI[1];
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (!lIllIlIlIIlllIl(projectileSpawned.getProjectile().getId(), lIIlllllIlllI[2])) {
            if (lIllIlIlIIllllI(C0001b.r.contains(Integer.valueOf(projectileSpawned.getProjectile().getId())) ? 1 : 0)) {
                this.ba = Prayer.PROTECT_FROM_MISSILES;
                return;
            }
            return;
        }
        this.ba = Prayer.PROTECT_FROM_MAGIC;
        "".length();
        if ("   ".length() != "   ".length()) {
        }
    }
}
