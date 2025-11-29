/*
 * Decompiled with CFR 0.152.
 *
 * Dodging UFOs Task - Handles dodging UFO-like floating objects
 * These are circular damage zones that appear on the ground
 * Commonly seen in Akkha encounter and possibly other bosses
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Dodging ufos", priority=100)
public class DodgingUfosTask extends KephriManager {

    // Constants
    private static final int FALSE = 0;
    private static final int SEARCH_AREA_SIZE = 7;  // 0x6A ^ 0x16 ^ (0x44 ^ 0x3D)
    private static final int TRUE = 1;

    @Inject
    protected DodgingUfosTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Main task validation logic
     * Detects UFO damage zones and moves player to safety
     */
    @Override
    public boolean validate() {
        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Find nearest UFO that the player is standing in
        TileObject ufo = TileObjects.getNearest(tileObject -> {
            // Check if this is a UFO object and if player is in its area
            if (this.isUfoObject(tileObject.getId()) &&
                ((GameObject) tileObject).getWorldArea().contains(playerLocation)) {
                return true;
            }
            return false;
        });

        // Not standing in a UFO
        if (ufo == null) {
            return false;
        }

        // Find safe tile outside all UFO zones
        WorldPoint safeTile = this.createWorldArea(SEARCH_AREA_SIZE).toWorldPointList().stream()
            // Filter out tiles that are in any UFO zone
            .filter(tile -> {
                TileObject nearestUfo = TileObjects.getNearest(tileObject -> {
                    if (this.isUfoObject(tileObject.getId()) &&
                        ((GameObject) tileObject).getWorldArea().contains(tile)) {
                        return true;
                    }
                    return false;
                });
                return nearestUfo == null;  // Tile is safe if no UFO contains it
            })
            // Only walkable tiles
            .filter(Reachable::isWalkable)
            // Find closest safe tile
            .min(Comparator.comparingInt(tile -> tile.distanceTo(playerLocation)))
            .orElse(null);

        if (safeTile == null) {
            return false;
        }

        Movement.setDestination(safeTile);
        return true;
    }
}
