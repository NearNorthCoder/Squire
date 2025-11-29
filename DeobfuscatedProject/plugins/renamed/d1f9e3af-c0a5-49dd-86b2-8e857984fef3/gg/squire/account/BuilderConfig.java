/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 */
package gg.squire.account;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(value="hootfighter")
public interface BuilderConfig
extends Config {
    @ConfigSection(name="General", description="General settings", position=991, closedByDefault=true)
    public static final /* synthetic */ String general;

    static {
        general = "General";
    }

    @ConfigItem(keyName="enabled", name="Enable/disable plugin", description="Enable or disable the plugin")
    default public boolean turnScriptOnOff() {
        return ((0xEB ^ 0x99 ^ (0xD0 ^ 0x85)) & (3 ^ 0x3C ^ (0x69 ^ 0x71) ^ -1)) != 0;
    }
}

