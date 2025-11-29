/*
 * Deobfuscated from class 'j' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * Constants class containing timeout values and other magic numbers
 * used throughout the SOTF plugin.
 *
 * Original obfuscated fields:
 *   cf -> DEFAULT_GE_TIMEOUT
 */
package gg.squire.sotf.framework;

/**
 * Constants used throughout the SOTF plugin.
 * Contains timeout values and other configuration constants.
 */
public final class Constants {

    /**
     * Default timeout for Grand Exchange operations (in milliseconds).
     * Original obfuscated field: j.cf
     *
     * Used when creating ShopItem instances for GE purchases.
     * Value: ~17424ms (~17.4 seconds)
     */
    public static final int DEFAULT_GE_TIMEOUT = 17424;

    /**
     * Alias for DEFAULT_GE_TIMEOUT using original obfuscated name.
     * @deprecated Use DEFAULT_GE_TIMEOUT instead
     */
    @Deprecated
    public static final int cf = DEFAULT_GE_TIMEOUT;

    // Common tick delays
    public static final int TICK_DELAY_SHORT = 1;
    public static final int TICK_DELAY_MEDIUM = 2;
    public static final int TICK_DELAY_LONG = 3;
    public static final int TICK_DELAY_EXTENDED = 5;

    // Common millisecond timeouts
    public static final int TIMEOUT_SHORT = 3000;
    public static final int TIMEOUT_MEDIUM = 5000;
    public static final int TIMEOUT_LONG = 10000;
    public static final int TIMEOUT_GE = 15000;

    // Prevent instantiation
    private Constants() {
        throw new UnsupportedOperationException("Constants class cannot be instantiated");
    }
}
