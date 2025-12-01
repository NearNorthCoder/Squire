package gg.squire.warriorsGuild;

import gg.squire.warriorsGuild.model.ArmourSet;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squirewarriorsguild")
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/SquireWarriorsGuildConfig.class */
public interface SquireWarriorsGuildConfig extends Config {
    @ConfigSection(name = WARRIORS_GUILD_SETTINGS, description = "Settings", position = 0)
    public static final String WARRIORS_GUILD_SETTINGS = "Warriors Guild settings";

    @ConfigItem(keyName = "armourSet", name = "Armour Set", description = "What type of armour set do you want to re-animate?", position = 1, section = WARRIORS_GUILD_SETTINGS)
    default ArmourSet armourSet() {
        return ArmourSet.MITHRIL;
    }

    @ConfigItem(keyName = "desiredTokens", name = "Tokens", description = "How many tokens do you want to get?", position = 10, section = WARRIORS_GUILD_SETTINGS)
    @Range(min = 25, max = 50000)
    default int desiredTokens() {
        return 1000;
    }
}
