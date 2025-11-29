package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Flicking prayers", priority = 25)
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.p  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/p.class */
public class p extends Task {
    private static /* synthetic */ int[] llIllllllIl;
    private final /* synthetic */ k X;
    private /* synthetic */ int Z = llIllllllIl[0];
    private final /* synthetic */ e W;
    private final /* synthetic */ SquireBandosConfig Y;

    private static boolean lIlIllIIIlllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllIIIlllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    public p(e eVar, k kVar, SquireBandosConfig squireBandosConfig) {
        this.W = eVar;
        this.X = kVar;
        this.Y = squireBandosConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    public boolean run() {
        if (lIlIllIIIllIIl(this.W.t() ? 1 : 0)) {
            return llIllllllIl[1];
        }
        int tickCount = Static.getClient().getTickCount();
        Prayer a = this.X.a(llIllllllIl[1], this.W.s());
        Prayer a2 = this.X.a(llIllllllIl[2], this.W.s());
        if (lIlIllIIIllIlI(this.W.s() ? 1 : 0)) {
            if (lIlIllIIIllIIl(this.W.y() ? 1 : 0)) {
                a2 = Prayer.PROTECT_FROM_MELEE;
                "".length();
                if (((32 ^ 5) & ((174 ^ 139) ^ (-1))) < 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIlIllIIIllIlI(this.W.y() ? 1 : 0) && lIlIllIIIllIll(this.Z, llIllllllIl[0])) {
                this.Z = tickCount;
                "".length();
                if ("   ".length() < (((48 ^ 101) ^ (152 ^ 141)) & (((((79 + 184) - 236) + 176) ^ (((119 + 13) - 58) + 65)) ^ (-" ".length())))) {
                    return " ".length() & (" ".length() ^ (-" ".length()));
                }
            } else if (lIlIllIIIlllII(tickCount - this.Z, llIllllllIl[3])) {
                a2 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        ArrayList arrayList = new ArrayList(List.of((Object[]) this.Y.rangePrayer().h()));
        arrayList.add(a2);
        "".length();
        if (lIlIllIIIlllIl(a) && lIlIllIIIllllI(a, a2) && lIlIllIIIllIlI(Prayers.isEnabled(a) ? 1 : 0)) {
            WidgetPackets.widgetFirstOption(Widgets.get(a.getWidgetInfo()));
        }
        if (lIlIllIIIllIlI(a(arrayList, llIllllllIl[1]) ? 1 : 0)) {
            sleep(llIllllllIl[2]);
        }
        a(arrayList, llIllllllIl[2]);
        "".length();
        return llIllllllIl[2];
    }

    private static boolean lIlIllIIlIIIII(Object obj) {
        return obj == null;
    }

    static {
        lIlIllIIIllIII();
    }

    private static boolean lIlIllIIIllIlI(int i) {
        return i != 0;
    }

    private static boolean lIlIllIIIllIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIIIllllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIllIIIllIIl(int i) {
        return i == 0;
    }

    private static void lIlIllIIIllIII() {
        llIllllllIl = new int[4];
        llIllllllIl[0] = -" ".length();
        llIllllllIl[1] = ((18 ^ 76) ^ (60 ^ 106)) & (((51 ^ 37) ^ (90 ^ 68)) ^ (-" ".length()));
        llIllllllIl[2] = " ".length();
        llIllllllIl[3] = (((60 + 77) - 8) + 4) ^ (((126 + 61) - 163) + 121);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(List<Prayer> list, boolean z) {
        int i = llIllllllIl[1];
        for (Prayer prayer : list) {
            if (lIlIllIIIlllll(prayer, Prayer.PROTECT_ITEM)) {
                "".length();
                if (((((52 + 47) - 47) + 120) ^ (((54 + 4) - (-59)) + 51)) < 0) {
                    return ((73 ^ 122) ^ (184 ^ 173)) & (((((9 + 163) - 25) + 20) ^ (((111 + 25) - 50) + 43)) ^ (-" ".length()));
                }
            } else {
                if (!lIlIllIIIllIIl(Prayers.isEnabled(prayer) ? 1 : 0) || lIlIllIIIllIlI(z ? 1 : 0)) {
                    Widget widget = Widgets.get(prayer.getWidgetInfo());
                    if (lIlIllIIlIIIII(widget)) {
                        "".length();
                        if (" ".length() < 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        WidgetPackets.widgetFirstOption(widget);
                        "".length();
                        if (0 != 0) {
                            return ((((93 + 3) - 84) + 116) ^ (((103 + 166) - 116) + 35)) & (((98 ^ 111) ^ (167 ^ 150)) ^ (-" ".length()));
                        }
                    }
                } else if (lIlIllIIIllIIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    i = llIllllllIl[2];
                }
                "".length();
                if (" ".length() > " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return i;
    }

    private static boolean lIlIllIIIlllII(int i, int i2) {
        return i <= i2;
    }
}
