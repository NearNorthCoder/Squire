/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

/**
 * Enum representing the different operating modes for the Mixology plugin.
 *
 * <p>This enum defines how the plugin should behave during the Mixology minigame:
 * <ul>
 * <li>MINIGAME - Standard minigame mode for playing the Mixology activity</li>
 * <li>CREATE_PASTE - Mode for creating paste/potions outside the minigame context</li>
 * </ul>
 */
public final class PluginMode extends Enum<PluginMode> {
    /**
     * Standard minigame mode for participating in the Mixology minigame activity.
     */
    public static final PluginMode MINIGAME;

    /**
     * Mode for creating paste or potions outside of the minigame context.
     */
    public static final PluginMode CREATE_PASTE;

    private static final PluginMode[] $VALUES;

    /**
     * Returns an array containing all values of this enum type.
     *
     * @return An array of all PluginMode values
     */
    public static PluginMode[] values() {
        return (PluginMode[])$VALUES.clone();
    }

    /**
     * Returns the enum constant of this type with the specified name.
     *
     * @param name The name of the constant to return
     * @return The enum constant with the specified name
     */
    public static PluginMode valueOf(String name) {
        return Enum.valueOf(PluginMode.class, name);
    }

    static {
        MINIGAME = new PluginMode();
        CREATE_PASTE = new PluginMode();
        PluginMode[] modes = new PluginMode[2];
        modes[0] = MINIGAME;
        modes[1] = CREATE_PASTE;
        $VALUES = modes;
    }
}
