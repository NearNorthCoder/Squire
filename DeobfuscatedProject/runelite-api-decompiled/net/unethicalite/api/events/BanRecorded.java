/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.events;

public class BanRecorded {
    String username;
    String discordId;
    String time;

    public String getUsername() {
        return this.username;
    }

    public String getDiscordId() {
        return this.discordId;
    }

    public String getTime() {
        return this.time;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDiscordId(String discordId) {
        this.discordId = discordId;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BanRecorded)) {
            return false;
        }
        BanRecorded other = (BanRecorded)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$discordId = this.getDiscordId();
        String other$discordId = other.getDiscordId();
        if (this$discordId == null ? other$discordId != null : !this$discordId.equals(other$discordId)) {
            return false;
        }
        String this$time = this.getTime();
        String other$time = other.getTime();
        return !(this$time == null ? other$time != null : !this$time.equals(other$time));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BanRecorded;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $discordId = this.getDiscordId();
        result = result * 59 + ($discordId == null ? 43 : $discordId.hashCode());
        String $time = this.getTime();
        result = result * 59 + ($time == null ? 43 : $time.hashCode());
        return result;
    }

    public String toString() {
        return "BanRecorded(username=" + this.getUsername() + ", discordId=" + this.getDiscordId() + ", time=" + this.getTime() + ")";
    }
}

