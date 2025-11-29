/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.agility.tasks.GameEnum;

@TaskDesc(name="Using seers teleport", priority=100, blocking=true)
public class UsingSeersTeleportTask
extends Task {
    
    private final  AgilityConfig y;

    private static boolean var3(int n, int n2) {
        return n > n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        i var4;
        if (i.var5((Object)this.y.course(), (Object)b.SEERS_VILLAGE)) {
            return var2[0];
        }
        if (i.var6(var4.y.seersTeleport() ? 1 : 0)) {
            return var2[0];
        }
        Player var7 = Players.getLocal();
        if (!i.var8(var7) || i.var9(var7.isAnimating() ? 1 : 0)) {
            return var2[0];
        }
        if (i.var9(var7.getPlane())) {
            return var2[0];
        }
        if (i.var3(var7.getWorldLocation().distanceTo2D(new WorldPoint(var2[1], var2[2], var2[0])), var2[3])) {
            return var2[0];
        }
        WidgetInfo var10 = SpellBook.Standard.CAMELOT_TELEPORT.getWidget();
        Widget var11 = Widgets.get((WidgetInfo)var10);
        if (i.var12(var11)) {
            return var2[0];
        }
        var3_3.interact(var1[var2[0]]);
        return var2[4];
    }

    private static boolean var6(int n) {
        return n == 0;
    }

    private static void var13() {
        var2 = new int[6];
        i.var2[0] = (45 + 138 - 149 + 113 ^ 118 + 54 - 84 + 69) & (0x15 ^ 7 ^ (0x32 ^ 0x2E) ^ -1);
        i.var2[1] = -(0xFFFFFDFF & 0x160B) & (0xFFFF9FDB & 0x7EBF);
        i.var2[2] = -(0xFFFFF71B & 0x78ED) & (0xFFFFFFFE & 0x7D8F);
        i.var2[3] = 0xC4 ^ 0xC1;
        i.var2[4] = 1;
        i.var2[5] = 2;
    }

    private static void var14() {
        var1 = new String[var2[4]];
        i.var1[i.var2[0]] = "Seers'";
    }

    @Inject
    public UsingSeersTeleportTask(AgilityConfig agilityConfig) {
        this.y = agilityConfig;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static boolean var9(int n) {
        return n != 0;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    static {
        i.var13();
        i.var14();
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }
}

