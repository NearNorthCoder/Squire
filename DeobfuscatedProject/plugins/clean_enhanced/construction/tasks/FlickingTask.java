/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.basics.dagannothkings.SquireDagannothKings;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import gg.squire.construction.tasks.ConstructionManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Flicking")
public class FlickingTask
extends Task {
    private static  int[] lIIllIII;
    private final  ae cL;
    private final  DagannothKingConfig cM;
    private final  SquireDagannothKings cN;
    private final  ad cK;

    private static void var1() {
        lIIllIII = new int[2];
        ai.lIIllIII[0] = (0xDA ^ 0xB3 ^ (0x60 ^ 0x49)) & (94 + 31 - 114 + 122 ^ 148 + 160 - 144 + 33 ^ -1);
        ai.lIIllIII[1] = 1;
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    @Inject
    public FlickingTask(ad ad2, ae ae2, DagannothKingConfig dagannothKingConfig, SquireDagannothKings squireDagannothKings) {
        this.cK = ad2;
        this.cL = ae2;
        this.cM = dagannothKingConfig;
        this.cN = squireDagannothKings;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4;
        ai var5;
        int n2 = Static.getClient().getTickCount();
        Prayer prayer = this.cL.a(lIIllIII[0], this.cK.bd());
        Prayer prayer2 = this.cL.a(lIIllIII[1], this.cK.bd());
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.add(prayer2);
        0;
        if (ai.var2(prayer) && ai.var6(prayer, prayer2) && ai.var7(Prayers.isEnabled((Prayer)prayer) ? 1 : 0)) {
            Widget widget = Widgets.get((WidgetInfo)prayer.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)widget);
        }
        if (ai.var7(var5.a((List<Prayer>)var4, lIIllIII[0]) ? 1 : 0)) {
            var5.sleep(lIIllIII[1]);
        }
        this.a(arrayList, lIIllIII[1]);
        0;
        return lIIllIII[1];
    }

    private static boolean var6(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static boolean var8(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl2) {
        boolean bl3 = lIIllIII[0];
        Iterator<Prayer> var9 = list.iterator();
        while (ai.var7(var9.hasNext() ? 1 : 0)) {
            void var10;
            Prayer var11 = var9.next();
            if (ai.var8(var11, Prayer.PROTECT_ITEM)) {
                0;
                if null == null continue;
                return ((3 ^ (0x20 ^ 0x35)) & (0x65 ^ 0x45 ^ (0xF7 ^ 0xC1) ^ -1)) != 0;
            }
            if (!ai.var3(Prayers.isEnabled((Prayer)var11) ? 1 : 0) || ai.var7((int)var10)) {
                Widget var12 = Widgets.get((WidgetInfo)var11.getWidgetInfo());
                if (ai.var13(var12)) {
                    0;
                    if (-1 < 1) continue;
                    return ((0x2E ^ 0x18 ^ (0xB6 ^ 0x8D)) & (0x46 ^ 0x3C ^ (0x2F ^ 0x58) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var12);
                0;
                if (-1 > 3) {
                    return ((0x57 ^ 0x6D) & ~(0xE ^ 0x34)) != 0;
                }
            } else if (ai.var3(Prayers.isEnabled((Prayer)var11) ? 1 : 0)) {
                int var14 = lIIllIII[1];
            }
            0;
            if (-2 < 0) continue;
            return ((0xAC ^ 0xC5 ^ (0x95 ^ 0x9E)) & (29 + 67 - -83 + 37 ^ 33 + 185 - 190 + 158 ^ -1)) != 0;
        }
        return bl3;
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    static {
        ai.var1();
    }
}

