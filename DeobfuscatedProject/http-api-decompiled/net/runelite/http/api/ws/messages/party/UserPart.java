/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ws.messages.party;

import java.util.UUID;
import net.runelite.http.api.ws.WebsocketMessage;

public final class UserPart
extends WebsocketMessage {
    private final UUID memberId;

    public UserPart(UUID memberId) {
        this.memberId = memberId;
    }

    public UUID getMemberId() {
        return this.memberId;
    }

    public String toString() {
        return "UserPart(memberId=" + String.valueOf(this.getMemberId()) + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserPart)) {
            return false;
        }
        UserPart other = (UserPart)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        UUID this$memberId = this.getMemberId();
        UUID other$memberId = other.getMemberId();
        return !(this$memberId == null ? other$memberId != null : !((Object)this$memberId).equals(other$memberId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UserPart;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        UUID $memberId = this.getMemberId();
        result = result * 59 + ($memberId == null ? 43 : ((Object)$memberId).hashCode());
        return result;
    }
}

