/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.HeadIcon;
import net.runelite.api.Player;

public class OverheadPrayerChanged {
    private final Player player;
    private final HeadIcon oldHeadIcon;
    private final HeadIcon newHeadIcon;

    public OverheadPrayerChanged(Player player, HeadIcon oldHeadIcon, HeadIcon newHeadIcon) {
        this.player = player;
        this.oldHeadIcon = oldHeadIcon;
        this.newHeadIcon = newHeadIcon;
    }

    public Player getPlayer() {
        return this.player;
    }

    public HeadIcon getOldHeadIcon() {
        return this.oldHeadIcon;
    }

    public HeadIcon getNewHeadIcon() {
        return this.newHeadIcon;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OverheadPrayerChanged)) {
            return false;
        }
        OverheadPrayerChanged other = (OverheadPrayerChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Player this$player = this.getPlayer();
        Player other$player = other.getPlayer();
        if (this$player == null ? other$player != null : !this$player.equals(other$player)) {
            return false;
        }
        HeadIcon this$oldHeadIcon = this.getOldHeadIcon();
        HeadIcon other$oldHeadIcon = other.getOldHeadIcon();
        if (this$oldHeadIcon == null ? other$oldHeadIcon != null : !((Object)((Object)this$oldHeadIcon)).equals((Object)other$oldHeadIcon)) {
            return false;
        }
        HeadIcon this$newHeadIcon = this.getNewHeadIcon();
        HeadIcon other$newHeadIcon = other.getNewHeadIcon();
        return !(this$newHeadIcon == null ? other$newHeadIcon != null : !((Object)((Object)this$newHeadIcon)).equals((Object)other$newHeadIcon));
    }

    protected boolean canEqual(Object other) {
        return other instanceof OverheadPrayerChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Player $player = this.getPlayer();
        result = result * 59 + ($player == null ? 43 : $player.hashCode());
        HeadIcon $oldHeadIcon = this.getOldHeadIcon();
        result = result * 59 + ($oldHeadIcon == null ? 43 : ((Object)((Object)$oldHeadIcon)).hashCode());
        HeadIcon $newHeadIcon = this.getNewHeadIcon();
        result = result * 59 + ($newHeadIcon == null ? 43 : ((Object)((Object)$newHeadIcon)).hashCode());
        return result;
    }

    public String toString() {
        return "OverheadPrayerChanged(player=" + String.valueOf(this.getPlayer()) + ", oldHeadIcon=" + String.valueOf((Object)this.getOldHeadIcon()) + ", newHeadIcon=" + String.valueOf((Object)this.getNewHeadIcon()) + ")";
    }
}

