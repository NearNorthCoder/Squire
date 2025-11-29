/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.warriorsGuild;

import gg.squire.warriorsGuild.model.ArmourSet;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squirewarriorsguild")
public interface SquireWarriorsGuildConfig
extends Config {
    @ConfigSection(name="Warriors Guild settings", description="Settings", position=0)
    public static final String WARRIORS_GUILD_SETTINGS = "Warriors Guild settings";

    @ConfigItem(keyName="armourSet", name="Armour Set", description="What type of armour set do you want to re-animate?", position=1, section="Warriors Guild settings")
    default public ArmourSet armourSet() {
        return ArmourSet.MITHRIL;
    }

    @ConfigItem(keyName="desiredTokens", name="Tokens", description="How many tokens do you want to get?", position=10, section="Warriors Guild settings")
    @Range(min=25, max=50000)
    default public int desiredTokens() {
        return 1000;
    }
}

