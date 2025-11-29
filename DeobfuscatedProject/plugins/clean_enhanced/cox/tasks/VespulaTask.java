/*
 * Deobfuscated CoX Vespula Task
 * Handles the Vespula boss encounter in Chambers of Xeric
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.List;

/**
 * Task for fighting Vespula in Chambers of Xeric.
 *
 * Vespula Mechanics:
 * - Flying insect boss with portal mechanic
 * - Must close abyssal portals to damage Vespula
 * - Portal spawns lux grubs that heal Vespula
 * - Use protect from missiles for ranged attacks
 * - Attack Vespula from the designated attack point
 * - Use redemption prayer to survive while afk
 * - Avoid being overrun by portal spawns
 */
@TaskDesc(name = "Vespula", priority = 10000, blocking = true)
public class VespulaTask extends CoxTaskBase {

    // Item IDs
    private static final int OVERLOAD_POTION = 5417;

    // Room state
    private NHelper currentRoom;
    private NHelper previousRoom;
    private int currentTick;

    // Combat tracking
    private int lastActionTick;

    @Inject
    protected VespulaTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.currentTick = 0;
        this.lastActionTick = 0;
    }

    @Override
    public boolean validate() {
        this.currentRoom = stateManager.getCurrentRoom();
        this.currentTick = stateManager.getCurrentTick();
        this.previousRoom = stateManager.getPreviousRoom();

        return this.currentRoom != null && this.currentRoom.getRoomType() == RoomType.VESPULA;
    }

    @Override
    public boolean execute() {
        // Find NPCs
        NPC portal = findPortal();
        NPC vespula = findVespula();

        if (portal == null && vespula == null) {
            if (lootMeat()) {
                return false;
            }
            return moveToStart();
        }

        // Empty grubs near entrance
        if (player.distanceTo(currentRoom.getEnterPoint()) <= 1 && emptyGrubsFromTree()) {
            return false;
        }

        // Use overload potion if available
        useOverloadPotion();

        // Set proper combat style
        setProperCombatStyle();

        // Stand at attack point and attack
        if (client.getTickCount() - lastActionTick <= 2 && Prayers.getPoints() > 0) {
            NPC target = portal != null ? portal : vespula;

            if (target == null) {
                return true;
            }

            target.interact("Attack");
            return false;
        }

        WorldPoint attackPoint = RoomPoints.VESPULA_ATTACK_POINT.getPoint(currentRoom);

        if (player.getWorldLocation().equals(attackPoint)) {
            System.out.println("At attack point");
            lastActionTick = client.getTickCount();
            return false;
        }

        Movement.setDestination(attackPoint);
        return false;
    }

    /**
     * Find Vespula NPC
     */
    private NPC findVespula() {
        return NPCs.getNearest(npc ->
            npc.getName() != null &&
            npc.getName().contains("Vespula") &&
            currentRoom.contains(npc)
        );
    }

    /**
     * Find abyssal portal NPC
     */
    private NPC findPortal() {
        return NPCs.getNearest(npc ->
            npc.getName() != null &&
            npc.getName().contains("Abyssal portal") &&
            currentRoom.contains(npc)
        );
    }

    /**
     * Loot meat from ground
     */
    private boolean lootMeat() {
        if (Inventory.isFull()) {
            return true;
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
            return true;
        }

        meat.interact("Take");
        return false;
    }

    /**
     * Use overload potion if venomed
     */
    private boolean useOverloadPotion() {
        Item overload = Inventory.getFirst(item ->
            item.getName().startsWith("Overload")
        );

        if (overload == null) {
            return true;
        }

        int poisonVarbit = Static.getClient().getVarbitValue(102);
        if (poisonVarbit > 0) {
            return true;
        }

        overload.interact("Drink");
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
            return true;
        }

        // Handle dialog if present
        if (Dialog.isViewingOptions() && Dialog.getName().contains("Lux grub")) {
            Dialog.chooseOption("Empty-grubs");
            return false;
        }

        Game.logout();
        return false;
    }

    /**
     * Set proper combat style for Vespula
     */
    public void setProperCombatStyle() {
        if (!getGear().isFullyEquipped() ||
            Combat.getAttackStyle() == Combat.AttackStyle.FOURTH ||
            !Equipment.contains(item ->
                item.getName() != null &&
                (item.getName().toLowerCase().contains("crossbow") ||
                 item.getName().toLowerCase().contains("ballista")))) {
            return;
        }

        Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
    }

    /**
     * Move to starting position
     */
    private boolean moveToStart() {
        if (Reachable.isWalkable(currentRoom.getExitPoint())) {
            if (Movement.getDestination() != null &&
                Movement.getDestination().equals(previousRoom.getExitPoint())) {
                return true;
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
            return true;
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
        return equipmentManager.getSetup(equipmentManager.getWeapon(RoomType.VESPULA));
    }

    @Override
    public List<Prayer> getPrayers() {
        ArrayList<Prayer> prayers = new ArrayList<>();

        NPC vespula = NPCs.getNearest(npc ->
            npc.getName() != null && npc.getName().contains("Vespula")
        );

        if (vespula == null) {
            return null;
        }

        // Don't use prayers when near entrance
        if (player.distanceTo(currentRoom.getEnterPoint()) <= 1) {
            return null;
        }

        List<Prayer> offensivePrayers = Prayers.getOffensive();
        Prayer protectionPrayer = Prayer.REDEMPTION;

        prayers.add(protectionPrayer);
        prayers.addAll(offensivePrayers);

        return prayers;
    }
}
