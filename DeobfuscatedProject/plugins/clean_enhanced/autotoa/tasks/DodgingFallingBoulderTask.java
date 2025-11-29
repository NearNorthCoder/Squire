/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Falling Boulder Task - Handles dodging falling boulders in TOA
 * This task detects boulder graphics on the ground and moves the player to safety
 * Falling boulders appear in the Ba-Ba encounter
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodging falling boulder", priority=5)
public class DodgingFallingBoulderTask extends KephriManager {

    // Graphics ID for falling boulder warning
    private static final int BOULDER_GRAPHIC_ID = 30407;  // -(0xFFFFCBB7 & 0x7779) & (0xFFFFCBFF & 0x7FFB)

    // Boulder animation frame threshold
    private static final int BOULDER_FRAME_THRESHOLD = 45;  // 0x8E ^ 0xA3

    // Constants
    private static final int FALSE = 0;
    private static final int TRUE = 1;
    private static final int MOVE_OFFSET = -1;

    @Inject
    protected DodgingFallingBoulderTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Main task validation logic
     * Detects falling boulder graphics and moves player one tile to safety
     */
    @Override
    public boolean validate() {
        NPC baba = this.getBaBa();

        // Only dodge boulders during Ba-Ba fight when player is in range
        if (baba == null || baba.getWorldArea().contains(Players.getLocal())) {
            return false;
        }

        boolean needsDodge = false;
        Iterator<GraphicsObject> graphicsIterator = this.client.getGraphicsObjects().iterator();

        while (graphicsIterator.hasNext()) {
            GraphicsObject graphicsObject = graphicsIterator.next();
            WorldPoint graphicLocation = WorldPoint.fromLocal(this.client, graphicsObject.getLocation());

            // Skip if not a boulder graphic
            if (graphicsObject.getId() != BOULDER_GRAPHIC_ID) {
                continue;
            }

            // Skip if boulder animation is too advanced (already falling/landed)
            if (graphicsObject.getFrame() > BOULDER_FRAME_THRESHOLD) {
                continue;
            }

            // Check if player is standing on the boulder landing zone
            if (graphicLocation.equals(Players.getLocal().getWorldLocation())) {
                needsDodge = true;
                break;
            }
        }

        // If standing on a boulder landing zone, move one tile east
        if (needsDodge) {
            WorldPoint safeTile = Players.getLocal().getWorldLocation().dx(MOVE_OFFSET);
            Movement.setDestination(safeTile);
            return true;
        }

        return false;
    }
}
