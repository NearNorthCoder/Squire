package gg.squire.gorillas;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.e;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.h;
@ConfigGroup("squiregorillas")
/* loaded from: squire-gorillas-0.2.1.jar:gg/squire/gorillas/SquireGorillaConfig.class */
public interface SquireGorillaConfig extends Config {
    @ConfigSection(name = "Bank Settings", description = "Settings related to banking", position = 0)
    public static final /* synthetic */ String BANK_SETTINGS = "Bank Settings";
    @ConfigSection(name = "Prayer Settings", description = "Settings related to prayer options", position = 20)
    public static final /* synthetic */ String PRAYER_SETTINGS = "Prayer Settings";
    @ConfigSection(name = "Gear Settings", description = "Settings related to gear", position = 10)
    public static final /* synthetic */ String GEAR_SETTINGS = "Gear Settings";
    @ConfigSection(name = "Loot Settings", description = "Loot options", position = 30)
    public static final /* synthetic */ String LOOT_SETTINGS = "Loot Settings";

    @ConfigItem(position = 1, keyName = "loot.value", name = "Loot Above Value", description = "Loot Above Value", section = "Loot Settings")
    default int lootValue() {
        return (-10294) & 15293;
    }

    @ConfigItem(position = 2, keyName = "eatAt", name = "Hp to eat at", description = "At what hp should we eat?", section = "Bank Settings")
    @Range(min = 20, max = 85)
    default int eatAt() {
        return 30 ^ 55;
    }

    @ConfigItem(position = 2, keyName = "gear.melee", name = "Melee gear", description = "Melee attack style gear", section = "Gear Settings")
    default ConfigStorageBox<EquipmentSetup> melee() {
        return new ConfigStorageBox<>("equipmentsetup", "");
    }

    @ConfigItem(position = 1, keyName = "prayer.ranged", name = "Ranged prayer", description = "What melee prayer to use with ranged gear", section = "Prayer Settings")
    default h rangePrayer() {
        return h.RIGOUR;
    }

    @ConfigItem(position = 1, keyName = "gear.ranged", name = "Ranged gear", description = "Ranged attack style gear", section = "Gear Settings")
    default ConfigStorageBox<EquipmentSetup> ranged() {
        return new ConfigStorageBox<>("equipmentsetup", "");
    }

    @ConfigItem(position = 1, keyName = "bank.loadout.selected", name = "Bank loadout", description = "Bank loadout to withdraw", section = "Bank Settings")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(position = 2, keyName = "prayer.melee", name = "Melee prayer", description = "What melee prayer to use with melee gear", section = "Prayer Settings")
    default e meleePrayer() {
        return e.PIETY;
    }
}
