package gg.squire.mixology;

/**
 * Enum representing all herb types used in the Mixology minigame.
 * Includes both raw herbs and unfinished potions (UNF) for each herb type,
 * covering the full range from low-tier to high-tier herbs.
 */
public enum AllHerbType {
    GUAM_LEAF("Guam leaf", 249),
    MARRENTILL("Marrentill", 251),
    TARROMIN("Tarromin", 253),
    HARRALANDER("Harralander", 255),
    RANARR_WEED("Ranarr weed", 257),
    TOADFLAX("Toadflax", 2998),
    IRIT_LEAF("Irit leaf", 259),
    AVANTOE("Avantoe", 261),
    KWUARM("Kwuarm", 263),
    SNAPDRAGON("Snapdragon", 3000),
    CADANTINE("Cadantine", 265),
    LANTADYME("Lantadyme", 2485),
    DWARF_WEED("Dwarf weed", 267),
    TORSTOL("Torstol", 269),
    IRIT_POT_UNF("Irit potion (unf)", 91),
    CADANTINE_POT_UNF("Cadantine potion (unf)", 215),
    LANTA_POT_UNF("Lantadyme potion (unf)", 2483),
    DWARF_WEED_POT_UNF("Dwarf weed potion (unf)", 109),
    TORSTOL_POT_UNF("Torstol potion (unf)", 111),
    RANARR_POT_UNF("Ranarr potion (unf)", 99),
    TOADFLAX_POT_UNF("Toadflax potion (unf)", 3002),
    AVANTOE_POT_UNF("Avantoe potion (unf)", 103),
    KWUARM_POT_UNF("Kwuarm potion (unf)", 105),
    SNAPDRAGON_POT_UNF("Snapdragon potion (unf)", 3004),
    GUAM_POT_UNF("Guam potion (unf)", 91),
    MARRENTILL_POT_UNF("Marrentill potion (unf)", 93),
    TARROMIN_POT_UNF("Tarromin potion (unf)", 95),
    HARRALANDER_POT_UNF("Harralander potion (unf)", 97);

    private final String name;
    private final int herbId;

    AllHerbType(String name, int herbId) {
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
