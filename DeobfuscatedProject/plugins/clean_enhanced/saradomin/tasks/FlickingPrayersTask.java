/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Flicking prayers", priority=25)
public class FlickingPrayersTask
extends Task {
    
    private final  g ah;
    private final  f ai;
    private final  SquireSaraConfig aj;

    static {
        u.var2();
    }

    private static void var2() {
        var1 = new int[2];
        u.var1[0] = (6 ^ 2) & ~(0x81 ^ 0x85);
        u.var1[1] = 1;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = var1[0];
        Iterator<Prayer> var9 = list.iterator();
        while (u.var7(var9.hasNext() ? 1 : 0)) {
            void var10;
            Prayer var11 = var9.next();
            if (u.var3(var11, Prayer.PROTECT_ITEM)) {
                0;
                if (2 >= ((0x98 ^ 0xA9) & ~(0x7D ^ 0x4C))) continue;
                return ((0x8F ^ 0xAA) & ~(0xB9 ^ 0x9C)) != 0;
            }
            if (!u.var5(Prayers.isEnabled((Prayer)var11) ? 1 : 0) || u.var7((int)var10)) {
                Widget var12 = Widgets.get((WidgetInfo)var11.getWidgetInfo());
                if (u.var8(var12)) {
                    0;
                    if (1 != 2) continue;
                    return ((0x7D ^ 0x72 ^ (0x35 ^ 5)) & (0x3D ^ 0x62 ^ (0x3A ^ 0x5A) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var12);
                0;
                if (-1 != -1) {
                    return ((12 + 109 - 23 + 29 ^ (0xCA ^ 0x81)) & (0xC1 ^ 0xAA ^ (0xD5 ^ 0x8A) ^ -1)) != 0;
                }
            } else if (u.var5(Prayers.isEnabled((Prayer)var11) ? 1 : 0)) {
                int var13 = var1[1];
            }
            0;
            
            return ((0x45 ^ 0x70) & ~(0x21 ^ 0x14)) != 0;
        }
        return bl2;
    }

    @Inject
    public FlickingPrayersTask(g g2, f f2, SquireSaraConfig squireSaraConfig) {
        this.ah = g2;
        this.ai = f2;
        this.aj = squireSaraConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        u var14;
        if (u.var5(this.ah.m() ? 1 : 0)) {
            return var1[0];
        }
        Prayer var15 = var14.ai.a(var1[0], var14.ah.l());
        Prayer var16 = var14.ai.a(var1[1], var14.ah.l());
        Prayer[] var17 = var14.aj.rangePrayer().z();
        ArrayList<Prayer> var18 = new ArrayList<Prayer>(List.of(var17));
        var18.add(var16);
        0;
        if (u.var6(var15) && u.var4(var15, var16) && u.var7(Prayers.isEnabled((Prayer)var15) ? 1 : 0)) {
            Widget var19 = Widgets.get((WidgetInfo)var15.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var19);
        }
        if (u.var7(var14.a(var18, var1[0]) ? 1 : 0)) {
            var14.sleep(var1[1]);
        }
        this.a((List<Prayer>)var4_4, var1[1]);
        0;
        return var1[1];
    }
}

