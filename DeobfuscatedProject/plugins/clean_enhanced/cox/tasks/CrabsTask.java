/**
 * Crabs Task - Handles the Jewelled Crabs puzzle room in Chambers of Xeric
 *
 * Puzzle Mechanics:
 * - Colored crabs (Red, Blue, Green, Purple) must be pushed to matching colored slots
 * - Crabs spawn with a specific graphic overlay indicating their color
 * - Player must use the correct weapon type to push each crab color
 * - Some room layouts require specific sequences of crab movements
 * - Crabs can only move in straight lines (horizontal or vertical)
 * - The puzzle has different configurations (West template vs East template)
 *
 * Strategy:
 * - Track spawned crabs and their colors
 * - Equip appropriate weapon for each crab color
 * - Calculate optimal path to push crab to its matching slot
 * - Handle different room template layouts
 * - Use Protect from Melee prayer when near crabs
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name = "Crabs", priority = 10000, blocking = true, register = true)
public class CrabsTask extends CoxTaskBase {

    /** Current room information */
    private NHelper currentRoom;

    /** Next room information */
    private NHelper nextRoom;

    /** Current room index */
    private int roomIndex;

    /** List of tracked crab NPCs with their spawn times */
    List&lt;CrabTracker&gt; trackedCrabs;

    /** Last tick we interacted with a crab */
    private int lastInteractTick;

    /** Crab NPC name */
    private static final String CRAB_NAME = "Jewelled Crab";

    /** Crystal object name */
    private static final String CRYSTAL_NAME = "Crystal";

    /** Passage name */
    private static final String PASSAGE_NAME = "Passage";

    /** Scavenger chest name */
    private static final String CHEST_NAME = "Grubs";

    /** Action to walk here */
    private static final String WALK_HERE_ACTION = "Walk here";

    /** Action to wield/equip */
    private static final String WIELD_ACTION = "Wield";
    private static final String WEAR_ACTION = "Wear";
    private static final String EQUIP_ACTION = "Equip";

    /** Action to attack */
    private static final String ATTACK_ACTION = "Attack";

    /** Action to push crab */
    private static final String PUSH_ACTION = "Push";

    /** Action to enter passage */
    private static final String ENTER_ACTION = "Enter";

    /** Action to search chest */
    private static final String SEARCH_ACTION = "Search";

    /** Action to take from chest */
    private static final String TAKE_ACTION = "Take";

    /** Graphic ID for crab spawn/death */
    private static final int CRAB_SPAWN_GRAPHIC = 1437;

    /** Tick threshold for stale crab tracking */
    private static final int CRAB_STALE_THRESHOLD = 30;

    /** Tick delay between crab interactions */
    private static final int INTERACT_DELAY_TICKS = 4;

    /** Item ID for hammer */
    private static final int HAMMER_ITEM_ID = 0; // Placeholder

    @Inject
    protected CrabsTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.roomIndex = 0;
        this.trackedCrabs = new ArrayList&lt;&gt;();
        this.lastInteractTick = 0;
    }

    @Override
    public EquipmentSetup getEquipmentSetup() {
        return null;
    }

    /**
     * Check if this task should be active
     * @return true if we're in the Crabs room
     */
    @Override
    public boolean shouldExecute() {
        this.currentRoom = this.coxManager.getCurrentRoom();
        this.roomIndex = this.coxManager.getRoomIndex();
        this.nextRoom = this.coxManager.getNextRoom();
        return this.currentRoom.getRoomType() == RoomType.CRABS;
    }

    /**
     * Get prayers to use during Crabs puzzle
     * @return List containing Protect from Melee
     */
    @Override
    public List&lt;Prayer&gt; getPrayersToActivate() {
        NPC crab = NPCs.getNearest(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(CRAB_NAME)
        );

        if (crab == null) {
            return null;
        }

        return List.of(Prayer.PROTECT_FROM_MELEE);
    }

    /**
     * Execute the main Crabs task logic
     * @return true if task executed successfully
     */
    @Override
    public boolean execute() {
        NPC crab = NPCs.getNearest(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(CRAB_NAME)
        );

        if (crab == null) {
            return navigateToNextRoom();
        }

        if (ensureHammerEquipped()) {
            return false;
        }

        removeStaleTrackedCrabs();
        executePuzzleLogic();
        return false;
    }

    /**
     * Execute the puzzle logic based on room template
     */
    private void executePuzzleLogic() {
        WorldPoint base1 = RoomSafespot.CRABS_BASE_1.getLocation(this.currentRoom);
        WorldPoint base2 = RoomSafespot.CRABS_BASE_2.getLocation(this.currentRoom);
        WorldPoint movable1 = RoomSafespot.CRABS_MOVABLE_1.getLocation(this.currentRoom);
        WorldPoint movable2 = RoomSafespot.CRABS_MOVABLE_2.getLocation(this.currentRoom);
        WorldPoint movable3 = RoomSafespot.CRABS_MOVABLE_3.getLocation(this.currentRoom);
        WorldPoint movable4 = RoomSafespot.CRABS_MOVABLE_4.getLocation(this.currentRoom);

        if (this.currentRoom.getTemplate() == RoomTemplate.TEMPLATE_WEST) {
            // West template: Red -&gt; Base1, Blue -&gt; Base2, Green -&gt; Movable1
            if (pushCrabToSlot("Red", base1, base2, movable1)) {
                return;
            }
            if (pushCrabToSlot("Blue", base1, base2, movable2)) {
                return;
            }
            if (pushCrabToSlot("Green", base1, base2, movable3)) {
                return;
            }
            if (pushCrabToSlot("Magenta", base1, base2, movable4)) {
                return;
            }
        }

        if (this.currentRoom.getTemplate() == RoomTemplate.TEMPLATE_EAST) {
            WorldPoint singleSlot = RoomSafespot.CRABS_SINGLE.getLocation(this.currentRoom);

            // Single slot puzzle - wait for crab to be positioned
            if (pushCrabToSlot("Red", singleSlot)) {
                if (this.localPlayer.isMoving()) {
                    return;
                }

                // Find crabs at the target location
                List&lt;WorldPoint&gt; pathToSingle = calculatePathToCrystalSlots(singleSlot);
                NPC crabAtLocation = NPCs.getNearest(singleSlot, npc -&gt;
                    pathToSingle.contains(npc.getWorldLocation()) &amp;&amp;
                    !npc.isMoving() &amp;&amp;
                    !npc.getWorldLocation().equals(singleSlot)
                );

                if (crabAtLocation != null) {
                    WorldPoint safePosition = singleSlot.createWorldArea(1)
                        .toWorldPointList()
                        .stream()
                        .filter(Reachable::isWalkable)
                        .max(Comparator.comparingDouble(point -&gt;
                            point.distanceToHypotenuse(singleSlot)
                        ))
                        .orElse(null);
                    Movement.setDestination(safePosition);
                }
                return;
            }

            if (pushCrabToSlot("Green", base1, base2, movable1)) {
                return;
            }
            if (pushCrabToSlot("Blue", base1, base2, movable2)) {
                return;
            }

            WorldPoint double1 = RoomSafespot.CRABS_DOUBLE_1.getLocation(this.currentRoom);
            WorldPoint double2 = RoomSafespot.CRABS_DOUBLE_2.getLocation(this.currentRoom);
            if (pushCrabToSlot("Magenta", double1, double2)) {
                return;
            }
        }
    }

    /**
     * Push a crab of specific color to designated crystal slots
     * @param color The color of the crab to push
     * @param targetSlots The crystal slots to push to
     * @return true if push action was taken
     */
    private boolean pushCrabToSlot(String color, WorldPoint... targetSlots) {
        // Find crystal object matching the color
        TileObject crystal = TileObjects.getNearest(obj -&gt;
            obj.getName() != null &amp;&amp;
            obj.getName().contains(color) &amp;&amp;
            obj.getName().contains(CRYSTAL_NAME)
        );

        if (crystal == null) {
            return false;
        }

        WorldPoint crystalCenter = crystal.getWorldArea().getCenter();
        List&lt;WorldPoint&gt; visitedPoints = new ArrayList&lt;&gt;();
        WorldPoint bouncePoint = new WorldPoint(0, 0, 0);

        for (int i = 0; i &lt; targetSlots.length; i++) {
            System.out.println("bounce: " + bouncePoint + " | crab: " + targetSlots[i]);

            WorldPoint startPoint = (i == 0) ? crystalCenter : bouncePoint;
            List&lt;WorldPoint&gt; pathSegment = calculatePathBetweenPoints(startPoint, targetSlots[i]);
            visitedPoints.addAll(pathSegment);
            bouncePoint = pathSegment.stream()
                .max(Comparator.comparingDouble(point -&gt;
                    point.distanceTo2DHypotenuse(crystalCenter)
                ))
                .get();
        }

        // Find crab at final target position
        WorldPoint finalTarget = targetSlots[targetSlots.length - 1];
        NPC targetCrab = NPCs.getNearest(finalTarget, npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(CRAB_NAME) &amp;&amp;
            npc.getInteracting() != null &amp;&amp;
            npc.getInteracting().equals(this.localPlayer) &amp;&amp;
            !isCrabAlreadyTracked(npc)
        );

        if (targetCrab == null) {
            attackUnattackedCrab();
            return true;
        }

        // Check if crab matches the required color
        if (!doesCrabMatchColor(color, targetCrab)) {
            System.out.println("couldnt find color: " + color);
            return false;
        }

        // Position and push the crab
        WorldPoint pushPosition = findPushPosition(finalTarget, targetCrab, visitedPoints);

        if (shouldPushCrab(finalTarget, targetCrab, pushPosition)) {
            useCrabWeapon(targetCrab);
            targetCrab.interact(ATTACK_ACTION);
            return true;
        }

        if (targetCrab.isMoving() &amp;&amp; targetCrab.distanceTo((Locatable) this.localPlayer) &lt; 5) {
            return true;
        }

        Movement.setDestination(pushPosition);
        return true;
    }

    /**
     * Calculate path between two points (horizontal or vertical line)
     * @param from Starting point
     * @param to Ending point
     * @return List of points along the path
     */
    private List&lt;WorldPoint&gt; calculatePathBetweenPoints(WorldPoint from, WorldPoint to) {
        List&lt;WorldPoint&gt; path = new ArrayList&lt;&gt;();

        if (from.getWorldX() == to.getWorldX()) {
            // Vertical path
            int distance = Math.abs(to.getWorldY() - from.getWorldY());
            if (to.getWorldY() &gt; from.getWorldY()) {
                path = new WorldArea(from, 1, distance).toWorldPointList();
            } else {
                path = new WorldArea(to, 1, distance).toWorldPointList();
            }
        }

        if (from.getWorldY() == to.getWorldY()) {
            // Horizontal path
            int distance = Math.abs(to.getWorldX() - from.getWorldX());
            if (to.getWorldX() &gt; from.getWorldX()) {
                path = new WorldArea(from, distance, 1).toWorldPointList();
            } else {
                path = new WorldArea(to, distance, 1).toWorldPointList();
            }
        }

        path.remove(to);
        return path;
    }

    /**
     * Calculate path from crystal to multiple target slots
     * @param targetSlots Array of target slot positions
     * @return List of all points along the paths
     */
    private List&lt;WorldPoint&gt; calculatePathToCrystalSlots(WorldPoint... targetSlots) {
        ArrayList&lt;WorldPoint&gt; allPaths = new ArrayList&lt;&gt;();

        TileObject crystal = TileObjects.getNearest(obj -&gt;
            obj.getName() != null &amp;&amp;
            obj.getName().contains(CRYSTAL_NAME)
        );

        if (crystal == null) {
            System.out.println("No crystal found!");
            return null;
        }

        WorldPoint crystalCenter = crystal.getWorldArea().getCenter();
        WorldPoint bouncePoint = new WorldPoint(0, 0, 0);

        for (int i = 0; i &lt; targetSlots.length; i++) {
            WorldPoint startPoint = (i == 0) ? crystalCenter : bouncePoint;
            List&lt;WorldPoint&gt; pathSegment = calculatePathBetweenPoints(startPoint, targetSlots[i]);
            allPaths.addAll(pathSegment);
            bouncePoint = pathSegment.stream()
                .max(Comparator.comparingDouble(point -&gt;
                    point.distanceTo2DHypotenuse(crystalCenter)
                ))
                .get();
        }

        return allPaths;
    }

    /**
     * Find the optimal position to push a crab to its target
     * @param target Target slot position
     * @param crab The crab NPC
     * @param excludedPoints Points to avoid
     * @return WorldPoint to stand at for pushing
     */
    private WorldPoint findPushPosition(WorldPoint target, NPC crab, List&lt;WorldPoint&gt; excludedPoints) {
        List&lt;WorldPoint&gt; adjacentPoints = target.createWorldArea(1).toWorldPointList();

        return adjacentPoints.stream()
            .filter(point -&gt;
                Reachable.isWalkable(point) &amp;&amp;
                !point.equals(target) &amp;&amp;
                !excludedPoints.contains(point)
            )
            .min(Comparator.comparingDouble(point -&gt;
                target.distanceTo2DHypotenuse(point)
            ).thenComparingDouble(point -&gt;
                -crab.distanceTo(point)
            ))
            .orElse(null);
    }

    /**
     * Check if we should push the crab (at correct position and distance)
     * @param target Target position
     * @param crab Crab NPC
     * @param pushPosition Position to push from
     * @return true if we should push now
     */
    private boolean shouldPushCrab(WorldPoint target, NPC crab, WorldPoint pushPosition, boolean immediateMode) {
        return immediateMode &amp;&amp;
               crab.getWorldLocation().equals(target) &amp;&amp;
               this.localPlayer.getWorldLocation().distanceTo2DHypotenuse(target) == 1.0f;
    }

    /**
     * Attack an unattacked crab to get its attention
     */
    private void attackUnattackedCrab() {
        NPC unattackedCrab = NPCs.getNearest(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(CRAB_NAME) &amp;&amp;
            !isCrabAlreadyTracked(npc)
        );

        resetCrabWeapon();

        if (unattackedCrab == null) {
            return;
        }

        if (unattackedCrab.getInteracting() != null) {
            return;
        }

        if (this.client.getTickCount() - this.lastInteractTick &lt; INTERACT_DELAY_TICKS) {
            return;
        }

        unattackedCrab.interact(ATTACK_ACTION);
        this.lastInteractTick = this.client.getTickCount();
    }

    /**
     * Check if a crab matches the required color
     * @param color Color name
     * @param crab Crab NPC
     * @return true if crab matches color
     */
    private boolean doesCrabMatchColor(String color, NPC crab) {
        switch (color) {
            case "Red":
                return crab.getName() != null &amp;&amp; crab.getName().contains("red");
            case "Blue":
                return crab.getName() != null &amp;&amp; crab.getName().contains("blue");
            case "Green":
                return crab.getName() != null &amp;&amp; crab.getName().contains("green");
            case "Magenta":
                return crab.getName() != null &amp;&amp; crab.getName().contains("magenta");
            default:
                System.out.println("couldnt find color: " + color);
                return false;
        }
    }

    /**
     * Check if crab is already being tracked
     * @param crab Crab NPC
     * @return true if already tracked
     */
    private boolean isCrabAlreadyTracked(NPC crab) {
        if (crab == null) {
            System.out.println("null crab");
            return true;
        }

        for (CrabTracker tracker : this.trackedCrabs) {
            if (tracker != null) {
                if (tracker.getNpc() == null) {
                    continue;
                }

                if (tracker.getNpc().equals(crab) ||
                    crab.getWorldLocation().equals(tracker.getNpc().getWorldLocation())) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Remove crabs that haven't been updated in a while
     * @return true if any stale crabs were found
     */
    private boolean removeStaleTrackedCrabs() {
        for (int i = 0; i &lt; this.trackedCrabs.size(); i++) {
            CrabTracker tracker = this.trackedCrabs.get(i);
            if (tracker != null) {
                if (tracker.getNpc() == null) {
                    continue;
                }

                int ticksSinceUpdate = this.client.getTickCount() - tracker.getSpawnTick();
                if (ticksSinceUpdate &gt; CRAB_STALE_THRESHOLD) {
                    this.trackedCrabs.clear();
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Ensure hammer is equipped for crabs puzzle
     * @return true if equipment change is needed
     */
    private boolean ensureHammerEquipped() {
        int[] hammerIds = {HAMMER_ITEM_ID};
        if (Inventory.contains(hammerIds)) {
            return true;
        }

        Item hammer = Inventory.getFirst(item -&gt;
            item.getName() != null &amp;&amp;
            item.getName().startsWith("Hammer")
        );

        Item equippedHammer = Equipment.getFirst(item -&gt;
            item.getName() != null &amp;&amp;
            item.getName().startsWith("Hammer")
        );

        if (hammer == null &amp;&amp; equippedHammer != null) {
            return true;
        }

        if (Inventory.isFull()) {
            this.coxManager.dropLowestValueItem();
            return false;
        }

        TileObject chest = TileObjects.getNearest(obj -&gt;
            obj.getName() != null &amp;&amp;
            obj.getName().contains(CHEST_NAME) &amp;&amp;
            obj.hasAction(SEARCH_ACTION)
        );

        if (chest == null) {
            return true;
        }

        chest.interact(TAKE_ACTION);
        return false;
    }

    /**
     * Equip the appropriate weapon for attacking a specific colored crab
     * @param crab The crab NPC
     */
    private void useCrabWeapon(NPC crab) {
        String crabName = crab.getName();
        if (crabName == null) {
            return;
        }

        if (crabName.contains("red")) {
            equipRedCrabWeapon();
        } else if (crabName.contains("blue")) {
            equipBlueCrabWeapon();
        } else if (crabName.contains("green")) {
            equipGreenCrabWeapon();
        } else if (crabName.contains("magenta")) {
            resetCrabWeapon();
        }
    }

    /**
     * Equip weapon for red crabs
     */
    private void equipRedCrabWeapon() {
        int weaponId = getRedCrabWeaponId();
        int[] weaponIds = {weaponId};

        if (!Equipment.contains(weaponIds)) {
            int[] capeIds = {weaponId};
            Item cape = Inventory.getFirst(capeIds);
            if (cape != null) {
                String[] actions = {WIELD_ACTION, WEAR_ACTION, EQUIP_ACTION};
                cape.interact(actions);
            }
        }

        int shieldId = getRedCrabShieldId();
        int[] shieldIds = {shieldId};

        if (Equipment.contains(shieldIds)) {
            return;
        }

        int[] inventoryShieldIds = {shieldId};
        Item shield = Inventory.getFirst(inventoryShieldIds);
        if (shield == null) {
            return;
        }

        boolean isTwoHanded = Static.getItemManager()
            .getItemStats(shieldId, false)
            .getEquipment()
            .isTwoHanded();

        if (Inventory.isFull() &amp;&amp; isTwoHanded) {
            this.coxManager.dropLowestValueItem();
            return;
        }

        String[] actions = {WIELD_ACTION, EQUIP_ACTION};
        shield.interact(actions);
    }

    /**
     * Equip weapon for blue crabs
     */
    private void equipBlueCrabWeapon() {
        int weaponId = getBlueCrabWeaponId();
        int[] weaponIds = {weaponId};

        if (Equipment.contains(weaponIds)) {
            return;
        }

        int[] inventoryWeaponIds = {weaponId};
        Item weapon = Inventory.getFirst(inventoryWeaponIds);
        if (weapon == null) {
            return;
        }

        String[] actions = {WIELD_ACTION, WEAR_ACTION, EQUIP_ACTION};
        weapon.interact(actions);
    }

    /**
     * Equip weapon for green crabs
     */
    private void equipGreenCrabWeapon() {
        int weaponId = getGreenCrabWeaponId();
        int[] weaponIds = {weaponId};

        if (Equipment.contains(weaponIds)) {
            return;
        }

        int[] inventoryWeaponIds = {weaponId};
        Item weapon = Inventory.getFirst(inventoryWeaponIds);
        if (weapon == null) {
            return;
        }

        String[] actions = {WIELD_ACTION, EQUIP_ACTION};
        weapon.interact(actions);
    }

    /**
     * Reset to default weapon (for magenta crabs)
     */
    private void resetCrabWeapon() {
        int weaponId = getDefaultWeaponId();
        int[] weaponIds = {weaponId};

        if (Equipment.contains(weaponIds)) {
            return;
        }

        int[] inventoryWeaponIds = {weaponId};
        Item weapon = Inventory.getFirst(inventoryWeaponIds);
        if (weapon == null) {
            return;
        }

        String[] actions = {WIELD_ACTION, EQUIP_ACTION};
        weapon.interact(actions);
    }

    /**
     * Get weapon ID for red crabs from equipment setup
     */
    private int getRedCrabShieldId() {
        EquipmentSetup setup = EquipmentManager.getRedCrabSetup();
        return setup.get(EquipmentInventorySlot.SHIELD);
    }

    /**
     * Get shield ID for red crabs from equipment setup
     */
    private int getRedCrabWeaponId() {
        EquipmentSetup setup = EquipmentManager.getRedCrabSetup();
        return setup.get(EquipmentInventorySlot.WEAPON);
    }

    /**
     * Get weapon ID for blue crabs from equipment setup
     */
    private int getBlueCrabWeaponId() {
        EquipmentSetup setup = EquipmentManager.getBlueCrabSetup();
        return setup.get(EquipmentInventorySlot.WEAPON);
    }

    /**
     * Get weapon ID for green crabs from equipment setup
     */
    private int getGreenCrabWeaponId() {
        EquipmentSetup setup = EquipmentManager.getGreenCrabSetup();
        return setup.get(EquipmentInventorySlot.WEAPON);
    }

    /**
     * Get default weapon ID
     */
    private int getDefaultWeaponId() {
        EquipmentSetup setup = EquipmentManager.getDefaultCrabSetup();
        return setup.get(EquipmentInventorySlot.WEAPON);
    }

    /**
     * Navigate to the next room via passage
     * @return true if navigation was successful
     */
    private boolean navigateToNextRoom() {
        if (Reachable.isWalkable(this.currentRoom.getExitLocation())) {
            if (Movement.getDestination() != null &amp;&amp;
                Movement.getDestination().equals(this.nextRoom.getExitLocation())) {
                return true;
            }
            Movement.setDestination(this.nextRoom.getEntryLocation());
            return false;
        }

        TileObject passage = findPassage();
        if (passage == null) {
            return true;
        }

        if (this.localPlayer.isMoving() || this.localPlayer.isAnimating()) {
            return true;
        }

        passage.interact(ENTER_ACTION);
        return false;
    }

    /**
     * Find the passage object to enter the next room
     * @return TileObject representing the passage, or null if not found
     */
    private TileObject findPassage() {
        return TileObjects.getNearest(obj -&gt;
            obj.getName() != null &amp;&amp;
            obj.getName().equals(PASSAGE_NAME) &amp;&amp;
            obj.hasAction(ENTER_ACTION) &amp;&amp;
            this.currentRoom.contains((Locatable) obj)
        );
    }

    /**
     * Listen for crab spawn/death graphics
     */
    @Subscribe
    private void onGraphicChanged(GraphicChanged event) {
        Actor actor = event.getActor();
        if (actor.getName() == null || !actor.getName().contains(CRAB_NAME)) {
            return;
        }

        if (actor.getGraphic() != CRAB_SPAWN_GRAPHIC) {
            return;
        }

        trackCrab((NPC) actor);
        System.out.println("Crab spawned/changed");
    }

    /**
     * Add a crab to the tracking list or update its spawn tick
     * @param crab The crab NPC to track
     */
    private void trackCrab(NPC crab) {
        // Check if crab is already tracked
        for (int i = 0; i &lt; this.trackedCrabs.size(); i++) {
            NPC trackedNpc = this.trackedCrabs.get(i).getNpc();
            if (trackedNpc != null &amp;&amp; trackedNpc == crab) {
                // Update spawn tick
                this.trackedCrabs.get(i).updateSpawnTick(this.client.getTickCount());
                System.out.println("Updated crab spawn tick");
                return;
            }
        }

        // Add new crab to tracking
        if (i &gt;= this.trackedCrabs.size()) {
            this.trackedCrabs.add(new CrabTracker(crab, this.client.getTickCount()));
            System.out.println("Added new crab to tracking");
        }
    }

    /**
     * Inner class to track individual crab state
     */
    private static class CrabTracker {
        private NPC npc;
        private int spawnTick;

        public CrabTracker(NPC npc, int spawnTick) {
            this.npc = npc;
            this.spawnTick = spawnTick;
        }

        public void updateSpawnTick(int tick) {
            this.spawnTick = tick;
        }

        public NPC getNpc() {
            return npc;
        }

        public int getSpawnTick() {
            return spawnTick;
        }

        public void setNpc(NPC npc) {
            this.npc = npc;
        }
    }
}
