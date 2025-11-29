package gg.squire.whisperer.config;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.EnumC0004e;
@ConfigGroup("squirewhisperer")
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:gg/squire/whisperer/config/SquireWhispererConfig.class */
public interface SquireWhispererConfig extends Config {
    @ConfigSection(name = "Fighting", description = "Settings related to fighting", position = 0)
    public static final /* synthetic */ String FIGHT = "fight";
    @ConfigSection(name = "Banking", description = "Settings related to banking", position = 0)
    public static final /* synthetic */ String BANKING = "banking";

    @ConfigItem(position = 0, name = "Pray pot. at", keyName = "pray.pot.at", description = "What pray points to restore prayer at", section = "fight")
    @Range(max = 99, min = 5)
    default int drinkPrayerAt() {
        return 185 ^ 139;
    }

    @ConfigItem(position = 0, name = "Eat at", keyName = "eat.at", description = "What hp to eat at", section = "fight")
    @Range(max = 99, min = 20)
    default int eatAt() {
        return 48 ^ 2;
    }

    @ConfigItem(position = 0, keyName = "bank", name = "Bank", description = "Which bank should we use?", section = "banking")
    default EnumC0004e bank() {
        return EnumC0004e.GRAND_EXCHANGE;
    }

    @ConfigItem(position = 0, name = "Min. food", keyName = "food.min", description = "How many foods/brew doses before starting the fight?", section = "fight")
    @Range(max = 12)
    default int food() {
        return "   ".length();
    }

    @ConfigItem(position = 0, keyName = "bankloadout", name = "Bank Loadout", description = "Loadout to use to for bank + fight", section = "banking")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(position = 0, name = "Min. prayer doses", keyName = "prayer.dose.min", description = "How many prayer doses should we have before starting the fight?", section = "fight")
    @Range(max = 12)
    default int prayDoses() {
        return 163 ^ 171;
    }
}
