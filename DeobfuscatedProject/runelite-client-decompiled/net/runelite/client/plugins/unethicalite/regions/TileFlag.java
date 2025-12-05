/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.unethicalite.regions;

public class TileFlag {
    private int x;
    private int y;
    private int z;
    private int flag;
    private int region;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getRegion() {
        return this.region;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TileFlag)) {
            return false;
        }
        TileFlag other = (TileFlag)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        if (this.getZ() != other.getZ()) {
            return false;
        }
        if (this.getFlag() != other.getFlag()) {
            return false;
        }
        return this.getRegion() == other.getRegion();
    }

    protected boolean canEqual(Object other) {
        return other instanceof TileFlag;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        result = result * 59 + this.getZ();
        result = result * 59 + this.getFlag();
        result = result * 59 + this.getRegion();
        return result;
    }

    public String toString() {
        return "TileFlag(x=" + this.getX() + ", y=" + this.getY() + ", z=" + this.getZ() + ", flag=" + this.getFlag() + ", region=" + this.getRegion() + ")";
    }

    public TileFlag(int x, int y, int z, int flag, int region) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.flag = flag;
        this.region = region;
    }
}

