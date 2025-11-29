package m.u.a.p000.e.s.q.t.i.r;

import gg.squire.mta.SquireMTA;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
/* renamed from: m.u.a.-.e.s.q.t.i.r.p  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/p.class */
public class p extends WidgetItemOverlay {
    private static /* synthetic */ int[] lllIllIIlIIl;
    private final /* synthetic */ SquireMTA aq;

    public void renderItemOverlay(Graphics2D graphics2D, int i, WidgetItem widgetItem) {
        b[] b = this.aq.b();
        int length = b.length;
        int i2 = lllIllIIlIIl[0];
        while (lIIIllIIlllIllI(i2, length)) {
            b bVar = b[i2];
            if (lIIIllIIlllIlll(bVar.c() ? 1 : 0)) {
                bVar.renderItemOverlay(graphics2D, i, widgetItem);
            }
            i2++;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
    }

    private static boolean lIIIllIIlllIllI(int i, int i2) {
        return i < i2;
    }

    @Inject
    public p(SquireMTA squireMTA) {
        this.aq = squireMTA;
        showOnInventory();
    }

    private static boolean lIIIllIIlllIlll(int i) {
        return i != 0;
    }

    private static void lIIIllIIlllIlIl() {
        lllIllIIlIIl = new int[1];
        lllIllIIlIIl[0] = (122 ^ 35) & ((111 ^ 54) ^ (-1));
    }

    static {
        lIIIllIIlllIlIl();
    }
}
