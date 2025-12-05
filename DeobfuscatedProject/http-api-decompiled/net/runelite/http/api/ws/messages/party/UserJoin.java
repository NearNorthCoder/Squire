/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ws.messages.party;

import java.util.UUID;
import net.runelite.http.api.ws.WebsocketMessage;

public final class UserJoin
extends WebsocketMessage {
    private final UUID memberId;
    private final UUID partyId;
    private final String name;

    public UserJoin(UUID memberId, UUID partyId, String name) {
        this.memberId = memberId;
        this.partyId = partyId;
        this.name = name;
    }

    public UUID getMemberId() {
        return this.memberId;
    }

    public UUID getPartyId() {
        return this.partyId;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "UserJoin(memberId=" + String.valueOf(this.getMemberId()) + ", partyId=" + String.valueOf(this.getPartyId()) + ", name=" + this.getName() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserJoin)) {
            return false;
        }
        UserJoin other = (UserJoin)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        UUID this$memberId = this.getMemberId();
        UUID other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !((Object)this$memberId).equals(other$memberId)) {
            return false;
        }
        UUID this$partyId = this.getPartyId();
        UUID other$partyId = other.getPartyId();
        if (this$partyId == null ? other$partyId != null : !((Object)this$partyId).equals(other$partyId)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        return !(this$name == null ? other$name != null : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UserJoin;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        UUID $memberId = this.getMemberId();
        result = result * 59 + ($memberId == null ? 43 : ((Object)$memberId).hashCode());
        UUID $partyId = this.getPartyId();
        result = result * 59 + ($partyId == null ? 43 : ((Object)$partyId).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }
}

