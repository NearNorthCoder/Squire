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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;
import q.s.r.i.e.s.o.u.a.d.n.-.b.i;

/* TASK: High alching -> AlchingTask */
@TaskDesc(name="High alching", priority=5, blocking=true)
public class u
extends Task {
    private final /* synthetic */ SquireBandosConfig am;
    private static /* synthetic */ int[] lllIIIIIlIl;
    private final /* synthetic */ e al;

    private static void lIlIllIIllIIll() {
        lllIIIIIlIl = new int[2];
        u.lllIIIIIlIl[0] = (132 + 38 - 22 + 31 ^ 90 + 133 - 162 + 79) & (64 + 10 - 32 + 103 ^ 103 + 60 - 67 + 78 ^ -1);
        u.lllIIIIIlIl[1] = 1;
    }

    private static boolean lIlIllIIllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIllIllI(Object object) {
        return object == null;
    }

    static {
        u.lIlIllIIllIIll();
    }

    @Inject
    public u(e e2, SquireBandosConfig squireBandosConfig) {
        this.al = e2;
        this.am = squireBandosConfig;
    }

    private static boolean lIlIllIIllIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        u var2;
        if (u.lIlIllIIllIlII(this.am.alch() ? 1 : 0)) {
            return lllIIIIIlIl[0];
        }
        if (!u.lIlIllIIllIlIl(var2.al.t() ? 1 : 0) || !u.lIlIllIIllIlII(var2.al.s() ? 1 : 0) || u.lIlIllIIllIlIl(var2.al.v() ? 1 : 0)) {
            return lllIIIIIlIl[0];
        }
        Item var1 = Inventory.getFirst(item -> i.x.contains(item.getName()));
        if (u.lIlIllIIllIllI(var1)) {
            return lllIIIIIlIl[0];
        }
        SpellBook.Standard var3 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (u.lIlIllIIllIlII(var3.canCast() ? 1 : 0)) {
            return lllIIIIIlIl[0];
        }
        Magic.cast((Spell)var2_2);
        var1_1.interact(lllIIIIIlIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var1_1.getSlot(), WidgetInfo.INVENTORY.getId());
        return lllIIIIIlIl[1];
    }
}

