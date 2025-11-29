package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Dodging electric skull", priority = 30, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bB  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bB.class */
public class bB extends bG {
    private static final /* synthetic */ int fY;
    private static final /* synthetic */ int fX;
    private /* synthetic */ int ga;
    private static /* synthetic */ int[] llIIlIlllll;
    private /* synthetic */ WorldPoint fZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        if (!lIlIIIIlllIIII(this.fZ) || lIlIIIIlllIIIl(this.cu.getTickCount(), this.ga)) {
            this.fZ = null;
            return llIIlIlllll[0];
        }
        int distanceTo = this.fZ.distanceTo(Players.getLocal().getWorldLocation());
        if (!lIlIIIIlllIIlI(distanceTo, llIIlIlllll[1]) || lIlIIIIlllIIIl(distanceTo, llIIlIlllll[2])) {
            return llIIlIlllll[1];
        }
        this.aY.a(llIIlIlllll[3]);
        WorldPoint cn = cn();
        if (lIlIIIIlllIIll(cn)) {
            cn = cm();
            if (lIlIIIIlllIIll(cn)) {
                return llIIlIlllll[0];
            }
        }
        Movement.setDestination(cn);
        return llIIlIlllll[1];
    }

    private static boolean lIlIIIIlllIllI(int i) {
        return i == 0;
    }

    private static boolean lIlIIIIlllIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIIlllIIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIIIIlllIlIl(int i) {
        return i != 0;
    }

    static {
        lIlIIIIllIllll();
        fX = llIIlIlllll[7];
        fY = llIIlIlllll[9];
    }

    private static boolean lIlIIIIlllIlII(int i, int i2) {
        return i == i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIIIlllIIIl(int i, int i2) {
        return i > i2;
    }

    private WorldPoint cn() {
        WorldPoint[] worldPointArr = new WorldPoint[llIIlIlllll[2]];
        worldPointArr[llIIlIlllll[0]] = this.fZ.dx(llIIlIlllll[5]);
        worldPointArr[llIIlIlllll[1]] = this.fZ.dx(llIIlIlllll[1]);
        worldPointArr[llIIlIlllll[6]] = this.fZ.dy(llIIlIlllll[5]);
        worldPointArr[llIIlIlllll[4]] = this.fZ.dy(llIIlIlllll[1]);
        return (WorldPoint) Stream.of((Object[]) worldPointArr).filter(worldPoint -> {
            if (lIlIIIIlllIllI(worldPoint.equals(this.fZ) ? 1 : 0)) {
                ?? r0 = llIIlIlllll[1];
                "".length();
                return 0 != 0 ? ((55 ^ 21) ^ (241 ^ 136)) & (((((69 + 194) - 93) + 38) ^ (((81 + 28) - 44) + 74)) ^ (-" ".length())) : r0;
            }
            return llIIlIlllll[0];
        }).filter(worldPoint2 -> {
            if (lIlIIIIlllIllI(co().getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                ?? r0 = llIIlIlllll[1];
                "".length();
                return "   ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIlllll[0];
        }).filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint3 -> {
            return worldPoint3.distanceToHypotenuse(Players.getLocal().getWorldLocation());
        })).orElse(null);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        super.r();
        this.fZ = null;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        WorldPoint fromLocal = WorldPoint.fromLocal(this.cu, graphicsObjectCreated.getGraphicsObject().getLocation());
        if (!lIlIIIIlllIlII(graphicsObjectCreated.getGraphicsObject().getId(), llIIlIlllll[7])) {
            if (lIlIIIIlllIlII(graphicsObjectCreated.getGraphicsObject().getId(), llIIlIlllll[9]) && lIlIIIIlllIlIl(fromLocal.equals(this.fZ) ? 1 : 0)) {
                this.fZ = null;
            }
        } else if (lIlIIIIlllIIIl(fromLocal.distanceTo(Players.getLocal()), llIIlIlllll[2])) {
        } else {
            this.fZ = fromLocal;
            this.ga = this.cu.getTickCount() + llIIlIlllll[8];
            "".length();
            if ("   ".length() < 0) {
            }
        }
    }

    private WorldPoint cm() {
        return (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(llIIlIlllll[4]).toWorldPointList().stream().filter(worldPoint -> {
            if (lIlIIIIlllIIIl(worldPoint.distanceTo(this.fZ), llIIlIlllll[2])) {
                ?? r0 = llIIlIlllll[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIlllll[0];
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }

    private static void lIlIIIIllIllll() {
        llIIlIlllll = new int[10];
        llIIlIlllll[0] = ((129 ^ 174) ^ (129 ^ 155)) & (((178 ^ 189) ^ (126 ^ 68)) ^ (-" ".length()));
        llIIlIlllll[1] = " ".length();
        llIIlIlllll[2] = 137 ^ 141;
        llIIlIlllll[3] = (77 ^ 87) ^ (11 ^ 50);
        llIIlIlllll[4] = "   ".length();
        llIIlIlllll[5] = -" ".length();
        llIIlIlllll[6] = "  ".length();
        llIIlIlllll[7] = (-((-24869) & 31605)) & (-24577) & 32759;
        llIIlIlllll[8] = (163 ^ 165) ^ "   ".length();
        llIIlIlllll[9] = (-29225) & 31422;
    }

    @Inject
    protected bB(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIlIIIIlllIIll(Object obj) {
        return obj == null;
    }
}
