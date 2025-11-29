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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Dodging Fallig Crystals", priority = 21000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aJ  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aJ.class */
public class aJ extends aR {
    private static /* synthetic */ int[] lIlIlIIlIIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        if (llIlllIIlIllll(ct() ? 1 : 0)) {
            return lIlIlIIlIIlI[0];
        }
        ArrayList arrayList = new ArrayList();
        for (GraphicsObject graphicsObject : this.ec.getGraphicsObjects()) {
            if (llIlllIIllIIIl(graphicsObject.getId(), lIlIlIIlIIlI[1])) {
                arrayList.addAll(WorldPoint.fromLocal(this.ec, graphicsObject.getLocation()).createWorldArea(lIlIlIIlIIlI[2]).toWorldPointList());
                "".length();
            }
            "".length();
            if (" ".length() <= ((4 ^ 17) & ((12 ^ 25) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (!llIlllIIlIllll(arrayList.isEmpty() ? 1 : 0) || llIlllIIlIllll(arrayList.contains(this.bS.getWorldLocation()) ? 1 : 0)) {
            return lIlIlIIlIIlI[0];
        }
        WorldPoint worldPoint = (WorldPoint) this.bS.getWorldLocation().createWorldArea(lIlIlIIlIIlI[3]).toWorldPointList().stream().filter(worldPoint2 -> {
            if (llIlllIIllIIII(Reachable.isWalkable(worldPoint2) ? 1 : 0) && llIlllIIlIllll(arrayList.contains(worldPoint2) ? 1 : 0)) {
                ?? r0 = lIlIlIIlIIlI[2];
                "".length();
                return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIlIIlIIlI[0];
        }).min(Comparator.comparingInt(worldPoint3 -> {
            return worldPoint3.distanceTo(this.bS);
        })).orElse(null);
        return lIlIlIIlIIlI[2];
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (llIlllIIllIIlI(aE)) {
            aE = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(aE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    static {
        llIlllIIlIlllI();
    }

    private static void llIlllIIlIlllI() {
        lIlIlIIlIIlI = new int[4];
        lIlIlIIlIIlI[0] = ((((127 + 33) - 109) + 84) ^ (((89 + 0) - 82) + 150)) & (((114 ^ 116) ^ (122 ^ 102)) ^ (-" ".length()));
        lIlIlIIlIIlI[1] = (-((-25865) & 28475)) & (-4101) & 8063;
        lIlIlIIlIIlI[2] = " ".length();
        lIlIlIIlIIlI[3] = (10 ^ 70) ^ (210 ^ 154);
    }

    private static boolean llIlllIIllIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlllIIlIllll(int i) {
        return i == 0;
    }

    private static boolean llIlllIIllIIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIlllIIllIIII(int i) {
        return i != 0;
    }

    @Inject
    protected aJ(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return null;
    }
}
