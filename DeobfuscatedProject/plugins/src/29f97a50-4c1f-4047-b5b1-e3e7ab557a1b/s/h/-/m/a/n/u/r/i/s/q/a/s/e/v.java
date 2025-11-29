/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

@TaskDesc(name="Pray Flicking", priority=0x7FFFFFFF)
public class v
extends Task {
    private final /* synthetic */ SquireShamanConfig av;
    private final /* synthetic */ c au;
    private static /* synthetic */ int[] lIIlIlllIlIII;
    private static final /* synthetic */ Logger at;

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = lIIlIlllIlIII[1];
        Iterator<Prayer> llllllllllllllIllllIlIIIlIllllIl = list.iterator();
        while (v.lIlIllIllIllIIl(llllllllllllllIllllIlIIIlIllllIl.hasNext() ? 1 : 0)) {
            void llllllllllllllIllllIlIIIlIllllll;
            Prayer llllllllllllllIllllIlIIIlIllllII = llllllllllllllIllllIlIIIlIllllIl.next();
            if (!v.lIlIllIllIllIII(Prayers.isEnabled((Prayer)llllllllllllllIllllIlIIIlIllllII) ? 1 : 0) || v.lIlIllIllIllIIl((int)llllllllllllllIllllIlIIIlIllllll)) {
                Widget llllllllllllllIllllIlIIIlIlllIll = Widgets.get((WidgetInfo)llllllllllllllIllllIlIIIlIllllII.getWidgetInfo());
                if (v.lIlIllIllIllIlI(llllllllllllllIllllIlIIIlIlllIll)) {
                    "".length();
                    if (((0 ^ 0x50) & ~(0xD8 ^ 0x88)) >= 0) continue;
                    return ((0x69 ^ 0x45) & ~(0x1D ^ 0x31)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)llllllllllllllIllllIlIIIlIlllIll);
                "".length();
                if ((103 + 131 - 201 + 119 ^ 83 + 141 - 215 + 147) < 0) {
                    return ((0xE3 ^ 0x99 ^ (0x96 ^ 0xB5)) & (156 + 182 - 184 + 97 ^ 0 + 105 - 36 + 93 ^ -" ".length())) != 0;
                }
            } else if (v.lIlIllIllIllIII(Prayers.isEnabled((Prayer)llllllllllllllIllllIlIIIlIllllII) ? 1 : 0)) {
                int llllllllllllllIllllIlIIIlIlllllI = lIIlIlllIlIII[0];
            }
            "".length();
            if ("   ".length() > 0) continue;
            return ((0xE2 ^ 0xC1) & ~(0xE7 ^ 0xC4)) != 0;
        }
        return bl2;
    }

    static {
        v.lIlIllIllIlIlll();
        at = LoggerFactory.getLogger(v.class);
    }

    private static boolean lIlIllIllIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIllIllIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIllIlIlll() {
        lIIlIlllIlIII = new int[2];
        v.lIIlIlllIlIII[0] = " ".length();
        v.lIIlIlllIlIII[1] = "  ".length() & ("  ".length() ^ -" ".length());
    }

    public boolean run() {
        v llllllllllllllIllllIlIIIllIIlIII;
        if (v.lIlIllIllIllIII(this.av.room().x().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return this.F();
        }
        Widget llllllllllllllIllllIlIIIllIIIlll = Widgets.get((WidgetInfo)WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);
        if (v.lIlIllIllIllIIl(Prayers.isQuickPrayerEnabled() ? 1 : 0) && v.lIlIllIllIllIIl(llllllllllllllIllllIlIIIllIIlIII.av.prayFlick() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)llllllllllllllIllllIlIIIllIIIlll);
            WidgetPackets.widgetFirstOption((Widget)llllllllllllllIllllIlIIIllIIIlll);
            "".length();
            if ("  ".length() == -" ".length()) {
                return ((0x3B ^ 0x13 ^ (0x20 ^ 0x56)) & (0x86 ^ 0x8C ^ (0xF3 ^ 0xA7) ^ -" ".length())) != 0;
            }
        } else if (v.lIlIllIllIllIII(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)llllllllllllllIllllIlIIIllIIIlll);
        }
        return lIIlIlllIlIII[0];
    }

    private static boolean lIlIllIllIllIlI(Object object) {
        return object == null;
    }

    @Inject
    public v(c c2, SquireShamanConfig squireShamanConfig) {
        this.au = c2;
        this.av = squireShamanConfig;
    }

    private boolean F() {
        if (v.lIlIllIllIllIIl(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean)lIIlIlllIlIII[1]);
            return lIIlIlllIlIII[0];
        }
        return lIIlIlllIlIII[1];
    }
}

