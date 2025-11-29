/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.util.List;

/**
 * Represents special supplies and items available in Tombs of Amascut.
 * These items can be found and used during the raid.
 */
public enum TOASupply {
    TEARS_OF_ELIDINIS(List.of(31486, 31485, 31483, 31476)),
    NECTAR(List.of(31463, 31455, 31439, 31421)),
    SMELLING_SALTS(List.of(31457, 31449)),
    LIQUID_ADRENALINE(List.of(31446, 27341)),
    AMBROSIA(List.of(31445, 31421)),
    BLESSED_CRYSTAL_SCARAB(List.of(32247, 32201)),
    SILK_DRESSING(List.of(27647, 27556));

    private final List<Integer> itemIds;

    TOASupply(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }

    /**
     * Gets the list of item IDs for this supply.
     * @return list of item IDs
     */
    public List<Integer> getItemIds() {
        return this.itemIds;
    }

    /**
     * Checks if this supply contains a specific item ID.
     * @param itemId the item ID to check
     * @return true if this supply contains the item ID
     */
    public boolean containsItem(int itemId) {
        return this.itemIds.contains(itemId);
    }

    /**
     * Finds a supply type by item ID.
     * @param itemId the item ID to search for
     * @return the matching TOASupply, or null if not found
     */
    public static TOASupply fromItemId(int itemId) {
        for (TOASupply supply : values()) {
            if (supply.containsItem(itemId)) {
                return supply;
            }
        }
        return null;
    }
}
