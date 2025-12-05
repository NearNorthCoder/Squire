/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

public class DynamicObjectAnimationChanged {
    private int object;
    private int animation;

    public int getObject() {
        return this.object;
    }

    public int getAnimation() {
        return this.animation;
    }

    public void setObject(int object) {
        this.object = object;
    }

    public void setAnimation(int animation) {
        this.animation = animation;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DynamicObjectAnimationChanged)) {
            return false;
        }
        DynamicObjectAnimationChanged other = (DynamicObjectAnimationChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getObject() != other.getObject()) {
            return false;
        }
        return this.getAnimation() == other.getAnimation();
    }

    protected boolean canEqual(Object other) {
        return other instanceof DynamicObjectAnimationChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getObject();
        result = result * 59 + this.getAnimation();
        return result;
    }

    public String toString() {
        return "DynamicObjectAnimationChanged(object=" + this.getObject() + ", animation=" + this.getAnimation() + ")";
    }
}

