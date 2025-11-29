package gg.squire.vardorvis;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.EnumC0005f;
@ConfigGroup("squirevardorvis")
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:gg/squire/vardorvis/SquireVardorvisConfig.class */
public interface SquireVardorvisConfig extends Config {
    @ConfigSection(name = "Special Attack", description = "Settings related to special attack", position = 0)
    public static final /* synthetic */ String SPECIAL = "special";
    @ConfigSection(name = "Banking", description = "Settings related to banking", position = 0)
    public static final /* synthetic */ String BANKING = "banking";
    @ConfigSection(name = "Fighting", description = "Settings related to fighting", position = 0)
    public static final /* synthetic */ String FIGHT = "fight";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 1, keyName = "bankOnStart", name = "Bank on start", description = "Bank when starting the plugin", section = "banking")
    default boolean bankOnStart() {
        return ((141 ^ 162) ^ (191 ^ 158)) & (((224 ^ 178) ^ (241 ^ 173)) ^ (-" ".length()));
    }

    @ConfigItem(position = 1, name = "Spec under how much health?", keyName = "specHp", description = "What HP to use special attack at", section = "special")
    @Range(max = 700, min = 20)
    default int specHp() {
        return (((154 ^ 163) + (118 ^ 3)) - (-(95 ^ 72))) + "   ".length();
    }

    @ConfigItem(position = 0, name = "Eat at", keyName = "eat.at", description = "What hp to eat at", section = "fight")
    @Range(max = 99, min = 40)
    default int eatAt() {
        return 58 ^ 8;
    }

    @ConfigItem(position = 0, keyName = "bank", name = "Bank", description = "Which bank should we use?", section = "banking")
    default EnumC0005f bank() {
        return EnumC0005f.GRAND_EXCHANGE;
    }

    @ConfigItem(position = 0, name = "Min. food", keyName = "food.min", description = "How many foods/brew doses before starting the fight?", section = "fight")
    @Range(max = 16)
    default int food() {
        return 40 ^ 46;
    }

    @ConfigItem(position = 0, keyName = "specialAttack", name = "Special Gear Setup", description = "Gear setup for special attack", section = "special")
    default ConfigStorageBox<EquipmentSetup> specGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 0, name = "Pray pot. at", keyName = "pray.pot.at", description = "What pray points to restore prayer at", section = "fight")
    @Range(max = 99, min = 15)
    default int drinkPrayerAt() {
        return 81 ^ 99;
    }

    @ConfigItem(position = 0, name = "Min. prayer doses", keyName = "prayer.dose.min", description = "How many prayer doses should we have before starting the fight?", section = "fight")
    @Range(max = 12)
    default int prayDoses() {
        return "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 2, keyName = "earlyBank", name = "Bank early", description = "Bank early to prevent deaths on the way to the bank", section = "banking")
    default boolean earlyBank() {
        return ((57 ^ 64) ^ (218 ^ 193)) & (((((141 + 199) - 239) + 105) ^ (((97 + 22) - (-8)) + 45)) ^ (-" ".length()));
    }

    @ConfigItem(position = 0, keyName = "bankloadout", name = "Bank Loadout", description = "Loadout to use to for bank + fight", section = "banking")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }
}
