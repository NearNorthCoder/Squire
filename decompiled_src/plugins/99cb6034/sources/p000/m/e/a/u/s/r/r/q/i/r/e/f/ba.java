package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Objects;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Planting seed in patch", priority = 5, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.ba  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/ba.class */
public class ba extends aX {
    private static /* synthetic */ int[] lIlllIlIIlII;

    private static boolean lllIllIIIlIIll(int i) {
        return i == 0;
    }

    private static boolean lllIllIIIlIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aX
    public boolean J(N n) {
        Item h = this.bR.h(n);
        if (lllIllIIIlIIIl(h)) {
            return lIlllIlIIlII[0];
        }
        if (!lllIllIIIlIIlI(n.aL(), P.GRAPES) || !lllIllIIIlIIll(Vars.getBit(n.aO()))) {
            Objects.requireNonNull(h);
            "".length();
            return a(n, this::useOn);
        }
        int[] iArr = new int[lIlllIlIIlII[1]];
        iArr[lIlllIlIIlII[0]] = lIlllIlIIlII[2];
        Item first = Inventory.getFirst(iArr);
        if (lllIllIIIlIIIl(first)) {
            return lIlllIlIIlII[0];
        }
        Objects.requireNonNull(first);
        "".length();
        a(n, this::useOn);
        "".length();
        return lIlllIlIIlII[1];
    }

    static {
        lllIllIIIlIIII();
    }

    @Inject
    public ba(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client, (v0) -> {
            return v0.be();
        });
    }

    private static boolean lllIllIIIlIIIl(Object obj) {
        return obj == null;
    }

    private static void lllIllIIIlIIII() {
        lIlllIlIIlII = new int[3];
        lIlllIlIIlII[0] = ((94 ^ 41) ^ (64 ^ 106)) & (((((64 + 33) - 62) + 166) ^ (((128 + 34) - 73) + 59)) ^ (-" ".length()));
        lIlllIlIIlII[1] = " ".length();
        lIlllIlIIlII[2] = (-16401) & 29821;
    }
}
