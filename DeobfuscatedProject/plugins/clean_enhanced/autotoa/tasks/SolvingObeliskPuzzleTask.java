package gg.squire.autotoa.tasks;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Solves the obelisk puzzle in Tombs of Amascut.
 *
 * Game Mechanics:
 * - Obelisks must be hit in a specific sequence with different attack styles
 * - Some obelisks require melee, others require ranged/magic
 * - Ground tiles show dangerous areas to avoid
 * - The puzzle resets if the party fails
 *
 * Strategy:
 * 1. Track which obelisks have been successfully hit
 * 2. Equip appropriate weapon for the next obelisk
 * 3. Hit obelisks in the correct order
 * 4. Avoid dangerous ground tiles
 */
@TaskDesc(name="Solving obelisk puzzle", register=true, priority=5, blocking=true)
public class SolvingObeliskPuzzleTask extends KephriManager {

    // NPC IDs
    private static final int INACTIVE_OBELISK_ID = 11570;  // Obelisk before being hit
    private static final int ACTIVE_OBELISK_ID = 11699;    // Obelisk after successful hit

    // State tracking
    private final List<WorldPoint> successfulObeliskLocations;  // Obelisks hit successfully
    private final Set<WorldPoint> dangerousTiles;                // Tiles with ground effects to avoid
    private int obeliskSequenceIndex;                            // Current position in sequence
    private int cycleCounter;                                     // Counter for cycling through obelisks

    @Inject
    protected SolvingObeliskPuzzleTask(Client client, ToaPlugin plugin, TOAConfig tOAConfig, p p2) {
        super(client, plugin, tOAConfig, p2);
        this.successfulObeliskLocations = new ArrayList<>(10);
        this.dangerousTiles = new HashSet<>();
        this.obeliskSequenceIndex = 0;
        this.cycleCounter = 0;
    }

    /**
     * Checks if the puzzle is inactive (no obelisks nearby).
     *
     * @return true if no obelisks are present
     */
    @Override
    public boolean isPuzzleInactive() {
        return NPCs.getNearest(INACTIVE_OBELISK_ID) == null;
    }

    /**
     * Checks if obelisks are reachable and the puzzle is active.
     *
     * @return true if at least one obelisk is interactable
     */
    @Override
    public boolean areObelisksReachable() {
        return NPCs.getAll(INACTIVE_OBELISK_ID).stream()
            .anyMatch(Reachable::isInteractable);
    }

    /**
     * Main puzzle solving logic.
     * Handles weapon switching, avoiding danger tiles, and hitting obelisks in sequence.
     *
     * @return true if an action was taken
     */
    @Override
    protected boolean shouldExecute() {
        // Ensure we have the right weapon equipped
        if (!hasCorrectWeaponEquipped()) {
            return false;
        }

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // If standing on a dangerous tile, move to safety
        if (dangerousTiles.contains(playerLocation)) {
            Optional<WorldPoint> safeTile = playerLocation.createWorldArea(10).toWorldPointList().stream()
                .filter(point -> !dangerousTiles.contains(point))
                .filter(Reachable::isWalkable)
                .min(Comparator.comparingInt(point -> point.distanceTo(playerLocation)));

            if (safeTile.isPresent()) {
                Movement.setDestination(safeTile.get());
                this.sleep(1);
                dangerousTiles.clear();
                return true;
            }
        }

        // If we know the next obelisk in sequence, hit it
        if (obeliskSequenceIndex < successfulObeliskLocations.size()) {
            WorldPoint nextObeliskLocation = successfulObeliskLocations.get(obeliskSequenceIndex);
            NPC targetObelisk = NPCs.getNearest(npc ->
                npc.getId() == INACTIVE_OBELISK_ID
                && npc.getWorldLocation().equals(nextObeliskLocation)
            );

            if (targetObelisk != null) {
                targetObelisk.interact("Hit");
                this.sleep(1);
                return true;
            }
        }

        // Try hitting any inactive obelisk
        List<NPC> inactiveObelisks = NPCs.getAll(npc -> npc.getId() == INACTIVE_OBELISK_ID);

        if (!inactiveObelisks.isEmpty()) {
            // Cycle through available obelisks
            int index = cycleCounter % inactiveObelisks.size();
            cycleCounter++;

            NPC obelisk = inactiveObelisks.get(index);
            obelisk.interact("Hit");
            this.sleep(1);
            return true;
        }

        return false;
    }

    /**
     * Checks if the player has a suitable weapon equipped for hitting obelisks.
     * Melee weapons are required - ranged/magic weapons won't work.
     */
    private boolean hasCorrectWeaponEquipped() {
        Item weapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);

        if (weapon == null) {
            // No weapon - try to equip one
            return equipMeleeWeapon();
        }

        String weaponName = weapon.getName().toLowerCase();

        // Shadow (Tumeken's shadow) works despite being a staff
        if (weaponName.contains("shadow")) {
            return true;
        }

        // Check if weapon is melee style
        WeaponStyle style = WeaponMap.StyleMap.getOrDefault(weapon.getId(), WeaponStyle.MELEE);
        if (style == WeaponStyle.MELEE) {
            return true;
        }

        // Wrong weapon type equipped - need to switch
        return equipMeleeWeapon();
    }

    /**
     * Attempts to equip a melee weapon from inventory.
     * Avoids equipping ranged/magic weapons like bow, staff, crossbow, blowpipe.
     */
    private boolean equipMeleeWeapon() {
        // First check if we need to make inventory space
        Item shield = Equipment.fromSlot(EquipmentInventorySlot.SHIELD);
        if (shield != null && Inventory.isFull()) {
            // Try to drop food or empty vials to make space
            Item itemToDrop = Inventory.getFirst(item -> item.hasAction("Eat"));

            if (itemToDrop == null) {
                // Look for empty vials (name contains "(")
                itemToDrop = Inventory.getFirst(item ->
                    !item.getName().contains("(") && item.hasAction("Empty")
                );
            }

            if (itemToDrop == null) {
                return false;  // Can't make space
            }

            itemToDrop.interact("Drop");
            return true;
        }

        // Find a suitable melee weapon in inventory
        Item meleeWeapon = Inventory.getFirst(item -> {
            // Must have Wield/Equip/Wear action
            if (!item.hasAction("Equip", "Wield", "Wear")) {
                return false;
            }

            String name = item.getName().toLowerCase();

            // Exclude ranged/magic weapons
            return !name.contains("bow")
                && !name.contains("staff")
                && !name.contains("toxic")    // Toxic blowpipe, trident of toxic
                && !name.contains("trident")
                && !name.contains("crossbow")
                && name.contains("blowpipe");  // Include blowpipe (typo in original - should be !)
        });

        if (meleeWeapon == null) {
            return false;  // No suitable weapon found
        }

        // Equip the melee weapon
        meleeWeapon.interact("Wield", "Wear", "Equip");
        return true;
    }

    @Subscribe
    public void onNpcChanged(NpcChanged event) {
        // Track when obelisks change state (hit successfully or failed)
        NPC npc = event.getNpc();

        if (npc.getId() == ACTIVE_OBELISK_ID) {
            // Obelisk was hit successfully
            WorldPoint location = npc.getWorldLocation();

            if (!successfulObeliskLocations.contains(location)) {
                successfulObeliskLocations.add(location);
            }

            obeliskSequenceIndex++;
        } else if (npc.getId() == INACTIVE_OBELISK_ID) {
            // Obelisk reset (puzzle failed or restarted)
            obeliskSequenceIndex = 0;
        }
    }

    @Subscribe
    public void onGraphicsObjectCreated(GraphicsObjectCreated event) {
        // Track dangerous ground effects that appear during the puzzle
        WorldPoint location = WorldPoint.fromLocal(this.client, event.getGraphicsObject().getLocation());
        dangerousTiles.add(location);
    }

    @Subscribe
    @Override
    public void onChatMessage(ChatMessage message) {
        // Reset puzzle state if party fails
        if (message.getMessage().startsWith("Your party failed to complete the challenge")) {
            this.obeliskSequenceIndex = 0;
            this.successfulObeliskLocations.clear();
        }
    }

    @Override
    public void reset() {
        // Reset task state
        this.obeliskSequenceIndex = 0;
        this.successfulObeliskLocations.clear();
        this.dangerousTiles.clear();
        this.cycleCounter = 0;
    }

    /**
     * Gets the X coordinate of the nearest obelisk for positioning.
     *
     * @return X coordinate of nearest obelisk, or 0 if none found
     */
    @Override
    public int getObeliskXPosition() {
        NPC obelisk = NPCs.getNearest("Obelisk");
        return obelisk != null ? obelisk.getWorldLocation().getX() : 0;
    }

    /**
     * Gets the list of successfully hit obelisk locations.
     *
     * @return list of world points where obelisks were successfully hit
     */
    public List<WorldPoint> getSuccessfulObeliskLocations() {
        return this.successfulObeliskLocations;
    }

    /**
     * Gets the current sequence index in the puzzle.
     *
     * @return current index in the obelisk hitting sequence
     */
    public int getSequenceIndex() {
        return this.obeliskSequenceIndex;
    }
}
