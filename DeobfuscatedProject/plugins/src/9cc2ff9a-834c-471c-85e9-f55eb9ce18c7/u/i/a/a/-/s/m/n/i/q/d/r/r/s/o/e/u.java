/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.f;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@TaskDesc(name="Flicking prayers", priority=25)
public class u
extends Task {
    private static /* synthetic */ int[] lIIlIIllIIlll;
    private final /* synthetic */ g ah;
    private final /* synthetic */ f ai;
    private final /* synthetic */ SquireSaraConfig aj;

    static {
        u.lIlIlIlIIIlllII();
    }

    private static void lIlIlIlIIIlllII() {
        lIIlIIllIIlll = new int[2];
        u.lIIlIIllIIlll[0] = (6 ^ 2) & ~(0x81 ^ 0x85);
        u.lIIlIIllIIlll[1] = " ".length();
    }

    private static boolean lIlIlIlIIlIIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIlIlIIIlllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIlIIIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIIIllllI(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIIlIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIlIIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = lIIlIIllIIlll[0];
        Iterator<Prayer> llllllllllllllIlllllIlIIIIIlIIll = list.iterator();
        while (u.lIlIlIlIIlIIIII(llllllllllllllIlllllIlIIIIIlIIll.hasNext() ? 1 : 0)) {
            void llllllllllllllIlllllIlIIIIIlIlIl;
            Prayer llllllllllllllIlllllIlIIIIIlIIlI = llllllllllllllIlllllIlIIIIIlIIll.next();
            if (u.lIlIlIlIIlIIIIl(llllllllllllllIlllllIlIIIIIlIIlI, Prayer.PROTECT_ITEM)) {
                "".length();
                if ("  ".length() >= ((0x98 ^ 0xA9) & ~(0x7D ^ 0x4C))) continue;
                return ((0x8F ^ 0xAA) & ~(0xB9 ^ 0x9C)) != 0;
            }
            if (!u.lIlIlIlIIIlllIl(Prayers.isEnabled((Prayer)llllllllllllllIlllllIlIIIIIlIIlI) ? 1 : 0) || u.lIlIlIlIIlIIIII((int)llllllllllllllIlllllIlIIIIIlIlIl)) {
                Widget llllllllllllllIlllllIlIIIIIlIIIl = Widgets.get((WidgetInfo)llllllllllllllIlllllIlIIIIIlIIlI.getWidgetInfo());
                if (u.lIlIlIlIIlIIIlI(llllllllllllllIlllllIlIIIIIlIIIl)) {
                    "".length();
                    if (" ".length() != "  ".length()) continue;
                    return ((0x7D ^ 0x72 ^ (0x35 ^ 5)) & (0x3D ^ 0x62 ^ (0x3A ^ 0x5A) ^ -" ".length())) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)llllllllllllllIlllllIlIIIIIlIIIl);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return ((12 + 109 - 23 + 29 ^ (0xCA ^ 0x81)) & (0xC1 ^ 0xAA ^ (0xD5 ^ 0x8A) ^ -" ".length())) != 0;
                }
            } else if (u.lIlIlIlIIIlllIl(Prayers.isEnabled((Prayer)llllllllllllllIlllllIlIIIIIlIIlI) ? 1 : 0)) {
                int llllllllllllllIlllllIlIIIIIlIlII = lIIlIIllIIlll[1];
            }
            "".length();
            if (((9 ^ 0x2C) & ~(0x26 ^ 3)) >= 0) continue;
            return ((0x45 ^ 0x70) & ~(0x21 ^ 0x14)) != 0;
        }
        return bl2;
    }

    @Inject
    public u(g g2, f f2, SquireSaraConfig squireSaraConfig) {
        this.ah = g2;
        this.ai = f2;
        this.aj = squireSaraConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        u llllllllllllllIlllllIlIIIIlIIIlI;
        if (u.lIlIlIlIIIlllIl(this.ah.m() ? 1 : 0)) {
            return lIIlIIllIIlll[0];
        }
        Prayer llllllllllllllIlllllIlIIIIlIIIIl = llllllllllllllIlllllIlIIIIlIIIlI.ai.a(lIIlIIllIIlll[0], llllllllllllllIlllllIlIIIIlIIIlI.ah.l());
        Prayer llllllllllllllIlllllIlIIIIlIIIII = llllllllllllllIlllllIlIIIIlIIIlI.ai.a(lIIlIIllIIlll[1], llllllllllllllIlllllIlIIIIlIIIlI.ah.l());
        Prayer[] llllllllllllllIlllllIlIIIIIlllll = llllllllllllllIlllllIlIIIIlIIIlI.aj.rangePrayer().z();
        ArrayList<Prayer> llllllllllllllIlllllIlIIIIIllllI = new ArrayList<Prayer>(List.of(llllllllllllllIlllllIlIIIIIlllll));
        llllllllllllllIlllllIlIIIIIllllI.add(llllllllllllllIlllllIlIIIIlIIIII);
        "".length();
        if (u.lIlIlIlIIIllllI(llllllllllllllIlllllIlIIIIlIIIIl) && u.lIlIlIlIIIlllll(llllllllllllllIlllllIlIIIIlIIIIl, llllllllllllllIlllllIlIIIIlIIIII) && u.lIlIlIlIIlIIIII(Prayers.isEnabled((Prayer)llllllllllllllIlllllIlIIIIlIIIIl) ? 1 : 0)) {
            Widget llllllllllllllIlllllIlIIIIIlllIl = Widgets.get((WidgetInfo)llllllllllllllIlllllIlIIIIlIIIIl.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)llllllllllllllIlllllIlIIIIIlllIl);
        }
        if (u.lIlIlIlIIlIIIII(llllllllllllllIlllllIlIIIIlIIIlI.a(llllllllllllllIlllllIlIIIIIllllI, lIIlIIllIIlll[0]) ? 1 : 0)) {
            llllllllllllllIlllllIlIIIIlIIIlI.sleep(lIIlIIllIIlll[1]);
        }
        this.a((List<Prayer>)var4_4, lIIlIIllIIlll[1]);
        "".length();
        return lIIlIIllIIlll[1];
    }
}

