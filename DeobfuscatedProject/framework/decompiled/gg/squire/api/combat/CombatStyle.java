/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.api.combat;

import gg.squire.api.combat.CombatOption;
import gg.squire.api.combat.CombatOptions;
import java.util.Objects;

public enum CombatStyle {
    ACCURATE,
    AIM_AND_FIRE,
    BASH,
    BLAZE,
    BLOCK,
    CHOP,
    DEFLECT,
    EXPLOSIVE,
    FEND,
    FLAMER,
    FLARE,
    FLICK,
    FOCUS,
    HACK,
    IMPALE,
    JAB,
    KICK,
    LASH,
    LONG_FUSE,
    LONGRANGE,
    LUNGE,
    MEDIUM_FUSE,
    POUND,
    PUMMEL,
    PUNCH,
    RAPID,
    REAP,
    SCORCH,
    SHORT_FUSE,
    SLASH,
    SMASH,
    SPELL,
    SPELL_DEFENSIVE,
    SPIKE,
    STAB,
    SWIPE;

    private final String action;

    private CombatStyle() {
        this(null);
    }

    private CombatStyle(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }

    public boolean isSelected() {
        CombatOption current = CombatOptions.getCurrent();
        if (current == null) {
            return false;
        }
        return Objects.equals((Object)current.getCombatStyle(), (Object)this);
    }

    public boolean isAvailable() {
        return !CombatOptions.getByCombatStyle(this).isEmpty();
    }
}
