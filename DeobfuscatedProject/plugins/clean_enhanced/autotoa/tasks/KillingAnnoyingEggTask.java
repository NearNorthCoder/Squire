/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.KephriManager;

/**
 * Task: Kill Akkha's Annoying Egg
 *
 * Mechanics:
 * - During the Akkha boss fight, an egg spawns at a specific location (27, 36)
 * - The egg must be killed using a Keris weapon for maximum efficiency
 * - This task handles finding the egg, positioning correctly, and attacking it
 * - Must stand in melee distance and on safe tiles to attack
 *
 * Attack Pattern:
 * 1. Detect if egg mechanic is active (bV check)
 * 2. Find egg NPC at specific location (27, 36)
 * 3. Check if egg is alive and attackable
 * 4. Navigate to safe melee tiles around the egg
 * 5. Equip Keris weapon if available
 * 6. Attack the egg
 *
 * NPC Details:
 * - Egg NPC ID: 28096 (0x6DC0)
 * - Spawn location: Point(27, 36)
 * - Must be within 1 tile (offset -2) to be safe
 * - Must be in melee distance (offset 1) to attack
 */
@TaskDesc(name="Killing annoying egg", priority=20, register=true, blocking=true)
public class KillingAnnoyingEggTask extends KephriManager {

    // NPC ID for the egg
    private static final int EGG_NPC_ID = 28096; // 0x6DC0 - Akkha's egg

    // Egg spawn location
    private static final Point EGG_LOCATION = new Point(27, 36);

    // Area offsets for positioning
    private static final int SAFE_AREA_OFFSET = -2; // Must be outside this offset
    private static final int MELEE_AREA_OFFSET = 1;  // Must be within this offset to attack

    // Timing
    private static final int TASK_SLEEP_DURATION = 0;

    // Item/action strings
    private static final String ACTION_WIELD = "Wield";
    private static final String ACTION_ATTACK = "Attack";
    private static final String ITEM_NAME_KERIS = "keris";
    private static final String NPC_NAME_EGG = "egg";

    @Inject
    public KillingAnnoyingEggTask(Client client, ToaPlugin plugin, TOAConfig tOAConfig) {
        super(client, plugin, tOAConfig);
    }

    @Override
    protected boolean bL() {
        // Check if egg mechanic is active and we should kill it
        if (!bV() || bR()) {
            sleep(TASK_SLEEP_DURATION);
            return true;
        }

        // Get egg spawn location
        WorldPoint eggWorldLocation = a(EGG_LOCATION);

        // Find the egg NPC
        NPC eggNPC = NPCs.getAll(npc -> {
            // Filter for egg NPCs at the correct location
            if (npc.getName().toLowerCase().contains(NPC_NAME_EGG)
                    && npc.hasAction(ACTION_ATTACK)
                    && npc.getWorldLocation().equals(eggWorldLocation)
                    && npc.getId() == EGG_NPC_ID
                    && !npc.isDead()) {
                return true;
            }
            return false;
        }).stream().findFirst().orElse(null);

        if (eggNPC == null) {
            return true;
        }

        // Check if we're too close (in danger zone)
        if (!eggNPC.getWorldArea().offset(SAFE_AREA_OFFSET).contains(Players.getLocal())) {
            return true;
        }

        // Get safe tiles around player
        Set<WorldPoint> safeTiles = bU();

        // Get melee attack range around egg
        WorldArea meleeRange = eggNPC.getWorldArea().offset(MELEE_AREA_OFFSET);

        // Find a safe tile in melee range to stand on
        if (safeTiles.stream().anyMatch(tile -> eggNPC.getWorldArea().offset(MELEE_AREA_OFFSET).contains(tile))) {
            WorldPoint targetTile = meleeRange.toWorldPointList()
                    .stream()
                    .filter(tile -> tile.toWorldArea().isInMeleeDistance(eggNPC.getWorldLocation()))
                    .filter(tile -> {
                        // Only move to safe tiles
                        if (!safeTiles.contains(tile)) {
                            return true;
                        } else {
                            return false;
                        }
                    })
                    .findFirst()
                    .orElse(null);

            if (targetTile == null) {
                return true;
            }

            // Move to the target tile
            Movement.setDestination(targetTile);
            return true;
        }

        // Prepare for attack
        bp();

        // Equip Keris weapon for bonus damage
        Item kerisWeapon = Inventory.getFirst(item -> item.getName().toLowerCase().contains(ITEM_NAME_KERIS));
        if (kerisWeapon != null) {
            kerisWeapon.interact(ACTION_WIELD);
        }

        // Attack the egg
        eggNPC.interact(ACTION_ATTACK);
        return true;
    }
}
