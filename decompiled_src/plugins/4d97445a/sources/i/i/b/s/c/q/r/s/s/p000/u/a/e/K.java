package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.combat.Cannon.CannonReloader;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Reloading cannon")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.K  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/K.class */
public class K extends Task {
    private final /* synthetic */ CannonReloader bQ;
    private static /* synthetic */ int[] lllIIIll;
    private static final /* synthetic */ int bP;
    private /* synthetic */ int bR = Rand.nextInt(lllIIIll[0], lllIIIll[1]);

    static {
        llIIlIIIlI();
        bP = lllIIIll[4];
    }

    private static boolean llIIlIIlIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIlIIlII(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean llIIlIIIll(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public boolean run() {
        if (!llIIlIIIll(this.bQ.aA() ? 1 : 0) && !llIIlIIlII(this.bQ.az(), this.bR)) {
            int[] iArr = new int[lllIIIll[3]];
            iArr[lllIIIll[2]] = lllIIIll[4];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (llIIlIIlIl(nearest)) {
                return lllIIIll[2];
            }
            int[] iArr2 = new int[lllIIIll[5]];
            iArr2[lllIIIll[2]] = lllIIIll[5];
            iArr2[lllIIIll[3]] = lllIIIll[6];
            Item first = Inventory.getFirst(iArr2);
            if (llIIlIIlIl(first)) {
                return lllIIIll[2];
            }
            first.useOn(nearest);
            this.bR = Rand.nextInt(lllIIIll[0], lllIIIll[1]);
            return lllIIIll[3];
        }
        return lllIIIll[2];
    }

    private static void llIIlIIIlI() {
        lllIIIll = new int[7];
        lllIIIll[0] = (223 ^ 164) ^ (18 ^ 97);
        lllIIIll[1] = 122 ^ 104;
        lllIIIll[2] = ((57 ^ 115) ^ (((82 + 101) - 105) + 49)) & (((29 ^ 57) ^ (91 ^ 74)) ^ (-" ".length()));
        lllIIIll[3] = " ".length();
        lllIIIll[4] = (97 ^ 90) ^ (48 ^ 13);
        lllIIIll[5] = "  ".length();
        lllIIIll[6] = (-275) & 22002;
    }

    @Inject
    public K(CannonReloader cannonReloader) {
        this.bQ = cannonReloader;
    }
}
