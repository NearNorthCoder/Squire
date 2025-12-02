package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.sotf.framework.*;

/**
 * Quest step handler for Priest In Peril quest.
 *
 * This quest is a prerequisite for accessing Morytania region and is required
 * before Nature Spirit quest. The quest involves helping Drezel defeat an evil
 * presence in the temple.
 *
 * Quest stages:
 * - Stage 0: Talk to King Roald to start
 * - Stage 1: Enter the temple
 * - Stage 2: Kill Temple Guardian
 * - Stage 3: Report back and get keys
 * - Stage 4: Free Drezel
 * - Stage 5: Purify the temple with blessed water
 * - Stage 6: Complete essence delivery
 */
public class PriestInPerilQuestStep implements QuestStep {
    // Item IDs
    private static final int ITEM_MITHRIL_AXE = 8007;
    private static final int ITEM_BRONZE_AXE = 1925;
    private static final int ITEM_STAMINA_POTION = 7936;
    private static final int ITEM_RUNE_SCIMITAR = 12625;
    private static final int ITEM_FOOD = 379;
    private static final int ITEM_GOLDEN_KEY = 1331;
    private static final int ITEM_TEMPLE_GUARDIAN_STATUE = 3486;
    private static final int ITEM_WELL_KEY = 3485;
    private static final int ITEM_RING_OF_WEALTH = 11980;
    private static final int ITEM_PURE_ESSENCE = 25000;

    // Object IDs
    private static final int OBJECT_WELL_KEY_STATUE_1 = 3496;
    private static final int OBJECT_WELL_KEY_STATUE_2 = 3498;
    private static final int OBJECT_WELL_KEY_STATUE_3 = 3495;
    private static final int OBJECT_WELL_KEY_STATUE_4 = 3497;
    private static final int OBJECT_WELL_KEY_STATUE_5 = 3494;
    private static final int OBJECT_WELL_KEY_STATUE_6 = 3499;
    private static final int OBJECT_WELL_KEY_STATUE_7 = 3493;

    // Quest varbits
    public static int QUEST_PROGRESS_VARBIT = 302;
    public static int SECONDARY_PROGRESS_VARBIT = 307;

    // Key locations
    public static final WorldPoint KING_ROALD_LOCATION = new WorldPoint(3222, 3473, 0);
    public static final WorldPoint TEMPLE_DOOR_LOCATION = new WorldPoint(3407, 3489, 0);
    public static final WorldPoint TRAPDOOR_LOCATION = new WorldPoint(3405, 9902, 0);
    public static final WorldPoint MONUMENT_LOCATION = new WorldPoint(8013, 6422, 0);
    public static final WorldPoint JAIL_LOCATION = new WorldPoint(3415, 3489, 2);
    public static final WorldPoint GOLD_KEY_SPAWN_LOCATION = new WorldPoint(3412, 3488, 0);
    public static final WorldPoint STATUE_ROOM_LOCATION = new WorldPoint(3422, 9887, 0);
    public static final WorldPoint DREZEL_FINAL_LOCATION = new WorldPoint(3440, 9895, 0);

    // Quest state tracking
    public static List<d> itemsToBuy = new ArrayList<>();
    public static boolean hasCheckedBank = false;
    public static boolean talkedToDrezelAboutBlessingWater = false;
    static boolean hasInitializedEssenceCounter = false;
    static ArrayList<Integer> statueKeyIds = new ArrayList<>();

    // Dialog options for the quest
    static String[] questDialogOptions = new String[] {
        "I'm looking for a quest!",
        "Yes.",
        "Ok, let me help then.",
        "Yep, now tell me what the problem is.",
        "Sure.",
        "You're right, we don't.",
        "Is there anything else interesting to do around here?",
        "Well, what is it, I may be able to help?",
        "Yes, I'll go and look for him.",
        "Yes, I'm sure.",
        "I'll get going.",
        "Ok, thanks.",
        "I think I've solved the puzzle!",
        "How can I help?",
        "Roald sent me to check on Drezel.",
        "Why is the river such a good defence?",
        "You're right, we don't.",
        "Yes, of course.",
        "Do you know of anything I can do in Morytania?",
        "Well, what is it, I may be able to help?"
    };

    static {
        statueKeyIds = new ArrayList<>();
    }

    /**
     * Returns the quest name.
     */
    @Override
    public String getName() {
        return "Priest In Peril";
    }

    /**
     * Checks if the quest step is complete.
     */
    @Override
    public boolean isComplete() {
        return GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) >= 60 && GameStateUtil.getVarbit(SECONDARY_PROGRESS_VARBIT) >= 5;
    }

    /**
     * Returns whether this is a combat quest step.
     */
    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    /**
     * Executes the main quest logic.
     */
    @Override
    public int execute() {
        try {
            executeQuestLogic();
        } catch (Exception exception) {
            // Suppress exceptions
        }
        return 100;
    }

    /**
     * Main quest execution logic.
     */
    public static void executeQuestLogic() {
        // First check if we need to buy items
        if (hasCheckedBank) {
            b.a(itemsToBuy);
            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                hasCheckedBank = false;
            }
        }

        if (!hasCheckedBank) {
            // Handle quest varbit 107 - tutorial island check
            if (GameStateUtil.getVarbit(107) < 5) {
                Y.eq();
            }

            // Stage 0: Get quest supplies from bank
            if (!hasRequiredGearBanked() && GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) < 1 && GameStateUtil.getVarbit(107) == 5) {
                BankLocation bank = BankLocation.getNearest();
                if (bank != null && !bank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Nav to bank";
                    BankingUtil.navigateToBank(bank);
                }
                if (bank != null && bank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        BankingUtil.openNearestBank();
                        Time.sleepUntil(() -> Bank.isOpen(), 5000);
                    }
                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = "Handling banking";
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(4);
                        }
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check if we have required items
                        int[] requiredItems = new int[] {ITEM_MITHRIL_AXE, ITEM_BRONZE_AXE, ITEM_STAMINA_POTION, ITEM_RUNE_SCIMITAR, ITEM_FOOD};
                        if (!GameStateUtil.randomRange(requiredItems)) {
                            checkAndAddMissingItems();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            hasCheckedBank = true;
                            return;
                        }
                        if (GameStateUtil.randomRange(requiredItems)) {
                            BankingUtil.withdrawItem(ITEM_MITHRIL_AXE, 10);
                            BankingUtil.withdrawItem(ITEM_GOLDEN_KEY, 1);
                            BankingUtil.withdrawItem(ITEM_BRONZE_AXE, 1);
                            BankingUtil.withdrawItem(ITEM_RUNE_SCIMITAR, 4);
                            BankingUtil.withdrawItem(ITEM_FOOD, 10);
                        }
                    }
                }
            }

            // Drink stamina potion if run energy is low
            if (Inventory.contains(ItemIdArrays.STAMINA_POTIONS) && Movement.getRunEnergy() < 50) {
                Inventory.getFirst(ItemIdArrays.STAMINA_POTIONS).interact("Drink");
                Time.sleepTicks(1);
            }

            // Eat food if health is low
            if (Inventory.contains(ITEM_FOOD) && GameStateUtil.getHealthPercentage() < 60.0) {
                Inventory.getFirst(ITEM_FOOD).interact("Eat");
                Time.sleepTicks(1);
            }

            // Stage 0-1: Talk to King Roald to start quest
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) < 1 && hasRequiredGearBanked()) {
                if (Players.getLocal().getWorldLocation().distanceTo(KING_ROALD_LOCATION) > 3) {
                    AccBuilderSotf.c = "Nav to start";
                    if (Dialog.isOpen()) {
                        Dialog.close();
                    }
                    Movement.walkTo(KING_ROALD_LOCATION);
                    Time.sleepTicks(1);
                }
                if (Players.getLocal().getWorldLocation().distanceTo(KING_ROALD_LOCATION) <= 3) {
                    AccBuilderSotf.c = "Starting quest";
                    DialogUtil.talkToNpc("King Roald", questDialogOptions);
                }
            }

            // Stage 1: Navigate to temple door
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) == 1) {
                if (Players.getLocal().getWorldLocation().distanceTo(TEMPLE_DOOR_LOCATION) > 2) {
                    AccBuilderSotf.c = "Nav to temple door";
                    Movement.walkTo(TEMPLE_DOOR_LOCATION);
                    Time.sleepTicks(1);
                }
                if (Players.getLocal().getWorldLocation().distanceTo(TEMPLE_DOOR_LOCATION) <= 2) {
                    AccBuilderSotf.c = "Interesting door";
                    if (!Dialog.isOpen()) {
                        TileObjects.getNearest("Large door").interact("Open");
                    }
                    DialogUtil.chooseDialogOptions(questDialogOptions);
                }
            }

            // Stage 2: Enter temple and navigate to Temple Guardian
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) == 2) {
                if (NPCs.getNearest("Temple Guardian") == null) {
                    AccBuilderSotf.c = "Nav to doggo";
                    TileObject trapdoor = TileObjects.getNearest("Trapdoor");
                    if (trapdoor != null && Players.getLocal().getWorldLocation().distanceTo(trapdoor) <= 4 && Dialog.isOpen()) {
                        DialogUtil.chooseDialogOptions(questDialogOptions);
                    }
                    if (!Dialog.isOpen() || Players.getLocal().distanceTo(new WorldPoint(3405, 3506, 0)) > 5) {
                        Movement.walkTo(new WorldPoint(3405, 3506, 0));
                        Time.sleepTicks(3);
                    }
                }
                if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3405, 3506, 0)) <= 5) {
                    if (NPCs.getNearest("Temple Guardian") == null) {
                        TileObject trapdoor = TileObjects.getNearest("Trapdoor");
                        if (trapdoor != null && !Dialog.isOpen()) {
                            if (trapdoor.hasAction("Open")) {
                                trapdoor.interact("Open");
                                Time.sleepTicks(2);
                            }
                            if (trapdoor.hasAction("Climb-down")) {
                                trapdoor.interact("Climb-down");
                                Time.sleepTicks(2);
                            }
                        }
                        DialogUtil.chooseDialogOptions(questDialogOptions);
                    }
                }
                if (NPCs.getNearest("Temple Guardian") != null) {
                    // Equip weapon if not equipped
                    if (Inventory.contains(ITEM_GOLDEN_KEY)) {
                        if (!Equipment.contains(ITEM_GOLDEN_KEY)) {
                            Inventory.getFirst(ITEM_GOLDEN_KEY).interact("Wield");
                        }
                    }
                    if (Players.getLocal().getInteracting() == null) {
                        NPCs.getNearest("Temple Guardian").interact("Attack");
                        Time.sleepTicks(2);
                    }
                }
            }

            // Stage 3: Break monument or talk to King
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) == 3) {
                if (!talkedToDrezelAboutBlessingWater) {
                    if (Players.getLocal().getWorldLocation().distanceTo(TEMPLE_DOOR_LOCATION) > 2) {
                        if (TileObjects.getNearest("Monument") != null) {
                            if (Inventory.contains(ITEM_MITHRIL_AXE)) {
                                Inventory.getFirst(ITEM_MITHRIL_AXE).interact("Break");
                                Time.sleepTicks(5);
                            }
                        }
                        AccBuilderSotf.c = "Nav to temple door";
                        Movement.walkTo(TEMPLE_DOOR_LOCATION);
                        Time.sleepTicks(1);
                    }
                    if (Players.getLocal().getWorldLocation().distanceTo(TEMPLE_DOOR_LOCATION) <= 2) {
                        AccBuilderSotf.c = "Interacting door";
                        if (!Dialog.isOpen()) {
                            TileObjects.getNearest("Large door").interact("Open");
                        }
                        DialogUtil.chooseDialogOptions(questDialogOptions);
                        if (Dialog.isOpen() && Dialog.getText().contains("tell the king")) {
                            talkedToDrezelAboutBlessingWater = true;
                        }
                    }
                }
                if (talkedToDrezelAboutBlessingWater) {
                    if (Players.getLocal().getWorldLocation().distanceTo(KING_ROALD_LOCATION) > 3) {
                        AccBuilderSotf.c = "Nav to king";
                        Movement.walkTo(KING_ROALD_LOCATION);
                        Time.sleepTicks(1);
                    }
                    if (Players.getLocal().getWorldLocation().distanceTo(KING_ROALD_LOCATION) <= 3) {
                        AccBuilderSotf.c = "talk king";
                        DialogUtil.talkToNpc("King Roald", questDialogOptions);
                    }
                }
            }

            // Stage 4: Free Drezel with keys
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) == 4) {
                hasInitializedEssenceCounter = false;
                if (!hasKeysInInventory()) {
                    bankForKeys();
                }
                if (hasKeysInInventory()) {
                    if (Players.getLocal().getWorldLocation().distanceTo(JAIL_LOCATION) > 3) {
                        AccBuilderSotf.c = "Nav to jail";
                        if (Dialog.isOpen()) {
                            Dialog.close();
                        }
                        Movement.walkTo(JAIL_LOCATION);
                        Time.sleepTicks(1);
                    }
                    if (Players.getLocal().getWorldLocation().distanceTo(JAIL_LOCATION) <= 3) {
                        AccBuilderSotf.c = "Interesting door";
                        if (!Dialog.isOpen()) {
                            TileObjects.getNearest("Cell door").interact("Open");
                        }
                        DialogUtil.chooseDialogOptions(questDialogOptions);
                    }
                }
            }

            // Stage 5: Get golden key from temple guardians
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) == 5) {
                if (!Inventory.contains("Golden key") && !Inventory.contains("Iron key")) {
                    if (Players.getLocal().getWorldLocation().distanceTo(GOLD_KEY_SPAWN_LOCATION) > 7 || Players.getLocal().getWorldLocation().getPlane() != 0) {
                        AccBuilderSotf.c = "Nav to gold key tile";
                        Movement.walkTo(GOLD_KEY_SPAWN_LOCATION);
                        Time.sleepTicks(1);
                    }
                    if (Players.getLocal().getWorldLocation().distanceTo(GOLD_KEY_SPAWN_LOCATION) <= 7 && Players.getLocal().getWorldLocation().getPlane() == 0) {
                        if (Players.getLocal().getInteracting() == null) {
                            NPCs.getNearest(ITEM_TEMPLE_GUARDIAN_STATUE).interact("Attack");
                            Time.sleepTicks(2);
                        }
                        TileObject goldKeyDrop = TileItems.getNearest("Golden key");
                        if (Inventory.isFull()) {
                            Inventory.getFirst(ITEM_FOOD).interact("Eat");
                            Time.sleepTicks(1);
                        }
                        if (goldKeyDrop != null) {
                            goldKeyDrop.interact("Take");
                            Time.sleepTicks(2);
                        }
                    }
                }
                if (Inventory.contains("Golden key")) {
                    if (Players.getLocal().getWorldLocation().distanceTo(STATUE_ROOM_LOCATION) > 10) {
                        AccBuilderSotf.c = "Nav to statues";
                        Movement.walkTo(STATUE_ROOM_LOCATION);
                        Time.sleepTicks(1);
                    }
                    if (Players.getLocal().getWorldLocation().distanceTo(STATUE_ROOM_LOCATION) <= 10) {
                        AccBuilderSotf.c = "Finding key";
                        unlockStatuesForIronKey();
                    }
                }
                if (Inventory.contains("Iron key")) {
                    if (!Inventory.contains("Murky water")) {
                        AccBuilderSotf.c = "Getting water";
                        Inventory.getFirst("Bucket").useOn(TileObjects.getNearest(ITEM_WELL_KEY));
                        Time.sleepTicks(4);
                    }
                }
                if (Inventory.contains("Iron key")) {
                    if (Inventory.contains("Murky water")) {
                        if (Players.getLocal().getWorldLocation().distanceTo(JAIL_LOCATION) > 3) {
                            AccBuilderSotf.c = "Nav to jail";
                            if (Dialog.isOpen()) {
                                Dialog.close();
                            }
                            Movement.walkTo(JAIL_LOCATION);
                            Time.sleepTicks(1);
                        }
                        if (Players.getLocal().getWorldLocation().distanceTo(JAIL_LOCATION) <= 3) {
                            AccBuilderSotf.c = "Interesting door";
                            Inventory.getFirst("Iron key").useOn(TileObjects.getNearest("Cell door"));
                            Time.sleepTicks(3);
                        }
                    }
                }
            }

            // Stage 6: Bless water with Drezel
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) == 6) {
                TileObject drezel = NPCs.getNearest("Drezel");
                if (!Inventory.contains("Blessed water") && drezel != null) {
                    if (Reachable.isInteractable(drezel)) {
                        AccBuilderSotf.c = "Handling chat";
                        DialogUtil.talkToNpc("Drezel", questDialogOptions);
                    }
                    if (!Reachable.isInteractable(drezel)) {
                        AccBuilderSotf.c = "Entering cell";
                        TileObjects.getNearest("Cell door").interact("Open");
                        Time.sleepTicks(2);
                    }
                }
                if (Inventory.contains("Blessed water")) {
                    TileObject coffin = TileObjects.getNearest("Coffin");
                    if (coffin != null) {
                        if (Reachable.isInteractable(coffin)) {
                            AccBuilderSotf.c = "Using water on coffin";
                            Inventory.getFirst("Blessed water").useOn(coffin);
                            Time.sleepTicks(2);
                        }
                        if (!Reachable.isInteractable(coffin)) {
                            AccBuilderSotf.c = "Exiting cell";
                            TileObjects.getNearest("Cell door").interact("Open");
                            Time.sleepTicks(2);
                        }
                    }
                }
            }

            // Stage 7: Complete final dialogue with Drezel
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) == 7) {
                TileObject drezel = NPCs.getNearest("Drezel");
                if (drezel != null) {
                    if (Reachable.isInteractable(drezel)) {
                        AccBuilderSotf.c = "Handling chat";
                        DialogUtil.talkToNpc("Drezel", questDialogOptions);
                    }
                    if (!Reachable.isInteractable(drezel)) {
                        AccBuilderSotf.c = "Entering cell";
                        TileObjects.getNearest("Cell door").interact("Open");
                        Time.sleepTicks(2);
                    }
                }
            }

            // Stage 8: Navigate to final location
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) == 8) {
                if (Players.getLocal().getWorldLocation().distanceTo(DREZEL_FINAL_LOCATION) > 5) {
                    AccBuilderSotf.c = "Nav to final tile";
                    WorldArea templeArea = new WorldArea(3399, 9879, 48, 32, 0);
                    if (!templeArea.contains(Players.getLocal().getWorldLocation())) {
                        WorldArea outsideArea = new WorldArea(3388, 3462, 37, 52, 0);
                        if (!outsideArea.contains(Players.getLocal().getWorldLocation())) {
                            Movement.walkTo(new WorldPoint(3405, 3504, 0));
                            Time.sleepTicks(1);
                        }
                        if (outsideArea.contains(Players.getLocal().getWorldLocation())) {
                            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3405, 3504, 0)) > 5) {
                                Movement.walkTo(new WorldPoint(3405, 3504, 0));
                                Time.sleepTicks(1);
                            }
                            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3405, 3504, 0)) <= 5) {
                                TileObject trapdoor = TileObjects.getNearest("Trapdoor");
                                if (trapdoor != null) {
                                    if (trapdoor.hasAction("Open")) {
                                        trapdoor.interact("Open");
                                        Time.sleepTicks(3);
                                    }
                                    if (trapdoor.hasAction("Climb-down")) {
                                        trapdoor.interact("Climb-down");
                                        Time.sleepTicks(3);
                                    }
                                }
                            }
                        }
                    }
                    if (templeArea.contains(Players.getLocal().getWorldLocation())) {
                        Movement.walkTo(DREZEL_FINAL_LOCATION);
                        Time.sleepTicks(1);
                    }
                }
                if (Players.getLocal().getWorldLocation().distanceTo(DREZEL_FINAL_LOCATION) <= 5) {
                    AccBuilderSotf.c = "Handling chat";
                    DialogUtil.talkToNpc("Drezel", questDialogOptions);
                }
            }

            // Stages 10-60: Deliver essence to Drezel
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) >= 10 && GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) < 60) {
                if (Players.getLocal().getWorldLocation().distanceTo(DREZEL_FINAL_LOCATION) <= 5) {
                    if (Inventory.contains("Pure essence")) {
                        AccBuilderSotf.c = "Turning in ess";
                        if (!hasInitializedEssenceCounter) {
                            aN.qG += 1;
                            aN.u(AccBuilderSotf.m);
                            hasInitializedEssenceCounter = true;
                            aN.qG = 0;
                            hasInitializedEssenceCounter = false;
                        }
                        DialogUtil.talkToNpc("Drezel", questDialogOptions);
                    }
                }
                if (!Inventory.contains("Pure essence") && GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) < 60) {
                    AccBuilderSotf.c = "Grabbing more ess";
                    bankForEssence();
                }
                if (Inventory.contains("Pure essence") && Players.getLocal().getWorldLocation().distanceTo(DREZEL_FINAL_LOCATION) > 5) {
                    AccBuilderSotf.c = "Nav to final tile";
                    WorldArea templeArea = new WorldArea(3399, 9879, 48, 32, 0);
                    if (!templeArea.contains(Players.getLocal().getWorldLocation())) {
                        WorldArea outsideArea = new WorldArea(3388, 3462, 37, 52, 0);
                        if (!outsideArea.contains(Players.getLocal().getWorldLocation())) {
                            Movement.walkTo(new WorldPoint(3405, 3504, 0));
                            Time.sleepTicks(1);
                        }
                        if (outsideArea.contains(Players.getLocal().getWorldLocation())) {
                            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3405, 3504, 0)) > 5) {
                                Movement.walkTo(new WorldPoint(3405, 3504, 0));
                                Time.sleepTicks(1);
                            }
                            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3405, 3504, 0)) <= 5) {
                                TileObject trapdoor = TileObjects.getNearest("Trapdoor");
                                if (trapdoor != null) {
                                    if (trapdoor.hasAction("Open")) {
                                        trapdoor.interact("Open");
                                        Time.sleepTicks(3);
                                    }
                                    if (trapdoor.hasAction("Climb-down")) {
                                        trapdoor.interact("Climb-down");
                                        Time.sleepTicks(3);
                                    }
                                }
                            }
                        }
                    }
                    if (templeArea.contains(Players.getLocal().getWorldLocation())) {
                        Movement.walkTo(DREZEL_FINAL_LOCATION);
                        Time.sleepTicks(1);
                    }
                }
            }

            // Final stage: Complete quest
            if (GameStateUtil.getVarbit(QUEST_PROGRESS_VARBIT) >= 60 && GameStateUtil.getVarbit(SECONDARY_PROGRESS_VARBIT) < 5) {
                AccBuilderSotf.c = "Finish & Unlock morty/start nature";
                if (Players.getLocal().getWorldLocation().distanceTo(DREZEL_FINAL_LOCATION) > 5) {
                    navigateToFinalLocation();
                }
                if (Players.getLocal().getWorldLocation().distanceTo(DREZEL_FINAL_LOCATION) <= 5) {
                    if (Widgets.get(153, 16) != null) {
                        Mouse.click(Widgets.get(153, 16).getClickPoint().getX(), Widgets.get(153, 16).getClickPoint().getY(), true);
                        Time.sleepTicks(3);
                    }
                    DialogUtil.talkToNpc("Drezel", questDialogOptions);
                    DialogUtil.chooseDialogOptions(questDialogOptions);
                }
            }

            // Continue dialog
            DialogUtil.chooseDialogOptions(questDialogOptions);
        }
    }

    /**
     * Unlocks statues to obtain the iron key using the golden key.
     */
    private static void unlockStatuesForIronKey() {
        statueKeyIds.add(OBJECT_WELL_KEY_STATUE_1);
        statueKeyIds.add(OBJECT_WELL_KEY_STATUE_2);
        statueKeyIds.add(OBJECT_WELL_KEY_STATUE_3);
        statueKeyIds.add(OBJECT_WELL_KEY_STATUE_4);
        statueKeyIds.add(OBJECT_WELL_KEY_STATUE_5);
        statueKeyIds.add(OBJECT_WELL_KEY_STATUE_6);
        statueKeyIds.add(OBJECT_WELL_KEY_STATUE_7);

        while (statueKeyIds.isEmpty() && statueKeyIds.isEmpty()) {
            if (Inventory.contains("Iron key")) {
                break;
            }
            TileObject statue = TileObjects.getNearest(statueKeyIds.get(0));
            if (statue != null) {
                if (Inventory.contains("Golden key")) {
                    Inventory.getFirst("Golden key").useOn(statue);
                    Time.sleepTicks(5);
                }
            }
            if (!Inventory.contains("Iron key")) {
                statueKeyIds.remove(0);
                Time.sleepTicks(2);
            }
        }
    }

    /**
     * Checks if the player has required gear in the bank.
     */
    public static boolean hasRequiredGearBanked() {
        return Inventory.getCount("Bucket") > 0
            && Inventory.getCount(ITEM_FOOD) > 0
            && Inventory.getCount(ITEM_RUNE_SCIMITAR) > 0
            && Inventory.contains(ITEM_MITHRIL_AXE);
    }

    /**
     * Checks if player has the required keys in inventory for freeing Drezel.
     */
    private static boolean hasKeysInInventory() {
        return Inventory.getCount("Bucket") > 0
            && Inventory.getCount(ITEM_FOOD) > 0
            && Inventory.contains(ITEM_MITHRIL_AXE)
            && Inventory.contains(ITEM_STAMINA_POTION);
    }

    /**
     * Navigates to final location by going through trapdoor.
     */
    private static void navigateToFinalLocation() {
        AccBuilderSotf.c = "Nav to final tile";
        WorldArea templeArea = new WorldArea(3399, 9879, 48, 32, 0);
        if (!templeArea.contains(Players.getLocal().getWorldLocation())) {
            WorldArea outsideArea = new WorldArea(3388, 3462, 37, 52, 0);
            if (!outsideArea.contains(Players.getLocal().getWorldLocation())) {
                Movement.walkTo(new WorldPoint(3405, 3504, 0));
                Time.sleepTicks(1);
            }
            if (outsideArea.contains(Players.getLocal().getWorldLocation())) {
                if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3405, 3504, 0)) > 5) {
                    Movement.walkTo(new WorldPoint(3405, 3504, 0));
                    Time.sleepTicks(1);
                }
                if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3405, 3504, 0)) <= 5) {
                    TileObject trapdoor = TileObjects.getNearest("Trapdoor");
                    if (trapdoor != null) {
                        if (trapdoor.hasAction("Open")) {
                            trapdoor.interact("Open");
                            Time.sleepTicks(3);
                        }
                        if (trapdoor.hasAction("Climb-down")) {
                            trapdoor.interact("Climb-down");
                            Time.sleepTicks(3);
                        }
                    }
                }
            }
        }
        if (templeArea.contains(Players.getLocal().getWorldLocation())) {
            Movement.walkTo(DREZEL_FINAL_LOCATION);
            Time.sleepTicks(1);
        }
    }

    /**
     * Banks to get keys for freeing Drezel.
     */
    private static void bankForKeys() {
        BankLocation bank = BankLocation.getNearest();
        if (bank != null && !bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to bank";
            BankingUtil.navigateToBank(bank);
        }
        if (bank != null && bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            if (!Bank.isOpen()) {
                BankingUtil.openNearestBank();
                Time.sleepUntil(() -> Bank.isOpen(), 5000);
            }
            if (Bank.isOpen()) {
                AccBuilderSotf.c = "Handling banking";
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                }
                BankingUtil.withdrawItem(ITEM_MITHRIL_AXE, 10);
                BankingUtil.withdrawItem(ITEM_RUNE_SCIMITAR, 4);
                BankingUtil.withdrawItem(ITEM_STAMINA_POTION, 30);
            }
        }
    }

    /**
     * Banks to get essence for final quest stage.
     */
    private static void bankForEssence() {
        BankLocation bank = BankLocation.getNearest();
        if (bank != null && !bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to bank";
            BankingUtil.navigateToBank(bank);
        }
        if (bank != null && bank.getArea().contains(Players.getLocal().getWorldLocation())) {
            if (!Bank.isOpen()) {
                BankingUtil.openNearestBank();
                Time.sleepUntil(() -> Bank.isOpen(), 5000);
            }
            if (Bank.isOpen()) {
                AccBuilderSotf.c = "Handling banking";
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                }
                BankingUtil.withdrawItem(ITEM_MITHRIL_AXE, 10);
                BankingUtil.withdrawItem(ITEM_RUNE_SCIMITAR, 1);
                BankingUtil.withdrawItem(ITEM_STAMINA_POTION, 30);
            }
        }
    }

    /**
     * Checks bank for missing items and adds them to the shopping list.
     */
    private static void checkAndAddMissingItems() {
        if (!Bank.contains(ITEM_GOLDEN_KEY)) {
            itemsToBuy.add(new ShopItem(ITEM_GOLDEN_KEY, 1, 9000));
        }
        if (!Bank.contains(ITEM_BRONZE_AXE)) {
            itemsToBuy.add(new ShopItem(ITEM_BRONZE_AXE, 1, 9000));
        }
        if (!Bank.contains(ITEM_RUNE_SCIMITAR)) {
            itemsToBuy.add(new ShopItem(ITEM_RUNE_SCIMITAR, 5, Constants.DEFAULT_GE_TIMEOUT));
        }
        if (!Bank.contains(ITEM_FOOD)) {
            itemsToBuy.add(new ShopItem(ITEM_FOOD, 30, 300));
        }
        if (Bank.contains(ITEM_STAMINA_POTION) && Bank.getFirst(ITEM_STAMINA_POTION).getQuantity() < 50) {
            itemsToBuy.add(new ShopItem(ITEM_STAMINA_POTION, 50, 107));
        }
        if (!Bank.contains((Predicate<net.runelite.api.Item>)(item -> item.getName().toLowerCase().contains("ring of wealth (")))) {
            itemsToBuy.add(new ShopItem(ITEM_RING_OF_WEALTH, 5, 25000));
        }
        if (!Bank.contains(ITEM_MITHRIL_AXE)) {
            itemsToBuy.add(new ShopItem(ITEM_MITHRIL_AXE, 40, 900));
        }
    }
}
