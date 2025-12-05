/*
 * Deobfuscated from SquireDagannothKings
 * Package: gg.squire.basics.dagannothkings
 *
 * Helper plugin for Dagannoth Kings combat.
 * Tracks spawned loot items and enables interaction helpers.
 *
 * Original obfuscated task classes: ai, ah, ak, ag
 */
package gg.squire.basics.dagannothkings;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;

import java.util.ArrayList;
import java.util.List;

// Task imports
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH;  // LootItem class
import i.i.b.s.c.q.r.s.s.-.u.a.e.ad;  // Task/Manager class
import i.i.b.s.c.q.r.s.s.-.u.a.e.ae;  // Task/Manager class
import i.i.b.s.c.q.r.s.s.-.u.a.e.ag;  // Task 4
import i.i.b.s.c.q.r.s.s.-.u.a.e.ah;  // Task 2
import i.i.b.s.c.q.r.s.s.-.u.a.e.ai;  // Task 1
import i.i.b.s.c.q.r.s.s.-.u.a.e.ak;  // Task 3

/**
 * Dagannoth Kings helper plugin.
 * Tracks loot spawns and manages interaction helpers for DKs combat.
 */
@PluginDescriptor(
    name="Squire Dagannoth Kings",
    description="DK Helper",
    enabledByDefault=false
)
@SquireUtil
public class SquireDagannothKings extends SquirePlugin {

    /** Item name to filter out from loot tracking */
    private static final String EXCLUDED_ITEM = "Coins";

    @Inject
    DagannothKingConfig config;

    @Inject
    private EventBus eventBus;

    @Inject
    private ad dkManager1;

    @Inject
    private ae dkManager2;

    /** List of loot items to pick up */
    List<aH> lootItems;

    /**
     * Constructor initializes loot tracking list.
     */
    public SquireDagannothKings() {
        this.lootItems = new ArrayList<>();
    }

    @Override
    protected void onStart() {
        InteractionManager.setHelper(true);
        eventBus.register(dkManager1);
        eventBus.register(dkManager2);
    }

    @Override
    protected void onStop() {
        InteractionManager.setHelper(false);
        lootItems.clear();
        eventBus.unregister(dkManager1);
        eventBus.unregister(dkManager2);
    }

    /**
     * Provides configuration for dependency injection.
     */
    @Provides
    DagannothKingConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(DagannothKingConfig.class);
    }

    /**
     * Handles item spawn events to track lootable items.
     * Filters out coins and items that can't be picked up.
     *
     * @param event item spawned event
     */
    @Subscribe
    public void onItemSpawned(ItemSpawned event) {
        TileItem tileItem = event.getItem();

        // Skip items that can't be picked up
        if (!tileItem.canPickup()) {
            return;
        }

        // Skip coins
        String itemName = tileItem.getName();
        if (itemName.contains(EXCLUDED_ITEM)) {
            return;
        }

        // Create loot item tracker
        aH lootItem = new aH();
        lootItem.f(tileItem.getId());
        lootItem.i(tileItem.getWorldLocation());

        lootItems.add(lootItem);

        // Debug output
        System.out.println("Adding " +
            Static.getClient().getItemDefinition(lootItem.P()).getName() +
            " to items to loot");
    }

    /**
     * Returns the ordered array of task classes for execution.
     * Tasks handle DKs combat cycle.
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[]{
            ai.class,  // Task 1
            ah.class,  // Task 2
            ak.class,  // Task 3
            ag.class   // Task 4
        };
    }

    // Getters and setters

    public List<aH> getLootItems() {
        return this.lootItems;
    }

    public void setLootItems(List<aH> lootItems) {
        this.lootItems = lootItems;
    }
}
