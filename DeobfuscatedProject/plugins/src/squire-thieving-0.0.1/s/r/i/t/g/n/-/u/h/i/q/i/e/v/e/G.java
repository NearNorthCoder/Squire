/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f;

@TaskDesc(name="Returning to Start", priority=0x7FFFFF76)
public class G
extends a {
    private static /* synthetic */ int[] lIIlllIIllIlI;

    private static boolean lIllIIllIIIllll(int n2) {
        return n2 != 0;
    }

    static {
        G.lIllIIllIIIlllI();
    }

    private static boolean lIllIIllIIlIIII(Object object) {
        return object != null;
    }

    @Inject
    public G(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void lIllIIllIIIlllI() {
        lIIlllIIllIlI = new int[2];
        G.lIIlllIIllIlI[0] = (0x18 ^ 8) & ~(0x5F ^ 0x4F);
        G.lIIlllIIllIlI[1] = " ".length();
    }

    private static boolean lIllIIllIIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean l() {
        G llllllllllllllIlllIlIlllllllIlIl;
        if (G.lIllIIllIIIllll(this.o.j() ? 1 : 0)) {
            return lIIlllIIllIlI[0];
        }
        if (G.lIllIIllIIIllll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            return lIIlllIIllIlI[1];
        }
        Player llllllllllllllIlllIlIlllllllIlII = Players.getLocal();
        if (!G.lIllIIllIIlIIII(llllllllllllllIlllIlIlllllllIlII) || G.lIllIIllIIIllll(Inventory.isFull() ? 1 : 0)) {
            return lIIlllIIllIlI[0];
        }
        f llllllllllllllIlllIlIlllllllIIll = llllllllllllllIlllIlIlllllllIlIl.p.pickpocketTarget();
        NPC llllllllllllllIlllIlIlllllllIIlI = llllllllllllllIlllIlIlllllllIlIl.a(llllllllllllllIlllIlIlllllllIIll);
        if (G.lIllIIllIIlIIII(llllllllllllllIlllIlIlllllllIIlI)) {
            return lIIlllIIllIlI[0];
        }
        if (G.lIllIIllIIlIIIl(llllllllllllllIlllIlIlllllllIlII.getWorldLocation().distanceTo(llllllllllllllIlllIlIlllllllIlIl.o.f()), llllllllllllllIlllIlIlllllllIlIl.p.wanderRange())) {
            return lIIlllIIllIlI[0];
        }
        if (G.lIllIIllIIIllll(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llllllllllllllIlllIlIlllllllIlIl.o.f());
            "".length();
        }
        return lIIlllIIllIlI[1];
    }
}

