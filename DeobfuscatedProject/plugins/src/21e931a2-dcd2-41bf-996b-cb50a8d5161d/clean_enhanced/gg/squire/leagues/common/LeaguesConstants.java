package gg.squire.leagues.common;

/**
 * Constants used across Leagues utility plugins.
 * This class contains item IDs and other constant values used by various Leagues plugins.
 */
public class LeaguesConstants {

    /**
     * Item ID for Banker's Note (used in Leagues to note/unnote items).
     * This is a special item that allows converting items between noted and unnoted forms.
     */
    public static final int BANKERS_NOTE_ID = 30047;

    /**
     * Secondary constant value used by some plugins.
     * Value: 24463
     */
    public static final int SECONDARY_CONSTANT = 24463;

    // Private constructor to prevent instantiation
    private LeaguesConstants() {
        throw new UnsupportedOperationException("Utility class");
    }
}
