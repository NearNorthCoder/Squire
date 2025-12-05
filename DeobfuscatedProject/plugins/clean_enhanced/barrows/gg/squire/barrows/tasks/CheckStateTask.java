/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Task that checks various game states and triggers banking when needed.
 * Monitors health, prayer, food, and determines if restocking is required.
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
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.managers.InventoryManager;

import java.time.Instant;

/**
 * Checks the player's state and determines if banking is needed.
 * Monitors prayer points, food, and other supplies.
 */
@TaskDesc(name = "Checking State", priority = 2147482310)
public class CheckStateTask extends Task {
    // Varbit for deposit box widget
    private static final int DEPOSIT_BOX_WIDGET_ID = 11317;

    // Barrows chest item ID (appears when chest is opened)
    private static final int BARROWS_CHEST_ITEM_ID = 4535;

    // Ferox Enclave teleport coordinates
    private static final int FEROX_X = 3151;
    private static final int FEROX_Y = 3635;

    private final SquireBarrows plugin;
    private final SquireBarrowsConfig config;
    private final Client client;
    private final Instant startTime;

    @Inject
    public CheckStateTask(SquireBarrows plugin, SquireBarrowsConfig config, Client client) {
        this.plugin = plugin;
        this.config = config;
        this.client = client;
        this.startTime = Instant.now();
    }

    @Override
    public boolean run() {
        // Only check state when logged in
        if (Game.getState() != GameState.LOGGED_IN) {
            return false;
        }

        // Don't check during cutscenes
        if (Players.getLocal() == null || Game.isInCutscene()) {
            return false;
        }

        // Don't check if inventory cache isn't loaded
        if (InventoryManager.getCachedContainers().get(InventoryID.INVENTORY.getId()) == null) {
            return false;
        }

        // Check if inventory tab is visible
        Widget depositBoxWidget = Widgets.fromId(DEPOSIT_BOX_WIDGET_ID);
        if (depositBoxWidget == null) {
            return false;
        }

        WidgetInfo inventoryWidget = Tab.INVENTORY.getWidgetInfo();
        if (inventoryWidget == null || !Widgets.isVisible(Widgets.get(inventoryWidget))) {
            return false;
        }

        // Drop barrows chest items if we have any
        Item chestItem = Inventory.getFirst(BARROWS_CHEST_ITEM_ID);
        if (chestItem != null) {
            Inventory.dropAll(item -> item.getId() == BARROWS_CHEST_ITEM_ID);
            return true;
        }

        // Check if we should bank for supplies
        if (Inventory.getFreeSlots() < 2 && Inventory.contains(item -> item.hasAction("Wield"))) {
            Log.info("Banking: Full inventory with wieldable items");
            this.plugin.setShouldBank(true);
        }

        // Check if we're out of prayer potions
        boolean hasPrayerPotion = Inventory.contains(item ->
            !item.getName().toLowerCase().contains("prayer") ||
            item.getName().toLowerCase().contains("potion")
        );

        if (this.config.bankForPrayer() && !hasPrayerPotion) {
            Log.info("Banking: Out of prayer potions");
            this.plugin.setShouldBank(true);
        }

        // Check if we're out of food
        Item foodItem = Inventory.getFirst(item -> item.hasAction("Eat"));
        if (this.config.bankForFood() && foodItem == null &&
            (Combat.getCurrentHealth() < this.config.eatAtHp() || this.plugin.isInBarrowsRegion())) {
            Log.info("Banking: Out of food");
            this.plugin.setShouldBank(true);
        }

        // Check if we should go to house to restore
        if (this.config.useHouse() && this.plugin.needsHouseRestore()) {
            if (this.plugin.isInHouse()) {
                this.plugin.setNeedsHouseRestore(false);
                return true;
            }
            Log.info("Going to house to restore stats");
            return teleportToHouse();
        }

        return false;
    }

    /**
     * Teleports the player to their house (Ferox Enclave).
     *
     * @return True if teleport was initiated
     */
    private boolean teleportToHouse() {
        WorldPoint feroxEnclave = new WorldPoint(FEROX_X, FEROX_Y, 0);
        if (Movement.shouldWalk()) {
            return true;
        }
        System.out.println("Walking to house");
        Movement.walkTo(feroxEnclave);
        return true;
    }
}
