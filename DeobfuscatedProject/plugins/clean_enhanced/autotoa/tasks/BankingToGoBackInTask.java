/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;

/**
 * Handles banking before going back into a TOA raid.
 * This task manages withdrawing items from the bank and equipping gear
 * based on the configured bank loadout.
 *
 * The task will:
 * 1. Check if banking is needed
 * 2. Handle bank PIN if required
 * 3. Withdraw items from bank loadout
 * 4. Close the bank when done
 */
@TaskDesc(name="Banking to go back in", priority=10, blocking=true)
public class BankingToGoBackInTask extends TOAConfigurableTask {
    // Maximum number of retry attempts for withdrawing
    private static final int MAX_WITHDRAW_RETRIES = 5;

    @Inject
    protected BankingToGoBackInTask(Client client, TOAConfig config) {
        super(client, config);
    }

    @Override
    public boolean validate() {
        BankLoadout loadout = (BankLoadout) this.config.loadout().selected(BankLoadout.class);

        // Check if we actually need to bank
        if (!loadout.needsToBank()) {
            Log.info("[BankForItems] We don't need to bank");
            return false;
        }

        // Wait for bank PIN window if it's open
        if (Bank.isPinWindowOpen()) {
            Log.info("[BankForItems] Pin window is open... waiting");
            return true;
        }

        // If bank is not open, open it
        if (!Bank.isOpen()) {
            String[] bankCamelNames = new String[] { "Bank Camel" };
            TileObject bankCamel = TileObjects.getNearest(bankCamelNames);
            if (bankCamel == null) {
                return false;
            }

            bankCamel.interact("Bank");
            return true;
        }

        // Bank is open, try to withdraw items
        if (!BankLoadouts.withdrawWithRetries(loadout, MAX_WITHDRAW_RETRIES)) {
            Log.info("[BankForItems] After 5 tries, still not equipping the right stuff");
            return false;
        }

        return true;
    }
}
