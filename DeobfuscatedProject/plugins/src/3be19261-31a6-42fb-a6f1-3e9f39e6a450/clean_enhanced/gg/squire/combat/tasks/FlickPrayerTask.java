package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.AttackStyle;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.Actor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

import javax.inject.Inject;
import java.util.List;

/**
 * Task responsible for prayer flicking during combat.
 * Activates appropriate prayers based on attack style and deactivates when not in combat.
 * Priority: 15 (high priority to maximize prayer efficiency)
 */
@TaskDesc(name = "Flicking Prayer", priority = 15)
public class FlickPrayerTask extends Task {
    private final SquireBlueDragonKiller plugin;
    private final SquireBlueDragonKillerConfig config;

    @Inject
    public FlickPrayerTask(SquireBlueDragonKiller plugin, SquireBlueDragonKillerConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public boolean run() {
        // Only flick if enabled in config
        if (!config.flickPrayer()) {
            return false;
        }

        // Can't flick without prayer points
        if (Prayers.getPoints() == 0) {
            return false;
        }

        Actor target = Players.getLocal().getInteracting();

        // If not in combat or target is not attackable, disable prayers
        if (target == null || !target.hasAction("Pickaxe")) {
            if (Prayers.anyActive()) {
                Prayers.disableAll();
                return true;
            }
            return false;
        }

        // Flick appropriate prayers based on attack style
        List prayers;
        if (config.attackStyle() == AttackStyle.MELEE) {
            prayers = Prayers.getMeleePrayer();
        } else if (config.attackStyle() == AttackStyle.RANGE) {
            prayers = Prayers.getRangePrayers();
        } else {
            prayers = Prayers.getMagePrayers();
        }

        return Prayers.flick(prayers);
    }
}
