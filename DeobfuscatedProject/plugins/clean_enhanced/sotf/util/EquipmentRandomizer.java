package gg.squire.sotf.util;

import gg.squire.account.AccBuilderSotf;
import gg.squire.sotf.util.PurchaseRequest;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

import java.util.*;

/**
 * Manages randomized equipment selections for anti-pattern training.
 *
 * <p>This class randomly selects equipment from available options based on player stats,
 * providing variety in equipment choices to reduce detection patterns.
 */
public class EquipmentRandomizer {

    /** Flag indicating if randomization is enabled */
    public static boolean randomizationEnabled = false;

    /** List of equipment purchase requests */
    public static List<PurchaseRequest> equipmentPurchaseList = new ArrayList<>();

    // Equipment slot maps
    private static Map<Integer, Integer> helmets = new HashMap<>();
    private static Map<Integer, Integer> amulets = new HashMap<>();
    private static Map<Integer, Integer> capes = new HashMap<>();
    private static Map<Integer, Integer> chestpieces = new HashMap<>();
    private static Map<Integer, Integer> legwear = new HashMap<>();
    private static Map<Integer, Integer> weapons = new HashMap<>();
    private static Map<Integer, Integer> shields = new HashMap<>();
    private static Map<Integer, Integer> boots = new HashMap<>();
    private static Map<Integer, Integer> gloves = new HashMap<>();
    private static Map<Integer, Integer> rings = new HashMap<>();
    private static Map<Integer, Integer> ammunition = new HashMap<>();

    private static final Random random = new Random();

    // Training mode constants
    private static final String MODE_F2P_MELEE = "f2pmelee";
    private static final String MODE_F2P_QUEST = "f2pquest";
    private static final String MODE_F2P_MAGE = "f2pmage";
    private static final String MODE_MAGE = "mage";
    private static final String MODE_QUEST = "quest";
    private static final String MODE_QUEST_NO_WEP = "questNoWep";
    private static final String MODE_MELEE = "melee";
    private static final String MODE_AGILITY = "agility";
    private static final String MODE_MELEE_NMZ = "meleeNmz";
    private static final String MODE_RANGE_NMZ = "rangeNmz";
    private static final String MODE_WEALTH = "wealth";

    /**
     * Initializes equipment pools based on player's current stats.
     *
     * @param trainingMode The current training mode
     */
    public static void initializeEquipmentPools(String trainingMode) {
        // Clear existing pools
        clearEquipmentPools();

        int defenceLevel = Skills.getLevel(Skill.DEFENCE);

        // Initialize pools based on training mode
        if (MODE_F2P_MELEE.equals(trainingMode)) {
            initializeF2PMeleePools(defenceLevel);
        } else if (MODE_MAGE.equals(trainingMode)) {
            initializeMagePools(defenceLevel);
        } else if (MODE_MELEE.equals(trainingMode)) {
            initializeMeleePools(defenceLevel);
        } else if (MODE_QUEST.equals(trainingMode)) {
            initializeQuestPools();
        } else if (MODE_WEALTH.equals(trainingMode)) {
            initializeWealthPools();
        }
    }

    /**
     * Initializes F2P melee equipment pools.
     *
     * @param defenceLevel Player's defence level
     */
    private static void initializeF2PMeleePools(int defenceLevel) {
        // Add basic gear available at various defence levels
        if (defenceLevel < 5) {
            helmets.put(1139, 1); // Leather cowl
            chestpieces.put(1117, 1); // Leather body
            legwear.put(1095, 1); // Leather chaps
        }

        if (defenceLevel >= 5 && defenceLevel < 10) {
            helmets.put(1153, 1); // Hardleather helm
            chestpieces.put(1129, 1); // Hardleather body
        }

        if (defenceLevel >= 10 && defenceLevel < 20) {
            helmets.put(1109, 1); // Bronze full helm
            chestpieces.put(1117, 1); // Bronze platebody
        }

        // Common items
        capes.put(1019, 1); // Black cape
        boots.put(1061, 1); // Leather boots
        gloves.put(1059, 1); // Leather gloves
    }

    /**
     * Initializes magic training equipment pools.
     *
     * @param defenceLevel Player's defence level
     */
    private static void initializeMagePools(int defenceLevel) {
        // Wizard robes and magic gear
        helmets.put(579, 1); // Wizard hat
        chestpieces.put(577, 1); // Wizard robe top
        legwear.put(1007, 1); // Wizard robe skirt

        // Magic weapons
        weapons.put(1379, 1); // Staff of air
        weapons.put(1381, 1); // Staff of water
        weapons.put(1383, 1); // Staff of earth
        weapons.put(1385, 1); // Staff of fire

        amulets.put(1478, 1); // Amulet of magic
        boots.put(6920, 1); // Infinity boots (if high level)
    }

    /**
     * Initializes P2P melee equipment pools.
     *
     * @param defenceLevel Player's defence level
     */
    private static void initializeMeleePools(int defenceLevel) {
        // Add member's equipment based on defence level
        if (defenceLevel >= 20 && defenceLevel < 30) {
            helmets.put(1137, 1); // Steel full helm
            chestpieces.put(1119, 1); // Steel platebody
        }

        if (defenceLevel >= 30 && defenceLevel < 40) {
            helmets.put(1147, 1); // Mithril full helm
            chestpieces.put(1121, 1); // Mithril platebody
        }

        if (defenceLevel >= 40) {
            helmets.put(1163, 1); // Adamant full helm
            chestpieces.put(1123, 1); // Adamant platebody
        }

        // Common melee accessories
        amulets.put(1731, 1); // Amulet of power
        capes.put(1019, 1); // Black cape
        boots.put(88, 1); // Leather boots
    }

    /**
     * Initializes quest/skilling gear pools.
     */
    private static void initializeQuestPools() {
        // Graceful or other skilling outfits
        helmets.put(11850, 1); // Graceful hood
        chestpieces.put(11852, 1); // Graceful top
        legwear.put(11854, 1); // Graceful legs
        boots.put(11860, 1); // Graceful boots
        gloves.put(11858, 1); // Graceful gloves
        capes.put(11856, 1); // Graceful cape
    }

    /**
     * Initializes wealth/teleport gear.
     */
    private static void initializeWealthPools() {
        rings.put(11980, 1); // Ring of wealth
        rings.put(11982, 1); // Ring of wealth (1)
        rings.put(11984, 1); // Ring of wealth (2)
        rings.put(11986, 1); // Ring of wealth (3)
        rings.put(11988, 1); // Ring of wealth (4)
        rings.put(2572, 1); // Ring of wealth (5)
    }

    /**
     * Clears all equipment pools.
     */
    public static void clearEquipmentPools() {
        helmets.clear();
        amulets.clear();
        capes.clear();
        chestpieces.clear();
        legwear.clear();
        weapons.clear();
        shields.clear();
        boots.clear();
        gloves.clear();
        rings.clear();
        ammunition.clear();
        System.out.println("Random gear lists CLEARED");
    }

    /**
     * Gets a random item ID from a given equipment map.
     *
     * @param equipmentMap The map of equipment to choose from
     * @return A random item ID, or 0 if the map is empty
     */
    private static int getRandomItem(Map<Integer, Integer> equipmentMap) {
        if (equipmentMap.isEmpty()) {
            return 0;
        }

        int randomIndex = random.nextInt(equipmentMap.size());
        int currentIndex = 0;

        for (Integer itemId : equipmentMap.keySet()) {
            if (currentIndex == randomIndex) {
                return itemId;
            }
            currentIndex++;
        }

        throw new IllegalStateException("Unexpected error occurred while getting a random key.");
    }

    /**
     * Checks if player has all required random equipment.
     *
     * @param itemId The specific item to check (or -1 for general check)
     * @return true if player has the required equipment
     */
    public static boolean hasRequiredEquipment(int itemId) {
        // Simplified check - verify key slots are filled
        if (itemId == -1) {
            // General check - ensure basic slots
            return Equipment.getAll().size() >= 3;
        } else {
            // Specific item check
            return Equipment.contains(itemId) || Inventory.contains(itemId);
        }
    }
}
