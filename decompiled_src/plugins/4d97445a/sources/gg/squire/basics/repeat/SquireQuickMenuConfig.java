package gg.squire.basics.repeat;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squirequickmenu")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/repeat/SquireQuickMenuConfig.class */
public interface SquireQuickMenuConfig extends Config {
    @ConfigItem(position = 11, keyName = "quickAlchItems", name = "Quick Alch Items", description = "Items to quick alch (id/name)")
    default String quickAlch() {
        return "1164,Rune platebody";
    }
}
