package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Getting more buckets", priority = 35, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aP  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aP.class */
public class aP extends aN {
    private /* synthetic */ int cA;
    private static /* synthetic */ int[] lIllllIIIIII;
    private final /* synthetic */ C0033h cz;

    private static void lllIllIlIllIII() {
        lIllllIIIIII = new int[5];
        lIllllIIIIII[0] = (47 ^ 5) & ((169 ^ 131) ^ (-1));
        lIllllIIIIII[1] = " ".length();
        lIllllIIIIII[2] = (-9249) & 32245;
        lIllllIIIIII[3] = (-16409) & 18333;
        lIllllIIIIII[4] = (-1) & Integer.MAX_VALUE;
    }

    private static boolean lllIllIlIllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean I(N n) {
        C0014an aI = n.aI();
        if (lllIllIlIllIIl(aI)) {
            return lIllllIIIIII[0];
        }
        H c = H.c(aI.aY());
        if (!lllIllIlIllIlI(c) || lllIllIlIllIll(c, this.bS.compostType())) {
            return lIllllIIIIII[0];
        }
        if (lllIllIlIlllII(aI.aZ(), EnumC0039n.HARVESTABLE)) {
            this.cA = aI.bb();
            return lIllllIIIIII[1];
        }
        this.cA = lIllllIIIIII[0];
        return lIllllIIIIII[0];
    }

    static {
        lllIllIlIllIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean b(TileObject tileObject) {
        int i;
        K k;
        int[] iArr = new int[lIllllIIIIII[1]];
        int i2 = lIllllIIIIII[0];
        if (lllIllIlIlllIl(this.bS.bottomless() ? 1 : 0)) {
            i = lIllllIIIIII[2];
            "".length();
            if ((-(172 ^ 169)) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIllllIIIIII[3];
        }
        iArr[i2] = i;
        if (!lllIllIlIlllIl(Inventory.contains(iArr) ? 1 : 0) && !lllIllIlIllIIl(this.cz.I())) {
            if (!lllIllIlIlllIl(this.cz.G() ? 1 : 0)) {
                if (!lllIllIlIlllIl(Inventory.contains(item -> {
                    return L.bq.contains(Integer.valueOf(item.getId()));
                }) ? 1 : 0)) {
                    this.cz.L();
                    return lIllllIIIIII[1];
                }
                this.cz.J();
                "".length();
                return lIllllIIIIII[1];
            }
            this.cz.g(K.ULTRA_COMPOST, Integer.valueOf(lIllllIIIIII[4]));
            this.cz.g(K.SUPER_COMPOST, Integer.valueOf(lIllllIIIIII[4]));
            C0033h c0033h = this.cz;
            if (lllIllIlIlllIl(this.bS.bottomless() ? 1 : 0)) {
                k = K.BOTTOMLESS_BUCKET;
                "".length();
                if ("  ".length() < "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                k = K.EMPTY_BUCKET;
            }
            c0033h.h(k, Integer.valueOf(lIllllIIIIII[4]));
            return lIllllIIIIII[1];
        }
        return lIllllIIIIII[0];
    }

    private static boolean lllIllIlIllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lllIllIlIllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lllIllIlIlllIl(int i) {
        return i != 0;
    }

    @Inject
    public aP(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client, C0033h c0033h) {
        super(c0031f, squireFarmerConfig, client);
        this.cz = c0033h;
    }

    private static boolean lllIllIlIlllII(Object obj, Object obj2) {
        return obj == obj2;
    }
}
