/*
 * Deobfuscated CoX Muttadiles Task
 * Handles the Muttadiles boss encounter in Chambers of Xeric
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Task for fighting the Muttadiles in Chambers of Xeric.
 *
 * Muttadile Mechanics:
 * - Two phases: small muttadile and large muttadile (after eating meat tree)
 * - Small muttadile uses ranged attacks
 * - Large muttadile uses melee attacks
 * - Can heal in the water pool - must lure away from pool
 * - Drops meat that can be used to heal
 * - Kill small muttadile first, then large one
 */
@TaskDesc(name = "Muttadiles", priority = 10000, blocking = true)
public class MuttadilesTask extends CoxTaskBase {

    // NPC IDs
    private static final int MUTTADILE_SMALL = 7561;
    private static final int MUTTADILE_LARGE = 7562;
    private static final int MEAT_TREE = 7563;

    // Item IDs
    private static final int ROTTEN_MEAT_ID = 20084;

    // Room state
    private NHelper currentRoom;
    private NHelper previousRoom;
    private int lastLootTick;
    private int currentTick;

    @Inject
    protected MuttadilesTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.lastLootTick = 0;
        this.currentTick = 0;
    }

    @Override
    public boolean validate() {
        this.currentRoom = stateManager.getCurrentRoom();
        this.currentTick = stateManager.getCurrentTick();
        this.previousRoom = stateManager.getPreviousRoom();

        return this.currentRoom != null && this.currentRoom.getRoomType() == RoomType.MUTTADILES;
    }

    @Override
    public boolean execute() {
        // First priority: loot meat
        if (lootMeat()) {
            return true;
        }

        Player localPlayer = Players.getLocal();
        int currentTick = Static.getClient().getTickCount();

        // Empty grubs from tree if near entrance
        if (localPlayer.distanceTo(currentRoom.getEnterPoint()) <= 1 && emptyMeatTree()) {
            return true;
        }

        // Find muttadiles
        NPC smallMuttadile = findSmallMuttadile();
        NPC largeMuttadile = NPCs.getNearest(MUTTADILE_LARGE);
        NPC meatTree = NPCs.getNearest(MEAT_TREE);
        NPC activeMuttadile = NPCs.getNearest(MUTTADILE_SMALL);

        // Move to start if no muttadiles found
        if (largeMuttadile == null && meatTree == null && activeMuttadile == null) {
            return moveToStart();
        }

        // Handle meat in inventory - empty grubs from tree
        if (Inventory.contains(item ->
            (item.getName().contains("Grub") || item.getName().contains("Psykk bat")) &&
            item.getId() != ROTTEN_MEAT_ID)) {

            if (Inventory.isFull()) {
                stateManager.dropItems();
                return true;
            }

            TileObject tree = TileObjects.getNearest(obj ->
                obj.getName() != null &&
                obj.getName().contains("Meat tree") &&
                obj.hasAction("Empty-grubs")
            );

            if (tree == null) {
                return false;
            }

            tree.interact("Empty-grubs");
            return true;
        }

        // Attack small muttadile if present
        if (smallMuttadile != null) {
            if (localPlayer.getInteracting() == null ||
                !localPlayer.getInteracting().getName().equals("Muttadile") ||
                currentTick - stateManager.getLastAttackTick() > 3) {

                smallMuttadile.interact("Attack");
                return true;
            }

            if (currentTick - stateManager.getLastAttackTick() > 3) {
                return false;
            }

            // Attack meat tree when small muttadile is low hp
            if (activeMuttadile == null) {
                return false;
            }

            if (localPlayer.getInteracting() != null &&
                localPlayer.getInteracting().getName().equals("Muttadile")) {
                return false;
            }

            if (activeMuttadile.getHealthRatio() != 0 && activeMuttadile.getHealthRatio() < 4) {
                return false;
            }

            if (activeMuttadile.getWorldArea().isInMeleeDistance(localPlayer.getWorldLocation())) {
                activeMuttadile.interact("Attack");
                return true;
            }

            return false;
        }

        // Attack large muttadile
        if (largeMuttadile != null) {
            if (localPlayer.getInteracting() != null &&
                localPlayer.getInteracting().getName().equals("Muttadile")) {
                return false;
            }

            largeMuttadile.interact("Attack");
            return true;
        }

        // Kite meat tree
        if (meatTree == null) {
            return false;
        }

        int distance = meatTree.getWorldArea().distanceTo(localPlayer.getWorldLocation());

        // Move away from meat tree
        if (distance <= 3) {
            List<WorldPoint> kiteArea = getKiteArea(meatTree).toWorldPointList();
            WorldPoint safeTile = kiteArea.stream()
                .filter(Reachable::isWalkable)
                .filter(wp -> meatTree.getWorldArea().distanceTo(wp) < 6)
                .max(Comparator.comparingInt(wp -> meatTree.getWorldArea().distanceTo(wp))
                    .thenComparingDouble(wp -> -1.0 * wp.distanceToHypotenuse(localPlayer.getWorldLocation())))
                .orElse(null);

            if (safeTile != null) {
                System.out.println("Player: " + localPlayer.getWorldLocation() + " Tree: " + meatTree.getWorldLocation());
                Movement.setDestination(safeTile);
                return true;
            }
        }

        // Attack meat tree
        if (localPlayer.getInteracting() != null &&
            localPlayer.getInteracting().getName().equals("Meat tree")) {
            return false;
        }

        meatTree.interact("Attack");
        return true;
    }

    /**
     * Find small muttadile NPC
     */
    private NPC findSmallMuttadile() {
        return NPCs.getNearest(npc ->
            npc.hasAction("Attack") &&
            npc.getName() != null &&
            npc.getName().contains("Muttadile")
        );
    }

    /**
     * Get area to kite meat tree around
     */
    private WorldArea getKiteArea(NPC npc) {
        if (npc == null) {
            return null;
        }

        int radius = 3;
        return new WorldArea(
            npc.getWorldLocation().dx(-radius).dy(-radius),
            3 * radius + npc.getWorldArea().getWidth(),
            3 * radius + npc.getWorldArea().getWidth()
        );
    }

    /**
     * Loot meat drops
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

        // Prioritize grubs if we have psykk bat
        if (Inventory.contains(item -> item.getName().startsWith("Psykk bat"))) {
            meat = TileItems.getNearest(item ->
                item.getName() != null &&
                item.getName().startsWith("Grubs") &&
                currentRoom.contains(item) &&
                Reachable.isInteractable(item)
            );
        }

        if (meat == null) {
            return false;
        }

        meat.interact("Take");
        return true;
    }

    /**
     * Empty grubs from meat tree
     */
    private boolean emptyMeatTree() {
        TileObject tree = TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().contains("Meat tree") &&
            obj.hasAction("Empty-grubs")
        );

        if (tree == null) {
            System.out.println("No meat tree found");
            return false;
        }

        tree.interact("Empty-grubs");
        return true;
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
            return true;
        }

        TileObject entrance = findRoomEntrance();
        if (entrance == null) {
            return false;
        }

        if (player.isMoving() || player.isAnimating()) {
            return false;
        }

        entrance.interact("Enter");
        return true;
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
        NPC smallMuttadile = NPCs.getNearest(npc ->
            npc.hasAction("Attack") &&
            npc.getName() != null &&
            npc.getName().contains("Muttadile")
        );

        return equipmentManager.getSetup(equipmentManager.getWeapon(RoomType.MUTTADILES));
    }

    @Override
    public List<Prayer> getPrayers() {
        ArrayList<Prayer> prayers = new ArrayList<>();
        Player player = Players.getLocal();

        NPC largeMuttadile = NPCs.getNearest(MUTTADILE_LARGE);
        NPC meatTree = NPCs.getNearest(MEAT_TREE);
        NPC smallMuttadile = NPCs.getNearest(MUTTADILE_SMALL);

        if (meatTree == null && smallMuttadile == null && largeMuttadile == null) {
            return null;
        }

        Prayer protectionPrayer = Prayer.PROTECT_FROM_MISSILES;

        // Use melee prayer if large muttadile is in melee distance
        if (largeMuttadile != null &&
            largeMuttadile.getWorldArea().isInMeleeDistance(player.getWorldLocation())) {
            protectionPrayer = Prayer.PROTECT_FROM_MELEE;
        }

        prayers.add(protectionPrayer);
        prayers.addAll(Prayers.getOffensive());

        return prayers;
    }
}
