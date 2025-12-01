package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.util.List;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Dropping Fish", priority = 50, blocking = true)
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.h  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/h.class */
public class h extends Task {
    private static /* synthetic */ int[] lIlllIlIIlIl;
    private final /* synthetic */ SquireFisherPlugin J;
    private final /* synthetic */ SquireFisherConfig K;
    /* synthetic */ boolean L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    public boolean run() {
        if (lllIlIlIlIlIIl(this.K.banking() ? 1 : 0)) {
            return lIlllIlIIlIl[0];
        }
        if (lllIlIlIlIlIIl(Inventory.isFull() ? 1 : 0) && lllIlIlIlIlIlI(this.K.fish(), f.HOUSE_KEY)) {
            int[] iArr = new int[lIlllIlIIlIl[1]];
            iArr[lIlllIlIIlIl[0]] = lIlllIlIIlIl[2];
            if (lllIlIlIlIlIll(Inventory.getCount(iArr), lIlllIlIIlIl[1])) {
                int[] iArr2 = new int[lIlllIlIIlIl[1]];
                iArr2[lIlllIlIIlIl[0]] = lIlllIlIIlIl[2];
                List all = Inventory.getAll(iArr2);
                all.subList(lIlllIlIIlIl[0], all.size() - lIlllIlIIlIl[3]).forEach((v0) -> {
                    v0.drop();
                });
                if (lllIlIlIlIlIll(all.size(), lIlllIlIIlIl[4])) {
                    return lIlllIlIIlIl[1];
                }
            }
        }
        if (lllIlIlIlIllII(Inventory.contains(this.K.fish().j()) ? 1 : 0)) {
            return lIlllIlIIlIl[0];
        }
        if ((!lllIlIlIlIlIIl(this.K.tickFishing() ? 1 : 0) || !lllIlIlIlIlIIl(a(Players.getLocal()) ? 1 : 0)) && !lllIlIlIlIllIl(Inventory.getCount(this.K.fish().j()), Rand.nextInt(lIlllIlIIlIl[5], lIlllIlIIlIl[6]))) {
            if (lllIlIlIlIlIIl(this.K.cutEat() ? 1 : 0) && lllIlIlIlIlllI(Inventory.getFreeSlots(), lIlllIlIIlIl[5])) {
                return lIlllIlIIlIl[0];
            }
            Inventory.dropAll(this.K.fish().j());
            "".length();
            return lIlllIlIIlIl[1];
        }
        return lIlllIlIIlIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean a(Player player) {
        if (lllIlIlIlIllll(player.getAnimation(), lIlllIlIIlIl[7]) && lllIlIlIlIllll(player.getAnimation(), lIlllIlIIlIl[8]) && !lllIlIlIllIIII(player.getAnimation(), lIlllIlIIlIl[9])) {
            return lIlllIlIIlIl[0];
        }
        ?? r0 = lIlllIlIIlIl[1];
        "".length();
        return ((((88 + 175) - 93) + 25) ^ (((137 + 69) - 172) + 164)) == 0 ? ((219 ^ 149) ^ (127 ^ 63)) & (((72 ^ 8) ^ (45 ^ 99)) ^ (-" ".length())) : r0;
    }

    private static boolean lllIlIlIlIlIll(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lllIlIlIlIlllI(int i2, int i3) {
        return i2 >= i3;
    }

    public boolean o() {
        return this.L;
    }

    private static boolean lllIlIlIlIllII(int i2) {
        return i2 == 0;
    }

    private static boolean lllIlIlIlIllIl(int i2, int i3) {
        return i2 < i3;
    }

    public void b(boolean z) {
        this.L = z;
    }

    private static boolean lllIlIlIlIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllIlIlIlIllll(int i2, int i3) {
        return i2 != i3;
    }

    private static void lllIlIlIlIlIII() {
        lIlllIlIIlIl = new int[10];
        lIlllIlIIlIl[0] = ((1 ^ 73) ^ (104 ^ 102)) & (((22 ^ 25) ^ (137 ^ 192)) ^ (-" ".length()));
        lIlllIlIIlIl[1] = " ".length();
        lIlllIlIIlIl[2] = (-((-24631) & 27767)) & (-12421) & 15861;
        lIlllIlIIlIl[3] = "  ".length();
        lIlllIlIIlIl[4] = 168 ^ 162;
        lIlllIlIIlIl[5] = 164 ^ 160;
        lIlllIlIIlIl[6] = (57 ^ 85) ^ (213 ^ 181);
        lIlllIlIIlIl[7] = (-2665) & 12013;
        lIlllIlIIlIl[8] = (-19239) & 24487;
        lIlllIlIIlIl[9] = (-2319) & 3566;
    }

    static {
        lllIlIlIlIlIII();
    }

    @Inject
    public h(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.J = squireFisherPlugin;
        this.K = squireFisherConfig;
    }

    private static boolean lllIlIlIllIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lllIlIlIlIlIIl(int i2) {
        return i2 != 0;
    }
}
