package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.sotf.framework.*;

/**
 * Handles combat training by fighting NPCs.
 * Supports equipment, food, potions, prayer, and loot management.
 */
public class CombatTrainingStep implements QuestStep {

    // World points for combat locations
    static final WorldPoint COMBAT_LOCATION_1 = new WorldPoint(30571, 28415, 0);
    public static final WorldPoint COMBAT_LOCATION_2 = new WorldPoint(12237, 28467, 0);
    public static final WorldPoint COMBAT_LOCATION_3 = new WorldPoint(5311, 30515, 0);
    static final WorldPoint COMBAT_LOCATION_4 = new WorldPoint(31862, 28396, 0);
    public static final WorldPoint COMBAT_LOCATION_5 = new WorldPoint(26663, 32687, 0);
    public static final WorldPoint COMBAT_LOCATION_6 = new WorldPoint(32506, 32622, 0);
    static final WorldPoint SAFE_SPOT_1 = new WorldPoint(20121, 28424, 0);

    // Item IDs - Weapons and armor
    private static final int IRON_SCIMITAR_ID = 8579;
    private static final int STEEL_SCIMITAR_ID = 12231;
    private static final int MITHRIL_SCIMITAR_ID = 12259;
    private static final int ADAMANT_SCIMITAR_ID = 20133;
    private static final int RUNE_SCIMITAR_ID = 32506;
    private static final int IRON_CHAINBODY_ID = 29351;
    private static final int STEEL_CHAINBODY_ID = 12183;
    private static final int MITHRIL_CHAINBODY_ID = 20176;

    // Item IDs - Consumables
    private static final int LOBSTER_ID = 25645;
    private static final int SWORDFISH_ID = 8206;
    private static final int PRAYER_POTION_ID = 19854;
    private static final int SUPER_ATTACK_POTION_ID = 28377;
    private static final int SUPER_STRENGTH_POTION_ID = 32425;

    // NPC names
    private static final String NPC_HILL_GIANT = "Hill Giant";
    private static final String NPC_ROCK_CRAB = "Rock Crab";
    private static final String NPC_MOSS_GIANT = "Moss Giant";
    private static final String NPC_SAND_CRAB = "Sand Crab";

    // Constants
    private static final int TICK_DELAY_SHORT = 1;
    private static final int TICK_DELAY_MEDIUM = 2;
    private static final int TICK_DELAY_LONG = 4;
    private static final int BANK_TIMEOUT_MS = 15357;
    private static final int MIN_HP_THRESHOLD = 20;
    private static final int DISTANCE_THRESHOLD = 8;
    private static final int PRAYER_POINTS_THRESHOLD = 10;
    private static final int TARGET_COMBAT_LEVEL = 72;

    // Buy quantities
    private static final int BUY_FOOD_QUANTITY = 200;
    private static final int BUY_PRAYER_POTION_QUANTITY = 4;
    private static final int BUY_WEAPON_QUANTITY = 1;
    private static final int BUY_ARMOR_QUANTITY = 1;

    // Status messages
    private static final String MSG_BUYING_ITEMS = "Buying items";
    private static final String MSG_FINISHED_BUYING = "Finished buying items, switching back to combat";
    private static final String MSG_NAV_TO_BANK = "Navigating to bank";
    private static final String MSG_HANDLING_BANKING = "Handling banking";
    private static final String MSG_MISSING_SUPPLIES = "We are missing combat supplies, switching to BUYING";
    private static final String MSG_FIGHTING = "Fighting";
    private static final String MSG_EATING = "Eating";
    private static final String MSG_LOOTING = "Looting";
    private static final String MSG_NAV_TO_COMBAT = "Navigating to combat area";
    private static final String MSG_ATTACK = "Attack";
    private static final String MSG_EAT = "Eat";
    private static final String MSG_DRINK = "Drink";
    private static final String MSG_TAKE = "Take";
    private static final String SKILL_NAME = "Combat";

    // State
    public static List<d> itemsToBuy;
    public static boolean isBuying;
    private final int COMBAT_WIDGET_ID = 536;

    static {
        itemsToBuy = new ArrayList<>();
    }

    /**
     * Populates the shopping list with combat supplies.
     */
    public static void populateShoppingList() {
        // Buy weapons based on attack level
        int attackLevel = Skills.getLevel(Skill.ATTACK);

        if (attackLevel >= 40 && !Bank.contains(RUNE_SCIMITAR_ID)) {
            itemsToBuy.add(new ShopItem(RUNE_SCIMITAR_ID, BUY_WEAPON_QUANTITY, 30635));
        }

        if (attackLevel >= 30 && !Bank.contains(ADAMANT_SCIMITAR_ID)) {
            itemsToBuy.add(new ShopItem(ADAMANT_SCIMITAR_ID, BUY_WEAPON_QUANTITY, 12245));
        }

        if (attackLevel >= 20 && !Bank.contains(MITHRIL_SCIMITAR_ID)) {
            itemsToBuy.add(new ShopItem(MITHRIL_SCIMITAR_ID, BUY_WEAPON_QUANTITY, 5211));
        }

        if (attackLevel >= 5 && !Bank.contains(STEEL_SCIMITAR_ID)) {
            itemsToBuy.add(new ShopItem(STEEL_SCIMITAR_ID, BUY_WEAPON_QUANTITY, 7271));
        }

        if (!Bank.contains(IRON_SCIMITAR_ID)) {
            itemsToBuy.add(new ShopItem(IRON_SCIMITAR_ID, BUY_WEAPON_QUANTITY, 19750));
        }

        // Buy armor based on defense level
        int defenseLevel = Skills.getLevel(Skill.DEFENCE);

        if (defenseLevel >= 20 && !Bank.contains(MITHRIL_CHAINBODY_ID)) {
            itemsToBuy.add(new ShopItem(MITHRIL_CHAINBODY_ID, BUY_ARMOR_QUANTITY, 12191));
        }

        if (defenseLevel >= 5 && !Bank.contains(STEEL_CHAINBODY_ID)) {
            itemsToBuy.add(new ShopItem(STEEL_CHAINBODY_ID, BUY_ARMOR_QUANTITY, 8303));
        }

        if (!Bank.contains(IRON_CHAINBODY_ID)) {
            itemsToBuy.add(new ShopItem(IRON_CHAINBODY_ID, BUY_ARMOR_QUANTITY, 28391));
        }

        // Buy food
        if (!Bank.contains(LOBSTER_ID)) {
            itemsToBuy.add(new ShopItem(LOBSTER_ID, BUY_FOOD_QUANTITY, Constants.DEFAULT_GE_TIMEOUT));
        }

        // Buy potions
        if (!Bank.contains(PRAYER_POTION_ID)) {
            itemsToBuy.add(new ShopItem(PRAYER_POTION_ID, BUY_PRAYER_POTION_QUANTITY, 8319));
        }

        if (!Bank.contains(SUPER_ATTACK_POTION_ID)) {
            itemsToBuy.add(new ShopItem(SUPER_ATTACK_POTION_ID, BUY_WEAPON_QUANTITY, 12258));
        }

        if (!Bank.contains(SUPER_STRENGTH_POTION_ID)) {
            itemsToBuy.add(new ShopItem(SUPER_STRENGTH_POTION_ID, BUY_WEAPON_QUANTITY, 16330));
        }
    }

    /**
     * Main training execution method.
     */
    public static void train() {
        // Handle GE buying
        if (isBuying) {
            AccBuilderSotf.c = MSG_BUYING_ITEMS;
            b.a(itemsToBuy);

            if (itemsToBuy.size() < 1) {
                System.out.println(MSG_FINISHED_BUYING);
                isBuying = false;
            }
        }

        if (!isBuying) {
            if (!hasRequiredSupplies() && GameStateUtil.getVarbit(536) < 1) {
                handleBanking();
            }

            // Use potions
            usePotionsIfNeeded();

            // Eat food if needed
            if (needsFood()) {
                eatFood();
            }

            // Loot items
            lootNearbyItems();

            // Fight NPCs
            if (hasRequiredSupplies() && GameStateUtil.getVarbit(536) != 0) {
                handleCombat();
            }
        }
    }

    /**
     * Handles banking operations.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();
        if (nearestBank == null) {
            return;
        }

        // Navigate to bank
        if (!nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_NAV_TO_BANK;
            BankingUtil.navigateToBank(nearestBank);
            return;
        }

        // Open bank
        if (!Bank.isOpen()) {
            BankingUtil.openNearestBank();
            Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT_MS);
            return;
        }

        // Handle banking
        AccBuilderSotf.c = MSG_HANDLING_BANKING;

        // Deposit everything
        if (Inventory.getAll().size() > 0) {
            Bank.depositInventory();
            Time.sleepTicks(TICK_DELAY_LONG);
        }

        if (Equipment.getAll().size() > 0) {
            Bank.depositEquipment();
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        }

        // Check for supplies
        if (!Bank.contains(LOBSTER_ID)) {
            populateShoppingList();
            System.out.println(MSG_MISSING_SUPPLIES);
            isBuying = true;
            return;
        }

        // Withdraw supplies
        withdrawSupplies();
    }

    /**
     * Withdraws combat supplies from the bank.
     */
    private static void withdrawSupplies() {
        // Withdraw weapon
        int attackLevel = Skills.getLevel(Skill.ATTACK);

        if (attackLevel >= 40 && Bank.contains(RUNE_SCIMITAR_ID)) {
            BankingUtil.withdrawItem(RUNE_SCIMITAR_ID, 1);
        } else if (attackLevel >= 30 && Bank.contains(ADAMANT_SCIMITAR_ID)) {
            BankingUtil.withdrawItem(ADAMANT_SCIMITAR_ID, 1);
        } else if (attackLevel >= 20 && Bank.contains(MITHRIL_SCIMITAR_ID)) {
            BankingUtil.withdrawItem(MITHRIL_SCIMITAR_ID, 1);
        } else if (attackLevel >= 5 && Bank.contains(STEEL_SCIMITAR_ID)) {
            BankingUtil.withdrawItem(STEEL_SCIMITAR_ID, 1);
        } else {
            BankingUtil.withdrawItem(IRON_SCIMITAR_ID, 1);
        }

        // Withdraw armor
        int defenseLevel = Skills.getLevel(Skill.DEFENCE);

        if (defenseLevel >= 20 && Bank.contains(MITHRIL_CHAINBODY_ID)) {
            BankingUtil.withdrawItem(MITHRIL_CHAINBODY_ID, 1);
        } else if (defenseLevel >= 5 && Bank.contains(STEEL_CHAINBODY_ID)) {
            BankingUtil.withdrawItem(STEEL_CHAINBODY_ID, 1);
        } else {
            BankingUtil.withdrawItem(IRON_CHAINBODY_ID, 1);
        }

        // Withdraw food
        BankingUtil.withdrawItem(LOBSTER_ID, 20);

        // Withdraw potions
        BankingUtil.withdrawItem(PRAYER_POTION_ID, 2);
        BankingUtil.withdrawItem(SUPER_ATTACK_POTION_ID, 1);
        BankingUtil.withdrawItem(SUPER_STRENGTH_POTION_ID, 1);
    }

    /**
     * Checks if the player has required supplies.
     *
     * @return true if supplies are present
     */
    private static boolean hasRequiredSupplies() {
        return Inventory.contains(LOBSTER_ID) ||
                Inventory.contains(SWORDFISH_ID);
    }

    /**
     * Uses potions if needed.
     */
    private static void usePotionsIfNeeded() {
        // Drink prayer potion if needed
        if (Inventory.contains(ItemIdArrays.PRAYER_POTIONS) && Skills.getBoostedLevel(Skill.PRAYER) < PRAYER_POINTS_THRESHOLD) {
            Inventory.getFirst(ItemIdArrays.PRAYER_POTIONS).interact(MSG_DRINK);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }

        // Drink super attack
        if (Inventory.contains(SUPER_ATTACK_POTION_ID) && !hasPotionBoost(Skill.ATTACK)) {
            Inventory.getFirst(SUPER_ATTACK_POTION_ID).interact(MSG_DRINK);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }

        // Drink super strength
        if (Inventory.contains(SUPER_STRENGTH_POTION_ID) && !hasPotionBoost(Skill.STRENGTH)) {
            Inventory.getFirst(SUPER_STRENGTH_POTION_ID).interact(MSG_DRINK);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }
    }

    /**
     * Checks if a skill has a potion boost.
     *
     * @param skill The skill to check
     * @return true if boosted
     */
    private static boolean hasPotionBoost(Skill skill) {
        return Skills.getBoostedLevel(skill) > Skills.getLevel(skill);
    }

    /**
     * Checks if the player needs to eat food.
     *
     * @return true if HP is low
     */
    private static boolean needsFood() {
        return GameStateUtil.getHealthPercentage() < 60.0 || Skills.getBoostedLevel(Skill.HITPOINTS) <= MIN_HP_THRESHOLD;
    }

    /**
     * Eats food to restore HP.
     */
    private static void eatFood() {
        AccBuilderSotf.c = MSG_EATING;

        if (Inventory.contains(LOBSTER_ID)) {
            Inventory.getFirst(LOBSTER_ID).interact(MSG_EAT);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        } else if (Inventory.contains(SWORDFISH_ID)) {
            Inventory.getFirst(SWORDFISH_ID).interact(MSG_EAT);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        }
    }

    /**
     * Loots nearby items.
     */
    private static void lootNearbyItems() {
        if (Inventory.isFull()) {
            return;
        }

        // Loot valuable items
        TileItem loot = TileItems.getNearest(item -> isValuableItem(item.getName()));

        if (loot != null && !Players.getLocal().isMoving()) {
            AccBuilderSotf.c = MSG_LOOTING;
            loot.pickup();
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        }
    }

    /**
     * Checks if an item is valuable enough to loot.
     *
     * @param itemName The item name
     * @return true if valuable
     */
    private static boolean isValuableItem(String itemName) {
        // Add logic to determine if item is valuable
        return itemName.contains("bone") || itemName.contains("Big bone") ||
                itemName.contains("rune") || itemName.contains("adamant");
    }

    /**
     * Handles combat - navigating to combat area and attacking NPCs.
     */
    private static void handleCombat() {
        // Navigate to combat area if needed
        WorldPoint combatLocation = COMBAT_LOCATION_2;

        if (Players.getLocal().getWorldLocation().distanceTo(combatLocation) > DISTANCE_THRESHOLD) {
            AccBuilderSotf.c = MSG_NAV_TO_COMBAT;
            Movement.walkTo(combatLocation);
            Time.sleepTicks(TICK_DELAY_SHORT);
            return;
        }

        // Close level up dialogs
        if (Dialog.canLevelUpContinue()) {
            Dialog.close();
        }

        // Attack NPCs
        if (!Players.getLocal().isInteracting() && !Players.getLocal().isMoving()) {
            AccBuilderSotf.c = MSG_FIGHTING;

            var npc = NPCs.getNearest(npc -> npc.getName().equals(NPC_HILL_GIANT) &&
                    npc.getInteracting() == null && !npc.isDead());

            if (npc != null) {
                npc.interact(MSG_ATTACK);
                Time.sleepTicks(TICK_DELAY_MEDIUM);
            }
        }
    }

    @Override
    public String getName() {
        return SKILL_NAME;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.ATTACK) >= TARGET_COMBAT_LEVEL;
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        train();
        return 12;  // Priority
    }
}
