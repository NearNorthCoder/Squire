package gg.squire.leagues.banknote;

import java.awt.Label;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("leaguesnoter")
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/banknote/NoteItemsConfig.class */
public interface NoteItemsConfig extends Config {
    @ConfigItem(keyName = "noteaaaa2a", name = "or unnote when no unnoted items", description = "Notes when inventory is full", position = 3)
    default Label noteItem2() {
        return null;
    }

    @ConfigItem(keyName = "note", name = "Enter item name to use", description = "Notes when inventory is full", position = 0)
    default String noteItem() {
        return "";
    }

    @ConfigItem(keyName = "notedCheck", name = "Enable to unnote mode", description = "Unnotes item when none in inv", position = 4)
    default boolean getUnnotedMode() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(keyName = "noteaaa", name = "This will note item when full inv", description = "Notes when inventory is full", position = 2)
    default Label noteItem1() {
        return null;
    }
}
