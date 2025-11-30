package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.sotf.framework.*;

/**
 * Animal Magnetism quest step handler for SOTF (Secrets of the North).
 *
 * <p>This class manages the complete execution of the Animal Magnetism quest,
 * including all prerequisite quests and skill requirements. It handles:
 * <ul>
 *   <li>Prerequisite quest completion (Waterfall, Priest in Peril, Ernest the Chicken, etc.)</li>
 *   <li>Skill training (Crafting, Woodcutting, Ranged)</li>
 *   <li>Item gathering and preparation</li>
 *   <li>Quest dialog navigation</li>
 *   <li>Specific quest tasks (ectofuntus worship, item creation, NPC interactions)</li>
 * </ul>
 */
public class AnimalMagnetismStep implements QuestStep {

    // Location constants
    static WorldPoint AVA_LOCATION;
    static int dialogIndex;
    static WorldArea ECTOFUNTUS_AREA_1;
    static WorldArea ECTOFUNTUS_AREA_2;
    static WorldArea ECTOFUNTUS_AREA_3;
    static WorldPoint CHARTER_LOCATION;
    static WorldPoint MALCOLM_LOCATION;

    // Quest state
    public static List<d> itemsToBuy;
    static boolean needsToBuyItems;
    static boolean hasIncrementedQuest;
    private static String questStepDescription;
    private static String[] dialogOptions;
    private static int dialogState;

    // Constants
    private static final int QUEST_COMPLETE_VARBIT = 240;
    private static final int CRAFTING_LEVEL_REQUIRED = 19;
    private static final int WOODCUTTING_LEVEL_REQUIRED = 35;
    private static final int RANGED_LEVEL_REQUIRED = 30;
    private static final int HUNTER_LEVEL_REQUIRED = 9;

    // Item IDs
    private static final int ECTO_TOKENS_ID = 7934;
    private static final int COWHIDE_ID = 1739;
    private static final int SOFT_LEATHER_ID = 1745;
    private static final int POLISHED_BUTTONS_ID = 4247;
    private static final int CHISEL_ID = 1755;
    private static final int NEEDLE_ID = 1733;
    private static final int THREAD_ID = 1734;
    private static final int HARD_LEATHER_ID = 1743;
    private static final int IRON_BAR_ID = 2351;
    private static final int HAMMER_ID = 2347;
    private static final int AXE_ID = 1351;
    private static final int MITHRIL_AXE_ID = 1355;
    private static final int GHOSTSPEAK_AMULET_ID = 552;
    private static final int HOLY_SYMBOL_ID = 1718;
    private static final int BONES_ID = 526;
    private static final int SELECTED_IRON_ID = 2692;
    private static final int RESEARCH_NOTES_ID = 21874;
    private static final int PATTERN_ID = 21854;
    private static final int UNDEAD_CHICKEN_ID = 3514;
    private static final int BAR_MAGNET_ID = 21888;
    private static final int UNDEAD_TWIGS_ID = 21880;
    private static final int BLESSED_AXE_ID = 21867;

    static {
        itemsToBuy = new ArrayList<>();

        // Initialize location areas
        ECTOFUNTUS_AREA_1 = new WorldArea(16127, 32682, 10, 5, 0);
        ECTOFUNTUS_AREA_2 = new WorldArea(15850, 15877, 224, 56, 0);
        ECTOFUNTUS_AREA_3 = new WorldArea(15850, 15877, 224, 56, 1);
        AVA_LOCATION = new WorldPoint(16383, 32254, 0);
        CHARTER_LOCATION = new WorldPoint(32749, 32738, 0);
        MALCOLM_LOCATION = new WorldPoint(15796, 15908, 0);

        // Initialize dialog options
        dialogOptions = new String[] {
            "Yes.",
            "I'm here about a quest.",
            "Okay, you need it more than I do, I suppose.",
            "Could I buy those chickens now, then?",
            "Could I buy 2 chickens?",
            "I'm here about a quest.",
            "Hello, I'm here about those trees again.",
            "I'd love one, thanks."
        };

        dialogState = 0;
        questStepDescription = "";
    }

    /**
     * Checks if the player has all required items for the quest.
     *
     * @return true if player has all required items, false otherwise
     */
    private static boolean hasAllRequiredItems() {
        int[] requiredItems = {
            MITHRIL_AXE_ID,
            CHISEL_ID,
            POLISHED_BUTTONS_ID,
            HOLY_SYMBOL_ID,
            HARD_LEATHER_ID,
            COWHIDE_ID,
            SOFT_LEATHER_ID
        };

        for (int itemId : requiredItems) {
            if (!Inventory.contains(itemId)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Adds items to the shopping list that need to be purchased from the Grand Exchange.
     */
    private static void populateShoppingList() {
        // Ecto-tokens (5 needed)
        if (Bank.contains(ECTO_TOKENS_ID)) {
            if (Bank.contains(ECTO_TOKENS_ID) && Bank.getFirst(ECTO_TOKENS_ID).getQuantity() < 5) {
                itemsToBuy.add(new ShopItem(ECTO_TOKENS_ID, 5, GameStateUtil.randomRange(13690, 5412)));
            }
        }

        // Cowhides (10 needed)
        if (Bank.contains(COWHIDE_ID)) {
            if (Bank.contains(COWHIDE_ID) && Bank.getFirst(COWHIDE_ID).getQuantity() < 10) {
                itemsToBuy.add(new ShopItem(COWHIDE_ID, 10, 10220));
            }
        }

        // Soft leather (7 needed)
        if (Bank.contains(SOFT_LEATHER_ID)) {
            if (Bank.contains(SOFT_LEATHER_ID) && Bank.getFirst(SOFT_LEATHER_ID).getQuantity() < 7) {
                itemsToBuy.add(new ShopItem(SOFT_LEATHER_ID, 7, 31647));
            }
        }

        // Polished buttons (if not in bank)
        if (!Bank.contains(POLISHED_BUTTONS_ID)) {
            itemsToBuy.add(new ShopItem(POLISHED_BUTTONS_ID, 3, 16339));
        }

        // Chisel (if not in bank)
        if (!Bank.contains(CHISEL_ID)) {
            itemsToBuy.add(new ShopItem(CHISEL_ID, 1, 30527));
        }

        // Iron bar (127 needed for multiple purposes)
        if (Bank.contains(IRON_BAR_ID)) {
            if (Bank.contains(IRON_BAR_ID) && Bank.getFirst(IRON_BAR_ID).getQuantity() < 127) {
                itemsToBuy.add(new ShopItem(IRON_BAR_ID, 127, 30527));
            }
        }

        // Needle (3 needed)
        if (Bank.contains(NEEDLE_ID)) {
            if (Bank.contains(NEEDLE_ID) && Bank.getFirst(NEEDLE_ID).getQuantity() < 3) {
                itemsToBuy.add(new ShopItem(NEEDLE_ID, 3, 30527));
            }
        }

        // Thread (3 needed)
        if (Bank.contains(THREAD_ID)) {
            if (Bank.contains(THREAD_ID) && Bank.getFirst(THREAD_ID).getQuantity() < 3) {
                itemsToBuy.add(new ShopItem(THREAD_ID, 3, 30527));
            }
        }

        // Hard leather (if not in bank)
        if (!Bank.contains(HARD_LEATHER_ID)) {
            itemsToBuy.add(new ShopItem(HARD_LEATHER_ID, 1, 30527));
        }

        // Ring of wealth (predicate search)
        Predicate<net.unethicalite.api.items.Item> ringOfWealthPredicate =
            item -> item.getName().toLowerCase().contains("ring of wealth (");
        if (!Bank.contains(ringOfWealthPredicate)) {
            itemsToBuy.add(new ShopItem(16159, 3, 32559));
        }

        // Polished buttons (127 needed)
        if (Bank.contains(POLISHED_BUTTONS_ID)) {
            if (Bank.contains(POLISHED_BUTTONS_ID) && Bank.getFirst(POLISHED_BUTTONS_ID).getQuantity() < 127) {
                itemsToBuy.add(new ShopItem(POLISHED_BUTTONS_ID, 127, Constants.DEFAULT_GE_TIMEOUT));
            }
        }

        // Mithril axe (7 needed)
        if (Bank.contains(MITHRIL_AXE_ID)) {
            if (Bank.contains(MITHRIL_AXE_ID) && Bank.getFirst(MITHRIL_AXE_ID).getQuantity() < 7) {
                itemsToBuy.add(new ShopItem(MITHRIL_AXE_ID, 40, 24026));
            }
        }
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        try {
            executeQuestStep();
        } catch (Exception exception) {
            // Silently handle exceptions
        }
        return 76;
    }

    @Override
    public String getName() {
        if (questStepDescription.isEmpty()) {
            return "Animal Magnetism";
        }
        return "Animal Magnetism - " + questStepDescription;
    }

    @Override
    public boolean isComplete() {
        return Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) >= QUEST_COMPLETE_VARBIT;
    }

    /**
     * Navigates to Ava and handles bookcase interactions.
     */
    private static void navigateToAva() {
        WorldArea bookcaseArea = new WorldArea(32765, 32682, 10, 5, 0);

        if (!bookcaseArea.contains(Players.getLocal().getWorldLocation())) {
            TileObjects.getNearest("Bookcase").interact("Search");
            Time.sleepTicks(2);
        }

        if (!ECTOFUNTUS_AREA_1.contains(Players.getLocal().getWorldLocation())
                && Players.getLocal().getWorldLocation().distanceTo(AVA_LOCATION) > 8) {
            AccBuilderSotf.c = "Nav to start";
            if (Dialog.isOpen()) {
                Dialog.close();
            }
            Movement.walkTo(AVA_LOCATION);
            Time.sleepTicks(1);
        }

        if (ECTOFUNTUS_AREA_1.contains(Players.getLocal().getWorldLocation())
                && Players.getLocal().getWorldLocation().distanceTo(AVA_LOCATION) <= 8) {
            g.a("Ava", dialogOptions);
        }

        if (Players.getLocal().getWorldLocation().equals(new WorldPoint(32765, 32667, 0))) {
            TileObjects.getNearest("Bookcase").interact("Search");
            Time.sleepTicks(2);
        }
    }

    /**
     * Main quest execution method. Handles all quest steps and prerequisites.
     */
    public static void executeQuestStep() {
        // Handle shopping list
        if (needsToBuyItems) {
            b.a(itemsToBuy);
            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                needsToBuyItems = false;
            }
        }

        if (needsToBuyItems || Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) < QUEST_COMPLETE_VARBIT) {
            // Check prerequisite quests and skills
            if (GameStateUtil.getVarbit(65) < 5) {
                questStepDescription = "Waterfall";
                O.db();
            }

            if (GameStateUtil.getVarbit(65) >= 5 && (GameStateUtil.getVarbit(4289) < 70 || GameStateUtil.getVarbit(4455) < 3)) {
                questStepDescription = "Priest in Peril";
                H.cf();
            }

            if (GameStateUtil.getVarbit(65) >= 5 && GameStateUtil.getVarbit(4289) >= 70 && GameStateUtil.getVarbit(4455) >= 3 && GameStateUtil.getVarbit(32) < 3) {
                questStepDescription = "Ernest the Chicken";
                V.dL();
            }

            if (GameStateUtil.getVarbit(65) >= 5 && GameStateUtil.getVarbit(4289) >= 70 && GameStateUtil.getVarbit(4455) >= 3 && GameStateUtil.getVarbit(32) >= 3
                    && Skills.getLevel(Skill.CRAFTING) < CRAFTING_LEVEL_REQUIRED) {
                questStepDescription = "Crafting";
                ay.fi();
            }

            if (GameStateUtil.getVarbit(65) >= 5 && GameStateUtil.getVarbit(4289) >= 70 && GameStateUtil.getVarbit(4455) >= 3 && GameStateUtil.getVarbit(32) >= 3
                    && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_LEVEL_REQUIRED
                    && Skills.getLevel(Skill.WOODCUTTING) < WOODCUTTING_LEVEL_REQUIRED) {
                questStepDescription = "Woodcutting";
                aF.gs();
            }

            if (GameStateUtil.getVarbit(65) >= 5 && GameStateUtil.getVarbit(4289) >= 70 && GameStateUtil.getVarbit(4455) >= 3 && GameStateUtil.getVarbit(32) >= 3
                    && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_LEVEL_REQUIRED
                    && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_LEVEL_REQUIRED
                    && Skills.getLevel(Skill.RANGED) < RANGED_LEVEL_REQUIRED) {
                questStepDescription = "Training range";
                if (dialogState < 1) {
                    o.cH = 0;
                    dialogState += 1;
                }
                n.aA();
            }

            // Additional quest prerequisites
            if (GameStateUtil.getVarbit(65) >= 5 && GameStateUtil.getVarbit(4289) >= 70 && GameStateUtil.getVarbit(4455) >= 3 && GameStateUtil.getVarbit(32) >= 3
                    && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_LEVEL_REQUIRED
                    && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_LEVEL_REQUIRED
                    && Skills.getLevel(Skill.RANGED) >= RANGED_LEVEL_REQUIRED) {

                // Varrock Quiz
                if (GameStateUtil.getVarbit(5535) != 18715 || Skills.getLevel(Skill.HUNTER) < HUNTER_LEVEL_REQUIRED) {
                    questStepDescription = "Varrock Quiz";
                    N.cY();
                }

                // RFD Dwarf
                if (GameStateUtil.getVarbit(5535) == 18715 && Skills.getLevel(Skill.HUNTER) >= HUNTER_LEVEL_REQUIRED
                        && Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()) < 70) {
                    questStepDescription = "RFD Dwarf";
                    J.cw();
                }

                // A Porcine of Interest
                if (GameStateUtil.getVarbit(5535) == 18715 && Skills.getLevel(Skill.HUNTER) >= HUNTER_LEVEL_REQUIRED
                        && Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()) >= 70
                        && Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()) < 40) {
                    questStepDescription = "A Porcine";
                    u.aX();
                }

                // Client of Kourend
                if (GameStateUtil.getVarbit(5535) == 18715 && Skills.getLevel(Skill.HUNTER) >= HUNTER_LEVEL_REQUIRED
                        && Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()) >= 70
                        && Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()) >= 40
                        && Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()) < 9) {
                    if (!Inventory.contains("Antique lamp")) {
                        questStepDescription = "Client of Kourend";
                        x.bi();
                    }
                }

                x.bj();
            }

            // Check if we need to buy items
            if (!hasAllRequiredItems() && Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 0
                    && GameStateUtil.getVarbit(5535) == 18715 && Skills.getLevel(Skill.HUNTER) >= HUNTER_LEVEL_REQUIRED
                    && Skills.getLevel(Skill.RANGED) >= RANGED_LEVEL_REQUIRED
                    && Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()) >= 70
                    && Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()) >= 40
                    && Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()) >= 9) {

                if (!Inventory.contains("Antique lamp")) {
                    questStepDescription = "";
                    BankLocation nearestBank = BankLocation.getNearest();

                    if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                        AccBuilderSotf.c = "Nav to bank";
                        a.a(nearestBank);
                    }

                    if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                        if (!Bank.isOpen()) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), 30463);
                        }

                        if (Bank.isOpen()) {
                            AccBuilderSotf.c = "Handling banking";

                            if (Inventory.getAll().size() > 0) {
                                Bank.depositInventory();
                                Time.sleepTicks(127);
                            }

                            if (Equipment.getAll().size() > 0) {
                                Bank.depositEquipment();
                                Time.sleepTicks(2);
                            }

                            // Check for missing items
                            boolean missingItems = false;

                            if (Bank.contains(THREAD_ID) && Bank.getFirst(THREAD_ID).getQuantity() < 3) {
                                missingItems = true;
                            }
                            if (Bank.contains(COWHIDE_ID) && Bank.getFirst(COWHIDE_ID).getQuantity() < 10) {
                                missingItems = true;
                            }
                            if (Bank.contains(SOFT_LEATHER_ID) && Bank.getFirst(SOFT_LEATHER_ID).getQuantity() < 7) {
                                missingItems = true;
                            }
                            if (Bank.contains(IRON_BAR_ID) && Bank.getFirst(IRON_BAR_ID).getQuantity() < 127) {
                                missingItems = true;
                            }
                            if (Bank.contains(NEEDLE_ID) && Bank.getFirst(NEEDLE_ID).getQuantity() < 3) {
                                missingItems = true;
                            }
                            if (Bank.contains(POLISHED_BUTTONS_ID) && Bank.getFirst(POLISHED_BUTTONS_ID).getQuantity() < 127) {
                                missingItems = true;
                            }
                            if (Bank.contains(POLISHED_BUTTONS_ID) && Bank.getFirst(POLISHED_BUTTONS_ID).getQuantity() >= 127) {
                                missingItems = true;
                            }

                            if (missingItems) {
                                populateShoppingList();
                                System.out.println("We are missing quest supplies, switching to BUYING");
                                needsToBuyItems = true;
                                return;
                            }

                            // Check if we can withdraw all items
                            int[] allRequiredItemIds = {
                                MITHRIL_AXE_ID, CHISEL_ID, NEEDLE_ID, THREAD_ID, IRON_BAR_ID,
                                POLISHED_BUTTONS_ID, HARD_LEATHER_ID, HOLY_SYMBOL_ID, HARD_LEATHER_ID,
                                COWHIDE_ID, SOFT_LEATHER_ID
                            };

                            if (!GameStateUtil.randomRange(allRequiredItemIds)) {
                                populateShoppingList();
                                System.out.println("We are missing quest supplies, switching to BUYING");
                                needsToBuyItems = true;
                                return;
                            }

                            if (GameStateUtil.randomRange(allRequiredItemIds)) {
                                // Withdraw items
                                a.a(POLISHED_BUTTONS_ID, 127);
                                a.a(CHISEL_ID, 1);
                                a.a(ECTO_TOKENS_ID, 1);
                                a.a(IRON_BAR_ID, 127);
                                a.a(THREAD_ID, 127);
                                a.a(HOLY_SYMBOL_ID, 1);
                                a.a(HARD_LEATHER_ID, 1);
                                a.a(MITHRIL_AXE_ID, 5);
                                a.a(COWHIDE_ID, 5);
                                a.a(SOFT_LEATHER_ID, 7);
                                a.a(31674, 1);
                                a.a(22011, 30527);
                            }
                        }
                    }
                }
            }

            // Consume potions and food
            if (Inventory.contains(f.ba) && Movement.getRunEnergy() < 30) {
                Inventory.getFirst(f.ba).interact("Drink");
                Time.sleepTicks(1);
            }

            if (Inventory.contains(f.aX) && Prayers.getPoints() < 17) {
                Inventory.getFirst(f.aX).interact("Drink");
            }

            if (GameStateUtil.getHealthPercentage() < 60.0) {
                if (Inventory.contains("Shark")) {
                    Inventory.getFirst("Shark").interact("Eat");
                    Time.sleepTicks(2);
                }
            }

            // Start quest
            if (hasAllRequiredItems() && Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 0) {
                if (!ECTOFUNTUS_AREA_1.contains(Players.getLocal().getWorldLocation())
                        && Players.getLocal().getWorldLocation().distanceTo(AVA_LOCATION) > 8) {
                    AccBuilderSotf.c = "Nav to start";
                    if (Dialog.isOpen()) {
                        Dialog.close();
                    }
                    Movement.walkTo(AVA_LOCATION);
                    Time.sleepTicks(1);
                }

                if (ECTOFUNTUS_AREA_1.contains(Players.getLocal().getWorldLocation())
                        && Players.getLocal().getWorldLocation().distanceTo(AVA_LOCATION) <= 8) {
                    dialogIndex = 0;
                    g.a("Ava", dialogOptions);
                }

                if (Players.getLocal().getWorldLocation().equals(new WorldPoint(32765, 32667, 0))) {
                    TileObjects.getNearest("Bookcase").interact("Search");
                    Time.sleepTicks(2);
                }

                WorldArea bookcaseArea = new WorldArea(32765, 32682, 10, 5, 0);
                if (bookcaseArea.contains(Players.getLocal().getWorldLocation())) {
                    TileObjects.getNearest("Bookcase").interact("Search");
                    Time.sleepTicks(2);
                }
            }

            // Quest step 4: Get blessed axe and ghostspeak amulet
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 4) {
                if (!Equipment.contains(GHOSTSPEAK_AMULET_ID)) {
                    Inventory.getFirst(GHOSTSPEAK_AMULET_ID).interact("Wear");
                }

                if (!Inventory.contains(BLESSED_AXE_ID)) {
                    WorldPoint charterPoint = new WorldPoint(20201, 12031, 0);

                    // Buy charter tickets
                    if (!Inventory.contains(SELECTED_IRON_ID)
                            && Players.getLocal().getWorldLocation().distanceTo(charterPoint) > 17) {
                        if (Players.getLocal().getWorldLocation().distanceTo(CHARTER_LOCATION) > 3) {
                            AccBuilderSotf.c = "Nav to charter";
                            Movement.walkTo(CHARTER_LOCATION);
                            Time.sleepTicks(1);
                        }

                        if (Players.getLocal().getWorldLocation().distanceTo(CHARTER_LOCATION) <= 3) {
                            if (!Shop.isOpen()) {
                                NPCs.getNearest("Trader Crewmember").interact("Trade");
                                Time.sleepTicks(2);
                            }
                            if (Shop.isOpen()) {
                                Shop.buyFive(SELECTED_IRON_ID);
                                Time.sleepTicks(3);
                            }
                        }
                    }

                    // Navigate to Ectofuntus
                    if (Inventory.contains(SELECTED_IRON_ID)) {
                        if (!ECTOFUNTUS_AREA_2.contains(Players.getLocal().getWorldLocation())
                                && !ECTOFUNTUS_AREA_3.contains(Players.getLocal().getWorldLocation())) {
                            if (Inventory.contains(SOFT_LEATHER_ID)) {
                                Inventory.getFirst(SOFT_LEATHER_ID).interact("Break");
                                Time.sleepTicks(7);
                            }
                        }

                        if (ECTOFUNTUS_AREA_2.contains(Players.getLocal().getWorldLocation())
                                || ECTOFUNTUS_AREA_3.contains(Players.getLocal().getWorldLocation())) {
                            WorldPoint ectoPoint = new WorldPoint(20201, 12031, 0);

                            if (Players.getLocal().getWorldLocation().distanceTo(ectoPoint) > 3
                                    && Players.getLocal().getWorldLocation().getPlane() == 0) {
                                AccBuilderSotf.c = "Nav to ecto";
                                Movement.walkTo(ectoPoint);
                                Time.sleepTicks(1);
                            }

                            // Process bones
                            if (Inventory.contains("Bones")) {
                                if (Players.getLocal().getWorldLocation().distanceTo(ectoPoint) <= 3
                                        && Players.getLocal().getWorldLocation().getPlane() == 0) {
                                    TileObjects.getNearest("Staircase").interact("Climb-up");
                                    Time.sleepTicks(127);
                                }

                                if (TileObjects.getNearest("Loader") != null) {
                                    if (Inventory.contains("Bones")) {
                                        Inventory.getFirst("Bones").useOn(TileObjects.getNearest("Loader"));
                                        Time.sleep(GameStateUtil.randomRange(62195, 63332));
                                    }
                                }
                            }

                            if (!Inventory.contains("Bones")) {
                                if (Players.getLocal().getWorldLocation().getPlane() == 1) {
                                    TileObjects.getNearest("Staircase").interact("Climb-down");
                                    Time.sleepTicks(3);
                                }

                                if (Players.getLocal().getWorldLocation().getPlane() == 0) {
                                    while (Inventory.contains("Bonemeal")) {
                                        TileObjects.getNearest("Ectofuntus").interact("Worship");
                                        Time.sleepTicks(2);
                                    }
                                }
                            }
                        }
                    }
                }

                // Get iron bar from Malcolm
                if (!Inventory.contains(IRON_BAR_ID)) {
                    if (!Inventory.contains("Bonemeal")
                            && Players.getLocal().getWorldLocation().distanceTo(charterPoint) <= 17) {
                        if (!Dialog.isOpen()) {
                            g.a("Ghost disciple", dialogOptions);
                            Time.sleepTicks(1);
                        }
                        g.a(dialogOptions);
                    }
                }

                // Handle ecto-tokens
                if (Inventory.contains(BLESSED_AXE_ID)) {
                    if (Inventory.contains(ECTO_TOKENS_ID, THREAD_ID)) {
                        Inventory.getAll(ECTO_TOKENS_ID, THREAD_ID).stream()
                            .forEach(item -> item.interact("Drop"));
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(MALCOLM_LOCATION) > 7) {
                        Movement.walkTo(MALCOLM_LOCATION);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(MALCOLM_LOCATION) <= 7) {
                        g.a("Malcolm", dialogOptions);
                    }
                }
            }

            // Quest steps 17-54: Dialog with Alice
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 17) {
                g.a("Alice", dialogOptions);
            }
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 36) {
                g.a("Malcolm", dialogOptions);
            }
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 40) {
                g.a("Alice", dialogOptions);
            }
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 30) {
                g.a("Malcolm", dialogOptions);
            }
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 70) {
                g.a("Alice", dialogOptions);
            }

            // Quest steps 66-68: Old crone
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) != 66
                    || Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 68) {
                WorldPoint croneLocation = new WorldPoint(32615, 24423, 0);

                if (Players.getLocal().getWorldLocation().distanceTo(croneLocation) > 3) {
                    AccBuilderSotf.c = "Nav to crone";
                    Movement.walkTo(croneLocation);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(croneLocation) <= 3) {
                    g.a("Old crone", dialogOptions);
                }
            }

            // Quest step 76: Malcolm again
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 76) {
                if (Players.getLocal().getWorldLocation().distanceTo(MALCOLM_LOCATION) > 7) {
                    Movement.walkTo(MALCOLM_LOCATION);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(MALCOLM_LOCATION) <= 7) {
                    g.a("Malcolm", dialogOptions);
                }
            }

            // Quest step 80: More Malcolm dialog
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 80) {
                g.a("Malcolm", dialogOptions);
            }

            // Quest steps 58-76: Undead chicken and witch
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) != 58
                    || Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 76) {
                g.a("Malcolm", dialogOptions);
            }

            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 76) {
                if (Inventory.contains("Undead chicken")) {
                    if (!Inventory.contains("Iron bar")) {
                        HashMap<Integer, Integer> smithingMap = new HashMap<>();
                        smithingMap.put(NEEDLE_ID, 3);
                        smithingMap.put(THREAD_ID, 1);
                        smithingMap.put(HARD_LEATHER_ID, 1);
                        smithingMap.put(POLISHED_BUTTONS_ID, 1);
                        GameStateUtil.handleBanking(smithingMap, 0, 0);
                    }

                    if (Inventory.contains("Iron bar")) {
                        navigateToAva();
                    }
                }
            }

            // Quest steps 249-256: Witch interaction
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) != 249
                    || Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 256) {
                var witch = NPCs.getNearest("Witch");
                if (witch != null) {
                    if (Reachable.isInteractable(witch)) {
                        g.a("Witch", dialogOptions);
                    }
                    if (!Reachable.isInteractable(witch)) {
                        Movement.walkTo(witch);
                        Time.sleepTicks(1);
                    }
                }
            }

            // Quest step 258: Get bar magnet
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 258) {
                if (!Inventory.contains("Bar magnet")) {
                    WorldPoint minePoint = new WorldPoint(24543, 12391, 0);
                    WorldPoint minePoint2 = new WorldPoint(24543, 12447, 0);

                    if (!Players.getLocal().getWorldLocation().equals(minePoint)
                            && !Players.getLocal().getWorldLocation().equals(minePoint2)) {
                        AccBuilderSotf.c = "Nav to mine";
                        Movement.walkTo(minePoint);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().equals(minePoint)
                            && !Players.getLocal().getWorldLocation().equals(minePoint2)) {
                        Movement.walkTo(minePoint2);
                    }

                    if (Players.getLocal().getWorldLocation().equals(minePoint2)) {
                        Inventory.getFirst("Hammer").useOn(Inventory.getFirst("Selected iron"));
                        Time.sleepTicks(3);
                    }
                }

                if (Inventory.contains("Bar magnet")) {
                    navigateToAva();
                }
            }

            // Quest step 150: Chop undead tree
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 150) {
                WorldPoint treePoint = new WorldPoint(24295, 32702, 0);

                if (!Players.getLocal().getWorldLocation().equals(treePoint)) {
                    Movement.walkTo(treePoint);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(treePoint)) {
                    NPCs.getNearest("Undead tree").interact("Chop");
                    Time.sleepTicks(1);
                }
            }

            // Quest steps 160-164: Turael interaction
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) != 160
                    || Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 164) {
                WorldPoint turaelPoint = new WorldPoint(21850, 32702, 0);

                if (Players.getLocal().getWorldLocation().distanceTo(turaelPoint) > 2) {
                    if (Inventory.contains(f.aT)) {
                        Inventory.getFirst(f.aT).interact("Wear");
                    }
                    AccBuilderSotf.c = "Nav to npc";
                    Movement.walkTo(turaelPoint);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(turaelPoint) <= 2) {
                    var turael = NPCs.getNearest("Turael");
                    if (turael != null) {
                        if (Reachable.isInteractable(turael)) {
                            g.a("Turael", dialogOptions);
                        }
                        if (!Reachable.isInteractable(turael)) {
                            Movement.walkTo(turael);
                            Time.sleepTicks(1);
                        }
                    }
                }
            }

            // Quest step 167: More undead tree chopping
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 167) {
                if (!Inventory.contains("Undead twigs")) {
                    WorldPoint treePoint = new WorldPoint(24295, 32702, 0);

                    if (!Players.getLocal().getWorldLocation().equals(treePoint)) {
                        Movement.walkTo(treePoint);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().equals(treePoint)) {
                        NPCs.getNearest("Undead tree").interact("Chop");
                        Time.sleepTicks(1);
                    }
                }

                if (Inventory.contains("Undead twigs")) {
                    navigateToAva();
                }
            }

            // Quest step 190: Navigate to Ava
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 190) {
                navigateToAva();
            }

            // Quest step 194: Translate research notes
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 194) {
                if (!Widgets.get(21850).isEmpty()) {
                    Inventory.getFirst("Research notes").interact("Translate");
                    Time.sleepTicks(127);
                }

                if (Widgets.get(21850).isEmpty()) {
                    // Click through translation puzzle
                    Mouse.click(Widgets.get(21850, 26).getClickPoint().getX(),
                               Widgets.get(21850, 26).getClickPoint().getY(), true);
                    Time.sleepTicks(2);
                    Mouse.click(Widgets.get(21850, 29).getClickPoint().getX(),
                               Widgets.get(21850, 29).getClickPoint().getY(), true);
                    Time.sleepTicks(2);
                    Mouse.click(Widgets.get(21850, 168).getClickPoint().getX(),
                               Widgets.get(21850, 168).getClickPoint().getY(), true);
                    Time.sleepTicks(2);
                    Mouse.click(Widgets.get(21850, 40).getClickPoint().getX(),
                               Widgets.get(21850, 40).getClickPoint().getY(), true);
                    Time.sleepTicks(2);
                    Mouse.click(Widgets.get(21850, 43).getClickPoint().getX(),
                               Widgets.get(21850, 43).getClickPoint().getY(), true);
                    Time.sleepTicks(2);
                    Mouse.click(Widgets.get(21850, 177).getClickPoint().getX(),
                               Widgets.get(21850, 177).getClickPoint().getY(), true);
                    Time.sleepTicks(3);
                }
            }

            // Quest step 210: Navigate to Ava
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 210) {
                navigateToAva();
            }

            // Quest step 220: Craft pattern
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 220) {
                if (Inventory.contains("A pattern")) {
                    Inventory.getFirst("A pattern").useOn(Inventory.getFirst("Hard leather"));
                    Time.sleepTicks(2);
                }
            }

            // Quest step 225: Final step - complete quest
            if (Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == 225) {
                if (dialogIndex < 1) {
                    aN.sa += 1;
                    aN.u(AccBuilderSotf.m);
                    dialogIndex += 1;
                    aN.sa = 0;
                    hasIncrementedQuest = false;
                }
                navigateToAva();
            }

            // Continue dialog
            g.a(dialogOptions);
        }
    }
}
