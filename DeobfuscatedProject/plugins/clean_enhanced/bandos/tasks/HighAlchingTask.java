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
package gg.squire.bandos.tasks;

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
import gg.squire.bandos.tasks.BandosManager;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="High alching", priority=5, blocking=true)
public class HighAlchingTask
extends Task {
    private final  SquireBandosConfig am;
    
    private final  e al;

    private static void var2() {
        var1 = new int[2];
        u.var1[0] = (132 + 38 - 22 + 31 ^ 90 + 133 - 162 + 79) & (64 + 10 - 32 + 103 ^ 103 + 60 - 67 + 78 ^ -1);
        u.var1[1] = 1;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    static {
        u.var2();
    }

    @Inject
    public HighAlchingTask(e e2, SquireBandosConfig squireBandosConfig) {
        this.al = e2;
        this.am = squireBandosConfig;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        u var6;
        if (u.var5(this.am.alch() ? 1 : 0)) {
            return var1[0];
        }
        if (!u.var3(var6.al.t() ? 1 : 0) || !u.var5(var6.al.s() ? 1 : 0) || u.var3(var6.al.v() ? 1 : 0)) {
            return var1[0];
        }
        Item var7 = Inventory.getFirst(item -> i.x.contains(item.getName()));
        if (u.var4(var7)) {
            return var1[0];
        }
        SpellBook.Standard var8 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (u.var5(var8.canCast() ? 1 : 0)) {
            return var1[0];
        }
        Magic.cast((Spevar2_2);
        var1_1.interact(var1[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var1_1.getSlot(), WidgetInfo.INVENTORY.getId());
        return var1[1];
    }
}

