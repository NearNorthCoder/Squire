/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.config;

import java.util.List;

public final class ConfigPatchResult {
    private final Long rev;
    private final List<String> failures;

    public ConfigPatchResult(Long rev, List<String> failures) {
        this.rev = rev;
        this.failures = failures;
    }

    public Long getRev() {
        return this.rev;
    }

    public List<String> getFailures() {
        return this.failures;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ConfigPatchResult)) {
            return false;
        }
        ConfigPatchResult other = (ConfigPatchResult)o;
        Long this$rev = this.getRev();
        Long other$rev = other.getRev();
        if (this$rev == null ? other$rev != null : !((Object)this$rev).equals(other$rev)) {
            return false;
        }
        List<String> this$failures = this.getFailures();
        List<String> other$failures = other.getFailures();
        return !(this$failures == null ? other$failures != null : !((Object)this$failures).equals(other$failures));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $rev = this.getRev();
        result = result * 59 + ($rev == null ? 43 : ((Object)$rev).hashCode());
        List<String> $failures = this.getFailures();
        result = result * 59 + ($failures == null ? 43 : ((Object)$failures).hashCode());
        return result;
    }

    public String toString() {
        return "ConfigPatchResult(rev=" + this.getRev() + ", failures=" + String.valueOf(this.getFailures()) + ")";
    }
}

