package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Dodging Solidify Attack", priority = 30, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bC  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bC.class */
public class bC extends bG {
    private static /* synthetic */ int[] llIIIIllllI;
    private /* synthetic */ WorldPoint gc;
    private static final /* synthetic */ int gb;
    @Inject
    private /* synthetic */ bD gd;

    private static boolean lIIlllIllIllll(int i, int i2) {
        return i == i2;
    }

    private static void lIIlllIllIlIll() {
        llIIIIllllI = new int[4];
        llIIIIllllI[0] = " ".length();
        llIIIIllllI[1] = ((222 ^ 144) ^ (192 ^ 197)) & (((83 ^ 0) ^ (139 ^ 147)) ^ (-" ".length()));
        llIIIIllllI[2] = (-((-9) & 22285)) & (-1) & 24486;
        llIIIIllllI[3] = "  ".length();
    }

    static {
        lIIlllIllIlIll();
        gb = llIIIIllllI[2];
    }

    private static boolean lIIlllIllIlllI(int i) {
        return i == 0;
    }

    private static boolean lIIlllIllIllIl(Object obj) {
        return obj != null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.gc = null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    @Inject
    protected bC(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (lIIlllIllIllll(projectileSpawned.getProjectile().getId(), llIIIIllllI[2])) {
            this.gc = Players.getLocal().getWorldLocation();
        }
    }

    private static boolean lIIlllIllIllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        int[] iArr = new int[llIIIIllllI[0]];
        iArr[llIIIIllllI[1]] = llIIIIllllI[2];
        if (lIIlllIllIllII(Projectiles.getAll(iArr).isEmpty() ? 1 : 0)) {
            this.gc = null;
            return llIIIIllllI[1];
        }
        if (lIIlllIllIllIl(this.gc)) {
            WorldPoint dy = this.gc.dy(llIIIIllllI[0]);
            if (lIIlllIllIlllI(dy.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.setDestination(dy);
                this.gd.sleep(llIIIIllllI[3]);
                this.gc = null;
                return llIIIIllllI[0];
            }
        }
        return llIIIIllllI[1];
    }
}
