package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.z  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/z.class */
public class z extends w {
    private final /* synthetic */ WidgetInfo az;
    private static /* synthetic */ int[] lIIllIIIlllI;

    public z(String str, WidgetInfo widgetInfo) {
        super(str);
        this.az = widgetInfo;
    }

    public WidgetInfo M() {
        return this.az;
    }

    private static void llIIlllIIIllIl() {
        lIIllIIIlllI = new int[2];
        lIIllIIIlllI[0] = ((36 ^ 79) ^ (248 ^ 196)) & (((80 ^ 95) ^ (222 ^ 134)) ^ (-" ".length()));
        lIIllIIIlllI[1] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.w
    public boolean c(C0014o c0014o) {
        Widget widget = Widgets.get(this.az);
        if (llIIlllIIIlllI(widget)) {
            return lIIllIIIlllI[0];
        }
        widget.interact(lIIllIIIlllI[0]);
        return lIIllIIIlllI[1];
    }

    private static boolean llIIlllIIIlllI(Object obj) {
        return obj == null;
    }

    static {
        llIIlllIIIllIl();
    }
}
