/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

public class VarpChanged {
    private int index;

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VarpChanged)) {
            return false;
        }
        VarpChanged other = (VarpChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getIndex() == other.getIndex();
    }

    protected boolean canEqual(Object other) {
        return other instanceof VarpChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getIndex();
        return result;
    }

    public String toString() {
        return "VarpChanged(index=" + this.getIndex() + ")";
    }
}

