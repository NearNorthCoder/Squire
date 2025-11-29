/*
 * Deobfuscated TOA Moving Next To Rubble Task
 * Handles moving the player next to rubble during Ba-Ba boss fight
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/**
 * Task for moving next to rubble during the Ba-Ba fight in TOA.
 *
 * During the Ba-Ba boss fight, the boss throws large boulders that create
 * rubble objects. The player needs to stand next to the rubble for protection.
 *
 * Behavior:
 * - Listens for chat message "Ba-Ba throws a large boulder at you"
 * - Finds the nearest Rubble NPC (ID 8)
 * - Moves player to melee distance of the rubble
 * - Resets state when rubble despawns
 */
@TaskDesc(name="Moving next to rubble", priority=100, blocking=true, register=true)
public class MovingNextToRubbleTask extends KephriManager {
    // Constants
    private static final String RUBBLE_NPC_NAME = "Rubble";
    private static final String BOULDER_THROWN_MESSAGE = "Ba-Ba throws a large boulder at you";
    private static final int BA_BA_NPC_ID = 8;

    // State
    private boolean boulderThrown;

    @Inject
    protected MovingNextToRubbleTask(Client client, ToaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Listen for the chat message indicating Ba-Ba threw a boulder
     */
    @Subscribe
    @Override
    public void a(ChatMessage chatMessage) {
        if (chatMessage.getMessage().contains(BOULDER_THROWN_MESSAGE)) {
            this.boulderThrown = true;
        }
    }

    /**
     * Reset boulder thrown flag when rubble despawns
     */
    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (npcDespawned.getNpc().getName().contains(RUBBLE_NPC_NAME)) {
            this.boulderThrown = false;
        }
    }

    @Override
    public boolean bC() {
        // Find nearest rubble NPC
        NPC rubble = NPCs.getNearest(npc -> npc.getName().contains(RUBBLE_NPC_NAME));

        // Check if rubble exists and is alive
        if (rubble == null || rubble.isDead()) {
            return false;
        }

        // Only move if boulder was thrown
        if (!this.boulderThrown) {
            return false;
        }

        // Check if already in melee distance
        WorldPoint playerLocation = Players.getLocal().getWorldLocation();
        if (rubble.getWorldArea().isInMeleeDistance(playerLocation)) {
            return true;
        }

        // Move to rubble
        Movement.setDestination(rubble.getWorldArea().getCenter());
        return true;
    }
}
