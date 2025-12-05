/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

/**
 * Enum representing the strategy for creating potions in the Mixology minigame.
 *
 * <p>This enum determines whether the plugin should:
 * <ul>
 * <li>SINGLE_ORDER - Create potions one order at a time</li>
 * <li>MULTI_ORDER - Process multiple orders simultaneously</li>
 * </ul>
 */
public final class PotionStrategy extends Enum<PotionStrategy> {
    /**
     * Strategy to create potions one order at a time.
     * This is the safer, more conservative approach.
     */
    public static final PotionStrategy SINGLE_ORDER;

    /**
     * Strategy to process multiple potion orders simultaneously.
     * This is faster but may be more complex to manage.
     */
    public static final PotionStrategy MULTI_ORDER;

    private static final PotionStrategy[] $VALUES;

    /**
     * Returns the enum constant of this type with the specified name.
     *
     * @param name The name of the constant to return
     * @return The enum constant with the specified name
     */
    public static PotionStrategy valueOf(String name) {
        return Enum.valueOf(PotionStrategy.class, name);
    }

    /**
     * Returns an array containing all values of this enum type.
     *
     * @return An array of all PotionStrategy values
     */
    public static PotionStrategy[] values() {
        return (PotionStrategy[])$VALUES.clone();
    }

    static {
        SINGLE_ORDER = new PotionStrategy();
        MULTI_ORDER = new PotionStrategy();
        PotionStrategy[] strategies = new PotionStrategy[2];
        strategies[0] = SINGLE_ORDER;
        strategies[1] = MULTI_ORDER;
        $VALUES = strategies;
    }
}
