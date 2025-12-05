/*
 * Deobfuscated from SoldierHealer
 * Package: gg.squire.basics.favor
 *
 * Plugin for healing Shayzien soldiers to gain Shayzien house favor.
 * Heals wounded soldiers in the Shayzien combat area.
 *
 * Item ID: 6979 - likely healing item (bandages or similar)
 * Animation ID: 6982 - wounded soldier pose animation
 */
package gg.squire.basics.favor;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/**
 * Shayzien Soldier Healer plugin for gaining house favor.
 * Automatically heals wounded soldiers in the combat area.
 */
@PluginDescriptor(
    name="Squire Shayzien Soldier Healer",
    description="Heals Shayzien Soldiers for favor",
    enabledByDefault=false
)
@SquireUtil
public class SoldierHealer extends SquirePlugin {

    /** Item ID: Healing item (bandages) */
    private static final int ITEM_HEALING = 6979;

    /** Animation ID: Wounded soldier pose */
    private static final int ANIMATION_WOUNDED = 6982;

    /** Item name: Healing supplies */
    private static final String ITEM_NAME_HEALING = "Shayzien medpack";

    /** NPC name: Soldier to heal */
    private static final String NPC_SOLDIER = "Wounded Soldier";

    /** Tile object: Supply crate */
    private static final String OBJECT_CRATE = "Crate";

    /** Action: Take supplies from crate */
    private static final String ACTION_TAKE = "Take";

    /** Action: Search/interact with crate */
    private static final String ACTION_SEARCH = "Search";

    @Override
    protected void onStart() {
        // No initialization needed
    }

    @Override
    protected void onStop() {
        // No cleanup needed
    }

    /**
     * Main game tick handler.
     * Manages the soldier healing cycle:
     * 1. Check for healing supplies
     * 2. Resupply from crate if out of supplies
     * 3. Find and heal wounded soldiers
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // Don't run if already moving
        if (Movement.shouldWalk()) {
            return;
        }

        // Check for healing supplies
        Item healingItem = Inventory.getFirst(ITEM_NAME_HEALING);

        // Resupply if out of healing items
        if (healingItem == null) {
            System.out.println("Out of healing supplies, restocking");

            TileObject supplyCrate = TileObjects.getNearest(OBJECT_CRATE);
            if (supplyCrate != null) {
                supplyCrate.interact(ACTION_SEARCH);
            }
            return;
        }

        // Find wounded soldier
        NPC woundedSoldier = NPCs.getNearest(npc -> {
            // Check if soldier is wounded (specific animation)
            if (npc.getName().contains(NPC_SOLDIER) &&
                npc.getPoseAnimation() == ANIMATION_WOUNDED) {
                return true;
            }
            return false;
        });

        // Heal the wounded soldier if found
        if (woundedSoldier != null) {
            healingItem.useOn(woundedSoldier);
        }
    }

    /**
     * No tasks defined - uses event-based logic instead.
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[0];
    }
}
