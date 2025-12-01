package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Dropping useless items", priority = 5)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.i  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/i.class */
public class C0008i extends Task {
    private static /* synthetic */ int[] lIIllIlIlIlll;
    private final /* synthetic */ int[] u;

    public C0008i() {
        int[] iArr = new int[lIIllIlIlIlll[0]];
        iArr[lIIllIlIlIlll[1]] = lIIllIlIlIlll[2];
        iArr[lIIllIlIlIlll[3]] = lIIllIlIlIlll[4];
        iArr[lIIllIlIlIlll[5]] = lIIllIlIlIlll[6];
        this.u = iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    public boolean run() {
        if (!lIllIIIIlIIlllI(Game.getState(), GameState.LOGGED_IN) && !lIllIIIIlIIllll(Inventory.contains(this.u) ? 1 : 0)) {
            Inventory.dropAll(this.u);
            "".length();
            return lIIllIlIlIlll[3];
        }
        return lIIllIlIlIlll[1];
    }

    private static boolean lIllIIIIlIIllll(int i) {
        return i == 0;
    }

    private static boolean lIllIIIIlIIlllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lIllIIIIlIIllIl();
    }

    private static void lIllIIIIlIIllIl() {
        lIIllIlIlIlll = new int[7];
        lIIllIlIlIlll[0] = "   ".length();
        lIIllIlIlIlll[1] = (129 ^ 178) & ((171 ^ 152) ^ (-1));
        lIIllIlIlIlll[2] = (-16497) & 18431;
        lIIllIlIlIlll[3] = " ".length();
        lIIllIlIlIlll[4] = (-6433) & 31206;
        lIIllIlIlIlll[5] = "  ".length();
        lIIllIlIlIlll[6] = (-26753) & 28671;
    }
}
