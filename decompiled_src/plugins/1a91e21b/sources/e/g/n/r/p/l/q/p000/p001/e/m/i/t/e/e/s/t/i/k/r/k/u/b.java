package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.InventoryChanged;
@Singleton
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.b  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/b.class */
public class b {
    private final /* synthetic */ TempleTrekkingConfig p;
    private static /* synthetic */ int[] lIIllIIllllIl;
    private /* synthetic */ int s;
    private /* synthetic */ int x;
    private /* synthetic */ int t;
    private /* synthetic */ int v;
    private final /* synthetic */ TempleTrekkingPlugin q;
    private /* synthetic */ int w;
    private /* synthetic */ int u;
    private /* synthetic */ int y;
    private /* synthetic */ int r;

    private static void lIllIIIIIIllIll() {
        lIIllIIllllIl = new int[1];
        lIIllIIllllIl[0] = ((((69 + 53) - 75) + 116) ^ (((129 + 29) - 79) + 115)) & (((14 ^ 88) ^ (89 ^ 110)) ^ (-" ".length()));
    }

    public int s() {
        return this.x;
    }

    public int m() {
        return this.r;
    }

    public int o() {
        return this.t;
    }

    private static boolean lIllIIIIIIlllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int p() {
        return this.u;
    }

    private static boolean lIllIIIIIIlllIl(int i) {
        return i != 0;
    }

    @Inject
    b(TempleTrekkingConfig templeTrekkingConfig, TempleTrekkingPlugin templeTrekkingPlugin) {
        this.q = templeTrekkingPlugin;
        this.p = templeTrekkingConfig;
    }

    public void l() {
        this.r = lIIllIIllllIl[0];
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (lIllIIIIIIlllII(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && lIllIIIIIIlllIl(this.p.reward().w().contains(Integer.valueOf(inventoryChanged.getItemId())) ? 1 : 0)) {
            this.r += inventoryChanged.getAmount();
        }
    }

    static {
        lIllIIIIIIllIll();
    }

    public int r() {
        return this.w;
    }

    public int q() {
        return this.v;
    }

    public int n() {
        return this.s;
    }

    public int t() {
        return this.y;
    }
}
