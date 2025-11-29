package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Objects;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Applying plant cure", priority = 6, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aV  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aV.class */
public class aV extends aX {
    private static /* synthetic */ int[] lIlllIIllllI;

    private static void lllIlIlllllIlI() {
        lIlllIIllllI = new int[5];
        lIlllIIllllI[0] = "  ".length();
        lIlllIIllllI[1] = (47 ^ 118) & ((126 ^ 39) ^ (-1));
        lIlllIIllllI[2] = (-16459) & 22494;
        lIlllIIllllI[3] = " ".length();
        lIlllIIllllI[4] = (-((-32117) & 32631)) & (-9249) & 16230;
    }

    @Inject
    public aV(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client, c0014an -> {
            if (lllIlIllllllII(c0014an.aZ(), EnumC0039n.DISEASED)) {
                ?? r0 = lIlllIIllllI[3];
                "".length();
                return (-(77 ^ 73)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlllIIllllI[1];
        });
    }

    static {
        lllIlIlllllIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aX
    public boolean J(N n) {
        int[] iArr = new int[lIlllIIllllI[0]];
        iArr[lIlllIIllllI[1]] = lIlllIIllllI[2];
        iArr[lIlllIIllllI[3]] = lIlllIIllllI[4];
        Item first = Inventory.getFirst(iArr);
        if (lllIlIlllllIll(first)) {
            return lIlllIIllllI[1];
        }
        Objects.requireNonNull(first);
        "".length();
        return a(n, this::useOn);
    }

    private static boolean lllIlIllllllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllIlIlllllIll(Object obj) {
        return obj == null;
    }
}
