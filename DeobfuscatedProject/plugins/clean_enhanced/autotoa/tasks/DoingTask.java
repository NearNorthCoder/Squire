/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/**
 * Handles the Crondis room tasks in TOA.
 * This room has two types of objectives:
 * - PILLARS: Repair damaged pillars
 * - VENTS: Pour water into vents to neutralize fumes
 *
 * The task is determined by graphics objects that spawn in the room.
 */
@TaskDesc(name="Doing Crondis task", priority=50, blocking=true, register=true)
public class DoingCrondisTask extends TOABossHandler {
    // The current task type (PILLARS or VENTS)
    private CrondisTaskType currentTask;

    // Object IDs
    private static final int DAMAGED_PILLAR_ID = 46527;  // 0xB5BF - Damaged pillar
    private static final int FUME_VENT_ID = 46079;       // 0xB3FF - Vent with fumes
    private static final int WATER_CONTAINER_ID = 28409;  // 0x6EF9 - Water container item

    // Graphics object ID that indicates which task to do
    private static final int TASK_INDICATOR_GRAPHIC = 23895;  // 0x5D57

    @Inject
    protected DoingCrondisTask(Client client, TOARaidStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getGearSwap() {
        return this.config.meleeGearAkkha();
    }

    /**
     * Listens for chat messages to detect when the task is completed or failed.
     */
    @Subscribe
    @Override
    public void onChatMessage(ChatMessage message) {
        String text = message.getMessage();

        // Check if task is completed or failed
        if (!text.contains("repair the damaged") &&
            !text.contains("neutralise the fumes") &&
            text.contains("You have died")) {
            // Reset task
            this.currentTask = null;
        }
    }

    /**
     * Listens for graphics objects to determine which task is active.
     * The graphics object spawns near either pillars or vents to indicate
     * which mechanic needs to be addressed.
     */
    @Subscribe
    public void onGraphicsObjectCreated(GraphicsObjectCreated event) {
        if (event.getGraphicsObject().getId() != TASK_INDICATOR_GRAPHIC) {
            return;
        }

        // Get the location of the graphics object
        LocalPoint localPoint = event.getGraphicsObject().getLocation();
        WorldPoint graphicLocation = WorldPoint.fromLocal(this.client, localPoint);

        // Find nearby pillars and vents to determine task type
        int[] pillarIds = new int[] { DAMAGED_PILLAR_ID };
        TileObject nearbyPillar = TileObjects.getNearest(graphicLocation, pillarIds);

        int[] ventIds = new int[] { FUME_VENT_ID };
        TileObject nearbyVent = TileObjects.getNearest(graphicLocation, ventIds);

        // Determine task based on which object is closer
        if (nearbyPillar.distanceTo(graphicLocation) < nearbyVent.distanceTo(graphicLocation)) {
            this.currentTask = CrondisTaskType.PILLARS;
        } else {
            this.currentTask = CrondisTaskType.VENTS;
        }
    }

    @Override
    public boolean shouldExecute() {
        if (this.currentTask == null) {
            return false;
        }

        // Execute the appropriate task
        switch (DoingTaskSwitchMapper.taskOrdinalMapping[this.currentTask.ordinal()]) {
            case 1:  // PILLARS
                this.repairPillars();
                break;
            case 2:  // VENTS
                this.neutralizeVents();
                break;
        }

        return true;
    }

    /**
     * Handles repairing damaged pillars.
     * Finds a damaged pillar and repairs it.
     */
    private void repairPillars() {
        int[] pillarIds = new int[] { DAMAGED_PILLAR_ID };
        TileObject damagedPillar = TileObjects.getNearest(pillarIds);

        if (damagedPillar == null) {
            return;
        }

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();
        WorldPoint pillarLocation = damagedPillar.getWorldLocation();

        // If too far, move closer
        if (pillarLocation.distanceTo(playerLocation) > 3) {
            Movement.setDestination(this.getCloserPoint(playerLocation, pillarLocation));
            return;
        }

        // Repair the pillar
        damagedPillar.interact("Repair");
    }

    /**
     * Handles neutralizing fume vents.
     * Pours water into vents to neutralize the fumes.
     */
    private void neutralizeVents() {
        int[] ventIds = new int[] { FUME_VENT_ID };
        TileObject fumeVent = TileObjects.getNearest(ventIds);

        if (fumeVent == null) {
            return;
        }

        // Check if we're standing on the vent (need to move)
        if (Players.getLocal().getWorldLocation().equals(fumeVent.getWorldLocation())) {
            WorldPoint playerLoc = Players.getLocal().getWorldLocation();
            Movement.setDestination(this.getCloserPoint(playerLoc, fumeVent.getWorldLocation()));
            return;
        }

        // Get water container
        int[] waterContainerIds = new int[] { WATER_CONTAINER_ID };
        Item waterContainer = Inventory.getFirst(waterContainerIds);

        if (waterContainer == null) {
            return;
        }

        // Pour water into the vent
        waterContainer.interact("Pour");
    }

    @Override
    public void reset() {
        this.currentTask = null;
    }
}
