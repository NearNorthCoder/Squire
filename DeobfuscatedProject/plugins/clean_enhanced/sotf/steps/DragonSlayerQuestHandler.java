package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

import java.util.ArrayList;
import java.util.List;

// Import obfuscated classes that still need to be referenced
import gg.squire.sotf.framework.*; // BankingUtil
import gg.squire.sotf.framework.*;
import gg.squire.sotf.framework.*; // QuestStep interface
import gg.squire.sotf.framework.*; // ShopUtil
import gg.squire.sotf.framework.*; // ShopItem
import gg.squire.sotf.framework.*; // QuestUtil
import gg.squire.sotf.framework.*; // ItemIds
import gg.squire.sotf.framework.*; // DialogUtil
import gg.squire.sotf.framework.*; // ItemIds2

/**
 * Dragon Slayer quest handler for the SOTF plugin.
 *
 * This quest step handles the complete Dragon Slayer quest, including:
 * - Obtaining map pieces from Melzar's Maze, Oracle, and Lozar
 * - Finding and repairing the ship
 * - Fighting Elvarg
 * - Completing the quest
 *
 * The quest is a prerequisite for completing the SOTF (Secrets of the North) quest line.
 */
public class DragonSlayerQuestHandler implements QuestStep {

    // Quest varbit IDs
    private static final int QUEST_VARBIT = 176;
    private static final int MAZE_KEY_VARBIT = 3127;
    private static final int LOZAR_MAP_PIECE_VARBIT = 32607;
    private static final int THALZAR_MAP_PIECE_VARBIT = 32543;
    private static final int MELZAR_MAP_PIECE_VARBIT = 7935;
    private static final int ANTI_DRAGON_SHIELD_VARBIT = 7551;

    // Item IDs
    private static final int CRANDOR_MAP = 1535;
    private static final int ANTI_DRAGON_SHIELD_ID = 1537;
    private static final int ANTI_DRAGON_SHIELD_ID_2 = 1536;
    private static final int RUNE_SCIMITAR = 1539;
    private static final int LOBSTER_POT = 7919;
    private static final int SILK = 8007;
    private static final int UNFIRED_BOWL = 8009;
    private static final int WIZARDS_MIND_BOMB = 8008;
    private static final int PLANK = 21959;
    private static final int STEEL_NAILS = 1539;
    private static final int RED_KEY = 28127;
    private static final int ORANGE_KEY = 1936;
    private static final int YELLOW_KEY = 32235;
    private static final int BLUE_KEY = 11808;
    private static final int MAGENTA_KEY = 12136;
    private static final int GREEN_KEY = 11816;
    private static final int MAZE_KEY = 16851;

    // World locations
    public static final WorldPoint CHAMPIONS_GUILD = new WorldPoint(3189, 3354, 0);
    public static final WorldPoint OZIACH_LOCATION = new WorldPoint(3066, 3516, 0);
    public static final WorldPoint MELZAR_MAZE_ENTRANCE = new WorldPoint(2931, 3247, 1);
    public static final WorldPoint CRANDOR_ENTRANCE = new WorldPoint(2834, 9655, 0);

    // State flags
    public static boolean needToBuyItems = false;
    public static boolean hasMelzarMapPiece = false;
    public static boolean hasThalzarMapPiece = false;
    public static boolean hasLozarMapPiece = false;
    public static boolean hasAntiDragonShield = false;
    private static int elvargPhase = 0;

    // Shopping list
    public static List<d> itemsToBuy = new ArrayList<>();

    // Dialog options
    public static String[] questDialogOptions = new String[] {
        "Can I have a quest?",
        "Yes.",
        "Can you sell me a rune platebody?",
        "The Guildmaster of the Champions' Guild told me.",
        "I thought you were going to give me a quest.",
        "A dragon, that sounds like fun.",
        "I talked to Oziach...",
        "Where can I find the right ship?",
        "I seek a piece of the map to the island of Crandor.",
        "I believe you've got a piece of map that I need.",
        "I suppose I could pay you for the map piece...",
        "Alright then, 10,000 it is.",
        "I'd like to buy her.",
        "Yep, sounds good.",
        "You're a sailor? Could you take me to Crandor?",
        "Yes, let's go!"
    };

    @Override
    public String getName() {
        return "Dragon slayer 1 quest";
    }

    @Override
    public boolean isComplete() {
        // Check if quest is complete
        return GameStateUtil.getVarbit(QUEST_VARBIT) >= 10 && !Dialog.isOpen();
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        try {
            executeQuestLogic();
        } catch (Exception e) {
            // Silently handle errors
        }
        return 100; // Continue
    }

    /**
     * Main quest execution logic
     */
    public static void executeQuestLogic() {
        // Handle item buying
        if (needToBuyItems) {
            AccBuilderSotf.c = "Buying items";
            b.a(itemsToBuy);
            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                needToBuyItems = false;
            }
        }

        if (!needToBuyItems) {
            // Update map piece flags
            if (Inventory.contains("Crandor map")) {
                hasMelzarMapPiece = true;
                hasThalzarMapPiece = true;
                hasLozarMapPiece = true;
                hasAntiDragonShield = true;
            }

            // Update individual flags based on inventory
            if (Inventory.contains(CRANDOR_MAP)) {
                hasThalzarMapPiece = true;
            }
            if (Inventory.contains(ANTI_DRAGON_SHIELD_ID)) {
                hasLozarMapPiece = true;
            }
            if (Inventory.contains(ANTI_DRAGON_SHIELD_ID_2)) {
                hasAntiDragonShield = true;
            }

            // Handle stamina and prayer potions
            if (Inventory.contains(f.ba) && Movement.getRunEnergy() < 60) {
                Inventory.getFirst(f.ba).interact("Drink");
                Time.sleepTicks(1);
            }

            if (Inventory.contains(f.aX) && Prayers.getPoints() < 30) {
                Inventory.getFirst(f.aX).interact("Drink");
            }

            // Eat food if low health
            if (Combat.getMissingHealth() >= 20 || GameStateUtil.getHealthPercentage() < 51.0) {
                if (Inventory.contains("Shark")) {
                    Inventory.getFirst("Shark").interact("Eat");
                }
            }

            // Enable run
            if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 0) {
                Movement.toggleRun();
            }

            // Handle different quest stages
            int questProgress = GameStateUtil.getVarbit(QUEST_VARBIT);

            // Stage 0: Not started - need to bank
            if (!hasAllRequiredItems() && questProgress <= 2 && e.J() >= 32) {
                handleBankingForQuestStart();
            }

            // Stage 1: Talk to Guildmaster
            if (hasAllRequiredItems() && questProgress < 1) {
                if (Players.getLocal().getWorldLocation().distanceTo(CHAMPIONS_GUILD) > 6) {
                    AccBuilderSotf.c = "Nav to champ guild";
                    Movement.walkTo(CHAMPIONS_GUILD);
                    Time.sleepTicks(1);
                } else {
                    AccBuilderSotf.c = "Talking";
                    g.a("Guildmaster", questDialogOptions, 1);
                }
            }

            // Stage 1: Talk to Oziach
            if (questProgress == 1 && hasAllRequiredItems()) {
                if (Players.getLocal().getWorldLocation().distanceTo(OZIACH_LOCATION) > 8) {
                    AccBuilderSotf.c = "Nav to oziach";
                    Movement.walkTo(OZIACH_LOCATION);
                    Time.sleepTicks(1);
                } else {
                    g.a("Oziach", questDialogOptions, 1);
                }
            }

            // Stage 2: Equip items and get map pieces
            if (questProgress == 2) {
                elvargPhase = 0;

                // Equip rune scimitar
                if (Inventory.contains(RUNE_SCIMITAR) && !Equipment.contains(RUNE_SCIMITAR)) {
                    Inventory.getFirst("Rune scimitar").interact("Wield");
                }

                // Equip amulet of glory
                if (Inventory.contains(item -> item.getName().contains("glory")) &&
                    !Equipment.contains(item -> item.getName().contains("glory"))) {
                    Inventory.getFirst(item -> item.getName().contains("glory")).interact("Wear");
                }

                // Equip ring of wealth
                if (Inventory.contains(item -> item.getName().contains("wealth")) &&
                    !Equipment.contains(item -> item.getName().contains("wealth"))) {
                    Inventory.getFirst(item -> item.getName().contains("wealth")).interact("Wear");
                }

                // Get maze key if needed
                if (Vars.getBit(MAZE_KEY_VARBIT) != 1 && !Inventory.contains("Maze key") && !hasMelzarMapPiece) {
                    navigateToChampionsGuildForKey();
                }

                // Get map pieces if needed
                if ((!Vars.getBit(MAZE_KEY_VARBIT) && !Vars.getBit(THALZAR_MAP_PIECE_VARBIT) &&
                     Vars.getBit(ANTI_DRAGON_SHIELD_VARBIT)) ||
                    (GameStateUtil.getVarbit(14) == 15 && !Vars.getBit(LOZAR_MAP_PIECE_VARBIT))) {

                    if (Inventory.contains("Maze key")) {
                        handleOracleMapPiece();
                    }
                }

                // Handle Melzar's Maze for map piece
                if (Vars.getBit(LOZAR_MAP_PIECE_VARBIT) == 1 &&
                    (!Vars.getBit(7551) || !hasLozarMapPiece)) {

                    if (!Inventory.contains("Lobster pot") && !Vars.getBit(24171)) {
                        handleMelzarsMazePrep();
                    }

                    if (Inventory.contains("Lobster pot")) {
                        handleMelzarsMaze();
                    }
                }

                // Break completed map and go to Wormbrain
                if (hasLozarMapPiece && hasAntiDragonShield && hasThalzarMapPiece) {
                    handleWormbrainMapPiece();
                }

                // Handle Melzar's Maze navigation
                if (hasLozarMapPiece && hasAntiDragonShield && !hasThalzarMapPiece) {
                    handleMelzarMazeNavigation();
                }
            }

            // Handle Ned and ship repair
            handleNedAndShipRepair();

            // Handle Elvarg boss fight
            handleElvargFight();

            // Final dialog with Oziach
            handleFinalOziachDialog();
        }
    }

    /**
     * Check if player has all required quest items
     */
    private static boolean hasAllRequiredItems() {
        int[] requiredItems = {8007, 8009, 8008, 7919};
        for (int itemId : requiredItems) {
            if (!Inventory.contains(itemId)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Handle banking at quest start
     */
    private static void handleBankingForQuestStart() {
        BankLocation bank = BankLocation.getNearest();

        if (bank != null && !bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to bank";
            Movement.walkTo(bank);
            Time.sleepTicks(2);
        }

        if (bank != null && bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Handling banking";

            if (!Bank.isOpen()) {
                a.a();
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
                if (!Bank.contains(LOBSTER_POT) || Bank.getFirst(LOBSTER_POT).getQuantity() < 15) {
                    prepareBuyList();
                    System.out.println("We are missing teleports, switching to BUYING");
                    needToBuyItems = true;
                    return;
                }

                if (Bank.contains(STEEL_NAILS) && Bank.getFirst(STEEL_NAILS).getQuantity() < 90) {
                    prepareBuyList();
                    System.out.println("We are missing steel nails, switching to BUYING");
                    needToBuyItems = true;
                    return;
                }

                if (Bank.contains(PLANK) && Bank.getFirst(PLANK).getQuantity() < 3) {
                    prepareBuyList();
                    System.out.println("We are missing planks, switching to BUYING");
                    needToBuyItems = true;
                    return;
                }

                // Withdraw quest items
                a.a(LOBSTER_POT, 5);
                a.a(8008, 5);
                a.a(8009, 5);
                a.b(f.ba, 5);
                a.a(1537, 5);
                a.a(RUNE_SCIMITAR, 1);
                a.a(1539, 1);
                a.a(PLANK, 3);
                a.a(7922, 1);
                a.a(STEEL_NAILS, 90);

                // Equip amulet of glory if available
                if (!Inventory.contains(11980)) {
                    Bank.withdraw(11980, 1, Bank.WithdrawMode.ITEM);
                }
            }
        }
    }

    /**
     * Prepare the shopping list for missing items
     */
    private static void prepareBuyList() {
        itemsToBuy.clear();

        // Add teleport tablets
        if (!Bank.contains(PLANK) || Bank.getFirst(PLANK).getQuantity() < 3) {
            itemsToBuy.add(new d(PLANK, 3, 17406));
        }

        // Add stamina potions
        if (!Bank.contains(1537) || Bank.getFirst(1537).getQuantity() < 14) {
            itemsToBuy.add(new d(1537, 14, 17406));
        }

        // Add other required items
        if (Bank.contains(LOBSTER_POT)) {
            itemsToBuy.add(new d(LOBSTER_POT, 1, 17422));
        }
        if (Bank.contains(SILK)) {
            itemsToBuy.add(new d(SILK, 1, 17423));
        }
        if (Bank.contains(UNFIRED_BOWL)) {
            itemsToBuy.add(new d(UNFIRED_BOWL, 1, 17424));
        }
        if (Bank.contains(WIZARDS_MIND_BOMB)) {
            itemsToBuy.add(new d(WIZARDS_MIND_BOMB, 3, 17422));
        }
        if (Bank.contains(STEEL_NAILS)) {
            itemsToBuy.add(new d(STEEL_NAILS, 90, j.cf));
        }

        // Add ring of wealth if available
        if (Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            itemsToBuy.add(new d(16383, 5, 17423));
        }
    }

    /**
     * Navigate to Champions Guild to get key
     */
    private static void navigateToChampionsGuildForKey() {
        if (Players.getLocal().getWorldLocation().distanceTo(CHAMPIONS_GUILD) > 6) {
            AccBuilderSotf.c = "Nav to champ guild";
            if (Inventory.isFull() && Inventory.contains(1537)) {
                Inventory.getFirst(1537).interact("Eat");
                Time.sleepTicks(1);
            }
            Movement.walkTo(CHAMPIONS_GUILD);
            Time.sleepTicks(1);
        } else {
            AccBuilderSotf.c = "Talking";
            if (!Dialog.isOpen()) {
                g.a("Guildmaster", questDialogOptions, 1);
            }

            if (Vars.getBit(24035) == 1) {
                g.a("Where can I find the right ship?", "I talked to Oziach...");
            }
            if (Vars.getBit(12798) == 1) {
                g.a("How can I protect myself from the dragon's breath?");
            }
            if (Vars.getBit(7679) == 1 && Vars.getBit(12798)) {
                if (!Inventory.contains("Maze key")) {
                    g.a("How can I find the route to Crandor?", "Where is Melzar's map piece?");
                }
            }
            if (Vars.getBit(32543) == 1) {
                g.a("How can I find the route to Crandor?", "Where is Thalzar's map piece?");
            }
            if (Vars.getBit(MAZE_KEY_VARBIT) == 1) {
                g.a("How can I find the route to Crandor?", "Where is Lozar's map piece?");
            }
        }
    }

    /**
     * Handle getting the Oracle's map piece
     */
    private static void handleOracleMapPiece() {
        if (Inventory.contains("Maze key")) {
            WorldPoint oracleLocation = new WorldPoint(3013, 3201, 0);

            if (NPCs.getNearest("Oracle") == null) {
                AccBuilderSotf.c = "Nav to oracle";
                Movement.walkTo(oracleLocation);
                Time.sleepTicks(1);
            }

            if (NPCs.getNearest("Oracle") != null) {
                g.a("Oracle", questDialogOptions);
            }
        }
    }

    /**
     * Prepare for Melzar's Maze (get required items from bank)
     */
    private static void handleMelzarsMazePrep() {
        handleMelzarBanking();
    }

    /**
     * Handle banking for Melzar's Maze items
     */
    private static void handleMelzarBanking() {
        BankLocation bank = BankLocation.getNearest();

        if (bank != null && !bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to bank";
            Movement.walkTo(bank);
            Time.sleepTicks(2);
        }

        if (bank != null && bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Handling banking";

            if (!Bank.isOpen()) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), 5000);
            }

            if (Bank.isOpen()) {
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                }

                // Withdraw Melzar maze items
                a.a(LOBSTER_POT, 5);
                a.a(8008, 5);
                a.a(8009, 5);
                a.b(f.ba, 2);
                a.a(RUNE_SCIMITAR, 4);
                a.a(SILK, 1);
                a.a(UNFIRED_BOWL, 1);
                a.a(WIZARDS_MIND_BOMB, 1);
                a.a(STEEL_NAILS, 90);
                Bank.withdraw("Maze key", 1, Bank.WithdrawMode.ITEM);

                if (!Inventory.contains(11980) && !Equipment.contains(11980)) {
                    Bank.withdraw(11980, 1, Bank.WithdrawMode.ITEM);
                }

                a.a(1537, Inventory.getFreeSlots());
            }
        }
    }

    /**
     * Navigate through Melzar's Maze
     */
    private static void handleMelzarsMaze() {
        WorldPoint mazeEntrance = new WorldPoint(20521, 30258, 0);

        if (Players.getLocal().getWorldLocation().distanceTo(mazeEntrance) > 4) {
            AccBuilderSotf.c = "Nav to maze";
            if (Dialog.isOpen()) {
                Dialog.close();
            }
            Movement.walkTo(mazeEntrance);
            Time.sleepTicks(1);
        }

        if (Players.getLocal().getWorldLocation().distanceTo(mazeEntrance) <= 10) {
            if (!Vars.getBit(7551)) {
                AccBuilderSotf.c = "Handling magic door";

                // Use items on magic door
                if (Inventory.contains("Silk")) {
                    Inventory.getFirst("Silk").useOn(TileObjects.getNearest("Magic door"));
                    Time.sleepTicks(1);
                }
                if (Inventory.contains("Lobster pot")) {
                    Inventory.getFirst("Lobster pot").useOn(TileObjects.getNearest("Magic door"));
                    Time.sleepTicks(1);
                }
                if (Inventory.contains("Unfired bowl")) {
                    Inventory.getFirst("Unfired bowl").useOn(TileObjects.getNearest("Magic door"));
                    Time.sleepTicks(1);
                }
                if (Inventory.contains("Wizard's mind bomb")) {
                    Inventory.getFirst("Wizard's mind bomb").useOn(TileObjects.getNearest("Magic door"));
                    Time.sleepTicks(1);
                }
            }

            // Open chest and search if maze is complete
            if (Vars.getBit(7551) == 1) {
                TileObject chest = TileObjects.getNearest("Chest");
                if (chest != null && !hasLozarMapPiece) {
                    if (!Reachable.isInteractable(chest)) {
                        TileObjects.getNearest("Magic door").interact("Open");
                        Time.sleepTicks(8);
                    }

                    if (Reachable.isInteractable(chest) && !Dialog.isOpen()) {
                        if (chest.hasAction("Open")) {
                            chest.interact("Open");
                            Time.sleepTicks(4);
                        }
                        if (chest.hasAction("Search")) {
                            chest.interact("Search");
                            Time.sleepTicks(4);
                        }
                    }
                }
            }
        }
    }

    /**
     * Handle getting Wormbrain's map piece
     */
    private static void handleWormbrainMapPiece() {
        WorldArea wormbrainArea = new WorldArea(15146, 3526, 0);

        if (Players.getLocal().getWorldLocation().distanceTo(wormbrainArea.toWorldPoint()) <= 10) {
            // Break the Crandor map
            Inventory.getFirst(8009).interact("Break");
            Time.sleepTicks(8);
        }

        WorldPoint wormbrainCell = new WorldPoint(11816, 28651, 0);
        if (!Players.getLocal().getWorldLocation().equals(wormbrainCell)) {
            AccBuilderSotf.c = "Nav to wormbrain";
            if (!Dialog.isOpen()) {
                Movement.walkTo(wormbrainCell);
                Time.sleepTicks(1);
            }
            g.a("Can I journey on this ship?",
                "Search away, I have nothing to hide.",
                "Ok.");
        }

        if (Players.getLocal().getWorldLocation().equals(wormbrainCell)) {
            AccBuilderSotf.c = "Talking";
            g.a("Wormbrain", questDialogOptions);
        }
    }

    /**
     * Handle Melzar Maze navigation with colored keys
     */
    private static void handleMelzarMazeNavigation() {
        // Drop beer glass if in inventory
        if (Inventory.contains("Beer glass")) {
            Inventory.getFirst("Beer glass").interact("Drop");
        }

        // Complex maze navigation logic
        WorldArea groundFloor = new WorldArea(28411, 11762, 19, 20, 0);
        WorldArea firstFloor = new WorldArea(20339, 29680, 11, 7, 0);

        // Navigate through different floors and kill monsters for keys
        if (Players.getLocal().getWorldLocation().getPlane() == 0) {
            handleGroundFloorMaze();
        } else if (Players.getLocal().getWorldLocation().getPlane() == 1) {
            handleFirstFloorMaze();
        } else if (Players.getLocal().getWorldLocation().getPlane() == 2) {
            handleSecondFloorMaze();
        }

        // Handle ladder climbing
        handleMazeLadders();
    }

    /**
     * Handle ground floor of Melzar's Maze
     */
    private static void handleGroundFloorMaze() {
        // Get red key if needed
        if (!Inventory.contains(RED_KEY) && TileItems.getNearest(RED_KEY) == null) {
            AccBuilderSotf.c = "Getting key";
            if (Players.getLocal().getInteracting() == null) {
                NPCs.getNearest(32543).interact("Attack");
                Time.sleepTicks(5);
            }
        }

        if (TileItems.getNearest(RED_KEY) != null) {
            TileItems.getNearest(RED_KEY).interact("Take");
            Time.sleepTicks(3);
        }

        // Navigate to red door
        if (Inventory.contains(RED_KEY)) {
            WorldPoint redDoorLocation = new WorldPoint(6890, 32624, 0);

            if (!Players.getLocal().getWorldLocation().equals(redDoorLocation)) {
                AccBuilderSotf.c = "Nav to red door";
                GameStateUtil.randomRange(redDoorLocation);
                Time.sleepTicks(2);
            }

            if (Players.getLocal().getWorldLocation().equals(redDoorLocation)) {
                TileObjects.getNearest("Red door").interact("Open");
                Time.sleepTicks(6);
            }
        }
    }

    /**
     * Handle first floor of Melzar's Maze
     */
    private static void handleFirstFloorMaze() {
        // Get orange key if needed
        if (!Inventory.contains(ORANGE_KEY) && TileItems.getNearest(ORANGE_KEY) == null) {
            AccBuilderSotf.c = "Getting key";
            if (Players.getLocal().getInteracting() == null) {
                NPCs.getNearest(12231).interact("Attack");
                Time.sleepTicks(5);
            }
        }

        if (TileItems.getNearest(ORANGE_KEY) != null) {
            TileItems.getNearest(ORANGE_KEY).interact("Take");
            Time.sleepTicks(3);
        }

        // Navigate to orange door and climb up
        if (Inventory.contains(ORANGE_KEY)) {
            WorldPoint orangeDoorLocation = new WorldPoint(20339, 20283, 1);

            if (!Players.getLocal().getWorldLocation().equals(orangeDoorLocation)) {
                AccBuilderSotf.c = "Nav to orange door";
                GameStateUtil.randomRange(orangeDoorLocation);
                Time.sleepTicks(2);
            }

            if (Players.getLocal().getWorldLocation().equals(orangeDoorLocation)) {
                TileObjects.getNearest("Orange door").interact("Open");
                Time.sleepTicks(6);
            }
        }
    }

    /**
     * Handle second floor of Melzar's Maze
     */
    private static void handleSecondFloorMaze() {
        // Get yellow key if needed
        if (!Inventory.contains(YELLOW_KEY) && TileItems.getNearest(YELLOW_KEY) == null) {
            AccBuilderSotf.c = "Getting key";
            if (Players.getLocal().getInteracting() == null) {
                NPCs.getNearest(12359).interact("Attack");
                Time.sleepTicks(5);
            }
        }

        if (TileItems.getNearest(YELLOW_KEY) != null) {
            TileItems.getNearest(YELLOW_KEY).interact("Take");
            Time.sleepTicks(3);
        }

        // Navigate to yellow door
        if (Inventory.contains(YELLOW_KEY)) {
            WorldPoint yellowDoorLocation = new WorldPoint(28411, 14214, 2);

            if (!Players.getLocal().getWorldLocation().equals(yellowDoorLocation)) {
                AccBuilderSotf.c = "Nav to yellow door";
                GameStateUtil.randomRange(yellowDoorLocation);
                Time.sleepTicks(2);
            }

            if (Players.getLocal().getWorldLocation().equals(yellowDoorLocation)) {
                TileObjects.getNearest("Yellow door").interact("Open");
                Time.sleepTicks(6);
            }
        }
    }

    /**
     * Handle ladder climbing in maze
     */
    private static void handleMazeLadders() {
        // Find and climb ladders based on current floor
        TileObject ladder = TileObjects.getNearest(obj ->
            obj.getName().contains("Ladder") &&
            Reachable.isInteractable(obj)
        );

        if (ladder != null) {
            AccBuilderSotf.c = "Climb-up";
            ladder.interact("Climb-up");
            Time.sleepTicks(3);
        }
    }

    /**
     * Handle Ned and ship repair
     */
    private static void handleNedAndShipRepair() {
        // Placeholder for Ned interaction and ship repair logic
        // This would include:
        // - Finding and hiring Ned
        // - Repairing the ship with planks and nails
        // - Sailing to Crandor
    }

    /**
     * Handle the Elvarg boss fight
     */
    private static void handleElvargFight() {
        WorldPoint crandorEntrance = new WorldPoint(2834, 9655, 0);

        // Navigate to Crandor entrance
        if (Players.getLocal().getWorldLocation().distanceTo(crandorEntrance) > 20) {
            AccBuilderSotf.c = "Nav to entrance";
            Movement.walkTo(crandorEntrance);
            Time.sleepTicks(2);
        }

        // Enter the cave
        if (Players.getLocal().getWorldLocation().distanceTo(crandorEntrance) <= 5) {
            TileObjects.getNearest("Hole").interact("Enter");
            Time.sleepTicks(6);
        }

        // Navigate to Elvarg
        WorldArea elvargArea = new WorldArea(2826, 9652, 10, 10, 0);
        if (!elvargArea.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to fight";
            Movement.walkTo(elvargArea.toWorldPoint());
            Time.sleepTicks(1);
        }

        // Boss fight
        if (elvargArea.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Elvarg boss fight";

            // Drop vials
            if (Inventory.contains("Vial")) {
                Inventory.getFirst("Vial").interact("Drop");
            }

            // Eat food
            if (Combat.getMissingHealth() > 40) {
                if (Inventory.contains("Shark")) {
                    Inventory.getFirst("Shark").interact("Eat");
                }
            }

            // Drink antifire potion
            if (Inventory.contains(item -> item.getName().contains("Antifire"))) {
                Inventory.getFirst(item -> item.getName().contains("Antifire")).interact("Drink");
            }

            // Attack Elvarg
            if (Players.getLocal().getInteracting() == null) {
                NPCs.getNearest("Elvarg").interact("Attack");
                Time.sleepTicks(5);
            }
        }
    }

    /**
     * Handle final dialog with Oziach after defeating Elvarg
     */
    private static void handleFinalOziachDialog() {
        if (GameStateUtil.getVarbit(QUEST_VARBIT) >= 9) {
            if (Players.getLocal().getWorldLocation().distanceTo(OZIACH_LOCATION) > 8) {
                AccBuilderSotf.c = "Nav to oziach";
                Movement.walkTo(OZIACH_LOCATION);
                Time.sleepTicks(1);
            } else {
                // Wear the rune platebody before talking
                if (Inventory.contains(item -> item.getName().contains("Rune platebody"))) {
                    Inventory.getFirst(item -> item.getName().contains("Rune platebody")).interact("Wear");
                }

                // Break the Crandor map
                if (Inventory.contains("Crandor map")) {
                    Inventory.getFirst("Crandor map").interact("Break");
                }

                g.a("Oziach", questDialogOptions);
            }
        }
    }
}
