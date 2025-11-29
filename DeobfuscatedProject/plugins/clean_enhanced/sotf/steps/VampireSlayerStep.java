package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

import java.util.ArrayList;
import java.util.List;

/**
 * Quest step handler for Vampire Slayer quest in SOTF plugin.
 * Handles all aspects of completing the Vampire Slayer quest including:
 * - Banking and inventory management
 * - NPC dialogue interactions
 * - Combat with Count Draynor
 * - Quest item usage (stake, garlic, beer)
 */
public class VampireSlayerStep implements QuestStep {

    // Quest locations
    private static final WorldPoint MORGAN_LOCATION = new WorldPoint(19551, 19949, 0);
    private static final WorldPoint PUB_LOCATION = new WorldPoint(12279, 12793, 0);
    private static final WorldPoint DRAYNOR_MANOR_STAIRS = new WorldPoint(12031, 12473, 0);
    private static final WorldPoint DRAYNOR_CRYPT = new WorldPoint(12036, 12473, 0);

    // Quest dialogue options
    private static final String[] DIALOGUE_OPTIONS = new String[]{
        "Ok, I'm up for an adventure.",
        "A glass of your finest ale please.",
        "Morgan needs your help!",
        "Yes."
    };

    // Required quest items
    private static final int BEER = 1917;
    private static final int GARLIC = 1550;
    private static final int STAKE = 1549;
    private static final int HAMMER = 2347;

    // State management
    public static boolean needsBuying = false;
    public static List<ShoppingItem> shoppingList = new ArrayList<>();
    private static int teleportCounter = 0;
    private static int combatCounter = 0;

    @Override
    public String getStepName() {
        return "Vampire slayer quest";
    }

    @Override
    public boolean shouldExecute() {
        return false; // Managed by plugin
    }

    @Override
    public boolean isComplete() {
        // Quest is complete when we're past certain varbit value and outside manor
        return QuestHelper.getQuestVarbit(178) >= 3
            && Players.getLocal().getWorldLocation().distanceTo(DRAYNOR_CRYPT) > 20;
    }

    @Override
    public int execute() {
        try {
            handleQuestStep();
        } catch (Exception e) {
            // Silently handle exceptions
        }
        return 50;
    }

    /**
     * Main quest step handler
     */
    public static void handleQuestStep() {
        // Handle shopping mode
        if (needsBuying) {
            AccBuilderSotf.currentStatus = "Buying items";
            ShoppingHelper.buyItems(shoppingList);
            if (shoppingList.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                needsBuying = false;
            }
        }

        // Handle low health
        if (!needsBuying && QuestHelper.getQuestVarbit(226) >= 4) {
            HealthManager.handleLowHealth();
        }

        if (needsBuying || QuestHelper.getQuestVarbit(226) < 4) {
            return;
        }

        // Use stamina potion if needed
        if (Inventory.contains(StaminaPotion.STAMINA_POTIONS) && Movement.getRunEnergy() < 70) {
            Inventory.getFirst(StaminaPotion.STAMINA_POTIONS).interact("Drink");
            Time.sleepTicks(1);
        }

        // Eat food if low health
        if (HealthHelper.getHealthPercentage() < 70.0) {
            if (Inventory.contains(12163)) {
                Inventory.getFirst(12163).interact("Eat");
            }
        }

        // Toggle run
        if (!Movement.isRunEnabled() && HealthHelper.shouldRun()) {
            Movement.toggleRun();
        }

        // Banking phase
        if (hasRequiredItems() && QuestHelper.getQuestVarbit(178) == 1) {
            BankLocation bank = BankLocation.getNearest();
            if (bank != null && !bank.getArea().contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.currentStatus = "Nav to bank";
                NavigationHelper.walkTo(bank);
                Time.sleepTicks(2);
            }

            if (bank != null && bank.getArea().contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.currentStatus = "Handling banking";
                if (!Bank.isOpen()) {
                    BankHelper.openBank();
                    Time.sleepUntil(() -> Bank.isOpen(), 5000);
                }

                if (Bank.isOpen()) {
                    if (Inventory.getAll().size() > 0) {
                        Bank.depositInventory();
                        Time.sleepTicks(4);
                    }

                    if (Equipment.getAll().size() > 0) {
                        Bank.depositEquipment();
                        Time.sleepTicks(2);
                    }

                    // Check if we have required items
                    if (!hasRequiredItemsInBank()) {
                        checkMissingItems();
                        System.out.println("We are missing quest supplies, switching to BUYING");
                        needsBuying = true;
                        return;
                    }

                    // Withdraw items
                    withdrawQuestItems();
                }
            }
        }

        // Walk to Morgan to start quest
        if (hasRequiredItems() && QuestHelper.getQuestVarbit(178) == 1) {
            if (Players.getLocal().getWorldLocation().distanceTo(MORGAN_LOCATION) > 2) {
                AccBuilderSotf.currentStatus = "Nav to start";

                if (!Equipment.contains(TeleportItems.GLORY_AMULET) && Inventory.contains(TeleportItems.GLORY_AMULET)) {
                    Inventory.getFirst(TeleportItems.GLORY_AMULET).interact("Wear");
                    Time.sleepTicks(1);
                }

                if (teleportCounter < 1) {
                    TeleportHelper.handleTeleport();
                    teleportCounter += 1;
                }

                Movement.walkTo(MORGAN_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(MORGAN_LOCATION) <= 3) {
                AccBuilderSotf.currentStatus = "Talking npc";
                DialogueHelper.handleDialogue("Morgan", DIALOGUE_OPTIONS);
            }
        }

        // Walk to pub to talk to Dr Harlow
        if (QuestHelper.getQuestVarbit(178) == 2) {
            combatCounter = 0;

            if (Players.getLocal().getWorldLocation().distanceTo(PUB_LOCATION) > 8) {
                AccBuilderSotf.currentStatus = "Nav to pub";
                Movement.walkTo(PUB_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(PUB_LOCATION) <= 8) {
                AccBuilderSotf.currentStatus = "Talk to drunk";
                DialogueHelper.handleDialogue("Dr Harlow", DIALOGUE_OPTIONS);
            }
        }

        // Navigate to Draynor Manor stairs
        if (QuestHelper.getQuestVarbit(178) == 2 && Inventory.contains("Beer") && Inventory.contains("Stake")) {
            AccBuilderSotf.currentStatus = "Talk to drunk";
            DialogueHelper.handleDialogue("Dr Harlow", DIALOGUE_OPTIONS);
            DialogueHelper.continueDialogue(DIALOGUE_OPTIONS);
        }

        if (QuestHelper.getQuestVarbit(178) == 2 && Inventory.contains("Beer") && !Inventory.contains("Stake")) {
            if (Players.getLocal().getWorldLocation().distanceTo(DRAYNOR_MANOR_STAIRS) > 4
                && Players.getLocal().getWorldLocation().distanceTo(DRAYNOR_CRYPT) > 6) {
                AccBuilderSotf.currentStatus = "Nav to stairs";

                if (Players.getLocal().getWorldLocation().distanceTo(PUB_LOCATION) <= 6
                    && Equipment.contains(TeleportItems.GLORY_AMULET)
                    && Players.getLocal().getAnimation() != -1) {
                    Equipment.getFirst(TeleportItems.GLORY_AMULET).interact("Draynor Village");
                    Time.sleepTicks(3);
                }

                Movement.walkTo(DRAYNOR_MANOR_STAIRS);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(DRAYNOR_MANOR_STAIRS) <= 4) {
                AccBuilderSotf.currentStatus = "Walking down stairs";
                TileObjects.getNearest("Stairs").interact("Walk-Down");
                Time.sleepTicks(3);
            }

            // Fight Count Draynor
            if (Players.getLocal().getWorldLocation().distanceTo(DRAYNOR_CRYPT) <= 6) {
                if (NPCs.getNearest("Count Draynor") == null) {
                    AccBuilderSotf.currentStatus = "Starting fight";

                    if (combatCounter < 1) {
                        ProfileHelper.incrementProfile();
                        combatCounter += 1;
                    }

                    TileObjects.getNearest("Coffin").interact("Open");
                    Time.sleepTicks(4);
                }

                var countDraynor = NPCs.getNearest("Count Draynor");
                if (countDraynor != null) {
                    AccBuilderSotf.currentStatus = "Fighting";

                    // Equip stake
                    if (!Equipment.contains(STAKE) && Inventory.contains(STAKE)) {
                        Inventory.getFirst(STAKE).interact("Wield");
                        Time.sleepTicks(1);
                    }

                    // Attack Count Draynor
                    if (Players.getLocal().getInteracting() == null && !countDraynor.isDead()) {
                        countDraynor.interact("Attack");
                        Time.sleepTicks(2);
                    }
                }
            }
        }

        // Break garlic after killing Count Draynor
        if (QuestHelper.getQuestVarbit(178) == 3
            && Players.getLocal().getWorldLocation().distanceTo(DRAYNOR_CRYPT) <= 6) {
            if (Inventory.contains(GARLIC)) {
                Inventory.getFirst(GARLIC).interact("Break");
                Time.sleepTicks(2);
            }
        }

        DialogueHelper.continueDialogue(new String[0]);
    }

    /**
     * Checks if player has required items in inventory
     */
    private static boolean hasRequiredItems() {
        return Inventory.contains("Beer")
            && Inventory.contains("Garlic")
            && Inventory.contains("Hammer");
    }

    /**
     * Checks if required items are in bank
     */
    private static boolean hasRequiredItemsInBank() {
        return Bank.contains(1917, 1550, 1549, 2347, 12163);
    }

    /**
     * Checks which items are missing and adds to shopping list
     */
    private static void checkMissingItems() {
        shoppingList.clear();

        if (!Bank.contains(1917)) {
            shoppingList.add(new ShoppingItem(1917, 1, 100));
        }
        if (!Bank.contains(1549)) {
            shoppingList.add(new ShoppingItem(1549, 1, 200));
        }
        if (!Bank.contains(1550)) {
            shoppingList.add(new ShoppingItem(1550, 1, 100));
        }
        if (!Bank.contains(2347)) {
            shoppingList.add(new ShoppingItem(2347, 1, 200));
        }
        if (!Bank.contains(12163)) {
            shoppingList.add(new ShoppingItem(12163, 20, 500));
        }
        if (!Bank.contains(11978)) {
            shoppingList.add(new ShoppingItem(11978, 1, 1500));
        }

        // Check for stamina potions
        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            shoppingList.add(new ShoppingItem(11980, 5, 13000));
        }

        // Check for food
        if (!Bank.contains(12163)) {
            shoppingList.add(new ShoppingItem(12163, 20, 2200));
        }

        // Check for teleports
        if (!Bank.contains(12082)) {
            shoppingList.add(new ShoppingItem(12082, 5, ShoppingHelper.DEFAULT_PRICE));
        }
    }

    /**
     * Withdraws quest items from bank
     */
    private static void withdrawQuestItems() {
        Bank.withdraw(1917, 1, Bank.WithdrawMode.DEFAULT);
        Time.sleepTicks(1);
        Bank.withdraw(1550, 1, Bank.WithdrawMode.DEFAULT);
        Time.sleepTicks(1);
        Bank.withdraw(1549, 1, Bank.WithdrawMode.DEFAULT);
        Time.sleepTicks(1);
        Bank.withdraw(2347, 5, Bank.WithdrawMode.DEFAULT);
        Time.sleepTicks(1);
        Bank.withdraw(12035, 1, Bank.WithdrawMode.DEFAULT);
        Time.sleepTicks(1);
        Bank.withdraw(12163, 1, Bank.WithdrawMode.DEFAULT);
        Time.sleepTicks(1);

        BankHelper.withdrawStaminaPotions(1);
        BankHelper.withdrawItem(12163, 4);
        BankHelper.withdrawTeleports(1);
    }
}
