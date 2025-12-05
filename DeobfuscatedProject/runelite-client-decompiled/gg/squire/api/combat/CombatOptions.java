/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 */
package gg.squire.api.combat;

import com.google.common.collect.Lists;
import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.api.combat.AttackStyle;
import gg.squire.api.combat.AttackType;
import gg.squire.api.combat.CombatOption;
import gg.squire.api.combat.CombatStyle;
import gg.squire.api.combat.WeaponCategory;
import gg.squire.api.combat.WeaponRangeOverride;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.query.results.WidgetQueryResults;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public final class CombatOptions {
    private static final int CURRENT_COMBAT_OPTION_INDEX_VARP_ID = 43;
    private static final int AUTO_RETALIATE_STATE_VARP_ID = 172;
    private static final int SPECIAL_ATTACK_DESCRIPTION_ENUM_ID = 1739;
    private static final int SPECIAL_ATTACK_COST_ENUM_ID = 906;
    private static final int WEAPON_CATEGORY_VARBIT_ID = 357;
    private static final int SPECIAL_ATTACK_ENERGY_VARP_ID = 300;
    private static final int SPECIAL_ATTACK_ACTIVATION_VARP_ID = 301;

    public static CombatOption getCurrent() {
        int value = Vars.getVarp(43);
        if (value == -1) {
            return null;
        }
        WeaponCategory category = CombatOptions.getCurrentWeaponCategory();
        if (category == null) {
            return null;
        }
        return category.getCombatOptions()[value];
    }

    public static List<CombatOption> getAvailable() {
        WeaponCategory category = CombatOptions.getCurrentWeaponCategory();
        if (category == null) {
            return Collections.emptyList();
        }
        Stream<CombatOption> combatOptions = Arrays.stream(category.getCombatOptions());
        return combatOptions.filter(Objects::nonNull).collect(Collectors.toList());
    }

    public static List<CombatOption> getByCombatStyle(CombatStyle ... combatStyles) {
        WeaponCategory category = CombatOptions.getCurrentWeaponCategory();
        if (category == null) {
            return Collections.emptyList();
        }
        Stream<CombatOption> combatOptions = Arrays.stream(category.getCombatOptions());
        return combatOptions.filter(Objects::nonNull).filter(option -> Arrays.stream(combatStyles).anyMatch(combatStyle -> combatStyle == option.getCombatStyle())).collect(Collectors.toList());
    }

    public static List<CombatOption> getByAttackStyle(AttackStyle ... attackStyles) {
        WeaponCategory category = CombatOptions.getCurrentWeaponCategory();
        if (category == null) {
            return Collections.emptyList();
        }
        Stream<CombatOption> combatOptions = Arrays.stream(category.getCombatOptions());
        return combatOptions.filter(Objects::nonNull).filter(option -> Arrays.stream(attackStyles).anyMatch(attackStyle -> attackStyle == option.getAttackStyle())).collect(Collectors.toList());
    }

    public static List<CombatOption> getByAttackType(AttackType ... attackTypes) {
        WeaponCategory category = CombatOptions.getCurrentWeaponCategory();
        if (category == null) {
            return Collections.emptyList();
        }
        Stream<CombatOption> combatOptions = Arrays.stream(category.getCombatOptions());
        return combatOptions.filter(Objects::nonNull).filter(option -> Arrays.stream(attackTypes).anyMatch(attackType -> attackType == option.getAttackType())).collect(Collectors.toList());
    }

    public static List<CombatOption> getByCombatXP(Skill ... skills) {
        return CombatOptions.getByCombatXP(false, skills);
    }

    public static List<CombatOption> getByCombatXP(boolean shared, Skill ... skills) {
        ArrayList<Skill> skillsAsList = Lists.newArrayList(skills);
        WeaponCategory category = CombatOptions.getCurrentWeaponCategory();
        if (category == null) {
            return Collections.emptyList();
        }
        Stream<CombatOption> combatOptions = Arrays.stream(category.getCombatOptions());
        return combatOptions.filter(Objects::nonNull).filter(option -> {
            if (shared) {
                return Arrays.stream(option.getCombatXP()).anyMatch(skillsAsList::contains);
            }
            return Arrays.stream(option.getCombatXP()).allMatch(skillsAsList::contains);
        }).collect(Collectors.toList());
    }

    @Nullable
    public static WeaponCategory getCurrentWeaponCategory() {
        int weaponTypeIndex = Vars.getBit(357);
        if (weaponTypeIndex != -1) {
            for (WeaponCategory category : WeaponCategory.values()) {
                if (weaponTypeIndex != category.getVarpValue()) continue;
                return category;
            }
        }
        return null;
    }

    public static boolean isAutoRetaliateOn() {
        return Vars.getVarp(172) == 0;
    }

    public static boolean setAutoRetaliate(boolean on) {
        Widget autoRetaliateButton;
        if (on == CombatOptions.isAutoRetaliateOn()) {
            return true;
        }
        if (!Tabs.isOpen(Tab.COMBAT)) {
            Tabs.open(Tab.COMBAT);
        }
        if ((autoRetaliateButton = CombatOptions.getAutoRetaliateButton()) != null) {
            autoRetaliateButton.interact("Auto retaliate");
            return Time.sleepUntil(() -> CombatOptions.isAutoRetaliateOn() == on, Rand.nextInt(1200, 1800));
        }
        return false;
    }

    private static Widget getAutoRetaliateButton() {
        return (Widget)((WidgetQueryResults)Widgets.query(593).types(0).actions("Auto retaliate").results()).first();
    }

    public static boolean hasSpecialAttack() {
        int primaryHandWeaponId = Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId();
        return Arrays.stream(Static.getClient().getEnum(906).getKeys()).anyMatch(key -> key == primaryHandWeaponId);
    }

    public static boolean isSpecialAttackActivated() {
        return Vars.getVarp(301) == 1;
    }

    public static int getSpecialAttackEnergy() {
        return Vars.getVarp(300) / 10;
    }

    public static int getSpecialAttackEnergyCost() {
        int weaponId = Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId();
        int usageCost = Static.getClient().getEnum(906).getIntValue(weaponId);
        return usageCost / 10;
    }

    @Nullable
    public static String getSpecialAttackDescription() {
        int weaponId = Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId();
        return Static.getClient().getEnum(1739).getStringValue(weaponId);
    }

    public int getCurrentRange() {
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
}

