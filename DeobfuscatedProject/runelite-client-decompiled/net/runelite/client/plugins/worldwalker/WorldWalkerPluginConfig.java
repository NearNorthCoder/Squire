/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.worldwalker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup(value="sqworldwalker")
public interface WorldWalkerPluginConfig
extends Config {
    @ConfigItem(keyName="herbspots", name="List herb spots", description="Adds a list of herb spots to the world map right click menu", position=0)
    default public boolean herbSpots() {
        return true;
    }

    @ConfigItem(keyName="treespots", name="List tree spots", description="Adds a list of tree spots to the world map right click menu", position=1)
    default public boolean treeSpots() {
        return true;
    }

    @ConfigItem(keyName="fruitTreeSpots", name="List fruit tree spots", description="Adds a list of fruit tree spots to the world map right click menu", position=2)
    default public boolean fruitTreeSpots() {
        return true;
    }

    @ConfigItem(keyName="nearestBank", name="Nearest bank", description="Adds a nearest bank option to the world map right click menu", position=2)
    default public boolean bank() {
        return true;
    }

    @ConfigItem(keyName="nearestBankHotkey", name="Nearest bank hotkey", description="Go to Nearest bank using this hotkey", position=3)
    default public Keybind nearestBankHotkey() {
        return Keybind.NOT_SET;
    }
}

