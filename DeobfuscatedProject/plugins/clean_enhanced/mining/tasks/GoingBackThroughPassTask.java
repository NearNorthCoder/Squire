/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Mining Plugin
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

/**
 * Task for going back through the Shantay Pass gate.
 * Used when leaving the desert after mining granite or sandstone.
 */
@TaskDesc(name="Going back through pass", priority=100, blocking=true)
public class GoingBackThroughPassTask extends MiningTaskBase {

    private static final int SHANTAY_PASS_GATE_ID = 15512;
    private static final String GO_THROUGH_ACTION = "Go-through";

    @Inject
    protected GoingBackThroughPassTask(SquireMinerConfig config) {
        super(config);
    }

    @Override
    public boolean t() {
        // Only go back if we have waterskins and are not in desert
        if (y() <= 0 || z()) {
            return false;
        }

        // Find the Shantay Pass gate
        TileObject shantayGate = TileObjects.getNearest(SHANTAY_PASS_GATE_ID);

        if (shantayGate == null) {
            return false;
        }

        // Go through the gate
        shantayGate.interact(GO_THROUGH_ACTION);
        return true;
    }
}
