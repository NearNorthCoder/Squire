package gg.squire.mixology;

/**
 * Enum representing all potion types available in the Mixology minigame.
 * Each potion has unique properties including item IDs, lever values, XP rewards, and reward types.
 */
public enum PotionType {
    LIPLACK_LIQUOR("Liplack liquor", 32043, 32075, 3, 3, 3, 180, "Mox"),
    ALCO_AUGMENTATOR("Alco-augmentator", 32045, 32077, 2, 2, 2, 180, "Aga"),
    MAMMOTH_MIGHT("Mammoth-might", 32047, 32079, 1, 1, 1, 180, "Lye"),
    MYSTIC_MANA_AMALGAM("Mystic mana amalgam", 32049, 32081, 1, 1, 2, 200, "Mox"),
    MARLEYS_MOONLIGHT("Marley's moonlight", 32051, 32083, 1, 1, 3, 220, "Aga"),
    AZURE_AURA_MIX("Azure aura mix", 32053, 32085, 2, 2, 1, 240, "Lye"),
    AQUALUX_AMALGAM("Aqualux amalgam", 32055, 32087, 2, 3, 2, 260, "Mox"),
    MEGALITE_LIQUID("Megalite liquid", 32057, 32089, 1, 3, 3, 280, "Aga"),
    ANTI_LEECH_LOTION("Anti-leech lotion", 32059, 32091, 2, 3, 3, 300, "Mox"),
    MIXALOT("Mixalot", 32061, 32093, 1, 2, 3, 320, "Lye");

    private final String name;
    private final int unfinishedID;
    private final int finishedID;
    private final int lever1Value;
    private final int lever2Value;
    private final int lever3Value;
    private final int xpReward;
    private final String rewardType;

    /**
     * Constructor for PotionType enum.
     *
     * @param name         Display name of the potion
     * @param unfinishedID Item ID of the unfinished potion
     * @param finishedID   Item ID of the finished potion
     * @param lever1Value  Required value for lever 1
     * @param lever2Value  Required value for lever 2
     * @param lever3Value  Required value for lever 3
     * @param xpReward     Experience points rewarded for completing this potion
     * @param rewardType   Type of reagent reward (Mox, Aga, or Lye)
     */
    PotionType(String name, int unfinishedID, int finishedID, int lever1Value,
               int lever2Value, int lever3Value, int xpReward, String rewardType) {
        this.name = name;
        this.unfinishedID = unfinishedID;
        this.finishedID = finishedID;
        this.lever1Value = lever1Value;
        this.lever2Value = lever2Value;
        this.lever3Value = lever3Value;
        this.xpReward = xpReward;
        this.rewardType = rewardType;
    }

    /**
     * Gets the display name of the potion.
     *
     * @return the potion name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the item ID of the unfinished potion.
     *
     * @return the unfinished potion item ID
     */
    public int getUnfinishedID() {
        return unfinishedID;
    }

    /**
     * Gets the item ID of the finished potion.
     *
     * @return the finished potion item ID
     */
    public int getFinishedID() {
        return finishedID;
    }

    /**
     * Gets the required value for lever 1.
     *
     * @return lever 1 value (1-3)
     */
    public int getLever1Value() {
        return lever1Value;
    }

    /**
     * Gets the required value for lever 2.
     *
     * @return lever 2 value (1-3)
     */
    public int getLever2Value() {
        return lever2Value;
    }

    /**
     * Gets the required value for lever 3.
     *
     * @return lever 3 value (1-3)
     */
    public int getLever3Value() {
        return lever3Value;
    }

    /**
     * Gets the experience points rewarded for completing this potion.
     *
     * @return the XP reward
     */
    public int getXpReward() {
        return xpReward;
    }

    /**
     * Gets the type of reagent reward (Mox, Aga, or Lye).
     *
     * @return the reward type
     */
    public String getRewardType() {
        return rewardType;
    }
}
