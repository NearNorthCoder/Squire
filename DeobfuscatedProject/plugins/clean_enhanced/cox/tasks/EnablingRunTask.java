package gg.squire.cox.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;

/**
 * Simple task to keep run energy enabled during Chambers of Xeric.
 * Enables run when energy is above a random threshold to avoid
 * predictable behavior patterns.
 */
@TaskDesc(name="Enabling run", priority=30000)
public class EnablingRunTask extends Task {

    private int energyThreshold;

    public EnablingRunTask() {
        this.energyThreshold = 0;
    }

    @Override
    public boolean run() {
        if (Movement.getRunEnergy() < energyThreshold) {
            return true;
        }

        if (Movement.isRunEnabled()) {
            return true;
        }

        // Set random threshold for next time to vary behavior
        this.energyThreshold = Rand.nextInt(20, 30);
        Movement.toggleRun();
        return true;
    }
}
