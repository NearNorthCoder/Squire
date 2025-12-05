/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.config;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigTitle;
import net.runelite.client.config.Range;
import net.runelite.client.config.Units;

@ConfigGroup(value="openosrs")
public interface OpenOSRSConfig
extends Config {
    @ConfigTitle(name="Launcher", description="", position=0)
    public static final String launcherTitle = "launcherTitle";
    @ConfigTitle(keyName="updateChannelTitle", name="Update channel", description="", position=1, title="launcherTitle")
    public static final String updateChannelTitle = "updateChannelTitle";
    @ConfigTitle(keyName="miscLauncherTitle", name="Miscellaneous", description="", position=4, title="launcherTitle")
    public static final String miscLauncherTitle = "miscLauncherTitle";
    @ConfigTitle(name="Client", description="", position=6)
    public static final String clientTitle = "clientTitle";
    @ConfigTitle(name="Sync", description="", position=6, title="clientTitle")
    public static final String syncTitle = "syncTitle";
    @ConfigTitle(name="Miscellaneous", description="", position=8, title="clientTitle")
    public static final String miscClientTitle = "miscClientTitle";

    @ConfigItem(position=2, keyName="askMode", name="Prompt for update channel", description="Ask for nightly or stable every startup", title="updateChannelTitle")
    default public boolean askMode() {
        return true;
    }

    @ConfigItem(keyName="bootstrapMode", name="Update channel", description="Select the update channel", title="updateChannelTitle", position=3, hide="askMode")
    default public BootstrapMode bootstrapMode() {
        return BootstrapMode.STABLE;
    }

    @ConfigItem(position=5, keyName="disableHw", name="Disable hardware acceleration", description="Enable this if you have graphical issues", title="miscLauncherTitle", warning="Toggling this setting requires a restart of the client")
    default public boolean disableHw() {
        return false;
    }

    @ConfigItem(keyName="localSync", name="Sync local instances", description="Enables multiple local instances of OpenOSRS to communicate (this enables syncing plugin state and config options)", position=7, title="syncTitle")
    default public boolean localSync() {
        return true;
    }

    @ConfigItem(keyName="enableOpacity", name="Enable opacity", description="Enables opacity for the whole window.<br>NOTE: This only stays enabled if your pc supports this!", position=9, title="miscClientTitle")
    default public boolean enableOpacity() {
        return false;
    }

    @Range(min=15, max=100)
    @ConfigItem(keyName="opacityPercentage", name="Opacity percentage", description="Changes the opacity of the window if opacity is enabled", position=10, title="miscClientTitle", hidden=true, unhide="enableOpacity")
    @Units(value="%")
    default public int opacityPercentage() {
        return 100;
    }

    @ConfigItem(keyName="externalRepos", name="", description="", hidden=true)
    default public String getExternalRepositories() {
        return "";
    }

    @ConfigItem(keyName="externalRepos", name="", description="", hidden=true)
    public void setExternalRepositories(String var1);

    @ConfigItem(keyName="warning", name="", description="", hidden=true)
    default public boolean warning() {
        return true;
    }

    public static enum BootstrapMode {
        STABLE("Stable"),
        NIGHTLY("Nightly");

        private final String name;

        public String toString() {
            return this.getName();
        }

        private String getName() {
            return this.name;
        }

        private BootstrapMode(String name) {
            this.name = name;
        }
    }
}

