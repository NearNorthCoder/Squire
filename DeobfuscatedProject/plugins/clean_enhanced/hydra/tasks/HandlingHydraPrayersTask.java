/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Handling Hydra prayers", priority=0x7FFFFFFF)
public class HandlingHydraPrayersTask
extends Task {
    private final  a aT;
    private final  SquireAlchemicalHydraConfig aR;
    private final  Client aS;

    private static boolean var2(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        x var5;
        void var6;
        h h2 = this.aT.k();
        if (!x.var7(h2) || !x.var7(h2.K()) || x.var4(this.aT.g() ? 1 : 0)) {
            if (x.var3(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
            }
            return var1[0];
        }
        List<Prayer> var8 = List.of(var6.HandlingHydraPrayersTask(), var5.aR.getOffensivePrayer().z());
        Prayer[] var9 = Prayer.values();
        int var10 = var9.length;
        int var11 = var1[0];
        while (x.var12(var11, var10)) {
            Prayer var13 = var9[var11];
            if (x.var3(Prayers.isEnabled((Prayer)var13) ? 1 : 0) && x.var4(var8.contains(var13) ? 1 : 0)) {
                Prayers.toggle((Prayer)var13);
            }
            ++var11;
            0;
            if (1 > ((0x34 ^ 0x1F) & ~(0xA6 ^ 0x8D))) continue;
            return ((0x19 ^ 0x4C) & ~(0x7B ^ 0x2E)) != 0;
        }
        if (x.var3(var5.a(var8, var1[1]) ? 1 : 0)) {
            var5.sleep(var1[1]);
        }
        this.a((List<Prayer>)var2_2, var1[0]);
        0;
        return var1[1];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = var1[0];
        Iterator<Prayer> var14 = list.iterator();
        while (x.var3(var14.hasNext() ? 1 : 0)) {
            void var15;
            Prayer var16 = var14.next();
            if (x.var2(var16, Prayer.PROTECT_ITEM)) {
                0;
                if (-1 < 2) continue;
                return ((0x20 ^ 0x37) & ~(0xA3 ^ 0xB4)) != 0;
            }
            if (!x.var4(Prayers.isEnabled((Prayer)var16) ? 1 : 0) || x.var3((int)var15)) {
                Widget var17 = Widgets.get((WidgetInfo)var16.getWidgetInfo());
                if (x.var18(var17)) {
                    0;
                    if (((0x50 ^ 0x5F ^ (0xBA ^ 0x92)) & (28 + 61 - 20 + 77 ^ 90 + 87 - 42 + 46 ^ -1)) != -1) continue;
                    return ((54 + 85 - 51 + 39 ^ (0x1C ^ 0x64)) & (0x3C ^ 0x47 ^ (0xC9 ^ 0xB5) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var17);
                0;
                if (2 > 2) {
                    return ((0xF4 ^ 0xB4 ^ (0x13 ^ 0x1B)) & (133 + 70 - 170 + 169 ^ 50 + 94 - 80 + 66 ^ -1)) != 0;
                }
            } else if (x.var4(Prayers.isEnabled((Prayer)var16) ? 1 : 0)) {
                int var19 = var1[1];
            }
            0;
            if (-2 < 0) continue;
            return ((0x15 ^ 0x38) & ~(0x1F ^ 0x32)) != 0;
        }
        return bl2;
    }

    @Inject
    public HandlingHydraPrayersTask(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, Client client) {
        this.aT = squireAlchemicalHydraPlugin.a();
        this.aR = squireAlchemicalHydraConfig;
        this.aS = client;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    static {
        x.var20();
    }

    private static void var20() {
        var1 = new int[2];
        x.var1[0] = (0x4D ^ 0x2D ^ (0x92 ^ 0xBB)) & (0xF8 ^ 0x8B ^ (0xA5 ^ 0x9F) ^ -1);
        x.var1[1] = 1;
    }

    private static boolean var7(Object object) {
        return object != null;
    }
}

