/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.core.loader.net;

public class LicenseVerificationRequest {
    private String ip;
    private String key;
    private String plugin;
    private String hash;
    private String agent;

    public String ip() {
        return this.ip;
    }

    public String key() {
        return this.key;
    }

    public String plugin() {
        return this.plugin;
    }

    public String hash() {
        return this.hash;
    }

    public String agent() {
        return this.agent;
    }

    public LicenseVerificationRequest ip(String ip) {
        this.ip = ip;
        return this;
    }

    public LicenseVerificationRequest key(String key) {
        this.key = key;
        return this;
    }

    public LicenseVerificationRequest plugin(String plugin) {
        this.plugin = plugin;
        return this;
    }

    public LicenseVerificationRequest hash(String hash) {
        this.hash = hash;
        return this;
    }

    public LicenseVerificationRequest agent(String agent) {
        this.agent = agent;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LicenseVerificationRequest)) {
            return false;
        }
        LicenseVerificationRequest other = (LicenseVerificationRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$ip = this.ip();
        String other$ip = other.ip();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) {
            return false;
        }
        String this$key = this.key();
        String other$key = other.key();
        if (this$key == null ? other$key != null : !this$key.equals(other$key)) {
            return false;
        }
        String this$plugin = this.plugin();
        String other$plugin = other.plugin();
        if (this$plugin == null ? other$plugin != null : !this$plugin.equals(other$plugin)) {
            return false;
        }
        String this$hash = this.hash();
        String other$hash = other.hash();
        if (this$hash == null ? other$hash != null : !this$hash.equals(other$hash)) {
            return false;
        }
        String this$agent = this.agent();
        String other$agent = other.agent();
        return !(this$agent == null ? other$agent != null : !this$agent.equals(other$agent));
    }

    protected boolean canEqual(Object other) {
        return other instanceof LicenseVerificationRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $ip = this.ip();
        result = result * 59 + ($ip == null ? 43 : $ip.hashCode());
        String $key = this.key();
        result = result * 59 + ($key == null ? 43 : $key.hashCode());
        String $plugin = this.plugin();
        result = result * 59 + ($plugin == null ? 43 : $plugin.hashCode());
        String $hash = this.hash();
        result = result * 59 + ($hash == null ? 43 : $hash.hashCode());
        String $agent = this.agent();
        result = result * 59 + ($agent == null ? 43 : $agent.hashCode());
        return result;
    }

    public String toString() {
        return "LicenseVerificationRequest(ip=" + this.ip() + ", key=" + this.key() + ", plugin=" + this.plugin() + ", hash=" + this.hash() + ", agent=" + this.agent() + ")";
    }
}

