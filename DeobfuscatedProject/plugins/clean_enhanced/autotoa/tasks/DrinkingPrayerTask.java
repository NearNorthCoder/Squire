package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

/**
 * Task for drinking prayer restoration potions.
 *
 * This task:
 * - Monitors prayer points
 * - Drinks prayer potions when points are low
 * - Supports multiple types: Prayer potions, Super restores, Sanfew serums
 * - Avoids Tears of Elidinis (special TOA water supply)
 * - Coordinates with prayer manager for timing
 */
@TaskDesc(name = "Drinking prayer", priority = 85)
public class DrinkingPrayerTask extends AutotoaManager {
    private static final int PRAYER_THRESHOLD = 35; // Drink when prayer below this

    private final PrayerManager prayerManager;

    @Inject
    protected DrinkingPrayerTask(Client client, PrayerManager prayerManager) {
        super(client);
        this.prayerManager = prayerManager;
    }

    @Override
    public boolean run() {
        // Determine if we're in combat (affects prayer threshold)
        int threshold = isInCombat() ? 35 : PRAYER_THRESHOLD;

        // Don't drink if prayer is above threshold
        if (Prayers.getPoints() > threshold) {
            return false;
        }

        // Find prayer restoration potion
        // Exclude: Tears of Elidinis, items containing "restore" or "Prayer"
        // Include: Items containing "Sanfew" (Sanfew serum)
        Item prayerPotion = Inventory.getFirst(item -> {
            if (SupplyType.TEARS_OF_ELIDINIS.matchesId(item.getId())) {
                return false;
            }
            if (item.getName().contains("restore")) {
                return false;
            }
            if (item.getName().contains("Prayer")) {
                return false;
            }
            // Sanfew serum is acceptable
            return item.getName().contains("Sanfew");
        });

        // Drink the potion if found and we can drink
        if (prayerPotion != null && prayerManager.canDrinkPrayer()) {
            prayerPotion.interact("Drink");
            prayerManager.recordPrayerDrink();
            return true;
        }

        return false;
    }
}
