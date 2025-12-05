package gg.squire.leagues.miner;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.leagues.common.LeaguesConstants;
import gg.squire.leagues.common.RockType;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/**
 * Task that handles automated mining of various rock types.
 * Supports both Fossil Island mine and Prifddinas (elf) underground mine locations.
 * Can automatically note ores using a Banker's Note when inventory is full.
 */
@TaskDesc(name = "Mine rocks")
public class MinerTask extends Task {

    // Rock IDs for different ore types in different locations

    /** Runite rock ID at Fossil Island */
    private final int runeRockIdFossilIsland = 36203;

    /** Coal rock ID at Fossil Island */
    private final int coalRockIdFossilIsland = 36204;

    /** Iron rock ID at Fossil Island */
    private final int ironRockIdFossilIsland = 36206;

    /** Soft clay rock ID at Fossil Island */
    private final int softClayRockId = 36210;

    /** Mithril rock ID at Fossil Island */
    private final int mithrilRockIdFossilIsland = 36208;

    /** Gold rock ID */
    private final int goldRockId = 11370;

    /** Adamantite rock ID at Fossil Island */
    private final int addyRockIdFossilIsland = 40494;

    /** Silver rock ID */
    private final int silverRockId = 11367;

    /** Runite rock ID at Prifddinas */
    private final int runeRockIdPrif = 11381;

    /** Adamantite rock ID at Prifddinas */
    private final int addyRockIdPrif = 11375;

    /** Coal rock ID at Prifddinas */
    private final int coalRockIdPrif = 11377;

    /** Mithril rock ID at Prifddinas */
    private final int mithrilRockIdPrif = 11376;

    /** Iron rock ID at Prifddinas */
    private final int ironRockIdPrif = 11365;

    /**
     * Mining area at Fossil Island.
     * Coordinates: (3804, 3807) with size 25x19
     */
    private final WorldArea fossilIslandMiningArea;

    /**
     * Mining area at Prifddinas underground mine.
     * Coordinates: (3293, 12439) with size 59x56
     */
    private final WorldArea prifddinasMiningArea;

    private final MinerConfig config;

    /**
     * Constructs a new MinerTask with the specified configuration.
     *
     * @param config the miner configuration
     */
    @Inject
    public MinerTask(MinerConfig config) {
        this.fossilIslandMiningArea = new WorldArea(3804, 3807, 25, 19, 0);
        this.prifddinasMiningArea = new WorldArea(3293, 12439, 59, 56, 0);
        this.config = config;
    }

    /**
     * Gets the appropriate rock ID based on the configured rock type and player location.
     *
     * @return the rock ID to mine
     */
    private int getRockIdForConfiguredType() {
        RockType rockType = this.config.getRockType();
        boolean isInPrif = this.prifddinasMiningArea.contains(Players.getLocal().getWorldLocation());

        switch (rockType) {
            case RUNE:
                return isInPrif ? runeRockIdPrif : runeRockIdFossilIsland;
            case ADDY:
                return isInPrif ? addyRockIdPrif : addyRockIdFossilIsland;
            case COAL:
                return isInPrif ? coalRockIdPrif : coalRockIdFossilIsland;
            case MITHRIL:
                return isInPrif ? mithrilRockIdPrif : mithrilRockIdFossilIsland;
            case IRON:
                return isInPrif ? ironRockIdPrif : ironRockIdFossilIsland;
            case SOFTCLAY:
                return softClayRockId;
            case GOLD:
                return goldRockId;
            case SILVER:
                return silverRockId;
            default:
                return 0;
        }
    }

    /**
     * Executes the mining task logic.
     *
     * This task will:
     * - Note ores when inventory is full (if banker note is enabled in config)
     * - Mine the configured rock type when player is idle
     * - Support both Fossil Island and Prifddinas mining locations
     *
     * @return false always (task continues running)
     */
    @Override
    public boolean run() {
        // Check if inventory is full and banking with banker's note is enabled
        if (Inventory.isFull() && this.config.getuseBankerNote()) {
            Item bankersNote = Inventory.getFirst(LeaguesConstants.BANKERS_NOTE_ID);

            // Find any ore that needs to be noted (not already noted, and is ore/clay)
            Item oreToNote = Inventory.getFirst(item -> {
                String itemName = item.getName();
                // Exclude items containing "ore" but including other keywords, or items already noted
                return (!itemName.contains("ore") || !itemName.contains("clay") || itemName.contains("Pickaxe"))
                        && !item.isNoted();
            });

            // Note the ore if both banker's note and ore are found
            if (oreToNote != null && bankersNote != null) {
                oreToNote.useOn(bankersNote);
                return false;
            }
        }

        // If player is idle, mine the configured rock
        if (Players.getLocal().isIdle()) {
            boolean isInPrif = this.prifddinasMiningArea.contains(Players.getLocal().getWorldLocation());
            int rockIdToMine = getRockIdForConfiguredType();

            TileObject rockObject;

            if (isInPrif) {
                // In Prifddinas - find rock within the mining area
                rockObject = TileObjects.getNearest(tileObject ->
                        tileObject.getId() == rockIdToMine &&
                        this.fossilIslandMiningArea.contains(tileObject.getWorldLocation())
                );
            } else {
                // At Fossil Island or other location - find any matching rock
                rockObject = TileObjects.getNearest(tileObject ->
                        tileObject.getId() == rockIdToMine
                );
            }

            if (rockObject != null) {
                // Interact with the rock (option 0 is typically "Mine")
                rockObject.interact(0);
                return false;
            }
        }

        return false;
    }
}
