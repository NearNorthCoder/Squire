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
import gg.squire.hydra.tasks.AHelper;
import gg.squire.hydra.tasks.HHelper;

@TaskDesc(name="Handling Hydra prayers", priority=0x7FFFFFFF)
public class HandlingHydraPrayersTask
extends Task {
    private final  a aT;
    private final  SquireAlchemicalHydraConfig aR;
    private final  Client aS;

    private static boolean lIIlIIIIIIIIIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllllllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllllllllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        x var1;
        void var2;
        h h2 = this.aT.k();
        if (!x.lIIIlllllllllII(h2) || !x.lIIIlllllllllII(h2.K()) || x.lIIIlllllllllIl(this.aT.g() ? 1 : 0)) {
            if (x.lIIIllllllllllI(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
            }
            return llllIIlIllll[0];
        }
        List<Prayer> var3 = List.of(var2.HandlingHydraPrayersTask(), var1.aR.getOffensivePrayer().z());
        Prayer[] var4 = Prayer.values();
        int var5 = var4.length;
        int var6 = llllIIlIllll[0];
        while (x.lIIIlllllllllll(var6, var5)) {
            Prayer var7 = var4[var6];
            if (x.lIIIllllllllllI(Prayers.isEnabled((Prayer)var7) ? 1 : 0) && x.lIIIlllllllllIl(var3.contains(var7) ? 1 : 0)) {
                Prayers.toggle((Prayer)var7);
            }
            ++var6;

            if (1 > ((0x34 ^ 0x1F) & ~(0xA6 ^ 0x8D))) continue;
            return false;
        }
        if (x.lIIIllllllllllI(var1.a(var3, llllIIlIllll[1]) ? 1 : 0)) {
            var1.sleep(llllIIlIllll[1]);
        }
        this.a((List<Prayer>)var2_2, llllIIlIllll[0]);

        return llllIIlIllll[1];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = llllIIlIllll[0];
        Iterator<Prayer> var8 = list.iterator();
        while (x.lIIIllllllllllI(var8.hasNext() ? 1 : 0)) {
            void var9;
            Prayer var10 = var8.next();
            if (x.lIIlIIIIIIIIIII(var10, Prayer.PROTECT_ITEM)) {

                if (-1 < 2) continue;
                return false;
            }
            if (!x.lIIIlllllllllIl(Prayers.isEnabled((Prayer)var10) ? 1 : 0) || x.lIIIllllllllllI((int)var9)) {
                Widget var11 = Widgets.get((WidgetInfo)var10.getWidgetInfo());
                if (x.lIIlIIIIIIIIIIl(var11)) {

                    if (((0x50 ^ 0x5F ^ (0xBA ^ 0x92)) & (28 + 61 - 20 + 77 ^ 90 + 87 - 42 + 46 ^ -1)) != -1) continue;
                    return ((54 + 85 - 51 + 39 ^ (0x1C ^ 0x64)) & (0x3C ^ 0x47 ^ (0xC9 ^ 0xB5) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var11);

                if (2 > 2) {
                    return ((0xF4 ^ 0xB4 ^ (0x13 ^ 0x1B)) & (133 + 70 - 170 + 169 ^ 50 + 94 - 80 + 66 ^ -1)) != 0;
                }
            } else if (x.lIIIlllllllllIl(Prayers.isEnabled((Prayer)var10) ? 1 : 0)) {
                int var12 = llllIIlIllll[1];
            }

            if (-2 < 0) continue;
            return false;
        }
        return bl2;
    }

    @Inject
    public HandlingHydraPrayersTask(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, Client client) {
        this.aT = squireAlchemicalHydraPlugin.a();
        this.aR = squireAlchemicalHydraConfig;
        this.aS = client;
    }

    private static boolean lIIlIIIIIIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIlllllllllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        x.lIIIllllllllIll();
    }

    private static boolean lIIIlllllllllII(Object object) {
        return object != null;
    }
}

