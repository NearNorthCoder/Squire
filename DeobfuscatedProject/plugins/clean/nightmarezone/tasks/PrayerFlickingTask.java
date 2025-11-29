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

    private static boolean lIIllllIIlIlIII(Object object) {
        return object != null;
    }

    public boolean run() {
        j var1;
        if (j.lIIllllIIlIIllI(this.Z.usePrayer() ? 1 : 0)) {
            return lIIIlIIIIlllI[0];
        }
        if (j.lIIllllIIlIIllI(var1.aa.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIIlllI[0];
        }
        if (j.lIIllllIIlIIlll(var1.Y.d().isEmpty() ? 1 : 0) && j.lIIllllIIlIIlll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIIlIIIIlllI[1];
        }
        if (j.lIIllllIIlIlIII((Object)var1.Z.offensivePrayer())) {
            var1.Y.d().add(var1.Z.offensivePrayer().PrayerFlickingTask());

        }
        if (j.lIIllllIIlIIlll(var1.Z.protectFromMelee() ? 1 : 0)) {
            var1.Y.d().add(Prayer.PROTECT_FROM_MELEE);

        }
        Prayers.flick(new ArrayList<Prayer>(this.Y.d()), (boolean)this.Z.perfectFlick());

        return lIIIlIIIIlllI[1];
    }

    private static boolean lIIllllIIlIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIIlIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public PrayerFlickingTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.Y = squireNightmareZone;
        this.Z = squireNightmareZoneConfig;
        this.aa = client;
    }

    private static boolean lIIllllIIlIlIIl(Object object) {
        return object == null;
    }

    static {
        j.lIIllllIIlIIlIl();
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(HashSet<Prayer> hashSet, boolean bl) {
        boolean bl2 = lIIIlIIIIlllI[0];
        Iterator<Prayer> var2 = hashSet.iterator();
        while (j.lIIllllIIlIIlll(var2.hasNext() ? 1 : 0)) {
            void var3;
            Prayer var4 = var2.next();
            if (!j.lIIllllIIlIIllI(Prayers.isEnabled((Prayer)var4) ? 1 : 0) || j.lIIllllIIlIIlll((int)var3)) {
                Widget var5 = Widgets.get((WidgetInfo)var4.getWidgetInfo());
                if (j.lIIllllIIlIlIIl(var5)) {

                    if (2 < (52 + 116 - 93 + 112 ^ 180 + 154 - 271 + 128)) continue;
                    return ((0 ^ 0x13 ^ (0xB4 ^ 0x8F)) & (0x36 ^ 0x63 ^ (0x57 ^ 0x2A) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var5);

                }
            } else if (j.lIIllllIIlIIllI(Prayers.isEnabled((Prayer)var4) ? 1 : 0)) {
                int var6 = lIIIlIIIIlllI[1];
            }

            if (-1 < 0) continue;
            return false;
        }
        return bl2;
    }
}

