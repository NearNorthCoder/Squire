package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Pray Flicking", priority = Integer.MAX_VALUE)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.v  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/v.class */
public class v extends Task {
    private final /* synthetic */ SquireShamanConfig av;
    private final /* synthetic */ c au;
    private static /* synthetic */ int[] lIIlIlllIlIII;
    private static final /* synthetic */ Logger at;

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(List<Prayer> list, boolean z) {
        int i = lIIlIlllIlIII[1];
        for (Prayer prayer : list) {
            if (!lIlIllIllIllIII(Prayers.isEnabled(prayer) ? 1 : 0) || lIlIllIllIllIIl(z ? 1 : 0)) {
                Widget widget = Widgets.get(prayer.getWidgetInfo());
                if (lIlIllIllIllIlI(widget)) {
                    "".length();
                    if (((0 ^ 80) & ((216 ^ 136) ^ (-1))) < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    WidgetPackets.widgetFirstOption(widget);
                    "".length();
                    if (((((103 + 131) - 201) + 119) ^ (((83 + 141) - 215) + 147)) < 0) {
                        return ((227 ^ 153) ^ (150 ^ 181)) & (((((156 + 182) - 184) + 97) ^ (((0 + 105) - 36) + 93)) ^ (-" ".length()));
                    }
                }
            } else if (lIlIllIllIllIII(Prayers.isEnabled(prayer) ? 1 : 0)) {
                i = lIIlIlllIlIII[0];
            }
            "".length();
            if ("   ".length() <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return i;
    }

    static {
        lIlIllIllIlIlll();
        at = LoggerFactory.getLogger(v.class);
    }

    private static boolean lIlIllIllIllIII(int i) {
        return i == 0;
    }

    private static boolean lIlIllIllIllIIl(int i) {
        return i != 0;
    }

    private static void lIlIllIllIlIlll() {
        lIIlIlllIlIII = new int[2];
        lIIlIlllIlIII[0] = " ".length();
        lIIlIlllIlIII[1] = "  ".length() & ("  ".length() ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    public boolean run() {
        if (lIlIllIllIllIII(this.av.room().x().contains(Players.getLocal()) ? 1 : 0)) {
            return F();
        }
        Widget widget = Widgets.get(WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);
        if (lIlIllIllIllIIl(Prayers.isQuickPrayerEnabled() ? 1 : 0) && lIlIllIllIllIIl(this.av.prayFlick() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption(widget);
            WidgetPackets.widgetFirstOption(widget);
            "".length();
            if ("  ".length() == (-" ".length())) {
                return ((59 ^ 19) ^ (32 ^ 86)) & (((134 ^ 140) ^ (243 ^ 167)) ^ (-" ".length()));
            }
        } else if (lIlIllIllIllIII(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            WidgetPackets.widgetFirstOption(widget);
        }
        return lIIlIlllIlIII[0];
    }

    private static boolean lIlIllIllIllIlI(Object obj) {
        return obj == null;
    }

    @Inject
    public v(c cVar, SquireShamanConfig squireShamanConfig) {
        this.au = cVar;
        this.av = squireShamanConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean F() {
        if (lIlIllIllIllIIl(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean) lIIlIlllIlIII[1]);
            return lIIlIlllIlIII[0];
        }
        return lIIlIlllIlIII[1];
    }
}
