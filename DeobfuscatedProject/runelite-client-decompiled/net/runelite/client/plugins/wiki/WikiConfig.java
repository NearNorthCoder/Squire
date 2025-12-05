/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.wiki;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="wiki")
public interface WikiConfig
extends Config {
    @ConfigItem(keyName="leftClickSearch", name="Left Click Search", description="Swap left-click on the Wiki button to Search", position=1)
    default public boolean leftClickSearch() {
        return false;
    }

    @ConfigItem(keyName="showWikiMinimapButton", name="Show wiki button under minimap", description="Shows the wiki lookup button under the minimap.<br>Overrides 'Show Wiki entity lookup' in the RuneScape settings.", position=2)
    default public boolean showWikiMinimapButton() {
        return true;
    }
}

