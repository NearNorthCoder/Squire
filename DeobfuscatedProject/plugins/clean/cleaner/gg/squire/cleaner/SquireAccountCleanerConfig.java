/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Button
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package gg.squire.cleaner;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(value="squirecleaner")
public interface SquireAccountCleanerConfig
extends Config {
    @ConfigItem(position=1, keyName="Sell Above Value", name="Sell Above Value", description="Sell Above Value")
    @Range(min=1, max=2147000000)
    default public int sellValue() {
        return -(0xFFFFD5F9 & 0x7A57) & (0xFFFFDFF2 & 0x1F6FD);
    }

    @ConfigItem(position=2, keyName="Percent To Sell Under", name="Percent To Sell Under", description="Percent to decrease sell price by")
    @Range(min=0, max=99)
    default public int sellPercent() {
        return 0x8D ^ 0x94;
    }

    @ConfigItem(position=5, keyName="pause", name="Pause", description="Pause execution")
    default public Button pause() {
        return new Button();
    }

    @ConfigItem(position=4, keyName="addToIgnore", name="Ignore inventory", description="Adds items in inventory to ignore list")
    default public Button addToIgnoreList() {
        return new Button();
    }

    @ConfigItem(position=3, keyName="ignoreList", name="Items to ignore", description="Wont sell these items")
    default public String ignoreList() {
        return "";
    }
}

