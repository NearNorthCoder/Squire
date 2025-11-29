package gg.squire.cleaner;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
@ConfigGroup("squirecleaner")
/* loaded from: squire-account-cleaner-0.2.2.jar:gg/squire/cleaner/SquireAccountCleanerConfig.class */
public interface SquireAccountCleanerConfig extends Config {
    @ConfigItem(position = 1, keyName = "Sell Above Value", name = "Sell Above Value", description = "Sell Above Value")
    @Range(min = 1, max = 2147000000)
    default int sellValue() {
        return (-((-10759) & 31319)) & (-8206) & 128765;
    }

    @ConfigItem(position = 2, keyName = "Percent To Sell Under", name = "Percent To Sell Under", description = "Percent to decrease sell price by")
    @Range(min = 0, max = 99)
    default int sellPercent() {
        return 141 ^ 148;
    }

    @ConfigItem(position = 5, keyName = "pause", name = "Pause", description = "Pause execution")
    default Button pause() {
        return new Button();
    }

    @ConfigItem(position = 4, keyName = "addToIgnore", name = "Ignore inventory", description = "Adds items in inventory to ignore list")
    default Button addToIgnoreList() {
        return new Button();
    }

    @ConfigItem(position = 3, keyName = "ignoreList", name = "Items to ignore", description = "Wont sell these items")
    default String ignoreList() {
        return "";
    }
}
