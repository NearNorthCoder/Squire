package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

/**
 * Handles transition to the Wardens final phase in Tombs of Amascut.
 *
 * Game Mechanics:
 * - During the Wardens boss fight, there are multiple phases
 * - When transitioning to final phase, Wardens perform specific animations
 * - Items/supplies may drop on the ground during phase transitions
 * - Low health (below threshold) requires caution before picking up items
 *
 * Strategy:
 * 1. Detect Warden animation changes signaling phase transition
 * 2. Wait for safe moment (not during specific attack animations)
 * 3. Pick up valuable items from ground if inventory has space
 * 4. Prioritize high-value tradeable items
 * 5. Don't pick up items if health is critically low
 */
@TaskDesc(name="Going to final phase", priority=1000, blocking=true)
public class GoingToFinalPhaseTask extends AutotoaManager {

    // Warden animation IDs
    private static final int WARDEN_PHASE_ANIMATION_1 = 9662;   // First transition animation
    private static final int WARDEN_PHASE_ANIMATION_2 = 11755;  // Second transition animation

    // Health threshold for safe item pickup
    private static final int LOW_HEALTH_THRESHOLD = 7;  // Don't pick up items below this HP

    // Item price constants
    private static final int DEFAULT_ITEM_PRICE = -1;  // Price for non-tradeable items

    @Inject
    protected GoingToFinalPhaseTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Override
    public boolean bl() {
        // Main task execution logic

        // Check if Warden is performing phase transition animation
        NPC warden = this.co();  // Get Warden NPC

        if (warden != null && warden.getAnimation() == WARDEN_PHASE_ANIMATION_1) {
            // Warden is transitioning - don't act yet
            return false;
        }

        // Check if we're in the correct phase
        if (this.aX() == WARDEN_PHASE_ANIMATION_2) {
            // Already in final phase
            return false;
        }

        // Don't pick up items if health is too low and we can't eat
        if (Combat.getCurrentHealth() < LOW_HEALTH_THRESHOLD && !this.ba()) {
            return true;  // Focus on survival, not looting
        }

        // Don't pick up items if inventory is full
        if (Inventory.isFull()) {
            return false;
        }

        // Find the most valuable item on the ground
        TileItem valuableItem = TileItems.getAll().stream()
            .filter(Reachable::isInteractable)
            .max(Comparator.comparingInt(item -> {
                if (item.isTradable()) {
                    return Prices.getItemPrice(item.getId());
                } else {
                    return DEFAULT_ITEM_PRICE;
                }
            }))
            .orElse(null);

        if (valuableItem == null) {
            // No items to pick up
            return false;
        }

        // Pick up the valuable item
        valuableItem.interact("Take");
        return true;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;  // No special equipment setup needed
    }
}
