/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Task that handles banking and withdrawing supplies.
 * Uses the configured bank loadout to restock inventory.
 */
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

/**
 * Handles banking operations and inventory restocking.
 * Withdraws items according to the configured bank loadout.
 */
@TaskDesc(name = "Banking", priority = 1337, blocking = true)
public class BankTask extends AbstractBankTask {
    private CompletableFuture<Boolean> withdrawFuture;

    @Inject
    public BankTask(SquireBarrows plugin, SquireBarrowsConfig config) {
        super(plugin, config);
        this.withdrawFuture = null;
    }

    @Override
    protected boolean execute() {
        BankLoadout loadout = this.gearManager.getBankLoadout();
        if (loadout == null) {
            Log.error("No bank loadout configured! Please configure a bank loadout.");
            return false;
        }

        // Open bank if not already open
        if (!Bank.isOpen()) {
            return Bank.open();
        }

        // Deposit inventory if full
        if (Inventory.isFull()) {
            Bank.depositInventory();
        }

        // Check if we need to restock
        if (!needsRestock()) {
            this.plugin.setShouldBank(false);
            return false;
        }

        // Start withdrawal if not already in progress
        if (this.withdrawFuture == null) {
            this.withdrawFuture = BankLoadouts.withdraw(loadout, true);
        }

        // Check if withdrawal is complete
        if (this.withdrawFuture.isDone()) {
            Boolean success = this.withdrawFuture.join();
            if (success) {
                Log.error("Failed to withdraw from bank! Missing required items.");
                this.plugin.setShouldBank(false);
                this.withdrawFuture = null;
                return true;
            }
            Log.info("Successfully restocked from bank");
            Squire.stop();
            return false;
        }

        return true;
    }

    /**
     * Checks if the player needs to restock from the bank.
     * Compares current inventory to the configured loadout.
     *
     * @return True if restocking is needed
     */
    protected boolean needsRestock() {
        BankLoadout loadout = this.config.bankLoadout().selected(BankLoadout.class);
        if (loadout == null) {
            return false;
        }

        InventorySetup setup = loadout.getInventorySetup();
        HashMap<Integer, Integer> requiredItems = new HashMap<>();

        // Count required items from loadout
        for (int itemId : setup.getIds()) {
            int count = requiredItems.getOrDefault(itemId, 0);
            requiredItems.put(itemId, count + 1);
        }

        // Check if we have all required items
        for (Integer itemId : requiredItems.keySet()) {
            if (itemId == -1) {
                continue;
            }
            int requiredCount = requiredItems.get(itemId);
            if (Inventory.getCount(itemId) < requiredCount) {
                Log.info("Need to bank, we're missing " + (requiredCount - Inventory.getCount(itemId)) +
                    " " + Static.getClient().getItemDefinition(itemId).getName() + "s");
                return true;
            }
        }

        return false;
    }
}
