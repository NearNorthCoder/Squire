package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

/**
 * Quest step handler for Demon Slayer quest.
 * This is a complex quest involving:
 * - Talking to Gypsy Aris to start
 * - Collecting silverlight keys from wizards
 * - Using keys on drains
 * - Fighting Delrith the demon
 */
public class DemonSlayerQuestStep implements QuestStep {

    // Item IDs
    public static final int BUCKET = 1925;
    public static final int BUCKET_OF_WATER = 1929;
    public static final int BONES = 526;
    public static final int SILVERLIGHT_KEY_1 = 2400;
    public static final int SILVERLIGHT_KEY_2 = 2401;
    public static final int SILVERLIGHT_KEY_3 = 2402;
    public static final int SILVERLIGHT = 2402;
    public static final int LOBSTER = 379;

    // Locations
    public static WorldPoint GYPSY_ARIS_LOCATION;
    public static WorldPoint WIZARD_TOWER_ENTRANCE;
    public static WorldPoint WIZARD_TOWER_KEY_LOCATION_1;
    public static WorldPoint WIZARD_TOWER_KEY_LOCATION_2;
    public static WorldPoint WIZARD_TOWER_KEY_LOCATION_3;
    public static WorldPoint DRAIN_LOCATION;
    public static WorldPoint DELRITH_BOSS_LOCATION;
    public static WorldPoint VARROCK_LOCATION;

    // Quest NPC names mapped by IDs
    private static final HashMap<Integer, String> WIZARD_NAMES = new DemonSlayerNpcNames();

    // Quest progression tracking
    public static List<ItemToBuy> itemsToBuy = new ArrayList<>();
    public static boolean shouldBuyItems = false;
    public static boolean hasAllKeys = false;
    private static int dialogAttempts = 0;
    private static boolean questStarted = false;

    // Dialog options
    public static String[] QUEST_DIALOG;
    public static String[] INCANTATION_ORDER;

    @Override
    public String getQuestName() {
        return "Demon Slayer quest";
    }

    @Override
    public int execute() {
        try {
            handleQuestStep();
        } catch (Exception e) {
            // Silently handle errors
        }
        return 86;
    }

    @Override
    public boolean shouldExecute() {
        return Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()) >= 4;
    }

    @Override
    public boolean isComplete() {
        return false;
    }

    /**
     * Main quest step handler.
     */
    public static void handleQuestStep() {
        // Handle item buying
        if (shouldBuyItems) {
            ItemBuyer.buyItems(itemsToBuy);
            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                shouldBuyItems = false;
            }
        }

        if (!shouldBuyItems) {
            // Check if we have all quest items at quest start
            if (!hasAllQuestItems() && !Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId())) {
                handleBankingForQuestStart();
            }

            // Handle stamina potions
            if (Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)
                && Movement.getRunEnergy() < 50) {
                Inventory.getFirst(StaminaPotionIds.STAMINA_POTIONS).interact("Drink");
                Time.sleepTicks(1);
            }

            // Handle food
            if (Inventory.contains(LOBSTER) && QuestVarbits.getCurrentHealth() < 55.0) {
                Inventory.getFirst(LOBSTER).interact("Eat");
            }

            // Handle quest stages
            handleQuestStages();

            DialogHandler.handleDialog(QUEST_DIALOG);
        }
    }

    /**
     * Handles different stages of the Demon Slayer quest.
     */
    private static void handleQuestStages() {
        int questStage = Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId());

        // Stage 0: Start quest with Gypsy Aris
        if (hasAllQuestItems() && !questStage) {
            if (Players.getLocal().getWorldLocation().distanceTo(GYPSY_ARIS_LOCATION) > 4
                && !Static.getClient().isInInstancedRegion()) {
                AccBuilderSotf.currentAction = "Nav to start";
                Movement.walkTo(GYPSY_ARIS_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(GYPSY_ARIS_LOCATION) <= 4) {
                DialogHandler.handleDialog("Gypsy Aris", QUEST_DIALOG);
            }
        }

        // Stage 1: Enter Wizard Tower
        if (questStage == 1) {
            WorldArea wizardTowerArea = new WorldArea(3103, 3158, 8, 9, 0);
            if (!wizardTowerArea.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.currentAction = "Nav to start";
                Movement.walkTo(WIZARD_TOWER_ENTRANCE);
                Time.sleepTicks(1);
            }

            if (wizardTowerArea.contains(Players.getLocal().getWorldLocation())) {
                DialogHandler.handleDialog("Traiborn", QUEST_DIALOG);
            }
        }

        // Stage 2: Collect keys from wizards
        if (questStage == 2) {
            dialogAttempts = 0;

            // Equip silverlight key if we have it
            if (!Inventory.contains(SILVERLIGHT_KEY_1)) {
                if (!Equipment.contains("Silverlight key") && !hasAllKeys) {
                    handleKeyCollection();
                }
            }

            // Handle keys that were found
            if (Inventory.contains(SILVERLIGHT_KEY_1) && !hasAllKeys) {
                handleDrainKeyInsertion();
            }

            // Check if we have all keys
            if (Inventory.contains(SILVERLIGHT_KEY_1)
                && Inventory.contains(SILVERLIGHT_KEY_2)) {
                hasAllKeys = true;
            }

            // Handle silverlight assembly
            if (hasAllKeys) {
                handleSilverlightAssembly();
            }
        }

        // Stage 3: Fight Delrith
        if (Equipment.contains("Silverlight")) {
            handleDelrithBossFight();
        }

        // Stage 4+: Final dialogue and quest completion
        if (questStage >= 4) {
            handleQuestCompletion();
        }
    }

    /**
     * Handles banking at quest start to get required items.
     */
    private static void handleBankingForQuestStart() {
        BankLocation nearestBank = BankLocation.getNearest();

        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentAction = "Nav to bank";
            BankHelper.walkToBank(nearestBank);
        }

        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            if (!Bank.isOpen()) {
                BankHelper.openBank();
                Time.sleepUntil(() -> Bank.isOpen(), 8000);
            }

            if (Bank.isOpen()) {
                AccBuilderSotf.currentAction = "Handling banking";

                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                }
                if (Equipment.getAll().size() > 0) {
                    Bank.depositEquipment();
                    Time.sleepTicks(2);
                }

                // Check for required items
                int[] requiredItems = {BUCKET, BUCKET_OF_WATER, BONES};
                if (!QuestVarbits.hasAllItems(requiredItems)) {
                    createBuyList();
                    System.out.println("We are missing quest supplies, switching to BUYING");
                    shouldBuyItems = true;
                    return;
                }

                // Check bucket of water quantity
                if (Bank.contains(BUCKET_OF_WATER)
                    && Bank.getFirst(BUCKET_OF_WATER).getQuantity() < 25) {
                    createBuyList();
                    System.out.println("Need more buckets of water");
                    shouldBuyItems = true;
                    return;
                }

                // Withdraw items
                if (QuestVarbits.hasAllItems(requiredItems)) {
                    // Equip ghostspeak amulet if needed
                    if (!Equipment.contains(StaminaPotionIds.STAMINA_POTIONS)
                        && !Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)) {
                        BankHelper.withdrawStaminaPotion(1);
                    }

                    if (Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)) {
                        Inventory.getFirst(StaminaPotionIds.STAMINA_POTIONS).interact("Wear");
                        Time.sleepTicks(3);
                    }

                    if (!Bank.isOpen()) {
                        BankHelper.openBank();
                        Time.sleepTicks(3);
                    }

                    BankHelper.withdrawItem(2347, 1);
                    BankHelper.withdrawItem(BONES, 1);
                    BankHelper.withdrawItem(BUCKET, 15);
                    BankHelper.withdrawItem(333, 20);
                }
            }
        }
    }

    /**
     * Handles collecting keys from wizards.
     */
    private static void handleKeyCollection() {
        if (!Inventory.contains("Wizard's key")) {
            if (Players.getLocal().getWorldLocation().distanceTo(WIZARD_TOWER_KEY_LOCATION_1) > 4) {
                AccBuilderSotf.currentAction = "Nav to key location";
                Movement.walkTo(WIZARD_TOWER_KEY_LOCATION_1);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(WIZARD_TOWER_KEY_LOCATION_1) <= 4) {
                // Use bucket on drain, use bones on key, etc.
                var wizardKey = Inventory.getFirst("Wizard's key");
                var drain = TileObjects.getNearest("Drain");
                if (wizardKey != null && drain != null) {
                    wizardKey.useOn(drain);
                    Time.sleepTicks(6);
                }
            }
        }
    }

    /**
     * Handles inserting keys into drains.
     */
    private static void handleDrainKeyInsertion() {
        if (!Inventory.contains("Captain's key")) {
            if (Players.getLocal().getWorldLocation().distanceTo(DRAIN_LOCATION) > 4) {
                AccBuilderSotf.currentAction = "Nav to drain";

                // Handle doors if needed
                var largeDoor = TileObjects.getNearest("Large door");
                if (largeDoor != null && largeDoor.hasAction("Open")) {
                    largeDoor.interact("Open");
                    Time.sleepTicks(2);
                }

                var door = TileObjects.getNearest("Door");
                if (door != null && door.hasAction("Open")) {
                    door.interact("Open");
                    Time.sleepTicks(2);
                }

                Movement.walkTo(DRAIN_LOCATION);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(DRAIN_LOCATION) <= 4) {
                var drain = TileObjects.getNearest("Drain");
                if (drain != null) {
                    drain.interact("Search");
                }
            }
        }
    }

    /**
     * Handles assembling silverlight sword.
     */
    private static void handleSilverlightAssembly() {
        if (!Equipment.contains("Silverlight")) {
            handleBankingForSilverlight();
        }

        if (Equipment.contains("Silverlight")) {
            // Quest will progress to boss fight
            AccBuilderSotf.currentAction = "Ready for boss fight";
        }
    }

    /**
     * Handles banking to assemble silverlight.
     */
    private static void handleBankingForSilverlight() {
        BankLocation nearestBank = BankLocation.getNearest();

        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentAction = "Nav to bank";
            BankHelper.walkToBank(nearestBank);
            Time.sleepTicks(3);
        }

        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            if (!Bank.isOpen()) {
                BankHelper.openBank();
                Time.sleepUntil(() -> Bank.isOpen(), 8000);
                Time.sleepTicks(3);
            }

            if (Bank.isOpen()) {
                AccBuilderSotf.currentAction = "Assembling silverlight";

                // Withdraw silverlight components and gear
                if (hasAllKeys) {
                    if (!Inventory.contains(SILVERLIGHT) && Inventory.getAll().size() > 0) {
                        Bank.depositInventory();
                        Time.sleepTicks(4);
                    }
                }

                if (Equipment.getAll().size() > 0) {
                    Bank.depositEquipment();
                    Time.sleepTicks(2);
                }

                if (hasAllKeys) {
                    if (Inventory.contains(SILVERLIGHT)) {
                        BankHelper.withdrawItem(2347, 1);
                        BankHelper.withdrawItem(BUCKET, 15);
                        BankHelper.withdrawItem(SILVERLIGHT, 1);
                        BankHelper.withdrawItem(SILVERLIGHT_KEY_1, 1);
                        BankHelper.withdrawItem(SILVERLIGHT_KEY_2, 1);
                        Time.sleepTicks(1);

                        if (!Inventory.contains(2347)) {
                            BankHelper.withdrawItem(556, 1);
                        }

                        BankHelper.withdrawItem(LOBSTER, Inventory.getFreeSlots() - 1);
                    }
                }

                if (hasAllKeys) {
                    if (!Inventory.contains(SILVERLIGHT)) {
                        if (!Equipment.contains(StaminaPotionIds.STAMINA_POTIONS)
                            && !Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)) {
                            BankHelper.withdrawStaminaPotion(1);
                        }

                        if (Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)) {
                            Inventory.getFirst(StaminaPotionIds.STAMINA_POTIONS).interact("Wear");
                            Time.sleepTicks(3);
                        }

                        if (!Bank.isOpen()) {
                            BankHelper.openBank();
                            Time.sleepTicks(6);
                        }

                        if (Bank.isOpen()) {
                            BankHelper.withdrawItem(2347, 1);
                            BankHelper.withdrawItem(BUCKET, 15);
                            BankHelper.withdrawItem(BUCKET_OF_WATER, 25);
                        }
                    }
                }
            }
        }
    }

    /**
     * Handles the boss fight with Delrith.
     */
    private static void handleDelrithBossFight() {
        // Generate incantation order if not done yet
        if (INCANTATION_ORDER == null
            || (!Vars.getBit(2561) && !Vars.getBit(2562))) {
            generateIncantationOrder();
        }

        // Find and attack Delrith
        var delrith = NPCs.getNearest(npc ->
            npc.getName().contains("Delrith")
            && npc.getInteracting() != Players.getLocal());

        if (delrith != null && Players.getLocal().getInteracting() == null) {
            delrith.interact("Attack");
            Time.sleepTicks(2);
        }

        // When Delrith is weakened, handle dialog
        if (delrith == null && Players.getLocal().getInteracting() == null) {
            var weakenedDelrith = NPCs.getNearest("Delrith");
            if (weakenedDelrith != null && !weakenedDelrith.isDead() && !Dialog.isOpen()) {
                weakenedDelrith.interact("Attack");
            }
        }

        // Handle incantation dialog
        if (Dialog.isOpen()) {
            AccBuilderSotf.currentAction = "Saying incantation";

            var options = Dialog.getOptions();
            if (!options.isEmpty()) {
                for (int i = 0; i < INCANTATION_ORDER.length; i++) {
                    String requiredText = INCANTATION_ORDER[i];

                    for (int j = 0; j < options.size(); j++) {
                        if (((Widget) options.get(j)).getText().contains(requiredText)) {
                            System.out.println("Selecting: " + ((Widget) options.get(j)).getText());
                            Time.sleepTicks(2);
                            Dialog.chooseOption(((Widget) options.get(j)).getText());
                            Time.sleepTicks(15);
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * Handles quest completion dialogue.
     */
    private static void handleQuestCompletion() {
        var gypsyAris = NPCs.getNearest("Gypsy Aris");
        if (gypsyAris != null) {
            if (dialogAttempts < 1 && !Dialog.isOpen()) {
                PlayerStats.incrementTotalXP();
                PlayerStats.saveStats(AccBuilderSotf.currentAccount);
                dialogAttempts += 1;
                PlayerStats.resetTotalXP();
                questStarted = true;
            }

            if (Dialog.isOpen()) {
                AccBuilderSotf.currentAction = "Finishing quest";

                var options = Dialog.getOptions();
                if (!options.isEmpty()) {
                    for (int i = 0; i < options.size(); i++) {
                        if (((Widget) options.get(i)).getText().contains("Delrith")) {
                            Dialog.chooseOption(((Widget) options.get(i)).getText());
                            Time.sleepTicks(2);
                            break;
                        }
                    }
                }
            }
        }

        DialogHandler.handleDialog(QUEST_DIALOG);
    }

    /**
     * Generates the incantation order based on varbits.
     */
    private static void generateIncantationOrder() {
        if (INCANTATION_ORDER != null
            || !Vars.getBit(2561) && !Vars.getBit(2562)) {
            return;
        }

        String[] incantation = new String[5];
        incantation[0] = WIZARD_NAMES.get(Vars.getBit(2561));
        incantation[1] = WIZARD_NAMES.get(Vars.getBit(2562));
        incantation[2] = WIZARD_NAMES.get(Vars.getBit(2563));
        incantation[3] = WIZARD_NAMES.get(Vars.getBit(2564));
        incantation[4] = WIZARD_NAMES.get(Vars.getBit(2565));
        INCANTATION_ORDER = incantation;

        String message = "Say the following in order: " + String.join(", ", INCANTATION_ORDER);
        System.out.println(message);
    }

    /**
     * Checks if player has all required quest items.
     */
    private static boolean hasAllQuestItems() {
        int[] requiredItems = {BUCKET, BONES};
        for (int itemId : requiredItems) {
            if (!Inventory.contains(itemId)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Creates a list of items to buy from the Grand Exchange.
     */
    private static void createBuyList() {
        if (!Bank.contains(BUCKET_OF_WATER)
            || (Bank.contains(BUCKET_OF_WATER)
                && Bank.getFirst(BUCKET_OF_WATER).getQuantity() < 25)) {
            itemsToBuy.add(new ItemToBuy(BUCKET_OF_WATER, 25, 32759));
        }

        if (!Bank.contains(BONES)) {
            itemsToBuy.add(new ItemToBuy(BONES, 1, 32759));
        }

        Predicate<net.runelite.api.Item> ringOfWealthPredicate = item ->
            item.getName().toLowerCase().contains("ring of wealth (");
        if (!Bank.contains(ringOfWealthPredicate)) {
            itemsToBuy.add(new ItemToBuy(28542, 6, 26555));
        }

        if (!Bank.contains(LOBSTER)
            || (Bank.contains(LOBSTER)
                && Bank.getFirst(LOBSTER).getQuantity() < 6)) {
            itemsToBuy.add(new ItemToBuy(LOBSTER, 15, 20560));
        }

        if (!Bank.contains(333)) {
            itemsToBuy.add(new ItemToBuy(333, 4, GEPriceHelper.COMMON_PRICE));
        }

        if (!Bank.contains(BUCKET)
            || (Bank.contains(BUCKET)
                && Bank.getFirst(BUCKET).getQuantity() < 30)) {
            itemsToBuy.add(new ItemToBuy(BUCKET, 40, 19932));
        }
    }
}
