/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ws.messages;

import java.util.UUID;
import net.runelite.http.api.ws.WebsocketMessage;

public class Handshake
extends WebsocketMessage {
    private UUID session;

    public UUID getSession() {
        return this.session;
    }

    public void setSession(UUID session) {
        this.session = session;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Handshake)) {
            return false;
        }
        Handshake other = (Handshake)o;
        if (!other.canEqual(this)) {
            return false;
        }
        UUID this$session = this.getSession();
        UUID other$session = other.getSession();
        return !(this$session == null ? other$session != null : !((Object)this$session).equals(other$session));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Handshake;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        UUID $session = this.getSession();
        result = result * 59 + ($session == null ? 43 : ((Object)$session).hashCode());
        return result;
    }

    public String toString() {
        return "Handshake(session=" + String.valueOf(this.getSession()) + ")";
    }
}

