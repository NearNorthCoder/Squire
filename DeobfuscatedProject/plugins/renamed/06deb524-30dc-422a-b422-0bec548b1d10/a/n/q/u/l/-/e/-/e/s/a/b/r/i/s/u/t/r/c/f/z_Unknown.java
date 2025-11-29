/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;

public class z_Unknown
extends w {
    private final /* synthetic */ WidgetInfo az;
    private static /* synthetic */ int[] lIIllIIIlllI;

    public z(String string, WidgetInfo widgetInfo) {
        super(string);
        this.az = widgetInfo;
    }

    public WidgetInfo M() {
        return this.az;
    }

    private static void llIIlllIIIllIl() {
        lIIllIIIlllI = new int[2];
        z.lIIllIIIlllI[0] = (0x24 ^ 0x4F ^ (0xF8 ^ 0xC4)) & (0x50 ^ 0x5F ^ (0xDE ^ 0x86) ^ -1);
        z.lIIllIIIlllI[1] = 1;
    }

    @Override
    public boolean c(o o2) {
        Widget widget = Widgets.get((WidgetInfo)this.az);
        if (z.llIIlllIIIlllI(widget)) {
            return lIIllIIIlllI[0];
        }
        widget.interact(lIIllIIIlllI[0]);
        return lIIllIIIlllI[1];
    }

    private static boolean llIIlllIIIlllI(Object object) {
        return object == null;
    }

    static {
        z.llIIlllIIIllIl();
    }
}

