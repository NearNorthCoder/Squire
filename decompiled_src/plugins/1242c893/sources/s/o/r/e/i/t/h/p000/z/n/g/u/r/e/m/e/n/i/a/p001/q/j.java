package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Prayer Flicking", priority = Integer.MAX_VALUE)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.j  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/j.class */
public class j extends Task {
    private final /* synthetic */ SquireNightmareZone Y;
    private final /* synthetic */ Client aa;
    private static /* synthetic */ int[] lIIIlIIIIlllI;
    private final /* synthetic */ SquireNightmareZoneConfig Z;

    private static boolean lIIllllIIlIlIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    public boolean run() {
        if (!lIIllllIIlIIllI(this.Z.usePrayer() ? 1 : 0) && !lIIllllIIlIIllI(this.aa.isInInstancedRegion() ? 1 : 0)) {
            if (lIIllllIIlIIlll(this.Y.d().isEmpty() ? 1 : 0) && lIIllllIIlIIlll(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIIIlIIIIlllI[1];
            }
            if (lIIllllIIlIlIII(this.Z.offensivePrayer())) {
                this.Y.d().add(this.Z.offensivePrayer().j());
                "".length();
            }
            if (lIIllllIIlIIlll(this.Z.protectFromMelee() ? 1 : 0)) {
                this.Y.d().add(Prayer.PROTECT_FROM_MELEE);
                "".length();
            }
            Prayers.flick(new ArrayList(this.Y.d()), this.Z.perfectFlick());
            "".length();
            return lIIIlIIIIlllI[1];
        }
        return lIIIlIIIIlllI[0];
    }

    private static void lIIllllIIlIIlIl() {
        lIIIlIIIIlllI = new int[2];
        lIIIlIIIIlllI[0] = ((((88 + 128) - 212) + 231) ^ (((134 + 129) - 175) + 94)) & (((((192 + 195) - 353) + 197) ^ (((94 + 3) - (-61)) + 28)) ^ (-" ".length()));
        lIIIlIIIIlllI[1] = " ".length();
    }

    private static boolean lIIllllIIlIIlll(int i) {
        return i != 0;
    }

    private static boolean lIIllllIIlIIllI(int i) {
        return i == 0;
    }

    @Inject
    public j(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.Y = squireNightmareZone;
        this.Z = squireNightmareZoneConfig;
        this.aa = client;
    }

    private static boolean lIIllllIIlIlIIl(Object obj) {
        return obj == null;
    }

    static {
        lIIllllIIlIIlIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(HashSet<Prayer> hashSet, boolean z) {
        int i = lIIIlIIIIlllI[0];
        Iterator<Prayer> it = hashSet.iterator();
        while (lIIllllIIlIIlll(it.hasNext() ? 1 : 0)) {
            Prayer next = it.next();
            if (!lIIllllIIlIIllI(Prayers.isEnabled(next) ? 1 : 0) || lIIllllIIlIIlll(z ? 1 : 0)) {
                Widget widget = Widgets.get(next.getWidgetInfo());
                if (lIIllllIIlIlIIl(widget)) {
                    "".length();
                    if ("  ".length() >= ((((52 + 116) - 93) + 112) ^ (((180 + 154) - 271) + 128))) {
                        return ((0 ^ 19) ^ (180 ^ 143)) & (((54 ^ 99) ^ (87 ^ 42)) ^ (-" ".length()));
                    }
                } else {
                    WidgetPackets.widgetFirstOption(widget);
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            } else if (lIIllllIIlIIllI(Prayers.isEnabled(next) ? 1 : 0)) {
                i = lIIIlIIIIlllI[1];
            }
            "".length();
            if ((-" ".length()) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return i;
    }
}
