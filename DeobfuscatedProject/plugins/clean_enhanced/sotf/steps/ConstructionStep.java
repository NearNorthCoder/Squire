package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

import java.util.ArrayList;
import java.util.List;

/**
 * Training step handler for Construction skill in SOTF plugin.
 * Handles construction training from level 1 to 50+, including:
 * - Purchasing and setting up player-owned house
 * - Building rooms (kitchen, dining room)
 * - Creating furniture (chairs, tables, larders)
 * - Managing resources (planks, nails, tools)
 * - Efficient training methods at different level ranges
 */
public class ConstructionStep implements QuestStep {

    // Locations
    public static final WorldPoint HOUSE_PORTAL_LOCATION = new WorldPoint(0, 0, 0);
    public static final int HOUSE_VARBIT = 0; // Placeholder

    // Item IDs
    private static final int SAW = 8794;
    private static final int HAMMER = 2347;
    private static final int PLANK = 960;
    private static final int OAK_PLANK = 8778;
    private static final int IRON_NAILS = 4819;
    private static final int STEEL_NAILS = 1539;
    private static final int HOUSE_TELEPORT = 8013;

    // Quest dialogue options
    private static final String[] DIALOGUE_OPTIONS = new String[]{
        "How can I get a house?",
        "Yes please!"
    };

    // Widget IDs for construction interface
    private static final int CONSTRUCTION_WIDGET = 458;
    private static final int BUILD_WIDGET = 458;

    // State management
    public static boolean needsBuying = false;
    public static List<ShoppingItem> shoppingList = new ArrayList<>();

    // Construction targets
    private static final int LEVEL_WOODEN_CHAIR = 1;
    private static final int LEVEL_WOOD_LARDER = 8;
    private static final int LEVEL_OAK_TABLE = 22;
    private static final int LEVEL_OAK_LARDER = 33;
    private static final int TARGET_CONSTRUCTION_LEVEL = 50;

    @Override
    public String getStepName() {
        return "Construction";
    }

    @Override
    public boolean shouldExecute() {
        return false; // Managed by plugin
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.CONSTRUCTION) >= TARGET_CONSTRUCTION_LEVEL;
    }

    @Override
    public int execute() {
        handleConstruction();
        return 100;
    }

    /**
     * Main construction handler
     */
    public static void handleConstruction() {
        // Handle shopping mode
        if (needsBuying) {
            AccBuilderSotf.currentStatus = "Buying items";
            ShoppingHelper.buyItems(shoppingList);
            if (shoppingList.size() < 1) {
                System.out.println("Finished buying items, switching back to construction");
                needsBuying = false;
            }
        }

        if (needsBuying || Skills.getLevel(Skill.CONSTRUCTION) >= TARGET_CONSTRUCTION_LEVEL) {
            return;
        }

        // Check if player has a house
        if (!hasHouse()) {
            purchaseHouse();
            return;
        }

        // Banking phase
        if (!hasRequiredItems()) {
            handleBanking();
            return;
        }

        // Build rooms if needed
        if (needsRooms()) {
            buildRooms();
            return;
        }

        // Train construction
        trainConstruction();
    }

    /**
     * Checks if player owns a house
     */
    private static boolean hasHouse() {
        return Vars.getBit(HOUSE_VARBIT) > 0;
    }

    /**
     * Purchases a house from the estate agent
     */
    private static void purchaseHouse() {
        WorldPoint estateAgentLocation = new WorldPoint(12086, 12697, 0);

        if (Players.getLocal().getWorldLocation().distanceTo(estateAgentLocation) > 3) {
            AccBuilderSotf.currentStatus = "Nav to house guy";
            Movement.walkTo(estateAgentLocation);
            Time.sleepTicks(1);
        }

        if (Players.getLocal().getWorldLocation().distanceTo(estateAgentLocation) <= 3) {
            AccBuilderSotf.currentStatus = "Buy house";

            // Equip ring of dueling for teleport
            if (!Equipment.contains(item -> item.getName().contains("ring of dueling"))
                && Inventory.contains(item -> item.getName().contains("ring of dueling"))) {
                Inventory.getFirst(item -> item.getName().contains("ring of dueling"))
                    .interact("Wear");
                Time.sleepTicks(1);
            }

            DialogueHelper.handleDialogue("Estate agent", DIALOGUE_OPTIONS);
        }
    }

    /**
     * Handles banking for construction supplies
     */
    private static void handleBanking() {
        BankLocation bank = BankLocation.getNearest();

        if (bank != null && !bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentStatus = "Navigating to bank";
            NavigationHelper.walkTo(bank);
        }

        if (bank != null && bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentStatus = "Handling banking";

            if (!Bank.isOpen()) {
                BankHelper.openBank();
                Time.sleepUntil(() -> Bank.isOpen(), 3000);
            }

            if (Bank.isOpen()) {
                // Deposit inventory and equipment
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                }

                if (Equipment.getAll().size() > 0) {
                    Bank.depositEquipment();
                    Time.sleepTicks(2);
                }

                // Check if we have required items in bank
                if (!hasRequiredItemsInBank()) {
                    checkMissingItems();
                    System.out.println("We are missing supplies, switching to BUYING");
                    needsBuying = true;
                    return;
                }

                // Withdraw construction supplies based on level
                withdrawConstructionSupplies();
            }
        }
    }

    /**
     * Withdraws construction supplies from bank based on current level
     */
    private static void withdrawConstructionSupplies() {
        int currentLevel = Skills.getLevel(Skill.CONSTRUCTION);

        // Always withdraw saw and hammer
        if (!Inventory.contains(SAW)) {
            Bank.withdraw(SAW, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(1);
        }

        if (!Inventory.contains(HAMMER)) {
            Bank.withdraw(HAMMER, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(1);
        }

        // Withdraw planks based on level
        if (currentLevel < LEVEL_WOOD_LARDER) {
            // Wooden chairs (level 1-8)
            withdrawPlanks(PLANK, 28);
            withdrawNails(IRON_NAILS, 28);
        } else if (currentLevel < LEVEL_OAK_TABLE) {
            // Wood larders (level 8-22)
            withdrawPlanks(PLANK, 28);
            withdrawNails(IRON_NAILS, 28);
        } else if (currentLevel < LEVEL_OAK_LARDER) {
            // Oak tables (level 22-33)
            withdrawPlanks(OAK_PLANK, 28);
        } else {
            // Oak larders (level 33+)
            withdrawPlanks(OAK_PLANK, 28);
        }

        // Withdraw house teleport tablets
        if (!Inventory.contains(HOUSE_TELEPORT)) {
            Bank.withdraw(HOUSE_TELEPORT, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(1);
        }
    }

    /**
     * Withdraws planks from bank
     */
    private static void withdrawPlanks(int plankId, int amount) {
        if (Bank.contains(plankId)) {
            Bank.withdraw(plankId, amount, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(1);
        }
    }

    /**
     * Withdraws nails from bank
     */
    private static void withdrawNails(int nailId, int amount) {
        if (Bank.contains(nailId)) {
            Bank.withdraw(nailId, amount, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(1);
        }
    }

    /**
     * Checks if player needs to build rooms
     */
    private static boolean needsRooms() {
        // Check if kitchen or dining room is missing
        return false; // Placeholder - would check house configuration
    }

    /**
     * Builds required rooms (kitchen and dining room)
     */
    private static void buildRooms() {
        AccBuilderSotf.currentStatus = "Building rooms";

        // Enter build mode
        if (!isInBuildMode()) {
            enterBuildMode();
        }

        // Build kitchen
        if (!hasKitchen()) {
            buildKitchen();
        }

        // Build dining room
        if (!hasDiningRoom()) {
            buildDiningRoom();
        }
    }

    /**
     * Trains construction by building furniture
     */
    private static void trainConstruction() {
        // Teleport to house if needed
        if (!isInHouse()) {
            teleportToHouse();
            return;
        }

        // Enter build mode if needed
        if (!isInBuildMode()) {
            enterBuildMode();
            return;
        }

        AccBuilderSotf.currentStatus = "Training construction";

        int currentLevel = Skills.getLevel(Skill.CONSTRUCTION);

        if (currentLevel < LEVEL_WOOD_LARDER) {
            buildWoodenChairs();
        } else if (currentLevel < LEVEL_OAK_TABLE) {
            buildWoodLarders();
        } else if (currentLevel < LEVEL_OAK_LARDER) {
            buildOakTables();
        } else {
            buildOakLarders();
        }
    }

    /**
     * Builds wooden chairs (level 1-8)
     */
    private static void buildWoodenChairs() {
        AccBuilderSotf.currentStatus = "Building chair";

        // Check if we're out of materials
        if (!Inventory.contains(PLANK)) {
            handleBanking();
            return;
        }

        // Find chair hotspot
        var chairHotspot = TileObjects.getNearest("Chair space");
        if (chairHotspot != null) {
            chairHotspot.interact("Build");
            Time.sleepTicks(2);

            // Select wooden chair option
            Widget buildWidget = Widgets.get(BUILD_WIDGET, 0);
            if (buildWidget != null) {
                Mouse.click(buildWidget.getBounds());
                Time.sleepTicks(2);
            }
        }

        // Remove the chair after building to repeat
        var chair = TileObjects.getNearest("Wooden chair");
        if (chair != null) {
            AccBuilderSotf.currentStatus = "Removing";
            chair.interact("Remove");
            Time.sleepTicks(2);

            // Confirm removal
            Dialog.chooseOption("Yes");
            Time.sleepTicks(2);
        }
    }

    /**
     * Builds wood larders (level 8-22)
     */
    private static void buildWoodLarders() {
        AccBuilderSotf.currentStatus = "Building wood larder";

        if (!Inventory.contains(PLANK)) {
            handleBanking();
            return;
        }

        var larderHotspot = TileObjects.getNearest("Larder space");
        if (larderHotspot != null) {
            larderHotspot.interact("Build");
            Time.sleepTicks(2);

            Widget buildWidget = Widgets.get(BUILD_WIDGET, 0);
            if (buildWidget != null) {
                Mouse.click(buildWidget.getBounds());
                Time.sleepTicks(2);
            }
        }

        var larder = TileObjects.getNearest("Wooden larder");
        if (larder != null) {
            AccBuilderSotf.currentStatus = "Removing";
            larder.interact("Remove");
            Time.sleepTicks(2);
            Dialog.chooseOption("Yes");
            Time.sleepTicks(2);
        }
    }

    /**
     * Builds oak tables (level 22-33)
     */
    private static void buildOakTables() {
        AccBuilderSotf.currentStatus = "Build oak table";

        if (!Inventory.contains(OAK_PLANK)) {
            handleBanking();
            return;
        }

        var tableHotspot = TileObjects.getNearest("Table space");
        if (tableHotspot != null) {
            tableHotspot.interact("Build");
            Time.sleepTicks(2);

            Widget buildWidget = Widgets.get(BUILD_WIDGET, 0);
            if (buildWidget != null) {
                Mouse.click(buildWidget.getBounds());
                Time.sleepTicks(2);
            }
        }

        var table = TileObjects.getNearest("Oak table");
        if (table != null) {
            AccBuilderSotf.currentStatus = "Removing";
            table.interact("Remove");
            Time.sleepTicks(2);
            Dialog.chooseOption("Yes");
            Time.sleepTicks(2);
        }
    }

    /**
     * Builds oak larders (level 33+)
     */
    private static void buildOakLarders() {
        AccBuilderSotf.currentStatus = "Build oak larder";

        if (!Inventory.contains(OAK_PLANK)) {
            handleBanking();
            return;
        }

        var larderHotspot = TileObjects.getNearest("Larder space");
        if (larderHotspot != null) {
            larderHotspot.interact("Build");
            Time.sleepTicks(2);

            Widget buildWidget = Widgets.get(BUILD_WIDGET, 0);
            if (buildWidget != null) {
                Mouse.click(buildWidget.getBounds());
                Time.sleepTicks(2);
            }
        }

        var larder = TileObjects.getNearest("Oak larder");
        if (larder != null) {
            AccBuilderSotf.currentStatus = "Removing";
            larder.interact("Remove");
            Time.sleepTicks(2);
            Dialog.chooseOption("Yes");
            Time.sleepTicks(2);
        }
    }

    /**
     * Teleports to player-owned house
     */
    private static void teleportToHouse() {
        AccBuilderSotf.currentStatus = "Tele to house";

        if (Inventory.contains(HOUSE_TELEPORT)) {
            Inventory.getFirst(HOUSE_TELEPORT).interact("Break");
            Time.sleepTicks(4);
        }
    }

    /**
     * Enters build mode in house
     */
    private static void enterBuildMode() {
        AccBuilderSotf.currentStatus = "Turning on build mode";

        Widget houseOptionsWidget = Widgets.get(CONSTRUCTION_WIDGET);
        if (houseOptionsWidget != null) {
            houseOptionsWidget.interact("View House Options");
            Time.sleepTicks(2);

            Widget buildModeWidget = Widgets.get(CONSTRUCTION_WIDGET);
            if (buildModeWidget != null) {
                buildModeWidget.interact("On");
                Time.sleepTicks(2);
            }
        }
    }

    /**
     * Checks if player is in their house
     */
    private static boolean isInHouse() {
        return Vars.getBit(HOUSE_VARBIT) > 0 && Players.getLocal().getWorldLocation().getPlane() == 0;
    }

    /**
     * Checks if player is in build mode
     */
    private static boolean isInBuildMode() {
        return Vars.getBit(HOUSE_VARBIT) > 0; // Placeholder
    }

    /**
     * Checks if kitchen exists
     */
    private static boolean hasKitchen() {
        return false; // Placeholder
    }

    /**
     * Checks if dining room exists
     */
    private static boolean hasDiningRoom() {
        return false; // Placeholder
    }

    /**
     * Builds kitchen room
     */
    private static void buildKitchen() {
        AccBuilderSotf.currentStatus = "Building kitchen";
        // Implementation for building kitchen room
    }

    /**
     * Builds dining room
     */
    private static void buildDiningRoom() {
        AccBuilderSotf.currentStatus = "Building dining room";
        // Implementation for building dining room
    }

    /**
     * Checks if player has required items in inventory
     */
    private static boolean hasRequiredItems() {
        return Inventory.contains(SAW)
            && Inventory.contains(HAMMER)
            && (Inventory.contains(PLANK) || Inventory.contains(OAK_PLANK));
    }

    /**
     * Checks if required items are in bank
     */
    private static boolean hasRequiredItemsInBank() {
        int currentLevel = Skills.getLevel(Skill.CONSTRUCTION);

        boolean hasTools = Bank.contains(SAW) && Bank.contains(HAMMER);
        boolean hasTeleports = Bank.contains(HOUSE_TELEPORT);

        if (currentLevel < LEVEL_OAK_TABLE) {
            return hasTools && Bank.contains(PLANK) && Bank.contains(IRON_NAILS) && hasTeleports;
        } else {
            return hasTools && Bank.contains(OAK_PLANK) && hasTeleports;
        }
    }

    /**
     * Checks which items are missing and adds to shopping list
     */
    private static void checkMissingItems() {
        shoppingList.clear();

        int currentLevel = Skills.getLevel(Skill.CONSTRUCTION);

        // Check for tools
        if (!Bank.contains(SAW)) {
            System.out.println("We are missing saw, switching to BUYING");
            shoppingList.add(new ShoppingItem(SAW, 1, 13000));
        }

        if (!Bank.contains(HAMMER)) {
            System.out.println("We are missing hammer, switching to BUYING");
            shoppingList.add(new ShoppingItem(HAMMER, 1, 1000));
        }

        // Check for teleports
        if (!Bank.contains(HOUSE_TELEPORT)) {
            System.out.println("We are missing house tab, switching to BUYING");
            shoppingList.add(new ShoppingItem(HOUSE_TELEPORT, 50, 5000));
        }

        // Check for materials based on level
        if (currentLevel < LEVEL_OAK_TABLE) {
            if (!Bank.contains(IRON_NAILS)) {
                System.out.println("We are missing nails, switching to BUYING");
                shoppingList.add(new ShoppingItem(IRON_NAILS, 10000, 10));
            }

            if (!Bank.contains(PLANK)) {
                System.out.println("We are missing plank, switching to BUYING");
                shoppingList.add(new ShoppingItem(PLANK, 5000, 100));
            }
        } else {
            if (!Bank.contains(OAK_PLANK)) {
                System.out.println("We are missing oak planks, switching to BUYING");
                shoppingList.add(new ShoppingItem(OAK_PLANK, 3000, 500));
            }
        }

        // Check for ring of dueling
        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of dueling("))) {
            shoppingList.add(new ShoppingItem(2552, 5, 2000));
        }

        // Check for ring of wealth
        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            shoppingList.add(new ShoppingItem(11980, 5, 13000));
        }
    }
}
