package i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a;

import com.google.inject.Singleton;
import java.util.List;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.InventoryChanged;
@Singleton
/* renamed from: i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.a  reason: invalid package */
/* loaded from: 9bb83689-ff7d-471d-9a08-411d7484ad87.jar:i/e/e/f/s/q/i/e/h/r/-/r/u/s/l/a/-/r/i/a/a.class */
public class a {
    private static /* synthetic */ int[] lIlIllIlIlI;
    private /* synthetic */ int e;
    private /* synthetic */ int f;
    private /* synthetic */ int g;

    private static boolean lIIlIIlllIlIII(int i2, int i3) {
        return i2 == i3;
    }

    public int b() {
        return this.e;
    }

    public int d() {
        return this.g;
    }

    public void a() {
        this.e = lIlIllIlIlI[7];
        this.f = lIlIllIlIlI[7];
        this.g = lIlIllIlIlI[7];
    }

    private static void lIIlIIlllIIlIl() {
        lIlIllIlIlI = new int[8];
        lIlIllIlIlI[0] = (-1601) & 24426;
        lIlIllIlIlI[1] = (-((-20589) & 22141)) & (-8193) & 32573;
        lIlIllIlIlI[2] = (-((-23833) & 32223)) & (-1034) & 32255;
        lIlIllIlIlI[3] = (-((-439) & 2039)) & (-13) & 24447;
        lIlIllIlIlI[4] = " ".length();
        lIlIllIlIlI[5] = (-1674) & 24493;
        lIlIllIlIlI[6] = (-((-23181) & 24271)) & (-8834) & 32763;
        lIlIllIlIlI[7] = ((((133 + 13) - 107) + 100) ^ (((2 + 111) - 1) + 19)) & (((220 ^ 141) ^ (221 ^ 132)) ^ (-" ".length()));
    }

    public int c() {
        return this.f;
    }

    static {
        lIIlIIlllIIlIl();
    }

    private static boolean lIIlIIlllIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIIlllIIlll(int i2) {
        return i2 != 0;
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (lIIlIIlllIIllI(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            if (lIIlIIlllIIlll(List.of(Integer.valueOf(lIlIllIlIlI[0]), Integer.valueOf(lIlIllIlIlI[1]), Integer.valueOf(lIlIllIlIlI[2]), Integer.valueOf(lIlIllIlIlI[3])).contains(Integer.valueOf(inventoryChanged.getItemId())) ? 1 : 0)) {
                this.e += lIlIllIlIlI[4];
            }
            if (lIIlIIlllIlIII(inventoryChanged.getItemId(), lIlIllIlIlI[5])) {
                this.f += lIlIllIlIlI[4];
            }
            if (lIIlIIlllIlIII(inventoryChanged.getItemId(), lIlIllIlIlI[6])) {
                this.g += lIlIllIlIlI[4];
            }
        }
    }
}
