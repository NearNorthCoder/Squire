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
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFF)
public class PrayerFlickingTask
extends Task {
    private final  SquireNightmareZone Y;
    private final  Client aa;
    
    private final  SquireNightmareZoneConfig Z;

    private static boolean var2(Object object) {
        return object != null;
    }

    public boolean run() {
        j var3;
        if (j.var4(this.Z.usePrayer() ? 1 : 0)) {
            return var1[0];
        }
        if (j.var4(var3.aa.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (j.var5(var3.Y.d().isEmpty() ? 1 : 0) && j.var5(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return var1[1];
        }
        if (j.var2((Object)var3.Z.offensivePrayer())) {
            var3.Y.d().add(var3.Z.offensivePrayer().PrayerFlickingTask());
            0;
        }
        if (j.var5(var3.Z.protectFromMelee() ? 1 : 0)) {
            var3.Y.d().add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        Prayers.flick(new ArrayList<Prayer>(this.Y.d()), (boolean)this.Z.perfectFlick());
        0;
        return var1[1];
    }

    private static void var6() {
        var1 = new int[2];
        j.var1[0] = (88 + 128 - 212 + 231 ^ 134 + 129 - 175 + 94) & (192 + 195 - 353 + 197 ^ 94 + 3 - -61 + 28 ^ -1);
        j.var1[1] = 1;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    @Inject
    public PrayerFlickingTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.Y = squireNightmareZone;
        this.Z = squireNightmareZoneConfig;
        this.aa = client;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    static {
        j.var6();
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(HashSet<Prayer> hashSet, boolean bl) {
        boolean bl2 = var1[0];
        Iterator<Prayer> var8 = hashSet.iterator();
        while (j.var5(var8.hasNext() ? 1 : 0)) {
            void var9;
            Prayer var10 = var8.next();
            if (!j.var4(Prayers.isEnabled((Prayer)var10) ? 1 : 0) || j.var5((int)var9)) {
                Widget var11 = Widgets.get((WidgetInfo)var10.getWidgetInfo());
                if (j.var7(var11)) {
                    0;
                    if (2 < (52 + 116 - 93 + 112 ^ 180 + 154 - 271 + 128)) continue;
                    return ((0 ^ 0x13 ^ (0xB4 ^ 0x8F)) & (0x36 ^ 0x63 ^ (0x57 ^ 0x2A) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var11);
                0;
                if null != null {
                    return ((0x5E ^ 0x73) & ~(0xAC ^ 0x81)) != 0;
                }
            } else if (j.var4(Prayers.isEnabled((Prayer)var10) ? 1 : 0)) {
                int var12 = var1[1];
            }
            0;
            if (-1 < 0) continue;
            return ((0x5A ^ 0x68) & ~(0xF6 ^ 0xC4)) != 0;
        }
        return bl2;
    }
}

