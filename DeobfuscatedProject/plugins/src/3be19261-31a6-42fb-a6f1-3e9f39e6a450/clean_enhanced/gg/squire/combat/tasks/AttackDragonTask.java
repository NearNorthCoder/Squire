package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.combat.AttackStyle;
import gg.squire.combat.DragonCombatManager;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.ChatMessageType;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

import javax.inject.Inject;
import java.util.List;

/**
 * Task responsible for attacking blue dragons.
 * Handles walking to safe spots, attacking dragons, and managing combat.
 * Priority: 5 (medium priority)
 */
@TaskDesc(name = "Attacking Blue Dragon", priority = 5, register = true)
public class AttackDragonTask extends Task {
    private final SquireBlueDragonKiller plugin;
    private final SquireBlueDragonKillerConfig config;
    private final DragonCombatManager combatManager;

    @Inject
    public AttackDragonTask(SquireBlueDragonKiller plugin, SquireBlueDragonKillerConfig config,
                           DragonCombatManager combatManager) {
        this.plugin = plugin;
        this.config = config;
        this.combatManager = combatManager;
    }

    @Override
    public boolean run() {
        // Check if plugin should be running
        if (!plugin.needsBanking()) {
            return false;
        }

        // Check if we need to stop for any reason (out of supplies, etc)
        if (plugin.shouldStopForSupplies()) {
            plugin.setNeedsBanking(true);
            return false;
        }

        // Don't attack if not ready
        if (!shouldAttack()) {
            return false;
        }

        // Handle combat
        handleCombat();
        return true;
    }

    /**
     * Checks if we should be attacking dragons.
     * Returns false if we should walk to safe spot first or if being attacked.
     *
     * @return true if we should attack
     */
    private boolean shouldAttack() {
        // If attacking NPCs while ranging at safe spot, need to walk to safe spot first
        if (!shouldWalkToSafeSpot() &&
            !combatManager.isInDragonArea() &&
            combatManager.getNearestDragon() != null &&
            !isBeingChasedByNpc()) {
            return true;
        }

        return false;
    }

    /**
     * Checks if melee attack style is selected.
     *
     * @return true if using melee
     */
    private boolean isMelee() {
        return config.attackStyle() == AttackStyle.MELEE;
    }

    /**
     * Checks if player should walk to the safe spot.
     * Only applicable for melee when being attacked and not at safe spot yet.
     *
     * @return true if should walk to safe spot
     */
    private boolean shouldWalkToSafeSpot() {
        return isMelee() && combatManager.isBeingAttacked() && !isAtSafeSpot();
    }

    /**
     * Checks if player is at the configured safe spot.
     *
     * @return true if at safe spot
     */
    private boolean isAtSafeSpot() {
        return Players.getLocal().getWorldLocation().equals(config.dragonLocation().getSafeSpot());
    }

    /**
     * Checks if player is being chased by NPCs that are attacking.
     *
     * @return true if NPCs are chasing and attacking
     */
    private boolean isBeingChasedByNpc() {
        if (Players.getLocal().getInteracting() != null &&
            (isMelee() && !shouldWalkToSafeSpot() || !isMelee())) {
            return true;
        }
        return false;
    }

    /**
     * Handles walking to safe spot if melee, or attacking dragons.
     */
    private void handleCombat() {
        // Walk to safe spot if needed (melee only)
        if (isMelee() && combatManager.isBeingAttacked() && !isAtSafeSpot()) {
            Movement.walkTo(config.dragonLocation().getSafeSpot());
        }

        // Don't attack if we should be walking
        if (Movement.shouldWalk()) {
            return;
        }

        // Attack dragon
        combatManager.attack();
    }

    /**
     * Listens for death messages to enable banking when out of supplies.
     *
     * @param event Chat message event
     */
    @Subscribe
    private void onChatMessage(ChatMessage event) {
        if (event.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }

        // Check for out of ammo message (for ranged)
        if (event.getMessage().contains("You have run out of")) {
            Log.info("Out of ammunition, returning to bank");
            plugin.setNeedsBanking(true);
        }
    }
}
