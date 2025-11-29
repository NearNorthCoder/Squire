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
import gg.squire.bandos.tasks.EHelper;
import gg.squire.bandos.tasks.KHelper;

@TaskDesc(name="Flicking prayers", priority=25)
public class FlickingPrayersTask
extends Task {
    
    private final  k X;
    private  int Z;
    private final  e W;
    private final  SquireBandosConfig Y;

    private static boolean lIlIllIIIlllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIllIIIlllll(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public FlickingPrayersTask(e e2, k k2, SquireBandosConfig squireBandosConfig) {
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
        p var1;
        if (p.lIlIllIIIllIIl(this.W.t() ? 1 : 0)) {
            return llIllllllIl[1];
        }
        int var2 = Static.getClient().getTickCount();
        Prayer var3 = var1.X.a(llIllllllIl[1], var1.W.s());
        Prayer var4 = var1.X.a(llIllllllIl[2], var1.W.s());
        if (p.lIlIllIIIllIlI(var1.W.s() ? 1 : 0)) {
            if (p.lIlIllIIIllIIl(var1.W.y() ? 1 : 0)) {
                var4 = Prayer.PROTECT_FROM_MELEE;

                if (((0x20 ^ 5) & ~(0xAE ^ 0x8B)) < 0) {
                    return false;
                }
            } else if (p.lIlIllIIIllIlI(var1.W.y() ? 1 : 0) && p.lIlIllIIIllIll(var1.Z, llIllllllIl[0])) {
                var1.Z = var2;

                if (3 < ((0x30 ^ 0x65 ^ (0x98 ^ 0x8D)) & (79 + 184 - 236 + 176 ^ 119 + 13 - 58 + 65 ^ -1))) {
                    return (1 & (1 ^ -1)) != 0;
                }
            } else if (p.lIlIllIIIlllII(var2 - var1.Z, llIllllllIl[3])) {
                var4 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        ArrayList<Prayer> var5 = new ArrayList<Prayer>(List.of(var1.Y.rangePrayer().h()));
        var5.add(var4);

        if (p.lIlIllIIIlllIl(var3) && p.lIlIllIIIllllI(var3, var4) && p.lIlIllIIIllIlI(Prayers.isEnabled((Prayer)var3) ? 1 : 0)) {
            Widget var6 = Widgets.get((WidgetInfo)var3.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var6);
        }
        if (p.lIlIllIIIllIlI(var1.a(var5, llIllllllIl[1]) ? 1 : 0)) {
            var1.sleep(llIllllllIl[2]);
        }
        this.a((List<Prayer>)var4_4, llIllllllIl[2]);

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

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = llIllllllIl[1];
        Iterator<Prayer> var7 = list.iterator();
        while (p.lIlIllIIIllIlI(var7.hasNext() ? 1 : 0)) {
            void var8;
            Prayer var9 = var7.next();
            if (p.lIlIllIIIlllll(var9, Prayer.PROTECT_ITEM)) {

                if ((52 + 47 - 47 + 120 ^ 54 + 4 - -59 + 51) >= 0) continue;
                return ((0x49 ^ 0x7A ^ (0xB8 ^ 0xAD)) & (9 + 163 - 25 + 20 ^ 111 + 25 - 50 + 43 ^ -1)) != 0;
            }
            if (!p.lIlIllIIIllIIl(Prayers.isEnabled((Prayer)var9) ? 1 : 0) || p.lIlIllIIIllIlI((int)var8)) {
                Widget var10 = Widgets.get((WidgetInfo)var9.getWidgetInfo());
                if (p.lIlIllIIlIIIII(var10)) {

                    if (1 >= 0) continue;
                    return false;
                }
                WidgetPackets.widgetFirstOption((Widget)var10);

                }
            } else if (p.lIlIllIIIllIIl(Prayers.isEnabled((Prayer)var9) ? 1 : 0)) {
                int var11 = llIllllllIl[2];
            }

            if (1 <= 1) continue;
            return false;
        }
        return bl2;
    }

    private static boolean lIlIllIIIlllII(int n2, int n3) {
        return n2 <= n3;
    }
}

