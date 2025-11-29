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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.f;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

/* TASK: Flicking prayers -> PrayerFlickingTask */
@TaskDesc(name="Flicking prayers", priority=25)
public class u
extends Task {
    private static /* synthetic */ int[] lIIlIIllIIlll;
    private final /* synthetic */ g ah;
    private final /* synthetic */ f ai;
    private final /* synthetic */ SquireSaraConfig aj;

    static {
        u.lIlIlIlIIIlllII();
    }

    private static void lIlIlIlIIIlllII() {
        lIIlIIllIIlll = new int[2];
        u.lIIlIIllIIlll[0] = (6 ^ 2) & ~(0x81 ^ 0x85);
        u.lIIlIIllIIlll[1] = 1;
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
        Iterator<Prayer> var8 = list.iterator();
        while (u.lIlIlIlIIlIIIII(var8.hasNext() ? 1 : 0)) {
            void var3;
            Prayer var6 = var8.next();
            if (u.lIlIlIlIIlIIIIl(var6, Prayer.PROTECT_ITEM)) {
                0;
                if (2 >= ((0x98 ^ 0xA9) & ~(0x7D ^ 0x4C))) continue;
                return false;
            }
            if (!u.lIlIlIlIIIlllIl(Prayers.isEnabled((Prayer)var6) ? 1 : 0) || u.lIlIlIlIIlIIIII((int)var3)) {
                Widget var1 = Widgets.get((WidgetInfo)var6.getWidgetInfo());
                if (u.lIlIlIlIIlIIIlI(var1)) {
                    0;
                    if (1 != 2) continue;
                    return ((0x7D ^ 0x72 ^ (0x35 ^ 5)) & (0x3D ^ 0x62 ^ (0x3A ^ 0x5A) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var1);
                0;
                if (-1 != -1) {
                    return ((12 + 109 - 23 + 29 ^ (0xCA ^ 0x81)) & (0xC1 ^ 0xAA ^ (0xD5 ^ 0x8A) ^ -1)) != 0;
                }
            } else if (u.lIlIlIlIIIlllIl(Prayers.isEnabled((Prayer)var6) ? 1 : 0)) {
                int llllllllllllllIlllllIlIIIIIlIlII = lIIlIIllIIlll[1];
            }
            0;
            if (((9 ^ 0x2C) & ~(0x26 ^ 3)) >= 0) continue;
            return false;
        }
        return bl2;
    }

    @Inject
    public u(g g2, f f2, SquireSaraConfig squireSaraConfig) {
        this.ah = g2;
        this.ai = f2;
        this.aj = squireSaraConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        u var4;
        if (u.lIlIlIlIIIlllIl(this.ah.m() ? 1 : 0)) {
            return lIIlIIllIIlll[0];
        }
        Prayer var7 = var4.ai.a(lIIlIIllIIlll[0], var4.ah.l());
        Prayer var2 = var4.ai.a(lIIlIIllIIlll[1], var4.ah.l());
        Prayer[] var10 = var4.aj.rangePrayer().z();
        ArrayList<Prayer> var9 = new ArrayList<Prayer>(List.of(var10));
        var9.add(var2);
        0;
        if (u.lIlIlIlIIIllllI(var7) && u.lIlIlIlIIIlllll(var7, var2) && u.lIlIlIlIIlIIIII(Prayers.isEnabled((Prayer)var7) ? 1 : 0)) {
            Widget var5 = Widgets.get((WidgetInfo)var7.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var5);
        }
        if (u.lIlIlIlIIlIIIII(var4.a(var9, lIIlIIllIIlll[0]) ? 1 : 0)) {
            var4.sleep(lIIlIIllIIlll[1]);
        }
        this.a((List<Prayer>)var4_4, lIIlIIllIIlll[1]);
        0;
        return lIIlIIllIIlll[1];
    }
}

