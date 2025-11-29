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
import gg.squire.pvm.tasks.CHelper;

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
        boolean bl2 = lIIlIlllIlIII[1];
        Iterator<Prayer> var1 = list.iterator();
        while (v.lIlIllIllIllIIl(var1.hasNext() ? 1 : 0)) {
            void var2;
            Prayer var3 = var1.next();
            if (!v.lIlIllIllIllIII(Prayers.isEnabled((Prayer)var3) ? 1 : 0) || v.lIlIllIllIllIIl((int)var2)) {
                Widget var4 = Widgets.get((WidgetInfo)var3.getWidgetInfo());
                if (v.lIlIllIllIllIlI(var4)) {

                    if (((0 ^ 0x50) & ~(0xD8 ^ 0x88)) >= 0) continue;
                    return false;
                }
                WidgetPackets.widgetFirstOption((Widget)var4);

                if ((103 + 131 - 201 + 119 ^ 83 + 141 - 215 + 147) < 0) {
                    return ((0xE3 ^ 0x99 ^ (0x96 ^ 0xB5)) & (156 + 182 - 184 + 97 ^ 0 + 105 - 36 + 93 ^ -1)) != 0;
                }
            } else if (v.lIlIllIllIllIII(Prayers.isEnabled((Prayer)var3) ? 1 : 0)) {
                int var5 = lIIlIlllIlIII[0];
            }

            if (3 > 0) continue;
            return false;
        }
        return bl2;
    }

    static {
        v.lIlIllIllIlIlll();
        at = LoggerFactory.getLogger(PrayFlickingTask.class);
    }

    private static boolean lIlIllIllIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIllIllIIl(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        v var6;
        if (v.lIlIllIllIllIII(this.av.room().x().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return this.F();
        }
        Widget var7 = Widgets.get((WidgetInfo)WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);
        if (v.lIlIllIllIllIIl(Prayers.isQuickPrayerEnabled() ? 1 : 0) && v.lIlIllIllIllIIl(var6.av.prayFlick() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)var7);
            WidgetPackets.widgetFirstOption((Widget)var7);

            if (2 == -1) {
                return ((0x3B ^ 0x13 ^ (0x20 ^ 0x56)) & (0x86 ^ 0x8C ^ (0xF3 ^ 0xA7) ^ -1)) != 0;
            }
        } else if (v.lIlIllIllIllIII(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)var7);
        }
        return lIIlIlllIlIII[0];
    }

    private static boolean lIlIllIllIllIlI(Object object) {
        return object == null;
    }

    @Inject
    public PrayFlickingTask(c c2, SquireShamanConfig squireShamanConfig) {
        this.au = c2;
        this.av = squireShamanConfig;
    }

    private boolean F() {
        if (v.lIlIllIllIllIIl(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean)lIIlIlllIlIII[1]);
            return lIIlIlllIlIII[0];
        }
        return lIIlIlllIlIII[1];
    }
}

