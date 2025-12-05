/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.devtools;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup(value="devtools")
public interface DevToolsConfig
extends Config {
    @ConfigItem(keyName="inspectorAlwaysOnTop", name="", description="", hidden=true)
    default public boolean inspectorAlwaysOnTop() {
        return false;
    }

    @ConfigItem(keyName="inspectorAlwaysOnTop", name="", description="")
    public void inspectorAlwaysOnTop(boolean var1);

    @ConfigItem(keyName="swingInspectorHotkey", name="Swing Inspector", description="Hotkey to open the Swing inspector, if available")
    default public Keybind swingInspectorHotkey() {
        return Keybind.NOT_SET;
    }
}

