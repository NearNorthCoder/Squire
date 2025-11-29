/*
 * Deobfuscated TOA Baba Attack Task
 * Handles attacking Baba (Ba-Ba) during the Path of Apmeken fight
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

/**
 * Task responsible for attacking Baba (Ba-Ba) during the TOA fight.
 *
 * Ba-Ba is one of the four bosses in the Tombs of Amascut.
 * Located in the Path of Apmeken (baboon path).
 *
 * This task handles:
 * - Finding and targeting Baba
 * - Avoiding boulder mechanics
 * - Respecting redX attack mode settings
 */
@TaskDesc(name = "Attacking baba")
public class AttackingBabaTask extends TOATaskBase {

    /** Baba NPC ID when vulnerable */
    private static final int BABA_NPC_ID = 11689;

    /** Maximum boulder proximity check distance */
    private static final int BOULDER_PROXIMITY = 4;

    /** Reference to state manager */
    private final TOAStateManager babaStateManager;

    @Inject
    protected AttackingBabaTask(Client client, TOAStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
        this.babaStateManager = stateManager;
    }

    /**
     * Main task execution - attacks Baba when safe to do so
     *
     * @return true if action was taken, false otherwise
     */
    @Override
    protected boolean execute() {
        // Skip if using redX attack mode (different attack pattern)
        if (config.redX()) {
            return false;
        }

        // Find Baba NPC
        NPC baba = findBaba();
        if (baba == null) {
            return false;
        }

        // Don't attack if Baba is immune (certain phases)
        if (baba.getId() == BABA_NPC_ID) {
            return false;
        }

        // Check if there's a boulder nearby that we should dodge first
        if (isBoulderNearby()) {
            return false;
        }

        // Set attack tick tracking
        trackAttack(baba);

        // Attack Baba
        baba.interact("Attack");
        return true;
    }

    /**
     * Find the Baba NPC
     */
    private NPC findBaba() {
        return NPCs.getNearest(npc ->
            npc.getName() != null && npc.getName().contains("Ba-Ba")
        );
    }

    /**
     * Check if there's a dangerous boulder nearby
     * Boulders are NPCs that roll and deal damage
     */
    private boolean isBoulderNearby() {
        NPC boulder = NPCs.getNearest(npc ->
            npc.getName() != null &&
            npc.getName().equals("Boulder") &&
            npc.distanceTo((Locatable) Players.getLocal()) < BOULDER_PROXIMITY
        );
        return boulder != null;
    }

    /**
     * Track attack for tick timing
     */
    private void trackAttack(NPC target) {
        // Track tick for proper attack timing
        if (babaStateManager != null) {
            babaStateManager.setLastActionTick(client.getTickCount());
        }
    }
}

