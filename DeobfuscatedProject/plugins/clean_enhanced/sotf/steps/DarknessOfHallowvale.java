package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/**
 * Quest step handler for "In Aid of the Myreque" quest.
 *
 * NOTE: Despite the filename, this class handles the "In Aid of the Myreque" quest,
 * not "Darkness of Hallowvale". The original obfuscated file (D.java) contained
 * code for the Myreque quest line, specifically "In Aid of the Myreque".
 *
 * This quest involves helping the Myreque rebuild the town of Burgh de Rott,
 * including:
 * - Repairing buildings (bank, general store, furnace)
 * - Clearing rubble from the basement
 * - Defending against vampyre attacks
 * - Escorting citizens through Temple Trekking
 *
 * Requirements:
 * - In Search of the Myreque (completed)
 * - 25 Crafting
 * - 15 Mining
 * - Ability to defeat level 75 vampyres
 */
public class DarknessOfHallowvale implements ac {

    // ==================== ITEM IDS ====================
    private static final int RUNE_SCIMITAR = 1333;
    private static final int MACKEREL = 353;
    private static final int THIN_SNAIL = 3363;
    private static final int PRAYER_POTION_4 = 2434;
    private static final int STAMINA_POTION_4 = 12625;
    private static final int EFARITAYS_AID = 21140;
    private static final int SWAMP_PASTE = 1941;
    private static final int COAL = 453;
    private static final int SHARK = 385;
    private static final int SALMON = 329;
    private static final int STEEL_BAR = 2353;
    private static final int STEEL_NAILS = 1539;
    private static final int BRONZE_AXE = 1351;
    private static final int TINDERBOX = 590;
    private static final int PLANK = 960;
    private static final int BUCKET = 1925;
    private static final int SALVE_GRAVEYARD_TELEPORT = 19619;
    private static final int BARROWS_TELEPORT = 19629;
    private static final int SPADE = 952;
    private static final int BRONZE_PICKAXE = 1265;
    private static final int HAMMER = 2347;
    private static final int CHISEL = 1761;
    private static final int ROPE = 954;
    private static final int SILVER_BAR = 2355;
    private static final int MITHRIL_BAR = 2359;
    private static final int SAPPHIRE = 1607;
    private static final int NECKLACE_MOULD = 564;
    private static final int WATER_RUNE = 555;
    private static final int STEEL_PLATELEGS = 1141;
    private static final int STEEL_PLATEBODY = 1105;
    private static final int STEEL_FULL_HELM = 1069;
    private static final int STEEL_KITESHIELD = 2961;
    private static final int BUCKET_OF_RUBBLE = 3250;  // Approximate ID

    // Object IDs
    private static final int CAVE_ENTRANCE = 5003;
    private static final int TRAPDOOR = 5054;
    private static final int RUBBLE = 5058;
    private static final int DAMAGED_WALL = 5059;
    private static final int BROKEN_ROOF = 5060;
    private static final int BROKEN_FURNACE = 5061;
    private static final int RUBBLE_PILE = 5063;
    private static final int LADDER_UP = 5055;
    private static final int BANK_CHEST = 4483;

    // ==================== LOCATIONS ====================
    public static final WorldPoint BURGH_START = new WorldPoint(3492, 3218, 0);
    public static final WorldPoint FLORIN_LOCATION = new WorldPoint(3496, 3232, 0);
    public static final WorldPoint RAZVAN_LOCATION = new WorldPoint(3499, 3216, 0);
    public static final WorldPoint VELIAF_LOCATION = new WorldPoint(3502, 3235, 0);
    public static final WorldPoint FURNACE_LOCATION = new WorldPoint(3503, 3211, 0);
    public static final WorldPoint BANK_LOCATION = new WorldPoint(3495, 3236, 0);
    public static final WorldPoint GENERAL_STORE_LOCATION = new WorldPoint(3492, 3226, 0);
    public static final WorldPoint PUB_LOCATION = new WorldPoint(3492, 3218, 0);
    public static final WorldPoint ADDITIONAL_LOCATION = new WorldPoint(3508, 3229, 0);

    public static final WorldArea CAVE_AREA = new WorldArea(3440, 9708, 40, 50, 0);
    public static final WorldArea QUEST_AREA = new WorldArea(3490, 3210, 25, 30, 0);

    // ==================== QUEST STATE ====================
    public static String currentAction = "";
    public static String questName = "In Aid of the Myreque";
    public static boolean questComplete = true;
    public static List<d> questSteps = new ArrayList<>();

    private static boolean preparedForVyrewatch = false;
    private static boolean hasTinderbox = false;
    private static boolean hasVial = false;
    private static int currentStep = 0;
    private static int bankCounter = 0;
    private static int fightCounter = 0;
    private static int stepCounter = 0;
    private static boolean debugFlag = false;

    // ==================== DIALOG OPTIONS ====================
    private static final String[] DIALOG_OPTIONS = {
        "Finished buying items, switching back to quest",
        "- Crafting",
        "- Mining",
        "Veliaf Hurtz",
        "Razvan",
        "Florin",
        "Aurel",
        "Gadderanks",
        "Cornelius",
        "Ivan Strom",
        "Polmafi Ferdygris",
        "Wiskit"
    };

    /**
     * Main execution method for the quest step.
     * Handles the entire "In Aid of the Myreque" quest flow.
     */
    public static void execute() {
        // Check if we need to load quest steps from the quest repository
        if (questComplete) {
            b.a(questSteps);  // Load quest steps
            if (questSteps.isEmpty()) {
                System.out.println("Finished buying items, switching back to quest");
                questComplete = false;
            }
        }

        if (!questComplete) {
            handlePrerequisites();
            handleQuestProgression();
            handleMovement();
        }
    }

    /**
     * Check and handle quest prerequisites (skills, items, gear).
     */
    private static void handlePrerequisites() {
        // Check Crafting level requirement (25)
        if (Skills.getLevel(Skill.CRAFTING) < 25) {
            currentAction = "- Crafting";
            ay.fi();  // Train crafting
            return;
        }

        // Check Mining level requirement (15)
        if (Skills.getLevel(Skill.CRAFTING) >= 25 && Skills.getLevel(Skill.MINING) < 15) {
            currentAction = "- Mining";
            aC.fQ();  // Train mining
            return;
        }

        // Check prerequisite quest: In Search of the Myreque
        if (e.j(387) == 110 && Skills.getLevel(Skill.CRAFTING) >= 25 && Skills.getLevel(Skill.MINING) >= 15) {
            currentAction = "- In Search of the Myreque";
            E.bV();  // Complete prerequisite quest
            return;
        }

        // Handle banking and item gathering if prerequisites are met
        if ((hasRequiredItems() && !hasRequiredGear()) ||
            !Skills.getLevel(Skill.CRAFTING) >= 25 ||
            !Skills.getLevel(Skill.MINING) >= 15 ||
            !Vars.getBit(QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()) > 0 ||
            !e.j(387) >= 110) {

            currentAction = "Banking and getting supplies";
            handleBanking();
        }
    }

    /**
     * Handle banking to withdraw required items.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();

        // Navigate to bank if not there
        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            currentAction = "Nav to bank";

            // Use teleport if far from quest area
            if (Players.getLocal().getWorldLocation().distanceTo(E.ed) > 5) {
                if (Inventory.contains(SALVE_GRAVEYARD_TELEPORT)) {
                    Inventory.getFirst(SALVE_GRAVEYARD_TELEPORT).interact("Break");
                    Time.sleepTicks(5);
                }
            }

            a.a(nearestBank);  // Walk to bank
            return;
        }

        // Open bank if at bank location
        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            if (!Bank.isOpen()) {
                a.a();  // Open bank
                Time.sleepUntil(Bank::isOpen, 5000);
                return;
            }

            if (Bank.isOpen()) {
                currentAction = "Handling banking";

                // Deposit all inventory items
                if (!Inventory.getAll().isEmpty()) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                    return;
                }

                // Deposit all equipment on first bank visit
                if (!Equipment.getAll().isEmpty() && bankCounter == 1) {
                    Bank.depositEquipment();
                    bankCounter++;
                    Time.sleepTicks(2);
                    return;
                }

                // Check and withdraw all required items
                checkRequiredItems();

                // Equip combat gear if we have required items
                if (!hasRequiredGear() && hasInventorySupplies()) {
                    equipCombatGear();
                } else if (hasRequiredGear()) {
                    withdrawStartingSupplies();
                }
            }
        }
    }

    /**
     * Check if all required items are available in the bank.
     * If any items are missing, switch to buying mode.
     */
    private static void checkRequiredItems() {
        // Check for all required quest items
        checkBankItem(MACKEREL, 10, "Missing item ID: RAW_MACKEREL: Amount needed 10");
        checkBankItem(THIN_SNAIL, 10, "Missing item ID: THIN_SNAIL: Amount needed 10");
        checkBankItem(PRAYER_POTION_4, 3, "Missing item ID: PRAYER_POTION4: Amount needed 3");
        checkBankItem(STAMINA_POTION_4, 10, "Missing item ID: STAMINA_POTION4: Amount needed 10");
        checkBankItem(EFARITAYS_AID, 2, "Missing item ID: EFARITAYS_AID: Amount needed 2");
        checkBankItem(SWAMP_PASTE, 10, "Missing item ID: SWAMP_PASTE: Amount needed 10");
        checkBankItem(COAL, 10, "Missing item ID: COAL: Amount needed 10");
        checkBankItem(SHARK, 20, "Missing item ID: SHARK: Amount needed 20");
        checkBankItem(SALMON, 20, "Missing item ID: SALMON: Amount needed 20");
        checkBankItem(STEEL_NAILS, 50, "Missing item ID: STEEL_NAILS: Amount needed 50");
        checkBankItem(STEEL_BAR, 5, "Missing item ID: STEEL_BAR: Amount needed 5");
        checkBankItem(BRONZE_AXE, 10, "Missing item ID: BRONZE_AXE: Amount needed 10");
        checkBankItem(TINDERBOX, 5, "Missing item ID: TINDERBOX: Amount needed 5");
        checkBankItem(PLANK, 12, "Missing item ID: PLANK: Amount needed 12");
        checkBankItem(BUCKET, 10, "Missing item ID: BUCKET:  Amount needed 10");
        checkBankItem(SALVE_GRAVEYARD_TELEPORT, 10, "Missing item ID: SALVE_GRAVEYARD_TELEPORT:  Amount needed 10");
        checkBankItem(BARROWS_TELEPORT, 5, "Missing item ID: BARROWS_TELEPORT: Amount needed 5");

        // Check for rune scimitar
        if (!Bank.contains(RUNE_SCIMITAR)) {
            if (!Inventory.contains(RUNE_SCIMITAR) && !Equipment.contains(RUNE_SCIMITAR)) {
                System.out.println("We are missing rune scim, switching to BUYING");
                switchToBuyingMode();
                questComplete = false;
                return;
            }
        }

        // Check we have all quest supplies
        int[] questSupplies = {
            SPADE, BUCKET, BRONZE_PICKAXE, HAMMER, PLANK, STEEL_NAILS,
            TINDERBOX, COAL, STEEL_BAR, CHISEL, SHARK, SALMON,
            PRAYER_POTION_4, BARROWS_TELEPORT, SALVE_GRAVEYARD_TELEPORT,
            BRONZE_AXE, SWAMP_PASTE, STAMINA_POTION_4, EFARITAYS_AID
        };

        if (!e.c(questSupplies)) {
            switchToBuyingMode();
            System.out.println("We are missing quest supplies, switching to BUYING");
            questComplete = false;
            return;
        }
    }

    /**
     * Check if a specific item is available in the bank with required quantity.
     */
    private static void checkBankItem(int itemId, int requiredAmount, String errorMessage) {
        if (Bank.contains(itemId)) {
            Item bankItem = Bank.getFirst(itemId);
            if (bankItem.getQuantity() < requiredAmount) {
                System.out.println(errorMessage);
                switchToBuyingMode();
                System.out.println("Switching to BUYING");
                questComplete = false;
            }
        }
    }

    /**
     * Equip combat gear (Rune scimitar and Efaritay's aid).
     */
    private static void equipCombatGear() {
        if (!hasRequiredGear()) {
            AccBuilderSotf.c = "Getting gear";

            // Equip rune scimitar
            if (!Equipment.contains(RUNE_SCIMITAR)) {
                if (!Inventory.contains(RUNE_SCIMITAR)) {
                    a.a(RUNE_SCIMITAR, 1);  // Withdraw from bank
                }
            }

            // Equip Efaritay's aid
            if (!Equipment.contains(EFARITAYS_AID)) {
                if (!Inventory.contains(EFARITAYS_AID)) {
                    a.a(EFARITAYS_AID, 1);  // Withdraw from bank
                }
            }
        }

        // Close bank and equip items
        if (Bank.isOpen()) {
            Bank.close();
            Time.sleepTicks(3);
        }

        // Wield rune scimitar
        e.l(RUNE_SCIMITAR);
        // Wield Efaritay's aid
        e.l(EFARITAYS_AID);
        Time.sleepTicks(2);
    }

    /**
     * Withdraw starting supplies for the quest.
     */
    private static void withdrawStartingSupplies() {
        if (hasRequiredGear()) {
            AccBuilderSotf.c = "Getting starting supplies";

            if (!Bank.isOpen()) {
                a.a();  // Open bank
                Time.sleepTicks(6);
                return;
            }

            // Withdraw all required items
            a.a(BRONZE_PICKAXE, 1);
            a.a(SALVE_GRAVEYARD_TELEPORT, 5);
            a.a(BUCKET, 5);
            a.a(STEEL_NAILS, 44);
            a.a(PLANK, 6);
            a.a(SPADE, 1);
            a.a(HAMMER, 1);
            a.a(BARROWS_TELEPORT, 10);
            a.a(SHARK, 10);
            a.a(STAMINA_POTION_4, 2);
        }
    }

    /**
     * Handle movement and stamina potions.
     */
    private static void handleMovement() {
        // Drink stamina potion if run energy is low
        if (Inventory.contains(f.ba) && Movement.getRunEnergy() < 50) {
            Inventory.getFirst(f.ba).interact("Drink");
            Time.sleepTicks(1);
        }
    }

    /**
     * Handle the main quest progression based on varbit state.
     */
    private static void handleQuestProgression() {
        int questVarbit = Vars.getBit(QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId());

        // Quest not started - talk to Veliaf at cave entrance (varbit 0)
        if (hasRequiredItems() && hasRequiredGear() && Vars.getBit(QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()) > 0 &&
            e.j(387) >= 110) {
            currentAction = "Starting quest";
            startQuest();
        }

        // Initial cave exploration (varbit 10)
        if (questVarbit == 10) {
            currentStep = 0;
            exploreInitialCave();
        }

        // Donate food to Florin (varbit 14)
        if (questVarbit == 14) {
            donateFood();
        }

        // Talk to Razvan at pub (varbit 30)
        if (questVarbit >= 40 && questVarbit <= 50) {
            clearRubbleFromBasement();
        }

        // Repair general store (varbit 110)
        if (questVarbit == 110) {
            repairGeneralStore();
        }

        // Repair bank (varbit 130)
        if (questVarbit == 130) {
            repairBank();
        }

        // Repair furnace (varbit 160)
        if (questVarbit == 160) {
            repairFurnace();
        }

        // Fight vampyres (varbit 165)
        if (questVarbit == 165) {
            if (Vars.getBit(387) == 17003) {
                preparedForVyrewatch = false;
            }

            if (!preparedForVyrewatch) {
                prepareForVyrewatch();
            }

            if (preparedForVyrewatch && !hasInventorySupplies()) {
                handleVyrewatchPrep();
            }

            if (preparedForVyrewatch && hasInventorySupplies()) {
                fightVampyres();
            }
        }

        // Temple trek with Ivan (varbit 170)
        if (questVarbit == 170) {
            templeTrekWithIvan();
        }
    }

    /**
     * Start the quest by talking to Veliaf Hurtz.
     */
    private static void startQuest() {
        currentAction = "";

        // Check if player is at the cave entrance
        if (Players.getLocal().getWorldLocation().equals(new WorldPoint(3492, 9824, 0))) {
            AccBuilderSotf.c = "Entering cave";
            TileObject caveEntrance = TileObjects.getNearest("Cave entrance");
            if (caveEntrance != null) {
                caveEntrance.interact("Enter");
                Time.sleepTicks(4);
            }
        }

        // If not in cave area, navigate to start
        if (!CAVE_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "nav to start";

            // Use barrows teleport if far away and have it
            if (Players.getLocal().getWorldLocation().distanceTo(b.I) > 20) {
                if (Inventory.contains(BARROWS_TELEPORT) && Players.getLocal().getAnimation() == -1) {
                    Inventory.getFirst(BARROWS_TELEPORT).interact("Break");
                    Time.sleepTicks(2);
                }
            }

            // Walk to start location
            if (Players.getLocal().getWorldLocation().distanceTo(b.I) > 20) {
                if (Dialog.isOpen()) {
                    Dialog.close();
                }
                Movement.walkTo(BURGH_START);
                Time.sleepTicks(1);
            }
        }

        // Talk to Veliaf if close enough
        if (CAVE_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Starting quest";
            g.a("Veliaf Hurtz", DIALOG_OPTIONS);
        }
    }

    /**
     * Explore initial cave area (varbit 10).
     */
    private static void exploreInitialCave() {
        currentStep = 0;

        if (CAVE_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Tele to barrows";

            // Use barrows teleport to break
            if (Inventory.contains(BARROWS_TELEPORT) && Players.getLocal().getAnimation() == -1) {
                Inventory.getFirst(BARROWS_TELEPORT).interact("Break");
                Time.sleepTicks(2);
            }
        }

        // Navigate to Florin at burgh gate
        if (!CAVE_AREA.contains(Players.getLocal().getWorldLocation())) {
            if (Players.getLocal().getWorldLocation().distanceTo(FLORIN_LOCATION) > 2) {
                AccBuilderSotf.c = "Nav to burgh gate";
                Movement.walkTo(FLORIN_LOCATION);
                Time.sleepTicks(1);
            } else {
                AccBuilderSotf.c = "Talk to guy";
                g.a("Florin", DIALOG_OPTIONS);
            }
        }
    }

    /**
     * Donate food to Florin (varbit 14).
     */
    private static void donateFood() {
        AccBuilderSotf.c = "Donating food";

        // Use shark on open chest
        Inventory.getFirst("Shark").useOn(TileObjects.getNearest("Open chest"));
        Time.sleepTicks(3);
    }

    /**
     * Clear rubble from the basement (varbit 40-60).
     */
    private static void clearRubbleFromBasement() {
        // Navigate to pub if not there
        if (!QUEST_AREA.contains(Players.getLocal().getWorldLocation()) ||
            Players.getLocal().getWorldLocation().distanceTo(RAZVAN_LOCATION) > 5) {
            AccBuilderSotf.c = "Nav to pub";
            Movement.walkTo(RAZVAN_LOCATION);
            Time.sleepTicks(1);
            return;
        }

        // Talk to Razvan
        if (Players.getLocal().getWorldLocation().distanceTo(RAZVAN_LOCATION) <= 5) {
            AccBuilderSotf.c = "Talk to guy";
            g.a("Razvan", DIALOG_OPTIONS);
        }

        // Handle rubble clearing specific steps
        int rubbleVarbit = Vars.getBit(QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId());

        if (rubbleVarbit == 47) {
            digRubblePile();
        } else if (rubbleVarbit >= 62 && rubbleVarbit <= 50) {
            goDownTrapdoor();
        } else if (rubbleVarbit == 117) {
            handleRubbleClearing();
        }
    }

    /**
     * Dig at the rubble pile.
     */
    private static void digRubblePile() {
        AccBuilderSotf.c = "Nav to rubble pile";

        // Navigate to rubble location if needed
        if (!Players.getLocal().getWorldLocation().equals(new WorldPoint(3496, 3221, 0))) {
            Movement.walkTo(new WorldPoint(3496, 3221, 0));
            Time.sleepTicks(1);
        }
    }

    /**
     * Go down the trapdoor.
     */
    private static void goDownTrapdoor() {
        AccBuilderSotf.c = "Digging rubble";

        // Use bronze pickaxe on rubble
        Inventory.getFirst(BRONZE_PICKAXE).useOn(TileObjects.getNearest(RUBBLE));
        Time.sleepTicks(4);
    }

    /**
     * Handle rubble clearing in basement.
     */
    private static void handleRubbleClearing() {
        AccBuilderSotf.c = "Going down trapdoor";

        // Open and climb down trapdoor
        TileObject trapdoor = TileObjects.getNearest("Trapdoor");
        if (trapdoor != null) {
            trapdoor.interact("Open");
            Time.sleepTicks(2);
        }

        trapdoor = TileObjects.getNearest("Trapdoor");
        if (trapdoor != null) {
            trapdoor.interact("Climb-down");
            Time.sleepTicks(2);
        }

        // Handle bucket of rubble collection
        if (Inventory.contains("Bucket")) {
            if (Inventory.isFull()) {
                // Drop junk items
                dropJunkItems();
            }

            // Mine rubble if in basement
            if (Players.getLocal().getWorldLocation().distanceTo(RAZVAN_LOCATION) <= 8) {
                TileObject rubble = TileObjects.getNearest(RUBBLE);
                if (rubble != null) {
                    mineRubble();
                }
            }

            // Empty buckets on rubble pile
            if (Inventory.contains("Bucket of rubble")) {
                if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3496, 3221, 0)) <= 3) {
                    AccBuilderSotf.c = "Empty Buckets";
                    Inventory.getFirst("Bucket of rubble").useOn(TileObjects.getNearest("Rubble Pile"));
                    Time.sleepTicks(1);
                }
            }
        }
    }

    /**
     * Drop junk items from inventory when full.
     */
    private static void dropJunkItems() {
        String[] junkItems = {"Broken glass", "Bronze nails", "Iron nails", "Rock", "Black nails", "Vial"};

        for (String junkItem : junkItems) {
            if (Inventory.contains(junkItem)) {
                Inventory.getFirst(junkItem).interact("Drop");
            }
        }
    }

    /**
     * Mine rubble in the basement.
     */
    private static void mineRubble() {
        AccBuilderSotf.c = "Mine rubble";

        if (Players.getLocal().getAnimation() == -1 && !Players.getLocal().isMoving()) {
            TileObject rubble = TileObjects.getNearest(RUBBLE);

            // Get all reachable rubble objects
            int[] rubbleIds = {5054, 5055, 5056, 5057, RUBBLE};
            List<TileObject> allRubble = TileObjects.getAll(rubbleIds);
            List<TileObject> reachableRubble = new ArrayList<>();

            for (TileObject obj : allRubble) {
                if (Reachable.isInteractable(obj)) {
                    reachableRubble.add(obj);
                }
            }

            if (!reachableRubble.isEmpty()) {
                TileObject closest = reachableRubble.get(0);
                if (closest.hasAction("Mine")) {
                    closest.interact("Mine");
                    Time.sleepTicks(3);
                } else if (closest.hasAction("Remove")) {
                    closest.interact("Remove");
                    Time.sleepTicks(2);
                }
            }
        }
    }

    /**
     * Repair the general store (varbit 110).
     */
    private static void repairGeneralStore() {
        AccBuilderSotf.c = "Nav to general store";

        if (Dialog.isOpen()) {
            g.a(DIALOG_OPTIONS);
        }

        // Navigate to general store if far
        if (!Dialog.isOpen() && Players.getLocal().getWorldLocation().distanceTo(VELIAF_LOCATION) > 10) {
            // Climb up ladder if in instanced region
            if (Static.getClient().isInInstancedRegion()) {
                TileObject ladder = TileObjects.getNearest("Ladder");
                if (ladder != null) {
                    ladder.interact("Climb-up");
                    Time.sleepTicks(21);
                }
            }
            Movement.walkTo(VELIAF_LOCATION);
            Time.sleepTicks(1);
        }

        // Talk to Aurel once at general store
        if (Players.getLocal().getWorldLocation().distanceTo(VELIAF_LOCATION) <= 10) {
            g.a("Aurel", DIALOG_OPTIONS);
        }

        // Handle roof repair on different floors
        handleGeneralStoreRepair();
    }

    /**
     * Handle general store repair based on current floor.
     */
    private static void handleGeneralStoreRepair() {
        int questVarbit = Vars.getBit(QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId());

        // Climb up ladder from ground floor (floor 0)
        if (questVarbit == 130) {
            if (Players.getLocal().getWorldLocation().getPlane() == 0) {
                AccBuilderSotf.c = "Climb up ladder";
                TileObject ladder = TileObjects.getNearest("Ladder");
                if (ladder != null) {
                    ladder.interact("Climb-up");
                    Time.sleepTicks(4);
                }
            }

            // Repair roof on floor 2
            if (Players.getLocal().getWorldLocation().getPlane() == 2) {
                AccBuilderSotf.c = "Fix roof";
                if (!Dialog.isOpen()) {
                    TileObject brokenRoof = TileObjects.getNearest("Broken Roof");
                    if (brokenRoof != null) {
                        brokenRoof.interact("Inspect");
                        Time.sleepTicks(2);
                    }
                }
                g.a(DIALOG_OPTIONS);
            }
        }

        // Repair damaged wall
        if (questVarbit == 140) {
            if (Players.getLocal().getWorldLocation().getPlane() == 2) {
                AccBuilderSotf.c = "Climb up ladder";
                TileObject ladder = TileObjects.getNearest("Ladder");
                if (ladder != null) {
                    ladder.interact("Climb-down");
                    Time.sleepTicks(4);
                }
            }

            if (Players.getLocal().getWorldLocation().getPlane() == 0) {
                AccBuilderSotf.c = "Fix roof";
                if (!Dialog.isOpen()) {
                    TileObject damagedWall = TileObjects.getNearest("Damaged wall");
                    if (damagedWall != null) {
                        damagedWall.interact("Inspect");
                        Time.sleepTicks(2);
                    }
                }
                g.a(DIALOG_OPTIONS);
            }
        }

        // Final dialog with Aurel
        if (questVarbit == 160) {
            AccBuilderSotf.c = "Nav to general store";

            if (Dialog.isOpen()) {
                g.a(DIALOG_OPTIONS);
            }

            if (!Dialog.isOpen() && Players.getLocal().getWorldLocation().distanceTo(VELIAF_LOCATION) > 10) {
                TileObject ladder = TileObjects.getNearest("Ladder");
                if (ladder != null) {
                    ladder.interact("Climb-up");
                    Time.sleepTicks(21);
                }
                Movement.walkTo(VELIAF_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(VELIAF_LOCATION) <= 10) {
                g.a("Aurel", DIALOG_OPTIONS);
            }
        }
    }

    /**
     * Repair the bank building (varbit 130).
     */
    private static void repairBank() {
        // Navigate to bank if far
        if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3491, 3211, 0)) > 4) {
            AccBuilderSotf.c = "Nav to burgh bank";
            Movement.walkTo(new WorldPoint(3491, 3211, 0));
            Time.sleepTicks(1);
            return;
        }

        // Repair damaged wall
        AccBuilderSotf.c = "Fixing bank";
        TileObject damagedWall = TileObjects.getNearest("Damaged wall");
        if (damagedWall != null) {
            damagedWall.interact("Inspect");
            Time.sleepTicks(2);
            return;
        }

        // Talk to Cornelius to hire banker
        AccBuilderSotf.c = "Hiring banker";
        g.a("Cornelius", DIALOG_OPTIONS);

        // Return to pub to talk to Razvan
        AccBuilderSotf.c = "Nav to pub";
        g.a("Razvan", DIALOG_OPTIONS);
    }

    /**
     * Repair the furnace (varbit 160).
     */
    private static void repairFurnace() {
        // Navigate to furnace
        AccBuilderSotf.c = "Nav to furnace";

        // Repair broken furnace
        AccBuilderSotf.c = "Repair furnace";
        TileObject brokenFurnace = TileObjects.getNearest("Broken furnace");
        if (brokenFurnace != null) {
            brokenFurnace.interact("Inspect");
            Time.sleepTicks(2);
            return;
        }

        // Light repaired furnace
        AccBuilderSotf.c = "Lighting furnace";
        TileObject repairedFurnace = TileObjects.getNearest("Repaired furnace");
        if (repairedFurnace != null) {
            repairedFurnace.interact("Repaired furnace");
            Time.sleepTicks(2);
        }

        // Talk to general store guys
        AccBuilderSotf.c = "Nav to general store";
        AccBuilderSotf.c = "Talking to guys";
        g.a("Gadderanks", DIALOG_OPTIONS);
    }

    /**
     * Fight the vampyres that attack the town (varbit 165).
     */
    private static void fightVampyres() {
        AccBuilderSotf.c = "Handling fight";

        // Use barrows teleport to drink if near Veliaf
        if (Players.getLocal().getWorldLocation().distanceTo(b.I) <= 150) {
            Bank.close();
            if (Inventory.contains(BARROWS_TELEPORT) && Players.getLocal().getAnimation() == -1) {
                Inventory.getFirst(BARROWS_TELEPORT).interact("Break");
                Time.sleepTicks(2);
            }
        }

        // Navigate to Veliaf if far
        if (Players.getLocal().getWorldLocation().distanceTo(b.I) > 150) {
            if (Dialog.isOpen()) {
                Dialog.close();
            }

            if (Players.getLocal().getWorldLocation().distanceTo(VELIAF_LOCATION) > 7) {
                Movement.walkTo(VELIAF_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(VELIAF_LOCATION) <= 10) {
                g.a("Aurel", DIALOG_OPTIONS);
            }
        }

        // Attack vampyre juvinate
        NPC vampyreJuvinate = NPCs.getNearest("Vampyre Juvinate");
        if (vampyreJuvinate != null && vampyreJuvinate.getHealthRatio() > 0) {
            // Drink prayer potion if needed
            if (Inventory.contains(PRAYER_POTION_4) && Prayers.getPoints() < 20) {
                Inventory.getFirst(PRAYER_POTION_4).interact("Drink");
                Time.sleepTicks(1);
            }

            vampyreJuvinate.interact("Attack");
            Time.sleepTicks(1);
            return;
        }

        // Attack Gadderanks
        NPC gadderanks = NPCs.getNearest("Gadderanks");
        if (gadderanks != null && gadderanks.getHealthRatio() > 0) {
            gadderanks.interact("Attack");
            Time.sleepTicks(1);
            return;
        }

        // Talk to Gadderanks after fight
        AccBuilderSotf.c = "Talking to gadderanks";
        g.a("Gadderanks", DIALOG_OPTIONS);

        // Talk to Veliaf
        g.a("Veliaf Hurtz", DIALOG_OPTIONS);
        AccBuilderSotf.c = "Talking to veliaf";
        g.a("Veliaf Hurtz", DIALOG_OPTIONS);

        // Enter cave for final dialog
        AccBuilderSotf.c = "Entering cave";
        TileObject caveEntrance = TileObjects.getNearest("Cave entrance");
        if (caveEntrance != null) {
            caveEntrance.interact("Enter");
            Time.sleepTicks(2);
        }

        g.a("Veliaf Hurtz", DIALOG_OPTIONS);
    }

    /**
     * Prepare for vyrewatch encounter by making disguise items.
     */
    private static void prepareForVyrewatch() {
        BankLocation nearestBank = BankLocation.VARROCK_WEST_BANK;

        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to bank";

            // Use salve graveyard teleport if far from Veliaf
            if (Players.getLocal().getWorldLocation().distanceTo(VELIAF_LOCATION) > 20) {
                Inventory.getFirst(SALVE_GRAVEYARD_TELEPORT).interact("Break");
                Time.sleepTicks(5);
            }

            a.a(nearestBank);  // Walk to bank
        }

        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            if (!Bank.isOpen()) {
                a.a();  // Open bank
                Time.sleepUntil(Bank::isOpen, 5000);

                // Open Burgh de Rott bank if available
                TileObject bankChest = TileObjects.getNearest(BANK_CHEST);
                if (bankChest != null && Players.getLocal().getWorldLocation().distanceTo(FURNACE_LOCATION) <= 10) {
                    bankChest.interact("Bank");
                    Time.sleepTicks(2);
                }
            }

            if (Bank.isOpen()) {
                AccBuilderSotf.c = "Handling banking";

                // Deposit all items
                if (!Inventory.getAll().isEmpty()) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                }

                // Withdraw items for vyrewatch disguise
                if (!preparedForVyrewatch) {
                    Bank.withdraw("Citizen clothing", 1, Bank.WithdrawMode.DEFAULT);
                    a.a(BRONZE_AXE, 10);
                    a.a(TINDERBOX, 3);
                    a.a(MACKEREL, 10);

                    if (hasTinderbox) {
                        a.a(THIN_SNAIL, 10);
                    }
                }
            }

            // Make vyrewatch disguise items
            if (Inventory.contains("Citizen clothing") && !preparedForVyrewatch) {
                // Use items on each other to create disguise
                handleVyrewatchCrafting();
            }
        }
    }

    /**
     * Handle crafting vyrewatch disguise items.
     */
    private static void handleVyrewatchCrafting() {
        Bank.close();

        if (Dialog.isOpen()) {
            Dialog.close();
        }

        Time.sleepTicks(4);

        if (!Dialog.isOpen()) {
            // Craft disguise items by using them on each other
            if (Inventory.contains("Citizen clothing")) {
                Inventory.getFirst("Citizen clothing").useOn(Inventory.getFirst("Vyrewatch disguise"));
                Time.sleepTicks(4);

                while (Dialog.isOpen()) {
                    g.a(DIALOG_OPTIONS);
                    Time.sleepTicks(1);
                }
            }

            if (Inventory.contains("Citizen shoes")) {
                Inventory.getFirst("Citizen shoes").useOn(Inventory.getFirst("Vyrewatch disguise"));
                Time.sleepTicks(4);

                while (Dialog.isOpen()) {
                    g.a(DIALOG_OPTIONS);
                    Time.sleepTicks(1);
                }
            }

            // Add tinderbox if needed
            if (hasTinderbox) {
                Inventory.getFirst(MACKEREL).useOn(Inventory.getFirst("Vyrewatch disguise"));
                Time.sleepTicks(4);

                while (Dialog.isOpen()) {
                    g.a(DIALOG_OPTIONS);
                    Time.sleepTicks(1);
                }

                Inventory.getFirst(THIN_SNAIL).useOn(Inventory.getFirst("Vyrewatch disguise"));
                Time.sleepTicks(4);

                while (Dialog.isOpen()) {
                    g.a(DIALOG_OPTIONS);
                    Time.sleepTicks(1);
                }
            }

            // Check if disguise is complete
            if (!Inventory.contains("Vyrewatch disguise (legs)")) {
                hasTinderbox = true;
            }

            if (!Inventory.contains("Vyrewatch disguise (top)")) {
                hasVial = true;
            }

            // Check completion widget
            if (Inventory.contains("Vyrewatch disguise")) {
                Inventory.getFirst("Vyrewatch disguise").interact("Check");
                Time.sleepTicks(4);

                Widget completeWidget = Widgets.get(219, 1);
                if (completeWidget != null && completeWidget.getText().contains("You have completed")) {
                    preparedForVyrewatch = true;
                }
            }
        }

        g.a(DIALOG_OPTIONS);
    }

    /**
     * Handle vyrewatch preparation (banking and getting supplies).
     */
    private static void handleVyrewatchPrep() {
        bankAndGetSupplies();
    }

    /**
     * Bank and get supplies for temple trek.
     */
    private static void bankAndGetSupplies() {
        if (Players.getLocal().getWorldLocation().distanceTo(FURNACE_LOCATION) > 5) {
            AccBuilderSotf.c = "Nav to burgh bank";
            Movement.walkTo(FURNACE_LOCATION);
            Time.sleepTicks(1);
            return;
        }

        if (Players.getLocal().getWorldLocation().distanceTo(FURNACE_LOCATION) <= 5) {
            if (!Bank.isOpen()) {
                TileObject bankChest = TileObjects.getNearest(BANK_CHEST);
                if (bankChest != null) {
                    bankChest.interact("Bank");
                    Time.sleepTicks(2);
                }
            }

            if (Bank.isOpen() && Bank.isOpen()) {
                AccBuilderSotf.c = "Handling banking";

                if (!Inventory.getAll().isEmpty()) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                }

                // Withdraw items for temple trek
                a.a(SALMON, 5);
                a.a(MITHRIL_BAR, 5);
                a.a(SILVER_BAR, 1);
                a.a(HAMMER, 1);
                a.a(CHISEL, 1);
                a.a(ROPE, 1);
                a.a(WATER_RUNE, 1);
                a.a(SWAMP_PASTE, 3);
                a.a(STEEL_PLATELEGS, 1);
                a.a(BARROWS_TELEPORT, 5);
                a.a(SALVE_GRAVEYARD_TELEPORT, 5);
                a.a(SALVE_GRAVEYARD_TELEPORT, 5);
                a.b(f.aS, 1);  // Stamina potion

                // Withdraw coins if needed
                if (!Inventory.contains(SWAMP_PASTE)) {
                    a.a(995, 2);  // Coins
                }
            }
        }
    }

    /**
     * Complete Temple Trek with Ivan Strom (varbit 170).
     */
    private static void templeTrekWithIvan() {
        // Navigate to start location
        AccBuilderSotf.c = "Nav to start";

        // Talk to Polmafi
        AccBuilderSotf.c = "Talk to Polmafi";
        NPC polmafi = NPCs.getNearest("Polmafi Ferdygris");
        if (polmafi != null) {
            polmafi.interact("Talk-to");
            Time.sleepTicks(2);
        }

        g.a("Polmafi Ferdygris", DIALOG_OPTIONS);

        // Give Ivan Strom gear and food
        AccBuilderSotf.c = "Giving Ivan gear";
        NPC ivan = NPCs.getNearest("Ivan Strom");
        if (ivan != null) {
            // Give steel platebody
            if (Inventory.contains(STEEL_PLATEBODY)) {
                ivan.useItem(Inventory.getFirst(STEEL_PLATEBODY));
                Time.sleepTicks(2);
            }

            // Give steel platelegs
            if (Inventory.contains(STEEL_PLATELEGS)) {
                ivan.useItem(Inventory.getFirst(STEEL_PLATELEGS));
                Time.sleepTicks(2);
            }

            // Give steel full helm
            if (Inventory.contains(STEEL_FULL_HELM)) {
                ivan.useItem(Inventory.getFirst(STEEL_FULL_HELM));
                Time.sleepTicks(2);
            }

            // Give rune scimitar
            if (Inventory.contains(RUNE_SCIMITAR)) {
                ivan.useItem(Inventory.getFirst(RUNE_SCIMITAR));
                Time.sleepTicks(2);
            }

            // Give steel kiteshield
            if (Inventory.contains(STEEL_KITESHIELD)) {
                ivan.useItem(Inventory.getFirst(STEEL_KITESHIELD));
                Time.sleepTicks(2);
            }

            // Give salmon
            if (Inventory.contains(SALMON)) {
                ivan.useItem(Inventory.getFirst(SALMON));
                Time.sleepTicks(2);
            }
        }

        // Talk to Ivan to start trek
        AccBuilderSotf.c = "Talk to Ivan";
        if (ivan != null) {
            ivan.interact("Talk-to");
            Time.sleepTicks(2);
        }

        // Start the trek
        AccBuilderSotf.c = "Starting trek";
        g.a("Ivan Strom", DIALOG_OPTIONS);
    }

    // ==================== HELPER METHODS ====================

    /**
     * Check if player has all required items in inventory/bank.
     */
    private static boolean hasRequiredItems() {
        int[] requiredItems = {
            SPADE, BUCKET, BRONZE_PICKAXE, HAMMER, PLANK, STEEL_NAILS,
            TINDERBOX, COAL, STEEL_BAR, CHISEL, SHARK, SALMON,
            PRAYER_POTION_4, BARROWS_TELEPORT, SALVE_GRAVEYARD_TELEPORT,
            BRONZE_AXE, SWAMP_PASTE, STAMINA_POTION_4, EFARITAYS_AID
        };

        return e.c(requiredItems);
    }

    /**
     * Check if player has required gear equipped (Rune scimitar and Efaritay's aid).
     */
    private static boolean hasRequiredGear() {
        return Equipment.contains(RUNE_SCIMITAR) && Equipment.contains(EFARITAYS_AID);
    }

    /**
     * Check if player has inventory supplies for temple trek.
     */
    private static boolean hasInventorySupplies() {
        return Inventory.contains(STEEL_NAILS) &&
               Inventory.contains("Citizen clothing") &&
               Inventory.contains("Citizen shoes") &&
               Inventory.contains("Vyrewatch disguise") &&
               Inventory.contains("Vyrewatch top") &&
               Inventory.contains("Vyrewatch legs") &&
               Inventory.contains(EFARITAYS_AID) &&
               Inventory.contains(BARROWS_TELEPORT);
    }

    /**
     * Check if player has basic supplies.
     */
    private static boolean hasBasicSupplies() {
        return Inventory.contains("Citizen clothing") &&
               Inventory.contains("Citizen shoes") &&
               Inventory.contains("Vyrewatch disguise") &&
               Inventory.contains("Vyrewatch top");
    }

    /**
     * Switch to buying mode to purchase missing items.
     */
    private static void switchToBuyingMode() {
        // Implementation depends on the account builder system
        // This would interact with the buying module to purchase items
    }

    @Override
    public String ag() {
        return questName;
    }

    @Override
    public int af() {
        try {
            execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 600;  // Tick delay
    }

    @Override
    public boolean ah() {
        return Vars.getBit(QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()) >= 180 && !Dialog.isOpen();
    }
}
