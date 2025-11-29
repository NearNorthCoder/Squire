package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
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
import java.util.function.Predicate;

/**
 * Quest step handler for The Restless Ghost quest.
 * Handles amulet acquisition, skull retrieval, and ghost dialogue.
 */
public class RestlessGhostQuestStep implements QuestStep {

    // Item IDs
    public static final int GHOSTSPEAK_AMULET = 552;
    public static final int LOBSTER = 379;
    public static final int BREAD = 2309;
    public static final int STAMINA_POTION_4 = 12625;
    public static final int TROUT = 333;

    // Locations
    public static final WorldPoint FATHER_AERECK_LOCATION = new WorldPoint(3243, 3207, 0);
    public static final WorldPoint FATHER_URHNEY_LOCATION = new WorldPoint(3147, 3175, 0);
    public static final WorldPoint LUMBRIDGE_GRAVEYARD = new WorldPoint(3249, 3195, 0);
    public static final WorldPoint WIZARDS_TOWER_ALTAR = new WorldPoint(3121, 3162, 0);

    // Quest progression tracking
    public static List<ItemToBuy> itemsToBuy = new ArrayList<>();
    public static boolean shouldBuyItems = false;
    private static int dialogAttempts = 0;
    private static boolean questStarted = false;
    private static int navigationAttempts = 0;

    // Dialog options
    public static final String[] QUEST_DIALOG = new String[]{
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
        "How can I help?"
    };

    @Override
    public String getQuestName() {
        return "Restless ghost quest";
    }

    @Override
    public boolean isComplete() {
        return false;
    }

    @Override
    public boolean shouldExecute() {
        return QuestVarbits.getQuestVarbit(107) >= 5;
    }

    @Override
    public int execute() {
        try {
            handleQuestStep();
        } catch (Exception e) {
            // Silently handle errors
        }
        return 100;
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

            // Handle food consumption
            if (QuestVarbits.getCurrentHealth() < 70.0) {
                if (Inventory.contains(LOBSTER)) {
                    Inventory.getFirst(LOBSTER).interact("Eat");
                }
            }

            // Enable run if disabled
            if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 0) {
                Movement.toggleRun();
            }

            // Check if we have all quest items
            if (!hasAllQuestItems() && QuestVarbits.getQuestVarbit(107) < 1) {
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
                        Time.sleepUntil(() -> Bank.isOpen(), 15289);
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

                        int[] requiredItems = {GHOSTSPEAK_AMULET, TROUT, BREAD, STAMINA_POTION_4, LOBSTER};
                        if (!QuestVarbits.hasAllItems(requiredItems)) {
                            createBuyList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            shouldBuyItems = true;
                            return;
                        }

                        // Withdraw quest items
                        Bank.withdraw(TROUT, 10, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Bank.withdraw(STAMINA_POTION_4, 5, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Bank.withdraw(GHOSTSPEAK_AMULET, 1, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        BankHelper.withdrawStaminaPotion(1);
                        BankHelper.withdrawItem(LOBSTER, 10);
                        BankHelper.withdrawStaminaPotion(1);
                    }
                }
            }

            // Quest stage progression
            handleQuestStages();

            DialogHandler.handleDialog(new String[0]);
        }
    }

    /**
     * Handles different quest stages based on varbit values.
     */
    private static void handleQuestStages() {
        // Stage 0: Start quest with Father Aereck
        if (!hasAllQuestItems() && QuestVarbits.getQuestVarbit(107) < 1) {
            WorldArea lumbridgeArea = new WorldArea(3203, 3206, 8, 9, 0);
            NPC fatherAereck = NPCs.getNearest("Father Aereck");

            if (fatherAereck == null
                && Players.getLocal().getWorldLocation().distanceTo(FATHER_AERECK_LOCATION) > 3
                && !AccBuilderSotf.hasCompletedQuest) {
                AccBuilderSotf.currentAction = "Nav to start";

                if (dialogAttempts < 1) {
                    QuestVarbits.handleCombat();
                    dialogAttempts += 1;
                }

                Movement.walkTo(FATHER_AERECK_LOCATION);
                Time.sleepTicks(1);
            }

            if (fatherAereck != null) {
                AccBuilderSotf.currentAction = "Starting quest";
                DialogHandler.handleDialog("Father Aereck", QUEST_DIALOG, 1);
            }
        }

        // Stage 1: Get amulet from Father Urhney
        if (QuestVarbits.getQuestVarbit(107) == 1) {
            if (Players.getLocal().getWorldLocation().distanceTo(FATHER_URHNEY_LOCATION) > 7) {
                AccBuilderSotf.currentAction = "Nav to necklace guy";
                Movement.walkTo(FATHER_URHNEY_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(FATHER_URHNEY_LOCATION) <= 7) {
                AccBuilderSotf.currentAction = "Interacting npc";

                var door = TileObjects.getNearest("Door");
                if (door != null) {
                    if (door.hasAction("Open")) {
                        door.interact("Open");
                        Time.sleepTicks(5);
                    }
                }

                DialogHandler.handleDialog("Father Urhney", QUEST_DIALOG);
            }
        }

        // Stage 2: Wear amulet and search coffin
        if (QuestVarbits.getQuestVarbit(107) == 2) {
            if (Players.getLocal().getWorldLocation().distanceTo(LUMBRIDGE_GRAVEYARD) > 2) {
                if (Inventory.contains(GHOSTSPEAK_AMULET)) {
                    Inventory.getFirst(GHOSTSPEAK_AMULET).interact("Wear");
                    Time.sleepTicks(1);
                }

                AccBuilderSotf.currentAction = "Nav to coffin";
                Movement.walkTo(LUMBRIDGE_GRAVEYARD);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(LUMBRIDGE_GRAVEYARD) <= 2) {
                AccBuilderSotf.currentAction = "Handling coffin";

                NPC restlessGhost = NPCs.getNearest("Restless ghost");
                if (restlessGhost != null) {
                    DialogHandler.handleDialog("Restless ghost", QUEST_DIALOG);
                }

                if (restlessGhost == null) {
                    TileObjects.getNearest("Coffin").interact("Open");
                    Time.sleepTicks(2);
                }
            }
        }

        // Stage 3: Get skull from Wizards Tower
        if (QuestVarbits.getQuestVarbit(107) == 3) {
            if (Players.getLocal().getWorldLocation().distanceTo(WIZARDS_TOWER_ALTAR) > 3) {
                AccBuilderSotf.currentAction = "Nav to skull";
                Movement.walkTo(WIZARDS_TOWER_ALTAR);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(WIZARDS_TOWER_ALTAR) <= 3) {
                AccBuilderSotf.currentAction = "Getting skull";

                var altar = TileObjects.getNearest("Altar");
                if (altar != null) {
                    altar.interact("Search");
                }
            }
        }

        // Stage 4: Return skull to coffin
        if (QuestVarbits.getQuestVarbit(107) == 4) {
            if (Players.getLocal().getWorldLocation().distanceTo(LUMBRIDGE_GRAVEYARD) > 2) {
                if (Inventory.contains(GHOSTSPEAK_AMULET)) {
                    Inventory.getFirst(GHOSTSPEAK_AMULET).interact("Wear");
                    Time.sleepTicks(1);
                }

                AccBuilderSotf.currentAction = "Nav to coffin";
                Movement.walkTo(LUMBRIDGE_GRAVEYARD);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(LUMBRIDGE_GRAVEYARD) <= 2) {
                AccBuilderSotf.currentAction = "Handling coffin";

                var coffin = TileObjects.getNearest("Coffin");
                if (coffin != null) {
                    if (coffin.hasAction("Open")) {
                        coffin.interact("Open");
                        Time.sleepTicks(2);
                    }

                    var skull = Inventory.getFirst("Ghost's skull");
                    if (skull != null) {
                        if (dialogAttempts < 1) {
                            PlayerStats.incrementTotalXP();
                            PlayerStats.saveStats(AccBuilderSotf.currentAccount);
                            dialogAttempts += 1;
                            PlayerStats.resetTotalXP();
                            questStarted = false;
                        }

                        skull.useOn(coffin);
                        Time.sleepTicks(3);
                    }
                }
            }

            DialogHandler.handleDialog(QUEST_DIALOG);
        }
    }

    /**
     * Checks if the player has all required quest items.
     */
    private static boolean hasAllQuestItems() {
        return Inventory.contains(TROUT)
            && (!Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)
                || Equipment.contains(StaminaPotionIds.STAMINA_POTIONS))
            && Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)
            && Inventory.contains(STAMINA_POTION_4)
            && Inventory.contains(LOBSTER);
    }

    /**
     * Creates a list of items to buy from the Grand Exchange.
     */
    private static void createBuyList() {
        if (!Bank.contains(GHOSTSPEAK_AMULET)) {
            itemsToBuy.add(new ItemToBuy(GHOSTSPEAK_AMULET, 1, 32759));
        }
        if (!Bank.contains(LOBSTER)) {
            itemsToBuy.add(new ItemToBuy(LOBSTER, 10, 20559));
        }

        Predicate<net.runelite.api.Item> ringOfWealthPredicate = item ->
            item.getName().toLowerCase().contains("ring of wealth (");
        if (!Bank.contains(ringOfWealthPredicate)) {
            itemsToBuy.add(new ItemToBuy(12157, 5, 31663));
        }

        if (!Bank.contains(TROUT)) {
            itemsToBuy.add(new ItemToBuy(TROUT, 10, 20560));
        }
        if (!Bank.contains(STAMINA_POTION_4)) {
            itemsToBuy.add(new ItemToBuy(STAMINA_POTION_4, 14, 20560));
        }
        if (!Bank.contains(BREAD)) {
            itemsToBuy.add(new ItemToBuy(BREAD, 5, GEPriceHelper.COMMON_PRICE));
        }
    }
}
