package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "High alching", priority = 5, blocking = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.w  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/w.class */
public class w extends Task {
    private static /* synthetic */ int[] lIIlIlllIllll;
    private final /* synthetic */ SquireShamanConfig ax;
    private final /* synthetic */ c aw;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        if (lIlIllIlllllIII(this.ax.alch() ? 1 : 0)) {
            return lIIlIlllIllll[0];
        }
        Item first = Inventory.getFirst(item -> {
            return C0000a.q.contains(item.getName());
        });
        if (lIlIllIlllllIIl(first)) {
            return lIIlIlllIllll[0];
        }
        SpellBook.Standard standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (lIlIllIlllllIII(standard.canCast() ? 1 : 0)) {
            return lIIlIlllIllll[0];
        }
        Magic.cast(standard);
        first.interact(lIIlIlllIllll[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), first.getSlot(), WidgetInfo.INVENTORY.getId());
        return lIIlIlllIllll[1];
    }

    @Inject
    public w(c cVar, SquireShamanConfig squireShamanConfig) {
        this.aw = cVar;
        this.ax = squireShamanConfig;
    }

    private static void lIlIllIllllIlll() {
        lIIlIlllIllll = new int[2];
        lIIlIlllIllll[0] = (243 ^ 185) & ((242 ^ 184) ^ (-1));
        lIIlIlllIllll[1] = " ".length();
    }

    static {
        lIlIllIllllIlll();
    }

    private static boolean lIlIllIlllllIII(int i) {
        return i == 0;
    }

    private static boolean lIlIllIlllllIIl(Object obj) {
        return obj == null;
    }
}
