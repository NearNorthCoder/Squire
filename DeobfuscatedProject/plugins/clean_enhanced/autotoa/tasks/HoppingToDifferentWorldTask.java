/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Objects;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Widgets;

/**
 * Handles world hopping for TOA raids.
 * This task automatically hops to different worlds based on configuration
 * to avoid crowded raids or find optimal world conditions.
 *
 * The task:
 * 1. Checks if hopping is enabled in config
 * 2. Validates current game state
 * 3. Selects an appropriate world based on criteria
 * 4. Performs the hop
 */
@TaskDesc(name="Hopping to different world", priority=1000, blocking=true, register=true)
public class HoppingToDifferentWorldTask extends TOAConfigurableTask {
    // Widget IDs
    private static final int LOGOUT_WIDGET_GROUP = 25343;       // 0x62FF - Logout panel
    private static final int PARTY_INTERFACE_WIDGET = 50594626; // 0x3042AC2 - Party interface
    private static final int MAX_WORLD_PLAYER_COUNT = 28255;    // 0x6E5F - Player count threshold

    // Sleep time before hopping
    private static final int HOP_DELAY_MS = 200;

    // Tracks the world we're hopping from
    private World previousWorld;

    @Inject
    protected HoppingToDifferentWorldTask(Client client, TOAConfig config) {
        super(client, config);
    }

    @Override
    public boolean validate() {
        // Check if hopping is disabled in config
        if (this.config.disableHopping()) {
            return false;
        }

        // Must be logged in to hop
        if (Game.getState() != GameState.LOGGED_IN) {
            return false;
        }

        // Don't hop if logout panel is open
        Widget logoutWidget = Widgets.get(LOGOUT_WIDGET_GROUP, 3);
        if (Widgets.isVisible(logoutWidget)) {
            return false;
        }

        // Don't hop if party interface is open
        Widget partyWidget = this.client.getWidget(PARTY_INTERFACE_WIDGET);
        if (Widgets.isVisible(partyWidget)) {
            return false;
        }

        // Don't hop while bank is open
        if (Bank.isOpen()) {
            return false;
        }

        // Check if we need to bank - if so, remember current world
        BankLoadout loadout = (BankLoadout) this.config.loadout().selected(BankLoadout.class);
        if (!loadout.needsToBank()) {
            this.previousWorld = Worlds.getCurrentWorld();
            return false;
        }

        Log.info("[HopTask] Need to hop");

        // Get current world
        World currentWorld = Worlds.getCurrentWorld();
        if (currentWorld == null) {
            Log.info("[HopTask] Cannot determine our current world");
            return true;
        }

        // Check if we already hopped (on different world than before)
        if (this.previousWorld != null && currentWorld.getId() != this.previousWorld.getId()) {
            Log.info("[HopTask] No need to hop since we are already on a different world");
            return false;
        }

        // Find a world to hop to
        World targetWorld = this.findWorldToHopTo(currentWorld);
        if (targetWorld == null) {
            Log.info("[HopTask] Failing to find a world to hop to??");
            return true;
        }

        // Open world hopper if not already open
        if (!Worlds.isHopperOpen()) {
            Log.info("[HopTask] World hopper is not open");
            Worlds.openHopper();
            return true;
        }

        // Perform the hop
        this.sleep(HOP_DELAY_MS);
        this.previousWorld = targetWorld;
        Worlds.hopTo(targetWorld);
        Log.info("[HopTask] We just hopped");

        return true;
    }

    /**
     * Finds an appropriate world to hop to based on configuration and criteria.
     *
     * @param currentWorld The current world
     * @return A suitable world to hop to, or null if none found
     */
    private World findWorldToHopTo(World currentWorld) {
        String worldsConfig = this.config.worldsHopping();

        // If specific worlds are configured, use those
        if (!worldsConfig.isEmpty()) {
            String[] configuredWorlds = worldsConfig.split(",");
            return Worlds.getRandom(world -> {
                // Must be different world and in the configured list
                return world.getId() != currentWorld.getId() &&
                       Stream.of(configuredWorlds).anyMatch(worldId ->
                           String.valueOf(world.getId()).equals(worldId));
            });
        }

        // Otherwise, find a world matching criteria
        // First try: Same location, members, normal world, low population
        World targetWorld = Worlds.getRandom(world ->
            this.isPreferredWorld(world, currentWorld));

        // Second try: Same location, members, normal world (any population)
        if (targetWorld == null) {
            targetWorld = Worlds.getRandom(world ->
                this.isAcceptableWorld(world, currentWorld));
        }

        // Third try: Just a normal members world
        if (targetWorld == null) {
            targetWorld = Worlds.getRandom(world ->
                this.isAnyNormalWorld(world, currentWorld));
        }

        return targetWorld;
    }

    /**
     * Checks if a world is preferred (low population, same location).
     */
    private boolean isPreferredWorld(World world, World currentWorld) {
        return world.getId() != currentWorld.getId() &&
               world.isNormal() &&
               world.isMembers() &&
               Objects.equals(world.getLocation(), currentWorld.getLocation()) &&
               world.getPlayerCount() < MAX_WORLD_PLAYER_COUNT;
    }

    /**
     * Checks if a world is acceptable (same location, any population).
     */
    private boolean isAcceptableWorld(World world, World currentWorld) {
        return world.getId() != currentWorld.getId() &&
               world.isNormal() &&
               world.isMembers() &&
               Objects.equals(world.getLocation(), currentWorld.getLocation());
    }

    /**
     * Checks if a world is any normal members world.
     */
    private boolean isAnyNormalWorld(World world, World currentWorld) {
        return world.getId() != currentWorld.getId() &&
               world.isNormal();
    }
}
