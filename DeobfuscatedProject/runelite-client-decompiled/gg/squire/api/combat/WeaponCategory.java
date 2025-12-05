/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.api.combat;

import gg.squire.api.combat.AttackStyle;
import gg.squire.api.combat.AttackType;
import gg.squire.api.combat.CombatOption;
import gg.squire.api.combat.CombatOptions;
import gg.squire.api.combat.CombatStyle;
import java.util.Objects;
import net.runelite.api.Skill;

public enum WeaponCategory {
    UNARMED(0, new CombatOption(CombatStyle.PUNCH, AttackType.CRUSH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.KICK, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), null, new CombatOption(CombatStyle.BLOCK, AttackType.CRUSH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    AXE(1, new CombatOption(CombatStyle.CHOP, AttackType.SLASH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.HACK, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.SMASH, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.BLOCK, AttackType.SLASH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    BLUNT_WEAPON(2, new CombatOption(CombatStyle.POUND, AttackType.CRUSH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.PUMMEL, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), null, new CombatOption(CombatStyle.BLOCK, AttackType.CRUSH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    BOW(3, new CombatOption(CombatStyle.ACCURATE, AttackType.NONE, AttackStyle.NONE, Skill.RANGED), new CombatOption(CombatStyle.RAPID, AttackType.NONE, AttackStyle.NONE, Skill.RANGED), null, new CombatOption(CombatStyle.LONGRANGE, AttackType.NONE, AttackStyle.NONE, Skill.RANGED, Skill.DEFENCE)),
    CLAW(4, new CombatOption(CombatStyle.CHOP, AttackType.SLASH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.SLASH, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.LUNGE, AttackType.STAB, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), new CombatOption(CombatStyle.BLOCK, AttackType.SLASH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    CROSSBOW(5, new CombatOption(CombatStyle.ACCURATE, AttackType.NONE, AttackStyle.NONE, Skill.RANGED), new CombatOption(CombatStyle.RAPID, AttackType.NONE, AttackStyle.NONE, Skill.RANGED), null, new CombatOption(CombatStyle.LONGRANGE, AttackType.NONE, AttackStyle.NONE, Skill.RANGED, Skill.DEFENCE)),
    SALAMANDER(6, new CombatOption(CombatStyle.SCORCH, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.FLARE, AttackType.RANGED, AttackStyle.ACCURATE, Skill.RANGED), new CombatOption(CombatStyle.BLAZE, AttackType.MAGIC, AttackStyle.DEFENSIVE, Skill.MAGIC)),
    CHINCHOMPA(7, new CombatOption(CombatStyle.SHORT_FUSE, AttackType.NONE, AttackStyle.NONE, Skill.RANGED), new CombatOption(CombatStyle.MEDIUM_FUSE, AttackType.NONE, AttackStyle.NONE, Skill.RANGED), null, new CombatOption(CombatStyle.LONG_FUSE, AttackType.NONE, AttackStyle.NONE, Skill.RANGED, Skill.DEFENCE)),
    GUN(8, new CombatOption(CombatStyle.AIM_AND_FIRE, AttackType.NONE, AttackStyle.NONE, new Skill[0]), new CombatOption(CombatStyle.KICK, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH)),
    SLASHING_SWORD(9, new CombatOption(CombatStyle.CHOP, AttackType.SLASH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.SLASH, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.LUNGE, AttackType.STAB, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), new CombatOption(CombatStyle.BLOCK, AttackType.SLASH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    TWO_HANDED_SWORD(10, new CombatOption(CombatStyle.CHOP, AttackType.SLASH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.SLASH, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.SMASH, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.BLOCK, AttackType.SLASH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    PICKAXE(11, new CombatOption(CombatStyle.SPIKE, AttackType.STAB, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.IMPALE, AttackType.STAB, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.SMASH, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.BLOCK, AttackType.STAB, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    HALBERD(12, new CombatOption(CombatStyle.JAB, AttackType.STAB, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), new CombatOption(CombatStyle.SWIPE, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), null, new CombatOption(CombatStyle.FEND, AttackType.STAB, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    POLESTAVE(13, new CombatOption(CombatStyle.BASH, AttackType.CRUSH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.POUND, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), null, new CombatOption(CombatStyle.BLOCK, AttackType.CRUSH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    SCYTHE(14, new CombatOption(CombatStyle.REAP, AttackType.SLASH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.CHOP, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.JAB, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.BLOCK, AttackType.SLASH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    SPEAR(15, new CombatOption(CombatStyle.LUNGE, AttackType.STAB, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), new CombatOption(CombatStyle.SWIPE, AttackType.SLASH, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), new CombatOption(CombatStyle.POUND, AttackType.CRUSH, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), new CombatOption(CombatStyle.BLOCK, AttackType.STAB, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    SPIKED_WEAPON(16, new CombatOption(CombatStyle.POUND, AttackType.CRUSH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.PUMMEL, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.SPIKE, AttackType.STAB, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), new CombatOption(CombatStyle.BLOCK, AttackType.CRUSH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    STABBING_SWORD(17, new CombatOption(CombatStyle.STAB, AttackType.STAB, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.LUNGE, AttackType.STAB, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.SLASH, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.BLOCK, AttackType.STAB, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    STAFF(18, new CombatOption(CombatStyle.BASH, AttackType.CRUSH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.POUND, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), null, new CombatOption(CombatStyle.FOCUS, AttackType.CRUSH, AttackStyle.DEFENSIVE, Skill.DEFENCE), new CombatOption(CombatStyle.SPELL, AttackType.SPELLCASTING, AttackStyle.MAGIC, Skill.MAGIC), new CombatOption(CombatStyle.SPELL_DEFENSIVE, AttackType.DEFENSIVE_CASTING, AttackStyle.MAGIC, Skill.MAGIC, Skill.DEFENCE)),
    THROWN_WEAPON(19, new CombatOption(CombatStyle.ACCURATE, AttackType.NONE, AttackStyle.NONE, Skill.RANGED), new CombatOption(CombatStyle.RAPID, AttackType.NONE, AttackStyle.NONE, Skill.RANGED), null, new CombatOption(CombatStyle.LONGRANGE, AttackType.NONE, AttackStyle.NONE, Skill.RANGED, Skill.DEFENCE)),
    WHIP(20, new CombatOption(CombatStyle.FLICK, AttackType.SLASH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.LASH, AttackType.SLASH, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), null, new CombatOption(CombatStyle.DEFLECT, AttackType.SLASH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    BLADED_STAFF(21, new CombatOption(CombatStyle.JAB, AttackType.STAB, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.SWIPE, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), null, new CombatOption(CombatStyle.FEND, AttackType.CRUSH, AttackStyle.DEFENSIVE, Skill.DEFENCE), new CombatOption(CombatStyle.SPELL, AttackType.SPELLCASTING, AttackStyle.MAGIC, Skill.MAGIC), new CombatOption(CombatStyle.SPELL_DEFENSIVE, AttackType.DEFENSIVE_CASTING, AttackStyle.MAGIC, Skill.MAGIC, Skill.DEFENCE)),
    TYPE_22(22, new CombatOption(CombatStyle.CHOP, AttackType.SLASH, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.SLASH, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.SMASH, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.BLOCK, AttackType.SLASH, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    TRIDENT_WEAPON(23, new CombatOption(CombatStyle.ACCURATE, AttackType.NONE, AttackStyle.NONE, Skill.MAGIC), new CombatOption(CombatStyle.ACCURATE, AttackType.NONE, AttackStyle.NONE, Skill.MAGIC), null, new CombatOption(CombatStyle.LONGRANGE, AttackType.NONE, AttackStyle.NONE, Skill.MAGIC, Skill.DEFENCE)),
    TYPE_24(24, new CombatOption(CombatStyle.LUNGE, AttackType.STAB, AttackStyle.ACCURATE, Skill.ATTACK), new CombatOption(CombatStyle.SWIPE, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.POUND, AttackType.CRUSH, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), new CombatOption(CombatStyle.BLOCK, AttackType.STAB, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    TYPE_25(25, new CombatOption(CombatStyle.JAB, AttackType.STAB, AttackStyle.CONTROLLED, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE), new CombatOption(CombatStyle.SWIPE, AttackType.SLASH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), null, new CombatOption(CombatStyle.FEND, AttackType.STAB, AttackStyle.DEFENSIVE, Skill.DEFENCE)),
    ABYSSAL_BLUDGEON(26, new CombatOption(CombatStyle.POUND, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), new CombatOption(CombatStyle.PUMMEL, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH), null, new CombatOption(CombatStyle.SMASH, AttackType.CRUSH, AttackStyle.AGGRESSIVE, Skill.STRENGTH)),
    BULWARK(27, new CombatOption(CombatStyle.PUMMEL, AttackType.CRUSH, AttackStyle.ACCURATE, Skill.ATTACK), null, null, new CombatOption(CombatStyle.BLOCK, AttackType.NONE, AttackStyle.NONE, new Skill[0])),
    TYPE_28(28, new CombatOption(CombatStyle.ACCURATE, AttackType.NONE, AttackStyle.NONE, Skill.MAGIC), new CombatOption(CombatStyle.ACCURATE, AttackType.NONE, AttackStyle.NONE, Skill.MAGIC), null, new CombatOption(CombatStyle.LONGRANGE, AttackType.NONE, AttackStyle.NONE, Skill.MAGIC, Skill.DEFENCE)),
    TYPE_29(29, new CombatOption[0]);

    private final int varpValue;
    private final CombatOption[] combatOptions;

    private WeaponCategory(int varpValue, CombatOption ... combatOptions) {
        this.varpValue = varpValue;
        this.combatOptions = combatOptions;
    }

    public boolean isSelected() {
        return Objects.equals((Object)CombatOptions.getCurrentWeaponCategory(), (Object)this);
    }

    public int getVarpValue() {
        return this.varpValue;
    }

    public CombatOption[] getCombatOptions() {
        return this.combatOptions;
    }
}

