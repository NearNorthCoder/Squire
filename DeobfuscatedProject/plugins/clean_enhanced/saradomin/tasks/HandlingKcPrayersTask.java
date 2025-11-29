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
 *  net.unethicalite.api.entities.Players
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Handling kc prayers", priority=10)
public class HandlingKcPrayersTask
extends Task {
    private final  g ax;
    private final  SquireSaraConfig ay;

    @Inject
    public HandlingKcPrayersTask(g g2, SquireSaraConfig squireSaraConfig) {
        this.ax = g2;
        this.ay = squireSaraConfig;
    }

    private static boolean var2(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new int[2];
        z.var1[0] = (71 + 65 - -66 + 53 ^ 98 + 139 - 221 + 154) & (0xB1 ^ 0x9F ^ (0xDE ^ 0xA5) ^ -1);
        z.var1[1] = 1;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = var1[0];
        Iterator<Prayer> var7 = list.iterator();
        while (z.var6(var7.hasNext() ? 1 : 0)) {
            void var8;
            Prayer var9 = var7.next();
            if (z.var2(var9, Prayer.PROTECT_ITEM)) {
                0;
                if (((0x47 ^ 0x5D) & ~(0x74 ^ 0x6E)) == 0) continue;
                return ((0x8B ^ 0xA0) & ~(0x6A ^ 0x41)) != 0;
            }
            if (!z.var10(Prayers.isEnabled((Prayer)var9) ? 1 : 0) || z.var6((int)var8)) {
                Widget var11 = Widgets.get((WidgetInfo)var9.getWidgetInfo());
                if (z.var3(var11)) {
                    0;
                    if (((200 + 11 - 92 + 95 ^ 20 + 109 - -8 + 15) & (0x51 ^ 0x66 ^ (0x2C ^ 0x55) ^ -1)) == 0) continue;
                    return ((0x26 ^ 0x66 ^ (0x52 ^ 0x43)) & (0x22 ^ 0x1D ^ (0x23 ^ 0x4D) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var11);
                0;
                if (-1 >= 2) {
                    return ((0x1F ^ 0x53 ^ (0x5B ^ 0x4C)) & (0x43 ^ 0x74 ^ (0xDF ^ 0xB3) ^ -1)) != 0;
                }
            } else if (z.var10(Prayers.isEnabled((Prayer)var9) ? 1 : 0)) {
                int var12 = var1[1];
            }
            0;
            if (-1 == -1) continue;
            return ((0x1E ^ 0x53) & ~(0xCB ^ 0x86)) != 0;
        }
        return bl2;
    }

    static {
        z.var4();
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_2;
        z var13;
        if (z.var6(this.ax.m() ? 1 : 0)) {
            return var1[0];
        }
        if (z.var3(Players.getLocal().getInteracting())) {
            Prayer[] var14 = Prayer.values();
            int var15 = var14.length;
            int var16 = var1[0];
            while (z.var5(var16, var15)) {
                Prayer var17 = var14[var16];
                if (z.var10(Prayers.isEnabled((Prayer)var17) ? 1 : 0)) {
                    0;
                    if (-1 >= 2) {
                        return ((0x76 ^ 0x7A) & ~(0x46 ^ 0x4A)) != 0;
                    }
                } else {
                    Prayers.toggle((Prayer)var17);
                }
                ++var16;
                0;
                if null == null continue;
                return ((0x12 ^ 0x59 ^ (0x81 ^ 0x8A)) & (231 + 21 - 236 + 223 ^ 55 + 124 - 143 + 139 ^ -1)) != 0;
            }
            return var1[0];
        }
        ArrayList<Prayer> var14 = new ArrayList<Prayer>();
        var14.add(Prayer.PROTECT_FROM_MAGIC);
        0;
        var14.addAll(Arrays.asList(var13.ay.rangePrayer().HandlingKcPrayersTask()));
        0;
        if (z.var6(var13.a(var14, var1[0]) ? 1 : 0)) {
            var13.sleep(var1[1]);
        }
        this.a((List<Prayer>)var1_2, var1[1]);
        0;
        return var1[1];
    }
}

