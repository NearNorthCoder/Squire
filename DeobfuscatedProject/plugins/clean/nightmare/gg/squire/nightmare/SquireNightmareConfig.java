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
package gg.squire.nightmare;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.s;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.w;

@ConfigGroup(value="squirenightmare")
public interface SquireNightmareConfig
extends Config {
    @ConfigSection(name="Outside Settings", description="Settings related to outside the instance", position=2)
    public static final /* synthetic */ String OUTSIDE_SETTINGS;
    @ConfigSection(name="Gear Settings", description="Settings related to your gear", position=0)
    public static final /* synthetic */ String GEAR_SETTINGS;
    @ConfigSection(name="Fight Settings", description="Settings related to fighting the boss", position=1, closedByDefault=true)
    public static final /* synthetic */ String FIGHT_SETTINGS;
    @ConfigSection(name="Misc Settings", description="Miscellaneous settings", position=3)
    public static final /* synthetic */ String MISC_SETTINGS;

    static {
        MISC_SETTINGS = "Misc Settings";
        FIGHT_SETTINGS = "Fight Settings";
        GEAR_SETTINGS = "Gear Settings";
        OUTSIDE_SETTINGS = "Outside Settings";
    }

    @ConfigItem(position=2, keyName="bankLocation", name="Bank Location", description="What bank should we utilize?", section="Outside Settings", unhide="bankingEnabled")
    default public w bankLocation() {
        return w.VER_SINHAZA;
    }

    @ConfigItem(position=7, keyName="amountToRechargeStaff", name="Charges to Add", description="The amount of charges we will add to the staff when recharging.", section="Outside Settings")
    default public int rechargeStaffAmount() {
        return 0xFFFFD7D4 & 0x2FFB;
    }

    @ConfigItem(position=5, keyName="sleepWalkerGear", name="Sleepwalker Gear Setup", description="Gear setup attacking sleepwalkers", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> sleepwalkerGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=25, keyName="proceedWithoutBoostsHIDDEN", name="Continue without Combat Potions", description="Should we continue PNM attempts when we're out of combat potions?", hidden=true, warning="DO NOT TURN THIS ON. REALLY. DON'T.", section="Fight Settings")
    default public boolean continueWithNoPots() {
        return ((0xA6 ^ 0x88) & ~(0x25 ^ 0xB)) != 0;
    }

    @ConfigItem(position=6, keyName="amountToRechargeStaffAt", name="Recharge Staff At", description="Recharge staff at bank when charges are under this amount.", section="Outside Settings")
    @Range(min=-1)
    default public int rechargeStaffAt() {
        return 0xFFFFFDFE & 0x3F5;
    }

    @ConfigItem(position=6, keyName="mCleanseRequire", name="Min Cleanse Dosages", description="Minimum doses of parasite cleanses to start another attempt", hidden=true, unhide="fight.advancedSettings", unhideValue="true", section="Fight Settings")
    @Range(min=2, max=8)
    default public int teleportCleanse() {
        return "   ".length();
    }

    @ConfigItem(position=9, keyName="prayerRestore", name="Restore Prayer At", description="Restore prayer when below this amount of prayer points", hidden=true, unhide="fight.advancedSettings", unhideValue="true", section="Fight Settings")
    default public int restorePrayerAt() {
        return 48 + 1 - -58 + 46 ^ 106 + 43 - 109 + 90;
    }

    @ConfigItem(position=4, keyName="fight.advancedSettings", name="Advanced Settings", description="Lets you fine tune the fight parameters - only use if you know what you're doing", warning="Make sure you know what you are doing before changing these, hovering the mouse over the setting will give you a description of what it does", section="Fight Settings")
    default public boolean advancedSettings() {
        return ((0x51 ^ 0x74) & ~(0xE1 ^ 0xC4)) != 0;
    }

    @Range(min=0, max=8)
    @ConfigItem(position=5, keyName="mFoodRequire", name="Min Food", description="Minimum food to start another attempt", hidden=true, unhide="fight.advancedSettings", unhideValue="true", section="Fight Settings")
    default public int minimumFood() {
        return " ".length();
    }

    @ConfigItem(position=2, keyName="fight.fireSpell", name="Fire Spell", description="Select the fire spell to use.", hidden=true, unhide="fight.useFireSpells", unhideValue="true", section="Fight Settings")
    default public s fireSpell() {
        return s.FIRE_SURGE;
    }

    @ConfigItem(position=6, keyName="gear.specialAttack", name="Special Gear Setup", description="Gear setup for special attack", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> specGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=4, keyName="huskGear", name="Husk Gear Setup", description="Gear setup attacking husks", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> huskGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=15, keyName="hopAfterExiting", name="Hop After Teleport", description="Will hop worlds after teleporting out of PNM.", section="Outside Settings")
    default public boolean hopAfterExit() {
        return " ".length() != 0;
    }

    @ConfigItem(position=1, keyName="bankingEnabled", name="Enable Banking", description="Enable banking", section="Outside Settings")
    default public boolean enableBanking() {
        return " ".length() != 0;
    }

    @ConfigItem(position=3, keyName="enableRestocking", name="Enable GE Restocking", description="Will sell loot and buy supplies from GE when needed.", section="Outside Settings")
    default public boolean enableRestocking() {
        return ((0x73 ^ 0x6F ^ (0x15 ^ 0x29)) & (128 + 44 - 19 + 24 ^ 39 + 143 - 166 + 129 ^ -" ".length())) != 0;
    }

    @ConfigItem(position=8, keyName="restoreBetweenPhases", name="Restore HP between phases (%)", description="At what percentage of HP should we restore between phases?", hidden=true, unhide="fight.advancedSettings", unhideValue="true", section="Fight Settings")
    default public int restoreHealthPercentBetweenPhase() {
        return 0x7A ^ 0x46;
    }

    @ConfigItem(position=16, keyName="adaptiveHopAfterTeleport", name="Adaptive Hop Mode", description="Will only hop if people are talking or we are close to 6h log.", section="Outside Settings", hidden=true, unhide="hopAfterExiting")
    default public boolean adaptiveHopAfterTeleport() {
        return " ".length() != 0;
    }

    @ConfigItem(position=10, keyName="neverTeleport", name="Never Teleport", description="Never teleport out of the instance (dangerous)", hidden=true, unhide="fight.advancedSettings", unhideValue="true", section="Fight Settings")
    default public boolean neverTeleport() {
        return ((0x60 ^ 0x68 ^ (0x6F ^ 0x5D)) & (84 + 66 - 34 + 60 ^ 14 + 37 - -47 + 40 ^ -" ".length())) != 0;
    }

    @ConfigItem(position=3, keyName="fight.hpToTeleportOut", name="Emergency Teleport HP", description="Under what health should we teleport if we're out of food? (0 to disable)", section="Fight Settings")
    default public int hpToTeleportOut() {
        return 4 ^ 0x10;
    }

    @ConfigItem(position=2, keyName="fight.useFireSpells", name="Use Fire Spells", description="Should we use fire spells (i.e not using a powered staff)", section="Fight Settings")
    default public boolean useFireSpells() {
        return ((0x28 ^ 0xE) & ~(0x6D ^ 0x4B) & ~((0x9F ^ 0xC2) & ~(0xC6 ^ 0x9B))) != 0;
    }

    @ConfigItem(position=7, keyName="restoreHPs", name="Restore HP", description="Eat food when below this hp", hidden=true, unhide="fight.advancedSettings", unhideValue="true", section="Fight Settings")
    default public int eatAt() {
        return 4 ^ 0x65 ^ 61 + 80 - 66 + 52;
    }

    @ConfigItem(position=11, keyName="lowerDamageFinalPhase", name="Lower Damage Final Phase", description="Tries to prevent all sleepwalkers from reaching PNM during the final phase, extremely dependant on ping and takes longer than normal kill.", hidden=true, unhide="fight.advancedSettings", unhideValue="true", section="Fight Settings")
    default public boolean lowerDamageFinalPhase() {
        return ((0xB1 ^ 0xA6 ^ (0x6D ^ 0x1A)) & (23 + 143 - 134 + 207 ^ 104 + 35 - 25 + 29 ^ -" ".length())) != 0;
    }

    @ConfigItem(position=4, keyName="restoreInPOH", name="Use POH for Restoration", description="Do you want to use your pool in house to restore stats?", section="Outside Settings")
    default public boolean restoreInPOH() {
        return ((70 + 81 - 83 + 131 ^ 86 + 49 - 60 + 59) & (0xE8 ^ 0xB1 ^ (0x13 ^ 0xB) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=1, keyName="PNMbankloadout", name="Bank Loadout", description="Bank loadout to use", section="Gear Settings")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(position=3, keyName="parasiteGear", name="Parasite Gear Setup", description="Gear setup attacking parasites", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> parasiteGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=1, keyName="assistMode", name="Enable Helper Mode", description="Use this for making mouse recordings. It will only avoid mechanics for you, will NOT handle attacking enemies, gear swaps, looting, banking, etc...", section="Misc Settings")
    default public boolean assistantMode() {
        return ((0x66 ^ 2 ^ (0x2C ^ 0x1E)) & (0xAE ^ 0xC4 ^ (0x90 ^ 0xAC) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=2, keyName="totemGear", name="Totem Gear", description="Gear for attacking totems", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> totemGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }
}

