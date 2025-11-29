package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Walking to bank (death)", priority = 2147483642, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.M  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/M.class */
public class M extends P {
    private static /* synthetic */ int[] lIllIlIlllIII;

    @Inject
    public M(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, EnumC0002c.BANKING);
    }

    private static boolean llIIlIIIIllIIII(Object obj) {
        return obj == null;
    }

    static {
        llIIlIIIIlIlllI();
    }

    private static boolean llIIlIIIIlIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.P
    public boolean ac() {
        if (!llIIlIIIIlIllll(ah() ? 1 : 0) && !llIIlIIIIlIllll(Bank.isOpen() ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (llIIlIIIIllIIII(nearest)) {
                return lIllIlIlllIII[0];
            }
            if (llIIlIIIIlIllll(nearest.getArea().contains2D(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return lIllIlIlllIII[0];
            }
            if (llIIlIIIIlIllll(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIllIlIlllIII[1];
            }
            if (llIIlIIIIlIllll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo(nearest.getArea());
                "".length();
            }
            return lIllIlIlllIII[1];
        }
        return lIllIlIlllIII[0];
    }

    private static void llIIlIIIIlIlllI() {
        lIllIlIlllIII = new int[2];
        lIllIlIlllIII[0] = (241 ^ 160) & ((16 ^ 65) ^ (-1));
        lIllIlIlllIII[1] = " ".length();
    }
}
