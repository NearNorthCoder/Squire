package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.*;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Task to deposit ores at a deposit box.
 */
@TaskDesc(name = "Depositing ores", priority = 19, blocking = true)
public class DepositOresTask extends MotherlodeMineTask {
    private final int[] depositIds;

    @Inject
    public DepositOresTask(SquireMinerConfig config, SquireMiner plugin, MotherlodeMineTracker tracker) {
        super(config, plugin, tracker);
        this.depositIds = new int[]{
            9467, 9468, 9469, 9471, 9472, 9473, 
            9474, 9475, 9476, 9477, 21345
        };
    }

    @Override
    public boolean validate() {
        if (!tracker.wasInventoryFullBefore()) {
            return false;
        }

        if (!Inventory.contains(item -> MotherlodeMineTracker.PAYDIRT_IDS.contains(item.getId()))) {
            if (tracker.isSackFull()) {
                tracker.setInventoryFull(false);
            }
            return false;
        }

        // Drop uncut gems if inventory full
        if (Inventory.contains(1625)) {
            Inventory.dropAll(1625);
            return true;
        }

        // Use deposit box
        if (DepositBox.isOpen()) {
            DepositBox.depositAllItems(depositIds);
            return true;
        }

        TileObject depositBox = TileObjects.getNearest(25937);
        if (depositBox == null) {
            return false;
        }

        if (!Reachable.isInteractable(depositBox)) {
            Movement.walkTo(depositBox);
            return true;
        }

        if (Movement.shouldWalk()) {
            depositBox.interact("Deposit");
        }

        return true;
    }
}
