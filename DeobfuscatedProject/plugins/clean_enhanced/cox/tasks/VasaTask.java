/*
 * Deobfuscated CoX Vasa Task
 * Handles the Vasa Nistirio boss encounter in Chambers of Xeric
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
import net.runelite.api.Projectile;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task for fighting Vasa Nistirio in Chambers of Xeric.
 *
 * Vasa Nistirio Mechanics:
 * - Teleports to different crystals around the room
 * - Heals from crystals when teleporting to them
 * - Fires boulder projectiles that deal massive damage
 * - Must attack crystals to stop healing
 * - Use protect from missiles
 * - Attack Vasa directly when possible
 * - Dodge falling rocks (projectile ID 1354)
 */
@TaskDesc(name = "Vasa", priority = 10000, blocking = true)
public class VasaTask extends CoxTaskBase {

    // Projectile IDs
    private static final int BOULDER_PROJECTILE_ID = 1354;

    // Weapon IDs
    private static final int TWISTED_BOW = 20997;
    private static final int BOW_OF_FAERDHINEN = 25865;

    // Room state
    private NHelper currentRoom;
    private NHelper previousRoom;
    private int currentTick;

    // Combat tracking
    private int lastAttackTick;
    private NPC currentVasa;
    private WorldPoint lastAttackLocation;
    private NPC currentCrystal;

    @Inject
    protected VasaTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.currentTick = 0;
        this.lastAttackTick = 0;
        this.lastAttackLocation = new WorldPoint(0, 0, 0);
    }

    @Override
    public boolean validate() {
        this.currentRoom = stateManager.getCurrentRoom();
        this.currentTick = stateManager.getCurrentTick();
        this.previousRoom = stateManager.getPreviousRoom();

        return this.currentRoom != null && this.currentRoom.getRoomType() == RoomType.VASA;
    }

    @Override
    public boolean execute() {
        // Empty grubs near entrance
        if (player.distanceTo(currentRoom.getEnterPoint()) <= 1 && emptyGrubsFromTree()) {
            return false;
        }

        int currentState = VasaStateManager.getState();
        System.out.println("state: " + VasaStateManager.getState());

        // Check for teleport orbs
        NPC teleportOrb = NPCs.getNearest(npc ->
            npc.getName() != null &&
            npc.getName().contains("Teleport") &&
            currentRoom.contains(npc)
        );

        if (teleportOrb != null) {
            Movement.setDestination(teleportOrb.getWorldArea().getRandom());
            return false;
        }

        switch (currentState) {
            case 0: // Waiting/Starting
                if (lootMeat()) {
                    return false;
                }
                return moveToStart();

            case 1: // Attack crystal
                return attackCrystal();

            case 2: // Dodge boulders and attack
            case 3: // Attack Vasa with kiting
                return attackVasaWithKiting(currentState == 2);

            case 4: // Move away from healing Vasa
                return moveAwayFromHealingVasa();
        }

        return false;
    }

    /**
     * Attack the crystal
     */
    private boolean attackCrystal() {
        NPC crystal = findCrystal();
        if (crystal == null) {
            return false;
        }

        WorldPoint safePosition = getCrystalMeleePosition();
        List<WorldPoint> pathToCrystal = player.getWorldLocation().pathTo(client, safePosition);

        Iterator<WorldPoint> iterator = pathToCrystal.iterator();
        while (iterator.hasNext()) {
            WorldPoint tile = iterator.next();

            if (currentVasa.getWorldArea().contains(tile)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Attack Vasa while dodging boulders
     */
    private boolean attackVasaWithKiting(boolean mustKite) {
        this.currentVasa = findVasa();
        if (currentVasa == null) {
            return false;
        }

        if (mustKite && shouldMoveFromVasa()) {
            System.out.println("Moving from Vasa");
            Movement.setDestination(getCrystalMeleePosition());
            return false;
        }

        if (client.getTickCount() - lastAttackTick > 1) {
            currentVasa.interact("Attack");
            lastAttackTick = client.getTickCount();
            lastAttackLocation = player.getWorldLocation();
            System.out.println("Attacking Vasa");
            return false;
        }

        // Collect boulder projectile locations
        ArrayList<WorldPoint> dangerTiles = new ArrayList<>();
        dangerTiles.addAll(lastAttackLocation.createWorldArea(1).toWorldPointList());

        List<Projectile> boulders = Projectiles.getAll(BOULDER_PROJECTILE_ID);
        for (Projectile boulder : boulders) {
            if (boulder == null) {
                continue;
            }

            WorldPoint target = WorldPoint.fromLocal(client, boulder.getTarget());
            dangerTiles.addAll(target.createWorldArea(1).toWorldPointList());
        }

        // Move to safe tile if in danger
        if (dangerTiles.contains(player.getWorldLocation())) {
            if (mustKite) {
                int optimalDistance = config.vasaToggle() ? 5 : 3;

                WorldPoint safeTile = player.getWorldLocation()
                    .createWorldArea(2)
                    .toWorldPointList()
                    .stream()
                    .filter(wp -> Reachable.isWalkable(wp) && !dangerTiles.contains(wp))
                    .min(Comparator.comparingInt(wp -> Math.abs(optimalDistance - currentVasa.getWorldArea().distanceTo(wp)))
                        .thenComparingInt(wp -> wp.distanceToPath(client, getCrystalMeleePosition())))
                    .orElse(null);

                Movement.setDestination(safeTile);
                return false;
            }

            WorldPoint safeTile = player.getWorldLocation()
                .createWorldArea(2)
                .toWorldPointList()
                .stream()
                .filter(wp -> Reachable.isWalkable(wp) && !dangerTiles.contains(wp))
                .min(Comparator.comparingInt(wp -> Math.abs(3 - currentVasa.getWorldArea().distanceTo(wp))))
                .orElse(null);

            Movement.setDestination(safeTile);
            return false;
        }

        currentVasa.interact("Attack");
        return false;
    }

    /**
     * Move away from Vasa when it's healing
     */
    private boolean moveAwayFromHealingVasa() {
        NPC vasa = findVasa();
        if (vasa == null) {
            return false;
        }

        if (vasa.getAnimation() != -1) {
            System.out.print("Vasa is animating");
            return false;
        }

        if (vasa.getWorldArea().distanceTo((Locatable) player) < 3) {
            WorldPoint safeTile = player.getWorldLocation()
                .createWorldArea(2)
                .toWorldPointList()
                .stream()
                .filter(Reachable::isWalkable)
                .max(Comparator.comparingInt(wp -> vasa.getWorldArea().distanceTo(wp))
                    .thenComparingDouble(wp -> -player.distanceTo(wp)))
                .orElse(null);

            if (safeTile == null) {
                return false;
            }

            Movement.setDestination(safeTile);
            return false;
        }

        return false;
    }

    /**
     * Check if should move away from Vasa
     */
    private boolean shouldMoveFromVasa() {
        NPC crystal = findCrystal();
        if (crystal == null) {
            return false;
        }

        WorldPoint crystalPosition = getCrystalMeleePosition();
        List<WorldPoint> pathToCrystal = player.getWorldLocation().pathTo(client, crystalPosition);

        Iterator<WorldPoint> iterator = pathToCrystal.iterator();
        while (iterator.hasNext()) {
            WorldPoint tile = iterator.next();

            if (currentVasa.getWorldArea().contains(tile)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Find Vasa NPC
     */
    private NPC findVasa() {
        return NPCs.getNearest(npc ->
            npc.getName() != null &&
            npc.getName().contains("Vasa Nistirio") &&
            npc.hasAction("Attack") &&
            currentRoom.contains(npc)
        );
    }

    /**
     * Find crystal NPC
     */
    private NPC findCrystal() {
        return NPCs.getNearest(npc ->
            npc.getName() != null &&
            npc.getName().contains("Crystal") &&
            npc.hasAction("Attack") &&
            currentRoom.contains(npc)
        );
    }

    /**
     * Get melee position near crystal
     */
    private WorldPoint getCrystalMeleePosition() {
        NPC crystal = findCrystal();
        if (crystal == null) {
            return null;
        }

        List<WorldPoint> meleeTiles = crystal.getWorldArea()
            .getMeleeTiles(Static.getClient())
            .stream()
            .filter(Reachable::isWalkable)
            .collect(Collectors.toList());

        if (meleeTiles.isEmpty()) {
            return null;
        }

        WorldPoint firstTile = meleeTiles.get(0);

        // Filter tiles based on X or Y alignment
        List<WorldPoint> alignedTiles = meleeTiles.stream()
            .filter(wp -> wp.getWorldX() != firstTile.getWorldX() || wp.getWorldY() == firstTile.getWorldY())
            .collect(Collectors.toList());

        meleeTiles.removeAll(alignedTiles);

        // Return from larger group
        if (meleeTiles.size() > alignedTiles.size()) {
            return alignedTiles.get(0);
        }

        return meleeTiles.get(0);
    }

    /**
     * Loot meat from ground
     */
    private boolean lootMeat() {
        if (Inventory.isFull()) {
            return false;
        }

        TileItem meat = TileItems.getNearest(item ->
            item.getName() != null &&
            item.getName().startsWith("Meat") &&
            currentRoom.contains(item) &&
            Reachable.isInteractable(item)
        );

        if (meat == null) {
            return false;
        }

        meat.interact("Take");
        return false;
    }

    /**
     * Empty grubs from tree
     */
    private boolean emptyGrubsFromTree() {
        TileObject tree = TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().toLowerCase().contains("tree") &&
            obj.hasAction("Empty-grubs")
        );

        if (tree == null) {
            System.out.println("No tree found");
            return false;
        }

        tree.interact("Empty-grubs");
        return false;
    }

    /**
     * Move to starting position
     */
    private boolean moveToStart() {
        if (Reachable.isWalkable(currentRoom.getExitPoint())) {
            if (Movement.getDestination() != null &&
                Movement.getDestination().equals(previousRoom.getExitPoint())) {
                return false;
            }
            Movement.setDestination(previousRoom.getEnterPoint());
            return false;
        }

        TileObject entrance = findRoomEntrance();
        if (entrance == null) {
            Movement.setDestination(currentRoom.getCenterPoint().dx(1).dy(1));
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

    /**
     * Set proper combat style for Vasa
     */
    public void setProperCombatStyle() {
        if (!getGear().isFullyEquipped() || Combat.getAttackStyle() == Combat.AttackStyle.FIRST) {
            return;
        }

        // Use rapid for bows
        if (Equipment.contains(TWISTED_BOW, BOW_OF_FAERDHINEN)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
    }

    @Override
    public EquipmentSetup getGear() {
        return equipmentManager.getSetup(equipmentManager.getWeapon(RoomType.VASA));
    }

    @Override
    public List<Prayer> getPrayers() {
        ArrayList<Prayer> prayers = new ArrayList<>();

        NPC vasa = NPCs.getNearest(npc ->
            npc.getName() != null && npc.getName().contains("Vasa Nistirio")
        );

        if (vasa == null) {
            return null;
        }

        List<Prayer> offensivePrayers = Prayers.getOffensive();
        Prayer protectionPrayer = Prayer.PROTECT_FROM_MISSILES;

        prayers.add(protectionPrayer);
        prayers.addAll(offensivePrayers);

        return prayers;
    }

    /**
     * State manager for Vasa fight phases
     */
    private static class VasaStateManager {
        public static int getState() {
            // Placeholder - would track Vasa's actual state
            return 0;
        }
    }
}
