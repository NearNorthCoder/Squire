/*
 * Deobfuscated with CFR 0.152.
 *
 * Configuration for the Stun Alch Teleport Plugin
 *
 * Original obfuscated class: SquireAlchTeleportConfig
 * Package: gg.squire.basics.magic.stunalchtp
 */
package gg.squire.basics.magic.stunalchtp;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

/**
 * Configuration interface for the Stun Alch Teleport plugin.
 * Allows toggling between full rotation and teleport-alch only mode.
 */
@ConfigGroup(value = "squirestuntelealchconfig")
public interface SquireAlchTeleportConfig extends Config {

    /**
     * Determines if the plugin should skip stunning and only teleport and alch.
     * When enabled, only performs high alchemy and teleportation without stunning.
     *
     * @return true for teleport-alch only mode, false for full stun-alch-teleport rotation
     */
    @ConfigItem(
        keyName = "stunAlch",
        name = "Tele Alch only?",
        description = "Only does tele alch, no stun",
        position = 1
    )
    default boolean stunAlchOnly() {
        return false;
    }
}
