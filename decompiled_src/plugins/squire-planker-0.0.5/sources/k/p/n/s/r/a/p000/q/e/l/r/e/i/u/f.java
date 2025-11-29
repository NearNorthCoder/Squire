package k.p.n.s.r.a.p000.q.e.l.r.e.i.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Casting plank make")
/* renamed from: k.p.n.s.r.a.-.q.e.l.r.e.i.u.f  reason: invalid package */
/* loaded from: squire-planker-0.0.5.jar:k/p/n/s/r/a/-/q/e/l/r/e/i/u/f.class */
public class f extends Task {
    private static /* synthetic */ int[] lllllIllIlll;
    private final /* synthetic */ SquirePlankerConfig p;

    private static boolean lIIlIIlllIlIIlI(int i) {
        return i == 0;
    }

    @Inject
    public f(SquirePlankerConfig squirePlankerConfig) {
        this.p = squirePlankerConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean run() {
        if (lIIlIIlllIlIIlI(this.p.spell() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        int[] iArr = new int[lllllIllIlll[1]];
        iArr[lllllIllIlll[0]] = this.p.plank().d();
        Item first = Inventory.getFirst(iArr);
        if (lIIlIIlllIlIIll(first)) {
            return lllllIllIlll[0];
        }
        SpellBook.Lunar lunar = SpellBook.Lunar.PLANK_MAKE;
        if (lIIlIIlllIlIIlI(lunar.canCast() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        Magic.cast(lunar, first);
        sleep(lllllIllIlll[2]);
        return lllllIllIlll[1];
    }

    private static void lIIlIIlllIlIIIl() {
        lllllIllIlll = new int[3];
        lllllIllIlll[0] = (104 ^ 11) & ((196 ^ 167) ^ (-1));
        lllllIllIlll[1] = " ".length();
        lllllIllIlll[2] = "  ".length();
    }

    private static boolean lIIlIIlllIlIIll(Object obj) {
        return obj == null;
    }

    static {
        lIIlIIlllIlIIIl();
    }
}
