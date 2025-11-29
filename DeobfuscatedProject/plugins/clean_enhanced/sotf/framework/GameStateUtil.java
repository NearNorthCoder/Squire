/*
 * Deobfuscated from class 'e' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * GameStateUtil provides utility methods for querying game state,
 * including varbits, skill levels, health, and inventory checks.
 *
 * NOTE: This is a stub class. The full implementation is in the
 * original deobfuscated source at:
 * /plugins/deobfuscated_full/7c1d3521-.../o/c/k/i/-/l/o/f/-/n/c/t/e/s/e.java
 */
package gg.squire.sotf.framework;

import net.runelite.api.Skill;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Utility class for querying game state.
 * Provides methods for checking varbits, health, inventory, and random delays.
 */
public final class GameStateUtil {

    private static final ThreadLocalRandom random = ThreadLocalRandom.current();

    /**
     * Get the value of a varbit.
     * Original obfuscated method: e.j(int)
     *
     * @param varbitId The varbit ID to query
     * @return The varbit value
     */
    public static int getVarbit(int varbitId) {
        return (Integer) GameThread.invokeLater(() -> Static.getClient().getVarpValue(varbitId));
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use getVarbit(int) instead
     */
    @Deprecated
    public static int j(int varbitId) {
        return getVarbit(varbitId);
    }

    /**
     * Get current health as a percentage of max health.
     * Original obfuscated method: e.w()
     *
     * @return Health percentage (0-100)
     */
    public static double getHealthPercentage() {
        double currentHp = Skills.getBoostedLevel(Skill.HITPOINTS);
        double maxHp = Skills.getLevel(Skill.HITPOINTS);
        return currentHp / maxHp * 100.0;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use getHealthPercentage() instead
     */
    @Deprecated
    public static double w() {
        return getHealthPercentage();
    }

    /**
     * Generate a random number between min and max (inclusive).
     * Original obfuscated method: e.c(int, int)
     *
     * @param min Minimum value
     * @param max Maximum value
     * @return Random number in range
     */
    public static int randomRange(int min, int max) {
        return random.nextInt(min, max + 1);
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use randomRange(int, int) instead
     */
    @Deprecated
    public static int c(int min, int max) {
        return randomRange(min, max);
    }

    /**
     * Check if inventory contains all specified items.
     * Original obfuscated method: e.c(int[])
     *
     * @param itemIds Array of item IDs to check
     * @return true if all items are in inventory
     */
    public static boolean hasAllItems(int[] itemIds) {
        for (int itemId : itemIds) {
            if (!Inventory.contains(itemId)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use hasAllItems(int[]) instead
     */
    @Deprecated
    public static boolean c(int[] itemIds) {
        return hasAllItems(itemIds);
    }

    // Prevent instantiation
    private GameStateUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
}
