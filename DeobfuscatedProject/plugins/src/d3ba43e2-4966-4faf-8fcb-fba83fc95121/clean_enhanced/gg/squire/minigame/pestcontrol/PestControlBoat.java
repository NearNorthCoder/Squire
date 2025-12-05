package gg.squire.minigame.pestcontrol;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Represents the different Pest Control boat difficulty levels and their associated properties.
 * Each boat has different combat level requirements, object IDs for boarding, and points rewarded.
 */
public enum PestControlBoat {
    /**
     * Novice boat - for lower level players (40+ combat)
     */
    NOVICE("Novice", 40, 32619, 3),

    /**
     * Intermediate boat - for mid-level players (70+ combat)
     */
    INTERMEDIATE("Intermediate", 70, 25919, 4),

    /**
     * Veteran boat - for high level players (100+ combat)
     */
    VETERAN("Veteran", 100, 32685, 5);

    private final String difficulty;
    private final int levelRequirement;
    private final int objectID;
    private final int pointsPerGame;

    /**
     * Creates a new boat difficulty enum value.
     *
     * @param difficulty       The difficulty name (Novice, Intermediate, Veteran)
     * @param levelRequirement The minimum combat level required
     * @param objectID         The game object ID for the gangplank
     * @param pointsPerGame    The number of points awarded per completed game
     */
    PestControlBoat(String difficulty, int levelRequirement, int objectID, int pointsPerGame) {
        this.difficulty = difficulty;
        this.levelRequirement = levelRequirement;
        this.objectID = objectID;
        this.pointsPerGame = pointsPerGame;
    }

    /**
     * Gets the difficulty name.
     *
     * @return The difficulty level (e.g., "Novice", "Intermediate", "Veteran")
     */
    public String getDifficulty() {
        return this.difficulty;
    }

    /**
     * Gets the minimum combat level required for this boat.
     *
     * @return The minimum combat level
     */
    public int getLevelRequirement() {
        return this.levelRequirement;
    }

    /**
     * Gets the object ID for the gangplank to board this boat.
     *
     * @return The gangplank object ID
     */
    public int getObjectID() {
        return this.objectID;
    }

    /**
     * Gets the number of points awarded per completed game.
     *
     * @return The points per game
     */
    public int getPointsPerGame() {
        return this.pointsPerGame;
    }

    /**
     * Finds the highest difficulty boat the player can access based on their combat level.
     *
     * @param combatLevel The player's combat level
     * @return The highest accessible boat, or null if none available
     */
    public static PestControlBoat getHighestAccessibleBoat(int combatLevel) {
        return Arrays.stream(values())
                .filter(boat -> boat.getLevelRequirement() <= combatLevel)
                .max(Comparator.comparing(PestControlBoat::getLevelRequirement))
                .orElse(null);
    }

    @Override
    public String toString() {
        return "PestControlBoat{" +
                "difficulty='" + difficulty + '\'' +
                ", levelRequirement=" + levelRequirement +
                ", objectID=" + objectID +
                ", pointsPerGame=" + pointsPerGame +
                '}';
    }
}
