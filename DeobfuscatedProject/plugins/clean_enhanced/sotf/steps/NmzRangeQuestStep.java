package gg.squire.sotf.steps;

import gg.squire.sotf.steps.*;
import java.util.ArrayList;
import java.util.List;

/**
 * NMZ (Nightmare Zone) Range quest step.
 * This step ensures specific quests are completed before enabling NMZ range mode.
 *
 * Quest progression:
 * 1. Vampire Slayer (varbit 178 >= 3)
 * 2. Lost City (varbit 84 >= 6)
 * 3. Fight Arena (varbit 17 >= 14)
 * 4. Tree Gnome Village (varbit 59 >= 9)
 * 5. The Grand Tree (varbit 150 >= 160)
 *
 * Once all quests are complete, enables NMZ range mode.
 */
public class NmzRangeQuestStep implements QuestStep {

    // Quest indices for quest state tracking
    private static final int VAMPIRE_SLAYER_VARBIT = 178;
    private static final int VAMPIRE_SLAYER_COMPLETE_VALUE = 3;
    private static final int LOST_CITY_VARBIT = 84;
    private static final int LOST_CITY_COMPLETE_VALUE = 6;
    private static final int FIGHT_ARENA_VARBIT = 17;
    private static final int FIGHT_ARENA_COMPLETE_VALUE = 14;
    private static final int TREE_GNOME_VILLAGE_VARBIT = 59;
    private static final int TREE_GNOME_VILLAGE_COMPLETE_VALUE = 9;
    private static final int GRAND_TREE_VARBIT = 150;
    private static final int GRAND_TREE_COMPLETE_VALUE = 160;

    // Quest step descriptions
    private static final String STEP_VAMPIRE_SLAYER = "- Vamp Slayer";
    private static final String STEP_LOST_CITY = "- Lost City";
    private static final String STEP_FIGHT_ARENA = "- Fight Arena";
    private static final String STEP_TREE_GNOME_VILLAGE = "- Tree Gnome village";
    private static final String STEP_GRAND_TREE = "- Grand Tree";
    private static final String STEP_COMPLETE = "";
    private static final String COMBAT_STYLE = "range";

    // Quest name
    private static final String QUEST_NAME = "NMZ Range ";

    // Current quest step description
    static String currentStepDescription;

    // Quest name identifier
    static String questName;

    // Item requirements list
    public static List<d> itemRequirements;

    // Buying items flag
    public static boolean buyingItems;

    // Quest state
    private static int questState;

    static {
        itemRequirements = new ArrayList<>();
        currentStepDescription = STEP_COMPLETE;
        questName = QUEST_NAME;
        questState = GameStateUtil.randomRange(1, 2);
    }

    @Override
    public String getName() {
        return questName;
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        try {
            updateQuestProgress();
        } catch (Exception ex) {
            // Ignore exceptions
        }
        return 100;
    }

    /**
     * Updates the quest progress by checking which quests are complete
     * and setting the appropriate next step.
     */
    public static void updateQuestProgress() {
        // Check Vampire Slayer completion
        if (GameStateUtil.getVarbit(VAMPIRE_SLAYER_VARBIT) < VAMPIRE_SLAYER_COMPLETE_VALUE) {
            currentStepDescription = STEP_VAMPIRE_SLAYER;
            aa.ev();
            return;
        }

        // Check Lost City completion
        if (GameStateUtil.getVarbit(VAMPIRE_SLAYER_VARBIT) >= VAMPIRE_SLAYER_COMPLETE_VALUE
                && GameStateUtil.getVarbit(LOST_CITY_VARBIT) < LOST_CITY_COMPLETE_VALUE) {
            currentStepDescription = STEP_LOST_CITY;
            F.bY();
            return;
        }

        // Check Fight Arena completion
        if (GameStateUtil.getVarbit(VAMPIRE_SLAYER_VARBIT) >= VAMPIRE_SLAYER_COMPLETE_VALUE
                && GameStateUtil.getVarbit(LOST_CITY_VARBIT) >= LOST_CITY_COMPLETE_VALUE
                && GameStateUtil.getVarbit(FIGHT_ARENA_VARBIT) < FIGHT_ARENA_COMPLETE_VALUE) {
            currentStepDescription = STEP_FIGHT_ARENA;
            A.bw();
            return;
        }

        // Check Tree Gnome Village completion
        if (GameStateUtil.getVarbit(VAMPIRE_SLAYER_VARBIT) >= VAMPIRE_SLAYER_COMPLETE_VALUE
                && GameStateUtil.getVarbit(LOST_CITY_VARBIT) >= LOST_CITY_COMPLETE_VALUE
                && GameStateUtil.getVarbit(FIGHT_ARENA_VARBIT) >= FIGHT_ARENA_COMPLETE_VALUE
                && GameStateUtil.getVarbit(TREE_GNOME_VILLAGE_VARBIT) < TREE_GNOME_VILLAGE_COMPLETE_VALUE) {
            currentStepDescription = STEP_TREE_GNOME_VILLAGE;
            M.cT();
            return;
        }

        // Check Grand Tree completion
        if (GameStateUtil.getVarbit(VAMPIRE_SLAYER_VARBIT) >= VAMPIRE_SLAYER_COMPLETE_VALUE
                && GameStateUtil.getVarbit(LOST_CITY_VARBIT) >= LOST_CITY_COMPLETE_VALUE
                && GameStateUtil.getVarbit(FIGHT_ARENA_VARBIT) >= FIGHT_ARENA_COMPLETE_VALUE
                && GameStateUtil.getVarbit(TREE_GNOME_VILLAGE_VARBIT) >= TREE_GNOME_VILLAGE_COMPLETE_VALUE
                && GameStateUtil.getVarbit(GRAND_TREE_VARBIT) < GRAND_TREE_COMPLETE_VALUE) {
            currentStepDescription = STEP_GRAND_TREE;
            C.bA();
            return;
        }

        // All quests complete - enable NMZ range mode
        if (GameStateUtil.getVarbit(VAMPIRE_SLAYER_VARBIT) >= VAMPIRE_SLAYER_COMPLETE_VALUE
                && GameStateUtil.getVarbit(LOST_CITY_VARBIT) >= LOST_CITY_COMPLETE_VALUE
                && GameStateUtil.getVarbit(FIGHT_ARENA_VARBIT) >= FIGHT_ARENA_COMPLETE_VALUE
                && GameStateUtil.getVarbit(TREE_GNOME_VILLAGE_VARBIT) >= TREE_GNOME_VILLAGE_COMPLETE_VALUE
                && GameStateUtil.getVarbit(GRAND_TREE_VARBIT) >= GRAND_TREE_COMPLETE_VALUE) {
            currentStepDescription = STEP_COMPLETE;
            q.e(COMBAT_STYLE);
        }
    }

    @Override
    public boolean isComplete() {
        return false;
    }
}
