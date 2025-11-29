package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import gg.squire.sotf.steps.banking.BankingHandler;
import gg.squire.sotf.steps.banking.ItemRequirement;
import gg.squire.sotf.steps.combat.CombatHandler;
import gg.squire.sotf.steps.dialog.DialogHandler;
import gg.squire.sotf.steps.movement.NavigationHandler;
import gg.squire.sotf.steps.quest.QuestStep;
import gg.squire.sotf.steps.utils.GameObjectUtils;
import gg.squire.sotf.steps.utils.InventoryUtils;
import gg.squire.sotf.steps.utils.NpcUtils;
import gg.squire.sotf.steps.utils.PlayerUtils;

import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

/**
 * A Taste of Hope Quest Handler
 *
 * This class manages the "A Taste of Hope" quest, which is a prerequisite for
 * "Darkness of Hallowvale" and eventually "Sins of the Father". The quest involves
 * helping the Myreque resistance group in their fight against the vampyres of
 * Morytania.
 *
 * <h2>Quest Overview:</h2>
 * <ul>
 *   <li><b>Start Point:</b> Talk to Veliaf Hurtz in the Myreque hideout</li>
 *   <li><b>Location:</b> Burgh de Rott, Meiyerditch, and Darkmeyer</li>
 *   <li><b>Main Characters:</b>
 *     <ul>
 *       <li>Veliaf Hurtz - Leader of the Myreque</li>
 *       <li>Vertida Sefalatis - Myreque member</li>
 *       <li>Safalaan Hallow - Important quest NPC</li>
 *       <li>Old Man Ral - Meiyerditch informant</li>
 *       <li>Drezel - Priest of Paterdomus Temple</li>
 *       <li>King Roald - King of Varrock</li>
 *     </ul>
 *   </li>
 * </ul>
 *
 * <h2>Quest Requirements:</h2>
 * <ul>
 *   <li>5 Construction</li>
 *   <li>48 Mining</li>
 *   <li>45 Thieving</li>
 *   <li>40 Agility</li>
 *   <li>38 Crafting</li>
 *   <li>40 Magic</li>
 *   <li>40 Strength</li>
 *   <li>Completion of "In Aid of the Myreque"</li>
 * </ul>
 *
 * <h2>Quest Steps:</h2>
 * <ol>
 *   <li>Talk to Veliaf Hurtz in the Myreque hideout beneath Burgh de Rott</li>
 *   <li>Repair the boat and travel to Meiyerditch</li>
 *   <li>Talk to Old Man Ral and Vertida Sefalatis</li>
 *   <li>Sketch the vampyre castle from different angles</li>
 *   <li>Report findings to Veliaf Hurtz</li>
 *   <li>Talk to Drezel at Paterdomus Temple</li>
 *   <li>Investigate the laboratory beneath the temple</li>
 *   <li>Report to King Roald in Varrock Palace</li>
 *   <li>Return to Veliaf and complete final dialogue</li>
 * </ol>
 *
 * <h2>Rewards:</h2>
 * <ul>
 *   <li>3 Quest Points</li>
 *   <li>2,500 Crafting experience</li>
 *   <li>2,500 Agility experience (from tome)</li>
 *   <li>Access to Darkmeyer and further Myreque questline</li>
 * </ul>
 *
 * @author Squire Bot Framework
 * @version 1.0
 */
public class ATasteOfHope implements QuestStep {

    // ========== CONSTANTS ==========

    // Quest Varbit Values
    private static final int QUEST_NOT_STARTED = 0;
    private static final int QUEST_COMPLETE_VARBIT = 165;

    // Skill Requirements
    private static final int REQUIRED_CONSTRUCTION = 5;
    private static final int REQUIRED_MINING = 48;
    private static final int REQUIRED_THIEVING = 45;
    private static final int REQUIRED_AGILITY = 40;
    private static final int REQUIRED_CRAFTING = 38;
    private static final int REQUIRED_MAGIC = 40;
    private static final int REQUIRED_STRENGTH = 40;

    // Item IDs
    private static final int HAMMER = 2347;
    private static final int CHISEL = 1755;
    private static final int KNIFE = 946;
    private static final int PAPYRUS = 970;
    private static final int CHARCOAL = 973;
    private static final int BRONZE_WIRE = 1794;
    private static final int ROPE = 954;
    private static final int PLANK = 960;
    private static final int STEEL_NAILS = 1539;
    private static final int SILVER_BAR = 2355;
    private static final int SILVER_SICKLE_B = 2961;
    private static final int FOOD_SHARK = 385;
    private static final int STAMINA_POTION_4 = 12625;
    private static final int SUPER_ENERGY_4 = 3016;
    private static final int TOME_OF_EXPERIENCE_3 = 11967;
    private static final int TOME_OF_EXPERIENCE_2 = 11968;
    private static final int TOME_OF_EXPERIENCE_1 = 11969;

    // NPC Names
    private static final String NPC_VELIAF_HURTZ = "Veliaf Hurtz";
    private static final String NPC_OLD_MAN_RAL = "Old Man Ral";
    private static final String NPC_VERTIDA_SEFALATIS = "Vertida Sefalatis";
    private static final String NPC_SAFALAAN_HALLOW = "Safalaan Hallow";
    private static final String NPC_DREZEL = "Drezel";
    private static final String NPC_KING_ROALD = "King Roald";
    private static final String NPC_MEIYERDITCH_CITIZEN = "Meiyerditch citizen";

    // Object Names
    private static final String OBJ_TRAPDOOR = "Trapdoor";
    private static final String OBJ_LADDER = "Ladder";
    private static final String OBJ_BOAT = "Boat";
    private static final String OBJ_BOAT_CHUTE = "Boat Chute";
    private static final String OBJ_WALL_RUBBLE = "Wall rubble";
    private static final String OBJ_ROCKY_SURFACE = "Rocky surface";
    private static final String OBJ_STAIRCASE = "Staircase";
    private static final String OBJ_SLASHED_TAPESTRY = "Slashed tapestry";
    private static final String OBJ_LAB_TABLE = "Lab table";
    private static final String OBJ_WALL = "Wall";
    private static final String OBJ_DOOR = "Door";
    private static final String OBJ_FLOOR = "Floor";

    // Actions
    private static final String ACTION_OPEN = "Open";
    private static final String ACTION_CLIMB_DOWN = "Climb-down";
    private static final String ACTION_CLIMB_UP = "Climb-up";
    private static final String ACTION_BOARD = "Board";
    private static final String ACTION_PUSH = "Push";
    private static final String ACTION_INSPECT = "Inspect";
    private static final String ACTION_TALK = "Talk";
    private static final String ACTION_SEARCH = "Search";
    private static final String ACTION_READ = "Read";
    private static final String ACTION_JUMP_TO = "Jump-to";
    private static final String ACTION_BREAK = "Break";

    // ========== QUEST STATE ==========

    public static String currentStepDescription = "";
    public static String questDisplayName = "A Taste of Hope";
    public static List<ItemRequirement> itemsToBuy = new ArrayList<>();
    public static boolean hasCheckedSupplies = false;

    // ========== LOCATION CONSTANTS ==========

    // Burgh de Rott / Myreque Hideout
    public static WorldPoint MYREQUE_HIDEOUT_TRAPDOOR = new WorldPoint(3502, 3169, 0);
    public static WorldPoint MYREQUE_HIDEOUT_INSIDE = new WorldPoint(3502, 9622, 0);
    public static WorldPoint BURGH_DE_ROTT_PUB = new WorldPoint(3502, 3285, 0);

    // Boat Locations
    public static WorldPoint BOAT_LOCATION_START = new WorldPoint(3522, 3285, 0);
    public static WorldPoint BOAT_DESTINATION = new WorldPoint(3628, 3229, 0);

    // Meiyerditch Locations
    public static WorldPoint MEIYERDITCH_ENTRY = new WorldPoint(3627, 3230, 0);
    public static WorldPoint OLD_MAN_RAL_LOCATION = new WorldPoint(3628, 3241, 0);
    public static WorldPoint VERTIDA_LOCATION = new WorldPoint(3627, 3230, 0);

    // Darkmeyer Castle Sketch Points
    public static WorldPoint CASTLE_SKETCH_NORTH = new WorldPoint(3598, 3366, 1);
    public static WorldPoint CASTLE_SKETCH_WEST = new WorldPoint(3584, 3352, 1);
    public static WorldPoint CASTLE_SKETCH_SOUTH = new WorldPoint(3598, 3340, 1);

    // Paterdomus Temple / Drezel
    public static WorldPoint PATERDOMUS_TEMPLE = new WorldPoint(3405, 3485, 0);
    public static WorldPoint DREZEL_LOCATION = new WorldPoint(3405, 9895, 0);
    public static WorldPoint LABORATORY_LOCATION = new WorldPoint(3405, 9895, 1);

    // Varrock Palace
    public static WorldPoint VARROCK_PALACE = new WorldPoint(3222, 3473, 0);
    public static WorldPoint KING_ROALD_LOCATION = new WorldPoint(3222, 3473, 1);

    // World Areas
    public static WorldArea MYREQUE_HIDEOUT_AREA = new WorldArea(3495, 9615, 20, 20, 0);
    public static WorldArea BURGH_DE_ROTT_AREA = new WorldArea(3490, 3270, 30, 30, 0);
    public static WorldArea MEIYERDITCH_AREA = new WorldArea(3600, 3200, 60, 80, 0);
    public static WorldArea DARKMEYER_AREA = new WorldArea(3575, 3325, 50, 60, 0);
    public static WorldArea PATERDOMUS_AREA = new WorldArea(3400, 3480, 20, 20, 0);
    public static WorldArea VARROCK_PALACE_AREA = new WorldArea(3200, 3450, 50, 50, 1);

    // Dialog Options (in order of appearance in dialog trees)
    public static String[] DIALOG_OPTIONS = new String[] {
        "I'll help however I can.",
        "Yes, I'll do it.",
        "Okay, I understand.",
        "Tell me about the plan.",
        "What do you need me to do?",
        "I'll get started right away.",
        "I found what you were looking for.",
        "I've completed the sketches.",
        "I spoke with Drezel.",
        "The King will help us.",
        "Quest complete!"
    };

    // Animation IDs
    private static final int ANIMATION_IDLE = -1;
    private static final int ANIMATION_WOODCUTTING = 879;
    private static final int ANIMATION_CONSTRUCTION = 3676;

    // ========== INTERFACE METHODS ==========

    /**
     * Checks if the quest step is complete
     * @return true if player has completed all requirements and quest objectives
     */
    @Override
    public boolean isComplete() {
        int questProgress = Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId());

        if (questProgress == QUEST_COMPLETE_VARBIT) {
            // Quest is fully complete, check for reward items
            if (!Inventory.contains("Castle sketch (n)")
                && !Inventory.contains("Castle sketch (w)")
                && !Inventory.contains("Castle sketch (s)")
                && !Dialog.isOpen()) {
                return true;
            }
        }

        return false;
    }

    /**
     * Gets the quest step display name
     * @return The display name for logging/debugging
     */
    @Override
    public String getStepName() {
        return questDisplayName;
    }

    /**
     * Indicates this is not a child step
     * @return false
     */
    @Override
    public boolean isChildStep() {
        return false;
    }

    /**
     * Main execution method - orchestrates all quest steps
     * @return execution delay in ticks
     */
    @Override
    public int execute() {
        try {
            executeQuestSteps();
        } catch (Exception e) {
            System.err.println("Error executing A Taste of Hope quest step: " + e.getMessage());
            e.printStackTrace();
        }
        return 80; // Default tick delay
    }

    // ========== QUEST EXECUTION LOGIC ==========

    /**
     * Main quest step orchestration method
     * Handles skill training, item procurement, and quest progression
     */
    public static void executeQuestSteps() {
        // First check if we need to buy supplies
        if (hasCheckedSupplies) {
            handleItemProcurement();

            if (itemsToBuy.size() > 0) {
                System.out.println("Finished buying items, switching back to quest");
                hasCheckedSupplies = false;
            }
        }

        // Check if quest is ready to start (all requirements met)
        if (hasCheckedSupplies == false) {
            // Check skill requirements
            if (Skills.getLevel(Skill.CONSTRUCTION) < REQUIRED_CONSTRUCTION) {
                currentStepDescription = "- Con";
                // Train construction
                return;
            }

            if (Skills.getLevel(Skill.MINING) < REQUIRED_MINING) {
                currentStepDescription = "- Mining";
                // Train mining
                return;
            }

            if (Skills.getLevel(Skill.THIEVING) < REQUIRED_THIEVING) {
                currentStepDescription = "- Thieving";
                // Train thieving
                return;
            }

            if (Skills.getLevel(Skill.AGILITY) < REQUIRED_AGILITY) {
                currentStepDescription = "- Agility";
                // Train agility
                return;
            }

            if (Skills.getLevel(Skill.CRAFTING) < REQUIRED_CRAFTING) {
                currentStepDescription = "- Crafting";
                // Train crafting
                return;
            }

            if (Skills.getLevel(Skill.MAGIC) < REQUIRED_MAGIC) {
                currentStepDescription = "- Magic";
                // Train magic
                return;
            }

            if (Skills.getLevel(Skill.STRENGTH) < REQUIRED_STRENGTH) {
                currentStepDescription = "- Str";
                // Train strength
                return;
            }

            if (Vars.getBit(QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()) < 2) {
                currentStepDescription = "- In Aid";
                // Complete In Aid of the Myreque first
                return;
            }

            // All requirements met, check if we have all needed items
            if (!hasAllRequiredItems() && Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()) == 0) {
                currentStepDescription = "";

                BankLocation nearestBank = BankLocation.getNearest();
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Nav to bank";
                    NavigationHandler.navigateToBank(nearestBank);
                }

                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        Bank.open();
                        Time.sleepUntil(() -> Bank.isOpen(), 5000);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = "Handling banking";

                        // Deposit everything first
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(3);
                        }

                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check and withdraw required items
                        checkAndWithdrawQuestItems();
                    }
                }
            }
        }

        // Execute actual quest steps based on progress
        handleQuestProgression();
    }

    /**
     * Checks if player has all required quest items
     * @return true if all items are present
     */
    private static boolean hasAllRequiredItems() {
        return Bank.contains(HAMMER) && Bank.getCount(HAMMER) >= 1
            && Bank.contains(CHISEL) && Bank.getCount(CHISEL) >= 1
            && Bank.contains(KNIFE) && Bank.getCount(KNIFE) >= 1
            && Bank.contains(PAPYRUS) && Bank.getCount(PAPYRUS) >= 10
            && Bank.contains(CHARCOAL) && Bank.getCount(CHARCOAL) >= 10
            && Bank.contains(BRONZE_WIRE) && Bank.getCount(BRONZE_WIRE) >= 3
            && Bank.contains(ROPE) && Bank.getCount(ROPE) >= 1
            && Bank.contains(PLANK) && Bank.getCount(PLANK) >= 6
            && Bank.contains(STEEL_NAILS) && Bank.getCount(STEEL_NAILS) >= 20
            && Bank.contains(SILVER_BAR) && Bank.getCount(SILVER_BAR) >= 2
            && (Bank.contains("silver sickle") || Bank.contains(SILVER_SICKLE_B))
            && Bank.contains(FOOD_SHARK) && Bank.getCount(FOOD_SHARK) >= 4
            && Bank.contains(STAMINA_POTION_4) && Bank.getCount(STAMINA_POTION_4) >= 1;
    }

    /**
     * Checks bank for missing items and adds them to shopping list
     */
    private static void checkAndWithdrawQuestItems() {
        itemsToBuy.clear();

        // Check each required item and add to buy list if missing
        if (!Bank.contains(HAMMER)) {
            itemsToBuy.add(new ItemRequirement(HAMMER, 1, 13));
        }

        if (!Bank.contains(CHISEL)) {
            itemsToBuy.add(new ItemRequirement(CHISEL, 1, 14));
        }

        if (!Bank.contains(KNIFE)) {
            itemsToBuy.add(new ItemRequirement(KNIFE, 1, 946));
        }

        if (!Bank.contains(PAPYRUS) || Bank.getCount(PAPYRUS) < 10) {
            itemsToBuy.add(new ItemRequirement(PAPYRUS, 10, 970));
        }

        if (!Bank.contains(CHARCOAL) || Bank.getCount(CHARCOAL) < 10) {
            itemsToBuy.add(new ItemRequirement(CHARCOAL, 10, 973));
        }

        if (!Bank.contains(BRONZE_WIRE) || Bank.getCount(BRONZE_WIRE) < 3) {
            itemsToBuy.add(new ItemRequirement(BRONZE_WIRE, 3, 1794));
        }

        if (!Bank.contains(ROPE) || Bank.getCount(ROPE) < 1) {
            itemsToBuy.add(new ItemRequirement(ROPE, 1, 954));
        }

        if (!Bank.contains(PLANK) || Bank.getCount(PLANK) < 6) {
            itemsToBuy.add(new ItemRequirement(PLANK, 6, 960));
        }

        if (!Bank.contains(STEEL_NAILS) || Bank.getCount(STEEL_NAILS) < 20) {
            itemsToBuy.add(new ItemRequirement(STEEL_NAILS, 20, 1539));
        }

        if (!Bank.contains(SILVER_BAR) || Bank.getCount(SILVER_BAR) < 2) {
            itemsToBuy.add(new ItemRequirement(SILVER_BAR, 2, 2355));
        }

        if (!Bank.contains((Predicate<Item>) item -> item.getName().toLowerCase().contains("silver sickle"))) {
            itemsToBuy.add(new ItemRequirement(SILVER_SICKLE_B, 1, 2961));
        }

        if (!Bank.contains(FOOD_SHARK) || Bank.getCount(FOOD_SHARK) < 4) {
            itemsToBuy.add(new ItemRequirement(FOOD_SHARK, 4, 385));
        }

        if (!Bank.contains(STAMINA_POTION_4) || Bank.getCount(STAMINA_POTION_4) < 1) {
            itemsToBuy.add(new ItemRequirement(STAMINA_POTION_4, 1, 12625));
        }

        // If we're missing items, switch to buying mode
        if (itemsToBuy.size() > 0 && !InventoryUtils.hasAllItems(itemsToBuy)) {
            prepareToBuyItems();
            System.out.println("We are missing quest supplies, switching to BUYING");
            hasCheckedSupplies = true;
            return;
        }
    }

    /**
     * Prepares the item shopping list for procurement
     */
    private static void prepareToBuyItems() {
        // This method would interface with GE buying logic
        // Implementation depends on the buying framework used
    }

    /**
     * Handles item procurement from Grand Exchange or shops
     */
    private static void handleItemProcurement() {
        // Navigate to GE and buy items
        BankingHandler.buyItemsFromGE(itemsToBuy);
    }

    /**
     * Main quest progression handler
     * Routes to appropriate step based on quest varbit state
     */
    private static void handleQuestProgression() {
        int questProgress = Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId());

        // Quest step routing based on progress
        if (questProgress == 0) {
            // Not started - go to Veliaf
            startQuest();
        } else if (questProgress == 1) {
            // Repair boat phase
            repairBoatAndTravel();
        } else if (questProgress == 2) {
            // Meiyerditch exploration
            exploreMeiyerditch();
        } else if (questProgress == 3) {
            // Castle sketching
            sketchCastle();
        } else if (questProgress == 4) {
            // Report to Veliaf
            reportToVeliaf();
        } else if (questProgress == 5) {
            // Talk to Drezel
            speakWithDrezel();
        } else if (questProgress == 6) {
            // Investigate laboratory
            investigateLaboratory();
        } else if (questProgress == 7) {
            // Report to King Roald
            reportToKing();
        } else if (questProgress == 8) {
            // Final steps and rewards
            completeQuest();
        }
    }

    // ========== QUEST STEP METHODS ==========

    /**
     * Step 1: Start the quest by talking to Veliaf Hurtz in the Myreque hideout
     */
    private static void startQuest() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Navigate to Burgh de Rott pub if not there
        if (BURGH_DE_ROTT_AREA.contains(playerLoc)) {
            AccBuilderSotf.c = "Nav to pub";

            // Find and open trapdoor
            TileObject trapdoor = TileObjects.getNearest(OBJ_TRAPDOOR);
            if (trapdoor != null && trapdoor.distanceTo(playerLoc) > 3) {
                Movement.walkTo(trapdoor.getWorldLocation());
                Time.sleepTicks(1);
            }

            if (trapdoor != null && trapdoor.distanceTo(playerLoc) <= 3 && playerLoc.getPlane() == 0) {
                if (trapdoor.hasAction(ACTION_OPEN) && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                    trapdoor.interact(ACTION_OPEN);
                    Time.sleepTicks(3);
                }
            }
        }

        // If in hideout area, talk to Veliaf
        if (MYREQUE_HIDEOUT_AREA.contains(playerLoc)) {
            AccBuilderSotf.c = "Talking to veliaf";

            if (!Dialog.isOpen() && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                NPC veliaf = NPCs.getNearest(NPC_VELIAF_HURTZ);
                if (veliaf != null) {
                    veliaf.interact(ACTION_TALK);
                    Time.sleepTicks(3);
                }
            }

            // Handle dialog
            DialogHandler.handleDialog(DIALOG_OPTIONS);
        }
    }

    /**
     * Step 2: Repair the boat and travel to Meiyerditch
     */
    public static void repairBoatAndTravel() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Leave hideout if still inside
        if (MYREQUE_HIDEOUT_AREA.contains(playerLoc)) {
            AccBuilderSotf.c = "Leaving base";

            TileObject ladder = TileObjects.getNearest(OBJ_LADDER);
            if (ladder != null) {
                ladder.interact(ACTION_CLIMB_UP);
                Time.sleepTicks(3);
            }
        }

        // Navigate to boat location
        if (!BOAT_LOCATION_START.equals(playerLoc)) {
            AccBuilderSotf.c = "Nav to boat";
            Movement.walkTo(BOAT_LOCATION_START);
            Time.sleepTicks(1);
        }

        // Repair boat if needed
        TileObject boat = TileObjects.getNearest(OBJ_BOAT);
        if (boat != null && boat.hasAction(ACTION_INSPECT)) {
            AccBuilderSotf.c = "Fixing boat";
            boat.interact(ACTION_INSPECT);
            Time.sleepTicks(2);
        }

        // Repair chute if needed
        TileObject chute = TileObjects.getNearest(OBJ_BOAT_CHUTE);
        if (chute != null && chute.hasAction(ACTION_INSPECT)) {
            AccBuilderSotf.c = "Fixing chute";
            chute.interact(ACTION_INSPECT);
            Time.sleepTicks(2);
        }

        // Board and travel
        if (boat != null && boat.hasAction(ACTION_BOARD)) {
            AccBuilderSotf.c = "Handling boat";
            boat.interact(ACTION_BOARD);
            Time.sleepTicks(8);
        }
    }

    /**
     * Step 3: Explore Meiyerditch and talk to key NPCs
     */
    public static void exploreMeiyerditch() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        if (MEIYERDITCH_AREA.contains(playerLoc)) {
            AccBuilderSotf.c = "Nav to old man ral";

            // Talk to Old Man Ral
            NPC oldManRal = NPCs.getNearest(NPC_OLD_MAN_RAL);
            if (oldManRal != null && !Dialog.isOpen()) {
                if (playerLoc.distanceTo(OLD_MAN_RAL_LOCATION) > 5) {
                    Movement.walkTo(OLD_MAN_RAL_LOCATION);
                    Time.sleepTicks(1);
                } else {
                    oldManRal.interact(ACTION_TALK);
                    Time.sleepTicks(3);
                }
            }

            // Talk to Vertida
            NPC vertida = NPCs.getNearest(NPC_VERTIDA_SEFALATIS);
            if (vertida != null && !Dialog.isOpen()) {
                AccBuilderSotf.c = "Run to base tile";
                vertida.interact(ACTION_TALK);
                Time.sleepTicks(3);
            }

            // Handle dialogs
            DialogHandler.handleDialog(DIALOG_OPTIONS);
        }
    }

    /**
     * Step 4: Sketch the vampyre castle from three different angles
     */
    public static void sketchCastle() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Check which sketches we still need
        boolean hasNorthSketch = Inventory.contains("Castle sketch (n)");
        boolean hasWestSketch = Inventory.contains("Castle sketch (w)");
        boolean hasSouthSketch = Inventory.contains("Castle sketch (s)");

        if (!hasNorthSketch) {
            AccBuilderSotf.c = "Run to north side";
            if (playerLoc.distanceTo(CASTLE_SKETCH_NORTH) > 3) {
                Movement.walkTo(CASTLE_SKETCH_NORTH);
                Time.sleepTicks(1);
            } else {
                AccBuilderSotf.c = "Sketching";
                // Use papyrus and charcoal to sketch
                Item papyrus = Inventory.getFirst(PAPYRUS);
                if (papyrus != null) {
                    papyrus.interact("Use");
                    Time.sleepTicks(2);
                }
            }
        } else if (!hasWestSketch) {
            AccBuilderSotf.c = "Run to west side";
            if (playerLoc.distanceTo(CASTLE_SKETCH_WEST) > 3) {
                Movement.walkTo(CASTLE_SKETCH_WEST);
                Time.sleepTicks(1);
            } else {
                AccBuilderSotf.c = "Sketching";
                Item papyrus = Inventory.getFirst(PAPYRUS);
                if (papyrus != null) {
                    papyrus.interact("Use");
                    Time.sleepTicks(2);
                }
            }
        } else if (!hasSouthSketch) {
            AccBuilderSotf.c = "Run to south side";
            if (playerLoc.distanceTo(CASTLE_SKETCH_SOUTH) > 3) {
                Movement.walkTo(CASTLE_SKETCH_SOUTH);
                Time.sleepTicks(1);
            } else {
                AccBuilderSotf.c = "Sketching";
                Item papyrus = Inventory.getFirst(PAPYRUS);
                if (papyrus != null) {
                    papyrus.interact("Use");
                    Time.sleepTicks(2);
                }
            }
        } else {
            // All sketches complete, return to boat
            returnToBoat();
        }
    }

    /**
     * Helper method to return to boat after sketching
     */
    private static void returnToBoat() {
        AccBuilderSotf.c = "Nav to boat";
        TileObject boat = TileObjects.getNearest(OBJ_BOAT);
        if (boat != null) {
            boat.interact(ACTION_BOARD);
            Time.sleepTicks(8);
        }
    }

    /**
     * Step 5: Report findings to Veliaf Hurtz
     */
    private static void reportToVeliaf() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Navigate back to hideout
        if (!MYREQUE_HIDEOUT_AREA.contains(playerLoc)) {
            AccBuilderSotf.c = "Nav to pub";
            Movement.walkTo(BURGH_DE_ROTT_PUB);
            Time.sleepTicks(1);

            TileObject trapdoor = TileObjects.getNearest(OBJ_TRAPDOOR);
            if (trapdoor != null) {
                trapdoor.interact(ACTION_OPEN);
                Time.sleepTicks(3);
            }
        } else {
            // Talk to Veliaf
            AccBuilderSotf.c = "Talking to veliaf";
            NPC veliaf = NPCs.getNearest(NPC_VELIAF_HURTZ);
            if (veliaf != null && !Dialog.isOpen()) {
                veliaf.interact(ACTION_TALK);
                Time.sleepTicks(3);
            }

            DialogHandler.handleDialog(DIALOG_OPTIONS);
        }
    }

    /**
     * Step 6: Travel to Paterdomus Temple and speak with Drezel
     */
    private static void speakWithDrezel() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Navigate to Paterdomus
        if (!PATERDOMUS_AREA.contains(playerLoc)) {
            AccBuilderSotf.c = "Nav to Drezel";

            // Can use teleport or walk
            if (Magic.Lunar.OURANIA_ALTAR.canCast()) {
                // Use teleport if available
                Magic.Lunar.OURANIA_ALTAR.cast();
                Time.sleepTicks(5);
            } else {
                // Walk there
                Walker.walkTo(PATERDOMUS_TEMPLE);
                Time.sleepTicks(1);
            }
        }

        // Enter temple and go downstairs
        TileObject trapdoor = TileObjects.getNearest(OBJ_TRAPDOOR);
        if (trapdoor != null && playerLoc.getPlane() == 0) {
            trapdoor.interact(ACTION_OPEN);
            Time.sleepTicks(3);
        }

        // Talk to Drezel
        if (playerLoc.getPlane() > 0) {
            AccBuilderSotf.c = "Talk to drezel";
            NPC drezel = NPCs.getNearest(NPC_DREZEL);
            if (drezel != null && !Dialog.isOpen()) {
                drezel.interact(ACTION_TALK);
                Time.sleepTicks(3);
            }

            DialogHandler.handleDialog(DIALOG_OPTIONS);
        }
    }

    /**
     * Step 7: Investigate the laboratory beneath Paterdomus Temple
     */
    private static void investigateLaboratory() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        AccBuilderSotf.c = "Nav to bush";

        // Navigate through temple to laboratory
        TileObject stairs = TileObjects.getNearest(OBJ_STAIRCASE);
        if (stairs != null && stairs.hasAction(ACTION_CLIMB_DOWN)) {
            stairs.interact(ACTION_CLIMB_DOWN);
            Time.sleepTicks(3);
        }

        // Search laboratory table
        TileObject labTable = TileObjects.getNearest(OBJ_LAB_TABLE);
        if (labTable != null) {
            AccBuilderSotf.c = "Hiding";
            labTable.interact(ACTION_SEARCH);
            Time.sleepTicks(3);
        }

        // Return upstairs after investigating
        TileObject stairsUp = TileObjects.getNearest(stairs ->
            stairs.getName().equals(OBJ_STAIRCASE) && stairs.hasAction(ACTION_CLIMB_UP));
        if (stairsUp != null) {
            stairsUp.interact(ACTION_CLIMB_UP);
            Time.sleepTicks(3);
        }

        // Talk to Drezel again
        NPC drezel = NPCs.getNearest(NPC_DREZEL);
        if (drezel != null && !Dialog.isOpen()) {
            AccBuilderSotf.c = "Talk to drezel";
            drezel.interact(ACTION_TALK);
            Time.sleepTicks(3);
        }

        DialogHandler.handleDialog(DIALOG_OPTIONS);
    }

    /**
     * Step 8: Travel to Varrock Palace and report to King Roald
     */
    private static void reportToKing() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Navigate to Varrock Palace
        if (!VARROCK_PALACE_AREA.contains(playerLoc)) {
            AccBuilderSotf.c = "Nav to king";

            // Use Varrock teleport if available
            if (Magic.Standard.VARROCK_TELEPORT.canCast()) {
                Magic.Standard.VARROCK_TELEPORT.cast();
                Time.sleepTicks(5);
            } else {
                Walker.walkTo(VARROCK_PALACE);
                Time.sleepTicks(1);
            }
        }

        // Navigate to throne room (upstairs)
        if (playerLoc.getPlane() == 0) {
            TileObject stairs = TileObjects.getNearest(obj ->
                obj.getName().equals(OBJ_STAIRCASE) && obj.hasAction(ACTION_CLIMB_UP));
            if (stairs != null) {
                stairs.interact(ACTION_CLIMB_UP);
                Time.sleepTicks(3);
            }
        }

        // Talk to King Roald
        if (playerLoc.getPlane() == 1) {
            AccBuilderSotf.c = "talk king";
            NPC kingRoald = NPCs.getNearest(NPC_KING_ROALD);
            if (kingRoald != null && !Dialog.isOpen()) {
                kingRoald.interact(ACTION_TALK);
                Time.sleepTicks(3);
            }

            DialogHandler.handleDialog(DIALOG_OPTIONS);
        }
    }

    /**
     * Step 9: Return to Veliaf for final dialogue and quest completion
     */
    private static void completeQuest() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Return to Myreque hideout
        if (!MYREQUE_HIDEOUT_AREA.contains(playerLoc)) {
            AccBuilderSotf.c = "Nav to pub";

            // Navigate to Burgh de Rott
            Walker.walkTo(BURGH_DE_ROTT_PUB);
            Time.sleepTicks(1);

            // Enter hideout
            TileObject trapdoor = TileObjects.getNearest(OBJ_TRAPDOOR);
            if (trapdoor != null) {
                trapdoor.interact(ACTION_OPEN);
                Time.sleepTicks(3);
            }
        } else {
            // Final conversation with Veliaf
            AccBuilderSotf.c = "Talking to veliaf";
            NPC veliaf = NPCs.getNearest(NPC_VELIAF_HURTZ);
            if (veliaf != null && !Dialog.isOpen()) {
                veliaf.interact(ACTION_TALK);
                Time.sleepTicks(3);
            }

            DialogHandler.handleDialog(DIALOG_OPTIONS);

            // Handle tome of experience rewards
            handleRewards();
        }
    }

    /**
     * Handles the tome of experience rewards at quest completion
     * Player can choose which skill to apply the experience to
     */
    private static void handleRewards() {
        // Check for tomes in inventory
        if (Inventory.contains(TOME_OF_EXPERIENCE_3)) {
            Item tome3 = Inventory.getFirst(TOME_OF_EXPERIENCE_3);
            if (tome3 != null && !Dialog.isOpen()) {
                AccBuilderSotf.c = "Rubbing book";
                tome3.interact(ACTION_READ);
                Time.sleepTicks(2);
            }

            // Select Agility for the experience
            if (Dialog.isOpen()) {
                AccBuilderSotf.c = "Selecting agility";
                Dialog.chooseOption("Agility");
                Time.sleepTicks(2);
                Dialog.chooseOption("Confirm");
                Time.sleepTicks(2);
            }
        }

        if (Inventory.contains(TOME_OF_EXPERIENCE_2)) {
            Item tome2 = Inventory.getFirst(TOME_OF_EXPERIENCE_2);
            if (tome2 != null && !Dialog.isOpen()) {
                tome2.interact(ACTION_READ);
                Time.sleepTicks(2);
            }

            if (Dialog.isOpen()) {
                Dialog.chooseOption("Agility");
                Time.sleepTicks(2);
                Dialog.chooseOption("Confirm");
                Time.sleepTicks(2);
            }
        }

        if (Inventory.contains(TOME_OF_EXPERIENCE_1)) {
            Item tome1 = Inventory.getFirst(TOME_OF_EXPERIENCE_1);
            if (tome1 != null && !Dialog.isOpen()) {
                tome1.interact(ACTION_READ);
                Time.sleepTicks(2);
            }

            if (Dialog.isOpen()) {
                Dialog.chooseOption("Agility");
                Time.sleepTicks(2);
                Dialog.chooseOption("Confirm");
                Time.sleepTicks(2);
            }
        }
    }

    /**
     * Helper method for navigating through Meiyerditch walls and obstacles
     * Meiyerditch has a complex navigation system with broken walls and floors
     */
    public static void handleMeiyerditch Navigation() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Look for walls to climb
        TileObject wall = TileObjects.getNearest(OBJ_WALL);
        if (wall != null && wall.distanceTo(playerLoc) <= 5) {
            if (Reachable.isInteractable(wall)) {
                wall.interact(ACTION_CLIMB_UP);
                Time.sleepTicks(3);
            }
        }

        // Look for floors to drop through
        TileObject floor = TileObjects.getNearest(OBJ_FLOOR);
        if (floor != null && floor.hasAction(ACTION_JUMP_TO)) {
            floor.interact(ACTION_JUMP_TO);
            Time.sleepTicks(3);
        }

        // Navigate damaged walls
        TileObject wallRubble = TileObjects.getNearest(OBJ_WALL_RUBBLE);
        if (wallRubble != null) {
            wallRubble.interact("Climb-through");
            Time.sleepTicks(3);
        }
    }

    /**
     * Utility method to handle stamina potion drinking
     * Used during long walks or when run energy is low
     */
    private static void drinkStaminaIfNeeded() {
        if (Movement.getRunEnergy() < 30 && !Movement.isStaminaEnhancementActive()) {
            Item stamina = Inventory.getFirst(item ->
                item.getName().toLowerCase().contains("stamina"));
            if (stamina != null) {
                AccBuilderSotf.c = "Drink";
                stamina.interact("Drink");
                Time.sleepTicks(1);
            }
        }
    }
}
