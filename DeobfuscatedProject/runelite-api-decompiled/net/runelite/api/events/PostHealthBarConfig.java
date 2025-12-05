/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.HealthBarConfig;

public class PostHealthBarConfig {
    private HealthBarConfig healthBarConfig;

    public HealthBarConfig getHealthBarConfig() {
        return this.healthBarConfig;
    }

    public void setHealthBarConfig(HealthBarConfig healthBarConfig) {
        this.healthBarConfig = healthBarConfig;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PostHealthBarConfig)) {
            return false;
        }
        PostHealthBarConfig other = (PostHealthBarConfig)o;
        if (!other.canEqual(this)) {
            return false;
        }
        HealthBarConfig this$healthBarConfig = this.getHealthBarConfig();
        HealthBarConfig other$healthBarConfig = other.getHealthBarConfig();
        return !(this$healthBarConfig == null ? other$healthBarConfig != null : !this$healthBarConfig.equals(other$healthBarConfig));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PostHealthBarConfig;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        HealthBarConfig $healthBarConfig = this.getHealthBarConfig();
        result = result * 59 + ($healthBarConfig == null ? 43 : $healthBarConfig.hashCode());
        return result;
    }

    public String toString() {
        return "PostHealthBarConfig(healthBarConfig=" + String.valueOf(this.getHealthBarConfig()) + ")";
    }
}

