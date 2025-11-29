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
 *  net.unethicalite.client.Static
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;
import q.s.r.i.e.s.o.u.a.d.n.-.b.k;

@TaskDesc(name="Flicking prayers", priority=25)
public class p
extends Task {
    private static /* synthetic */ int[] llIllllllIl;
    private final /* synthetic */ k X;
    private /* synthetic */ int Z;
    private final /* synthetic */ e W;
    private final /* synthetic */ SquireBandosConfig Y;

    private static boolean lIlIllIIIlllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIllIIIlllll(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public p(e e2, k k2, SquireBandosConfig squireBandosConfig) {
        this.Z = llIllllllIl[0];
        this.W = e2;
        this.X = k2;
        this.Y = squireBandosConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        p llllllllllllllllIIlIlIIlIlIlllII;
        if (p.lIlIllIIIllIIl(this.W.t() ? 1 : 0)) {
            return llIllllllIl[1];
        }
        int llllllllllllllllIIlIlIIlIlIllIll = Static.getClient().getTickCount();
        Prayer llllllllllllllllIIlIlIIlIlIllIlI = llllllllllllllllIIlIlIIlIlIlllII.X.a(llIllllllIl[1], llllllllllllllllIIlIlIIlIlIlllII.W.s());
        Prayer llllllllllllllllIIlIlIIlIlIllIIl = llllllllllllllllIIlIlIIlIlIlllII.X.a(llIllllllIl[2], llllllllllllllllIIlIlIIlIlIlllII.W.s());
        if (p.lIlIllIIIllIlI(llllllllllllllllIIlIlIIlIlIlllII.W.s() ? 1 : 0)) {
            if (p.lIlIllIIIllIIl(llllllllllllllllIIlIlIIlIlIlllII.W.y() ? 1 : 0)) {
                llllllllllllllllIIlIlIIlIlIllIIl = Prayer.PROTECT_FROM_MELEE;
                "".length();
                if (((0x20 ^ 5) & ~(0xAE ^ 0x8B)) < 0) {
                    return ((0x50 ^ 0x75) & ~(0x3D ^ 0x18)) != 0;
                }
            } else if (p.lIlIllIIIllIlI(llllllllllllllllIIlIlIIlIlIlllII.W.y() ? 1 : 0) && p.lIlIllIIIllIll(llllllllllllllllIIlIlIIlIlIlllII.Z, llIllllllIl[0])) {
                llllllllllllllllIIlIlIIlIlIlllII.Z = llllllllllllllllIIlIlIIlIlIllIll;
                "".length();
                if ("   ".length() < ((0x30 ^ 0x65 ^ (0x98 ^ 0x8D)) & (79 + 184 - 236 + 176 ^ 119 + 13 - 58 + 65 ^ -" ".length()))) {
                    return (" ".length() & (" ".length() ^ -" ".length())) != 0;
                }
            } else if (p.lIlIllIIIlllII(llllllllllllllllIIlIlIIlIlIllIll - llllllllllllllllIIlIlIIlIlIlllII.Z, llIllllllIl[3])) {
                llllllllllllllllIIlIlIIlIlIllIIl = Prayer.PROTECT_FROM_MELEE;
            }
        }
        ArrayList<Prayer> llllllllllllllllIIlIlIIlIlIllIII = new ArrayList<Prayer>(List.of(llllllllllllllllIIlIlIIlIlIlllII.Y.rangePrayer().h()));
        llllllllllllllllIIlIlIIlIlIllIII.add(llllllllllllllllIIlIlIIlIlIllIIl);
        "".length();
        if (p.lIlIllIIIlllIl(llllllllllllllllIIlIlIIlIlIllIlI) && p.lIlIllIIIllllI(llllllllllllllllIIlIlIIlIlIllIlI, llllllllllllllllIIlIlIIlIlIllIIl) && p.lIlIllIIIllIlI(Prayers.isEnabled((Prayer)llllllllllllllllIIlIlIIlIlIllIlI) ? 1 : 0)) {
            Widget llllllllllllllllIIlIlIIlIlIlIlll = Widgets.get((WidgetInfo)llllllllllllllllIIlIlIIlIlIllIlI.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)llllllllllllllllIIlIlIIlIlIlIlll);
        }
        if (p.lIlIllIIIllIlI(llllllllllllllllIIlIlIIlIlIlllII.a(llllllllllllllllIIlIlIIlIlIllIII, llIllllllIl[1]) ? 1 : 0)) {
            llllllllllllllllIIlIlIIlIlIlllII.sleep(llIllllllIl[2]);
        }
        this.a((List<Prayer>)var4_4, llIllllllIl[2]);
        "".length();
        return llIllllllIl[2];
    }

    private static boolean lIlIllIIlIIIII(Object object) {
        return object == null;
    }

    static {
        p.lIlIllIIIllIII();
    }

    private static boolean lIlIllIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIIllllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIllIIIllIIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIllIIIllIII() {
        llIllllllIl = new int[4];
        p.llIllllllIl[0] = -" ".length();
        p.llIllllllIl[1] = (0x12 ^ 0x4C ^ (0x3C ^ 0x6A)) & (0x33 ^ 0x25 ^ (0x5A ^ 0x44) ^ -" ".length());
        p.llIllllllIl[2] = " ".length();
        p.llIllllllIl[3] = 60 + 77 - 8 + 4 ^ 126 + 61 - 163 + 121;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = llIllllllIl[1];
        Iterator<Prayer> llllllllllllllllIIlIlIIlIlIIllIl = list.iterator();
        while (p.lIlIllIIIllIlI(llllllllllllllllIIlIlIIlIlIIllIl.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIlIlIIlIlIIllll;
            Prayer llllllllllllllllIIlIlIIlIlIIllII = llllllllllllllllIIlIlIIlIlIIllIl.next();
            if (p.lIlIllIIIlllll(llllllllllllllllIIlIlIIlIlIIllII, Prayer.PROTECT_ITEM)) {
                "".length();
                if ((52 + 47 - 47 + 120 ^ 54 + 4 - -59 + 51) >= 0) continue;
                return ((0x49 ^ 0x7A ^ (0xB8 ^ 0xAD)) & (9 + 163 - 25 + 20 ^ 111 + 25 - 50 + 43 ^ -" ".length())) != 0;
            }
            if (!p.lIlIllIIIllIIl(Prayers.isEnabled((Prayer)llllllllllllllllIIlIlIIlIlIIllII) ? 1 : 0) || p.lIlIllIIIllIlI((int)llllllllllllllllIIlIlIIlIlIIllll)) {
                Widget llllllllllllllllIIlIlIIlIlIIlIll = Widgets.get((WidgetInfo)llllllllllllllllIIlIlIIlIlIIllII.getWidgetInfo());
                if (p.lIlIllIIlIIIII(llllllllllllllllIIlIlIIlIlIIlIll)) {
                    "".length();
                    if (" ".length() >= 0) continue;
                    return ((0x29 ^ 0x1A) & ~(0xAC ^ 0x9F)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)llllllllllllllllIIlIlIIlIlIIlIll);
                "".length();
                if (null != null) {
                    return ((93 + 3 - 84 + 116 ^ 103 + 166 - 116 + 35) & (0x62 ^ 0x6F ^ (0xA7 ^ 0x96) ^ -" ".length())) != 0;
                }
            } else if (p.lIlIllIIIllIIl(Prayers.isEnabled((Prayer)llllllllllllllllIIlIlIIlIlIIllII) ? 1 : 0)) {
                int llllllllllllllllIIlIlIIlIlIIlllI = llIllllllIl[2];
            }
            "".length();
            if (" ".length() <= " ".length()) continue;
            return ((0xB1 ^ 0x82) & ~(0x10 ^ 0x23)) != 0;
        }
        return bl2;
    }

    private static boolean lIlIllIIIlllII(int n2, int n3) {
        return n2 <= n3;
    }
}

