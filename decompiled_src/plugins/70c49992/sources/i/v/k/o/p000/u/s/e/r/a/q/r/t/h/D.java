package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to original safe spot", priority = 25, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.D  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/D.class */
public class D extends w {
    private static final /* synthetic */ int cm;
    private static /* synthetic */ int[] lIlIlIllIIIll;

    @Inject
    protected D(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static boolean lIlllllllIIIIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        int[] iArr = new int[lIlIlIllIIIll[0]];
        iArr[lIlIlIllIIIll[1]] = lIlIlIllIIIll[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlllllllIIIIlI(nearest)) {
            return lIlIlIllIIIll[1];
        }
        WorldPoint dy = nearest.getWorldArea().getCenter().dy(lIlIlIllIIIll[3]);
        if (lIlllllllIIIIll(this.l.q().equals(dy) ? 1 : 0)) {
            return lIlIlIllIIIll[1];
        }
        Movement.setDestination(dy);
        return lIlIlIllIIIll[0];
    }

    private static boolean lIlllllllIIIIll(int i2) {
        return i2 != 0;
    }

    private static void lIlllllllIIIIIl() {
        lIlIlIllIIIll = new int[4];
        lIlIlIllIIIll[0] = " ".length();
        lIlIlIllIIIll[1] = (144 ^ 138) & ((69 ^ 95) ^ (-1));
        lIlIlIllIIIll[2] = (-24578) & 32635;
        lIlIlIllIIIll[3] = -(12 ^ 10);
    }

    static {
        lIlllllllIIIIIl();
        cm = lIlIlIllIIIll[2];
    }
}
