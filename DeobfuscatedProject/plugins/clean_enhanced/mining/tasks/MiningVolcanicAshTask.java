/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Mining Plugin
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.enums.MiningActivity;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/**
 * Task for mining volcanic ash at Fossil Island.
 * Volcanic ash is used in Herblore for super- and ultra-compost.
 */
@TaskDesc(name="Mining volcanic ash", priority=5)
public class MiningVolcanicAshTask extends Task {

    private static final int VOLCANIC_ASH_PILE_ID = 10108;
    private static final int RUN_ENERGY_THRESHOLD = 179;
    private static final String MINE_ACTION = "Mine";

    private final SquireMinerConfig config;

    @Inject
    public MiningVolcanicAshTask(SquireMinerConfig config) {
        this.config = config;
    }

    @Override
    public boolean run() {
        // Only run this task if volcanic ash activity is selected
        if (config.activity() != MiningActivity.VOLCANIC_ASH) {
            return false;
        }

        Player localPlayer = Players.getLocal();

        // Don't interact if inventory full, player not present, already animating, or moving
        if (Inventory.isFull() || localPlayer == null || localPlayer.isAnimating() || localPlayer.isMoving()) {
            return false;
        }

        // Disable run if enabled and we have sufficient energy
        if (Movement.isRunEnabled() && Movement.getRunEnergy() >= RUN_ENERGY_THRESHOLD) {
            Movement.toggleRun();
        }

        // Find nearest volcanic ash pile
        TileObject volcanicAshPile = TileObjects.getNearest(VOLCANIC_ASH_PILE_ID);

        if (volcanicAshPile == null) {
            System.out.println("No volcanic ash pile found");
            return false;
        }

        // Mine the ash
        volcanicAshPile.interact(MINE_ACTION);
        return true;
    }
}
