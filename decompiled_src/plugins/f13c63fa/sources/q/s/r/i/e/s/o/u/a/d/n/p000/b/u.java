package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "High alching", priority = 5, blocking = true)
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.u  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/u.class */
public class u extends Task {
    private final /* synthetic */ SquireBandosConfig am;
    private static /* synthetic */ int[] lllIIIIIlIl;
    private final /* synthetic */ e al;

    private static void lIlIllIIllIIll() {
        lllIIIIIlIl = new int[2];
        lllIIIIIlIl[0] = ((((132 + 38) - 22) + 31) ^ (((90 + 133) - 162) + 79)) & (((((64 + 10) - 32) + 103) ^ (((103 + 60) - 67) + 78)) ^ (-" ".length()));
        lllIIIIIlIl[1] = " ".length();
    }

    private static boolean lIlIllIIllIlIl(int i) {
        return i != 0;
    }

    private static boolean lIlIllIIllIllI(Object obj) {
        return obj == null;
    }

    static {
        lIlIllIIllIIll();
    }

    @Inject
    public u(e eVar, SquireBandosConfig squireBandosConfig) {
        this.al = eVar;
        this.am = squireBandosConfig;
    }

    private static boolean lIlIllIIllIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIlIllIIllIlII(this.am.alch() ? 1 : 0)) {
            return lllIIIIIlIl[0];
        }
        if (lIlIllIIllIlIl(this.al.t() ? 1 : 0) && lIlIllIIllIlII(this.al.s() ? 1 : 0) && !lIlIllIIllIlIl(this.al.v() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                return i.x.contains(item.getName());
            });
            if (lIlIllIIllIllI(first)) {
                return lllIIIIIlIl[0];
            }
            SpellBook.Standard standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
            if (lIlIllIIllIlII(standard.canCast() ? 1 : 0)) {
                return lllIIIIIlIl[0];
            }
            Magic.cast(standard);
            first.interact(lllIIIIIlIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), first.getSlot(), WidgetInfo.INVENTORY.getId());
            return lllIIIIIlIl[1];
        }
        return lllIIIIIlIl[0];
    }
}
