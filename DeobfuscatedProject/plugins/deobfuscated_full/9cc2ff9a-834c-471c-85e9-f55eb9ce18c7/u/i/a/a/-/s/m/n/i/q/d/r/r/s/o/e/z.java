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

/* TASK: Handling kc prayers -> HandlingkcprayersTask */
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
        z.lIIlIIllIlllI[0] = (71 + 65 - -66 + 53 ^ 98 + 139 - 221 + 154) & (0xB1 ^ 0x9F ^ (0xDE ^ 0xA5) ^ -1);
        z.lIIlIIllIlllI[1] = 1;
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
        Iterator<Prayer> var7 = list.iterator();
        while (z.lIlIlIlIIllIlll(var7.hasNext() ? 1 : 0)) {
            void var9;
            Prayer var8 = var7.next();
            if (z.lIlIlIlIIlllIll(var8, Prayer.PROTECT_ITEM)) {
                0;
                if (((0x47 ^ 0x5D) & ~(0x74 ^ 0x6E)) == 0) continue;
                return false;
            }
            if (!z.lIlIlIlIIlllIlI(Prayers.isEnabled((Prayer)var8) ? 1 : 0) || z.lIlIlIlIIllIlll((int)var9)) {
                Widget var2 = Widgets.get((WidgetInfo)var8.getWidgetInfo());
                if (z.lIlIlIlIIlllIII(var2)) {
                    0;
                    if (((200 + 11 - 92 + 95 ^ 20 + 109 - -8 + 15) & (0x51 ^ 0x66 ^ (0x2C ^ 0x55) ^ -1)) == 0) continue;
                    return ((0x26 ^ 0x66 ^ (0x52 ^ 0x43)) & (0x22 ^ 0x1D ^ (0x23 ^ 0x4D) ^ -1)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var2);
                0;
                if (-1 >= 2) {
                    return ((0x1F ^ 0x53 ^ (0x5B ^ 0x4C)) & (0x43 ^ 0x74 ^ (0xDF ^ 0xB3) ^ -1)) != 0;
                }
            } else if (z.lIlIlIlIIlllIlI(Prayers.isEnabled((Prayer)var8) ? 1 : 0)) {
                int llllllllllllllIlllllIIlllIIIlIlI = lIIlIIllIlllI[1];
            }
            0;
            if (-1 == -1) continue;
            return false;
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
        z var3;
        if (z.lIlIlIlIIllIlll(this.ax.m() ? 1 : 0)) {
            return lIIlIIllIlllI[0];
        }
        if (z.lIlIlIlIIlllIII(Players.getLocal().getInteracting())) {
            Prayer[] var6 = Prayer.values();
            int var1 = var6.length;
            int var4 = lIIlIIllIlllI[0];
            while (z.lIlIlIlIIlllIIl(var4, var1)) {
                Prayer var5 = var6[var4];
                if (z.lIlIlIlIIlllIlI(Prayers.isEnabled((Prayer)var5) ? 1 : 0)) {
                    0;
                    if (-1 >= 2) {
                        return false;
                    }
                } else {
                    Prayers.toggle((Prayer)var5);
                }
                ++var4;
                0;
                
                return ((0x12 ^ 0x59 ^ (0x81 ^ 0x8A)) & (231 + 21 - 236 + 223 ^ 55 + 124 - 143 + 139 ^ -1)) != 0;
            }
            return lIIlIIllIlllI[0];
        }
        ArrayList<Prayer> var6 = new ArrayList<Prayer>();
        var6.add(Prayer.PROTECT_FROM_MAGIC);
        0;
        var6.addAll(Arrays.asList(var3.ay.rangePrayer().z()));
        0;
        if (z.lIlIlIlIIllIlll(var3.a(var6, lIIlIIllIlllI[0]) ? 1 : 0)) {
            var3.sleep(lIIlIIllIlllI[1]);
        }
        this.a((List<Prayer>)var1_2, lIIlIIllIlllI[1]);
        0;
        return lIIlIIllIlllI[1];
    }
}

