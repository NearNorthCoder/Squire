/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Fishing")
public class j
extends Task {
    private static final /* synthetic */ Logger O;
    private static final /* synthetic */ int P;
    private final /* synthetic */ SquireFisherPlugin R;
    private final /* synthetic */ SquireFisherConfig Q;
    private static /* synthetic */ int[] lIlllIlllllI;

    private static boolean lllIllIIIlIIll(int n) {
        return n != 0;
    }

    static {
        j.lllIllIIIlIIIl();
        P = lIlllIlllllI[1];
        O = LoggerFactory.getLogger(j.class);
    }

    private static boolean lllIllIIIlIllI(int n) {
        return n == 0;
    }

    @Inject
    public j(SquireFisherConfig squireFisherConfig, SquireFisherPlugin squireFisherPlugin) {
        this.Q = squireFisherConfig;
        this.R = squireFisherPlugin;
    }

    private static boolean lllIllIIIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lllIllIIIlIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lllIllIIIlIlII(Object object) {
        return object != null;
    }

    public boolean run() {
        NPC lllllllllllllllIlIlllIIllIllIIll;
        j lllllllllllllllIlIlllIIllIllIlIl;
        if (j.lllIllIIIlIIlI(this.R.f())) {
            this.R.a(Players.getLocal().getWorldArea());
            return lIlllIlllllI[0];
        }
        if (j.lllIllIIIlIIll(lllllllllllllllIlIlllIIllIllIlIl.Q.fishingTrawler() ? 1 : 0)) {
            return lIlllIlllllI[0];
        }
        Actor lllllllllllllllIlIlllIIllIllIlII = Players.getLocal().getInteracting();
        if (j.lllIllIIIlIlII(lllllllllllllllIlIlllIIllIllIlII) && j.lllIllIIIlIlIl(lllllllllllllllIlIlllIIllIllIlII.getGraphic(), lIlllIlllllI[1])) {
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return lIlllIlllllI[2];
        }
        if (!j.lllIllIIIlIIll(Movement.shouldWalk() ? 1 : 0) || j.lllIllIIIlIlII(Players.getLocal().getInteracting())) {
            return lIlllIlllllI[0];
        }
        if (j.lllIllIIIlIIll(Inventory.isFull() ? 1 : 0)) {
            return lIlllIlllllI[0];
        }
        if (j.lllIllIIIlIIll(Bank.isOpen() ? 1 : 0)) {
            return lIlllIlllllI[0];
        }
        if (j.lllIllIIIlIllI(Inventory.contains(lllllllllllllllIlIlllIIllIllIlIl.Q.fish().k()) ? 1 : 0)) {
            return lIlllIlllllI[0];
        }
        if (j.lllIllIIIlIlll(lllllllllllllllIlIlllIIllIllIlIl.Q.fish().m(), lIlllIlllllI[3])) {
            lllllllllllllllIlIlllIIllIllIIll = NPCs.getNearest(nPC -> {
                int n;
                if (j.lllIllIIIlIIll(nPC.hasAction(this.Q.fish().n()) ? 1 : 0) && j.lllIllIIIlIlIl(nPC.getId(), this.Q.fish().m())) {
                    n = lIlllIlllllI[2];
                    "".length();
                    if (null != null) {
                        return ((0xDD ^ 0xB1 ^ (1 ^ 0x74)) & (0x96 ^ 0x8C ^ "   ".length() ^ -" ".length())) != 0;
                    }
                } else {
                    n = lIlllIlllllI[0];
                }
                return n != 0;
            });
            "".length();
            if ((0x36 ^ 0x32) == 0) {
                return ((2 ^ 0x12) & ~(0x17 ^ 7)) != 0;
            }
        } else {
            lllllllllllllllIlIlllIIllIllIIll = NPCs.getNearest(nPC -> {
                int n;
                if (j.lllIllIIIlIIll(nPC.hasAction(this.Q.fish().n()) ? 1 : 0) && j.lllIllIIIlIlll(nPC.getGraphic(), lIlllIlllllI[1])) {
                    n = lIlllIlllllI[2];
                    "".length();
                    if ((0xD2 ^ 0x9B ^ (0xC6 ^ 0x8B)) == "  ".length()) {
                        return ((0xEF ^ 0xB4 ^ (0x15 ^ 0x46)) & (6 ^ 0x15 ^ (0xB4 ^ 0xAF) ^ -" ".length())) != 0;
                    }
                } else {
                    n = lIlllIlllllI[0];
                }
                return n != 0;
            });
        }
        if (j.lllIllIIIlIlII(lllllllllllllllIlIlllIIllIllIIll)) {
            lllllllllllllllIlIlllIIllIllIIll.interact(lllllllllllllllIlIlllIIllIllIlIl.Q.fish().n());
            return lIlllIlllllI[2];
        }
        Movement.walkTo((WorldArea)this.R.f());
        "".length();
        return lIlllIlllllI[2];
    }

    private static boolean lllIllIIIlIlll(int n, int n2) {
        return n != n2;
    }

    private static void lllIllIIIlIIIl() {
        lIlllIlllllI = new int[4];
        j.lIlllIlllllI[0] = (90 + 83 - 10 + 9 ^ 54 + 19 - 16 + 74) & (0xD7 ^ 0xB8 ^ (0xDC ^ 0x9C) ^ -" ".length());
        j.lIlllIlllllI[1] = -(0xFFFFFAFD & 0x3D97) & (0xFFFFBDFF & Short.MAX_VALUE);
        j.lIlllIlllllI[2] = " ".length();
        j.lIlllIlllllI[3] = -" ".length();
    }
}

