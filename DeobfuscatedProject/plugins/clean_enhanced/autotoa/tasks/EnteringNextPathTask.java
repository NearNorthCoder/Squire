package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

/**
 * Task for entering the next path/room in TOA.
 *
 * This task:
 * - Checks configured room order
 * - Finds the corresponding entry barrier
 * - Interacts with barriers to enter rooms
 * - Falls back to general "Entry" objects
 */
@TaskDesc(name = "Entering next path", priority = 20, blocking = true)
public class EnteringNextPathTask extends KephriManager {
    private static final int BARRIER_OBJECT_ID = 45685;

    private final TOAConfig config;
    private final RaidStateManager stateManager;

    @Inject
    protected EnteringNextPathTask(Client client, RaidStateManager stateManager, TOAConfig config) {
        super(client);
        this.stateManager = stateManager;
        this.config = config;
    }

    @Override
    public boolean run() {
        // Don't enter if not at path selection
        if (!isAtPathSelection(BARRIER_OBJECT_ID)) {
            return false;
        }

        // Get configured room order
        TOARoomType[] roomOrder = {
            config.firstRoom(),
            config.secondRoom(),
            config.thirdRoom(),
            config.fourthRoom()
        };

        // Try to find and enter the next configured room
        for (TOARoomType room : roomOrder) {
            TileObject barrier = TileObjects.getNearest(room.getBarrierId());

            if (barrier == null) {
                // Room already completed, set as current
                stateManager.setCurrentRoom(room);
            } else {
                // Found the next room to enter
                barrier.interact("Quick-Enter");
                return true;
            }
        }

        // No configured rooms found, try generic entry
        TileObject entry = TileObjects.getNearest("Entry");
        if (entry != null) {
            entry.interact("Quick-Enter");
            return true;
        }

        return false;
    }
}
