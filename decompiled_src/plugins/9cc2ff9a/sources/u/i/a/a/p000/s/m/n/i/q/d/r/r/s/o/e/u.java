package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Flicking prayers", priority = 25)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.u  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/u.class */
public class u extends Task {
    private static /* synthetic */ int[] lIIlIIllIIlll;
    private final /* synthetic */ C0006g ah;
    private final /* synthetic */ C0005f ai;
    private final /* synthetic */ SquireSaraConfig aj;

    static {
        lIlIlIlIIIlllII();
    }

    private static void lIlIlIlIIIlllII() {
        lIIlIIllIIlll = new int[2];
        lIIlIIllIIlll[0] = (6 ^ 2) & ((129 ^ 133) ^ (-1));
        lIIlIIllIIlll[1] = " ".length();
    }

    private static boolean lIlIlIlIIlIIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIlIlIIIlllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIlIlIIIlllIl(int i) {
        return i == 0;
    }

    private static boolean lIlIlIlIIIllllI(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIlIIlIIIII(int i) {
        return i != 0;
    }

    private static boolean lIlIlIlIIlIIIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(List<Prayer> list, boolean z) {
        int i = lIIlIIllIIlll[0];
        for (Prayer prayer : list) {
            if (lIlIlIlIIlIIIIl(prayer, Prayer.PROTECT_ITEM)) {
                "".length();
                if ("  ".length() < ((152 ^ 169) & ((125 ^ 76) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                if (lIlIlIlIIIlllIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    int llllllllllllllIlllllIlIIIIIlIlIl = z ? 1 : 0;
                    if (!lIlIlIlIIlIIIII(llllllllllllllIlllllIlIIIIIlIlIl)) {
                        if (lIlIlIlIIIlllIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                            i = lIIlIIllIIlll[1];
                        }
                        "".length();
                        if (((9 ^ 44) & ((38 ^ 3) ^ (-1))) >= 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    }
                }
                Widget widget = Widgets.get(prayer.getWidgetInfo());
                if (lIlIlIlIIlIIIlI(widget)) {
                    "".length();
                    if (" ".length() == "  ".length()) {
                        return ((125 ^ 114) ^ (53 ^ 5)) & (((61 ^ 98) ^ (58 ^ 90)) ^ (-" ".length()));
                    }
                } else {
                    WidgetPackets.widgetFirstOption(widget);
                    "".length();
                    if ((-" ".length()) != (-" ".length())) {
                        return ((((12 + 109) - 23) + 29) ^ (202 ^ 129)) & (((193 ^ 170) ^ (213 ^ 138)) ^ (-" ".length()));
                    }
                    "".length();
                    if (((9 ^ 44) & ((38 ^ 3) ^ (-1))) >= 0) {
                    }
                }
            }
        }
        return i;
    }

    @Inject
    public u(C0006g c0006g, C0005f c0005f, SquireSaraConfig squireSaraConfig) {
        this.ah = c0006g;
        this.ai = c0005f;
        this.aj = squireSaraConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    public boolean run() {
        if (lIlIlIlIIIlllIl(this.ah.m() ? 1 : 0)) {
            return lIIlIIllIIlll[0];
        }
        Prayer a = this.ai.a(lIIlIIllIIlll[0], this.ah.l());
        Prayer a2 = this.ai.a(lIIlIIllIIlll[1], this.ah.l());
        ArrayList arrayList = new ArrayList(List.of((Object[]) this.aj.rangePrayer().z()));
        arrayList.add(a2);
        "".length();
        if (lIlIlIlIIIllllI(a) && lIlIlIlIIIlllll(a, a2) && lIlIlIlIIlIIIII(Prayers.isEnabled(a) ? 1 : 0)) {
            WidgetPackets.widgetFirstOption(Widgets.get(a.getWidgetInfo()));
        }
        if (lIlIlIlIIlIIIII(a(arrayList, lIIlIIllIIlll[0]) ? 1 : 0)) {
            sleep(lIIlIIllIIlll[1]);
        }
        a(arrayList, lIIlIIllIIlll[1]);
        "".length();
        return lIIlIIllIIlll[1];
    }
}
