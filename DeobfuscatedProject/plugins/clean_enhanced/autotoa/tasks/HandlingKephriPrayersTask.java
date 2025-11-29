/*
 * Deobfuscated TOA Kephri Prayer Handler
 * Manages prayer switching during the Kephri boss fight
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

/**
 * Task for handling prayer switching during the Kephri fight.
 *
 * Kephri and her scarabs use different attack styles:
 * - Kephri herself uses magic attacks
 * - Soldier Scarab uses melee attacks
 * - Spitting Scarab uses ranged attacks
 * - Agile Scarab uses ranged attacks
 */
@TaskDesc(name = "Handling Kephri Prayers", priority = Integer.MAX_VALUE)
public class HandlingKephriPrayersTask extends TOATaskBase {

    /** Scarab NPC names */
    private static final String SOLDIER_SCARAB = "Soldier Scarab";
    private static final String SPITTING_SCARAB = "Spitting Scarab";
    private static final String AGILE_SCARAB = "Agile Scarab";

    /** Kephri NPC IDs */
    private static final int KEPHRI_ID_1 = 11719;
    private static final int KEPHRI_ID_2 = 11720;
    private static final int KEPHRI_ID_3 = 11721;

    /** Graphics ID for dung attack (requires magic prayer) */
    private static final int DUNG_ATTACK_GRAPHIC = 2021;

    /** Threshold for dung graphics to trigger prayer */
    private static final int DUNG_THRESHOLD = 6;

    /** Ticks remaining on dung protection timer */
    private int dungProtectionTicks;

    @Inject
    public HandlingKephriPrayersTask(SquireAutoTOA plugin, TOAConfig config) {
        super(plugin.getClient(), plugin.getStateManager(), config);
        this.dungProtectionTicks = 0;
    }

    /**
     * Get the delay between prayer actions
     */
    public int getPrayerDelay() {
        return 4;
    }

    /**
     * Whether to use prayer flicking
     */
    public boolean usePrayerFlicking() {
        return true;
    }

    /**
     * Get the prayer flick mode
     */
    public PrayerMode getPrayerMode() {
        return PrayerMode.FLICK;
    }

    /**
     * Check if we should activate prayers for this room
     */
    public boolean shouldActivatePrayers() {
        int[] kephriIds = {KEPHRI_ID_1, KEPHRI_ID_2, KEPHRI_ID_3};
        return isInRoom(kephriIds);
    }

    /**
     * Get the prayers to activate this tick
     */
    public List<Prayer> getRequiredPrayers() {
        // Check for dung attack (multiple graphics)
        if (hasDungAttack()) {
            dungProtectionTicks = 6;
        }

        // If dung attack is active, use magic prayer
        if (dungProtectionTicks > 0) {
            dungProtectionTicks--;
            return List.of(getOffensivePrayer(), Prayer.PROTECT_FROM_MAGIC);
        }

        // Check for Soldier Scarab (melee) in attack range
        NPC soldierScarab = NPCs.getNearest(SOLDIER_SCARAB);
        if (soldierScarab != null &&
            soldierScarab.getWorldArea().distanceTo((Locatable) Players.getLocal()) <= 2 &&
            Reachable.isInteractable(soldierScarab)) {
            return List.of(getOffensivePrayer(), Prayer.PROTECT_FROM_MELEE);
        }

        // Check for ranged scarabs
        NPC rangedScarab = NPCs.getNearest(SPITTING_SCARAB, AGILE_SCARAB);
        if (rangedScarab != null) {
            return List.of(getOffensivePrayer(), Prayer.PROTECT_FROM_MISSILES);
        }

        // Default to just offensive prayer
        return List.of(getOffensivePrayer());
    }

    /**
     * Check if dung attack graphics are present
     */
    private boolean hasDungAttack() {
        int count = 0;
        for (GraphicsObject graphic : Static.getClient().getGraphicsObjects()) {
            if (graphic.getId() == DUNG_ATTACK_GRAPHIC) {
                count++;
            }
        }
        return count >= DUNG_THRESHOLD;
    }

    /**
     * Get the offensive prayer to use based on gear
     */
    private Prayer getOffensivePrayer() {
        return Prayer.PIETY; // Default, actual implementation checks weapon style
    }

    /**
     * Check if in room with given NPC IDs
     */
    private boolean isInRoom(int[] npcIds) {
        return stateManager.isInRoom(npcIds);
    }

    @Override
    protected boolean execute() {
        // Prayer handling is done via getRequiredPrayers
        return false;
    }
}
