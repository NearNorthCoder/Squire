/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

/**
 * Handles claiming rewards from the reward chest after completing a TOA raid.
 * This task runs outside the raid, at the reward chest in the main area.
 *
 * It will claim items from the chest and optionally bank them if configured.
 */
@TaskDesc(name="Claiming Rewards (Outside)", priority=Integer.MAX_VALUE, blocking=true)
public class ClaimingRewardsOutsideTask extends TOAConfigurableTask {
    // Widget IDs for the reward interface
    private static final int REWARD_CHEST_WIDGET_GROUP = 14299;  // 0x37EB
    private static final int REWARD_CHEST_WIDGET_CHILD = 4;

    @Inject
    protected ClaimingRewardsOutsideTask(Client client, TOAConfig config) {
        super(client, config);
    }

    @Override
    public boolean validate() {
        // Find the rewards niche (chest)
        String[] chestNames = new String[] { "Rewards Niche" };
        TileObject rewardChest = TileObjects.getNearest(chestNames);

        // If no chest exists or it doesn't have a "Claim" action, we're done
        if (rewardChest == null) {
            return false;
        }

        String[] claimAction = new String[] { "Claim" };
        if (!rewardChest.hasAction(claimAction)) {
            return false;
        }

        // Check if the reward interface is open
        Widget rewardWidget = Widgets.get(REWARD_CHEST_WIDGET_GROUP, REWARD_CHEST_WIDGET_CHILD);
        if (Widgets.isVisible(rewardWidget)) {
            Log.info("[ClaimRewardsItems] Banking reward items...");
            rewardWidget.interact("Bank-all");
            return true;
        }

        // Open the reward chest
        Log.info("[ClaimRewardsItems] Claiming reward items...");
        rewardChest.interact("Claim");
        return true;
    }
}
