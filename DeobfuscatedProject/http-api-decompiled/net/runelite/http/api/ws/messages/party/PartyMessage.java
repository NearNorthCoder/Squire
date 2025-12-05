/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ws.messages.party;

import net.runelite.http.api.ws.WebsocketMessage;

public abstract class PartyMessage
extends WebsocketMessage {
    public PartyMessage() {
        this._party = true;
    }
}

