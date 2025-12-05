/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ws.messages.party;

import java.util.UUID;
import net.runelite.http.api.ws.messages.party.PartyMessage;

public abstract class PartyMemberMessage
extends PartyMessage {
    private UUID memberId;

    public UUID getMemberId() {
        return this.memberId;
    }

    public void setMemberId(UUID memberId) {
        this.memberId = memberId;
    }
}

