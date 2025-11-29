package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Map;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Withdrawing from leprechaun", priority = 10, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aT  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aT.class */
public class aT extends AbstractC0026az {
    private final /* synthetic */ C0033h cB;
    private static /* synthetic */ int[] llIIIlIIlIlI;

    private static boolean llllIlIIIIlllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    public boolean run() {
        int i;
        if (llllIlIIIIlIll(this.cB.K() ? 1 : 0)) {
            return llIIIlIIlIlI[0];
        }
        if (!llllIlIIIIllII(this.bR.v()) || llllIlIIIIllIl(this.bR.v().aL(), P.GRAPES)) {
            return llIIIlIIlIlI[0];
        }
        Map<K, Integer> A = this.bR.A();
        int[] iArr = new int[llIIIlIIlIlI[1]];
        iArr[llIIIlIIlIlI[0]] = llIIIlIIlIlI[2];
        iArr[llIIIlIIlIlI[3]] = llIIIlIIlIlI[4];
        iArr[llIIIlIIlIlI[5]] = llIIIlIIlIlI[6];
        if (llllIlIIIIlllI(Inventory.getCount(iArr), llIIIlIIlIlI[7])) {
            i = llIIIlIIlIlI[3];
            "".length();
            if ((-"   ".length()) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIIIlIIlIlI[0];
        }
        int i2 = i;
        if (llllIlIIIIllll(A.isEmpty() ? 1 : 0) && llllIlIIIIlIll(i2)) {
            return llIIIlIIlIlI[0];
        }
        if (llllIlIIIIlIll(this.cB.G() ? 1 : 0)) {
            if (llllIlIIIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                return llIIIlIIlIlI[3];
            }
            if (!llllIlIIIIllll(Inventory.contains(item -> {
                return L.bq.contains(Integer.valueOf(item.getId()));
            }) ? 1 : 0)) {
                this.cB.L();
                return llIIIlIIlIlI[3];
            }
            this.cB.J();
            "".length();
            return llIIIlIIlIlI[3];
        } else if (llllIlIIIIllll(i2)) {
            this.cB.g(K.ULTRA_COMPOST, Integer.valueOf(llIIIlIIlIlI[8]));
            this.cB.g(K.COMPOST, Integer.valueOf(llIIIlIIlIlI[8]));
            this.cB.g(K.SUPER_COMPOST, Integer.valueOf(llIIIlIIlIlI[8]));
            return llIIIlIIlIlI[3];
        } else {
            int[] iArr2 = new int[llIIIlIIlIlI[3]];
            iArr2[llIIIlIIlIlI[0]] = llIIIlIIlIlI[9];
            if (llllIlIIIIllll(Inventory.contains(iArr2) ? 1 : 0) && llllIlIIIIlIll(A.containsKey(K.EMPTY_BUCKET) ? 1 : 0)) {
                this.cB.g(K.EMPTY_BUCKET, Integer.valueOf(llIIIlIIlIlI[8]));
                return llIIIlIIlIlI[3];
            }
            for (K k : A.keySet()) {
                this.cB.h(k, A.get(k));
                "".length();
                if ("  ".length() == 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return llIIIlIIlIlI[3];
        }
    }

    private static void llllIlIIIIlIlI() {
        llIIIlIIlIlI = new int[10];
        llIIIlIIlIlI[0] = (0 ^ 54) & ((66 ^ 116) ^ (-1));
        llIIIlIIlIlI[1] = "   ".length();
        llIIIlIIlIlI[2] = (-((-24931) & 28023)) & (-1) & 24575;
        llIIIlIIlIlI[3] = " ".length();
        llIIIlIIlIlI[4] = (-((-693) & 27390)) & (-37) & 32767;
        llIIIlIIlIlI[5] = "  ".length();
        llIIIlIIlIlI[6] = (-((-4195) & 14446)) & (-33) & 16315;
        llIIIlIIlIlI[7] = (97 ^ 32) ^ (114 ^ 55);
        llIIIlIIlIlI[8] = (-1) & Integer.MAX_VALUE;
        llIIIlIIlIlI[9] = (-30819) & 32743;
    }

    private static boolean llllIlIIIIlIll(int i) {
        return i == 0;
    }

    @Inject
    public aT(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client, C0033h c0033h) {
        super(c0031f, squireFarmerConfig, client);
        this.cB = c0033h;
    }

    private static boolean llllIlIIIIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        llllIlIIIIlIlI();
    }

    private static boolean llllIlIIIIllII(Object obj) {
        return obj != null;
    }

    private static boolean llllIlIIIIllll(int i) {
        return i != 0;
    }
}
