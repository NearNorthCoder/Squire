package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Training step handler for Combat (melee) skills in SOTF plugin.
 * Handles melee combat training from level 1 to 40+ in Defence.
 * Trains at Sand Crabs with progressive weapon and armor upgrades.
 */
public class CombatStep implements QuestStep {

    // Training areas
    public static WorldArea SAND_CRAB_AREA_1;
    public static WorldArea SAND_CRAB_AREA_2;
    public static WorldArea SAND_CRAB_AREA_3;
    public static WorldPoint RESET_POINT;
    public static WorldPoint CRAB_SPOT_1;
    public static WorldPoint CRAB_SPOT_2;

    // Weapon item IDs
    private static final int IRON_SCIMITAR = 1323;
    private static final int MITHRIL_SCIMITAR = 1329;
    private static final int ADAMANT_SCIMITAR = 1331;
    private static final int RUNE_SCIMITAR = 1333;

    // Armor item IDs (various tier equipment)
    private static final int[] COMBAT_EQUIPMENT = {
        30121, // Iron armor piece
        30125, // Mithril armor piece
        19982, // Adamant armor piece
        19984, // Rune armor piece
        30132, // Additional armor
        30108, // Additional armor
        19987, // Additional armor
        14923  // Food (Lobster)
    };

    // Training targets
    private static final int LEVEL_IRON_SCIM = 5;
    private static final int LEVEL_MITHRIL_SCIM = 20;
    private static final int LEVEL_ADAMANT_SCIM = 30;
    private static final int LEVEL_RUNE_SCIM = 40;
    private static final int TARGET_DEFENCE_LEVEL = 40;

    // State management
    public static boolean needsBuying = false;
    public static List<ShoppingItem> shoppingList = new ArrayList<>();

    static {
        // Initialize training areas (Sand Crabs)
        SAND_CRAB_AREA_1 = new WorldArea(24608, 24832, 11, 11, 0);
        SAND_CRAB_AREA_2 = new WorldArea(24608, 24848, 20, 16, 0);
        SAND_CRAB_AREA_3 = new WorldArea(24608, 19456, 23, 30, 0);

        RESET_POINT = new WorldPoint(32252, 24704, 0);
        CRAB_SPOT_1 = new WorldPoint(32383, 24832, 0);
        CRAB_SPOT_2 = new WorldPoint(24064, 3680, 0);
    }

    @Override
    public String getStepName() {
        return "Combat";
    }

    @Override
    public boolean shouldExecute() {
        return false; // Managed by plugin
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL;
    }

    @Override
    public int execute() {
        try {
            handleCombatTraining();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Main combat training handler
     */
    public static void handleCombatTraining() {
        // Handle shopping mode
        if (needsBuying) {
            AccBuilderSotf.currentStatus = "Buying items";
            ShoppingHelper.buyItems(shoppingList);
            if (shoppingList.size() < 1) {
                System.out.println("Finished buying items, switching back to melee training");
                needsBuying = false;
            }
        }

        if (needsBuying || Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL) {
            return;
        }

        // Set attack style to defensive
        setAttackStyle();

        // Banking phase
        if (!hasRequiredEquipment()) {
            BankLocation bank = BankLocation.getNearest();

            if (bank != null && !bank.getArea().contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.currentStatus = "Navigating to bank";
                NavigationHelper.walkTo(bank);
            }

            if (bank != null && bank.getArea().contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.currentStatus = "Handling banking";

                if (!Bank.isOpen()) {
                    BankHelper.openBank();
                    Time.sleepUntil(() -> Bank.isOpen(), 3000);
                }

                if (Bank.isOpen()) {
                    // Deposit inventory
                    if (Inventory.getAll().size() > 0) {
                        Bank.depositInventory();
                        Time.sleepTicks(4);
                    }

                    // Check if we have required items in bank
                    if (!hasRequiredItemsInBank()) {
                        checkMissingItems();
                        System.out.println("We are missing supplies, switching to BUYING");
                        needsBuying = true;
                        return;
                    }

                    // Withdraw equipment and food
                    withdrawCombatGear();
                }
            }
        }

        // Equip gear before combat
        if (hasRequiredEquipment()) {
            if (Bank.isOpen()) {
                Bank.close();
            }

            equipGear();
        }

        // Combat phase at Sand Crabs
        trainAtSandCrabs();
    }

    /**
     * Handles combat training at Sand Crabs
     */
    private static void trainAtSandCrabs() {
        // Move away from area to reset aggro
        if (SAND_CRAB_AREA_2.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentStatus = "Resetting aggro";
            Movement.walkTo(CRAB_SPOT_1);
            Time.sleepTicks(1);
        }

        // Fight Sand Crabs
        if (SAND_CRAB_AREA_2.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentStatus = "Fighting crabs";

            if (Players.getLocal().getInteracting() == null) {
                // Find a Sand Crab to attack
                NPC sandCrab = NPCs.getNearest(npc ->
                    npc.getName().contains("Sand Crab")
                    && npc.getInteracting() == null
                    && !npc.isDead()
                );

                // Check if being attacked by other NPCs
                List<NPC> attackers = NPCs.getAll("Rock", "Sand Crab")
                    .stream()
                    .filter(npc -> npc.getInteracting() == Players.getLocal())
                    .collect(Collectors.toList());

                if (!attackers.isEmpty()) {
                    attackers.get(0).interact("Attack");
                    Time.sleepTicks(2);
                }

                if (sandCrab != null && !Players.getLocal().isMoving() && attackers.isEmpty()) {
                    sandCrab.interact("Attack");
                    Time.sleepTicks(2);
                }
            }

            if (Players.getLocal().getInteracting() != null) {
                Time.sleepTicks(4);
            }
        }
    }

    /**
     * Sets attack style to defensive (for Defence training)
     */
    private static void setAttackStyle() {
        if (Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    /**
     * Equips combat gear from inventory
     */
    private static void equipGear() {
        // Enable auto-retaliate
        if (Static.getClient().getVar(172) == 1) {
            Static.getClient().invokeMenuAction("Auto retaliate", "Combat Options", 1,
                MenuAction.CC_OP.getId(), -1, 38862901);
        }

        // Equip weapon based on level
        int attackLevel = Skills.getLevel(Skill.ATTACK);

        if (attackLevel < LEVEL_IRON_SCIM) {
            equipItem("Iron scimitar", "Wield");
        } else if (attackLevel >= LEVEL_IRON_SCIM && attackLevel < LEVEL_MITHRIL_SCIM) {
            equipItem("Mithril scimitar", "Wield");
        } else if (attackLevel >= LEVEL_MITHRIL_SCIM && attackLevel < LEVEL_ADAMANT_SCIM) {
            equipItem("Adamant scimitar", "Wield");
        } else if (attackLevel >= LEVEL_ADAMANT_SCIM && attackLevel < TARGET_DEFENCE_LEVEL) {
            equipItem(IRON_SCIMITAR, "Wield");
        } else if (attackLevel >= TARGET_DEFENCE_LEVEL) {
            equipItem(RUNE_SCIMITAR, "Wield");
        }

        // Equip armor pieces
        if (Skills.getLevel(Skill.DEFENCE) >= LEVEL_ADAMANT_SCIM) {
            equipAllArmorPieces();
        }

        // Equip boots, gloves, etc.
        equipMiscGear();
    }

    /**
     * Equips all armor pieces
     */
    private static void equipAllArmorPieces() {
        for (int armorId : COMBAT_EQUIPMENT) {
            if (Inventory.contains(armorId)) {
                Inventory.getFirst(armorId).interact("Wear");
            }
        }
    }

    /**
     * Equips miscellaneous gear (boots, gloves, etc.)
     */
    private static void equipMiscGear() {
        equipItemIfPresent(19987, "Wear");
        equipItemIfPresent(14923, "Wear");
    }

    /**
     * Equips an item if present in inventory
     */
    private static void equipItemIfPresent(int itemId, String action) {
        if (Inventory.contains(itemId)) {
            Inventory.getFirst(itemId).interact(action);
        }
    }

    /**
     * Equips an item by name if present in inventory
     */
    private static void equipItem(String itemName, String action) {
        if (Inventory.contains(itemName)) {
            Inventory.getFirst(itemName).interact(action);
        }
    }

    /**
     * Equips an item by ID
     */
    private static void equipItem(int itemId, String action) {
        if (Inventory.contains(itemId)) {
            Inventory.getFirst(itemId).interact(action);
        }
    }

    /**
     * Withdraws combat gear from bank
     */
    private static void withdrawCombatGear() {
        for (int itemId : COMBAT_EQUIPMENT) {
            if (Bank.contains(itemId)) {
                Bank.withdraw(itemId, 1, Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(1);
            }
        }
    }

    /**
     * Checks if player has required equipment
     */
    private static boolean hasRequiredEquipment() {
        int attackLevel = Skills.getLevel(Skill.ATTACK);

        // Check weapon
        if (attackLevel >= TARGET_DEFENCE_LEVEL) {
            return (Equipment.contains(RUNE_SCIMITAR) || Inventory.contains(RUNE_SCIMITAR))
                && hasArmorEquipped();
        } else if (attackLevel >= LEVEL_ADAMANT_SCIM) {
            return (Equipment.contains(IRON_SCIMITAR) || Inventory.contains(IRON_SCIMITAR))
                && hasArmorEquipped();
        } else {
            return (Equipment.contains(IRON_SCIMITAR) || Inventory.contains(IRON_SCIMITAR))
                && Inventory.contains(14923);
        }
    }

    /**
     * Checks if armor is equipped
     */
    private static boolean hasArmorEquipped() {
        return Equipment.contains(30121)
            || Equipment.contains(30125)
            || Equipment.contains(19982);
    }

    /**
     * Checks if required items are in bank
     */
    private static boolean hasRequiredItemsInBank() {
        return Bank.contains(COMBAT_EQUIPMENT);
    }

    /**
     * Checks which items are missing and adds to shopping list
     */
    private static void checkMissingItems() {
        shoppingList.clear();

        if (!Bank.contains(24672)) {
            shoppingList.add(new ShoppingItem(24672, 142, 12961));
        }

        if (!Bank.contains(19975)) {
            shoppingList.add(new ShoppingItem(19975, 5, 12961));
        }

        if (!Bank.contains(14923)) {
            shoppingList.add(new ShoppingItem(14923, 1, 12675));
        }

        if (!Bank.contains(19984)) {
            shoppingList.add(new ShoppingItem(19984, 1, 12480));
        }

        if (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL) {
            if (!Bank.contains(RUNE_SCIMITAR)) {
                shoppingList.add(new ShoppingItem(RUNE_SCIMITAR, 1, 12480));
            }
        }

        if (!Bank.contains(IRON_SCIMITAR)) {
            shoppingList.add(new ShoppingItem(IRON_SCIMITAR, 1, 32512));
        }
    }
}
