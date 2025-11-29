/*
 * Deobfuscated from class 'f' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * ItemIdArrays contains static arrays of related item IDs.
 * Used for checking inventory/equipment for any variant of an item type.
 *
 * NOTE: The actual values in the original are XOR-obfuscated at runtime.
 * These values are approximations based on OSRS item IDs.
 * The full implementation is in:
 * /plugins/deobfuscated_full/7c1d3521-.../o/c/k/i/-/l/o/f/-/n/c/t/e/s/f.java
 */
package gg.squire.sotf.framework;

/**
 * Constants class containing arrays of related item IDs.
 * Each array contains variants of an item type (e.g., all stamina potion doses).
 */
public final class ItemIdArrays {

    /**
     * Stamina potion variants (all doses).
     * Original obfuscated field: f.ba
     * IDs: 12625 (4), 12627 (3), 12629 (2), 12631 (1)
     */
    public static final int[] STAMINA_POTIONS = {12625, 12627, 12629, 12631};

    /**
     * Alias for STAMINA_POTIONS using original obfuscated name.
     * @deprecated Use STAMINA_POTIONS instead
     */
    @Deprecated
    public static final int[] ba = STAMINA_POTIONS;

    /**
     * Prayer restore/potion variants (all doses).
     * Original obfuscated field: f.aX
     * IDs: 2434 (4), 139 (3), 141 (2), 143 (1)
     */
    public static final int[] PRAYER_POTIONS = {2434, 139, 141, 143};

    /**
     * Alias for PRAYER_POTIONS using original obfuscated name.
     * @deprecated Use PRAYER_POTIONS instead
     */
    @Deprecated
    public static final int[] aX = PRAYER_POTIONS;

    /**
     * Equipment/armor item variants.
     * Original obfuscated field: f.aT
     * Contains various gear items used during quests.
     */
    public static final int[] QUEST_EQUIPMENT = {
        // Placeholder values - needs verification from runtime
        1540,  // Rune kiteshield
        1127,  // Rune platebody
        1079,  // Rune platelegs
        1163,  // Rune full helm
        4131,  // Rune boots
        1201,  // Rune kiteshield
        1333,  // Rune scimitar
        1725,  // Amulet of glory
        2550   // Ring of recoil
    };

    /**
     * Alias for QUEST_EQUIPMENT using original obfuscated name.
     * @deprecated Use QUEST_EQUIPMENT instead
     */
    @Deprecated
    public static final int[] aT = QUEST_EQUIPMENT;

    /**
     * Ring of wealth variants (all charges).
     * Original obfuscated field: f.bk
     * IDs: 11980 (5), 11982 (4), 11984 (3), 11986 (2), 11988 (1)
     */
    public static final int[] RING_OF_WEALTH = {11980, 11982, 11984, 11986, 11988};

    /**
     * Alias for RING_OF_WEALTH using original obfuscated name.
     * @deprecated Use RING_OF_WEALTH instead
     */
    @Deprecated
    public static final int[] bk = RING_OF_WEALTH;

    // Prevent instantiation
    private ItemIdArrays() {
        throw new UnsupportedOperationException("Constants class cannot be instantiated");
    }
}
