/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.thieving;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squireplunder")
public interface SquirePlunderConfig
extends Config {
    @ConfigSection(name="Squire Plunder", description="Instructions.", position=1)
    public static final /* synthetic */ String SQUIRE_PLUNDER;
    @ConfigSection(name="Room One Settings", description="Settings for room one.", position=10)
    public static final /* synthetic */ String ROOM_ONE_SECTION;
    @ConfigSection(name="Room Five Settings", description="Settings for room five.", position=50)
    public static final /* synthetic */ String ROOM_FIVE_SECTION;
    @ConfigSection(name="Room Six Settings", description="Settings for room six.", position=60)
    public static final /* synthetic */ String ROOM_SIX_SECTION;
    @ConfigSection(name="Supply Settings", description="Settings for your supplies.", position=90)
    public static final /* synthetic */ String SUPPLY_SETTINGS;
    @ConfigSection(name="Room Two Settings", description="Settings for room two.", position=20)
    public static final /* synthetic */ String ROOM_TWO_SECTION;
    @ConfigSection(name="Room Three Settings", description="Settings for room three.", position=30)
    public static final /* synthetic */ String ROOM_THREE_SECTION;
    @ConfigSection(name="Room Seven Settings", description="Settings for room seven.", position=70)
    public static final /* synthetic */ String ROOM_SEVEN_SECTION;
    @ConfigSection(name="Room Four Settings", description="Settings for room four.", position=40)
    public static final /* synthetic */ String ROOM_FOUR_SECTION;
    @ConfigSection(name="Poison Settings", description="Settings for your poison.", position=100)
    public static final /* synthetic */ String POISON_SETTINGS;
    @ConfigSection(name="Room Eight Settings", description="Settings for room eight.", position=80)
    public static final /* synthetic */ String ROOM_EIGHT_SECTION;

    @ConfigItem(keyName="configOptions2", name="", description="Plunder Instructions", position=3, section="Squire Plunder")
    default public String configOptions2() {
        return "The settings are grouped by room, with each room having its own section. \nThere are eight rooms in total, and each room has settings for three types of containers: \nurns, chests, and sarcophagi. To enable opening a container in a given room, set the\ncorresponding setting to true. ";
    }

    @ConfigItem(position=52, name="Plunder Chest", keyName="chest5", description="Should we open the chest in room 5?", section="Room Five Settings")
    default public boolean plunderChestFive() {
        return false;
    }

    @ConfigItem(position=41, name="Plunder Urns", keyName="urns4", description="Should we open all Urns in room 4?", section="Room Four Settings")
    default public boolean plunderUrnsFour() {
        return false;
    }

    @ConfigItem(position=23, name="Plunder Sarcophagus", keyName="sarcophagus2", description="Should we open the Sarcophagus in room 2?", section="Room Two Settings")
    default public boolean plunderSarcophagusTwo() {
        return ((0xC7 ^ 0xAD ^ (0xA8 ^ 0x9C)) & (0x40 ^ 2 ^ (0x3A ^ 0x26) ^ -1)) != 0;
    }

    @ConfigItem(position=12, name="Plunder Chest", keyName="chest1", description="Should we open the chest in room 1?", section="Room One Settings")
    default public boolean plunderChestOne() {
        return false;
    }

    @ConfigItem(position=21, name="Plunder Urns", keyName="urns2", description="Should we open all Urns in room 2?", section="Room Two Settings")
    default public boolean plunderUrnsTwo() {
        return false;
    }

    @ConfigItem(position=22, name="Plunder Chest", keyName="chest2", description="Should we open the chest in room 2?", section="Room Two Settings")
    default public boolean plunderChestTwo() {
        return ((0xE9 ^ 0x97 ^ (0x5D ^ 0x3C)) & (0 ^ 0x5A ^ (0x78 ^ 0x3D) ^ -1)) != 0;
    }

    @ConfigItem(position=82, name="Plunder Chest", keyName="chest8", description="Should we open the chest in room 8?", section="Room Eight Settings")
    default public boolean plunderChestEight() {
        return false;
    }

    @ConfigItem(position=63, name="Plunder Sarcophagus", keyName="sarcophagus6", description="Should we open the Sarcophagus in room 6?", section="Room Six Settings")
    default public boolean plunderSarcophagusSix() {
        return false;
    }

    @ConfigItem(position=71, name="Plunder Urns", keyName="urns7", description="Should we open all Urns in room 7?", section="Room Seven Settings")
    default public boolean plunderUrnsSeven() {
        return false;
    }

    @ConfigItem(position=73, name="Plunder Sarcophagus", keyName="sarcophagus7", description="Should we open the Sarcophagus in room 7?", section="Room Seven Settings")
    default public boolean plunderSarcophagusSeven() {
        return ((0xD ^ 0x1C ^ (0xBF ^ 0x94)) & (0x9D ^ 0x81 ^ (0x20 ^ 6) ^ -1)) != 0;
    }

    @ConfigItem(position=31, name="Plunder Urns", keyName="urns3", description="Should we open all Urns in room 3?", section="Room Three Settings")
    default public boolean plunderUrnsThree() {
        return false;
    }

    static {
        ROOM_FOUR_SECTION = "Room Four Settings";
        ROOM_SIX_SECTION = "Room Six Settings";
        SUPPLY_SETTINGS = "Supply Settings";
        SQUIRE_PLUNDER = "Squire Plunder";
        ROOM_FIVE_SECTION = "Room Five Settings";
        ROOM_EIGHT_SECTION = "Room Eight Settings";
        ROOM_TWO_SECTION = "Room Two Settings";
        ROOM_SEVEN_SECTION = "Room Seven Settings";
        ROOM_ONE_SECTION = "Room One Settings";
        ROOM_THREE_SECTION = "Room Three Settings";
        POISON_SETTINGS = "Poison Settings";
    }

    @ConfigItem(position=32, name="Plunder Chest", keyName="chest3", description="Should we open the chest in room 3?", section="Room Three Settings")
    default public boolean plunderChestThree() {
        return ((0x63 ^ 0x1D ^ (0x79 ^ 0x1C)) & (0x68 ^ 0x22 ^ (0x43 ^ 0x12) ^ -1)) != 0;
    }

    @ConfigItem(position=83, name="Plunder Sarcophagus", keyName="sarcophagus8", description="Should we open the Sarcophagus in room 8?", section="Room Eight Settings")
    default public boolean plunderSarcophagusEight() {
        return false;
    }

    @ConfigItem(position=81, name="Plunder Urns", keyName="urns8", description="Should we open all Urns in room 8?", section="Room Eight Settings")
    default public boolean plunderUrnsEight() {
        return ((0x43 ^ 0x59 ^ (0x75 ^ 0x5D)) & (159 + 88 - 187 + 121 ^ 38 + 29 - -26 + 42 ^ -1)) != 0;
    }

    @ConfigItem(keyName="configOptions", name="", description="Plunder Introduction", position=2, section="Squire Plunder")
    default public String configOptions() {
        return "This configuration contains settings for each room in Squire's Plunder, allowing you to choose which containers to open in each room. ";
    }

    @ConfigItem(position=102, name="Antipoison amount: ", keyName="antiAmount", description="Amount to withdraw, set to 0 to disable curing", section="Poison Settings")
    default public int antiAmount() {
        return 3;
    }

    @ConfigItem(position=13, name="Plunder Sarcophagus", keyName="sarcophagus1", description="Should we open the Sarcophagus in room 1?", section="Room One Settings")
    default public boolean plunderSarcophagusOne() {
        return false;
    }

    @ConfigItem(position=53, name="Plunder Sarcophagus", keyName="sarcophagus5", description="Should we open the Sarcophagus in room 5?", section="Room Five Settings")
    default public boolean plunderSarcophagusFive() {
        return ((0x3F ^ 0x6E ^ (0xE ^ 0x73)) & (0x36 ^ 0x21 ^ (0x70 ^ 0x4B) ^ -1)) != 0;
    }

    @ConfigItem(position=42, name="Plunder Chest", keyName="chest4", description="Should we open the chest in room 4?", section="Room Four Settings")
    default public boolean plunderChestFour() {
        return false;
    }

    @ConfigItem(position=72, name="Plunder Chest", keyName="chest7", description="Should we open the chest in room 7?", section="Room Seven Settings")
    default public boolean plunderChestSeven() {
        return false;
    }

    @ConfigItem(position=62, name="Plunder Chest", keyName="chest6", description="Should we open the chest in room 6?", section="Room Six Settings")
    default public boolean plunderChestSix() {
        return false;
    }

    @ConfigItem(position=11, name="Plunder Urns", keyName="urns1", description="Should we open all Urns in room 1?", section="Room One Settings")
    default public boolean plunderUrnsOne() {
        return false;
    }

    @Range(max=99)
    @ConfigItem(position=92, name="Eat at HP:", keyName="eatAt", description="HP to eat at", section="Supply Settings")
    default public int eatAt() {
        return 0xC7 ^ 0xB7 ^ (0x99 ^ 0xC4);
    }

    @ConfigItem(position=101, name="Antipoison name:", keyName="antiPoison", description="Type in the name of the Antipoison you want to use (doesn't have to be exact)", section="Poison Settings")
    default public String antiPoison() {
        return "Superanti";
    }

    @ConfigItem(position=91, name="Food ID: ", keyName="foodID", description="FoodID", section="Supply Settings")
    default public int foodID() {
        return 0xFFFFFFED & 0xC5A;
    }

    @ConfigItem(position=94, name="Min food amount: ", keyName="minAmount", description="Plugin will resupply if we have less than this amount", section="Supply Settings")
    default public int minFoodAmount() {
        return 2;
    }

    @ConfigItem(position=51, name="Plunder Urns", keyName="urns5", description="Should we open all Urns in room 5?", section="Room Five Settings")
    default public boolean plunderUrnsFive() {
        return ((0x6D ^ 0x49 ^ (0x32 ^ 0x5C)) & (0xE5 ^ 0x9B ^ (0x21 ^ 0x15) ^ -1)) != 0;
    }

    @ConfigItem(position=103, name="Min antipoison amount: ", keyName="minAntiAmount", description="Plugin will resupply if we have less than this amount", section="Poison Settings")
    default public int minAntiAmount() {
        return 1;
    }

    @ConfigItem(position=43, name="Plunder Sarcophagus", keyName="sarcophagus4", description="Should we open the Sarcophagus in room 4?", section="Room Four Settings")
    default public boolean plunderSarcophagusFour() {
        return (1 & ~1) != 0;
    }

    @ConfigItem(position=61, name="Plunder Urns", keyName="urns6", description="Should we open all Urns in room 6?", section="Room Six Settings")
    default public boolean plunderUrnsSix() {
        return ((0xB2 ^ 0xBB ^ (0x8A ^ 0xAF)) & (0x7E ^ 0 ^ (0xB ^ 0x59) ^ -1)) != 0;
    }

    @ConfigItem(position=93, name="Food amount: ", keyName="foodAmount", description="Amount to withdraw, set to 0 to disable food usage", section="Supply Settings")
    default public int foodAmount() {
        return 0xB4 ^ 0x90 ^ (0x2E ^ 5);
    }

    @ConfigItem(position=33, name="Plunder Sarcophagus", keyName="sarcophagus3", description="Should we open the Sarcophagus in room 3?", section="Room Three Settings")
    default public boolean plunderSarcophagusThree() {
        return ((0x4F ^ 4 ^ (0x9A ^ 0x8C)) & (0xE4 ^ 0xBF ^ (0x30 ^ 0x36) ^ -1)) != 0;
    }
}

