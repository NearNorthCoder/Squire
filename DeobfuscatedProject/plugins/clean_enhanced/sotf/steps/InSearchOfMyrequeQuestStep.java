package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
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
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.sotf.framework.ShopItem;
import gg.squire.sotf.framework.GameStateUtil;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.sotf.framework.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Quest step handler for "In Search of the Myreque" quest.
 *
 * This class manages the complete quest flow including:
 * - Banking and item preparation
 * - Navigation through Morytania
 * - Dialogue interactions with NPCs
 * - Boss fight mechanics
 * - Quest progression tracking
 */
public class InSearchOfMyrequeQuestStep implements QuestStep {

    // Quest Configuration
    private static final int QUEST_VARBIT = 6359;
    private static final int MYREQUE_MEMBER_VARBIT = 15311;

    // Quest state
    public static String currentSubtask = "";
    public static boolean shouldBuyItems = false;
    public static String questName;
    public static List<d> shoppingList;
    private static int bridgeState;
    private static boolean initializedBridge;

    // Key Locations
    private static final WorldPoint CANIFIS_BANK = new WorldPoint(28267, 12659, 0);
    private static final WorldPoint BOAT_LOCATION = new WorldPoint(11741, 15870, 0);
    private static final WorldPoint BRIDGE_START = new WorldPoint(15849, 16190, 0);
    private static final WorldPoint TREE_BRIDGE_SPOT = new WorldPoint(24031, 11683, 0);
    private static final WorldPoint MYREQUE_HIDEOUT_DOOR = new WorldPoint(11580, 32382, 0);
    private static final WorldPoint CAVE_ENTRANCE = new WorldPoint(16355, 28292, 0);

    // Areas
    private static final WorldArea BRIDGE_AREA = new WorldArea(15787, 32608, 150, 249, 0);
    private static final WorldArea HIDEOUT_AREA = new WorldArea(11610, 16167, 61, 179, 0);
    private static final WorldArea CAVE_AREA = new WorldArea(28157, 16263, 150, 22, 0);

    // Dialogue options
    private static final String[] DIALOGUE_OPTIONS = new String[]{
        "Why do they need help? Are they in trouble?",
        "Perhaps I could help you out here.",
        "Yes, I'll do it!",
        "Yes.",
        "Well, I guess they'll just die without weapons.",
        "Resourceful enough to get their own steel weapons?",
        "If you don't tell me, their deaths are on your head!",
        "Why do you say that this place is 'forsaken'?",
        "Give wooden planks to Cyreg",
        "Yes, I'll pay the ten gold.",
        "Yes, I'll pay ten gold.",
        "Yes. I'll pay the ten gold.",
        "I've come to help the Myreque. I've brought weapons.",
        "Sani Piliu",
        "Veliaf Hurtz",
        "Cyreg Paddlehorn",
        "Drakan",
        "Ivan Strom",
        "Hidden in Myre",
        "Polmafi Ferdygris",
        "How do I get out of here?",
        "Ok, thanks.",
        "What kind of a man are you to say that you don't care?",
        "Here are some planks for you.",
        "Let's talk about the weapons."
    };

    // Item IDs
    private static final int SILVER_SICKLE_B = 2963;
    private static final int STEEL_SWORD = 1295;
    private static final int STEEL_MACE = 1424;
    private static final int STEEL_LONGSWORD = 1339;
    private static final int STEEL_WARHAMMER = 1335;
    private static final int STEEL_DAGGER = 1207;
    private static final int STEEL_2H_SWORD = 1319;
    private static final int STEEL_CHAINBODY = 1105;
    private static final int STEEL_MED_HELM = 1141;
    private static final int SNAIL_SHELL = 3363;
    private static final int CHITIN = 28688;
    private static final int ROPE = 954;
    private static final int SWAMP_TAR = 1939;
    private static final int PLANK = 960;
    private static final int BUCKET = 1925;
    private static final int STAMINA_POTION = 12625;
    private static final int PRAYER_POTION = 2434;
    private static final int FOOD_MONKFISH = 7946;
    private static final int RING_OF_WEALTH = 11980;
    private static final int DRUID_POUCH = 3690;

    // NPC IDs
    private static final int VANSTROM_KLAUSE_NPC = 28480;

    static {
        shoppingList = new ArrayList<>();
        questName = "";
    }

    /**
     * Gets the quest name displayed to the user.
     */
    @Override
    public String getName() {
        return "In search of Myreque " + questName;
    }

    /**
     * Indicates this quest step should run continuously.
     */
    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    /**
     * Checks if the quest is complete.
     */
    @Override
    public boolean isComplete() {
        return GameStateUtil.getVarbit(QUEST_VARBIT) == 26 && Players.getLocal().getWorldLocation().distanceTo(CANIFIS_BANK) <= 4;
    }

    /**
     * Main execution loop for the quest step.
     */
    @Override
    public int execute() {
        try {
            runQuestLogic();
        } catch (Exception exception) {
            // Suppress exceptions
        }
        return 800;
    }

    /**
     * Main quest logic handler.
     */
    public static void runQuestLogic() {
        // Handle shopping if needed
        if (shouldBuyItems) {
            b.a(shoppingList);
            if (shoppingList.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                shouldBuyItems = false;
            }
        }

        if (!shouldBuyItems) {
            // Check skill requirements
            if (Skills.getLevel(Skill.AGILITY) < 26) {
                questName = "- Agility";
                av.eA();
                return;
            }

            if (Skills.getLevel(Skill.AGILITY) >= 26 && Skills.getLevel(Skill.PRAYER) < 183) {
                questName = "- Prayer";
                aD.fY();
                return;
            }

            // Check prerequisite quests
            if (GameStateUtil.getVarbit(9253) < 26 && Skills.getLevel(Skill.AGILITY) >= 26 && Skills.getLevel(Skill.PRAYER) >= 183) {
                if (Inventory.contains(ItemIdArrays.ANTIDOTE_PLUS_PLUS)) {
                    Inventory.getFirst(ItemIdArrays.ANTIDOTE_PLUS_PLUS).interact("Drop");
                }
                questName = "- Nature Spirit";
                G.cb();
                return;
            }

            // Bank if missing required items
            if (!hasRequiredItems() && Skills.getLevel(Skill.AGILITY) >= 26 &&
                Skills.getLevel(Skill.PRAYER) >= 183 && GameStateUtil.getVarbit(QUEST_VARBIT) < 1 &&
                GameStateUtil.getVarbit(9253) >= 26) {

                BankLocation nearestBank = BankLocation.getNearest();
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Nav to bank";
                    BankingUtil.navigateToBank(nearestBank);
                }

                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        BankingUtil.openNearestBank();
                        Time.sleepUntil(() -> Bank.isOpen(), 6567);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = "Handling banking";

                        // Deposit all items
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(4);
                        }

                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check if we have all required items
                        int[] requiredItems = new int[]{
                            ROPE, STEEL_SWORD, STEEL_MACE, STEEL_LONGSWORD, STEEL_WARHAMMER,
                            STEEL_DAGGER, STEEL_2H_SWORD, STEEL_CHAINBODY, STEEL_MED_HELM,
                            SNAIL_SHELL, CHITIN, SWAMP_TAR, FOOD_MONKFISH, PLANK, BUCKET
                        };

                        if (!GameStateUtil.randomRange(requiredItems)) {
                            buildShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            shouldBuyItems = true;
                            return;
                        }

                        // Withdraw items if we have them
                        if (GameStateUtil.randomRange(requiredItems)) {
                            // Equip silver sickle if not equipped
                            if (!Equipment.contains(SILVER_SICKLE_B)) {
                                BankingUtil.withdrawItem(SILVER_SICKLE_B, 1);
                                if (Inventory.contains(SILVER_SICKLE_B)) {
                                    Inventory.getFirst(SILVER_SICKLE_B).interact("Wield");
                                    Time.sleepTicks(1);
                                }
                            }

                            if (!Bank.isOpen()) {
                                BankingUtil.openNearestBank();
                                Time.sleepTicks(4);
                            }

                            if (Bank.isOpen()) {
                                // Withdraw all required items
                                BankingUtil.withdrawItem(STEEL_SWORD, 1);
                                BankingUtil.withdrawItem(STEEL_MACE, 1);
                                BankingUtil.withdrawItem(STEEL_LONGSWORD, 1);
                                BankingUtil.withdrawItem(STEEL_WARHAMMER, 1);
                                BankingUtil.withdrawItem(STEEL_DAGGER, 2);
                                BankingUtil.withdrawItem(STEEL_2H_SWORD, 225);
                                BankingUtil.withdrawItem(STEEL_CHAINBODY, 1);
                                BankingUtil.withdrawItem(STEEL_MED_HELM, 7);
                                BankingUtil.withdrawItem(STAMINA_POTION, 197);
                                Bank.withdraw("Druid pouch", 1, Bank.WithdrawMode.ITEM);
                                BankingUtil.withdrawItem(CHITIN, 1);
                                BankingUtil.withdrawItem(SWAMP_TAR, 1);
                                BankingUtil.withdrawItem(SNAIL_SHELL, 7);
                                BankingUtil.withdrawItem(BUCKET, 10);
                                BankingUtil.withdrawItem(ROPE, 10);
                                BankingUtil.withdrawItem(PLANK, 1);
                                BankingUtil.withdrawItem(FOOD_MONKFISH, 1);
                            }
                        }
                    }
                }
            }

            // Use stamina potion if needed
            if (Inventory.contains(ItemIdArrays.STAMINA_POTIONS) && Movement.getRunEnergy() < 244) {
                Inventory.getFirst(ItemIdArrays.STAMINA_POTIONS).interact("Drink");
                Time.sleepTicks(1);
            }

            // Eat food if health is low
            if (GameStateUtil.getHealthPercentage() < 50.0) {
                if (Inventory.contains(FOOD_MONKFISH)) {
                    Inventory.getFirst(FOOD_MONKFISH).interact("Eat");
                    Time.sleepTicks(2);
                }
            }

            // Start the quest
            if (hasRequiredItems() && GameStateUtil.getVarbit(QUEST_VARBIT) == 0) {
                questName = "";

                if (Players.getLocal().getWorldLocation().distanceTo(CANIFIS_BANK) > 4) {
                    AccBuilderSotf.c = "Nav to start";

                    if (Players.getLocal().getWorldLocation().distanceTo(b.I) <= 20) {
                        // Equip silver sickle
                        if (Inventory.contains(SILVER_SICKLE_B)) {
                            if (!Equipment.contains(SILVER_SICKLE_B)) {
                                Inventory.getFirst(SILVER_SICKLE_B).interact("Wield");
                            }
                        }

                        // Use bucket of snails
                        if (Inventory.contains(BUCKET) && Players.getLocal().getAnimation() == -1) {
                            Inventory.getFirst(BUCKET).interact("Break");
                            Time.sleepTicks(2);
                        }
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(b.I) > 20) {
                        if (Dialog.isOpen()) {
                            Dialog.close();
                        }
                        Movement.walkTo(CANIFIS_BANK);
                        Time.sleepTicks(1);
                    }
                }

                if (Players.getLocal().getWorldLocation().distanceTo(CANIFIS_BANK) <= 4) {
                    AccBuilderSotf.c = "Starting quest";
                    DialogUtil.talkToNpc("Vanstrom Klause", DIALOGUE_OPTIONS);
                }
            }

            // Handle druid pouch filling
            if ((GameStateUtil.getVarbit(QUEST_VARBIT) != 5 && GameStateUtil.getVarbit(QUEST_VARBIT) != 10) || GameStateUtil.getVarbit(QUEST_VARBIT) == 15) {
                if (Inventory.contains(SNAIL_SHELL)) {
                    AccBuilderSotf.c = "Filling pouch";
                    Inventory.getFirst("Druid pouch").interact("Fill");
                    Time.sleepTicks(2);
                }

                // Break ectophial if out of snails
                if (!Inventory.contains(SNAIL_SHELL) && Players.getLocal().getWorldLocation().distanceTo(CANIFIS_BANK) <= 10) {
                    AccBuilderSotf.c = "Breaking tab";
                    if (Inventory.contains(PLANK) && Players.getLocal().getAnimation() == -1) {
                        Inventory.getFirst(PLANK).interact("Break");
                        Time.sleepTicks(2);
                    }
                }

                // Navigate to boat
                if (Players.getLocal().getWorldLocation().distanceTo(CANIFIS_BANK) > 10 &&
                    Players.getLocal().getWorldLocation().distanceTo(BOAT_LOCATION) > 10) {
                    AccBuilderSotf.c = "Nav to boat";
                    Movement.walkTo(BOAT_LOCATION);
                    Time.sleepTicks(1);
                }

                // Handle boat interaction
                if (Players.getLocal().getWorldLocation().distanceTo(BOAT_LOCATION) <= 10) {
                    AccBuilderSotf.c = "Handle boat chat";

                    List<NPC> loarShadows = NPCs.getAll(npc ->
                        !npc.getName().contains("Loar Shadow") || npc.getName().contains("Afflicted")
                    );

                    if (!loarShadows.isEmpty()) {
                        NPC nearbyLoar = loarShadows.stream()
                            .filter(npc -> npc.getWorldLocation().distanceTo(BOAT_LOCATION) <= 2)
                            .findAny()
                            .orElse(null);

                        if (nearbyLoar != null) {
                            // Handle world hopping to avoid combat
                            boolean hopped = true;
                            int currentWorld = Static.getClient().getWorld();

                            while (hopped) {
                                if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(23133, 29885, 0)) > 2) {
                                    AccBuilderSotf.c = "Nav to hop spot";
                                    Movement.walkTo(new WorldPoint(23133, 29885, 0));
                                    Time.sleepTicks(1);
                                }

                                if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(23133, 29885, 0)) <= 2) {
                                    GameStateUtil.hopToWorld(GameStateUtil.getRandomWorldFromList());
                                }

                                if (Static.getClient().getWorld() != currentWorld) {
                                    hopped = false;
                                }
                            }
                        }
                    }

                    DialogUtil.talkToNpc("Cyreg Paddlehorn", DIALOGUE_OPTIONS);
                }
            }

            // Handle bridge crossing
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 20) {
                if (Players.getLocal().getWorldLocation().distanceTo(BOAT_LOCATION) <= 10) {
                    if (!Dialog.isOpen()) {
                        TileObjects.getNearest("Swamp Boaty").interact("Board");
                        Time.sleepTicks(2);
                    }
                    DialogUtil.chooseDialogOptions(DIALOGUE_OPTIONS);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(BRIDGE_START) <= 42) {
                    if (Players.getLocal().getWorldLocation().distanceTo(TREE_BRIDGE_SPOT) > 5) {
                        AccBuilderSotf.c = "Nav to bridge";
                        Movement.walkTo(TREE_BRIDGE_SPOT);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(TREE_BRIDGE_SPOT) <= 5) {
                        TileObjects.getNearest("Tree").interact("Climb");
                        Time.sleepTicks(2);
                    }
                }
            }

            // Handle bridge repair
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 9 && HIDEOUT_AREA.contains(Players.getLocal().getWorldLocation())) {
                bridgeState = 0;

                WorldPoint bridgeTile1 = new WorldPoint(24031, 32721, 0);
                WorldPoint bridgeTile2 = new WorldPoint(24031, 32722, 0);
                WorldPoint bridgeTile3 = new WorldPoint(24031, 32723, 0);
                WorldPoint bridgeTile4 = new WorldPoint(24031, 32608, 0);

                // Navigate to bridge
                if (Players.getLocal().getWorldLocation().distanceTo(TREE_BRIDGE_SPOT) > 5 &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile1) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile2) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile4) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile3) &&
                    !BRIDGE_AREA.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Nav to bridge";
                    Movement.walkTo(TREE_BRIDGE_SPOT);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(TREE_BRIDGE_SPOT) <= 5 &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile1) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile2) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile4) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile3)) {
                    TileObjects.getNearest("Tree").interact("Climb");
                    Time.sleepTicks(2);
                }

                // Repair bridge
                if ((!Players.getLocal().getWorldLocation().equals(bridgeTile1) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile2) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile4)) ||
                    Players.getLocal().getWorldLocation().equals(bridgeTile3)) {

                    TileObject bridge = TileObjects.getNearest("Broken rope bridge");
                    if (bridge != null) {
                        if (bridge.hasAction("Repair")) {
                            AccBuilderSotf.c = "Repairing bridge";
                            bridge.interact("Repair");
                            Time.sleepTicks(2);
                        }
                    }
                }

                if (Players.getLocal().getWorldLocation().equals(bridgeTile4)) {
                    TileObjects.getNearest("Tree").interact("Climb");
                    Time.sleepTicks(2);
                }

                // Navigate to hideout door
                if (BRIDGE_AREA.contains(Players.getLocal().getWorldLocation()) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile1) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile2) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile4) &&
                    !Players.getLocal().getWorldLocation().equals(bridgeTile3)) {

                    if (Players.getLocal().getWorldLocation().distanceTo(MYREQUE_HIDEOUT_DOOR) > 5) {
                        AccBuilderSotf.c = "Nav to door";
                        Movement.walkTo(MYREQUE_HIDEOUT_DOOR);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(MYREQUE_HIDEOUT_DOOR) <= 5) {
                        AccBuilderSotf.c = "Handling chat";
                        DialogUtil.talkToNpc("Curpile Fyod", DIALOGUE_OPTIONS);
                    }
                }
            }

            // Handle hideout dialogue
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 31) {
                if (!Dialog.isOpen()) {
                    List<NPC> npcs = NPCs.getAll("Curpile Fyod");
                    if (npcs.size() > 0) {
                        npcs.get(0).interact("Talk-to");
                        Time.sleepUntil(() -> Dialog.isOpen(), 24572);
                    }
                }

                if (Dialog.isOpen()) {
                    if (!Dialog.canContinueNPC() || Dialog.canContinue()) {
                        Dialog.continueSpace();
                    }

                    List<Widget> widgets = Widgets.getChildren(219, 1, widget -> widget.isVisible());
                    if (!widgets.isEmpty()) {
                        for (int i = 0; i < widgets.size(); i++) {
                            handleDialogueOptions(widgets, i);
                        }
                    }
                }
            }

            // Enter hideout
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 35) {
                AccBuilderSotf.c = "Entering doors";
                TileObjects.getNearest("Wooden doors").interact("Open");
                Time.sleepTicks(4);
                DialogUtil.chooseDialogOptions(DIALOGUE_OPTIONS);
            }

            // Navigate to cave
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 61) {
                if (!CAVE_AREA.contains(Players.getLocal().getWorldLocation())) {
                    if (Players.getLocal().getWorldLocation().distanceTo(CAVE_ENTRANCE) > 5) {
                        AccBuilderSotf.c = "Nav to cave";
                        Movement.walkTo(CAVE_ENTRANCE);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(CAVE_ENTRANCE) <= 5) {
                        AccBuilderSotf.c = "Entering cave";
                        TileObjects.getNearest("Cave entrance").interact("Enter");
                        Time.sleepTicks(4);
                        DialogUtil.chooseDialogOptions(DIALOGUE_OPTIONS);
                    }
                }

                if (CAVE_AREA.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Talking";
                    DialogUtil.talkToNpc("Veliaf Hurtz", DIALOGUE_OPTIONS);
                }
            }

            // Handle member conversations
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 70) {
                AccBuilderSotf.c = "Talking";

                int memberProgress = Vars.getBit(MYREQUE_MEMBER_VARBIT);

                if (memberProgress == 0) {
                    if (!Dialog.canContinue()) {
                        DialogUtil.talkToNpc("Harold Evans", DIALOGUE_OPTIONS);
                    }
                    DialogUtil.chooseDialogOptions(DIALOGUE_OPTIONS);
                }

                if (memberProgress == 2) {
                    if (!Dialog.canContinue()) {
                        NPCs.getNearest("Radigad Ponfit").interact("Talk-to");
                    }
                    DialogUtil.talkToNpc("Radigad Ponfit", DIALOGUE_OPTIONS);
                }

                if (memberProgress == 7) {
                    if (!Dialog.canContinue()) {
                        NPCs.getNearest("Sani Piliu").interact("Talk-to");
                    }
                    DialogUtil.talkToNpc("Sani Piliu", DIALOGUE_OPTIONS);
                }

                if (memberProgress == 15) {
                    if (!Dialog.canContinue()) {
                        NPCs.getNearest("Polmafi Ferdygris").interact("Talk-to");
                    }
                    DialogUtil.talkToNpc("Polmafi Ferdygris", DIALOGUE_OPTIONS);
                }

                if (memberProgress == 17) {
                    if (!Dialog.canContinue()) {
                        NPCs.getNearest("Ivan Strom").interact("Talk-to");
                    }
                    DialogUtil.talkToNpc("Ivan Strom", DIALOGUE_OPTIONS);
                }

                if (memberProgress == 19) {
                    String[] weaponOptions = new String[]{
                        "Let's talk about the weapons.",
                        "I'll be back later."
                    };
                    DialogUtil.talkToNpc("Veliaf Hurtz", weaponOptions);
                }
            }

            // Talk to Veliaf
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 72) {
                AccBuilderSotf.c = "Talking";
                DialogUtil.talkToNpc("Veliaf Hurtz", DIALOGUE_OPTIONS);
            }

            // Handle quest dialogue
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 66) {
                AccBuilderSotf.c = "Handling chat";
                DialogUtil.chooseDialogOptions(DIALOGUE_OPTIONS);
            }

            // Boss fight
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 78) {
                AccBuilderSotf.c = "BOSS FIGHT";

                // Restore prayer
                if (Prayers.getPoints() < 20 && Inventory.contains(ItemIdArrays.PRAYER_POTIONS)) {
                    Inventory.getFirst(ItemIdArrays.PRAYER_POTIONS).interact("Drink");
                    Time.sleepTicks(1);
                }

                // Enable Protect from Melee
                if (!Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }

                // Equip silver sickle
                if (Inventory.contains(SILVER_SICKLE_B)) {
                    if (!Equipment.contains(SILVER_SICKLE_B)) {
                        Inventory.getFirst(SILVER_SICKLE_B).interact("Wield");
                    }
                }

                // Attack boss
                if (Players.getLocal().getInteracting() == null) {
                    NPC boss = NPCs.getNearest(VANSTROM_KLAUSE_NPC);
                    if (boss != null) {
                        boss.interact("Attack");
                        Time.sleepTicks(2);
                    }
                }
            }

            // After boss fight
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 83) {
                AccBuilderSotf.c = "Talking";

                if (Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }

                DialogUtil.talkToNpc("Veliaf Hurtz", DIALOGUE_OPTIONS);
            }

            // Exit cave and finish quest
            if ((GameStateUtil.getVarbit(QUEST_VARBIT) != 105 && GameStateUtil.getVarbit(QUEST_VARBIT) != 97 && GameStateUtil.getVarbit(QUEST_VARBIT) != 101) ||
                GameStateUtil.getVarbit(QUEST_VARBIT) == 800) {

                if (CAVE_AREA.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Exiting cave";
                    TileObjects.getNearest("Cave entrance").interact("Enter");
                    Time.sleepTicks(4);
                    DialogUtil.chooseDialogOptions(DIALOGUE_OPTIONS);
                }

                if (!CAVE_AREA.contains(Players.getLocal().getWorldLocation())) {
                    if (Players.getLocal().getWorldLocation().distanceTo(CANIFIS_BANK) > 4) {
                        AccBuilderSotf.c = "Nav to start";

                        if (Players.getLocal().getWorldLocation().distanceTo(b.I) > 20) {
                            if (Dialog.isOpen()) {
                                Dialog.close();
                            }
                            Movement.walkTo(CANIFIS_BANK);
                            Time.sleepTicks(1);
                        }
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(CANIFIS_BANK) <= 4) {
                        AccBuilderSotf.c = "Finishing quest";

                        if (bridgeState < 1) {
                            aN.qU += 1;
                            aN.u(AccBuilderSotf.m);
                            bridgeState += 1;
                            aN.qU = 0;
                            initializedBridge = false;
                        }

                        DialogUtil.talkToNpc("Stranger", DIALOGUE_OPTIONS);
                    }
                }
            }

            // Use bucket of snails when needed
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 26) {
                if (Inventory.contains(BUCKET) && Players.getLocal().getAnimation() == -1) {
                    Inventory.getFirst(BUCKET).interact("Break");
                    Time.sleepTicks(2);
                }
            }
        }
    }

    /**
     * Checks if the player has all required items for the quest.
     */
    private static boolean hasRequiredItems() {
        return Inventory.contains(STEEL_SWORD) &&
               Inventory.contains(STEEL_MACE) &&
               Inventory.contains(STEEL_LONGSWORD) &&
               Inventory.contains(STEEL_WARHAMMER) &&
               Inventory.contains(STEEL_DAGGER) &&
               Inventory.contains(STEEL_2H_SWORD) &&
               Inventory.contains(STEEL_CHAINBODY) &&
               Inventory.contains(STEEL_MED_HELM) &&
               Inventory.contains(STAMINA_POTION) &&
               Inventory.contains("Druid pouch") &&
               Inventory.contains(SNAIL_SHELL) &&
               Inventory.contains(BUCKET) &&
               Inventory.contains(PLANK) &&
               Inventory.contains(CHITIN);
    }

    /**
     * Builds the shopping list for missing items.
     */
    private static void buildShoppingList() {
        if (!Bank.contains(SILVER_SICKLE_B)) {
            shoppingList.add(new ShopItem(SILVER_SICKLE_B, 1, 37432));
        }

        if (!Bank.contains(STEEL_MACE)) {
            shoppingList.add(new ShopItem(STEEL_MACE, 1, 27547));
        }

        if (!Bank.contains(STEEL_LONGSWORD)) {
            shoppingList.add(new ShopItem(STEEL_LONGSWORD, 1, 27547));
        }

        if (!Bank.contains(STEEL_WARHAMMER)) {
            shoppingList.add(new ShopItem(STEEL_WARHAMMER, 1, 27547));
        }

        if (!Bank.contains(STEEL_CHAINBODY)) {
            shoppingList.add(new ShopItem(STEEL_CHAINBODY, 1, 27547));
        }

        if (Bank.contains(STEEL_DAGGER) && Bank.getFirst(STEEL_DAGGER).getQuantity() < 2) {
            shoppingList.add(new ShopItem(STEEL_DAGGER, 2, 27547));
        }

        if (Bank.contains(FOOD_MONKFISH) && Bank.getFirst(FOOD_MONKFISH).getQuantity() < 20) {
            shoppingList.add(new ShopItem(FOOD_MONKFISH, 20, 14156));
        }

        if (Bank.contains(STEEL_2H_SWORD) && Bank.getFirst(STEEL_2H_SWORD).getQuantity() < 225) {
            shoppingList.add(new ShopItem(STEEL_2H_SWORD, 225, 78));
        }

        if (Bank.contains(STEEL_MED_HELM) && Bank.getFirst(STEEL_MED_HELM).getQuantity() < 7) {
            shoppingList.add(new ShopItem(STEEL_MED_HELM, 7, 197));
        }

        if (Bank.contains(SNAIL_SHELL) && Bank.getFirst(SNAIL_SHELL).getQuantity() < 7) {
            shoppingList.add(new ShopItem(SNAIL_SHELL, 9, 203));
        }

        if (Bank.contains(SWAMP_TAR) && Bank.getFirst(SWAMP_TAR).getQuantity() < 3) {
            shoppingList.add(new ShopItem(SWAMP_TAR, 4, 32581));
        }

        if (Bank.contains(BUCKET) && Bank.getFirst(BUCKET).getQuantity() < 10) {
            shoppingList.add(new ShopItem(BUCKET, 10, GameStateUtil.randomRange(7820, 7918)));
        }

        if (Bank.contains(PLANK) && Bank.getFirst(PLANK).getQuantity() < 5) {
            shoppingList.add(new ShopItem(PLANK, 5, GameStateUtil.randomRange(10214, 10046)));
        }

        if (!Bank.contains(STEEL_SWORD)) {
            shoppingList.add(new ShopItem(STEEL_SWORD, 1, 27547));
        }

        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            shoppingList.add(new ShopItem(32492, 5, 27033));
        }

        if (!Bank.contains(ROPE)) {
            shoppingList.add(new ShopItem(ROPE, 57, 28886));
        }
    }

    /**
     * Handles dialogue option selection for quiz questions.
     */
    private static void handleDialogueOptions(List<Widget> widgets, int index) {
        // Question: Who is the only female in the Myreque?
        if ((!widgets.get(0).getText().contains("Who is the only female in the Myreque?") ||
             widgets.get(0).getText().contains("female")) &&
            widgets.get(index).getText().contains("Sani Piliu")) {
            Mouse.click(widgets.get(index).getClickPoint().getX(), widgets.get(index).getClickPoint().getY(), true);
            Time.sleepTicks(2);
        }

        // Question: Who is the leader?
        if (widgets.get(0).getText().contains("leader") &&
            widgets.get(index).getText().contains("Veliaf Hurtz")) {
            Mouse.click(widgets.get(index).getClickPoint().getX(), widgets.get(index).getClickPoint().getY(), true);
            Time.sleepTicks(2);
        }

        // Question: Who is the boatman?
        if ((!widgets.get(0).getText().contains("boatman's") ||
             widgets.get(0).getText().contains("boatman")) &&
            widgets.get(index).getText().contains("Cyreg Paddlehorn")) {
            Mouse.click(widgets.get(index).getClickPoint().getX(), widgets.get(index).getClickPoint().getY(), true);
            Time.sleepTicks(2);
        }

        // Question: Who is the scholar?
        if (widgets.get(0).getText().contains("scholar?") &&
            widgets.get(index).getText().contains("Polmafi Ferdygris")) {
            Mouse.click(widgets.get(index).getClickPoint().getX(), widgets.get(index).getClickPoint().getY(), true);
            Time.sleepTicks(2);
        }

        // Question: What is the vampyre family name?
        if (widgets.get(0).getText().contains("vampyre family") &&
            widgets.get(index).getText().contains("Drakan")) {
            Mouse.click(widgets.get(index).getClickPoint().getX(), widgets.get(index).getClickPoint().getY(), true);
            Time.sleepTicks(2);
        }

        // Question: Who is the youngest?
        if (widgets.get(0).getText().contains("youngest") &&
            widgets.get(index).getText().contains("Ivan Strom")) {
            Mouse.click(widgets.get(index).getClickPoint().getX(), widgets.get(index).getClickPoint().getY(), true);
            Time.sleepTicks(2);
        }

        // Question: What does Myreque mean?
        if (widgets.get(0).getText().contains("Myreque mean?") &&
            widgets.get(index).getText().contains("Hidden in Myre")) {
            Mouse.click(widgets.get(index).getClickPoint().getX(), widgets.get(index).getClickPoint().getY(), true);
            Time.sleepTicks(2);
        }
    }
}
