package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.basics.dagannothkings.SquireDagannothKings;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Flicking")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ai  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ai.class */
public class C0009ai extends Task {
    private static /* synthetic */ int[] lIIllIII;
    private final /* synthetic */ C0005ae cL;
    private final /* synthetic */ DagannothKingConfig cM;
    private final /* synthetic */ SquireDagannothKings cN;
    private final /* synthetic */ C0004ad cK;

    private static void lIIIlllIII() {
        lIIllIII = new int[2];
        lIIllIII[0] = ((218 ^ 179) ^ (96 ^ 73)) & (((((94 + 31) - 114) + 122) ^ (((148 + 160) - 144) + 33)) ^ (-" ".length()));
        lIIllIII[1] = " ".length();
    }

    private static boolean lIIIlllIIl(Object obj) {
        return obj != null;
    }

    @Inject
    public C0009ai(C0004ad c0004ad, C0005ae c0005ae, DagannothKingConfig dagannothKingConfig, SquireDagannothKings squireDagannothKings) {
        this.cK = c0004ad;
        this.cL = c0005ae;
        this.cM = dagannothKingConfig;
        this.cN = squireDagannothKings;
    }

    private static boolean lIIIllllIl(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public boolean run() {
        Static.getClient().getTickCount();
        Prayer a = this.cL.a(lIIllIII[0], this.cK.bd());
        Prayer a2 = this.cL.a(lIIllIII[1], this.cK.bd());
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        "".length();
        if (lIIIlllIIl(a) && lIIIlllIlI(a, a2) && lIIIlllIll(Prayers.isEnabled(a) ? 1 : 0)) {
            WidgetPackets.widgetFirstOption(Widgets.get(a.getWidgetInfo()));
        }
        if (lIIIlllIll(a(arrayList, lIIllIII[0]) ? 1 : 0)) {
            sleep(lIIllIII[1]);
        }
        a(arrayList, lIIllIII[1]);
        "".length();
        return lIIllIII[1];
    }

    private static boolean lIIIlllIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIlllIll(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIllllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(List<Prayer> list, boolean z) {
        int i2 = lIIllIII[0];
        for (Prayer prayer : list) {
            if (lIIIllllII(prayer, Prayer.PROTECT_ITEM)) {
                "".length();
                if (0 != 0) {
                    return ("   ".length() ^ (32 ^ 53)) & (((101 ^ 69) ^ (247 ^ 193)) ^ (-" ".length()));
                }
            } else {
                if (!lIIIllllIl(Prayers.isEnabled(prayer) ? 1 : 0) || lIIIlllIll(z ? 1 : 0)) {
                    Widget widget = Widgets.get(prayer.getWidgetInfo());
                    if (lIIIlllllI(widget)) {
                        "".length();
                        if ((-" ".length()) >= " ".length()) {
                            return ((46 ^ 24) ^ (182 ^ 141)) & (((70 ^ 60) ^ (47 ^ 88)) ^ (-" ".length()));
                        }
                    } else {
                        WidgetPackets.widgetFirstOption(widget);
                        "".length();
                        if ((-" ".length()) > "   ".length()) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    }
                } else if (lIIIllllIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    i2 = lIIllIII[1];
                }
                "".length();
                if ((-"  ".length()) >= 0) {
                    return ((172 ^ 197) ^ (149 ^ 158)) & (((((29 + 67) - (-83)) + 37) ^ (((33 + 185) - 190) + 158)) ^ (-" ".length()));
                }
            }
        }
        return i2;
    }

    private static boolean lIIIlllllI(Object obj) {
        return obj == null;
    }

    static {
        lIIIlllIII();
    }
}
