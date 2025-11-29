package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aN  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aN.class */
public abstract class aN extends AbstractC0026az {
    private static /* synthetic */ int[] llIIIIllIllI;

    public Item bu() {
        int[] iArr = new int[llIIIIllIllI[1]];
        iArr[llIIIIllIllI[0]] = this.bS.compostProduce().aD().aY().au();
        return Inventory.getFirst(iArr);
    }

    public abstract boolean b(TileObject tileObject);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        C0042q x = this.bR.x();
        if (!llllIIllIIlllI(x) && !llllIIllIIllll(this.bR.b(x).ai() ? 1 : 0)) {
            N aa = x.aa();
            if (!llllIIllIlIIII(aa) || llllIIllIIllll(I(aa) ? 1 : 0)) {
                return llIIIIllIllI[0];
            }
            TileObject b = aa.b(this.bT);
            return (!llllIIllIlIIII(b) || llllIIllIIllll(Reachable.isInteractable(b) ? 1 : 0)) ? llIIIIllIllI[0] : b(b);
        }
        return llIIIIllIllI[0];
    }

    private static void llllIIllIIllIl() {
        llIIIIllIllI = new int[2];
        llIIIIllIllI[0] = (153 ^ 174) & ((156 ^ 171) ^ (-1));
        llIIIIllIllI[1] = " ".length();
    }

    public abstract boolean I(N n);

    static {
        llllIIllIIllIl();
    }

    private static boolean llllIIllIIllll(int i) {
        return i == 0;
    }

    private static boolean llllIIllIlIIII(Object obj) {
        return obj != null;
    }

    private static boolean llllIIllIIlllI(Object obj) {
        return obj == null;
    }

    @Inject
    public aN(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client);
    }
}
