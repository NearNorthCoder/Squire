/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import u.i.r.d.s.e.r.q.y.a.h.-.a;
import u.i.r.d.s.e.r.q.y.a.h.-.h;

@TaskDesc(name="Handling Hydra prayers", priority=0x7FFFFFFF)
public class x
extends Task {
    private final /* synthetic */ a aT;
    private final /* synthetic */ SquireAlchemicalHydraConfig aR;
    private final /* synthetic */ Client aS;
    private static /* synthetic */ int[] llllIIlIllll;

    private static boolean lIIlIIIIIIIIIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllllllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllllllllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        x lllllllllllllllIIlIlIlIIlllIlIlI;
        void lllllllllllllllIIlIlIlIIlllIlIIl;
        h h2 = this.aT.k();
        if (!x.lIIIlllllllllII(h2) || !x.lIIIlllllllllII(h2.K()) || x.lIIIlllllllllIl(this.aT.g() ? 1 : 0)) {
            if (x.lIIIllllllllllI(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
            }
            return llllIIlIllll[0];
        }
        List<Prayer> lllllllllllllllIIlIlIlIIlllIlIII = List.of(lllllllllllllllIIlIlIlIIlllIlIIl.x(), lllllllllllllllIIlIlIlIIlllIlIlI.aR.getOffensivePrayer().z());
        Prayer[] lllllllllllllllIIlIlIlIIlllIIlll = Prayer.values();
        int lllllllllllllllIIlIlIlIIlllIIllI = lllllllllllllllIIlIlIlIIlllIIlll.length;
        int lllllllllllllllIIlIlIlIIlllIIlIl = llllIIlIllll[0];
        while (x.lIIIlllllllllll(lllllllllllllllIIlIlIlIIlllIIlIl, lllllllllllllllIIlIlIlIIlllIIllI)) {
            Prayer lllllllllllllllIIlIlIlIIlllIIlII = lllllllllllllllIIlIlIlIIlllIIlll[lllllllllllllllIIlIlIlIIlllIIlIl];
            if (x.lIIIllllllllllI(Prayers.isEnabled((Prayer)lllllllllllllllIIlIlIlIIlllIIlII) ? 1 : 0) && x.lIIIlllllllllIl(lllllllllllllllIIlIlIlIIlllIlIII.contains(lllllllllllllllIIlIlIlIIlllIIlII) ? 1 : 0)) {
                Prayers.toggle((Prayer)lllllllllllllllIIlIlIlIIlllIIlII);
            }
            ++lllllllllllllllIIlIlIlIIlllIIlIl;
            "".length();
            if (" ".length() > ((0x34 ^ 0x1F) & ~(0xA6 ^ 0x8D))) continue;
            return ((0x19 ^ 0x4C) & ~(0x7B ^ 0x2E)) != 0;
        }
        if (x.lIIIllllllllllI(lllllllllllllllIIlIlIlIIlllIlIlI.a(lllllllllllllllIIlIlIlIIlllIlIII, llllIIlIllll[1]) ? 1 : 0)) {
            lllllllllllllllIIlIlIlIIlllIlIlI.sleep(llllIIlIllll[1]);
        }
        this.a((List<Prayer>)var2_2, llllIIlIllll[0]);
        "".length();
        return llllIIlIllll[1];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = llllIIlIllll[0];
        Iterator<Prayer> lllllllllllllllIIlIlIlIIllIllIlI = list.iterator();
        while (x.lIIIllllllllllI(lllllllllllllllIIlIlIlIIllIllIlI.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIlIlIlIIllIlllII;
            Prayer lllllllllllllllIIlIlIlIIllIllIIl = lllllllllllllllIIlIlIlIIllIllIlI.next();
            if (x.lIIlIIIIIIIIIII(lllllllllllllllIIlIlIlIIllIllIIl, Prayer.PROTECT_ITEM)) {
                "".length();
                if (-" ".length() < "  ".length()) continue;
                return ((0x20 ^ 0x37) & ~(0xA3 ^ 0xB4)) != 0;
            }
            if (!x.lIIIlllllllllIl(Prayers.isEnabled((Prayer)lllllllllllllllIIlIlIlIIllIllIIl) ? 1 : 0) || x.lIIIllllllllllI((int)lllllllllllllllIIlIlIlIIllIlllII)) {
                Widget lllllllllllllllIIlIlIlIIllIllIII = Widgets.get((WidgetInfo)lllllllllllllllIIlIlIlIIllIllIIl.getWidgetInfo());
                if (x.lIIlIIIIIIIIIIl(lllllllllllllllIIlIlIlIIllIllIII)) {
                    "".length();
                    if (((0x50 ^ 0x5F ^ (0xBA ^ 0x92)) & (28 + 61 - 20 + 77 ^ 90 + 87 - 42 + 46 ^ -" ".length())) != -" ".length()) continue;
                    return ((54 + 85 - 51 + 39 ^ (0x1C ^ 0x64)) & (0x3C ^ 0x47 ^ (0xC9 ^ 0xB5) ^ -" ".length())) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)lllllllllllllllIIlIlIlIIllIllIII);
                "".length();
                if ("  ".length() > "  ".length()) {
                    return ((0xF4 ^ 0xB4 ^ (0x13 ^ 0x1B)) & (133 + 70 - 170 + 169 ^ 50 + 94 - 80 + 66 ^ -" ".length())) != 0;
                }
            } else if (x.lIIIlllllllllIl(Prayers.isEnabled((Prayer)lllllllllllllllIIlIlIlIIllIllIIl) ? 1 : 0)) {
                int lllllllllllllllIIlIlIlIIllIllIll = llllIIlIllll[1];
            }
            "".length();
            if (-"  ".length() < 0) continue;
            return ((0x15 ^ 0x38) & ~(0x1F ^ 0x32)) != 0;
        }
        return bl2;
    }

    @Inject
    public x(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, Client client) {
        this.aT = squireAlchemicalHydraPlugin.a();
        this.aR = squireAlchemicalHydraConfig;
        this.aS = client;
    }

    private static boolean lIIlIIIIIIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIlllllllllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        x.lIIIllllllllIll();
    }

    private static void lIIIllllllllIll() {
        llllIIlIllll = new int[2];
        x.llllIIlIllll[0] = (0x4D ^ 0x2D ^ (0x92 ^ 0xBB)) & (0xF8 ^ 0x8B ^ (0xA5 ^ 0x9F) ^ -" ".length());
        x.llllIIlIllll[1] = " ".length();
    }

    private static boolean lIIIlllllllllII(Object object) {
        return object != null;
    }
}

