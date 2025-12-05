package gg.squire.combat;

import net.runelite.api.coords.WorldPoint;

/**
 * Represents a loot item that should be picked up.
 * Tracks the location and item ID of loot on the ground.
 */
public class LootTarget {
    private WorldPoint location;
    private int itemId;

    /**
     * Sets the world location of the loot.
     *
     * @param location WorldPoint where the loot is located
     */
    public void setLocation(WorldPoint location) {
        this.location = location;
    }

    /**
     * Gets the world location of the loot.
     *
     * @return WorldPoint of the loot
     */
    public WorldPoint getLocation() {
        return this.location;
    }

    /**
     * Sets the item ID of the loot.
     *
     * @param itemId RuneScape item ID
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * Gets the item ID of the loot.
     *
     * @return RuneScape item ID
     */
    public int getItemId() {
        return this.itemId;
    }

    @Override
    public String toString() {
        return "LootTarget(location=" + String.valueOf(this.getLocation()) +
               ", id=" + this.getItemId() + ")";
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result * 31 + this.getItemId();
        WorldPoint loc = this.getLocation();
        result = result * 31 + (loc == null ? 43 : loc.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LootTarget)) {
            return false;
        }
        LootTarget other = (LootTarget) obj;
        if (!this.canEqual(other)) {
            return false;
        }
        if (this.getItemId() != other.getItemId()) {
            return false;
        }
        WorldPoint thisLoc = this.getLocation();
        WorldPoint otherLoc = other.getLocation();
        if (thisLoc == null) {
            return otherLoc != null ? false : true;
        }
        return thisLoc.equals(otherLoc) ? true : false;
    }

    protected boolean canEqual(Object other) {
        return other instanceof LootTarget;
    }
}
