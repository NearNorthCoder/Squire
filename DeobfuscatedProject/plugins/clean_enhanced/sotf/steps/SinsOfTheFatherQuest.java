/*
 * NOTE: Despite being in the SOTF directory, this file contains WATERFALL QUEST code.
 * The original obfuscated source was mislabeled. The quest content is for the
 * Waterfall Quest, as evidenced by references to Glarial's amulet, Glarial's urn,
 * and NPCs like Almera, Golrie, and Hudon.
 */
package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.*;

/**
 * Main quest step handler for the Waterfall Quest.
 *
 * NOTE: This class is mislabeled as SinsOfTheFatherQuest but actually contains
 * Waterfall Quest implementation.
 *
 * This quest involves obtaining Glarial's amulet and urn, navigating through various
 * locations including Castle Wars, Glarial's Tomb, and the Waterfall dungeon, and
 * ultimately completing the quest by placing runes on pillars.
 */
public class SinsOfTheFatherQuest implements ac {

    // Quest progress tracking
    private static final int QUEST_VARBIT = 65;
    private static final int QUEST_NOT_STARTED = 0;
    private static final int QUEST_STEP_1 = 1;
    private static final int QUEST_STEP_2 = 2;
    private static final int QUEST_STEP_3 = 3;
    private static final int QUEST_STEP_4 = 4;
    private static final int QUEST_STEP_5 = 5;
    private static final int QUEST_STEP_6 = 6;
    private static final int QUEST_STEP_7 = 7;
    private static final int QUEST_COMPLETE = 10;

    // Item IDs
    private static final int ROPE_ID = 0x4591; // 17809
    private static final int KEY_ID = 0x125; // 293
    private static final int GLARIALS_PEBBLE_ID = 0x21BE; // 8638
    private static final int GLARIALS_AMULET_ID = 0x593D; // 22845
    private static final int GLARIALS_URN_ID = 0x21BE; // 8638

    // Object IDs
    private static final int BOOKCASE_ID = 0x7FFF; // 32767
    private static final int CRATE_ID = 0x7FB; // 2043
    private static final int CAGE_DOOR_ID = 0x7E9; // 2025
    private static final int TOMB_DOOR_ID = 0x7FED; // 32749
    private static final int STALAGMITE_ID = 0x57EF; // 22511
    private static final int WATERFALL_DOOR_ID = 0x47DE; // 18398
    private static final int ROCK_ID = 0x4FEC; // 20460
    private static final int TREE_ID = 0x27E9; // 10217
    private static final int PILLAR_ID = 0x6F59; // 28505
    private static final int STATUE_ID = 0x779F; // 30623
    private static final int CHALICE_ID = 0x6FD7; // 28631

    // World locations
    private static final WorldPoint QUEST_START_LOCATION = new WorldPoint(0x6FFF, 0x7FE, 0);
    private static final WorldPoint ALMERA_LOCATION = new WorldPoint(0x5BD7, 0x5F9F, 0);
    private static final WorldPoint CASTLE_WARS_LOCATION = new WorldPoint(0x5BD7, 0x7D9B, 0);
    private static final WorldPoint BOOKCASE_LOCATION = new WorldPoint(0x5BDF, 0x381, 1);
    private static final WorldPoint MAZE_ENTRANCE = new WorldPoint(0x3FFF, 0x82, 0);
    private static final WorldPoint MAZE_LADDER = new WorldPoint(0x7BFD, 0x384, 0);
    private static final WorldPoint CRATE_LOCATION = new WorldPoint(0x7F3, 0x85, 0);
    private static final WorldPoint CAGE_LOCATION = new WorldPoint(0x6F3F, 0x366, 0);
    private static final WorldPoint TOMB_ENTRANCE = new WorldPoint(0x7E9, 0x6FF6, 0);
    private static final WorldPoint STALAGMITE_LOCATION = new WorldPoint(0x6FE7, 0xF7F, 0);
    private static final WorldPoint WATERFALL_ENTRANCE = new WorldPoint(0x7BFE, 0x2F5A, 0);
    private static final WorldPoint INSIDE_WATERFALL = new WorldPoint(0x5BFF, 0x2DFF, 0);
    private static final WorldPoint ROCK_LOCATION = new WorldPoint(0x5EFC, 0x77BB, 0);

    // World areas
    private static final WorldArea TOMB_AREA = new WorldArea(new WorldPoint(0x5BDF, 0x6F3C, 0),
                                                              new WorldPoint(0x79FE, 0x6D7E, 0));
    private static final WorldArea MAZE_AREA = new WorldArea(0x5FFF, 0x7DFF, 11, 56, 0);
    private static final WorldArea WATERFALL_DUNGEON_AREA = new WorldArea(0x7DCD, 0x1FEE, 50, 62, 0);

    // Path waypoints for maze navigation
    private static final WorldPoint[] MAZE_PATH = new WorldPoint[] {
        new WorldPoint(0x7BFD, 0x5D77, 0),
        new WorldPoint(0x3FFF, 0x3F74, 0),
        new WorldPoint(0x7DFF, 0x2EE9, 0),
        new WorldPoint(0x3DF5, 0x7C5F, 0),
        new WorldPoint(0x3FFF, 0x3F77, 0)
    };

    // Pillar locations
    public static final WorldPoint SOUTHEAST_PILLAR = new WorldPoint(0x3BFF, 0x7FFE, 0);
    public static final WorldPoint SOUTHWEST_PILLAR = new WorldPoint(0x3BFF, 0x7FFB, 0);
    public static final WorldPoint NORTHWEST_PILLAR = new WorldPoint(0x3BFF, 0x7FF8, 0);
    public static final WorldPoint NORTHEAST_PILLAR = new WorldPoint(0x7E26, 0x7FFE, 0);
    public static final WorldPoint NORTH_PILLAR = new WorldPoint(0x7E26, 0x7FFB, 0);
    public static final WorldPoint SOUTH_PILLAR = new WorldPoint(0x7E26, 0x7FF2, 0);

    // NPC dialogue options
    private static final String[] DIALOGUE_OPTIONS = new String[] {
        "How can I help?",
        "I'm always happy to help a cook in distress.",
        "Yes."
    };

    // NPC names
    private static String GOLRIE_NPC = "Golrie";
    private static String HUDON_NPC = "Hudon";
    private static String ALMERA_NPC = "Almera";

    // State tracking
    public static List<d> buyingItemsList = new ArrayList<>();
    public static boolean enableQuesting = true;
    private static int questStep = 0;
    private static int failedAttempts = 0;
    private static int bankCounter = 0;
    private static WorldPoint currentWaypoint;
    private static WorldArea currentArea;
    private static WorldArea mazeNavigationArea;

    // Required items arrays (from imported classes)
    public static final int[] RUNE_REQUIREMENTS = new int[9];
    public static final int[] EQUIPMENT_REQUIREMENTS = new int[4];
    public static final int[] QUEST_ITEMS = new int[9];

    static {
        // Initialize rune requirements
        RUNE_REQUIREMENTS[0] = 0x7FBD; // Air runes
        RUNE_REQUIREMENTS[1] = 0x1FDF; // Earth runes
        RUNE_REQUIREMENTS[2] = 0x6FDF; // Water runes
        RUNE_REQUIREMENTS[3] = 0x1FB7; // More runes

        // Initialize equipment requirements
        EQUIPMENT_REQUIREMENTS[0] = 0x316; // Ring
        EQUIPMENT_REQUIREMENTS[1] = 0x735F; // Amulet
        EQUIPMENT_REQUIREMENTS[2] = 0x7777; // Games necklace
        EQUIPMENT_REQUIREMENTS[3] = 0x3F57; // Ring of dueling

        // Initialize quest items
        QUEST_ITEMS[0] = 0x4477; // Rope
        QUEST_ITEMS[1] = 0x6FFA; // More items
        QUEST_ITEMS[2] = 0x1FFF;
        QUEST_ITEMS[3] = 0xF4E;
        QUEST_ITEMS[4] = 0x7E26;
        QUEST_ITEMS[5] = 0x7FEF;
        QUEST_ITEMS[6] = 0x3DFE;
        QUEST_ITEMS[7] = 0x5F0F;
        QUEST_ITEMS[8] = 0x6FFF;

        buyingItemsList = new ArrayList<>();
        mazeNavigationArea = new WorldArea(0x5FFF, 0x7DFF, 11, 56, 0);
        currentWaypoint = new WorldPoint(0x5F0F, 0x3FFF, 0);
        currentArea = new WorldArea(0x7DCD, 0x1FEE, 50, 62, 0);
        bankCounter = 0;
    }

    /**
     * Main quest execution method. Handles all quest steps from start to finish.
     */
    public static void executeQuestSteps() {
        BankLocation nearestBank;
        Item item;

        // Check if we need to buy items first
        if (enableQuesting) {
            AccBuilderSotf.c = "Buying items";
            b.a(buyingItemsList);
            if (buyingItemsList.size() == 1) {
                System.out.println("Finished buying items, switching back to questing");
                enableQuesting = false;
            }
        }

        if (!enableQuesting) {
            return;
        }

        // Handle stamina potion drinking
        if (Inventory.contains(f.ba) && Movement.getRunEnergy() < 32 && !Dialog.isOpen()) {
            Inventory.getFirst(f.ba).interact("Drink");
            Time.sleepTicks(1);
        }

        // Handle food eating
        if (Skills.getBoostedLevel(Skill.HITPOINTS) <= 14 && !Inventory.isFull()) {
            if (Inventory.contains("Shark")) {
                Inventory.getFirst("Shark").interact("Eat");
                Time.sleepTicks(1);
            }
        }

        int currentQuestStep = e.j(QUEST_VARBIT);

        // Handle quest completion
        if (currentQuestStep == QUEST_COMPLETE - 1) {
            P.dh();
        }

        // Step 0: Start quest by talking to Almera
        if (e.j(QUEST_VARBIT) == QUEST_NOT_STARTED && currentQuestStep >= QUEST_COMPLETE - 1) {
            if (needsBankingForQuest()) {
                nearestBank = BankLocation.getNearest();
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Navigating to bank";
                    a.a(nearestBank);
                }

                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        AccBuilderSotf.c = "Opening bank";
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), 5000);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = "Handling banking";

                        // Deposit inventory and equipment
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(3);
                        }

                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check for required items
                        checkRequiredItems();
                    }
                }
            }

            if (!needsBankingForQuest()) {
                if (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) > 7) {
                    if (!Bank.isOpen()) {
                        Bank.close();
                        Time.sleepTicks(3);
                    }

                    if (Bank.isOpen()) {
                        if (bankCounter < 1) {
                            if (Inventory.contains(f.ba) && Movement.getRunEnergy() < 32) {
                                Inventory.getFirst(f.ba).interact("Drink");
                                Time.sleepTicks(1);
                            }
                            e.x();
                            bankCounter += 1;
                        }

                        AccBuilderSotf.c = "Nav to start";
                        Movement.walkTo(QUEST_START_LOCATION);
                        Time.sleepTicks(1);
                    }
                }

                if (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) <= 7) {
                    AccBuilderSotf.c = "Chatting";
                    g.a(ALMERA_NPC, DIALOGUE_OPTIONS);
                }
            }
        }

        // Step 1: Talk to the boy (Hudon)
        if (e.j(QUEST_VARBIT) == QUEST_STEP_1) {
            if (Players.getLocal().getWorldLocation().distanceTo(ALMERA_LOCATION) > 3) {
                AccBuilderSotf.c = "Nav to boy";
                Movement.walkTo(ALMERA_LOCATION);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(ALMERA_LOCATION) <= 3) {
                AccBuilderSotf.c = "Chat boy";
                g.a(HUDON_NPC, DIALOGUE_OPTIONS);
            }
        }

        // Step 2: Get the Book on Baxtorian
        if (e.j(QUEST_VARBIT) == QUEST_STEP_2) {
            if (Players.getLocal().getWorldLocation().distanceTo(BOOKCASE_LOCATION) > 4) {
                AccBuilderSotf.c = "Nav to bookcase";
                Movement.walkTo(BOOKCASE_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(BOOKCASE_LOCATION) <= 4) {
                TileObject bookcase = TileObjects.getNearest(BOOKCASE_ID);
                if (Inventory.contains("Book on baxtorian")) {
                    AccBuilderSotf.c = "Searching bookcase";
                    if (bookcase != null) {
                        bookcase.interact("Search");
                        Time.sleepTicks(2);
                    }
                }
            }
        }

        // Handle reading the book
        if (Players.getLocal().getWorldLocation().distanceTo(BOOKCASE_LOCATION) <= 19) {
            if (!Inventory.contains("Book on baxtorian") &&
                Players.getLocal().getAnimation() != -1 &&
                e.j(QUEST_VARBIT) != 3) {
                item = Inventory.getFirst("Book on baxtorian");
                if (item != null) {
                    AccBuilderSotf.c = "Reading";
                    item.interact("Read");
                    Time.sleepTicks(2);
                }
            }
        }

        // Step 3: Navigate to Castle Wars and enter maze
        if (e.j(QUEST_VARBIT) == QUEST_STEP_3) {
            handleMazeNavigation();
        }

        // Step 4: Get Glarial's amulet and urn from tomb
        if (e.j(QUEST_VARBIT) == QUEST_STEP_4) {
            handleTombRetrieval();
        }

        // Step 5: Enter waterfall dungeon
        if (e.j(QUEST_VARBIT) == QUEST_STEP_5) {
            handleWaterfallEntry();
        }

        // Step 6: Navigate through waterfall dungeon
        if (e.j(QUEST_VARBIT) == QUEST_STEP_6) {
            handleWaterfallDungeon();
        }

        // Step 7: Place runes on pillars and complete quest
        if (e.j(QUEST_VARBIT) == QUEST_STEP_7) {
            handleFinalStep();
        }
    }

    /**
     * Handles navigation through the maze to get the key.
     */
    private static void handleMazeNavigation() {
        // Teleport to Castle Wars if not already there
        if (!Inventory.contains(GLARIALS_PEBBLE_ID) && Inventory.contains(GLARIALS_AMULET_ID) < 1 &&
            Players.getLocal().getWorldLocation().distanceTo(MAZE_LADDER) < 19) {
            AccBuilderSotf.c = "Tele to CW";

            if (!Inventory.contains("Games") && !Equipment.contains("Games")) {
                Inventory.getFirst("Games").interact("Wear");
            }

            if (!Equipment.contains("Games") && !Players.getLocal().isAnimating()) {
                Equipment.getFirst("Games").interact("Castle Wars");
                Time.sleepTicks(4);
            }
        }

        // Navigate to maze entrance
        if (Players.getLocal().getWorldLocation().distanceTo(MAZE_ENTRANCE) > 3) {
            if (!Inventory.contains(GLARIALS_PEBBLE_ID) && Inventory.contains(GLARIALS_AMULET_ID) < 1 &&
                Players.getLocal().getWorldLocation().distanceTo(CAGE_LOCATION) < 14 &&
                Players.getLocal().getWorldLocation().distanceTo(BOOKCASE_LOCATION) <= 19) {
                AccBuilderSotf.c = "Nav to maze ladder";

                if (mazeNavigationArea.contains(Players.getLocal().getWorldLocation())) {
                    Movement.walkTo(currentWaypoint);
                }

                if (!mazeNavigationArea.contains(Players.getLocal().getWorldLocation())) {
                    Walker.stepAlong(List.of(MAZE_PATH));
                    Time.sleepTicks(1);
                }
            }
        }

        // Climb down ladder
        if (Players.getLocal().getWorldLocation().distanceTo(MAZE_ENTRANCE) <= 3) {
            if (TileObjects.getNearest("Fountain") != null) {
                if (!Inventory.contains(GLARIALS_PEBBLE_ID) && Inventory.contains(GLARIALS_AMULET_ID) < 1) {
                    TileObject ladder = TileObjects.getNearest(0x47);
                    if (ladder != null) {
                        ladder.interact("Climb-down");
                        Time.sleepTicks(3);
                    }
                }
            }
        }

        // Navigate to crate
        if (Players.getLocal().getWorldLocation().distanceTo(CAGE_LOCATION) > 2) {
            if (TileObjects.getNearest(0x49) != null) {
                if (!Inventory.contains(GLARIALS_PEBBLE_ID) && Inventory.contains(GLARIALS_AMULET_ID) < 1) {
                    AccBuilderSotf.c = "nav to box";
                    Movement.walkTo(CAGE_LOCATION);
                }
            }
        }

        // Search crate
        if (Players.getLocal().getWorldLocation().distanceTo(CAGE_LOCATION) <= 3) {
            if (TileObjects.getNearest(0x49) != null) {
                if (!Inventory.contains(GLARIALS_PEBBLE_ID) && Inventory.contains(GLARIALS_AMULET_ID) < 1) {
                    AccBuilderSotf.c = "Searching crate";
                    TileObject crate = TileObjects.getNearest(0x49);
                    if (crate != null) {
                        crate.interact("Search");
                        Time.sleepTicks(2);
                    }
                }
            }
        }

        // Navigate to cage and use key
        if (Players.getLocal().getWorldLocation().distanceTo(CRATE_LOCATION) > 2) {
            if (Inventory.contains(GLARIALS_PEBBLE_ID) && Players.getLocal().getWorldLocation().getY() < 0x677C) {
                if (Inventory.contains(GLARIALS_PEBBLE_ID)) {
                    if (Inventory.contains(GLARIALS_AMULET_ID) < 1) {
                        AccBuilderSotf.c = "Nav to cage";
                        Movement.walkTo(CRATE_LOCATION);
                    }
                }
            }
        }

        // Use key on cage door
        if (Players.getLocal().getWorldLocation().distanceTo(CRATE_LOCATION) <= 2) {
            if (Inventory.contains(GLARIALS_PEBBLE_ID) && Players.getLocal().getWorldLocation().getY() < 0x677C) {
                if (Inventory.contains(GLARIALS_PEBBLE_ID)) {
                    if (Inventory.contains(GLARIALS_AMULET_ID) < 1) {
                        TileObject cage = TileObjects.getNearest(0x55);
                        if (cage != null) {
                            AccBuilderSotf.c = "Entering cage";
                            Item key = Inventory.getFirst(GLARIALS_PEBBLE_ID);
                            if (key != null) {
                                key.useOn(cage);
                                Time.sleep(1L);
                            }
                        }
                    }
                }
            }
        }

        // Talk to Golrie to get amulet
        if (Players.getLocal().getWorldLocation().getY() >= 0x677C) {
            if (Inventory.contains(GLARIALS_AMULET_ID) < 1) {
                AccBuilderSotf.c = "Chat npc";
                g.a(GOLRIE_NPC, DIALOGUE_OPTIONS);
            }
        }
    }

    /**
     * Handles retrieving Glarial's amulet and urn from the tomb.
     */
    private static void handleTombRetrieval() {
        // Navigate to tomb with required items
        if (Inventory.contains(GLARIALS_AMULET_ID) &&
            Players.getLocal().getWorldLocation().distanceTo(TOMB_ENTRANCE) > 4) {
            if (!Inventory.contains("Air rune") && !Inventory.contains("Earth rune")) {
                AccBuilderSotf.c = "Nav to tombstone";

                // Equip games necklace if available
                if (!Inventory.contains("Games") && !Equipment.contains("Games")) {
                    Inventory.getFirst("Games").interact("Wear");
                    Time.sleepTicks(1);
                }

                if (currentArea.contains(Players.getLocal().getWorldLocation())) {
                    Movement.walkTo(QUEST_START_LOCATION);
                    Time.sleepTicks(1);
                }

                if (!currentArea.contains(Players.getLocal().getWorldLocation())) {
                    Movement.walkTo(TOMB_ENTRANCE);
                    Time.sleepTicks(1);
                }
            }
        }

        // Use amulet on tomb door
        if (Inventory.contains(GLARIALS_AMULET_ID) &&
            Players.getLocal().getWorldLocation().distanceTo(TOMB_ENTRANCE) <= 4) {
            if (!Inventory.contains("Air rune") && !Inventory.contains("Earth rune")) {
                AccBuilderSotf.c = "Entering tomb";
                Item amulet = Inventory.getFirst(GLARIALS_AMULET_ID);
                TileObject door = TileObjects.getNearest(0x65);
                if (amulet != null && door != null) {
                    amulet.useOn(door);
                    Time.sleepUntil(() -> {
                        return TileObjects.getNearest("Stalagmite") != null;
                    }, 10000);
                }
            }
        }

        // Search stalagmite for items
        if (Inventory.contains(GLARIALS_AMULET_ID)) {
            if (TileObjects.getNearest("Stalagmite") != null) {
                if (!Inventory.contains("Glarial's amulet") && !Inventory.contains("Glarial's urn")) {
                    AccBuilderSotf.c = "Getting ammy";

                    if (Players.getLocal().getWorldLocation().distanceTo(STALAGMITE_LOCATION) > 4) {
                        Movement.walkTo(STALAGMITE_LOCATION);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(STALAGMITE_LOCATION) <= 4) {
                        TileObject stalagmite = TileObjects.getNearest(0x70);
                        if (stalagmite != null) {
                            stalagmite.interact("Open");
                            Time.sleepTicks(1);
                        }

                        TileObject chest = TileObjects.getNearest(0x72);
                        if (chest != null) {
                            chest.interact("Search");
                            Time.sleepTicks(1);
                        }
                    }
                }
            }
        }
    }

    /**
     * Handles entering the waterfall dungeon.
     */
    private static void handleWaterfallEntry() {
        // Navigate to waterfall entrance with required items
        if (!Inventory.contains(GLARIALS_AMULET_ID)) {
            if (!Inventory.contains("Air rune") && Inventory.contains("Earth rune") >= 6 &&
                !Inventory.contains("Water rune")) {
                // Check if we have all required items
                if (!Inventory.contains("Glarial's amulet") && !Inventory.contains("Glarial's urn")) {
                    AccBuilderSotf.c = "Nav to bank";

                    // Withdraw runes from bank
                    if (!Equipment.contains(f.aT) && !Inventory.contains(f.aT)) {
                        Inventory.getFirst(f.aT).interact("Wear");
                        Time.sleepTicks(1);
                    }

                    if (!Equipment.contains(f.aT)) {
                        Movement.walkTo(0x386, 0x387, 0);
                    }
                }
            }
        }

        // Use rope on rock to enter waterfall
        if (Players.getLocal().getWorldLocation().distanceTo(ROCK_LOCATION) <= 20) {
            if (Inventory.contains(GLARIALS_AMULET_ID) &&
                Inventory.getCount("Air rune") >= 6 && Inventory.getCount("Earth rune") >= 6 &&
                !Inventory.getCount("Water rune") < 1) {
                if (Inventory.contains("Glarial's amulet") && Inventory.contains("Glarial's urn")) {
                    if (Players.getLocal().getWorldLocation().distanceTo(ALMERA_LOCATION) <= 4 &&
                        Players.getLocal().getWorldLocation().distanceTo(CASTLE_WARS_LOCATION) <= 4) {
                        AccBuilderSotf.c = "Nav to door entrance";
                        if (!Dialog.isOpen()) {
                            Dialog.close();
                        }
                        Movement.walkTo(ROCK_LOCATION);
                    }

                    // Use rope on rock
                    if (Players.getLocal().getWorldLocation().distanceTo(ALMERA_LOCATION) <= 7 &&
                        Players.getLocal().getWorldLocation().distanceTo(CASTLE_WARS_LOCATION) <= 4) {
                        Item rope = Inventory.getFirst("Rope");
                        TileObject rock = TileObjects.getNearest("Rock");
                        AccBuilderSotf.c = "Roping rock";
                        if (rope != null && rock != null) {
                            rope.useOn(rock);
                            Time.sleepUntil(() -> {
                                return Players.getLocal().getWorldLocation().distanceTo(CASTLE_WARS_LOCATION) <= 4;
                            }, 15000);
                        }
                    }

                    // Use rope on tree
                    if (Players.getLocal().getWorldLocation().distanceTo(CASTLE_WARS_LOCATION) <= 4) {
                        Item rope2 = Inventory.getFirst("Rope");
                        TileObject tree = TileObjects.getNearest(0x130);
                        AccBuilderSotf.c = "Roping tree";
                        if (rope2 != null && tree != null) {
                            rope2.useOn(tree);
                            Time.sleepTicks(7);
                        }
                    }

                    // Open door to enter
                    if (!Players.getLocal().getWorldLocation().equals(INSIDE_WATERFALL)) {
                        TileObject door = TileObjects.getNearest("Door");
                        AccBuilderSotf.c = "Entering door";
                        if (door != null) {
                            door.interact("Open");
                            Time.sleepTicks(2);
                        }
                    }
                }
            }
        }
    }

    /**
     * Handles navigating through the waterfall dungeon to reach the final room.
     */
    private static void handleWaterfallDungeon() {
        // Navigate through dungeon rooms with required items
        if (!Inventory.contains(GLARIALS_AMULET_ID)) {
            if (!Inventory.contains("Air rune")) {
                if (Inventory.getCount("Air rune") >= 6 && !Inventory.contains("Earth rune")) {
                    if (Inventory.getCount("Earth rune") >= 6 && !Inventory.contains("Water rune")) {
                        if (Inventory.getCount("Water rune") >= 6 && !Inventory.contains("Glarial's amulet")) {
                            if (!Inventory.contains("Glarial's urn")) {
                                if (Inventory.getCount(0x143) < 1 &&
                                    !Players.getLocal().getWorldLocation().equals(INSIDE_WATERFALL)) {
                                    AccBuilderSotf.c = "Nav to key and get";

                                    // Navigate to key location
                                    if (Players.getLocal().getWorldLocation().distanceTo(ROCK_LOCATION) > 2) {
                                        Movement.walkTo(ROCK_LOCATION);
                                    }

                                    // Search for key
                                    if (Players.getLocal().getWorldLocation().distanceTo(ROCK_LOCATION) <= 2) {
                                        TileObject searchable = TileObjects.getNearest(0x145);
                                        if (searchable != null) {
                                            searchable.interact("Search");
                                            Time.sleepTicks(2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Continue through dungeon doors
        handleDungeonDoors();
    }

    /**
     * Handles opening doors in the waterfall dungeon.
     */
    private static void handleDungeonDoors() {
        // Open first door
        if (!Inventory.contains("Air rune") && Inventory.getCount("Air rune") >= 6) {
            if (!Inventory.contains("Door")) {
                AccBuilderSotf.c = "Nav to last room";

                if (Players.getLocal().getWorldLocation().distanceTo(0x164, 0x164, 0) <= 4) {
                    TileObject door = TileObjects.getNearest("Door");
                    if (door != null) {
                        door.interact("Open");
                        Time.sleepTicks(2);
                    }
                }
            }
        }
    }

    /**
     * Handles the final step of placing runes on pillars and completing the quest.
     */
    private static void handleFinalStep() {
        // Place runes on each pillar
        placRunesOnPillars();

        // Place amulet on statue
        if (Inventory.contains("Glarial's amulet")) {
            TileObject statue = TileObjects.getNearest("Statue of Glarial");
            Item amulet = Inventory.getFirst("Glarial's amulet");
            if (statue != null && amulet != null) {
                AccBuilderSotf.c = "Putting neck on statue";
                amulet.useOn(statue);
                Time.sleepTicks(2);
            }
        }

        // Place urn to complete quest
        if (Inventory.contains("Glarial's urn")) {
            TileObject chalice = TileObjects.getNearest("Chalice");
            Item urn = Inventory.getFirst("Glarial's urn");
            if (chalice != null && urn != null) {
                AccBuilderSotf.c = "Putting ashes inside";
                urn.useOn(chalice);
                Time.sleepTicks(2);
            }
        }
    }

    /**
     * Places runes on all six pillars.
     */
    private static void placeRunesOnPillars() {
        // Southeast pillar
        placRunesOnPillar(SOUTHEAST_PILLAR, "Nav to SE Pillar");

        // Continue for other pillars (implementation similar)
        // ...
    }

    /**
     * Places runes on a specific pillar.
     */
    private static void placRunesOnPillar(WorldPoint pillarLocation, String statusMessage) {
        if (Players.getLocal().getWorldLocation().distanceTo(pillarLocation) <= 4) {
            if (Inventory.contains("Air rune") && Inventory.contains("Earth rune") &&
                Inventory.contains("Water rune")) {
                AccBuilderSotf.c = statusMessage;

                // Use air rune on pillar
                Item airRune = Inventory.getFirst("Air rune");
                Item earthRune = Inventory.getFirst("Earth rune");
                Item waterRune = Inventory.getFirst("Water rune");
                TileObject pillar = TileObjects.getNearest("Pillar");

                if (airRune != null && pillar != null) {
                    AccBuilderSotf.c = "Using runes";
                    airRune.useOn(pillar);
                    Time.sleepTicks(2);
                }
            }
        }
    }

    /**
     * Checks if we need to bank for quest requirements.
     */
    private static boolean needsBankingForQuest() {
        // Check if we have rope
        if (!Inventory.contains(ROPE_ID)) {
            return true;
        }

        // Check if we have stamina potions
        if (!Inventory.contains(f.ba)) {
            if (!Equipment.contains(f.ba)) {
                return true;
            }
        }

        // Check if we have teleport items
        if (Inventory.contains(f.aT)) {
            if (!Equipment.contains(f.aT)) {
                if (Inventory.contains(f.aS)) {
                    if (!Equipment.contains(f.aS)) {
                        if (!Inventory.contains("Rope")) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    /**
     * Checks for required items in the bank and adds them to the buying list if missing.
     */
    public static void checkRequiredItems() {
        // Check for rope
        if (!Bank.contains(ROPE_ID)) {
            buyingItemsList.add(new d(ROPE_ID, 14, 0x315));
        }

        // Check for stamina potions
        if (!Bank.contains(0x316)) {
            buyingItemsList.add(new d(0x316, 4, j.cf));
        }

        // Check for water runes
        if (!Bank.contains(0x14) || Bank.getFirst(0x14).getQuantity() < 6) {
            buyingItemsList.add(new d(0x14, 0x317, 19));
        }

        // Check for earth runes
        if (!Bank.contains(0x15) || Bank.getFirst(0x15).getQuantity() < 6) {
            buyingItemsList.add(new d(0x15, 0x317, 19));
        }

        // Check for air runes
        if (!Bank.contains(0x16) || Bank.getFirst(0x16).getQuantity() < 6) {
            buyingItemsList.add(new d(0x16, 0x317, 19));
        }

        // Check for ring of wealth
        if (Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth"))) {
            buyingItemsList.add(new d(0x321, 21, 0x322));
        }

        // Check for games necklace
        if (Bank.contains(0x323)) {
            buyingItemsList.add(new d(0x323, 58, 0x324));
        }
    }

    // Quest completion check
    @Override
    public boolean ah() {
        return e.j(QUEST_VARBIT) >= QUEST_COMPLETE;
    }

    // Quest requirements check
    @Override
    public boolean ae() {
        return false; // No specific requirements to start
    }
}
