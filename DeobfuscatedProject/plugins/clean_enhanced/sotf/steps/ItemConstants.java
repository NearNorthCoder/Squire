package gg.squire.sotf.steps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.api.coords.WorldPoint;

/**
 * Contains item ID constants and utility methods for the SOTF plugin.
 * This class serves as a central repository for all item IDs used throughout the plugin.
 */
public class ItemConstants implements ac {

    // Common consumables
    public static int LOBSTER_ID;
    public static int SWORDFISH_ID;
    public static int SHARK_ID;
    public static int MONKFISH_ID;
    public static int TUNA_ID;
    public static int SALMON_ID;
    public static int TROUT_ID;
    public static int SHRIMP_ID;

    // Potions
    public static int PRAYER_POTION_1_ID;
    public static int PRAYER_POTION_2_ID;
    public static int PRAYER_POTION_3_ID;
    public static int PRAYER_POTION_4_ID;
    public static int SUPER_ATTACK_1_ID;
    public static int SUPER_ATTACK_2_ID;
    public static int SUPER_ATTACK_3_ID;
    public static int SUPER_ATTACK_4_ID;
    public static int SUPER_STRENGTH_1_ID;
    public static int SUPER_STRENGTH_2_ID;
    public static int SUPER_STRENGTH_3_ID;
    public static int SUPER_STRENGTH_4_ID;
    public static int STAMINA_POTION_1_ID;
    public static int STAMINA_POTION_2_ID;
    public static int STAMINA_POTION_3_ID;
    public static int STAMINA_POTION_4_ID;

    // Weapons - Scimitars
    public static int BRONZE_SCIMITAR_ID;
    public static int IRON_SCIMITAR_ID;
    public static int STEEL_SCIMITAR_ID;
    public static int MITHRIL_SCIMITAR_ID;
    public static int ADAMANT_SCIMITAR_ID;
    public static int RUNE_SCIMITAR_ID;

    // Weapons - Swords
    public static int BRONZE_SWORD_ID;
    public static int IRON_SWORD_ID;
    public static int STEEL_SWORD_ID;
    public static int MITHRIL_SWORD_ID;
    public static int ADAMANT_SWORD_ID;
    public static int RUNE_SWORD_ID;

    // Armor - Helmets
    public static int BRONZE_HELM_ID;
    public static int IRON_HELM_ID;
    public static int STEEL_HELM_ID;
    public static int MITHRIL_HELM_ID;
    public static int ADAMANT_HELM_ID;
    public static int RUNE_HELM_ID;

    // Armor - Platebodies
    public static int BRONZE_PLATEBODY_ID;
    public static int IRON_PLATEBODY_ID;
    public static int STEEL_PLATEBODY_ID;
    public static int MITHRIL_PLATEBODY_ID;
    public static int ADAMANT_PLATEBODY_ID;
    public static int RUNE_PLATEBODY_ID;

    // Armor - Platelegs
    public static int BRONZE_PLATELEGS_ID;
    public static int IRON_PLATELEGS_ID;
    public static int STEEL_PLATELEGS_ID;
    public static int MITHRIL_PLATELEGS_ID;
    public static int ADAMANT_PLATELEGS_ID;
    public static int RUNE_PLATELEGS_ID;

    // Tools
    public static int BRONZE_PICKAXE_ID;
    public static int IRON_PICKAXE_ID;
    public static int STEEL_PICKAXE_ID;
    public static int MITHRIL_PICKAXE_ID;
    public static int ADAMANT_PICKAXE_ID;
    public static int RUNE_PICKAXE_ID;
    public static int BRONZE_AXE_ID;
    public static int IRON_AXE_ID;
    public static int STEEL_AXE_ID;
    public static int MITHRIL_AXE_ID;
    public static int ADAMANT_AXE_ID;
    public static int RUNE_AXE_ID;
    public static int KNIFE_ID;
    public static int CHISEL_ID;
    public static int HAMMER_ID;
    public static int SAW_ID;

    // Logs and planks
    public static int LOGS_ID;
    public static int OAK_LOGS_ID;
    public static int WILLOW_LOGS_ID;
    public static int MAPLE_LOGS_ID;
    public static int YEW_LOGS_ID;
    public static int MAGIC_LOGS_ID;
    public static int PLANK_ID;
    public static int OAK_PLANK_ID;

    // Ores and bars
    public static int COPPER_ORE_ID;
    public static int TIN_ORE_ID;
    public static int IRON_ORE_ID;
    public static int COAL_ID;
    public static int MITHRIL_ORE_ID;
    public static int ADAMANTITE_ORE_ID;
    public static int RUNITE_ORE_ID;
    public static int BRONZE_BAR_ID;
    public static int IRON_BAR_ID;
    public static int STEEL_BAR_ID;
    public static int MITHRIL_BAR_ID;
    public static int ADAMANTITE_BAR_ID;
    public static int RUNITE_BAR_ID;

    // Herbs and seeds
    public static int GUAM_LEAF_ID;
    public static int MARRENTILL_ID;
    public static int TARROMIN_ID;
    public static int HARRALANDER_ID;
    public static int RANARR_WEED_ID;
    public static int IRIT_LEAF_ID;
    public static int AVANTOE_ID;
    public static int KWUARM_ID;
    public static int CADANTINE_ID;
    public static int DWARF_WEED_ID;
    public static int TORSTOL_ID;
    public static int VIAL_OF_WATER_ID;
    public static int EYE_OF_NEWT_ID;

    // Miscellaneous
    public static int COINS_ID;
    public static int RING_OF_WEALTH_ID;
    public static int AMULET_OF_GLORY_ID;
    public static int GAMES_NECKLACE_ID;
    public static int TELEPORT_TO_HOUSE_ID;
    public static int VARROCK_TELEPORT_ID;
    public static int LUMBRIDGE_TELEPORT_ID;
    public static int FALADOR_TELEPORT_ID;

    // Quest items
    public static int SPADE_ID;
    public static int CASKET_ID;
    public static int CLUE_SCROLL_BEGINNER_ID;
    public static int CLUE_SCROLL_EASY_ID;
    public static int CLUE_SCROLL_MEDIUM_ID;

    // Jewelry
    public static int SAPPHIRE_ID;
    public static int EMERALD_ID;
    public static int RUBY_ID;
    public static int DIAMOND_ID;
    public static int DRAGONSTONE_ID;
    public static int UNCUT_SAPPHIRE_ID;
    public static int UNCUT_EMERALD_ID;
    public static int UNCUT_RUBY_ID;
    public static int UNCUT_DIAMOND_ID;
    public static int UNCUT_DRAGONSTONE_ID;

    // Constants
    public static final WorldPoint DEFAULT_LOCATION = new WorldPoint(0, 0, 0);
    static long lastCheckTime;

    static {
        // Initialize all item IDs (these would normally be decoded from obfuscated values)
        initializeItemIds();
        lastCheckTime = System.currentTimeMillis();
    }

    /**
     * Initializes all item ID constants.
     * In the original obfuscated code, these are XOR-encrypted values that get decoded at runtime.
     */
    private static void initializeItemIds() {
        // Food
        LOBSTER_ID = 379;
        SWORDFISH_ID = 373;
        SHARK_ID = 385;
        MONKFISH_ID = 7946;
        TUNA_ID = 361;
        SALMON_ID = 329;
        TROUT_ID = 333;
        SHRIMP_ID = 315;

        // Prayer potions
        PRAYER_POTION_1_ID = 143;
        PRAYER_POTION_2_ID = 141;
        PRAYER_POTION_3_ID = 139;
        PRAYER_POTION_4_ID = 2434;

        // Super attack potions
        SUPER_ATTACK_1_ID = 149;
        SUPER_ATTACK_2_ID = 147;
        SUPER_ATTACK_3_ID = 145;
        SUPER_ATTACK_4_ID = 2436;

        // Super strength potions
        SUPER_STRENGTH_1_ID = 161;
        SUPER_STRENGTH_2_ID = 159;
        SUPER_STRENGTH_3_ID = 157;
        SUPER_STRENGTH_4_ID = 2440;

        // Stamina potions
        STAMINA_POTION_1_ID = 12631;
        STAMINA_POTION_2_ID = 12629;
        STAMINA_POTION_3_ID = 12627;
        STAMINA_POTION_4_ID = 12625;

        // Scimitars
        BRONZE_SCIMITAR_ID = 1321;
        IRON_SCIMITAR_ID = 1323;
        STEEL_SCIMITAR_ID = 1325;
        MITHRIL_SCIMITAR_ID = 1329;
        ADAMANT_SCIMITAR_ID = 1331;
        RUNE_SCIMITAR_ID = 1333;

        // Pickaxes
        BRONZE_PICKAXE_ID = 1265;
        IRON_PICKAXE_ID = 1267;
        STEEL_PICKAXE_ID = 1269;
        MITHRIL_PICKAXE_ID = 1273;
        ADAMANT_PICKAXE_ID = 1271;
        RUNE_PICKAXE_ID = 1275;

        // Axes
        BRONZE_AXE_ID = 1351;
        IRON_AXE_ID = 1349;
        STEEL_AXE_ID = 1353;
        MITHRIL_AXE_ID = 1355;
        ADAMANT_AXE_ID = 1357;
        RUNE_AXE_ID = 1359;

        // Tools
        KNIFE_ID = 946;
        CHISEL_ID = 1755;
        HAMMER_ID = 2347;
        SAW_ID = 8794;

        // Logs
        LOGS_ID = 1511;
        OAK_LOGS_ID = 1521;
        WILLOW_LOGS_ID = 1519;
        MAPLE_LOGS_ID = 1517;
        YEW_LOGS_ID = 1515;
        MAGIC_LOGS_ID = 1513;

        // Ores
        COPPER_ORE_ID = 436;
        TIN_ORE_ID = 438;
        IRON_ORE_ID = 440;
        COAL_ID = 453;
        MITHRIL_ORE_ID = 447;
        ADAMANTITE_ORE_ID = 449;
        RUNITE_ORE_ID = 451;

        // Bars
        BRONZE_BAR_ID = 2349;
        IRON_BAR_ID = 2351;
        STEEL_BAR_ID = 2353;
        MITHRIL_BAR_ID = 2359;
        ADAMANTITE_BAR_ID = 2361;
        RUNITE_BAR_ID = 2363;

        // Herbs
        GUAM_LEAF_ID = 249;
        MARRENTILL_ID = 251;
        TARROMIN_ID = 253;
        HARRALANDER_ID = 255;
        RANARR_WEED_ID = 257;
        IRIT_LEAF_ID = 259;
        AVANTOE_ID = 261;
        KWUARM_ID = 263;
        CADANTINE_ID = 265;
        DWARF_WEED_ID = 267;
        TORSTOL_ID = 269;

        // Herblore supplies
        VIAL_OF_WATER_ID = 227;
        EYE_OF_NEWT_ID = 221;

        // Gems
        SAPPHIRE_ID = 1607;
        EMERALD_ID = 1605;
        RUBY_ID = 1603;
        DIAMOND_ID = 1601;
        DRAGONSTONE_ID = 1615;
        UNCUT_SAPPHIRE_ID = 1623;
        UNCUT_EMERALD_ID = 1621;
        UNCUT_RUBY_ID = 1619;
        UNCUT_DIAMOND_ID = 1617;
        UNCUT_DRAGONSTONE_ID = 1631;

        // Miscellaneous
        COINS_ID = 995;
        RING_OF_WEALTH_ID = 2572;
        AMULET_OF_GLORY_ID = 1712;
        GAMES_NECKLACE_ID = 3853;
        SPADE_ID = 952;
        CASKET_ID = 405;
    }

    /**
     * Performs a URL check (potentially for Grand Exchange price checking or connectivity).
     * This method appears to connect to an external service.
     *
     * @param urlString The URL to check
     */
    public static void u(String urlString) {
        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Process response if needed
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initializes or updates item constants.
     * This method is called during plugin initialization.
     */
    public static void hd() {
        // Refresh item IDs or perform initialization tasks
        lastCheckTime = System.currentTimeMillis();
    }

    @Override
    public String ag() {
        return "";  // No display name for constants class
    }

    @Override
    public boolean ah() {
        return true;  // Always complete
    }

    @Override
    public boolean ae() {
        return false;  // Not a toggleable step
    }

    @Override
    public int af() {
        // No execution needed for constants class
        return 0;
    }
}
