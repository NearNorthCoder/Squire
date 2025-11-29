/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.basics.debug;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@ConfigGroup(value="debugconfig")
public interface DebugConfig
extends Config {
    @ConfigItem(keyName="bltest", name="bltest", description="bltest")
    default public ConfigStorageBox<BankLoadout> loadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }
}

