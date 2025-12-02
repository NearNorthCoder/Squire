/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.api.combat;

import gg.squire.api.combat.CombatOption;
import gg.squire.api.combat.CombatOptions;
import java.util.Objects;

public enum AttackStyle {
    ACCURATE,
    AGGRESSIVE,
    CONTROLLED,
    DEFENSIVE,
    MAGIC,
    NONE;


    public boolean isSelected() {
        CombatOption current = CombatOptions.getCurrent();
        if (current == null) {
            return false;
        }
        return Objects.equals((Object)current.getAttackStyle(), (Object)this);
    }

    public boolean isAvailable() {
        return !CombatOptions.getByAttackStyle(this).isEmpty();
    }
}
