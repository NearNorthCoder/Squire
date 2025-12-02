/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.client.Static
 */
package net.unethicalite.api.magic;

import gg.squire.api.combat.CombatOption;
import gg.squire.api.combat.CombatOptions;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class Magic {
    private static final int AUTOCAST_VARP = 108;
    private static final int AUTO_CAST_SPELL_ID_VARBIT = 276;
    private static final int DEFENSIVE_CASTING_VARBIT = 2668;

    @Nonnull
    public static SpellBook getCurrentSpellBook() {
        for (SpellBook book : SpellBook.values()) {
            if (!book.isCurrent()) continue;
            return book;
        }
        Static.getClient().getLogger().error("Unable to determine the current spellbook, returning a default of " + String.valueOf((Object)SpellBook.STANDARD));
        return SpellBook.STANDARD;
    }

    public static boolean isAutoCasting() {
        return Vars.getVarp(108) != 0;
    }

    public static boolean isDefensiveAutoCasting() {
        return Vars.getBit(2668) == 1;
    }

    @Nullable
    public static Spell getAutoCastingSpell() {
        if (!Magic.isAutoCasting()) {
            return null;
        }
        return Magic.getCurrentSpellBook().getSpells().stream().filter(Spell::isAutoCasting).findFirst().orElse(null);
    }

    public static boolean isSpellSelected(Spell spell) {
        Widget widget = Widgets.get(spell.getWidget());
        if (widget != null) {
            return widget.getBorderType() == 2;
        }
        return false;
    }

    public static boolean canCast(Spell spell) {
        return spell.canCast();
    }

    public static void cast(Spell spell, Item target) {
        Magic.selectSpell(spell);
        target.interact(0, MenuAction.WIDGET_TARGET_ON_WIDGET.getId());
    }

    public static void cast(Spell spell, NPC target) {
        Magic.selectSpell(spell);
        target.interact(0, MenuAction.WIDGET_TARGET_ON_NPC.getId());
    }

    public static void cast(Spell spell, Player target) {
        Magic.selectSpell(spell);
        target.interact(0, MenuAction.WIDGET_TARGET_ON_PLAYER.getId());
    }

    public static void cast(Spell spell, TileItem target) {
        Magic.selectSpell(spell);
        target.interact(0, MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.getId());
    }

    public static void cast(Spell spell, TileObject target) {
        Magic.selectSpell(spell);
        target.interact(0, MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.getId());
    }

    public static boolean autoCast(Spell spell) {
        if (spell == null) {
            if (Magic.isAutoCasting()) {
                // empty if block
            }
            return !Magic.isAutoCasting();
        }
        if (spell.canCast() && spell.canAutoCast()) {
            CombatOptions.getByCombatXP(Skill.MAGIC).stream().findFirst().ifPresent(CombatOption::select);
            return Magic.isAutoCasting();
        }
        return false;
    }

    public static void selectSpell(Spell spell) {
        Widget widget = Widgets.get(spell.getWidget());
        if (widget != null) {
            Static.getClient().setSelectedSpellWidget(widget.getId());
            Static.getClient().setSelectedSpellChildIndex(-1);
        }
    }

    public static void cast(Spell spell) {
        Magic.cast(spell, 0);
    }

    public static void cast(Spell spell, int actionIndex) {
        Widget widget = Widgets.get(spell.getWidget());
        if (widget != null) {
            widget.interact(actionIndex);
        }
    }

    public static void cast(Spell spell, int id, boolean bypassActions) {
        if (!bypassActions) {
            Magic.cast(spell, id);
        } else {
            Widget widget = Widgets.get(spell.getWidget());
            if (widget != null) {
                widget.interact(id, MenuAction.CC_OP.getId(), -1, widget.getId());
            }
        }
    }

    public static void cast(Spell spell, int actionIndex, int opcode) {
        Widget widget = Widgets.get(spell.getWidget());
        if (widget != null) {
            widget.interact(actionIndex, opcode);
        }
    }

    public static Instant getLastHomeTeleportUsage() {
        return Instant.ofEpochSecond((long)Vars.getVarp(892) * 60L);
    }

    public static boolean isHomeTeleportOnCooldown() {
        return Magic.getLastHomeTeleportUsage().plus(30L, ChronoUnit.MINUTES).isAfter(Instant.now());
    }
}
