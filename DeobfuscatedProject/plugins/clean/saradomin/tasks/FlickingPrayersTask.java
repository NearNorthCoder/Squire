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
        u.lIlIlIlIIIlllII();
    }

    private static boolean lIlIlIlIIlIIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIlIlIIIlllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIlIIIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIIIllllI(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIIlIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIlIIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = lIIlIIllIIlll[0];
        Iterator<Prayer> var1 = list.iterator();
        while (u.lIlIlIlIIlIIIII(var1.hasNext() ? 1 : 0)) {
            void var2;
            Prayer var3 = var1.next();
            if (u.lIlIlIlIIlIIIIl(var3, Prayer.PROTECT_ITEM)) {

                if (2 >= ((0x98 ^ 0xA9) & ~(0x7D ^ 0x4C))) continue;
                return false;
            }
            if (!u.lIlIlIlIIIlllIl(Prayers.isEnabled((Prayer)var3) ? 1 : 0) || u.lIlIlIlIIlIIIII((int)var2)) {
                Widget var4 = Widgets.get((WidgetInfo)var3.getWidgetInfo());
                if (u.lIlIlIlIIlIIIlI(var4)) {

                    if (1 != 2) continue;
                    return ((0x7D ^ 0x72 ^ (0x35 ^ 5)) & (0x3D ^ 0x62 ^ (0x3A ^ 0x5A) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var4);

                if (-1 != -1) {
                    return ((12 + 109 - 23 + 29 ^ (0xCA ^ 0x81)) & (0xC1 ^ 0xAA ^ (0xD5 ^ 0x8A) ^ -1)) != 0;
                }
            } else if (u.lIlIlIlIIIlllIl(Prayers.isEnabled((Prayer)var3) ? 1 : 0)) {
                int var5 = lIIlIIllIIlll[1];
            }

            if (((9 ^ 0x2C) & ~(0x26 ^ 3)) >= 0) continue;
            return false;
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
        u var6;
        if (u.lIlIlIlIIIlllIl(this.ah.m() ? 1 : 0)) {
            return lIIlIIllIIlll[0];
        }
        Prayer var7 = var6.ai.a(lIIlIIllIIlll[0], var6.ah.l());
        Prayer var8 = var6.ai.a(lIIlIIllIIlll[1], var6.ah.l());
        Prayer[] var9 = var6.aj.rangePrayer().z();
        ArrayList<Prayer> var10 = new ArrayList<Prayer>(List.of(var9));
        var10.add(var8);

        if (u.lIlIlIlIIIllllI(var7) && u.lIlIlIlIIIlllll(var7, var8) && u.lIlIlIlIIlIIIII(Prayers.isEnabled((Prayer)var7) ? 1 : 0)) {
            Widget var11 = Widgets.get((WidgetInfo)var7.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var11);
        }
        if (u.lIlIlIlIIlIIIII(var6.a(var10, lIIlIIllIIlll[0]) ? 1 : 0)) {
            var6.sleep(lIIlIIllIIlll[1]);
        }
        this.a((List<Prayer>)var4_4, lIIlIIllIIlll[1]);

        return lIIlIIllIIlll[1];
    }
}

