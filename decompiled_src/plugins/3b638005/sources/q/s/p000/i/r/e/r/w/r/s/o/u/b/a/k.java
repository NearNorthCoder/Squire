package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Walking to Bank", priority = 2147470310)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.k  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/k.class */
public class k extends Task {
    private static /* synthetic */ int[] llllIlIlIlI;
    private final /* synthetic */ SquireBarrowsConfig M;
    private final /* synthetic */ SquireBarrows L;
    private /* synthetic */ BankLocation N;
    private final /* synthetic */ Client K;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    public boolean run() {
        if (!lIllIlIllIlIIl(this.M.useBank() ? 1 : 0) && !lIllIlIllIlIlI(this.K.getGameState(), GameState.LOGGED_IN) && !lIllIlIllIlIIl(this.L.u() ? 1 : 0) && !lIllIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
            if (lIllIlIllIllII(this.N)) {
                this.N = BankLocation.getNearestCommon();
            }
            if (lIllIlIllIlIIl(Bank.open() ? 1 : 0)) {
                Log.info("Walking to bank: " + this.N.toString());
                Movement.walkTo(this.N);
                "".length();
            }
            return llllIlIlIlI[1];
        }
        return llllIlIlIlI[0];
    }

    private static boolean lIllIlIllIllII(Object obj) {
        return obj == null;
    }

    private static void lIllIlIllIlIII() {
        llllIlIlIlI = new int[2];
        llllIlIlIlI[0] = ((67 ^ 113) ^ (100 ^ 29)) & (((201 ^ 193) ^ (127 ^ 60)) ^ (-" ".length()));
        llllIlIlIlI[1] = " ".length();
    }

    private static boolean lIllIlIllIlIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIlIllIlIIl(int i) {
        return i == 0;
    }

    static {
        lIllIlIllIlIII();
    }

    private static boolean lIllIlIllIlIll(int i) {
        return i != 0;
    }

    @Inject
    public k(Client client, SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.K = client;
        this.L = squireBarrows;
        this.M = squireBarrowsConfig;
    }
}
