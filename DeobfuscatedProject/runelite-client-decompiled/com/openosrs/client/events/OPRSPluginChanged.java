/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.events;

import net.runelite.client.plugins.Plugin;

public class OPRSPluginChanged {
    private final String pluginId;
    private final Plugin plugin;
    private final boolean added;

    public OPRSPluginChanged(String pluginId, Plugin plugin, boolean added) {
        this.pluginId = pluginId;
        this.plugin = plugin;
        this.added = added;
    }

    public String getPluginId() {
        return this.pluginId;
    }

    public Plugin getPlugin() {
        return this.plugin;
    }

    public boolean isAdded() {
        return this.added;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OPRSPluginChanged)) {
            return false;
        }
        OPRSPluginChanged other = (OPRSPluginChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isAdded() != other.isAdded()) {
            return false;
        }
        String this$pluginId = this.getPluginId();
        String other$pluginId = other.getPluginId();
        if (this$pluginId == null ? other$pluginId != null : !this$pluginId.equals(other$pluginId)) {
            return false;
        }
        Plugin this$plugin = this.getPlugin();
        Plugin other$plugin = other.getPlugin();
        return !(this$plugin == null ? other$plugin != null : !((Object)this$plugin).equals(other$plugin));
    }

    protected boolean canEqual(Object other) {
        return other instanceof OPRSPluginChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isAdded() ? 79 : 97);
        String $pluginId = this.getPluginId();
        result = result * 59 + ($pluginId == null ? 43 : $pluginId.hashCode());
        Plugin $plugin = this.getPlugin();
        result = result * 59 + ($plugin == null ? 43 : ((Object)$plugin).hashCode());
        return result;
    }

    public String toString() {
        return "OPRSPluginChanged(pluginId=" + this.getPluginId() + ", plugin=" + String.valueOf(this.getPlugin()) + ", added=" + this.isAdded() + ")";
    }
}

