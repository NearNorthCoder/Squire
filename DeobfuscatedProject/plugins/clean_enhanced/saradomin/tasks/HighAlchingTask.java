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
package gg.squire.saradomin.tasks;

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
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="High alching", priority=5, blocking=true)
public class HighAlchingTask
extends Task {
    private final  g aC;
    private final  SquireSaraConfig aD;

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[2];
        C.var1[0] = (0x25 ^ 0x62) & ~(0x10 ^ 0x57);
        C.var1[1] = 1;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        C var4;
        if (C.var5(this.aD.alch() ? 1 : 0)) {
            return var1[0];
        }
        if (!C.var2(var4.aC.m() ? 1 : 0) || !C.var5(var4.aC.l() ? 1 : 0) || C.var2(var4.aC.o() ? 1 : 0)) {
            return var1[0];
        }
        Item var6 = Inventory.getFirst(item -> d.k.contains(item.getName()));
        if (C.var7(var6)) {
            return var1[0];
        }
        SpellBook.Standard var8 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (C.var5(var8.canCast() ? 1 : 0)) {
            return var1[0];
        }
        Magic.cast((Spevar2_2);
        var1_1.interact(var1[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var1_1.getSlot(), WidgetInfo.INVENTORY.getId());
        return var1[1];
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    static {
        C.var3();
    }

    @Inject
    public HighAlchingTask(g g2, SquireSaraConfig squireSaraConfig) {
        this.aC = g2;
        this.aD = squireSaraConfig;
    }

    private static boolean var7(Object object) {
        return object == null;
    }
}

