package gg.squire.mining;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.runelite.api.*;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

import java.util.Set;

/**
 * Tracks the state of the Motherlode Mine, including ore counts and sack status.
 */
@Singleton
public class MotherlodeMineTracker {
    private static final int MINING_ANIMATION = 6758;
    private static final int UPPER_FLOOR_CAPACITY = 81;
    private static final int SOUTH_WEST_CAPACITY = 54;

    // Pay-dirt IDs for different tiers
    public static final Set<Integer> PAYDIRT_IDS = ImmutableSet.of(
        4484, 4485, 4495, 4497, 4499, 5012
    );

    // MLM region IDs
    private static final Set<Integer> MLM_REGION_IDS = ImmutableSet.of(
        14679, 14680, 14681, 14935, 14936, 14937, 15191, 15192, 15193
    );

    private final Client client;
    private int previousOreCount;
    private int currentOreCount;
    private boolean wasInventoryFull;

    @Inject
    public MotherlodeMineTracker(Client client) {
        this.client = client;
    }

    /**
     * Resets the ore tracking state.
     */
    public void reset() {
        this.previousOreCount = 0;
        this.currentOreCount = Inventory.getCount(12011); // Pay-dirt ID
        this.wasInventoryFull = isInventoryFull();
    }

    /**
     * Checks if the player is currently in the Motherlode Mine.
     *
     * @return true if in MLM
     */
    public boolean isInMotherlodeMine() {
        int[] regions = client.getMapRegions();
        for (int region : regions) {
            if (MLM_REGION_IDS.contains(region)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if sack is enabled (unlocked).
     *
     * @return true if sack is enabled
     */
    public boolean isSackEnabled() {
        return Vars.getBit(5558) == 1;
    }

    /**
     * Gets the current sack count.
     *
     * @return sack count
     */
    public int getSackCount() {
        return Vars.getBit(5556);
    }

    /**
     * Gets the capacity of the sack based on current floor.
     *
     * @return sack capacity
     */
    public int getSackCapacity() {
        return isSackEnabled() ? UPPER_FLOOR_CAPACITY : SOUTH_WEST_CAPACITY;
    }

    /**
     * Gets the number of pay-dirt that can still fit in the sack.
     *
     * @return remaining sack space
     */
    public int getSackRemainingSpace() {
        return getSackCapacity() - getTotalPaydirt();
    }

    /**
     * Gets the total pay-dirt count (inventory + sack).
     *
     * @return total pay-dirt
     */
    public int getTotalPaydirt() {
        return getSackCount() + getCurrentOreCount() + getPreviousOreCount();
    }

    /**
     * Checks if inventory is full.
     *
     * @return true if inventory is full
     */
    public boolean isInventoryFull() {
        int currentCount = getTotalPaydirt();
        int capacity = getSackCapacity();
        return currentCount >= capacity;
    }

    /**
     * Checks if the sack is full.
     *
     * @return true if sack is full
     */
    public boolean isSackFull() {
        return getSackRemainingSpace() < 0;
    }

    /**
     * Checks if the player should go to the hopper.
     *
     * @return true if should go to hopper
     */
    public boolean shouldGoToHopper() {
        if (getPreviousOreCount() == 0) {
            return false;
        }
        if (isSackFull()) {
            return true;
        }
        return getPreviousOreCount() > 1 && Inventory.isFull();
    }

    /**
     * Checks if the player should mine more ore.
     *
     * @return true if should mine
     */
    public boolean shouldMine() {
        if (!Inventory.contains(12011)) {
            return false;
        }
        return !Inventory.isFull() || getTotalPaydirt() >= getSackCapacity();
    }

    /**
     * Checks if inventory was full on last check.
     *
     * @return true if was full
     */
    public boolean wasInventoryFullBefore() {
        return wasInventoryFull;
    }

    /**
     * Sets the inventory full state.
     *
     * @param full the new state
     */
    public void setInventoryFull(boolean full) {
        this.wasInventoryFull = full;
    }

    /**
     * Gets the previous ore count.
     *
     * @return previous ore count
     */
    public int getPreviousOreCount() {
        return previousOreCount;
    }

    /**
     * Gets the current ore count.
     *
     * @return current ore count
     */
    public int getCurrentOreCount() {
        return currentOreCount;
    }

    /**
     * Finds the nearest ore vein in the given MLM area.
     *
     * @param area the MLM area to search in
     * @return the nearest ore vein or null
     */
    public TileObject getNearestVein(MotherlodeMineArea area) {
        return TileObjects.getNearest(obj ->
            area.getWaypointList().contains(obj.getWorldLocation()) &&
            obj.getName().equals("Ore vein")
        );
    }

    @Subscribe
    public void onAnimationChanged(AnimationChanged event) {
        Actor actor = event.getActor();
        if (!(actor instanceof NPC)) {
            return;
        }

        Player player = (Player) actor;
        if (player == client.getLocalPlayer() && player.getAnimation() == MINING_ANIMATION) {
            this.previousOreCount = this.currentOreCount;
            this.currentOreCount = 0;
            this.wasInventoryFull = isInventoryFull();
        }
    }

    @Subscribe
    public void onItemContainerChanged(ItemContainerChanged event) {
        if (event.getContainerId() != InventoryID.INVENTORY.getId()) {
            return;
        }
        this.currentOreCount = Inventory.getCount(12011);
    }

    @Subscribe
    public void onChatMessage(ChatMessage event) {
        ChatMessageType type = event.getType();
        if (type != ChatMessageType.GAMEMESSAGE) {
            return;
        }

        String message = event.getMessage();
        if (message.contains("You manage to free some pay-dirt")) {
            this.previousOreCount = 0;
        }
    }
}
