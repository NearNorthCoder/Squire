/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import net.runelite.api.Client;

/**
 * Base class for TOA (Tombs of Amascut) tasks that need access to the configuration.
 * This class extends the core TOA task infrastructure and adds configuration support.
 *
 * Tasks extending this class typically handle specific game mechanics like banking,
 * party creation, or reward claiming.
 */
public abstract class TOAConfigurableTask extends TOATaskInfrastructure {
    // Widget IDs and other constants
    protected static final int REJUVENATION_POOL_WIDGET_ID = 29886;  // 0x74BE
    protected static final int PARTY_INTERFACE_WIDGET_GROUP = 773;    // 0x0305
    protected static final int REWARD_CHEST_WIDGET_ID = 50348509;     // 0x03042ABD
    protected static final int TELEPORT_CRYSTAL_OBJECT_ID = 32486;    // 0x7EFF
    protected static final int BANKER_CAMEL_OBJECT_ID = 45829;        // 0xB2F5

    // Configuration instance
    protected final TOAConfig config;

    @Inject
    protected TOAConfigurableTask(Client client, TOAConfig config) {
        super(client);
        this.config = config;
    }

    /**
     * Main task validation and execution logic.
     * Child classes must implement this to define their specific behavior.
     *
     * @return true if the task executed successfully, false otherwise
     */
    public abstract boolean validate();

    /**
     * Runs the task if the region is valid.
     * First checks if we're in the correct area before executing the task logic.
     *
     * @return true if task execution should continue, false otherwise
     */
    @Override
    public boolean run() {
        if (!this.isInTOARegion(REJUVENATION_POOL_WIDGET_ID)) {
            return false;
        }
        return this.validate();
    }
}
