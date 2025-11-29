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
package gg.squire.pvm.tasks;

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
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="High alching", priority=5, blocking=true)
public class HighAlchingTask
extends Task {
    
    private final  SquireShamanConfig ax;
    private final  c aw;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        if (w.var2(this.ax.alch() ? 1 : 0)) {
            return var1[0];
        }
        Item var3 = Inventory.getFirst(item -> a.q.contains(item.getName()));
        if (w.var4(var3)) {
            return var1[0];
        }
        SpellBook.Standard var5 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (w.var2(var5.canCast() ? 1 : 0)) {
            return var1[0];
        }
        Magic.cast((Spevar2_2);
        var1_1.interact(var1[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var1_1.getSlot(), WidgetInfo.INVENTORY.getId());
        return var1[1];
    }

    @Inject
    public HighAlchingTask(c c2, SquireShamanConfig squireShamanConfig) {
        this.aw = c2;
        this.ax = squireShamanConfig;
    }

    private static void var6() {
        var1 = new int[2];
        w.var1[0] = (0xF3 ^ 0xB9) & ~(0xF2 ^ 0xB8);
        w.var1[1] = 1;
    }

    static {
        w.var6();
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var4(Object object) {
        return object == null;
    }
}

