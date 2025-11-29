package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

import javax.inject.Inject;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Task for attacking Scarab Swarms that are being healed during the Kephri boss fight in TOA.
 *
 * NPC Names:
 * - Scarab Swarm (small adds that spawn and can be healed by Kephri)
 *
 * Projectile IDs:
 * - 2030: Healing projectile ID (indicates swarm is being healed)
 *
 * Combat Logic:
 * 1. Tracks swarms that receive healing projectiles
 * 2. Finds swarms near the boss that haven't been healed yet
 * 3. Only targets swarms more than 2 tiles from boss
 * 4. Avoids swarms in melee distance of boss
 * 5. Finds the swarm closest to the player's path
 *
 * Attack Priority:
 * - Priority 12 (medium-high) to prevent swarms from being healed
 * - Blocking task
 * - Targets swarms before they reach the boss and get healed
 *
 * Strategy:
 * - Swarms that get healed by Kephri become harder to kill
 * - This task preemptively attacks swarms to prevent healing
 * - Uses Zebak gear swap configuration
 *
 * Priority: 12 (medium-high)
 * Blocking: Yes
 */
@TaskDesc(name="Attacking kephri swarm (medic)", priority=12, register=true, blocking=true)
public class AttackingKephriSwarmMedicTask extends AutotoaManager {

    // NPC Names
    private static final String NPC_SCARAB_SWARM = "Scarab Swarm";
    private static final String INTERACTION_ATTACK = "Attack";

    // Projectile IDs
    private static final int PROJECTILE_HEALING = 2030; // Projectile ID for healing

    // Constants
    private static final int MIN_DISTANCE_FROM_BOSS = 2; // Minimum distance swarm should be from boss

    // State tracking
    private final Set<NPC> healedSwarms;    // Swarms that have received healing
    private NPC currentTarget;              // Current swarm being attacked

    @Inject
    protected AttackingKephriSwarmMedicTask(Client client, z z2, TOAConfig config) {
        super(client, z2, config, bi.ATTACK);
        this.healedSwarms = new HashSet<>();
    }

    /**
     * Returns the equipment setup for attacking swarms
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        return this.config.gearSwapZebak();
    }

    /**
     * Tracks when swarms receive healing projectiles
     */
    @Subscribe
    public void onProjectileSpawned(ProjectileSpawned event) {
        // Check if this is a healing projectile
        if (event.getProjectile().getId() == PROJECTILE_HEALING && currentTarget != null) {
            // Mark this swarm as healed
            healedSwarms.add(currentTarget);
            currentTarget = null;
        }
    }

    /**
     * Main task execution
     */
    @Override
    protected boolean execute() {
        // Check if we should be attacking swarms
        if (this.shouldAvoidSwarms()) {
            return false;
        }

        // Get the boss NPC (Kephri)
        NPC boss = this.getBoss();

        // Find swarms near the boss that haven't been healed yet
        NPC targetSwarm = NPCs.getAll(npc ->
            npc.getName().equals(NPC_SCARAB_SWARM) &&
            !healedSwarms.contains(npc) &&
            !npc.isDead() &&
            npc.distanceTo((Locatable) boss) > MIN_DISTANCE_FROM_BOSS
        )
        .stream()
        // Only target swarms not in melee distance of the boss
        .filter(npc -> !boss.getWorldArea().isInMeleeDistance(npc.getWorldLocation()))
        // Find the swarm closest to our walking path
        .min(Comparator.comparingInt(npc ->
            npc.getWorldLocation().distanceToPath(this.client, Players.getLocal().getWorldLocation())
        ))
        .orElse(null);

        if (targetSwarm == null) {
            return false;
        }

        // Attack the swarm
        this.prepareAttack();
        targetSwarm.interact(INTERACTION_ATTACK);
        currentTarget = targetSwarm;

        // Check if we should continue
        if (!isInCombat() && !this.shouldAvoidSwarms()) {
            return true;
        }

        return false;
    }
}
