/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.commons.Predicates
 */
package net.unethicalite.api.game;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.api.combat.CombatOption;
import gg.squire.api.combat.CombatOptions;
import gg.squire.api.combat.CombatStyle;
import gg.squire.api.combat.SpecWeapon;
import gg.squire.api.combat.WeaponRangeOverride;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.BoostingPotion;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

public class Combat {
    private static final int SPEC_VARP = 301;
    private static final int SPEC_ENERGY_VARP = 300;
    private static final Supplier<Widget> SPEC_BUTTON = () -> Widgets.get(593, 38);
    private static final int VENOM_THRESHOLD = 1000000;
    private static final int ANTIFIRE = 3981;
    private static final int SUPER_ANTIFIRE = 6101;

    public static boolean isRetaliating() {
        return Vars.getVarp(172) == 0;
    }

    public static boolean isPoisoned() {
        return Vars.getVarp(102) > 0;
    }

    public static boolean isVenomed() {
        return Vars.getVarp(102) >= 1000000;
    }

    public static boolean isSpecEnabled() {
        return Vars.getVarp(301) == 1;
    }

    public static int getSpecEnergy() {
        return Vars.getVarp(300) / 10;
    }

    public static boolean isAntifired() {
        return Vars.getBit(3981) > 0;
    }

    public static boolean isSuperAntifired() {
        return Vars.getBit(6101) > 0;
    }

    public static void toggleSpec() {
        if (Combat.isSpecEnabled()) {
            return;
        }
        Widget spec = SPEC_BUTTON.get();
        if (spec != null) {
            spec.interact(act -> act != null && act.startsWith("Use"));
        }
    }

    public static SpecWeapon getSpecWeaponEquipped() {
        Item item = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (item == null) {
            return null;
        }
        return SpecWeapon.forId(item.getId());
    }

    public static Set<SpecWeapon> getSpecWeaponsInventory() {
        return Inventory.getAll().stream().map(i -> SpecWeapon.forId(i.getId())).filter(Objects::nonNull).collect(Collectors.toSet());
    }

    public static SpecWeapon getBestWeapon(boolean checkEquipment, Comparator<SpecWeapon> comparatorForBestWeapon) {
        SpecWeapon specWeapon = checkEquipment ? Combat.getSpecWeaponEquipped() : null;
        HashSet<SpecWeapon> all = new HashSet<SpecWeapon>(Combat.getSpecWeaponsInventory());
        if (specWeapon != null) {
            all.add(specWeapon);
        }
        return all.stream().max(comparatorForBestWeapon).orElse(null);
    }

    public static boolean specWithWeapon(boolean checkEquipment, Comparator<SpecWeapon> comparatorForBestWeapon) {
        Item inventory;
        SpecWeapon best = Combat.getBestWeapon(checkEquipment, comparatorForBestWeapon);
        if (best == null) {
            return false;
        }
        if (Combat.getSpecEnergy() < best.getSpecAmount()) {
            return false;
        }
        Item weapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (!best.matches(weapon) && (inventory = best.getInventoryItem()) != null) {
            inventory.interact(new String[]{"Wield", "Equip", "Wear"});
        }
        Combat.toggleSpec();
        return true;
    }

    public static boolean specWithWeapon() {
        return Combat.specWithWeapon(true, Comparator.comparing(SpecWeapon::getSpecAmount));
    }

    public static boolean specWithWeapon(boolean checkEquipment) {
        return Combat.specWithWeapon(checkEquipment, Comparator.comparing(SpecWeapon::getSpecAmount));
    }

    public static boolean drinkBoostingPotion(int percentageLeftToDrinkAt) {
        for (BoostingPotion boostingPotion : BoostingPotion.values()) {
            for (Skill skill : boostingPotion.getSkills()) {
                Item potion;
                int potential = Combat.getMaxBoostPotential(boostingPotion, skill);
                if (!Combat.isBoostBelowDesiredValue(skill, potential, percentageLeftToDrinkAt) || (potion = Inventory.getFirst(i -> i.getName().startsWith(boostingPotion.getName()))) == null) continue;
                potion.interact("Drink");
                return true;
            }
        }
        return false;
    }

    private static boolean isBoostBelowDesiredValue(Skill skill, int potential, int percentageLeftToDrinkAt) {
        int skillLevel = Skills.getLevel(skill);
        int potentialBoost = potential - skillLevel;
        int actualBoost = Skills.getBoostedLevel(skill) - skillLevel;
        if (actualBoost <= 0) {
            return true;
        }
        double percentageDouble = (double)percentageLeftToDrinkAt / 100.0;
        int supposedDrinkAt = (int)((double)potentialBoost * percentageDouble + (double)skillLevel);
        return supposedDrinkAt >= Skills.getBoostedLevel(skill);
    }

    private static int getMaxBoostPotential(BoostingPotion boostingPotion, Skill skill) {
        int boostAmount = boostingPotion.getBoostAmount(skill);
        return Skills.getLevel(skill) + boostAmount;
    }

    public static AttackStyle getAttackStyle() {
        return AttackStyle.fromIndex(Vars.getVarp(43));
    }

    public static void setAttackStyle(AttackStyle attackStyle) {
        if (attackStyle.widgetInfo == null) {
            return;
        }
        Widget widget = Widgets.get(attackStyle.widgetInfo);
        if (widget != null) {
            widget.interact(0);
        }
    }

    public static NPC getAttackableNPC(int ... ids) {
        return Combat.getAttackableNPC(Predicates.ids((int[])ids));
    }

    public static NPC getAttackableNPC(String ... names) {
        return Combat.getAttackableNPC(Predicates.names((String[])names));
    }

    public static NPC getAttackableNPC(Predicate<NPC> filter) {
        Player local = Players.getLocal();
        NPC attackingMe = NPCs.getNearest(x -> x.hasAction(new String[]{"Attack"}) && Players.getNearest(p -> p.getInteracting() != null && p.getInteracting().equals(x)) == null && x.getInteracting() != null && x.getInteracting().equals(local) && filter.test((NPC)x));
        if (attackingMe != null) {
            return attackingMe;
        }
        return NPCs.getNearest(x -> x.hasAction(new String[]{"Attack"}) && Players.getNearest(p -> p.getInteracting() != null && p.getInteracting().equals(x)) == null && x.getInteracting() == null && filter.test((NPC)x));
    }

    public static int getCurrentHealth() {
        return Skills.getBoostedLevel(Skill.HITPOINTS);
    }

    public static int getMissingHealth() {
        return Skills.getLevel(Skill.HITPOINTS) - Skills.getBoostedLevel(Skill.HITPOINTS);
    }

    public static double getHealthPercent() {
        return (double)Combat.getCurrentHealth() / (double)Skills.getLevel(Skill.HITPOINTS) * 100.0;
    }

    public static WeaponStyle getCurrentWeaponStyle() {
        Item weapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (weapon == null) {
            return WeaponStyle.MELEE;
        }
        return WeaponMap.StyleMap.getOrDefault(weapon.getId(), WeaponStyle.MELEE);
    }

    public static int getWeaponRange() {
        WeaponRangeOverride wro;
        Item equipped = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (equipped == null) {
            return 1;
        }
        WeaponStyle style = WeaponMap.StyleMap.getOrDefault(equipped.getId(), WeaponStyle.MELEE);
        if (style == WeaponStyle.MELEE) {
            return 1;
        }
        CombatOption combatStyle = CombatOptions.getCurrent();
        if (style == WeaponStyle.RANGE && (wro = WeaponRangeOverride.forWeaponName(equipped.getName())) != null) {
            return combatStyle == null || combatStyle.getCombatStyle() != CombatStyle.LONGRANGE ? wro.getShortRange() : wro.getLongRange();
        }
        return 8;
    }

    public static enum AttackStyle {
        FIRST(0, WidgetInfo.COMBAT_STYLE_ONE),
        SECOND(1, WidgetInfo.COMBAT_STYLE_TWO),
        THIRD(2, WidgetInfo.COMBAT_STYLE_THREE),
        FOURTH(3, WidgetInfo.COMBAT_STYLE_FOUR),
        SPELLS(4, WidgetInfo.COMBAT_SPELL_BOX),
        SPELLS_DEFENSIVE(4, WidgetInfo.COMBAT_DEFENSIVE_SPELL_BOX),
        UNKNOWN(-1, null);

        private final int index;
        private final WidgetInfo widgetInfo;

        private AttackStyle(int index, WidgetInfo widgetInfo) {
            this.index = index;
            this.widgetInfo = widgetInfo;
        }

        public static AttackStyle fromIndex(int index) {
            return Arrays.stream(AttackStyle.values()).filter(x -> x.index == index).findFirst().orElse(UNKNOWN);
        }

        public int getIndex() {
            return this.index;
        }

        public WidgetInfo getWidgetInfo() {
            return this.widgetInfo;
        }
    }
}

