package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/**
 * Handles positioning for the TOA obelisk charging mechanic.
 * This task manages player movement when obelisks spawn and need to be charged.
 *
 * The mechanic works as follows:
 * - Before obelisk spawns: Stand at the RIGHT position (34, 34)
 * - After obelisk spawns: Move to the CHARGE position (34, 35)
 * - On player death: Reset and return to right position
 *
 * This ensures the player is optimally positioned to interact with the charging
 * obelisk as soon as it becomes available.
 */
@TaskDesc(name="Moving to right spot with charging", priority=100, register=true)
public class MovingToRightSpotWithChargingTask extends KephriManager {

    // Game object ID for the charging obelisk
    // Calculated from: -(0xFFFFBC2E & 0x4FDB) & (0xFFFFBEBF & 0xFFFF)
    private static final int CHARGING_OBELISK_ID = 0xB296; // 45718

    // Position coordinates
    private static final Point RIGHT_POSITION = new Point(34, 34);  // Stand here before obelisk spawns
    private static final Point CHARGE_POSITION = new Point(34, 35); // Move here when obelisk spawns

    // State tracking
    private boolean obeliskHasSpawned;

    @Inject
    protected MovingToRightSpotWithChargingTask(Client client, ToaPlugin plugin, TOAConfig tOAConfig) {
        super(client, plugin, tOAConfig);
        this.obeliskHasSpawned = false;
    }

    @Override
    protected boolean shouldExecute() {
        WorldPoint rightPositionWorld = this.a(RIGHT_POSITION);

        // If obelisk has spawned and we're already at the right position, no need to move
        if (this.obeliskHasSpawned && Players.getLocal().getWorldLocation().equals(rightPositionWorld)) {
            return false;
        }

        WorldPoint destinationWorld;

        if (this.obeliskHasSpawned) {
            // Obelisk has spawned - move to charge position
            destinationWorld = this.a(CHARGE_POSITION);

            // Already at charge position
            if (Players.getLocal().getWorldLocation().equals(destinationWorld)) {
                return false;
            }

            Movement.setDestination(destinationWorld);
            return true;
        } else {
            // Obelisk hasn't spawned yet - stand at right position
            // Already at right position
            if (Players.getLocal().getWorldLocation().equals(rightPositionWorld)) {
                return false;
            }

            Movement.setDestination(rightPositionWorld);
            return true;
        }
    }

    @Override
    public boolean bj() {
        // Check if an obelisk NPC exists with the "Attack" action
        // This determines if we should be executing this task
        return NPCs.getNearest(npc ->
            npc.getName().contains("Obelisk") &&
            npc.hasAction("Attack")
        ) != null;
    }

    @Override
    public boolean bn() {
        // This task does not block other tasks
        return false;
    }

    @Override
    protected boolean aS() {
        // Always allow this task to run
        return true;
    }

    @Override
    public void reset() {
        // Reset state when task is reset
        this.obeliskHasSpawned = false;
    }

    /**
     * Listens for the charging obelisk game object spawning.
     * When it spawns, update the state to trigger movement to charge position.
     */
    @Subscribe
    public void onGameObjectSpawned(GameObjectSpawned gameObjectSpawned) {
        if (gameObjectSpawned.getGameObject().getId() == CHARGING_OBELISK_ID) {
            this.obeliskHasSpawned = true;
        }
    }

    /**
     * Listens for player death to reset the obelisk state.
     * If the player dies, reset back to the initial state.
     */
    @Subscribe
    public void onActorDeath(ActorDeath actorDeath) {
        if (actorDeath.getActor().equals(Players.getLocal())) {
            this.obeliskHasSpawned = false;
        }
    }
}
