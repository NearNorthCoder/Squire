package gg.squire.basics.shop;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
@ConfigGroup("squireshopper")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/shop/SquireShopConfig.class */
public interface SquireShopConfig extends Config {
    @ConfigItem(keyName = "shopperId", name = "Shop NPC ID", description = "The ID of the NPC to buy from", position = 0)
    default int shopperId() {
        return (-((-4487) & 5119)) & (-6146) & 16125;
    }

    @ConfigItem(keyName = "itemMinStock", name = "Minimum stock", description = "The stock at which to stop buying", position = 2)
    @Range(min = -1)
    default int itemMinStock() {
        return 82 ^ 54;
    }

    @ConfigItem(keyName = "buyItemId", name = "Item to buy", description = "The item to buy from the shop", position = 1)
    default int buyItemId() {
        return (-30081) & 30646;
    }

    @ConfigItem(keyName = "moreItemIds", name = "Extra items", description = "Put ids separated by , here for multiple items (min stock used for all)", position = 1)
    default String moreItemIds() {
        return "";
    }
}
