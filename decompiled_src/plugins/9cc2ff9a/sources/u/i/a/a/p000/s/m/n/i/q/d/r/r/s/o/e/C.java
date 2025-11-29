package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "High alching", priority = 5, blocking = true)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.C  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/C.class */
public class C extends Task {
    private final /* synthetic */ C0006g aC;
    private final /* synthetic */ SquireSaraConfig aD;
    private static /* synthetic */ int[] lIIlIIllIIIll;

    private static boolean lIlIlIlIIIlIlll(int i) {
        return i != 0;
    }

    private static void lIlIlIlIIIlIlIl() {
        lIIlIIllIIIll = new int[2];
        lIIlIIllIIIll[0] = (37 ^ 98) & ((16 ^ 87) ^ (-1));
        lIIlIIllIIIll[1] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIlIlIlIIIlIllI(this.aD.alch() ? 1 : 0)) {
            return lIIlIIllIIIll[0];
        }
        if (lIlIlIlIIIlIlll(this.aC.m() ? 1 : 0) && lIlIlIlIIIlIllI(this.aC.l() ? 1 : 0) && !lIlIlIlIIIlIlll(this.aC.o() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                return C0003d.k.contains(item.getName());
            });
            if (lIlIlIlIIIllIII(first)) {
                return lIIlIIllIIIll[0];
            }
            SpellBook.Standard standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
            if (lIlIlIlIIIlIllI(standard.canCast() ? 1 : 0)) {
                return lIIlIIllIIIll[0];
            }
            Magic.cast(standard);
            first.interact(lIIlIIllIIIll[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), first.getSlot(), WidgetInfo.INVENTORY.getId());
            return lIIlIIllIIIll[1];
        }
        return lIIlIIllIIIll[0];
    }

    private static boolean lIlIlIlIIIlIllI(int i) {
        return i == 0;
    }

    static {
        lIlIlIlIIIlIlIl();
    }

    @Inject
    public C(C0006g c0006g, SquireSaraConfig squireSaraConfig) {
        this.aC = c0006g;
        this.aD = squireSaraConfig;
    }

    private static boolean lIlIlIlIIIllIII(Object obj) {
        return obj == null;
    }
}
