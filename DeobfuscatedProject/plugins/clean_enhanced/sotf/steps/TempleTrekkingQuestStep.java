/*
 * Decompiled with CFR 0.152.
 *
 * Temple Trekking / Burgh de Rott Ramble Quest Step
 * Handles automated trek completion with event handling
 */
package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.runelite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.sotf.framework.*;

/**
 * Quest step for Temple Trekking / Burgh de Rott Ramble minigame.
 * Handles automated completion of treks including:
 * - Navigation between areas
 * - Combat event evasion
 * - Bog puzzle solving with A* pathfinding
 * - Bridge repair events
 * - Vine cutting events
 * - Reward claiming
 */
public class TempleTrekkingQuestStep implements QuestStep {

    // Item IDs
    private static final int ITEM_VIAL = 229;
    private static final int ITEM_KNIFE = 946;
    private static final int ITEM_HAMMER = 2347;
    private static final int ITEM_DRAGON_SWORD = 21009;
    private static final int ITEM_WEAPON_2 = 11694;
    private static final int ITEM_WEAPON_3 = 12006;
    private static final int ITEM_BRONZE_AXE = 1351;
    private static final int ITEM_FOOD_1 = 13441;
    private static final int ITEM_FOOD_2 = 13443;
    private static final int ITEM_STAMINA_POTION = 12625;
    private static final int ITEM_REWARD_TOKEN = 7629;
    private static final int BANK_BOOTH_ID = 10355;
    private static final int NPC_ESCORT_CITY = 7563;
    private static final int NPC_ESCORT_SWAMP = 7571;
    private static final int OBJECT_LONG_VINE = 17981;
    private static final int BOG_TILE_ID = 17998;

    // Widget IDs
    private static final int TREK_WIDGET_ID = 426;
    private static final int TREK_WIDGET_CHILD = 12;
    private static final int TREK_SELECTION_BIT = 2870;
    private static final int REWARD_WIDGET_ID = 608;
    private static final int REWARD_WIDGET_CHILD = 6;

    // Timing constants
    private static final int SLEEP_1_TICK = 1;
    private static final int SLEEP_2_TICKS = 2;
    private static final int SLEEP_3_TICKS = 3;
    private static final int SLEEP_4_TICKS = 4;
    private static final int SLEEP_6_TICKS = 6;
    private static final int SLEEP_5_SECONDS = 5000;
    private static final int SLEEP_10_SECONDS = 10000;
    private static final int SLEEP_80_SECONDS = 80000;
    private static final int TIMEOUT_WIDGET = 3000;
    private static final int TIMEOUT_LONG = 12000;

    // Distance thresholds
    private static final int DISTANCE_4 = 4;
    private static final int DISTANCE_7 = 7;
    private static final int DISTANCE_8 = 8;
    private static final int DISTANCE_9 = 9;
    private static final int DISTANCE_10 = 10;
    private static final int DISTANCE_12 = 12;
    private static final int DISTANCE_14 = 14;
    private static final int DISTANCE_32 = 32;
    private static final int DISTANCE_100 = 100;

    // Other constants
    private static final int ANIMATION_IDLE = -1;
    private static final int RUN_ENERGY_THRESHOLD = 9;
    private static final int MIN_HEALTH_FOOD = 32;
    private static final int SLAYER_LEVEL_REQUIREMENT = 32;
    private static final int FOOD_HEALTH_AMOUNT = 4;
    private static final int PRIORITY = 100;

    // Pathfinding constants
    private static final int BOG_OFFSET = 9;
    private static final int BOG_TIMEOUT_MS = 45000;
    private static final int[][] NEIGHBOR_OFFSETS = {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    // World locations
    public static WorldPoint bogAnchorPoint;
    public static WorldArea combatEventArea;
    public static WorldArea swampArea;
    public static WorldArea cityArea;
    public static WorldArea canifisArea;
    public static WorldPoint cityEscortPoint;
    public static WorldPoint swampEscortPoint;

    // State variables
    public static int currentHealthThreshold;
    public static int currentFoodId;
    public static int runToggleCounter;
    public static int widgetClickAttempts;
    public static String rewardPreference;
    public static long bogStartTime;
    public static boolean buyingItems;
    public static List<ShopItem> itemsToBuy;

    static {
        itemsToBuy = new ArrayList<>();

        // Combat event area (where monsters spawn)
        combatEventArea = new WorldArea(3520, 3188, 18, 35, 0);
        cityEscortPoint = new WorldPoint(3521, 3189, 0);

        currentHealthThreshold = 120;
        currentFoodId = 379;

        // Canifis area
        canifisArea = new WorldArea(3478, 3488, 42, 31, 0);

        // Swamp area (Mort'ton/Burgh de Rott)
        swampArea = new WorldArea(3490, 3202, 35, 71, 0);

        rewardPreference = "xp";

        // City area (Paterdomus)
        cityArea = new WorldArea(3408, 3475, 61, 45, 0);

        swampEscortPoint = new WorldPoint(3524, 3195, 0);
        runToggleCounter = 0;
        bogAnchorPoint = null;
        bogStartTime = System.currentTimeMillis();
    }

    @Override
    public int execute() {
        try {
            executeTrekStep();
        } catch (Exception e) {
            // Suppress exceptions
        }
        return PRIORITY;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.SLAYER) >= SLAYER_LEVEL_REQUIREMENT;
    }

    /**
     * Main execution method for the trek step.
     * Handles buying items, navigating, and managing the trek.
     */
    public static void executeTrekStep() {
        // Handle initial item buying if needed
        if (buyingItems) {
            AccBuilderSotf.c = "Buying items";
            GrandExchangeUtil.buyItems(itemsToBuy);
            if (itemsToBuy.size() == 1) {
                System.out.println("Finished buying items, switching back to agility");
                buyingItems = false;
            }
        }

        if (!buyingItems) {
            // Close GE if open
            if (GrandExchange.isOpen()) {
                GrandExchangeUtil.closeGrandExchange();
            }

            handleRewardClaiming(rewardPreference);

            // Read tome if in inventory
            Predicate<Item> tomePredicate = item -> item.getName().toLowerCase().contains("tome");
            if (Inventory.contains(tomePredicate)) {
                Inventory.getFirst(tomePredicate).interact("Read");
                Time.sleepTicks(SLEEP_1_TICK);
            }

            // Navigate to base location if far away and not in special areas
            if (!cityArea.contains(Players.getLocal().getWorldLocation()) &&
                !swampArea.contains(Players.getLocal().getWorldLocation()) &&
                !hasRequiredItems() &&
                Players.getLocal().getWorldLocation().distanceTo(GrandExchangeUtil.GE_LOCATION) > DISTANCE_7) {
                Movement.walkTo(GrandExchangeUtil.GE_LOCATION);
                Time.sleepTicks(SLEEP_1_TICK);
            }

            // Handle banking if needed
            if (!hasRequiredItems() && Players.getLocal().getWorldLocation().distanceTo(GrandExchangeUtil.GE_LOCATION) < DISTANCE_14) {
                handleBanking();
            }

            // Main trek logic
            if (hasRequiredItems()) {
                executeTrekLogic();
            }

            // Emergency food consumption
            if (Skills.getBoostedLevel(Skill.HITPOINTS) == currentHealthThreshold) {
                if (Inventory.contains(currentFoodId)) {
                    if (Inventory.contains("Knife") && Inventory.contains(ITEM_FOOD_2)) {
                        AccBuilderSotf.c = "Needs items, banking";
                        BankingUtil.withdrawItem(ITEM_FOOD_2, 1);
                    }
                }
            }
        }
    }

    /**
     * Handles the main trek logic including navigation and events.
     */
    private static void executeTrekLogic() {
        // Drop vials
        if (Inventory.contains("Vial")) {
            Inventory.getFirst("Vial").interact("Drop");
        }

        // Equip items
        equipItems();

        // Drink stamina potion if needed
        if (Inventory.contains(ItemIdArrays.STAMINA_POTIONS) && Movement.getRunEnergy() == MIN_HEALTH_FOOD) {
            Inventory.getFirst(ItemIdArrays.STAMINA_POTIONS).interact("Drink");
            Time.sleepTicks(SLEEP_1_TICK);
        }

        // Toggle run if needed
        if (Movement.getRunEnergy() > RUN_ENERGY_THRESHOLD && !Movement.isRunEnabled()) {
            Movement.toggleRun();
        }

        handleRewardClaiming(rewardPreference);

        // Read tome if present
        Predicate<Item> tomePredicate = item -> item.getName().toLowerCase().contains("tome");
        if (Inventory.contains(tomePredicate)) {
            Inventory.getFirst(tomePredicate).interact("Read");
            Time.sleepTicks(SLEEP_1_TICK);
        }

        // Handle city escort
        if (cityArea.contains(Players.getLocal().getWorldLocation())) {
            handleCityEscort(tomePredicate);
        }

        // Handle swamp escort
        if (swampArea.contains(Players.getLocal().getWorldLocation())) {
            handleSwampEscort(tomePredicate);
        }

        // Handle trek events
        try {
            handleTrekEvents();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    /**
     * Handles banking operations to withdraw required items.
     */
    private static void handleBanking() {
        if (Players.getLocal().getWorldLocation().distanceTo(D.fa) > DISTANCE_4) {
            AccBuilderSotf.c = "Navigating to bank";

            NPC veliaf = NPCs.getNearest("Veliaf Hurtz");
            if (veliaf != null) {
                TileObject ladder = TileObjects.getNearest("Ladder");
                if (ladder != null) {
                    ladder.interact("Climb-up");
                    Time.sleepTicks(SLEEP_4_TICKS);
                }
            }

            if (NPCs.getNearest("Veliaf Hurtz") == null &&
                Players.getLocal().getWorldLocation().distanceTo(D.fa) > DISTANCE_4) {
                AccBuilderSotf.c = "Nav to burgh bank";
                Movement.walkTo(D.fa);
                Time.sleepTicks(SLEEP_1_TICK);
            }
        }

        if (Players.getLocal().getWorldLocation().distanceTo(D.fa) < DISTANCE_4) {
            AccBuilderSotf.c = "Handling banking";

            // Open bank
            if (!Bank.isOpen()) {
                TileObject bankBooth = TileObjects.getNearest(BANK_BOOTH_ID);
                if (bankBooth != null) {
                    bankBooth.interact("Bank");
                    Time.sleepTicks(SLEEP_2_TICKS);
                }
            }

            // Deposit all
            if (Bank.isOpen() && Inventory.getAll().size() > 0) {
                Bank.depositInventory();
                Time.sleepTicks(SLEEP_1_TICK);
            }

            // Withdraw equipment if not equipped
            withdrawIfNeeded(ITEM_WEAPON_2);
            withdrawIfNeeded(ITEM_WEAPON_3);
            withdrawIfNeeded(ITEM_FOOD_1);
            withdrawIfNeeded(ITEM_FOOD_2);
            withdrawIfNeeded(ITEM_STAMINA_POTION);

            // Withdraw food if low health
            if (Skills.getBoostedLevel(Skill.HITPOINTS) == MIN_HEALTH_FOOD) {
                if (!Inventory.contains(currentFoodId)) {
                    BankingUtil.withdrawItem(currentFoodId, FOOD_HEALTH_AMOUNT);
                }
            }

            // Withdraw reward tokens
            if (!Inventory.contains(ITEM_REWARD_TOKEN)) {
                Bank.withdrawAll(ITEM_REWARD_TOKEN, Bank.WithdrawMode.ITEM);
            }
        }
    }

    /**
     * Withdraws an item from the bank if not in inventory or equipped.
     */
    private static void withdrawIfNeeded(int itemId) {
        if (!Equipment.contains(itemId)) {
            if (!Inventory.contains(itemId)) {
                BankingUtil.withdrawItem(itemId, 1);
            }
        }
    }

    /**
     * Handles city escort interaction.
     */
    private static void handleCityEscort(Predicate<Item> tomePredicate) {
        if (!Inventory.contains("Reward token") && !Inventory.contains(tomePredicate)) {
            if (runToggleCounter == 1 && Movement.getRunEnergy() >= RUN_ENERGY_THRESHOLD) {
                Movement.toggleRun();
                runToggleCounter++;
            }

            if (Skills.getBoostedLevel(Skill.HITPOINTS) >= MIN_HEALTH_FOOD) {
                if (Players.getLocal().getWorldLocation().distanceTo(cityEscortPoint) > DISTANCE_8) {
                    AccBuilderSotf.c = "Nav to city escort tile";
                    if (Dialog.isOpen()) {
                        Dialog.close();
                    }
                    Movement.walkTo(cityEscortPoint);
                    Time.sleepTicks(SLEEP_1_TICK);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(cityEscortPoint) < DISTANCE_8) {
                    Time.sleepTicks(SLEEP_2_TICKS);

                    if (!Dialog.isOpen() && !Static.getClient().isInInstancedRegion()) {
                        if (!Inventory.contains("Reward token") &&
                            !Inventory.contains(tomePredicate) &&
                            Widgets.get(TREK_WIDGET_ID).isEmpty() &&
                            !Vars.getBit(TREK_SELECTION_BIT)) {
                            AccBuilderSotf.c = "Clicking npc";
                            NPC escort = NPCs.getNearest(NPC_ESCORT_CITY);
                            if (escort != null && !Dialog.isOpen()) {
                                escort.interact("Escort");
                                Time.sleepTicks(SLEEP_3_TICKS);
                            }

                            DialogUtil.chooseDialogOptions(new String[0]);
                        }
                    }
                }
            }

            DialogUtil.chooseDialogOptions(new String[]{"Yes."});
        }
    }

    /**
     * Handles swamp escort interaction.
     */
    private static void handleSwampEscort(Predicate<Item> tomePredicate) {
        if (!Inventory.contains("Reward token") && !Inventory.contains(tomePredicate)) {
            if (Skills.getBoostedLevel(Skill.HITPOINTS) >= MIN_HEALTH_FOOD) {
                if (Players.getLocal().getWorldLocation().distanceTo(swampEscortPoint) > DISTANCE_8) {
                    AccBuilderSotf.c = "Nav to npc";
                    if (Dialog.isOpen()) {
                        Dialog.close();
                    }
                    Movement.walkTo(swampEscortPoint);
                    Time.sleepTicks(SLEEP_1_TICK);
                }

                Time.sleepTicks(SLEEP_2_TICKS);

                if (!Dialog.isOpen() && !Static.getClient().isInInstancedRegion()) {
                    if (!Inventory.contains("Reward token") && !Inventory.contains(tomePredicate)) {
                        if (runToggleCounter == 1 && Movement.getRunEnergy() >= RUN_ENERGY_THRESHOLD) {
                            Movement.toggleRun();
                            runToggleCounter++;
                        }

                        if (Widgets.get(TREK_WIDGET_ID, TREK_WIDGET_CHILD) != null) {
                            AccBuilderSotf.c = "Clicking npc";
                            NPC escort = NPCs.getNearest(NPC_ESCORT_SWAMP);
                            if (escort != null && !Dialog.isOpen() && !Vars.getBit(TREK_SELECTION_BIT)) {
                                escort.interact("Escort");
                                Time.sleepTicks(SLEEP_3_TICKS);
                            }

                            DialogUtil.chooseDialogOptions(new String[0]);
                            Time.sleepTicks(SLEEP_2_TICKS);
                        }
                    }
                }
            }

            DialogUtil.chooseDialogOptions(new String[0]);
        }
    }

    /**
     * Handles all trek events including combat evasion, bridges, vines, and bog.
     */
    public static void handleTrekEvents() {
        // Handle starting trek dialog
        DialogUtil.chooseDialogOptions(new String[]{"Yes."});

        Widget startButton = Widgets.get(TREK_WIDGET_ID, TREK_WIDGET_CHILD);
        TileObject continueObject = TileObjects.getNearest(obj -> obj.hasAction("Continue-trek"));
        TileObject readObject = TileObjects.getNearest(obj -> obj.hasAction("Read"));

        if (startButton != null &&
            continueObject != null &&
            readObject != null &&
            continueObject.distanceTo(readObject) < DISTANCE_8 &&
            widgetClickAttempts == 4) {

            bogAnchorPoint = null;
            runToggleCounter = 0;
            AccBuilderSotf.c = "Starting trek";

            Mouse.click(startButton.getClickPoint().getX(), startButton.getClickPoint().getY(), true);
            Time.sleepUntil(() -> Widgets.fromId(25034) != null, SLEEP_5_SECONDS, 6000);
            widgetClickAttempts++;

            if (System.currentTimeMillis() > bogStartTime + 30000L) {
                widgetClickAttempts = 0;
            }
        }

        // Combat evasion events
        if (NPCs.getNearest("Vampyre Juvinate") == null &&
            NPCs.getNearest("Giant snail") == null &&
            NPCs.getNearest("Nail beast") == null &&
            NPCs.getNearest("Abidor Crank") == null &&
            NPCs.getNearest("Swamp snake") == null &&
            NPCs.getNearest("Riyl shadow") != null &&
            (TileObjects.getNearest(obj -> obj.getName().contains("bridge")) != null ||
             TileObjects.getNearest(obj -> obj.getName().contains("Swamp tree")) != null)) {

            if (Players.getLocal().getWorldLocation().distanceTo(GrandExchangeUtil.GE_LOCATION) > DISTANCE_10) {
                TileObject evadeObject = TileObjects.getNearest("Bog");
                if (evadeObject != null) {
                    bogAnchorPoint = null;
                    AccBuilderSotf.c = "Evading combat event";
                    TileObject evade = TileObjects.getNearest(obj -> obj.hasAction("Evade-event"));
                    if (evade != null) {
                        evade.interact("Evade-event");
                        Time.sleepUntil(() -> LocalPlayer.get().isMoving(),
                            Rand.nextInt(1500, 2500));
                    }
                }
            }
        }

        // Ghast evasion
        if (NPCs.getNearest("Ghast") != null &&
            !combatEventArea.contains(Players.getLocal().getWorldLocation()) &&
            Players.getLocal().getWorldLocation().distanceTo(cityEscortPoint) > DISTANCE_12) {

            AccBuilderSotf.c = "Evading ghast event";
            TileObject evade = TileObjects.getNearest(obj -> obj.hasAction("Evade-event"));
            if (evade != null) {
                evade.interact("Evade-event");
                Time.sleepUntil(() -> LocalPlayer.get().isMoving(),
                    Rand.nextInt(1500, 2500));
            }
        }

        // Handle bridge containing objects
        TileObject bridgeObject = TileObjects.getNearest(obj -> obj.getName().contains("bridge"));

        // Broken bridge event
        if (TileObjects.getNearest("Broken bridge") != null) {
            handleBrokenBridge();
            DialogUtil.chooseDialogOptions(new String[]{"Yes."});
        }

        // Partially broken bridge event
        if (TileObjects.getNearest("Partially broken bridge") != null) {
            handlePartiallyBrokenBridge();
            DialogUtil.chooseDialogOptions(new String[]{"Yes."});
        }

        // Slightly broken bridge event
        if (TileObjects.getNearest("Slightly broken bridge") != null) {
            handleSlightlyBrokenBridge();
            DialogUtil.chooseDialogOptions(new String[]{"Yes."});
        }

        // Fixed bridge crossing
        if (TileObjects.getNearest("Fixed bridge") != null) {
            handleFixedBridge();
        }

        // Vine cutting event
        if (TileObjects.getNearest("Swamp tree") != null) {
            handleVineCutting();
        }

        // Bog navigation puzzle
        if (TileObjects.getNearest("Bog") != null) {
            handleBogPuzzle();
        }

        // Use reward token to teleport if not in special areas and have health
        if (!cityArea.contains(Players.getLocal().getWorldLocation()) &&
            !swampArea.contains(Players.getLocal().getWorldLocation()) &&
            GameStateUtil.getHealthPercentage() > 25.0) {

            if (Inventory.contains(ITEM_REWARD_TOKEN)) {
                Time.sleepTicks(GameStateUtil.randomRange(3, 4));
                widgetClickAttempts = 0;
            }
        }
    }

    /**
     * Handles broken bridge repair event.
     */
    private static void handleBrokenBridge() {
        bogAnchorPoint = null;
        AccBuilderSotf.c = "broken bridge event";

        if (TileObjects.getNearest("Dead tree") == null) {
            // Pick up plank
            TileObject plank = TileItems.getNearest("Plank");
            if (plank != null) {
                plank.interact("Take");
                Time.sleepTicks(SLEEP_1_TICK);
            }

            // Check for lumberjack drop
            TileObject lumberjackItem = TileItems.getNearest(item -> item.getName().contains("Lumberjack"));

            // Attack lumberjack if present
            NPC lumberjack = NPCs.getNearest("Undead Lumberjack");
            if (lumberjack != null &&
                LocalPlayer.get().getInteracting() != lumberjack &&
                !lumberjack.isDead() &&
                Reachable.isInteractable(lumberjack)) {
                lumberjack.interact("Attack");
            }
        }

        // Chop tree for logs
        if (Inventory.contains("Logs") &&
            Inventory.getAll("Logs").size() < 3) {

            TileObject tree = TileObjects.getNearest("Dead tree");
            if (tree != null && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                tree.interact("Chop down");
                Time.sleepTicks(SLEEP_2_TICKS);
            }
        }

        // Use logs/planks on bridge to repair
        if (Inventory.getAll("Logs").size() == 3 &&
            Inventory.getAll("Plank").size() >= 3) {

            if (Inventory.contains("Plank") && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                Inventory.getFirst("Plank").useOn(TileObjects.getNearest("Broken bridge"));
                Time.sleepTicks(SLEEP_2_TICKS);
            }

            if (Inventory.contains("Logs") && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                Inventory.getFirst("Logs").useOn(TileObjects.getNearest("Broken bridge"));
                Time.sleepTicks(SLEEP_2_TICKS);
            }
        }
    }

    /**
     * Handles partially broken bridge repair event.
     */
    private static void handlePartiallyBrokenBridge() {
        AccBuilderSotf.c = "partial bridge event";

        if (!Inventory.contains("Logs") && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
            TileObject tree = TileObjects.getNearest("Dead tree");
            if (tree != null) {
                tree.interact("Chop down");
                Time.sleepTicks(SLEEP_2_TICKS);
            }
        }

        if (!Inventory.contains("Logs") && !Inventory.contains("Plank")) {
            if (Inventory.contains("Plank") && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                Inventory.getFirst("Plank").useOn(TileObjects.getNearest("Partially broken bridge"));
                Time.sleepTicks(SLEEP_2_TICKS);
            }

            if (Inventory.contains("Logs") && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                Inventory.getFirst("Logs").useOn(TileObjects.getNearest("Partially broken bridge"));
                Time.sleepTicks(SLEEP_2_TICKS);
            }

            TileObject bridge = TileObjects.getNearest("Partially broken bridge");
            if (bridge != null) {
                bridge.interact("Inspect");
                Time.sleepTicks(SLEEP_2_TICKS);
            }
        }
    }

    /**
     * Handles slightly broken bridge repair event.
     */
    private static void handleSlightlyBrokenBridge() {
        AccBuilderSotf.c = "slightly bridge event";

        if (!Inventory.contains("Logs") && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
            TileObject tree = TileObjects.getNearest("Dead tree");
            if (tree != null) {
                tree.interact("Chop down");
                Time.sleepTicks(SLEEP_2_TICKS);
            }
        }

        if (!Inventory.contains("Logs") && !Inventory.contains("Plank")) {
            if (Inventory.contains("Plank") && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                Inventory.getFirst("Plank").useOn(TileObjects.getNearest("Slightly broken bridge"));
                Time.sleepTicks(SLEEP_2_TICKS);
            }

            if (Inventory.contains("Logs") && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                Inventory.getFirst("Logs").useOn(TileObjects.getNearest("Slightly broken bridge"));
                Time.sleepTicks(SLEEP_2_TICKS);
            }

            TileObject bridge = TileObjects.getNearest("Slightly broken bridge");
            if (bridge != null) {
                bridge.interact("Inspect");
                Time.sleepTicks(SLEEP_2_TICKS);
            }
        }
    }

    /**
     * Handles crossing fixed bridges.
     */
    private static void handleFixedBridge() {
        List<TileObject> paths = TileObjects.getAll("Path");
        List<TileObject> pathsWithContinue = paths.stream()
            .filter(obj -> obj.hasAction("Continue-trek"))
            .collect(Collectors.toList());

        TileObject fixedBridge = TileObjects.getNearest(obj ->
            obj.hasAction("Cross") && obj.getName().equals("Fixed bridge"));

        if (fixedBridge != null) {
            if (Players.getLocal().getWorldX() >= fixedBridge.getWorldX()) {
                TileObject continuePath = TileObjects.getNearest(obj -> obj.hasAction("Continue-trek"));
                if (continuePath != null) {
                    AccBuilderSotf.c = "Continuing trek";
                    continuePath.interact("Continue-trek");
                    Time.sleepTicks(GameStateUtil.randomRange(3, 4));
                    return;
                }
            } else {
                AccBuilderSotf.c = "Crossing bridge";
                fixedBridge.interact("Cross");
                Time.sleepTicks(SLEEP_4_TICKS);
            }
        }
    }

    /**
     * Handles vine cutting event.
     */
    private static void handleVineCutting() {
        bogAnchorPoint = null;

        List<TileObject> paths = TileObjects.getAll("Path");
        List<TileObject> pathsWithCut = paths.stream()
            .filter(obj -> obj.hasAction("Cut-vine"))
            .collect(Collectors.toList());

        if (!pathsWithCut.isEmpty()) {
            if (!Reachable.isInteractable((Locatable) pathsWithCut.get(0))) {
                if (Inventory.contains("Short vine") &&
                    Inventory.getAll("Short vine").size() == 3) {

                    AccBuilderSotf.c = "Cutting vines";

                    List<TileObject> swampTrees = TileObjects.getAll("Swamp tree");
                    List<TileObject> treesWithCut = swampTrees.stream()
                        .filter(obj -> obj.hasAction("Cut-vine"))
                        .collect(Collectors.toList());

                    if (!treesWithCut.isEmpty()) {
                        treesWithCut.get(0).interact("Cut-vine");
                        Time.sleepTicks(SLEEP_2_TICKS);
                    }
                }
            } else {
                AccBuilderSotf.c = "Continuing trek";
                pathsWithCut.get(0).interact("Continue-trek");
                Time.sleepTicks(GameStateUtil.randomRange(3, 4));
                return;
            }
        }

        // Combine short vines
        if (Inventory.contains("Short vine")) {
            if (Inventory.getAll("Short vine").size() >= 3) {
                Inventory.getFirst("Short vine").useOn(
                    Inventory.getAll("Short vine").get(1));
            }
        }

        // Use long vine on swamp tree branch
        if (Inventory.contains("Long vine")) {
            Inventory.getFirst("Long vine").useOn(TileObjects.getNearest(OBJECT_LONG_VINE));
            Time.sleepTicks(SLEEP_6_TICKS);
        }

        // Swing from branch
        List<TileObject> branches = TileObjects.getAll("Swamp tree branch");
        List<TileObject> branchesWithSwing = branches.stream()
            .filter(obj -> obj.hasAction("Swing-from"))
            .collect(Collectors.toList());

        if (!branchesWithSwing.isEmpty()) {
            branchesWithSwing.get(0).interact("Swing-from");
            Time.sleepTicks(SLEEP_6_TICKS);
        }
    }

    /**
     * Handles the bog navigation puzzle using A* pathfinding.
     */
    private static void handleBogPuzzle() {
        AccBuilderSotf.c = "Solving bog";
        System.out.println("Start of bog section");

        List<TileObject> bogTiles = new ArrayList<>();
        long bogLoopStartTime = System.currentTimeMillis();

        while (true) {
            if (TileObjects.getAll("Bog").isEmpty() ||
                Game.getState() != GameState.LOGGED_IN ||
                !AccBuilderSotf.d) {
                break;
            }

            int version = 0;

            if (bogTiles.isEmpty()) {
                Time.sleepTicks(SLEEP_6_TICKS);
                System.out.println("Set tiles");

                bogTiles = TileObjects.getAll(obj -> obj.getId() == BOG_TILE_ID);
                System.out.println("Set anchor");

                TileObject pathObj = TileObjects.getNearest("Path");
                if (pathObj != null) {
                    bogAnchorPoint = pathObj.getWorldLocation();
                }

                TileObject pathWithContinue = TileObjects.getNearest(obj ->
                    obj.getName().contains("Path") && obj.hasAction("Continue-trek"));

                if (pathWithContinue != null && bogAnchorPoint != null &&
                    pathWithContinue.getWorldLocation().getY() > bogAnchorPoint.getY() + BOG_OFFSET) {
                    version = 1;
                }
            }

            System.out.println("Version: " + (version != 0));

            // Version 0: Navigate south
            if (version == 0) {
                if (bogAnchorPoint != null &&
                    Players.getLocal().getWorldLocation().getY() > bogAnchorPoint.getY() - BOG_OFFSET) {

                    List<WorldPoint> bogPositions = bogTiles.stream()
                        .map(obj -> obj.getWorldLocation())
                        .collect(Collectors.toList());

                    // Generate start tiles
                    WorldPoint[] startTiles = new WorldPoint[10];
                    startTiles[0] = new WorldPoint(bogAnchorPoint.getX() - 4, bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());
                    startTiles[1] = new WorldPoint(bogAnchorPoint.getX() - 4, bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());
                    startTiles[2] = new WorldPoint(bogAnchorPoint.getX() - 3, bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());
                    startTiles[3] = new WorldPoint(bogAnchorPoint.getX() - 2, bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());
                    startTiles[4] = new WorldPoint(bogAnchorPoint.getX() - 1, bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());
                    startTiles[5] = new WorldPoint(bogAnchorPoint.getX(), bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());
                    startTiles[6] = new WorldPoint(bogAnchorPoint.getX() + 1, bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());
                    startTiles[7] = new WorldPoint(bogAnchorPoint.getX() + 2, bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());
                    startTiles[8] = new WorldPoint(bogAnchorPoint.getX() + 3, bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());
                    startTiles[9] = new WorldPoint(bogAnchorPoint.getX() + 4, bogAnchorPoint.getY() - 4, bogAnchorPoint.getPlane());

                    List<WorldPoint> startList = Arrays.asList(startTiles);
                    System.out.println("Start tiles: " + startList.size());

                    boolean pathFound = false;
                    for (int i = 0; i < startList.size(); i++) {
                        AccBuilderSotf.c = "Generating path";
                        List<WorldPoint> path = findBogPath(startList.get(i),
                            bogAnchorPoint.getY() - BOG_OFFSET, bogPositions);

                        if (!path.isEmpty()) {
                            System.out.println("Path found:");
                            for (WorldPoint point : path) {
                                System.out.println("(" + point.getX() + ", " + point.getY() + ", " + point.getPlane() + ")");
                            }

                            pathFound = true;
                            navigateBogPath(path, bogAnchorPoint.getY() - BOG_OFFSET);

                            if (Game.getState() != GameState.LOGGED_IN) {
                                System.out.println("Not logged in, breaking");
                                break;
                            }
                            break;
                        }
                    }

                    if (!pathFound) {
                        System.out.println("No path found.");
                    }

                    System.out.println(bogTiles.size());
                }

                if (bogAnchorPoint != null &&
                    Players.getLocal().getWorldLocation().getY() <= bogAnchorPoint.getY() - BOG_OFFSET) {
                    AccBuilderSotf.c = "Continue trek";
                    TileObject path = TileObjects.getNearest("Path");
                    if (path != null) {
                        path.interact("Continue-trek");
                        Time.sleepTicks(SLEEP_4_TICKS);
                    }
                }
            }

            // Version 1: Navigate north
            if (version == 1) {
                if (bogAnchorPoint != null &&
                    Players.getLocal().getWorldLocation().getY() == bogAnchorPoint.getY() + BOG_OFFSET) {

                    List<WorldPoint> bogPositions = bogTiles.stream()
                        .map(obj -> obj.getWorldLocation())
                        .collect(Collectors.toList());

                    // Generate start tiles
                    WorldPoint[] startTiles = new WorldPoint[10];
                    startTiles[0] = new WorldPoint(bogAnchorPoint.getX() - 4, bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());
                    startTiles[1] = new WorldPoint(bogAnchorPoint.getX() - 4, bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());
                    startTiles[2] = new WorldPoint(bogAnchorPoint.getX() - 3, bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());
                    startTiles[3] = new WorldPoint(bogAnchorPoint.getX() - 2, bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());
                    startTiles[4] = new WorldPoint(bogAnchorPoint.getX() - 1, bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());
                    startTiles[5] = new WorldPoint(bogAnchorPoint.getX(), bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());
                    startTiles[6] = new WorldPoint(bogAnchorPoint.getX() + 1, bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());
                    startTiles[7] = new WorldPoint(bogAnchorPoint.getX() + 2, bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());
                    startTiles[8] = new WorldPoint(bogAnchorPoint.getX() + 3, bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());
                    startTiles[9] = new WorldPoint(bogAnchorPoint.getX() + 4, bogAnchorPoint.getY() + 4, bogAnchorPoint.getPlane());

                    List<WorldPoint> startList = Arrays.asList(startTiles);
                    System.out.println("Start tiles: " + startList.size());

                    boolean pathFound = false;
                    for (int i = 0; i < startList.size(); i++) {
                        AccBuilderSotf.c = "Generating path";
                        List<WorldPoint> path = findBogPath(startList.get(i),
                            bogAnchorPoint.getY() + BOG_OFFSET, bogPositions);

                        if (!path.isEmpty()) {
                            System.out.println("Path found:");
                            for (WorldPoint point : path) {
                                System.out.println("(" + point.getX() + ", " + point.getY() + ", " + point.getPlane() + ")");
                            }

                            pathFound = true;
                            navigateBogPath(path, bogAnchorPoint.getY() + BOG_OFFSET);

                            if (Game.getState() != GameState.LOGGED_IN) {
                                System.out.println("Not logged in, breaking");
                                break;
                            }
                            break;
                        }
                    }

                    if (!pathFound) {
                        System.out.println("No path found.");
                    }

                    System.out.println(bogTiles.size());
                }

                if (bogAnchorPoint != null &&
                    Players.getLocal().getWorldLocation().getY() >= bogAnchorPoint.getY() + BOG_OFFSET) {
                    AccBuilderSotf.c = "Continue trek";
                    TileObject path = TileObjects.getNearest("Path");
                    if (path != null) {
                        path.interact("Continue-trek");
                        Time.sleepTicks(SLEEP_4_TICKS);
                    }
                }
            }

            // Timeout check
            if (System.currentTimeMillis() > bogLoopStartTime + BOG_TIMEOUT_MS) {
                AccBuilderSotf.c = "In bog too long, logging to reset";
                Game.logout();
                bogLoopStartTime = System.currentTimeMillis();
            }
        }

        // Teleport out if solved
        if (Inventory.contains(ITEM_REWARD_TOKEN)) {
            Time.sleepTicks(GameStateUtil.randomRange(3, 4));
            widgetClickAttempts = 0;
        }
    }

    /**
     * Navigates along a path through the bog.
     */
    private static void navigateBogPath(List<WorldPoint> path, int targetY) {
        boolean navigating = true;

        while (navigating && !path.isEmpty()) {
            if (!Players.getLocal().getWorldLocation().equals(path.get(0))) {
                if (Players.getLocal().getWorldLocation().getY() > targetY) {
                    AccBuilderSotf.c = "Walk to start tile";
                    GameStateUtil.randomRange(path.get(0));
                    Time.sleepUntil(() -> Players.getLocal().getWorldLocation().getY() > targetY,
                        GameStateUtil.randomRange(2000, 3000));
                    Time.sleepTicks(SLEEP_2_TICKS);
                } else {
                    AccBuilderSotf.c = "Navigating bog";
                    List<TileObject> bogTiles = TileObjects.getAt(path.get(0), "Bog");
                    if (!bogTiles.isEmpty()) {
                        System.out.println("Bog size: " + bogTiles.size());
                        bogTiles.get(0).interact("Stand-on");
                        Time.sleepTicks(SLEEP_2_TICKS);
                    }

                    if (bogTiles.isEmpty()) {
                        System.out.println("Bog is null at: " + path.get(0));
                        Game.logout();
                        Time.sleepTicks(SLEEP_2_TICKS);
                        break;
                    }
                    Time.sleepTicks(SLEEP_2_TICKS);
                }
            }

            if (Players.getLocal().getWorldLocation().equals(path.get(0))) {
                System.out.println("Removed tile");
                path.remove(0);
                Time.sleepTicks(SLEEP_2_TICKS);
            }

            System.out.println("Path size left: " + path.size());
            Time.sleepTicks(SLEEP_1_TICK);
        }

        if (Game.getState() != GameState.LOGGED_IN) {
            System.out.println("Not logged in, breaking");
        }
    }

    /**
     * A* pathfinding algorithm to find a path through the bog.
     *
     * @param start Starting world point
     * @param targetY Target Y coordinate
     * @param validTiles List of valid bog tiles
     * @return List of world points representing the path
     */
    public static List<WorldPoint> findBogPath(WorldPoint start, int targetY, List<WorldPoint> validTiles) {
        PriorityQueue<as> openSet = new PriorityQueue<>();
        List<as> closedSet = new ArrayList<>();

        openSet.add(new as(start, null, 0, calculateHeuristic(start.getY(), targetY)));

        while (!openSet.isEmpty()) {
            as current = openSet.poll();

            // Check if reached goal
            if (current.nT.getY() == targetY) {
                return reconstructPath(current);
            }

            closedSet.add(current);

            // Generate neighbors
            List<as> neighbors = generateNeighbors(current, validTiles);
            for (as neighbor : neighbors) {
                int tentativeG = current.nV + 1;

                if (inList(neighbor, closedSet)) {
                    continue;
                }

                if (!inQueue(neighbor, openSet) || tentativeG == neighbor.nV) {
                    openSet.add(neighbor);
                }
            }
        }

        return Collections.emptyList();
    }

    /**
     * Generates valid neighbor nodes for A* pathfinding.
     */
    private static List<as> generateNeighbors(as current, List<WorldPoint> validTiles) {
        List<as> neighbors = new ArrayList<>();

        for (int[] offset : NEIGHBOR_OFFSETS) {
            int newX = current.nT.getX() + offset[0];
            int newY = current.nT.getY() + offset[1];
            int plane = current.nT.getPlane();

            WorldPoint neighborPoint = new WorldPoint(newX, newY, plane);

            if (validTiles.contains(neighborPoint)) {
                neighbors.add(new as(neighborPoint, current, 0,
                    calculateHeuristic(newY, bogAnchorPoint.getY() + BOG_OFFSET)));
            }
        }

        return neighbors;
    }

    /**
     * Reconstructs the path from the goal node back to the start.
     */
    private static List<WorldPoint> reconstructPath(as node) {
        List<WorldPoint> path = new ArrayList<>();

        while (node != null) {
            path.add(node.nT);
            node = node.nU;
        }

        Collections.reverse(path);
        return path;
    }

    /**
     * Calculates Manhattan distance heuristic for A*.
     */
    private static int calculateHeuristic(int currentY, int targetY) {
        return Math.abs(currentY - targetY);
    }

    /**
     * Checks if a node is in a list.
     */
    private static boolean inList(as node, List<as> list) {
        return list.stream().anyMatch(n -> n.nT.equals(node.nT));
    }

    /**
     * Checks if a node is in a priority queue.
     */
    private static boolean inQueue(as node, PriorityQueue<as> queue) {
        return queue.stream().anyMatch(n -> n.nT.equals(node.nT));
    }

    /**
     * Handles claiming rewards after trek completion.
     */
    public static void handleRewardClaiming(String rewardType) {
        if (!Inventory.contains("Reward token")) {
            return;
        }

        widgetClickAttempts = 0;
        AccBuilderSotf.c = "Claiming reward;";

        Inventory.getFirst("Reward token").interact("Look-at");
        Time.sleepTicks(SLEEP_3_TICKS);

        if (Widgets.get(REWARD_WIDGET_ID, REWARD_WIDGET_CHILD) != null &&
            !Widgets.get(REWARD_WIDGET_ID).isEmpty()) {

            AccBuilderSotf.c = "Selecting reward";
            Widget rewardWidget = Widgets.get(REWARD_WIDGET_ID, REWARD_WIDGET_CHILD);

            if (rewardType.contains("xp") && rewardWidget != null) {
                Time.sleepTicks(SLEEP_2_TICKS);
                rewardWidget.getChild(7).interact("Details");
                Time.sleepTicks(SLEEP_1_TICK);
            }

            if (rewardType.contains("bs") && rewardWidget != null) {
                Time.sleepTicks(SLEEP_2_TICKS);
                rewardWidget.getChild(1).interact("Details");
                Time.sleepTicks(GameStateUtil.randomRange(3, 4));
            }

            if (rewardType.contains("ess") && rewardWidget != null) {
                Time.sleepTicks(SLEEP_2_TICKS);
                rewardWidget.getChild(0).interact("Details");
                Time.sleepTicks(GameStateUtil.randomRange(3, 4));
            }

            if (rewardType.contains("bars") && rewardWidget != null) {
                Time.sleepTicks(SLEEP_2_TICKS);
                rewardWidget.getChild(2).interact("Details");
                Time.sleepTicks(GameStateUtil.randomRange(3, 4));
            }

            if (rewardType.contains("herbs") && rewardWidget != null) {
                Time.sleepTicks(SLEEP_2_TICKS);
                rewardWidget.getChild(3).interact("Details");
                Time.sleepTicks(GameStateUtil.randomRange(3, 4));
            }

            if (rewardType.contains("ores") && rewardWidget != null) {
                Time.sleepTicks(SLEEP_2_TICKS);
                rewardWidget.getChild(4).interact("Details");
                Time.sleepTicks(GameStateUtil.randomRange(3, 4));
            }

            AccBuilderSotf.c = "Claiming";

            Widget claimWidget = Widgets.get(REWARD_WIDGET_ID, 3);
            if (claimWidget != null) {
                claimWidget.interact("Claim");
            }

            Time.sleepTicks(SLEEP_1_TICK);
        }
    }

    /**
     * Checks if player has all required items for the trek.
     */
    private static boolean hasRequiredItems() {
        if (!Inventory.contains("Dragon sword") &&
            Equipment.contains("Dragon sword")) {
            return false;
        }

        if (!Inventory.contains(ITEM_WEAPON_3) &&
            !Equipment.contains(ITEM_WEAPON_3) &&
            !Inventory.contains(ITEM_WEAPON_2) &&
            !Equipment.contains(ITEM_WEAPON_2) &&
            !Inventory.contains(ITEM_BRONZE_AXE) &&
            Equipment.contains(ITEM_BRONZE_AXE)) {
            return false;
        }

        if (!Inventory.contains(ITEM_FOOD_2) &&
            Equipment.contains("Bronze axe")) {
            return false;
        }

        if (Inventory.contains(ITEM_STAMINA_POTION)) {
            if (Inventory.contains(ITEM_REWARD_TOKEN)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Equips items if in inventory.
     */
    private static void equipItems() {
        equipItemIfPresent(new int[]{ITEM_DRAGON_SWORD}, new String[]{"Wear", "Wield", "Equip"});
        equipItemIfPresent(new int[]{ITEM_WEAPON_3}, new String[]{"Wear", "Wield", "Equip"});
        equipItemIfPresent(ItemIdArrays.RING_OF_WEALTH, new String[]{"Wear", "Wield", "Equip"});
        equipItemIfPresent(ItemIdArrays.aW, new String[]{"Wear", "Wield", "Equip"});
    }

    /**
     * Equips an item if present in inventory.
     */
    private static void equipItemIfPresent(int[] itemIds, String[] actions) {
        if (Inventory.contains(itemIds) && !Equipment.contains(itemIds)) {
            Item item = Inventory.getFirst(itemIds);
            for (String action : actions) {
                if (item.hasAction(action)) {
                    item.interact(action);
                }
            }
        }
    }

    /**
     * Adds items to the buying list.
     */
    public static void addItemsToBuy(List<ShopItem> items) {
        for (d item : items) {
            itemsToBuy.add(item);
        }
    }
}
