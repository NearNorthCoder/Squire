package gg.squire.combat;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.combat.overlays.PluginInfoBox;
import gg.squire.combat.tasks.*;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.ItemComposition;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

import javax.inject.Inject;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Blue Dragon Killer plugin for Squire.
 * Automatically kills blue dragons, loots drops, and banks when inventory is full.
 * Supports multiple dragon locations and combat styles (melee, magic, ranged).
 */
@PluginDescriptor(
    name = "Squire Blue Dragon Killer",
    description = "Kills Blue Dragons",
    enabledByDefault = false
)
public class SquireBlueDragonKiller extends SquirePlugin {
    // Item IDs for dragon drops
    private static final int DRAGON_BONES_ID = 536;
    private static final int BLUE_DRAGONHIDE_ID = 1751;
    private static final int BLUE_DRAGON_SCALE_ID = 243;
    private static final int ENSOULED_DRAGON_HEAD_ID = 13511;

    private static final Map<WorldPoint, List<Integer>> lootSpawns = new HashMap<>();

    @Inject
    private SquireBlueDragonKillerConfig config;

    @Inject
    private PluginInfoBox infoBox;

    @Inject
    private Client client;

    @Inject
    private OverlayManager overlayManager;

    private Instant startTime;
    private List<LootTarget> lootTargets;

    // Loot counters
    private int bonesLooted;
    private int hidesLooted;
    private int scalesLooted;
    private int ensouledHeadsLooted;

    // Plugin state
    private boolean needsBanking;
    private boolean started;

    public SquireBlueDragonKiller() {
        this.lootTargets = new ArrayList<>();
        this.started = false;
    }

    @Override
    protected void onStart() {
        this.bonesLooted = 0;
        this.hidesLooted = 0;
        this.scalesLooted = 0;
        this.ensouledHeadsLooted = 0;
        this.startTime = Instant.now();
        this.overlayManager.add(this.infoBox);
    }

    @Override
    protected void onStop() {
        this.bonesLooted = 0;
        this.hidesLooted = 0;
        this.scalesLooted = 0;
        this.ensouledHeadsLooted = 0;
        this.overlayManager.remove(this.infoBox);
    }

    @Override
    protected Class<?>[] tasks() {
        return new Class[]{
            StartingTask.class,
            WalkToDragonsTask.class,
            AttackDragonTask.class,
            FlickPrayerTask.class,
            LootItemsTask.class,
            BankItemsTask.class,
            EatFoodTask.class,
            WalkToBankTask.class
        };
    }

    /**
     * Handles inventory changes to track looted items.
     *
     * @param event Inventory changed event
     */
    @Subscribe
    private void onInventoryChanged(InventoryChanged event) {
        if (event.getChangeType() == InventoryChanged.ChangeType.ITEM_ADDED) {
            int itemId = event.getItemId();

            if (itemId == DRAGON_BONES_ID) {
                this.bonesLooted++;
            }
            if (itemId == BLUE_DRAGONHIDE_ID) {
                this.hidesLooted++;
            }
            if (itemId == BLUE_DRAGON_SCALE_ID) {
                this.scalesLooted++;
            }
            if (itemId == ENSOULED_DRAGON_HEAD_ID) {
                this.ensouledHeadsLooted++;
            }
        }
    }

    /**
     * Handles item spawns to track lootable items.
     *
     * @param event Item spawned event
     */
    @Subscribe
    private void onItemSpawned(ItemSpawned event) {
        TileItem item = event.getItem();

        // Only track items we can pickup
        if (!item.canPickup()) {
            return;
        }

        // Only track items we want to loot
        if (!shouldLootItem(item.getId())) {
            return;
        }

        LootTarget target = new LootTarget();
        target.setItemId(item.getId());
        target.setLocation(item.getWorldLocation());
        this.getLootTargets().add(target);
    }

    /**
     * Handles config changes.
     *
     * @param event Config changed event
     */
    @Subscribe
    public void onConfigChanged(ConfigChanged event) {
        if (event.getGroup().equals("squirebdk")) {
            // Config changed, could reload settings here
        }
    }

    /**
     * Checks if an item should be looted based on config settings.
     *
     * @param itemId Item ID to check
     * @return true if item should be looted
     */
    private boolean shouldLootItem(int itemId) {
        ItemComposition itemDef = Static.getClient().getItemDefinition(itemId);

        // Check specific dragon drops
        if (config.lootBones() && itemId == DRAGON_BONES_ID) {
            return true;
        }
        if (config.lootHides() && itemId == BLUE_DRAGONHIDE_ID) {
            return true;
        }
        if (config.lootScales() && itemId == BLUE_DRAGON_SCALE_ID) {
            return true;
        }
        if (config.lootEnsouled() && itemId == ENSOULED_DRAGON_HEAD_ID) {
            return true;
        }

        // Loot stackable items if we already have them in inventory
        if (itemDef.isStackable() && Inventory.contains(itemId)) {
            return true;
        }

        return false;
    }

    /**
     * Checks if plugin should stop due to lack of supplies.
     *
     * @return true if should stop for supplies
     */
    public boolean shouldStopForSupplies() {
        // Check if health is too low and no food available
        if (Combat.getHealthPercent() < 30.0 && !hasFood()) {
            this.setNeedsBanking(true);
            return true;
        }

        // Check if inventory is full and no drinkable potions
        if (Inventory.isFull() && !Inventory.contains(item -> item.hasAction("Drink"))) {
            this.setNeedsBanking(true);
            return true;
        }

        // Check if ranged and out of ammo
        BankLoadout loadout = config.loadout().selected(BankLoadout.class);
        if (config.attackStyle() == AttackStyle.RANGE &&
            loadout.getEquipmentSetup().get(EquipmentInventorySlot.AMMO) !=
            Equipment.fromSlot(EquipmentInventorySlot.AMMO).getId()) {
            this.setNeedsBanking(true);
            return true;
        }

        return false;
    }

    /**
     * Checks if player has food in inventory.
     *
     * @return true if food is available
     */
    private boolean hasFood() {
        return Inventory.contains(item -> item.hasAction("Eat"));
    }

    // Getters and setters

    public Instant getStarted() {
        return this.startTime;
    }

    public List<LootTarget> getLootTargets() {
        return this.lootTargets;
    }

    public void setLootTargets(List<LootTarget> targets) {
        this.lootTargets = targets;
    }

    public int getBonesLooted() {
        return this.bonesLooted;
    }

    public void setBonesLooted(int count) {
        this.bonesLooted = count;
    }

    public int getHidesLooted() {
        return this.hidesLooted;
    }

    public void setHidesLooted(int count) {
        this.hidesLooted = count;
    }

    public int getScalesLooted() {
        return this.scalesLooted;
    }

    public void setScalesLooted(int count) {
        this.scalesLooted = count;
    }

    public int getEnsouledLooted() {
        return this.ensouledHeadsLooted;
    }

    public void setEnsouledLooted(int count) {
        this.ensouledHeadsLooted = count;
    }

    public boolean needsBanking() {
        return this.needsBanking;
    }

    public void setNeedsBanking(boolean needsBanking) {
        this.needsBanking = needsBanking;
    }

    public boolean isPluginEnabled() {
        return this.started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    @Provides
    SquireBlueDragonKillerConfig getConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireBlueDragonKillerConfig.class);
    }
}
