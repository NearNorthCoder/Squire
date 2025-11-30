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
import gg.squire.sotf.framework.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Quest step for training melee combat skills to 75 Attack, 75 Strength, and 60 Defence.
 * This step handles equipment management, banking, purchasing supplies, and combat training at cows.
 * The training strategy involves progressive equipment upgrades and attack style rotation based on skill levels.
 */
public class MeleeTraining75Attack75Strength60DefenceQuestStep implements QuestStep {

    // Item IDs
    private static final int BRONZE_SCIMITAR = 1321;
    private static final int IRON_SCIMITAR = 1323;
    private static final int STEEL_SCIMITAR = 1325;
    private static final int MITHRIL_SCIMITAR = 1329;
    private static final int ADAMANT_SCIMITAR = 1331;
    private static final int RUNE_SCIMITAR = 1333;
    private static final int IRON_PLATEBODY = 1115;
    private static final int IRON_FULL_HELM = 1153;
    private static final int IRON_PLATELEGS = 1067;
    private static final int IRON_KITESHIELD = 1191;
    private static final int LEATHER_VAMBRACES = 1063;
    private static final int LEATHER_BOOTS = 1061;
    private static final int AMULET_OF_POWER = 1731;
    private static final int AMULET_OF_STRENGTH = 1725;
    private static final int COOKED_MEAT = 2142;

    // Skill level targets
    private static final int TARGET_ATTACK_LEVEL = 75;
    private static final int TARGET_STRENGTH_LEVEL = 75;
    private static final int TARGET_DEFENCE_LEVEL = 60;
    private static final int LEVEL_40 = 40;
    private static final int LEVEL_20 = 20;
    private static final int LEVEL_5 = 5;
    private static final int LEVEL_30 = 30;
    private static final int LEVEL_50 = 50;
    private static final int LEVEL_55 = 55;
    private static final int LEVEL_70 = 70;

    // World locations and areas
    public static WorldArea BANK_AREA;
    public static WorldArea COW_AREA;
    public static WorldArea LUMBRIDGE_AREA;
    public static WorldPoint BANK_LOCATION;
    public static WorldPoint COW_CENTER_LOCATION;
    public static WorldPoint LUMBRIDGE_LOCATION;

    // Equipment and supply lists
    public static int[] LOW_LEVEL_EQUIPMENT;
    public static int[] HIGH_LEVEL_EQUIPMENT;
    public static List<d> ITEMS_TO_BUY;
    public static boolean IS_BUYING_MODE;

    static {
        // Initialize buying list
        ITEMS_TO_BUY = new ArrayList<>();

        // Low level equipment (for < 75/75/60)
        LOW_LEVEL_EQUIPMENT = new int[]{
            BRONZE_SCIMITAR,
            IRON_SCIMITAR,
            IRON_FULL_HELM,
            IRON_PLATELEGS,
            IRON_PLATEBODY,
            IRON_KITESHIELD,
            LEATHER_VAMBRACES,
            LEATHER_BOOTS
        };

        // High level equipment (for 75/75/60)
        HIGH_LEVEL_EQUIPMENT = new int[]{
            RUNE_SCIMITAR,
            AMULET_OF_POWER,
            AMULET_OF_STRENGTH,
            ADAMANT_SCIMITAR,
            MITHRIL_SCIMITAR,
            STEEL_SCIMITAR,
            IRON_SCIMITAR,
            LEATHER_BOOTS,
            IRON_PLATEBODY
        };

        // Initialize world areas
        BANK_AREA = new WorldArea(3207, 3217, 9, 9, 2);
        COW_AREA = new WorldArea(3240, 3254, 19, 16, 0);
        LUMBRIDGE_AREA = new WorldArea(3230, 3207, 54, 30, 0);
        BANK_LOCATION = new WorldPoint(12621, 3215, 0);
        COW_CENTER_LOCATION = new WorldPoint(3255, 3217, 0);
        LUMBRIDGE_LOCATION = new WorldPoint(7046, 3199, 0);
    }

    /**
     * Gets the name/description of this quest step.
     *
     * @return The quest step name
     */
    @Override
    public String getName() {
        return "75/75/60 Melee";
    }

    /**
     * Checks if this quest step has been completed.
     *
     * @return false as this step is never auto-complete
     */
    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    /**
     * Checks if this quest step should be executed.
     * Returns true when Attack >= 75, Strength >= 75, and Defence >= 60.
     *
     * @return true if the skill requirements are met
     */
    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.ATTACK) >= TARGET_ATTACK_LEVEL
            && Skills.getLevel(Skill.STRENGTH) >= TARGET_ATTACK_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL;
    }

    /**
     * Main execution method for the quest step.
     * Handles all training logic including banking, equipment management, and combat.
     *
     * @return 0 on successful execution
     */
    @Override
    public int execute() {
        try {
            executeTrainingLoop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Main training loop that coordinates all training activities.
     */
    public static void executeTrainingLoop() {
        // Handle buying mode
        if (IS_BUYING_MODE) {
            AccBuilderSotf.c = "Buying items";
            b.a(ITEMS_TO_BUY);
            if (ITEMS_TO_BUY.size() < 1) {
                System.out.println("Finished buying items, switching back to melee training");
                IS_BUYING_MODE = false;
            }
        }

        // Check if we need to bank/prepare
        if (!IS_BUYING_MODE || (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL)) {

            if (!hasRequiredEquipment() && (Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL
                || Skills.getLevel(Skill.ATTACK) < TARGET_ATTACK_LEVEL
                || Skills.getLevel(Skill.STRENGTH) >= TARGET_ATTACK_LEVEL)) {

                BankLocation nearestBank = BankLocation.getNearest();

                // Navigate to bank if not there
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Navigating to bank";
                    a.a(nearestBank);
                }

                // Handle banking
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Handling banking";

                    // Open bank
                    if (!Bank.isOpen()) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), 4000);
                    }

                    if (Bank.isOpen()) {
                        // Deposit inventory
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(1);
                        }

                        // Deposit equipment
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check if we need to buy items
                        if (!hasBankSupplies()) {
                            setupBuyingList();
                            System.out.println("We are missing supplies, switching to BUYING");
                            IS_BUYING_MODE = true;
                            return;
                        }

                        // Withdraw appropriate equipment based on level
                        if (Skills.getLevel(Skill.ATTACK) < TARGET_DEFENCE_LEVEL
                            || (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
                                && Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL)) {
                            a.a(LOW_LEVEL_EQUIPMENT, 1);
                        }

                        if (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
                            && Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL
                            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL) {
                            a.a(HIGH_LEVEL_EQUIPMENT, 1);
                        }

                        // Withdraw supplies
                        a.a(11995, 6194);  // Unknown item IDs
                        a.b(f.ba, 1);
                        a.a(24400, 5);
                        a.a(21887, 100);
                    }
                }
            }

            // Handle equipment and combat
            if (hasRequiredEquipment()) {
                equipItems();

                // Enable run if needed
                if (Movement.getRunEnergy() >= 7 && !Movement.isRunEnabled()) {
                    Movement.toggleRun();
                }

                // Check if fully equipped
                if (!isFullyEquipped()) {
                    equipStoredItems();
                }

                // Handle eating
                if (GameStateUtil.getHealthPercentage() < 45.0) {
                    if (Inventory.contains(COOKED_MEAT)) {
                        Inventory.getFirst(COOKED_MEAT).interact("Eat");
                        Time.sleepTicks(1);
                    }
                }

                // Handle combat training at different locations based on level
                if ((Skills.getLevel(Skill.ATTACK) < LEVEL_20 && Skills.getLevel(Skill.ATTACK) >= LEVEL_5)
                    || (Skills.getLevel(Skill.STRENGTH) < LEVEL_20 && Skills.getLevel(Skill.STRENGTH) >= LEVEL_5)
                    || (Skills.getLevel(Skill.DEFENCE) < LEVEL_20 && Skills.getLevel(Skill.DEFENCE) >= LEVEL_20)) {
                    p.al();  // Train at chickens
                }

                if (Skills.getLevel(Skill.ATTACK) >= LEVEL_20 && Skills.getLevel(Skill.STRENGTH) >= LEVEL_20
                    && Skills.getLevel(Skill.DEFENCE) >= LEVEL_20
                    && ((Skills.getLevel(Skill.ATTACK) >= LEVEL_20 && Skills.getLevel(Skill.ATTACK) < TARGET_DEFENCE_LEVEL)
                        || (Skills.getLevel(Skill.STRENGTH) >= LEVEL_20 && Skills.getLevel(Skill.STRENGTH) < TARGET_DEFENCE_LEVEL)
                        || (Skills.getLevel(Skill.DEFENCE) >= LEVEL_20 && Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL))) {
                    l.aj();  // Train at minotaurs
                }
            }
        }

        // Final stage training at cows (for 75/75/60)
        if (Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
            && (Skills.getLevel(Skill.STRENGTH) >= TARGET_ATTACK_LEVEL
                && Skills.getLevel(Skill.ATTACK) < TARGET_ATTACK_LEVEL)) {

            r.aV();  // Some pre-cow setup

            if (!isFullyEquipped()) {
                equipStoredItems();
            }
        }
    }

    /**
     * Checks if the player has all required equipment in bank or inventory.
     *
     * @return true if all supplies are available
     */
    public static boolean hasBankSupplies() {
        // Check for high level equipment (75/75/60)
        if (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL) {

            return (!Equipment.contains(RUNE_SCIMITAR) || Inventory.contains(RUNE_SCIMITAR) || Bank.contains(RUNE_SCIMITAR))
                && (!Equipment.contains(ADAMANT_SCIMITAR) || Inventory.contains(ADAMANT_SCIMITAR) || Bank.contains(ADAMANT_SCIMITAR))
                && (!Equipment.contains(MITHRIL_SCIMITAR) || Inventory.contains(MITHRIL_SCIMITAR) || Bank.contains(MITHRIL_SCIMITAR))
                && (!Equipment.contains(AMULET_OF_STRENGTH) || Inventory.contains(AMULET_OF_STRENGTH) || Bank.contains(AMULET_OF_STRENGTH))
                && (!Equipment.contains(IRON_SCIMITAR) || Inventory.contains(IRON_SCIMITAR) || Bank.contains(IRON_SCIMITAR))
                && (!Equipment.contains(STEEL_SCIMITAR) || Inventory.contains(STEEL_SCIMITAR) || Bank.contains(STEEL_SCIMITAR))
                && (!Inventory.contains(AMULET_OF_POWER) || Equipment.contains(AMULET_OF_POWER) || Bank.contains(AMULET_OF_POWER))
                && (!Inventory.contains(LEATHER_BOOTS) || Equipment.contains(LEATHER_BOOTS) || Bank.contains(LEATHER_BOOTS))
                && Inventory.contains(COOKED_MEAT) && Bank.contains(COOKED_MEAT);
        }

        // Check for mid level equipment (20-60)
        if ((Skills.getLevel(Skill.ATTACK) >= LEVEL_20 && Skills.getLevel(Skill.ATTACK) < TARGET_DEFENCE_LEVEL)
            || (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL && Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL)) {

            return (!Equipment.contains(IRON_SCIMITAR) || Inventory.contains(IRON_SCIMITAR) || Bank.contains(IRON_SCIMITAR))
                && (!Equipment.contains(IRON_FULL_HELM) || Inventory.contains(IRON_FULL_HELM) || Bank.contains(IRON_FULL_HELM))
                && (!Equipment.contains(IRON_PLATELEGS) || Inventory.contains(IRON_PLATELEGS) || Bank.contains(IRON_PLATELEGS))
                && (!Equipment.contains(IRON_PLATEBODY) || Inventory.contains(IRON_PLATEBODY) || Bank.contains(IRON_PLATEBODY))
                && (!Equipment.contains(IRON_KITESHIELD) || Inventory.contains(IRON_KITESHIELD) || Bank.contains(IRON_KITESHIELD))
                && (!Inventory.contains(LEATHER_VAMBRACES) || Equipment.contains(LEATHER_VAMBRACES) || Bank.contains(LEATHER_VAMBRACES))
                && (!Inventory.contains(LEATHER_BOOTS) || Equipment.contains(LEATHER_BOOTS) || Bank.contains(LEATHER_BOOTS))
                && Inventory.contains(COOKED_MEAT) && Bank.contains(COOKED_MEAT);
        }

        // Check for low level equipment (< 20)
        return (!Equipment.contains(BRONZE_SCIMITAR) || Inventory.contains(BRONZE_SCIMITAR) || Bank.contains(BRONZE_SCIMITAR))
            && (!Equipment.contains(IRON_FULL_HELM) || Inventory.contains(IRON_FULL_HELM) || Bank.contains(IRON_FULL_HELM))
            && (!Equipment.contains(IRON_PLATELEGS) || Inventory.contains(IRON_PLATELEGS) || Bank.contains(IRON_PLATELEGS))
            && (!Equipment.contains(IRON_PLATEBODY) || Inventory.contains(IRON_PLATEBODY) || Bank.contains(IRON_PLATEBODY))
            && (!Equipment.contains(IRON_KITESHIELD) || Inventory.contains(IRON_KITESHIELD) || Bank.contains(IRON_KITESHIELD))
            && (!Inventory.contains(LEATHER_VAMBRACES) || Equipment.contains(LEATHER_VAMBRACES) || Bank.contains(LEATHER_VAMBRACES))
            && (!Inventory.contains(LEATHER_BOOTS) || Equipment.contains(LEATHER_BOOTS) || Bank.contains(LEATHER_BOOTS))
            && Inventory.contains(COOKED_MEAT) && Bank.contains(COOKED_MEAT);
    }

    /**
     * Checks if player has required equipment ready (in inventory or equipped).
     *
     * @return true if equipment is available
     */
    public static boolean hasRequiredEquipment() {
        // Check for high level equipment (75/75/60)
        if (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL) {

            return (!Equipment.contains(RUNE_SCIMITAR) || Inventory.contains(RUNE_SCIMITAR))
                && (!Equipment.contains(ADAMANT_SCIMITAR) || Inventory.contains(ADAMANT_SCIMITAR))
                && (!Equipment.contains(MITHRIL_SCIMITAR) || Inventory.contains(MITHRIL_SCIMITAR))
                && (!Equipment.contains(AMULET_OF_STRENGTH) || Inventory.contains(AMULET_OF_STRENGTH))
                && (!Equipment.contains(IRON_SCIMITAR) || Inventory.contains(IRON_SCIMITAR))
                && (!Equipment.contains(STEEL_SCIMITAR) || Inventory.contains(STEEL_SCIMITAR))
                && (!Inventory.contains(AMULET_OF_POWER) || Equipment.contains(AMULET_OF_POWER))
                && (!Inventory.contains(LEATHER_BOOTS) || Equipment.contains(LEATHER_BOOTS))
                && Inventory.contains(COOKED_MEAT);
        }

        // Check for mid level equipment (20-60)
        if ((Skills.getLevel(Skill.ATTACK) >= LEVEL_20 && Skills.getLevel(Skill.ATTACK) < TARGET_DEFENCE_LEVEL)
            || (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL && Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL)) {

            return (!Equipment.contains(IRON_SCIMITAR) || Inventory.contains(IRON_SCIMITAR))
                && (!Equipment.contains(IRON_FULL_HELM) || Inventory.contains(IRON_FULL_HELM))
                && (!Equipment.contains(IRON_PLATELEGS) || Inventory.contains(IRON_PLATELEGS))
                && (!Equipment.contains(IRON_PLATEBODY) || Inventory.contains(IRON_PLATEBODY))
                && (!Equipment.contains(IRON_KITESHIELD) || Inventory.contains(IRON_KITESHIELD))
                && (!Inventory.contains(LEATHER_VAMBRACES) || Equipment.contains(LEATHER_VAMBRACES))
                && (!Inventory.contains(LEATHER_BOOTS) || Equipment.contains(LEATHER_BOOTS))
                && Inventory.contains(COOKED_MEAT);
        }

        // Check for low level equipment (< 20)
        return (!Equipment.contains(BRONZE_SCIMITAR) || Inventory.contains(BRONZE_SCIMITAR))
            && (!Equipment.contains(IRON_FULL_HELM) || Inventory.contains(IRON_FULL_HELM))
            && (!Equipment.contains(IRON_PLATELEGS) || Inventory.contains(IRON_PLATELEGS))
            && (!Equipment.contains(IRON_PLATEBODY) || Inventory.contains(IRON_PLATEBODY))
            && (!Equipment.contains(IRON_KITESHIELD) || Inventory.contains(IRON_KITESHIELD))
            && (!Inventory.contains(LEATHER_VAMBRACES) || Equipment.contains(LEATHER_VAMBRACES))
            && (!Inventory.contains(LEATHER_BOOTS) || Equipment.contains(LEATHER_BOOTS))
            && Inventory.contains(COOKED_MEAT);
    }

    /**
     * Equips items from inventory based on current skill levels.
     */
    public static void equipItems() {
        // Enable auto-retaliate
        if (Static.getClient().getVar(172) == 1) {
            Static.getClient().invokeMenuAction("Auto retaliate", "", 1, MenuAction.CC_OP.getId(), -1, 10485858);
        }

        // Equip high level gear (75/75/60)
        if (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL) {

            e.l(RUNE_SCIMITAR);
            e.l(AMULET_OF_POWER);
            e.l(AMULET_OF_STRENGTH);
            e.l(ADAMANT_SCIMITAR);
            e.l(MITHRIL_SCIMITAR);
            e.l(STEEL_SCIMITAR);
            e.l(IRON_SCIMITAR);
            e.l(IRON_PLATEBODY);
        }

        // Equip scimitars based on Attack level
        if (Skills.getLevel(Skill.ATTACK) < LEVEL_5) {
            if (Inventory.contains("Iron scimitar")) {
                Inventory.getFirst("Iron scimitar").interact("Wield");
            }
        }

        if (Skills.getLevel(Skill.ATTACK) >= LEVEL_5 && Skills.getLevel(Skill.ATTACK) < LEVEL_20) {
            if (Inventory.contains("Steel scimitar")) {
                Inventory.getFirst("Steel scimitar").interact("Wield");
            }
        }

        if (Skills.getLevel(Skill.ATTACK) >= LEVEL_20 && Skills.getLevel(Skill.ATTACK) < LEVEL_30) {
            if (Inventory.contains("Mithril scimitar")) {
                Inventory.getFirst("Mithril scimitar").interact("Wield");
            }
        }

        if (Skills.getLevel(Skill.ATTACK) >= LEVEL_30 && Skills.getLevel(Skill.ATTACK) < LEVEL_40) {
            if (Inventory.contains(BRONZE_SCIMITAR)) {
                Inventory.getFirst(BRONZE_SCIMITAR).interact("Wield");
            }
        }

        if (Skills.getLevel(Skill.ATTACK) >= LEVEL_40) {
            if (Inventory.contains(IRON_SCIMITAR)) {
                Inventory.getFirst(IRON_SCIMITAR).interact("Wield");
            }
        }

        // Equip armor based on Defence level
        if (Skills.getLevel(Skill.DEFENCE) >= LEVEL_30) {
            if (Inventory.contains(IRON_PLATEBODY)) {
                Inventory.getFirst(IRON_PLATEBODY).interact("Wear");
            }
            if (Inventory.contains(IRON_FULL_HELM)) {
                Inventory.getFirst(IRON_FULL_HELM).interact("Wear");
            }
            if (Inventory.contains(IRON_PLATELEGS)) {
                Inventory.getFirst(IRON_PLATELEGS).interact("Wear");
            }
            if (Inventory.contains(IRON_KITESHIELD)) {
                Inventory.getFirst(IRON_KITESHIELD).interact("Wear");
            }
        }

        // Equip accessories
        if (Inventory.contains(LEATHER_VAMBRACES)) {
            Inventory.getFirst(LEATHER_VAMBRACES).interact("Wear");
        }
        if (Inventory.contains(LEATHER_BOOTS)) {
            Inventory.getFirst(LEATHER_BOOTS).interact("Wear");
        }
    }

    /**
     * Checks if player is fully equipped with the right gear.
     *
     * @return true if all equipment slots are filled appropriately
     */
    private static boolean isFullyEquipped() {
        // Check high level equipment (75/75/60)
        if (Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
            && (Skills.getLevel(Skill.STRENGTH) >= TARGET_ATTACK_LEVEL
                && Skills.getLevel(Skill.ATTACK) < TARGET_ATTACK_LEVEL)) {

            return Equipment.contains("Iron scimitar")
                && Equipment.contains("Steel scimitar")
                && Equipment.contains("Mithril scimitar")
                && Equipment.contains(BRONZE_SCIMITAR)
                && Equipment.contains(IRON_SCIMITAR)
                && Equipment.contains(RUNE_SCIMITAR);
        }

        // Check mid-low level equipment
        return Equipment.contains("Iron scimitar")
            && Equipment.contains("Steel scimitar")
            && Equipment.contains("Mithril scimitar")
            && Equipment.contains(BRONZE_SCIMITAR)
            && Equipment.contains(IRON_SCIMITAR)
            && Equipment.contains(RUNE_SCIMITAR);
    }

    /**
     * Equips items that are currently in inventory.
     */
    private static void equipStoredItems() {
        setAttackStyle();

        if (GameStateUtil.getHealthPercentage() < 45.0) {
            if (Inventory.contains(COOKED_MEAT)) {
                Inventory.getFirst(COOKED_MEAT).interact("Eat");
                Time.sleepTicks(1);
            }
        }
    }

    /**
     * Sets the appropriate attack style based on current skill levels.
     * Rotates between Strength, Attack, and Defence training.
     */
    public static void setAttackStyle() {
        // Training priority: Strength -> Attack -> Defence

        // Below level 5: Train Strength
        if (Skills.getLevel(Skill.STRENGTH) < LEVEL_5) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }

        // Strength at 5, Attack below 5: Train Attack
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_5 && Skills.getLevel(Skill.ATTACK) < LEVEL_5) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }

        // Both at 5, Defence below 5: Train Defence
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_5 && Skills.getLevel(Skill.ATTACK) >= LEVEL_5
            && Skills.getLevel(Skill.DEFENCE) < LEVEL_5) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }

        // Defence at 5, Strength below 20: Train Strength
        if (Skills.getLevel(Skill.STRENGTH) < LEVEL_20 && Skills.getLevel(Skill.ATTACK) >= LEVEL_5
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_5) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }

        // Strength at 20, Attack below 20: Train Attack
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_20 && Skills.getLevel(Skill.ATTACK) < LEVEL_20
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_5) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }

        // Both at 20, Defence below 20: Train Defence
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_20 && Skills.getLevel(Skill.ATTACK) >= LEVEL_20
            && Skills.getLevel(Skill.DEFENCE) < LEVEL_20) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }

        // Defence at 20, Strength below 30: Train Strength
        if (Skills.getLevel(Skill.STRENGTH) < LEVEL_30 && Skills.getLevel(Skill.ATTACK) >= LEVEL_20
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_20) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }

        // Strength at 30, Attack below 30: Train Attack
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_30 && Skills.getLevel(Skill.ATTACK) < LEVEL_30
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_20) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }

        // Both at 30, Defence below 30: Train Defence
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_30 && Skills.getLevel(Skill.ATTACK) >= LEVEL_30
            && Skills.getLevel(Skill.DEFENCE) < LEVEL_30
            && Combat.getAttackStyle() != Combat.AttackStyle.FOURTH) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }

        // Defence at 30, Strength below 40: Train Strength
        if (Skills.getLevel(Skill.STRENGTH) < LEVEL_40 && Skills.getLevel(Skill.ATTACK) >= LEVEL_30
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_30
            && Combat.getAttackStyle() != Combat.AttackStyle.SECOND) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }

        // Strength at 40, Attack below 40: Train Attack
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_40 && Skills.getLevel(Skill.ATTACK) < LEVEL_40
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_30
            && Combat.getAttackStyle() != Combat.AttackStyle.FIRST) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }

        // Both at 40, Defence below 40: Train Defence
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_40 && Skills.getLevel(Skill.ATTACK) >= LEVEL_40
            && Skills.getLevel(Skill.DEFENCE) < LEVEL_40
            && Combat.getAttackStyle() != Combat.AttackStyle.FOURTH) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }

        // Defence at 40, Strength below 50: Train Strength
        if (Skills.getLevel(Skill.STRENGTH) < LEVEL_50 && Skills.getLevel(Skill.ATTACK) >= LEVEL_40
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_40
            && Combat.getAttackStyle() != Combat.AttackStyle.SECOND) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }

        // Strength at 50, Attack below 50: Train Attack
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_50 && Skills.getLevel(Skill.ATTACK) < LEVEL_50
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_40
            && Combat.getAttackStyle() != Combat.AttackStyle.FIRST) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }

        // Both at 50, Defence below 50: Train Defence
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_50 && Skills.getLevel(Skill.ATTACK) >= LEVEL_50
            && Skills.getLevel(Skill.DEFENCE) < LEVEL_50
            && Combat.getAttackStyle() != Combat.AttackStyle.FOURTH) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }

        // Defence at 50, Strength below 60: Train Strength
        if (Skills.getLevel(Skill.STRENGTH) < TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.ATTACK) >= LEVEL_50
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_50
            && Combat.getAttackStyle() != Combat.AttackStyle.SECOND) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }

        // Strength at 60, Attack below 60: Train Attack
        if (Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.ATTACK) < TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= LEVEL_50
            && Combat.getAttackStyle() != Combat.AttackStyle.FIRST) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }

        // Both at 60, Defence below 60: Train Defence
        if (Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL
            && Combat.getAttackStyle() != Combat.AttackStyle.FOURTH) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }

        // Defence at 60, Strength below 70: Train Strength
        if (Skills.getLevel(Skill.STRENGTH) < LEVEL_70
            && Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL
            && Combat.getAttackStyle() != Combat.AttackStyle.SECOND) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }

        // Strength at 70, Attack below 70: Train Attack
        if (Skills.getLevel(Skill.STRENGTH) >= LEVEL_70
            && Skills.getLevel(Skill.ATTACK) < LEVEL_70
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL
            && Combat.getAttackStyle() != Combat.AttackStyle.FIRST) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }

        // Defence at 60, Strength below 75: Train Strength
        if (Skills.getLevel(Skill.STRENGTH) < TARGET_ATTACK_LEVEL
            && Skills.getLevel(Skill.ATTACK) >= LEVEL_70
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL
            && Combat.getAttackStyle() != Combat.AttackStyle.SECOND) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }

        // Strength at 75, Attack below 75: Train Attack
        if (Skills.getLevel(Skill.STRENGTH) >= TARGET_ATTACK_LEVEL
            && Skills.getLevel(Skill.ATTACK) < TARGET_ATTACK_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL
            && Combat.getAttackStyle() != Combat.AttackStyle.FIRST) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
    }

    /**
     * Handles walking to cow area and attacking cows for training.
     */
    public static void trainAtCows() {
        // Walk to cow area if not there
        if (!COW_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Walking to cow area";
            Movement.walkTo(COW_CENTER_LOCATION);
            Time.sleepTicks(1);
        }

        // Attack cows
        if (COW_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Killing cows";

            if (Players.getLocal().getInteracting() == null) {
                // Find nearest available cow
                NPC nearestCow = NPCs.getNearest(npc ->
                    npc.getName().contains("Cow")
                    && npc.getInteracting() == null
                    && !npc.isDead()
                );

                // Check for cows attacking us
                List<NPC> aggressiveCows = NPCs.getAll("Cow", "cow").stream()
                    .filter(npc -> npc.getInteracting() == Players.getLocal())
                    .collect(Collectors.toList());

                // Attack aggressive cows first
                if (!aggressiveCows.isEmpty()) {
                    aggressiveCows.get(0).interact("Attack");
                    Time.sleepTicks(2);
                }

                // Attack nearest cow if not moving and no aggressive cows
                if (nearestCow != null && !Players.getLocal().isMoving() && aggressiveCows.isEmpty()) {
                    nearestCow.interact("Attack");
                    Time.sleepTicks(2);
                }
            }

            // Wait while in combat
            if (Players.getLocal().getInteracting() != null) {
                Time.sleepTicks(4);
            }
        }
    }

    /**
     * Sets up the buying list with all required items that are missing from the bank.
     */
    public static void setupBuyingList() {
        // Check and add basic supplies
        if (!Bank.contains(24400)) {
            ITEMS_TO_BUY.add(new ShopItem(24400, 40, 19094));
        }
        if (!Bank.contains(24442)) {
            ITEMS_TO_BUY.add(new ShopItem(24442, 5, 19094));
        }
        if (!Bank.contains(LEATHER_BOOTS)) {
            ITEMS_TO_BUY.add(new ShopItem(LEATHER_BOOTS, 1, 43016));
        }
        if (!Bank.contains(LEATHER_VAMBRACES)) {
            ITEMS_TO_BUY.add(new ShopItem(LEATHER_VAMBRACES, 1, 25579));
        }
        if (!Bank.contains(COOKED_MEAT)) {
            ITEMS_TO_BUY.add(new ShopItem(COOKED_MEAT, 100, 24560));
        }

        // Check and add armor for low-mid levels
        if ((Skills.getLevel(Skill.ATTACK) >= LEVEL_20 && Skills.getLevel(Skill.ATTACK) < TARGET_DEFENCE_LEVEL)
            || (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL && Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL)) {

            if (!Bank.contains(IRON_PLATEBODY)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_PLATEBODY, 1, 32476));
            }
            if (!Bank.contains(IRON_PLATELEGS)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_PLATELEGS, 1, 32476));
            }
            if (!Bank.contains(IRON_KITESHIELD)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_KITESHIELD, 1, 32476));
            }
            if (!Bank.contains(IRON_FULL_HELM)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_FULL_HELM, 1, 32476));
            }
        }

        // Check and add armor for high levels (60+ Defence)
        if (Skills.getLevel(Skill.DEFENCE) < TARGET_DEFENCE_LEVEL && Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL) {
            if (!Bank.contains(IRON_PLATEBODY)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_PLATEBODY, 1, 32476));
            }
            if (!Bank.contains(IRON_PLATELEGS)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_PLATELEGS, 1, 32476));
            }
            if (!Bank.contains(IRON_KITESHIELD)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_KITESHIELD, 1, 32476));
            }
            if (!Bank.contains(IRON_FULL_HELM)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_FULL_HELM, 1, 32476));
            }
        }

        // Check and add high level equipment (75/75/60)
        if (Skills.getLevel(Skill.ATTACK) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.DEFENCE) >= TARGET_DEFENCE_LEVEL
            && Skills.getLevel(Skill.STRENGTH) >= TARGET_DEFENCE_LEVEL) {

            if (!Bank.contains(RUNE_SCIMITAR)) {
                ITEMS_TO_BUY.add(new ShopItem(RUNE_SCIMITAR, 1, GameStateUtil.randomRange(61420, 637433)));
            }
            if (!Bank.contains(IRON_PLATEBODY)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_PLATEBODY, 1, GameStateUtil.randomRange(174008, 187386)));
            }
            if (!Bank.contains(STEEL_SCIMITAR)) {
                ITEMS_TO_BUY.add(new ShopItem(STEEL_SCIMITAR, 1, GameStateUtil.randomRange(515992, 950239)));
            }
            if (!Bank.contains(AMULET_OF_STRENGTH)) {
                ITEMS_TO_BUY.add(new ShopItem(AMULET_OF_STRENGTH, 1, GameStateUtil.randomRange(515992, 950239)));
            }
            if (!Bank.contains(ADAMANT_SCIMITAR)) {
                ITEMS_TO_BUY.add(new ShopItem(ADAMANT_SCIMITAR, 1, GameStateUtil.randomRange(1490880, 1503231)));
            }
            if (!Bank.contains(MITHRIL_SCIMITAR)) {
                ITEMS_TO_BUY.add(new ShopItem(MITHRIL_SCIMITAR, 1, GameStateUtil.randomRange(1118192, 1259221)));
            }
            if (!Bank.contains(IRON_SCIMITAR)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_SCIMITAR, 1, GameStateUtil.randomRange(700340, 719860)));
            }
            if (!Bank.contains(AMULET_OF_POWER)) {
                ITEMS_TO_BUY.add(new ShopItem(AMULET_OF_POWER, 1, GameStateUtil.randomRange(3047410, 3063794)));
            }
        }

        // Check and add weapons for high attack levels
        if (Skills.getLevel(Skill.ATTACK) >= LEVEL_40) {
            if (!Bank.contains(IRON_SCIMITAR)) {
                ITEMS_TO_BUY.add(new ShopItem(IRON_SCIMITAR, 1, 25579));
            }
        }

        // Check and add weapons for mid attack levels
        if (!Bank.contains(BRONZE_SCIMITAR)
            && Skills.getLevel(Skill.ATTACK) < LEVEL_40
            && Skills.getLevel(Skill.ATTACK) >= LEVEL_30) {
            ITEMS_TO_BUY.add(new ShopItem(BRONZE_SCIMITAR, 1, 32476));
        }
    }
}
