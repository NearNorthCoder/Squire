package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Fishing")
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.j  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/j.class */
public class j extends Task {
    private static final /* synthetic */ Logger O;
    private static final /* synthetic */ int P;
    private final /* synthetic */ SquireFisherPlugin R;
    private final /* synthetic */ SquireFisherConfig Q;
    private static /* synthetic */ int[] lIlllIlllllI;

    private static boolean lllIllIIIlIIll(int i2) {
        return i2 != 0;
    }

    static {
        lllIllIIIlIIIl();
        P = lIlllIlllllI[1];
        O = LoggerFactory.getLogger(j.class);
    }

    private static boolean lllIllIIIlIllI(int i2) {
        return i2 == 0;
    }

    @Inject
    public j(SquireFisherConfig squireFisherConfig, SquireFisherPlugin squireFisherPlugin) {
        this.Q = squireFisherConfig;
        this.R = squireFisherPlugin;
    }

    private static boolean lllIllIIIlIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lllIllIIIlIlIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lllIllIIIlIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    public boolean run() {
        NPC nearest;
        if (lllIllIIIlIIlI(this.R.f())) {
            this.R.a(Players.getLocal().getWorldArea());
            return lIlllIlllllI[0];
        } else if (lllIllIIIlIIll(this.Q.fishingTrawler() ? 1 : 0)) {
            return lIlllIlllllI[0];
        } else {
            Actor interacting = Players.getLocal().getInteracting();
            if (lllIllIIIlIlII(interacting) && lllIllIIIlIlIl(interacting.getGraphic(), lIlllIlllllI[1])) {
                Movement.setDestination(Players.getLocal().getWorldLocation());
                return lIlllIlllllI[2];
            } else if (!lllIllIIIlIIll(Movement.shouldWalk() ? 1 : 0) || lllIllIIIlIlII(Players.getLocal().getInteracting())) {
                return lIlllIlllllI[0];
            } else {
                if (!lllIllIIIlIIll(Inventory.isFull() ? 1 : 0) && !lllIllIIIlIIll(Bank.isOpen() ? 1 : 0) && !lllIllIIIlIllI(Inventory.contains(this.Q.fish().k()) ? 1 : 0)) {
                    if (lllIllIIIlIlll(this.Q.fish().m(), lIlllIlllllI[3])) {
                        nearest = NPCs.getNearest(npc -> {
                            if (lllIllIIIlIIll(npc.hasAction(this.Q.fish().n()) ? 1 : 0) && lllIllIIIlIlIl(npc.getId(), this.Q.fish().m())) {
                                ?? r0 = lIlllIlllllI[2];
                                "".length();
                                return 0 != 0 ? ((221 ^ 177) ^ (1 ^ 116)) & (((150 ^ 140) ^ "   ".length()) ^ (-" ".length())) : r0;
                            }
                            return lIlllIlllllI[0];
                        });
                        "".length();
                        if (!(true ^ true)) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        nearest = NPCs.getNearest(npc2 -> {
                            if (lllIllIIIlIIll(npc2.hasAction(this.Q.fish().n()) ? 1 : 0) && lllIllIIIlIlll(npc2.getGraphic(), lIlllIlllllI[1])) {
                                ?? r0 = lIlllIlllllI[2];
                                "".length();
                                return ((210 ^ 155) ^ (198 ^ 139)) == "  ".length() ? ((239 ^ 180) ^ (21 ^ 70)) & (((6 ^ 21) ^ (180 ^ 175)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIlllllI[0];
                        });
                    }
                    if (lllIllIIIlIlII(nearest)) {
                        nearest.interact(this.Q.fish().n());
                        return lIlllIlllllI[2];
                    }
                    Movement.walkTo(this.R.f());
                    "".length();
                    return lIlllIlllllI[2];
                }
                return lIlllIlllllI[0];
            }
        }
    }

    private static boolean lllIllIIIlIlll(int i2, int i3) {
        return i2 != i3;
    }

    private static void lllIllIIIlIIIl() {
        lIlllIlllllI = new int[4];
        lIlllIlllllI[0] = ((((90 + 83) - 10) + 9) ^ (((54 + 19) - 16) + 74)) & (((215 ^ 184) ^ (220 ^ 156)) ^ (-" ".length()));
        lIlllIlllllI[1] = (-((-1283) & 15767)) & (-16897) & 32767;
        lIlllIlllllI[2] = " ".length();
        lIlllIlllllI[3] = -" ".length();
    }
}
