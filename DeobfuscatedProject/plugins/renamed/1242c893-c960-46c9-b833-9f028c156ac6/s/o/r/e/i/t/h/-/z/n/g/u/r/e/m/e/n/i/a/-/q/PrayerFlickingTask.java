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
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

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

/* TASK: Prayer Flicking -> PrayerflickingTask */
@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFF)
public class PrayerFlickingTask
extends Task {
    private final /* synthetic */ SquireNightmareZone Y;
    private final /* synthetic */ Client aa;
    private static /* synthetic */ int[] lIIIlIIIIlllI;
    private final /* synthetic */ SquireNightmareZoneConfig Z;

    private static boolean lIIllllIIlIlIII(Object object) {
        return object != null;
    }

    public boolean run() {
        j var2;
        if (j.lIIllllIIlIIllI(this.Z.usePrayer() ? 1 : 0)) {
            return lIIIlIIIIlllI[0];
        }
        if (j.lIIllllIIlIIllI(var2.aa.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIIlllI[0];
        }
        if (j.lIIllllIIlIIlll(var2.Y.d().isEmpty() ? 1 : 0) && j.lIIllllIIlIIlll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIIlIIIIlllI[1];
        }
        if (j.lIIllllIIlIlIII((Object)var2.Z.offensivePrayer())) {
            var2.Y.d().add(var2.Z.offensivePrayer().j());
            0;
        }
        if (j.lIIllllIIlIIlll(var2.Z.protectFromMelee() ? 1 : 0)) {
            var2.Y.d().add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        Prayers.flick(new ArrayList<Prayer>(this.Y.d()), (boolean)this.Z.perfectFlick());
        0;
        return lIIIlIIIIlllI[1];
    }

    private static void lIIllllIIlIIlIl() {
        lIIIlIIIIlllI = new int[2];
        j.lIIIlIIIIlllI[0] = (88 + 128 - 212 + 231 ^ 134 + 129 - 175 + 94) & (192 + 195 - 353 + 197 ^ 94 + 3 - -61 + 28 ^ -1);
        j.lIIIlIIIIlllI[1] = 1;
    }

    private static boolean lIIllllIIlIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIIlIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public j(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
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
        Iterator<Prayer> var1 = hashSet.iterator();
        while (j.lIIllllIIlIIlll(var1.hasNext() ? 1 : 0)) {
            void var4;
            Prayer var5 = var1.next();
            if (!j.lIIllllIIlIIllI(Prayers.isEnabled((Prayer)var5) ? 1 : 0) || j.lIIllllIIlIIlll((int)var4)) {
                Widget var3 = Widgets.get((WidgetInfo)var5.getWidgetInfo());
                if (j.lIIllllIIlIlIIl(var3)) {
                    0;
                    if (2 < (52 + 116 - 93 + 112 ^ 180 + 154 - 271 + 128)) continue;
                    return ((0 ^ 0x13 ^ (0xB4 ^ 0x8F)) & (0x36 ^ 0x63 ^ (0x57 ^ 0x2A) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var3);
                0;
                
                }
            } else if (j.lIIllllIIlIIllI(Prayers.isEnabled((Prayer)var5) ? 1 : 0)) {
                int lllllllllllllllIIIlIIIIlllIIlIIl = lIIIlIIIIlllI[1];
            }
            0;
            if (-1 < 0) continue;
            return false;
        }
        return bl2;
    }
}

