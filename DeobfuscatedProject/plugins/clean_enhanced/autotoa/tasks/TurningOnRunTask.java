/*
 * Decompiled with CFR 0.152.
 *
 * Run Toggle Task
 *
 * This task handles automatically enabling run during TOA raids.
 * It enables run when:
 * - Not paused
 * - Run energy is above threshold (30)
 * - Run is currently disabled
 *
 * This ensures the player maintains movement speed during the raid.
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Turning on run", priority=0x7FFFFFFF)
public class TurningOnRunTask extends Task {

    // Constants
    private static final int RUN_ENERGY_THRESHOLD = 30;

    protected final SquireAutoTOA plugin;

    @Inject
    public TurningOnRunTask(SquireAutoTOA plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        // Don't toggle run if run toggle is disabled
        if (this.plugin.isRunToggleDisabled()) {
            return false;
        }

        // Enable run if we have enough energy and run is not enabled
        if (Movement.getRunEnergy() > RUN_ENERGY_THRESHOLD && !Movement.isRunEnabled()) {
            Movement.toggleRun();
            return true;
        }

        return false;
    }
}
