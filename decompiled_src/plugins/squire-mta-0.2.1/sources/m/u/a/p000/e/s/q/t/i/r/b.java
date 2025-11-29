package m.u.a.p000.e.s.q.t.i.r;

import gg.squire.mta.MagicArenaConfig;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.widgets.WidgetItem;
/* renamed from: m.u.a.-.e.s.q.t.i.r.b  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/b.class */
public abstract class b {
    protected final /* synthetic */ MagicArenaConfig o;

    protected MagicArenaConfig e() {
        return this.o;
    }

    public abstract c d();

    public void renderItemOverlay(Graphics2D graphics2D, int i, WidgetItem widgetItem) {
    }

    public abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public b(MagicArenaConfig magicArenaConfig) {
        this.o = magicArenaConfig;
    }

    public void a(Graphics2D graphics2D) {
    }
}
