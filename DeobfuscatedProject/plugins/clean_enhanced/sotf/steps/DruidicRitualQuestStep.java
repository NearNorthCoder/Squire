package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import gg.squire.sotf.steps.*;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.sotf.framework.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Druidic Ritual quest automation step.
 *
 * Quest Steps:
 * 1. Talk to Kaqemeex to start the quest
 * 2. Talk to Sanfew to get the task
 * 3. Obtain raw meats (chicken, beef, bear meat, rat meat)
 * 4. Use meats on the cauldron to enchant them
 * 5. Talk to Sanfew again to turn in enchanted meats
 * 6. Talk to Kaqemeex to complete the quest
 */
public class DruidicRitualQuestStep implements QuestStep {

    private static final String QUEST_NAME = "Druidic ritual quest";

    // Quest varbits and values
    private static final int QUEST_VARBIT = 14;
    private static final int STEP_START = 0;
    private static final int STEP_TALKED_TO_KAQEMEEX = 1;
    private static final int STEP_TALKED_TO_SANFEW = 2;
    private static final int STEP_ENCHANTING = 3;
    private static final int STEP_COMPLETE = 4;

    // Item IDs
    private static final int ITEM_RAW_CHICKEN = 2138;
    private static final int ITEM_RAW_BEEF = 2132;
    private static final int ITEM_RAW_BEAR_MEAT = 2136;
    private static final int ITEM_RAW_RAT_MEAT = 2134;
    private static final int ITEM_SPADE = 952;
    private static final int ITEM_RING_OF_WEALTH = 11980;
    private static final int ITEM_COINS = 995;
    private static final int CAULDRON_OBJECT_ID = 11441;

    // World locations
    public static final WorldPoint KAQEMEEX_LOCATION = new WorldPoint(2918, 3482, 0);
    public static final WorldPoint SANFEW_LOCATION = new WorldPoint(2899, 3429, 1);
    public static final WorldPoint CAULDRON_LOCATION = new WorldPoint(2893, 9832, 0);

    // Dialog options
    static String[] dialogOptions;

    // Quest state tracking
    static int questStepCounter;
    static boolean buyingItems;
    public static List<d> itemRequirements;

    // Additional flags
    static boolean questInitialized;

    static {
        ea = KAQEMEEX_LOCATION;
        eb = SANFEW_LOCATION;
        ec = CAULDRON_LOCATION;
        itemRequirements = new ArrayList<>();
        questStepCounter = 0;

        dialogOptions = new String[]{
                "I'm in search of a quest.",
                "Okay, I will try and help.",
                "Yes.",
                "I've been sent to help purify the Varrock stone circle.",
                "Ok, I'll do that then."
        };
    }

    @Override
    public String getName() {
        return QUEST_NAME;
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        try {
            executeQuestStep();
        } catch (Exception ex) {
            // Ignore exceptions
        }
        return 100;
    }

    @Override
    public boolean isComplete() {
        return GameStateUtil.getVarbit(QUEST_VARBIT) >= STEP_COMPLETE;
    }

    /**
     * Checks if player has all required enchanted meats.
     */
    private static boolean hasEnchantedMeats() {
        return Inventory.getCount("Enchanted bear") > 0
                && Inventory.getCount("Enchanted chicken") > 0
                && Inventory.getCount("Enchanted rat") > 0
                && Inventory.getCount("Enchanted beef") > 0;
    }

    /**
     * Checks if player has all required raw meats.
     */
    public static boolean hasRawMeats() {
        return Inventory.getCount("Raw chicken") > 0
                && Inventory.getCount("Raw beef") > 0
                && Inventory.getCount("Raw bear meat") > 0
                && Inventory.getCount("Raw rat meat") > 0;
    }

    /**
     * Builds a shopping list of missing quest items.
     */
    private static void buildShoppingList() {
        if (!Bank.contains(ITEM_COINS)) {
            itemRequirements.add(new ShopItem(ITEM_COINS, 5, Constants.DEFAULT_GE_TIMEOUT));
        }
        if (!Bank.contains(ITEM_RAW_BEEF)) {
            itemRequirements.add(new ShopItem(ITEM_RAW_BEEF, 1, 25000));
        }
        if (!Bank.contains(ITEM_RAW_CHICKEN)) {
            itemRequirements.add(new ShopItem(ITEM_RAW_CHICKEN, 1, 25000));
        }
        if (!Bank.contains(ITEM_RAW_BEAR_MEAT)) {
            itemRequirements.add(new ShopItem(ITEM_RAW_BEAR_MEAT, 1, 25000));
        }
        if (!Bank.contains(ITEM_RAW_RAT_MEAT)) {
            itemRequirements.add(new ShopItem(ITEM_RAW_RAT_MEAT, 1, 25000));
        }
        if (!Bank.contains(ITEM_SPADE)) {
            itemRequirements.add(new ShopItem(ITEM_SPADE, 31, 25000));
        }
        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            itemRequirements.add(new ShopItem(ITEM_RING_OF_WEALTH, 5, 31914));
        }
        if (!Bank.contains(995)) {
            itemRequirements.add(new ShopItem(995, 32, 12949));
        }
    }

    /**
     * Main quest step execution logic.
     */
    public static void executeQuestStep() {
        // Handle buying items if needed
        if (buyingItems) {
            AccBuilderSotf.c = "Buying items";
            b.a(itemRequirements);
            if (itemRequirements.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                buyingItems = false;
            }
        }

        if (!buyingItems) {
            // Consume stamina potions if needed
            if (Inventory.contains(f.ba) && Movement.getRunEnergy() < 177) {
                Inventory.getFirst(f.ba).interact("Drink");
                Time.sleepTicks(1);
            }

            // Consume food if health is low
            if (GameStateUtil.getHealthPercentage() < 70.0) {
                if (Inventory.contains(ITEM_SPADE)) {
                    Inventory.getFirst(ITEM_SPADE).interact("Eat");
                }
            }

            // Enable run if disabled
            if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 0) {
                Movement.toggleRun();
            }

            // Handle banking for quest items
            if (!hasRawMeats() && !Inventory.getCount(11440) > 0 && GameStateUtil.getVarbit(QUEST_VARBIT) < 1) {
                BankLocation nearestBank = BankLocation.getNearest();
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Nav to bank";
                    a.a(nearestBank);
                    Time.sleepTicks(2);
                }

                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Handling banking";

                    if (!Bank.isOpen()) {
                        a.a();
                        Time.sleepUntil(Bank::isOpen, 5000);
                    }

                    if (Bank.isOpen()) {
                        // Deposit all items first
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(4);
                        }
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check if we need to buy items
                        int[] requiredItems = {ITEM_RAW_BEEF, ITEM_RAW_CHICKEN, ITEM_RAW_BEAR_MEAT, ITEM_RAW_RAT_MEAT, ITEM_SPADE};
                        if (!GameStateUtil.randomRange(requiredItems)) {
                            buildShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            buyingItems = true;
                            return;
                        }

                        // Withdraw quest items
                        if (GameStateUtil.randomRange(requiredItems)) {
                            Bank.withdraw(ITEM_RAW_BEEF, 1, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Bank.withdraw(ITEM_RAW_CHICKEN, 1, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Bank.withdraw(ITEM_RAW_BEAR_MEAT, 1, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Bank.withdraw(ITEM_RAW_RAT_MEAT, 1, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            a.a(952, 5);
                            a.b(f.ba, 5);
                            a.a(ITEM_SPADE, 31);
                            a.b(f.bk, 1);
                        }
                    }
                }
            }

            // Step 1: Talk to Kaqemeex to start quest
            if (hasRawMeats() && GameStateUtil.getVarbit(QUEST_VARBIT) < 1) {
                if (Players.getLocal().getWorldLocation().distanceTo(KAQEMEEX_LOCATION) > 3) {
                    AccBuilderSotf.c = "Nav to start";
                    if (questStepCounter < 1) {
                        e.x();
                        questStepCounter += 1;
                    }
                    Movement.walkTo(KAQEMEEX_LOCATION);
                    Time.sleepTicks(1);
                }
                if (Players.getLocal().getWorldLocation().distanceTo(KAQEMEEX_LOCATION) <= 3) {
                    AccBuilderSotf.c = "Talk npc";
                    g.a("Kaqemeex", dialogOptions);
                }
            }

            // Step 2: Talk to Sanfew to get the task
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 1) {
                questInitialized = false;
                if (Players.getLocal().getWorldLocation().distanceTo(SANFEW_LOCATION) > 3) {
                    AccBuilderSotf.c = "Nav to sanfew";
                    Movement.walkTo(SANFEW_LOCATION);
                    Time.sleepTicks(1);
                }
                if (Players.getLocal().getWorldLocation().distanceTo(SANFEW_LOCATION) <= 3) {
                    AccBuilderSotf.c = "Talk sanfew";
                    g.a("Sanfew", dialogOptions);
                }
            }

            // Step 3: Enchant meats at cauldron
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 2 && !hasEnchantedMeats()) {
                if (Players.getLocal().getWorldLocation().distanceTo(CAULDRON_LOCATION) > 3) {
                    AccBuilderSotf.c = "Nav to couldren";
                    Movement.walkTo(CAULDRON_LOCATION);
                    Time.sleepTicks(1);
                }
                if (Players.getLocal().getWorldLocation().distanceTo(CAULDRON_LOCATION) <= 3) {
                    AccBuilderSotf.c = "Enchanting";
                    TileObject cauldron = TileObjects.getNearest(CAULDRON_OBJECT_ID);
                    if (cauldron != null) {
                        Item rawBear = Inventory.getFirst("Raw beef");
                        Item rawRat = Inventory.getFirst("Raw rat meat");
                        Item rawChicken = Inventory.getFirst("Raw chicken");
                        Item rawBeef = Inventory.getFirst("Raw bear meat");

                        if (rawBear != null) {
                            rawBear.useOn(cauldron);
                            Time.sleepTicks(1);
                        }
                        if (rawRat != null) {
                            rawRat.useOn(cauldron);
                            Time.sleepTicks(1);
                        }
                        if (rawChicken != null) {
                            rawChicken.useOn(cauldron);
                            Time.sleepTicks(1);
                        }
                        if (rawBeef != null) {
                            rawBeef.useOn(cauldron);
                            Time.sleepTicks(1);
                        }
                    }
                }
            }

            // Step 4: Return enchanted meats to Sanfew
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 2 && hasEnchantedMeats()) {
                if (Players.getLocal().getWorldLocation().distanceTo(SANFEW_LOCATION) > 3) {
                    AccBuilderSotf.c = "Nav to sanfew";
                    Movement.walkTo(SANFEW_LOCATION);
                    Time.sleepTicks(1);
                }
                if (Players.getLocal().getWorldLocation().distanceTo(SANFEW_LOCATION) <= 3) {
                    AccBuilderSotf.c = "Talk sanfew";
                    g.a("Sanfew", dialogOptions);
                }
            }

            // Step 5: Complete quest with Kaqemeex
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 3) {
                if (Players.getLocal().getWorldLocation().distanceTo(KAQEMEEX_LOCATION) > 3) {
                    AccBuilderSotf.c = "Nav to start";
                    Movement.walkTo(KAQEMEEX_LOCATION);
                    Time.sleepTicks(1);
                }
                if (Players.getLocal().getWorldLocation().distanceTo(KAQEMEEX_LOCATION) <= 3) {
                    AccBuilderSotf.c = "Talk npc";
                    if (questInitialized < 1) {
                        aN.pX += 1;
                        aN.u(AccBuilderSotf.m);
                        questInitialized += 1;
                        aN.pX = 0;
                    }
                    g.a("Kaqemeex", dialogOptions);
                }
            }

            // Handle general dialog
            g.a(dialogOptions);
        }
    }
}
