/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Prayer;

/**
 * Handles prayer switching during the Obelisk boss fight in TOA.
 * The Obelisk requires specific prayers to protect against its attacks.
 *
 * This task ensures the correct offensive prayer is used and flicked
 * during the Obelisk encounter.
 */
@TaskDesc(name="Handling Obelisk Prayers", priority=Integer.MAX_VALUE)
public class HandlingObeliskPrayersTask extends TOAPrayerHandler {
    // The damage variance number that indicates obelisk attacks - 24339 (0x5F13)
    private static final int OBELISK_DAMAGE_VARIANCE = 24339;

    @Inject
    public HandlingObeliskPrayersTask(SquireAutoTOA plugin, TOAConfig config) {
        super(plugin, config);
    }

    /**
     * Checks if this task should be active.
     * Active when fighting an NPC named "Obelisk".
     *
     * @return true if currently fighting the Obelisk
     */
    @Override
    public boolean shouldActivate() {
        return this.encounterManager.hasNPC(npc -> npc.getName().equals("Obelisk"));
    }

    /**
     * Checks if prayers should be active for this encounter.
     *
     * @return true if should use prayers
     */
    @Override
    public boolean shouldUsePrayers() {
        return this.shouldActivate();
    }

    /**
     * Gets the list of prayers to use.
     * Returns the appropriate offensive prayer based on the player's gear.
     *
     * @return List containing the recommended offensive prayer
     */
    @Override
    public List<Prayer> getPrayers() {
        return List.of(this.getOffensivePrayer());
    }

    /**
     * Gets the prayer mode for this encounter.
     * Obelisk prayers should be flicked for efficiency.
     *
     * @return FLICK mode
     */
    @Override
    public PrayerMode getPrayerMode() {
        return PrayerMode.FLICK;
    }

    /**
     * Gets the tick offset for prayer activation.
     *
     * @return 0 for immediate activation
     */
    @Override
    public int getTickOffset() {
        return OBELISK_DAMAGE_VARIANCE;
    }
}
