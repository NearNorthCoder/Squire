/*
 * Deobfuscated from DebugConfig
 * Package: gg.squire.basics.debug
 *
 * Configuration for debug plugin.
 * Provides test configuration for bank loadout functionality.
 */
package gg.squire.basics.debug;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

/**
 * Debug configuration interface.
 * Used for testing bank loadout functionality.
 */
@ConfigGroup(value="debugconfig")
public interface DebugConfig extends Config {

    /**
     * Test bank loadout configuration.
     *
     * @return test loadout storage box
     */
    @ConfigItem(
        keyName="bltest",
        name="bltest",
        description="bltest"
    )
    default ConfigStorageBox<BankLoadout> loadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }
}
