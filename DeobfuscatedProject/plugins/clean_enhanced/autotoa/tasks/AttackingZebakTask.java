/*
 * Deobfuscated TOA Zebak Attack Task
 * Handles attacking Zebak during the crocodile boss fight
 */
package gg.squire.autotoa.tasks;

import javax.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Gear;

/**
 * Task for attacking Zebak, the crocodile boss in Path of Crondis.
 *
 * Zebak mechanics handled:
 * - Safe spot positioning (21, 32 relative to instance)
 * - Gear swap checking
 * - Phase-based attack timing
 * - Distance management from safe position
 */
@TaskDesc(name = "Attacking Zebak", priority = 10)
public class AttackingZebakTask extends TOATaskBase {

    /** Safe spot position relative to instance base */
    private static final Point SAFE_SPOT = new Point(21, 32);

    /** Zebak NPC ID */
    private static final int ZEBAK_NPC_ID = 11730;

    @Inject
    protected AttackingZebakTask(Client client, TOAStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    /**
     * Execute the Zebak attack logic
     *
     * @return true if action was taken, false otherwise
     */
    @Override
    protected boolean execute() {
        // Find Zebak NPC
        NPC zebak = findZebakNPC();
        if (zebak == null) {
            return false;
        }

        Player player = Players.getLocal();

        // Check if we have the right gear equipped for Zebak
        boolean hasGearEquipped = Gear.isEquipped(Gear.matching(config.gearSwapZebak()));

        // If already interacting and gear is equipped, don't re-attack
        if (player.getInteracting() != null && hasGearEquipped) {
            return false;
        }

        // Calculate distance to safe position
        int distanceToSafe = player.distanceTo(getSafeSpotWorldPoint(SAFE_SPOT));

        // Check if we're in melee range
        boolean inMeleeRange = isInMeleeRange(zebak, 1);

        // If not in melee range, far from safe spot, and not in ATTACK phase, wait
        if (!inMeleeRange && distanceToSafe > getMaxSafeDistance() && getCurrentPhase() != ZebakPhase.ATTACK) {
            return false;
        }

        // Attack Zebak
        zebak.interact("Attack");
        return true;
    }

    /**
     * Find the Zebak NPC
     */
    private NPC findZebakNPC() {
        return findNPCById(ZEBAK_NPC_ID);
    }

    /**
     * Get the current Zebak fight phase
     */
    private ZebakPhase getCurrentPhase() {
        return stateManager.getZebakPhase();
    }

    /**
     * Get maximum allowed distance from safe spot
     */
    private int getMaxSafeDistance() {
        return config.zebakSafeDistance();
    }
}
