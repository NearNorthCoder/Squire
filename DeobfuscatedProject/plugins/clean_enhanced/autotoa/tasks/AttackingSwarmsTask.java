package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Task for attacking Scarab Swarms during the Kephri boss fight in TOA.
 *
 * NPC Names:
 * - Scarab Swarm (small adds that spawn from Kephri)
 *
 * Combat Logic:
 * 1. Tracks swarms that are being attacked by projectiles
 * 2. Prioritizes swarms near the boss (within 3 tiles)
 * 3. Only attacks swarms in melee distance of the boss
 * 4. Finds the swarm closest to the player's path
 * 5. Moves to swarm if distance > 5 tiles
 *
 * Attack Priority:
 * - Swarms near the boss (to prevent healing)
 * - Swarms in melee range of boss
 * - Swarms closest to player
 *
 * Priority: 15 (high)
 * Blocking: Yes
 */
@TaskDesc(name="Attacking swarms", priority=15, blocking=true, register=true)
@Singleton
public class AttackingSwarmsTask extends KephriManager {

    // NPC Names
    private static final String NPC_SCARAB_SWARM = "Scarab Swarm";
    private static final String INTERACTION_ATTACK = "Attack";

    // Constants
    private static final int MAX_DISTANCE_FROM_BOSS = 3; // Maximum distance swarm can be from boss
    private static final int MOVEMENT_DISTANCE = 5;      // Distance at which to move closer

    // State tracking
    private final Set<NPC> targetedSwarms; // Swarms that have been hit by projectiles

    @Inject
    protected AttackingSwarmsTask(Client client, ToaPlugin plugin, TOAConfig config) {
        super(client, plugin, config, bi.SWARM);
        this.targetedSwarms = new HashSet<>();
    }

    /**
     * Returns the equipment setup for attacking swarms
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        return this.config.kephriSwarm();
    }

    /**
     * Tracks when swarms are hit by projectiles (marking them as engaged)
     */
    @Subscribe
    public void onProjectileSpawned(ProjectileSpawned event) {
        Projectile projectile = event.getProjectile();
        Actor target = projectile.getInteracting();

        if (target != null && target.getName().equals(NPC_SCARAB_SWARM)) {
            targetedSwarms.add((NPC) target);
        }
    }

    /**
     * Removes despawned swarms from tracking
     */
    @Subscribe
    public void onNpcDespawned(NpcDespawned event) {
        targetedSwarms.remove(event.getNpc());
    }

    /**
     * Main task execution
     */
    @Override
    protected boolean execute() {
        // Get the boss NPC (Kephri)
        NPC boss = this.getBoss();

        // Find swarms near the boss that need to be killed
        NPC targetSwarm = NPCs.getAll(npc ->
            npc.getName().equals(NPC_SCARAB_SWARM) &&
            !targetedSwarms.contains(npc) &&
            !npc.isDead() &&
            npc.distanceTo((Locatable) boss) > MAX_DISTANCE_FROM_BOSS
        )
        .stream()
        // Only target swarms in melee distance of the boss
        .filter(npc -> !boss.getWorldArea().isInMeleeDistance(npc.getWorldLocation()))
        // Find the swarm closest to our walking path
        .min(Comparator.comparingInt(npc ->
            npc.getWorldLocation().distanceToPath(this.client, Players.getLocal().getWorldLocation())
        ))
        .orElse(null);

        if (targetSwarm == null) {
            return false;
        }

        // Move closer if needed
        if (targetSwarm.distanceTo((Locatable) Players.getLocal()) > MOVEMENT_DISTANCE) {
            Movement.setDestination(targetSwarm.getWorldLocation());
            return true;
        }

        // Attack the swarm
        this.prepareAttack();
        targetSwarm.interact(INTERACTION_ATTACK);
        return false; // Return false to allow other tasks to run
    }
}
