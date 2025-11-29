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
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.toa;

import -.r.u.q.e.s.o.t.a.i.l;
import -.r.u.q.e.s.o.t.a.i.m;
import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.o;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squiretoa")
public interface TOAConfig
extends Config {
    @ConfigSection(name="Path of Apmeken - Boss", description="Settings for the boss of the apmeken path", position=5)
    public static final /* synthetic */ String APMEKEN_SECTION_BABA;
    @ConfigSection(name="Path of Scabaras - Puzzle", description="Settings for the puzzle of scabaras path", position=8)
    public static final /* synthetic */ String SCABARAS_SECTION_PUZZLE;
    @ConfigSection(name="General Settings", description="General settings applicable anywhere", position=1)
    public static final /* synthetic */ String GENERAL_SETTINGS;
    @ConfigSection(name="Path of Crondis - Boss", description="Settings for the boss of the crondis path", position=3)
    public static final /* synthetic */ String CRONIDS_SECTION_ZEBAK;
    @ConfigSection(name="Wardens Fight - P3", description="Settings for the third phase of wardens fight", position=12)
    public static final /* synthetic */ String WARDENS_SECTION_3;
    @ConfigSection(name="Path of Crondis - Puzzle", description="Settings for the puzzle of the crondis path", position=2)
    public static final /* synthetic */ String CRONIDS_SECTION_PUZZLE;
    @ConfigSection(name="Path of Scabaras - Boss", description="Settings for the boss of scabaras path", position=9)
    public static final /* synthetic */ String SCABARAS_SECTION_KEPHRI;
    @ConfigSection(name="Wardens Fight - P2", description="Settings for the second phase of wardens fight", position=11)
    public static final /* synthetic */ String WARDENS_SECTION_2;
    @ConfigSection(name="Path of Het - Puzzle", description="Settings for the puzzle of the het path", position=6)
    public static final /* synthetic */ String HET_SECTION_MIRRORS;
    @ConfigSection(name="Wardens Fight - P1", description="Settings for the first phase of wardens fight", position=10)
    public static final /* synthetic */ String WARDENS_SECTION_1;
    public static final /* synthetic */ String TOA_CONFIG_GROUP;
    @ConfigSection(name="Path of Het - Boss", description="Settings for the boss of the het path", position=7)
    public static final /* synthetic */ String HET_SECTION_AKKHA;
    @ConfigSection(name="Path of Apmeken - Puzzle", description="Settings for the puzzle of the apmeken path", position=4)
    public static final /* synthetic */ String APMEKEN_SECTION_BABOONS;

    @ConfigItem(name="Gear Core Normal", description="Gear to use versus the Core when we do not have spec?", keyName="wardens.swap.core", section="Wardens Fight - P2", position=4)
    default public ConfigStorageBox<EquipmentSetup> normalCore() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Outline Kephri Fireball", description="Should show kephri's fireball attack in an outline?", keyName="het.outline.kephri", section="Path of Scabaras - Boss", position=7)
    default public boolean renderKephriFire() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Plate Sum Overlay", description="Render indicators for the summing puzzle plates?", keyName="outline.plate.sum", section="Path of Scabaras - Puzzle", position=2)
    default public boolean markPuzzlesSum() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Melee Gear", description="Melee gear on attacks for the Baboons puzzle?", keyName="apmeken.melee.baboons", section="Path of Apmeken - Puzzle", position=2)
    default public ConfigStorageBox<EquipmentSetup> meleeGearBaboons() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Kephri Swarms", description="What gear style to swap to for the Swarms?", keyName="het.gear.swarm", section="Path of Scabaras - Boss", position=6)
    default public ConfigStorageBox<EquipmentSetup> kephriSwarm() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Outline Explosive Flies", description="Should outline explosive flies destination tile?", keyName="het.outline.kephri.flies", section="Path of Scabaras - Boss", position=9)
    default public boolean renderKephriExplosiveFlies() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Redirect boulder clicks", description="Always clicks the right boulder, no matter which you click", keyName="apmeken.redirect.boulders", section="Path of Apmeken - Ba Ba", position=7)
    default public boolean redirectBoulderClicks() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Mage Gear", description="Mage gear to use versus the First Warden?", keyName="wardens.gear.p2.mage", section="Wardens Fight - P2", position=2)
    default public ConfigStorageBox<EquipmentSetup> mageP2Warden() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Prayer Mode", description="Flick Prayers versus the First Warden?", keyName="wardens.flick.first", section="Wardens Fight - P2", position=1)
    default public n prayFlickWarden() {
        return n.FLICK;
    }

    @ConfigItem(name="Final Min Spec", description="Amount of spec required for specing final phase?", keyName="final.special.req", section="Wardens Fight - P3", position=4)
    @Range(min=25, max=100)
    default public int specFinalReq() {
        return 172 + 33 - 170 + 145 ^ 57 + 156 - 178 + 138;
    }

    @ConfigItem(name="Spec Min Ba-Ba", description="Amount of spec required for specing Ba-Ba?", keyName="swap.baba.special.req", section="Path of Apmeken - Ba Ba", position=4)
    @Range(min=25, max=100)
    default public int specGearBabaReq() {
        return 0x49 ^ 0x50;
    }

    @ConfigItem(name="Mage prayer", description="What offensive mage prayer to use in TOA?", keyName="offensive.mage", section="General", position=10)
    default public l magePrayer() {
        return l.AUGURY;
    }

    @ConfigItem(name="Outline Kephri Swarms", description="Should show kephri's fireball attack in an outline?", keyName="het.outline.kephri.swarms", section="Path of Scabaras - Boss", position=8)
    default public boolean renderKephriSwarms() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Prayer Mode Baba", description="Prayer mode for the Baba fight?", keyName="apmeken.flick.baba", section="Path of Apmeken - Ba Ba", position=1)
    default public n prayFlickBaba() {
        return n.FLICK;
    }

    @ConfigItem(name="Akkha Final Gear", description="What gear style to swap to for Akkha's last phase?", keyName="het.swap.final", section="Path of Het - Boss", position=6)
    default public ConfigStorageBox<EquipmentSetup> akkhaFinalNormal() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Kephri Min Spec", description="What minimum special energy to swap to special gear for Kephri?", keyName="het.gear.kephri.special.req", section="Path of Scabaras - Boss", position=4)
    @Range(min=25, max=100)
    default public int kephriSpecialReq() {
        return 0x9A ^ 0xB1 ^ (0x2F ^ 0x60);
    }

    @ConfigItem(name="Ranged Gear", description="Ranged gear to use versus the First Warden?", keyName="wardens.gear.p2.range", section="Wardens Fight - P2", position=3)
    default public ConfigStorageBox<EquipmentSetup> rangedP2Warden() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Prayer Mode Akkha", description="Prayer mode for the Akkha fight?", keyName="het.flick.akkha", section="Path of Het - Boss", position=1)
    default public n prayerFlickAkkha() {
        return n.NORMAL;
    }

    @ConfigItem(name="Outline mirrors", description="Render an outline over the mirrors that can be picked up?", keyName="het.outline.mirrors", section="Path of Het - Puzzle", position=1)
    default public boolean outlineMirrors() {
        return " ".length() != 0;
    }

    @ConfigItem(keyName="swapDelay", name="Swap Delay", description="Delay between individual gear piece swaps (the higher, the slower you swap; 0 is default)", section="General", position=13)
    @Range(max=100)
    default public int gearSwapDelay() {
        return (0xDB ^ 0xBF ^ (0xFA ^ 0xBA)) & (161 + 129 - 260 + 158 ^ 102 + 15 - 98 + 133 ^ -" ".length());
    }

    @ConfigItem(name="Ba-Ba Baboon Style", description="What gear style to swap to for Ba-Ba baboons", keyName="apmeken.bababoon.style", section="Path of Apmeken - Ba Ba", position=5)
    default public ConfigStorageBox<EquipmentSetup> babaBaboonAttackStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Range Gear", description="Range gear on attacks for the Akkha fight?", keyName="het.range.akka", section="Path of Het - Boss", position=3)
    default public ConfigStorageBox<EquipmentSetup> rangeGearAkkha() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Prayer Flick Kephri", description="Flick Prayers for the Kephri fight?", keyName="het.flick.kephri", section="Path of Scabaras - Boss", position=1)
    default public n prayerModeKephri() {
        return n.FLICK;
    }

    @ConfigItem(name="Gear Crocodile", description="Swap gear on the palm crocodile??", keyName="crondis.swap.croc", section="Path of Crondis - Puzzle", position=1)
    default public ConfigStorageBox<EquipmentSetup> gearSwapCrocodile() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Range prayer", description="What offensive range prayer to use in TOA?", keyName="offensive.range", section="General", position=11)
    default public o rangePrayer() {
        return o.RIGOUR;
    }

    @ConfigItem(name="Spec Gear Zebak", description="Gear for the Zebak fight (with special)?", keyName="crondis.swap.zebak.special", section="Path of Crondis - Zebak", position=3)
    default public ConfigStorageBox<EquipmentSetup> specGearZebak() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    static {
        CRONIDS_SECTION_ZEBAK = "Path of Crondis - Zebak";
        TOA_CONFIG_GROUP = "squiretoa";
        HET_SECTION_MIRRORS = "Path of Het - Puzzle";
        WARDENS_SECTION_1 = "Wardens Fight - P1";
        CRONIDS_SECTION_PUZZLE = "Path of Crondis - Puzzle";
        SCABARAS_SECTION_PUZZLE = "Path of Scabaras - Puzzle";
        SCABARAS_SECTION_KEPHRI = "Path of Scabaras - Boss";
        APMEKEN_SECTION_BABOONS = "Path of Apmeken - Puzzle";
        APMEKEN_SECTION_BABA = "Path of Apmeken - Ba Ba";
        WARDENS_SECTION_2 = "Wardens Fight - P2";
        WARDENS_SECTION_3 = "Wardens Fight - P3";
        HET_SECTION_AKKHA = "Path of Het - Boss";
        GENERAL_SETTINGS = "General";
    }

    @ConfigItem(name="Prayer Mode Obelisk", description="What prayer mode to use for the Obelisk fight?", keyName="wardens.flick.obelisk", section="Wardens Fight - P1", position=2)
    default public n prayFlickObelisk() {
        return n.FLICK;
    }

    @ConfigItem(name="Outline broken boulders", description="Render an outline over the broken boulders to attack", keyName="apmeken.outline.boulders", section="Path of Apmeken - Ba Ba", position=8)
    default public boolean outlineBrokenBoulders() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Kephri Gear Swap", description="What gear style to swap to for Kephri?", keyName="het.gear.kephri", section="Path of Scabaras - Boss", position=2)
    default public ConfigStorageBox<EquipmentSetup> kephriGearSwap() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Final Warden (spec)", description="Auto swap spec gear versus the final warden?", keyName="wardens.swap.last.special", section="Wardens Fight - P3", position=3)
    default public ConfigStorageBox<EquipmentSetup> finalWardenSpec() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Akkha Final Special", description="What spec gear style to swap to for Akkha's last phase?", keyName="het.swap.final.spec", section="Path of Het - Boss", position=7)
    default public ConfigStorageBox<EquipmentSetup> akkhaFinalSpec() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Prayer Mode Final Warden", description="Prayer mode versus the Last Warden?", keyName="wardens.flick.second", section="Wardens Fight - P3", position=1)
    default public n prayFlickLastWarden() {
        return n.FLICK;
    }

    @ConfigItem(name="Melee prayer", description="What offensive melee prayer to use in TOA?", keyName="offensive.melee", section="General", position=9)
    default public m meleePrayer() {
        return m.PIETY;
    }

    @ConfigItem(name="Ba-Ba Style", description="What gear style to swap to for Ba-Ba", keyName="apmeken.baba.style", section="Path of Apmeken - Ba Ba", position=2)
    default public ConfigStorageBox<EquipmentSetup> babaAttackStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @Range(min=25, max=100)
    @ConfigItem(name="Spec Min Final", description="Amount of spec required for specing final Akkha phase?", keyName="het.swap.final.spec.req", section="Path of Het - Boss", position=8)
    default public int specGearAkkhaFinalReq() {
        return 0x61 ^ 1 ^ (0xBF ^ 0xC6);
    }

    @ConfigItem(name="Plate Order Overlay", description="Render indicators for the ancient button pressure plate order?", keyName="outline.plate.order", section="Path of Scabaras - Puzzle", position=1)
    default public boolean markPuzzlesMemoryOrder() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Obelisk Gear", description="Gear to swap to versus the Obelisk?", keyName="obelisk.swap", section="Wardens Fight - P1", position=1)
    default public ConfigStorageBox<EquipmentSetup> obeliskGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Ba-Ba Boulder Style", description="What gear style to swap to for Ba-Ba Boulders", keyName="apmeken.boulder.style", section="Path of Apmeken - Ba Ba", position=6)
    default public ConfigStorageBox<EquipmentSetup> babaBoulderAttackStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Show Orbs", description="Show the orbs on the screen", keyName="het.outline.orbs", section="Path of Het - Puzzle", position=2)
    default public boolean showOrbs() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Gear Skulls", description="Auto swap gear versus the skulls?", keyName="wardens.swap.skulls", section="Wardens Fight - P3", position=5)
    default public ConfigStorageBox<EquipmentSetup> skullsGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Mage Gear", description="Mage gear on attacks for the Akkha fight?", keyName="het.mage.akka", section="Path of Het - Boss", position=4)
    default public ConfigStorageBox<EquipmentSetup> mageGearAkkha() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Prayer Mode Baboons", description="What prayer mode to use for the Baboons puzzle?", keyName="apmeken.prayer.baboons", section="Path of Apmeken - Puzzle", position=1)
    default public n prayModeBaboons() {
        return n.NORMAL;
    }

    @ConfigItem(name="Melee Gear", description="Melee gear on attacks for the Akkha fight?", keyName="het.melee.akka", section="Path of Het - Boss", position=2)
    default public ConfigStorageBox<EquipmentSetup> meleeGearAkkha() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Blood barrage Thralls", description="Automatically cast blood barrage/burst when attacking thralls?", keyName="apmeken.mage.baboons.blood", section="Path of Apmeken - Puzzle", position=5)
    default public boolean autoBloodSpells() {
        return " ".length() != 0;
    }

    @Range(min=25, max=100)
    @ConfigItem(name="Spec Min Zebak", description="Amount of spec required for specing zebak?", keyName="crondis.swap.zebak.special.req", section="Path of Crondis - Zebak", position=4)
    default public int specGearZebakReq() {
        return 0xB1 ^ 0xA8;
    }

    @ConfigItem(keyName="gear.zebak", name="Gear zebak", description="The loadout to use for Zebak", section="Path of Crondis - Zebak", position=2)
    default public ConfigStorageBox<EquipmentSetup> gearSwapZebak() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Core Min Spec", description="Amount of spec required for specing core?", keyName="core.special.req", section="Wardens Fight - P2", position=6)
    @Range(min=25, max=100)
    default public int specGearCore() {
        return 0xBB ^ 0x94 ^ (0x3A ^ 0xC);
    }

    @ConfigItem(name="Akkha Section Order", description="Render indicators for what sections to stand during Akkha fight?", keyName="het.outline.section", section="Path of Het - Boss", position=44)
    default public boolean markSectionOrder() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Range Gear", description="Range gear on attacks for the Baboons puzzle?", keyName="apmeken.range.baboons", section="Path of Apmeken - Puzzle", position=3)
    default public ConfigStorageBox<EquipmentSetup> rangeGearBaboons() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Gear Akkha Shadow", description="What gear style to swap to for Akkha's shadows?", keyName="het.swap.shadows", section="Path of Het - Boss", position=5)
    default public ConfigStorageBox<EquipmentSetup> shadowAttackStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Prayer Mode Zebak", description="What prayer mode to use for Zebak fight?", keyName="crondis.prayers.zebak", section="Path of Crondis - Zebak", position=5)
    default public n prayModeZebak() {
        return n.FLICK;
    }

    @ConfigItem(keyName="barrage", name="Barrage Gear", description="Gear to swap to when casting barrage", section="General", position=12)
    default public ConfigStorageBox<EquipmentSetup> barrage() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Kephri Special Gear", description="What spec gear to swap to for Kephri?", keyName="het.gear.kephri.special", section="Path of Scabaras - Boss", position=3)
    default public ConfigStorageBox<EquipmentSetup> kephriSpecialGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Kephri Mage Scarab", description="What gear style to swap to for Scarab mager?", keyName="het.gear.scarab.mage", section="Path of Scabaras - Boss", position=5)
    default public ConfigStorageBox<EquipmentSetup> kephriMager() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Core Special Gear", description="Spec gear versus the Core?", keyName="wardens.swap.core.special", section="Wardens Fight - P2", position=5)
    default public ConfigStorageBox<EquipmentSetup> specialCore() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Gear Final Warden", description="Auto swap gear versus the Final Warden?", keyName="wardens.swap.last", section="Wardens Fight - P3", position=2)
    default public ConfigStorageBox<EquipmentSetup> finalWardenGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Ba-Ba Special Style", description="What spec to use for baba (> 50% energy)", keyName="apmeken.baba.special", section="Path of Apmeken - Ba Ba", position=3)
    default public ConfigStorageBox<EquipmentSetup> babaSpecialStyle() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(name="Mage Gear", description="Mage gear on attacks for the Baboons puzzle?", keyName="apmeken.mage.baboons", section="Path of Apmeken - Puzzle", position=4)
    default public ConfigStorageBox<EquipmentSetup> mageGearBaboons() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }
}

