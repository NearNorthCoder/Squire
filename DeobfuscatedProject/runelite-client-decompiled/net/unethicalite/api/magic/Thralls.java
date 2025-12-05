/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 */
package net.unethicalite.api.magic;

import com.openosrs.client.util.WeaponStyle;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import org.jetbrains.annotations.Nullable;

public class Thralls {
    @Nullable
    public static Spell getStrongestCastableRangedThrall() {
        if (SpellBook.Necromancy.RESURRECT_GREATER_SKELETON.canCast()) {
            return SpellBook.Necromancy.RESURRECT_GREATER_SKELETON;
        }
        if (SpellBook.Necromancy.RESURRECT_SUPERIOR_SKELETON.canCast()) {
            return SpellBook.Necromancy.RESURRECT_SUPERIOR_SKELETON;
        }
        if (SpellBook.Necromancy.RESURRECT_LESSER_SKELETON.canCast()) {
            return SpellBook.Necromancy.RESURRECT_LESSER_SKELETON;
        }
        return null;
    }

    @Nullable
    public static Spell getStrongestCastableMagicThrall() {
        if (SpellBook.Necromancy.RESURRECT_GREATER_GHOST.canCast()) {
            return SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        }
        if (SpellBook.Necromancy.RESURRECT_SUPERIOR_GHOST.canCast()) {
            return SpellBook.Necromancy.RESURRECT_SUPERIOR_GHOST;
        }
        if (SpellBook.Necromancy.RESURRECT_LESSER_GHOST.canCast()) {
            return SpellBook.Necromancy.RESURRECT_LESSER_GHOST;
        }
        return null;
    }

    @Nullable
    public static Spell getStrongestCastableMeleeThrall() {
        if (SpellBook.Necromancy.RESURRECT_GREATER_ZOMBIE.canCast()) {
            return SpellBook.Necromancy.RESURRECT_GREATER_ZOMBIE;
        }
        if (SpellBook.Necromancy.RESURRECT_SUPERIOR_ZOMBIE.canCast()) {
            return SpellBook.Necromancy.RESURRECT_SUPERIOR_ZOMBIE;
        }
        if (SpellBook.Necromancy.RESURRECT_LESSER_ZOMBIE.canCast()) {
            return SpellBook.Necromancy.RESURRECT_LESSER_ZOMBIE;
        }
        return null;
    }

    @Nullable
    public static Spell getStrongestThrallFor(WeaponStyle weaponStyle) {
        switch (weaponStyle) {
            case MAGIC: {
                return Thralls.getStrongestCastableMagicThrall();
            }
            case MELEE: {
                return Thralls.getStrongestCastableMeleeThrall();
            }
            case RANGE: {
                return Thralls.getStrongestCastableRangedThrall();
            }
        }
        return Thralls.getStrongestCastableMagicThrall();
    }

    public static boolean isThrallActive() {
        NPC thrall = NPCs.getNearest(n -> n.getId() >= 10880 && n.getId() <= 10889);
        return thrall != null && Vars.getBit(12413) == 1;
    }

    public static boolean canUse(WeaponStyle style) {
        if (Thralls.isThrallActive()) {
            return false;
        }
        Spell thrall = Thralls.getStrongestThrallFor(style);
        if (thrall == null) {
            return false;
        }
        if (!Inventory.contains(25818) && !Equipment.contains(25818)) {
            return false;
        }
        return thrall.canCast() && Skills.getBoostedLevel(Skill.PRAYER) > 6;
    }

    public static boolean useBestThrall(WeaponStyle weaponStyle) {
        if (!Thralls.canUse(weaponStyle)) {
            return false;
        }
        Spell thrall = Thralls.getStrongestThrallFor(weaponStyle);
        if (thrall == null) {
            return false;
        }
        Magic.cast(thrall, 0, 57);
        return true;
    }

    public static boolean canUse() {
        return Thralls.canUse(WeaponStyle.MAGIC);
    }

    public static boolean useBestThrall() {
        return Thralls.useBestThrall(WeaponStyle.MAGIC);
    }
}

