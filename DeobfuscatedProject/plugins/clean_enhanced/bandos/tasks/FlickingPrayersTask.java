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
package gg.squire.bandos.tasks;

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
import gg.squire.bandos.tasks.BandosManager;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Flicking prayers", priority=25)
public class FlickingPrayersTask
extends Task {
    
    private final  k X;
    private  int Z;
    private final  e W;
    private final  SquireBandosConfig Y;

    private static boolean var2(Object object) {
        return object != null;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public FlickingPrayersTask(e e2, k k2, SquireBandosConfig squireBandosConfig) {
        this.Z = var1[0];
        this.W = e2;
        this.X = k2;
        this.Y = squireBandosConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        p var4;
        if (p.var5(this.W.t() ? 1 : 0)) {
            return var1[1];
        }
        int var6 = Static.getClient().getTickCount();
        Prayer var7 = var4.X.a(var1[1], var4.W.s());
        Prayer var8 = var4.X.a(var1[2], var4.W.s());
        if (p.var9(var4.W.s() ? 1 : 0)) {
            if (p.var5(var4.W.y() ? 1 : 0)) {
                var8 = Prayer.PROTECT_FROM_MELEE;
                0;
                if (((0x20 ^ 5) & ~(0xAE ^ 0x8B)) < 0) {
                    return ((0x50 ^ 0x75) & ~(0x3D ^ 0x18)) != 0;
                }
            } else if (p.var9(var4.W.y() ? 1 : 0) && p.var10(var4.Z, var1[0])) {
                var4.Z = var6;
                0;
                if (3 < ((0x30 ^ 0x65 ^ (0x98 ^ 0x8D)) & (79 + 184 - 236 + 176 ^ 119 + 13 - 58 + 65 ^ -1))) {
                    return (1 & (1 ^ -1)) != 0;
                }
            } else if (p.var11(var6 - var4.Z, var1[3])) {
                var8 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        ArrayList<Prayer> var12 = new ArrayList<Prayer>(List.of(var4.Y.rangePrayer().h()));
        var12.add(var8);
        0;
        if (p.var2(var7) && p.var13(var7, var8) && p.var9(Prayers.isEnabled((Prayer)var7) ? 1 : 0)) {
            Widget var14 = Widgets.get((WidgetInfo)var7.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var14);
        }
        if (p.var9(var4.a(var12, var1[1]) ? 1 : 0)) {
            var4.sleep(var1[2]);
        }
        this.a((List<Prayer>)var4_4, var1[2]);
        0;
        return var1[2];
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    static {
        p.var16();
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var13(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static void var16() {
        var1 = new int[4];
        p.var1[0] = -1;
        p.var1[1] = (0x12 ^ 0x4C ^ (0x3C ^ 0x6A)) & (0x33 ^ 0x25 ^ (0x5A ^ 0x44) ^ -1);
        p.var1[2] = 1;
        p.var1[3] = 60 + 77 - 8 + 4 ^ 126 + 61 - 163 + 121;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = var1[1];
        Iterator<Prayer> var17 = list.iterator();
        while (p.var9(var17.hasNext() ? 1 : 0)) {
            void var18;
            Prayer var19 = var17.next();
            if (p.var3(var19, Prayer.PROTECT_ITEM)) {
                0;
                if ((52 + 47 - 47 + 120 ^ 54 + 4 - -59 + 51) >= 0) continue;
                return ((0x49 ^ 0x7A ^ (0xB8 ^ 0xAD)) & (9 + 163 - 25 + 20 ^ 111 + 25 - 50 + 43 ^ -1)) != 0;
            }
            if (!p.var5(Prayers.isEnabled((Prayer)var19) ? 1 : 0) || p.var9((int)var18)) {
                Widget var20 = Widgets.get((WidgetInfo)var19.getWidgetInfo());
                if (p.var15(var20)) {
                    0;
                    
                    return ((0x29 ^ 0x1A) & ~(0xAC ^ 0x9F)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var20);
                0;
                if null != null {
                    return ((93 + 3 - 84 + 116 ^ 103 + 166 - 116 + 35) & (0x62 ^ 0x6F ^ (0xA7 ^ 0x96) ^ -1)) != 0;
                }
            } else if (p.var5(Prayers.isEnabled((Prayer)var19) ? 1 : 0)) {
                int var21 = var1[2];
            }
            0;
            if (1 <= 1) continue;
            return ((0xB1 ^ 0x82) & ~(0x10 ^ 0x23)) != 0;
        }
        return bl2;
    }

    private static boolean var11(int n2, int n3) {
        return n2 <= n3;
    }
}

