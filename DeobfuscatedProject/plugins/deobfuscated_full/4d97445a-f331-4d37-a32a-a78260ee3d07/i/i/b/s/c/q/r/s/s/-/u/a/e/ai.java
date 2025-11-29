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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.basics.dagannothkings.SquireDagannothKings;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ad;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ae;
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

/* TASK: Flicking -> FlickingTask */
@TaskDesc(name="Flicking")
public class ai
extends Task {
    private static /* synthetic */ int[] lIIllIII;
    private final /* synthetic */ ae cL;
    private final /* synthetic */ DagannothKingConfig cM;
    private final /* synthetic */ SquireDagannothKings cN;
    private final /* synthetic */ ad cK;

    private static void lIIIlllIII() {
        lIIllIII = new int[2];
        ai.lIIllIII[0] = (0xDA ^ 0xB3 ^ (0x60 ^ 0x49)) & (94 + 31 - 114 + 122 ^ 148 + 160 - 144 + 33 ^ -1);
        ai.lIIllIII[1] = 1;
    }

    private static boolean lIIIlllIIl(Object object) {
        return object != null;
    }

    @Inject
    public ai(ad ad2, ae ae2, DagannothKingConfig dagannothKingConfig, SquireDagannothKings squireDagannothKings) {
        this.cK = ad2;
        this.cL = ae2;
        this.cM = dagannothKingConfig;
        this.cN = squireDagannothKings;
    }

    private static boolean lIIIllllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void lllIIIIllIlllll;
        ai lllIIIIlllIIIll;
        int n2 = Static.getClient().getTickCount();
        Prayer prayer = this.cL.a(lIIllIII[0], this.cK.bd());
        Prayer prayer2 = this.cL.a(lIIllIII[1], this.cK.bd());
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.add(prayer2);
        0;
        if (ai.lIIIlllIIl(prayer) && ai.lIIIlllIlI(prayer, prayer2) && ai.lIIIlllIll(Prayers.isEnabled((Prayer)prayer) ? 1 : 0)) {
            Widget widget = Widgets.get((WidgetInfo)prayer.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)widget);
        }
        if (ai.lIIIlllIll(lllIIIIlllIIIll.a((List<Prayer>)lllIIIIllIlllll, lIIllIII[0]) ? 1 : 0)) {
            lllIIIIlllIIIll.sleep(lIIllIII[1]);
        }
        this.a(arrayList, lIIllIII[1]);
        0;
        return lIIllIII[1];
    }

    private static boolean lIIIlllIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIlllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl2) {
        boolean bl3 = lIIllIII[0];
        Iterator<Prayer> lllIIIIllIlIlII = list.iterator();
        while (ai.lIIIlllIll(lllIIIIllIlIlII.hasNext() ? 1 : 0)) {
            void lllIIIIllIlIllI;
            Prayer lllIIIIllIlIIll = lllIIIIllIlIlII.next();
            if (ai.lIIIllllII(lllIIIIllIlIIll, Prayer.PROTECT_ITEM)) {
                0;
                
                return ((3 ^ (0x20 ^ 0x35)) & (0x65 ^ 0x45 ^ (0xF7 ^ 0xC1) ^ -1)) != 0;
            }
            if (!ai.lIIIllllIl(Prayers.isEnabled((Prayer)lllIIIIllIlIIll) ? 1 : 0) || ai.lIIIlllIll((int)lllIIIIllIlIllI)) {
                Widget lllIIIIllIlIIlI = Widgets.get((WidgetInfo)lllIIIIllIlIIll.getWidgetInfo());
                if (ai.lIIIlllllI(lllIIIIllIlIIlI)) {
                    0;
                    if (-1 < 1) continue;
                    return ((0x2E ^ 0x18 ^ (0xB6 ^ 0x8D)) & (0x46 ^ 0x3C ^ (0x2F ^ 0x58) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)lllIIIIllIlIIlI);
                0;
                if (-1 > 3) {
                    return false;
                }
            } else if (ai.lIIIllllIl(Prayers.isEnabled((Prayer)lllIIIIllIlIIll) ? 1 : 0)) {
                int lllIIIIllIlIlIl = lIIllIII[1];
            }
            0;
            if (-2 < 0) continue;
            return ((0xAC ^ 0xC5 ^ (0x95 ^ 0x9E)) & (29 + 67 - -83 + 37 ^ 33 + 185 - 190 + 158 ^ -1)) != 0;
        }
        return bl3;
    }

    private static boolean lIIIlllllI(Object object) {
        return object == null;
    }

    static {
        ai.lIIIlllIII();
    }
}

