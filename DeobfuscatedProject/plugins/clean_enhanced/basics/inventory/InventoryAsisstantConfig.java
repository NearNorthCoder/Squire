/*
 * Deobfuscated from InventoryAsisstantConfig
 * Package: gg.squire.basics.inventory
 *
 * Configuration for inventory management assistant.
 * Controls automatic item dropping behavior.
 *
 * Note: Class name has typo "Asisstant" instead of "Assistant".
 */
package gg.squire.basics.inventory;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

/**
 * Configuration for Inventory Assistant plugin.
 * Manages automatic item dropping when inventory reaches threshold.
 */
@ConfigGroup(value="squireinventory")
public interface InventoryAsisstantConfig extends Config {

    /** Inventory settings section */
    public static final String INVENTORY_SETTINGS = "Pray Flicking Settings";

    /**
     * Comma-separated list of item IDs to drop.
     * Example: "13571,5343"
     *
     * @return item IDs string (default: "13571,5343")
     */
    @ConfigItem(
        position=12,
        keyName="itemsToDrop",
        name="Items to drop",
        description="Item IDS of the items you would like to drop, separated by commas",
        section="Pray Flicking Settings"
    )
    default String itemsToDrop() {
        return String.format("13571,5343");
    }

    /**
     * Inventory count threshold to start dropping items.
     * When total count of specified items reaches this value, dropping begins.
     *
     * @return item count threshold (default: 12)
     */
    @ConfigItem(
        position=13,
        keyName="amountToDrop",
        name="Drop at x",
        description="What amount of any item to start dropping at",
        section="Pray Flicking Settings"
    )
    @Range(min=1, max=28)
    default int amountToDrop() {
        return 12; // 0x2F ^ 0x33
    }
}
