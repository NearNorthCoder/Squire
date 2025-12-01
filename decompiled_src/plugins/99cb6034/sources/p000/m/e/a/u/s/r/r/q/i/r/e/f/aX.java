package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.farmer.SquireFarmerConfig;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aX  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aX.class */
public abstract class aX extends AbstractC0026az {
    private final /* synthetic */ Predicate<C0014an> cC;
    private static /* synthetic */ int[] lIlllllIllII;

    public abstract boolean J(N n);

    public aX(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client, EnumC0039n enumC0039n) {
        super(c0031f, squireFarmerConfig, client);
        this.cC = c0014an -> {
            if (lllIllllllIIll(c0014an.aZ(), enumC0039n)) {
                ?? r0 = lIlllllIllII[0];
                "".length();
                return (-"  ".length()) >= 0 ? ((131 ^ 135) ^ (25 ^ 23)) & (((227 ^ 134) ^ (126 ^ 17)) ^ (-" ".length())) : r0;
            }
            return lIlllllIllII[1];
        };
    }

    private static boolean lllIllllllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean a(N n, Consumer<TileObject> consumer) {
        TileObject b = n.b(this.bT);
        if (lllIllllllIIlI(b)) {
            return lIlllllIllII[1];
        }
        consumer.accept(b);
        return lIlllllIllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean bv() {
        if (!lllIlllllIllll(Movement.shouldWalk() ? 1 : 0) || lllIlllllIllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            ?? r0 = lIlllllIllII[0];
            "".length();
            return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllllIllII[1];
    }

    private static boolean lllIllllllIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lllIlllllIllll(int i) {
        return i != 0;
    }

    private static boolean lllIllllllIIII(Object obj) {
        return obj != null;
    }

    private static void lllIlllllIlllI() {
        lIlllllIllII = new int[2];
        lIlllllIllII[0] = " ".length();
        lIlllllIllII[1] = ((((22 + 83) - (-13)) + 58) ^ (((47 + 149) - 194) + 152)) & (((231 ^ 176) ^ (192 ^ 189)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (lllIlllllIllll(bv() ? 1 : 0)) {
            return lIlllllIllII[1];
        }
        N v = this.bR.v();
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (!lllIllllllIIII(v) || lllIllllllIIIl(this.bR.b(worldLocation) ? 1 : 0)) {
            return lIlllllIllII[1];
        }
        if (!lllIllllllIIIl(this.cC.test(v.aI()) ? 1 : 0) && !lllIllllllIIIl(Reachable.isInteractable(v.b(this.bT)) ? 1 : 0)) {
            return J(v);
        }
        return lIlllllIllII[1];
    }

    private static boolean lllIllllllIIIl(int i) {
        return i == 0;
    }

    public aX(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client, Predicate<C0014an> predicate) {
        super(c0031f, squireFarmerConfig, client);
        this.cC = predicate;
    }

    static {
        lllIlllllIlllI();
    }

    public aX(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client, EnumC0021au enumC0021au) {
        super(c0031f, squireFarmerConfig, client);
        this.cC = c0014an -> {
            if (lllIllllllIIll(c0014an.aY(), enumC0021au)) {
                ?? r0 = lIlllllIllII[0];
                "".length();
                return " ".length() <= (-" ".length()) ? ((((119 + 110) - 227) + 141) ^ (((56 + 86) - 28) + 19)) & (((((127 + 38) - 56) + 33) ^ (((65 + 30) - (-32)) + 5)) ^ (-" ".length())) : r0;
            }
            return lIlllllIllII[1];
        };
    }
}
