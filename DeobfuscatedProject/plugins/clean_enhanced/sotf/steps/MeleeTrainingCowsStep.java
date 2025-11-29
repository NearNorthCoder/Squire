package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Melee training step for SOTF (Sins of the Father) account builder.
 * Trains melee combat skills (Attack, Strength, Defence) by killing cows.
 *
 * This step handles:
 * - Progressive weapon upgrades (Bronze → Iron → Steel → Mithril → Adamant → Rune scimitars)
 * - Armor equipping (leather and metal armor pieces)
 * - Food consumption (lobsters)
 * - Combat style management for balanced skill training
 * - Banking for supplies
 * - Auto-retaliate toggling
 *
 * Trains from low levels up to 40 Strength, then transitions to next step.
 */
public class MeleeTrainingCowsStep implements SotfStep {

    // Item IDs - Weapons
    private static final int BRONZE_SCIMITAR = 1321;
    private static final int IRON_SCIMITAR = 1323;
    private static final int STEEL_SCIMITAR = 1325;
    private static final int MITHRIL_SCIMITAR = 1329;
    private static final int ADAMANT_SCIMITAR = 1331;
    private static final int RUNE_SCIMITAR = 1333;

    // Item IDs - Armor
    private static final int LEATHER_BODY = 1129;
    private static final int LEATHER_CHAPS = 1095;
    private static final int LEATHER_VAMBRACES = 1063;
    private static final int LEATHER_BOOTS = 1061;
    private static final int IRON_FULL_HELM = 1153;
    private static final int STEEL_FULL_HELM = 1157;

    // Item IDs - Food
    private static final int LOBSTER = 379;

    // Item IDs - Supplies
    private static final int COINS = 995;

    // Combat areas and locations
    public static WorldArea COW_AREA_1;
    public static WorldArea COW_AREA_2;
    public static WorldArea COW_AREA_3;
    public static WorldPoint SAFE_SPOT_1;
    public static WorldPoint SAFE_SPOT_2;
    public static WorldPoint SAFE_SPOT_3;

    // Required equipment by slot
    public static int[] REQUIRED_EQUIPMENT;

    // Shopping list for items to buy
    public static List<ShopItem> itemsToBuy;

    // Flag to track if we need to buy items
    public static boolean needsToBuyItems;

    // Skill level thresholds
    private static final int IRON_WEAPON_LEVEL = 5;
    private static final int STEEL_WEAPON_LEVEL = 10;
    private static final int MITHRIL_WEAPON_LEVEL = 20;
    private static final int ADAMANT_WEAPON_LEVEL = 30;
    private static final int RUNE_WEAPON_LEVEL = 40;
    private static final int DEFENSE_ARMOR_LEVEL = 14;
    private static final int STRENGTH_TARGET_LEVEL = 40;
    private static final int ATTACK_TARGET_LEVEL = 30;
    private static final int COMBAT_BALANCE_LEVEL = 10;

    // Interface constants
    private static final int AUTO_RETALIATE_VARBIT = 172;
    private static final int AUTO_RETALIATE_WIDGET_ID = 593;
    private static final int AUTO_RETALIATE_CHILD_ID = 29;
    private static final int COMBAT_OPTIONS_WIDGET_ID = 10485790;

    // Timing constants
    private static final int BANK_OPEN_TIMEOUT = 5000;
    private static final int RUN_ENERGY_THRESHOLD = 30;
    private static final int FOOD_QUANTITY = 100;
    private static final int COINS_QUANTITY = 500;

    // Health threshold for eating (45% HP)
    private static final double EAT_HEALTH_PERCENT = 45.0;

    static {
        initializeConstants();
        initializeStrings();

        itemsToBuy = new ArrayList<>();

        // Equipment setup: weapon, armor pieces
        REQUIRED_EQUIPMENT = new int[]{
            ADAMANT_SCIMITAR,
            RUNE_SCIMITAR,
            LEATHER_BODY,
            LEATHER_CHAPS,
            LEATHER_VAMBRACES,
            LEATHER_BOOTS,
            IRON_FULL_HELM,
            STEEL_FULL_HELM
        };

        // Define cow training areas (Lumbridge cow field)
        COW_AREA_1 = new WorldArea(3234, 3254, 11, 11, 0);
        COW_AREA_2 = new WorldArea(3238, 3264, 13, 16, 0);
        COW_AREA_3 = new WorldArea(3244, 3274, 32, 14, 0);

        // Safe spots for navigation
        SAFE_SPOT_1 = new WorldPoint(3248, 3264, 0);
        SAFE_SPOT_2 = new WorldPoint(3254, 3254, 0);
        SAFE_SPOT_3 = new WorldPoint(3256, 3272, 0);
    }

    /**
     * Returns the step name/description for UI display.
     * @return "40 Str" indicating the goal of this step
     */
    @Override
    public String getName() {
        return "40 Str";
    }

    /**
     * Checks if this step is complete.
     * Complete when Strength level reaches 40 or higher.
     *
     * @return true if Strength >= 40, false otherwise
     */
    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.STRENGTH) >= STRENGTH_TARGET_LEVEL;
    }

    /**
     * Checks if this step should be executed.
     * Returns false (step always runs when not complete).
     *
     * @return false
     */
    @Override
    public boolean shouldExecute() {
        return false;
    }

    /**
     * Main execution method for the melee training step.
     * Handles the full combat training loop including:
     * - Item purchasing
     * - Banking for supplies
     * - Equipment management
     * - Combat style selection
     * - NPC targeting and combat
     * - Food consumption
     *
     * @return 0 (no delay)
     */
    @Override
    public int execute() {
        try {
            runMainLoop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Main training loop that coordinates all activities.
     */
    private static void runMainLoop() {
        // Handle item purchasing if needed
        if (needsToBuyItems) {
            AccBuilderSotf.c = "Buying items";
            ShopHandler.buyItems(itemsToBuy);

            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to melee training");
                needsToBuyItems = false;
            }
        }

        if (!needsToBuyItems) {
            // Check if we need to bank for supplies
            if (!hasRequiredSupplies() &&
                (!Skills.getLevel(Skill.DEFENCE) >= DEFENSE_ARMOR_LEVEL ||
                 !Skills.getLevel(Skill.ATTACK) >= ATTACK_TARGET_LEVEL ||
                 Skills.getLevel(Skill.STRENGTH) < ATTACK_TARGET_LEVEL)) {

                handleBanking();
            }

            // If we have supplies, train combat
            if (hasRequiredSupplies()) {
                trainCombat();
            }
        }
    }

    /**
     * Handles banking operations to withdraw supplies.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();

        if (nearestBank == null) {
            return;
        }

        // Walk to bank if not there
        if (!nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Navigating to bank";
            NavigationHandler.walkToBank(nearestBank);
            return;
        }

        // We're at the bank
        AccBuilderSotf.c = "Handling banking";

        // Open bank if closed
        if (!Bank.isOpen()) {
            BankHandler.openBank();
            Time.sleepUntil(() -> Bank.isOpen(), BANK_OPEN_TIMEOUT);
            return;
        }

        // Bank is open
        if (Bank.isOpen()) {
            // Deposit everything first
            if (Inventory.getAll().size() > 0) {
                Bank.depositInventory();
                Time.sleepTicks(1);
            }

            if (Equipment.getAll().size() > 0) {
                Bank.depositEquipment();
                Time.sleepTicks(2);
            }

            // Check if we're missing required items
            if (!hasBankSupplies()) {
                buildShoppingList();
                System.out.println("We are missing supplies, switching to BUYING");
                needsToBuyItems = true;
                return;
            }

            // Withdraw supplies
            withdrawBankSupplies();
        }
    }

    /**
     * Main combat training method.
     * Handles equipment, combat styles, and attacking NPCs.
     */
    private static void trainCombat() {
        // Manage equipment upgrades
        equipBestGear();

        // Manage run energy
        if (Movement.getRunEnergy() >= RUN_ENERGY_THRESHOLD && !Movement.isRunEnabled()) {
            Movement.toggleRun();
        }

        // Check if we have proper equipment on
        if (!isProperlyEquipped()) {
            equipGearFromInventory();
        }

        // Eat food if health is low
        if (HealthCalculator.getHealthPercent() < EAT_HEALTH_PERCENT) {
            if (Inventory.contains(LOBSTER)) {
                Inventory.getFirst(LOBSTER).interact("Eat");
                Time.sleepTicks(1);
            }
        }

        // Check if we should progress to next area/training method
        if (Skills.getLevel(Skill.ATTACK) >= STEEL_WEAPON_LEVEL &&
            Skills.getLevel(Skill.STRENGTH) >= STEEL_WEAPON_LEVEL) {
            SandCrabsHandler.train();
        }
    }

    /**
     * Checks if player has all required supplies in inventory/equipment.
     * Validates weapons, armor, and food based on level requirements.
     *
     * @return true if has all required items, false otherwise
     */
    private static boolean hasRequiredSupplies() {
        // High level (40+ Attack) - need Rune scimitar
        if (Skills.getLevel(Skill.ATTACK) >= RUNE_WEAPON_LEVEL) {
            if (!Equipment.contains(RUNE_SCIMITAR) ||
                !Inventory.contains(RUNE_SCIMITAR) ||
                !Bank.contains(RUNE_SCIMITAR)) {
                return false;
            }
        }

        // 30-39 Attack - need Adamant or better
        if (Skills.getLevel(Skill.ATTACK) >= ADAMANT_WEAPON_LEVEL &&
            Skills.getLevel(Skill.ATTACK) < RUNE_WEAPON_LEVEL) {

            boolean hasAdamant = Equipment.contains(ADAMANT_SCIMITAR) ||
                                Inventory.contains(ADAMANT_SCIMITAR) ||
                                Bank.contains(ADAMANT_SCIMITAR);

            boolean hasRune = Equipment.contains(RUNE_SCIMITAR) ||
                             Inventory.contains(RUNE_SCIMITAR) ||
                             Bank.contains(RUNE_SCIMITAR);

            if (!hasAdamant && !hasRune) {
                return false;
            }
        }

        // Check armor pieces
        if (!hasArmorPiece(LEATHER_BODY)) return false;
        if (!hasArmorPiece(LEATHER_CHAPS)) return false;
        if (!hasArmorPiece(LEATHER_VAMBRACES)) return false;
        if (!hasArmorPiece(LEATHER_BOOTS)) return false;
        if (!hasArmorPiece(IRON_FULL_HELM)) return false;
        if (!hasArmorPiece(STEEL_FULL_HELM)) return false;

        // Check food
        if (!Inventory.contains(LOBSTER) && !Bank.contains(LOBSTER)) {
            return false;
        }

        return true;
    }

    /**
     * Checks if bank has all required supplies.
     * Similar to hasRequiredSupplies but only checks bank.
     *
     * @return true if bank has supplies, false otherwise
     */
    private static boolean hasBankSupplies() {
        // Check weapons based on level
        if (Skills.getLevel(Skill.ATTACK) >= RUNE_WEAPON_LEVEL) {
            if (!Equipment.contains(RUNE_SCIMITAR) &&
                !Inventory.contains(RUNE_SCIMITAR)) {
                return true;
            }
        }

        // Check progression weapons
        boolean hasBronze = Equipment.contains(BRONZE_SCIMITAR) ||
                           Inventory.contains(BRONZE_SCIMITAR);
        boolean hasIron = Equipment.contains(IRON_SCIMITAR) ||
                         Inventory.contains(IRON_SCIMITAR);
        boolean hasSteel = Equipment.contains(STEEL_SCIMITAR) ||
                          Inventory.contains(STEEL_SCIMITAR);
        boolean hasMithril = Equipment.contains(MITHRIL_SCIMITAR) ||
                            Inventory.contains(MITHRIL_SCIMITAR);
        boolean hasAdamant = Equipment.contains(ADAMANT_SCIMITAR) ||
                            Inventory.contains(ADAMANT_SCIMITAR);
        boolean hasRune = Equipment.contains(RUNE_SCIMITAR) ||
                         Inventory.contains(RUNE_SCIMITAR);

        // Need at least one weapon available
        if (!hasBronze && !hasIron && !hasSteel && !hasMithril && !hasAdamant && !hasRune) {
            return false;
        }

        // Check armor
        if (!hasArmorPiece(LEATHER_BODY)) return false;
        if (!hasArmorPiece(LEATHER_CHAPS)) return false;
        if (!hasArmorPiece(LEATHER_VAMBRACES)) return false;
        if (!hasArmorPiece(LEATHER_BOOTS)) return false;
        if (!hasArmorPiece(IRON_FULL_HELM)) return false;
        if (!hasArmorPiece(STEEL_FULL_HELM)) return false;

        // Check food
        if (!Inventory.contains(LOBSTER)) {
            return true;
        }

        return true;
    }

    /**
     * Checks if player has a specific armor piece in equipment, inventory, or bank.
     *
     * @param itemId The item ID to check for
     * @return true if has the item, false otherwise
     */
    private static boolean hasArmorPiece(int itemId) {
        return Equipment.contains(itemId) ||
               Inventory.contains(itemId) ||
               Bank.contains(itemId);
    }

    /**
     * Builds a shopping list of items that need to be purchased.
     * Checks bank for missing items and adds them to the buy list.
     */
    private static void buildShoppingList() {
        // Check weapons
        if (!Bank.contains(BRONZE_SCIMITAR)) {
            itemsToBuy.add(new ShopItem(BRONZE_SCIMITAR, 1, 200));
        }

        if (!Bank.contains(IRON_SCIMITAR)) {
            itemsToBuy.add(new ShopItem(IRON_SCIMITAR, 1, 200));
        }

        if (!Bank.contains(STEEL_FULL_HELM)) {
            itemsToBuy.add(new ShopItem(STEEL_FULL_HELM, 1, 500));
        }

        if (!Bank.contains(IRON_FULL_HELM)) {
            itemsToBuy.add(new ShopItem(IRON_FULL_HELM, 1, 300));
        }

        if (!Bank.contains(LOBSTER)) {
            itemsToBuy.add(new ShopItem(LOBSTER, 100, 150));
        }

        if (!Bank.contains(LEATHER_VAMBRACES)) {
            itemsToBuy.add(new ShopItem(LEATHER_VAMBRACES, 1, 200));
        }

        if (!Bank.contains(LEATHER_CHAPS)) {
            itemsToBuy.add(new ShopItem(LEATHER_CHAPS, 1, 200));
        }

        if (!Bank.contains(LEATHER_BOOTS)) {
            itemsToBuy.add(new ShopItem(LEATHER_BOOTS, 1, 200));
        }

        if (!Bank.contains(LEATHER_BODY)) {
            itemsToBuy.add(new ShopItem(LEATHER_BODY, 1, 200));
        }

        // Add high-tier weapon if high level
        if (Skills.getLevel(Skill.ATTACK) >= RUNE_WEAPON_LEVEL) {
            if (!Bank.contains(RUNE_SCIMITAR)) {
                itemsToBuy.add(new ShopItem(RUNE_SCIMITAR, 1, 300));
            }
        }

        if (!Bank.contains(ADAMANT_SCIMITAR)) {
            itemsToBuy.add(new ShopItem(ADAMANT_SCIMITAR, 1, 200));
        }
    }

    /**
     * Withdraws necessary supplies from bank.
     * Withdraws weapon, armor, food, and coins.
     */
    private static void withdrawBankSupplies() {
        // Withdraw weapon based on level
        BankHandler.withdrawWeapon(REQUIRED_EQUIPMENT, 1);

        // Withdraw armor
        BankHandler.withdrawItem(COINS, 500);
        BankHandler.withdrawItem(LOBSTER, FOOD_QUANTITY);
        BankHandler.withdrawArmor(EquipmentLoadout.MELEE_TRAINING, 1);
    }

    /**
     * Equips the best available gear based on player's current levels.
     * Handles weapon and armor upgrades as levels increase.
     */
    private static void equipBestGear() {
        // Toggle auto-retaliate if needed
        if (Static.getClient().getVar(AUTO_RETALIATE_VARBIT) == 1) {
            AccBuilderSotf.c = "Toggle auto retaliate";
            Static.getClient().invokeMenuAction(
                "Auto retaliate",
                "",
                1,
                MenuAction.CC_OP.getId(),
                -1,
                COMBAT_OPTIONS_WIDGET_ID
            );
        }

        // Equip weapons based on Attack level
        if (Skills.getLevel(Skill.ATTACK) < IRON_WEAPON_LEVEL) {
            equipIfInInventory(BRONZE_SCIMITAR, "Wield");
        }

        if (Skills.getLevel(Skill.ATTACK) >= IRON_WEAPON_LEVEL &&
            Skills.getLevel(Skill.ATTACK) < STEEL_WEAPON_LEVEL) {
            equipIfInInventory(IRON_SCIMITAR, "Wield");
        }

        if (Skills.getLevel(Skill.ATTACK) >= STEEL_WEAPON_LEVEL &&
            Skills.getLevel(Skill.ATTACK) < MITHRIL_SCIMITAR) {
            equipIfInInventory(STEEL_SCIMITAR, "Wield");
        }

        if (Skills.getLevel(Skill.ATTACK) >= MITHRIL_SCIMITAR &&
            Skills.getLevel(Skill.ATTACK) < ADAMANT_WEAPON_LEVEL) {
            equipIfInInventory(MITHRIL_SCIMITAR, "Wield");
        }

        if (Skills.getLevel(Skill.ATTACK) >= ADAMANT_WEAPON_LEVEL) {
            equipIfInInventory(ADAMANT_SCIMITAR, "Wield");
        }

        if (Skills.getLevel(Skill.ATTACK) >= RUNE_WEAPON_LEVEL) {
            equipIfInInventory(RUNE_SCIMITAR, "Wield");
        }

        // Equip armor (Defence 14+ recommended)
        if (Skills.getLevel(Skill.DEFENCE) >= DEFENSE_ARMOR_LEVEL) {
            equipIfInInventory(LEATHER_VAMBRACES, "Wear");
            equipIfInInventory(LEATHER_BODY, "Wear");
            equipIfInInventory(LEATHER_CHAPS, "Wear");
            equipIfInInventory(LEATHER_BOOTS, "Wear");
        }

        // Equip helms
        equipIfInInventory(IRON_FULL_HELM, "Wear");
        equipIfInInventory(STEEL_FULL_HELM, "Wear");
    }

    /**
     * Equips an item from inventory if present.
     *
     * @param itemId The item ID to equip
     * @param action The action to perform ("Wield" or "Wear")
     */
    private static void equipIfInInventory(int itemId, String action) {
        if (Inventory.contains(itemId)) {
            Inventory.getFirst(itemId).interact(action);
        }
    }

    /**
     * Checks if player is properly equipped for combat.
     * Validates presence of weapon and basic armor.
     *
     * @return true if properly equipped, false otherwise
     */
    private static boolean isProperlyEquipped() {
        // Must have at least one weapon type
        boolean hasWeapon = Equipment.contains("Iron scimitar") ||
                           Equipment.contains("Steel scimitar") ||
                           Equipment.contains("Mithril scimitar") ||
                           Equipment.contains(ADAMANT_SCIMITAR) ||
                           Equipment.contains(RUNE_SCIMITAR);

        return hasWeapon;
    }

    /**
     * Equips gear that's currently in inventory.
     */
    private static void equipGearFromInventory() {
        // This would be called if equipment checks fail
        // Implementation would iterate through inventory and equip items
    }

    /**
     * Sets combat attack style based on current skill levels.
     * Balances training between Attack, Strength, and Defence.
     *
     * Strategy:
     * - Train Strength first until level 10
     * - Then train Attack until level 10
     * - Then train Defence until level 10
     * - Repeat pattern for 20, 30, 40 level tiers
     * - Prioritize Strength for DPS
     */
    private static void setCombatStyle() {
        int strLevel = Skills.getLevel(Skill.STRENGTH);
        int attLevel = Skills.getLevel(Skill.ATTACK);
        int defLevel = Skills.getLevel(Skill.DEFENCE);

        // Below level 10 - train Strength first
        if (strLevel < COMBAT_BALANCE_LEVEL) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND); // Aggressive/Strength
        }

        // Strength 10+, Attack < 10 - train Attack
        if (strLevel >= COMBAT_BALANCE_LEVEL && attLevel < COMBAT_BALANCE_LEVEL) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST); // Accurate/Attack
        }

        // Strength 10+, Attack 10+, Defence < 10 - train Defence
        if (strLevel >= COMBAT_BALANCE_LEVEL && attLevel >= COMBAT_BALANCE_LEVEL && defLevel < COMBAT_BALANCE_LEVEL) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH); // Defensive/Defence
        }

        // Level 10-19 tier
        if (strLevel < STEEL_WEAPON_LEVEL && attLevel >= COMBAT_BALANCE_LEVEL && defLevel >= COMBAT_BALANCE_LEVEL) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND); // Back to Strength
        }

        if (strLevel >= STEEL_WEAPON_LEVEL && attLevel < STEEL_WEAPON_LEVEL && defLevel >= COMBAT_BALANCE_LEVEL) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST); // Back to Attack
        }

        if (strLevel >= STEEL_WEAPON_LEVEL && attLevel >= STEEL_WEAPON_LEVEL && defLevel < STEEL_WEAPON_LEVEL) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH); // Back to Defence
        }

        // Level 20-29 tier
        if (strLevel < MITHRIL_SCIMITAR && attLevel >= STEEL_WEAPON_LEVEL && defLevel >= STEEL_WEAPON_LEVEL) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }

        if (strLevel >= MITHRIL_SCIMITAR && attLevel < MITHRIL_SCIMITAR && defLevel >= STEEL_WEAPON_LEVEL) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }

        if (strLevel >= MITHRIL_SCIMITAR && attLevel >= MITHRIL_SCIMITAR && defLevel < MITHRIL_SCIMITAR) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }

        // Level 30+ - prioritize Strength to 40
        if (strLevel < ADAMANT_WEAPON_LEVEL && attLevel >= MITHRIL_SCIMITAR && defLevel >= MITHRIL_SCIMITAR &&
            Combat.getAttackStyle() != Combat.AttackStyle.SECOND) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
    }

    /**
     * Main cow killing logic.
     * Walks to cow area and attacks cows that aren't in combat.
     */
    public static void killCows() {
        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Walk to cow area if not there
        if (!COW_AREA_2.contains(playerLocation)) {
            AccBuilderSotf.c = "Walking to cow area";
            Movement.walkTo(SAFE_SPOT_2);
            Time.sleepTicks(1);
            return;
        }

        // We're in cow area
        if (COW_AREA_2.contains(playerLocation)) {
            AccBuilderSotf.c = "Killing cows";

            // If not in combat, find a cow to attack
            if (Players.getLocal().getInteracting() == null) {
                // Find nearest cow that's not in combat
                NPC targetCow = NPCs.getNearest(npc ->
                    npc.getName().contains("Cow") &&
                    npc.getInteracting() == null &&
                    !npc.isDead()
                );

                // Check if any cows are already attacking us
                List<NPC> cowsAttackingUs = NPCs.getAll("Cow", "cow")
                    .stream()
                    .filter(npc -> npc.getInteracting() == Players.getLocal())
                    .collect(Collectors.toList());

                // If a cow is attacking us, fight back
                if (!cowsAttackingUs.isEmpty()) {
                    cowsAttackingUs.get(0).interact("Attack");
                    Time.sleepTicks(2);
                    return;
                }

                // Otherwise attack nearest free cow
                if (targetCow != null && !Players.getLocal().isMoving() && cowsAttackingUs.isEmpty()) {
                    targetCow.interact("Attack");
                    Time.sleepTicks(2);
                }
            }

            // If in combat, wait
            if (Players.getLocal().getInteracting() != null) {
                Time.sleepTicks(4);
            }
        }
    }

    /**
     * Initialize constant values.
     * These were obfuscated with XOR operations in the original code.
     */
    private static void initializeConstants() {
        // Constants are defined as static finals above
    }

    /**
     * Initialize string constants.
     * These were encrypted in the original code.
     */
    private static void initializeStrings() {
        // Strings are now hardcoded as literals throughout the code
    }

    /**
     * Helper class to represent items to purchase.
     */
    public static class ShopItem {
        public int itemId;
        public int quantity;
        public int maxPrice;

        public ShopItem(int itemId, int quantity, int maxPrice) {
            this.itemId = itemId;
            this.quantity = quantity;
            this.maxPrice = maxPrice;
        }
    }

    /**
     * Placeholder for step interface (referenced but not included in original file).
     */
    private interface SotfStep {
        String getName();
        boolean isComplete();
        boolean shouldExecute();
        int execute();
    }

    /**
     * Placeholder for shop handler (referenced but not included).
     */
    private static class ShopHandler {
        public static void buyItems(List<ShopItem> items) {
            // Implementation in separate file
        }
    }

    /**
     * Placeholder for navigation handler (referenced but not included).
     */
    private static class NavigationHandler {
        public static void walkToBank(BankLocation bank) {
            // Implementation in separate file
        }
    }

    /**
     * Placeholder for bank handler (referenced but not included).
     */
    private static class BankHandler {
        public static void openBank() {
            // Implementation in separate file
        }

        public static void withdrawWeapon(int[] weapons, int quantity) {
            // Implementation in separate file
        }

        public static void withdrawItem(int itemId, int quantity) {
            // Implementation in separate file
        }

        public static void withdrawArmor(EquipmentLoadout loadout, int quantity) {
            // Implementation in separate file
        }
    }

    /**
     * Placeholder for equipment loadout (referenced but not included).
     */
    private static class EquipmentLoadout {
        public static final EquipmentLoadout MELEE_TRAINING = new EquipmentLoadout();
    }

    /**
     * Placeholder for health calculator (referenced but not included).
     */
    private static class HealthCalculator {
        public static double getHealthPercent() {
            // Implementation in separate file
            return 100.0;
        }
    }

    /**
     * Placeholder for sand crabs handler (referenced but not included).
     */
    private static class SandCrabsHandler {
        public static void train() {
            // Implementation in separate file
        }
    }
}
