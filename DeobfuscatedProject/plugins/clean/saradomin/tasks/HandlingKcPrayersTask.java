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
import java.util.Arrays;
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

    private static boolean lIlIlIlIIlllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIlIlIIlllIII(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIIllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = lIIlIIllIlllI[0];
        Iterator<Prayer> var1 = list.iterator();
        while (z.lIlIlIlIIllIlll(var1.hasNext() ? 1 : 0)) {
            void var2;
            Prayer var3 = var1.next();
            if (z.lIlIlIlIIlllIll(var3, Prayer.PROTECT_ITEM)) {

                if (((0x47 ^ 0x5D) & ~(0x74 ^ 0x6E)) == 0) continue;
                return false;
            }
            if (!z.lIlIlIlIIlllIlI(Prayers.isEnabled((Prayer)var3) ? 1 : 0) || z.lIlIlIlIIllIlll((int)var2)) {
                Widget var4 = Widgets.get((WidgetInfo)var3.getWidgetInfo());
                if (z.lIlIlIlIIlllIII(var4)) {

                    if (((200 + 11 - 92 + 95 ^ 20 + 109 - -8 + 15) & (0x51 ^ 0x66 ^ (0x2C ^ 0x55) ^ -1)) == 0) continue;
                    return ((0x26 ^ 0x66 ^ (0x52 ^ 0x43)) & (0x22 ^ 0x1D ^ (0x23 ^ 0x4D) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var4);

                if (-1 >= 2) {
                    return ((0x1F ^ 0x53 ^ (0x5B ^ 0x4C)) & (0x43 ^ 0x74 ^ (0xDF ^ 0xB3) ^ -1)) != 0;
                }
            } else if (z.lIlIlIlIIlllIlI(Prayers.isEnabled((Prayer)var3) ? 1 : 0)) {
                int var5 = lIIlIIllIlllI[1];
            }

            if (-1 == -1) continue;
            return false;
        }
        return bl2;
    }

    static {
        z.lIlIlIlIIllIllI();
    }

    private static boolean lIlIlIlIIlllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_2;
        z var6;
        if (z.lIlIlIlIIllIlll(this.ax.m() ? 1 : 0)) {
            return lIIlIIllIlllI[0];
        }
        if (z.lIlIlIlIIlllIII(Players.getLocal().getInteracting())) {
            Prayer[] var7 = Prayer.values();
            int var8 = var7.length;
            int var9 = lIIlIIllIlllI[0];
            while (z.lIlIlIlIIlllIIl(var9, var8)) {
                Prayer var10 = var7[var9];
                if (z.lIlIlIlIIlllIlI(Prayers.isEnabled((Prayer)var10) ? 1 : 0)) {

                    if (-1 >= 2) {
                        return false;
                    }
                } else {
                    Prayers.toggle((Prayer)var10);
                }
                ++var9;

                return ((0x12 ^ 0x59 ^ (0x81 ^ 0x8A)) & (231 + 21 - 236 + 223 ^ 55 + 124 - 143 + 139 ^ -1)) != 0;
            }
            return lIIlIIllIlllI[0];
        }
        ArrayList<Prayer> var7 = new ArrayList<Prayer>();
        var7.add(Prayer.PROTECT_FROM_MAGIC);

        var7.addAll(Arrays.asList(var6.ay.rangePrayer().HandlingKcPrayersTask()));

        if (z.lIlIlIlIIllIlll(var6.a(var7, lIIlIIllIlllI[0]) ? 1 : 0)) {
            var6.sleep(lIIlIIllIlllI[1]);
        }
        this.a((List<Prayer>)var1_2, lIIlIIllIlllI[1]);

        return lIIlIIllIlllI[1];
    }
}

