package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Prep Farming", priority = 21002, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bf  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bf.class */
public class bf extends bg {
    private final /* synthetic */ int ek = 7603;
    private static /* synthetic */ int[] lIlIlIIllIll;
    private final /* synthetic */ int ej = 29742;

    private static void llIlllIlIlIIll() {
        lIlIlIIllIll = new int[7];
        lIlIlIIllIll[0] = (-449) & 30190;
        lIlIlIIllIll[1] = (-8193) & 15795;
        lIlIlIIllIll[2] = " ".length();
        lIlIlIIllIll[3] = (220 ^ 147) & ((17 ^ 94) ^ (-1));
        lIlIlIIllIll[4] = (-801) & 6143;
        lIlIlIIllIll[5] = (-(23 ^ 84)) & (-2561) & 23535;
        lIlIlIIllIll[6] = (-((-5481) & 8171)) & (-25) & 32479;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg
    public boolean dY() {
        int[] iArr = new int[lIlIlIIllIll[2]];
        iArr[lIlIlIIllIll[3]] = lIlIlIIllIll[4];
        if (llIlllIlIlIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlIlIIllIll[3];
        }
        int[] iArr2 = new int[lIlIlIIllIll[2]];
        iArr2[lIlIlIIllIll[3]] = lIlIlIIllIll[5];
        Item first = Inventory.getFirst(iArr2);
        if (llIlllIlIlIlIl(first)) {
            return lIlIlIIllIll[3];
        }
        int[] iArr3 = new int[lIlIlIIllIll[2]];
        iArr3[lIlIlIIllIll[3]] = lIlIlIIllIll[6];
        TileObject nearest = TileObjects.getNearest(iArr3);
        if (llIlllIlIlIlIl(nearest)) {
            return lIlIlIIllIll[3];
        }
        first.useOn(nearest);
        return lIlIlIIllIll[2];
    }

    @Inject
    protected bf(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.ej = lIlIlIIllIll[0];
        this.ek = lIlIlIIllIll[1];
    }

    private static boolean llIlllIlIlIlIl(Object obj) {
        return obj == null;
    }

    private static boolean llIlllIlIlIlII(int i) {
        return i == 0;
    }

    static {
        llIlllIlIlIIll();
    }
}
