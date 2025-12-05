package gg.squire.mining;

/**
 * Enum representing different mining activities supported by the miner plugin.
 */
public enum MiningActivity {
    MOTHERLODE_MINE("Motherlode Mine"),
    SANDSTONE("Sandstone"),
    GEM_ROCKS("Gem rocks"),
    GUILD_IRON("Guild Iron"),
    ARDY_IRON("Ardy Iron"),
    GRANITE("Granite"),
    AMETHYST("Amethyst"),
    VOLCANIC_ASH("Volcanic ash"),
    SUPERHEAT_MINE("Superheat Mine"),
    ESSENCE("Essence"),
    DAEYALT("Daeyalt"),
    BONE_SHARDS("Bone Shards");

    private final String activityName;

    MiningActivity(String activityName) {
        this.activityName = activityName;
    }

    /**
     * Gets the display name of this mining activity.
     *
     * @return the activity name
     */
    public String getActivityName() {
        return activityName;
    }

    @Override
    public String toString() {
        return activityName;
    }
}
