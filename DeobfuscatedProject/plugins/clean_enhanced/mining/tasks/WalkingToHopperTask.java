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

    private static boolean var2(Object object) {
        return object == null;
    }

    @Override
    public boolean t() {
        TileObject var3;
        E var4;
        if (E.var5(this.Z.I() ? 1 : 0)) {
            return var1[0];
        }
        if (E.var5(var4.Z.K() ? 1 : 0)) {
            return var1[0];
        }
        Player var6 = Players.getLocal();
        if (E.var2(var6)) {
            return var1[0];
        }
        if (E.var7(Dialog.isOpen() ? 1 : 0) && E.var7(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        if (E.var2(var3 = var4.x())) {
            return var1[0];
        }
        if (E.var8(var3.distanceTo(var6.getWorldLocation()), var1[1])) {
            return var1[0];
        }
        if (E.var7(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((Locatable)var3);
            0;
        }
        return var1[2];
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    @Inject
    public WalkingToHopperTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static void var9() {
        var1 = new int[3];
        E.var1[0] = (0x94 ^ 0xB1) & ~(0x49 ^ 0x6C);
        E.var1[1] = 3;
        E.var1[2] = 1;
    }

    static {
        E.var9();
    }
}

