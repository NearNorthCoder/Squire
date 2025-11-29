package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

import java.util.List;

/**
 * Task for collecting seeds from resource nodes during Chambers of Xeric preparation.
 *
 * Players gather seeds (Noxifer, Golpar, Buchu) from cavern grubs or resource nodes.
 * These seeds are then planted in farming patches to grow herbs for potion making.
 * The task handles navigation between floors and resource collection.
 */
@TaskDesc(name="Prep Get Seeds", priority=21020, blocking=true)
public class PrepGetSeedsTask extends CoxManager {

    // Item IDs
    private static final int[] SEEDS = {20894, 20896, 20892}; // Noxifer, Golpar, Buchu seeds
    private static final int CAVERN_GRUB = 30032; // Resource node for seeds

    // Required seed count
    private static final int REQUIRED_SEEDS = 3;

    // Room navigation points
    private RoomPoint seedResourcePoint;
    private RoomPoint ladderPoint;

    @Inject
    protected PrepGetSeedsTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public boolean validate() {
        // Only run when on the correct floor
        if (this.player.getPlane() != 0) {
            return false;
        }

        // Don't collect if we already have enough seeds
        if (Inventory.contains(SEEDS)) {
            return false;
        }

        // Initialize room data
        this.currentRoom = this.plugin.getCurrentRoom();
        this.targetRoom = this.plugin.getTargetRoom();
        this.startRoom = this.plugin.getStartRoom();
        this.seedResourcePoint = getSeedResourceLocation();
        this.ladderPoint = getLadderLocation();

        // Check if we're in the farming room or need to navigate
        if (this.currentRoom.roomType != RoomType.FARMING && this.currentRoom.roomType != RoomType.END) {
            return true;
        }

        return false;
    }

    @Override
    public int execute() {
        // Check if we've reached the bottom floor
        if (hasReachedBottom()) {
            return -1;
        }

        // If we have enough seeds, handle any extra seeds
        if (Inventory.getCount(true, SEEDS) >= REQUIRED_SEEDS) {
            if (this.currentRoom.roomType == RoomType.FARMING) {
                // Drop extra seeds if we have them
                if (Inventory.contains(CAVERN_GRUB)) {
                    Inventory.dropAll(CAVERN_GRUB);
                }
                return -1;
            }

            // Navigate to farming room
            if (Reachable.isWalkable(this.seedResourcePoint.location)) {
                Movement.setDestination(this.seedResourcePoint.location.dx(5).dy(5));
                return 600;
            }

            // Use ladder to navigate
            TileObject ladder = findLadder();
            if (ladder == null) {
                Movement.setDestination(this.ladderPoint.position);
                return 600;
            }

            if (!this.player.isMoving() && !this.player.isAnimating()) {
                ladder.interact("Climb-down");
            }
            return 600;
        }

        // If we're in farming room, navigate back to start
        if (this.currentRoom.roomType == RoomType.FARMING) {
            Movement.setDestination(this.startRoom.position);
            return 600;
        }

        // Find and collect from cavern grub
        TileObject cavernGrub = TileObjects.getNearest(tileObject -> {
            if (tileObject.getName().contains("Cavern grub")) {
                if (tileObject.hasAction("Collect")) {
                    return true;
                }
            }
            return false;
        });

        if (cavernGrub == null || !Reachable.isInteractable(cavernGrub)) {
            // Use ladder if can't reach grub
            TileObject ladder = findLadder();
            if (ladder == null) {
                Movement.setDestination(this.ladderPoint.position);
                return 600;
            }

            if (!this.player.isMoving() && !this.player.isAnimating()) {
                ladder.interact("Climb-up");
            }
            return 600;
        }

        // Collect seeds from grub
        if (!this.player.isMoving() && !this.player.isAnimating()) {
            cavernGrub.interact("Collect");
        }
        return 600;
    }

    /**
     * Finds a ladder object for floor navigation within the current room.
     */
    private TileObject findLadder() {
        return TileObjects.getNearest(tileObject -> {
            if (tileObject.getName().equals("Ladder")) {
                if (tileObject.hasAction("Climb-down") && this.currentRoom.isInRoom(tileObject)) {
                    return true;
                }
            }
            return false;
        });
    }

    /**
     * Gets the seed resource location from room layout.
     */
    private RoomPoint getSeedResourceLocation() {
        List<RoomPoint> points = this.plugin.getRoomPoints();
        return points.get(points.size() - 6);
    }

    /**
     * Gets the ladder location from room layout.
     */
    private RoomPoint getLadderLocation() {
        List<RoomPoint> points = this.plugin.getRoomPoints();
        return points.get(points.size() - 1);
    }
}
