package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Manages prayer flicking during Chambers of Xeric.
 * Prayer flicking involves toggling prayers on/off rapidly to conserve prayer points
 * while still receiving protection. This is an advanced technique for efficiency.
 *
 * Also handles dodging falling crystals (Olm special attack).
 */
@TaskDesc(name="Prayer Flicking", priority=21000, blocking=true)
public class PrayerFlickingTask extends CoxManager {

    private static final int FALLING_CRYSTAL_GFX = 1357;  // Graphics ID for falling crystals
    private static final int CRYSTAL_IMPACT_GFX = 1358;

    @Inject
    protected PrayerFlickingTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public List<Prayer> getPrayersToActivate() {
        ArrayList<Prayer> prayers = new ArrayList<>();

        Prayer overheadPrayer = equipment.getOverheadPrayer();
        if (overheadPrayer == null) {
            overheadPrayer = Prayer.PROTECT_FROM_MAGIC;
        }

        List<Prayer> offensivePrayers = Prayers.getOffensive();

        prayers.add(overheadPrayer);
        prayers.addAll(offensivePrayers);

        return prayers;
    }

    @Override
    public boolean execute() {
        if (!isInRaidProperlyStarted()) {
            if (Prayers.anyActive()) {
                Prayers.disableAll();
                return false;
            }
            return true;
        }

        if (equipment.shouldWaitForAction()) {
            return true;
        }

        // Check for falling crystals and dodge them
        ArrayList<WorldPoint> crystalTiles = new ArrayList<>();
        for (GraphicsObject gfx : client.getGraphicsObjects()) {
            if (gfx.getId() == FALLING_CRYSTAL_GFX || gfx.getId() == CRYSTAL_IMPACT_GFX) {
                WorldPoint crystalPoint = WorldPoint.fromLocal(client, gfx.getLocation());
                List<WorldPoint> affectedArea = crystalPoint.createWorldArea(1).toWorldPointList();
                crystalTiles.addAll(affectedArea);
            }
        }

        if (crystalTiles.isEmpty()) {
            // No crystals, use safe spot if available
            if (equipment.getSafeSpot() == null) {
                if (player.getWorldLocation().equals(getSafeSpotDestination())) {
                    return true;
                }
                Movement.setDestination(getSafeSpotDestination());
                return false;
            }
            return true;
        }

        // We have crystals, need to move away
        if (crystalTiles.contains(player.getWorldLocation()) ||
            equipment.getSafeSpots().contains(player.getWorldLocation())) {
            return true;
        }

        // Find safe tile to move to
        List<WorldPoint> nearbyTiles = player.getWorldLocation().createWorldArea(4).toWorldPointList();
        WorldPoint safeTile = nearbyTiles.stream()
            .filter(tile -> isSafeTile(crystalTiles, tile))
            .min(Comparator.comparingInt(tile -> tile.distanceTo(player))
                .thenComparingDouble(tile -> tile.distanceTo2DHypotenuse(getSafeSpotDestination())))
            .orElse(null);

        if (safeTile != null) {
            Movement.setDestination(safeTile);
        }
        return false;
    }

    /**
     * Checks if a tile is safe from falling crystals and reachable
     */
    private boolean isSafeTile(List<WorldPoint> crystalTiles, WorldPoint tile) {
        return Reachable.isWalkable(tile) &&
               !crystalTiles.contains(tile) &&
               !equipment.getSafeSpots().contains(player.getWorldLocation());
    }

    /**
     * Gets the safe spot destination based on current Olm phase
     */
    private WorldPoint getSafeSpotDestination() {
        switch (equipment.getCurrentPhase()) {
            case 0:
                return getMeleeHandSafeSpot();
            case 1:
                return getMageHandSafeSpot();
            default:
                return getNearestRoom().getWorldLocation().dy(5);
        }
    }

    private WorldPoint getMeleeHandSafeSpot() {
        // Implementation would depend on room layout
        return getNearestRoom().getWorldLocation().dy(5);
    }

    private WorldPoint getMageHandSafeSpot() {
        // Implementation would depend on room layout
        return getNearestRoom().getWorldLocation().dy(5);
    }

    @Override
    public EquipmentSetup getEquipmentSetup() {
        return null;
    }
}
