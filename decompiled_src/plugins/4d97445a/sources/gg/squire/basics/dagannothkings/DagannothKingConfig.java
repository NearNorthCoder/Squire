package gg.squire.basics.dagannothkings;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squiresarachnis")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/dagannothkings/DagannothKingConfig.class */
public interface DagannothKingConfig extends Config {
    @ConfigSection(name = "Consumable Settings", description = "Settings related to Consumables", position = 10)
    public static final /* synthetic */ String consumableSettings = "Consumable Settings";

    @ConfigItem(position = 12, keyName = "restorePrayerLevel", name = "Drink Prayer Potion at x prayer", description = "Drink Prayer Potion at x prayer", section = "Consumable Settings")
    @Range(min = 1, max = 99)
    default int restorePrayerLevel() {
        return (((216 + 155) - 160) + 21) ^ (((116 + 178) - 244) + 142);
    }

    @ConfigItem(position = 11, keyName = "eatMissing", name = "Eat At X Health Missing", description = "EAt at missing x health", section = "Consumable Settings")
    @Range(min = 1, max = 99)
    default int eatMissingHealth() {
        return (((53 + 126) - 78) + 90) ^ (((77 + 39) - 50) + 85);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 13, keyName = "flickPiety", name = "Flick Piety", description = "Flick Piety", section = "Consumable Settings")
    default boolean flickPiety() {
        return " ".length();
    }
}
