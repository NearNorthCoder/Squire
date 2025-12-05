/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public final class HealthBarUpdated {
    private final Actor actor;
    private final int healthRatio;

    public HealthBarUpdated(Actor actor, int healthRatio) {
        this.actor = actor;
        this.healthRatio = healthRatio;
    }

    public Actor getActor() {
        return this.actor;
    }

    public int getHealthRatio() {
        return this.healthRatio;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HealthBarUpdated)) {
            return false;
        }
        HealthBarUpdated other = (HealthBarUpdated)o;
        if (this.getHealthRatio() != other.getHealthRatio()) {
            return false;
        }
        Actor this$actor = this.getActor();
        Actor other$actor = other.getActor();
        return !(this$actor == null ? other$actor != null : !this$actor.equals(other$actor));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getHealthRatio();
        Actor $actor = this.getActor();
        result = result * 59 + ($actor == null ? 43 : $actor.hashCode());
        return result;
    }

    public String toString() {
        return "HealthBarUpdated(actor=" + String.valueOf(this.getActor()) + ", healthRatio=" + this.getHealthRatio() + ")";
    }
}

