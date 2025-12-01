package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.k  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/k.class */
public abstract class k extends Task {
    private static /* synthetic */ int[] llllllIlIIlI;
    protected final /* synthetic */ a D;
    protected final /* synthetic */ Client C;

    public abstract boolean j();

    private static boolean lIIlIlIIIlIlIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public k(a aVar, Client client) {
        this.D = aVar;
        this.C = client;
    }

    private static boolean lIIlIlIIIlIllIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIIlIlIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIIIlIlIII(this.C.getVarbitValue(llllllIlIIlI[0])) && !lIIlIlIIIlIlIIl(this.C.getVarbitValue(llllllIlIIlI[2]), llllllIlIIlI[3])) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIIlIlIIIlIlllI(npc.getInteracting(), Players.getLocal())) {
                    ?? r0 = llllllIlIIlI[3];
                    "".length();
                    return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllllIlIIlI[1];
            });
            if (lIIlIlIIIlIlIII(Movement.isRunEnabled() ? 1 : 0) && (!lIIlIlIIIlIlIlI(Movement.getRunEnergy(), llllllIlIIlI[4]) || (lIIlIlIIIlIlIll(nearest) && lIIlIlIIIlIllII(Movement.getRunEnergy(), llllllIlIIlI[5])))) {
                Movement.toggleRun();
            }
            return (lIIlIlIIIlIlIII(Movement.isRunEnabled() ? 1 : 0) && lIIlIlIIIlIllIl(Players.getLocal().isMoving() ? 1 : 0)) ? llllllIlIIlI[1] : j();
        }
        return llllllIlIIlI[1];
    }

    private static boolean lIIlIlIIIlIlIIl(int i, int i2) {
        return i == i2;
    }

    static {
        lIIlIlIIIlIIlll();
    }

    private static boolean lIIlIlIIIlIllII(int i, int i2) {
        return i > i2;
    }

    private static void lIIlIlIIIlIIlll() {
        llllllIlIIlI = new int[6];
        llllllIlIIlI[0] = (-13369) & 15743;
        llllllIlIIlI[1] = ((124 ^ 14) ^ (21 ^ 80)) & (((123 ^ 41) ^ (253 ^ 152)) ^ (-" ".length()));
        llllllIlIIlI[2] = (-1027) & 3391;
        llllllIlIIlI[3] = " ".length();
        llllllIlIIlI[4] = 91 ^ 66;
        llllllIlIIlI[5] = (177 ^ 129) ^ (61 ^ 8);
    }

    private static boolean lIIlIlIIIlIlIII(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIIIlIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }
}
