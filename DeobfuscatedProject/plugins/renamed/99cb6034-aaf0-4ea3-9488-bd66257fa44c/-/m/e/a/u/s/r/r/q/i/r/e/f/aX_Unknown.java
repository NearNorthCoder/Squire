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

import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;
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

public abstract class aX_Unknown
extends az_Unknown {
    private final /* synthetic */ Predicate<an> cC;
    private static /* synthetic */ int[] lIlllllIllII;

    public abstract boolean J(N var1);

    public aX(f f2, SquireFarmerConfig squireFarmerConfig, Client client, n n2) {
        super(f2, squireFarmerConfig, client);
        this.cC = an2 -> {
            boolean bl;
            if (aX.lllIllllllIIll((Object)an2.aZ(), (Object)n2)) {
                bl = lIlllllIllII[0];
                0;
                if (-2 >= 0) {
                    return ((0x83 ^ 0x87 ^ (0x19 ^ 0x17)) & (0xE3 ^ 0x86 ^ (0x7E ^ 0x11) ^ -1)) != 0;
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
            0;
            if (-1 > 0) {
                return false;
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
        aX.lIlllllIllII[0] = 1;
        aX.lIlllllIllII[1] = (22 + 83 - -13 + 58 ^ 47 + 149 - 194 + 152) & (0xE7 ^ 0xB0 ^ (0xC0 ^ 0xBD) ^ -1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        aX var4;
        if (aX.lllIlllllIllll(this.bv() ? 1 : 0)) {
            return lIlllllIllII[1];
        }
        N var2 = var4.bR.v();
        WorldPoint var1 = Players.getLocal().getWorldLocation();
        if (!aX.lllIllllllIIII(var2) || aX.lllIllllllIIIl(var4.bR.b(var1) ? 1 : 0)) {
            return lIlllllIllII[1];
        }
        an var3 = var2.aI();
        if (aX.lllIllllllIIIl(var4.cC.test(var3) ? 1 : 0)) {
            return lIlllllIllII[1];
        }
        if (aX.lllIllllllIIIl(Reachable.isInteractable((Locatable)var2.b(var4.bT)) ? 1 : 0)) {
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
                0;
                if (1 <= -1) {
                    return false;
                }
            } else {
                bl = lIlllllIllII[1];
            }
            return bl;
        };
    }
}

