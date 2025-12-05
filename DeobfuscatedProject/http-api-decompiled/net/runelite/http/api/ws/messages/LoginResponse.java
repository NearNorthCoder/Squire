/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ws.messages;

import net.runelite.http.api.ws.WebsocketMessage;

public class LoginResponse
extends WebsocketMessage {
    private String username;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LoginResponse)) {
            return false;
        }
        LoginResponse other = (LoginResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        return !(this$username == null ? other$username != null : !this$username.equals(other$username));
    }

    protected boolean canEqual(Object other) {
        return other instanceof LoginResponse;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        return result;
    }

    public String toString() {
        return "LoginResponse(username=" + this.getUsername() + ")";
    }
}

