package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

/**
 * Handles moving to safe spots when specific boss attack graphics appear.
 * This task reacts to dangerous visual effects (graphics objects) and quickly
 * moves the player to predetermined safe locations to avoid damage.
 *
 * The task monitors for two types of attack graphics:
 * - Graphics ID 26812: Triggers movement to one safe spot (with 42 tick cooldown)
 * - Graphics ID (negative value): Triggers movement to an alternate spot (with 6 tick cooldown)
 */
@Singleton
@TaskDesc(name="Moving to safespot", priority=25, blocking=true, register=true)
public class MovingToSafespotTask extends AutotoaManager {

    // Graphics object IDs for different boss attacks
    private static final int GRAPHICS_ATTACK_TYPE_1 = 26812;
    private static final int GRAPHICS_ATTACK_TYPE_2 = (int)(short)0xCB1B; // -13541 as signed short

    // Safe spot coordinates (screen/local points)
    private static final Point SAFESPOT_PRIMARY = new Point(56, 37);    // Main safe spot
    private static final Point SAFESPOT_ALT_1 = new Point(30, 37);      // Alternative safe spot 1
    private static final Point SAFESPOT_ALT_2 = new Point(29, 34);      // Alternative safe spot 2

    // Cooldown values in game ticks
    private static final int SHORT_COOLDOWN_TICKS = 6;
    private static final int LONG_COOLDOWN_TICKS = 42;
    private static final int INITIAL_COOLDOWN = 4;

    // Current safe spot target and cooldown timer
    private Point currentSafespotTarget;
    private int cooldownTicksRemaining;

    @Inject
    protected MovingToSafespotTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.cooldownTicksRemaining = 0;
    }

    @Override
    public boolean bl() {
        // Calculate the world location from the primary safe spot point
        WorldPoint primarySafespotWorld = this.a(SAFESPOT_PRIMARY);
        WorldPoint destinationWorld;

        // If cooldown is active, decrement it
        if (this.cooldownTicksRemaining > 0) {
            this.cooldownTicksRemaining -= 1;

            // Check if we should return to primary spot after cooldown
            if (this.currentSafespotTarget == SAFESPOT_ALT_2 && this.cooldownTicksRemaining > INITIAL_COOLDOWN) {
                return false;
            }

            // Get the world location of the current target safe spot
            destinationWorld = this.a(this.currentSafespotTarget);
        } else {
            // Use primary safe spot when no cooldown
            destinationWorld = primarySafespotWorld;
        }

        // Already at the destination
        if (this.cu.getLocalPlayer().getWorldLocation().equals(destinationWorld)) {
            return false;
        }

        // Check if there's a game object blocking the safe spot
        // (e.g., rubble, debris, or other obstacles)
        boolean isBlocked = TileObjects.getAll(tileObject -> {
            if (tileObject instanceof GameObject) {
                return ((GameObject)tileObject).getWorldArea().contains(destinationWorld);
            }
            return false;
        }).size() > 0;

        if (isBlocked) {
            return false;
        }

        // Move to the safe spot
        Movement.setDestination(destinationWorld);
        return true;
    }

    /**
     * Listens for graphics objects being created (boss attack animations).
     * When a dangerous attack graphic appears at the player's location,
     * sets a cooldown timer and designates an appropriate safe spot.
     */
    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        // Ignore if we're already on cooldown
        if (this.cooldownTicksRemaining > this.cu.getTickCount()) {
            return;
        }

        int graphicsId = graphicsObjectCreated.getGraphicsObject().getId();
        WorldPoint graphicsLocation = WorldPoint.fromLocal(
            this.cu,
            graphicsObjectCreated.getGraphicsObject().getLocation()
        );

        // Check if the dangerous graphics spawned at the primary safe spot
        if ((graphicsId != GRAPHICS_ATTACK_TYPE_1 || graphicsId == GRAPHICS_ATTACK_TYPE_2) &&
            graphicsLocation.equals(this.a(SAFESPOT_PRIMARY))) {

            // Set cooldown and safe spot based on attack type
            if (graphicsId == GRAPHICS_ATTACK_TYPE_1) {
                this.cooldownTicksRemaining = SHORT_COOLDOWN_TICKS;
                this.currentSafespotTarget = SAFESPOT_ALT_1;
            } else {
                this.cooldownTicksRemaining = LONG_COOLDOWN_TICKS;
                this.currentSafespotTarget = SAFESPOT_ALT_2;
            }
        }
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    @Override
    public void r() {
        super.r();
        this.currentSafespotTarget = null;
        this.cooldownTicksRemaining = 0;
    }
}
