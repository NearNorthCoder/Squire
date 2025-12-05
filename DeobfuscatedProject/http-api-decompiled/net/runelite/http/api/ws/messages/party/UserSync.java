/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ws.messages.party;

import net.runelite.http.api.ws.messages.party.PartyMemberMessage;

public final class UserSync
extends PartyMemberMessage {
    public String toString() {
        return "UserSync()";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserSync)) {
            return false;
        }
        UserSync other = (UserSync)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return super.equals(o);
    }

    protected boolean canEqual(Object other) {
        return other instanceof UserSync;
    }

    public int hashCode() {
        int result = super.hashCode();
        return result;
    }
}

