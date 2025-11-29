package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
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
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
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
import net.unethicalite.client.Static;

/**
 * Vanstrom Klause Boss Fight Handler
 *
 * This class manages the final boss fight of the Sins of the Father quest.
 * Vanstrom Klause is a powerful vampyre boss with multiple phases and mechanics:
 *
 * <h2>Boss Mechanics:</h2>
 * <ul>
 *   <li><b>Lightning Phase:</b> Vanstrom creates lightning strikes that must be dodged.
 *       The bot must move between safe spots to avoid taking massive damage.</li>
 *   <li><b>Blood Orb Phase:</b> Blood orbs spawn that need to be destroyed or avoided.
 *       Failing to handle them properly can result in the fight becoming much harder.</li>
 *   <li><b>Darkness Phase:</b> The arena becomes dark and the player must navigate using
 *       specific safe tiles while continuing to attack the boss.</li>
 *   <li><b>Final Phase:</b> All mechanics combined with increased boss damage output.</li>
 * </ul>
 *
 * <h2>Equipment Requirements:</h2>
 * <ul>
 *   <li>Blisterwood flail (required to damage Vanstrom)</li>
 *   <li>Dragonhide armor or better (recommended for ranged defense)</li>
 *   <li>Ruby bracelet (for special attack)</li>
 *   <li>Combat boosting potions (super attack, super strength)</li>
 * </ul>
 *
 * <h2>Inventory Setup:</h2>
 * <ul>
 *   <li>15+ Sharks or better food</li>
 *   <li>3-4 Prayer potions</li>
 *   <li>2-3 Super attack potions</li>
 *   <li>2-3 Super strength potions</li>
 *   <li>Stamina potion (optional)</li>
 *   <li>Blisterwood flail</li>
 * </ul>
 *
 * @author Squire Bot Framework
 * @version 1.0
 */
public class VanstromKlauseFight {

    // NPC IDs
    private static final int VANSTROM_KLAUSE_ID = 9573;
    private static final int VANSTROM_KLAUSE_PHASE2_ID = 9574;
    private static final int VANSTROM_KLAUSE_PHASE3_ID = 9575;
    private static final int BLOOD_ORB_ID = 9576;
    private static final int MUTATED_BLOODVELD_ID = 9577;

    // Item IDs
    private static final int BLISTERWOOD_FLAIL = 22446;
    private static final int BLISTERWOOD_SICKLE = 22444;
    private static final int SHARK = 385;
    private static final int PRAYER_POTION_4 = 2434;
    private static final int PRAYER_POTION_3 = 139;
    private static final int PRAYER_POTION_2 = 141;
    private static final int PRAYER_POTION_1 = 143;
    private static final int SUPER_ATTACK_4 = 2436;
    private static final int SUPER_ATTACK_3 = 145;
    private static final int SUPER_ATTACK_2 = 147;
    private static final int SUPER_ATTACK_1 = 149;
    private static final int SUPER_STRENGTH_4 = 2440;
    private static final int SUPER_STRENGTH_3 = 157;
    private static final int SUPER_STRENGTH_2 = 159;
    private static final int SUPER_STRENGTH_1 = 161;
    private static final int STAMINA_POTION_4 = 12625;
    private static final int RUBY_BRACELET = 11128;
    private static final int DRAGONHIDE_BODY = 2501;
    private static final int DRAGONHIDE_CHAPS = 2503;
    private static final int DRAGONHIDE_VAMBRACES = 2487;

    // Animation IDs
    private static final int VANSTROM_LIGHTNING_ANIMATION = 8241;
    private static final int VANSTROM_DARKNESS_ANIMATION = 8242;
    private static final int VANSTROM_BLOOD_ORB_ANIMATION = 8243;

    // Fight arena coordinates (Arboretum)
    private static final WorldPoint FIGHT_CENTER = new WorldPoint(3693, 3259, 0);
    private static final WorldArea FIGHT_ARENA = new WorldArea(3685, 3251, 17, 17, 0);

    // Lightning dodge positions
    private static final WorldPoint SAFE_SPOT_1 = new WorldPoint(3688, 3254, 0);
    private static final WorldPoint SAFE_SPOT_2 = new WorldPoint(3698, 3254, 0);
    private static final WorldPoint SAFE_SPOT_3 = new WorldPoint(3688, 3264, 0);
    private static final WorldPoint SAFE_SPOT_4 = new WorldPoint(3698, 3264, 0);
    private static final WorldPoint SAFE_SPOT_CENTER = new WorldPoint(3693, 3259, 0);

    // Darkness phase safe tiles
    private static final WorldPoint DARKNESS_SAFE_1 = new WorldPoint(3690, 3256, 0);
    private static final WorldPoint DARKNESS_SAFE_2 = new WorldPoint(3696, 3256, 0);
    private static final WorldPoint DARKNESS_SAFE_3 = new WorldPoint(3690, 3262, 0);
    private static final WorldPoint DARKNESS_SAFE_4 = new WorldPoint(3696, 3262, 0);

    // Blood orb phase positions
    private static final WorldArea BLOOD_ORB_SPAWN_AREA = new WorldArea(3687, 3253, 13, 13, 0);

    // State tracking
    public static boolean fightStarted = false;
    public static boolean lightningActive = false;
    public static WorldPoint vanstromLocation = null;
    public static List<BankItem> bankingItems = new ArrayList<>();

    private static WorldPoint lastKnownPosition;
    private static WorldPoint currentSafeSpot;
    private static int currentPhase = 1;
    private static boolean darknessPhaseActive = false;
    private static boolean bloodOrbPhaseActive = false;

    // Combat thresholds
    private static final int HIGH_HP_FOOD_THRESHOLD = 76;
    private static final int MEDIUM_HP_FOOD_THRESHOLD = 67;
    private static final int LOW_HP_FOOD_THRESHOLD = 55;
    private static final int EMERGENCY_HP_THRESHOLD = 45;
    private static final int PRAYER_THRESHOLD = 30;
    private static final int BOOST_THRESHOLD = 5;

    private static String currentAction = "";
    public static String stepName = "Sins of the Father - Vanstrom Klause Fight";

    /**
     * Sets up the required items for banking before the fight
     */
    private static void setupBankItems() {
        bankingItems.clear();

        // Food (15 sharks minimum)
        if (Bank.contains(SHARK)) {
            int sharkCount = Bank.getFirst(SHARK).getQuantity();
            if (sharkCount >= 15) {
                bankingItems.add(new BankItem(SHARK, 15, "Food"));
            }
        }

        // Prayer potions (4 minimum)
        if (Bank.contains(PRAYER_POTION_4)) {
            int ppotCount = Bank.getFirst(PRAYER_POTION_4).getQuantity();
            if (ppotCount >= 4) {
                bankingItems.add(new BankItem(PRAYER_POTION_4, 4, "Prayer restoration"));
            }
        }

        // Super attack potions
        if (Bank.contains(SUPER_ATTACK_4)) {
            bankingItems.add(new BankItem(SUPER_ATTACK_4, 1, "Attack boost"));
        } else if (Bank.contains(SUPER_ATTACK_3)) {
            bankingItems.add(new BankItem(SUPER_ATTACK_3, 1, "Attack boost"));
        } else if (Bank.contains(SUPER_ATTACK_2)) {
            bankingItems.add(new BankItem(SUPER_ATTACK_2, 1, "Attack boost"));
        } else if (Bank.contains(SUPER_ATTACK_1)) {
            bankingItems.add(new BankItem(SUPER_ATTACK_1, 1, "Attack boost"));
        }

        // Super strength potions
        if (Bank.contains(SUPER_STRENGTH_4)) {
            bankingItems.add(new BankItem(SUPER_STRENGTH_4, 1, "Strength boost"));
        } else if (Bank.contains(SUPER_STRENGTH_3)) {
            bankingItems.add(new BankItem(SUPER_STRENGTH_3, 1, "Strength boost"));
        } else if (Bank.contains(SUPER_STRENGTH_2)) {
            bankingItems.add(new BankItem(SUPER_STRENGTH_2, 1, "Strength boost"));
        } else if (Bank.contains(SUPER_STRENGTH_1)) {
            bankingItems.add(new BankItem(SUPER_STRENGTH_1, 1, "Strength boost"));
        }

        // Stamina potion (optional)
        if (Bank.contains(STAMINA_POTION_4)) {
            bankingItems.add(new BankItem(STAMINA_POTION_4, 1, "Run energy"));
        }

        // Equipment checks
        if (!Equipment.contains(BLISTERWOOD_FLAIL) && !Inventory.contains(BLISTERWOOD_FLAIL)) {
            if (Bank.contains(BLISTERWOOD_FLAIL)) {
                bankingItems.add(new BankItem(BLISTERWOOD_FLAIL, 1, "Primary weapon"));
            } else if (Bank.contains(BLISTERWOOD_SICKLE)) {
                bankingItems.add(new BankItem(BLISTERWOOD_SICKLE, 1, "Backup weapon"));
            }
        }

        // Armor pieces
        if (!Equipment.contains(DRAGONHIDE_BODY) && !Inventory.contains(DRAGONHIDE_BODY)) {
            if (Bank.contains(DRAGONHIDE_BODY)) {
                bankingItems.add(new BankItem(DRAGONHIDE_BODY, 1, "Body armor"));
            }
        }

        if (!Equipment.contains(DRAGONHIDE_CHAPS) && !Inventory.contains(DRAGONHIDE_CHAPS)) {
            if (Bank.contains(DRAGONHIDE_CHAPS)) {
                bankingItems.add(new BankItem(DRAGONHIDE_CHAPS, 1, "Leg armor"));
            }
        }

        if (!Equipment.contains(RUBY_BRACELET) && !Inventory.contains(RUBY_BRACELET)) {
            if (Bank.contains(RUBY_BRACELET)) {
                bankingItems.add(new BankItem(RUBY_BRACELET, 1, "Special attack"));
            }
        }
    }

    /**
     * Checks if player has all required gear equipped or in inventory
     */
    private static boolean hasRequiredGear() {
        // Check for Blisterwood weapon
        if (!Inventory.contains(BLISTERWOOD_FLAIL) && !Equipment.contains(BLISTERWOOD_FLAIL)) {
            if (!Inventory.contains(BLISTERWOOD_SICKLE) && !Equipment.contains(BLISTERWOOD_SICKLE)) {
                return false;
            }
        }

        // Check for minimum food
        if (Inventory.getAll(SHARK).size() < 10) {
            return false;
        }

        // Check for prayer potions
        int prayerPotCount = 0;
        prayerPotCount += Inventory.getAll(PRAYER_POTION_4).size();
        prayerPotCount += Inventory.getAll(PRAYER_POTION_3).size();
        prayerPotCount += Inventory.getAll(PRAYER_POTION_2).size();
        prayerPotCount += Inventory.getAll(PRAYER_POTION_1).size();
        if (prayerPotCount < 3) {
            return false;
        }

        // Check for combat potions
        boolean hasSuperAttack = Inventory.contains(SUPER_ATTACK_4) ||
                                Inventory.contains(SUPER_ATTACK_3) ||
                                Inventory.contains(SUPER_ATTACK_2) ||
                                Inventory.contains(SUPER_ATTACK_1);

        boolean hasSuperStrength = Inventory.contains(SUPER_STRENGTH_4) ||
                                  Inventory.contains(SUPER_STRENGTH_3) ||
                                  Inventory.contains(SUPER_STRENGTH_2) ||
                                  Inventory.contains(SUPER_STRENGTH_1);

        return hasSuperAttack && hasSuperStrength;
    }

    /**
     * Handles combat during the fight: eating, drinking potions, attacking
     */
    private static void handleCombat() {
        NPC vanstrom = NPCs.getNearest(VANSTROM_KLAUSE_ID, VANSTROM_KLAUSE_PHASE2_ID, VANSTROM_KLAUSE_PHASE3_ID);

        if (vanstrom == null) {
            return;
        }

        int currentHp = Skills.getLevel(Skill.HITPOINTS);
        double hpPercent = getHpPercentage();
        int prayerPoints = Prayers.getPoints();

        // Emergency food at very low HP
        if (currentHp <= EMERGENCY_HP_THRESHOLD) {
            eatFood();
            return;
        }

        // Drink prayer potion if needed
        if (prayerPoints < PRAYER_THRESHOLD) {
            if (Inventory.contains(PRAYER_POTION_4, PRAYER_POTION_3, PRAYER_POTION_2, PRAYER_POTION_1)) {
                Item ppot = Inventory.getFirst(PRAYER_POTION_4, PRAYER_POTION_3, PRAYER_POTION_2, PRAYER_POTION_1);
                if (ppot != null) {
                    ppot.interact("Drink");
                    Time.sleepTicks(1);
                }
            }
        }

        // Boost stats if needed
        int attackLevel = Skills.getLevel(Skill.ATTACK);
        int attackBoosted = Skills.getBoostedLevel(Skill.ATTACK);
        int strengthLevel = Skills.getLevel(Skill.STRENGTH);
        int strengthBoosted = Skills.getBoostedLevel(Skill.STRENGTH);

        if (attackLevel - BOOST_THRESHOLD > attackBoosted) {
            Item superAttack = Inventory.getFirst(SUPER_ATTACK_4, SUPER_ATTACK_3, SUPER_ATTACK_2, SUPER_ATTACK_1);
            if (superAttack != null) {
                superAttack.interact("Drink");
                Time.sleepTicks(1);
            }
        }

        if (strengthLevel - BOOST_THRESHOLD > strengthBoosted) {
            Item superStrength = Inventory.getFirst(SUPER_STRENGTH_4, SUPER_STRENGTH_3, SUPER_STRENGTH_2, SUPER_STRENGTH_1);
            if (superStrength != null) {
                superStrength.interact("Drink");
                Time.sleepTicks(1);
            }
        }

        // Eat food based on HP percentage
        if (hpPercent <= LOW_HP_FOOD_THRESHOLD) {
            eatFood();
        } else if (hpPercent <= MEDIUM_HP_FOOD_THRESHOLD && currentHp <= 65) {
            eatFood();
        } else if (hpPercent <= HIGH_HP_FOOD_THRESHOLD && currentHp <= 75) {
            eatFood();
        }

        // Attack Vanstrom if not already in combat
        if (lightningActive && Players.getLocal().getInteracting() == null) {
            vanstrom.interact("Attack");
            Time.sleepTicks(2);
        }
    }

    /**
     * Eats food from inventory
     */
    private static void eatFood() {
        Item food = Inventory.getFirst(SHARK);
        if (food != null) {
            food.interact("Eat");
            Time.sleepTicks(2);
        }
    }

    /**
     * Gets current HP as percentage
     */
    private static double getHpPercentage() {
        int maxHp = Skills.getLevel(Skill.HITPOINTS);
        int currentHp = Skills.getBoostedLevel(Skill.HITPOINTS);
        return (double) currentHp / maxHp * 100.0;
    }

    /**
     * Handles the lightning phase mechanic
     * Vanstrom creates lightning strikes that must be dodged
     */
    private static void handleLightningPhase() {
        NPC vanstrom = NPCs.getNearest(VANSTROM_KLAUSE_ID);

        if (vanstrom == null) {
            return;
        }

        // Check if Vanstrom is doing lightning animation
        if (vanstrom.getAnimation() == VANSTROM_LIGHTNING_ANIMATION) {
            lightningActive = true;

            // Move to nearest safe spot
            WorldPoint playerPos = Players.getLocal().getWorldLocation();
            WorldPoint nearestSafe = findNearestSafeSpot(playerPos);

            if (nearestSafe != null && !playerPos.equals(nearestSafe)) {
                currentAction = "Dodging lightning";
                Movement.walkTo(nearestSafe);
                Time.sleepTicks(1);
            }
        } else {
            lightningActive = false;
        }
    }

    /**
     * Finds the nearest safe spot from lightning
     */
    private static WorldPoint findNearestSafeSpot(WorldPoint from) {
        WorldPoint[] safeSpots = {SAFE_SPOT_1, SAFE_SPOT_2, SAFE_SPOT_3, SAFE_SPOT_4, SAFE_SPOT_CENTER};

        WorldPoint nearest = null;
        int minDistance = Integer.MAX_VALUE;

        for (WorldPoint spot : safeSpots) {
            int distance = from.distanceTo(spot);
            if (distance < minDistance) {
                minDistance = distance;
                nearest = spot;
            }
        }

        return nearest;
    }

    /**
     * Handles the darkness phase mechanic
     * The arena becomes dark and player must navigate using safe tiles
     */
    private static void handleDarknessPhase() {
        NPC vanstrom = NPCs.getNearest(VANSTROM_KLAUSE_PHASE2_ID);

        if (vanstrom == null) {
            return;
        }

        // Check if darkness animation is active
        if (vanstrom.getAnimation() == VANSTROM_DARKNESS_ANIMATION) {
            darknessPhaseActive = true;
            currentAction = "Navigating darkness";

            // Move to darkness safe spots
            WorldPoint playerPos = Players.getLocal().getWorldLocation();
            WorldPoint nearestDarkSafe = findNearestDarknessSafeSpot(playerPos);

            if (nearestDarkSafe != null && !playerPos.equals(nearestDarkSafe)) {
                Movement.walkTo(nearestDarkSafe);
                Time.sleepTicks(1);
            }

            // Continue attacking while moving
            if (Players.getLocal().getInteracting() == null) {
                vanstrom.interact("Attack");
            }
        } else {
            darknessPhaseActive = false;
        }
    }

    /**
     * Finds nearest safe spot during darkness phase
     */
    private static WorldPoint findNearestDarknessSafeSpot(WorldPoint from) {
        WorldPoint[] darkSafeSpots = {DARKNESS_SAFE_1, DARKNESS_SAFE_2, DARKNESS_SAFE_3, DARKNESS_SAFE_4};

        WorldPoint nearest = null;
        int minDistance = Integer.MAX_VALUE;

        for (WorldPoint spot : darkSafeSpots) {
            int distance = from.distanceTo(spot);
            if (distance < minDistance) {
                minDistance = distance;
                nearest = spot;
            }
        }

        return nearest;
    }

    /**
     * Handles the blood orb phase mechanic
     * Blood orbs spawn that need to be destroyed or avoided
     */
    private static void handleBloodOrbPhase() {
        NPC vanstrom = NPCs.getNearest(VANSTROM_KLAUSE_PHASE3_ID);

        if (vanstrom == null) {
            return;
        }

        // Check for blood orbs
        NPC bloodOrb = NPCs.getNearest(BLOOD_ORB_ID);

        if (bloodOrb != null) {
            bloodOrbPhaseActive = true;
            currentAction = "Handling blood orbs";

            // Attack blood orb if it's close
            if (bloodOrb.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= 3) {
                bloodOrb.interact("Attack");
                Time.sleepTicks(2);
            } else {
                // Move away from blood orb
                WorldPoint safePos = findPositionAwayFrom(bloodOrb.getWorldLocation());
                if (safePos != null) {
                    Movement.walkTo(safePos);
                    Time.sleepTicks(1);
                }
            }
        } else {
            bloodOrbPhaseActive = false;

            // Attack Vanstrom if no blood orbs
            if (Players.getLocal().getInteracting() == null) {
                vanstrom.interact("Attack");
                Time.sleepTicks(1);
            }
        }
    }

    /**
     * Finds a position away from a dangerous location
     */
    private static WorldPoint findPositionAwayFrom(WorldPoint danger) {
        WorldPoint playerPos = Players.getLocal().getWorldLocation();

        // Try to move to the opposite corner
        int dx = playerPos.getX() - danger.getX();
        int dy = playerPos.getY() - danger.getY();

        WorldPoint awayPoint = new WorldPoint(
            playerPos.getX() + (dx > 0 ? 2 : -2),
            playerPos.getY() + (dy > 0 ? 2 : -2),
            0
        );

        // Make sure it's in the arena
        if (FIGHT_ARENA.contains(awayPoint)) {
            return awayPoint;
        }

        return FIGHT_CENTER;
    }

    /**
     * Handles mutated bloodveld minions that spawn during the fight
     */
    private static void handleBloodveldMinions() {
        NPC bloodveld = NPCs.getNearest(MUTATED_BLOODVELD_ID);

        if (bloodveld != null) {
            currentAction = "Killing bloodveld";

            // Make sure weapon is equipped
            if (!Equipment.contains(BLISTERWOOD_FLAIL) && Inventory.contains(BLISTERWOOD_FLAIL)) {
                Inventory.getFirst(BLISTERWOOD_FLAIL).interact("Wield");
                Time.sleepTicks(1);
            }

            // Attack bloodveld
            if (Players.getLocal().getInteracting() == null) {
                bloodveld.interact("Attack");
                Time.sleepTicks(2);
            }

            // Handle combat while fighting bloodveld
            handleCombat();
        }
    }

    /**
     * Main fight execution loop
     */
    private static void executeFight() {
        if (!FIGHT_ARENA.contains(Players.getLocal().getWorldLocation())) {
            currentAction = "Entering fight arena";
            Movement.walkTo(FIGHT_CENTER);
            return;
        }

        // Ensure prayers are active
        if (!Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE)) {
            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
        }
        if (!Prayers.isEnabled(Prayer.PIETY) && Skills.getLevel(Skill.PRAYER) >= 70) {
            Prayers.toggle(Prayer.PIETY);
        }

        // Check for bloodveld minions first
        NPC bloodveld = NPCs.getNearest(MUTATED_BLOODVELD_ID);
        if (bloodveld != null) {
            handleBloodveldMinions();
            return;
        }

        // Determine current phase and handle mechanics
        NPC vanstrom = NPCs.getNearest(VANSTROM_KLAUSE_ID, VANSTROM_KLAUSE_PHASE2_ID, VANSTROM_KLAUSE_PHASE3_ID);

        if (vanstrom == null) {
            currentAction = "Waiting for Vanstrom";
            return;
        }

        // Update phase based on NPC ID
        if (vanstrom.getId() == VANSTROM_KLAUSE_ID) {
            currentPhase = 1;
            handleLightningPhase();
        } else if (vanstrom.getId() == VANSTROM_KLAUSE_PHASE2_ID) {
            currentPhase = 2;
            handleDarknessPhase();
        } else if (vanstrom.getId() == VANSTROM_KLAUSE_PHASE3_ID) {
            currentPhase = 3;
            handleBloodOrbPhase();
        }

        // Handle combat (eating, potions, attacking)
        handleCombat();

        // Update vanstrom location
        vanstromLocation = vanstrom.getWorldLocation();
    }

    /**
     * Checks if the fight is complete
     */
    private static boolean isFightComplete() {
        // Check if Vanstrom is dead (no NPCs present)
        NPC vanstrom = NPCs.getNearest(VANSTROM_KLAUSE_ID, VANSTROM_KLAUSE_PHASE2_ID, VANSTROM_KLAUSE_PHASE3_ID);

        if (vanstrom == null && fightStarted) {
            // Check if quest completion dialog is open
            if (Dialog.canContinue()) {
                return true;
            }

            // Check if we're out of the arena
            if (!FIGHT_ARENA.contains(Players.getLocal().getWorldLocation())) {
                return true;
            }
        }

        return false;
    }

    /**
     * Handles pre-fight preparation: banking, getting supplies, equipping gear
     */
    private static void prepareFight() {
        currentAction = "Preparing for fight";

        // Check if we need to bank
        if (!hasRequiredGear()) {
            BankLocation nearestBank = BankLocation.getNearest();

            if (nearestBank != null) {
                if (!nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    currentAction = "Walking to bank";
                    Walker.walkTo(nearestBank.getArea().getCenter());
                    return;
                }

                if (!Bank.isOpen()) {
                    Bank.open();
                    Time.sleepUntil(Bank::isOpen, 5000);
                    return;
                }

                currentAction = "Banking items";

                // Deposit all items
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(2);
                }

                if (Equipment.getAll().size() > 0) {
                    Bank.depositEquipment();
                    Time.sleepTicks(2);
                }

                // Withdraw items from banking list
                setupBankItems();

                for (BankItem item : bankingItems) {
                    if (Bank.contains(item.getId())) {
                        Bank.withdraw(item.getId(), item.getQuantity(), Bank.WithdrawMode.ITEM);
                        Time.sleepTicks(1);
                    }
                }

                Bank.close();
                Time.sleepTicks(1);
            }
        }

        // Equip gear
        if (Inventory.contains(BLISTERWOOD_FLAIL) && !Equipment.contains(BLISTERWOOD_FLAIL)) {
            Inventory.getFirst(BLISTERWOOD_FLAIL).interact("Wield");
            Time.sleepTicks(1);
        }

        if (Inventory.contains(DRAGONHIDE_BODY) && !Equipment.contains(DRAGONHIDE_BODY)) {
            Inventory.getFirst(DRAGONHIDE_BODY).interact("Wear");
            Time.sleepTicks(1);
        }

        if (Inventory.contains(DRAGONHIDE_CHAPS) && !Equipment.contains(DRAGONHIDE_CHAPS)) {
            Inventory.getFirst(DRAGONHIDE_CHAPS).interact("Wear");
            Time.sleepTicks(1);
        }

        if (Inventory.contains(RUBY_BRACELET) && !Equipment.contains(RUBY_BRACELET)) {
            Inventory.getFirst(RUBY_BRACELET).interact("Wear");
            Time.sleepTicks(1);
        }

        // Mark fight as ready to start
        if (hasRequiredGear()) {
            currentAction = "Ready for fight";
            fightStarted = true;
        }
    }

    /**
     * Main execution method called by the quest framework
     * This is called repeatedly by the bot framework
     *
     * @return execution delay in milliseconds
     */
    public static int execute() {
        try {
            if (!fightStarted) {
                prepareFight();
                return 600;
            }

            if (isFightComplete()) {
                currentAction = "Fight complete";
                fightStarted = false;

                // Handle end dialogue
                if (Dialog.canContinue()) {
                    Dialog.continueSpace();
                    Time.sleepTicks(2);
                }

                return 600;
            }

            // Execute the fight
            executeFight();

        } catch (Exception e) {
            System.out.println("Error in Vanstrom fight: " + e.getMessage());
            e.printStackTrace();
        }

        return 600; // Execute every 600ms
    }

    /**
     * Returns the current step name with action
     */
    public static String getStepName() {
        return stepName + " - " + currentAction;
    }

    /**
     * Helper class for bank items
     */
    private static class BankItem {
        private final int id;
        private final int quantity;
        private final String description;

        public BankItem(int id, int quantity, String description) {
            this.id = id;
            this.quantity = quantity;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getDescription() {
            return description;
        }
    }
}
