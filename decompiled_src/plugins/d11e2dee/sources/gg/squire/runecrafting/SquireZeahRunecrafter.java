package gg.squire.runecrafting;

import com.google.inject.Inject;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.runecrafting.overlay.RunecrafterInfoBox;
import h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u.a;
import h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u.b;
import h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u.c;
import h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u.d;
import h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u.e;
import h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u.f;
import h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u.g;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.game.Prices;
@PluginDescriptor(name = "Squire Zeah Runecrafter", enabledByDefault = false)
/* loaded from: d11e2dee-7190-435e-95f6-a7b9761c02e8.jar:gg/squire/runecrafting/SquireZeahRunecrafter.class */
public class SquireZeahRunecrafter extends SquirePlugin {
    private /* synthetic */ int g;
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ a d;
    @Inject
    private /* synthetic */ RunecrafterInfoBox c;
    private /* synthetic */ int f;
    private /* synthetic */ boolean e;
    @Inject
    private /* synthetic */ OverlayManager a;
    private static /* synthetic */ int[] lIllIIllIlIIl;

    public int b() {
        return this.f;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIllIIllIlIIl[0]];
        clsArr[lIllIIllIlIIl[1]] = f.class;
        clsArr[lIllIIllIlIIl[2]] = g.class;
        clsArr[lIllIIllIlIIl[3]] = e.class;
        clsArr[lIllIIllIlIIl[4]] = c.class;
        clsArr[lIllIIllIlIIl[5]] = d.class;
        clsArr[lIllIIllIlIIl[6]] = b.class;
        return clsArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStart() {
        a((boolean) lIllIIllIlIIl[1]);
        this.d.c(lIllIIllIlIIl[7]);
        this.a.add(this.c);
        "".length();
    }

    private static boolean llIIIllIlIllIIl(int i) {
        return i != 0;
    }

    protected void onStop() {
        this.a.remove(this.c);
        "".length();
    }

    public boolean a() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    public void a(int i) {
        this.f = i;
    }

    private static void llIIIllIlIllIII() {
        lIllIIllIlIIl = new int[11];
        lIllIIllIlIIl[0] = (105 ^ 75) ^ (78 ^ 106);
        lIllIIllIlIIl[1] = ((((8 + 89) - 36) + 170) ^ (((65 + 166) - 221) + 177)) & (((129 ^ 166) ^ (9 ^ 114)) ^ (-" ".length()));
        lIllIIllIlIIl[2] = " ".length();
        lIllIIllIlIIl[3] = "  ".length();
        lIllIIllIlIIl[4] = "   ".length();
        lIllIIllIlIIl[5] = 166 ^ 162;
        lIllIIllIlIIl[6] = (195 ^ 144) ^ (32 ^ 118);
        lIllIIllIlIIl[7] = -" ".length();
        lIllIIllIlIIl[8] = (-((-403) & 25087)) & (-18) & 32639;
        lIllIIllIlIIl[9] = (-314) & 13759;
        lIllIIllIlIIl[10] = (-((-12345) & 32251)) & (-9) & 20479;
    }

    public void a(boolean z) {
        this.e = z;
    }

    static {
        llIIIllIlIllIII();
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (llIIIllIlIllIIl(inventoryChanged.getChangeType().equals(InventoryChanged.ChangeType.ITEM_REMOVED) ? 1 : 0)) {
            if (llIIIllIlIllIlI(inventoryChanged.getItemId(), lIllIIllIlIIl[8])) {
                this.d.c(lIllIIllIlIIl[1]);
            }
            if (llIIIllIlIllIlI(inventoryChanged.getItemId(), lIllIIllIlIIl[9])) {
                this.d.c(this.d.j() + lIllIIllIlIIl[5]);
            }
        }
        if (llIIIllIlIllIIl(inventoryChanged.getChangeType().equals(InventoryChanged.ChangeType.ITEM_ADDED) ? 1 : 0) && llIIIllIlIllIlI(inventoryChanged.getItemId(), lIllIIllIlIIl[10])) {
            a(b() + inventoryChanged.getAmount());
            b(c() + (Prices.getItemPrice(inventoryChanged.getItemId()) * inventoryChanged.getAmount()));
        }
    }

    private static boolean llIIIllIlIllIlI(int i, int i2) {
        return i == i2;
    }

    public void b(int i) {
        this.g = i;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }
}
