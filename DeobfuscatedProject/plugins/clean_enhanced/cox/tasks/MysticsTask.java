/**
 * Mystics Task - Handles the Skeletal Mystics boss room in Chambers of Xeric
 *
 * Boss Mechanics:
 * - Three skeletal mages that use different combat styles (Melee/Range/Mage)
 * - Each mystic has unique attack animations and patterns
 * - Mystics can heal each other if grouped together
 * - Players should use Protect from Magic and attack from a safe distance
 *
 * Strategy:
 * - Position at safespot to avoid being surrounded
 * - Attack mystics one at a time, maintaining safe distance
 * - Use Protect from Magic prayer
 * - Keep mystics separated to prevent healing
 * - Use line of sight to control aggro
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.CollisionData;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Prayer;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unelite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name = "Mystics", priority = 10000, blocking = true, register = true)
public class MysticsTask extends CoxTaskBase {

    /** Current room information */
    private NHelper currentRoom;

    /** Next room information */
    private NHelper nextRoom;

    /** Current room index */
    private int roomIndex;

    /** List of tracked mystic NPCs */
    private List&lt;MysticTracker&gt; trackedMystics;

    /** Set to track mystic indices we've seen */
    private Set&lt;Integer&gt; seenMysticIndices;

    /** Flag for initial mage attack setup */
    private boolean needsInitialMageAttack;

    /** NPC name for mystics */
    private static final String MYSTIC_NAME = "Skeletal Mystic";

    /** Action for attacking */
    private static final String ATTACK_ACTION = "Attack";

    /** Passage name */
    private static final String PASSAGE_NAME = "Passage";

    /** Enter action */
    private static final String ENTER_ACTION = "Enter";

    /** Animation ID for mystic melee attack */
    private static final int ANIMATION_MYSTIC_MELEE = 7605;

    /** Animation ID for mystic range attack */
    private static final int ANIMATION_MYSTIC_RANGE = 7606;

    /** Collision flag for west wall */
    private static final int COLLISION_WEST = 0x80;

    /** Collision flag for east wall */
    private static final int COLLISION_EAST = 0x200;

    /** Collision flag for south wall */
    private static final int COLLISION_SOUTH = 0x400;

    /** Collision flag for north wall */
    private static final int COLLISION_NORTH = 0x1000;

    @Inject
    protected MysticsTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.seenMysticIndices = new HashSet&lt;&gt;();
        this.trackedMystics = new ArrayList&lt;&gt;();
        this.roomIndex = 0;
        this.needsInitialMageAttack = false;
    }

    @Override
    public EquipmentSetup getEquipmentSetup() {
        return null;
    }

    /**
     * Check if this task should be active
     * @return true if we're in the Mystics room
     */
    @Override
    public boolean shouldExecute() {
        this.currentRoom = this.coxManager.getCurrentRoom();
        this.roomIndex = this.coxManager.getRoomIndex();
        this.nextRoom = this.coxManager.getNextRoom();

        if (this.currentRoom.getRoomType() == RoomType.MYSTICS) {
            return true;
        }

        // Reset state when leaving room
        this.trackedMystics.clear();
        this.needsInitialMageAttack = false;
        return false;
    }

    /**
     * Get prayers to use during Mystics fight
     * @return List of prayers including Protect from Magic and offensive prayers
     */
    @Override
    public List&lt;Prayer&gt; getPrayersToActivate() {
        NPC mystic = NPCs.getNearest(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(MYSTIC_NAME) &amp;&amp;
            npc.hasAction(ATTACK_ACTION)
        );

        if (mystic == null) {
            return null;
        }

        ArrayList&lt;Prayer&gt; prayers = new ArrayList&lt;&gt;();
        List&lt;Prayer&gt; offensivePrayers = Prayers.getOffensive();
        Prayer protectMagic = Prayer.PROTECT_FROM_MAGIC;

        prayers.add(protectMagic);
        prayers.addAll(offensivePrayers);

        return prayers;
    }

    /**
     * Execute the main Mystics task logic
     * @return true if task executed successfully
     */
    @Override
    public boolean execute() {
        updateTrackedMystics();

        if (this.trackedMystics.isEmpty()) {
            return navigateToNextRoom();
        }

        if (this.needsInitialMageAttack) {
            System.out.println("Initial mage attack");
            NPC nearestMystic = NPCs.getNearest(npc -&gt;
                npc.getName() != null &amp;&amp;
                npc.getName().contains(MYSTIC_NAME)
            );

            if (nearestMystic == null) {
                return false;
            }

            // Wait if already attacking a mystic
            if (this.localPlayer.getInteracting() != null &amp;&amp;
                this.localPlayer.getInteracting().getName() != null &amp;&amp;
                this.localPlayer.getInteracting().getName().contains(MYSTIC_NAME)) {
                return true;
            }

            nearestMystic.interact(ATTACK_ACTION);
            return true;
        }

        // Find attackable mystic
        MysticTracker targetMystic = trackedMystics.stream()
            .filter(tracker -&gt; tracker.getNpc() != null &amp;&amp; !tracker.isDead())
            .min(Comparator.comparingInt(tracker -&gt;
                this.localPlayer.getWorldLocation().distanceToPath(
                    this.client,
                    tracker.getNpc().getWorldLocation()
                )
            ))
            .orElse(null);

        if (targetMystic == null) {
            System.out.println("No attackable mystic, moving to safespot");
            WorldPoint safespot = RoomSafespot.MYSTICS_SAFESPOT.getLocation(this.currentRoom);

            if (this.localPlayer.getWorldLocation().equals(safespot)) {
                // Wait at safespot until all mystics are positioned
                for (int i = 0; i &lt; this.trackedMystics.size(); i++) {
                    MysticTracker tracker = this.trackedMystics.get(i);
                    if (tracker.getNpc() != null &amp;&amp; tracker.getNpc().isMoving()) {
                        return true;
                    }
                }

                // Check if all mystics are in the room
                List&lt;NPC&gt; allMystics = NPCs.getAll(npc -&gt;
                    npc.getName() != null &amp;&amp;
                    npc.getName().contains(MYSTIC_NAME) &amp;&amp;
                    this.currentRoom.contains((Locatable) npc)
                );

                if (this.trackedMystics.size() == allMystics.size()) {
                    this.needsInitialMageAttack = true;
                }
                return true;
            }

            Movement.setDestination(safespot);
            return true;
        }

        // Find safe position to attack from
        List&lt;WorldPoint&gt; nearbyPoints = targetMystic.getNpc()
            .getWorldLocation()
            .createWorldArea(4)
            .toWorldPointList();

        WorldPoint attackPosition = nearbyPoints.stream()
            .filter(point -&gt;
                Reachable.isWalkable(point) &amp;&amp;
                point.distanceTo(targetMystic.getNpc().getWorldArea()) &gt;= 3 &amp;&amp;
                hasLineOfSight(this.client, targetMystic.getNpc().getWorldArea(), point.toWorldArea())
            )
            .min(Comparator.comparingInt(point -&gt;
                point.distanceTo((Locatable) this.localPlayer)
            ))
            .orElse(null);

        if (attackPosition == null) {
            System.out.println("No valid attack position found");
            return true;
        }

        Movement.setDestination(attackPosition);
        return true;
    }

    /**
     * Update the list of tracked mystics
     */
    private void updateTrackedMystics() {
        List&lt;NPC&gt; allMystics = NPCs.getAll(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(MYSTIC_NAME)
        );

        if (allMystics.isEmpty()) {
            navigateToNextRoom();
            return;
        }

        // Add new mystics to tracking list
        for (NPC mystic : allMystics) {
            if (mystic == null) {
                continue;
            }

            MysticTracker tracker = new MysticTracker(mystic);
            if (!this.trackedMystics.contains(tracker)) {
                this.trackedMystics.add(tracker);
                System.out.println("Adding more mystics | index: " + mystic.getIndex());
            }
        }

        // Remove dead mystics from tracking
        this.trackedMystics.removeIf(tracker -&gt; tracker.getNpc() == null);

        // Update mystic states based on their behavior
        for (MysticTracker tracker : this.trackedMystics) {
            if (tracker.isDead()) {
                continue;
            }

            Actor interacting = tracker.getNpc().getInteracting();
            if (tracker.getNpc().getWorldArea().distanceTo((Locatable) this.localPlayer) &lt;= 6 &amp;&amp;
                interacting != null &amp;&amp;
                interacting.equals(this.localPlayer) &amp;&amp;
                tracker.getNpc().isMoving()) {
                tracker.setAttackStyle(MysticAttackStyle.MELEE);
            }
        }
    }

    /**
     * Navigate to the next room via passage
     * @return true if navigation was successful
     */
    private boolean navigateToNextRoom() {
        if (Reachable.isWalkable(this.currentRoom.getExitLocation())) {
            if (Movement.getDestination() != null &amp;&amp;
                Movement.getDestination().equals(this.nextRoom.getExitLocation())) {
                return false;
            }
            Movement.setDestination(this.nextRoom.getEntryLocation());
            return true;
        }

        TileObject passage = findPassage();
        if (passage == null) {
            Movement.setDestination(this.currentRoom.getCenterLocation().dx(7).dy(7));
            return true;
        }

        if (this.localPlayer.isMoving() || this.localPlayer.isAnimating()) {
            return false;
        }

        passage.interact(ENTER_ACTION);
        return true;
    }

    /**
     * Find the passage object to enter the next room
     * @return TileObject representing the passage, or null if not found
     */
    private TileObject findPassage() {
        return TileObjects.getNearest(tileObject -&gt;
            tileObject.getName() != null &amp;&amp;
            tileObject.getName().equals(PASSAGE_NAME) &amp;&amp;
            tileObject.hasAction(ENTER_ACTION) &amp;&amp;
            this.currentRoom.contains((Locatable) tileObject)
        );
    }

    /**
     * Listen for mystic animation changes to track their attack patterns
     */
    @Subscribe(priority = 1.0f)
    private void onAnimationChanged(AnimationChanged event) {
        Actor actor = event.getActor();
        if (actor.getName() == null || !actor.getName().contains(MYSTIC_NAME)) {
            return;
        }

        int npcIndex = ((NPC) actor).getIndex();

        for (MysticTracker tracker : this.trackedMystics) {
            if (tracker.getNpc().getIndex() != npcIndex) {
                continue;
            }

            int animation = actor.getAnimation();

            // Detect melee attack
            if (animation == ANIMATION_MYSTIC_MELEE) {
                Player player = Players.getLocal();
                if (player != null) {
                    Actor playerTarget = player.getInteracting();
                    if (playerTarget != null &amp;&amp; playerTarget.equals(actor)) {
                        return;
                    }
                }
                tracker.setAttackStyle(MysticAttackStyle.MELEE);
            }

            // Detect range attack
            if (animation == ANIMATION_MYSTIC_RANGE) {
                tracker.setAttackStyle(MysticAttackStyle.RANGE);
            }

            System.out.println("Mystic animation detected");
        }
    }

    /**
     * Check if there is line of sight between two world areas
     * Uses simple distance check for nearby areas
     */
    private boolean hasLineOfSight(Client client, WorldArea from, WorldArea to) {
        List&lt;WorldPoint&gt; fromPoints = from.toWorldPointList();

        for (WorldPoint point : fromPoints) {
            if (hasLineOfSightBetweenPoints(client, point.toWorldArea(), to)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Check line of sight between two points using tile-based pathfinding
     */
    private boolean hasLineOfSightBetweenPoints(Client client, WorldArea from, WorldArea to) {
        int fromPlane = from.getPlane();
        int fromX = from.getX();
        int fromY = from.getY();
        int fromWidth = from.getWidth();
        int fromHeight = from.getHeight();

        if (fromPlane != to.getPlane()) {
            return false;
        }

        LocalPoint fromLocal = LocalPoint.fromWorld(client, fromX, fromY);
        LocalPoint toLocal = LocalPoint.fromWorld(client, to.getX(), to.getY());

        if (fromLocal == null || toLocal == null) {
            return false;
        }

        int fromSceneX = fromLocal.getSceneX();
        int fromSceneY = fromLocal.getSceneY();
        int toSceneX = toLocal.getSceneX();
        int toSceneY = toLocal.getSceneY();

        // Clamp target to source bounds
        int targetX;
        if (toSceneX &lt;= fromSceneX) {
            targetX = fromSceneX;
        } else if (toSceneX &gt;= fromSceneX + fromWidth - 1) {
            targetX = fromSceneX + fromWidth - 1;
        } else {
            targetX = toSceneX;
        }

        int targetY;
        if (toSceneY &lt;= fromSceneY) {
            targetY = fromSceneY;
        } else if (toSceneY &gt;= fromSceneY + fromHeight - 1) {
            targetY = fromSceneY + fromHeight - 1;
        } else {
            targetY = toSceneY;
        }

        int destX;
        if (fromSceneX &lt;= toSceneX) {
            destX = toSceneX;
        } else if (fromSceneX &gt;= toSceneX + to.getWidth() - 1) {
            destX = toSceneX + to.getWidth() - 1;
        } else {
            destX = fromSceneX;
        }

        int destY;
        if (fromSceneY &lt;= toSceneY) {
            destY = toSceneY;
        } else if (fromSceneY &gt;= toSceneY + to.getHeight() - 1) {
            destY = toSceneY + to.getHeight() - 1;
        } else {
            destY = fromSceneY;
        }

        Tile[][][] tiles = client.getScene().getTiles();
        Tile startTile = tiles[fromPlane][targetX][targetY];
        Tile endTile = tiles[to.getPlane()][destX][destY];

        if (startTile == null || endTile == null) {
            return false;
        }

        return checkTileLineOfSight(client, startTile, endTile);
    }

    /**
     * Check line of sight between two tiles using collision detection
     */
    private static boolean checkTileLineOfSight(Client client, Tile from, Tile to) {
        if (from.getPlane() != to.getPlane()) {
            return false;
        }

        CollisionData[] collisionMaps = client.getCollisionMaps();
        if (collisionMaps == null) {
            return false;
        }

        int plane = to.getPlane();
        int[][] flags = collisionMaps[plane].getFlags();

        Point fromPoint = from.getSceneLocation();
        Point toPoint = to.getSceneLocation();

        if (fromPoint.getX() == toPoint.getX() &amp;&amp; fromPoint.getY() == toPoint.getY()) {
            return true;
        }

        int deltaX = toPoint.getX() - fromPoint.getX();
        int deltaY = toPoint.getY() - fromPoint.getY();
        int absX = Math.abs(deltaX);
        int absY = Math.abs(deltaY);

        int flagX = 0;
        int flagY = 0;

        if (deltaX &lt; 0) {
            flagX |= COLLISION_WEST;
        } else {
            flagX |= COLLISION_EAST;
        }

        if (deltaY &lt; 0) {
            flagY |= COLLISION_SOUTH;
        } else {
            flagY |= COLLISION_NORTH;
        }

        // Check collision along the path
        if (absX &gt; absY) {
            int currentX = fromPoint.getX();
            int currentYFixed = fromPoint.getY() &lt;&lt; 7;
            int slopeY = (deltaY &lt;&lt; 7) / absX;
            currentYFixed += 64;

            if (deltaY &lt; 0) {
                --currentYFixed;
            }

            int stepX = deltaX &lt; 0 ? -1 : 1;

            while (currentX != toPoint.getX()) {
                int checkY = currentYFixed &gt;&gt;&gt; 7;
                currentX += stepX;

                if (flags[currentX][checkY] &amp; flagX != 0) {
                    return false;
                }

                currentYFixed += slopeY;
                int nextY = currentYFixed &gt;&gt;&gt; 7;

                if (nextY != checkY &amp;&amp; flags[currentX][nextY] &amp; flagY != 0) {
                    return false;
                }
            }
        } else {
            int currentY = fromPoint.getY();
            int currentXFixed = fromPoint.getX() &lt;&lt; 7;
            int slopeX = (deltaX &lt;&lt; 7) / absY;
            currentXFixed += 64;

            if (deltaX &lt; 0) {
                --currentXFixed;
            }

            int stepY = deltaY &lt; 0 ? -1 : 1;

            while (currentY != toPoint.getY()) {
                int checkX = currentXFixed &gt;&gt;&gt; 7;
                currentY += stepY;

                if (flags[checkX][currentY] &amp; flagY != 0) {
                    return false;
                }

                currentXFixed += slopeX;
                int nextX = currentXFixed &gt;&gt;&gt; 7;

                if (nextX != checkX &amp;&amp; flags[nextX][currentY] &amp; flagX != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Inner class to track individual mystic state
     */
    private static class MysticTracker {
        private NPC npc;
        private MysticAttackStyle attackStyle;

        public MysticTracker(NPC npc) {
            this.npc = npc;
            this.attackStyle = MysticAttackStyle.UNKNOWN;
        }

        public NPC getNpc() {
            return npc;
        }

        public void setAttackStyle(MysticAttackStyle style) {
            this.attackStyle = style;
        }

        public boolean isDead() {
            return npc == null || npc.isDead();
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof MysticTracker)) {
                return false;
            }
            MysticTracker other = (MysticTracker) obj;
            return this.npc != null &amp;&amp; other.npc != null &amp;&amp;
                   this.npc.getIndex() == other.npc.getIndex();
        }

        @Override
        public int hashCode() {
            return npc != null ? npc.getIndex() : 0;
        }
    }

    /**
     * Enum for mystic attack styles
     */
    private enum MysticAttackStyle {
        UNKNOWN,
        MELEE,
        RANGE,
        MAGE
    }
}
