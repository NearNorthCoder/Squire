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
 *  net.unethicalite.client.Static
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.k_Unknown;

/* TASK: Flicking prayers -> PrayerFlickingTask */
@TaskDesc(name="Flicking prayers", priority=25)
public class FlickingPrayersTask
extends Task {
    private static /* synthetic */ int[] llIllllllIl;
    private final /* synthetic */ k X;
    private /* synthetic */ int Z;
    private final /* synthetic */ e W;
    private final /* synthetic */ SquireBandosConfig Y;

    private static boolean lIlIllIIIlllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIllIIIlllll(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public p(e e2, k k2, SquireBandosConfig squireBandosConfig) {
        this.Z = llIllllllIl[0];
        this.W = e2;
        this.X = k2;
        this.Y = squireBandosConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        p var7;
        if (p.lIlIllIIIllIIl(this.W.t() ? 1 : 0)) {
            return llIllllllIl[1];
        }
        int var3 = Static.getClient().getTickCount();
        Prayer var10 = var7.X.a(llIllllllIl[1], var7.W.s());
        Prayer var5 = var7.X.a(llIllllllIl[2], var7.W.s());
        if (p.lIlIllIIIllIlI(var7.W.s() ? 1 : 0)) {
            if (p.lIlIllIIIllIIl(var7.W.y() ? 1 : 0)) {
                var5 = Prayer.PROTECT_FROM_MELEE;
                0;
                if (((0x20 ^ 5) & ~(0xAE ^ 0x8B)) < 0) {
                    return false;
                }
            } else if (p.lIlIllIIIllIlI(var7.W.y() ? 1 : 0) && p.lIlIllIIIllIll(var7.Z, llIllllllIl[0])) {
                var7.Z = var3;
                0;
                if (3 < ((0x30 ^ 0x65 ^ (0x98 ^ 0x8D)) & (79 + 184 - 236 + 176 ^ 119 + 13 - 58 + 65 ^ -1))) {
                    return (1 & (1 ^ -1)) != 0;
                }
            } else if (p.lIlIllIIIlllII(var3 - var7.Z, llIllllllIl[3])) {
                var5 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        ArrayList<Prayer> var2 = new ArrayList<Prayer>(List.of(var7.Y.rangePrayer().h()));
        var2.add(var5);
        0;
        if (p.lIlIllIIIlllIl(var10) && p.lIlIllIIIllllI(var10, var5) && p.lIlIllIIIllIlI(Prayers.isEnabled((Prayer)var10) ? 1 : 0)) {
            Widget var8 = Widgets.get((WidgetInfo)var10.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var8);
        }
        if (p.lIlIllIIIllIlI(var7.a(var2, llIllllllIl[1]) ? 1 : 0)) {
            var7.sleep(llIllllllIl[2]);
        }
        this.a((List<Prayer>)var4_4, llIllllllIl[2]);
        0;
        return llIllllllIl[2];
    }

    private static boolean lIlIllIIlIIIII(Object object) {
        return object == null;
    }

    static {
        p.lIlIllIIIllIII();
    }

    private static boolean lIlIllIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIIllllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIllIIIllIIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIllIIIllIII() {
        llIllllllIl = new int[4];
        p.llIllllllIl[0] = -1;
        p.llIllllllIl[1] = (0x12 ^ 0x4C ^ (0x3C ^ 0x6A)) & (0x33 ^ 0x25 ^ (0x5A ^ 0x44) ^ -1);
        p.llIllllllIl[2] = 1;
        p.llIllllllIl[3] = 60 + 77 - 8 + 4 ^ 126 + 61 - 163 + 121;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = llIllllllIl[1];
        Iterator<Prayer> var4 = list.iterator();
        while (p.lIlIllIIIllIlI(var4.hasNext() ? 1 : 0)) {
            void var9;
            Prayer var1 = var4.next();
            if (p.lIlIllIIIlllll(var1, Prayer.PROTECT_ITEM)) {
                0;
                if ((52 + 47 - 47 + 120 ^ 54 + 4 - -59 + 51) >= 0) continue;
                return ((0x49 ^ 0x7A ^ (0xB8 ^ 0xAD)) & (9 + 163 - 25 + 20 ^ 111 + 25 - 50 + 43 ^ -1)) != 0;
            }
            if (!p.lIlIllIIIllIIl(Prayers.isEnabled((Prayer)var1) ? 1 : 0) || p.lIlIllIIIllIlI((int)var9)) {
                Widget var6 = Widgets.get((WidgetInfo)var1.getWidgetInfo());
                if (p.lIlIllIIlIIIII(var6)) {
                    0;
                    if (1 >= 0) continue;
                    return false;
                }
                WidgetPackets.widgetFirstOption((Widget)var6);
                0;
                
                }
            } else if (p.lIlIllIIIllIIl(Prayers.isEnabled((Prayer)var1) ? 1 : 0)) {
                int llllllllllllllllIIlIlIIlIlIIlllI = llIllllllIl[2];
            }
            0;
            if (1 <= 1) continue;
            return false;
        }
        return bl2;
    }

    private static boolean lIlIllIIIlllII(int n2, int n3) {
        return n2 <= n3;
    }
}

