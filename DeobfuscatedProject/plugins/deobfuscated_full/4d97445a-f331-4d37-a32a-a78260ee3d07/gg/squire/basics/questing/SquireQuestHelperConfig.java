/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Keybind
 */
package gg.squire.basics.questing;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup(value="squirequesthelper")
public interface SquireQuestHelperConfig
extends Config {
    @ConfigItem(keyName="useBank", name="Use bank", description="Will use bank for item requirements")
    default public boolean useBank() {
        return false;
    }

    @ConfigItem(keyName="hotkey", name="Hotkey", description="Hotkey to toggle the plugin")
    default public Keybind pauseRestart() {
        return Keybind.NOT_SET;
    }
}

