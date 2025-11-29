package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.cox.SquireCoxConfig;
import gg.squire.basics.cox.SquireCoxHelper;
import gg.squire.client.plugins.fw.Task;
import java.util.List;
import net.runelite.api.Prayer;
import net.unethicalite.client.Static;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.V  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/V.class */
public abstract class V extends Task {
    private static /* synthetic */ int[] lIIlIIlI;
    public static final /* synthetic */ int cp;
    protected final /* synthetic */ SquireCoxConfig cr;
    protected final /* synthetic */ SquireCoxHelper cq;

    public abstract boolean aW();

    private static boolean lIIIIlllll(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIIIIlllII();
        cp = lIIlIIlI[2];
    }

    public abstract int aV();

    private static boolean lIIIlIIIIl(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    private boolean aX() {
        int[] mapRegions = Static.getClient().getMapRegions();
        int lllIIIIIIIllIlI = mapRegions.length;
        int i2 = lIIlIIlI[0];
        while (lIIIIlllll(i2, lllIIIIIIIllIlI)) {
            if (lIIIlIIIIl(mapRegions[i2], aV())) {
                return lIIlIIlI[1];
            }
            i2++;
            "".length();
            if ((72 ^ 77) <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIlIIlI[0];
    }

    public V(SquireCoxHelper squireCoxHelper, SquireCoxConfig squireCoxConfig) {
        this.cq = squireCoxHelper;
        this.cr = squireCoxConfig;
    }

    public abstract List<Prayer> aU();

    private static void lIIIIlllII() {
        lIIlIIlI = new int[3];
        lIIlIIlI[0] = (241 ^ 187) & ((80 ^ 26) ^ (-1));
        lIIlIIlI[1] = " ".length();
        lIIlIIlI[2] = (-594) & 6131;
    }
}
