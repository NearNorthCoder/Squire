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

    @ConfigItem(keyName="agility", name="Get 70 agility", description="enable to get 70 agility or disable to not get 70 agility")
    default public boolean get70Agility() {
        return ((13 + 29 - -13 + 73 ^ 113 + 123 - 210 + 124) & (4 ^ 0x3A ^ (0x89 ^ 0xA1) ^ -" ".length())) != 0;
    }

    @ConfigItem(keyName="enabled", name="Enable/disable plugin", description="Enable or disable the plugin")
    default public boolean turnScriptOnOff() {
        return ((0 ^ 0x55 ^ (0x77 ^ 7)) & (0x1A ^ 0xB ^ (7 ^ 0x33) ^ -" ".length())) != 0;
    }

    static {
        general = "General";
    }
}

