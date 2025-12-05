/*
 * Deobfuscated from SquireCerberus
 * Package: gg.squire.basics.cerberus
 *
 * Main plugin class for automated Cerberus killing.
 * Handles combat, banking, looting, and task management.
 *
 * Original obfuscated classes referenced:
 *   Task classes: u, j, t, w, r, v, n, k, q, o, m, A, z, l, y, s, x
 */
package gg.squire.basics.cerberus;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.cerberus.overlay.CerberusOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.ChatMessageType;
import net.runelite.api.ItemComposition;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

// Task imports - these are obfuscated task classes
import i.i.b.s.c.q.r.s.s.-.u.a.e.A;  // Task 13
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;  // CerberusManager
import i.i.b.s.c.q.r.s.s.-.u.a.e.h;  // LootItem
import i.i.b.s.c.q.r.s.s.-.u.a.e.j;  // Task 2
import i.i.b.s.c.q.r.s.s.-.u.a.e.k;  // Task 8
import i.i.b.s.c.q.r.s.s.-.u.a.e.l;  // Task 14
import i.i.b.s.c.q.r.s.s.-.u.a.e.m;  // Task 11
import i.i.b.s.c.q.r.s.s.-.u.a.e.n;  // Task 7
import i.i.b.s.c.q.r.s.s.-.u.a.e.o;  // Task 10
import i.i.b.s.c.q.r.s.s.-.u.a.e.q;  // Task 9
import i.i.b.s.c.q.r.s.s.-.u.a.e.r;  // Task 5
import i.i.b.s.c.q.r.s.s.-.u.a.e.s;  // Task 16
import i.i.b.s.c.q.r.s.s.-.u.a.e.t;  // Task 3
import i.i.b.s.c.q.r.s.s.-.u.a.e.u;  // Task 1
import i.i.b.s.c.q.r.s.s.-.u.a.e.v;  // Task 6
import i.i.b.s.c.q.r.s.s.-.u.a.e.w;  // Task 4
import i.i.b.s.c.q.r.s.s.-.u.a.e.x;  // Task 17
import i.i.b.s.c.q.r.s.s.-.u.a.e.y;  // Task 15
import i.i.b.s.c.q.r.s.s.-.u.a.e.z;  // Task 13

/**
 * Squire Cerberus plugin for automated Cerberus boss killing.
 * Handles all aspects of combat including:
 * - Prayer management
 * - Food consumption
 * - Special attacks
 * - Ghost dodging
 * - Loot collection
 * - Banking for supplies
 */
@PluginDescriptor(
    name="Squire Cerberus",
    description="Kills Cerberus for you, banks and loots items.",
    enabledByDefault=false
)
@SquireUtil
public class SquireCerberus extends SquirePlugin {

    /** Chat message fragment for Cerberus kill count: "Your Cerberus kill count" */
    private static final String KILL_COUNT_MESSAGE = "Your Cerberus kill count";

    @Inject
    private SquireCerberusConfig config;

    @Inject
    private CerberusOverlay overlay;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private EventBus eventBus;

    @Inject
    private ItemManager itemManager;

    /** Manager for Cerberus-specific game state */
    @Inject
    private a cerberusManager;  // CerberusManager class

    /** List of items looted during session */
    List<h> lootedItems;

    /** Total Cerberus kill count for session */
    private int killCount;

    /** Ghost phase active flag */
    private boolean ghostPhaseActive;

    /**
     * Constructor initializes loot tracking list.
     */
    public SquireCerberus() {
        this.lootedItems = new ArrayList<>();
    }

    @Override
    protected void onStart() {
        overlayManager.add(overlay);
        cerberusManager.a(); // Initialize manager
        eventBus.register(cerberusManager);
    }

    @Override
    protected void onStop() {
        overlayManager.remove(overlay);
        cerberusManager.a(); // Cleanup manager
        eventBus.register(cerberusManager);
    }

    /**
     * Provides configuration for dependency injection.
     */
    @Provides
    SquireCerberusConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireCerberusConfig.class);
    }

    /**
     * Handles loot received events.
     * Tracks looted items with their prices and alch values.
     */
    @Subscribe
    public void onLootReceived(LootReceived lootReceived) {
        lootReceived.getItems().forEach(itemStack -> {
            h lootItem = new h();  // LootItem class
            lootItem.a(Instant.now());

            ItemComposition itemComposition = itemManager.getItemComposition(itemStack.getId());
            int itemPrice = Prices.getItemPrice(itemStack.getId());

            lootItem.a(itemComposition.getName());
            lootItem.f(itemStack.getId());
            lootItem.g(itemPrice);
            lootItem.h(itemManager.getAlchValue(itemComposition));

            this.lootedItems.add(lootItem);
        });
    }

    /**
     * Handles chat messages to track kill count.
     * Increments counter when kill count message is detected.
     */
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        if (chatMessage.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }

        String message = chatMessage.getMessage();
        if (message.contains(KILL_COUNT_MESSAGE)) {
            this.killCount++;
            cerberusManager.a(1); // Increment manager kill count
        }
    }

    /**
     * Returns the ordered array of task classes for execution.
     * Tasks handle different aspects of Cerberus combat cycle.
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[]{
            u.class,  // Task 1 - likely initialization
            j.class,  // Task 2
            t.class,  // Task 3
            w.class,  // Task 4
            r.class,  // Task 5
            v.class,  // Task 6
            n.class,  // Task 7
            k.class,  // Task 8
            q.class,  // Task 9
            o.class,  // Task 10
            m.class,  // Task 11
            A.class,  // Task 12
            z.class,  // Task 13
            l.class,  // Task 14
            y.class,  // Task 15
            s.class,  // Task 16
            x.class   // Task 17
        };
    }

    // Getters and setters

    public int getKillCount() {
        return this.killCount;
    }

    public void setKillCount(int killCount) {
        this.killCount = killCount;
    }

    public boolean isGhostPhaseActive() {
        return this.ghostPhaseActive;
    }

    public void setGhostPhaseActive(boolean ghostPhaseActive) {
        this.ghostPhaseActive = ghostPhaseActive;
    }

    public List<h> getLootedItems() {
        return this.lootedItems;
    }

    public void setLootedItems(List<h> lootedItems) {
        this.lootedItems = lootedItems;
    }
}
