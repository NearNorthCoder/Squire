package gg.squire.leagues.banknote;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.Label;

/**
 * Configuration for the Note Items plugin.
 * Allows players to configure automatic noting/unnoting of items using a Banker's Note.
 */
@ConfigGroup(value = "leaguesnoter")
public interface NoteItemsConfig extends Config {

    /**
     * The name of the item to note/unnote.
     *
     * @return the item name
     */
    @ConfigItem(
            keyName = "note",
            name = "Enter item name to use",
            description = "Notes when inventory is full",
            position = 0
    )
    default String noteItem() {
        return "";
    }

    /**
     * Information label explaining that the plugin will note items when inventory is full.
     *
     * @return null (label component)
     */
    @ConfigItem(
            keyName = "noteaaa",
            name = "This will note item when full inv",
            description = "Notes when inventory is full",
            position = 2
    )
    default Label noteItemLabel1() {
        return null;
    }

    /**
     * Information label about unnote mode.
     *
     * @return null (label component)
     */
    @ConfigItem(
            keyName = "noteaaaa2a",
            name = "or unnote when no unnoted items",
            description = "Notes when inventory is full",
            position = 3
    )
    default Label noteItemLabel2() {
        return null;
    }

    /**
     * Enables unnote mode. When enabled, the plugin will unnote items instead of noting them.
     *
     * @return true if unnote mode is enabled, false otherwise
     */
    @ConfigItem(
            keyName = "notedCheck",
            name = "Enable to unnote mode",
            description = "Unnotes item when none in inv",
            position = 4
    )
    default boolean getUnnotedMode() {
        return false;
    }
}
