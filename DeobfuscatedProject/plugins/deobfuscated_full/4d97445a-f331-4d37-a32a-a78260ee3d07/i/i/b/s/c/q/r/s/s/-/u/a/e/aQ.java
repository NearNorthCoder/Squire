/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/* TASK: Walking back to tile before loot -> WalkingbacktotilebeforelootTask */
@TaskDesc(name="Walking back to tile before loot", priority=-100)
public class aQ
extends Task {
    private static /* synthetic */ int[] llIIIlllI;
    private final /* synthetic */ SquireLooter eK;
    private final /* synthetic */ LooterConfig eL;

    private static boolean lIlIllIlIII(int n2) {
        return n2 != 0;
    }

    static {
        aQ.lIlIllIIllI();
    }

    private static boolean lIlIllIIlll(int n2) {
        return n2 == 0;
    }

    @Inject
    public aQ(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eK = squireLooter;
        this.eL = looterConfig;
    }

    public boolean run() {
        aQ lIllIllIIllIlII;
        if (aQ.lIlIllIIlll(this.eL.safespot() ? 1 : 0)) {
            return llIIIlllI[0];
        }
        Player lIllIllIIllIIll = Players.getLocal();
        if (aQ.lIlIllIlIII(lIllIllIIllIIll.isMoving() ? 1 : 0)) {
            return llIIIlllI[0];
        }
        if (aQ.lIlIllIlIII(lIllIllIIllIIll.getWorldLocation().equals((Object)lIllIllIIllIlII.eK.cf()) ? 1 : 0)) {
            return llIIIlllI[0];
        }
        if (!aQ.lIlIllIlIIl(lIllIllIIllIlII.eK.cf()) || aQ.lIlIllIIlll(lIllIllIIllIlII.eK.cf().isInScene(Static.getClient()) ? 1 : 0)) {
            return llIIIlllI[0];
        }
        Movement.walkTo((WorldPoint)this.eK.cf());
        0;
        this.sleep(llIIIlllI[1]);
        return llIIIlllI[2];
    }

    private static boolean lIlIllIlIIl(Object object) {
        return object != null;
    }

    private static void lIlIllIIllI() {
        llIIIlllI = new int[3];
        aQ.llIIIlllI[0] = (138 + 34 - -3 + 11 ^ 104 + 119 - 189 + 115) & (151 + 163 - 278 + 137 ^ 77 + 26 - -22 + 5 ^ -1);
        aQ.llIIIlllI[1] = 0xE7 ^ 0xB0 ^ (0xDF ^ 0x8C);
        aQ.llIIIlllI[2] = 1;
    }
}

