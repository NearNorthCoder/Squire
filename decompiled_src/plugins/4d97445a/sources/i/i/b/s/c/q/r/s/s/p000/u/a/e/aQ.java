package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Walking back to tile before loot", priority = -100)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aQ  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aQ.class */
public class aQ extends Task {
    private static /* synthetic */ int[] llIIIlllI;
    private final /* synthetic */ SquireLooter eK;
    private final /* synthetic */ LooterConfig eL;

    private static boolean lIlIllIlIII(int i2) {
        return i2 != 0;
    }

    static {
        lIlIllIIllI();
    }

    private static boolean lIlIllIIlll(int i2) {
        return i2 == 0;
    }

    @Inject
    public aQ(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eK = squireLooter;
        this.eL = looterConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    public boolean run() {
        if (lIlIllIIlll(this.eL.safespot() ? 1 : 0)) {
            return llIIIlllI[0];
        }
        Player local = Players.getLocal();
        if (!lIlIllIlIII(local.isMoving() ? 1 : 0) && !lIlIllIlIII(local.getWorldLocation().equals(this.eK.cf()) ? 1 : 0)) {
            if (!lIlIllIlIIl(this.eK.cf()) || lIlIllIIlll(this.eK.cf().isInScene(Static.getClient()) ? 1 : 0)) {
                return llIIIlllI[0];
            }
            Movement.walkTo(this.eK.cf());
            "".length();
            sleep(llIIIlllI[1]);
            return llIIIlllI[2];
        }
        return llIIIlllI[0];
    }

    private static boolean lIlIllIlIIl(Object obj) {
        return obj != null;
    }

    private static void lIlIllIIllI() {
        llIIIlllI = new int[3];
        llIIIlllI[0] = ((((138 + 34) - (-3)) + 11) ^ (((104 + 119) - 189) + 115)) & (((((151 + 163) - 278) + 137) ^ (((77 + 26) - (-22)) + 5)) ^ (-" ".length()));
        llIIIlllI[1] = (231 ^ 176) ^ (223 ^ 140);
        llIIIlllI[2] = " ".length();
    }
}
