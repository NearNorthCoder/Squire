/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 */
package net.unethicalite.api.widgets;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.RuneLite;
import net.runelite.client.game.ItemEquipmentStats;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemStats;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class Prayers {
    public static boolean isEnabled(Prayer prayer) {
        return Vars.getBit(prayer.getVarbit()) == 1;
    }

    public static void toggle(Prayer prayer) {
        Widget widget = Widgets.get(prayer.getWidgetInfo());
        if (widget != null) {
            widget.interact(0);
        }
    }

    public static void toggle(Prayer prayer, boolean packet) {
        if (!packet) {
            Prayers.toggle(prayer);
            return;
        }
        Widget widget = Widgets.get(prayer.getWidgetInfo());
        if (widget == null) {
            return;
        }
        WidgetPackets.widgetFirstOption(widget);
    }

    public static int getPoints() {
        return Skills.getBoostedLevel(Skill.PRAYER);
    }

    public static void toggleQuickPrayer(boolean enabled) {
        Widget widget = Widgets.get(WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);
        if (widget != null) {
            widget.interact(enabled ? "Activate" : "Deactivate");
        }
    }

    public static boolean isQuickPrayerEnabled() {
        return Vars.getBit(4103) == 1;
    }

    public static boolean anyActive() {
        return Arrays.stream(Prayer.values()).anyMatch(Prayers::isEnabled);
    }

    public static void disableAll() {
        Arrays.stream(Prayer.values()).filter(Prayers::isEnabled).forEach(Prayers::toggle);
    }

    public static boolean flickOffensiveAutomatic(Prayer ... others) {
        ArrayList<Prayer> prayers = new ArrayList<Prayer>(Prayers.getOffensive());
        prayers.addAll(Arrays.asList(others));
        return Prayers.flick(prayers);
    }

    public static boolean flick(List<Prayer> prayers) {
        if (Rand.nextInt(0, 100) == 1 && Static.getClient().isInInstancedRegion()) {
            return false;
        }
        HashSet<Prayer> dontFlickOff = new HashSet<Prayer>();
        Map<Prayer, List<Prayer>> relatedMap = Prayers.buildRelatedMap();
        for (Prayer p : Prayer.values()) {
            if (prayers.contains(p) || !Prayers.isEnabled(p)) continue;
            Prayers.toggle(p, true);
            dontFlickOff.addAll(relatedMap.getOrDefault(p, Collections.emptyList()));
        }
        boolean sleep = Prayers.flick(prayers, false, dontFlickOff);
        Prayers.flick(prayers, true, dontFlickOff);
        return sleep;
    }

    public static boolean flick(List<Prayer> prayers, boolean perfectFlick) {
        if (!perfectFlick && Rand.nextInt(0, 100) == 1 && Static.getClient().isInInstancedRegion()) {
            return false;
        }
        HashSet<Prayer> dontFlickOff = new HashSet<Prayer>();
        Map<Prayer, List<Prayer>> relatedMap = Prayers.buildRelatedMap();
        for (Prayer p : Prayer.values()) {
            if (prayers.contains(p) || !Prayers.isEnabled(p)) continue;
            Prayers.toggle(p, true);
            dontFlickOff.addAll(relatedMap.getOrDefault(p, Collections.emptyList()));
        }
        boolean sleep = Prayers.flick(prayers, false, dontFlickOff);
        Prayers.flick(prayers, true, dontFlickOff);
        return sleep;
    }

    private static Map<Prayer, List<Prayer>> buildRelatedMap() {
        HashMap<Prayer, List<Prayer>> result = new HashMap<Prayer, List<Prayer>>();
        result.put(Prayer.AUGURY, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        result.put(Prayer.MYSTIC_MIGHT, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        result.put(Prayer.RIGOUR, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        result.put(Prayer.EAGLE_EYE, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        result.put(Prayer.PIETY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        result.put(Prayer.CHIVALRY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        result.put(Prayer.ULTIMATE_STRENGTH, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));
        result.put(Prayer.STEEL_SKIN, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY));
        result.put(Prayer.INCREDIBLE_REFLEXES, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));
        result.put(Prayer.PROTECT_FROM_MELEE, List.of(Prayer.PROTECT_FROM_MAGIC, Prayer.PROTECT_FROM_MISSILES));
        result.put(Prayer.PROTECT_FROM_MAGIC, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MISSILES));
        result.put(Prayer.PROTECT_FROM_MISSILES, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MAGIC));
        return result;
    }

    private static boolean flick(List<Prayer> prayers, boolean skip, Set<Prayer> dontFlickOff) {
        boolean result = false;
        for (Prayer prayer : prayers) {
            if (prayer == Prayer.PROTECT_ITEM || !skip && dontFlickOff.contains(prayer)) continue;
            if (Prayers.isEnabled(prayer) || skip) {
                Prayers.toggle(prayer, true);
                continue;
            }
            if (Prayers.isEnabled(prayer)) continue;
            result = true;
        }
        return result;
    }

    public static List<Prayer> getOffensive() {
        int id;
        Item item = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        ItemManager instance = (ItemManager)RuneLite.getInjector().getInstance(ItemManager.class);
        int n = id = item == null ? -1 : item.getId();
        if (id == -1) {
            return new ArrayList<Prayer>();
        }
        if (item.getName() != null) {
            if (item.getName().toLowerCase().contains("staff")) {
                return Prayers.getMagePrayers();
            }
            if (item.getName().toLowerCase().contains("bow")) {
                return Prayers.getRangePrayers();
            }
        }
        if (WeaponMap.StyleMap.containsKey(id)) {
            switch (WeaponMap.StyleMap.get(id)) {
                case MELEE: {
                    return Prayers.getMeleePrayer();
                }
                case RANGE: {
                    return Prayers.getRangePrayers();
                }
                case MAGIC: {
                    return Prayers.getMagePrayers();
                }
            }
        }
        ItemStats itemStats = instance.getItemStats(id);
        return Prayers.getOffensive(itemStats);
    }

    public static List<Prayer> getOffensive(ItemStats itemStats) {
        WeaponStyle primary = Prayers.getPrimary(itemStats);
        switch (primary) {
            case MELEE: {
                return Prayers.getMeleePrayer();
            }
            case RANGE: {
                return Prayers.getRangePrayers();
            }
            case MAGIC: {
                return Prayers.getMagePrayers();
            }
        }
        return Collections.emptyList();
    }

    private static WeaponStyle getPrimary(ItemStats itemStats) {
        ItemEquipmentStats equipment = itemStats.getEquipment();
        int maxMelee = Math.max(equipment.getAcrush(), Math.max(equipment.getAslash(), equipment.getAstab()));
        int maxRangeMagic = Math.max(equipment.getAmagic(), equipment.getArange());
        if (maxRangeMagic > 10) {
            return equipment.getAmagic() > equipment.getArange() ? WeaponStyle.MAGIC : WeaponStyle.RANGE;
        }
        if (maxRangeMagic > maxMelee) {
            return equipment.getAmagic() > equipment.getArange() ? WeaponStyle.MAGIC : WeaponStyle.RANGE;
        }
        return WeaponStyle.MELEE;
    }

    public static List<Prayer> getMeleePrayer() {
        if (Vars.getBit(3909) != 8 || Skills.getLevel(Skill.PRAYER) < 60) {
            return List.of(Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN);
        }
        return Skills.getLevel(Skill.PRAYER) >= 70 ? List.of(Prayer.PIETY) : List.of(Prayer.CHIVALRY);
    }

    public static List<Prayer> getRangePrayers() {
        if (Vars.getBit(5451) == 0 || Skills.getLevel(Skill.PRAYER) < 74) {
            return List.of(Prayer.EAGLE_EYE, Prayer.STEEL_SKIN);
        }
        return Collections.singletonList(Prayer.RIGOUR);
    }

    public static List<Prayer> getMagePrayers() {
        if (Vars.getBit(5452) == 0 || Skills.getLevel(Skill.PRAYER) < 77) {
            return List.of(Prayer.MYSTIC_MIGHT, Prayer.STEEL_SKIN);
        }
        return Collections.singletonList(Prayer.AUGURY);
    }

    public static int getMissingPoints() {
        return Skills.getBoostedLevel(Skill.PRAYER) - Skills.getLevel(Skill.PRAYER);
    }
}

