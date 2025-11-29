package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Walking to Bank", priority = 2147470310, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/q.class */
public class C0068q extends Task {
    private /* synthetic */ BankLocation az;
    private final /* synthetic */ SquireCerberusConfig ay;
    private static /* synthetic */ int[] lllIlll;
    private final /* synthetic */ Client aw;
    private final /* synthetic */ SquireCerberus ax;

    @Inject
    public C0068q(Client client, SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig) {
        this.aw = client;
        this.ax = squireCerberus;
        this.ay = squireCerberusConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    public boolean run() {
        if (!lllIIllII(this.ay.bankLoadout().isSelected() ? 1 : 0) && !lllIIllIl(this.aw.getGameState(), GameState.LOGGED_IN) && !lllIIllII(this.ax.r() ? 1 : 0) && !lllIIlllI(Bank.isOpen() ? 1 : 0)) {
            this.az = BankLocation.FALADOR_WEST_BANK;
            if (lllIIllII(Movement.shouldWalk() ? 1 : 0)) {
                return lllIlll[0];
            }
            if (lllIIllII(Bank.open() ? 1 : 0)) {
                Log.info("Walking to bank: " + this.az.toString());
                return Movement.walkTo(this.az);
            }
            return lllIlll[1];
        }
        return lllIlll[0];
    }

    private static boolean lllIIllII(int i2) {
        return i2 == 0;
    }

    private static boolean lllIIlllI(int i2) {
        return i2 != 0;
    }

    private static boolean lllIIllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lllIIlIll();
    }

    private static void lllIIlIll() {
        lllIlll = new int[2];
        lllIlll[0] = ((202 ^ 145) ^ (71 ^ 34)) & ((((52 ^ 43) & ((176 ^ 175) ^ (-1))) ^ (22 ^ 40)) ^ (-" ".length()));
        lllIlll[1] = " ".length();
    }
}
