/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.api.combat;

import gg.squire.api.combat.CombatOption;
import gg.squire.api.combat.CombatOptions;
import java.util.Objects;

public enum AttackType {
    CRUSH,
    DEFENSIVE_CASTING,
    EMITS_A_JET_OF_FLAME,
    FIRES_AN_EXPLOSIVE_ROUND,
    MAGIC,
    NONE,
    RANGED,
    SLASH,
    SPELLCASTING,
    STAB;


    public boolean isSelected() {
        CombatOption current = CombatOptions.getCurrent();
        if (current == null) {
            return false;
        }
        return Objects.equals((Object)current.getAttackType(), (Object)this);
    }

    public boolean isAvailable() {
        return !CombatOptions.getByAttackType(this).isEmpty();
    }
}
