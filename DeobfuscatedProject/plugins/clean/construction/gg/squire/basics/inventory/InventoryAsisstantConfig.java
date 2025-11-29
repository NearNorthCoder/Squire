/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.basics.inventory;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squireinventory")
public interface InventoryAsisstantConfig
extends Config {
    @ConfigSection(name="Inventory Options", description="Settings related to inventory", position=10)
    public static final /* synthetic */ String inventorySettings;

    static {
        inventorySettings = "Pray Flicking Settings";
    }

    @ConfigItem(position=12, keyName="itemsToDrop", name="Items to drop", description="Item IDS of the items you would like to drop, separated by commas", section="Pray Flicking Settings")
    default public String itemsToDrop() {
        return String.format("13571,5343", new Object[(27 + 19 - -55 + 110 ^ 58 + 95 - 121 + 145) & (140 + 41 - -29 + 40 ^ 20 + 7 - -109 + 16 ^ -" ".length())]);
    }

    @ConfigItem(position=13, keyName="amountToDrop", name="Drop at x", description="What amount of any item to start dropping at", section="Pray Flicking Settings")
    @Range(min=1, max=28)
    default public int amountToDrop() {
        return 0x2F ^ 0x33;
    }
}

