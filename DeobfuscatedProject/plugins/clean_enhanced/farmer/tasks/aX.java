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
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
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
    private final  Predicate<an> cC;

    public abstract boolean J(N var1);

    public aX(f f2, SquireFarmerConfig squireFarmerConfig, Client client, n n2) {
        super(f2, squireFarmerConfig, client);
        this.cC = an2 -> {
            boolean bl;
            if (((Object)an2.aZ() == (Object)an2.aZ()2)n2)) {
                bl = 0;
                0;
                if (-2 >= 0) {
                    return ((0x83 ^ 0x87 ^ (0x19 ^ 0x17)) & (0xE3 ^ 0x86 ^ (0x7E ^ 0x11) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        };
    }

    public boolean a(N n2, Consumer<TileObject> consumer) {
        TileObject tileObject = n2.b(this.bT);
        if tileObject == null {
            return 1;
        }
        consumer.accept(tileObject);
        return 0;
    }

    public boolean bv() {
        boolean bl;
        if (!(Movement.shouldWalk( != 0) ? 1 : 0) || (Players.getLocal( != 0).isAnimating() ? 1 : 0)) {
            bl = 0;
            0;
            if (-1 > 0) {
                return ((0xBB ^ 0x82) & ~(0x8A ^ 0xB3)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        aX var2;
        if ((this.bv( != 0) ? 1 : 0)) {
            return 1;
        }
        N var3 = var2.bR.v();
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        if (!var3 != null || (var2.bR.b(var4 == 0) ? 1 : 0)) {
            return 1;
        }
        an var5 = var3.aI();
        if ((var2.cC.test(var5 == 0) ? 1 : 0)) {
            return 1;
        }
        if ((Reachable.isInteractable((Locatable == 0)var3.b(var2.bT)) ? 1 : 0)) {
            return 1;
        }
        return this.J((N)var1_1);
    }

    public aX(f f2, SquireFarmerConfig squireFarmerConfig, Client client, Predicate<an> predicate) {
        super(f2, squireFarmerConfig, client);
        this.cC = predicate;
    }

    static {
        aX.var6();
    }

    public aX(f f2, SquireFarmerConfig squireFarmerConfig, Client client, au au2) {
        super(f2, squireFarmerConfig, client);
        this.cC = an2 -> {
            boolean bl;
            if (((Object)an2.aY() == (Object)an2.aY()2)au2)) {
                bl = 0;
                0;
                if (1 <= -1) {
                    return ((119 + 110 - 227 + 141 ^ 56 + 86 - 28 + 19) & (127 + 38 - 56 + 33 ^ 65 + 30 - -32 + 5 ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        };
    }
}

