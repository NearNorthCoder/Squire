package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Handling Elidinis P3 Prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.I  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/I.class */
public class I extends z {
    private static /* synthetic */ int[] lIlIIIIIlIllI;
    private /* synthetic */ Prayer ba;

    private static boolean lIllIllIIIllllI(int i, int i2) {
        return i == i2;
    }

    @Inject
    public I(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.ba = null;
    }

    private static boolean lIllIllIIIlllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Prayer prayer;
        Actor actor = animationChanged.getActor();
        if (lIllIllIIIlllIl(actor instanceof Player ? 1 : 0)) {
            return;
        }
        if (!lIllIllIIIllllI(actor.getAnimation(), lIlIIIIIlIllI[6])) {
            if (!lIllIllIIIllllI(actor.getAnimation(), lIlIIIIIlIllI[7])) {
                if (lIllIllIIIllllI(actor.getAnimation(), lIlIIIIIlIllI[8])) {
                    this.ba = Prayer.PROTECT_FROM_MAGIC;
                    return;
                }
                return;
            }
            this.ba = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if ((-"   ".length()) > 0) {
                return;
            }
            return;
        }
        if (lIllIllIIIlllll(this.ba, Prayer.PROTECT_FROM_MISSILES)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        } else {
            prayer = Prayer.PROTECT_FROM_MISSILES;
        }
        this.ba = prayer;
        "".length();
        if ("   ".length() <= 0) {
        }
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public int F() {
        return lIlIIIIIlIllI[0];
    }

    static {
        lIllIllIIIllIll();
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public List<Prayer> E() {
        return lIllIllIIIlllII(this.ba) ? List.of(H()) : List.of(H(), this.ba);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIllIllIIIllllI(npcSpawned.getNpc().getId(), lIlIIIIIlIllI[9])) {
            this.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static void lIllIllIIIllIll() {
        lIlIIIIIlIllI = new int[10];
        lIlIIIIIlIllI[0] = (-((-14885) & 31271)) & (-522) & 32603;
        lIlIIIIIlIllI[1] = "  ".length();
        lIlIIIIIlIllI[2] = (85 ^ 77) & ((28 ^ 4) ^ (-1));
        lIlIIIIIlIllI[3] = (-((-17907) & 22527)) & (-1) & 16381;
        lIlIIIIIlIllI[4] = " ".length();
        lIlIIIIIlIllI[5] = (-4097) & 15859;
        lIlIIIIIlIllI[6] = (-((-2903) & 19415)) & (-2059) & 28347;
        lIlIIIIIlIllI[7] = (-((-7335) & 24055)) & (-2178) & 28669;
        lIlIIIIIlIllI[8] = (-16450) & 26223;
        lIlIIIIIlIllI[9] = (-((-129) & 20891)) & (-65) & 32603;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean C() {
        SquireTOA squireTOA = this.aS;
        int[] iArr = new int[lIlIIIIIlIllI[1]];
        iArr[lIlIIIIIlIllI[2]] = lIlIIIIIlIllI[3];
        iArr[lIlIIIIIlIllI[4]] = lIlIIIIIlIllI[5];
        return squireTOA.a(iArr);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public EnumC0013n J() {
        return this.aT.prayFlickLastWarden();
    }

    private static boolean lIllIllIIIlllIl(int i) {
        return i != 0;
    }

    private static boolean lIllIllIIIlllII(Object obj) {
        return obj == null;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean I() {
        return C();
    }
}
