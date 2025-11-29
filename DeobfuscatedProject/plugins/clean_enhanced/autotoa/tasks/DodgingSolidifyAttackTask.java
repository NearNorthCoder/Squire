/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Solidify Attack Task - Handles dodging the "Solidify" special attack
 * This attack freezes the player in place and deals damage. The task detects
 * the projectile spawn and immediately moves the player one tile to avoid it.
 * Appears in Akkha and possibly Zebak encounters.
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodging Solidify Attack", priority=30, blocking=true, register=true)
public class DodgingSolidifyAttackTask extends AutotoaManager {

    // Projectile ID for the Solidify attack
    private static final int SOLIDIFY_PROJECTILE_ID = 24486;  // -(0xFFFFFFF7 & 0x570D) & (0xFFFFFFFF & 0x5FA6)

    // Constants
    private static final int TRUE = 1;
    private static final int FALSE = 0;
    private static final int SLEEP_DURATION = 2;

    // Track where the solidify projectile was spawned
    private WorldPoint solidifySpawnLocation;

    @Inject
    private Sleeper sleeper;

    @Inject
    protected DodgingSolidifyAttackTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Listen for the solidify projectile spawn
     */
    @Subscribe
    public void onProjectileSpawned(ProjectileSpawned event) {
        if (event.getProjectile().getId() == SOLIDIFY_PROJECTILE_ID) {
            // Store the location where the projectile was spawned (player's current location)
            this.solidifySpawnLocation = Players.getLocal().getWorldLocation();
        }
    }

    @Override
    public void reset() {
        this.solidifySpawnLocation = null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        return null;
    }

    /**
     * Main task validation logic
     * Moves player one tile north if solidify projectile is active
     */
    @Override
    public boolean validate() {
        // Check if solidify projectile is currently in the air
        int[] projectileIds = new int[TRUE];
        projectileIds[0] = SOLIDIFY_PROJECTILE_ID;

        if (Projectiles.getAll(projectileIds).isEmpty()) {
            this.solidifySpawnLocation = null;
            return false;
        }

        // If we have a spawn location recorded and player is still on it, move
        if (this.solidifySpawnLocation != null) {
            WorldPoint destinationTile = this.solidifySpawnLocation.dy(TRUE);

            if (!destinationTile.equals(Players.getLocal().getWorldLocation())) {
                Movement.setDestination(destinationTile);
                this.sleeper.sleep(SLEEP_DURATION);
                this.solidifySpawnLocation = null;
                return true;
            }
        }

        return false;
    }
}
