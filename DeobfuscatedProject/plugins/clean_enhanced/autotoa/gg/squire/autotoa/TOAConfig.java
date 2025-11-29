/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.autotoa;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squiretoa")
public interface TOAConfig
extends Config {
    @ConfigSection(name="Path of Scabaras - Boss", description="Settings for the boss of scabaras path", position=9)
    public static final  String SCABARAS_SECTION_KEPHRI;
    @ConfigSection(name="Wardens Fight - P2", description="Settings for the second phase of wardens fight", position=11)
    public static final  String WARDENS_SECTION_2;
    @ConfigSection(name="Path of Apmeken - Boss", description="Settings for the boss of the apmeken path", position=5)
    public static final  String APMEKEN_SECTION_BABA;
    @ConfigSection(name="Invocations", description="Toggles specific features based on invocations", position=1)
    public static final  String SPECIAL_INVOCATIONS;
    @ConfigSection(name="Path of Apmeken - Puzzle", description="Settings for the puzzle of the apmeken path", position=4)
    public static final  String APMEKEN_SECTION_BABOONS;
    public static final  String TOA_CONFIG_GROUP;
    @ConfigSection(name="Wardens Fight - P3", description="Settings for the third phase of wardens fight", position=12)
    public static final  String WARDENS_SECTION_3;
    @ConfigSection(name="Path of Crondis - Boss", description="Settings for the boss of the crondis path", position=3)
    public static final  String CRONIDS_SECTION_ZEBAK;
    @ConfigSection(name="Wardens Fight - P1", description="Settings for the first phase of wardens fight", position=10)
    public static final  String WARDENS_SECTION_1;
    @ConfigSection(name="Path of Crondis - Puzzle", description="Settings for the puzzle of the crondis path", position=2)
    public static final  String CRONIDS_SECTION_PUZZLE;
    @ConfigSection(name="Path of Het - Boss", description="Settings for the boss of the het path", position=7)
    public static final  String HET_SECTION_AKKHA;
    @ConfigSection(name="General Settings", description="General settings applicable anywhere", position=0)
    public static final  String GENERAL_SETTINGS;

    @ConfigItem(name="Gear Akkha Shadow", description="What gear style to swap to for Akkha's shadows?", keyName="het.swap.shadows", section="Path of Het - Boss", position=5)
    default public ConfigStorageBox<EquipmentSetup> shadowAttackStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Dehydration", description="Is Dehydration on?", keyName="invocations.dehydration", section="Invocations", position=2)
    default public boolean dehydration() {
        return 1 != 0;
    }

    @ConfigItem(name="Ba-Ba Style", description="What gear style to swap to for Ba-Ba", keyName="apmeken.baba.style", section="Path of Apmeken - Ba Ba", position=2)
    default public ConfigStorageBox<EquipmentSetup> babaAttackStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Mage Gear", description="Mage gear on attacks for the Akkha fight?", keyName="het.mage.akka", section="Path of Het - Boss", position=4)
    default public ConfigStorageBox<EquipmentSetup> mageGearAkkha() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Ba-Ba Boulder Style", description="What gear style to swap to for Ba-Ba Boulders", keyName="apmeken.boulder.style", section="Path of Apmeken - Ba Ba", position=6)
    default public ConfigStorageBox<EquipmentSetup> babaBoulderAttackStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Melee prayer", description="What offensive melee prayer to use in TOA?", keyName="offensive.melee", section="General", position=9)
    default public u meleePrayer() {
        return u.PIETY;
    }

    @ConfigItem(name="Second room", description="What room to enter second?", keyName="room.second", section="General", position=2)
    default public l secondRoom() {
        return l.SCABARAS;
    }

    @ConfigItem(name="Fourth room", description="What room to enter fourth?", keyName="room.fourth", section="General", position=4)
    default public l fourthRoom() {
        return l.CRONDIS;
    }

    @ConfigItem(name="First room", description="What room to enter first?", keyName="room.first", section="General", position=1)
    default public l firstRoom() {
        return l.APMEKEN;
    }

    @ConfigItem(name="Range prayer", description="What offensive range prayer to use in TOA?", keyName="offensive.range", section="General", position=11)
    default public w rangePrayer() {
        return w.RIGOUR;
    }

    @ConfigItem(name="Range Gear", description="Range gear on attacks for the Akkha fight?", keyName="het.range.akka", section="Path of Het - Boss", position=3)
    default public ConfigStorageBox<EquipmentSetup> rangeGearAkkha() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Overly draining", description="Is Overly draining on?", keyName="invocations.overly_draining", section="Invocations", position=2)
    default public boolean overlyDraining() {
        return 1 != 0;
    }

    @ConfigItem(name="Mage prayer", description="What offensive mage prayer to use in TOA?", keyName="offensive.mage", section="General", position=10)
    default public t magePrayer() {
        return t.AUGURY;
    }

    static {
        SCABARAS_SECTION_KEPHRI = "Path of Scabaras - Boss";
        APMEKEN_SECTION_BABA = "Path of Apmeken - Ba Ba";
        WARDENS_SECTION_3 = "Wardens Fight - P3";
        WARDENS_SECTION_1 = "Wardens Fight - P1";
        CRONIDS_SECTION_PUZZLE = "Path of Crondis - Puzzle";
        WARDENS_SECTION_2 = "Wardens Fight - P2";
        HET_SECTION_AKKHA = "Path of Het - Boss";
        CRONIDS_SECTION_ZEBAK = "Path of Crondis - Zebak";
        APMEKEN_SECTION_BABOONS = "Path of Apmeken - Puzzle";
        TOA_CONFIG_GROUP = "squiretoa";
        GENERAL_SETTINGS = "General";
        SPECIAL_INVOCATIONS = "Invocations";
    }

    @ConfigItem(name="Obelisk Gear", description="Gear to swap to versus the Obelisk?", keyName="obelisk.swap", section="Wardens Fight - P1", position=1)
    default public ConfigStorageBox<EquipmentSetup> obeliskGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Kephri Gear Swap", description="What gear style to swap to for Kephri?", keyName="het.gear.kephri", section="Path of Scabaras - Boss", position=2)
    default public ConfigStorageBox<EquipmentSetup> kephriGearSwap() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Ranged Gear", description="Ranged gear to use versus the First Warden?", keyName="wardens.gear.p2.range", section="Wardens Fight - P2", position=3)
    default public ConfigStorageBox<EquipmentSetup> rangedP2Warden() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Spec Gear Zebak", description="Gear for the Zebak fight (with special)?", keyName="crondis.swap.zebak.special", section="Path of Crondis - Zebak", position=3)
    default public ConfigStorageBox<EquipmentSetup> specGearZebak() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Final Warden (spec)", description="Auto swap spec gear versus the final warden?", keyName="wardens.swap.last.special", section="Wardens Fight - P3", position=3)
    default public ConfigStorageBox<EquipmentSetup> finalWardenSpec() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Disable hopping", description="Enabling this disable hopping after each raid, which means you will eventually 6 hour log", keyName="disableHopping", section="General", position=13)
    default public boolean disableHopping() {
        return ((0xAA ^ 0x9B ^ (0x6A ^ 0x56)) & (0x3D ^ 0x4A ^ (0x70 ^ 0xA) ^ -1)) != 0;
    }

    @ConfigItem(name="Melee Swap", description="What gear style to swap to for melee/ranger scarab?", keyName="het.gear.kephri.melee", section="Path of Scabaras - Boss", position=2)
    default public ConfigStorageBox<EquipmentSetup> kephriMelee() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Gear Skulls", description="Auto swap gear versus the skulls?", keyName="wardens.swap.skulls", section="Wardens Fight - P3", position=5)
    default public ConfigStorageBox<EquipmentSetup> skullsGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Kephri Swarms", description="What gear style to swap to for the Swarms?", keyName="het.gear.swarm", section="Path of Scabaras - Boss", position=6)
    default public ConfigStorageBox<EquipmentSetup> kephriSwarm() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Butterfly", description="Use butterfly attack method for akkha?", keyName="het.attack.butterfly", section="Path of Het - Boss", position=2)
    default public boolean butterfly() {
        return 1 != 0;
    }

    @ConfigItem(name="Mage Gear", description="Mage gear on attacks for the Baboons puzzle?", keyName="apmeken.mage.baboons", section="Path of Apmeken - Puzzle", position=4)
    default public ConfigStorageBox<EquipmentSetup> mageGearBaboons() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Ranger Swap", description="What gear style to swap to for ranger scarab?", keyName="het.gear.kephri.range", section="Path of Scabaras - Boss", position=2)
    default public ConfigStorageBox<EquipmentSetup> kephriRanger() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Melee Gear", description="Melee gear on attacks for the Baboons puzzle?", keyName="apmeken.melee.baboons", section="Path of Apmeken - Puzzle", position=2)
    default public ConfigStorageBox<EquipmentSetup> meleeGearBaboons() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Ba-Ba Special Style", description="What spec to use for baba (> 50% energy)", keyName="apmeken.baba.special", section="Path of Apmeken - Ba Ba", position=3)
    default public ConfigStorageBox<EquipmentSetup> babaSpecialStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(keyName="loadout", name="Bank Loadout", description="Bank loadout to use for TOA", section="General", position=12)
    default public ConfigStorageBox<BankLoadout> loadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(name="Kephri Special Gear", description="What spec gear to swap to for Kephri?", keyName="het.gear.kephri.special", section="Path of Scabaras - Boss", position=3)
    default public ConfigStorageBox<EquipmentSetup> kephriSpecialGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Kephri Mage Scarab", description="What gear style to swap to for Scarab mager?", keyName="het.gear.scarab.mage", section="Path of Scabaras - Boss", position=5)
    default public ConfigStorageBox<EquipmentSetup> kephriMager() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Ba-Ba Baboon Style", description="What gear style to swap to for Ba-Ba baboons", keyName="apmeken.bababoon.style", section="Path of Apmeken - Ba Ba", position=5)
    default public ConfigStorageBox<EquipmentSetup> babaBaboonAttackStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Red X Baba", description="Use red x method for baba?", keyName="apmeken.redx.baba", section="Path of Apmeken - Ba Ba", position=1)
    default public boolean redX() {
        return 1 != 0;
    }

    @ConfigItem(name="Mage Gear", description="Mage gear to use versus the First Warden?", keyName="wardens.gear.p2.mage", section="Wardens Fight - P2", position=2)
    default public ConfigStorageBox<EquipmentSetup> mageP2Warden() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(keyName="worldsHopping", name="Hopping worlds", description="Specify which worlds you want to hop between during raids. If left empty it will choose worlds for you", section="General", position=13)
    default public String worldsHopping() {
        return "336,368,369";
    }

    @ConfigItem(name="Gear Crocodile", description="Swap gear on the palm crocodile??", keyName="crondis.swap.croc", section="Path of Crondis - Puzzle", position=1)
    default public ConfigStorageBox<EquipmentSetup> gearSwapCrocodile() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Anonymize discord", description="Enabling this will replace your discord username with anonymous in the #toa-loot channel", keyName="anonymize", section="General", position=13)
    default public boolean anonymize() {
        return ((0x1F ^ 0x2F) & ~(0x2A ^ 0x1A)) != 0;
    }

    @ConfigItem(name="Third room", description="What room to enter third?", keyName="room.third", section="General", position=3)
    default public l thirdRoom() {
        return l.HET;
    }

    @ConfigItem(name="Gear Final Warden", description="Auto swap gear versus the Final Warden?", keyName="wardens.swap.last", section="Wardens Fight - P3", position=2)
    default public ConfigStorageBox<EquipmentSetup> finalWardenGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Akkha Final Special", description="What spec gear style to swap to for Akkha's last phase?", keyName="het.swap.final.spec", section="Path of Het - Boss", position=7)
    default public ConfigStorageBox<EquipmentSetup> akkhaFinalSpec() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Core Special Gear", description="Spec gear versus the Core?", keyName="wardens.swap.core.special", section="Wardens Fight - P2", position=5)
    default public ConfigStorageBox<EquipmentSetup> specialCore() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Melee Gear", description="Melee gear on attacks for the Akkha fight?", keyName="het.melee.akka", section="Path of Het - Boss", position=2)
    default public ConfigStorageBox<EquipmentSetup> meleeGearAkkha() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Range Gear", description="Range gear on attacks for the Baboons puzzle?", keyName="apmeken.range.baboons", section="Path of Apmeken - Puzzle", position=3)
    default public ConfigStorageBox<EquipmentSetup> rangeGearBaboons() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Keep Back", description="Is keep back on?", keyName="invocations.keep_back", section="Invocations", position=2)
    default public boolean keepBack() {
        return 1 != 0;
    }

    @ConfigItem(name="Gear Core Normal", description="Gear to use versus the Core when we do not have spec?", keyName="wardens.swap.core", section="Wardens Fight - P2", position=4)
    default public ConfigStorageBox<EquipmentSetup> normalCore() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(keyName="gear.zebak", name="Gear zebak", description="The loadout to use for Zebak", section="Path of Crondis - Zebak", position=2)
    default public ConfigStorageBox<EquipmentSetup> gearSwapZebak() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }
}

