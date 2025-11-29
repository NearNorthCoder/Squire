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
package u.i.r.d.s.e.r.q.y.a.h.-;

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
import u.i.r.d.s.e.r.q.y.a.h.-.a_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.h_Unknown;

/* TASK: Handling Hydra prayers -> HandlinghydraprayersTask */
@TaskDesc(name="Handling Hydra prayers", priority=0x7FFFFFFF)
public class HandlingHydraPrayersTask
extends Task {
    private final /* synthetic */ a aT;
    private final /* synthetic */ SquireAlchemicalHydraConfig aR;
    private final /* synthetic */ Client aS;
    private static /* synthetic */ int[] llllIIlIllll;

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
        x var8;
        void var4;
        h h2 = this.aT.k();
        if (!x.lIIIlllllllllII(h2) || !x.lIIIlllllllllII(h2.K()) || x.lIIIlllllllllIl(this.aT.g() ? 1 : 0)) {
            if (x.lIIIllllllllllI(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
            }
            return llllIIlIllll[0];
        }
        List<Prayer> var1 = List.of(var4.x(), var8.aR.getOffensivePrayer().z());
        Prayer[] var11 = Prayer.values();
        int var2 = var11.length;
        int var5 = llllIIlIllll[0];
        while (x.lIIIlllllllllll(var5, var2)) {
            Prayer var9 = var11[var5];
            if (x.lIIIllllllllllI(Prayers.isEnabled((Prayer)var9) ? 1 : 0) && x.lIIIlllllllllIl(var1.contains(var9) ? 1 : 0)) {
                Prayers.toggle((Prayer)var9);
            }
            ++var5;
            0;
            if (1 > ((0x34 ^ 0x1F) & ~(0xA6 ^ 0x8D))) continue;
            return false;
        }
        if (x.lIIIllllllllllI(var8.a(var1, llllIIlIllll[1]) ? 1 : 0)) {
            var8.sleep(llllIIlIllll[1]);
        }
        this.a((List<Prayer>)var2_2, llllIIlIllll[0]);
        0;
        return llllIIlIllll[1];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = llllIIlIllll[0];
        Iterator<Prayer> var10 = list.iterator();
        while (x.lIIIllllllllllI(var10.hasNext() ? 1 : 0)) {
            void var6;
            Prayer var3 = var10.next();
            if (x.lIIlIIIIIIIIIII(var3, Prayer.PROTECT_ITEM)) {
                0;
                if (-1 < 2) continue;
                return false;
            }
            if (!x.lIIIlllllllllIl(Prayers.isEnabled((Prayer)var3) ? 1 : 0) || x.lIIIllllllllllI((int)var6)) {
                Widget var7 = Widgets.get((WidgetInfo)var3.getWidgetInfo());
                if (x.lIIlIIIIIIIIIIl(var7)) {
                    0;
                    if (((0x50 ^ 0x5F ^ (0xBA ^ 0x92)) & (28 + 61 - 20 + 77 ^ 90 + 87 - 42 + 46 ^ -1)) != -1) continue;
                    return ((54 + 85 - 51 + 39 ^ (0x1C ^ 0x64)) & (0x3C ^ 0x47 ^ (0xC9 ^ 0xB5) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var7);
                0;
                if (2 > 2) {
                    return ((0xF4 ^ 0xB4 ^ (0x13 ^ 0x1B)) & (133 + 70 - 170 + 169 ^ 50 + 94 - 80 + 66 ^ -1)) != 0;
                }
            } else if (x.lIIIlllllllllIl(Prayers.isEnabled((Prayer)var3) ? 1 : 0)) {
                int lllllllllllllllIIlIlIlIIllIllIll = llllIIlIllll[1];
            }
            0;
            if (-2 < 0) continue;
            return false;
        }
        return bl2;
    }

    @Inject
    public x(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, Client client) {
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

    private static void lIIIllllllllIll() {
        llllIIlIllll = new int[2];
        x.llllIIlIllll[0] = (0x4D ^ 0x2D ^ (0x92 ^ 0xBB)) & (0xF8 ^ 0x8B ^ (0xA5 ^ 0x9F) ^ -1);
        x.llllIIlIllll[1] = 1;
    }

    private static boolean lIIIlllllllllII(Object object) {
        return object != null;
    }
}

