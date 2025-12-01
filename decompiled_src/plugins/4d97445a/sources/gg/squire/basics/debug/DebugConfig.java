package gg.squire.basics.debug;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
@ConfigGroup("debugconfig")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/debug/DebugConfig.class */
public interface DebugConfig extends Config {
    @ConfigItem(keyName = "bltest", name = "bltest", description = "bltest")
    default ConfigStorageBox<BankLoadout> loadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }
}
