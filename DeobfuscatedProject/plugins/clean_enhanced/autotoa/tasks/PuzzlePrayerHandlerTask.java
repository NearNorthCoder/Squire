package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Prayer;

/**
 * Manages prayer during puzzle rooms in Tombs of Amascut.
 *
 * This task ensures Protect from Missiles is active during puzzle rooms
 * to mitigate damage from environmental hazards like arrows, boulders,
 * and other ranged attacks.
 *
 * The prayer is flickered to conserve prayer points while maintaining protection.
 */
@TaskDesc(name="Puzzle Prayer Handler", priority=100)
public class PuzzlePrayerHandlerTask extends KephriManager {

    private static final int PRAYER_OVERHEAD_PRIORITY = 28591; // 0x6FAF - Prayer priority value

    @Inject
    public PuzzlePrayerHandlerTask(SquireAutoTOA plugin, TOAConfig config) {
        super(plugin, config);
    }

    /**
     * Indicates this task should always be active during puzzle rooms.
     */
    @Override
    public boolean alwaysActive() {
        return true;
    }

    /**
     * Returns the prayer priority level for overhead prayers.
     * Higher values indicate more important prayers that should be maintained.
     */
    @Override
    public int getPrayerPriority() {
        return PRAYER_OVERHEAD_PRIORITY;
    }

    /**
     * Indicates prayers should be used during puzzle challenges.
     */
    @Override
    public boolean usePrayers() {
        return true;
    }

    /**
     * Specifies the prayer handling mode.
     * FLICK mode activates prayer only when needed to save prayer points.
     */
    @Override
    public PrayerMode getPrayerMode() {
        return PrayerMode.FLICK;
    }

    /**
     * Returns the list of prayers to activate.
     * Protect from Missiles provides protection against ranged attacks.
     */
    @Override
    public List<Prayer> getPrayers() {
        return List.of(Prayer.PROTECT_FROM_MISSILES);
    }
}
