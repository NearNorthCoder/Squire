package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.C  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/C.class */
public abstract class C extends Task {
    protected final /* synthetic */ SquireMiner Y;
    protected final /* synthetic */ T Z;
    protected final /* synthetic */ SquireMinerConfig X;
    private static /* synthetic */ int[] lllllIlllIIl;

    protected TileObject v() {
        WorldPoint worldPoint = new WorldPoint(lllllIlllIIl[1], lllllIlllIIl[2], lllllIlllIIl[0]);
        int[] iArr = new int[lllllIlllIIl[3]];
        iArr[lllllIlllIIl[0]] = lllllIlllIIl[4];
        return TileObjects.getNearest(worldPoint, iArr);
    }

    private static void lIIlIIllllIIlll() {
        lllllIlllIIl = new int[7];
        lllllIlllIIl[0] = ((98 ^ 44) ^ (177 ^ 190)) & (((57 ^ 125) ^ (70 ^ 67)) ^ (-" ".length()));
        lllllIlllIIl[1] = (-12369) & 16123;
        lllllIlllIIl[2] = (-((-6769) & 31347)) & (-2450) & 32703;
        lllllIlllIIl[3] = " ".length();
        lllllIlllIIl[4] = (-4365) & 31038;
        lllllIlllIIl[5] = (-((-695) & 29687)) & (-11) & 32751;
        lllllIlllIIl[6] = (-26902) & 32573;
    }

    private static boolean lIIlIIllllIlIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    public boolean run() {
        if (!lIIlIIllllIlIII(this.X.activity(), EnumC0000a.MOTHERLODE_MINE) && !lIIlIIllllIlIIl(this.Z.K() ? 1 : 0)) {
            return t();
        }
        return lllllIlllIIl[0];
    }

    static {
        lIIlIIllllIIlll();
    }

    private static boolean lIIlIIllllIlIll(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TileObject u() {
        return this.Z.a(this.X.mlmArea());
    }

    @Inject
    public C(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t) {
        this.X = squireMinerConfig;
        this.Y = squireMiner;
        this.Z = t;
    }

    public abstract boolean t();

    protected TileObject w() {
        WorldPoint worldPoint = new WorldPoint(lllllIlllIIl[5], lllllIlllIIl[6], lllllIlllIIl[0]);
        int[] iArr = new int[lllllIlllIIl[3]];
        iArr[lllllIlllIIl[0]] = lllllIlllIIl[4];
        return TileObjects.getNearest(worldPoint, iArr);
    }

    private static boolean lIIlIIllllIlIlI(int i) {
        return i <= 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TileObject x() {
        if (!lIIlIIllllIlIlI(this.Z.E()) && lIIlIIllllIlIll(this.X.depositUpstairs() ? 1 : 0)) {
            return v();
        }
        return w();
    }

    private static boolean lIIlIIllllIlIII(Object obj, Object obj2) {
        return obj != obj2;
    }
}
