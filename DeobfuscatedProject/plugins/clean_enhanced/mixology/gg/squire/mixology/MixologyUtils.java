package gg.squire.mixology;

import gg.squire.mixology.SquireMixology;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * Utility class providing helper methods for the Mixology plugin.
 * Contains methods for potion management, lever operation, and game state tracking.
 */
public class MixologyUtils {
    private static final WorldArea MIXOLOGY_AREA = new WorldArea(2776, 9656, 17, 32, 0);
    public static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

    // Widget IDs
    private static final int WIDGET_PARENT_ID = 31030;
    private static final int WIDGET_CHILD_ID = 2;

    // Lever varbit IDs
    private static final int LEVER_1_VARBIT = 11819;
    private static final int LEVER_2_VARBIT = 11821;
    private static final int LEVER_3_VARBIT = 11822;

    // Station varbit IDs
    private static final int RETORT_VARBIT = 11839;
    private static final int ALEMBIC_VARBIT = 11844;
    private static final int AGITATOR_VARBIT = 11845;

    /**
     * Checks if the player is currently in the Mixology minigame area.
     *
     * @return true if player is in the Mixology area, false otherwise
     */
    public static boolean isInMixologyArea() {
        return MIXOLOGY_AREA.contains(Players.getLocal().getWorldLocation());
    }

    /**
     * Checks if the player has any finished potions in their inventory.
     *
     * @return true if player has finished potions, false otherwise
     */
    public static boolean hasFinishedPotions() {
        for (PotionType potion : PotionType.values()) {
            if (Inventory.contains(potion.getFinishedID())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the player has any unfinished potions in their inventory.
     *
     * @return true if player has unfinished potions, false otherwise
     */
    public static boolean hasUnfinishedPotions() {
        for (PotionType potion : PotionType.values()) {
            if (Inventory.contains(potion.getUnfinishedID()) &&
                Inventory.contains(potion.getFinishedID())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the player has the specified potion type (unfinished or finished).
     *
     * @return true if player has the potion, false otherwise
     */
    public static boolean hasPotion() {
        for (PotionType potion : PotionType.values()) {
            if (Inventory.contains(potion.getUnfinishedID())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if any of the processing stations are currently active.
     *
     * @return true if a station is active, false otherwise
     */
    public static boolean isStationActive() {
        return Vars.getBit(RETORT_VARBIT) > 0 ||
               Vars.getBit(ALEMBIC_VARBIT) > 0 ||
               Vars.getBit(AGITATOR_VARBIT) > 0;
    }

    /**
     * Gets the finished potion ID for a given potion name.
     *
     * @param potionName the name of the potion
     * @return the finished potion item ID, or -1 if not found
     */
    public static int getFinishedPotionID(String potionName) {
        for (PotionType potion : PotionType.values()) {
            if (potion.getName().equalsIgnoreCase(potionName)) {
                return potion.getFinishedID();
            }
        }
        return -1;
    }

    /**
     * Gets the unfinished potion ID for a given potion name.
     *
     * @param potionName the name of the potion
     * @return the unfinished potion item ID, or -1 if not found
     */
    public static int getUnfinishedPotionID(String potionName) {
        for (PotionType potion : PotionType.values()) {
            if (potion.getName().equalsIgnoreCase(potionName)) {
                return potion.getUnfinishedID();
            }
        }
        return -1;
    }

    /**
     * Gets the PotionType enum value for a given potion name.
     *
     * @param potionName the name of the potion
     * @return the PotionType enum, or null if not found
     */
    public static PotionType getPotionByName(String potionName) {
        for (PotionType potion : PotionType.values()) {
            if (potion.getName().equalsIgnoreCase(potionName)) {
                return potion;
            }
        }
        return null;
    }

    /**
     * Gets the sprite/icon ID for a given potion name from the widget.
     *
     * @param potionName the name of the potion
     * @return the sprite ID, or -1 if not found
     */
    public static int getPotionSpriteID(String potionName) {
        String potion1 = Widgets.get(WIDGET_PARENT_ID, WIDGET_CHILD_ID)
            .getChild(2).getText().replaceAll("<[^>]*>", "").trim();
        String potion2 = Widgets.get(WIDGET_PARENT_ID, WIDGET_CHILD_ID)
            .getChild(4).getText().replaceAll("<[^>]*>", "").trim();
        String potion3 = Widgets.get(WIDGET_PARENT_ID, WIDGET_CHILD_ID)
            .getChild(6).getText().replaceAll("<[^>]*>", "").trim();

        if (potion1.equals(potionName)) {
            return Widgets.get(WIDGET_PARENT_ID, WIDGET_CHILD_ID).getChild(1).getSpriteId();
        }
        if (potion2.equals(potionName)) {
            return Widgets.get(WIDGET_PARENT_ID, WIDGET_CHILD_ID).getChild(3).getSpriteId();
        }
        if (potion3.equals(potionName)) {
            return Widgets.get(WIDGET_PARENT_ID, WIDGET_CHILD_ID).getChild(5).getSpriteId();
        }
        return -1;
    }

    /**
     * Selects the best potion to make based on available reagents and XP rewards.
     *
     * @param potion1Name name of first potion option
     * @param potion2Name name of second potion option
     * @param potion3Name name of third potion option
     * @return the best PotionType to make
     */
    public static PotionType selectBestPotion(String potion1Name, String potion2Name, String potion3Name) {
        PotionType potion1 = getPotionByName(potion1Name);
        PotionType potion2 = getPotionByName(potion2Name);
        PotionType potion3 = getPotionByName(potion3Name);

        PotionType[] potions = {potion1, potion2, potion3};
        return selectHighestXPPotion(potions);
    }

    /**
     * Selects the potion with the highest XP reward from an array of potions.
     *
     * @param potions array of potion types
     * @return the potion with highest XP reward
     */
    private static PotionType selectHighestXPPotion(PotionType... potions) {
        PotionType bestPotion = null;
        int highestXP = 0;

        for (PotionType potion : potions) {
            if (potion != null && potion.getXpReward() > highestXP) {
                highestXP = potion.getXpReward();
                bestPotion = potion;
            }
        }
        return bestPotion;
    }

    /**
     * Selects the best potion based on reagent rewards and XP.
     *
     * @param potion1Name name of first potion option
     * @param potion2Name name of second potion option
     * @param potion3Name name of third potion option
     * @param rewardType  the desired reward type (Mox, Aga, or Lye)
     * @return the best matching PotionType
     */
    public static PotionType selectBestPotionWithReward(String potion1Name, String potion2Name,
                                                         String potion3Name, String rewardType) {
        ArrayList<PotionType> potionList = new ArrayList<>();

        PotionType potion1 = getPotionByName(potion1Name);
        if (potion1 != null) {
            potionList.add(potion1);
        }

        PotionType potion2 = getPotionByName(potion2Name);
        if (potion2 != null) {
            potionList.add(potion2);
        }

        PotionType potion3 = getPotionByName(potion3Name);
        if (potion3 != null) {
            potionList.add(potion3);
        }

        // Filter potions by reward type
        var matchingRewardPotions = potionList.stream()
            .filter(p -> p.getRewardType().equalsIgnoreCase(rewardType))
            .collect(Collectors.toList());

        // If we have potions matching the reward type, return the highest XP one
        if (!matchingRewardPotions.isEmpty()) {
            return matchingRewardPotions.stream()
                .max(Comparator.comparingInt(PotionType::getXpReward))
                .orElse(null);
        }

        // Otherwise return the highest XP potion regardless of reward
        return potionList.stream()
            .max(Comparator.comparingInt(PotionType::getXpReward))
            .orElse(null);
    }

    /**
     * Operates the levers to set the correct values for a potion.
     *
     * @param potionName the name of the potion to configure levers for
     * @return true if levers were operated successfully, false otherwise
     */
    public static boolean operateLevers(String potionName) {
        PotionType potion = getPotionByName(potionName);
        if (potion == null) {
            System.out.println(potionName);
            System.out.println("ERROR: Could not find potion!");
            return false;
        }

        TileObject lever1 = TileObjects.getNearest("Lever A");
        TileObject lever2 = TileObjects.getNearest("Lever B");
        TileObject lever3 = TileObjects.getNearest("Lever C");

        int currentLever1 = Vars.getBit(LEVER_1_VARBIT);
        int currentLever2 = Vars.getBit(LEVER_2_VARBIT);
        int currentLever3 = Vars.getBit(LEVER_3_VARBIT);

        // Operate lever 1 if needed
        if (currentLever1 != potion.getLever1Value() && currentLever1 > 0) {
            if (potion.getLever1Value() == 3) {
                SquireMixology.statusMessage = "Operating Lever A";
                lever1.interact("Quick-operate");
                return false;
            }
            if (potion.getLever1Value() == 1) {
                SquireMixology.statusMessage = "Operating Lever A";
                lever2.interact("Quick-operate");
                return false;
            }
            if (potion.getLever1Value() == 2) {
                SquireMixology.statusMessage = "Operating Lever A";
                lever3.interact("Quick-operate");
                return false;
            }
            return false;
        }

        // Operate lever 2 if needed
        if (currentLever2 != potion.getLever2Value() && currentLever2 > 0) {
            if (potion.getLever2Value() == 3) {
                SquireMixology.statusMessage = "Operating Lever B";
                lever1.interact("Quick-operate");
                return false;
            }
            if (potion.getLever2Value() == 1) {
                SquireMixology.statusMessage = "Operating Lever B";
                lever2.interact("Quick-operate");
                return false;
            }
            if (potion.getLever2Value() == 2) {
                SquireMixology.statusMessage = "Operating Lever B";
                lever3.interact("Quick-operate");
                return false;
            }
            return false;
        }

        // Operate lever 3 if needed
        if (currentLever3 != potion.getLever3Value() && currentLever3 > 0) {
            if (potion.getLever3Value() == 3) {
                SquireMixology.statusMessage = "Operating Lever C";
                lever1.interact("Quick-operate");
                return false;
            }
            if (potion.getLever3Value() == 1) {
                SquireMixology.statusMessage = "Operating Lever C";
                lever2.interact("Quick-operate");
                return false;
            }
            if (potion.getLever3Value() == 2) {
                SquireMixology.statusMessage = "Operating Lever C";
                lever3.interact("Quick-operate");
                return false;
            }
            return false;
        }

        return true;
    }

    /**
     * Checks if all three potions have been collected for multi-order mode.
     *
     * @param potion1Name name of first potion
     * @param potion2Name name of second potion
     * @param potion3Name name of third potion
     * @return true if all potions are in inventory, false otherwise
     */
    public static boolean hasAllPotions(String potion1Name, String potion2Name, String potion3Name) {
        int potion1ID = 0;
        int potion2ID = 0;
        int potion3ID = 0;

        for (PotionType potion : PotionType.values()) {
            if (potion.getName().equalsIgnoreCase(potion1Name)) {
                potion1ID = potion.getFinishedID();
            } else if (potion.getName().equalsIgnoreCase(potion2Name)) {
                potion2ID = potion.getFinishedID();
            } else if (potion.getName().equalsIgnoreCase(potion3Name)) {
                potion3ID = potion.getFinishedID();
            }
        }

        return Inventory.contains(potion1ID) &&
               Inventory.contains(potion2ID) &&
               Inventory.contains(potion3ID);
    }

    /**
     * Monitors station activity based on graphics objects and varbits.
     *
     * @param graphicsID   the graphics object ID to watch for
     * @param varbitID     the varbit ID to check
     * @param stationID    the station object ID
     * @return true if station is ready for interaction, false otherwise
     */
    public static boolean monitorStationActivity(int graphicsID, int varbitID, int stationID) {
        if (Players.getLocal().isAnimating() && !SquireMixology.hasInteracted) {
            Static.getClient().getGraphicsObjects().forEach(graphicsObject -> {
                if (graphicsObject.getId() == graphicsID && !SquireMixology.hasInteracted) {
                    TileObjects.getNearest(stationID).interact(0);
                    SquireMixology.hasInteracted = true;
                }
            });
            return false;
        }

        if (Vars.getBit(varbitID) > 0 && !Players.getLocal().isAnimating()) {
            return true;
        }

        return !hasPotion();
    }

    /**
     * Updates the current potion target for multi-order processing.
     * This method determines which potion should be processed next based on inventory contents.
     */
    public static void updateMultiOrderTarget() {
        int potion1Count = SquireMixology.potion1Count;
        int potion2Count = SquireMixology.potion2Count;
        int potion3Count = SquireMixology.potion3Count;

        int potion1UnfID = getUnfinishedPotionID(SquireMixology.potion1Name);
        int potion1FinID = getFinishedPotionID(SquireMixology.potion1Name);

        int potion2UnfID = getUnfinishedPotionID(SquireMixology.potion2Name);
        int potion2FinID = getFinishedPotionID(SquireMixology.potion2Name);

        int potion3UnfID = getUnfinishedPotionID(SquireMixology.potion3Name);
        int potion3FinID = getFinishedPotionID(SquireMixology.potion3Name);

        String potion1Name = SquireMixology.potion1Name;
        String potion2Name = SquireMixology.potion2Name;
        String potion3Name = SquireMixology.potion3Name;

        // Check if we need to finish potion 1
        if (!Inventory.contains(potion1FinID) && Inventory.contains(potion1UnfID)) {
            SquireMixology.currentTargetSpriteID = SquireMixology.potion1SpriteID;
            System.out.println("Current: " + SquireMixology.currentTargetSpriteID);
            return;
        }

        // Complex logic for determining next potion to process
        if (Inventory.contains(potion1UnfID) && potion1Name.equalsIgnoreCase(potion2Name)) {
            if (Inventory.contains(potion2UnfID) && Inventory.getCount(potion1UnfID) >= 2) {
                System.out.println("Switching to potion 2 - already have potion 1 unfinished");
                SquireMixology.currentTargetSpriteID = SquireMixology.potion2SpriteID;
                System.out.println("Current: " + SquireMixology.currentTargetSpriteID);
                return;
            }
        }

        if (Inventory.contains(potion1UnfID) && potion1Name.equalsIgnoreCase(potion3Name)) {
            if (Inventory.contains(potion3UnfID) && Inventory.getCount(potion1UnfID) >= 2) {
                System.out.println("Switching to potion 3 - already have potion 1 unfinished");
                SquireMixology.currentTargetSpriteID = SquireMixology.potion3SpriteID;
                System.out.println("Current: " + SquireMixology.currentTargetSpriteID);
                return;
            }
        }

        if (Inventory.contains(potion1UnfID) && potion1Name.equalsIgnoreCase(potion3Name)) {
            if (Inventory.contains(potion3UnfID) && Inventory.getCount(potion1UnfID) >= 3) {
                System.out.println("Have 3+ potion 1, switching to potion 3");
                SquireMixology.currentTargetSpriteID = SquireMixology.potion3SpriteID;
                System.out.println("Current: " + SquireMixology.currentTargetSpriteID);
                return;
            }
        }

        if (!Inventory.contains(potion2FinID) && Inventory.contains(potion2UnfID)) {
            SquireMixology.currentTargetSpriteID = SquireMixology.potion2SpriteID;
            System.out.println("Current: " + SquireMixology.currentTargetSpriteID);
            return;
        }

        if (Inventory.contains(potion2FinID) && potion2Name.equalsIgnoreCase(potion3Name)) {
            if (Inventory.contains(potion3UnfID)) {
                System.out.println("Switching to potion 3 - already finished potion 2");
                SquireMixology.currentTargetSpriteID = SquireMixology.potion3SpriteID;
                System.out.println("Current: " + SquireMixology.currentTargetSpriteID);
                return;
            }
        }

        if (!Inventory.contains(potion3FinID) && Inventory.contains(potion3UnfID)) {
            System.out.println("Need to finish potion 3");
            SquireMixology.currentTargetSpriteID = SquireMixology.potion3SpriteID;
            System.out.println("Current: " + SquireMixology.currentTargetSpriteID);
        }
    }
}
