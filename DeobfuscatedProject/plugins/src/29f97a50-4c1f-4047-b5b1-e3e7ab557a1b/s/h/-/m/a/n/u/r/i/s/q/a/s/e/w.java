/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.a;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

@TaskDesc(name="High alching", priority=5, blocking=true)
public class w
extends Task {
    private static /* synthetic */ int[] lIIlIlllIllll;
    private final /* synthetic */ SquireShamanConfig ax;
    private final /* synthetic */ c aw;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        if (w.lIlIllIlllllIII(this.ax.alch() ? 1 : 0)) {
            return lIIlIlllIllll[0];
        }
        Item llllllllllllllIllllIIllllllIIIII = Inventory.getFirst(item -> a.q.contains(item.getName()));
        if (w.lIlIllIlllllIIl(llllllllllllllIllllIIllllllIIIII)) {
            return lIIlIlllIllll[0];
        }
        SpellBook.Standard llllllllllllllIllllIIlllllIlllll = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (w.lIlIllIlllllIII(llllllllllllllIllllIIlllllIlllll.canCast() ? 1 : 0)) {
            return lIIlIlllIllll[0];
        }
        Magic.cast((Spell)var2_2);
        var1_1.interact(lIIlIlllIllll[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var1_1.getSlot(), WidgetInfo.INVENTORY.getId());
        return lIIlIlllIllll[1];
    }

    @Inject
    public w(c c2, SquireShamanConfig squireShamanConfig) {
        this.aw = c2;
        this.ax = squireShamanConfig;
    }

    private static void lIlIllIllllIlll() {
        lIIlIlllIllll = new int[2];
        w.lIIlIlllIllll[0] = (0xF3 ^ 0xB9) & ~(0xF2 ^ 0xB8);
        w.lIIlIlllIllll[1] = " ".length();
    }

    static {
        w.lIlIllIllllIlll();
    }

    private static boolean lIlIllIlllllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlllllIIl(Object object) {
        return object == null;
    }
}

