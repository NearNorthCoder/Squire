/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.config.Range
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.barrows;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.f;

@ConfigGroup(value="squirebarrows")
public interface SquireBarrowsConfig
extends Config {
    @ConfigSection(name="Gear Settings", description="Gear settings related to brothers", position=20)
    public static final /* synthetic */ String GEAR_SETTINGS;
    @ConfigSection(name="Prayer Settings", description="Prayer Settings related to brothers", position=10)
    public static final /* synthetic */ String PRAYER_SETTINGS;
    @ConfigSection(name="Banking Settings", description="Banking settings", position=5)
    public static final /* synthetic */ String BANKING_SETTINGS;
    @ConfigSection(name="POH Settings", description="POH Settings", position=3)
    public static final /* synthetic */ String POH_SETTINGS;
    @ConfigSection(name="General Settings", description="General settings", position=0)
    public static final /* synthetic */ String GENERAL_SETTINGS;

    @ConfigItem(position=22, keyName="karil.offensive", name="Karil Offensive", description="Offensive prayer against Karil", section="Prayer Settings")
    default public f karilOffensive() {
        return f.EAGLE_EYE;
    }

    static {
        GENERAL_SETTINGS = "General settings";
        POH_SETTINGS = "POH Settings";
        PRAYER_SETTINGS = "Prayer Settings";
        BANKING_SETTINGS = "Banking settings";
        GEAR_SETTINGS = "Gear Settings";
    }

    @ConfigItem(position=23, keyName="ahrim.offensive", name="Ahrim Offensive", description="Offensive prayer against Ahrim", section="Prayer Settings")
    default public f ahrimOffensive() {
        return f.MYSTIC_MIGHT;
    }

    @ConfigItem(position=2, keyName="specOnAhrim", name="Spec on Ahrim?", description="Should we use special attack vs ahrim?", section="General settings")
    default public boolean specOnAhrim() {
        return false;
    }

    @Range(min=60, max=100)
    @ConfigItem(position=0, keyName="rewardPotential", name="Reward Potential", description="What reward potential to aim for", section="General settings")
    default public int rewardPotential() {
        return 0x5B ^ 0x50 ^ (0x2D ^ 0x76);
    }

    @ConfigItem(position=1, keyName="useBank", name="Use bank", description="Use bank to regear when needed", section="Banking settings")
    default public boolean useBank() {
        return 1 != 0;
    }

    @ConfigItem(position=2, keyName="bankLoadout", name="Bank loadout", description="Loadout to use when banking", section="Banking settings", hidden=true, unhide="useBank")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(keyName="karil.gear", name="Karil Gear", description="Gear to swap to when attacking Kharil", section="Gear Settings", position=2)
    default public ConfigStorageBox<EquipmentSetup> karilGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=3, keyName="neverRisk", name="Never risk on brother", description="With this enabled, we will ditch if we have no pray (even if brother hp is low)", hidden=true, unhide="useHouse", section="POH Settings")
    default public boolean neverRisk() {
        return false;
    }

    @Range(min=1, max=99)
    @ConfigItem(position=1, keyName="eatAtHp", name="Eat at", description="What hp to eat at", section="General settings")
    default public int eatAtHp() {
        return 0x99 ^ 0xB1;
    }

    @ConfigItem(position=4, keyName="bankForFood", name="Bank for food?", description="Bank whenever we are out of food?", section="Banking settings", hidden=true, unhide="useBank")
    default public boolean bankForFood() {
        return 1 != 0;
    }

    @ConfigItem(position=24, keyName="tunnel.offensive", name="Tunnel Offensive", description="Offensive prayer against tunnel monsters", section="Prayer Settings")
    default public f tunnelOffensive() {
        return f.PIETY;
    }

    @ConfigItem(position=21, keyName="rest.offensive", name="Default Offensive", description="Offensive prayer against Torag, Dharok, Verac and Guthan", section="Prayer Settings")
    default public f defaultOffensive() {
        return f.PIETY;
    }

    @ConfigItem(keyName="tunnels.gear", name="Tunnel Gear", description="Gear to swap to when attacking skeletons and stuff in tunnels", section="Gear Settings", position=4)
    default public ConfigStorageBox<EquipmentSetup> tunnelGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=4, keyName="specOnKaril", name="Spec on Karil?", description="Should we also spec on Karil?", section="General settings")
    default public boolean specOnKaril() {
        return false;
    }

    @ConfigItem(position=5, keyName="karilSpecGear", name="Karil Spec gear", description="Gear to equip before specing on Karil", section="General settings", hidden=true, unhide="specOnKaril")
    default public ConfigStorageBox<EquipmentSetup> karilSpecGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=3, keyName="ahrimSpecGear", name="Ahrim Spec gear", description="Gear to equip before specing on Ahrim", section="General settings", hidden=true, unhide="specOnAhrim")
    default public ConfigStorageBox<EquipmentSetup> ahrimSpecGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=1, keyName="useHouse", name="Use pool", description="Restores prayer/health at house", section="POH Settings")
    default public boolean useHouse() {
        return 1 != 0;
    }

    @ConfigItem(keyName="mage.gear", name="Mage Gear", description="Gear to swap to when attacking Dharok, Verac, Guthan and Torag", section="Gear Settings", position=1)
    default public ConfigStorageBox<EquipmentSetup> mageGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=3, keyName="bankForPrayer", name="Bank for prayer pots?", description="Bank whenever we are out of prayer pots?", section="Banking settings", hidden=true, unhide="useBank")
    default public boolean bankForPrayer() {
        return 1 != 0;
    }

    @ConfigItem(position=2, keyName="goHouseOnPrayerDrain", name="Restore prayer mid trip", description="Allow restoring prayer mid trip if you run out", section="POH Settings", hidden=true, unhide="useHouse")
    default public boolean restoreMidTrip() {
        return ((0xEB ^ 0x81 ^ (0xC3 ^ 0xAE)) & (99 + 139 - 206 + 162 ^ 2 + 87 - -78 + 30 ^ -1)) != 0;
    }

    @ConfigItem(keyName="ahrim.gear", name="Ahrim Gear", description="Gear to swap to when attacking Ahrim", section="Gear Settings", position=3)
    default public ConfigStorageBox<EquipmentSetup> ahrimGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }
}

