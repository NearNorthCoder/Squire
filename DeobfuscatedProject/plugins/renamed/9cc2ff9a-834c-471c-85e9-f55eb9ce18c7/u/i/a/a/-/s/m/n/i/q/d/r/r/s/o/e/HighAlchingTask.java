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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.d_Unknown;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g_Unknown;

/* TASK: High alching -> AlchingTask */
@TaskDesc(name="High alching", priority=5, blocking=true)
public class HighAlchingTask
extends Task {
    private final /* synthetic */ g aC;
    private final /* synthetic */ SquireSaraConfig aD;
    private static /* synthetic */ int[] lIIlIIllIIIll;

    private static boolean lIlIlIlIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIlIIIlIlIl() {
        lIIlIIllIIIll = new int[2];
        C.lIIlIIllIIIll[0] = (0x25 ^ 0x62) & ~(0x10 ^ 0x57);
        C.lIIlIIllIIIll[1] = 1;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        C var3;
        if (C.lIlIlIlIIIlIllI(this.aD.alch() ? 1 : 0)) {
            return lIIlIIllIIIll[0];
        }
        if (!C.lIlIlIlIIIlIlll(var3.aC.m() ? 1 : 0) || !C.lIlIlIlIIIlIllI(var3.aC.l() ? 1 : 0) || C.lIlIlIlIIIlIlll(var3.aC.o() ? 1 : 0)) {
            return lIIlIIllIIIll[0];
        }
        Item var1 = Inventory.getFirst(item -> d.k.contains(item.getName()));
        if (C.lIlIlIlIIIllIII(var1)) {
            return lIIlIIllIIIll[0];
        }
        SpellBook.Standard var2 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (C.lIlIlIlIIIlIllI(var2.canCast() ? 1 : 0)) {
            return lIIlIIllIIIll[0];
        }
        Magic.cast((Spell)var2_2);
        var1_1.interact(lIIlIIllIIIll[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var1_1.getSlot(), WidgetInfo.INVENTORY.getId());
        return lIIlIIllIIIll[1];
    }

    private static boolean lIlIlIlIIIlIllI(int n2) {
        return n2 == 0;
    }

    static {
        C.lIlIlIlIIIlIlIl();
    }

    @Inject
    public C(g g2, SquireSaraConfig squireSaraConfig) {
        this.aC = g2;
        this.aD = squireSaraConfig;
    }

    private static boolean lIlIlIlIIIllIII(Object object) {
        return object == null;
    }
}

