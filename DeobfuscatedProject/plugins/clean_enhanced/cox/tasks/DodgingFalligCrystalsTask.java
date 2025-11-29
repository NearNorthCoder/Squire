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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Dodges falling crystals during the Great Olm fight in Chambers of Xeric.
 * Falling crystals are a special attack from Olm that deals massive damage if not avoided.
 * This task detects crystal spawn graphics and moves the player to safe tiles.
 */
@TaskDesc(name="Dodging Falling Crystals", priority=21000)
public class DodgingFallingCrystalsTask extends CoxManager {

    private static final int FALLING_CRYSTAL_GFX = 1357;

    @Inject
    protected DodgingFallingCrystalsTask(SquireChambersPlugin plugin,
                                         SquireChambersConfig config,
                                         Client client) {
        super(plugin, config, client);
    }

    @Override
    public boolean execute() {
        if (!isInRaidProperlyStarted()) {
            return false;
        }

        // Collect all tiles with falling crystals
        ArrayList<WorldPoint> dangerousTiles = new ArrayList<>();

        for (GraphicsObject gfx : client.getGraphicsObjects()) {
            if (gfx.getId() == FALLING_CRYSTAL_GFX) {
                WorldPoint crystalPoint = WorldPoint.fromLocal(client, gfx.getLocation());
                List<WorldPoint> affectedArea = crystalPoint.createWorldArea(1).toWorldPointList();
                dangerousTiles.addAll(affectedArea);
            }
        }

        // If no crystals, we're safe
        if (dangerousTiles.isEmpty() || !dangerousTiles.contains(player.getWorldLocation())) {
            return false;
        }

        // Find safe tile to move to
        List<WorldPoint> nearbyTiles = player.getWorldLocation().createWorldArea(3).toWorldPointList();
        WorldPoint safeTile = nearbyTiles.stream()
            .filter(tile -> isSafeTile(dangerousTiles, tile))
            .min(Comparator.comparingInt(tile -> tile.distanceTo(player)))
            .orElse(null);

        if (safeTile != null) {
            movement.setDestination(safeTile);
        }

        return true;
    }

    /**
     * Check if a tile is safe (walkable and not in danger zone)
     */
    private boolean isSafeTile(List<WorldPoint> dangerousTiles, WorldPoint tile) {
        return Reachable.isWalkable(tile) && !dangerousTiles.contains(tile);
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
    public EquipmentSetup getEquipmentSetup() {
        return null;
    }
}
