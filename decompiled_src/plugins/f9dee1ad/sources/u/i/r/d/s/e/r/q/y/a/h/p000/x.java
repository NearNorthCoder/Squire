package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Handling Hydra prayers", priority = Integer.MAX_VALUE)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.x  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/x.class */
public class x extends Task {
    private final /* synthetic */ C0000a aT;
    private final /* synthetic */ SquireAlchemicalHydraConfig aR;
    private final /* synthetic */ Client aS;
    private static /* synthetic */ int[] llllIIlIllll;

    private static boolean lIIlIIIIIIIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIllllllllllI(int i) {
        return i != 0;
    }

    private static boolean lIIIlllllllllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    public boolean run() {
        h k = this.aT.k();
        if (!lIIIlllllllllII(k) || !lIIIlllllllllII(k.K()) || lIIIlllllllllIl(this.aT.g() ? 1 : 0)) {
            if (lIIIllllllllllI(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
            }
            return llllIIlIllll[0];
        }
        List of = List.of(k.x(), this.aR.getOffensivePrayer().z());
        Prayer[] values = Prayer.values();
        int length = values.length;
        int lllllllllllllllIIlIlIlIIlllIIlIl = llllIIlIllll[0];
        while (lIIIlllllllllll(lllllllllllllllIIlIlIlIIlllIIlIl, length)) {
            Prayer prayer = values[lllllllllllllllIIlIlIlIIlllIIlIl];
            if (lIIIllllllllllI(Prayers.isEnabled(prayer) ? 1 : 0) && lIIIlllllllllIl(of.contains(prayer) ? 1 : 0)) {
                Prayers.toggle(prayer);
            }
            lllllllllllllllIIlIlIlIIlllIIlIl++;
            "".length();
            if (" ".length() <= ((52 ^ 31) & ((166 ^ 141) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (lIIIllllllllllI(a(of, llllIIlIllll[1]) ? 1 : 0)) {
            sleep(llllIIlIllll[1]);
        }
        a(of, llllIIlIllll[0]);
        "".length();
        return llllIIlIllll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(List<Prayer> list, boolean z) {
        int i = llllIIlIllll[0];
        for (Prayer prayer : list) {
            if (lIIlIIIIIIIIIII(prayer, Prayer.PROTECT_ITEM)) {
                "".length();
                if ((-" ".length()) >= "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                if (!lIIIlllllllllIl(Prayers.isEnabled(prayer) ? 1 : 0) || lIIIllllllllllI(z ? 1 : 0)) {
                    Widget widget = Widgets.get(prayer.getWidgetInfo());
                    if (lIIlIIIIIIIIIIl(widget)) {
                        "".length();
                        if ((((80 ^ 95) ^ (186 ^ 146)) & (((((28 + 61) - 20) + 77) ^ (((90 + 87) - 42) + 46)) ^ (-" ".length()))) == (-" ".length())) {
                            return ((((54 + 85) - 51) + 39) ^ (28 ^ 100)) & (((60 ^ 71) ^ (201 ^ 181)) ^ (-" ".length()));
                        }
                    } else {
                        WidgetPackets.widgetFirstOption(widget);
                        "".length();
                        if ("  ".length() > "  ".length()) {
                            return ((244 ^ 180) ^ (19 ^ 27)) & (((((133 + 70) - 170) + 169) ^ (((50 + 94) - 80) + 66)) ^ (-" ".length()));
                        }
                    }
                } else if (lIIIlllllllllIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    i = llllIIlIllll[1];
                }
                "".length();
                if ((-"  ".length()) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return i;
    }

    @Inject
    public x(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, Client client) {
        this.aT = squireAlchemicalHydraPlugin.a();
        this.aR = squireAlchemicalHydraConfig;
        this.aS = client;
    }

    private static boolean lIIlIIIIIIIIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlllllllllll(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIllllllllIll();
    }

    private static void lIIIllllllllIll() {
        llllIIlIllll = new int[2];
        llllIIlIllll[0] = ((77 ^ 45) ^ (146 ^ 187)) & (((248 ^ 139) ^ (165 ^ 159)) ^ (-" ".length()));
        llllIIlIllll[1] = " ".length();
    }

    private static boolean lIIIlllllllllII(Object obj) {
        return obj != null;
    }
}
