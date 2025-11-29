/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Volatile Baboon Task - Handles avoiding explosive baboons in Ba-Ba encounter
 * Volatile Baboons explode when they reach the player, dealing significant damage
 * This task detects baboons in their explosion animation and moves to a safe distance
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Dodging volatile baboon", priority=100, blocking=true)
public class DodgingVolatileBaboonTask extends KephriManager {

    // NPC name for volatile baboons
    private static final String BABOON_NAME = "Volatile Baboon";

    // Log messages
    private static final String LOG_NO_SAFE_SPOT = "No safe spot found, tanking baboon";

    // Constants
    private static final int TRUE = 1;
    private static final int FALSE = 0;
    private static final int EXPLOSION_ANIMATION = -1;
    private static final int MIN_DISTANCE = 3;
    private static final int SEARCH_AREA_OFFSET = 35;  // 0x48 ^ 0x6E ^ (0x11 ^ 0x32)
    private static final int SAFE_DISTANCE = 2;
    private static final int EXTENDED_SEARCH = 8;

    @Inject
    protected DodgingVolatileBaboonTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        return this.config.meleeGearAkkha();
    }

    /**
     * Main task validation logic
     * Detects volatile baboons and moves player to safe location
     */
    @Override
    public boolean validate() {
        String[] npcNames = new String[TRUE];
        npcNames[0] = BABOON_NAME;

        NPC volatileBaboon = NPCs.getNearest(npcNames);

        if (volatileBaboon == null) {
            return false;
        }

        // Check if baboon is in explosion animation
        if (volatileBaboon.getAnimation() == EXPLOSION_ANIMATION) {
            return false;
        }

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // If far enough from baboon, no need to move
        if (volatileBaboon.distanceTo(playerLocation) > MIN_DISTANCE) {
            return false;
        }

        // Find safe tile away from all volatile baboons
        WorldPoint safeTile = playerLocation.toWorldArea().offset(SEARCH_AREA_OFFSET).toWorldPointList().stream()
            // Filter tiles that are far from all exploding baboons
            .filter(tile -> {
                String[] searchNames = new String[TRUE];
                searchNames[0] = BABOON_NAME;

                return NPCs.getAll(searchNames).stream()
                    // Only consider baboons that are exploding
                    .filter(baboon -> baboon.getAnimation() != EXPLOSION_ANIMATION)
                    // Check if tile is safe distance from all baboons
                    .noneMatch(baboon -> baboon.getWorldLocation().distanceTo(tile) <= SAFE_DISTANCE);
            })
            // Only consider walkable tiles
            .filter(tile -> !this.isTileOccupied(tile))
            .filter(Reachable::isWalkable)
            // Find closest safe tile
            .min(Comparator.comparingInt(tile -> tile.distanceTo(playerLocation)))
            .orElse(null);

        if (safeTile == null) {
            Log.info(LOG_NO_SAFE_SPOT);
            return false;
        }

        this.moveToTile(safeTile);
        return true;
    }
}
