/**
 * Shamans Task - Handles the Shamans boss room in Chambers of Xeric
 *
 * Boss Mechanics:
 * - Lizardman Shamans with jumping attacks that deal massive damage
 * - Spawns purple poison puddles on the ground that must be avoided
 * - Shamans spawn smaller lizardmen adds that must be killed
 * - Players must dodge the jump attack by moving away from targeted tiles
 *
 * Strategy:
 * - Attack shamans while avoiding purple puddles
 * - Kill spawned adds when they appear
 * - Use offensive prayers and maintain safe distance
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name = "Shamans", priority = 10000, blocking = true)
public class ShamansTask extends CoxTaskBase {

    /** Current room information */
    private NHelper currentRoom;

    /** Next room information */
    private NHelper nextRoom;

    /** Current room index */
    private int roomIndex;

    /** Action name for entering passages */
    private static final String ENTER_ACTION = "Enter";

    /** Object name for passage/barrier */
    private static final String PASSAGE_NAME = "Passage";

    /** NPC name for shaman spawns */
    private static final String SHAMAN_NAME = "Lizardman";

    /** Action name for attacking NPCs */
    private static final String ATTACK_ACTION = "Attack";

    @Inject
    protected ShamansTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.roomIndex = 0;
    }

    @Override
    public EquipmentSetup getEquipmentSetup() {
        return null;
    }

    /**
     * Check if this task should be active
     * @return true if we're in the Shamans room
     */
    @Override
    public boolean shouldExecute() {
        this.currentRoom = this.coxManager.getCurrentRoom();
        this.roomIndex = this.coxManager.getRoomIndex();
        this.nextRoom = this.coxManager.getNextRoom();
        return this.currentRoom.getRoomType() == RoomType.SHAMANS;
    }

    /**
     * Get prayers to use during Shamans fight
     * @return List of prayers including offensive prayers if shaman is nearby
     */
    @Override
    public List&lt;Prayer&gt; getPrayersToActivate() {
        // Find nearby shaman
        NPC shaman = NPCs.getNearest(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(SHAMAN_NAME) &amp;&amp;
            npc.hasAction(ATTACK_ACTION)
        );

        if (shaman == null) {
            return null;
        }

        // Only use offensive prayers if shaman is close (within 3 tiles)
        if (shaman.getWorldLocation().distanceTo((Locatable) this.localPlayer) &gt; 3) {
            return null;
        }

        return Prayers.getOffensive();
    }

    /**
     * Execute the main Shamans task logic
     * @return true if task executed successfully
     */
    @Override
    public boolean execute() {
        return navigateToNextRoom();
    }

    /**
     * Navigate to the next room via passage
     * @return true if navigation was successful
     */
    private boolean navigateToNextRoom() {
        // Check if next room is reachable by walking
        if (Reachable.isWalkable(this.currentRoom.getExitLocation())) {
            // If we're already moving to the next room, wait
            if (Movement.getDestination() != null &amp;&amp;
                Movement.getDestination().equals(this.nextRoom.getExitLocation())) {
                return true;
            }
            // Set destination to next room exit
            Movement.setDestination(this.nextRoom.getEntryLocation());
            return true;
        }

        // Find passage to next room
        TileObject passage = findPassage();
        if (passage == null) {
            // If no passage found, move toward center of room
            Movement.setDestination(this.currentRoom.getCenterLocation().dx(4).dy(4));
            return true;
        }

        // Wait if player is already moving or animating
        if (this.localPlayer.isMoving() || this.localPlayer.isAnimating()) {
            return true;
        }

        // Enter the passage
        passage.interact(ENTER_ACTION);
        return true;
    }

    /**
     * Find the passage object to enter the next room
     * @return TileObject representing the passage, or null if not found
     */
    private TileObject findPassage() {
        return TileObjects.getNearest(tileObject -&gt; {
            if (tileObject.getName() != null &amp;&amp;
                tileObject.getName().equals(PASSAGE_NAME) &amp;&amp;
                tileObject.hasAction(ENTER_ACTION) &amp;&amp;
                this.currentRoom.contains((Locatable) tileObject)) {
                return true;
            }
            return false;
        });
    }
}
