/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Pray Flicking", priority=0x7FFFFFFF)
public class PrayFlickingTask
extends Task {
    private final  SquireShamanConfig av;
    private final  c au;
    
    private static final  Logger at;

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = var1[1];
        Iterator<Prayer> var2 = list.iterator();
        while (v.var3(var2.hasNext() ? 1 : 0)) {
            void var4;
            Prayer var5 = var2.next();
            if (!v.var6(Prayers.isEnabled((Prayer)var5) ? 1 : 0) || v.var3((int)var4)) {
                Widget var7 = Widgets.get((WidgetInfo)var5.getWidgetInfo());
                if (v.var8(var7)) {
                    0;
                    
                    return ((0x69 ^ 0x45) & ~(0x1D ^ 0x31)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var7);
                0;
                if ((103 + 131 - 201 + 119 ^ 83 + 141 - 215 + 147) < 0) {
                    return ((0xE3 ^ 0x99 ^ (0x96 ^ 0xB5)) & (156 + 182 - 184 + 97 ^ 0 + 105 - 36 + 93 ^ -1)) != 0;
                }
            } else if (v.var6(Prayers.isEnabled((Prayer)var5) ? 1 : 0)) {
                int var9 = var1[0];
            }
            0;
            if (3 > 0) continue;
            return ((0xE2 ^ 0xC1) & ~(0xE7 ^ 0xC4)) != 0;
        }
        return bl2;
    }

    static {
        v.var10();
        at = LoggerFactory.getLogger(PrayFlickingTask.class);
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var10() {
        var1 = new int[2];
        v.var1[0] = 1;
        v.var1[1] = 2 & (2 ^ -1);
    }

    public boolean run() {
        v var11;
        if (v.var6(this.av.room().x().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return this.F();
        }
        Widget var12 = Widgets.get((WidgetInfo)WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);
        if (v.var3(Prayers.isQuickPrayerEnabled() ? 1 : 0) && v.var3(var11.av.prayFlick() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)var12);
            WidgetPackets.widgetFirstOption((Widget)var12);
            0;
            if (2 == -1) {
                return ((0x3B ^ 0x13 ^ (0x20 ^ 0x56)) & (0x86 ^ 0x8C ^ (0xF3 ^ 0xA7) ^ -1)) != 0;
            }
        } else if (v.var6(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)var12);
        }
        return var1[0];
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    @Inject
    public PrayFlickingTask(c c2, SquireShamanConfig squireShamanConfig) {
        this.au = c2;
        this.av = squireShamanConfig;
    }

    private boolean F() {
        if (v.var3(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean)var1[1]);
            return var1[0];
        }
        return var1[1];
    }
}

