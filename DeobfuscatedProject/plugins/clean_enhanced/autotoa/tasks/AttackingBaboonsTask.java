package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;

/**
 * Task for attacking Baboon adds during the Ba-Ba boss fight in TOA.
 *
 * NPC IDs and Names:
 * - Baboon (various types)
 * - Rubble (falling boulder hazard)
 *
 * Combat Logic:
 * 1. Finds nearest alive Baboon
 * 2. Avoids attacking if Rubble is within 8 tiles of the Baboon
 * 3. Uses configured attack style for baboons
 * 4. Sleeps for 5 ticks when boulder warning appears
 *
 * Priority: 10 (medium)
 * Blocking: Yes
 */
@TaskDesc(name="Attacking Baboons", priority=10, blocking=true, register=true)
public class AttackingBaboonsTask extends KephriManager {

    // Constants
    private static final String NPC_BABOON = "Baboon";
    private static final String OBJECT_RUBBLE = "Rubble";
    private static final String INTERACTION_ATTACK = "Attack";
    private static final String BOULDER_WARNING = "Ba-Ba throws a large boulder at you";
    private static final int SAFE_DISTANCE_FROM_RUBBLE = 8;
    private static final int BOULDER_SLEEP_TICKS = 5;

    @Inject
    protected AttackingBaboonsTask(Client client, ToaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Listen for boulder warning message and pause briefly to avoid damage
     */
    @Override
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        if (chatMessage.getMessage().contains(BOULDER_WARNING)) {
            this.sleep(BOULDER_SLEEP_TICKS);
        }
    }

    /**
     * Returns the equipment setup for attacking baboons
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        return this.config.babaBaboonAttackStyle();
    }

    /**
     * Main task execution logic
     *
     * @return true if task should continue, false otherwise
     */
    @Override
    public boolean execute() {
        // Don't attack if red X (player is engaged elsewhere)
        if (this.config.redX()) {
            return false;
        }

        // Find nearest alive baboon
        NPC baboon = NPCs.getNearest(npc ->
            npc.getName().equals(NPC_BABOON) && !npc.isDead()
        );

        if (baboon == null) {
            return false;
        }

        // Check for nearby rubble (falling boulder hazard)
        NPC rubble = NPCs.getNearest(npc -> npc.getName().contains(OBJECT_RUBBLE));

        // Don't attack if baboon is too far from rubble (rubble might hit us)
        if (rubble != null && baboon.distanceTo((Locatable) rubble) > SAFE_DISTANCE_FROM_RUBBLE) {
            return false;
        }

        // Prepare equipment and attack
        this.prepareAttack();
        baboon.interact(INTERACTION_ATTACK);
        return true;
    }
}
