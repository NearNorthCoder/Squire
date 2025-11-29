package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Going to Zulrah (Deathwalk)")
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.N  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/N.class */
public class N extends P {
    private static /* synthetic */ int[] lIllIIllllIIl;

    static {
        llIIIlllIIIlIIl();
    }

    private static void llIIIlllIIIlIIl() {
        lIllIIllllIIl = new int[5];
        lIllIIllllIIl[0] = " ".length();
        lIllIIllllIIl[1] = ((((20 + 79) - (-28)) + 42) ^ (((141 + 52) - 78) + 63)) & (((((113 + 96) - 18) + 32) ^ (((49 + 45) - 89) + 191)) ^ (-" ".length()));
        lIllIIllllIIl[2] = (-10251) & 12283;
        lIllIIllllIIl[3] = (-((-6217) & 31583)) & (-4105) & 31679;
        lIllIIllllIIl[4] = (-((-769) & 30475)) & (-5) & 32767;
    }

    private static boolean llIIIlllIIIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.P
    public boolean ac() {
        int[] iArr = new int[lIllIIllllIIl[0]];
        iArr[lIllIIllllIIl[1]] = lIllIIllllIIl[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (llIIIlllIIIlIlI(ah() ? 1 : 0) && !llIIIlllIIIlIll(nearest)) {
            this.al.a(EnumC0002c.COLLECTING_ZULRAH);
            return lIllIIllllIIl[1];
        }
        if (llIIIlllIIIlIlI(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo(lIllIIllllIIl[3], lIllIIllllIIl[4], lIllIIllllIIl[1]);
            "".length();
        }
        return lIllIIllllIIl[0];
    }

    @Inject
    public N(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, EnumC0002c.TRANSPORTING_ZULRAH);
    }

    private static boolean llIIIlllIIIlIll(Object obj) {
        return obj == null;
    }
}
