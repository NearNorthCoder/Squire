package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * Handles automatic world hopping for Chambers of Xeric.
 * Hops to different worlds based on player count, location, and configuration.
 * Helps avoid crowded worlds and find suitable raid partners.
 */
@TaskDesc(name="Hopping to different world", priority=Integer.MAX_VALUE - 200, blocking=true, register=true)
public class HoppingToDifferentWorldTask extends CoxTaskBase {

    private World targetWorld;

    @Inject
    public HoppingToDifferentWorldTask(SquireChambersPlugin plugin, SquireChambersConfig config) {
        super(plugin, config);
    }

    @Override
    public boolean execute() {
        if (!config.enableHopping()) {
            return false;
        }

        if (Game.getState() != GameState.LOGGED_IN) {
            return false;
        }

        Log.info("Attempting to hop worlds...");

        World currentWorld = Worlds.getCurrentWorld();
        if (currentWorld == null) {
            Log.info("Could not get current world");
            return true;
        }

        // Check if we're already hopping
        if (targetWorld != null && currentWorld.getId() != targetWorld.getId()) {
            Log.info("Already hopping to world " + targetWorld.getId());
            return false;
        }

        World newWorld = findSuitableWorld(currentWorld);
        if (newWorld == null) {
            Log.info("No suitable world found");
            return true;
        }

        if (!Worlds.isHopperOpen()) {
            Log.info("Opening world hopper");
            Worlds.openHopper();
            return true;
        }

        this.targetWorld = newWorld;
        sleep(500);
        Worlds.hopTo(newWorld);
        Log.info("Hopping to world " + newWorld.getId());

        return true;
    }

    /**
     * Find a suitable world to hop to based on configuration and criteria
     */
    private World findSuitableWorld(World currentWorld) {
        String configWorlds = config.worldsHopping();

        // If specific worlds are configured, use those
        if (!configWorlds.isEmpty()) {
            String[] worldIds = configWorlds.split(",");
            return Worlds.getRandom(world ->
                world.getId() != currentWorld.getId() &&
                Stream.of(worldIds).anyMatch(id ->
                    String.valueOf(world.getId()).equals(id.trim())
                )
            );
        }

        // Try to find world with low player count in same location
        World lowPopWorld = Worlds.getRandom(world ->
            isValidWorldLowPop(currentWorld, world)
        );

        if (lowPopWorld != null) {
            return lowPopWorld;
        }

        // Try to find any world in same location
        World sameLocationWorld = Worlds.getRandom(world ->
            isValidWorldSameLocation(currentWorld, world)
        );

        if (sameLocationWorld != null) {
            return sameLocationWorld;
        }

        // Fallback: any valid world
        return Worlds.getRandom(world ->
            isValidWorld(currentWorld, world)
        );
    }

    /**
     * Check if world is valid with low population
     */
    private boolean isValidWorldLowPop(World currentWorld, World candidateWorld) {
        return candidateWorld.getId() != currentWorld.getId() &&
               candidateWorld.isNormal() &&
               candidateWorld.isMembers() &&
               Objects.equals(candidateWorld.getLocation(), currentWorld.getLocation()) &&
               candidateWorld.getPlayerCount() < 800;
    }

    /**
     * Check if world is valid in same location
     */
    private boolean isValidWorldSameLocation(World currentWorld, World candidateWorld) {
        return candidateWorld.getId() != currentWorld.getId() &&
               candidateWorld.isNormal() &&
               candidateWorld.isMembers() &&
               Objects.equals(candidateWorld.getLocation(), currentWorld.getLocation());
    }

    /**
     * Check if world is valid (any location)
     */
    private boolean isValidWorld(World currentWorld, World candidateWorld) {
        return candidateWorld.getId() != currentWorld.getId() &&
               candidateWorld.isNormal();
    }

    /**
     * Track current world when entering raid instance
     */
    @Subscribe
    private void onGameTick(GameTick event) {
        if (Static.getClient().isInInstancedRegion()) {
            this.targetWorld = Worlds.getCurrentWorld();
        }
    }
}
