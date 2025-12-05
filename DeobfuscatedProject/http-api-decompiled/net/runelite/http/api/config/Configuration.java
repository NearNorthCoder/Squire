/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.config;

import java.util.Map;

public class Configuration {
    private long rev;
    Map<String, String> config;

    public long getRev() {
        return this.rev;
    }

    public Map<String, String> getConfig() {
        return this.config;
    }

    public void setRev(long rev) {
        this.rev = rev;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Configuration)) {
            return false;
        }
        Configuration other = (Configuration)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getRev() != other.getRev()) {
            return false;
        }
        Map<String, String> this$config = this.getConfig();
        Map<String, String> other$config = other.getConfig();
        return !(this$config == null ? other$config != null : !((Object)this$config).equals(other$config));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Configuration;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $rev = this.getRev();
        result = result * 59 + (int)($rev >>> 32 ^ $rev);
        Map<String, String> $config = this.getConfig();
        result = result * 59 + ($config == null ? 43 : ((Object)$config).hashCode());
        return result;
    }

    public String toString() {
        return "Configuration(rev=" + this.getRev() + ", config=" + String.valueOf(this.getConfig()) + ")";
    }

    public Configuration(long rev, Map<String, String> config) {
        this.rev = rev;
        this.config = config;
    }
}

