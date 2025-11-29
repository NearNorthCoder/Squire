package gg.squire.basics.questing;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;
@ConfigGroup("squirequesthelper")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/questing/SquireQuestHelperConfig.class */
public interface SquireQuestHelperConfig extends Config {
    @ConfigItem(keyName = "useBank", name = "Use bank", description = "Will use bank for item requirements")
    default boolean useBank() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(keyName = "hotkey", name = "Hotkey", description = "Hotkey to toggle the plugin")
    default Keybind pauseRestart() {
        return Keybind.NOT_SET;
    }
}
