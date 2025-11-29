/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.concurrent.ExecutorService;

/**
 * Handles gear swapping for the Obelisk encounter in TOA.
 * Switches to configured Obelisk gear when entering the Obelisk room.
 *
 * The Obelisk has specific gear requirements for optimal DPS,
 * so this task ensures the player swaps to the appropriate setup.
 */
@TaskDesc(name="Swapping for obelisk", register=true)
public class SwappingForObeliskTask extends TOAGearSwapper {

    @Inject
    public SwappingForObeliskTask(TOAConfig config, ExecutorService executorService) {
        super(config, executorService);
    }

    /**
     * Checks if this gear swap should be active.
     * Active when the obelisk gear configuration is selected.
     *
     * @return true if obelisk gear is configured
     */
    @Override
    public boolean shouldSwap() {
        return this.config.obeliskGear().isSelected();
    }

    /**
     * Gets the gear IDs to swap to for the given room.
     * Returns obelisk gear when the room name contains "Obelisk".
     *
     * @param roomName The name of the current room
     * @return Array of item IDs for obelisk gear, or empty array for other rooms
     */
    @Override
    public int[] getGearForRoom(String roomName) {
        if (roomName.contains("Obelisk")) {
            return this.getGearIds(this.config.obeliskGear());
        }
        return new int[0];
    }
}
