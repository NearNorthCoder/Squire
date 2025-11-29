/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Attacking zamorak", priority=10)
public class AttackingZamorakTask
extends Task {
    
    private final  l M;
    
    private final  c N;

    @Inject
    public AttackingZamorakTask(l l2, c c2) {
        this.M = l2;
        this.N = c2;
    }

    public boolean run() {
        o var3;
        if (!(this.M.B( != 0) ? 1 : 0) || (this.M.G( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.M.A( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.isRunEnabled( == 0) ? 1 : 0)) {
            Movement.toggleRun();
        }
        if ((var3.N.e( == null))) {
            return 0;
        }
        if ((Players.getLocal( != null).getInteracting())) {
            return 0;
        }
        NPC nPC = this.M.I().m();
        nPC.interact(var2[0]);
        this.sleep(1);
        return 2;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

}

