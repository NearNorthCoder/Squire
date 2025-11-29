package gg.squire.duke;

import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.EnumC0003d;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@ConfigGroup("squiresepulchre")
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:gg/squire/duke/SquireDukeSucellusConfig.class */
public interface SquireDukeSucellusConfig extends Config {
    @ConfigSection(name = "Fighting", description = "Settings related to fighting", position = 0)
    public static final /* synthetic */ String FIGHT = "fight";
    @ConfigSection(name = "Banking", description = "Settings related to banking", position = 0)
    public static final /* synthetic */ String BANKING = "banking";
    @ConfigSection(name = "Special Attack", description = "Settings related to special attack", position = 0)
    public static final /* synthetic */ String SPECIAL = "special";

    @ConfigItem(position = 0, name = "Eat at", keyName = "eat.at", description = "What hp to eat at", section = "fight")
    @Range(max = 99, min = 40)
    default int eatAt() {
        return 117 ^ 71;
    }

    @ConfigItem(position = 0, keyName = "bankloadout", name = "Bank Loadout", description = "Loadout to use to for bank + fight", section = "banking")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(position = 0, keyName = "specialAttack", name = "Special Gear Setup", description = "Gear setup for special attack", section = "special")
    default ConfigStorageBox<EquipmentSetup> specGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 1, name = "Spec when Duke is low HP", keyName = "lowSpec", description = "Only use special attack when duke is under 110 HP", section = "special")
    default boolean lowHpSpec() {
        return ((201 ^ 175) ^ (19 ^ 126)) & (((((164 + 55) - 85) + 53) ^ (((121 + 85) - 139) + 109)) ^ (-" ".length())) & ((((((220 + 212) - 252) + 56) ^ (((168 + 85) - 218) + 155)) & (((27 ^ 55) ^ (253 ^ 131)) ^ (-" ".length()))) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 2, name = "Use Lightbearer switch", keyName = "gazedodge", description = "Equips Lightbearer during prep phase for more spec", section = "special")
    default boolean lightbearer() {
        return ((169 ^ 167) ^ "  ".length()) & (((214 ^ 179) ^ (119 ^ 30)) ^ (-" ".length()));
    }

    @ConfigItem(position = 0, name = "Pray pot. at", keyName = "pray.pot.at", description = "What pray points to restore prayer at", section = "fight")
    @Range(max = 99, min = 15)
    default int drinkPrayerAt() {
        return 189 ^ 143;
    }

    @ConfigItem(position = 0, name = "Min. prayer doses", keyName = "prayer.dose.min", description = "How many prayer doses should we have before starting the fight?", section = "fight")
    @Range(max = 12)
    default int prayDoses() {
        return "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 0, name = "Safer Gaze Dodging", keyName = "gazedodge", description = "Disables tick-dodging the gaze (Use in case of lag)", section = "fight")
    default boolean safeDodge() {
        return ((92 ^ 86) ^ (114 ^ 86)) & (((40 ^ 122) ^ (200 ^ 180)) ^ (-" ".length()));
    }

    @ConfigItem(position = 0, name = "Min. food", keyName = "food.min", description = "How many foods/brew doses before starting the fight?", section = "fight")
    @Range(max = 12)
    default int food() {
        return "  ".length() ^ (172 ^ 170);
    }

    @ConfigItem(position = 0, keyName = "bank", name = "Bank", description = "Which bank should we use?", section = "banking")
    default EnumC0003d bank() {
        return EnumC0003d.GRAND_EXCHANGE;
    }
}
