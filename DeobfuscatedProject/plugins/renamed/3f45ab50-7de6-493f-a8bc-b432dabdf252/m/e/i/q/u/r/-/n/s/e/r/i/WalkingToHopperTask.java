/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import m.e.i.q.u.r.-.n.s.e.r.i.C_Unknown;
import m.e.i.q.u.r.-.n.s.e.r.i.T_Unknown;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Walking to hopper -> WalkingtohopperTask */
@TaskDesc(name="Walking to hopper", priority=10, blocking=true)
public class WalkingToHopperTask
extends C_Unknown {
    private static /* synthetic */ int[] llllllIllllI;

    private static boolean lIIlIlIIlllIIll(Object object) {
        return object == null;
    }

    @Override
    public boolean t() {
        TileObject var3;
        E var2;
        if (E.lIIlIlIIlllIIlI(this.Z.I() ? 1 : 0)) {
            return llllllIllllI[0];
        }
        if (E.lIIlIlIIlllIIlI(var2.Z.K() ? 1 : 0)) {
            return llllllIllllI[0];
        }
        Player var1 = Players.getLocal();
        if (E.lIIlIlIIlllIIll(var1)) {
            return llllllIllllI[0];
        }
        if (E.lIIlIlIIlllIlII(Dialog.isOpen() ? 1 : 0) && E.lIIlIlIIlllIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        if (E.lIIlIlIIlllIIll(var3 = var2.x())) {
            return llllllIllllI[0];
        }
        if (E.lIIlIlIIlllIlIl(var3.distanceTo(var1.getWorldLocation()), llllllIllllI[1])) {
            return llllllIllllI[0];
        }
        if (E.lIIlIlIIlllIlII(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((Locatable)var3);
            0;
        }
        return llllllIllllI[2];
    }

    private static boolean lIIlIlIIlllIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    public E(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
    }

    private static boolean lIIlIlIIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIlllIIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIlllIIIl() {
        llllllIllllI = new int[3];
        E.llllllIllllI[0] = (0x94 ^ 0xB1) & ~(0x49 ^ 0x6C);
        E.llllllIllllI[1] = 3;
        E.llllllIllllI[2] = 1;
    }

    static {
        E.lIIlIlIIlllIIIl();
    }
}

