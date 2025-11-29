/*
 * Deobfuscated CoX Guardians Task
 * Handles the Guardians boss encounter in Chambers of Xeric
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

import java.util.Comparator;
import java.util.List;

/**
 * Task for fighting the Guardians in Chambers of Xeric.
 *
 * Guardian Mechanics:
 * - Two stone guardian NPCs that attack with melee
 * - Both must be killed to proceed
 * - Use protect from melee
 * - Attack with offensive prayers and proper gear
 * - Position optimally to fight both at once
 */
@TaskDesc(name = "Guardians", priority = 10000, blocking = true)
public class GuardiansTask extends CoxTaskBase {

    // Combat tracking
    private int attackAttempts;
    private int lastAttackTick;

    // Room state
    private NHelper currentRoom;
    private NHelper previousRoom;
    private int currentTick;

    @Inject
    protected GuardiansTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.currentTick = 0;
        this.attackAttempts = 0;
        this.lastAttackTick = 0;
    }

    @Override
    public boolean validate() {
        this.currentRoom = stateManager.getCurrentRoom();
        this.currentTick = stateManager.getCurrentTick();
        this.previousRoom = stateManager.getPreviousRoom();

        return this.currentRoom != null && this.currentRoom.getRoomType() == RoomType.GUARDIANS;
    }

    @Override
    public boolean execute() {
        // Find a guardian NPC
        NPC guardian = findGuardian();

        if (guardian == null) {
            return moveToStart();
        }

        // Set proper combat style (crush)
        if (Combat.getAttackStyle() != Combat.AttackStyle.THIRD && getGear().isFullyEquipped()) {
            Combat.setAttackStyle(Combat.AttackStyle.THIRD);
            return false;
        }

        int currentTick = client.getTickCount();

        // Get optimal position to fight guardians
        WorldPoint optimalPosition = getOptimalFightingPosition();

        // Move to optimal position if too close
        if (player.distanceTo(optimalPosition) <= 1) {
            attackAttempts++;

            if (attackAttempts == 2) {
                List<WorldPoint> nearbyTiles = player.getWorldLocation().createWorldArea(1).toWorldPointList();

                WorldPoint safeTile = nearbyTiles.stream()
                    .filter(Reachable::isWalkable)
                    .min(Comparator.comparingDouble(wp -> guardian.getWorldArea().distanceTo(wp))
                        .thenComparingDouble(wp -> wp.distanceTo2DHypotenuse(player.getWorldLocation())))
                    .orElse(null);

                Movement.setDestination(safeTile);
                return false;
            }

            if (attackAttempts > 2 && currentTick - lastAttackTick > 2) {
                lastAttackTick = currentTick;
                guardian.interact("Attack");
                return false;
            }

            return false;
        }

        attackAttempts = 0;

        // Move to guardian if in melee distance
        if (guardian.getWorldArea().isInMeleeDistance(player.getWorldLocation())) {
            Movement.setDestination(optimalPosition);
            return false;
        }

        // Don't move if already at optimal position
        if (player.getWorldLocation().equals(optimalPosition)) {
            return false;
        }

        Movement.setDestination(optimalPosition);
        return false;
    }

    /**
     * Find a guardian NPC
     */
    private NPC findGuardian() {
        return NPCs.getNearest(npc ->
            npc.getName() != null &&
            npc.getName().contains("Guardian") &&
            npc.hasAction("Attack")
        );
    }

    /**
     * Get the fighting area for guardians
     */
    private WorldArea getGuardianArea() {
        List<NPC> guardians = NPCs.getAll(npc ->
            npc.getName() != null &&
            npc.getName().contains("Guardian") &&
            npc.hasAction("Attack")
        );

        if (guardians.size() == 0) {
            return null;
        }

        if (guardians.size() == 1) {
            WorldPoint location = guardians.get(0).getWorldLocation();
            System.out.println("Single guardian");

            if (guardians.get(0).getWorldLocation().getWorldX() >= guardians.get(1).getWorldLocation().getWorldX() &&
                guardians.get(0).getWorldLocation().getWorldY() >= guardians.get(1).getWorldLocation().getWorldY()) {

                return new WorldArea(
                    guardians.get(0).getWorldLocation().dx(-1).dy(-1),
                    guardians.get(1).getWorldLocation().dx(2).dy(2)
                );
            }

            return new WorldArea(
                guardians.get(1).getWorldLocation().dx(-1).dy(-1),
                guardians.get(0).getWorldLocation().dx(2).dy(2)
            );
        }

        return new WorldArea(guardians.get(0).getWorldLocation().dx(-1).dy(-1), 3, 3);
    }

    /**
     * Get optimal position to fight guardians from
     */
    private WorldPoint getOptimalFightingPosition() {
        NPC guardian = NPCs.getNearest(npc ->
            npc.getName() != null &&
            npc.getName().contains("Guardian") &&
            npc.hasAction("Attack")
        );

        WorldArea guardianArea = getGuardianArea();
        List<WorldPoint> meleeTiles = guardianArea.getMeleeTiles(client);

        WorldPoint optimalTile = meleeTiles.stream()
            .filter(Reachable::isWalkable)
            .min(Comparator.comparingDouble(wp -> wp.distanceToHypotenuse(guardian.getWorldLocation())))
            .orElse(null);

        return optimalTile;
    }

    /**
     * Helper method for calculating distance
     */
    private static double calculateDistance(NPC npc, Object tile) {
        return npc.getWorldArea().distanceTo((WorldPoint) tile);
    }

    /**
     * Move to starting position
     */
    private boolean moveToStart() {
        if (Reachable.isWalkable(currentRoom.getExitPoint())) {
            if (Movement.getDestination() != null && Movement.getDestination().equals(previousRoom.getExitPoint())) {
                return false;
            }
            Movement.setDestination(previousRoom.getEnterPoint());
            return false;
        }

        TileObject entrance = findRoomEntrance();
        if (entrance == null) {
            Movement.setDestination(currentRoom.getCenterPoint().dx(-1).dy(-1));
            return false;
        }

        if (player.isMoving() || player.isAnimating()) {
            return false;
        }

        entrance.interact("Enter");
        return false;
    }

    /**
     * Find room entrance
     */
    private TileObject findRoomEntrance() {
        return TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().equals("Passageway") &&
            obj.hasAction("Enter") &&
            currentRoom.contains(obj)
        );
    }

    @Override
    public EquipmentSetup getGear() {
        return equipmentManager.getSetup(equipmentManager.getWeapon(RoomType.GUARDIANS));
    }

    @Override
    public List<Prayer> getPrayers() {
        NPC guardian = NPCs.getNearest(npc ->
            npc.getName() != null &&
            npc.getName().contains("Guardian") &&
            npc.hasAction("Attack")
        );

        if (guardian == null) {
            return null;
        }

        if (guardian.getWorldLocation().distanceTo((Locatable) player) > 4) {
            return null;
        }

        return Prayers.getOffensive();
    }
}
