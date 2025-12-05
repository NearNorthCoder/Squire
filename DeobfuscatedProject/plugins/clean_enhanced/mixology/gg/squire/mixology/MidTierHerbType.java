package gg.squire.mixology;

/**
 * Enum representing mid-tier herbs used in the Mixology minigame.
 * Includes both raw herbs and unfinished potions (UNF) for each herb type.
 */
public enum MidTierHerbType {
    RANARR_WEED("Ranarr weed", 257),
    TOADFLAX("Toadflax", 2998),
    AVANTOE("Avantoe", 261),
    KWUARM("Kwuarm", 263),
    SNAPDRAGON("Snapdragon", 3000),
    RANARR_POT_UNF("Ranarr potion (unf)", 99),
    TOADFLAX_POT_UNF("Toadflax potion (unf)", 3002),
    AVANTOE_POT_UNF("Avantoe potion (unf)", 103),
    KWUARM_POT_UNF("Kwuarm potion (unf)", 105),
    SNAPDRAGON_POT_UNF("Snapdragon potion (unf)", 4462);

    private final String name;
    private final int herbId;

    MidTierHerbType(String name, int herbId) {
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
