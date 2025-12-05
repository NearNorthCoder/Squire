/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Task that walks the player to the nearest bank.
 * Only runs when banking is needed.
 */
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/**
 * Walks the player to the nearest bank when banking is required.
 */
@TaskDesc(name = "Walking to Bank", priority = 2147470310)
public class WalkToBankTask extends Task {
    private final Client client;
    private final SquireBarrows plugin;
    private final SquireBarrowsConfig config;
    private BankLocation targetBank;

    @Inject
    public WalkToBankTask(Client client, SquireBarrows plugin, SquireBarrowsConfig config) {
        this.client = client;
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public boolean run() {
        // Only walk to bank if banking is enabled
        if (!this.config.useBank()) {
            return false;
        }

        // Only walk if we're logged in
        if (this.client.getGameState() != GameState.LOGGED_IN) {
            return false;
        }

        // Don't walk if banking flag isn't set
        if (!this.plugin.shouldBank()) {
            return false;
        }

        // Don't walk if bank is already open
        if (Bank.isOpen()) {
            return false;
        }

        // Find nearest bank if we don't have one selected
        if (this.targetBank == null) {
            this.targetBank = BankLocation.getNearestCommon();
        }

        // Try to open bank, if that fails, walk to it
        if (!Bank.open()) {
            Log.info("Walking to bank: " + this.targetBank.toString());
            Movement.walkTo(this.targetBank);
        }

        return true;
    }
}
