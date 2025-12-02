/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.event;

import java.time.Duration;

public class RecordingChangeRequested {
    Duration since;
    long wait;
    boolean cancelled;

    public Duration getSince() {
        return this.since;
    }

    public long getWait() {
        return this.wait;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public RecordingChangeRequested setSince(Duration since) {
        this.since = since;
        return this;
    }

    public RecordingChangeRequested setWait(long wait) {
        this.wait = wait;
        return this;
    }

    public RecordingChangeRequested setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RecordingChangeRequested)) {
            return false;
        }
        RecordingChangeRequested other = (RecordingChangeRequested)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getWait() != other.getWait()) {
            return false;
        }
        if (this.isCancelled() != other.isCancelled()) {
            return false;
        }
        Duration this$since = this.getSince();
        Duration other$since = other.getSince();
        return !(this$since == null ? other$since != null : !((Object)this$since).equals(other$since));
    }

    protected boolean canEqual(Object other) {
        return other instanceof RecordingChangeRequested;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $wait = this.getWait();
        result = result * 59 + (int)($wait >>> 32 ^ $wait);
        result = result * 59 + (this.isCancelled() ? 79 : 97);
        Duration $since = this.getSince();
        result = result * 59 + ($since == null ? 43 : ((Object)$since).hashCode());
        return result;
    }

    public String toString() {
        return "RecordingChangeRequested(since=" + String.valueOf(this.getSince()) + ", wait=" + this.getWait() + ", cancelled=" + this.isCancelled() + ")";
    }
}
