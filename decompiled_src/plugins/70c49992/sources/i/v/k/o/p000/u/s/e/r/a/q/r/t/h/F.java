package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Drinking Combat Potion", priority = 109)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.F  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/F.class */
public class F extends w {
    private static /* synthetic */ int[] lIlIlIlllIIIl;

    private static boolean lIllllllllIIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        int[] iArr = new int[lIlIlIlllIIIl[0]];
        iArr[lIlIlIlllIIIl[1]] = lIlIlIlllIIIl[2];
        if (lIllllllllIIIll(Projectiles.getNearest(iArr))) {
            return lIlIlIlllIIIl[1];
        }
        this.cg.a(this.cf.getTickCount());
        return Combat.drinkBoostingPotion(lIlIlIlllIIIl[3]);
    }

    static {
        lIllllllllIIIlI();
    }

    private static void lIllllllllIIIlI() {
        lIlIlIlllIIIl = new int[4];
        lIlIlIlllIIIl[0] = " ".length();
        lIlIlIlllIIIl[1] = (220 ^ 132) & ((206 ^ 150) ^ (-1));
        lIlIlIlllIIIl[2] = (-((-20633) & 29373)) & (-4113) & 14333;
        lIlIlIlllIIIl[3] = 73 ^ 19;
    }

    @Inject
    protected F(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }
}
