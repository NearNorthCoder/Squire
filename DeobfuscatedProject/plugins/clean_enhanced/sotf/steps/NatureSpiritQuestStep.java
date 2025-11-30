package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Actor;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
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
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.sotf.framework.ShopItem;
import gg.squire.sotf.framework.GameStateUtil;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Quest step handler for the Nature Spirit quest.
 *
 * This class manages all the steps required to complete the Nature Spirit quest,
 * including:
 * - Banking and gathering required items
 * - Navigating to quest locations
 * - Interacting with NPCs (Filliman Tarlock, Drezel, Nature Spirit)
 * - Solving the grotto puzzle
 * - Collecting Mort Myre fungus
 * - Defeating ghasts
 * - Completing the quest
 */
public class NatureSpiritQuestStep implements QuestStep {

    // Quest-related item IDs
    public static final int ITEM_MIRROR = 25427;
    public static final int ITEM_SILVER_SICKLE_B = 2963;
    public static final int ITEM_WASHING_BOWL = 32461;
    public static final int ITEM_DRUIDIC_SPELL = 23825;
    public static final int ITEM_MORT_MYRE_FUNGUS = 2970;
    public static final int ITEM_SILVER_SICKLE = 2961;
    public static final int ITEM_DRUID_POUCH = 12753;
    public static final int ITEM_NATURE_TALISMAN = 1440;
    public static final int ITEM_SALVE_GRAVEYARD_TELEPORT = 19619;
    public static final int ITEM_RUNE_ESSENCE = 7936;

    // Important object IDs
    public static final int OBJECT_GROTTO_TREE = 3505;
    public static final int OBJECT_FUNGI_ON_LOG = 15825;
    public static final int OBJECT_TRAPDOOR = 15650;

    // Quest varbits/varps
    public static final int VARBIT_NATURE_SPIRIT = 307;
    public static final int VARBIT_PRIEST_IN_PERIL = 302;
    public static final int VARP_QUEST_POINTS = 101;

    // Quest stage values
    public static final int STAGE_NOT_STARTED = 0;
    public static final int STAGE_COMPLETE = 90;

    // Important locations
    public static final WorldPoint LOCATION_SALVE_TELEPORT = 3432;
    public static final WorldPoint LOCATION_GROTTO_ENTRANCE = new WorldPoint(3440, 9895, 0);
    public static final WorldPoint LOCATION_MORT_MYRE = new WorldPoint(16058, 9902, 0);
    public static final WorldPoint LOCATION_GROTTO_LOG = new WorldPoint(12157, 12075, 0);
    public static final WorldPoint LOCATION_FUNGUS_AREA = new WorldPoint(16058, 9899, 0);
    public static final WorldPoint LOCATION_PRIEST_IN_TEMPLE = new WorldPoint(16058, 9875, 0);
    public static final WorldPoint LOCATION_GROTTO_INSIDE = new WorldPoint(16058, 9763, 0);

    // Quest area
    static WorldArea GROTTO_AREA = new WorldArea(19951, 28027, 19, 23, 0);

    // Quest state tracking
    public static List<ShopItem> itemsToBuy = new ArrayList<>();
    public static boolean hasGatheredSupplies = false;
    static boolean hasCompletedBanking = false;
    static int ghastKillCounter = 0;
    static int questStageTracker = 0;

    // Dialog options for quest
    static String[] DIALOG_OPTIONS = new String[] {
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
        "I think I've solved the puzzle!",
        "How can I help?",
        "Roald sent me to check on Drezel.",
        "Why is the river such a good defence?",
        "You're right, we don't.",
        "Yes, of course.",
        "Do you know of anything I can do in Morytania?",
        "How long have you been a ghost?",
        "What's this pouch for?"
    };

    /**
     * Returns the priority order for this quest step.
     * Higher numbers indicate higher priority.
     *
     * @return priority value (64)
     */
    @Override
    public int execute() {
        try {
            executeQuestStep();
        } catch (Exception exception) {
            // Silently handle exceptions
        }
        return 64;
    }

    /**
     * Checks if this quest step should be skipped.
     *
     * @return false (never skip)
     */
    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    /**
     * Returns the quest name.
     *
     * @return "Nature spirit"
     */
    @Override
    public String getName() {
        return "Nature spirit";
    }

    /**
     * Checks if the quest is complete.
     *
     * @return true if quest stage is 90 (complete), false otherwise
     */
    @Override
    public boolean isComplete() {
        return GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) >= STAGE_COMPLETE;
    }

    /**
     * Checks if the player has all required quest items.
     *
     * @return true if player has all required items
     */
    static boolean hasRequiredQuestItems() {
        if (!Inventory.contains("Salve graveyard teleport")) {
            return false;
        }
        if (!Inventory.contains(f.ba)) {
            return false;
        }
        if (!Inventory.contains(ITEM_MORT_MYRE_FUNGUS)) {
            return false;
        }
        if (!Inventory.contains("Silver sickle")) {
            if (!Equipment.contains("Silver sickle")) {
                return false;
            }
        }
        if (!Inventory.contains("Mort myre fungus")) {
            return false;
        }
        if (!Inventory.contains(ITEM_DRUID_POUCH)) {
            if (!Equipment.contains(ITEM_DRUID_POUCH)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if player has any food or prayer potions.
     *
     * @return true if player has food or prayer potions
     */
    private static boolean hasFoodOrPrayerPotions() {
        if (Inventory.getCount("") > 0 && Inventory.getCount("") > 0) {
            return true;
        }
        return false;
    }

    /**
     * Adds items to the shopping list if missing from bank.
     */
    private static void addMissingItemsToShoppingList() {
        // Add Salve graveyard teleport if missing
        if (!Bank.contains(ITEM_SALVE_GRAVEYARD_TELEPORT)) {
            ShopItem teleportItem = new ShopItem(ITEM_SALVE_GRAVEYARD_TELEPORT, 1, 13407);
            itemsToBuy.add(teleportItem);
        }

        // Add stamina potion if missing
        if (!Bank.contains(12625)) {
            ShopItem staminaPotion = new ShopItem(12625, 1, 7932);
            itemsToBuy.add(staminaPotion);
        }

        // Add silver sickle if missing
        if (!Bank.contains(ITEM_SILVER_SICKLE)) {
            ShopItem silverSickle = new ShopItem(ITEM_SILVER_SICKLE, 165, GameStateUtil.randomRange(32445, 15399));
            itemsToBuy.add(silverSickle);
        }

        // Add nature talisman if missing
        if (!Bank.contains(ITEM_NATURE_TALISMAN)) {
            ShopItem natureTalisman = new ShopItem(ITEM_NATURE_TALISMAN, 3, 15343);
            itemsToBuy.add(natureTalisman);
        }

        // Add rune essence if missing
        if (!Bank.contains(ITEM_RUNE_ESSENCE)) {
            ShopItem runeEssence = new ShopItem(ITEM_RUNE_ESSENCE, 5, Constants.DEFAULT_GE_TIMEOUT);
            itemsToBuy.add(runeEssence);
        }

        // Add prayer potion if missing - check quantity
        if (Bank.contains(ITEM_MORT_MYRE_FUNGUS)) {
            if (Bank.getFirst(ITEM_MORT_MYRE_FUNGUS).getQuantity() < 165) {
                ShopItem prayerPotion = new ShopItem(ITEM_MORT_MYRE_FUNGUS, 191, 30573);
                itemsToBuy.add(prayerPotion);
            }
        }

        // Add druid pouch if missing
        if (!Bank.contains(ITEM_DRUID_POUCH)) {
            ShopItem druidPouch = new ShopItem(ITEM_DRUID_POUCH, 1, 13407);
            itemsToBuy.add(druidPouch);
        }

        // Add ring of wealth if missing
        Predicate<net.unethicalite.api.items.Item> wealthRingPredicate =
            item -> item.getName().toLowerCase().contains("ring of wealth (");
        if (!Bank.contains(wealthRingPredicate)) {
            ShopItem ringOfWealth = new ShopItem(11980, 5, 25583);
            itemsToBuy.add(ringOfWealth);
        }

        // Add nature rune if missing
        if (!Bank.contains(561)) {
            ShopItem natureRune = new ShopItem(561, 1000, 2735);
            itemsToBuy.add(natureRune);
        }
    }

    /**
     * Main quest step execution logic.
     * Handles all quest steps based on current quest stage.
     */
    public static void executeQuestStep() {
        // Check if we need to buy supplies
        if (hasGatheredSupplies) {
            b.a(itemsToBuy);
            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                hasGatheredSupplies = false;
            }
        }

        if (!hasGatheredSupplies) {
            BankLocation bankLocation;

            // Check prerequisite quests
            if (!(GameStateUtil.getVarbit(VARBIT_PRIEST_IN_PERIL) >= 100) || GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) < 5) {
                H.cf();
            }

            // Handle banking if we don't have required items
            if (!hasRequiredQuestItems() &&
                GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 5 &&
                GameStateUtil.getVarbit(VARBIT_PRIEST_IN_PERIL) >= 100) {

                bankLocation = BankLocation.getNearest();

                // Navigate to bank if not there
                if (bankLocation != null && !bankLocation.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Nav to bank";
                    a.a(bankLocation);
                }

                // Open bank and handle banking
                if (bankLocation != null && bankLocation.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), 20000);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = "Handling banking";

                        // Deposit inventory if not empty
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(4);
                        }

                        // Deposit equipment if not empty
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check if we have required items in bank
                        if (Bank.contains(ITEM_MORT_MYRE_FUNGUS)) {
                            if (Bank.getFirst(ITEM_MORT_MYRE_FUNGUS).getQuantity() < 165) {
                                addMissingItemsToShoppingList();
                                System.out.println("We are missing quest supplies, switching to BUYING");
                                hasGatheredSupplies = true;
                                return;
                            }
                        }

                        // Check if we have all required items
                        int[] requiredItems = new int[] {
                            561,
                            ITEM_SILVER_SICKLE,
                            ITEM_DRUID_POUCH,
                            ITEM_NATURE_TALISMAN,
                            ITEM_MORT_MYRE_FUNGUS,
                            ITEM_RUNE_ESSENCE
                        };

                        if (!GameStateUtil.randomRange(requiredItems)) {
                            addMissingItemsToShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            hasGatheredSupplies = true;
                            return;
                        }

                        // Withdraw quest items
                        if (GameStateUtil.randomRange(requiredItems)) {
                            a.a(12625, 2);
                            a.a(ITEM_DRUID_POUCH, 1);
                            a.a(ITEM_SALVE_GRAVEYARD_TELEPORT, 1);
                            a.a(561, 165);
                            a.a(ITEM_SILVER_SICKLE, 165);
                            a.a(ITEM_DRUID_POUCH, 1);
                            a.a(ITEM_NATURE_TALISMAN, 3);
                            a.a(ITEM_RUNE_ESSENCE, 4);
                            a.a(ITEM_MORT_MYRE_FUNGUS, 50);
                        }
                    }
                }
            }

            // Use stamina potion if needed
            if (Inventory.contains(f.ba) && Movement.getRunEnergy() < 181) {
                Inventory.getFirst(f.ba).interact("Drink");
                Time.sleepTicks(1);
            }

            // Use prayer restore if needed
            if (Inventory.contains(ITEM_MORT_MYRE_FUNGUS) && GameStateUtil.getHealthPercentage() < 60.0) {
                Inventory.getFirst(ITEM_MORT_MYRE_FUNGUS).interact("Eat");
                Time.sleepTicks(1);
            }

            // Handle gate navigation
            WorldPoint gatePoint1 = new WorldPoint(7807, 5016, 0);
            WorldPoint gatePoint2 = new WorldPoint(20007, 5016, 0);
            WorldPoint gatePoint3 = new WorldPoint(28323, 5016, 0);
            WorldPoint gatePoint4 = new WorldPoint(31855, 5016, 0);

            if (!(Players.getLocal().getWorldLocation().equals(gatePoint1)) ||
                !(Players.getLocal().getWorldLocation().equals(gatePoint2)) ||
                !(Players.getLocal().getWorldLocation().equals(gatePoint3)) ||
                Players.getLocal().getWorldLocation().equals(gatePoint4)) {

                TileObjects.getNearest("Gate").interact("Open");
                Time.sleepTicks(6);
            }

            // Quest stage 5-138: Initial quest stages
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) >= 5 &&
                GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) < 138 &&
                hasRequiredQuestItems()) {

                // Stage 5: Navigate to grotto and break teleport tab
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_SALVE_TELEPORT) > 140) {
                    AccBuilderSotf.c = "Using salve tele";

                    if (Inventory.contains(ITEM_SILVER_SICKLE) &&
                        Players.getLocal().getAnimation() == -1) {
                        Inventory.getFirst(ITEM_SILVER_SICKLE).interact("Break");
                        Time.sleepTicks(2);
                    }
                }

                // Navigate to grotto area
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_SALVE_TELEPORT) <= 140) {
                    if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_INSIDE) > 4) {
                        AccBuilderSotf.c = "Nav to grotto";

                        if (Dialog.isOpen()) {
                            Dialog.close();
                        }

                        // Handle specific navigation points
                        if (!(Players.getLocal().getWorldLocation().equals(new WorldPoint(28636, 19851, 0))) ||
                            Players.getLocal().getWorldLocation().equals(new WorldPoint(11128, 19851, 0))) {
                            GameStateUtil.randomRange(new WorldPoint(32639, 32637, 0));
                            Time.sleepTicks(4);
                        }

                        // Click through widgets if needed
                        Widget widget1 = Widgets.get(13086, 138);
                        if (widget1 != null) {
                            Mouse.click(widget1.getClickPoint().getX(), widget1.getClickPoint().getY(), true);
                            Time.sleepTicks(3);
                        }

                        Widget widget2 = Widgets.get(13086, 17);
                        if (widget2 != null) {
                            Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), true);
                            Time.sleepTicks(3);
                        }

                        // Navigate to specific point in grotto
                        WorldPoint grottoPoint = new WorldPoint(32519, 28027, 0);
                        if (Players.getLocal().getWorldLocation().equals(grottoPoint)) {
                            GameStateUtil.randomRange(new WorldPoint(12031, 32509, 0));
                            Time.sleepTicks(GameStateUtil.randomRange(5, 6));
                        }

                        // Walk to grotto if not at specific locations
                        if (!(Players.getLocal().getWorldLocation().equals(new WorldPoint(28636, 19851, 0))) &&
                            !(Players.getLocal().getWorldLocation().equals(new WorldPoint(11128, 19851, 0)))) {
                            Movement.walkTo(LOCATION_GROTTO_INSIDE);
                            Time.sleepTicks(1);
                        }
                    }

                    // Inside grotto area - handle NPCs and items
                    if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_INSIDE) <= 4) {
                        e.l(ITEM_DRUID_POUCH);

                        if (!Inventory.contains("Mirror")) {
                            AccBuilderSotf.c = "Getting mirror";

                            // Pick up washing bowl
                            TileItem washingBowl = TileItems.getNearest("Washing bowl");
                            if (washingBowl != null) {
                                if (TileItems.getNearest("Mirror") == null) {
                                    washingBowl.interact("Take");
                                    Time.sleepTicks(2);
                                }
                            }

                            // Pick up mirror
                            TileItem mirror = TileItems.getNearest("Mirror");
                            if (mirror != null) {
                                mirror.interact("Take");
                                Time.sleepTicks(1);
                            }
                        }

                        // Search grotto tree if we have mirror but no journal
                        if (Inventory.contains("Mirror")) {
                            if (!Inventory.contains("Journal")) {
                                TileObjects.getNearest("Grotto tree").interact("Search");
                                Time.sleepTicks(2);
                            }
                        }

                        // Enter grotto if Filliman Tarlock not present
                        if (NPCs.getNearest("Filliman Tarlock") == null) {
                            TileObjects.getNearest("Grotto").interact("Enter");
                            Time.sleepTicks(4);
                        }

                        // Talk to Filliman Tarlock
                        if (NPCs.getNearest("Filliman Tarlock") != null) {
                            g.a("Filliman Tarlock", DIALOG_OPTIONS);
                        }
                    }
                }
            }

            // Quest stage 138: Equip items and talk to Filliman
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 138) {
                questStageTracker = 0;

                if (Inventory.contains("Mirror") && Inventory.contains("Journal")) {
                    // Equip druid pouch if needed
                    if (Inventory.contains(ITEM_DRUID_POUCH) && !Equipment.contains(ITEM_DRUID_POUCH)) {
                        Inventory.getFirst(ITEM_DRUID_POUCH).interact("Wear");
                    }

                    // Enter grotto if Filliman not present
                    if (NPCs.getNearest("Filliman Tarlock") == null) {
                        TileObjects.getNearest("Grotto").interact("Enter");
                        Time.sleepTicks(4);
                    }

                    // Use mirror on Filliman
                    if (NPCs.getNearest("Filliman Tarlock") != null) {
                        if (ghastKillCounter < 1) {
                            Inventory.getFirst("Mirror").useOn(NPCs.getNearest("Filliman Tarlock"));
                            Time.sleepTicks(3);
                            ghastKillCounter += 1;
                        }

                        // Use mirror again if dialog is open
                        if (!Dialog.isOpen()) {
                            Inventory.getFirst("Mirror").useOn(NPCs.getNearest("Filliman Tarlock"));
                            Time.sleepTicks(3);
                        }

                        g.a(DIALOG_OPTIONS);
                    }
                }
            }

            // Quest stage 7: Continue dialog with Filliman
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 7) {
                if (NPCs.getNearest("Filliman Tarlock") == null) {
                    TileObjects.getNearest("Grotto").interact("Enter");
                    Time.sleepTicks(4);
                }

                if (!Dialog.isOpen()) {
                    Inventory.getFirst("Journal").useOn(NPCs.getNearest("Filliman Tarlock"));
                }

                g.a(DIALOG_OPTIONS);
            }

            // Quest stage 191: More dialog
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 191) {
                if (NPCs.getNearest("Filliman Tarlock") == null) {
                    TileObjects.getNearest("Grotto").interact("Enter");
                    Time.sleepTicks(4);
                }

                if (NPCs.getNearest("Filliman Tarlock") != null) {
                    g.a("Filliman Tarlock", DIALOG_OPTIONS);
                }
            }

            // Quest stage 33: Navigate to priest and break tab
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 33) {
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_INSIDE) < 12) {
                    AccBuilderSotf.c = "Breaking tab";

                    if (Inventory.contains(ITEM_SILVER_SICKLE) &&
                        Players.getLocal().getAnimation() == -1) {
                        Inventory.getFirst(ITEM_SILVER_SICKLE).interact("Break");
                        Time.sleepTicks(2);
                    }
                }

                // Navigate to priest location
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_INSIDE) > 12 &&
                    Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_LOG) > 12) {
                    AccBuilderSotf.c = "Nav to priest";
                    Movement.walkTo(LOCATION_GROTTO_LOG);
                    Time.sleepTicks(1);
                }

                // Open trapdoor
                if (TileObjects.getNearest("Trapdoor") != null) {
                    TileObjects.getNearest("Trapdoor").interact("Open");
                    Time.sleepTicks(3);
                }

                // Talk to Drezel
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_LOG) <= 6) {
                    AccBuilderSotf.c = "Interact priest";
                    g.a("Drezel", DIALOG_OPTIONS);
                }
            }

            // Quest stage 48: Navigate back and break tab
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 48) {
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_LOG) < 12) {
                    AccBuilderSotf.c = "Breaking tab";

                    if (Inventory.contains(ITEM_SILVER_SICKLE) &&
                        Players.getLocal().getAnimation() == -1) {
                        Inventory.getFirst(ITEM_SILVER_SICKLE).interact("Break");
                        Time.sleepTicks(2);
                    }
                }

                // Navigate to log location
                if (!(Players.getLocal().getWorldLocation().equals(LOCATION_MORT_MYRE)) &&
                    Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_LOG) > 12) {
                    AccBuilderSotf.c = "Nav to log";
                    Movement.walkTo(LOCATION_MORT_MYRE);
                    Time.sleepTicks(1);

                    Widget widget1 = Widgets.get(13086, 138);
                    if (widget1 != null) {
                        Mouse.click(widget1.getClickPoint().getX(), widget1.getClickPoint().getY(), true);
                        Time.sleepTicks(3);
                    }

                    Widget widget2 = Widgets.get(13086, 17);
                    if (widget2 != null) {
                        Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), true);
                        Time.sleepTicks(3);
                    }
                }

                // Cast bloom spell on log
                if (Players.getLocal().getWorldLocation().equals(LOCATION_MORT_MYRE)) {
                    if (Inventory.contains(16382)) {
                        Inventory.getFirst(16382).interact("Cast");
                        Time.sleepTicks(2);
                    }
                }
            }

            // Quest stage 19: Pick fungi
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 19) {
                TileObjects fungiLog = TileObjects.getNearest("Fungi on log");
                if (fungiLog != null) {
                    fungiLog.interact("Pick");
                    Time.sleepTicks(2);
                }

                TileItem fungiItem = TileItems.getNearest("Fungi on log");
                if (fungiItem != null) {
                    fungiItem.interact("Pick");
                    Time.sleepTicks(2);
                }
            }

            // Quest stage 181: Navigate back to grotto
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 181) {
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_INSIDE) > 4) {
                    AccBuilderSotf.c = "Nav to grotto";
                    Movement.walkTo(LOCATION_GROTTO_INSIDE);
                    Time.sleepTicks(1);

                    WorldPoint grottoPoint = new WorldPoint(32519, 28027, 0);
                    if (Players.getLocal().getWorldLocation().equals(grottoPoint)) {
                        GameStateUtil.randomRange(new WorldPoint(12031, 32509, 0));
                        Time.sleepTicks(GameStateUtil.randomRange(5, 6));
                    }

                    if (Players.getLocal().getWorldLocation().equals(new WorldPoint(28636, 19851, 0))) {
                        GameStateUtil.randomRange(new WorldPoint(32639, 32637, 0));
                        Time.sleepTicks(4);
                    }

                    Widget widget1 = Widgets.get(13086, 138);
                    if (widget1 != null) {
                        Mouse.click(widget1.getClickPoint().getX(), widget1.getClickPoint().getY(), true);
                        Time.sleepTicks(3);
                    }

                    Widget widget2 = Widgets.get(13086, 17);
                    if (widget2 != null) {
                        Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), true);
                        Time.sleepTicks(3);
                    }
                }

                // Talk to Filliman when in grotto
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_INSIDE) <= 4) {
                    if (NPCs.getNearest("Filliman Tarlock") == null) {
                        TileObjects.getNearest("Grotto").interact("Enter");
                        Time.sleepTicks(4);
                    }

                    if (NPCs.getNearest("Filliman Tarlock") != null) {
                        g.a("Filliman Tarlock", DIALOG_OPTIONS);
                    }
                }
            }

            // Quest stage 68: Solve puzzle with fungi
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 68) {
                if (Inventory.contains("Mort myre fungus")) {
                    if (Inventory.getAll("Mort myre fungus").size() > 3) {
                        AccBuilderSotf.c = "Solving puzzle";

                        Inventory.getFirst("Mort myre fungus").useOn(TileObjects.getNearest(15837));
                        Time.sleepTicks(3);
                    }
                }

                if (Inventory.contains("A used spell")) {
                    Inventory.getFirst("A used spell").useOn(TileObjects.getNearest(15816));
                    Time.sleepTicks(3);
                }

                if (!Inventory.contains("A used spell")) {
                    if (Inventory.getAll("Mort myre fungus").size() <= 3) {
                        WorldPoint logLocation = TileObjects.getNearest(15832).getWorldLocation();

                        if (!(Players.getLocal().getWorldLocation().equals(logLocation))) {
                            Movement.walkTo(logLocation);
                            Time.sleepTicks(1);
                        }

                        if (Players.getLocal().getWorldLocation().equals(logLocation)) {
                            AccBuilderSotf.c = "Talking to filliman";
                            g.a("Filliman Tarlock", DIALOG_OPTIONS);
                        }
                    }
                }
            }

            // Quest stage 100: Enter grotto
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 100 &&
                Players.getLocal().getWorldLocation().distanceTo(LOCATION_FUNGUS_AREA) > 165) {
                TileObjects.getNearest("Grotto").interact("Enter");
                Time.sleepTicks(4);
            }

            // Quest stage 51: Search for Filliman/Nature Spirit
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 51) {
                if (NPCs.getNearest("Filliman Tarlock") == null) {
                    TileObjects.getNearest(OBJECT_GROTTO_TREE).interact("Search");
                    Time.sleepTicks(4);
                }

                if (NPCs.getNearest("Filliman Tarlock") != null) {
                    g.a("Filliman Tarlock", DIALOG_OPTIONS);
                }
            }

            // Quest stage 66: Continue searching
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 66) {
                if (NPCs.getNearest("Filliman Tarlock") == null) {
                    if (NPCs.getNearest("Nature Spirit") == null) {
                        TileObjects.getNearest(OBJECT_GROTTO_TREE).interact("Search");
                        Time.sleepTicks(4);
                    }
                }

                if (NPCs.getNearest("Filliman Tarlock") != null) {
                    g.a("Filliman Tarlock", DIALOG_OPTIONS);
                }

                if (NPCs.getNearest("Nature Spirit") != null) {
                    g.a("Nature Spirit", DIALOG_OPTIONS);
                }
            }

            // Quest stages 69-75: Dialog and druid pouch handling
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) >= 69 && GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) <= 75) {
                if (Dialog.isOpen()) {
                    g.a(DIALOG_OPTIONS);
                }

                if (TileObjects.getNearest("Grotto") != null) {
                    if (Inventory.contains("Druid pouch")) {
                        AccBuilderSotf.c = "Breaking tab";

                        if (Inventory.contains(ITEM_SILVER_SICKLE) &&
                            Players.getLocal().getAnimation() == -1) {
                            Inventory.getFirst(ITEM_SILVER_SICKLE).interact("Break");
                            Time.sleepTicks(2);
                        }
                    }
                }

                // Navigate to log location
                if (!(Players.getLocal().getWorldLocation().equals(LOCATION_MORT_MYRE)) &&
                    Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_LOG) > 12) {
                    if (TileObjects.getNearest("Grotto") == null) {
                        AccBuilderSotf.c = "Nav to log";
                        Movement.walkTo(LOCATION_MORT_MYRE);
                        Time.sleepTicks(1);

                        Widget widget1 = Widgets.get(13086, 138);
                        if (widget1 != null) {
                            Mouse.click(widget1.getClickPoint().getX(), widget1.getClickPoint().getY(), true);
                            Time.sleepTicks(3);
                        }

                        Widget widget2 = Widgets.get(13086, 17);
                        if (widget2 != null) {
                            Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), true);
                            Time.sleepTicks(3);
                        }
                    }
                }

                // Cast bloom spell
                if (Players.getLocal().getWorldLocation().equals(LOCATION_MORT_MYRE)) {
                    if (Inventory.contains(28543)) {
                        Inventory.getFirst(28543).interact("Cast Bloom");
                        Time.sleepTicks(2);
                    }
                }

                // Pick fungi and interact with objects
                TileObjects fungiLog = TileObjects.getNearest("Fungi on log");
                if (fungiLog != null) {
                    fungiLog.interact("Pick");
                    Time.sleepTicks(2);
                }

                TileItem fungiItem = TileItems.getNearest("Fungi on log");
                if (fungiItem != null) {
                    fungiItem.interact("Pick");
                    Time.sleepTicks(2);
                }

                // Fill druid pouch
                if (Inventory.contains("Mort myre fungus") &&
                    Players.getLocal().getWorldLocation().equals(LOCATION_MORT_MYRE)) {
                    if (Inventory.contains("Druid pouch")) {
                        Inventory.getFirst("Druid pouch").interact("Fill");
                        Time.sleepTicks(1);
                    }
                }
            }

            // Quest stages 90-93: Ghast combat
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) >= 90 && GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) < 93) {
                // Equip silver sickle
                if (!Equipment.contains(ITEM_SALVE_GRAVEYARD_TELEPORT)) {
                    if (Inventory.contains(ITEM_SALVE_GRAVEYARD_TELEPORT)) {
                        Inventory.getFirst(ITEM_SALVE_GRAVEYARD_TELEPORT).interact("Wield");
                    }
                }

                // Handle ghast combat
                List<net.unethicalite.api.entities.NPC> ghastList = NPCs.getAll("Ghast");
                net.unethicalite.api.entities.NPC attackableGhast = ghastList.stream()
                    .filter(npc -> npc.hasAction("Attack"))
                    .findFirst()
                    .orElse(null);

                // Drink prayer potion if needed
                if (Prayers.getPoints() < 138) {
                    Inventory.getFirst(item -> item.getName().contains("Prayer"))
                        .interact("Drink");
                }

                // Use druid pouch on ghast
                if (attackableGhast == null) {
                    AccBuilderSotf.c = "Using druid pouch on ghast";

                    if (Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }

                    Inventory.getFirst("Druid pouch").useOn(NPCs.getNearest("Ghast"));
                    Time.sleepTicks(140);
                }

                // Kill ghasts
                if (attackableGhast != null) {
                    AccBuilderSotf.c = "Killing ghasts";

                    if (!Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                }

                // Attack ghast if not already interacting
                if (attackableGhast != null && Players.getLocal().getInteracting() == null) {
                    AccBuilderSotf.c = "Killing ghasts, no interacting";
                    attackableGhast.interact("Attack");
                    Time.sleepTicks(2);
                }
            }

            // Quest stage 93: Final stage
            if (GameStateUtil.getVarbit(VARBIT_NATURE_SPIRIT) == 93) {
                // Disable prayer
                if (Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }

                // Navigate back to grotto
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_INSIDE) > 4 &&
                    Players.getLocal().getWorldLocation().distanceTo(LOCATION_FUNGUS_AREA) > 6) {
                    navigateToGrotto();
                }

                // Enter grotto and talk to Nature Spirit
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_GROTTO_INSIDE) <= 4) {
                    TileObjects.getNearest("Grotto").interact("Enter");
                    Time.sleepTicks(4);
                }

                // Complete quest
                if (Players.getLocal().getWorldLocation().distanceTo(LOCATION_FUNGUS_AREA) <= 6) {
                    if (questStageTracker < 1) {
                        aN.qH += 1;
                        aN.u(AccBuilderSotf.m);
                        questStageTracker += 1;
                        aN.qH = 0;
                        hasCompletedBanking = false;
                    }

                    if (NPCs.getNearest("Filliman Tarlock") == null) {
                        if (NPCs.getNearest("Nature Spirit") == null) {
                            TileObjects.getNearest(OBJECT_GROTTO_TREE).interact("Search");
                            Time.sleepTicks(4);
                        }
                    }

                    if (NPCs.getNearest("Filliman Tarlock") != null) {
                        g.a("Filliman Tarlock", DIALOG_OPTIONS);
                    }

                    if (NPCs.getNearest("Nature Spirit") != null) {
                        g.a("Nature Spirit", DIALOG_OPTIONS);
                    }
                }
            }
        }
    }

    /**
     * Helper method to navigate to the grotto area.
     * Handles teleporting and clicking through widgets.
     */
    private static void navigateToGrotto() {
        AccBuilderSotf.c = "Nav to grotto";
        Movement.walkTo(LOCATION_GROTTO_INSIDE);
        Time.sleepTicks(1);

        WorldPoint grottoPoint = new WorldPoint(32519, 28027, 0);
        if (Players.getLocal().getWorldLocation().equals(grottoPoint)) {
            GameStateUtil.randomRange(new WorldPoint(12031, 32509, 0));
            Time.sleepTicks(GameStateUtil.randomRange(5, 6));
        }

        if (Players.getLocal().getWorldLocation().equals(new WorldPoint(28636, 19851, 0))) {
            GameStateUtil.randomRange(new WorldPoint(32639, 32637, 0));
            Time.sleepTicks(4);
        }

        Widget widget1 = Widgets.get(13086, 138);
        if (widget1 != null) {
            Mouse.click(widget1.getClickPoint().getX(), widget1.getClickPoint().getY(), true);
            Time.sleepTicks(3);
        }

        Widget widget2 = Widgets.get(13086, 17);
        if (widget2 != null) {
            Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), true);
            Time.sleepTicks(3);
        }
    }
}
