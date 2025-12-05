/*
 * Deobfuscated with CFR 0.152.
 *
 * Teleport Spell Enum
 * Enumeration of teleportation spells with level requirements.
 *
 * Original obfuscated class: aW
 * Package: i.i.b.s.c.q.r.s.s.-.u.a.e
 */
package gg.squire.basics.enums;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/**
 * Enumeration of standard spellbook teleportation spells.
 * Each teleport has an associated magic level requirement.
 */
public enum TeleportSpell {

    /**
     * Varrock Teleport - Level 25 Magic required.
     */
    VARROCK(SpellBook.Standard.VARROCK_TELEPORT, 25),

    /**
     * Lumbridge Teleport - Level 31 Magic required.
     */
    LUMBRIDGE(SpellBook.Standard.LUMBRIDGE_TELEPORT, 31),

    /**
     * Falador Teleport - Level 37 Magic required.
     */
    FALADOR(SpellBook.Standard.FALADOR_TELEPORT, 37),

    /**
     * Camelot Teleport - Level 45 Magic required.
     */
    CAMELOT(SpellBook.Standard.CAMELOT_TELEPORT, 45),

    /**
     * Progressive Teleport - Automatically selects highest level teleport available.
     * Uses Home Teleport as fallback (no level requirement).
     */
    PROGRESSIVE(SpellBook.Standard.HOME_TELEPORT, 0);

    private final Spell spell;
    private final int levelRequired;

    /**
     * Constructs a TeleportSpell enum value.
     *
     * @param spell the spell associated with this teleport
     * @param levelRequired the magic level required (0 for progressive/home teleport)
     */
    TeleportSpell(Spell spell, int levelRequired) {
        this.spell = spell;
        this.levelRequired = levelRequired;
    }

    /**
     * Gets the spell associated with this teleport.
     *
     * @return the teleport spell
     */
    public Spell getSpell() {
        return this.spell;
    }

    /**
     * Gets the magic level required to cast this teleport.
     *
     * @return the required magic level
     */
    public int getLevelRequired() {
        return this.levelRequired;
    }

    /**
     * Checks if the player can currently cast this teleport.
     * Verifies both magic level requirement and if the spell can be cast.
     *
     * @return true if the teleport can be cast, false otherwise
     */
    public boolean canCast() {
        return Skills.getBoostedLevel(Skill.MAGIC) >= this.levelRequired &&
               this.spell.canCast();
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
