/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package gg.squire.basics.shop;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(value="squireshopper")
public interface SquireShopConfig
extends Config {
    @ConfigItem(keyName="shopperId", name="Shop NPC ID", description="The ID of the NPC to buy from", position=0)
    default public int shopperId() {
        return -(0xFFFFEE79 & 0x13FF) & (0xFFFFE7FE & 0x3EFD);
    }

    @ConfigItem(keyName="itemMinStock", name="Minimum stock", description="The stock at which to stop buying", position=2)
    @Range(min=-1)
    default public int itemMinStock() {
        return 0x52 ^ 0x36;
    }

    @ConfigItem(keyName="buyItemId", name="Item to buy", description="The item to buy from the shop", position=1)
    default public int buyItemId() {
        return 0xFFFF8A7F & 0x77B6;
    }

    @ConfigItem(keyName="moreItemIds", name="Extra items", description="Put ids separated by , here for multiple items (min stock used for all)", position=1)
    default public String moreItemIds() {
        return "";
    }
}

