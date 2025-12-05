/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 */
package com.openosrs.client.events;

import com.openosrs.client.game.AttackStyle;
import net.runelite.api.Player;

public final class AttackStyleChanged {
    private final Player player;
    private final AttackStyle oldStyle;
    private final AttackStyle newStyle;

    public AttackStyleChanged(Player player, AttackStyle oldStyle, AttackStyle newStyle) {
        this.player = player;
        this.oldStyle = oldStyle;
        this.newStyle = newStyle;
    }

    public Player getPlayer() {
        return this.player;
    }

    public AttackStyle getOldStyle() {
        return this.oldStyle;
    }

    public AttackStyle getNewStyle() {
        return this.newStyle;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttackStyleChanged)) {
            return false;
        }
        AttackStyleChanged other = (AttackStyleChanged)o;
        Player this$player = this.getPlayer();
        Player other$player = other.getPlayer();
        if (this$player == null ? other$player != null : !this$player.equals(other$player)) {
            return false;
        }
        AttackStyle this$oldStyle = this.getOldStyle();
        AttackStyle other$oldStyle = other.getOldStyle();
        if (this$oldStyle == null ? other$oldStyle != null : !((Object)((Object)this$oldStyle)).equals((Object)other$oldStyle)) {
            return false;
        }
        AttackStyle this$newStyle = this.getNewStyle();
        AttackStyle other$newStyle = other.getNewStyle();
        return !(this$newStyle == null ? other$newStyle != null : !((Object)((Object)this$newStyle)).equals((Object)other$newStyle));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Player $player = this.getPlayer();
        result = result * 59 + ($player == null ? 43 : $player.hashCode());
        AttackStyle $oldStyle = this.getOldStyle();
        result = result * 59 + ($oldStyle == null ? 43 : ((Object)((Object)$oldStyle)).hashCode());
        AttackStyle $newStyle = this.getNewStyle();
        result = result * 59 + ($newStyle == null ? 43 : ((Object)((Object)$newStyle)).hashCode());
        return result;
    }

    public String toString() {
        return "AttackStyleChanged(player=" + String.valueOf(this.getPlayer()) + ", oldStyle=" + String.valueOf((Object)this.getOldStyle()) + ", newStyle=" + String.valueOf((Object)this.getNewStyle()) + ")";
    }
}

