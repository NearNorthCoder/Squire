package gg.squire.basics.cerberus;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@ConfigGroup("squirecerberus")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/cerberus/SquireCerberusConfig.class */
public interface SquireCerberusConfig extends Config {
    @ConfigSection(name = "Banking/Gear", description = "Banking and Gear config", position = 1)
    public static final /* synthetic */ String BANKING_SECTION = "BANKING_SECTION";
    @ConfigSection(name = "Combat", description = "Combat config", position = 2)
    public static final /* synthetic */ String COMBAT_SECTION = "COMBAT_SECTION";

    @ConfigItem(position = 5, keyName = "eatAtHealth", name = "Eat at health", description = "Plugin will eat food at this health", section = "COMBAT_SECTION")
    default int eatAtHealth() {
        return 245 ^ 180;
    }

    @ConfigItem(position = 7, keyName = "drinkPrayAtGhost", name = "Drink pray at ghost", description = "Stay above this prayer amount when ghosts are up", section = "COMBAT_SECTION")
    default int drinkAtPrayerGhost() {
        return (103 ^ 21) ^ (226 ^ 162);
    }

    @ConfigItem(position = 1, keyName = "bankLoadout", name = "Bank loadout", description = "The loadout to use when banking", section = "BANKING_SECTION")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(position = 6, keyName = "prayAtAmount", name = "Drink pray at", description = "Plugin will drink prayer potion at this amount", section = "COMBAT_SECTION")
    default int drinkAtPrayer() {
        return (14 ^ 59) ^ (146 ^ 132);
    }

    @ConfigItem(position = 2, keyName = "bankUnderAmount", name = "Food to bank under", description = "Under this amount we will not start a new kill", section = "BANKING_SECTION")
    default int bankUnderAmount() {
        return "  ".length();
    }

    @ConfigItem(position = 2, keyName = "specGear", name = "Special Attack Gear", description = "Gear to equip when using special attack", section = "BANKING_SECTION")
    default ConfigStorageBox<EquipmentSetup> cerbSpecGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 99, keyName = "scatterAshes", name = "Scatter Ashes", description = "Should we scatter the ashes that we loot?")
    default boolean scatterAshes() {
        return " ".length();
    }

    @ConfigItem(position = 15, keyName = "forceTeleportAtHp", name = "Force teleport under hp", description = "Plugin will force teleport at this health with no food", section = "COMBAT_SECTION")
    default int forceTeleportAtHp() {
        return (194 ^ 140) ^ (78 ^ 41);
    }
}
