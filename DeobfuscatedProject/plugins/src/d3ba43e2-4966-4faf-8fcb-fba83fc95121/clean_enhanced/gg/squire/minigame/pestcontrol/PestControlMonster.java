package gg.squire.minigame.pestcontrol;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Represents the different monster types in Pest Control and their attack priorities.
 * Higher priority monsters should be killed first to protect the Void Knight.
 */
public enum PestControlMonster {
    /**
     * Brawler - Low priority melee monster
     */
    BRAWLER("Brawler", 1),

    /**
     * Spinner - Low-medium priority ranged monster
     */
    SPINNER("Spinner", 2),

    /**
     * Portal - Medium priority, spawns other monsters
     */
    PORTAL("Portal", 3),

    /**
     * Defiler - Medium-high priority, can poison and reduce stats
     */
    DEFILER("Defiler", 4),

    /**
     * Ravager - Medium-high priority, high damage melee
     */
    RAVAGER("Ravager", 4),

    /**
     * Shifter - High priority, can teleport players
     */
    SHIFTER("Shifter", 5),

    /**
     * Torcher - High priority, uses powerful magic attacks
     */
    TORCHER("Torcher", 5),

    /**
     * Splatter - Highest priority, explodes when killed near Void Knight
     */
    SPLATTER("Splatter", 6);

    private final String monsterName;
    private final int attackPriority;

    /**
     * Creates a new monster type enum value.
     *
     * @param monsterName    The display name of the monster
     * @param attackPriority The priority for targeting (higher = more important)
     */
    PestControlMonster(String monsterName, int attackPriority) {
        this.monsterName = monsterName;
        this.attackPriority = attackPriority;
    }

    /**
     * Gets the display name of this monster.
     *
     * @return The monster name
     */
    public String getMonsterName() {
        return this.monsterName;
    }

    /**
     * Gets the attack priority for this monster type.
     * Higher values indicate higher priority targets.
     *
     * @return The attack priority (1-6)
     */
    public int getAttackPriority() {
        return this.attackPriority;
    }

    /**
     * Gets the highest priority monster type.
     *
     * @return The monster with the highest attack priority
     */
    public static PestControlMonster getHighestPriority() {
        return Arrays.stream(values())
                .max(Comparator.comparingInt(PestControlMonster::getAttackPriority))
                .orElse(null);
    }

    @Override
    public String toString() {
        return "PestControlMonster{" +
                "monsterName='" + monsterName + '\'' +
                ", attackPriority=" + attackPriority +
                '}';
    }
}
