package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import com.openosrs.client.game.WorldLocation;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import net.runelite.api.Client;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to bank", priority = 79)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/q.class */
public class C0016q extends AbstractC0014o {
    private static /* synthetic */ int[] lIlIlIlllIIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public boolean run() {
        if (!lIllllllllIIlIl(S() ? 1 : 0) && !lIllllllllIIllI(this.bU.c() ? 1 : 0) && !lIllllllllIIlIl(R() ? 1 : 0)) {
            if (lIllllllllIIlIl(House.isInside() ? 1 : 0) && lIllllllllIIlll(House.getJewelryBox())) {
                return lIlIlIlllIIll[0];
            }
            if (lIllllllllIIllI(Movement.shouldWalk() ? 1 : 0)) {
                return lIlIlIlllIIll[1];
            }
            Movement.walkTo(WorldLocation.FEROX_ENCLAVE.getWorldArea().getCenter());
            "".length();
            return lIlIlIlllIIll[1];
        }
        return lIlIlIlllIIll[0];
    }

    private static boolean lIllllllllIIlIl(int i2) {
        return i2 != 0;
    }

    private static boolean lIllllllllIIllI(int i2) {
        return i2 == 0;
    }

    private static boolean lIllllllllIIlll(Object obj) {
        return obj != null;
    }

    @Inject
    protected C0016q(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        lIllllllllIIlII();
    }

    private static void lIllllllllIIlII() {
        lIlIlIlllIIll = new int[2];
        lIlIlIlllIIll[0] = ((((160 + 58) - 208) + 151) ^ (((49 + 170) - 115) + 83)) & (((234 ^ 198) ^ (10 ^ 60)) ^ (-" ".length()));
        lIlIlIlllIIll[1] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public boolean Q() {
        return lIlIlIlllIIll[0];
    }
}
