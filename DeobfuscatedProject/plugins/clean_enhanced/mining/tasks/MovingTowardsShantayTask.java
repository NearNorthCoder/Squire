/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Mining Plugin
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/**
 * Task for moving towards Shantay Pass when entering the desert.
 * Handles walking to the pass and going through the gate.
 */
@TaskDesc(name="Moving towards Shantay", priority=10, blocking=true)
public class MovingTowardsShantayTask extends MiningTaskBase {

    private static final int SHANTAY_PASS_GATE_ID = 35551;
    private static final int WATERSKIN_ID = 3807;
    private static final WorldPoint SHANTAY_PASS_LOCATION = new WorldPoint(3303, 3115, 0);
    private static final String GO_THROUGH_ACTION = "Go-through";

    @Inject
    protected MovingTowardsShantayTask(SquireMinerConfig config) {
        super(config);
    }

    @Override
    public boolean t() {
        // Only move to Shantay if not already in desert and don't have waterskins
        if (!z() || y() > 0) {
            return false;
        }

        // Find the Shantay Pass gate
        TileObject shantayGate = TileObjects.getNearest(SHANTAY_PASS_GATE_ID);

        // If gate not found, walk towards Shantay Pass
        if (shantayGate == null) {
            if (Movement.shouldWalk()) {
                Movement.walkTo(SHANTAY_PASS_LOCATION);
                return true;
            }

            // Drop waterskins if we have them and can't walk (inventory management)
            Item waterskin = Inventory.getFirst(WATERSKIN_ID);
            if (waterskin != null) {
                waterskin.drop();
                return true;
            }

            return false;
        }

        // Go through the gate
        shantayGate.interact(GO_THROUGH_ACTION);
        return true;
    }
}
