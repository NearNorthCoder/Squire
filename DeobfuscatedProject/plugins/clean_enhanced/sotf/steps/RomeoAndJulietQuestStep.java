package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Quest step handler for Romeo & Juliet quest.
 * Handles message delivery between Romeo, Juliet, Father Lawrence, and the Apothecary.
 */
public class RomeoAndJulietQuestStep implements QuestStep {

    // Item IDs
    public static final int BERRIES = 753;
    public static final int CADAVA_BERRIES = 753;

    // Locations
    public static final WorldPoint ROMEO_LOCATION = new WorldPoint(3211, 3422, 0);
    public static final WorldPoint JULIET_LOCATION = new WorldPoint(3157, 3426, 1);
    public static final WorldPoint FATHER_LAWRENCE_LOCATION = new WorldPoint(3255, 3483, 0);
    public static final WorldPoint APOTHECARY_LOCATION = new WorldPoint(3195, 3404, 0);

    // Quest progression tracking
    public static List<ItemToBuy> itemsToBuy = new ArrayList<>();
    public static boolean shouldBuyItems = false;
    private static int dialogAttempts = 0;
    private static boolean questStarted = false;
    private static int navigationAttempts = 0;

    // Dialog options
    public static final String[] QUEST_DIALOG = new String[]{
        "Yes, I have seen her actually!",
        "Yes, ok, I'll let her know.",
        "Ok, thanks.",
        "Talk about something else.",
        "Talk about Romeo & Juliet.",
        "Ok, thanks.",
        "Yes."
    };

    @Override
    public String getQuestName() {
        return "Romeo & Juliet quest";
    }

    @Override
    public boolean isComplete() {
        return false;
    }

    @Override
    public boolean shouldExecute() {
        return QuestVarbits.getQuestVarbit(144) >= 100;
    }

    @Override
    public int execute() {
        try {
            handleQuestStep();
        } catch (Exception e) {
            // Silently handle errors
        }
        return 53;
    }

    /**
     * Main quest step handler.
     */
    public static void handleQuestStep() {
        // Handle item buying
        if (shouldBuyItems) {
            AccBuilderSotf.currentAction = "Buying items";
            ItemBuyer.buyItems(itemsToBuy);
            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                shouldBuyItems = false;
            }
        }

        if (!shouldBuyItems) {
            // Handle stamina potion
            if (Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)
                && Movement.getRunEnergy() < 50) {
                Inventory.getFirst(StaminaPotionIds.STAMINA_POTIONS).interact("Drink");
                Time.sleepTicks(1);
            }

            // Enable run if disabled
            if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 0) {
                Movement.toggleRun();
            }

            // Check if we have cadava berries
            if (!hasQuestItem() && QuestVarbits.getQuestVarbit(144) < 1) {
                BankLocation nearestBank = BankLocation.getNearest();

                // Navigate to bank
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.currentAction = "Nav to bank";
                    BankHelper.walkToBank(nearestBank);
                    Time.sleepTicks(2);
                }

                // Handle banking
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.currentAction = "Handling banking";

                    if (!Bank.isOpen()) {
                        BankHelper.openBank();
                        Time.sleepUntil(() -> Bank.isOpen(), 7995);
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

                        if (!QuestVarbits.hasItem(CADAVA_BERRIES)) {
                            createBuyList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            shouldBuyItems = true;
                            return;
                        }

                        if (QuestVarbits.hasItem(CADAVA_BERRIES)) {
                            BankHelper.withdrawItem(CADAVA_BERRIES, 1);
                            BankHelper.withdrawStaminaPotion(2);
                            BankHelper.withdrawItem(BERRIES, 6);
                            BankHelper.withdrawStaminaPotion(1);
                        }
                    }
                }
            }

            // Handle quest stages
            handleQuestStages();

            DialogHandler.handleDialog(QUEST_DIALOG);
        }

        System.out.println("Setting: " + QuestVarbits.getQuestVarbit(144));
    }

    /**
     * Handles different quest stages based on varbit values.
     */
    private static void handleQuestStages() {
        // Stage 0: Talk to Romeo
        if (hasQuestItem() && QuestVarbits.getQuestVarbit(144) < 1) {
            if (Players.getLocal().getWorldLocation().distanceTo(ROMEO_LOCATION) > 8) {
                AccBuilderSotf.currentAction = "Nav to romeo";

                if (dialogAttempts < 1) {
                    QuestVarbits.handleCombat();
                    dialogAttempts += 1;
                }

                Movement.walkTo(ROMEO_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(ROMEO_LOCATION) <= 8) {
                AccBuilderSotf.currentAction = "Starting quest";
                DialogHandler.handleDialog("Romeo", QUEST_DIALOG);
            }
        }

        // Stage 2: Talk to Juliet
        if (QuestVarbits.getQuestVarbit(144) == 2) {
            if (Players.getLocal().getWorldLocation().distanceTo(JULIET_LOCATION) > 2) {
                if (Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)
                    && !Equipment.contains(StaminaPotionIds.STAMINA_POTIONS)) {
                    Inventory.getFirst(StaminaPotionIds.STAMINA_POTIONS).interact("Wear");
                    Time.sleepTicks(1);
                }

                AccBuilderSotf.currentAction = "Nav to juliet";
                Movement.walkTo(JULIET_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(JULIET_LOCATION) <= 2) {
                AccBuilderSotf.currentAction = "Talk to juliet";

                var door = TileObjects.getNearest(tileObject ->
                    tileObject.getName().contains("Door")
                    && tileObject.getWorldLocation().distanceTo(new WorldPoint(20038, 20551, 1)) <= 2
                    && tileObject.hasAction("Open"));

                if (door != null) {
                    door.interact("Open");
                    Time.sleepTicks(3);
                }

                DialogHandler.handleDialog("Juliet", QUEST_DIALOG);
            }
        }

        // Stage 10: Return to Romeo
        if (QuestVarbits.getQuestVarbit(144) == 10) {
            if (Players.getLocal().getWorldLocation().distanceTo(ROMEO_LOCATION) > 8) {
                AccBuilderSotf.currentAction = "Nav to romeo";
                Movement.walkTo(ROMEO_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(ROMEO_LOCATION) <= 8) {
                AccBuilderSotf.currentAction = "Starting quest";
                DialogHandler.handleDialog("Romeo", QUEST_DIALOG);
            }
        }

        // Stage 20: Talk to Father Lawrence
        if (QuestVarbits.getQuestVarbit(144) == 20) {
            if (Players.getLocal().getWorldLocation().distanceTo(FATHER_LAWRENCE_LOCATION) > 6) {
                AccBuilderSotf.currentAction = "Nav to father";
                Movement.walkTo(FATHER_LAWRENCE_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(FATHER_LAWRENCE_LOCATION) <= 6) {
                AccBuilderSotf.currentAction = "talk father";
                DialogHandler.handleDialog("Father Lawrence", QUEST_DIALOG);
            }

            DialogHandler.handleDialog(QUEST_DIALOG);
        }

        // Stage 30: Talk to Apothecary
        if (QuestVarbits.getQuestVarbit(144) == 30) {
            if (!hasQuestItem()) {
                handleBankingForCadavaBerries();
            }

            if (hasQuestItem()) {
                if (Players.getLocal().getWorldLocation().distanceTo(APOTHECARY_LOCATION) > 6) {
                    AccBuilderSotf.currentAction = "Nav to potion guy";
                    Movement.walkTo(APOTHECARY_LOCATION);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(APOTHECARY_LOCATION) <= 6) {
                    AccBuilderSotf.currentAction = "talk potions";
                    DialogHandler.handleDialog("Apothecary", QUEST_DIALOG);
                }
            }
        }

        // Stage 40: Return cadava potion to Juliet
        if (QuestVarbits.getQuestVarbit(144) == 40) {
            if (!Inventory.contains("Cadava potion")
                && Players.getLocal().getWorldLocation().distanceTo(APOTHECARY_LOCATION) > 6) {
                if (!hasQuestItem()) {
                    handleBankingForCadavaBerries();
                }

                if (hasQuestItem() && Players.getLocal().getWorldLocation().distanceTo(APOTHECARY_LOCATION) > 6) {
                    AccBuilderSotf.currentAction = "Nav to potion guy";
                    Movement.walkTo(APOTHECARY_LOCATION);
                    Time.sleepTicks(1);
                }
            }
        }

        if (QuestVarbits.getQuestVarbit(144) == 40) {
            if (!Inventory.contains("Cadava potion")
                && Players.getLocal().getWorldLocation().distanceTo(APOTHECARY_LOCATION) <= 6) {
                navigationAttempts = 0;
                AccBuilderSotf.currentAction = "Cadava potion";
                DialogHandler.handleDialog("Apothecary", QUEST_DIALOG);
            }
        }

        if (QuestVarbits.getQuestVarbit(144) == 40) {
            if (Inventory.contains("Cadava potion")) {
                if (Players.getLocal().getWorldLocation().distanceTo(JULIET_LOCATION) > 2) {
                    if (Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)
                        && !Equipment.contains(StaminaPotionIds.STAMINA_POTIONS)) {
                        Inventory.getFirst(StaminaPotionIds.STAMINA_POTIONS).interact("Wear");
                        Time.sleepTicks(1);
                    }

                    AccBuilderSotf.currentAction = "Nav to juliet";
                    Movement.walkTo(JULIET_LOCATION);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(JULIET_LOCATION) <= 2) {
                    AccBuilderSotf.currentAction = "Talk to juliet";

                    var door = TileObjects.getNearest(tileObject ->
                        tileObject.getName().contains("Door")
                        && tileObject.getWorldLocation().distanceTo(new WorldPoint(20038, 20551, 1)) <= 2
                        && tileObject.hasAction("Open"));

                    if (door != null) {
                        door.interact("Open");
                        Time.sleepTicks(3);
                    }

                    DialogHandler.handleDialog("Juliet", QUEST_DIALOG);
                }

                DialogHandler.handleDialog(QUEST_DIALOG);
            }
        }

        // Final stage: Complete quest with Romeo
        if (QuestVarbits.getQuestVarbit(144) == 60) {
            if (Players.getLocal().getWorldLocation().distanceTo(ROMEO_LOCATION) > 8
                && !Dialog.isOpen()) {
                AccBuilderSotf.currentAction = "Nav to romeo";
                Movement.walkTo(ROMEO_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(ROMEO_LOCATION) <= 8) {
                AccBuilderSotf.currentAction = "Finishing quest";

                if (dialogAttempts < 1) {
                    PlayerStats.incrementTotalXP();
                    PlayerStats.saveStats(AccBuilderSotf.currentAccount);
                    dialogAttempts += 1;
                    PlayerStats.resetTotalXP();
                    questStarted = false;
                }

                DialogHandler.handleDialog("Romeo", QUEST_DIALOG);
                Time.sleepTicks(6);
            }
        }

        DialogHandler.handleDialog(QUEST_DIALOG);
    }

    /**
     * Handles banking to get cadava berries for potion.
     */
    private static void handleBankingForCadavaBerries() {
        BankLocation nearestBank = BankLocation.getNearest();

        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentAction = "Nav to bank";
            BankHelper.walkToBank(nearestBank);
            Time.sleepTicks(2);
        }

        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentAction = "Handling banking";

            if (!Bank.isOpen()) {
                BankHelper.openBank();
                Time.sleepUntil(() -> Bank.isOpen(), 7995);
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

                if (!QuestVarbits.hasItem(CADAVA_BERRIES)) {
                    createBuyList();
                    System.out.println("We are missing quest supplies, switching to BUYING");
                    shouldBuyItems = true;
                    return;
                }

                if (QuestVarbits.hasItem(CADAVA_BERRIES)) {
                    BankHelper.withdrawItem(CADAVA_BERRIES, 1);
                    BankHelper.withdrawStaminaPotion(2);
                    BankHelper.withdrawItem(BERRIES, 6);
                    BankHelper.withdrawStaminaPotion(1);
                }
            }
        }
    }

    /**
     * Checks if the player has the cadava berries quest item.
     */
    private static boolean hasQuestItem() {
        return Inventory.contains(CADAVA_BERRIES);
    }

    /**
     * Creates a list of items to buy from the Grand Exchange.
     */
    private static void createBuyList() {
        if (!Bank.contains(BERRIES)) {
            itemsToBuy.add(new ItemToBuy(BERRIES, 6, GEPriceHelper.COMMON_PRICE));
        }
        if (!Bank.contains(CADAVA_BERRIES)) {
            itemsToBuy.add(new ItemToBuy(CADAVA_BERRIES, 1, 30719));
        }

        Predicate<net.runelite.api.Item> ringOfWealthPredicate = item ->
            item.getName().toLowerCase().contains("ring of wealth (");
        if (!Bank.contains(ringOfWealthPredicate)) {
            itemsToBuy.add(new ItemToBuy(28542, 6, 25272));
        }

        if (!Bank.contains(16359)) {
            itemsToBuy.add(new ItemToBuy(16359, 54, 28126));
        }
    }
}
