/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.Player;
import net.runelite.api.SkullIcon;

public class PlayerSkullChanged {
    private final Player player;
    private final SkullIcon oldSkullIcon;
    private final SkullIcon newSkullIcon;

    public PlayerSkullChanged(Player player, SkullIcon oldSkullIcon, SkullIcon newSkullIcon) {
        this.player = player;
        this.oldSkullIcon = oldSkullIcon;
        this.newSkullIcon = newSkullIcon;
    }

    public Player getPlayer() {
        return this.player;
    }

    public SkullIcon getOldSkullIcon() {
        return this.oldSkullIcon;
    }

    public SkullIcon getNewSkullIcon() {
        return this.newSkullIcon;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayerSkullChanged)) {
            return false;
        }
        PlayerSkullChanged other = (PlayerSkullChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Player this$player = this.getPlayer();
        Player other$player = other.getPlayer();
        if (this$player == null ? other$player != null : !this$player.equals(other$player)) {
            return false;
        }
        SkullIcon this$oldSkullIcon = this.getOldSkullIcon();
        SkullIcon other$oldSkullIcon = other.getOldSkullIcon();
        if (this$oldSkullIcon == null ? other$oldSkullIcon != null : !((Object)((Object)this$oldSkullIcon)).equals((Object)other$oldSkullIcon)) {
            return false;
        }
        SkullIcon this$newSkullIcon = this.getNewSkullIcon();
        SkullIcon other$newSkullIcon = other.getNewSkullIcon();
        return !(this$newSkullIcon == null ? other$newSkullIcon != null : !((Object)((Object)this$newSkullIcon)).equals((Object)other$newSkullIcon));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlayerSkullChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Player $player = this.getPlayer();
        result = result * 59 + ($player == null ? 43 : $player.hashCode());
        SkullIcon $oldSkullIcon = this.getOldSkullIcon();
        result = result * 59 + ($oldSkullIcon == null ? 43 : ((Object)((Object)$oldSkullIcon)).hashCode());
        SkullIcon $newSkullIcon = this.getNewSkullIcon();
        result = result * 59 + ($newSkullIcon == null ? 43 : ((Object)((Object)$newSkullIcon)).hashCode());
        return result;
    }

    public String toString() {
        return "PlayerSkullChanged(player=" + String.valueOf(this.getPlayer()) + ", oldSkullIcon=" + String.valueOf((Object)this.getOldSkullIcon()) + ", newSkullIcon=" + String.valueOf((Object)this.getNewSkullIcon()) + ")";
    }
}

