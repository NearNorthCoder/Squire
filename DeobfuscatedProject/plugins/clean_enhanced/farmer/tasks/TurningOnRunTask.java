/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.farmer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.GameState;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Turning on run", priority=100)
public class TurningOnRunTask
extends Task {
    
    private  int cc;

    public boolean run() {
        aB var2;
        if ((Game.getState() != Game.getState()2)) {
            return 1;
        }
        if ((Movement.isRunEnabled( == 0) ? 1 : 0) && (Movement.getRunEnergy() > var2.cc)) {
            Movement.toggleRun();
            var2.cc = Rand.nextInt((int)2, (int)3);
        }
        return 1;
    }

    static {
        aB.var3();
    }

    public TurningOnRunTask() {
        this.cc = 0;
    }
}

