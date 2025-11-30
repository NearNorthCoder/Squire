/*
 * Consumable Manager for TOA Raids
 *
 * Manages consumable item usage during Tombs of Amascut raids.
 * Handles:
 * - Consumable cooldowns (tick-based)
 * - Supply tracking from raid supply widget
 * - Region-based special item restrictions
 */
package gg.squire.autotoa.tasks;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/**
 * Singleton class that manages consumable item usage in TOA raids.
 *
 * Tracks item consumption cooldowns and supply quantities from the raid supply widget.
 * Provides methods to check if items can be consumed and records consumption events.
 */
@Singleton
public class ConsumableManager {

    // Cooldown between consumable uses (in game ticks)
    private static final int CONSUMPTION_COOLDOWN_TICKS = 4;

    // Health thresholds for brewing decisions
    private static final int COMBAT_HEALTH_THRESHOLD = 79;
    private static final int NO_COMBAT_HEALTH_THRESHOLD = 30;
    private static final int SPECIAL_MODE_HEALTH_THRESHOLD = 70;
    private static final int CRITICAL_HEALTH_THRESHOLD = 35;

    // TOA Supply widget IDs
    private static final int SUPPLY_WIDGET_GROUP = 774;
    private static final int SUPPLY_WIDGET_CHILD = 0;

    // Akkha room region IDs for special item restrictions
    private static final int AKKHA_REGION_1 = 14676;
    private static final int AKKHA_REGION_2 = 16435;

    // Tracks quantities of each supply type
    private final Map<TOAItemType, Integer> supplyQuantities;

    // Tick of last item usage (for rate limiting)
    private int lastItemUseTick;

    // Tick of last consumption (for cooldown)
    private int lastConsumptionTick;

    /**
     * Creates a new ConsumableManager instance.
     */
    public ConsumableManager() {
        this.supplyQuantities = new HashMap<>();
    }

    /**
     * Checks if player is in one of the specified map regions.
     *
     * @param regionId The region ID to check for
     * @return true if in the specified region
     */
    public boolean isInRegion(int regionId) {
        int[] regions = Static.getClient().getMapRegions();
        for (int region : regions) {
            if (region == regionId) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if player is in special weapon mode (Akkha rooms).
     * In these regions, special item restrictions apply.
     *
     * @return true if in special weapon mode regions
     */
    public boolean isInSpecialWeaponMode() {
        return !isInRegion(AKKHA_REGION_1) || isInRegion(AKKHA_REGION_2);
    }

    /**
     * Checks if an item can be consumed (not on cooldown).
     *
     * @return true if consumption cooldown has elapsed
     */
    public boolean canConsumeItem() {
        int currentTick = Static.getClient().getTickCount();
        return currentTick - lastConsumptionTick >= CONSUMPTION_COOLDOWN_TICKS
            && currentTick - lastItemUseTick >= CONSUMPTION_COOLDOWN_TICKS;
    }

    /**
     * Checks if silk/item use cooldown has elapsed.
     *
     * @return true if item use cooldown has elapsed
     */
    public boolean canUseItem() {
        return Static.getClient().getTickCount() - lastItemUseTick >= CONSUMPTION_COOLDOWN_TICKS;
    }

    /**
     * Checks if consumption has been recorded recently.
     *
     * @return true if consumed within cooldown period
     */
    public boolean hasRecentConsumption() {
        return Static.getClient().getTickCount() - lastConsumptionTick > 0;
    }

    /**
     * Records a consumption event for cooldown tracking.
     */
    public void recordConsumption() {
        this.lastConsumptionTick = Static.getClient().getTickCount();
    }

    /**
     * Records an item use event (for silk, etc.).
     */
    public void recordItemUse() {
        this.lastItemUseTick = Static.getClient().getTickCount();
    }

    /**
     * Checks if a brew (nectar) should be consumed based on health.
     * Takes into account combat status and special item modes.
     *
     * @return true if player should drink a brew
     */
    public boolean isBrewAvailable() {
        // Get NPCs attacking the player
        List<NPC> attackingNpcs = NPCs.getAll(npc ->
            npc.getInteracting() == Players.getLocal()
        );

        // Check for Obelisk (special case)
        NPC obelisk = NPCs.getNearest(npc ->
            npc.getName() != null && npc.getName().contains("Obelisk")
        );

        // If Obelisk present, need to be below critical health
        if (obelisk != null) {
            return Combat.getCurrentHealth() < CRITICAL_HEALTH_THRESHOLD;
        }

        // If in special weapon mode, check against special threshold
        if (isInSpecialWeaponMode()) {
            return Combat.getCurrentHealth() < SPECIAL_MODE_HEALTH_THRESHOLD;
        }

        // Determine health threshold based on combat status
        int healthThreshold;
        if (attackingNpcs.isEmpty()) {
            healthThreshold = NO_COMBAT_HEALTH_THRESHOLD;
        } else {
            healthThreshold = COMBAT_HEALTH_THRESHOLD;
        }

        return Combat.getCurrentHealth() < healthThreshold;
    }

    /**
     * Checks if player health is critically low.
     *
     * @return true if health is at or below critical threshold
     */
    public boolean isCriticalHealth() {
        return Combat.getCurrentHealth() <= CRITICAL_HEALTH_THRESHOLD;
    }

    /**
     * Gets the supply widget from the TOA raid interface.
     *
     * @return The supply widget or null if not found
     */
    public Widget getSupplyWidget() {
        return Widgets.get(SUPPLY_WIDGET_GROUP, SUPPLY_WIDGET_CHILD);
    }

    /**
     * Checks if the supply container widget is open and visible.
     *
     * @return true if supply widget is visible
     */
    public boolean isSuppliesContainerOpen() {
        return Widgets.isVisible(getSupplyWidget());
    }

    /**
     * Gets the current supply quantities.
     *
     * @return Map of supply types to quantities
     */
    public Map<TOAItemType, Integer> getSupplyQuantity() {
        return this.supplyQuantities;
    }

    /**
     * Withdraws a supply item from the TOA supply container.
     *
     * @param supplyType The type of supply to withdraw
     */
    public void withdrawSupply(TOAItemType supplyType) {
        Widget supplyWidget = getSupplyWidget();
        if (supplyWidget == null || supplyWidget.getChildren() == null) {
            return;
        }

        for (Widget child : supplyWidget.getChildren()) {
            if (supplyType.hasItemId(child.getItemId())) {
                if (child.getItemId() != -1) {
                    // Decrement supply count
                    int currentCount = supplyQuantities.getOrDefault(supplyType, 0) - 1;
                    if (currentCount <= 0) {
                        supplyQuantities.remove(supplyType);
                    } else {
                        supplyQuantities.put(supplyType, currentCount);
                    }

                    child.interact("Withdraw-1");
                    return;
                }
            }
        }
    }

    /**
     * Updates supply quantities from a widget.
     *
     * @param widget The supply widget to read from
     */
    public void updateSuppliesFromWidget(Widget widget) {
        if (widget == null || widget.getChildren() == null) {
            return;
        }

        for (Widget child : widget.getChildren()) {
            int itemId = child.getItemId();
            if (itemId != -1) {
                TOAItemType itemType = TOAItemType.fromItemId(itemId);
                int currentCount = supplyQuantities.getOrDefault(itemType, 0);
                supplyQuantities.put(itemType, currentCount + child.getItemQuantity());
            }
        }
    }

    /**
     * Handles game state changes - clears supplies when leaving instances.
     */
    @Subscribe
    public void onGameStateChanged(GameStateChanged event) {
        if (event.getGameState() == GameState.LOGGED_IN
            && !Static.getClient().isInInstancedRegion()) {
            supplyQuantities.clear();
        }
    }

    /**
     * Handles widget loads - updates supplies when supply widget appears.
     */
    @Subscribe
    public void onWidgetLoaded(WidgetLoaded event) {
        if (event.getGroupId() == SUPPLY_WIDGET_GROUP) {
            Widget supplyWidget = getSupplyWidget();
            if (supplyWidget == null || supplyWidget.getChildren() == null) {
                return;
            }

            // Clear and re-count supplies
            supplyQuantities.clear();

            for (Widget child : supplyWidget.getChildren()) {
                if (child.getItemId() != -1) {
                    TOAItemType itemType = TOAItemType.fromItemId(child.getItemId());
                    int currentCount = supplyQuantities.getOrDefault(itemType, 0);
                    supplyQuantities.put(itemType, currentCount + child.getItemQuantity());
                }
            }
        }
    }
}
