/*
 * Decompiled with CFR 0.152.
 *
 * Trident Recharging Task
 *
 * This task handles recharging tridents with Zulrah's scales during TOA raids.
 * It recharges tridents when:
 * - Not already processed in current instance
 * - Trident needs charging (toxic/swamp variants)
 * - Has Zulrah's scales in bank
 * - Bank is accessible
 *
 * The task withdraws scales from bank and uses them on the trident.
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Recharging trident", priority=1000, blocking=true, register=true)
public class RechargingTridentTask extends TOAConfigurableTask {

    // Constants - Item IDs
    private static final int ZULRAH_SCALES_ID = 31104; // 0x7980
    private static final int TRIDENT_SEAS_FULL_ID = 21216; // 0x52E0
    private static final int TRIDENT_SEAS_E_ID = 30398; // 0x76BE
    private static final int TRIDENT_SEAS_UNCHARGED_ID = 30880; // 0x78A0
    private static final int TRIDENT_SWAMP_UNCHARGED_ID = 25104; // 0x6210
    private static final int TRIDENT_SWAMP_CHARGED_ID = 9143; // 0x23B7

    // Other constants
    private static final int MAX_SCALES_AMOUNT = 31104;
    private static final int NO_SPECIFIC_TRIDENT = -1;

    private boolean recharged;

    @Inject
    protected RechargingTridentTask(Client client, TOAConfig config) {
        super(client, config);
        this.recharged = false;
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged gameStateChanged) {
        // Reset recharged flag when leaving instance
        if (!this.client.isInInstancedRegion()) {
            this.recharged = false;
        }
    }

    @Override
    public boolean validate() {
        // Don't recharge if already done
        if (this.recharged) {
            return false;
        }

        // Handle dialog continuation
        if (Dialog.canContinue()) {
            this.recharged = true;
        }

        // Handle scale amount input dialog
        if (Dialog.isEnterInputOpen()) {
            Dialog.enterAmount(MAX_SCALES_AMOUNT);
            return true;
        }

        // Find trident in inventory
        Item trident = Inventory.getFirst(item ->
            item.getName().toLowerCase().contains("trident")
        );

        // No trident found
        if (trident == null) {
            return false;
        }

        // Determine which trident variant we have
        boolean isToxicOrSwamp = trident.getName().toLowerCase().contains("toxic") &&
                                 trident.getName().toLowerCase().contains("swamp");

        // Get the appropriate charged trident ID
        int chargedTridentId = isToxicOrSwamp ? TRIDENT_SWAMP_CHARGED_ID : TRIDENT_SEAS_FULL_ID;

        // Get the appropriate uncharged trident ID
        int unchargedTridentId = isToxicOrSwamp ? TRIDENT_SWAMP_UNCHARGED_ID : TRIDENT_SEAS_UNCHARGED_ID;

        // Get the trident ID to use
        int tridentId = g(isToxicOrSwamp);

        // If trident has charges, don't need to recharge
        if (tridentId != NO_SPECIFIC_TRIDENT) {
            // Handle banking for scales
            if (Bank.isOpen()) {
                // Check if bank has scales
                if (!Bank.contains(ZULRAH_SCALES_ID)) {
                    this.recharged = true;
                }

                // Deposit all except trident and scales
                if (Inventory.getFreeSlots() < 5) {
                    Bank.depositAllExcept(
                        trident.getId(),
                        unchargedTridentId,
                        TRIDENT_SEAS_UNCHARGED_ID,
                        TRIDENT_SWAMP_UNCHARGED_ID,
                        TRIDENT_SWAMP_CHARGED_ID
                    );
                    return true;
                }

                // Withdraw all scales
                Bank.withdrawAll(ZULRAH_SCALES_ID, Bank.WithdrawMode.ITEM);
                return true;
            }

            return false;
        }

        // Find Zulrah's scales in inventory
        Item scales = Inventory.getFirst(unchargedTridentId);
        if (scales == null) {
            return false;
        }

        // Use scales on trident
        scales.useOn(trident);
        return true;
    }

    /**
     * Gets the trident ID based on variant
     * @param isToxicSwamp true if toxic/swamp variant
     * @return trident item ID
     */
    public int g(boolean isToxicSwamp) {
        int tridentId = isToxicSwamp ? TRIDENT_SWAMP_CHARGED_ID : TRIDENT_SEAS_E_ID;

        // Check inventory for various trident types
        if (!Inventory.contains(tridentId)) {
            if (Inventory.contains(TRIDENT_SEAS_UNCHARGED_ID)) {
                return TRIDENT_SEAS_UNCHARGED_ID;
            }
            if (Inventory.contains(TRIDENT_SWAMP_UNCHARGED_ID)) {
                return TRIDENT_SWAMP_UNCHARGED_ID;
            }
            if (Inventory.contains(TRIDENT_SWAMP_CHARGED_ID)) {
                return TRIDENT_SWAMP_CHARGED_ID;
            }
        }

        return NO_SPECIFIC_TRIDENT;
    }
}
