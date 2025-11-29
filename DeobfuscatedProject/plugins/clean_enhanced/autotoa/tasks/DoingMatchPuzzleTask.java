package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;

/**
 * Handles solving the symbol matching puzzle in Tombs of Amascut.
 *
 * This puzzle requires the player to activate matching symbol tiles on the floor.
 * The bot finds the closest symbol tile and activates it, prioritizing by ID
 * (matching symbols have the same ID) and then by distance.
 */
@TaskDesc(name="Doing match puzzle", priority=50, blocking=true)
public class DoingMatchPuzzleTask extends KephriManager {

    @Inject
    protected DoingMatchPuzzleTask(Client client, PuzzleStateManager stateManager, TOAConfig config, PuzzlePathfinder pathfinder) {
        super(client, stateManager, config, pathfinder);
    }

    /**
     * Gets the nearest symbol tile that needs to be activated.
     *
     * Symbols are GroundObjects with an "Activate" action. The method finds
     * the closest symbol, prioritizing by object ID (to match pairs) and
     * then by distance to the player.
     *
     * @return The nearest symbol GroundObject, or null if none found
     */
    public GroundObject getNearestSymbol() {
        List<TileObject> symbols = TileObjects.getAll(tile -> tile.hasAction("Activate"));

        TileObject nearest = symbols.stream()
            .min(Comparator.comparingInt(TileObject::getId)
                          .thenComparingInt(tile -> tile.getWorldLocation().distanceTo(Players.getLocal())))
            .orElse(null);

        if (nearest instanceof GroundObject) {
            return (GroundObject) nearest;
        }

        return null;
    }

    /**
     * Checks if the puzzle is accessible - i.e., if any symbol tiles are reachable.
     */
    @Override
    public boolean isAccessible() {
        return TileObjects.getAll("Symbol").stream().anyMatch(Reachable::isInteractable);
    }

    /**
     * Executes the puzzle by activating the nearest symbol.
     */
    @Override
    public boolean execute() {
        GroundObject symbol = this.getNearestSymbol();
        if (symbol == null) {
            return false;
        }

        symbol.interact("Activate");
        return true;
    }

    /**
     * Returns the X coordinate for pathfinding purposes.
     */
    @Override
    public int getTargetX() {
        GroundObject symbol = this.getNearestSymbol();
        if (symbol == null) {
            return 0;
        }
        return symbol.getWorldX();
    }

    /**
     * Checks if the puzzle is active - returns true if any symbols exist.
     */
    @Override
    public boolean isActive() {
        return this.getNearestSymbol() != null;
    }
}
