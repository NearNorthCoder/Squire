/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.Player;

public final class PlayerCompositionChanged {
    private final Player player;

    public PlayerCompositionChanged(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayerCompositionChanged)) {
            return false;
        }
        PlayerCompositionChanged other = (PlayerCompositionChanged)o;
        Player this$player = this.getPlayer();
        Player other$player = other.getPlayer();
        return !(this$player == null ? other$player != null : !this$player.equals(other$player));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Player $player = this.getPlayer();
        result = result * 59 + ($player == null ? 43 : $player.hashCode());
        return result;
    }

    public String toString() {
        return "PlayerCompositionChanged(player=" + String.valueOf(this.getPlayer()) + ")";
    }
}

