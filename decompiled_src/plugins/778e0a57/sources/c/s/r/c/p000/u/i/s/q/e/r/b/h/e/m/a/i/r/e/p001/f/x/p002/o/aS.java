package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Prayer Flicking", priority = 21000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aS  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aS.class */
public class aS extends aR {
    private static /* synthetic */ int[] lIlIIlllIIIl;

    static {
        llIllIlIlllIlI();
    }

    private static boolean llIllIlIllllIl(int i, int i2) {
        return i != i2;
    }

    private static boolean llIllIlIllllII(int i) {
        return i != 0;
    }

    private static void llIllIlIlllIlI() {
        lIlIIlllIIIl = new int[6];
        lIlIIlllIIIl[0] = " ".length();
        lIlIIlllIIIl[1] = (228 ^ 162) & ((65 ^ 7) ^ (-1));
        lIlIIlllIIIl[2] = (-89) & 1535;
        lIlIIlllIIIl[3] = (-((-18737) & 31537)) & (-162) & 14319;
        lIlIIlllIIIl[4] = "  ".length();
        lIlIIlllIIIl[5] = (159 ^ 183) ^ (61 ^ 31);
    }

    private static boolean llIllIlIlllIll(int i) {
        return i == 0;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (llIllIlIllllll(aE)) {
            aE = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(aE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    private static boolean llIllIlIlllllI(int i, int i2) {
        return i == i2;
    }

    @Inject
    protected aS(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private WorldPoint dW() {
        switch (this.ed.aI()) {
            case 0:
                return dP();
            case 1:
                return dN();
            default:
                return dq().getWorldLocation().dy(lIlIIlllIIIl[5]);
        }
    }

    private static boolean llIllIlIllllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        if (llIllIlIlllIll(ct() ? 1 : 0)) {
            if (llIllIlIllllII(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIlIIlllIIIl[0];
            }
            return lIlIIlllIIIl[1];
        } else if (llIllIlIllllII(this.ed.at() ? 1 : 0)) {
            return lIlIIlllIIIl[1];
        } else {
            ArrayList arrayList = new ArrayList();
            for (GraphicsObject graphicsObject : this.ec.getGraphicsObjects()) {
                if (!llIllIlIllllIl(graphicsObject.getId(), lIlIIlllIIIl[2]) || llIllIlIlllllI(graphicsObject.getId(), lIlIIlllIIIl[3])) {
                    arrayList.addAll(WorldPoint.fromLocal(this.ec, graphicsObject.getLocation()).createWorldArea(lIlIIlllIIIl[0]).toWorldPointList());
                    "".length();
                }
                "".length();
                if (((120 ^ 22) ^ (13 ^ 103)) <= 0) {
                    return ((47 ^ 19) ^ (155 ^ 171)) & (((186 ^ 164) ^ (9 ^ 27)) ^ (-" ".length()));
                }
            }
            if (llIllIlIllllII(arrayList.isEmpty() ? 1 : 0)) {
                if (llIllIlIllllll(this.ed.ax()) && !llIllIlIllllII(this.bS.getWorldLocation().equals(dW()) ? 1 : 0)) {
                    Movement.setDestination(dW());
                    return lIlIIlllIIIl[0];
                }
                return lIlIIlllIIIl[1];
            } else if (llIllIlIlllIll(arrayList.contains(this.bS.getWorldLocation()) ? 1 : 0) && llIllIlIlllIll(this.ed.ap().contains(this.bS.getWorldLocation()) ? 1 : 0)) {
                return lIlIIlllIIIl[1];
            } else {
                List worldPointList = this.bS.getWorldLocation().createWorldArea(lIlIIlllIIIl[4]).toWorldPointList();
                WorldPoint dW = dW();
                Movement.setDestination((WorldPoint) worldPointList.stream().filter(worldPoint -> {
                    if (llIllIlIllllII(Reachable.isWalkable(worldPoint) ? 1 : 0) && llIllIlIlllIll(arrayList.contains(worldPoint) ? 1 : 0) && llIllIlIlllIll(this.ed.ap().contains(this.bS.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = lIlIIlllIIIl[0];
                        "".length();
                        return (((17 ^ 60) ^ (157 ^ 189)) & (((((125 + 7) - 16) + 23) ^ (((109 + 33) - 18) + 10)) ^ (-" ".length()))) != (((61 ^ 113) ^ (104 ^ 62)) & (((27 ^ 38) ^ (112 ^ 87)) ^ (-" ".length()))) ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                    }
                    return lIlIIlllIIIl[1];
                }).min(Comparator.comparingInt(obj -> {
                    return ((WorldPoint) obj).distanceTo(this.bS);
                }).thenComparingDouble(obj2 -> {
                    return ((WorldPoint) obj2).distanceTo2DHypotenuse(dW);
                })).orElse(null));
                return lIlIIlllIIIl[0];
            }
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return null;
    }
}
