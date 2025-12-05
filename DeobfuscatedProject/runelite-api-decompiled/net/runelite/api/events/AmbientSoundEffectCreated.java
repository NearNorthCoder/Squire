/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.AmbientSoundEffect;

public final class AmbientSoundEffectCreated {
    private final AmbientSoundEffect ambientSoundEffect;

    public AmbientSoundEffectCreated(AmbientSoundEffect ambientSoundEffect) {
        this.ambientSoundEffect = ambientSoundEffect;
    }

    public AmbientSoundEffect getAmbientSoundEffect() {
        return this.ambientSoundEffect;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AmbientSoundEffectCreated)) {
            return false;
        }
        AmbientSoundEffectCreated other = (AmbientSoundEffectCreated)o;
        AmbientSoundEffect this$ambientSoundEffect = this.getAmbientSoundEffect();
        AmbientSoundEffect other$ambientSoundEffect = other.getAmbientSoundEffect();
        return !(this$ambientSoundEffect == null ? other$ambientSoundEffect != null : !this$ambientSoundEffect.equals(other$ambientSoundEffect));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        AmbientSoundEffect $ambientSoundEffect = this.getAmbientSoundEffect();
        result = result * 59 + ($ambientSoundEffect == null ? 43 : $ambientSoundEffect.hashCode());
        return result;
    }

    public String toString() {
        return "AmbientSoundEffectCreated(ambientSoundEffect=" + String.valueOf(this.getAmbientSoundEffect()) + ")";
    }
}

