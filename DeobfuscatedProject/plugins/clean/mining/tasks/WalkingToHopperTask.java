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
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.MiningTaskBase;
import gg.squire.mining.tasks.MiningManager;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Walking to hopper", priority=10, blocking=true)
public class WalkingToHopperTask
extends MiningTaskBase {

    private static boolean lIIlIlIIlllIIll(Object object) {
        return object == null;
    }

    @Override
    public boolean t() {
        TileObject var1;
        E var2;
        if (E.lIIlIlIIlllIIlI(this.Z.I() ? 1 : 0)) {
            return llllllIllllI[0];
        }
        if (E.lIIlIlIIlllIIlI(var2.Z.K() ? 1 : 0)) {
            return llllllIllllI[0];
        }
        Player var3 = Players.getLocal();
        if (E.lIIlIlIIlllIIll(var3)) {
            return llllllIllllI[0];
        }
        if (E.lIIlIlIIlllIlII(Dialog.isOpen() ? 1 : 0) && E.lIIlIlIIlllIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        if (E.lIIlIlIIlllIIll(var1 = var2.x())) {
            return llllllIllllI[0];
        }
        if (E.lIIlIlIIlllIlIl(var1.distanceTo(var3.getWorldLocation()), llllllIllllI[1])) {
            return llllllIllllI[0];
        }
        if (E.lIIlIlIIlllIlII(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((Locatable)var1);

        }
        return llllllIllllI[2];
    }

    private static boolean lIIlIlIIlllIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    public WalkingToHopperTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
    }

    private static boolean lIIlIlIIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIlllIIlI(int n2) {
        return n2 == 0;
    }

    static {
        E.lIIlIlIIlllIIIl();
    }
}

