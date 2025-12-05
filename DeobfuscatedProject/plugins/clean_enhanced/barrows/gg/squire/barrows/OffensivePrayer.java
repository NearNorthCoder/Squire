/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Represents offensive prayer configurations for combat.
 * Each configuration contains a list of prayers to activate.
 */
package gg.squire.barrows;

import net.runelite.api.Prayer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Enum representing offensive prayer setups.
 * Used to configure which prayers to activate during different combat situations.
 */
public enum OffensivePrayer {
    RIGOUR(Prayer.RIGOUR),
    AUGURY(Prayer.AUGURY),
    PIETY(Prayer.PIETY),
    CHIVALRY(Prayer.CHIVALRY),
    ULTIMATE_STRENGTH(Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN),
    EAGLE_EYE(Prayer.EAGLE_EYE),
    MYSTIC_MIGHT(Prayer.MYSTIC_MIGHT);

    private final List<Prayer> prayers;

    /**
     * Creates a new OffensivePrayer enum value.
     *
     * @param prayers The prayers to activate for this configuration
     */
    OffensivePrayer(Prayer... prayers) {
        this.prayers = Stream.of(prayers).collect(Collectors.toList());
    }

    /**
     * Gets the list of prayers for this configuration.
     *
     * @return The list of prayers to activate
     */
    public List<Prayer> getPrayers() {
        return this.prayers;
    }
}
