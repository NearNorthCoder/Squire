package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Handling kc prayers", priority = 10)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.z  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/z.class */
public class z extends Task {
    private final /* synthetic */ C0006g ax;
    private final /* synthetic */ SquireSaraConfig ay;
    private static /* synthetic */ int[] lIIlIIllIlllI;

    @Inject
    public z(C0006g c0006g, SquireSaraConfig squireSaraConfig) {
        this.ax = c0006g;
        this.ay = squireSaraConfig;
    }

    private static boolean lIlIlIlIIlllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIlIlIIlllIII(Object obj) {
        return obj == null;
    }

    private static void lIlIlIlIIllIllI() {
        lIIlIIllIlllI = new int[2];
        lIIlIIllIlllI[0] = ((((71 + 65) - (-66)) + 53) ^ (((98 + 139) - 221) + 154)) & (((177 ^ 159) ^ (222 ^ 165)) ^ (-" ".length()));
        lIIlIIllIlllI[1] = " ".length();
    }

    private static boolean lIlIlIlIIlllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIlIIllIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(List<Prayer> list, boolean z) {
        int i = lIIlIIllIlllI[0];
        for (Prayer prayer : list) {
            if (lIlIlIlIIlllIll(prayer, Prayer.PROTECT_ITEM)) {
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                if (!lIlIlIlIIlllIlI(Prayers.isEnabled(prayer) ? 1 : 0) || lIlIlIlIIllIlll(z ? 1 : 0)) {
                    Widget widget = Widgets.get(prayer.getWidgetInfo());
                    if (lIlIlIlIIlllIII(widget)) {
                        "".length();
                        if ((((((200 + 11) - 92) + 95) ^ (((20 + 109) - (-8)) + 15)) & (((81 ^ 102) ^ (44 ^ 85)) ^ (-" ".length()))) != 0) {
                            return ((38 ^ 102) ^ (82 ^ 67)) & (((34 ^ 29) ^ (35 ^ 77)) ^ (-" ".length()));
                        }
                    } else {
                        WidgetPackets.widgetFirstOption(widget);
                        "".length();
                        if ((-" ".length()) >= "  ".length()) {
                            return ((31 ^ 83) ^ (91 ^ 76)) & (((67 ^ 116) ^ (223 ^ 179)) ^ (-" ".length()));
                        }
                    }
                } else if (lIlIlIlIIlllIlI(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    i = lIIlIIllIlllI[1];
                }
                "".length();
                if ((-" ".length()) != (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return i;
    }

    static {
        lIlIlIlIIllIllI();
    }

    private static boolean lIlIlIlIIlllIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    public boolean run() {
        if (lIlIlIlIIllIlll(this.ax.m() ? 1 : 0)) {
            return lIIlIIllIlllI[0];
        }
        if (!lIlIlIlIIlllIII(Players.getLocal().getInteracting())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Prayer.PROTECT_FROM_MAGIC);
            "".length();
            arrayList.addAll(Arrays.asList(this.ay.rangePrayer().z()));
            "".length();
            if (lIlIlIlIIllIlll(a(arrayList, lIIlIIllIlllI[0]) ? 1 : 0)) {
                sleep(lIIlIIllIlllI[1]);
            }
            a(arrayList, lIIlIIllIlllI[1]);
            "".length();
            return lIIlIIllIlllI[1];
        }
        Prayer[] values = Prayer.values();
        int length = values.length;
        int i = lIIlIIllIlllI[0];
        while (lIlIlIlIIlllIIl(i, length)) {
            Prayer prayer = values[i];
            if (lIlIlIlIIlllIlI(Prayers.isEnabled(prayer) ? 1 : 0)) {
                "".length();
                if ((-" ".length()) >= "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                Prayers.toggle(prayer);
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((18 ^ 89) ^ (129 ^ 138)) & (((((231 + 21) - 236) + 223) ^ (((55 + 124) - 143) + 139)) ^ (-" ".length()));
            }
        }
        return lIIlIIllIlllI[0];
    }
}
