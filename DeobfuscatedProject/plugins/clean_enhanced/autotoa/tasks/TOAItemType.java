/*
 * TOA Supply Item Type Enum
 *
 * This enum represents the different supply items used in the Tombs of Amascut (TOA).
 * Each item type contains a list of item IDs representing different doses/variants.
 *
 * Deobfuscated from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e (GameEnum95/e class)
 */
package gg.squire.autotoa.tasks;

import java.util.List;

/**
 * Enumeration of TOA supply item types with their associated item IDs.
 * Used for identifying and categorizing raid supplies.
 */
public enum TOAItemType {

    /**
     * Tears of Elidinis - Prayer restoration item
     * Item IDs: 27337, 27338, 27339, 27340 (4-dose to 1-dose)
     */
    TEARS_OF_ELIDINIS(List.of(27337, 27338, 27339, 27340)),

    /**
     * Nectar - Healing item
     * Item IDs: 27325, 27326, 27327, 27328 (4-dose to 1-dose)
     */
    NECTAR(List.of(27325, 27326, 27327, 27328)),

    /**
     * Smelling Salts - Boost item
     * Item IDs: 27333, 27334 (2-dose to 1-dose)
     */
    SMELLING_SALTS(List.of(27333, 27334)),

    /**
     * Liquid Adrenaline - Special attack restore
     * Item IDs: 27341, 27342 (2-dose to 1-dose)
     */
    LIQUID_ADRENALINE(List.of(27341, 27342)),

    /**
     * Ambrosia - Full restore item
     * Item IDs: 27329, 27330 (2-dose to 1-dose)
     */
    AMBROSIA(List.of(27329, 27330)),

    /**
     * Blessed Crystal Scarab - Special consumable
     * Item IDs: 27335, 27336 (2-dose to 1-dose)
     */
    BLESSED_CRYSTAL_SCARAB(List.of(27335, 27336)),

    /**
     * Silk Dressing - Healing wrap
     * Item IDs: 27331, 27332 (2-dose to 1-dose)
     */
    SILK_DRESSING(List.of(27331, 27332));

    private final List<Integer> itemIds;

    TOAItemType(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }

    /**
     * Check if the given item ID matches this item type.
     *
     * @param itemId The item ID to check
     * @return true if the item ID is associated with this item type
     */
    public boolean hasItemId(int itemId) {
        return this.itemIds.contains(itemId);
    }

    /**
     * Get all item IDs associated with this item type.
     *
     * @return List of item IDs
     */
    public List<Integer> getItemIds() {
        return this.itemIds;
    }

    /**
     * Find the item type for a given item ID.
     *
     * @param itemId The item ID to look up
     * @return The matching TOAItemType, or null if not found
     */
    public static TOAItemType fromItemId(int itemId) {
        for (TOAItemType type : values()) {
            if (type.hasItemId(itemId)) {
                return type;
            }
        }
        return null;
    }
}
