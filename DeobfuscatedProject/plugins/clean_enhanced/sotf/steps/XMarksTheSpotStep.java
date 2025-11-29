package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;

import java.util.ArrayList;
import java.util.List;

/**
 * Quest step handler for X Marks the Spot quest in SOTF plugin.
 * This is the tutorial quest that all new accounts must complete.
 * Handles all aspects of the quest including:
 * - Banking and inventory management
 * - NPC dialogue with Veos
 * - Digging at multiple locations
 * - Opening the Ancient casket
 * - Choosing skill rewards from the Antique lamp
 */
public class XMarksTheSpotStep implements QuestStep {

    // Quest locations
    private static final WorldPoint VEOS_LOCATION = new WorldPoint(31933, 19899, 0);
    private static final WorldPoint DIG_LOCATION_1 = new WorldPoint(12439, 12825, 0);
    private static final WorldPoint DIG_LOCATION_2 = new WorldPoint(12889, 12809, 0);
    private static final WorldPoint DIG_LOCATION_3 = new WorldPoint(12823, 3802, 0);
    private static final WorldPoint DIG_LOCATION_4 = new WorldPoint(12557, 12751, 0);
    private static final WorldPoint VEOS_FINISH_LOCATION = new WorldPoint(3038, 3519, 0);

    // Quest dialogue options
    private static final String[] DIALOGUE_OPTIONS = new String[]{
        "Ok, I'm up for an adventure.",
        "A glass of your finest ale please.",
        "Morgan needs your help!",
        "Yes.",
        "I'm looking for a quest!",
        "Ok, let me help then.",
        "Father Aereck sent me to talk to you.",
        "He's got a ghost haunting his graveyard.",
        "Yep, now tell me what the problem is.",
        "Sure.",
        "I'm wearing an amulet of ghost speak!",
        "Yes, I'm sure.",
        "How can I help?",
        "I'm looking for a quest.",
        "Can I help?"
    };

    // Required quest items
    private static final int SPADE = 952;
    private static final int SMALL_SPADE = 13326;
    private static final int AMULET_OF_GLORY = -1; // Placeholder for glory variants
    private static final int RING_OF_WEALTH = -1; // Placeholder for wealth variants
    private static final int ANCIENT_CASKET = 23534;

    // State management
    public static boolean needsBuying = false;
    public static List<ShoppingItem> shoppingList = new ArrayList<>();
    public static long lastInteractionTime = 0;
    private static int teleportCounter = 0;
    private static int questCounter = 0;

    @Override
    public String getStepName() {
        return "X marks the spot quest";
    }

    @Override
    public boolean shouldExecute() {
        return false; // Managed by plugin
    }

    @Override
    public boolean isComplete() {
        // Quest is complete when we have the lamp and varbit is 10
        return Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) >= 8
            && !Inventory.contains(ANCIENT_CASKET);
    }

    @Override
    public int execute() {
        try {
            handleQuestStep();
        } catch (Exception e) {
            // Silently handle exceptions
        }
        return 100;
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

        if (needsBuying) {
            return;
        }

        // Use stamina potion if needed
        if (Inventory.contains(StaminaPotion.STAMINA_POTIONS) && Movement.getRunEnergy() < 135) {
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

        // Banking phase - only if quest hasn't started and we don't have required items
        if (!hasRequiredItems() && Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 0) {
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

                    // Check if we have required items in bank
                    int[] requiredItems = {952, 11978, 12082, 11980, 12163, 13326};
                    if (!Bank.contains(requiredItems)) {
                        checkMissingItems();
                        System.out.println("We are missing quest supplies, switching to BUYING");
                        needsBuying = true;
                        return;
                    }

                    // Check if we already have items
                    if (Bank.contains(requiredItems)) {
                        // Withdraw items
                        Bank.withdraw(11978, 28, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Bank.withdraw(13326, 1, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Bank.withdraw(11980, 28, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Bank.withdraw(11980, 28, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Bank.withdraw(952, 1, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);

                        BankHelper.withdrawStaminaPotions(4);
                        BankHelper.withdrawItem(12163, 28);
                        BankHelper.withdrawTeleports(1);
                    }
                }
            }
        }

        // Walk to Veos to start quest
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 0 && hasRequiredItems()) {
            if (Players.getLocal().getWorldLocation().distanceTo(VEOS_LOCATION) > 2) {
                AccBuilderSotf.currentStatus = "Nav to start";

                if (teleportCounter < 1) {
                    TeleportHelper.handleTeleport();
                    teleportCounter += 1;
                }

                Movement.walkTo(VEOS_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(VEOS_LOCATION) <= 2) {
                AccBuilderSotf.currentStatus = "Interact npc";

                // Initialize timer if needed
                if (lastInteractionTime == 0) {
                    lastInteractionTime = System.currentTimeMillis();
                }

                // Reset if stuck
                if (lastInteractionTime > 0 && TimeHelper.getTimeSince(lastInteractionTime) > 30000) {
                    teleportCounter = 0;
                    lastInteractionTime = System.currentTimeMillis();
                }

                if (teleportCounter < 1) {
                    TeleportHelper.handleTeleport();
                    teleportCounter += 1;
                }

                // Drop items if inventory full
                if (Inventory.isFull()) {
                    Inventory.getFirst(12163).interact("Drop");
                    Time.sleepTicks(2);
                }

                DialogueHelper.handleDialogue("Veos", DIALOGUE_OPTIONS, 1);
            }
        }

        // Talk to Veos after getting scroll (varbit 1)
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 1) {
            questCounter = 0;

            if (!Inventory.contains("Treasure scroll")) {
                DialogueHelper.continueDialogue(DIALOGUE_OPTIONS);
            }
        }

        // Equip amulet and ring, then dig at location 1 (varbit 2)
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 2) {
            // Equip amulet of glory
            if (Inventory.contains(item -> item.getName().contains("glory"))
                && !Equipment.contains(item -> item.getName().contains("glory"))) {
                Inventory.getFirst(item -> item.getName().contains("wealth")).interact("Wear");
            }

            // Equip ring of wealth
            if (Inventory.contains(item -> item.getName().contains("wealth"))
                && !Equipment.contains(item -> item.getName().contains("wealth"))) {
                Inventory.getFirst(item -> item.getName().contains("wealth")).interact("Wear");
            }

            // Navigate to dig location 1
            if (!Players.getLocal().getWorldLocation().equals(DIG_LOCATION_1)) {
                AccBuilderSotf.currentStatus = "Nav to dig 1";
                Movement.walkTo(DIG_LOCATION_1);
                Time.sleepTicks(1);
            }

            // Dig at location 1
            if (Players.getLocal().getWorldLocation().equals(DIG_LOCATION_1)) {
                Inventory.getFirst("Spade").interact("Dig");
                Time.sleepTicks(2);
            }
        }

        // Dig at location 2 (varbit 3)
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 3) {
            if (!Players.getLocal().getWorldLocation().equals(DIG_LOCATION_2)) {
                AccBuilderSotf.currentStatus = "Nav to dig 2";
                Movement.walkTo(DIG_LOCATION_2);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().equals(DIG_LOCATION_2)) {
                Inventory.getFirst("Spade").interact("Dig");
                Time.sleepTicks(2);
            }
        }

        // Dig at location 3 (varbit 4)
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 4) {
            if (!Players.getLocal().getWorldLocation().equals(DIG_LOCATION_3)) {
                AccBuilderSotf.currentStatus = "Nav to dig 3";
                Movement.walkTo(DIG_LOCATION_3);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().equals(DIG_LOCATION_3)) {
                Inventory.getFirst("Spade").interact("Dig");
                Time.sleepTicks(2);
            }
        }

        // Dig at location 4 (varbit 5)
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 5) {
            if (!Players.getLocal().getWorldLocation().equals(DIG_LOCATION_4)) {
                AccBuilderSotf.currentStatus = "Nav to dig 4";
                Movement.walkTo(DIG_LOCATION_4);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().equals(DIG_LOCATION_4)) {
                Inventory.getFirst("Spade").interact("Dig");
                Time.sleepTicks(2);
            }
        }

        // Return to Veos to finish quest (varbit 6)
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 6) {
            if (Players.getLocal().getWorldLocation().distanceTo(VEOS_FINISH_LOCATION) > 3) {
                AccBuilderSotf.currentStatus = "Nav to veos finish";
                Movement.walkTo(VEOS_FINISH_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(VEOS_FINISH_LOCATION) <= 3) {
                AccBuilderSotf.currentStatus = "Interact npc";

                if (questCounter < 1) {
                    ProfileHelper.incrementProfile();
                    questCounter += 1;
                }

                DialogueHelper.handleDialogue("Veos", DIALOGUE_OPTIONS);
            }
        }

        // Talk to Veos to continue (varbit 10)
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 10) {
            DialogueHelper.continueDialogue(DIALOGUE_OPTIONS);
        }

        // Handle ancient casket lamp reward
        if (Inventory.contains(ANCIENT_CASKET)) {
            if (Widgets.get(219) != null) {
                AccBuilderSotf.currentStatus = "Rubbing lamp";
                Inventory.getFirst(ANCIENT_CASKET).interact("Rub");
                Time.sleepTicks(4);

                AccBuilderSotf.currentStatus = "Selecting slayer";
                Widget slayerWidget = Widgets.get(219, 16);
                if (slayerWidget != null) {
                    slayerWidget.interact("Slayer");
                    Time.sleepTicks(1);
                }

                Widget confirmWidget = Widgets.get(219, 26);
                if (confirmWidget != null) {
                    confirmWidget.interact("Confirm");
                    Time.sleepTicks(2);
                }
            }

            Time.sleepTicks(1);
        }

        DialogueHelper.continueDialogue(new String[0]);
    }

    /**
     * Checks if player has required items in inventory
     */
    private static boolean hasRequiredItems() {
        return Inventory.contains("Spade") && Inventory.contains(12163);
    }

    /**
     * Checks which items are missing and adds to shopping list
     */
    private static void checkMissingItems() {
        shoppingList.clear();

        if (!Bank.contains(952)) {
            shoppingList.add(new ShoppingItem(952, 1, 15600));
        }
        if (!Bank.contains(13326)) {
            shoppingList.add(new ShoppingItem(13326, 1, 23000));
        }
        if (!Bank.contains(12163)) {
            shoppingList.add(new ShoppingItem(12163, 50, 20000));
        }

        // Check for ring of wealth
        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            shoppingList.add(new ShoppingItem(11980, 5, 13000));
        }

        if (!Bank.contains(11978)) {
            shoppingList.add(new ShoppingItem(11978, 28, 8000));
        }

        if (!Bank.contains(12082)) {
            shoppingList.add(new ShoppingItem(12082, 28, ShoppingHelper.DEFAULT_PRICE));
        }
    }
}
