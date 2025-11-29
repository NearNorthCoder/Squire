package gg.squire.thieving;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squireplunder")
/* loaded from: squire-plunder-0.1.0.jar:gg/squire/thieving/SquirePlunderConfig.class */
public interface SquirePlunderConfig extends Config {
    @ConfigSection(name = "Room Four Settings", description = "Settings for room four.", position = 40)
    public static final /* synthetic */ String ROOM_FOUR_SECTION = "Room Four Settings";
    @ConfigSection(name = "Room Six Settings", description = "Settings for room six.", position = 60)
    public static final /* synthetic */ String ROOM_SIX_SECTION = "Room Six Settings";
    @ConfigSection(name = "Supply Settings", description = "Settings for your supplies.", position = 90)
    public static final /* synthetic */ String SUPPLY_SETTINGS = "Supply Settings";
    @ConfigSection(name = "Squire Plunder", description = "Instructions.", position = 1)
    public static final /* synthetic */ String SQUIRE_PLUNDER = "Squire Plunder";
    @ConfigSection(name = "Room Five Settings", description = "Settings for room five.", position = 50)
    public static final /* synthetic */ String ROOM_FIVE_SECTION = "Room Five Settings";
    @ConfigSection(name = "Room Eight Settings", description = "Settings for room eight.", position = 80)
    public static final /* synthetic */ String ROOM_EIGHT_SECTION = "Room Eight Settings";
    @ConfigSection(name = "Room Two Settings", description = "Settings for room two.", position = 20)
    public static final /* synthetic */ String ROOM_TWO_SECTION = "Room Two Settings";
    @ConfigSection(name = "Room Seven Settings", description = "Settings for room seven.", position = 70)
    public static final /* synthetic */ String ROOM_SEVEN_SECTION = "Room Seven Settings";
    @ConfigSection(name = "Room One Settings", description = "Settings for room one.", position = 10)
    public static final /* synthetic */ String ROOM_ONE_SECTION = "Room One Settings";
    @ConfigSection(name = "Room Three Settings", description = "Settings for room three.", position = 30)
    public static final /* synthetic */ String ROOM_THREE_SECTION = "Room Three Settings";
    @ConfigSection(name = "Poison Settings", description = "Settings for your poison.", position = 100)
    public static final /* synthetic */ String POISON_SETTINGS = "Poison Settings";

    @ConfigItem(keyName = "configOptions2", name = "", description = "Plunder Instructions", position = 3, section = "Squire Plunder")
    default String configOptions2() {
        return "The settings are grouped by room, with each room having its own section. \nThere are eight rooms in total, and each room has settings for three types of containers: \nurns, chests, and sarcophagi. To enable opening a container in a given room, set the\ncorresponding setting to true. ";
    }

    @ConfigItem(position = 52, name = "Plunder Chest", keyName = "chest5", description = "Should we open the chest in room 5?", section = "Room Five Settings")
    default boolean plunderChestFive() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 41, name = "Plunder Urns", keyName = "urns4", description = "Should we open all Urns in room 4?", section = "Room Four Settings")
    default boolean plunderUrnsFour() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 23, name = "Plunder Sarcophagus", keyName = "sarcophagus2", description = "Should we open the Sarcophagus in room 2?", section = "Room Two Settings")
    default boolean plunderSarcophagusTwo() {
        return ((199 ^ 173) ^ (168 ^ 156)) & (((64 ^ 2) ^ (58 ^ 38)) ^ (-" ".length()));
    }

    @ConfigItem(position = 12, name = "Plunder Chest", keyName = "chest1", description = "Should we open the chest in room 1?", section = "Room One Settings")
    default boolean plunderChestOne() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 21, name = "Plunder Urns", keyName = "urns2", description = "Should we open all Urns in room 2?", section = "Room Two Settings")
    default boolean plunderUrnsTwo() {
        return ((((177 + 104) - 181) + 126) ^ (((143 + 5) - (-13)) + 13)) & (((((125 + 222) - 189) + 87) ^ (((114 + 124) - 230) + 177)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 22, name = "Plunder Chest", keyName = "chest2", description = "Should we open the chest in room 2?", section = "Room Two Settings")
    default boolean plunderChestTwo() {
        return ((233 ^ 151) ^ (93 ^ 60)) & (((0 ^ 90) ^ (120 ^ 61)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 82, name = "Plunder Chest", keyName = "chest8", description = "Should we open the chest in room 8?", section = "Room Eight Settings")
    default boolean plunderChestEight() {
        return ((((42 + 86) - 85) + 202) ^ (((113 + 61) - 41) + 15)) & (((((0 + 187) - 56) + 90) ^ (((143 + 151) - 211) + 105)) ^ (-" ".length()));
    }

    @ConfigItem(position = 63, name = "Plunder Sarcophagus", keyName = "sarcophagus6", description = "Should we open the Sarcophagus in room 6?", section = "Room Six Settings")
    default boolean plunderSarcophagusSix() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 71, name = "Plunder Urns", keyName = "urns7", description = "Should we open all Urns in room 7?", section = "Room Seven Settings")
    default boolean plunderUrnsSeven() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 73, name = "Plunder Sarcophagus", keyName = "sarcophagus7", description = "Should we open the Sarcophagus in room 7?", section = "Room Seven Settings")
    default boolean plunderSarcophagusSeven() {
        return ((13 ^ 28) ^ (191 ^ 148)) & (((157 ^ 129) ^ (32 ^ 6)) ^ (-" ".length()));
    }

    @ConfigItem(position = 31, name = "Plunder Urns", keyName = "urns3", description = "Should we open all Urns in room 3?", section = "Room Three Settings")
    default boolean plunderUrnsThree() {
        return true & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 32, name = "Plunder Chest", keyName = "chest3", description = "Should we open the chest in room 3?", section = "Room Three Settings")
    default boolean plunderChestThree() {
        return ((99 ^ 29) ^ (121 ^ 28)) & (((104 ^ 34) ^ (67 ^ 18)) ^ (-" ".length()));
    }

    @ConfigItem(position = 83, name = "Plunder Sarcophagus", keyName = "sarcophagus8", description = "Should we open the Sarcophagus in room 8?", section = "Room Eight Settings")
    default boolean plunderSarcophagusEight() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 81, name = "Plunder Urns", keyName = "urns8", description = "Should we open all Urns in room 8?", section = "Room Eight Settings")
    default boolean plunderUrnsEight() {
        return ((67 ^ 89) ^ (117 ^ 93)) & (((((159 + 88) - 187) + 121) ^ (((38 + 29) - (-26)) + 42)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "configOptions", name = "", description = "Plunder Introduction", position = 2, section = "Squire Plunder")
    default String configOptions() {
        return "This configuration contains settings for each room in Squire's Plunder, allowing you to choose which containers to open in each room. ";
    }

    @ConfigItem(position = 102, name = "Antipoison amount: ", keyName = "antiAmount", description = "Amount to withdraw, set to 0 to disable curing", section = "Poison Settings")
    default int antiAmount() {
        return "   ".length();
    }

    @ConfigItem(position = 13, name = "Plunder Sarcophagus", keyName = "sarcophagus1", description = "Should we open the Sarcophagus in room 1?", section = "Room One Settings")
    default boolean plunderSarcophagusOne() {
        return (false ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 53, name = "Plunder Sarcophagus", keyName = "sarcophagus5", description = "Should we open the Sarcophagus in room 5?", section = "Room Five Settings")
    default boolean plunderSarcophagusFive() {
        return ((63 ^ 110) ^ (14 ^ 115)) & (((54 ^ 33) ^ (112 ^ 75)) ^ (-" ".length()));
    }

    @ConfigItem(position = 42, name = "Plunder Chest", keyName = "chest4", description = "Should we open the chest in room 4?", section = "Room Four Settings")
    default boolean plunderChestFour() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 72, name = "Plunder Chest", keyName = "chest7", description = "Should we open the chest in room 7?", section = "Room Seven Settings")
    default boolean plunderChestSeven() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 62, name = "Plunder Chest", keyName = "chest6", description = "Should we open the chest in room 6?", section = "Room Six Settings")
    default boolean plunderChestSix() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 11, name = "Plunder Urns", keyName = "urns1", description = "Should we open all Urns in room 1?", section = "Room One Settings")
    default boolean plunderUrnsOne() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 92, name = "Eat at HP:", keyName = "eatAt", description = "HP to eat at", section = "Supply Settings")
    @Range(max = 99)
    default int eatAt() {
        return (199 ^ 183) ^ (153 ^ 196);
    }

    @ConfigItem(position = 101, name = "Antipoison name:", keyName = "antiPoison", description = "Type in the name of the Antipoison you want to use (doesn't have to be exact)", section = "Poison Settings")
    default String antiPoison() {
        return "Superanti";
    }

    @ConfigItem(position = 91, name = "Food ID: ", keyName = "foodID", description = "FoodID", section = "Supply Settings")
    default int foodID() {
        return (-19) & 3162;
    }

    @ConfigItem(position = 94, name = "Min food amount: ", keyName = "minAmount", description = "Plugin will resupply if we have less than this amount", section = "Supply Settings")
    default int minFoodAmount() {
        return "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 51, name = "Plunder Urns", keyName = "urns5", description = "Should we open all Urns in room 5?", section = "Room Five Settings")
    default boolean plunderUrnsFive() {
        return ((109 ^ 73) ^ (50 ^ 92)) & (((229 ^ 155) ^ (33 ^ 21)) ^ (-" ".length()));
    }

    @ConfigItem(position = 103, name = "Min antipoison amount: ", keyName = "minAntiAmount", description = "Plugin will resupply if we have less than this amount", section = "Poison Settings")
    default int minAntiAmount() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 43, name = "Plunder Sarcophagus", keyName = "sarcophagus4", description = "Should we open the Sarcophagus in room 4?", section = "Room Four Settings")
    default boolean plunderSarcophagusFour() {
        return " ".length() & (" ".length() ^ (-1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 61, name = "Plunder Urns", keyName = "urns6", description = "Should we open all Urns in room 6?", section = "Room Six Settings")
    default boolean plunderUrnsSix() {
        return ((178 ^ 187) ^ (138 ^ 175)) & (((126 ^ 0) ^ (11 ^ 89)) ^ (-" ".length()));
    }

    @ConfigItem(position = 93, name = "Food amount: ", keyName = "foodAmount", description = "Amount to withdraw, set to 0 to disable food usage", section = "Supply Settings")
    default int foodAmount() {
        return (180 ^ 144) ^ (46 ^ 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 33, name = "Plunder Sarcophagus", keyName = "sarcophagus3", description = "Should we open the Sarcophagus in room 3?", section = "Room Three Settings")
    default boolean plunderSarcophagusThree() {
        return ((79 ^ 4) ^ (154 ^ 140)) & (((228 ^ 191) ^ (48 ^ 54)) ^ (-" ".length()));
    }
}
