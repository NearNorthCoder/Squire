/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

public final class PresenceGameState {
    private final boolean presence;
    private final int gameState;

    public PresenceGameState(boolean presence, int gameState) {
        this.presence = presence;
        this.gameState = gameState;
    }

    public boolean isPresence() {
        return this.presence;
    }

    public int getGameState() {
        return this.gameState;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PresenceGameState)) {
            return false;
        }
        PresenceGameState other = (PresenceGameState)o;
        if (this.isPresence() != other.isPresence()) {
            return false;
        }
        return this.getGameState() == other.getGameState();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isPresence() ? 79 : 97);
        result = result * 59 + this.getGameState();
        return result;
    }

    public String toString() {
        return "PresenceGameState(presence=" + this.isPresence() + ", gameState=" + this.getGameState() + ")";
    }
}

