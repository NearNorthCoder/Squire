package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Opening bank for zulrah teleport", priority = 2147483645, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.O  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/O.class */
public class O extends P {
    private static /* synthetic */ int[] lIllIlllIlIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.P
    public boolean ac() {
        int[] iArr = new int[lIllIlllIlIll[0]];
        iArr[lIllIlllIlIll[1]] = lIllIlllIlIll[2];
        if (llIIlIIllIIlIll(Inventory.getFirst(iArr))) {
            this.al.a(EnumC0002c.TRANSPORTING_ZULRAH);
            return lIllIlllIlIll[1];
        } else if (llIIlIIllIIllII(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIllIlllIlIll[0];
        } else {
            if (!llIIlIIllIIllII(ah() ? 1 : 0) && !llIIlIIllIIllII(Bank.isOpen() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIIllIIllIl(nearest)) {
                    return lIllIlllIlIll[1];
                }
                if (llIIlIIllIIllII(Bank.open() ? 1 : 0)) {
                    return lIllIlllIlIll[0];
                }
                if (llIIlIIllIIllII(Movement.shouldWalk() ? 1 : 0)) {
                    Movement.walkTo(nearest.getArea());
                    "".length();
                }
                return lIllIlllIlIll[0];
            }
            return lIllIlllIlIll[1];
        }
    }

    private static boolean llIIlIIllIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIlIIllIIllII(int i) {
        return i != 0;
    }

    private static boolean llIIlIIllIIlIll(Object obj) {
        return obj != null;
    }

    private static void llIIlIIllIIlIlI() {
        lIllIlllIlIll = new int[3];
        lIllIlllIlIll[0] = " ".length();
        lIllIlllIlIll[1] = (15 ^ 39) & ((151 ^ 191) ^ (-1));
        lIllIlllIlIll[2] = (-((-777) & 19262)) & (-257) & 31679;
    }

    static {
        llIIlIIllIIlIlI();
    }

    @Inject
    public O(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, EnumC0002c.BANKING);
    }
}
