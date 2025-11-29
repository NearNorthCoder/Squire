package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Olm Portals", priority = 25000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aP  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aP.class */
public class aP extends aR {
    private static /* synthetic */ int[] lIlIlIIIIlII;

    static {
        llIllIllllIlIl();
    }

    private static boolean llIllIlllllIII(Object obj) {
        return obj == null;
    }

    private static void llIllIllllIlIl() {
        lIlIlIIIIlII = new int[2];
        lIlIlIIIIlII[0] = (125 ^ 34) & ((53 ^ 106) ^ (-1));
        lIlIlIIIIlII[1] = " ".length();
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIllllIllI(int i) {
        return i == 0;
    }

    private static boolean llIllIllllIlll(int i) {
        return i != 0;
    }

    @Inject
    protected aP(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        if (llIllIllllIllI(ct() ? 1 : 0)) {
            return lIlIlIIIIlII[0];
        }
        List<WorldPoint> ao = this.ed.ao();
        if (llIllIllllIlll(this.ed.ao().isEmpty() ? 1 : 0)) {
            return lIlIlIIIIlII[0];
        }
        if (llIllIllllIlll(this.bS.getWorldLocation().equals(ao.get(lIlIlIIIIlII[0])) ? 1 : 0)) {
            return lIlIlIIIIlII[1];
        }
        Movement.setDestination(ao.get(lIlIlIIIIlII[0]));
        return lIlIlIIIIlII[1];
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (llIllIlllllIII(aE)) {
            aE = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(aE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }
}
