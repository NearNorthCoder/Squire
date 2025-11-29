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
 *  net.unethicalite.api.entities.Players
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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@TaskDesc(name="Handling kc prayers", priority=10)
public class z
extends Task {
    private final /* synthetic */ g ax;
    private final /* synthetic */ SquireSaraConfig ay;
    private static /* synthetic */ int[] lIIlIIllIlllI;

    @Inject
    public z(g g2, SquireSaraConfig squireSaraConfig) {
        this.ax = g2;
        this.ay = squireSaraConfig;
    }

    private static boolean lIlIlIlIIlllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIlIlIIlllIII(Object object) {
        return object == null;
    }

    private static void lIlIlIlIIllIllI() {
        lIIlIIllIlllI = new int[2];
        z.lIIlIIllIlllI[0] = (71 + 65 - -66 + 53 ^ 98 + 139 - 221 + 154) & (0xB1 ^ 0x9F ^ (0xDE ^ 0xA5) ^ -" ".length());
        z.lIIlIIllIlllI[1] = " ".length();
    }

    private static boolean lIlIlIlIIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIIllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = lIIlIIllIlllI[0];
        Iterator<Prayer> llllllllllllllIlllllIIlllIIIlIIl = list.iterator();
        while (z.lIlIlIlIIllIlll(llllllllllllllIlllllIIlllIIIlIIl.hasNext() ? 1 : 0)) {
            void llllllllllllllIlllllIIlllIIIlIll;
            Prayer llllllllllllllIlllllIIlllIIIlIII = llllllllllllllIlllllIIlllIIIlIIl.next();
            if (z.lIlIlIlIIlllIll(llllllllllllllIlllllIIlllIIIlIII, Prayer.PROTECT_ITEM)) {
                "".length();
                if (((0x47 ^ 0x5D) & ~(0x74 ^ 0x6E)) == 0) continue;
                return ((0x8B ^ 0xA0) & ~(0x6A ^ 0x41)) != 0;
            }
            if (!z.lIlIlIlIIlllIlI(Prayers.isEnabled((Prayer)llllllllllllllIlllllIIlllIIIlIII) ? 1 : 0) || z.lIlIlIlIIllIlll((int)llllllllllllllIlllllIIlllIIIlIll)) {
                Widget llllllllllllllIlllllIIlllIIIIlll = Widgets.get((WidgetInfo)llllllllllllllIlllllIIlllIIIlIII.getWidgetInfo());
                if (z.lIlIlIlIIlllIII(llllllllllllllIlllllIIlllIIIIlll)) {
                    "".length();
                    if (((200 + 11 - 92 + 95 ^ 20 + 109 - -8 + 15) & (0x51 ^ 0x66 ^ (0x2C ^ 0x55) ^ -" ".length())) == 0) continue;
                    return ((0x26 ^ 0x66 ^ (0x52 ^ 0x43)) & (0x22 ^ 0x1D ^ (0x23 ^ 0x4D) ^ -" ".length())) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)llllllllllllllIlllllIIlllIIIIlll);
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return ((0x1F ^ 0x53 ^ (0x5B ^ 0x4C)) & (0x43 ^ 0x74 ^ (0xDF ^ 0xB3) ^ -" ".length())) != 0;
                }
            } else if (z.lIlIlIlIIlllIlI(Prayers.isEnabled((Prayer)llllllllllllllIlllllIIlllIIIlIII) ? 1 : 0)) {
                int llllllllllllllIlllllIIlllIIIlIlI = lIIlIIllIlllI[1];
            }
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return ((0x1E ^ 0x53) & ~(0xCB ^ 0x86)) != 0;
        }
        return bl2;
    }

    static {
        z.lIlIlIlIIllIllI();
    }

    private static boolean lIlIlIlIIlllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_2;
        z llllllllllllllIlllllIIlllIIlIlll;
        if (z.lIlIlIlIIllIlll(this.ax.m() ? 1 : 0)) {
            return lIIlIIllIlllI[0];
        }
        if (z.lIlIlIlIIlllIII(Players.getLocal().getInteracting())) {
            Prayer[] llllllllllllllIlllllIIlllIIlIllI = Prayer.values();
            int llllllllllllllIlllllIIlllIIlIlIl = llllllllllllllIlllllIIlllIIlIllI.length;
            int llllllllllllllIlllllIIlllIIlIlII = lIIlIIllIlllI[0];
            while (z.lIlIlIlIIlllIIl(llllllllllllllIlllllIIlllIIlIlII, llllllllllllllIlllllIIlllIIlIlIl)) {
                Prayer llllllllllllllIlllllIIlllIIlIIll = llllllllllllllIlllllIIlllIIlIllI[llllllllllllllIlllllIIlllIIlIlII];
                if (z.lIlIlIlIIlllIlI(Prayers.isEnabled((Prayer)llllllllllllllIlllllIIlllIIlIIll) ? 1 : 0)) {
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        return ((0x76 ^ 0x7A) & ~(0x46 ^ 0x4A)) != 0;
                    }
                } else {
                    Prayers.toggle((Prayer)llllllllllllllIlllllIIlllIIlIIll);
                }
                ++llllllllllllllIlllllIIlllIIlIlII;
                "".length();
                if (null == null) continue;
                return ((0x12 ^ 0x59 ^ (0x81 ^ 0x8A)) & (231 + 21 - 236 + 223 ^ 55 + 124 - 143 + 139 ^ -" ".length())) != 0;
            }
            return lIIlIIllIlllI[0];
        }
        ArrayList<Prayer> llllllllllllllIlllllIIlllIIlIllI = new ArrayList<Prayer>();
        llllllllllllllIlllllIIlllIIlIllI.add(Prayer.PROTECT_FROM_MAGIC);
        "".length();
        llllllllllllllIlllllIIlllIIlIllI.addAll(Arrays.asList(llllllllllllllIlllllIIlllIIlIlll.ay.rangePrayer().z()));
        "".length();
        if (z.lIlIlIlIIllIlll(llllllllllllllIlllllIIlllIIlIlll.a(llllllllllllllIlllllIIlllIIlIllI, lIIlIIllIlllI[0]) ? 1 : 0)) {
            llllllllllllllIlllllIIlllIIlIlll.sleep(lIIlIIllIlllI[1]);
        }
        this.a((List<Prayer>)var1_2, lIIlIIllIlllI[1]);
        "".length();
        return lIIlIIllIlllI[1];
    }
}

