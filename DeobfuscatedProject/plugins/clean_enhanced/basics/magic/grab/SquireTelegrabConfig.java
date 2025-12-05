/*
 * Deobfuscated with CFR 0.152.
 *
 * Configuration for the Telegrab Plugin
 *
 * Original obfuscated class: SquireTelegrabConfig
 * Package: gg.squire.basics.magic.grab
 */
package gg.squire.basics.magic.grab;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

/**
 * Configuration interface for the Telegrab plugin.
 * Allows specification of target item ID to telegrab.
 */
@ConfigGroup(value = "squiretelegrab")
public interface SquireTelegrabConfig extends Config {

    /**
     * Gets the item ID of the target to telegrab.
     * Default value of 1 is a placeholder - users should configure this.
     *
     * @return the item ID to telegrab
     */
    @ConfigItem(
        keyName = "target",
        name = "Target",
        description = "The item ID to telegrab",
        position = 1
    )
    default int target() {
        return 1;
    }
}
