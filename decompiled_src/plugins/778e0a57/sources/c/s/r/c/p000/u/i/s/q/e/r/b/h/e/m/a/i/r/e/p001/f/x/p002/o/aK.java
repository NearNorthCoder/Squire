package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Prayer Flicking", priority = 30000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aK  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aK.class */
public class aK extends aR {
    private static /* synthetic */ int[] lIlIlIllIIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        if (!llIllllIlIIIlI(ct() ? 1 : 0)) {
            Prayers.flick(ci());
            "".length();
            return lIlIlIllIIlI[0];
        } else if (llIllllIlIIIll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIlIlIllIIlI[0];
        } else {
            return lIlIlIllIIlI[1];
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (llIllllIlIIlII(aE)) {
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
        llIllllIlIIIIl();
    }

    @Inject
    protected aK(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIllllIlIIlII(Object obj) {
        return obj == null;
    }

    private static boolean llIllllIlIIIlI(int i) {
        return i == 0;
    }

    private static void llIllllIlIIIIl() {
        lIlIlIllIIlI = new int[2];
        lIlIlIllIIlI[0] = " ".length();
        lIlIlIllIIlI[1] = ((82 ^ 109) ^ (7 ^ 111)) & (((((66 + 17) - (-95)) + 24) ^ (((70 + 151) - 134) + 70)) ^ (-" ".length()));
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllllIlIIIll(int i) {
        return i != 0;
    }
}
