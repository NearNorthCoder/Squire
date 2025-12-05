package gg.squire.mixology;

/**
 * Enum representing high-tier herbs used in the Mixology minigame.
 * Includes both raw herbs and unfinished potions (UNF) for each herb type.
 */
public enum HighTierHerbType {
    IRIT_LEAF("Irit leaf", 259),
    CADANTINE("Cadantine", 265),
    LANTADYME("Lantadyme", 2481),
    DWARF_WEED("Dwarf weed", 267),
    TORSTOL("Torstol", 269),
    IRIT_POT_UNF("Irit potion (unf)", 101),
    CADANTINE_POT_UNF("Cadantine potion (unf)", 33),
    LANTA_POT_UNF("Lantadyme potion (unf)", 2483),
    DWARF_WEED_POT_UNF("Dwarf weed potion (unf)", 109),
    TORSTOL_POT_UNF("Torstol potion (unf)", 4454);

    private final String name;
    private final int herbId;

    HighTierHerbType(String name, int herbId) {
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
