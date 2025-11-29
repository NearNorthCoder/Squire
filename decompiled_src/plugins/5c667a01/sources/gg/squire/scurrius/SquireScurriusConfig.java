package gg.squire.scurrius;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.c;
@ConfigGroup("squirescurrius")
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:gg/squire/scurrius/SquireScurriusConfig.class */
public interface SquireScurriusConfig extends Config {
    @ConfigSection(name = "Looting", description = "Settings related to looting", position = 0)
    public static final /* synthetic */ String LOOT = "loot";
    @ConfigSection(name = "Fighting", description = "Settings related to fighting", position = 0)
    public static final /* synthetic */ String FIGHT = "fight";
    @ConfigSection(name = "Banking", description = "Settings related to banking", position = 0)
    public static final /* synthetic */ String BANKING = "banking";
    @ConfigSection(name = "Special Attack", description = "Settings related to special attack", position = 0)
    public static final /* synthetic */ String SPECIAL = "special";

    @ConfigItem(position = 0, name = "Eat at", keyName = "eat.at", description = "What hp to eat at", section = "fight")
    @Range(max = 99, min = 22)
    default int eatAt() {
        return 63 ^ 33;
    }

    @ConfigItem(position = 0, name = "Min. food", keyName = "food.min", description = "How many foods/brew doses before starting the fight?", section = "fight")
    @Range(max = 10)
    default int food() {
        return "   ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 1, name = "Bank when starting the plugin", keyName = "bankOnStart", description = "Should the plugin bank on start", section = "banking")
    default boolean bankOnStart() {
        return ((((54 + 16) - 69) + 183) ^ (((77 + 102) - 70) + 21)) & (((((135 + 77) - 115) + 51) ^ (((48 + 171) - 91) + 46)) ^ (-" ".length()));
    }

    @ConfigItem(position = 0, name = "Pray pot. at", keyName = "pray.pot.at", description = "What pray points to restore prayer at", section = "fight")
    @Range(max = 99, min = 5)
    default int drinkPrayerAt() {
        return (43 ^ 76) ^ (125 ^ 14);
    }

    @ConfigItem(position = 0, name = "Min. prayer doses", keyName = "prayer.dose.min", description = "How many prayer doses should we have before starting the fight?", section = "fight")
    @Range(max = 12)
    default int prayDoses() {
        return "  ".length();
    }

    @ConfigItem(position = 1, name = "Loot boosting potions", keyName = "lootBoosting", description = "Loot super str/ranging pots", section = "loot")
    default boolean lootBoosting() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 0, name = "High alch loot", keyName = "highAlch", description = "High alch Rat kings rune/addy drops", section = "loot")
    default boolean highAlch() {
        return ((29 ^ 45) ^ (236 ^ 158)) & (((((38 + 177) - 29) + 19) ^ (((18 + 100) - 15) + 40)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 2, name = "Loot and bury big bones", keyName = "buryBones", description = "Pick up big bones and bury them for prayer xp", section = "loot")
    default boolean lootBigBones() {
        return ((112 ^ 100) ^ (220 ^ 144)) & (((((184 + 109) - 259) + 207) ^ (((56 + 165) - 172) + 120)) ^ (-" ".length()));
    }

    @ConfigItem(position = 2, name = "Ardy cloak prayer restore", keyName = "ardyCloak", description = "Use ardy cloak to restore prayer at Ardougne Monastery when banking", section = "banking")
    default boolean ardyCloak() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 0, keyName = "bankloadout", name = "Bank Loadout", description = "Loadout to use to for bank + fight", section = "banking")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = -1, name = "Focus Giant rats", keyName = "focusrats", description = "Enabling this increases xp/h at low levels", section = "fight")
    default boolean focusRats() {
        return " ".length();
    }

    @ConfigItem(position = 0, keyName = "specialAttack", name = "Special Gear Setup", description = "Gear setup for special attack", section = "special")
    default ConfigStorageBox<EquipmentSetup> specGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 0, keyName = "bank", name = "Bank", description = "Which bank should we use?", section = "banking")
    default c bank() {
        return c.VARROCK_EAST;
    }
}
