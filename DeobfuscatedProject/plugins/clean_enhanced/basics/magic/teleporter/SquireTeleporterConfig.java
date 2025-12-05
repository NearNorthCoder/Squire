/*
 * Deobfuscated with CFR 0.152.
 *
 * Configuration for the Teleporter Plugin
 *
 * Original obfuscated class: SquireTeleporterConfig
 * Package: gg.squire.basics.magic.teleporter
 */
package gg.squire.basics.magic.teleporter;

import gg.squire.basics.enums.TeleportSpell;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

/**
 * Configuration interface for the Teleporter plugin.
 * Allows selection of which teleport spell to cast.
 */
@ConfigGroup(value = "squireteleporterconfig")
public interface SquireTeleporterConfig extends Config {

    /**
     * Gets the teleport spell to cast.
     * Defaults to PROGRESSIVE mode which automatically uses the highest level teleport available.
     *
     * @return the selected teleport spell mode
     */
    @ConfigItem(
        keyName = "teleport",
        name = "Teleport",
        description = "Which teleport to cast",
        position = 1
    )
    default TeleportSpell teleport() {
        return TeleportSpell.PROGRESSIVE;
    }
}
