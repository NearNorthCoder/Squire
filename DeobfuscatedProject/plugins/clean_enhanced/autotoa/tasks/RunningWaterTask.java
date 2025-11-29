/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.WardenPhaseManager;

@TaskDesc(name="Running water", priority=50, register=true)
public class RunningWaterTask extends AutotoaManager {

    private static final Point START_POSITION = new Point(40, 45);
    private static final int WATER_CONTAINER_ID = 26815; // TOA water container
    private static final String WATERFALL_NAME = "Waterfall";
    private static final String FILL_ACTION = "Fill";
    private static final String TAKE_ACTION = "Take";

    private static final String WALKING_TO_START_LOG = "Walking to start";
    private static final String CONTAINER_FILLED_MESSAGE = "You fill your container.";
    private static final String CONTAINER_EMPTIED_MESSAGE = "You empty a";

    private boolean containerIsFilled;
    private final Point startPoint;
    private int hasReachedStart;

    @Inject
    protected RunningWaterTask(Client client, WardenPhaseManager wardenManager, TOAConfig config) {
        super(client, wardenManager, config);
        this.startPoint = START_POSITION;
        this.hasReachedStart = 0;
    }

    @Override
    public boolean execute() {
        // Check if we already have a filled water container
        if (!Inventory.contains(WATER_CONTAINER_ID)) {
            this.hasReachedStart = 0;
            return collectWaterContainer();
        }

        WorldPoint startLocation = getWorldPoint(this.startPoint);

        // Move to start position if not there yet
        if (!startLocation.equals(Players.getLocal().getWorldLocation()) && this.hasReachedStart == 0) {
            Log.info(WALKING_TO_START_LOG);
            Movement.setDestination(startLocation);
            return true;
        }

        // Mark that we've reached the start position
        if (startLocation.equals(Players.getLocal().getWorldLocation())) {
            this.hasReachedStart = 1;
        }

        // If container is filled, pour it on Zebak
        if (this.containerIsFilled) {
            return pourWaterOnZebak();
        }

        // Otherwise, fill the container at waterfall
        return fillWaterContainer();
    }

    /**
     * Collects a water container from the ground or returns false if none available
     */
    private boolean collectWaterContainer() {
        TileObject waterfall = getWaterfall();
        if (waterfall == null) {
            return false;
        }

        // If inventory is full, make space
        if (Inventory.isFull()) {
            this.dropNonEssentialItem();
            return true;
        }

        // Pick up water container from ground
        TileItem waterContainer = TileItems.getNearest(WATER_CONTAINER_ID);
        if (waterContainer != null) {
            waterContainer.interact(TAKE_ACTION);
            return true;
        }

        return false;
    }

    /**
     * Pours water from container onto Zebak NPC
     */
    private boolean pourWaterOnZebak() {
        NPC zebak = NPCs.getNearest(this.getZebakId());
        if (zebak == null) {
            return false;
        }

        Item waterContainer = Inventory.getFirst(WATER_CONTAINER_ID);
        if (waterContainer == null) {
            return false;
        }

        waterContainer.useOn(zebak);
        return true;
    }

    /**
     * Fills the water container at the waterfall
     */
    private boolean fillWaterContainer() {
        TileObject waterfall = getWaterfall();
        if (waterfall == null) {
            return false;
        }

        Item waterContainer = Inventory.getFirst(WATER_CONTAINER_ID);
        if (waterContainer == null) {
            return false;
        }

        waterContainer.useOn(waterfall);
        return true;
    }

    /**
     * Finds the waterfall object to fill containers
     */
    private TileObject getWaterfall() {
        return TileObjects.getNearest(tileObject ->
            tileObject.getName().equals(WATERFALL_NAME)
            && tileObject.hasAction(FILL_ACTION)
        );
    }

    /**
     * Listens for chat messages to detect when container is filled or emptied
     */
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        if (chatMessage.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }

        String message = chatMessage.getMessage();

        if (message.contains(CONTAINER_FILLED_MESSAGE)) {
            this.containerIsFilled = true;
        } else if (message.contains(CONTAINER_EMPTIED_MESSAGE)) {
            this.containerIsFilled = false;
        }
    }
}
