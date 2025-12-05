/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Configuration interface for the Squire Barrows plugin.
 * Provides settings for gear, prayers, banking, and POH usage.
 */
package gg.squire.barrows;

import net.runelite.client.config.*;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

/**
 * Configuration interface for Squire Barrows plugin.
 * Defines all user-configurable settings for the bot.
 */
@ConfigGroup(value = "squirebarrows")
public interface SquireBarrowsConfig extends Config {

    // Section definitions
    @ConfigSection(name = "General settings", description = "General settings", position = 0)
    String GENERAL_SETTINGS = "General settings";

    @ConfigSection(name = "POH Settings", description = "POH Settings", position = 3)
    String POH_SETTINGS = "POH Settings";

    @ConfigSection(name = "Prayer Settings", description = "Prayer Settings related to brothers", position = 10)
    String PRAYER_SETTINGS = "Prayer Settings";

    @ConfigSection(name = "Banking settings", description = "Banking settings", position = 5)
    String BANKING_SETTINGS = "Banking settings";

    @ConfigSection(name = "Gear Settings", description = "Gear settings related to brothers", position = 20)
    String GEAR_SETTINGS = "Gear Settings";

    // General Settings
    @Range(min = 60, max = 100)
    @ConfigItem(position = 0, keyName = "rewardPotential", name = "Reward Potential",
        description = "What reward potential to aim for", section = "General settings")
    default int rewardPotential() {
        return 88;
    }

    @Range(min = 1, max = 99)
    @ConfigItem(position = 1, keyName = "eatAtHp", name = "Eat at",
        description = "What hp to eat at", section = "General settings")
    default int eatAtHp() {
        return 40;
    }

    @ConfigItem(position = 2, keyName = "specOnAhrim", name = "Spec on Ahrim?",
        description = "Should we use special attack vs ahrim?", section = "General settings")
    default boolean specOnAhrim() {
        return false;
    }

    @ConfigItem(position = 3, keyName = "ahrimSpecGear", name = "Ahrim Spec gear",
        description = "Gear to equip before specing on Ahrim", section = "General settings",
        hidden = true, unhide = "specOnAhrim")
    default ConfigStorageBox<EquipmentSetup> ahrimSpecGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 4, keyName = "specOnKaril", name = "Spec on Karil?",
        description = "Should we also spec on Karil?", section = "General settings")
    default boolean specOnKaril() {
        return false;
    }

    @ConfigItem(position = 5, keyName = "karilSpecGear", name = "Karil Spec gear",
        description = "Gear to equip before specing on Karil", section = "General settings",
        hidden = true, unhide = "specOnKaril")
    default ConfigStorageBox<EquipmentSetup> karilSpecGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    // POH Settings
    @ConfigItem(position = 1, keyName = "useHouse", name = "Use pool",
        description = "Restores prayer/health at house", section = "POH Settings")
    default boolean useHouse() {
        return true;
    }

    @ConfigItem(position = 2, keyName = "goHouseOnPrayerDrain", name = "Restore prayer mid trip",
        description = "Allow restoring prayer mid trip if you run out", section = "POH Settings",
        hidden = true, unhide = "useHouse")
    default boolean restoreMidTrip() {
        return false;
    }

    @ConfigItem(position = 3, keyName = "neverRisk", name = "Never risk on brother",
        description = "With this enabled, we will ditch if we have no pray (even if brother hp is low)",
        section = "POH Settings", hidden = true, unhide = "useHouse")
    default boolean neverRisk() {
        return false;
    }

    // Banking Settings
    @ConfigItem(position = 1, keyName = "useBank", name = "Use bank",
        description = "Use bank to regear when needed", section = "Banking settings")
    default boolean useBank() {
        return true;
    }

    @ConfigItem(position = 2, keyName = "bankLoadout", name = "Bank loadout",
        description = "Loadout to use when banking", section = "Banking settings",
        hidden = true, unhide = "useBank")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(position = 3, keyName = "bankForPrayer", name = "Bank for prayer pots?",
        description = "Bank whenever we are out of prayer pots?", section = "Banking settings",
        hidden = true, unhide = "useBank")
    default boolean bankForPrayer() {
        return true;
    }

    @ConfigItem(position = 4, keyName = "bankForFood", name = "Bank for food?",
        description = "Bank whenever we are out of food?", section = "Banking settings",
        hidden = true, unhide = "useBank")
    default boolean bankForFood() {
        return true;
    }

    // Prayer Settings
    @ConfigItem(position = 21, keyName = "rest.offensive", name = "Default Offensive",
        description = "Offensive prayer against Torag, Dharok, Verac and Guthan", section = "Prayer Settings")
    default OffensivePrayer defaultOffensive() {
        return OffensivePrayer.PIETY;
    }

    @ConfigItem(position = 22, keyName = "karil.offensive", name = "Karil Offensive",
        description = "Offensive prayer against Karil", section = "Prayer Settings")
    default OffensivePrayer karilOffensive() {
        return OffensivePrayer.EAGLE_EYE;
    }

    @ConfigItem(position = 23, keyName = "ahrim.offensive", name = "Ahrim Offensive",
        description = "Offensive prayer against Ahrim", section = "Prayer Settings")
    default OffensivePrayer ahrimOffensive() {
        return OffensivePrayer.MYSTIC_MIGHT;
    }

    @ConfigItem(position = 24, keyName = "tunnel.offensive", name = "Tunnel Offensive",
        description = "Offensive prayer against tunnel monsters", section = "Prayer Settings")
    default OffensivePrayer tunnelOffensive() {
        return OffensivePrayer.PIETY;
    }

    // Gear Settings
    @ConfigItem(keyName = "mage.gear", name = "Mage Gear", position = 1,
        description = "Gear to swap to when attacking Dharok, Verac, Guthan and Torag", section = "Gear Settings")
    default ConfigStorageBox<EquipmentSetup> mageGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(keyName = "karil.gear", name = "Karil Gear", position = 2,
        description = "Gear to swap to when attacking Karil", section = "Gear Settings")
    default ConfigStorageBox<EquipmentSetup> karilGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(keyName = "ahrim.gear", name = "Ahrim Gear", position = 3,
        description = "Gear to swap to when attacking Ahrim", section = "Gear Settings")
    default ConfigStorageBox<EquipmentSetup> ahrimGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(keyName = "tunnels.gear", name = "Tunnel Gear", position = 4,
        description = "Gear to swap to when attacking skeletons and stuff in tunnels", section = "Gear Settings")
    default ConfigStorageBox<EquipmentSetup> tunnelGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }
}
