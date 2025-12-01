package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.vardorvis.SquireVardorvis;
import javax.inject.Inject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.E  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/E.class */
public abstract class E extends Task {
    private static /* synthetic */ int[] lIlIlIIIllIII;
    @Inject
    protected /* synthetic */ SquireVardorvis aw;
    protected static final /* synthetic */ WorldArea av;

    private static void lIllllIlIlllllI() {
        lIlIlIIIllIII = new int[10];
        lIlIlIIIllIII[0] = (51 ^ 47) & ((9 ^ 21) ^ (-1));
        lIlIlIIIllIII[1] = " ".length();
        lIlIlIIIllIII[2] = (-11877) & 16374;
        lIlIlIIIllIII[3] = "  ".length();
        lIlIlIIIllIII[4] = (-9378) & 10149;
        lIlIlIIIllIII[5] = (-((-29485) & 32687)) & (-4098) & 16383;
        lIlIlIIIllIII[6] = (-21379) & 22491;
        lIlIlIIIllIII[7] = (-649) & 4075;
        lIlIlIIIllIII[8] = (-31389) & 32508;
        lIlIlIIIllIII[9] = (-((-435) & 29623)) & (-129) & 32751;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIllllIlIllllll(this.aw.i() ? 1 : 0)) {
            return lIlIlIIIllIII[0];
        }
        if (lIllllIllIIIIII(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIlIlIIIllIII[1];
        }
        return l();
    }

    private static boolean lIllllIlIllllll(int i) {
        return i == 0;
    }

    static {
        lIllllIlIlllllI();
        av = new WorldArea(new WorldPoint(lIlIlIIIllIII[6], lIlIlIIIllIII[7], lIlIlIIIllIII[0]), new WorldPoint(lIlIlIIIllIII[8], lIlIlIIIllIII[9], lIlIlIIIllIII[0]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean X() {
        if (lIllllIllIIIIIl(Vars.getBit(lIlIlIIIllIII[2]))) {
            int[] iArr = new int[lIlIlIIIllIII[3]];
            iArr[lIlIlIIIllIII[0]] = lIlIlIIIllIII[4];
            iArr[lIlIlIIIllIII[1]] = lIlIlIIIllIII[5];
            if (lIllllIlIllllll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIlIIIllIII[3]];
                iArr2[lIlIlIIIllIII[0]] = lIlIlIIIllIII[4];
                iArr2[lIlIlIIIllIII[1]] = lIlIlIIIllIII[5];
                if (!lIllllIllIIIIII(Equipment.contains(iArr2) ? 1 : 0)) {
                    return lIlIlIIIllIII[0];
                }
            }
        }
        ?? r0 = lIlIlIIIllIII[1];
        "".length();
        return (-(33 ^ 36)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    public abstract boolean l();

    private static boolean lIllllIllIIIIIl(int i) {
        return i <= 0;
    }

    private static boolean lIllllIllIIIIII(int i) {
        return i != 0;
    }
}
