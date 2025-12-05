package gg.squire.mixology;

/**
 * Enum representing low-tier herbs used in the Mixology minigame.
 * Includes both raw herbs and unfinished potions (UNF) for each herb type.
 */
public enum LowTierHerbType {
    GUAM_LEAF("Guam leaf", 249),
    MARRENTILL("Marrentill", 251),
    TARROMIN("Tarromin", 253),
    HARRALANDER("Harralander", 255),
    GUAM_POT_UNF("Guam potion (unf)", 91),
    MARRENTILL_POT_UNF("Marrentill potion (unf)", 93),
    TARROMIN_POT_UNF("Tarromin potion (unf)", 95),
    HARRALANDER_POT_UNF("Harralander potion (unf)", 97);

    private final String name;
    private final int herbId;

    LowTierHerbType(String name, int herbId) {
        this.name = name;
        this.herbId = herbId;
    }

    /**
     * Gets the display name of the herb.
     *
     * @return the herb name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the item ID of the herb.
     *
     * @return the herb ID
     */
    public int getHerbId() {
        return herbId;
    }
}
