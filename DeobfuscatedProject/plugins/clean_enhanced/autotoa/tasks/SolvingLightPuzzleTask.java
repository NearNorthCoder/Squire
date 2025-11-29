package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/**
 * Handles solving the light beam puzzle in Tombs of Amascut.
 *
 * This puzzle involves rotating mirrors to direct light beams to specific targets.
 * The bot mines light crystals, places them in mirror pedestals, and rotates mirrors
 * to complete the light paths. Fire damage from the puzzle requires food management.
 */
@TaskDesc(name="Solving Light Puzzle", register=true)
public class SolvingLightPuzzleTask extends AutotoaManager {

    // NPC IDs
    private static final int NPC_OBELISK_INACTIVE = 11700; // 0x2DB4 based light reflection crystal
    private static final int NPC_OBELISK_ACTIVE = 11696; // 0x2DB0 active obelisk
    private static final int OBELISK_ANIMATION_ID = 9; // Animation when obelisk activates

    // Object IDs
    private static final int OBJECT_LIGHT_CRYSTAL = 27766; // 0x6C76 - Light crystal on ground
    private static final int OBJECT_MIRROR_PEDESTAL = 28607; // 0x6FBF - Empty pedestal for mirror
    private static final int OBJECT_MIRROR = 27711; // 0x6C3F - Placed mirror

    // Graphics object IDs for fire damage
    private static final Set<Integer> FIRE_GRAPHICS = Set.of(27595, 28094, 3166);

    private boolean hasMinedCrystal;
    private int nextFireDamageTick;

    @Inject
    protected SolvingLightPuzzleTask(Client client, PuzzleStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
        this.nextFireDamageTick = -1;
    }

    /**
     * Main execution logic for the light puzzle.
     *
     * Priority order:
     * 1. Destroy inactive obelisk if no mirrors placed
     * 2. Break blocking mirrors that aren't needed
     * 3. Rotate mirrors to correct orientations
     * 4. Mine light crystals if inventory is low
     * 5. Place crystals in pedestals
     */
    @Override
    public boolean execute() {
        NPC obelisk = NPCs.getNearest(NPC_OBELISK_INACTIVE);
        if (obelisk != null) {
            if (TileObjects.getAll("Mirror").isEmpty()) {
                if (!Players.getLocal().isAnimating()) {
                    this.interact(obelisk, "Destroy", 150);
                }
                return true;
            }
        }

        this.hasMinedCrystal = false;
        LightPuzzleRoom room = LightPuzzleRoom.getCurrentRoom();
        if (room == null) {
            return false;
        }

        Log.info("Room {}", room);
        Log.info("Next fire tick {} - current {}", this.nextFireDamageTick, this.client.getTickCount());

        // Drop food if inventory is full
        if (Inventory.isFull()) {
            Item food = Inventory.getFirst(item -> item.hasAction("Eat"::equals));
            Log.info("food {}", food);
            if (food != null) {
                food.interact("Drop");
                return true;
            }

            Item potion = Inventory.getFirst(item -> item.hasAction("Drink"::equals));
            Log.info("other {}", potion);
            if (potion != null) {
                potion.interact("Drop");
                return true;
            }
        }

        // Break blocking mirrors that need to be removed
        for (Point mirrorPos : room.getMirrorsToBreak()) {
            WorldPoint mirrorWorld = room.toWorldPoint(mirrorPos);
            TileObject blockingMirror = TileObjects.getNearest(tile ->
                tile.hasAction("Break") && tile.getWorldLocation().equals(mirrorWorld));

            if (blockingMirror != null) {
                blockingMirror.interact("Break");
                this.sleep(150);
                return true;
            }
        }

        // Rotate mirrors to correct orientations
        WorldPoint targetMirror = null;
        int wrongMirrorCount = 0;

        ArrayList<Point> mirrorPositions = new ArrayList<>(room.getRequiredMirrors().keySet());
        mirrorPositions.sort(Comparator.comparingInt(point -> Math.abs(point.y - 7))); // Sort by Y coordinate

        for (Point mirrorPos : mirrorPositions) {
            WorldPoint mirrorWorld = room.toWorldPoint(mirrorPos);
            TileObject mirror = TileObjects.getNearest(tile ->
                tile.getName().equals("Mirror") && tile.getWorldLocation().equals(mirrorWorld));

            if (mirror != null) {
                int currentOrientation = ((GameObject) mirror).getOrientation();
                int requiredOrientation = room.getRequiredMirrors().get(mirrorPos);

                if (currentOrientation == requiredOrientation) {
                    continue;
                }
            }

            wrongMirrorCount++;
            targetMirror = mirrorWorld;
        }

        // If all mirrors are correctly placed, destroy the obelisk
        if (targetMirror == null) {
            Log.info("Next null, walking/mining");
            NPC activeObelisk = NPCs.getNearest(NPC_OBELISK_ACTIVE);

            if (this.client.getTickCount() == this.nextFireDamageTick - 1 && activeObelisk != null) {
                activeObelisk.interact("Destroy");
                return true;
            }

            if (activeObelisk != null && !Players.getLocal().isMoving()) {
                Point safeSpot = room.getSafeWalkingSpot();
                if (safeSpot == null) {
                    return false;
                }
                Movement.setDestination(room.toWorldPoint(safeSpot));
            }
            return false;
        }

        // Rotate the target mirror
        WorldPoint mirrorLocation = targetMirror;
        GameObject mirrorObject = (GameObject) TileObjects.getNearest(tile ->
            tile.getId() == OBJECT_MIRROR && tile.getWorldLocation().equals(mirrorLocation));

        if (mirrorObject != null) {
            // Only rotate if we have more than 1 wrong mirror OR enough time has passed
            if (wrongMirrorCount <= 1 || Math.abs(this.client.getTickCount() - this.nextFireDamageTick) > 2) {
                mirrorObject.interact("Rotate-clockwise");
            }
            return true;
        }

        // Mine light crystals if we don't have enough
        if (Inventory.getCount(OBJECT_LIGHT_CRYSTAL) < wrongMirrorCount) {
            TileObject crystal = TileObjects.getAll(OBJECT_MIRROR_PEDESTAL).stream()
                .filter(tile -> !room.isInPuzzleArea(tile.getWorldLocation()))
                .min(Comparator.comparingInt(tile ->
                    tile.getWorldLocation().distanceTo(this.client.getLocalPlayer())))
                .orElse(null);

            if (crystal == null) {
                return false;
            }

            crystal.interact("Pick-up");
            return true;
        }

        // Place crystal in pedestal
        if (!Players.getLocal().getWorldLocation().equals(targetMirror)) {
            Movement.setDestination(targetMirror);
        } else {
            Inventory.getFirst(OBJECT_LIGHT_CRYSTAL).interact("Place");
        }

        return true;
    }

    /**
     * Triggered when player takes mining damage (from mining crystals).
     */
    @Subscribe
    public void onStatChanged(StatChanged event) {
        if (event.getSkill() == Skill.MINING) {
            this.hasMinedCrystal = true;
        }
    }

    /**
     * Tracks fire damage graphics to predict next fire tick.
     */
    @Subscribe
    public void onGraphicsObjectCreated(GraphicsObjectCreated event) {
        if (FIRE_GRAPHICS.contains(event.getGraphicsObject().getId())) {
            this.nextFireDamageTick = this.client.getTickCount() + OBELISK_ANIMATION_ID;
        }
    }

    /**
     * Tracks obelisk state changes between active and inactive.
     */
    @Subscribe
    public void onNpcChanged(NpcChanged event) {
        if (event.getOld().getId() == NPC_OBELISK_INACTIVE &&
            event.getNpc().getId() == NPC_OBELISK_ACTIVE) {
            this.nextFireDamageTick = this.client.getTickCount() + OBELISK_ANIMATION_ID + 1;
        } else if (event.getOld().getId() == NPC_OBELISK_ACTIVE &&
                   event.getNpc().getId() == NPC_OBELISK_INACTIVE) {
            this.nextFireDamageTick = -1;
        }
    }
}
