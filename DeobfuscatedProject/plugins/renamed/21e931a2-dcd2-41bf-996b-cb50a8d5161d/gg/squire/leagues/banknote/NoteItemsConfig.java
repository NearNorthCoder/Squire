/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.leagues.banknote;

import java.awt.Label;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="leaguesnoter")
public interface NoteItemsConfig
extends Config {
    @ConfigItem(keyName="noteaaaa2a", name="or unnote when no unnoted items", description="Notes when inventory is full", position=3)
    default public Label noteItem2() {
        return null;
    }

    @ConfigItem(keyName="note", name="Enter item name to use", description="Notes when inventory is full", position=0)
    default public String noteItem() {
        return "";
    }

    @ConfigItem(keyName="notedCheck", name="Enable to unnote mode", description="Unnotes item when none in inv", position=4)
    default public boolean getUnnotedMode() {
        return false;
    }

    @ConfigItem(keyName="noteaaa", name="This will note item when full inv", description="Notes when inventory is full", position=2)
    default public Label noteItem1() {
        return null;
    }
}

