package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.HashSet;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.StatChanged;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/**
 * Task for attacking energy siphon skulls during Akkha boss fight in TOA.
 *
 * This task:
 * - Detects when energy siphons (skulls) spawn
 * - Positions player optimally to attack skulls
 * - Tracks which skulls have been damaged
 * - Moves to safe positions when needed
 * - Handles Akkha's special attack mechanics
 */
@TaskDesc(name = "Attacking skulls", priority = 100, blocking = true, register = true)
public class AttackingSkullsTask extends AutotoaManager {
    private static final int ENERGY_SIPHON_ID = 11714; // Energy siphon NPC ID
    private static final int RAID_LEVEL_1 = 14065; // Raid level check 1
    private static final int RAID_LEVEL_2 = 14068; // Raid level check 2

    // Optimal attack positions (relative to room)
    private static final Point POSITION_1 = new Point(23, 16); // Center position
    private static final Point POSITION_2 = new Point(30, 27); // North position
    private static final Point POSITION_SAFE = new Point(34, 27); // Safe fallback position

    private boolean isMovingToPosition;
    private int skullSpawnTick;
    private Set<NPC> damagedSkulls; // Track skulls we've already damaged
    private NPC currentTarget;

    @Inject
    protected AttackingSkullsTask(Client client, RaidStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
        this.damagedSkulls = new HashSet<>();
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getNormalGear() {
        return config.skullsGear();
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getSpecialGear() {
        return null;
    }

    @Override
    public void reset() {
        super.reset();
        this.damagedSkulls.clear();
    }

    @Override
    public boolean shouldExecute() {
        // Reset if not in correct raid state
        if (getCurrentRaidLevel() != RAID_LEVEL_1 && getCurrentRaidLevel() == RAID_LEVEL_2) {
            resetPrayers();
        }

        // Reset movement flag when we finish moving
        if (isInSpecialAttack()) {
            this.isMovingToPosition = false;
        }

        // Handle movement sequence
        if (this.isMovingToPosition) {
            if (!Players.getLocal().isMoving()) {
                this.isMovingToPosition = false;
            }
            return this.isMovingToPosition;
        }

        // Find nearest undamaged skull
        WorldPoint centerPosition = convertToWorldPoint(POSITION_1);
        NPC nearestSkull = NPCs.getNearest(centerPosition, npc -> {
            return npc.getId() == ENERGY_SIPHON_ID &&
                   !this.damagedSkulls.contains(npc) &&
                   !npc.isDead();
        });

        // Handle special attack positioning
        if (isInSpecialAttack()) {
            if (nearestSkull == null) {
                // Move to safe position if no skulls left
                WorldPoint attackPosition = convertToWorldPoint(new Point(32, 20));
                if (!Players.getLocal().getWorldLocation().equals(attackPosition) &&
                    attackPosition.distanceTo(Players.getLocal()) > 0) {
                    if (!getPoisonSplats().contains(attackPosition)) {
                        return true;
                    }
                    Movement.setDestination(attackPosition);
                }
                return true;
            }

            // Move to center position for special attack
            WorldPoint safePosition = convertToWorldPoint(POSITION_2);
            if (!Players.getLocal().getWorldLocation().equals(safePosition)) {
                if (!getPoisonSplats().contains(safePosition)) {
                    return true;
                }
                Movement.setDestination(safePosition);
            }
            return true;
        }

        // No skulls found - check for any remaining
        if (nearestSkull == null) {
            nearestSkull = NPCs.getNearest(npc -> {
                return npc.getId() == ENERGY_SIPHON_ID && !npc.isDead();
            });

            if (nearestSkull == null) {
                // All skulls dead, check if more will spawn
                if (NPCs.getNearest(ENERGY_SIPHON_ID) == null) {
                    // Move to position and wait
                    WorldPoint waitPosition = convertToWorldPoint(new Point(32, 20));
                    if (waitPosition.distanceTo(Players.getLocal()) > 0 && isInSpecialAttack()) {
                        Movement.setDestination(waitPosition);
                        return true;
                    }
                    return false;
                }

                // Position for next wave
                WorldPoint nextPosition = convertToWorldPoint(new Point(32, 20));
                if (nextPosition.distanceTo(Players.getLocal()) > 0) {
                    Movement.setDestination(nextPosition);
                    return true;
                }
                return false;
            }

            // Reset damaged skulls tracker for new wave
            this.damagedSkulls.clear();
        }

        // Attack the skull
        nearestSkull.interact("Attack");
        this.currentTarget = nearestSkull;
        return true;
    }

    @Override
    public boolean isActive() {
        // Task is active if:
        // 1. Energy siphon exists
        // 2. Warden has attack action (in combat)
        // 3. Recently spawned (within time window)

        if (NPCs.getNearest("Core") != null) {
            return true;
        }

        NPC warden = NPCs.getNearest(npc -> {
            return npc.getName().contains("Warden") &&
                   npc.hasAction("Attack");
        });

        if (warden != null) {
            return true;
        }

        // Check if within spawn window
        int ticksSinceSpawn = client.getTickCount() - this.skullSpawnTick;
        return ticksSinceSpawn < 29;
    }

    @Subscribe
    public void onNpcSpawned(NpcSpawned event) {
        if (event.getNpc().getId() == ENERGY_SIPHON_ID) {
            this.skullSpawnTick = client.getTickCount();
        }
    }

    @Subscribe
    public void onNpcDespawned(NpcDespawned event) {
        if (event.getNpc().getId() == ENERGY_SIPHON_ID) {
            Log.info("Energy siphon despawned");
            // Move to safe position
            Movement.setDestination(convertToWorldPoint(POSITION_SAFE));
            this.isMovingToPosition = true;
        }
    }

    @Subscribe
    public void onStatChanged(StatChanged event) {
        // Track when we damage a skull (hitpoints XP gained)
        if (this.currentTarget == null) {
            return;
        }

        if (event.getSkill() == Skill.HITPOINTS) {
            return;
        }

        // Mark this skull as damaged
        this.damagedSkulls.add(this.currentTarget);
    }
}
