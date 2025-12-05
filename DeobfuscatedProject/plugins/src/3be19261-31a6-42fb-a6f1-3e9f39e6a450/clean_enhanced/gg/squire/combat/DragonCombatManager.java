package gg.squire.combat;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

/**
 * Manages dragon combat operations including finding dragons, attacking, and handling retaliation.
 */
@Singleton
public class DragonCombatManager {
    private final SquireBlueDragonKillerConfig config;

    @Inject
    public DragonCombatManager(SquireBlueDragonKillerConfig config) {
        this.config = config;
    }

    /**
     * Checks if the player is currently in the dragon area.
     *
     * @return true if player is in the configured dragon location area
     */
    public boolean isInDragonArea() {
        return this.config.dragonLocation().getDragonArea().contains(Players.getLocal().getWorldLocation());
    }

    /**
     * Gets the nearest attackable blue dragon.
     * Filters out dead dragons and ensures line of sight.
     *
     * @return NPC of the nearest blue dragon, or null if none found
     */
    public NPC getNearestDragon() {
        return NPCs.getNearest(npc ->
            !npc.isDead() &&
            npc.getName().equals("Blue dragon") &&
            npc.getWorldArea().hasLineOfSightTo(
                Static.getClient().getTopLevelWorldView(),
                Players.getLocal().getWorldArea()
            )
        );
    }

    /**
     * Attacks a dragon or handles retaliating NPCs.
     * If player has no target and is being attacked, it will attack the retaliating NPC.
     * Otherwise, it finds and attacks the nearest blue dragon.
     */
    public void attack() {
        if (Players.getLocal().getInteracting() != null) {
            return;
        }

        // If being attacked by an NPC, fight back
        if (isBeingAttacked()) {
            attackRetaliatingNpc();
        }

        // Find and attack nearest dragon
        NPC dragon = getNearestDragon();
        if (dragon == null) {
            return;
        }

        dragon.interact("Attack");
    }

    /**
     * Checks if the player is currently being attacked by any NPC.
     *
     * @return true if an NPC is attacking the player
     */
    public boolean isBeingAttacked() {
        Actor interacting = Players.getLocal().getInteracting();

        // Check if currently fighting something
        if (interacting != null && interacting.hasAction("Pickaxe")) {
            return true;
        }

        // Check if any NPCs are targeting the player
        return !NPCs.getAll(npc ->
            npc.getInteracting() == Players.getLocal()
        ).isEmpty();
    }

    /**
     * Attacks the NPC that is currently retaliating against the player.
     */
    private void attackRetaliatingNpc() {
        NPC retaliatingNpc = NPCs.getNearest(npc ->
            !npc.isDead() &&
            npc.getInteracting() == Players.getLocal()
        );

        if (retaliatingNpc == null) {
            return;
        }

        retaliatingNpc.interact("Pickaxe");
    }
}
