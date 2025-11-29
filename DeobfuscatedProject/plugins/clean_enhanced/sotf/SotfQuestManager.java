package gg.squire.sotf;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.runelite.api.GameState;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.QuestVarbits;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.*;

/**
 * Main quest orchestrator for Secrets of the North (SOTF).
 *
 * This manager handles the entire quest progression from skill training through
 * prerequisite quests to final completion. It manages a sequential task list
 * and tracks completion status.
 *
 * <p>Skill Requirements:</p>
 * <ul>
 *   <li>Thieving: 60+</li>
 *   <li>Agility: 52+</li>
 *   <li>Construction: 5+</li>
 *   <li>Mining: 60+</li>
 *   <li>Crafting: 75+</li>
 *   <li>Woodcutting: 62+</li>
 *   <li>Magic: 49+</li>
 *   <li>Herblore: 50+</li>
 *   <li>Ranged: 49+</li>
 *   <li>Fletching: 10+</li>
 *   <li>Slayer: 49+ (for experience tome rewards)</li>
 * </ul>
 *
 * <p>Quest Prerequisites:</p>
 * <ul>
 *   <li>Darkness of Hallowvale</li>
 *   <li>A Taste of Hope</li>
 *   <li>Sins of the Father</li>
 *   <li>Animal Magnetism</li>
 * </ul>
 *
 * @author Squire Plugin System
 */
public class SotfQuestManager implements ac {

    /**
     * Current quest or task name being executed
     */
    public static String questName;

    /**
     * List of all quest tasks/steps to be completed in sequence
     */
    public static List<ac> subTasks;

    /**
     * Whether the task list has been initialized
     */
    static boolean initialized;

    /**
     * Current step in the initialization process
     */
    static int currentStep;

    // Skill level requirements
    private static final int THIEVING_REQUIREMENT = 60;
    private static final int AGILITY_REQUIREMENT = 52;
    private static final int CONSTRUCTION_REQUIREMENT = 5;
    private static final int MINING_REQUIREMENT = 60;
    private static final int CRAFTING_REQUIREMENT = 75;
    private static final int WOODCUTTING_REQUIREMENT = 62;
    private static final int MAGIC_REQUIREMENT = 49;
    private static final int HERBLORE_REQUIREMENT = 50;
    private static final int FLETCHING_REQUIREMENT = 10;
    private static final int RANGED_REQUIREMENT = 49;
    private static final int RANGED_ADVANCED_REQUIREMENT = 70;
    private static final int SLAYER_REQUIREMENT = 49;

    // Quest completion values
    private static final int ANIMAL_MAGNETISM_COMPLETE = 240;
    private static final int DARKNESS_OF_HALLOWVALE_COMPLETE = 8143;
    private static final int SINS_OF_THE_FATHER_COMPLETE = 138;
    private static final int A_TASTE_OF_HOPE_COMPLETE = 165;

    // Item names
    private static final String TOME_OF_EXPERIENCE = "Tome of experience";
    private static final String TOME_OF_EXPERIENCE_3 = "Tome of experience (3)";
    private static final String TOME_OF_EXPERIENCE_2 = "Tome of experience (2)";
    private static final String TOME_OF_EXPERIENCE_1 = "Tome of experience (1)";

    static {
        subTasks = new ArrayList<>();
        questName = "";
        initialized = false;
        currentStep = 0;
    }

    /**
     * Checks if the player has the required items/prerequisites.
     *
     * @return true if requirements are met, false otherwise
     */
    @Override
    public boolean ae() {
        return false;
    }

    /**
     * Executes the quest orchestration logic.
     * Initializes tasks and manages their execution.
     *
     * @return sleep duration in milliseconds before next execution
     */
    @Override
    public int af() {
        try {
            initializeQuestTasks();
        } catch (Exception exception) {
            // Ignore initialization errors
        }
        return 100;
    }

    /**
     * Gets the current quest or task name.
     *
     * @return the name of the current quest/task
     */
    @Override
    public String ag() {
        return questName;
    }

    /**
     * Checks if all quest requirements are met including:
     * - All skill level requirements
     * - Prerequisite quest completions
     * - Required experience tomes in inventory
     *
     * @return true if the quest can be started, false otherwise
     */
    @Override
    public boolean ah() {
        // Check skill requirements
        if (!checkSkillRequirements()) {
            return false;
        }

        // Check quest prerequisites
        if (!checkQuestPrerequisites()) {
            return false;
        }

        // Check if tasks are ready
        if (subTasks.isEmpty() || currentStep <= 0) {
            return false;
        }

        // Check required inventory items
        return checkRequiredInventoryItems();
    }

    /**
     * Checks if all skill requirements are met.
     */
    private boolean checkSkillRequirements() {
        return Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) >= HERBLORE_REQUIREMENT
            && Skills.getLevel(Skill.RANGED) >= RANGED_REQUIREMENT
            && Skills.getLevel(Skill.FLETCHING) >= FLETCHING_REQUIREMENT;
    }

    /**
     * Checks if all prerequisite quests are completed.
     */
    private boolean checkQuestPrerequisites() {
        return Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()) == DARKNESS_OF_HALLOWVALE_COMPLETE
            && Vars.getBit(QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()) == SINS_OF_THE_FATHER_COMPLETE
            && Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()) >= A_TASTE_OF_HOPE_COMPLETE;
    }

    /**
     * Checks if the required experience tomes are in inventory.
     */
    private boolean checkRequiredInventoryItems() {
        if (!Inventory.contains(TOME_OF_EXPERIENCE)) {
            return false;
        }
        if (!Inventory.contains(TOME_OF_EXPERIENCE_3)) {
            return false;
        }
        if (!Inventory.contains(TOME_OF_EXPERIENCE_2)) {
            return false;
        }
        if (!Inventory.contains(TOME_OF_EXPERIENCE_1)) {
            return false;
        }
        return Skills.getLevel(Skill.SLAYER) >= SLAYER_REQUIREMENT;
    }

    /**
     * Initializes all quest tasks and manages their execution.
     * This method sets up the entire task sequence including:
     * - Skill training tasks (shuffled randomly)
     * - Prerequisite quests
     * - Main quest steps
     *
     * Tasks are organized into groups that can be shuffled to vary the
     * training order while maintaining quest dependencies.
     */
    public static void initializeQuestTasks() {
        // Initialize task list on first run
        if (!subTasks.isEmpty() || currentStep >= 1) {
            // Task list already initialized, skip to execution
            executeCurrentTask();
            return;
        }

        // Build skill training task groups (can be shuffled)
        List<ac> thievingTasks = Arrays.asList(
            new P(),
            new Z(),
            new W(),
            new V(),
            new T()
        );

        List<ac> combatTasks = Arrays.asList(
            new M(),
            new A(),
            new R(),
            new aa(),
            new H()
        );

        List<ac> gatheringTasks = Arrays.asList(
            new G(),
            new ak(),
            new w()
        );

        List<ac> craftingTasks = Arrays.asList(
            new at(),
            new ad(),
            new af(),
            new ao(),
            new E(),
            new an()
        );

        List<ac> magicTasks = Arrays.asList(
            new ag(),
            new D()
        );

        List<ac> rangedTasks = Arrays.asList(
            new aj(),
            new ai(),
            new w(),
            new au(),
            new y()
        );

        List<ac> questTasks = Arrays.asList(
            new aq(),
            new ar()
        );

        // Shuffle skill training groups to add variety
        Collections.shuffle(thievingTasks);
        Collections.shuffle(combatTasks);
        Collections.shuffle(gatheringTasks);
        Collections.shuffle(craftingTasks);
        Collections.shuffle(magicTasks);
        Collections.shuffle(rangedTasks);
        Collections.shuffle(questTasks);

        // Add all tasks in proper sequence
        subTasks.addAll(thievingTasks);
        subTasks.add(new O());
        subTasks.addAll(combatTasks);
        subTasks.add(new U());
        subTasks.add(new ah());
        subTasks.addAll(gatheringTasks);
        subTasks.addAll(craftingTasks);
        subTasks.addAll(magicTasks);
        subTasks.addAll(rangedTasks);
        subTasks.addAll(questTasks);
        subTasks.add(new v());
        subTasks.add(new L());

        currentStep += 1;

        if (!subTasks.isEmpty()) {
            if (initialized) {
                Collections.shuffle(subTasks);
            }
            System.out.println("Switching to : " + subTasks.get(0).ag());
            questName = subTasks.get(0).ag();
        }
    }

    /**
     * Executes the current task in the task list.
     * Handles task completion, progression, and fallback skill training.
     */
    private static void executeCurrentTask() {
        // Execute tasks while list is not empty and plugin is running
        while (!subTasks.isEmpty() && !AccBuilderSotf.d) {
            if (Game.getState() != GameState.LOGGED_IN) {
                continue;
            }

            // Check if current task is complete
            if (subTasks.get(0).ah()) {
                AccBuilderSotf.f += 1;
                System.out.println("Achieved " + subTasks.get(0).ag() + " goal");
                subTasks.remove(0);

                if (!subTasks.isEmpty()) {
                    System.out.println("Switching to : " + subTasks.get(0).ag());
                    questName = subTasks.get(0).ag();
                }

                if (subTasks.isEmpty()) {
                    questName = "none";
                }

                Time.sleepTicks(4);
            }

            if (Game.getState() == GameState.LOGGED_IN) {
                // Disable GE warnings if needed
                while (e.z()) {
                    AccBuilderSotf.c = "Disabling GE warning";
                    e.A();
                    Time.sleepTicks(1);
                }

                // Execute current task
                AccBuilderSotf.l = subTasks.get(0).ag();
                int sleepDuration = subTasks.get(0).af();
                Time.sleep(sleepDuration);
                Time.sleep(e.c(49, 80));
            }

            e.G();
        }

        // Fallback: Train skills if not all requirements met but tasks initialized
        if (subTasks.isEmpty() && currentStep > 0) {
            trainFallbackSkills();
        }
    }

    /**
     * Trains skills that don't meet requirements yet.
     * This is a fallback system when the task list is exhausted but
     * requirements aren't met.
     */
    private static void trainFallbackSkills() {
        // Thieving training
        if (Skills.getLevel(Skill.THIEVING) < THIEVING_REQUIREMENT) {
            AccBuilderSotf.l = "Thieving";
            aE.gm();
        }

        // Agility training
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) < AGILITY_REQUIREMENT) {
            AccBuilderSotf.l = "Agility";
            av.eA();
        }

        // Construction training
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) < CONSTRUCTION_REQUIREMENT) {
            AccBuilderSotf.l = "Construction";
            aw.eH();
        }

        // Mining training
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) < MINING_REQUIREMENT) {
            AccBuilderSotf.l = "Mining";
            aC.fQ();
        }

        // Crafting training
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) < CRAFTING_REQUIREMENT) {
            AccBuilderSotf.l = "Crafting";
            ay.fi();
        }

        // Woodcutting training
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) < WOODCUTTING_REQUIREMENT) {
            AccBuilderSotf.l = "Woodcutting";
            aF.gs();
        }

        // Magic training
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) < MAGIC_REQUIREMENT) {
            AccBuilderSotf.l = "Magic training";
            m.ak();
        }

        // Herblore training
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) < HERBLORE_REQUIREMENT) {
            AccBuilderSotf.l = "Herblore";
            aB.fL();
        }

        // Fletching training
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) >= HERBLORE_REQUIREMENT
            && Skills.getLevel(Skill.FLETCHING) < FLETCHING_REQUIREMENT) {
            AccBuilderSotf.l = "Fletching";
            aA.fv();
        }

        // Ranged training (basic level)
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) >= HERBLORE_REQUIREMENT
            && Skills.getLevel(Skill.FLETCHING) >= FLETCHING_REQUIREMENT
            && Skills.getLevel(Skill.RANGED) < RANGED_REQUIREMENT) {
            AccBuilderSotf.l = "Range training";
            n.aA();
        }

        // Animal Magnetism quest
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) >= HERBLORE_REQUIREMENT
            && Skills.getLevel(Skill.FLETCHING) >= FLETCHING_REQUIREMENT
            && Skills.getLevel(Skill.RANGED) >= RANGED_REQUIREMENT
            && Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) < ANIMAL_MAGNETISM_COMPLETE) {
            AccBuilderSotf.l = "Animal magnetism";
            w.bf();
        }

        // Ranged training (advanced level)
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) >= HERBLORE_REQUIREMENT
            && Skills.getLevel(Skill.FLETCHING) >= FLETCHING_REQUIREMENT
            && Skills.getLevel(Skill.RANGED) >= RANGED_REQUIREMENT
            && Skills.getLevel(Skill.RANGED) < RANGED_ADVANCED_REQUIREMENT
            && Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == ANIMAL_MAGNETISM_COMPLETE) {
            AccBuilderSotf.l = "Range training";
            n.aA();
        }

        // Darkness of Hallowvale questline
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) >= HERBLORE_REQUIREMENT
            && Skills.getLevel(Skill.FLETCHING) >= FLETCHING_REQUIREMENT
            && Skills.getLevel(Skill.RANGED) >= RANGED_ADVANCED_REQUIREMENT
            && Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == ANIMAL_MAGNETISM_COMPLETE) {

            // Check if Darkness of Hallowvale is incomplete or needs tome collection
            if (Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()) < DARKNESS_OF_HALLOWVALE_COMPLETE
                || !Inventory.contains(TOME_OF_EXPERIENCE_3)
                || !Inventory.contains(TOME_OF_EXPERIENCE_2)
                || !Inventory.contains(TOME_OF_EXPERIENCE_1)) {
                AccBuilderSotf.l = "Darkness of Hallowvale questline";
                y.bl();
            }
        }

        // Temple Trek for experience tomes
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) >= HERBLORE_REQUIREMENT
            && Skills.getLevel(Skill.FLETCHING) >= FLETCHING_REQUIREMENT
            && Skills.getLevel(Skill.RANGED) >= RANGED_ADVANCED_REQUIREMENT
            && Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == ANIMAL_MAGNETISM_COMPLETE
            && Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()) == DARKNESS_OF_HALLOWVALE_COMPLETE) {

            if (!Inventory.contains(TOME_OF_EXPERIENCE_3)
                || !Inventory.contains(TOME_OF_EXPERIENCE_2)
                || !Inventory.contains(TOME_OF_EXPERIENCE_1)
                || Skills.getLevel(Skill.SLAYER) < SLAYER_REQUIREMENT) {
                AccBuilderSotf.l = "Temple Trek";
                ar.t("xp");
                ar.gb();
            }
        }

        // A Taste of Hope quest
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) >= HERBLORE_REQUIREMENT
            && Skills.getLevel(Skill.FLETCHING) >= FLETCHING_REQUIREMENT
            && Skills.getLevel(Skill.RANGED) >= RANGED_ADVANCED_REQUIREMENT
            && Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == ANIMAL_MAGNETISM_COMPLETE
            && Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()) == DARKNESS_OF_HALLOWVALE_COMPLETE) {

            if (!Inventory.contains(TOME_OF_EXPERIENCE_3)
                || !Inventory.contains(TOME_OF_EXPERIENCE_2)
                || !Inventory.contains(TOME_OF_EXPERIENCE_1)
                || Skills.getLevel(Skill.SLAYER) < SLAYER_REQUIREMENT) {

                if (Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()) < A_TASTE_OF_HOPE_COMPLETE
                    || !Inventory.contains(TOME_OF_EXPERIENCE)) {
                    AccBuilderSotf.l = "A Taste of Hope";
                    v.aZ();
                }
            }
        }

        // Sins of the Father quest
        if (Skills.getLevel(Skill.THIEVING) >= THIEVING_REQUIREMENT
            && Skills.getLevel(Skill.AGILITY) >= AGILITY_REQUIREMENT
            && Skills.getLevel(Skill.CONSTRUCTION) >= CONSTRUCTION_REQUIREMENT
            && Skills.getLevel(Skill.MINING) >= MINING_REQUIREMENT
            && Skills.getLevel(Skill.CRAFTING) >= CRAFTING_REQUIREMENT
            && Skills.getLevel(Skill.WOODCUTTING) >= WOODCUTTING_REQUIREMENT
            && Skills.getLevel(Skill.MAGIC) >= MAGIC_REQUIREMENT
            && Skills.getLevel(Skill.HERBLORE) >= HERBLORE_REQUIREMENT
            && Skills.getLevel(Skill.FLETCHING) >= FLETCHING_REQUIREMENT
            && Skills.getLevel(Skill.RANGED) >= RANGED_ADVANCED_REQUIREMENT
            && Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()) == ANIMAL_MAGNETISM_COMPLETE
            && Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()) == DARKNESS_OF_HALLOWVALE_COMPLETE) {

            if (Inventory.contains(TOME_OF_EXPERIENCE_3)
                && Inventory.contains(TOME_OF_EXPERIENCE_2)
                && Inventory.contains(TOME_OF_EXPERIENCE_1)
                && Skills.getLevel(Skill.SLAYER) >= SLAYER_REQUIREMENT
                && Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()) >= A_TASTE_OF_HOPE_COMPLETE) {

                if (Inventory.contains(TOME_OF_EXPERIENCE)
                    && Vars.getBit(QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()) < SINS_OF_THE_FATHER_COMPLETE) {
                    AccBuilderSotf.l = "Sins of the Father";
                    L.cB();
                }
            }
        }
    }
}
