/*
 * Deobfuscated from gg.squire.basics.combat.RingOfLife.RingOfLife
 *
 * Automatically teleports when health drops below threshold.
 * Can optionally log out the player after teleporting.
 */
package gg.squire.basics.combat.RingOfLife;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.Squire;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.H;
import i.i.b.s.c.q.r.s.s.-.u.a.e.I;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;

/**
 * Ring of Life plugin that automatically teleports when health is low.
 *
 * Features:
 * - Teleports when health drops below configured threshold
 * - Supports teleport spells or teleport items
 * - Can automatically log out after teleporting
 * - Tracks player location changes to detect successful teleport
 */
@PluginDescriptor(
    name = "Squire Ring Of Life",
    description = "Auto teleports at hp",
    enabledByDefault = false
)
@SquireUtil
public class RingOfLife extends SquirePlugin {

    private static final String LOG_MESSAGE = "RoL Triggered, Stopping script and logging out";
    private static final String TELEPORT_ACTION_BREAK = "Break";
    private static final String TELEPORT_ACTION_RUB = "Rub";
    private static final String TELEPORT_ACTION_COMMUNE = "Commune";
    private static final String FALLBACK_TELEPORT_MESSAGE = "No valid teleport found, using first available teleport item";

    @Inject
    private RingOfLifeConfig config;

    private WorldPoint locationBeforeTeleport;
    private boolean hasTeleported;
    private boolean hasTriggered;

    @Override
    protected Class<?>[] tasks() {
        return new Class[0];
    }

    @Provides
    RingOfLifeConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(RingOfLifeConfig.class);
    }

    @Override
    protected void onStart() {
    }

    @Override
    protected void onStop() {
    }

    /**
     * Main game tick handler that monitors health and triggers teleport.
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Player player = Players.getLocal();
        if (player == null) {
            return;
        }

        // Reset trigger if health goes back above threshold
        if (Combat.getCurrentHealth() > config.teleHP()) {
            hasTriggered = false;
        }

        // Log out if trigger has been activated and configured to do so
        if (hasTriggered && config.logOutOnTrigger()) {
            Log.info(LOG_MESSAGE);
            Squire.stop();
        }

        WorldPoint currentLocation = player.getWorldLocation();

        // Trigger teleport if health is at or below threshold and not already triggered
        if (Combat.getCurrentHealth() <= config.teleHP() && !hasTriggered) {
            hasTeleported = true;
            locationBeforeTeleport = currentLocation;

            // Use configured teleport type
            if (config.teleportType() == I.SPELL && Magic.canCast(config.teleportSpell().getSpell())) {
                Magic.cast(config.teleportSpell().getSpell());
            } else if (Inventory.contains(config.teleportItem().av()) || Equipment.contains(config.teleportItem().av())) {
                performItemTeleport(config.teleportItem());
            } else {
                // Fallback: try any available teleport item
                attemptFallbackTeleport();
            }
        }

        // Detect successful teleport by region change
        if (locationBeforeTeleport != null
                && currentLocation.getRegionID() != locationBeforeTeleport.getRegionID()
                && hasTeleported) {
            hasTriggered = true;
            hasTeleported = false;
            locationBeforeTeleport = currentLocation;
        }
    }

    /**
     * Performs teleport using a configured teleport item.
     */
    private void performItemTeleport(H teleportItem) {
        // If item needs to be worn first
        if (teleportItem.aw() && !Equipment.contains(teleportItem.av()) && Inventory.contains(teleportItem.av())) {
            Inventory.getFirst(teleportItem.av()).interact(TELEPORT_ACTION_BREAK, TELEPORT_ACTION_RUB, TELEPORT_ACTION_COMMUNE);
        }

        // Use from equipment if worn
        if (Equipment.contains(teleportItem.av())) {
            Equipment.getFirst(teleportItem.av()).interact(teleportItem.au());
        }

        // Use from inventory
        if (Inventory.contains(teleportItem.av())) {
            Inventory.getFirst(teleportItem.av()).interact(teleportItem.au());
        }
    }

    /**
     * Attempts to use any available teleport item as fallback.
     */
    private void attemptFallbackTeleport() {
        for (H teleportItem : H.values()) {
            if (Equipment.contains(teleportItem.av()) || Inventory.contains(teleportItem.av())) {
                if (Equipment.contains(teleportItem.av())) {
                    Equipment.getFirst(teleportItem.av()).interact(teleportItem.au());
                } else {
                    Inventory.getFirst(teleportItem.av()).interact(teleportItem.au());
                }
                Log.info(FALLBACK_TELEPORT_MESSAGE);
                return;
            }
        }
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == GameState.LOADING) {
            return;
        }

        // Reset teleport state after loading
        if (hasTeleported) {
            hasTeleported = false;
            hasTriggered = true;
        }
    }
}
