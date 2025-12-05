/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.Animation;

public final class PostAnimation {
    private final Animation animation;

    public PostAnimation(Animation animation) {
        this.animation = animation;
    }

    public Animation getAnimation() {
        return this.animation;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PostAnimation)) {
            return false;
        }
        PostAnimation other = (PostAnimation)o;
        Animation this$animation = this.getAnimation();
        Animation other$animation = other.getAnimation();
        return !(this$animation == null ? other$animation != null : !this$animation.equals(other$animation));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Animation $animation = this.getAnimation();
        result = result * 59 + ($animation == null ? 43 : $animation.hashCode());
        return result;
    }

    public String toString() {
        return "PostAnimation(animation=" + String.valueOf(this.getAnimation()) + ")";
    }
}

