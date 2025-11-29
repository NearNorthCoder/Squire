/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

public abstract class aX
extends az {
    private final /* synthetic */ Predicate<an> cC;
    private static /* synthetic */ int[] lIlllllIllII;

    public abstract boolean J(N var1);

    public aX(f f2, SquireFarmerConfig squireFarmerConfig, Client client, n n2) {
        super(f2, squireFarmerConfig, client);
        this.cC = an2 -> {
            boolean bl;
            if (aX.lllIllllllIIll((Object)an2.aZ(), (Object)n2)) {
                bl = lIlllllIllII[0];
                "".length();
                if (-"  ".length() >= 0) {
                    return ((0x83 ^ 0x87 ^ (0x19 ^ 0x17)) & (0xE3 ^ 0x86 ^ (0x7E ^ 0x11) ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlllllIllII[1];
            }
            return bl;
        };
    }

    private static boolean lllIllllllIIll(Object object, Object object2) {
        return object == object2;
    }

    public boolean a(N n2, Consumer<TileObject> consumer) {
        TileObject tileObject = n2.b(this.bT);
        if (aX.lllIllllllIIlI(tileObject)) {
            return lIlllllIllII[1];
        }
        consumer.accept(tileObject);
        return lIlllllIllII[0];
    }

    public boolean bv() {
        boolean bl;
        if (!aX.lllIlllllIllll(Movement.shouldWalk() ? 1 : 0) || aX.lllIlllllIllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            bl = lIlllllIllII[0];
            "".length();
            if (-" ".length() > 0) {
                return ((0xBB ^ 0x82) & ~(0x8A ^ 0xB3)) != 0;
            }
        } else {
            bl = lIlllllIllII[1];
        }
        return bl;
    }

    private static boolean lllIllllllIIlI(Object object) {
        return object == null;
    }

    private static boolean lllIlllllIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIllllllIIII(Object object) {
        return object != null;
    }

    private static void lllIlllllIlllI() {
        lIlllllIllII = new int[2];
        aX.lIlllllIllII[0] = " ".length();
        aX.lIlllllIllII[1] = (22 + 83 - -13 + 58 ^ 47 + 149 - 194 + 152) & (0xE7 ^ 0xB0 ^ (0xC0 ^ 0xBD) ^ -" ".length());
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        aX lllllllllllllllIlIllIIIIIIlIllll;
        if (aX.lllIlllllIllll(this.bv() ? 1 : 0)) {
            return lIlllllIllII[1];
        }
        N lllllllllllllllIlIllIIIIIIlIlllI = lllllllllllllllIlIllIIIIIIlIllll.bR.v();
        WorldPoint lllllllllllllllIlIllIIIIIIlIllIl = Players.getLocal().getWorldLocation();
        if (!aX.lllIllllllIIII(lllllllllllllllIlIllIIIIIIlIlllI) || aX.lllIllllllIIIl(lllllllllllllllIlIllIIIIIIlIllll.bR.b(lllllllllllllllIlIllIIIIIIlIllIl) ? 1 : 0)) {
            return lIlllllIllII[1];
        }
        an lllllllllllllllIlIllIIIIIIlIllII = lllllllllllllllIlIllIIIIIIlIlllI.aI();
        if (aX.lllIllllllIIIl(lllllllllllllllIlIllIIIIIIlIllll.cC.test(lllllllllllllllIlIllIIIIIIlIllII) ? 1 : 0)) {
            return lIlllllIllII[1];
        }
        if (aX.lllIllllllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIlIllIIIIIIlIlllI.b(lllllllllllllllIlIllIIIIIIlIllll.bT)) ? 1 : 0)) {
            return lIlllllIllII[1];
        }
        return this.J((N)var1_1);
    }

    private static boolean lllIllllllIIIl(int n2) {
        return n2 == 0;
    }

    public aX(f f2, SquireFarmerConfig squireFarmerConfig, Client client, Predicate<an> predicate) {
        super(f2, squireFarmerConfig, client);
        this.cC = predicate;
    }

    static {
        aX.lllIlllllIlllI();
    }

    public aX(f f2, SquireFarmerConfig squireFarmerConfig, Client client, au au2) {
        super(f2, squireFarmerConfig, client);
        this.cC = an2 -> {
            boolean bl;
            if (aX.lllIllllllIIll((Object)an2.aY(), (Object)au2)) {
                bl = lIlllllIllII[0];
                "".length();
                if (" ".length() <= -" ".length()) {
                    return ((119 + 110 - 227 + 141 ^ 56 + 86 - 28 + 19) & (127 + 38 - 56 + 33 ^ 65 + 30 - -32 + 5 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlllllIllII[1];
            }
            return bl;
        };
    }
}

